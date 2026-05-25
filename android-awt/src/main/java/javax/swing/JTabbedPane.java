package javax.swing;

import java.awt.Color;
import java.awt.Component;
import javax.swing.event.ChangeListener;

public class JTabbedPane extends JComponent implements SwingConstants {
    private static final long serialVersionUID = 1L;
    public static final int WRAP_TAB_LAYOUT = 0;
    public static final int SCROLL_TAB_LAYOUT = 1;


    private int tabPlacement = TOP;
    private int tabLayoutPolicy = WRAP_TAB_LAYOUT;
    private int selectedIndex = -1;
    private final java.util.List<Component> tabs = new java.util.ArrayList<>();
    private final java.util.List<String> titles = new java.util.ArrayList<>();
    private final java.util.List<Icon> icons = new java.util.ArrayList<>();

    public JTabbedPane() { init(); }
    public JTabbedPane(int tabPlacement) { this.tabPlacement = tabPlacement; init(); }
    public JTabbedPane(int tabPlacement, int tabLayoutPolicy) {
        this.tabPlacement = tabPlacement; this.tabLayoutPolicy = tabLayoutPolicy; init();
    }

    private Component trailingComponent;

    private static final int TAB_SLOT_PX = 30;
    private static final int STRIP_THICKNESS = 36;
    /** When a tab is selected, the panel area takes this many pixels alongside the strip. */
    private static final int PANEL_EXTENT = 200;

    private void init() {
        setOpaque(true);
        setBackground(new java.awt.Color(0x28292D));
        setForeground(new java.awt.Color(0xC0C0C0));
    }

    /**
     * Render the tab strip ourselves since android-awt has no UI delegate. For tabPlacement
     * RIGHT/LEFT, tabs stack vertically; for TOP/BOTTOM, horizontally. Each tab is a slot of
     * fixed size with the icon centered. Selected tab gets a brighter background.
     */
    @Override
    protected void paintComponent(java.awt.Graphics g) {
        super.paintComponent(g);
        if (tabs.isEmpty()) return;

        boolean vertical = (tabPlacement == LEFT || tabPlacement == RIGHT);
        int trailing = trailingExtent();
        int slotW = vertical ? STRIP_THICKNESS : TAB_SLOT_PX;
        int slotH = vertical ? TAB_SLOT_PX     : STRIP_THICKNESS;

        // Available tab area excludes the trailing component region.
        int axisLen = vertical ? (getHeight() - trailing) : (getWidth() - trailing);
        int maxTabs = Math.max(0, axisLen) / Math.max(1, vertical ? slotH : slotW);

        // Strip origin: at right edge for RIGHT placement, etc.
        int baseX = stripX();
        int baseY = stripY();

        java.awt.Color saved = g.getColor();
        java.awt.Color selBg = new java.awt.Color(0x44464D);
        int limit = Math.min(tabs.size(), maxTabs);
        for (int i = 0; i < limit; i++) {
            int x = baseX + (vertical ? 0 : i * slotW);
            int y = baseY + (vertical ? i * slotH : 0);
            if (i == selectedIndex) {
                g.setColor(selBg);
                g.fillRect(x, y, slotW, slotH);
            }
            Icon icon = i < icons.size() ? icons.get(i) : null;
            if (icon != null && icon.getIconWidth() > 0 && icon.getIconHeight() > 0) {
                int iw = icon.getIconWidth();
                int ih = icon.getIconHeight();
                // Tab icons that arrive un-resized (RuneLite calls ImageUtil.resizeImage which
                // may no-op in our shadow) often blow past the slot. Scale-to-fit when needed.
                int targetW = iw, targetH = ih;
                if (iw > slotW - 4 || ih > slotH - 4) {
                    float s = Math.min((slotW - 4) / (float) iw, (slotH - 4) / (float) ih);
                    targetW = Math.max(1, Math.round(iw * s));
                    targetH = Math.max(1, Math.round(ih * s));
                }
                int ix = x + (slotW - targetW) / 2;
                int iy = y + (slotH - targetH) / 2;
                if (targetW != iw && icon instanceof ImageIcon) {
                    java.awt.Image img = ((ImageIcon) icon).getImage();
                    if (img != null) {
                        try { g.drawImage(img, ix, iy, targetW, targetH, this); } catch (Throwable ignored) {}
                        continue;
                    }
                }
                try { icon.paintIcon(this, g, ix, iy); } catch (Throwable ignored) {}
            }
        }
        if (saved != null) g.setColor(saved);
    }

    /**
     * FlatLaf-style trailing component: RuneLite hangs its top toolbar off the sidebar
     * via {@code FlatClientProperties.TABBED_PANE_TRAILING_COMPONENT}. We mount it as a
     * direct child and lay it out at the top (or bottom) of the tab strip.
     */
    @Override
    protected void onClientPropertySet(Object key, Object value) {
        if ("JTabbedPane.trailingComponent".equals(key)) {
            if (trailingComponent != null) {
                super.remove(trailingComponent);
                trailingComponent = null;
            }
            if (value instanceof Component) {
                trailingComponent = (Component) value;
                super.add(trailingComponent);
                if (getWidth() > 0 && getHeight() > 0) doLayout();
            }
        }
    }

    /**
     * For tabPlacement=RIGHT/LEFT, FlatLaf places the trailing component at the bottom of
     * the strip and stacks tabs from the top. We mirror that — tabs occupy the upper part
     * of the strip, the trailing component (RuneLite's toolbar buttons wrap) takes its
     * preferred height at the bottom.
     */
    private int trailingExtent() {
        if (trailingComponent == null) return 0;
        java.awt.Dimension pref = trailingComponent.getPreferredSize();
        boolean vertical = (tabPlacement == LEFT || tabPlacement == RIGHT);
        int want = vertical ? (pref.height > 0 ? pref.height : 40) : (pref.width > 0 ? pref.width : 40);
        int avail = vertical ? getHeight() : getWidth();
        return Math.max(0, Math.min(want, avail));
    }

    /** X offset of the tab strip within the pane (for tabPlacement RIGHT only — strip on right edge). */
    private int stripX() {
        return tabPlacement == RIGHT ? Math.max(0, getWidth() - STRIP_THICKNESS) : 0;
    }
    private int stripY() {
        return tabPlacement == BOTTOM ? Math.max(0, getHeight() - STRIP_THICKNESS) : 0;
    }
    /** Selected tab's panel occupies the area NOT taken by the strip. */
    private java.awt.Rectangle panelRect() {
        boolean vertical = (tabPlacement == LEFT || tabPlacement == RIGHT);
        if (vertical) {
            int px = tabPlacement == LEFT ? STRIP_THICKNESS : 0;
            return new java.awt.Rectangle(px, 0, Math.max(0, getWidth() - STRIP_THICKNESS), getHeight());
        }
        int py = tabPlacement == TOP ? STRIP_THICKNESS : 0;
        return new java.awt.Rectangle(0, py, getWidth(), Math.max(0, getHeight() - STRIP_THICKNESS));
    }

    @Override
    public void doLayout() {
        super.doLayout();
        if (getWidth() <= 0 || getHeight() <= 0) return;
        boolean vertical = (tabPlacement == LEFT || tabPlacement == RIGHT);
        int trailing = trailingExtent();

        // Trailing component sits at the END of the strip (bottom for RIGHT, etc.).
        if (trailingComponent != null) {
            if (vertical) {
                trailingComponent.setBounds(stripX(), getHeight() - trailing, STRIP_THICKNESS, trailing);
            } else {
                trailingComponent.setBounds(getWidth() - trailing, stripY(), trailing, STRIP_THICKNESS);
            }
        }

        // Position every tab's panel to fill the non-strip area; only the selected one is visible.
        java.awt.Rectangle pr = panelRect();
        for (int i = 0; i < tabs.size(); i++) {
            Component c = tabs.get(i);
            if (c == null) continue;
            c.setBounds(pr.x, pr.y, pr.width, pr.height);
        }
    }

    @Override
    public java.awt.Dimension getPreferredSize() {
        // Don't delegate to super — Container.getPreferredSize sums child widths via the
        // layout manager, and our hidden tab panels are 225px wide each, so we'd report
        // a huge preferred size and the sidebar would stay expanded even when closed.
        // The tab strip is the only "always visible" part; growing happens only when a
        // tab is selected.
        boolean vertical = (tabPlacement == LEFT || tabPlacement == RIGHT);
        boolean expanded = selectedIndex >= 0 && selectedIndex < tabs.size();
        int extent = STRIP_THICKNESS + (expanded ? PANEL_EXTENT : 0);
        if (vertical) return new java.awt.Dimension(extent, 0);
        else          return new java.awt.Dimension(0, extent);
    }

    @Override
    public java.awt.Dimension getMinimumSize() { return getPreferredSize(); }

    public int getTabPlacement() { return tabPlacement; }
    public void setTabPlacement(int p) { this.tabPlacement = p; }
    public int getTabLayoutPolicy() { return tabLayoutPolicy; }
    public void setTabLayoutPolicy(int policy) { this.tabLayoutPolicy = policy; }
    public int getSelectedIndex() { return selectedIndex; }
    public void setSelectedIndex(int index) {
        if (index == this.selectedIndex) return;
        this.selectedIndex = index;
        // Only the selected tab's component is visible; everything else hidden so paint
        // walker skips it.
        for (int i = 0; i < tabs.size(); i++) {
            Component c = tabs.get(i);
            if (c != null) c.setVisible(i == index);
        }
        javax.swing.event.ChangeEvent ev = new javax.swing.event.ChangeEvent(this);
        for (javax.swing.event.ChangeListener l : new java.util.ArrayList<>(changeListeners)) {
            try { l.stateChanged(ev); } catch (Throwable ignored) {}
        }
        // Don't call doLayout directly — the next frame's validate() cascade will pick
        // up the new preferred size and re-flow the parent (avoids re-entrancy with
        // ClientUI.Layout which itself calls setSize on us).
        repaint();
    }
    public Component getSelectedComponent() { return selectedIndex < 0 || selectedIndex >= tabs.size() ? null : tabs.get(selectedIndex); }
    public void setSelectedComponent(Component c) { selectedIndex = tabs.indexOf(c); }
    public void addTab(String title, Component component) { addTab(title, null, component, null); }
    public void addTab(String title, Icon icon, Component component) { addTab(title, icon, component, null); }
    public void addTab(String title, Icon icon, Component component, String tip) {
        tabs.add(component); titles.add(title == null ? "" : title); icons.add(icon);
        if (component != null) {
            super.add(component);
            component.setVisible(tabs.size() - 1 == selectedIndex);
        }
        if (getWidth() > 0 && getHeight() > 0) { doLayout(); repaint(); }
    }
    public void insertTab(String title, Icon icon, Component c, String tip, int index) {
        tabs.add(index, c); titles.add(index, title == null ? "" : title); icons.add(index, icon);
        if (c != null) {
            super.add(c);
            c.setVisible(index == selectedIndex);
        }
        if (getWidth() > 0 && getHeight() > 0) { doLayout(); repaint(); }
    }
    public Component add(Component component) { tabs.add(component); titles.add(""); icons.add(null); return component; }
    public Component add(String title, Component component) { tabs.add(component); titles.add(title); icons.add(null); return component; }
    public void remove(Component component) { int i = tabs.indexOf(component); if (i >= 0) removeTabAt(i); }
    public void remove(int index) { removeTabAt(index); }
    public void removeTabAt(int index) {
        tabs.remove(index); titles.remove(index); icons.remove(index);
        if (selectedIndex >= tabs.size()) selectedIndex = tabs.size() - 1;
    }
    public void removeAll() { tabs.clear(); titles.clear(); icons.clear(); selectedIndex = -1; }
    public int getTabCount() { return tabs.size(); }
    public int getTabRunCount() { return 1; }
    public String getTitleAt(int index) { return titles.get(index); }
    public void setTitleAt(int index, String title) { titles.set(index, title); }
    public Icon getIconAt(int index) { return null; }
    public void setIconAt(int index, Icon icon) {}
    public Icon getDisabledIconAt(int index) { return null; }
    public void setDisabledIconAt(int index, Icon icon) {}
    public String getToolTipTextAt(int index) { return null; }
    public void setToolTipTextAt(int index, String tip) {}
    public Color getForegroundAt(int index) { return null; }
    public void setForegroundAt(int index, Color c) {}
    public Color getBackgroundAt(int index) { return null; }
    public void setBackgroundAt(int index, Color c) {}
    public boolean isEnabledAt(int index) { return true; }
    public void setEnabledAt(int index, boolean enabled) {}
    public Component getComponentAt(int index) { return tabs.get(index); }
    public void setComponentAt(int index, Component c) { tabs.set(index, c); }
    public int getMnemonicAt(int tabIndex) { return -1; }
    public void setMnemonicAt(int tabIndex, int mnemonic) {}
    public int getDisplayedMnemonicIndexAt(int tabIndex) { return -1; }
    public void setDisplayedMnemonicIndexAt(int tabIndex, int mnemonicIndex) {}
    public java.awt.Rectangle getBoundsAt(int index) {
        if (index < 0 || index >= tabs.size()) return new java.awt.Rectangle();
        boolean vertical = (tabPlacement == LEFT || tabPlacement == RIGHT);
        if (vertical) {
            return new java.awt.Rectangle(stripX(), index * TAB_SLOT_PX, STRIP_THICKNESS, TAB_SLOT_PX);
        } else {
            return new java.awt.Rectangle(index * TAB_SLOT_PX, stripY(), TAB_SLOT_PX, STRIP_THICKNESS);
        }
    }
    public int indexOfTab(String title) { return titles.indexOf(title); }
    public int indexOfTab(Icon icon) { return -1; }
    public int indexOfComponent(Component c) { return tabs.indexOf(c); }
    public int indexAtLocation(int x, int y) {
        boolean vertical = (tabPlacement == LEFT || tabPlacement == RIGHT);
        int trailing = trailingExtent();
        // Reject taps outside the strip itself.
        if (vertical) {
            if (x < stripX() || x >= stripX() + STRIP_THICKNESS) return -1;
            if (y >= getHeight() - trailing) return -1;
        } else {
            if (y < stripY() || y >= stripY() + STRIP_THICKNESS) return -1;
            if (x >= getWidth() - trailing) return -1;
        }
        int idx = vertical ? y / TAB_SLOT_PX : x / TAB_SLOT_PX;
        if (idx < 0 || idx >= tabs.size()) return -1;
        return idx;
    }
    public Component getTabComponentAt(int index) { return null; }
    public void setTabComponentAt(int index, Component component) {}
    public int indexOfTabComponent(Component tabComponent) { return -1; }
    private final java.util.List<javax.swing.event.ChangeListener> changeListeners = new java.util.ArrayList<>();
    public void addChangeListener(ChangeListener l) { if (l != null) changeListeners.add(l); }
    public void removeChangeListener(ChangeListener l) { changeListeners.remove(l); }
}
