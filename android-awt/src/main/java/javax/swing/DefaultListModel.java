package javax.swing;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class DefaultListModel<E> extends AbstractListModel<E> {
    private static final long serialVersionUID = 1L;
    private final List<E> delegate = new ArrayList<>();

    public int getSize() { return delegate.size(); }
    public E getElementAt(int index) { return delegate.get(index); }

    public void addElement(E element) { delegate.add(element); }
    public void clear() { delegate.clear(); }
    public boolean contains(Object elem) { return delegate.contains(elem); }
    public void copyInto(Object[] anArray) {
        for (int i = 0; i < delegate.size(); i++) anArray[i] = delegate.get(i);
    }
    public E elementAt(int index) { return delegate.get(index); }
    public Enumeration<E> elements() {
        return new Vector<E>(delegate).elements();
    }
    public E firstElement() { return delegate.get(0); }
    public E lastElement() { return delegate.get(delegate.size() - 1); }
    public int indexOf(Object elem) { return delegate.indexOf(elem); }
    public int indexOf(Object elem, int index) {
        for (int i = index; i < delegate.size(); i++)
            if (java.util.Objects.equals(elem, delegate.get(i))) return i;
        return -1;
    }
    public void insertElementAt(E element, int index) { delegate.add(index, element); }
    public boolean isEmpty() { return delegate.isEmpty(); }
    public void removeAllElements() { delegate.clear(); }
    public boolean removeElement(Object elem) { return delegate.remove(elem); }
    public void removeElementAt(int index) { delegate.remove(index); }
    public E remove(int index) { return delegate.remove(index); }
    public void add(int index, E element) { delegate.add(index, element); }
    public void addAll(Collection<? extends E> c) { delegate.addAll(c); }
    public void addAll(int index, Collection<? extends E> c) { delegate.addAll(index, c); }
    public E set(int index, E element) { return delegate.set(index, element); }
    public E get(int index) { return delegate.get(index); }
    public int size() { return delegate.size(); }
    public boolean isEmpty(int dummy) { return delegate.isEmpty(); }
    public void setSize(int newSize) {
        while (delegate.size() < newSize) delegate.add(null);
        while (delegate.size() > newSize) delegate.remove(delegate.size() - 1);
    }
    public Object[] toArray() { return delegate.toArray(); }
    public List<E> getDelegate() { return delegate; }
}
