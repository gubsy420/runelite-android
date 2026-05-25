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
        new Thread(r, "AWT-InvokeLater").start();
    }

    public static void invokeAndWait(Runnable r) throws InterruptedException {
        Thread t = new Thread(r, "AWT-InvokeAndWait");
        t.start();
        t.join();
    }
}
