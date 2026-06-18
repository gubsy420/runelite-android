import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
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
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -22879427
	)
	int au_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -556413785
	)
	int ay_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -22879427
	)
	int ah_fld;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1331421739
	)
	int af_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -507523821
	)
	int aw_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -719467311
	)
	int as_fld;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -556413785
	)
	int ar_fld = -2109938455;
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
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -507523821
	)
	int al_fld;
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
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean am_fld;
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
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean aq_fld;
	@ObfuscatedName("ni")
	@ObfuscatedSignature(
		descriptor = "Leu;"
	)
	static eu ni_fld;
	@ObfuscatedName("iz")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1915116695
	)
	static int iz_fld;
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bp_fld;

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	int by() {
		return this.af_fld;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(IILxi;I)V"
	)
	void bq(int var1, int var2, xi var3, int var4) {
		int var5 = 1 + ((var4 & 24) >> 3);
		boolean var6 = 0 != (var4 & 2);
		boolean var7 = (var4 & 4) != 0;
		this.ae_fld[0][var1][var2] = (short)var3.cm();
		if (var6) {
			int var8 = var3.cg();

			for (int var9 = 0; var9 < var8; var9++) {
				int var10 = var3.cm();
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
							var12 = xi.kt(var3, (byte)-28);
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

	@ObfuscatedName("vq")
	@ObfuscatedSignature(
		descriptor = "(Lhi;IILxi;)V"
	)
	public static void vq(hi var0, int var1, int var2, xi var3) {
		if (var0 == null) {
			var0.getClass();
		}

		int var4 = var3.cg();
		if (0 != var4) {
			if (0 != (var4 & 1)) {
				var0.bk(var1, var2, var3, var4, 478090309);
			} else {
				uy(var0, var1, var2, var3, var4, (byte)-4);
			}
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Lub;B)V"
	)
	void be(ub var1) throws EOFException {
		if (!this.bz()) {
			byte[] var3 = var1.bb(this.ar_fld, this.as_fld, 584982574);
			if (null != var3) {
				this.av(new xi(var3), (byte)-126);
				this.am_fld = true;
				this.aq_fld = true;
			}
		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	void bs() {
		this.ae_fld = null;
		this.ax_fld = (short[][][])null;
		this.an_fld = (byte[][][])null;
		this.aa_fld = (byte[][][])null;
		this.ai_fld = (ge[][][][])null;
		this.am_fld = false;
		this.aq_fld = false;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(IILxi;I)V"
	)
	void bh(int var1, int var2, xi var3) {
		int var5 = var3.cg();
		if (0 != var5) {
			if (0 != (var5 & 1)) {
				this.bk(var1, var2, var3, var5, 964502770);
			} else {
				uy(this, var1, var2, var3, var5, (byte)-16);
			}
		}
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
			this.ax_fld[0][var1][var2] = (short)var3.cm();
		}

		this.ae_fld[0][var1][var2] = (short)var3.cm();
	}

	@ObfuscatedName("fn")
	@ObfuscatedSignature(
		descriptor = "(Lhi;Lxi;)V"
	)
	public static void fn(hi var0, xi var1) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var1 != null) {
			var0.az(var1, -559781011);
			var0.am_fld = true;
			var0.aq_fld = true;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	abstract void az(xi var1, int var2);

	@ObfuscatedName("hr")
	@ObfuscatedSignature(
		descriptor = "(Lhi;Lxi;B)V"
	)
	public static void hr(hi var0, xi var1, byte var2) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var1 != null) {
			if (var2 <= 1) {
				return;
			}

			var0.az(var1, -559781011);
			var0.am_fld = true;
			var0.aq_fld = true;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxi;B)V"
	)
	abstract void av(xi var1, byte var2);

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int cd() {
		return this.af_fld;
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(IILxi;I)V"
	)
	void bn(int var1, int var2, xi var3, int var4) {
		boolean var5 = (var4 & 2) != 0;
		if (var5) {
			this.ax_fld[0][var1][var2] = (short)var3.cm();
		}

		this.ae_fld[0][var1][var2] = (short)var3.cm();
	}

	hi() {
		this.as_fld = -420613169;
		this.am_fld = false;
		this.aq_fld = false;
		new LinkedList();
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(Lnj;)Lvc;"
	)
	public static vc cu(nj var0) {
		if (var0 == null) {
			var0.getClass();
		}

		vc var1 = var0.ag_fld;
		if (var1 == var0.ak_fld) {
			var0.ag_fld = null;
			return null;
		} else {
			var0.ag_fld = var1.fn_vc;
			return var1;
		}
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

	@ObfuscatedName("yv")
	@ObfuscatedSignature(
		descriptor = "(Lqf;)Ljava/io/InputStream;"
	)
	public static InputStream yv(qf var0) throws IOException {
		return var0.val$tlsClientProtocol.getInputStream();
	}

	@ObfuscatedName("fu")
	@ObfuscatedSignature(
		descriptor = "(Lhi;IILxi;I)V"
	)
	public static void fu(hi var0, int var1, int var2, xi var3, int var4) {
		if (var0 == null) {
			var0.getClass();
		}

		boolean var5 = (var4 & 2) != 0;
		if (var5) {
			var0.ax_fld[0][var1][var2] = (short)var3.cm();
		}

		var0.ae_fld[0][var1][var2] = (short)var3.cm();
	}

	@ObfuscatedName("li")
	@ObfuscatedSignature(
		descriptor = "(Lhi;IILxi;I)V"
	)
	public static void li(hi var0, int var1, int var2, xi var3, int var4) {
		if (var0 == null) {
			var0.getClass();
		}

		boolean var5 = (var4 & 2) != 0;
		if (var5) {
			var0.ax_fld[0][var1][var2] = (short)var3.cm();
		}

		var0.ae_fld[0][var1][var2] = (short)var3.cm();
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
		this.ae_fld[0][var1][var2] = (short)var3.cm();
		if (var6) {
			int var8 = var3.cg();

			for (int var9 = 0; var9 < var8; var9++) {
				int var10 = var3.cm();
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
							var12 = xi.kt(var3, (byte)-25);
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
			this.am_fld = true;
			this.aq_fld = true;
		}
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	void bo(xi var1) {
		if (var1 != null) {
			this.az(var1, -559781011);
			this.am_fld = true;
			this.aq_fld = true;
		}
	}

	@ObfuscatedName("xz")
	@ObfuscatedSignature(
		descriptor = "(Lhi;I)I"
	)
	public static int xz(hi var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.ah_fld;
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
		this.am_fld = false;
		this.aq_fld = false;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	abstract void an(xi var1);

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(IILxi;)V"
	)
	void bi(int var1, int var2, xi var3) {
		int var4 = var3.cg();
		if (0 != var4) {
			if (0 != (var4 & 1)) {
				this.bk(var1, var2, var3, var4, 416584023);
			} else {
				uy(this, var1, var2, var3, var4, (byte)-80);
			}
		}
	}

	@ObfuscatedName("uy")
	@ObfuscatedSignature(
		descriptor = "(Lhi;IILxi;IB)V"
	)
	public static void uy(hi var0, int var1, int var2, xi var3, int var4, byte var5) {
		if (var0 == null) {
			var0.getClass();
		}

		int var6 = 1 + ((var4 & 24) >> 3);
		boolean var7 = 0 != (var4 & 2);
		boolean var8 = (var4 & 4) != 0;
		var0.ae_fld[0][var1][var2] = (short)var3.cm();
		if (var7) {
			if (var5 >= 0) {
				return;
			}

			int var9 = var3.cg();

			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = var3.cm();
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
							var13 = xi.kt(var3, (byte)-126);
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

	@ObfuscatedName("lt")
	@ObfuscatedSignature(
		descriptor = "(Lhi;IILxi;I)V"
	)
	public static void lt(hi var0, int var1, int var2, xi var3, int var4) {
		if (var0 == null) {
			var0.getClass();
		}

		boolean var5 = (var4 & 2) != 0;
		if (var5) {
			var0.ax_fld[0][var1][var2] = (short)var3.cm();
		}

		var0.ae_fld[0][var1][var2] = (short)var3.cm();
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean bz() {
		return this.am_fld && this.aq_fld;
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(IILxi;I)V"
	)
	void bw(int var1, int var2, xi var3, int var4) {
		boolean var5 = (var4 & 2) != 0;
		if (var5) {
			this.ax_fld[0][var1][var2] = (short)var3.cm();
		}

		this.ae_fld[0][var1][var2] = (short)var3.cm();
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	abstract void af(xi var1);

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int bb() {
		return this.ah_fld;
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
		var2 = var0.bb_fld == client.dv_fld || !da.bh(var0, -1785293096);
		label53:
		if (!var2) {
			if (var1 == 17) {
				return;
			}

			ol var3 = qa.kw(var0.cm_fld, -908991619);
			if (var3 != null) {
				if (!var3.aa(-2092625815)) {
					var2 = var0.cm_fld.ay() + 1 > var3.bf_fld[var0.cm_fld.aw(1249317534)];
					break label53;
				}

				if (var1 == 17) {
					return;
				}
			}

			var2 = true;
		}

		if (var2) {
			int var9 = var0.bb_fld - var0.bv_fld;
			int var4 = client.dv_fld - var0.bv_fld;
			int var5 = -911077504 * var0.by_fld + -1693769408 * var0.bn_fld;
			int var6 = var0.bn_fld * -1693769408 + var0.dv_fld;
			int var7 = -1693769408 * var0.bn_fld + var0.cv_fld;
			int var8 = -1693769408 * var0.bn_fld + var0.dh_fld;
			var0.bi_fld = 1315745735 * (((var9 - var4) * var5 + var7 * var4) / var9);
			var0.dm_fld = 153690937 * (((var9 - var4) * var6 + var8 * var4) / var9);
		}

		var0.ch_fld = 0;
		var0.bt_fld = var0.bu_fld;
		var0.bc_fld = -1509908899 * var0.bt_fld;
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
						var8.af_fld.av();
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
					} else if (var12.ar_fld) {
						if (-1034371599 * var12.af_fld.aw_fld > 0) {
							if (var6 == 15731) {
								return;
							}

							var12.af_fld.aw_fld--;
						}

						var12.af_fld.av();
						var12.af_fld.ar();
						var12.af_fld.ak(0);
						mb.av_fld.remove(var10);
						var10--;
					} else {
						var12.ar_fld = true;
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

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(IILxi;IB)V"
	)
	void bj(int var1, int var2, xi var3, int var4, byte var5) {
		int var6 = 1 + ((var4 & 24) >> 3);
		boolean var7 = 0 != (var4 & 2);
		boolean var8 = (var4 & 4) != 0;
		this.ae_fld[0][var1][var2] = (short)var3.de();
		if (var7) {
			if (var5 >= 0) {
				return;
			}

			int var9 = var3.dz();

			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = var3.dq();
				if (var11 != 0) {
					this.ae_fld[var10][var1][var2] = (short)var11;
					int var12 = var3.dm();
					this.aa_fld[var10][var1][var2] = (byte)(var12 >> 2);
					this.an_fld[var10][var1][var2] = (byte)(var12 & 3);
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
							var13 = xi.kt(var3, (byte)-126);
						} else {
							var13 = var3.dl(wa.ak_fld.az_fld);
						}

						int var14 = var3.ex();
						var17[var18] = new ge(var13, var14 >> 2, var14 & 3);
					}
				}
			}
		}
	}

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
			this.aq_fld = true;
		}
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int bf(int var1) {
		return this.au_fld;
	}
}
