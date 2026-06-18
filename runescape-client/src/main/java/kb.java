import java.io.EOFException;
import java.net.MalformedURLException;
import java.net.URL;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("kb")
public class kb {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lyv;"
	)
	yv ag_fld;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bj_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	dj ak_fld;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int al_fld;

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)Lpx;"
	)
	public static px ag_px(int var0, int var1) throws EOFException {
		px var2 = (px)px.ae_fld.ak(var0);
		if (null != var2) {
			return var2;
		} else {
			byte[] var3 = ed.av_fld.bb(11, var0, 584982574);
			var2 = new px();
			if (null != var3) {
				var2.ae(new xi(var3));
			}

			var2.av();
			px.ae_fld.az(var2, var0);
			return var2;
		}
	}

	kb(dj var1) {
		this.ak_fld = var1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Lyv;"
	)
	yv ak() {
		if (this.ag_fld == null && null != this.ak_fld && this.ak_fld.ak()) {
			if (this.ak_fld.ag() != null) {
				this.ag_fld = qd.ak(this.ak_fld.ag());
			}

			this.ak_fld = null;
		}

		return this.ag_fld;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()Lyv;"
	)
	yv ag() {
		if (this.ag_fld == null && null != this.ak_fld && this.ak_fld.ak()) {
			if (this.ak_fld.ag() != null) {
				this.ag_fld = qd.ak(this.ak_fld.ag());
			}

			this.ak_fld = null;
		}

		return this.ag_fld;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()Lyv;"
	)
	yv az() {
		if (this.ag_fld == null && null != this.ak_fld && this.ak_fld.ak()) {
			if (this.ak_fld.ag() != null) {
				this.ag_fld = qd.ak(this.ak_fld.ag());
			}

			this.ak_fld = null;
		}

		return this.ag_fld;
	}

	kb(String var1, de var2) {
		try {
			this.ak_fld = var2.as(new URL(var1), (byte)82);
		} catch (MalformedURLException var4) {
			this.ak_fld = null;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()Lyv;"
	)
	yv ah() {
		if (this.ag_fld == null && null != this.ak_fld && this.ak_fld.ak()) {
			if (this.ak_fld.ag() != null) {
				this.ag_fld = qd.ak(this.ak_fld.ag());
			}

			this.ak_fld = null;
		}

		return this.ag_fld;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)Log;"
	)
	public static og ag(int var0, int var1) throws EOFException {
		og var2 = (og)og.do_fld.ak(var0);
		if (null != var2) {
			return var2;
		} else {
			byte[] var3 = ce.dt_fld.bb(10, var0, 584982574);
			var2 = new og();
			var2.da_fld = var0;
			if (var3 != null) {
				var2.ah(new xi(var3), 82289904);
			}

			og.hh(var2, 1771536038);
			if (-1 != var2.eg_fld) {
				var2.ay(ag(var2.eg_fld, -1752383175), ag(var2.en_fld, -1752383175), (byte)-13);
			}

			if (-1 != var2.ej_fld) {
				var2.as(ag(var2.ej_fld, -1752383175), ag(var2.eu_fld, -1752383175), -776631127);
			}

			if (-1 != var2.fa_fld) {
				og.mw(var2, ag(var2.fa_fld, -1752383175), ag(var2.fy_fld, -1752383175), (byte)54);
			}

			if (!ux.dq_fld && var2.et_fld) {
				if (-1 == var2.eg_fld && var2.ej_fld == -1 && var2.fa_fld == -1) {
					var2.dx_fld = var2.dx_fld + kh.aa_fld;
				}

				var2.ds_fld = kh.ai_fld;
				var2.eh_fld = false;
				var2.em_fld = false;
				var2.ew_fld.at(-382953070);
				var2.ew_fld.ad(2, kh.am_fld, 454599448);

				for (int var4 = 0; var4 < var2.ex_fld.length; var4++) {
					if (4 != var4) {
						if (null != var2.eo_fld) {
							var2.eo_fld[var4] = null;
						}

						var2.ex_fld[var4] = null;
					}
				}

				var2.fo_fld = -2133468910;
				var2.ea_fld = 0;
				var2.ec_fld = -1910353587;
				if (null != var2.ey_fld) {
					boolean var8 = false;

					for (vw var5 = eb.kn(var2.ey_fld); null != var5; var5 = var2.ey_fld.ae()) {
						px var6 = ag_px((int)var5.hc_long, -147159662);
						if (var6.ar_fld) {
							var5.gy();
						} else {
							var8 = true;
						}
					}

					if (!var8) {
						var2.ey_fld = null;
					}
				}
			}

			og.do_fld.az(var2, var0);
			return var2;
		}
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(Lkb;)Lyv;"
	)
	public static yv cx(kb var0) {
		if (var0.ag_fld == null && null != var0.ak_fld && var0.ak_fld.ak()) {
			if (var0.ak_fld.ag() != null) {
				var0.ag_fld = qd.ak(var0.ak_fld.ag());
			}

			var0.ak_fld = null;
		}

		return var0.ag_fld;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()Lyv;"
	)
	yv ae() {
		if (this.ag_fld == null && null != this.ak_fld && this.ak_fld.ak()) {
			if (this.ak_fld.ag() != null) {
				this.ag_fld = qd.ak(this.ak_fld.ag());
			}

			this.ak_fld = null;
		}

		return this.ag_fld;
	}
}
