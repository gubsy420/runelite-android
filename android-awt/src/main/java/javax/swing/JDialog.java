package javax.swing;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.Window;

public class JDialog extends Dialog implements RootPaneContainer {
    private static final long serialVersionUID = 1L;

    public static final int DO_NOTHING_ON_CLOSE = 0;
    public static final int HIDE_ON_CLOSE = 1;
    public static final int DISPOSE_ON_CLOSE = 2;

    protected JRootPane rootPane = new JRootPane();
    protected int defaultCloseOperation = HIDE_ON_CLOSE;

    public JDialog() { super((Frame) null); }
    public JDialog(Frame owner) { super(owner); }
    public JDialog(Frame owner, boolean modal) { super(owner, modal); }
    public JDialog(Frame owner, String title) { super(owner, title); }
    public JDialog(Frame owner, String title, boolean modal) { super(owner, title, modal); }
    public JDialog(Dialog owner) { super((Frame) null); }
    public JDialog(Dialog owner, boolean modal) { super((Frame) null, modal); }
    public JDialog(Dialog owner, String title) { super((Frame) null, title); }
    public JDialog(Dialog owner, String title, boolean modal) { super((Frame) null, title, modal); }
    public JDialog(Window owner) { super((Frame) null); }
    public JDialog(Window owner, String title) { super((Frame) null, title); }
    public JDialog(Window owner, Dialog.ModalityType modalityType) { super((Frame) null); }

    public int getDefaultCloseOperation() { return defaultCloseOperation; }
    public void setDefaultCloseOperation(int op) { this.defaultCloseOperation = op; }
    @Override public JRootPane getRootPane() { return rootPane; }
    @Override public Container getContentPane() { return rootPane.getContentPane(); }
    @Override public void setContentPane(Container c) { rootPane.setContentPane(c); }
    @Override public JLayeredPane getLayeredPane() { return rootPane.getLayeredPane(); }
    @Override public void setLayeredPane(JLayeredPane lp) { rootPane.setLayeredPane(lp); }
    @Override public Component getGlassPane() { return rootPane.getGlassPane(); }
    @Override public void setGlassPane(Component g) { rootPane.setGlassPane(g); }
    public JMenuBar getJMenuBar() { return rootPane.getJMenuBar(); }
    public void setJMenuBar(JMenuBar mb) { rootPane.setJMenuBar(mb); }
}
