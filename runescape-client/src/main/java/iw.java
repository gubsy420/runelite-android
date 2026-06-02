import net.runelite.api.NodeCache;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("iw")
@Implements({"NodeCache"})
public class iw implements NodeCache {
	@ObfuscatedName("xx")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int xx_fld;
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	public float bf_fld = 0.0F;
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

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lvc;J)V"
	)
	public void az(vc var1, long var2) {
		if (this.az_fld == 0) {
			vc var4 = this.ae_fld.av();
			var4.gy_void();
			var4.mq_void();
			if (var4 == this.ak_fld) {
				var4 = this.ae_fld.av();
				var4.gy_void();
				var4.mq_void();
			}
		} else {
			this.az_fld--;
		}

		this.av_fld.ag(var1, var2);
		this.ae_fld.az(var1);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void au() {
		this.xx_fld = this.ag_fld;
	}

	@ObfuscatedName("qa")
	@ObfuscatedSignature(
		descriptor = "(Lgf;)I"
	)
	public static int qa(gf var0) {
		return var0.ay_fld.av_fld * -1683164347;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(J)Lvc;"
	)
	public vc ak(long var1) {
		vc var3 = (vc)this.av_fld.ak(var1);
		if (var3 != null) {
			this.ae_fld.az(var3);
		}

		return var3;
	}

	@ObfuscatedName("ya")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void ya(int var1) {
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

	@ObfuscatedName("nk")
	@ObfuscatedSignature(
		descriptor = "(Lvc;J)V"
	)
	public void nk(vc var1, long var2) {
		this.az(var1, var2);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(J)V"
	)
	public void ar(long var1) {
		vc var3 = (vc)this.av_fld.ak(var1);
		if (var3 != null) {
			var3.gy_void();
			var3.mq_void();
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
			this.ae_fld.az(var3);
		}

		return var3;
	}

	@ObfuscatedName("rx")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Liw;)V"
	)
	public static void rx(String var0, iw var1) {
		synchronized (var1) {
			iw var3 = var1;
			boolean var4 = var3.pu();
			var3.bf_fld = var3.bf_fld * 0.92F + (var4 ? 0.07999998F : 0.0F);
			if (var4) {
				if (var3.bf_fld > 0.2F) {
					client.ii_fld.trace("cache {} is thrashing", var0);
				}

				if (var3.bf_fld > 0.9F && var3.ag_fld < var3.xx_fld * 8) {
					var3.ya(var3.ag_fld * 2);
					client.ii_fld.info("cache {} thrashing, enlarging to {} entries", var0, var3.ag_fld);
				}
			}

			var3.ae_fld.fh(var3.ak_fld);
		}
	}

	@ObfuscatedName("vs")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public static void vs() {
		rx("EnumDefinition_cached", os.ar_fld);
		rx("animPoseCache", ol.bm_fld);
		rx("animationCache", ol.aj_fld);
		rx("animayaPoses", ol.bd_fld);
		rx("dbRowConfigCache", yl.ag_fld);
		rx("dbTableConfigCache", yg.ag_fld);
		rx("dbTableIndexCache", client.kp_fld);
		rx("field4288", ne.ak_fld);
		rx("field4291", om.ak_fld);
		rx("field4310", ox.ab_fld);
		rx("field4340", ou.ak_fld);
		rx("field4348", ok.ak_fld);
		rx("field4350", ow.ak_fld);
		rx("field4369", oz.ak_fld);
		rx("field4394", ot.ax_fld);
		rx("field4413", oy.ap_fld);
		rx("field4666", oa.ak_fld);
		rx("field4670", oi.ak_fld);
		rx("field4682", pc.az_fld);
		rx("field4695", pq.ag_fld);
		rx("field4725", pr.ak_fld);
		rx("field4803", pn.ah_fld);
		rx("field4826", pu.ak_fld);
		rx("field4840", pt.ak_fld);
		rx("field4864", py.af_fld);
		rx("field913", client.kj_fld);
		rx("healthBarCache", pa.ae_fld);
		rx("healthBarSpriteCache", pa.ah_fld);
		rx("hitsplatCompCache", py.as_fld);
		rx("hitsplatFontCache", py.ar_fld);
		rx("identKits", nn.ak_fld);
		rx("inventoryCache", ny.av_fld);
		rx("itemModelCache", og.dd_fld);
		rx("itemSpriteCache", og.dl_fld);
		rx("items", og.do_fld);
		rx("npcModelCache", pp.cr_fld);
		rx("npcs", pp.cn_fld);
		rx("objModelCacheSpawn", oe.cp_fld);
		rx("objModelDataCache", oe.cv_fld);
		rx("objects", oe.cq_fld);
		rx("overlays", ov.ay_fld);
		rx("paramCompositionCache", px.ae_fld);
		rx("playerModelCache", lp.aw_fld);
		rx("scriptCache", ba.ak_fld);
		rx("spotanimModelCache", ot.au_fld);
		rx("structCompositionCache", pw.ag_fld);
		rx("underlays", pl.ag_fld);
		rx("varbits", ph.az_fld);
		rx("varplayers", oh.ae_fld);
		rx("worldEntitySpriteCache", oy.bt_fld);
	}

	@ObfuscatedName("vh")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void vh() {
		this.ae_fld.ar();
		this.av_fld.az();
		this.ak_fld = new vc();
		this.az_fld = this.ag_fld;
		this.hk();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(J)Lvc;"
	)
	public vc ae(long var1) {
		vc var3 = (vc)this.av_fld.ak(var1);
		if (var3 != null) {
			this.ae_fld.az(var3);
		}

		return var3;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void bh(int var1) {
		this.ya(var1);
		this.xx_fld = this.ag_fld;
	}

	@ObfuscatedName("wt")
	@ObfuscatedSignature(
		descriptor = "(Liw;J)V"
	)
	public static void wt(iw var0, long var1) {
		vc var3 = (vc)var0.av_fld.ak(var1);
		if (var3 != null) {
			var3.gy_void();
			var3.mq_void();
			var0.az_fld++;
		}
	}

	public iw(int var1) {
		this.ag_fld = var1;
		this.az_fld = var1;
		byte var2 = 1;

		while (var2 + var2 < var1) {
			var2 += var2;
		}

		this.av_fld = new xv(var2);
		this.au();
	}

	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "(J)Lvc;"
	)
	public vc de(long var1) {
		return this.ak(var1);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lvc;J)V"
	)
	public void al(vc var1, long var2) {
		if (this.az_fld == 0) {
			vc var4 = this.ae_fld.av();
			var4.gy_void();
			var4.mq_void();
			if (var4 == this.ak_fld) {
				var4 = this.ae_fld.av();
				var4.gy_void();
				var4.mq_void();
			}
		} else {
			this.az_fld--;
		}

		this.av_fld.ag(var1, var2);
		this.ae_fld.az(var1);
	}

	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void hk() {
		this.bf_fld = 0.0F;
		this.ae_fld.fh(this.ak_fld);
	}

	@ObfuscatedName("pu")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean pu() {
		return this.az_fld <= 0 && this.ak_fld.hx_vc() == null;
	}

	@ObfuscatedName("reset")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Override
	public void reset() {
		this.vh();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(J)Lvc;"
	)
	public vc ay(long var1) {
		vc var3 = (vc)this.av_fld.ak(var1);
		if (var3 != null) {
			this.ae_fld.az(var3);
		}

		return var3;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(J)Lvc;"
	)
	public vc ah(long var1) {
		vc var3 = (vc)this.av_fld.ak(var1);
		if (var3 != null) {
			this.ae_fld.az(var3);
		}

		return var3;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lvc;J)V"
	)
	public void af(vc var1, long var2) {
		if (this.az_fld == 0) {
			vc var4 = this.ae_fld.av();
			var4.gy_void();
			var4.mq_void();
			if (var4 == this.ak_fld) {
				var4 = this.ae_fld.av();
				var4.gy_void();
				var4.mq_void();
			}
		} else {
			this.az_fld--;
		}

		this.av_fld.ag(var1, var2);
		this.ae_fld.az(var1);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(J)V"
	)
	public void ag(long var1) {
		vc var3 = (vc)this.av_fld.ak(var1);
		if (var3 != null) {
			var3.gy_void();
			var3.mq_void();
			this.az_fld++;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void av() {
		this.ae_fld.ar();
		this.av_fld.az();
		this.ak_fld = new vc();
		this.az_fld = this.ag_fld;
	}
}
