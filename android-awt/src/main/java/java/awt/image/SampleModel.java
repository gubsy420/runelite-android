package java.awt.image;

public abstract class SampleModel {
    protected int width;
    protected int height;
    protected int numBands;
    protected int dataType;

    public SampleModel(int dataType, int w, int h, int numBands) {
        if (w <= 0 || h <= 0) {
            throw new IllegalArgumentException("Width and height must be > 0");
        }
        this.dataType = dataType;
        this.width = w;
        this.height = h;
        this.numBands = numBands;
    }

    public final int getWidth()    { return width; }
    public final int getHeight()   { return height; }
    public final int getNumBands() { return numBands; }
    public final int getDataType() { return dataType; }
    public abstract int getNumDataElements();

    public abstract int getSampleSize(int band);
    public abstract int[] getSampleSize();

    public abstract int getSample(int x, int y, int b, DataBuffer data);
    public abstract void setSample(int x, int y, int b, int s, DataBuffer data);

    public int[] getPixel(int x, int y, int[] iArray, DataBuffer data) {
        int[] pixel = (iArray == null) ? new int[numBands] : iArray;
        for (int i = 0; i < numBands; i++) {
            pixel[i] = getSample(x, y, i, data);
        }
        return pixel;
    }

    public void setPixel(int x, int y, int[] iArray, DataBuffer data) {
        for (int i = 0; i < numBands; i++) {
            setSample(x, y, i, iArray[i], data);
        }
    }

    public abstract SampleModel createCompatibleSampleModel(int w, int h);

    public abstract DataBuffer createDataBuffer();

    public abstract int[] getSampleSize(int band, int[] iArray);
}
