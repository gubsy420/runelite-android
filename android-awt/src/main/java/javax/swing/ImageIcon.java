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
    public ImageIcon(String filename) {}
    public ImageIcon(String filename, String description) { this.description = description; }
    public ImageIcon(URL location) {}
    public ImageIcon(URL location, String description) { this.description = description; }
    public ImageIcon(byte[] imageData) {}
    public ImageIcon(byte[] imageData, String description) { this.description = description; }

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
