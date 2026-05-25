package javax.swing.border;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.Icon;

public class MatteBorder extends EmptyBorder {
    private static final long serialVersionUID = 4422834609971747173L;
    protected Color color;
    protected Icon tileIcon;

    public MatteBorder(int top, int left, int bottom, int right, Color color) {
        super(top, left, bottom, right);
        this.color = color;
    }

    public MatteBorder(Insets borderInsets, Color color) {
        super(borderInsets);
        this.color = color;
    }

    public MatteBorder(int top, int left, int bottom, int right, Icon tileIcon) {
        super(top, left, bottom, right);
        this.tileIcon = tileIcon;
    }

    public MatteBorder(Icon tileIcon) {
        super(-1, -1, -1, -1);
        this.tileIcon = tileIcon;
    }

    public Color getMatteColor() { return color; }
    public Icon getTileIcon() { return tileIcon; }

    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        if (color == null) return;
        Color old = g.getColor();
        g.setColor(color);
        g.fillRect(x, y, width, top);
        g.fillRect(x, y + height - bottom, width, bottom);
        g.fillRect(x, y + top, left, height - top - bottom);
        g.fillRect(x + width - right, y + top, right, height - top - bottom);
        g.setColor(old);
    }

    @Override public boolean isBorderOpaque() { return color != null && tileIcon == null; }
}
