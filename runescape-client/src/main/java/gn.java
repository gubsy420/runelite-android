import net.runelite.api.CollisionData;
import net.runelite.api.annotations.Export;
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
	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1727918519
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
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 327473271
	)
	int by_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ah_fld;
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -15970007
	)
	int bl_fld;
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1193526369
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
							to(this, var13, var10, var8);
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

	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "(Lfz;I)I"
	)
	public static int dx(fz var0, int var1) {
		return var0.av_fld[var1];
	}

	@ObfuscatedName("vg")
	@ObfuscatedSignature(
		descriptor = "(Lgn;II)V"
	)
	public static void vg(gn var0, int var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var1 -= var0.by_fld;
			var2 -= var0.bl_fld;
			var0.bp_fld[var1][var2] = var0.bp_fld[var1][var2] | 2097152;
		}
	}

	@ObfuscatedName("to")
	@ObfuscatedSignature(
		descriptor = "(Lgn;IIII)V"
	)
	public static void to(gn var0, int var1, int var2, int var3) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.bp_fld[var1][var2] = var0.bp_fld[var1][var2] | var3;
	}

	@ObfuscatedName("vi")
	@ObfuscatedSignature(
		descriptor = "(Lgn;IIS)V"
	)
	public static void vi(gn var0, int var1, int var2, short var3) {
		if (var0 == null) {
			var0.getClass();
		}

		var1 -= var0.by_fld;
		var2 -= var0.bl_fld;
		var0.bp_fld[var1][var2] = var0.bp_fld[var1][var2] | 262144;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int az(int var1) {
		return this.bx_fld;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	public int av(byte var1) {
		return this.bo_fld;
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

	@ObfuscatedName("eb")
	@ObfuscatedSignature(
		descriptor = "(Lgn;IIIIIZ)V"
	)
	public static void eb(gn var0, int var1, int var2, int var3, int var4, int var5, boolean var6) {
		if (var0 == null) {
			var0.getClass();
		} else {
			int var7 = 256;
			if (var6) {
				var7 += 131072;
			}

			var1 -= var0.by_fld;
			var2 -= var0.bl_fld;
			if (1 == var5 || 3 == var5) {
				int var8 = var3;
				var3 = var4;
				var4 = var8;
			}

			for (int var12 = var1; var12 < var3 + var1; var12++) {
				if (var12 >= 0 && var12 < var0.bx_fld) {
					for (int var9 = var2; var9 < var4 + var2; var9++) {
						if (var9 >= 0 && var9 < var0.bo_fld) {
							var0.as(var12, var9, var7, 1178493659);
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z"
	)
	boolean aw(int var1, int var2, int var3, int var4) {
		return (this.bp_fld[var1][var2] & var3) != 0;
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

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	final void br(int var1, int var2, int var3, int var4) {
		this.by_fld = var1;
		this.bl_fld = 1632197491 * var2;
		this.bx_fld = var3;
		this.bo_fld = var4;
	}

	@ObfuscatedName("ia")
	@ObfuscatedSignature(
		descriptor = "(Lgn;III)V"
	)
	public static void ia(gn var0, int var1, int var2, int var3) {
		var0.bp_fld[var1][var2] = var0.bp_fld[var1][var2] & ~var3;
	}

	@ObfuscatedName("wt")
	@ObfuscatedSignature(
		descriptor = "(Lgn;IIIIZI)V"
	)
	public static void wt(gn var0, int var1, int var2, int var3, int var4, boolean var5, int var6) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var1 -= var0.by_fld;
			var2 -= var0.bl_fld;
			if (0 == var3) {
				if (0 == var4) {
					to(var0, var1, var2, 128);
					to(var0, var1 - 1, var2, 8);
				}

				if (1 == var4) {
					to(var0, var1, var2, 2);
					to(var0, var1, 1 + var2, 32);
				}

				if (2 == var4) {
					to(var0, var1, var2, 8);
					to(var0, var1 + 1, var2, 128);
				}

				if (3 == var4) {
					to(var0, var1, var2, 32);
					to(var0, var1, var2 - 1, 2);
				}
			}

			if (var3 == 1 || var3 == 3) {
				if (0 == var4) {
					if (var6 >= 364365270) {
						return;
					}

					to(var0, var1, var2, 1);
					to(var0, var1 - 1, var2 + 1, 16);
				}

				if (var4 == 1) {
					to(var0, var1, var2, 4);
					to(var0, 1 + var1, 1 + var2, 64);
				}

				if (var4 == 2) {
					to(var0, var1, var2, 16);
					to(var0, var1 + 1, var2 - 1, 1);
				}

				if (var4 == 3) {
					if (var6 >= 364365270) {
						return;
					}

					to(var0, var1, var2, 64);
					to(var0, var1 - 1, var2 - 1, 4);
				}
			}

			if (var3 == 2) {
				if (0 == var4) {
					to(var0, var1, var2, 130);
					to(var0, var1 - 1, var2, 8);
					to(var0, var1, 1 + var2, 32);
				}

				if (1 == var4) {
					to(var0, var1, var2, 10);
					to(var0, var1, 1 + var2, 32);
					to(var0, 1 + var1, var2, 128);
				}

				if (2 == var4) {
					to(var0, var1, var2, 40);
					to(var0, var1 + 1, var2, 128);
					to(var0, var1, var2 - 1, 2);
				}

				if (var4 == 3) {
					to(var0, var1, var2, 160);
					to(var0, var1, var2 - 1, 2);
					to(var0, var1 - 1, var2, 8);
				}
			}

			if (var5) {
				if (var3 == 0) {
					if (0 == var4) {
						to(var0, var1, var2, 65536);
						to(var0, var1 - 1, var2, 4096);
					}

					if (var4 == 1) {
						if (var6 >= 364365270) {
							return;
						}

						to(var0, var1, var2, 1024);
						to(var0, var1, var2 + 1, 16384);
					}

					if (2 == var4) {
						if (var6 >= 364365270) {
							return;
						}

						to(var0, var1, var2, 4096);
						to(var0, 1 + var1, var2, 65536);
					}

					if (3 == var4) {
						to(var0, var1, var2, 16384);
						to(var0, var1, var2 - 1, 1024);
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
						to(var0, var1, var2, 512);
						to(var0, var1 - 1, 1 + var2, 8192);
					}

					if (1 == var4) {
						to(var0, var1, var2, 2048);
						to(var0, var1 + 1, 1 + var2, 32768);
					}

					if (2 == var4) {
						to(var0, var1, var2, 8192);
						to(var0, var1 + 1, var2 - 1, 512);
					}

					if (3 == var4) {
						to(var0, var1, var2, 32768);
						to(var0, var1 - 1, var2 - 1, 2048);
					}
				}

				if (2 == var3) {
					if (var4 == 0) {
						to(var0, var1, var2, 66560);
						to(var0, var1 - 1, var2, 4096);
						to(var0, var1, 1 + var2, 16384);
					}

					if (var4 == 1) {
						to(var0, var1, var2, 5120);
						to(var0, var1, 1 + var2, 16384);
						to(var0, 1 + var1, var2, 65536);
					}

					if (var4 == 2) {
						to(var0, var1, var2, 20480);
						to(var0, 1 + var1, var2, 65536);
						to(var0, var1, var2 - 1, 1024);
					}

					if (var4 == 3) {
						to(var0, var1, var2, 81920);
						to(var0, var1, var2 - 1, 1024);
						to(var0, var1 - 1, var2, 4096);
					}
				}
			}
		}
	}

	@ObfuscatedName("ve")
	@ObfuscatedSignature(
		descriptor = "(Lgn;IIB)Z"
	)
	public static boolean ve(gn var0, int var1, int var2, byte var3) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.al(var1 - var0.by_fld, var2 - var0.bl_fld, (short)31691);
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

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(IIIIZ)V"
	)
	public void cy(int var1, int var2, int var3, int var4, boolean var5) {
		this.ax(var1, var2, var3, var4, 0, var5, 1067030182);
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

		var1 -= this.by_fld;
		var2 -= this.bl_fld;
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

				if (var13 < this.bx_fld) {
					for (int var10 = var2; var10 < var4 + var2; var10++) {
						if (var10 >= 0 && var10 < this.bo_fld) {
							this.as(var13, var10, var8, 1178493659);
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
		return var1 >= 1 && var1 < this.bx_fld - 5 && var2 >= 1 && var2 < this.bo_fld - 5;
	}

	@ObfuscatedName("getFlags")
	@ObfuscatedSignature(
		descriptor = "()[[I"
	)
	@Export("getFlags")
	@Override
	public int[][] getFlags() {
		return this.bp_fld;
	}

	@ObfuscatedName("tr")
	@ObfuscatedSignature(
		descriptor = "(Lgn;)I"
	)
	public static int tr(gn var0) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.by_fld;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ab() {
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

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int bm() {
		return this.bx_fld;
	}

	@ObfuscatedName("px")
	@ObfuscatedSignature(
		descriptor = "(Lgn;II)Z"
	)
	public static boolean px(gn var0, int var1, int var2) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var1 >= 1 && var1 < var0.bx_fld - 5 && var2 >= 1 && var2 < var0.bo_fld - 5;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int aj() {
		return this.bo_fld;
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

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void cx(int var1, int var2) {
		var1 -= this.by_fld;
		var2 -= this.bl_fld;
		this.bp_fld[var1][var2] = this.bp_fld[var1][var2] | -503592722;
	}

	@ObfuscatedName("mt")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void mt(int var1, int var2) {
		this.aa(var1, var2, (byte)-111);
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void bt(int var1, int var2, int var3) {
		this.as(var1 - this.by_fld, var2 - this.bl_fld, var3, 1178493659);
	}

	@ObfuscatedName("lk")
	@ObfuscatedSignature(
		descriptor = "(Lgn;III)Z"
	)
	public static boolean lk(gn var0, int var1, int var2, int var3) {
		return (var0.bp_fld[var1][var2] & var3) != 0;
	}

	@ObfuscatedName("kc")
	@ObfuscatedSignature(
		descriptor = "(Lgn;IIIIIZ)V"
	)
	public static void kc(gn var0, int var1, int var2, int var3, int var4, int var5, boolean var6) {
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
							to(var0, var12, var9, var7);
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	final void be(int var1, int var2, int var3, int var4) {
		this.by_fld = var1;
		this.bl_fld = var2;
		this.bx_fld = var3 * 146099809;
		this.bo_fld = var4 * -1891825202;
	}

	public gn(int var1, int var2, boolean var3) {
		if (var3) {
			zm(this, -1, -1, 6 + var1, var2 + 6, (byte)53);
		} else {
			zm(this, 0, 0, var1, var2, (byte)117);
		}

		this.bp_fld = new int[this.bx_fld][this.bo_fld];
		this.ah(1639049925);
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	final void bs(int var1, int var2, int var3, int var4) {
		this.by_fld = var1;
		this.bl_fld = -138687474 * var2;
		this.bx_fld = var3;
		this.bo_fld = var4 * 825992848;
	}

	@ObfuscatedName("lv")
	@ObfuscatedSignature(
		descriptor = "(IIIIZ)V"
	)
	public void lv(int var1, int var2, int var3, int var4, boolean var5) {
		this.an(var1, var2, var3, var4, var5, (byte)16);
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void bk() {
		for (int var1 = 0; var1 < this.bx_fld; var1++) {
			for (int var2 = 0; var2 < this.bo_fld; var2++) {
				if (var1 >= 1 && var2 >= 1 && var1 < this.bx_fld - 5 && var2 < this.bo_fld - 5) {
					this.bp_fld[var1][var2] = 1073741824;
				} else {
					this.bp_fld[var1][var2] = 16777215;
				}
			}
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void ad(int var1, int var2, int var3) {
		var1 -= this.by_fld;
		var2 -= this.bl_fld;
		this.bp_fld[var1][var2] = this.bp_fld[var1][var2] & -262145;
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	void bx(int var1, int var2, int var3) {
		this.bp_fld[var1][var2] = this.bp_fld[var1][var2] & ~var3;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int at() {
		return this.bl_fld;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void bh() {
		for (int var1 = 0; var1 < this.bx_fld; var1++) {
			for (int var2 = 0; var2 < this.bo_fld; var2++) {
				if (var1 >= 1 && var2 >= 1 && var1 < this.bx_fld - 5 && var2 < this.bo_fld - 5) {
					this.bp_fld[var1][var2] = 1073741824;
				} else {
					this.bp_fld[var1][var2] = -1775358218;
				}
			}
		}
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(Lgn;IIIIZ)V"
	)
	public static void cf(gn var0, int var1, int var2, int var3, int var4, boolean var5) {
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

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void bv(int var1, int var2, int var3) {
		this.as(var1 - this.by_fld, var2 - this.bl_fld, var3, 1178493659);
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	public boolean bi(int var1, int var2) {
		return this.al(var1 - this.by_fld, var2 - this.bl_fld, (short)24586);
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	boolean bu(int var1, int var2) {
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
				to(this, var1, var2, 128);
				to(this, var1 - 1, var2, 8);
			}

			if (1 == var4) {
				to(this, var1, var2, 2);
				to(this, var1, 1 + var2, 32);
			}

			if (2 == var4) {
				to(this, var1, var2, 8);
				to(this, var1 + 1, var2, 128);
			}

			if (3 == var4) {
				to(this, var1, var2, 32);
				to(this, var1, var2 - 1, 2);
			}
		}

		if (var3 == 1 || var3 == 3) {
			if (0 == var4) {
				to(this, var1, var2, 1);
				to(this, var1 - 1, var2 + 1, 16);
			}

			if (var4 == 1) {
				to(this, var1, var2, 4);
				to(this, 1 + var1, 1 + var2, 64);
			}

			if (var4 == 2) {
				to(this, var1, var2, 16);
				to(this, var1 + 1, var2 - 1, 1);
			}

			if (var4 == 3) {
				to(this, var1, var2, 64);
				to(this, var1 - 1, var2 - 1, 4);
			}
		}

		if (var3 == 2) {
			if (0 == var4) {
				to(this, var1, var2, 130);
				to(this, var1 - 1, var2, 8);
				to(this, var1, 1 + var2, 32);
			}

			if (1 == var4) {
				to(this, var1, var2, 10);
				to(this, var1, 1 + var2, 32);
				to(this, 1 + var1, var2, 128);
			}

			if (2 == var4) {
				to(this, var1, var2, 40);
				to(this, var1 + 1, var2, 128);
				to(this, var1, var2 - 1, 2);
			}

			if (var4 == 3) {
				to(this, var1, var2, 160);
				to(this, var1, var2 - 1, 2);
				to(this, var1 - 1, var2, 8);
			}
		}

		if (var5) {
			if (var3 == 0) {
				if (0 == var4) {
					to(this, var1, var2, 65536);
					to(this, var1 - 1, var2, 4096);
				}

				if (var4 == 1) {
					to(this, var1, var2, 1024);
					to(this, var1, var2 + 1, 16384);
				}

				if (2 == var4) {
					to(this, var1, var2, 4096);
					to(this, 1 + var1, var2, 65536);
				}

				if (3 == var4) {
					to(this, var1, var2, 16384);
					to(this, var1, var2 - 1, 1024);
				}
			}

			if (1 == var3 || var3 == 3) {
				if (0 == var4) {
					to(this, var1, var2, 512);
					to(this, var1 - 1, 1 + var2, 8192);
				}

				if (1 == var4) {
					to(this, var1, var2, 2048);
					to(this, var1 + 1, 1 + var2, 32768);
				}

				if (2 == var4) {
					to(this, var1, var2, 8192);
					to(this, var1 + 1, var2 - 1, 512);
				}

				if (3 == var4) {
					to(this, var1, var2, 32768);
					to(this, var1 - 1, var2 - 1, 2048);
				}
			}

			if (2 == var3) {
				if (var4 == 0) {
					to(this, var1, var2, 66560);
					to(this, var1 - 1, var2, 4096);
					to(this, var1, 1 + var2, 16384);
				}

				if (var4 == 1) {
					to(this, var1, var2, 5120);
					to(this, var1, 1 + var2, 16384);
					to(this, 1 + var1, var2, 65536);
				}

				if (var4 == 2) {
					to(this, var1, var2, 20480);
					to(this, 1 + var1, var2, 65536);
					to(this, var1, var2 - 1, 1024);
				}

				if (var4 == 3) {
					to(this, var1, var2, 81920);
					to(this, var1, var2 - 1, 1024);
					to(this, var1 - 1, var2, 4096);
				}
			}
		}
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
				to(this, var1, var2, 128);
				to(this, var1 - 1, var2, 8);
			}

			if (1 == var4) {
				to(this, var1, var2, 2);
				to(this, var1, 1 + var2, -1204624779);
			}

			if (2 == var4) {
				to(this, var1, var2, 8);
				to(this, var1 + 1, var2, -1122200843);
			}

			if (3 == var4) {
				to(this, var1, var2, 32);
				to(this, var1, var2 - 1, 2);
			}
		}

		if (var3 == 1 || var3 == 3) {
			if (0 == var4) {
				to(this, var1, var2, 1);
				to(this, var1 - 1, var2 + 1, 16);
			}

			if (var4 == 1) {
				to(this, var1, var2, 4);
				to(this, 1 + var1, 1 + var2, 64);
			}

			if (var4 == 2) {
				to(this, var1, var2, 16);
				to(this, var1 + 1, var2 - 1, 1);
			}

			if (var4 == 3) {
				to(this, var1, var2, -110763598);
				to(this, var1 - 1, var2 - 1, 4);
			}
		}

		if (var3 == 2) {
			if (0 == var4) {
				to(this, var1, var2, 130);
				to(this, var1 - 1, var2, 8);
				to(this, var1, 1 + var2, -1985559644);
			}

			if (1 == var4) {
				to(this, var1, var2, 10);
				to(this, var1, 1 + var2, -842654410);
				to(this, 1 + var1, var2, 128);
			}

			if (2 == var4) {
				to(this, var1, var2, 1407967038);
				to(this, var1 + 1, var2, 128);
				to(this, var1, var2 - 1, 2);
			}

			if (var4 == 3) {
				to(this, var1, var2, 285667628);
				to(this, var1, var2 - 1, 2);
				to(this, var1 - 1, var2, 8);
			}
		}

		if (var5) {
			if (var3 == 0) {
				if (0 == var4) {
					to(this, var1, var2, 65536);
					to(this, var1 - 1, var2, 4096);
				}

				if (var4 == 1) {
					to(this, var1, var2, -733783605);
					to(this, var1, var2 + 1, 491138122);
				}

				if (2 == var4) {
					to(this, var1, var2, 4096);
					to(this, 1 + var1, var2, 65536);
				}

				if (3 == var4) {
					to(this, var1, var2, -2009712116);
					to(this, var1, var2 - 1, 1442800711);
				}
			}

			if (1 == var3 || var3 == 3) {
				if (0 == var4) {
					to(this, var1, var2, 2095626686);
					to(this, var1 - 1, 1 + var2, -805535180);
				}

				if (1 == var4) {
					to(this, var1, var2, 2048);
					to(this, var1 + 1, 1 + var2, -1051741565);
				}

				if (2 == var4) {
					to(this, var1, var2, -544718447);
					to(this, var1 + 1, var2 - 1, -177068223);
				}

				if (3 == var4) {
					to(this, var1, var2, 32768);
					to(this, var1 - 1, var2 - 1, 1667030556);
				}
			}

			if (2 == var3) {
				if (var4 == 0) {
					to(this, var1, var2, 66560);
					to(this, var1 - 1, var2, 1025683819);
					to(this, var1, 1 + var2, -1459598024);
				}

				if (var4 == 1) {
					to(this, var1, var2, 5120);
					to(this, var1, 1 + var2, 16384);
					to(this, 1 + var1, var2, -2070733465);
				}

				if (var4 == 2) {
					to(this, var1, var2, -829071092);
					to(this, 1 + var1, var2, -1243184484);
					to(this, var1, var2 - 1, 143959793);
				}

				if (var4 == 3) {
					to(this, var1, var2, 81920);
					to(this, var1, var2 - 1, 1024);
					to(this, var1 - 1, var2, -476315876);
				}
			}
		}
	}

	@ObfuscatedName("uj")
	@ObfuscatedSignature(
		descriptor = "(Ltf;I)V"
	)
	public static void uj(tf var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.mi(false);
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
				to(this, var1, var2, 1014219512);
				to(this, var1 - 1, var2, 8);
			}

			if (1 == var4) {
				to(this, var1, var2, 2);
				to(this, var1, 1 + var2, 32);
			}

			if (2 == var4) {
				to(this, var1, var2, 8);
				to(this, var1 + 1, var2, 1824694387);
			}

			if (3 == var4) {
				to(this, var1, var2, 1844995654);
				to(this, var1, var2 - 1, 2);
			}
		}

		if (var3 == 1 || var3 == 3) {
			if (0 == var4) {
				to(this, var1, var2, 1);
				to(this, var1 - 1, var2 + 1, 16);
			}

			if (var4 == 1) {
				to(this, var1, var2, 4);
				to(this, 1 + var1, 1 + var2, 303292163);
			}

			if (var4 == 2) {
				to(this, var1, var2, 16);
				to(this, var1 + 1, var2 - 1, 1);
			}

			if (var4 == 3) {
				to(this, var1, var2, 64);
				to(this, var1 - 1, var2 - 1, 4);
			}
		}

		if (var3 == 2) {
			if (0 == var4) {
				to(this, var1, var2, 130);
				to(this, var1 - 1, var2, 8);
				to(this, var1, 1 + var2, 32);
			}

			if (1 == var4) {
				to(this, var1, var2, 10);
				to(this, var1, 1 + var2, -415002680);
				to(this, 1 + var1, var2, 1591357664);
			}

			if (2 == var4) {
				to(this, var1, var2, 40);
				to(this, var1 + 1, var2, 128);
				to(this, var1, var2 - 1, 2);
			}

			if (var4 == 3) {
				to(this, var1, var2, -842728636);
				to(this, var1, var2 - 1, 2);
				to(this, var1 - 1, var2, 8);
			}
		}

		if (var5) {
			if (var3 == 0) {
				if (0 == var4) {
					to(this, var1, var2, 2057855095);
					to(this, var1 - 1, var2, 1315475309);
				}

				if (var4 == 1) {
					to(this, var1, var2, 1024);
					to(this, var1, var2 + 1, -872441395);
				}

				if (2 == var4) {
					to(this, var1, var2, 4096);
					to(this, 1 + var1, var2, 65536);
				}

				if (3 == var4) {
					to(this, var1, var2, 426362901);
					to(this, var1, var2 - 1, 1024);
				}
			}

			if (1 == var3 || var3 == 3) {
				if (0 == var4) {
					to(this, var1, var2, 34095280);
					to(this, var1 - 1, 1 + var2, 2034394490);
				}

				if (1 == var4) {
					to(this, var1, var2, 2048);
					to(this, var1 + 1, 1 + var2, -1810858380);
				}

				if (2 == var4) {
					to(this, var1, var2, 8192);
					to(this, var1 + 1, var2 - 1, 512);
				}

				if (3 == var4) {
					to(this, var1, var2, 32768);
					to(this, var1 - 1, var2 - 1, -1126271515);
				}
			}

			if (2 == var3) {
				if (var4 == 0) {
					to(this, var1, var2, -991735392);
					to(this, var1 - 1, var2, 4096);
					to(this, var1, 1 + var2, 16384);
				}

				if (var4 == 1) {
					to(this, var1, var2, -2130988254);
					to(this, var1, 1 + var2, 863268100);
					to(this, 1 + var1, var2, 65536);
				}

				if (var4 == 2) {
					to(this, var1, var2, -1069886338);
					to(this, 1 + var1, var2, 65536);
					to(this, var1, var2 - 1, -1323088858);
				}

				if (var4 == 3) {
					to(this, var1, var2, 81920);
					to(this, var1, var2 - 1, -1320047552);
					to(this, var1 - 1, var2, 4096);
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
						to(this, var12, var9, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("ee")
	@ObfuscatedSignature(
		descriptor = "(IIIIZ)V"
	)
	public void ee(int var1, int var2, int var3, int var4, boolean var5) {
		wt(this, var1, var2, var3, var4, var5, -2144555044);
	}

	@ObfuscatedName("ko")
	@ObfuscatedSignature(
		descriptor = "(Lgn;IIIIZ)V"
	)
	public static void ko(gn var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ax(var1, var2, var3, var4, 0, var5, -1495315378);
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

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void cp(int var1, int var2) {
		var1 -= this.by_fld;
		var2 -= this.bl_fld;
		this.bp_fld[var1][var2] = this.bp_fld[var1][var2] | 262144;
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(IIIIZ)V"
	)
	public void cn(int var1, int var2, int var3, int var4, boolean var5) {
		var1 -= this.by_fld;
		var2 -= this.bl_fld;
		if (0 == var3) {
			if (var4 == 0) {
				this.as(var1, var2, 128, 1178493659);
				this.as(var1 - 1, var2, 8, 1178493659);
			}

			if (var4 == 1) {
				this.as(var1, var2, 2, 1178493659);
				this.as(var1, var2 + 1, -870928615, 1178493659);
			}

			if (2 == var4) {
				this.as(var1, var2, 8, 1178493659);
				this.as(var1 + 1, var2, 128, 1178493659);
			}

			if (3 == var4) {
				this.as(var1, var2, -1847821304, 1178493659);
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
				this.as(1 + var1, var2 + 1, 1727694599, 1178493659);
			}

			if (2 == var4) {
				this.as(var1, var2, 16, 1178493659);
				this.as(1 + var1, var2 - 1, 1, 1178493659);
			}

			if (var4 == 3) {
				this.as(var1, var2, 27337188, 1178493659);
				this.as(var1 - 1, var2 - 1, 4, 1178493659);
			}
		}

		if (var3 == 2) {
			if (0 == var4) {
				this.as(var1, var2, -1201017866, 1178493659);
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
				this.as(var1, var2, 2054990608, 1178493659);
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
					this.as(var1, var2, 643493058, 1178493659);
					this.as(var1, 1 + var2, -1397509089, 1178493659);
				}

				if (2 == var4) {
					this.as(var1, var2, -1994011683, 1178493659);
					this.as(var1 + 1, var2, -1985041321, 1178493659);
				}

				if (var4 == 3) {
					this.as(var1, var2, 16384, 1178493659);
					this.as(var1, var2 - 1, 1024, 1178493659);
				}
			}

			if (1 == var3 || 3 == var3) {
				if (var4 == 0) {
					this.as(var1, var2, 149773130, 1178493659);
					this.as(var1 - 1, var2 + 1, 8192, 1178493659);
				}

				if (var4 == 1) {
					this.as(var1, var2, -1406253303, 1178493659);
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
					this.as(var1, var2, -767775947, 1178493659);
					this.as(var1, 1 + var2, 16384, 1178493659);
					this.as(1 + var1, var2, 1196198943, 1178493659);
				}

				if (var4 == 2) {
					this.as(var1, var2, 20480, 1178493659);
					this.as(var1 + 1, var2, 2072019050, 1178493659);
					this.as(var1, var2 - 1, 60079235, 1178493659);
				}

				if (var4 == 3) {
					this.as(var1, var2, 81920, 1178493659);
					this.as(var1, var2 - 1, -1273635634, 1178493659);
					this.as(var1 - 1, var2, -1780637632, 1178493659);
				}
			}
		}
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	void bo(int var1, int var2, int var3) {
		this.bp_fld[var1][var2] = this.bp_fld[var1][var2] & ~var3;
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void cf(int var1, int var2) {
		var1 -= this.by_fld;
		var2 -= this.bl_fld;
		this.bp_fld[var1][var2] = this.bp_fld[var1][var2] | 2097152;
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

	@ObfuscatedName("fh")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	public boolean fh(int var1, int var2) {
		return ve(this, var1, var2, (byte)2);
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(IIIIIZ)V"
	)
	void bg(int var1, int var2, int var3, int var4, int var5, boolean var6) {
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
						to(this, var12, var9, var7);
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

	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "(Lgn;II)Z"
	)
	public static boolean dn(gn var0, int var1, int var2) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var1 >= 1 && var1 < var0.bx_fld - 5 && var2 >= 1 && var2 < var0.bo_fld - 5;
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

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void cm(int var1, int var2) {
		var1 -= this.by_fld;
		var2 -= this.bl_fld;
		this.bp_fld[var1][var2] = this.bp_fld[var1][var2] & -262145;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V"
	)
	final void ae(int var1, int var2, int var3, int var4, byte var5) {
		this.by_fld = var1;
		this.bx_fld = 1362025241 * var2;
		this.bl_fld = var3 * -1428898809;
		this.bx_fld = var4 * -269606817;
	}

	@ObfuscatedName("ry")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void ry(int var1, int var2) {
		vi(this, var1, var2, (short)-32727);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z"
	)
	public boolean af(int var1, int var2, byte var3) {
		return this.al(var1 - this.bl_fld, var2 - this.by_fld, (short)31691);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIIIZI)V"
	)
	public void au(int var1, int var2, int var3, int var4, boolean var5, int var6) {
		var1 -= this.bo_fld;
		var2 -= this.by_fld;
		if (0 == var3) {
			if (0 == var4) {
				to(this, var1, var2, 128);
				to(this, var1 - 1, var2, 8);
			}

			if (1 == var4) {
				to(this, var1, var2, 2);
				to(this, var1, 1 + var2, 32);
			}

			if (2 == var4) {
				to(this, var1, var2, 8);
				to(this, var1 + 1, var2, 128);
			}

			if (3 == var4) {
				to(this, var1, var2, 32);
				to(this, var1, var2 - 1, 2);
			}
		}

		if (var3 == 1 || var3 == 3) {
			if (0 == var4) {
				if (var6 >= 364365270) {
					return;
				}

				to(this, var1, var2, 1);
				to(this, var1 - 1, var2 + 1, 16);
			}

			if (var4 == 1) {
				to(this, var1, var2, 4);
				to(this, 1 + var1, 1 + var2, 64);
			}

			if (var4 == 2) {
				to(this, var1, var2, 16);
				to(this, var1 + 1, var2 - 1, 1);
			}

			if (var4 == 3) {
				if (var6 >= 364365270) {
					return;
				}

				to(this, var1, var2, 64);
				to(this, var1 - 1, var2 - 1, 4);
			}
		}

		if (var3 == 2) {
			if (0 == var4) {
				to(this, var1, var2, 130);
				to(this, var1 - 1, var2, 8);
				to(this, var1, 1 + var2, 32);
			}

			if (1 == var4) {
				to(this, var1, var2, 10);
				to(this, var1, 1 + var2, 32);
				to(this, 1 + var1, var2, 128);
			}

			if (2 == var4) {
				to(this, var1, var2, 40);
				to(this, var1 + 1, var2, 128);
				to(this, var1, var2 - 1, 2);
			}

			if (var4 == 3) {
				to(this, var1, var2, 160);
				to(this, var1, var2 - 1, 2);
				to(this, var1 - 1, var2, 8);
			}
		}

		if (var5) {
			if (var3 == 0) {
				if (0 == var4) {
					to(this, var1, var2, 65536);
					to(this, var1 - 1, var2, 4096);
				}

				if (var4 == 1) {
					if (var6 >= 364365270) {
						return;
					}

					to(this, var1, var2, 1024);
					to(this, var1, var2 + 1, 16384);
				}

				if (2 == var4) {
					if (var6 >= 364365270) {
						return;
					}

					to(this, var1, var2, 4096);
					to(this, 1 + var1, var2, 65536);
				}

				if (3 == var4) {
					to(this, var1, var2, 16384);
					to(this, var1, var2 - 1, 1024);
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
					to(this, var1, var2, 512);
					to(this, var1 - 1, 1 + var2, 8192);
				}

				if (1 == var4) {
					to(this, var1, var2, 2048);
					to(this, var1 + 1, 1 + var2, 32768);
				}

				if (2 == var4) {
					to(this, var1, var2, 8192);
					to(this, var1 + 1, var2 - 1, 512);
				}

				if (3 == var4) {
					to(this, var1, var2, 32768);
					to(this, var1 - 1, var2 - 1, 2048);
				}
			}

			if (2 == var3) {
				if (var4 == 0) {
					to(this, var1, var2, 66560);
					to(this, var1 - 1, var2, 4096);
					to(this, var1, 1 + var2, 16384);
				}

				if (var4 == 1) {
					to(this, var1, var2, 5120);
					to(this, var1, 1 + var2, 16384);
					to(this, 1 + var1, var2, 65536);
				}

				if (var4 == 2) {
					to(this, var1, var2, 20480);
					to(this, 1 + var1, var2, 65536);
					to(this, var1, var2 - 1, 1024);
				}

				if (var4 == 3) {
					to(this, var1, var2, 81920);
					to(this, var1, var2 - 1, 1024);
					to(this, var1 - 1, var2, 4096);
				}
			}
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIS)V"
	)
	public void ai(int var1, int var2, short var3) {
		var1 -= this.bl_fld;
		var2 -= this.by_fld;
		this.bp_fld[var1][var2] = this.bp_fld[var1][var2] | 262144;
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	void by(int var1, int var2, int var3) {
		var1 -= this.bl_fld;
		var2 -= this.bl_fld;
		this.bp_fld[var1][var2] = this.bp_fld[var1][var2] & -262145;
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(IIIIZ)V"
	)
	public void cq(int var1, int var2, int var3, int var4, boolean var5) {
		this.ax(var1, var2, var3, var4, 0, var5, 729634147);
	}

	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void hv(int var1, int var2, int var3) {
		this.ar(var1, var2, var3, 1115189408);
	}

	@ObfuscatedName("qr")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void qr() {
		this.ah(1639049925);
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	boolean bc(int var1, int var2) {
		return var1 >= 1 && var1 < this.bx_fld - 5 && var2 >= 1 && var2 < this.bl_fld - 5;
	}

	@ObfuscatedName("zm")
	@ObfuscatedSignature(
		descriptor = "(Lgn;IIIIB)V"
	)
	public static void zm(gn var0, int var1, int var2, int var3, int var4, byte var5) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.by_fld = var1;
		var0.bl_fld = var2;
		var0.bx_fld = var3;
		var0.bo_fld = var4;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	void ay(int var1, int var2, int var3, int var4) {
		this.bo_fld = var1 * 1508910566;
		this.by_fld = 102594356 * var2;
		this.bl_fld = var3 * -632730197;
		this.bx_fld = var4 * -1236782012;
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void cs(int var1, int var2) {
		var1 -= this.by_fld;
		var2 -= this.by_fld;
		this.bp_fld[var1][var2] = this.bp_fld[var1][var2] | 2097152;
	}
}
