package javax.swing;

import java.awt.AWTKeyStroke;
import java.awt.event.KeyEvent;

public class KeyStroke extends AWTKeyStroke {
    private static final long serialVersionUID = -9060180771037902077L;

    protected KeyStroke() {}

    public static KeyStroke getKeyStroke(char keyChar) {
        KeyStroke k = new KeyStroke();
        k.init(keyChar, KeyEvent.VK_UNDEFINED, 0, true);
        return k;
    }
    public static KeyStroke getKeyStroke(Character keyChar, int modifiers) { return getKeyStroke(keyChar.charValue()); }
    public static KeyStroke getKeyStroke(int keyCode, int modifiers) {
        KeyStroke k = new KeyStroke();
        k.init(KeyEvent.CHAR_UNDEFINED, keyCode, modifiers, false);
        return k;
    }
    public static KeyStroke getKeyStroke(int keyCode, int modifiers, boolean onKeyRelease) {
        KeyStroke k = new KeyStroke();
        k.init(KeyEvent.CHAR_UNDEFINED, keyCode, modifiers, onKeyRelease);
        return k;
    }
    public static KeyStroke getKeyStroke(String s) {
        return new KeyStroke();
    }
    public static KeyStroke getKeyStrokeForEvent(KeyEvent e) {
        return getKeyStroke(e.getKeyCode(), e.getModifiers());
    }
}
