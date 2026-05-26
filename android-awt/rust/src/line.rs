use crate::fill::src_over;
use jni::sys::jint;

/// Bresenham line on an int[] buffer. Out-of-bounds pixels are skipped.
///
/// Each pixel is composited with src_over so translucent stroke colours blend with
/// what's underneath. Earlier this was a raw `buf[..] = argb` overwrite, which made
/// translucent overlay outlines (agility clickbox borders etc.) render as solid
/// outline colour rather than blending with the scene — since the viewport ignores
/// alpha bits at display time, an `argb` int with `alpha < 255` just shows its RGB.
/// For fully-opaque strokes `sa==255` hits src_over's fast path so cost is unchanged.
pub fn draw_line(
    buf: &mut [i32],
    img_w: jint,
    img_h: jint,
    x0: jint,
    y0: jint,
    x1: jint,
    y1: jint,
    argb: jint,
) {
    let mut x = x0;
    let mut y = y0;
    let dx = (x1 - x0).abs();
    let dy = -(y1 - y0).abs();
    let sx = if x0 < x1 { 1 } else { -1 };
    let sy = if y0 < y1 { 1 } else { -1 };
    let mut err = dx + dy;
    let stride = img_w as usize;
    let src = argb as u32;

    loop {
        if x >= 0 && x < img_w && y >= 0 && y < img_h {
            let idx = y as usize * stride + x as usize;
            buf[idx] = src_over(src, buf[idx] as u32) as i32;
        }
        if x == x1 && y == y1 {
            break;
        }
        let e2 = err * 2;
        if e2 >= dy {
            if x == x1 {
                break;
            }
            err += dy;
            x += sx;
        }
        if e2 <= dx {
            if y == y1 {
                break;
            }
            err += dx;
            y += sy;
        }
    }
}
