package javax.sound.sampled;

public interface Line extends AutoCloseable {
    Line.Info getLineInfo();

    void open() throws LineUnavailableException;
    @Override
    void close();

    boolean isOpen();
    Control[] getControls();
    boolean isControlSupported(Control.Type control);
    Control getControl(Control.Type control);
    void addLineListener(LineListener listener);
    void removeLineListener(LineListener listener);

    class Info {
        private final Class<?> lineClass;

        public Info(Class<?> lineClass) {
            this.lineClass = lineClass;
        }

        public Class<?> getLineClass() {
            return lineClass;
        }

        public boolean matches(Info info) {
            return lineClass != null && info != null && lineClass.isAssignableFrom(info.lineClass);
        }

        @Override
        public String toString() {
            return lineClass.getSimpleName();
        }
    }
}
