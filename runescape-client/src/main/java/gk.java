import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("gk")
public class gk extends hi {
	@ObfuscatedName("jc")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1705155239
	)
	static int jc_fld;
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	static String bn_fld;

	@ObfuscatedName("afm")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int afm() {
		return this.ah_fld | this.af_fld << 8;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxi;B)V"
	)
	@Override
	void av(xi var1, byte var2) {
		this.al_fld = Math.min(this.al_fld, 4);
		this.ae_fld = new short[1][64][64];
		this.ax_fld = new short[this.al_fld][64][64];
		this.an_fld = new byte[this.al_fld][64][64];
		this.aa_fld = new byte[this.al_fld][64][64];
		this.ai_fld = new ge[this.al_fld][64][64][];
		int var3 = var1.cg();
		if (var3 != gx.ak_fld.az_fld) {
			throw new IllegalStateException("");
		} else {
			int var4 = var1.cg();
			int var5 = var1.cg();
			if (this.ah_fld != var4) {
				throw new IllegalStateException("");
			} else {
				for (int var6 = 0; var6 < 64; var6++) {
					for (int var7 = 0; var7 < 64; var7++) {
						this.bh(var6, var7, var1);
					}
				}
			}
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IB)Z"
	)
	public static boolean ak(int var0) {
		return var0 >= kn.af_fld.at_fld && var0 <= kn.aa_fld.at_fld;
	}

	@ObfuscatedName("fo")
	@ObfuscatedSignature(
		descriptor = "(Lgk;Lxi;)V"
	)
	public static void fo(gk var0, xi var1) {
		if (var0 == null) {
			var0.getClass();
		} else {
			int var2 = var1.cg();
			if (gb.ak_fld.az_fld != var2) {
				throw new IllegalStateException("");
			} else {
				var0.aw_fld = var1.cg();
				var0.al_fld = var1.cg();
				var0.au_fld = var1.cm();
				var0.ay_fld = var1.cm();
				var0.ah_fld = var1.cm();
				var0.af_fld = var1.cm();
				var0.ar_fld = xi.kt(var1, (byte)-70);
				var0.as_fld = xi.kt(var1, (byte)-8);
			}
		}
	}

	@ObfuscatedName("equals")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	@Export("equals")
	@Override
	public boolean equals(Object var1) {
		if (!(var1 instanceof gk)) {
			return false;
		} else {
			gk var2 = (gk)var1;
			return var2.ah_fld == this.ah_fld && this.af_fld == var2.af_fld;
		}
	}

	@ObfuscatedName("hashCode")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("hashCode")
	@Override
	public int hashCode() {
		return this.ah_fld | this.af_fld << 8;
	}

	@ObfuscatedName("afa")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int afa() {
		return this.ah_fld | this.af_fld << 8;
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
			return var2.ah_fld == this.ah_fld && this.af_fld == var2.af_fld;
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
			return var2.ah_fld == this.ah_fld && this.af_fld == var2.af_fld;
		}
	}

	@ObfuscatedName("fz")
	@ObfuscatedSignature(
		descriptor = "(Lgk;Ljava/lang/Object;)Z"
	)
	public static boolean fz(gk var0, Object var1) {
		if (var0 == null) {
			var0.getClass();
		}

		if (!(var1 instanceof gk)) {
			return false;
		} else {
			gk var2 = (gk)var1;
			return var2.ah_fld == var0.ah_fld && var0.af_fld == var2.af_fld;
		}
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
			this.aw_fld = var1.cg();
			this.al_fld = var1.cg();
			this.au_fld = var1.cm();
			this.ay_fld = var1.cm();
			this.ah_fld = var1.cm();
			this.af_fld = var1.cm();
			this.ar_fld = xi.kt(var1, (byte)-112);
			this.as_fld = xi.kt(var1, (byte)-123);
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	void as(xi var1) {
		int var2 = var1.cg();
		if (var2 != gb.ak_fld.az_fld) {
			throw new IllegalStateException("");
		} else {
			this.aw_fld = var1.cg() * -227050120;
			this.al_fld = var1.cg() * 2141232652;
			this.au_fld = var1.cm() * 1304440703;
			this.ay_fld = var1.cm();
			this.ah_fld = var1.cm();
			this.af_fld = var1.cm();
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	void aw(xi var1) {
		int var2 = var1.cg();
		if (gb.ak_fld.az_fld != var2) {
			throw new IllegalStateException("");
		} else {
			this.aw_fld = var1.cg();
			this.al_fld = var1.cg() * -675013359;
			this.au_fld = var1.cm() * 1271768874;
			this.ay_fld = var1.cm() * -683430777;
			this.ah_fld = var1.cm();
			this.af_fld = var1.cm();
			this.ar_fld = xi.kt(var1, (byte)-71) * 2036065466;
			this.as_fld = xi.kt(var1, (byte)-107);
		}
	}

	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "(Lgk;Lxi;B)V"
	)
	public static void de(gk var0, xi var1, byte var2) {
		if (var0 == null) {
			var0.getClass();
		} else {
			int var3 = var1.cg();
			if (gb.ak_fld.az_fld != var3) {
				throw new IllegalStateException("");
			} else {
				var0.aw_fld = var1.cg();
				var0.al_fld = var1.cg();
				var0.au_fld = var1.cm();
				var0.ay_fld = var1.cm();
				var0.ah_fld = var1.cm();
				var0.af_fld = var1.cm();
				var0.ar_fld = xi.kt(var1, (byte)0);
				var0.as_fld = xi.kt(var1, (byte)-75);
			}
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	void ar(xi var1) {
		this.al_fld = Math.min(this.al_fld, 4);
		this.ae_fld = new short[1][64][64];
		this.ax_fld = new short[this.al_fld][64][1562632500];
		this.an_fld = new byte[this.al_fld][-1432762295][64];
		this.aa_fld = new byte[this.al_fld][1480845327][-318850062];
		this.ai_fld = new ge[this.al_fld * 1327451800][64][1038963863][];

		for (int var2 = 0; var2 < 64; var2++) {
			for (int var3 = 0; var3 < -156195845; var3++) {
				this.bh(var2, var3, var1);
			}
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	void al(xi var1) {
		this.al_fld = Math.min(538894746 * this.al_fld, 4);
		this.ae_fld = new short[1][-1552540567][-529807589];
		this.ax_fld = new short[this.al_fld][64][1773524938];
		this.an_fld = new byte[this.al_fld * 274019594][414540400][-1757665218];
		this.aa_fld = new byte[this.al_fld][64][1349020638];
		this.ai_fld = new ge[this.al_fld][-1404160369][1377236032][];

		for (int var2 = 0; var2 < 64; var2++) {
			for (int var3 = 0; var3 < 64; var3++) {
				this.bh(var2, var3, var1);
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	void au(xi var1) {
		this.al_fld = Math.min(-1078756660 * this.al_fld, 4);
		this.ae_fld = new short[1][-498916660][64];
		this.ax_fld = new short[this.al_fld][64][64];
		this.an_fld = new byte[this.al_fld][1442388029][64];
		this.aa_fld = new byte[468967885 * this.al_fld][64][830462161];
		this.ai_fld = new ge[this.al_fld * -172708513][64][64][];

		for (int var2 = 0; var2 < 64; var2++) {
			for (int var3 = 0; var3 < 64; var3++) {
				this.bh(var2, var3, var1);
			}
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	void ak(xi var1) {
		int var3 = var1.cg();
		if (var3 != gb.ak_fld.az_fld) {
			throw new IllegalStateException("");
		} else {
			this.aw_fld = var1.cg();
			this.al_fld = var1.cg();
			this.au_fld = var1.cm();
			this.ay_fld = var1.cm();
			this.ah_fld = var1.cm();
			this.af_fld = var1.cm();
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	void an(xi var1) {
		this.al_fld = Math.min(this.al_fld, 4);
		this.ae_fld = new short[1][64][64];
		this.ax_fld = new short[this.al_fld][64][64];
		this.an_fld = new byte[this.al_fld][64][64];
		this.aa_fld = new byte[this.al_fld][64][64];
		this.ai_fld = new ge[this.al_fld][64][64][];
		int var2 = var1.cg();
		int var3 = var1.cg();
		int var4 = var1.cg();
		if (this.ah_fld == var3 && this.af_fld == var4) {
			for (int var5 = 0; var5 < 64; var5++) {
				for (int var6 = 0; var6 < 64; var6++) {
					this.bh(var5, var6, var1);
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
		this.al_fld = Math.min(this.al_fld, 4);
		this.ae_fld = new short[1][64][64];
		this.ax_fld = new short[this.al_fld][64][64];
		this.an_fld = new byte[this.al_fld][64][64];
		this.aa_fld = new byte[this.al_fld][64][64];
		this.ai_fld = new ge[this.al_fld][64][64][];
		int var2 = var1.cg();
		int var3 = var1.cg();
		int var4 = var1.cg();
		if (this.ah_fld == var3 && this.af_fld == var4) {
			for (int var5 = 0; var5 < 64; var5++) {
				for (int var6 = 0; var6 < 64; var6++) {
					this.bh(var5, var6, var1);
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
		this.al_fld = Math.min(this.al_fld, 4);
		this.ae_fld = new short[1][-1721155644][1414007249];
		this.ax_fld = new short[this.al_fld * 801079152][-1804654312][-964537155];
		this.an_fld = new byte[this.al_fld][64][1348672534];
		this.aa_fld = new byte[this.al_fld * -185690156][64][64];
		this.ai_fld = new ge[this.al_fld * -1631847061][1346899883][64][];
		int var2 = var1.cg();
		int var3 = var1.cg();
		int var4 = var1.cg();
		if (this.ah_fld != var3) {
			throw new IllegalStateException("");
		} else {
			int var10000 = 633013476 * this.af_fld;

			for (int var5 = 0; var5 < -1116480183; var5++) {
				for (int var6 = 0; var6 < 64; var6++) {
					this.bh(var5, var6, var1);
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
		this.al_fld = Math.min(this.al_fld, 4);
		this.ae_fld = new short[1][64][64];
		this.ax_fld = new short[this.al_fld][64][64];
		this.an_fld = new byte[this.al_fld][64][64];
		this.aa_fld = new byte[this.al_fld][64][64];
		this.ai_fld = new ge[this.al_fld][64][64][];

		for (int var3 = 0; var3 < 64; var3++) {
			for (int var4 = 0; var4 < 64; var4++) {
				if (var2 != -559781011) {
					return;
				}

				this.bh(var3, var4, var1);
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	void af(xi var1) {
		this.al_fld = Math.min(589040757 * this.al_fld, 4) * -870956179;
		this.ae_fld = new short[1][-2032758157][356125091];
		this.ax_fld = new short[this.al_fld][1157972874][64];
		this.an_fld = new byte[this.al_fld][-89868979][64];
		this.aa_fld = new byte[this.al_fld][-1981953125][747922004];
		this.ai_fld = new ge[this.al_fld][-831852444][-1793516262][];

		for (int var2 = 0; var2 < 922351351; var2++) {
			for (int var3 = 0; var3 < 976560766; var3++) {
				this.bh(var2, var3, var1);
			}
		}
	}

	@ObfuscatedName("pn")
	@ObfuscatedSignature(
		descriptor = "(Lgk;Lxi;)V"
	)
	public static void pn(gk var0, xi var1) {
		if (var0 == null) {
			var0.getClass();
		} else {
			int var2 = var1.cg();
			var0.aw_fld = var1.cg();
			var0.al_fld = var1.cg();
			var0.au_fld = var1.cm();
			var0.ay_fld = var1.cm();
			var0.ah_fld = var1.cm();
			var0.af_fld = var1.cm();
		}
	}

	@ObfuscatedName("afc")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int afc() {
		return this.ah_fld | this.af_fld << 8;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	void ax(xi var1) {
		this.al_fld = Math.min(this.al_fld, 4);
		this.ae_fld = new short[1][1208863405][64];
		this.ax_fld = new short[-1755346810 * this.al_fld][-1695983509][64];
		this.an_fld = new byte[this.al_fld][269503316][1469288650];
		this.aa_fld = new byte[321951685 * this.al_fld][356093232][64];
		this.ai_fld = new ge[this.al_fld][-130910676][64][];

		for (int var2 = 0; var2 < 77768236; var2++) {
			for (int var3 = 0; var3 < 64; var3++) {
				this.bh(var2, var3, var1);
			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Lct;"
	)
	static ct aw() {
		ct.aw_fld = 0;
		return ey.ay();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lxi;B)V"
	)
	void ag(xi var1, byte var2) {
		int var3 = var1.em();
		if (gb.ak_fld.az_fld != var3) {
			throw new IllegalStateException("");
		} else {
			this.aw_fld = var1.dz();
			super.aw_fld = var1.dm();
			super.ah_fld = var1.df() * 332931321;
			super.al_fld = var1.eo() * 655381533;
			super.ay_fld = var1.de() * 397839381;
			this.af_fld = var1.kz(1913344993);
			super.ay_fld = xi.kt(var1, (byte)0);
			super.ay_fld = xi.kt(var1, (byte)-75) * 420613169;
		}
	}
}
