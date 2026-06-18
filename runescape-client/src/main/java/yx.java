import java.io.EOFException;
import net.runelite.api.BufferProvider;
import net.runelite.api.annotations.Export;
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
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1696518071
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
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1829709341
	)
	public int ae_fld;

	protected yx() {
	}

	@ObfuscatedName("getWidth")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getWidth")
	@Override
	public int getWidth() {
		return this.av_fld;
	}

	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	static boolean hl() {
		return cx.kq_fld.bj((byte)115) >= client.ga_fld;
	}

	@ObfuscatedName("fs")
	@ObfuscatedSignature(
		descriptor = "(Lyx;Z)V"
	)
	public static void fs(yx var0, boolean var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ah_fld = var1 ? new float[1 + var0.av_fld * var0.ae_fld] : null;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public abstract void ag(int var1, int var2, int var3);

	@ObfuscatedName("getPixels")
	@ObfuscatedSignature(
		descriptor = "()[I"
	)
	@Export("getPixels")
	@Override
	public int[] getPixels() {
		return this.az_fld;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public final void au(int var1) {
		yu.du(this.az_fld, this.av_fld, this.ae_fld, this.ah_fld);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public abstract void aw(int var1, int var2);

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public abstract void ah(int var1, int var2);

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public final void an() {
		yu.du(this.az_fld, this.av_fld, this.ae_fld, this.ah_fld);
	}

	@ObfuscatedName("lt")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void lt() {
		this.au(-1576280039);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public final void ai() {
		yu.du(this.az_fld, this.av_fld, this.ae_fld, this.ah_fld);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	public final void aq(boolean var1) {
		this.ah_fld = var1 ? new float[1 + this.av_fld * this.ae_fld] : null;
	}

	@ObfuscatedName("jy")
	@ObfuscatedSignature(
		descriptor = "(Las;)I"
	)
	public static int jy(as var0) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.ag_fld;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ZB)V"
	)
	public final void ax(boolean var1, byte var2) {
		this.ah_fld = var1 ? new float[1 + this.av_fld * this.ae_fld] : null;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	public final void am(boolean var1) {
		this.ah_fld = var1 ? new float[1 + this.av_fld * this.ae_fld] : null;
	}

	@ObfuscatedName("getHeight")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getHeight")
	@Override
	public int getHeight() {
		return this.ae_fld;
	}

	@ObfuscatedName("py")
	@ObfuscatedSignature(
		descriptor = "(Lda;)V"
	)
	public static void py(da var0) throws EOFException {
		try {
			qa.gr(var0.cm_fld, 217142388);
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	public void hn(boolean var1) {
		this.ax(var1, (byte)-2);
	}

	@ObfuscatedName("ed")
	@ObfuscatedSignature(
		descriptor = "(Ldx;IIIIIIII[Ljava/lang/String;IIB)V"
	)
	static void ed(dx var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, String[] var9, int var10, int var11, byte var12) {
		na var13 = var0.ai_fld;
		cs var14 = null;

		for (cs var15 = (cs)var13.aw(); var15 != null; var15 = (cs)na.iy(var13)) {
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
			var13.az(var14);
		}

		var14.as_fld = var5;
		var14.af_fld = var6;
		var14.ar_fld = var7;
		var14.au_fld = var10;
		var14.ax_fld = var11;
		var14.ak(var8, -666287811);
		var14.ag(var9);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public final void aa() {
		yu.du(this.az_fld, this.av_fld * -854924920, this.ae_fld, this.ah_fld);
	}
}
