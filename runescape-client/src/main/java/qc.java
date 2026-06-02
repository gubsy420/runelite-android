import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("qc")
public class qc {
	@ObfuscatedGetter(
		intValue = 1391728487
	)
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ak_fld;
	@ObfuscatedGetter(
		intValue = -1558912725
	)
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int av_fld;
	@ObfuscatedGetter(
		intValue = 358077697
	)
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int aw_fld;
	@ObfuscatedGetter(
		intValue = -1312044201
	)
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ag_fld;
	@ObfuscatedGetter(
		intValue = 761860659
	)
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int az_fld;
	@ObfuscatedGetter(
		intValue = -1101707591
	)
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ah_fld;
	@ObfuscatedGetter(
		intValue = -1961048635
	)
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ae_fld;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ax_fld;

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int av() {
		return this.ah_fld;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V"
	)
	void ak(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		this.av_fld = var1;
		this.aw_fld = var2;
		this.ah_fld = var3;
		this.ae_fld = var4;
		this.az_fld = var5;
		this.ag_fld = var6;
		this.ak_fld = var7;
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(Lqc;I)I"
	)
	public static int cp(qc var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.av_fld;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ah() {
		return this.az_fld;
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(Lqc;I)I"
	)
	public static int cy(qc var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.aw_fld;
		}
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(Lqc;)I"
	)
	public static int ba(qc var0) {
		return var0.ak_fld;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int al() {
		return this.av_fld;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ay() {
		return this.ak_fld;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V"
	)
	void as(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		this.av_fld = var1;
		this.aw_fld = var2;
		this.ah_fld = var3;
		this.ae_fld = var4;
		this.az_fld = var5;
		this.ag_fld = var6;
		this.ak_fld = var7;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int au() {
		return this.av_fld;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(JLjava/lang/String;)I"
	)
	static final int ag(long var0, String var2) {
		Random var4 = new Random();
		xi var5 = new xi(128);
		xi var6 = new xi(128);
		int[] var7 = new int[]{var4.nextInt(), var4.nextInt(), (int)(var0 >> 32), (int)var0};
		var5.bc(10);

		for (int var8 = 0; var8 < 4; var8++) {
			xi.ld(var5, var4.nextInt(), (byte)106);
		}

		xi.ld(var5, var7[0], (byte)124);
		xi.ld(var5, var7[1], (byte)109);
		var5.fn(var0);
		var5.fn(0L);

		for (int var21 = 0; var21 < 4; var21++) {
			xi.ld(var5, var4.nextInt(), (byte)108);
		}

		var5.db(dc.af_fld, dc.al_fld);
		var6.bc(10);

		for (int var22 = 0; var22 < 3; var22++) {
			xi.ld(var6, var4.nextInt(), (byte)96);
		}

		var6.fn(var4.nextLong());
		var6.bb(var4.nextLong());
		qm.hh(var6);
		var6.fn(var4.nextLong());
		var6.db(dc.af_fld, dc.al_fld);
		int var23 = iq.bu(var2);
		if (var23 % 8 != 0) {
			var23 += 8 - var23 % 8;
		}

		xi var9 = new xi(var23);
		var9.cc(var2, -159375419);
		var9.au_fld = var23;
		var9.dk(var7, (byte)45);
		xi var10 = new xi(var9.au_fld + var6.au_fld + var5.au_fld + 5);
		var10.bc(2);
		var10.bc(var5.au_fld);
		xi.pm(var10, var5.al_fld, 0, var5.au_fld);
		var10.bc(var6.au_fld);
		xi.pm(var10, var6.al_fld, 0, var6.au_fld);
		var10.bw(var9.au_fld);
		xi.pm(var10, var9.al_fld, 0, var9.au_fld);
		String var11 = ha.ak(var10.al_fld);

		try {
			URL var12 = new URL(ph.hj("services", false) + "m=accountappeal/login.ws");
			URLConnection var13 = var12.openConnection();
			var13.setDoInput(true);
			var13.setDoOutput(true);
			var13.setConnectTimeout(5000);
			OutputStreamWriter var14 = new OutputStreamWriter(var13.getOutputStream());
			var14.write("data2=" + xt.ak(var11) + "&dest=" + xt.ak("passwordchoice.ws"));
			var14.flush();
			InputStream var15 = var13.getInputStream();
			var10 = new xi(new byte[1000]);

			do {
				int var16 = var15.read(var10.al_fld, var10.au_fld, 1000 - var10.au_fld);
				if (-1 == var16) {
					var14.close();
					var15.close();
					String var25 = new String(var10.al_fld);
					if (var25.startsWith("OFFLINE")) {
						return 4;
					} else if (var25.startsWith("WRONG")) {
						return 7;
					} else if (var25.startsWith("RELOAD")) {
						return 3;
					} else if (var25.startsWith("Not permitted for social network accounts.")) {
						return 6;
					} else {
						xi.qd(var10, var7, (byte)-53);

						while (var10.au_fld > 0 && 0 == var10.al_fld[var10.au_fld - 1]) {
							var10.au_fld--;
						}

						String var26 = new String(var10.al_fld, 0, var10.au_fld);
						boolean var17;
						if (null == var26) {
							var17 = false;
						} else {
							label97: {
								try {
									new URL(var26);
								} catch (MalformedURLException var19) {
									var17 = false;
									break label97;
								}

								var17 = true;
							}
						}

						if (var17) {
							by.ak(var26);
							return 2;
						} else {
							return 5;
						}
					}
				}

				var10.au_fld += 228932457 * var16;
			} while (var10.au_fld < 1000);

			return 5;
		} catch (Throwable var20) {
			var20.printStackTrace();
			return 5;
		}
	}

	qc() {
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int aa() {
		return this.ah_fld;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int am() {
		return this.ae_fld;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ad() {
		return this.ae_fld;
	}

	@ObfuscatedName("tx")
	@ObfuscatedSignature(
		descriptor = "(Lqc;B)I"
	)
	public static int tx(qc var0, byte var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.ae_fld;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ax() {
		return this.aw_fld;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ab() {
		return this.ae_fld;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ap() {
		return this.az_fld;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int at() {
		return this.ag_fld;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int aj() {
		return this.ag_fld;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int an() {
		return this.ah_fld;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int bd() {
		return this.ak_fld;
	}

	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "(Lqc;I)I"
	)
	public static int hg(qc var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.ag_fld;
		}
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int bz() {
		return this.ak_fld;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Lox;"
	)
	public static ox ak(int var0) throws EOFException {
		ox var2 = (ox)ox.ab_fld.ak(var0);
		if (null != var2) {
			return var2;
		} else if (nz.ad_fld == null) {
			return null;
		} else {
			byte[] var3 = nz.ad_fld.bb(3, var0, 584982574);
			var2 = new ox();
			if (null != var3) {
				ox.fd(var2, new xi(var3), -1569410011);
			}

			ox.ab_fld.az(var2, var0);
			return var2;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ac() {
		return this.ag_fld;
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(Lqc;)I"
	)
	public static int cr(qc var0) {
		return var0.ah_fld;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int ag(int var1) {
		return this.av_fld;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int az(int var1) {
		return this.ag_fld;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	int ae(byte var1) {
		return this.az_fld;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int aw(int var1) {
		return this.ag_fld;
	}
}
