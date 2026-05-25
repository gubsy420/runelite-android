package javax.sound.sampled;

public abstract class Control {
    public static class Type {
        private final String name;
        protected Type(String name) { this.name = name; }
        @Override public final boolean equals(Object o) { return super.equals(o); }
        @Override public final int hashCode() { return super.hashCode(); }
        @Override public final String toString() { return name; }
    }

    private final Type type;

    protected Control(Type type) {
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return String.valueOf(type);
    }
}
