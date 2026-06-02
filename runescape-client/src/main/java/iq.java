import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("iq")
public class iq extends ht {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int av_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "B"
	)
	byte ag_fld;
	// $VF: synthetic field
	@ObfuscatedName("this$0")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	ia this$0;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	public static ub al_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ay_fld;
	@ObfuscatedGetter(
		intValue = 1604909687
	)
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ak_fld;

	iq(ia var1) {
		this.this$0 = var1;
		this.ak_fld = -302710599;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	@Override
	void ak(xi var1, int var2) {
		this.ak_fld = xi.tx(var1, 1523572380);
		this.ag_fld = xi.rp(var1, 184670630);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lik;I)V"
	)
	@Override
	void ag(ik var1, int var2) {
		var1.al(this.ak_fld, this.ag_fld, -1949796543);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	void az(xi var1) {
		this.ak_fld = xi.tx(var1, 338158561);
		this.ag_fld = xi.rp(var1, 843972179);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	void av(xi var1) {
		this.ak_fld = xi.tx(var1, 715593425);
		this.ag_fld = xi.rp(var1, -1778134812);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	void ae(xi var1) {
		this.ak_fld = xi.tx(var1, 559066526) * -191131443;
		this.ag_fld = xi.rp(var1, 1540044675);
	}

	@ObfuscatedName("ys")
	@ObfuscatedSignature(
		descriptor = "(Lwh;)Lzm;"
	)
	public static zm ys(wh var0) {
		return var0.ay_fld;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lik;)V"
	)
	@Override
	void ah(ik var1) {
		var1.al(this.ak_fld * 2006232961, this.ag_fld, -1804310208);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lik;)V"
	)
	@Override
	void aw(ik var1) {
		var1.al(this.ak_fld, this.ag_fld, -1501576003);
	}

	@ObfuscatedName("xu")
	@ObfuscatedSignature(
		descriptor = "(Lyv;IIIIIIDI)V"
	)
	public static void xu(yv var0, int var1, int var2, int var3, int var4, int var5, int var6, double var7, int var9) {
		if (var0 == null) {
			var0.getClass();
		} else {
			try {
				if (var7 < Math.PI / 2 || var7 > Math.PI * 3.0 / 2.0) {
					if (yv.au_fld % 2 != 0) {
						var5++;
					}

					if (yv.ax_fld % 2 != 0) {
						var6++;
					}
				}

				int var10 = -var3 / 2;
				int var11 = -var4 / 2;
				int var12 = (int)(Math.sin(var7) * 65536.0);
				int var13 = (int)(Math.cos(var7) * 65536.0);
				var12 = (int)(((long)var12 << 8) / var9);
				var13 = (int)(((long)var13 << 8) / var9);
				int var14 = (var5 << 16) + var11 * var12 + var10 * var13;
				int var15 = (var6 << 16) + (var11 * var13 - var10 * var12);
				int var16 = var1 + var2 * yv.au_fld;

				for (int var26 = 0; var26 < var4; var26++) {
					int var17 = var16;
					int var18 = var14;
					int var19 = var15;

					for (int var25 = -var3; var25 < 0; var25++) {
						int var20 = var18 >> 16;
						int var21 = var19 >> 16;
						if (var20 >= 0 && var20 < var0.aw_fld && var21 >= 0 && var21 < var0.ay_fld) {
							int var22 = var20 + var21 * var0.aw_fld;
							if (var22 >= 0 && var22 < var0.ah_fld.length) {
								int var23 = var0.ah_fld[var22];
								if (var23 != 0) {
									yv.al_fld[var17] = var23;
								}
							}
						}

						var17++;
						var18 += var13;
						var19 -= var12;
					}

					var14 += var12;
					var15 += var13;
					var16 += yv.au_fld;
				}
			} catch (Exception var24) {
			}
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lik;)V"
	)
	@Override
	void ay(ik var1) {
		var1.al(this.ak_fld, this.ag_fld, -1256467402);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()Lfi;"
	)
	public static fi ay() {
		return client.ej_fld;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	static int ag(int var0) {
		return (var0 >> 7) + 1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lub;)V"
	)
	public static void ak(ub var0) {
		yg.ak_fld = var0;
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)I"
	)
	public static int bu(String var0) {
		return var0.length() + 1;
	}
}
