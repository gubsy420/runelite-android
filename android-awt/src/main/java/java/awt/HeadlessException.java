package java.awt;

public class HeadlessException extends UnsupportedOperationException {
    private static final long serialVersionUID = 167183644944358563L;

    public HeadlessException() {}
    public HeadlessException(String msg) { super(msg); }
}
