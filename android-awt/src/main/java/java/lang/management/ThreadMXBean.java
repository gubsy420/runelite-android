package java.lang.management;

public interface ThreadMXBean {
    int getThreadCount();
    int getPeakThreadCount();
    long getTotalStartedThreadCount();
    int getDaemonThreadCount();
    long[] getAllThreadIds();
    long getCurrentThreadCpuTime();
    long getCurrentThreadUserTime();
    long getThreadCpuTime(long id);
    long getThreadUserTime(long id);
    boolean isThreadCpuTimeSupported();
    boolean isThreadCpuTimeEnabled();
    void setThreadCpuTimeEnabled(boolean enable);
}
