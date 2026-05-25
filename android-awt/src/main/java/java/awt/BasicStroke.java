package java.awt;

public class BasicStroke implements Stroke {
    public static final int JOIN_MITER = 0;
    public static final int JOIN_ROUND = 1;
    public static final int JOIN_BEVEL = 2;
    public static final int CAP_BUTT = 0;
    public static final int CAP_ROUND = 1;
    public static final int CAP_SQUARE = 2;

    private final float width;
    private final int cap;
    private final int join;
    private final float miterLimit;
    private final float[] dash;
    private final float dashPhase;

    public BasicStroke() {
        this(1f);
    }

    public BasicStroke(float width) {
        this(width, CAP_SQUARE, JOIN_MITER, 10f, null, 0f);
    }

    public BasicStroke(float width, int cap, int join) {
        this(width, cap, join, 10f, null, 0f);
    }

    public BasicStroke(float width, int cap, int join, float miterLimit) {
        this(width, cap, join, miterLimit, null, 0f);
    }

    public BasicStroke(float width, int cap, int join, float miterLimit, float[] dash, float dashPhase) {
        this.width = width;
        this.cap = cap;
        this.join = join;
        this.miterLimit = miterLimit;
        this.dash = dash != null ? dash.clone() : null;
        this.dashPhase = dashPhase;
    }

    public float getLineWidth()  { return width; }
    public int getEndCap()       { return cap; }
    public int getLineJoin()     { return join; }
    public float getMiterLimit() { return miterLimit; }
    public float[] getDashArray() { return dash != null ? dash.clone() : null; }
    public float getDashPhase()  { return dashPhase; }

    @Override
    public Shape createStrokedShape(Shape p) {
        // Returning the source shape is the simplest semantically-valid response — the
        // outline is approximated as the shape itself. Most RuneLite use sites only
        // need stroke width to control fill behaviour.
        return p;
    }
}
