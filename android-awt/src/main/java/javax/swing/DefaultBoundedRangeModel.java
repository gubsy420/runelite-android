package javax.swing;

import java.io.Serializable;
import javax.swing.event.ChangeListener;

public class DefaultBoundedRangeModel implements BoundedRangeModel, Serializable {
    private static final long serialVersionUID = 5034068491295259790L;
    private int value, extent, min, max = 100;
    private boolean adjusting;

    public DefaultBoundedRangeModel() {}
    public DefaultBoundedRangeModel(int value, int extent, int min, int max) {
        this.value = value; this.extent = extent; this.min = min; this.max = max;
    }

    @Override public int getValue() { return value; }
    @Override public void setValue(int v) { value = v; }
    @Override public int getMinimum() { return min; }
    @Override public void setMinimum(int v) { min = v; }
    @Override public int getMaximum() { return max; }
    @Override public void setMaximum(int v) { max = v; }
    @Override public int getExtent() { return extent; }
    @Override public void setExtent(int v) { extent = v; }
    @Override public boolean getValueIsAdjusting() { return adjusting; }
    @Override public void setValueIsAdjusting(boolean b) { adjusting = b; }
    @Override public void setRangeProperties(int value, int extent, int min, int max, boolean adjusting) {
        this.value = value; this.extent = extent; this.min = min; this.max = max; this.adjusting = adjusting;
    }
    @Override public void addChangeListener(ChangeListener x) {}
    @Override public void removeChangeListener(ChangeListener x) {}
}
