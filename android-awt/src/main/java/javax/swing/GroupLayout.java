package javax.swing;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager2;

public class GroupLayout implements LayoutManager2 {
    public enum Alignment { LEADING, TRAILING, CENTER, BASELINE }

    public static final int DEFAULT_SIZE = -1;
    public static final int PREFERRED_SIZE = -2;

    public abstract static class Group {
        public Group addGroup(Group group) { return this; }
        public Group addComponent(Component component) { return this; }
        public Group addComponent(Component component, int min, int pref, int max) { return this; }
        public Group addGap(int size) { return this; }
        public Group addGap(int min, int pref, int max) { return this; }
    }

    public static class ParallelGroup extends Group {
        public ParallelGroup addGroup(Alignment alignment, Group group) { return this; }
        public ParallelGroup addComponent(Alignment alignment, Component component) { return this; }
        public ParallelGroup addComponent(Alignment alignment, Component component, int min, int pref, int max) { return this; }
        @Override public ParallelGroup addComponent(Component component) { return this; }
        @Override public ParallelGroup addComponent(Component component, int min, int pref, int max) { return this; }
        @Override public ParallelGroup addGroup(Group group) { return this; }
        @Override public ParallelGroup addGap(int size) { return this; }
        @Override public ParallelGroup addGap(int min, int pref, int max) { return this; }
    }

    public static class SequentialGroup extends Group {
        public SequentialGroup addContainerGap() { return this; }
        public SequentialGroup addContainerGap(int pref, int max) { return this; }
        public SequentialGroup addPreferredGap(LayoutStyle.ComponentPlacement type) { return this; }
        public SequentialGroup addPreferredGap(LayoutStyle.ComponentPlacement type, int pref, int max) { return this; }
        @Override public SequentialGroup addComponent(Component component) { return this; }
        @Override public SequentialGroup addComponent(Component component, int min, int pref, int max) { return this; }
        @Override public SequentialGroup addGroup(Group group) { return this; }
        @Override public SequentialGroup addGap(int size) { return this; }
        @Override public SequentialGroup addGap(int min, int pref, int max) { return this; }
    }

    private final Container host;
    private boolean autoCreateGaps;
    private boolean autoCreateContainerGaps;

    public GroupLayout(Container host) { this.host = host; }

    public void setAutoCreateGaps(boolean b) { this.autoCreateGaps = b; }
    public boolean getAutoCreateGaps() { return autoCreateGaps; }
    public void setAutoCreateContainerGaps(boolean b) { this.autoCreateContainerGaps = b; }
    public boolean getAutoCreateContainerGaps() { return autoCreateContainerGaps; }
    public void setHorizontalGroup(Group group) {}
    public void setVerticalGroup(Group group) {}
    public ParallelGroup createParallelGroup() { return new ParallelGroup(); }
    public ParallelGroup createParallelGroup(Alignment alignment) { return new ParallelGroup(); }
    public ParallelGroup createParallelGroup(Alignment alignment, boolean resizable) { return new ParallelGroup(); }
    public SequentialGroup createSequentialGroup() { return new SequentialGroup(); }
    public void linkSize(Component... components) {}
    public void linkSize(int axis, Component... components) {}

    @Override public void addLayoutComponent(String name, Component comp) {}
    @Override public void addLayoutComponent(Component comp, Object constraints) {}
    @Override public void removeLayoutComponent(Component comp) {}
    @Override public Dimension preferredLayoutSize(Container parent) { return new Dimension(0, 0); }
    @Override public Dimension minimumLayoutSize(Container parent) { return new Dimension(0, 0); }
    @Override public Dimension maximumLayoutSize(Container target) { return new Dimension(Short.MAX_VALUE, Short.MAX_VALUE); }
    @Override public float getLayoutAlignmentX(Container target) { return 0.5f; }
    @Override public float getLayoutAlignmentY(Container target) { return 0.5f; }
    @Override public void invalidateLayout(Container target) {}
    @Override public void layoutContainer(Container target) {}
}
