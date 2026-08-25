package net.runelite.awt.impl;

import java.awt.Font;
import java.awt.FontMetrics;

/**
 * Font metrics backed by Android's {@link android.graphics.Paint}. Real layouts (BoxLayout,
 * GridLayout, ClientUI.Layout) read stringWidth/getHeight/getAscent to size labels; with
 * the default JDK FontMetrics base class everything would report 0 and children collapse.
 */
public final class BufferedImageFontMetrics extends FontMetrics {
    private static final java.util.concurrent.ConcurrentHashMap<Font, BufferedImageFontMetrics> CACHE =
        new java.util.concurrent.ConcurrentHashMap<>();

    public static BufferedImageFontMetrics forFont(Font font) {
        if (font == null) return null;
        BufferedImageFontMetrics cached = CACHE.get(font);
        if (cached != null) return cached;
        BufferedImageFontMetrics fm = new BufferedImageFontMetrics(font);
        CACHE.put(font, fm);
        return fm;
    }

    private final android.graphics.Paint paint;
    private final int ascent;
    private final int descent;
    private final int leading;
    private final int height;

    /** Android's Paint.setTextSize takes pixels; Java Font.size is conventionally points
     *  but the OSRS/RuneLite code paths treat it as pixels too, so pass through. */
    public static float pxSize(Font f) {
        return Math.max(1f, (float) f.getSize());
    }

    public BufferedImageFontMetrics(Font font) {
        super(font);
        paint = new android.graphics.Paint();
        paint.setAntiAlias(true);
        paint.setTextSize(pxSize(font));
        paint.setTypeface(typefaceFor(font));
        android.graphics.Paint.FontMetrics afm = paint.getFontMetrics();
        this.ascent = Math.max(0, (int) Math.ceil(-afm.ascent));
        this.descent = Math.max(0, (int) Math.ceil(afm.descent));
        this.leading = Math.max(0, (int) Math.ceil(afm.leading));
        this.height = this.ascent + this.descent + this.leading;
    }

    /** Resolve an AWT Font down to an Android Typeface. If the family is registered
     *  (e.g. runescape.ttf loaded via Font.createFont), use that Typeface as-is —
     *  do NOT layer Typeface.BOLD/ITALIC on top, since the loaded face already
     *  encodes those (RuneLite ships runescape_bold.ttf as its own family). Only
     *  apply style bits when falling back to the system DEFAULT. */
    static android.graphics.Typeface typefaceFor(Font font) {
        android.graphics.Typeface registered = net.runelite.awt.impl.AwtFontRegistry.lookup(font.getName());
        if (registered != null) return registered;
        int style = font.getStyle();
        if (style == Font.BOLD) return android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, android.graphics.Typeface.BOLD);
        if (style == Font.ITALIC) return android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, android.graphics.Typeface.ITALIC);
        if (style == (Font.BOLD | Font.ITALIC)) return android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, android.graphics.Typeface.BOLD_ITALIC);
        return android.graphics.Typeface.DEFAULT;
    }

    @Override
    public int getAscent()  { return ascent; }
    @Override
    public int getDescent() { return descent; }
    @Override
    public int getLeading() { return leading; }
    @Override
    public int getHeight()  { return height; }

    @Override
    public int charWidth(int codePoint) {
        return charWidth((char) codePoint);
    }

    @Override
    public int charWidth(char ch) {
        float[] w = new float[1];
        paint.getTextWidths(new char[] { ch }, 0, 1, w);
        return (int) Math.ceil(w[0]);
    }

    @Override
    public int charsWidth(char[] data, int off, int len) {
        if (data == null || len <= 0) return 0;
        return (int) Math.ceil(paint.measureText(data, off, len));
    }

    @Override
    public int stringWidth(String str) {
        if (str == null || str.isEmpty()) return 0;
        return (int) Math.ceil(paint.measureText(str));
    }
}

