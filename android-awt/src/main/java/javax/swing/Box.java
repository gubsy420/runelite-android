package javax.swing;

import java.awt.Component;
import java.awt.Dimension;
import javax.accessibility.Accessible;
import javax.accessibility.AccessibleContext;

public class Box extends JComponent implements Accessible {
    private static final long serialVersionUID = 1L;

    public static class Filler extends JComponent implements Accessible {
        private static final long serialVersionUID = 1L;
        public Filler(Dimension min, Dimension pref, Dimension max) {
            setMinimumSize(min); setPreferredSize(pref); setMaximumSize(max);
        }
        public void changeShape(Dimension min, Dimension pref, Dimension max) {
            setMinimumSize(min); setPreferredSize(pref); setMaximumSize(max);
        }
        @Override public AccessibleContext getAccessibleContext() { return null; }
    }

    public Box(int axis) { setLayout(new BoxLayout(this, axis)); }

    public static Component createHorizontalStrut(int width) { return new Filler(new Dimension(width, 0), new Dimension(width, 0), new Dimension(width, Short.MAX_VALUE)); }
    public static Component createVerticalStrut(int height) { return new Filler(new Dimension(0, height), new Dimension(0, height), new Dimension(Short.MAX_VALUE, height)); }
    public static Component createRigidArea(Dimension d) { return new Filler(d, d, d); }
    public static Component createHorizontalGlue() { return new Filler(new Dimension(), new Dimension(), new Dimension(Short.MAX_VALUE, 0)); }
    public static Component createVerticalGlue() { return new Filler(new Dimension(), new Dimension(), new Dimension(0, Short.MAX_VALUE)); }
    public static Component createGlue() { return new Filler(new Dimension(), new Dimension(), new Dimension(Short.MAX_VALUE, Short.MAX_VALUE)); }
    public static Box createHorizontalBox() { return new Box(BoxLayout.X_AXIS); }
    public static Box createVerticalBox() { return new Box(BoxLayout.Y_AXIS); }

    @Override public AccessibleContext getAccessibleContext() { return null; }
}
