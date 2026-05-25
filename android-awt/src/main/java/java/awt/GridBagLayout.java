package java.awt;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class GridBagLayout implements LayoutManager2, Serializable {
    private static final long serialVersionUID = 8838754796412211005L;

    private final Map<Component, GridBagConstraints> constraints = new HashMap<>();

    public GridBagLayout() {}

    public void setConstraints(Component comp, GridBagConstraints constraints) {
        this.constraints.put(comp, (GridBagConstraints) constraints.clone());
    }

    public GridBagConstraints getConstraints(Component comp) {
        GridBagConstraints c = constraints.get(comp);
        return c == null ? new GridBagConstraints() : (GridBagConstraints) c.clone();
    }

    @Override public void addLayoutComponent(String name, Component comp) {}
    @Override public void addLayoutComponent(Component comp, Object cn) {
        if (cn instanceof GridBagConstraints) setConstraints(comp, (GridBagConstraints) cn);
    }
    @Override public void removeLayoutComponent(Component comp) { constraints.remove(comp); }
    @Override public Dimension preferredLayoutSize(Container parent) { return new Dimension(0, 0); }
    @Override public Dimension minimumLayoutSize(Container parent) { return new Dimension(0, 0); }
    @Override public Dimension maximumLayoutSize(Container target) { return new Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE); }
    @Override public float getLayoutAlignmentX(Container target) { return 0.5f; }
    @Override public float getLayoutAlignmentY(Container target) { return 0.5f; }
    @Override public void invalidateLayout(Container target) {}
    @Override public void layoutContainer(Container target) {}
}
