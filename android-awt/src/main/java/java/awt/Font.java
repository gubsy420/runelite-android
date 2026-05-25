package java.awt;

import java.io.Serializable;

public class Font implements Serializable {
    private static final long serialVersionUID = -4206021311591459213L;

    public static final int PLAIN = 0;
    public static final int BOLD = 1;
    public static final int ITALIC = 2;

    public static final String DIALOG = "Dialog";
    public static final String DIALOG_INPUT = "DialogInput";
    public static final String SANS_SERIF = "SansSerif";
    public static final String SERIF = "Serif";
    public static final String MONOSPACED = "Monospaced";

    private final String name;
    private final int style;
    private final int size;

    public Font(String name, int style, int size) {
        this.name = name != null ? name : "Default";
        this.style = style;
        this.size = size;
    }

    public String getName()   { return name; }
    public String getFamily() { return name; }
    public int getStyle()     { return style; }
    public int getSize()      { return size; }
    public float getSize2D()  { return size; }

    public boolean isPlain()  { return style == PLAIN; }
    public boolean isBold()   { return (style & BOLD) != 0; }
    public boolean isItalic() { return (style & ITALIC) != 0; }

    public static final int TRUETYPE_FONT = 0;
    public static final int TYPE1_FONT = 1;

    /**
     * OpenJDK reads a TrueType blob and registers it; on Android we have no font
     * registry to plug into. Drain the stream so callers' resource cleanup is sane and
     * return a default Font — glyph data is silently ignored.
     */
    public static Font createFont(int fontFormat, java.io.InputStream fontStream) throws java.io.IOException, FontFormatException {
        if (fontStream != null) {
            byte[] buf = new byte[8192];
            while (fontStream.read(buf) > 0) { /* drain */ }
        }
        return new Font(Font.DIALOG, Font.PLAIN, 12);
    }

    public static Font createFont(int fontFormat, java.io.File fontFile) throws java.io.IOException, FontFormatException {
        return new Font(Font.DIALOG, Font.PLAIN, 12);
    }

    public Font deriveFont(int style) {
        return new Font(name, style, size);
    }

    public Font deriveFont(float size) {
        return new Font(name, this.style, (int) size);
    }

    public Font deriveFont(int style, float size) {
        return new Font(name, style, (int) size);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Font) {
            Font f = (Font) obj;
            return size == f.size && style == f.style && name.equals(f.name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return name.hashCode() ^ style ^ size;
    }

    @Override
    public String toString() {
        return getClass().getName() + "[family=" + name + ",style=" + style + ",size=" + size + "]";
    }
}
