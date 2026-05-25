package java.awt;

import java.util.EventObject;

public abstract class AWTEvent extends EventObject {
    private static final long serialVersionUID = -1825314779160409405L;

    public static final long COMPONENT_EVENT_MASK = 0x01;
    public static final long CONTAINER_EVENT_MASK = 0x02;
    public static final long FOCUS_EVENT_MASK     = 0x04;
    public static final long KEY_EVENT_MASK       = 0x08;
    public static final long MOUSE_EVENT_MASK     = 0x10;
    public static final long MOUSE_MOTION_EVENT_MASK = 0x20;
    public static final long WINDOW_EVENT_MASK    = 0x40;
    public static final long ACTION_EVENT_MASK    = 0x80;
    public static final long ADJUSTMENT_EVENT_MASK = 0x100;
    public static final long ITEM_EVENT_MASK      = 0x200;
    public static final long TEXT_EVENT_MASK      = 0x400;
    public static final long INPUT_METHOD_EVENT_MASK = 0x800;
    public static final long PAINT_EVENT_MASK     = 0x2000;
    public static final long INVOCATION_EVENT_MASK = 0x4000;
    public static final long HIERARCHY_EVENT_MASK = 0x8000;
    public static final long HIERARCHY_BOUNDS_EVENT_MASK = 0x10000;
    public static final long MOUSE_WHEEL_EVENT_MASK = 0x20000;
    public static final long WINDOW_STATE_EVENT_MASK = 0x40000;
    public static final long WINDOW_FOCUS_EVENT_MASK = 0x80000;

    public static final int RESERVED_ID_MAX = 1999;

    protected int id;
    protected boolean consumed;

    public AWTEvent(Object source, int id) {
        super(source);
        this.id = id;
    }

    public int getID() {
        return id;
    }

    public String paramString() {
        return "";
    }

    @Override
    public String toString() {
        String name = (source != null) ? source.getClass().getName() : "null";
        return getClass().getName() + "[" + paramString() + "] on " + name;
    }

    protected void consume() {
        consumed = true;
    }

    protected boolean isConsumed() {
        return consumed;
    }
}
