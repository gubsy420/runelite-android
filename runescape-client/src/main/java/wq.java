import java.util.Arrays;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("wq")
public class wq {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] ag_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "[[[I"
	)
	int[][][] az_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean ak_fld = false;

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(Lxj;III)V"
	)
	void bj(xj var1, int var2, int var3, int var4) {
		this.ak_fld = true;
		int var5 = var1.cm();
		var1.as(1459117299);

		for (int var6 = 0; var6 < var2; var6++) {
			for (int var7 = 0; var7 < var3; var7++) {
				for (int var8 = 0; var8 < var4; var8++) {
					int var9 = var1.ar(1, -106081977);
					if (1 == var9) {
						this.az_fld[var6][var7][var8] = var1.ar(26, -106081977);
					} else {
						this.az_fld[var6][var7][var8] = -1;
					}
				}
			}
		}

		var1.af(1603901614);
		this.ag_fld = new int[var5];
		Arrays.fill(this.ag_fld, -1);
		var5 = 0;

		for (int var19 = 0; var19 < var2; var19++) {
			for (int var20 = 0; var20 < var3; var20++) {
				for (int var21 = 0; var21 < var4; var21++) {
					int var22 = this.az_fld[var19][var20][var21];
					if (-1 != var22) {
						int var10 = hw.ag(var22);
						int var11 = up.az(var22);
						int var12 = var10 >> 3;
						int var14 = var11 >> 3;
						int var16 = jp.ak(var12, var14);

						for (int var17 = 0; var17 < var5; var17++) {
							if (var16 == this.ag_fld[var17]) {
								var16 = -1;
								break;
							}
						}

						if (-1 != var16) {
							this.ag_fld[var5] = var16;
							var5++;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	public int ae() {
		return this.ag_fld.length;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	public int ah(int var1) {
		return this.ag_fld[var1];
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIB)V"
	)
	public void ay(int var1, int var2) {
		this.ak_fld = false;
		int var5 = var1 - 6;
		int var4 = var5 >> 3;
		int var8 = var1 + 6;
		int var7 = var8 >> 3;
		int var9 = var7;
		int var11 = var2 - 6;
		int var10 = var11 >> 3;
		int var12 = var10;
		int var14 = var2 + 6;
		int var13 = var14 >> 3;
		int var15 = var13;
		int var16 = (1 + (var7 - var4)) * (1 + (var13 - var10));
		this.ag_fld = new int[var16];
		int var17 = 0;

		for (int var18 = var4; var18 <= var9; var18++) {
			for (int var19 = var12; var19 <= var15; var19++) {
				this.ag_fld[var17] = jp.ak(var18, var19);
				var17++;
			}
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	public static int ax(int var0, int var1) {
		return var1 + (var0 << 8);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lxj;IIIB)V"
	)
	void af(xj var1, int var2, int var3, int var4, byte var5) {
		this.ak_fld = true;
		int var6 = var1.cm();
		var1.as(-500470021);

		for (int var7 = 0; var7 < var2; var7++) {
			if (var5 == 8) {
				return;
			}

			for (int var8 = 0; var8 < var3; var8++) {
				for (int var9 = 0; var9 < var4; var9++) {
					int var10 = var1.ar(1, -106081977);
					if (1 == var10) {
						this.az_fld[var7][var8][var9] = var1.ar(26, -106081977);
					} else {
						this.az_fld[var7][var8][var9] = -1;
					}
				}
			}
		}

		var1.af(1379905562);
		this.ag_fld = new int[var6];
		Arrays.fill(this.ag_fld, -1);
		var6 = 0;

		for (int var20 = 0; var20 < var2; var20++) {
			if (var5 == 8) {
				return;
			}

			for (int var21 = 0; var21 < var3; var21++) {
				for (int var22 = 0; var22 < var4; var22++) {
					int var23 = this.az_fld[var20][var21][var22];
					if (-1 != var23) {
						if (var5 == 8) {
							return;
						}

						int var11 = hw.ag(var23);
						int var12 = up.az(var23);
						int var13 = var11 >> 3;
						int var15 = var12 >> 3;
						int var17 = jp.ak(var13, var15);

						for (int var18 = 0; var18 < var6; var18++) {
							if (var17 == this.ag_fld[var18]) {
								var17 = -1;
								break;
							}
						}

						if (-1 != var17) {
							this.ag_fld[var6] = var17;
							var6++;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int aq(int var0) {
		return var0 & 0xFF;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	public static int au(int var0, int var1) {
		return var1 + (var0 << 8);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(III)I"
	)
	public int at(int var1, int var2, int var3) {
		return this.az_fld[var1][var2][var3];
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lxj;I)V"
	)
	public void as(xj var1) {
		this.af(var1, 4, 13, 13, (byte)-11);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int aa(int var0) {
		return var0 >> 8;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int ai(int var0) {
		return var0 & 0xFF;
	}

	@ObfuscatedName("py")
	@ObfuscatedSignature(
		descriptor = "(Lwq;Lxj;III)V"
	)
	public static void py(wq var0, xj var1, int var2, int var3) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.af(var1, 4, var2, var3, (byte)2);
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(Lxj;III)V"
	)
	void bk(xj var1, int var2, int var3, int var4) {
		this.ak_fld = true;
		int var5 = var1.cm();
		var1.as(1320383084);

		for (int var6 = 0; var6 < var2; var6++) {
			for (int var7 = 0; var7 < var3; var7++) {
				for (int var8 = 0; var8 < var4; var8++) {
					int var9 = var1.ar(1, -106081977);
					if (1 == var9) {
						this.az_fld[var6][var7][var8] = var1.ar(26, -106081977);
					} else {
						this.az_fld[var6][var7][var8] = -1;
					}
				}
			}
		}

		var1.af(-815338769);
		this.ag_fld = new int[var5];
		Arrays.fill(this.ag_fld, -1);
		var5 = 0;

		for (int var19 = 0; var19 < var2; var19++) {
			for (int var20 = 0; var20 < var3; var20++) {
				for (int var21 = 0; var21 < var4; var21++) {
					int var22 = this.az_fld[var19][var20][var21];
					if (-1 != var22) {
						int var10 = hw.ag(var22);
						int var11 = up.az(var22);
						int var12 = var10 >> 3;
						int var14 = var11 >> 3;
						int var16 = jp.ak(var12, var14);

						for (int var17 = 0; var17 < var5; var17++) {
							if (var16 == this.ag_fld[var17]) {
								var16 = -1;
								break;
							}
						}

						if (-1 != var16) {
							this.ag_fld[var5] = var16;
							var5++;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void bz(int var1, int var2) {
		this.ak_fld = false;
		int var4 = var1 - 6;
		int var3 = var4 >> 3;
		int var7 = var1 + 6;
		int var6 = var7 >> 3;
		int var8 = var6;
		int var10 = var2 - 6;
		int var9 = var10 >> 3;
		int var11 = var9;
		int var13 = var2 + 6;
		int var12 = var13 >> 3;
		int var14 = var12;
		int var15 = (1 + (var6 - var3)) * (1 + (var12 - var9));
		this.ag_fld = new int[var15];
		int var16 = 0;

		for (int var17 = var3; var17 <= var8; var17++) {
			for (int var18 = var11; var18 <= var14; var18++) {
				this.ag_fld[var16] = jp.ak(var17, var18);
				var16++;
			}
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean ad() {
		return this.ak_fld;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ao() {
		return this.ag_fld.length;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int ab(int var1) {
		return this.ag_fld[var1];
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void bm(int var1, int var2) {
		this.ak_fld = false;
		int var4 = var1 - 6;
		int var3 = var4 >> 3;
		int var7 = var1 + 6;
		int var6 = var7 >> 3;
		int var8 = var6;
		int var10 = var2 - 6;
		int var9 = var10 >> 3;
		int var11 = var9;
		int var13 = var2 + 6;
		int var12 = var13 >> 3;
		int var14 = var12;
		int var15 = (1 + (var6 - var3)) * (1 + (var12 - var9));
		this.ag_fld = new int[var15];
		int var16 = 0;

		for (int var17 = var3; var17 <= var8; var17++) {
			for (int var18 = var11; var18 <= var14; var18++) {
				this.ag_fld[var16] = jp.ak(var17, var18);
				var16++;
			}
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	public static int al(int var0, int var1) {
		return var1 + (var0 << 8);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(III)I"
	)
	public int ac(int var1, int var2, int var3) {
		return this.az_fld[var1][var2][var3];
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean av() {
		return this.ak_fld;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void bd(int var1, int var2) {
		this.ak_fld = false;
		int var4 = var1 - 6;
		int var3 = var4 >> 3;
		int var7 = var1 + 6;
		int var6 = var7 >> 3;
		int var8 = var6;
		int var10 = var2 - 6;
		int var9 = var10 >> 3;
		int var11 = var9;
		int var13 = var2 + 6;
		int var12 = var13 >> 3;
		int var14 = var12;
		int var15 = (1 + (var6 - var3)) * (1 + (var12 - var9));
		this.ag_fld = new int[var15];
		int var16 = 0;

		for (int var17 = var3; var17 <= var8; var17++) {
			for (int var18 = var11; var18 <= var14; var18++) {
				this.ag_fld[var16] = jp.ak(var17, var18);
				var16++;
			}
		}
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(Lxj;III)V"
	)
	void bh(xj var1, int var2, int var3, int var4) {
		this.ak_fld = true;
		int var5 = var1.cm();
		var1.as(1135839578);

		for (int var6 = 0; var6 < var2; var6++) {
			for (int var7 = 0; var7 < var3; var7++) {
				for (int var8 = 0; var8 < var4; var8++) {
					int var9 = var1.ar(1, -106081977);
					if (1 == var9) {
						this.az_fld[var6][var7][var8] = var1.ar(26, -106081977);
					} else {
						this.az_fld[var6][var7][var8] = -1;
					}
				}
			}
		}

		var1.af(940127151);
		this.ag_fld = new int[var5];
		Arrays.fill(this.ag_fld, -1);
		var5 = 0;

		for (int var19 = 0; var19 < var2; var19++) {
			for (int var20 = 0; var20 < var3; var20++) {
				for (int var21 = 0; var21 < var4; var21++) {
					int var22 = this.az_fld[var19][var20][var21];
					if (-1 != var22) {
						int var10 = hw.ag(var22);
						int var11 = up.az(var22);
						int var12 = var10 >> 3;
						int var14 = var11 >> 3;
						int var16 = jp.ak(var12, var14);

						for (int var17 = 0; var17 < var5; var17++) {
							if (var16 == this.ag_fld[var17]) {
								var16 = -1;
								break;
							}
						}

						if (-1 != var16) {
							this.ag_fld[var5] = var16;
							var5++;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(Lxj;)V"
	)
	public void br(xj var1) {
		this.af(var1, 4, 13, 13, (byte)-49);
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Lxj;)V"
	)
	public void be(xj var1) {
		this.af(var1, 4, 13, 13, (byte)-51);
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(Lxj;II)V"
	)
	public void bs(xj var1, int var2, int var3) {
		this.af(var1, 4, var2, var3, (byte)119);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIII)I"
	)
	public int aw(int var1, int var2, int var3) {
		return this.az_fld[var1][var2][var3];
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	public static int an(int var0, int var1) {
		return var1 + (var0 << 8);
	}

	@ObfuscatedName("pz")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)I"
	)
	public static int pz(xi var0) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			int var1 = var0.dr();
			return var1 >>> 1 ^ -(var1 & 1);
		}
	}

	public wq() {
		this.az_fld = new int[4][13][13];
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(Lxj;III)V"
	)
	void bf(xj var1, int var2, int var3, int var4) {
		this.ak_fld = true;
		int var5 = var1.cm();
		var1.as(-1684118984);

		for (int var6 = 0; var6 < var2; var6++) {
			for (int var7 = 0; var7 < var3; var7++) {
				for (int var8 = 0; var8 < var4; var8++) {
					int var9 = var1.ar(1, -106081977);
					if (1 == var9) {
						this.az_fld[var6][var7][var8] = var1.ar(26, -106081977);
					} else {
						this.az_fld[var6][var7][var8] = -1;
					}
				}
			}
		}

		var1.af(463417071);
		this.ag_fld = new int[var5];
		Arrays.fill(this.ag_fld, -1);
		var5 = 0;

		for (int var19 = 0; var19 < var2; var19++) {
			for (int var20 = 0; var20 < var3; var20++) {
				for (int var21 = 0; var21 < var4; var21++) {
					int var22 = this.az_fld[var19][var20][var21];
					if (-1 != var22) {
						int var10 = hw.ag(var22);
						int var11 = up.az(var22);
						int var12 = var10 >> 3;
						int var14 = var11 >> 3;
						int var16 = jp.ak(var12, var14);

						for (int var17 = 0; var17 < var5; var17++) {
							if (var16 == this.ag_fld[var17]) {
								var16 = -1;
								break;
							}
						}

						if (-1 != var16) {
							this.ag_fld[var5] = var16;
							var5++;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lxj;III)V"
	)
	public void ar(xj var1, int var2, int var3, int var4) {
		this.af(var1, 4, var2, var3, (byte)2);
	}
}
