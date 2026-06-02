package net.runelite.inspector

import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import java.util.jar.JarEntry
import java.util.jar.JarFile
import java.util.jar.JarOutputStream
import org.objectweb.asm.ClassReader
import org.objectweb.asm.ClassWriter
import org.objectweb.asm.tree.AnnotationNode
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.FieldInsnNode
import org.objectweb.asm.tree.FieldNode
import org.objectweb.asm.tree.MethodInsnNode
import org.objectweb.asm.tree.MethodNode

/**
 * Carries the manually-curated annotations (@Export, plus the auto-stamped
 * @ObfuscatedName / @ObfuscatedSignature / @Implements / @ObfuscatedGetter) from one
 * RuneLite-injected client revision to another whose Jagex obfuscation has been
 * re-rolled but whose RuneLite injection layer is the same.
 *
 * <h2>Inputs</h2>
 * <ul>
 *   <li><b>refJar</b> — the annotated reference (e.g. sanitized 147 with
 *       {@code @Implements / @ObfuscatedName / @Export}).</li>
 *   <li><b>tgtJar</b> — the new revision (e.g. 145) we want to derive annotations for.</li>
 * </ul>
 *
 * <h2>Algorithm</h2>
 * <ol>
 *   <li><b>Class anchoring</b> via the {@code interfaces} list: both jars carry the
 *       same RuneLite-injected runelite-api interface implementations, so for every
 *       class in the ref that implements one or more {@code net/runelite/api/_}
 *       interfaces, find the class in the target that implements the SAME interface
 *       set. Most "important" classes (Client, Player, Widget, Scene, ...) anchor
 *       this way. The {@code client} class additionally matches by superclass
 *       (Applet) and by class name (it's the bootstrap entry point — preserved).</li>
 *   <li><b>Member anchoring via bytecode parallel walk</b>: within an anchored class
 *       pair, walk methods that have IDENTICAL name+descriptor in both (these are the
 *       RuneLite-injected forwarders + JDK-pinned overrides like
 *       {@code init()}/{@code paint(Graphics)}). For each pair of preserved methods,
 *       step through their instruction lists in lockstep — every
 *       {@code INVOKE}/{@code GETFIELD}/{@code PUTFIELD} reference pair contributes a
 *       (refOwner.refMember → tgtOwner.tgtMember) entry to the global member map.
 *       This bootstraps mappings for the underlying obfuscated members the
 *       forwarders point at.</li>
 *   <li><b>Annotation transfer</b>: for every class in ref that's anchored, copy its
 *       {@code @ObfuscatedName / @Implements} class-level annotations onto the
 *       matched target class. For every member with a mapping, copy the
 *       {@code @Export / @ObfuscatedGetter} annotations onto the matched target
 *       member.</li>
 *   <li><b>Output jar</b>: target jar bytes with the new annotations woven in,
 *       written to {@code outJar}.</li>
 * </ol>
 *
 * <h2>Not yet implemented</h2>
 * <ul>
 *   <li>Bytecode-similarity matching for classes / members that don't anchor via the
 *       above (e.g. plain data classes with no runelite-api interface). For now those
 *       remain unmapped — the resulting target jar carries annotations for the
 *       anchored subset only.</li>
 *   <li>Transitive class anchoring via field/method descriptors that reference
 *       already-anchored classes.</li>
 *   <li>String-constant similarity matching (most error messages, format strings are
 *       preserved across revisions).</li>
 * </ul>
 */
class UpdateMapper(
    private val refJar: Path,
    private val tgtJar: Path,
    private val outJar: Path,
) {
    data class Stats(
        val classesAnchored: Int,
        val membersMapped: Int,
        val annotationsTransferred: Int,
        val classesInTargetTotal: Int,
        val classesInReferenceTotal: Int,
    )

    fun run(): Stats {
        require(Files.isRegularFile(refJar)) { "ref jar not found: $refJar" }
        require(Files.isRegularFile(tgtJar)) { "tgt jar not found: $tgtJar" }
        val ref = loadClassNodes(refJar)
        val tgt = loadClassNodes(tgtJar)

        val classMap: Map<String, String> = anchorClassesByInterfaces(ref, tgt) +
            anchorClassesByPreservedName(ref, tgt)
        println("UpdateMapper: anchored ${classMap.size} / ${ref.size} classes")

        val memberMap = mapMembersThroughForwarders(ref, tgt, classMap)
        println("UpdateMapper: mapped ${memberMap.fields.size} field(s) and ${memberMap.methods.size} method(s) via preserved-name forwarders")

        var transferred = 0
        for ((refName, tgtName) in classMap) {
            val refClass = ref[refName] ?: continue
            val tgtClass = tgt[tgtName] ?: continue
            transferred += transferClassAnnotations(refClass, tgtClass)
            transferred += transferFieldAnnotations(refClass, tgtClass, memberMap.fields, refName, tgtName)
            transferred += transferMethodAnnotations(refClass, tgtClass, memberMap.methods, refName, tgtName)
        }
        println("UpdateMapper: transferred $transferred annotation(s)")

        writeJar(tgt, outJar)
        return Stats(
            classesAnchored = classMap.size,
            membersMapped = memberMap.fields.size + memberMap.methods.size,
            annotationsTransferred = transferred,
            classesInTargetTotal = tgt.size,
            classesInReferenceTotal = ref.size,
        )
    }

    // ----------------------------------------------------------------------------------
    // load / write
    // ----------------------------------------------------------------------------------

    private fun loadClassNodes(jar: Path): MutableMap<String, ClassNode> {
        val out = mutableMapOf<String, ClassNode>()
        JarFile(jar.toFile()).use { jf ->
            val entries = jf.entries()
            while (entries.hasMoreElements()) {
                val e = entries.nextElement()
                if (!e.name.endsWith(".class")) continue
                val cn = ClassNode()
                ClassReader(jf.getInputStream(e).readBytes()).accept(cn, 0)
                out[cn.name] = cn
            }
        }
        return out
    }

    private fun writeJar(tgt: Map<String, ClassNode>, outJar: Path) {
        Files.createDirectories(outJar.parent)
        JarFile(tgtJar.toFile()).use { srcJar ->
            JarOutputStream(Files.newOutputStream(outJar)).use { dst ->
                val entries = srcJar.entries().toList().sortedBy { it.name }
                for (entry in entries) {
                    if (entry.isDirectory) {
                        dst.putNextEntry(JarEntry(entry.name))
                        dst.closeEntry()
                        continue
                    }
                    val bytes: ByteArray = if (entry.name.endsWith(".class")) {
                        val internalName = entry.name.removeSuffix(".class")
                        val cn = tgt[internalName]
                        if (cn != null) {
                            val cw = ClassWriter(0)
                            cn.accept(cw)
                            cw.toByteArray()
                        } else {
                            srcJar.getInputStream(entry).readBytes()
                        }
                    } else {
                        srcJar.getInputStream(entry).readBytes()
                    }
                    dst.putNextEntry(JarEntry(entry.name))
                    dst.write(bytes)
                    dst.closeEntry()
                }
            }
        }
    }

    // ----------------------------------------------------------------------------------
    // class anchoring
    // ----------------------------------------------------------------------------------

    /** Anchor classes by their direct interfaces. A pair (refClass, tgtClass) matches if
     *  they implement THE SAME SET of runelite-api interfaces. Ambiguous matches (more
     *  than one target class shares the same interface set) are skipped — those need a
     *  secondary signal (e.g. superclass + member count) to disambiguate. */
    private fun anchorClassesByInterfaces(ref: Map<String, ClassNode>, tgt: Map<String, ClassNode>): Map<String, String> {
        val refByIfaces = mutableMapOf<Set<String>, MutableList<String>>()
        val tgtByIfaces = mutableMapOf<Set<String>, MutableList<String>>()
        for ((name, cn) in ref) {
            val ifs = cn.interfaces?.filter { it.startsWith("net/runelite/api/") }?.toSet().orEmpty()
            if (ifs.isNotEmpty()) refByIfaces.getOrPut(ifs) { mutableListOf() }.add(name)
        }
        for ((name, cn) in tgt) {
            val ifs = cn.interfaces?.filter { it.startsWith("net/runelite/api/") }?.toSet().orEmpty()
            if (ifs.isNotEmpty()) tgtByIfaces.getOrPut(ifs) { mutableListOf() }.add(name)
        }
        val result = mutableMapOf<String, String>()
        for ((ifaces, refList) in refByIfaces) {
            val tgtList = tgtByIfaces[ifaces] ?: continue
            if (refList.size == 1 && tgtList.size == 1) {
                result[refList.single()] = tgtList.single()
            }
            // Skip when multiple candidates per side — those need a tie-breaker pass.
        }
        return result
    }

    /** Anchor classes whose internal name is preserved across revisions. {@code client}
     *  is the obvious one — it's the Applet bootstrap entry point and has to keep that
     *  name. Other preserved names (if any) come along for free. */
    private fun anchorClassesByPreservedName(ref: Map<String, ClassNode>, tgt: Map<String, ClassNode>): Map<String, String> {
        val result = mutableMapOf<String, String>()
        for ((name, refCn) in ref) {
            val tgtCn = tgt[name] ?: continue
            // Sanity: superclass should also match to avoid coincidental two-letter
            // name collisions on unrelated classes.
            if (refCn.superName == tgtCn.superName) {
                result[name] = name
            }
        }
        return result
    }

    // ----------------------------------------------------------------------------------
    // member anchoring via parallel bytecode walk
    // ----------------------------------------------------------------------------------

    data class MemberMap(
        val fields: MutableMap<MemberRef, MemberRef> = mutableMapOf(),
        val methods: MutableMap<MemberRef, MemberRef> = mutableMapOf(),
    )

    data class MemberRef(val owner: String, val name: String, val desc: String)

    /**
     * For every (refClass, tgtClass) class pair, find methods with IDENTICAL
     * (name, descriptor) — preserved across revisions (forwarder methods + JDK
     * overrides). Walk their instructions in lockstep. Each
     * {@code MethodInsnNode}/{@code FieldInsnNode} pair contributes one entry to the
     * global member map.
     *
     * <p>Forwarder methods are useful because their NAME survives obfuscation rounds
     * (RuneLite injects them with friendly names like {@code getCanvas},
     * {@code getGameState}, etc.). The bytecode of each forwarder INVOKEs the
     * underlying obfuscated method whose name DID change — so by walking forwarders in
     * parallel, we discover the mapping for the underlying members.</p>
     */
    private fun mapMembersThroughForwarders(
        ref: Map<String, ClassNode>,
        tgt: Map<String, ClassNode>,
        classMap: Map<String, String>,
    ): MemberMap {
        val mm = MemberMap()
        for ((refName, tgtName) in classMap) {
            val refClass = ref[refName] ?: continue
            val tgtClass = tgt[tgtName] ?: continue
            val tgtMethodIndex = (tgtClass.methods ?: emptyList()).associateBy { it.name + it.desc }
            for (refMethod in refClass.methods.orEmpty()) {
                val tgtMethod = tgtMethodIndex[refMethod.name + refMethod.desc] ?: continue
                // Register the outer pair itself — these are the preserved-name
                // forwarder/override methods (init, paint, getCanvas, ...). They DON'T
                // appear as INVOKE targets within any forwarder body, so without this
                // explicit add they'd never enter the member map.
                mm.methods[MemberRef(refName, refMethod.name, refMethod.desc)] =
                    MemberRef(tgtName, tgtMethod.name, tgtMethod.desc)
                walkParallelInstructions(refMethod, tgtMethod, mm)
            }
            // Same for fields: when an anchored class has fields whose obfuscated name+desc
            // are preserved (typically reference-typed fields whose obfuscated name didn't
            // get re-rolled, or fields that never moved in the duplicate-renamer), add a
            // direct same-key mapping.
            val tgtFieldIndex = (tgtClass.fields ?: emptyList()).associateBy { it.name + ":" + it.desc }
            for (refField in refClass.fields.orEmpty()) {
                val tgtField = tgtFieldIndex[refField.name + ":" + refField.desc] ?: continue
                mm.fields[MemberRef(refName, refField.name, refField.desc)] =
                    MemberRef(tgtName, tgtField.name, tgtField.desc)
            }
        }
        return mm
    }

    private fun walkParallelInstructions(refM: MethodNode, tgtM: MethodNode, mm: MemberMap) {
        val refInsns = refM.instructions ?: return
        val tgtInsns = tgtM.instructions ?: return
        var r = refInsns.first
        var t = tgtInsns.first
        while (r != null && t != null) {
            if (r.opcode == t.opcode) {
                when {
                    r is FieldInsnNode && t is FieldInsnNode -> {
                        addFieldMapping(r, t, mm)
                    }
                    r is MethodInsnNode && t is MethodInsnNode -> {
                        addMethodMapping(r, t, mm)
                    }
                }
                r = r.next
                t = t.next
            } else {
                // Drift — give up on this method pair (bytecode shape diverged enough
                // that lockstep walking isn't reliable). Future work: best-alignment
                // walk that tolerates small reorderings.
                return
            }
        }
    }

    private fun addFieldMapping(r: FieldInsnNode, t: FieldInsnNode, mm: MemberMap) {
        val refRef = MemberRef(r.owner, r.name, r.desc)
        val tgtRef = MemberRef(t.owner, t.name, t.desc)
        val previous = mm.fields[refRef]
        if (previous == null) mm.fields[refRef] = tgtRef
        // If we discover the same refRef pointing to different tgtRefs we have an
        // alignment conflict — drop it; better to leave unmapped than emit a wrong
        // annotation.
        else if (previous != tgtRef) mm.fields.remove(refRef)
    }

    private fun addMethodMapping(r: MethodInsnNode, t: MethodInsnNode, mm: MemberMap) {
        val refRef = MemberRef(r.owner, r.name, r.desc)
        val tgtRef = MemberRef(t.owner, t.name, t.desc)
        val previous = mm.methods[refRef]
        if (previous == null) mm.methods[refRef] = tgtRef
        else if (previous != tgtRef) mm.methods.remove(refRef)
    }

    // ----------------------------------------------------------------------------------
    // annotation transfer
    // ----------------------------------------------------------------------------------

    private fun transferClassAnnotations(refClass: ClassNode, tgtClass: ClassNode): Int {
        var copied = 0
        val tgtExisting = tgtClass.visibleAnnotations?.map { it.desc }?.toMutableSet() ?: mutableSetOf()
        for (refAnno in refClass.visibleAnnotations.orEmpty()) {
            if (!isTransferableClassAnnotation(refAnno.desc)) continue
            if (refAnno.desc in tgtExisting) continue
            if (tgtClass.visibleAnnotations == null) tgtClass.visibleAnnotations = mutableListOf()
            tgtClass.visibleAnnotations.add(cloneAnnotation(refAnno))
            tgtExisting.add(refAnno.desc)
            copied++
        }
        return copied
    }

    private fun transferFieldAnnotations(
        refClass: ClassNode,
        tgtClass: ClassNode,
        fieldMap: Map<MemberRef, MemberRef>,
        refName: String,
        tgtName: String,
    ): Int {
        var copied = 0
        // Build a quick lookup for target fields by (name, desc).
        val tgtByKey = (tgtClass.fields ?: emptyList()).associateBy { it.name + ":" + it.desc }
        for (refField in refClass.fields.orEmpty()) {
            val refRef = MemberRef(refName, refField.name, refField.desc)
            val tgtRef = fieldMap[refRef] ?: continue
            if (tgtRef.owner != tgtName) continue
            val tgtField = tgtByKey[tgtRef.name + ":" + tgtRef.desc] ?: continue
            val tgtExisting = tgtField.visibleAnnotations?.map { it.desc }?.toMutableSet() ?: mutableSetOf()
            for (refAnno in refField.visibleAnnotations.orEmpty()) {
                if (!isTransferableMemberAnnotation(refAnno.desc)) continue
                if (refAnno.desc in tgtExisting) continue
                if (tgtField.visibleAnnotations == null) tgtField.visibleAnnotations = mutableListOf()
                tgtField.visibleAnnotations.add(cloneAnnotation(refAnno))
                tgtExisting.add(refAnno.desc)
                copied++
            }
        }
        return copied
    }

    private fun transferMethodAnnotations(
        refClass: ClassNode,
        tgtClass: ClassNode,
        methodMap: Map<MemberRef, MemberRef>,
        refName: String,
        tgtName: String,
    ): Int {
        var copied = 0
        val tgtByKey = (tgtClass.methods ?: emptyList()).associateBy { it.name + it.desc }
        for (refMethod in refClass.methods.orEmpty()) {
            val refRef = MemberRef(refName, refMethod.name, refMethod.desc)
            val tgtRef = methodMap[refRef] ?: continue
            if (tgtRef.owner != tgtName) continue
            val tgtMethod = tgtByKey[tgtRef.name + tgtRef.desc] ?: continue
            val tgtExisting = tgtMethod.visibleAnnotations?.map { it.desc }?.toMutableSet() ?: mutableSetOf()
            for (refAnno in refMethod.visibleAnnotations.orEmpty()) {
                if (!isTransferableMemberAnnotation(refAnno.desc)) continue
                if (refAnno.desc in tgtExisting) continue
                if (tgtMethod.visibleAnnotations == null) tgtMethod.visibleAnnotations = mutableListOf()
                tgtMethod.visibleAnnotations.add(cloneAnnotation(refAnno))
                tgtExisting.add(refAnno.desc)
                copied++
            }
        }
        return copied
    }

    private fun isTransferableClassAnnotation(desc: String): Boolean =
        desc == "Lnet/runelite/api/annotations/ObfuscatedName;" ||
            desc == "Lnet/runelite/api/annotations/Implements;"

    private fun isTransferableMemberAnnotation(desc: String): Boolean =
        desc == "Lnet/runelite/api/annotations/ObfuscatedName;" ||
            desc == "Lnet/runelite/api/annotations/ObfuscatedSignature;" ||
            desc == "Lnet/runelite/api/annotations/ObfuscatedGetter;" ||
            desc == "Lnet/runelite/api/annotations/Export;"

    private fun cloneAnnotation(src: AnnotationNode): AnnotationNode {
        val copy = AnnotationNode(src.desc)
        copy.values = src.values?.toMutableList()
        return copy
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            require(args.size == 3) {
                "usage: UpdateMapper <reference-annotated.jar> <target.jar> <output.jar>"
            }
            val stats = UpdateMapper(
                refJar = Paths.get(args[0]),
                tgtJar = Paths.get(args[1]),
                outJar = Paths.get(args[2]),
            ).run()
            println("UpdateMapper: done — ${stats.classesAnchored}/${stats.classesInReferenceTotal} ref classes anchored, " +
                "${stats.membersMapped} members mapped, ${stats.annotationsTransferred} annotations carried to ${args[2]}")
        }
    }
}
