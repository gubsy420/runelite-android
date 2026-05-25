package java.awt;

public class MouseInfo {
    private MouseInfo() {}

    public static PointerInfo getPointerInfo() {
        return new PointerInfo(null, new Point(0, 0));
    }

    public static int getNumberOfButtons() {
        return 3;
    }
}
