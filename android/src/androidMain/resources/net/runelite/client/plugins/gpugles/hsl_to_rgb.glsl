vec3 hslToRgb(vec3 hsl) {
  float hue = hsl.x / 64.0f + 0.0078125f;
  float sat = hsl.y / 8.0f + 0.0625f;
  float lum = hsl.z;

  float var11 = lum / 128.0f;
  float r = var11;
  float g = var11;
  float b = var11;

  float var19;
  if (var11 < 0.5f) {
    var19 = var11 * (1.0f + sat);
  } else {
    var19 = var11 + sat - var11 * sat;
  }

  float var21 = 2.0f * var11 - var19;
  float var23 = hue + 0.3333333333333333f;
  if (var23 > 1.0f) {
    var23 -= 1.f;
  }

  float var27 = hue - 0.3333333333333333f;
  if (var27 < 0.0f) {
    var27 += 1.f;
  }

  if (6.0f * var23 < 1.0f) {
    r = var21 + (var19 - var21) * 6.0f * var23;
  } else if (2.0f * var23 < 1.0f) {
    r = var19;
  } else if (3.0f * var23 < 2.0f) {
    r = var21 + (var19 - var21) * (0.6666666666666666f - var23) * 6.0f;
  } else {
    r = var21;
  }

  if (6.0f * hue < 1.0f) {
    g = var21 + (var19 - var21) * 6.0f * hue;
  } else if (2.0f * hue < 1.0f) {
    g = var19;
  } else if (3.0f * hue < 2.0f) {
    g = var21 + (var19 - var21) * (0.6666666666666666f - hue) * 6.0f;
  } else {
    g = var21;
  }

  if (6.0f * var27 < 1.0f) {
    b = var21 + (var19 - var21) * 6.0f * var27;
  } else if (2.0f * var27 < 1.0f) {
    b = var19;
  } else if (3.0f * var27 < 2.0f) {
    b = var21 + (var19 - var21) * (0.6666666666666666f - var27) * 6.0f;
  } else {
    b = var21;
  }

  return vec3(pow(r, brightness), pow(g, brightness), pow(b, brightness));
}
