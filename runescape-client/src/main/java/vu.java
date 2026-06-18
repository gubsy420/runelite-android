import java.awt.event.WindowEvent;
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
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	@Export("arch64")
	boolean arch64;
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
	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -564123899
	)
	int bb_fld;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int at_fld;
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@Export("osType")
	@ObfuscatedGetter(
		intValue = -2048773107
	)
	public int osType;
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean ba_fld;
	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@Export("osVersion")
	@ObfuscatedGetter(
		intValue = 205734307
	)
	int osVersion;
	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@Export("classSigHash")
	@ObfuscatedGetter(
		intValue = -792819237
	)
	int classSigHash;
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 251722053
	)
	int bn_fld;
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -66498549
	)
	int bc_fld;
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -182219735
	)
	int bw_fld;
	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	String cg_fld;
	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@Export("maxHeapMb")
	@ObfuscatedGetter(
		intValue = 2076850581
	)
	int maxHeapMb;
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@Export("javaVendor")
	@ObfuscatedGetter(
		intValue = 855290095
	)
	int javaVendor;
	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@Export("cpuCount")
	@ObfuscatedGetter(
		intValue = -263334553
	)
	int cpuCount;
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
	String processName;
	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	@Export("parentProcessName")
	String parentProcessName;
	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@Export("javaVersionMajor")
	@ObfuscatedGetter(
		intValue = -168945063
	)
	int javaVersionMajor;
	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@Export("javaVersionMinor")
	@ObfuscatedGetter(
		intValue = 99794559
	)
	int javaVersionMinor;
	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@Export("javaVersionPatch")
	@ObfuscatedGetter(
		intValue = 1907875181
	)
	int javaVersionPatch;
	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 379982899
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
	int[] versionInts = new int[3];
	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -205016205
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
	String jvmArgsPrefix;

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int ag() {
		byte var2 = 39;
		int var3 = var2 + gr.bn(this.cc_fld);
		var3 += gr.bn(this.cq_fld);
		var3 += gr.bn(this.processName);
		var3 += gr.bn(this.parentProcessName);
		var3 += gr.bn(this.ce_fld);
		var3 += gr.bn(this.cn_fld);
		var3 += gr.bn(this.cg_fld);
		return var3 + gr.bn(this.jvmArgsPrefix);
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
		this.osType = var1;
		this.ba_fld = var2;
		this.osVersion = var3;
		this.javaVendor = var4;
		this.bn_fld = var5;
		this.bc_fld = var6;
		this.bw_fld = var7;
		this.arch64 = var8;
		this.maxHeapMb = var9;
		this.cpuCount = var10;
		this.bb_fld = var11;
		this.classSigHash = var12;
		this.cc_fld = var13;
		this.cq_fld = var14;
		this.processName = var15;
		this.parentProcessName = var16;
		this.javaVersionMajor = var17;
		this.javaVersionMinor = var18;
		this.javaVersionPatch = var19;
		this.cp_fld = var20;
		this.ce_fld = var21;
		this.cn_fld = var22;
		this.versionInts = var23;
		this.ca_fld = var24;
		this.cg_fld = var25;
		this.jvmArgsPrefix = var26;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;"
	)
	public String al(int var1) {
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
		descriptor = "(II)Ljava/lang/String;"
	)
	public String az(int var1) {
		return "12345678-0000-0000-0000-123456789012";
	}

	@ObfuscatedName("fj")
	@ObfuscatedSignature(
		descriptor = "(Ltf;Ljava/awt/event/WindowEvent;)V"
	)
	public static void fj(tf var0, WindowEvent var1) {
		if (var0 == null) {
			var0.getClass();
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	public void aw(xi var1) {
		var1.ea(9);
		var1.ea(-2114800038 * this.osType);
		var1.ea(this.ba_fld ? 1 : 0);
		xi.vy(var1, this.osVersion * 1213798017);
		var1.ea(this.javaVendor);
		var1.ea(this.bn_fld);
		var1.ea(this.bc_fld);
		var1.ea(-1062848968 * this.bw_fld);
		var1.ea(this.arch64 ? 1 : 0);
		xi.vy(var1, this.maxHeapMb);
		var1.ea(this.cpuCount * -148215907);
		var1.bc(this.bb_fld);
		xi.vy(var1, this.classSigHash * -39238689);
		var1.cc(this.cc_fld);
		var1.cc(this.cq_fld);
		var1.cc(this.processName);
		var1.cc(this.parentProcessName);
		var1.ea(this.javaVersionMinor * 1322981502);
		xi.vy(var1, this.javaVersionMajor);
		var1.cc(this.ce_fld);
		var1.cc(this.cn_fld);
		var1.ea(this.javaVersionPatch);
		var1.ea(-686864586 * this.cp_fld);

		for (int var2 = 0; var2 < this.versionInts.length; var2++) {
			var1.eb(this.versionInts[var2]);
		}

		var1.eb(this.ca_fld * -499119229);
		var1.cc(this.cg_fld);
		var1.cc(this.jvmArgsPrefix);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	public void ah(xi var1) {
		var1.ea(9);
		var1.ea(this.osType);
		var1.ea(this.ba_fld ? 1 : 0);
		xi.vy(var1, this.osVersion);
		var1.ea(this.javaVendor);
		var1.ea(this.bn_fld);
		var1.ea(this.bc_fld);
		var1.ea(this.bw_fld);
		var1.ea(this.arch64 ? 1 : 0);
		xi.vy(var1, this.maxHeapMb);
		var1.ea(this.cpuCount);
		var1.bc(this.bb_fld);
		xi.vy(var1, this.classSigHash);
		var1.cc(this.cc_fld);
		var1.cc(this.cq_fld);
		var1.cc(this.processName);
		var1.cc(this.parentProcessName);
		var1.ea(this.javaVersionMinor);
		xi.vy(var1, this.javaVersionMajor);
		var1.cc(this.ce_fld);
		var1.cc(this.cn_fld);
		var1.ea(this.javaVersionPatch);
		var1.ea(this.cp_fld);

		for (int var2 = 0; var2 < this.versionInts.length; var2++) {
			var1.eb(this.versionInts[var2]);
		}

		var1.eb(this.ca_fld);
		var1.cc(this.cg_fld);
		var1.cc(this.jvmArgsPrefix);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	public void av(xi var1) {
		var1.ea(9);
		var1.ea(145625936 * this.osType);
		var1.ea(this.ba_fld ? 1 : 0);
		xi.vy(var1, this.osVersion * 1062486611);
		var1.ea(-915887538 * this.javaVendor);
		var1.ea(this.bn_fld);
		var1.ea(this.bc_fld * 712698638);
		var1.ea(this.bw_fld);
		var1.ea(this.arch64 ? 1 : 0);
		xi.vy(var1, this.maxHeapMb * 2066923205);
		var1.ea(this.cpuCount);
		var1.bc(this.bb_fld * -388610472);
		xi.vy(var1, this.classSigHash * -1843842644);
		var1.cc(this.cc_fld);
		var1.cc(this.cq_fld);
		var1.cc(this.processName);
		var1.cc(this.parentProcessName);
		var1.ea(this.javaVersionMinor * 1704328373);
		xi.vy(var1, this.javaVersionMajor);
		var1.cc(this.ce_fld);
		var1.cc(this.cn_fld);
		var1.ea(-1481363651 * this.javaVersionPatch);
		var1.ea(-196926843 * this.cp_fld);

		for (int var2 = 0; var2 < this.versionInts.length; var2++) {
			var1.eb(this.versionInts[var2]);
		}

		var1.eb(this.ca_fld);
		var1.cc(this.cg_fld);
		var1.cc(this.jvmArgsPrefix);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	public void ae(xi var1) {
		var1.ea(9);
		var1.ea(this.osType);
		var1.ea(this.ba_fld ? 1 : 0);
		xi.vy(var1, this.osVersion);
		var1.ea(this.javaVendor);
		var1.ea(this.bn_fld);
		var1.ea(this.bc_fld);
		var1.ea(this.bw_fld);
		var1.ea(this.arch64 ? 1 : 0);
		xi.vy(var1, this.maxHeapMb);
		var1.ea(this.cpuCount);
		var1.bc(this.bb_fld);
		xi.vy(var1, this.classSigHash);
		var1.cc(this.cc_fld);
		var1.cc(this.cq_fld);
		var1.cc(this.processName);
		var1.cc(this.parentProcessName);
		var1.ea(this.javaVersionMinor);
		xi.vy(var1, this.javaVersionMajor);
		var1.cc(this.ce_fld);
		var1.cc(this.cn_fld);
		var1.ea(this.javaVersionPatch);
		var1.ea(this.cp_fld);

		for (int var2 = 0; var2 < this.versionInts.length; var2++) {
			var1.eb(this.versionInts[var2]);
		}

		var1.eb(this.ca_fld);
		var1.cc(this.cg_fld);
		var1.cc(this.jvmArgsPrefix);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ay() {
		byte var1 = 39;
		int var2 = var1 + gr.bn(this.cc_fld);
		var2 += gr.bn(this.cq_fld);
		var2 += gr.bn(this.processName);
		var2 += gr.bn(this.parentProcessName);
		var2 += gr.bn(this.ce_fld);
		var2 += gr.bn(this.cn_fld);
		var2 += gr.bn(this.cg_fld);
		return var2 + gr.bn(this.jvmArgsPrefix);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public static void ak() {
		pr.ak_fld.av();
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lxi;B)V"
	)
	@Export("serializeFingerprint")
	public void ak(xi var1) {
		var1.ea(9);
		var1.ea(this.osType);
		var1.ea(this.ba_fld ? 1 : 0);
		xi.vy(var1, this.osVersion);
		var1.ea(this.javaVendor);
		var1.ea(this.bn_fld);
		var1.ea(this.bc_fld);
		var1.ea(this.bw_fld);
		var1.ea(this.arch64 ? 1 : 0);
		xi.vy(var1, this.maxHeapMb);
		var1.ea(this.cpuCount);
		var1.bc(this.bb_fld);
		xi.vy(var1, this.classSigHash);
		var1.cc(this.cc_fld);
		var1.cc(this.cq_fld);
		var1.cc(this.processName);
		var1.cc(this.parentProcessName);
		var1.ea(this.javaVersionMinor);
		xi.vy(var1, this.javaVersionMajor);
		var1.cc(this.ce_fld);
		var1.cc(this.cn_fld);
		var1.ea(this.javaVersionPatch);
		var1.ea(this.cp_fld);

		for (int var3 = 0; var3 < this.versionInts.length; var3++) {
			var1.eb(this.versionInts[var3]);
		}

		var1.eb(this.ca_fld);
		var1.cc(this.cg_fld);
		var1.cc(this.jvmArgsPrefix);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int as() {
		int var1 = -957366880;
		var1 += gr.bn(this.cc_fld);
		var1 += gr.bn(this.cq_fld);
		var1 += gr.bn(this.processName);
		var1 += gr.bn(this.parentProcessName);
		var1 += gr.bn(this.ce_fld);
		var1 += gr.bn(this.cn_fld);
		var1 += gr.bn(this.cg_fld);
		return var1 + gr.bn(this.jvmArgsPrefix);
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

	// $VF: Could not properly define all variable types!
	// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public static void bu() {
		try {
			java.lang.Object var0;
			if (false) {
				IllegalStateException var10000 = new IllegalStateException();
				ProcessHandle var1 = ProcessHandle.current();
				if (var1.info().command().isPresent()) {
					kg.fingerprint.processName = Paths.get(var1.info().command().get()).getFileName().toString();
					if (kg.fingerprint.processName.length() > 10) {
						kg.fingerprint.processName = kg.fingerprint.processName.substring(0, 10);
					}
				}

				ProcessHandle var2 = (ProcessHandle)(ProcessHandle)var1.parent().orElse(null);
				if (var2 != null && var2.info().command().isPresent()) {
					kg.fingerprint.parentProcessName = Paths.get(var2.info().command().get()).getFileName().toString();
					if (kg.fingerprint.parentProcessName.length() > 10) {
						kg.fingerprint.parentProcessName = kg.fingerprint.parentProcessName.substring(0, 10);
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
						kg.fingerprint.jvmArgsPrefix = var8;
						if (kg.fingerprint.jvmArgsPrefix.length() > 22) {
							kg.fingerprint.jvmArgsPrefix = kg.fingerprint.jvmArgsPrefix.substring(0, 22);
						}
					}
				}

				throw var10000;
			}
		} catch (Exception var9) {
		}
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

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ar() {
		byte var1 = 39;
		int var2 = var1 + gr.bn(this.cc_fld);
		var2 += gr.bn(this.cq_fld);
		var2 += gr.bn(this.processName);
		var2 += gr.bn(this.parentProcessName);
		var2 += gr.bn(this.ce_fld);
		var2 += gr.bn(this.cn_fld);
		var2 += gr.bn(this.cg_fld);
		return var2 + gr.bn(this.jvmArgsPrefix);
	}
}
