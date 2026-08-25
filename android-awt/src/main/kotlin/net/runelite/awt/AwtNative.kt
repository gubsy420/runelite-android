package net.runelite.awt

/**
 * Native side of the AWT shim — every JNI entry point used by the pure-Java shadow
 * classes lives here in a single Kotlin object so the symbol layout is predictable
 * from the Rust crate.
 *
 * Pixel buffers are always int[] in canonical ARGB packing (0xAARRGGBB). The Rust side
 * pins them via GetPrimitiveArrayCritical for the duration of one call — no escape, no
 * outstanding references after return.
 */
object AwtNative {
    init {
        AwtCompat.ensureReady()
    }

    @JvmStatic external fun fillRect(
        pixels: IntArray, imgW: Int, imgH: Int,
        x: Int, y: Int, w: Int, h: Int,
        argb: Int, compositeRule: Int,
    )

    @JvmStatic external fun fillOval(
        pixels: IntArray, imgW: Int, imgH: Int,
        x: Int, y: Int, w: Int, h: Int,
        argb: Int, compositeRule: Int,
    )

    @JvmStatic external fun drawOval(
        pixels: IntArray, imgW: Int, imgH: Int,
        x: Int, y: Int, w: Int, h: Int,
        argb: Int,
    )

    @JvmStatic external fun fillRoundRect(
        pixels: IntArray, imgW: Int, imgH: Int,
        x: Int, y: Int, w: Int, h: Int,
        arcW: Int, arcH: Int,
        argb: Int, compositeRule: Int,
    )

    @JvmStatic external fun drawLine(
        pixels: IntArray, imgW: Int, imgH: Int,
        x0: Int, y0: Int, x1: Int, y1: Int,
        argb: Int,
    )

    @JvmStatic external fun fillPolygon(
        pixels: IntArray, imgW: Int, imgH: Int,
        xs: IntArray, ys: IntArray, n: Int,
        tx: Int, ty: Int,
        argb: Int, compositeRule: Int,
    )

    @JvmStatic external fun copyArea(
        pixels: IntArray, imgW: Int, imgH: Int,
        x: Int, y: Int, w: Int, h: Int,
        dstX: Int, dstY: Int,
    )

    @JvmStatic external fun blit(
        src: IntArray, srcW: Int, srcH: Int, sx: Int, sy: Int, sw: Int, sh: Int,
        dst: IntArray, dstW: Int, dstH: Int, dx: Int, dy: Int, dw: Int, dh: Int,
        compositeRule: Int, alpha: Float,
    )
}

