package java.lang.management;

public interface MemoryPoolMXBean {
    String getName();
    String[] getMemoryManagerNames();
    MemoryUsage getUsage();
    MemoryUsage getPeakUsage();
    void resetPeakUsage();
    boolean isValid();
    MemoryType getType();
    MemoryUsage getCollectionUsage();
    boolean isUsageThresholdSupported();
    long getUsageThreshold();
    void setUsageThreshold(long threshold);
}
