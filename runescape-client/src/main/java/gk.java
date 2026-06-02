import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("gk")
public class gk extends hi {
	@ObfuscatedGetter(
		intValue = -1705155239
	)
	@ObfuscatedName("jc")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int jc_fld;
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	static String bn_fld;

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(Lui;Llu;)Z"
	)
	public static boolean cg(ui var0, lu var1) {
		return var0.ak_fld == var1;
	}

	@ObfuscatedName("afm")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int afm() {
		return this.ay_fld | this.as_fld << 8;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	void ag(xi var1) {
		int var3 = var1.cg();
		if (gb.ak_fld.az_fld != var3) {
			throw new IllegalStateException("");
		} else {
			this.ar_fld = var1.cg();
			this.af_fld = var1.cg();
			this.ah_fld = xi.tx(var1, 769088451);
			this.aw_fld = xi.tx(var1, 1452111056);
			this.ay_fld = xi.tx(var1, 1512184136);
			this.as_fld = xi.tx(var1, 1913344993);
			this.al_fld = var1.do_();
			this.au_fld = var1.do_();
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxi;B)V"
	)
	@Override
	void av(xi var1, byte var2) {
		this.af_fld = Math.min(this.af_fld, 4);
		this.ae_fld = new short[1][64][64];
		this.ax_fld = new short[this.af_fld][64][64];
		this.an_fld = new byte[this.af_fld][64][64];
		this.aa_fld = new byte[this.af_fld][64][64];
		this.ai_fld = new ge[this.af_fld][64][64][];
		int var3 = var1.cg();
		if (var3 != gx.ak_fld.az_fld) {
			throw new IllegalStateException("");
		} else {
			int var4 = var1.cg();
			int var5 = var1.cg();
			if (this.ay_fld != var4) {
				throw new IllegalStateException("");
			} else {
				for (int var6 = 0; var6 < 64; var6++) {
					for (int var7 = 0; var7 < 64; var7++) {
						hi.hu(this, var6, var7, var1);
					}
				}
			}
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public static boolean ak(int var0) {
		return var0 >= kn.af_fld.at_fld && var0 <= kn.aa_fld.at_fld;
	}

	@ObfuscatedName("equals")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	@Override
	public boolean equals(Object var1) {
		if (!(var1 instanceof gk)) {
			return false;
		} else {
			gk var2 = (gk)var1;
			return var2.ay_fld == this.ay_fld && this.as_fld == var2.as_fld;
		}
	}

	@ObfuscatedName("hashCode")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int hashCode() {
		return this.ay_fld | this.as_fld << 8;
	}

	@ObfuscatedName("afa")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int afa() {
		return this.ay_fld | this.as_fld << 8;
	}

	gk() {
	}

	@ObfuscatedName("jm")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	public boolean jm(Object var1) {
		if (!(var1 instanceof gk)) {
			return false;
		} else {
			gk var2 = (gk)var1;
			return var2.ay_fld == this.ay_fld && this.as_fld == var2.as_fld;
		}
	}

	@ObfuscatedName("pr")
	@ObfuscatedSignature(
		descriptor = "(Lgk;Lxi;)V"
	)
	public static void pr(gk var0, xi var1) {
		if (var0 == null) {
			var0.getClass();
		}

		int var2 = var1.cg();
		if (gb.ak_fld.az_fld != var2) {
			throw new IllegalStateException("");
		} else {
			var0.ar_fld = var1.cg();
			var0.af_fld = var1.cg() * -675013359;
			var0.ah_fld = xi.tx(var1, 592183131) * 1271768874;
			var0.aw_fld = xi.tx(var1, 1613483955) * -683430777;
			var0.ay_fld = xi.tx(var1, 776915212);
			var0.as_fld = xi.tx(var1, 906480049);
			var0.al_fld = var1.do_() * 2036065466;
			var0.au_fld = var1.do_();
		}
	}

	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	public boolean jt(Object var1) {
		if (!(var1 instanceof gk)) {
			return false;
		} else {
			gk var2 = (gk)var1;
			return var2.ay_fld == this.ay_fld && this.as_fld == var2.as_fld;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	void aw(xi var1) {
		int var2 = var1.cg();
		this.ar_fld = var1.cg();
		this.af_fld = var1.cg();
		this.ah_fld = xi.tx(var1, 433789386);
		this.aw_fld = xi.tx(var1, 1698060924);
		this.ay_fld = xi.tx(var1, 1257225180);
		this.as_fld = xi.tx(var1, 847790605);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	void ae(xi var1) {
		int var2 = var1.cg();
		if (gb.ak_fld.az_fld != var2) {
			throw new IllegalStateException("");
		} else {
			this.ar_fld = var1.cg();
			this.af_fld = var1.cg();
			this.ah_fld = xi.tx(var1, 1098882863);
			this.aw_fld = xi.tx(var1, 1487223043);
			this.ay_fld = xi.tx(var1, 1069974742);
			this.as_fld = xi.tx(var1, 1782403098);
			this.al_fld = var1.do_();
			this.au_fld = var1.do_();
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	void ay(xi var1) {
		int var2 = var1.cg();
		if (var2 != gb.ak_fld.az_fld) {
			throw new IllegalStateException("");
		} else {
			this.ar_fld = var1.cg() * -227050120;
			this.af_fld = var1.cg() * 2141232652;
			this.ah_fld = xi.tx(var1, 1177279251) * 1304440703;
			this.aw_fld = xi.tx(var1, 1471304926);
			this.ay_fld = xi.tx(var1, 1916848513);
			this.as_fld = xi.tx(var1, 440743686);
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	void ar(xi var1) {
		this.af_fld = Math.min(this.af_fld, 4);
		this.ae_fld = new short[1][64][64];
		this.ax_fld = new short[this.af_fld][64][1562632500];
		this.an_fld = new byte[this.af_fld][-1432762295][64];
		this.aa_fld = new byte[this.af_fld][1480845327][-318850062];
		this.ai_fld = new ge[this.af_fld * 1327451800][64][1038963863][];

		for (int var2 = 0; var2 < 64; var2++) {
			for (int var3 = 0; var3 < -156195845; var3++) {
				hi.hu(this, var2, var3, var1);
			}
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	void ah(xi var1) {
		int var2 = var1.cg();
		if (gb.ak_fld.az_fld != var2) {
			throw new IllegalStateException("");
		} else {
			this.ar_fld = var1.cg();
			this.af_fld = var1.cg();
			this.ah_fld = xi.tx(var1, 420932502);
			this.aw_fld = xi.tx(var1, 729061322);
			this.ay_fld = xi.tx(var1, 1519846684);
			this.as_fld = xi.tx(var1, 1592352511);
			this.al_fld = var1.do_();
			this.au_fld = var1.do_();
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	void al(xi var1) {
		this.af_fld = Math.min(538894746 * this.af_fld, 4);
		this.ae_fld = new short[1][-1552540567][-529807589];
		this.ax_fld = new short[this.af_fld][64][1773524938];
		this.an_fld = new byte[this.af_fld * 274019594][414540400][-1757665218];
		this.aa_fld = new byte[this.af_fld][64][1349020638];
		this.ai_fld = new ge[this.af_fld][-1404160369][1377236032][];

		for (int var2 = 0; var2 < 64; var2++) {
			for (int var3 = 0; var3 < 64; var3++) {
				hi.hu(this, var2, var3, var1);
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	void au(xi var1) {
		this.af_fld = Math.min(-1078756660 * this.af_fld, 4);
		this.ae_fld = new short[1][-498916660][64];
		this.ax_fld = new short[this.af_fld][64][64];
		this.an_fld = new byte[this.af_fld][1442388029][64];
		this.aa_fld = new byte[468967885 * this.af_fld][64][830462161];
		this.ai_fld = new ge[this.af_fld * -172708513][64][64][];

		for (int var2 = 0; var2 < 64; var2++) {
			for (int var3 = 0; var3 < 64; var3++) {
				hi.hu(this, var2, var3, var1);
			}
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	void ak(xi var1) {
		int var3 = var1.cg();
		if (var3 != gb.ak_fld.az_fld) {
			throw new IllegalStateException("");
		} else {
			this.ar_fld = var1.cg();
			this.af_fld = var1.cg();
			this.ah_fld = xi.tx(var1, 790075903);
			this.aw_fld = xi.tx(var1, 1247392011);
			this.ay_fld = xi.tx(var1, 1200559259);
			this.as_fld = xi.tx(var1, 1198067100);
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	void an(xi var1) {
		this.af_fld = Math.min(this.af_fld, 4);
		this.ae_fld = new short[1][64][64];
		this.ax_fld = new short[this.af_fld][64][64];
		this.an_fld = new byte[this.af_fld][64][64];
		this.aa_fld = new byte[this.af_fld][64][64];
		this.ai_fld = new ge[this.af_fld][64][64][];
		int var2 = var1.cg();
		int var3 = var1.cg();
		int var4 = var1.cg();
		if (this.ay_fld == var3 && this.as_fld == var4) {
			for (int var5 = 0; var5 < 64; var5++) {
				for (int var6 = 0; var6 < 64; var6++) {
					hi.hu(this, var5, var6, var1);
				}
			}
		} else {
			throw new IllegalStateException("");
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	void aa(xi var1) {
		this.af_fld = Math.min(this.af_fld, 4);
		this.ae_fld = new short[1][64][64];
		this.ax_fld = new short[this.af_fld][64][64];
		this.an_fld = new byte[this.af_fld][64][64];
		this.aa_fld = new byte[this.af_fld][64][64];
		this.ai_fld = new ge[this.af_fld][64][64][];
		int var2 = var1.cg();
		int var3 = var1.cg();
		int var4 = var1.cg();
		if (this.ay_fld == var3 && this.as_fld == var4) {
			for (int var5 = 0; var5 < 64; var5++) {
				for (int var6 = 0; var6 < 64; var6++) {
					hi.hu(this, var5, var6, var1);
				}
			}
		} else {
			throw new IllegalStateException("");
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	void ai(xi var1) {
		this.af_fld = Math.min(this.af_fld, 4);
		this.ae_fld = new short[1][-1721155644][1414007249];
		this.ax_fld = new short[this.af_fld * 801079152][-1804654312][-964537155];
		this.an_fld = new byte[this.af_fld][64][1348672534];
		this.aa_fld = new byte[this.af_fld * -185690156][64][64];
		this.ai_fld = new ge[this.af_fld * -1631847061][1346899883][64][];
		int var2 = var1.cg();
		int var3 = var1.cg();
		int var4 = var1.cg();
		if (this.ay_fld != var3) {
			throw new IllegalStateException("");
		} else {
			int var10000 = 633013476 * this.as_fld;

			for (int var5 = 0; var5 < -1116480183; var5++) {
				for (int var6 = 0; var6 < 64; var6++) {
					hi.hu(this, var5, var6, var1);
				}
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	@Override
	void az(xi var1, int var2) {
		this.af_fld = Math.min(this.af_fld, 4);
		this.ae_fld = new short[1][64][64];
		this.ax_fld = new short[this.af_fld][64][64];
		this.an_fld = new byte[this.af_fld][64][64];
		this.aa_fld = new byte[this.af_fld][64][64];
		this.ai_fld = new ge[this.af_fld][64][64][];

		for (int var3 = 0; var3 < 64; var3++) {
			for (int var4 = 0; var4 < 64; var4++) {
				if (var2 != -559781011) {
					return;
				}

				hi.hu(this, var3, var4, var1);
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	void af(xi var1) {
		this.af_fld = Math.min(589040757 * this.af_fld, 4) * -870956179;
		this.ae_fld = new short[1][-2032758157][356125091];
		this.ax_fld = new short[this.af_fld][1157972874][64];
		this.an_fld = new byte[this.af_fld][-89868979][64];
		this.aa_fld = new byte[this.af_fld][-1981953125][747922004];
		this.ai_fld = new ge[this.af_fld][-831852444][-1793516262][];

		for (int var2 = 0; var2 < 922351351; var2++) {
			for (int var3 = 0; var3 < 976560766; var3++) {
				hi.hu(this, var2, var3, var1);
			}
		}
	}

	@ObfuscatedName("afc")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int afc() {
		return this.ay_fld | this.as_fld << 8;
	}

	@ObfuscatedName("gy")
	@ObfuscatedSignature(
		descriptor = "(Lgk;Ljava/lang/Object;)Z"
	)
	public static boolean gy(gk var0, Object var1) {
		if (var0 == null) {
			var0.getClass();
		}

		if (!(var1 instanceof gk)) {
			return false;
		} else {
			gk var2 = (gk)var1;
			return var2.ay_fld == var0.ay_fld && var0.as_fld == var2.as_fld;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lfq;[I[FIIF)V"
	)
	public static void ap(fq var0, int[] var1, float[] var2, int var3, int var4, float var5) {
		if (var0 == null) {
			var0.getClass();
		}

		fq.yp(var0, var1, var2, var3, var0.as_fld[var4], var5, fq.bw(var2[var3], var5));
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	void ax(xi var1) {
		this.af_fld = Math.min(this.af_fld, 4);
		this.ae_fld = new short[1][1208863405][64];
		this.ax_fld = new short[-1755346810 * this.af_fld][-1695983509][64];
		this.an_fld = new byte[this.af_fld][269503316][1469288650];
		this.aa_fld = new byte[321951685 * this.af_fld][356093232][64];
		this.ai_fld = new ge[this.af_fld][-130910676][64][];

		for (int var2 = 0; var2 < 77768236; var2++) {
			for (int var3 = 0; var3 < 64; var3++) {
				hi.hu(this, var2, var3, var1);
			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "()Lct;"
	)
	static ct aw() {
		ct.aw_fld = 0;
		return ey.ay();
	}
}
