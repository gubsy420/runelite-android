import java.io.EOFException;
import java.util.Arrays;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;
import net.runelite.api.events.PostStructComposition;

@ObfuscatedName("cr")
public class cr extends vw {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lpa;"
	)
	pa az_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ak_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lno;"
	)
	no av_fld = new no();
	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	static String bx_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int aw_fld;

	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)Ljava/lang/String;"
	)
	static String hs(String var0) {
		ki[] var2 = ti.ak();

		for (int var3 = 0; var3 < var2.length; var3++) {
			ki var4 = var2[var3];
			if (var4.aq_fld != -1 && var0.startsWith(ce.ak(var4.aq_fld))) {
				var0 = var0.substring(6 + Integer.toString(var4.aq_fld).length());
				break;
			}
		}

		return var0;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V"
	)
	void ak(int var1, int var2, int var3, int var4, int var5) {
		cp var6 = null;
		int var7 = 0;

		for (cp var8 = (cp)this.av_fld.ah(); null != var8; var8 = (cp)this.av_fld.ay()) {
			var7++;
			if (var1 == var8.ak_fld) {
				var8.ak(var1, var2, var3, var4);
				return;
			}

			if (var8.ak_fld <= var1) {
				if (var5 == -762052998) {
					return;
				}

				var6 = var8;
			}
		}

		if (null == var6) {
			if (var7 < 4) {
				this.av_fld.av(new cp(var1, var2, var3, var4));
			}
		} else {
			no.ak(new cp(var1, var2, var3, var4), var6);
			if (var7 >= 4) {
				this.av_fld.ah().gy_void();
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Lcp;"
	)
	cp ag(int var1) {
		cp var3 = (cp)this.av_fld.ah();
		if (var3 != null && var3.ak_fld <= var1) {
			for (cp var4 = (cp)this.av_fld.ay(); var4 != null && var4.ak_fld <= var1; var4 = (cp)this.av_fld.ay()) {
				var3.gy_void();
				var3 = var4;
			}

			if (this.az_fld.al_fld * -457605973 + var3.ak_fld + var3.av_fld > var1) {
				return var3;
			} else {
				var3.gy_void();
				return null;
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean ay() {
		return this.av_fld.bi();
	}

	cr(pa var1) {
		this.az_fld = var1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean az() {
		return this.av_fld.bi();
	}

	@ObfuscatedName("fw")
	@ObfuscatedSignature(
		descriptor = "(I)Lcp;"
	)
	public cp fw(int var1) {
		return this.ag(var1);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Lcp;"
	)
	cp ae(int var1) {
		cp var2 = (cp)this.av_fld.ah();
		if (var2 != null && var2.ak_fld <= var1) {
			for (cp var3 = (cp)this.av_fld.ay(); var3 != null && var3.ak_fld <= var1; var3 = (cp)this.av_fld.ay()) {
				var2.gy_void();
				var2 = var3;
			}

			if (this.az_fld.al_fld * -457605973 + var2.ak_fld + var2.av_fld > var1) {
				return var2;
			} else {
				var2.gy_void();
				return null;
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "(Lcr;IIII)V"
	)
	public static void da(cr var0, int var1, int var2, int var3, int var4) {
		if (var0 == null) {
			var0.getClass();
		}

		cp var5 = null;
		int var6 = 0;

		for (cp var7 = (cp)var0.av_fld.ah(); null != var7; var7 = (cp)var0.av_fld.ay()) {
			var6++;
			if (var1 == var7.ak_fld) {
				var7.ak(var1, var2, var3, var4);
				return;
			}

			if (var7.ak_fld <= var1) {
				var5 = var7;
			}
		}

		if (null == var5) {
			if (var6 < 4) {
				var0.av_fld.av(new cp(var1, var2, var3, var4));
			}
		} else {
			no.ak(new cp(var1, var2, var3, var4), var5);
			if (var6 >= 4) {
				var0.av_fld.ah().gy_void();
			}
		}
	}

	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "(Llu;[I)[I"
	)
	public static int[] de(lu var0, int[] var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return null != var1 ? Arrays.copyOf(var1, var1.length) : null;
	}

	@ObfuscatedName("nv")
	@ObfuscatedSignature(
		descriptor = "()Lpa;"
	)
	public pa nv() {
		return this.az_fld;
	}

	@ObfuscatedName("ma")
	@ObfuscatedSignature(
		descriptor = "(Lpi;)I"
	)
	public static int ma(pi var0) {
		return var0.aw_fld;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean as() {
		return this.av_fld.bi();
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Lpw;"
	)
	public static pw ak(int var0) throws EOFException {
		try {
			int var5 = 1180010774;
			pw var6 = (pw)pw.ag_fld.ak(var0);
			pw var10000;
			if (null != var6) {
				var10000 = var6;
			} else {
				byte[] var7 = pw.ak_fld.bb(34, var0, 584982574);
				var6 = new pw();
				if (var7 != null) {
					var6.az(new xi(var7), 1272609368);
				}

				var6.ag(-311726867);
				pw.ag_fld.az(var6, var0);
				var10000 = var6;
			}

			pw var2 = var10000;
			if (var2.getId() == -1) {
				var2.xj_fld = var0;
				PostStructComposition var3 = new PostStructComposition();
				var3.setStructComposition(var2);
				og.ci_fld.getCallbacks().post(var3);
			}

			return var2;
		} catch (Throwable var8) {
			throw new RuntimeException(var8);
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Lcp;"
	)
	cp ah(int var1) {
		cp var2 = (cp)this.av_fld.ah();
		if (var2 != null && var2.ak_fld <= var1) {
			for (cp var3 = (cp)this.av_fld.ay(); var3 != null && var3.ak_fld <= var1; var3 = (cp)this.av_fld.ay()) {
				var2.gy_void();
				var2 = var3;
			}

			if (this.az_fld.al_fld * -457605973 + var2.ak_fld + var2.av_fld > var1) {
				return var2;
			} else {
				var2.gy_void();
				return null;
			}
		} else {
			return null;
		}
	}
}
