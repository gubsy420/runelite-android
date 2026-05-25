package net.runelite.awt.impl;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Control;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.Line;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;

import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.AudioTrack;

import java.util.ArrayList;
import java.util.List;

/**
 * Adapts {@link SourceDataLine} (the javax.sound.sampled PCM-write API) onto
 * {@link AudioTrack}. A single shared AudioTrack is kept alive across line
 * close/open cycles: the obfuscated client closes and re-opens its line every
 * few seconds to grow its software buffer, and a release/allocate round-trip
 * per cycle was causing a ~50–100ms audio gap that read as music skipping.
 * When the requested format matches the shared track's format, open() is now
 * effectively free.
 */
public final class AndroidAudioBridge {
    private static final Object LOCK = new Object();
    private static AudioTrack sharedTrack;
    private static int sharedSampleRate;
    private static int sharedChannelMask;
    private static int sharedEncoding;
    private static int sharedBufferSize;

    private AndroidAudioBridge() {
    }

    public static SourceDataLine openSourceDataLine(AudioFormat format, int bufferSize) throws LineUnavailableException {
        if (format == null) {
            throw new LineUnavailableException("AudioFormat required");
        }
        AndroidSourceDataLine line = new AndroidSourceDataLine(format, bufferSize);
        line.allocate();
        return line;
    }

    private static AudioTrack acquireTrack(AudioFormat format, int requestedBuf) throws LineUnavailableException {
        int encoding = encodingFor(format);
        int channelMask = channelMaskFor(format.getChannels());
        int sampleRate = (int) format.getSampleRate();
        int minBufferSize = AudioTrack.getMinBufferSize(sampleRate, channelMask, encoding);
        int minBuf = minBufferSize > 0 ? minBufferSize : requestedBuf;

        synchronized (LOCK) {
            // Reuse the shared track whenever the FORMAT matches — ignore the client's
            // requested buffer size. The obfuscated client grows its buffer every cycle and
            // closes/reopens the line to apply the new size; honoring that here would force
            // a release+allocate per cycle, which is what was causing the audible skips.
            // We allocate generously up front (~1.5s of ring) so backpressure still works.
            if (sharedTrack != null
                && sharedSampleRate == sampleRate
                && sharedChannelMask == channelMask
                && sharedEncoding == encoding) {
                return sharedTrack;
            }

            if (sharedTrack != null) {
                try { sharedTrack.stop(); } catch (IllegalStateException ignored) {}
                sharedTrack.release();
                sharedTrack = null;
            }

            int internalBuf = Math.max(Math.max(requestedBuf * 4, minBuf * 4), 64 * 1024);
            try {
                sharedTrack = new AudioTrack.Builder()
                    .setAudioAttributes(new AudioAttributes.Builder()
                        .setUsage(AudioAttributes.USAGE_MEDIA)
                        .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
                        .build())
                    .setAudioFormat(new android.media.AudioFormat.Builder()
                        .setEncoding(encoding)
                        .setSampleRate(sampleRate)
                        .setChannelMask(channelMask)
                        .build())
                    .setBufferSizeInBytes(internalBuf)
                    .setTransferMode(AudioTrack.MODE_STREAM)
                    .build();
                sharedSampleRate = sampleRate;
                sharedChannelMask = channelMask;
                sharedEncoding = encoding;
                sharedBufferSize = internalBuf;
                return sharedTrack;
            } catch (Exception e) {
                throw new LineUnavailableException("AudioTrack init failed: " + e.getMessage());
            }
        }
    }

    private static final class AndroidSourceDataLine implements SourceDataLine {
        private final AudioFormat format;
        private final int bufferSize;
        private final List<LineListener> listeners = new ArrayList<>();
        private AudioTrack track;
        private boolean opened;
        private boolean running;
        private long framesWritten;

        AndroidSourceDataLine(AudioFormat format, int bufferSize) {
            this.format = format;
            this.bufferSize = Math.max(bufferSize, 4096);
        }

        void allocate() throws LineUnavailableException {
            track = acquireTrack(format, bufferSize);
        }

        @Override
        public void open() throws LineUnavailableException {
            if (opened) return;
            if (track == null) allocate();
            opened = true;
            fire(LineEvent.Type.OPEN);
        }

        @Override public void open(AudioFormat fmt) throws LineUnavailableException { open(); }
        @Override public void open(AudioFormat fmt, int bs) throws LineUnavailableException { open(); }

        @Override
        public int write(byte[] b, int off, int len) {
            if (!opened || track == null) return 0;
            int written = track.write(b, off, len);
            if (written > 0 && format.getFrameSize() > 0) {
                framesWritten += written / format.getFrameSize();
            }
            return Math.max(0, written);
        }

        @Override
        public void drain() {
            // No-op: the shared AudioTrack ring needs to keep its queue intact across
            // line close/reopen cycles, otherwise the client's continuous music stream
            // gets chopped every time it grows its software buffer.
        }

        @Override
        public void flush() {
            // No-op for the same reason as drain(). The obfuscated client calls flush()
            // every few seconds during normal playback; honoring it drops up to ~1.5s of
            // queued audio and produces the "skipping every 5-10s" symptom.
        }

        @Override
        public void start() {
            if (track != null && opened) {
                try { track.play(); } catch (IllegalStateException ignored) {}
                running = true;
                fire(LineEvent.Type.START);
            }
        }

        @Override
        public void stop() {
            if (track != null && running) {
                // Don't actually stop the shared track — pause keeps the buffer intact
                // so the next start() resumes seamlessly. The client only calls stop()
                // via close() anyway.
                try { track.pause(); } catch (IllegalStateException ignored) {}
                running = false;
                fire(LineEvent.Type.STOP);
            }
        }

        @Override public boolean isRunning() { return running; }
        @Override public boolean isActive() { return running; }
        @Override public AudioFormat getFormat() { return format; }
        @Override public int getBufferSize() { return bufferSize; }

        @Override
        public int available() {
            if (track == null) return 0;
            int writtenSinceStart = bufferSize;
            return writtenSinceStart;
        }

        @Override public int getFramePosition() { return (int) framesWritten; }
        @Override public long getLongFramePosition() { return framesWritten; }
        @Override public long getMicrosecondPosition() {
            if (format.getFrameRate() <= 0) return 0;
            return (long) (framesWritten * 1_000_000.0 / format.getFrameRate());
        }
        @Override public float getLevel() { return AudioSystem.NOT_SPECIFIED; }

        @Override public Line.Info getLineInfo() { return new DataLine.Info(SourceDataLine.class, format, bufferSize); }

        @Override
        public void close() {
            // Hand the shared AudioTrack back to the pool without stopping/releasing it.
            // The client closes its line every few seconds to reopen with a larger buffer;
            // keeping the track alive avoids the audible gap from release+allocate.
            track = null;
            if (opened) {
                opened = false;
                running = false;
                fire(LineEvent.Type.CLOSE);
            }
        }

        @Override public boolean isOpen() { return opened; }
        @Override public Control[] getControls() { return new Control[0]; }
        @Override public boolean isControlSupported(Control.Type control) { return false; }
        @Override public Control getControl(Control.Type control) {
            throw new IllegalArgumentException("Unsupported control: " + control);
        }
        @Override public void addLineListener(LineListener listener) { if (listener != null) listeners.add(listener); }
        @Override public void removeLineListener(LineListener listener) { listeners.remove(listener); }

        private void fire(LineEvent.Type type) {
            if (listeners.isEmpty()) return;
            LineEvent ev = new LineEvent(this, type, framesWritten);
            for (LineListener l : new ArrayList<>(listeners)) {
                l.update(ev);
            }
        }
    }

    private static int encodingFor(AudioFormat fmt) throws LineUnavailableException {
        int bits = fmt.getSampleSizeInBits();
        if (fmt.getEncoding() == AudioFormat.Encoding.PCM_FLOAT) return android.media.AudioFormat.ENCODING_PCM_FLOAT;
        switch (bits) {
            case 8: return android.media.AudioFormat.ENCODING_PCM_8BIT;
            case 16: return android.media.AudioFormat.ENCODING_PCM_16BIT;
            case 24:
                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.S) {
                    return android.media.AudioFormat.ENCODING_PCM_24BIT_PACKED;
                }
                throw new LineUnavailableException("24-bit PCM requires API 31+");
            case 32:
                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.S) {
                    return android.media.AudioFormat.ENCODING_PCM_32BIT;
                }
                throw new LineUnavailableException("32-bit PCM requires API 31+");
            default: throw new LineUnavailableException("Unsupported sample size: " + bits);
        }
    }

    private static int channelMaskFor(int channels) {
        switch (channels) {
            case 1: return android.media.AudioFormat.CHANNEL_OUT_MONO;
            case 2: return android.media.AudioFormat.CHANNEL_OUT_STEREO;
            default: return AudioManager.STREAM_MUSIC;
        }
    }
}
