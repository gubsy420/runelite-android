package javax.swing;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;
import javax.swing.border.Border;
import javax.swing.event.AncestorListener;

public class JComponent extends Container {
    private static final long serialVersionUID = 8202245103466131933L;

    public static final int WHEN_FOCUSED = 0;
    public static final int WHEN_ANCESTOR_OF_FOCUSED_COMPONENT = 1;
    public static final int WHEN_IN_FOCUSED_WINDOW = 2;
    public static final int UNDEFINED_CONDITION = -1;

    public static final String TOOL_TIP_TEXT_KEY = "ToolTipText";

    protected javax.swing.plaf.ComponentUI ui;

    private Border border;
    private String toolTipText;
    private Dimension preferred, minimum, maximum;
    private boolean doubleBuffered = true;
    private boolean opaque;
    private float alignmentX = 0.5f;
    private float alignmentY = 0.5f;

    public JComponent() {}

    public Border getBorder() { return border; }
    public void setBorder(Border border) { this.border = border; }

    public String getToolTipText() { return toolTipText; }
    public void setToolTipText(String text) { this.toolTipText = text; }

    @Override public Dimension getPreferredSize() {
        if (preferred != null) return new Dimension(preferred);
        return super.getPreferredSize();
    }
    public void setPreferredSize(Dimension d) { this.preferred = d; }
    @Override public Dimension getMinimumSize() {
        if (minimum != null) return new Dimension(minimum);
        return super.getMinimumSize();
    }
    public void setMinimumSize(Dimension d) { this.minimum = d; }
    @Override public Dimension getMaximumSize() { return maximum != null ? new Dimension(maximum) : new Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE); }
    public void setMaximumSize(Dimension d) { this.maximum = d; }

    public boolean isDoubleBuffered() { return doubleBuffered; }
    public void setDoubleBuffered(boolean d) { this.doubleBuffered = d; }
    public boolean isOpaque() { return opaque; }
    public void setOpaque(boolean o) { this.opaque = o; }

    public float getAlignmentX() { return alignmentX; }
    public void setAlignmentX(float f) { this.alignmentX = f; }
    public float getAlignmentY() { return alignmentY; }
    public void setAlignmentY(float f) { this.alignmentY = f; }

    public void addPropertyChangeListener(PropertyChangeListener l) {}
    public void removePropertyChangeListener(PropertyChangeListener l) {}
    public void addPropertyChangeListener(String name, PropertyChangeListener l) {}
    public void removePropertyChangeListener(String name, PropertyChangeListener l) {}
    public void firePropertyChange(String propertyName, Object oldValue, Object newValue) {}

    public void addAncestorListener(AncestorListener l) {}
    public void removeAncestorListener(AncestorListener l) {}

    public javax.swing.plaf.ComponentUI getUI() { return ui; }
    public void setUI(javax.swing.plaf.ComponentUI ui) { this.ui = ui; }
    public String getUIClassID() { return "ComponentUI"; }

    public void updateUI() {}

    public ActionMap getActionMap() { return new ActionMap(); }
    public void setActionMap(ActionMap am) {}
    public InputMap getInputMap() { return new InputMap(); }
    public InputMap getInputMap(int condition) { return new InputMap(); }
    public void setInputMap(int condition, InputMap map) {}

    public void registerKeyboardAction(ActionListener anAction, KeyStroke aKeyStroke, int aCondition) {}
    public void registerKeyboardAction(ActionListener anAction, String aCommand, KeyStroke aKeyStroke, int aCondition) {}
    public void unregisterKeyboardAction(KeyStroke aKeyStroke) {}

    private java.util.Map<Object, Object> clientProperties;
    public void putClientProperty(Object key, Object value) {
        if (clientProperties == null) clientProperties = new java.util.HashMap<>();
        if (value == null) clientProperties.remove(key);
        else clientProperties.put(key, value);
        onClientPropertySet(key, value);
    }
    public Object getClientProperty(Object key) {
        return clientProperties != null ? clientProperties.get(key) : null;
    }
    /** Subclass hook. Called whenever a client property is set, after the value is stored. */
    protected void onClientPropertySet(Object key, Object value) {}

    public boolean requestFocusInWindow() { return false; }
    public void grabFocus() {}
    public void resetKeyboardActions() {}

    public boolean getInheritsPopupMenu() { return false; }
    public void setInheritsPopupMenu(boolean value) {}

    public java.awt.Insets getInsets() { return border != null ? border.getBorderInsets(this) : super.getInsets(); }

    private JPopupMenu componentPopupMenu;
    public void setComponentPopupMenu(JPopupMenu menu) { this.componentPopupMenu = menu; }
    public JPopupMenu getComponentPopupMenu() { return componentPopupMenu; }

    @Override
    public void paint(java.awt.Graphics g) {
        if (getWidth() <= 0 || getHeight() <= 0) return;
        if (opaque) {
            java.awt.Color saved = g.getColor();
            g.setColor(getBackground());
            g.fillRect(0, 0, getWidth(), getHeight());
            if (saved != null) g.setColor(saved);
        }
        paintComponent(g);
        paintBorder(g);
        paintChildren(g);
    }

    protected void paintComponent(java.awt.Graphics g) {
        // Subclass hook — JLabel/JButton/etc draw text, icons, etc here.
    }

    protected void paintBorder(java.awt.Graphics g) {
        if (border != null) {
            border.paintBorder(this, g, 0, 0, getWidth(), getHeight());
        }
    }

    /** Host-side bridges so the Compose paint walker can invoke our protected paint hooks. */
    public final void hostPaintComponent(java.awt.Graphics g) { paintComponent(g); }
    public final void hostPaintBorder(java.awt.Graphics g) { paintBorder(g); }
}
