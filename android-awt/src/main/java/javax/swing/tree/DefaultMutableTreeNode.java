package javax.swing.tree;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

public class DefaultMutableTreeNode implements MutableTreeNode, Cloneable, Serializable {
    private static final long serialVersionUID = -4298474751201572218L;

    protected MutableTreeNode parent;
    protected List<MutableTreeNode> children;
    protected transient Object userObject;
    protected boolean allowsChildren;

    public DefaultMutableTreeNode() { this(null, true); }
    public DefaultMutableTreeNode(Object userObject) { this(userObject, true); }
    public DefaultMutableTreeNode(Object userObject, boolean allowsChildren) {
        this.userObject = userObject;
        this.allowsChildren = allowsChildren;
        this.children = new ArrayList<>();
    }

    public void add(MutableTreeNode child) { insert(child, children.size()); }

    @Override public void insert(MutableTreeNode child, int index) {
        if (child.getParent() == this) children.remove(child);
        children.add(index, child);
        child.setParent(this);
    }
    @Override public void remove(int index) {
        MutableTreeNode c = children.remove(index);
        if (c != null) c.setParent(null);
    }
    @Override public void remove(MutableTreeNode node) { children.remove(node); node.setParent(null); }
    @Override public void setUserObject(Object object) { this.userObject = object; }
    public Object getUserObject() { return userObject; }
    @Override public void removeFromParent() { if (parent != null) parent.remove(this); }
    @Override public void setParent(MutableTreeNode newParent) { this.parent = newParent; }

    @Override public TreeNode getChildAt(int idx) { return children.get(idx); }
    @Override public int getChildCount() { return children.size(); }
    @Override public TreeNode getParent() { return parent; }
    @Override public int getIndex(TreeNode node) { return children.indexOf(node); }
    @Override public boolean getAllowsChildren() { return allowsChildren; }
    public void setAllowsChildren(boolean allows) { this.allowsChildren = allows; }
    @Override public boolean isLeaf() { return children.isEmpty(); }
    @Override public Enumeration<? extends TreeNode> children() { return Collections.enumeration(children); }

    public boolean isRoot() { return parent == null; }
    public TreeNode getRoot() { TreeNode n = this; while (n.getParent() != null) n = n.getParent(); return n; }

    @Override public Object clone() {
        try {
            DefaultMutableTreeNode copy = (DefaultMutableTreeNode) super.clone();
            copy.children = new ArrayList<>();
            return copy;
        } catch (CloneNotSupportedException e) { throw new InternalError(e); }
    }
}
