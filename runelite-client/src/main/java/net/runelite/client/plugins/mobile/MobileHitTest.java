package net.runelite.client.plugins.mobile;

import java.awt.Rectangle;

/**
 * Touch-thread-safe interface-vs-scene hit test. Used by the Android input bridge to
 * pick BUTTON1 (interface drag: inv slot, scrollbar, button) vs BUTTON2 (scene drag:
 * camera) at the moment a touch crosses the drag-slop threshold.
 *
 * <p>The OSRS {@code Widget} APIs are client-thread-only — calling them from the
 * Compose touch handler triggered {@code IllegalStateException: must be called on
 * client thread} and killed the gesture coroutine the first time the user touched.
 * Instead, {@link MobileInputPlugin} walks the widget tree on the client thread once
 * per frame and dumps the resulting opaque rectangles here as a flat array. The
 * touch handler just intersects against the snapshot — no client-thread calls.</p>
 */
public final class MobileHitTest
{
	private static final Rectangle[] EMPTY = new Rectangle[0];
	private static volatile Rectangle[] interfaceRects = EMPTY;
	/** Right-click menu rect in canvas space, or null when no menu is open. */
	private static volatile Rectangle menuRect;

	private MobileHitTest() {}

	/** Called by {@link MobileInputPlugin} on the client thread once per frame. */
	static void setInterfaceRects(Rectangle[] rects)
	{
		interfaceRects = (rects == null || rects.length == 0) ? EMPTY : rects;
	}

	/** Called by {@link MobileInputPlugin} on the client thread once per frame. Null
	 *  while no right-click menu is open. */
	static void setMenuRect(Rectangle rect)
	{
		menuRect = rect;
	}

	/** True if a right-click menu is open AND (canvasX, canvasY) lies inside it. Used
	 *  by the long-press release path so a finger lift outside the menu cancels the
	 *  selection instead of firing a stray left-click on the world below. */
	public static boolean isMenuAt(int canvasX, int canvasY)
	{
		Rectangle r = menuRect;
		return r != null
			&& canvasX >= r.x && canvasY >= r.y
			&& canvasX < r.x + r.width && canvasY < r.y + r.height;
	}

	/**
	 * @param canvasX x in OSRS canvas space (pixels from the game canvas's top-left)
	 * @param canvasY y in OSRS canvas space
	 * @return true if any opaque widget covers (canvasX, canvasY) as of the most-recent
	 *   frame snapshot. Safe to call from any thread.
	 */
	public static boolean isInterfaceAt(int canvasX, int canvasY)
	{
		Rectangle[] snap = interfaceRects;
		for (int i = 0; i < snap.length; i++)
		{
			Rectangle r = snap[i];
			if (canvasX >= r.x && canvasY >= r.y
				&& canvasX < r.x + r.width && canvasY < r.y + r.height)
			{
				return true;
			}
		}
		return false;
	}
}
