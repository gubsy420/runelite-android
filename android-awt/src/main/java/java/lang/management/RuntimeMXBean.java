package java.lang.management;

public interface RuntimeMXBean {
    String getName();
    String getVmName();
    String getVmVendor();
    String getVmVersion();
    String getSpecName();
    String getSpecVendor();
    String getSpecVersion();
    String getManagementSpecVersion();
    String getClassPath();
    String getLibraryPath();
    boolean isBootClassPathSupported();
    String getBootClassPath();
    java.util.List<String> getInputArguments();
    long getUptime();
    long getStartTime();
    java.util.Map<String, String> getSystemProperties();
    default java.util.Map<String, String> getKeyMap() { return getSystemProperties(); }
}
