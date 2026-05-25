package javax.management;

import java.io.Serializable;

public class Attribute implements Serializable {
    private static final long serialVersionUID = 1L;
    private final String name;
    private final Object value;

    public Attribute(String name, Object value) { this.name = name; this.value = value; }
    public String getName() { return name; }
    public Object getValue() { return value; }
}
