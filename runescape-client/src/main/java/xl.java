import net.runelite.api.CameraFocusableEntity;
import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("xl")
@Implements({"CameraFocusableEntity"})
public interface xl extends CameraFocusableEntity {
	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int hs();

	@ObfuscatedName("of")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	default int of() {
		return this.dp(527100376);
	}

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

	@ObfuscatedName("ri")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	default int ri() {
		return this.ak(-1615592074);
	}

	@ObfuscatedName("kn")
	@ObfuscatedSignature(
		descriptor = "()F"
	)
	float kn();

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int bj();

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int bf();

	@ObfuscatedName("hc")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int hc();

	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int hl();

	@ObfuscatedName("hq")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int hq();

	@ObfuscatedName("yd")
	@ObfuscatedSignature(
		descriptor = "()F"
	)
	float yd();

	@ObfuscatedName("pa")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	default int pa() {
		return this.dj(189745805);
	}

	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int dp(int var1);

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(Lli;)Z"
	)
	static boolean bw(li var0) {
		return var0.ad_fld;
	}

	@ObfuscatedName("hw")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("hw_int")
	int hw_int();

	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int hg();

	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int hv();
}
