import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("wh")
public class wh {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int az_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lzm;"
	)
	static zm ag_fld = zm.ak_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -956891123
	)
	int aw_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lzm;"
	)
	static zm av_fld = zm.ak_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lzm;"
	)
	zm ah_fld = ag_fld;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ad_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lzm;"
	)
	static zm ak_fld = zm.ak_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -721705823
	)
	int as_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lzm;"
	)
	zm ay_fld;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lzm;"
	)
	zm ar_fld;

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lzm;I)V"
	)
	public void ar(zm var1, int var2) {
		this.ay_fld = var1;
		this.as_fld = var2 * 919824829;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lzm;II)V"
	)
	public void ak(zm var1, int var2) {
		this.ah_fld = var1;
		this.aw_fld = var2;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lzm;IB)V"
	)
	public void ag(zm var1, int var2) {
		this.ay_fld = var1;
		this.as_fld = var2;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lzm;B)V"
	)
	public void az(zm var1) {
		this.ar_fld = var1;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)Lzm;"
	)
	public zm av() {
		return this.ah_fld;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Lzm;"
	)
	public zm ah(int var1) {
		return this.ay_fld;
	}

	public wh() {
		this.aw_fld = 580407004;
		this.ay_fld = av_fld;
		this.as_fld = 1523467692;
		this.ar_fld = ak_fld;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int aa() {
		return this.as_fld;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	public int ae() {
		return this.aw_fld;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lzm;I)V"
	)
	public void as(zm var1, int var2) {
		this.ay_fld = var1;
		this.as_fld = var2;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "()Lzm;"
	)
	public zm au() {
		return this.ay_fld;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "()Lzm;"
	)
	public zm ax() {
		return this.ay_fld;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int an() {
		return this.as_fld;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	public int aw() {
		return this.as_fld;
	}

	@ObfuscatedName("qx")
	@ObfuscatedSignature(
		descriptor = "(Lwh;I)Lzm;"
	)
	public static zm qx(wh var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.ar_fld;
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "()Lzm;"
	)
	public zm ai() {
		return this.ar_fld;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Lzm;"
	)
	public zm ay(int var1) {
		return this.ar_fld;
	}
}
