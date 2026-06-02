import net.runelite.api.BufferProvider;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("yx")
@Implements({"BufferProvider"})
public abstract class yx implements BufferProvider {
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[F"
	)
	protected float[] ah_fld;
	@ObfuscatedGetter(
		intValue = -1696518071
	)
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int av_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	public int[] az_fld;
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bo_fld;
	@ObfuscatedGetter(
		intValue = 1829709341
	)
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ae_fld;

	@ObfuscatedName("getWidth")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getWidth() {
		return this.av_fld;
	}

	@ObfuscatedName("getPixels")
	@ObfuscatedSignature(
		descriptor = "()[I"
	)
	@Override
	public int[] getPixels() {
		return this.az_fld;
	}

	protected yx() {
	}

	@ObfuscatedName("uo")
	@ObfuscatedSignature(
		descriptor = "(Lyx;Z)V"
	)
	public static void uo(yx var0, boolean var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ah_fld = var1 ? new float[1 + var0.av_fld * var0.ae_fld] : null;
	}

	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	static boolean hl() {
		return cx.kq_fld.bj((byte)115) >= client.ga_fld;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public abstract void ag(int var1, int var2, int var3);

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public final void au(int var1) {
		yu.du(this.az_fld, this.av_fld, this.ae_fld, this.ah_fld);
	}

	@ObfuscatedName("lf")
	@ObfuscatedSignature(
		descriptor = "(Lyx;)V"
	)
	public static void lf(yx var0) {
		yu.du(var0.az_fld, var0.av_fld, var0.ae_fld, var0.ah_fld);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public abstract void aw(int var1, int var2);

	@ObfuscatedName("uc")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void uc() {
		this.au(-1576280039);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public abstract void ah(int var1, int var2);

	@ObfuscatedName("getHeight")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getHeight() {
		return this.ae_fld;
	}

	@ObfuscatedName("ma")
	@ObfuscatedSignature(
		descriptor = "(Lyx;)V"
	)
	public static void ma(yx var0) {
		yu.du(var0.az_fld, var0.av_fld * -854924920, var0.ae_fld, var0.ah_fld);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	public final void ad(boolean var1) {
		this.ah_fld = var1 ? new float[1 + this.av_fld * this.ae_fld] : null;
	}

	@ObfuscatedName("rx")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	public void rx(boolean var1) {
		this.ax(var1, (byte)-2);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public final void ai() {
		yu.du(this.az_fld, this.av_fld, this.ae_fld, this.ah_fld);
	}

	@ObfuscatedName("ff")
	@ObfuscatedSignature(
		descriptor = "(Lyx;Z)V"
	)
	public static void ff(yx var0, boolean var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ah_fld = var1 ? new float[1 + var0.av_fld * var0.ae_fld] : null;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ZB)V"
	)
	public final void ax(boolean var1, byte var2) {
		this.ah_fld = var1 ? new float[1 + this.av_fld * this.ae_fld] : null;
	}

	@ObfuscatedName("ed")
	@ObfuscatedSignature(
		descriptor = "(Ldx;IIIIIIII[Ljava/lang/String;IIB)V"
	)
	static void ed(dx var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, String[] var9, int var10, int var11, byte var12) {
		na var13 = var0.ai_fld;
		cs var14 = null;

		for (cs var15 = (cs)var13.aw(); var15 != null; var15 = (cs)var13.as()) {
			if (var15.ag_fld == var1) {
				if (var12 == 7) {
					return;
				}

				if (var15.av_fld == var2 && var15.ae_fld == var3 && var4 == var15.az_fld) {
					var14 = var15;
					break;
				}
			}
		}

		if (null == var14) {
			var14 = new cs();
			var14.ag_fld = var1;
			var14.az_fld = var4;
			var14.av_fld = var2;
			var14.ae_fld = var3;
			var14.al_fld = 85669797;
			ai.ex(var0, var14, -2021994835);
			var13.av(var14);
		}

		var14.as_fld = var5;
		var14.af_fld = var6;
		var14.ar_fld = var7;
		var14.au_fld = var10;
		var14.ax_fld = var11;
		cs.ln(var14, var8);
		cs.vw(var14, var9, -1964957929);
	}
}
