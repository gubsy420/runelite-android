package javax.swing;

import javax.swing.event.ChangeListener;

public interface SpinnerModel {
    Object getValue();
    void setValue(Object value);
    Object getNextValue();
    Object getPreviousValue();
    void addChangeListener(ChangeListener l);
    void removeChangeListener(ChangeListener l);
}
