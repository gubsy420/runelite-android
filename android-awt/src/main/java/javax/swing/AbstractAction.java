package javax.swing;

import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public abstract class AbstractAction implements Action, Cloneable, Serializable {
    private static final long serialVersionUID = -1748743320228L;

    protected boolean enabled = true;
    private final Map<String, Object> values = new HashMap<>();

    public AbstractAction() {}
    public AbstractAction(String name) { putValue(NAME, name); }
    public AbstractAction(String name, Icon icon) { putValue(NAME, name); putValue(SMALL_ICON, icon); }

    @Override public Object getValue(String key) { return values.get(key); }
    @Override public void putValue(String key, Object value) { values.put(key, value); }
    @Override public boolean isEnabled() { return enabled; }
    @Override public void setEnabled(boolean b) { this.enabled = b; }
    @Override public void addPropertyChangeListener(PropertyChangeListener l) {}
    @Override public void removePropertyChangeListener(PropertyChangeListener l) {}

    @Override public abstract void actionPerformed(ActionEvent e);

    @Override public Object clone() {
        try { return super.clone(); } catch (CloneNotSupportedException e) { throw new InternalError(e); }
    }
}
