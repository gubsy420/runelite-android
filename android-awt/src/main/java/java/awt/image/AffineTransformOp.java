package java.awt.image;

import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.RenderingHints;

public class AffineTransformOp implements BufferedImageOp {
    public static final int TYPE_NEAREST_NEIGHBOR = 1;
    public static final int TYPE_BILINEAR = 2;
    public static final int TYPE_BICUBIC = 3;

    private final AffineTransform transform;
    private final int interpolation;

    public AffineTransformOp(AffineTransform xform, int interpolation) {
        this.transform = new AffineTransform(xform);
        this.interpolation = interpolation;
    }

    public AffineTransformOp(AffineTransform xform, RenderingHints hints) {
        this(xform, TYPE_NEAREST_NEIGHBOR);
    }

    public int getInterpolationType() { return interpolation; }
    public AffineTransform getTransform() { return new AffineTransform(transform); }

    @Override
    public BufferedImage filter(BufferedImage src, BufferedImage dest) {
        BufferedImage out = (dest != null) ? dest
            : new BufferedImage(src.getWidth(), src.getHeight(), BufferedImage.TYPE_INT_ARGB);
        Graphics2D g = out.createGraphics();
        try { g.drawImage(src, transform, null); } finally { g.dispose(); }
        return out;
    }

    @Override
    public Rectangle2D getBounds2D(BufferedImage src) {
        return new Rectangle2D.Float(0, 0, src.getWidth(), src.getHeight());
    }

    @Override
    public BufferedImage createCompatibleDestImage(BufferedImage src, ColorModel destCM) {
        ColorModel cm = (destCM != null) ? destCM : src.getColorModel();
        return new BufferedImage(src.getWidth(), src.getHeight(), BufferedImage.TYPE_INT_ARGB);
    }

    @Override
    public Point2D getPoint2D(Point2D srcPt, Point2D dstPt) {
        if (dstPt == null) dstPt = new Point2D.Double();
        dstPt.setLocation(srcPt.getX(), srcPt.getY());
        return dstPt;
    }

    @Override
    public RenderingHints getRenderingHints() {
        return null;
    }
}
