package java.awt;

import java.util.ArrayDeque;
import java.util.Deque;

public class EventQueue {
    private final Deque<AWTEvent> queue = new ArrayDeque<>();

    public EventQueue() {
    }

    public synchronized void postEvent(AWTEvent event) {
        if (event != null) queue.addLast(event);
    }

    public synchronized AWTEvent getNextEvent() throws InterruptedException {
        while (queue.isEmpty()) {
            wait();
        }
        return queue.pollFirst();
    }

    public synchronized AWTEvent peekEvent() {
        return queue.peekFirst();
    }

    public synchronized AWTEvent peekEvent(int id) {
        for (AWTEvent e : queue) {
            if (e.getID() == id) return e;
        }
        return null;
    }

    public static boolean isDispatchThread() {
        // Treat only our synthetic AWT-Invoke* workers as the EDT. Returning true
        // unconditionally would make every thread look like the EDT to RuneLite's
        // HTTP interceptor (RuneLiteModule.provideHttpClient), which rejects blocking
        // calls from the EDT — that breaks jav_config loading, world fetch, item
        // prices, session ping, etc., and downstream causes login to use stale/wrong
        // config (manifesting as "RuneScape has been updated" at login).
        String name = Thread.currentThread().getName();
        return name != null && name.startsWith("AWT-Invoke");
    }

    public static void invokeLater(Runnable r) {
        Thread t = new Thread(r, "AWT-InvokeLater");
        t.setUncaughtExceptionHandler(EDT_UEH);
        t.start();
    }

    public static void invokeAndWait(Runnable r) throws InterruptedException {
        Thread t = new Thread(r, "AWT-InvokeAndWait");
        t.setUncaughtExceptionHandler(EDT_UEH);
        t.start();
        t.join();
    }

    /**
     * Real Swing wraps EDT callbacks in a try/catch and logs uncaught exceptions —
     * a misbehaving listener doesn't kill the process. Our invokeLater used to spawn
     * a bare Thread with no UncaughtExceptionHandler, so Android's default handler
     * (which terminates the process) ran instead. Plugin startup is full of code
     * that throws here (NoSuchMethod on missing Swing API, NPE on half-constructed
     * components, etc.) — without this every such throw crashed the whole app the
     * moment a side panel was touched.
     */
    private static final Thread.UncaughtExceptionHandler EDT_UEH =
        new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                android.util.Log.w("AWT-EDT", "Uncaught exception on " + t.getName(), e);
            }
        };
}
