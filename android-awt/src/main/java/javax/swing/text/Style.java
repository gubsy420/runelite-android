package javax.swing.text;

import javax.swing.event.ChangeListener;

public interface Style extends MutableAttributeSet {
    String getName();
    void addChangeListener(ChangeListener l);
    void removeChangeListener(ChangeListener l);
}
