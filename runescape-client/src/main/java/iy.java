import java.awt.event.WindowEvent;
import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("iy")
public class iy extends ho {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "B"
	)
	byte ag_fld;
	@ObfuscatedGetter(
		intValue = -1504482711
	)
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ak_fld;
	@ObfuscatedGetter(
		intValue = -1927577727
	)
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int az_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	String av_fld;
	// $VF: synthetic field
	@ObfuscatedName("this$0")
	@ObfuscatedSignature(
		descriptor = "Lhm;"
	)
	hm this$0;

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lib;)V"
	)
	@Override
	void ay(ib var1) {
		hx var2 = (hx)(hx)var1.ak_fld.get(this.ak_fld);
		var2.ak_fld = this.ag_fld;
		var2.ag_fld = this.az_fld;
		var2.az_fld = new aax(this.av_fld);
	}

	@ObfuscatedName("gj")
	@ObfuscatedSignature(
		descriptor = "(Luc;F)V"
	)
	public static void gj(uc var0, float var1) {
		if (var0 == null) {
			var0.getClass();
		}

		float var2 = (float)Math.cos(var1);
		float var3 = (float)Math.sin(var1);
		float var4 = var0.ak_fld;
		float var5 = var0.av_fld;
		float var6 = var0.aw_fld;
		float var7 = var0.ar_fld;
		var0.ak_fld = var3 * var0.az_fld + var4 * var2;
		var0.az_fld = var0.az_fld * var2 - var3 * var4;
		var0.av_fld = var5 * var2 + var0.ah_fld * var3;
		var0.ah_fld = var0.ah_fld * var2 - var3 * var5;
		var0.aw_fld = var3 * var0.as_fld + var6 * var2;
		var0.as_fld = var2 * var0.as_fld - var3 * var6;
		var0.ar_fld = var7 * var2 + var3 * var0.al_fld;
		var0.al_fld = var0.al_fld * var2 - var3 * var7;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	@Override
	void ak(xi var1, int var2) {
		this.ak_fld = xi.tx(var1, 715847347);
		this.ag_fld = xi.rp(var1, 946415111);
		this.az_fld = xi.tx(var1, 2085302509) * -1252647239;
		xi.ob(var1, -558446584);
		this.av_fld = xi.kc(var1, -72389201);
	}

	@ObfuscatedName("sv")
	@ObfuscatedSignature(
		descriptor = "(Ltf;Ljava/awt/event/WindowEvent;)V"
	)
	public static void sv(tf var0, WindowEvent var1) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			} else {
				var0.destroy();
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lib;B)V"
	)
	@Override
	void ag(ib var1, byte var2) {
		hx var3 = (hx)(hx)var1.ak_fld.get(this.ak_fld);
		var3.ak_fld = this.ag_fld;
		var3.ag_fld = this.az_fld;
		var3.az_fld = new aax(this.av_fld);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	void ae(xi var1) {
		this.ak_fld = xi.tx(var1, 1931848724);
		this.ag_fld = xi.rp(var1, 1420583815);
		this.az_fld = xi.tx(var1, 836600235) * -1252647239;
		xi.ob(var1, 980915430);
		this.av_fld = xi.kc(var1, 1610361376);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	void az(xi var1) {
		this.ak_fld = xi.tx(var1, 1713987036) * -1569383984;
		this.ag_fld = xi.rp(var1, 1590241682);
		this.az_fld = xi.tx(var1, 2106503600) * 2018067841;
		xi.ob(var1, -1036790430);
		this.av_fld = xi.kc(var1, -1922392821);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lib;)V"
	)
	@Override
	void ah(ib var1) {
		hx var2 = (hx)(hx)var1.ak_fld.get(this.ak_fld);
		var2.ak_fld = this.ag_fld;
		var2.ag_fld = 1009719580 * this.az_fld;
		var2.az_fld = new aax(this.av_fld);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lrs;Lcx;Lar;Lub;Lrm;ZI)V"
	)
	public static void ak(rs var0, cx var1, ar var2, ub var3, rm var4, boolean var5, int var6) throws EOFException {
		try {
			int var7 = var4.ah((byte)-102);
			int var8 = var4.ae(309792422);

			for (int var9 = 0; var9 < var0.ah(); var9++) {
				rj var10 = var0.ay(var9);
				var10.ae_fld--;
				if (var10.ae_fld < -10) {
					var0.av(var9);
					var9--;
				} else {
					af var11 = var10.ak_fld;
					if (null == var11) {
						if (var6 == 1729870373) {
							return;
						}

						int var12 = rl1.ei(var3, var10.aw_fld) - 1;
						var11 = af.ag(var3, var10.aw_fld, var12);
						if (var11 == null) {
							continue;
						}

						var10.ae_fld = var10.ae_fld + var11.ah() * 1324699929;
						var10.ak_fld = var11;
					}

					if (var10.ae_fld < 0) {
						label164: {
							int var36;
							if (var10.av_fld != 0) {
								if (var6 == 1729870373) {
									return;
								}

								int var13 = kj.aw(var10.av_fld & 0xFF);
								int var14 = var10.av_fld >> 16 & 0xFF;
								int var15 = var10.av_fld >> 8 & 0xFF;
								int var16 = var10.az_fld;
								dx var17 = var1.ae(var16, (byte)-109);
								tu var18 = mf.bn(var17, kj.aw(var14), kj.aw(var15));
								int var19 = kj.ay((int)var18.ay_fld);
								int var20 = kj.ay((int)var18.ar_fld);
								var18.ah();
								int var21 = client.nw_fld;
								int var23 = client.nd_fld;
								int var25 = Math.abs(kj.as(var19) - var21);
								int var26 = Math.abs(kj.as(var20) - var23);
								int var27 = Math.max(var26 + var25 - 128, 0);
								int var28 = Math.max(kj.aw((var10.ag_fld & 31) - 1), 0);
								rg var29 = dx.eg();
								rg var30 = var1.ay(var16, (byte)14);
								boolean var31 = var10.ay_fld;
								boolean var32;
								if (var30 == var29) {
									var32 = true;
								} else if (null == var30) {
									var32 = true;
								} else if (var29 == null) {
									var32 = false;
								} else {
									var32 = var31;
								}

								if (var27 >= var13) {
									break label164;
								}

								if (!var32) {
									if (var6 == 1729870373) {
										return;
									}
									break label164;
								}

								float var34 = var28 < var13 ? Math.min(Math.max((float)(var13 - var27) / (var13 - var28), 0.0F), 1.0F) : 1.0F;
								var36 = (int)Math.ceil(var34 * var8);
							} else {
								var36 = var7;
							}

							if (var36 > 0) {
								al var37 = var11.ae(var5);
								ac var38 = ac.az(var37, 100, var36);
								if (null != var38) {
									var38.bm(var10.ah_fld - 1);
									var2.ax(var38);
								}
							}

							var10.ae_fld = 673993276;
							continue;
						}

						var10.ae_fld = 673993276;
					}
				}
			}
		} catch (Throwable var35) {
			throw new RuntimeException(var35);
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lib;)V"
	)
	@Override
	void aw(ib var1) {
		hx var2 = (hx)(hx)var1.ak_fld.get(this.ak_fld);
		var2.ak_fld = this.ag_fld;
		var2.ag_fld = this.az_fld;
		var2.az_fld = new aax(this.av_fld);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public static void ak(int var0) {
		lb.ak_fld = new int[var0];
		rt.ag_fld = new int[var0];
		client.un(-1);
	}

	iy(hm var1) {
		this.this$0 = var1;
		this.ak_fld = -1646839257;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	void av(xi var1) {
		this.ak_fld = xi.tx(var1, 601499523);
		this.ag_fld = xi.rp(var1, 371653895);
		this.az_fld = xi.tx(var1, 1956361293) * -1252647239;
		xi.ob(var1, -447341437);
		this.av_fld = xi.kc(var1, -260381580);
	}
}
