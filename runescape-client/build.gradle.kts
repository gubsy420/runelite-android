/*
 * runescape-client — reference cleaned-source module for the obfuscated OSRS gamepack.
 *
 * The source under `src/main/java/` is the post-deobfuscation output of the
 * `client-inspector` pipeline (sanitize → decompile → patchSources → recompile). The
 * injector reads the compiled classes here as a reference for symbol resolution:
 * every annotation we stamp on a field (e.g. @ObfuscatedGetter) or class (future:
 * @Implements) gets read off the runescape-client classes so mixins can target the
 * obfuscated names without us re-discovering them.
 *
 * To refresh the sources to match the latest pipeline output, run
 *   ./gradlew :runescape-client:syncSources
 * which copies from `data/sources/<stem>/` into this module's src tree. The stem
 * defaults to the most-recently-modified directory under data/sources/.
 */
plugins {
    java
}

dependencies {
    // runelite-api provides @ObfuscatedGetter and the public Client/Widget/... types
    // that the cleaned source extends/implements.
    implementation("net.runelite:runelite-api:${project.version}")
    implementation(libs.findbugs)
    implementation(libs.gson)
    implementation(libs.guava)
    implementation(libs.okhttp.mockserver)
    implementation(libs.javax.inject)
    implementation(libs.protobuf)
    implementation(libs.slf4j.api)
    implementation(libs.guice.core)
    // json — pinned to the already-verified ancient version that's in
    // gradle/verification-metadata.xml.
    implementation("org.json:json:20090211")
    // bouncycastle TLS — referenced by the gamepack's TLS handshake stubs.
    // The group is wildcard-trusted in verification-metadata.
    implementation("org.bouncycastle:bctls-jdk18on:1.78.1")
    implementation("org.bouncycastle:bcprov-jdk18on:1.78.1")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(11))
    }
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
    // Match the loose-quality recompile pipeline — Vineflower output has thousands of
    // unchecked / raw-type / deprecated warnings we can't sensibly chase.
    options.compilerArgs.addAll(listOf("-nowarn", "-Xmaxerrs", "10000", "-proc:none"))
}

// Optional sync task: pull the latest decompiled tree from the inspector pipeline into
// this module's src/main/java/. Run manually after a pipeline refresh.
val sourcesRoot = rootProject.layout.projectDirectory.dir("data/sources")
tasks.register<Copy>("syncSources") {
    group = "build setup"
    description = "Mirror the latest data/sources/<stem>/ tree into runescape-client/src/main/java/"
    val stemProperty = providers.gradleProperty("stem")
    val stem = stemProperty.orNull ?: sourcesRoot.asFile.listFiles { f -> f.isDirectory }
        ?.maxByOrNull { it.lastModified() }?.name
    requireNotNull(stem) { "no decompiled source trees under ${sourcesRoot.asFile} — run :client-inspector:decompile first" }
    val srcDir = sourcesRoot.dir(stem)
    val dstDir = layout.projectDirectory.dir("src/main/java")
    from(srcDir) {
        include("**/*.java")
        exclude("META-INF/**")
    }
    into(dstDir)
    doFirst {
        // Wipe existing .java files so removed-since-last-sync sources don't linger.
        dstDir.asFileTree.matching { include("**/*.java") }.forEach { it.delete() }
    }
    doLast {
        logger.lifecycle("synced sources from $srcDir → $dstDir")
    }
}
