import java.util.Arrays;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("dh")
public class dh implements rm {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	static int[] av_fld = new int[]{
		0,
		1,
		1,
		1,
		1,
		2,
		2,
		2,
		2,
		2,
		3,
		3,
		3,
		3,
		3,
		3,
		4,
		4,
		4,
		4,
		4,
		5,
		5,
		5,
		5,
		6,
		6,
		6,
		6,
		7,
		7,
		7,
		8,
		8,
		8,
		9,
		9,
		9,
		10,
		10,
		10,
		11,
		11,
		11,
		12,
		12,
		12,
		13,
		13,
		14,
		14,
		15,
		15,
		16,
		16,
		17,
		17,
		18,
		18,
		19,
		19,
		20,
		21,
		21,
		22,
		22,
		23,
		24,
		24,
		25,
		26,
		26,
		27,
		28,
		29,
		30,
		30,
		31,
		32,
		33,
		34,
		35,
		36,
		37,
		38,
		39,
		40,
		41,
		42,
		44,
		45,
		46,
		48,
		49,
		50,
		52,
		53,
		55,
		57,
		58,
		60,
		61,
		63,
		65,
		67,
		69,
		71,
		73,
		75,
		77,
		80,
		82,
		84,
		87,
		90,
		92,
		95,
		97,
		101,
		103,
		106,
		109,
		112,
		116,
		119,
		122,
		125,
		127
	};
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ag_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ak_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	static int[] az_fld = new int[]{
		0,
		1,
		1,
		1,
		1,
		1,
		1,
		1,
		1,
		2,
		2,
		2,
		2,
		2,
		2,
		2,
		3,
		3,
		3,
		3,
		3,
		3,
		4,
		4,
		4,
		4,
		4,
		4,
		4,
		5,
		5,
		5,
		5,
		5,
		5,
		6,
		6,
		6,
		6,
		6,
		7,
		7,
		7,
		7,
		7,
		8,
		8,
		8,
		8,
		8,
		9,
		9,
		9,
		9,
		10,
		10,
		10,
		10,
		10,
		11,
		11,
		11,
		12,
		12,
		12,
		13,
		13,
		13,
		14,
		14,
		14,
		15,
		15,
		15,
		16,
		16,
		16,
		17,
		17,
		17,
		18,
		18,
		18,
		19,
		19,
		19,
		20,
		20,
		20,
		21,
		21,
		22,
		22,
		23,
		23,
		24,
		24,
		25,
		25,
		26,
		27,
		27,
		28,
		28,
		29,
		29,
		30,
		30,
		31,
		32,
		32,
		33,
		34,
		34,
		35,
		35,
		36,
		37,
		37,
		38,
		38,
		39,
		40,
		40,
		41,
		42,
		42,
		43,
		44,
		44,
		45,
		46,
		46,
		47,
		48,
		49,
		49,
		50,
		51,
		52,
		53,
		53,
		54,
		56,
		56,
		57,
		58,
		59,
		60,
		61,
		62,
		63,
		64,
		65,
		66,
		67,
		68,
		69,
		71,
		71,
		72,
		74,
		75,
		76,
		77,
		78,
		79,
		81,
		81,
		82,
		84,
		85,
		86,
		88,
		89,
		90,
		92,
		93,
		94,
		96,
		97,
		98,
		100,
		101,
		103,
		105,
		106,
		107,
		109,
		111,
		112,
		114,
		116,
		117,
		119,
		122,
		123,
		125,
		127,
		129,
		130,
		131,
		132,
		134,
		136,
		139,
		141,
		142,
		145,
		147,
		148,
		151,
		153,
		155,
		158,
		159,
		162,
		164,
		166,
		169,
		170,
		173,
		175,
		178,
		180,
		182,
		185,
		187,
		190,
		193,
		194,
		197,
		200,
		202,
		205,
		208,
		210,
		213,
		216,
		217,
		219,
		221,
		224,
		227,
		230,
		233,
		236,
		240,
		243,
		246,
		248,
		250,
		252,
		255,
		255,
		255
	};
	@ObfuscatedGetter(
		intValue = -578266889
	)
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ae_fld;
	@ObfuscatedGetter(
		intValue = 471274365
	)
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ah_fld;
	@ObfuscatedGetter(
		intValue = -847340065
	)
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int aw_fld;
	@ObfuscatedGetter(
		intValue = 1372631127
	)
	@ObfuscatedName("ii")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ii_fld;

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IF)V"
	)
	void ak(int var1, float var2) {
		int var4 = this.aw(var1, var2, 255);
		this.ae_fld = 452323527 * az_fld[var4];
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IF)V"
	)
	void ag(int var1, float var2) {
		int var4 = this.aw(var1, var2, 127);
		this.ah_fld = 508050901 * av_fld[var4];
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ldh;IF)V"
	)
	public static void ak(dh var0, int var1, float var2) {
		if (var0 == null) {
			var0.getClass();
		}

		int var3 = var0.aw(var1, var2, -899711912);
		var0.aw_fld = 279797279 * av_fld[var3];
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IF)V"
	)
	void az(int var1, float var2) {
		int var4 = this.aw(var1, var2, 127);
		this.aw_fld = 279797279 * av_fld[var4];
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int av() {
		return this.ae_fld;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	public static int ag(int var0, int var1) {
		return var1 + (-3 - var0 << 8);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IFI)I"
	)
	int aw(int var1, float var2, int var3) {
		float var5 = var2 * (var1 / 100.0F);
		float var6 = var3 * var5;
		return Math.min(Math.max(Math.round(var6), 0), var3);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	@Override
	public int ae(int var1) {
		return this.ah_fld;
	}

	dh() {
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IF)V"
	)
	void af(int var1, float var2) {
		int var3 = this.aw(var1, var2, 127);
		this.ah_fld = 508050901 * av_fld[var3];
	}

	@ObfuscatedName("jb")
	@ObfuscatedSignature(
		descriptor = "(Ldh;IF)V"
	)
	public static void jb(dh var0, int var1, float var2) {
		if (var0 == null) {
			var0.getClass();
		}

		int var3 = var0.aw(var1, var2, 127);
		var0.aw_fld = -1198010238 * av_fld[var3];
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IF)V"
	)
	void as(int var1, float var2) {
		int var3 = this.aw(var1, var2, 255);
		this.ae_fld = 452323527 * az_fld[var3];
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IF)V"
	)
	void al(int var1, float var2) {
		int var3 = this.aw(var1, var2, 355954432);
		this.ah_fld = 508050901 * av_fld[var3];
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IF)V"
	)
	void ar(int var1, float var2) {
		int var3 = this.aw(var1, var2, 255);
		this.ae_fld = 452323527 * az_fld[var3];
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int aq() {
		return this.ah_fld;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int an() {
		return this.ae_fld;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int aa() {
		return this.ae_fld;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ai() {
		return this.ae_fld;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IF)V"
	)
	void ay(int var1, float var2) {
		int var3 = this.aw(var1, var2, 563774616);
		this.ae_fld = 452323527 * az_fld[var3];
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int am() {
		return this.ah_fld;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int ad() {
		return this.ah_fld;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	@Override
	public int ah(byte var1) {
		return this.aw_fld;
	}

	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "(Lev;)V"
	)
	public static void da(ev var0) {
		if (var0 == null) {
			var0.getClass();
		} else {
			for (int var1 = 0; var1 < var0.cd_fld; var1++) {
				for (int var2 = 0; var2 < var0.cc_fld; var2++) {
					for (int var3 = 0; var3 < var0.cq_fld; var3++) {
						var0.bl_fld[var1][var2][var3] = null;
					}
				}
			}

			if (var0.dp_fld != null) {
				for (int var4 = 0; var4 < var0.dt_fld; var4++) {
					for (int var7 = 0; var7 < var0.dp_fld[var4]; var7++) {
						var0.dq_fld[var4][var7] = null;
					}

					var0.dp_fld[var4] = 0;
				}
			}

			if (var0.bb_fld != null) {
				Arrays.fill(var0.bb_fld, null);
			}

			var0.bg_fld = 0;

			for (int var5 = 0; var5 < var0.dw_fld; var5++) {
				var0.dy_fld[var5] = null;
			}

			var0.dw_fld = 0;

			for (int var6 = 0; var6 < var0.cl_fld.length; var6++) {
				var0.cl_fld[var6] = null;
			}
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IFI)I"
	)
	int ab(int var1, float var2, int var3) {
		float var4 = var2 * (var1 / 100.0F);
		float var5 = var3 * var4;
		return Math.min(Math.max(Math.round(var5), 0), var3);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int ao() {
		return this.aw_fld;
	}
}
