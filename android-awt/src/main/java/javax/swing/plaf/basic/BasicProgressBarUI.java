package javax.swing.plaf.basic;

import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.ProgressBarUI;

public class BasicProgressBarUI extends ProgressBarUI {
    public BasicProgressBarUI() {}
    public static ComponentUI createUI(JComponent c) { return new BasicProgressBarUI(); }
}
