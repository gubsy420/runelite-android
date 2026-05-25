package java.awt.datatransfer;

import java.util.ArrayList;
import java.util.List;

public class Clipboard {
    private final String name;
    private Transferable contents;
    private ClipboardOwner owner;
    private final List<FlavorListener> flavorListeners = new ArrayList<>();

    public Clipboard(String name) {
        this.name = name;
    }

    public String getName() { return name; }

    public synchronized void setContents(Transferable contents, ClipboardOwner owner) {
        ClipboardOwner oldOwner = this.owner;
        Transferable oldContents = this.contents;
        this.contents = contents;
        this.owner = owner;
        if (oldOwner != null && oldOwner != owner) {
            oldOwner.lostOwnership(this, oldContents);
        }
    }

    public synchronized Transferable getContents(Object requestor) {
        return contents;
    }

    public DataFlavor[] getAvailableDataFlavors() {
        Transferable t = contents;
        return t == null ? new DataFlavor[0] : t.getTransferDataFlavors();
    }

    public boolean isDataFlavorAvailable(DataFlavor flavor) {
        Transferable t = contents;
        return t != null && t.isDataFlavorSupported(flavor);
    }

    public void addFlavorListener(FlavorListener listener) { if (listener != null) flavorListeners.add(listener); }
    public void removeFlavorListener(FlavorListener listener) { flavorListeners.remove(listener); }
    public FlavorListener[] getFlavorListeners() { return flavorListeners.toArray(new FlavorListener[0]); }
}
