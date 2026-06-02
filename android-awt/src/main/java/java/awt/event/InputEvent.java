package java.awt.event;

import java.awt.Component;

public abstract class InputEvent extends ComponentEvent {
    private static final long serialVersionUID = -2482525981698309786L;

    public static final int SHIFT_MASK = 1 << 0;
    public static final int CTRL_MASK = 1 << 1;
    public static final int META_MASK = 1 << 2;
    public static final int ALT_MASK = 1 << 3;
    public static final int ALT_GRAPH_MASK = 1 << 5;
    public static final int BUTTON1_MASK = 1 << 4;
    public static final int BUTTON2_MASK = 1 << 3;
    public static final int BUTTON3_MASK = 1 << 2;

    public static final int SHIFT_DOWN_MASK = 1 << 6;
    public static final int CTRL_DOWN_MASK = 1 << 7;
    public static final int META_DOWN_MASK = 1 << 8;
    public static final int ALT_DOWN_MASK = 1 << 9;
    public static final int BUTTON1_DOWN_MASK = 1 << 10;
    public static final int BUTTON2_DOWN_MASK = 1 << 11;
    public static final int BUTTON3_DOWN_MASK = 1 << 12;
    public static final int ALT_GRAPH_DOWN_MASK = 1 << 13;

    private final long when;
    private final int modifiers;

    InputEvent(Component source, int id, long when, int modifiers) {
        super(source, id);
        this.when = when;
        this.modifiers = modifiers;
    }

    public long getWhen() { return when; }
    public int getModifiers() { return modifiers; }
    public int getModifiersEx() { return modifiers; }

    public boolean isShiftDown() { return (modifiers & (SHIFT_MASK | SHIFT_DOWN_MASK)) != 0; }
    public boolean isControlDown() { return (modifiers & (CTRL_MASK | CTRL_DOWN_MASK)) != 0; }
    public boolean isMetaDown() { return (modifiers & (META_MASK | META_DOWN_MASK)) != 0; }
    public boolean isAltDown() { return (modifiers & (ALT_MASK | ALT_DOWN_MASK)) != 0; }
    public boolean isAltGraphDown() { return (modifiers & (ALT_GRAPH_MASK | ALT_GRAPH_DOWN_MASK)) != 0; }

    /**
     * JDK API used by {@link net.runelite.client.config.Keybind#toString}. Translates
     * an extended-modifier mask into a human-readable string like "Ctrl+Shift". On
     * desktop the JDK uses the localized AWT toolkit; we just emit ASCII names. Without
     * this, dragging a {@code WidgetOverlay} for the first time crashes inside
     * {@code OverlayRenderer.mouseReleased} (it tries to format the user-visible
     * "hold X to reposition again" chat message) — the unwind happens BEFORE
     * `resetOverlayManagementMode()` so drag state hangs, which manifests as overlays
     * stuck in a confined subspace until the client deadlocks.
     */
    public static String getModifiersExText(int modifiers) {
        StringBuilder sb = new StringBuilder();
        if ((modifiers & META_DOWN_MASK) != 0) appendPart(sb, "Meta");
        if ((modifiers & CTRL_DOWN_MASK) != 0) appendPart(sb, "Ctrl");
        if ((modifiers & ALT_DOWN_MASK) != 0) appendPart(sb, "Alt");
        if ((modifiers & SHIFT_DOWN_MASK) != 0) appendPart(sb, "Shift");
        if ((modifiers & ALT_GRAPH_DOWN_MASK) != 0) appendPart(sb, "Alt Graph");
        if ((modifiers & BUTTON1_DOWN_MASK) != 0) appendPart(sb, "Button1");
        if ((modifiers & BUTTON2_DOWN_MASK) != 0) appendPart(sb, "Button2");
        if ((modifiers & BUTTON3_DOWN_MASK) != 0) appendPart(sb, "Button3");
        return sb.toString();
    }

    private static void appendPart(StringBuilder sb, String name) {
        if (sb.length() > 0) sb.append('+');
        sb.append(name);
    }

    @Override
    public void consume() { super.consume(); }

    @Override
    public boolean isConsumed() { return super.isConsumed(); }
}
