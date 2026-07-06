package javax.swing;

import java.awt.Component;

/**
 * Minimal shadow of {@link javax.swing.MenuElement}. The real interface also declares
 * process{Mouse,Key}Event(... MenuSelectionManager ...), but android-awt has no
 * MenuSelectionManager and nothing in the client or the shadowed plugins drives menu
 * selection through it — they only query the element tree (e.g. quest-helper checks
 * {@code popup.getSubElements().length}). Keeping the interface to the queryable subset
 * avoids dragging in MenuSelectionManager while still letting JMenuItem/JPopupMenu
 * report their structure.
 */
public interface MenuElement
{
    void menuSelectionChanged(boolean isIncluded);

    MenuElement[] getSubElements();

    Component getComponent();
}
