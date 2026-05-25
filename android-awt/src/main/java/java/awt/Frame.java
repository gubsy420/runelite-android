package java.awt;

public class Frame extends Window {
    private static final long serialVersionUID = 2673458971256075116L;

    public static final int NORMAL = 0;
    public static final int ICONIFIED = 1;
    public static final int MAXIMIZED_HORIZ = 2;
    public static final int MAXIMIZED_VERT = 4;
    public static final int MAXIMIZED_BOTH = MAXIMIZED_VERT | MAXIMIZED_HORIZ;

    private String title = "";
    private boolean resizable = true;
    private boolean undecorated;

    public Frame() {
    }

    public Frame(String title) {
        this.title = (title == null) ? "" : title;
    }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = (title == null) ? "" : title; }
    public boolean isResizable() { return resizable; }
    public void setResizable(boolean resizable) { this.resizable = resizable; }
    public boolean isUndecorated() { return undecorated; }
    public void setUndecorated(boolean undecorated) { this.undecorated = undecorated; }
    public int getExtendedState() { return NORMAL; }
    public void setExtendedState(int state) {}

    @Override
    public Insets getInsets() { return new Insets(0, 0, 0, 0); }
}
