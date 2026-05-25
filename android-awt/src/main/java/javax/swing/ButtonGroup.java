package javax.swing;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class ButtonGroup implements Serializable {
    private static final long serialVersionUID = 1L;
    protected List<AbstractButton> buttons = new ArrayList<>();
    ButtonModel selection;

    public ButtonGroup() {}

    public void add(AbstractButton b) {
        if (b != null) {
            buttons.add(b);
            b.getModel().setGroup(this);
        }
    }
    public void remove(AbstractButton b) {
        if (b != null) {
            buttons.remove(b);
            b.getModel().setGroup(null);
        }
    }
    public void clearSelection() {
        if (selection != null) { selection.setSelected(false); selection = null; }
    }
    public Enumeration<AbstractButton> getElements() {
        return java.util.Collections.enumeration(buttons);
    }
    public ButtonModel getSelection() { return selection; }
    public void setSelected(ButtonModel m, boolean b) {
        if (b) selection = m;
        else if (selection == m) selection = null;
    }
    public boolean isSelected(ButtonModel m) { return m == selection; }
    public int getButtonCount() { return buttons.size(); }
}
