package java.awt.image;

import java.awt.Image;

/**
 * Minimal PixelGrabber. RuneLite uses it to read an int[] from a BufferedImage; we
 * shortcut to the backing array when possible.
 */
public class PixelGrabber {
    private final Image image;
    private final int x, y, width, height;
    private final int[] pixels;
    private final int offset;
    private final int scansize;

    public PixelGrabber(Image img, int x, int y, int w, int h, int[] pix, int off, int scansize) {
        this.image = img;
        this.x = x;
        this.y = y;
        this.width = w;
        this.height = h;
        this.pixels = pix;
        this.offset = off;
        this.scansize = scansize;
    }

    public PixelGrabber(Image img, int x, int y, int w, int h, boolean forceRGB) {
        this(img, x, y, w, h, null, 0, w);
    }

    public boolean grabPixels() {
        return grabPixels(0L);
    }

    public boolean grabPixels(long ms) {
        if (image instanceof BufferedImage) {
            BufferedImage bi = (BufferedImage) image;
            if (pixels != null) {
                bi.getRGB(x, y, width, height, pixels, offset, scansize);
            }
            return true;
        }
        return false;
    }

    public int getStatus() {
        return ImageObserver.ALLBITS;
    }

    public int getWidth()  { return width; }
    public int getHeight() { return height; }
    public Object getPixels() { return pixels; }
    public ColorModel getColorModel() { return null; }
    public void setColorModel(ColorModel cm) {}
    public void setDimensions(int w, int h) {}
    public void setHints(int hints) {}
    public void setProperties(java.util.Hashtable<?, ?> props) {}
    public void setPixels(int srcX, int srcY, int srcW, int srcH, ColorModel m, byte[] pix, int off, int scansize) {}
    public void setPixels(int srcX, int srcY, int srcW, int srcH, ColorModel m, int[] pix, int off, int scansize) {}
    public void imageComplete(int status) {}
}
