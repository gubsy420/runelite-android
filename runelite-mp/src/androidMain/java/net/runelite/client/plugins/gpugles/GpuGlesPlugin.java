package net.runelite.client.plugins.gpugles;

import static android.opengl.GLES20.GL_ARRAY_BUFFER;
import static android.opengl.GLES20.GL_BLEND;
import static android.opengl.GLES20.GL_CLAMP_TO_EDGE;
import static android.opengl.GLES20.GL_COLOR_BUFFER_BIT;
import static android.opengl.GLES20.GL_DEPTH_BUFFER_BIT;
import static android.opengl.GLES20.GL_DEPTH_TEST;
import static android.opengl.GLES20.GL_FLOAT;
import static android.opengl.GLES20.GL_FRAGMENT_SHADER;
import static android.opengl.GLES20.GL_LINEAR;
import static android.opengl.GLES20.GL_ONE;
import static android.opengl.GLES20.GL_ONE_MINUS_SRC_ALPHA;
import static android.opengl.GLES20.GL_RGBA;
import static android.opengl.GLES20.GL_STATIC_DRAW;
import static android.opengl.GLES20.GL_STREAM_DRAW;
import static android.opengl.GLES20.GL_TEXTURE0;
import static android.opengl.GLES20.GL_TEXTURE_2D;
import static android.opengl.GLES20.GL_TEXTURE_MAG_FILTER;
import static android.opengl.GLES20.GL_TEXTURE_MIN_FILTER;
import static android.opengl.GLES20.GL_TEXTURE_WRAP_S;
import static android.opengl.GLES20.GL_TEXTURE_WRAP_T;
import static android.opengl.GLES20.GL_TRIANGLE_FAN;
import static android.opengl.GLES20.GL_UNSIGNED_BYTE;
import static android.opengl.GLES20.GL_VERTEX_SHADER;
import static android.opengl.GLES20.glActiveTexture;
import static android.opengl.GLES20.glBindBuffer;
import static android.opengl.GLES20.glBindTexture;
import static android.opengl.GLES20.glBlendFunc;
import static android.opengl.GLES20.glBufferData;
import static android.opengl.GLES20.glClear;
import static android.opengl.GLES20.glClearColor;
import static android.opengl.GLES20.glDeleteProgram;
import static android.opengl.GLES20.glDeleteTextures;
import static android.opengl.GLES20.glDisable;
import static android.opengl.GLES20.glDrawArrays;
import static android.opengl.GLES20.glEnable;
import static android.opengl.GLES20.glEnableVertexAttribArray;
import static android.opengl.GLES20.glGenBuffers;
import static android.opengl.GLES20.glGenTextures;
import static android.opengl.GLES20.glGetString;
import static android.opengl.GLES20.glGetUniformLocation;
import static android.opengl.GLES20.glTexImage2D;
import static android.opengl.GLES20.glTexParameteri;
import static android.opengl.GLES20.glTexSubImage2D;
import static android.opengl.GLES20.glUniform1i;
import static android.opengl.GLES20.glUniform2i;
import static android.opengl.GLES20.glUniform4f;
import static android.opengl.GLES20.glUseProgram;
import static android.opengl.GLES20.glVertexAttribPointer;
import static android.opengl.GLES20.glViewport;
import static android.opengl.GLES30.GL_PIXEL_UNPACK_BUFFER;
import static android.opengl.GLES30.glBindVertexArray;
import static android.opengl.GLES30.glDeleteBuffers;
import static android.opengl.GLES30.glDeleteVertexArrays;
import static android.opengl.GLES30.glGenVertexArrays;

import static android.opengl.GLES20.GL_BLEND;
import static android.opengl.GLES20.GL_CULL_FACE;
import static android.opengl.GLES20.GL_ONE;
import static android.opengl.GLES20.GL_SRC_ALPHA;
import static android.opengl.GLES20.glBlendFuncSeparate;
import static android.opengl.GLES20.glClearDepthf;
import static android.opengl.GLES20.glDepthFunc;
import static android.opengl.GLES20.glGetUniformLocation;
import static android.opengl.GLES20.glUniform1f;
import static android.opengl.GLES20.glUniform1i;
import static android.opengl.GLES20.glUniform3i;
import static android.opengl.GLES20.glUniform4f;
import static android.opengl.GLES20.glUniform4i;
import static android.opengl.GLES20.glUniformMatrix4fv;
import static android.opengl.GLES20.GL_LESS;
import static android.opengl.GLES30.GL_UNIFORM_BUFFER;
import static android.opengl.GLES30.glBindBufferBase;
import static android.opengl.GLES30.glUniformBlockBinding;

import android.opengl.GLES20;
import android.opengl.GLES30;
import android.util.Log;
import com.google.inject.Provides;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.inject.Inject;
import net.runelite.api.BufferProvider;
import net.runelite.api.Client;
import net.runelite.api.Constants;
import net.runelite.api.FloatProjection;
import net.runelite.api.GameObject;
import net.runelite.api.GameState;
import net.runelite.api.Model;
import net.runelite.api.Perspective;
import net.runelite.api.Projection;
import net.runelite.api.Renderable;
import net.runelite.api.Scene;
import net.runelite.api.TextureProvider;
import net.runelite.api.TileObject;
import net.runelite.api.WorldView;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.hooks.DrawCallbacks;
import net.runelite.client.callback.ClientThread;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;

/**
 * Android GLES port of the desktop GPU plugin. Replaces JOGL/LWJGL with EGL14 +
 * GLES31 bindings, otherwise mirrors the desktop plugin's structure 1:1.
 *
 * Step status as of initial scaffold:
 *   - EGL host + SurfaceView wiring: done (see {@link GlesHost})
 *   - DrawCallbacks registration: done
 *   - UI overlay pass: done (BufferProvider → texture → UI shader → backbuffer)
 *   - 3D scene pass: STUBBED — scene draw/upload not yet wired; the canvas hole
 *     under the Compose chrome will show a black GLES surface with the 2D UI
 *     blitted on top until the scene pipeline lands.
 *
 * Threading model: the patched client calls {@link #draw} on its client thread.
 * We {@link GlesHost#makeCurrent} on that thread so the GL context follows it,
 * and {@link GlesHost#swapBuffers} at the end of each frame to present.
 */
@PluginDescriptor(
	name = "GPU (GLES)",
	description = "Android GLES renderer — Android port of the desktop GPU plugin",
	tags = {"fog", "draw distance", "android"},
	loadInSafeMode = false
)
public class GpuGlesPlugin extends Plugin implements DrawCallbacks
{
	private static final String TAG = "GpuGlesPlugin";

	static final int MAX_DISTANCE = 184;
	static final int MAX_FOG_DEPTH = 100;
	/** Offset for sxy → msxy in the extended scene grid (104→152 tile region). */
	public static final int SCENE_OFFSET = (Constants.EXTENDED_SCENE_SIZE - Constants.SCENE_SIZE) / 2;
	static final int NUM_ZONES = Constants.EXTENDED_SCENE_SIZE >> 3;
	static final int MAX_WORLDVIEWS = 4096;

	private static final int UNIFORM_BUFFER_SIZE = 5 * Float.BYTES;

	private static final GlesShader PROGRAM = new GlesShader()
		.add(GL_VERTEX_SHADER, "vert.glsl")
		.add(GL_FRAGMENT_SHADER, "frag.glsl");

	private static final GlesShader UI_PROGRAM = new GlesShader()
		.add(GL_VERTEX_SHADER, "vertui.glsl")
		.add(GL_FRAGMENT_SHADER, "fragui.glsl");

	@Inject private Client client;
	@Inject private ClientThread clientThread;
	@Inject private GpuGlesPluginConfig config;
	@Inject private TextureManager textureManager;
	@Inject private RegionManager regionManager;
	@Inject private net.runelite.client.callback.RenderCallbackManager renderCallbackManager;

	private boolean glInitted;
	private int glProgram;
	private int glUiProgram;

	private int textureArrayId = -1;
	private int lastAnisotropicFilteringLevel = -1;

	/** True for the current frame iff preSceneDraw fired (i.e. the client thinks
	 *  the 3D scene is being rendered). When false in draw(), we clear the EGL
	 *  surface ourselves so login/title-screen frames don't show stale pixels
	 *  from whatever the last logged-in frame left behind. */
	private boolean scenePaintedThisFrame;

	// Per-frame transient geometry pools — opaque, alpha, post-opaque.
	private VAOList vaoO, vaoA, vaoPO;

	private SceneUploader clientUploader, mapUploader;
	private FacePrioritySorter facePrioritySorter;

	private int cameraYaw, cameraPitch;

	private GpuFloatBuffer uniformBuffer;

	// One context per WorldView (toplevel + sub-views). Zones live here keyed
	// by extended-scene (x, z) chunk coords. Mirrors desktop layout 1:1.
	static class SceneContext
	{
		final int sizeX, sizeZ;
		Zone[][] zones;

		int cameraX, cameraY, cameraZ;
		int minLevel, level, maxLevel;
		java.util.Set<Integer> hideRoofIds = java.util.Collections.emptySet();

		SceneContext(int sizeX, int sizeZ)
		{
			this.sizeX = sizeX;
			this.sizeZ = sizeZ;
			zones = new Zone[sizeX][sizeZ];
			for (int x = 0; x < sizeX; ++x)
				for (int z = 0; z < sizeZ; ++z)
					zones[x][z] = new Zone();
		}

		void free()
		{
			for (int x = 0; x < sizeX; ++x)
				for (int z = 0; z < sizeZ; ++z)
					zones[x][z].free();
		}
	}

	private SceneContext root;
	private SceneContext[] subs;

	SceneContext context(Scene scene)
	{
		int wvid = scene.getWorldViewId();
		if (wvid == WorldView.TOPLEVEL) return root;
		return subs[wvid];
	}

	SceneContext context(WorldView wv)
	{
		int wvid = wv.getId();
		if (wvid == WorldView.TOPLEVEL) return root;
		return subs[wvid];
	}

	private int vaoUiHandle;
	private int vboUiHandle;

	private int interfaceTexture;
	private int interfacePbo;

	private int lastCanvasWidth = -1;
	private int lastCanvasHeight = -1;

	private final GlesBuffer glUniformBuffer = new GlesBuffer("uniform buffer");

	// Scene-shader uniform locations. uniBase / uniEntityTint / uniEntityProj are
	// static so Zone / VAO / draw helpers in the same package can reach them
	// without holding a plugin instance, matching desktop's pattern.
	private int uniUseFog, uniFogColor, uniFogDepth, uniDrawDistance;
	private int uniExpandedMapLoadingChunks, uniSmoothBanding;
	private int uniWorldProj;
	static int uniEntityProj;
	static int uniEntityTint;
	private int uniBrightness, uniTextures, uniTextureAnimations;
	private int uniBlockMain, uniTextureLightMode, uniTick;
	private int uniColorblindIntensity;
	static int uniBase;
	// UI-shader uniform locations
	private int uniTex, uniTexSourceDimensions, uniTexTargetDimensions;
	private int uniUiAlphaOverlay, uniUiColorblindIntensity;

	private static Projection lastProjection;

	/** Update the entity-projection uniform if it changed. Static so VAO can call
	 *  during batched draws; mirrors desktop GpuPlugin.updateEntityProjection. */
	static void updateEntityProjection(Projection projection)
	{
		if (lastProjection != projection)
		{
			float[] p = projection instanceof FloatProjection
				? ((FloatProjection) projection).getProjection()
				: Mat4.identity();
			glUniformMatrix4fv(uniEntityProj, 1, false, p, 0);
			lastProjection = projection;
		}
	}

	@Override
	protected void startUp()
	{
		// Allocate scene state up-front — these are CPU-only and don't need GL.
		root = new SceneContext(NUM_ZONES, NUM_ZONES);
		subs = new SceneContext[MAX_WORLDVIEWS];
		clientUploader = new SceneUploader(renderCallbackManager);
		mapUploader = new SceneUploader(renderCallbackManager);
		facePrioritySorter = new FacePrioritySorter(clientUploader);

		clientThread.invoke(() -> {
			try
			{
				bringUpGl();

				client.setDrawCallbacks(this);
				client.setGpuFlags(DrawCallbacks.GPU
					| (config.removeVertexSnapping() ? DrawCallbacks.NO_VERTEX_SNAPPING : 0)
					| DrawCallbacks.ZBUF);
				client.setExpandedMapLoading(config.expandedMapLoadingZones());

				// Force the BufferProvider rebuild so it gives us an RGBA-with-alpha
				// pixel buffer — the desktop plugin does the same. The UI shader
				// alpha-blends the overlay onto the GL scene below, so non-zero
				// alpha matters.
				client.resizeCanvas();
			}
			catch (Throwable t)
			{
				Log.e(TAG, "startUp failed", t);
				try { shutDown(); } catch (Throwable ignored) {}
			}
			return true;
		});
	}

	@Subscribe
	public void onGameStateChanged(GameStateChanged ev)
	{
		// Force a scene rebuild whenever the game transitions back to LOGGED_IN so
		// freshly-loaded zones get uploaded. The actual upload is driven by the
		// client calling loadScene/swapScene; this just makes sure we're listening.
		if (ev.getGameState() == GameState.LOADING)
		{
			// Mark all zones as needing rebuild on next swapScene.
			if (root != null)
			{
				for (int x = 0; x < root.sizeX; ++x)
					for (int z = 0; z < root.sizeZ; ++z)
						root.zones[x][z].invalidate = true;
			}
		}
	}

	@Override
	protected void shutDown()
	{
		clientThread.invoke(() -> {
			client.setGpuFlags(0);
			client.setDrawCallbacks(null);
			client.setUnlockedFps(false);
			client.setExpandedMapLoading(0);

			if (glInitted)
			{
				shutdownInterfaceTexture();
				shutdownProgram();
				shutdownVao();
				shutdownBuffers();
				glInitted = false;
			}

			client.resizeCanvas();
			return true;
		});
	}

	@Provides
	GpuGlesPluginConfig provideConfig(ConfigManager cm) { return cm.getConfig(GpuGlesPluginConfig.class); }

	// -----------------------------------------------------------------------
	// GL bring-up — runs once on the first draw() the EGL surface is ready.
	// We can't init eagerly because the Compose SurfaceView may not have
	// produced an Android Surface yet when startUp() runs.
	// -----------------------------------------------------------------------

	private void bringUpGl() throws ShaderException
	{
		if (glInitted) return;
		if (!GlesHost.get().makeCurrent())
		{
			Log.d(TAG, "EGL not ready yet, deferring GL init");
			return;
		}

		Log.i(TAG, "GLES vendor=" + glGetString(GLES20.GL_VENDOR)
			+ " renderer=" + glGetString(GLES20.GL_RENDERER)
			+ " version=" + glGetString(GLES20.GL_VERSION));

		initBuffers();
		initVao();
		initProgram();
		initInterfaceTexture();

		Zone.initBuffer();

		uniformBuffer = new GpuFloatBuffer(UNIFORM_BUFFER_SIZE);
		vaoO = new VAOList();
		vaoA = new VAOList();
		vaoPO = new VAOList();

		glInitted = true;
		Log.i(TAG, "GLES bring-up complete");
	}

	int getDrawDistance()
	{
		final int limit = MAX_DISTANCE;
		return Math.max(0, Math.min(config.drawDistance(), limit));
	}

	private void initBuffers()
	{
		int[] ids = new int[1];
		GLES20.glGenBuffers(1, ids, 0);
		glUniformBuffer.glBufferId = ids[0];
	}

	private void shutdownBuffers()
	{
		if (glUniformBuffer.glBufferId != 0)
		{
			glDeleteBuffers(1, new int[]{ glUniformBuffer.glBufferId }, 0);
			glUniformBuffer.glBufferId = 0;
		}
	}

	private void initVao()
	{
		int[] arr = new int[1];

		glGenVertexArrays(1, arr, 0);
		vaoUiHandle = arr[0];

		GLES20.glGenBuffers(1, arr, 0);
		vboUiHandle = arr[0];

		glBindVertexArray(vaoUiHandle);
		glBindBuffer(GL_ARRAY_BUFFER, vboUiHandle);

		// Two-tri fullscreen quad — 4 verts × (vec3 pos + vec2 uv).
		FloatBuffer vboBuf = ByteBuffer.allocateDirect(5 * 4 * Float.BYTES)
			.order(ByteOrder.nativeOrder()).asFloatBuffer();
		vboBuf.put(new float[] {
			 1f,  1f, 0f, 1f, 0f, // top right
			 1f, -1f, 0f, 1f, 1f, // bottom right
			-1f, -1f, 0f, 0f, 1f, // bottom left
			-1f,  1f, 0f, 0f, 0f, // top left
		});
		vboBuf.rewind();
		glBufferData(GL_ARRAY_BUFFER, 5 * 4 * Float.BYTES, vboBuf, GL_STATIC_DRAW);

		glVertexAttribPointer(0, 3, GL_FLOAT, false, 5 * Float.BYTES, 0);
		glEnableVertexAttribArray(0);
		glVertexAttribPointer(1, 2, GL_FLOAT, false, 5 * Float.BYTES, 3 * Float.BYTES);
		glEnableVertexAttribArray(1);

		glBindVertexArray(0);
		glBindBuffer(GL_ARRAY_BUFFER, 0);
	}

	private void shutdownVao()
	{
		if (vboUiHandle != 0) glDeleteBuffers(1, new int[]{ vboUiHandle }, 0);
		if (vaoUiHandle != 0) glDeleteVertexArrays(1, new int[]{ vaoUiHandle }, 0);
		vboUiHandle = vaoUiHandle = 0;
	}

	private void initProgram() throws ShaderException
	{
		// Some GL implementations require a VAO bound before any program validates,
		// so bind the UI VAO during compile — matches the desktop plugin's quirk.
		glBindVertexArray(vaoUiHandle);

		GlesTemplate template = createTemplate();
		glProgram = PROGRAM.compile(template);
		glUiProgram = UI_PROGRAM.compile(template);

		glBindVertexArray(0);

		initUniforms();
	}

	private GlesTemplate createTemplate()
	{
		// Inline tokens — `#include foo` (no quotes) maps to one of these constants;
		// `#include "foo.glsl"` resolves through the classloader.
		GlesTemplate t = new GlesTemplate();
		t.add(key -> {
			switch (key)
			{
				case "texture_config":  return "#define TEXTURE_COUNT 256\n";
				case "sampling_mode":   return "#define SAMPLING_MODE 1\n"; // LINEAR
				case "colorblind_mode": return "#define COLORBLIND_MODE 0\n";
				default: return null;
			}
		});
		t.addInclude(GpuGlesPlugin.class);
		return t;
	}

	private void initUniforms()
	{
		uniWorldProj = glGetUniformLocation(glProgram, "worldProj");
		uniEntityProj = glGetUniformLocation(glProgram, "entityProj");
		uniEntityTint = glGetUniformLocation(glProgram, "entityTint");
		uniSmoothBanding = glGetUniformLocation(glProgram, "smoothBanding");
		uniBrightness = glGetUniformLocation(glProgram, "brightness");
		uniUseFog = glGetUniformLocation(glProgram, "useFog");
		uniFogColor = glGetUniformLocation(glProgram, "fogColor");
		uniFogDepth = glGetUniformLocation(glProgram, "fogDepth");
		uniDrawDistance = glGetUniformLocation(glProgram, "drawDistance");
		uniExpandedMapLoadingChunks = glGetUniformLocation(glProgram, "expandedMapLoadingChunks");
		uniTextureLightMode = glGetUniformLocation(glProgram, "textureLightMode");
		uniTick = glGetUniformLocation(glProgram, "tick");
		uniBlockMain = GLES30.glGetUniformBlockIndex(glProgram, "uniforms");
		uniTextures = glGetUniformLocation(glProgram, "textures");
		uniTextureAnimations = glGetUniformLocation(glProgram, "textureAnimations");
		uniBase = glGetUniformLocation(glProgram, "base");
		uniColorblindIntensity = glGetUniformLocation(glProgram, "colorblindIntensity");

		uniTex = glGetUniformLocation(glUiProgram, "tex");
		uniTexTargetDimensions = glGetUniformLocation(glUiProgram, "targetDimensions");
		uniTexSourceDimensions = glGetUniformLocation(glUiProgram, "sourceDimensions");
		uniUiAlphaOverlay = glGetUniformLocation(glUiProgram, "alphaOverlay");
		uniUiColorblindIntensity = glGetUniformLocation(glUiProgram, "colorblindIntensity");
	}

	private void shutdownProgram()
	{
		if (glProgram != 0)   glDeleteProgram(glProgram);
		if (glUiProgram != 0) glDeleteProgram(glUiProgram);
		glProgram = glUiProgram = 0;
	}

	private void initInterfaceTexture()
	{
		int[] arr = new int[1];
		GLES20.glGenBuffers(1, arr, 0);
		interfacePbo = arr[0];

		glGenTextures(1, arr, 0);
		interfaceTexture = arr[0];
		glBindTexture(GL_TEXTURE_2D, interfaceTexture);
		glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_WRAP_S, GL_CLAMP_TO_EDGE);
		glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_WRAP_T, GL_CLAMP_TO_EDGE);
		glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MIN_FILTER, GL_LINEAR);
		glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MAG_FILTER, GL_LINEAR);
		glBindTexture(GL_TEXTURE_2D, 0);
	}

	private void shutdownInterfaceTexture()
	{
		if (interfacePbo != 0)     glDeleteBuffers(1, new int[]{ interfacePbo }, 0);
		if (interfaceTexture != 0) glDeleteTextures(1, new int[]{ interfaceTexture }, 0);
		interfacePbo = interfaceTexture = 0;
	}

	// -----------------------------------------------------------------------
	// DrawCallbacks — invoked by the patched client. Only `draw(int)` and
	// `swapScene` are non-default in the interface. The other zone/scene/dynamic
	// callbacks will be filled in when the scene-rendering pass lands.
	// -----------------------------------------------------------------------

	@Override
	public void draw(int overlayColor)
	{
		GameState gameState = client.getGameState();
		if (gameState == GameState.STARTING) return;

		// EGL is created lazily — first draw() after the SurfaceView is alive
		// brings the context up.
		if (!glInitted)
		{
			try { bringUpGl(); }
			catch (Throwable t) { Log.e(TAG, "deferred GL init failed", t); return; }
			if (!glInitted) return;
		}
		else if (!GlesHost.get().makeCurrent())
		{
			return;
		}

		// Lazy texture-array init — textures load asynchronously, so retry
		// each frame until initTextureArray returns a real id.
		TextureProvider tp = client.getTextureProvider();
		if (textureArrayId == -1 && tp != null)
		{
			textureArrayId = textureManager.initTextureArray(tp);
			if (textureArrayId > -1)
			{
				float[] texAnims = textureManager.computeTextureAnimations(tp);
				glUseProgram(glProgram);
				GLES20.glUniform2fv(uniTextureAnimations, texAnims.length / 2, texAnims, 0);
				glUseProgram(0);
			}
		}

		int canvasWidth = client.getCanvasWidth();
		int canvasHeight = client.getCanvasHeight();
		if (canvasWidth <= 0 || canvasHeight <= 0) return;

		prepareInterfaceTexture(canvasWidth, canvasHeight);

		// IMPORTANT: do NOT glClear when scene was painted this frame. By the
		// time draw() runs, preSceneDraw has already cleared the framebuffer to
		// the sky color and drawZoneOpaque/Alpha have rasterised the 3D scene
		// onto the EGL surface. A clear here would wipe the scene back to black
		// and the UI shader would composite onto black instead of on top of
		// the rendered scene. Desktop avoids this by rendering scene to an
		// offscreen FBO and blitting it back here; we skip the FBO and rely on
		// call ordering.
		//
		// At login/title (no scene draw this frame), we DO need to clear, else
		// stale pixels from the last logged-in frame stay on the surface and
		// show as garbage behind the UI overlay.
		if (!scenePaintedThisFrame)
		{
			GLES20.glViewport(0, 0, GlesHost.get().getWidth(), GlesHost.get().getHeight());
			glClearColor(0f, 0f, 0f, 1f);
			glClear(GL_COLOR_BUFFER_BIT);
		}
		scenePaintedThisFrame = false;

		drawUi(overlayColor, canvasWidth, canvasHeight);

		GlesHost.get().swapBuffers();
	}

	@Override
	public void swapScene(Scene scene)
	{
		// Rebuild any zones the client has marked dirty since the last swap.
		// This is where SceneUploader actually walks tile/object geometry and
		// fills a VBO with per-vertex (pos, abhsl, uv) — the GL work that makes
		// drawZoneOpaque/Alpha later actually have data to draw.
		if (!glInitted) return;
		if (!GlesHost.get().makeCurrent()) return;
		rebuild(scene);
	}

	private void rebuild(Scene scene)
	{
		SceneContext ctx = context(scene);
		if (ctx == null) return;

		for (int x = 0; x < ctx.sizeX; ++x)
		{
			for (int z = 0; z < ctx.sizeZ; ++z)
			{
				Zone zone = ctx.zones[x][z];
				if (!zone.invalidate) continue;

				zone.free();
				zone = ctx.zones[x][z] = new Zone();

				clientUploader.zoneSize(scene, zone, x, z);

				VBO o = null, a = null;
				int sz = zone.sizeO * Zone.VERT_SIZE * 3;
				if (sz > 0)
				{
					o = new VBO(sz);
					o.init(GLES20.GL_STATIC_DRAW);
					o.map();
				}

				sz = zone.sizeA * Zone.VERT_SIZE * 3;
				if (sz > 0)
				{
					a = new VBO(sz);
					a.init(GLES20.GL_STATIC_DRAW);
					a.map();
				}

				zone.init(o, a);

				clientUploader.uploadZone(scene, zone, x, z);

				zone.unmap();
				zone.initialized = true;
				zone.invalidate = false;
				zone.dirty = true;
			}
		}
	}

	@Override
	public void loadScene(Scene scene)
	{
		// Hook for scene-load notifications. Zone (re)builds happen lazily in
		// preSceneDraw via the invalidate flag.
		SceneContext ctx = context(scene);
		if (ctx == null) return;
		for (int x = 0; x < ctx.sizeX; ++x)
			for (int z = 0; z < ctx.sizeZ; ++z)
				ctx.zones[x][z].invalidate = true;
	}

	@Override
	public void loadScene(WorldView wv, Scene scene)
	{
		int id = wv.getId();
		if (id != WorldView.TOPLEVEL && subs[id] == null)
		{
			subs[id] = new SceneContext(NUM_ZONES, NUM_ZONES);
		}
		loadScene(scene);
	}

	@Override
	public void despawnWorldView(WorldView wv)
	{
		int id = wv.getId();
		if (id != WorldView.TOPLEVEL && subs[id] != null)
		{
			subs[id].free();
			subs[id] = null;
		}
	}

	@Override
	public void preSceneDraw(Scene scene,
		float cameraX, float cameraY, float cameraZ, float cameraPitch, float cameraYaw,
		int minLevel, int level, int maxLevel, java.util.Set<Integer> hideRoofIds)
	{
		SceneContext ctx = context(scene);
		if (ctx != null)
		{
			ctx.cameraX = (int) cameraX;
			ctx.cameraY = (int) cameraY;
			ctx.cameraZ = (int) cameraZ;
			ctx.minLevel = minLevel;
			ctx.level = level;
			ctx.maxLevel = maxLevel;
			ctx.hideRoofIds = hideRoofIds;
		}

		if (scene.getWorldViewId() == WorldView.TOPLEVEL)
		{
			this.cameraYaw = client.getCameraYaw();
			this.cameraPitch = client.getCameraPitch();
			preSceneDrawToplevel(scene, cameraX, cameraY, cameraZ, cameraPitch, cameraYaw);
			scenePaintedThisFrame = true;
		}
		else
		{
			Scene toplevel = client.getScene();
			vaoO.addRange(null, toplevel);
			vaoPO.addRange(null, toplevel);
			glUniform4i(uniEntityTint, scene.getOverrideHue(), scene.getOverrideSaturation(),
				scene.getOverrideLuminance(), scene.getOverrideAmount());
		}
	}

	private void preSceneDrawToplevel(Scene scene,
		float cameraX, float cameraY, float cameraZ, float cameraPitch, float cameraYaw)
	{
		scene.setDrawDistance(getDrawDistance());

		// UBO update — camera position + angles. The scene vertex shader reads
		// these from std140 binding 0.
		uniformBuffer.clear();
		uniformBuffer.put(cameraYaw).put(cameraPitch).put(cameraX).put(cameraY).put(cameraZ);
		uniformBuffer.flip();

		GLES20.glBindBuffer(GL_UNIFORM_BUFFER, glUniformBuffer.glBufferId);
		GLES20.glBufferData(GL_UNIFORM_BUFFER, UNIFORM_BUFFER_SIZE, uniformBuffer.getBuffer(), GLES20.GL_DYNAMIC_DRAW);
		GLES20.glBindBuffer(GL_UNIFORM_BUFFER, 0);
		uniformBuffer.clear();

		glBindBufferBase(GL_UNIFORM_BUFFER, 0, glUniformBuffer.glBufferId);

		// Viewport — render direct to the EGL surface (no offscreen FBO).
		int viewportWidth = client.getViewportWidth();
		int viewportHeight = client.getViewportHeight();
		int canvasHeight = client.getCanvasHeight();
		int viewportXOff = client.getViewportXOffset();
		int viewportYOff = client.getViewportYOffset();

		int surfW = GlesHost.get().getWidth();
		int surfH = GlesHost.get().getHeight();
		// Scale the client-relative viewport into surface space. The EGL surface
		// is sized to the displayed canvas region, so client viewport coords map
		// directly with one caveat: GL viewport origin is bottom-left.
		float sx = surfW > 0 ? (float) surfW / client.getCanvasWidth() : 1f;
		float sy = surfH > 0 ? (float) surfH / client.getCanvasHeight() : 1f;
		int vx = (int) (viewportXOff * sx);
		int vy = (int) ((canvasHeight - viewportHeight - viewportYOff) * sy);
		int vw = (int) (viewportWidth * sx);
		int vh = (int) (viewportHeight * sy);
		GLES20.glViewport(vx, vy, vw, vh);

		// Sky / clear. Standard depth convention now (matches Mat4.projection's
		// rewritten output range): 1.0 = far, GL_LESS = closer fragments win.
		int sky = client.getSkyboxColor();
		GLES20.glClearColor(((sky >> 16) & 0xFF) / 255f, ((sky >> 8) & 0xFF) / 255f, (sky & 0xFF) / 255f, 1f);
		glClearDepthf(1f);
		GLES20.glClear(GLES20.GL_COLOR_BUFFER_BIT | GLES20.GL_DEPTH_BUFFER_BIT);

		// Anisotropic filter — only apply when the texture array exists.
		final int anisotropic = config.anisotropicFilteringLevel();
		if (textureArrayId != -1 && lastAnisotropicFilteringLevel != anisotropic)
		{
			textureManager.setAnisotropicFilteringLevel(textureArrayId, anisotropic);
			lastAnisotropicFilteringLevel = anisotropic;
		}

		glUseProgram(glProgram);

		// Scalar uniforms.
		final int drawDistance = getDrawDistance();
		final int fogDepth = config.fogDepth();
		glUniform1i(uniUseFog, fogDepth > 0 ? 1 : 0);
		glUniform4f(uniFogColor, ((sky >> 16) & 0xFF) / 255f, ((sky >> 8) & 0xFF) / 255f, (sky & 0xFF) / 255f, 1f);
		glUniform1i(uniFogDepth, fogDepth);
		glUniform1i(uniDrawDistance, drawDistance * Perspective.LOCAL_TILE_SIZE);
		glUniform1i(uniExpandedMapLoadingChunks, client.getExpandedMapLoading());
		glUniform1f(uniColorblindIntensity, config.colorBlindIntensity());

		TextureProvider textureProvider = client.getTextureProvider();
		glUniform1f(uniBrightness, textureProvider != null ? (float) textureProvider.getBrightness() : 0.5f);
		glUniform1f(uniSmoothBanding, config.smoothBanding() ? 0f : 1f);
		glUniform1f(uniTextureLightMode, config.brightTextures() ? 1f : 0f);
		if (client.getGameState() == GameState.LOGGED_IN)
		{
			glUniform1i(uniTick, client.getGameCycle() & 127);
		}

		// World projection matrix (column-major, glUniformMatrix4fv pushes as-is).
		float[] proj = Mat4.scale(client.getScale(), client.getScale(), 1);
		Mat4.mul(proj, Mat4.projection(viewportWidth, viewportHeight, 50));
		Mat4.mul(proj, Mat4.rotateX(cameraPitch));
		Mat4.mul(proj, Mat4.rotateY(cameraYaw));
		Mat4.mul(proj, Mat4.translate(-cameraX, -cameraY, -cameraZ));
		glUniformMatrix4fv(uniWorldProj, 1, false, proj, 0);

		float[] ident = Mat4.identity();
		glUniformMatrix4fv(uniEntityProj, 1, false, ident, 0);
		lastProjection = null;

		glUniform4i(uniEntityTint, 0, 0, 0, 0);

		glUniformBlockBinding(glProgram, uniBlockMain, 0);
		glUniform1i(uniTextures, 1); // sampler array bound to texture unit 1

		glEnable(GL_CULL_FACE);
		glEnable(GL_BLEND);
		glBlendFuncSeparate(GL_SRC_ALPHA, GL_ONE_MINUS_SRC_ALPHA, GL_ONE, GL_ONE);

		// Standard depth convention: GL_LESS + clear=1.0. Mat4.projection now
		// produces z_ndc ∈ [-1, 1] (mapped to window-z ∈ [0, 1]) instead of the
		// reverse-Z [0, 1] desktop config — without glClipControl on GLES we'd
		// lose half the depth precision otherwise, which is what produced the
		// "layered cake" artifact on tree leaves.
		glDepthFunc(GL_LESS);
		glEnable(GLES20.GL_DEPTH_TEST);
	}

	@Override
	public void postSceneDraw(Scene scene)
	{
		if (scene.getWorldViewId() == WorldView.TOPLEVEL)
		{
			GLES20.glDisable(GL_BLEND);
			GLES20.glDisable(GL_CULL_FACE);
			GLES20.glDisable(GLES20.GL_DEPTH_TEST);
		}
		else
		{
			glUniform4i(uniEntityTint, 0, 0, 0, 0);
		}
	}

	@Override
	public void drawZoneOpaque(Projection entityProjection, Scene scene, int zx, int zz)
	{
		updateEntityProjection(entityProjection);

		SceneContext ctx = context(scene);
		if (ctx == null) return;

		Zone z = ctx.zones[zx][zz];
		if (!z.initialized) return;

		int offset = scene.getWorldViewId() == WorldView.TOPLEVEL ? (SCENE_OFFSET >> 3) : 0;
		z.renderOpaque(zx - offset, zz - offset, ctx.minLevel, ctx.level, ctx.maxLevel, ctx.hideRoofIds);
	}

	private static final int ALPHA_ZSORT_CLOSE = 2048;

	@Override
	public void drawZoneAlpha(Projection entityProjection, Scene scene, int level, int zx, int zz)
	{
		SceneContext ctx = context(scene);
		if (ctx == null) return;

		vaoA.unmap();

		Zone z = ctx.zones[zx][zz];
		if (!z.initialized) return;

		updateEntityProjection(entityProjection);
		glUniform4i(uniEntityTint, scene.getOverrideHue(), scene.getOverrideSaturation(),
			scene.getOverrideLuminance(), scene.getOverrideAmount());

		int offset = scene.getWorldViewId() == WorldView.TOPLEVEL ? (SCENE_OFFSET >> 3) : 0;
		int dx = ctx.cameraX - ((zx - offset) << 10);
		int dz = ctx.cameraZ - ((zz - offset) << 10);
		boolean close = dx * dx + dz * dz < ALPHA_ZSORT_CLOSE * ALPHA_ZSORT_CLOSE;

		if (level == 0)
		{
			z.alphaSort(zx - offset, zz - offset, ctx.cameraX, ctx.cameraY, ctx.cameraZ);
			z.multizoneLocs(scene, zx - offset, zz - offset, ctx.cameraX, ctx.cameraZ, ctx.zones);
		}

		z.renderAlpha(zx - offset, zz - offset, cameraYaw, cameraPitch,
			ctx.minLevel, ctx.level, ctx.maxLevel, level, ctx.hideRoofIds,
			!close || (scene.getOverrideAmount() > 0));
	}

	@Override
	public void drawPass(Projection projection, Scene scene, int pass)
	{
		SceneContext ctx = context(scene);
		if (ctx == null) return;

		updateEntityProjection(projection);

		if (pass == DrawCallbacks.PASS_OPAQUE)
		{
			vaoO.addRange(projection, scene);
			vaoPO.addRange(projection, scene);

			if (scene.getWorldViewId() == WorldView.TOPLEVEL)
			{
				glUniform3i(uniBase, 0, 0, 0);

				int sz = vaoO.unmap();
				for (int i = 0; i < sz; ++i)
				{
					VAO vao = vaoO.vaos.get(i);
					vao.draw();
					vao.reset();
				}

				sz = vaoPO.unmap();
				for (int i = 0; i < sz; ++i)
				{
					VAO vao = vaoPO.vaos.get(i);
					vao.draw();
					vao.reset();
				}
			}
		}
		else // PASS_ALPHA
		{
			vaoA.addRange(projection, scene);

			if (scene.getWorldViewId() == WorldView.TOPLEVEL)
			{
				glUniform3i(uniBase, 0, 0, 0);

				int sz = vaoA.unmap();
				for (int i = 0; i < sz; ++i)
				{
					VAO vao = vaoA.vaos.get(i);
					GLES20.glDepthMask(false);
					vao.draw();
					GLES20.glDepthMask(true);
					vao.reset();
				}

				// CRITICAL: clean up temp alpha models stashed across zones by
				// multizoneLocs during the alpha pass. Without this, every frame
				// allocates new AlphaModel instances that never get reclaimed
				// → heap exhaustion in seconds (OOM in multizoneLocs).
				for (int x = 0; x < ctx.sizeX; ++x)
				{
					for (int z = 0; z < ctx.sizeZ; ++z)
					{
						ctx.zones[x][z].removeTemp();
					}
				}
			}
		}
	}

	@Override
	public void drawDynamic(Projection worldProjection, Scene scene, TileObject tileObject,
		Renderable r, Model m, int orient, int x, int y, int z)
	{
		uploadDynamicModel(worldProjection, scene, m, orient, x, y, z, false);
	}

	@Override
	public void drawTemp(Projection worldProjection, Scene scene, GameObject gameObject,
		Model m, int orient, int x, int y, int z)
	{
		uploadDynamicModel(worldProjection, scene, m, orient, x, y, z, true);
	}

	/**
	 * Allocate space in vaoO + vaoA and run uploadSortedModel. Matches the
	 * desktop drawDynamic shape: opaque faces accumulate into vaoO, alpha faces
	 * into vaoA; if any alpha faces were written we register the model with the
	 * containing zone so the later alpha pass picks it up.
	 *
	 * Errors here are non-fatal — a malformed model shouldn't bring down the
	 * whole render. The desktop swallows them the same way.
	 */
	private void uploadDynamicModel(Projection proj, Scene scene, Model model, int orient,
		int x, int y, int z, boolean isTemp)
	{
		if (model == null) return;
		int faceCount = model.getFaceCount();
		if (faceCount <= 0) return;

		final int size = faceCount * 3 * VAO.VERT_SIZE;
		VAO o = vaoO.get(size);
		VAO a = vaoA.get(size);
		int aStart = a.vbo.vb.position();

		try
		{
			model.calculateBoundsCylinder();
			facePrioritySorter.uploadSortedModel(proj, model, orient, x, y, z,
				o.vbo.vb, a.vbo.vb, !isTemp);
		}
		catch (Throwable t)
		{
			// Match desktop GpuPlugin behaviour: log + skip. Keeps a single bad
			// model from crashing the entire render thread.
			Log.d(TAG, "uploadSortedModel failed: " + t);
		}

		int aEnd = a.vbo.vb.position();
		if (aEnd > aStart)
		{
			SceneContext ctx = context(scene);
			if (ctx != null)
			{
				int offset = scene.getWorldViewId() == WorldView.TOPLEVEL ? (SCENE_OFFSET >> 3) : 0;
				int zx = (x >> 10) + offset;
				int zz = (z >> 10) + offset;
				if (zx >= 0 && zx < ctx.sizeX && zz >= 0 && zz < ctx.sizeZ)
				{
					Zone zone = ctx.zones[zx][zz];
					int plane = Math.min(ctx.maxLevel, 0);
					zone.addTempAlphaModel(a.vao, aStart, aEnd, plane, x & 1023, y, z & 1023);
				}
			}
		}
	}

	private void prepareInterfaceTexture(int canvasWidth, int canvasHeight)
	{
		if (canvasWidth != lastCanvasWidth || canvasHeight != lastCanvasHeight)
		{
			lastCanvasWidth = canvasWidth;
			lastCanvasHeight = canvasHeight;
			glBindTexture(GL_TEXTURE_2D, interfaceTexture);
			glTexImage2D(GL_TEXTURE_2D, 0, GL_RGBA, canvasWidth, canvasHeight, 0,
				GL_RGBA, GL_UNSIGNED_BYTE, null);
			glBindTexture(GL_TEXTURE_2D, 0);
		}

		BufferProvider bp = client.getBufferProvider();
		if (bp == null) return;
		int[] pixels = bp.getPixels();
		int w = bp.getWidth();
		int h = bp.getHeight();
		if (pixels == null || w <= 0 || h <= 0) return;

		// Direct upload from a CPU-side ByteBuffer. The desktop plugin streams
		// through a PBO with glMapBuffer for the async-DMA win; Android's GLES
		// java bindings don't expose the PBO-offset overload of glTexSubImage2D,
		// so we keep this synchronous for now. Revisit when porting to NDK
		// bindings if profiling flags this as a hot path.
		//
		// The OSRS BufferProvider hands us ARGB-packed ints in native byte order
		// → on little-endian Android those bytes land as B,G,R,A in memory.
		// GLES doesn't expose GL_BGRA on standard 3.1, so colour channels will
		// be swapped until we add a byte-swizzle (either in the fragui sampler
		// or while staging into the buffer). Structural layout (chatbox bottom-
		// left, minimap top-right, etc.) is still verifiable in this state.
		ByteBuffer buf = ByteBuffer.allocateDirect(w * h * 4).order(ByteOrder.nativeOrder());
		buf.asIntBuffer().put(pixels, 0, w * h);
		buf.position(0);
		glBindTexture(GL_TEXTURE_2D, interfaceTexture);
		glTexSubImage2D(GL_TEXTURE_2D, 0, 0, 0, w, h, GL_RGBA, GL_UNSIGNED_BYTE, buf);
		glBindTexture(GL_TEXTURE_2D, 0);
	}

	private void drawUi(int overlayColor, int canvasWidth, int canvasHeight)
	{
		int viewW = GlesHost.get().getWidth();
		int viewH = GlesHost.get().getHeight();
		if (viewW <= 0 || viewH <= 0) { viewW = canvasWidth; viewH = canvasHeight; }
		glViewport(0, 0, viewW, viewH);

		glEnable(GL_BLEND);
		glBlendFunc(GL_ONE, GL_ONE_MINUS_SRC_ALPHA);

		glActiveTexture(GL_TEXTURE0);
		glBindTexture(GL_TEXTURE_2D, interfaceTexture);

		glUseProgram(glUiProgram);
		glUniform1i(uniTex, 0);
		glUniform2i(uniTexSourceDimensions, canvasWidth, canvasHeight);
		glUniform2i(uniTexTargetDimensions, viewW, viewH);
		glUniform4f(uniUiAlphaOverlay,
			((overlayColor >> 16) & 0xFF) / 255f,
			((overlayColor >> 8) & 0xFF) / 255f,
			(overlayColor & 0xFF) / 255f,
			((overlayColor >>> 24) & 0xFF) / 255f
		);

		glBindVertexArray(vaoUiHandle);
		glDrawArrays(GL_TRIANGLE_FAN, 0, 4);
		glBindVertexArray(0);
		glBindTexture(GL_TEXTURE_2D, 0);
		glUseProgram(0);

		glDisable(GL_BLEND);
	}
}
