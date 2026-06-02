package net.runelite.mp.util;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Side-table backing the {@code org.lwjgl.system.MemoryUtil.nmemAllocChecked} +
 * {@code memIntBuffer / memFloatBuffer} entry points on Android. LWJGL's native
 * memory APIs return raw pointers; we don't have those (Android restricts off-heap
 * allocation), so we hand back monotonic pseudo-handles and look up the backing
 * direct ByteBuffer here.
 */
public final class NMemTable
{
	private NMemTable() {}

	private static final ConcurrentHashMap<Long, ByteBuffer> TABLE = new ConcurrentHashMap<>();
	private static final AtomicLong NEXT = new AtomicLong(1L);

	public static long alloc(int bytes)
	{
		ByteBuffer buf = ByteBuffer.allocateDirect(bytes).order(ByteOrder.nativeOrder());
		long handle = NEXT.getAndIncrement();
		TABLE.put(handle, buf);
		return handle;
	}

	public static void free(long handle)
	{
		TABLE.remove(handle);  // GC reclaims the buffer
	}

	public static IntBuffer intView(long handle, int capacity)
	{
		ByteBuffer buf = TABLE.get(handle);
		if (buf == null) throw new IllegalStateException("nmem handle freed: " + handle);
		IntBuffer view = buf.asIntBuffer();
		view.limit(Math.min(view.capacity(), capacity));
		return view;
	}

	public static FloatBuffer floatView(long handle, int capacity)
	{
		ByteBuffer buf = TABLE.get(handle);
		if (buf == null) throw new IllegalStateException("nmem handle freed: " + handle);
		FloatBuffer view = buf.asFloatBuffer();
		view.limit(Math.min(view.capacity(), capacity));
		return view;
	}
}
