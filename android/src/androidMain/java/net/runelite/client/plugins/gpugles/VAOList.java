package net.runelite.client.plugins.gpugles;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import net.runelite.api.Scene;

/**
 * Pool of {@link VAO}s. Each render thread owns an opaque and an alpha pool; every
 * VAO holds 4 MB of vert data and a new one is allocated when the current one fills.
 *
 * Ported from net.runelite.client.plugins.gpu.VAOList (Lombok @Slf4j stripped).
 *
 * The {@code rt} flag marks a pool owned by a worker render thread. Allocating a VAO
 * issues GL calls, which are only legal on the thread holding the EGL context, so an
 * rt pool never allocates inline: it returns null (the caller drops that model for the
 * frame) and raises {@link #needAlloc}, and the next {@link #map()} — which runs on the
 * GL thread at preSceneDraw — grows the pool.
 */
class VAOList
{
	private static final String TAG = "VAOList";

	// Larger than the largest single model
	private static final int VAO_SIZE = 4 * 1024 * 1024;

	private final boolean rt;
	private boolean needAlloc;

	private int curIdx;
	final List<VAO> vaos = new ArrayList<>();

	VAOList(boolean rt)
	{
		this.rt = rt;
	}

	VAO get(int size)
	{
		assert size <= VAO_SIZE;

		while (curIdx < vaos.size())
		{
			VAO vao = vaos.get(curIdx);
			if (!vao.vbo.mapped)
			{
				if (rt)
				{
					needAlloc = true;
					return null;
				}
				vao.vbo.map();
			}

			int rem = vao.vbo.vb.remaining() * Integer.BYTES;
			if (size <= rem)
			{
				return vao;
			}

			curIdx++;
		}

		if (rt)
		{
			needAlloc = true;
			return null;
		}

		VAO vao = new VAO(VAO_SIZE);
		vao.init();
		vao.vbo.map();
		vaos.add(vao);
		Log.d(TAG, "Allocated VAO " + vao.vao + " request " + size);
		return vao;
	}

	/** Called on the GL thread at the top of a toplevel frame. */
	void map()
	{
		for (int i = 0; i < vaos.size(); ++i) // NOPMD: ForLoopCanBeForeach
		{
			VAO vao = vaos.get(i);
			if (!vao.vbo.mapped)
			{
				vao.vbo.map();
			}
		}
		if (needAlloc)
		{
			VAO vao = new VAO(VAO_SIZE);
			vao.init();
			vao.vbo.map();
			vaos.add(vao);
			Log.d(TAG, "Allocated VAO " + vao.vao);
			needAlloc = false;
		}
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

	void draw()
	{
		int sz = unmap();
		for (int i = 0; i < sz; ++i)
		{
			VAO vao = vaos.get(i);
			vao.draw();
			vao.reset();
		}
	}

	void free()
	{
		for (VAO vao : vaos)
		{
			vao.destroy();
		}
		vaos.clear();
		curIdx = 0;
		needAlloc = false;
	}

	void addRange(float[] projection, Scene scene, int renderMode)
	{
		for (int i = 0; i <= curIdx && i < vaos.size(); ++i)
		{
			VAO vao = vaos.get(i);
			if (vao.vbo.mapped)
			{
				vao.addRange(projection, scene, renderMode);
			}
		}
	}

	/** Total pool footprint in KiB, for the debug overlay. */
	int size()
	{
		int szKb = 0;
		for (int i = 0; i < vaos.size(); ++i) // NOPMD: ForLoopCanBeForeach
		{
			szKb += vaos.get(i).vbo.size >> 10;
		}
		return szKb;
	}
}
