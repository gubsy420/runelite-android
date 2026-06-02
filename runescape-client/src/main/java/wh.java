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
	@ObfuscatedGetter(
		intValue = -956891123
	)
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
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
	@ObfuscatedGetter(
		intValue = -721705823
	)
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
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
		descriptor = "(Lzm;I)V"
	)
	public void ak(zm var1, int var2) {
		this.ah_fld = var1;
		this.aw_fld = var2;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lzm;I)V"
	)
	public void ag(zm var1, int var2) {
		this.ay_fld = var1;
		this.as_fld = var2;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lzm;)V"
	)
	public void az(zm var1) {
		this.ar_fld = var1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()Lzm;"
	)
	public zm ay() {
		return this.ay_fld;
	}

	public wh() {
		this.aw_fld = 580407004;
		this.ay_fld = av_fld;
		this.as_fld = 1523467692;
		this.ar_fld = ak_fld;
	}

	@ObfuscatedName("wa")
	@ObfuscatedSignature(
		descriptor = "(Lwh;B)Lzm;"
	)
	public static zm wa(wh var0, byte var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.ah_fld;
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int aa() {
		return this.as_fld;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int aw() {
		return this.aw_fld;
	}

	@ObfuscatedName("pw")
	@ObfuscatedSignature(
		descriptor = "(Lwh;I)Lzm;"
	)
	public static zm pw(wh var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.ar_fld;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lzm;I)V"
	)
	public void af(zm var1, int var2) {
		this.ay_fld = var1;
		this.as_fld = var2 * 2039383547;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lzm;I)V"
	)
	public void as(zm var1, int var2) {
		this.ay_fld = var1;
		this.as_fld = var2;
	}

	@ObfuscatedName("hh")
	@ObfuscatedSignature(
		descriptor = "(Lco;)V"
	)
	public static void hh(co var0) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.as_fld = rw.ak_fld;
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "()Lzm;"
	)
	public zm ax() {
		return this.ay_fld;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ae() {
		return this.as_fld;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "()Lzm;"
	)
	public zm ai() {
		return this.ar_fld;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)Lzm;"
	)
	public zm av(byte var1) {
		return this.ah_fld;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Lzm;"
	)
	public zm ah(int var1) {
		return this.ar_fld;
	}
}
