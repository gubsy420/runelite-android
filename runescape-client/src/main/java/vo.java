import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("vo")
public class vo implements vy {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	static String ag_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	static String az_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1695278193
	)
	int av_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -153250095
	)
	int ae_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -353174431
	)
	int ah_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ak_fld;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int au_fld;
	@ObfuscatedName("ix")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 252999633
	)
	static int ix_fld;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int at_fld;

	@ObfuscatedName("fa")
	@ObfuscatedSignature(
		descriptor = "(Lvo;Ljava/lang/String;)V"
	)
	public static void fa(vo var0, String var1) {
		if (var0 == null) {
			var0.getClass();
		} else {
			String[] var2 = var1.split("\\.");

			try {
				var0.ae_fld = Integer.parseInt(var2[1]);
				var2 = var2[2].split("_");
				var0.ah_fld = Integer.parseInt(var2[0]) * 640621521;
				var0.av_fld = Integer.parseInt(var2[1]) * 491233078;
			} catch (Exception var4) {
			}
		}
	}

	@ObfuscatedName("ys")
	@ObfuscatedSignature(
		descriptor = "(Lvo;Ljava/lang/String;I)V"
	)
	public static void ys(vo var0, String var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		} else {
			String[] var3 = var1.split("\\.");

			try {
				var0.ae_fld = Integer.parseInt(var3[1]);
				var3 = var3[2].split("_");
				var0.ah_fld = Integer.parseInt(var3[0]);
				var0.av_fld = Integer.parseInt(var3[1]);
			} catch (Exception var5) {
			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "()Lvu;"
	)
	@Override
	public vu aw() {
		byte var1;
		if (fp.ax_fld.startsWith("win")) {
			var1 = 1;
		} else if (fp.ax_fld.startsWith("mac")) {
			var1 = 2;
		} else if (fp.ax_fld.startsWith("linux")) {
			var1 = 3;
		} else {
			var1 = 4;
		}

		String var2;
		try {
			var2 = System.getProperty("os.arch").toLowerCase();
		} catch (Exception var33) {
			var2 = "";
		}

		String var4;
		try {
			var4 = System.getProperty("os.name").toLowerCase();
		} catch (Exception var32) {
			var4 = "";
		}

		String var3;
		try {
			var3 = System.getProperty("os.version").toLowerCase();
		} catch (Exception var31) {
			var3 = "";
		}

		String var5 = "Unknown";
		String var6 = "1.1";

		try {
			var5 = System.getProperty("java.vendor");
			var6 = System.getProperty("java.version");
		} catch (Exception var30) {
		}

		boolean var7;
		if (!var2.startsWith("amd64") && !var2.startsWith("x86_64")) {
			var7 = false;
		} else {
			var7 = true;
		}

		byte var8 = 0;
		if (false) {
			if (var3.indexOf("4.0") != -1) {
				var8 = 1;
			} else if (var3.indexOf("4.1") != -1) {
				var8 = 2;
			} else if (var3.indexOf("4.9") != -1) {
				var8 = 3;
			} else if (var3.indexOf("5.0") != -1) {
				var8 = 4;
			} else if (var3.indexOf("5.1") != -1) {
				var8 = 5;
			} else if (var3.indexOf("5.2") != -1) {
				var8 = 8;
			} else if (var3.indexOf("6.0") != -1) {
				var8 = 6;
			} else if (var3.indexOf("6.1") != -1) {
				var8 = 7;
			} else if (var3.indexOf("6.2") != -1) {
				var8 = 9;
			} else if (var3.indexOf("6.3") != -1) {
				var8 = 10;
			} else if (var3.indexOf("10.0") != -1) {
				if (var4.indexOf("11") != -1) {
					var8 = 12;
				} else {
					var8 = 11;
				}
			} else if (var3.indexOf("11.0") != -1) {
				var8 = 12;
			}
		} else if (2 == var1) {
			if (var3.indexOf("10.4") != -1) {
				var8 = 20;
			} else if (var3.indexOf("10.5") != -1) {
				var8 = 21;
			} else if (var3.indexOf("10.6") != -1) {
				var8 = 22;
			} else if (var3.indexOf("10.7") != -1) {
				var8 = 23;
			} else if (var3.indexOf("10.8") != -1) {
				var8 = 24;
			} else if (var3.indexOf("10.9") != -1) {
				var8 = 25;
			} else if (var3.indexOf("10.10") != -1) {
				var8 = 26;
			} else if (var3.indexOf("10.11") != -1) {
				var8 = 27;
			} else if (var3.indexOf("10.12") != -1) {
				var8 = 28;
			} else if (var3.indexOf("10.13") != -1) {
				var8 = 29;
			} else if (var3.indexOf("10.14") != -1) {
				var8 = 30;
			} else if (var3.indexOf("10.15") != -1) {
				var8 = 31;
			} else if (var3.indexOf("11.") != -1) {
				var8 = 32;
			} else if (var3.indexOf("12.") != -1) {
				var8 = 33;
			} else if (var3.indexOf("13.") != -1) {
				var8 = 34;
			} else if (var3.indexOf("14.") != -1) {
				var8 = 35;
			}
		}

		byte var9;
		if (var5.toLowerCase().indexOf("sun") != -1) {
			var9 = 1;
		} else if (var5.toLowerCase().indexOf("microsoft") != -1) {
			var9 = 2;
		} else if (var5.toLowerCase().indexOf("apple") != -1) {
			var9 = 3;
		} else if (var5.toLowerCase().indexOf("oracle") != -1) {
			var9 = 5;
		} else {
			var9 = 4;
		}

		this.ag(var6);
		boolean var10 = false;
		int var11 = (int)(Runtime.getRuntime().maxMemory() / 1048576L) + 1;
		int var12;
		if (this.ae_fld > 3) {
			var12 = Runtime.getRuntime().availableProcessors();
		} else {
			var12 = 0;
		}

		byte var13 = 0;
		String var14 = "";
		String var15 = "";
		String var16 = "";
		String var17 = "";
		String var18 = "";
		String var19 = "";
		boolean var20 = false;
		boolean var21 = false;
		boolean var22 = false;
		boolean var23 = false;
		int[] var24 = new int[3];
		boolean var25 = false;
		String var26 = "";
		String var27 = "";
		String var28 = "";
		boolean var29 = false;
		return new vu(
			var1,
			var7,
			var8,
			var9,
			this.ae_fld,
			this.ah_fld,
			this.av_fld,
			false,
			var11,
			var12,
			var13,
			0,
			var14,
			var15,
			var16,
			var17,
			0,
			0,
			0,
			0,
			var18,
			var19,
			var24,
			0,
			"",
			"",
			var28
		);
	}

	@ObfuscatedName("ib")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
	)
	public void ib(String var1) {
		String[] var2 = var1.split(".");

		try {
			this.ae_fld = Integer.parseInt(var2[0]);
			this.ah_fld = Integer.parseInt(var2[1]);
			this.av_fld = Integer.parseInt(var2[2]);
		} catch (Exception var8) {
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Lvu;"
	)
	@Override
	public vu ak(int var1) {
		byte var2;
		if (fp.ax_fld.startsWith("win")) {
			var2 = 1;
		} else if (fp.ax_fld.startsWith("mac")) {
			var2 = 2;
		} else if (fp.ax_fld.startsWith("linux")) {
			var2 = 3;
		} else {
			var2 = 4;
		}

		String var3;
		try {
			var3 = System.getProperty("os.arch").toLowerCase();
		} catch (Exception var34) {
			var3 = "";
		}

		String var5;
		try {
			var5 = System.getProperty("os.name").toLowerCase();
		} catch (Exception var33) {
			var5 = "";
		}

		String var4;
		try {
			var4 = System.getProperty("os.version").toLowerCase();
		} catch (Exception var32) {
			var4 = "";
		}

		String var6 = "Unknown";
		String var7 = "1.1";

		try {
			var6 = System.getProperty("java.vendor");
			var7 = System.getProperty("java.version");
		} catch (Exception var31) {
		}

		boolean var8;
		if (!var3.startsWith("amd64") && !var3.startsWith("x86_64")) {
			var8 = false;
		} else {
			var8 = true;
		}

		byte var9 = 0;
		if (false) {
			if (var4.indexOf("4.0") != -1) {
				var9 = 1;
			} else if (var4.indexOf("4.1") != -1) {
				var9 = 2;
			} else if (var4.indexOf("4.9") != -1) {
				var9 = 3;
			} else if (var4.indexOf("5.0") != -1) {
				var9 = 4;
			} else if (var4.indexOf("5.1") != -1) {
				var9 = 5;
			} else if (var4.indexOf("5.2") != -1) {
				var9 = 8;
			} else if (var4.indexOf("6.0") != -1) {
				var9 = 6;
			} else if (var4.indexOf("6.1") != -1) {
				var9 = 7;
			} else if (var4.indexOf("6.2") != -1) {
				var9 = 9;
			} else if (var4.indexOf("6.3") != -1) {
				var9 = 10;
			} else if (var4.indexOf("10.0") != -1) {
				if (var5.indexOf("11") != -1) {
					var9 = 12;
				} else {
					var9 = 11;
				}
			} else if (var4.indexOf("11.0") != -1) {
				var9 = 12;
			}
		} else if (2 == var2) {
			if (var4.indexOf("10.4") != -1) {
				var9 = 20;
			} else if (var4.indexOf("10.5") != -1) {
				var9 = 21;
			} else if (var4.indexOf("10.6") != -1) {
				var9 = 22;
			} else if (var4.indexOf("10.7") != -1) {
				var9 = 23;
			} else if (var4.indexOf("10.8") != -1) {
				var9 = 24;
			} else if (var4.indexOf("10.9") != -1) {
				var9 = 25;
			} else if (var4.indexOf("10.10") != -1) {
				var9 = 26;
			} else if (var4.indexOf("10.11") != -1) {
				var9 = 27;
			} else if (var4.indexOf("10.12") != -1) {
				var9 = 28;
			} else if (var4.indexOf("10.13") != -1) {
				var9 = 29;
			} else if (var4.indexOf("10.14") != -1) {
				var9 = 30;
			} else if (var4.indexOf("10.15") != -1) {
				var9 = 31;
			} else if (var4.indexOf("11.") != -1) {
				var9 = 32;
			} else if (var4.indexOf("12.") != -1) {
				var9 = 33;
			} else if (var4.indexOf("13.") != -1) {
				var9 = 34;
			} else if (var4.indexOf("14.") != -1) {
				var9 = 35;
			}
		}

		byte var10;
		if (var6.toLowerCase().indexOf("sun") != -1) {
			var10 = 1;
		} else if (var6.toLowerCase().indexOf("microsoft") == -1) {
			var10 = 2;
		} else if (var6.toLowerCase().indexOf("apple") != -1) {
			var10 = 3;
		} else if (var6.toLowerCase().indexOf("oracle") != -1) {
			var10 = 5;
		} else {
			var10 = 4;
		}

		this.ag(var7);
		boolean var11 = false;
		int var12 = (int)(Runtime.getRuntime().maxMemory() / 1048576L) + 1;
		int var13;
		if (this.ae_fld > 3) {
			var13 = Runtime.getRuntime().availableProcessors();
		} else {
			var13 = 0;
		}

		byte var14 = 0;
		String var15 = "";
		String var16 = "";
		String var17 = "";
		String var18 = "";
		String var19 = "";
		String var20 = "";
		boolean var21 = false;
		boolean var22 = false;
		boolean var23 = false;
		boolean var24 = false;
		int[] var25 = new int[3];
		boolean var26 = false;
		String var27 = "";
		String var28 = "";
		String var29 = "";
		boolean var30 = false;
		return new vu(
			var2,
			var8,
			var9,
			var10,
			this.ae_fld,
			this.ah_fld,
			this.av_fld,
			false,
			var12,
			var13,
			var14,
			0,
			var15,
			var16,
			var17,
			var18,
			0,
			0,
			0,
			0,
			var19,
			var20,
			var25,
			0,
			"",
			"",
			var29
		);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
	)
	void au(String var1) {
		String[] var2 = var1.split("\\.");

		try {
			this.ae_fld = Integer.parseInt(var2[0]) * -1980886636;
			this.ah_fld = Integer.parseInt(var2[1]);
			this.av_fld = Integer.parseInt(var2[2]) * -303824259;
		} catch (Exception var4) {
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V"
	)
	void ag(String var1) {
		if (var1.startsWith("1.")) {
			ys(this, var1, -1913875076);
		} else {
			this.av(var1);
		}

		this.el(var1);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V"
	)
	void av(String var1) {
		String[] var3 = var1.split("\\.");

		try {
			this.ae_fld = Integer.parseInt(var3[0]);
			this.ah_fld = Integer.parseInt(var3[1]);
			this.av_fld = Integer.parseInt(var3[2]);
		} catch (Exception var5) {
		}
	}

	@ObfuscatedName("el")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
	)
	public void el(String var1) {
		this.ib(var1);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()Lvu;"
	)
	@Override
	public vu ae() {
		byte var1;
		if (fp.ax_fld.startsWith("win")) {
			var1 = 1;
		} else if (fp.ax_fld.startsWith("mac")) {
			var1 = 2;
		} else if (fp.ax_fld.startsWith("linux")) {
			var1 = 3;
		} else {
			var1 = 4;
		}

		String var2;
		try {
			var2 = System.getProperty("os.arch").toLowerCase();
		} catch (Exception var33) {
			var2 = "";
		}

		String var4;
		try {
			var4 = System.getProperty("os.name").toLowerCase();
		} catch (Exception var32) {
			var4 = "";
		}

		String var3;
		try {
			var3 = System.getProperty("os.version").toLowerCase();
		} catch (Exception var31) {
			var3 = "";
		}

		String var5 = "Unknown";
		String var6 = "1.1";

		try {
			var5 = System.getProperty("java.vendor");
			var6 = System.getProperty("java.version");
		} catch (Exception var30) {
		}

		boolean var7;
		if (!var2.startsWith("amd64") && !var2.startsWith("x86_64")) {
			var7 = false;
		} else {
			var7 = true;
		}

		byte var8 = 0;
		if (false) {
			if (var3.indexOf("4.0") != -1) {
				var8 = 1;
			} else if (var3.indexOf("4.1") != -1) {
				var8 = 2;
			} else if (var3.indexOf("4.9") != -1) {
				var8 = 3;
			} else if (var3.indexOf("5.0") != -1) {
				var8 = 4;
			} else if (var3.indexOf("5.1") != -1) {
				var8 = 5;
			} else if (var3.indexOf("5.2") != -1) {
				var8 = 8;
			} else if (var3.indexOf("6.0") != -1) {
				var8 = 6;
			} else if (var3.indexOf("6.1") != -1) {
				var8 = 7;
			} else if (var3.indexOf("6.2") != -1) {
				var8 = 9;
			} else if (var3.indexOf("6.3") != -1) {
				var8 = 10;
			} else if (var3.indexOf("10.0") != -1) {
				if (var4.indexOf("11") != -1) {
					var8 = 12;
				} else {
					var8 = 11;
				}
			} else if (var3.indexOf("11.0") != -1) {
				var8 = 12;
			}
		} else if (2 == var1) {
			if (var3.indexOf("10.4") != -1) {
				var8 = 20;
			} else if (var3.indexOf("10.5") != -1) {
				var8 = 21;
			} else if (var3.indexOf("10.6") != -1) {
				var8 = 22;
			} else if (var3.indexOf("10.7") != -1) {
				var8 = 23;
			} else if (var3.indexOf("10.8") != -1) {
				var8 = 24;
			} else if (var3.indexOf("10.9") != -1) {
				var8 = 25;
			} else if (var3.indexOf("10.10") != -1) {
				var8 = 26;
			} else if (var3.indexOf("10.11") != -1) {
				var8 = 27;
			} else if (var3.indexOf("10.12") != -1) {
				var8 = 28;
			} else if (var3.indexOf("10.13") != -1) {
				var8 = 29;
			} else if (var3.indexOf("10.14") != -1) {
				var8 = 30;
			} else if (var3.indexOf("10.15") != -1) {
				var8 = 31;
			} else if (var3.indexOf("11.") != -1) {
				var8 = 32;
			} else if (var3.indexOf("12.") != -1) {
				var8 = 33;
			} else if (var3.indexOf("13.") != -1) {
				var8 = 34;
			} else if (var3.indexOf("14.") != -1) {
				var8 = 35;
			}
		}

		byte var9;
		if (var5.toLowerCase().indexOf("sun") != -1) {
			var9 = 1;
		} else if (var5.toLowerCase().indexOf("microsoft") != -1) {
			var9 = 2;
		} else if (var5.toLowerCase().indexOf("apple") != -1) {
			var9 = 3;
		} else if (var5.toLowerCase().indexOf("oracle") != -1) {
			var9 = 5;
		} else {
			var9 = 4;
		}

		this.ag(var6);
		boolean var10 = false;
		int var11 = (int)(Runtime.getRuntime().maxMemory() / 1048576L) + 1;
		int var12;
		if (this.ae_fld > 3) {
			var12 = Runtime.getRuntime().availableProcessors();
		} else {
			var12 = 0;
		}

		byte var13 = 0;
		String var14 = "";
		String var15 = "";
		String var16 = "";
		String var17 = "";
		String var18 = "";
		String var19 = "";
		boolean var20 = false;
		boolean var21 = false;
		boolean var22 = false;
		boolean var23 = false;
		int[] var24 = new int[3];
		boolean var25 = false;
		String var26 = "";
		String var27 = "";
		String var28 = "";
		boolean var29 = false;
		return new vu(
			var1,
			var7,
			var8,
			var9,
			this.ae_fld,
			this.ah_fld,
			this.av_fld,
			false,
			var11,
			var12,
			var13,
			0,
			var14,
			var15,
			var16,
			var17,
			0,
			0,
			0,
			0,
			var18,
			var19,
			var24,
			0,
			"",
			"",
			var28
		);
	}

	public vo() {
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
	)
	void ay(String var1) {
		if (var1.startsWith("1.")) {
			ys(this, var1, -160403458);
		} else {
			this.av(var1);
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
	)
	void as(String var1) {
		String[] var2 = var1.split("\\.");

		try {
			this.ae_fld = Integer.parseInt(var2[1]) * -163351188;
			var2 = var2[2].split("_");
			this.ah_fld = Integer.parseInt(var2[0]) * 279378716;
			this.av_fld = Integer.parseInt(var2[1]) * -2086358494;
		} catch (Exception var4) {
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
	)
	void ar(String var1) {
		String[] var2 = var1.split("\\.");

		try {
			this.ae_fld = Integer.parseInt(var2[1]) * 1486689823;
			var2 = var2[2].split("_");
			this.ah_fld = Integer.parseInt(var2[0]) * 1288706494;
			this.av_fld = Integer.parseInt(var2[1]) * -1469411473;
		} catch (Exception var4) {
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()Lvu;"
	)
	@Override
	public vu ah() {
		byte var1;
		if (fp.ax_fld.startsWith("win")) {
			var1 = 1;
		} else if (fp.ax_fld.startsWith("mac")) {
			var1 = 2;
		} else if (fp.ax_fld.startsWith("linux")) {
			var1 = 3;
		} else {
			var1 = 4;
		}

		String var2;
		try {
			var2 = System.getProperty("os.arch").toLowerCase();
		} catch (Exception var33) {
			var2 = "";
		}

		String var4;
		try {
			var4 = System.getProperty("os.name").toLowerCase();
		} catch (Exception var32) {
			var4 = "";
		}

		String var3;
		try {
			var3 = System.getProperty("os.version").toLowerCase();
		} catch (Exception var31) {
			var3 = "";
		}

		String var5 = "Unknown";
		String var6 = "1.1";

		try {
			var5 = System.getProperty("java.vendor");
			var6 = System.getProperty("java.version");
		} catch (Exception var30) {
		}

		boolean var7;
		if (!var2.startsWith("amd64") && !var2.startsWith("x86_64")) {
			var7 = false;
		} else {
			var7 = true;
		}

		byte var8 = 0;
		if (false) {
			if (var3.indexOf("4.0") != -1) {
				var8 = 1;
			} else if (var3.indexOf("4.1") != -1) {
				var8 = 2;
			} else if (var3.indexOf("4.9") != -1) {
				var8 = 3;
			} else if (var3.indexOf("5.0") != -1) {
				var8 = 4;
			} else if (var3.indexOf("5.1") != -1) {
				var8 = 5;
			} else if (var3.indexOf("5.2") != -1) {
				var8 = 8;
			} else if (var3.indexOf("6.0") != -1) {
				var8 = 6;
			} else if (var3.indexOf("6.1") != -1) {
				var8 = 7;
			} else if (var3.indexOf("6.2") != -1) {
				var8 = 9;
			} else if (var3.indexOf("6.3") != -1) {
				var8 = 10;
			} else if (var3.indexOf("10.0") != -1) {
				if (var4.indexOf("11") != -1) {
					var8 = 12;
				} else {
					var8 = 11;
				}
			} else if (var3.indexOf("11.0") != -1) {
				var8 = 12;
			}
		} else if (2 == var1) {
			if (var3.indexOf("10.4") != -1) {
				var8 = 20;
			} else if (var3.indexOf("10.5") != -1) {
				var8 = 21;
			} else if (var3.indexOf("10.6") != -1) {
				var8 = 22;
			} else if (var3.indexOf("10.7") != -1) {
				var8 = 23;
			} else if (var3.indexOf("10.8") != -1) {
				var8 = 24;
			} else if (var3.indexOf("10.9") != -1) {
				var8 = 25;
			} else if (var3.indexOf("10.10") != -1) {
				var8 = 26;
			} else if (var3.indexOf("10.11") != -1) {
				var8 = 27;
			} else if (var3.indexOf("10.12") != -1) {
				var8 = 28;
			} else if (var3.indexOf("10.13") != -1) {
				var8 = 29;
			} else if (var3.indexOf("10.14") != -1) {
				var8 = 30;
			} else if (var3.indexOf("10.15") != -1) {
				var8 = 31;
			} else if (var3.indexOf("11.") != -1) {
				var8 = 32;
			} else if (var3.indexOf("12.") != -1) {
				var8 = 33;
			} else if (var3.indexOf("13.") != -1) {
				var8 = 34;
			} else if (var3.indexOf("14.") != -1) {
				var8 = 35;
			}
		}

		byte var9;
		if (var5.toLowerCase().indexOf("sun") != -1) {
			var9 = 1;
		} else if (var5.toLowerCase().indexOf("microsoft") != -1) {
			var9 = 2;
		} else if (var5.toLowerCase().indexOf("apple") != -1) {
			var9 = 3;
		} else if (var5.toLowerCase().indexOf("oracle") != -1) {
			var9 = 5;
		} else {
			var9 = 4;
		}

		this.ag(var6);
		boolean var10 = false;
		int var11 = (int)(Runtime.getRuntime().maxMemory() / 1048576L) + 1;
		int var12;
		if (this.ae_fld > 3) {
			var12 = Runtime.getRuntime().availableProcessors();
		} else {
			var12 = 0;
		}

		byte var13 = 0;
		String var14 = "";
		String var15 = "";
		String var16 = "";
		String var17 = "";
		String var18 = "";
		String var19 = "";
		boolean var20 = false;
		boolean var21 = false;
		boolean var22 = false;
		boolean var23 = false;
		int[] var24 = new int[3];
		boolean var25 = false;
		String var26 = "";
		String var27 = "";
		String var28 = "";
		boolean var29 = false;
		return new vu(
			var1,
			var7,
			var8,
			var9,
			this.ae_fld,
			this.ah_fld,
			this.av_fld,
			false,
			var11,
			var12,
			var13,
			0,
			var14,
			var15,
			var16,
			var17,
			0,
			0,
			0,
			0,
			var18,
			var19,
			var24,
			0,
			"",
			"",
			var28
		);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
	)
	void ax(String var1) {
		String[] var2 = var1.split("\\.");

		try {
			this.ae_fld = Integer.parseInt(var2[0]) * -614935121;
			this.ah_fld = Integer.parseInt(var2[1]) * -730967429;
			this.av_fld = Integer.parseInt(var2[2]) * 1926875676;
		} catch (Exception var4) {
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V"
	)
	void az(String var1, int var2) {
		String[] var3 = var1.split("\\.");

		try {
			this.ae_fld = Integer.parseInt(var3[1]);
			var3 = var3[2].split("_");
			this.av_fld = Integer.parseInt(var3[0]) * -1509120095;
			this.ah_fld = Integer.parseInt(var3[1]) * -363111279;
		} catch (Exception var5) {
		}
	}
}
