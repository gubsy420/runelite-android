import net.runelite.api.CameraFocusableEntity;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("xl")
@Implements({"CameraFocusableEntity"})
public interface xl extends CameraFocusableEntity {
	@ObfuscatedName("hq")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int hq();

	@ObfuscatedName("ub")
	@ObfuscatedSignature(
		descriptor = "()F"
	)
	float ub();

	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int dj(int var1);

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int ak(int var1);

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int bf();

	@ObfuscatedName("xp")
	@ObfuscatedSignature(
		descriptor = "()F"
	)
	float xp();

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int bj();

	@ObfuscatedName("ot")
	@ObfuscatedSignature(
		descriptor = "(Luy;Luc;)V"
	)
	static void ot(uy var0, uc var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ja_fld = var1.ak_fld;
		var0.bs_fld = var1.ag_fld;
		var0.bp_fld = var1.az_fld;
		var0.va_fld = 0.0F;
		var0.hx_fld = var1.av_fld;
		var0.or_fld = var1.ae_fld;
		var0.rw_fld = var1.ah_fld;
		var0.ok_fld = 0.0F;
		var0.ki_fld = var1.aw_fld;
		var0.jj_fld = var1.ay_fld;
		var0.ih_fld = var1.as_fld;
		var0.hj_fld = 0.0F;
		var0.kh_fld = var1.ar_fld;
		var0.my_fld = var1.af_fld;
		var0.xv_fld = var1.al_fld;
		var0.nz_fld = 1.0F;
	}

	@ObfuscatedName("hw")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int hw();

	@ObfuscatedName("wc")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	default int wc() {
		return this.dj(189745805);
	}

	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int hv();

	@ObfuscatedName("hc")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int hc();

	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int dp(int var1);

	@ObfuscatedName("xz")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	default int xz() {
		return this.ak(-1615592074);
	}

	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int hg();

	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int hl();

	@ObfuscatedName("gb")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	default int gb() {
		return this.dp(527100376);
	}

	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int hs();
}
