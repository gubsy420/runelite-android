package javax.swing;

import java.awt.ItemSelectable;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import javax.swing.event.ChangeListener;

public interface ButtonModel extends ItemSelectable {
    boolean isArmed();
    boolean isSelected();
    boolean isEnabled();
    boolean isPressed();
    boolean isRollover();
    void setArmed(boolean b);
    void setSelected(boolean b);
    void setEnabled(boolean b);
    void setPressed(boolean b);
    void setRollover(boolean b);
    void setMnemonic(int key);
    int getMnemonic();
    void setActionCommand(String s);
    String getActionCommand();
    void setGroup(ButtonGroup group);
    void addActionListener(ActionListener l);
    void removeActionListener(ActionListener l);
    void addItemListener(ItemListener l);
    void removeItemListener(ItemListener l);
    void addChangeListener(ChangeListener l);
    void removeChangeListener(ChangeListener l);
}
