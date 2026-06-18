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
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 430291693
	)
	int az_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1060847225
	)
	int ak_fld;
	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	static String cq_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 698419181
	)
	int av_fld;
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
		return this.ak_fld;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	@Override
	public int ag(int var1) {
		return this.av_fld;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Lgw;"
	)
	@Override
	gw az(int var1) {
		return this.ag_fld;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	@Override
	int ae(int var1) {
		return this.ak_fld;
	}

	he(kj var1, kj var2, int var3, gw var4) throws EOFException {
		super(var1, var2);
		this.av_fld = var3;
		this.ag_fld = var4;
		pc var5 = uh.ak(this.ag(-879858868));
		yv var6 = var5.ae(false, -1933745851);
		if (var6 != null) {
			this.ak_fld = var6.aw_fld;
			this.az_fld = var6.ay_fld;
		} else {
			this.ak_fld = 0;
			this.az_fld = 0;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int as() {
		return this.av_fld;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	int an() {
		return this.ak_fld;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "()Lgw;"
	)
	@Override
	gw af() {
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

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "()Lgw;"
	)
	@Override
	gw au() {
		return this.ag_fld;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	int aa() {
		return this.az_fld;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "()Lgw;"
	)
	@Override
	gw al() {
		return this.ag_fld;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int ar() {
		return this.av_fld;
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/Object;"
	)
	static Object cg(int var0) {
		return var0 == -1 ? null : um.ca((yq)ka.ak(yq.ak(), var0));
	}
}
