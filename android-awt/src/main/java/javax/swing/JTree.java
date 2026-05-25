package javax.swing;

import java.awt.Rectangle;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;
import javax.swing.tree.TreeSelectionModel;

public class JTree extends JComponent implements Scrollable {
    private static final long serialVersionUID = 1L;

    protected TreeModel treeModel;

    public JTree() { this(new DefaultMutableTreeNode("root")); }
    public JTree(TreeNode root) { this(new DefaultTreeModel(root)); }
    public JTree(TreeModel newModel) { this.treeModel = newModel; }
    public JTree(Object[] value) { this(new DefaultMutableTreeNode("root")); }

    public TreeModel getModel() { return treeModel; }
    public void setModel(TreeModel m) { this.treeModel = m; }
    public TreePath getSelectionPath() { return null; }
    public void setSelectionPath(TreePath path) {}
    public TreePath[] getSelectionPaths() { return new TreePath[0]; }
    public void setSelectionPaths(TreePath[] paths) {}
    public int[] getSelectionRows() { return new int[0]; }
    public void setSelectionRow(int row) {}
    public void setSelectionRows(int[] rows) {}
    public int getRowCount() { return 0; }
    public int getRowHeight() { return 16; }
    public void setRowHeight(int rowHeight) {}
    public TreeSelectionModel getSelectionModel() { return null; }
    public void setSelectionModel(TreeSelectionModel model) {}
    public void expandPath(TreePath path) {}
    public void expandRow(int row) {}
    public void collapsePath(TreePath path) {}
    public void collapseRow(int row) {}
    public boolean isExpanded(TreePath path) { return false; }
    public boolean isExpanded(int row) { return false; }
    public boolean isCollapsed(TreePath path) { return true; }
    public boolean isCollapsed(int row) { return true; }
    public boolean isRootVisible() { return true; }
    public void setRootVisible(boolean rootVisible) {}
    public boolean getShowsRootHandles() { return false; }
    public void setShowsRootHandles(boolean b) {}
    public Rectangle getRowBounds(int row) { return new Rectangle(); }
    public Rectangle getPathBounds(TreePath path) { return new Rectangle(); }
    public int getRowForPath(TreePath path) { return -1; }
    public TreePath getPathForRow(int row) { return null; }
    public TreePath getClosestPathForLocation(int x, int y) { return null; }
    public int getClosestRowForLocation(int x, int y) { return -1; }
    public void scrollPathToVisible(TreePath path) {}
    public void scrollRowToVisible(int row) {}
    public void addTreeSelectionListener(TreeSelectionListener l) {}
    public void removeTreeSelectionListener(TreeSelectionListener l) {}

    @Override public java.awt.Dimension getPreferredScrollableViewportSize() { return getPreferredSize(); }
    @Override public int getScrollableUnitIncrement(Rectangle visibleRect, int orientation, int direction) { return getRowHeight(); }
    @Override public int getScrollableBlockIncrement(Rectangle visibleRect, int orientation, int direction) { return 1; }
    @Override public boolean getScrollableTracksViewportWidth() { return false; }
    @Override public boolean getScrollableTracksViewportHeight() { return false; }
}
