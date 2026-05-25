package javax.swing;

import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.beans.PropertyChangeEvent;
import javax.swing.border.Border;

public abstract class LookAndFeel {
    public abstract String getName();
    public abstract String getID();
    public abstract String getDescription();
    public abstract boolean isNativeLookAndFeel();
    public abstract boolean isSupportedLookAndFeel();

    public UIDefaults getDefaults() { return new UIDefaults(); }
    public void initialize() {}
    public void uninitialize() {}
    public void provideErrorFeedback(Component component) {}

    public static void installColors(JComponent c, String defaultBgName, String defaultFgName) {}
    public static void installColorsAndFont(JComponent c, String defaultBgName, String defaultFgName, String defaultFontName) {}
    public static void installBorder(JComponent c, String defaultBorderName) {}
    public static void installProperty(JComponent c, String propertyName, Object propertyValue) {}
    public static void uninstallBorder(JComponent c) {}

    @Override public String toString() { return "[" + getDescription() + " - " + getClass().getName() + "]"; }
}
