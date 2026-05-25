package javax.swing.event;

import javax.swing.text.Document;
import javax.swing.text.Element;

public interface DocumentEvent {
    enum EventType {
        INSERT, REMOVE, CHANGE
    }

    int getOffset();
    int getLength();
    Document getDocument();
    EventType getType();
    ElementChange getChange(Element elem);

    interface ElementChange {
        Element getElement();
        int getIndex();
        Element[] getChildrenRemoved();
        Element[] getChildrenAdded();
    }
}
