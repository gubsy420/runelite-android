plugins {
    java
    application
    // Kotlin alongside Java — used for the UpdateMapper (cross-revision annotation
    // carry-over). The Kotlin plugin is already on the build classpath via
    // runelite-mp's kotlin-multiplatform alias.
    id("org.jetbrains.kotlin.jvm")
}

// Pin Kotlin's JVM target to match Java's (common.settings.gradle.kts sets
// options.release = 11 on every JavaCompile). Without this, Kotlin defaults to
// whatever the runtime is (21) and Gradle refuses to mix.
tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
    compilerOptions.jvmTarget.set(org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_11)
}

dependencies {
    implementation(libs.asm.core)
    implementation(libs.asm.tree)
    implementation(libs.asm.commons)
    implementation(libs.gson)
    // Provides @javax.inject.Named so its declared member types can be reflected over for bomb detection.
    implementation(libs.javax.inject)
    implementation(libs.vineflower)
    // Lets the sanitizer's annotation-keep filter Class.forName our @ObfuscatedGetter
    // when emitting it on rewritten fields, instead of treating it as unloadable noise.
    implementation("net.runelite:runelite-api:${project.version}")
}

application {
    mainClass.set("net.runelite.inspector.Inspector")
}

tasks.named<JavaExec>("run") {
    workingDir = rootProject.projectDir
}

tasks.register<JavaExec>("sanitize") {
    group = "application"
    description = "Strip oversized annotation payloads from a patched-client jar"
    classpath = sourceSets["main"].runtimeClasspath
    mainClass.set("net.runelite.inspector.Sanitizer")
    workingDir = rootProject.projectDir
    (findProperty("inJar") as? String)?.let { args(it) }
}

tasks.register<JavaExec>("updateMap") {
    group = "application"
    description = "Carry @Export/@Implements/@ObfuscatedName from a sanitized reference jar to a newer revision."
    classpath = sourceSets["main"].runtimeClasspath
    mainClass.set("net.runelite.inspector.UpdateMapper")
    workingDir = rootProject.projectDir
    val refJar = (findProperty("refJar") as? String)
        ?: "data/runelite-1.12.27-injected-26504454311.147-clean.jar"
    val tgtJar = (findProperty("tgtJar") as? String)
        ?: "data/runelite-1.12.27-SNAPSHOT-injected-26376428461.145.jar"
    val outJar = (findProperty("outJar") as? String)
        ?: tgtJar.replace(".jar", "-annotated.jar")
    args(refJar, tgtJar, outJar)
}

tasks.register<JavaExec>("decompile") {
    group = "application"
    description = "Decompile a (sanitized) jar to .java sources under data/sources/<stem>/, full log to data/<stem>-decompile.log"
    classpath = sourceSets["main"].runtimeClasspath
    mainClass.set("net.runelite.inspector.Decompiler")
    workingDir = rootProject.projectDir
    maxHeapSize = "6g"
    (findProperty("inJar") as? String)?.let { args(it) }
}

tasks.register<JavaExec>("patchSources") {
    group = "application"
    description = "Apply post-decompile source-level patches under data/sources/<stem>/ — fixes Vineflower artefacts (lost generics, method-ref arity, Throwable upcast) we can't repair upstream"
    classpath = sourceSets["main"].runtimeClasspath
    mainClass.set("net.runelite.inspector.SourcePatcher")
    workingDir = rootProject.projectDir
    (findProperty("stem") as? String)?.let { args(it) }
}

tasks.register("recompile") {
    group = "application"
    description = "javac the decompiled tree back into data/<stem>-recompiled.jar (reports compile errors with full log)"
    doLast {
        val dataDir = rootProject.projectDir.resolve("data")
        val sourcesRoot = dataDir.resolve("sources")
        val stem = (findProperty("stem") as? String) ?: run {
            val dirs = sourcesRoot.listFiles { f -> f.isDirectory }?.toList().orEmpty()
            require(dirs.isNotEmpty()) { "no decompiled source trees under $sourcesRoot — run :client-inspector:decompile first" }
            dirs.maxBy { it.lastModified() }.name
        }
        val srcDir = sourcesRoot.resolve(stem)
        require(srcDir.isDirectory) { "missing source tree: $srcDir" }
        val originalJar = dataDir.resolve("$stem.jar")
        require(originalJar.isFile) { "missing source jar: $originalJar (run :client-inspector:sanitize)" }

        val classesDir = dataDir.resolve("recompiled-classes/$stem")
        delete(classesDir)
        classesDir.mkdirs()

        val javaFiles = fileTree(srcDir) { include("**/*.java") }.files
        require(javaFiles.isNotEmpty()) { "no .java files under $srcDir" }

        val clientRuntime = project(":client").configurations
            .getByName("runtimeClasspath")
            .files
            .filter { it.name.endsWith(".jar") }
        val classpathJars = clientRuntime + listOf(originalJar)

        val argFile = layout.buildDirectory.file("recompile-$stem.args").get().asFile
        argFile.parentFile.mkdirs()
        argFile.writeText(buildString {
            append("-d \"${classesDir.invariantSeparatorsPath}\"\n")
            append("-source 11 -target 11 -encoding UTF-8 -nowarn -Xmaxerrs 10000 -proc:none\n")
            append("-classpath \"")
            append(classpathJars.joinToString(File.pathSeparator) { it.invariantSeparatorsPath })
            append("\"\n")
            javaFiles.forEach { append('"').append(it.invariantSeparatorsPath).append("\"\n") }
        })

        val log = dataDir.resolve("$stem-recompile.log")
        val exit = log.outputStream().use { os ->
            exec {
                commandLine("javac", "@${argFile.invariantSeparatorsPath}")
                isIgnoreExitValue = true
                standardOutput = os
                errorOutput = os
            }.exitValue
        }
        if (exit != 0) {
            println("javac failed (exit $exit) — full output at ${log.absolutePath}")
            val errorSummary = log.readLines()
                .filter { it.contains("error:") }
                .groupingBy { it.substringAfter("error:").trim().substringBefore('\n').take(120) }
                .eachCount()
                .entries.sortedByDescending { it.value }
                .take(15)
            println("top javac error categories:")
            errorSummary.forEach { (msg, n) -> println("  ${n.toString().padStart(5)} x $msg") }
            throw GradleException("recompile failed with $exit; see $log")
        }

        val outJar = dataDir.resolve("$stem-recompiled.jar")
        outJar.delete()
        exec {
            commandLine("jar", "cf", outJar.invariantSeparatorsPath, "-C", classesDir.invariantSeparatorsPath, ".")
        }
        println("wrote ${outJar.absolutePath}")
    }
}
