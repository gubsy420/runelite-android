package java.awt.color;

import java.io.Serializable;

public abstract class ColorSpace implements Serializable {
    private static final long serialVersionUID = -409452704308689724L;

    public static final int TYPE_XYZ = 0;
    public static final int TYPE_Lab = 1;
    public static final int TYPE_Luv = 2;
    public static final int TYPE_YCbCr = 3;
    public static final int TYPE_Yxy = 4;
    public static final int TYPE_RGB = 5;
    public static final int TYPE_GRAY = 6;
    public static final int TYPE_HSV = 7;
    public static final int TYPE_HLS = 8;
    public static final int TYPE_CMYK = 9;
    public static final int TYPE_CMY = 11;
    public static final int TYPE_2CLR = 12;
    public static final int TYPE_3CLR = 13;
    public static final int TYPE_4CLR = 14;
    public static final int TYPE_5CLR = 15;
    public static final int TYPE_6CLR = 16;
    public static final int TYPE_7CLR = 17;
    public static final int TYPE_8CLR = 18;
    public static final int TYPE_9CLR = 19;
    public static final int TYPE_ACLR = 20;
    public static final int TYPE_BCLR = 21;
    public static final int TYPE_CCLR = 22;
    public static final int TYPE_DCLR = 23;
    public static final int TYPE_ECLR = 24;
    public static final int TYPE_FCLR = 25;

    public static final int CS_sRGB = 1000;
    public static final int CS_LINEAR_RGB = 1004;
    public static final int CS_CIEXYZ = 1001;
    public static final int CS_PYCC = 1002;
    public static final int CS_GRAY = 1003;

    private final int type;
    private final int numComponents;

    protected ColorSpace(int type, int numComponents) {
        this.type = type;
        this.numComponents = numComponents;
    }

    public static ColorSpace getInstance(int colorspace) {
        switch (colorspace) {
            case CS_sRGB:
            case CS_LINEAR_RGB:
                return SRGB;
            case CS_GRAY:
                return GRAY;
            case CS_CIEXYZ:
            case CS_PYCC:
                return CIEXYZ;
            default:
                throw new IllegalArgumentException("Unknown color space: " + colorspace);
        }
    }

    public int getType() {
        return type;
    }

    public int getNumComponents() {
        return numComponents;
    }

    public boolean isCS_sRGB() {
        return this == SRGB;
    }

    public String getName(int idx) {
        if (idx < 0 || idx >= numComponents) {
            throw new IllegalArgumentException("Component index out of range: " + idx);
        }
        return "Unnamed";
    }

    public float getMinValue(int component) {
        if (component < 0 || component >= numComponents) {
            throw new IllegalArgumentException("Component index out of range: " + component);
        }
        return 0f;
    }

    public float getMaxValue(int component) {
        if (component < 0 || component >= numComponents) {
            throw new IllegalArgumentException("Component index out of range: " + component);
        }
        return 1f;
    }

    public abstract float[] toRGB(float[] colorvalue);
    public abstract float[] fromRGB(float[] rgbvalue);
    public abstract float[] toCIEXYZ(float[] colorvalue);
    public abstract float[] fromCIEXYZ(float[] colorvalue);

    // sRGB singleton — RuneLite only needs identity transforms over sRGB.
    private static final ColorSpace SRGB = new SimpleColorSpace(TYPE_RGB, 3);
    private static final ColorSpace GRAY = new SimpleColorSpace(TYPE_GRAY, 1);
    private static final ColorSpace CIEXYZ = new SimpleColorSpace(TYPE_XYZ, 3);

    private static final class SimpleColorSpace extends ColorSpace {
        private static final long serialVersionUID = 1L;

        SimpleColorSpace(int type, int n) {
            super(type, n);
        }

        @Override public float[] toRGB(float[] v) { return v.clone(); }
        @Override public float[] fromRGB(float[] v) { return v.clone(); }
        @Override public float[] toCIEXYZ(float[] v) { return v.clone(); }
        @Override public float[] fromCIEXYZ(float[] v) { return v.clone(); }
    }
}
