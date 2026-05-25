package javax.swing;

import java.awt.Color;
import java.awt.Font;
import java.beans.PropertyChangeListener;
import javax.swing.border.Border;
import javax.swing.plaf.ComponentUI;

public class UIManager {
    public static class LookAndFeelInfo {
        private final String name;
        private final String className;
        public LookAndFeelInfo(String name, String className) { this.name = name; this.className = className; }
        public String getName() { return name; }
        public String getClassName() { return className; }
    }

    private static final UIDefaults defaults = new UIDefaults();
    private static LookAndFeel laf;

    public static LookAndFeelInfo[] getInstalledLookAndFeels() { return new LookAndFeelInfo[0]; }
    public static void setInstalledLookAndFeels(LookAndFeelInfo[] infos) {}
    public static void installLookAndFeel(LookAndFeelInfo info) {}
    public static void installLookAndFeel(String name, String className) {}
    public static LookAndFeel getLookAndFeel() { return laf; }
    public static void setLookAndFeel(LookAndFeel newLookAndFeel) { laf = newLookAndFeel; }
    public static void setLookAndFeel(String className) throws Exception {}
    public static String getSystemLookAndFeelClassName() { return ""; }
    public static String getCrossPlatformLookAndFeelClassName() { return ""; }
    public static UIDefaults getDefaults() { return defaults; }
    public static UIDefaults getLookAndFeelDefaults() { return defaults; }

    public static Object get(Object key) { return defaults.get(key); }
    public static Object get(Object key, java.util.Locale l) { return defaults.get(key); }
    public static Object put(Object key, Object value) { return defaults.put(key, value); }
    public static Font getFont(Object key) { return defaults.getFont(key); }
    public static Font getFont(Object key, java.util.Locale l) { return defaults.getFont(key); }
    public static Color getColor(Object key) { return defaults.getColor(key); }
    public static Color getColor(Object key, java.util.Locale l) { return defaults.getColor(key); }
    public static Icon getIcon(Object key) { return defaults.getIcon(key); }
    public static Border getBorder(Object key) { return defaults.getBorder(key); }
    public static String getString(Object key) { return defaults.getString(key); }
    public static int getInt(Object key) { return defaults.getInt(key); }
    public static boolean getBoolean(Object key) { return defaults.getBoolean(key); }
    public static ComponentUI getUI(JComponent target) { return null; }

    public static void addPropertyChangeListener(PropertyChangeListener l) {}
    public static void removePropertyChangeListener(PropertyChangeListener l) {}
    public static PropertyChangeListener[] getPropertyChangeListeners() { return new PropertyChangeListener[0]; }
    public static void addAuxiliaryLookAndFeel(LookAndFeel laf) {}
    public static boolean removeAuxiliaryLookAndFeel(LookAndFeel laf) { return false; }
    public static LookAndFeel[] getAuxiliaryLookAndFeels() { return new LookAndFeel[0]; }
}
