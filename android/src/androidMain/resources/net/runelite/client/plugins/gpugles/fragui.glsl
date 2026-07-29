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
  c = alphaBlend(c, alphaOverlay);
#if COLORBLIND_MODE > 0
  c.rgb = colorblind(c.rgb);
#endif
  FragColor = c;
}
