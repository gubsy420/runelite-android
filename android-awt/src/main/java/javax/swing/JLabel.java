package javax.swing;

public class JLabel extends JComponent implements SwingConstants {
    private static final long serialVersionUID = 5496508283662221534L;

    private String text = "";
    private Icon icon;
    private int horizontalAlignment = LEADING;
    private int verticalAlignment = CENTER;
    private int horizontalTextPosition = TRAILING;
    private int verticalTextPosition = CENTER;
    private int iconTextGap = 4;

    public JLabel() {}
    public JLabel(Icon image) { this.icon = image; }
    public JLabel(Icon image, int horizontalAlignment) { this.icon = image; this.horizontalAlignment = horizontalAlignment; }
    public JLabel(String text) { this.text = text == null ? "" : text; }
    public JLabel(String text, int horizontalAlignment) { this.text = text == null ? "" : text; this.horizontalAlignment = horizontalAlignment; }
    public JLabel(String text, Icon icon, int horizontalAlignment) {
        this.text = text == null ? "" : text; this.icon = icon; this.horizontalAlignment = horizontalAlignment;
    }

    public String getText() { return text; }
    public void setText(String text) { this.text = text == null ? "" : text; }
    public Icon getIcon() { return icon; }
    public void setIcon(Icon icon) { this.icon = icon; }
    public Icon getDisabledIcon() { return icon; }
    public void setDisabledIcon(Icon icon) {}
    public int getHorizontalAlignment() { return horizontalAlignment; }
    public void setHorizontalAlignment(int a) { this.horizontalAlignment = a; }
    public int getVerticalAlignment() { return verticalAlignment; }
    public void setVerticalAlignment(int a) { this.verticalAlignment = a; }
    public int getHorizontalTextPosition() { return horizontalTextPosition; }
    public void setHorizontalTextPosition(int p) { this.horizontalTextPosition = p; }
    public int getVerticalTextPosition() { return verticalTextPosition; }
    public void setVerticalTextPosition(int p) { this.verticalTextPosition = p; }
    public int getIconTextGap() { return iconTextGap; }
    public void setIconTextGap(int g) { this.iconTextGap = g; }
    public void setLabelFor(java.awt.Component c) {}
    public java.awt.Component getLabelFor() { return null; }
    public void setDisplayedMnemonic(int key) {}
    public int getDisplayedMnemonic() { return 0; }

    /** JShadowedLabel and friends call the typed overload — accept and discard. */
    public void setUI(javax.swing.plaf.LabelUI ui) { super.setUI(ui); }

    @Override
    public java.awt.Dimension getPreferredSize() {
        if (isPreferredSizeSet()) return super.getPreferredSize();
        java.awt.FontMetrics fm = getFontMetrics(getFont());
        int textW = text == null ? 0 : fm.stringWidth(text);
        int iconW = icon == null ? 0 : icon.getIconWidth();
        int gap = (text != null && !text.isEmpty() && icon != null) ? iconTextGap : 0;
        int w = iconW + gap + textW;
        int textH = fm.getHeight();
        int iconH = icon == null ? 0 : icon.getIconHeight();
        int h = Math.max(textH, iconH);
        return new java.awt.Dimension(w + 2, h + 2);
    }

    @Override
    protected void paintComponent(java.awt.Graphics g) {
        super.paintComponent(g);
        java.awt.FontMetrics fm = g.getFontMetrics(getFont());
        int textW = text == null ? 0 : fm.stringWidth(text);
        int textH = fm.getHeight();
        int iconW = icon == null ? 0 : icon.getIconWidth();
        int iconH = icon == null ? 0 : icon.getIconHeight();
        int gap = (text != null && !text.isEmpty() && icon != null) ? iconTextGap : 0;
        int contentW = iconW + gap + textW;
        int x;
        switch (horizontalAlignment) {
            case CENTER:   x = (getWidth() - contentW) / 2; break;
            case RIGHT:
            case TRAILING: x = getWidth() - contentW; break;
            default:       x = 0;
        }
        int y = (getHeight() - Math.max(textH, iconH)) / 2;
        if (icon != null) {
            int iy = y + (Math.max(textH, iconH) - iconH) / 2;
            try { icon.paintIcon(this, g, x, iy); } catch (Throwable ignored) {}
            x += iconW + gap;
        }
        if (text != null && !text.isEmpty()) {
            java.awt.Color saved = g.getColor();
            g.setColor(getForeground());
            g.setFont(getFont());
            int baseline = y + fm.getAscent();
            g.drawString(text, x, baseline);
            if (saved != null) g.setColor(saved);
        }
    }
}
