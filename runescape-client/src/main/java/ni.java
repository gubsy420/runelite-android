import java.util.Comparator;
import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("ni")
public class ni implements Comparator {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int av_fld;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1588563501
	)
	public static int ax_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ah_fld;

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lmp;Lmp;)I"
	)
	int ay(mp var1, mp var2) {
		return var1.ak_fld - var2.ak_fld;
	}

	@ObfuscatedName("compare")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	@Override
	public int compare(Object var1, Object var2) {
		return gh(this, (mp)var1, (mp)var2, (byte)0);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	public int ae(Object var1, Object var2) {
		return gh(this, (mp)var1, (mp)var2, (byte)0);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	public int ah(Object var1, Object var2) {
		return gh(this, (mp)var1, (mp)var2, (byte)0);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	public int aw(Object var1, Object var2) {
		return gh(this, (mp)var1, (mp)var2, (byte)0);
	}

	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	public boolean jt(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("jm")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	public boolean jm(Object var1) {
		return super.equals(var1);
	}

	ni() {
	}

	@ObfuscatedName("ws")
	@ObfuscatedSignature(
		descriptor = "(Lni;Ljava/lang/Object;)Z"
	)
	public static boolean ws(ni var0, Object var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.equals(var1);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lmp;Lmp;)I"
	)
	int ag(mp var1, mp var2) {
		return var1.ak_fld - var2.ak_fld;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lmp;Lmp;)I"
	)
	int az(mp var1, mp var2) {
		return var1.ak_fld - var2.ak_fld;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lmp;Lmp;)I"
	)
	int av(mp var1, mp var2) {
		return var1.ak_fld - var2.ak_fld;
	}

	@ObfuscatedName("gh")
	@ObfuscatedSignature(
		descriptor = "(Lni;Lmp;Lmp;B)I"
	)
	public static int gh(ni var0, mp var1, mp var2, byte var3) {
		if (var0 == null) {
			var0.getClass();
		}

		return var1.ak_fld - var2.ak_fld;
	}

	@ObfuscatedName("equals")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	@Export("equals")
	@Override
	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(I)[Ljava/lang/Object;"
	)
	static Object[] bm() {
		String var1 = (String)bp.ai_fld[(ef.aq_fld -= -211521517) * -836183525];
		Object[] var2 = (Object[])(new Object[var1.length()]);

		for (int var3 = var1.length() - 1; var3 >= 0; var3--) {
			if (var1.charAt(var3) == 'i') {
				var2[var3] = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			} else {
				var2[var3] = bp.ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			}
		}

		return (Object[])var2;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lmp;Lmp;B)I"
	)
	int ak(mp var1, mp var2, byte var3) {
		return var1.ak_fld - var2.ak_fld;
	}
}
