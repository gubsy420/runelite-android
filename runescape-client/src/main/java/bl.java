import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("bl")
public class bl extends gr {
	@ObfuscatedName("rf")
	@ObfuscatedSignature(
		descriptor = "Lmf;"
	)
	static mf rf_fld;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ai_fld;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int af_fld;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ad_fld;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ar_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ae_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int aw_fld;
	@ObfuscatedName("ey")
	@ObfuscatedSignature(
		descriptor = "Ltv;"
	)
	static tv ey_fld;
	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	public static ub dm_fld;

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lwj;)Lac;"
	)
	public static ac as(wj var0) {
		return var0.ak_fld;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIILgn;)Z"
	)
	@Override
	protected boolean av(int var1, int var2, int var3, gn var4) {
		return this.ak_fld == var2 && var3 == this.ag_fld;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIILgn;I)Z"
	)
	@Override
	protected boolean ak(int var1, int var2, int var3, gn var4, int var5) {
		return this.ak_fld == var2 && var3 == this.ag_fld;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIILgn;)Z"
	)
	@Override
	protected boolean az(int var1, int var2, int var3, gn var4) {
		return this.ak_fld == var2 && var3 == this.ag_fld;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIILgn;)Z"
	)
	@Override
	protected boolean ae(int var1, int var2, int var3, gn var4) {
		return this.ak_fld == var2 && var3 == this.ag_fld;
	}

	bl() {
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIILgn;)Z"
	)
	@Override
	protected boolean ag(int var1, int var2, int var3, gn var4) {
		return this.ak_fld == var2 && var3 == this.ag_fld;
	}

	@ObfuscatedName("gx")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	static final void gx() {
		jm var1 = gi.ak(jb.cm_fld, client.appletStub.av_fld);
		var1.ay_fld.ea(0);
		client.appletStub.az(var1);
	}
}
