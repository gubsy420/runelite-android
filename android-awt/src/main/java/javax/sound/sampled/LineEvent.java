package javax.sound.sampled;

import java.util.EventObject;

public class LineEvent extends EventObject {
    private static final long serialVersionUID = -1274246333366502301L;

    public static class Type {
        public static final Type OPEN = new Type("Open");
        public static final Type CLOSE = new Type("Close");
        public static final Type START = new Type("Start");
        public static final Type STOP = new Type("Stop");

        private final String name;
        protected Type(String name) { this.name = name; }
        @Override public final boolean equals(Object o) { return super.equals(o); }
        @Override public final int hashCode() { return super.hashCode(); }
        @Override public final String toString() { return name; }
    }

    private final Type type;
    private final long framePosition;

    public LineEvent(Line source, Type type, long position) {
        super(source);
        this.type = type;
        this.framePosition = position;
    }

    public Type getType() { return type; }
    public long getFramePosition() { return framePosition; }
    public Line getLine() { return (Line) source; }
}
