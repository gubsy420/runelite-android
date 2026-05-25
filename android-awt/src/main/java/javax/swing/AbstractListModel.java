package javax.swing;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.swing.event.ListDataListener;

public abstract class AbstractListModel<E> implements ListModel<E>, Serializable {
    private static final long serialVersionUID = -3285184064379168730L;
    protected final List<ListDataListener> listeners = new ArrayList<>();

    @Override public void addListDataListener(ListDataListener l) { if (l != null) listeners.add(l); }
    @Override public void removeListDataListener(ListDataListener l) { listeners.remove(l); }

    protected void fireContentsChanged(Object source, int index0, int index1) {}
    protected void fireIntervalAdded(Object source, int index0, int index1) {}
    protected void fireIntervalRemoved(Object source, int index0, int index1) {}
}
