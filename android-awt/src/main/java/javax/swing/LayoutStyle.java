package javax.swing;

import java.awt.Container;

public abstract class LayoutStyle {
    public enum ComponentPlacement { RELATED, UNRELATED, INDENT }

    private static LayoutStyle instance = new DefaultLayoutStyle();

    public static LayoutStyle getInstance() { return instance; }
    public static void setInstance(LayoutStyle style) { instance = style != null ? style : new DefaultLayoutStyle(); }

    public abstract int getPreferredGap(JComponent c1, JComponent c2, ComponentPlacement type, int position, Container parent);
    public abstract int getContainerGap(JComponent component, int position, Container parent);

    private static final class DefaultLayoutStyle extends LayoutStyle {
        @Override public int getPreferredGap(JComponent c1, JComponent c2, ComponentPlacement type, int position, Container parent) { return 6; }
        @Override public int getContainerGap(JComponent component, int position, Container parent) { return 6; }
    }
}
