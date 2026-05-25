package javax.swing.text;

import java.awt.Graphics;
import java.awt.Point;
import javax.swing.event.ChangeListener;

public interface Caret {
    void install(JTextComponent c);
    void deinstall(JTextComponent c);
    void paint(Graphics g);
    void addChangeListener(ChangeListener l);
    void removeChangeListener(ChangeListener l);
    boolean isVisible();
    void setVisible(boolean v);
    boolean isSelectionVisible();
    void setSelectionVisible(boolean v);
    void setMagicCaretPosition(Point p);
    Point getMagicCaretPosition();
    void setBlinkRate(int rate);
    int getBlinkRate();
    int getDot();
    int getMark();
    void setDot(int dot);
    void moveDot(int dot);
}
