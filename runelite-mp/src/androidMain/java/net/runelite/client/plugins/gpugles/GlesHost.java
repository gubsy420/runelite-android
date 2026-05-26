package net.runelite.client.plugins.gpugles;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/**
 * Lifetime owner of the EGL14 display/context + the GLES surface tied to the
 * Compose-hosted {@link SurfaceView}. One static instance shared between the
 * Compose layer (which feeds us the SurfaceView via {@link #attachSurfaceView}) and
 * {@link GpuGlesPlugin} (which calls {@link #makeCurrent} + {@link #swapBuffers}
 * from the patched client's draw thread).
 *
 * The plugin's GL calls have to run on the same thread that holds the context, so
 * we don't spin up our own render thread — we make-current on whichever thread the
 * client calls into us on. SurfaceHolder callbacks fire on the main thread; EGL
 * surface (re)creation is deferred to the first {@link #makeCurrent} call from the
 * client thread so the context never gets bound on the wrong thread.
 */
public final class GlesHost
{
	private static final String TAG = "GlesHost";

	/** MSAA samples requested for the on-screen surface. Falls back to no MSAA if
	 *  the GPU/driver doesn't expose a matching config. */
	private static final int MSAA_SAMPLES = 4;

	private static final GlesHost INSTANCE = new GlesHost();
	public static GlesHost get() { return INSTANCE; }

	private final Object lock = new Object();

	private EGLDisplay display = EGL14.EGL_NO_DISPLAY;
	private EGLConfig config;
	private EGLContext context = EGL14.EGL_NO_CONTEXT;
	private EGLSurface eglSurface = EGL14.EGL_NO_SURFACE;
	private Surface androidSurface;
	private SurfaceView surfaceView;
	private int surfaceWidth;
	private int surfaceHeight;
	private volatile boolean surfaceDirty = false;

	private GlesHost() {}

	/** Compose hands the SurfaceView over once it's been created. Subsequent calls
	 *  with the same view are no-ops; passing a different view rebinds the holder
	 *  callbacks and discards the old EGL surface on next makeCurrent. */
	public void attachSurfaceView(SurfaceView view)
	{
		synchronized (lock)
		{
			if (this.surfaceView == view) return;
			this.surfaceView = view;
			androidSurface = null;
			surfaceDirty = true;
		}
		view.getHolder().addCallback(new SurfaceHolder.Callback()
		{
			@Override public void surfaceCreated(SurfaceHolder holder)
			{
				synchronized (lock)
				{
					androidSurface = holder.getSurface();
					surfaceDirty = true;
				}
				Log.i(TAG, "surfaceCreated");
			}

			@Override public void surfaceChanged(SurfaceHolder holder, int format, int width, int height)
			{
				synchronized (lock)
				{
					if (width != surfaceWidth || height != surfaceHeight)
					{
						surfaceWidth = width;
						surfaceHeight = height;
						surfaceDirty = true;
					}
					androidSurface = holder.getSurface();
				}
				Log.i(TAG, "surfaceChanged " + width + "x" + height + " fmt=" + format);
			}

			@Override public void surfaceDestroyed(SurfaceHolder holder)
			{
				synchronized (lock)
				{
					androidSurface = null;
					surfaceDirty = true;
				}
				Log.i(TAG, "surfaceDestroyed");
			}
		});
	}

	public int getWidth() { synchronized (lock) { return surfaceWidth; } }
	public int getHeight() { synchronized (lock) { return surfaceHeight; } }

	/** True once {@link #makeCurrent} has bound a context to the current thread.
	 *  Cheap to call from a render loop — only reads volatile state. */
	public boolean hasContext() { return context != EGL14.EGL_NO_CONTEXT && eglSurface != EGL14.EGL_NO_SURFACE; }

	/**
	 * Bind the EGL context + window surface to the calling thread. Creates the
	 * display/context on first call and the window surface lazily once the Android
	 * Surface is available. Returns true when the caller can issue GL.
	 *
	 * Called from the client/draw thread; the SurfaceView callbacks set
	 * {@code surfaceDirty} when the underlying Android Surface changes, and we
	 * tear down and recreate the EGL surface on the next makeCurrent so the
	 * driver picks up the new backing buffer.
	 */
	public boolean makeCurrent()
	{
		synchronized (lock)
		{
			if (display == EGL14.EGL_NO_DISPLAY && !initDisplayLocked()) return false;
			if (context == EGL14.EGL_NO_CONTEXT && !initContextLocked()) return false;
			if (androidSurface == null) return false;
			if (surfaceDirty)
			{
				destroyEglSurfaceLocked();
				surfaceDirty = false;
			}
			if (eglSurface == EGL14.EGL_NO_SURFACE && !initSurfaceLocked()) return false;
			if (!EGL14.eglMakeCurrent(display, eglSurface, eglSurface, context))
			{
				Log.e(TAG, "eglMakeCurrent failed: 0x" + Integer.toHexString(EGL14.eglGetError()));
				return false;
			}
			return true;
		}
	}

	/** Present the current frame. Must be called after the caller has finished
	 *  GLES draws on the current thread. */
	public boolean swapBuffers()
	{
		if (eglSurface == EGL14.EGL_NO_SURFACE) return false;
		return EGL14.eglSwapBuffers(display, eglSurface);
	}

	private boolean initDisplayLocked()
	{
		display = EGL14.eglGetDisplay(EGL14.EGL_DEFAULT_DISPLAY);
		if (display == EGL14.EGL_NO_DISPLAY)
		{
			Log.e(TAG, "eglGetDisplay failed");
			return false;
		}
		int[] version = new int[2];
		if (!EGL14.eglInitialize(display, version, 0, version, 1))
		{
			Log.e(TAG, "eglInitialize failed: 0x" + Integer.toHexString(EGL14.eglGetError()));
			display = EGL14.EGL_NO_DISPLAY;
			return false;
		}
		Log.i(TAG, "EGL " + version[0] + "." + version[1] + " initialized");
		return true;
	}

	private boolean initContextLocked()
	{
		EGLConfig chosen = chooseConfig(true);
		if (chosen == null)
		{
			Log.w(TAG, "MSAA config unavailable, falling back to single-sample");
			chosen = chooseConfig(false);
		}
		if (chosen == null)
		{
			Log.e(TAG, "no suitable EGL config");
			return false;
		}
		config = chosen;

		int[] ctxAttrs = { EGL14.EGL_CONTEXT_CLIENT_VERSION, 3, EGL14.EGL_NONE };
		context = EGL14.eglCreateContext(display, config, EGL14.EGL_NO_CONTEXT, ctxAttrs, 0);
		if (context == EGL14.EGL_NO_CONTEXT)
		{
			Log.e(TAG, "eglCreateContext failed: 0x" + Integer.toHexString(EGL14.eglGetError()));
			return false;
		}
		return true;
	}

	private EGLConfig chooseConfig(boolean wantMsaa)
	{
		int[] attrs;
		if (wantMsaa)
		{
			attrs = new int[] {
				EGL14.EGL_RED_SIZE, 8,
				EGL14.EGL_GREEN_SIZE, 8,
				EGL14.EGL_BLUE_SIZE, 8,
				EGL14.EGL_ALPHA_SIZE, 8,
				EGL14.EGL_DEPTH_SIZE, 24,
				EGL14.EGL_STENCIL_SIZE, 0,
				EGL14.EGL_SAMPLE_BUFFERS, 1,
				EGL14.EGL_SAMPLES, MSAA_SAMPLES,
				EGL14.EGL_RENDERABLE_TYPE, EGLExt.EGL_OPENGL_ES3_BIT_KHR,
				EGL14.EGL_SURFACE_TYPE, EGL14.EGL_WINDOW_BIT,
				EGL14.EGL_NONE
			};
		}
		else
		{
			attrs = new int[] {
				EGL14.EGL_RED_SIZE, 8,
				EGL14.EGL_GREEN_SIZE, 8,
				EGL14.EGL_BLUE_SIZE, 8,
				EGL14.EGL_ALPHA_SIZE, 8,
				EGL14.EGL_DEPTH_SIZE, 24,
				EGL14.EGL_STENCIL_SIZE, 0,
				EGL14.EGL_RENDERABLE_TYPE, EGLExt.EGL_OPENGL_ES3_BIT_KHR,
				EGL14.EGL_SURFACE_TYPE, EGL14.EGL_WINDOW_BIT,
				EGL14.EGL_NONE
			};
		}
		EGLConfig[] configs = new EGLConfig[1];
		int[] numConfigs = new int[1];
		if (!EGL14.eglChooseConfig(display, attrs, 0, configs, 0, configs.length, numConfigs, 0))
			return null;
		if (numConfigs[0] == 0) return null;
		return configs[0];
	}

	private boolean initSurfaceLocked()
	{
		int[] attrs = { EGL14.EGL_NONE };
		eglSurface = EGL14.eglCreateWindowSurface(display, config, androidSurface, attrs, 0);
		if (eglSurface == EGL14.EGL_NO_SURFACE)
		{
			Log.e(TAG, "eglCreateWindowSurface failed: 0x" + Integer.toHexString(EGL14.eglGetError()));
			return false;
		}
		return true;
	}

	private void destroyEglSurfaceLocked()
	{
		if (eglSurface != EGL14.EGL_NO_SURFACE)
		{
			// eglDestroySurface lazily defers actual deletion until the surface
			// is no longer current on any thread, so we don't need to release first.
			EGL14.eglDestroySurface(display, eglSurface);
			eglSurface = EGL14.EGL_NO_SURFACE;
		}
	}
}
