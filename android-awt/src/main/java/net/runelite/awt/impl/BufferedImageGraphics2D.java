package net.runelite.awt.impl;

import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Composite;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.FontRenderContext;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;

import net.runelite.awt.AwtNative;

/**
 * Graphics2D backed by a {@link BufferedImage} {@code int[]} pixel buffer. Bulk fills /
 * blits route through the {@link AwtNative} Rust bridge; small / single-pixel ops stay
 * in Java since the JNI hop costs more than the work.
 */
public class BufferedImageGraphics2D extends Graphics2D {
    private final BufferedImage image;
    private final int[] pixels;
    private final int width;
    private final int height;

    private Color foreground = Color.BLACK;
    private Color background = Color.WHITE;
    private Font font = new Font(Font.DIALOG, Font.PLAIN, 12);
    private Rectangle clip;
    private final AffineTransform transform = new AffineTransform();
    private Composite composite = AlphaComposite.SrcOver;
    private Stroke stroke = new BasicStroke();
    private Paint paint = Color.BLACK;
    private final RenderingHints renderingHints = new RenderingHints(null);

    public BufferedImageGraphics2D(BufferedImage image) {
        this.image = image;
        this.pixels = image.backingArray();
        this.width = image.getWidth();
        this.height = image.getHeight();
        this.clip = new Rectangle(0, 0, width, height);
    }

    private Rectangle clipped(int x, int y, int w, int h) {
        int x0 = Math.max(x, clip.x);
        int y0 = Math.max(y, clip.y);
        int x1 = Math.min(x + w, clip.x + clip.width);
        int y1 = Math.min(y + h, clip.y + clip.height);
        int x2 = Math.max(0, Math.min(width, x1));
        int y2 = Math.max(0, Math.min(height, y1));
        int x3 = Math.max(0, x0);
        int y3 = Math.max(0, y0);
        return new Rectangle(x3, y3, Math.max(0, x2 - x3), Math.max(0, y2 - y3));
    }

    @Override
    public Graphics create() {
        BufferedImageGraphics2D copy = new BufferedImageGraphics2D(image);
        copy.foreground = foreground;
        copy.background = background;
        copy.font = font;
        copy.clip = new Rectangle(clip);
        copy.transform.setTransform(transform);
        copy.composite = composite;
        copy.stroke = stroke;
        copy.paint = paint;
        copy.renderingHints.add(renderingHints);
        return copy;
    }

    @Override public void translate(int x, int y) { transform.translate(x, y); }
    @Override public void translate(double tx, double ty) { transform.translate(tx, ty); }

    /** Current accumulated x translation as device-space integer. */
    private int tx() { return (int) Math.round(transform.getTranslateX()); }
    /** Current accumulated y translation as device-space integer. */
    private int ty() { return (int) Math.round(transform.getTranslateY()); }

    @Override public Color getColor() { return foreground; }
    @Override public void setColor(Color c) { if (c != null) { foreground = c; paint = c; } }
    @Override public Color getBackground() { return background; }
    @Override public void setBackground(Color c) { if (c != null) background = c; }

    @Override public void setPaintMode() {}
    @Override public void setXORMode(Color c1) {}

    @Override public Font getFont() { return font; }
    @Override public void setFont(Font font) { if (font != null) this.font = font; }
    @Override public FontMetrics getFontMetrics() { return getFontMetrics(font); }
    @Override public FontMetrics getFontMetrics(Font f) { return new BufferedImageFontMetrics(f); }

    @Override public Rectangle getClipBounds() {
        // Return clip in user space (subtract current translation).
        return new Rectangle(clip.x - tx(), clip.y - ty(), clip.width, clip.height);
    }
    @Override public void clipRect(int x, int y, int w, int h) {
        clip = clip.intersection(new Rectangle(x + tx(), y + ty(), w, h));
    }
    @Override public void setClip(int x, int y, int w, int h) {
        clip = new Rectangle(x + tx(), y + ty(), w, h);
    }
    @Override public Shape getClip() { return getClipBounds(); }
    @Override public void setClip(Shape shape) {
        if (shape == null) clip = new Rectangle(0, 0, width, height);
        else {
            Rectangle b = shape.getBounds();
            clip = new Rectangle(b.x + tx(), b.y + ty(), b.width, b.height);
        }
    }

    @Override
    public void copyArea(int x, int y, int w, int h, int dx, int dy) {
        Rectangle src = clipped(x + tx(), y + ty(), w, h);
        if (src.width == 0 || src.height == 0) return;
        AwtNative.copyArea(pixels, width, height,
            src.x, src.y, src.width, src.height, src.x + dx, src.y + dy);
    }

    @Override
    public void drawLine(int x1, int y1, int x2, int y2) {
        int dx = tx(), dy = ty();
        AwtNative.drawLine(pixels, width, height, x1 + dx, y1 + dy, x2 + dx, y2 + dy, foreground.getRGB());
    }

    @Override
    public void fillRect(int x, int y, int w, int h) {
        Rectangle r = clipped(x + tx(), y + ty(), w, h);
        if (r.width == 0 || r.height == 0) return;
        AwtNative.fillRect(pixels, width, height, r.x, r.y, r.width, r.height,
            foreground.getRGB(), compositeRule());
    }

    @Override
    public void clearRect(int x, int y, int w, int h) {
        Rectangle r = clipped(x + tx(), y + ty(), w, h);
        if (r.width == 0 || r.height == 0) return;
        AwtNative.fillRect(pixels, width, height, r.x, r.y, r.width, r.height,
            background.getRGB(), AlphaComposite.SRC);
    }

    @Override public void drawRoundRect(int x, int y, int w, int h, int aw, int ah) { drawRect(x, y, w, h); }
    @Override public void fillRoundRect(int x, int y, int w, int h, int aw, int ah) { fillRect(x, y, w, h); }
    @Override public void drawOval(int x, int y, int w, int h) { drawRect(x, y, w, h); }
    @Override public void fillOval(int x, int y, int w, int h) { fillRect(x, y, w, h); }
    @Override public void drawArc(int x, int y, int w, int h, int sa, int aa) {}
    @Override public void fillArc(int x, int y, int w, int h, int sa, int aa) { fillRect(x, y, w, h); }

    @Override
    public void drawPolyline(int[] xs, int[] ys, int n) {
        for (int i = 1; i < n; i++) drawLine(xs[i - 1], ys[i - 1], xs[i], ys[i]);
    }

    @Override
    public void drawPolygon(int[] xs, int[] ys, int n) {
        for (int i = 0; i < n; i++) {
            int j = (i + 1) % n;
            drawLine(xs[i], ys[i], xs[j], ys[j]);
        }
    }

    @Override
    public void fillPolygon(int[] xs, int[] ys, int n) {
        if (n < 3) return;
        int dx = tx(), dy = ty();
        int[] sx = xs, sy = ys;
        if (dx != 0 || dy != 0) {
            sx = new int[n]; sy = new int[n];
            for (int i = 0; i < n; i++) { sx[i] = xs[i] + dx; sy[i] = ys[i] + dy; }
        }
        AwtNative.fillPolygon(pixels, width, height, sx, sy, n, foreground.getRGB(), compositeRule());
    }

    @Override
    public void drawString(String str, int x, int y) {
        if (str == null || str.isEmpty()) return;
        android.graphics.Paint p = androidPaint();
        // (x, y) is the BASELINE in AWT — same as Android Canvas.drawText.
        android.graphics.Rect bounds = new android.graphics.Rect();
        p.getTextBounds(str, 0, str.length(), bounds);
        int padding = 2;
        int textW = bounds.width() + 2 * padding;
        int textH = bounds.height() + 2 * padding;
        if (textW <= 0 || textH <= 0) return;
        android.graphics.Bitmap bmp = android.graphics.Bitmap.createBitmap(
            textW, textH, android.graphics.Bitmap.Config.ARGB_8888);
        android.graphics.Canvas canvas = new android.graphics.Canvas(bmp);
        canvas.drawText(str, padding - bounds.left, padding - bounds.top, p);
        int[] textPixels = new int[textW * textH];
        bmp.getPixels(textPixels, 0, textW, 0, 0, textW, textH);
        bmp.recycle();
        int dx = x + tx() + bounds.left - padding;
        int dy = y + ty() + bounds.top - padding;
        AwtNative.blit(textPixels, textW, textH, 0, 0, textW, textH,
            pixels, width, height, dx, dy, textW, textH, compositeRule(), compositeAlpha());
    }

    /** Builds an Android Paint matching our current foreground + font. Not cached — fonts
     * are immutable on the AWT side so recreation is fine for occasional text. */
    private android.graphics.Paint androidPaint() {
        android.graphics.Paint p = new android.graphics.Paint();
        p.setColor(foreground.getRGB());
        p.setAntiAlias(true);
        p.setTextSize(Math.max(1, font.getSize()));
        int style = font.getStyle();
        android.graphics.Typeface tf;
        if (style == Font.BOLD) tf = android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, android.graphics.Typeface.BOLD);
        else if (style == Font.ITALIC) tf = android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, android.graphics.Typeface.ITALIC);
        else if (style == (Font.BOLD | Font.ITALIC)) tf = android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, android.graphics.Typeface.BOLD_ITALIC);
        else tf = android.graphics.Typeface.DEFAULT;
        p.setTypeface(tf);
        return p;
    }

    @Override public void drawString(String str, float x, float y) { drawString(str, (int) x, (int) y); }
    @Override public void drawString(AttributedCharacterIterator it, int x, int y) {}
    @Override public void drawString(AttributedCharacterIterator it, float x, float y) {}

    @Override
    public boolean drawImage(java.awt.Image img, int x, int y, ImageObserver obs) {
        if (img instanceof BufferedImage) {
            BufferedImage bi = (BufferedImage) img;
            blit(bi, 0, 0, bi.getWidth(), bi.getHeight(), x, y, bi.getWidth(), bi.getHeight());
        }
        return true;
    }

    @Override
    public boolean drawImage(java.awt.Image img, int x, int y, int w, int h, ImageObserver obs) {
        if (img instanceof BufferedImage) {
            BufferedImage bi = (BufferedImage) img;
            blit(bi, 0, 0, bi.getWidth(), bi.getHeight(), x, y, w, h);
        }
        return true;
    }

    @Override public boolean drawImage(java.awt.Image img, int x, int y, Color bg, ImageObserver obs) { return drawImage(img, x, y, obs); }
    @Override public boolean drawImage(java.awt.Image img, int x, int y, int w, int h, Color bg, ImageObserver obs) { return drawImage(img, x, y, w, h, obs); }

    @Override
    public boolean drawImage(java.awt.Image img, int dx1, int dy1, int dx2, int dy2,
                              int sx1, int sy1, int sx2, int sy2, ImageObserver obs) {
        if (img instanceof BufferedImage) {
            BufferedImage bi = (BufferedImage) img;
            blit(bi, sx1, sy1, sx2 - sx1, sy2 - sy1, dx1, dy1, dx2 - dx1, dy2 - dy1);
        }
        return true;
    }

    @Override
    public boolean drawImage(java.awt.Image img, int dx1, int dy1, int dx2, int dy2,
                              int sx1, int sy1, int sx2, int sy2, Color bg, ImageObserver obs) {
        return drawImage(img, dx1, dy1, dx2, dy2, sx1, sy1, sx2, sy2, obs);
    }

    @Override
    public boolean drawImage(java.awt.Image img, AffineTransform xform, ImageObserver obs) {
        return drawImage(img, (int) xform.getTranslateX(), (int) xform.getTranslateY(), obs);
    }

    @Override
    public void drawImage(BufferedImage img, int x, int y) {
        blit(img, 0, 0, img.getWidth(), img.getHeight(), x, y, img.getWidth(), img.getHeight());
    }

    private void blit(BufferedImage src, int sx, int sy, int sw, int sh, int dx, int dy, int dw, int dh) {
        int[] srcPixels = src.backingArray();
        if (srcPixels == null) return;
        AwtNative.blit(srcPixels, src.getWidth(), src.getHeight(), sx, sy, sw, sh,
            pixels, width, height, dx + tx(), dy + ty(), dw, dh,
            compositeRuleFor(src), compositeAlpha());
    }

    /**
     * Pick the composite for blitting from this source image. For opaque source images
     * (no alpha channel) the JDK treats source alpha as 1.0 regardless of what's in the
     * pixel's high byte. Our Rust src_over honors source alpha literally — which means
     * for OSRS-style raw RGB writes (alpha bits = 0) the blit becomes a no-op. Promote
     * to SRC so the source pixels overwrite the destination unconditionally.
     */
    private int compositeRuleFor(BufferedImage src) {
        int rule = compositeRule();
        if (rule == AlphaComposite.SRC_OVER && isOpaqueSource(src)) {
            return AlphaComposite.SRC;
        }
        return rule;
    }

    private static boolean isOpaqueSource(BufferedImage src) {
        if (isOpaqueType(src.getType())) return true;
        // TYPE_CUSTOM images (constructed via the (ColorModel, Raster, …) constructor —
        // common pattern in the OSRS client) report opacity through their ColorModel
        // instead of their imageType field.
        java.awt.image.ColorModel cm = src.getColorModel();
        return cm != null && !cm.hasAlpha();
    }

    private static boolean isOpaqueType(int t) {
        return t == BufferedImage.TYPE_INT_RGB
            || t == BufferedImage.TYPE_INT_BGR
            || t == BufferedImage.TYPE_USHORT_565_RGB
            || t == BufferedImage.TYPE_USHORT_555_RGB
            || t == BufferedImage.TYPE_3BYTE_BGR
            || t == BufferedImage.TYPE_BYTE_GRAY
            || t == BufferedImage.TYPE_USHORT_GRAY;
    }

    private int compositeRule() {
        if (composite instanceof AlphaComposite) return ((AlphaComposite) composite).getRule();
        return AlphaComposite.SRC_OVER;
    }

    private float compositeAlpha() {
        if (composite instanceof AlphaComposite) return ((AlphaComposite) composite).getAlpha();
        return 1f;
    }

    @Override public void draw(Shape s) {
        Rectangle b = s.getBounds();
        drawRect(b.x, b.y, b.width, b.height);
    }

    @Override public void fill(Shape s) {
        if (s instanceof Polygon) {
            Polygon p = (Polygon) s;
            fillPolygon(p.xpoints, p.ypoints, p.npoints);
            return;
        }
        Rectangle b = s.getBounds();
        fillRect(b.x, b.y, b.width, b.height);
    }

    @Override public Composite getComposite() { return composite; }
    @Override public void setComposite(Composite comp) { if (comp != null) composite = comp; }

    @Override public Paint getPaint() { return paint; }
    @Override public void setPaint(Paint paint) {
        if (paint != null) {
            this.paint = paint;
            if (paint instanceof Color) this.foreground = (Color) paint;
        }
    }

    @Override public Stroke getStroke() { return stroke; }
    @Override public void setStroke(Stroke s) { if (s != null) stroke = s; }

    @Override public AffineTransform getTransform() { return new AffineTransform(transform); }
    @Override public void setTransform(AffineTransform tx) { if (tx != null) transform.setTransform(tx); }
    @Override public void transform(AffineTransform tx) {
        // Compose; ignored beyond translation for now.
        translate(tx.getTranslateX(), tx.getTranslateY());
    }
    @Override public void rotate(double theta) {}
    @Override public void rotate(double theta, double x, double y) {}
    @Override public void scale(double sx, double sy) { transform.scale(sx, sy); }
    @Override public void shear(double shx, double shy) {}

    @Override public void setRenderingHint(RenderingHints.Key key, Object val) { renderingHints.put(key, val); }
    @Override public Object getRenderingHint(RenderingHints.Key key) { return renderingHints.get(key); }
    @Override public void setRenderingHints(java.util.Map<?, ?> hints) { renderingHints.clear(); renderingHints.putAll(hints); }
    @Override public void addRenderingHints(java.util.Map<?, ?> hints) { renderingHints.putAll(hints); }
    @Override public RenderingHints getRenderingHints() { return (RenderingHints) renderingHints.clone(); }

    @Override public FontRenderContext getFontRenderContext() { return new FontRenderContext(transform, false, false); }

    @Override public void dispose() {}
}
