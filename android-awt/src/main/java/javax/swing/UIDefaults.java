package javax.swing;

import java.awt.Color;
import java.awt.Font;
import java.beans.PropertyChangeListener;
import java.util.Hashtable;
import java.util.Locale;
import javax.swing.border.Border;
import javax.swing.plaf.ComponentUI;

public class UIDefaults extends Hashtable<Object, Object> {
    private static final long serialVersionUID = 1L;

    public interface LazyValue { Object createValue(UIDefaults table); }
    public interface ActiveValue { Object createValue(UIDefaults table); }

    public UIDefaults() {}
    public UIDefaults(int initialCapacity, float loadFactor) { super(initialCapacity, loadFactor); }
    public UIDefaults(Object[] keyValueList) { for (int i = 0; i + 1 < keyValueList.length; i += 2) put(keyValueList[i], keyValueList[i + 1]); }

    public Color getColor(Object key) { Object v = get(key); return v instanceof Color ? (Color) v : null; }
    public Font getFont(Object key) { Object v = get(key); return v instanceof Font ? (Font) v : null; }
    public Border getBorder(Object key) { Object v = get(key); return v instanceof Border ? (Border) v : null; }
    public Icon getIcon(Object key) { Object v = get(key); return v instanceof Icon ? (Icon) v : null; }
    public int getInt(Object key) { Object v = get(key); return v instanceof Integer ? (Integer) v : 0; }
    public boolean getBoolean(Object key) { Object v = get(key); return v instanceof Boolean && (Boolean) v; }
    public String getString(Object key) { Object v = get(key); return v == null ? null : v.toString(); }

    public Object get(Object key, Locale l) { return get(key); }
    public Color getColor(Object key, Locale l) { return getColor(key); }
    public Font getFont(Object key, Locale l) { return getFont(key); }

    public void addPropertyChangeListener(PropertyChangeListener l) {}
    public void removePropertyChangeListener(PropertyChangeListener l) {}
    public PropertyChangeListener[] getPropertyChangeListeners() { return new PropertyChangeListener[0]; }

    public void addResourceBundle(String bundleName) {}
    public void removeResourceBundle(String bundleName) {}

    public Class<? extends ComponentUI> getUIClass(String uiClassID) { return null; }
    public ComponentUI getUI(JComponent target) { return null; }
}
