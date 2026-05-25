package java.awt.image;

import java.awt.Transparency;
import java.awt.color.ColorSpace;

public abstract class ColorModel implements Transparency {
    protected int pixel_bits;
    protected int transferType;
    private final int numComponents;
    private final int numColorComponents;
    private final boolean hasAlpha;
    private final boolean isAlphaPremultiplied;
    private final int transparency;
    private final ColorSpace colorSpace;

    public ColorModel(int bits) {
        this(bits, new int[]{8, 8, 8, 8}, ColorSpace.getInstance(ColorSpace.CS_sRGB),
            true, false, Transparency.TRANSLUCENT, DataBuffer.TYPE_INT);
    }

    protected ColorModel(int pixel_bits, int[] bits, ColorSpace cspace, boolean hasAlpha,
                         boolean isAlphaPremultiplied, int transparency, int transferType) {
        this.pixel_bits = pixel_bits;
        this.transferType = transferType;
        this.numColorComponents = cspace.getNumComponents();
        this.numComponents = numColorComponents + (hasAlpha ? 1 : 0);
        this.hasAlpha = hasAlpha;
        this.isAlphaPremultiplied = isAlphaPremultiplied;
        this.transparency = transparency;
        this.colorSpace = cspace;
    }

    public final int getPixelSize()       { return pixel_bits; }
    public final ColorSpace getColorSpace() { return colorSpace; }
    public final int getNumComponents()   { return numComponents; }
    public final int getNumColorComponents() { return numColorComponents; }
    public final boolean hasAlpha()       { return hasAlpha; }
    public final boolean isAlphaPremultiplied() { return isAlphaPremultiplied; }
    @Override public final int getTransparency() { return transparency; }
    public final int getTransferType()    { return transferType; }

    public abstract int getRed(int pixel);
    public abstract int getGreen(int pixel);
    public abstract int getBlue(int pixel);
    public abstract int getAlpha(int pixel);

    public int getRGB(int pixel) {
        return (getAlpha(pixel) << 24) | (getRed(pixel) << 16) | (getGreen(pixel) << 8) | getBlue(pixel);
    }

    public boolean isCompatibleRaster(Raster raster) {
        return true;
    }

    public WritableRaster createCompatibleWritableRaster(int w, int h) {
        SampleModel sm = createCompatibleSampleModel(w, h);
        return Raster.createWritableRaster(sm, sm.createDataBuffer(), new java.awt.Point(0, 0));
    }

    public SampleModel createCompatibleSampleModel(int w, int h) {
        throw new UnsupportedOperationException("Subclasses must override createCompatibleSampleModel");
    }
}
