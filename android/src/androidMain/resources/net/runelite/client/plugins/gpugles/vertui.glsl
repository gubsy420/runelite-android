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
