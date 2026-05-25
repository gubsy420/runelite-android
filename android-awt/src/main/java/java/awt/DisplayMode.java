package java.awt;

public final class DisplayMode {
    public static final int BIT_DEPTH_MULTI = -1;
    public static final int REFRESH_RATE_UNKNOWN = 0;

    private final int width, height, bitDepth, refreshRate;

    public DisplayMode(int width, int height, int bitDepth, int refreshRate) {
        this.width = width; this.height = height; this.bitDepth = bitDepth; this.refreshRate = refreshRate;
    }

    public int getWidth()       { return width; }
    public int getHeight()      { return height; }
    public int getBitDepth()    { return bitDepth; }
    public int getRefreshRate() { return refreshRate; }

    @Override public boolean equals(Object dm) {
        if (!(dm instanceof DisplayMode)) return false;
        DisplayMode o = (DisplayMode) dm;
        return width == o.width && height == o.height && bitDepth == o.bitDepth && refreshRate == o.refreshRate;
    }
    @Override public int hashCode() { return width + height + bitDepth + refreshRate; }
}
