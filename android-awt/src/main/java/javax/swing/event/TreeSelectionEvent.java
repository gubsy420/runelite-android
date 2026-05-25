package javax.swing.event;

import java.util.EventObject;
import javax.swing.tree.TreePath;

public class TreeSelectionEvent extends EventObject {
    private static final long serialVersionUID = -3505890913214994400L;
    protected TreePath[] paths;
    protected boolean[] areNew;
    protected TreePath oldLeadSelectionPath;
    protected TreePath newLeadSelectionPath;

    public TreeSelectionEvent(Object source, TreePath path, boolean isNew, TreePath oldLeadSelectionPath, TreePath newLeadSelectionPath) {
        super(source);
        this.paths = new TreePath[]{path};
        this.areNew = new boolean[]{isNew};
        this.oldLeadSelectionPath = oldLeadSelectionPath;
        this.newLeadSelectionPath = newLeadSelectionPath;
    }

    public TreeSelectionEvent(Object source, TreePath[] paths, boolean[] areNew,
                               TreePath oldLeadSelectionPath, TreePath newLeadSelectionPath) {
        super(source);
        this.paths = paths;
        this.areNew = areNew;
        this.oldLeadSelectionPath = oldLeadSelectionPath;
        this.newLeadSelectionPath = newLeadSelectionPath;
    }

    public TreePath[] getPaths() { return paths.clone(); }
    public TreePath getPath() { return paths[0]; }
    public boolean isAddedPath() { return areNew[0]; }
    public boolean isAddedPath(int index) { return areNew[index]; }
    public TreePath getOldLeadSelectionPath() { return oldLeadSelectionPath; }
    public TreePath getNewLeadSelectionPath() { return newLeadSelectionPath; }
}
