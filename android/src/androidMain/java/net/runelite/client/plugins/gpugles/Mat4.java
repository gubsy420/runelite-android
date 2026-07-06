/*
 * Ported from net.runelite.client.plugins.gpu.Mat4 — pure math, no GL dependency,
 * so this is a verbatim copy under a new package.
 */
package net.runelite.client.plugins.gpugles;

public class Mat4
{
	private Mat4() {}

	public static float[] identity()
	{
		return new float[] {
			1, 0, 0, 0,
			0, 1, 0, 0,
			0, 0, 1, 0,
			0, 0, 0, 1,
		};
	}

	public static float[] scale(float sx, float sy, float sz)
	{
		return new float[] {
			sx, 0, 0, 0,
			0, sy, 0, 0,
			0, 0, sz, 0,
			0, 0, 0, 1,
		};
	}

	public static float[] translate(float tx, float ty, float tz)
	{
		return new float[] {
			1, 0, 0, 0,
			0, 1, 0, 0,
			0, 0, 1, 0,
			tx, ty, tz, 1,
		};
	}

	public static float[] rotateX(float rx)
	{
		float s = (float) Math.sin(rx);
		float c = (float) Math.cos(rx);
		return new float[] {
			1, 0, 0, 0,
			0, c, s, 0,
			0, -s, c, 0,
			0, 0, 0, 1,
		};
	}

	public static float[] rotateY(float ry)
	{
		float s = (float) Math.sin(ry);
		float c = (float) Math.cos(ry);
		return new float[] {
			c, 0, -s, 0,
			0, 1, 0, 0,
			s, 0, c, 0,
			0, 0, 0, 1,
		};
	}

	/**
	 * Reverse-Z perspective. Desktop pairs this with {@code glClipControl(GL_LOWER_LEFT,
	 * GL_ZERO_TO_ONE)} so {@code z_ndc} sits in {@code [0, 1]} — the full window-depth
	 * range. GLES has no clip-control, so the original matrix's {@code z_clip = 2n,
	 * w_clip = z_view} layout produces {@code z_ndc = 2n/z ∈ [0, 1]} which then maps
	 * to window-depth {@code [0.5, 1.0]} via the default {@code (z_ndc + 1) / 2}
	 * transform — we'd lose half the depth precision. Coplanar tree-leaf cards
	 * collapse to the same window-z and fight regardless of which depth-func is used.
	 *
	 * Rebuilt to map {@code z_view = 2n} → {@code z_ndc = -1} and {@code z_view → ∞}
	 * → {@code z_ndc = 1}, using the full {@code [-1, 1]} NDC and therefore the full
	 * {@code [0, 1]} window-depth range. Caller must use {@code GL_LESS} (not
	 * {@code GL_GREATER}) and {@code glClearDepthf(1.0)} (not {@code 0.0}) to match
	 * this convention. The shader's {@code screenPos.z += bias} also needs to flip
	 * sign because we want bias to nudge toward the camera (small {@code z_ndc} in
	 * standard depth, was large {@code z_ndc} in reverse-Z).
	 *
	 * Derivation: {@code z_ndc = A + B/z_view}. Want z=2n → -1 and z=∞ → 1:
	 *   A = 1; A + B/(2n) = -1 → B = -4n.
	 *   So z_clip = z_view - 4n, w_clip = z_view, z_ndc = 1 - 4n/z_view.
	 */
	public static float[] projection(float w, float h, float n)
	{
		return new float[] {
			2 / w, 0, 0, 0,
			0, -2 / h, 0, 0,
			0, 0, 1, 1,          // a[10]=1: z_clip += z_view; a[11]=1: w_clip = z_view
			0, 0, -4 * n, 0      // a[14]=-4n: z_clip += -4n
		};
	}

	public static void mul(final float[] a, final float[] b)
	{
		final float b00 = b[0 + 0 * 4];
		final float b10 = b[1 + 0 * 4];
		final float b20 = b[2 + 0 * 4];
		final float b30 = b[3 + 0 * 4];
		final float b01 = b[0 + 1 * 4];
		final float b11 = b[1 + 1 * 4];
		final float b21 = b[2 + 1 * 4];
		final float b31 = b[3 + 1 * 4];
		final float b02 = b[0 + 2 * 4];
		final float b12 = b[1 + 2 * 4];
		final float b22 = b[2 + 2 * 4];
		final float b32 = b[3 + 2 * 4];
		final float b03 = b[0 + 3 * 4];
		final float b13 = b[1 + 3 * 4];
		final float b23 = b[2 + 3 * 4];
		final float b33 = b[3 + 3 * 4];

		float ai0 = a[0 * 4];
		float ai1 = a[1 * 4];
		float ai2 = a[2 * 4];
		float ai3 = a[3 * 4];
		a[0 * 4] = ai0 * b00 + ai1 * b10 + ai2 * b20 + ai3 * b30;
		a[1 * 4] = ai0 * b01 + ai1 * b11 + ai2 * b21 + ai3 * b31;
		a[2 * 4] = ai0 * b02 + ai1 * b12 + ai2 * b22 + ai3 * b32;
		a[3 * 4] = ai0 * b03 + ai1 * b13 + ai2 * b23 + ai3 * b33;

		ai0 = a[1 + 0 * 4];
		ai1 = a[1 + 1 * 4];
		ai2 = a[1 + 2 * 4];
		ai3 = a[1 + 3 * 4];
		a[1 + 0 * 4] = ai0 * b00 + ai1 * b10 + ai2 * b20 + ai3 * b30;
		a[1 + 1 * 4] = ai0 * b01 + ai1 * b11 + ai2 * b21 + ai3 * b31;
		a[1 + 2 * 4] = ai0 * b02 + ai1 * b12 + ai2 * b22 + ai3 * b32;
		a[1 + 3 * 4] = ai0 * b03 + ai1 * b13 + ai2 * b23 + ai3 * b33;

		ai0 = a[2 + 0 * 4];
		ai1 = a[2 + 1 * 4];
		ai2 = a[2 + 2 * 4];
		ai3 = a[2 + 3 * 4];
		a[2 + 0 * 4] = ai0 * b00 + ai1 * b10 + ai2 * b20 + ai3 * b30;
		a[2 + 1 * 4] = ai0 * b01 + ai1 * b11 + ai2 * b21 + ai3 * b31;
		a[2 + 2 * 4] = ai0 * b02 + ai1 * b12 + ai2 * b22 + ai3 * b32;
		a[2 + 3 * 4] = ai0 * b03 + ai1 * b13 + ai2 * b23 + ai3 * b33;

		ai0 = a[3 + 0 * 4];
		ai1 = a[3 + 1 * 4];
		ai2 = a[3 + 2 * 4];
		ai3 = a[3 + 3 * 4];
		a[3 + 0 * 4] = ai0 * b00 + ai1 * b10 + ai2 * b20 + ai3 * b30;
		a[3 + 1 * 4] = ai0 * b01 + ai1 * b11 + ai2 * b21 + ai3 * b31;
		a[3 + 2 * 4] = ai0 * b02 + ai1 * b12 + ai2 * b22 + ai3 * b32;
		a[3 + 3 * 4] = ai0 * b03 + ai1 * b13 + ai2 * b23 + ai3 * b33;
	}
}
