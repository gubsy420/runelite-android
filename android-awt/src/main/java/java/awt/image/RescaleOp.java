package java.awt.image;

import java.awt.RenderingHints;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

/**
 * RescaleOp: applies scale + offset per band. Implementation re-scales ARGB int pixels
 * directly; alpha is preserved (so a tinted button overlay still respects transparency).
 */
public class RescaleOp implements BufferedImageOp {
    private final float[] scaleFactors;
    private final float[] offsets;

    public RescaleOp(float[] scaleFactors, float[] offsets, RenderingHints hints) {
        this.scaleFactors = scaleFactors.clone();
        this.offsets = offsets.clone();
    }

    public RescaleOp(float scaleFactor, float offset, RenderingHints hints) {
        this(new float[]{scaleFactor}, new float[]{offset}, hints);
    }

    public final float[] getScaleFactors(float[] dst) {
        if (dst == null) dst = new float[scaleFactors.length];
        System.arraycopy(scaleFactors, 0, dst, 0, scaleFactors.length);
        return dst;
    }

    public final float[] getOffsets(float[] dst) {
        if (dst == null) dst = new float[offsets.length];
        System.arraycopy(offsets, 0, dst, 0, offsets.length);
        return dst;
    }

    public final int getNumFactors() { return scaleFactors.length; }

    @Override
    public BufferedImage filter(BufferedImage src, BufferedImage dest) {
        BufferedImage out = (dest != null) ? dest
            : new BufferedImage(src.getWidth(), src.getHeight(), BufferedImage.TYPE_INT_ARGB);
        int[] srcPx = src.backingArray();
        int[] dstPx = out.backingArray();
        if (srcPx == null || dstPx == null) return out;
        float[] s = scaleFactors;
        float[] o = offsets;
        for (int i = 0; i < srcPx.length && i < dstPx.length; i++) {
            int p = srcPx[i];
            int a = (p >>> 24) & 0xFF;
            int r = (p >>> 16) & 0xFF;
            int g = (p >>> 8) & 0xFF;
            int b = p & 0xFF;
            r = clamp((int) (r * s[0] + o[0]));
            g = clamp((int) (g * (s.length > 1 ? s[1] : s[0]) + (o.length > 1 ? o[1] : o[0])));
            b = clamp((int) (b * (s.length > 2 ? s[2] : s[0]) + (o.length > 2 ? o[2] : o[0])));
            if (s.length > 3) a = clamp((int) (a * s[3] + o[3]));
            dstPx[i] = (a << 24) | (r << 16) | (g << 8) | b;
        }
        return out;
    }

    private static int clamp(int v) { return v < 0 ? 0 : (v > 255 ? 255 : v); }

    @Override public Rectangle2D getBounds2D(BufferedImage src) { return new Rectangle2D.Float(0, 0, src.getWidth(), src.getHeight()); }
    @Override public BufferedImage createCompatibleDestImage(BufferedImage src, ColorModel destCM) {
        return new BufferedImage(src.getWidth(), src.getHeight(), BufferedImage.TYPE_INT_ARGB);
    }
    @Override public Point2D getPoint2D(Point2D srcPt, Point2D dstPt) {
        if (dstPt == null) dstPt = new Point2D.Double();
        dstPt.setLocation(srcPt.getX(), srcPt.getY());
        return dstPt;
    }
    @Override public RenderingHints getRenderingHints() { return null; }
}
