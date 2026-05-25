package javax.swing.border;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;

public class LineBorder extends AbstractBorder {
    private static final long serialVersionUID = -737488367079141881L;
    protected int thickness;
    protected Color lineColor;
    protected boolean roundedCorners;

    public LineBorder(Color color) { this(color, 1, false); }
    public LineBorder(Color color, int thickness) { this(color, thickness, false); }
    public LineBorder(Color color, int thickness, boolean roundedCorners) {
        this.lineColor = color; this.thickness = thickness; this.roundedCorners = roundedCorners;
    }

    public Color getLineColor() { return lineColor; }
    public int getThickness() { return thickness; }
    public boolean getRoundedCorners() { return roundedCorners; }

    @Override
    public Insets getBorderInsets(Component c) {
        return new Insets(thickness, thickness, thickness, thickness);
    }

    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        Color old = g.getColor();
        g.setColor(lineColor);
        for (int i = 0; i < thickness; i++) g.drawRect(x + i, y + i, width - i * 2 - 1, height - i * 2 - 1);
        g.setColor(old);
    }

    @Override public boolean isBorderOpaque() { return !roundedCorners; }

    public static LineBorder createBlackLineBorder() { return new LineBorder(Color.BLACK); }
    public static LineBorder createGrayLineBorder() { return new LineBorder(Color.GRAY); }
}
