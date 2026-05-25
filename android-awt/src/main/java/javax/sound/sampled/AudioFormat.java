package javax.sound.sampled;

public class AudioFormat {
    public static class Encoding {
        public static final Encoding PCM_SIGNED = new Encoding("PCM_SIGNED");
        public static final Encoding PCM_UNSIGNED = new Encoding("PCM_UNSIGNED");
        public static final Encoding PCM_FLOAT = new Encoding("PCM_FLOAT");

        private final String name;

        public Encoding(String name) {
            this.name = name;
        }

        public final String toString() {
            return name;
        }

        @Override
        public final boolean equals(Object obj) {
            return obj instanceof Encoding && name.equals(((Encoding) obj).name);
        }

        @Override
        public final int hashCode() {
            return name.hashCode();
        }
    }

    private final Encoding encoding;
    private final float sampleRate;
    private final int sampleSizeInBits;
    private final int channels;
    private final int frameSize;
    private final float frameRate;
    private final boolean bigEndian;

    public AudioFormat(float sampleRate, int sampleSizeInBits, int channels, boolean signed, boolean bigEndian) {
        this(signed ? Encoding.PCM_SIGNED : Encoding.PCM_UNSIGNED, sampleRate, sampleSizeInBits, channels,
            channels == AudioSystem.NOT_SPECIFIED || sampleSizeInBits == AudioSystem.NOT_SPECIFIED
                ? AudioSystem.NOT_SPECIFIED
                : ((sampleSizeInBits + 7) / 8) * channels,
            sampleRate, bigEndian);
    }

    public AudioFormat(Encoding encoding, float sampleRate, int sampleSizeInBits, int channels,
                        int frameSize, float frameRate, boolean bigEndian) {
        this.encoding = encoding;
        this.sampleRate = sampleRate;
        this.sampleSizeInBits = sampleSizeInBits;
        this.channels = channels;
        this.frameSize = frameSize;
        this.frameRate = frameRate;
        this.bigEndian = bigEndian;
    }

    public Encoding getEncoding()    { return encoding; }
    public float getSampleRate()     { return sampleRate; }
    public int getSampleSizeInBits() { return sampleSizeInBits; }
    public int getChannels()         { return channels; }
    public int getFrameSize()        { return frameSize; }
    public float getFrameRate()      { return frameRate; }
    public boolean isBigEndian()     { return bigEndian; }

    public boolean matches(AudioFormat other) {
        return encoding.equals(other.encoding)
            && (sampleRate == AudioSystem.NOT_SPECIFIED || other.sampleRate == AudioSystem.NOT_SPECIFIED || sampleRate == other.sampleRate)
            && (sampleSizeInBits == AudioSystem.NOT_SPECIFIED || other.sampleSizeInBits == AudioSystem.NOT_SPECIFIED || sampleSizeInBits == other.sampleSizeInBits)
            && (channels == AudioSystem.NOT_SPECIFIED || other.channels == AudioSystem.NOT_SPECIFIED || channels == other.channels)
            && (sampleSizeInBits <= 8 || bigEndian == other.bigEndian);
    }

    @Override
    public String toString() {
        return encoding + " " + sampleRate + " Hz, " + sampleSizeInBits + " bit, " + channels + " channels, " + (bigEndian ? "big-endian" : "little-endian");
    }
}
