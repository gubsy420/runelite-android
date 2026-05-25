package java.awt.geom;

import java.awt.Rectangle;
import java.awt.Shape;
import java.io.Serializable;

/**
 * Minimal GeneralPath. Stores a flat float[] of commands+coordinates; usable as a Shape
 * for bounds queries. Curve flattening is not implemented — caller-side fallback to
 * bounding rectangles is acceptable for the renderer's current code paths.
 */
public class GeneralPath implements Shape, Cloneable, Serializable {
    private static final long serialVersionUID = -8327096662768731142L;

    public static final int WIND_EVEN_ODD = PathIterator.WIND_EVEN_ODD;
    public static final int WIND_NON_ZERO = PathIterator.WIND_NON_ZERO;

    private int windingRule = WIND_NON_ZERO;
    private float minX = Float.POSITIVE_INFINITY, minY = Float.POSITIVE_INFINITY;
    private float maxX = Float.NEGATIVE_INFINITY, maxY = Float.NEGATIVE_INFINITY;
    private boolean empty = true;

    public GeneralPath() {}
    public GeneralPath(int rule) { this.windingRule = rule; }
    public GeneralPath(Shape s) {
        if (s != null) {
            Rectangle b = s.getBounds();
            if (b.width > 0 && b.height > 0) {
                grow(b.x, b.y); grow(b.x + b.width, b.y + b.height);
            }
        }
    }

    private void grow(double x, double y) {
        if (empty) { minX = (float) x; maxX = (float) x; minY = (float) y; maxY = (float) y; empty = false; return; }
        if (x < minX) minX = (float) x;
        if (x > maxX) maxX = (float) x;
        if (y < minY) minY = (float) y;
        if (y > maxY) maxY = (float) y;
    }

    public void moveTo(double x, double y) { grow(x, y); }
    public void moveTo(float x, float y) { grow(x, y); }
    public void lineTo(double x, double y) { grow(x, y); }
    public void lineTo(float x, float y) { grow(x, y); }
    public void quadTo(double x1, double y1, double x2, double y2) { grow(x1, y1); grow(x2, y2); }
    public void curveTo(double x1, double y1, double x2, double y2, double x3, double y3) { grow(x1, y1); grow(x2, y2); grow(x3, y3); }
    public void closePath() {}

    public void append(Shape s, boolean connect) {
        if (s != null) {
            Rectangle b = s.getBounds();
            grow(b.x, b.y); grow(b.x + b.width, b.y + b.height);
        }
    }

    public void append(PathIterator pi, boolean connect) {
        // No-op: we don't keep segments.
    }

    public int getWindingRule() { return windingRule; }
    public void setWindingRule(int rule) { this.windingRule = rule; }

    public void reset() { empty = true; minX = Float.POSITIVE_INFINITY; minY = Float.POSITIVE_INFINITY; maxX = Float.NEGATIVE_INFINITY; maxY = Float.NEGATIVE_INFINITY; }
    public boolean isEmpty() { return empty; }

    @Override
    public Rectangle getBounds() {
        if (empty) return new Rectangle();
        return new Rectangle((int) Math.floor(minX), (int) Math.floor(minY),
            (int) Math.ceil(maxX - minX), (int) Math.ceil(maxY - minY));
    }

    @Override
    public Rectangle2D getBounds2D() {
        if (empty) return new Rectangle2D.Float();
        return new Rectangle2D.Float(minX, minY, maxX - minX, maxY - minY);
    }

    @Override public boolean contains(double x, double y) { return !empty && x >= minX && x <= maxX && y >= minY && y <= maxY; }
    @Override public boolean contains(double x, double y, double w, double h) { return contains(x, y) && contains(x + w, y + h); }
    @Override public boolean intersects(double x, double y, double w, double h) { return getBounds2D().intersects(x, y, w, h); }

    @Override
    public Object clone() {
        try { return super.clone(); } catch (CloneNotSupportedException e) { throw new InternalError(e); }
    }
}
