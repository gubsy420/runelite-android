// Default-package mixin — runescape-client's obfuscated types live in the default
// package, and Java forbids importing default-package types from a packaged source.

import net.runelite.api.annotations.Export;
import net.runelite.mixins.annotations.Copy;
import net.runelite.mixins.annotations.FieldHook;
import net.runelite.mixins.annotations.Inject;
import net.runelite.mixins.annotations.MethodHook;
import net.runelite.mixins.annotations.Mixin;
import net.runelite.mixins.annotations.Replace;
import net.runelite.mixins.annotations.When;

/**
 * Smoke test for every supported mixin capability against the runescape-client class
 * with {@code @Implements("Client")} (currently the obfuscated {@code client}).
 *
 * <p>Of the curated EXPORT_TABLE in the sanitizer, only {@code "init"} (and the
 * {@code aq_fld} field, exported as {@code "appletStub"}) actually exist on the
 * obfuscated client today — the other Applet lifecycle methods are inherited, not
 * overridden, so no override slot to stamp. We stack @Replace + @Copy + @MethodHook on
 * the same {@code init} target since they compose cleanly (Replace runs first;
 * MethodHook prepends to the replacement body; Copy delegates to the renamed
 * original).</p>
 *
 * <ul>
 *   <li>@Inject — static int field {@code injectorSmokeValue} + static method
 *       {@code injectorSmokeTest()} returning the field.</li>
 *   <li>@Replace + @Copy on {@code init} — target's body is renamed to
 *       {@code __orig$init} and our {@code replacementInit} body takes its slot. Our
 *       body calls {@code copyInit()} whose body the injector generates as
 *       {@code INVOKESPECIAL __orig$init()V}.</li>
 *   <li>@MethodHook on {@code init} — prepends {@code INVOKEVIRTUAL onInitEntry()V}
 *       to the (post-Replace) entry of {@code init}.</li>
 *   <li>@FieldHook on {@code appletStub} — every {@code PUTSTATIC client.aq_fld} site
 *       in the target jar gets a {@code DUP / PUTSTATIC / INVOKESTATIC
 *       onAppletStubSet(df)V} wrap.</li>
 * </ul>
 */
@Mixin("Client")
public abstract class ClientSampleMixin
{
	@Inject
	public static int injectorSmokeValue = 0x4E55;

	@Inject
	public static int injectorSmokeTest()
	{
		return injectorSmokeValue;
	}

	@Replace
	@Export("init")
	public void replacementInit()
	{
		copyInit();
	}

	@Copy
	@Export("init")
	public abstract void copyInit();

	@MethodHook("init")
	public void onInitEntry()
	{
	}

	@MethodHook(value = "init", at = When.AFTER)
	public void onInitExit()
	{
	}

	@FieldHook("appletStub")
	public static void onAppletStubSetAfter(df var1)
	{
	}

	@FieldHook(value = "appletStub", at = When.BEFORE)
	public static void onAppletStubSetBefore(df var1)
	{
	}
}
