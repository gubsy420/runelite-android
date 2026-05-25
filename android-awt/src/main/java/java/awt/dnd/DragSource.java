package java.awt.dnd;

import java.io.Serializable;

public class DragSource implements Serializable {
    private static final long serialVersionUID = 6236096958971414066L;
    public static final DragSource DEFAULT = new DragSource();

    public DragSource() {}

    public static DragSource getDefaultDragSource() { return DEFAULT; }
    public static boolean isDragImageSupported() { return false; }
}
