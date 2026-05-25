package java.awt;

public abstract class GraphicsConfiguration {
    protected GraphicsConfiguration() {
    }

    public GraphicsDevice getDevice() { return null; }
    public java.awt.image.ColorModel getColorModel() { return null; }
    public java.awt.image.ColorModel getColorModel(int transparency) { return null; }
    public java.awt.geom.AffineTransform getDefaultTransform() { return new java.awt.geom.AffineTransform(); }
    public java.awt.geom.AffineTransform getNormalizingTransform() { return new java.awt.geom.AffineTransform(); }
    public Rectangle getBounds() { return new Rectangle(0, 0, 0, 0); }
}
