package javax.swing;

import java.util.ArrayList;
import java.util.Vector;
import javax.swing.event.ListSelectionListener;

public class JList<E> extends JComponent {
    private static final long serialVersionUID = -1697842831055920921L;

    public static final int VERTICAL = 0;
    public static final int VERTICAL_WRAP = 1;
    public static final int HORIZONTAL_WRAP = 2;

    private ListModel<E> model = new DefaultListModel<>();
    private ListCellRenderer<? super E> renderer = new DefaultListCellRenderer();
    private int selectionMode = 0;
    private int selectedIndex = -1;
    private int layoutOrientation = VERTICAL;
    private int visibleRowCount = 8;
    private int fixedCellWidth = -1, fixedCellHeight = -1;

    public JList() {}
    public JList(ListModel<E> model) { this.model = model; }
    public JList(E[] listData) {
        DefaultListModel<E> m = new DefaultListModel<>();
        for (E e : listData) m.addElement(e);
        this.model = m;
    }
    public JList(Vector<? extends E> listData) {
        DefaultListModel<E> m = new DefaultListModel<>();
        for (E e : listData) m.addElement(e);
        this.model = m;
    }

    public ListModel<E> getModel() { return model; }
    public void setModel(ListModel<E> model) { this.model = model; }
    public void setListData(E[] listData) {
        DefaultListModel<E> m = new DefaultListModel<>();
        for (E e : listData) m.addElement(e);
        this.model = m;
    }
    public void setListData(Vector<? extends E> listData) {
        DefaultListModel<E> m = new DefaultListModel<>();
        for (E e : listData) m.addElement(e);
        this.model = m;
    }

    public ListCellRenderer<? super E> getCellRenderer() { return renderer; }
    public void setCellRenderer(ListCellRenderer<? super E> r) { this.renderer = r; }

    public int getSelectedIndex() { return selectedIndex; }
    public void setSelectedIndex(int index) {
        if (index == selectedIndex) return;
        int old = selectedIndex;
        selectedIndex = index;
        fireSelectionChanged(Math.min(old, index), Math.max(old, index));
    }
    public void setSelectedIndices(int[] indices) {
        // We track a single index — pick the first.
        setSelectedIndex(indices == null || indices.length == 0 ? -1 : indices[0]);
    }
    public int[] getSelectedIndices() { return selectedIndex < 0 ? new int[0] : new int[]{selectedIndex}; }
    public E getSelectedValue() { return selectedIndex < 0 ? null : model.getElementAt(selectedIndex); }
    public void setSelectedValue(Object o, boolean scroll) {
        if (model == null) return;
        for (int i = 0; i < model.getSize(); i++) {
            if (java.util.Objects.equals(model.getElementAt(i), o)) { setSelectedIndex(i); return; }
        }
        setSelectedIndex(-1);
    }
    public java.util.List<E> getSelectedValuesList() {
        ArrayList<E> r = new ArrayList<>();
        if (selectedIndex >= 0) r.add(model.getElementAt(selectedIndex));
        return r;
    }

    public int getSelectionMode() { return selectionMode; }
    public void setSelectionMode(int mode) { this.selectionMode = mode; }
    public int getLayoutOrientation() { return layoutOrientation; }
    public void setLayoutOrientation(int o) { this.layoutOrientation = o; }
    public int getVisibleRowCount() { return visibleRowCount; }
    public void setVisibleRowCount(int n) { this.visibleRowCount = n; }
    public int getFixedCellWidth() { return fixedCellWidth; }
    public void setFixedCellWidth(int w) { this.fixedCellWidth = w; }
    public int getFixedCellHeight() { return fixedCellHeight; }
    public void setFixedCellHeight(int h) { this.fixedCellHeight = h; }

    private final java.util.List<ListSelectionListener> selectionListeners = new java.util.ArrayList<>();
    public void addListSelectionListener(ListSelectionListener l) { if (l != null) selectionListeners.add(l); }
    public void removeListSelectionListener(ListSelectionListener l) { selectionListeners.remove(l); }
    public ListSelectionListener[] getListSelectionListeners() { return selectionListeners.toArray(new ListSelectionListener[0]); }

    private void fireSelectionChanged(int firstIndex, int lastIndex) {
        javax.swing.event.ListSelectionEvent ev = new javax.swing.event.ListSelectionEvent(
            this, Math.max(0, firstIndex), Math.max(0, lastIndex), false);
        for (ListSelectionListener l : new java.util.ArrayList<>(selectionListeners)) {
            try { l.valueChanged(ev); } catch (Throwable ignored) {}
        }
    }

    public void clearSelection() { setSelectedIndex(-1); }
    public void ensureIndexIsVisible(int index) {}
}
