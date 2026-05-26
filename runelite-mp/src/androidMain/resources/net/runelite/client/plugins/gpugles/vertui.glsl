// UI overlay pass — full-screen quad with the patched client's 2D framebuffer
// (chat, inventory, minimap) as a texture, sampled and blitted by fragui.
// Ported from net.runelite.client.plugins.gpu.vertui.glsl for GLSL ES 3.10.
// The XBR/hybrid samplers from desktop aren't ported in this pass — we always
// use LINEAR sampling, which is what GLES drivers handle natively via the
// texture filter. SAMPLING_MODE remains in place to keep the include shape
// the same, but only NEAREST/LINEAR branches matter.
#version 310 es

precision highp float;
precision highp int;

#include sampling_mode

#define SAMPLING_NEAREST 0
#define SAMPLING_LINEAR 1

uniform ivec2 sourceDimensions;
uniform ivec2 targetDimensions;

layout(location = 0) in vec3 aPos;
layout(location = 1) in vec2 aTexCoord;

out vec2 TexCoord;

void main() {
  gl_Position = vec4(aPos, 1.0);
  TexCoord = aTexCoord;
}
