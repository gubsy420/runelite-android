package java.awt.image;

import java.awt.Point;
import java.awt.Rectangle;

public class Raster {
    protected SampleModel sampleModel;
    protected DataBuffer dataBuffer;
    protected int minX;
    protected int minY;
    protected int width;
    protected int height;
    protected int sampleModelTranslateX;
    protected int sampleModelTranslateY;
    protected int numBands;
    protected int numDataElements;
    protected Raster parent;

    protected Raster(SampleModel sm, Point origin) {
        this(sm, sm.createDataBuffer(), new Rectangle(origin.x, origin.y, sm.getWidth(), sm.getHeight()), origin, null);
    }

    protected Raster(SampleModel sm, DataBuffer db, Point origin) {
        this(sm, db, new Rectangle(origin.x, origin.y, sm.getWidth(), sm.getHeight()), origin, null);
    }

    protected Raster(SampleModel sm, DataBuffer db, Rectangle aRegion, Point sampleModelTranslate, Raster parent) {
        this.sampleModel = sm;
        this.dataBuffer = db;
        this.minX = aRegion.x;
        this.minY = aRegion.y;
        this.width = aRegion.width;
        this.height = aRegion.height;
        this.sampleModelTranslateX = sampleModelTranslate.x;
        this.sampleModelTranslateY = sampleModelTranslate.y;
        this.numBands = sm.getNumBands();
        this.numDataElements = sm.getNumDataElements();
        this.parent = parent;
    }

    public static WritableRaster createWritableRaster(SampleModel sm, DataBuffer db, Point location) {
        Point loc = (location == null) ? new Point(0, 0) : location;
        return new WritableRaster(sm, db, new Rectangle(loc.x, loc.y, sm.getWidth(), sm.getHeight()), loc, null);
    }

    public static WritableRaster createWritableRaster(SampleModel sm, Point location) {
        return createWritableRaster(sm, sm.createDataBuffer(), location);
    }

    public SampleModel getSampleModel() { return sampleModel; }
    public DataBuffer getDataBuffer()   { return dataBuffer; }
    public int getMinX()                { return minX; }
    public int getMinY()                { return minY; }
    public int getWidth()               { return width; }
    public int getHeight()              { return height; }
    public int getNumBands()            { return numBands; }
    public int getNumDataElements()     { return numDataElements; }
    public int getSampleModelTranslateX() { return sampleModelTranslateX; }
    public int getSampleModelTranslateY() { return sampleModelTranslateY; }
    public Raster getParent()           { return parent; }

    public Rectangle getBounds() {
        return new Rectangle(minX, minY, width, height);
    }

    public int getSample(int x, int y, int b) {
        return sampleModel.getSample(x - sampleModelTranslateX, y - sampleModelTranslateY, b, dataBuffer);
    }

    public int[] getPixel(int x, int y, int[] iArray) {
        return sampleModel.getPixel(x - sampleModelTranslateX, y - sampleModelTranslateY, iArray, dataBuffer);
    }
}
