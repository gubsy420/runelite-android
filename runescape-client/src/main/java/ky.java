import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("ky")
public class ky implements xm {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/Thread;"
	)
	static Thread aw_fld;
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int bm_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	public static ky az_fld = new ky(1);
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	public static ky ak_fld = new ky(-1);
	@ObfuscatedGetter(
		intValue = -1864824283
	)
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ae_fld;
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bc_fld;
	@ObfuscatedName("lm")
	@ObfuscatedSignature(
		descriptor = "Lua;"
	)
	static ua lm_fld;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int aa_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	public static ky av_fld = new ky(2);
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	public static ky ag_fld = new ky(0);

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "()Ljava/util/ArrayList;"
	)
	static ArrayList al() {
		ArrayList var1 = new ArrayList();
		Iterator var2 = mb.av_fld.iterator();

		while (var2.hasNext()) {
			me var3 = (me)(me)var2.next();
			var1.add(var3);
		}

		return var1;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	@Override
	public int ag(int var1) {
		return this.ae_fld;
	}

	@ObfuscatedName("fl")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIIZI)I"
	)
	static final int fl(String var0, String var1, int var2, int var3, int var4, int var5, int var6, boolean var7, int var8) {
		if (client.ng_fld) {
			return -1;
		} else {
			return !in.fn(var8, var2) ? -1 : client.nr_fld.al(var0, var1, var2, var3, var4, var5, var6, var7, var8, 1956687884);
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int ae() {
		return this.ae_fld;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int ah() {
		return this.ae_fld;
	}

	ky(int var1) {
		this.ae_fld = var1;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V"
	)
	static final void ah(String var0, int var1) {
		jm var3 = gi.ak(jb.cv_fld, client.aq_fld.av_fld);
		var3.ay_fld.bc(iq.bu(var0) + 1);
		var3.ay_fld.bc(var1);
		var3.ay_fld.cc(var0, -950722843);
		client.aq_fld.az(var3);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	static int ak() {
		return (cz.av_fld += -1373160227) * 846166901 - 1;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int av() {
		return this.ae_fld;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lsl;Ljava/lang/Object;II)I"
	)
	public static int ag(sl var0, Object var1, int var2, int var3) {
		if (var2 < 0) {
			var2 = 0;
		}

		if (var3 < 0 || var3 > var0.av()) {
			var3 = var0.av();
		}

		if (yq.ak_fld == var0.ag_fld) {
			int[] var5 = var0.ak();
			int var6 = (Integer)var1;

			for (int var7 = var2; var7 < var3; var7++) {
				if (var5[var7] == var6) {
					return var7;
				}
			}
		} else if (yq.ag_fld == var0.ag_fld) {
			long[] var9 = var0.ag();
			long var11 = (Long)var1;

			for (int var8 = var2; var8 < var3; var8++) {
				if (var11 == var9[var8]) {
					return var8;
				}
			}
		} else {
			Object[] var10 = (Object[])var0.az();

			for (int var12 = var2; var12 < var3; var12++) {
				if (var1 == var10[var12] || var10[var12] != null && var10[var12].equals(var1)) {
					return var12;
				}
			}
		}

		return -1;
	}
}
