package net.runelite.mixins.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Declares a mixin field or method as a "shadow" of an existing member on the target
 * class. The mixin doesn't add the shadow to the target — it only uses the shadow as a
 * compile-time reference so other injected members can call/read it. At weave time the
 * injector REMOVES the shadow declaration from the woven class (it would otherwise
 * collide with the existing target member) and REWRITES every reference inside the
 * mixin's other injected members to point at the target's member.
 *
 * <p>The target member to bind to is resolved by:
 * <ol>
 *   <li>If the sibling {@code @net.runelite.api.annotations.Export} annotation is
 *       present on the same mixin member, look up the runescape-client class member
 *       carrying the matching {@code @Export(value)} and use its
 *       {@code @ObfuscatedName}.</li>
 *   <li>Otherwise fall back to the mixin member's own declared name and descriptor
 *       (i.e. assume the mixin member is named the same as the target).</li>
 * </ol>
 *
 * <p>To target an exported member, declare a mixin field/method with the matching
 * Java type/signature and stamp both annotations:
 * <pre>
 *   {@literal @}Shadow
 *   {@literal @}net.runelite.api.annotations.Export("init")
 *   public abstract void shadowInit();
 * </pre></p>
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD})
public @interface Shadow
{
}
