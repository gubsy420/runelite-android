package net.runelite.client.plugins.gpugles;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import net.runelite.api.Projection;
import net.runelite.api.Scene;

/**
 * Pool of {@link VAO}s. The desktop plugin uses three of these (opaque,
 * alpha, post-opaque) to accumulate transient geometry across the frame. Each
 * VAO holds 4 MB of vert data; we allocate more when one fills up.
 *
 * Ported from net.runelite.client.plugins.gpu.VAOList (Lombok @Slf4j stripped).
 */
class VAOList
{
	private static final String TAG = "VAOList";

	// Larger than the largest single model
	private static final int VAO_SIZE = 4 * 1024 * 1024;

	private int curIdx;
	final List<VAO> vaos = new ArrayList<>();

	VAO get(int size)
	{
		assert size <= VAO_SIZE;

		while (curIdx < vaos.size())
		{
			VAO vao = vaos.get(curIdx);
			if (!vao.vbo.mapped)
			{
				vao.vbo.map();
			}

			int rem = vao.vbo.vb.remaining() * Integer.BYTES;
			if (size <= rem)
			{
				return vao;
			}

			curIdx++;
		}

		VAO vao = new VAO(VAO_SIZE);
		vao.init();
		vao.vbo.map();
		vaos.add(vao);
		Log.d(TAG, "Allocated VAO " + vao.vao + " request " + size);
		return vao;
	}

	int unmap()
	{
		int sz = 0;
		for (int i = 0; i < vaos.size(); ++i) // NOPMD: ForLoopCanBeForeach
		{
			VAO vao = vaos.get(i);
			if (vao.vbo.mapped)
			{
				++sz;
				vao.vbo.unmap();
			}
		}
		curIdx = 0;
		return sz;
	}

	void free()
	{
		for (VAO vao : vaos)
		{
			vao.destroy();
		}
		vaos.clear();
		curIdx = 0;
	}

	void addRange(Projection projection, Scene scene)
	{
		for (int i = 0; i <= curIdx && i < vaos.size(); ++i)
		{
			VAO vao = vaos.get(i);
			if (vao.vbo.mapped)
			{
				vao.addRange(projection, scene);
			}
		}
	}
}
