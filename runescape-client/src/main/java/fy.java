import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("fy")
public class fy {
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "B"
	)
	byte ae_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "B"
	)
	byte ag_fld = -1;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "B"
	)
	byte az_fld = -1;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "B"
	)
	byte av_fld = -1;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "B"
	)
	public static byte ak_fld;

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void af() {
		this.ag_fld = -1;
		this.az_fld = -1;
		this.av_fld = -1;
		this.ae_fld = 0;
	}

	public fy(byte var1, byte var2, byte var3, byte var4) {
		this.ae_fld = 0;
		this.ag_fld = var1;
		this.az_fld = var2;
		this.av_fld = var3;
		this.ae_fld = var4;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lfy;)V"
	)
	void aw(fy var1) {
		this.ag_fld = var1.ag_fld;
		this.az_fld = var1.az_fld;
		this.av_fld = var1.av_fld;
		this.ae_fld = var1.ae_fld;
	}

	public fy() {
		this.ae_fld = 0;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lfy;)V"
	)
	void ae(fy var1) {
		this.ag_fld = var1.ag_fld;
		this.az_fld = var1.az_fld;
		this.av_fld = var1.av_fld;
		this.ae_fld = var1.ae_fld;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean av() {
		return this.ae_fld > 0;
	}

	@ObfuscatedName("hx")
	@ObfuscatedSignature(
		descriptor = "(Lfy;BBBB)V"
	)
	public static void hx(fy var0, byte var1, byte var2, byte var3, byte var4) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ag_fld = var1;
		var0.az_fld = var2;
		var0.av_fld = var3;
		var0.ae_fld = var4;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(BBBB)V"
	)
	public void ag(byte var1, byte var2, byte var3, byte var4) {
		this.ag_fld = var1;
		this.az_fld = var2;
		this.av_fld = var3;
		this.ae_fld = var4;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lfy;)V"
	)
	void ak(fy var1) {
		this.ag_fld = var1.ag_fld;
		this.az_fld = var1.az_fld;
		this.av_fld = var1.av_fld;
		this.ae_fld = var1.ae_fld;
	}

	@ObfuscatedName("ug")
	@ObfuscatedSignature(
		descriptor = "(Lfy;)V"
	)
	public void ug(fy var1) {
		this.ae(var1);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lfy;)V"
	)
	void ah(fy var1) {
		this.ag_fld = var1.ag_fld;
		this.az_fld = var1.az_fld;
		this.av_fld = var1.av_fld;
		this.ae_fld = var1.ae_fld;
	}

	@ObfuscatedName("zv")
	@ObfuscatedSignature(
		descriptor = "(Lsl;I)I"
	)
	public static int zv(sl var0, int var1) {
		int var2 = (var0.ae_fld >> 1) + var0.ae_fld;
		return Math.max(var1, Math.min(var2, 5000));
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(BBBB)V"
	)
	public void as(byte var1, byte var2, byte var3, byte var4) {
		this.ag_fld = var1;
		this.az_fld = var2;
		this.av_fld = var3;
		this.ae_fld = var4;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void al() {
		this.ag_fld = -1;
		this.az_fld = -1;
		this.av_fld = -1;
		this.ae_fld = 0;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void az() {
		this.ag_fld = -1;
		this.az_fld = -1;
		this.av_fld = -1;
		this.ae_fld = 0;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ar() {
		this.ag_fld = -1;
		this.az_fld = -1;
		this.av_fld = -1;
		this.ae_fld = 0;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean au() {
		return this.ae_fld > 0;
	}
}
