package javax.management;

import java.io.Serializable;

public interface QueryExp extends Serializable {
    boolean apply(ObjectName name) throws Exception;
    void setMBeanServer(MBeanServer s);
}
