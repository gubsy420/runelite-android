package java.awt;

public class SystemTray {
    private static final SystemTray INSTANCE = new SystemTray();

    private SystemTray() {}

    public static boolean isSupported() { return false; }
    public static SystemTray getSystemTray() {
        throw new UnsupportedOperationException("System tray is not supported on Android");
    }

    public Dimension getTrayIconSize() { return new Dimension(0, 0); }
    public void add(TrayIcon icon) {}
    public void remove(TrayIcon icon) {}
    public TrayIcon[] getTrayIcons() { return new TrayIcon[0]; }
}
