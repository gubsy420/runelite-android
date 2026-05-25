package javax.swing;

import java.awt.Component;

public class JSplitPane extends JComponent {
    private static final long serialVersionUID = 1L;
    public static final int VERTICAL_SPLIT = 0;
    public static final int HORIZONTAL_SPLIT = 1;
    public static final String LEFT = "left";
    public static final String RIGHT = "right";
    public static final String TOP = "top";
    public static final String BOTTOM = "bottom";
    public static final String DIVIDER = "divider";
    public static final String ORIENTATION_PROPERTY = "orientation";
    public static final String CONTINUOUS_LAYOUT_PROPERTY = "continuousLayout";
    public static final String DIVIDER_SIZE_PROPERTY = "dividerSize";
    public static final String ONE_TOUCH_EXPANDABLE_PROPERTY = "oneTouchExpandable";
    public static final String LAST_DIVIDER_LOCATION_PROPERTY = "lastDividerLocation";
    public static final String DIVIDER_LOCATION_PROPERTY = "dividerLocation";
    public static final String RESIZE_WEIGHT_PROPERTY = "resizeWeight";

    private int orientation = HORIZONTAL_SPLIT;
    private Component leftComponent, rightComponent;
    private int dividerSize = 8;
    private int dividerLocation = -1;
    private double resizeWeight;
    private boolean continuousLayout = true;

    public JSplitPane() {}
    public JSplitPane(int newOrientation) { this.orientation = newOrientation; }
    public JSplitPane(int newOrientation, boolean continuousLayout) { this(newOrientation); this.continuousLayout = continuousLayout; }
    public JSplitPane(int newOrientation, Component newLeftComponent, Component newRightComponent) {
        this(newOrientation); this.leftComponent = newLeftComponent; this.rightComponent = newRightComponent;
    }
    public JSplitPane(int newOrientation, boolean continuousLayout, Component newLeftComponent, Component newRightComponent) {
        this(newOrientation, continuousLayout); this.leftComponent = newLeftComponent; this.rightComponent = newRightComponent;
    }

    public int getOrientation() { return orientation; }
    public void setOrientation(int orientation) { this.orientation = orientation; }
    public Component getLeftComponent() { return leftComponent; }
    public void setLeftComponent(Component c) { this.leftComponent = c; }
    public Component getRightComponent() { return rightComponent; }
    public void setRightComponent(Component c) { this.rightComponent = c; }
    public Component getTopComponent() { return leftComponent; }
    public void setTopComponent(Component c) { this.leftComponent = c; }
    public Component getBottomComponent() { return rightComponent; }
    public void setBottomComponent(Component c) { this.rightComponent = c; }
    public int getDividerSize() { return dividerSize; }
    public void setDividerSize(int newSize) { this.dividerSize = newSize; }
    public int getDividerLocation() { return dividerLocation; }
    public void setDividerLocation(int location) { this.dividerLocation = location; }
    public void setDividerLocation(double proportion) {}
    public double getResizeWeight() { return resizeWeight; }
    public void setResizeWeight(double value) { this.resizeWeight = value; }
    public boolean isContinuousLayout() { return continuousLayout; }
    public void setContinuousLayout(boolean cl) { this.continuousLayout = cl; }
    public boolean isOneTouchExpandable() { return false; }
    public void setOneTouchExpandable(boolean newValue) {}
    public int getLastDividerLocation() { return dividerLocation; }
    public void setLastDividerLocation(int location) {}
    public void resetToPreferredSizes() {}
}
