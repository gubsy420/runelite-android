package javax.swing.tree;

import java.io.Serializable;
import javax.swing.event.TreeModelListener;

public class DefaultTreeModel implements TreeModel, Serializable {
    private static final long serialVersionUID = -2621068368932566998L;
    protected TreeNode root;
    protected boolean asksAllowsChildren;
    protected java.util.List<TreeModelListener> listeners = new java.util.ArrayList<>();

    public DefaultTreeModel(TreeNode root) { this(root, false); }
    public DefaultTreeModel(TreeNode root, boolean asksAllowsChildren) {
        this.root = root; this.asksAllowsChildren = asksAllowsChildren;
    }

    @Override public Object getRoot() { return root; }
    public void setRoot(TreeNode root) { this.root = root; }

    @Override public Object getChild(Object parent, int index) { return ((TreeNode) parent).getChildAt(index); }
    @Override public int getChildCount(Object parent) { return ((TreeNode) parent).getChildCount(); }
    @Override public boolean isLeaf(Object node) { return ((TreeNode) node).isLeaf(); }
    @Override public void valueForPathChanged(TreePath path, Object newValue) {}
    @Override public int getIndexOfChild(Object parent, Object child) { return ((TreeNode) parent).getIndex((TreeNode) child); }
    @Override public void addTreeModelListener(TreeModelListener l) { if (l != null) listeners.add(l); }
    @Override public void removeTreeModelListener(TreeModelListener l) { listeners.remove(l); }

    public void reload() {}
    public void reload(TreeNode node) {}
    public void nodeChanged(TreeNode node) {}
    public void insertNodeInto(MutableTreeNode newChild, MutableTreeNode parent, int index) { parent.insert(newChild, index); }
    public void removeNodeFromParent(MutableTreeNode node) { node.removeFromParent(); }
}
