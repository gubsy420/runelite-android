package javax.swing.border;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.io.Serializable;

public abstract class AbstractBorder implements Border, Serializable {
    @Override public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {}
    @Override public Insets getBorderInsets(Component c) { return new Insets(0, 0, 0, 0); }
    public Insets getBorderInsets(Component c, Insets insets) {
        if (insets != null) insets.set(0, 0, 0, 0);
        return insets != null ? insets : getBorderInsets(c);
    }
    @Override public boolean isBorderOpaque() { return false; }
    public Rectangle getInteriorRectangle(Component c, int x, int y, int w, int h) {
        Insets i = getBorderInsets(c);
        return new Rectangle(x + i.left, y + i.top, w - i.right - i.left, h - i.top - i.bottom);
    }
}
