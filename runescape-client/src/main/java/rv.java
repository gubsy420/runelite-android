import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("rv")
public class rv {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int az_fld;

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lrs;Lcx;Lar;Lub;Lrm;Z)V"
	)
	public static void ag(rs var0, cx var1, ar var2, ub var3, rm var4, boolean var5) throws EOFException {
		int var6 = var4.ah((byte)-95);
		int var7 = var4.ae(-782441098);

		for (int var8 = 0; var8 < var0.ah(); var8++) {
			rj var9 = var0.ay(var8);
			var9.ae_fld--;
			if (var9.ae_fld < -10) {
				var0.av(var8);
				var8--;
			} else {
				af var10 = var9.ak_fld;
				if (null == var10) {
					int var11 = rl1.ei(var3, var9.aw_fld) - 1;
					var10 = af.ag(var3, var9.aw_fld, var11);
					if (var10 == null) {
						continue;
					}

					var9.ae_fld = var9.ae_fld + var10.ah() * 1324699929;
					var9.ak_fld = var10;
				}

				if (var9.ae_fld < 0) {
					int var34;
					if (var9.av_fld != 0) {
						int var12 = kj.aw(var9.av_fld & 0xFF);
						int var13 = var9.av_fld >> 16 & 0xFF;
						int var14 = var9.av_fld >> 8 & 0xFF;
						int var15 = var9.az_fld;
						dx var16 = var1.ae(var15, (byte)-68);
						tu var17 = mf.bn(var16, kj.aw(var13), kj.aw(var14));
						int var18 = kj.ay((int)var17.ay_fld);
						int var19 = kj.ay((int)var17.ar_fld);
						var17.ah();
						int var20 = client.nw_fld;
						int var22 = client.nd_fld;
						int var24 = Math.abs(kj.as(var18) - var20);
						int var25 = Math.abs(kj.as(var19) - var22);
						int var26 = Math.max(var25 + var24 - 128, 0);
						int var27 = Math.max(kj.aw((var9.ag_fld & 31) - 1), 0);
						rg var28 = dx.eg();
						rg var29 = var1.ay(var15, (byte)35);
						boolean var30 = var9.ay_fld;
						boolean var31;
						if (var29 == var28) {
							var31 = true;
						} else if (null == var29) {
							var31 = true;
						} else if (var28 == null) {
							var31 = false;
						} else {
							var31 = var30;
						}

						if (var26 >= var12 || !var31) {
							var9.ae_fld = 673993276;
							continue;
						}

						float var33 = var27 < var12 ? Math.min(Math.max((float)(var12 - var26) / (var12 - var27), 0.0F), 1.0F) : 1.0F;
						var34 = (int)Math.ceil(var33 * var7);
					} else {
						var34 = var6;
					}

					if (var34 > 0) {
						al var35 = var10.ae(var5);
						ac var36 = ac.az(var35, 100, var34);
						if (null != var36) {
							var36.bm(var9.ah_fld - 1);
							var2.ax(var36);
						}
					}

					var9.ae_fld = 673993276;
				}
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lrs;Lcx;Lar;Lub;Lrm;Z)V"
	)
	public static void az(rs var0, cx var1, ar var2, ub var3, rm var4, boolean var5) throws EOFException {
		int var6 = var4.ah((byte)-61);
		int var7 = var4.ae(498225312);

		for (int var8 = 0; var8 < var0.ah(); var8++) {
			rj var9 = var0.ay(var8);
			var9.ae_fld--;
			if (var9.ae_fld < -10) {
				var0.av(var8);
				var8--;
			} else {
				af var10 = var9.ak_fld;
				if (null == var10) {
					int var11 = rl1.ei(var3, var9.aw_fld) - 1;
					var10 = af.ag(var3, -1999964060 * var9.aw_fld, var11);
					if (var10 == null) {
						continue;
					}

					var9.ae_fld = var9.ae_fld + var10.ah() * 1324699929;
					var9.ak_fld = var10;
				}

				if (var9.ae_fld * -1612732067 < 0) {
					int var34;
					if (var9.av_fld != 0) {
						int var12 = kj.aw(var9.av_fld & 0xFF);
						int var13 = var9.av_fld >> 16 & -1241809776;
						int var14 = var9.av_fld >> 8 & 1108131945;
						int var15 = var9.az_fld * -967111977;
						dx var16 = var1.ae(var15, (byte)-117);
						tu var17 = mf.bn(var16, kj.aw(var13), kj.aw(var14));
						int var18 = kj.ay((int)var17.ay_fld);
						int var19 = kj.ay((int)var17.ar_fld);
						var17.ah();
						int var20 = client.nw_fld;
						int var22 = client.nd_fld;
						int var24 = Math.abs(kj.as(var18) - var20);
						int var25 = Math.abs(kj.as(var19) - var22);
						int var26 = Math.max(var25 + var24 - 128, 0);
						int var27 = Math.max(kj.aw((var9.ag_fld & -147069750) - 1), 0);
						rg var28 = dx.eg();
						rg var29 = var1.ay(var15, (byte)3);
						boolean var30 = var9.ay_fld;
						boolean var31;
						if (var29 == var28) {
							var31 = true;
						} else if (null == var29) {
							var31 = true;
						} else if (var28 == null) {
							var31 = false;
						} else {
							var31 = var30;
						}

						if (var26 >= var12 || !var31) {
							var9.ae_fld = 673993276;
							continue;
						}

						float var33 = var27 < var12 ? Math.min(Math.max((float)(var12 - var26) / (var12 - var27), 0.0F), 1.0F) : 1.0F;
						var34 = (int)Math.ceil(var33 * var7);
					} else {
						var34 = var6;
					}

					if (var34 > 0) {
						al var35 = var10.ae(var5);
						ac var36 = ac.az(var35, -204102309, var34);
						if (null != var36) {
							var36.bm(var9.ah_fld - 1);
							var2.ax(var36);
						}
					}

					var9.ae_fld = -395831121;
				}
			}
		}
	}

	rv() throws Throwable {
		throw new Error();
	}
}
