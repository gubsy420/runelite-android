// Default-package mixin — runescape-client's obfuscated types live in the default
// package, and Java forbids importing default-package types from a packaged source.

import net.runelite.api.annotations.Export;
import net.runelite.mixins.annotations.Inject;
import net.runelite.mixins.annotations.MethodHook;
import net.runelite.mixins.annotations.Mixin;
import net.runelite.mixins.annotations.Replace;

import java.awt.*;

@Mixin("te")
public abstract class DrawMixin
{
/*	@Replace
	@Export("DrawFull0")
	final void drawFull0Stub(Graphics var1, int var2, int var3) {

	}*/
}
