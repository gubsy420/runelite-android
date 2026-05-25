package java.awt;

public abstract class GraphicsDevice {
    public static final int TYPE_RASTER_SCREEN = 0;
    public static final int TYPE_PRINTER = 1;
    public static final int TYPE_IMAGE_BUFFER = 2;

    protected GraphicsDevice() {}

    public abstract int getType();
    public abstract String getIDstring();
    public abstract GraphicsConfiguration[] getConfigurations();
    public abstract GraphicsConfiguration getDefaultConfiguration();

    private Window fullScreenWindow;

    public Window getFullScreenWindow() { return fullScreenWindow; }
    public void setFullScreenWindow(Window w) { this.fullScreenWindow = w; }
    public boolean isFullScreenSupported() { return false; }
    public boolean isDisplayChangeSupported() { return false; }
    public DisplayMode getDisplayMode() { return null; }
    public DisplayMode[] getDisplayModes() { return new DisplayMode[0]; }
    public void setDisplayMode(DisplayMode dm) {}
}
