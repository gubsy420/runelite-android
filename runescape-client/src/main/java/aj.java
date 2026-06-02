import java.io.IOException;
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

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	protected abstract int bk();

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

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	protected abstract int ay();

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

	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "(Laj;[III)V"
	)
	public static void di(aj var0, int[] var1, int var2, int var3) {
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

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "()Laj;"
	)
	protected abstract aj bz();

	@ObfuscatedName("vp")
	@ObfuscatedSignature(
		descriptor = "(Laj;[III)V"
	)
	public static void vp(aj var0, int[] var1, int var2, int var3) {
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

	@ObfuscatedName("gm")
	@ObfuscatedSignature(
		descriptor = "([III)V"
	)
	final void gm(int[] var1, int var2, int var3) {
		if (this.ai_fld) {
			this.bj(var1, var2, var3);
		} else {
			this.af(var3);
		}
	}

	@ObfuscatedName("vf")
	@ObfuscatedSignature(
		descriptor = "(Lqf;)V"
	)
	public static void vf(qf var0) throws IOException {
		try {
			if (var0 == null) {
				var0.getClass();
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
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
