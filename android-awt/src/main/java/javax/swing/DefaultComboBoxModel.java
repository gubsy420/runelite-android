package javax.swing;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class DefaultComboBoxModel<E> extends AbstractListModel<E> implements MutableComboBoxModel<E> {
    private static final long serialVersionUID = 1L;
    private final List<E> elements;
    private Object selectedItem;

    public DefaultComboBoxModel() { elements = new ArrayList<>(); }
    public DefaultComboBoxModel(E[] items) { elements = new ArrayList<>(); for (E e : items) elements.add(e); }
    public DefaultComboBoxModel(Vector<E> items) { elements = new ArrayList<>(items); }

    @Override public int getSize() { return elements.size(); }
    @Override public E getElementAt(int index) { return elements.get(index); }
    @Override public Object getSelectedItem() { return selectedItem; }
    @Override public void setSelectedItem(Object anItem) { this.selectedItem = anItem; }
    @Override public void addElement(E item) { elements.add(item); }
    @Override public void removeElement(Object obj) { elements.remove(obj); }
    @Override public void insertElementAt(E item, int index) { elements.add(index, item); }
    @Override public void removeElementAt(int index) { elements.remove(index); }
    public void removeAllElements() { elements.clear(); }
    public int getIndexOf(Object anObject) { return elements.indexOf(anObject); }
}
