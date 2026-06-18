import net.runelite.api.WorldView;
import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;
import net.runelite.api.coords.LocalPoint;

@ObfuscatedName("xp")
public class xp implements xl {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -2022614563
	)
	int ak_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -459485599
	)
	int ag_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1068595693
	)
	int az_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ae_fld;

	@ObfuscatedName("ta")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void ta(int var1, int var2, int var3) {
		this.ag(var1, var2, var3);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	@Override
	public int ak(int var1) {
		return this.az_fld;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V"
	)
	public void ag(int var1, int var2, int var3) {
		this.ak_fld = kj.as(var2);
		this.ag_fld = kj.as(var3);
	}

	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int hl() {
		return this.ak_fld;
	}

	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	@Override
	public int dj(int var1) {
		return this.ag_fld;
	}

	@ObfuscatedName("getWorldView")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/WorldView;"
	)
	@Export("getWorldView")
	@Override
	public WorldView getWorldView() {
		return null;
	}

	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int hg() {
		return this.ag_fld;
	}

	@ObfuscatedName("getCameraFocus")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/coords/LocalPoint;"
	)
	@Export("getCameraFocus")
	@Override
	public LocalPoint getCameraFocus() {
		return null;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int bj() {
		return this.az_fld;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int bf() {
		return this.az_fld;
	}

	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int hs() {
		return this.ak_fld;
	}

	@ObfuscatedName("hq")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int hq() {
		return this.ak_fld;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void av(int var1, int var2, int var3) {
		this.ak_fld = kj.as(var2) * 1068048041;
		this.ag_fld = kj.as(var3);
	}

	@ObfuscatedName("hw")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int hw_int() {
		return this.ag_fld;
	}

	public xp() {
	}

	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	@Override
	public int dp(int var1) {
		return this.ak_fld;
	}

	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int hv() {
		return this.ag_fld;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void az(int var1, int var2, int var3) {
		this.ak_fld = kj.as(var2);
		this.ag_fld = kj.as(var3);
	}

	@ObfuscatedName("hc")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int hc() {
		return this.ak_fld;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void ae(int var1, int var2, int var3) {
		this.ak_fld = kj.as(var2);
		this.ag_fld = kj.as(var3);
	}

	@ObfuscatedName("yd")
	@ObfuscatedSignature(
		descriptor = "()F"
	)
	@Override
	public float yd() {
		return this.ak_fld;
	}

	@ObfuscatedName("kn")
	@ObfuscatedSignature(
		descriptor = "()F"
	)
	@Override
	public float kn() {
		return this.ag_fld;
	}
}
