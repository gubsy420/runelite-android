package javax.swing;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;

public class JMenuBar extends JComponent {
    private static final long serialVersionUID = 1L;
    private static final int DEFAULT_HEIGHT = 28;

    public JMenuBar() {
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        setOpaque(true);
        setBackground(new Color(0x3A3D43));
        setPreferredSize(new Dimension(0, DEFAULT_HEIGHT));
        setMinimumSize(new Dimension(0, DEFAULT_HEIGHT));
    }

    public JMenu add(JMenu c) {
        if (c != null) super.add(c);
        return c;
    }

    public JMenu getMenu(int index) {
        Component c = getComponentCount() > index ? getComponent(index) : null;
        return c instanceof JMenu ? (JMenu) c : null;
    }

    public int getMenuCount() { return getComponentCount(); }
    public void setSelected(Component sel) {}
    public boolean isSelected() { return false; }
    public void setBorderPainted(boolean b) {}
    public boolean isBorderPainted() { return false; }
    public boolean isManagingFocus() { return false; }
    public java.awt.Insets getMargin() { return new java.awt.Insets(0, 0, 0, 0); }
    public void setMargin(java.awt.Insets m) {}
    public boolean isFloatable() { return false; }
}
