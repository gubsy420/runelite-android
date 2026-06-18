import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("dq")
public class dq {
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int bm_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ak_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 597538995
	)
	int az_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -2117186421
	)
	int av_fld = 0;
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bu_fld;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int au_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Luv;"
	)
	uv ag_fld;

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	static void az(int var0) {
		vi.as_fld[0] = 0;

		for (short var1 = 0; var1 < 2048; var1 += 128) {
			int var2 = iq.ag(var1);
			short var3 = 0;
			if (var1 > 0) {
				if (var0 != -1085579971) {
					return;
				}

				if (var1 < 1024) {
					var3 |= 272;
				}
			}

			if (var1 > 512 && var1 < 1536) {
				var3 |= 1088;
			}

			if (var1 > 1024) {
				var3 |= 544;
			}

			if (var1 > 1536 || var1 < 512) {
				var3 |= 2176;
			}

			label72: {
				if (0 != var1) {
					if (var0 != -1085579971) {
						return;
					}

					if (1024 != var1) {
						break label72;
					}
				}

				var3 |= 48;
			}

			label66: {
				if (512 != var1) {
					if (var0 != -1085579971) {
						return;
					}

					if (var1 != 1536) {
						break label66;
					}

					if (var0 != -1085579971) {
						return;
					}
				}

				var3 |= 1152;
			}

			vi.as_fld[var2] = var3;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean ag() {
		this.av_fld = 0;

		for (int var1 = 0; var1 < this.az_fld; var1++) {
			if (!this.ag_fld.al(var1) || this.ag_fld.af(var1)) {
				this.av_fld += 391910340;
			}
		}

		return this.av_fld >= this.az_fld;
	}

	dq(uv var1, String var2) {
		this.ag_fld = var1;
		this.az_fld = var1.cn((byte)48);
	}

	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "(Ldq;I)Z"
	)
	public static boolean df(dq var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			var0.av_fld = 0;

			for (int var2 = 0; var2 < var0.az_fld; var2++) {
				if (!var0.ag_fld.al(var2) || var0.ag_fld.af(var2)) {
					var0.av_fld++;
				}
			}

			return var0.av_fld >= var0.az_fld;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean az() {
		this.av_fld = 0;

		for (int var1 = 0; var1 < this.az_fld; var1++) {
			if (!this.ag_fld.al(var1) || this.ag_fld.af(var1)) {
				this.av_fld += 1301805649;
			}
		}

		return this.av_fld >= this.az_fld;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lub;Ljava/lang/String;Ljava/lang/String;B)Lyc;"
	)
	public static yc aw(ub var0, String var1, String var2) throws EOFException {
		if (!var0.ck(var1, var2, (byte)2)) {
			return null;
		} else {
			int var4 = var0.cm(var1, (byte)1);
			int var5 = var0.cz(var4, var2, -932886233);
			return vq.ag(var0, var4, var5);
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean ak(int var1) {
		this.av_fld = 0;

		for (int var2 = 0; var2 < this.az_fld; var2++) {
			if (!this.ag_fld.al(var2) || this.ag_fld.af(var2)) {
				this.av_fld++;
			}
		}

		return this.av_fld >= this.az_fld;
	}
}
