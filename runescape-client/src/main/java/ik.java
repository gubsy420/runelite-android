import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import net.runelite.api.annotations.Export;
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
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 335420205
	)
	public int ay_fld = 0;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	public String as_fld = null;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] be_fld;
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "[Ljava/lang/String;"
	)
	public String[] bm_fld;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "B"
	)
	public byte al_fld;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "[Ljava/lang/String;"
	)
	public String[] aj_fld;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 94361709
	)
	public int aa_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	@ObfuscatedGetter(
		longValue = 3509774569710105249L
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
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] am_fld;
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
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1551121589
	)
	public int ap_fld;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -625181569
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
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 832825071
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
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1998716237
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

	@ObfuscatedName("fg")
	@ObfuscatedSignature(
		descriptor = "()[Ljava/lang/String;"
	)
	public String[] fg() {
		return this.bm_fld;
	}

	@ObfuscatedName("kn")
	@ObfuscatedSignature(
		descriptor = "(Lik;I)Ljava/lang/Integer;"
	)
	public static Integer kn(ik var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var0.bd_fld == null) {
			return null;
		} else {
			vw var2 = var0.bd_fld.ak(var1);
			return var2 != null && var2 instanceof vl ? new Integer(((vl)var2).ak_fld) : null;
		}
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
				this.bm_fld = null;
				this.aj_fld = null;
			}

			this.ay_fld = var1.co((byte)-76);
			this.ar_fld = var1.co((byte)-50);
			if (var3 <= 3 && this.ar_fld != 0) {
				this.ar_fld += 16912800;
			}

			this.aa_fld = var1.cm();
			this.at_fld = var1.cg();
			this.as_fld = xi.at(var1, -220200472);
			if (var3 >= 4) {
				var1.co((byte)-99);
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
			this.al_fld = var1.cw();
			this.au_fld = var1.cw();
			this.ax_fld = var1.cw();
			this.an_fld = var1.cw();
			if (this.aa_fld > 0) {
				if (this.bz_fld && (null == this.ai_fld || this.ai_fld.length < this.aa_fld)) {
					this.ai_fld = new long[this.aa_fld];
				}

				if (this.br_fld && (null == this.bm_fld || this.bm_fld.length < this.aa_fld)) {
					this.bm_fld = new String[this.aa_fld];
				}

				if (this.aq_fld == null || this.aq_fld.length < this.aa_fld) {
					this.aq_fld = new byte[this.aa_fld];
				}

				label287: {
					if (this.am_fld != null) {
						if (var2 <= 0) {
							return;
						}

						if (this.am_fld.length >= this.aa_fld) {
							break label287;
						}
					}

					this.am_fld = new int[this.aa_fld];
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
						this.ai_fld[var5] = var1.cu();
					}

					if (this.br_fld) {
						this.bm_fld[var5] = var1.cl();
					}

					this.aq_fld[var5] = var1.cw();
					if (var3 >= 2) {
						this.am_fld[var5] = var1.co((byte)-104);
					}

					if (var3 >= 5) {
						this.ad_fld[var5] = var1.cm();
					} else {
						this.ad_fld[var5] = 0;
					}

					if (var3 >= 6) {
						this.ao_fld[var5] = var1.cg() == 1;
					} else {
						this.ao_fld[var5] = false;
					}
				}

				this.as((byte)-85);
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

					if (this.aj_fld == null || this.aj_fld.length < this.at_fld) {
						this.aj_fld = new String[this.at_fld];
					}
				}

				for (int var11 = 0; var11 < this.at_fld; var11++) {
					if (this.bz_fld) {
						this.ac_fld[var11] = var1.cu();
					}

					if (this.br_fld) {
						this.aj_fld[var11] = var1.cl();
					}
				}
			}

			if (var3 >= 3) {
				int var12 = var1.cm();
				if (var12 > 0) {
					this.bd_fld = new xv(var12 < 16 ? wp.ay(var12) : 16);

					while (var12-- > 0) {
						int var6 = var1.co((byte)-118);
						int var7 = var6 & 1073741823;
						int var8 = var6 >>> 30;
						if (var8 == 0) {
							int var9 = var1.co((byte)-118);
							this.bd_fld.ag(new vl(var9), var7);
						} else if (var8 == 1) {
							long var13 = var1.cu();
							this.bd_fld.ag(new vk(var13), var7);
						} else if (var8 == 2) {
							String var14 = xi.at(var1, -717330182);
							this.bd_fld.ag(new uj(var14), var7);
						}
					}
				}
			}
		} else {
			throw new RuntimeException("" + var3);
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

						var5.gy();
						this.bd_fld.ag(new uj(var2), var5.hc_long);
						return true;
					}
				}

				var4.gy();
			}
		} else {
			this.bd_fld = new xv(4);
		}

		this.bd_fld.ag(new uj(var2), var1);
		return true;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IS)V"
	)
	void ag(int var1, short var2) {
		if (this.bz_fld) {
			if (this.ac_fld != null) {
				System.arraycopy(this.ac_fld, 0, this.ac_fld = new long[var1], 0, this.at_fld);
			} else {
				this.ac_fld = new long[var1];
			}
		}

		if (this.br_fld) {
			if (var2 != 25238) {
				return;
			}

			if (null != this.aj_fld) {
				if (var2 != 25238) {
					return;
				}

				System.arraycopy(this.aj_fld, 0, this.aj_fld = new String[var1], 0, this.at_fld);
			} else {
				this.aj_fld = new String[var1];
			}
		}
	}

	@ObfuscatedName("wf")
	@ObfuscatedSignature(
		descriptor = "(Lik;III)I"
	)
	public static int wf(ik var0, int var1, int var2, int var3) {
		if (var0 == null) {
			var0.getClass();
		}

		int var4 = -159258250 == var3 ? -1 : (1 << 1 + var3) - 1;
		return (var0.am_fld[var1] & var4) >>> var2;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIII)I"
	)
	public int av(int var1, int var2, int var3, int var4) {
		int var5 = 31 == var3 ? -1 : (1 << 1 + var3) - 1;
		return (this.am_fld[var1] & var5) >>> var2;
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

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)[I"
	)
	public int[] ah(int var1) {
		if (null == this.be_fld) {
			String[] var2 = new String[this.aa_fld];
			this.be_fld = new int[this.aa_fld];

			for (int var3 = 0; var3 < this.aa_fld; this.be_fld[var3] = var3++) {
				var2[var3] = this.bm_fld[var3];
				if (null != var2[var3]) {
					var2[var3] = var2[var3].toLowerCase();
				}
			}

			int[] var4 = this.be_fld;
			mf.az(var2, var4, 0, var2.length - 1);
		}

		return this.be_fld;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IS)V"
	)
	void ay(int var1, short var2) {
		if (var1 >= 0 && var1 < this.aa_fld) {
			this.aa_fld--;
			this.be_fld = null;
			if (0 == this.aa_fld) {
				if (var2 >= 585) {
					return;
				}

				this.ai_fld = null;
				this.bm_fld = null;
				this.aq_fld = null;
				this.am_fld = null;
				this.ad_fld = null;
				this.ao_fld = null;
				this.ab_fld = -1726119035;
				this.ap_fld = 434885021;
			} else {
				System.arraycopy(this.aq_fld, var1 + 1, this.aq_fld, var1, this.aa_fld - var1);
				System.arraycopy(this.am_fld, 1 + var1, this.am_fld, var1, this.aa_fld - var1);
				System.arraycopy(this.ad_fld, var1 + 1, this.ad_fld, var1, this.aa_fld - var1);
				System.arraycopy(this.ao_fld, var1 + 1, this.ao_fld, var1, this.aa_fld - var1);
				if (null != this.ai_fld) {
					System.arraycopy(this.ai_fld, 1 + var1, this.ai_fld, var1, this.aa_fld - var1);
				}

				if (null != this.bm_fld) {
					System.arraycopy(this.bm_fld, var1 + 1, this.bm_fld, var1, this.aa_fld - var1);
				}

				this.as((byte)-57);
			}
		} else {
			throw new RuntimeException("");
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
			this.aj_fld = null;
		} else {
			if (null != this.ac_fld) {
				System.arraycopy(this.ac_fld, 1 + var1, this.ac_fld, var1, this.at_fld - var1);
			}

			if (null != this.aj_fld) {
				System.arraycopy(this.aj_fld, var1 + 1, this.aj_fld, var1, this.at_fld - var1);
			}
		}
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	void cx(xi var1) {
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
				this.bm_fld = null;
				this.aj_fld = null;
			}

			this.ay_fld = var1.co((byte)-79) * 813897034;
			this.ar_fld = var1.co((byte)-5);
			if (var2 <= 3 && this.ar_fld != 0) {
				this.ar_fld += 16912800;
			}

			this.aa_fld = var1.cm();
			this.at_fld = var1.cg() * -668425826;
			this.as_fld = xi.at(var1, 1845008784);
			if (var2 >= 4) {
				var1.co((byte)-34);
			}

			this.af_fld = var1.cg() == 1;
			this.al_fld = var1.cw();
			this.au_fld = var1.cw();
			this.ax_fld = var1.cw();
			this.an_fld = var1.cw();
			if (1990729599 * this.aa_fld > 0) {
				if (this.bz_fld && (null == this.ai_fld || this.ai_fld.length < this.aa_fld)) {
					this.ai_fld = new long[2112366246 * this.aa_fld];
				}

				if (this.br_fld && (null == this.bm_fld || this.bm_fld.length < this.aa_fld)) {
					this.bm_fld = new String[this.aa_fld * 1525758884];
				}

				if (this.aq_fld == null || this.aq_fld.length < this.aa_fld) {
					this.aq_fld = new byte[this.aa_fld];
				}

				if (this.am_fld == null || this.am_fld.length < this.aa_fld) {
					this.am_fld = new int[this.aa_fld];
				}

				if (this.ad_fld == null || this.ad_fld.length < this.aa_fld) {
					this.ad_fld = new int[this.aa_fld];
				}

				if (this.ao_fld == null || this.ao_fld.length < this.aa_fld) {
					this.ao_fld = new boolean[this.aa_fld];
				}

				for (int var4 = 0; var4 < this.aa_fld; var4++) {
					if (this.bz_fld) {
						this.ai_fld[var4] = var1.cu();
					}

					if (this.br_fld) {
						this.bm_fld[var4] = var1.cl();
					}

					this.aq_fld[var4] = var1.cw();
					if (var2 >= 2) {
						this.am_fld[var4] = var1.co((byte)-109);
					}

					if (var2 >= 5) {
						this.ad_fld[var4] = var1.cm();
					} else {
						this.ad_fld[var4] = 0;
					}

					if (var2 >= 6) {
						this.ao_fld[var4] = var1.cg() == 1;
					} else {
						this.ao_fld[var4] = false;
					}
				}

				this.as((byte)-98);
			}

			if (-562545601 * this.at_fld > 0) {
				if (this.bz_fld && (null == this.ac_fld || this.ac_fld.length < this.at_fld)) {
					this.ac_fld = new long[this.at_fld];
				}

				if (this.br_fld && (this.aj_fld == null || this.aj_fld.length < this.at_fld)) {
					this.aj_fld = new String[-40299607 * this.at_fld];
				}

				for (int var10 = 0; var10 < this.at_fld; var10++) {
					if (this.bz_fld) {
						this.ac_fld[var10] = var1.cu();
					}

					if (this.br_fld) {
						this.aj_fld[var10] = var1.cl();
					}
				}
			}

			if (var2 >= 3) {
				int var11 = var1.cm();
				if (var11 > 0) {
					this.bd_fld = new xv(var11 < 16 ? wp.ay(var11) : 16);

					while (var11-- > 0) {
						int var5 = var1.co((byte)-46);
						int var6 = var5 & 1073741823;
						int var7 = var5 >>> 30;
						if (var7 == 0) {
							int var8 = var1.co((byte)-14);
							this.bd_fld.ag(new vl(var8), var6);
						} else if (var7 == 1) {
							long var12 = var1.cu();
							this.bd_fld.ag(new vk(var12), var6);
						} else if (var7 == 2) {
							String var13 = xi.at(var1, -43539967);
							this.bd_fld.ag(new uj(var13), var6);
						}
					}
				}
			}
		} else {
			throw new RuntimeException("" + var2);
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

				var4.gy();
			}
		} else {
			this.bd_fld = new xv(4);
		}

		this.bd_fld.ag(new vl(var2), var1);
		return true;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(III)I"
	)
	public int br(int var1, int var2, int var3) {
		int var4 = 31 == var3 ? -1 : (1 << 1 + var3) - 1;
		return (this.am_fld[var1] & var4) >>> var2;
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

				var4.gy();
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
			if (this.bm_fld != null) {
				System.arraycopy(this.bm_fld, 0, this.bm_fld = new String[var1], 0, this.aa_fld);
			} else {
				this.bm_fld = new String[var1];
			}
		}

		if (this.aq_fld != null) {
			System.arraycopy(this.aq_fld, 0, this.aq_fld = new byte[var1], 0, 1472785445 * this.aa_fld);
		} else {
			this.aq_fld = new byte[var1];
		}

		if (null != this.am_fld) {
			System.arraycopy(this.am_fld, 0, this.am_fld = new int[var1], 0, 1552593685 * this.aa_fld);
		} else {
			this.am_fld = new int[var1];
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

	@ObfuscatedName("kf")
	@ObfuscatedSignature(
		descriptor = "(Lik;II)Z"
	)
	public static boolean kf(ik var0, int var1, int var2) {
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

				var3.gy();
			}
		} else {
			var0.bd_fld = new xv(4);
		}

		var0.bd_fld.ag(new vl(var2), var1);
		return true;
	}

	@ObfuscatedName("ls")
	@ObfuscatedSignature(
		descriptor = "(Lik;ILjava/lang/String;)Z"
	)
	public static boolean ls(ik var0, int var1, String var2) {
		if (var0 == null) {
			var0.getClass();
		}

		if (null == var2) {
			var2 = "";
		} else if (var2.length() > 1715897041) {
			var2 = var2.substring(0, -714980649);
		}

		if (null != var0.bd_fld) {
			vw var3 = var0.bd_fld.ak(var1);
			if (null != var3) {
				if (var3 instanceof uj) {
					uj var4 = (uj)var3;
					if (var4.ak_fld instanceof String) {
						if (var2.equals(var4.ak_fld)) {
							return false;
						}

						var4.gy();
						var0.bd_fld.ag(new uj(var2), var4.hc_long);
						return true;
					}
				}

				var3.gy();
			}
		} else {
			var0.bd_fld = new xv(4);
		}

		var0.bd_fld.ag(new uj(var2), var1);
		return true;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bl() {
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
			if (null != this.aj_fld) {
				System.arraycopy(this.aj_fld, 0, this.aj_fld = new String[var1], 0, this.at_fld);
			} else {
				this.aj_fld = new String[var1];
			}
		}
	}

	@ObfuscatedName("sy")
	@ObfuscatedSignature(
		descriptor = "(Lik;IZ)I"
	)
	public static int sy(ik var0, int var1, boolean var2) {
		if (var0.ao_fld[var1] == var2) {
			return -1;
		} else {
			var0.ao_fld[var1] = var2;
			return var1;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void at(int var1) {
		if (this.bz_fld) {
			if (this.ac_fld != null) {
				System.arraycopy(this.ac_fld, 0, this.ac_fld = new long[var1], 0, this.at_fld);
			} else {
				this.ac_fld = new long[var1];
			}
		}

		if (this.br_fld) {
			if (null != this.aj_fld) {
				System.arraycopy(this.aj_fld, 0, this.aj_fld = new String[var1], 0, this.at_fld * -2081949358);
			} else {
				this.aj_fld = new String[var1];
			}
		}
	}

	@ObfuscatedName("getName")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	@Export("getName")
	@Override
	public String getName() {
		return this.as_fld;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void ac(int var1) {
		if (this.bz_fld) {
			if (this.ac_fld != null) {
				System.arraycopy(this.ac_fld, 0, this.ac_fld = new long[var1], 0, this.at_fld);
			} else {
				this.ac_fld = new long[var1];
			}
		}

		if (this.br_fld) {
			if (null != this.aj_fld) {
				System.arraycopy(this.aj_fld, 0, this.aj_fld = new String[var1], 0, this.at_fld);
			} else {
				this.aj_fld = new String[var1];
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I"
	)
	public int az(String var1, byte var2) {
		return this.ba(var1);
	}

	@ObfuscatedName("vx")
	@ObfuscatedSignature(
		descriptor = "()[I"
	)
	public int[] vx() {
		return this.ah(-1405952963);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(III)I"
	)
	public static int ak(int var0, int var1) {
		return var1 + (var0 << 8);
	}

	@ObfuscatedName("fh")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int fh() {
		return this.aa_fld;
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
			if (null != this.aj_fld) {
				System.arraycopy(this.aj_fld, 0, this.aj_fld = new String[var1], 0, this.at_fld);
			} else {
				this.aj_fld = new String[var1];
			}
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(III)I"
	)
	public int be(int var1, int var2, int var3) {
		int var4 = 31 == var3 ? -1 : (1 << 1 + var3) - 1;
		return (this.am_fld[var1] & var4) >>> var2;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "()[I"
	)
	public int[] bh() {
		if (null == this.be_fld) {
			String[] var1 = new String[this.aa_fld];
			this.be_fld = new int[this.aa_fld];

			for (int var2 = 0; var2 < this.aa_fld; this.be_fld[var2] = var2++) {
				var1[var2] = this.bm_fld[var2];
				if (null != var1[var2]) {
					var1[var2] = var1[var2].toLowerCase();
				}
			}

			int[] var3 = this.be_fld;
			mf.az(var1, var3, 0, var1.length - 1);
		}

		return this.be_fld;
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "()[I"
	)
	public int[] bk() {
		if (null == this.be_fld) {
			String[] var1 = new String[this.aa_fld * -463057909];
			this.be_fld = new int[-500702803 * this.aa_fld];

			for (int var2 = 0; var2 < this.aa_fld; this.be_fld[var2] = var2++) {
				var1[var2] = this.bm_fld[var2];
				if (null != var1[var2]) {
					var1[var2] = var1[var2].toLowerCase();
				}
			}

			int[] var3 = this.be_fld;
			mf.az(var1, var3, 0, var1.length - 1);
		}

		return this.be_fld;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(III)I"
	)
	public int bd(int var1, int var2, int var3) {
		int var4 = 31 == var3 ? -1 : (1 << 1 + var3) - 1;
		return (this.am_fld[var1] & var4) >>> var2;
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
			if (var1 > 0L && (null == this.ai_fld || this.aa_fld >= this.ai_fld.length) || var3 != null && (null == this.bm_fld || this.aa_fld >= this.bm_fld.length)) {
				bt(this, 5 + this.aa_fld, (byte)114);
			}

			if (null != this.ai_fld) {
				this.ai_fld[this.aa_fld] = var1;
			}

			if (null != this.bm_fld) {
				this.bm_fld[this.aa_fld] = var3;
			}

			if (this.ab_fld == -1) {
				this.ab_fld = this.aa_fld * -1629763489;
				this.aq_fld[this.aa_fld * -2023121575] = (byte)592051208;
			} else {
				this.aq_fld[this.aa_fld * -1098784373] = 0;
			}

			this.am_fld[this.aa_fld * -619125863] = 0;
			this.ad_fld[this.aa_fld] = var4;
			this.ao_fld[-1707130319 * this.aa_fld] = false;
			this.aa_fld += -1886851590;
			this.be_fld = null;
		}
	}

	@ObfuscatedName("hr")
	@ObfuscatedSignature(
		descriptor = "(Lik;IBI)I"
	)
	public static int hr(ik var0, int var1, byte var2) {
		if (var0 == null) {
			throw new NullPointerException();
		} else if (var2 != 126 && var2 != 127) {
			if (var1 != var0.ab_fld || var0.ap_fld != -1 && var0.aq_fld[var0.ap_fld] >= 125) {
				if (var0.aq_fld[var1] == var2) {
					return -1;
				} else {
					var0.aq_fld[var1] = var2;
					var0.as((byte)-39);
					return var1;
				}
			} else {
				return -1;
			}
		} else {
			return -1;
		}
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void by(int var1) {
		if (var1 >= 0 && var1 < this.aa_fld) {
			this.aa_fld--;
			this.be_fld = null;
			if (0 == this.aa_fld) {
				this.ai_fld = null;
				this.bm_fld = null;
				this.aq_fld = null;
				this.am_fld = null;
				this.ad_fld = null;
				this.ao_fld = null;
				this.ab_fld = -1726119035;
				this.ap_fld = 434885021;
			} else {
				System.arraycopy(this.aq_fld, var1 + 1, this.aq_fld, var1, this.aa_fld - var1);
				System.arraycopy(this.am_fld, 1 + var1, this.am_fld, var1, this.aa_fld - var1);
				System.arraycopy(this.ad_fld, var1 + 1, this.ad_fld, var1, this.aa_fld - var1);
				System.arraycopy(this.ao_fld, var1 + 1, this.ao_fld, var1, this.aa_fld - var1);
				if (null != this.ai_fld) {
					System.arraycopy(this.ai_fld, 1 + var1, this.ai_fld, var1, this.aa_fld - var1);
				}

				if (null != this.bm_fld) {
					System.arraycopy(this.bm_fld, var1 + 1, this.bm_fld, var1, this.aa_fld - var1);
				}

				this.as((byte)-67);
			}
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "(Lik;IZI)I"
	)
	public static int dx(ik var0, int var1, boolean var2) {
		if (var0 == null) {
			throw new NullPointerException();
		} else if (var0.ao_fld[var1] == var2) {
			return -1;
		} else {
			var0.ao_fld[var1] = var2;
			return var1;
		}
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	void cs(xi var1) {
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
				this.bm_fld = null;
				this.aj_fld = null;
			}

			this.ay_fld = var1.co((byte)-43);
			this.ar_fld = var1.co((byte)-86);
			if (var2 <= 3 && this.ar_fld != 0) {
				this.ar_fld += 16912800;
			}

			this.aa_fld = var1.cm();
			this.at_fld = var1.cg();
			this.as_fld = xi.at(var1, 1365198402);
			if (var2 >= 4) {
				var1.co((byte)-66);
			}

			this.af_fld = var1.cg() == 1;
			this.al_fld = var1.cw();
			this.au_fld = var1.cw();
			this.ax_fld = var1.cw();
			this.an_fld = var1.cw();
			if (this.aa_fld > 0) {
				if (this.bz_fld && (null == this.ai_fld || this.ai_fld.length < this.aa_fld)) {
					this.ai_fld = new long[this.aa_fld];
				}

				if (this.br_fld && (null == this.bm_fld || this.bm_fld.length < this.aa_fld)) {
					this.bm_fld = new String[this.aa_fld];
				}

				if (this.aq_fld == null || this.aq_fld.length < this.aa_fld) {
					this.aq_fld = new byte[this.aa_fld];
				}

				if (this.am_fld == null || this.am_fld.length < this.aa_fld) {
					this.am_fld = new int[this.aa_fld];
				}

				if (this.ad_fld == null || this.ad_fld.length < this.aa_fld) {
					this.ad_fld = new int[this.aa_fld];
				}

				if (this.ao_fld == null || this.ao_fld.length < this.aa_fld) {
					this.ao_fld = new boolean[this.aa_fld];
				}

				for (int var4 = 0; var4 < this.aa_fld; var4++) {
					if (this.bz_fld) {
						this.ai_fld[var4] = var1.cu();
					}

					if (this.br_fld) {
						this.bm_fld[var4] = var1.cl();
					}

					this.aq_fld[var4] = var1.cw();
					if (var2 >= 2) {
						this.am_fld[var4] = var1.co((byte)-113);
					}

					if (var2 >= 5) {
						this.ad_fld[var4] = var1.cm();
					} else {
						this.ad_fld[var4] = 0;
					}

					if (var2 >= 6) {
						this.ao_fld[var4] = var1.cg() == 1;
					} else {
						this.ao_fld[var4] = false;
					}
				}

				this.as((byte)-84);
			}

			if (this.at_fld > 0) {
				if (this.bz_fld && (null == this.ac_fld || this.ac_fld.length < this.at_fld)) {
					this.ac_fld = new long[this.at_fld];
				}

				if (this.br_fld && (this.aj_fld == null || this.aj_fld.length < this.at_fld)) {
					this.aj_fld = new String[this.at_fld];
				}

				for (int var10 = 0; var10 < this.at_fld; var10++) {
					if (this.bz_fld) {
						this.ac_fld[var10] = var1.cu();
					}

					if (this.br_fld) {
						this.aj_fld[var10] = var1.cl();
					}
				}
			}

			if (var2 >= 3) {
				int var11 = var1.cm();
				if (var11 > 0) {
					this.bd_fld = new xv(var11 < 16 ? wp.ay(var11) : 16);

					while (var11-- > 0) {
						int var5 = var1.co((byte)-90);
						int var6 = var5 & 1073741823;
						int var7 = var5 >>> 30;
						if (var7 == 0) {
							int var8 = var1.co((byte)-119);
							this.bd_fld.ag(new vl(var8), var6);
						} else if (var7 == 1) {
							long var12 = var1.cu();
							this.bd_fld.ag(new vk(var12), var6);
						} else if (var7 == 2) {
							String var13 = xi.at(var1, 1238777049);
							this.bd_fld.ag(new uj(var13), var6);
						}
					}
				}
			}
		} else {
			throw new RuntimeException("" + var2);
		}
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)I"
	)
	public int bm(String var1) {
		if (null != var1 && !var1.isEmpty()) {
			for (int var2 = 0; var2 < this.aa_fld; var2++) {
				if (this.bm_fld[var2].equals(var1)) {
					return var2;
				}
			}

			return -1;
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
			if (var1 > 0L && (null == this.ai_fld || this.aa_fld >= this.ai_fld.length) || var3 != null && (null == this.bm_fld || this.aa_fld >= this.bm_fld.length)) {
				bt(this, 5 + this.aa_fld, (byte)120);
			}

			if (null != this.ai_fld) {
				this.ai_fld[this.aa_fld] = var1;
			}

			if (null != this.bm_fld) {
				this.bm_fld[this.aa_fld] = var3;
			}

			if (this.ab_fld == -1) {
				this.ab_fld = this.aa_fld * -1629763489;
				this.aq_fld[this.aa_fld] = 126;
			} else {
				this.aq_fld[this.aa_fld] = 0;
			}

			this.am_fld[this.aa_fld] = 0;
			this.ad_fld[this.aa_fld] = var4;
			this.ao_fld[this.aa_fld] = false;
			this.aa_fld++;
			this.be_fld = null;
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
			this.aj_fld = null;
		} else {
			if (null != this.ac_fld) {
				System.arraycopy(this.ac_fld, 1 + var1, this.ac_fld, var1, this.at_fld - var1);
			}

			if (null != this.aj_fld) {
				System.arraycopy(this.aj_fld, var1 + 1, this.aj_fld, var1, this.at_fld - var1);
			}
		}
	}

	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "(Lik;IB)I"
	)
	public static int dk(ik var0, int var1, byte var2) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var2 != 126 && var2 != 162182662) {
			if (var1 != var0.ab_fld || var0.ap_fld != -1 && var0.aq_fld[-461820507 * var0.ap_fld] >= 125) {
				if (var0.aq_fld[var1] == var2) {
					return -1;
				} else {
					var0.aq_fld[var1] = var2;
					var0.as((byte)-112);
					return var1;
				}
			} else {
				return -1;
			}
		} else {
			return -1;
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
					this.as((byte)-4);
					return var1;
				}
			} else {
				return -1;
			}
		} else {
			return -1;
		}
	}

	@ObfuscatedName("getMembers")
	@ObfuscatedSignature(
		descriptor = "()Ljava/util/List;"
	)
	@Export("getMembers")
	@Override
	public List getMembers() {
		int var1 = this.fh();
		ArrayList var2 = new ArrayList(var1);

		for (int var3 = 0; var3 < var1; var3++) {
			var2.add(new rl1(this, var3));
		}

		return var2;
	}

	@ObfuscatedName("hm")
	@ObfuscatedSignature(
		descriptor = "(Lik;JLjava/lang/String;)V"
	)
	public static void hm(ik var0, long var1, String var3) {
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
			if (var1 > 0L && (var0.ac_fld == null || var0.at_fld >= var0.ac_fld.length) || var3 != null && (null == var0.aj_fld || var0.at_fld >= var0.aj_fld.length)) {
				var0.ag(var0.at_fld + 5, (short)25238);
			}

			if (null != var0.ac_fld) {
				var0.ac_fld[-1394227434 * var0.at_fld] = var1;
			}

			if (null != var0.aj_fld) {
				var0.aj_fld[var0.at_fld] = var3;
			}

			var0.at_fld += 1617117504;
		}
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
				if (var1 > 0L && (this.ac_fld == null || this.at_fld >= this.ac_fld.length) || var3 != null && (null == this.aj_fld || this.at_fld >= this.aj_fld.length)) {
					this.ag(this.at_fld + 5, (short)25238);
				}

				if (null != this.ac_fld) {
					this.ac_fld[this.at_fld] = var1;
				}

				if (null != this.aj_fld) {
					this.aj_fld[this.at_fld] = var3;
				}

				this.at_fld++;
			}
		}
	}

	@ObfuscatedName("ln")
	@ObfuscatedSignature(
		descriptor = "(Lik;IIII)Z"
	)
	public static boolean ln(ik var0, int var1, int var2, int var3, int var4) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			int var5 = (1 << var3) - 1;
			int var6 = 31 == var4 ? -1 : (1 << 1 + var4) - 1;
			int var7 = var6 ^ var5;
			var2 <<= var3;
			var2 &= var7;
			if (var0.bd_fld != null) {
				vw var8 = var0.bd_fld.ak(var1);
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

					var8.gy();
				}
			} else {
				var0.bd_fld = new xv(4);
			}

			var0.bd_fld.ag(new vl(var2), var1);
			return true;
		}
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)I"
	)
	public int ba(String var1) {
		if (var1 != null && !var1.isEmpty()) {
			var1 = var1.toLowerCase();
			String[] var2 = this.fg();
			int[] var3 = this.vx();
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

	@ObfuscatedName("zt")
	@ObfuscatedSignature(
		descriptor = "(III)I"
	)
	public int zt(int var1, int var2, int var3) {
		Integer var4 = this.xb(var1);
		int var5 = var4 == null ? -1 : var4;
		int var6 = 31 - var3;
		return var5 << var6 >>> var2 + var6;
	}

	@ObfuscatedName("eq")
	@ObfuscatedSignature(
		descriptor = "(Lik;)V"
	)
	public static void eq(ik var0) {
		if (var0.aa_fld == 0) {
			var0.ab_fld = -1726119035;
			var0.ap_fld = -763707165;
		} else {
			var0.ab_fld = -1726119035;
			var0.ap_fld = -849305695;
			int var1 = 0;
			byte var2 = var0.aq_fld[0];

			for (int var3 = 1; var3 < var0.aa_fld; var3++) {
				if (var0.aq_fld[var3] > var2) {
					if (var2 == -510697477) {
						var0.ap_fld = var1 * 1676655059;
					}

					var1 = var3;
					var2 = var0.aq_fld[var3];
				} else if (var0.ap_fld == -1 && 125 == var0.aq_fld[var3]) {
					var0.ap_fld = -1315318260 * var3;
				}
			}

			var0.ab_fld = -1632046449 * var1;
			if (-1 != var0.ab_fld) {
				var0.aq_fld[var0.ab_fld * -819085709] = 126;
			}
		}
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

				var4.gy();
			}
		} else {
			this.bd_fld = new xv(4);
		}

		this.bd_fld.ag(new vk(var2), var1);
		return true;
	}

	@ObfuscatedName("titleForRank")
	@ObfuscatedSignature(
		descriptor = "(Lnet/runelite/api/clan/ClanRank;)Lnet/runelite/api/clan/ClanTitle;"
	)
	@Export("titleForRank")
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
						var2 = this.zt(1, 0, 9);
						break;
					case 10:
						var2 = this.zt(1, 10, 19);
						break;
					case 20:
						var2 = this.zt(1, 20, 29);
						break;
					case 30:
						var2 = this.zt(2, 0, 9);
						break;
					case 40:
						var2 = this.zt(2, 10, 19);
						break;
					case 50:
						var2 = this.zt(2, 20, 29);
						break;
					case 60:
						var2 = this.zt(3, 0, 9);
						break;
					case 70:
						var2 = this.zt(3, 10, 19);
						break;
					case 80:
						var2 = this.zt(3, 20, 29);
						break;
					case 90:
						var2 = this.zt(4, 0, 9);
						break;
					case 95:
						var2 = this.zt(5, 20, 29);
						break;
					case 96:
						var2 = this.zt(102, 0, 9);
						break;
					case 97:
						var2 = this.zt(102, 10, 19);
						break;
					case 98:
						var2 = this.zt(102, 20, 29);
						break;
					case 99:
						var2 = this.zt(103, 0, 9);
						break;
					case 100:
						var2 = -2;
						break;
					case 101:
						var2 = this.zt(103, 10, 19);
						break;
					case 102:
						var2 = this.zt(103, 20, 29);
						break;
					case 103:
						var2 = this.zt(104, 0, 9);
						break;
					case 104:
						var2 = this.zt(104, 10, 19);
						break;
					case 105:
						var2 = this.zt(4, 10, 19);
						break;
					case 110:
						var2 = this.zt(4, 20, 29);
						break;
					case 115:
						var2 = this.zt(5, 0, 9);
						break;
					case 120:
						var2 = this.zt(5, 10, 19);
						break;
					case 124:
						var2 = this.zt(104, 20, 29);
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
					os var3 = og.ci_fld.ru(3797);
					String var4 = var3.getStringValue(var2);
					return !var4.isEmpty() ? new ClanTitle(var2, var4) : null;
				}
			}
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("no")
	@ObfuscatedSignature(
		descriptor = "(Lik;IIIIB)Z"
	)
	public static boolean no(ik var0, int var1, int var2, int var3, int var4, byte var5) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			int var6 = (1 << var3) - 1;
			int var7 = 31 == var4 ? -1 : (1 << 1 + var4) - 1;
			int var8 = var7 ^ var6;
			var2 <<= var3;
			var2 &= var8;
			if (var0.bd_fld != null) {
				vw var9 = var0.bd_fld.ak(var1);
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

					var9.gy();
				}
			} else {
				var0.bd_fld = new xv(4);
			}

			var0.bd_fld.ag(new vl(var2), var1);
			return true;
		}
	}

	@ObfuscatedName("il")
	@ObfuscatedSignature(
		descriptor = "(Lqf;)[Ljava/lang/String;"
	)
	public static String[] il(qf var0) throws IOException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			return null;
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("un")
	@ObfuscatedSignature(
		descriptor = "(Lik;II)Z"
	)
	public static boolean un(ik var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else if (var0.ab_fld != var1 && 126 != var0.aq_fld[var1]) {
			var0.aq_fld[var0.ab_fld] = 125;
			var0.ap_fld = var0.ab_fld * -632081095;
			var0.aq_fld[var1] = 126;
			var0.ab_fld = var1;
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(Lik;IB)V"
	)
	public static void bt(ik var0, int var1, byte var2) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var0.bz_fld) {
			if (var0.ai_fld != null) {
				System.arraycopy(var0.ai_fld, 0, var0.ai_fld = new long[var1], 0, var0.aa_fld);
			} else {
				var0.ai_fld = new long[var1];
			}
		}

		if (var0.br_fld) {
			if (var2 <= 14) {
				return;
			}

			if (var0.bm_fld != null) {
				System.arraycopy(var0.bm_fld, 0, var0.bm_fld = new String[var1], 0, var0.aa_fld);
			} else {
				var0.bm_fld = new String[var1];
			}
		}

		if (var0.aq_fld != null) {
			System.arraycopy(var0.aq_fld, 0, var0.aq_fld = new byte[var1], 0, var0.aa_fld);
		} else {
			var0.aq_fld = new byte[var1];
		}

		if (null != var0.am_fld) {
			System.arraycopy(var0.am_fld, 0, var0.am_fld = new int[var1], 0, var0.aa_fld);
		} else {
			var0.am_fld = new int[var1];
		}

		if (null != var0.ad_fld) {
			if (var2 <= 14) {
				return;
			}

			System.arraycopy(var0.ad_fld, 0, var0.ad_fld = new int[var1], 0, var0.aa_fld);
		} else {
			var0.ad_fld = new int[var1];
		}

		if (null != var0.ao_fld) {
			System.arraycopy(var0.ao_fld, 0, var0.ao_fld = new boolean[var1], 0, var0.aa_fld);
		} else {
			var0.ao_fld = new boolean[var1];
		}
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(IIII)I"
	)
	int bq(int var1, int var2, int var3, int var4) {
		int var5 = (1 << var3) - 1;
		int var6 = 1480549735 == var4 ? -1 : (1 << var4 + 1) - 1;
		int var7 = var6 ^ var5;
		var2 <<= var3;
		var2 &= var7;
		int var8 = this.am_fld[var1];
		if (var2 == (var8 & var7)) {
			return -1;
		} else {
			var8 &= ~var7;
			this.am_fld[var1] = var8 | var2;
			return var1;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	boolean au(int var1, int var2) {
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

				var3.gy();
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

				var4.gy();
			}
		} else {
			this.bd_fld = new xv(4);
		}

		this.bd_fld.ag(new vk(var2), var1);
		return true;
	}

	@ObfuscatedName("fd")
	@ObfuscatedSignature(
		descriptor = "(Lik;Lxi;)V"
	)
	public static void fd(ik var0, xi var1) {
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
				var0.bm_fld = null;
				var0.aj_fld = null;
			}

			var0.ay_fld = var1.co((byte)1);
			var0.ar_fld = var1.co((byte)-64);
			if (var2 <= 3 && var0.ar_fld * 746416822 != 0) {
				var0.ar_fld += -544244135;
			}

			var0.aa_fld = var1.cm();
			var0.at_fld = var1.cg();
			var0.as_fld = xi.at(var1, -1414769746);
			if (var2 >= 4) {
				var1.co((byte)-41);
			}

			var0.af_fld = var1.cg() == 1;
			var0.al_fld = var1.cw();
			var0.au_fld = var1.cw();
			var0.ax_fld = var1.cw();
			var0.an_fld = var1.cw();
			if (-2036308430 * var0.aa_fld > 0) {
				if (var0.bz_fld && (null == var0.ai_fld || var0.ai_fld.length < var0.aa_fld)) {
					var0.ai_fld = new long[360325867 * var0.aa_fld];
				}

				if (var0.br_fld && (null == var0.bm_fld || var0.bm_fld.length < var0.aa_fld)) {
					var0.bm_fld = new String[var0.aa_fld * -1612848339];
				}

				if (var0.aq_fld == null || var0.aq_fld.length < var0.aa_fld) {
					var0.aq_fld = new byte[var0.aa_fld];
				}

				if (var0.am_fld == null || var0.am_fld.length < var0.aa_fld) {
					var0.am_fld = new int[var0.aa_fld];
				}

				if (var0.ad_fld == null || var0.ad_fld.length < var0.aa_fld) {
					var0.ad_fld = new int[var0.aa_fld * -1572279746];
				}

				if (var0.ao_fld == null || var0.ao_fld.length < var0.aa_fld) {
					var0.ao_fld = new boolean[var0.aa_fld];
				}

				for (int var4 = 0; var4 < var0.aa_fld; var4++) {
					if (var0.bz_fld) {
						var0.ai_fld[var4] = var1.cu();
					}

					if (var0.br_fld) {
						var0.bm_fld[var4] = var1.cl();
					}

					var0.aq_fld[var4] = var1.cw();
					if (var2 >= 2) {
						var0.am_fld[var4] = var1.co((byte)-84);
					}

					if (var2 >= 5) {
						var0.ad_fld[var4] = var1.cm();
					} else {
						var0.ad_fld[var4] = 0;
					}

					if (var2 >= 6) {
						var0.ao_fld[var4] = var1.cg() == 1;
					} else {
						var0.ao_fld[var4] = false;
					}
				}

				var0.as((byte)-126);
			}

			if (-1533996123 * var0.at_fld > 0) {
				if (var0.bz_fld && (null == var0.ac_fld || var0.ac_fld.length < var0.at_fld)) {
					var0.ac_fld = new long[var0.at_fld];
				}

				if (var0.br_fld && (var0.aj_fld == null || var0.aj_fld.length < var0.at_fld)) {
					var0.aj_fld = new String[var0.at_fld];
				}

				for (int var10 = 0; var10 < var0.at_fld; var10++) {
					if (var0.bz_fld) {
						var0.ac_fld[var10] = var1.cu();
					}

					if (var0.br_fld) {
						var0.aj_fld[var10] = var1.cl();
					}
				}
			}

			if (var2 >= 3) {
				int var11 = var1.cm();
				if (var11 > 0) {
					var0.bd_fld = new xv(var11 < 16 ? wp.ay(var11) : 16);

					while (var11-- > 0) {
						int var5 = var1.co((byte)-50);
						int var6 = var5 & 1073741823;
						int var7 = var5 >>> 30;
						if (var7 == 0) {
							int var8 = var1.co((byte)-20);
							var0.bd_fld.ag(new vl(var8), var6);
						} else if (var7 == 1) {
							long var12 = var1.cu();
							var0.bd_fld.ag(new vk(var12), var6);
						} else if (var7 == 2) {
							String var13 = xi.at(var1, 629946333);
							var0.bd_fld.ag(new uj(var13), var6);
						}
					}
				}
			}
		} else {
			throw new RuntimeException("" + var2);
		}
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean bw(int var1) {
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

	@ObfuscatedName("mp")
	@ObfuscatedSignature(
		descriptor = "()[B"
	)
	public byte[] mp() {
		return this.aq_fld;
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(IB)I"
	)
	int bu(int var1, byte var2) {
		if (var2 != 126 && var2 != 127) {
			if (var1 != this.ab_fld || this.ap_fld != -1 && this.aq_fld[-479302040 * this.ap_fld] >= -130971722) {
				if (this.aq_fld[var1] == var2) {
					return -1;
				} else {
					this.aq_fld[var1] = var2;
					this.as((byte)-99);
					return var1;
				}
			} else {
				return -1;
			}
		} else {
			return -1;
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
				this.bm_fld = null;
				this.aj_fld = null;
			}

			this.ay_fld = var1.co((byte)-55);
			this.ar_fld = var1.co((byte)-25);
			if (var2 <= 3 && this.ar_fld != 0) {
				this.ar_fld += 16912800;
			}

			this.aa_fld = var1.cm();
			this.at_fld = var1.cg();
			this.as_fld = xi.at(var1, -1141317205);
			if (var2 >= 4) {
				var1.co((byte)-29);
			}

			this.af_fld = var1.cg() == 1;
			this.al_fld = var1.cw();
			this.au_fld = var1.cw();
			this.ax_fld = var1.cw();
			this.an_fld = var1.cw();
			if (this.aa_fld > 0) {
				if (this.bz_fld && (null == this.ai_fld || this.ai_fld.length < this.aa_fld)) {
					this.ai_fld = new long[this.aa_fld];
				}

				if (this.br_fld && (null == this.bm_fld || this.bm_fld.length < this.aa_fld)) {
					this.bm_fld = new String[this.aa_fld];
				}

				if (this.aq_fld == null || this.aq_fld.length < this.aa_fld) {
					this.aq_fld = new byte[this.aa_fld];
				}

				if (this.am_fld == null || this.am_fld.length < this.aa_fld) {
					this.am_fld = new int[this.aa_fld];
				}

				if (this.ad_fld == null || this.ad_fld.length < this.aa_fld) {
					this.ad_fld = new int[this.aa_fld];
				}

				if (this.ao_fld == null || this.ao_fld.length < this.aa_fld) {
					this.ao_fld = new boolean[this.aa_fld];
				}

				for (int var4 = 0; var4 < this.aa_fld; var4++) {
					if (this.bz_fld) {
						this.ai_fld[var4] = var1.cu();
					}

					if (this.br_fld) {
						this.bm_fld[var4] = var1.cl();
					}

					this.aq_fld[var4] = var1.cw();
					if (var2 >= 2) {
						this.am_fld[var4] = var1.co((byte)-74);
					}

					if (var2 >= 5) {
						this.ad_fld[var4] = var1.cm();
					} else {
						this.ad_fld[var4] = 0;
					}

					if (var2 >= 6) {
						this.ao_fld[var4] = var1.cg() == 1;
					} else {
						this.ao_fld[var4] = false;
					}
				}

				this.as((byte)-84);
			}

			if (this.at_fld > 0) {
				if (this.bz_fld && (null == this.ac_fld || this.ac_fld.length < this.at_fld)) {
					this.ac_fld = new long[this.at_fld];
				}

				if (this.br_fld && (this.aj_fld == null || this.aj_fld.length < this.at_fld)) {
					this.aj_fld = new String[this.at_fld];
				}

				for (int var10 = 0; var10 < this.at_fld; var10++) {
					if (this.bz_fld) {
						this.ac_fld[var10] = var1.cu();
					}

					if (this.br_fld) {
						this.aj_fld[var10] = var1.cl();
					}
				}
			}

			if (var2 >= 3) {
				int var11 = var1.cm();
				if (var11 > 0) {
					this.bd_fld = new xv(var11 < 16 ? wp.ay(var11) : 16);

					while (var11-- > 0) {
						int var5 = var1.co((byte)-109);
						int var6 = var5 & 1073741823;
						int var7 = var5 >>> 30;
						if (var7 == 0) {
							int var8 = var1.co((byte)-37);
							this.bd_fld.ag(new vl(var8), var6);
						} else if (var7 == 1) {
							long var12 = var1.cu();
							this.bd_fld.ag(new vk(var12), var6);
						} else if (var7 == 2) {
							String var13 = xi.at(var1, -2077668849);
							this.bd_fld.ag(new uj(var13), var6);
						}
					}
				}
			}
		} else {
			throw new RuntimeException("" + var2);
		}
	}

	@ObfuscatedName("vi")
	@ObfuscatedSignature(
		descriptor = "(Lik;IJ)Z"
	)
	public static boolean vi(ik var0, int var1, long var2) {
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

				var4.gy();
			}
		} else {
			var0.bd_fld = new xv(4);
		}

		var0.bd_fld.ag(new vk(var2), var1);
		return true;
	}

	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		descriptor = "(Lik;II)Z"
	)
	public static boolean ht(ik var0, int var1, int var2) {
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

				var3.gy();
			}
		} else {
			var0.bd_fld = new xv(4);
		}

		var0.bd_fld.ag(new vl(var2), var1);
		return true;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	void as(byte var1) {
		if (this.aa_fld == 0) {
			this.ab_fld = -1726119035;
			this.ap_fld = 434885021;
		} else {
			this.ab_fld = -1726119035;
			this.ap_fld = 434885021;
			int var2 = 0;
			byte var3 = this.aq_fld[0];

			for (int var4 = 1; var4 < this.aa_fld; var4++) {
				if (this.aq_fld[var4] > var3) {
					if (var3 == 125) {
						this.ap_fld = var2;
					}

					var2 = var4;
					var3 = this.aq_fld[var4];
				} else if (this.ap_fld == -1 && 125 == this.aq_fld[var4]) {
					this.ap_fld = var4;
				}
			}

			this.ab_fld = var2;
			if (-1 != this.ab_fld) {
				this.aq_fld[this.ab_fld] = 126;
			}
		}
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(ILba;ZB)I"
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
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = cn.mt(cx.kq_fld, 193623381);
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

	@ObfuscatedName("hp")
	@ObfuscatedSignature(
		descriptor = "(Lik;JLjava/lang/String;IB)V"
	)
	public static void hp(ik var0, long var1, String var3, int var4, byte var5) {
		if (var0 == null) {
			var0.getClass();
		}

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

					if (null != var0.bm_fld) {
						if (var5 == 1) {
							return;
						}

						if (var0.aa_fld < var0.bm_fld.length) {
							break label99;
						}
					}
				}

				bt(var0, 5 + var0.aa_fld, (byte)45);
			}

			if (null != var0.ai_fld) {
				var0.ai_fld[var0.aa_fld] = var1;
			}

			if (null != var0.bm_fld) {
				var0.bm_fld[var0.aa_fld] = var3;
			}

			if (var0.ab_fld == -1) {
				var0.ab_fld = var0.aa_fld * -1629763489;
				var0.aq_fld[var0.aa_fld] = 126;
			} else {
				var0.aq_fld[var0.aa_fld] = 0;
			}

			var0.am_fld[var0.aa_fld] = 0;
			var0.ad_fld[var0.aa_fld] = var4;
			var0.ao_fld[var0.aa_fld] = false;
			var0.aa_fld++;
			var0.be_fld = null;
		}
	}

	@ObfuscatedName("eo")
	@ObfuscatedSignature(
		descriptor = "(Ldx;I)V"
	)
	static final void eo(dx var0, int var1) throws EOFException {
		try {
			for (cs var2 = (cs)var0.ai_fld.aw(); null != var2; var2 = (cs)na.iy(var0.ai_fld)) {
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

						boolean var3 = oe.iv(var6, var5, (byte)87);
						if (!var3) {
							continue;
						}
					}

					ek.ec(var0, var2.ag_fld, var2.az_fld, var2.av_fld, var2.ae_fld, var2.ah_fld, var2.aw_fld, var2.ay_fld, var2.al_fld);
					var2.gy();
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

									boolean var8 = oe.iv(var11, var10, (byte)71);
									if (!var8) {
										continue;
									}
								}

								ek.ec(var0, var2.ag_fld, var2.az_fld, var2.av_fld, var2.ae_fld, var2.as_fld, var2.ar_fld, var2.af_fld, var2.al_fld);
								var2.au_fld = 327858427;
								if (var2.ah_fld == var2.as_fld && var2.ah_fld == -1) {
									var2.gy();
								} else if (var2.ah_fld == var2.as_fld && var2.aw_fld == var2.ar_fld && var2.af_fld == var2.ay_fld) {
									if (var1 <= -1414960560) {
										return;
									}

									var2.gy();
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

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)I"
	)
	public int aj(String var1) {
		if (null != var1 && !var1.isEmpty()) {
			for (int var2 = 0; var2 < this.aa_fld; var2++) {
				if (this.bm_fld[var2].equals(var1)) {
					return var2;
				}
			}

			return -1;
		} else {
			return -1;
		}
	}

	@ObfuscatedName("xb")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/Integer;"
	)
	public Integer xb(int var1) {
		return this.ae(var1, 26770159);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(JLjava/lang/String;IB)V"
	)
	void aw(long var1, String var3, int var4, byte var5) {
		if (var3 != null && var3.isEmpty()) {
			var3 = null;
		}

		if (var1 > 0L != this.bz_fld) {
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

						if (null == this.ac_fld) {
							break label105;
						}

						if (var5 == 1) {
							return;
						}

						if (this.ay_fld >= this.ai_fld.length) {
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

						if (this.ap_fld < this.bm_fld.length) {
							break label96;
						}
					}
				}

				bt(this, 5 + this.ap_fld, (byte)45);
			}

			if (null != this.ac_fld) {
				this.ai_fld[94361709 * this.at_fld] = var1;
			}

			if (null != this.bm_fld) {
				this.aj_fld[94361709 * this.ap_fld] = var3;
			}

			if (this.ay_fld == -1) {
				this.at_fld *= 1339714337;
				this.aq_fld[this.at_fld * 94361709] = 126;
			} else {
				this.aq_fld[this.aa_fld] = 0;
			}

			this.am_fld[this.ab_fld * 94361709] = 0;
			this.ad_fld[94361709 * this.at_fld] = var4;
			this.ao_fld[94361709 * this.ap_fld] = false;
			this.aa_fld++;
			this.be_fld = null;
		}
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
			vw var9 = this.bd_fld.ah(var1);
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

				var9.pz_void();
			}
		} else {
			this.bd_fld = new xv(4);
		}

		this.bd_fld.as(new vl(var2), var1);
		return true;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IBI)I"
	)
	int al(int var1, byte var2, int var3) {
		if (var2 != 126 && var2 != 127) {
			if (var1 != this.ap_fld || this.ap_fld != -1 && this.aq_fld[-1551121589 * this.at_fld] >= 125) {
				if (this.aq_fld[var1] == var2) {
					return -1;
				} else {
					this.aq_fld[var1] = var2;
					this.as((byte)-39);
					return var1;
				}
			} else {
				return -1;
			}
		} else {
			return -1;
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

	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "(Lik;IIIII)I"
	)
	public static int de(ik var0, int var1, int var2, int var3, int var4) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			int var6 = (1 << var3) - 1;
			int var7 = 31 == var4 ? -1 : (1 << var4 + 1) - 1;
			int var8 = var7 ^ var6;
			var2 <<= var3;
			var2 &= var8;
			int var9 = var0.am_fld[var1];
			if (var2 == (var9 & var8)) {
				return -1;
			} else {
				var9 &= ~var8;
				var0.am_fld[var1] = var9 | var2;
				return var1;
			}
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
		int var9 = this.am_fld[var1];
		if (var2 == (var9 & var8)) {
			return -1;
		} else {
			var9 &= ~var8;
			this.be_fld[var1] = var9 | var2;
			return var1;
		}
	}

	@ObfuscatedName("findMember")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)Lnet/runelite/api/clan/ClanMember;"
	)
	@Export("findMember")
	@Override
	public ClanMember findMember(String var1) {
		int var2 = this.ba(var1.replace(' ', ' '));
		return var2 == -1 ? null : new rl1(this, var2);
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(IJ)Z"
	)
	boolean cy(int var1, long var2) {
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

				var4.gw();
			}
		} else {
			this.bd_fld = new xv(4);
		}

		this.bd_fld.ar(new vk(var2), var1);
		return true;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IB)V"
	)
	void ak(int var1, byte var2) {
		if (this.bz_fld) {
			if (this.ai_fld != null) {
				System.arraycopy(this.ac_fld, 0, this.ai_fld = new long[var1], 0, this.ap_fld * 94361709);
			} else {
				this.ac_fld = new long[var1];
			}
		}

		if (this.bz_fld) {
			if (var2 <= 14) {
				return;
			}

			if (this.bm_fld != null) {
				System.arraycopy(this.bm_fld, 0, this.bm_fld = new String[var1], 0, this.aa_fld);
			} else {
				this.bm_fld = new String[var1];
			}
		}

		if (this.aq_fld != null) {
			System.arraycopy(this.aq_fld, 0, this.aq_fld = new byte[var1], 0, 94361709 * this.ay_fld);
		} else {
			this.aq_fld = new byte[var1];
		}

		if (null != this.am_fld) {
			System.arraycopy(this.am_fld, 0, this.be_fld = new int[var1], 0, 94361709 * this.ap_fld);
		} else {
			this.am_fld = new int[var1];
		}

		if (null != this.ad_fld) {
			if (var2 <= 14) {
				return;
			}

			System.arraycopy(this.ad_fld, 0, this.ad_fld = new int[var1], 0, 94361709 * this.ab_fld);
		} else {
			this.ad_fld = new int[var1];
		}

		if (null != this.ao_fld) {
			System.arraycopy(this.ao_fld, 0, this.ao_fld = new boolean[var1], 0, this.aa_fld);
		} else {
			this.ao_fld = new boolean[var1];
		}
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
			vw var8 = this.bd_fld.aw(var1);
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

				var8.jy();
			}
		} else {
			this.bd_fld = new xv(4);
		}

		this.bd_fld.ar(new vl(var2), var1);
		return true;
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	boolean bg(int var1, int var2) {
		if (this.ap_fld != var1 && 126 != this.aq_fld[var1]) {
			this.aq_fld[this.at_fld * -1998716237] = 125;
			this.aa_fld *= 1438433605;
			this.aq_fld[var1] = 126;
			this.ap_fld = var1 * 1726119035;
			return true;
		} else {
			return false;
		}
	}
}
