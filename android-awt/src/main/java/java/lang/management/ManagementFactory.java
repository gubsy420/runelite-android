package java.lang.management;

public class ManagementFactory {
    private ManagementFactory() {}

    /**
     * RuneLite registers JMX MBeans for diagnostics; we return a stub server that ignores
     * registrations. Real JMX isn't available on Android — anything pulling metrics off
     * this server would see an empty result.
     */
    public static javax.management.MBeanServer getPlatformMBeanServer() {
        return net.runelite.awt.impl.StubMBeanServer.INSTANCE;
    }

    public static RuntimeMXBean getRuntimeMXBean() {
        return new StubRuntimeMXBean();
    }

    public static java.util.List<MemoryPoolMXBean> getMemoryPoolMXBeans() {
        return java.util.Collections.emptyList();
    }

    public static java.util.List<GarbageCollectorMXBean> getGarbageCollectorMXBeans() {
        return java.util.Collections.emptyList();
    }

    public static MemoryMXBean getMemoryMXBean() {
        return new StubMemoryMXBean();
    }

    public static ThreadMXBean getThreadMXBean() {
        return new StubThreadMXBean();
    }

    public static OperatingSystemMXBean getOperatingSystemMXBean() {
        return new StubOperatingSystemMXBean();
    }

    public static ClassLoadingMXBean getClassLoadingMXBean() {
        return new StubClassLoadingMXBean();
    }

    public static java.util.List<java.lang.management.MemoryManagerMXBean> getMemoryManagerMXBeans() {
        return java.util.Collections.emptyList();
    }

    private static final long START_TIME = System.currentTimeMillis();

    private static final class StubRuntimeMXBean implements RuntimeMXBean {
        @Override public String getName() { return "android-runelite-shim"; }
        @Override public String getVmName() { return "Dalvik"; }
        @Override public String getVmVendor() { return "Android"; }
        @Override public String getVmVersion() { return android.os.Build.VERSION.RELEASE; }
        @Override public String getSpecName() { return "Java Virtual Machine Specification"; }
        @Override public String getSpecVendor() { return "Oracle"; }
        @Override public String getSpecVersion() { return "1.8"; }
        @Override public String getManagementSpecVersion() { return "2.0"; }
        @Override public String getClassPath() { return ""; }
        @Override public String getLibraryPath() { return ""; }
        @Override public boolean isBootClassPathSupported() { return false; }
        @Override public String getBootClassPath() { throw new UnsupportedOperationException(); }
        @Override public java.util.List<String> getInputArguments() { return java.util.Collections.emptyList(); }
        @Override public long getUptime() { return System.currentTimeMillis() - START_TIME; }
        @Override public long getStartTime() { return START_TIME; }
        @Override public java.util.Map<String, String> getSystemProperties() {
            java.util.Map<String, String> m = new java.util.HashMap<>();
            for (java.util.Map.Entry<Object, Object> e : System.getProperties().entrySet()) {
                m.put(e.getKey().toString(), e.getValue() == null ? "" : e.getValue().toString());
            }
            return m;
        }
        @Override public java.util.Map<String, String> getKeyMap() { return getSystemProperties(); }
    }

    private static final class StubMemoryMXBean implements MemoryMXBean {
        @Override public MemoryUsage getHeapMemoryUsage() { return new MemoryUsage(0, 0, 0, Runtime.getRuntime().maxMemory()); }
        @Override public MemoryUsage getNonHeapMemoryUsage() { return new MemoryUsage(0, 0, 0, 0); }
        @Override public int getObjectPendingFinalizationCount() { return 0; }
        @Override public boolean isVerbose() { return false; }
        @Override public void setVerbose(boolean value) {}
        @Override public void gc() { System.gc(); }
    }

    private static final class StubThreadMXBean implements ThreadMXBean {
        @Override public int getThreadCount() { return Thread.activeCount(); }
        @Override public int getPeakThreadCount() { return Thread.activeCount(); }
        @Override public long getTotalStartedThreadCount() { return Thread.activeCount(); }
        @Override public int getDaemonThreadCount() { return 0; }
        @Override public long[] getAllThreadIds() { return new long[0]; }
        @Override public long getCurrentThreadCpuTime() { return -1; }
        @Override public long getCurrentThreadUserTime() { return -1; }
        @Override public long getThreadCpuTime(long id) { return -1; }
        @Override public long getThreadUserTime(long id) { return -1; }
        @Override public boolean isThreadCpuTimeSupported() { return false; }
        @Override public boolean isThreadCpuTimeEnabled() { return false; }
        @Override public void setThreadCpuTimeEnabled(boolean enable) {}
    }

    private static final class StubOperatingSystemMXBean implements OperatingSystemMXBean {
        @Override public String getName() { return "Android"; }
        @Override public String getArch() { return android.os.Build.SUPPORTED_ABIS.length > 0 ? android.os.Build.SUPPORTED_ABIS[0] : "unknown"; }
        @Override public String getVersion() { return android.os.Build.VERSION.RELEASE; }
        @Override public int getAvailableProcessors() { return Runtime.getRuntime().availableProcessors(); }
        @Override public double getSystemLoadAverage() { return -1.0; }
    }

    private static final class StubClassLoadingMXBean implements ClassLoadingMXBean {
        @Override public long getTotalLoadedClassCount() { return 0; }
        @Override public int getLoadedClassCount() { return 0; }
        @Override public long getUnloadedClassCount() { return 0; }
        @Override public boolean isVerbose() { return false; }
        @Override public void setVerbose(boolean value) {}
    }
}
