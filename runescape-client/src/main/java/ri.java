import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("ri")
public abstract class ri {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int at_fld;
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int br_fld;

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lgu;II)Z"
	)
	public boolean aq(gu var1, int var2, int var3) {
		return this.ag(var1, var2, var3, -1560672265);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lgu;III)Z"
	)
	abstract boolean ag(gu var1, int var2, int var3, int var4);

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lgu;Lrk;II)V"
	)
	abstract void ak(gu var1, rk var2, int var3, int var4);

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(III)F"
	)
	static float ax(int var0, int var1, int var2) {
		return (float)(var0 - var1) / (var2 - var1);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	abstract void az(int var1, int var2, int var3);

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lgu;Lrk;I)V"
	)
	abstract void av(gu var1, rk var2, int var3);

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lgu;Lrk;I)V"
	)
	abstract void ae(gu var1, rk var2, int var3);

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgu;II)Z"
	)
	abstract boolean aw(gu var1, int var2, int var3);

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lgu;II)Z"
	)
	abstract boolean ah(gu var1, int var2, int var3);

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(III)F"
	)
	static float an(int var0, int var1, int var2) {
		return (float)(var0 - var1) / (var2 - var1);
	}

	@ObfuscatedName("ol")
	@ObfuscatedSignature(
		descriptor = "(Lgu;Lrk;I)V"
	)
	public void ol(gu var1, rk var2, int var3) {
		this.ak(var1, var2, var3, 1225683158);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lgu;II)Z"
	)
	abstract boolean ay(gu var1, int var2, int var3);

	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "(Lgu;DI)Z"
	)
	public boolean dz(gu var1, double var2, int var4) {
		return this.aq(var1, (int)var2, var4);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	abstract void ar(int var1, int var2);

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	abstract void af(int var1, int var2);

	ri() {
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	static void ak() {
		dt.ar_fld = -836973041;
		cq.af_fld = new short[4][104][104];
		tx.al_fld = new short[4][104][104];
		rt.au_fld = new byte[4][104][104];
		us.ax_fld = new byte[4][104][104];
		jw.ab_fld = new int[4][105][105];
		fp.an_fld = new byte[4][105][105];
		kf.aa_fld = new int[105][105];
		hv.ai_fld = new int[104];
		or.aq_fld = new int[104];
		cl.am_fld = new int[104];
		lz.ad_fld = new int[104];
		dt.ao_fld = new int[104];
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	abstract void al(int var1, int var2);

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(III)F"
	)
	static float aa(int var0, int var1, int var2) {
		return (float)(var0 - var1) / (var2 - var1);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lgu;II)Z"
	)
	abstract boolean as(gu var1, int var2, int var3);
}
