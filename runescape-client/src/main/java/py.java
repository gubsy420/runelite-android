import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.BitSet;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("py")
public class py extends vc {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -492463803
	)
	public int ao_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ag_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int az_fld;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	public int[] ac_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	public static iw as_fld = new iw(64);
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	public static iw ar_fld = new iw(64);
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	public static iw af_fld = new iw(20);
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1273821273
	)
	public int at_fld;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1225901295
	)
	public int ax_fld;
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 571623579
	)
	int bm_fld = -1130388883;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1255026773
	)
	int al_fld;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1396400847
	)
	int an_fld;
	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "Lgc;"
	)
	static gc cm_fld;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 122840839
	)
	public int am_fld;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1259331595
	)
	public int ap_fld;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 172044127
	)
	public int au_fld;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1156935717
	)
	int aq_fld;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	String ab_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ak_fld;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 747110811
	)
	public int ad_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int av_fld;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1318562349
	)
	int aa_fld;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 68507975
	)
	int ai_fld;
	@ObfuscatedName("il")
	@ObfuscatedSignature(
		descriptor = "Luv;"
	)
	static uv il_fld;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -17608701
	)
	int aj_fld;

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/io/File;Ljava/io/File;I)V"
	)
	static void ag(File var0, File var1) throws FileNotFoundException, EOFException {
		try {
			try {
				zb var3 = new zb(dm.ai_fld, "rw", 10000L);
				xi var4 = new xi(500);
				var4.ea(3);
				var4.ea(var1 != null ? 1 : 0);
				var4.cv(var0.getPath());
				if (null != var1) {
					var4.cv(var1.getPath());
				}

				var3.az(var4.al_fld, 0, var4.au_fld);
				var3.av();
			} catch (IOException var5) {
				var5.printStackTrace();
			}
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	void ag(xi var1) {
		while (true) {
			int var3 = var1.cg();
			if (var3 == 0) {
				return;
			}

			this.az(var1, var3, 2037625803);
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lxi;II)V"
	)
	void az(xi var1, int var2, int var3) {
		if (1 == var2) {
			if (var3 <= 1490175866) {
				return;
			}

			this.bm_fld = xi.kt(var1, (byte)-46);
		} else if (var2 == 2) {
			this.at_fld = xi.lx(var1, 654068338);
		} else if (var2 == 3) {
			this.al_fld = xi.kt(var1, (byte)-30);
		} else if (var2 == 4) {
			if (var3 <= 1490175866) {
				return;
			}

			this.aq_fld = xi.kt(var1, (byte)-52);
		} else if (5 == var2) {
			if (var3 <= 1490175866) {
				return;
			}

			this.an_fld = xi.kt(var1, (byte)-32);
		} else if (var2 == 6) {
			this.aj_fld = xi.kt(var1, (byte)-81);
		} else if (var2 == 7) {
			this.ap_fld = var1.cz();
		} else if (var2 == 8) {
			this.ab_fld = var1.ct();
		} else if (var2 == 9) {
			this.ao_fld = var1.cm();
		} else if (10 == var2) {
			if (var3 <= 1490175866) {
				return;
			}

			this.am_fld = var1.cz();
		} else if (11 == var2) {
			this.au_fld = 0;
		} else if (var2 == 12) {
			this.ax_fld = var1.cg();
		} else if (13 == var2) {
			this.ad_fld = var1.cz();
		} else if (14 == var2) {
			this.au_fld = var1.cm();
		} else if (var2 == 17 || var2 == 18) {
			this.aa_fld = var1.cm();
			if (this.aa_fld == 65535) {
				if (var3 <= 1490175866) {
					return;
				}

				this.aa_fld = 795593307;
			}

			this.ai_fld = var1.cm();
			if (65535 == this.ai_fld) {
				this.ai_fld = 552566665;
			}

			int var4 = -1;
			if (var2 == 18) {
				if (var3 <= 1490175866) {
					return;
				}

				var4 = var1.cm();
				if (65535 == var4) {
					if (var3 <= 1490175866) {
						return;
					}

					var4 = -1;
				}
			}

			int var5 = var1.cg();
			this.ac_fld = new int[2 + var5];

			for (int var6 = 0; var6 <= var5; var6++) {
				this.ac_fld[var6] = var1.cm();
				if (this.ac_fld[var6] == 65535) {
					this.ac_fld[var6] = -1;
				}
			}

			this.ac_fld[1 + var5] = var4;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ILba;ZB)I"
	)
	static int aj(int var0, ba var1, boolean var2) throws EOFException {
		try {
			if (1927 != var0 && var0 != 2927) {
				if (var0 == 1928) {
					lu var13 = var2 ? gs.ap_fld : bp.ab_fld;
					int var16 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
					if (var16 >= 1 && var16 <= 10) {
						dg var18 = new dg(var16, var13.bf_fld, var13.by_fld, var13.ga_fld);
						bp.bz_fld.add(var18);
						return 1;
					} else {
						throw new RuntimeException();
					}
				} else if (var0 == 2928) {
					gz.ax_fld -= 3;
					int var12 = bp.au_fld[gz.ax_fld];
					int var15 = bp.au_fld[1 + gz.ax_fld];
					int var17 = bp.au_fld[gz.ax_fld + 2];
					if (var17 >= 1 && var17 <= 10) {
						lu var19 = cf.cg_fld.ag(var12, var15);
						if (var19 == null) {
							throw new RuntimeException();
						} else {
							dg var21 = new dg(var17, var12, var15, var19.ga_fld);
							bp.bz_fld.add(var21);
							return 1;
						}
					} else {
						throw new RuntimeException();
					}
				} else if (2929 == var0) {
					Object[] var11 = (Object[])ni.bm();
					gz.ax_fld -= 3;
					int var14 = bp.au_fld[gz.ax_fld];
					int var6 = bp.au_fld[gz.ax_fld + 1];
					int var7 = bp.au_fld[gz.ax_fld + 2];
					byte var8 = -1;
					lu var9 = cf.cg_fld.ag(var6, var7);
					if (var9 != null) {
						int var20 = var9.ga_fld;
						fp.fh(var6, var7, var20, var14, (Object[])var11, (byte)-42);
						return 1;
					} else {
						throw new RuntimeException();
					}
				} else {
					return 2;
				}
			} else if (bp.br_fld >= 10) {
				throw new RuntimeException();
			} else {
				lu var4;
				if (var0 >= 2000) {
					var4 = cf.cg_fld.ak(bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127]);
				} else {
					var4 = var2 ? gs.ap_fld : bp.ab_fld;
				}

				if (var4.gr_fld == null) {
					return 0;
				} else {
					yz var5 = yb.vn(yb.ls(tu.ak(var4).av((Object[])var4.gr_fld, 1167212557), bp.br_fld + 1), -1287662004);
					client.cz_fld.ak(var5);
					return 1;
				}
			}
		} catch (Throwable var10) {
			throw new RuntimeException(var10);
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;"
	)
	public String ae(int var1) {
		String var3 = this.ab_fld;

		while (true) {
			int var4 = var3.indexOf("%1");
			if (var4 < 0) {
				return var3;
			}

			var3 = var3.substring(0, var4) + is.ay(var1, false) + var3.substring(var4 + 2);
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	void an(xi var1, int var2) {
		if (1 == var2) {
			this.bm_fld = xi.kt(var1, (byte)-115);
		} else if (var2 == 2) {
			this.at_fld = xi.lx(var1, 1768080071) * -277425255;
		} else if (var2 == 3) {
			this.al_fld = xi.kt(var1, (byte)-75) * 1591321020;
		} else if (var2 == 4) {
			this.aq_fld = xi.kt(var1, (byte)-58);
		} else if (5 == var2) {
			this.an_fld = xi.kt(var1, (byte)-43) * -1504425165;
		} else if (var2 == 6) {
			this.aj_fld = xi.kt(var1, (byte)-96) * -1181496278;
		} else if (var2 == 7) {
			this.ap_fld = var1.cz();
		} else if (var2 == 8) {
			this.ab_fld = var1.ct();
		} else if (var2 == 9) {
			this.ao_fld = var1.cm() * -322618900;
		} else if (10 == var2) {
			this.am_fld = var1.cz();
		} else if (11 == var2) {
			this.au_fld = 0;
		} else if (var2 == 12) {
			this.ax_fld = var1.cg();
		} else if (13 == var2) {
			this.ad_fld = var1.cz();
		} else if (14 == var2) {
			this.au_fld = var1.cm() * 772773672;
		} else if (var2 == 17 || var2 == 18) {
			this.aa_fld = var1.cm() * -290185299;
			if (this.aa_fld == 65535) {
				this.aa_fld = -1810281361;
			}

			this.ai_fld = var1.cm();
			if (-681208024 == this.ai_fld) {
				this.ai_fld = 552566665;
			}

			int var3 = -1;
			if (var2 == 18) {
				var3 = var1.cm();
				if (65535 == var3) {
					var3 = -1;
				}
			}

			int var4 = var1.cg();
			this.ac_fld = new int[2 + var4];

			for (int var5 = 0; var5 <= var4; var5++) {
				this.ac_fld[var5] = var1.cm();
				if (this.ac_fld[var5] == 65535) {
					this.ac_fld[var5] = -1;
				}
			}

			this.ac_fld[1 + var4] = var3;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)Lpy;"
	)
	public final py av() {
		try {
			int var2 = -1;
			if (this.aa_fld != -1) {
				var2 = dv.ag(this.aa_fld, (byte)118);
			} else if (this.ai_fld != -1) {
				var2 = rt.ag_fld[this.ai_fld];
			}

			int var3;
			if (var2 >= 0 && var2 < this.ac_fld.length - 1) {
				var3 = this.ac_fld[var2];
			} else {
				var3 = this.ac_fld[this.ac_fld.length - 1];
			}

			return var3 != -1 ? gf.ak(var3) : null;
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("ne")
	@ObfuscatedSignature(
		descriptor = "(Lpy;Lxi;)V"
	)
	public static void ne(py var0, xi var1) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			while (true) {
				int var2 = var1.cg();
				if (var2 == 0) {
					return;
				}

				var0.az(var1, var2, 1841330659);
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(Lpy;Lxi;)V"
	)
	public static void bb(py var0, xi var1) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			while (true) {
				int var2 = var1.cg();
				if (var2 == 0) {
					return;
				}

				var0.az(var1, var2, 1593369587);
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Lyv;"
	)
	public yv aw() {
		try {
			if (this.aj_fld < 0) {
				return null;
			} else {
				yv var2 = (yv)ar_fld.ak(this.aj_fld);
				if (var2 != null) {
					return var2;
				} else {
					var2 = wf.av(od.aw_fld, this.aj_fld, 0);
					if (null != var2) {
						ar_fld.az(var2, this.aj_fld);
					}

					return var2;
				}
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)Lzf;"
	)
	public zf ar() {
		try {
			if (this.bm_fld == -1) {
				return null;
			} else {
				zf var2 = (zf)af_fld.ak(this.bm_fld);
				if (var2 != null) {
					return var2;
				} else {
					var2 = dv.ae(od.aw_fld, ap.ay_fld, this.bm_fld, 0);
					if (null != var2) {
						af_fld.az(var2, this.bm_fld);
					}

					return var2;
				}
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Lpy;"
	)
	public static py af(int var0) throws EOFException {
		try {
			py var1 = (py)as_fld.ak(var0);
			if (var1 != null) {
				return var1;
			} else {
				byte[] var2 = ex.ah_fld.bb(32, var0, 584982574);
				var1 = new py();
				if (var2 != null) {
					var1.ag(new xi(var2));
				}

				as_fld.az(var1, var0);
				return var1;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	void ax(xi var1, int var2) {
		if (1 == var2) {
			this.bm_fld = xi.kt(var1, (byte)-84);
		} else if (var2 == 2) {
			this.at_fld = xi.lx(var1, -1770374319);
		} else if (var2 == 3) {
			this.al_fld = xi.kt(var1, (byte)-120);
		} else if (var2 == 4) {
			this.aq_fld = xi.kt(var1, (byte)-60);
		} else if (5 == var2) {
			this.an_fld = xi.kt(var1, (byte)-34);
		} else if (var2 == 6) {
			this.aj_fld = xi.kt(var1, (byte)-110);
		} else if (var2 == 7) {
			this.ap_fld = var1.cz();
		} else if (var2 == 8) {
			this.ab_fld = var1.ct();
		} else if (var2 == 9) {
			this.ao_fld = var1.cm();
		} else if (10 == var2) {
			this.am_fld = var1.cz();
		} else if (11 == var2) {
			this.au_fld = 0;
		} else if (var2 == 12) {
			this.ax_fld = var1.cg();
		} else if (13 == var2) {
			this.ad_fld = var1.cz();
		} else if (14 == var2) {
			this.au_fld = var1.cm();
		} else if (var2 == 17 || var2 == 18) {
			this.aa_fld = var1.cm();
			if (this.aa_fld == 65535) {
				this.aa_fld = 795593307;
			}

			this.ai_fld = var1.cm();
			if (65535 == this.ai_fld) {
				this.ai_fld = 552566665;
			}

			int var3 = -1;
			if (var2 == 18) {
				var3 = var1.cm();
				if (65535 == var3) {
					var3 = -1;
				}
			}

			int var4 = var1.cg();
			this.ac_fld = new int[2 + var4];

			for (int var5 = 0; var5 <= var4; var5++) {
				this.ac_fld[var5] = var1.cm();
				if (this.ac_fld[var5] == 65535) {
					this.ac_fld[var5] = -1;
				}
			}

			this.ac_fld[1 + var4] = var3;
		}
	}

	py() {
		this.at_fld = -861065193;
		this.ao_fld = 1293601934;
		this.al_fld = 425544957;
		this.an_fld = -2105514961;
		this.aq_fld = -553047123;
		this.aj_fld = -2065554091;
		this.ap_fld = 0;
		this.am_fld = 0;
		this.au_fld = 1121391457;
		this.ab_fld = "";
		this.ax_fld = -1128131087;
		this.ad_fld = 0;
		this.aa_fld = 795593307;
		this.ai_fld = 552566665;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	void aa(xi var1, int var2) {
		if (1 == var2) {
			this.bm_fld = xi.kt(var1, (byte)-88);
		} else if (var2 == 2) {
			this.at_fld = xi.lx(var1, 1119354509);
		} else if (var2 == 3) {
			this.al_fld = xi.kt(var1, (byte)-86) * -1631711648;
		} else if (var2 == 4) {
			this.aq_fld = xi.kt(var1, (byte)-33);
		} else if (5 == var2) {
			this.an_fld = xi.kt(var1, (byte)-87);
		} else if (var2 == 6) {
			this.aj_fld = xi.kt(var1, (byte)-93);
		} else if (var2 == 7) {
			this.ap_fld = var1.cz();
		} else if (var2 == 8) {
			this.ab_fld = var1.ct();
		} else if (var2 == 9) {
			this.ao_fld = var1.cm() * 166318364;
		} else if (10 == var2) {
			this.am_fld = var1.cz() * -1577008053;
		} else if (11 == var2) {
			this.au_fld = 0;
		} else if (var2 == 12) {
			this.ax_fld = var1.cg();
		} else if (13 == var2) {
			this.ad_fld = var1.cz() * 1494284715;
		} else if (14 == var2) {
			this.au_fld = var1.cm() * -380502503;
		} else if (var2 == 17 || var2 == 18) {
			this.aa_fld = var1.cm();
			if (this.aa_fld == 65535) {
				this.aa_fld = 1547320583;
			}

			this.ai_fld = var1.cm() * 1804788914;
			if (-729092498 == this.ai_fld) {
				this.ai_fld = 552566665;
			}

			int var3 = -1;
			if (var2 == 18) {
				var3 = var1.cm();
				if (1946101731 == var3) {
					var3 = -1;
				}
			}

			int var4 = var1.cg();
			this.ac_fld = new int[2 + var4];

			for (int var5 = 0; var5 <= var4; var5++) {
				this.ac_fld[var5] = var1.cm();
				if (this.ac_fld[var5] == -175826493) {
					this.ac_fld[var5] = -1;
				}
			}

			this.ac_fld[1 + var4] = var3;
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "()Lpy;"
	)
	public final py ai() {
		try {
			int var1 = -1;
			if (this.aa_fld != -1) {
				var1 = dv.ag(this.aa_fld, (byte)122);
			} else if (this.ai_fld != -1) {
				var1 = rt.ag_fld[this.ai_fld];
			}

			int var2;
			if (var1 >= 0 && var1 < this.ac_fld.length - 1) {
				var2 = this.ac_fld[var1];
			} else {
				var2 = this.ac_fld[this.ac_fld.length - 1];
			}

			return var2 != -1 ? gf.ak(var2) : null;
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;"
	)
	public String am(int var1) {
		String var2 = this.ab_fld;

		while (true) {
			int var3 = var2.indexOf("%1");
			if (var3 < 0) {
				return var2;
			}

			var2 = var2.substring(0, var3) + is.ay(var1, false) + var2.substring(var3 + 2);
		}
	}

	@ObfuscatedName("tf")
	@ObfuscatedSignature(
		descriptor = "()Lpy;"
	)
	public py tf() {
		try {
			return this.av();
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "()Lyv;"
	)
	public yv ad() {
		try {
			if (this.al_fld < 0) {
				return null;
			} else {
				yv var1 = (yv)ar_fld.ak(this.al_fld);
				if (null != var1) {
					return var1;
				} else {
					var1 = wf.av(od.aw_fld, this.al_fld, 0);
					if (null != var1) {
						ar_fld.az(var1, this.al_fld);
					}

					return var1;
				}
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "()Lyv;"
	)
	public yv at() {
		try {
			if (this.aq_fld * 872289565 < 0) {
				return null;
			} else {
				yv var1 = (yv)ar_fld.ak(2139865897 * this.aq_fld);
				if (var1 != null) {
					return var1;
				} else {
					var1 = wf.av(od.aw_fld, this.aq_fld * -421030088, 0);
					if (null != var1) {
						ar_fld.az(var1, this.aq_fld);
					}

					return var1;
				}
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "()Lyv;"
	)
	public yv bm() {
		try {
			if (this.aq_fld < 0) {
				return null;
			} else {
				yv var1 = (yv)ar_fld.ak(this.aq_fld);
				if (var1 != null) {
					return var1;
				} else {
					var1 = wf.av(od.aw_fld, this.aq_fld, 0);
					if (null != var1) {
						ar_fld.az(var1, this.aq_fld);
					}

					return var1;
				}
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "()Lyv;"
	)
	public yv ap() {
		try {
			if (this.an_fld < 0) {
				return null;
			} else {
				yv var1 = (yv)ar_fld.ak(this.an_fld);
				if (null != var1) {
					return var1;
				} else {
					var1 = wf.av(od.aw_fld, this.an_fld, 0);
					if (null != var1) {
						ar_fld.az(var1, this.an_fld);
					}

					return var1;
				}
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "()Lyv;"
	)
	public yv ac() {
		try {
			if (this.aq_fld < 0) {
				return null;
			} else {
				yv var1 = (yv)ar_fld.ak(this.aq_fld);
				if (var1 != null) {
					return var1;
				} else {
					var1 = wf.av(od.aw_fld, this.aq_fld, 0);
					if (null != var1) {
						ar_fld.az(var1, this.aq_fld);
					}

					return var1;
				}
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Lyv;"
	)
	public yv as() {
		try {
			if (this.al_fld < 0) {
				return null;
			} else {
				yv var2 = (yv)ar_fld.ak(this.al_fld);
				if (null != var2) {
					return var2;
				} else {
					var2 = wf.av(od.aw_fld, this.al_fld, 0);
					if (null != var2) {
						ar_fld.az(var2, this.al_fld);
					}

					return var2;
				}
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "()Lyv;"
	)
	public yv ao() {
		try {
			if (this.al_fld * 962053241 < 0) {
				return null;
			} else {
				yv var1 = (yv)ar_fld.ak(this.al_fld);
				if (null != var1) {
					return var1;
				} else {
					var1 = wf.av(od.aw_fld, this.al_fld * -1257505310, 0);
					if (null != var1) {
						ar_fld.az(var1, -333262963 * this.al_fld);
					}

					return var1;
				}
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("jz")
	@ObfuscatedSignature(
		descriptor = "(Lpy;)Lyv;"
	)
	public static yv jz(py var0) throws EOFException {
		try {
			if (var0.an_fld * 1226319937 < 0) {
				return null;
			} else {
				yv var1 = (yv)ar_fld.ak(var0.an_fld * -1256911283);
				if (null != var1) {
					return var1;
				} else {
					var1 = wf.av(od.aw_fld, var0.an_fld, 0);
					if (null != var1) {
						ar_fld.az(var1, var0.an_fld);
					}

					return var1;
				}
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("vg")
	@ObfuscatedSignature(
		descriptor = "(Lpy;)Lpy;"
	)
	public static py vg(py var0) throws EOFException {
		try {
			if (var0 == null) {
				throw new NullPointerException();
			} else {
				int var1 = -1;
				if (var0.aa_fld != -1) {
					var1 = dv.ag(var0.aa_fld, (byte)102);
				} else if (var0.ai_fld != -1) {
					var1 = rt.ag_fld[var0.ai_fld * 418476766];
				}

				int var2;
				if (var1 >= 0 && var1 < var0.ac_fld.length - 1) {
					var2 = var0.ac_fld[var1];
				} else {
					var2 = var0.ac_fld[var0.ac_fld.length - 1];
				}

				return var2 != -1 ? gf.ak(var2) : null;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("pm")
	@ObfuscatedSignature(
		descriptor = "(I)Lpy;"
	)
	public static py pm(int var0) throws EOFException {
		try {
			return gf.ak(var0);
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "()Lyv;"
	)
	public yv bd() {
		try {
			if (this.aj_fld < 0) {
				return null;
			} else {
				yv var1 = (yv)ar_fld.ak(this.aj_fld);
				if (var1 != null) {
					return var1;
				} else {
					var1 = wf.av(od.aw_fld, this.aj_fld, 0);
					if (null != var1) {
						ar_fld.az(var1, this.aj_fld);
					}

					return var1;
				}
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("yl")
	@ObfuscatedSignature(
		descriptor = "(Lpy;B)Lyv;"
	)
	public static yv yl(py var0, byte var1) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			if (var0.aq_fld < 0) {
				return null;
			} else {
				yv var2 = (yv)ar_fld.ak(var0.aq_fld);
				if (var2 != null) {
					return var2;
				} else {
					var2 = wf.av(od.aw_fld, var0.aq_fld, 0);
					if (null != var2) {
						ar_fld.az(var2, var0.aq_fld);
					}

					return var2;
				}
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Lyv;"
	)
	public yv ah() {
		try {
			if (this.an_fld < 0) {
				return null;
			} else {
				yv var2 = (yv)ar_fld.ak(this.an_fld);
				if (null != var2) {
					return var2;
				} else {
					var2 = wf.av(od.aw_fld, this.an_fld, 0);
					if (null != var2) {
						ar_fld.az(var2, this.an_fld);
					}

					return var2;
				}
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("tv")
	@ObfuscatedSignature(
		descriptor = "(Lev;Ljava/util/BitSet;IIII)Z"
	)
	public static boolean tv(ev var0, BitSet var1, int var2, int var3, int var4, int var5) {
		if (var0 == null) {
			var0.getClass();
		}

		return var1.get(var2 * var0.br_fld + var3 * var0.be_fld + var4 * var0.bs_fld + var5);
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "()Lyv;"
	)
	public yv bz() {
		try {
			if (this.aj_fld < 0) {
				return null;
			} else {
				yv var1 = (yv)ar_fld.ak(this.aj_fld * -231118495);
				if (var1 != null) {
					return var1;
				} else {
					var1 = wf.av(od.aw_fld, this.aj_fld, 0);
					if (null != var1) {
						ar_fld.az(var1, this.aj_fld);
					}

					return var1;
				}
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "()Lyv;"
	)
	public yv aj() {
		try {
			if (this.aq_fld * 1273056519 < 0) {
				return null;
			} else {
				yv var1 = (yv)ar_fld.ak(this.aq_fld);
				if (var1 != null) {
					return var1;
				} else {
					var1 = wf.av(od.aw_fld, this.aq_fld * -415278609, 0);
					if (null != var1) {
						ar_fld.az(var1, this.aq_fld * 176944838);
					}

					return var1;
				}
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)Lyv;"
	)
	public yv ay(byte var1) {
		try {
			if (this.al_fld * -1156935717 < 0) {
				return null;
			} else {
				yv var2 = (yv)ar_fld.ak(-1156935717 * this.aj_fld);
				if (var2 != null) {
					return var2;
				} else {
					var2 = wf.av(od.aw_fld, this.aj_fld * -1156935717, 0);
					if (null != var2) {
						af_fld.at(var2, this.al_fld * -1156935717);
					}

					return var2;
				}
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}
}
