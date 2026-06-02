import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("oh")
public class oh extends vc {
	@ObfuscatedGetter(
		intValue = 1510306095
	)
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ah_fld = 0;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ag_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	static ub av_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	public static iw ae_fld = new iw(64);
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ak_fld;

	@ObfuscatedName("ol")
	@ObfuscatedSignature(
		descriptor = "(Lrg;)I"
	)
	public static int ol(rg var0) {
		return -889964364 * var0.ah_fld.aw_fld + oy.ob(var0.aw_fld, (byte)0);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Loh;"
	)
	public static oh ar(int var0) throws EOFException {
		try {
			oh var1 = (oh)ae_fld.ak(var0);
			if (null != var1) {
				return var1;
			} else {
				byte[] var2 = av_fld.bb(16, var0, 584982574);
				var1 = new oh();
				if (null != var2) {
					var1.az(new xi(var2));
				}

				ae_fld.az(var1, var0);
				return var1;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Loh;"
	)
	public static oh ay(int var0) throws EOFException {
		try {
			oh var1 = (oh)ae_fld.ak(var0);
			if (null != var1) {
				return var1;
			} else {
				byte[] var2 = av_fld.bb(16, var0, 584982574);
				var1 = new oh();
				if (null != var2) {
					var1.az(new xi(var2));
				}

				ae_fld.az(var1, var0);
				return var1;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Loh;"
	)
	public static oh aw(int var0) throws EOFException {
		try {
			oh var1 = (oh)ae_fld.ak(var0);
			if (null != var1) {
				return var1;
			} else {
				byte[] var2 = av_fld.bb(16, var0, 584982574);
				var1 = new oh();
				if (null != var2) {
					var1.az(new xi(var2));
				}

				ae_fld.az(var1, var0);
				return var1;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	void ax(xi var1, int var2) {
		if (var2 == 5) {
			this.ah_fld = xi.tx(var1, 1765693018);
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lub;)V"
	)
	public static void ah(ub var0) {
		av_fld = var0;
		dt.az_fld = rl1.ei(av_fld, 16);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	void av(xi var1, int var2) {
		if (var2 == 5) {
			this.ah_fld = xi.tx(var1, 1968632054);
		}
	}

	oh() {
	}

	@ObfuscatedName("gy")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	static final void gy(int var0) {
		la.ay();
		if (null != jr.fa_fld) {
			jr.fa_fld.aa((byte)65);
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ae() {
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Loh;"
	)
	public static oh af(int var0) throws EOFException {
		try {
			oh var1 = (oh)ae_fld.ak(var0);
			if (null != var1) {
				return var1;
			} else {
				byte[] var2 = av_fld.bb(16, var0, 584982574);
				var1 = new oh();
				if (null != var2) {
					var1.az(new xi(var2));
				}

				ae_fld.az(var1, var0);
				return var1;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("xh")
	@ObfuscatedSignature(
		descriptor = "(Lrb;Lrh;)V"
	)
	public static void xh(rb var0, rh var1) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var1.ap(-1939318074).equals(var0.az_fld.jn((byte)-88))) {
			var0.aw_fld = -1475714308 * var1.aw_fld;
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	void al(xi var1) {
		while (true) {
			int var2 = var1.cg();
			if (var2 == 0) {
				this.ae();
				return;
			}

			this.av(var1, var2);
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	void au(xi var1) {
		while (true) {
			int var2 = var1.cg();
			if (var2 == 0) {
				this.ae();
				return;
			}

			this.av(var1, var2);
		}
	}

	@ObfuscatedName("rg")
	@ObfuscatedSignature(
		descriptor = "(Loh;Lxi;I)V"
	)
	public static void rg(oh var0, xi var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		} else {
			if (var2 == 5) {
				var0.ah_fld = xi.tx(var1, 1225485449);
			}
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Loh;"
	)
	public static oh as(int var0) throws EOFException {
		try {
			oh var1 = (oh)ae_fld.ak(var0);
			if (null != var1) {
				return var1;
			} else {
				byte[] var2 = av_fld.bb(16, var0, 584982574);
				var1 = new oh();
				if (null != var2) {
					var1.az(new xi(var2));
				}

				ae_fld.az(var1, var0);
				return var1;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ai() {
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	void az(xi var1) {
		while (true) {
			int var3 = var1.cg();
			if (var3 == 0) {
				this.ae();
				return;
			}

			this.av(var1, var3);
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void aa() {
	}
}
