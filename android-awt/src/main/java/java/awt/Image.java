package java.awt;

import java.awt.image.ImageObserver;

public abstract class Image {
    public static final int SCALE_DEFAULT      = 1;
    public static final int SCALE_FAST         = 2;
    public static final int SCALE_SMOOTH       = 4;
    public static final int SCALE_REPLICATE    = 8;
    public static final int SCALE_AREA_AVERAGING = 16;

    public static final Object UndefinedProperty = new Object();

    public abstract int getWidth(ImageObserver observer);
    public abstract int getHeight(ImageObserver observer);
    public abstract Graphics getGraphics();

    public Object getProperty(String name, ImageObserver observer) {
        return UndefinedProperty;
    }

    public Image getScaledInstance(int width, int height, int hints) {
        // RuneLite doesn't appear to call this; return self as a graceful fallback.
        return this;
    }

    public void flush() {
    }
}
