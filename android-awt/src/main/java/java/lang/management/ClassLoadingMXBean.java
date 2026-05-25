package java.lang.management;

public interface ClassLoadingMXBean {
    long getTotalLoadedClassCount();
    int getLoadedClassCount();
    long getUnloadedClassCount();
    boolean isVerbose();
    void setVerbose(boolean value);
}
