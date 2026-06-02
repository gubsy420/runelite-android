import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("ab")
public class ab implements Runnable {
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bd_fld;
	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "Luv;"
	)
	static uv hu_fld;
	@ObfuscatedGetter(
		intValue = -334119141
	)
	@ObfuscatedName("jx")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int jx_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "[Lao;"
	)
	public volatile ao[] ak_fld = new ao[2];
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	public static String av_fld;
	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int dm_fld;
	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int cc_fld;

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIIIIILyv;Lkp;I)V"
	)
	static final void aw(int var0, int var1, int var2, int var3, int var4, int var5, yv var6, kp var7, int var8) {
		if (null != var6) {
			int var10 = var3 * var3 + var2 * var2;
			if (var10 <= 12100) {
				int var11 = fc.ah_fld[var4];
				int var12 = fc.aw_fld[var4];
				int var13 = var2 * var12 + var3 * var11 >> 16;
				int var14 = var3 * var12 - var2 * var11 >> 16;
				var5 = var4 - var5 & 2047;
				int var15 = var7.ak_fld / 2 + var0 + var13;
				int var16 = var7.ag_fld / 2 + var1 - var14;
				int var17 = var8 * var6.ad_fld;
				int var18 = var6.ao_fld * var8;
				int var19 = var15 - var17 / 2;
				int var20 = var16 - var18 / 2;
				int var21 = var6.aw_fld / 2;
				int var22 = var6.ay_fld / 2;
				var6.br(var19, var20, var17, var18, var21, var22, var5, var8 * 256, var0, var1, var7.av_fld, var7.az_fld);
			}
		}
	}

	@ObfuscatedName("run")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Override
	public void run() {
		this.ak();

		try {
			for (int var1 = 0; var1 < 2; var1++) {
				ao var2 = this.ak_fld[var1];
				if (null != var2) {
					var2.av(-1631142743);
				}
			}
		} catch (Exception var3) {
			gl.ak(null, var3);
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ak() {
		Thread.currentThread().setName("Sound Engine");
	}

	@ObfuscatedName("kx")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void kx() {
		try {
			for (int var1 = 0; var1 < 2; var1++) {
				ao var2 = this.ak_fld[var1];
				if (null != var2) {
					var2.av(154766016);
				}
			}
		} catch (Exception var3) {
			gl.ak(null, var3);
		}
	}

	public ab() {
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void av() {
		try {
			for (int var1 = 0; var1 < 2; var1++) {
				ao var2 = this.ak_fld[var1];
				if (null != var2) {
					var2.av(-1884862404);
				}
			}
		} catch (Exception var3) {
			gl.ak(null, var3);
		}
	}

	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		descriptor = "(Lab;)V"
	)
	public static void hk(ab var0) {
		if (var0 == null) {
			var0.getClass();
		}

		try {
			for (int var1 = 0; var1 < 2; var1++) {
				ao var2 = var0.ak_fld[var1];
				if (null != var2) {
					var2.av(-639671172);
				}
			}
		} catch (Exception var3) {
			gl.ak(null, var3);
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void az() {
		try {
			for (int var1 = 0; var1 < 2; var1++) {
				ao var2 = this.ak_fld[var1];
				if (null != var2) {
					var2.av(1628677911);
				}
			}
		} catch (Exception var3) {
			gl.ak(null, var3);
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(S)V"
	)
	static final void av(short var0) {
		Object var10000 = null;
		String var1 = kh.hz_fld;
		io.ag(30, "", var1);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int ag(int var0) {
		return wo.ak_fld[var0 << 1 | 1];
	}
}
