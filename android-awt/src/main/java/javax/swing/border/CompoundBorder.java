package javax.swing.border;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;

public class CompoundBorder extends AbstractBorder {
    private static final long serialVersionUID = 9054540377030555103L;
    protected Border outsideBorder;
    protected Border insideBorder;

    public CompoundBorder() {}
    public CompoundBorder(Border outsideBorder, Border insideBorder) {
        this.outsideBorder = outsideBorder;
        this.insideBorder = insideBorder;
    }

    public Border getOutsideBorder() { return outsideBorder; }
    public Border getInsideBorder()  { return insideBorder; }

    @Override
    public Insets getBorderInsets(Component c) {
        Insets a = outsideBorder != null ? outsideBorder.getBorderInsets(c) : new Insets(0, 0, 0, 0);
        Insets b = insideBorder != null ? insideBorder.getBorderInsets(c) : new Insets(0, 0, 0, 0);
        return new Insets(a.top + b.top, a.left + b.left, a.bottom + b.bottom, a.right + b.right);
    }

    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        if (outsideBorder != null) outsideBorder.paintBorder(c, g, x, y, width, height);
        if (insideBorder != null) {
            Insets o = outsideBorder != null ? outsideBorder.getBorderInsets(c) : new Insets(0, 0, 0, 0);
            insideBorder.paintBorder(c, g,
                x + o.left, y + o.top,
                width - o.left - o.right, height - o.top - o.bottom);
        }
    }
}
