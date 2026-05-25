package javax.swing.text;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import javax.swing.Action;

public abstract class EditorKit implements Cloneable {
    public EditorKit() {}

    public abstract Object clone();
    public abstract String getContentType();
    public abstract Action[] getActions();
    public abstract javax.swing.text.Caret createCaret();
    public abstract Document createDefaultDocument();

    public void install(JTextComponent c) {}
    public void deinstall(JTextComponent c) {}

    public void read(InputStream in, Document doc, int pos) throws IOException, BadLocationException {}
    public void read(Reader in, Document doc, int pos) throws IOException, BadLocationException {}
    public void write(OutputStream out, Document doc, int pos, int len) throws IOException, BadLocationException {}
    public void write(Writer out, Document doc, int pos, int len) throws IOException, BadLocationException {}
}
