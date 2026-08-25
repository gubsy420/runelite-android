use crate::fill::plot_span;
use jni::sys::jint;

/// Scanline fill for an arbitrary polygon. Uses the even-odd rule.
/// Accepts tx/ty device-space translation offsets so the Java caller doesn't
/// need to allocate transformed int[] arrays for every polygon draw.
pub fn fill_polygon(
    buf: &mut [i32],
    img_w: jint,
    img_h: jint,
    xs: &[i32],
    ys: &[i32],
    n: jint,
    tx: jint,
    ty: jint,
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
        let y = ys[i] + ty;
        if y < min_y {
            min_y = y;
        }
        if y > max_y {
            max_y = y;
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
            let yi = ys[i] + ty;
            let yj = ys[j] + ty;
            let xi = xs[i] + tx;
            let xj = xs[j] + tx;
            if (yi < y && yj >= y) || (yj < y && yi >= y) {
                let x_cross = xi + ((y - yi) * (xj - xi)) / (yj - yi);
                nodes.push(x_cross);
            }
            j = i;
        }
        nodes.sort_unstable();

        let mut k = 0;
        while k + 1 < nodes.len() {
            let x0 = nodes[k];
            let x1 = nodes[k + 1];
            plot_span(buf, stride, y, x0, x1, img_w, img_h, argb, composite_rule);
            k += 2;
        }
    }
}

