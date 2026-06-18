import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("ot")
public class ot extends vc {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ag_fld;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1759850981
	)
	int aj_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int az_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int av_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ak_fld;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	static iw au_fld = new iw(64);
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	static iw ax_fld = new iw(30);
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -922060493
	)
	int an_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ah_fld;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 158714689
	)
	public int ai_fld = 309017407;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "[S"
	)
	short[] ad_fld;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "[S"
	)
	short[] am_fld;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1381646495
	)
	int aa_fld;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "[S"
	)
	short[] ao_fld;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1942772739
	)
	int ab_fld = 1458088576;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1024419789
	)
	int ap_fld = 1175551360;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -998211891
	)
	int at_fld = 0;
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean bm_fld;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1784656537
	)
	int ac_fld = 0;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "[S"
	)
	short[] aq_fld;

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Lfn;"
	)
	public final fn am(int var1) {
		try {
			fn var2 = nc(this, 1116249367);
			if (null == var2) {
				return null;
			} else {
				fn var3;
				if (-1 != this.ai_fld && var1 != -1) {
					var3 = hm.ak(this.ai_fld).al(var2, var1, (short)187);
				} else {
					var3 = var2.as(true);
				}

				if (this.ab_fld != 128 || this.ap_fld != 128) {
					var3.bt(this.ab_fld, this.ap_fld, this.ab_fld);
				}

				if (0 != this.at_fld) {
					if (90 == this.at_fld) {
						jv.ne(var3);
					}

					if (180 == this.at_fld) {
						jv.ne(var3);
						jv.ne(var3);
					}

					if (this.at_fld == 270) {
						jv.ne(var3);
						jv.ne(var3);
						jv.ne(var3);
					}
				}

				return var3;
			}
		} catch (Throwable var5) {
			throw new RuntimeException(var5);
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(J)I"
	)
	public static int az(long var0) {
		var0 = (var0 >>> 1 & 6148914691236517205L) + (var0 & 6148914691236517205L);
		var0 = (var0 & 3689348814741910323L) + (var0 >>> 2 & 3689348814741910323L);
		var0 = (var0 >>> 4) + var0 & 1085102592571150095L;
		var0 += var0 >>> 8;
		var0 += var0 >>> 16;
		var0 += var0 >>> 32;
		return (int)(var0 & 255L);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxi;II)V"
	)
	void av(xi var1, int var2) {
		switch (var2) {
			case 2:
				this.ai_fld = var1.cm();
				break;
			case 3:
				this.aa_fld = var1.dl(wa.ak_fld.az_fld);
				break;
			case 4:
				this.ab_fld = var1.cm();
				break;
			case 5:
				this.ap_fld = var1.cm();
				break;
			case 6:
				this.at_fld = var1.cm();
				break;
			case 7:
				this.ac_fld = var1.cg();
				break;
			case 8:
				this.aj_fld = var1.cg();
			case 9:
			case 11:
			case 12:
			case 13:
			case 14:
			case 15:
			case 16:
			case 17:
			case 18:
			case 19:
			case 20:
			case 21:
			case 22:
			case 23:
			case 24:
			case 25:
			case 26:
			case 27:
			case 28:
			case 29:
			case 30:
			case 31:
			case 32:
			case 33:
			case 34:
			case 35:
			case 36:
			case 37:
			case 38:
			case 39:
			default:
				break;
			case 10:
				this.bm_fld = false;
				break;
			case 40:
				int var6 = var1.cg();
				this.aq_fld = new short[var6];
				this.am_fld = new short[var6];

				for (int var7 = 0; var7 < var6; var7++) {
					this.aq_fld[var7] = (short)var1.cm();
					this.am_fld[var7] = (short)var1.cm();
				}
				break;
			case 41:
				int var4 = var1.cg();
				this.ad_fld = new short[var4];
				this.ao_fld = new short[var4];

				for (int var5 = 0; var5 < var4; var5++) {
					this.ad_fld[var5] = (short)var1.cm();
					this.ao_fld[var5] = (short)var1.cm();
				}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)Lfn;"
	)
	public final fn ae(int var1) {
		try {
			fn var3 = nc(this, -146781010);
			if (null == var3) {
				return null;
			} else {
				fn var4;
				if (-1 != this.ai_fld && var1 != -1) {
					var4 = hm.ak(this.ai_fld).al(var3, var1, (short)187);
				} else {
					var4 = var3.as(true);
				}

				if (this.ab_fld != 128 || this.ap_fld != 128) {
					var4.bt(this.ab_fld, this.ap_fld, this.ab_fld);
				}

				if (0 != this.at_fld) {
					if (90 == this.at_fld) {
						jv.ne(var4);
					}

					if (180 == this.at_fld) {
						jv.ne(var4);
						jv.ne(var4);
					}

					if (this.at_fld == 270) {
						jv.ne(var4);
						jv.ne(var4);
						jv.ne(var4);
					}
				}

				return var4;
			}
		} catch (Throwable var5) {
			throw new RuntimeException(var5);
		}
	}

	@ObfuscatedName("mw")
	@ObfuscatedSignature(
		descriptor = "(Lot;Lxi;I)V"
	)
	public static void mw(ot var0, xi var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		switch (var2) {
			case 2:
				var0.ai_fld = var1.cm();
				break;
			case 3:
				var0.aa_fld = var1.dl(wa.ak_fld.az_fld);
				break;
			case 4:
				var0.ab_fld = var1.cm();
				break;
			case 5:
				var0.ap_fld = var1.cm();
				break;
			case 6:
				var0.at_fld = var1.cm();
				break;
			case 7:
				var0.ac_fld = var1.cg();
				break;
			case 8:
				var0.aj_fld = var1.cg();
			case 9:
			case 11:
			case 12:
			case 13:
			case 14:
			case 15:
			case 16:
			case 17:
			case 18:
			case 19:
			case 20:
			case 21:
			case 22:
			case 23:
			case 24:
			case 25:
			case 26:
			case 27:
			case 28:
			case 29:
			case 30:
			case 31:
			case 32:
			case 33:
			case 34:
			case 35:
			case 36:
			case 37:
			case 38:
			case 39:
			default:
				break;
			case 10:
				var0.bm_fld = false;
				break;
			case 40:
				int var5 = var1.cg();
				var0.aq_fld = new short[var5];
				var0.am_fld = new short[var5];

				for (int var6 = 0; var6 < var5; var6++) {
					var0.aq_fld[var6] = (short)var1.cm();
					var0.am_fld[var6] = (short)var1.cm();
				}
				break;
			case 41:
				int var3 = var1.cg();
				var0.ad_fld = new short[var3];
				var0.ao_fld = new short[var3];

				for (int var4 = 0; var4 < var3; var4++) {
					var0.ad_fld[var4] = (short)var1.cm();
					var0.ao_fld[var4] = (short)var1.cm();
				}
		}
	}

	ot() {
		this.aj_fld = 0;
		this.bm_fld = true;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public static void al() {
		au_fld.av();
		ax_fld.av();
	}

	@ObfuscatedName("ho")
	@ObfuscatedSignature(
		descriptor = "(Lot;I)Lfn;"
	)
	public static fn ho(ot var0, int var1) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			fn var2 = nc(var0, 1652351489);
			if (null == var2) {
				return null;
			} else {
				fn var3;
				if (-1 != var0.ai_fld && var1 != -1) {
					var3 = hm.ak(var0.ai_fld).al(var2, var1, (short)187);
				} else {
					var3 = var2.as(true);
				}

				if (var0.ab_fld != 128 || var0.ap_fld != 128) {
					var3.bt(var0.ab_fld, var0.ap_fld, var0.ab_fld);
				}

				if (0 != var0.at_fld) {
					if (90 == var0.at_fld) {
						jv.ne(var3);
					}

					if (180 == var0.at_fld) {
						jv.ne(var3);
						jv.ne(var3);
					}

					if (var0.at_fld == 270) {
						jv.ne(var3);
						jv.ne(var3);
						jv.ne(var3);
					}
				}

				return var3;
			}
		} catch (Throwable var5) {
			throw new RuntimeException(var5);
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	void aa(xi var1, int var2) {
		switch (var2) {
			case 2:
				this.ai_fld = var1.cm();
				break;
			case 3:
				this.aa_fld = var1.dl(wa.ak_fld.az_fld);
				break;
			case 4:
				this.ab_fld = var1.cm();
				break;
			case 5:
				this.ap_fld = var1.cm();
				break;
			case 6:
				this.at_fld = var1.cm() * 528159463;
				break;
			case 7:
				this.ac_fld = var1.cg();
				break;
			case 8:
				this.aj_fld = var1.cg();
			case 9:
			case 11:
			case 12:
			case 13:
			case 14:
			case 15:
			case 16:
			case 17:
			case 18:
			case 19:
			case 20:
			case 21:
			case 22:
			case 23:
			case 24:
			case 25:
			case 26:
			case 27:
			case 28:
			case 29:
			case 30:
			case 31:
			case 32:
			case 33:
			case 34:
			case 35:
			case 36:
			case 37:
			case 38:
			case 39:
			default:
				break;
			case 10:
				this.bm_fld = false;
				break;
			case 40:
				int var5 = var1.cg();
				this.aq_fld = new short[var5];
				this.am_fld = new short[var5];

				for (int var6 = 0; var6 < var5; var6++) {
					this.aq_fld[var6] = (short)var1.cm();
					this.am_fld[var6] = (short)var1.cm();
				}
				break;
			case 41:
				int var3 = var1.cg();
				this.ad_fld = new short[var3];
				this.ao_fld = new short[var3];

				for (int var4 = 0; var4 < var3; var4++) {
					this.ad_fld[var4] = (short)var1.cm();
					this.ao_fld[var4] = (short)var1.cm();
				}
		}
	}

	@ObfuscatedName("ef")
	@ObfuscatedSignature(
		descriptor = "(I)Lcv;"
	)
	static cv ef() {
		dx var1 = client.da_fld.ae(client.es_fld, (byte)-31);
		return null != var1 ? dx.pe(var1, client.dj_fld) : null;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Lot;"
	)
	public static ot af(int var0) throws EOFException {
		try {
			ot var1 = (ot)au_fld.ak(var0);
			if (var1 != null) {
				return var1;
			} else {
				byte[] var2 = hc.af_fld.bb(13, var0, 584982574);
				var1 = new ot();
				var1.an_fld = var0;
				if (var2 != null) {
					var1.az(new xi(var2));
				}

				au_fld.az(var1, var0);
				return var1;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean aw(int var1) {
		return this.bm_fld;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public static void au() {
		au_fld.av();
		ax_fld.av();
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	void ax(xi var1) {
		while (true) {
			int var2 = var1.cg();
			if (0 == var2) {
				return;
			}

			this.av(var1, var2);
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Lot;"
	)
	public static ot as(int var0) throws EOFException {
		try {
			ot var1 = (ot)au_fld.ak(var0);
			if (var1 != null) {
				return var1;
			} else {
				byte[] var2 = hc.af_fld.bb(13, var0, 584982574);
				var1 = new ot();
				var1.an_fld = var0;
				if (var2 != null) {
					var1.az(new xi(var2));
				}

				au_fld.az(var1, var0);
				return var1;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "()Lfn;"
	)
	public final fn ao() {
		try {
			fn var1 = (fn)ax_fld.ak(this.an_fld);
			if (null == var1) {
				eg var2 = eg.ak(iq.al_fld, this.aa_fld, 0);
				if (null == var2) {
					return null;
				}

				if (this.aq_fld != null) {
					for (int var3 = 0; var3 < this.aq_fld.length; var3++) {
						var2.be(this.aq_fld[var3], this.am_fld[var3]);
					}
				}

				if (null != this.ad_fld) {
					for (int var6 = 0; var6 < this.ad_fld.length; var6++) {
						var2.bs(this.ad_fld[var6], this.ao_fld[var6]);
					}
				}

				var1 = eg.et(var2, 64 + this.ac_fld, 850 + this.aj_fld, -30, -50, -30);
				ax_fld.az(var1, this.an_fld);
			}

			return var1;
		} catch (Throwable var5) {
			throw new RuntimeException(var5);
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Lot;"
	)
	public static ot ar(int var0) throws EOFException {
		try {
			ot var1 = (ot)au_fld.ak(var0);
			if (var1 != null) {
				return var1;
			} else {
				byte[] var2 = hc.af_fld.bb(13, var0, 584982574);
				var1 = new ot();
				var1.an_fld = var0 * 955748636;
				if (var2 != null) {
					var1.az(new xi(var2));
				}

				au_fld.az(var1, var0);
				return var1;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "()Lfn;"
	)
	public final fn ad() {
		try {
			fn var1 = (fn)ax_fld.ak(this.an_fld);
			if (null == var1) {
				eg var2 = eg.ak(iq.al_fld, 726766093 * this.aa_fld, 0);
				if (null == var2) {
					return null;
				}

				if (this.aq_fld != null) {
					for (int var3 = 0; var3 < this.aq_fld.length; var3++) {
						var2.be(this.aq_fld[var3], this.am_fld[var3]);
					}
				}

				if (null != this.ad_fld) {
					for (int var6 = 0; var6 < this.ad_fld.length; var6++) {
						var2.bs(this.ad_fld[var6], this.ao_fld[var6]);
					}
				}

				var1 = eg.et(var2, 1487915747 + this.ac_fld, 850 + this.aj_fld, 951138060, -50, 597898807);
				ax_fld.az(var1, this.an_fld);
			}

			return var1;
		} catch (Throwable var5) {
			throw new RuntimeException(var5);
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean ab() {
		return this.bm_fld;
	}

	@ObfuscatedName("xv")
	@ObfuscatedSignature(
		descriptor = "(Lot;Lxi;I)V"
	)
	public static void xv(ot var0, xi var1, int var2) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			switch (var2) {
				case 2:
					var0.ai_fld = var1.cm();
					break;
				case 3:
					var0.aa_fld = var1.dl(wa.ak_fld.az_fld);
					break;
				case 4:
					var0.ab_fld = var1.cm();
					break;
				case 5:
					var0.ap_fld = var1.cm();
					break;
				case 6:
					var0.at_fld = var1.cm();
					break;
				case 7:
					var0.ac_fld = var1.cg();
					break;
				case 8:
					var0.aj_fld = var1.cg();
				case 9:
				case 11:
				case 12:
				case 13:
				case 14:
				case 15:
				case 16:
				case 17:
				case 18:
				case 19:
				case 20:
				case 21:
				case 22:
				case 23:
				case 24:
				case 25:
				case 26:
				case 27:
				case 28:
				case 29:
				case 30:
				case 31:
				case 32:
				case 33:
				case 34:
				case 35:
				case 36:
				case 37:
				case 38:
				case 39:
				default:
					break;
				case 10:
					var0.bm_fld = false;
					break;
				case 40:
					int var7 = var1.cg();
					var0.aq_fld = new short[var7];
					var0.am_fld = new short[var7];

					for (int var8 = 0; var8 < var7; var8++) {
						var0.aq_fld[var8] = (short)var1.cm();
						var0.am_fld[var8] = (short)var1.cm();
					}
					break;
				case 41:
					int var3 = var1.cg();
					var0.ad_fld = new short[var3];
					var0.ao_fld = new short[var3];

					for (int var4 = 0; var4 < var3; var4++) {
						var0.ad_fld[var4] = (short)var1.cm();
						var0.ao_fld[var4] = (short)var1.cm();
					}
			}
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lxi;B)V"
	)
	void az(xi var1) {
		while (true) {
			int var3 = var1.cg();
			if (0 == var3) {
				return;
			}

			this.av(var1, var3);
		}
	}

	@ObfuscatedName("hw")
	@ObfuscatedSignature(
		descriptor = "(Lcj;B)V"
	)
	static void hw(cj var0) {
		if (var0 != jl.ln_fld) {
			jl.ln_fld = var0;
		}
	}

	@ObfuscatedName("ft")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	static void ft() {
		int var1 = client.nr_fld.ot_fld - 1;
		if (var1 != -1) {
			bp.na_fld = new bi();
			client.uo();
			bp.na_fld.ak_fld = client.nr_fld.az_fld[var1];
			bp.na_fld.ag_fld = client.nr_fld.av_fld[var1];
			bp.na_fld.az_fld = client.nr_fld.ae_fld[var1];
			bp.na_fld.av_fld = 1938802821 * client.nr_fld.ah_fld[var1];
			bp.na_fld.ae_fld = client.nr_fld.aw_fld[var1];
			bp.na_fld.aw_fld = client.nr_fld.as_fld[var1];
			bp.na_fld.ay_fld = client.nr_fld.ar_fld[var1];
			bp.na_fld.ah_fld = -1042596647 * client.nr_fld.ay_fld[var1];
			bp.na_fld.as_fld = client.nr_fld.al_fld[var1];
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IB)Lyl;"
	)
	public static yl ak(int var0) throws EOFException {
		try {
			yl var2 = (yl)yl.ag_fld.ak(var0);
			if (var2 != null) {
				return var2;
			} else {
				byte[] var3 = yl.ak_fld.bb(38, var0, 584982574);
				var2 = new yl();
				if (null != var3) {
					var2.ag(new xi(var3), -1818511622);
				}

				var2.ae((byte)101);
				yl.ag_fld.az(var2, var0);
				return var2;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Lot;"
	)
	public static ot ay(int var0) throws EOFException {
		try {
			ot var1 = (ot)au_fld.ak(var0);
			if (var1 != null) {
				return var1;
			} else {
				byte[] var2 = hc.af_fld.bb(13, var0, 584982574);
				var1 = new ot();
				var1.an_fld = var0;
				if (var2 != null) {
					var1.az(new xi(var2));
				}

				au_fld.az(var1, var0);
				return var1;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("nc")
	@ObfuscatedSignature(
		descriptor = "(Lot;I)Lfn;"
	)
	public static fn nc(ot var0, int var1) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			fn var2 = (fn)ax_fld.ak(var0.an_fld);
			if (null == var2) {
				eg var3 = eg.ak(iq.al_fld, var0.aa_fld, 0);
				if (null == var3) {
					return null;
				}

				if (var0.aq_fld != null) {
					for (int var4 = 0; var4 < var0.aq_fld.length; var4++) {
						var3.be(var0.aq_fld[var4], var0.am_fld[var4]);
					}
				}

				if (null != var0.ad_fld) {
					for (int var6 = 0; var6 < var0.ad_fld.length; var6++) {
						var3.bs(var0.ad_fld[var6], var0.ao_fld[var6]);
					}
				}

				var2 = eg.et(var3, 64 + var0.ac_fld, 850 + var0.aj_fld, -30, -50, -30);
				ax_fld.az(var2, var0.an_fld);
			}

			return var2;
		} catch (Throwable var5) {
			throw new RuntimeException(var5);
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Lfn;"
	)
	public final fn ah(int var1) {
		try {
			fn var2 = (fn)au_fld.ay(this.ap_fld * -922060493);
			if (null == var2) {
				eg var3 = eg.bt(iq.al_fld, -1381646495 * this.ab_fld, 0);
				if (null == var3) {
					return null;
				}

				if (this.am_fld != null) {
					for (int var4 = 0; var4 < this.aq_fld.length; var4++) {
						var3.dq(this.am_fld[var4], this.ad_fld[var4]);
					}
				}

				if (null != this.ad_fld) {
					for (int var6 = 0; var6 < this.aq_fld.length; var6++) {
						var3.dm(this.aq_fld[var6], this.ao_fld[var6]);
					}
				}

				var2 = eg.et(var3, 64 + this.ab_fld, 850 + this.aj_fld, -30, -50, -30);
				au_fld.af(var2, -922060493 * this.at_fld);
			}

			return var2;
		} catch (Throwable var5) {
			throw new RuntimeException(var5);
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	void ai(xi var1, int var2) {
		switch (var2) {
			case 2:
				this.ai_fld = var1.ev();
				break;
			case 3:
				this.ac_fld = var1.dl(wa.ag_fld.az_fld) * 1735992481;
				break;
			case 4:
				this.ap_fld = var1.de() * -659697323;
				break;
			case 5:
				this.ap_fld = var1.ef();
				break;
			case 6:
				this.an_fld = var1.kv(635098332) * -1306026491;
				break;
			case 7:
				this.ap_fld = var1.dv() * -1962181033;
				break;
			case 8:
				this.ac_fld = var1.dz() * 2145606675;
			case 9:
			case 11:
			case 12:
			case 13:
			case 14:
			case 15:
			case 16:
			case 17:
			case 18:
			case 19:
			case 20:
			case 21:
			case 22:
			case 23:
			case 24:
			case 25:
			case 26:
			case 27:
			case 28:
			case 29:
			case 30:
			case 31:
			case 32:
			case 33:
			case 34:
			case 35:
			case 36:
			case 37:
			case 38:
			case 39:
			default:
				break;
			case 10:
				this.bm_fld = false;
				break;
			case 40:
				int var5 = var1.em();
				this.ao_fld = new short[var5];
				this.aq_fld = new short[var5];

				for (int var6 = 0; var6 < var5; var6++) {
					this.aq_fld[var6] = (short)var1.de();
					this.ad_fld[var6] = (short)var1.df();
				}
				break;
			case 41:
				int var3 = var1.dm();
				this.am_fld = new short[var3];
				this.am_fld = new short[var3];

				for (int var4 = 0; var4 < var3; var4++) {
					this.ao_fld[var4] = (short)var1.dr();
					this.ad_fld[var4] = (short)var1.dq();
				}
		}
	}
}
