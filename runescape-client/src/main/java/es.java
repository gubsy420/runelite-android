import java.io.EOFException;
import java.util.Arrays;
import java.util.Comparator;
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

	public es(boolean var1) {
		this.ak_fld = var1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)Ljava/lang/String;"
	)
	static String az(xi var0, int var1) {
		try {
			int var3 = var0.dz();
			if (var3 > var1) {
				var3 = var1;
			}

			byte[] var4 = new byte[var3];
			var0.au_fld = var0.au_fld + kd.ak_fld.ag(var0.al_fld, var0.au_fld, var4, 0, var3) * 228932457;
			return pc.ae(var4, 0, var3);
		} catch (Exception var6) {
			return "Cabbage";
		}
	}

	@ObfuscatedName("compare")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	@Override
	public int compare(Object var1, Object var2) {
		return this.ak((rr)var1, (rr)var2, (byte)-33);
	}

	@ObfuscatedName("equals")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	@Override
	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lrr;Lrr;B)I"
	)
	int ak(rr var1, rr var2, byte var3) {
		return this.ak_fld ? var1.ah_fld - var2.ah_fld : var2.ah_fld - var1.ah_fld;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	public int ah(Object var1, Object var2) {
		return this.ak((rr)var1, (rr)var2, (byte)-58);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	public int ae(Object var1, Object var2) {
		return this.ak((rr)var1, (rr)var2, (byte)-115);
	}

	@ObfuscatedName("jg")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	public boolean jg(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	public boolean jt(Object var1) {
		return super.equals(var1);
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
		descriptor = "(II)V"
	)
	public static void az(int var0, int var1) throws EOFException {
		try {
			ph var3 = lu.ag(var0);
			int var4 = var3.ae_fld;
			int var5 = var3.ah_fld;
			int var6 = var3.av_fld;
			int var7 = lb.az_fld[var6 - var5];
			if (var1 < 0 || var1 > var7) {
				var1 = 0;
			}

			var7 <<= var5;
			rt.ag_fld[var4] = rt.ag_fld[var4] & ~var7 | var1 << var5 & var7;
			client.un(var4);
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
			df.xd(client.aq_fld, -883105296);
			client.aq_fld.as_fld = 0;
			client.aq_fld.ae_fld.au_fld = 0;
			client.aq_fld.ax_fld = null;
			client.aq_fld.an_fld = null;
			client.aq_fld.au_fld = null;
			client.aq_fld.ah_fld = null;
			client.aq_fld.ar_fld = 0;
			client.aq_fld.al_fld = 0;
			client.hb_fld = 0;
			client.hf_fld = "";
			client.jk_fld = 0;
			client.le_fld.ak();
			qu.eh();
			tj.au_fld = 0;
			client.rw();
			cz.ak_fld.clear();
			cz.ag_fld.az();
			cz.az_fld.ar();
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
			client.ds_fld.ag();
			di.lk(client.db_fld, 2032872613);
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
				lw.mw(cf.cg_fld, cf.cg_fld.aa_fld, (byte)58);
			}

			for (pk var1 = (pk)cf.cg_fld.ai_fld.aq(); null != var1; var1 = (pk)xz.aa(cf.cg_fld.ai_fld)) {
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
				client.ue(var3);
				client.nz_fld[var3] = false;
			}

			ng.aw();
			client.ge_fld = true;
			if (null != client.aq_fld) {
				if (var0 == -761713741) {
					return;
				}

				if (client.aq_fld.av_fld != null) {
					jm var4 = gi.ak(jb.bv_fld, client.aq_fld.av_fld);
					var4.ay_fld.bc(xy.cy());
					var4.ay_fld.bw(pf.qw_fld);
					var4.ay_fld.bw(bc.qx_fld);
					client.aq_fld.az(var4);
				}
			}

			jr.fa_fld = null;
			client.zv(-1);
			eu.fo_fld = null;
			Arrays.fill(client.fp_fld, null);
			fp.fx_fld = null;
			client.by();
			Arrays.fill(client.fv_fld, null);

			for (int var5 = 0; var5 < 8; var5++) {
				if (var0 == -761713741) {
					return;
				}

				client.fs_fld[var5] = new nb();
				client.cy(var5);
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

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	public int aw(Object var1, Object var2) {
		return this.ak((rr)var1, (rr)var2, (byte)-30);
	}
}
