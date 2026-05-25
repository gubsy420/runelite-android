package javax.swing;

import java.awt.Component;

public class PopupFactory {
    private static PopupFactory sharedFactory = new PopupFactory();

    public PopupFactory() {}

    public static void setSharedInstance(PopupFactory factory) { sharedFactory = factory; }
    public static PopupFactory getSharedInstance() { return sharedFactory; }

    public Popup getPopup(Component owner, Component contents, int x, int y) { return new Popup(); }
    public Popup getPopup(Component owner, Component contents, int x, int y, boolean isHeavyWeightPopup) { return new Popup(); }
}
