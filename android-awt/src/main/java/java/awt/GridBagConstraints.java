package java.awt;

import java.io.Serializable;

public class GridBagConstraints implements Cloneable, Serializable {
    private static final long serialVersionUID = -1000070633030801713L;

    public static final int RELATIVE = -1;
    public static final int REMAINDER = 0;
    public static final int NONE = 0;
    public static final int BOTH = 1;
    public static final int HORIZONTAL = 2;
    public static final int VERTICAL = 3;
    public static final int CENTER = 10;
    public static final int NORTH = 11;
    public static final int NORTHEAST = 12;
    public static final int EAST = 13;
    public static final int SOUTHEAST = 14;
    public static final int SOUTH = 15;
    public static final int SOUTHWEST = 16;
    public static final int WEST = 17;
    public static final int NORTHWEST = 18;
    public static final int PAGE_START = 19;
    public static final int PAGE_END = 20;
    public static final int LINE_START = 21;
    public static final int LINE_END = 22;
    public static final int FIRST_LINE_START = 23;
    public static final int FIRST_LINE_END = 24;
    public static final int LAST_LINE_START = 25;
    public static final int LAST_LINE_END = 26;
    public static final int BASELINE = 0x100;

    public int gridx = RELATIVE;
    public int gridy = RELATIVE;
    public int gridwidth = 1;
    public int gridheight = 1;
    public double weightx;
    public double weighty;
    public int anchor = CENTER;
    public int fill = NONE;
    public Insets insets = new Insets(0, 0, 0, 0);
    public int ipadx;
    public int ipady;

    public GridBagConstraints() {}

    public GridBagConstraints(int gridx, int gridy, int gridwidth, int gridheight,
                               double weightx, double weighty, int anchor, int fill,
                               Insets insets, int ipadx, int ipady) {
        this.gridx = gridx; this.gridy = gridy;
        this.gridwidth = gridwidth; this.gridheight = gridheight;
        this.weightx = weightx; this.weighty = weighty;
        this.anchor = anchor; this.fill = fill;
        this.insets = insets; this.ipadx = ipadx; this.ipady = ipady;
    }

    @Override public Object clone() {
        try { return super.clone(); } catch (CloneNotSupportedException e) { throw new InternalError(e); }
    }
}
