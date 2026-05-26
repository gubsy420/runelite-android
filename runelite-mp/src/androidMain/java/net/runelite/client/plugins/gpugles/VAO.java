package net.runelite.client.plugins.gpugles;

import static android.opengl.GLES20.GL_ARRAY_BUFFER;
import static android.opengl.GLES20.GL_FLOAT;
import static android.opengl.GLES20.GL_INT;
import static android.opengl.GLES20.GL_SHORT;
import static android.opengl.GLES20.GL_TRIANGLES;
import static android.opengl.GLES20.glBindBuffer;
import static android.opengl.GLES20.glDrawArrays;
import static android.opengl.GLES20.glEnableVertexAttribArray;
import static android.opengl.GLES20.glUniform4i;
import static android.opengl.GLES20.glVertexAttribPointer;
import static android.opengl.GLES30.GL_DYNAMIC_DRAW;
import static android.opengl.GLES30.glBindVertexArray;
import static android.opengl.GLES30.glDeleteVertexArrays;
import static android.opengl.GLES30.glGenVertexArrays;
import static android.opengl.GLES30.glVertexAttribIPointer;
import static net.runelite.client.plugins.gpugles.GpuGlesPlugin.uniEntityTint;
import static net.runelite.client.plugins.gpugles.GpuGlesPlugin.updateEntityProjection;

import java.util.Arrays;

import net.runelite.api.Projection;
import net.runelite.api.Scene;

/**
 * Per-temporary-mesh VAO + VBO. The desktop plugin keeps a pool of dynamic VAOs
 * around for transient geometry (dynamic objects, NPCs, temp models) — each one
 * collects a batch of vertices and tracks 1..N draw ranges with their projection
 * + scene context. On commit, {@link #draw()} replays the batch.
 *
 * Ported from net.runelite.client.plugins.gpu.VAO. Minimal differences from
 * desktop: glGen/Delete VAO use array-form GLES bindings.
 */
class VAO
{
	// Temporary vertex format
	//  index 0: vec3(x, y, z)         (floats, 12 bytes)
	//  index 1: int abhsl             (4 bytes)
	//  index 2: short vec4(id, u, v, 0) (8 bytes)
	static final int VERT_SIZE = 24;

	final VBO vbo;
	int vao;

	VAO(int size)
	{
		vbo = new VBO(size);
	}

	void init()
	{
		int[] arr = new int[1];
		glGenVertexArrays(1, arr, 0);
		vao = arr[0];
		glBindVertexArray(vao);

		vbo.init(GL_DYNAMIC_DRAW);
		glBindBuffer(GL_ARRAY_BUFFER, vbo.bufId);

		glEnableVertexAttribArray(0);
		glVertexAttribPointer(0, 3, GL_FLOAT, false, VERT_SIZE, 0);

		glEnableVertexAttribArray(1);
		glVertexAttribIPointer(1, 1, GL_INT, VERT_SIZE, 12);

		glEnableVertexAttribArray(2);
		glVertexAttribIPointer(2, 4, GL_SHORT, VERT_SIZE, 16);

		glBindBuffer(GL_ARRAY_BUFFER, 0);
		glBindVertexArray(0);
	}

	void destroy()
	{
		vbo.destroy();
		glDeleteVertexArrays(1, new int[]{ vao }, 0);
		vao = 0;
	}

	int[] lengths = new int[4];
	Projection[] projs = new Projection[4];
	Scene[] scenes = new Scene[4];
	int off = 0;

	void addRange(Projection projection, Scene scene)
	{
		assert vbo.mapped;

		if (off > 0 && lengths[off - 1] == vbo.vb.position())
		{
			return;
		}

		if (lengths.length == off)
		{
			int l = lengths.length << 1;
			lengths = Arrays.copyOf(lengths, l);
			projs = Arrays.copyOf(projs, l);
			scenes = Arrays.copyOf(scenes, l);
		}

		lengths[off] = vbo.vb.position();
		projs[off] = projection;
		scenes[off] = scene;
		off++;
	}

	void draw()
	{
		assert !vbo.mapped;

		int start = 0;
		for (int i = 0; i < off; ++i)
		{
			int end = lengths[i];
			Projection p = projs[i];
			Scene scene = scenes[i];

			int count = end - start;

			updateEntityProjection(p);
			glUniform4i(uniEntityTint, scene.getOverrideHue(), scene.getOverrideSaturation(),
				scene.getOverrideLuminance(), scene.getOverrideAmount());
			glBindVertexArray(vao);
			glDrawArrays(GL_TRIANGLES, start / (VERT_SIZE / 4), count / (VERT_SIZE / 4));

			start = end;
		}
	}

	void reset()
	{
		Arrays.fill(projs, 0, off, null);
		Arrays.fill(scenes, 0, off, null);
		off = 0;
	}
}
