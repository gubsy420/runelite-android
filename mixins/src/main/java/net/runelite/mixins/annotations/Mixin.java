package net.runelite.mixins.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Marks a class as a mixin targeting a class in {@code runescape-client} identified by
 * the given friendly name. The injector resolves the name via the
 * {@code @net.runelite.api.annotations.Implements} stamp on runescape-client classes —
 * a mixin like {@code @Mixin("Client")} weaves into whichever runescape-client class
 * declared {@code @Implements({"Client", ...})}, which in turn forwards the weave to
 * the matching obfuscated class in the target jar via that class's
 * {@code @ObfuscatedName}.
 *
 * <p>The friendly name remains stable across revisions even when the obfuscated names
 * change, so mixins don't need to be revisited every time Jagex re-obfuscates.</p>
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Mixin
{
	/** Friendly target name — typically the simple name of a runelite-api interface like
	 *  {@code "Client"}, {@code "Player"}, or {@code "Widget"}. The injector matches
	 *  this against any value in the runescape-client class's {@code @Implements}. */
	String value();
}
