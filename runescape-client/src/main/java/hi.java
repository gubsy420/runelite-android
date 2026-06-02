import java.io.EOFException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("hi")
public abstract class hi {
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "[[[B"
	)
	byte[][][] aa_fld;
	@ObfuscatedGetter(
		intValue = -556413785
	)
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ah_fld;
	@ObfuscatedGetter(
		intValue = 1244832073
	)
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int aw_fld;
	@ObfuscatedGetter(
		intValue = -22879427
	)
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ay_fld;
	@ObfuscatedGetter(
		intValue = 1331421739
	)
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int as_fld;
	@ObfuscatedGetter(
		intValue = -507523821
	)
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ar_fld;
	@ObfuscatedGetter(
		intValue = -719467311
	)
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int au_fld;
	@ObfuscatedGetter(
		intValue = -556413785
	)
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int al_fld = -2109938455;
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bm_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[[[S"
	)
	short[][][] ae_fld;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "[[[B"
	)
	byte[][][] an_fld;
	@ObfuscatedGetter(
		intValue = -507523821
	)
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int af_fld;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "[[[[Lge;"
	)
	ge[][][][] ai_fld;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "[[[S"
	)
	short[][][] ax_fld;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean aq_fld;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bz_fld;
	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		descriptor = "Luv;"
	)
	static uv hl_fld;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean am_fld;
	@ObfuscatedName("ni")
	@ObfuscatedSignature(
		descriptor = "Leu;"
	)
	static eu ni_fld;
	@ObfuscatedGetter(
		intValue = -1915116695
	)
	@ObfuscatedName("iz")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int iz_fld;
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bp_fld;

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int by() {
		return this.as_fld;
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	void bp(xi var1) {
		if (var1 != null) {
			this.az(var1, -559781011);
			this.aq_fld = true;
			this.am_fld = true;
		}
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(IILxi;I)V"
	)
	void bq(int var1, int var2, xi var3, int var4) {
		int var5 = 1 + ((var4 & 24) >> 3);
		boolean var6 = 0 != (var4 & 2);
		boolean var7 = (var4 & 4) != 0;
		this.ae_fld[0][var1][var2] = (short)xi.tx(var3, 1778577903);
		if (var6) {
			int var8 = var3.cg();

			for (int var9 = 0; var9 < var8; var9++) {
				int var10 = xi.tx(var3, 2009504174);
				if (var10 != 0) {
					this.ax_fld[var9][var1][var2] = (short)var10;
					int var11 = var3.cg();
					this.an_fld[var9][var1][var2] = (byte)(var11 >> 2);
					this.aa_fld[var9][var1][var2] = (byte)(var11 & 3);
				}
			}
		}

		if (var7) {
			for (int var14 = 0; var14 < var5; var14++) {
				int var15 = var3.cg();
				if (var15 != 0) {
					ge[] var16 = this.ai_fld[var14][var1][var2] = new ge[var15];

					for (int var17 = 0; var17 < var15; var17++) {
						int var12;
						if (aac.ak_fld < 1268685569) {
							var12 = var3.do_();
						} else {
							var12 = var3.dl(wa.ag_fld.az_fld);
						}

						int var13 = var3.cg();
						var16[var17] = new ge(var12, var13 >> 2, var13 & 3);
					}
				}
			}
		}
	}

	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "(Lhi;IILxi;)V"
	)
	public static void hu(hi var0, int var1, int var2, xi var3) {
		if (var0 == null) {
			var0.getClass();
		}

		int var5 = var3.cg();
		if (0 != var5) {
			if (0 != (var5 & 1)) {
				var0.bk(var1, var2, var3, var5, 964502770);
			} else {
				cg(var0, var1, var2, var3, var5, (byte)-16);
			}
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Lub;)V"
	)
	void be(ub var1) throws EOFException {
		if (!this.bz()) {
			byte[] var3 = var1.bb(this.al_fld, this.au_fld, 584982574);
			if (null != var3) {
				this.av(new xi(var3), (byte)-126);
				this.aq_fld = true;
				this.am_fld = true;
			}
		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bs() {
		this.ae_fld = null;
		this.ax_fld = (short[][][])null;
		this.an_fld = (byte[][][])null;
		this.aa_fld = (byte[][][])null;
		this.ai_fld = (ge[][][][])null;
		this.aq_fld = false;
		this.am_fld = false;
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(IILxi;II)V"
	)
	void bk(int var1, int var2, xi var3, int var4, int var5) {
		boolean var10000;
		if ((var4 & 2) != 0) {
			if (var5 <= -1303311666) {
				return;
			}

			var10000 = true;
		} else {
			var10000 = false;
		}

		boolean var6 = var10000;
		if (var6) {
			this.ax_fld[0][var1][var2] = (short)xi.tx(var3, 938708135);
		}

		this.ae_fld[0][var1][var2] = (short)xi.tx(var3, 971843906);
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(Lhi;IILxi;IB)V"
	)
	public static void cg(hi var0, int var1, int var2, xi var3, int var4, byte var5) {
		if (var0 == null) {
			var0.getClass();
		}

		int var6 = 1 + ((var4 & 24) >> 3);
		boolean var7 = 0 != (var4 & 2);
		boolean var8 = (var4 & 4) != 0;
		var0.ae_fld[0][var1][var2] = (short)xi.tx(var3, 605536879);
		if (var7) {
			if (var5 >= 0) {
				return;
			}

			int var9 = var3.cg();

			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = xi.tx(var3, 1172763370);
				if (var11 != 0) {
					var0.ax_fld[var10][var1][var2] = (short)var11;
					int var12 = var3.cg();
					var0.an_fld[var10][var1][var2] = (byte)(var12 >> 2);
					var0.aa_fld[var10][var1][var2] = (byte)(var12 & 3);
				}
			}
		}

		if (var8) {
			for (int var15 = 0; var15 < var6; var15++) {
				int var16 = var3.cg();
				if (var16 != 0) {
					ge[] var17 = var0.ai_fld[var15][var1][var2] = new ge[var16];

					for (int var18 = 0; var18 < var16; var18++) {
						int var13;
						if (aac.ak_fld < 238) {
							var13 = var3.do_();
						} else {
							var13 = var3.dl(wa.ag_fld.az_fld);
						}

						int var14 = var3.cg();
						var17[var18] = new ge(var13, var14 >> 2, var14 & 3);
					}
				}
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	abstract void az(xi var1, int var2);

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxi;B)V"
	)
	abstract void av(xi var1, byte var2);

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(Lxi;B)V"
	)
	void br(xi var1, byte var2) {
		if (var1 != null) {
			if (var2 <= 1) {
				return;
			}

			this.az(var1, -559781011);
			this.aq_fld = true;
			this.am_fld = true;
		}
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int cd() {
		return this.as_fld;
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(IILxi;I)V"
	)
	void bn(int var1, int var2, xi var3, int var4) {
		boolean var5 = (var4 & 2) != 0;
		if (var5) {
			this.ax_fld[0][var1][var2] = (short)xi.tx(var3, 416693814);
		}

		this.ae_fld[0][var1][var2] = (short)xi.tx(var3, 1293055338);
	}

	hi() {
		this.au_fld = -420613169;
		this.aq_fld = false;
		this.am_fld = false;
		new LinkedList();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	abstract void al(xi var1);

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	abstract void au(xi var1);

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	abstract void ax(xi var1);

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int bf() {
		return this.ay_fld;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	abstract void aa(xi var1);

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	abstract void ai(xi var1);

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(IILxi;I)V"
	)
	void bg(int var1, int var2, xi var3, int var4) {
		int var5 = 1 + ((var4 & 24) >> 3);
		boolean var6 = 0 != (var4 & 2);
		boolean var7 = (var4 & 4) != 0;
		this.ae_fld[0][var1][var2] = (short)xi.tx(var3, 1892101803);
		if (var6) {
			int var8 = var3.cg();

			for (int var9 = 0; var9 < var8; var9++) {
				int var10 = xi.tx(var3, 2068819735);
				if (var10 != 0) {
					this.ax_fld[var9][var1][var2] = (short)var10;
					int var11 = var3.cg();
					this.an_fld[var9][var1][var2] = (byte)(var11 >> 2);
					this.aa_fld[var9][var1][var2] = (byte)(var11 & 3);
				}
			}
		}

		if (var7) {
			for (int var14 = 0; var14 < var5; var14++) {
				int var15 = var3.cg();
				if (var15 != 0) {
					ge[] var16 = this.ai_fld[var14][var1][var2] = new ge[var15];

					for (int var17 = 0; var17 < var15; var17++) {
						int var12;
						if (aac.ak_fld < 238) {
							var12 = var3.do_();
						} else {
							var12 = var3.dl(wa.ag_fld.az_fld);
						}

						int var13 = var3.cg();
						var16[var17] = new ge(var12, var13 >> 2, var13 & 3);
					}
				}
			}
		}
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	void bx(xi var1) {
		if (var1 != null) {
			this.az(var1, -559781011);
			this.aq_fld = true;
			this.am_fld = true;
		}
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	void bo(xi var1) {
		if (var1 != null) {
			this.az(var1, -559781011);
			this.aq_fld = true;
			this.am_fld = true;
		}
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bt() {
		this.ae_fld = null;
		this.ax_fld = (short[][][])null;
		this.an_fld = (byte[][][])null;
		this.aa_fld = (byte[][][])null;
		this.ai_fld = (ge[][][][])null;
		this.aq_fld = false;
		this.am_fld = false;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	abstract void an(xi var1);

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(IILxi;)V"
	)
	void bv(int var1, int var2, xi var3) {
		int var4 = var3.cg();
		if (0 != var4) {
			if (0 != (var4 & 1)) {
				this.bk(var1, var2, var3, var4, 416584023);
			} else {
				cg(this, var1, var2, var3, var4, (byte)-80);
			}
		}
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean bz() {
		return this.aq_fld && this.am_fld;
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(IILxi;)V"
	)
	void bi(int var1, int var2, xi var3) {
		int var4 = var3.cg();
		if (0 != var4) {
			if (0 != (var4 & 1)) {
				this.bk(var1, var2, var3, var4, 478090309);
			} else {
				cg(this, var1, var2, var3, var4, (byte)-4);
			}
		}
	}

	@ObfuscatedName("hd")
	@ObfuscatedSignature(
		descriptor = "(Lzv;Ljava/lang/String;IIII)V"
	)
	public static void hd(zv var0, String var1, int var2, int var3, int var4, int var5) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var1 != null) {
			zv.es(var0, var4, var5);
			var0.bl(var1, var2, var3);
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lhi;IILxi;I)V"
	)
	public static void ay(hi var0, int var1, int var2, xi var3, int var4) {
		if (var0 == null) {
			var0.getClass();
		}

		boolean var5 = (var4 & 2) != 0;
		if (var5) {
			var0.ax_fld[0][var1][var2] = (short)xi.tx(var3, 791966768);
		}

		var0.ae_fld[0][var1][var2] = (short)xi.tx(var3, 1348302527);
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(IILxi;I)V"
	)
	void bw(int var1, int var2, xi var3, int var4) {
		boolean var5 = (var4 & 2) != 0;
		if (var5) {
			this.ax_fld[0][var1][var2] = (short)xi.tx(var3, 805645736);
		}

		this.ae_fld[0][var1][var2] = (short)xi.tx(var3, 989135006);
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(IILxi;I)V"
	)
	void ba(int var1, int var2, xi var3, int var4) {
		boolean var5 = (var4 & 2) != 0;
		if (var5) {
			this.ax_fld[0][var1][var2] = (short)xi.tx(var3, 1021104367);
		}

		this.ae_fld[0][var1][var2] = (short)xi.tx(var3, 542340857);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	abstract void af(xi var1);

	@ObfuscatedName("vq")
	@ObfuscatedSignature(
		descriptor = "(Lhi;)Z"
	)
	public static boolean vq(hi var0) {
		return var0.aq_fld && var0.am_fld;
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(IILxi;I)V"
	)
	void bc(int var1, int var2, xi var3, int var4) {
		boolean var5 = (var4 & 2) != 0;
		if (var5) {
			this.ax_fld[0][var1][var2] = (short)xi.tx(var3, 1153396724);
		}

		this.ae_fld[0][var1][var2] = (short)xi.tx(var3, 797374631);
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int bb() {
		return this.ay_fld;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	abstract void ar(xi var1);

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(Lda;B)V"
	)
	static final void bb(da var0, byte var1) {
		boolean var2;
		var2 = var0.cl_fld == client.dv_fld || !da.er(var0, -1785293096);
		label53:
		if (!var2) {
			if (var1 == 17) {
				return;
			}

			ol var3 = var0.cm_fld.ae();
			if (var3 != null) {
				if (!var3.aa(-2092625815)) {
					var2 = qa.jy(var0.cm_fld, -1840133392) + 1 > var3.bf_fld[qa.do_(var0.cm_fld, 1249317534)];
					break label53;
				}

				if (var1 == 17) {
					return;
				}
			}

			var2 = true;
		}

		if (var2) {
			int var9 = var0.cl_fld - var0.ct_fld;
			int var4 = client.dv_fld - var0.ct_fld;
			int var5 = -911077504 * var0.cu_fld + -1693769408 * var0.bv_fld;
			int var6 = var0.bv_fld * -1693769408 + var0.cj_fld;
			int var7 = -1693769408 * var0.bv_fld + var0.ci_fld;
			int var8 = -1693769408 * var0.bv_fld + var0.ch_fld;
			var0.bo_fld = 1315745735 * (((var9 - var4) * var5 + var7 * var4) / var9);
			var0.bp_fld = 153690937 * (((var9 - var4) * var6 + var8 * var4) / var9);
		}

		var0.dl_fld = 0;
		var0.dv_fld = var0.dc_fld;
		var0.bt_fld = -1509908899 * var0.dv_fld;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;IIIIZS)V"
	)
	public static void az(ArrayList var0, int var1, int var2, int var3, int var4, boolean var5, short var6) {
		if (!var0.isEmpty()) {
			mb.az_fld.clear();
			mb.as_fld.clear();
			if (var5) {
				Iterator var7 = mb.av_fld.iterator();

				while (var7.hasNext()) {
					me var8 = (me)(me)var7.next();
					if (var8 != null) {
						var8.af_fld.au();
						var8.af_fld.ar();
						var8.af_fld.ak(0);
						var8.af_fld.aw_fld = 0;
						je.ag(var8.ag_fld, var8.az_fld);
					}
				}

				mb.av_fld.clear();
			} else {
				for (int var10 = 0; var10 < mb.av_fld.size(); var10++) {
					me var12 = (me)(me)mb.av_fld.get(var10);
					if (var12 == null) {
						if (var6 == 15731) {
							return;
						}

						mb.av_fld.remove(var10);
						var10--;
					} else if (var12.ay_fld) {
						if (-1034371599 * var12.af_fld.aw_fld > 0) {
							if (var6 == 15731) {
								return;
							}

							var12.af_fld.aw_fld--;
						}

						var12.af_fld.au();
						var12.af_fld.ar();
						var12.af_fld.ak(0);
						mb.av_fld.remove(var10);
						var10--;
					} else {
						var12.ay_fld = true;
					}
				}
			}

			td.ar(var0, var5, -1299851160);
			if (mb.az_fld.isEmpty()) {
				if (var6 != 15731) {
					;
				}
			} else {
				cw.af(var1, var2, var3, var4);
				mb.as_fld.add(new vz(null));
				mb.as_fld.add(new vf(null, ec.ae_fld, mb.ah_fld, mb.aw_fld));
				ArrayList var11 = new ArrayList();
				var11.add(new wp(new wx(null, 0, true, mb.au_fld)));
				if (!mb.av_fld.isEmpty()) {
					ArrayList var13 = new ArrayList();
					var13.add(new we(new va(null, var11), mb.al_fld));
					ArrayList var9 = ky.al();
					var13.add(new we(new wg(new vj(null, var9), 0, false, mb.af_fld), mb.ar_fld));
					mb.as_fld.add(new va(null, var13));
				} else {
					mb.as_fld.add(new we(null, mb.al_fld));
					mb.as_fld.add(new va(null, var11));
				}
			}
		}
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(IILxi;I)V"
	)
	void bh(int var1, int var2, xi var3, int var4) {
		int var5 = var3.co();
		if (0 != var5) {
			if (0 != (var5 & 1)) {
				this.bk(var1, var2, var3, var5, 964502770);
			} else {
				cg(this, var1, var2, var3, var5, (byte)-16);
			}
		}
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(IILxi;IB)V"
	)
	void bj(int var1, int var2, xi var3, int var4, byte var5) {
		int var6 = 1 + ((var4 & 24) >> 3);
		boolean var7 = 0 != (var4 & 2);
		boolean var8 = (var4 & 4) != 0;
		this.ae_fld[0][var1][var2] = (short)xi.tx(var3, 605536879);
		if (var7) {
			if (var5 >= 0) {
				return;
			}

			int var9 = var3.cg();

			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = xi.tx(var3, 1172763370);
				if (var11 != 0) {
					this.ae_fld[var10][var1][var2] = (short)var11;
					int var12 = var3.co();
					this.an_fld[var10][var1][var2] = (byte)(var12 >> 2);
					this.aa_fld[var10][var1][var2] = (byte)(var12 & 3);
				}
			}
		}

		if (var8) {
			for (int var15 = 0; var15 < var6; var15++) {
				int var16 = var3.dm();
				if (var16 != 0) {
					ge[] var17 = this.ai_fld[var15][var1][var2] = new ge[var16];

					for (int var18 = 0; var18 < var16; var18++) {
						int var13;
						if (aac.ak_fld < 238) {
							var13 = var3.co();
						} else {
							var13 = var3.dl(wa.ak_fld.az_fld);
						}

						int var14 = var3.dm();
						var17[var18] = new ge(var13, var14 >> 2, var14 & 3);
					}
				}
			}
		}
	}
}
