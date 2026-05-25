package javax.swing;

import java.awt.Component;
import javax.swing.event.PopupMenuListener;

public class JPopupMenu extends JComponent {
    private static final long serialVersionUID = 1L;

    public static class Separator extends JSeparator {
        private static final long serialVersionUID = 1L;
        public Separator() { super(SwingConstants.HORIZONTAL); }
    }

    private Component invoker;

    public JPopupMenu() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setOpaque(true);
        setBackground(new java.awt.Color(0x3A3D43));
        setVisible(false);
    }
    public JPopupMenu(String label) { this(); }

    public JMenuItem add(JMenuItem item) { if (item != null) super.add(item); return item; }
    public JMenuItem add(String s) { JMenuItem it = new JMenuItem(s); super.add(it); return it; }
    public JMenuItem add(Action a) { JMenuItem it = new JMenuItem(a); super.add(it); return it; }
    public void addSeparator() { super.add(new Separator()); }
    public void insert(Action a, int index) { super.add(new JMenuItem(a), index); }
    public void insert(Component c, int index) { super.add(c, index); }
    @Override public void removeAll() { super.removeAll(); }
    public void show(Component invoker, int x, int y) {
        this.invoker = invoker;
        setVisible(true);
        // Without a real Swing root pane to mount onto, positioning here is best-effort.
        java.awt.Dimension d = getPreferredSize();
        setBounds(x, y, Math.max(80, d.width), Math.max(20, d.height));
        doLayout();
        repaint();
    }
    public Component getInvoker() { return invoker; }
    public void setInvoker(Component invoker) { this.invoker = invoker; }
    public void setLabel(String label) {}
    public String getLabel() { return null; }
    public void addPopupMenuListener(PopupMenuListener l) {}
    public void removePopupMenuListener(PopupMenuListener l) {}
    public boolean isBorderPainted() { return false; }
    public void setBorderPainted(boolean b) {}
    public boolean isLightWeightPopupEnabled() { return true; }
    public void setLightWeightPopupEnabled(boolean enabled) {}

    private static boolean defaultLightWeightPopupEnabled = true;
    public static void setDefaultLightWeightPopupEnabled(boolean aFlag) { defaultLightWeightPopupEnabled = aFlag; }
    public static boolean getDefaultLightWeightPopupEnabled() { return defaultLightWeightPopupEnabled; }
}
