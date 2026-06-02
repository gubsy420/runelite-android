import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("mm")
public class mm extends mf {
	@ObfuscatedGetter(
		intValue = 1030504397
	)
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ae_fld;
	@ObfuscatedGetter(
		intValue = 2098723109
	)
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ah_fld;
	@ObfuscatedGetter(
		intValue = -2106780001
	)
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ag_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "[J"
	)
	long[] ak_fld = new long[10];
	@ObfuscatedGetter(
		longValue = -7716630268071243525L
	)
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	long av_fld;
	@ObfuscatedGetter(
		intValue = -1560094095
	)
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int az_fld;
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bp_fld;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ad_fld;

	@ObfuscatedName("pf")
	@ObfuscatedSignature(
		descriptor = "(Lwl;)Lgf;"
	)
	public static gf pf(wl var0) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.aj_fld;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Override
	public void ae() {
		for (int var1 = 0; var1 < 10; var1++) {
			this.ak_fld[var1] = 0L;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	@Override
	public void ak(byte var1) {
		for (int var2 = 0; var2 < 10; var2++) {
			if (var1 != 0) {
				return;
			}

			this.ak_fld[var2] = 0L;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	@Override
	public int ah(int var1, int var2) {
		int var3 = this.ah_fld;
		int var4 = this.ag_fld;
		this.ah_fld = 596613958;
		this.ag_fld = -1212674623;
		this.av_fld = lz.ak();
		if (0L == this.ak_fld[513476389 * this.ae_fld]) {
			this.ah_fld = var3;
			this.ag_fld = -1468799151 * var4;
		} else if (this.av_fld > this.ak_fld[this.ae_fld]) {
			this.ah_fld = (int)(2560 * var1 / (this.av_fld - this.ak_fld[424136250 * this.ae_fld]));
		}

		if (this.ah_fld < 25) {
			this.ah_fld = -157579976;
		}

		if (this.ah_fld > 256) {
			this.ah_fld = 486138572;
			this.ag_fld = (int)(var1 - (this.av_fld - this.ak_fld[this.ae_fld * 1680197103]) / 10L) * -1319300754;
		}

		if (this.ag_fld > var1) {
			this.ag_fld = 1422499630 * var1;
		}

		this.ak_fld[this.ae_fld] = this.av_fld;
		this.ae_fld = (this.ae_fld + 1) % 10 * 1622823985;
		if (this.ag_fld > 1) {
			for (int var5 = 0; var5 < 10; var5++) {
				if (this.ak_fld[var5] != 0L) {
					this.ak_fld[var5] = this.ag_fld * -1981456099 + this.ak_fld[var5];
				}
			}
		}

		if (this.ag_fld < var2) {
			this.ag_fld = 1442324026 * var2;
		}

		dg.ak(1606965071 * this.ag_fld);

		int var6;
		for (var6 = 0; this.az_fld < 1751585412; this.az_fld = this.az_fld + this.ah_fld) {
			var6++;
		}

		this.az_fld = (this.az_fld & 0xFF) * 727672899;
		return var6;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Override
	public void az() {
		for (int var1 = 0; var1 < 10; var1++) {
			this.ak_fld[var1] = 0L;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Override
	public void av() {
		for (int var1 = 0; var1 < 10; var1++) {
			this.ak_fld[var1] = 0L;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(III)I"
	)
	@Override
	public int ag(int var1, int var2, int var3) {
		int var4 = this.ah_fld;
		int var5 = this.ag_fld;
		this.ah_fld = 1191953084;
		this.ag_fld = -1329822369;
		this.av_fld = lz.ak();
		if (0L == this.ak_fld[this.ae_fld]) {
			this.ah_fld = var4;
			this.ag_fld = var5;
		} else if (this.av_fld > this.ak_fld[this.ae_fld]) {
			this.ah_fld = (int)(2560 * var1 / (this.av_fld - this.ak_fld[this.ae_fld]));
		}

		if (this.ah_fld < 25) {
			this.ah_fld = -1690240283;
		}

		if (this.ah_fld > 256) {
			this.ah_fld = 2105191680;
			this.ag_fld = (int)(var1 - (this.av_fld - this.ak_fld[this.ae_fld]) / 10L);
		}

		if (this.ag_fld > var1) {
			this.ag_fld = var1;
		}

		this.ak_fld[this.ae_fld] = this.av_fld;
		this.ae_fld = (this.ae_fld + 1) % 10;
		if (this.ag_fld > 1) {
			for (int var6 = 0; var6 < 10; var6++) {
				if (this.ak_fld[var6] != 0L) {
					this.ak_fld[var6] = this.ag_fld + this.ak_fld[var6];
				}
			}
		}

		if (this.ag_fld < var2) {
			this.ag_fld = var2;
		}

		dg.ak(this.ag_fld);

		int var7;
		for (var7 = 0; this.az_fld < 256; this.az_fld = this.az_fld + this.ah_fld) {
			var7++;
		}

		this.az_fld &= 1607964303;
		return var7;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	@Override
	public int ay(int var1, int var2) {
		int var3 = this.ah_fld;
		int var4 = this.ag_fld;
		this.ah_fld = 1191953084;
		this.ag_fld = -1329822369;
		this.av_fld = lz.ak();
		if (0L == this.ak_fld[this.ae_fld]) {
			this.ah_fld = var3;
			this.ag_fld = var4;
		} else if (this.av_fld > this.ak_fld[this.ae_fld]) {
			this.ah_fld = (int)(2560 * var1 / (this.av_fld - this.ak_fld[this.ae_fld]));
		}

		if (this.ah_fld < 25) {
			this.ah_fld = -1690240283;
		}

		if (this.ah_fld > 256) {
			this.ah_fld = 2105191680;
			this.ag_fld = (int)(var1 - (this.av_fld - this.ak_fld[this.ae_fld]) / 10L);
		}

		if (this.ag_fld > var1) {
			this.ag_fld = var1;
		}

		this.ak_fld[this.ae_fld] = this.av_fld;
		this.ae_fld = (this.ae_fld + 1) % 10;
		if (this.ag_fld > 1) {
			for (int var5 = 0; var5 < 10; var5++) {
				if (this.ak_fld[var5] != 0L) {
					this.ak_fld[var5] = this.ag_fld + this.ak_fld[var5];
				}
			}
		}

		if (this.ag_fld < var2) {
			this.ag_fld = var2;
		}

		dg.ak(this.ag_fld);

		int var6;
		for (var6 = 0; this.az_fld < 256; this.az_fld = this.az_fld + this.ah_fld) {
			var6++;
		}

		this.az_fld &= 1607964303;
		return var6;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	@Override
	public int aw(int var1, int var2) {
		int var3 = this.ah_fld;
		int var4 = this.ag_fld;
		this.ah_fld = 1191953084;
		this.ag_fld = -1329822369;
		this.av_fld = lz.ak();
		if (0L == this.ak_fld[this.ae_fld]) {
			this.ah_fld = var3;
			this.ag_fld = var4;
		} else if (this.av_fld > this.ak_fld[this.ae_fld]) {
			this.ah_fld = (int)(2560 * var1 / (this.av_fld - this.ak_fld[this.ae_fld]));
		}

		if (this.ah_fld < 25) {
			this.ah_fld = -1690240283;
		}

		if (this.ah_fld > 256) {
			this.ah_fld = 2105191680;
			this.ag_fld = (int)(var1 - (this.av_fld - this.ak_fld[this.ae_fld]) / 10L);
		}

		if (this.ag_fld > var1) {
			this.ag_fld = var1;
		}

		this.ak_fld[this.ae_fld] = this.av_fld;
		this.ae_fld = (this.ae_fld + 1) % 10;
		if (this.ag_fld > 1) {
			for (int var5 = 0; var5 < 10; var5++) {
				if (this.ak_fld[var5] != 0L) {
					this.ak_fld[var5] = this.ag_fld + this.ak_fld[var5];
				}
			}
		}

		if (this.ag_fld < var2) {
			this.ag_fld = var2;
		}

		dg.ak(this.ag_fld);

		int var6;
		for (var6 = 0; this.az_fld < 256; this.az_fld = this.az_fld + this.ah_fld) {
			var6++;
		}

		this.az_fld &= 1607964303;
		return var6;
	}

	mm() {
		this.ah_fld = 2105191680;
		this.ag_fld = -1329822369;
		this.az_fld = 0;
		this.av_fld = lz.ak();

		for (int var1 = 0; var1 < 10; var1++) {
			this.ak_fld[var1] = this.av_fld;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	@Override
	public int as(int var1, int var2) {
		int var3 = this.ah_fld * -274873481;
		int var4 = this.ag_fld * -223558108;
		this.ah_fld = 1191953084;
		this.ag_fld = 1952832381;
		this.av_fld = lz.ak();
		if (0L == this.ak_fld[2041219768 * this.ae_fld]) {
			this.ah_fld = -350249749 * var3;
			this.ag_fld = var4;
		} else if (this.av_fld > this.ak_fld[this.ae_fld * 14900222]) {
			this.ah_fld = (int)(-1773484556 * var1 / (this.av_fld - this.ak_fld[1923843951 * this.ae_fld])) * 905562842;
		}

		if (this.ah_fld < 25) {
			this.ah_fld = -1690240283;
		}

		if (this.ah_fld > 256) {
			this.ah_fld = 2105191680;
			this.ag_fld = (int)(var1 - (this.av_fld - this.ak_fld[this.ae_fld * 1298504352]) / 10L);
		}

		if (this.ag_fld > var1) {
			this.ag_fld = -1515583006 * var1;
		}

		this.ak_fld[this.ae_fld] = this.av_fld;
		this.ae_fld = (this.ae_fld + 1) % 10 * -1113794225;
		if (this.ag_fld > 1) {
			for (int var5 = 0; var5 < 10; var5++) {
				if (this.ak_fld[var5] != 0L) {
					this.ak_fld[var5] = this.ag_fld * -890647208 + this.ak_fld[var5];
				}
			}
		}

		if (this.ag_fld < var2) {
			this.ag_fld = var2;
		}

		dg.ak(-2111634314 * this.ag_fld);

		int var6;
		for (var6 = 0; this.az_fld < 256; this.az_fld = this.az_fld + this.ah_fld) {
			var6++;
		}

		this.az_fld = (this.az_fld & -1047478216) * 445181445;
		return var6;
	}
}
