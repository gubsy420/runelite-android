package javax.swing.event;

import java.util.EventListener;

public interface AncestorListener extends EventListener {
    void ancestorAdded(AncestorEvent event);
    void ancestorRemoved(AncestorEvent event);
    void ancestorMoved(AncestorEvent event);
}
