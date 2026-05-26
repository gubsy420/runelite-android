package java.awt;

import java.awt.image.BufferedImage;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Canvas shadow. The patched RS client paints its game viewport into a {@link Canvas},
 * so we back every instance with a {@link BufferedImage} backbuffer. {@link #getGraphics()}
 * returns a {@code Graphics2D} writing into that buffer; the most recently active canvas
 * is exposed via {@link #latest()} so the Compose host can read pixels and draw them.
 */
public class Canvas extends Component {
    private static final long serialVersionUID = -2284879212465893870L;
    private static final AtomicReference<Canvas> LATEST = new AtomicReference<>();

    /**
     * Set when GpuGlesPlugin has taken over rendering. The Compose host then layers an
     * EGL-backed SurfaceView at this Canvas's absolute window rect and the host paint
     * walk skips the Canvas's CPU backbuffer — instead clearing its rect to alpha=0 so
     * the SurfaceView shows through the chrome bitmap.
     */
    private static volatile boolean RENDERED_BY_GLES = false;
    public static void setRenderedByGles(boolean v) { RENDERED_BY_GLES = v; }
    public static boolean isRenderedByGles() { return RENDERED_BY_GLES; }

    private BufferedImage backbuffer;

    public Canvas() {
        LATEST.set(this);
    }

    public Canvas(GraphicsConfiguration config) {
        LATEST.set(this);
    }

    /** Most-recently-instantiated canvas — the Compose host pulls pixels from here. */
    public static Canvas latest() {
        return LATEST.get();
    }

    /** Absolute origin + size of this Canvas within its top-level Window. Returns null
     *  if not currently parented. Used by the GLES host to position the SurfaceView. */
    public Rectangle getBoundsInWindow() {
        int ax = this.x, ay = this.y;
        Component p = getParent();
        while (p != null && !(p instanceof Window)) {
            ax += p.getX();
            ay += p.getY();
            p = p.getParent();
        }
        if (p == null) return null;
        return new Rectangle(ax, ay, width, height);
    }

    public BufferedImage getBackbuffer() {
        return backbuffer;
    }

    private void ensureBackbuffer() {
        int w = Math.max(1, width);
        int h = Math.max(1, height);
        if (backbuffer == null || backbuffer.getWidth() != w || backbuffer.getHeight() != h) {
            backbuffer = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
        }
    }

    @Override
    public void setSize(int w, int h) {
        super.setSize(w, h);
        ensureBackbuffer();
    }

    @Override
    public void setBounds(int x, int y, int w, int h) {
        super.setBounds(x, y, w, h);
        ensureBackbuffer();
    }

    @Override
    public Graphics getGraphics() {
        ensureBackbuffer();
        return backbuffer.createGraphics();
    }

    public BufferedImage createBufferStrategy(int numBuffers) { return getBackbuffer(); }
    public Object getBufferStrategy() {
        ensureBackbuffer();
        return backbuffer;
    }

    @Override
    public void paint(Graphics g) {
        ensureBackbuffer();
        // Blit our backbuffer into whatever graphics our parent gave us.
        g.drawImage(backbuffer, 0, 0, null);
    }

    @Override
    public void update(Graphics g) { paint(g); }
}
