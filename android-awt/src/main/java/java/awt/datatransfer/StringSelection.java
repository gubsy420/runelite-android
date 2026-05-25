package java.awt.datatransfer;

import java.io.IOException;
import java.io.StringReader;

public class StringSelection implements Transferable, ClipboardOwner {
    private static final DataFlavor[] FLAVORS = {DataFlavor.stringFlavor, DataFlavor.plainTextFlavor};
    private final String data;

    public StringSelection(String data) {
        this.data = data;
    }

    @Override
    public DataFlavor[] getTransferDataFlavors() {
        return FLAVORS.clone();
    }

    @Override
    public boolean isDataFlavorSupported(DataFlavor flavor) {
        for (DataFlavor f : FLAVORS) if (f.equals(flavor)) return true;
        return false;
    }

    @Override
    public Object getTransferData(DataFlavor flavor) throws UnsupportedFlavorException, IOException {
        if (flavor.equals(DataFlavor.stringFlavor)) return data;
        if (flavor.equals(DataFlavor.plainTextFlavor)) return new StringReader(data == null ? "" : data);
        throw new UnsupportedFlavorException(flavor);
    }

    @Override
    public void lostOwnership(Clipboard clipboard, Transferable contents) {
    }
}
