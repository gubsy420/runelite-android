import net.runelite.api.Ignore;
import net.runelite.api.Nameable;
import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("rt")
@Implements({"Ignore"})
public class rt extends rl implements Ignore {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1970136427
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

	@ObfuscatedName("jg")
	@ObfuscatedSignature(
		descriptor = "(Lwz;)V"
	)
	public static void jg(wz var0) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.af((short)29401);
		}
	}

	rt() {
	}

	@ObfuscatedName("compareTo")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)I"
	)
	@Export("compareTo")
	@Override
	public int compareTo(Nameable var1) {
		return this.ak((rt)var1, 1919587189);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lrl;I)I"
	)
	@Override
	public int ad(rl var1, int var2) {
		return this.ak((rt)var1, 2002986895);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
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
		return this.ak((rt)var1, 1719020349);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lrl;)I"
	)
	@Override
	public int ao(rl var1) {
		return this.ak((rt)var1, 1940070009);
	}

	@ObfuscatedName("vf")
	@ObfuscatedSignature(
		descriptor = "(Lgj;)I"
	)
	public static int vf(gj var0) {
		return var0.ah_fld;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lrl;)I"
	)
	@Override
	public int ab(rl var1) {
		return this.ak((rt)var1, 1742339981);
	}

	@ObfuscatedName("fv")
	@ObfuscatedSignature(
		descriptor = "(Ldw;)V"
	)
	public static void fv(dw var0) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.as_fld = null;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lrt;)I"
	)
	int ag(rt var1) {
		return this.ak_fld - var1.ak_fld;
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
