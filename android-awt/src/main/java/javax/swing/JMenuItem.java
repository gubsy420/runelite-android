package javax.swing;

public class JMenuItem extends AbstractButton implements MenuElement {
    private static final long serialVersionUID = 1L;

    public JMenuItem() {}
    public JMenuItem(String text) { setText(text); }
    public JMenuItem(Icon icon) { setIcon(icon); }
    public JMenuItem(Action a) { setAction(a); }
    public JMenuItem(String text, Icon icon) { setText(text); setIcon(icon); }
    public JMenuItem(String text, int mnemonic) { setText(text); setMnemonic(mnemonic); }

    public KeyStroke getAccelerator() { return null; }
    public void setAccelerator(KeyStroke keyStroke) {}
    public boolean isArmed() { return getModel().isArmed(); }
    public void setArmed(boolean b) { getModel().setArmed(b); }

    // MenuElement — a leaf item has no sub-elements; JMenu overrides getSubElements().
    @Override public void menuSelectionChanged(boolean isIncluded) {}
    @Override public MenuElement[] getSubElements() { return new MenuElement[0]; }
    @Override public java.awt.Component getComponent() { return this; }
}
