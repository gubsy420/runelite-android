import javax.sound.sampled.LineUnavailableException;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("ao")
public class ao {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1770166069
	)
	int ai_fld = -884448352;
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bc_fld;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1221617769
	)
	public int ab_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int av_fld;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1180038547
	)
	int aj_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int aw_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ay_fld;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	public int[] aq_fld;
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -710509181
	)
	int br_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ag_fld;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Laj;"
	)
	aj am_fld;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	@ObfuscatedGetter(
		longValue = 8355586976594916147L
	)
	long at_fld = lz.ak();
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 395815829
	)
	public int ao_fld;
	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int cw_fld;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 761033989
	)
	int ap_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ak_fld;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1119945539
	)
	int ac_fld;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	@ObfuscatedGetter(
		longValue = -6611141581354215707L
	)
	long bd_fld = 0L;
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1231063793
	)
	int bm_fld;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	@ObfuscatedGetter(
		longValue = 1257581724694124817L
	)
	long ad_fld;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean bz_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int az_fld;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "[Laj;"
	)
	aj[] be_fld;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1937673539
	)
	public static int ar_fld;
	@ObfuscatedName("ku")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	static lh ku_fld;
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "[Laj;"
	)
	aj[] bs_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ae_fld;

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void bp(int var1) throws Exception, LineUnavailableException {
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Laj;I)V"
	)
	public final synchronized void az(aj var1) {
		this.am_fld = var1;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public final synchronized void ah(int var1) {
		if (null != this.aq_fld) {
			long var2 = lz.ak();

			try {
				if (0L != this.bd_fld) {
					if (var2 < this.bd_fld) {
						return;
					}

					this.al(this.ao_fld, 1435711990);
					this.bd_fld = 0L;
					this.bz_fld = true;
				}

				int var4 = this.au((byte)80);
				if (this.bm_fld - var4 > this.ac_fld) {
					this.ac_fld = -1173889387 * (this.bm_fld - var4);
				}

				int var5 = this.ab_fld + this.ap_fld;
				if (var5 + 512 > 32768) {
					if (var1 == -930898849) {
						return;
					}

					var5 = 32256;
				}

				if (512 + var5 > this.ao_fld) {
					this.ao_fld += 1024;
					if (this.ao_fld > 32768) {
						if (var1 == -930898849) {
							return;
						}

						this.ao_fld = 601784320;
					}

					this.an(1003336709);
					this.al(this.ao_fld, 610961479);
					var4 = 0;
					this.bz_fld = true;
					if (var5 + 512 > this.ao_fld) {
						var5 = this.ao_fld - 512;
						this.ap_fld = -2069950515 * (var5 - this.ab_fld);
					}
				}

				while (var4 < var5) {
					this.as(this.aq_fld, 512);
					this.ax();
					var4 += 512;
				}

				if (var2 > this.ad_fld) {
					if (var1 == -930898849) {
						return;
					}

					if (!this.bz_fld) {
						if (this.ac_fld == 0 && 0 == this.aj_fld) {
							this.an(-66533433);
							this.bd_fld = 2000L + var2;
							return;
						}

						this.ap_fld = Math.min(this.aj_fld, this.ac_fld);
						this.aj_fld = this.ac_fld * 2030979473;
					} else {
						this.bz_fld = false;
					}

					this.ac_fld = 0;
					this.ad_fld = -423362398426007567L * (2000L + var2);
				}

				this.bm_fld = var4;
			} catch (Exception var7) {
				this.an(-1578438864);
				this.bd_fld = var2 + 2000L;
			}

			try {
				if (var2 > this.at_fld + 500000L) {
					var2 = this.at_fld;
				}

				while (var2 > this.at_fld + 5000L) {
					this.ay(512);
					this.at_fld = this.at_fld + -5056571057394204677L * (512000 / ar_fld);
				}
			} catch (Exception var6) {
				this.at_fld = var2;
			}
		}
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	final void bh(int var1) {
		this.br_fld -= var1 * 496138539;
		if (this.br_fld < 0) {
			this.br_fld = 0;
		}

		if (null != this.am_fld) {
			this.am_fld.af(var1);
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public final synchronized void aw() {
		this.bz_fld = true;

		try {
			this.aa((byte)7);
		} catch (Exception var3) {
			this.an(2049791422);
			this.bd_fld = lz.ak() + 2000L;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public final synchronized void av(int var1) {
		if (null != if_.an_fld) {
			boolean var2 = true;

			for (int var3 = 0; var3 < 2; var3++) {
				if (var1 == -250949181) {
					return;
				}

				if (if_.an_fld.ak_fld[var3] == this) {
					if_.an_fld.ak_fld[var3] = null;
				}

				if (null != if_.an_fld.ak_fld[var3]) {
					var2 = false;
				}
			}

			if (var2) {
				eo.au_fld.shutdownNow();
				eo.au_fld = null;
				if_.an_fld = null;
			}
		}

		this.an(-1609523354);
		this.aq_fld = null;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Laj;)V"
	)
	static final void aq(aj var0) {
		var0.ai_fld = false;
		if (null != var0.aa_fld) {
			var0.aa_fld.aw_fld = 0;
		}

		for (aj var1 = var0.ah(); null != var1; var1 = var0.aw()) {
			ie.ag(var1, -1052960615);
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "([II)V"
	)
	final void as(int[] var1, int var2) {
		int var3 = var2;
		if (jx.al_fld) {
			var3 = var2 << 1;
		}

		ya.ar(var1, 0, var3);
		this.br_fld -= var2 * 496138539;
		if (this.am_fld != null && this.br_fld <= 0) {
			this.br_fld = this.br_fld + 496138539 * (ar_fld >> 4);
			ie.ag(this.am_fld, -1052960615);
			this.ar(this.am_fld, this.am_fld.bv());
			int var4 = 0;
			int var5 = 255;

			label143:
			for (int var6 = 7; var5 != 0; var6--) {
				int var7;
				int var8;
				if (var6 < 0) {
					var7 = var6 & 3;
					var8 = -(var6 >> 2);
				} else {
					var7 = var6;
					var8 = 0;
				}

				for (int var9 = var5 >>> var7 & 286331153; 0 != var9; var9 >>>= 4) {
					if ((var9 & 1) != 0) {
						var5 &= ~(1 << var7);
						aj var10 = null;
						aj var11 = this.be_fld[var7];

						while (var11 != null) {
							ad var12 = var11.aa_fld;
							if (var12 != null && var12.aw_fld > var8) {
								var5 |= 1 << var7;
								var10 = var11;
								var11 = var11.aq_fld;
							} else {
								var11.ai_fld = true;
								int var13 = var11.bk();
								var4 += var13;
								if (null != var12) {
									var12.aw_fld += var13;
								}

								if (var4 >= this.ai_fld) {
									break label143;
								}

								aj var14 = var11.ah();
								if (var14 != null) {
									for (int var15 = var11.am_fld; var14 != null; var14 = var11.aw()) {
										this.ar(var14, var15 * var14.bv() >> 8);
									}
								}

								aj var20 = var11.aq_fld;
								var11.aq_fld = null;
								if (var10 == null) {
									this.be_fld[var7] = var20;
								} else {
									var10.aq_fld = var20;
								}

								if (var20 == null) {
									this.bs_fld[var7] = var10;
								}

								var11 = var20;
							}
						}
					}

					var7 += 4;
					var8++;
				}
			}

			for (int var16 = 0; var16 < 8; var16++) {
				aj var17 = this.be_fld[var16];
				aj[] var18 = this.be_fld;
				this.bs_fld[var16] = null;
				var18[var16] = null;

				while (var17 != null) {
					aj var19 = var17.aq_fld;
					var17.aq_fld = null;
					var17 = var19;
				}
			}
		}

		if (this.br_fld < 0) {
			this.br_fld = 0;
		}

		if (this.am_fld != null) {
			this.am_fld.as(var1, 0, var2);
		}

		this.at_fld = lz.ak();
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public final synchronized void br() {
		if (null != if_.an_fld) {
			boolean var1 = true;

			for (int var2 = 0; var2 < 2; var2++) {
				if (if_.an_fld.ak_fld[var2] == this) {
					if_.an_fld.ak_fld[var2] = null;
				}

				if (null != if_.an_fld.ak_fld[var2]) {
					var1 = false;
				}
			}

			if (var1) {
				eo.au_fld.shutdownNow();
				eo.au_fld = null;
				if_.an_fld = null;
			}
		}

		this.an(954391634);
		this.aq_fld = null;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Laj;)V"
	)
	static final void ai(aj var0) {
		var0.ai_fld = false;
		if (null != var0.aa_fld) {
			var0.aa_fld.aw_fld = 0;
		}

		for (aj var1 = var0.ah(); null != var1; var1 = var0.aw()) {
			ie.ag(var1, -1052960615);
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void al(int var1, int var2) throws Exception, LineUnavailableException {
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	protected int au(byte var1) {
		return this.ao_fld;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	protected void ax() {
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	protected void an(int var1) {
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	protected void aa(byte var1) {
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Laj;II)V"
	)
	final void ar(aj var1, int var2) {
		int var4 = var2 >> 5;
		aj var5 = this.bs_fld[var4];
		if (null == var5) {
			this.be_fld[var4] = var1;
		} else {
			var5.aq_fld = var1;
		}

		this.bs_fld[var4] = var1;
		var1.am_fld = var2;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "([II)V"
	)
	final void bf(int[] var1, int var2) {
		int var3 = var2;
		if (jx.al_fld) {
			var3 = var2 << 1;
		}

		ya.ar(var1, 0, var3);
		this.br_fld -= var2 * 496138539;
		if (this.am_fld != null && this.br_fld <= 0) {
			this.br_fld = this.br_fld + 496138539 * (ar_fld >> 4);
			ie.ag(this.am_fld, -1052960615);
			this.ar(this.am_fld, this.am_fld.bv());
			int var4 = 0;
			int var5 = -297177410;

			label139:
			for (int var6 = 7; var5 != 0; var6--) {
				int var7;
				int var8;
				if (var6 < 0) {
					var7 = var6 & 3;
					var8 = -(var6 >> 2);
				} else {
					var7 = var6;
					var8 = 0;
				}

				for (int var9 = var5 >>> var7 & 286331153; 0 != var9; var9 >>>= 4) {
					if ((var9 & 1) != 0) {
						var5 &= ~(1 << var7);
						aj var10 = null;
						aj var11 = this.be_fld[var7];

						while (var11 != null) {
							ad var12 = var11.aa_fld;
							if (var12 != null && var12.aw_fld > var8) {
								var5 |= 1 << var7;
								var10 = var11;
								var11 = var11.aq_fld;
							} else {
								var11.ai_fld = true;
								int var13 = var11.bk();
								var4 += var13;
								if (null != var12) {
									var12.aw_fld += var13;
								}

								if (var4 >= this.ai_fld) {
									break label139;
								}

								aj var14 = var11.ah();
								if (var14 != null) {
									for (int var15 = var11.am_fld; var14 != null; var14 = var11.aw()) {
										this.ar(var14, var15 * var14.bv() >> 8);
									}
								}

								aj var20 = var11.aq_fld;
								var11.aq_fld = null;
								if (var10 == null) {
									this.be_fld[var7] = var20;
								} else {
									var10.aq_fld = var20;
								}

								if (var20 == null) {
									this.bs_fld[var7] = var10;
								}

								var11 = var20;
							}
						}
					}

					var7 += 4;
					var8++;
				}
			}

			for (int var16 = 0; var16 < 8; var16++) {
				aj var17 = this.be_fld[var16];
				aj[] var18 = this.be_fld;
				this.bs_fld[var16] = null;
				var18[var16] = null;

				while (var17 != null) {
					aj var19 = var17.aq_fld;
					var17.aq_fld = null;
					var17 = var19;
				}
			}
		}

		if (-1429176281 * this.br_fld < 0) {
			this.br_fld = 0;
		}

		if (this.am_fld != null) {
			this.am_fld.as(var1, 0, var2);
		}

		this.at_fld = lz.ak();
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Laj;)V"
	)
	static final void am(aj var0) {
		var0.ai_fld = false;
		if (null != var0.aa_fld) {
			var0.aa_fld.aw_fld = 0;
		}

		for (aj var1 = var0.ah(); null != var1; var1 = var0.aw()) {
			ie.ag(var1, -1052960615);
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public final void ae() {
		this.bz_fld = true;
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	protected void cc() {
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public final synchronized void ap() {
		if (null != this.aq_fld) {
			long var1 = lz.ak();

			try {
				if (0L != this.bd_fld) {
					if (var1 < this.bd_fld) {
						return;
					}

					this.al(this.ao_fld, 1347528436);
					this.bd_fld = 0L;
					this.bz_fld = true;
				}

				int var3 = this.au((byte)100);
				if (this.bm_fld - var3 > this.ac_fld) {
					this.ac_fld = -1173889387 * (this.bm_fld - var3);
				}

				int var4 = this.ab_fld + this.ap_fld;
				if (var4 + 512 > 32768) {
					var4 = 32256;
				}

				if (512 + var4 > this.ao_fld) {
					this.ao_fld += 1024;
					if (this.ao_fld > 32768) {
						this.ao_fld = 601784320;
					}

					this.an(1366833480);
					this.al(this.ao_fld, 1440098063);
					var3 = 0;
					this.bz_fld = true;
					if (var4 + 512 > this.ao_fld) {
						var4 = this.ao_fld - 512;
						this.ap_fld = -2069950515 * (var4 - this.ab_fld);
					}
				}

				while (var3 < var4) {
					this.as(this.aq_fld, 512);
					this.ax();
					var3 += 512;
				}

				if (var1 > this.ad_fld) {
					if (!this.bz_fld) {
						if (this.ac_fld == 0 && 0 == this.aj_fld) {
							this.an(561380780);
							this.bd_fld = 2000L + var1;
							return;
						}

						this.ap_fld = Math.min(this.aj_fld, this.ac_fld);
						this.aj_fld = this.ac_fld * 2030979473;
					} else {
						this.bz_fld = false;
					}

					this.ac_fld = 0;
					this.ad_fld = -423362398426007567L * (2000L + var1);
				}

				this.bm_fld = var3;
			} catch (Exception var6) {
				this.an(-1918369720);
				this.bd_fld = var1 + 2000L;
			}

			try {
				if (var1 > this.at_fld + 500000L) {
					var1 = this.at_fld;
				}

				while (var1 > this.at_fld + 5000L) {
					this.ay(512);
					this.at_fld = this.at_fld + -5056571057394204677L * (512000 / ar_fld);
				}
			} catch (Exception var5) {
				this.at_fld = var1;
			}
		}
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public final synchronized void bz() {
		if (null != this.aq_fld) {
			long var1 = lz.ak();

			try {
				if (0L != this.bd_fld) {
					if (var1 < this.bd_fld) {
						return;
					}

					this.al(-1378392920 * this.ao_fld, 923733250);
					this.bd_fld = 0L;
					this.bz_fld = true;
				}

				int var3 = this.au((byte)46);
				if (this.bm_fld - var3 > this.ac_fld) {
					this.ac_fld = 782447772 * (this.bm_fld - var3);
				}

				int var4 = this.ab_fld + this.ap_fld;
				if (var4 + -49309829 > -2098484172) {
					var4 = 1249179260;
				}

				if (512 + var4 > this.ao_fld) {
					this.ao_fld += 1906769235;
					if (this.ao_fld > 32768) {
						this.ao_fld = 1595892892;
					}

					this.an(-2133054212);
					this.al(this.ao_fld, 1958409037);
					var3 = 0;
					this.bz_fld = true;
					if (var4 + -1148739214 > this.ao_fld) {
						var4 = this.ao_fld - 512;
						this.ap_fld = -2069950515 * (var4 - this.ab_fld);
					}
				}

				while (var3 < var4) {
					this.as(this.aq_fld, 1035803161);
					this.ax();
					var3 += 512;
				}

				if (var1 > this.ad_fld) {
					if (!this.bz_fld) {
						if (this.ac_fld == 0 && 0 == this.aj_fld) {
							this.an(1561313313);
							this.bd_fld = 2000L + var1;
							return;
						}

						this.ap_fld = Math.min(this.aj_fld, this.ac_fld) * -1840358738;
						this.aj_fld = this.ac_fld * 2030979473;
					} else {
						this.bz_fld = false;
					}

					this.ac_fld = 0;
					this.ad_fld = -423362398426007567L * (2000L + var1);
				}

				this.bm_fld = var3 * 1607709491;
			} catch (Exception var6) {
				this.an(-937769838);
				this.bd_fld = var1 + 2000L;
			}

			try {
				if (var1 > this.at_fld + 500000L) {
					var1 = this.at_fld;
				}

				while (var1 > this.at_fld + 5000L) {
					this.ay(512);
					this.at_fld = this.at_fld + -5056571057394204677L * (968672588 / ar_fld);
				}
			} catch (Exception var5) {
				this.at_fld = var1;
			}
		}
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void bv(int var1) throws Exception, LineUnavailableException {
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public final synchronized void bm() {
		if (null != this.aq_fld) {
			long var1 = lz.ak();

			try {
				if (0L != this.bd_fld) {
					if (var1 < this.bd_fld) {
						return;
					}

					this.al(this.ao_fld, -1379636447);
					this.bd_fld = 0L;
					this.bz_fld = true;
				}

				int var3 = this.au((byte)116);
				if (this.bm_fld - var3 > this.ac_fld) {
					this.ac_fld = -1173889387 * (this.bm_fld - var3);
				}

				int var4 = this.ab_fld + this.ap_fld;
				if (var4 + 512 > 32768) {
					var4 = 32256;
				}

				if (512 + var4 > this.ao_fld) {
					this.ao_fld += 1024;
					if (this.ao_fld > 32768) {
						this.ao_fld = 601784320;
					}

					this.an(1955704777);
					this.al(this.ao_fld, -1724535685);
					var3 = 0;
					this.bz_fld = true;
					if (var4 + 512 > this.ao_fld) {
						var4 = this.ao_fld - 512;
						this.ap_fld = -2069950515 * (var4 - this.ab_fld);
					}
				}

				while (var3 < var4) {
					this.as(this.aq_fld, 512);
					this.ax();
					var3 += 512;
				}

				if (var1 > this.ad_fld) {
					if (!this.bz_fld) {
						if (this.ac_fld == 0 && 0 == this.aj_fld) {
							this.an(493447413);
							this.bd_fld = 2000L + var1;
							return;
						}

						this.ap_fld = Math.min(this.aj_fld, this.ac_fld);
						this.aj_fld = this.ac_fld * 2030979473;
					} else {
						this.bz_fld = false;
					}

					this.ac_fld = 0;
					this.ad_fld = -423362398426007567L * (2000L + var1);
				}

				this.bm_fld = var3;
			} catch (Exception var6) {
				this.an(-1719805426);
				this.bd_fld = var1 + 2000L;
			}

			try {
				if (var1 > this.at_fld + 500000L) {
					var1 = this.at_fld;
				}

				while (var1 > this.at_fld + 5000L) {
					this.ay(512);
					this.at_fld = this.at_fld + -5056571057394204677L * (512000 / ar_fld);
				}
			} catch (Exception var5) {
				this.at_fld = var1;
			}
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public final void aj() {
		this.bz_fld = true;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public final synchronized void at() {
		this.bz_fld = true;

		try {
			this.aa((byte)7);
		} catch (Exception var2) {
			this.an(-1201786056);
			this.bd_fld = lz.ak() + 2000L;
		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public final synchronized void bs() {
		this.bz_fld = true;

		try {
			this.aa((byte)7);
		} catch (Exception var2) {
			this.an(695554438);
			this.bd_fld = lz.ak() + 2000L;
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public final synchronized void bd() {
		this.bz_fld = true;

		try {
			this.aa((byte)7);
		} catch (Exception var2) {
			this.an(-242777345);
			this.bd_fld = lz.ak() + 2000L;
		}
	}

	@ObfuscatedName("ej")
	@ObfuscatedSignature(
		descriptor = "(Lkj;)Z"
	)
	public static boolean ej(kj var0) {
		return -1 != var0.az_fld;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public final synchronized void ac() {
		this.bz_fld = true;

		try {
			this.aa((byte)7);
		} catch (Exception var2) {
			this.an(-1138779015);
			this.bd_fld = lz.ak() + 2000L;
		}
	}

	@ObfuscatedName("xj")
	@ObfuscatedSignature(
		descriptor = "(Lzg;I)I"
	)
	public static int xj(zg var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.aq(var1, var1 + 1);
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	protected void bw() {
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	protected void bq() {
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	protected int bc() {
		return this.ao_fld;
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	final void bk(int var1) {
		this.br_fld -= var1 * 496138539;
		if (this.br_fld < 0) {
			this.br_fld = 0;
		}

		if (null != this.am_fld) {
			this.am_fld.af(var1);
		}
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "([II)V"
	)
	final void bj(int[] var1, int var2) {
		int var3 = var2;
		if (jx.al_fld) {
			var3 = var2 << 1;
		}

		ya.ar(var1, 0, var3);
		this.br_fld -= var2 * 542956679;
		if (this.am_fld != null && -728131834 * this.br_fld <= 0) {
			this.br_fld = this.br_fld + 496138539 * (ar_fld >> 4);
			ie.ag(this.am_fld, -1052960615);
			this.ar(this.am_fld, this.am_fld.bv());
			int var4 = 0;
			int var5 = 1529441830;

			label136:
			for (int var6 = 7; var5 != 0; var6--) {
				int var7;
				int var8;
				if (var6 < 0) {
					var7 = var6 & 3;
					var8 = -(var6 >> 2);
				} else {
					var7 = var6;
					var8 = 0;
				}

				for (int var9 = var5 >>> var7 & 286331153; 0 != var9; var9 >>>= 4) {
					if ((var9 & 1) != 0) {
						var5 &= ~(1 << var7);
						aj var10 = null;
						aj var11 = this.be_fld[var7];

						while (var11 != null) {
							ad var12 = var11.aa_fld;
							if (var12 != null && var12.aw_fld > var8) {
								var5 |= 1 << var7;
								var10 = var11;
								var11 = var11.aq_fld;
							} else {
								var11.ai_fld = true;
								int var13 = var11.bk();
								var4 += var13;
								if (null != var12) {
									var12.aw_fld += var13;
								}

								if (var4 >= this.ai_fld) {
									break label136;
								}

								aj var14 = var11.ah();
								if (var14 != null) {
									for (int var15 = var11.am_fld; var14 != null; var14 = var11.aw()) {
										this.ar(var14, var15 * var14.bv() >> 8);
									}
								}

								aj var20 = var11.aq_fld;
								var11.aq_fld = null;
								if (var10 == null) {
									this.be_fld[var7] = var20;
								} else {
									var10.aq_fld = var20;
								}

								if (var20 == null) {
									this.bs_fld[var7] = var10;
								}

								var11 = var20;
							}
						}
					}

					var7 += 4;
					var8++;
				}
			}

			for (int var16 = 0; var16 < 8; var16++) {
				aj var17 = this.be_fld[var16];
				aj[] var18 = this.be_fld;
				this.bs_fld[var16] = null;
				var18[var16] = null;

				while (var17 != null) {
					aj var19 = var17.aq_fld;
					var17.aq_fld = null;
					var17 = var19;
				}
			}
		}

		if (this.br_fld < 0) {
			this.br_fld = 0;
		}

		if (this.am_fld != null) {
			this.am_fld.as(var1, 0, var2);
		}

		this.at_fld = lz.ak();
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Laj;)V"
	)
	public final synchronized void ad(aj var1) {
		this.am_fld = var1;
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "([II)V"
	)
	final void by(int[] var1, int var2) {
		int var3 = var2;
		if (jx.al_fld) {
			var3 = var2 << 1;
		}

		ya.ar(var1, 0, var3);
		this.br_fld -= var2 * 496138539;
		if (this.am_fld != null && this.br_fld <= 0) {
			this.br_fld = this.br_fld + 496138539 * (ar_fld >> 4);
			ie.ag(this.am_fld, -1052960615);
			this.ar(this.am_fld, this.am_fld.bv());
			int var4 = 0;
			int var5 = 255;

			label141:
			for (int var6 = 7; var5 != 0; var6--) {
				int var7;
				int var8;
				if (var6 < 0) {
					var7 = var6 & 3;
					var8 = -(var6 >> 2);
				} else {
					var7 = var6;
					var8 = 0;
				}

				for (int var9 = var5 >>> var7 & 286331153; 0 != var9; var9 >>>= 4) {
					if ((var9 & 1) != 0) {
						var5 &= ~(1 << var7);
						aj var10 = null;
						aj var11 = this.be_fld[var7];

						while (var11 != null) {
							ad var12 = var11.aa_fld;
							if (var12 != null && var12.aw_fld > var8) {
								var5 |= 1 << var7;
								var10 = var11;
								var11 = var11.aq_fld;
							} else {
								var11.ai_fld = true;
								int var13 = var11.bk();
								var4 += var13;
								if (null != var12) {
									var12.aw_fld += var13;
								}

								if (var4 >= this.ai_fld) {
									break label141;
								}

								aj var14 = var11.ah();
								if (var14 != null) {
									for (int var15 = var11.am_fld; var14 != null; var14 = var11.aw()) {
										this.ar(var14, var15 * var14.bv() >> 8);
									}
								}

								aj var20 = var11.aq_fld;
								var11.aq_fld = null;
								if (var10 == null) {
									this.be_fld[var7] = var20;
								} else {
									var10.aq_fld = var20;
								}

								if (var20 == null) {
									this.bs_fld[var7] = var10;
								}

								var11 = var20;
							}
						}
					}

					var7 += 4;
					var8++;
				}
			}

			for (int var16 = 0; var16 < 8; var16++) {
				aj var17 = this.be_fld[var16];
				aj[] var18 = this.be_fld;
				this.bs_fld[var16] = null;
				var18[var16] = null;

				while (var17 != null) {
					aj var19 = var17.aq_fld;
					var17.aq_fld = null;
					var17 = var19;
				}
			}
		}

		if (this.br_fld < 0) {
			this.br_fld = 0;
		}

		if (this.am_fld != null) {
			this.am_fld.as(var1, 0, var2);
		}

		this.at_fld = lz.ak();
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(Laj;I)V"
	)
	final void bl(aj var1, int var2) {
		int var3 = var2 >> 5;
		aj var4 = this.bs_fld[var3];
		if (null == var4) {
			this.be_fld[var3] = var1;
		} else {
			var4.aq_fld = var1;
		}

		this.bs_fld[var3] = var1;
		var1.am_fld = var2;
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(Laj;I)V"
	)
	final void bx(aj var1, int var2) {
		int var3 = var2 >> 5;
		aj var4 = this.bs_fld[var3];
		if (null == var4) {
			this.be_fld[var3] = var1;
		} else {
			var4.aq_fld = var1;
		}

		this.bs_fld[var3] = var1;
		var1.am_fld = var2;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void bo() {
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Laj;)V"
	)
	public final synchronized void ao(aj var1) {
		this.am_fld = var1;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void bt(int var1) throws Exception, LineUnavailableException {
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public final synchronized void be() {
		if (null != this.aq_fld) {
			long var1 = lz.ak();

			try {
				if (0L != this.bd_fld) {
					if (var1 < this.bd_fld) {
						return;
					}

					this.al(1552149086 * this.ao_fld, 90705656);
					this.bd_fld = 0L;
					this.bz_fld = true;
				}

				int var3 = this.au((byte)110);
				if (this.bm_fld - var3 > this.ac_fld) {
					this.ac_fld = -1173889387 * (this.bm_fld - var3);
				}

				int var4 = this.ab_fld + this.ap_fld;
				if (var4 + 512 > -250621397) {
					var4 = 2139845510;
				}

				if (512 + var4 > this.ao_fld) {
					this.ao_fld += -30788349;
					if (this.ao_fld > -1382925954) {
						this.ao_fld = 601784320;
					}

					this.an(-1130172287);
					this.al(this.ao_fld * -1802149954, -822466497);
					var3 = 0;
					this.bz_fld = true;
					if (var4 + 512 > this.ao_fld) {
						var4 = this.ao_fld - 512;
						this.ap_fld = -2069950515 * (var4 - this.ab_fld);
					}
				}

				while (var3 < var4) {
					this.as(this.aq_fld, -1932050249);
					this.ax();
					var3 += 512;
				}

				if (var1 > this.ad_fld) {
					if (!this.bz_fld) {
						if (2134803831 * this.ac_fld == 0 && 0 == this.aj_fld) {
							this.an(92843844);
							this.bd_fld = 2000L + var1;
							return;
						}

						this.ap_fld = Math.min(this.aj_fld * 1924069718, this.ac_fld * -1868012414);
						this.aj_fld = this.ac_fld * 1637283590;
					} else {
						this.bz_fld = false;
					}

					this.ac_fld = 0;
					this.ad_fld = -423362398426007567L * (2000L + var1);
				}

				this.bm_fld = var3;
			} catch (Exception var6) {
				this.an(-1766710475);
				this.bd_fld = var1 + 2000L;
			}

			try {
				if (var1 > this.at_fld + 500000L) {
					var1 = this.at_fld;
				}

				while (var1 > this.at_fld + 5000L) {
					this.ay(512);
					this.at_fld = this.at_fld + -5056571057394204677L * (-252685003 / ar_fld);
				}
			} catch (Exception var5) {
				this.at_fld = var1;
			}
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public final synchronized void ab() {
		this.bz_fld = true;

		try {
			this.aa((byte)7);
		} catch (Exception var2) {
			this.an(114832554);
			this.bd_fld = lz.ak() + 2000L;
		}
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	protected void ba() {
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	protected int bn() {
		return this.ao_fld;
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void bi(int var1) throws Exception, LineUnavailableException {
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void af(int var1) {
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	final void ay(int var1) {
		this.br_fld -= var1 * 496138539;
		if (this.br_fld < 0) {
			this.br_fld = 0;
		}

		if (null != this.am_fld) {
			this.am_fld.af(var1);
		}
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void bu(int var1) throws Exception, LineUnavailableException {
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	protected void bg() {
	}

	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void do_() {
		if (this.aq_fld == null) {
			ar var1 = og.ci_fld.dc();
			synchronized (var1) {
				var1.fe().clear();
			}
		}
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	protected void bb() {
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	protected void cd() {
	}

	public ao() {
		this.ac_fld = 0;
		this.aj_fld = 0;
		this.bm_fld = 0;
		this.ad_fld = 0L;
		this.bz_fld = true;
		this.br_fld = 0;
		this.be_fld = new aj[8];
		this.bs_fld = new aj[8];
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	protected void cq() {
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lcy;I)V"
	)
	static void aq(cy var0) {
		if (var0 != client.hd_fld) {
			client.hd_fld = var0;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(CI)C"
	)
	static char az(char var0) {
		if (var0 == 198) {
			return 'E';
		} else if (230 == var0) {
			return 'e';
		} else if (var0 == 223) {
			return 's';
		} else if (338 == var0) {
			return 'E';
		} else {
			return (char)(var0 == 339 ? 'e' : '\u0000');
		}
	}
}
