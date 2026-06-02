import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("zl")
public class zl implements qy {
	@ObfuscatedGetter(
		intValue = 1054648031
	)
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int az_fld;
	@ObfuscatedGetter(
		intValue = -1168198235
	)
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ag_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lrs;"
	)
	rs ae_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean av_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ldx;"
	)
	dx ak_fld;

	@ObfuscatedName("na")
	@ObfuscatedSignature(
		descriptor = "(Ldx;IIZ)V"
	)
	public void na(dx var1, int var2, int var3, boolean var4) {
		this.av(var1, var2, var3, var4);
	}

	@ObfuscatedName("wz")
	@ObfuscatedSignature(
		descriptor = "(Lzl;)V"
	)
	public static void wz(zl var0) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.ak_fld = null;
		}
	}

	public zl(rs var1) {
		this.ae_fld = var1;
	}

	@ObfuscatedName("gn")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void gn() {
		this.ae(2084058832);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lol;II)V"
	)
	@Override
	public void ak(ol var1, int var2, int var3) {
		if (this.ak_fld != null) {
			if (this.ae_fld.aw()) {
				if (var3 != 65280) {
					;
				}
			} else {
				if (var1.be_fld != null) {
					if (var1.be_fld.containsKey(var2)) {
						ArrayList var4 = (ArrayList)(ArrayList)var1.be_fld.get(var2);
						if (var4.isEmpty()) {
							return;
						}

						int var5 = 0;
						if (var4.size() > 1) {
							int var6 = 1 + (int)(Math.random() * 100.0);
							int var7 = 0;

							for (Iterator var8 = var4.iterator(); var8.hasNext(); var5++) {
								oc var9 = (oc)(oc)var8.next();
								int var10 = var7;
								var7 += var9.ag_fld;
								if (var10 <= var6 && var6 < var7) {
									break;
								}
							}

							if (var5 >= var4.size()) {
								return;
							}
						}

						oc var11 = (oc)(oc)var4.get(var5);
						if (null == var11) {
							return;
						}

						if (0 == var11.av_fld) {
							if (!this.av_fld) {
								return;
							}

							this.ae_fld.az(this.ak_fld.ag_fld * 1674941469, var11.ak_fld, 0, 0, 0, var11.ae_fld, var11.az_fld, 0, var1.bg_fld, -2012354349);
						} else {
							int var12 = kj.ay(this.ag_fld - 64);
							int var13 = kj.ay(this.az_fld - 64);
							this.ae_fld.az(1674941469 * this.ak_fld.ag_fld, var11.ak_fld, var12, var13, var11.av_fld, var11.ae_fld, var11.az_fld, 0, var1.bg_fld, -2134698688);
						}

						return;
					}

					if (var3 == 65280) {
						return;
					}
				}
			}
		}
	}

	@ObfuscatedName("qr")
	@ObfuscatedSignature(
		descriptor = "(Lzl;Ldx;IIZ)V"
	)
	public static void qr(zl var0, dx var1, int var2, int var3, boolean var4) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.ak_fld = var1;
			var0.ag_fld = var2;
			var0.az_fld = var3;
			var0.av_fld = var4;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lol;I)V"
	)
	@Override
	public void ag(ol var1, int var2) {
		if (this.ak_fld != null) {
			if (!this.ae_fld.aw()) {
				if (var1.be_fld != null && var1.be_fld.containsKey(var2)) {
					ArrayList var3 = (ArrayList)(ArrayList)var1.be_fld.get(var2);
					if (!var3.isEmpty()) {
						int var4 = 0;
						if (var3.size() > 1) {
							int var5 = 1 + (int)(Math.random() * 100.0);
							int var6 = 0;

							for (Iterator var7 = var3.iterator(); var7.hasNext(); var4++) {
								oc var8 = (oc)(oc)var7.next();
								int var9 = var6;
								var6 += var8.ag_fld;
								if (var9 <= var5 && var5 < var6) {
									break;
								}
							}

							if (var4 >= var3.size()) {
								return;
							}
						}

						oc var10 = (oc)(oc)var3.get(var4);
						if (null != var10) {
							if (0 == var10.av_fld) {
								if (!this.av_fld) {
									return;
								}

								this.ae_fld
									.az(
										this.ak_fld.ag_fld * 941216394, var10.ak_fld * -1064100865, 0, 0, 0, var10.ae_fld * 847478089, var10.az_fld * -814571402, 0, var1.bg_fld, -2062450034
									);
							} else {
								int var11 = kj.ay(this.ag_fld - 64);
								int var12 = kj.ay(this.az_fld - 64);
								this.ae_fld
									.az(
										565668740 * this.ak_fld.ag_fld,
										var10.ak_fld,
										var11,
										var12,
										var10.av_fld * -10087765,
										-1968995013 * var10.ae_fld,
										var10.az_fld,
										0,
										var1.bg_fld,
										-2050301767
									);
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void ae(int var1) {
		this.ak_fld = null;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ldx;IIZ)V"
	)
	public void av(dx var1, int var2, int var3, boolean var4) {
		this.ak_fld = var1;
		this.ag_fld = var2;
		this.az_fld = var3;
		this.av_fld = var4;
	}

	@ObfuscatedName("gk")
	@ObfuscatedSignature(
		descriptor = "(Lzv;Ljava/lang/String;IIIII)V"
	)
	public static void gk(zv var0, String var1, int var2, int var3, int var4, int var5, int var6) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var1 != null) {
			zv.es(var0, var4, var5);
			zv.ao_fld.setSeed(var6);
			zv.as_fld = 192 + (zv.ao_fld.nextInt() & 31);
			int[] var7 = new int[var1.length()];
			int var8 = 0;

			for (int var9 = 0; var9 < var1.length(); var9++) {
				var7[var9] = var8;
				if ((zv.ao_fld.nextInt() & 3) == 0) {
					var8++;
				}
			}

			zv.xy(var0, var1, var2, var3, null, var7, null);
		}
	}

	@ObfuscatedName("rr")
	@ObfuscatedSignature(
		descriptor = "(Lzv;Ljava/lang/String;IIII)V"
	)
	public static void rr(zv var0, String var1, int var2, int var3, int var4, int var5) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var1 != null) {
			zv.es(var0, var4, var5);
			var0.bl(var1, var2 - var0.an(var1), var3);
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ldx;IIZ)V"
	)
	public void aw(dx var1, int var2, int var3, boolean var4) {
		this.ak_fld = var1;
		this.ag_fld = var2;
		this.az_fld = var3;
		this.av_fld = var4;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lol;I)V"
	)
	@Override
	public void az(ol var1, int var2) {
		if (this.ak_fld != null) {
			if (!this.ae_fld.aw()) {
				if (var1.be_fld != null && var1.be_fld.containsKey(var2)) {
					ArrayList var3 = (ArrayList)(ArrayList)var1.be_fld.get(var2);
					if (!var3.isEmpty()) {
						int var4 = 0;
						if (var3.size() > 1) {
							int var5 = 1 + (int)(Math.random() * 100.0);
							int var6 = 0;

							for (Iterator var7 = var3.iterator(); var7.hasNext(); var4++) {
								oc var8 = (oc)(oc)var7.next();
								int var9 = var6;
								var6 += var8.ag_fld;
								if (var9 <= var5 && var5 < var6) {
									break;
								}
							}

							if (var4 >= var3.size()) {
								return;
							}
						}

						oc var10 = (oc)(oc)var3.get(var4);
						if (null != var10) {
							if (0 == var10.av_fld) {
								if (!this.av_fld) {
									return;
								}

								this.ae_fld.az(this.ak_fld.ag_fld * 1674941469, var10.ak_fld, 0, 0, 0, var10.ae_fld, var10.az_fld, 0, var1.bg_fld, -2011876124);
							} else {
								int var11 = kj.ay(this.ag_fld - 64);
								int var12 = kj.ay(this.az_fld - 64);
								this.ae_fld.az(1674941469 * this.ak_fld.ag_fld, var10.ak_fld, var11, var12, var10.av_fld, var10.ae_fld, var10.az_fld, 0, var1.bg_fld, -1652932454);
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("qv")
	@ObfuscatedSignature(
		descriptor = "(Lol;I)V"
	)
	@Override
	public void qv(ol var1, int var2) {
		this.ak(var1, var2, -411593668);
	}
}
