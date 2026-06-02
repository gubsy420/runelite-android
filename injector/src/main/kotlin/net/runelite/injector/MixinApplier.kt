package net.runelite.injector

import org.objectweb.asm.ClassReader
import org.objectweb.asm.Opcodes
import org.objectweb.asm.Type
import org.objectweb.asm.commons.ClassRemapper
import org.objectweb.asm.commons.Remapper
import org.objectweb.asm.tree.AnnotationNode
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.FieldInsnNode
import org.objectweb.asm.tree.FieldNode
import org.objectweb.asm.tree.InsnList
import org.objectweb.asm.tree.InsnNode
import org.objectweb.asm.tree.MethodInsnNode
import org.objectweb.asm.tree.MethodNode
import org.objectweb.asm.tree.VarInsnNode

/**
 * Applies the supported mixin annotations to target classes.
 *
 * <h2>Per-target capabilities</h2>
 * <ul>
 *   <li>@Inject field/method — verbatim add, with mixin-class self-references remapped
 *       to the target.</li>
 *   <li>@Shadow field/method — not added; references inside other injected members are
 *       rewritten to the resolved obfuscated member (via @Export when paired).</li>
 *   <li>@Replace method — target's body is renamed to {@code __orig$<n>} (so paired
 *       {@code @Copy} delegates can still call it) and the mixin's body takes the
 *       target's slot.</li>
 *   <li>@Copy method — abstract delegate that gets filled with a call to the renamed
 *       original. Body simply loads args, INVOKEs the renamed original, returns.</li>
 *   <li>@MethodHook method — added to the target AND a call to the hook is prepended to
 *       the resolved target method's body so it fires at every entry.</li>
 * </ul>
 *
 * <h2>Global capabilities</h2>
 * <ul>
 *   <li>@FieldHook — adds the hook to the target class, then at the per-class apply
 *       pass below scans EVERY method in EVERY class of the target jar for
 *       PUTFIELD/PUTSTATIC sites of the hooked field and inserts a call to the hook
 *       after the store. Driven by [FieldHookMap] built once by the [Injector] and
 *       applied per class in [rewriteFieldHookSites].</li>
 * </ul>
 */
class MixinApplier(private val exports: ExportRegistry)
{
    companion object {
        const val INJECT_DESC = "Lnet/runelite/mixins/annotations/Inject;"
        const val SHADOW_DESC = "Lnet/runelite/mixins/annotations/Shadow;"
        const val REPLACE_DESC = "Lnet/runelite/mixins/annotations/Replace;"
        const val COPY_DESC = "Lnet/runelite/mixins/annotations/Copy;"
        const val FIELD_HOOK_DESC = "Lnet/runelite/mixins/annotations/FieldHook;"
        const val METHOD_HOOK_DESC = "Lnet/runelite/mixins/annotations/MethodHook;"
        const val EXPORT_DESC = "Lnet/runelite/api/annotations/Export;"

        private const val ORIGINAL_PREFIX = "__orig$"
    }

    data class Result(
        val fieldsAdded: Int,
        val methodsAdded: Int,
        val methodsReplaced: Int,
        val methodsCopied: Int,
        val methodHooksInstalled: Int,
    )

    enum class When { BEFORE, AFTER }

    data class FieldHookInstall(
        val targetField: MemberRef,
        val hookOwner: String,
        val hookMethod: MemberRef,
        val hookIsStatic: Boolean,
        val at: When,
    )

    class FieldHookMap {
        val byField = mutableMapOf<MemberRef, MutableList<FieldHookInstall>>()
        fun add(install: FieldHookInstall) {
            byField.getOrPut(install.targetField) { mutableListOf() }.add(install)
        }
        fun isEmpty(): Boolean = byField.isEmpty()
    }

    fun apply(target: ClassNode, mixins: List<MixinDiscovery.Mixin>, fieldHookMap: FieldHookMap): Result {
        var fieldsAdded = 0
        var methodsAdded = 0
        var methodsReplaced = 0
        var methodsCopied = 0
        var methodHooksInstalled = 0

        for (mixin in mixins) {
            val mixinNode = ClassNode()
            ClassReader(mixin.mixinBytes).accept(mixinNode, 0)

            val fieldShadows = mutableMapOf<MemberRef, MemberRef>()
            val methodShadows = mutableMapOf<MemberRef, MemberRef>()
            mixinNode.fields?.forEach { mf ->
                if (!hasAnnotation(mf.visibleAnnotations, SHADOW_DESC)) return@forEach
                fieldShadows[MemberRef(target.name, mf.name, mf.desc)] =
                    resolveShadowField(mixin, mf, target.name)
            }
            mixinNode.methods?.forEach { mm ->
                if (!hasAnnotation(mm.visibleAnnotations, SHADOW_DESC)) return@forEach
                methodShadows[MemberRef(target.name, mm.name, mm.desc)] =
                    resolveShadowMethod(mixin, mm, target.name)
            }

            val rename = SingleClassRemapper(mixinNode.name, target.name)

            val copyTargetByMixinMethod = mutableMapOf<MemberRef, MemberRef>()
            mixinNode.methods?.forEach { mm ->
                if (!hasAnnotation(mm.visibleAnnotations, COPY_DESC)) return@forEach
                val origTarget = resolveReplaceOrCopyTarget(mixin, mm, target.name)
                copyTargetByMixinMethod[MemberRef(target.name, mm.name, mm.desc)] =
                    MemberRef(target.name, ORIGINAL_PREFIX + origTarget.name, origTarget.desc)
            }

            // --- @Inject fields (verbatim add) ---
            mixinNode.fields?.forEach { mf ->
                if (!hasAnnotation(mf.visibleAnnotations, INJECT_DESC)) return@forEach
                requireNoFieldCollision(target, mf.name, mf.desc, mixin)
                val remapped = FieldNode(
                    mf.access,
                    mf.name,
                    rename.mapDesc(mf.desc),
                    mf.signature?.let { rename.mapSignature(it, true) },
                    mf.value,
                )
                target.fields = target.fields ?: mutableListOf()
                target.fields.add(remapped)
                fieldsAdded++
            }

            // --- @Replace: rename target method to __orig$<n>, install mixin's body ---
            val replaceMixinMethods = mixinNode.methods?.filter {
                hasAnnotation(it.visibleAnnotations, REPLACE_DESC)
            }.orEmpty()
            for (mm in replaceMixinMethods) {
                val targetMember = resolveReplaceOrCopyTarget(mixin, mm, target.name)
                val targetMethod = target.methods?.firstOrNull {
                    it.name == targetMember.name && it.desc == targetMember.desc
                } ?: error("mixin ${mixin.mixinClassName} @Replace cannot find target ${targetMember.owner}.${targetMember.name}${targetMember.desc}")
                val originalName = ORIGINAL_PREFIX + targetMember.name
                require(target.methods.none { it.name == originalName && it.desc == targetMember.desc }) {
                    "mixin ${mixin.mixinClassName} @Replace would overwrite an existing renamed-original $originalName${targetMember.desc} on ${target.name}"
                }
                targetMethod.name = originalName
                val staged = stageMethod(mixinNode, mm, target, rename)
                staged.name = targetMember.name
                rewriteShadowReferences(staged, fieldShadows, methodShadows)
                rewriteDeobfReferences(staged)
                target.methods.add(staged)
                methodsReplaced++
            }

            // --- @Inject methods (verbatim add) ---
            val injectedMixinMethods = mixinNode.methods?.filter {
                hasAnnotation(it.visibleAnnotations, INJECT_DESC)
            }.orEmpty()
            for (mm in injectedMixinMethods) {
                val staged = stageMethod(mixinNode, mm, target, rename)
                rewriteShadowReferences(staged, fieldShadows, methodShadows)
                rewriteDeobfReferences(staged)
                requireNoMethodCollision(target, staged.name, staged.desc, mixin)
                target.methods = target.methods ?: mutableListOf()
                target.methods.add(staged)
                methodsAdded++
            }

            // --- @Copy: fill abstract body with INVOKE of the renamed original ---
            val copyMixinMethods = mixinNode.methods?.filter {
                hasAnnotation(it.visibleAnnotations, COPY_DESC)
            }.orEmpty()
            for (mm in copyMixinMethods) {
                val original = copyTargetByMixinMethod[MemberRef(target.name, mm.name, mm.desc)]
                    ?: error("internal: copy target missing for ${mm.name}${mm.desc}")
                val copyMethod = stageMethod(mixinNode, mm, target, rename)
                fillCopyBody(copyMethod, target, original)
                requireNoMethodCollision(target, copyMethod.name, copyMethod.desc, mixin)
                target.methods.add(copyMethod)
                methodsCopied++
            }

            // --- @MethodHook: add hook, prepend INVOKE to target's body ---
            val methodHooks = mixinNode.methods?.filter {
                hasAnnotation(it.visibleAnnotations, METHOD_HOOK_DESC)
            }.orEmpty()
            for (mm in methodHooks) {
                val friendly = readAnnoString(mm.visibleAnnotations, METHOD_HOOK_DESC, "value")
                    ?: error("@MethodHook on ${mixin.mixinClassName}.${mm.name}${mm.desc} missing value()")
                val resolved = exports.resolveMethod(target.name, friendly)
                    ?: error("@MethodHook($friendly) on ${mixin.mixinClassName} not in export registry; known: ${exports.knownExportsOn(target.name)}")
                val targetMethod = target.methods?.firstOrNull {
                    it.name == resolved.obfuscatedName && it.desc == resolved.obfuscatedDescriptor
                } ?: error("@MethodHook($friendly) resolved to ${resolved.obfuscatedName}${resolved.obfuscatedDescriptor} but no such method exists on ${target.name}")
                require(mm.desc == "()V") { "@MethodHook ${mixin.mixinClassName}.${mm.name} must have descriptor ()V; got ${mm.desc}" }
                val hookIsStatic = (mm.access and Opcodes.ACC_STATIC) != 0
                val targetIsStatic = (targetMethod.access and Opcodes.ACC_STATIC) != 0
                require(hookIsStatic == targetIsStatic) {
                    "@MethodHook ${mixin.mixinClassName}.${mm.name} static-ness must match the target's"
                }
                val staged = stageMethod(mixinNode, mm, target, rename)
                rewriteShadowReferences(staged, fieldShadows, methodShadows)
                rewriteDeobfReferences(staged)
                requireNoMethodCollision(target, staged.name, staged.desc, mixin)
                target.methods.add(staged)
                val at = readAnnoEnum(mm.visibleAnnotations, METHOD_HOOK_DESC, "at") ?: When.BEFORE
                when (at) {
                    When.BEFORE -> prependHookCall(targetMethod, target.name, MemberRef(target.name, staged.name, staged.desc), hookIsStatic)
                    When.AFTER -> insertHookBeforeEveryReturn(targetMethod, target.name, MemberRef(target.name, staged.name, staged.desc), hookIsStatic)
                }
                methodHooksInstalled++
            }

            // --- @FieldHook: add hook, register a global PUTFIELD/PUTSTATIC patch ---
            val fieldHooks = mixinNode.methods?.filter {
                hasAnnotation(it.visibleAnnotations, FIELD_HOOK_DESC)
            }.orEmpty()
            for (mm in fieldHooks) {
                val friendly = readAnnoString(mm.visibleAnnotations, FIELD_HOOK_DESC, "value")
                    ?: error("@FieldHook on ${mixin.mixinClassName}.${mm.name}${mm.desc} missing value()")
                val resolved = exports.resolveField(target.name, friendly)
                    ?: error("@FieldHook($friendly) on ${mixin.mixinClassName} not in export registry; known: ${exports.knownExportsOn(target.name)}")
                val argTypes = Type.getArgumentTypes(mm.desc)
                require(argTypes.size == 1 && argTypes[0].descriptor == resolved.obfuscatedDescriptor) {
                    "@FieldHook ${mixin.mixinClassName}.${mm.name}${mm.desc} must take exactly one parameter of type ${resolved.obfuscatedDescriptor}"
                }
                require(Type.getReturnType(mm.desc).sort == Type.VOID) {
                    "@FieldHook ${mixin.mixinClassName}.${mm.name}${mm.desc} must return void"
                }
                val hookIsStatic = (mm.access and Opcodes.ACC_STATIC) != 0
                val staged = stageMethod(mixinNode, mm, target, rename)
                rewriteShadowReferences(staged, fieldShadows, methodShadows)
                rewriteDeobfReferences(staged)
                requireNoMethodCollision(target, staged.name, staged.desc, mixin)
                target.methods.add(staged)
                val at = readAnnoEnum(mm.visibleAnnotations, FIELD_HOOK_DESC, "at") ?: When.AFTER
                fieldHookMap.add(
                    FieldHookInstall(
                        targetField = MemberRef(target.name, resolved.obfuscatedName, resolved.obfuscatedDescriptor),
                        hookOwner = target.name,
                        hookMethod = MemberRef(target.name, staged.name, staged.desc),
                        hookIsStatic = hookIsStatic,
                        at = at,
                    )
                )
            }

            mixinNode.fields?.forEach { rejectUnknownMixinAnnotations(it.visibleAnnotations, mixin, "field ${it.name}") }
            mixinNode.methods?.forEach { rejectUnknownMixinAnnotations(it.visibleAnnotations, mixin, "method ${it.name}${it.desc}") }
        }

        return Result(fieldsAdded, methodsAdded, methodsReplaced, methodsCopied, methodHooksInstalled)
    }

    fun rewriteFieldHookSites(cn: ClassNode, fieldHookMap: FieldHookMap): Int {
        if (fieldHookMap.isEmpty() || cn.methods == null) return 0
        var patched = 0
        for (mn in cn.methods) {
            val insns = mn.instructions ?: continue
            var insn = insns.first
            while (insn != null) {
                val next = insn.next
                if (insn is FieldInsnNode && (insn.opcode == Opcodes.PUTFIELD || insn.opcode == Opcodes.PUTSTATIC)) {
                    val key = MemberRef(insn.owner, insn.name, insn.desc)
                    val hooks = fieldHookMap.byField[key]
                    if (hooks != null) {
                        for (h in hooks) {
                            insertFieldHookAround(insns, insn, h)
                            patched++
                        }
                    }
                }
                insn = next
            }
        }
        return patched
    }

    // ----------------------------------------------------------------------------------
    // helpers
    // ----------------------------------------------------------------------------------

    private fun stageMethod(mixinNode: ClassNode, mm: MethodNode, target: ClassNode, rename: Remapper): MethodNode {
        val staging = ClassNode()
        val visitor = ClassRemapper(staging, rename)
        visitor.visit(mixinNode.version, mixinNode.access, target.name, null, "java/lang/Object", null)
        mm.accept(visitor)
        visitor.visitEnd()
        return staging.methods.single()
    }

    private fun resolveShadowField(mixin: MixinDiscovery.Mixin, fn: FieldNode, targetOwner: String): MemberRef {
        val exportName = readAnnoString(fn.visibleAnnotations, EXPORT_DESC, "value")
        if (exportName != null) {
            val resolved = exports.resolveField(targetOwner, exportName)
                ?: error("mixin ${mixin.mixinClassName} field ${fn.name} @Shadow @Export(\"$exportName\") not in export registry on $targetOwner; known: ${exports.knownExportsOn(targetOwner)}")
            return MemberRef(targetOwner, resolved.obfuscatedName, resolved.obfuscatedDescriptor)
        }
        return MemberRef(targetOwner, fn.name, fn.desc)
    }

    private fun resolveShadowMethod(mixin: MixinDiscovery.Mixin, mn: MethodNode, targetOwner: String): MemberRef {
        val exportName = readAnnoString(mn.visibleAnnotations, EXPORT_DESC, "value")
        if (exportName != null) {
            val resolved = exports.resolveMethod(targetOwner, exportName)
                ?: error("mixin ${mixin.mixinClassName} method ${mn.name}${mn.desc} @Shadow @Export(\"$exportName\") not in export registry on $targetOwner; known: ${exports.knownExportsOn(targetOwner)}")
            return MemberRef(targetOwner, resolved.obfuscatedName, resolved.obfuscatedDescriptor)
        }
        return MemberRef(targetOwner, mn.name, mn.desc)
    }

    private fun resolveReplaceOrCopyTarget(mixin: MixinDiscovery.Mixin, mm: MethodNode, targetOwner: String): MemberRef {
        val exportName = readAnnoString(mm.visibleAnnotations, EXPORT_DESC, "value")
        if (exportName != null) {
            val resolved = exports.resolveMethod(targetOwner, exportName)
                ?: error("mixin ${mixin.mixinClassName} method ${mm.name}${mm.desc} @Export(\"$exportName\") not in export registry on $targetOwner; known: ${exports.knownExportsOn(targetOwner)}")
            return MemberRef(targetOwner, resolved.obfuscatedName, resolved.obfuscatedDescriptor)
        }
        return MemberRef(targetOwner, mm.name, mm.desc)
    }

    private fun rewriteShadowReferences(
        mn: MethodNode,
        fieldShadows: Map<MemberRef, MemberRef>,
        methodShadows: Map<MemberRef, MemberRef>,
    ) {
        val insns = mn.instructions ?: return
        for (insn in insns) {
            when (insn) {
                is FieldInsnNode -> {
                    val key = MemberRef(insn.owner, insn.name, insn.desc)
                    fieldShadows[key]?.let { tgt ->
                        insn.owner = tgt.owner
                        insn.name = tgt.name
                        insn.desc = tgt.desc
                    }
                }
                is MethodInsnNode -> {
                    val key = MemberRef(insn.owner, insn.name, insn.desc)
                    methodShadows[key]?.let { tgt ->
                        insn.owner = tgt.owner
                        insn.name = tgt.name
                        insn.desc = tgt.desc
                    }
                }
            }
        }
    }

    /**
     * Walks the staged method's instructions and translates every FieldInsnNode /
     * MethodInsnNode whose (owner, name, desc) matches a runescape-client member's
     * deobfuscated identity into its obfuscated identity. This is what lets a mixin
     * write {@code kg.ps_fld.bt_fld} — referencing the renamed runescape-client field
     * names — and have the bytecode actually resolve against the obfuscated jar at
     * runtime. Shadow rewrites already happened before this; matches there fall through
     * the obfuscation map untouched (the deobf key won't match the now-rewritten ref).
     */
    private fun rewriteDeobfReferences(mn: MethodNode) {
        val insns = mn.instructions ?: return
        for (insn in insns) {
            when (insn) {
                is FieldInsnNode -> {
                    exports.lookupDeobfMember(insn.owner, insn.name, insn.desc)?.let { tgt ->
                        insn.owner = tgt.owner
                        insn.name = tgt.name
                        insn.desc = tgt.desc
                    }
                }
                is MethodInsnNode -> {
                    exports.lookupDeobfMember(insn.owner, insn.name, insn.desc)?.let { tgt ->
                        insn.owner = tgt.owner
                        insn.name = tgt.name
                        insn.desc = tgt.desc
                    }
                }
            }
        }
    }

    /** Replaces the @Copy method's body with one that loads args + `this`, INVOKEs the
     *  renamed-original, and returns. */
    private fun fillCopyBody(copy: MethodNode, target: ClassNode, original: MemberRef) {
        val args = Type.getArgumentTypes(copy.desc)
        val ret = Type.getReturnType(copy.desc)
        val isStatic = (copy.access and Opcodes.ACC_STATIC) != 0
        val insns = InsnList()
        var localIndex = if (isStatic) 0 else 1
        if (!isStatic) insns.add(VarInsnNode(Opcodes.ALOAD, 0))
        for (t in args) {
            insns.add(VarInsnNode(t.getOpcode(Opcodes.ILOAD), localIndex))
            localIndex += t.size
        }
        // INVOKESPECIAL on a same-class non-private method bypasses virtual dispatch and
        // calls THIS class's implementation — what we want for delegating to the renamed
        // original.
        val invokeOpcode = if (isStatic) Opcodes.INVOKESTATIC else Opcodes.INVOKESPECIAL
        insns.add(MethodInsnNode(invokeOpcode, target.name, original.name, original.desc, false))
        insns.add(InsnNode(ret.getOpcode(Opcodes.IRETURN)))
        copy.instructions = insns
        copy.access = copy.access and Opcodes.ACC_ABSTRACT.inv()
        copy.tryCatchBlocks = mutableListOf()
        var stack = if (isStatic) 0 else 1
        for (t in args) stack += t.size
        if (stack < ret.size) stack = ret.size
        copy.maxStack = stack
        copy.maxLocals = localIndex
    }

    private fun prependHookCall(target: MethodNode, targetOwner: String, hook: MemberRef, isStatic: Boolean) {
        val insns = target.instructions ?: return
        val pre = buildHookCall(targetOwner, hook, isStatic)
        val first = insns.first
        if (first != null) insns.insertBefore(first, pre) else insns.add(pre)
        if (target.maxStack < 1) target.maxStack = 1
    }

    /** Walk every instruction; before each RETURN-family opcode (IRETURN..RETURN),
     *  insert a call to {@code hook}. Catches every normal exit path; ATHROW exits are
     *  intentionally NOT covered (callers needing exception-path hooks should use
     *  try/finally instead). */
    private fun insertHookBeforeEveryReturn(target: MethodNode, targetOwner: String, hook: MemberRef, isStatic: Boolean) {
        val insns = target.instructions ?: return
        var insn = insns.first
        while (insn != null) {
            val next = insn.next
            val op = insn.opcode
            if (op in Opcodes.IRETURN..Opcodes.RETURN) {
                val call = buildHookCall(targetOwner, hook, isStatic)
                insns.insertBefore(insn, call)
            }
            insn = next
        }
        if (target.maxStack < 1) target.maxStack = 1
    }

    private fun buildHookCall(targetOwner: String, hook: MemberRef, isStatic: Boolean): InsnList {
        val list = InsnList()
        if (!isStatic) list.add(VarInsnNode(Opcodes.ALOAD, 0))
        list.add(
            MethodInsnNode(
                if (isStatic) Opcodes.INVOKESTATIC else Opcodes.INVOKEVIRTUAL,
                targetOwner,
                hook.name,
                hook.desc,
                false,
            )
        )
        return list
    }

    /**
     * Wraps a PUTFIELD/PUTSTATIC with a hook call at the position given by
     * {@code hook.at}.
     *
     * <p>BEFORE: stack pre-write is duplicated, the hook is invoked on the duplicate
     * (consuming it), and the put then commits the original copy.
     * AFTER: stack pre-write is duplicated, the put commits one copy, the hook is
     * invoked on the other.</p>
     *
     * <p>Static PUTSTATIC pre-stack: {@code [..., value]}. Instance PUTFIELD pre-stack:
     * {@code [..., owner, value]}. Currently supports 1-slot field types only — 2-slot
     * (long/double) PUTFIELD needs more elaborate DUP2_X1 juggling to keep the owner
     * around for the hook call; we'll add it when an actual long/double export demands it.</p>
     */
    private fun insertFieldHookAround(insns: InsnList, put: FieldInsnNode, hook: FieldHookInstall) {
        val isStaticWrite = put.opcode == Opcodes.PUTSTATIC
        val fieldType = Type.getType(put.desc)
        val twoSlot = fieldType.size == 2
        require(!twoSlot) {
            "@FieldHook on a long/double field (${put.owner}.${put.name}) is not yet supported"
        }
        val dup = InsnList()
        if (isStaticWrite) {
            dup.add(InsnNode(Opcodes.DUP))
        } else {
            // Stack: ... owner value → after DUP2: ... owner value owner value
            dup.add(InsnNode(Opcodes.DUP2))
        }
        val call = InsnList()
        call.add(
            MethodInsnNode(
                if (hook.hookIsStatic) Opcodes.INVOKESTATIC else Opcodes.INVOKEVIRTUAL,
                hook.hookOwner,
                hook.hookMethod.name,
                hook.hookMethod.desc,
                false,
            )
        )
        when (hook.at) {
            When.BEFORE -> {
                // dup ; call ; put → hook sees the value, then the put commits.
                insns.insertBefore(put, dup)
                insns.insertBefore(put, call)
            }
            When.AFTER -> {
                // dup ; put ; call → put commits, then hook sees the value.
                insns.insertBefore(put, dup)
                insns.insert(put, call)
            }
        }
    }

    private fun rejectUnknownMixinAnnotations(annos: List<AnnotationNode>?, mixin: MixinDiscovery.Mixin, member: String) {
        if (annos == null) return
        for (a in annos) {
            if (!a.desc.startsWith("Lnet/runelite/mixins/annotations/")) continue
            val known = a.desc == INJECT_DESC || a.desc == SHADOW_DESC
                || a.desc == REPLACE_DESC || a.desc == COPY_DESC
                || a.desc == FIELD_HOOK_DESC || a.desc == METHOD_HOOK_DESC
            if (!known) {
                error("mixin ${mixin.mixinClassName} $member uses unsupported annotation ${a.desc}")
            }
        }
    }

    private fun hasAnnotation(annos: List<AnnotationNode>?, desc: String): Boolean =
        annos?.any { it.desc == desc } == true

    private fun readAnnoString(annos: List<AnnotationNode>?, desc: String, key: String): String? {
        val anno = annos?.firstOrNull { it.desc == desc } ?: return null
        val values = anno.values ?: return null
        var i = 0
        while (i + 1 < values.size) {
            if (values[i] == key) return values[i + 1] as? String
            i += 2
        }
        return null
    }

    /** Reads a {@code When} enum value from an annotation. ASM encodes enum values as
     *  {@code String[] {descriptor, valueName}} pairs in the {@code values} list, so
     *  we pull out the second element of the pair and match by name. */
    private fun readAnnoEnum(annos: List<AnnotationNode>?, desc: String, key: String): When? {
        val anno = annos?.firstOrNull { it.desc == desc } ?: return null
        val values = anno.values ?: return null
        var i = 0
        while (i + 1 < values.size) {
            if (values[i] == key) {
                val arr = values[i + 1] as? Array<*> ?: return null
                if (arr.size < 2) return null
                return when (arr[1] as? String) {
                    "BEFORE" -> When.BEFORE
                    "AFTER" -> When.AFTER
                    else -> null
                }
            }
            i += 2
        }
        return null
    }

    private fun requireNoFieldCollision(target: ClassNode, name: String, desc: String, mixin: MixinDiscovery.Mixin) {
        val collides = target.fields?.any { it.name == name && it.desc == desc } == true
        require(!collides) {
            "field ${target.name}.$name$desc already exists; mixin ${mixin.mixinClassName} @Inject would overwrite"
        }
    }

    private fun requireNoMethodCollision(target: ClassNode, name: String, desc: String, mixin: MixinDiscovery.Mixin) {
        val collides = target.methods?.any { it.name == name && it.desc == desc } == true
        require(!collides) {
            "method ${target.name}.$name$desc already exists; mixin ${mixin.mixinClassName} would overwrite"
        }
    }
}

data class MemberRef(val owner: String, val name: String, val desc: String)

/** Remapper that rewrites a single class internal name to another. */
private class SingleClassRemapper(
    private val fromInternalName: String,
    private val toInternalName: String,
) : Remapper() {
    override fun map(internalName: String?): String =
        if (internalName == fromInternalName) toInternalName else internalName ?: ""
}
