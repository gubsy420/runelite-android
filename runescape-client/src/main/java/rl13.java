import net.runelite.api.Rasterizer;
import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("rl13")
@Implements({"Rasterizer"})
class rl13 implements Rasterizer {
	@ObfuscatedName("setRasterGouraudLowRes")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	@Export("setRasterGouraudLowRes")
	@Override
	public void setRasterGouraudLowRes(boolean var1) {
		fc.ar_fld.bd(var1);
	}

	@ObfuscatedName("getWidth")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getWidth")
	@Override
	public int getWidth() {
		return yu.au_fld;
	}

	@ObfuscatedName("rasterGouraud")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIII)V"
	)
	@Export("rasterGouraud")
	@Override
	public void rasterGouraud(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
		fh.gr(var1, var2, var3, var4, var5, var6, 0.0F, 0.0F, 0.0F, var7, var8, var9);
	}

	@ObfuscatedName("getPixels")
	@ObfuscatedSignature(
		descriptor = "()[I"
	)
	@Export("getPixels")
	@Override
	public int[] getPixels() {
		return yu.al_fld;
	}

	@ObfuscatedName("rasterFlat")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V"
	)
	@Export("rasterFlat")
	@Override
	public void rasterFlat(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		fh.fj(var1, var2, var3, var4, var5, var6, 0.0F, 0.0F, 0.0F, var7);
	}

	@ObfuscatedName("getHeight")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getHeight")
	@Override
	public int getHeight() {
		return yu.ax_fld;
	}

	@ObfuscatedName("setDrawRegion")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	@Export("setDrawRegion")
	@Override
	public void setDrawRegion(int var1, int var2, int var3, int var4) {
		yu.dg(var1, var2, var3, var4);
	}

	@ObfuscatedName("fillRectangle")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V"
	)
	@Export("fillRectangle")
	@Override
	public void fillRectangle(int var1, int var2, int var3, int var4, int var5) {
		yu.dj(var1, var2, var3, var4, var5);
	}

	@ObfuscatedName("resetRasterClipping")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Export("resetRasterClipping")
	@Override
	public void resetRasterClipping() {
		fc.ai();
	}

	public rl13() {
	}
}
