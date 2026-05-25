package javax.swing.plaf.basic;

import javax.swing.JComponent;
import javax.swing.plaf.ButtonUI;
import javax.swing.plaf.ComponentUI;

public class BasicButtonUI extends ButtonUI {
    public BasicButtonUI() {}
    public static ComponentUI createUI(JComponent c) { return new BasicButtonUI(); }
}
