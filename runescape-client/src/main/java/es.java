import java.io.EOFException;
import java.util.Arrays;
import java.util.Comparator;
import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("es")
public class es implements Comparator {
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int as_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int az_fld;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ar_fld;
	@ObfuscatedName("gp")
	@ObfuscatedSignature(
		descriptor = "Lju;"
	)
	static ju gp_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean ak_fld;

	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "(Les;Lrr;Lrr;B)I"
	)
	public static int dl(es var0, rr var1, rr var2, byte var3) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.ak_fld ? var1.ah_fld - var2.ah_fld : var2.ah_fld - var1.ah_fld;
		}
	}

	public es(boolean var1) {
		this.ak_fld = var1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lxi;II)Ljava/lang/String;"
	)
	static String az(xi var0, int var1) {
		try {
			int var3 = var0.dz();
			if (var3 > var1) {
				var3 = var1;
			}

			byte[] var4 = new byte[var3];
			var0.au_fld = var0.au_fld + kq.rb(kd.ak_fld, var0.al_fld, var0.au_fld, var4, 0, var3) * 228932457;
			return pc.ae(var4, 0, var3);
		} catch (Exception var6) {
			return "Cabbage";
		}
	}

	@ObfuscatedName("kj")
	@ObfuscatedSignature(
		descriptor = "(Log;ILjava/lang/String;)Ljava/lang/String;"
	)
	public static String kj(og var0, int var1, String var2) {
		return ih.av(var0.ey_fld, var1, var2);
	}

	@ObfuscatedName("compare")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	@Override
	public int compare(Object var1, Object var2) {
		return dl(this, (rr)var1, (rr)var2, (byte)-33);
	}

	@ObfuscatedName("equals")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	@Export("equals")
	@Override
	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	public boolean jt(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("im")
	@ObfuscatedSignature(
		descriptor = "(Ltl;Lts;I)V"
	)
	public static void im(tl var0, ts var1, int var2) {
		var0.az_fld[var2] = var1;
	}

	@ObfuscatedName("jm")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	public boolean jm(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public static void az(int var0, int var1) throws EOFException {
		try {
			ph var3 = lu.ag(var0, 1425659899);
			int var4 = var3.av_fld;
			int var5 = var3.ae_fld;
			int var6 = var3.ah_fld;
			int var7 = lb.az_fld[var6 - var5];
			if (var1 < 0 || var1 > var7) {
				var1 = 0;
			}

			var7 <<= var5;
			rt.ag_fld[var4] = rt.ag_fld[var4] & ~var7 | var1 << var5 & var7;
			client.sc(var4);
		} catch (Throwable var8) {
			throw new RuntimeException(var8);
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	static void ad(int var0) throws EOFException {
		try {
			client.gx_fld = 7204152881265977L;
			if (gz.gb_fld != null) {
				gz.gb_fld.az_fld = 0;
			}

			hd.qt_fld = true;
			client.hp_fld = true;
			client.kz_fld = 6367152160194799937L;
			lj.ak();
			client.appletStub.ak(-883105296);
			client.appletStub.af_fld = 0;
			client.appletStub.ae_fld.au_fld = 0;
			client.appletStub.ah_fld = null;
			client.appletStub.au_fld = null;
			client.appletStub.ax_fld = null;
			client.appletStub.an_fld = null;
			client.appletStub.aw_fld = 0;
			client.appletStub.as_fld = 0;
			client.hb_fld = 0;
			client.hf_fld = "";
			client.jk_fld = 0;
			ku.qn(client.le_fld, (byte)83);
			qu.eh();
			tj.au_fld = 0;
			client.vq();
			cz.ak_fld.clear();
			xv.aa(cz.ag_fld);
			km.ts(cz.az_fld);
			cz.av_fld = 0;
			client.ee_fld = 0;
			client.nk_fld = false;
			ah.kw_fld.ae();
			client.js_fld = 0;
			client.dg_fld = 0;
			fs.gh_fld = null;
			bx.ar_fld = 0;
			bx.an_fld = 177233865;
			client.oq_fld = 0;
			client.or_fld = 0;
			client.lb_fld = ca.av_fld;
			client.lw_fld = ca.av_fld;
			client.da_fld.an((byte)82);
			client.es_fld = 0;
			na.mh(client.ds_fld);
			client.db_fld.an();
			la.fq_fld.af();
			nr.av();
			if (null != ob.ek_fld) {
				if (var0 == -761713741) {
					return;
				}

				ob.ek_fld.aw(735758763);
			}

			client.kl_fld = -1515799147;
			if (cf.cg_fld.aa_fld != -1) {
				lw.dn(cf.cg_fld, cf.cg_fld.aa_fld, (byte)58);
			}

			for (pk var1 = (pk)cf.cg_fld.an_fld.av(); null != var1; var1 = (pk)cf.cg_fld.an_fld.ae()) {
				if (var0 == -761713741) {
					return;
				}

				cd.cw_fld.az(var1, true, cf.cg_fld);
			}

			cf.cg_fld.aa();
			qu.eh();
			client.ca_fld.az(null, null, new int[]{0, 0, 0, 0, 0}, 0, -1, 1462745962);

			for (int var3 = 0; var3 < 8; var3++) {
				client.nl_fld[var3] = null;
				client.vp(var3);
				client.nz_fld[var3] = false;
			}

			ng.aw();
			client.ge_fld = true;
			if (null != client.appletStub) {
				if (var0 == -761713741) {
					return;
				}

				if (client.appletStub.av_fld != null) {
					jm var4 = gi.ak(jb.bv_fld, client.appletStub.av_fld);
					var4.ay_fld.ea(xy.cy());
					xi.vy(var4.ay_fld, pf.qw_fld);
					xi.vy(var4.ay_fld, bc.qx_fld);
					client.appletStub.az(var4);
				}
			}

			jr.fa_fld = null;
			client.xo(-1);
			eu.fo_fld = null;
			Arrays.fill(client.fp_fld, null);
			fp.fx_fld = null;
			client.rd(-1);
			Arrays.fill(client.fv_fld, null);

			for (int var5 = 0; var5 < 8; var5++) {
				if (var0 == -761713741) {
					return;
				}

				client.fs_fld[var5] = new nb();
				client.zf(var5);
			}

			ue.fu_fld = null;
			client.fl_fld = 0;
			client.fg_fld = 0;
			client.fn_fld = 0;
			client.ft_fld = 0;
			og.ci_fld.ags(true, -2114388439);
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lrr;Lrr;B)I"
	)
	int ak(rr var1, rr var2, byte var3) {
		return this.ak_fld ? var1.aw_fld - var2.ae_fld : var2.ae_fld - var1.ae_fld;
	}

	@ObfuscatedName("zi")
	@ObfuscatedSignature(
		descriptor = "(Les;Ljava/lang/Object;)Z"
	)
	public static boolean zi(es var0, Object var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.equals(var1);
		}
	}

	@ObfuscatedName("pt")
	@ObfuscatedSignature(
		descriptor = "(Loo;I)I"
	)
	public static int pt(oo var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var1 == 0 ? 2026738091 * var0.ar_fld : var0.aw_fld;
		}
	}

	@ObfuscatedName("jg")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	public boolean jg(Object var1) {
		return super.equals(var1);
	}
}
