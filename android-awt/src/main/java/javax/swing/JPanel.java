package javax.swing;

import java.awt.FlowLayout;
import java.awt.LayoutManager;

public class JPanel extends JComponent {
    private static final long serialVersionUID = 1L;

    public JPanel() { this(new FlowLayout(), true); }
    public JPanel(LayoutManager layout) { this(layout, true); }
    public JPanel(boolean isDoubleBuffered) { this(new FlowLayout(), isDoubleBuffered); }
    public JPanel(LayoutManager layout, boolean isDoubleBuffered) {
        setLayout(layout);
        setDoubleBuffered(isDoubleBuffered);
        setOpaque(true);
    }
}
