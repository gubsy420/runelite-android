package javax.swing;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.Serializable;
import java.net.URL;

public class ImageIcon implements Icon, Serializable {
    private static final long serialVersionUID = 532615968316031762L;

    private Image image;
    private String description;

    public ImageIcon() {}
    public ImageIcon(Image image) { this.image = image; }
    public ImageIcon(Image image, String description) { this.image = image; this.description = description; }
    public ImageIcon(String filename) { this.image = loadFile(filename); }
    public ImageIcon(String filename, String description) { this.image = loadFile(filename); this.description = description; }
    public ImageIcon(URL location) { this.image = loadUrl(location); }
    public ImageIcon(URL location, String description) { this.image = loadUrl(location); this.description = description; }
    public ImageIcon(byte[] imageData) { this.image = loadBytes(imageData); }
    public ImageIcon(byte[] imageData, String description) { this.image = loadBytes(imageData); this.description = description; }

    /** Path / URL / byte-array decodes go through ImageIO. Real Swing also
     *  tolerates a missing file (returns an Icon whose dims are -1); we keep
     *  the same forgiving behaviour so callers that pass a bad path don't
     *  crash — the symptom is just a missing icon. Without these constructors
     *  actually decoding anything, every {@code new ImageIcon(path)} site (and
     *  RuneLite has plenty) silently produced an empty icon. */
    private static Image loadFile(String filename) {
        if (filename == null) return null;
        try { return javax.imageio.ImageIO.read(new java.io.File(filename)); }
        catch (Throwable ignored) { return null; }
    }

    private static Image loadUrl(URL location) {
        if (location == null) return null;
        try { return javax.imageio.ImageIO.read(location); }
        catch (Throwable ignored) { return null; }
    }

    private static Image loadBytes(byte[] data) {
        if (data == null || data.length == 0) return null;
        try { return javax.imageio.ImageIO.read(new java.io.ByteArrayInputStream(data)); }
        catch (Throwable ignored) { return null; }
    }

    public Image getImage() { return image; }
    public void setImage(Image image) { this.image = image; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    @Override
    public int getIconWidth() {
        return image == null ? -1 : image.getWidth(null);
    }

    @Override
    public int getIconHeight() {
        return image == null ? -1 : image.getHeight(null);
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        if (image != null) g.drawImage(image, x, y, c);
    }
}
