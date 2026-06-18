import com.google.common.primitives.Doubles;
import java.io.EOFException;
import java.util.Iterator;
import net.runelite.api.Perspective;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("kf")
public class kf implements xm {
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -2009746737
	)
	int ah_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lkf;"
	)
	static kf az_fld = new kf(2);
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "[[I"
	)
	static int[][] aa_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lkf;"
	)
	static kf ak_fld = new kf(0);
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lkf;"
	)
	static kf ae_fld = new kf(4);
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lkf;"
	)
	static kf ag_fld = new kf(1);
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ar_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lkf;"
	)
	public static kf av_fld = new kf(3);

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int ah() {
		return this.ah_fld;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	@Override
	public int ag(int var1) {
		return this.ah_fld;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Llu;III)V"
	)
	static final void ag(lu var0, int var1, int var2, int var3) throws EOFException {
		up.br();
		kp var4 = lu.qv(var0, cf.cg_fld, false, 15790320);
		if (var4 != null) {
			yu.dg(var1, var2, var4.ak_fld + var1, var2 + var4.ag_fld);
			if (bx.ar_fld != 2 && 5 != bx.ar_fld) {
				if (var3 <= -1241937258) {
					return;
				}

				int var5 = client.js_fld & 2047;
				int var6 = client.nw_fld / 32 + 48;
				int var7 = 464 - client.nd_fld / 32;
				bx.aw_fld.br(var1, var2, var4.ak_fld, var4.ag_fld, var6, var7, var5, 256, var1, var2, var4.az_fld, var4.av_fld);

				for (int var8 = 0; var8 < bx.aa_fld; var8++) {
					int var9 = bx.ai_fld[var8] * 4 + 2 - client.nw_fld / 32;
					int var10 = 2 + 4 * bx.aq_fld[var8] - client.nd_fld / 32;
					ec.ah(var1, var2, var9, var10, var5, bx.am_fld[var8], var4);
				}

				gj.az(bw.dk_fld, var1, var2, var5, var4);
				ce.av(bw.dk_fld, var1, var2, var5, var4, 1446845849);
				dx var19 = bw.dk_fld;

				for (int var20 = 0; var20 < var19.ad_fld.az(); var20++) {
					if (var3 <= -1241937258) {
						return;
					}

					rg var25 = (rg)var19.an_fld.ak(yw.wk(var19.ad_fld, var20, (byte)78));
					if (var25 != null) {
						int var11 = var25.dp(-755274204) / 32 - client.nw_fld / 32;
						int var12 = var25.dj(189745805) / 32 - client.nd_fld / 32;
						yv var13 = var25.aw_fld.an(693675935);
						byte var14 = 1;
						if (!var25.av(-1393757046)) {
							ab.aw(var1, var2, var11, var12, var5, 2047 - rg.es(var25, -53338672) + 1024, var13, var4, var14);
							gj.az(var25.ah_fld, var1, var2, var5, var4);
							ce.av(var25.ah_fld, var1, var2, var5, var4, 2038136659);
							if_.ae(var25.ah_fld, var1, var2, var5, var4, (byte)20);
						}
					}
				}

				if_.ae(bw.dk_fld, var1, var2, var5, var4, (byte)-20);
				if (client.le_fld.ag() && client.dv_fld % 20 < 10) {
					int var21 = ku.jy(client.le_fld, -858871586);
					dx var26 = bw.dk_fld;
					if (1 == var21) {
						if (var3 <= -1241937258) {
							return;
						}

						int var38 = ku.ve(client.le_fld, 205903255);
						cx var43 = client.da_fld;
						Iterator var51 = var43.iterator();

						ds var32;
						while (true) {
							if (var51.hasNext()) {
								if (var3 <= -1241937258) {
									return;
								}

								dx var54 = (dx)(dx)var51.next();
								ds var57 = (ds)var54.ax_fld.ae(var38);
								if (null == var57) {
									continue;
								}

								var32 = var57;
								break;
							}

							var32 = null;
							break;
						}

						if (var32 != null) {
							ry.ay(da.lm(var32, (byte)-38), var32.bi_fld, var32.dm_fld, var1, var2, var5, ia.af_fld[1], var4, 1344406951);
						}
					} else if (var21 == 2) {
						dx var31 = client.da_fld.aw(client.le_fld.ay(1122789851), client.le_fld.az(), -2024303745);
						int var37 = kj.aw(client.le_fld.ay(1122789851) - var31.as_fld) + client.le_fld.ah();
						int var42 = kj.aw(client.le_fld.az() - var31.ay_fld) + client.le_fld.av();
						ry.ay(var31, var37, var42, var1, var2, var5, ia.af_fld[1], var4, -2121503089);
					} else if (3 != var21) {
						if (4 == var21) {
							int var30 = ku.ve(client.le_fld, 205903255);
							rg var36 = (rg)bw.dk_fld.an_fld.ak(var30);
							if (var36 != null) {
								ry.ay(bw.dk_fld, var36.dp(-1041570270), var36.dj(189745805), var1, var2, var5, ia.af_fld[1], var4, 1774204230);
							}
						}
					} else {
						int var35 = ku.ve(client.le_fld, 205903255);
						cx var41 = client.da_fld;
						cv var50 = null;
						Iterator var15 = var41.iterator();

						cv var29;
						while (true) {
							if (var15.hasNext()) {
								dx var16 = (dx)(dx)var15.next();
								cv var17 = (cv)var16.au_fld.ae(var35);
								if (null == var17) {
									continue;
								}

								if (var16.ak(-787091592)) {
									var50 = var17;
									continue;
								}

								var29 = var17;
								break;
							}

							var29 = var50;
							break;
						}

						if (null != var29) {
							ry.ay(da.lm(var29, (byte)9), var29.bi_fld, var29.dm_fld, var1, var2, var5, ia.af_fld[1], var4, -322217251);
						}
					}
				}

				if (0 != client.oq_fld) {
					int var22 = 2 + client.oq_fld - client.nw_fld / 32;
					int var27 = 2 + client.or_fld - client.nd_fld / 32;
					ec.ah(var1, var2, var22, var27, var5, ia.af_fld[0], var4);
				}

				if (client.da_fld.au(0, 979179641) == ss.az_fld && ia.af_fld.length >= 4) {
					if (var3 <= -1241937258) {
						return;
					}

					int var23 = var1 + var4.ak_fld / 2;
					int var28 = var2 + var4.ag_fld / 2;
					if (var4.ak(tj.ae_fld - var1, tj.ah_fld - var2)) {
						int var33 = ce.ga(var1, var2, var4);
						yv var39 = ia.af_fld[2];
						int var44 = var33 * 128;
						var44 += client.js_fld;
						var44 &= 2047;
						byte var52 = 30;
						int var55 = var23 - (int)(pw.az(var44) * var52);
						int var58 = var28 + (int)(hx.av(var44) * var52);
						int var60 = Math.max(var39.aw_fld, var39.ay_fld);
						int var18 = var60 / 2;
						var39.be(var55 - var18, var58 - var18, var39.aw_fld, var39.ay_fld, var39.aw_fld / 2, var39.ay_fld / 2, of.ak(var44), 256);
					}

					if (client.oz_fld > 0) {
						int var34 = client.op_fld;
						yv var40 = ia.af_fld[3];
						int var47 = var34 * 128;
						var47 += client.js_fld;
						var47 &= 2047;
						byte var53 = 30;
						int var56 = var23 - (int)(pw.az(var47) * var53);
						int var59 = var28 + (int)(hx.av(var47) * var53);
						int var61 = Math.max(var40.aw_fld, var40.ay_fld);
						int var62 = var61 / 2;
						var40.be(var56 - var62, var59 - var62, var40.aw_fld, var40.ay_fld, var40.aw_fld / 2, var40.ay_fld / 2, of.ak(var47), 256);
					}
				}

				cv var24 = ot.ef();
				if (var24 != null) {
					if (var3 <= -1241937258) {
						return;
					}

					if (!var24.at_fld) {
						yu.dj(var1 + var4.ak_fld / 2 + bx.ad_fld - 1, var2 + var4.ag_fld / 2 - bx.ao_fld - 1, 3, 3, 16777215);
					}
				}
			} else {
				yu.ei(var1, var2, 0, var4.az_fld, var4.av_fld);
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int ae() {
		return this.ah_fld;
	}

	kf(int var1) {
		this.ah_fld = var1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Llu;III)V"
	)
	public static final void af(lu var0, int var1, int var2) throws EOFException {
		if (bx.ar_fld == 0 || bx.ar_fld == 3) {
			if (!og.ci_fld.isMenuOpen()) {
				int var4 = tj.ay_fld;
				if (var4 == 0) {
					int var5 = client.ky_fld;
					if (client.oa_fld && var5 != 0) {
						boolean var6 = tj.ae_fld >= var1 && tj.ah_fld >= var2 && tj.ae_fld < var1 + var0.getWidth() && tj.ah_fld < var2 + var0.getHeight();
						if (var6) {
							double var7 = client.iq_fld + -var5 * 0.25;
							client.iq_fld = Doubles.constrainToRange(var7, 2.0, 8.0);
						}
					}
				} else {
					kp var19 = var0.dm(cf.cg_fld, true);
					if (var19 == null) {
						return;
					}

					int var20 = tj.as_fld - var1;
					int var22 = tj.ar_fld - var2;
					if (!var19.pd(var20, var22)) {
						return;
					}

					if (var4 == 1 || !gu.hh_fld && var4 == 4) {
						ss var8 = client.da_fld.of(-1);
						if (var8 == ss.ag_fld) {
							var20 -= var19.qh() / 2;
							var22 -= var19.cp() / 2;
							int var9 = client.js_fld & 2047;
							int var10 = Perspective.SINE[var9];
							int var11 = Perspective.COSINE[var9];
							int var12 = var11 * var20 + var10 * var22 >> 16;
							int var13 = var11 * var22 - var10 * var20 >> 16;
							float var14 = (float)client.iq_fld / 128.0F;
							int var15 = (int)(var12 / var14);
							int var16 = (int)(var13 / var14);
							int var17 = client.nw_fld + var15 >> 7;
							int var18 = client.nd_fld - var16 >> 7;
							client.um(var17, var18, var20, var22);
						} else if (var8 == ss.az_fld) {
							int var24 = var1 + var19.qh() / 2;
							int var25 = var2 + var19.cp() / 2;
							int var26 = tj.ae_fld - var24;
							int var27 = tj.ah_fld - var25;
							int var28 = client.gv(Math.atan2(var27, var26)) - 512;
							var28 -= client.js_fld;
							int var30 = (var28 + 64 & 2047) / 128;
							client.op_fld = var30;
							client.oz_fld = 30;
							client.kl_void(var30);
						}
					} else if (var4 == 2) {
						client.iq_fld = 4.0;
						tj.ay_fld = 0;
					}
				}
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int av() {
		return this.ah_fld;
	}
}
