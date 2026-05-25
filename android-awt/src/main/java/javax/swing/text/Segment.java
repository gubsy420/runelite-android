package javax.swing.text;

import java.text.CharacterIterator;

public class Segment implements Cloneable, CharacterIterator, CharSequence {
    public char[] array;
    public int offset;
    public int count;
    private boolean partialReturn;
    private int pos;

    public Segment() { this(null, 0, 0); }
    public Segment(char[] array, int offset, int count) {
        this.array = array; this.offset = offset; this.count = count;
    }

    public void setPartialReturn(boolean p) { this.partialReturn = p; }
    public boolean isPartialReturn() { return partialReturn; }

    @Override public char first() { pos = offset; return current(); }
    @Override public char last() { pos = offset + count - 1; return current(); }
    @Override public char current() { return (pos >= offset && pos < offset + count && array != null) ? array[pos] : DONE; }
    @Override public char next() { pos++; return current(); }
    @Override public char previous() { pos--; return pos < offset ? DONE : current(); }
    @Override public char setIndex(int p) { pos = p; return current(); }
    @Override public int getBeginIndex() { return offset; }
    @Override public int getEndIndex() { return offset + count; }
    @Override public int getIndex() { return pos; }

    @Override public int length() { return count; }
    @Override public char charAt(int idx) { return array[offset + idx]; }
    @Override public CharSequence subSequence(int s, int e) { return new String(array, offset + s, e - s); }

    @Override public Object clone() {
        try { return super.clone(); } catch (CloneNotSupportedException e) { throw new InternalError(e); }
    }
}
