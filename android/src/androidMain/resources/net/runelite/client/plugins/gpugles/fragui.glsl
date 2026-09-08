#version 310 es

precision highp float;
precision highp int;

#include sampling_mode
#include colorblind_mode

#define SAMPLING_NEAREST 0
#define SAMPLING_LINEAR 1

uniform sampler2D tex;
uniform ivec2 sourceDimensions;
uniform ivec2 targetDimensions;
uniform vec4 alphaOverlay;

// The scene, already rendered offscreen (and MSAA-resolved) at
// surface * resolutionScale. This pass upscales it and composites the UI over it in
// one go; it used to be a separate glBlitFramebuffer followed by a blended UI quad,
// which on a tile-based GPU meant writing the whole framebuffer out and then loading
// it straight back in so blending had a destination to read.
uniform sampler2D sceneTex;
// 0 = no scene this frame (title/login) — UI over black.
// 1 = composite sceneTex under the UI, blending off, we own every pixel.
// 2 = the scene FBO couldn't be allocated and the scene went straight to the default
//     framebuffer; emit the UI unmodified and let fixed-function blending do the work.
uniform int hasScene;

#if COLORBLIND_MODE > 0
#include "colorblind.glsl"
#endif

in vec2 TexCoord;
out vec4 FragColor;

vec4 alphaBlend(vec4 src, vec4 dst) {
  return vec4(src.rgb + dst.rgb * (1.0f - src.a), src.a + dst.a * (1.0f - src.a));
}

void main() {
  vec4 c = texture(tex, TexCoord);
  // BufferProvider gives us ARGB-packed ints in native (little-endian) byte
  // order, which lands as B,G,R,A bytes in memory. GLES 3.10 doesn't expose
  // GL_BGRA on standard ES, so glTexSubImage2D reads them as RGBA → red and
  // blue come out swapped, giving the whole UI a blue tint. Swizzle here:
  // one ALU per fragment beats per-pixel byte shuffling on the CPU side.
  c = c.bgra;
  if (alphaOverlay.a > 0.0f) {
    c = alphaBlend(c, alphaOverlay);
  }
#if COLORBLIND_MODE > 0
  c.rgb = colorblind(c.rgb);
#endif

  if (hasScene == 2) {
    FragColor = c;
    return;
  }

  vec3 scene = vec3(0.0f);
  if (hasScene == 1) {
    // TexCoord is Y-flipped to suit the top-down BufferProvider image; the scene texture
    // is a bottom-up GL render, so flip it back. textureLod rather than texture(): the
    // scene texture has no mip chain, so level 0 is what would be picked anyway, and it
    // keeps the fetch free of any implicit-derivative rule inside this branch.
    scene = textureLod(sceneTex, vec2(TexCoord.x, 1.0f - TexCoord.y), 0.0f).rgb;
  }

  // Exactly what GL_ONE / GL_ONE_MINUS_SRC_ALPHA used to compute against the blitted
  // scene. Alpha is forced to 1 because the old path ended up there too: the scene was
  // cleared opaque and the blend left dst.a at 1.
  FragColor = vec4(c.rgb + scene * (1.0f - c.a), 1.0f);
}
