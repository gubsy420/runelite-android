package net.runelite.awt.impl;

import java.awt.Font;
import java.awt.FontMetrics;

/**
 * Font metrics backed by Android's {@link android.graphics.Paint}. Real layouts (BoxLayout,
 * GridLayout, ClientUI.Layout) read stringWidth/getHeight/getAscent to size labels; with
 * the default JDK FontMetrics base class everything would report 0 and children collapse.
 */
public final class BufferedImageFontMetrics extends FontMetrics {
    private final android.graphics.Paint paint;
    private final android.graphics.Paint.FontMetrics afm;

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
        int style = font.getStyle();
        android.graphics.Typeface tf;
        if (style == Font.BOLD) tf = android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, android.graphics.Typeface.BOLD);
        else if (style == Font.ITALIC) tf = android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, android.graphics.Typeface.ITALIC);
        else if (style == (Font.BOLD | Font.ITALIC)) tf = android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, android.graphics.Typeface.BOLD_ITALIC);
        else tf = android.graphics.Typeface.DEFAULT;
        paint.setTypeface(tf);
        afm = paint.getFontMetrics();
    }

    @Override
    public int getAscent()  { return Math.max(0, (int) Math.ceil(-afm.ascent)); }
    @Override
    public int getDescent() { return Math.max(0, (int) Math.ceil(afm.descent)); }
    @Override
    public int getLeading() { return Math.max(0, (int) Math.ceil(afm.leading)); }
    @Override
    public int getHeight()  { return getAscent() + getDescent() + getLeading(); }

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
