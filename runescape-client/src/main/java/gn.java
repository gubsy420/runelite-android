import net.runelite.api.CollisionData;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("gn")
@Implements({"CollisionData"})
public class gn implements CollisionData {
	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int bg_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ak_fld;
	@ObfuscatedGetter(
		intValue = 1727918519
	)
	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int bx_fld;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ax_fld;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int aq_fld;
	@ObfuscatedGetter(
		intValue = 327473271
	)
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int by_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ah_fld;
	@ObfuscatedGetter(
		intValue = -15970007
	)
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int bl_fld;
	@ObfuscatedGetter(
		intValue = -1193526369
	)
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int bo_fld;
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "[[I"
	)
	int[][] bp_fld;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	static long am_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int av_fld;

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IIIIIZI)V"
	)
	void ax(int var1, int var2, int var3, int var4, int var5, boolean var6, int var7) {
		int var8 = 256;
		if (var6) {
			var8 += 131072;
		}

		label68: {
			var1 -= this.by_fld;
			var2 -= this.bl_fld;
			if (var5 != 1) {
				if (var7 <= -2115221177) {
					return;
				}

				if (var5 != 3) {
					break label68;
				}
			}

			int var9 = var3;
			var3 = var4;
			var4 = var9;
		}

		for (int var13 = var1; var13 < var3 + var1; var13++) {
			if (var7 <= -2115221177) {
				return;
			}

			if (var13 >= 0) {
				if (var7 <= -2115221177) {
					return;
				}

				if (var13 < this.bx_fld) {
					for (int var10 = var2; var10 < var4 + var2; var10++) {
						if (var10 >= 0 && var10 < this.bo_fld) {
							this.ay(var13, var10, var8, 106886831);
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int ak(int var1) {
		return this.by_fld;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(S)I"
	)
	int ag(short var1) {
		return this.bl_fld;
	}

	@ObfuscatedName("sm")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void sm() {
		this.ah(1639049925);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int az(int var1) {
		return this.bx_fld;
	}

	@ObfuscatedName("ry")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	public boolean ry(int var1, int var2) {
		return this.af(var1, var2, (byte)2);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	public int av(byte var1) {
		return this.bo_fld;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V"
	)
	final void ae(int var1, int var2, int var3, int var4, byte var5) {
		this.by_fld = var1;
		this.bl_fld = var2;
		this.bx_fld = var3;
		this.bo_fld = var4;
	}

	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		descriptor = "(IIIIZ)V"
	)
	public void ea(int var1, int var2, int var3, int var4, boolean var5) {
		kw(this, var1, var2, var3, var4, var5, -2144555044);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void ah(int var1) {
		for (int var2 = 0; var2 < this.bx_fld; var2++) {
			for (int var3 = 0; var3 < this.bo_fld; var3++) {
				if (var2 >= 1) {
					if (var1 != 1639049925) {
						return;
					}

					if (var3 >= 1 && var2 < this.bx_fld - 5 && var3 < this.bo_fld - 5) {
						this.bp_fld[var2][var3] = 1073741824;
						continue;
					}
				}

				this.bp_fld[var2][var3] = 16777215;
			}
		}
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	void bf(int var1, int var2, int var3) {
		this.bp_fld[var1][var2] = this.bp_fld[var1][var2] | var3;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	public void ar(int var1, int var2, int var3, int var4) {
		this.as(var1 - this.by_fld, var2 - this.bl_fld, var3, 1178493659);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z"
	)
	public boolean af(int var1, int var2, byte var3) {
		return lc(this, var1 - this.by_fld, var2 - this.bl_fld, (short)31691);
	}

	@ObfuscatedName("lc")
	@ObfuscatedSignature(
		descriptor = "(Lgn;IIS)Z"
	)
	public static boolean lc(gn var0, int var1, int var2, short var3) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var1 >= 1 && var1 < var0.bx_fld - 5 && var2 >= 1 && var2 < var0.bo_fld - 5;
		}
	}

	@ObfuscatedName("jj")
	@ObfuscatedSignature(
		descriptor = "(Lgn;IIIIZ)V"
	)
	public static void jj(gn var0, int var1, int var2, int var3, int var4, boolean var5) {
		var1 -= var0.by_fld;
		var2 -= var0.bl_fld;
		if (0 == var3) {
			if (var4 == 0) {
				var0.as(var1, var2, 128, 1178493659);
				var0.as(var1 - 1, var2, 8, 1178493659);
			}

			if (var4 == 1) {
				var0.as(var1, var2, 2, 1178493659);
				var0.as(var1, var2 + 1, 32, 1178493659);
			}

			if (2 == var4) {
				var0.as(var1, var2, 8, 1178493659);
				var0.as(var1 + 1, var2, 128, 1178493659);
			}

			if (3 == var4) {
				var0.as(var1, var2, 32, 1178493659);
				var0.as(var1, var2 - 1, 2, 1178493659);
			}
		}

		if (1 == var3 || 3 == var3) {
			if (var4 == 0) {
				var0.as(var1, var2, 1, 1178493659);
				var0.as(var1 - 1, var2 + 1, 16, 1178493659);
			}

			if (1 == var4) {
				var0.as(var1, var2, 4, 1178493659);
				var0.as(1 + var1, var2 + 1, 64, 1178493659);
			}

			if (2 == var4) {
				var0.as(var1, var2, 16, 1178493659);
				var0.as(1 + var1, var2 - 1, 1, 1178493659);
			}

			if (var4 == 3) {
				var0.as(var1, var2, 64, 1178493659);
				var0.as(var1 - 1, var2 - 1, 4, 1178493659);
			}
		}

		if (var3 == 2) {
			if (0 == var4) {
				var0.as(var1, var2, 130, 1178493659);
				var0.as(var1 - 1, var2, 8, 1178493659);
				var0.as(var1, 1 + var2, 32, 1178493659);
			}

			if (1 == var4) {
				var0.as(var1, var2, 10, 1178493659);
				var0.as(var1, 1 + var2, 32, 1178493659);
				var0.as(var1 + 1, var2, 128, 1178493659);
			}

			if (var4 == 2) {
				var0.as(var1, var2, 40, 1178493659);
				var0.as(1 + var1, var2, 128, 1178493659);
				var0.as(var1, var2 - 1, 2, 1178493659);
			}

			if (3 == var4) {
				var0.as(var1, var2, 160, 1178493659);
				var0.as(var1, var2 - 1, 2, 1178493659);
				var0.as(var1 - 1, var2, 8, 1178493659);
			}
		}

		if (var5) {
			if (0 == var3) {
				if (var4 == 0) {
					var0.as(var1, var2, 65536, 1178493659);
					var0.as(var1 - 1, var2, 4096, 1178493659);
				}

				if (1 == var4) {
					var0.as(var1, var2, 1024, 1178493659);
					var0.as(var1, 1 + var2, 16384, 1178493659);
				}

				if (2 == var4) {
					var0.as(var1, var2, 4096, 1178493659);
					var0.as(var1 + 1, var2, 65536, 1178493659);
				}

				if (var4 == 3) {
					var0.as(var1, var2, 16384, 1178493659);
					var0.as(var1, var2 - 1, 1024, 1178493659);
				}
			}

			if (1 == var3 || 3 == var3) {
				if (var4 == 0) {
					var0.as(var1, var2, 512, 1178493659);
					var0.as(var1 - 1, var2 + 1, 8192, 1178493659);
				}

				if (var4 == 1) {
					var0.as(var1, var2, 2048, 1178493659);
					var0.as(var1 + 1, 1 + var2, 32768, 1178493659);
				}

				if (2 == var4) {
					var0.as(var1, var2, 8192, 1178493659);
					var0.as(var1 + 1, var2 - 1, 512, 1178493659);
				}

				if (3 == var4) {
					var0.as(var1, var2, 32768, 1178493659);
					var0.as(var1 - 1, var2 - 1, 2048, 1178493659);
				}
			}

			if (2 == var3) {
				if (var4 == 0) {
					var0.as(var1, var2, 66560, 1178493659);
					var0.as(var1 - 1, var2, 4096, 1178493659);
					var0.as(var1, var2 + 1, 16384, 1178493659);
				}

				if (1 == var4) {
					var0.as(var1, var2, 5120, 1178493659);
					var0.as(var1, 1 + var2, 16384, 1178493659);
					var0.as(1 + var1, var2, 65536, 1178493659);
				}

				if (var4 == 2) {
					var0.as(var1, var2, 20480, 1178493659);
					var0.as(var1 + 1, var2, 65536, 1178493659);
					var0.as(var1, var2 - 1, 1024, 1178493659);
				}

				if (var4 == 3) {
					var0.as(var1, var2, 81920, 1178493659);
					var0.as(var1, var2 - 1, 1024, 1178493659);
					var0.as(var1 - 1, var2, 4096, 1178493659);
				}
			}
		}
	}

	@ObfuscatedName("uf")
	@ObfuscatedSignature(
		descriptor = "(Lgn;IIIIZ)V"
	)
	public static void uf(gn var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ax(var1, var2, var3, var4, 0, var5, 729634147);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIIIZB)V"
	)
	public void an(int var1, int var2, int var3, int var4, boolean var5, byte var6) {
		this.ax(var1, var2, var3, var4, 0, var5, -625940960);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IIB)V"
	)
	public void aa(int var1, int var2, byte var3) {
		var1 -= this.by_fld;
		var2 -= this.bl_fld;
		this.bp_fld[var1][var2] = this.bp_fld[var1][var2] | 2097152;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIS)V"
	)
	public void ai(int var1, int var2, short var3) {
		var1 -= this.by_fld;
		var2 -= this.bl_fld;
		this.bp_fld[var1][var2] = this.bp_fld[var1][var2] | 262144;
	}

	@ObfuscatedName("gt")
	@ObfuscatedSignature(
		descriptor = "(Lgn;II)V"
	)
	public static void gt(gn var0, int var1, int var2) {
		var1 -= var0.by_fld;
		var2 -= var0.bl_fld;
		var0.bp_fld[var1][var2] = var0.bp_fld[var1][var2] | 2097152;
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(IIIIZ)V"
	)
	public void cy(int var1, int var2, int var3, int var4, boolean var5) {
		this.ax(var1, var2, var3, var4, 0, var5, 1067030182);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ao() {
		return this.by_fld;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ab() {
		return this.by_fld;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ap() {
		return this.by_fld;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIIIZB)V"
	)
	public void aq(int var1, int var2, int var3, int var4, boolean var5, byte var6) {
		var1 -= this.by_fld;
		var2 -= this.bl_fld;
		if (0 == var3) {
			if (var4 == 0) {
				this.as(var1, var2, 128, 1178493659);
				this.as(var1 - 1, var2, 8, 1178493659);
			}

			if (var4 == 1) {
				this.as(var1, var2, 2, 1178493659);
				this.as(var1, var2 + 1, 32, 1178493659);
			}

			if (2 == var4) {
				this.as(var1, var2, 8, 1178493659);
				this.as(var1 + 1, var2, 128, 1178493659);
			}

			if (3 == var4) {
				this.as(var1, var2, 32, 1178493659);
				this.as(var1, var2 - 1, 2, 1178493659);
			}
		}

		label220: {
			if (1 != var3) {
				if (3 != var3) {
					break label220;
				}

				if (var6 <= -1) {
					return;
				}
			}

			if (var4 == 0) {
				this.as(var1, var2, 1, 1178493659);
				this.as(var1 - 1, var2 + 1, 16, 1178493659);
			}

			if (1 == var4) {
				this.as(var1, var2, 4, 1178493659);
				this.as(1 + var1, var2 + 1, 64, 1178493659);
			}

			if (2 == var4) {
				if (var6 <= -1) {
					return;
				}

				this.as(var1, var2, 16, 1178493659);
				this.as(1 + var1, var2 - 1, 1, 1178493659);
			}

			if (var4 == 3) {
				this.as(var1, var2, 64, 1178493659);
				this.as(var1 - 1, var2 - 1, 4, 1178493659);
			}
		}

		if (var3 == 2) {
			if (0 == var4) {
				this.as(var1, var2, 130, 1178493659);
				this.as(var1 - 1, var2, 8, 1178493659);
				this.as(var1, 1 + var2, 32, 1178493659);
			}

			if (1 == var4) {
				if (var6 <= -1) {
					return;
				}

				this.as(var1, var2, 10, 1178493659);
				this.as(var1, 1 + var2, 32, 1178493659);
				this.as(var1 + 1, var2, 128, 1178493659);
			}

			if (var4 == 2) {
				this.as(var1, var2, 40, 1178493659);
				this.as(1 + var1, var2, 128, 1178493659);
				this.as(var1, var2 - 1, 2, 1178493659);
			}

			if (3 == var4) {
				this.as(var1, var2, 160, 1178493659);
				this.as(var1, var2 - 1, 2, 1178493659);
				this.as(var1 - 1, var2, 8, 1178493659);
			}
		}

		if (var5) {
			if (0 == var3) {
				if (var4 == 0) {
					this.as(var1, var2, 65536, 1178493659);
					this.as(var1 - 1, var2, 4096, 1178493659);
				}

				if (1 == var4) {
					this.as(var1, var2, 1024, 1178493659);
					this.as(var1, 1 + var2, 16384, 1178493659);
				}

				if (2 == var4) {
					if (var6 <= -1) {
						return;
					}

					this.as(var1, var2, 4096, 1178493659);
					this.as(var1 + 1, var2, 65536, 1178493659);
				}

				if (var4 == 3) {
					this.as(var1, var2, 16384, 1178493659);
					this.as(var1, var2 - 1, 1024, 1178493659);
				}
			}

			label224: {
				if (1 != var3) {
					if (var6 <= -1) {
						return;
					}

					if (3 != var3) {
						break label224;
					}

					if (var6 <= -1) {
						return;
					}
				}

				if (var4 == 0) {
					this.as(var1, var2, 512, 1178493659);
					this.as(var1 - 1, var2 + 1, 8192, 1178493659);
				}

				if (var4 == 1) {
					this.as(var1, var2, 2048, 1178493659);
					this.as(var1 + 1, 1 + var2, 32768, 1178493659);
				}

				if (2 == var4) {
					this.as(var1, var2, 8192, 1178493659);
					this.as(var1 + 1, var2 - 1, 512, 1178493659);
				}

				if (3 == var4) {
					this.as(var1, var2, 32768, 1178493659);
					this.as(var1 - 1, var2 - 1, 2048, 1178493659);
				}
			}

			if (2 == var3) {
				if (var4 == 0) {
					this.as(var1, var2, 66560, 1178493659);
					this.as(var1 - 1, var2, 4096, 1178493659);
					this.as(var1, var2 + 1, 16384, 1178493659);
				}

				if (1 == var4) {
					this.as(var1, var2, 5120, 1178493659);
					this.as(var1, 1 + var2, 16384, 1178493659);
					this.as(1 + var1, var2, 65536, 1178493659);
				}

				if (var4 == 2) {
					this.as(var1, var2, 20480, 1178493659);
					this.as(var1 + 1, var2, 65536, 1178493659);
					this.as(var1, var2 - 1, 1024, 1178493659);
				}

				if (var4 == 3) {
					this.as(var1, var2, 81920, 1178493659);
					this.as(var1, var2 - 1, 1024, 1178493659);
					this.as(var1 - 1, var2, 4096, 1178493659);
				}
			}
		}
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	void bp(int var1, int var2, int var3) {
		this.bp_fld[var1][var2] = this.bp_fld[var1][var2] & ~var3;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int bm() {
		return this.bo_fld;
	}

	@ObfuscatedName("vq")
	@ObfuscatedSignature(
		descriptor = "(Lgn;II)V"
	)
	public static void vq(gn var0, int var1, int var2) {
		var1 -= var0.by_fld;
		var2 -= var0.bl_fld;
		var0.bp_fld[var1][var2] = var0.bp_fld[var1][var2] | 262144;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	final void bd(int var1, int var2, int var3, int var4) {
		this.by_fld = var1 * 1508910566;
		this.bl_fld = 102594356 * var2;
		this.bx_fld = var3 * -632730197;
		this.bo_fld = var4 * -1236782012;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void bt(int var1, int var2, int var3) {
		this.as(var1 - this.by_fld, var2 - this.bl_fld, var3, 1178493659);
	}

	public gn(int var1, int var2, boolean var3) {
		if (var3) {
			this.ae(-1, -1, 6 + var1, var2 + 6, (byte)53);
		} else {
			this.ae(0, 0, var1, var2, (byte)117);
		}

		this.bp_fld = new int[this.bx_fld][this.bo_fld];
		this.ah(1639049925);
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(III)Z"
	)
	boolean bj(int var1, int var2, int var3) {
		return (this.bp_fld[var1][var2] & var3) != 0;
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	void by(int var1, int var2, int var3) {
		this.bp_fld[var1][var2] = this.bp_fld[var1][var2] | var3;
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	void bx(int var1, int var2, int var3) {
		this.bp_fld[var1][var2] = this.bp_fld[var1][var2] & ~var3;
	}

	@ObfuscatedName("mf")
	@ObfuscatedSignature(
		descriptor = "(IIIIZ)V"
	)
	public void mf(int var1, int var2, int var3, int var4, boolean var5) {
		this.an(var1, var2, var3, var4, var5, (byte)16);
	}

	@ObfuscatedName("jw")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void jw(int var1, int var2) {
		this.aa(var1, var2, (byte)-111);
	}

	@ObfuscatedName("xv")
	@ObfuscatedSignature(
		descriptor = "(Lgn;IIIIZ)V"
	)
	public static void xv(gn var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var1 -= var0.by_fld;
			var2 -= var0.bl_fld;
			if (0 == var3) {
				if (var4 == 0) {
					var0.as(var1, var2, 128, 1178493659);
					var0.as(var1 - 1, var2, 8, 1178493659);
				}

				if (var4 == 1) {
					var0.as(var1, var2, 2, 1178493659);
					var0.as(var1, var2 + 1, -870928615, 1178493659);
				}

				if (2 == var4) {
					var0.as(var1, var2, 8, 1178493659);
					var0.as(var1 + 1, var2, 128, 1178493659);
				}

				if (3 == var4) {
					var0.as(var1, var2, -1847821304, 1178493659);
					var0.as(var1, var2 - 1, 2, 1178493659);
				}
			}

			if (1 == var3 || 3 == var3) {
				if (var4 == 0) {
					var0.as(var1, var2, 1, 1178493659);
					var0.as(var1 - 1, var2 + 1, 16, 1178493659);
				}

				if (1 == var4) {
					var0.as(var1, var2, 4, 1178493659);
					var0.as(1 + var1, var2 + 1, 1727694599, 1178493659);
				}

				if (2 == var4) {
					var0.as(var1, var2, 16, 1178493659);
					var0.as(1 + var1, var2 - 1, 1, 1178493659);
				}

				if (var4 == 3) {
					var0.as(var1, var2, 27337188, 1178493659);
					var0.as(var1 - 1, var2 - 1, 4, 1178493659);
				}
			}

			if (var3 == 2) {
				if (0 == var4) {
					var0.as(var1, var2, -1201017866, 1178493659);
					var0.as(var1 - 1, var2, 8, 1178493659);
					var0.as(var1, 1 + var2, 32, 1178493659);
				}

				if (1 == var4) {
					var0.as(var1, var2, 10, 1178493659);
					var0.as(var1, 1 + var2, 32, 1178493659);
					var0.as(var1 + 1, var2, 128, 1178493659);
				}

				if (var4 == 2) {
					var0.as(var1, var2, 40, 1178493659);
					var0.as(1 + var1, var2, 128, 1178493659);
					var0.as(var1, var2 - 1, 2, 1178493659);
				}

				if (3 == var4) {
					var0.as(var1, var2, 2054990608, 1178493659);
					var0.as(var1, var2 - 1, 2, 1178493659);
					var0.as(var1 - 1, var2, 8, 1178493659);
				}
			}

			if (var5) {
				if (0 == var3) {
					if (var4 == 0) {
						var0.as(var1, var2, 65536, 1178493659);
						var0.as(var1 - 1, var2, 4096, 1178493659);
					}

					if (1 == var4) {
						var0.as(var1, var2, 643493058, 1178493659);
						var0.as(var1, 1 + var2, -1397509089, 1178493659);
					}

					if (2 == var4) {
						var0.as(var1, var2, -1994011683, 1178493659);
						var0.as(var1 + 1, var2, -1985041321, 1178493659);
					}

					if (var4 == 3) {
						var0.as(var1, var2, 16384, 1178493659);
						var0.as(var1, var2 - 1, 1024, 1178493659);
					}
				}

				if (1 == var3 || 3 == var3) {
					if (var4 == 0) {
						var0.as(var1, var2, 149773130, 1178493659);
						var0.as(var1 - 1, var2 + 1, 8192, 1178493659);
					}

					if (var4 == 1) {
						var0.as(var1, var2, -1406253303, 1178493659);
						var0.as(var1 + 1, 1 + var2, 32768, 1178493659);
					}

					if (2 == var4) {
						var0.as(var1, var2, 8192, 1178493659);
						var0.as(var1 + 1, var2 - 1, 512, 1178493659);
					}

					if (3 == var4) {
						var0.as(var1, var2, 32768, 1178493659);
						var0.as(var1 - 1, var2 - 1, 2048, 1178493659);
					}
				}

				if (2 == var3) {
					if (var4 == 0) {
						var0.as(var1, var2, 66560, 1178493659);
						var0.as(var1 - 1, var2, 4096, 1178493659);
						var0.as(var1, var2 + 1, 16384, 1178493659);
					}

					if (1 == var4) {
						var0.as(var1, var2, -767775947, 1178493659);
						var0.as(var1, 1 + var2, 16384, 1178493659);
						var0.as(1 + var1, var2, 1196198943, 1178493659);
					}

					if (var4 == 2) {
						var0.as(var1, var2, 20480, 1178493659);
						var0.as(var1 + 1, var2, 2072019050, 1178493659);
						var0.as(var1, var2 - 1, 60079235, 1178493659);
					}

					if (var4 == 3) {
						var0.as(var1, var2, 81920, 1178493659);
						var0.as(var1, var2 - 1, -1273635634, 1178493659);
						var0.as(var1 - 1, var2, -1780637632, 1178493659);
					}
				}
			}
		}
	}

	@ObfuscatedName("ys")
	@ObfuscatedSignature(
		descriptor = "(Lgn;II)V"
	)
	public static void ys(gn var0, int var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var1 -= var0.by_fld;
			var2 -= var0.bl_fld;
			var0.bp_fld[var1][var2] = var0.bp_fld[var1][var2] & -262145;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int at() {
		return this.bl_fld;
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	public boolean bi(int var1, int var2) {
		return lc(this, var1 - this.by_fld, var2 - this.bl_fld, (short)24586);
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void cm(int var1, int var2) {
		this.ai(var1, var2, (short)-32727);
	}

	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "(Lgn;IIIIIZI)V"
	)
	public static void hu(gn var0, int var1, int var2, int var3, int var4, int var5, boolean var6, int var7) {
		if (var0 == null) {
			var0.getClass();
		}

		int var8 = 256;
		if (var6) {
			var8 += 131072;
		}

		var1 -= var0.by_fld;
		var2 -= var0.bl_fld;
		if (1 == var5 || 3 == var5) {
			int var9 = var3;
			var3 = var4;
			var4 = var9;
		}

		for (int var13 = var1; var13 < var3 + var1; var13++) {
			if (var13 >= 0) {
				if (var7 <= -2104545491) {
					return;
				}

				if (var13 < var0.bx_fld) {
					for (int var10 = var2; var10 < var4 + var2; var10++) {
						if (var10 >= 0 && var10 < var0.bo_fld) {
							var0.as(var13, var10, var8, 1178493659);
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(Lrg;Z)Lkt;"
	)
	public static kt bp(rg var0, boolean var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var1 ? kt.ag_fld : oy.ma(var0.aw_fld, (byte)59);
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	boolean bc(int var1, int var2) {
		return var1 >= 1 && var1 < this.bx_fld - 5 && var2 >= 1 && var2 < this.bo_fld - 5;
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	boolean bn(int var1, int var2) {
		return var1 >= 1 && var1 < this.bx_fld - 5 && var2 >= 1 && var2 < this.bo_fld - 5;
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(IIIIZ)V"
	)
	public void bw(int var1, int var2, int var3, int var4, boolean var5) {
		var1 -= this.by_fld;
		var2 -= this.bl_fld;
		if (0 == var3) {
			if (0 == var4) {
				this.ay(var1, var2, 128, 1096102668);
				this.ay(var1 - 1, var2, 8, 1403234005);
			}

			if (1 == var4) {
				this.ay(var1, var2, 2, -363282860);
				this.ay(var1, 1 + var2, 32, -1151988462);
			}

			if (2 == var4) {
				this.ay(var1, var2, 8, 878930532);
				this.ay(var1 + 1, var2, 128, -996072050);
			}

			if (3 == var4) {
				this.ay(var1, var2, 32, -2428448);
				this.ay(var1, var2 - 1, 2, 400614013);
			}
		}

		if (var3 == 1 || var3 == 3) {
			if (0 == var4) {
				this.ay(var1, var2, 1, -2098097448);
				this.ay(var1 - 1, var2 + 1, 16, -1817989543);
			}

			if (var4 == 1) {
				this.ay(var1, var2, 4, -1764936316);
				this.ay(1 + var1, 1 + var2, 64, 130739758);
			}

			if (var4 == 2) {
				this.ay(var1, var2, 16, 856663827);
				this.ay(var1 + 1, var2 - 1, 1, -8385461);
			}

			if (var4 == 3) {
				this.ay(var1, var2, 64, -540022284);
				this.ay(var1 - 1, var2 - 1, 4, -1197912247);
			}
		}

		if (var3 == 2) {
			if (0 == var4) {
				this.ay(var1, var2, 130, -1253327092);
				this.ay(var1 - 1, var2, 8, -894913681);
				this.ay(var1, 1 + var2, 32, 1693664870);
			}

			if (1 == var4) {
				this.ay(var1, var2, 10, -384377081);
				this.ay(var1, 1 + var2, 32, -538927306);
				this.ay(1 + var1, var2, 128, -977049222);
			}

			if (2 == var4) {
				this.ay(var1, var2, 40, -1788633993);
				this.ay(var1 + 1, var2, 128, 1335870419);
				this.ay(var1, var2 - 1, 2, -1816591744);
			}

			if (var4 == 3) {
				this.ay(var1, var2, 160, 614258097);
				this.ay(var1, var2 - 1, 2, 524627129);
				this.ay(var1 - 1, var2, 8, -1503463476);
			}
		}

		if (var5) {
			if (var3 == 0) {
				if (0 == var4) {
					this.ay(var1, var2, 65536, 202122830);
					this.ay(var1 - 1, var2, 4096, -1746321232);
				}

				if (var4 == 1) {
					this.ay(var1, var2, 1024, 445405897);
					this.ay(var1, var2 + 1, 16384, -1045825289);
				}

				if (2 == var4) {
					this.ay(var1, var2, 4096, 1133632092);
					this.ay(1 + var1, var2, 65536, 663481079);
				}

				if (3 == var4) {
					this.ay(var1, var2, 16384, 443690037);
					this.ay(var1, var2 - 1, 1024, 1505881262);
				}
			}

			if (1 == var3 || var3 == 3) {
				if (0 == var4) {
					this.ay(var1, var2, 512, -1868440914);
					this.ay(var1 - 1, 1 + var2, 8192, -121427818);
				}

				if (1 == var4) {
					this.ay(var1, var2, 2048, 245279009);
					this.ay(var1 + 1, 1 + var2, 32768, -1937662616);
				}

				if (2 == var4) {
					this.ay(var1, var2, 8192, 777092229);
					this.ay(var1 + 1, var2 - 1, 512, -1401731162);
				}

				if (3 == var4) {
					this.ay(var1, var2, 32768, -183472729);
					this.ay(var1 - 1, var2 - 1, 2048, -502062316);
				}
			}

			if (2 == var3) {
				if (var4 == 0) {
					this.ay(var1, var2, 66560, -1263951427);
					this.ay(var1 - 1, var2, 4096, -1753270997);
					this.ay(var1, 1 + var2, 16384, 869166961);
				}

				if (var4 == 1) {
					this.ay(var1, var2, 5120, -1324661066);
					this.ay(var1, 1 + var2, 16384, -1329795620);
					this.ay(1 + var1, var2, 65536, 280963973);
				}

				if (var4 == 2) {
					this.ay(var1, var2, 20480, -1547867678);
					this.ay(1 + var1, var2, 65536, 399197826);
					this.ay(var1, var2 - 1, 1024, -1346227240);
				}

				if (var4 == 3) {
					this.ay(var1, var2, 81920, -513628394);
					this.ay(var1, var2 - 1, 1024, 623469465);
					this.ay(var1 - 1, var2, 4096, 1603700083);
				}
			}
		}
	}

	@ObfuscatedName("rz")
	@ObfuscatedSignature(
		descriptor = "(Lgn;IIIIIZ)V"
	)
	public static void rz(gn var0, int var1, int var2, int var3, int var4, int var5, boolean var6) {
		if (var0 == null) {
			var0.getClass();
		} else {
			int var7 = -1821350640;
			if (var6) {
				var7 += -1871722090;
			}

			var1 -= var0.by_fld;
			var2 -= var0.bl_fld;
			if (var5 == 1 || var5 == 3) {
				int var8 = var3;
				var3 = var4;
				var4 = var8;
			}

			for (int var12 = var1; var12 < var3 + var1; var12++) {
				if (var12 >= 0 && var12 < var0.bx_fld) {
					for (int var9 = var2; var9 < var4 + var2; var9++) {
						if (var9 >= 0 && var9 < var0.bo_fld) {
							var0.ay(var12, var9, var7, 3775038);
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("lb")
	@ObfuscatedSignature(
		descriptor = "(Lgn;III)Z"
	)
	public static boolean lb(gn var0, int var1, int var2, int var3) {
		if (var0 == null) {
			var0.getClass();
		}

		return (var0.bp_fld[var1][var2] & var3) != 0;
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(IIIIZ)V"
	)
	public void ba(int var1, int var2, int var3, int var4, boolean var5) {
		var1 -= this.by_fld;
		var2 -= this.bl_fld;
		if (0 == var3) {
			if (0 == var4) {
				this.ay(var1, var2, 128, 1613751617);
				this.ay(var1 - 1, var2, 8, -510403532);
			}

			if (1 == var4) {
				this.ay(var1, var2, 2, -325477968);
				this.ay(var1, 1 + var2, -1204624779, 232083461);
			}

			if (2 == var4) {
				this.ay(var1, var2, 8, -939116166);
				this.ay(var1 + 1, var2, -1122200843, 1340364808);
			}

			if (3 == var4) {
				this.ay(var1, var2, 32, 888082691);
				this.ay(var1, var2 - 1, 2, -1041053665);
			}
		}

		if (var3 == 1 || var3 == 3) {
			if (0 == var4) {
				this.ay(var1, var2, 1, 621602451);
				this.ay(var1 - 1, var2 + 1, 16, 736282102);
			}

			if (var4 == 1) {
				this.ay(var1, var2, 4, -376402072);
				this.ay(1 + var1, 1 + var2, 64, 352808418);
			}

			if (var4 == 2) {
				this.ay(var1, var2, 16, -652735662);
				this.ay(var1 + 1, var2 - 1, 1, -1156445319);
			}

			if (var4 == 3) {
				this.ay(var1, var2, -110763598, -319593203);
				this.ay(var1 - 1, var2 - 1, 4, 268236616);
			}
		}

		if (var3 == 2) {
			if (0 == var4) {
				this.ay(var1, var2, 130, 411134186);
				this.ay(var1 - 1, var2, 8, -1744013519);
				this.ay(var1, 1 + var2, -1985559644, 1399110196);
			}

			if (1 == var4) {
				this.ay(var1, var2, 10, -519141306);
				this.ay(var1, 1 + var2, -842654410, 1175775116);
				this.ay(1 + var1, var2, 128, 938859619);
			}

			if (2 == var4) {
				this.ay(var1, var2, 1407967038, 1094841823);
				this.ay(var1 + 1, var2, 128, -26211918);
				this.ay(var1, var2 - 1, 2, -1964903510);
			}

			if (var4 == 3) {
				this.ay(var1, var2, 285667628, 1539180783);
				this.ay(var1, var2 - 1, 2, -515994342);
				this.ay(var1 - 1, var2, 8, -1259534866);
			}
		}

		if (var5) {
			if (var3 == 0) {
				if (0 == var4) {
					this.ay(var1, var2, 65536, -346833576);
					this.ay(var1 - 1, var2, 4096, 1406530818);
				}

				if (var4 == 1) {
					this.ay(var1, var2, -733783605, -1817303814);
					this.ay(var1, var2 + 1, 491138122, -1235253412);
				}

				if (2 == var4) {
					this.ay(var1, var2, 4096, 422008820);
					this.ay(1 + var1, var2, 65536, 812807317);
				}

				if (3 == var4) {
					this.ay(var1, var2, -2009712116, 1169839218);
					this.ay(var1, var2 - 1, 1442800711, 687265948);
				}
			}

			if (1 == var3 || var3 == 3) {
				if (0 == var4) {
					this.ay(var1, var2, 2095626686, 1409749471);
					this.ay(var1 - 1, 1 + var2, -805535180, -183294283);
				}

				if (1 == var4) {
					this.ay(var1, var2, 2048, 361493912);
					this.ay(var1 + 1, 1 + var2, -1051741565, -1898789910);
				}

				if (2 == var4) {
					this.ay(var1, var2, -544718447, 791231009);
					this.ay(var1 + 1, var2 - 1, -177068223, -285854610);
				}

				if (3 == var4) {
					this.ay(var1, var2, 32768, 1311795986);
					this.ay(var1 - 1, var2 - 1, 1667030556, -211693967);
				}
			}

			if (2 == var3) {
				if (var4 == 0) {
					this.ay(var1, var2, 66560, 1682608153);
					this.ay(var1 - 1, var2, 1025683819, -1585569381);
					this.ay(var1, 1 + var2, -1459598024, -1120611663);
				}

				if (var4 == 1) {
					this.ay(var1, var2, 5120, 814179779);
					this.ay(var1, 1 + var2, 16384, -2111946768);
					this.ay(1 + var1, var2, -2070733465, -1140915379);
				}

				if (var4 == 2) {
					this.ay(var1, var2, -829071092, -1517591654);
					this.ay(1 + var1, var2, -1243184484, 1605455661);
					this.ay(var1, var2 - 1, 143959793, 951678237);
				}

				if (var4 == 3) {
					this.ay(var1, var2, 81920, -1154269285);
					this.ay(var1, var2 - 1, 1024, 1581721115);
					this.ay(var1 - 1, var2, -476315876, 1180362910);
				}
			}
		}
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(IIIIZ)V"
	)
	public void bq(int var1, int var2, int var3, int var4, boolean var5) {
		var1 -= this.by_fld;
		var2 -= this.bl_fld;
		if (0 == var3) {
			if (0 == var4) {
				this.ay(var1, var2, 1014219512, -648648294);
				this.ay(var1 - 1, var2, 8, 1272507541);
			}

			if (1 == var4) {
				this.ay(var1, var2, 2, -2039749199);
				this.ay(var1, 1 + var2, 32, 230015360);
			}

			if (2 == var4) {
				this.ay(var1, var2, 8, -954779779);
				this.ay(var1 + 1, var2, 1824694387, 316613681);
			}

			if (3 == var4) {
				this.ay(var1, var2, 1844995654, 1396698922);
				this.ay(var1, var2 - 1, 2, -703816698);
			}
		}

		if (var3 == 1 || var3 == 3) {
			if (0 == var4) {
				this.ay(var1, var2, 1, -1929378107);
				this.ay(var1 - 1, var2 + 1, 16, -934998965);
			}

			if (var4 == 1) {
				this.ay(var1, var2, 4, -1584673292);
				this.ay(1 + var1, 1 + var2, 303292163, -266851610);
			}

			if (var4 == 2) {
				this.ay(var1, var2, 16, -1250544348);
				this.ay(var1 + 1, var2 - 1, 1, -2133985249);
			}

			if (var4 == 3) {
				this.ay(var1, var2, 64, 84315536);
				this.ay(var1 - 1, var2 - 1, 4, -2077644804);
			}
		}

		if (var3 == 2) {
			if (0 == var4) {
				this.ay(var1, var2, 130, 626279694);
				this.ay(var1 - 1, var2, 8, -1260479259);
				this.ay(var1, 1 + var2, 32, -1065200226);
			}

			if (1 == var4) {
				this.ay(var1, var2, 10, -523005292);
				this.ay(var1, 1 + var2, -415002680, 1472285977);
				this.ay(1 + var1, var2, 1591357664, -190189205);
			}

			if (2 == var4) {
				this.ay(var1, var2, 40, 180048665);
				this.ay(var1 + 1, var2, 128, -841865367);
				this.ay(var1, var2 - 1, 2, 1581509448);
			}

			if (var4 == 3) {
				this.ay(var1, var2, -842728636, -121165496);
				this.ay(var1, var2 - 1, 2, -1976785817);
				this.ay(var1 - 1, var2, 8, -57626718);
			}
		}

		if (var5) {
			if (var3 == 0) {
				if (0 == var4) {
					this.ay(var1, var2, 2057855095, -2112871285);
					this.ay(var1 - 1, var2, 1315475309, -1002304585);
				}

				if (var4 == 1) {
					this.ay(var1, var2, 1024, -648743553);
					this.ay(var1, var2 + 1, -872441395, -131168313);
				}

				if (2 == var4) {
					this.ay(var1, var2, 4096, 184790158);
					this.ay(1 + var1, var2, 65536, -1818553356);
				}

				if (3 == var4) {
					this.ay(var1, var2, 426362901, -125550335);
					this.ay(var1, var2 - 1, 1024, 1313649329);
				}
			}

			if (1 == var3 || var3 == 3) {
				if (0 == var4) {
					this.ay(var1, var2, 34095280, 146007299);
					this.ay(var1 - 1, 1 + var2, 2034394490, 385079892);
				}

				if (1 == var4) {
					this.ay(var1, var2, 2048, -932500141);
					this.ay(var1 + 1, 1 + var2, -1810858380, 1285117552);
				}

				if (2 == var4) {
					this.ay(var1, var2, 8192, -2115228700);
					this.ay(var1 + 1, var2 - 1, 512, -601626196);
				}

				if (3 == var4) {
					this.ay(var1, var2, 32768, 1490139061);
					this.ay(var1 - 1, var2 - 1, -1126271515, -919048155);
				}
			}

			if (2 == var3) {
				if (var4 == 0) {
					this.ay(var1, var2, -991735392, 212407471);
					this.ay(var1 - 1, var2, 4096, -1190413642);
					this.ay(var1, 1 + var2, 16384, 1644664504);
				}

				if (var4 == 1) {
					this.ay(var1, var2, -2130988254, -1292191389);
					this.ay(var1, 1 + var2, 863268100, 1415085334);
					this.ay(1 + var1, var2, 65536, 644117255);
				}

				if (var4 == 2) {
					this.ay(var1, var2, -1069886338, 1169364177);
					this.ay(1 + var1, var2, 65536, 1296038944);
					this.ay(var1, var2 - 1, -1323088858, -127265618);
				}

				if (var4 == 3) {
					this.ay(var1, var2, 81920, -228615772);
					this.ay(var1, var2 - 1, -1320047552, -2138803046);
					this.ay(var1 - 1, var2, 4096, -273438229);
				}
			}
		}
	}

	@ObfuscatedName("kw")
	@ObfuscatedSignature(
		descriptor = "(Lgn;IIIIZI)V"
	)
	public static void kw(gn var0, int var1, int var2, int var3, int var4, boolean var5, int var6) {
		if (var0 == null) {
			var0.getClass();
		}

		var1 -= var0.by_fld;
		var2 -= var0.bl_fld;
		if (0 == var3) {
			if (0 == var4) {
				var0.ay(var1, var2, 128, 1285940219);
				var0.ay(var1 - 1, var2, 8, 326905973);
			}

			if (1 == var4) {
				var0.ay(var1, var2, 2, -1642040783);
				var0.ay(var1, 1 + var2, 32, 1449681576);
			}

			if (2 == var4) {
				var0.ay(var1, var2, 8, 1138436042);
				var0.ay(var1 + 1, var2, 128, 51912361);
			}

			if (3 == var4) {
				var0.ay(var1, var2, 32, 233396464);
				var0.ay(var1, var2 - 1, 2, -1594420722);
			}
		}

		if (var3 == 1 || var3 == 3) {
			if (0 == var4) {
				if (var6 >= 364365270) {
					return;
				}

				var0.ay(var1, var2, 1, -1172746212);
				var0.ay(var1 - 1, var2 + 1, 16, 1130388158);
			}

			if (var4 == 1) {
				var0.ay(var1, var2, 4, 1488520783);
				var0.ay(1 + var1, 1 + var2, 64, -635496155);
			}

			if (var4 == 2) {
				var0.ay(var1, var2, 16, 1266724346);
				var0.ay(var1 + 1, var2 - 1, 1, 534953417);
			}

			if (var4 == 3) {
				if (var6 >= 364365270) {
					return;
				}

				var0.ay(var1, var2, 64, 1085364613);
				var0.ay(var1 - 1, var2 - 1, 4, -254013347);
			}
		}

		if (var3 == 2) {
			if (0 == var4) {
				var0.ay(var1, var2, 130, 1524603220);
				var0.ay(var1 - 1, var2, 8, 132569479);
				var0.ay(var1, 1 + var2, 32, -801113446);
			}

			if (1 == var4) {
				var0.ay(var1, var2, 10, 615884150);
				var0.ay(var1, 1 + var2, 32, 453632630);
				var0.ay(1 + var1, var2, 128, -1117046836);
			}

			if (2 == var4) {
				var0.ay(var1, var2, 40, -1882658884);
				var0.ay(var1 + 1, var2, 128, 636624844);
				var0.ay(var1, var2 - 1, 2, -1738567336);
			}

			if (var4 == 3) {
				var0.ay(var1, var2, 160, 1210932148);
				var0.ay(var1, var2 - 1, 2, -1399547333);
				var0.ay(var1 - 1, var2, 8, 62507996);
			}
		}

		if (var5) {
			if (var3 == 0) {
				if (0 == var4) {
					var0.ay(var1, var2, 65536, 554636732);
					var0.ay(var1 - 1, var2, 4096, 1056469517);
				}

				if (var4 == 1) {
					if (var6 >= 364365270) {
						return;
					}

					var0.ay(var1, var2, 1024, 438556460);
					var0.ay(var1, var2 + 1, 16384, -730552131);
				}

				if (2 == var4) {
					if (var6 >= 364365270) {
						return;
					}

					var0.ay(var1, var2, 4096, 1407372402);
					var0.ay(1 + var1, var2, 65536, -11389497);
				}

				if (3 == var4) {
					var0.ay(var1, var2, 16384, -959794797);
					var0.ay(var1, var2 - 1, 1024, 965036312);
				}
			}

			label220: {
				if (1 != var3) {
					if (var3 != 3) {
						break label220;
					}

					if (var6 >= 364365270) {
						return;
					}
				}

				if (0 == var4) {
					var0.ay(var1, var2, 512, 1702944199);
					var0.ay(var1 - 1, 1 + var2, 8192, -571807773);
				}

				if (1 == var4) {
					var0.ay(var1, var2, 2048, 625634610);
					var0.ay(var1 + 1, 1 + var2, 32768, -393167237);
				}

				if (2 == var4) {
					var0.ay(var1, var2, 8192, -1497892277);
					var0.ay(var1 + 1, var2 - 1, 512, -1613073502);
				}

				if (3 == var4) {
					var0.ay(var1, var2, 32768, -2108828420);
					var0.ay(var1 - 1, var2 - 1, 2048, -494844108);
				}
			}

			if (2 == var3) {
				if (var4 == 0) {
					var0.ay(var1, var2, 66560, -1520942999);
					var0.ay(var1 - 1, var2, 4096, -701584580);
					var0.ay(var1, 1 + var2, 16384, 1258822381);
				}

				if (var4 == 1) {
					var0.ay(var1, var2, 5120, 87973079);
					var0.ay(var1, 1 + var2, 16384, -202571614);
					var0.ay(1 + var1, var2, 65536, -312941205);
				}

				if (var4 == 2) {
					var0.ay(var1, var2, 20480, -1306966262);
					var0.ay(1 + var1, var2, 65536, -667274716);
					var0.ay(var1, var2 - 1, 1024, -1492816615);
				}

				if (var4 == 3) {
					var0.ay(var1, var2, 81920, 335794432);
					var0.ay(var1, var2 - 1, 1024, 577359766);
					var0.ay(var1 - 1, var2, 4096, -1455702870);
				}
			}
		}
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(IIIIZ)V"
	)
	public void cc(int var1, int var2, int var3, int var4, boolean var5) {
		this.ax(var1, var2, var3, var4, 0, var5, -1495315378);
	}

	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		descriptor = "(Lgn;)V"
	)
	public static void ht(gn var0) {
		if (var0 == null) {
			var0.getClass();
		}

		for (int var1 = 0; var1 < var0.bx_fld; var1++) {
			for (int var2 = 0; var2 < var0.bo_fld; var2++) {
				if (var1 >= 1 && var2 >= 1 && var1 < var0.bx_fld - 5 && var2 < var0.bo_fld - 5) {
					var0.bp_fld[var1][var2] = 1073741824;
				} else {
					var0.bp_fld[var1][var2] = 16777215;
				}
			}
		}
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(IIIIIZ)V"
	)
	void bg(int var1, int var2, int var3, int var4, int var5, boolean var6) {
		int var7 = 256;
		if (var6) {
			var7 += -229030424;
		}

		var1 -= this.by_fld;
		var2 -= this.bl_fld;
		if (var5 == 1 || var5 == 3) {
			int var8 = var3;
			var3 = var4;
			var4 = var8;
		}

		for (int var12 = var1; var12 < var3 + var1; var12++) {
			if (var12 >= 0 && var12 < this.bx_fld) {
				for (int var9 = var2; var9 < var4 + var2; var9++) {
					if (var9 >= 0 && var9 < this.bo_fld) {
						this.ay(var12, var9, var7, 1316913360);
					}
				}
			}
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	void as(int var1, int var2, int var3, int var4) {
		this.bp_fld[var1][var2] = this.bp_fld[var1][var2] & ~var3;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	final void bz(int var1, int var2, int var3, int var4) {
		this.by_fld = var1 * -2062333572;
		this.bl_fld = 82984005 * var2;
		this.bx_fld = var3 * -575838515;
		this.bo_fld = var4;
	}

	@ObfuscatedName("vi")
	@ObfuscatedSignature(
		descriptor = "(Lgn;III)V"
	)
	public static void vi(gn var0, int var1, int var2, int var3) {
		var0.bp_fld[var1][var2] = var0.bp_fld[var1][var2] & ~var3;
	}

	@ObfuscatedName("getFlags")
	@ObfuscatedSignature(
		descriptor = "()[[I"
	)
	@Override
	public int[][] getFlags() {
		return this.bp_fld;
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(IIIIZ)V"
	)
	public void cv(int var1, int var2, int var3, int var4, boolean var5) {
		this.ax(var1, var2, var3, var4, 0, var5, -1942928115);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	void ay(int var1, int var2, int var3, int var4) {
		this.bp_fld[var1][var2] = this.bp_fld[var1][var2] | var3;
	}

	@ObfuscatedName("zw")
	@ObfuscatedSignature(
		descriptor = "(Lgn;II)V"
	)
	public static void zw(gn var0, int var1, int var2) {
		var1 -= var0.by_fld;
		var2 -= var0.bl_fld;
		var0.bp_fld[var1][var2] = var0.bp_fld[var1][var2] | 2097152;
	}

	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		descriptor = "(Lgn;IIII)V"
	)
	public static void hj(gn var0, int var1, int var2, int var3, int var4) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.by_fld = var1;
		var0.bl_fld = -138687474 * var2;
		var0.bx_fld = var3;
		var0.bo_fld = var4 * 825992848;
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(IIIIZ)V"
	)
	public void ce(int var1, int var2, int var3, int var4, boolean var5) {
		var1 -= this.by_fld;
		var2 -= this.bl_fld;
		if (0 == var3) {
			if (var4 == 0) {
				this.as(var1, var2, 128, 1178493659);
				this.as(var1 - 1, var2, 8, 1178493659);
			}

			if (var4 == 1) {
				this.as(var1, var2, 2, 1178493659);
				this.as(var1, var2 + 1, 32, 1178493659);
			}

			if (2 == var4) {
				this.as(var1, var2, 8, 1178493659);
				this.as(var1 + 1, var2, 128, 1178493659);
			}

			if (3 == var4) {
				this.as(var1, var2, 32, 1178493659);
				this.as(var1, var2 - 1, 2, 1178493659);
			}
		}

		if (1 == var3 || 3 == var3) {
			if (var4 == 0) {
				this.as(var1, var2, 1, 1178493659);
				this.as(var1 - 1, var2 + 1, 16, 1178493659);
			}

			if (1 == var4) {
				this.as(var1, var2, 4, 1178493659);
				this.as(1 + var1, var2 + 1, 64, 1178493659);
			}

			if (2 == var4) {
				this.as(var1, var2, 16, 1178493659);
				this.as(1 + var1, var2 - 1, 1, 1178493659);
			}

			if (var4 == 3) {
				this.as(var1, var2, 64, 1178493659);
				this.as(var1 - 1, var2 - 1, 4, 1178493659);
			}
		}

		if (var3 == 2) {
			if (0 == var4) {
				this.as(var1, var2, 130, 1178493659);
				this.as(var1 - 1, var2, 8, 1178493659);
				this.as(var1, 1 + var2, 32, 1178493659);
			}

			if (1 == var4) {
				this.as(var1, var2, 10, 1178493659);
				this.as(var1, 1 + var2, 32, 1178493659);
				this.as(var1 + 1, var2, 128, 1178493659);
			}

			if (var4 == 2) {
				this.as(var1, var2, 40, 1178493659);
				this.as(1 + var1, var2, 128, 1178493659);
				this.as(var1, var2 - 1, 2, 1178493659);
			}

			if (3 == var4) {
				this.as(var1, var2, 160, 1178493659);
				this.as(var1, var2 - 1, 2, 1178493659);
				this.as(var1 - 1, var2, 8, 1178493659);
			}
		}

		if (var5) {
			if (0 == var3) {
				if (var4 == 0) {
					this.as(var1, var2, 65536, 1178493659);
					this.as(var1 - 1, var2, 4096, 1178493659);
				}

				if (1 == var4) {
					this.as(var1, var2, 1024, 1178493659);
					this.as(var1, 1 + var2, 16384, 1178493659);
				}

				if (2 == var4) {
					this.as(var1, var2, 4096, 1178493659);
					this.as(var1 + 1, var2, 65536, 1178493659);
				}

				if (var4 == 3) {
					this.as(var1, var2, 16384, 1178493659);
					this.as(var1, var2 - 1, 1024, 1178493659);
				}
			}

			if (1 == var3 || 3 == var3) {
				if (var4 == 0) {
					this.as(var1, var2, 512, 1178493659);
					this.as(var1 - 1, var2 + 1, 8192, 1178493659);
				}

				if (var4 == 1) {
					this.as(var1, var2, 2048, 1178493659);
					this.as(var1 + 1, 1 + var2, 32768, 1178493659);
				}

				if (2 == var4) {
					this.as(var1, var2, 8192, 1178493659);
					this.as(var1 + 1, var2 - 1, 512, 1178493659);
				}

				if (3 == var4) {
					this.as(var1, var2, 32768, 1178493659);
					this.as(var1 - 1, var2 - 1, 2048, 1178493659);
				}
			}

			if (2 == var3) {
				if (var4 == 0) {
					this.as(var1, var2, 66560, 1178493659);
					this.as(var1 - 1, var2, 4096, 1178493659);
					this.as(var1, var2 + 1, 16384, 1178493659);
				}

				if (1 == var4) {
					this.as(var1, var2, 5120, 1178493659);
					this.as(var1, 1 + var2, 16384, 1178493659);
					this.as(1 + var1, var2, 65536, 1178493659);
				}

				if (var4 == 2) {
					this.as(var1, var2, 20480, 1178493659);
					this.as(var1 + 1, var2, 65536, 1178493659);
					this.as(var1, var2 - 1, 1024, 1178493659);
				}

				if (var4 == 3) {
					this.as(var1, var2, 81920, 1178493659);
					this.as(var1, var2 - 1, 1024, 1178493659);
					this.as(var1 - 1, var2, 4096, 1178493659);
				}
			}
		}
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(IIIIIZ)V"
	)
	void bb(int var1, int var2, int var3, int var4, int var5, boolean var6) {
		int var7 = 256;
		if (var6) {
			var7 += 1127528298;
		}

		var1 -= this.by_fld;
		var2 -= this.bl_fld;
		if (var5 == 1 || var5 == 3) {
			int var8 = var3;
			var3 = var4;
			var4 = var8;
		}

		for (int var12 = var1; var12 < var3 + var1; var12++) {
			if (var12 >= 0 && var12 < this.bx_fld) {
				for (int var9 = var2; var9 < var4 + var2; var9++) {
					if (var9 >= 0 && var9 < this.bo_fld) {
						this.ay(var12, var9, var7, -1040498452);
					}
				}
			}
		}
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(IIIIIZ)V"
	)
	public void ca(int var1, int var2, int var3, int var4, int var5, boolean var6) {
		int var7 = 256;
		if (var6) {
			var7 += 131072;
		}

		var1 -= this.by_fld;
		var2 -= this.bl_fld;
		if (1 == var5 || 3 == var5) {
			int var8 = var3;
			var3 = var4;
			var4 = var8;
		}

		for (int var12 = var1; var12 < var3 + var1; var12++) {
			if (var12 >= 0 && var12 < this.bx_fld) {
				for (int var9 = var2; var9 < var4 + var2; var9++) {
					if (var9 >= 0 && var9 < this.bo_fld) {
						this.as(var12, var9, var7, 1178493659);
					}
				}
			}
		}
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(IIIIIZ)V"
	)
	public void cg(int var1, int var2, int var3, int var4, int var5, boolean var6) {
		int var7 = 256;
		if (var6) {
			var7 += 131072;
		}

		var1 -= this.by_fld;
		var2 -= this.bl_fld;
		if (1 == var5 || 3 == var5) {
			int var8 = var3;
			var3 = var4;
			var4 = var8;
		}

		for (int var12 = var1; var12 < var3 + var1; var12++) {
			if (var12 >= 0 && var12 < this.bx_fld) {
				for (int var9 = var2; var9 < var4 + var2; var9++) {
					if (var9 >= 0 && var9 < this.bo_fld) {
						this.as(var12, var9, var7, 1178493659);
					}
				}
			}
		}
	}

	@ObfuscatedName("lh")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void lh(int var1, int var2) {
		var1 -= this.by_fld;
		var2 -= this.bl_fld;
		this.bp_fld[var1][var2] = this.bp_fld[var1][var2] & -262145;
	}

	@ObfuscatedName("fr")
	@ObfuscatedSignature(
		descriptor = "(Lgn;IIII)V"
	)
	public static void fr(gn var0, int var1, int var2, int var3, int var4) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.by_fld = var1;
			var0.bl_fld = 1632197491 * var2;
			var0.bx_fld = var3;
			var0.bo_fld = var4;
		}
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void cw(int var1, int var2) {
		var1 -= this.by_fld;
		var2 -= this.bl_fld;
		this.bp_fld[var1][var2] = this.bp_fld[var1][var2] & -262145;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z"
	)
	boolean aw(int var1, int var2, int var3, int var4) {
		return (this.bp_fld[var1][var2] & var3) != 0;
	}

	@ObfuscatedName("si")
	@ObfuscatedSignature(
		descriptor = "(Lgn;II)V"
	)
	public static void si(gn var0, int var1, int var2) {
		var1 -= var0.by_fld;
		var2 -= var0.bl_fld;
		var0.bp_fld[var1][var2] = var0.bp_fld[var1][var2] | -503592722;
	}

	@ObfuscatedName("nd")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void nd(int var1, int var2, int var3) {
		this.ar(var1, var2, var3, 1115189408);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIIIZI)V"
	)
	public void au(int var1, int var2, int var3, int var4, boolean var5, int var6) {
		var1 -= this.by_fld;
		var2 -= this.bl_fld;
		if (0 == var3) {
			if (0 == var4) {
				this.ay(var1, var2, 128, 1285940219);
				this.as(var1 - 1, var2, 8, 326905973);
			}

			if (1 == var4) {
				this.ay(var1, var2, 2, -1642040783);
				this.as(var1, 1 + var2, 32, 1449681576);
			}

			if (2 == var4) {
				this.as(var1, var2, 8, 1138436042);
				this.ay(var1 + 1, var2, 128, 51912361);
			}

			if (3 == var4) {
				this.as(var1, var2, 32, 233396464);
				this.ay(var1, var2 - 1, 2, -1594420722);
			}
		}

		if (var3 == 1 || var3 == 3) {
			if (0 == var4) {
				if (var6 >= 364365270) {
					return;
				}

				this.ay(var1, var2, 1, -1172746212);
				this.as(var1 - 1, var2 + 1, 16, 1130388158);
			}

			if (var4 == 1) {
				this.ay(var1, var2, 4, 1488520783);
				this.as(1 + var1, 1 + var2, 64, -635496155);
			}

			if (var4 == 2) {
				this.ay(var1, var2, 16, 1266724346);
				this.as(var1 + 1, var2 - 1, 1, 534953417);
			}

			if (var4 == 3) {
				if (var6 >= 364365270) {
					return;
				}

				this.as(var1, var2, 64, 1085364613);
				this.as(var1 - 1, var2 - 1, 4, -254013347);
			}
		}

		if (var3 == 2) {
			if (0 == var4) {
				this.as(var1, var2, 130, 1524603220);
				this.ay(var1 - 1, var2, 8, 132569479);
				this.as(var1, 1 + var2, 32, -801113446);
			}

			if (1 == var4) {
				this.ay(var1, var2, 10, 615884150);
				this.ay(var1, 1 + var2, 32, 453632630);
				this.as(1 + var1, var2, 128, -1117046836);
			}

			if (2 == var4) {
				this.as(var1, var2, 40, -1882658884);
				this.ay(var1 + 1, var2, 128, 636624844);
				this.as(var1, var2 - 1, 2, -1738567336);
			}

			if (var4 == 3) {
				this.as(var1, var2, 160, 1210932148);
				this.as(var1, var2 - 1, 2, -1399547333);
				this.as(var1 - 1, var2, 8, 62507996);
			}
		}

		if (var5) {
			if (var3 == 0) {
				if (0 == var4) {
					this.as(var1, var2, 65536, 554636732);
					this.ay(var1 - 1, var2, 4096, 1056469517);
				}

				if (var4 == 1) {
					if (var6 >= 364365270) {
						return;
					}

					this.as(var1, var2, 1024, 438556460);
					this.ay(var1, var2 + 1, 16384, -730552131);
				}

				if (2 == var4) {
					if (var6 >= 364365270) {
						return;
					}

					this.as(var1, var2, 4096, 1407372402);
					this.ay(1 + var1, var2, 65536, -11389497);
				}

				if (3 == var4) {
					this.as(var1, var2, 16384, -959794797);
					this.ay(var1, var2 - 1, 1024, 965036312);
				}
			}

			label216: {
				if (1 != var3) {
					if (var3 != 3) {
						break label216;
					}

					if (var6 >= 364365270) {
						return;
					}
				}

				if (0 == var4) {
					this.as(var1, var2, 512, 1702944199);
					this.ay(var1 - 1, 1 + var2, 8192, -571807773);
				}

				if (1 == var4) {
					this.as(var1, var2, 2048, 625634610);
					this.as(var1 + 1, 1 + var2, 32768, -393167237);
				}

				if (2 == var4) {
					this.as(var1, var2, 8192, -1497892277);
					this.as(var1 + 1, var2 - 1, 512, -1613073502);
				}

				if (3 == var4) {
					this.as(var1, var2, 32768, -2108828420);
					this.ay(var1 - 1, var2 - 1, 2048, -494844108);
				}
			}

			if (2 == var3) {
				if (var4 == 0) {
					this.ay(var1, var2, 66560, -1520942999);
					this.ay(var1 - 1, var2, 4096, -701584580);
					this.as(var1, 1 + var2, 16384, 1258822381);
				}

				if (var4 == 1) {
					this.ay(var1, var2, 5120, 87973079);
					this.ay(var1, 1 + var2, 16384, -202571614);
					this.ay(1 + var1, var2, 65536, -312941205);
				}

				if (var4 == 2) {
					this.as(var1, var2, 20480, -1306966262);
					this.ay(1 + var1, var2, 65536, -667274716);
					this.ay(var1, var2 - 1, 1024, -1492816615);
				}

				if (var4 == 3) {
					this.ay(var1, var2, 81920, 335794432);
					this.ay(var1, var2 - 1, 1024, 577359766);
					this.ay(var1 - 1, var2, 4096, -1455702870);
				}
			}
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIIIIZI)V"
	)
	public void am(int var1, int var2, int var3, int var4, int var5, boolean var6, int var7) {
		int var8 = 256;
		if (var6) {
			var8 += 131072;
		}

		label68: {
			var1 -= this.bx_fld;
			var2 -= this.bx_fld;
			if (var5 != 1) {
				if (var7 <= -2115221177) {
					return;
				}

				if (var5 != 3) {
					break label68;
				}
			}

			int var9 = var3;
			var3 = var4;
			var4 = var9;
		}

		for (int var13 = var1; var13 < var3 + var1; var13++) {
			if (var7 <= -2115221177) {
				return;
			}

			if (var13 >= 0) {
				if (var7 <= -2115221177) {
					return;
				}

				if (var13 < this.bx_fld) {
					for (int var10 = var2; var10 < var4 + var2; var10++) {
						if (var10 >= 0 && var10 < this.bx_fld) {
							this.ay(var13, var10, var8, 106886831);
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIS)Z"
	)
	boolean al(int var1, int var2, short var3) {
		return var1 >= 1 && var1 < this.bo_fld - 5 && var2 >= 1 && var2 < this.bl_fld - 5;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void ad(int var1, int var2, int var3) {
		this.bp_fld[var1][var2] = this.bp_fld[var1][var2] | var3;
	}
}
