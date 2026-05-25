package java.awt.event;

import java.awt.AWTEvent;
import java.awt.Component;
import java.awt.Container;

public class HierarchyEvent extends AWTEvent {
    private static final long serialVersionUID = -5337576970038043502L;

    public static final int HIERARCHY_FIRST = 1400;
    public static final int HIERARCHY_CHANGED = 1400;
    public static final int ANCESTOR_MOVED = 1401;
    public static final int ANCESTOR_RESIZED = 1402;
    public static final int HIERARCHY_LAST = 1402;

    public static final int PARENT_CHANGED = 0x1;
    public static final int DISPLAYABILITY_CHANGED = 0x2;
    public static final int SHOWING_CHANGED = 0x4;

    private final Component changed;
    private final Container changedParent;
    private final long changeFlags;

    public HierarchyEvent(Component source, int id, Component changed, Container changedParent) {
        this(source, id, changed, changedParent, 0);
    }

    public HierarchyEvent(Component source, int id, Component changed, Container changedParent, long changeFlags) {
        super(source, id);
        this.changed = changed;
        this.changedParent = changedParent;
        this.changeFlags = changeFlags;
    }

    public Component getComponent() {
        return (source instanceof Component) ? (Component) source : null;
    }

    public Component getChanged() {
        return changed;
    }

    public Container getChangedParent() {
        return changedParent;
    }

    public long getChangeFlags() {
        return changeFlags;
    }
}
