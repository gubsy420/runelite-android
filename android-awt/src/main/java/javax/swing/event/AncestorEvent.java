package javax.swing.event;

import java.awt.AWTEvent;
import java.awt.Container;
import javax.swing.JComponent;

public class AncestorEvent extends AWTEvent {
    private static final long serialVersionUID = -8843046538946011569L;
    public static final int ANCESTOR_ADDED = 1;
    public static final int ANCESTOR_REMOVED = 2;
    public static final int ANCESTOR_MOVED = 3;

    private final Container ancestor;
    private final Container ancestorParent;

    public AncestorEvent(JComponent source, int id, Container ancestor, Container ancestorParent) {
        super(source, id);
        this.ancestor = ancestor;
        this.ancestorParent = ancestorParent;
    }

    public Container getAncestor() { return ancestor; }
    public Container getAncestorParent() { return ancestorParent; }
    public JComponent getComponent() { return (JComponent) source; }
}
