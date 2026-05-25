package javax.swing.text;

import java.awt.Container;
import java.awt.Graphics;
import java.awt.Shape;

public abstract class View {
    private Element elem;
    private View parent;

    public View(Element elem) { this.elem = elem; }
    public Element getElement() { return elem; }
    public View getParent() { return parent; }
    public void setParent(View p) { this.parent = p; }

    public abstract float getPreferredSpan(int axis);
    public abstract void paint(Graphics g, Shape allocation);
    public abstract int viewToModel(float x, float y, Shape a, Position.Bias[] biasReturn);
    public abstract Shape modelToView(int pos, Shape a, Position.Bias b) throws BadLocationException;

    public Document getDocument() { return elem != null ? elem.getDocument() : null; }
    public Container getContainer() { return null; }
}
