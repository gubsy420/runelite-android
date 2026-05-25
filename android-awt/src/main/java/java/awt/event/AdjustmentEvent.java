package java.awt.event;

import java.awt.AWTEvent;

public class AdjustmentEvent extends AWTEvent {
    private static final long serialVersionUID = 5700290645205279921L;

    public static final int ADJUSTMENT_FIRST = 601;
    public static final int ADJUSTMENT_LAST = 601;
    public static final int ADJUSTMENT_VALUE_CHANGED = 601;

    public static final int UNIT_INCREMENT = 1;
    public static final int UNIT_DECREMENT = 2;
    public static final int BLOCK_INCREMENT = 3;
    public static final int BLOCK_DECREMENT = 4;
    public static final int TRACK = 5;

    private final int adjustmentType;
    private final int value;
    private final boolean isAdjusting;

    public AdjustmentEvent(Object source, int id, int type, int value) {
        this(source, id, type, value, false);
    }

    public AdjustmentEvent(Object source, int id, int type, int value, boolean isAdjusting) {
        super(source, id);
        this.adjustmentType = type;
        this.value = value;
        this.isAdjusting = isAdjusting;
    }

    public int getAdjustmentType() { return adjustmentType; }
    public int getValue() { return value; }
    public boolean getValueIsAdjusting() { return isAdjusting; }
    public Object getAdjustable() { return source; }
}
