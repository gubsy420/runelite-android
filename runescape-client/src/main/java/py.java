import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("py")
public class py extends vc {
	@ObfuscatedGetter(
		intValue = -492463803
	)
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ax_fld;
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
	@ObfuscatedGetter(
		intValue = 1273821273
	)
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int au_fld;
	@ObfuscatedGetter(
		intValue = 1225901295
	)
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ap_fld;
	@ObfuscatedGetter(
		intValue = 571623579
	)
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int al_fld = -1130388883;
	@ObfuscatedGetter(
		intValue = -1255026773
	)
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int an_fld;
	@ObfuscatedGetter(
		intValue = -1396400847
	)
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int aa_fld;
	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "Lgc;"
	)
	static gc cm_fld;
	@ObfuscatedGetter(
		intValue = 122840839
	)
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ad_fld;
	@ObfuscatedGetter(
		intValue = 1259331595
	)
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int am_fld;
	@ObfuscatedGetter(
		intValue = 172044127
	)
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ao_fld;
	@ObfuscatedGetter(
		intValue = -1156935717
	)
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ai_fld;
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
	@ObfuscatedGetter(
		intValue = 747110811
	)
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int at_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int av_fld;
	@ObfuscatedGetter(
		intValue = 1318562349
	)
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int aj_fld;
	@ObfuscatedGetter(
		intValue = 68507975
	)
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int bm_fld;
	@ObfuscatedName("il")
	@ObfuscatedSignature(
		descriptor = "Luv;"
	)
	static uv il_fld;
	@ObfuscatedGetter(
		intValue = -17608701
	)
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int aq_fld;

	@ObfuscatedName("fv")
	@ObfuscatedSignature(
		descriptor = "(Lpy;)Lyv;"
	)
	public static yv fv(py var0) throws EOFException {
		try {
			if (var0 == null) {
				throw new NullPointerException();
			} else if (var0.aq_fld < 0) {
				return null;
			} else {
				yv var1 = (yv)ar_fld.ak(var0.aq_fld);
				if (var1 != null) {
					return var1;
				} else {
					var1 = wf.av(od.aw_fld, var0.aq_fld, 0);
					if (null != var1) {
						ar_fld.az(var1, var0.aq_fld);
					}

					return var1;
				}
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/io/File;Ljava/io/File;)V"
	)
	static void ag(File var0, File var1) throws FileNotFoundException, EOFException {
		try {
			try {
				zb var3 = new zb(dm.ai_fld, "rw", 10000L);
				xi var4 = new xi(500);
				var4.bc(3);
				var4.bc(var1 != null ? 1 : 0);
				xi.vs(var4, var0.getPath(), (byte)-112);
				if (null != var1) {
					xi.vs(var4, var1.getPath(), (byte)-59);
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
		descriptor = "(Lxi;)V"
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

			this.al_fld = var1.do_();
		} else if (var2 == 2) {
			this.au_fld = var1.ck();
		} else if (var2 == 3) {
			this.an_fld = var1.do_();
		} else if (var2 == 4) {
			if (var3 <= 1490175866) {
				return;
			}

			this.ai_fld = var1.do_();
		} else if (5 == var2) {
			if (var3 <= 1490175866) {
				return;
			}

			this.aa_fld = var1.do_();
		} else if (var2 == 6) {
			this.aq_fld = var1.do_();
		} else if (var2 == 7) {
			this.am_fld = var1.cz();
		} else if (var2 == 8) {
			this.ab_fld = var1.cl();
		} else if (var2 == 9) {
			this.ax_fld = xi.tx(var1, 958041008);
		} else if (10 == var2) {
			if (var3 <= 1490175866) {
				return;
			}

			this.ad_fld = var1.cz();
		} else if (11 == var2) {
			this.ao_fld = 0;
		} else if (var2 == 12) {
			this.ap_fld = var1.cg();
		} else if (13 == var2) {
			this.at_fld = var1.cz();
		} else if (14 == var2) {
			this.ao_fld = xi.tx(var1, 2034606017);
		} else if (var2 == 17 || var2 == 18) {
			this.aj_fld = xi.tx(var1, 1732536844);
			if (this.aj_fld == 65535) {
				if (var3 <= 1490175866) {
					return;
				}

				this.aj_fld = 795593307;
			}

			this.bm_fld = xi.tx(var1, 641309217);
			if (65535 == this.bm_fld) {
				this.bm_fld = 552566665;
			}

			int var4 = -1;
			if (var2 == 18) {
				if (var3 <= 1490175866) {
					return;
				}

				var4 = xi.tx(var1, 1273206839);
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
				this.ac_fld[var6] = xi.tx(var1, 1760219764);
				if (this.ac_fld[var6] == 65535) {
					this.ac_fld[var6] = -1;
				}
			}

			this.ac_fld[1 + var5] = var4;
		}
	}

	@ObfuscatedName("in")
	@ObfuscatedSignature(
		descriptor = "(Lms;)V"
	)
	public static void in(ms var0) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ar_fld = null;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ILba;Z)I"
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
						lu var19 = cf.cg_fld.ag(var12, var15, -1970021379);
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
					lu var9 = cf.cg_fld.ag(var6, var7, -263836393);
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
					yz var5 = yb.jc(tu.ak(var4).av((Object[])var4.gr_fld, 1167212557), bp.br_fld + 1).ax(-1287662004);
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
		descriptor = "(I)Ljava/lang/String;"
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
			this.al_fld = var1.do_();
		} else if (var2 == 2) {
			this.au_fld = var1.ck() * -277425255;
		} else if (var2 == 3) {
			this.an_fld = var1.do_() * 1591321020;
		} else if (var2 == 4) {
			this.ai_fld = var1.do_();
		} else if (5 == var2) {
			this.aa_fld = var1.do_() * -1504425165;
		} else if (var2 == 6) {
			this.aq_fld = var1.do_() * -1181496278;
		} else if (var2 == 7) {
			this.am_fld = var1.cz();
		} else if (var2 == 8) {
			this.ab_fld = var1.cl();
		} else if (var2 == 9) {
			this.ax_fld = xi.tx(var1, 2045688247) * -322618900;
		} else if (10 == var2) {
			this.ad_fld = var1.cz();
		} else if (11 == var2) {
			this.ao_fld = 0;
		} else if (var2 == 12) {
			this.ap_fld = var1.cg();
		} else if (13 == var2) {
			this.at_fld = var1.cz();
		} else if (14 == var2) {
			this.ao_fld = xi.tx(var1, 1158728800) * 772773672;
		} else if (var2 == 17 || var2 == 18) {
			this.aj_fld = xi.tx(var1, 1087279957) * -290185299;
			if (this.aj_fld == 65535) {
				this.aj_fld = -1810281361;
			}

			this.bm_fld = xi.tx(var1, 1180989453);
			if (-681208024 == this.bm_fld) {
				this.bm_fld = 552566665;
			}

			int var3 = -1;
			if (var2 == 18) {
				var3 = xi.tx(var1, 1426740980);
				if (65535 == var3) {
					var3 = -1;
				}
			}

			int var4 = var1.cg();
			this.ac_fld = new int[2 + var4];

			for (int var5 = 0; var5 <= var4; var5++) {
				this.ac_fld[var5] = xi.tx(var1, 1938552757);
				if (this.ac_fld[var5] == 65535) {
					this.ac_fld[var5] = -1;
				}
			}

			this.ac_fld[1 + var4] = var3;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()Lyv;"
	)
	public yv ay() {
		try {
			if (this.ai_fld < 0) {
				return null;
			} else {
				yv var2 = (yv)ar_fld.ak(this.ai_fld);
				if (var2 != null) {
					return var2;
				} else {
					var2 = wf.av(od.aw_fld, this.ai_fld, 0);
					if (null != var2) {
						ar_fld.az(var2, this.ai_fld);
					}

					return var2;
				}
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()Lyv;"
	)
	public yv as() {
		try {
			if (this.aq_fld < 0) {
				return null;
			} else {
				yv var2 = (yv)ar_fld.ak(this.aq_fld);
				if (var2 != null) {
					return var2;
				} else {
					var2 = wf.av(od.aw_fld, this.aq_fld, 0);
					if (null != var2) {
						ar_fld.az(var2, this.aq_fld);
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
		descriptor = "()Lzf;"
	)
	public zf ar() {
		try {
			if (this.al_fld == -1) {
				return null;
			} else {
				zf var2 = (zf)af_fld.ak(this.al_fld);
				if (var2 != null) {
					return var2;
				} else {
					var2 = dv.ae(od.aw_fld, ap.ay_fld, this.al_fld, 0);
					if (null != var2) {
						af_fld.az(var2, this.al_fld);
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

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	void al(xi var1) {
		while (true) {
			int var2 = var1.cg();
			if (var2 == 0) {
				return;
			}

			this.az(var1, var2, 1841330659);
		}
	}

	@ObfuscatedName("vl")
	@ObfuscatedSignature(
		descriptor = "(Lpy;Lxi;)V"
	)
	public static void vl(py var0, xi var1) throws EOFException {
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

	py() {
		this.au_fld = -861065193;
		this.ax_fld = 1293601934;
		this.an_fld = 425544957;
		this.aa_fld = -2105514961;
		this.ai_fld = -553047123;
		this.aq_fld = -2065554091;
		this.am_fld = 0;
		this.ad_fld = 0;
		this.ao_fld = 1121391457;
		this.ab_fld = "";
		this.ap_fld = -1128131087;
		this.at_fld = 0;
		this.aj_fld = 795593307;
		this.bm_fld = 552566665;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	void aa(xi var1, int var2) {
		if (1 == var2) {
			this.al_fld = var1.do_();
		} else if (var2 == 2) {
			this.au_fld = var1.ck();
		} else if (var2 == 3) {
			this.an_fld = var1.do_() * -1631711648;
		} else if (var2 == 4) {
			this.ai_fld = var1.do_();
		} else if (5 == var2) {
			this.aa_fld = var1.do_();
		} else if (var2 == 6) {
			this.aq_fld = var1.do_();
		} else if (var2 == 7) {
			this.am_fld = var1.cz();
		} else if (var2 == 8) {
			this.ab_fld = var1.cl();
		} else if (var2 == 9) {
			this.ax_fld = xi.tx(var1, 2002352344) * 166318364;
		} else if (10 == var2) {
			this.ad_fld = var1.cz() * -1577008053;
		} else if (11 == var2) {
			this.ao_fld = 0;
		} else if (var2 == 12) {
			this.ap_fld = var1.cg();
		} else if (13 == var2) {
			this.at_fld = var1.cz() * 1494284715;
		} else if (14 == var2) {
			this.ao_fld = xi.tx(var1, 438046148) * -380502503;
		} else if (var2 == 17 || var2 == 18) {
			this.aj_fld = xi.tx(var1, 1061336323);
			if (this.aj_fld == 65535) {
				this.aj_fld = 1547320583;
			}

			this.bm_fld = xi.tx(var1, 855127968) * 1804788914;
			if (-729092498 == this.bm_fld) {
				this.bm_fld = 552566665;
			}

			int var3 = -1;
			if (var2 == 18) {
				var3 = xi.tx(var1, 1661019547);
				if (1946101731 == var3) {
					var3 = -1;
				}
			}

			int var4 = var1.cg();
			this.ac_fld = new int[2 + var4];

			for (int var5 = 0; var5 <= var4; var5++) {
				this.ac_fld[var5] = xi.tx(var1, 1047236657);
				if (this.ac_fld[var5] == -175826493) {
					this.ac_fld[var5] = -1;
				}
			}

			this.ac_fld[1 + var4] = var3;
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "()Lpy;"
	)
	public final py aq() {
		try {
			int var1 = -1;
			if (this.aj_fld != -1) {
				var1 = dv.ag(this.aj_fld, (byte)122);
			} else if (this.bm_fld != -1) {
				var1 = rt.ag_fld[this.bm_fld];
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

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "()Lpy;"
	)
	public final py ai() {
		try {
			int var1 = -1;
			if (this.aj_fld != -1) {
				var1 = dv.ag(this.aj_fld, (byte)102);
			} else if (this.bm_fld != -1) {
				var1 = rt.ag_fld[this.bm_fld * 418476766];
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

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "()Lyv;"
	)
	public yv at() {
		try {
			if (this.ai_fld * 872289565 < 0) {
				return null;
			} else {
				yv var1 = (yv)ar_fld.ak(2139865897 * this.ai_fld);
				if (var1 != null) {
					return var1;
				} else {
					var1 = wf.av(od.aw_fld, this.ai_fld * -421030088, 0);
					if (null != var1) {
						ar_fld.az(var1, this.ai_fld);
					}

					return var1;
				}
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "()Lyv;"
	)
	public yv ab() {
		try {
			if (this.aa_fld * 1226319937 < 0) {
				return null;
			} else {
				yv var1 = (yv)ar_fld.ak(this.aa_fld * -1256911283);
				if (null != var1) {
					return var1;
				} else {
					var1 = wf.av(od.aw_fld, this.aa_fld, 0);
					if (null != var1) {
						ar_fld.az(var1, this.aa_fld);
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
			if (this.ai_fld < 0) {
				return null;
			} else {
				yv var1 = (yv)ar_fld.ak(this.ai_fld);
				if (var1 != null) {
					return var1;
				} else {
					var1 = wf.av(od.aw_fld, this.ai_fld, 0);
					if (null != var1) {
						ar_fld.az(var1, this.ai_fld);
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
			if (this.aa_fld < 0) {
				return null;
			} else {
				yv var1 = (yv)ar_fld.ak(this.aa_fld);
				if (null != var1) {
					return var1;
				} else {
					var1 = wf.av(od.aw_fld, this.aa_fld, 0);
					if (null != var1) {
						ar_fld.az(var1, this.aa_fld);
					}

					return var1;
				}
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("yy")
	@ObfuscatedSignature(
		descriptor = "(I)Lpy;"
	)
	public static py yy(int var0) throws EOFException {
		try {
			return gf.ak(var0);
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "()Lyv;"
	)
	public yv ac() {
		try {
			if (this.ai_fld < 0) {
				return null;
			} else {
				yv var1 = (yv)ar_fld.ak(this.ai_fld);
				if (var1 != null) {
					return var1;
				} else {
					var1 = wf.av(od.aw_fld, this.ai_fld, 0);
					if (null != var1) {
						ar_fld.az(var1, this.ai_fld);
					}

					return var1;
				}
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("sz")
	@ObfuscatedSignature(
		descriptor = "(Lpy;Lxi;I)V"
	)
	public static void sz(py var0, xi var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		} else {
			if (1 == var2) {
				var0.al_fld = var1.do_();
			} else if (var2 == 2) {
				var0.au_fld = var1.ck();
			} else if (var2 == 3) {
				var0.an_fld = var1.do_();
			} else if (var2 == 4) {
				var0.ai_fld = var1.do_();
			} else if (5 == var2) {
				var0.aa_fld = var1.do_();
			} else if (var2 == 6) {
				var0.aq_fld = var1.do_();
			} else if (var2 == 7) {
				var0.am_fld = var1.cz();
			} else if (var2 == 8) {
				var0.ab_fld = var1.cl();
			} else if (var2 == 9) {
				var0.ax_fld = xi.tx(var1, 1670761932);
			} else if (10 == var2) {
				var0.ad_fld = var1.cz();
			} else if (11 == var2) {
				var0.ao_fld = 0;
			} else if (var2 == 12) {
				var0.ap_fld = var1.cg();
			} else if (13 == var2) {
				var0.at_fld = var1.cz();
			} else if (14 == var2) {
				var0.ao_fld = xi.tx(var1, 1316437932);
			} else if (var2 == 17 || var2 == 18) {
				var0.aj_fld = xi.tx(var1, 1030528272);
				if (var0.aj_fld == 65535) {
					var0.aj_fld = 795593307;
				}

				var0.bm_fld = xi.tx(var1, 1027529434);
				if (65535 == var0.bm_fld) {
					var0.bm_fld = 552566665;
				}

				int var3 = -1;
				if (var2 == 18) {
					var3 = xi.tx(var1, 1680007367);
					if (65535 == var3) {
						var3 = -1;
					}
				}

				int var4 = var1.cg();
				var0.ac_fld = new int[2 + var4];

				for (int var5 = 0; var5 <= var4; var5++) {
					var0.ac_fld[var5] = xi.tx(var1, 2114590385);
					if (var0.ac_fld[var5] == 65535) {
						var0.ac_fld[var5] = -1;
					}
				}

				var0.ac_fld[1 + var4] = var3;
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "()Lyv;"
	)
	public yv ao() {
		try {
			if (this.an_fld * 962053241 < 0) {
				return null;
			} else {
				yv var1 = (yv)ar_fld.ak(this.an_fld);
				if (null != var1) {
					return var1;
				} else {
					var1 = wf.av(od.aw_fld, this.an_fld * -1257505310, 0);
					if (null != var1) {
						ar_fld.az(var1, -333262963 * this.an_fld);
					}

					return var1;
				}
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("te")
	@ObfuscatedSignature(
		descriptor = "()Lpy;"
	)
	public py te() {
		try {
			return cj(this, (byte)119);
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "()Lyv;"
	)
	public yv aw() {
		try {
			if (this.aa_fld < 0) {
				return null;
			} else {
				yv var2 = (yv)ar_fld.ak(this.aa_fld);
				if (null != var2) {
					return var2;
				} else {
					var2 = wf.av(od.aw_fld, this.aa_fld, 0);
					if (null != var2) {
						ar_fld.az(var2, this.aa_fld);
					}

					return var2;
				}
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(Lpy;B)Lpy;"
	)
	public static py cj(py var0, byte var1) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			int var2 = -1;
			if (var0.aj_fld != -1) {
				var2 = dv.ag(var0.aj_fld, (byte)118);
			} else if (var0.bm_fld != -1) {
				var2 = rt.ag_fld[var0.bm_fld];
			}

			int var3;
			if (var2 >= 0 && var2 < var0.ac_fld.length - 1) {
				var3 = var0.ac_fld[var2];
			} else {
				var3 = var0.ac_fld[var0.ac_fld.length - 1];
			}

			return var3 != -1 ? gf.ak(var3) : null;
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("ib")
	@ObfuscatedSignature(
		descriptor = "(Lpy;I)Lyv;"
	)
	public static yv ib(py var0, int var1) throws EOFException {
		try {
			if (var0 == null) {
				throw new NullPointerException();
			} else if (var0.an_fld < 0) {
				return null;
			} else {
				yv var2 = (yv)ar_fld.ak(var0.an_fld);
				if (null != var2) {
					return var2;
				} else {
					var2 = wf.av(od.aw_fld, var0.an_fld, 0);
					if (null != var2) {
						ar_fld.az(var2, var0.an_fld);
					}

					return var2;
				}
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "()Lyv;"
	)
	public yv bz() {
		try {
			if (this.aq_fld < 0) {
				return null;
			} else {
				yv var1 = (yv)ar_fld.ak(this.aq_fld * -231118495);
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

	@ObfuscatedName("fo")
	@ObfuscatedSignature(
		descriptor = "(Lpy;)Lyv;"
	)
	public static yv fo(py var0) throws EOFException {
		try {
			if (var0.an_fld < 0) {
				return null;
			} else {
				yv var1 = (yv)ar_fld.ak(var0.an_fld);
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

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "()Lyv;"
	)
	public yv aj() {
		try {
			if (this.ai_fld * 1273056519 < 0) {
				return null;
			} else {
				yv var1 = (yv)ar_fld.ak(this.ai_fld);
				if (var1 != null) {
					return var1;
				} else {
					var1 = wf.av(od.aw_fld, this.ai_fld * -415278609, 0);
					if (null != var1) {
						ar_fld.az(var1, this.ai_fld * 176944838);
					}

					return var1;
				}
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)Lpy;"
	)
	public final py av(byte var1) {
		try {
			int var2 = -1;
			if (this.bm_fld != -1) {
				var2 = dv.ag(1318562349 * this.al_fld, (byte)118);
			} else if (this.al_fld != -1) {
				var2 = rt.ag_fld[this.ai_fld * 68507975];
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

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	void ax(xi var1, int var2) {
		if (1 == var2) {
			this.aj_fld = var1.do_() * 1130388883;
		} else if (var2 == 2) {
			this.at_fld = var1.dt() * 475189225;
		} else if (var2 == 3) {
			this.aa_fld = var1.co() * -425544957;
		} else if (var2 == 4) {
			this.aj_fld = var1.cg() * 553047123;
		} else if (5 == var2) {
			this.aq_fld = var1.cg() * 2105514961;
		} else if (var2 == 6) {
			this.aj_fld = var1.do_() * 2065554091;
		} else if (var2 == 7) {
			this.ad_fld = var1.df() * -203969629;
		} else if (var2 == 8) {
			this.ab_fld = var1.ch();
		} else if (var2 == 9) {
			this.ap_fld = xi.tx(var1, 1670761932) * 1920536973;
		} else if (10 == var2) {
			this.ao_fld = var1.kc(1156269875) * 61101751;
		} else if (11 == var2) {
			this.ax_fld = 0;
		} else if (var2 == 12) {
			this.ap_fld = var1.co();
		} else if (13 == var2) {
			this.ao_fld = var1.eg() * -1990165357;
		} else if (14 == var2) {
			this.ap_fld = xi.tx(var1, 1316437932) * -1121391457;
		} else if (var2 == 17 || var2 == 18) {
			this.aa_fld = xi.tx(var1, 1030528272) * -795593307;
			if (this.ai_fld == 65535) {
				this.aq_fld = 795593307;
			}

			this.an_fld = xi.tx(var1, 1027529434) * -552566665;
			if (65535 == this.al_fld) {
				this.ai_fld = 552566665;
			}

			int var3 = -1;
			if (var2 == 18) {
				var3 = xi.tx(var1, 1680007367);
				if (65535 == var3) {
					var3 = -1;
				}
			}

			int var4 = var1.ec();
			this.ac_fld = new int[2 + var4];

			for (int var5 = 0; var5 <= var4; var5++) {
				this.ac_fld[var5] = xi.tx(var1, 2114590385);
				if (this.ac_fld[var5] == 65535) {
					this.ac_fld[var5] = -1;
				}
			}

			this.ac_fld[1 + var4] = var3;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Lyv;"
	)
	public yv ah(int var1) {
		try {
			if (this.aa_fld * -1255026773 < 0) {
				return null;
			} else {
				yv var2 = (yv)ar_fld.de(this.aq_fld * -1255026773);
				if (null != var2) {
					return var2;
				} else {
					var2 = wf.av(od.aw_fld, this.bm_fld * -1255026773, 0);
					if (null != var2) {
						as_fld.nk(var2, -1255026773 * this.aa_fld);
					}

					return var2;
				}
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "()Lyv;"
	)
	public yv bd() {
		try {
			if (this.aa_fld < 0) {
				return null;
			} else {
				yv var1 = (yv)ar_fld.aw(this.al_fld * -1396400847);
				if (null != var1) {
					return var1;
				} else {
					var1 = wf.av(od.aw_fld, -1396400847 * this.aq_fld, 0);
					if (null != var1) {
						af_fld.al(var1, -1396400847 * this.ai_fld);
					}

					return var1;
				}
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}
}
