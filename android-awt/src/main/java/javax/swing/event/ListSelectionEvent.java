package javax.swing.event;

import java.util.EventObject;

public class ListSelectionEvent extends EventObject {
    private static final long serialVersionUID = 3567040836842269611L;
    private final int firstIndex, lastIndex;
    private final boolean isAdjusting;

    public ListSelectionEvent(Object source, int firstIndex, int lastIndex, boolean isAdjusting) {
        super(source);
        this.firstIndex = firstIndex; this.lastIndex = lastIndex; this.isAdjusting = isAdjusting;
    }

    public int getFirstIndex() { return firstIndex; }
    public int getLastIndex()  { return lastIndex; }
    public boolean getValueIsAdjusting() { return isAdjusting; }
}
