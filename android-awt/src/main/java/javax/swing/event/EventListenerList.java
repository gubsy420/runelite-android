package javax.swing.event;

import java.io.Serializable;
import java.util.EventListener;

public class EventListenerList implements Serializable {
    private static final long serialVersionUID = 1L;
    protected transient Object[] listenerList = new Object[0];

    public Object[] getListenerList() { return listenerList; }

    public <T extends EventListener> T[] getListeners(Class<T> t) {
        @SuppressWarnings("unchecked")
        T[] arr = (T[]) java.lang.reflect.Array.newInstance(t, 0);
        return arr;
    }

    public int getListenerCount() { return 0; }
    public int getListenerCount(Class<?> t) { return 0; }

    public synchronized <T extends EventListener> void add(Class<T> t, T l) {}
    public synchronized <T extends EventListener> void remove(Class<T> t, T l) {}
}
