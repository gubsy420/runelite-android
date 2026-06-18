import java.util.concurrent.ThreadFactory;
import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("sh")
class sh implements ThreadFactory {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Runnable;)Ljava/lang/Thread;"
	)
	public Thread ak(Runnable var1) {
		return new Thread(var1, "OSRS Maya Anim Load");
	}

	@ObfuscatedName("gi")
	@ObfuscatedSignature(
		descriptor = "(Lsh;Ljava/lang/Runnable;)Ljava/lang/Thread;"
	)
	public static Thread gi(sh var0, Runnable var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return new Thread(var1, "OSRS Maya Anim Load");
		}
	}

	@ObfuscatedName("kt")
	@ObfuscatedSignature(
		descriptor = "(Lli;)I"
	)
	public static int kt(li var0) {
		return var0.bf_fld;
	}

	@ObfuscatedName("sx")
	@ObfuscatedSignature(
		descriptor = "(Lsh;Ljava/lang/Runnable;)Ljava/lang/Thread;"
	)
	public static Thread sx(sh var0, Runnable var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return new Thread(var1, "OSRS Maya Anim Load");
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Runnable;)Ljava/lang/Thread;"
	)
	public Thread ae(Runnable var1) {
		return new Thread(var1, "OSRS Maya Anim Load");
	}

	sh() {
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Runnable;)Ljava/lang/Thread;"
	)
	public Thread az(Runnable var1) {
		return new Thread(var1, "OSRS Maya Anim Load");
	}

	@ObfuscatedName("newThread")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Runnable;)Ljava/lang/Thread;"
	)
	@Export("newThread")
	@Override
	public Thread newThread(Runnable var1) {
		return new Thread(var1, "OSRS Maya Anim Load");
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(FFFB)Ltu;"
	)
	public static tu ak(float var0, float var1, float var2) {
		synchronized (tu.ae_fld) {
			if (0 == tu.aw_fld) {
				return new tu(var0, var1, var2);
			} else {
				tu.fh(tu.ae_fld[(tu.aw_fld -= 1568129921) * 234126465], var0, var1, var2, (byte)-50);
				return tu.ae_fld[tu.aw_fld];
			}
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "([FIFZFZ[FI)I"
	)
	public static int ak(float[] var0, int var1, float var2, boolean var3, float var4, boolean var5, float[] var6) {
		float var8 = 0.0F;

		for (int var9 = 0; var9 < 1 + var1; var9++) {
			var8 += Math.abs(var0[var9]);
		}

		float var22 = (Math.abs(var2) + Math.abs(var4)) * (1 + var1) * sa.av_fld;
		if (var8 <= var22) {
			return -1;
		} else {
			float[] var10 = new float[var1 + 1];

			for (int var11 = 0; var11 < 1 + var1; var11++) {
				var10[var11] = var0[var11] * (1.0F / var8);
			}

			while (Math.abs(var10[var1]) < var22) {
				var1--;
			}

			int var23 = 0;
			if (0 == var1) {
				return var23;
			} else if (var1 == 1) {
				var6[0] = -var10[0] / var10[1];
				boolean var25 = var3 ? var2 < var22 + var6[0] : var2 < var6[0] - var22;
				boolean var26 = var5 ? var4 > var6[0] - var22 : var4 > var6[0] + var22;
				var23 = var25 && var26 ? 1 : 0;
				if (var23 > 0) {
					if (var3 && var6[0] < var2) {
						var6[0] = var2;
					} else if (var5 && var6[0] > var4) {
						var6[0] = var4;
					}
				}

				return var23;
			} else {
				to var12 = new to(var10, var1);
				float[] var13 = new float[var1 + 1];

				for (int var14 = 1; var14 <= var1; var14++) {
					var13[var14 - 1] = var10[var14] * var14;
				}

				float[] var27 = new float[var1 + 1];
				int var15 = ak(var13, var1 - 1, var2, false, var4, false, var27);
				if (var15 == -1) {
					return 0;
				} else {
					boolean var16 = false;
					float var18 = 0.0F;
					float var19 = 0.0F;
					float var20 = 0.0F;

					for (int var21 = 0; var21 <= var15; var21++) {
						if (var23 > var1) {
							return var23;
						}

						float var17;
						if (0 == var21) {
							var17 = var2;
							var19 = tk.ag(var10, var1, var2);
							if (Math.abs(var19) <= var22 && var3) {
								var6[var23++] = var2;
							}
						} else {
							var17 = var20;
							var19 = var18;
						}

						if (var21 == var15) {
							var20 = var4;
							var16 = false;
						} else {
							var20 = var27[var21];
						}

						var18 = tk.ag(var10, var1, var20);
						if (var16) {
							var16 = false;
						} else if (Math.abs(var18) < var22) {
							if (var15 != var21 || var5) {
								var6[var23++] = var20;
								var16 = true;
							}
						} else if (var19 < 0.0F && var18 > 0.0F || var19 > 0.0F && var18 < 0.0F) {
							var6[var23++] = mh.az(var12, var17, var20, 0.0F);
							if (var23 > 1 && var6[var23 - 2] >= var6[var23 - 1] - var22) {
								var6[var23 - 2] = (var6[var23 - 2] + var6[var23 - 1]) * 0.5F;
								var23--;
							}
						}
					}

					return var23;
				}
			}
		}
	}
}
