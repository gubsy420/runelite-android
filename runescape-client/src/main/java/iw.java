import net.runelite.api.NodeCache;
import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("iw")
@Implements({"NodeCache"})
public class iw implements NodeCache {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lxv;"
	)
	xv av_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ag_fld;
	@ObfuscatedName("od")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int od_fld;
	@ObfuscatedName("ux")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	public float ux_fld = 0.0F;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int az_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lvc;"
	)
	vc ak_fld = new vc();
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lnj;"
	)
	nj ae_fld = new nj();

	@ObfuscatedName("nt")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void nt(int var1) {
		if (var1 > this.ag_fld) {
			byte var2 = 1;

			while (var2 < var1) {
				var2 += var2;
			}

			this.ag_fld = var2;
			this.reset();
			this.av_fld = new xv(var2);
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lvc;J)V"
	)
	public void az(vc var1, long var2) {
		if (this.az_fld == 0) {
			vc var4 = this.ae_fld.av();
			var4.gy();
			var4.vi();
			if (var4 == this.ak_fld) {
				var4 = this.ae_fld.av();
				var4.gy();
				var4.vi();
			}
		} else {
			this.az_fld--;
		}

		this.av_fld.ag(var1, var2);
		this.ae_fld.jr(var1);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(J)Lvc;"
	)
	public vc ak(long var1) {
		vc var3 = (vc)this.av_fld.ak(var1);
		if (var3 != null) {
			this.ae_fld.jr(var3);
		}

		return var3;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(J)V"
	)
	public void ar(long var1) {
		vc var3 = (vc)this.av_fld.ak(var1);
		if (var3 != null) {
			var3.gy();
			var3.vi();
			this.az_fld++;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(J)Lvc;"
	)
	public vc aw(long var1) {
		vc var3 = (vc)this.av_fld.ak(var1);
		if (var3 != null) {
			this.ae_fld.jr(var3);
		}

		return var3;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void av() {
		km.ts(this.ae_fld);
		xv.aa(this.av_fld);
		this.ak_fld = new vc();
		this.az_fld = this.ag_fld;
		this.sp();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(J)Lvc;"
	)
	public vc ae(long var1) {
		vc var3 = (vc)this.av_fld.ak(var1);
		if (var3 != null) {
			this.ae_fld.jr(var3);
		}

		return var3;
	}

	@ObfuscatedName("reset")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Export("reset")
	@Override
	public void reset() {
		this.av();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lvc;J)V"
	)
	public void at(vc var1, long var2) {
		this.az(var1, var2);
	}

	public iw(int var1) {
		this.ag_fld = var1;
		this.az_fld = var1;
		byte var2 = 1;

		while (var2 + var2 < var1) {
			var2 += var2;
		}

		this.av_fld = new xv(var2);
		this.co();
	}

	@ObfuscatedName("oc")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void oc(int var1) {
		this.nt(var1);
		this.od_fld = this.ag_fld;
	}

	@ObfuscatedName("jc")
	@ObfuscatedSignature(
		descriptor = "(Lgf;)I"
	)
	public static int jc(gf var0) {
		return -1291504879 * var0.ay_fld.ag_fld;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lvc;J)V"
	)
	public void al(vc var1, long var2) {
		if (this.az_fld == 0) {
			vc var4 = this.ae_fld.av();
			var4.gy();
			var4.vi();
			if (var4 == this.ak_fld) {
				var4 = this.ae_fld.av();
				var4.gy();
				var4.vi();
			}
		} else {
			this.az_fld--;
		}

		this.av_fld.ag(var1, var2);
		this.ae_fld.jr(var1);
	}

	@ObfuscatedName("ot")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Liw;)V"
	)
	public static void ot(String var0, iw var1) {
		synchronized (var1) {
			iw var3 = var1;
			boolean var4 = var3.mc();
			var3.ux_fld = var3.ux_fld * 0.92F + (var4 ? 0.07999998F : 0.0F);
			if (var4) {
				if (var3.ux_fld > 0.2F) {
					client.logger.trace("cache {} is thrashing", var0);
				}

				if (var3.ux_fld > 0.9F && var3.ag_fld < var3.od_fld * 8) {
					var3.nt(var3.ag_fld * 2);
					client.logger.info("cache {} thrashing, enlarging to {} entries", var0, var3.ag_fld);
				}
			}

			var3.ae_fld.al(var3.ak_fld);
		}
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void co() {
		this.od_fld = this.ag_fld;
	}

	@ObfuscatedName("sp")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void sp() {
		this.ux_fld = 0.0F;
		this.ae_fld.al(this.ak_fld);
	}

	@ObfuscatedName("wn")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public static void wn() {
		ot("EnumDefinition_cached", os.ar_fld);
		ot("animPoseCache", ol.bm_fld);
		ot("animationCache", ol.aj_fld);
		ot("animayaPoses", ol.bd_fld);
		ot("dbRowConfigCache", yl.ag_fld);
		ot("dbTableConfigCache", yg.ag_fld);
		ot("dbTableIndexCache", client.kp_iw);
		ot("field4288", ne.ak_fld);
		ot("field4291", om.ak_fld);
		ot("field4310", ox.ab_fld);
		ot("field4340", ou.ak_fld);
		ot("field4348", ok.ak_fld);
		ot("field4350", ow.ak_fld);
		ot("field4369", oz.ak_fld);
		ot("field4394", ot.ax_fld);
		ot("field4413", oy.ap_fld);
		ot("field4666", oa.ak_fld);
		ot("field4670", oi.ak_fld);
		ot("field4682", pc.az_fld);
		ot("field4695", pq.ag_fld);
		ot("field4725", pr.ak_fld);
		ot("field4803", pn.ah_fld);
		ot("field4826", pu.ak_fld);
		ot("field4840", pt.ak_fld);
		ot("field4864", py.af_fld);
		ot("field913", client.kj_fld);
		ot("healthBarCache", pa.ae_fld);
		ot("healthBarSpriteCache", pa.ah_fld);
		ot("hitsplatCompCache", py.as_fld);
		ot("hitsplatFontCache", py.ar_fld);
		ot("identKits", nn.ak_fld);
		ot("inventoryCache", ny.av_fld);
		ot("itemModelCache", og.dd_fld);
		ot("itemSpriteCache", og.dl_fld);
		ot("items", og.do_fld);
		ot("npcModelCache", pp.cr_fld);
		ot("npcs", pp.cn_fld);
		ot("objModelCacheSpawn", oe.cp_fld);
		ot("objModelDataCache", oe.cv_fld);
		ot("objects", oe.cq_fld);
		ot("overlays", ov.ay_fld);
		ot("paramCompositionCache", px.ae_fld);
		ot("playerModelCache", lp.aw_fld);
		ot("scriptCache", ba.ak_fld);
		ot("spotanimModelCache", ot.au_fld);
		ot("structCompositionCache", pw.ag_fld);
		ot("underlays", pl.ag_fld);
		ot("varbits", ph.az_fld);
		ot("varplayers", oh.ae_fld);
		ot("worldEntitySpriteCache", oy.bt_fld);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(J)Lvc;"
	)
	public vc ay(long var1) {
		vc var3 = (vc)this.av_fld.ak(var1);
		if (var3 != null) {
			this.ae_fld.jr(var3);
		}

		return var3;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(J)Lvc;"
	)
	public vc bs(long var1) {
		return this.ak(var1);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(J)V"
	)
	public void as(long var1) {
		vc var3 = (vc)this.av_fld.ak(var1);
		if (var3 != null) {
			var3.gy();
			var3.vi();
			this.az_fld++;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(J)Lvc;"
	)
	public vc ah(long var1) {
		vc var3 = (vc)this.av_fld.ak(var1);
		if (var3 != null) {
			this.ae_fld.jr(var3);
		}

		return var3;
	}

	@ObfuscatedName("mc")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean mc() {
		return this.az_fld <= 0 && this.ak_fld.kd_vc() == null;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lvc;J)V"
	)
	public void af(vc var1, long var2) {
		if (this.az_fld == 0) {
			vc var4 = this.ae_fld.av();
			var4.gy();
			var4.vi();
			if (var4 == this.ak_fld) {
				var4 = this.ae_fld.av();
				var4.gy();
				var4.vi();
			}
		} else {
			this.az_fld--;
		}

		this.av_fld.ag(var1, var2);
		this.ae_fld.jr(var1);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(J)V"
	)
	public void ag(long var1) {
		vc var3 = (vc)this.av_fld.ak(var1);
		if (var3 != null) {
			var3.gy();
			var3.vi();
			this.az_fld++;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void au() {
		km.ts(this.ae_fld);
		xv.aa(this.av_fld);
		this.ak_fld = new vc();
		this.az_fld = this.ag_fld;
	}
}
