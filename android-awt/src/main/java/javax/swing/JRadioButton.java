package javax.swing;

public class JRadioButton extends JToggleButton {
    private static final long serialVersionUID = 1L;

    public JRadioButton() { this(null, null, false); }
    public JRadioButton(Icon icon) { this(null, icon, false); }
    public JRadioButton(Icon icon, boolean selected) { this(null, icon, selected); }
    public JRadioButton(String text) { this(text, null, false); }
    public JRadioButton(String text, boolean selected) { this(text, null, selected); }
    public JRadioButton(Action a) { super(a); }
    public JRadioButton(String text, Icon icon) { this(text, icon, false); }
    public JRadioButton(String text, Icon icon, boolean selected) { super(text, icon, selected); }
}
