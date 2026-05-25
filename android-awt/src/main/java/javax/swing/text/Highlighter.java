package javax.swing.text;

import java.awt.Graphics;
import java.awt.Shape;

public interface Highlighter {
    void install(JTextComponent c);
    void deinstall(JTextComponent c);
    void paint(Graphics g);
    Object addHighlight(int p0, int p1, HighlightPainter p) throws BadLocationException;
    void removeHighlight(Object tag);
    void removeAllHighlights();
    void changeHighlight(Object tag, int p0, int p1) throws BadLocationException;
    Highlight[] getHighlights();

    interface Highlight {
        int getStartOffset();
        int getEndOffset();
        HighlightPainter getPainter();
    }

    interface HighlightPainter {
        void paint(Graphics g, int p0, int p1, Shape bounds, JTextComponent c);
    }
}
