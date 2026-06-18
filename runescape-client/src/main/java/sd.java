import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("sd")
public class sd implements xm {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -2001568875
	)
	int aw_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lsd;"
	)
	static sd ag_fld = new sd(1, 1);
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lsd;"
	)
	static sd az_fld = new sd(2, 2);
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lsd;"
	)
	static sd av_fld = new sd(3, 3);
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lsd;"
	)
	static sd ak_fld = new sd(0, 0);
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 587465729
	)
	int ah_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lsd;"
	)
	static sd ae_fld = new sd(4, 4);

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()[Lsd;"
	)
	static sd[] as() {
		return new sd[]{ak_fld, ag_fld, az_fld, av_fld, ae_fld};
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	@Override
	public int ag(int var1) {
		return this.ah_fld;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int ae() {
		return this.ah_fld;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int av() {
		return this.ah_fld;
	}

	sd(int var1, int var2) {
		this.aw_fld = var1;
		this.ah_fld = var2;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()[Lsd;"
	)
	static sd[] ay() {
		return new sd[]{ak_fld, ag_fld, az_fld, av_fld, ae_fld};
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "()[Lsd;"
	)
	static sd[] aw() {
		return new sd[]{ak_fld, ag_fld, az_fld, av_fld, ae_fld};
	}

	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "(Lxj;Lyk;)V"
	)
	public static void di(xj var0, yk var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ag_fld = var1;
	}

	@ObfuscatedName("xm")
	@ObfuscatedSignature(
		descriptor = "(Lcl;ILxj;)V"
	)
	public static void xm(cl var0, int var1, xj var2) {
		bb.pt(var0.as_fld, var1, var2, (byte)-25);
		var0.aq();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int ah() {
		return this.ah_fld;
	}

	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "(Lwl;)V"
	)
	public static void dj(wl var0) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.bt_fld = null;
	}

	@ObfuscatedName("hc")
	@ObfuscatedSignature(
		descriptor = "(Lmx;)V"
	)
	public static void hc(mx var0) {
		if (var0.au_fld != null) {
			var0.au_fld.az();
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "()[Lsd;"
	)
	static sd[] ar() {
		return new sd[]{ak_fld, ag_fld, az_fld, av_fld, ae_fld};
	}
}
