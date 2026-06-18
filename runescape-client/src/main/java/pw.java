import java.io.EOFException;
import net.runelite.api.IterableHashTable;
import net.runelite.api.StructComposition;
import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("pw")
@Implements({"StructComposition"})
public class pw extends vc implements StructComposition, rl9 {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	public static ub ak_fld;
	@ObfuscatedName("uk")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int uk_fld = -1;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ay_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lxv;"
	)
	xv az_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	public static iw ag_fld = new iw(64);
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	static String bm_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int as_fld;

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Lpw;"
	)
	public static pw ay(int var0) throws EOFException {
		try {
			pw var1 = (pw)ag_fld.ak(var0);
			if (null != var1) {
				return var1;
			} else {
				byte[] var2 = ak_fld.bb(34, var0, 584982574);
				var1 = new pw();
				if (var2 != null) {
					var1.az(new xi(var2), 1272609368);
				}

				fh(var1, -1257754311);
				ag_fld.az(var1, var0);
				return var1;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxi;IB)V"
	)
	void av(xi var1, int var2, byte var3) {
		if (249 == var2) {
			this.az_fld = nc.ak(var1, this.az_fld);
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(III)I"
	)
	public int ae(int var1, int var2, int var3) {
		return my.ag(this.az_fld, var1, var2);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IJ)J"
	)
	public long ah(int var1, long var2) {
		return hq.az(this.az_fld, var1, var2);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;"
	)
	public String aw(int var1, String var2, int var3) {
		return ih.av(this.az_fld, var1, var2);
	}

	@ObfuscatedName("getParams")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/IterableHashTable;"
	)
	@Export("getParams")
	@Override
	public IterableHashTable getParams() {
		return this.az_fld;
	}

	@ObfuscatedName("getId")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getId")
	@Override
	public int getId() {
		return this.uk_fld;
	}

	@ObfuscatedName("fh")
	@ObfuscatedSignature(
		descriptor = "(Lpw;I)V"
	)
	public static void fh(pw var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)D"
	)
	public static double az(int var0) {
		int var2 = um.ai_fld[var0 & 2047];
		return var2 / 65536.0;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IJ)J"
	)
	public long ad(int var1, long var2) {
		return hq.az(this.az_fld, var1, var2);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Lpw;"
	)
	public static pw ar(int var0) throws EOFException {
		try {
			pw var1 = (pw)ag_fld.ak(var0);
			if (null != var1) {
				return var1;
			} else {
				byte[] var2 = ak_fld.bb(34, var0, 584982574);
				var1 = new pw();
				if (var2 != null) {
					var1.az(new xi(var2), 1272609368);
				}

				fh(var1, -1230288362);
				ag_fld.az(var1, var0);
				return var1;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	void al(xi var1) {
		while (true) {
			int var2 = var1.cg();
			if (var2 == 0) {
				return;
			}

			this.av(var1, var2, (byte)66);
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	void au(xi var1, int var2) {
		if (1755524474 == var2) {
			this.az_fld = nc.ak(var1, this.az_fld);
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	public int aa(int var1, int var2) {
		return my.ag(this.az_fld, var1, var2);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	void an(xi var1, int var2) {
		if (249 == var2) {
			this.az_fld = nc.ak(var1, this.az_fld);
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	public int ai(int var1, int var2) {
		return my.ag(this.az_fld, var1, var2);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Lpw;"
	)
	public static pw as(int var0) throws EOFException {
		try {
			pw var1 = (pw)ag_fld.ak(var0);
			if (null != var1) {
				return var1;
			} else {
				byte[] var2 = ak_fld.bb(34, var0, 584982574);
				var1 = new pw();
				if (var2 != null) {
					var1.az(new xi(var2), 1272609368);
				}

				fh(var1, -1045865846);
				ag_fld.az(var1, var0);
				return var1;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IJ)J"
	)
	public long aq(int var1, long var2) {
		return hq.az(this.az_fld, var1, var2);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	void az(xi var1, int var2) {
		while (true) {
			int var3 = var1.cg();
			if (var3 == 0) {
				return;
			}

			this.av(var1, var3, (byte)66);
		}
	}

	pw() {
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IJ)J"
	)
	public long ao(int var1, long var2) {
		return hq.az(this.az_fld, var1, var2);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IJ)J"
	)
	public long am(int var1, long var2) {
		return hq.az(this.az_fld, var1, var2);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;)Ljava/lang/String;"
	)
	public String ap(int var1, String var2) {
		return ih.av(this.az_fld, var1, var2);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	static void ak() {
		if (la.av_fld.toLowerCase().indexOf("microsoft") != -1) {
			sz.dd_fld[186] = 57;
			sz.dd_fld[187] = 27;
			sz.dd_fld[188] = 71;
			sz.dd_fld[189] = 26;
			sz.dd_fld[190] = 72;
			sz.dd_fld[191] = 73;
			sz.dd_fld[192] = 58;
			sz.dd_fld[219] = 42;
			sz.dd_fld[220] = 74;
			sz.dd_fld[221] = 43;
			sz.dd_fld[222] = 59;
			sz.dd_fld[223] = 28;
		} else {
			sz.dd_fld[44] = 71;
			sz.dd_fld[45] = 26;
			sz.dd_fld[46] = 72;
			sz.dd_fld[47] = 73;
			sz.dd_fld[59] = 57;
			sz.dd_fld[61] = 27;
			sz.dd_fld[91] = 42;
			sz.dd_fld[92] = 74;
			sz.dd_fld[93] = 43;
			sz.dd_fld[192] = 28;
			sz.dd_fld[222] = 58;
			sz.dd_fld[520] = 59;
		}
	}

	@ObfuscatedName("jh")
	@ObfuscatedSignature(
		descriptor = "(Lxv;)V"
	)
	@Override
	public void jh(xv var1) {
		this.az_fld = var1;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void ag_void(int var1) {
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	void ax(xi var1, int var2) {
		if (249 == var2) {
			this.az_fld = nc.ak(var1, this.az_fld);
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void af() {
	}
}
