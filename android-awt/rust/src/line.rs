use jni::sys::jint;

/// Bresenham line on an int[] buffer. Out-of-bounds pixels are skipped.
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

    loop {
        if x >= 0 && x < img_w && y >= 0 && y < img_h {
            buf[y as usize * stride + x as usize] = argb;
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
