import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("cw")
public class cw {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lcw;"
	)
	static cw av_fld = new cw(3);
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lcw;"
	)
	static cw ag_fld = new cw(1);
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lcw;"
	)
	static cw az_fld = new cw(2);
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lcw;"
	)
	static cw ak_fld = new cw(0);
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lcw;"
	)
	static cw af_fld = new cw(10);
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lcw;"
	)
	static cw ah_fld = new cw(5);
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lcw;"
	)
	static cw aw_fld = new cw(6);
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lcw;"
	)
	static cw ae_fld = new cw(4);
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lcw;"
	)
	static cw as_fld = new cw(8);
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lcw;"
	)
	static cw ar_fld = new cw(9);
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lcw;"
	)
	static cw ay_fld = new cw(7);
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lcw;"
	)
	static cw al_fld = new cw(11);
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lcw;"
	)
	static cw au_fld = new cw(12);
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lcw;"
	)
	static cw ax_fld = new cw(13);
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lcw;"
	)
	static cw an_fld = new cw(14);
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lcw;"
	)
	static cw aa_fld = new cw(15);
	@ObfuscatedGetter(
		intValue = 1787878589
	)
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ai_fld;

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)Lzb;"
	)
	public static zb av(String var0, String var1, boolean var2) throws FileNotFoundException {
		File var4 = new File(mh.aq_fld, "preferences" + var0 + ".dat");
		if (var4.exists()) {
			try {
				return new zb(var4, "rw", 10000L);
			} catch (IOException var10) {
			}
		}

		String var5 = "";
		if (33 == fr.ao_fld) {
			var5 = "_rc";
		} else if (34 == fr.ao_fld) {
			var5 = "_wip";
		}

		File var6 = new File(uf.aa_fld, "jagex_" + var1 + "_preferences" + var0 + var5 + ".dat");
		if (!var2 && var6.exists()) {
			try {
				return new zb(var6, "rw", 10000L);
			} catch (IOException var9) {
			}
		}

		try {
			return new zb(var4, "rw", 10000L);
		} catch (IOException var8) {
			throw new RuntimeException();
		}
	}

	cw(int var1) {
		this.ai_fld = var1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	static void af(int var0, int var1, int var2, int var3) {
		mb.ar_fld = var0;
		mb.af_fld = var1;
		mb.al_fld = var2;
		mb.au_fld = var3;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(III)J"
	)
	static long ak(int var0, int var1, int var2) {
		return var2 << 16 | var0 << 8 | var1;
	}
}
