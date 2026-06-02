import net.runelite.api.Rasterizer;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("rl13")
@Implements({"Rasterizer"})
class rl13 implements Rasterizer {
	@ObfuscatedName("rasterFlat")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V"
	)
	@Override
	public void rasterFlat(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		fh.sm(var1, var2, var3, var4, var5, var6, 0.0F, 0.0F, 0.0F, var7);
	}

	@ObfuscatedName("getHeight")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getHeight() {
		return yu.ax_fld;
	}

	@ObfuscatedName("getWidth")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getWidth() {
		return yu.au_fld;
	}

	@ObfuscatedName("resetRasterClipping")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Override
	public void resetRasterClipping() {
		fc.ai();
	}

	@ObfuscatedName("getPixels")
	@ObfuscatedSignature(
		descriptor = "()[I"
	)
	@Override
	public int[] getPixels() {
		return yu.al_fld;
	}

	@ObfuscatedName("fillRectangle")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V"
	)
	@Override
	public void fillRectangle(int var1, int var2, int var3, int var4, int var5) {
		yu.dj(var1, var2, var3, var4, var5);
	}

	@ObfuscatedName("setRasterGouraudLowRes")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	@Override
	public void setRasterGouraudLowRes(boolean var1) {
		fc.ar_fld.ho(var1);
	}

	@ObfuscatedName("rasterGouraud")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIII)V"
	)
	@Override
	public void rasterGouraud(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
		fh.yy(var1, var2, var3, var4, var5, var6, 0.0F, 0.0F, 0.0F, var7, var8, var9);
	}

	@ObfuscatedName("setDrawRegion")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	@Override
	public void setDrawRegion(int var1, int var2, int var3, int var4) {
		yu.dg(var1, var2, var3, var4);
	}

	public rl13() {
	}
}
