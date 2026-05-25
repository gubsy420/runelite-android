package javax.swing.event;

import java.util.EventObject;
import javax.swing.undo.UndoableEdit;

public class UndoableEditEvent extends EventObject {
    private static final long serialVersionUID = -3232251256916260638L;
    private final UndoableEdit edit;

    public UndoableEditEvent(Object source, UndoableEdit edit) {
        super(source);
        this.edit = edit;
    }

    public UndoableEdit getEdit() { return edit; }
}
