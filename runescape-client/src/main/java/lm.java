import java.util.ArrayList;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("lm")
public class lm {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ac_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ag_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int az_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int av_fld;
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int bf_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int aw_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ae_fld;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ai_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ak_fld;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int be_fld;
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int bs_fld;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int af_fld;
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int bo_fld;

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;IIII)V"
	)
	public static void au(ArrayList var0, int var1, int var2, int var3, int var4) {
		mb.ay_fld.clear();
		mb.ay_fld.addAll(var0);
		mb.ar_fld = var1;
		mb.af_fld = var2;
		mb.al_fld = var3;
		mb.au_fld = var4;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	static final void aw() {
		ev.ac_fld = false;
		client.gk_fld = false;
	}

	@ObfuscatedName("gy")
	@ObfuscatedSignature(
		descriptor = "(Lma;)Ljava/util/ArrayList;"
	)
	public static ArrayList gy(ma var0) {
		return var0.af_fld.ag_fld;
	}

	lm() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(Lyq;Ljava/lang/Object;)V"
	)
	static void cw(yq var0, Object var1) {
		if (var0 == null) {
			throw new IllegalStateException("pushValueOfType() failure - null baseVarType");
		} else {
			switch (var0.ae_fld) {
				case 0:
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = (Integer)var1;
					break;
				case 1:
					bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var1;
					break;
				case 2:
				default:
					throw new IllegalStateException("pushValueOfType() failure - unsupported type");
				case 3:
					bp.an_fld[(db.aa_fld += 432101741) * 867932261 - 1] = (Long)var1;
			}
		}
	}
}
