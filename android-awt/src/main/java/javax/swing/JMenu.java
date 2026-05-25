package javax.swing;

public class JMenu extends JMenuItem {
    private static final long serialVersionUID = 1L;

    public JMenu() {}
    public JMenu(String s) { super(s); }
    public JMenu(String s, boolean b) { super(s); }
    public JMenu(Action a) { super(a); }

    public JMenuItem add(JMenuItem item) { return item; }
    public JMenuItem add(String s) { return new JMenuItem(s); }
    public JMenuItem add(Action a) { return new JMenuItem(a); }
    public void addSeparator() {}
    public JMenuItem insert(JMenuItem mi, int pos) { return mi; }
    public JMenuItem insert(Action a, int pos) { return new JMenuItem(a); }
    public void insertSeparator(int index) {}
    public JMenuItem getItem(int pos) { return null; }
    public int getItemCount() { return 0; }
    public boolean isTearOff() { return false; }
}
