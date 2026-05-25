package javax.swing;

import javax.swing.event.ChangeListener;

public interface BoundedRangeModel {
    int getValue();
    void setValue(int newValue);
    int getMinimum();
    void setMinimum(int newMinimum);
    int getMaximum();
    void setMaximum(int newMaximum);
    int getExtent();
    void setExtent(int newExtent);
    boolean getValueIsAdjusting();
    void setValueIsAdjusting(boolean b);
    void setRangeProperties(int value, int extent, int min, int max, boolean adjusting);
    void addChangeListener(ChangeListener x);
    void removeChangeListener(ChangeListener x);
}
