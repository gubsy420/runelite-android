package net.runelite.client.plugins.mobile;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.events.BeforeRender;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetType;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;

/**
 * Snapshots the visible RS widget tree once per frame and publishes the resulting flat
 * list of opaque rectangles to {@link MobileHitTest}, so the Android touch driver can
 * tell whether a gesture starts on a UI widget (BUTTON1 — inv slot, scrollbar) or on
 * the 3D scene (BUTTON2 — camera rotate) without ever touching the client-thread-only
 * Widget API from the touch handler.
 *
 * <p>Safe to load on desktop too; it just produces an unused snapshot.</p>
 */
@Slf4j
@PluginDescriptor(
	name = "Mobile Input Bridge",
	description = "Provides interface-vs-scene hit-testing for the Android touch driver",
	hidden = true
)
public class MobileInputPlugin extends Plugin
{
	@Inject private Client client;

	private long lastLogMs;
	private int lastLoggedCount = -1;

	@Override
	protected void shutDown()
	{
		MobileHitTest.setInterfaceRects(null);
		MobileHitTest.setMenuRect(null);
		MobileHitTest.setFixedMode(false);
		MobileHitTest.setViewportRect(null);
	}

	@Subscribe
	public void onBeforeRender(BeforeRender ev)
	{
		// The engine reports all rect/coord APIs (viewport, menu, widget bounds) in
		// "real" (internal) space — the same space TranslateMouseListener converts
		// incoming mouse events INTO. Our Android touch handler delivers canvas-local
		// pixels in "stretched" space (what the user actually sees on screen). Compute
		// the scale once and apply at every publish site so rect-in-rect checks against
		// touch coords just work. When stretched mode is off, the factor is 1 and the
		// scaleRect path becomes a no-op.
		double sx = 1.0;
		double sy = 1.0;
		if (client.isStretchedEnabled())
		{
			Dimension real = client.getRealDimensions();
			Dimension stretched = client.getStretchedDimensions();
			if (real != null && stretched != null
				&& real.width > 0 && real.height > 0)
			{
				sx = (double) stretched.width / real.width;
				sy = (double) stretched.height / real.height;
			}
		}

		// Mode + viewport: published every frame so MobileHitTest can short-circuit on
		// fixed mode (where the chrome layout is static and "is this on UI" reduces to
		// "is this outside the 3D viewport"). The widget walk below is still done so
		// resizable mode keeps working — and so fixed mode has a fallback for the first
		// frame after a mode-change before the engine has computed viewport bounds.
		boolean fixed = !client.isResized();
		MobileHitTest.setFixedMode(fixed);
		if (fixed)
		{
			int vw = client.getViewportWidth();
			int vh = client.getViewportHeight();
			if (vw > 0 && vh > 0)
			{
				MobileHitTest.setViewportRect(scaleRect(
					client.getViewportXOffset(), client.getViewportYOffset(), vw, vh, sx, sy));
			}
		}
		else
		{
			MobileHitTest.setViewportRect(null);
		}

		// Menu rect: published every frame so the touch driver knows whether a long-press
		// release lands on a menu entry (→ select that entry with a left-click) or in the
		// world (→ no click; the menu just stays open until dismissed).
		if (client.isMenuOpen())
		{
			MobileHitTest.setMenuRect(scaleRect(
				client.getMenuX(), client.getMenuY(),
				client.getMenuWidth(), client.getMenuHeight(),
				sx, sy));
		}
		else
		{
			MobileHitTest.setMenuRect(null);
		}

		if (client.getGameState() == GameState.LOGGED_IN) {
			Widget[] roots = client.getWidgetRoots();
			if (roots == null)
			{
				MobileHitTest.setInterfaceRects(null);
				return;
			}
			List<Rectangle> rects = new ArrayList<>(64);
			for (Widget root : roots)
			{
				collect(root, rects);
			}
			Rectangle[] arr;
			if (sx == 1.0 && sy == 1.0)
			{
				arr = rects.toArray(new Rectangle[0]);
			}
			else
			{
				arr = new Rectangle[rects.size()];
				for (int i = 0; i < arr.length; i++)
				{
					Rectangle r = rects.get(i);
					arr[i] = scaleRect(r.x, r.y, r.width, r.height, sx, sy);
				}
			}
			MobileHitTest.setInterfaceRects(arr);

			// Periodic visibility into what's being treated as "interface". Helps diagnose
			// when too many rects are flagged (scene-clicks getting BUTTON1 instead of
			// BUTTON2) vs too few (inv drag getting BUTTON2 instead of BUTTON1).
			long now = System.currentTimeMillis();
			if (arr.length != lastLoggedCount && now - lastLogMs > 3000)
			{
				lastLogMs = now;
				lastLoggedCount = arr.length;
				log.info("mobile hit-test snapshot: {} blocking rects", arr.length);
			}
		}
	}

	/** Multiply a rect's origin + size by the real→stretched scale factor. Identity when
	 *  the factor is 1 (stretched mode off). Allocates a fresh Rectangle either way. */
	private static Rectangle scaleRect(int x, int y, int w, int h, double sx, double sy)
	{
		if (sx == 1.0 && sy == 1.0) return new Rectangle(x, y, w, h);
		return new Rectangle(
			(int) Math.round(x * sx), (int) Math.round(y * sy),
			(int) Math.round(w * sx), (int) Math.round(h * sy));
	}

	/**
	 * Depth-first walk. A widget contributes to the click-blocking set when it
	 * (a) is visible and non-LAYER (LAYER widgets are RS's transparent containers and
	 * never block clicks), AND (b) actually intercepts clicks — has a non-empty action
	 * list, a clickMask, OR an explicit noClickThrough flag. Without (b) we'd flag
	 * decorative chrome (background-fill rectangles drawn over the scene in resizable
	 * mode) as "interface" and never route scene drags to BUTTON2.
	 */
	private static void collect(Widget w, List<Rectangle> out)
	{
		if (w == null || w.isSelfHidden())
		{
			return;
		}
		Widget[] dyn = w.getDynamicChildren();
		if (dyn != null)
		{
			for (Widget c : dyn) collect(c, out);
		}
		Widget[] stat = w.getStaticChildren();
		if (stat != null)
		{
			for (Widget c : stat) collect(c, out);
		}
		Widget[] nest = w.getNestedChildren();
		if (nest != null)
		{
			for (Widget c : nest) collect(c, out);
		}
		if (isClickBlocking(w))
		{
			Rectangle b = w.getBounds();
			if (b != null && b.width > 0 && b.height > 0)
			{
				out.add(b);
			}
		}
	}

	/**
	 * What counts as "interface that swallows a drag":
	 * <ul>
	 *   <li>{@code WidgetType.LAYER} → NEVER. LAYER widgets are RS's transparent
	 *       group containers (the resizable-mode HUD trim is one big LAYER); flagging
	 *       these routes every scene drag to BUTTON1 and breaks camera rotation.</li>
	 *   <li>{@code noClickThrough} set → yes. The chat-box backdrop, inventory parent
	 *       container, etc. carry this and it's authoritative.</li>
	 *   <li>Non-empty {@code getActions()} → yes. Individual inventory item slots,
	 *       ground-item entries, scrollbars all sit here: the parent container's
	 *       bounds are too coarse for per-slot drag distinctions, and each slot
	 *       carries its own "Drop / Examine / Use" actions which uniquely identifies
	 *       it as click-intercepting. Dropping this branch was the regression that
	 *       sent inventory drags to camera — the LAYER guard above already excludes
	 *       the chrome containers that historically made this rule too broad.</li>
	 *   <li>{@code getClickMask() != 0} → yes. Some custom widgets use clickMask
	 *       without populating actions.</li>
	 * </ul>
	 */
	private static boolean isClickBlocking(Widget w)
	{
		if (w.getType() == WidgetType.LAYER)
		{
			return false;
		}
		if (w.getNoClickThrough())
		{
			return true;
		}
		String[] actions = w.getActions();
		if (actions != null)
		{
			for (String a : actions)
			{
				if (a != null && !a.isEmpty())
				{
					return true;
				}
			}
		}
		return w.getClickMask() != 0;
	}
}
