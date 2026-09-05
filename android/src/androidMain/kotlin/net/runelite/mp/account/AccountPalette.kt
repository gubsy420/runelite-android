package net.runelite.mp.account

import androidx.compose.ui.graphics.Color

/**
 * RuneLite palette for the pre-boot account screens.
 *
 * Kept separate from [net.runelite.mp.ui.RlPalette]: everything under this package
 * renders *before* RuneLite's injector boots and the chrome mounts, so it must not
 * depend on anything that pulls the client's UI classes onto the classpath early.
 */
internal val BgDarker = Color(0xFF111111)
internal val CardBg = Color(0xFF1E1E1E)
internal val SurfaceBorder = Color(0xFF3A3A3A)
internal val MediumGray = Color(0xFF3C3C3C)
internal val BrandOrange = Color(0xFFDC8A00)
internal val TextSecondary = Color(0xFFB0B0B0)
internal val TextDisabled = Color(0xFF707070)
