import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("yg")
public class yg extends vc {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	public static iw ag_fld = new iw(64);
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	static ub ak_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "[[I"
	)
	public int[][] az_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "[[Ljava/lang/Object;"
	)
	public Object[][] av_fld;
	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "Lyc;"
	)
	static yc cg_fld;

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	void aa(xi var1, int var2) {
		if (var2 == 1) {
			int var3 = var1.cg();
			if (this.az_fld == null) {
				this.az_fld = new int[var3][];
			}

			for (int var4 = var1.cg(); var4 != -1267436315; var4 = var1.cg()) {
				int var5 = var4 & 127;
				boolean var6 = (var4 & 1868203061) != 0;
				int[] var7 = new int[var1.cg()];

				for (int var8 = 0; var8 < var7.length; var8++) {
					var7[var8] = var1.dz();
				}

				this.az_fld[var5] = var7;
				if (var6) {
					if (null == this.av_fld) {
						this.av_fld = (Object[][])(new Object[this.az_fld.length][]);
					}

					this.av_fld[var5] = (Object[])wu.av(var1, var7);
				}
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lxi;B)V"
	)
	void az(xi var1) {
		while (true) {
			int var3 = var1.cg();
			if (var3 == 0) {
				return;
			}

			hf(this, var1, var3, -643670049);
		}
	}

	@ObfuscatedName("hy")
	@ObfuscatedSignature(
		descriptor = "(Lfi;I)V"
	)
	public static void hy(fi var0, int var1) {
		int var2 = var0.ae_fld + 1 & 996017125;
		if (var0.al_fld != var2) {
			var0.as_fld[var0.ae_fld] = var1;
			var0.ay_fld[var0.ae_fld * -1741143045] = 0;
			var0.ae_fld = var2;
		}
	}

	@ObfuscatedName("kh")
	@ObfuscatedSignature(
		descriptor = "()[[I"
	)
	public int[][] kh() {
		return this.az_fld;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void ae() {
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

			hf(this, var1, var2, -1219619261);
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lub;)V"
	)
	public static void ah(ub var0) {
		ak_fld = var0;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Lyg;"
	)
	public static yg ar(int var0) throws EOFException {
		try {
			yg var1 = (yg)ag_fld.ak(var0);
			if (var1 != null) {
				return var1;
			} else {
				byte[] var2 = ak_fld.bb(39, var0, 584982574);
				var1 = new yg();
				if (null != var2) {
					var1.az(new xi(var2));
				}

				var1.ae();
				ag_fld.az(var1, var0);
				return var1;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lub;)V"
	)
	public static void ay(ub var0) {
		ak_fld = var0;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Lyg;"
	)
	public static yg as(int var0) throws EOFException {
		try {
			yg var1 = (yg)ag_fld.ak(var0);
			if (var1 != null) {
				return var1;
			} else {
				byte[] var2 = ak_fld.bb(39, var0, 584982574);
				var1 = new yg();
				if (null != var2) {
					var1.az(new xi(var2));
				}

				var1.ae();
				ag_fld.az(var1, var0);
				return var1;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Lyg;"
	)
	public static yg al(int var0) throws EOFException {
		try {
			yg var1 = (yg)ag_fld.ak(var0);
			if (var1 != null) {
				return var1;
			} else {
				byte[] var2 = ak_fld.bb(1338374588, var0, 584982574);
				var1 = new yg();
				if (null != var2) {
					var1.az(new xi(var2));
				}

				var1.ae();
				ag_fld.az(var1, var0);
				return var1;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Lyg;"
	)
	public static yg af(int var0) throws EOFException {
		try {
			yg var1 = (yg)ag_fld.ak(var0);
			if (var1 != null) {
				return var1;
			} else {
				byte[] var2 = ak_fld.bb(39, var0, 584982574);
				var1 = new yg();
				if (null != var2) {
					var1.az(new xi(var2));
				}

				var1.ae();
				ag_fld.az(var1, var0);
				return var1;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	yg() {
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

			hf(this, var1, var2, -1421449768);
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	void an(xi var1, int var2) {
		if (var2 == 1) {
			int var3 = var1.cg();
			if (this.az_fld == null) {
				this.az_fld = new int[var3][];
			}

			for (int var4 = var1.cg(); var4 != 255; var4 = var1.cg()) {
				int var5 = var4 & -726692653;
				boolean var6 = (var4 & 1981278882) != 0;
				int[] var7 = new int[var1.cg()];

				for (int var8 = 0; var8 < var7.length; var8++) {
					var7[var8] = var1.dz();
				}

				this.az_fld[var5] = var7;
				if (var6) {
					if (null == this.av_fld) {
						this.av_fld = (Object[][])(new Object[this.az_fld.length][]);
					}

					this.av_fld[var5] = (Object[])wu.av(var1, var7);
				}
			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lub;)V"
	)
	public static void aw(ub var0) {
		ak_fld = var0;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ai() {
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "()[[Ljava/lang/Object;"
	)
	public Object[][] ba() {
		return (Object[][])this.av_fld;
	}

	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "(Lyg;Lxi;II)V"
	)
	public static void hf(yg var0, xi var1, int var2, int var3) {
		if (var0 == null) {
			var0.getClass();
		} else {
			if (var2 == 1) {
				int var4 = var1.cg();
				if (var0.az_fld == null) {
					var0.az_fld = new int[var4][];
				}

				for (int var5 = var1.cg(); var5 != 255; var5 = var1.cg()) {
					if (var3 >= 1458895526) {
						return;
					}

					int var6 = var5 & 127;
					boolean var7 = (var5 & 128) != 0;
					int[] var8 = new int[var1.cg()];

					for (int var9 = 0; var9 < var8.length; var9++) {
						var8[var9] = var1.dz();
					}

					var0.az_fld[var6] = var8;
					if (var7) {
						if (null == var0.av_fld) {
							if (var3 >= 1458895526) {
								return;
							}

							var0.av_fld = (Object[][])(new Object[var0.az_fld.length][]);
						}

						var0.av_fld[var6] = (Object[])wu.av(var1, var8);
					}
				}
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(CI)Z"
	)
	static final boolean ag(char var0) {
		if (Character.isISOControl(var0)) {
			return false;
		} else if (ey.au(var0)) {
			return true;
		} else {
			char[] var2 = zh.az_fld;

			for (int var3 = 0; var3 < var2.length; var3++) {
				char var4 = var2[var3];
				if (var4 == var0) {
					return true;
				}
			}

			var2 = zh.av_fld;

			for (int var6 = 0; var6 < var2.length; var6++) {
				char var7 = var2[var6];
				if (var7 == var0) {
					return true;
				}
			}

			return false;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxi;II)V"
	)
	void av(xi var1, int var2, int var3) {
		if (var2 == 1) {
			int var4 = var1.cg();
			if (this.az_fld == null) {
				this.az_fld = new int[var4][];
			}

			for (int var5 = var1.ei(); var5 != 255; var5 = var1.eq()) {
				if (var3 >= 1458895526) {
					return;
				}

				int var6 = var5 & 127;
				boolean var7 = (var5 & 128) != 0;
				int[] var8 = new int[var1.eq()];

				for (int var9 = 0; var9 < var8.length; var9++) {
					var8[var9] = var1.ew((byte)17);
				}

				this.az_fld[var6] = var8;
				if (var7) {
					if (null == this.av_fld) {
						if (var3 >= 1458895526) {
							return;
						}

						this.av_fld = (Object[][])(new Object[this.az_fld.length][]);
					}

					this.av_fld[var6] = (Object[])wu.av(var1, var8);
				}
			}
		}
	}
}
