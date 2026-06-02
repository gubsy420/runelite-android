package net.runelite.injector

import java.io.File
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import java.util.jar.JarEntry
import java.util.jar.JarFile
import java.util.jar.JarOutputStream
import org.objectweb.asm.ClassReader
import org.objectweb.asm.ClassWriter
import org.objectweb.asm.tree.ClassNode

/**
 * Two-phase weaver:
 *
 *   Phase 1 — per-target apply: walks the mixin classpath, groups mixins by their
 *   resolved obfuscated target. For each target class, applies @Inject / @Shadow /
 *   @Replace / @Copy / @MethodHook, and registers @FieldHook installs into a
 *   FieldHookMap that the next phase consumes.
 *
 *   Phase 2 — global field-hook rewrite: scans EVERY class in the target jar (mixin
 *   target or not) for PUTFIELD/PUTSTATIC sites whose owner+name+desc matches a hook
 *   install and inserts the call to the hook after the store.
 *
 *   Both phases are interleaved with the jar walk: we read each entry once, run the
 *   appropriate transforms, and write the bytes to the output jar.
 */
class Injector(
    private val targetJar: Path,
    private val outputJar: Path,
    private val mixinsClasspath: List<Path>,
    private val referenceClasspath: List<Path>,
) {
    fun run() {
        require(Files.isRegularFile(targetJar)) { "target jar not found: $targetJar" }
        val mixins = MixinDiscovery.scan(mixinsClasspath, referenceClasspath)
        println("injector: discovered ${mixins.size} mixin(s)")
        val byTarget: Map<String, List<MixinDiscovery.Mixin>> = mixins.groupBy { it.targetInternalName }

        val exports = ExportRegistry.build(referenceClasspath)
        val validator = MixinValidator(exports)
        val applier = MixinApplier(exports)
        val fieldHookMap = MixinApplier.FieldHookMap()

        // VALIDATION PASS: walk every mixin, every member, and collect every problem
        // upfront so we fail with a single comprehensive report instead of one error
        // at a time across multiple runs.
        run {
            val errors = mutableListOf<String>()
            JarFile(targetJar.toFile()).use { src ->
                for ((targetInternalName, mxs) in byTarget) {
                    val entry = src.getJarEntry("$targetInternalName.class")
                    if (entry == null) {
                        errors.add("mixin target $targetInternalName resolved by ${mxs.first().mixinClassName} doesn't exist in target jar")
                        continue
                    }
                    val targetNode = ClassNode()
                    ClassReader(src.getInputStream(entry).readBytes()).accept(targetNode, ClassReader.SKIP_CODE or ClassReader.SKIP_FRAMES)
                    for (mx in mxs) {
                        val mxNode = ClassNode()
                        ClassReader(mx.mixinBytes).accept(mxNode, ClassReader.SKIP_CODE or ClassReader.SKIP_FRAMES)
                        errors += validator.validate(mxNode, targetNode, mx.friendlyName)
                    }
                }
            }
            if (errors.isNotEmpty()) {
                val msg = errors.joinToString("\n  • ", prefix = "mixin validation failed (${errors.size} problem(s)):\n  • ")
                error(msg)
            }
        }

        var classesTouched = 0
        var fieldsAdded = 0L
        var methodsAdded = 0L
        var methodsReplaced = 0L
        var methodsCopied = 0L
        var methodHooks = 0L
        var fieldHookSites = 0L

        Files.createDirectories(outputJar.parent)
        JarFile(targetJar.toFile()).use { src ->
            JarOutputStream(Files.newOutputStream(outputJar)).use { dst ->
                val entries = src.entries().toList().sortedBy { it.name }
                // PASS A: per-target apply + collect field-hook installs. We pre-load and
                // cache the modified ClassNodes for any target class so PASS B can do its
                // global rewrite on top of the SAME node and we only emit each class once.
                val cachedTargets = mutableMapOf<String, ClassNode>()
                for (entry in entries) {
                    if (entry.isDirectory || !entry.name.endsWith(".class")) continue
                    val internalName = entry.name.removeSuffix(".class")
                    val applicable = byTarget[internalName] ?: continue
                    val cn = ClassNode()
                    ClassReader(src.getInputStream(entry).readBytes()).accept(cn, 0)
                    val result = applier.apply(cn, applicable, fieldHookMap)
                    classesTouched++
                    fieldsAdded += result.fieldsAdded
                    methodsAdded += result.methodsAdded
                    methodsReplaced += result.methodsReplaced
                    methodsCopied += result.methodsCopied
                    methodHooks += result.methodHooksInstalled
                    cachedTargets[internalName] = cn
                }

                // PASS B + emit: walk every entry. For class entries, run field-hook
                // rewrite (uses the just-built fieldHookMap), preferring the cached
                // (mixin-modified) ClassNode where present; otherwise read from src.
                for (entry in entries) {
                    if (entry.isDirectory) {
                        dst.putNextEntry(JarEntry(entry.name))
                        dst.closeEntry()
                        continue
                    }
                    val bytes: ByteArray = if (entry.name.endsWith(".class")) {
                        val internalName = entry.name.removeSuffix(".class")
                        val cn = cachedTargets[internalName] ?: run {
                            val n = ClassNode()
                            ClassReader(src.getInputStream(entry).readBytes()).accept(n, 0)
                            n
                        }
                        val patches = applier.rewriteFieldHookSites(cn, fieldHookMap)
                        fieldHookSites += patches
                        val cw = ClassWriter(0)
                        cn.accept(cw)
                        cw.toByteArray()
                    } else {
                        src.getInputStream(entry).readBytes()
                    }
                    dst.putNextEntry(JarEntry(entry.name))
                    dst.write(bytes)
                    dst.closeEntry()
                }
            }
        }
        println("injector: touched $classesTouched class(es); added $fieldsAdded field(s), " +
            "$methodsAdded method(s), replaced $methodsReplaced, copied $methodsCopied delegate(s), " +
            "installed $methodHooks method-hook(s), patched $fieldHookSites field-write site(s)")
        println("injector: wrote ${outputJar.toAbsolutePath()}")
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            require(args.size >= 4) {
                "usage: Injector <target.jar> <output.jar> <mixins-classpath> <reference-classpath>"
            }
            Injector(
                targetJar = Paths.get(args[0]),
                outputJar = Paths.get(args[1]),
                mixinsClasspath = args[2].split(File.pathSeparatorChar).map { Paths.get(it) },
                referenceClasspath = args[3].split(File.pathSeparatorChar).map { Paths.get(it) },
            ).run()
        }
    }
}
