package javax.swing;

import java.awt.event.AdjustmentListener;

public class JScrollBar extends JComponent implements SwingConstants {
    private static final long serialVersionUID = 1L;

    protected int orientation = VERTICAL;
    protected int unitIncrement = 1;
    protected int blockIncrement = 10;
    protected BoundedRangeModel model = new DefaultBoundedRangeModel();

    public JScrollBar() {}
    public JScrollBar(int orientation) { this.orientation = orientation; }
    public JScrollBar(int orientation, int value, int extent, int min, int max) {
        this.orientation = orientation;
        model = new DefaultBoundedRangeModel(value, extent, min, max);
    }

    public int getOrientation() { return orientation; }
    public void setOrientation(int orientation) { this.orientation = orientation; }
    public BoundedRangeModel getModel() { return model; }
    public void setModel(BoundedRangeModel newModel) { this.model = newModel; }
    public int getUnitIncrement() { return unitIncrement; }
    public int getUnitIncrement(int direction) { return unitIncrement; }
    public void setUnitIncrement(int u) { this.unitIncrement = u; }
    public int getBlockIncrement() { return blockIncrement; }
    public int getBlockIncrement(int direction) { return blockIncrement; }
    public void setBlockIncrement(int b) { this.blockIncrement = b; }
    public int getValue() { return model.getValue(); }
    public void setValue(int value) { model.setValue(value); }
    public int getVisibleAmount() { return model.getExtent(); }
    public void setVisibleAmount(int extent) { model.setExtent(extent); }
    public int getMinimum() { return model.getMinimum(); }
    public void setMinimum(int min) { model.setMinimum(min); }
    public int getMaximum() { return model.getMaximum(); }
    public void setMaximum(int max) { model.setMaximum(max); }
    public boolean getValueIsAdjusting() { return model.getValueIsAdjusting(); }
    public void setValueIsAdjusting(boolean b) { model.setValueIsAdjusting(b); }
    public void setValues(int newValue, int newExtent, int newMin, int newMax) {
        model.setRangeProperties(newValue, newExtent, newMin, newMax, model.getValueIsAdjusting());
    }
    public void addAdjustmentListener(AdjustmentListener l) {}
    public void removeAdjustmentListener(AdjustmentListener l) {}
}
