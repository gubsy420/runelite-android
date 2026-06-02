package java.awt.geom;

import java.awt.Rectangle;
import java.awt.Shape;
import java.io.Serializable;

/**
 * GeneralPath with real segment storage. Holds the path's commands and coordinates in
 * parallel arrays the same way OpenJDK does, so callers like
 * net.runelite.api.geometry.Geometry.clipPath that walk the path via getPathIterator()
 * see actual segments instead of a null iterator.
 *
 * Curve flattening for getPathIterator(at, flatness) is intentionally not implemented —
 * the iterator emits curves verbatim. Add a FlatteningPathIterator wrapper if a caller
 * surfaces that actually requires line-segment-only output.
 */
public class GeneralPath implements Shape, Cloneable, Serializable {
    private static final long serialVersionUID = -8327096662768731142L;

    public static final int WIND_EVEN_ODD = PathIterator.WIND_EVEN_ODD;
    public static final int WIND_NON_ZERO = PathIterator.WIND_NON_ZERO;

    private int windingRule = WIND_NON_ZERO;

    private byte[] segTypes = new byte[8];
    private float[] segCoords = new float[16];
    private int numSegs = 0;
    private int numCoords = 0;

    private float minX = Float.POSITIVE_INFINITY, minY = Float.POSITIVE_INFINITY;
    private float maxX = Float.NEGATIVE_INFINITY, maxY = Float.NEGATIVE_INFINITY;
    private boolean empty = true;

    public GeneralPath() {}
    public GeneralPath(int rule) { this.windingRule = rule; }
    public GeneralPath(Shape s) {
        if (s != null) append(s, false);
    }

    private void ensureSegCapacity(int n) {
        if (numSegs + n > segTypes.length) {
            byte[] nt = new byte[Math.max(segTypes.length * 2, numSegs + n)];
            System.arraycopy(segTypes, 0, nt, 0, numSegs);
            segTypes = nt;
        }
    }
    private void ensureCoordCapacity(int n) {
        if (numCoords + n > segCoords.length) {
            float[] nc = new float[Math.max(segCoords.length * 2, numCoords + n)];
            System.arraycopy(segCoords, 0, nc, 0, numCoords);
            segCoords = nc;
        }
    }

    private void grow(double x, double y) {
        if (empty) { minX = (float) x; maxX = (float) x; minY = (float) y; maxY = (float) y; empty = false; return; }
        if (x < minX) minX = (float) x;
        if (x > maxX) maxX = (float) x;
        if (y < minY) minY = (float) y;
        if (y > maxY) maxY = (float) y;
    }

    public void moveTo(double x, double y) { moveTo((float) x, (float) y); }
    public void moveTo(float x, float y) {
        ensureSegCapacity(1); ensureCoordCapacity(2);
        segTypes[numSegs++] = (byte) PathIterator.SEG_MOVETO;
        segCoords[numCoords++] = x;
        segCoords[numCoords++] = y;
        grow(x, y);
    }

    public void lineTo(double x, double y) { lineTo((float) x, (float) y); }
    public void lineTo(float x, float y) {
        ensureSegCapacity(1); ensureCoordCapacity(2);
        segTypes[numSegs++] = (byte) PathIterator.SEG_LINETO;
        segCoords[numCoords++] = x;
        segCoords[numCoords++] = y;
        grow(x, y);
    }

    public void quadTo(double x1, double y1, double x2, double y2) {
        ensureSegCapacity(1); ensureCoordCapacity(4);
        segTypes[numSegs++] = (byte) PathIterator.SEG_QUADTO;
        segCoords[numCoords++] = (float) x1; segCoords[numCoords++] = (float) y1;
        segCoords[numCoords++] = (float) x2; segCoords[numCoords++] = (float) y2;
        grow(x1, y1); grow(x2, y2);
    }

    public void curveTo(double x1, double y1, double x2, double y2, double x3, double y3) {
        ensureSegCapacity(1); ensureCoordCapacity(6);
        segTypes[numSegs++] = (byte) PathIterator.SEG_CUBICTO;
        segCoords[numCoords++] = (float) x1; segCoords[numCoords++] = (float) y1;
        segCoords[numCoords++] = (float) x2; segCoords[numCoords++] = (float) y2;
        segCoords[numCoords++] = (float) x3; segCoords[numCoords++] = (float) y3;
        grow(x1, y1); grow(x2, y2); grow(x3, y3);
    }

    public void closePath() {
        ensureSegCapacity(1);
        segTypes[numSegs++] = (byte) PathIterator.SEG_CLOSE;
    }

    public void append(Shape s, boolean connect) {
        if (s == null) return;
        PathIterator it;
        try { it = s.getPathIterator(null); } catch (Throwable t) { it = null; }
        if (it == null) {
            // Some shapes in this shadow tree still don't expose a path iterator; preserve
            // at least their bounding box so subsequent getBounds() queries stay meaningful.
            Rectangle b = s.getBounds();
            if (b.width > 0 && b.height > 0) {
                grow(b.x, b.y); grow(b.x + b.width, b.y + b.height);
            }
            return;
        }
        append(it, connect);
    }

    public void append(PathIterator pi, boolean connect) {
        if (pi == null) return;
        float[] coords = new float[6];
        boolean first = true;
        while (!pi.isDone()) {
            int t = pi.currentSegment(coords);
            switch (t) {
                case PathIterator.SEG_MOVETO:
                    if (connect && !first) lineTo(coords[0], coords[1]);
                    else moveTo(coords[0], coords[1]);
                    break;
                case PathIterator.SEG_LINETO:
                    lineTo(coords[0], coords[1]);
                    break;
                case PathIterator.SEG_QUADTO:
                    quadTo(coords[0], coords[1], coords[2], coords[3]);
                    break;
                case PathIterator.SEG_CUBICTO:
                    curveTo(coords[0], coords[1], coords[2], coords[3], coords[4], coords[5]);
                    break;
                case PathIterator.SEG_CLOSE:
                    closePath();
                    break;
            }
            first = false;
            connect = false;
            pi.next();
        }
    }

    public int getWindingRule() { return windingRule; }
    public void setWindingRule(int rule) { this.windingRule = rule; }

    public void reset() {
        numSegs = 0;
        numCoords = 0;
        empty = true;
        minX = Float.POSITIVE_INFINITY; minY = Float.POSITIVE_INFINITY;
        maxX = Float.NEGATIVE_INFINITY; maxY = Float.NEGATIVE_INFINITY;
    }

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
    public PathIterator getPathIterator(AffineTransform at) {
        return new GeneralPathIterator(this, at);
    }

    @Override
    public PathIterator getPathIterator(AffineTransform at, double flatness) {
        return new GeneralPathIterator(this, at);
    }

    @Override
    public Object clone() {
        try {
            GeneralPath g = (GeneralPath) super.clone();
            g.segTypes = segTypes.clone();
            g.segCoords = segCoords.clone();
            return g;
        } catch (CloneNotSupportedException e) {
            throw new InternalError(e);
        }
    }

    private static final class GeneralPathIterator implements PathIterator {
        private final GeneralPath p;
        private final AffineTransform at;
        private int seg = 0;
        private int coord = 0;

        GeneralPathIterator(GeneralPath p, AffineTransform at) {
            this.p = p;
            this.at = at;
        }

        @Override public int getWindingRule() { return p.windingRule; }
        @Override public boolean isDone() { return seg >= p.numSegs; }

        @Override
        public void next() {
            if (isDone()) return;
            int t = p.segTypes[seg];
            seg++;
            switch (t) {
                case SEG_MOVETO:
                case SEG_LINETO: coord += 2; break;
                case SEG_QUADTO: coord += 4; break;
                case SEG_CUBICTO: coord += 6; break;
                case SEG_CLOSE: break;
            }
        }

        private static int sizeOf(int t) {
            switch (t) {
                case SEG_MOVETO:
                case SEG_LINETO: return 2;
                case SEG_QUADTO: return 4;
                case SEG_CUBICTO: return 6;
                default: return 0;
            }
        }

        @Override
        public int currentSegment(float[] coords) {
            int t = p.segTypes[seg];
            int n = sizeOf(t);
            if (n > 0) {
                System.arraycopy(p.segCoords, coord, coords, 0, n);
                if (at != null) at.transform(coords, 0, coords, 0, n / 2);
            }
            return t;
        }

        @Override
        public int currentSegment(double[] coords) {
            int t = p.segTypes[seg];
            int n = sizeOf(t);
            if (n > 0) {
                for (int i = 0; i < n; i++) coords[i] = p.segCoords[coord + i];
                if (at != null) at.transform(coords, 0, coords, 0, n / 2);
            }
            return t;
        }
    }
}
