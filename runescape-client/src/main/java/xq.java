import java.util.Comparator;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("xq")
public class xq implements Comparator {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean ak_fld;

	public xq(boolean var1) {
		this.ak_fld = var1;
	}

	@ObfuscatedName("pp")
	@ObfuscatedSignature(
		descriptor = "(Lrl;)Ljava/lang/String;"
	)
	public static String pp(rl var0) {
		return var0.az_fld == null ? "" : var0.az_fld.ak(1188621342);
	}

	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	public boolean jt(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	public int ah(Object var1, Object var2) {
		return this.ak((rl)var1, (rl)var2, 1546946362);
	}

	@ObfuscatedName("equals")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	@Override
	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	public int aw(Object var1, Object var2) {
		return this.ak((rl)var1, (rl)var2, 1268337538);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	public int ae(Object var1, Object var2) {
		return this.ak((rl)var1, (rl)var2, 1826924381);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lrl;Lrl;I)I"
	)
	int ak(rl var1, rl var2, int var3) {
		return this.ak_fld ? var1.ap(-1939318074).av(var2.ap(-1939318074), -1642138578) : var2.ap(-1939318074).av(var1.ap(-1939318074), 1116998577);
	}

	@ObfuscatedName("jm")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	public boolean jm(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("jg")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	public boolean jg(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("xq")
	@ObfuscatedSignature(
		descriptor = "(Lwl;IIIIII)Z"
	)
	public static boolean xq(wl var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var0.ce_fld == null) {
			return true;
		} else if (var0.ce_fld.aw_fld == var1 && var0.ce_fld.ay_fld == var2) {
			if (var0.bm_fld.av_fld * 253584221 != var0.cn_fld) {
				return true;
			} else if (client.gr_fld != var0.cg_fld) {
				return true;
			} else {
				return var3 <= 0 && var4 <= 0 ? var1 + var3 < var5 || var4 + var2 < var6 : true;
			}
		} else {
			return true;
		}
	}

	@ObfuscatedName("compare")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	@Override
	public int compare(Object var1, Object var2) {
		return this.ak((rl)var1, (rl)var2, 1652650723);
	}

	@ObfuscatedName("zn")
	@ObfuscatedSignature(
		descriptor = "(Lrg;)I"
	)
	public static int zn(rg var0) {
		return var0.av_fld.ag();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lrl;Lrl;)I"
	)
	int av(rl var1, rl var2) {
		return this.ak_fld ? var1.ap(-1939318074).av(var2.ap(-1939318074), -1705163050) : var2.ap(-1939318074).av(var1.ap(-1939318074), 1270366105);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lrl;Lrl;)I"
	)
	int az(rl var1, rl var2) {
		return this.ak_fld ? var1.ap(-1939318074).av(var2.ap(-1939318074), -1775925844) : var2.ap(-1939318074).av(var1.ap(-1939318074), -781281659);
	}
}
