package java.awt;

import java.io.Serializable;

/**
 * Real FlowLayout. Lays children left-to-right in a row, wraps to the next row when the
 * remaining width can't fit a child. Alignment shifts each row's children inside the row
 * width.
 */
public class FlowLayout implements LayoutManager, Serializable {
    private static final long serialVersionUID = -7262534655255619500L;

    public static final int LEFT = 0;
    public static final int CENTER = 1;
    public static final int RIGHT = 2;
    public static final int LEADING = 3;
    public static final int TRAILING = 4;

    private int align;
    private int hgap;
    private int vgap;

    public FlowLayout() { this(CENTER, 5, 5); }
    public FlowLayout(int align) { this(align, 5, 5); }
    public FlowLayout(int align, int hgap, int vgap) {
        this.align = align; this.hgap = hgap; this.vgap = vgap;
    }

    public int getAlignment() { return align; }
    public void setAlignment(int align) { this.align = align; }
    public int getHgap() { return hgap; }
    public void setHgap(int hgap) { this.hgap = hgap; }
    public int getVgap() { return vgap; }
    public void setVgap(int vgap) { this.vgap = vgap; }

    @Override public void addLayoutComponent(String name, Component comp) {}
    @Override public void removeLayoutComponent(Component comp) {}

    @Override
    public Dimension preferredLayoutSize(Container target) {
        Insets ins = target.getInsets();
        int n = target.getComponentCount();
        int w = 0, h = 0;
        for (int i = 0; i < n; i++) {
            Component c = target.getComponent(i);
            if (!c.isVisible()) continue;
            Dimension d = c.getPreferredSize();
            w += d.width + (i > 0 ? hgap : 0);
            if (d.height > h) h = d.height;
        }
        return new Dimension(ins.left + ins.right + w + 2 * hgap, ins.top + ins.bottom + h + 2 * vgap);
    }

    @Override
    public Dimension minimumLayoutSize(Container target) { return preferredLayoutSize(target); }

    @Override
    public void layoutContainer(Container target) {
        int n = target.getComponentCount();
        if (n == 0) return;
        Insets ins = target.getInsets();
        int width = target.getWidth() - ins.left - ins.right;
        int y = ins.top + vgap;
        // Gather rows.
        int rowStart = 0, rowW = 0, rowH = 0;
        int[] childW = new int[n], childH = new int[n];
        boolean[] visible = new boolean[n];
        for (int i = 0; i < n; i++) {
            Component c = target.getComponent(i);
            visible[i] = c.isVisible();
            if (!visible[i]) continue;
            Dimension d = c.getPreferredSize();
            childW[i] = d.width;
            childH[i] = d.height;
        }
        int idx = 0;
        while (idx < n) {
            rowStart = idx;
            rowW = 0; rowH = 0;
            int rowEnd = idx;
            while (rowEnd < n) {
                if (!visible[rowEnd]) { rowEnd++; continue; }
                int next = rowW + childW[rowEnd] + (rowEnd > rowStart ? hgap : 0);
                if (rowEnd > rowStart && next > width) break;
                rowW = next;
                if (childH[rowEnd] > rowH) rowH = childH[rowEnd];
                rowEnd++;
            }
            int slack;
            switch (align) {
                case CENTER: slack = (width - rowW) / 2; break;
                case RIGHT:
                case TRAILING: slack = width - rowW; break;
                default: slack = 0; break;
            }
            int xOffset = ins.left + Math.max(0, slack);
            int x = xOffset;
            for (int i = rowStart; i < rowEnd; i++) {
                if (!visible[i]) continue;
                target.getComponent(i).setBounds(x, y + (rowH - childH[i]) / 2, childW[i], childH[i]);
                x += childW[i] + hgap;
            }
            y += rowH + vgap;
            idx = rowEnd;
        }
    }
}
