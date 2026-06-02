package net.runelite.injector

import java.nio.file.Files
import java.nio.file.Path
import java.util.jar.JarFile
import kotlin.io.path.isRegularFile
import org.objectweb.asm.ClassReader
import org.objectweb.asm.tree.AnnotationNode
import org.objectweb.asm.tree.ClassNode

/**
 * Discovery + target-resolution for mixin classes.
 *
 * <p>The injector resolves {@code @Mixin("FriendlyName")} in two steps:
 * <ol>
 *   <li>Build a name → obfuscated-internal-name map from the runescape-client
 *       classpath. Each runescape-client class with
 *       {@code @Implements({"FriendlyName", ...})} contributes one (or several) entries.
 *       The obfuscated internal name comes from that class's {@code @ObfuscatedName}
 *       (or, if absent, the class's own internal name — which today equals the
 *       obfuscated name since runescape-client doesn't rename).</li>
 *   <li>For each mixin class found on the mixin classpath, read its
 *       {@code @Mixin("FriendlyName")} value, look up the obfuscated internal name in
 *       the map from step 1, and pair them.</li>
 * </ol>
 *
 * <p>Unresolved mixin targets (the friendly name doesn't match any runescape-client
 * {@code @Implements} value) raise a hard error — silently dropping them would let
 * mistyped mixin annotations turn into no-ops.</p>
 */
object MixinDiscovery
{
    private const val MIXIN_ANNOTATION_DESC = "Lnet/runelite/mixins/annotations/Mixin;"
    private const val IMPLEMENTS_ANNOTATION_DESC = "Lnet/runelite/api/annotations/Implements;"
    private const val OBFUSCATED_NAME_ANNOTATION_DESC = "Lnet/runelite/api/annotations/ObfuscatedName;"

    data class Mixin(
        /** Internal name of the mixin class. */
        val mixinClassName: String,
        /** Raw bytes of the mixin .class. */
        val mixinBytes: ByteArray,
        /** Friendly name from {@code @Mixin("...")} — kept for diagnostics. */
        val friendlyName: String,
        /** Obfuscated internal name of the target (e.g. "client"), resolved via
         *  the runescape-client class with {@code @Implements({"<friendlyName>"})}. */
        val targetInternalName: String,
    )

    fun scan(mixinsClasspath: List<Path>, referenceClasspath: List<Path>): List<Mixin> {
        val friendlyToObfuscated = buildFriendlyNameMap(referenceClasspath)
        val deobfClassNames = collectDeobfClassNames(referenceClasspath)
        val rawMixins = collectMixinClasses(mixinsClasspath)
        return rawMixins.map { raw ->
            val friendly = raw.friendlyName
            val candidates = friendlyToObfuscated[friendly]
            val targetInternalName = when {
                candidates != null && candidates.size == 1 -> candidates.single()
                candidates != null && candidates.size > 1 -> error(
                    "mixin ${raw.mixinClassName} targets @Mixin(\"$friendly\") which is ambiguous — multiple " +
                        "runescape-client classes implement it: $candidates. Use a more specific friendly name (e.g. " +
                        "a subtype interface), or refactor the mixin to target the obfuscated name directly."
                )
                // Fall back: friendly name IS an obfuscated class internal name (e.g.
                // `@Mixin("vu")` targets the obfuscated class directly when there's no
                // @Implements value to route through).
                friendly in deobfClassNames -> friendly
                else -> error(
                    "mixin ${raw.mixinClassName} targets @Mixin(\"$friendly\") but neither a runescape-client " +
                        "class declares @Implements({\"$friendly\"}) nor does a class with that internal name exist. " +
                        "Known @Implements friendly names: ${friendlyToObfuscated.keys.sorted()}."
                )
            }
            Mixin(
                mixinClassName = raw.mixinClassName,
                mixinBytes = raw.mixinBytes,
                friendlyName = friendly,
                targetInternalName = targetInternalName,
            )
        }
    }

    private fun collectDeobfClassNames(classpath: List<Path>): Set<String> {
        val names = mutableSetOf<String>()
        forEachClassFile(classpath) { bytes ->
            val cn = ClassNode()
            ClassReader(bytes).accept(cn, ClassReader.SKIP_CODE or ClassReader.SKIP_FRAMES or ClassReader.SKIP_DEBUG)
            names.add(cn.name)
        }
        return names
    }

    private data class RawMixin(
        val mixinClassName: String,
        val mixinBytes: ByteArray,
        val friendlyName: String,
    )

    private fun collectMixinClasses(classpath: List<Path>): List<RawMixin> {
        val result = mutableListOf<RawMixin>()
        forEachClassFile(classpath) { bytes ->
            val cn = ClassNode()
            ClassReader(bytes).accept(cn, ClassReader.SKIP_CODE or ClassReader.SKIP_FRAMES or ClassReader.SKIP_DEBUG)
            val mixinAnno = cn.visibleAnnotations?.firstOrNull { it.desc == MIXIN_ANNOTATION_DESC } ?: return@forEachClassFile
            val friendly = (readAnnotationKey(mixinAnno, "value") as? String)
                ?: error("@Mixin on ${cn.name} is missing its value()")
            require(friendly.isNotEmpty()) { "@Mixin on ${cn.name} has empty value()" }
            result.add(RawMixin(cn.name, bytes, friendly))
        }
        return result
    }

    /**
     * Walks the runescape-client classpath looking for {@code @Implements} annotations
     * and indexes each friendly value to the class's obfuscated internal name.
     */
    /** Friendly name → list of obfuscated internal names that claim it. List rather
     *  than single-value because runelite-api has marker interfaces like
     *  {@code TileObject} that several concrete classes implement. */
    private fun buildFriendlyNameMap(classpath: List<Path>): Map<String, List<String>> {
        val map = mutableMapOf<String, MutableList<String>>()
        forEachClassFile(classpath) { bytes ->
            val cn = ClassNode()
            ClassReader(bytes).accept(cn, ClassReader.SKIP_CODE or ClassReader.SKIP_FRAMES or ClassReader.SKIP_DEBUG)
            val implAnno = cn.visibleAnnotations?.firstOrNull { it.desc == IMPLEMENTS_ANNOTATION_DESC } ?: return@forEachClassFile
            @Suppress("UNCHECKED_CAST")
            val friendlyNames = (readAnnotationKey(implAnno, "value") as? List<String>) ?: return@forEachClassFile
            val obfuscatedInternalName = readObfuscatedName(cn) ?: cn.name
            for (friendly in friendlyNames) {
                val list = map.getOrPut(friendly) { mutableListOf() }
                if (obfuscatedInternalName !in list) list.add(obfuscatedInternalName)
            }
        }
        return map
    }

    /** Reads the class's {@code @ObfuscatedName} value if present. */
    private fun readObfuscatedName(cn: ClassNode): String? {
        val anno = cn.visibleAnnotations?.firstOrNull { it.desc == OBFUSCATED_NAME_ANNOTATION_DESC } ?: return null
        return readAnnotationKey(anno, "value") as? String
    }

    /** Returns the value of {@code key} from {@code annotation}, or null. AnnotationNode
     *  stores values as alternating (String key, Object value) entries. */
    private fun readAnnotationKey(annotation: AnnotationNode, key: String): Any? {
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
                            jar.getInputStream(e).use { input ->
                                sink(input.readBytes())
                            }
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
