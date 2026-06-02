import net.runelite.api.WorldView;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;
import net.runelite.api.coords.LocalPoint;

@ObfuscatedName("xp")
public class xp implements xl {
	@ObfuscatedGetter(
		intValue = -2022614563
	)
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ak_fld;
	@ObfuscatedGetter(
		intValue = -459485599
	)
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ag_fld;
	@ObfuscatedGetter(
		intValue = 1068595693
	)
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int az_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ae_fld;

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	@Override
	public int ak(int var1) {
		return this.az_fld;
	}

	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int hv() {
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
	@Override
	public WorldView getWorldView() {
		return null;
	}

	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int hl() {
		return this.ag_fld;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int bf() {
		return this.az_fld;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int bj() {
		return this.az_fld;
	}

	@ObfuscatedName("gp")
	@ObfuscatedSignature(
		descriptor = "(Lqc;)I"
	)
	public static int gp(qc var0) {
		return var0.ah_fld;
	}

	@ObfuscatedName("hq")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int hq() {
		return this.ak_fld;
	}

	@ObfuscatedName("hc")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int hc() {
		return this.ak_fld;
	}

	@ObfuscatedName("getCameraFocus")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/coords/LocalPoint;"
	)
	@Override
	public LocalPoint getCameraFocus() {
		return null;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void av(int var1, int var2, int var3) {
		this.ak_fld = kj.as(var2) * 1068048041;
		this.ag_fld = kj.as(var3);
	}

	@ObfuscatedName("rj")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void rj(int var1, int var2, int var3) {
		mh(this, var1, var2, var3, (byte)-26);
	}

	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int hg() {
		return this.ag_fld;
	}

	@ObfuscatedName("mh")
	@ObfuscatedSignature(
		descriptor = "(Lxp;IIIB)V"
	)
	public static void mh(xp var0, int var1, int var2, int var3, byte var4) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.ak_fld = kj.as(var2);
			var0.ag_fld = kj.as(var3);
		}
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

	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int hs() {
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

	@ObfuscatedName("hw")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int hw() {
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

	@ObfuscatedName("xp")
	@ObfuscatedSignature(
		descriptor = "()F"
	)
	@Override
	public float xp() {
		return this.ak_fld;
	}

	@ObfuscatedName("ub")
	@ObfuscatedSignature(
		descriptor = "()F"
	)
	@Override
	public float ub() {
		return this.ag_fld;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V"
	)
	public void ag(int var1, int var2, int var3, byte var4) {
		this.ag_fld = kj.as(var2) * 132499061;
		this.ak_fld = kj.ae(var3) * -1101245023;
	}
}
