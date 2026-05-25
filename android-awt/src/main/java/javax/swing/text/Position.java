package javax.swing.text;

public interface Position {
    int getOffset();

    final class Bias {
        public static final Bias Forward = new Bias("Forward");
        public static final Bias Backward = new Bias("Backward");
        private final String name;
        private Bias(String name) { this.name = name; }
        @Override public String toString() { return name; }
    }
}
