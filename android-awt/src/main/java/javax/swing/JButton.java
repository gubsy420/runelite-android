package javax.swing;

public class JButton extends AbstractButton {
    private static final long serialVersionUID = -1602050342864801480L;

    public JButton() { this(null, null); }
    public JButton(Icon icon) { this(null, icon); }
    public JButton(String text) { this(text, null); }
    public JButton(Action a) { setAction(a); }
    public JButton(String text, Icon icon) {
        setText(text); setIcon(icon);
    }

    public boolean isDefaultButton() { return false; }
    public boolean isDefaultCapable() { return true; }
    public void setDefaultCapable(boolean d) {}

    /** Typed overload — plugins (e.g. via SwingUtil.removeButtonDecorations) call this. */
    public void setUI(javax.swing.plaf.ButtonUI ui) { super.setUI(ui); }
}
