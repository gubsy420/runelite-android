package net.runelite.client.plugins.gpugles;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;

class GpuIntBuffer
{
	private final IntBuffer buffer;

	GpuIntBuffer(IntBuffer ib) { buffer = ib; }

	void put22224(int x, int y, int z, int w)
	{
		buffer.put(((y & 0xffff) << 16) | (x & 0xffff));
		buffer.put(z & 0xffff);
		buffer.put(w);
	}

	void put2222(int x, int y, int z, int w)
	{
		buffer.put(((y & 0xffff) << 16) | (x & 0xffff));
		buffer.put(((w & 0xffff) << 16) | (z & 0xffff));
	}

	void flip()                  { buffer.flip(); }
	void clear()                 { buffer.clear(); }
	IntBuffer getBuffer()        { return buffer; }

	static IntBuffer allocateDirect(int size)
	{
		return ByteBuffer.allocateDirect(size * Integer.BYTES)
			.order(ByteOrder.nativeOrder())
			.asIntBuffer();
	}
}
