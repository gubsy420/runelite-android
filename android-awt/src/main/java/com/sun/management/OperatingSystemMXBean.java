package com.sun.management;

/**
 * Extended Operating System MXBean stub. Used by RuneLite for diagnostics; we return -1
 * (the JDK's "not available" sentinel) everywhere.
 */
public interface OperatingSystemMXBean extends java.lang.management.OperatingSystemMXBean {
    default long getCommittedVirtualMemorySize() { return -1L; }
    default long getTotalSwapSpaceSize() { return -1L; }
    default long getFreeSwapSpaceSize() { return -1L; }
    default long getProcessCpuTime() { return -1L; }
    default long getFreePhysicalMemorySize() { return -1L; }
    default long getTotalPhysicalMemorySize() { return -1L; }
    default double getSystemCpuLoad() { return -1.0; }
    default double getProcessCpuLoad() { return -1.0; }
    default double getCpuLoad() { return -1.0; }
    default long getFreeMemorySize() { return -1L; }
    default long getTotalMemorySize() { return -1L; }
}
