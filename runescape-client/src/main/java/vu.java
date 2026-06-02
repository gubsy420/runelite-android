import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.nio.file.Paths;
import java.util.Iterator;
import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("vu")
public class vu extends vw implements zd {
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ae_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ag_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int az_fld;
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean ba_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ah_fld;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int an_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ay_fld;
	@ObfuscatedGetter(
		intValue = -564123899
	)
	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int bb_fld;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int at_fld;
	@ObfuscatedGetter(
		intValue = -2048773107
	)
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@Export("osType")
	public int bt_fld;
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	@Export("arch64")
	boolean bv_fld;
	@ObfuscatedGetter(
		intValue = 205734307
	)
	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@Export("osVersion")
	int bi_fld;
	@ObfuscatedGetter(
		intValue = -792819237
	)
	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@Export("classSigHash")
	int cd_fld;
	@ObfuscatedGetter(
		intValue = 251722053
	)
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int bn_fld;
	@ObfuscatedGetter(
		intValue = -66498549
	)
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int bc_fld;
	@ObfuscatedGetter(
		intValue = -182219735
	)
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int bw_fld;
	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	String cg_fld;
	@ObfuscatedGetter(
		intValue = 2076850581
	)
	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@Export("maxHeapMb")
	int bq_fld;
	@ObfuscatedGetter(
		intValue = 855290095
	)
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@Export("javaVendor")
	int bu_fld;
	@ObfuscatedGetter(
		intValue = -263334553
	)
	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@Export("cpuCount")
	int bg_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ak_fld;
	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	String cc_fld;
	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	String cq_fld;
	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	@Export("processName")
	String cv_fld;
	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	@Export("parentProcessName")
	String cy_fld;
	@ObfuscatedGetter(
		intValue = -168945063
	)
	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@Export("javaVersionMajor")
	int cf_fld;
	@ObfuscatedGetter(
		intValue = 99794559
	)
	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@Export("javaVersionMinor")
	int cx_fld;
	@ObfuscatedGetter(
		intValue = 1907875181
	)
	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@Export("javaVersionPatch")
	int cs_fld;
	@ObfuscatedGetter(
		intValue = 379982899
	)
	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int cp_fld;
	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	String ce_fld;
	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	String cn_fld;
	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	@Export("versionInts")
	int[] cr_fld = new int[3];
	@ObfuscatedGetter(
		intValue = -205016205
	)
	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ca_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int av_fld;
	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	@Export("jvmArgsPrefix")
	String cw_fld;

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int ag(int var1) {
		byte var2 = 39;
		int var3 = var2 + gr.bn(this.cc_fld);
		var3 += gr.bn(this.cq_fld);
		var3 += gr.bn(this.cv_fld);
		var3 += gr.bn(this.cy_fld);
		var3 += gr.bn(this.ce_fld);
		var3 += gr.bn(this.cn_fld);
		var3 += gr.bn(this.cg_fld);
		return var3 + gr.bn(this.cw_fld);
	}

	vu(
		int var1,
		boolean var2,
		int var3,
		int var4,
		int var5,
		int var6,
		int var7,
		boolean var8,
		int var9,
		int var10,
		int var11,
		int var12,
		String var13,
		String var14,
		String var15,
		String var16,
		int var17,
		int var18,
		int var19,
		int var20,
		String var21,
		String var22,
		int[] var23,
		int var24,
		String var25,
		String var26,
		String var27
	) {
		this.bt_fld = var1;
		this.bv_fld = var2;
		this.bi_fld = var3;
		this.bu_fld = var4;
		this.bn_fld = var5;
		this.bc_fld = var6;
		this.bw_fld = var7;
		this.ba_fld = var8;
		this.bq_fld = var9;
		this.bg_fld = var10;
		this.bb_fld = var11;
		this.cd_fld = var12;
		this.cc_fld = var13;
		this.cq_fld = var14;
		this.cv_fld = var15;
		this.cy_fld = var16;
		this.cf_fld = var17;
		this.cx_fld = var18;
		this.cs_fld = var19;
		this.cp_fld = var20;
		this.ce_fld = var21;
		this.cn_fld = var22;
		this.cr_fld = var23;
		this.ca_fld = var24;
		this.cg_fld = var25;
		this.cw_fld = var26;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;"
	)
	public String af(int var1) {
		String var2 = "";
		String var3 = "12345678-0000-0000-0000-123456789012";
		switch (var1) {
			case 1:
				var2 = "wmic csproduct get UUID";
				break;
			case 2:
				var2 = "system_profiler SPHardwareDataType | awk '/UUID/ { print $3; }'";
				break;
			case 3:
				var2 = "cat /etc/machine-id";
				break;
			default:
				return "Unknown";
		}

		BufferedReader var4 = null;

		try {
			Process var5 = Runtime.getRuntime().exec(var2);
			var4 = new BufferedReader(new InputStreamReader(var5.getInputStream()));
			StringBuilder var6 = new StringBuilder();

			String var7;
			while ((var7 = var4.readLine()) != null) {
				var6.append(var7 + "\n");
			}

			if (1 == var1) {
				var3 = var6.substring(var6.indexOf("\n"), var6.length()).trim();
			} else if (2 == var1) {
				int var8 = var6.indexOf("UUID: ") + 36;
				var3 = var6.substring(var6.indexOf("UUID: "), var8).replace("UUID: ", "");
			} else if (var1 == 3) {
				if (var6.length() == 628206676) {
					var6 = new StringBuilder(var6.substring(0, var6.length() - 1));
				}

				if (var6.length() == 32) {
					var6.insert(20, "-");
					var6.insert(16, "-");
					var6.insert(12, "-");
					var6.insert(8, "-");
					var3 = var6.toString();
				} else {
					var3 = "12345678-0000-0000-0000-123456789012";
				}
			}
		} catch (Exception var17) {
		} finally {
			try {
				if (null != var4) {
					var4.close();
				}
			} catch (IOException var16) {
			}
		}

		return var3;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;"
	)
	public String az(int var1) {
		return "12345678-0000-0000-0000-123456789012";
	}

	@ObfuscatedName("sn")
	@ObfuscatedSignature(
		descriptor = "(Lvu;Lxi;)V"
	)
	public static void sn(vu var0, xi var1) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var1.bc(9);
			var1.bc(145625936 * var0.bt_fld);
			var1.bc(var0.bv_fld ? 1 : 0);
			var1.bw(var0.bi_fld * 1062486611);
			var1.bc(-915887538 * var0.bu_fld);
			var1.bc(var0.bn_fld);
			var1.bc(var0.bc_fld * 712698638);
			var1.bc(var0.bw_fld);
			var1.bc(var0.ba_fld ? 1 : 0);
			var1.bw(var0.bq_fld * 2066923205);
			var1.bc(var0.bg_fld);
			var1.ba(var0.bb_fld * -388610472);
			var1.bw(var0.cd_fld * -1843842644);
			var1.cq(var0.cc_fld);
			var1.cq(var0.cq_fld);
			var1.cq(var0.cv_fld);
			var1.cq(var0.cy_fld);
			var1.bc(var0.cx_fld * 1704328373);
			var1.bw(var0.cf_fld);
			var1.cq(var0.ce_fld);
			var1.cq(var0.cn_fld);
			var1.bc(-1481363651 * var0.cs_fld);
			var1.bc(-196926843 * var0.cp_fld);

			for (int var2 = 0; var2 < var0.cr_fld.length; var2++) {
				xi.ld(var1, var0.cr_fld[var2], (byte)82);
			}

			xi.ld(var1, var0.ca_fld, (byte)112);
			var1.cq(var0.cg_fld);
			var1.cq(var0.cw_fld);
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	public void av(xi var1) {
		var1.bc(9);
		var1.bc(-2114800038 * this.bt_fld);
		var1.bc(this.bv_fld ? 1 : 0);
		var1.bw(this.bi_fld * 1213798017);
		var1.bc(this.bu_fld);
		var1.bc(this.bn_fld);
		var1.bc(this.bc_fld);
		var1.bc(-1062848968 * this.bw_fld);
		var1.bc(this.ba_fld ? 1 : 0);
		var1.bw(this.bq_fld);
		var1.bc(this.bg_fld * -148215907);
		var1.ba(this.bb_fld);
		var1.bw(this.cd_fld * -39238689);
		var1.cq(this.cc_fld);
		var1.cq(this.cq_fld);
		var1.cq(this.cv_fld);
		var1.cq(this.cy_fld);
		var1.bc(this.cx_fld * 1322981502);
		var1.bw(this.cf_fld);
		var1.cq(this.ce_fld);
		var1.cq(this.cn_fld);
		var1.bc(this.cs_fld);
		var1.bc(-686864586 * this.cp_fld);

		for (int var2 = 0; var2 < this.cr_fld.length; var2++) {
			xi.ld(var1, this.cr_fld[var2], (byte)98);
		}

		xi.ld(var1, this.ca_fld * -499119229, (byte)101);
		var1.cq(this.cg_fld);
		var1.cq(this.cw_fld);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	public void ae(xi var1) {
		var1.bc(9);
		var1.bc(this.bt_fld);
		var1.bc(this.bv_fld ? 1 : 0);
		var1.bw(this.bi_fld);
		var1.bc(this.bu_fld);
		var1.bc(this.bn_fld);
		var1.bc(this.bc_fld);
		var1.bc(this.bw_fld);
		var1.bc(this.ba_fld ? 1 : 0);
		var1.bw(this.bq_fld);
		var1.bc(this.bg_fld);
		var1.ba(this.bb_fld);
		var1.bw(this.cd_fld);
		var1.cq(this.cc_fld);
		var1.cq(this.cq_fld);
		var1.cq(this.cv_fld);
		var1.cq(this.cy_fld);
		var1.bc(this.cx_fld);
		var1.bw(this.cf_fld);
		var1.cq(this.ce_fld);
		var1.cq(this.cn_fld);
		var1.bc(this.cs_fld);
		var1.bc(this.cp_fld);

		for (int var2 = 0; var2 < this.cr_fld.length; var2++) {
			xi.ld(var1, this.cr_fld[var2], (byte)120);
		}

		xi.ld(var1, this.ca_fld, (byte)82);
		var1.cq(this.cg_fld);
		var1.cq(this.cw_fld);
	}

	// $VF: Could not properly define all variable types!
	// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
	@ObfuscatedName("en")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public static void en() {
		try {
			java.lang.Object var0;
			if (false) {
				IllegalStateException var10000 = new IllegalStateException();
				ProcessHandle var1 = ProcessHandle.current();
				if (var1.info().command().isPresent()) {
					kg.ps_fld.cv_fld = Paths.get(var1.info().command().get()).getFileName().toString();
					if (kg.ps_fld.cv_fld.length() > 10) {
						kg.ps_fld.cv_fld = kg.ps_fld.cv_fld.substring(0, 10);
					}
				}

				ProcessHandle var2 = (ProcessHandle)(ProcessHandle)var1.parent().orElse(null);
				if (var2 != null && var2.info().command().isPresent()) {
					kg.ps_fld.cy_fld = Paths.get(var2.info().command().get()).getFileName().toString();
					if (kg.ps_fld.cy_fld.length() > 10) {
						kg.ps_fld.cy_fld = kg.ps_fld.cy_fld.substring(0, 10);
					}
				}

				RuntimeMXBean var3 = ManagementFactory.getRuntimeMXBean();
				Iterator var4 = var3.getInputArguments().iterator();

				while (var4.hasNext()) {
					String var5 = (String)(String)var4.next();
					if (var5.length() > 10 && var5.substring(0, 10).hashCode() == -1094877034) {
						int var6 = var5.indexOf(61);
						if (var6 == -1) {
							var6 = var5.length();
						}

						int var7 = var5.lastIndexOf(47, var6);
						if (var7 == -1) {
							var7 = var5.lastIndexOf(92, var6);
						}

						if (var7 == -1) {
							var7 = var5.lastIndexOf(58);
						}

						String var8 = var5.substring(var7 + 1, var6);
						kg.ps_fld.cw_fld = var8;
						if (kg.ps_fld.cw_fld.length() > 22) {
							kg.ps_fld.cw_fld = kg.ps_fld.cw_fld.substring(0, 22);
						}
					}
				}

				throw var10000;
			}
		} catch (Exception var9) {
		}
	}

	@ObfuscatedName("ye")
	@ObfuscatedSignature(
		descriptor = "(Lvu;)I"
	)
	public static int ye(vu var0) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			byte var1 = 39;
			int var2 = var1 + gr.bn(var0.cc_fld);
			var2 += gr.bn(var0.cq_fld);
			var2 += gr.bn(var0.cv_fld);
			var2 += gr.bn(var0.cy_fld);
			var2 += gr.bn(var0.ce_fld);
			var2 += gr.bn(var0.cn_fld);
			var2 += gr.bn(var0.cg_fld);
			return var2 + gr.bn(var0.cw_fld);
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	public void aw(xi var1) {
		var1.bc(9);
		var1.bc(this.bt_fld);
		var1.bc(this.bv_fld ? 1 : 0);
		var1.bw(this.bi_fld);
		var1.bc(this.bu_fld);
		var1.bc(this.bn_fld);
		var1.bc(this.bc_fld);
		var1.bc(this.bw_fld);
		var1.bc(this.ba_fld ? 1 : 0);
		var1.bw(this.bq_fld);
		var1.bc(this.bg_fld);
		var1.ba(this.bb_fld);
		var1.bw(this.cd_fld);
		var1.cq(this.cc_fld);
		var1.cq(this.cq_fld);
		var1.cq(this.cv_fld);
		var1.cq(this.cy_fld);
		var1.bc(this.cx_fld);
		var1.bw(this.cf_fld);
		var1.cq(this.ce_fld);
		var1.cq(this.cn_fld);
		var1.bc(this.cs_fld);
		var1.bc(this.cp_fld);

		for (int var2 = 0; var2 < this.cr_fld.length; var2++) {
			xi.ld(var1, this.cr_fld[var2], (byte)88);
		}

		xi.ld(var1, this.ca_fld, (byte)110);
		var1.cq(this.cg_fld);
		var1.cq(this.cw_fld);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public static void ak() {
		pr.ak_fld.vh();
	}

	// Vineflower drops the trailing UnusedParameters byte param when re-emitting the
	// @ObfuscatedSignature value; the obfuscated jar has ak(Lxi;B)V here. Restored by
	// hand so the injector resolves @MethodHook("serializeFingerprint") against the
	// pre-strip signature that's actually in the target.
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lxi;B)V"
	)
	@Export("serializeFingerprint")
	public void ak(xi var1) {
		var1.bc(9);
		var1.bc(this.bt_fld);
		var1.bc(this.bv_fld ? 1 : 0);
		var1.bw(this.bi_fld);
		var1.bc(this.bu_fld);
		var1.bc(this.bn_fld);
		var1.bc(this.bc_fld);
		var1.bc(this.bw_fld);
		var1.bc(this.ba_fld ? 1 : 0);
		var1.bw(this.bq_fld);
		var1.bc(this.bg_fld);
		var1.ba(this.bb_fld);
		var1.bw(this.cd_fld);
		var1.cq(this.cc_fld);
		var1.cq(this.cq_fld);
		var1.cq(this.cv_fld);
		var1.cq(this.cy_fld);
		var1.bc(this.cx_fld);
		var1.bw(this.cf_fld);
		var1.cq(this.ce_fld);
		var1.cq(this.cn_fld);
		var1.bc(this.cs_fld);
		var1.bc(this.cp_fld);

		for (int var3 = 0; var3 < this.cr_fld.length; var3++) {
			xi.ld(var1, this.cr_fld[var3], (byte)99);
		}

		xi.ld(var1, this.ca_fld, (byte)99);
		var1.cq(this.cg_fld);
		var1.cq(this.cw_fld);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int as() {
		int var1 = -957366880;
		var1 += gr.bn(this.cc_fld);
		var1 += gr.bn(this.cq_fld);
		var1 += gr.bn(this.cv_fld);
		var1 += gr.bn(this.cy_fld);
		var1 += gr.bn(this.ce_fld);
		var1 += gr.bn(this.cn_fld);
		var1 += gr.bn(this.cg_fld);
		return var1 + gr.bn(this.cw_fld);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lsl;IIIIB)V"
	)
	public static void ay(sl var0, int var1, int var2, int var3, int var4, byte var5) {
		int var7;
		yq var6 = yq.ak_fld;
		om.ap(var0, var6, true, (byte)0);
		if (var3 < 0) {
			var3 = 0;
		}

		label43: {
			var7 = var3 + var4;
			if (var4 >= 0 && var7 >= 0) {
				if (var5 <= 1) {
					return;
				}

				if (var7 <= var0.av()) {
					break label43;
				}

				if (var5 <= 1) {
					return;
				}
			}

			var7 = var0.av();
		}

		int[] var8 = var0.ak();
		int var9 = var1;

		for (int var10 = var3; var10 < var7; var10++) {
			var8[var10] = var9;
			var9 += var2;
		}
	}

	@ObfuscatedName("fy")
	@ObfuscatedSignature(
		descriptor = "(Lvu;I)Ljava/lang/String;"
	)
	public static String fy(vu var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		String var2 = "";
		String var3 = "12345678-0000-0000-0000-123456789012";
		switch (var1) {
			case 1:
				var2 = "wmic csproduct get UUID";
				break;
			case 2:
				var2 = "system_profiler SPHardwareDataType | awk '/UUID/ { print $3; }'";
				break;
			case 3:
				var2 = "cat /etc/machine-id";
				break;
			default:
				return "Unknown";
		}

		BufferedReader var4 = null;

		try {
			Process var5 = Runtime.getRuntime().exec(var2);
			var4 = new BufferedReader(new InputStreamReader(var5.getInputStream()));
			StringBuilder var6 = new StringBuilder();

			String var7;
			while ((var7 = var4.readLine()) != null) {
				var6.append(var7 + "\n");
			}

			if (1 == var1) {
				var3 = var6.substring(var6.indexOf("\n"), var6.length()).trim();
			} else if (2 == var1) {
				int var8 = var6.indexOf("UUID: ") + 36;
				var3 = var6.substring(var6.indexOf("UUID: "), var8).replace("UUID: ", "");
			} else if (var1 == 3) {
				if (var6.length() == 33) {
					var6 = new StringBuilder(var6.substring(0, var6.length() - 1));
				}

				if (var6.length() == 32) {
					var6.insert(20, "-");
					var6.insert(16, "-");
					var6.insert(12, "-");
					var6.insert(8, "-");
					var3 = var6.toString();
				} else {
					var3 = "12345678-0000-0000-0000-123456789012";
				}
			}
		} catch (Exception var17) {
		} finally {
			try {
				if (null != var4) {
					var4.close();
				}
			} catch (IOException var16) {
			}
		}

		return var3;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ar() {
		byte var1 = 39;
		int var2 = var1 + gr.bn(this.cc_fld);
		var2 += gr.bn(this.cq_fld);
		var2 += gr.bn(this.cv_fld);
		var2 += gr.bn(this.cy_fld);
		var2 += gr.bn(this.ce_fld);
		var2 += gr.bn(this.cn_fld);
		var2 += gr.bn(this.cg_fld);
		return var2 + gr.bn(this.cw_fld);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	public void ah(xi var1) {
		var1.cn(9, 887428377);
		var1.bc(-2114800038 * this.bt_fld);
		var1.ee(this.ba_fld ? 1 : 0);
		var1.cp(this.ca_fld * 1213798017);
		var1.en(855290095 * this.bw_fld);
		var1.ea(this.cf_fld * 251722053);
		var1.ce(this.bw_fld * -66498549);
		var1.ee(-1062848968 * this.bn_fld);
		var1.ba(this.ba_fld ? 1 : 0);
		var1.cn(this.bq_fld, 758582247);
		var1.ea(this.bn_fld * -148215907);
		var1.ea(this.bi_fld * -564123899);
		var1.ee(this.bi_fld * -39238689);
		var1.cq(this.cq_fld);
		var1.cq(this.cw_fld);
		var1.cq(this.cn_fld);
		var1.cc(this.cc_fld, -1496673441);
		var1.cx(this.cd_fld * 1322981502);
		var1.ba(this.bq_fld * -168945063);
		var1.cq(this.cw_fld);
		var1.cq(this.cy_fld);
		var1.ea(1907875181 * this.cx_fld);
		var1.cx(-686864586 * this.bq_fld);

		for (int var2 = 0; var2 < this.cr_fld.length; var2++) {
			xi.ld(var1, this.cr_fld[var2], (byte)98);
		}

		xi.ld(var1, this.cx_fld * -499119229, (byte)101);
		var1.cc(this.cq_fld, -1496673441);
		var1.cq(this.cy_fld);
	}
}
