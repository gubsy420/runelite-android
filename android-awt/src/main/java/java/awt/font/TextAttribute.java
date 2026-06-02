package java.awt.font;

import java.text.AttributedCharacterIterator;

/**
 * Stub of {@link java.awt.font.TextAttribute}. We don't actually shape glyphs with these
 * attributes — Android's Paint handles styling differently — but plugin code (quest-helper's
 * Fonts.java, etc.) uses the well-known field constants as map keys and the type is required
 * to exist for static-init chains to succeed.
 */
public final class TextAttribute extends AttributedCharacterIterator.Attribute {
    private static final long serialVersionUID = 7744112784117861702L;

    protected TextAttribute(String name) { super(name); }

    public static final TextAttribute FAMILY = new TextAttribute("family");
    public static final TextAttribute WEIGHT = new TextAttribute("weight");
    public static final TextAttribute WIDTH = new TextAttribute("width");
    public static final TextAttribute POSTURE = new TextAttribute("posture");
    public static final TextAttribute SIZE = new TextAttribute("size");
    public static final TextAttribute TRANSFORM = new TextAttribute("transform");
    public static final TextAttribute SUPERSCRIPT = new TextAttribute("superscript");
    public static final TextAttribute FONT = new TextAttribute("font");
    public static final TextAttribute CHAR_REPLACEMENT = new TextAttribute("char_replacement");

    public static final TextAttribute FOREGROUND = new TextAttribute("foreground");
    public static final TextAttribute BACKGROUND = new TextAttribute("background");
    public static final TextAttribute UNDERLINE = new TextAttribute("underline");
    public static final TextAttribute STRIKETHROUGH = new TextAttribute("strikethrough");

    public static final TextAttribute RUN_DIRECTION = new TextAttribute("run_direction");
    public static final TextAttribute BIDI_EMBEDDING = new TextAttribute("bidi_embedding");
    public static final TextAttribute JUSTIFICATION = new TextAttribute("justification");

    public static final TextAttribute INPUT_METHOD_HIGHLIGHT = new TextAttribute("input method highlight");
    public static final TextAttribute INPUT_METHOD_UNDERLINE = new TextAttribute("input method underline");

    public static final TextAttribute SWAP_COLORS = new TextAttribute("swap_colors");
    public static final TextAttribute NUMERIC_SHAPING = new TextAttribute("numeric_shaping");
    public static final TextAttribute KERNING = new TextAttribute("kerning");
    public static final TextAttribute LIGATURES = new TextAttribute("ligatures");
    public static final TextAttribute TRACKING = new TextAttribute("tracking");

    // Value constants. These are sentinel Numbers/Booleans that real AWT uses to mark
    // styling; we just need identity-comparable objects with the expected boxed types.
    public static final Float WEIGHT_EXTRA_LIGHT = 0.5f;
    public static final Float WEIGHT_LIGHT = 0.75f;
    public static final Float WEIGHT_DEMILIGHT = 0.875f;
    public static final Float WEIGHT_REGULAR = 1.0f;
    public static final Float WEIGHT_SEMIBOLD = 1.25f;
    public static final Float WEIGHT_MEDIUM = 1.5f;
    public static final Float WEIGHT_DEMIBOLD = 1.75f;
    public static final Float WEIGHT_BOLD = 2.0f;
    public static final Float WEIGHT_HEAVY = 2.25f;
    public static final Float WEIGHT_EXTRABOLD = 2.5f;
    public static final Float WEIGHT_ULTRABOLD = 2.75f;

    public static final Float WIDTH_CONDENSED = 0.75f;
    public static final Float WIDTH_SEMI_CONDENSED = 0.875f;
    public static final Float WIDTH_REGULAR = 1.0f;
    public static final Float WIDTH_SEMI_EXTENDED = 1.25f;
    public static final Float WIDTH_EXTENDED = 1.5f;

    public static final Float POSTURE_REGULAR = 0.0f;
    public static final Float POSTURE_OBLIQUE = 0.20f;

    public static final Float SUPERSCRIPT_SUPER = (float) 1;
    public static final Float SUPERSCRIPT_SUB = (float) -1;

    public static final Integer UNDERLINE_ON = 0;
    public static final Integer UNDERLINE_LOW_ONE_PIXEL = 1;
    public static final Integer UNDERLINE_LOW_TWO_PIXEL = 2;
    public static final Integer UNDERLINE_LOW_DOTTED = 3;
    public static final Integer UNDERLINE_LOW_GRAY = 4;
    public static final Integer UNDERLINE_LOW_DASHED = 5;

    public static final Boolean STRIKETHROUGH_ON = true;

    public static final Boolean SWAP_COLORS_ON = true;

    public static final Integer LIGATURES_ON = 1;

    public static final Boolean KERNING_ON = Boolean.TRUE;
}
