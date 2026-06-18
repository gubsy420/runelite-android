import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("af")
public class af {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ay_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ak_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Laq;"
	)
	aq az_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lbh;"
	)
	static bh av_fld = new bh();
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[Lbk;"
	)
	bk[] ae_fld = new bk[10];
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ah_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ag_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int aw_fld;

	@ObfuscatedName("kl")
	@ObfuscatedSignature(
		descriptor = "()Lal;"
	)
	public al kl() {
		return this.av();
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Z)Lal;"
	)
	public al az(boolean var1) {
		short[] var2 = this.at(var1);
		return new al(this.ak_fld, var2, this.ak_fld * this.ah_fld / 1000, this.ak_fld * this.aw_fld / 1000, false, var1);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	void ay(xi var1) {
		this.ak_fld = 22050;

		for (int var2 = 0; var2 < 10; var2++) {
			int var3 = var1.cg();
			if (var3 != 0) {
				var1.au_fld--;
				this.ae_fld[var2] = new bk();
				bk.fu(this.ae_fld[var2], var1);
			}
		}

		this.ah_fld = var1.cm();
		this.aw_fld = var1.cm();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lub;II)Laf;"
	)
	public static af ag(ub var0, int var1, int var2) throws EOFException {
		aq var3 = new aq(av_fld);
		byte[] var4 = var0.bb(var1, var2, 584982574);
		if (var4 == null) {
			return null;
		} else {
			xi var5 = new xi(var4);
			if (var2 == 1) {
				if (var4.length < 4) {
					return null;
				}

				int var6 = var5.co((byte)-66);
				var3.aw(var4, 4);
				var5.au_fld = var6 + 4;
			} else {
				if (var2 != 0) {
					return null;
				}

				var5 = new xi(var4);
			}

			return new af(var5, var2, var3);
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	void as(xi var1) {
		this.ak_fld = 22050;

		for (int var2 = 0; var2 < 10; var2++) {
			int var3 = var1.cg();
			if (var3 != 0) {
				var1.au_fld--;
				this.ae_fld[var2] = new bk();
				bk.fu(this.ae_fld[var2], var1);
			}
		}

		this.ah_fld = var1.cm();
		this.aw_fld = var1.cm();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lub;II)Laf;"
	)
	public static af al(ub var0, int var1, int var2) throws EOFException {
		aq var3 = new aq(av_fld);
		byte[] var4 = var0.bb(var1, var2, 584982574);
		if (var4 == null) {
			return null;
		} else {
			xi var5 = new xi(var4);
			if (var2 == 1) {
				if (var4.length < 4) {
					return null;
				}

				int var6 = var5.co((byte)-37);
				var3.aw(var4, 4);
				var5.au_fld = var6 + 4;
			} else {
				if (var2 != 0) {
					return null;
				}

				var5 = new xi(var4);
			}

			return new af(var5, var2, var3);
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Z)Lal;"
	)
	public al ae(boolean var1) {
		return this.ag_fld == 0 ? this.az(var1) : aq.ss(this.az_fld, -347534849);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public final int ah() {
		int var1 = 9999999;

		for (int var2 = 0; var2 < 10; var2++) {
			if (this.ae_fld[var2] != null && this.ae_fld[var2].af_fld / 20 < var1) {
				var1 = this.ae_fld[var2].af_fld / 20;
			}
		}

		if (this.ah_fld < this.aw_fld && this.ah_fld / 20 < var1) {
			var1 = this.ah_fld / 20;
		}

		if (var1 != 9999999 && var1 != 0) {
			for (int var3 = 0; var3 < 10; var3++) {
				if (this.ae_fld[var3] != null) {
					this.ae_fld[var3].af_fld -= var1 * 20;
				}
			}

			if (this.ah_fld < this.aw_fld) {
				this.ah_fld -= var1 * 20;
				this.aw_fld -= var1 * 20;
			}

			return var1;
		} else {
			return 0;
		}
	}

	@ObfuscatedName("yc")
	@ObfuscatedSignature(
		descriptor = "(Ldj;)[B"
	)
	public static byte[] yc(dj var0) {
		return var0.ae_fld;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()Lal;"
	)
	public al av() {
		return this.ag_fld == 0 ? this.az(false) : aq.ss(this.az_fld, -1392324299);
	}

	af(xi var1, int var2, aq var3) {
		this.ag_fld = var2;
		this.az_fld = var3;
		if (var2 == 0) {
			this.ay(var1);
		} else {
			if (var2 != 1) {
				throw new RuntimeException("Invalid fileId for SFX");
			}

			var3.av(var1);
			this.ak_fld = var3.ak();
			this.ah_fld = aq.wb(var3, -1719504982);
			this.aw_fld = var3.az();
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	void ak(xi var1) {
		this.ak_fld = 22050;

		for (int var2 = 0; var2 < 10; var2++) {
			int var3 = var1.cg();
			if (var3 != 0) {
				var1.au_fld--;
				this.ae_fld[var2] = new bk();
				bk.fu(this.ae_fld[var2], var1);
			}
		}

		this.ah_fld = var1.cm();
		this.aw_fld = var1.cm();
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lub;II)Laf;"
	)
	public static af ar(ub var0, int var1, int var2) throws EOFException {
		aq var3 = new aq(av_fld);
		byte[] var4 = var0.bb(var1, var2, 584982574);
		if (var4 == null) {
			return null;
		} else {
			xi var5 = new xi(var4);
			if (var2 == 1) {
				if (var4.length < 4) {
					return null;
				}

				int var6 = var5.co((byte)-118);
				var3.aw(var4, 4);
				var5.au_fld = var6 + 4;
			} else {
				if (var2 != 0) {
					return null;
				}

				var5 = new xi(var4);
			}

			return new af(var5, var2, var3);
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lub;II)Laf;"
	)
	public static af af(ub var0, int var1, int var2) throws EOFException {
		aq var3 = new aq(av_fld);
		byte[] var4 = var0.bb(var1, var2, 584982574);
		if (var4 == null) {
			return null;
		} else {
			xi var5 = new xi(var4);
			if (var2 == 1) {
				if (var4.length < 4) {
					return null;
				}

				int var6 = var5.co((byte)-122);
				var3.aw(var4, 4);
				var5.au_fld = (var6 + 4) * -675315523;
			} else {
				if (var2 != 0) {
					return null;
				}

				var5 = new xi(var4);
			}

			return new af(var5, var2, var3);
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "()Lal;"
	)
	public al aq() {
		return this.ag_fld == 0 ? this.az(false) : aq.ss(this.az_fld, 554544702);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Z)Lal;"
	)
	public al au(boolean var1) {
		short[] var2 = this.at(var1);
		return new al(this.ak_fld, var2, this.ak_fld * this.ah_fld / 1000, this.ak_fld * this.aw_fld / 1000, false, var1);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Z)Lal;"
	)
	public al ax(boolean var1) {
		short[] var2 = this.at(var1);
		return new al(this.ak_fld, var2, this.ak_fld * this.ah_fld / 1000, this.ak_fld * this.aw_fld / 1000, false, var1);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Z)[S"
	)
	final short[] at(boolean var1) {
		int var2 = 0;

		for (int var3 = 0; var3 < 10; var3++) {
			if (this.ae_fld[var3] != null && this.ae_fld[var3].ar_fld + this.ae_fld[var3].af_fld > var2) {
				var2 = this.ae_fld[var3].ar_fld + this.ae_fld[var3].af_fld;
			}
		}

		if (var2 == 0) {
			return new short[0];
		} else {
			int var11 = this.ak_fld * var2 / 1000;
			short[] var4 = new short[var11];

			for (int var5 = 0; var5 < 10; var5++) {
				if (this.ae_fld[var5] != null) {
					int var6 = this.ae_fld[var5].ar_fld * this.ak_fld / 1000;
					int var7 = this.ae_fld[var5].af_fld * this.ak_fld / 1000;
					int[] var8 = this.ae_fld[var5].ak(var6, this.ae_fld[var5].ar_fld, this.ak_fld);
					if (var1) {
						for (int var12 = 0; var12 < var6; var12++) {
							int var14 = var4[var12 + var7] + (var8[var12] >> 8);
							var14 = og.al(-128, 127, var14);
							var4[var12 + var7] = (byte)var14;
						}
					} else {
						for (int var9 = 0; var9 < var6; var9++) {
							int var10 = var4[var9 + var7] + var8[var9];
							var10 = og.al(-32768, 32767, var10);
							var4[var9 + var7] = (short)var10;
						}
					}
				}
			}

			return var4;
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "()Lal;"
	)
	public al aa() {
		return this.ag_fld == 0 ? this.az(false) : aq.ss(this.az_fld, -1254107905);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "()Lal;"
	)
	public al ai() {
		return this.ag_fld == 0 ? this.az(false) : aq.ss(this.az_fld, -890993091);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Z)Lal;"
	)
	public al am(boolean var1) {
		return this.ag_fld == 0 ? this.az(var1) : aq.ss(this.az_fld, -1341660116);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Z)Lal;"
	)
	public al ad(boolean var1) {
		return this.ag_fld == 0 ? this.az(var1) : aq.ss(this.az_fld, 745041210);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public final int ao() {
		int var1 = 9999999;

		for (int var2 = 0; var2 < 10; var2++) {
			if (this.ae_fld[var2] != null && this.ae_fld[var2].af_fld / 20 < var1) {
				var1 = this.ae_fld[var2].af_fld / 20;
			}
		}

		if (this.ah_fld < this.aw_fld && this.ah_fld / 20 < var1) {
			var1 = this.ah_fld / 20;
		}

		if (var1 != 9999999 && var1 != 0) {
			for (int var3 = 0; var3 < 10; var3++) {
				if (this.ae_fld[var3] != null) {
					this.ae_fld[var3].af_fld -= var1 * 20;
				}
			}

			if (this.ah_fld < this.aw_fld) {
				this.ah_fld -= var1 * 20;
				this.aw_fld -= var1 * 20;
			}

			return var1;
		} else {
			return 0;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Z)[S"
	)
	final short[] aw(boolean var1) {
		int var2 = 0;

		for (int var3 = 0; var3 < 10; var3++) {
			if (this.ae_fld[var3] != null && this.ae_fld[var3].ar_fld + this.ae_fld[var3].af_fld > var2) {
				var2 = this.ae_fld[var3].ar_fld + this.ae_fld[var3].af_fld;
			}
		}

		if (var2 == 0) {
			return new short[0];
		} else {
			int var11 = this.ak_fld * var2 / 1000;
			short[] var4 = new short[var11];

			for (int var5 = 0; var5 < 10; var5++) {
				if (this.ae_fld[var5] != null) {
					int var6 = this.ae_fld[var5].ar_fld * this.ak_fld / 1000;
					int var7 = this.ae_fld[var5].af_fld * this.ak_fld / 1000;
					int[] var8 = this.ae_fld[var5].ak(var6, this.ae_fld[var5].ar_fld, this.ak_fld);
					if (var1) {
						for (int var12 = 0; var12 < var6; var12++) {
							int var14 = var4[var12 + var7] + (var8[var12] >> 8);
							var14 = og.al(-128, 127, var14);
							var4[var12 + var7] = (byte)var14;
						}
					} else {
						for (int var9 = 0; var9 < var6; var9++) {
							int var10 = var4[var9 + var7] + var8[var9];
							var10 = og.al(-32768, 32767, var10);
							var4[var9 + var7] = (short)var10;
						}
					}
				}
			}

			return var4;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Z)[S"
	)
	final short[] ap(boolean var1) {
		int var2 = 0;

		for (int var3 = 0; var3 < 10; var3++) {
			if (this.ae_fld[var3] != null && this.ae_fld[var3].ar_fld + this.ae_fld[var3].af_fld > var2) {
				var2 = this.ae_fld[var3].ar_fld + this.ae_fld[var3].af_fld;
			}
		}

		if (var2 == 0) {
			return new short[0];
		} else {
			int var11 = this.ak_fld * var2 / -1644812371;
			short[] var4 = new short[var11];

			for (int var5 = 0; var5 < 10; var5++) {
				if (this.ae_fld[var5] != null) {
					int var6 = this.ae_fld[var5].ar_fld * this.ak_fld / -848143282;
					int var7 = this.ae_fld[var5].af_fld * this.ak_fld / -1372283392;
					int[] var8 = this.ae_fld[var5].ak(var6, this.ae_fld[var5].ar_fld, this.ak_fld);
					if (var1) {
						for (int var12 = 0; var12 < var6; var12++) {
							int var14 = var4[var12 + var7] + (var8[var12] >> 8);
							var14 = og.al(-499366076, 127, var14);
							var4[var12 + var7] = (byte)var14;
						}
					} else {
						for (int var9 = 0; var9 < var6; var9++) {
							int var10 = var4[var9 + var7] + var8[var9];
							var10 = og.al(836636427, -493427909, var10);
							var4[var9 + var7] = (short)var10;
						}
					}
				}
			}

			return var4;
		}
	}
}
