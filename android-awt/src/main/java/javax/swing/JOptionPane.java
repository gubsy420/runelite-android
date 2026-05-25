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

    public static int showConfirmDialog(Component parent, Object message) { return CANCEL_OPTION; }
    public static int showConfirmDialog(Component parent, Object message, String title, int optionType) { return CANCEL_OPTION; }
    public static int showConfirmDialog(Component parent, Object message, String title, int optionType, int messageType) { return CANCEL_OPTION; }
    public static int showConfirmDialog(Component parent, Object message, String title, int optionType, int messageType, Icon icon) { return CANCEL_OPTION; }

    public static String showInputDialog(Object message) { return null; }
    public static String showInputDialog(Component parent, Object message) { return null; }
    public static String showInputDialog(Component parent, Object message, Object initialSelectionValue) { return null; }
    public static String showInputDialog(Component parent, Object message, String title, int messageType) { return null; }
    public static Object showInputDialog(Component parent, Object message, String title, int messageType, Icon icon, Object[] selectionValues, Object initialSelectionValue) { return null; }

    public static void showMessageDialog(Component parent, Object message) {}
    public static void showMessageDialog(Component parent, Object message, String title, int messageType) {}
    public static void showMessageDialog(Component parent, Object message, String title, int messageType, Icon icon) {}

    public static int showOptionDialog(Component parent, Object message, String title, int optionType, int messageType, Icon icon, Object[] options, Object initialValue) { return CLOSED_OPTION; }
}
