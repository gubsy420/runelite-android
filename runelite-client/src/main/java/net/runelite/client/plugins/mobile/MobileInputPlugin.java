package net.runelite.client.plugins.mobile;

import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
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
	}

	@Subscribe
	public void onBeforeRender(BeforeRender ev)
	{
		// Menu rect: published every frame so the touch driver knows whether a long-press
		// release lands on a menu entry (→ select that entry with a left-click) or in the
		// world (→ no click; the menu just stays open until dismissed).
		if (client.isMenuOpen())
		{
			MobileHitTest.setMenuRect(new Rectangle(
				client.getMenuX(), client.getMenuY(),
				client.getMenuWidth(), client.getMenuHeight()));
		}
		else
		{
			MobileHitTest.setMenuRect(null);
		}

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
		Rectangle[] arr = rects.toArray(new Rectangle[0]);
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
	 * The OSRS client uses {@code noClickThrough} to mark widgets that genuinely block
	 * clicks from reaching the scene (inventory grid, chat box backdrop, minimap, etc.).
	 * Earlier we also accepted any widget with actions or a non-zero clickMask, but a
	 * lot of decorative overlay chrome (resizable-mode HUD trim, transparent button
	 * hover targets) carries those without actually blocking — so taps in "empty" parts
	 * of the scene were being classified as interface and never reaching BUTTON2 drag.
	 */
	private static boolean isClickBlocking(Widget w)
	{
		return w.getType() != WidgetType.LAYER && w.getNoClickThrough();
	}
}
