package javax.swing.plaf;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.accessibility.Accessible;
import javax.swing.JComponent;

public abstract class ComponentUI {
    public ComponentUI() {}

    public void installUI(JComponent c) {}
    public void uninstallUI(JComponent c) {}
    public void paint(Graphics g, JComponent c) {}
    public void update(Graphics g, JComponent c) { paint(g, c); }
    public Dimension getPreferredSize(JComponent c) { return null; }
    public Dimension getMinimumSize(JComponent c) { return getPreferredSize(c); }
    public Dimension getMaximumSize(JComponent c) { return getPreferredSize(c); }
    public boolean contains(JComponent c, int x, int y) { return c.inside(x, y); }

    public static ComponentUI createUI(JComponent c) { return null; }

    public int getBaseline(JComponent c, int width, int height) { return -1; }

    public int getAccessibleChildrenCount(JComponent c) { return 0; }
    public Accessible getAccessibleChild(JComponent c, int i) { return null; }
}
