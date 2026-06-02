package javax.swing;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager2;

public class GroupLayout implements LayoutManager2 {
    public enum Alignment { LEADING, TRAILING, CENTER, BASELINE }

    public static final int DEFAULT_SIZE = -1;
    public static final int PREFERRED_SIZE = -2;

    /**
     * In real Swing GroupLayout, every {@code addComponent(...)} call additionally
     * registers the component with the host container so it becomes a child for
     * paint/layout. The host is shared across all groups built from this layout
     * — both setHorizontalGroup and setVerticalGroup typically reference the
     * same components, so we de-duplicate. Without this, components added only
     * via GroupLayout calls never become children of the panel and the panel
     * renders as an empty box (this was the "plugin hub list is empty" bug).
     */
    private final java.util.Set<Component> added = java.util.Collections.newSetFromMap(new java.util.IdentityHashMap<>());

    void register(Component comp) {
        if (comp == null || !added.add(comp)) return;
        if (host != null) {
            try { host.add(comp); } catch (Throwable ignored) {}
        }
    }

    public abstract class Group {
        public Group addGroup(Group group) { return this; }
        public Group addComponent(Component component) { register(component); return this; }
        public Group addComponent(Component component, int min, int pref, int max) { register(component); return this; }
        public Group addGap(int size) { return this; }
        public Group addGap(int min, int pref, int max) { return this; }
    }

    public class ParallelGroup extends Group {
        // OpenJDK exposes BOTH orderings — Alignment-first and Component-first —
        // for these overloads. The shadow used to only ship the Alignment-first
        // variants, so callers using the Component-first form (e.g. RuneLite's
        // PluginHubPanel: addComponent(badge, Alignment.TRAILING)) hit a
        // NoSuchMethodError at runtime and the whole panel failed to build.
        public ParallelGroup addGroup(Alignment alignment, Group group) { return this; }
        public ParallelGroup addComponent(Alignment alignment, Component component) { register(component); return this; }
        public ParallelGroup addComponent(Alignment alignment, Component component, int min, int pref, int max) { register(component); return this; }
        public ParallelGroup addComponent(Component component, Alignment alignment) { register(component); return this; }
        public ParallelGroup addComponent(Component component, Alignment alignment, int min, int pref, int max) { register(component); return this; }
        @Override public ParallelGroup addComponent(Component component) { register(component); return this; }
        @Override public ParallelGroup addComponent(Component component, int min, int pref, int max) { register(component); return this; }
        @Override public ParallelGroup addGroup(Group group) { return this; }
        @Override public ParallelGroup addGap(int size) { return this; }
        @Override public ParallelGroup addGap(int min, int pref, int max) { return this; }
    }

    public class SequentialGroup extends Group {
        public SequentialGroup addContainerGap() { return this; }
        public SequentialGroup addContainerGap(int pref, int max) { return this; }
        public SequentialGroup addPreferredGap(LayoutStyle.ComponentPlacement type) { return this; }
        public SequentialGroup addPreferredGap(LayoutStyle.ComponentPlacement type, int pref, int max) { return this; }
        @Override public SequentialGroup addComponent(Component component) { register(component); return this; }
        @Override public SequentialGroup addComponent(Component component, int min, int pref, int max) { register(component); return this; }
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

    /** Minimal preferred-size: width = max child preferred width, height = sum
     *  of child preferred heights. Good enough for GroupLayout panels that are
     *  vertical stacks (PluginHubPanel, plugin lists, ProfilePanel, etc.) which
     *  is the dominant usage in RuneLite. */
    @Override public Dimension preferredLayoutSize(Container parent) {
        int w = 0, h = 0;
        for (Component c : parent.getComponents()) {
            if (c == null || !c.isVisible()) continue;
            Dimension d = c.getPreferredSize();
            if (d == null) continue;
            if (d.width > w) w = d.width;
            h += d.height;
        }
        return new Dimension(w, h);
    }
    @Override public Dimension minimumLayoutSize(Container parent) { return preferredLayoutSize(parent); }
    @Override public Dimension maximumLayoutSize(Container target) { return new Dimension(Short.MAX_VALUE, Short.MAX_VALUE); }
    @Override public float getLayoutAlignmentX(Container target) { return 0.5f; }
    @Override public float getLayoutAlignmentY(Container target) { return 0.5f; }
    @Override public void invalidateLayout(Container target) {}

    /**
     * Best-effort layout: stack visible children vertically at the host's full
     * width, each at its preferred height. Doesn't honor the sophisticated
     * horizontal/vertical group constraints — but RuneLite's GroupLayout users
     * are almost all "search bar + scrollable list" or "stack of label/icon
     * rows", which this approximates cleanly. The real GroupLayout positioner
     * is hundreds of lines; ship a simpler vertical stack so panels are
     * actually visible rather than collapsing to 0×0.
     */
    @Override public void layoutContainer(Container target) {
        int w = target.getWidth();
        int y = 0;
        for (Component c : target.getComponents()) {
            if (c == null || !c.isVisible()) continue;
            Dimension d = c.getPreferredSize();
            int ch = d != null ? d.height : 0;
            c.setBounds(0, y, w, ch);
            y += ch;
        }
    }
}
