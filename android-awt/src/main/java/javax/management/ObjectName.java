package javax.management;

import java.io.Serializable;

public class ObjectName implements Serializable {
    private static final long serialVersionUID = 1L;
    private final String name;

    public ObjectName(String name) throws MalformedObjectNameException {
        this.name = name;
    }

    public ObjectName(String domain, String key, String value) throws MalformedObjectNameException {
        this.name = domain + ":" + key + "=" + value;
    }

    public ObjectName(String domain, java.util.Hashtable<String, String> table) throws MalformedObjectNameException {
        this.name = domain;
    }

    public String getCanonicalName() { return name; }
    public String getDomain() { return name == null ? "" : name.split(":")[0]; }
    public String getKeyProperty(String property) { return null; }
    public java.util.Hashtable<String, String> getKeyPropertyList() { return new java.util.Hashtable<>(); }
    public boolean apply(ObjectName name) { return this.name.equals(name.name); }

    @Override public String toString() { return name; }
    @Override public boolean equals(Object obj) { return obj instanceof ObjectName && ((ObjectName) obj).name.equals(name); }
    @Override public int hashCode() { return name == null ? 0 : name.hashCode(); }
}
