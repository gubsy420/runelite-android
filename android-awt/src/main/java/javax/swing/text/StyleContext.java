package javax.swing.text;

import java.awt.Color;
import java.awt.Font;
import java.io.Serializable;

public class StyleContext implements Serializable {
    private static final long serialVersionUID = 8042858831190784241L;

    public static final String DEFAULT_STYLE = "default";
    private static StyleContext shared;

    public static StyleContext getDefaultStyleContext() {
        if (shared == null) shared = new StyleContext();
        return shared;
    }

    public Style addStyle(String nm, Style parent) { return null; }
    public void removeStyle(String nm) {}
    public Style getStyle(String nm) { return null; }
    public Font getFont(String family, int style, int size) { return new Font(family, style, size); }
    public Font getFont(AttributeSet attr) { return new Font(Font.DIALOG, Font.PLAIN, 12); }
    public Color getForeground(AttributeSet attr) { return Color.BLACK; }
    public Color getBackground(AttributeSet attr) { return Color.WHITE; }
    public AttributeSet addAttribute(AttributeSet old, Object name, Object value) { return old; }
    public AttributeSet addAttributes(AttributeSet old, AttributeSet attr) { return old; }
    public AttributeSet removeAttribute(AttributeSet old, Object name) { return old; }
}
