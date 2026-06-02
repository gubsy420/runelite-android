package net.runelite.mixins.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Marks a mixin member (field or method) as one to be added to the target class. The
 * injector copies the bytecode (and any required local types) verbatim from the mixin
 * class into the target. New members do not collide with existing target members — the
 * weaver renames if necessary and rewrites callers.
 *
 * <p>Distinct from {@link Replace} (which substitutes an existing target member) and
 * {@link Copy} (which clones an existing target member into the mixin's namespace for
 * delegation).</p>
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD})
public @interface Inject
{
}
