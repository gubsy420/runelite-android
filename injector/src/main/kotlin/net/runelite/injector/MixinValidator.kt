package net.runelite.injector

import org.objectweb.asm.Opcodes
import org.objectweb.asm.Type
import org.objectweb.asm.tree.AnnotationNode
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.FieldNode
import org.objectweb.asm.tree.MethodNode

/**
 * Validates every mixin's annotations against its target before any bytecode rewriting
 * happens. Collects all problems for all mixins, all members, then errors with the
 * combined list — so adding 10 bad mixins doesn't take 10 failed runs to surface.
 *
 * <h2>Rules enforced</h2>
 *
 * <p><b>Mutual exclusivity</b>: a member may carry at most one of
 * {@code @Inject / @Shadow / @Replace / @Copy / @MethodHook / @FieldHook}.
 * {@code @Export} is a modifier, not a primary annotation, and may coexist with
 * {@code @Shadow / @Replace / @Copy}.</p>
 *
 * <p><b>Per-annotation rules</b>:</p>
 * <ul>
 *   <li>{@code @Inject} (field): no existing target field with same name+desc.</li>
 *   <li>{@code @Inject} (method): not abstract; not {@code <init>}/{@code <clinit>};
 *       no existing target method with same name+desc.</li>
 *   <li>{@code @Shadow} (field): target field exists; mixin desc matches target's
 *       obfuscated desc; static-ness matches.</li>
 *   <li>{@code @Shadow} (method): target method exists; mixin desc matches; static-ness
 *       matches; mixin method is abstract (body is never used).</li>
 *   <li>{@code @Replace}: target method exists; mixin desc matches target's; static-ness
 *       matches; not abstract; not {@code <init>}/{@code <clinit>}.</li>
 *   <li>{@code @Copy}: target method exists; mixin desc matches; static-ness matches;
 *       mixin method is abstract (we generate the body); a sibling {@code @Replace} for
 *       the same target should exist (warning, not error — the @Copy still works on
 *       its own as a method-renaming export).</li>
 *   <li>{@code @MethodHook}: target method exists; hook descriptor is {@code ()V};
 *       static-ness matches the target's; not abstract; not init/clinit.</li>
 *   <li>{@code @FieldHook}: target field exists; hook takes exactly one parameter of
 *       the field's exact type; returns void; static-ness matches the field's; not
 *       abstract; not init/clinit.</li>
 * </ul>
 */
class MixinValidator(private val exports: ExportRegistry)
{
    private val PRIMARY_ANNOTATIONS = listOf(
        MixinApplier.INJECT_DESC,
        MixinApplier.SHADOW_DESC,
        MixinApplier.REPLACE_DESC,
        MixinApplier.COPY_DESC,
        MixinApplier.METHOD_HOOK_DESC,
        MixinApplier.FIELD_HOOK_DESC,
    )

    /**
     * Validates one mixin class against its resolved target. Returns the (possibly
     * empty) list of error strings.
     */
    fun validate(mixin: ClassNode, target: ClassNode, mixinFriendlyName: String): List<String> {
        val errors = mutableListOf<String>()
        val ctx = "mixin ${mixin.name} (@Mixin(\"$mixinFriendlyName\") → ${target.name})"

        mixin.fields?.forEach { fn ->
            checkFieldMutualExclusivity(fn, ctx, errors)
            val primary = primaryAnnotationOf(fn.visibleAnnotations)
            when (primary) {
                MixinApplier.INJECT_DESC -> checkInjectField(fn, target, ctx, errors)
                MixinApplier.SHADOW_DESC -> checkShadowField(fn, target, ctx, errors)
                null -> { /* field with no primary mixin annotation — fine */ }
                else -> errors.add("$ctx field ${fn.name} has unsupported field-level annotation $primary")
            }
        }

        mixin.methods?.forEach { mn ->
            if (mn.name == "<init>" || mn.name == "<clinit>") {
                // The Java compiler emits a default <init> for the mixin class — that's
                // an artifact of having `public abstract class Mixin {}`, not a member
                // we should inject. Skip.
                return@forEach
            }
            checkMethodMutualExclusivity(mn, ctx, errors)
            val primary = primaryAnnotationOf(mn.visibleAnnotations)
            when (primary) {
                MixinApplier.INJECT_DESC -> checkInjectMethod(mn, target, ctx, errors)
                MixinApplier.SHADOW_DESC -> checkShadowMethod(mn, target, ctx, errors)
                MixinApplier.REPLACE_DESC -> checkReplaceMethod(mn, target, ctx, errors)
                MixinApplier.COPY_DESC -> checkCopyMethod(mn, mixin, target, ctx, errors)
                MixinApplier.METHOD_HOOK_DESC -> checkMethodHookMethod(mn, target, ctx, errors)
                MixinApplier.FIELD_HOOK_DESC -> checkFieldHookMethod(mn, target, ctx, errors)
                null -> { /* no primary; ignored as harmless surface */ }
                else -> errors.add("$ctx method ${mn.name}${mn.desc} has unsupported annotation $primary")
            }
        }

        return errors
    }

    // ----------------------------------------------------------------------------------
    // exclusivity
    // ----------------------------------------------------------------------------------

    private fun primaryAnnotationOf(annos: List<AnnotationNode>?): String? {
        if (annos == null) return null
        return annos.firstOrNull { it.desc in PRIMARY_ANNOTATIONS }?.desc
    }

    private fun checkFieldMutualExclusivity(fn: FieldNode, ctx: String, errors: MutableList<String>) {
        val present = fn.visibleAnnotations?.filter { it.desc in PRIMARY_ANNOTATIONS }?.map { it.desc } ?: return
        if (present.size > 1) {
            errors.add("$ctx field ${fn.name} carries multiple primary mixin annotations: $present — pick one")
        }
    }

    private fun checkMethodMutualExclusivity(mn: MethodNode, ctx: String, errors: MutableList<String>) {
        val present = mn.visibleAnnotations?.filter { it.desc in PRIMARY_ANNOTATIONS }?.map { it.desc } ?: return
        if (present.size > 1) {
            errors.add("$ctx method ${mn.name}${mn.desc} carries multiple primary mixin annotations: $present — pick one")
        }
    }

    // ----------------------------------------------------------------------------------
    // @Inject
    // ----------------------------------------------------------------------------------

    private fun checkInjectField(fn: FieldNode, target: ClassNode, ctx: String, errors: MutableList<String>) {
        if (target.fields?.any { it.name == fn.name && it.desc == fn.desc } == true) {
            errors.add("$ctx @Inject field ${fn.name}${fn.desc} collides with existing field on target ${target.name}")
        }
    }

    private fun checkInjectMethod(mn: MethodNode, target: ClassNode, ctx: String, errors: MutableList<String>) {
        if ((mn.access and Opcodes.ACC_ABSTRACT) != 0) {
            errors.add("$ctx @Inject method ${mn.name}${mn.desc} must not be abstract")
        }
        if ((mn.access and Opcodes.ACC_NATIVE) != 0) {
            errors.add("$ctx @Inject method ${mn.name}${mn.desc} must not be native")
        }
        if (target.methods?.any { it.name == mn.name && it.desc == mn.desc } == true) {
            errors.add("$ctx @Inject method ${mn.name}${mn.desc} collides with existing method on target ${target.name}")
        }
    }

    // ----------------------------------------------------------------------------------
    // @Shadow
    // ----------------------------------------------------------------------------------

    private fun checkShadowField(fn: FieldNode, target: ClassNode, ctx: String, errors: MutableList<String>) {
        val exportName = readAnnoString(fn.visibleAnnotations, MixinApplier.EXPORT_DESC, "value")
        val targetMember = if (exportName != null) {
            val resolved = exports.resolveField(target.name, exportName)
            if (resolved == null) {
                errors.add("$ctx @Shadow @Export(\"$exportName\") on field ${fn.name} not in export registry on ${target.name}; known: ${exports.knownExportsOn(target.name)}")
                return
            }
            target.fields?.firstOrNull { it.name == resolved.obfuscatedName && it.desc == resolved.obfuscatedDescriptor }
        } else {
            target.fields?.firstOrNull { it.name == fn.name && it.desc == fn.desc }
        }
        if (targetMember == null) {
            errors.add("$ctx @Shadow field ${fn.name}${fn.desc} has no matching field on target ${target.name}")
            return
        }
        if (targetMember.desc != fn.desc) {
            errors.add("$ctx @Shadow field ${fn.name}: descriptor ${fn.desc} doesn't match target's ${targetMember.desc}")
        }
        val mixinStatic = (fn.access and Opcodes.ACC_STATIC) != 0
        val targetStatic = (targetMember.access and Opcodes.ACC_STATIC) != 0
        if (mixinStatic != targetStatic) {
            errors.add("$ctx @Shadow field ${fn.name}: static-ness (mixin=${if (mixinStatic) "static" else "instance"}) doesn't match target's (${if (targetStatic) "static" else "instance"})")
        }
    }

    private fun checkShadowMethod(mn: MethodNode, target: ClassNode, ctx: String, errors: MutableList<String>) {
        val exportName = readAnnoString(mn.visibleAnnotations, MixinApplier.EXPORT_DESC, "value")
        val targetMember = if (exportName != null) {
            val resolved = exports.resolveMethod(target.name, exportName)
            if (resolved == null) {
                errors.add("$ctx @Shadow @Export(\"$exportName\") on method ${mn.name}${mn.desc} not in export registry on ${target.name}; known: ${exports.knownExportsOn(target.name)}")
                return
            }
            target.methods?.firstOrNull { it.name == resolved.obfuscatedName && it.desc == resolved.obfuscatedDescriptor }
        } else {
            target.methods?.firstOrNull { it.name == mn.name && it.desc == mn.desc }
        }
        if (targetMember == null) {
            errors.add("$ctx @Shadow method ${mn.name}${mn.desc} has no matching method on target ${target.name}")
            return
        }
        if (targetMember.desc != mn.desc) {
            errors.add("$ctx @Shadow method ${mn.name}: descriptor ${mn.desc} doesn't match target's ${targetMember.desc}")
        }
        val mixinStatic = (mn.access and Opcodes.ACC_STATIC) != 0
        val targetStatic = (targetMember.access and Opcodes.ACC_STATIC) != 0
        if (mixinStatic != targetStatic) {
            errors.add("$ctx @Shadow method ${mn.name}: static-ness (mixin=${if (mixinStatic) "static" else "instance"}) doesn't match target's (${if (targetStatic) "static" else "instance"})")
        }
        if ((mn.access and Opcodes.ACC_ABSTRACT) == 0) {
            errors.add("$ctx @Shadow method ${mn.name}${mn.desc} should be abstract (its body is never used; declare with `abstract` to make the intent clear)")
        }
    }

    // ----------------------------------------------------------------------------------
    // @Replace / @Copy (similar setup — both target a method we're stashing or wrapping)
    // ----------------------------------------------------------------------------------

    private fun checkReplaceMethod(mn: MethodNode, target: ClassNode, ctx: String, errors: MutableList<String>) {
        val targetMember = resolveTargetMethodForReplaceOrCopy(mn, target, ctx, "@Replace", errors) ?: return
        if (targetMember.desc != mn.desc) {
            errors.add("$ctx @Replace ${mn.name}${mn.desc}: descriptor doesn't match target's ${targetMember.desc}")
        }
        val mixinStatic = (mn.access and Opcodes.ACC_STATIC) != 0
        val targetStatic = (targetMember.access and Opcodes.ACC_STATIC) != 0
        if (mixinStatic != targetStatic) {
            errors.add("$ctx @Replace ${mn.name}: static-ness (mixin=${if (mixinStatic) "static" else "instance"}) doesn't match target's (${if (targetStatic) "static" else "instance"})")
        }
        if ((mn.access and Opcodes.ACC_ABSTRACT) != 0) {
            errors.add("$ctx @Replace ${mn.name}${mn.desc} must not be abstract — Replace needs a body to install")
        }
    }

    private fun checkCopyMethod(mn: MethodNode, mixin: ClassNode, target: ClassNode, ctx: String, errors: MutableList<String>) {
        val targetMember = resolveTargetMethodForReplaceOrCopy(mn, target, ctx, "@Copy", errors) ?: return
        if (targetMember.desc != mn.desc) {
            errors.add("$ctx @Copy ${mn.name}${mn.desc}: descriptor doesn't match target's ${targetMember.desc}")
        }
        val mixinStatic = (mn.access and Opcodes.ACC_STATIC) != 0
        val targetStatic = (targetMember.access and Opcodes.ACC_STATIC) != 0
        if (mixinStatic != targetStatic) {
            errors.add("$ctx @Copy ${mn.name}: static-ness (mixin=${if (mixinStatic) "static" else "instance"}) doesn't match target's (${if (targetStatic) "static" else "instance"})")
        }
        if ((mn.access and Opcodes.ACC_ABSTRACT) == 0) {
            errors.add("$ctx @Copy ${mn.name}${mn.desc} should be abstract — the injector generates its body")
        }
        // Soft check: sibling @Replace for the same target makes the @Copy useful.
        val exportName = readAnnoString(mn.visibleAnnotations, MixinApplier.EXPORT_DESC, "value")
        val pairedReplaceExists = mixin.methods?.any { om ->
            om != mn
                && om.visibleAnnotations?.any { it.desc == MixinApplier.REPLACE_DESC } == true
                && readAnnoString(om.visibleAnnotations, MixinApplier.EXPORT_DESC, "value") == exportName
                && om.desc == mn.desc
        } == true
        if (!pairedReplaceExists) {
            errors.add("$ctx @Copy ${mn.name}${mn.desc} has no sibling @Replace on the same target — the generated delegate body will reference a non-existent __orig\$${targetMember.name}")
        }
    }

    private fun resolveTargetMethodForReplaceOrCopy(
        mn: MethodNode,
        target: ClassNode,
        ctx: String,
        label: String,
        errors: MutableList<String>,
    ): MethodNode? {
        val exportName = readAnnoString(mn.visibleAnnotations, MixinApplier.EXPORT_DESC, "value")
        return if (exportName != null) {
            val resolved = exports.resolveMethod(target.name, exportName)
            if (resolved == null) {
                errors.add("$ctx $label @Export(\"$exportName\") on ${mn.name}${mn.desc} not in export registry on ${target.name}; known: ${exports.knownExportsOn(target.name)}")
                return null
            }
            val m = target.methods?.firstOrNull { it.name == resolved.obfuscatedName && it.desc == resolved.obfuscatedDescriptor }
            if (m == null) errors.add("$ctx $label resolved $exportName to ${resolved.obfuscatedName}${resolved.obfuscatedDescriptor} but no such method exists on ${target.name}")
            m
        } else {
            val m = target.methods?.firstOrNull { it.name == mn.name && it.desc == mn.desc }
            if (m == null) errors.add("$ctx $label ${mn.name}${mn.desc} has no matching method on target ${target.name}")
            m
        }
    }

    // ----------------------------------------------------------------------------------
    // @MethodHook / @FieldHook (hooks are NEW methods on target, validated against the
    // export they reference)
    // ----------------------------------------------------------------------------------

    private fun checkMethodHookMethod(mn: MethodNode, target: ClassNode, ctx: String, errors: MutableList<String>) {
        if ((mn.access and Opcodes.ACC_ABSTRACT) != 0) {
            errors.add("$ctx @MethodHook ${mn.name}${mn.desc} must not be abstract")
        }
        if (mn.desc != "()V") {
            errors.add("$ctx @MethodHook ${mn.name}${mn.desc} must have descriptor ()V (no parameters, void return)")
        }
        val friendly = readAnnoString(mn.visibleAnnotations, MixinApplier.METHOD_HOOK_DESC, "value")
        if (friendly == null) {
            errors.add("$ctx @MethodHook on ${mn.name}${mn.desc} missing value()")
            return
        }
        val resolved = exports.resolveMethod(target.name, friendly)
        if (resolved == null) {
            errors.add("$ctx @MethodHook(\"$friendly\") on ${mn.name} not in export registry on ${target.name}; known: ${exports.knownExportsOn(target.name)}")
            return
        }
        val targetMethod = target.methods?.firstOrNull { it.name == resolved.obfuscatedName && it.desc == resolved.obfuscatedDescriptor }
        if (targetMethod == null) {
            errors.add("$ctx @MethodHook resolved \"$friendly\" to ${resolved.obfuscatedName}${resolved.obfuscatedDescriptor} but no such method exists on ${target.name}")
            return
        }
        val mixinStatic = (mn.access and Opcodes.ACC_STATIC) != 0
        val targetStatic = (targetMethod.access and Opcodes.ACC_STATIC) != 0
        if (mixinStatic != targetStatic) {
            errors.add("$ctx @MethodHook(\"$friendly\") ${mn.name}: hook static-ness (${if (mixinStatic) "static" else "instance"}) must match target's (${if (targetStatic) "static" else "instance"})")
        }
        if (target.methods?.any { it.name == mn.name && it.desc == mn.desc } == true) {
            errors.add("$ctx @MethodHook ${mn.name}${mn.desc} collides with existing method on target ${target.name}")
        }
    }

    private fun checkFieldHookMethod(mn: MethodNode, target: ClassNode, ctx: String, errors: MutableList<String>) {
        if ((mn.access and Opcodes.ACC_ABSTRACT) != 0) {
            errors.add("$ctx @FieldHook ${mn.name}${mn.desc} must not be abstract")
        }
        val friendly = readAnnoString(mn.visibleAnnotations, MixinApplier.FIELD_HOOK_DESC, "value")
        if (friendly == null) {
            errors.add("$ctx @FieldHook on ${mn.name}${mn.desc} missing value()")
            return
        }
        val resolved = exports.resolveField(target.name, friendly)
        if (resolved == null) {
            errors.add("$ctx @FieldHook(\"$friendly\") on ${mn.name} not in export registry on ${target.name}; known: ${exports.knownExportsOn(target.name)}")
            return
        }
        val targetField = target.fields?.firstOrNull { it.name == resolved.obfuscatedName && it.desc == resolved.obfuscatedDescriptor }
        if (targetField == null) {
            errors.add("$ctx @FieldHook resolved \"$friendly\" to ${resolved.obfuscatedName}:${resolved.obfuscatedDescriptor} but no such field exists on ${target.name}")
            return
        }
        val argTypes = Type.getArgumentTypes(mn.desc)
        if (argTypes.size != 1) {
            errors.add("$ctx @FieldHook ${mn.name}${mn.desc} must take exactly one parameter (the just-written field value)")
        } else if (argTypes[0].descriptor != resolved.obfuscatedDescriptor) {
            errors.add("$ctx @FieldHook ${mn.name}: parameter type ${argTypes[0].descriptor} doesn't match field's ${resolved.obfuscatedDescriptor}")
        }
        if (Type.getReturnType(mn.desc).sort != Type.VOID) {
            errors.add("$ctx @FieldHook ${mn.name}${mn.desc} must return void")
        }
        val mixinStatic = (mn.access and Opcodes.ACC_STATIC) != 0
        val targetStatic = (targetField.access and Opcodes.ACC_STATIC) != 0
        if (mixinStatic != targetStatic) {
            errors.add("$ctx @FieldHook(\"$friendly\") ${mn.name}: hook static-ness (${if (mixinStatic) "static" else "instance"}) must match field's (${if (targetStatic) "static" else "instance"})")
        }
        if (target.methods?.any { it.name == mn.name && it.desc == mn.desc } == true) {
            errors.add("$ctx @FieldHook ${mn.name}${mn.desc} collides with existing method on target ${target.name}")
        }
    }

    // ----------------------------------------------------------------------------------
    // misc helpers
    // ----------------------------------------------------------------------------------

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
}
