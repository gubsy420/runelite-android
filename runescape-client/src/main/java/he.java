import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("he")
public class he extends hr {
	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bb_fld;
	@ObfuscatedGetter(
		intValue = 430291693
	)
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int av_fld;
	@ObfuscatedGetter(
		intValue = -1060847225
	)
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int az_fld;
	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	static String cq_fld;
	@ObfuscatedGetter(
		intValue = 698419181
	)
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ak_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lgw;"
	)
	gw ag_fld;

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	int ax() {
		return this.az_fld;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	@Override
	public int ag(int var1) {
		return this.ak_fld;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Lgw;"
	)
	@Override
	gw az(int var1) {
		return this.ag_fld;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	@Override
	int av(int var1) {
		return this.az_fld;
	}

	he(kj var1, kj var2, int var3, gw var4) throws EOFException {
		super(var1, var2);
		this.ak_fld = var3;
		this.ag_fld = var4;
		pc var5 = uh.ak(this.ag(-879858868));
		yv var6 = var5.ae(false, -1933745851);
		if (var6 != null) {
			this.az_fld = var6.aw_fld;
			this.av_fld = var6.ay_fld;
		} else {
			this.az_fld = 0;
			this.av_fld = 0;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int ar() {
		return this.ak_fld;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	int an() {
		return this.az_fld;
	}

	@ObfuscatedName("qh")
	@ObfuscatedSignature(
		descriptor = "(Lmw;I)V"
	)
	public static void qh(mw var0, int var1) {
		var0.aw_fld.au_fld = var0.al_fld[var1];
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "()Lgw;"
	)
	@Override
	gw au() {
		return this.ag_fld;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	@Override
	int ae(int var1) {
		return this.av_fld;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "()Lgw;"
	)
	@Override
	gw al() {
		return this.ag_fld;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	int aa() {
		return this.av_fld;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "()Lgw;"
	)
	@Override
	gw af() {
		return this.ag_fld;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int as() {
		return this.ak_fld;
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/Object;"
	)
	static Object cg(int var0) {
		return var0 == -1 ? null : um.ca((yq)ka.ak(yq.ak(), var0));
	}
}
