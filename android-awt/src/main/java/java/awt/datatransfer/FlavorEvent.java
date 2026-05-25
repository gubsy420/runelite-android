package java.awt.datatransfer;

import java.util.EventObject;

public class FlavorEvent extends EventObject {
    private static final long serialVersionUID = -8721848175935256777L;

    public FlavorEvent(Clipboard source) {
        super(source);
    }
}
