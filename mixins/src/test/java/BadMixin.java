// Deliberately-broken mixin used by InjectorBadMixinTest to confirm the validator
// catches every category of misuse with a clear, contextual error.

import net.runelite.api.annotations.Export;
import net.runelite.mixins.annotations.Copy;
import net.runelite.mixins.annotations.FieldHook;
import net.runelite.mixins.annotations.Inject;
import net.runelite.mixins.annotations.MethodHook;
import net.runelite.mixins.annotations.Mixin;
import net.runelite.mixins.annotations.Replace;
import net.runelite.mixins.annotations.Shadow;

@Mixin("Client")
public abstract class BadMixin
{
	// (1) @Inject method that's abstract → injector can't add a body-less method.
	@Inject
	public abstract void badInjectAbstract();

	// (2) @Shadow field whose descriptor doesn't match the target field's descriptor.
	//     "appletStub" resolves to client.aq:Ldf; — our int here is wrong.
	@Shadow
	@Export("appletStub")
	public static int badShadowWrongType;

	// (3) @Shadow method that isn't abstract.
	@Shadow
	@Export("init")
	public void badShadowNotAbstract()
	{
	}

	// (4) @MethodHook with the wrong static-ness — target init is instance.
	@MethodHook("init")
	public static void badHookStaticMismatch()
	{
	}

	// (5) @MethodHook with a non-()V descriptor.
	@MethodHook("init")
	public void badHookWrongDesc(int extraParam)
	{
	}

	// (6) @MethodHook referencing an unknown export.
	@MethodHook("doesNotExist")
	public void badHookUnknownExport()
	{
	}

	// (7) @FieldHook with the wrong parameter type.
	@FieldHook("appletStub")
	public static void badFieldHookWrongType(int wrongType)
	{
	}

	// (8) @FieldHook with the wrong static-ness — appletStub is static.
	@FieldHook("appletStub")
	public void badFieldHookStaticMismatch(df var1)
	{
	}

	// (9) Two primary annotations on the same method.
	@Inject
	@Replace
	@Export("init")
	public void badDoubleAnnotation()
	{
	}

	// (10) @Copy without sibling @Replace.
	@Copy
	@Export("init")
	public abstract void badCopyNoSiblingReplace();
}
