package java.awt;

import java.util.ArrayList;
import java.util.List;

public class Container extends Component {
    private static final long serialVersionUID = 4613797578919906343L;

    private final List<Component> children = new ArrayList<>();
    // Real java.awt.Container has NO default layout — null means "I'll position children
    // myself via setBounds". Only Panel/JPanel default to FlowLayout (set in their ctors).
    private LayoutManager layout = null;

    protected Container() {
    }

    public int getComponentCount() { return children.size(); }

    public Component getComponent(int n) { return children.get(n); }

    public Component[] getComponents() { return children.toArray(new Component[0]); }

    public Component add(Component comp) {
        return add(comp, -1);
    }

    public Component add(Component comp, int index) {
        if (comp == null) return null;
        if (index < 0 || index >= children.size()) children.add(comp);
        else children.add(index, comp);
        comp.setParent(this);
        return comp;
    }

    /** Legacy AWT add(name, comp) — delegates to the constraints-taking form. */
    public Component add(String name, Component comp) {
        add(comp, name);
        return comp;
    }

    public void add(Component comp, Object constraints) {
        if (comp == null) return;
        if (children.contains(comp)) {
            // add(comp, -1) already added; just register constraint
        } else {
            children.add(comp);
            comp.setParent(this);
        }
        if (layout instanceof LayoutManager2) {
            ((LayoutManager2) layout).addLayoutComponent(comp, constraints);
        } else if (layout != null && constraints instanceof String) {
            layout.addLayoutComponent((String) constraints, comp);
        }
    }

    public void remove(int index) {
        Component c = children.remove(index);
        if (c != null) {
            if (layout != null) layout.removeLayoutComponent(c);
            c.setParent(null);
        }
    }

    public void remove(Component comp) {
        if (children.remove(comp)) {
            if (layout != null) layout.removeLayoutComponent(comp);
            comp.setParent(null);
        }
    }

    public void removeAll() {
        for (Component c : children) {
            if (layout != null) layout.removeLayoutComponent(c);
            c.setParent(null);
        }
        children.clear();
    }

    public int getComponentZOrder(Component comp) { return children.indexOf(comp); }
    public void setComponentZOrder(Component comp, int index) {
        int cur = children.indexOf(comp);
        if (cur < 0) return;
        children.remove(cur);
        int target = Math.min(Math.max(0, index), children.size());
        children.add(target, comp);
    }

    public LayoutManager getLayout() { return layout; }
    public void setLayout(LayoutManager mgr) { this.layout = mgr; }

    @Override
    public Dimension getPreferredSize() {
        if (layout != null) {
            Dimension d = layout.preferredLayoutSize(this);
            if (d != null && (d.width > 0 || d.height > 0)) return d;
        }
        return super.getPreferredSize();
    }

    @Override
    public Dimension getMinimumSize() {
        if (layout != null) {
            Dimension d = layout.minimumLayoutSize(this);
            if (d != null && (d.width > 0 || d.height > 0)) return d;
        }
        return super.getMinimumSize();
    }

    public void setFocusCycleRoot(boolean focusCycleRoot) {}
    public boolean isFocusCycleRoot() { return false; }
    public void setFocusTraversalPolicyProvider(boolean provider) {}
    public boolean isFocusTraversalPolicyProvider() { return false; }
    public void setFocusTraversalPolicy(Object policy) {}
    public Object getFocusTraversalPolicy() { return null; }

    public Insets getInsets() { return new Insets(0, 0, 0, 0); }

    private static final Object TREE_LOCK = new Object();
    public final Object getTreeLock() { return TREE_LOCK; }

    @Override
    public void doLayout() {
        if (layout != null) layout.layoutContainer(this);
    }

    // Note: setBounds/setSize do NOT call doLayout — that would recurse since ClientUI.Layout
    // itself calls content.setSize. Layout cascades happen via Container.validate() once per
    // Compose frame in Window.renderToBackbuffer.

    @Override
    public void validate() {
        // Catch per-container so one bad container's layout NPE doesn't abort the cascade.
        try { doLayout(); } catch (Throwable ignored) {}
        // Snapshot — plugins start on AWT-InvokeAndWait threads that may add nav buttons
        // to a Container while the Compose render thread is mid-validate. Direct iteration
        // throws ConcurrentModificationException.
        Component[] snap = children.toArray(new Component[0]);
        for (Component c : snap) {
            try { c.validate(); } catch (Throwable ignored) {}
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        paintChildren(g);
    }

    protected void paintChildren(Graphics g) {
        if (children.isEmpty()) return;
        // Snapshot in case a paint impl mutates the list.
        Component[] snap = children.toArray(new Component[0]);
        for (Component c : snap) {
            if (c == null || !c.isVisible() || c.getWidth() <= 0 || c.getHeight() <= 0) continue;
            Graphics cg = g.create(c.x, c.y, c.width, c.height);
            try {
                c.paint(cg);
            } catch (Throwable t) {
                // Swing swallows paint errors per-component; mirror that to keep the tree drawing.
            } finally {
                cg.dispose();
            }
        }
    }
}
