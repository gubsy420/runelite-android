package javax.swing;

import java.awt.Color;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

public class BorderFactory {
    private BorderFactory() {}

    public static Border createEmptyBorder() { return new EmptyBorder(0, 0, 0, 0); }
    public static Border createEmptyBorder(int t, int l, int b, int r) { return new EmptyBorder(t, l, b, r); }

    public static Border createLineBorder(Color color) { return new LineBorder(color); }
    public static Border createLineBorder(Color color, int thickness) { return new LineBorder(color, thickness); }
    public static Border createLineBorder(Color color, int thickness, boolean rounded) { return new LineBorder(color, thickness, rounded); }

    public static MatteBorder createMatteBorder(int top, int left, int bottom, int right, Color color) {
        return new MatteBorder(top, left, bottom, right, color);
    }
    public static MatteBorder createMatteBorder(int top, int left, int bottom, int right, Icon tile) {
        return new MatteBorder(top, left, bottom, right, tile);
    }

    public static CompoundBorder createCompoundBorder() { return new CompoundBorder(); }
    public static CompoundBorder createCompoundBorder(Border outside, Border inside) { return new CompoundBorder(outside, inside); }

    public static Border createRaisedBevelBorder() { return new EmptyBorder(2, 2, 2, 2); }
    public static Border createLoweredBevelBorder() { return new EmptyBorder(2, 2, 2, 2); }
    public static Border createEtchedBorder() { return new EmptyBorder(2, 2, 2, 2); }
    public static Border createEtchedBorder(Color highlight, Color shadow) { return new EmptyBorder(2, 2, 2, 2); }
    public static Border createTitledBorder(String title) { return new EmptyBorder(8, 4, 4, 4); }
    public static Border createTitledBorder(Border border, String title) { return new EmptyBorder(8, 4, 4, 4); }
    public static Border createDashedBorder(java.awt.Paint paint) { return new EmptyBorder(1, 1, 1, 1); }
}
