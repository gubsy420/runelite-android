package java.awt.image;

import java.awt.Point;
import java.awt.Rectangle;

public class WritableRaster extends Raster {
    protected WritableRaster(SampleModel sm, Point origin) {
        super(sm, origin);
    }

    protected WritableRaster(SampleModel sm, DataBuffer db, Point origin) {
        super(sm, db, origin);
    }

    protected WritableRaster(SampleModel sm, DataBuffer db, Rectangle aRegion, Point sampleModelTranslate, WritableRaster parent) {
        super(sm, db, aRegion, sampleModelTranslate, parent);
    }

    public void setSample(int x, int y, int b, int s) {
        sampleModel.setSample(x - sampleModelTranslateX, y - sampleModelTranslateY, b, s, dataBuffer);
    }

    public void setPixel(int x, int y, int[] iArray) {
        sampleModel.setPixel(x - sampleModelTranslateX, y - sampleModelTranslateY, iArray, dataBuffer);
    }

    public void setPixels(int x, int y, int w, int h, int[] iArray) {
        int offset = 0;
        for (int row = 0; row < h; row++) {
            for (int col = 0; col < w; col++) {
                for (int b = 0; b < numBands; b++) {
                    setSample(x + col, y + row, b, iArray[offset++]);
                }
            }
        }
    }
}
