import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("ke")
public class ke {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ak_fld;
	@ObfuscatedName("lq")
	@ObfuscatedSignature(
		descriptor = "Lxc;"
	)
	static xc lq_fld;
	@ObfuscatedGetter(
		intValue = -1223221893
	)
	@ObfuscatedName("jd")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int jd_fld;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	static String ai_fld;
	@ObfuscatedName("ew")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ew_fld;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int au_fld;

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ldx;Lxj;B)V"
	)
	static void ak(dx var0, xj var1, byte var2) throws EOFException {
		int var3 = var1.cg();
		if (var3 < var0.am_fld.az()) {
			for (int var4 = var3; var4 < var0.am_fld.az(); var4++) {
				int var5 = var0.am_fld.ag(var4);
				dx var6 = client.da_fld.ae(var5, (byte)-77);
				if (null != var6) {
					for (int var7 = 0; var7 < client.db_fld.al_fld; var7++) {
						int var8 = client.db_fld.az_fld[var7];
						client.db_fld.ax((cv)var6.au_fld.ak(var8));
					}

					client.da_fld.az(var5, 380808478);
				}

				rg var20 = (rg)var0.an_fld.ak(var5);
				if (var20 != null) {
					var20.gy_void();
				}
			}
		}

		if (var3 > var0.am_fld.az()) {
			throw new RuntimeException("");
		} else {
			var0.am_fld.av();
			gu var17 = new gu();

			for (int var18 = 0; var18 < var3; var18++) {
				int var21 = var0.am_fld.ag(var18);
				rg var23 = (rg)var0.an_fld.ak(var21);
				int var25 = var1.cg();
				if (0 != var25) {
					var0.am_fld.ak(var21);
					if (1 != var25) {
						var17.ay(var23.aw((byte)4));
						byte var27 = xi.rp(var1, -604401982);
						if (0 == var27) {
							if (var2 == 1) {
								client.jm(var0, var1);
								return;
							}
						} else {
							int var30 = ea.ag(var1, var27, 0);
							int var32 = ea.ag(var1, var27, 2);
							int var12 = ea.ag(var1, var27, 4);
							int var13 = ea.ag(var1, var27, 6);
							var17.al(var30, var32, var12, var13);
						}

						if (2 == var25) {
							rg.nd(var23, var0, var17, (byte)123);
						} else {
							var23.ad(var17, (byte)5);
						}
					}

					int var28 = var1.cg();
					hf.ag(var23, var1, var28, (byte)0);
				} else {
					dx var9 = client.da_fld.ae(var21, (byte)-35);
					if (null != var9) {
						for (int var10 = 0; var10 < client.db_fld.al_fld; var10++) {
							if (var2 == 1) {
								client.jm(var0, var1);
								return;
							}

							int var11 = client.db_fld.az_fld[var10];
							client.db_fld.ax((cv)var9.au_fld.ak(var11));
						}

						client.da_fld.az(var21, -1482713849);
					}

					if (null != var23) {
						var23.gy_void();
					}
				}
			}

			while (var1.au(client.aq_fld.ar_fld, 1504865599) > 0) {
				if (var2 == 1) {
					client.jm(var0, var1);
					return;
				}

				int var19 = xi.tx(var1, 1845221079);
				int var22 = var1.df();
				int var24 = var1.ec();
				int var26 = xi.uk(var1, 1898450231);
				int var29 = var1.cg();
				var0.am_fld.ak(var19);
				int var31 = var29 >> 4 & 15;
				int var33 = var29 & 15;
				int var34 = 8 * var31;
				int var35 = var33 * 8;
				dx var14 = client.da_fld.ag(var19, var34, var35, cn.ka(cx.kq_fld, (byte)1), er.ag_fld, (byte)91);
				rg var16 = new rg(var19, var14);
				var0.an_fld.ag(var16, var19);
				var16.ae_fld = var19;
				var16.ar_fld = var0.ag_fld * 1735854709;
				rg.ok(var16, hh.ag(var24), -1990535069);
				dp.ak(var1, var16.av_fld, 0, 0);
				rg.nd(var16, var0, var16.av_fld, (byte)97);
				var16.af((ko)ka.ak(ek.ak_Arrko(1148375399), var26), (byte)4);
				hf.ag(var16, var1, var22, (byte)0);
			}

			client.jm(var0, var1);
		}
	}

	ke() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	static int az(int var0, int var1) {
		return 128 * fa.as_fld[var0] + (var1 << 7);
	}
}
