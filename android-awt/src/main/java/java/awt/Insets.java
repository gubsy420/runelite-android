package java.awt;

import java.io.Serializable;

public class Insets implements Cloneable, Serializable {
    private static final long serialVersionUID = -2272572637695466749L;

    public int top;
    public int left;
    public int bottom;
    public int right;

    public Insets(int top, int left, int bottom, int right) {
        this.top = top;
        this.left = left;
        this.bottom = bottom;
        this.right = right;
    }

    public void set(int top, int left, int bottom, int right) {
        this.top = top;
        this.left = left;
        this.bottom = bottom;
        this.right = right;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Insets) {
            Insets i = (Insets) obj;
            return top == i.top && left == i.left && bottom == i.bottom && right == i.right;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int sum1 = left + bottom;
        int sum2 = right + top;
        int val1 = sum1 * (sum1 + 1) / 2 + left;
        int val2 = sum2 * (sum2 + 1) / 2 + top;
        int sum3 = val1 + val2;
        return sum3 * (sum3 + 1) / 2 + val2;
    }

    @Override
    public String toString() {
        return getClass().getName() + "[top=" + top + ",left=" + left
            + ",bottom=" + bottom + ",right=" + right + "]";
    }

    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new InternalError(e);
        }
    }
}
