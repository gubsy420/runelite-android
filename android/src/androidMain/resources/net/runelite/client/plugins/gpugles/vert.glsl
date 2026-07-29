#version 310 es

precision highp float;
precision highp int;
precision highp sampler2DArray;

//#define ZBUF_DEBUG
//#define BIAS_DEBUG

#include texture_config

#define TEXTURE_ANIM_UNIT (1.0f / 128.0f)
#define TILE_SIZE 128.f

// Explicit float() casts on the int side — GLES 3.10 (Adreno) won't do
// implicit int→float promotion in expressions like int * float, even though
// the desktop GLSL 330 compiler accepted it.
#define FOG_SCENE_EDGE_MIN (float(-expandedMapLoadingChunks * 8 + 1) * TILE_SIZE)
#define FOG_SCENE_EDGE_MAX (float(104 + expandedMapLoadingChunks * 8 - 1) * TILE_SIZE)
#define FOG_CORNER_ROUNDING 1.5
#define FOG_CORNER_ROUNDING_SQUARED (FOG_CORNER_ROUNDING * FOG_CORNER_ROUNDING)

layout(location = 0) in vec3 vertf;
layout(location = 1) in int abhsl;
layout(location = 2) in ivec4 tex;

layout(std140) uniform uniforms {
  float cameraYaw;
  float cameraPitch;
  float cameraX;
  float cameraY;
  float cameraZ;
};

uniform mat4 worldProj;
uniform mat4 entityProj;
uniform ivec4 entityTint;
uniform float brightness;
uniform int useFog;
uniform int fogDepth;
uniform int drawDistance;
uniform int expandedMapLoadingChunks;
uniform ivec3 base;
uniform int tick;
uniform vec2 textureAnimations[TEXTURE_COUNT];

out vec4 fColor;
centroid out float fHsl;
flat out int fTextureId;
out vec2 fUv;
out float fFogAmount;
#ifdef ZBUF_DEBUG
out float fDepth;
#endif

#include "hsl_to_rgb.glsl"

float fogFactorLinear(const float dist, const float start, const float end) {
  return 1.0 - clamp((dist - start) / (end - start), 0.0, 1.0);
}

void main() {
  vec4 vert = vec4(vertf + vec3(base), 1);
  float a = float(abhsl >> 24 & 0xff) / 255.f;
  int bias = (abhsl >> 16) & 0xff;

  // Explicit float() per-arg. Adreno accepts implicit int→float in vec3 constructors
  // even though the GLSL ES 3.10 spec is ambiguous about chained int bitops inside one;
  // Mali (G52/G68/G610) drivers reject it and emit nothing for the shader → black game
  // viewport. Costs nothing and stays portable.
  vec3 hsl = vec3(float(abhsl >> 10 & 63), float(abhsl >> 7 & 7), float(abhsl & 127));
  hsl += ((vec3(entityTint.xyz) - hsl) * float(entityTint.w)) / 128.0;
  vec3 rgb = hslToRgb(hsl);

  vec4 worldPos = entityProj * vert;
  vec4 screenPos = worldProj * worldPos;
#ifdef ZBUF_DEBUG
  fDepth = screenPos.z / screenPos.w;
#endif
  // bias on desktop's reverse-Z adds → nudges toward near (larger z_ndc).
  // We use standard depth instead, where near = small z_ndc; subtract for the
  // same "push toward camera" effect that floor-decals etc. rely on.
  screenPos.z -= float(bias) / 128.0;
  gl_Position = screenPos;
#ifdef BIAS_DEBUG
  fColor = vec4(float(clamp(bias, 0, 12)) / 12.0, 0.0, 0.0, 1.0);
#else
  fColor = vec4(rgb, 1.f - a);
#endif

  fTextureId = tex.x;
  fUv = vec2(float(tex.y) / 256.f, float(tex.z) / 256.f);
  if (fTextureId > 0) {
    vec2 textureAnim = textureAnimations[min(fTextureId - 1, TEXTURE_COUNT - 1)];
    fUv += float(tick) * textureAnim * TEXTURE_ANIM_UNIT;
    fHsl = float(abhsl & 0xffff);
  } else {
    fHsl = float(((int(hsl[0]) & 63) << 10) | ((int(hsl[1]) & 7) << 7) | (int(hsl[2]) & 127));
  }

  float fogWest = max(FOG_SCENE_EDGE_MIN, cameraX - float(drawDistance));
  float fogEast = min(FOG_SCENE_EDGE_MAX, cameraX + float(drawDistance));
  float fogSouth = max(FOG_SCENE_EDGE_MIN, cameraZ - float(drawDistance));
  float fogNorth = min(FOG_SCENE_EDGE_MAX, cameraZ + float(drawDistance));

  float xDist = min(worldPos.x - fogWest, fogEast - worldPos.x);
  float zDist = min(worldPos.z - fogSouth, fogNorth - worldPos.z);
  float nearestEdgeDistance = min(xDist, zDist);
  float secondNearestEdgeDistance = max(xDist, zDist);
  float fogDistance =
      nearestEdgeDistance - FOG_CORNER_ROUNDING * TILE_SIZE *
                                max(0.f, (nearestEdgeDistance + FOG_CORNER_ROUNDING_SQUARED) / (secondNearestEdgeDistance + FOG_CORNER_ROUNDING_SQUARED));

  fFogAmount = fogFactorLinear(fogDistance, 0.f, float(fogDepth) * TILE_SIZE) * float(useFog);
}
