package javax.swing.plaf.basic;

import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;

public class BasicToggleButtonUI extends BasicButtonUI {
    public BasicToggleButtonUI() {}
    public static ComponentUI createUI(JComponent c) { return new BasicToggleButtonUI(); }
}
