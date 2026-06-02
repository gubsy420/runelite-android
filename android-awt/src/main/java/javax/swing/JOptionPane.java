package javax.swing;

import java.awt.Component;

public class JOptionPane extends JComponent {
    private static final long serialVersionUID = 1L;

    public static final int DEFAULT_OPTION = -1;
    public static final int YES_NO_OPTION = 0;
    public static final int YES_NO_CANCEL_OPTION = 1;
    public static final int OK_CANCEL_OPTION = 2;

    public static final int YES_OPTION = 0;
    public static final int NO_OPTION = 1;
    public static final int CANCEL_OPTION = 2;
    public static final int OK_OPTION = 0;
    public static final int CLOSED_OPTION = -1;

    public static final int ERROR_MESSAGE = 0;
    public static final int INFORMATION_MESSAGE = 1;
    public static final int WARNING_MESSAGE = 2;
    public static final int QUESTION_MESSAGE = 3;
    public static final int PLAIN_MESSAGE = -1;

    // Android has no modal Swing dialogs; we don't synthesise one. Returning CANCEL/CLOSED
    // for every confirmation meant Reset / Delete / etc. silently never executed — the
    // user tapping the button got nothing. Default to the AFFIRMATIVE response so taps on
    // buttons that route through JOptionPane confirm work as expected (the user already
    // chose to tap the action, they don't need a second confirmation tap on mobile).

    public static int showConfirmDialog(Component parent, Object message) { return YES_OPTION; }
    public static int showConfirmDialog(Component parent, Object message, String title, int optionType) { return affirmativeFor(optionType); }
    public static int showConfirmDialog(Component parent, Object message, String title, int optionType, int messageType) { return affirmativeFor(optionType); }
    public static int showConfirmDialog(Component parent, Object message, String title, int optionType, int messageType, Icon icon) { return affirmativeFor(optionType); }

    public static String showInputDialog(Object message) { return null; }
    public static String showInputDialog(Component parent, Object message) { return null; }
    public static String showInputDialog(Component parent, Object message, Object initialSelectionValue) { return null; }
    public static String showInputDialog(Component parent, Object message, String title, int messageType) { return null; }
    public static Object showInputDialog(Component parent, Object message, String title, int messageType, Icon icon, Object[] selectionValues, Object initialSelectionValue) { return null; }

    public static void showMessageDialog(Component parent, Object message) {}
    public static void showMessageDialog(Component parent, Object message, String title, int messageType) {}
    public static void showMessageDialog(Component parent, Object message, String title, int messageType, Icon icon) {}

    /**
     * Returns the index of the first option label that looks affirmative ("Yes" / "OK" /
     * "Reset" / "Continue") so callers like ConfigPanel's Reset button actually proceed.
     * Falls back to 0 (the first option) if nothing matches, since callers typically pass
     * the affirmative choice first.
     */
    public static int showOptionDialog(Component parent, Object message, String title, int optionType, int messageType, Icon icon, Object[] options, Object initialValue) {
        if (options == null || options.length == 0) return YES_OPTION;
        for (int i = 0; i < options.length; i++) {
            Object o = options[i];
            if (o == null) continue;
            String s = o.toString();
            if (s.equalsIgnoreCase("yes")
                || s.equalsIgnoreCase("ok")
                || s.equalsIgnoreCase("reset")
                || s.equalsIgnoreCase("continue")
                || s.equalsIgnoreCase("delete")
                || s.equalsIgnoreCase("remove")) {
                return i;
            }
        }
        return 0;
    }

    private static int affirmativeFor(int optionType) {
        // YES_NO / YES_NO_CANCEL → YES_OPTION (=0); OK_CANCEL → OK_OPTION (=0).
        // Either way the affirmative response is index 0 in real Swing, so just return that.
        return YES_OPTION;
    }
}
