import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("mh")
public class mh {
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int as_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ag_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	static String av_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	static String ah_fld;
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	static boolean bn_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	static String ay_fld;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lzu;"
	)
	public static zu al_fld = null;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lzu;"
	)
	public static zu af_fld = null;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Ljava/io/File;"
	)
	static File aq_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ak_fld;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lzu;"
	)
	static zu ad_fld = null;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int aj_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	static String aw_fld;

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/io/File;Ljava/io/File;)V"
	)
	static void al(File var0, File var1) throws FileNotFoundException, EOFException {
		try {
			zb var2 = new zb(dm.ai_fld, "rw", 10000L);
			xi var3 = new xi(500);
			var3.ea(3);
			var3.ea(var1 != null ? 1 : 0);
			var3.cv(var0.getPath());
			if (null != var1) {
				var3.cv(var1.getPath());
			}

			var2.az(var3.al_fld, 0, var3.au_fld);
			var2.av();
		} catch (IOException var4) {
			var4.printStackTrace();
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V"
	)
	public static void ay(String var0, String var1, String var2, int var3, int var4) throws IOException, FileNotFoundException, EOFException {
		if (var1 != null && !var1.isEmpty()) {
			var0 = var0 + "-" + var1;
		}

		lz.am_fld = -1980386398 * var4;
		fr.ao_fld = var3;

		try {
			ol.an_fld = System.getProperty("os.name");
		} catch (Exception var34) {
			ol.an_fld = "Unknown";
		}

		fp.ax_fld = ol.an_fld.toLowerCase();
		uf.aa_fld = null;

		try {
			uf.aa_fld = System.getProperty("jagex.userhome");
		} catch (Exception var33) {
		}

		if (uf.aa_fld == null) {
			try {
				uf.aa_fld = System.getProperty("user.home");
			} catch (Exception var32) {
			}
		}

		if (null != uf.aa_fld) {
			uf.aa_fld = uf.aa_fld + "/";
		}

		try {
			if (fp.ax_fld.startsWith("win")) {
				if (null == uf.aa_fld) {
					uf.aa_fld = client.ly("USERPROFILE");
				}
			} else if (uf.aa_fld == null) {
				uf.aa_fld = client.ly("HOME");
			}

			if (uf.aa_fld != null) {
				uf.aa_fld = uf.aa_fld + "/";
			}
		} catch (Exception var31) {
		}

		if (uf.aa_fld == null) {
			uf.aa_fld = "~/";
		}

		cu.ab_fld = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", uf.aa_fld, "/tmp/", ""};
		jj.ap_fld = new String[]{".jagex_cache_" + 932883474 * fr.ao_fld, ".file_store_" + 1524151884 * fr.ao_fld};

		label457:
		for (int var5 = 0; var5 < 4; var5++) {
			String var7 = var5 == 0 ? "" : "" + var5;
			dm.ai_fld = new File(uf.aa_fld, "jagex_cl_" + var0 + "_" + var2 + var7 + ".dat");
			String var8 = null;
			String var9 = null;
			boolean var10 = false;
			if (dm.ai_fld.exists()) {
				zb var11 = null;

				try {
					var11 = new zb(dm.ai_fld, "rw", 10000L);
					xi var12 = new xi((int)var11.ah());

					while (var12.au_fld < var12.al_fld.length) {
						int var13 = zb.oe(var11, var12.al_fld, var12.au_fld * -2093418188, var12.al_fld.length - var12.au_fld);
						if (-1 == var13) {
							throw new IOException();
						}

						var12.au_fld += 615308396 * var13;
					}

					var12.au_fld = 0;
					int var57 = var12.cg();
					if (var57 < 1 || var57 > 3) {
						throw new IOException("" + var57);
					}

					int var14 = 0;
					if (var57 > 1) {
						var14 = var12.cg();
					}

					if (var57 <= 2) {
						var8 = var12.ct();
						if (var14 == 1) {
							var9 = var12.ct();
						}
					} else {
						var8 = xi.jw(var12, (byte)-27);
						if (1 == var14) {
							var9 = xi.jw(var12, (byte)-31);
						}
					}
				} catch (Exception var37) {
					var37.printStackTrace();
				} finally {
					try {
						if (null != var11) {
							var11.av();
						}
					} catch (IOException var30) {
					}
				}

				if (var8 != null) {
					File var53 = new File(var8);
					if (!var53.exists()) {
						var8 = null;
					}
				}

				if (null != var8) {
					File var54 = new File(var8, "test.dat");
					if (!pr.az(var54, true)) {
						var8 = null;
					}
				}
			}

			if (var8 == null && 0 == var5) {
				label430:
				for (int var51 = 0; var51 < jj.ap_fld.length; var51++) {
					for (int var55 = 0; var55 < cu.ab_fld.length; var55++) {
						File var58 = new File(cu.ab_fld[var55] + jj.ap_fld[var51] + File.separatorChar + var0 + File.separatorChar);
						if (var58.exists() && pr.az(new File(var58, "test.dat"), true)) {
							var8 = var58.toString();
							var10 = true;
							break label430;
						}
					}
				}
			}

			if (var8 == null) {
				var8 = uf.aa_fld + File.separatorChar + "jagexcache" + var7 + File.separatorChar + var0 + File.separatorChar + var2 + File.separatorChar;
				var10 = true;
			}

			if (null != var9) {
				File var52 = new File(var9);
				File var56 = new File(var8);

				try {
					File[] var59 = var52.listFiles();
					File[] var60 = var59;

					for (int var15 = 0; var15 < var60.length; var15++) {
						File var16 = var60[var15];
						File var17 = new File(var56, var16.getName());
						boolean var18 = var16.renameTo(var17);
						if (!var18) {
							throw new IOException();
						}
					}
				} catch (Exception var36) {
					var36.printStackTrace();
				}

				var10 = true;
			}

			if (var10) {
				py.ag(new File(var8), null);
			}

			File var6 = new File(var8);
			aq_fld = var6;
			if (!aq_fld.exists()) {
				aq_fld.mkdirs();
			}

			File[] var42 = aq_fld.listFiles();
			if (null != var42) {
				File[] var45 = var42;

				for (int var48 = 0; var48 < var45.length; var48++) {
					File var50 = var45[var48];
					if (!pr.az(var50, false)) {
						continue label457;
					}
				}
			}
			break;
		}

		File var39 = aq_fld;
		my.ag_fld = var39;
		if (!my.ag_fld.exists()) {
			throw new RuntimeException("");
		} else {
			my.ak_fld = true;

			try {
				File var40 = new File(uf.aa_fld, "random.dat");
				if (var40.exists()) {
					ad_fld = new zu(new zb(var40, "rw", 25L), 24, 0);
				} else {
					label381:
					for (int var43 = 0; var43 < jj.ap_fld.length; var43++) {
						for (int var46 = 0; var46 < cu.ab_fld.length; var46++) {
							File var49 = new File(cu.ab_fld[var46] + jj.ap_fld[var43] + File.separatorChar + "random.dat");
							if (var49.exists()) {
								ad_fld = new zu(new zb(var49, "rw", 25L), 24, 0);
								break label381;
							}
						}
					}
				}

				if (ad_fld == null) {
					RandomAccessFile var44 = new RandomAccessFile(var40, "rw");
					int var47 = var44.read();
					var44.seek(0L);
					var44.write(var47);
					var44.seek(0L);
					var44.close();
					ad_fld = new zu(new zb(var40, "rw", 25L), 24, 0);
				}
			} catch (IOException var35) {
			}

			af_fld = new zu(new zb(lo.ak("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
			al_fld = new zu(new zb(lo.ak("main_file_cache.idx255"), "rw", 1048576L), -19919398, 0);
			tw.au_fld = new zu[lz.am_fld];

			for (int var41 = 0; var41 < lz.am_fld; var41++) {
				tw.au_fld[var41] = new zu(new zb(lo.ak("main_file_cache.idx" + var41), "rw", 1048576L), 6000, 0);
			}
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V"
	)
	public static void as(String var0, String var1, String var2, int var3, int var4) throws IOException, FileNotFoundException, EOFException {
		if (var1 != null && !var1.isEmpty()) {
			var0 = var0 + "-" + var1;
		}

		lz.am_fld = var4;
		fr.ao_fld = var3;

		try {
			ol.an_fld = System.getProperty("os.name");
		} catch (Exception var34) {
			ol.an_fld = "Unknown";
		}

		fp.ax_fld = ol.an_fld.toLowerCase();
		uf.aa_fld = null;

		try {
			uf.aa_fld = System.getProperty("jagex.userhome");
		} catch (Exception var33) {
		}

		if (uf.aa_fld == null) {
			try {
				uf.aa_fld = System.getProperty("user.home");
			} catch (Exception var32) {
			}
		}

		if (null != uf.aa_fld) {
			uf.aa_fld = uf.aa_fld + "/";
		}

		try {
			if (fp.ax_fld.startsWith("win")) {
				if (null == uf.aa_fld) {
					uf.aa_fld = client.ly("USERPROFILE");
				}
			} else if (uf.aa_fld == null) {
				uf.aa_fld = client.ly("HOME");
			}

			if (uf.aa_fld != null) {
				uf.aa_fld = uf.aa_fld + "/";
			}
		} catch (Exception var31) {
		}

		if (uf.aa_fld == null) {
			uf.aa_fld = "~/";
		}

		cu.ab_fld = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", uf.aa_fld, "/tmp/", ""};
		jj.ap_fld = new String[]{".jagex_cache_" + fr.ao_fld, ".file_store_" + fr.ao_fld};

		label457:
		for (int var5 = 0; var5 < 4; var5++) {
			String var7 = var5 == 0 ? "" : "" + var5;
			dm.ai_fld = new File(uf.aa_fld, "jagex_cl_" + var0 + "_" + var2 + var7 + ".dat");
			String var8 = null;
			String var9 = null;
			boolean var10 = false;
			if (dm.ai_fld.exists()) {
				zb var11 = null;

				try {
					var11 = new zb(dm.ai_fld, "rw", 10000L);
					xi var12 = new xi((int)var11.ah());

					while (var12.au_fld < var12.al_fld.length) {
						int var13 = zb.oe(var11, var12.al_fld, var12.au_fld, var12.al_fld.length - var12.au_fld);
						if (-1 == var13) {
							throw new IOException();
						}

						var12.au_fld += 228932457 * var13;
					}

					var12.au_fld = 0;
					int var57 = var12.cg();
					if (var57 < 1 || var57 > 3) {
						throw new IOException("" + var57);
					}

					int var14 = 0;
					if (var57 > 1) {
						var14 = var12.cg();
					}

					if (var57 <= 2) {
						var8 = var12.ct();
						if (var14 == 1) {
							var9 = var12.ct();
						}
					} else {
						var8 = xi.jw(var12, (byte)-93);
						if (1 == var14) {
							var9 = xi.jw(var12, (byte)-119);
						}
					}
				} catch (Exception var37) {
					var37.printStackTrace();
				} finally {
					try {
						if (null != var11) {
							var11.av();
						}
					} catch (IOException var30) {
					}
				}

				if (var8 != null) {
					File var53 = new File(var8);
					if (!var53.exists()) {
						var8 = null;
					}
				}

				if (null != var8) {
					File var54 = new File(var8, "test.dat");
					if (!pr.az(var54, true)) {
						var8 = null;
					}
				}
			}

			if (var8 == null && 0 == var5) {
				label430:
				for (int var51 = 0; var51 < jj.ap_fld.length; var51++) {
					for (int var55 = 0; var55 < cu.ab_fld.length; var55++) {
						File var58 = new File(cu.ab_fld[var55] + jj.ap_fld[var51] + File.separatorChar + var0 + File.separatorChar);
						if (var58.exists() && pr.az(new File(var58, "test.dat"), true)) {
							var8 = var58.toString();
							var10 = true;
							break label430;
						}
					}
				}
			}

			if (var8 == null) {
				var8 = uf.aa_fld + File.separatorChar + "jagexcache" + var7 + File.separatorChar + var0 + File.separatorChar + var2 + File.separatorChar;
				var10 = true;
			}

			if (null != var9) {
				File var52 = new File(var9);
				File var56 = new File(var8);

				try {
					File[] var59 = var52.listFiles();
					File[] var60 = var59;

					for (int var15 = 0; var15 < var60.length; var15++) {
						File var16 = var60[var15];
						File var17 = new File(var56, var16.getName());
						boolean var18 = var16.renameTo(var17);
						if (!var18) {
							throw new IOException();
						}
					}
				} catch (Exception var36) {
					var36.printStackTrace();
				}

				var10 = true;
			}

			if (var10) {
				py.ag(new File(var8), null);
			}

			File var6 = new File(var8);
			aq_fld = var6;
			if (!aq_fld.exists()) {
				aq_fld.mkdirs();
			}

			File[] var42 = aq_fld.listFiles();
			if (null != var42) {
				File[] var45 = var42;

				for (int var48 = 0; var48 < var45.length; var48++) {
					File var50 = var45[var48];
					if (!pr.az(var50, false)) {
						continue label457;
					}
				}
			}
			break;
		}

		File var39 = aq_fld;
		my.ag_fld = var39;
		if (!my.ag_fld.exists()) {
			throw new RuntimeException("");
		} else {
			my.ak_fld = true;

			try {
				File var40 = new File(uf.aa_fld, "random.dat");
				if (var40.exists()) {
					ad_fld = new zu(new zb(var40, "rw", 25L), 24, 0);
				} else {
					label381:
					for (int var43 = 0; var43 < jj.ap_fld.length; var43++) {
						for (int var46 = 0; var46 < cu.ab_fld.length; var46++) {
							File var49 = new File(cu.ab_fld[var46] + jj.ap_fld[var43] + File.separatorChar + "random.dat");
							if (var49.exists()) {
								ad_fld = new zu(new zb(var49, "rw", 25L), 24, 0);
								break label381;
							}
						}
					}
				}

				if (ad_fld == null) {
					RandomAccessFile var44 = new RandomAccessFile(var40, "rw");
					int var47 = var44.read();
					var44.seek(0L);
					var44.write(var47);
					var44.seek(0L);
					var44.close();
					ad_fld = new zu(new zb(var40, "rw", 25L), 24, 0);
				}
			} catch (IOException var35) {
			}

			af_fld = new zu(new zb(lo.ak("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
			al_fld = new zu(new zb(lo.ak("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
			tw.au_fld = new zu[lz.am_fld];

			for (int var41 = 0; var41 < lz.am_fld; var41++) {
				tw.au_fld[var41] = new zu(new zb(lo.ak("main_file_cache.idx" + var41), "rw", 1048576L), 6000, 0);
			}
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/io/File;Ljava/io/File;)V"
	)
	static void ar(File var0, File var1) throws FileNotFoundException, EOFException {
		try {
			zb var2 = new zb(dm.ai_fld, "rw", 10000L);
			xi var3 = new xi(500);
			var3.ea(3);
			var3.ea(var1 != null ? 1 : 0);
			var3.cv(var0.getPath());
			if (null != var1) {
				var3.cv(var1.getPath());
			}

			var2.az(var3.al_fld, 0, var3.au_fld);
			var2.av();
		} catch (IOException var4) {
			var4.printStackTrace();
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	public static void ao(xi var0, int var1) {
		if (null != ad_fld) {
			try {
				ad_fld.af(0L);
				ad_fld.ay(var0.al_fld, var1, 24, 1925143982);
			} catch (Exception var3) {
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/io/File;Ljava/io/File;)V"
	)
	static void af(File var0, File var1) throws FileNotFoundException, EOFException {
		try {
			zb var2 = new zb(dm.ai_fld, "rw", 10000L);
			xi var3 = new xi(500);
			var3.ea(3);
			var3.ea(var1 != null ? 1 : 0);
			var3.cv(var0.getPath());
			if (null != var1) {
				var3.cv(var1.getPath());
			}

			var2.az(var3.al_fld, 0, var3.au_fld);
			var2.av();
		} catch (IOException var4) {
			var4.printStackTrace();
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/io/File;Z)Z"
	)
	static boolean au(File var0, boolean var1) {
		try {
			RandomAccessFile var2 = new RandomAccessFile(var0, "rw");
			int var3 = var2.read();
			var2.seek(0L);
			var2.write(var3);
			var2.seek(0L);
			var2.close();
			if (var1) {
				var0.delete();
			}

			return true;
		} catch (Exception var4) {
			return false;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)Lzb;"
	)
	public static zb an(String var0, String var1, boolean var2) throws FileNotFoundException {
		File var3 = new File(aq_fld, "preferences" + var0 + ".dat");
		if (var3.exists()) {
			try {
				return new zb(var3, "rw", 10000L);
			} catch (IOException var9) {
			}
		}

		String var4 = "";
		if (33 == fr.ao_fld) {
			var4 = "_rc";
		} else if (34 == fr.ao_fld) {
			var4 = "_wip";
		}

		File var5 = new File(uf.aa_fld, "jagex_" + var1 + "_preferences" + var0 + var4 + ".dat");
		if (!var2 && var5.exists()) {
			try {
				return new zb(var5, "rw", 10000L);
			} catch (IOException var8) {
			}
		}

		try {
			return new zb(var3, "rw", 10000L);
		} catch (IOException var7) {
			throw new RuntimeException();
		}
	}

	mh() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/io/File;Z)Z"
	)
	static boolean ax(File var0, boolean var1) {
		try {
			RandomAccessFile var2 = new RandomAccessFile(var0, "rw");
			int var3 = var2.read();
			var2.seek(0L);
			var2.write(var3);
			var2.seek(0L);
			var2.close();
			if (var1) {
				var0.delete();
			}

			return true;
		} catch (Exception var4) {
			return false;
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)Lzb;"
	)
	public static zb ai(String var0, String var1, boolean var2) throws FileNotFoundException {
		File var3 = new File(aq_fld, "preferences" + var0 + ".dat");
		if (var3.exists()) {
			try {
				return new zb(var3, "rw", 10000L);
			} catch (IOException var9) {
			}
		}

		String var4 = "";
		if (33 == fr.ao_fld) {
			var4 = "_rc";
		} else if (34 == fr.ao_fld) {
			var4 = "_wip";
		}

		File var5 = new File(uf.aa_fld, "jagex_" + var1 + "_preferences" + var0 + var4 + ".dat");
		if (!var2 && var5.exists()) {
			try {
				return new zb(var5, "rw", 10000L);
			} catch (IOException var8) {
			}
		}

		try {
			return new zb(var3, "rw", 10000L);
		} catch (IOException var7) {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "()[B"
	)
	public static byte[] aq() {
		byte[] var0 = new byte[24];

		try {
			ad_fld.af(0L);
			ad_fld.ae(var0);
			int var1 = 0;

			while (var1 < 24 && var0[var1] == 0) {
				var1++;
			}

			if (var1 >= 24) {
				throw new IOException();
			}
		} catch (Exception var3) {
			for (int var2 = 0; var2 < 24; var2++) {
				var0[var2] = -1;
			}
		}

		return var0;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "()[B"
	)
	public static byte[] am() {
		byte[] var0 = new byte[24];

		try {
			ad_fld.af(0L);
			ad_fld.ae(var0);
			int var1 = 0;

			while (var1 < 24 && var0[var1] == 0) {
				var1++;
			}

			if (var1 >= 24) {
				throw new IOException();
			}
		} catch (Exception var3) {
			for (int var2 = 0; var2 < 24; var2++) {
				var0[var2] = -1;
			}
		}

		return var0;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	public static void ad(xi var0, int var1) {
		if (null != ad_fld) {
			try {
				ad_fld.af(0L);
				ad_fld.ay(var0.al_fld, var1, 24, 1987964679);
			} catch (Exception var3) {
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)Lco;"
	)
	static co ae(int var0) {
		return (co)(co)cz.ag_fld.ak(var0);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public static void ab() {
		try {
			zu.pw(af_fld, 1352694741);

			for (int var0 = 0; var0 < lz.am_fld; var0++) {
				zu.pw(tw.au_fld[var0], 1352694741);
			}

			zu.pw(al_fld, 1352694741);
			zu.pw(ad_fld, 1352694741);
		} catch (Exception var1) {
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lto;FFFB)F"
	)
	static float az(to var0, float var1, float var2, float var3) {
		float var5 = tk.ag(var0.ak_fld, var0.ag_fld, var1);
		if (Math.abs(var5) < sa.av_fld) {
			return var1;
		} else {
			float var6 = tk.ag(var0.ak_fld, var0.ag_fld, var2);
			if (Math.abs(var6) < sa.av_fld) {
				return var2;
			} else {
				float var7 = 0.0F;
				float var8 = 0.0F;
				float var9 = 0.0F;
				float var14 = 0.0F;
				boolean var15 = true;
				boolean var16 = false;

				do {
					var16 = false;
					if (var15) {
						var7 = var1;
						var14 = var5;
						var8 = var2 - var1;
						var9 = var8;
						var15 = false;
					}

					if (Math.abs(var14) < Math.abs(var6)) {
						var1 = var2;
						var2 = var7;
						var7 = var1;
						var5 = var6;
						var6 = var14;
						var14 = var5;
					}

					float var17 = sa.ae_fld * Math.abs(var2) + var3 * 0.5F;
					float var18 = (var7 - var2) * 0.5F;
					boolean var19 = Math.abs(var18) > var17 && var6 != 0.0F;
					if (var19) {
						if (!(Math.abs(var9) < var17) && !(Math.abs(var5) <= Math.abs(var6))) {
							float var13 = var6 / var5;
							float var10;
							float var11;
							if (var1 == var7) {
								var10 = var18 * 2.0F * var13;
								var11 = 1.0F - var13;
							} else {
								var11 = var5 / var14;
								float var12 = var6 / var14;
								var10 = var13 * ((var11 - var12) * (var11 * (var18 * 2.0F)) - (var2 - var1) * (var12 - 1.0F));
								var11 = (var11 - 1.0F) * (var12 - 1.0F) * (var13 - 1.0F);
							}

							if (var10 > 0.0) {
								var11 = -var11;
							} else {
								var10 = -var10;
							}

							var13 = var9;
							var9 = var8;
							if (2.0F * var10 < 3.0F * var18 * var11 - Math.abs(var11 * var17) && var10 < Math.abs(var13 * 0.5F * var11)) {
								var8 = var10 / var11;
							} else {
								var8 = var18;
								var9 = var18;
							}
						} else {
							var8 = var18;
							var9 = var18;
						}

						var1 = var2;
						var5 = var6;
						if (Math.abs(var8) > var17) {
							var2 += var8;
						} else if (var18 > 0.0) {
							var2 += var17;
						} else {
							var2 -= var17;
						}

						var6 = tk.ag(var0.ak_fld, var0.ag_fld, var2);
						if (var6 * (var14 / Math.abs(var14)) > 0.0) {
							var15 = true;
							var16 = true;
						} else {
							var16 = true;
						}
					}
				} while (var16);

				return var2;
			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)Lzb;"
	)
	public static zb aa(String var0, String var1, boolean var2) throws FileNotFoundException {
		File var3 = new File(aq_fld, "preferences" + var0 + ".dat");
		if (var3.exists()) {
			try {
				return new zb(var3, "rw", 10000L);
			} catch (IOException var9) {
			}
		}

		String var4 = "";
		if (33 == fr.ao_fld) {
			var4 = "_rc";
		} else if (-494883670 == fr.ao_fld) {
			var4 = "_wip";
		}

		File var5 = new File(uf.aa_fld, "jagex_" + var1 + "_preferences" + var0 + var4 + ".dat");
		if (!var2 && var5.exists()) {
			try {
				return new zb(var5, "rw", 10000L);
			} catch (IOException var8) {
			}
		}

		try {
			return new zb(var3, "rw", 10000L);
		} catch (IOException var7) {
			throw new RuntimeException();
		}
	}
}
