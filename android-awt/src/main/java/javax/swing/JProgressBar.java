package javax.swing;

import javax.swing.event.ChangeListener;

public class JProgressBar extends JComponent implements SwingConstants {
    private static final long serialVersionUID = 1L;
    protected BoundedRangeModel model = new DefaultBoundedRangeModel();
    protected int orientation = HORIZONTAL;
    protected boolean stringPainted;
    protected boolean indeterminate;
    protected String progressString;

    public JProgressBar() {}
    public JProgressBar(int orient) { this.orientation = orient; }
    public JProgressBar(int min, int max) { this(); setMinimum(min); setMaximum(max); }
    public JProgressBar(int orient, int min, int max) { this(orient); setMinimum(min); setMaximum(max); }
    public JProgressBar(BoundedRangeModel newModel) { this.model = newModel; }

    public int getOrientation() { return orientation; }
    public void setOrientation(int o) { this.orientation = o; }
    public int getValue() { return model.getValue(); }
    public void setValue(int n) { model.setValue(n); }
    public int getMinimum() { return model.getMinimum(); }
    public void setMinimum(int n) { model.setMinimum(n); }
    public int getMaximum() { return model.getMaximum(); }
    public void setMaximum(int n) { model.setMaximum(n); }
    public boolean isStringPainted() { return stringPainted; }
    public void setStringPainted(boolean b) { stringPainted = b; }
    public String getString() { return progressString; }
    public void setString(String s) { progressString = s; }
    public boolean isIndeterminate() { return indeterminate; }
    public void setIndeterminate(boolean b) { indeterminate = b; }
    public BoundedRangeModel getModel() { return model; }
    public void setModel(BoundedRangeModel m) { this.model = m; }
    public double getPercentComplete() {
        double range = model.getMaximum() - model.getMinimum();
        return range == 0 ? 0 : (model.getValue() - model.getMinimum()) / range;
    }
    public void addChangeListener(ChangeListener l) {}
    public void removeChangeListener(ChangeListener l) {}
    public void setUI(javax.swing.plaf.ProgressBarUI ui) { super.setUI(ui); }
    public javax.swing.plaf.ProgressBarUI getUI() { return (javax.swing.plaf.ProgressBarUI) super.getUI(); }
}
