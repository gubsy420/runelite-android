use crate::{CLEAR, SRC, SRC_OVER};
use jni::sys::jint;

/// Fill an axis-aligned rectangle on an ARGB int[] buffer. The buffer's row stride is
/// img_w; coordinates are clipped to [0, img_w) × [0, img_h).
pub fn fill_rect(
    buf: &mut [i32],
    img_w: jint,
    img_h: jint,
    x: jint,
    y: jint,
    w: jint,
    h: jint,
    argb: jint,
    composite_rule: jint,
) {
    let (x0, y0, x1, y1) = clamp_rect(img_w, img_h, x, y, w, h);
    if x0 >= x1 || y0 >= y1 {
        return;
    }
    let stride = img_w as usize;
    match composite_rule {
        SRC => {
            for row in y0..y1 {
                let off = row as usize * stride;
                for col in x0..x1 {
                    buf[off + col as usize] = argb;
                }
            }
        }
        CLEAR => {
            for row in y0..y1 {
                let off = row as usize * stride;
                for col in x0..x1 {
                    buf[off + col as usize] = 0;
                }
            }
        }
        _ => {
            // Default to SRC_OVER for any unrecognised rule.
            let _ = composite_rule == SRC_OVER;
            for row in y0..y1 {
                let off = row as usize * stride;
                for col in x0..x1 {
                    let dst = buf[off + col as usize] as u32;
                    buf[off + col as usize] = src_over(argb as u32, dst) as i32;
                }
            }
        }
    }
}

#[inline]
pub fn src_over(src: u32, dst: u32) -> u32 {
    let sa = (src >> 24) & 0xFF;
    if sa == 0xFF {
        return src;
    }
    if sa == 0 {
        return dst;
    }
    let sr = (src >> 16) & 0xFF;
    let sg = (src >> 8) & 0xFF;
    let sb = src & 0xFF;
    let da = (dst >> 24) & 0xFF;
    let dr = (dst >> 16) & 0xFF;
    let dg = (dst >> 8) & 0xFF;
    let db = dst & 0xFF;

    // Standard AWT BufferedImage pixels are NON-premultiplied (each colour component is
    // full 0..255 regardless of alpha). The Porter-Duff SrcOver formula for that is:
    //   out.rgb = src.rgb * src.alpha + dst.rgb * (255 - src.alpha) * dst.alpha / 255
    // Treating dst as opaque (our canvas is effectively opaque after GameViewport's
    // alpha mask) collapses the second term's dst.alpha factor — but we still need to
    // multiply src.rgb by src.alpha, otherwise a half-translucent overlay adds the
    // full src colour to a scaled dst and overflows the byte range. That's what
    // produced the rainbow noise on translucent overlays.
    let inv = 255 - sa;
    let out_a = sa + (da * inv + 127) / 255;
    let out_r = (sr * sa + dr * inv + 127) / 255;
    let out_g = (sg * sa + dg * inv + 127) / 255;
    let out_b = (sb * sa + db * inv + 127) / 255;
    (out_a << 24) | (out_r << 16) | (out_g << 8) | out_b
}

#[inline]
pub fn clamp_rect(img_w: jint, img_h: jint, x: jint, y: jint, w: jint, h: jint) -> (jint, jint, jint, jint) {
    let x0 = x.max(0).min(img_w);
    let y0 = y.max(0).min(img_h);
    let x1 = (x + w).max(0).min(img_w);
    let y1 = (y + h).max(0).min(img_h);
    (x0, y0, x1, y1)
}
