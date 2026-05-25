package javax.management;

public class MalformedObjectNameException extends Exception {
    private static final long serialVersionUID = 1L;
    public MalformedObjectNameException() {}
    public MalformedObjectNameException(String message) { super(message); }
}
