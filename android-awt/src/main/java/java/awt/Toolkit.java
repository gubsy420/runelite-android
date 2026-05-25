package java.awt;

import java.awt.datatransfer.Clipboard;
import java.awt.image.ColorModel;
import java.awt.image.ImageObserver;

public abstract class Toolkit {
    private static Toolkit defaultToolkit;
    private final EventQueue eventQueue = new EventQueue();
    private final Clipboard clipboard = new Clipboard("system");

    protected Toolkit() {
    }

    public static synchronized Toolkit getDefaultToolkit() {
        if (defaultToolkit == null) {
            defaultToolkit = new HeadlessToolkit();
        }
        return defaultToolkit;
    }

    public Clipboard getSystemClipboard() {
        return clipboard;
    }

    public EventQueue getSystemEventQueue() {
        return eventQueue;
    }

    public Dimension getScreenSize() {
        return new Dimension(0, 0);
    }

    public int getScreenResolution() {
        return 96;
    }

    public ColorModel getColorModel() {
        return new java.awt.image.DirectColorModel(32, 0x00FF0000, 0x0000FF00, 0x000000FF, 0xFF000000);
    }

    public String[] getFontList() {
        return new String[]{Font.DIALOG, Font.SANS_SERIF, Font.SERIF, Font.MONOSPACED};
    }

    public Image createImage(int[] pixels, int width, int height) {
        java.awt.image.BufferedImage bi = new java.awt.image.BufferedImage(
            width, height, java.awt.image.BufferedImage.TYPE_INT_ARGB);
        bi.setRGB(0, 0, width, height, pixels, 0, width);
        return bi;
    }

    public Image getImage(String filename) { return null; }
    public void sync() {}
    public void beep() {}

    public boolean isFrameStateSupported(int state) { return state == Frame.NORMAL; }

    public boolean prepareImage(Image image, int width, int height, ImageObserver observer) {
        return true;
    }

    public int checkImage(Image image, int width, int height, ImageObserver observer) {
        return ImageObserver.ALLBITS;
    }

    private static final class HeadlessToolkit extends Toolkit {
    }
}
