package javax.swing.text;

public interface Element {
    Document getDocument();
    Element getParentElement();
    String getName();
    AttributeSet getAttributes();
    int getStartOffset();
    int getEndOffset();
    int getElementIndex(int offset);
    int getElementCount();
    Element getElement(int index);
    boolean isLeaf();
}
