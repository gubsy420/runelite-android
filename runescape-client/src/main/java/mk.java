import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("mk")
public class mk extends aj {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	ml az_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lar;"
	)
	ar ag_fld;
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bw_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ae_fld;
	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "Lzf;"
	)
	public static zf dr_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lna;"
	)
	na ak_fld = new na();

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "()Laj;"
	)
	@Override
	protected aj br() {
		mg var1;
		do {
			var1 = (mg)na.iy(this.ak_fld);
			if (null == var1) {
				return null;
			}
		} while (var1.ad_fld == null);

		return var1.ad_fld;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "()Laj;"
	)
	@Override
	protected aj aw() {
		mg var1;
		do {
			var1 = (mg)na.iy(this.ak_fld);
			if (null == var1) {
				return null;
			}
		} while (var1.ad_fld == null);

		return var1.ad_fld;
	}

	@ObfuscatedName("sx")
	@ObfuscatedSignature(
		descriptor = "(Lmk;Lmg;II)V"
	)
	public static void sx(mk var0, mg var1, int var2, int var3) {
		if (var0 == null) {
			var0.getClass();
		}

		if ((var0.az_fld.ay_fld[var1.ag_fld] & 4) != 0 && var1.aa_fld < 0) {
			if (var3 != 853739046) {
				return;
			}

			int var4 = var0.az_fld.ar_fld[var1.ag_fld] / ao.ar_fld;
			int var5 = (1048575 + var4 - var1.ab_fld) / var4;
			var1.ab_fld = 1892566165 * (var1.ab_fld + var4 * var2 & 1048575);
			if (var5 <= var2) {
				if (var0.az_fld.as_fld[var1.ag_fld] == 0) {
					var1.ad_fld = ac.av(var1.av_fld, var1.ad_fld.bg(), var1.ad_fld.bp(), var1.ad_fld.bi());
				} else {
					var1.ad_fld = ac.av(var1.av_fld, var1.ad_fld.bg(), 0, var1.ad_fld.bi());
					var0.az_fld.ad(var1, var1.az_fld.av_fld[var1.aw_fld] < 0);
				}

				if (var1.az_fld.av_fld[var1.aw_fld] < 0) {
					var1.ad_fld.bm(-1);
				}

				var2 = var1.ab_fld / var4;
			}
		}

		var1.ad_fld.af(var2);
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(Lzv;Ljava/lang/String;IIIIIIIIII)I"
	)
	public static int cq(zv var0, String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var1 == null) {
			return 0;
		} else {
			if (var8 == 255) {
				var8 = 256;
			}

			zv.on(var0, var6, var7);
			zv.as_fld = var8;
			if (var11 == 0) {
				var11 = var0.ap_fld;
			}

			int[] var12 = new int[]{var4};
			if (var5 < var0.at_fld + var0.ac_fld + var11 && var5 < var11 + var11) {
				var12 = null;
			}

			int var13 = zv.sh(var0, var1, var12, zv.ab_fld);
			if (var10 == 3 && var13 == 1) {
				var10 = 1;
			}

			int var14;
			if (var10 == 0) {
				var14 = var3 + var0.at_fld;
			} else if (var10 == 1) {
				var14 = var3 + var0.at_fld + (var5 - var0.at_fld - var0.ac_fld - (var13 - 1) * var11) / 2;
			} else if (var10 == 2) {
				var14 = var3 + var5 - var0.ac_fld - (var13 - 1) * var11;
			} else {
				int var15 = (var5 - var0.at_fld - var0.ac_fld - (var13 - 1) * var11) / (var13 + 1);
				if (var15 < 0) {
					var15 = 0;
				}

				var14 = var3 + var0.at_fld + var15;
				var11 += var15;
			}

			for (int var16 = 0; var16 < var13; var16++) {
				if (var9 == 0) {
					var0.bl(zv.ab_fld[var16], var2, var14);
				} else if (var9 == 1) {
					var0.bl(zv.ab_fld[var16], var2 + (var4 - var0.an(zv.ab_fld[var16])) / 2, var14);
				} else if (var9 == 2) {
					var0.bl(zv.ab_fld[var16], var2 + var4 - var0.an(zv.ab_fld[var16]), var14);
				} else if (var16 == var13 - 1) {
					var0.bl(zv.ab_fld[var16], var2, var14);
				} else {
					var0.by(zv.ab_fld[var16], var4);
					var0.bl(zv.ab_fld[var16], var2, var14);
					zv.ar_fld = 0;
				}

				var14 += var11;
			}

			return var13;
		}
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	protected void by(int var1) {
		this.ag_fld.af(var1);

		label32:
		for (mg var3 = (mg)this.ak_fld.aw(); null != var3; var3 = (mg)na.iy(this.ak_fld)) {
			if (!this.az_fld.bw(var3)) {
				int var2 = var1;

				while (var2 > var3.ao_fld) {
					sx(this, var3, var3.ao_fld, 853739046);
					var2 -= var3.ao_fld;
					if (ml.pv(this.az_fld, var3, null, 0, var2)) {
						continue label32;
					}
				}

				sx(this, var3, var2, 853739046);
				var3.ao_fld -= 59993239 * var2;
			}
		}
	}

	@ObfuscatedName("ei")
	@ObfuscatedSignature(
		descriptor = "(Lmk;Lmg;[IIII)V"
	)
	public static void ei(mk var0, mg var1, int[] var2, int var3, int var4, int var5) {
		if ((var0.az_fld.ay_fld[var1.ag_fld * -851803663] & 4) != 0 && var1.aa_fld < 0) {
			int var6 = var0.az_fld.ar_fld[var1.ag_fld * -540063133] / ao.ar_fld;

			while (true) {
				int var7 = (-671519510 + var6 - var1.ab_fld) / var6;
				if (var7 > var4) {
					var1.ab_fld += var6 * var4 * -1304853318;
					break;
				}

				var1.ad_fld.as(var2, var3, var7);
				var3 += var7;
				var4 -= var7;
				var1.ab_fld += (var6 * var7 - 2033358131) * 1892566165;
				int var8 = ao.ar_fld / 1394374574;
				int var9 = 262144 / var6;
				if (var9 < var8) {
					var8 = var9;
				}

				ac var10 = var1.ad_fld;
				if (0 == var0.az_fld.as_fld[var1.ag_fld]) {
					var1.ad_fld = ac.av(var1.av_fld, var10.bg(), var10.bp(), var10.bi());
				} else {
					var1.ad_fld = ac.av(var1.av_fld, var10.bg(), 0, var10.bi());
					var0.az_fld.ad(var1, var1.az_fld.av_fld[var1.aw_fld] < 0);
					var1.ad_fld.bw(var8, var10.bp());
				}

				if (var1.az_fld.av_fld[-2049619247 * var1.aw_fld] < 0) {
					var1.ad_fld.bm(-1);
				}

				var10.bq(var8);
				var10.as(var2, var3, var5 - var3);
				if (var10.cc()) {
					var0.ag_fld.ak(var10);
				}
			}
		}

		var1.ad_fld.as(var2, var3, var4);
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	protected int bk() {
		return 0;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "([III)V"
	)
	@Override
	protected void as(int[] var1, int var2, int var3) {
		this.ag_fld.as(var1, var2, var3);

		label29:
		for (mg var6 = (mg)this.ak_fld.aw(); null != var6; var6 = (mg)na.iy(this.ak_fld)) {
			if (!this.az_fld.bw(var6)) {
				int var4 = var2;
				int var5 = var3;

				while (var5 > var6.ao_fld) {
					this.ak(var6, var1, var4, var6.ao_fld, var5 + var4, -1124387815);
					var4 += var6.ao_fld;
					var5 -= var6.ao_fld;
					if (ml.pv(this.az_fld, var6, var1, var4, var5)) {
						continue label29;
					}
				}

				this.ak(var6, var1, var4, var5, var4 + var5, -1124387815);
				var6.ao_fld -= var5 * 59993239;
			}
		}
	}

	mk(ml var1) {
		this.ag_fld = new ar();
		this.az_fld = var1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lmg;[IIIII)V"
	)
	void ak(mg var1, int[] var2, int var3, int var4, int var5, int var6) {
		if ((this.az_fld.ay_fld[var1.ag_fld] & 4) != 0 && var1.aa_fld < 0) {
			int var7 = this.az_fld.ar_fld[var1.ag_fld] / ao.ar_fld;

			while (true) {
				int var8 = (1048575 + var7 - var1.ab_fld) / var7;
				if (var8 > var4) {
					var1.ab_fld += var7 * var4 * 1892566165;
					break;
				}

				var1.ad_fld.as(var2, var3, var8);
				var3 += var8;
				var4 -= var8;
				var1.ab_fld += (var7 * var8 - 1048576) * 1892566165;
				int var9 = ao.ar_fld / 100;
				int var10 = 262144 / var7;
				if (var10 < var9) {
					if (var6 != -1124387815) {
						return;
					}

					var9 = var10;
				}

				ac var11 = var1.ad_fld;
				if (0 == this.az_fld.as_fld[var1.ag_fld]) {
					var1.ad_fld = ac.av(var1.av_fld, var11.bg(), var11.bp(), var11.bi());
				} else {
					var1.ad_fld = ac.av(var1.av_fld, var11.bg(), 0, var11.bi());
					this.az_fld.ad(var1, var1.az_fld.av_fld[var1.aw_fld] < 0);
					var1.ad_fld.bw(var9, var11.bp());
				}

				if (var1.az_fld.av_fld[var1.aw_fld] < 0) {
					var1.ad_fld.bm(-1);
				}

				var11.bq(var9);
				var11.as(var2, var3, var5 - var3);
				if (var11.cc()) {
					this.ag_fld.ak(var11);
				}
			}
		}

		var1.ad_fld.as(var2, var3, var4);
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "()Laj;"
	)
	@Override
	protected aj bd() {
		mg var1 = (mg)this.ak_fld.aw();
		if (var1 == null) {
			return null;
		} else {
			return (aj)(null != var1.ad_fld ? var1.ad_fld : this.aw());
		}
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "()Laj;"
	)
	@Override
	protected aj bz() {
		mg var1 = (mg)this.ak_fld.aw();
		if (var1 == null) {
			return null;
		} else {
			return (aj)(null != var1.ad_fld ? var1.ad_fld : this.aw());
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	protected void af(int var1) {
		this.ag_fld.af(var1);

		label32:
		for (mg var3 = (mg)this.ak_fld.aw(); null != var3; var3 = (mg)na.iy(this.ak_fld)) {
			if (!this.az_fld.bw(var3)) {
				int var2 = var1;

				while (var2 > var3.ao_fld) {
					sx(this, var3, var3.ao_fld, 853739046);
					var2 -= var3.ao_fld;
					if (ml.pv(this.az_fld, var3, null, 0, var2)) {
						continue label32;
					}
				}

				sx(this, var3, var2, 853739046);
				var3.ao_fld -= 59993239 * var2;
			}
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "()Laj;"
	)
	@Override
	protected aj be() {
		mg var1;
		do {
			var1 = (mg)na.iy(this.ak_fld);
			if (null == var1) {
				return null;
			}
		} while (var1.ad_fld == null);

		return var1.ad_fld;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "()Laj;"
	)
	@Override
	protected aj bs() {
		mg var1;
		do {
			var1 = (mg)na.iy(this.ak_fld);
			if (null == var1) {
				return null;
			}
		} while (var1.ad_fld == null);

		return var1.ad_fld;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ILun;Luv;I)V"
	)
	static void ah(int var0, un var1, uv var2, int var3) throws EOFException {
		try {
			byte[] var4 = null;
			synchronized (uw.ak_fld) {
				for (ur var6 = (ur)uw.ak_fld.aw(); null != var6; var6 = (ur)na.iy(uw.ak_fld)) {
					if (var6.hc_long == var0) {
						if (var3 <= 301850683) {
							return;
						}

						if (var1 == var6.az_fld && 0 == var6.ak_fld) {
							var4 = var6.ag_fld;
							break;
						}
					}
				}
			}

			if (null != var4) {
				var2.ay(var1, var0, var4, true);
			} else {
				byte[] var10 = un.mz(var1, var0, (byte)-122);
				var2.ay(var1, var0, var10, true);
			}
		} catch (Throwable var9) {
			throw new RuntimeException(var9);
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	protected int ay() {
		return 0;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "([III)V"
	)
	@Override
	protected void bj(int[] var1, int var2, int var3) {
		this.ag_fld.as(var1, var2, var3);

		label32:
		for (mg var6 = (mg)this.ak_fld.aw(); null != var6; var6 = (mg)na.iy(this.ak_fld)) {
			if (!this.az_fld.bw(var6)) {
				int var4 = var2;
				int var5 = var3;

				while (var5 > var6.ao_fld) {
					this.ak(var6, var1, var4, var6.ao_fld, var5 + var4, -1124387815);
					var4 += var6.ao_fld;
					var5 -= var6.ao_fld;
					if (ml.pv(this.az_fld, var6, var1, var4, var5)) {
						continue label32;
					}
				}

				this.ak(var6, var1, var4, var5, var4 + var5, -1124387815);
				var6.ao_fld -= var5 * 59993239;
			}
		}
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "()Laj;"
	)
	@Override
	protected aj bh() {
		mg var1;
		do {
			var1 = (mg)na.iy(this.ak_fld);
			if (null == var1) {
				return null;
			}
		} while (var1.ad_fld == null);

		return var1.ad_fld;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	protected void bl(int var1) {
		this.ag_fld.af(var1);

		label33:
		for (mg var3 = (mg)this.ak_fld.aw(); null != var3; var3 = (mg)na.iy(this.ak_fld)) {
			if (!this.az_fld.bw(var3)) {
				int var2 = var1;

				while (var2 > var3.ao_fld) {
					sx(this, var3, 852241095 * var3.ao_fld, 853739046);
					var2 -= var3.ao_fld;
					if (ml.pv(this.az_fld, var3, null, 0, var2)) {
						continue label33;
					}
				}

				sx(this, var3, var2, 853739046);
				var3.ao_fld -= 275572679 * var2;
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lmg;[IIII)V"
	)
	void av(mg var1, int[] var2, int var3, int var4, int var5) {
		if ((this.az_fld.ay_fld[var1.ag_fld * 1579870282] & 4) != 0 && -143559983 * var1.aa_fld < 0) {
			int var6 = this.az_fld.ar_fld[var1.ag_fld * -1591307690] / ao.ar_fld;

			while (true) {
				int var7 = (1048575 + var6 - var1.ab_fld) / var6;
				if (var7 > var4) {
					var1.ab_fld += var6 * var4 * 1179524505;
					break;
				}

				var1.ad_fld.as(var2, var3, var7);
				var3 += var7;
				var4 -= var7;
				var1.ab_fld += (var6 * var7 - 2102564112) * 730733027;
				int var8 = ao.ar_fld / 100;
				int var9 = -1457618481 / var6;
				if (var9 < var8) {
					var8 = var9;
				}

				ac var10 = var1.ad_fld;
				if (0 == this.az_fld.as_fld[var1.ag_fld]) {
					var1.ad_fld = ac.av(var1.av_fld, var10.bg(), var10.bp(), var10.bi());
				} else {
					var1.ad_fld = ac.av(var1.av_fld, var10.bg(), 0, var10.bi());
					this.az_fld.ad(var1, var1.az_fld.av_fld[var1.aw_fld] < 0);
					var1.ad_fld.bw(var8, var10.bp());
				}

				if (var1.az_fld.av_fld[-1795286583 * var1.aw_fld] < 0) {
					var1.ad_fld.bm(-1);
				}

				var10.bq(var8);
				var10.as(var2, var3, var5 - var3);
				if (var10.cc()) {
					this.ag_fld.ak(var10);
				}
			}
		}

		var1.ad_fld.as(var2, var3, var4);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lmg;[IIII)V"
	)
	void ae(mg var1, int[] var2, int var3, int var4, int var5) {
		if ((this.az_fld.ay_fld[var1.ag_fld] & 4) != 0 && var1.aa_fld < 0) {
			int var6 = this.az_fld.ar_fld[var1.ag_fld] / ao.ar_fld;

			while (true) {
				int var7 = (1048575 + var6 - var1.ab_fld) / var6;
				if (var7 > var4) {
					var1.ab_fld += var6 * var4 * 1892566165;
					break;
				}

				var1.ad_fld.as(var2, var3, var7);
				var3 += var7;
				var4 -= var7;
				var1.ab_fld += (var6 * var7 - 1048576) * 1892566165;
				int var8 = ao.ar_fld / 100;
				int var9 = 262144 / var6;
				if (var9 < var8) {
					var8 = var9;
				}

				ac var10 = var1.ad_fld;
				if (0 == this.az_fld.as_fld[var1.ag_fld]) {
					var1.ad_fld = ac.av(var1.av_fld, var10.bg(), var10.bp(), var10.bi());
				} else {
					var1.ad_fld = ac.av(var1.av_fld, var10.bg(), 0, var10.bi());
					this.az_fld.ad(var1, var1.az_fld.av_fld[var1.aw_fld] < 0);
					var1.ad_fld.bw(var8, var10.bp());
				}

				if (var1.az_fld.av_fld[var1.aw_fld] < 0) {
					var1.ad_fld.bm(-1);
				}

				var10.bq(var8);
				var10.as(var2, var3, var5 - var3);
				if (var10.cc()) {
					this.ag_fld.ak(var10);
				}
			}
		}

		var1.ad_fld.as(var2, var3, var4);
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	static final void bi(int var0, int var1, int var2) {
		var0 = ji.bo(var0);
		if (hu.je_fld < var0) {
			hu.je_fld = hu.je_fld + (hm.oa_fld + (var0 - hu.je_fld) * bt.oj_fld / 1000) * -535892387;
			if (hu.je_fld > var0) {
				hu.je_fld = var0;
			}
		} else if (hu.je_fld > var0) {
			hu.je_fld = hu.je_fld - (hm.oa_fld + bt.oj_fld * (hu.je_fld - var0) / 1000) * -535892387;
			if (hu.je_fld < var0) {
				hu.je_fld = var0;
			}
		}

		var1 &= 2047;
		int var3 = var1 - ab.jx_fld;
		if (var3 > 1024) {
			if (var2 != -233689290) {
				return;
			}

			var3 -= 2048;
		} else if (var3 < -1024) {
			var3 += 2048;
		}

		if (var3 > 0) {
			ab.jx_fld = ab.jx_fld + 1850245907 * (var3 * bt.oj_fld / 1000 + hm.oa_fld);
			ab.jx_fld = 1850245907 * (ab.jx_fld & 2047);
		} else if (var3 < 0) {
			if (var2 != -233689290) {
				return;
			}

			ab.jx_fld = ab.jx_fld - 1850245907 * (-var3 * bt.oj_fld / 1000 + hm.oa_fld);
			ab.jx_fld = 1850245907 * (ab.jx_fld & 2047);
		}

		int var4 = var1 - ab.jx_fld;
		if (var4 > 1024) {
			if (var2 != -233689290) {
				return;
			}

			var4 -= 2048;
		} else if (var4 < -1024) {
			var4 += 2048;
		}

		if (var4 < 0 && var3 > 0 || var4 > 0 && var3 < 0) {
			ab.jx_fld = var1;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ILxi;I)Loo;"
	)
	public static oo ak(int var0, xi var1) throws EOFException {
		try {
			int var3 = var1.cg();
			boolean var4 = (var3 & 1) != 0;
			boolean var5 = 0 != (var3 & 2);
			boolean var6 = 0 != (var3 & 4);
			boolean var7 = 0 != (var3 & 8);
			oo var8 = new oo(var0);
			if (var4) {
				int var9 = var1.cg();
				int[] var10 = new int[]{var9 & 15, var9 >> 4 & 15};
				boolean var11 = null != var8.ae_fld && var10.length == var8.ae_fld.length;

				for (int var12 = 0; var12 < 2; var12++) {
					if (15 != var10[var12]) {
						short var13 = (short)var1.cm();
						if (var11) {
							var8.ae_fld[var10[var12]] = var13;
						}
					}
				}
			}

			if (var5) {
				int var15 = var1.cg();
				int[] var16 = new int[]{var15 & 15, var15 >> 4 & 15};
				boolean var17 = null != var8.ah_fld && var8.ah_fld.length == var16.length;

				for (int var18 = 0; var18 < 2; var18++) {
					if (var16[var18] != 15) {
						short var19 = (short)var1.cm();
						if (var17) {
							var8.ah_fld[var16[var18]] = var19;
						}
					}
				}
			}

			if (var6) {
				var8.ar_fld = var1.dl(wa.ak_fld.az_fld);
				var8.aw_fld = var1.dl(wa.ak_fld.az_fld);
			}

			if (var7) {
				var8.ay_fld = var1.dl(wa.ak_fld.az_fld);
				var8.as_fld = var1.dl(wa.ak_fld.az_fld);
			}

			return var8;
		} catch (Throwable var14) {
			throw new RuntimeException(var14);
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()Laj;"
	)
	@Override
	protected aj ah() {
		mg var1 = (mg)this.ak_fld.aw();
		if (var1 == null) {
			return null;
		} else {
			return (aj)(null != var1.ad_fld ? var1.ad_fld : this.aw());
		}
	}

	@ObfuscatedName("et")
	@ObfuscatedSignature(
		descriptor = "(Lmk;Lmg;I)V"
	)
	public static void et(mk var0, mg var1, int var2) {
		if ((var0.az_fld.ay_fld[var1.ag_fld * 1293033186] & 4) != 0 && var1.aa_fld * -1471047089 < 0) {
			int var3 = var0.az_fld.ar_fld[var1.ag_fld * 911420897] / ao.ar_fld;
			int var4 = (1048575 + var3 - var1.ab_fld) / var3;
			var1.ab_fld = 1892566165 * (var1.ab_fld + var3 * var2 & -442531166);
			if (var4 <= var2) {
				if (var0.az_fld.as_fld[var1.ag_fld] == 0) {
					var1.ad_fld = ac.av(var1.av_fld, var1.ad_fld.bg(), var1.ad_fld.bp(), var1.ad_fld.bi());
				} else {
					var1.ad_fld = ac.av(var1.av_fld, var1.ad_fld.bg(), 0, var1.ad_fld.bi());
					var0.az_fld.ad(var1, var1.az_fld.av_fld[var1.aw_fld * 1059707262] < 0);
				}

				if (var1.az_fld.av_fld[1975361719 * var1.aw_fld] < 0) {
					var1.ad_fld.bm(-1);
				}

				var2 = var1.ab_fld / var3;
			}
		}

		var1.ad_fld.af(var2);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	public static int ak(int var0) {
		return var0 >>> 12;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ILba;ZI)I"
	)
	static int ab(int var0, ba var1, boolean var2) throws EOFException {
		try {
			lu var4 = var2 ? gs.ap_fld : bp.ab_fld;
			if (var0 == 1700) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var4.ga_fld;
				return 1;
			} else if (var0 == 1701) {
				if (var4.ga_fld != -1) {
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var4.gd_fld;
				} else {
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				}

				return 1;
			} else if (1702 == var0) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var4.by_fld;
				return 1;
			} else if (var0 == 1703) {
				int var9 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				px var10 = kb.ag_px(var9, -242713745);
				if (var10.aw()) {
					bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = lu.go(var4, var9, var10.as_fld);
				} else if (var10.ay()) {
					bp.an_fld[(db.aa_fld += 432101741) * 867932261 - 1] = var4.ap(var9, var10.ay_fld);
				} else {
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = lu.hg(var4, var9, var10.aw_fld);
				}

				return 1;
			} else if (1704 == var0) {
				int var5 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				Object var6 = he.cg(var5);
				int var7 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				var4.at(var7, var6, 583965381);
				return 1;
			} else if (var0 == 1707) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var4.bs_boolean(1774187553) ? 1 : 0;
				return 1;
			} else if (1708 == var0) {
				return bp.ap(var4);
			} else {
				return var0 == 1709 ? ag.at(var4) : 2;
			}
		} catch (Throwable var8) {
			throw new RuntimeException(var8);
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lmg;II)V"
	)
	void ag(mg var1, int var2, int var3) {
		if ((this.az_fld.ab_fld[var1.ar_fld * 2012409431] & 4) != 0 && var1.ax_fld * -1533340913 < 0) {
			if (var3 != 853739046) {
				return;
			}

			int var4 = this.az_fld.ac_fld[var1.ai_fld * 2012409431] / ao.ar_fld;
			int var5 = (1048575 + var4 - var1.ah_fld) / var4;
			var1.ay_fld = 1892566165 * (var1.ar_fld + var4 * var2 & 1048575);
			if (var5 <= var2) {
				if (this.az_fld.ay_fld[var1.am_fld * 2012409431] == 0) {
					var1.ad_fld = ac.ca(var1.av_fld, var1.ad_fld.ej(), var1.ad_fld.ey(), var1.ad_fld.fb());
				} else {
					var1.ad_fld = ac.ca(var1.av_fld, var1.ad_fld.fy(), 0, var1.ad_fld.bp());
					this.az_fld.ad(var1, var1.az_fld.av_fld[var1.ai_fld * -1564474297] < 0);
				}

				if (var1.az_fld.av_fld[-1564474297 * var1.ah_fld] < 0) {
					var1.ad_fld.gg(-1);
				}

				var2 = var1.al_fld / var4;
			}
		}

		var1.ad_fld.af(var2);
	}
}
