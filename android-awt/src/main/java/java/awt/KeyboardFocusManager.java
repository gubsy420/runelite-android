package java.awt;

import java.awt.event.KeyEvent;

public abstract class KeyboardFocusManager {
    public static final int FORWARD_TRAVERSAL_KEYS = 0;
    public static final int BACKWARD_TRAVERSAL_KEYS = 1;
    public static final int UP_CYCLE_TRAVERSAL_KEYS = 2;
    public static final int DOWN_CYCLE_TRAVERSAL_KEYS = 3;

    private static KeyboardFocusManager current;

    protected KeyboardFocusManager() {}

    public static synchronized KeyboardFocusManager getCurrentKeyboardFocusManager() {
        if (current == null) current = new DefaultKFM();
        return current;
    }

    public static synchronized void setCurrentKeyboardFocusManager(KeyboardFocusManager mgr) {
        current = mgr;
    }

    public Component getFocusOwner() { return null; }
    public Window getFocusedWindow() { return null; }
    public Window getActiveWindow() { return null; }
    public void clearGlobalFocusOwner() {}

    public abstract boolean dispatchEvent(AWTEvent e);
    public abstract boolean dispatchKeyEvent(KeyEvent e);
    public abstract boolean postProcessKeyEvent(KeyEvent e);
    public abstract void processKeyEvent(Component focusedComponent, KeyEvent e);

    public void addKeyEventDispatcher(KeyEventDispatcher dispatcher) {}
    public void removeKeyEventDispatcher(KeyEventDispatcher dispatcher) {}

    private static final class DefaultKFM extends KeyboardFocusManager {
        @Override public boolean dispatchEvent(AWTEvent e) { return false; }
        @Override public boolean dispatchKeyEvent(KeyEvent e) { return false; }
        @Override public boolean postProcessKeyEvent(KeyEvent e) { return false; }
        @Override public void processKeyEvent(Component c, KeyEvent e) {}
    }
}
