package net.runelite.mixins.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Declares an abstract mixin method as a delegate to the (preserved) original target
 * method that some sibling {@code @Replace} stashed under {@code __orig$<name>}. The
 * injector fills the abstract body with: load args, INVOKE the renamed-original, return
 * its result.
 *
 * <p>The target name is resolved the same way as {@link Replace}: via a sibling
 * {@code @net.runelite.api.annotations.Export}, or the mixin method's own name when no
 * Export is paired. The mixin method's descriptor must match the original target's
 * descriptor (which is the one the {@code @Copy} body delegates to).</p>
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Copy
{
}
