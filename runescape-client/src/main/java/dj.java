import java.net.URL;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("dj")
public class dj {
	@ObfuscatedGetter(
		intValue = -1837573717
	)
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ak_fld = 809805565;
	@ObfuscatedGetter(
		intValue = 461180733
	)
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ag_fld = 1314249906;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ljava/net/URL;"
	)
	URL az_fld;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ab_fld;
	@ObfuscatedGetter(
		intValue = 430325731
	)
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	volatile int av_fld = 1572510105 * ak_fld;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int am_fld;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int aa_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[B"
	)
	volatile byte[] ae_fld;

	@ObfuscatedName("og")
	@ObfuscatedSignature(
		descriptor = "(Lwj;)I"
	)
	public static int og(wj var0) {
		return null != var0.ak_fld ? var0.ak_fld.bx() : 0;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()[B"
	)
	public byte[] ag() {
		return this.ae_fld;
	}

	dj(URL var1) {
		this.az_fld = var1;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()[B"
	)
	public byte[] as() {
		return this.ae_fld;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String az() {
		return this.az_fld.toString();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean av() {
		return ak_fld != this.av_fld;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean ae() {
		return ak_fld != this.av_fld;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "()[B"
	)
	public byte[] aw() {
		return this.ae_fld;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean ak() {
		return ak_fld != this.av_fld;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String af() {
		return this.az_fld.toString();
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String ar() {
		return this.az_fld.toString();
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String au() {
		return this.az_fld.toString();
	}

	@ObfuscatedName("gn")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	static final void gn(int var0) {
		var0 = Math.max(Math.min(var0, 100), 0);
		var0 = 100 - var0;
		float var2 = 0.5F + var0 / 200.0F;
		rq.gh(var2);
	}
}
