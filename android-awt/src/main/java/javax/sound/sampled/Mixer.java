package javax.sound.sampled;

public interface Mixer extends Line {
    Mixer.Info getMixerInfo();
    Line.Info[] getSourceLineInfo();
    Line.Info[] getTargetLineInfo();
    Line.Info[] getSourceLineInfo(Line.Info info);
    Line.Info[] getTargetLineInfo(Line.Info info);
    boolean isLineSupported(Line.Info info);
    Line getLine(Line.Info info) throws LineUnavailableException;

    class Info {
        private final String name;
        private final String vendor;
        private final String description;
        private final String version;

        protected Info(String name, String vendor, String description, String version) {
            this.name = name;
            this.vendor = vendor;
            this.description = description;
            this.version = version;
        }

        public final String getName()        { return name; }
        public final String getVendor()      { return vendor; }
        public final String getDescription() { return description; }
        public final String getVersion()     { return version; }

        @Override
        public final String toString() {
            return name + ", version " + version;
        }
    }
}
