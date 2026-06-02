import net.runelite.api.Ignore;
import net.runelite.api.Nameable;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("rt")
@Implements({"Ignore"})
public class rt extends rl implements Ignore {
	@ObfuscatedGetter(
		intValue = 1970136427
	)
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ak_fld;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "[[[B"
	)
	static byte[][][] au_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	public static int[] ag_fld;

	rt() {
	}

	@ObfuscatedName("compareTo")
	@ObfuscatedSignature(
		descriptor = "(Lnet/runelite/api/Nameable;)I"
	)
	@Override
	public int compareTo(Nameable var1) {
		return nn(this, (rt)var1, 1919587189);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lrl;I)I"
	)
	@Override
	public int ad(rl var1, int var2) {
		return nn(this, (rt)var1, 2002986895);
	}

	@ObfuscatedName("wf")
	@ObfuscatedSignature(
		descriptor = "(Lli;I)V"
	)
	public static void wf(li var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.am_fld.bm(var1);
	}

	@ObfuscatedName("pz")
	@ObfuscatedSignature(
		descriptor = "(Lev;)Z"
	)
	public static boolean pz(ev var0) {
		return var0.bq_fld && var0.bw_fld != -1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	static final boolean af() {
		return ej.be_fld;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)I"
	)
	@Override
	public int ae(Object var1) {
		return nn(this, (rt)var1, 1719020349);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lrl;)I"
	)
	@Override
	public int ao(rl var1) {
		return nn(this, (rt)var1, 1940070009);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lrl;)I"
	)
	@Override
	public int ab(rl var1) {
		return nn(this, (rt)var1, 1742339981);
	}

	@ObfuscatedName("nn")
	@ObfuscatedSignature(
		descriptor = "(Lrt;Lrt;I)I"
	)
	public static int nn(rt var0, rt var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.ak_fld - var1.ak_fld;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lrt;)I"
	)
	int az(rt var1) {
		return this.ak_fld - var1.ak_fld;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lrt;I)I"
	)
	int ak(rt var1, int var2) {
		return this.ak_fld - var1.ak_fld;
	}
}
