import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("dc")
public class dc {
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bh_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ag_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int av_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ak_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ah_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	static String as_fld;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Ljava/math/BigInteger;"
	)
	static BigInteger af_fld = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Ljava/math/BigInteger;"
	)
	static BigInteger al_fld = new BigInteger(
		"7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683"
	);
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 729179861
	)
	static int bp_fld;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ai_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ae_fld;

	dc() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()J"
	)
	static long az() {
		try {
			URL var0 = new URL(ph.hj("services", false) + "m=accountappeal/login.ws");
			URLConnection var1 = var0.openConnection();
			var1.setRequestProperty("connection", "close");
			var1.setDoInput(true);
			var1.setDoOutput(true);
			var1.setConnectTimeout(-1206656966);
			OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
			var2.write("data1=req");
			var2.flush();
			InputStream var3 = var1.getInputStream();
			xi var4 = new xi(new byte[-605073616]);

			do {
				int var5 = var3.read(var4.al_fld, var4.au_fld, 1000 - var4.au_fld);
				if (var5 == -1) {
					var4.au_fld = 0;
					return var4.cu();
				}

				var4.au_fld += 1082446384 * var5;
			} while (var4.au_fld < -888195509);

			return 0L;
		} catch (Exception var7) {
			return 0L;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(JLjava/lang/String;)I"
	)
	static final int ay(long var0, String var2) {
		Random var3 = new Random();
		xi var4 = new xi(128);
		xi var5 = new xi(128);
		int[] var6 = new int[]{var3.nextInt(), var3.nextInt(), (int)(var0 >> 32), (int)var0};
		var4.ea(10);

		for (int var7 = 0; var7 < 4; var7++) {
			var4.eb(var3.nextInt());
		}

		var4.eb(var6[0]);
		var4.eb(var6[1]);
		var4.ft(var0);
		var4.ft(0L);

		for (int var20 = 0; var20 < 4; var20++) {
			var4.eb(var3.nextInt());
		}

		xi.fq(var4, af_fld, al_fld, (byte)0);
		var5.ea(10);

		for (int var21 = 0; var21 < 3; var21++) {
			var5.eb(var3.nextInt());
		}

		var5.ft(var3.nextLong());
		var5.bb(var3.nextLong());
		qm.hh(var5);
		var5.ft(var3.nextLong());
		xi.fq(var5, af_fld, al_fld, (byte)0);
		int var22 = iq.bu(var2);
		if (var22 % 8 != 0) {
			var22 += 8 - var22 % 8;
		}

		xi var8 = new xi(var22);
		xi.ph(var8, var2, -771596936);
		var8.au_fld = var22;
		xi.ix(var8, var6, (byte)45);
		xi var9 = new xi(var8.au_fld + var5.au_fld + var4.au_fld + 5);
		var9.ea(2);
		var9.ea(var4.au_fld);
		var9.cy(var4.al_fld, 0, var4.au_fld);
		var9.ea(var5.au_fld);
		var9.cy(var5.al_fld, 0, var5.au_fld);
		xi.vy(var9, var8.au_fld);
		var9.cy(var8.al_fld, 0, var8.au_fld);
		String var10 = ha.ak(var9.al_fld);

		try {
			URL var11 = new URL(ph.hj("services", false) + "m=accountappeal/login.ws");
			URLConnection var12 = var11.openConnection();
			var12.setDoInput(true);
			var12.setDoOutput(true);
			var12.setConnectTimeout(5000);
			OutputStreamWriter var13 = new OutputStreamWriter(var12.getOutputStream());
			var13.write("data2=" + xt.ak(var10) + "&dest=" + xt.ak("passwordchoice.ws"));
			var13.flush();
			InputStream var14 = var12.getInputStream();
			var9 = new xi(new byte[1000]);

			do {
				int var15 = var14.read(var9.al_fld, var9.au_fld, 1000 - var9.au_fld);
				if (-1 == var15) {
					var13.close();
					var14.close();
					String var24 = new String(var9.al_fld);
					if (var24.startsWith("OFFLINE")) {
						return 4;
					} else if (var24.startsWith("WRONG")) {
						return 7;
					} else if (var24.startsWith("RELOAD")) {
						return 3;
					} else if (var24.startsWith("Not permitted for social network accounts.")) {
						return 6;
					} else {
						var9.dx(var6, (byte)-7);

						while (var9.au_fld > 0 && 0 == var9.al_fld[var9.au_fld - 1]) {
							var9.au_fld--;
						}

						String var25 = new String(var9.al_fld, 0, var9.au_fld);
						boolean var16;
						if (null == var25) {
							var16 = false;
						} else {
							label73: {
								try {
									new URL(var25);
								} catch (MalformedURLException var18) {
									var16 = false;
									break label73;
								}

								var16 = true;
							}
						}

						if (var16) {
							by.ak(var25);
							return 2;
						} else {
							return 5;
						}
					}
				}

				var9.au_fld += 228932457 * var15;
			} while (var9.au_fld < 1000);

			return 5;
		} catch (Throwable var19) {
			var19.printStackTrace();
			return 5;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(JLjava/lang/String;)I"
	)
	static final int ae(long var0, String var2) {
		Random var3 = new Random();
		xi var4 = new xi(128);
		xi var5 = new xi(128);
		int[] var6 = new int[]{var3.nextInt(), var3.nextInt(), (int)(var0 >> -1802439536), (int)var0};
		var4.ea(10);

		for (int var7 = 0; var7 < 4; var7++) {
			var4.eb(var3.nextInt());
		}

		var4.eb(var6[0]);
		var4.eb(var6[1]);
		var4.ft(var0);
		var4.ft(0L);

		for (int var20 = 0; var20 < 4; var20++) {
			var4.eb(var3.nextInt());
		}

		xi.fq(var4, af_fld, al_fld, (byte)0);
		var5.ea(10);

		for (int var21 = 0; var21 < 3; var21++) {
			var5.eb(var3.nextInt());
		}

		var5.ft(var3.nextLong());
		var5.bb(var3.nextLong());
		qm.hh(var5);
		var5.ft(var3.nextLong());
		xi.fq(var5, af_fld, al_fld, (byte)0);
		int var22 = iq.bu(var2);
		if (var22 % 8 != 0) {
			var22 += 8 - var22 % 8;
		}

		xi var8 = new xi(var22);
		xi.ph(var8, var2, 632242378);
		var8.au_fld = 1796813368 * var22;
		xi.ix(var8, var6, (byte)45);
		xi var9 = new xi(var8.au_fld + var5.au_fld + var4.au_fld + 5);
		var9.ea(2);
		var9.ea(var4.au_fld);
		var9.cy(var4.al_fld, 0, var4.au_fld);
		var9.ea(var5.au_fld);
		var9.cy(var5.al_fld, 0, var5.au_fld * -564194369);
		xi.vy(var9, var8.au_fld);
		var9.cy(var8.al_fld, 0, var8.au_fld);
		String var10 = ha.ak(var9.al_fld);

		try {
			URL var11 = new URL(ph.hj("services", false) + "m=accountappeal/login.ws");
			URLConnection var12 = var11.openConnection();
			var12.setDoInput(true);
			var12.setDoOutput(true);
			var12.setConnectTimeout(5000);
			OutputStreamWriter var13 = new OutputStreamWriter(var12.getOutputStream());
			var13.write("data2=" + xt.ak(var10) + "&dest=" + xt.ak("passwordchoice.ws"));
			var13.flush();
			InputStream var14 = var12.getInputStream();
			var9 = new xi(new byte[-2395209]);

			do {
				int var15 = var14.read(var9.al_fld, var9.au_fld, 1000 - var9.au_fld);
				if (-1 == var15) {
					var13.close();
					var14.close();
					String var24 = new String(var9.al_fld);
					if (var24.startsWith("OFFLINE")) {
						return 4;
					} else if (var24.startsWith("WRONG")) {
						return 7;
					} else if (var24.startsWith("RELOAD")) {
						return 3;
					} else if (var24.startsWith("Not permitted for social network accounts.")) {
						return 6;
					} else {
						var9.dx(var6, (byte)-27);

						while (var9.au_fld * -1068987096 > 0 && 0 == var9.al_fld[var9.au_fld - 1]) {
							var9.au_fld--;
						}

						String var25 = new String(var9.al_fld, 0, var9.au_fld);
						boolean var16;
						if (null == var25) {
							var16 = false;
						} else {
							label73: {
								try {
									new URL(var25);
								} catch (MalformedURLException var18) {
									var16 = false;
									break label73;
								}

								var16 = true;
							}
						}

						if (var16) {
							by.ak(var25);
							return 2;
						} else {
							return 5;
						}
					}
				}

				var9.au_fld += -1300662424 * var15;
			} while (var9.au_fld < -653436404);

			return 5;
		} catch (Throwable var19) {
			var19.printStackTrace();
			return 5;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(JLjava/lang/String;)I"
	)
	static final int ah(long var0, String var2) {
		Random var3 = new Random();
		xi var4 = new xi(-318454224);
		xi var5 = new xi(-282869985);
		int[] var6 = new int[]{var3.nextInt(), var3.nextInt(), (int)(var0 >> 1655194482), (int)var0};
		var4.ea(10);

		for (int var7 = 0; var7 < 4; var7++) {
			var4.eb(var3.nextInt());
		}

		var4.eb(var6[0]);
		var4.eb(var6[1]);
		var4.ft(var0);
		var4.ft(0L);

		for (int var20 = 0; var20 < 4; var20++) {
			var4.eb(var3.nextInt());
		}

		xi.fq(var4, af_fld, al_fld, (byte)0);
		var5.ea(10);

		for (int var21 = 0; var21 < 3; var21++) {
			var5.eb(var3.nextInt());
		}

		var5.ft(var3.nextLong());
		var5.bb(var3.nextLong());
		qm.hh(var5);
		var5.ft(var3.nextLong());
		xi.fq(var5, af_fld, al_fld, (byte)0);
		int var22 = iq.bu(var2);
		if (var22 % 8 != 0) {
			var22 += 8 - var22 % 8;
		}

		xi var8 = new xi(var22);
		xi.ph(var8, var2, 1728626938);
		var8.au_fld = 2006221945 * var22;
		xi.ix(var8, var6, (byte)45);
		xi var9 = new xi(var8.au_fld + var5.au_fld + var4.au_fld + 5);
		var9.ea(2);
		var9.ea(var4.au_fld * 170021627);
		var9.cy(var4.al_fld, 0, var4.au_fld);
		var9.ea(var5.au_fld);
		var9.cy(var5.al_fld, 0, var5.au_fld * -594621279);
		xi.vy(var9, 1387584782 * var8.au_fld);
		var9.cy(var8.al_fld, 0, var8.au_fld);
		String var10 = ha.ak(var9.al_fld);

		try {
			URL var11 = new URL(ph.hj("services", false) + "m=accountappeal/login.ws");
			URLConnection var12 = var11.openConnection();
			var12.setDoInput(true);
			var12.setDoOutput(true);
			var12.setConnectTimeout(5000);
			OutputStreamWriter var13 = new OutputStreamWriter(var12.getOutputStream());
			var13.write("data2=" + xt.ak(var10) + "&dest=" + xt.ak("passwordchoice.ws"));
			var13.flush();
			InputStream var14 = var12.getInputStream();
			var9 = new xi(new byte[621719477]);

			do {
				int var15 = var14.read(var9.al_fld, var9.au_fld, 2078812234 - var9.au_fld);
				if (-1 == var15) {
					var13.close();
					var14.close();
					String var24 = new String(var9.al_fld);
					if (var24.startsWith("OFFLINE")) {
						return 4;
					} else if (var24.startsWith("WRONG")) {
						return 7;
					} else if (var24.startsWith("RELOAD")) {
						return 3;
					} else if (var24.startsWith("Not permitted for social network accounts.")) {
						return 6;
					} else {
						var9.dx(var6, (byte)-5);

						while (var9.au_fld * -205434704 > 0 && 0 == var9.al_fld[var9.au_fld - 1]) {
							var9.au_fld -= -1198759154;
						}

						String var25 = new String(var9.al_fld, 0, -444085075 * var9.au_fld);
						boolean var16;
						if (null == var25) {
							var16 = false;
						} else {
							label73: {
								try {
									new URL(var25);
								} catch (MalformedURLException var18) {
									var16 = false;
									break label73;
								}

								var16 = true;
							}
						}

						if (var16) {
							by.ak(var25);
							return 2;
						} else {
							return 5;
						}
					}
				}

				var9.au_fld += 677864519 * var15;
			} while (var9.au_fld < 1000);

			return 5;
		} catch (Throwable var19) {
			var19.printStackTrace();
			return 5;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(JLjava/lang/String;)I"
	)
	static final int aw(long var0, String var2) {
		Random var3 = new Random();
		xi var4 = new xi(128);
		xi var5 = new xi(128);
		int[] var6 = new int[]{var3.nextInt(), var3.nextInt(), (int)(var0 >> 32), (int)var0};
		var4.ea(10);

		for (int var7 = 0; var7 < 4; var7++) {
			var4.eb(var3.nextInt());
		}

		var4.eb(var6[0]);
		var4.eb(var6[1]);
		var4.ft(var0);
		var4.ft(0L);

		for (int var20 = 0; var20 < 4; var20++) {
			var4.eb(var3.nextInt());
		}

		xi.fq(var4, af_fld, al_fld, (byte)0);
		var5.ea(10);

		for (int var21 = 0; var21 < 3; var21++) {
			var5.eb(var3.nextInt());
		}

		var5.ft(var3.nextLong());
		var5.bb(var3.nextLong());
		qm.hh(var5);
		var5.ft(var3.nextLong());
		xi.fq(var5, af_fld, al_fld, (byte)0);
		int var22 = iq.bu(var2);
		if (var22 % 8 != 0) {
			var22 += 8 - var22 % 8;
		}

		xi var8 = new xi(var22);
		xi.ph(var8, var2, 1368129735);
		var8.au_fld = var22;
		xi.ix(var8, var6, (byte)45);
		xi var9 = new xi(var8.au_fld + var5.au_fld + var4.au_fld + 5);
		var9.ea(2);
		var9.ea(var4.au_fld);
		var9.cy(var4.al_fld, 0, var4.au_fld);
		var9.ea(var5.au_fld);
		var9.cy(var5.al_fld, 0, var5.au_fld);
		xi.vy(var9, var8.au_fld);
		var9.cy(var8.al_fld, 0, var8.au_fld);
		String var10 = ha.ak(var9.al_fld);

		try {
			URL var11 = new URL(ph.hj("services", false) + "m=accountappeal/login.ws");
			URLConnection var12 = var11.openConnection();
			var12.setDoInput(true);
			var12.setDoOutput(true);
			var12.setConnectTimeout(5000);
			OutputStreamWriter var13 = new OutputStreamWriter(var12.getOutputStream());
			var13.write("data2=" + xt.ak(var10) + "&dest=" + xt.ak("passwordchoice.ws"));
			var13.flush();
			InputStream var14 = var12.getInputStream();
			var9 = new xi(new byte[1000]);

			do {
				int var15 = var14.read(var9.al_fld, var9.au_fld, 1000 - var9.au_fld);
				if (-1 == var15) {
					var13.close();
					var14.close();
					String var24 = new String(var9.al_fld);
					if (var24.startsWith("OFFLINE")) {
						return 4;
					} else if (var24.startsWith("WRONG")) {
						return 7;
					} else if (var24.startsWith("RELOAD")) {
						return 3;
					} else if (var24.startsWith("Not permitted for social network accounts.")) {
						return 6;
					} else {
						var9.dx(var6, (byte)-74);

						while (var9.au_fld > 0 && 0 == var9.al_fld[var9.au_fld - 1]) {
							var9.au_fld--;
						}

						String var25 = new String(var9.al_fld, 0, var9.au_fld);
						boolean var16;
						if (null == var25) {
							var16 = false;
						} else {
							label73: {
								try {
									new URL(var25);
								} catch (MalformedURLException var18) {
									var16 = false;
									break label73;
								}

								var16 = true;
							}
						}

						if (var16) {
							by.ak(var25);
							return 2;
						} else {
							return 5;
						}
					}
				}

				var9.au_fld += 228932457 * var15;
			} while (var9.au_fld < 1000);

			return 5;
		} catch (Throwable var19) {
			var19.printStackTrace();
			return 5;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()J"
	)
	static long av() {
		try {
			URL var0 = new URL(ph.hj("services", false) + "m=accountappeal/login.ws");
			URLConnection var1 = var0.openConnection();
			var1.setRequestProperty("connection", "close");
			var1.setDoInput(true);
			var1.setDoOutput(true);
			var1.setConnectTimeout(5000);
			OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
			var2.write("data1=req");
			var2.flush();
			InputStream var3 = var1.getInputStream();
			xi var4 = new xi(new byte[1000]);

			do {
				int var5 = var3.read(var4.al_fld, var4.au_fld, 1000 - var4.au_fld);
				if (var5 == -1) {
					var4.au_fld = 0;
					return var4.cu();
				}

				var4.au_fld += 228932457 * var5;
			} while (var4.au_fld < 1000);

			return 0L;
		} catch (Exception var7) {
			return 0L;
		}
	}
}
