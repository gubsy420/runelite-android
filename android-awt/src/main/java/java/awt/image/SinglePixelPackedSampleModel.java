package java.awt.image;

public class SinglePixelPackedSampleModel extends SampleModel {
    private final int[] bitMasks;
    private final int[] bitOffsets;
    private final int[] bitSizes;
    private final int scanlineStride;

    public SinglePixelPackedSampleModel(int dataType, int w, int h, int[] bitMasks) {
        this(dataType, w, h, w, bitMasks);
    }

    public SinglePixelPackedSampleModel(int dataType, int w, int h, int scanlineStride, int[] bitMasks) {
        super(dataType, w, h, bitMasks.length);
        if (dataType != DataBuffer.TYPE_INT && dataType != DataBuffer.TYPE_USHORT && dataType != DataBuffer.TYPE_BYTE) {
            throw new IllegalArgumentException("Unsupported data type for SinglePixelPackedSampleModel: " + dataType);
        }
        this.scanlineStride = scanlineStride;
        this.bitMasks = bitMasks.clone();
        this.bitOffsets = new int[bitMasks.length];
        this.bitSizes = new int[bitMasks.length];
        for (int i = 0; i < bitMasks.length; i++) {
            int mask = bitMasks[i];
            int off = 0;
            while (mask != 0 && (mask & 1) == 0) { mask >>>= 1; off++; }
            int size = 0;
            while (mask != 0) { size++; mask >>>= 1; }
            bitOffsets[i] = off;
            bitSizes[i] = size;
        }
    }

    public int getScanlineStride() { return scanlineStride; }
    public int[] getBitMasks()     { return bitMasks.clone(); }
    public int[] getBitOffsets()   { return bitOffsets.clone(); }

    @Override
    public int getNumDataElements() {
        return 1;
    }

    @Override
    public int getSampleSize(int band) {
        return bitSizes[band];
    }

    @Override
    public int[] getSampleSize() {
        return bitSizes.clone();
    }

    @Override
    public int[] getSampleSize(int band, int[] iArray) {
        int[] out = (iArray == null) ? new int[1] : iArray;
        out[0] = bitSizes[band];
        return out;
    }

    @Override
    public int getSample(int x, int y, int b, DataBuffer data) {
        return (data.getElem(y * scanlineStride + x) & bitMasks[b]) >>> bitOffsets[b];
    }

    @Override
    public void setSample(int x, int y, int b, int s, DataBuffer data) {
        int idx = y * scanlineStride + x;
        int prev = data.getElem(idx);
        data.setElem(idx, (prev & ~bitMasks[b]) | ((s << bitOffsets[b]) & bitMasks[b]));
    }

    @Override
    public SampleModel createCompatibleSampleModel(int w, int h) {
        return new SinglePixelPackedSampleModel(dataType, w, h, bitMasks);
    }

    @Override
    public DataBuffer createDataBuffer() {
        switch (dataType) {
            case DataBuffer.TYPE_INT:
                return new DataBufferInt(scanlineStride * height);
            default:
                throw new IllegalStateException("Unsupported data type: " + dataType);
        }
    }
}
