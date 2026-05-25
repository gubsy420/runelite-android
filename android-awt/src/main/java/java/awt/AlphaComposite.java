package java.awt;

import java.awt.image.ColorModel;

public final class AlphaComposite implements Composite {
    public static final int CLEAR = 1;
    public static final int SRC = 2;
    public static final int DST = 9;
    public static final int SRC_OVER = 3;
    public static final int DST_OVER = 4;
    public static final int SRC_IN = 5;
    public static final int DST_IN = 6;
    public static final int SRC_OUT = 7;
    public static final int DST_OUT = 8;
    public static final int SRC_ATOP = 10;
    public static final int DST_ATOP = 11;
    public static final int XOR = 12;

    public static final AlphaComposite Clear   = new AlphaComposite(CLEAR, 1f);
    public static final AlphaComposite Src     = new AlphaComposite(SRC, 1f);
    public static final AlphaComposite Dst     = new AlphaComposite(DST, 1f);
    public static final AlphaComposite SrcOver = new AlphaComposite(SRC_OVER, 1f);
    public static final AlphaComposite DstOver = new AlphaComposite(DST_OVER, 1f);
    public static final AlphaComposite SrcIn   = new AlphaComposite(SRC_IN, 1f);
    public static final AlphaComposite DstIn   = new AlphaComposite(DST_IN, 1f);
    public static final AlphaComposite SrcOut  = new AlphaComposite(SRC_OUT, 1f);
    public static final AlphaComposite DstOut  = new AlphaComposite(DST_OUT, 1f);
    public static final AlphaComposite SrcAtop = new AlphaComposite(SRC_ATOP, 1f);
    public static final AlphaComposite DstAtop = new AlphaComposite(DST_ATOP, 1f);
    public static final AlphaComposite Xor     = new AlphaComposite(XOR, 1f);

    private final int rule;
    private final float alpha;

    private AlphaComposite(int rule, float alpha) {
        this.rule = rule;
        this.alpha = alpha;
    }

    public static AlphaComposite getInstance(int rule) {
        switch (rule) {
            case CLEAR: return Clear;
            case SRC:   return Src;
            case DST:   return Dst;
            case SRC_OVER: return SrcOver;
            case DST_OVER: return DstOver;
            case SRC_IN: return SrcIn;
            case DST_IN: return DstIn;
            case SRC_OUT: return SrcOut;
            case DST_OUT: return DstOut;
            case SRC_ATOP: return SrcAtop;
            case DST_ATOP: return DstAtop;
            case XOR: return Xor;
            default: throw new IllegalArgumentException("Unknown rule: " + rule);
        }
    }

    public static AlphaComposite getInstance(int rule, float alpha) {
        if (alpha < 0f || alpha > 1f) throw new IllegalArgumentException("alpha out of range: " + alpha);
        return new AlphaComposite(rule, alpha);
    }

    public int getRule()      { return rule; }
    public float getAlpha()   { return alpha; }
    public AlphaComposite derive(float newAlpha) { return new AlphaComposite(rule, newAlpha); }
    public AlphaComposite derive(int newRule) { return new AlphaComposite(newRule, alpha); }

    @Override
    public CompositeContext createContext(ColorModel srcCM, ColorModel dstCM, RenderingHints hints) {
        throw new UnsupportedOperationException("AlphaComposite contexts are implemented by the renderer");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof AlphaComposite) {
            AlphaComposite a = (AlphaComposite) obj;
            return rule == a.rule && alpha == a.alpha;
        }
        return false;
    }

    @Override public int hashCode() { return rule * 31 + Float.floatToIntBits(alpha); }
}
