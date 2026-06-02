package javax.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/**
 * Swing Timer shim. The original implementation just flipped a {@code running} flag
 * and never actually fired — the splash screen relies on a 100ms repeating Timer to
 * push progress/text updates into its JLabels, so without real firing the splash
 * froze on the constructor defaults ("Loading", empty subaction, empty bar).
 *
 * Single shared scheduled executor across all Timers. Listeners run on the executor
 * thread (real Swing fires on the EDT; our shim's repaint walks the component tree
 * each Compose frame anyway, so cross-thread setText is safe enough for the splash).
 */
public class Timer implements Serializable {
    private static final long serialVersionUID = 1L;

    private static final ScheduledExecutorService EXEC =
        Executors.newSingleThreadScheduledExecutor(r -> {
            Thread t = new Thread(r, "AWT-Timer");
            t.setDaemon(true);
            return t;
        });

    private final List<ActionListener> listeners = new ArrayList<>();
    private int delay;
    private int initialDelay;
    private boolean repeats = true;
    private volatile boolean running;
    private boolean coalesce = true;
    private String actionCommand;
    private volatile ScheduledFuture<?> task;

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

    public synchronized void start() {
        if (running) return;
        running = true;
        Runnable r = () -> {
            try {
                ActionEvent ev = new ActionEvent(this, ActionEvent.ACTION_PERFORMED,
                    actionCommand, System.currentTimeMillis(), 0);
                fireActionPerformed(ev);
            } catch (Throwable t) {
                // Swallow; don't kill the shared scheduler thread.
            }
            if (!repeats) running = false;
        };
        int start = Math.max(0, initialDelay);
        int every = Math.max(1, delay);
        task = repeats
            ? EXEC.scheduleAtFixedRate(r, start, every, TimeUnit.MILLISECONDS)
            : EXEC.schedule(r, start, TimeUnit.MILLISECONDS);
    }

    public synchronized void restart() { stop(); start(); }

    public synchronized void stop() {
        running = false;
        ScheduledFuture<?> t = task;
        if (t != null) { t.cancel(false); task = null; }
    }

    public boolean isRunning() { return running; }
    public void setLogTimers(boolean flag) {}
    public static boolean getLogTimers() { return false; }
    protected void fireActionPerformed(ActionEvent e) {
        for (ActionListener l : listeners) l.actionPerformed(e);
    }
}
