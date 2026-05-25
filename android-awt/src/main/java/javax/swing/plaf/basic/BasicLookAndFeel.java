package javax.swing.plaf.basic;

import javax.swing.LookAndFeel;
import javax.swing.UIDefaults;

public abstract class BasicLookAndFeel extends LookAndFeel {
    @Override
    public UIDefaults getDefaults() {
        UIDefaults table = new UIDefaults();
        initClassDefaults(table);
        initSystemColorDefaults(table);
        initComponentDefaults(table);
        return table;
    }

    protected void initClassDefaults(UIDefaults table) {}
    protected void initSystemColorDefaults(UIDefaults table) {}
    protected void initComponentDefaults(UIDefaults table) {}
    protected void loadSystemColors(UIDefaults table, String[] systemColors, boolean useNative) {}

    @Override public void initialize() {}
    @Override public void uninitialize() {}

    @Override public String getName() { return "Basic"; }
    @Override public String getID() { return "Basic"; }
    @Override public String getDescription() { return "Basic"; }
    @Override public boolean isNativeLookAndFeel() { return false; }
    @Override public boolean isSupportedLookAndFeel() { return true; }
}
