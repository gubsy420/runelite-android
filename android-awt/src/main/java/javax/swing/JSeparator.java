package javax.swing;

public class JSeparator extends JComponent implements SwingConstants {
    private static final long serialVersionUID = 1L;
    private int orientation;

    public JSeparator() { this(HORIZONTAL); }
    public JSeparator(int orientation) { this.orientation = orientation; }

    public int getOrientation() { return orientation; }
    public void setOrientation(int orientation) { this.orientation = orientation; }
}
