package net.runelite.injector

import java.nio.file.Files
import java.nio.file.Path
import java.util.jar.JarFile
import kotlin.io.path.isRegularFile
import org.objectweb.asm.ClassReader
import org.objectweb.asm.tree.AnnotationNode
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.FieldNode
import org.objectweb.asm.tree.MethodNode

/**
 * Indexes {@code @Export("friendlyName")} annotations across the runescape-client
 * classpath so mixin references like {@code @Shadow @Export("init")} can be resolved to
 * the corresponding obfuscated member (owner + name + descriptor).
 *
 * <p>The lookup keys are scoped to one owner class at a time. A mixin field/method
 * with {@code @Shadow @Export("init")} resolves against the export table for whichever
 * runescape-client class the enclosing mixin's {@code @Mixin(...)} resolved to. This
 * keeps the friendly-name namespace per-target — same friendly name on different
 * classes wouldn't collide.</p>
 */
class ExportRegistry private constructor(
    private val byOwner: Map<String, OwnerExports>,
    /** (deobf owner, deobf name, deobf desc) → obfuscated (owner, name, desc).
     *  Built from every member of every runescape-client class that carries
     *  {@code @ObfuscatedName} / {@code @ObfuscatedSignature}. Lets the mixin
     *  applier translate natural deobfuscated references like {@code vu.bt_fld}
     *  to the obfuscated bytecode shape {@code vu.bt}. */
    private val deobfMemberMap: Map<DeobfMember, ObfMember>,
) {
    data class FieldExport(
        val obfuscatedName: String,
        val obfuscatedDescriptor: String,
    )
    data class MethodExport(
        val obfuscatedName: String,
        val obfuscatedDescriptor: String,
    )

    data class DeobfMember(val owner: String, val name: String, val desc: String)
    data class ObfMember(val owner: String, val name: String, val desc: String)

    fun resolveField(obfuscatedOwner: String, friendlyName: String): FieldExport? =
        byOwner[obfuscatedOwner]?.fields?.get(friendlyName)

    fun resolveMethod(obfuscatedOwner: String, friendlyName: String): MethodExport? =
        byOwner[obfuscatedOwner]?.methods?.get(friendlyName)

    fun knownExportsOn(obfuscatedOwner: String): List<String> {
        val owner = byOwner[obfuscatedOwner] ?: return emptyList()
        return (owner.fields.keys + owner.methods.keys).sorted()
    }

    /** Looks up the obfuscated identity of a member referenced by its deobfuscated
     *  name. Used by the injector to rewrite ordinary (non-@Shadow) member references
     *  inside injected method bodies. Returns null for stdlib / runelite-api / mixin
     *  internal references, which should be left alone. */
    fun lookupDeobfMember(owner: String, name: String, desc: String): ObfMember? =
        deobfMemberMap[DeobfMember(owner, name, desc)]

    companion object {
        private const val EXPORT_DESC = "Lnet/runelite/api/annotations/Export;"
        private const val OBFUSCATED_NAME_DESC = "Lnet/runelite/api/annotations/ObfuscatedName;"
        private const val OBFUSCATED_SIG_DESC = "Lnet/runelite/api/annotations/ObfuscatedSignature;"

        fun build(referenceClasspath: List<Path>): ExportRegistry {
            val owners = mutableMapOf<String, MutableOwnerExports>()
            val deobfMap = mutableMapOf<DeobfMember, ObfMember>()
            forEachClassFile(referenceClasspath) { bytes ->
                val cn = ClassNode()
                ClassReader(bytes).accept(cn, ClassReader.SKIP_CODE or ClassReader.SKIP_FRAMES or ClassReader.SKIP_DEBUG)
                val ownerObfuscatedName = readClassObfuscatedName(cn) ?: cn.name
                val entry = owners.getOrPut(ownerObfuscatedName) { MutableOwnerExports() }
                cn.fields?.forEach { fn ->
                    indexField(entry, fn)
                    indexDeobfField(deobfMap, cn, fn, ownerObfuscatedName)
                }
                cn.methods?.forEach { mn ->
                    indexMethod(entry, mn)
                    indexDeobfMethod(deobfMap, cn, mn, ownerObfuscatedName)
                }
            }
            return ExportRegistry(
                owners.mapValues { (_, v) -> OwnerExports(v.fields.toMap(), v.methods.toMap()) },
                deobfMap.toMap(),
            )
        }

        private fun indexDeobfField(
            map: MutableMap<DeobfMember, ObfMember>,
            cn: ClassNode,
            fn: FieldNode,
            ownerObf: String,
        ) {
            val obfName = readObfuscatedNameValue(fn.visibleAnnotations) ?: return
            val obfDesc = readObfuscatedSignatureDescriptor(fn.visibleAnnotations) ?: fn.desc
            if (obfName == fn.name && obfDesc == fn.desc) return
            map[DeobfMember(cn.name, fn.name, fn.desc)] = ObfMember(ownerObf, obfName, obfDesc)
        }

        private fun indexDeobfMethod(
            map: MutableMap<DeobfMember, ObfMember>,
            cn: ClassNode,
            mn: MethodNode,
            ownerObf: String,
        ) {
            val obfName = readObfuscatedNameValue(mn.visibleAnnotations) ?: return
            val obfDesc = readObfuscatedSignatureDescriptor(mn.visibleAnnotations) ?: mn.desc
            if (obfName == mn.name && obfDesc == mn.desc) return
            map[DeobfMember(cn.name, mn.name, mn.desc)] = ObfMember(ownerObf, obfName, obfDesc)
        }

        private fun indexField(entry: MutableOwnerExports, fn: FieldNode) {
            val exportName = readExportValue(fn.visibleAnnotations) ?: return
            val obfuscatedName = readObfuscatedNameValue(fn.visibleAnnotations) ?: fn.name
            val obfuscatedDesc = readObfuscatedSignatureDescriptor(fn.visibleAnnotations) ?: fn.desc
            entry.fields[exportName] = FieldExport(obfuscatedName, obfuscatedDesc)
        }

        private fun indexMethod(entry: MutableOwnerExports, mn: MethodNode) {
            val exportName = readExportValue(mn.visibleAnnotations) ?: return
            val obfuscatedName = readObfuscatedNameValue(mn.visibleAnnotations) ?: mn.name
            val obfuscatedDesc = readObfuscatedSignatureDescriptor(mn.visibleAnnotations) ?: mn.desc
            entry.methods[exportName] = MethodExport(obfuscatedName, obfuscatedDesc)
        }

        private fun readClassObfuscatedName(cn: ClassNode): String? {
            val anno = cn.visibleAnnotations?.firstOrNull { it.desc == OBFUSCATED_NAME_DESC } ?: return null
            return readKey(anno, "value") as? String
        }

        private fun readExportValue(annos: List<AnnotationNode>?): String? {
            val anno = annos?.firstOrNull { it.desc == EXPORT_DESC } ?: return null
            return readKey(anno, "value") as? String
        }

        private fun readObfuscatedNameValue(annos: List<AnnotationNode>?): String? {
            val anno = annos?.firstOrNull { it.desc == OBFUSCATED_NAME_DESC } ?: return null
            return readKey(anno, "value") as? String
        }

        private fun readObfuscatedSignatureDescriptor(annos: List<AnnotationNode>?): String? {
            val anno = annos?.firstOrNull { it.desc == OBFUSCATED_SIG_DESC } ?: return null
            return readKey(anno, "descriptor") as? String
        }

        private fun readKey(annotation: AnnotationNode, key: String): Any? {
            val values = annotation.values ?: return null
            var i = 0
            while (i + 1 < values.size) {
                if (values[i] == key) return values[i + 1]
                i += 2
            }
            return null
        }

        private fun forEachClassFile(classpath: List<Path>, sink: (ByteArray) -> Unit) {
            for (root in classpath) {
                if (!Files.exists(root)) continue
                when {
                    root.isRegularFile() && root.toString().endsWith(".jar") -> {
                        JarFile(root.toFile()).use { jar ->
                            val it = jar.entries()
                            while (it.hasMoreElements()) {
                                val e = it.nextElement()
                                if (!e.name.endsWith(".class")) continue
                                jar.getInputStream(e).use { input -> sink(input.readBytes()) }
                            }
                        }
                    }
                    Files.isDirectory(root) -> {
                        Files.walk(root).use { stream ->
                            stream.filter { it.toString().endsWith(".class") }.forEach { p ->
                                sink(Files.readAllBytes(p))
                            }
                        }
                    }
                }
            }
        }
    }

    private data class OwnerExports(
        val fields: Map<String, FieldExport>,
        val methods: Map<String, MethodExport>,
    )

    private class MutableOwnerExports {
        val fields = mutableMapOf<String, FieldExport>()
        val methods = mutableMapOf<String, MethodExport>()
    }
}
