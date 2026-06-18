import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("lq")
public class lq {
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bt_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	public dj ak_fld;
	// $VF: synthetic field
	@ObfuscatedName("this$0")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	mj this$0;
	@ObfuscatedName("ry")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1409372513
	)
	static int ry_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int as_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int az_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[Lpc;"
	)
	public static pc[] ae_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "[F"
	)
	public float[] ag_fld;

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;II)I"
	)
	public static int ae(CharSequence var0, int var1) {
		return jt.ah(var0, var1, true);
	}

	@ObfuscatedName("gg")
	@ObfuscatedSignature(
		descriptor = "(Ldj;)Ljava/lang/String;"
	)
	public static String gg(dj var0) {
		return var0.az_fld.toString();
	}

	lq(mj var1) {
		this.this$0 = var1;
		this.ag_fld = new float[4];
	}
}
