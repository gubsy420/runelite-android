package javax.swing;

import java.awt.Component;
import java.awt.Container;

public class JRootPane extends JComponent {
    private static final long serialVersionUID = 1L;

    public static final int NONE = 0;
    public static final int FRAME = 1;
    public static final int PLAIN_DIALOG = 2;
    public static final int INFORMATION_DIALOG = 3;
    public static final int ERROR_DIALOG = 4;
    public static final int COLOR_CHOOSER_DIALOG = 5;
    public static final int FILE_CHOOSER_DIALOG = 6;
    public static final int QUESTION_DIALOG = 7;
    public static final int WARNING_DIALOG = 8;

    protected Container contentPane = new JPanel(new java.awt.BorderLayout());
    protected JLayeredPane layeredPane = new JLayeredPane();
    protected Component glassPane = new JPanel();
    protected JMenuBar menuBar;

    public JRootPane() {
        setLayout(new java.awt.BorderLayout());
        // contentPane fills the rootPane — real Swing layers via JLayeredPane,
        // but a single-layer model is enough for runelite-client's chrome.
        super.add(contentPane, java.awt.BorderLayout.CENTER);
    }

    public Container getContentPane() { return contentPane; }
    public void setContentPane(Container c) {
        if (this.contentPane != null) super.remove(this.contentPane);
        this.contentPane = c;
        if (c != null) super.add(c, java.awt.BorderLayout.CENTER);
    }

    @Override
    public java.awt.Component add(java.awt.Component comp) {
        // Real JRootPane forwards add() to contentPane unless the caller goes through super.
        return contentPane.add(comp);
    }
    @Override
    public java.awt.Component add(java.awt.Component comp, int index) {
        return contentPane.add(comp, index);
    }
    @Override
    public void add(java.awt.Component comp, Object constraints) {
        contentPane.add(comp, constraints);
    }

    @Override
    public void setBounds(int x, int y, int w, int h) {
        super.setBounds(x, y, w, h);
        doLayout();
    }
    @Override
    public void setSize(int w, int h) {
        super.setSize(w, h);
        doLayout();
    }
    public JLayeredPane getLayeredPane() { return layeredPane; }
    public void setLayeredPane(JLayeredPane lp) { this.layeredPane = lp; }
    public Component getGlassPane() { return glassPane; }
    public void setGlassPane(Component g) { this.glassPane = g; }
    public JMenuBar getJMenuBar() { return menuBar; }
    public void setJMenuBar(JMenuBar menu) {
        if (this.menuBar != null) super.remove(this.menuBar);
        this.menuBar = menu;
        if (menu != null) super.add(menu, java.awt.BorderLayout.NORTH);
    }
    public JButton getDefaultButton() { return null; }
    public void setDefaultButton(JButton defaultButton) {}
    public int getWindowDecorationStyle() { return NONE; }
    public void setWindowDecorationStyle(int style) {}
}
