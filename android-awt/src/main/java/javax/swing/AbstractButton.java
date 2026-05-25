package javax.swing;

import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import javax.swing.event.ChangeListener;

public abstract class AbstractButton extends JComponent {
    private static final long serialVersionUID = -937921912697029109L;

    public static final String TEXT_CHANGED_PROPERTY = "text";
    public static final String ICON_CHANGED_PROPERTY = "icon";
    public static final String SELECTED_CHANGED_PROPERTY = "selected";

    public static final int HORIZONTAL = SwingConstants.HORIZONTAL;
    public static final int VERTICAL = SwingConstants.VERTICAL;
    public static final int CENTER = SwingConstants.CENTER;
    public static final int LEFT = SwingConstants.LEFT;
    public static final int RIGHT = SwingConstants.RIGHT;
    public static final int TOP = SwingConstants.TOP;
    public static final int BOTTOM = SwingConstants.BOTTOM;

    protected ButtonModel model = new DefaultButtonModel();
    protected String text = "";
    protected Icon icon;
    private Icon pressedIcon, selectedIcon, rolloverIcon, disabledIcon;
    private int horizontalAlignment = CENTER;
    private int horizontalTextPosition = TRAILING;
    private int verticalAlignment = CENTER;
    private int verticalTextPosition = CENTER;
    private static final int TRAILING = SwingConstants.TRAILING;
    private boolean borderPainted = true;
    private boolean contentAreaFilled = true;
    private boolean focusPainted = true;
    private boolean rolloverEnabled;
    private Action action;

    public AbstractButton() {}

    public String getText() { return text; }
    public void setText(String text) { this.text = text == null ? "" : text; }
    public Icon getIcon() { return icon; }
    public void setIcon(Icon icon) { this.icon = icon; }
    public Icon getPressedIcon() { return pressedIcon; }
    public void setPressedIcon(Icon icon) { this.pressedIcon = icon; }
    public Icon getSelectedIcon() { return selectedIcon; }
    public void setSelectedIcon(Icon icon) { this.selectedIcon = icon; }
    public Icon getRolloverIcon() { return rolloverIcon; }
    public void setRolloverIcon(Icon icon) { this.rolloverIcon = icon; }
    public Icon getDisabledIcon() { return disabledIcon; }
    public void setDisabledIcon(Icon icon) { this.disabledIcon = icon; }

    public int getHorizontalAlignment() { return horizontalAlignment; }
    public void setHorizontalAlignment(int alignment) { this.horizontalAlignment = alignment; }
    public int getHorizontalTextPosition() { return horizontalTextPosition; }
    public void setHorizontalTextPosition(int textPosition) { this.horizontalTextPosition = textPosition; }
    public int getVerticalAlignment() { return verticalAlignment; }
    public void setVerticalAlignment(int alignment) { this.verticalAlignment = alignment; }
    public int getVerticalTextPosition() { return verticalTextPosition; }
    public void setVerticalTextPosition(int textPosition) { this.verticalTextPosition = textPosition; }

    public boolean isBorderPainted() { return borderPainted; }
    public void setBorderPainted(boolean b) { this.borderPainted = b; }
    public boolean isContentAreaFilled() { return contentAreaFilled; }
    public void setContentAreaFilled(boolean b) { this.contentAreaFilled = b; }
    public boolean isFocusPainted() { return focusPainted; }
    public void setFocusPainted(boolean b) { this.focusPainted = b; }
    public boolean isRolloverEnabled() { return rolloverEnabled; }
    public void setRolloverEnabled(boolean b) { this.rolloverEnabled = b; }

    public ButtonModel getModel() { return model; }
    public void setModel(ButtonModel newModel) { this.model = newModel; }

    public boolean isSelected() { return model.isSelected(); }
    public void setSelected(boolean b) { model.setSelected(b); }

    private final java.util.List<ActionListener> actionListeners = new java.util.ArrayList<>();
    private final java.util.List<ItemListener> itemListeners = new java.util.ArrayList<>();

    public void doClick() { doClick(68); }
    public void doClick(int pressTime) {
        if (!isEnabled()) return;
        // For toggleable buttons (JCheckBox, JToggleButton), a click flips the selection
        // and fires an ItemEvent before the ActionEvent — mirrors real Swing.
        boolean toggleable = (this instanceof JToggleButton);
        if (toggleable) {
            boolean wasSelected = isSelected();
            setSelected(!wasSelected);
            int state = !wasSelected
                ? java.awt.event.ItemEvent.SELECTED
                : java.awt.event.ItemEvent.DESELECTED;
            java.awt.event.ItemEvent iev = new java.awt.event.ItemEvent(
                this, java.awt.event.ItemEvent.ITEM_STATE_CHANGED, this, state);
            for (ItemListener il : new java.util.ArrayList<>(itemListeners)) {
                try { il.itemStateChanged(iev); } catch (Throwable ignored) {}
            }
        }
        java.awt.event.ActionEvent ev = new java.awt.event.ActionEvent(
            this, java.awt.event.ActionEvent.ACTION_PERFORMED, getActionCommand());
        for (ActionListener l : new java.util.ArrayList<>(actionListeners)) {
            try { l.actionPerformed(ev); } catch (Throwable ignored) {}
        }
    }

    public void setMnemonic(int mnemonic) { model.setMnemonic(mnemonic); }
    public int getMnemonic() { return model.getMnemonic(); }
    public void setMnemonic(char mnemonic) { model.setMnemonic(mnemonic); }
    public void setDisplayedMnemonicIndex(int index) {}
    public int getDisplayedMnemonicIndex() { return -1; }

    public void setActionCommand(String s) { model.setActionCommand(s); }
    public String getActionCommand() { return model.getActionCommand() != null ? model.getActionCommand() : text; }

    public void setAction(Action a) { this.action = a; }
    public Action getAction() { return action; }

    public void addActionListener(ActionListener l) { if (l != null) actionListeners.add(l); }
    public void removeActionListener(ActionListener l) { actionListeners.remove(l); }
    public ActionListener[] getActionListeners() { return actionListeners.toArray(new ActionListener[0]); }
    public void addItemListener(ItemListener l) { if (l != null) itemListeners.add(l); }
    public void removeItemListener(ItemListener l) { itemListeners.remove(l); }
    public ItemListener[] getItemListeners() { return itemListeners.toArray(new ItemListener[0]); }
    public ChangeListener[] getChangeListeners() { return new ChangeListener[0]; }
    public void addChangeListener(ChangeListener l) {}
    public void removeChangeListener(ChangeListener l) {}

    /**
     * Render the button's icon and (very simplified) text. RuneLite's toolbar nav buttons
     * are 23×23 with just an icon — that's the case we care about most.
     */
    @Override
    protected void paintComponent(java.awt.Graphics g) {
        super.paintComponent(g);
        Icon ic = (model != null && model.isSelected() && selectedIcon != null) ? selectedIcon : icon;
        if (ic == null || ic.getIconWidth() <= 0 || ic.getIconHeight() <= 0) return;

        int iw = ic.getIconWidth();
        int ih = ic.getIconHeight();
        // Scale-to-fit when the icon overflows the button. For ImageIcon we can drawImage
        // at a target size — for anything else, just clip via the existing graphics clip.
        if (iw > getWidth() || ih > getHeight()) {
            if (ic instanceof ImageIcon) {
                java.awt.Image img = ((ImageIcon) ic).getImage();
                if (img != null) {
                    float s = Math.min(getWidth() / (float) iw, getHeight() / (float) ih);
                    int dw = Math.max(1, Math.round(iw * s));
                    int dh = Math.max(1, Math.round(ih * s));
                    int ix = (getWidth() - dw) / 2;
                    int iy = (getHeight() - dh) / 2;
                    try { g.drawImage(img, ix, iy, dw, dh, this); } catch (Throwable ignored) {}
                    return;
                }
            }
        }
        int ix = (getWidth() - iw) / 2;
        int iy = (getHeight() - ih) / 2;
        try { ic.paintIcon(this, g, ix, iy); } catch (Throwable ignored) {}
    }
}
