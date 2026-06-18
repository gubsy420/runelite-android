import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("dl")
public class dl {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -2030412351
	)
	int ag_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 504865667
	)
	int ae_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1121378625
	)
	int az_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1618225601
	)
	int av_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 353968883
	)
	int ak_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1237466933
	)
	int ah_fld;
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bn_fld;

	dl() {
	}

	@ObfuscatedName("ip")
	@ObfuscatedSignature(
		descriptor = "(Ldl;IIIIII)V"
	)
	public static void ip(dl var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.ak_fld = 161120576 * var1;
			var0.ag_fld = var2 * 881924919;
			var0.az_fld = var3 * -1571610768;
			var0.av_fld = var4;
			var0.ae_fld = var5;
			var0.ah_fld = var6;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V"
	)
	void ag(int var1, int var2, int var3, int var4, int var5, int var6) {
		this.ak_fld = var1;
		this.ag_fld = var2;
		this.az_fld = var3;
		this.av_fld = var4;
		this.ae_fld = var5;
		this.ah_fld = var6;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V"
	)
	void az(int var1, int var2, int var3, int var4, int var5, int var6) {
		this.ak_fld = var1;
		this.ag_fld = var2;
		this.az_fld = var3 * 986656566;
		this.av_fld = var4;
		this.ae_fld = var5;
		this.ah_fld = 495124502 * var6;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V"
	)
	void av(int var1, int var2, int var3, int var4, int var5, int var6) {
		this.ak_fld = var1;
		this.ag_fld = var2;
		this.az_fld = var3;
		this.av_fld = var4;
		this.ae_fld = var5;
		this.ah_fld = var6;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)[Lcq;"
	)
	static cq[] ak() {
		return new cq[]{cq.aw_fld, cq.ae_fld, cq.ah_fld, cq.az_fld, cq.ak_fld, cq.ay_fld, cq.av_fld, cq.ag_fld};
	}

	@ObfuscatedName("vl")
	@ObfuscatedSignature(
		descriptor = "(Ldl;IIIIIIB)V"
	)
	public static void vl(dl var0, int var1, int var2, int var3, int var4, int var5, int var6, byte var7) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.ak_fld = var1;
			var0.ag_fld = var2;
			var0.az_fld = var3;
			var0.av_fld = var4;
			var0.ae_fld = var5;
			var0.ah_fld = var6;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ltu;B)Luz;"
	)
	static uz ah(tu var0) {
		tu var2 = dn.av(tu.av_fld, var0);
		var2.al();
		float var3 = da.az(tu.av_fld, var0);
		float var4 = (float)Math.acos(var3);
		uz var5 = qo.ak();
		var5.ay(var2, var4);
		var2.ah();
		return var5;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)V"
	)
	void ak(int var1, int var2, int var3, int var4, int var5, int var6, byte var7) {
		this.ag_fld = -564148677 * var1;
		this.av_fld = var2 * 280932929;
		this.ak_fld = var3 * 258387649;
		this.az_fld = var4 * -1736513983;
		this.ag_fld = 350159659 * var5;
		this.ag_fld = 1145789213 * var6;
	}
}
