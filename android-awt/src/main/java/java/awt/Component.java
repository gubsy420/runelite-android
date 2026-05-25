package java.awt;

import java.awt.event.ComponentListener;
import java.awt.event.FocusListener;
import java.awt.event.HierarchyListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.awt.image.ImageObserver;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Component shadow. Holds size, location, colour, font, listener lists — the data
 * AWT-using callers query. Painting and event dispatch are wired in at the host layer
 * (e.g. an Android View bridge), not here.
 */
public abstract class Component implements ImageObserver, Serializable {
    private static final long serialVersionUID = -7644114512714619750L;

    protected int x, y, width, height;
    protected Color foreground = Color.BLACK;
    protected Color background = Color.WHITE;
    protected Font font = new Font(Font.DIALOG, Font.PLAIN, 12);
    protected boolean visible = true;
    protected boolean enabled = true;
    protected Container parent;

    private final List<ComponentListener> componentListeners = new ArrayList<>();
    private final List<FocusListener> focusListeners = new ArrayList<>();
    private final List<HierarchyListener> hierarchyListeners = new ArrayList<>();
    private final List<KeyListener> keyListeners = new ArrayList<>();
    private final List<MouseListener> mouseListeners = new ArrayList<>();
    private final List<MouseMotionListener> mouseMotionListeners = new ArrayList<>();
    private final List<MouseWheelListener> mouseWheelListeners = new ArrayList<>();

    protected Component() {
    }

    public Container getParent()  { return parent; }
    void setParent(Container p)   { this.parent = p; }

    public int getX()             { return x; }
    public int getY()             { return y; }
    public int getWidth()         { return width; }
    public int getHeight()        { return height; }

    public Point getLocation()    { return new Point(x, y); }
    public Point getLocationOnScreen() { return getLocation(); }
    public Dimension getSize()    { return new Dimension(width, height); }

    private Dimension preferredSize;
    private Dimension minimumSize;
    private Dimension maximumSize;

    public Dimension getPreferredSize() { return preferredSize != null ? new Dimension(preferredSize) : getSize(); }
    public void setPreferredSize(Dimension d) { this.preferredSize = d == null ? null : new Dimension(d); }
    public Dimension getMinimumSize()   { return minimumSize != null ? new Dimension(minimumSize) : getSize(); }
    public void setMinimumSize(Dimension d) { this.minimumSize = d == null ? null : new Dimension(d); }
    public Dimension getMaximumSize()   { return maximumSize != null ? new Dimension(maximumSize) : new Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE); }
    public void setMaximumSize(Dimension d) { this.maximumSize = d == null ? null : new Dimension(d); }
    public boolean isPreferredSizeSet() { return preferredSize != null; }
    public boolean isMinimumSizeSet() { return minimumSize != null; }
    public boolean isMaximumSizeSet() { return maximumSize != null; }
    public Rectangle getBounds()  { return new Rectangle(x, y, width, height); }

    public void setLocation(int x, int y)       { this.x = x; this.y = y; }
    public void setLocation(Point p)            { setLocation(p.x, p.y); }
    public void setSize(int w, int h)           { width = w; height = h; }
    public void setSize(Dimension d)            { setSize(d.width, d.height); }
    public void setBounds(int x, int y, int w, int h) {
        this.x = x; this.y = y; this.width = w; this.height = h;
    }
    public void setBounds(Rectangle r)          { setBounds(r.x, r.y, r.width, r.height); }

    public Color getForeground()  { return foreground; }
    public void setForeground(Color c) { foreground = c; }
    public Color getBackground()  { return background; }
    public void setBackground(Color c) { background = c; }

    public Font getFont()         { return font; }
    public void setFont(Font f)   { if (f != null) font = f; }

    public boolean isVisible()    { return visible; }
    public void setVisible(boolean v) { visible = v; }
    public boolean isEnabled()    { return enabled; }
    public void setEnabled(boolean e) { enabled = e; }
    public boolean isShowing()    { return visible && parent == null ? false : (parent != null ? parent.isShowing() : visible); }
    public boolean isDisplayable() { return true; }

    public Graphics getGraphics() {
        // Host-provided rendering target; none in the headless shadow.
        return null;
    }

    public Toolkit getToolkit() { return Toolkit.getDefaultToolkit(); }

    public GraphicsConfiguration getGraphicsConfiguration() {
        return net.runelite.awt.impl.HeadlessGraphicsConfiguration.INSTANCE;
    }

    public FontMetrics getFontMetrics(Font f) {
        return new net.runelite.awt.impl.BufferedImageFontMetrics(f);
    }

    public void repaint() { repaint(0, 0, 0, width, height); }
    public void repaint(long tm) { repaint(tm, 0, 0, width, height); }
    public void repaint(int x, int y, int width, int height) { repaint(0, x, y, width, height); }
    public void repaint(long tm, int x, int y, int width, int height) {
        // No-op until a host backend is plugged in.
    }

    public void paint(Graphics g) {
        // Default: fill with background if we have one. Subclasses extend.
        if (background != null && width > 0 && height > 0) {
            Color saved = g.getColor();
            g.setColor(background);
            g.fillRect(0, 0, width, height);
            if (saved != null) g.setColor(saved);
        }
    }
    public void update(Graphics g) { paint(g); }
    public void paintAll(Graphics g) { paint(g); }
    public void validate() {}
    public void invalidate() {}
    public void revalidate() {}
    public void doLayout() {}

    public Image createImage(int w, int h) {
        // JDK Component.createImage returns an opaque image (TYPE_INT_RGB on most
        // platforms). The OSRS client allocates its main offscreen buffer this way
        // and writes raw RGB into it; if we returned TYPE_INT_ARGB the alpha bits
        // would be 0 and our SRC_OVER blits back to the canvas would skip every
        // pixel — invisible 3D scene + sprite atlases.
        return new java.awt.image.BufferedImage(w, h, java.awt.image.BufferedImage.TYPE_INT_RGB);
    }

    public Image createImage(java.awt.image.ImageProducer producer) {
        return null;
    }

    public boolean imageUpdate(Image img, int infoflags, int x, int y, int w, int h) {
        return (infoflags & (ALLBITS | ABORT)) == 0;
    }

    public boolean inside(int x, int y) {
        return x >= 0 && x < width && y >= 0 && y < height;
    }

    public boolean requestFocus(boolean temporary) { return false; }
    public void requestFocus() {}
    public boolean requestFocusInWindow() { return false; }
    public boolean isFocusOwner() { return false; }
    public void setFocusTraversalKeysEnabled(boolean v) {}
    public boolean getFocusTraversalKeysEnabled() { return true; }
    public void setFocusable(boolean focusable) {}
    public boolean isFocusable() { return true; }
    public void setFocusTraversalKeys(int id, java.util.Set<? extends java.awt.AWTKeyStroke> keys) {}
    public java.util.Set<java.awt.AWTKeyStroke> getFocusTraversalKeys(int id) { return java.util.Collections.emptySet(); }
    public boolean areFocusTraversalKeysSet(int id) { return false; }
    public void transferFocus() {}
    public void transferFocusUpCycle() {}
    public void transferFocusBackward() {}
    public java.awt.Container getFocusCycleRootAncestor() { return parent; }
    public boolean isFocusCycleRoot(java.awt.Container container) { return false; }

    public void addComponentListener(ComponentListener l)       { if (l != null) componentListeners.add(l); }
    public void removeComponentListener(ComponentListener l)    { componentListeners.remove(l); }
    public void addFocusListener(FocusListener l)               { if (l != null) focusListeners.add(l); }
    public void removeFocusListener(FocusListener l)            { focusListeners.remove(l); }
    public void addHierarchyListener(HierarchyListener l)       { if (l != null) hierarchyListeners.add(l); }
    public void removeHierarchyListener(HierarchyListener l)    { hierarchyListeners.remove(l); }
    public void addKeyListener(KeyListener l)                   { if (l != null) keyListeners.add(l); }
    public void removeKeyListener(KeyListener l)                { keyListeners.remove(l); }
    public void addMouseListener(MouseListener l)               { if (l != null) mouseListeners.add(l); }
    public void removeMouseListener(MouseListener l)            { mouseListeners.remove(l); }
    public void addMouseMotionListener(MouseMotionListener l)   { if (l != null) mouseMotionListeners.add(l); }
    public void removeMouseMotionListener(MouseMotionListener l) { mouseMotionListeners.remove(l); }
    public void addMouseWheelListener(MouseWheelListener l)     { if (l != null) mouseWheelListeners.add(l); }
    public void removeMouseWheelListener(MouseWheelListener l)  { mouseWheelListeners.remove(l); }

    private String name = "";
    public String getName() { return name; }
    public void setName(String name) { this.name = name == null ? "" : name; }

    public ComponentListener[] getComponentListeners() { return componentListeners.toArray(new ComponentListener[0]); }
    public FocusListener[] getFocusListeners() { return focusListeners.toArray(new FocusListener[0]); }
    public HierarchyListener[] getHierarchyListeners() { return hierarchyListeners.toArray(new HierarchyListener[0]); }
    public KeyListener[] getKeyListeners() { return keyListeners.toArray(new KeyListener[0]); }
    public MouseListener[] getMouseListeners() { return mouseListeners.toArray(new MouseListener[0]); }
    public MouseMotionListener[] getMouseMotionListeners() { return mouseMotionListeners.toArray(new MouseMotionListener[0]); }
    public MouseWheelListener[] getMouseWheelListeners() { return mouseWheelListeners.toArray(new MouseWheelListener[0]); }

    /**
     * Dispatches a {@link MouseEvent} to whichever listener list matches the event id.
     * Used by the Android host (Compose pointer-input bridge) to inject synthetic mouse
     * events into the obfuscated client, which subscribes to these via the standard
     * {@link #addMouseListener} / {@link #addMouseMotionListener} APIs.
     */
    public void dispatchMouseEvent(MouseEvent e) {
        if (e == null) return;
        switch (e.getID()) {
            case MouseEvent.MOUSE_PRESSED:
                for (MouseListener l : new ArrayList<>(mouseListeners)) l.mousePressed(e);
                break;
            case MouseEvent.MOUSE_RELEASED:
                for (MouseListener l : new ArrayList<>(mouseListeners)) l.mouseReleased(e);
                break;
            case MouseEvent.MOUSE_CLICKED:
                for (MouseListener l : new ArrayList<>(mouseListeners)) l.mouseClicked(e);
                break;
            case MouseEvent.MOUSE_ENTERED:
                for (MouseListener l : new ArrayList<>(mouseListeners)) l.mouseEntered(e);
                break;
            case MouseEvent.MOUSE_EXITED:
                for (MouseListener l : new ArrayList<>(mouseListeners)) l.mouseExited(e);
                break;
            case MouseEvent.MOUSE_MOVED:
                for (MouseMotionListener l : new ArrayList<>(mouseMotionListeners)) l.mouseMoved(e);
                break;
            case MouseEvent.MOUSE_DRAGGED:
                for (MouseMotionListener l : new ArrayList<>(mouseMotionListeners)) l.mouseDragged(e);
                break;
            case MouseEvent.MOUSE_WHEEL:
                if (e instanceof MouseWheelEvent) {
                    MouseWheelEvent we = (MouseWheelEvent) e;
                    for (MouseWheelListener l : new ArrayList<>(mouseWheelListeners)) l.mouseWheelMoved(we);
                }
                break;
        }
    }

    /** Dispatches a {@link KeyEvent} to the registered {@link KeyListener}s. */
    public void dispatchKeyEvent(KeyEvent e) {
        if (e == null) return;
        switch (e.getID()) {
            case KeyEvent.KEY_PRESSED:
                for (KeyListener l : new ArrayList<>(keyListeners)) l.keyPressed(e);
                break;
            case KeyEvent.KEY_RELEASED:
                for (KeyListener l : new ArrayList<>(keyListeners)) l.keyReleased(e);
                break;
            case KeyEvent.KEY_TYPED:
                for (KeyListener l : new ArrayList<>(keyListeners)) l.keyTyped(e);
                break;
        }
    }
}
