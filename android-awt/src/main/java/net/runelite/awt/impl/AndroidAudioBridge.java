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
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Adapts {@link SourceDataLine} (the javax.sound.sampled PCM-write API) onto a single
 * process-wide {@link AudioTrack} fed by a dedicated drain thread. Goals:
 *  - Game-thread {@code write()} never blocks on AudioTrack — it just copies into a
 *    shared bounded ring queue and returns.
 *  - The drain thread blocks on {@code AudioTrack.write(WRITE_BLOCKING)} so the
 *    track buffer naturally paces consumption at the audio hardware rate, keeping
 *    music and the game's own audio-tick scheduling in sync.
 *  - The shared track is never released and never paused; line close/reopen cycles
 *    (which the obfuscated client does every few seconds to grow its software buffer)
 *    are bookkeeping-only. Releasing it raced with the drain thread and segfaulted in
 *    {@code AudioTrack::releaseBuffer}; pausing it would deadlock the drain.
 */
public final class AndroidAudioBridge {
    /** Soft ceiling on queued-but-not-yet-played PCM bytes. The OSRS client streams
     *  22050 Hz mono 16-bit (44 100 bytes/sec), so 32 KB ≈ 740 ms — past that the
     *  enqueue path drops oldest chunks to clamp end-to-end latency. The previous
     *  192 KB allowed ~4.3 s of audio to pile up, which is what users perceive as
     *  the "delay between action and sound" lag. */
    private static final int QUEUE_CAP_BYTES = 32 * 1024;

    private static final Object TRACK_LOCK = new Object();
    private static AudioTrack sharedTrack;
    private static int sharedSampleRate, sharedChannelMask, sharedEncoding;

    private static final LinkedBlockingDeque<byte[]> sharedQueue = new LinkedBlockingDeque<>();
    private static final AtomicInteger queuedBytes = new AtomicInteger();
    private static volatile boolean drainerStarted = false;

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

        synchronized (TRACK_LOCK) {
            if (sharedTrack != null
                && sharedSampleRate == sampleRate
                && sharedChannelMask == channelMask
                && sharedEncoding == encoding) {
                return sharedTrack;
            }

            // Format actually changed (rare — usually first call only). Release any
            // existing track only after the drainer has been told to stop touching it.
            if (sharedTrack != null) {
                // Empty the queue so the drainer doesn't push stale data to the new track.
                sharedQueue.clear();
                queuedBytes.set(0);
                AudioTrack old = sharedTrack;
                sharedTrack = null;
                try { old.stop(); } catch (IllegalStateException ignored) {}
                old.release();
            }

            // Use the smallest buffer that won't underrun. minBufferSize is the floor
            // the audio HAL needs to keep the hardware fed; 2× gives us a glitch
            // margin for jittery drains. Was max(reqBuf*4, minBuf*4, 64KB) which on
            // OSRS's 22050 Hz mono produced ≥ 1.5 s of in-flight audio at the HAL
            // alone — the dominant component of the 3-4 s perceived latency.
            int internalBuf = Math.max(minBuf * 2, 8 * 1024);
            try {
                AudioTrack.Builder b = new AudioTrack.Builder()
                    .setAudioAttributes(new AudioAttributes.Builder()
                        .setUsage(AudioAttributes.USAGE_GAME)
                        .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                        .build())
                    .setAudioFormat(new android.media.AudioFormat.Builder()
                        .setEncoding(encoding)
                        .setSampleRate(sampleRate)
                        .setChannelMask(channelMask)
                        .build())
                    .setBufferSizeInBytes(internalBuf)
                    .setTransferMode(AudioTrack.MODE_STREAM);
                // PERFORMANCE_MODE_LOW_LATENCY (API 26+) asks the HAL to route through
                // its fast-mixer path. The driver may refuse and silently fall back to
                // NONE, which is fine — we still benefit from the smaller buffer.
                try { b.setPerformanceMode(AudioTrack.PERFORMANCE_MODE_LOW_LATENCY); }
                catch (Throwable ignored) {}
                AudioTrack t = b.build();
                try { t.play(); } catch (IllegalStateException ignored) {}
                sharedTrack = t;
                sharedSampleRate = sampleRate;
                sharedChannelMask = channelMask;
                sharedEncoding = encoding;
                startDrainerOnce();
                return t;
            } catch (Exception e) {
                throw new LineUnavailableException("AudioTrack init failed: " + e.getMessage());
            }
        }
    }

    /** Dedicated audio drain thread, started once per process. It blocks on
     *  {@code AudioTrack.write(WRITE_BLOCKING)} so the hardware buffer paces it
     *  naturally; the game thread that produced these bytes already returned. */
    private static void startDrainerOnce() {
        if (drainerStarted) return;
        drainerStarted = true;
        Thread t = new Thread(AndroidAudioBridge::drainLoop, "RL-Audio-Drain");
        t.setDaemon(true);
        t.start();
    }

    private static void drainLoop() {
        while (true) {
            byte[] chunk;
            try { chunk = sharedQueue.takeFirst(); }
            catch (InterruptedException ie) { return; }
            if (chunk == null || chunk.length == 0) continue;
            queuedBytes.addAndGet(-chunk.length);

            AudioTrack t;
            synchronized (TRACK_LOCK) { t = sharedTrack; }
            if (t == null) continue;

            int written = 0;
            while (written < chunk.length) {
                int n;
                try {
                    n = t.write(chunk, written, chunk.length - written, AudioTrack.WRITE_BLOCKING);
                } catch (IllegalStateException ignored) {
                    break;
                }
                if (n < 0) break;     // ERROR_INVALID_OPERATION etc.
                if (n == 0) {
                    // Track is paused/stopped — back off so we don't spin.
                    try { Thread.sleep(5); } catch (InterruptedException ie) { return; }
                    continue;
                }
                written += n;
                // If the track was swapped underneath us mid-chunk, abandon this
                // chunk on the new track (we'd otherwise interleave stale samples).
                synchronized (TRACK_LOCK) { if (sharedTrack != t) break; }
            }
        }
    }

    /** Enqueue PCM bytes from the game thread. Never blocks: if the queue is
     *  already past its soft cap (drain is falling behind / track underflowed),
     *  drop the OLDEST chunks rather than stall the producer. Brief audio glitch
     *  beats freezing the game. */
    private static int enqueue(byte[] b, int off, int len) {
        if (len <= 0) return 0;
        while (queuedBytes.get() + len > QUEUE_CAP_BYTES) {
            byte[] dropped = sharedQueue.pollFirst();
            if (dropped == null) break;
            queuedBytes.addAndGet(-dropped.length);
        }
        byte[] copy = new byte[len];
        System.arraycopy(b, off, copy, 0, len);
        sharedQueue.offerLast(copy);
        queuedBytes.addAndGet(len);
        return len;
    }

    private static final class AndroidSourceDataLine implements SourceDataLine {
        private final AudioFormat format;
        private final int bufferSize;
        private final List<LineListener> listeners = new ArrayList<>();
        private AudioTrack track;          // shared reference, never released by us
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
            if (!opened) return 0;
            int written = enqueue(b, off, len);
            if (written > 0 && format.getFrameSize() > 0) {
                framesWritten += written / format.getFrameSize();
            }
            return written;
        }

        @Override
        public void drain() {
            // No-op: the shared AudioTrack ring needs to keep its queue intact across
            // line close/reopen cycles, otherwise the client's continuous music stream
            // gets chopped every time it grows its software buffer.
        }

        @Override
        public void flush() {
            // No-op for the same reason as drain().
        }

        @Override
        public void start() {
            if (track != null && opened) {
                // The shared track is always playing; this just flips our running flag.
                running = true;
                fire(LineEvent.Type.START);
            }
        }

        @Override
        public void stop() {
            if (track != null && running) {
                // DON'T pause the shared track — pausing it would deadlock the drainer
                // thread, since it waits on AudioTrack.write which only returns once
                // the hardware buffer drains, and a paused track never drains.
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
            // Bytes the producer can write before backpressure kicks in. Approximate via
            // our queue cap minus current depth so the client's "should I produce more
            // audio yet?" check responds to backpressure.
            int remaining = QUEUE_CAP_BYTES - queuedBytes.get();
            return Math.max(0, remaining);
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
            // Bookkeeping only — the shared AudioTrack and drainer stay alive across
            // line cycles so music doesn't gap when the client grows its buffer.
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
