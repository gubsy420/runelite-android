//! runelite-awt-native — JNI side of the AWT compatibility shim.
//!
//! Every entry point declared in `net.runelite.awt.AwtNative` lives here. Pixel buffers
//! arrive as `int[]` in canonical ARGB packing (`0xAARRGGBB`) and are pinned for the
//! duration of one call via the JNI critical-section API for zero-copy access.

use jni::objects::{JClass, JIntArray, JString, ReleaseMode};
use jni::sys::{jfloat, jint};
use jni::JNIEnv;

mod blit;
mod fill;
mod line;
mod poly;

#[cfg(target_os = "android")]
fn init_android_log() {
    use android_logger::Config;
    use log::LevelFilter;
    android_logger::init_once(
        Config::default()
            .with_max_level(LevelFilter::Info)
            .with_tag("runelite-awt"),
    );
}

#[cfg(not(target_os = "android"))]
fn init_android_log() {}

#[no_mangle]
pub extern "system" fn Java_net_runelite_awt_AwtCompat_setNativeEnv<'local>(
    mut env: JNIEnv<'local>,
    _class: JClass<'local>,
    key: JString<'local>,
    value: JString<'local>,
) -> jint {
    let key_str: String = match env.get_string(&key) {
        Ok(s) => s.into(),
        Err(_) => return -1,
    };
    let value_str: String = match env.get_string(&value) {
        Ok(s) => s.into(),
        Err(_) => return -1,
    };

    #[cfg(unix)]
    {
        let c_key = match std::ffi::CString::new(key_str) {
            Ok(c) => c,
            Err(_) => return -1,
        };
        let c_val = match std::ffi::CString::new(value_str) {
            Ok(c) => c,
            Err(_) => return -1,
        };
        // Safety: setenv changes the global environment array which is not thread-safe.
        // Call this as early as possible during application startup.
        unsafe { libc::setenv(c_key.as_ptr(), c_val.as_ptr(), 1) }
    }
    #[cfg(not(unix))]
    {
        std::env::set_var(key_str, value_str);
        0
    }
}

#[no_mangle]
pub extern "system" fn Java_net_runelite_awt_AwtCompat_nativeAbiVersion<'local>(
    _env: JNIEnv<'local>,
    _class: JClass<'local>,
) -> jint {
    init_android_log();
    log::info!("runelite-awt-native loaded");
    NATIVE_ABI_VERSION
}

const NATIVE_ABI_VERSION: jint = 1;

// ---------- AlphaComposite rules (kept in sync with java.awt.AlphaComposite) ----------
pub const CLEAR: jint = 1;
pub const SRC: jint = 2;
pub const SRC_OVER: jint = 3;
pub const DST_OVER: jint = 4;
pub const SRC_IN: jint = 5;
pub const DST_IN: jint = 6;
pub const SRC_OUT: jint = 7;
pub const DST_OUT: jint = 8;
pub const DST: jint = 9;
pub const SRC_ATOP: jint = 10;
pub const DST_ATOP: jint = 11;
pub const XOR: jint = 12;

/// Pin an int[] for the duration of a closure. The array is released back to the JVM
/// when the wrapper drops; we always commit so the caller sees mutations.
fn with_pinned_array<F, R>(
    env: &mut JNIEnv<'_>,
    array: &JIntArray<'_>,
    mode: ReleaseMode,
    f: F,
) -> Option<R>
where
    F: FnOnce(&mut [i32]) -> R,
{
    let len = env.get_array_length(array).ok()?;
    if len <= 0 {
        return None;
    }
    let elements = unsafe { env.get_array_elements(array, mode).ok()? };
    let slice = unsafe { std::slice::from_raw_parts_mut(elements.as_ptr(), elements.len()) };
    Some(f(slice))
}

/// Pin a read-only source and a writable destination int[] simultaneously for one
/// closure. The source is released `NoCopyBack` (we never mutate it, so there is
/// nothing to commit and — crucially — no whole-array copy on the way in/out like
/// `read_int_array` does); the destination is committed `CopyBack`.
///
/// SAFETY: the caller must ensure `src` and `dst` are *distinct* Java arrays. Pinning
/// the same backing store as both `&[i32]` and `&mut [i32]` aliases it, which is UB —
/// `Java_..._blit` guards this with `is_same_object` and falls back to a copy.
fn with_src_dst_pinned<F, R>(
    env: &mut JNIEnv<'_>,
    src: &JIntArray<'_>,
    dst: &JIntArray<'_>,
    f: F,
) -> Option<R>
where
    F: FnOnce(&[i32], &mut [i32]) -> R,
{
    if env.get_array_length(src).ok()? <= 0 || env.get_array_length(dst).ok()? <= 0 {
        return None;
    }
    let src_elems = unsafe { env.get_array_elements(src, ReleaseMode::NoCopyBack).ok()? };
    let dst_elems = unsafe { env.get_array_elements(dst, ReleaseMode::CopyBack).ok()? };
    let src_slice = unsafe { std::slice::from_raw_parts(src_elems.as_ptr(), src_elems.len()) };
    let dst_slice = unsafe { std::slice::from_raw_parts_mut(dst_elems.as_ptr(), dst_elems.len()) };
    Some(f(src_slice, dst_slice))
}

#[no_mangle]
pub extern "system" fn Java_net_runelite_awt_AwtNative_fillRect<'local>(
    mut env: JNIEnv<'local>,
    _class: JClass<'local>,
    pixels: JIntArray<'local>,
    img_w: jint,
    img_h: jint,
    x: jint,
    y: jint,
    w: jint,
    h: jint,
    argb: jint,
    composite_rule: jint,
) {
    let _ = with_pinned_array(&mut env, &pixels, ReleaseMode::CopyBack, |buf| {
        fill::fill_rect(buf, img_w, img_h, x, y, w, h, argb, composite_rule);
    });
}

#[no_mangle]
pub extern "system" fn Java_net_runelite_awt_AwtNative_fillOval<'local>(
    mut env: JNIEnv<'local>,
    _class: JClass<'local>,
    pixels: JIntArray<'local>,
    img_w: jint,
    img_h: jint,
    x: jint,
    y: jint,
    w: jint,
    h: jint,
    argb: jint,
    composite_rule: jint,
) {
    let _ = with_pinned_array(&mut env, &pixels, ReleaseMode::CopyBack, |buf| {
        fill::fill_oval(buf, img_w, img_h, x, y, w, h, argb, composite_rule);
    });
}

#[no_mangle]
pub extern "system" fn Java_net_runelite_awt_AwtNative_drawOval<'local>(
    mut env: JNIEnv<'local>,
    _class: JClass<'local>,
    pixels: JIntArray<'local>,
    img_w: jint,
    img_h: jint,
    x: jint,
    y: jint,
    w: jint,
    h: jint,
    argb: jint,
) {
    let _ = with_pinned_array(&mut env, &pixels, ReleaseMode::CopyBack, |buf| {
        fill::draw_oval(buf, img_w, img_h, x, y, w, h, argb);
    });
}

#[no_mangle]
pub extern "system" fn Java_net_runelite_awt_AwtNative_fillRoundRect<'local>(
    mut env: JNIEnv<'local>,
    _class: JClass<'local>,
    pixels: JIntArray<'local>,
    img_w: jint,
    img_h: jint,
    x: jint,
    y: jint,
    w: jint,
    h: jint,
    arc_w: jint,
    arc_h: jint,
    argb: jint,
    composite_rule: jint,
) {
    let _ = with_pinned_array(&mut env, &pixels, ReleaseMode::CopyBack, |buf| {
        fill::fill_round_rect(buf, img_w, img_h, x, y, w, h, arc_w, arc_h, argb, composite_rule);
    });
}

#[no_mangle]
pub extern "system" fn Java_net_runelite_awt_AwtNative_drawLine<'local>(
    mut env: JNIEnv<'local>,
    _class: JClass<'local>,
    pixels: JIntArray<'local>,
    img_w: jint,
    img_h: jint,
    x0: jint,
    y0: jint,
    x1: jint,
    y1: jint,
    argb: jint,
) {
    let _ = with_pinned_array(&mut env, &pixels, ReleaseMode::CopyBack, |buf| {
        line::draw_line(buf, img_w, img_h, x0, y0, x1, y1, argb);
    });
}

#[no_mangle]
pub extern "system" fn Java_net_runelite_awt_AwtNative_fillPolygon<'local>(
    mut env: JNIEnv<'local>,
    _class: JClass<'local>,
    pixels: JIntArray<'local>,
    img_w: jint,
    img_h: jint,
    xs: JIntArray<'local>,
    ys: JIntArray<'local>,
    n: jint,
    tx: jint,
    ty: jint,
    argb: jint,
    composite_rule: jint,
) {
    if n < 3 {
        return;
    }
    let xs_elems = unsafe { env.get_array_elements(&xs, ReleaseMode::NoCopyBack).ok() };
    let ys_elems = unsafe { env.get_array_elements(&ys, ReleaseMode::NoCopyBack).ok() };
    if let (Some(xs_e), Some(ys_e)) = (xs_elems, ys_elems) {
        let xs_slice = unsafe { std::slice::from_raw_parts(xs_e.as_ptr(), xs_e.len()) };
        let ys_slice = unsafe { std::slice::from_raw_parts(ys_e.as_ptr(), ys_e.len()) };
        let _ = with_pinned_array(&mut env, &pixels, ReleaseMode::CopyBack, |buf| {
            poly::fill_polygon(buf, img_w, img_h, xs_slice, ys_slice, n, tx, ty, argb, composite_rule);
        });
    }
}

#[no_mangle]
pub extern "system" fn Java_net_runelite_awt_AwtNative_copyArea<'local>(
    mut env: JNIEnv<'local>,
    _class: JClass<'local>,
    pixels: JIntArray<'local>,
    img_w: jint,
    img_h: jint,
    x: jint,
    y: jint,
    w: jint,
    h: jint,
    dst_x: jint,
    dst_y: jint,
) {
    let _ = with_pinned_array(&mut env, &pixels, ReleaseMode::CopyBack, |buf| {
        blit::copy_area(buf, img_w, img_h, x, y, w, h, dst_x, dst_y);
    });
}

#[no_mangle]
pub extern "system" fn Java_net_runelite_awt_AwtNative_blit<'local>(
    mut env: JNIEnv<'local>,
    _class: JClass<'local>,
    src: JIntArray<'local>,
    src_w: jint,
    src_h: jint,
    sx: jint,
    sy: jint,
    sw: jint,
    sh: jint,
    dst: JIntArray<'local>,
    dst_w: jint,
    dst_h: jint,
    dx: jint,
    dy: jint,
    dw: jint,
    dh: jint,
    composite_rule: jint,
    alpha: jfloat,
) {
    let distinct = !env.is_same_object(&src, &dst).unwrap_or(true);
    if distinct {
        let _ = with_src_dst_pinned(&mut env, &src, &dst, |src_buf, dst_buf| {
            blit::blit(
                src_buf, src_w, src_h, sx, sy, sw, sh,
                dst_buf, dst_w, dst_h, dx, dy, dw, dh,
                composite_rule, alpha,
            );
        });
        return;
    }

    let Some(src_vec) = read_int_array(&mut env, &src) else { return };
    let _ = with_pinned_array(&mut env, &dst, ReleaseMode::CopyBack, |dst_buf| {
        blit::blit(
            &src_vec, src_w, src_h, sx, sy, sw, sh,
            dst_buf, dst_w, dst_h, dx, dy, dw, dh,
            composite_rule, alpha,
        );
    });
}

fn read_int_array(env: &mut JNIEnv<'_>, array: &JIntArray<'_>) -> Option<Vec<i32>> {
    let len = env.get_array_length(array).ok()?;
    if len <= 0 {
        return Some(Vec::new());
    }
    let mut out = vec![0i32; len as usize];
    env.get_int_array_region(array, 0, &mut out).ok()?;
    Some(out)
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_fill_rect_and_oval() {
        let mut buf = vec![0i32; 100 * 100];
        fill::fill_rect(&mut buf, 100, 100, 10, 10, 20, 20, 0xFF112233u32 as i32, SRC);
        assert_eq!(buf[10 * 100 + 10], 0xFF112233u32 as i32);
        assert_eq!(buf[29 * 100 + 29], 0xFF112233u32 as i32);
        assert_eq!(buf[30 * 100 + 30], 0);

        fill::fill_oval(&mut buf, 100, 100, 40, 40, 20, 20, 0xFF445566u32 as i32, SRC);
        // Center of circle at (50, 50)
        assert_eq!(buf[50 * 100 + 50], 0xFF445566u32 as i32);
    }

    #[test]
    fn test_fill_polygon_with_translation() {
        let mut buf = vec![0i32; 100 * 100];
        let xs = [0, 20, 20, 0];
        let ys = [0, 0, 20, 20];
        poly::fill_polygon(&mut buf, 100, 100, &xs, &ys, 4, 10, 10, 0xFFAABBCCu32 as i32, SRC);
        assert_eq!(buf[15 * 100 + 15], 0xFFAABBCCu32 as i32);
        assert_eq!(buf[5 * 100 + 5], 0);
    }

    #[test]
    fn test_copy_area_no_alloc() {
        let mut buf = vec![0i32; 100 * 100];
        buf[10 * 100 + 10] = 0x12345678;
        blit::copy_area(&mut buf, 100, 100, 10, 10, 5, 5, 20, 20);
        assert_eq!(buf[20 * 100 + 20], 0x12345678);
    }
}

