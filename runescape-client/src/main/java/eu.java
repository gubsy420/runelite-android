import java.io.EOFException;
import net.runelite.api.TextureProvider;
import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("eu")
@Implements({"TextureProvider"})
public class eu implements fx, TextureProvider {
	@ObfuscatedName("fo")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	static ik fo_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lna;"
	)
	na ag_fld = new na();
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -112403417
	)
	int av_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	ub aw_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "D"
	)
	double ae_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "[Lfb;"
	)
	fb[] ak_fld;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int an_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1247355577
	)
	int az_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 922579845
	)
	int ah_fld = 0;

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	public int ak(byte var1) {
		try {
			if (this.ak_fld.length == 0) {
				return 100;
			} else {
				int var2 = 0;
				int var3 = 0;
				fb[] var4 = this.ak_fld;

				for (int var5 = 0; var5 < var4.length; var5++) {
					fb var6 = var4[var5];
					if (var6 != null && -1 != var6.ah_fld) {
						var2++;
						if (this.aw_fld.cv(var6.ah_fld, 300855104)) {
							var3++;
						}
					}
				}

				return var2 == 0 ? 0 : 100 * var3 / var2;
			}
		} catch (Throwable var7) {
			throw new RuntimeException(var7);
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(D)V"
	)
	public void ax(double var1) {
		this.ae_fld = var1;
		bu(this, (byte)124);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)[I"
	)
	@Override
	public int[] az(int var1, int var2) {
		try {
			fb var3 = this.ak_fld[var1];
			if (var3 != null) {
				if (null != var3.af_fld) {
					this.ag_fld.av(var3);
					var3.al_fld = true;
					return var3.af_fld;
				}

				boolean var4 = var3.ak(this.ae_fld, this.az_fld, this.aw_fld);
				if (var4) {
					if (0 == this.ah_fld) {
						fb var5 = (fb)this.ag_fld.ah();
						var5.az();
					} else {
						this.ah_fld--;
					}

					this.ag_fld.av(var3);
					var3.al_fld = true;
					return var3.af_fld;
				}
			}

			return null;
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	@Override
	public int ai(int var1) {
		return this.ak_fld[var1] != null ? this.ak_fld[var1].aw_fld : 0;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	@Override
	public boolean ae(int var1, int var2) {
		return this.ak_fld[var1].ay_fld;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ay() {
		try {
			if (this.ak_fld.length == 0) {
				return 100;
			} else {
				int var1 = 0;
				int var2 = 0;
				fb[] var3 = this.ak_fld;

				for (int var4 = 0; var4 < var3.length; var4++) {
					fb var5 = var3[var4];
					if (var5 != null && -1 != var5.ah_fld) {
						var1++;
						if (this.aw_fld.cv(var5.ah_fld, 300855104)) {
							var2++;
						}
					}
				}

				return var1 == 0 ? 0 : 100 * var2 / var1;
			}
		} catch (Throwable var7) {
			throw new RuntimeException(var7);
		}
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(Leu;)I"
	)
	public static int bf(eu var0) throws EOFException {
		try {
			if (var0.ak_fld.length == 0) {
				return 100;
			} else {
				int var1 = 0;
				int var2 = 0;
				fb[] var3 = var0.ak_fld;

				for (int var4 = 0; var4 < var3.length; var4++) {
					fb var5 = var3[var4];
					if (var5 != null && -1 != var5.ah_fld) {
						var1++;
						if (var0.aw_fld.cv(var5.ah_fld, 300855104)) {
							var2++;
						}
					}
				}

				return var1 == 0 ? 0 : 979828535 * var2 / var1;
			}
		} catch (Throwable var7) {
			throw new RuntimeException(var7);
		}
	}

	@ObfuscatedName("fq")
	@ObfuscatedSignature(
		descriptor = "(Lub;Lub;IDI)V"
	)
	public void fq(ub var1, ub var2, int var3, double var4, int var6) {
		this.io(128);
		this.ut(128);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(D)V"
	)
	public void ag(double var1) {
		this.ae_fld = var1;
		bu(this, (byte)58);
	}

	@ObfuscatedName("yj")
	@ObfuscatedSignature(
		descriptor = "(Leu;IB)V"
	)
	public static void yj(eu var0, int var1, byte var2) {
		if (var0 == null) {
			var0.getClass();
		} else {
			for (int var3 = 0; var3 < var0.ak_fld.length; var3++) {
				fb var4 = var0.ak_fld[var3];
				if (var4 != null && var4.as_fld != 0 && var4.al_fld) {
					var4.av(var1);
					var4.al_fld = false;
				}
			}

			var0.wb(var1);
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void aj() {
		for (int var1 = 0; var1 < this.ak_fld.length; var1++) {
			if (null != this.ak_fld[var1]) {
				this.ak_fld[var1].az();
			}
		}

		this.ag_fld = new na();
		this.ah_fld = this.av_fld * 1552375694;
	}

	@ObfuscatedName("io")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void io(int var1) {
		this.av_fld = var1 * 493342571;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	@Override
	public boolean ap(int var1) {
		return this.ak_fld[var1].ay_fld;
	}

	@ObfuscatedName("ut")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void ut(int var1) {
		this.ah_fld = var1;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(D)V"
	)
	public void au(double var1) {
		this.ae_fld = var1;
		bu(this, (byte)2);
	}

	public eu(ub var1, ub var2, int var3, double var4, int var6) throws EOFException {
		this.ae_fld = 1.0;
		this.az_fld = 1931592832;
		this.aw_fld = var2;
		this.av_fld = var3 * 493342571;
		this.ah_fld = this.av_fld;
		this.ae_fld = var4;
		this.az_fld = var6;
		int[] var7 = var1.cp(0, (byte)93);
		if (var7 != null) {
			int var8 = var7.length;
			this.ak_fld = new fb[var1.ce(0, -785668116)];

			for (int var9 = 0; var9 < var8; var9++) {
				xi var10 = new xi(var1.bb(0, var7[var9], 584982574));
				this.ak_fld[var7[var9]] = new fb(var10);
			}
		} else {
			this.ak_fld = new fb[0];
		}

		this.fq(var1, var2, var3, var4, var6);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)[I"
	)
	@Override
	public int[] aa(int var1) {
		try {
			fb var2 = this.ak_fld[var1];
			if (var2 != null) {
				if (null != var2.af_fld) {
					this.ag_fld.av(var2);
					var2.al_fld = true;
					return var2.af_fld;
				}

				boolean var3 = var2.ak(this.ae_fld, this.az_fld, this.aw_fld);
				if (var3) {
					if (0 == this.ah_fld) {
						fb var4 = (fb)this.ag_fld.ah();
						var4.az();
					} else {
						this.ah_fld--;
					}

					this.ag_fld.av(var2);
					var2.al_fld = true;
					return var2.af_fld;
				}
			}

			return null;
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("tk")
	@ObfuscatedSignature(
		descriptor = "(Lev;III)V"
	)
	public static void tk(ev var0, int var1, int var2, int var3) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.db_fld = var1;
		var0.ck_fld = var2;
		var0.cw_fld = var3;
	}

	@ObfuscatedName("getDefaultColor")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	@Export("getDefaultColor")
	@Override
	public int getDefaultColor(int var1) {
		return this.av(var1, (byte)-49);
	}

	@ObfuscatedName("yn")
	@ObfuscatedSignature(
		descriptor = "()[Lfb;"
	)
	public fb[] getTextures() {
		return this.ak_fld;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	@Override
	public int ad(int var1) {
		return this.ak_fld[var1] != null ? this.ak_fld[var1].aw_fld : 0;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	@Override
	public boolean ab(int var1) {
		return this.ak_fld[var1].ay_fld;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	@Override
	public int am(int var1) {
		return this.ak_fld[var1] != null ? this.ak_fld[var1].aw_fld : 0;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	@Override
	public int aq(int var1) {
		return this.ak_fld[var1] != null ? this.ak_fld[var1].aw_fld : 0;
	}

	@ObfuscatedName("wb")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void wb(int var1) {
		og.ci_fld.getCallbacks().drawAboveOverheads();
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void bm(int var1) {
		for (int var2 = 0; var2 < this.ak_fld.length; var2++) {
			fb var3 = this.ak_fld[var2];
			if (var3 != null && var3.as_fld != 0 && var3.al_fld) {
				var3.av(var1);
				var3.al_fld = false;
			}
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Leu;I)V"
	)
	public static void ak(eu var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		for (int var2 = 0; var2 < var0.ak_fld.length; var2++) {
			fb var3 = var0.ak_fld[var2];
			if (var3 != null && var3.as_fld != 0 && var3.al_fld) {
				var3.av(var1);
				var3.al_fld = false;
			}
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void at() {
		for (int var1 = 0; var1 < this.ak_fld.length; var1++) {
			if (null != this.ak_fld[var1]) {
				this.ak_fld[var1].az();
			}
		}

		this.ag_fld = new na();
		this.ah_fld = this.av_fld * 1723074431;
	}

	@ObfuscatedName("xe")
	@ObfuscatedSignature(
		descriptor = "(Leu;)I"
	)
	public static int xe(eu var0) throws EOFException {
		try {
			if (var0.ak_fld.length == 0) {
				return 100;
			} else {
				int var1 = 0;
				int var2 = 0;
				fb[] var3 = var0.ak_fld;

				for (int var4 = 0; var4 < var3.length; var4++) {
					fb var5 = var3[var4];
					if (var5 != null && -1 != var5.ah_fld) {
						var1++;
						if (var0.aw_fld.cv(var5.ah_fld, 300855104)) {
							var2++;
						}
					}
				}

				return var1 == 0 ? 0 : 758141630 * var2 / var1;
			}
		} catch (Throwable var7) {
			throw new RuntimeException(var7);
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)[I"
	)
	@Override
	public int[] an(int var1) {
		try {
			fb var2 = this.ak_fld[var1];
			if (var2 != null) {
				if (null != var2.af_fld) {
					this.ag_fld.av(var2);
					var2.al_fld = true;
					return var2.af_fld;
				}

				boolean var3 = var2.ak(this.ae_fld, this.az_fld, this.aw_fld);
				if (var3) {
					if (0 == this.ah_fld) {
						fb var4 = (fb)this.ag_fld.ah();
						var4.az();
					} else {
						this.ah_fld--;
					}

					this.ag_fld.av(var2);
					var2.al_fld = true;
					return var2.af_fld;
				}
			}

			return null;
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ac() {
		for (int var1 = 0; var1 < this.ak_fld.length; var1++) {
			if (null != this.ak_fld[var1]) {
				this.ak_fld[var1].az();
			}
		}

		this.ag_fld = new na();
		this.ah_fld = this.av_fld;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	@Override
	public boolean ao(int var1) {
		return this.ak_fld[var1].ay_fld;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IB)I"
	)
	@Override
	public int av(int var1, byte var2) {
		return this.ak_fld[var1] != null ? this.ak_fld[var1].aw_fld : 0;
	}

	@ObfuscatedName("setBrightness")
	@ObfuscatedSignature(
		descriptor = "(D)V"
	)
	@Export("setBrightness")
	@Override
	public void setBrightness(double var1) {
		this.ax(var1);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public static void ag(int var0) {
		my.az_fld.clear();
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(Leu;B)V"
	)
	public static void bu(eu var0, byte var1) {
		if (var0 == null) {
			var0.getClass();
		} else {
			for (int var2 = 0; var2 < var0.ak_fld.length; var2++) {
				if (null != var0.ak_fld[var2]) {
					if (var1 <= 1) {
						return;
					}

					var0.ak_fld[var2].az();
				}
			}

			var0.ag_fld = new na();
			var0.ah_fld = var0.av_fld;
		}
	}

	@ObfuscatedName("load")
	@ObfuscatedSignature(
		descriptor = "(I)[I"
	)
	@Export("load")
	@Override
	public int[] load(int var1) {
		try {
			return this.az(var1, -386542318);
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(CB)Z"
	)
	public static boolean af(char var0) {
		return var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
	}

	@ObfuscatedName("getBrightness")
	@ObfuscatedSignature(
		descriptor = "()D"
	)
	@Export("getBrightness")
	@Override
	public double getBrightness() {
		return this.ae_fld;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Leu;D)V"
	)
	public static void at(eu var0, double var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ae_fld = var1;
		bu(var0, (byte)118);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lsn;FFFFFFFFI)V"
	)
	static void az(sn var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
		if (null != var0) {
			var0.aw_fld = var1;
			float var10 = var4 - var1;
			float var11 = var8 - var5;
			float var12 = var2 - var1;
			float var13 = 0.0F;
			float var14 = 0.0F;
			if (0.0F != var12) {
				var13 = (var6 - var5) / var12;
			}

			var12 = var4 - var3;
			if (var12 != 0.0F) {
				var14 = (var8 - var7) / var12;
			}

			float var15 = 1.0F / (var10 * var10);
			float var16 = var10 * var13;
			float var17 = var14 * var10;
			var0.as_fld = (var16 + var17 - var11 - var11) * var15 / var10;
			var0.ar_fld = var15 * (var11 + var11 + var11 - var16 - var16 - var17);
			var0.af_fld = var13;
			var0.al_fld = var5;
		}
	}

	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "(III)I"
	)
	static int dm(int var0, int var1) {
		int var3 = var1 - 334;
		if (var3 < 0) {
			var3 = 0;
		} else if (var3 > 100) {
			var3 = 100;
		}

		int var4 = client.fk_fld + (client.fc_fld - client.fk_fld) * var3 / 100;
		return var4 * var0 / 256;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)Lyq;"
	)
	public static yq ag(int var0, int var1) {
		return yj.ae_fld[var0];
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	public void ah(byte var1) {
		for (int var2 = 0; var2 < this.ak_fld.length; var2++) {
			if (null != this.ak_fld[var2]) {
				if (var1 <= 1) {
					return;
				}

				this.ak_fld[var2].ar();
			}
		}

		this.ag_fld = new na();
		this.ah_fld = this.av_fld;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)V"
	)
	public void aw(int var1, byte var2) {
		for (int var3 = 0; var3 < this.ak_fld.length; var3++) {
			fb var4 = this.ak_fld[var3];
			if (var4 != null && var4.ah_fld != 0 && var4.ay_fld) {
				var4.av(var1);
				var4.al_fld = false;
			}
		}

		this.io(var1);
	}
}
