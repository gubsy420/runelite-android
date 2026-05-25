package java.awt;

public class Taskbar {
    public enum Feature {
        ICON_BADGE_NUMBER, ICON_BADGE_TEXT, ICON_BADGE_IMAGE_WINDOW, ICON_IMAGE,
        MENU, PROGRESS_STATE_WINDOW, PROGRESS_VALUE, PROGRESS_VALUE_WINDOW,
        USER_ATTENTION, USER_ATTENTION_WINDOW
    }

    public enum State {
        OFF, NORMAL, PAUSED, ERROR, INDETERMINATE
    }

    private static final Taskbar INSTANCE = new Taskbar();

    private Taskbar() {}

    public static boolean isTaskbarSupported() { return false; }
    public static Taskbar getTaskbar() {
        throw new UnsupportedOperationException("Taskbar is not supported on Android");
    }

    public boolean isSupported(Feature feature) { return false; }
    public Image getIconImage() { return null; }
    public void setIconImage(Image image) {}
    public void setIconBadge(String badge) {}
    public void setProgressValue(int value) {}
    public void setProgressState(State state) {}
    public void requestUserAttention(boolean enabled, boolean critical) {}
}
