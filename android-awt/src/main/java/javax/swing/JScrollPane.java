package javax.swing;

import java.awt.Component;
import javax.swing.border.Border;

public class JScrollPane extends JComponent implements ScrollPaneConstants {
    private static final long serialVersionUID = 1L;

    protected JViewport viewport = new JViewport();
    protected JScrollBar verticalScrollBar = new JScrollBar(JScrollBar.VERTICAL);
    protected JScrollBar horizontalScrollBar = new JScrollBar(JScrollBar.HORIZONTAL);
    protected int verticalScrollBarPolicy = VERTICAL_SCROLLBAR_AS_NEEDED;
    protected int horizontalScrollBarPolicy = HORIZONTAL_SCROLLBAR_AS_NEEDED;
    private Border viewportBorder;

    public JScrollPane() { init(); }
    public JScrollPane(Component view) { init(); viewport.setView(view); }
    public JScrollPane(int vsbPolicy, int hsbPolicy) {
        this.verticalScrollBarPolicy = vsbPolicy;
        this.horizontalScrollBarPolicy = hsbPolicy;
        init();
    }
    public JScrollPane(Component view, int vsbPolicy, int hsbPolicy) {
        this(vsbPolicy, hsbPolicy);
        viewport.setView(view);
    }

    private void init() {
        setOpaque(true);
        super.add(viewport);
    }

    @Override
    public void doLayout() {
        if (viewport != null && getWidth() > 0 && getHeight() > 0) {
            viewport.setBounds(0, 0, getWidth(), getHeight());
        }
    }

    public JViewport getViewport() { return viewport; }
    public void setViewport(JViewport viewport) { this.viewport = viewport; }
    public void setViewportView(Component view) { viewport.setView(view); }
    public JScrollBar getVerticalScrollBar() { return verticalScrollBar; }
    public void setVerticalScrollBar(JScrollBar sb) { this.verticalScrollBar = sb; }
    public JScrollBar getHorizontalScrollBar() { return horizontalScrollBar; }
    public void setHorizontalScrollBar(JScrollBar sb) { this.horizontalScrollBar = sb; }
    public int getVerticalScrollBarPolicy() { return verticalScrollBarPolicy; }
    public void setVerticalScrollBarPolicy(int policy) { this.verticalScrollBarPolicy = policy; }
    public int getHorizontalScrollBarPolicy() { return horizontalScrollBarPolicy; }
    public void setHorizontalScrollBarPolicy(int policy) { this.horizontalScrollBarPolicy = policy; }
    public Border getViewportBorder() { return viewportBorder; }
    public void setViewportBorder(Border viewportBorder) { this.viewportBorder = viewportBorder; }
    public JViewport getRowHeader() { return null; }
    public void setRowHeader(JViewport rowHeader) {}
    public JViewport getColumnHeader() { return null; }
    public void setColumnHeader(JViewport columnHeader) {}
    public Component getCorner(String key) { return null; }
    public void setCorner(String key, Component corner) {}
    public void setWheelScrollingEnabled(boolean enable) {}
    public boolean isWheelScrollingEnabled() { return true; }
}
