package java.awt.event;

public abstract class WindowAdapter implements WindowListener, WindowFocusListener, WindowStateListener {
    @Override public void windowOpened(WindowEvent e) {}
    @Override public void windowClosing(WindowEvent e) {}
    @Override public void windowClosed(WindowEvent e) {}
    @Override public void windowIconified(WindowEvent e) {}
    @Override public void windowDeiconified(WindowEvent e) {}
    @Override public void windowActivated(WindowEvent e) {}
    @Override public void windowDeactivated(WindowEvent e) {}
    @Override public void windowGainedFocus(WindowEvent e) {}
    @Override public void windowLostFocus(WindowEvent e) {}
    @Override public void windowStateChanged(WindowEvent e) {}
}
