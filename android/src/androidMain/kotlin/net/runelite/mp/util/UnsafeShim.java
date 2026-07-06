package net.runelite.mp.util;

import android.os.Build;
import org.lsposed.hiddenapibypass.HiddenApiBypass;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Userland off-heap memory emulator plus shim for {@code sun.misc.Unsafe}.
 *
 * <p>Android exposes {@code Unsafe} but {@code allocateMemory} / {@code copyMemory(long,long,long)}
 * / the primitive-array copy variants are hidden-API on API 30+, and the standard
 * VMRuntime.setHiddenApiExemptions trick is itself hidden on API 33+. To dodge the gate
 * entirely we never touch real off-heap memory — every off-heap "address" the patched
 * client thinks it has is a synthetic key into the {@link #ALLOCS} map.
 *
 * <h2>Synthetic address layout</h2>
 * <pre>
 *   bits 63..32  : allocation id (1-indexed; 0 means "null pointer")
 *   bits 31..0   : byte offset within the allocation
 * </pre>
 * So {@code allocateMemory(1024)} returns {@code (id << 32) | 0}; a subsequent
 * {@code address + 16} read finds the same id in the high bits and offset 16 in the low.
 *
 * <p>{@code desugarLambdas} rewrites every off-heap {@code INVOKEVIRTUAL} on
 * {@code sun.misc.Unsafe} into an {@code INVOKESTATIC} call on this class with the same
 * descriptor (the Unsafe receiver is popped first).
 */
public final class UnsafeShim {
    private UnsafeShim() {}

    // ---- Constants ---------------------------------------------------------------------
    public static final int ADDRESS_SIZE;
    public static final int INVALID_FIELD_OFFSET = -1;

    public static final int ARRAY_BOOLEAN_BASE_OFFSET;
    public static final int ARRAY_BYTE_BASE_OFFSET;
    public static final int ARRAY_SHORT_BASE_OFFSET;
    public static final int ARRAY_CHAR_BASE_OFFSET;
    public static final int ARRAY_INT_BASE_OFFSET;
    public static final int ARRAY_LONG_BASE_OFFSET;
    public static final int ARRAY_FLOAT_BASE_OFFSET;
    public static final int ARRAY_DOUBLE_BASE_OFFSET;
    public static final int ARRAY_OBJECT_BASE_OFFSET;

    public static final int ARRAY_BOOLEAN_INDEX_SCALE;
    public static final int ARRAY_BYTE_INDEX_SCALE;
    public static final int ARRAY_SHORT_INDEX_SCALE;
    public static final int ARRAY_CHAR_INDEX_SCALE;
    public static final int ARRAY_INT_INDEX_SCALE;
    public static final int ARRAY_LONG_INDEX_SCALE;
    public static final int ARRAY_FLOAT_INDEX_SCALE;
    public static final int ARRAY_DOUBLE_INDEX_SCALE;
    public static final int ARRAY_OBJECT_INDEX_SCALE;

    // ---- Off-heap allocation table -----------------------------------------------------
    private static final ConcurrentHashMap<Integer, ByteBuffer> ALLOCS = new ConcurrentHashMap<>();
    private static final AtomicInteger NEXT_ALLOC_ID = new AtomicInteger(1);

    private static int allocId(long address)   { return (int) (address >>> 32); }
    private static int allocOffset(long address) { return (int) (address & 0xFFFFFFFFL); }
    private static long makeAddress(int id, int offset) { return ((long) id << 32) | (offset & 0xFFFFFFFFL); }

    /** Returns the buffer the address points into, or null if it's an unknown / null address. */
    private static ByteBuffer bufferAt(long address) {
        int id = allocId(address);
        if (id == 0) return null;
        return ALLOCS.get(id);
    }

    // ---- Allocator ---------------------------------------------------------------------
    public static long allocateMemory(long bytes) {
        if (bytes <= 0) return 0L;
        int id = NEXT_ALLOC_ID.getAndIncrement();
        ByteBuffer buf = ByteBuffer.allocate((int) bytes).order(ByteOrder.nativeOrder());
        ALLOCS.put(id, buf);
        return makeAddress(id, 0);
    }

    public static long reallocateMemory(long address, long newBytes) {
        if (address == 0L) return allocateMemory(newBytes);
        int id = allocId(address);
        ByteBuffer oldBuf = ALLOCS.get(id);
        if (oldBuf == null) return allocateMemory(newBytes);
        int copy = Math.min(oldBuf.capacity(), (int) newBytes);
        ByteBuffer newBuf = ByteBuffer.allocate((int) newBytes).order(ByteOrder.nativeOrder());
        for (int i = 0; i < copy; i++) newBuf.put(i, oldBuf.get(i));
        ALLOCS.put(id, newBuf);
        return makeAddress(id, 0);
    }

    public static void freeMemory(long address) {
        int id = allocId(address);
        if (id != 0) ALLOCS.remove(id);
    }

    public static void setMemory(long address, long bytes, byte value) {
        ByteBuffer buf = bufferAt(address);
        if (buf == null) return;
        int start = allocOffset(address);
        int end = Math.min(start + (int) bytes, buf.capacity());
        for (int i = start; i < end; i++) buf.put(i, value);
    }

    public static void setMemory(Object base, long offset, long bytes, byte value) {
        if (base == null) { setMemory(offset, bytes, value); return; }
        // Heap target — only byte[] is common.
        if (base instanceof byte[]) {
            byte[] arr = (byte[]) base;
            int start = (int) (offset - ARRAY_BYTE_BASE_OFFSET);
            int end = Math.min(start + (int) bytes, arr.length);
            java.util.Arrays.fill(arr, start, Math.max(start, end), value);
        }
    }

    // ---- Primitive readers / writers ---------------------------------------------------
    // The patched client passes long addresses; we look up the buffer and read/write at
    // the encoded offset. Endianness matches the native order so reinterpretation matches
    // what the real Unsafe would do.

    public static byte getByte(long address) {
        ByteBuffer buf = bufferAt(address); if (buf == null) return 0;
        return buf.get(allocOffset(address));
    }
    public static void putByte(long address, byte value) {
        ByteBuffer buf = bufferAt(address); if (buf == null) return;
        buf.put(allocOffset(address), value);
    }

    public static short getShort(long address) {
        ByteBuffer buf = bufferAt(address); if (buf == null) return 0;
        return buf.getShort(allocOffset(address));
    }
    public static void putShort(long address, short value) {
        ByteBuffer buf = bufferAt(address); if (buf == null) return;
        buf.putShort(allocOffset(address), value);
    }

    public static char getChar(long address) {
        ByteBuffer buf = bufferAt(address); if (buf == null) return 0;
        return buf.getChar(allocOffset(address));
    }
    public static void putChar(long address, char value) {
        ByteBuffer buf = bufferAt(address); if (buf == null) return;
        buf.putChar(allocOffset(address), value);
    }

    public static int getInt(long address) {
        ByteBuffer buf = bufferAt(address); if (buf == null) return 0;
        return buf.getInt(allocOffset(address));
    }
    public static void putInt(long address, int value) {
        ByteBuffer buf = bufferAt(address); if (buf == null) return;
        buf.putInt(allocOffset(address), value);
    }

    public static long getLong(long address) {
        ByteBuffer buf = bufferAt(address); if (buf == null) return 0L;
        return buf.getLong(allocOffset(address));
    }
    public static void putLong(long address, long value) {
        ByteBuffer buf = bufferAt(address); if (buf == null) return;
        buf.putLong(allocOffset(address), value);
    }

    public static float getFloat(long address) {
        ByteBuffer buf = bufferAt(address); if (buf == null) return 0f;
        return buf.getFloat(allocOffset(address));
    }
    public static void putFloat(long address, float value) {
        ByteBuffer buf = bufferAt(address); if (buf == null) return;
        buf.putFloat(allocOffset(address), value);
    }

    public static double getDouble(long address) {
        ByteBuffer buf = bufferAt(address); if (buf == null) return 0.0;
        return buf.getDouble(allocOffset(address));
    }
    public static void putDouble(long address, double value) {
        ByteBuffer buf = bufferAt(address); if (buf == null) return;
        buf.putDouble(allocOffset(address), value);
    }

    // ---- copyMemory variants -----------------------------------------------------------

    /** {@code Unsafe.copyMemory(Object src, long srcOff, Object dst, long dstOff, long bytes)}. */
    public static void copyMemory(Object src, long srcOffset, Object dst, long dstOffset, long bytes) {
        if (bytes <= 0) return;
        if (src != null && dst != null) {
            heapCopy(src, srcOffset, dst, dstOffset, bytes);
            return;
        }
        if (src == null && dst == null) {
            // off-heap → off-heap, both ours
            ByteBuffer s = bufferAt(srcOffset);
            ByteBuffer d = bufferAt(dstOffset);
            if (s == null || d == null) return;
            int sOff = allocOffset(srcOffset);
            int dOff = allocOffset(dstOffset);
            int n = clampBytes(bytes, s, sOff, d, dOff);
            for (int i = 0; i < n; i++) d.put(dOff + i, s.get(sOff + i));
            return;
        }
        if (src == null) {
            // off-heap (ours) → heap array
            ByteBuffer s = bufferAt(srcOffset);
            if (s == null) { zeroFill(dst, dstOffset, bytes); return; }
            offHeapToHeap(s, allocOffset(srcOffset), dst, dstOffset, bytes);
            return;
        }
        // src != null, dst == null: heap → off-heap (ours)
        ByteBuffer d = bufferAt(dstOffset);
        if (d == null) return;
        heapToOffHeap(src, srcOffset, d, allocOffset(dstOffset), bytes);
    }

    /** {@code Unsafe.copyMemory(long srcAddr, long dstAddr, long bytes)}. */
    public static void copyMemory(long srcAddress, long dstAddress, long bytes) {
        copyMemory(null, srcAddress, null, dstAddress, bytes);
    }

    private static int clampBytes(long bytes, ByteBuffer s, int sOff, ByteBuffer d, int dOff) {
        int n = (int) Math.min(bytes, Integer.MAX_VALUE);
        n = Math.min(n, s.capacity() - sOff);
        n = Math.min(n, d.capacity() - dOff);
        return Math.max(n, 0);
    }

    private static void offHeapToHeap(ByteBuffer src, int srcOff, Object dst, long dstOffset, long bytes) {
        int n = Math.min((int) bytes, src.capacity() - srcOff);
        if (n <= 0) return;
        if (dst instanceof byte[]) {
            byte[] arr = (byte[]) dst;
            int dOff = (int) (dstOffset - ARRAY_BYTE_BASE_OFFSET);
            n = Math.min(n, arr.length - dOff);
            for (int i = 0; i < n; i++) arr[dOff + i] = src.get(srcOff + i);
            return;
        }
        if (dst instanceof int[]) {
            int[] arr = (int[]) dst;
            int dOff = (int) ((dstOffset - ARRAY_INT_BASE_OFFSET) / ARRAY_INT_INDEX_SCALE);
            int words = Math.min(n / 4, arr.length - dOff);
            for (int i = 0; i < words; i++) arr[dOff + i] = src.getInt(srcOff + i * 4);
            return;
        }
        if (dst instanceof short[]) {
            short[] arr = (short[]) dst;
            int dOff = (int) ((dstOffset - ARRAY_SHORT_BASE_OFFSET) / ARRAY_SHORT_INDEX_SCALE);
            int words = Math.min(n / 2, arr.length - dOff);
            for (int i = 0; i < words; i++) arr[dOff + i] = src.getShort(srcOff + i * 2);
        }
    }

    private static void heapToOffHeap(Object src, long srcOffset, ByteBuffer dst, int dstOff, long bytes) {
        int n = Math.min((int) bytes, dst.capacity() - dstOff);
        if (n <= 0) return;
        if (src instanceof byte[]) {
            byte[] arr = (byte[]) src;
            int sOff = (int) (srcOffset - ARRAY_BYTE_BASE_OFFSET);
            n = Math.min(n, arr.length - sOff);
            for (int i = 0; i < n; i++) dst.put(dstOff + i, arr[sOff + i]);
            return;
        }
        if (src instanceof int[]) {
            int[] arr = (int[]) src;
            int sOff = (int) ((srcOffset - ARRAY_INT_BASE_OFFSET) / ARRAY_INT_INDEX_SCALE);
            int words = Math.min(n / 4, arr.length - sOff);
            for (int i = 0; i < words; i++) dst.putInt(dstOff + i * 4, arr[sOff + i]);
            return;
        }
        if (src instanceof short[]) {
            short[] arr = (short[]) src;
            int sOff = (int) ((srcOffset - ARRAY_SHORT_BASE_OFFSET) / ARRAY_SHORT_INDEX_SCALE);
            int words = Math.min(n / 2, arr.length - sOff);
            for (int i = 0; i < words; i++) dst.putShort(dstOff + i * 2, arr[sOff + i]);
        }
    }

    private static void heapCopy(Object src, long srcOffset, Object dst, long dstOffset, long bytes) {
        if (src instanceof byte[] && dst instanceof byte[]) {
            System.arraycopy(src, (int) (srcOffset - ARRAY_BYTE_BASE_OFFSET),
                dst, (int) (dstOffset - ARRAY_BYTE_BASE_OFFSET), (int) bytes);
            return;
        }
        if (src instanceof int[] && dst instanceof int[]) {
            int srcIdx = (int) ((srcOffset - ARRAY_INT_BASE_OFFSET) / ARRAY_INT_INDEX_SCALE);
            int dstIdx = (int) ((dstOffset - ARRAY_INT_BASE_OFFSET) / ARRAY_INT_INDEX_SCALE);
            System.arraycopy(src, srcIdx, dst, dstIdx, (int) (bytes / ARRAY_INT_INDEX_SCALE));
            return;
        }
        if (src instanceof long[] && dst instanceof long[]) {
            int srcIdx = (int) ((srcOffset - ARRAY_LONG_BASE_OFFSET) / ARRAY_LONG_INDEX_SCALE);
            int dstIdx = (int) ((dstOffset - ARRAY_LONG_BASE_OFFSET) / ARRAY_LONG_INDEX_SCALE);
            System.arraycopy(src, srcIdx, dst, dstIdx, (int) (bytes / ARRAY_LONG_INDEX_SCALE));
            return;
        }
        if (src instanceof short[] && dst instanceof short[]) {
            int srcIdx = (int) ((srcOffset - ARRAY_SHORT_BASE_OFFSET) / ARRAY_SHORT_INDEX_SCALE);
            int dstIdx = (int) ((dstOffset - ARRAY_SHORT_BASE_OFFSET) / ARRAY_SHORT_INDEX_SCALE);
            System.arraycopy(src, srcIdx, dst, dstIdx, (int) (bytes / ARRAY_SHORT_INDEX_SCALE));
            return;
        }
        if (src instanceof char[] && dst instanceof char[]) {
            int srcIdx = (int) ((srcOffset - ARRAY_CHAR_BASE_OFFSET) / ARRAY_CHAR_INDEX_SCALE);
            int dstIdx = (int) ((dstOffset - ARRAY_CHAR_BASE_OFFSET) / ARRAY_CHAR_INDEX_SCALE);
            System.arraycopy(src, srcIdx, dst, dstIdx, (int) (bytes / ARRAY_CHAR_INDEX_SCALE));
        }
    }

    private static void zeroFill(Object dst, long dstOffset, long bytes) {
        if (dst instanceof byte[]) {
            byte[] arr = (byte[]) dst;
            int start = (int) (dstOffset - ARRAY_BYTE_BASE_OFFSET);
            int len = (int) bytes;
            java.util.Arrays.fill(arr, start, Math.min(start + len, arr.length), (byte) 0);
        }
    }

    // ---- Static init -------------------------------------------------------------------
    static {
        // Lift Android's SDK-28+ hidden-API gate so reflection on Unsafe.* succeeds.
        try {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
                HiddenApiBypass.addHiddenApiExemptions("L");
            }
        } catch (Throwable t) {
            android.util.Log.w("UnsafeShim", "HiddenApiBypass failed: " + t);
        }

        try {
            Class<?> unsafeCls = Class.forName("sun.misc.Unsafe");
            Object u = obtain(unsafeCls);

            Method addressSize = unsafeCls.getDeclaredMethod("addressSize");
            Method arrayBaseOffset = unsafeCls.getDeclaredMethod("arrayBaseOffset", Class.class);
            Method arrayIndexScale = unsafeCls.getDeclaredMethod("arrayIndexScale", Class.class);

            ADDRESS_SIZE = ((Integer) addressSize.invoke(u)).intValue();

            ARRAY_BOOLEAN_BASE_OFFSET = ((Integer) arrayBaseOffset.invoke(u, boolean[].class)).intValue();
            ARRAY_BYTE_BASE_OFFSET    = ((Integer) arrayBaseOffset.invoke(u, byte[].class)).intValue();
            ARRAY_SHORT_BASE_OFFSET   = ((Integer) arrayBaseOffset.invoke(u, short[].class)).intValue();
            ARRAY_CHAR_BASE_OFFSET    = ((Integer) arrayBaseOffset.invoke(u, char[].class)).intValue();
            ARRAY_INT_BASE_OFFSET     = ((Integer) arrayBaseOffset.invoke(u, int[].class)).intValue();
            ARRAY_LONG_BASE_OFFSET    = ((Integer) arrayBaseOffset.invoke(u, long[].class)).intValue();
            ARRAY_FLOAT_BASE_OFFSET   = ((Integer) arrayBaseOffset.invoke(u, float[].class)).intValue();
            ARRAY_DOUBLE_BASE_OFFSET  = ((Integer) arrayBaseOffset.invoke(u, double[].class)).intValue();
            ARRAY_OBJECT_BASE_OFFSET  = ((Integer) arrayBaseOffset.invoke(u, Object[].class)).intValue();

            ARRAY_BOOLEAN_INDEX_SCALE = ((Integer) arrayIndexScale.invoke(u, boolean[].class)).intValue();
            ARRAY_BYTE_INDEX_SCALE    = ((Integer) arrayIndexScale.invoke(u, byte[].class)).intValue();
            ARRAY_SHORT_INDEX_SCALE   = ((Integer) arrayIndexScale.invoke(u, short[].class)).intValue();
            ARRAY_CHAR_INDEX_SCALE    = ((Integer) arrayIndexScale.invoke(u, char[].class)).intValue();
            ARRAY_INT_INDEX_SCALE     = ((Integer) arrayIndexScale.invoke(u, int[].class)).intValue();
            ARRAY_LONG_INDEX_SCALE    = ((Integer) arrayIndexScale.invoke(u, long[].class)).intValue();
            ARRAY_FLOAT_INDEX_SCALE   = ((Integer) arrayIndexScale.invoke(u, float[].class)).intValue();
            ARRAY_DOUBLE_INDEX_SCALE  = ((Integer) arrayIndexScale.invoke(u, double[].class)).intValue();
            ARRAY_OBJECT_INDEX_SCALE  = ((Integer) arrayIndexScale.invoke(u, Object[].class)).intValue();
        } catch (Throwable t) {
            throw new ExceptionInInitializerError(t);
        }
    }

    private static Object obtain(Class<?> unsafeCls) throws Exception {
        for (String field : new String[]{"theUnsafe", "THE_ONE", "INSTANCE"}) {
            try {
                Field f = unsafeCls.getDeclaredField(field);
                f.setAccessible(true);
                Object v = f.get(null);
                if (v != null) return v;
            } catch (NoSuchFieldException ignored) {
            }
        }
        for (String mName : new String[]{"getUnsafe", "getInstance"}) {
            try {
                Method m = unsafeCls.getDeclaredMethod(mName);
                m.setAccessible(true);
                Object v = m.invoke(null);
                if (v != null) return v;
            } catch (NoSuchMethodException ignored) {
            }
        }
        throw new IllegalStateException("Could not obtain a sun.misc.Unsafe instance via any known accessor");
    }
}
