package javax.swing.tree;

import java.io.Serializable;
import java.util.Arrays;

public class TreePath implements Serializable {
    private static final long serialVersionUID = 4380036194768077479L;
    private final Object[] path;

    public TreePath(Object[] path) {
        if (path == null || path.length == 0) throw new IllegalArgumentException("path must be non-empty");
        this.path = path.clone();
    }

    public TreePath(Object singlePath) { this.path = new Object[]{singlePath}; }
    protected TreePath(TreePath parent, Object lastElement) {
        this.path = new Object[parent.path.length + 1];
        System.arraycopy(parent.path, 0, this.path, 0, parent.path.length);
        this.path[parent.path.length] = lastElement;
    }
    protected TreePath() { this.path = new Object[]{null}; }

    public Object[] getPath() { return path.clone(); }
    public Object getLastPathComponent() { return path[path.length - 1]; }
    public int getPathCount() { return path.length; }
    public Object getPathComponent(int index) { return path[index]; }
    public boolean isDescendant(TreePath aTreePath) {
        if (aTreePath == this) return true;
        if (aTreePath == null || aTreePath.path.length < path.length) return false;
        for (int i = 0; i < path.length; i++) {
            if (!equalsOrBothNull(path[i], aTreePath.path[i])) return false;
        }
        return true;
    }
    public TreePath pathByAddingChild(Object child) { return new TreePath(this, child); }
    public TreePath getParentPath() {
        if (path.length == 1) return null;
        Object[] sub = new Object[path.length - 1];
        System.arraycopy(path, 0, sub, 0, sub.length);
        return new TreePath(sub);
    }

    private static boolean equalsOrBothNull(Object a, Object b) { return a == b || (a != null && a.equals(b)); }

    @Override public boolean equals(Object o) {
        return o instanceof TreePath && Arrays.equals(path, ((TreePath) o).path);
    }
    @Override public int hashCode() { return Arrays.hashCode(path); }
    @Override public String toString() { return "[" + Arrays.toString(path) + "]"; }
}
