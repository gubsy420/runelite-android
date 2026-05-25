package javax.swing.text;

public class BadLocationException extends Exception {
    private static final long serialVersionUID = -7712155421253767791L;
    private final int offset;

    public BadLocationException(String s, int offs) { super(s); this.offset = offs; }
    public int offsetRequested() { return offset; }
}
