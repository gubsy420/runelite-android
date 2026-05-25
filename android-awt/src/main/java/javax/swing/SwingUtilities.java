package javax.swing;

import java.awt.Component;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Window;
import java.awt.event.MouseEvent;

public class SwingUtilities implements SwingConstants {
    private SwingUtilities() {}

    public static boolean isEventDispatchThread() { return EventQueue.isDispatchThread(); }
    public static void invokeLater(Runnable doRun) { EventQueue.invokeLater(doRun); }
    public static void invokeAndWait(Runnable doRun) throws InterruptedException, java.lang.reflect.InvocationTargetException {
        EventQueue.invokeAndWait(doRun);
    }

    public static Window getWindowAncestor(Component c) {
        Container p = c == null ? null : c.getParent();
        while (p != null && !(p instanceof Window)) p = p.getParent();
        return (Window) p;
    }

    public static <T> T getAncestorOfClass(Class<T> c, Component comp) {
        if (comp == null || c == null) return null;
        Container p = comp.getParent();
        while (p != null && !c.isInstance(p)) p = p.getParent();
        @SuppressWarnings("unchecked")
        T result = (T) p;
        return result;
    }

    public static JRootPane getRootPane(Component c) { return getAncestorOfClass(JRootPane.class, c); }
    public static Container getRoot(Component c) {
        Container p = c instanceof Container ? (Container) c : (c == null ? null : c.getParent());
        while (p != null && !(p instanceof Window) && !(p instanceof java.applet.Applet)) p = p.getParent();
        return p;
    }

    public static boolean isLeftMouseButton(MouseEvent e) { return e.getButton() == MouseEvent.BUTTON1; }
    public static boolean isMiddleMouseButton(MouseEvent e) { return e.getButton() == MouseEvent.BUTTON2; }
    public static boolean isRightMouseButton(MouseEvent e) { return e.getButton() == MouseEvent.BUTTON3; }

    public static Point convertPoint(Component src, Point pt, Component dest) { return pt; }
    public static Point convertPoint(Component src, int x, int y, Component dest) { return new Point(x, y); }
    public static Rectangle convertRectangle(Component src, Rectangle r, Component dest) { return r; }
    public static MouseEvent convertMouseEvent(Component src, MouseEvent ev, Component dest) { return ev; }
    public static void convertPointFromScreen(Point p, Component c) {}
    public static void convertPointToScreen(Point p, Component c) {}

    public static Rectangle computeUnion(int x, int y, int w, int h, Rectangle dest) {
        if (dest == null) return new Rectangle(x, y, w, h);
        dest.add(new Rectangle(x, y, w, h));
        return dest;
    }
    public static Rectangle[] computeDifference(Rectangle rectA, Rectangle rectB) { return new Rectangle[0]; }
    public static Rectangle computeIntersection(int x, int y, int width, int height, Rectangle dest) {
        Rectangle r = dest == null ? new Rectangle() : dest;
        Rectangle other = new Rectangle(x, y, width, height);
        Rectangle intersect = r.intersection(other);
        r.setBounds(intersect.x, intersect.y, intersect.width, intersect.height);
        return r;
    }

    public static String layoutCompoundLabel(java.awt.FontMetrics fm, String text, Icon icon, int verticalAlignment,
                                              int horizontalAlignment, int verticalTextPosition, int horizontalTextPosition,
                                              Rectangle viewR, Rectangle iconR, Rectangle textR, int textIconGap) {
        return text == null ? "" : text;
    }
}
