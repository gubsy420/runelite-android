package java.awt;

import java.awt.image.Raster;
import java.awt.image.WritableRaster;

public interface CompositeContext {
    void dispose();
    void compose(Raster src, Raster dstIn, WritableRaster dstOut);
}
