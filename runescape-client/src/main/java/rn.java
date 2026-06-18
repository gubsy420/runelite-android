import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("rn")
public class rn extends ri {
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 479728603
	)
	int ae_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -540899961
	)
	static int ak_fld = client.eu_fld + -1595320961;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lgu;"
	)
	gu ag_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1138659955
	)
	int av_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lgu;"
	)
	gu az_fld = new gu();
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[[S"
	)
	public static short[][] ah_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int as_fld;

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	@Override
	void az(int var1, int var2, int var3) {
		gu.tt(this.az_fld, var1, var2);
		gu.tt(this.ag_fld, var1, var2);
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	static boolean ct() {
		return (client.ez_fld & 4) != 0;
	}

	@ObfuscatedName("er")
	@ObfuscatedSignature(
		descriptor = "(Lgu;Lgu;DLgu;)V"
	)
	public static void er(gu var0, gu var1, double var2, gu var4) {
		if (var2 < 0.0) {
			var2 = 0.0;
		}

		if (var2 > 1.0) {
			var2 = 1.0;
		}

		int var5 = var1.ag_fld - var0.ag_fld;
		int var6 = var1.az_fld - var0.az_fld;
		var5 = (int)(var2 * var5);
		var6 = (int)(var2 * var6);
		var4.ag_fld = var0.ag_fld + var5;
		var4.az_fld = var0.az_fld + var6;
		int var7 = var1.ak_fld - var0.ak_fld & 2047;
		if (var7 > 1024) {
			var7 = -(2048 - var7);
		}

		var7 = (int)(var7 * var2);
		var4.ak_fld = var0.ak_fld + var7 & 2047;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lgu;III)Z"
	)
	@Override
	boolean ag(gu var1, int var2, int var3, int var4) {
		if (this.av_fld >= this.ae_fld) {
			var1.ay(this.ag_fld);
			return true;
		} else {
			float var5 = pd.au(var2, this.av_fld, this.ae_fld);
			gu var6 = this.az_fld;
			gu var7 = this.ag_fld;
			float var9 = Math.max(0.0F, Math.min(var5, 1.0F));
			int var10 = var7.ak() - var6.ak();
			int var11 = var7.az() - var6.az();
			var10 = (int)(var9 * var10);
			var11 = (int)(var9 * var11);
			var1.as(var6.ak() + var10, var6.az() + var11);
			int var12 = gj.ae(gu.rg(var6, (byte)-125), gu.rg(var7, (byte)-116));
			var12 = (int)(var9 * var12);
			var1.aw(gu.rg(var6, (byte)-109) + var12);
			return var5 >= 1.0F;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lgu;II)Z"
	)
	@Override
	boolean ah(gu var1, int var2, int var3) {
		if (this.av_fld >= this.ae_fld) {
			var1.ay(this.ag_fld);
			return true;
		} else {
			float var4 = pd.au(var2, this.av_fld, this.ae_fld);
			gu var5 = this.az_fld;
			gu var6 = this.ag_fld;
			float var8 = Math.max(0.0F, Math.min(var4, 1.0F));
			int var9 = var6.ak() - var5.ak();
			int var10 = var6.az() - var5.az();
			var9 = (int)(var8 * var9);
			var10 = (int)(var8 * var10);
			var1.as(var5.ak() + var9, var5.az() + var10);
			int var11 = gj.ae(gu.rg(var5, (byte)-122), gu.rg(var6, (byte)-41));
			var11 = (int)(var8 * var11);
			var1.aw(gu.rg(var5, (byte)-47) + var11);
			return var4 >= 1.0F;
		}
	}

	@ObfuscatedName("vy")
	@ObfuscatedSignature(
		descriptor = "(DII)D"
	)
	public static double vy(double var0, int var2, int var3) {
		return (var0 - var2) / (var3 - var2);
	}

	rn() {
		this.ag_fld = new gu();
		this.av_fld = 0;
		this.ae_fld = 0;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lgu;Lrk;I)V"
	)
	@Override
	void ae(gu var1, rk var2, int var3) {
		this.az_fld.ay(var1);
		this.ag_fld.ay(var2.ak_fld);
		this.av_fld = var3 - 1;
		this.ae_fld = ak_fld + var2.ag_fld;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lgu;Lrk;I)V"
	)
	@Override
	void av(gu var1, rk var2, int var3) {
		this.az_fld.ay(var1);
		this.ag_fld.ay(var2.ak_fld);
		this.av_fld = var3 - 1;
		this.ae_fld = ak_fld + var2.ag_fld;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgu;II)Z"
	)
	@Override
	boolean aw(gu var1, int var2, int var3) {
		if (this.av_fld >= this.ae_fld) {
			var1.ay(this.ag_fld);
			return true;
		} else {
			float var4 = pd.au(var2, this.av_fld, this.ae_fld);
			gu var5 = this.az_fld;
			gu var6 = this.ag_fld;
			float var8 = Math.max(0.0F, Math.min(var4, 1.0F));
			int var9 = var6.ak() - var5.ak();
			int var10 = var6.az() - var5.az();
			var9 = (int)(var8 * var9);
			var10 = (int)(var8 * var10);
			var1.as(var5.ak() + var9, var5.az() + var10);
			int var11 = gj.ae(gu.rg(var5, (byte)-97), gu.rg(var6, (byte)-100));
			var11 = (int)(var8 * var11);
			var1.aw(gu.rg(var5, (byte)-82) + var11);
			return var4 >= 1.0F;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lgu;II)Z"
	)
	@Override
	boolean ay(gu var1, int var2, int var3) {
		if (this.av_fld >= this.ae_fld) {
			var1.ay(this.ag_fld);
			return true;
		} else {
			float var4 = pd.au(var2, -1233097342 * this.av_fld, this.ae_fld);
			gu var5 = this.az_fld;
			gu var6 = this.ag_fld;
			float var8 = Math.max(0.0F, Math.min(var4, 1.0F));
			int var9 = var6.ak() - var5.ak();
			int var10 = var6.az() - var5.az();
			var9 = (int)(var8 * var9);
			var10 = (int)(var8 * var10);
			var1.as(var5.ak() + var9, var5.az() + var10);
			int var11 = gj.ae(gu.rg(var5, (byte)-69), gu.rg(var6, (byte)-107));
			var11 = (int)(var8 * var11);
			var1.aw(gu.rg(var5, (byte)-18) + var11);
			return var4 >= 1.0F;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lgu;II)Z"
	)
	@Override
	boolean as(gu var1, int var2, int var3) {
		if (this.av_fld >= this.ae_fld) {
			var1.ay(this.ag_fld);
			return true;
		} else {
			float var4 = pd.au(var2, this.av_fld, this.ae_fld);
			gu var5 = this.az_fld;
			gu var6 = this.ag_fld;
			float var8 = Math.max(0.0F, Math.min(var4, 1.0F));
			int var9 = var6.ak() - var5.ak();
			int var10 = var6.az() - var5.az();
			var9 = (int)(var8 * var9);
			var10 = (int)(var8 * var10);
			var1.as(var5.ak() + var9, var5.az() + var10);
			int var11 = gj.ae(gu.rg(var5, (byte)-121), gu.rg(var6, (byte)-122));
			var11 = (int)(var8 * var11);
			var1.aw(gu.rg(var5, (byte)-98) + var11);
			return var4 >= 1.0F;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	@Override
	void ar(int var1, int var2) {
		gu.tt(this.az_fld, var1, var2);
		gu.tt(this.ag_fld, var1, var2);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	@Override
	void af(int var1, int var2) {
		gu.tt(this.az_fld, var1, var2);
		gu.tt(this.ag_fld, var1, var2);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	@Override
	void al(int var1, int var2) {
		gu.tt(this.az_fld, var1, var2);
		gu.tt(this.ag_fld, var1, var2);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lgu;Lrk;II)V"
	)
	@Override
	void ak(gu var1, rk var2, int var3, int var4) {
		this.az_fld.ay(var1);
		this.ag_fld.ay(var2.ak_fld);
		this.av_fld = var3 - 1;
		this.ae_fld = ak_fld + var2.ag_fld;
	}

	@ObfuscatedName("kj")
	@ObfuscatedSignature(
		descriptor = "(Lgu;DI)Z"
	)
	@Override
	public boolean kj(gu var1, double var2, int var4) {
		if (this.av_fld >= this.ae_fld) {
			rl2.fp(var1, this.ag_fld);
			return true;
		} else {
			double var5 = vy(var2, this.av_fld, this.ae_fld);
			er(this.az_fld, this.ag_fld, var5, var1);
			return var5 >= 1.0;
		}
	}
}
