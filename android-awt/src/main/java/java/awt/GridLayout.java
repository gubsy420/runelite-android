package java.awt;

import java.io.Serializable;

/**
 * Real GridLayout implementation. Splits the container into a fixed-rows × fixed-cols
 * grid (one of which can be 0 to mean "as many as needed") and places each child in its
 * cell. Hgap/vgap separate cells. DynamicGridLayout in RuneLite extends this and adapts
 * per-cell sizes — for now we use uniform cells which still positions everything.
 */
public class GridLayout implements LayoutManager, Serializable {
    private static final long serialVersionUID = -7411804673224730901L;

    private int rows, cols, hgap, vgap;

    public GridLayout() { this(1, 0, 0, 0); }
    public GridLayout(int rows, int cols) { this(rows, cols, 0, 0); }
    public GridLayout(int rows, int cols, int hgap, int vgap) {
        this.rows = rows; this.cols = cols; this.hgap = hgap; this.vgap = vgap;
    }

    public int getRows() { return rows; }
    public void setRows(int rows) { this.rows = rows; }
    public int getColumns() { return cols; }
    public void setColumns(int cols) { this.cols = cols; }
    public int getHgap() { return hgap; }
    public void setHgap(int hgap) { this.hgap = hgap; }
    public int getVgap() { return vgap; }
    public void setVgap(int vgap) { this.vgap = vgap; }

    @Override public void addLayoutComponent(String name, Component comp) {}
    @Override public void removeLayoutComponent(Component comp) {}

    private int[] gridDims(int n) {
        int r = rows, c = cols;
        if (r > 0) c = (n + r - 1) / r;
        else if (c > 0) r = (n + c - 1) / c;
        else { r = n; c = 1; }
        return new int[] { Math.max(1, r), Math.max(1, c) };
    }

    @Override
    public Dimension preferredLayoutSize(Container target) {
        int n = target.getComponentCount();
        if (n == 0) return new Dimension(0, 0);
        int[] rc = gridDims(n);
        int maxW = 0, maxH = 0;
        for (int i = 0; i < n; i++) {
            Dimension d = target.getComponent(i).getPreferredSize();
            if (d.width > maxW) maxW = d.width;
            if (d.height > maxH) maxH = d.height;
        }
        Insets ins = target.getInsets();
        return new Dimension(
            ins.left + ins.right + rc[1] * maxW + (rc[1] - 1) * hgap,
            ins.top + ins.bottom + rc[0] * maxH + (rc[0] - 1) * vgap);
    }

    @Override
    public Dimension minimumLayoutSize(Container target) {
        int n = target.getComponentCount();
        if (n == 0) return new Dimension(0, 0);
        int[] rc = gridDims(n);
        int maxW = 0, maxH = 0;
        for (int i = 0; i < n; i++) {
            Dimension d = target.getComponent(i).getMinimumSize();
            if (d.width > maxW) maxW = d.width;
            if (d.height > maxH) maxH = d.height;
        }
        Insets ins = target.getInsets();
        return new Dimension(
            ins.left + ins.right + rc[1] * maxW + (rc[1] - 1) * hgap,
            ins.top + ins.bottom + rc[0] * maxH + (rc[0] - 1) * vgap);
    }

    @Override
    public void layoutContainer(Container target) {
        int n = target.getComponentCount();
        if (n == 0) return;
        int[] rc = gridDims(n);
        int r = rc[0], c = rc[1];
        Insets ins = target.getInsets();
        int avW = target.getWidth() - ins.left - ins.right - (c - 1) * hgap;
        int avH = target.getHeight() - ins.top - ins.bottom - (r - 1) * vgap;
        int cellW = Math.max(0, avW / c);
        int cellH = Math.max(0, avH / r);
        for (int i = 0; i < n; i++) {
            int row = i / c, col = i % c;
            int x = ins.left + col * (cellW + hgap);
            int y = ins.top + row * (cellH + vgap);
            target.getComponent(i).setBounds(x, y, cellW, cellH);
        }
    }
}
