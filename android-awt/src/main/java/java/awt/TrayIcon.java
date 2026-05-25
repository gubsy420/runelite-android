package java.awt;

import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class TrayIcon {
    public enum MessageType {
        ERROR, WARNING, INFO, NONE
    }

    private Image image;
    private String tooltip;

    public TrayIcon(Image image) { this.image = image; }
    public TrayIcon(Image image, String tooltip) { this.image = image; this.tooltip = tooltip; }
    public TrayIcon(Image image, String tooltip, PopupMenu popup) {
        this.image = image; this.tooltip = tooltip;
    }

    public Image getImage() { return image; }
    public void setImage(Image image) { this.image = image; }
    public String getToolTip() { return tooltip; }
    public void setToolTip(String tooltip) { this.tooltip = tooltip; }
    public void displayMessage(String caption, String text, MessageType type) {}

    public void addActionListener(ActionListener l) {}
    public void removeActionListener(ActionListener l) {}
    public void addMouseListener(MouseListener l) {}
    public void removeMouseListener(MouseListener l) {}
    public void addMouseMotionListener(MouseMotionListener l) {}
    public void removeMouseMotionListener(MouseMotionListener l) {}
}
