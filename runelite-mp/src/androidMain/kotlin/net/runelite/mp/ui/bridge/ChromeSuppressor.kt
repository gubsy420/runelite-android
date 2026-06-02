package net.runelite.mp.ui.bridge

import android.util.Log

/**
 * Hides the upstream RuneLite [net.runelite.client.ui.ClientUI] Swing chrome (the
 * navigation toolbar and tabbed sidebar). With the Compose chrome in [net.runelite.mp.ui.WindowImpl]
 * taking over the plugin list + config form, drawing the AWT chrome too would just
 * stack two sidebars in the bitmap blit.
 *
 * The relevant fields are private — we reach in via reflection rather than patching
 * upstream so the suppression is a single-file local concern, not a cross-cutting
 * client edit.
 *
 * Safe to call repeatedly: a successful suppression sets the volatile flag and skips
 * subsequent attempts. Pre-injector calls (before RuneLite.main reaches ClientUI's
 * lazy init) become no-ops and just return for retry on the next frame.
 */
internal object ChromeSuppressor
{
    @Volatile private var done = false
    private const val TAG = "ChromeSuppressor"

    fun tryHide()
    {
        if (done) return
        val ui = try { RuneLiteAccess.instance(Class.forName("net.runelite.client.ui.ClientUI")) }
        catch (t: Throwable) { return } ?: return
        try
        {
            // ClientUI's sidebar (JTabbedPane) and toolbar (ClientToolbarPanel) are
            // private fields. Pulling them out + setVisible(false) keeps RuneLite's
            // own logic happy (it still updates the underlying state) while the
            // Swing layout collapses them to zero size — so the bitmap blit only
            // ships the game canvas region.
            val cls = ui.javaClass
            // Only the icon-strip toolbar is suppressed; the side panel (JTabbedPane with
            // each plugin's panel content) stays alive so opening a nav button from
            // Compose still produces a real panel that downstream rendering can capture.
            val toolbarField = cls.getDeclaredField("toolbarPanel").apply { isAccessible = true }
            val toolbar = toolbarField.get(ui) as? java.awt.Component
            javax.swing.SwingUtilities.invokeLater {
                toolbar?.isVisible = false
                (toolbar?.parent as? javax.swing.JComponent)?.revalidate()
            }
            done = true
            Log.i(TAG, "AWT chrome hidden — Compose sidebar is sole UI")
        }
        catch (t: Throwable)
        {
            Log.w(TAG, "Failed to hide AWT chrome — will retry next frame", t)
        }
    }
}
