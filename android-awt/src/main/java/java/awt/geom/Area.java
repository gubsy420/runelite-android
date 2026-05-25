package java.awt.geom;

import java.awt.Rectangle;
import java.awt.Shape;

/**
 * Minimal Area shadow. RuneLite uses Area only for binary CSG combine — the geom is
 * tracked as a bounding rectangle here; if a future caller needs sub-rect precision we'll
 * port a real flat path representation.
 */
public class Area implements Shape, Cloneable {
    private Rectangle bounds = new Rectangle();
    private boolean empty = true;

    public Area() {
    }

    public Area(Shape shape) {
        if (shape != null) {
            Rectangle b = shape.getBounds();
            if (b != null && b.width > 0 && b.height > 0) {
                bounds = new Rectangle(b);
                empty = false;
            }
        }
    }

    public void add(Area rhs) {
        if (rhs == null || rhs.isEmpty()) return;
        if (empty) {
            bounds = new Rectangle(rhs.bounds);
            empty = false;
        } else {
            bounds = bounds.union(rhs.bounds);
        }
    }

    public void subtract(Area rhs) {
        // Bounding-box approximation can't do true subtraction; leave unchanged.
        // RuneLite doesn't appear to call this; provided for API completeness.
    }

    public void intersect(Area rhs) {
        if (rhs == null || rhs.isEmpty()) {
            reset();
            return;
        }
        if (!empty) {
            bounds = bounds.intersection(rhs.bounds);
            if (bounds.width <= 0 || bounds.height <= 0) reset();
        }
    }

    public void exclusiveOr(Area rhs) {
        add(rhs);
    }

    public void reset() {
        bounds = new Rectangle();
        empty = true;
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isPolygonal() {
        return true;
    }

    public boolean isRectangular() {
        return true;
    }

    public boolean isSingular() {
        return true;
    }

    @Override
    public Rectangle getBounds() {
        return new Rectangle(bounds);
    }

    @Override
    public Rectangle2D getBounds2D() {
        return bounds.getBounds2D();
    }

    @Override
    public boolean contains(double x, double y) {
        return !empty && bounds.contains((int) x, (int) y);
    }

    @Override
    public boolean contains(double x, double y, double w, double h) {
        return !empty && bounds.contains((int) x, (int) y, (int) w, (int) h);
    }

    @Override
    public boolean intersects(double x, double y, double w, double h) {
        return !empty && bounds.intersects(new Rectangle((int) x, (int) y, (int) w, (int) h));
    }

    @Override
    public Object clone() {
        Area c = new Area();
        c.bounds = new Rectangle(bounds);
        c.empty = empty;
        return c;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Area) {
            Area a = (Area) obj;
            return empty == a.empty && bounds.equals(a.bounds);
        }
        return false;
    }
}
