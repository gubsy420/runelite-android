package net.runelite.mixins.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Declares a mixin method as a hook for a target method. The injector adds the hook to
 * the mixin's target class as if {@code @Inject}-ed, AND inserts a call to the hook at
 * the position given by {@link #at()}.
 *
 * <p>Hook signature: must take no parameters and return {@code void}. For instance
 * targets the hook is an instance method (receives the target's {@code this}); for
 * static targets the hook is static.</p>
 *
 * <p>The target method is resolved by the {@link #value()} friendly name through the
 * mixin's target class's {@code @Export} registry.</p>
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface MethodHook
{
	/** Friendly export name of the target method to hook. */
	String value();

	/** Where in the target method to fire the hook. Defaults to {@link When#BEFORE} —
	 *  the start of the target method's body, before any instruction runs. */
	When at() default When.BEFORE;
}
