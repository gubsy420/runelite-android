package java.awt.image;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.ImageCapabilities;
import java.awt.Transparency;

public abstract class VolatileImage extends Image implements Transparency {
    public static final int IMAGE_OK = 0;
    public static final int IMAGE_RESTORED = 1;
    public static final int IMAGE_INCOMPATIBLE = 2;

    protected int transparency = OPAQUE;

    public abstract BufferedImage getSnapshot();
    public abstract int getWidth();
    public abstract int getHeight();
    public abstract Graphics2D createGraphics();
    public abstract int validate(java.awt.GraphicsConfiguration gc);
    public abstract boolean contentsLost();
    public abstract ImageCapabilities getCapabilities();

    @Override public int getWidth(ImageObserver observer) { return getWidth(); }
    @Override public int getHeight(ImageObserver observer) { return getHeight(); }

    @Override public int getTransparency() { return transparency; }
}
