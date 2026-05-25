package java.awt;

import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.awt.image.ColorModel;

public class GradientPaint implements Paint {
    private final float x1, y1, x2, y2;
    private final Color c1, c2;
    private final boolean cyclic;

    public GradientPaint(float x1, float y1, Color c1, float x2, float y2, Color c2) {
        this(x1, y1, c1, x2, y2, c2, false);
    }

    public GradientPaint(float x1, float y1, Color c1, float x2, float y2, Color c2, boolean cyclic) {
        this.x1 = x1; this.y1 = y1; this.c1 = c1; this.x2 = x2; this.y2 = y2; this.c2 = c2; this.cyclic = cyclic;
    }

    public GradientPaint(java.awt.geom.Point2D pt1, Color c1, java.awt.geom.Point2D pt2, Color c2) {
        this((float) pt1.getX(), (float) pt1.getY(), c1, (float) pt2.getX(), (float) pt2.getY(), c2, false);
    }

    public GradientPaint(java.awt.geom.Point2D pt1, Color c1, java.awt.geom.Point2D pt2, Color c2, boolean cyclic) {
        this((float) pt1.getX(), (float) pt1.getY(), c1, (float) pt2.getX(), (float) pt2.getY(), c2, cyclic);
    }

    public Color getColor1() { return c1; }
    public Color getColor2() { return c2; }
    public java.awt.geom.Point2D getPoint1() { return new java.awt.geom.Point2D.Float(x1, y1); }
    public java.awt.geom.Point2D getPoint2() { return new java.awt.geom.Point2D.Float(x2, y2); }
    public boolean isCyclic() { return cyclic; }

    @Override
    public int getTransparency() {
        return (c1.getAlpha() == 0xFF && c2.getAlpha() == 0xFF) ? OPAQUE : TRANSLUCENT;
    }

    @Override
    public PaintContext createContext(ColorModel cm, Rectangle bounds, Rectangle2D userBounds,
                                       AffineTransform xform, RenderingHints hints) {
        throw new UnsupportedOperationException("GradientPaint contexts are not used by the renderer");
    }
}
