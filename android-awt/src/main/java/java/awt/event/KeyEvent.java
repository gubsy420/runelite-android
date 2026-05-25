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

    public char getKeyChar() { return keyChar; }
    public void setKeyChar(char keyChar) { this.keyChar = keyChar; }

    public int getKeyLocation() { return keyLocation; }

    public boolean isActionKey() { return false; }

    public static String getKeyText(int keyCode) {
        return "VK_" + Integer.toHexString(keyCode).toUpperCase(java.util.Locale.ROOT);
    }
}
