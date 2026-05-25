package java.awt.image;

public interface RenderedImage {
    int getWidth();
    int getHeight();
    int getMinX();
    int getMinY();
    int getNumXTiles();
    int getNumYTiles();
    int getMinTileX();
    int getMinTileY();
    int getTileWidth();
    int getTileHeight();
    int getTileGridXOffset();
    int getTileGridYOffset();
    ColorModel getColorModel();
    SampleModel getSampleModel();
    java.util.Vector<RenderedImage> getSources();
    Object getProperty(String name);
    String[] getPropertyNames();
    Raster getTile(int tileX, int tileY);
    Raster getData();
    Raster getData(java.awt.Rectangle rect);
    WritableRaster copyData(WritableRaster raster);
}
