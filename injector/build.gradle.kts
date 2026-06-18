/*
 * injector — Kotlin/JVM bytecode weaver.
 *
 * Reads three inputs:
 *   1. Target jar  — the obfuscated, lambda-fixed OSRS gamepack (the same jar
 *      `runelite-mp` currently consumes via `desugarStringConcat`).
 *   2. Mixin jar  — the `:mixins` module's compiled classes (Java 1.8 bytecode).
 *   3. Reference  — the `:runescape-client` module's compiled classes, used to resolve
 *      mixin annotation values (e.g. `@Mixin(client.class)`) back to the obfuscated
 *      internal name.
 *
 * Produces:
 *   - Output jar: target jar with mixin classes' members injected/replaced/shadowed
 *     per the annotations, ready to feed back into the existing `desugarStringConcat`
 *     and `desugarLambdas` tasks downstream.
 */
plugins {
    // The Kotlin plugin is already on the build classpath via runelite-mp's
    // kotlin-multiplatform alias, so we apply by id without a version here.
    id("org.jetbrains.kotlin.jvm")
    application
}

dependencies {
    implementation(libs.asm.core)
    implementation(libs.asm.tree)
    implementation(libs.asm.commons)
    implementation(libs.asm.util)
    implementation(project(":runescape-client"))
    implementation(project(":mixins"))
    implementation("net.runelite:runelite-api:${project.version}")
    implementation(libs.slf4j.api)
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(11))
    }
}

kotlin {
    jvmToolchain(11)
}

application {
    mainClass.set("net.runelite.injector.Injector")
}

// Convenience task: run with sensible defaults pointing at the jar runelite-mp currently uses.
// Smoke task for validation: points the injector at the deliberately-bad mixin classes
// under :mixins's test sourceSet. Expected to fail with the validator's aggregated
// report — `./gradlew :injector:injectBad 2>&1 | grep "•"` lists all caught errors.
tasks.register<JavaExec>("injectBad") {
    group = "verification"
    description = "Run the injector against mixins/src/test bad mixins; expected to FAIL with a validator report"
    classpath = sourceSets["main"].runtimeClasspath
    mainClass.set("net.runelite.injector.Injector")
    workingDir = rootProject.projectDir
    dependsOn(":mixins:testClasses", ":runescape-client:classes")
    val targetJar = "data/runelite-1.12.29.1-injected-27693931657.168.jar"
    val outputJar = "data/runelite-1.12.29.1-injected-27693931657.168-bad.jar"
    val mixinClasspath = project(":mixins").layout.buildDirectory.dir("classes/java/test").get().asFile.invariantSeparatorsPath
    val referenceClasspath = project(":runescape-client").layout.buildDirectory.dir("classes/java/main").get().asFile.invariantSeparatorsPath
    args(targetJar, outputJar, mixinClasspath, referenceClasspath)
    isIgnoreExitValue = true
}

tasks.register<JavaExec>("inject") {
    group = "application"
    description = "Run the injector against the lambda-fixed obfuscated jar, producing an injected output jar under data/."
    classpath = sourceSets["main"].runtimeClasspath
    mainClass.set("net.runelite.injector.Injector")
    workingDir = rootProject.projectDir
    // The injector reads compiled bytecode from both modules — build them first.
    dependsOn(":mixins:classes", ":runescape-client:classes")
    val targetJar = (findProperty("targetJar") as? String)
        ?: "data/runelite-1.12.29.1-injected-27693931657.168.jar"
    val outputJar = (findProperty("outputJar") as? String)
        ?: targetJar.replace(".jar", "-mixed.jar")
    val mixinClasspath = project(":mixins").layout.buildDirectory.dir("classes/java/main").get().asFile.invariantSeparatorsPath
    val referenceClasspath = project(":runescape-client").layout.buildDirectory.dir("classes/java/main").get().asFile.invariantSeparatorsPath
    args(targetJar, outputJar, mixinClasspath, referenceClasspath)
}
