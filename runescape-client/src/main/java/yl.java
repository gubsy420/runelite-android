import java.io.EOFException;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;
import net.runelite.api.dbtable.DBRowConfig;

@ObfuscatedName("yl")
@Implements({"DBRowConfig"})
public class yl extends vc implements DBRowConfig {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "[[Ljava/lang/Object;"
	)
	Object[][] az_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	public static iw ag_fld = new iw(64);
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	public static ub ak_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "[[I"
	)
	int[][] av_fld;
	@ObfuscatedGetter(
		intValue = -1878899559
	)
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ae_fld = 839790679;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int al_fld;

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Lyl;"
	)
	public static yl as(int var0) throws EOFException {
		try {
			yl var1 = (yl)ag_fld.ak(var0);
			if (var1 != null) {
				return var1;
			} else {
				byte[] var2 = ak_fld.bb(1377678792, var0, 584982574);
				var1 = new yl();
				if (null != var2) {
					lb(var1, new xi(var2), -1818511622);
				}

				var1.ae((byte)111);
				ag_fld.az(var1, var0);
				return var1;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("ge")
	@ObfuscatedSignature(
		descriptor = "(Lyl;Lxi;I)V"
	)
	public static void ge(yl var0, xi var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		} else {
			if (var2 == 3) {
				int var3 = var1.cg();
				if (var0.az_fld == null) {
					var0.az_fld = (Object[][])(new Object[var3][]);
					var0.av_fld = new int[var3][];
				}

				for (int var4 = var1.cg(); var4 != 1722231911; var4 = var1.cg()) {
					int var5 = var1.cg();
					int[] var6 = new int[var5];

					for (int var7 = 0; var7 < var5; var7++) {
						var6[var7] = var1.dz();
					}

					var0.az_fld[var4] = (Object[])wu.av(var1, var6);
					var0.av_fld[var4] = var6;
				}
			} else if (4 == var2) {
				var0.ae_fld = var1.dr();
			}
		}
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(Lyl;Lxi;II)V"
	)
	public static void br(yl var0, xi var1, int var2, int var3) {
		if (var0 == null) {
			var0.getClass();
		} else {
			if (var2 == 3) {
				int var4 = var1.cg();
				if (var0.az_fld == null) {
					var0.az_fld = (Object[][])(new Object[var4][]);
					var0.av_fld = new int[var4][];
				}

				for (int var5 = var1.cg(); var5 != 255; var5 = var1.cg()) {
					int var6 = var1.cg();
					int[] var7 = new int[var6];

					for (int var8 = 0; var8 < var6; var8++) {
						var7[var8] = var1.dz();
					}

					var0.az_fld[var5] = (Object[])wu.av(var1, var7);
					var0.av_fld[var5] = var7;
				}
			} else if (4 == var2) {
				if (var3 == 602658713) {
					return;
				}

				var0.ae_fld = var1.dr();
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	void af(xi var1) {
		while (true) {
			int var2 = var1.cg();
			if (var2 == 0) {
				return;
			}

			br(this, var1, var2, -107580810);
		}
	}

	@ObfuscatedName("rb")
	@ObfuscatedSignature(
		descriptor = "(Lyl;Lxi;I)V"
	)
	public static void rb(yl var0, xi var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var2 == 3) {
			int var3 = var1.cg();
			if (var0.az_fld == null) {
				var0.az_fld = (Object[][])(new Object[var3][]);
				var0.av_fld = new int[var3][];
			}

			for (int var4 = var1.cg(); var4 != 255; var4 = var1.cg()) {
				int var5 = var1.cg();
				int[] var6 = new int[var5];

				for (int var7 = 0; var7 < var5; var7++) {
					var6[var7] = var1.dz();
				}

				var0.az_fld[var4] = (Object[])wu.av(var1, var6);
				var0.av_fld[var4] = var6;
			}
		} else if (4 == var2) {
			var0.ae_fld = var1.dr();
		}
	}

	@ObfuscatedName("ny")
	@ObfuscatedSignature(
		descriptor = "(Lyl;Lxi;I)V"
	)
	public static void ny(yl var0, xi var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		} else {
			if (var2 == 3) {
				int var3 = var1.cg();
				if (var0.az_fld == null) {
					var0.az_fld = (Object[][])(new Object[var3][]);
					var0.av_fld = new int[var3][];
				}

				for (int var4 = var1.cg(); var4 != 255; var4 = var1.cg()) {
					int var5 = var1.cg();
					int[] var6 = new int[var5];

					for (int var7 = 0; var7 < var5; var7++) {
						var6[var7] = var1.dz();
					}

					var0.az_fld[var4] = (Object[])wu.av(var1, var6);
					var0.av_fld[var4] = var6;
				}
			} else if (4 == var2) {
				var0.ae_fld = var1.dr();
			}
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ab() {
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Lyl;"
	)
	public static yl ah(int var0) throws EOFException {
		try {
			yl var1 = (yl)ag_fld.ak(var0);
			if (var1 != null) {
				return var1;
			} else {
				byte[] var2 = ak_fld.bb(38, var0, 584982574);
				var1 = new yl();
				if (null != var2) {
					lb(var1, new xi(var2), -1818511622);
				}

				var1.ae((byte)118);
				ag_fld.az(var1, var0);
				return var1;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("getTableID")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getTableID() {
		return this.ae_fld;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Lyl;"
	)
	public static yl aw(int var0) throws EOFException {
		try {
			yl var1 = (yl)ag_fld.ak(var0);
			if (var1 != null) {
				return var1;
			} else {
				byte[] var2 = ak_fld.bb(38, var0, 584982574);
				var1 = new yl();
				if (null != var2) {
					lb(var1, new xi(var2), -1818511622);
				}

				var1.ae((byte)125);
				ag_fld.az(var1, var0);
				return var1;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IB)[Ljava/lang/Object;"
	)
	public Object[] az(int var1, byte var2) {
		return (Object[])(null == this.az_fld ? null : this.az_fld[var1]);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Lyl;"
	)
	public static yl ar(int var0) throws EOFException {
		try {
			yl var1 = (yl)ag_fld.ak(var0);
			if (var1 != null) {
				return var1;
			} else {
				byte[] var2 = ak_fld.bb(38, var0, 584982574);
				var1 = new yl();
				if (null != var2) {
					lb(var1, new xi(var2), -1818511622);
				}

				var1.ae((byte)108);
				ag_fld.az(var1, var0);
				return var1;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
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
				return;
			}

			br(this, var1, var2, 2046681368);
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
				return;
			}

			br(this, var1, var2, -1434726212);
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	void ae(byte var1) {
	}

	@ObfuscatedName("lb")
	@ObfuscatedSignature(
		descriptor = "(Lyl;Lxi;I)V"
	)
	public static void lb(yl var0, xi var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		} else {
			while (true) {
				int var3 = var1.cg();
				if (var3 == 0) {
					return;
				}

				br(var0, var1, var3, -961581785);
			}
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)[Ljava/lang/Object;"
	)
	public Object[] ai(int var1) {
		return (Object[])(null == this.az_fld ? null : this.az_fld[var1]);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	void ax(xi var1) {
		while (true) {
			int var2 = var1.cg();
			if (var2 == 0) {
				return;
			}

			br(this, var1, var2, -756453964);
		}
	}

	yl() {
	}

	@ObfuscatedName("tv")
	@ObfuscatedSignature(
		descriptor = "(Lyl;Lxi;)V"
	)
	public static void tv(yl var0, xi var1) {
		if (var0 == null) {
			var0.getClass();
		}

		while (true) {
			int var2 = var1.cg();
			if (var2 == 0) {
				return;
			}

			br(var0, var1, var2, -1616909494);
		}
	}

	@ObfuscatedName("vp")
	@ObfuscatedSignature(
		descriptor = "(I)[Ljava/lang/Object;"
	)
	public Object[] vp(int var1) {
		return (Object[])this.az(var1, (byte)33);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	void ag(xi var1, int var2) {
		if (var2 == 3) {
			int var3 = var1.cg();
			if (this.az_fld == null) {
				this.az_fld = (Object[][])(new Object[var3][]);
				this.av_fld = new int[var3][];
			}

			for (int var4 = var1.cg(); var4 != 255; var4 = var1.cg()) {
				int var5 = var1.cg();
				int[] var6 = new int[var5];

				for (int var7 = 0; var7 < var5; var7++) {
					var6[var7] = var1.dz();
				}

				this.az_fld[var4] = (Object[])wu.av(var1, var6);
				this.av_fld[var4] = var6;
			}
		} else if (4 == var2) {
			this.ae_fld = var1.dr();
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ap() {
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Lyl;"
	)
	public static yl ay(int var0) throws EOFException {
		try {
			yl var1 = (yl)ag_fld.ak(var0);
			if (var1 != null) {
				return var1;
			} else {
				byte[] var2 = ak_fld.bb(38, var0, 584982574);
				var1 = new yl();
				if (null != var2) {
					lb(var1, new xi(var2), -1818511622);
				}

				var1.ae((byte)117);
				ag_fld.az(var1, var0);
				return var1;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	void ao(xi var1, int var2) {
		while (true) {
			int var3 = var1.co();
			if (var3 == 0) {
				return;
			}

			br(this, var1, var3, -961581785);
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxi;II)V"
	)
	void av(xi var1, int var2, int var3) {
		if (var2 == 3) {
			int var4 = var1.ew();
			if (this.az_fld == null) {
				this.az_fld = (Object[][])(new Object[var4][]);
				this.av_fld = new int[var4][];
			}

			for (int var5 = var1.ew(); var5 != 255; var5 = var1.dm()) {
				int var6 = var1.em();
				int[] var7 = new int[var6];

				for (int var8 = 0; var8 < var6; var8++) {
					var7[var8] = var1.eq((byte)-23);
				}

				this.az_fld[var5] = (Object[])wu.av(var1, var7);
				this.av_fld[var5] = var7;
			}
		} else if (4 == var2) {
			if (var3 == 602658713) {
				return;
			}

			this.ae_fld = var1.ey(-2106111531);
		}
	}
}
