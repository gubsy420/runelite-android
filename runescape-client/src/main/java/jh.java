import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("jh")
public class jh {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int aq_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ag_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ae_fld;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ar_fld;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int au_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ah_fld;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ax_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ay_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ak_fld;
	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int cr_fld;

	jh() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("rj")
	@ObfuscatedSignature(
		descriptor = "(Lpp;II)I"
	)
	public static int rj(pp var0, int var1, int var2) {
		return my.ag(var0.ep_fld, var1, var2);
	}

	@ObfuscatedName("qi")
	@ObfuscatedSignature(
		descriptor = "(Lev;)Z"
	)
	public static boolean qi(ev var0) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.bq_fld && var0.bv_fld != -1;
		}
	}

	@ObfuscatedName("fp")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIII)V"
	)
	static void fp(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		if (var2 == 3) {
			if (var8 >= -701431569) {
				return;
			}

			client.ml_fld = var4;
			client.mw_fld = var5;
			client.mp_fld = -652374910;
			client.mn_fld = 0;
			client.oq_fld = var0;
			client.or_fld = var1;
			int var9 = var3 & 65535;
			int var10 = var3 >> 16;
			jm var11 = gi.ak(jb.af_fld, client.appletStub.av_fld);
			var11.ay_fld.ca(var9);
			var11.ay_fld.bq(var10);
			var11.ay_fld.ba(var6 + var0);
			var11.ay_fld.bq(client.ej_fld.as(82) ? 1 : 0);
			var11.ay_fld.ca(var7 + var1);
			client.appletStub.az(var11);
		}

		if (4 == var2) {
			if (var8 >= -701431569) {
				return;
			}

			client.ml_fld = var4;
			client.mw_fld = var5;
			client.mp_fld = -652374910;
			client.mn_fld = 0;
			client.oq_fld = var0;
			client.or_fld = var1;
			int var12 = var3 & 65535;
			int var16 = var3 >> 16;
			jm var20 = gi.ak(jb.ce_fld, client.appletStub.av_fld);
			var20.ay_fld.ba(var6 + var0);
			xi.vy(var20.ay_fld, var12);
			xj var10000 = var20.ay_fld;
			byte var10001;
			if (client.ej_fld.as(82)) {
				if (var8 >= -701431569) {
					return;
				}

				var10001 = 1;
			} else {
				var10001 = 0;
			}

			var10000.ea(var10001);
			var20.ay_fld.di(var16);
			var20.ay_fld.ca(var7 + var1);
			client.appletStub.az(var20);
		}

		if (var2 == 5) {
			client.ml_fld = var4;
			client.mw_fld = var5;
			client.mp_fld = -652374910;
			client.mn_fld = 0;
			client.oq_fld = var0;
			client.or_fld = var1;
			int var13 = var3 & 65535;
			int var17 = var3 >> 16;
			jm var21 = gi.ak(jb.cb_fld, client.appletStub.av_fld);
			var21.ay_fld.ek(var13);
			var21.ay_fld.bq(var17);
			var21.ay_fld.ba(var0 + var6);
			var21.ay_fld.ba(var1 + var7);
			var21.ay_fld.bq(client.ej_fld.as(82) ? 1 : 0);
			client.appletStub.az(var21);
		}

		if (var2 == 6) {
			if (var8 >= -701431569) {
				return;
			}

			client.ml_fld = var4;
			client.mw_fld = var5;
			client.mp_fld = -652374910;
			client.mn_fld = 0;
			client.oq_fld = var0;
			client.or_fld = var1;
			int var14 = var3 & 65535;
			int var18 = var3 >> 16;
			jm var22 = gi.ak(jb.dd_fld, client.appletStub.av_fld);
			var22.ay_fld.ca(var6 + var0);
			var22.ay_fld.ca(var7 + var1);
			var22.ay_fld.di(var18);
			xi.vy(var22.ay_fld, var14);
			xj var24 = var22.ay_fld;
			byte var25;
			if (client.ej_fld.as(82)) {
				if (var8 >= -701431569) {
					return;
				}

				var25 = 1;
			} else {
				var25 = 0;
			}

			var24.cx(var25);
			client.appletStub.az(var22);
		}

		if (1001 == var2) {
			client.ml_fld = var4;
			client.mw_fld = var5;
			client.mp_fld = -652374910;
			client.mn_fld = 0;
			client.oq_fld = var0;
			client.or_fld = var1;
			int var15 = var3 & 65535;
			int var19 = var3 >> 16;
			jm var23 = gi.ak(jb.bk_fld, client.appletStub.av_fld);
			var23.ay_fld.ca(var7 + var1);
			var23.ay_fld.ek(var15);
			var23.ay_fld.ca(var6 + var0);
			var23.ay_fld.ea(client.ej_fld.as(82) ? 1 : 0);
			var23.ay_fld.di(var19);
			client.appletStub.az(var23);
		}
	}
}
