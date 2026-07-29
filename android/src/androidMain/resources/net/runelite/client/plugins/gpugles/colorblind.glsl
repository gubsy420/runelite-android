#define PROTAN 1
#define DEUTERAN 2
#define TRITAN 3

uniform float colorblindIntensity;

const mat3 rgb2lms = mat3(vec3(17.8824, 43.5161, 4.11935), vec3(3.45565, 27.1554, 3.86714), vec3(0.0299566, 0.184309, 1.46709));

const mat3 lms2lmsp = mat3(vec3(0.0, 2.02344, -2.52581), vec3(0.0, 1.0, 0.0), vec3(0.0, 0.0, 1.0));
const mat3 lms2lmsd = mat3(vec3(1.0, 0.0, 0.0), vec3(0.494207, 0.0, 1.24827), vec3(0.0, 0.0, 1.0));
const mat3 lms2lmst = mat3(vec3(1.0, 0.0, 0.0), vec3(0.0, 1.0, 0.0), vec3(-0.395913, 0.801109, 0.0));

const mat3 corrections = mat3(vec3(0.0, 0.0, 0.0), vec3(0.7, 1.0, 0.0), vec3(0.7, 0.0, 1.0));

vec3 colorblind(vec3 color) {
  vec3 LMS = color * rgb2lms;
  vec3 lms;

#if COLORBLIND_MODE == PROTAN
  lms = LMS * lms2lmsp;
#elif COLORBLIND_MODE == DEUTERAN
  lms = LMS * lms2lmsd;
#elif COLORBLIND_MODE == TRITAN
  lms = LMS * lms2lmst;
#else
#error 1
#endif

  mat3 lms2rgb = inverse(rgb2lms);
  vec3 error = lms * lms2rgb;

  error = (color - error);

  vec3 correction = error * corrections;
  correction *= clamp(colorblindIntensity / 100.0, 0.0, 1.0);

  correction = color + correction;
  return correction;
}
