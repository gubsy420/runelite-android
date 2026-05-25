package javax.swing.undo;

public interface UndoableEdit {
    void undo() throws CannotUndoException;
    boolean canUndo();
    void redo() throws CannotRedoException;
    boolean canRedo();
    void die();
    boolean addEdit(UndoableEdit anEdit);
    boolean replaceEdit(UndoableEdit anEdit);
    boolean isSignificant();
    String getPresentationName();
    String getUndoPresentationName();
    String getRedoPresentationName();
}
