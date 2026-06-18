import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("ft")
public class ft {
	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int cr_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1
	)
	int ag_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1
	)
	int az_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 2097477823
	)
	int av_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1850800183
	)
	int ak_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ae_fld;

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "([I[JIIB)V"
	)
	public static void aw(int[] var0, long[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var5 = (var3 + var2) / 2;
			int var6 = var2;
			int var7 = var0[var5];
			var0[var5] = var0[var3];
			var0[var3] = var7;
			long var8 = var1[var5];
			var1[var5] = var1[var3];
			var1[var3] = var8;
			int var10 = Integer.MAX_VALUE == var7 ? 0 : 1;

			for (int var11 = var2; var11 < var3; var11++) {
				if (var0[var11] < (var11 & var10) + var7) {
					int var12 = var0[var11];
					var0[var11] = var0[var6];
					var0[var6] = var12;
					long var13 = var1[var11];
					var1[var11] = var1[var6];
					var1[var6++] = var13;
				}
			}

			var0[var3] = var0[var6];
			var0[var6] = var7;
			var1[var3] = var1[var6];
			var1[var6] = var8;
			aw(var0, var1, var2, var6 - 1);
			aw(var0, var1, 1 + var6, var3);
		}
	}

	ft() {
	}

	@ObfuscatedName("tn")
	@ObfuscatedSignature(
		descriptor = "(Laax;)Z"
	)
	public static boolean tn(aax var0) {
		return null != var0.ak_fld;
	}

	@ObfuscatedName("va")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int va() {
		return this.ag_fld;
	}

	@ObfuscatedName("ij")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ij() {
		return this.ak_fld;
	}

	@ObfuscatedName("mc")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int mc() {
		return this.av_fld;
	}

	ft(ft var1) {
		this.ak_fld = 1 * var1.ak_fld;
		this.ag_fld = var1.ag_fld;
		this.az_fld = var1.az_fld;
		this.av_fld = 1 * var1.av_fld;
	}

	@ObfuscatedName("uv")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int uv() {
		return this.az_fld;
	}

	@ObfuscatedName("fx")
	@ObfuscatedSignature(
		descriptor = "(Lxf;IIIIIIS)V"
	)
	static void fx(xf var0, int var1, int var2, int var3, int var4, int var5, int var6, short var7) {
		if (9 == var3) {
			int var8 = var4 & 65535;
			ds var9 = (ds)var0.ae(var8);
			if (var9 != null) {
				client.ml_fld = var5;
				client.mw_fld = var6;
				client.mp_fld = -652374910;
				client.mn_fld = 0;
				client.oq_fld = var1;
				client.or_fld = var2;
				int var10 = var4 >> 16;
				jm var11 = gi.ak(jb.ed_fld, client.appletStub.av_fld);
				xj var10000 = var11.ay_fld;
				byte var10001;
				if (client.ej_fld.as(82)) {
					if (var7 == 222) {
						return;
					}

					var10001 = 1;
				} else {
					var10001 = 0;
				}

				var10000.cx(var10001);
				var11.ay_fld.cx(var10);
				var11.ay_fld.ca(var8);
				client.appletStub.az(var11);
			}
		}

		if (var3 == 10) {
			int var12 = var4 & 65535;
			ds var16 = (ds)var0.ae(var12);
			if (null != var16) {
				if (var7 == 222) {
					return;
				}

				client.ml_fld = var5;
				client.mw_fld = var6;
				client.mp_fld = -652374910;
				client.mn_fld = 0;
				client.oq_fld = var1;
				client.or_fld = var2;
				int var20 = var4 >> 16;
				jm var24 = gi.ak(jb.cr_fld, client.appletStub.av_fld);
				var24.ay_fld.ea(var20);
				var24.ay_fld.ba(var12);
				xj var28 = var24.ay_fld;
				byte var29;
				if (client.ej_fld.as(82)) {
					if (var7 == 222) {
						return;
					}

					var29 = 1;
				} else {
					var29 = 0;
				}

				var28.cx(var29);
				client.appletStub.az(var24);
			}
		}

		if (var3 == 11) {
			int var13 = var4 & 65535;
			ds var17 = (ds)var0.ae(var13);
			if (var17 != null) {
				client.ml_fld = var5;
				client.mw_fld = var6;
				client.mp_fld = -652374910;
				client.mn_fld = 0;
				client.oq_fld = var1;
				client.or_fld = var2;
				int var21 = var4 >> 16;
				jm var25 = gi.ak(jb.ax_fld, client.appletStub.av_fld);
				var25.ay_fld.ea(client.ej_fld.as(82) ? 1 : 0);
				var25.ay_fld.bq(var21);
				var25.ay_fld.ca(var13);
				client.appletStub.az(var25);
			}
		}

		if (12 == var3) {
			int var14 = var4 & 65535;
			ds var18 = (ds)var0.ae(var14);
			if (var18 != null) {
				client.ml_fld = var5;
				client.mw_fld = var6;
				client.mp_fld = -652374910;
				client.mn_fld = 0;
				client.oq_fld = var1;
				client.or_fld = var2;
				int var22 = var4 >> 16;
				jm var26 = gi.ak(jb.cs_fld, client.appletStub.av_fld);
				var26.ay_fld.bq(client.ej_fld.as(82) ? 1 : 0);
				var26.ay_fld.ca(var14);
				var26.ay_fld.di(var22);
				client.appletStub.az(var26);
			}
		}

		if (var3 == 13) {
			int var15 = var4 & 65535;
			ds var19 = (ds)var0.ae(var15);
			if (null != var19) {
				client.ml_fld = var5;
				client.mw_fld = var6;
				client.mp_fld = -652374910;
				client.mn_fld = 0;
				client.oq_fld = var1;
				client.or_fld = var2;
				int var23 = var4 >> 16;
				jm var27 = gi.ak(jb.ah_fld, client.appletStub.av_fld);
				var27.ay_fld.ea(var23);
				var27.ay_fld.ba(var15);
				var27.ay_fld.ea(client.ej_fld.as(82) ? 1 : 0);
				client.appletStub.az(var27);
			}
		}
	}
}
