package java.awt.event;

import java.awt.Component;

public class KeyEvent extends InputEvent {
    private static final long serialVersionUID = -2352130953028126954L;

    public static final int KEY_FIRST = 400;
    public static final int KEY_LAST = 402;
    public static final int KEY_TYPED = 400;
    public static final int KEY_PRESSED = 401;
    public static final int KEY_RELEASED = 402;

    public static final int VK_UNDEFINED = 0;
    public static final int VK_ENTER = 10;
    public static final int VK_BACK_SPACE = 8;
    public static final int VK_TAB = 9;
    public static final int VK_CANCEL = 3;
    public static final int VK_CLEAR = 12;
    public static final int VK_SHIFT = 16;
    public static final int VK_CONTROL = 17;
    public static final int VK_ALT = 18;
    public static final int VK_PAUSE = 19;
    public static final int VK_CAPS_LOCK = 20;
    public static final int VK_ESCAPE = 27;
    public static final int VK_SPACE = 32;
    public static final int VK_PAGE_UP = 33;
    public static final int VK_PAGE_DOWN = 34;
    public static final int VK_END = 35;
    public static final int VK_HOME = 36;
    public static final int VK_LEFT = 37;
    public static final int VK_UP = 38;
    public static final int VK_RIGHT = 39;
    public static final int VK_DOWN = 40;
    public static final int VK_COMMA = 44;
    public static final int VK_MINUS = 45;
    public static final int VK_PERIOD = 46;
    public static final int VK_SLASH = 47;
    public static final int VK_0 = 48;
    public static final int VK_1 = 49;
    public static final int VK_2 = 50;
    public static final int VK_3 = 51;
    public static final int VK_4 = 52;
    public static final int VK_5 = 53;
    public static final int VK_6 = 54;
    public static final int VK_7 = 55;
    public static final int VK_8 = 56;
    public static final int VK_9 = 57;
    public static final int VK_SEMICOLON = 59;
    public static final int VK_EQUALS = 61;
    public static final int VK_A = 65;
    public static final int VK_B = 66;
    public static final int VK_C = 67;
    public static final int VK_D = 68;
    public static final int VK_E = 69;
    public static final int VK_F = 70;
    public static final int VK_G = 71;
    public static final int VK_H = 72;
    public static final int VK_I = 73;
    public static final int VK_J = 74;
    public static final int VK_K = 75;
    public static final int VK_L = 76;
    public static final int VK_M = 77;
    public static final int VK_N = 78;
    public static final int VK_O = 79;
    public static final int VK_P = 80;
    public static final int VK_Q = 81;
    public static final int VK_R = 82;
    public static final int VK_S = 83;
    public static final int VK_T = 84;
    public static final int VK_U = 85;
    public static final int VK_V = 86;
    public static final int VK_W = 87;
    public static final int VK_X = 88;
    public static final int VK_Y = 89;
    public static final int VK_Z = 90;
    public static final int VK_OPEN_BRACKET = 91;
    public static final int VK_BACK_SLASH = 92;
    public static final int VK_CLOSE_BRACKET = 93;
    public static final int VK_NUMPAD0 = 96;
    public static final int VK_NUMPAD1 = 97;
    public static final int VK_NUMPAD2 = 98;
    public static final int VK_NUMPAD3 = 99;
    public static final int VK_NUMPAD4 = 100;
    public static final int VK_NUMPAD5 = 101;
    public static final int VK_NUMPAD6 = 102;
    public static final int VK_NUMPAD7 = 103;
    public static final int VK_NUMPAD8 = 104;
    public static final int VK_NUMPAD9 = 105;
    public static final int VK_MULTIPLY = 106;
    public static final int VK_ADD = 107;
    public static final int VK_SEPARATOR = 108;
    public static final int VK_SUBTRACT = 109;
    public static final int VK_DECIMAL = 110;
    public static final int VK_DIVIDE = 111;
    public static final int VK_DELETE = 127;
    public static final int VK_F1 = 112;
    public static final int VK_F2 = 113;
    public static final int VK_F3 = 114;
    public static final int VK_F4 = 115;
    public static final int VK_F5 = 116;
    public static final int VK_F6 = 117;
    public static final int VK_F7 = 118;
    public static final int VK_F8 = 119;
    public static final int VK_F9 = 120;
    public static final int VK_F10 = 121;
    public static final int VK_F11 = 122;
    public static final int VK_F12 = 123;
    public static final int VK_BACK_QUOTE = 192;
    public static final int VK_QUOTE = 222;

    public static int getExtendedKeyCodeForChar(int c) {
        if (c >= '0' && c <= '9') return VK_0 + (c - '0');
        if (c >= 'a' && c <= 'z') return VK_A + (c - 'a');
        if (c >= 'A' && c <= 'Z') return VK_A + (c - 'A');
        switch (c) {
            case '\n': return VK_ENTER;
            case '\b': return VK_BACK_SPACE;
            case '\t': return VK_TAB;
            case ' ': return VK_SPACE;
            case ',': return VK_COMMA;
            case '-': return VK_MINUS;
            case '.': return VK_PERIOD;
            case '/': return VK_SLASH;
            case ';': return VK_SEMICOLON;
            case '=': return VK_EQUALS;
            case '[': return VK_OPEN_BRACKET;
            case '\\': return VK_BACK_SLASH;
            case ']': return VK_CLOSE_BRACKET;
            case '`': return VK_BACK_QUOTE;
            case '\'': return VK_QUOTE;
            default: return VK_UNDEFINED;
        }
    }

    public static final char CHAR_UNDEFINED = 0xFFFF;
    public static final int KEY_LOCATION_UNKNOWN  = 0;
    public static final int KEY_LOCATION_STANDARD = 1;
    public static final int KEY_LOCATION_LEFT     = 2;
    public static final int KEY_LOCATION_RIGHT    = 3;
    public static final int KEY_LOCATION_NUMPAD   = 4;

    private int keyCode;
    private char keyChar;
    private int keyLocation;

    public KeyEvent(Component source, int id, long when, int modifiers, int keyCode, char keyChar) {
        this(source, id, when, modifiers, keyCode, keyChar, KEY_LOCATION_UNKNOWN);
    }

    public KeyEvent(Component source, int id, long when, int modifiers, int keyCode, char keyChar, int keyLocation) {
        super(source, id, when, modifiers);
        this.keyCode = keyCode;
        this.keyChar = keyChar;
        this.keyLocation = keyLocation;
    }

    public int getKeyCode() { return keyCode; }
    public void setKeyCode(int keyCode) { this.keyCode = keyCode; }

    /**
     * JDK API used by {@link net.runelite.client.config.Keybind#matches}. The desktop
     * JDK returns a Unicode-aware "extended" code that differs from {@link #getKeyCode}
     * for non-ASCII layouts; we don't have a keymap, so for our synthesised events the
     * raw key code is fine — Keybind treats it as identity for matching against the
     * configured hotkey, which is also stored as a single int.
     */
    public int getExtendedKeyCode() { return keyCode; }

    public char getKeyChar() { return keyChar; }
    public void setKeyChar(char keyChar) { this.keyChar = keyChar; }

    public int getKeyLocation() { return keyLocation; }

    public boolean isActionKey() {
        switch (keyCode) {
            case VK_HOME:
            case VK_END:
            case VK_PAGE_UP:
            case VK_PAGE_DOWN:
            case VK_UP:
            case VK_DOWN:
            case VK_LEFT:
            case VK_RIGHT:
            case VK_F1:
            case VK_F2:
            case VK_F3:
            case VK_F4:
            case VK_F5:
            case VK_F6:
            case VK_F7:
            case VK_F8:
            case VK_F9:
            case VK_F10:
            case VK_F11:
            case VK_F12:
            case VK_PAUSE:
            case VK_CAPS_LOCK:
                return true;
            default:
                return false;
        }
    }

    public static String getKeyText(int keyCode) {
        return "VK_" + Integer.toHexString(keyCode).toUpperCase(java.util.Locale.ROOT);
    }
}
