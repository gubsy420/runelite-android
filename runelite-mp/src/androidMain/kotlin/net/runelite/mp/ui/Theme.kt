package net.runelite.mp.ui

import androidx.compose.ui.graphics.Color

/**
 * Compose palette mirroring RuneLite's [net.runelite.client.ui.ColorScheme]. Kept as
 * plain values rather than a Material3 ColorScheme because the UI deliberately renders
 * its own components for parity with the in-game OSRS look — Material's defaults would
 * read as "Android app on top of OSRS" instead of "OSRS with a Compose chrome".
 */
internal object RlPalette
{
    val BrandOrange      = Color(0xFFDC8A00)
    val BrandOrangeDim   = Color(0xFF553600)
    val DarkerGray       = Color(0xFF1E1E1E)
    val DarkGray         = Color(0xFF242424)
    val MediumGray       = Color(0xFF2C2C2C)
    val Surface          = Color(0xFF1F2123)
    val SurfaceBorder    = Color(0xFFFFFFFF).copy(alpha = 0.10f)
    val DividerStrong    = Color(0xFFFFFFFF).copy(alpha = 0.35f)
    val DividerSoft      = Color(0xFFFFFFFF).copy(alpha = 0.06f)
    val TextPrimary      = Color.White
    val TextSecondary    = Color(0xFFAAAAAA)
    val TextDisabled     = Color(0xFF666666)
    val Accent           = BrandOrange
    val AccentSurface    = Color(0xFF332518)        // panel background when "active"
    val OkGreen          = Color(0xFF78D278)
    val DangerRed        = Color(0xFFFF6B6B)
}
