import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("rn")
public class rn extends ri {
	@ObfuscatedGetter(
		intValue = 479728603
	)
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ae_fld;
	@ObfuscatedGetter(
		intValue = -540899961
	)
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ak_fld = client.eu_fld + -1595320961;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lgu;"
	)
	gu az_fld;
	@ObfuscatedGetter(
		intValue = -1138659955
	)
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int av_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lgu;"
	)
	gu ag_fld = new gu();
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
		gu.ry(this.ag_fld, var1, var2);
		gu.ry(this.az_fld, var1, var2);
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	static boolean ct() {
		return (client.ez_fld & 4) != 0;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lgu;III)Z"
	)
	@Override
	boolean ag(gu var1, int var2, int var3, int var4) {
		if (this.av_fld >= this.ae_fld) {
			var1.ay(this.az_fld);
			return true;
		} else {
			float var5 = pd.au(var2, this.av_fld, this.ae_fld);
			gu var6 = this.ag_fld;
			gu var7 = this.az_fld;
			float var9 = Math.max(0.0F, Math.min(var5, 1.0F));
			int var10 = var7.ah() - var6.ah();
			int var11 = gu.ns(var7, -1552758794) - gu.ns(var6, 614872534);
			var10 = (int)(var9 * var10);
			var11 = (int)(var9 * var11);
			gu.yu(var1, var6.ah() + var10, gu.ns(var6, -1046990635) + var11, (byte)-115);
			int var12 = gj.ae(var6.av(), var7.av());
			var12 = (int)(var9 * var12);
			var1.aw(var6.av() + var12);
			return var5 >= 1.0F;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgu;II)Z"
	)
	@Override
	boolean aw(gu var1, int var2, int var3) {
		if (this.av_fld >= this.ae_fld) {
			var1.ay(this.az_fld);
			return true;
		} else {
			float var4 = pd.au(var2, this.av_fld, this.ae_fld);
			gu var5 = this.ag_fld;
			gu var6 = this.az_fld;
			float var8 = Math.max(0.0F, Math.min(var4, 1.0F));
			int var9 = var6.ah() - var5.ah();
			int var10 = gu.ns(var6, 53899029) - gu.ns(var5, -1216378181);
			var9 = (int)(var8 * var9);
			var10 = (int)(var8 * var10);
			gu.yu(var1, var5.ah() + var9, gu.ns(var5, -1703014429) + var10, (byte)-84);
			int var11 = gj.ae(var5.av(), var6.av());
			var11 = (int)(var8 * var11);
			var1.aw(var5.av() + var11);
			return var4 >= 1.0F;
		}
	}

	rn() {
		this.az_fld = new gu();
		this.av_fld = 0;
		this.ae_fld = 0;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lgu;Lrk;I)V"
	)
	@Override
	void ae(gu var1, rk var2, int var3) {
		this.ag_fld.ay(var1);
		this.az_fld.ay(var2.ak_fld);
		this.av_fld = var3 - 1;
		this.ae_fld = ak_fld + var2.ag_fld;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lgu;Lrk;I)V"
	)
	@Override
	void av(gu var1, rk var2, int var3) {
		this.ag_fld.ay(var1);
		this.az_fld.ay(var2.ak_fld);
		this.av_fld = var3 - 1;
		this.ae_fld = ak_fld + var2.ag_fld;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lgu;II)Z"
	)
	@Override
	boolean as(gu var1, int var2, int var3) {
		if (this.av_fld >= this.ae_fld) {
			var1.ay(this.az_fld);
			return true;
		} else {
			float var4 = pd.au(var2, this.av_fld, this.ae_fld);
			gu var5 = this.ag_fld;
			gu var6 = this.az_fld;
			float var8 = Math.max(0.0F, Math.min(var4, 1.0F));
			int var9 = var6.ah() - var5.ah();
			int var10 = gu.ns(var6, -1917035823) - gu.ns(var5, -521631237);
			var9 = (int)(var8 * var9);
			var10 = (int)(var8 * var10);
			gu.yu(var1, var5.ah() + var9, gu.ns(var5, 1299677348) + var10, (byte)-116);
			int var11 = gj.ae(var5.av(), var6.av());
			var11 = (int)(var8 * var11);
			var1.aw(var5.av() + var11);
			return var4 >= 1.0F;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lgu;II)Z"
	)
	@Override
	boolean ah(gu var1, int var2, int var3) {
		if (this.av_fld >= this.ae_fld) {
			var1.ay(this.az_fld);
			return true;
		} else {
			float var4 = pd.au(var2, -1233097342 * this.av_fld, this.ae_fld);
			gu var5 = this.ag_fld;
			gu var6 = this.az_fld;
			float var8 = Math.max(0.0F, Math.min(var4, 1.0F));
			int var9 = var6.ah() - var5.ah();
			int var10 = gu.ns(var6, 1426773909) - gu.ns(var5, 1553457825);
			var9 = (int)(var8 * var9);
			var10 = (int)(var8 * var10);
			gu.yu(var1, var5.ah() + var9, gu.ns(var5, 1460658813) + var10, (byte)-35);
			int var11 = gj.ae(var5.av(), var6.av());
			var11 = (int)(var8 * var11);
			var1.aw(var5.av() + var11);
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
			var1.ay(this.az_fld);
			return true;
		} else {
			float var4 = pd.au(var2, this.av_fld, this.ae_fld);
			gu var5 = this.ag_fld;
			gu var6 = this.az_fld;
			float var8 = Math.max(0.0F, Math.min(var4, 1.0F));
			int var9 = var6.ah() - var5.ah();
			int var10 = gu.ns(var6, 1295995826) - gu.ns(var5, 2045398048);
			var9 = (int)(var8 * var9);
			var10 = (int)(var8 * var10);
			gu.yu(var1, var5.ah() + var9, gu.ns(var5, 1661354444) + var10, (byte)-77);
			int var11 = gj.ae(var5.av(), var6.av());
			var11 = (int)(var8 * var11);
			var1.aw(var5.av() + var11);
			return var4 >= 1.0F;
		}
	}

	@ObfuscatedName("su")
	@ObfuscatedSignature(
		descriptor = "(DII)D"
	)
	public static double su(double var0, int var2, int var3) {
		return (var0 - var2) / (var3 - var2);
	}

	@ObfuscatedName("ja")
	@ObfuscatedSignature(
		descriptor = "(Lgu;Lgu;DLgu;)V"
	)
	public static void ja(gu var0, gu var1, double var2, gu var4) {
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

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	@Override
	void ar(int var1, int var2) {
		gu.ry(this.ag_fld, var1, var2);
		gu.ry(this.az_fld, var1, var2);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	@Override
	void af(int var1, int var2) {
		gu.ry(this.ag_fld, var1, var2);
		gu.ry(this.az_fld, var1, var2);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	@Override
	void al(int var1, int var2) {
		gu.ry(this.ag_fld, var1, var2);
		gu.ry(this.az_fld, var1, var2);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lgu;Lrk;II)V"
	)
	@Override
	void ak(gu var1, rk var2, int var3, int var4) {
		this.ag_fld.ay(var1);
		this.az_fld.ay(var2.ak_fld);
		this.av_fld = var3 - 1;
		this.ae_fld = ak_fld + var2.ag_fld;
	}

	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "(Lgu;DI)Z"
	)
	@Override
	public boolean dz(gu var1, double var2, int var4) {
		if (this.av_fld >= this.ae_fld) {
			zh.fo(var1, this.az_fld);
			return true;
		} else {
			double var5 = su(var2, this.av_fld, this.ae_fld);
			ja(this.ag_fld, this.az_fld, var5, var1);
			return var5 >= 1.0;
		}
	}
}
