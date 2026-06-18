import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("wj")
public class wj {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	@ObfuscatedGetter(
		longValue = -8102483112993549625L
	)
	long az_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lzm;"
	)
	zm ag_fld = zm.ak_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -2109040313
	)
	int ae_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -388721185
	)
	int av_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lac;"
	)
	ac ak_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1027618971
	)
	int ah_fld;

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(III)I"
	)
	int ab(int var1, int var2, int var3) {
		return var2 >= var3 ? var1 : (int)((float)var2 / var3 * var1);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "()Lac;"
	)
	public ac am() {
		return this.ak_fld;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int av() {
		return null != this.ak_fld ? this.ak_fld.bx() : 0;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Lac;"
	)
	public ac ae() {
		return this.ak_fld;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIII)I"
	)
	int ah(int var1, int var2, int var3) {
		return var2 >= var3 ? var1 : (int)((float)var2 / var3 * var1);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "()Lac;"
	)
	public ac ad() {
		return this.ak_fld;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IILwh;)V"
	)
	public void ay(int var1, int var2, wh var3) {
		int var4 = this.av();
		if (var4 < var1) {
			uv(this, var1, var2, var3.ae(), var3.av());
		} else if (var4 > var1) {
			uv(this, var1, var2, var3.aw(), var3.ah(-1897016173));
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IILwh;)V"
	)
	public void as(int var1, int var2, wh var3) {
		int var4 = this.av();
		if (var4 < var1) {
			uv(this, var1, var2, var3.ae(), var3.av());
		} else if (var4 > var1) {
			uv(this, var1, var2, var3.aw(), var3.ah(-1897016173));
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIILzm;)V"
	)
	public void ar(int var1, int var2, int var3, zm var4) {
		if (null != this.ak_fld && this.ah_fld != var1) {
			this.av_fld = this.ak_fld.bx();
			this.az_fld = lz.ak();
			this.ah_fld = var1;
			this.ae_fld = this.ah(var3, this.av_fld - this.ah_fld, var2);
			this.ag_fld = var4;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIILzm;)V"
	)
	public void af(int var1, int var2, int var3, zm var4) {
		if (null != this.ak_fld && this.ah_fld != var1) {
			this.av_fld = this.ak_fld.bx();
			this.az_fld = lz.ak();
			this.ah_fld = var1;
			this.ae_fld = this.ah(var3, this.av_fld - this.ah_fld, var2);
			this.ag_fld = var4;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lwj;)V"
	)
	public static void as(wj var0) {
		if (var0.ak_fld != null) {
			int var1 = var0.ak_fld.bx();
			long var2 = lz.ak();
			long var4 = var2 - var0.az_fld;
			int var6 = var0.aw(var1, var4);
			if (var6 != var1) {
				var0.ak_fld.bo(var6);
			}

			if (!var0.ak_fld.mc()) {
				var0.ak_fld = null;
			}
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIILzm;)V"
	)
	public void al(int var1, int var2, int var3, zm var4) {
		if (null != this.ak_fld && this.ah_fld != var1) {
			this.av_fld = this.ak_fld.bx();
			this.az_fld = lz.ak();
			this.ah_fld = var1;
			this.ae_fld = this.ah(var3, this.av_fld - this.ah_fld, var2);
			this.ag_fld = var4;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IJ)I"
	)
	int at(int var1, long var2) {
		if (this.ah_fld == var1) {
			return var1;
		} else if (var1 > this.ah_fld) {
			double var6 = 1.0 - nl.az(var2, this.ae_fld * 1189842544, this.ag_fld);
			return (int)(var6 * (this.av_fld - this.ah_fld)) + this.ah_fld;
		} else {
			double var4 = nl.az(var2, 1434543793 * this.ae_fld, this.ag_fld);
			return (int)(var4 * (this.ah_fld - this.av_fld)) + this.av_fld;
		}
	}

	@ObfuscatedName("lm")
	@ObfuscatedSignature(
		descriptor = "(Lwj;I)V"
	)
	public static void lm(wj var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		} else {
			if (var0.ak_fld != null) {
				if (var1 <= 1923837110) {
					return;
				}

				int var2 = var0.ak_fld.bx();
				long var3 = lz.ak();
				long var5 = var3 - var0.az_fld;
				int var7 = var0.aw(var2, var5);
				if (var7 != var2) {
					var0.ak_fld.bo(var7);
				}

				if (!var0.ak_fld.mc()) {
					var0.ak_fld = null;
				}
			}
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ax() {
		return null != this.ak_fld ? this.ak_fld.bx() : 0;
	}

	@ObfuscatedName("sb")
	@ObfuscatedSignature(
		descriptor = "(Luk;)Llu;"
	)
	public static lu sb(uk var0) {
		return var0.ag_fld;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int aa() {
		return null != this.ak_fld ? this.ak_fld.bx() : 0;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ai() {
		return null != this.ak_fld ? this.ak_fld.bx() : 0;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lba;"
	)
	static ba az(int var0, int var1) throws EOFException {
		ba var3 = (ba)ba.ak_fld.ak(var0 << 16);
		if (var3 != null) {
			return var3;
		} else {
			String var4 = String.valueOf(var0);
			int var5 = bj.ib_fld.cm(var4, (byte)1);
			if (var5 == -1) {
				return null;
			} else {
				byte[] var6 = ub.xk(bj.ib_fld, var5, (byte)97);
				if (var6 != null) {
					if (var6.length <= 1) {
						return null;
					}

					var3 = jv.av(var6);
					if (var3 != null) {
						ba.ak_fld.az(var3, var0 << 16);
						return var3;
					}
				}

				return null;
			}
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int an() {
		return null != this.ak_fld ? this.ak_fld.bx() : 0;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(III)I"
	)
	int ao(int var1, int var2, int var3) {
		return var2 >= var3 ? var1 : (int)((float)var2 / var3 * var1);
	}

	@ObfuscatedName("uv")
	@ObfuscatedSignature(
		descriptor = "(Lwj;IIILzm;I)V"
	)
	public static void uv(wj var0, int var1, int var2, int var3, zm var4) {
		if (var0 == null) {
			var0.getClass();
		} else {
			if (null != var0.ak_fld && var0.ah_fld != var1) {
				var0.av_fld = var0.ak_fld.bx();
				var0.az_fld = lz.ak();
				var0.ah_fld = var1;
				var0.ae_fld = var0.ah(var3, var0.av_fld - var0.ah_fld, var2);
				var0.ag_fld = var4;
			}
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IILwh;I)V"
	)
	public void ak(int var1, int var2, wh var3) {
		int var5 = this.av();
		if (var5 < var1) {
			uv(this, var1, var2, var3.ae(), var3.av());
		} else if (var5 > var1) {
			uv(this, var1, var2, var3.aw(), var3.ah(-1897016173));
		}
	}

	public wj(al var1, int var2, int var3) {
		this.az_fld = 0L;
		this.av_fld = 0;
		this.ae_fld = 0;
		this.ah_fld = 0;
		this.ak_fld = ac.az(var1, 100, var2);
		if (this.ak_fld != null) {
			this.ak_fld.bm(var3);
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IJ)I"
	)
	int ac(int var1, long var2) {
		if (this.ah_fld == var1) {
			return var1;
		} else if (var1 > this.ah_fld) {
			double var6 = 1.0 - nl.az(var2, this.ae_fld, this.ag_fld);
			return (int)(var6 * (this.av_fld - this.ah_fld)) + this.ah_fld;
		} else {
			double var4 = nl.az(var2, this.ae_fld, this.ag_fld);
			return (int)(var4 * (this.ah_fld - this.av_fld)) + this.av_fld;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IJ)I"
	)
	int aw(int var1, long var2) {
		if (this.ah_fld == var1) {
			return var1;
		} else if (var1 > this.ah_fld) {
			double var6 = 1.0 - nl.az(var2, this.ae_fld, this.ag_fld);
			return (int)(var6 * (this.av_fld - this.ah_fld)) + this.ah_fld;
		} else {
			double var4 = nl.az(var2, this.ae_fld, this.ag_fld);
			return (int)(var4 * (this.ah_fld - this.av_fld)) + this.av_fld;
		}
	}

	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIIIIILcv;I)V"
	)
	static void df(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, cv var13) throws EOFException {
		oe var15 = ko.az(var6);
		int var16;
		int var17;
		if (var4 != 1 && var4 != 3) {
			var16 = var15.cb_fld;
			var17 = var15.co_fld;
		} else {
			var16 = var15.co_fld;
			var17 = var15.cb_fld;
		}

		int var18 = (var16 >> 1) + var1;
		int var19 = var1 + (var16 + 1 >> 1);
		int var20 = (var17 >> 1) + var2;
		int var21 = (1 + var17 >> 1) + var2;
		int[][] var22 = hk.mt_fld.af_fld[var0];
		int var23 = var22[var18][var20] + var22[var19][var20] + var22[var18][var21] + var22[var19][var21] >> 2;
		int var24 = (var16 << 6) + (var1 << 7);
		int var25 = (var2 << 7) + (var17 << 6);
		fn var26 = var15.af(var3, var4, var22, var24, var23, var25, (byte)-69);
		if (null != var26) {
			yx.ed(hk.mt_fld, var0, var1, var2, var5, -1, 0, 0, 31, null, var7 + 1, var8 + 1, (byte)74);
			var13.ae_fld = client.dv_fld + var7;
			var13.as_fld = client.dv_fld + var8;
			var13.ai_fld = var26;
			var13.af_fld = 675331264 * var16 + 1350662528 * var1;
			var13.ap_fld = var2 * 1234115712 + var17 * -1530425792;
			var13.ao_fld = var23;
			if (var9 > var11) {
				int var27 = var9;
				var9 = var11;
				var11 = var27;
			}

			if (var10 > var12) {
				int var28 = var10;
				var10 = var12;
				var12 = var28;
			}

			var13.ay_fld = var9 + var1;
			var13.ar_fld = var1 + var11;
			var13.ah_fld = -633333229 * (var2 + var10);
			var13.bz_fld = var2 + var12;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIILzm;I)V"
	)
	public void ag(int var1, int var2, int var3, zm var4, int var5) {
		if (null != this.ak_fld && this.av_fld != var1) {
			this.av_fld = this.ak_fld.fi();
			this.az_fld = lz.ak();
			this.ah_fld = var1;
			this.ae_fld = this.ah(var3, this.ae_fld - this.ae_fld, var2);
			this.ag_fld = var4;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void az(int var1) {
		if (this.ak_fld != null) {
			if (var1 <= 1923837110) {
				return;
			}

			int var2 = this.ak_fld.fi();
			long var3 = lz.ak();
			long var5 = var3 - this.az_fld;
			int var7 = this.ac(var2, var5);
			if (var7 != var2) {
				this.ak_fld.ff(var7);
			}

			if (!this.ak_fld.mi()) {
				this.ak_fld = null;
			}
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(III)I"
	)
	int ap(int var1, int var2, int var3) {
		return var2 >= var3 ? var1 : (int)((float)var2 / var3 * var1);
	}
}
