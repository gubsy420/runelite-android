package net.runelite.mixins.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Replaces the target's method body with the mixin's body. The original target body is
 * preserved on the target class under a renamed slot ({@code __orig$<name>}) so that
 * paired {@code @Copy} methods can still invoke it.
 *
 * <p>The target method is resolved by:
 * <ol>
 *   <li>If the sibling {@code @net.runelite.api.annotations.Export} annotation is
 *       present, look it up in the export registry for the mixin's target class.</li>
 *   <li>Otherwise fall back to the mixin method's own name + descriptor.</li>
 * </ol>
 *
 * <p>The mixin method must have a descriptor matching the target's (descriptor of the
 * obfuscated method as recorded by {@code @ObfuscatedSignature}). When the descriptors
 * differ, the injector rejects the mixin.</p>
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Replace
{
}
