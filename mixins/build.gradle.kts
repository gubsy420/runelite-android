/*
 * mixins — Java 1.8 source that the `injector` module weaves into the obfuscated jar.
 *
 * Constraints:
 *   - Source level 1.8 (the obfuscated client targets 8; mixed-version bytecode at the
 *     class level would fail the verifier when methods from both meet at a class file).
 *   - NO lambdas / method references. The obfuscator-emitted gamepack doesn't carry the
 *     LambdaMetafactory bootstrap classes we'd need at runtime, and the Android d8
 *     pipeline already chokes on indys in the rest of the codebase — we don't want to
 *     introduce new ones from mixins. Use anonymous inner classes instead.
 *   - No reflection-only features; mixins should compile to vanilla 8-era bytecode.
 *
 * The annotations this module declares (Mixin / Inject / etc.) are RetentionPolicy.RUNTIME
 * so the injector can read them off the compiled .class files at weave time.
 */
plugins {
    java
}

dependencies {
    // Mixins target classes whose obfuscated-name signatures live in runescape-client
    // (so a `@Mixin(targetClass = client.class)` literal resolves at compile time).
    // Compile-only — the injector pulls the obfuscated equivalents from the target jar
    // at weave time; mixin bytecode shouldn't ship a hard runtime ref to the deobf names.
    compileOnly(project(":runescape-client"))
    // runelite-api types (Widget, Client, Player, ...) — implemented by mixins that expose
    // a runtime-facing surface for plugins.
    implementation("net.runelite:runelite-api:${project.version}")
    // Test sourceSet mirrors main so the deliberately-bad mixins under src/test/java/
    // can reference the same default-package types and runelite-api annotations.
    testCompileOnly(project(":runescape-client"))
    testImplementation("net.runelite:runelite-api:${project.version}")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(11))
    }
    // NB: don't set sourceCompatibility / targetCompatibility — those become Gradle
    // resolution attributes that conflict with the JVM-11 runelite-api dependency.
    // The compileJava options.release = 8 below still pins the EMITTED bytecode to
    // 1.8, which is what actually matters for "no lambdas, no condy" compatibility
    // with the obfuscated gamepack.
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
    // common.settings.gradle.kts sets options.release = 11 on every JavaCompile task —
    // we need to override that BEFORE supplying our own -source/-target flags (which
    // javac rejects together with --release). Clear release first.
    options.release.set(null as Int?)
    options.compilerArgs.addAll(listOf(
        "-source", "1.8",
        "-target", "1.8",
        "-Xlint:-options",
    ))
}
