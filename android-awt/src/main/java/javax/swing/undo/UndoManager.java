package javax.swing.undo;

import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;

public class UndoManager implements UndoableEditListener {
    private static final long serialVersionUID = 1L;

    public UndoManager() {}

    @Override public void undoableEditHappened(UndoableEditEvent e) {}

    public void undo() throws CannotUndoException { throw new CannotUndoException(); }
    public void redo() throws CannotRedoException { throw new CannotRedoException(); }
    public boolean canUndo() { return false; }
    public boolean canRedo() { return false; }
    public boolean canUndoOrRedo() { return canUndo() || canRedo(); }
    public void undoOrRedo() {}
    public String getUndoPresentationName() { return "Undo"; }
    public String getRedoPresentationName() { return "Redo"; }
    public void discardAllEdits() {}
    public boolean addEdit(UndoableEdit anEdit) { return false; }
    public void end() {}
    public void die() {}
    public void setLimit(int l) {}
    public int getLimit() { return 100; }
}
