package javax.swing;

import java.awt.event.MouseAdapter;

public class ToolTipManager extends MouseAdapter {
    private static final ToolTipManager INSTANCE = new ToolTipManager();
    private boolean enabled = true;
    private boolean lightWeightPopupEnabled = true;
    private boolean heavyWeightPopupEnabled = false;
    private int initialDelay = 750;
    private int dismissDelay = 4000;
    private int reshowDelay = 500;

    public static ToolTipManager sharedInstance() { return INSTANCE; }

    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public boolean isEnabled() { return enabled; }
    public void setLightWeightPopupEnabled(boolean aFlag) { this.lightWeightPopupEnabled = aFlag; }
    public boolean isLightWeightPopupEnabled() { return lightWeightPopupEnabled; }
    public boolean isHeavyWeightPopupEnabled() { return heavyWeightPopupEnabled; }
    public void setInitialDelay(int milliseconds) { this.initialDelay = milliseconds; }
    public int getInitialDelay() { return initialDelay; }
    public void setDismissDelay(int milliseconds) { this.dismissDelay = milliseconds; }
    public int getDismissDelay() { return dismissDelay; }
    public void setReshowDelay(int milliseconds) { this.reshowDelay = milliseconds; }
    public int getReshowDelay() { return reshowDelay; }
    public void registerComponent(JComponent component) {}
    public void unregisterComponent(JComponent component) {}
    public void mouseDragged(java.awt.event.MouseEvent e) {}
}
