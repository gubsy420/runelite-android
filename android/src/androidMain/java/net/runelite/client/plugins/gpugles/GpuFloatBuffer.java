package net.runelite.client.plugins.gpugles;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

class GpuFloatBuffer
{
	private final FloatBuffer buffer;

	GpuFloatBuffer(int size) { buffer = allocateDirect(size); }

	GpuFloatBuffer put(float f) { buffer.put(f); return this; }
	void flip()                  { buffer.flip(); }
	void clear()                 { buffer.clear(); }
	FloatBuffer getBuffer()      { return buffer; }

	static FloatBuffer allocateDirect(int size)
	{
		return ByteBuffer.allocateDirect(size * Float.BYTES)
			.order(ByteOrder.nativeOrder())
			.asFloatBuffer();
	}
}
