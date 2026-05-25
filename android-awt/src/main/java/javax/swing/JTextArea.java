package javax.swing;

import javax.swing.text.Document;
import javax.swing.text.JTextComponent;

public class JTextArea extends JTextComponent {
    private static final long serialVersionUID = 4255143196853147601L;

    private int rows, columns, tabSize = 8;
    private boolean lineWrap, wrapStyleWord;

    public JTextArea() {}
    public JTextArea(String text) { setText(text); }
    public JTextArea(int rows, int columns) { this.rows = rows; this.columns = columns; }
    public JTextArea(String text, int rows, int columns) { setText(text); this.rows = rows; this.columns = columns; }
    public JTextArea(Document doc) { setDocument(doc); }
    public JTextArea(Document doc, String text, int rows, int columns) { setDocument(doc); setText(text); this.rows = rows; this.columns = columns; }

    public int getRows() { return rows; }
    public void setRows(int rows) { this.rows = rows; }
    public int getColumns() { return columns; }
    public void setColumns(int columns) { this.columns = columns; }
    public int getTabSize() { return tabSize; }
    public void setTabSize(int size) { this.tabSize = size; }
    public boolean getLineWrap() { return lineWrap; }
    public void setLineWrap(boolean wrap) { this.lineWrap = wrap; }
    public boolean getWrapStyleWord() { return wrapStyleWord; }
    public void setWrapStyleWord(boolean word) { this.wrapStyleWord = word; }
    public void append(String str) { setText(getText() + str); }
    public void insert(String str, int pos) {}
    public void replaceRange(String str, int start, int end) {}
}
