package java.awt;

import java.awt.geom.Rectangle2D;

public interface Shape {
    Rectangle getBounds();

    Rectangle2D getBounds2D();

    boolean contains(double x, double y);

    boolean contains(double x, double y, double w, double h);

    boolean intersects(double x, double y, double w, double h);

    default boolean contains(java.awt.geom.Point2D p) {
        return contains(p.getX(), p.getY());
    }

    default boolean contains(Rectangle2D r) {
        return contains(r.getX(), r.getY(), r.getWidth(), r.getHeight());
    }

    default boolean intersects(Rectangle2D r) {
        return intersects(r.getX(), r.getY(), r.getWidth(), r.getHeight());
    }
}
