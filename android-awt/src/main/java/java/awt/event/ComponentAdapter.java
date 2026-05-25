package java.awt.event;

public abstract class ComponentAdapter implements ComponentListener {
    @Override public void componentResized(ComponentEvent e) {}
    @Override public void componentMoved(ComponentEvent e) {}
    @Override public void componentShown(ComponentEvent e) {}
    @Override public void componentHidden(ComponentEvent e) {}
}
