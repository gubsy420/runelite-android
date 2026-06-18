import java.io.EOFException;
import java.util.HashSet;
import java.util.Iterator;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("hh")
public class hh {
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int an_fld;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ax_fld;
	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bx_fld;
	@ObfuscatedName("pg")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -672151393
	)
	static int pg_fld;

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ILba;ZI)I"
	)
	static int ax(int var0, ba var1, boolean var2) throws EOFException {
		lu var4;
		if (var0 >= 2000) {
			var0 -= 1000;
			var4 = cf.cg_fld.ak(bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127]);
		} else {
			var4 = var2 ? gs.ap_fld : bp.ab_fld;
		}

		if (1200 == var0 || var0 == 1205 || var0 == 1212) {
			gz.ax_fld -= 2;
			int var12 = bp.au_fld[gz.ax_fld];
			int var15 = bp.au_fld[1 + gz.ax_fld];
			var4.ga_fld = var12;
			var4.gd_fld = var15;
			og var17 = kb.ag(var12, -1752383175);
			var4.dx_fld = var17.di_fld * 1195532183;
			var4.ds_fld = var17.dn_fld * -2029380757;
			var4.du_fld = -376214075 * var17.df_fld;
			var4.da_fld = var17.de_fld * 2142646695;
			var4.dk_fld = var17.dp_fld * 596927033;
			var4.db_fld = -780652221 * var17.dy_fld;
			if (var0 == 1205) {
				var4.df_fld = 0;
			} else if (var0 == 1212 | var17.dj_fld == 1) {
				var4.df_fld = 108305121;
			} else {
				var4.df_fld = 216610242;
			}

			if (var4.dg_fld > 0) {
				var4.db_fld = -964578897 * (var4.db_fld / var4.dg_fld);
			} else if (var4.bw_fld > 0) {
				var4.db_fld = var4.db_fld / var4.bw_fld;
			}

			return 1;
		} else if (var0 == 1201) {
			var4.dm_fld = 693315590;
			var4.dq_fld = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			return 1;
		} else if (1202 == var0) {
			var4.dm_fld = -1107510263;
			cv var11 = ot.ef();
			var4.dq_fld = var11 != null ? lp.ls(var11.av_fld, 2035269373) : -1;
			return 1;
		} else if (1207 == var0) {
			boolean var10 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
			cv var14 = ot.ef();
			lp var16 = var14 != null ? var14.av_fld : null;
			var4.ba(var16, var10, 1705960674);
			return 1;
		} else if (1208 == var0) {
			int var9 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			if (null == var4.dy_fld) {
				throw new RuntimeException("");
			} else {
				var4.dy_fld.aw(var9, (byte)0);
				return 1;
			}
		} else if (1209 == var0) {
			gz.ax_fld -= 2;
			int var8 = bp.au_fld[gz.ax_fld];
			int var13 = bp.au_fld[gz.ax_fld + 1];
			if (var4.dy_fld == null) {
				throw new RuntimeException("");
			} else {
				var4.dy_fld.aa(var8, var13, 2142798814);
				return 1;
			}
		} else if (var0 == 1210) {
			int var5 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			if (null == var4.dy_fld) {
				throw new RuntimeException("");
			} else {
				cv var6 = ot.ef();
				int var7 = var6 != null ? 1953147203 * var6.av_fld.ax_fld : 0;
				lp.yo(var4.dy_fld, var7, var5, 1742298493);
				return 1;
			}
		} else if (1214 == var0) {
			var4.dm_fld = -1521704936;
			var4.dq_fld = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			return 1;
		} else if (var0 == 1215) {
			var4.dm_fld = 972436507;
			var4.dq_fld = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("ny")
	@ObfuscatedSignature(
		descriptor = "(Lcx;I)Ldx;"
	)
	public static dx ny(cx var0, int var1) {
		return (dx)(dx)var0.ak_fld.ak(var1);
	}

	@ObfuscatedName("hq")
	@ObfuscatedSignature(
		descriptor = "(Lga;Ljava/util/HashSet;II)V"
	)
	public static void hq(ga var0, HashSet var1, int var2, int var3) throws EOFException {
		Iterator var4 = var0.ax_fld.values().iterator();

		while (var4.hasNext()) {
			hr var5 = (hr)(hr)var4.next();
			if (var5.aq((byte)105)) {
				int var6 = var5.ag(1455480072);
				if (var1.contains(var6)) {
					pc var7 = uh.ak(var6);
					ga.lk(var0, var7, var5.ar_fld, var5.as_fld, var2, var3, -2047673427);
				}
			}
		}

		var0.at(var1, var2, var3, (byte)41);
	}

	hh() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	static boolean ar() {
		if ((client.gt_fld & wu.aj_fld.ag(744655113)) != 0) {
			bn.cu_fld = "";
			bn.ci_fld = kh.jv_fld;
			bn.cj_fld = kh.jo_fld;
			bn.ch_fld = kh.ja_fld;
			jz.ac(1);
			return true;
		} else if ((client.gt_fld & wu.az_fld.ag(-584858116)) != 0) {
			if ((client.gt_fld & wu.af_fld.ag(586742921)) != 0) {
				bn.ci_fld = kh.jm_fld;
				bn.cj_fld = kh.jg_fld;
				bn.ch_fld = kh.jw_fld;
			} else {
				bn.ci_fld = kh.jz_fld;
				bn.cj_fld = kh.jj_fld;
				bn.ch_fld = kh.jk_fld;
			}

			bn.cu_fld = kh.ig_fld;
			jz.ac(1);
			return true;
		} else if ((client.gt_fld & wu.af_fld.ag(-1955905863)) != 0) {
			bn.ci_fld = kh.jn_fld;
			bn.cj_fld = kh.jb_fld;
			bn.ch_fld = kh.jt_fld;
			bn.cu_fld = kh.ig_fld;
			jz.ac(1);
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)Loy;"
	)
	public static oy ag(int var0) throws EOFException {
		oy var2 = (oy)oy.ap_fld.ak(var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = ep.ao_fld.bb(72, var0, 584982574);
			var2 = new oy();
			var2.bf_fld = var0;
			if (var3 != null) {
				var2.av(new xi(var3), 50610823);
			}

			var2.ah(-2026285218);
			oy.ap_fld.az(var2, var0);
			return var2;
		}
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	static final void bm() {
		nz.ad_fld = null;
		cl.ao_fld = null;
		fi.am_fld = 0;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(DDD)I"
	)
	public static final int ag(double var0, double var2, double var4) {
		double var6 = var4;
		double var8 = var4;
		double var10 = var4;
		if (0.0 != var2) {
			double var12;
			if (var4 < 0.5) {
				var12 = var4 * (var2 + 1.0);
			} else {
				var12 = var4 + var2 - var2 * var4;
			}

			double var14 = var4 * 2.0 - var12;
			double var16 = 0.3333333333333333 + var0;
			if (var16 > 1.0) {
				var16--;
			}

			double var20 = var0 - 0.3333333333333333;
			if (var20 < 0.0) {
				var20++;
			}

			if (var16 * 6.0 < 1.0) {
				var6 = var16 * ((var12 - var14) * 6.0) + var14;
			} else if (var16 * 2.0 < 1.0) {
				var6 = var12;
			} else if (var16 * 3.0 < 2.0) {
				var6 = 6.0 * ((0.6666666666666666 - var16) * (var12 - var14)) + var14;
			} else {
				var6 = var14;
			}

			if (6.0 * var0 < 1.0) {
				var8 = var14 + (var12 - var14) * 6.0 * var0;
			} else if (2.0 * var0 < 1.0) {
				var8 = var12;
			} else if (var0 * 3.0 < 2.0) {
				var8 = 6.0 * ((0.6666666666666666 - var0) * (var12 - var14)) + var14;
			} else {
				var8 = var14;
			}

			if (var20 * 6.0 < 1.0) {
				var10 = var14 + var20 * (6.0 * (var12 - var14));
			} else if (var20 * 2.0 < 1.0) {
				var10 = var12;
			} else if (3.0 * var20 < 2.0) {
				var10 = var14 + (var12 - var14) * (0.6666666666666666 - var20) * 6.0;
			} else {
				var10 = var14;
			}
		}

		int var22 = (int)(var6 * 256.0);
		int var13 = (int)(256.0 * var8);
		int var23 = (int)(var10 * 256.0);
		return var23 + (var13 << 8) + (var22 << 16);
	}
}
