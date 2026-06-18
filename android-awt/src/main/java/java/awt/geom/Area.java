package java.awt.geom;

import java.awt.Rectangle;
import java.awt.Shape;
import java.util.ArrayList;
import java.util.List;

/**
 * Stored-shape Area shadow. Holds each Shape that was passed in / added so the underlying
 * geometry survives and can be re-iterated via {@link #getPathIterator(AffineTransform)}.
 * Without this, callers like {@code new GeneralPath(area)} (NpcAggroAreaPlugin) would walk
 * a null iterator and silently produce an empty path, which is why aggression-area lines
 * stopped drawing.
 *
 * Boolean operations are partial:
 *  - {@link #add(Area)} concatenates sub-shapes — exact for non-overlapping inputs, draws
 *    overlaps twice but the rasterizer's winding rule absorbs that for the simple shapes
 *    plugins build (axis-aligned polygons + rectangles).
 *  - {@link #intersect(Area)} falls back to a bounding-rectangle intersection.
 *  - {@link #subtract(Area)} / {@link #exclusiveOr(Area)} are no-ops vs. the spec — true
 *    CSG would require a polygon clipper we don't ship. No RuneLite plugin currently
 *    uses them on Android, so this is a known-limitation rather than a bug.
 */
public class Area implements Shape, Cloneable {
    private final List<Shape> shapes = new ArrayList<>();
    private Rectangle bounds = new Rectangle();
    private boolean empty = true;

    public Area() {
    }

    public Area(Shape shape) {
        if (shape == null) return;
        shapes.add(shape);
        Rectangle b = shape.getBounds();
        if (b != null && b.width > 0 && b.height > 0) {
            bounds = new Rectangle(b);
            empty = false;
        }
    }

    public void add(Area rhs) {
        if (rhs == null || rhs.isEmpty()) return;
        shapes.addAll(rhs.shapes);
        if (empty) {
            bounds = new Rectangle(rhs.bounds);
            empty = false;
        } else {
            bounds = bounds.union(rhs.bounds);
        }
    }

    /** Best-effort: spec-correct CSG subtraction requires a polygon clipper this shadow
     *  doesn't ship. No-op rather than emit a wrong-but-plausible result; if a plugin
     *  ever depends on this we'll port a clipper. */
    public void subtract(Area rhs) {
    }

    public void intersect(Area rhs) {
        if (rhs == null || rhs.isEmpty()) {
            reset();
            return;
        }
        if (empty) return;
        bounds = bounds.intersection(rhs.bounds);
        if (bounds.width <= 0 || bounds.height <= 0) {
            reset();
            return;
        }
        // Geometry is now an over-approximation (the intersected bbox, not the true
        // shape intersection). For RuneLite's current call sites (none) this is fine;
        // collapse the stored shapes into a single Rectangle that matches the new
        // bounds so subsequent iteration produces something coherent.
        shapes.clear();
        shapes.add(new Rectangle(bounds));
    }

    /** See note on {@link #subtract(Area)} — same limitation, no-op. */
    public void exclusiveOr(Area rhs) {
        add(rhs);
    }

    public void reset() {
        shapes.clear();
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
        return shapes.size() <= 1;
    }

    public boolean isSingular() {
        return shapes.size() <= 1;
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
        if (empty) return false;
        for (Shape s : shapes) if (s.contains(x, y)) return true;
        return false;
    }

    @Override
    public boolean contains(double x, double y, double w, double h) {
        if (empty) return false;
        for (Shape s : shapes) if (s.contains(x, y, w, h)) return true;
        return false;
    }

    @Override
    public boolean intersects(double x, double y, double w, double h) {
        if (empty) return false;
        for (Shape s : shapes) if (s.intersects(x, y, w, h)) return true;
        return false;
    }

    @Override
    public PathIterator getPathIterator(AffineTransform at) {
        return new AreaIterator(shapes, at);
    }

    @Override
    public PathIterator getPathIterator(AffineTransform at, double flatness) {
        return new AreaIterator(shapes, at);
    }

    @Override
    public Object clone() {
        Area c = new Area();
        c.shapes.addAll(this.shapes);
        c.bounds = new Rectangle(this.bounds);
        c.empty = this.empty;
        return c;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Area) {
            Area a = (Area) obj;
            return empty == a.empty && bounds.equals(a.bounds) && shapes.equals(a.shapes);
        }
        return false;
    }

    /** Sequentially yields each stored shape's path iterator. When one shape's iterator
     *  finishes, advance to the next shape — caller sees one big virtual path. */
    private static final class AreaIterator implements PathIterator {
        private final List<Shape> shapes;
        private final AffineTransform at;
        private int shapeIdx;
        private PathIterator current;

        AreaIterator(List<Shape> shapes, AffineTransform at) {
            this.shapes = shapes;
            this.at = at;
            this.shapeIdx = -1;
            advance();
        }

        private void advance() {
            current = null;
            while (++shapeIdx < shapes.size()) {
                PathIterator it = shapes.get(shapeIdx).getPathIterator(at);
                if (it != null && !it.isDone()) {
                    current = it;
                    return;
                }
            }
        }

        @Override public int getWindingRule() {
            return current != null ? current.getWindingRule() : WIND_NON_ZERO;
        }

        @Override public boolean isDone() {
            return current == null;
        }

        @Override public void next() {
            if (current == null) return;
            current.next();
            if (current.isDone()) advance();
        }

        @Override public int currentSegment(float[] coords) {
            return current.currentSegment(coords);
        }

        @Override public int currentSegment(double[] coords) {
            return current.currentSegment(coords);
        }
    }
}
