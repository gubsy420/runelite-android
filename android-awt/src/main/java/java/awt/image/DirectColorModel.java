package java.awt.image;

import java.awt.Transparency;
import java.awt.color.ColorSpace;

public class DirectColorModel extends ColorModel {
    private final int redMask;
    private final int greenMask;
    private final int blueMask;
    private final int alphaMask;
    private final int redShift;
    private final int greenShift;
    private final int blueShift;
    private final int alphaShift;

    public DirectColorModel(int bits, int rmask, int gmask, int bmask) {
        this(bits, rmask, gmask, bmask, 0);
    }

    public DirectColorModel(int bits, int rmask, int gmask, int bmask, int amask) {
        this(ColorSpace.getInstance(ColorSpace.CS_sRGB), bits, rmask, gmask, bmask, amask, false, DataBuffer.TYPE_INT);
    }

    public DirectColorModel(ColorSpace space, int bits, int rmask, int gmask, int bmask, int amask,
                            boolean isAlphaPremultiplied, int transferType) {
        super(bits, computeBitSizes(rmask, gmask, bmask, amask),
            space, amask != 0,
            isAlphaPremultiplied,
            amask == 0 ? Transparency.OPAQUE : Transparency.TRANSLUCENT,
            transferType);
        this.redMask = rmask;
        this.greenMask = gmask;
        this.blueMask = bmask;
        this.alphaMask = amask;
        this.redShift = trailingZeros(rmask);
        this.greenShift = trailingZeros(gmask);
        this.blueShift = trailingZeros(bmask);
        this.alphaShift = amask == 0 ? 0 : trailingZeros(amask);
    }

    public final int getRedMask()   { return redMask; }
    public final int getGreenMask() { return greenMask; }
    public final int getBlueMask()  { return blueMask; }
    public final int getAlphaMask() { return alphaMask; }

    @Override
    public int getRed(int pixel) {
        return (pixel & redMask) >>> redShift;
    }

    @Override
    public int getGreen(int pixel) {
        return (pixel & greenMask) >>> greenShift;
    }

    @Override
    public int getBlue(int pixel) {
        return (pixel & blueMask) >>> blueShift;
    }

    @Override
    public int getAlpha(int pixel) {
        return alphaMask == 0 ? 255 : ((pixel & alphaMask) >>> alphaShift);
    }

    @Override
    public int getRGB(int pixel) {
        return (getAlpha(pixel) << 24) | (getRed(pixel) << 16) | (getGreen(pixel) << 8) | getBlue(pixel);
    }

    @Override
    public SampleModel createCompatibleSampleModel(int w, int h) {
        int[] masks = alphaMask == 0
            ? new int[]{redMask, greenMask, blueMask}
            : new int[]{redMask, greenMask, blueMask, alphaMask};
        return new SinglePixelPackedSampleModel(transferType, w, h, masks);
    }

    private static int trailingZeros(int mask) {
        if (mask == 0) return 0;
        int n = 0;
        while ((mask & 1) == 0) { mask >>>= 1; n++; }
        return n;
    }

    private static int[] computeBitSizes(int rm, int gm, int bm, int am) {
        int[] out = am == 0 ? new int[3] : new int[4];
        out[0] = bitCount(rm);
        out[1] = bitCount(gm);
        out[2] = bitCount(bm);
        if (am != 0) out[3] = bitCount(am);
        return out;
    }

    private static int bitCount(int mask) {
        int n = 0;
        while (mask != 0) { if ((mask & 1) != 0) n++; mask >>>= 1; }
        return n;
    }
}
