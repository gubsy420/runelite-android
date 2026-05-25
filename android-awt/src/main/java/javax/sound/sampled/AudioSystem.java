package javax.sound.sampled;

import net.runelite.awt.impl.AndroidAudioBridge;

public final class AudioSystem {
    public static final int NOT_SPECIFIED = -1;

    private AudioSystem() {
    }

    public static Line getLine(Line.Info info) throws LineUnavailableException {
        if (info instanceof DataLine.Info) {
            DataLine.Info dli = (DataLine.Info) info;
            if (SourceDataLine.class.isAssignableFrom(info.getLineClass())) {
                AudioFormat[] formats = dli.getFormats();
                AudioFormat format = formats.length > 0 ? formats[0] : null;
                int bufferSize = dli.getMaxBufferSize() > 0 ? dli.getMaxBufferSize() : 4096;
                return AndroidAudioBridge.openSourceDataLine(format, bufferSize);
            }
        }
        throw new LineUnavailableException("Unsupported line type: " + info);
    }

    public static Mixer.Info[] getMixerInfo() {
        return new Mixer.Info[0];
    }

    public static boolean isLineSupported(Line.Info info) {
        return info instanceof DataLine.Info
            && SourceDataLine.class.isAssignableFrom(info.getLineClass());
    }
}
