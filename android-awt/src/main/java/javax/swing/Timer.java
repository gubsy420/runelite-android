package javax.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.swing.event.EventListenerList;

public class Timer implements Serializable {
    private static final long serialVersionUID = 1L;
    private final List<ActionListener> listeners = new ArrayList<>();
    private int delay;
    private int initialDelay;
    private boolean repeats = true;
    private boolean running;
    private boolean coalesce = true;
    private String actionCommand;

    public Timer(int delay, ActionListener listener) {
        this.delay = delay;
        this.initialDelay = delay;
        if (listener != null) listeners.add(listener);
    }

    public void addActionListener(ActionListener l) { if (l != null) listeners.add(l); }
    public void removeActionListener(ActionListener l) { listeners.remove(l); }
    public ActionListener[] getActionListeners() { return listeners.toArray(new ActionListener[0]); }

    public int getDelay() { return delay; }
    public void setDelay(int delay) { this.delay = delay; }
    public int getInitialDelay() { return initialDelay; }
    public void setInitialDelay(int initialDelay) { this.initialDelay = initialDelay; }
    public boolean isRepeats() { return repeats; }
    public void setRepeats(boolean flag) { this.repeats = flag; }
    public boolean isCoalesce() { return coalesce; }
    public void setCoalesce(boolean flag) { this.coalesce = flag; }
    public String getActionCommand() { return actionCommand; }
    public void setActionCommand(String command) { this.actionCommand = command; }
    public void start() { running = true; }
    public void restart() { running = true; }
    public void stop() { running = false; }
    public boolean isRunning() { return running; }
    public void setLogTimers(boolean flag) {}
    public static boolean getLogTimers() { return false; }
    protected void fireActionPerformed(ActionEvent e) {
        for (ActionListener l : listeners) l.actionPerformed(e);
    }
}
