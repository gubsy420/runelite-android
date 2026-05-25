package javax.swing;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import javax.swing.event.ChangeListener;

public class JViewport extends JComponent {
    private static final long serialVersionUID = 1L;

    public static final int BLIT_SCROLL_MODE = 1;
    public static final int BACKINGSTORE_SCROLL_MODE = 2;
    public static final int SIMPLE_SCROLL_MODE = 3;

    private Component view;
    private int scrollMode = BLIT_SCROLL_MODE;

    public JViewport() {}

    public Component getView() { return view; }
    public void setView(Component view) {
        if (this.view != null) super.remove(this.view);
        this.view = view;
        if (view != null) super.add(view);
        if (getWidth() > 0 && getHeight() > 0) doLayout();
    }
    public Dimension getViewSize() { return view == null ? new Dimension() : view.getSize(); }
    public void setViewSize(Dimension newSize) {}
    public Point getViewPosition() { return new Point(); }
    public void setViewPosition(Point p) {}
    public Rectangle getViewRect() { return new Rectangle(); }
    public Dimension getExtentSize() { return getSize(); }

    @Override
    public void doLayout() {
        // Viewport sizes its view to its own bounds (we don't implement actual scrolling
        // yet — the view occupies the visible viewport area).
        if (view != null && getWidth() > 0 && getHeight() > 0) {
            // Use view's preferred height (or larger) so scroll-content can grow; cap width
            // to viewport to avoid horizontal clipping.
            Dimension pref = view.getPreferredSize();
            int h = Math.max(getHeight(), pref.height);
            view.setBounds(0, 0, getWidth(), h);
        }
    }
    public void setExtentSize(Dimension newExtent) {}
    public int getScrollMode() { return scrollMode; }
    public void setScrollMode(int mode) { this.scrollMode = mode; }
    public void addChangeListener(ChangeListener l) {}
    public void removeChangeListener(ChangeListener l) {}
    public void scrollRectToVisible(Rectangle contentRect) {}
}
