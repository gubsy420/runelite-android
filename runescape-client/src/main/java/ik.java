import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;
import net.runelite.api.clan.ClanMember;
import net.runelite.api.clan.ClanRank;
import net.runelite.api.clan.ClanSettings;
import net.runelite.api.clan.ClanTitle;

@ObfuscatedName("ik")
@Implements({"ClanSettings"})
public class ik implements ClanSettings {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "[J"
	)
	long[] ac_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ah_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "B"
	)
	static byte av_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "B"
	)
	public static byte ae_fld;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public boolean af_fld;
	@ObfuscatedGetter(
		intValue = 335420205
	)
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ay_fld = 0;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	public String as_fld = null;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] am_fld;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "[Ljava/lang/String;"
	)
	public String[] aj_fld;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "B"
	)
	public byte al_fld;
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "[Ljava/lang/String;"
	)
	public String[] bm_fld;
	@ObfuscatedGetter(
		intValue = 94361709
	)
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int aa_fld;
	@ObfuscatedGetter(
		longValue = 3509774569710105249L
	)
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	long aw_fld;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "B"
	)
	public byte au_fld;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "[J"
	)
	long[] ai_fld;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "[B"
	)
	public byte[] aq_fld;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] be_fld;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	public int[] ad_fld;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "[Z"
	)
	public boolean[] ao_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "B"
	)
	static byte ag_fld;
	@ObfuscatedGetter(
		intValue = -1551121589
	)
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ap_fld;
	@ObfuscatedGetter(
		intValue = -625181569
	)
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int at_fld;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean bz_fld;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "B"
	)
	public byte an_fld;
	@ObfuscatedGetter(
		intValue = 832825071
	)
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ar_fld = 0;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "Lxv;"
	)
	xv bd_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "B"
	)
	static byte az_fld;
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean br_fld;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "B"
	)
	public byte ax_fld;
	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "Lyc;"
	)
	static yc cm_fld;
	@ObfuscatedGetter(
		intValue = -1998716237
	)
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ab_fld = -1726119035;
	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int cs_fld;
	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bb_fld;

	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "(III)I"
	)
	public int df(int var1, int var2, int var3) {
		Integer var4 = this.mv(var1);
		int var5 = var4 == null ? -1 : var4;
		int var6 = 31 - var3;
		return var5 << var6 >>> var2 + var6;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lxi;B)V"
	)
	void ad(xi var1, byte var2) {
		int var3 = var1.cg();
		if (var3 >= 1 && var3 <= 6) {
			int var4 = var1.cg();
			if ((var4 & 1) != 0) {
				if (var2 <= 0) {
					return;
				}

				this.bz_fld = true;
			}

			if ((var4 & 2) != 0) {
				this.br_fld = true;
			}

			if (!this.bz_fld) {
				this.ai_fld = null;
				this.ac_fld = null;
			}

			if (!this.br_fld) {
				this.aj_fld = null;
				this.bm_fld = null;
			}

			this.ay_fld = var1.co();
			this.ar_fld = var1.co();
			if (var3 <= 3 && this.ar_fld != 0) {
				this.ar_fld += 16912800;
			}

			this.aa_fld = xi.tx(var1, 1102232014);
			this.at_fld = var1.cg();
			this.as_fld = xi.kc(var1, -220200472);
			if (var3 >= 4) {
				var1.co();
			}

			boolean var10001;
			if (var1.cg() == 1) {
				if (var2 <= 0) {
					return;
				}

				var10001 = true;
			} else {
				var10001 = false;
			}

			this.af_fld = var10001;
			this.al_fld = xi.rp(var1, 690016524);
			this.au_fld = xi.rp(var1, 1342457439);
			this.ax_fld = xi.rp(var1, 134170123);
			this.an_fld = xi.rp(var1, 583374001);
			if (this.aa_fld > 0) {
				if (this.bz_fld && (null == this.ai_fld || this.ai_fld.length < this.aa_fld)) {
					this.ai_fld = new long[this.aa_fld];
				}

				if (this.br_fld && (null == this.aj_fld || this.aj_fld.length < this.aa_fld)) {
					this.aj_fld = new String[this.aa_fld];
				}

				if (this.aq_fld == null || this.aq_fld.length < this.aa_fld) {
					this.aq_fld = new byte[this.aa_fld];
				}

				label287: {
					if (this.be_fld != null) {
						if (var2 <= 0) {
							return;
						}

						if (this.be_fld.length >= this.aa_fld) {
							break label287;
						}
					}

					this.be_fld = new int[this.aa_fld];
				}

				label281: {
					if (this.ad_fld != null) {
						if (this.ad_fld.length >= this.aa_fld) {
							break label281;
						}

						if (var2 <= 0) {
							return;
						}
					}

					this.ad_fld = new int[this.aa_fld];
				}

				label275: {
					if (this.ao_fld != null) {
						if (var2 <= 0) {
							return;
						}

						if (this.ao_fld.length >= this.aa_fld) {
							break label275;
						}
					}

					this.ao_fld = new boolean[this.aa_fld];
				}

				for (int var5 = 0; var5 < this.aa_fld; var5++) {
					if (var2 <= 0) {
						return;
					}

					if (this.bz_fld) {
						this.ai_fld[var5] = xi.ob(var1, 983069286);
					}

					if (this.br_fld) {
						this.aj_fld[var5] = var1.ch();
					}

					this.aq_fld[var5] = xi.rp(var1, 914902623);
					if (var3 >= 2) {
						this.be_fld[var5] = var1.co();
					}

					if (var3 >= 5) {
						this.ad_fld[var5] = xi.tx(var1, 401110254);
					} else {
						this.ad_fld[var5] = 0;
					}

					if (var3 >= 6) {
						this.ao_fld[var5] = var1.cg() == 1;
					} else {
						this.ao_fld[var5] = false;
					}
				}

				hi(this, (byte)-85);
			}

			if (this.at_fld > 0) {
				label260:
				if (this.bz_fld) {
					if (var2 <= 0) {
						return;
					}

					if (null != this.ac_fld) {
						if (var2 <= 0) {
							return;
						}

						if (this.ac_fld.length >= this.at_fld) {
							break label260;
						}
					}

					this.ac_fld = new long[this.at_fld];
				}

				if (this.br_fld) {
					if (var2 <= 0) {
						return;
					}

					if (this.bm_fld == null || this.bm_fld.length < this.at_fld) {
						this.bm_fld = new String[this.at_fld];
					}
				}

				for (int var11 = 0; var11 < this.at_fld; var11++) {
					if (this.bz_fld) {
						this.ac_fld[var11] = xi.ob(var1, 689918449);
					}

					if (this.br_fld) {
						this.bm_fld[var11] = var1.ch();
					}
				}
			}

			if (var3 >= 3) {
				int var12 = xi.tx(var1, 679360936);
				if (var12 > 0) {
					this.bd_fld = new xv(var12 < 16 ? wp.ay(var12) : 16);

					while (var12-- > 0) {
						int var6 = var1.co();
						int var7 = var6 & 1073741823;
						int var8 = var6 >>> 30;
						if (var8 == 0) {
							int var9 = var1.co();
							this.bd_fld.ag(new vl(var9), var7);
						} else if (var8 == 1) {
							long var13 = xi.ob(var1, 1226268451);
							this.bd_fld.ag(new vk(var13), var7);
						} else if (var8 == 2) {
							String var14 = xi.kc(var1, -717330182);
							this.bd_fld.ag(new uj(var14), var7);
						}
					}
				}
			}
		} else {
			throw new RuntimeException("" + var3);
		}
	}

	@ObfuscatedName("re")
	@ObfuscatedSignature(
		descriptor = "(Lik;I)[I"
	)
	public static int[] re(ik var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			if (null == var0.am_fld) {
				String[] var2 = new String[var0.aa_fld];
				var0.am_fld = new int[var0.aa_fld];

				for (int var3 = 0; var3 < var0.aa_fld; var0.am_fld[var3] = var3++) {
					var2[var3] = var0.aj_fld[var3];
					if (null != var2[var3]) {
						var2[var3] = var2[var3].toLowerCase();
					}
				}

				int[] var4 = var0.am_fld;
				mf.az(var2, var4, 0, var2.length - 1);
			}

			return var0.am_fld;
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Z"
	)
	boolean am(int var1, String var2, int var3) {
		if (null == var2) {
			var2 = "";
		} else if (var2.length() > 80) {
			var2 = var2.substring(0, 80);
		}

		if (null != this.bd_fld) {
			vw var4 = this.bd_fld.ak(var1);
			if (null != var4) {
				if (var4 instanceof uj) {
					uj var5 = (uj)var4;
					if (var5.ak_fld instanceof String) {
						if (var2.equals(var5.ak_fld)) {
							return false;
						}

						var5.gy_void();
						this.bd_fld.ag(new uj(var2), var5.hc_fld);
						return true;
					}
				}

				var4.gy_void();
			}
		} else {
			this.bd_fld = new xv(4);
		}

		this.bd_fld.ag(new uj(var2), var1);
		return true;
	}

	@ObfuscatedName("wc")
	@ObfuscatedSignature(
		descriptor = "(Lik;Lxi;)V"
	)
	public static void wc(ik var0, xi var1) {
		if (var0 == null) {
			var0.getClass();
		}

		int var2 = var1.cg();
		if (var2 >= 1 && var2 <= 6) {
			int var3 = var1.cg();
			if ((var3 & 1) != 0) {
				var0.bz_fld = true;
			}

			if ((var3 & 2) != 0) {
				var0.br_fld = true;
			}

			if (!var0.bz_fld) {
				var0.ai_fld = null;
				var0.ac_fld = null;
			}

			if (!var0.br_fld) {
				var0.aj_fld = null;
				var0.bm_fld = null;
			}

			var0.ay_fld = var1.co();
			var0.ar_fld = var1.co();
			if (var2 <= 3 && var0.ar_fld != 0) {
				var0.ar_fld += 16912800;
			}

			var0.aa_fld = xi.tx(var1, 1846219693);
			var0.at_fld = var1.cg();
			var0.as_fld = xi.kc(var1, -1141317205);
			if (var2 >= 4) {
				var1.co();
			}

			var0.af_fld = var1.cg() == 1;
			var0.al_fld = xi.rp(var1, 1221317491);
			var0.au_fld = xi.rp(var1, 1349736933);
			var0.ax_fld = xi.rp(var1, -63946657);
			var0.an_fld = xi.rp(var1, 60831835);
			if (var0.aa_fld > 0) {
				if (var0.bz_fld && (null == var0.ai_fld || var0.ai_fld.length < var0.aa_fld)) {
					var0.ai_fld = new long[var0.aa_fld];
				}

				if (var0.br_fld && (null == var0.aj_fld || var0.aj_fld.length < var0.aa_fld)) {
					var0.aj_fld = new String[var0.aa_fld];
				}

				if (var0.aq_fld == null || var0.aq_fld.length < var0.aa_fld) {
					var0.aq_fld = new byte[var0.aa_fld];
				}

				if (var0.be_fld == null || var0.be_fld.length < var0.aa_fld) {
					var0.be_fld = new int[var0.aa_fld];
				}

				if (var0.ad_fld == null || var0.ad_fld.length < var0.aa_fld) {
					var0.ad_fld = new int[var0.aa_fld];
				}

				if (var0.ao_fld == null || var0.ao_fld.length < var0.aa_fld) {
					var0.ao_fld = new boolean[var0.aa_fld];
				}

				for (int var4 = 0; var4 < var0.aa_fld; var4++) {
					if (var0.bz_fld) {
						var0.ai_fld[var4] = xi.ob(var1, -264963185);
					}

					if (var0.br_fld) {
						var0.aj_fld[var4] = var1.ch();
					}

					var0.aq_fld[var4] = xi.rp(var1, -76333391);
					if (var2 >= 2) {
						var0.be_fld[var4] = var1.co();
					}

					if (var2 >= 5) {
						var0.ad_fld[var4] = xi.tx(var1, 1187652665);
					} else {
						var0.ad_fld[var4] = 0;
					}

					if (var2 >= 6) {
						var0.ao_fld[var4] = var1.cg() == 1;
					} else {
						var0.ao_fld[var4] = false;
					}
				}

				hi(var0, (byte)-84);
			}

			if (var0.at_fld > 0) {
				if (var0.bz_fld && (null == var0.ac_fld || var0.ac_fld.length < var0.at_fld)) {
					var0.ac_fld = new long[var0.at_fld];
				}

				if (var0.br_fld && (var0.bm_fld == null || var0.bm_fld.length < var0.at_fld)) {
					var0.bm_fld = new String[var0.at_fld];
				}

				for (int var10 = 0; var10 < var0.at_fld; var10++) {
					if (var0.bz_fld) {
						var0.ac_fld[var10] = xi.ob(var1, -308573032);
					}

					if (var0.br_fld) {
						var0.bm_fld[var10] = var1.ch();
					}
				}
			}

			if (var2 >= 3) {
				int var11 = xi.tx(var1, 1390126950);
				if (var11 > 0) {
					var0.bd_fld = new xv(var11 < 16 ? wp.ay(var11) : 16);

					while (var11-- > 0) {
						int var5 = var1.co();
						int var6 = var5 & 1073741823;
						int var7 = var5 >>> 30;
						if (var7 == 0) {
							int var8 = var1.co();
							var0.bd_fld.ag(new vl(var8), var6);
						} else if (var7 == 1) {
							long var12 = xi.ob(var1, -1902340072);
							var0.bd_fld.ag(new vk(var12), var6);
						} else if (var7 == 2) {
							String var13 = xi.kc(var1, -2077668849);
							var0.bd_fld.ag(new uj(var13), var6);
						}
					}
				}
			}
		} else {
			throw new RuntimeException("" + var2);
		}
	}

	@ObfuscatedName("getMembers")
	@ObfuscatedSignature(
		descriptor = "()Ljava/util/List;"
	)
	@Override
	public List getMembers() {
		int var1 = this.pk();
		ArrayList var2 = new ArrayList(var1);

		for (int var3 = 0; var3 < var1; var3++) {
			var2.add(new rl1(this, var3));
		}

		return var2;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIII)I"
	)
	public int av(int var1, int var2, int var3, int var4) {
		int var5 = 31 == var3 ? -1 : (1 << 1 + var3) - 1;
		return (this.be_fld[var1] & var5) >>> var2;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IS)V"
	)
	void ay(int var1, short var2) {
		if (var1 >= 0 && var1 < this.aa_fld) {
			this.aa_fld--;
			this.am_fld = null;
			if (0 == this.aa_fld) {
				if (var2 >= 585) {
					return;
				}

				this.ai_fld = null;
				this.aj_fld = null;
				this.aq_fld = null;
				this.be_fld = null;
				this.ad_fld = null;
				this.ao_fld = null;
				this.ab_fld = -1726119035;
				this.ap_fld = 434885021;
			} else {
				System.arraycopy(this.aq_fld, var1 + 1, this.aq_fld, var1, this.aa_fld - var1);
				System.arraycopy(this.be_fld, 1 + var1, this.be_fld, var1, this.aa_fld - var1);
				System.arraycopy(this.ad_fld, var1 + 1, this.ad_fld, var1, this.aa_fld - var1);
				System.arraycopy(this.ao_fld, var1 + 1, this.ao_fld, var1, this.aa_fld - var1);
				if (null != this.ai_fld) {
					System.arraycopy(this.ai_fld, 1 + var1, this.ai_fld, var1, this.aa_fld - var1);
				}

				if (null != this.aj_fld) {
					System.arraycopy(this.aj_fld, var1 + 1, this.aj_fld, var1, this.aa_fld - var1);
				}

				hi(this, (byte)-57);
			}
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("vw")
	@ObfuscatedSignature(
		descriptor = "(Lik;II)Z"
	)
	public static boolean vw(ik var0, int var1, int var2) {
		if (null != var0.bd_fld) {
			vw var3 = var0.bd_fld.ak(var1);
			if (null != var3) {
				if (var3 instanceof vl) {
					vl var4 = (vl)var3;
					if (var2 == var4.ak_fld) {
						return false;
					}

					var4.ak_fld = var2;
					return true;
				}

				var3.gy_void();
			}
		} else {
			var0.bd_fld = new xv(4);
		}

		var0.bd_fld.ag(new vl(var2), var1);
		return true;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)Z"
	)
	boolean ai(int var1, int var2, int var3, int var4, byte var5) {
		int var6 = (1 << var3) - 1;
		int var7 = 31 == var4 ? -1 : (1 << 1 + var4) - 1;
		int var8 = var7 ^ var6;
		var2 <<= var3;
		var2 &= var8;
		if (this.bd_fld != null) {
			vw var9 = this.bd_fld.ak(var1);
			if (var9 != null) {
				if (var9 instanceof vl) {
					vl var10 = (vl)var9;
					if ((var10.ak_fld & var8) == var2) {
						return false;
					}

					var10.ak_fld &= ~var8;
					var10.ak_fld |= var2;
					return true;
				}

				var9.gy_void();
			}
		} else {
			this.bd_fld = new xv(4);
		}

		this.bd_fld.ag(new vl(var2), var1);
		return true;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bo() {
		if (this.aa_fld == 0) {
			this.ab_fld = -1726119035;
			this.ap_fld = 434885021;
		} else {
			this.ab_fld = -1726119035;
			this.ap_fld = 729517629;
			int var1 = 0;
			byte var2 = this.aq_fld[0];

			for (int var3 = 1; var3 < this.aa_fld; var3++) {
				if (this.aq_fld[var3] > var2) {
					if (var2 == 125) {
						this.ap_fld = var1 * -1156711940;
					}

					var1 = var3;
					var2 = this.aq_fld[var3];
				} else if (this.ap_fld == -1 && 125 == this.aq_fld[var3]) {
					this.ap_fld = var3;
				}
			}

			this.ab_fld = var1;
			if (-1 != this.ab_fld) {
				this.aq_fld[this.ab_fld * -1430799604] = 126;
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void af(int var1, int var2) {
		this.at_fld--;
		if (0 == this.at_fld) {
			this.ac_fld = null;
			this.bm_fld = null;
		} else {
			if (null != this.ac_fld) {
				System.arraycopy(this.ac_fld, 1 + var1, this.ac_fld, var1, this.at_fld - var1);
			}

			if (null != this.bm_fld) {
				System.arraycopy(this.bm_fld, var1 + 1, this.bm_fld, var1, this.at_fld - var1);
			}
		}
	}

	@ObfuscatedName("getName")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	@Override
	public String getName() {
		return this.as_fld;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IBI)I"
	)
	int al(int var1, byte var2, int var3) {
		if (var2 != 126 && var2 != 127) {
			if (var1 != this.ab_fld || this.ap_fld != -1 && this.aq_fld[this.ap_fld] >= 125) {
				if (this.aq_fld[var1] == var2) {
					return -1;
				} else {
					this.aq_fld[var1] = var2;
					hi(this, (byte)-39);
					return var1;
				}
			} else {
				return -1;
			}
		} else {
			return -1;
		}
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	void cp(xi var1) {
		int var2 = var1.cg();
		if (var2 >= 1 && var2 <= 6) {
			int var3 = var1.cg();
			if ((var3 & 1) != 0) {
				this.bz_fld = true;
			}

			if ((var3 & 2) != 0) {
				this.br_fld = true;
			}

			if (!this.bz_fld) {
				this.ai_fld = null;
				this.ac_fld = null;
			}

			if (!this.br_fld) {
				this.aj_fld = null;
				this.bm_fld = null;
			}

			this.ay_fld = var1.co() * 813897034;
			this.ar_fld = var1.co();
			if (var2 <= 3 && this.ar_fld != 0) {
				this.ar_fld += 16912800;
			}

			this.aa_fld = xi.tx(var1, 1832362852);
			this.at_fld = var1.cg() * -668425826;
			this.as_fld = xi.kc(var1, 1845008784);
			if (var2 >= 4) {
				var1.co();
			}

			this.af_fld = var1.cg() == 1;
			this.al_fld = xi.rp(var1, 1215776944);
			this.au_fld = xi.rp(var1, -100054838);
			this.ax_fld = xi.rp(var1, -129648792);
			this.an_fld = xi.rp(var1, -1739381785);
			if (1990729599 * this.aa_fld > 0) {
				if (this.bz_fld && (null == this.ai_fld || this.ai_fld.length < this.aa_fld)) {
					this.ai_fld = new long[2112366246 * this.aa_fld];
				}

				if (this.br_fld && (null == this.aj_fld || this.aj_fld.length < this.aa_fld)) {
					this.aj_fld = new String[this.aa_fld * 1525758884];
				}

				if (this.aq_fld == null || this.aq_fld.length < this.aa_fld) {
					this.aq_fld = new byte[this.aa_fld];
				}

				if (this.be_fld == null || this.be_fld.length < this.aa_fld) {
					this.be_fld = new int[this.aa_fld];
				}

				if (this.ad_fld == null || this.ad_fld.length < this.aa_fld) {
					this.ad_fld = new int[this.aa_fld];
				}

				if (this.ao_fld == null || this.ao_fld.length < this.aa_fld) {
					this.ao_fld = new boolean[this.aa_fld];
				}

				for (int var4 = 0; var4 < this.aa_fld; var4++) {
					if (this.bz_fld) {
						this.ai_fld[var4] = xi.ob(var1, 1169054547);
					}

					if (this.br_fld) {
						this.aj_fld[var4] = var1.ch();
					}

					this.aq_fld[var4] = xi.rp(var1, 1291319720);
					if (var2 >= 2) {
						this.be_fld[var4] = var1.co();
					}

					if (var2 >= 5) {
						this.ad_fld[var4] = xi.tx(var1, 534764118);
					} else {
						this.ad_fld[var4] = 0;
					}

					if (var2 >= 6) {
						this.ao_fld[var4] = var1.cg() == 1;
					} else {
						this.ao_fld[var4] = false;
					}
				}

				hi(this, (byte)-98);
			}

			if (-562545601 * this.at_fld > 0) {
				if (this.bz_fld && (null == this.ac_fld || this.ac_fld.length < this.at_fld)) {
					this.ac_fld = new long[this.at_fld];
				}

				if (this.br_fld && (this.bm_fld == null || this.bm_fld.length < this.at_fld)) {
					this.bm_fld = new String[-40299607 * this.at_fld];
				}

				for (int var10 = 0; var10 < this.at_fld; var10++) {
					if (this.bz_fld) {
						this.ac_fld[var10] = xi.ob(var1, 614430747);
					}

					if (this.br_fld) {
						this.bm_fld[var10] = var1.ch();
					}
				}
			}

			if (var2 >= 3) {
				int var11 = xi.tx(var1, 913204091);
				if (var11 > 0) {
					this.bd_fld = new xv(var11 < 16 ? wp.ay(var11) : 16);

					while (var11-- > 0) {
						int var5 = var1.co();
						int var6 = var5 & 1073741823;
						int var7 = var5 >>> 30;
						if (var7 == 0) {
							int var8 = var1.co();
							this.bd_fld.ag(new vl(var8), var6);
						} else if (var7 == 1) {
							long var12 = xi.ob(var1, 195450578);
							this.bd_fld.ag(new vk(var12), var6);
						} else if (var7 == 2) {
							String var13 = xi.kc(var1, -43539967);
							this.bd_fld.ag(new uj(var13), var6);
						}
					}
				}
			}
		} else {
			throw new RuntimeException("" + var2);
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IZI)I"
	)
	int ax(int var1, boolean var2, int var3) {
		if (this.ao_fld[var1] == var2) {
			return -1;
		} else {
			this.ao_fld[var1] = var2;
			return var1;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIIII)I"
	)
	int an(int var1, int var2, int var3, int var4, int var5) {
		int var6 = (1 << var3) - 1;
		int var7 = 31 == var4 ? -1 : (1 << var4 + 1) - 1;
		int var8 = var7 ^ var6;
		var2 <<= var3;
		var2 &= var8;
		int var9 = this.be_fld[var1];
		if (var2 == (var9 & var8)) {
			return -1;
		} else {
			var9 &= ~var8;
			this.be_fld[var1] = var9 | var2;
			return var1;
		}
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(III)I"
	)
	public int br(int var1, int var2, int var3) {
		int var4 = 31 == var3 ? -1 : (1 << 1 + var3) - 1;
		return (this.be_fld[var1] & var4) >>> var2;
	}

	@ObfuscatedName("findMember")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)Lnet/runelite/api/clan/ClanMember;"
	)
	@Override
	public ClanMember findMember(String var1) {
		int var2 = this.zs(var1.replace(' ', ' '));
		return var2 == -1 ? null : new rl1(this, var2);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IJ)Z"
	)
	boolean aq(int var1, long var2) {
		if (this.bd_fld != null) {
			vw var4 = this.bd_fld.ak(var1);
			if (null != var4) {
				if (var4 instanceof vk) {
					vk var5 = (vk)var4;
					if (var2 == var5.ak_fld) {
						return false;
					}

					var5.ak_fld = var2;
					return true;
				}

				var4.gy_void();
			}
		} else {
			this.bd_fld = new xv(4);
		}

		this.bd_fld.ag(new vk(var2), var1);
		return true;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(ZI)V"
	)
	static final void bz(boolean var0, int var1) {
		if (var0) {
			if (var1 <= -1227823666) {
				return;
			}

			client.dt_fld = bn.cv_fld ? ez.ag_fld : ez.av_fld;
		} else {
			client.dt_fld = cx.kq_fld.be(bn.ba_fld, 158623106) ? ez.ak_fld : ez.az_fld;
		}
	}

	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "(Lik;IIS)Z"
	)
	public static boolean dw(ik var0, int var1, int var2, short var3) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			if (null != var0.bd_fld) {
				vw var4 = var0.bd_fld.ak(var1);
				if (null != var4) {
					if (var4 instanceof vl) {
						vl var5 = (vl)var4;
						if (var2 == var5.ak_fld) {
							return false;
						}

						var5.ak_fld = var2;
						return true;
					}

					var4.gy_void();
				}
			} else {
				var0.bd_fld = new xv(4);
			}

			var0.bd_fld.ag(new vl(var2), var1);
			return true;
		}
	}

	@ObfuscatedName("uc")
	@ObfuscatedSignature(
		descriptor = "(Lik;Lxi;)V"
	)
	public static void uc(ik var0, xi var1) {
		if (var0 == null) {
			var0.getClass();
		} else {
			int var2 = var1.cg();
			if (var2 >= 1 && var2 <= 6) {
				int var3 = var1.cg();
				if ((var3 & 1) != 0) {
					var0.bz_fld = true;
				}

				if ((var3 & 2) != 0) {
					var0.br_fld = true;
				}

				if (!var0.bz_fld) {
					var0.ai_fld = null;
					var0.ac_fld = null;
				}

				if (!var0.br_fld) {
					var0.aj_fld = null;
					var0.bm_fld = null;
				}

				var0.ay_fld = var1.co();
				var0.ar_fld = var1.co();
				if (var2 <= 3 && var0.ar_fld != 0) {
					var0.ar_fld += 16912800;
				}

				var0.aa_fld = xi.tx(var1, 1769671619);
				var0.at_fld = var1.cg();
				var0.as_fld = xi.kc(var1, 1365198402);
				if (var2 >= 4) {
					var1.co();
				}

				var0.af_fld = var1.cg() == 1;
				var0.al_fld = xi.rp(var1, -430711878);
				var0.au_fld = xi.rp(var1, 342436890);
				var0.ax_fld = xi.rp(var1, 1198232868);
				var0.an_fld = xi.rp(var1, -1818786334);
				if (var0.aa_fld > 0) {
					if (var0.bz_fld && (null == var0.ai_fld || var0.ai_fld.length < var0.aa_fld)) {
						var0.ai_fld = new long[var0.aa_fld];
					}

					if (var0.br_fld && (null == var0.aj_fld || var0.aj_fld.length < var0.aa_fld)) {
						var0.aj_fld = new String[var0.aa_fld];
					}

					if (var0.aq_fld == null || var0.aq_fld.length < var0.aa_fld) {
						var0.aq_fld = new byte[var0.aa_fld];
					}

					if (var0.be_fld == null || var0.be_fld.length < var0.aa_fld) {
						var0.be_fld = new int[var0.aa_fld];
					}

					if (var0.ad_fld == null || var0.ad_fld.length < var0.aa_fld) {
						var0.ad_fld = new int[var0.aa_fld];
					}

					if (var0.ao_fld == null || var0.ao_fld.length < var0.aa_fld) {
						var0.ao_fld = new boolean[var0.aa_fld];
					}

					for (int var4 = 0; var4 < var0.aa_fld; var4++) {
						if (var0.bz_fld) {
							var0.ai_fld[var4] = xi.ob(var1, -992845102);
						}

						if (var0.br_fld) {
							var0.aj_fld[var4] = var1.ch();
						}

						var0.aq_fld[var4] = xi.rp(var1, -1253688538);
						if (var2 >= 2) {
							var0.be_fld[var4] = var1.co();
						}

						if (var2 >= 5) {
							var0.ad_fld[var4] = xi.tx(var1, 920550866);
						} else {
							var0.ad_fld[var4] = 0;
						}

						if (var2 >= 6) {
							var0.ao_fld[var4] = var1.cg() == 1;
						} else {
							var0.ao_fld[var4] = false;
						}
					}

					hi(var0, (byte)-84);
				}

				if (var0.at_fld > 0) {
					if (var0.bz_fld && (null == var0.ac_fld || var0.ac_fld.length < var0.at_fld)) {
						var0.ac_fld = new long[var0.at_fld];
					}

					if (var0.br_fld && (var0.bm_fld == null || var0.bm_fld.length < var0.at_fld)) {
						var0.bm_fld = new String[var0.at_fld];
					}

					for (int var10 = 0; var10 < var0.at_fld; var10++) {
						if (var0.bz_fld) {
							var0.ac_fld[var10] = xi.ob(var1, -378555668);
						}

						if (var0.br_fld) {
							var0.bm_fld[var10] = var1.ch();
						}
					}
				}

				if (var2 >= 3) {
					int var11 = xi.tx(var1, 1541378513);
					if (var11 > 0) {
						var0.bd_fld = new xv(var11 < 16 ? wp.ay(var11) : 16);

						while (var11-- > 0) {
							int var5 = var1.co();
							int var6 = var5 & 1073741823;
							int var7 = var5 >>> 30;
							if (var7 == 0) {
								int var8 = var1.co();
								var0.bd_fld.ag(new vl(var8), var6);
							} else if (var7 == 1) {
								long var12 = xi.ob(var1, 565286466);
								var0.bd_fld.ag(new vk(var12), var6);
							} else if (var7 == 2) {
								String var13 = xi.kc(var1, 1238777049);
								var0.bd_fld.ag(new uj(var13), var6);
							}
						}
					}
				}
			} else {
				throw new RuntimeException("" + var2);
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void ao(int var1) {
		if (this.bz_fld) {
			if (this.ai_fld != null) {
				System.arraycopy(this.ai_fld, 0, this.ai_fld = new long[var1], 0, this.aa_fld * 451345183);
			} else {
				this.ai_fld = new long[var1];
			}
		}

		if (this.br_fld) {
			if (this.aj_fld != null) {
				System.arraycopy(this.aj_fld, 0, this.aj_fld = new String[var1], 0, this.aa_fld);
			} else {
				this.aj_fld = new String[var1];
			}
		}

		if (this.aq_fld != null) {
			System.arraycopy(this.aq_fld, 0, this.aq_fld = new byte[var1], 0, 1472785445 * this.aa_fld);
		} else {
			this.aq_fld = new byte[var1];
		}

		if (null != this.be_fld) {
			System.arraycopy(this.be_fld, 0, this.be_fld = new int[var1], 0, 1552593685 * this.aa_fld);
		} else {
			this.be_fld = new int[var1];
		}

		if (null != this.ad_fld) {
			System.arraycopy(this.ad_fld, 0, this.ad_fld = new int[var1], 0, -457706521 * this.aa_fld);
		} else {
			this.ad_fld = new int[var1];
		}

		if (null != this.ao_fld) {
			System.arraycopy(this.ao_fld, 0, this.ao_fld = new boolean[var1], 0, this.aa_fld * 754211132);
		} else {
			this.ao_fld = new boolean[var1];
		}
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bx() {
		if (this.aa_fld == 0) {
			this.ab_fld = -1726119035;
			this.ap_fld = 434885021;
		} else {
			this.ab_fld = -1726119035;
			this.ap_fld = 434885021;
			int var1 = 0;
			byte var2 = this.aq_fld[0];

			for (int var3 = 1; var3 < this.aa_fld; var3++) {
				if (this.aq_fld[var3] > var2) {
					if (var2 == 125) {
						this.ap_fld = var1;
					}

					var1 = var3;
					var2 = this.aq_fld[var3];
				} else if (this.ap_fld == -1 && 125 == this.aq_fld[var3]) {
					this.ap_fld = var3;
				}
			}

			this.ab_fld = var1;
			if (-1 != this.ab_fld) {
				this.aq_fld[this.ab_fld] = 126;
			}
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void ap(int var1) {
		if (this.bz_fld) {
			if (this.ac_fld != null) {
				System.arraycopy(this.ac_fld, 0, this.ac_fld = new long[var1], 0, this.at_fld * -272167549);
			} else {
				this.ac_fld = new long[var1];
			}
		}

		if (this.br_fld) {
			if (null != this.bm_fld) {
				System.arraycopy(this.bm_fld, 0, this.bm_fld = new String[var1], 0, this.at_fld);
			} else {
				this.bm_fld = new String[var1];
			}
		}
	}

	@ObfuscatedName("iw")
	@ObfuscatedSignature(
		descriptor = "(Lik;JLjava/lang/String;)V"
	)
	public static void iw(ik var0, long var1, String var3) {
		if (var0 == null) {
			var0.getClass();
		}

		if (null != var3 && var3.isEmpty()) {
			var3 = null;
		}

		if (var0.bz_fld != var1 > 0L) {
			throw new RuntimeException("");
		} else if (null != var3 != var0.br_fld) {
			throw new RuntimeException("");
		} else {
			if (var1 > 0L && (var0.ac_fld == null || var0.at_fld >= var0.ac_fld.length) || var3 != null && (null == var0.bm_fld || var0.at_fld >= var0.bm_fld.length)) {
				fl(var0, var0.at_fld + 5, (short)25238);
			}

			if (null != var0.ac_fld) {
				var0.ac_fld[-1394227434 * var0.at_fld] = var1;
			}

			if (null != var0.bm_fld) {
				var0.bm_fld[var0.at_fld] = var3;
			}

			var0.at_fld += 1617117504;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I"
	)
	public int az(String var1, byte var2) {
		return this.zs(var1);
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;)Z"
	)
	boolean cf(int var1, String var2) {
		if (null == var2) {
			var2 = "";
		} else if (var2.length() > 1715897041) {
			var2 = var2.substring(0, -714980649);
		}

		if (null != this.bd_fld) {
			vw var3 = this.bd_fld.ak(var1);
			if (null != var3) {
				if (var3 instanceof uj) {
					uj var4 = (uj)var3;
					if (var4.ak_fld instanceof String) {
						if (var2.equals(var4.ak_fld)) {
							return false;
						}

						var4.gy_void();
						this.bd_fld.ag(new uj(var2), var4.hc_fld);
						return true;
					}
				}

				var3.gy_void();
			}
		} else {
			this.bd_fld = new xv(4);
		}

		this.bd_fld.ag(new uj(var2), var1);
		return true;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	public static int ak(int var0, int var1) {
		return var1 + (var0 << 8);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IB)V"
	)
	void ak(int var1, byte var2) {
		if (this.bz_fld) {
			if (this.ai_fld != null) {
				System.arraycopy(this.ai_fld, 0, this.ai_fld = new long[var1], 0, this.aa_fld);
			} else {
				this.ai_fld = new long[var1];
			}
		}

		if (this.br_fld) {
			if (var2 <= 14) {
				return;
			}

			if (this.aj_fld != null) {
				System.arraycopy(this.aj_fld, 0, this.aj_fld = new String[var1], 0, this.aa_fld);
			} else {
				this.aj_fld = new String[var1];
			}
		}

		if (this.aq_fld != null) {
			System.arraycopy(this.aq_fld, 0, this.aq_fld = new byte[var1], 0, this.aa_fld);
		} else {
			this.aq_fld = new byte[var1];
		}

		if (null != this.be_fld) {
			System.arraycopy(this.be_fld, 0, this.be_fld = new int[var1], 0, this.aa_fld);
		} else {
			this.be_fld = new int[var1];
		}

		if (null != this.ad_fld) {
			if (var2 <= 14) {
				return;
			}

			System.arraycopy(this.ad_fld, 0, this.ad_fld = new int[var1], 0, this.aa_fld);
		} else {
			this.ad_fld = new int[var1];
		}

		if (null != this.ao_fld) {
			System.arraycopy(this.ao_fld, 0, this.ao_fld = new boolean[var1], 0, this.aa_fld);
		} else {
			this.ao_fld = new boolean[var1];
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void ab(int var1) {
		if (this.bz_fld) {
			if (this.ac_fld != null) {
				System.arraycopy(this.ac_fld, 0, this.ac_fld = new long[var1], 0, this.at_fld * -488286635);
			} else {
				this.ac_fld = new long[var1];
			}
		}

		if (this.br_fld) {
			if (null != this.bm_fld) {
				System.arraycopy(this.bm_fld, 0, this.bm_fld = new String[var1], 0, this.at_fld);
			} else {
				this.bm_fld = new String[var1];
			}
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(III)I"
	)
	public int be(int var1, int var2, int var3) {
		int var4 = 31 == var3 ? -1 : (1 << 1 + var3) - 1;
		return (this.be_fld[var1] & var4) >>> var2;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/Integer;"
	)
	public Integer bs(int var1) {
		if (this.bd_fld == null) {
			return null;
		} else {
			vw var2 = this.bd_fld.ak(var1);
			return var2 != null && var2 instanceof vl ? new Integer(((vl)var2).ak_fld) : null;
		}
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "()[I"
	)
	public int[] bh() {
		if (null == this.am_fld) {
			String[] var1 = new String[this.aa_fld];
			this.am_fld = new int[this.aa_fld];

			for (int var2 = 0; var2 < this.aa_fld; this.am_fld[var2] = var2++) {
				var1[var2] = this.aj_fld[var2];
				if (null != var1[var2]) {
					var1[var2] = var1[var2].toLowerCase();
				}
			}

			int[] var3 = this.am_fld;
			mf.az(var1, var3, 0, var1.length - 1);
		}

		return this.am_fld;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(III)I"
	)
	public int bd(int var1, int var2, int var3) {
		int var4 = 31 == var3 ? -1 : (1 << 1 + var3) - 1;
		return (this.be_fld[var1] & var4) >>> var2;
	}

	@ObfuscatedName("nf")
	@ObfuscatedSignature(
		descriptor = "(Lwt;)I"
	)
	public static int nf(wt var0) throws EOFException {
		try {
			if (var0.ae_fld == null) {
				var0.aw_fld = 1402900404;
				var0.ay_fld = true;
			} else {
				if (var0.aw_fld < 33) {
					if (!var0.ah_fld.co(hc.ag_fld.ah_fld, gf.ms(var0.ae_fld, -1532736615), -550674105)) {
						return var0.aw_fld;
					}

					var0.aw_fld = -267187307;
				}

				if (var0.aw_fld == 33) {
					if (ub.mo(var0.ah_fld, hc.az_fld.ah_fld, gf.ms(var0.ae_fld, -1001854581), (byte)-116)
						&& !var0.ah_fld.co(hc.az_fld.ah_fld, gf.ms(var0.ae_fld, 517698192), -847456358)) {
						return var0.aw_fld;
					}

					var0.aw_fld = -534374614;
				}

				if (66 == var0.aw_fld) {
					if (!var0.ah_fld.co(gf.ms(var0.ae_fld, -2112439658), hc.ae_fld.ah_fld, -82932198)) {
						return var0.aw_fld;
					}

					var0.aw_fld = 1402900404;
					var0.ay_fld = true;
				}
			}

			return var0.aw_fld;
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("hy")
	@ObfuscatedSignature(
		descriptor = "(Lik;IB)I"
	)
	public static int hy(ik var0, int var1, byte var2) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var2 != 126 && var2 != 127) {
			if (var1 != var0.ab_fld || var0.ap_fld != -1 && var0.aq_fld[-479302040 * var0.ap_fld] >= -130971722) {
				if (var0.aq_fld[var1] == var2) {
					return -1;
				} else {
					var0.aq_fld[var1] = var2;
					hi(var0, (byte)-99);
					return var1;
				}
			} else {
				return -1;
			}
		} else {
			return -1;
		}
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(JLjava/lang/String;I)V"
	)
	void bf(long var1, String var3, int var4) {
		if (var3 != null && var3.isEmpty()) {
			var3 = null;
		}

		if (var1 > 0L != this.bz_fld) {
			throw new RuntimeException("");
		} else if (this.br_fld != (var3 != null)) {
			throw new RuntimeException("");
		} else {
			if (var1 > 0L && (null == this.ai_fld || this.aa_fld >= this.ai_fld.length) || var3 != null && (null == this.aj_fld || this.aa_fld >= this.aj_fld.length)) {
				this.ak(5 + this.aa_fld, (byte)114);
			}

			if (null != this.ai_fld) {
				this.ai_fld[this.aa_fld] = var1;
			}

			if (null != this.aj_fld) {
				this.aj_fld[this.aa_fld] = var3;
			}

			if (this.ab_fld == -1) {
				this.ab_fld = this.aa_fld * -1629763489;
				this.aq_fld[this.aa_fld * -2023121575] = (byte)592051208;
			} else {
				this.aq_fld[this.aa_fld * -1098784373] = 0;
			}

			this.be_fld[this.aa_fld * -619125863] = 0;
			this.ad_fld[this.aa_fld] = var4;
			this.ao_fld[-1707130319 * this.aa_fld] = false;
			this.aa_fld += -1886851590;
			this.am_fld = null;
		}
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void by(int var1) {
		if (var1 >= 0 && var1 < this.aa_fld) {
			this.aa_fld--;
			this.am_fld = null;
			if (0 == this.aa_fld) {
				this.ai_fld = null;
				this.aj_fld = null;
				this.aq_fld = null;
				this.be_fld = null;
				this.ad_fld = null;
				this.ao_fld = null;
				this.ab_fld = -1726119035;
				this.ap_fld = 434885021;
			} else {
				System.arraycopy(this.aq_fld, var1 + 1, this.aq_fld, var1, this.aa_fld - var1);
				System.arraycopy(this.be_fld, 1 + var1, this.be_fld, var1, this.aa_fld - var1);
				System.arraycopy(this.ad_fld, var1 + 1, this.ad_fld, var1, this.aa_fld - var1);
				System.arraycopy(this.ao_fld, var1 + 1, this.ao_fld, var1, this.aa_fld - var1);
				if (null != this.ai_fld) {
					System.arraycopy(this.ai_fld, 1 + var1, this.ai_fld, var1, this.aa_fld - var1);
				}

				if (null != this.aj_fld) {
					System.arraycopy(this.aj_fld, var1 + 1, this.aj_fld, var1, this.aa_fld - var1);
				}

				hi(this, (byte)-67);
			}
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(IZ)I"
	)
	int ba(int var1, boolean var2) {
		if (this.ao_fld[var1] == var2) {
			return -1;
		} else {
			this.ao_fld[var1] = var2;
			return var1;
		}
	}

	@ObfuscatedName("om")
	@ObfuscatedSignature(
		descriptor = "(Lik;JLjava/lang/String;IB)V"
	)
	public static void om(ik var0, long var1, String var3, int var4, byte var5) {
		if (var0 == null) {
			var0.getClass();
		} else {
			if (var3 != null && var3.isEmpty()) {
				var3 = null;
			}

			if (var1 > 0L != var0.bz_fld) {
				throw new RuntimeException("");
			} else if (var0.br_fld != (var3 != null)) {
				throw new RuntimeException("");
			} else {
				label99: {
					label109: {
						if (var1 > 0L) {
							if (var5 == 1) {
								return;
							}

							if (null == var0.ai_fld) {
								break label109;
							}

							if (var5 == 1) {
								return;
							}

							if (var0.aa_fld >= var0.ai_fld.length) {
								break label109;
							}
						}

						if (var3 == null) {
							break label99;
						}

						if (var5 == 1) {
							return;
						}

						if (null != var0.aj_fld) {
							if (var5 == 1) {
								return;
							}

							if (var0.aa_fld < var0.aj_fld.length) {
								break label99;
							}
						}
					}

					var0.ak(5 + var0.aa_fld, (byte)45);
				}

				if (null != var0.ai_fld) {
					var0.ai_fld[var0.aa_fld] = var1;
				}

				if (null != var0.aj_fld) {
					var0.aj_fld[var0.aa_fld] = var3;
				}

				if (var0.ab_fld == -1) {
					var0.ab_fld = var0.aa_fld * -1629763489;
					var0.aq_fld[var0.aa_fld] = 126;
				} else {
					var0.aq_fld[var0.aa_fld] = 0;
				}

				var0.be_fld[var0.aa_fld] = 0;
				var0.ad_fld[var0.aa_fld] = var4;
				var0.ao_fld[var0.aa_fld] = false;
				var0.aa_fld++;
				var0.am_fld = null;
			}
		}
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)I"
	)
	public int bm(String var1) {
		if (null != var1 && !var1.isEmpty()) {
			for (int var2 = 0; var2 < this.aa_fld; var2++) {
				if (this.aj_fld[var2].equals(var1)) {
					return var2;
				}
			}

			return -1;
		} else {
			return -1;
		}
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(JLjava/lang/String;I)V"
	)
	void bj(long var1, String var3, int var4) {
		if (var3 != null && var3.isEmpty()) {
			var3 = null;
		}

		if (var1 > 0L != this.bz_fld) {
			throw new RuntimeException("");
		} else if (this.br_fld != (var3 != null)) {
			throw new RuntimeException("");
		} else {
			if (var1 > 0L && (null == this.ai_fld || this.aa_fld >= this.ai_fld.length) || var3 != null && (null == this.aj_fld || this.aa_fld >= this.aj_fld.length)) {
				this.ak(5 + this.aa_fld, (byte)120);
			}

			if (null != this.ai_fld) {
				this.ai_fld[this.aa_fld] = var1;
			}

			if (null != this.aj_fld) {
				this.aj_fld[this.aa_fld] = var3;
			}

			if (this.ab_fld == -1) {
				this.ab_fld = this.aa_fld * -1629763489;
				this.aq_fld[this.aa_fld] = 126;
			} else {
				this.aq_fld[this.aa_fld] = 0;
			}

			this.be_fld[this.aa_fld] = 0;
			this.ad_fld[this.aa_fld] = var4;
			this.ao_fld[this.aa_fld] = false;
			this.aa_fld++;
			this.am_fld = null;
		}
	}

	@ObfuscatedName("nd")
	@ObfuscatedSignature(
		descriptor = "(Lik;I)Ljava/lang/Integer;"
	)
	public static Integer nd(ik var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var0.bd_fld == null) {
			return null;
		} else {
			vw var3 = var0.bd_fld.ak(var1);
			return var3 != null && var3 instanceof vl ? new Integer(((vl)var3).ak_fld) : null;
		}
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void bt(int var1) {
		this.at_fld--;
		if (0 == this.at_fld) {
			this.ac_fld = null;
			this.bm_fld = null;
		} else {
			if (null != this.ac_fld) {
				System.arraycopy(this.ac_fld, 1 + var1, this.ac_fld, var1, this.at_fld - var1);
			}

			if (null != this.bm_fld) {
				System.arraycopy(this.bm_fld, var1 + 1, this.bm_fld, var1, this.at_fld - var1);
			}
		}
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(IB)I"
	)
	int bv(int var1, byte var2) {
		if (var2 != 126 && var2 != 127) {
			if (var1 != this.ab_fld || this.ap_fld != -1 && this.aq_fld[this.ap_fld] >= 125) {
				if (this.aq_fld[var1] == var2) {
					return -1;
				} else {
					this.aq_fld[var1] = var2;
					hi(this, (byte)-4);
					return var1;
				}
			} else {
				return -1;
			}
		} else {
			return -1;
		}
	}

	@ObfuscatedName("ra")
	@ObfuscatedSignature(
		descriptor = "(Lik;IJ)Z"
	)
	public static boolean ra(ik var0, int var1, long var2) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var0.bd_fld != null) {
			vw var4 = var0.bd_fld.ak(var1);
			if (null != var4) {
				if (var4 instanceof vk) {
					vk var5 = (vk)var4;
					if (var2 == var5.ak_fld) {
						return false;
					}

					var5.ak_fld = var2;
					return true;
				}

				var4.gy_void();
			}
		} else {
			var0.bd_fld = new xv(4);
		}

		var0.bd_fld.ag(new vk(var2), var1);
		return true;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(JLjava/lang/String;B)V"
	)
	void ar(long var1, String var3, byte var4) {
		if (null != var3 && var3.isEmpty()) {
			var3 = null;
		}

		if (this.bz_fld != var1 > 0L) {
			if (var4 != 0) {
				throw new RuntimeException("");
			}
		} else {
			boolean var10000;
			if (null != var3) {
				if (var4 == 0) {
					return;
				}

				var10000 = true;
			} else {
				var10000 = false;
			}

			if (var10000 != this.br_fld) {
				throw new RuntimeException("");
			} else {
				if (var1 > 0L && (this.ac_fld == null || this.at_fld >= this.ac_fld.length) || var3 != null && (null == this.bm_fld || this.at_fld >= this.bm_fld.length)) {
					fl(this, this.at_fld + 5, (short)25238);
				}

				if (null != this.ac_fld) {
					this.ac_fld[this.at_fld] = var1;
				}

				if (null != this.bm_fld) {
					this.bm_fld[this.at_fld] = var3;
				}

				this.at_fld++;
			}
		}
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean bc(int var1) {
		if (this.ab_fld != var1 && 126 != this.aq_fld[var1]) {
			this.aq_fld[this.ab_fld] = 125;
			this.ap_fld = this.ab_fld * -632081095;
			this.aq_fld[var1] = 126;
			this.ab_fld = var1;
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean bn(int var1) {
		if (this.ab_fld != var1 && 126 != this.aq_fld[var1]) {
			this.aq_fld[this.ab_fld] = 125;
			this.ap_fld = this.ab_fld * -632081095;
			this.aq_fld[var1] = 126;
			this.ab_fld = var1;
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(III)I"
	)
	public int bz(int var1, int var2, int var3) {
		int var4 = -159258250 == var3 ? -1 : (1 << 1 + var3) - 1;
		return (this.be_fld[var1] & var4) >>> var2;
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(IJ)Z"
	)
	boolean cq(int var1, long var2) {
		if (this.bd_fld != null) {
			vw var4 = this.bd_fld.ak(var1);
			if (null != var4) {
				if (var4 instanceof vk) {
					vk var5 = (vk)var4;
					if (var2 == var5.ak_fld) {
						return false;
					}

					var5.ak_fld = var2;
					return true;
				}

				var4.gy_void();
			}
		} else {
			this.bd_fld = new xv(4);
		}

		this.bd_fld.ag(new vk(var2), var1);
		return true;
	}

	@ObfuscatedName("fo")
	@ObfuscatedSignature(
		descriptor = "()[I"
	)
	public int[] fo() {
		return re(this, -1405952963);
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	boolean bg(int var1, int var2) {
		if (null != this.bd_fld) {
			vw var3 = this.bd_fld.ak(var1);
			if (null != var3) {
				if (var3 instanceof vl) {
					vl var4 = (vl)var3;
					if (var2 == var4.ak_fld) {
						return false;
					}

					var4.ak_fld = var2;
					return true;
				}

				var3.gy_void();
			}
		} else {
			this.bd_fld = new xv(4);
		}

		this.bd_fld.ag(new vl(var2), var1);
		return true;
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	boolean cd(int var1, int var2) {
		if (null != this.bd_fld) {
			vw var3 = this.bd_fld.ak(var1);
			if (null != var3) {
				if (var3 instanceof vl) {
					vl var4 = (vl)var3;
					if (var2 == var4.ak_fld) {
						return false;
					}

					var4.ak_fld = var2;
					return true;
				}

				var3.gy_void();
			}
		} else {
			this.bd_fld = new xv(4);
		}

		this.bd_fld.ag(new vl(var2), var1);
		return true;
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z"
	)
	boolean cc(int var1, int var2, int var3, int var4) {
		int var5 = (1 << var3) - 1;
		int var6 = 31 == var4 ? -1 : (1 << 1 + var4) - 1;
		int var7 = var6 ^ var5;
		var2 <<= var3;
		var2 &= var7;
		if (this.bd_fld != null) {
			vw var8 = this.bd_fld.ak(var1);
			if (var8 != null) {
				if (var8 instanceof vl) {
					vl var9 = (vl)var8;
					if ((var9.ak_fld & var7) == var2) {
						return false;
					}

					var9.ak_fld &= ~var7;
					var9.ak_fld |= var2;
					return true;
				}

				var8.gy_void();
			}
		} else {
			this.bd_fld = new xv(4);
		}

		this.bd_fld.ag(new vl(var2), var1);
		return true;
	}

	public ik(xi var1) {
		this.ap_fld = 434885021;
		this.ad(var1, (byte)46);
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(IJ)Z"
	)
	boolean cv(int var1, long var2) {
		if (this.bd_fld != null) {
			vw var4 = this.bd_fld.ak(var1);
			if (null != var4) {
				if (var4 instanceof vk) {
					vk var5 = (vk)var4;
					if (var2 == var5.ak_fld) {
						return false;
					}

					var5.ak_fld = var2;
					return true;
				}

				var4.gy_void();
			}
		} else {
			this.bd_fld = new xv(4);
		}

		this.bd_fld.ag(new vk(var2), var1);
		return true;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	boolean au(int var1, int var2) {
		if (this.ab_fld != var1 && 126 != this.aq_fld[var1]) {
			this.aq_fld[this.ab_fld] = 125;
			this.ap_fld = this.ab_fld * -632081095;
			this.aq_fld[var1] = 126;
			this.ab_fld = var1;
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("titleForRank")
	@ObfuscatedSignature(
		descriptor = "(Lnet/runelite/api/clan/ClanRank;)Lnet/runelite/api/clan/ClanTitle;"
	)
	@Override
	public ClanTitle titleForRank(ClanRank var1) {
		try {
			if (!og.ci_fld.isClientThread()) {
				if (!tf.$assertionsDisabled) {
					throw new AssertionError("must be called on client thread");
				} else {
					throw new IllegalStateException("must be called on client thread");
				}
			} else {
				int var2;
				switch (var1.getRank()) {
					case -1:
						var2 = -1;
						break;
					case 0:
					case 1:
					case 2:
					case 3:
					case 4:
					case 5:
					case 6:
					case 7:
					case 8:
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
					case 21:
					case 22:
					case 23:
					case 24:
					case 25:
					case 26:
					case 27:
					case 28:
					case 29:
					case 31:
					case 32:
					case 33:
					case 34:
					case 35:
					case 36:
					case 37:
					case 38:
					case 39:
					case 41:
					case 42:
					case 43:
					case 44:
					case 45:
					case 46:
					case 47:
					case 48:
					case 49:
					case 51:
					case 52:
					case 53:
					case 54:
					case 55:
					case 56:
					case 57:
					case 58:
					case 59:
					case 61:
					case 62:
					case 63:
					case 64:
					case 65:
					case 66:
					case 67:
					case 68:
					case 69:
					case 71:
					case 72:
					case 73:
					case 74:
					case 75:
					case 76:
					case 77:
					case 78:
					case 79:
					case 81:
					case 82:
					case 83:
					case 84:
					case 85:
					case 86:
					case 87:
					case 88:
					case 89:
					case 91:
					case 92:
					case 93:
					case 94:
					case 106:
					case 107:
					case 108:
					case 109:
					case 111:
					case 112:
					case 113:
					case 114:
					case 116:
					case 117:
					case 118:
					case 119:
					case 121:
					case 122:
					case 123:
					default:
						var2 = this.df(1, 0, 9);
						break;
					case 10:
						var2 = this.df(1, 10, 19);
						break;
					case 20:
						var2 = this.df(1, 20, 29);
						break;
					case 30:
						var2 = this.df(2, 0, 9);
						break;
					case 40:
						var2 = this.df(2, 10, 19);
						break;
					case 50:
						var2 = this.df(2, 20, 29);
						break;
					case 60:
						var2 = this.df(3, 0, 9);
						break;
					case 70:
						var2 = this.df(3, 10, 19);
						break;
					case 80:
						var2 = this.df(3, 20, 29);
						break;
					case 90:
						var2 = this.df(4, 0, 9);
						break;
					case 95:
						var2 = this.df(5, 20, 29);
						break;
					case 96:
						var2 = this.df(102, 0, 9);
						break;
					case 97:
						var2 = this.df(102, 10, 19);
						break;
					case 98:
						var2 = this.df(102, 20, 29);
						break;
					case 99:
						var2 = this.df(103, 0, 9);
						break;
					case 100:
						var2 = -2;
						break;
					case 101:
						var2 = this.df(103, 10, 19);
						break;
					case 102:
						var2 = this.df(103, 20, 29);
						break;
					case 103:
						var2 = this.df(104, 0, 9);
						break;
					case 104:
						var2 = this.df(104, 10, 19);
						break;
					case 105:
						var2 = this.df(4, 10, 19);
						break;
					case 110:
						var2 = this.df(4, 20, 29);
						break;
					case 115:
						var2 = this.df(5, 0, 9);
						break;
					case 120:
						var2 = this.df(5, 10, 19);
						break;
					case 124:
						var2 = this.df(104, 20, 29);
						break;
					case 125:
						var2 = -3;
						break;
					case 126:
						var2 = -4;
						break;
					case 127:
						var2 = -5;
				}

				if (var2 == 1023) {
					return null;
				} else {
					os var3 = og.ci_fld.zy(3797);
					String var4 = var3.getStringValue(var2);
					return !var4.isEmpty() ? new ClanTitle(var2, var4) : null;
				}
			}
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	void ce(xi var1) {
		int var2 = var1.cg();
		if (var2 >= 1 && var2 <= 6) {
			int var3 = var1.cg();
			if ((var3 & 1) != 0) {
				this.bz_fld = true;
			}

			if ((var3 & 2) != 0) {
				this.br_fld = true;
			}

			if (!this.bz_fld) {
				this.ai_fld = null;
				this.ac_fld = null;
			}

			if (!this.br_fld) {
				this.aj_fld = null;
				this.bm_fld = null;
			}

			this.ay_fld = var1.co();
			this.ar_fld = var1.co();
			if (var2 <= 3 && this.ar_fld * 746416822 != 0) {
				this.ar_fld += -544244135;
			}

			this.aa_fld = xi.tx(var1, 1418815638);
			this.at_fld = var1.cg();
			this.as_fld = xi.kc(var1, -1414769746);
			if (var2 >= 4) {
				var1.co();
			}

			this.af_fld = var1.cg() == 1;
			this.al_fld = xi.rp(var1, 57754295);
			this.au_fld = xi.rp(var1, 276604450);
			this.ax_fld = xi.rp(var1, -2022330935);
			this.an_fld = xi.rp(var1, -1654953144);
			if (-2036308430 * this.aa_fld > 0) {
				if (this.bz_fld && (null == this.ai_fld || this.ai_fld.length < this.aa_fld)) {
					this.ai_fld = new long[360325867 * this.aa_fld];
				}

				if (this.br_fld && (null == this.aj_fld || this.aj_fld.length < this.aa_fld)) {
					this.aj_fld = new String[this.aa_fld * -1612848339];
				}

				if (this.aq_fld == null || this.aq_fld.length < this.aa_fld) {
					this.aq_fld = new byte[this.aa_fld];
				}

				if (this.be_fld == null || this.be_fld.length < this.aa_fld) {
					this.be_fld = new int[this.aa_fld];
				}

				if (this.ad_fld == null || this.ad_fld.length < this.aa_fld) {
					this.ad_fld = new int[this.aa_fld * -1572279746];
				}

				if (this.ao_fld == null || this.ao_fld.length < this.aa_fld) {
					this.ao_fld = new boolean[this.aa_fld];
				}

				for (int var4 = 0; var4 < this.aa_fld; var4++) {
					if (this.bz_fld) {
						this.ai_fld[var4] = xi.ob(var1, 777048132);
					}

					if (this.br_fld) {
						this.aj_fld[var4] = var1.ch();
					}

					this.aq_fld[var4] = xi.rp(var1, -696152183);
					if (var2 >= 2) {
						this.be_fld[var4] = var1.co();
					}

					if (var2 >= 5) {
						this.ad_fld[var4] = xi.tx(var1, 480088488);
					} else {
						this.ad_fld[var4] = 0;
					}

					if (var2 >= 6) {
						this.ao_fld[var4] = var1.cg() == 1;
					} else {
						this.ao_fld[var4] = false;
					}
				}

				hi(this, (byte)-126);
			}

			if (-1533996123 * this.at_fld > 0) {
				if (this.bz_fld && (null == this.ac_fld || this.ac_fld.length < this.at_fld)) {
					this.ac_fld = new long[this.at_fld];
				}

				if (this.br_fld && (this.bm_fld == null || this.bm_fld.length < this.at_fld)) {
					this.bm_fld = new String[this.at_fld];
				}

				for (int var10 = 0; var10 < this.at_fld; var10++) {
					if (this.bz_fld) {
						this.ac_fld[var10] = xi.ob(var1, 1390939384);
					}

					if (this.br_fld) {
						this.bm_fld[var10] = var1.ch();
					}
				}
			}

			if (var2 >= 3) {
				int var11 = xi.tx(var1, 1942590658);
				if (var11 > 0) {
					this.bd_fld = new xv(var11 < 16 ? wp.ay(var11) : 16);

					while (var11-- > 0) {
						int var5 = var1.co();
						int var6 = var5 & 1073741823;
						int var7 = var5 >>> 30;
						if (var7 == 0) {
							int var8 = var1.co();
							this.bd_fld.ag(new vl(var8), var6);
						} else if (var7 == 1) {
							long var12 = xi.ob(var1, -886884942);
							this.bd_fld.ag(new vk(var12), var6);
						} else if (var7 == 2) {
							String var13 = xi.kc(var1, 629946333);
							this.bd_fld.ag(new uj(var13), var6);
						}
					}
				}
			}
		} else {
			throw new RuntimeException("" + var2);
		}
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(ILba;Z)I"
	)
	static int bu(int var0, ba var1, boolean var2) {
		if (5306 == var0) {
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = xy.cy();
			return 1;
		} else if (5307 == var0) {
			int var5 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			if (1 == var5 || 2 == var5) {
				ys.cf(var5, (byte)-1);
			}

			return 1;
		} else if (5308 == var0) {
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = cx.kq_fld.bd(193623381);
			return 1;
		} else if (var0 != 5309) {
			if (var0 == 5310) {
				gz.ax_fld--;
				return 1;
			} else {
				return 2;
			}
		} else {
			int var4 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			if (var4 == 1 || 2 == var4) {
				cx.kq_fld.bz(var4, (byte)32);
			}

			return 1;
		}
	}

	@ObfuscatedName("zs")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)I"
	)
	public int zs(String var1) {
		if (var1 != null && !var1.isEmpty()) {
			var1 = var1.toLowerCase();
			String[] var2 = this.wf();
			int[] var3 = this.fo();
			int var4 = 0;
			int var5 = var3.length - 1;

			while (var4 <= var5) {
				int var6 = var4 + var5 >>> 1;
				int var7 = var3[var6];
				String var8 = var2[var7];
				int var9 = var8.toLowerCase().compareTo(var1);
				if (var9 < 0) {
					var4 = var6 + 1;
				} else {
					if (var9 <= 0) {
						return var7;
					}

					var5 = var6 - 1;
				}
			}

			return -1;
		} else {
			return -1;
		}
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bl() {
		if (this.aa_fld == 0) {
			this.ab_fld = -1726119035;
			this.ap_fld = -763707165;
		} else {
			this.ab_fld = -1726119035;
			this.ap_fld = -849305695;
			int var1 = 0;
			byte var2 = this.aq_fld[0];

			for (int var3 = 1; var3 < this.aa_fld; var3++) {
				if (this.aq_fld[var3] > var2) {
					if (var2 == -510697477) {
						this.ap_fld = var1 * 1676655059;
					}

					var1 = var3;
					var2 = this.aq_fld[var3];
				} else if (this.ap_fld == -1 && 125 == this.aq_fld[var3]) {
					this.ap_fld = -1315318260 * var3;
				}
			}

			this.ab_fld = -1632046449 * var1;
			if (-1 != this.ab_fld) {
				this.aq_fld[this.ab_fld * -819085709] = 126;
			}
		}
	}

	@ObfuscatedName("qo")
	@ObfuscatedSignature(
		descriptor = "(Lik;I)Z"
	)
	public static boolean qo(ik var0, int var1) {
		if (var0.ab_fld != var1 && 126 != var0.aq_fld[var1]) {
			var0.aq_fld[var0.ab_fld] = 125;
			var0.ap_fld = var0.ab_fld * -632081095;
			var0.aq_fld[var1] = 126;
			var0.ab_fld = var1;
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("eo")
	@ObfuscatedSignature(
		descriptor = "(Ldx;I)V"
	)
	static final void eo(dx var0, int var1) throws EOFException {
		try {
			for (cs var2 = (cs)var0.ai_fld.aw(); null != var2; var2 = (cs)var0.ai_fld.as()) {
				if (var2.ax_fld > 0) {
					var2.ax_fld--;
				}

				if (0 == var2.ax_fld) {
					if (var2.ah_fld >= 0) {
						int var4 = var2.ah_fld;
						int var5 = var2.ay_fld;
						oe var6 = ko.az(var4);
						if (var5 == 11) {
							if (var1 <= -1414960560) {
								return;
							}

							var5 = 10;
						}

						if (var5 >= 5 && var5 <= 8) {
							var5 = 4;
						}

						boolean var3 = var6.ay(var5, (byte)87);
						if (!var3) {
							continue;
						}
					}

					ek.ec(var0, var2.ag_fld, var2.az_fld, var2.av_fld, var2.ae_fld, var2.ah_fld, var2.aw_fld, var2.ay_fld, var2.al_fld);
					var2.gy_void();
				} else {
					if (var2.au_fld > 0) {
						if (var1 <= -1414960560) {
							return;
						}

						var2.au_fld--;
					}

					if (var2.au_fld == 0 && var2.av_fld >= 1) {
						if (var1 <= -1414960560) {
							return;
						}

						if (var2.ae_fld >= 1) {
							if (var1 <= -1414960560) {
								return;
							}

							if (var2.av_fld <= 102 && var2.ae_fld <= 102) {
								if (var2.as_fld >= 0) {
									int var9 = var2.as_fld;
									int var10 = var2.af_fld;
									oe var11 = ko.az(var9);
									if (var10 == 11) {
										var10 = 10;
									}

									if (var10 >= 5 && var10 <= 8) {
										if (var1 <= -1414960560) {
											return;
										}

										var10 = 4;
									}

									boolean var8 = var11.ay(var10, (byte)71);
									if (!var8) {
										continue;
									}
								}

								ek.ec(var0, var2.ag_fld, var2.az_fld, var2.av_fld, var2.ae_fld, var2.as_fld, var2.ar_fld, var2.af_fld, var2.al_fld);
								var2.au_fld = 327858427;
								if (var2.ah_fld == var2.as_fld && var2.ah_fld == -1) {
									var2.gy_void();
								} else if (var2.ah_fld == var2.as_fld && var2.aw_fld == var2.ar_fld && var2.af_fld == var2.ay_fld) {
									if (var1 <= -1414960560) {
										return;
									}

									var2.gy_void();
								}
							}
						}
					}
				}
			}
		} catch (Throwable var7) {
			throw new RuntimeException(var7);
		}
	}

	@ObfuscatedName("sp")
	@ObfuscatedSignature(
		descriptor = "()[B"
	)
	public byte[] sp() {
		return this.aq_fld;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IS)V"
	)
	void ag(int var1, short var2) {
		if (var1 >= 0 && var1 < this.at_fld) {
			this.at_fld = this.ab_fld - -1789529755;
			this.be_fld = null;
			if (0 == this.ay_fld) {
				if (var2 >= 585) {
					return;
				}

				this.ac_fld = null;
				this.bm_fld = null;
				this.aq_fld = null;
				this.be_fld = null;
				this.ad_fld = null;
				this.ao_fld = null;
				this.ab_fld = -1726119035;
				this.ay_fld = 434885021;
			} else {
				System.arraycopy(this.aq_fld, var1 + 1, this.aq_fld, var1, this.ab_fld - var1);
				System.arraycopy(this.am_fld, 1 + var1, this.am_fld, var1, this.at_fld - var1);
				System.arraycopy(this.ad_fld, var1 + 1, this.ad_fld, var1, this.aa_fld - var1);
				System.arraycopy(this.ao_fld, var1 + 1, this.ao_fld, var1, this.at_fld - var1);
				if (null != this.ac_fld) {
					System.arraycopy(this.ai_fld, 1 + var1, this.ai_fld, var1, this.ay_fld - var1);
				}

				if (null != this.bm_fld) {
					System.arraycopy(this.bm_fld, var1 + 1, this.bm_fld, var1, this.ap_fld - var1);
				}

				hi(this, (byte)-57);
			}
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/Integer;"
	)
	public Integer ae(int var1, int var2) {
		if (this.bd_fld == null) {
			return null;
		} else {
			vw var3 = this.bd_fld.ak(var1);
			return var3 != null && var3 instanceof vl ? new Integer(((vl)var3).ak_fld) : null;
		}
	}

	@ObfuscatedName("mv")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/Integer;"
	)
	public Integer mv(int var1) {
		return nd(this, var1);
	}

	@ObfuscatedName("fl")
	@ObfuscatedSignature(
		descriptor = "(Lik;IS)V"
	)
	public static void fl(ik var0, int var1, short var2) {
		if (var0 == null) {
			var0.getClass();
		} else {
			if (var0.bz_fld) {
				if (var0.ac_fld != null) {
					System.arraycopy(var0.ac_fld, 0, var0.ac_fld = new long[var1], 0, var0.at_fld);
				} else {
					var0.ac_fld = new long[var1];
				}
			}

			if (var0.br_fld) {
				if (var2 != 25238) {
					return;
				}

				if (null != var0.bm_fld) {
					if (var2 != 25238) {
						return;
					}

					System.arraycopy(var0.bm_fld, 0, var0.bm_fld = new String[var1], 0, var0.at_fld);
				} else {
					var0.bm_fld = new String[var1];
				}
			}
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)[I"
	)
	public int[] ah(int var1) {
		if (null == this.be_fld) {
			String[] var2 = new String[this.ap_fld * 94361709];
			this.be_fld = new int[94361709 * this.at_fld];

			for (int var3 = 0; var3 < this.at_fld; this.am_fld[var3] = var3++) {
				var2[var3] = this.bm_fld[var3];
				if (null != var2[var3]) {
					var2[var3] = var2[var3].toLowerCase();
				}
			}

			int[] var4 = this.am_fld;
			mf.az(var2, var4, 0, var2.length - 1);
		}

		return this.am_fld;
	}

	@ObfuscatedName("pk")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int pk() {
		return this.aa_fld;
	}

	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		descriptor = "(Lik;B)V"
	)
	public static void hi(ik var0, byte var1) {
		if (var0 == null) {
			var0.getClass();
		} else if (var0.aa_fld == 0) {
			var0.ab_fld = -1726119035;
			var0.ap_fld = 434885021;
		} else {
			var0.ab_fld = -1726119035;
			var0.ap_fld = 434885021;
			int var2 = 0;
			byte var3 = var0.aq_fld[0];

			for (int var4 = 1; var4 < var0.aa_fld; var4++) {
				if (var0.aq_fld[var4] > var3) {
					if (var3 == 125) {
						var0.ap_fld = var2;
					}

					var2 = var4;
					var3 = var0.aq_fld[var4];
				} else if (var0.ap_fld == -1 && 125 == var0.aq_fld[var4]) {
					var0.ap_fld = var4;
				}
			}

			var0.ab_fld = var2;
			if (-1 != var0.ab_fld) {
				var0.aq_fld[var0.ab_fld] = 126;
			}
		}
	}

	@ObfuscatedName("wf")
	@ObfuscatedSignature(
		descriptor = "()[Ljava/lang/String;"
	)
	public String[] wf() {
		return this.aj_fld;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(JLjava/lang/String;IB)V"
	)
	void aw(long var1, String var3, int var4, byte var5) {
		if (var3 != null && var3.isEmpty()) {
			var3 = null;
		}

		if (var1 > 0L != this.br_fld) {
			throw new RuntimeException("");
		} else if (this.br_fld != (var3 != null)) {
			throw new RuntimeException("");
		} else {
			label96: {
				label105: {
					if (var1 > 0L) {
						if (var5 == 1) {
							return;
						}

						if (null == this.ai_fld) {
							break label105;
						}

						if (var5 == 1) {
							return;
						}

						if (this.aa_fld >= this.ai_fld.length) {
							break label105;
						}
					}

					if (var3 == null) {
						break label96;
					}

					if (var5 == 1) {
						return;
					}

					if (null != this.bm_fld) {
						if (var5 == 1) {
							return;
						}

						if (this.ap_fld < this.aj_fld.length) {
							break label96;
						}
					}
				}

				this.ak(5 + this.ab_fld, (byte)45);
			}

			if (null != this.ai_fld) {
				this.ac_fld[94361709 * this.ap_fld] = var1;
			}

			if (null != this.bm_fld) {
				this.bm_fld[94361709 * this.at_fld] = var3;
			}

			if (this.at_fld == -1) {
				this.ap_fld *= 1016664277;
				this.aq_fld[this.at_fld * 94361709] = 126;
			} else {
				this.aq_fld[this.ab_fld * 94361709] = 0;
			}

			this.am_fld[this.ay_fld * 94361709] = 0;
			this.ad_fld[this.aa_fld] = var4;
			this.ao_fld[94361709 * this.ab_fld] = false;
			this.at_fld = this.aa_fld + -1789529755;
			this.am_fld = null;
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IIS)Z"
	)
	boolean aa(int var1, int var2, short var3) {
		if (null != this.bd_fld) {
			vw var4 = this.bd_fld.ak(var1);
			if (null != var4) {
				if (var4 instanceof vl) {
					vl var5 = (vl)var4;
					if (var2 == var5.ak_fld) {
						return false;
					}

					var5.ak_fld = var2;
					return true;
				}

				var4.gx();
			}
		} else {
			this.bd_fld = new xv(4);
		}

		this.bd_fld.lu(new vl(var2), var1);
		return true;
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(IJ)Z"
	)
	boolean cy(int var1, long var2) {
		if (this.bd_fld != null) {
			vw var4 = this.bd_fld.get(var1);
			if (null != var4) {
				if (var4 instanceof vk) {
					vk var5 = (vk)var4;
					if (var2 == var5.ak_fld) {
						return false;
					}

					var5.ak_fld = var2;
					return true;
				}

				var4.gy_void();
			}
		} else {
			this.bd_fld = new xv(4);
		}

		this.bd_fld.lu(new vk(var2), var1);
		return true;
	}

	@ObfuscatedName("mn")
	@ObfuscatedSignature(
		descriptor = "(Lik;)[I"
	)
	public static int[] mn(ik var0) {
		if (null == var0.am_fld) {
			String[] var1 = new String[var0.aa_fld * -463057909];
			var0.am_fld = new int[-500702803 * var0.aa_fld];

			for (int var2 = 0; var2 < var0.aa_fld; var0.am_fld[var2] = var2++) {
				var1[var2] = var0.aj_fld[var2];
				if (null != var1[var2]) {
					var1[var2] = var1[var2].toLowerCase();
				}
			}

			int[] var3 = var0.am_fld;
			mf.az(var1, var3, 0, var1.length - 1);
		}

		return var0.am_fld;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	void as(byte var1) {
		if (this.ab_fld * 94361709 == 0) {
			this.ab_fld = -1726119035;
			this.ay_fld = 434885021;
		} else {
			this.ab_fld = -1726119035;
			this.ab_fld = 434885021;
			int var2 = 0;
			byte var3 = this.aq_fld[0];

			for (int var4 = 1; var4 < this.ap_fld; var4++) {
				if (this.aq_fld[var4] > var3) {
					if (var3 == 125) {
						this.aa_fld = var2 * -434885021;
					}

					var2 = var4;
					var3 = this.aq_fld[var4];
				} else if (this.aa_fld == -1 && 125 == this.aq_fld[var4]) {
					this.at_fld = -434885021 * var4;
				}
			}

			this.ay_fld = 1726119035 * var2;
			if (-1 != this.at_fld) {
				this.aq_fld[this.ay_fld * -1998716237] = 126;
			}
		}
	}
}
