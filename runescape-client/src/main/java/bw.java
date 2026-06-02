import java.io.EOFException;
import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("bw")
public class bw {
	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int cp_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/concurrent/ExecutorService;"
	)
	ExecutorService ak_fld = Executors.newSingleThreadExecutor();
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bm_fld;
	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "Ldx;"
	)
	public static dx dk_fld;
	@ObfuscatedGetter(
		intValue = 1257830513
	)
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bn_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/concurrent/Future;"
	)
	Future ag_fld = this.ak_fld.submit(new dm());

	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "(Ldx;IIIIII)V"
	)
	static void dp(dx var0, int var1, int var2, int var3, int var4, int var5, int var6) throws EOFException {
		na var7 = var0.aa_fld[var1][var2][var3];
		if (var7 != null) {
			for (dw var8 = (dw)var7.aw(); null != var8; var8 = (dw)var7.as()) {
				if (var8.ag_fld == var4) {
					if (var6 == 2043223777) {
						return;
					}

					if (var5 == var8.az_fld) {
						var8.gy_void();
						break;
					}
				}
			}

			if (var7.aw() == null) {
				var0.aa_fld[var1][var2][var3] = null;
			}

			xh.en(var0, var1, var2, var3, 1733384236);
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ak() {
		this.ak_fld.shutdown();
		this.ak_fld = null;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean ag() {
		return this.ag_fld.isDone();
	}

	@ObfuscatedName("sm")
	@ObfuscatedSignature(
		descriptor = "(Lbw;)V"
	)
	public static void sm(bw var0) {
		var0.ak_fld.shutdown();
		var0.ak_fld = null;
	}

	bw() {
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)Ljava/lang/String;"
	)
	public static String ax(String var0) {
		StringBuilder var2 = new StringBuilder(var0.length());
		int var3 = 0;
		int var4 = -1;

		for (int var5 = 0; var5 < var0.length(); var5++) {
			char var6 = var0.charAt(var5);
			if (var6 == '<') {
				var2.append(var0.substring(var3, var5));
				var4 = var5;
			} else if (var6 == '>' && var4 != -1) {
				String var7 = var0.substring(1 + var4, var5);
				var4 = -1;
				if (var7.equals("lt")) {
					var2.append("<");
				} else if (var7.equals("gt")) {
					var2.append(">");
				} else if (var7.equals("br")) {
					var2.append("\n");
				}

				var3 = var5 + 1;
			}
		}

		if (var3 < var0.length()) {
			var2.append(var0.substring(var3, var0.length()));
		}

		return var2.toString();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIIZIZ)V"
	)
	static void ae(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
		if (var0 < var1) {
			int var7 = (var1 + var0) / 2;
			int var8 = var0;
			ct var9 = yd.ae_fld[var7];
			yd.ae_fld[var7] = yd.ae_fld[var1];
			yd.ae_fld[var1] = var9;

			for (int var10 = var0; var10 < var1; var10++) {
				ct var12 = yd.ae_fld[var10];
				int var13 = ku.ah(var12, var9, var2, var3);
				int var11;
				if (var13 != 0) {
					if (var3) {
						var11 = -var13;
					} else {
						var11 = var13;
					}
				} else if (var4 == -1) {
					var11 = 0;
				} else {
					int var14 = ku.ah(var12, var9, var4, var5);
					if (var5) {
						var11 = -var14;
					} else {
						var11 = var14;
					}
				}

				if (var11 <= 0) {
					ct var15 = yd.ae_fld[var10];
					yd.ae_fld[var10] = yd.ae_fld[var8];
					yd.ae_fld[var8++] = var15;
				}
			}

			yd.ae_fld[var1] = yd.ae_fld[var8];
			yd.ae_fld[var8] = var9;
			ae(var0, var8 - 1, var2, var3, var4, var5);
			ae(1 + var8, var1, var2, var3, var4, var5);
		}
	}

	@ObfuscatedName("hp")
	@ObfuscatedSignature(
		descriptor = "(Lpp;II)I"
	)
	public static int hp(pp var0, int var1, int var2) {
		return my.ag(var0.ep_fld, var1, var2);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void aw() {
		this.ak_fld.shutdown();
		this.ak_fld = null;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean ay() {
		return this.ag_fld.isDone();
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean as() {
		return this.ag_fld.isDone();
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "()Ljava/security/SecureRandom;"
	)
	SecureRandom af() {
		try {
			return (SecureRandom)(SecureRandom)this.ag_fld.get();
		} catch (Exception var4) {
			SecureRandom var3 = new SecureRandom();
			var3.nextInt();
			return var3;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "()Ljava/security/SecureRandom;"
	)
	SecureRandom ar() {
		try {
			return (SecureRandom)(SecureRandom)this.ag_fld.get();
		} catch (Exception var4) {
			SecureRandom var3 = new SecureRandom();
			var3.nextInt();
			return var3;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()Ljava/security/SecureRandom;"
	)
	SecureRandom az() {
		try {
			return (SecureRandom)(SecureRandom)this.ag_fld.get();
		} catch (Exception var5) {
			SecureRandom var4 = new SecureRandom();
			var4.nextInt();
			return var4;
		}
	}

	@ObfuscatedName("lb")
	@ObfuscatedSignature(
		descriptor = "(Lbw;)V"
	)
	public static void lb(bw var0) {
		var0.ak_fld.shutdown();
		var0.ak_fld = null;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void av() {
		this.ak_fld.shutdown();
		this.ak_fld = null;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(J)Z"
	)
	static boolean ag(long var0) {
		int var2 = (int)(var0 >>> 16 & 7L);
		return var2 == 2;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	static void ah(int var0) {
		if (null != bn.ba_fld && !bn.ba_fld.isEmpty()) {
			if (var0 < -1540227980) {
				;
			}
		} else {
			if (cx.kq_fld.at(-370499304) != null) {
				bn.ba_fld = cx.kq_fld.at(203396870);
				client.lq();
				client.dq_fld = true;
			} else {
				client.dq_fld = false;
			}
		}
	}
}
