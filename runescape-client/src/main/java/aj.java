import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("aj")
public abstract class aj extends vw {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	volatile boolean ai_fld = true;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Laj;"
	)
	aj aq_fld;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int am_fld;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lad;"
	)
	ad aa_fld;

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	protected abstract int ay();

	@ObfuscatedName("gm")
	@ObfuscatedSignature(
		descriptor = "([III)V"
	)
	final void gm(int[] var1, int var2, int var3) {
		if (this.ai_fld) {
			this.as(var1, var2, var3);
		} else {
			this.af(var3);
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()Laj;"
	)
	protected abstract aj ah();

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "()Laj;"
	)
	protected abstract aj aw();

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	protected abstract int bk();

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "([III)V"
	)
	protected abstract void as(int[] var1, int var2, int var3);

	@ObfuscatedName("et")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int et() {
		return 255;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "()Laj;"
	)
	protected abstract aj bd();

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "()Laj;"
	)
	protected abstract aj bz();

	@ObfuscatedName("ga")
	@ObfuscatedSignature(
		descriptor = "([III)V"
	)
	final void ga(int[] var1, int var2, int var3) {
		if (this.ai_fld) {
			this.as(var1, var2, var3);
		} else {
			this.af(var3);
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "()Laj;"
	)
	protected abstract aj be();

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "()Laj;"
	)
	protected abstract aj bs();

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "()Laj;"
	)
	protected abstract aj bh();

	protected aj() {
	}

	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "(Lgj;)I"
	)
	public static int di(gj var0) {
		return var0.ak_fld.length;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "([III)V"
	)
	protected abstract void bj(int[] var1, int var2, int var3);

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	protected abstract void by(int var1);

	@ObfuscatedName("he")
	@ObfuscatedSignature(
		descriptor = "(Lfq;[I[FIIIIF)V"
	)
	public static void he(fq var0, int[] var1, float[] var2, int var3, int var4, int var5, int var6, float var7) {
		int var8 = var0.as_fld[var4];
		var8 = ((var8 & 16711935) * var6 >> 8 & -1402618374) + ((var8 & -1279896234) * var6 >> 8 & -801194080);
		int var9 = var1[var3];
		var8 = var8 + ((var9 & 16711935) * var5 >> 8 & 1087981186) + ((var9 & 270624223) * var5 >> 8 & 157504361);
		int var10 = var0.ar_fld.br_fld & fq.bw(var2[var3], var7);
		var1[var3] = (var10 & var8) + (~var10 & var9);
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	protected abstract void bl(int var1);

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "()Laj;"
	)
	protected abstract aj br();

	@ObfuscatedName("ew")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ew() {
		return 255;
	}

	@ObfuscatedName("ex")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ex() {
		return 255;
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int bv() {
		return 255;
	}

	@ObfuscatedName("eo")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int eo() {
		return 1158401938;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	protected abstract void af(int var1);

	@ObfuscatedName("gd")
	@ObfuscatedSignature(
		descriptor = "([III)V"
	)
	final void gd(int[] var1, int var2, int var3) {
		if (this.ai_fld) {
			this.as(var1, var2, var3);
		} else {
			this.af(var3);
		}
	}

	@ObfuscatedName("vl")
	@ObfuscatedSignature(
		descriptor = "(Laj;[III)V"
	)
	public static void vl(aj var0, int[] var1, int var2, int var3) {
		if (var0 == null) {
			var0.getClass();
		} else {
			if (var0.ai_fld) {
				var0.as(var1, var2, var3);
			} else {
				var0.af(var3);
			}
		}
	}

	@ObfuscatedName("gf")
	@ObfuscatedSignature(
		descriptor = "([III)V"
	)
	final void gf(int[] var1, int var2, int var3) {
		if (this.ai_fld) {
			this.bj(var1, var2, var3);
		} else {
			this.by(var3);
		}
	}
}
