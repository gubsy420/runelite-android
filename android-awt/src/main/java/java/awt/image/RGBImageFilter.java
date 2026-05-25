package java.awt.image;

public abstract class RGBImageFilter extends ImageFilter {
    protected ColorModel origmodel;
    protected ColorModel newmodel;
    protected boolean canFilterIndexColorModel;

    public abstract int filterRGB(int x, int y, int rgb);

    public void filterRGBPixels(int x, int y, int w, int h, int[] pixels, int off, int scansize) {
        for (int row = 0; row < h; row++) {
            for (int col = 0; col < w; col++) {
                int i = off + row * scansize + col;
                pixels[i] = filterRGB(x + col, y + row, pixels[i]);
            }
        }
    }
}
