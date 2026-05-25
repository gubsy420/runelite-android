package javax.swing.event;

import java.util.EventObject;

public abstract class CaretEvent extends EventObject {
    private static final long serialVersionUID = -2270132877571475944L;
    public CaretEvent(Object source) { super(source); }
    public abstract int getDot();
    public abstract int getMark();
}
