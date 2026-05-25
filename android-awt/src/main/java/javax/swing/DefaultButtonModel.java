package javax.swing;

import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.io.Serializable;
import javax.swing.event.ChangeListener;

public class DefaultButtonModel implements ButtonModel, Serializable {
    private static final long serialVersionUID = 5340241038416385893L;
    public static final int ARMED = 1;
    public static final int SELECTED = 2;
    public static final int PRESSED = 4;
    public static final int ENABLED = 8;
    public static final int ROLLOVER = 16;

    protected int stateMask = ENABLED;
    protected String actionCommand;
    protected ButtonGroup group;
    protected int mnemonic;

    @Override public boolean isArmed()    { return (stateMask & ARMED) != 0; }
    @Override public boolean isSelected() { return (stateMask & SELECTED) != 0; }
    @Override public boolean isEnabled()  { return (stateMask & ENABLED) != 0; }
    @Override public boolean isPressed()  { return (stateMask & PRESSED) != 0; }
    @Override public boolean isRollover() { return (stateMask & ROLLOVER) != 0; }
    @Override public void setArmed(boolean b)    { stateMask = b ? stateMask | ARMED : stateMask & ~ARMED; }
    @Override public void setSelected(boolean b) { stateMask = b ? stateMask | SELECTED : stateMask & ~SELECTED; }
    @Override public void setEnabled(boolean b)  { stateMask = b ? stateMask | ENABLED : stateMask & ~ENABLED; }
    @Override public void setPressed(boolean b)  { stateMask = b ? stateMask | PRESSED : stateMask & ~PRESSED; }
    @Override public void setRollover(boolean b) { stateMask = b ? stateMask | ROLLOVER : stateMask & ~ROLLOVER; }
    @Override public void setMnemonic(int key)   { this.mnemonic = key; }
    @Override public int getMnemonic()           { return mnemonic; }
    @Override public void setActionCommand(String s) { actionCommand = s; }
    @Override public String getActionCommand()       { return actionCommand; }
    @Override public void setGroup(ButtonGroup g) { this.group = g; }
    public ButtonGroup getGroup() { return group; }

    @Override public Object[] getSelectedObjects() { return new Object[0]; }
    @Override public void addActionListener(ActionListener l) {}
    @Override public void removeActionListener(ActionListener l) {}
    @Override public void addItemListener(ItemListener l) {}
    @Override public void removeItemListener(ItemListener l) {}
    @Override public void addChangeListener(ChangeListener l) {}
    @Override public void removeChangeListener(ChangeListener l) {}
}
