package java.awt.image;

public abstract class DataBuffer {
    public static final int TYPE_BYTE      = 0;
    public static final int TYPE_USHORT    = 1;
    public static final int TYPE_SHORT     = 2;
    public static final int TYPE_INT       = 3;
    public static final int TYPE_FLOAT     = 4;
    public static final int TYPE_DOUBLE    = 5;
    public static final int TYPE_UNDEFINED = 32;

    protected int dataType;
    protected int banks;
    protected int size;
    protected int offset;
    protected int[] offsets;

    protected DataBuffer(int dataType, int size) {
        this(dataType, size, 1, 0);
    }

    protected DataBuffer(int dataType, int size, int numBanks) {
        this(dataType, size, numBanks, 0);
    }

    protected DataBuffer(int dataType, int size, int numBanks, int offset) {
        this.dataType = dataType;
        this.banks = numBanks;
        this.size = size;
        this.offset = offset;
        this.offsets = new int[numBanks];
        for (int i = 0; i < numBanks; i++) this.offsets[i] = offset;
    }

    protected DataBuffer(int dataType, int size, int numBanks, int[] offsets) {
        this.dataType = dataType;
        this.banks = numBanks;
        this.size = size;
        this.offset = offsets[0];
        this.offsets = offsets.clone();
    }

    public int getDataType() { return dataType; }
    public int getSize() { return size; }
    public int getOffset() { return offset; }
    public int[] getOffsets() { return offsets.clone(); }
    public int getNumBanks() { return banks; }

    public int getElem(int i) { return getElem(0, i); }
    public abstract int getElem(int bank, int i);

    public void setElem(int i, int val) { setElem(0, i, val); }
    public abstract void setElem(int bank, int i, int val);

    public float getElemFloat(int i) { return getElem(i); }
    public float getElemFloat(int bank, int i) { return getElem(bank, i); }
    public void setElemFloat(int i, float val) { setElem(i, (int) val); }
    public void setElemFloat(int bank, int i, float val) { setElem(bank, i, (int) val); }

    public double getElemDouble(int i) { return getElem(i); }
    public double getElemDouble(int bank, int i) { return getElem(bank, i); }
    public void setElemDouble(int i, double val) { setElem(i, (int) val); }
    public void setElemDouble(int bank, int i, double val) { setElem(bank, i, (int) val); }
}
