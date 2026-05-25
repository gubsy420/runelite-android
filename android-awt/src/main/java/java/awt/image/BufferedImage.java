package java.awt.image;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.util.Hashtable;

import net.runelite.awt.impl.BufferedImageGraphics2D;

/**
 * Pixel-buffer-backed image. ARGB pixels live in an {@code int[]} (one int per pixel)
 * inside a {@link DataBufferInt}, so JNI hot paths can pin the array via
 * {@code GetPrimitiveArrayCritical} for zero-copy access from Rust.
 */
public class BufferedImage extends Image {
    public static final int TYPE_CUSTOM        = 0;
    public static final int TYPE_INT_RGB       = 1;
    public static final int TYPE_INT_ARGB      = 2;
    public static final int TYPE_INT_ARGB_PRE  = 3;
    public static final int TYPE_INT_BGR       = 4;
    public static final int TYPE_3BYTE_BGR     = 5;
    public static final int TYPE_4BYTE_ABGR    = 6;
    public static final int TYPE_4BYTE_ABGR_PRE = 7;
    public static final int TYPE_USHORT_565_RGB = 8;
    public static final int TYPE_USHORT_555_RGB = 9;
    public static final int TYPE_BYTE_GRAY     = 10;
    public static final int TYPE_USHORT_GRAY   = 11;
    public static final int TYPE_BYTE_BINARY   = 12;
    public static final int TYPE_BYTE_INDEXED  = 13;

    private final int imageType;
    private final ColorModel colorModel;
    private final WritableRaster raster;
    private final Hashtable<?, ?> properties;
    private final int[] pixels;

    public BufferedImage(int width, int height, int imageType) {
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("BufferedImage dimensions must be > 0");
        }
        this.imageType = imageType;
        this.pixels = new int[width * height];
        this.colorModel = colorModelFor(imageType);
        DataBufferInt db = new DataBufferInt(pixels, width * height);
        int[] masks = masksFor(imageType);
        SampleModel sm = new SinglePixelPackedSampleModel(DataBuffer.TYPE_INT, width, height, masks);
        this.raster = Raster.createWritableRaster(sm, db, new java.awt.Point(0, 0));
        this.properties = null;
    }

    public BufferedImage(ColorModel cm, WritableRaster raster, boolean isRasterPremultiplied, Hashtable<?, ?> properties) {
        this.colorModel = cm;
        this.raster = raster;
        this.properties = properties;
        this.imageType = TYPE_CUSTOM;
        DataBuffer db = raster.getDataBuffer();
        if (db instanceof DataBufferInt) {
            this.pixels = ((DataBufferInt) db).getData();
        } else {
            this.pixels = null;
        }
    }

    public int getType()           { return imageType; }
    public ColorModel getColorModel() { return colorModel; }
    public WritableRaster getRaster() { return raster; }
    public int getWidth()          { return raster.getWidth(); }
    public int getHeight()         { return raster.getHeight(); }

    @Override public int getWidth(ImageObserver observer)  { return getWidth(); }
    @Override public int getHeight(ImageObserver observer) { return getHeight(); }

    /** Direct pixel buffer (TYPE_INT_* images only). Mutating it mutates the image. */
    public int[] backingArray() {
        return pixels;
    }

    public int getRGB(int x, int y) {
        if (pixels != null) return pixels[y * getWidth() + x];
        return colorModel.getRGB(raster.getSample(x, y, 0));
    }

    public void setRGB(int x, int y, int rgb) {
        if (pixels != null) pixels[y * getWidth() + x] = rgb;
        else raster.setSample(x, y, 0, rgb);
    }

    public int[] getRGB(int startX, int startY, int w, int h, int[] rgbArray, int offset, int scansize) {
        int[] out = (rgbArray == null) ? new int[offset + h * scansize] : rgbArray;
        int width = getWidth();
        for (int y = 0; y < h; y++) {
            int dst = offset + y * scansize;
            int src = (startY + y) * width + startX;
            if (pixels != null) {
                System.arraycopy(pixels, src, out, dst, w);
            } else {
                for (int x = 0; x < w; x++) {
                    out[dst + x] = getRGB(startX + x, startY + y);
                }
            }
        }
        return out;
    }

    public void setRGB(int startX, int startY, int w, int h, int[] rgbArray, int offset, int scansize) {
        int width = getWidth();
        for (int y = 0; y < h; y++) {
            int src = offset + y * scansize;
            int dst = (startY + y) * width + startX;
            if (pixels != null) {
                System.arraycopy(rgbArray, src, pixels, dst, w);
            } else {
                for (int x = 0; x < w; x++) {
                    setRGB(startX + x, startY + y, rgbArray[src + x]);
                }
            }
        }
    }

    @Override
    public Graphics getGraphics() {
        return createGraphics();
    }

    /**
     * Returns a sub-region as a new BufferedImage backed by a fresh int[] copy.
     * (The JDK's getSubimage shares the underlying raster with the parent; we copy
     * because our backing-array contract assumes one BufferedImage per int[].)
     */
    public BufferedImage getSubimage(int x, int y, int w, int h) {
        if (x < 0 || y < 0 || w <= 0 || h <= 0
            || x + w > getWidth() || y + h > getHeight()) {
            throw new IllegalArgumentException("getSubimage(" + x + "," + y + "," + w + "," + h
                + ") out of bounds for " + getWidth() + "x" + getHeight());
        }
        BufferedImage sub = new BufferedImage(w, h, imageType == TYPE_CUSTOM ? TYPE_INT_ARGB : imageType);
        int[] dst = sub.backingArray();
        int srcWidth = getWidth();
        if (pixels != null && dst != null) {
            for (int row = 0; row < h; row++) {
                System.arraycopy(pixels, (y + row) * srcWidth + x, dst, row * w, w);
            }
        } else {
            for (int row = 0; row < h; row++) {
                for (int col = 0; col < w; col++) {
                    sub.setRGB(col, row, getRGB(x + col, y + row));
                }
            }
        }
        return sub;
    }

    public Graphics2D createGraphics() {
        return new BufferedImageGraphics2D(this);
    }

    public Object getProperty(String name) {
        return UndefinedProperty;
    }

    private static ColorModel colorModelFor(int type) {
        switch (type) {
            case TYPE_INT_RGB:
                return new DirectColorModel(24, 0x00FF0000, 0x0000FF00, 0x000000FF);
            case TYPE_INT_ARGB:
            case TYPE_INT_ARGB_PRE:
                return new DirectColorModel(32, 0x00FF0000, 0x0000FF00, 0x000000FF, 0xFF000000);
            case TYPE_INT_BGR:
                return new DirectColorModel(24, 0x000000FF, 0x0000FF00, 0x00FF0000);
            default:
                return new DirectColorModel(32, 0x00FF0000, 0x0000FF00, 0x000000FF, 0xFF000000);
        }
    }

    private static int[] masksFor(int type) {
        switch (type) {
            case TYPE_INT_RGB:  return new int[]{0x00FF0000, 0x0000FF00, 0x000000FF};
            case TYPE_INT_ARGB:
            case TYPE_INT_ARGB_PRE: return new int[]{0x00FF0000, 0x0000FF00, 0x000000FF, 0xFF000000};
            case TYPE_INT_BGR:  return new int[]{0x000000FF, 0x0000FF00, 0x00FF0000};
            default:            return new int[]{0x00FF0000, 0x0000FF00, 0x000000FF, 0xFF000000};
        }
    }
}
