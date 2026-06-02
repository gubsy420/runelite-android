package net.runelite.mixins.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Declares a mixin method as a hook for a target field. The injector adds the hook to
 * the mixin's target class as if {@code @Inject}-ed AND walks every {@code PUTFIELD}/
 * {@code PUTSTATIC} site in the target jar that writes to the named field, inserting a
 * call to the hook at the position given by {@link #at()}.
 *
 * <p>Hook signature: must take exactly one parameter whose type matches the field's
 * type (the value being / just stored). The hook's return type must be {@code void}.
 * For instance fields, the hook is an instance method on the target (receives the
 * owning instance as {@code this}); for static fields, the hook is static.</p>
 *
 * <p>The target field is resolved by the {@link #value()} friendly name through the
 * mixin's target class's {@code @Export} registry.</p>
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface FieldHook
{
	/** Friendly export name of the target field. */
	String value();

	/** Where in the write to fire the hook. Defaults to {@link When#AFTER} — the hook
	 *  fires immediately after the {@code PUTFIELD}/{@code PUTSTATIC} commits, seeing
	 *  the just-stored value. */
	When at() default When.AFTER;
}
