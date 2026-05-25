package javax.swing;

import javax.swing.event.ChangeListener;

public class SpinnerNumberModel implements SpinnerModel {
    private Number value, stepSize = 1;
    private Comparable<?> minimum, maximum;

    public SpinnerNumberModel() { this(0, null, null, 1); }
    public SpinnerNumberModel(int value, int min, int max, int step) {
        this((Number) value, min, max, step);
    }
    public SpinnerNumberModel(double value, double min, double max, double step) {
        this((Number) value, min, max, step);
    }
    @SuppressWarnings({"rawtypes", "unchecked"})
    public SpinnerNumberModel(Number value, Comparable minimum, Comparable maximum, Number stepSize) {
        this.value = value;
        this.minimum = minimum;
        this.maximum = maximum;
        this.stepSize = stepSize;
    }

    private final java.util.List<ChangeListener> listeners = new java.util.ArrayList<>();

    @Override public Object getValue() { return value; }
    @Override public void setValue(Object v) {
        Number newValue = (Number) v;
        if (java.util.Objects.equals(this.value, newValue)) return;
        this.value = newValue;
        javax.swing.event.ChangeEvent ev = new javax.swing.event.ChangeEvent(this);
        for (ChangeListener l : new java.util.ArrayList<>(listeners)) {
            try { l.stateChanged(ev); } catch (Throwable ignored) {}
        }
    }
    @Override public Object getNextValue() { return value.doubleValue() + stepSize.doubleValue(); }
    @Override public Object getPreviousValue() { return value.doubleValue() - stepSize.doubleValue(); }
    public Number getNumber() { return value; }
    public Comparable<?> getMinimum() { return minimum; }
    public Comparable<?> getMaximum() { return maximum; }
    public Number getStepSize() { return stepSize; }
    public void setMinimum(Comparable<?> m) { this.minimum = m; }
    public void setMaximum(Comparable<?> m) { this.maximum = m; }
    public void setStepSize(Number s) { this.stepSize = s; }
    @Override public void addChangeListener(ChangeListener l) { if (l != null) listeners.add(l); }
    @Override public void removeChangeListener(ChangeListener l) { listeners.remove(l); }
}
