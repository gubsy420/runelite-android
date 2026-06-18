import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("jq")
public class jq {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "[J"
	)
	static long[] af_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ljq;"
	)
	static jq ag_fld = new jq("BUILDLIVE", 3);
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ljq;"
	)
	static jq ak_fld = new jq("LIVE", 0);
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int aq_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	public String ae_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1606619025
	)
	public int ah_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ljq;"
	)
	static jq az_fld = new jq("RC", 1);
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Ljq;"
	)
	static jq av_fld = new jq("WIP", 2);
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ac_fld;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	static String at_fld;
	@ObfuscatedName("pa")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -432591133
	)
	static int pa_fld;

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()[Ljq;"
	)
	public static jq[] av() {
		return new jq[]{av_fld, ak_fld, az_fld, ag_fld};
	}

	jq(String var1, int var2) {
		this.ae_fld = var1;
		this.ah_fld = var2;
	}

	@ObfuscatedName("nw")
	@ObfuscatedSignature(
		descriptor = "(Lgf;)I"
	)
	public static int nw(gf var0) {
		return 2115450829 * var0.ay_fld.ak_fld;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()[Ljq;"
	)
	public static jq[] ag() {
		return new jq[]{av_fld, ak_fld, az_fld, ag_fld};
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()[Ljq;"
	)
	public static jq[] az() {
		return new jq[]{av_fld, ak_fld, az_fld, ag_fld};
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()[Ljq;"
	)
	public static jq[] ae() {
		return new jq[]{av_fld, ak_fld, az_fld, ag_fld};
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lku;Ldx;IIII)V"
	)
	static final void az(ku var0, dx var1, int var2, int var3, int var4, int var5) throws EOFException {
		if (ku.jy(var0, -1349895106) == 4) {
			rg var6 = (rg)var1.an_fld.ak(ku.ve(var0, 205903255));
			if (null == var6) {
				if (var5 > 402689221) {
					;
				}
			} else {
				int var7 = var6.ah_fld.ah_fld * 491640768;
				int var8 = var6.ah_fld.aw_fld * -558426560;
				id.as(var6.ah_fld, var7, var8, var0.ae() * 2, 0, 932373278);
				if (ch.at_fld > -1 && var4 % 20 < 10) {
					yv.aj(do_.ar_fld[0], var2 + ch.at_fld - 12, var3 + ch.ac_fld - 28);
				}
			}
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	static void ah(int var0, int var1) {
		bg var2 = (bg)xz.tw(bg.ak_fld, var0);
		if (var2 == null) {
			if (var1 == -1944102319) {
				;
			}
		} else {
			var2.gy();
		}
	}
}
