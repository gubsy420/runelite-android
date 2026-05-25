package javax.swing.text;

import java.beans.PropertyChangeListener;
import javax.swing.event.DocumentListener;
import javax.swing.event.UndoableEditListener;

public interface Document {
    String StreamDescriptionProperty = "stream";
    String TitleProperty = "title";

    int getLength();
    void addDocumentListener(DocumentListener listener);
    void removeDocumentListener(DocumentListener listener);
    void addUndoableEditListener(UndoableEditListener listener);
    void removeUndoableEditListener(UndoableEditListener listener);
    Object getProperty(Object key);
    void putProperty(Object key, Object value);
    void remove(int offs, int len) throws BadLocationException;
    void insertString(int offset, String str, AttributeSet a) throws BadLocationException;
    String getText(int offset, int length) throws BadLocationException;
    void getText(int offset, int length, Segment txt) throws BadLocationException;
    Position getStartPosition();
    Position getEndPosition();
    Position createPosition(int offs) throws BadLocationException;
    Element[] getRootElements();
    Element getDefaultRootElement();
    void render(Runnable r);
}
