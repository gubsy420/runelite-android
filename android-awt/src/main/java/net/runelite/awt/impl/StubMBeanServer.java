package net.runelite.awt.impl;

import javax.management.Attribute;
import javax.management.MBeanServer;
import javax.management.ObjectName;
import javax.management.QueryExp;
import java.util.Collections;
import java.util.Set;

/**
 * Singleton stub MBean server that records nothing. Returned by
 * {@link java.lang.management.ManagementFactory#getPlatformMBeanServer()} so callers
 * succeed but JMX queries yield empty results.
 */
public final class StubMBeanServer implements MBeanServer {
    public static final StubMBeanServer INSTANCE = new StubMBeanServer();

    private StubMBeanServer() {}

    @Override public Object registerMBean(Object obj, ObjectName name) { return new Object(); }
    @Override public void unregisterMBean(ObjectName name) {}
    @Override public boolean isRegistered(ObjectName name) { return false; }
    @Override public Object getAttribute(ObjectName name, String attribute) { return null; }
    @Override public void setAttribute(ObjectName name, Attribute attribute) {}
    @Override public Object invoke(ObjectName name, String op, Object[] params, String[] signature) { return null; }
    @Override public Set<ObjectName> queryNames(ObjectName name, QueryExp query) { return Collections.emptySet(); }
    @Override public Integer getMBeanCount() { return 0; }
}
