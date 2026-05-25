package java.awt.event;

import java.awt.AWTEvent;

public class ActionEvent extends AWTEvent {
    private static final long serialVersionUID = -7671078796273832149L;

    public static final int SHIFT_MASK = 1 << 0;
    public static final int CTRL_MASK = 1 << 1;
    public static final int META_MASK = 1 << 2;
    public static final int ALT_MASK = 1 << 3;

    public static final int ACTION_FIRST = 1001;
    public static final int ACTION_LAST = 1001;
    public static final int ACTION_PERFORMED = 1001;

    private final String actionCommand;
    private final long when;
    private final int modifiers;

    public ActionEvent(Object source, int id, String command) {
        this(source, id, command, 0L, 0);
    }

    public ActionEvent(Object source, int id, String command, int modifiers) {
        this(source, id, command, 0L, modifiers);
    }

    public ActionEvent(Object source, int id, String command, long when, int modifiers) {
        super(source, id);
        this.actionCommand = command;
        this.when = when;
        this.modifiers = modifiers;
    }

    public String getActionCommand() {
        return actionCommand;
    }

    public long getWhen() {
        return when;
    }

    public int getModifiers() {
        return modifiers;
    }
}
