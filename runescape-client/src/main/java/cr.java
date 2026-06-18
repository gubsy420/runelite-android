import java.io.EOFException;
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
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;"
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
			if (var1 == var8.av_fld) {
				var8.ak(var1, var2, var3, var4);
				return;
			}

			if (var8.av_fld <= var1) {
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
				this.av_fld.ah().gy();
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)Lcp;"
	)
	cp ag(int var1) {
		cp var3 = (cp)this.av_fld.ah();
		if (var3 != null && var3.av_fld <= var1) {
			for (cp var4 = (cp)this.av_fld.ay(); var4 != null && var4.av_fld <= var1; var4 = (cp)this.av_fld.ay()) {
				var3.gy();
				var3 = var4;
			}

			if (this.az_fld.aw_fld * -457605973 + var3.av_fld + var3.ag_fld > var1) {
				return var3;
			} else {
				var3.gy();
				return null;
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("ul")
	@ObfuscatedSignature(
		descriptor = "(Lqe;)Ljava/lang/String;"
	)
	public static String ul(qe var0) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.aw_fld;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean ay() {
		return this.av_fld.ar();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	void av(int var1, int var2, int var3, int var4) {
		cp var5 = null;
		int var6 = 0;

		for (cp var7 = (cp)this.av_fld.ah(); null != var7; var7 = (cp)this.av_fld.ay()) {
			var6++;
			if (var1 == var7.av_fld) {
				var7.ak(var1, var2, var3, var4);
				return;
			}

			if (var7.av_fld <= var1) {
				var5 = var7;
			}
		}

		if (null == var5) {
			if (var6 < 4) {
				this.av_fld.av(new cp(var1, var2, var3, var4));
			}
		} else {
			no.ak(new cp(var1, var2, var3, var4), var5);
			if (var6 >= 4) {
				this.av_fld.ah().gy();
			}
		}
	}

	@ObfuscatedName("jm")
	@ObfuscatedSignature(
		descriptor = "(Lcr;I)Z"
	)
	public static boolean jm(cr var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.av_fld.ar();
		}
	}

	@ObfuscatedName("eh")
	@ObfuscatedSignature(
		descriptor = "()Lpa;"
	)
	public pa eh() {
		return this.az_fld;
	}

	@ObfuscatedName("eo")
	@ObfuscatedSignature(
		descriptor = "(Lvr;I)I"
	)
	public static int eo(vr var0, int var1) {
		return var0.ah_fld[var1 & 15];
	}

	cr(pa var1) {
		this.az_fld = var1;
	}

	@ObfuscatedName("je")
	@ObfuscatedSignature(
		descriptor = "(I)Lcp;"
	)
	public cp je(int var1) {
		return this.ag(var1);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean aw() {
		return this.av_fld.ar();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Lcp;"
	)
	cp ae(int var1) {
		cp var2 = (cp)this.av_fld.ah();
		if (var2 != null && var2.av_fld <= var1) {
			for (cp var3 = (cp)this.av_fld.ay(); var3 != null && var3.av_fld <= var1; var3 = (cp)this.av_fld.ay()) {
				var2.gy();
				var2 = var3;
			}

			if (this.az_fld.aw_fld * -457605973 + var2.av_fld + var2.ag_fld > var1) {
				return var2;
			} else {
				var2.gy();
				return null;
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)Lpw;"
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

				pw.fh(var6, -311726867);
				pw.ag_fld.az(var6, var0);
				var10000 = var6;
			}

			pw var2 = var10000;
			if (var2.getId() == -1) {
				var2.uk_fld = var0;
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
		if (var2 != null && var2.av_fld <= var1) {
			for (cp var3 = (cp)this.av_fld.ay(); var3 != null && var3.av_fld <= var1; var3 = (cp)this.av_fld.ay()) {
				var2.gy();
				var2 = var3;
			}

			if (this.az_fld.aw_fld * -457605973 + var2.av_fld + var2.ag_fld > var1) {
				return var2;
			} else {
				var2.gy();
				return null;
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean az(int var1) {
		return this.av_fld.isEmpty();
	}
}
