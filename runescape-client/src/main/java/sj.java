import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("sj")
public class sj {
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	float ah_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	float ag_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	float az_fld = Float.MAX_VALUE;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lsj;"
	)
	sj aw_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	float ae_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	float av_fld = Float.MAX_VALUE;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 157988587
	)
	int ak_fld;
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bc_fld;
	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int cf_fld;
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int bu_fld;

	sj() {
		this.ae_fld = Float.MAX_VALUE;
		this.ah_fld = Float.MAX_VALUE;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lxi;IB)V"
	)
	void ak(xi var1, int var2) {
		this.ak_fld = var1.cz();
		this.ag_fld = var1.ci();
		this.az_fld = var1.ci();
		this.av_fld = var1.ci();
		this.ae_fld = var1.ci();
		this.ah_fld = var1.ci();
	}
}
