import java.io.EOFException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;
import net.runelite.api.worldmap.WorldMapRegion;
import net.runelite.api.worldmap.WorldMapRenderer;

@ObfuscatedName("gd")
@Implements({"WorldMapRenderer"})
public class gd implements WorldMapRenderer {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	ub ag_fld;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	public static ub ap_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean ah_fld;
	@ObfuscatedGetter(
		intValue = 253584221
	)
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int av_fld = 0;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean ae_fld = false;
	@ObfuscatedGetter(
		intValue = -1254686895
	)
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int au_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lhw;"
	)
	hw aw_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lyv;"
	)
	yv ay_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/HashMap;"
	)
	HashMap as_fld;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "[[Lga;"
	)
	ga[][] ar_fld;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/HashMap;"
	)
	HashMap af_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/HashMap;"
	)
	HashMap az_fld;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int at_fld;
	@ObfuscatedGetter(
		intValue = 939718155
	)
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ax_fld;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "[Lyc;"
	)
	yc[] al_fld;
	@ObfuscatedGetter(
		intValue = -713342845
	)
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int aa_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	ub ak_fld;
	@ObfuscatedGetter(
		intValue = -766280653
	)
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int an_fld;

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V"
	)
	public final void ai(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		try {
			int[] var9 = yu.al_fld;
			int var10 = yu.au_fld;
			int var11 = yu.ax_fld;
			float[] var12 = yu.an_fld;
			int[] var13 = new int[4];
			yu.dy(var13);
			hn var14 = this.aw(var1, var2, var3, var4, 424660830);
			float var15 = this.al(var7 - var5, var3 - var1, -466547787);
			int var16 = (int)Math.ceil(var15);
			this.av_fld = var16;
			if (!this.af_fld.containsKey(var16)) {
				hg var17 = new hg(var16);
				var17.av(2120213783);
				this.af_fld.put(var16, var17);
			}

			int var26 = var14.az_fld + var14.ak_fld - 1;
			int var18 = var14.ag_fld + var14.av_fld - 1;

			for (int var19 = var14.az_fld; var19 <= var26; var19++) {
				for (int var20 = var14.av_fld; var20 <= var18; var20++) {
					this.ar_fld[var19][var20].al(this.aw_fld, var16, (hg)this.af_fld.get(var16), this.al_fld, this.ak_fld, this.ag_fld, 0.725);
				}
			}

			fc.aa(var9, var10, var11, var12);
			yu.di(var13);
			int var27 = (int)(64.0F * var15);
			int var28 = this.au_fld + var1;
			int var21 = var2 + this.ax_fld;

			for (int var22 = var14.az_fld; var22 < var14.az_fld + var14.ak_fld; var22++) {
				for (int var23 = var14.av_fld; var23 < var14.ag_fld + var14.av_fld; var23++) {
					this.ar_fld[var22][var23]
						.ag(
							var27 * (152315456 * this.ar_fld[var22][var23].af_fld - var28) / 64 + var5,
							var8 - var27 * (64 + (-744179648 * this.ar_fld[var22][var23].aw_fld - var21)) / 64,
							var27,
							(byte)-66
						);
				}
			}
		} catch (Throwable var25) {
			throw new RuntimeException(var25);
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIII)Ljava/util/List;"
	)
	public List ab(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		LinkedList var11 = new LinkedList();
		if (!this.ae_fld) {
			return var11;
		} else {
			hn var12 = this.aw(var1, var2, var3, var4, 424660830);
			float var13 = this.al(var7, var3 - var1, 1770247172);
			int var14 = (int)(64.0F * var13);
			int var15 = this.au_fld + var1;
			int var16 = this.ax_fld + var2;

			for (int var17 = var12.az_fld; var17 < var12.az_fld + var12.ak_fld; var17++) {
				for (int var18 = var12.av_fld; var18 < var12.ag_fld + var12.av_fld; var18++) {
					List var19 = this.ar_fld[var17][var18]
						.bk(
							var5 + (this.ar_fld[var17][var18].af_fld * 152315456 - var15) * var14 / 64,
							var8 + var6 - (64 + (-744179648 * this.ar_fld[var17][var18].aw_fld - var16)) * var14 / 64,
							var14,
							var9,
							var10,
							(short)-6035
						);
					if (!var19.isEmpty()) {
						var11.addAll(var19);
					}
				}
			}

			return var11;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lub;Lgf;Z)V"
	)
	public void au(ub var1, gf var2, boolean var3) {
		try {
			if (!this.ah_fld) {
				this.ae_fld = false;
				this.ah_fld = true;
				System.nanoTime();
				this.aw_fld = new hw();

				try {
					if (aac.ak_fld < 415235663) {
						int var4 = var1.cm(hc.ak_fld.ah_fld, (byte)1);
						int var5 = var1.cz(var4, gf.ms(var2, -1523416230), -1581279946);
						xi var6 = new xi(var1.cb(hc.ak_fld.ah_fld, gf.ms(var2, 677368943), (byte)64));
						xi var7 = new xi(var1.cb(hc.ag_fld.ah_fld, gf.ms(var2, -1191098790), (byte)-77));
						System.nanoTime();
						System.nanoTime();
						this.aw_fld.cu(var6, var7, var5, var3);
					} else {
						xi var15 = new xi(var1.bb(hc.ak_fld.aw_fld, var2.ay(-143778459), 584982574));
						xi var17 = new xi(var1.bb(-944367060 * hc.ag_fld.aw_fld, var2.ay(-143778459), 584982574));
						System.nanoTime();
						System.nanoTime();
						this.aw_fld.ci(var15, var17, var2.ay(-143778459), var3, 58404456);
					}
				} catch (IllegalStateException var13) {
					return;
				}

				gf.dg(this.aw_fld, -1529655148);
				gf.ka(this.aw_fld, 1551800975);
				this.aw_fld.ao(426040289);
				this.au_fld = this.aw_fld.an(1655423463) * -1703213303;
				this.ax_fld = this.aw_fld.ai(-1230012889) * -1067882304;
				this.an_fld = (this.aw_fld.aa(-938395354) - this.aw_fld.an(811877115) + 1) * -1292386624;
				this.aa_fld = (this.aw_fld.aq(1307464574) - this.aw_fld.ai(-848941281) + 1) * -293544559;
				int var16 = this.aw_fld.aa(1975666792) - this.aw_fld.an(905679286) + 1;
				int var18 = this.aw_fld.aq(1222837505) - this.aw_fld.ai(-1539156893) + 1;
				System.nanoTime();
				System.nanoTime();
				ga.ae_fld.aw();
				this.ar_fld = new ga[var16][var18];
				Iterator var19 = this.aw_fld.af_fld.iterator();

				while (var19.hasNext()) {
					gk var22 = (gk)(gk)var19.next();
					int var8 = var22.ay_fld;
					int var9 = -119906938 * var22.as_fld;
					int var10 = var8 - this.aw_fld.an(1520495876);
					int var11 = var9 - this.aw_fld.ai(-1297383876);
					this.ar_fld[var10][var11] = new ga(var8, var9, this.aw_fld.al((byte)126), this.az_fld);
					ga.eb(this.ar_fld[var10][var11], var22, this.aw_fld.au_fld, (short)128);
				}

				for (int var20 = 0; var20 < var16; var20++) {
					for (int var23 = 0; var23 < var18; var23++) {
						if (null == this.ar_fld[var20][var23]) {
							this.ar_fld[var20][var23] = new ga(this.aw_fld.an(-34414285) + var20, this.aw_fld.ai(-1034545089) + var23, this.aw_fld.al((byte)35), this.az_fld);
							this.ar_fld[var20][var23].av(this.aw_fld.al_fld, this.aw_fld.au_fld, 945773000);
						}
					}
				}

				System.nanoTime();
				System.nanoTime();
				byte[] var21;
				if (aac.ak_fld < 238) {
					var21 = var1.cb(hc.az_fld.ah_fld, gf.ms(var2, 989211235), (byte)110);
				} else {
					var21 = var1.bb(hc.az_fld.aw_fld * -411740254, var2.ay(-143778459), 584982574);
				}

				if (var21 != null) {
					this.ay_fld = qd.ak(var21);
				}

				System.nanoTime();
				var1.cr(-528468722);
				var1.cg(305880177);
				this.ae_fld = true;
			}
		} catch (Throwable var14) {
			throw new RuntimeException(var14);
		}
	}

	@ObfuscatedName("xy")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int xy() {
		return this.au_fld;
	}

	@ObfuscatedName("wj")
	@ObfuscatedSignature(
		descriptor = "(Lgd;IIIIIIII)V"
	)
	public static void wj(gd var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			int[] var9 = yu.al_fld;
			int var10 = yu.au_fld;
			int var11 = yu.ax_fld;
			float[] var12 = yu.an_fld;
			int[] var13 = new int[4];
			yu.dy(var13);
			hn var14 = var0.aw(var1, var2, var3, var4, 424660830);
			float var15 = var0.al(var7 - var5, var3 - var1, 896589265);
			int var16 = (int)Math.ceil(var15);
			var0.av_fld = var16;
			if (!var0.af_fld.containsKey(var16)) {
				hg var17 = new hg(var16);
				var17.av(1964628988);
				var0.af_fld.put(var16, var17);
			}

			int var26 = var14.az_fld + var14.ak_fld - 1;
			int var18 = var14.ag_fld + var14.av_fld - 1;

			for (int var19 = var14.az_fld; var19 <= var26; var19++) {
				for (int var20 = var14.av_fld; var20 <= var18; var20++) {
					var0.ar_fld[var19][var20].al(var0.aw_fld, var16, (hg)var0.af_fld.get(var16), var0.al_fld, var0.ak_fld, var0.ag_fld, 0.725);
				}
			}

			fc.aa(var9, var10, var11, var12);
			yu.di(var13);
			int var27 = (int)(64.0F * var15);
			int var28 = var0.au_fld + var1;
			int var21 = var2 + var0.ax_fld;

			for (int var22 = var14.az_fld; var22 < var14.az_fld + var14.ak_fld; var22++) {
				for (int var23 = var14.av_fld; var23 < var14.ag_fld + var14.av_fld; var23++) {
					var0.ar_fld[var22][var23]
						.ag(
							var27 * (152315456 * var0.ar_fld[var22][var23].af_fld - var28) / 64 + var5,
							var8 - var27 * (64 + (-744179648 * var0.ar_fld[var22][var23].aw_fld - var21)) / 64,
							var27,
							(byte)-45
						);
				}
			}
		} catch (Throwable var25) {
			throw new RuntimeException(var25);
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZI)V"
	)
	public final void av(
		int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, HashSet var9, HashSet var10, int var11, int var12, boolean var13, int var14
	) {
		try {
			hn var15 = this.aw(var1, var2, var3, var4, 424660830);
			float var16 = this.al(var7 - var5, var3 - var1, 1689985073);
			int var17 = (int)(var16 * 64.0F);
			int var18 = var1 + this.au_fld;
			int var19 = var2 + this.ax_fld;

			for (int var20 = var15.az_fld; var20 < var15.ak_fld + var15.az_fld; var20++) {
				if (var14 != 568447311) {
					return;
				}

				for (int var21 = var15.av_fld; var21 < var15.av_fld + var15.ag_fld; var21++) {
					if (var13) {
						this.ar_fld[var20][var21].aw((byte)96);
					}

					this.ar_fld[var20][var21]
						.au(
							var5 + (this.ar_fld[var20][var21].af_fld * 152315456 - var18) * var17 / 64,
							var8 - var17 * (this.ar_fld[var20][var21].aw_fld * -744179648 - var19 + 64) / 64,
							var17,
							var9,
							104739503
						);
				}
			}

			if (var10 != null && var11 > 0) {
				if (var14 != 568447311) {
					return;
				}

				for (int var23 = var15.az_fld; var23 < var15.az_fld + var15.ak_fld; var23++) {
					for (int var24 = var15.av_fld; var24 < var15.av_fld + var15.ag_fld; var24++) {
						ga.lz(this.ar_fld[var23][var24], var10, var11, var12, (byte)67);
					}
				}
			}
		} catch (Throwable var22) {
			throw new RuntimeException(var22);
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIII)Ljava/util/List;"
	)
	public List ah(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		LinkedList var12 = new LinkedList();
		if (!this.ae_fld) {
			return var12;
		} else {
			hn var13 = this.aw(var1, var2, var3, var4, 424660830);
			float var14 = this.al(var7, var3 - var1, 568873209);
			int var15 = (int)(64.0F * var14);
			int var16 = this.au_fld + var1;
			int var17 = this.ax_fld + var2;

			for (int var18 = var13.az_fld; var18 < var13.az_fld + var13.ak_fld; var18++) {
				for (int var19 = var13.av_fld; var19 < var13.ag_fld + var13.av_fld; var19++) {
					List var20 = this.ar_fld[var18][var19]
						.bk(
							var5 + (this.ar_fld[var18][var19].af_fld * 152315456 - var16) * var15 / 64,
							var8 + var6 - (64 + (-744179648 * this.ar_fld[var18][var19].aw_fld - var17)) * var15 / 64,
							var15,
							var9,
							var10,
							(short)-12068
						);
					if (!var20.isEmpty()) {
						var12.addAll(var20);
					}
				}
			}

			return var12;
		}
	}

	@ObfuscatedName("ys")
	@ObfuscatedSignature(
		descriptor = "(Lgd;II)F"
	)
	public static float ys(gd var0, int var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		float var3 = (float)var1 / var2;
		if (var3 > 8.0F) {
			return 8.0F;
		} else if (var3 < 1.0F) {
			return 1.0F;
		} else {
			int var4 = Math.round(var3);
			return Math.abs(var4 - var3) < 0.05F ? var4 : var3;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIII)V"
	)
	public final void az(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
		try {
			int[] var10 = yu.al_fld;
			int var11 = yu.au_fld;
			int var12 = yu.ax_fld;
			float[] var13 = yu.an_fld;
			int[] var14 = new int[4];
			yu.dy(var14);
			hn var15 = this.aw(var1, var2, var3, var4, 424660830);
			float var16 = this.al(var7 - var5, var3 - var1, 951892528);
			int var17 = (int)Math.ceil(var16);
			this.av_fld = var17;
			if (!this.af_fld.containsKey(var17)) {
				if (var9 <= -1108736849) {
					return;
				}

				hg var18 = new hg(var17);
				var18.av(1993552627);
				this.af_fld.put(var17, var18);
			}

			int var26 = var15.az_fld + var15.ak_fld - 1;
			int var19 = var15.ag_fld + var15.av_fld - 1;

			for (int var20 = var15.az_fld; var20 <= var26; var20++) {
				for (int var21 = var15.av_fld; var21 <= var19; var21++) {
					if (var9 <= -1108736849) {
						return;
					}

					this.ar_fld[var20][var21].al(this.aw_fld, var17, (hg)this.af_fld.get(var17), this.al_fld, this.ak_fld, this.ag_fld, 0.725);
				}
			}

			fc.aa(var10, var11, var12, var13);
			yu.di(var14);
			int var27 = (int)(64.0F * var16);
			int var28 = this.au_fld + var1;
			int var22 = var2 + this.ax_fld;

			for (int var23 = var15.az_fld; var23 < var15.az_fld + var15.ak_fld; var23++) {
				for (int var24 = var15.av_fld; var24 < var15.ag_fld + var15.av_fld; var24++) {
					this.ar_fld[var23][var24]
						.ag(
							var27 * (152315456 * this.ar_fld[var23][var24].af_fld - var28) / 64 + var5,
							var8 - var27 * (64 + (-744179648 * this.ar_fld[var23][var24].aw_fld - var22)) / 64,
							var27,
							(byte)25
						);
				}
			}
		} catch (Throwable var25) {
			throw new RuntimeException(var25);
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean ay(int var1) {
		return this.ae_fld;
	}

	@ObfuscatedName("kk")
	@ObfuscatedSignature(
		descriptor = "(Lgd;IIIIIIII)V"
	)
	public static void kk(gd var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			int[] var9 = yu.al_fld;
			int var10 = yu.au_fld;
			int var11 = yu.ax_fld;
			float[] var12 = yu.an_fld;
			int[] var13 = new int[4];
			yu.dy(var13);
			hn var14 = var0.aw(var1, var2, var3, var4, 424660830);
			float var15 = var0.al(var7 - var5, var3 - var1, 1177316282);
			int var16 = (int)Math.ceil(var15);
			var0.av_fld = var16;
			if (!var0.af_fld.containsKey(var16)) {
				hg var17 = new hg(var16);
				var17.av(2063960801);
				var0.af_fld.put(var16, var17);
			}

			int var26 = var14.az_fld + var14.ak_fld - 1;
			int var18 = var14.ag_fld + var14.av_fld - 1;

			for (int var19 = var14.az_fld; var19 <= var26; var19++) {
				for (int var20 = var14.av_fld; var20 <= var18; var20++) {
					var0.ar_fld[var19][var20].al(var0.aw_fld, var16, (hg)var0.af_fld.get(var16), var0.al_fld, var0.ak_fld, var0.ag_fld, 0.725);
				}
			}

			fc.aa(var9, var10, var11, var12);
			yu.di(var13);
			int var27 = (int)(64.0F * var15);
			int var28 = var0.au_fld + var1;
			int var21 = var2 + var0.ax_fld;

			for (int var22 = var14.az_fld; var22 < var14.az_fld + var14.ak_fld; var22++) {
				for (int var23 = var14.av_fld; var23 < var14.ag_fld + var14.av_fld; var23++) {
					var0.ar_fld[var22][var23]
						.ag(
							var27 * (152315456 * var0.ar_fld[var22][var23].af_fld - var28) / 64 + var5,
							var8 - var27 * (64 + (-744179648 * var0.ar_fld[var22][var23].aw_fld - var21)) / 64,
							var27,
							(byte)-58
						);
				}
			}
		} catch (Throwable var25) {
			throw new RuntimeException(var25);
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	public int as(byte var1) {
		return this.aw_fld.au((short)-23181);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/util/HashSet;II)V"
	)
	public void ad(int var1, int var2, int var3, int var4, HashSet var5, int var6, int var7) {
		if (this.ay_fld != null) {
			yv.an(this.ay_fld, var1, var2, var3, var4);
			if (var6 > 0 && var6 % var7 < var7 / 2) {
				if (null == this.as_fld) {
					this.af((byte)-6);
				}

				Iterator var8 = var5.iterator();

				while (var8.hasNext()) {
					int var9 = (Integer)var8.next();
					List var10 = (List)(List)this.as_fld.get(var9);
					if (var10 != null) {
						Iterator var11 = var10.iterator();

						while (var11.hasNext()) {
							hr var12 = (hr)(hr)var11.next();
							int var13 = (var12.aw_fld.ag_fld * -621797759 - this.au_fld) * var3 / this.an_fld;
							int var14 = var4 - (1668899479 * var12.aw_fld.az_fld - this.ax_fld) * var4 / this.aa_fld;
							yu.de(var13 + var1, var14 + var2, 2, 2070064572, -969220947);
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	void af(byte var1) {
		if (null == this.as_fld) {
			this.as_fld = new HashMap();
		}

		this.as_fld.clear();

		for (int var2 = 0; var2 < this.ar_fld.length; var2++) {
			if (var1 >= 14) {
				return;
			}

			for (int var3 = 0; var3 < this.ar_fld[var2].length; var3++) {
				List var4 = ga.kn(this.ar_fld[var2][var3], (byte)35);
				Iterator var5 = var4.iterator();

				while (var5.hasNext()) {
					hr var6 = (hr)(hr)var5.next();
					if (var6.aq((byte)30)) {
						int var7 = var6.ag(-987819246);
						if (!this.as_fld.containsKey(var7)) {
							LinkedList var8 = new LinkedList();
							var8.add(var6);
							this.as_fld.put(var7, var8);
						} else {
							List var9 = (List)(List)this.as_fld.get(var7);
							var9.add(var6);
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V"
	)
	static final void ce(int var0, int var1, int var2, int var3, byte var4) throws EOFException {
		try {
			hw.cn(var0, var1, var2, var3, true);
			var0 = client.fl_fld;
			var1 = client.fg_fld;
			var2 = client.fn_fld;
			var3 = client.ft_fld;
			yu.dg(var0, var1, var0 + var2, var1 + var3);
			fc.ai();
			yu.ee();
			int var5 = client.jf_fld;
			if (client.mc_fld / 256 > var5) {
				var5 = client.mc_fld / 256;
			}

			if (client.pp_fld[4] && 128 + client.pm_fld[4] > var5) {
				var5 = 128 + client.pm_fld[4];
			}

			int var6 = client.js_fld & 2047;
			int var7 = ga.mr_fld;
			int var8 = xg.mo_fld;
			int var9 = an.mu_fld;
			int var12 = var5 * 3 + 600;
			mo.dq(var7, var8, var9, var5, var6, var12, var3, -1718204807);
			int var13;
			if (!client.ki_fld) {
				int var14;
				if (cx.kq_fld.ae((byte)2)) {
					var14 = bw.dk_fld.ae_fld;
				} else {
					label549: {
						label523: {
							int var15 = 3;
							int var16 = client.nw_fld >> 7;
							int var17 = client.nd_fld >> 7;
							if (hu.je_fld < 310) {
								int var18;
								int var19;
								if (1 == client.dg_fld) {
									if (var4 == -5) {
										return;
									}

									var18 = ga.mr_fld >> 7;
									var19 = an.mu_fld >> 7;
								} else {
									var18 = var16;
									var19 = var17;
								}

								int var20 = ke.jd_fld >> 7;
								int var21 = gk.jc_fld >> 7;
								if (!bw.dk_fld.ae(var20, var21, 1482883425)) {
									var14 = bw.dk_fld.ae_fld;
									break label549;
								}

								if (var18 < 0) {
									break label523;
								}

								if (var4 == -5) {
									return;
								}

								if (bw.dk_fld.ah_fld <= var18 || var19 < 0 || bw.dk_fld.aw_fld <= var19) {
									break label523;
								}

								if ((bw.dk_fld.al_fld[bw.dk_fld.ae_fld][var20][var21] & 4) != 0) {
									var15 = bw.dk_fld.ae_fld;
								}

								int var22;
								if (var18 > var20) {
									if (var4 == -5) {
										return;
									}

									var22 = var18 - var20;
								} else {
									var22 = var20 - var18;
								}

								int var23;
								if (var19 > var21) {
									var23 = var19 - var21;
								} else {
									var23 = var21 - var19;
								}

								if (var22 > var23) {
									int var24 = 65536 * var23 / var22;
									int var25 = 32768;

									while (var18 != var20) {
										if (var20 < var18) {
											var20++;
										} else if (var20 > var18) {
											var20--;
										}

										if ((bw.dk_fld.al_fld[bw.dk_fld.ae_fld][var20][var21] & 4) != 0) {
											var15 = bw.dk_fld.ae_fld;
										}

										var25 += var24;
										if (var25 >= 65536) {
											var25 -= 65536;
											if (var21 < var19) {
												var21++;
											} else if (var21 > var19) {
												if (var4 == -5) {
													return;
												}

												var21--;
											}

											if (0 != (bw.dk_fld.al_fld[bw.dk_fld.ae_fld][var20][var21] & 4)) {
												if (var4 == -5) {
													return;
												}

												var15 = bw.dk_fld.ae_fld;
											}
										}
									}
								} else if (var23 > 0) {
									int var50 = var22 * 65536 / var23;
									int var53 = 32768;

									while (var21 != var19) {
										if (var21 < var19) {
											if (var4 == -5) {
												return;
											}

											var21++;
										} else if (var21 > var19) {
											var21--;
										}

										if (0 != (bw.dk_fld.al_fld[bw.dk_fld.ae_fld][var20][var21] & 4)) {
											var15 = bw.dk_fld.ae_fld;
										}

										var53 += var50;
										if (var53 >= 65536) {
											var53 -= 65536;
											if (var20 < var18) {
												var20++;
											} else if (var20 > var18) {
												var20--;
											}

											if ((bw.dk_fld.al_fld[bw.dk_fld.ae_fld][var20][var21] & 4) != 0) {
												var15 = bw.dk_fld.ae_fld;
											}
										}
									}
								}
							}

							if (!bw.dk_fld.ae(var16, var17, 516143432)) {
								var14 = bw.dk_fld.ae_fld;
							} else {
								if (0 != (bw.dk_fld.al_fld[bw.dk_fld.ae_fld][var16][var17] & 4)) {
									var15 = bw.dk_fld.ae_fld;
								}

								var14 = var15;
							}
							break label549;
						}

						var14 = bw.dk_fld.ae_fld;
					}
				}

				var13 = var14;
			} else {
				var13 = oz.ch();
			}

			int var35 = ke.jd_fld;
			int var36 = cs.jy_fld;
			int var37 = gk.jc_fld;
			int var38 = hu.je_fld;
			int var39 = ab.jx_fld;

			for (int var40 = 0; var40 < 5; var40++) {
				if (client.pp_fld[var40]) {
					int var42 = (int)(
						Math.random() * (2 * client.pn_fld[var40] + 1)
							- client.pn_fld[var40]
							+ Math.sin(client.pl_fld[var40] / 100.0 * client.pu_fld[var40]) * client.pm_fld[var40]
					);
					if (0 == var40) {
						ke.jd_fld += -1242416717 * var42;
					}

					if (var40 == 1) {
						if (var4 == -5) {
							return;
						}

						cs.jy_fld += -942740307 * var42;
					}

					if (var40 == 2) {
						gk.jc_fld += 914526953 * var42;
					}

					if (3 == var40) {
						ab.jx_fld = 1850245907 * (var42 + ab.jx_fld & 2047);
					}

					if (var40 == 4) {
						if (var4 == -5) {
							return;
						}

						hu.je_fld += var42 * -535892387;
						hu.je_fld = ji.bo(hu.je_fld);
					}
				}
			}

			int var41 = tj.ae_fld;
			int var43 = tj.ah_fld;
			if (var41 >= var0 && var41 < var0 + var2 && var43 >= var1 && var43 < var3 + var1) {
				if (var4 == -5) {
					return;
				}

				int var44 = var41 - var0;
				int var46 = var43 - var1;
				ej.bs_fld = var44;
				ej.bh_fld = var46;
				ej.be_fld = true;
				ej.cd_fld = 0;
				ej.cc_fld[0] = -1L;
				ej.cq_fld[0] = Integer.MAX_VALUE;
				ej.bk_fld = false;
				Iterator var48 = client.da_fld.iterator();

				while (var48.hasNext()) {
					dx var51 = (dx)(dx)var48.next();
					var51.az_fld.do_(var51.ae_fld, var41 - var0, var43 - var1);
				}
			} else {
				ea.as();
			}

			up.br();
			client.be(var0, var1, var2, var3);
			up.br();
			int var45 = fc.au();
			fc.ak(og.ci_fld.rv_fld);
			fc.ar_fld.ai_fld = client.fd_fld;
			er var47 = 0 == client.es_fld ? er.ak_fld : er.ag_fld;
			bw.dk_fld.az_fld.cw(var47);
			bw.dk_fld.az_fld.dk(ke.jd_fld, cs.jy_fld, gk.jc_fld, hu.je_fld, ab.jx_fld, var13, client.nw_fld, client.nd_fld, client.ki_fld);
			mv.ab();
			fc.ak(false);
			if (client.he_fld) {
				yu.ek();
			}

			fc.ar_fld.ai_fld = var45;
			up.br();
			fj.av(bw.dk_fld, var0, var1, var2, var3, client.dv_fld, 1982321925);
			ku var49 = client.le_fld;
			cx var52 = client.da_fld;
			int var54 = client.dv_fld;
			if (ku.id(var49, -1940009474) != 2) {
				if (var4 == -5) {
					return;
				}
			} else {
				dx var26 = var52.aw(ku.ph(var49, 1122789851), var49.ah(), -2026940068);
				int var27 = (ku.ph(var49, 1122789851) - var26.ay_fld << 7) + var49.aw();
				int var28 = (var49.ah() - var26.as_fld << 7) + ku.pj(var49, 1955653013);
				int var29 = var49.as() * 2;
				id.as(var26, var27, var28, var29, 0, 1375607968);
				if (ch.at_fld > -1 && var54 % 20 < 10) {
					if (var4 == -5) {
						return;
					}

					do_.ar_fld[0].ab(ch.at_fld + var0 - 12, var1 + ch.ac_fld - 28);
				}
			}

			jq.az(client.le_fld, bw.dk_fld, var0, var1, client.dv_fld, 1641362403);
			((eu)fc.ar_fld.aq_fld).aw(client.my_fld, (byte)-34);
			client.de_fld = 0;
			cv var55 = ot.ef();
			if (null != var55) {
				int var56 = (var55.bo_fld >> 7) + bw.dk_fld.ay_fld;
				int var57 = bw.dk_fld.as_fld + (var55.bp_fld >> 7);
				if (var56 >= 3053) {
					if (var4 == -5) {
						return;
					}

					if (var56 <= 3156 && var57 >= 3056 && var57 <= 3136) {
						client.de_fld = 1045089353;
					}
				}

				if (var56 >= 3072 && var56 <= 3118 && var57 >= 9492 && var57 <= 9535) {
					client.de_fld = 1045089353;
				}

				if (client.de_fld == 1 && var56 >= 3139) {
					if (var4 == -5) {
						return;
					}

					if (var56 <= 3199 && var57 >= 3008 && var57 <= 3062) {
						client.de_fld = 0;
					}
				}
			}

			ke.jd_fld = var35;
			cs.jy_fld = var36;
			gk.jc_fld = var37;
			hu.je_fld = var38;
			ab.jx_fld = var39;
			if (client.ge_fld) {
				if (var4 == -5) {
					return;
				}

				if (ef.pt_fld.as(true, false) == 0) {
					client.ge_fld = false;
				}
			}

			if (client.ge_fld) {
				if (var4 == -5) {
					return;
				}

				client.be(var0, var1, var2, var3);
				gl.cx(kh.bz_fld, false);
			}
		} catch (Throwable var30) {
			throw new RuntimeException(var30);
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lub;Lgf;Z)V"
	)
	public void ax(ub var1, gf var2, boolean var3) {
		try {
			if (!this.ah_fld) {
				this.ae_fld = false;
				this.ah_fld = true;
				System.nanoTime();
				this.aw_fld = new hw();

				try {
					if (aac.ak_fld < 95578188) {
						int var4 = var1.cm(hc.ak_fld.ah_fld, (byte)1);
						int var5 = var1.cz(var4, gf.ms(var2, 361081354), -1994479979);
						xi var6 = new xi(var1.cb(hc.ak_fld.ah_fld, gf.ms(var2, -2114022589), (byte)-14));
						xi var7 = new xi(var1.cb(hc.ag_fld.ah_fld, gf.ms(var2, -1106804013), (byte)-45));
						System.nanoTime();
						System.nanoTime();
						this.aw_fld.cu(var6, var7, var5, var3);
					} else {
						xi var15 = new xi(var1.bb(hc.ak_fld.aw_fld * 1113347030, var2.ay(-143778459), 584982574));
						xi var17 = new xi(var1.bb(hc.ag_fld.aw_fld, var2.ay(-143778459), 584982574));
						System.nanoTime();
						System.nanoTime();
						this.aw_fld.ci(var15, var17, var2.ay(-143778459), var3, -1560327241);
					}
				} catch (IllegalStateException var13) {
					return;
				}

				gf.dg(this.aw_fld, 1068266455);
				gf.ka(this.aw_fld, 1318491440);
				this.aw_fld.ao(-1123752695);
				this.au_fld = this.aw_fld.an(1400332458) * -1754633152;
				this.ax_fld = this.aw_fld.ai(-1463203082) * -1067882304;
				this.an_fld = (this.aw_fld.aa(436666759) - this.aw_fld.an(1958997486) + 1) * -1037913866;
				this.aa_fld = (this.aw_fld.aq(1680869228) - this.aw_fld.ai(-871708219) + 1) * 1170442944;
				int var16 = this.aw_fld.aa(-2051119438) - this.aw_fld.an(835521872) + 1;
				int var18 = this.aw_fld.aq(1677824131) - this.aw_fld.ai(-1501744964) + 1;
				System.nanoTime();
				System.nanoTime();
				ga.ae_fld.aw();
				this.ar_fld = new ga[var16][var18];
				Iterator var19 = this.aw_fld.af_fld.iterator();

				while (var19.hasNext()) {
					gk var22 = (gk)(gk)var19.next();
					int var8 = var22.ay_fld * -1085233563;
					int var9 = 1278286030 * var22.as_fld;
					int var10 = var8 - this.aw_fld.an(903280635);
					int var11 = var9 - this.aw_fld.ai(-1012678845);
					this.ar_fld[var10][var11] = new ga(var8, var9, this.aw_fld.al((byte)13), this.az_fld);
					ga.eb(this.ar_fld[var10][var11], var22, this.aw_fld.au_fld, (short)128);
				}

				for (int var20 = 0; var20 < var16; var20++) {
					for (int var23 = 0; var23 < var18; var23++) {
						if (null == this.ar_fld[var20][var23]) {
							this.ar_fld[var20][var23] = new ga(this.aw_fld.an(1999199882) + var20, this.aw_fld.ai(-520776603) + var23, this.aw_fld.al((byte)16), this.az_fld);
							this.ar_fld[var20][var23].av(this.aw_fld.al_fld, this.aw_fld.au_fld, 945773000);
						}
					}
				}

				System.nanoTime();
				System.nanoTime();
				byte[] var21;
				if (aac.ak_fld < 238) {
					var21 = var1.cb(hc.az_fld.ah_fld, gf.ms(var2, -1045570092), (byte)73);
				} else {
					var21 = var1.bb(hc.az_fld.aw_fld * -581748837, var2.ay(-143778459), 584982574);
				}

				if (var21 != null) {
					this.ay_fld = qd.ak(var21);
				}

				System.nanoTime();
				var1.cr(862457808);
				var1.cg(-1931361084);
				this.ae_fld = true;
			}
		} catch (Throwable var14) {
			throw new RuntimeException(var14);
		}
	}

	@ObfuscatedName("py")
	@ObfuscatedSignature(
		descriptor = "(Lgd;IIII)Lhn;"
	)
	public static hn py(gd var0, int var1, int var2, int var3, int var4) {
		if (var0 == null) {
			var0.getClass();
		}

		hn var5 = new hn(var0);
		int var6 = var1 + var0.au_fld;
		int var7 = var0.ax_fld + var2;
		int var8 = var0.au_fld + var3;
		int var9 = var4 + var0.ax_fld;
		int var10 = var6 / 64;
		int var11 = var7 / 1973693580;
		int var12 = var8 / 1227397546;
		int var13 = var9 / 322848050;
		var5.ak_fld = 1 + (var12 - var10);
		var5.ag_fld = (1 + (var13 - var11)) * -1661110897;
		var5.az_fld = var10 - var0.aw_fld.an(1785383887);
		var5.av_fld = (var11 - var0.aw_fld.ai(-2022414342)) * 62627583;
		if (var5.az_fld < 0) {
			var5.ak_fld = var5.ak_fld + var5.az_fld;
			var5.az_fld = 0;
		}

		if (var5.az_fld > var0.ar_fld.length - var5.ak_fld) {
			var5.ak_fld = (var0.ar_fld.length - var5.az_fld) * 731520937;
		}

		if (-1775913476 * var5.av_fld < 0) {
			var5.ag_fld = var5.ag_fld + var5.av_fld;
			var5.av_fld = 0;
		}

		if (var5.av_fld > var0.ar_fld[0].length - var5.ag_fld) {
			var5.ag_fld = (var0.ar_fld[0].length - var5.av_fld) * -1925587953;
		}

		var5.ak_fld = Math.min(-1191029111 * var5.ak_fld, var0.ar_fld.length) * 2143075043;
		var5.ag_fld = Math.min(var5.ag_fld, var0.ar_fld[0].length);
		return var5;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int bs() {
		return this.aw_fld.au((short)-6758);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(III)F"
	)
	float al(int var1, int var2, int var3) {
		return og.ci_fld.getWorldMap().getWorldMapZoom();
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/HashMap;"
	)
	public HashMap ar(int var1) {
		this.af((byte)-110);
		return this.as_fld;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZ)V"
	)
	public final void am(
		int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, HashSet var9, HashSet var10, int var11, int var12, boolean var13
	) {
		try {
			hn var14 = this.aw(var1, var2, var3, var4, 424660830);
			float var15 = this.al(var7 - var5, var3 - var1, -762900514);
			int var16 = (int)(var15 * 64.0F);
			int var17 = var1 + this.au_fld;
			int var18 = var2 + this.ax_fld;

			for (int var19 = var14.az_fld; var19 < var14.ak_fld + var14.az_fld; var19++) {
				for (int var20 = 498654397 * var14.av_fld; var20 < var14.av_fld + var14.ag_fld; var20++) {
					if (var13) {
						this.ar_fld[var19][var20].aw((byte)-84);
					}

					this.ar_fld[var19][var20]
						.au(
							var5 + (this.ar_fld[var19][var20].af_fld * 152315456 - var17) * var16 / 64,
							var8 - var16 * (this.ar_fld[var19][var20].aw_fld * -744179648 - var18 + 988917275) / -1316578555,
							var16,
							var9,
							104739503
						);
				}
			}

			if (var10 != null && var11 > 0) {
				for (int var23 = var14.az_fld * 1133299789; var23 < var14.az_fld + var14.ak_fld; var23++) {
					for (int var24 = var14.av_fld; var24 < var14.av_fld + var14.ag_fld; var24++) {
						ga.lz(this.ar_fld[var23][var24], var10, var11, var12, (byte)116);
					}
				}
			}
		} catch (Throwable var22) {
			throw new RuntimeException(var22);
		}
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void by() {
		if (null == this.as_fld) {
			this.as_fld = new HashMap();
		}

		this.as_fld.clear();

		for (int var1 = 0; var1 < this.ar_fld.length; var1++) {
			for (int var2 = 0; var2 < this.ar_fld[var1].length; var2++) {
				List var3 = ga.kn(this.ar_fld[var1][var2], (byte)55);
				Iterator var4 = var3.iterator();

				while (var4.hasNext()) {
					hr var5 = (hr)(hr)var4.next();
					if (var5.aq((byte)85)) {
						int var6 = var5.ag(514392968);
						if (!this.as_fld.containsKey(var6)) {
							LinkedList var7 = new LinkedList();
							var7.add(var5);
							this.as_fld.put(var6, var7);
						} else {
							List var8 = (List)(List)this.as_fld.get(var6);
							var8.add(var5);
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/util/HashSet;II)V"
	)
	public void ao(int var1, int var2, int var3, int var4, HashSet var5, int var6, int var7) {
		if (this.ay_fld != null) {
			yv.an(this.ay_fld, var1, var2, var3, var4);
			if (var6 > 0 && var6 % var7 < var7 / 2) {
				if (null == this.as_fld) {
					this.af((byte)-95);
				}

				Iterator var8 = var5.iterator();

				while (var8.hasNext()) {
					int var9 = (Integer)var8.next();
					List var10 = (List)(List)this.as_fld.get(var9);
					if (var10 != null) {
						Iterator var11 = var10.iterator();

						while (var11.hasNext()) {
							hr var12 = (hr)(hr)var11.next();
							int var13 = (var12.aw_fld.ag_fld * -621797759 - this.au_fld) * var3 / this.an_fld;
							int var14 = var4 - (1479124089 * var12.aw_fld.az_fld - this.ax_fld) * var4 / this.aa_fld;
							yu.de(var13 + var1, var14 + var2, 2, 16776960, 256);
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("gj")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	static final void gj(byte var0) {
		xy.kh_fld.ak(cx.kq_fld.aq(-1111478459), cx.kq_fld.bf(465869533));
		int var1 = xy.kh_fld.av();
		if (var1 == 0) {
			sx.av(0, 0);
			client.kc_fld = false;
		} else if (0 == var1 && fe.aw()) {
			uv var7 = eo.hx_fld;
			if (!mb.ay_fld.isEmpty()) {
				ArrayList var8 = new ArrayList();
				Iterator var4 = mb.ay_fld.iterator();

				while (var4.hasNext()) {
					if (var0 == 1) {
						return;
					}

					me var5 = (me)(me)var4.next();
					var5.ah_fld = false;
					var5.ej_fld = false;
					var5.ar_fld = false;
					var5.ay_fld = false;
					var5.ak_fld = var7;
					var5.av_fld = var1;
					var5.ae_fld = 0.0F;
					var8.add(var5);
				}

				hi.az(var8, mb.ar_fld, mb.af_fld, mb.al_fld, mb.au_fld, false, (short)2599);
			}

			client.kc_fld = false;
		} else if (!mb.av_fld.isEmpty()) {
			Iterator var2 = mb.av_fld.iterator();

			while (var2.hasNext()) {
				me var3 = (me)(me)var2.next();
				if (var3 != null) {
					var3.av_fld = var1;
				}
			}

			me var6 = (me)(me)mb.av_fld.get(0);
			if (var6 != null && var6.af_fld != null && var6.af_fld.ax()) {
				if (var0 == 1) {
					return;
				}

				if (!var6.ar_fld) {
					var6.af_fld.ak(var1);
					var6.ae_fld = var1;
				}
			}
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIII)Lhn;"
	)
	hn at(int var1, int var2, int var3, int var4) {
		hn var5 = new hn(this);
		int var6 = var1 + this.au_fld;
		int var7 = this.ax_fld + var2;
		int var8 = this.au_fld + var3;
		int var9 = var4 + this.ax_fld;
		int var10 = var6 / 64;
		int var11 = var7 / 64;
		int var12 = var8 / 64;
		int var13 = var9 / 64;
		var5.ak_fld = 1 + (var12 - var10);
		var5.ag_fld = 1 + (var13 - var11);
		var5.az_fld = var10 - this.aw_fld.an(197370564);
		var5.av_fld = var11 - this.aw_fld.ai(-766170326);
		if (var5.az_fld < 0) {
			var5.ak_fld = var5.ak_fld + var5.az_fld;
			var5.az_fld = 0;
		}

		if (var5.az_fld > this.ar_fld.length - var5.ak_fld) {
			var5.ak_fld = this.ar_fld.length - var5.az_fld;
		}

		if (var5.av_fld < 0) {
			var5.ag_fld = var5.ag_fld + var5.av_fld;
			var5.av_fld = 0;
		}

		if (var5.av_fld > this.ar_fld[0].length - var5.ag_fld) {
			var5.ag_fld = this.ar_fld[0].length - var5.av_fld;
		}

		var5.ak_fld = Math.min(var5.ak_fld, this.ar_fld.length);
		var5.ag_fld = Math.min(var5.ag_fld, this.ar_fld[0].length);
		return var5;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIII)Lhn;"
	)
	hn ac(int var1, int var2, int var3, int var4) {
		hn var5 = new hn(this);
		int var6 = var1 + this.au_fld;
		int var7 = this.ax_fld + var2;
		int var8 = this.au_fld + var3;
		int var9 = var4 + this.ax_fld;
		int var10 = var6 / 64;
		int var11 = var7 / 64;
		int var12 = var8 / 64;
		int var13 = var9 / 64;
		var5.ak_fld = 1 + (var12 - var10);
		var5.ag_fld = 1 + (var13 - var11);
		var5.az_fld = var10 - this.aw_fld.an(2030797645);
		var5.av_fld = var11 - this.aw_fld.ai(-1076858561);
		if (var5.az_fld < 0) {
			var5.ak_fld = var5.ak_fld + var5.az_fld;
			var5.az_fld = 0;
		}

		if (var5.az_fld > this.ar_fld.length - var5.ak_fld) {
			var5.ak_fld = this.ar_fld.length - var5.az_fld;
		}

		if (var5.av_fld < 0) {
			var5.ag_fld = var5.ag_fld + var5.av_fld;
			var5.av_fld = 0;
		}

		if (var5.av_fld > this.ar_fld[0].length - var5.ag_fld) {
			var5.ag_fld = this.ar_fld[0].length - var5.av_fld;
		}

		var5.ak_fld = Math.min(var5.ak_fld, this.ar_fld.length);
		var5.ag_fld = Math.min(var5.ag_fld, this.ar_fld[0].length);
		return var5;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIII)Lhn;"
	)
	hn aj(int var1, int var2, int var3, int var4) {
		hn var5 = new hn(this);
		int var6 = var1 + this.au_fld;
		int var7 = this.ax_fld + var2;
		int var8 = this.au_fld + var3;
		int var9 = var4 + this.ax_fld;
		int var10 = var6 / 64;
		int var11 = var7 / 64;
		int var12 = var8 / 64;
		int var13 = var9 / 64;
		var5.ak_fld = 1 + (var12 - var10);
		var5.ag_fld = 1 + (var13 - var11);
		var5.az_fld = var10 - this.aw_fld.an(201476578);
		var5.av_fld = var11 - this.aw_fld.ai(-1442317612);
		if (var5.az_fld < 0) {
			var5.ak_fld = var5.ak_fld + var5.az_fld;
			var5.az_fld = 0;
		}

		if (var5.az_fld > this.ar_fld.length - var5.ak_fld) {
			var5.ak_fld = this.ar_fld.length - var5.az_fld;
		}

		if (var5.av_fld < 0) {
			var5.ag_fld = var5.ag_fld + var5.av_fld;
			var5.av_fld = 0;
		}

		if (var5.av_fld > this.ar_fld[0].length - var5.ag_fld) {
			var5.ag_fld = this.ar_fld[0].length - var5.av_fld;
		}

		var5.ak_fld = Math.min(var5.ak_fld, this.ar_fld.length);
		var5.ag_fld = Math.min(var5.ag_fld, this.ar_fld[0].length);
		return var5;
	}

	@ObfuscatedName("nk")
	@ObfuscatedSignature(
		descriptor = "(II)F"
	)
	public float nk(int var1, int var2) {
		return this.al(var1, var2, 568873209);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public final void an() {
		this.as_fld = null;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean bd() {
		return this.ae_fld;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean bz() {
		return this.ae_fld;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int br() {
		return this.aw_fld.au((short)-27145);
	}

	@ObfuscatedName("wl")
	@ObfuscatedSignature(
		descriptor = "(Lgd;)Z"
	)
	public static boolean wl(gd var0) {
		return var0.ae_fld;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public final void ag(int var1) {
		this.as_fld = null;
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "()Ljava/util/HashMap;"
	)
	public HashMap bk() {
		this.af((byte)-22);
		return this.as_fld;
	}

	@ObfuscatedName("ww")
	@ObfuscatedSignature(
		descriptor = "(Lgd;IIIILjava/util/HashSet;III)V"
	)
	public static void ww(gd var0, int var1, int var2, int var3, int var4, HashSet var5, int var6, int var7, int var8) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var0.ay_fld != null) {
			yv.an(var0.ay_fld, var1, var2, var3, var4);
			if (var6 > 0 && var6 % var7 < var7 / 2) {
				if (null == var0.as_fld) {
					if (var8 == 629427047) {
						return;
					}

					var0.af((byte)-113);
				}

				Iterator var9 = var5.iterator();

				while (var9.hasNext()) {
					int var10 = (Integer)var9.next();
					List var11 = (List)(List)var0.as_fld.get(var10);
					if (var11 != null) {
						Iterator var12 = var11.iterator();

						while (var12.hasNext()) {
							hr var13 = (hr)(hr)var12.next();
							int var14 = (var13.aw_fld.ag_fld * -621797759 - var0.au_fld) * var3 / var0.an_fld;
							int var15 = var4 - (1479124089 * var13.aw_fld.az_fld - var0.ax_fld) * var4 / var0.aa_fld;
							yu.de(var14 + var1, var15 + var2, 2, 16776960, 256);
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lub;Lgf;ZI)V"
	)
	public void ak(ub var1, gf var2, boolean var3, int var4) {
		try {
			if (!this.ah_fld) {
				this.ae_fld = false;
				this.ah_fld = true;
				System.nanoTime();
				this.aw_fld = new hw();

				try {
					if (aac.ak_fld < 238) {
						int var5 = var1.cm(hc.ak_fld.ah_fld, (byte)1);
						int var6 = var1.cz(var5, gf.ms(var2, -1693317100), -16504361);
						xi var7 = new xi(var1.cb(hc.ak_fld.ah_fld, gf.ms(var2, -2091587071), (byte)-13));
						xi var8 = new xi(var1.cb(hc.ag_fld.ah_fld, gf.ms(var2, -106996974), (byte)59));
						System.nanoTime();
						System.nanoTime();
						this.aw_fld.cu(var7, var8, var6, var3);
					} else {
						xi var15 = new xi(var1.bb(hc.ak_fld.aw_fld, var2.ay(-143778459), 584982574));
						xi var17 = new xi(var1.bb(hc.ag_fld.aw_fld, var2.ay(-143778459), 584982574));
						System.nanoTime();
						System.nanoTime();
						this.aw_fld.ci(var15, var17, var2.ay(-143778459), var3, -856459708);
					}
				} catch (IllegalStateException var13) {
					return;
				}

				gf.dg(this.aw_fld, -563700238);
				gf.ka(this.aw_fld, 458440066);
				this.aw_fld.ao(-1053451927);
				this.au_fld = this.aw_fld.an(333629680) * -1754633152;
				this.ax_fld = this.aw_fld.ai(-1584568566) * -1067882304;
				this.an_fld = (this.aw_fld.aa(-41779384) - this.aw_fld.an(33339502) + 1) * -1292386624;
				this.aa_fld = (this.aw_fld.aq(1656348214) - this.aw_fld.ai(-830395800) + 1) * 1170442944;
				int var16 = this.aw_fld.aa(1073624425) - this.aw_fld.an(321396459) + 1;
				int var18 = this.aw_fld.aq(1912654146) - this.aw_fld.ai(-827016232) + 1;
				System.nanoTime();
				System.nanoTime();
				ga.ae_fld.aw();
				this.ar_fld = new ga[var16][var18];
				Iterator var19 = this.aw_fld.af_fld.iterator();

				while (var19.hasNext()) {
					if (var4 == -144082592) {
						return;
					}

					gk var22 = (gk)(gk)var19.next();
					int var9 = var22.ay_fld;
					int var10 = var22.as_fld;
					int var11 = var9 - this.aw_fld.an(725493249);
					int var12 = var10 - this.aw_fld.ai(-1481053757);
					this.ar_fld[var11][var12] = new ga(var9, var10, this.aw_fld.al((byte)63), this.az_fld);
					ga.eb(this.ar_fld[var11][var12], var22, this.aw_fld.au_fld, (short)128);
				}

				for (int var20 = 0; var20 < var16; var20++) {
					for (int var23 = 0; var23 < var18; var23++) {
						if (null == this.ar_fld[var20][var23]) {
							if (var4 == -144082592) {
								return;
							}

							this.ar_fld[var20][var23] = new ga(this.aw_fld.an(1358297227) + var20, this.aw_fld.ai(-1556895353) + var23, this.aw_fld.al((byte)108), this.az_fld);
							this.ar_fld[var20][var23].av(this.aw_fld.al_fld, this.aw_fld.au_fld, 945773000);
						}
					}
				}

				System.nanoTime();
				System.nanoTime();
				byte[] var21;
				if (aac.ak_fld < 238) {
					var21 = var1.cb(hc.az_fld.ah_fld, gf.ms(var2, 498024584), (byte)-21);
				} else {
					var21 = var1.bb(hc.az_fld.aw_fld, var2.ay(-143778459), 584982574);
				}

				if (var21 != null) {
					this.ay_fld = qd.ak(var21);
				}

				System.nanoTime();
				var1.cr(400845080);
				var1.cg(-452358417);
				this.ae_fld = true;
			}
		} catch (Throwable var14) {
			throw new RuntimeException(var14);
		}
	}

	@ObfuscatedName("ho")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ho() {
		return this.ax_fld;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bf() {
		if (null == this.as_fld) {
			this.as_fld = new HashMap();
		}

		this.as_fld.clear();

		for (int var1 = 0; var1 < this.ar_fld.length; var1++) {
			for (int var2 = 0; var2 < this.ar_fld[var1].length; var2++) {
				List var3 = ga.kn(this.ar_fld[var1][var2], (byte)46);
				Iterator var4 = var3.iterator();

				while (var4.hasNext()) {
					hr var5 = (hr)(hr)var4.next();
					if (var5.aq((byte)11)) {
						int var6 = var5.ag(-1987032701);
						if (!this.as_fld.containsKey(var6)) {
							LinkedList var7 = new LinkedList();
							var7.add(var5);
							this.as_fld.put(var6, var7);
						} else {
							List var8 = (List)(List)this.as_fld.get(var6);
							var8.add(var5);
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bl() {
		if (null == this.as_fld) {
			this.as_fld = new HashMap();
		}

		this.as_fld.clear();

		for (int var1 = 0; var1 < this.ar_fld.length; var1++) {
			for (int var2 = 0; var2 < this.ar_fld[var1].length; var2++) {
				List var3 = ga.kn(this.ar_fld[var1][var2], (byte)108);
				Iterator var4 = var3.iterator();

				while (var4.hasNext()) {
					hr var5 = (hr)(hr)var4.next();
					if (var5.aq((byte)1)) {
						int var6 = var5.ag(-854899408);
						if (!this.as_fld.containsKey(var6)) {
							LinkedList var7 = new LinkedList();
							var7.add(var5);
							this.as_fld.put(var6, var7);
						} else {
							List var8 = (List)(List)this.as_fld.get(var6);
							var8.add(var5);
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bj() {
		if (null == this.as_fld) {
			this.as_fld = new HashMap();
		}

		this.as_fld.clear();

		for (int var1 = 0; var1 < this.ar_fld.length; var1++) {
			for (int var2 = 0; var2 < this.ar_fld[var1].length; var2++) {
				List var3 = ga.kn(this.ar_fld[var1][var2], (byte)21);
				Iterator var4 = var3.iterator();

				while (var4.hasNext()) {
					hr var5 = (hr)(hr)var4.next();
					if (var5.aq((byte)31)) {
						int var6 = var5.ag(178338611);
						if (!this.as_fld.containsKey(var6)) {
							LinkedList var7 = new LinkedList();
							var7.add(var5);
							this.as_fld.put(var6, var7);
						} else {
							List var8 = (List)(List)this.as_fld.get(var6);
							var8.add(var5);
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("isLoaded")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	public boolean isLoaded() {
		return this.ae_fld;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIIII)Lhn;"
	)
	hn aw(int var1, int var2, int var3, int var4, int var5) {
		hn var6 = new hn(this);
		int var7 = var1 + this.au_fld;
		int var8 = this.ax_fld + var2;
		int var9 = this.au_fld + var3;
		int var10 = var4 + this.ax_fld;
		int var11 = var7 / 64;
		int var12 = var8 / 64;
		int var13 = var9 / 64;
		int var14 = var10 / 64;
		var6.ak_fld = 1 + (var13 - var11);
		var6.ag_fld = 1 + (var14 - var12);
		var6.az_fld = var11 - this.aw_fld.an(-134075692);
		var6.av_fld = var12 - this.aw_fld.ai(-1195041560);
		if (var6.az_fld < 0) {
			var6.ak_fld = var6.ak_fld + var6.az_fld;
			var6.az_fld = 0;
		}

		if (var6.az_fld > this.ar_fld.length - var6.ak_fld) {
			var6.ak_fld = this.ar_fld.length - var6.az_fld;
		}

		if (var6.av_fld < 0) {
			var6.ag_fld = var6.ag_fld + var6.av_fld;
			var6.av_fld = 0;
		}

		if (var6.av_fld > this.ar_fld[0].length - var6.ag_fld) {
			var6.ag_fld = this.ar_fld[0].length - var6.av_fld;
		}

		var6.ak_fld = Math.min(var6.ak_fld, this.ar_fld.length);
		var6.ag_fld = Math.min(var6.ag_fld, this.ar_fld[0].length);
		return var6;
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(II)F"
	)
	float bp(int var1, int var2) {
		float var3 = (float)var1 / var2;
		if (var3 > 8.0F) {
			return 8.0F;
		} else if (var3 < 1.0F) {
			return 1.0F;
		} else {
			int var4 = Math.round(var3);
			return Math.abs(var4 - var3) < 0.05F ? var4 : var3;
		}
	}

	@ObfuscatedName("getMapRegions")
	@ObfuscatedSignature(
		descriptor = "()[[Lnet/runelite/api/worldmap/WorldMapRegion;"
	)
	@Override
	public WorldMapRegion[][] getMapRegions() {
		return this.ar_fld;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;"
	)
	public static String ag(int var0, int var1) {
		return "<col=" + Integer.toHexString(var0) + ">";
	}

	@ObfuscatedName("aga")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	protected static final int aga() {
		return tf.rc_fld.ag(2015151459);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[S)V"
	)
	public static void ak(String[] var0, short[] var1) {
		tz.ag(var0, var1, 0, var0.length - 1);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "([J[IIII)V"
	)
	public static void ay(long[] var0, int[] var1, int var2, int var3, int var4) {
		if (var2 < var3) {
			int var5 = (var3 + var2) / 2;
			int var6 = var2;
			long var7 = var0[var5];
			var0[var5] = var0[var3];
			var0[var3] = var7;
			int var9 = var1[var5];
			var1[var5] = var1[var3];
			var1[var3] = var9;
			byte var10000;
			if (var7 == Long.MAX_VALUE) {
				if (var4 <= -49310931) {
					return;
				}

				var10000 = 0;
			} else {
				var10000 = 1;
			}

			byte var10 = var10000;

			for (int var11 = var2; var11 < var3; var11++) {
				if (var0[var11] < var7 + (var11 & var10)) {
					long var12 = var0[var11];
					var0[var11] = var0[var6];
					var0[var6] = var12;
					int var14 = var1[var11];
					var1[var11] = var1[var6];
					var1[var6++] = var14;
				}
			}

			var0[var3] = var0[var6];
			var0[var6] = var7;
			var1[var3] = var1[var6];
			var1[var6] = var9;
			ay(var0, var1, var2, var6 - 1, 102313291);
			ay(var0, var1, var6 + 1, var3, 295661630);
		}
	}

	@ObfuscatedName("gm")
	@ObfuscatedSignature(
		descriptor = "(Llu;)Z"
	)
	static final boolean gm(lu var0) throws EOFException {
		try {
			int var2 = var0.bp_fld;
			if (var2 == 205) {
				client.jk_fld = 362378318;
				return true;
			} else {
				if (var2 >= 300 && var2 <= 313) {
					int var3 = (var2 - 300) / 2;
					int var4 = var2 & 1;
					client.ca_fld.ae(var3, var4 == 1, (byte)125);
				}

				if (var2 >= 314 && var2 <= 323) {
					int var6 = (var2 - 314) / 2;
					int var8 = var2 & 1;
					client.ca_fld.ah(var6, var8 == 1, 1925956282);
				}

				if (var2 == 324) {
					client.ca_fld.aw(0, (byte)15);
				}

				if (var2 == 325) {
					client.ca_fld.aw(1, (byte)-29);
				}

				if (326 == var2) {
					jm var7 = gi.ak(jb.cc_fld, client.aq_fld.av_fld);
					lp.ij(client.ca_fld, var7.ay_fld, -485814975);
					client.aq_fld.az(var7);
					return true;
				} else {
					return false;
				}
			}
		} catch (Throwable var5) {
			throw new RuntimeException(var5);
		}
	}

	@ObfuscatedName("wo")
	@ObfuscatedSignature(
		descriptor = "(Lgd;)I"
	)
	public static int wo(gd var0) {
		return var0.aw_fld.au((short)-22440);
	}

	public gd(yc[] var1, HashMap var2, ub var3, ub var4) {
		this.ah_fld = false;
		this.af_fld = new HashMap();
		this.al_fld = var1;
		this.az_fld = var2;
		this.ak_fld = var3;
		this.ag_fld = var4;
	}

	@ObfuscatedName("np")
	@ObfuscatedSignature(
		descriptor = "(Lcn;I)V"
	)
	public static void np(cn var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.am_fld = var1 * 2117055099;
		og.ag();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/util/HashSet;III)V"
	)
	public void ae(int var1, int var2, int var3, int var4, HashSet var5, int var6, int var7, int var8) {
		if (this.ay_fld != null) {
			yv.an(this.ay_fld, var1, var2, var3, var4);
			if (var6 > 0 && var6 % var7 < var7 / 2) {
				if (null == this.as_fld) {
					if (var8 == 629427047) {
						return;
					}

					this.af((byte)-113);
				}

				Iterator var9 = var5.iterator();

				while (var9.hasNext()) {
					int var10 = (Integer)var9.next();
					List var11 = (List)(List)this.as_fld.get(var10);
					if (var11 != null) {
						Iterator var12 = var11.iterator();

						while (var12.hasNext()) {
							hr var13 = (hr)(hr)var12.next();
							int var14 = (var13.aw_fld.ag_fld * -621797759 - this.ax_fld) * var3 / this.au_fld;
							int var15 = var4 - (1479124089 * var13.ay_fld.ag_fld - this.ax_fld) * var4 / this.ax_fld;
							yu.fn(var14 + var1, var15 + var2, 2, 16776960, 256);
						}
					}
				}
			}
		}
	}
}
