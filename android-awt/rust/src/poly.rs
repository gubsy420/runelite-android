use crate::fill::src_over;
use crate::{CLEAR, SRC};
use jni::sys::jint;

/// Scanline fill for an arbitrary polygon. Uses the even-odd rule.
pub fn fill_polygon(
    buf: &mut [i32],
    img_w: jint,
    img_h: jint,
    xs: &[i32],
    ys: &[i32],
    n: jint,
    argb: jint,
    composite_rule: jint,
) {
    let n = n.min(xs.len() as i32).min(ys.len() as i32);
    if n < 3 {
        return;
    }
    let mut min_y = i32::MAX;
    let mut max_y = i32::MIN;
    for i in 0..n as usize {
        if ys[i] < min_y {
            min_y = ys[i];
        }
        if ys[i] > max_y {
            max_y = ys[i];
        }
    }
    let y_start = min_y.max(0);
    let y_end = (max_y + 1).min(img_h);
    if y_start >= y_end {
        return;
    }

    let stride = img_w as usize;
    let mut nodes: Vec<i32> = Vec::with_capacity(n as usize);

    for y in y_start..y_end {
        nodes.clear();
        let mut j = (n - 1) as usize;
        for i in 0..n as usize {
            let yi = ys[i];
            let yj = ys[j];
            let xi = xs[i];
            let xj = xs[j];
            if (yi < y && yj >= y) || (yj < y && yi >= y) {
                let x_cross = xi + ((y - yi) * (xj - xi)) / (yj - yi);
                nodes.push(x_cross);
            }
            j = i;
        }
        nodes.sort();

        let mut k = 0;
        while k + 1 < nodes.len() {
            let x0 = nodes[k].max(0);
            let x1 = nodes[k + 1].min(img_w);
            if x0 < x1 {
                let off = y as usize * stride;
                match composite_rule {
                    SRC => {
                        for col in x0..x1 {
                            buf[off + col as usize] = argb;
                        }
                    }
                    CLEAR => {
                        for col in x0..x1 {
                            buf[off + col as usize] = 0;
                        }
                    }
                    _ => {
                        for col in x0..x1 {
                            let dst = buf[off + col as usize] as u32;
                            buf[off + col as usize] = src_over(argb as u32, dst) as i32;
                        }
                    }
                }
            }
            k += 2;
        }
    }
}
