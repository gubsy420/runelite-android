import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("re")
public class re extends rc {
	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ck_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ag_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ak_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int av_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lzo;"
	)
	zo ae_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int az_fld;

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lxi;IS)V"
	)
	public void az(xi var1, int var2, short var3) {
		while (var1.au_fld < var2) {
			int var4 = var1.cg();
			if (4 == var4) {
				if (var3 <= 2048) {
					return;
				}

				aax var10 = new aax(xi.at(var1, -1278077725), this.ae_fld);
				if (!var10.az(1004146027)) {
					throw new IllegalStateException();
				}

				boolean var11 = false;
				la.fq_fld.am(var10.ak(990853902), var11, -1524373658);
			} else {
				boolean var5 = 0 != (var4 & 1);
				aax var6 = new aax(xi.at(var1, -1927468051), this.ae_fld);
				aax var7 = new aax(xi.at(var1, -966904464), this.ae_fld);
				xi.at(var1, -289724133);
				if (!var6.az(1004146027)) {
					throw new IllegalStateException();
				}

				rt var8 = (rt)this.bt(var6, (byte)-128);
				if (var5) {
					if (var3 <= 2048) {
						return;
					}

					rt var9 = (rt)this.bt(var7, (byte)-117);
					if (null != var9 && var8 != var9) {
						if (var8 != null) {
							this.bu(var9, -1116861132);
						} else {
							var8 = var9;
						}
					}
				}

				if (null != var8) {
					this.bq(var8, var6, var7, 1586318923);
				} else if (this.bl(-1440239599) < 400) {
					int var13 = this.bl(-1440239599);
					var8 = (rt)this.bc(var6, var7, (byte)30);
					var8.ak_fld = var13;
				}
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)[Lrl;"
	)
	@Override
	rl[] ag(int var1, int var2) {
		return new rt[var1];
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)[Lrl;"
	)
	@Override
	rl[] af(int var1) {
		return new rt[var1];
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)[Lrl;"
	)
	@Override
	rl[] aw(int var1) {
		return new rt[var1];
	}

	@ObfuscatedName("kn")
	@ObfuscatedSignature(
		descriptor = "(Lre;Lxi;I)V"
	)
	public static void kn(re var0, xi var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		while (var1.au_fld < var2) {
			int var3 = var1.cg();
			if (4 == var3) {
				aax var4 = new aax(xi.at(var1, 1122318081), var0.ae_fld);
				if (!var4.az(1004146027)) {
					throw new IllegalStateException();
				}

				boolean var5 = false;
				la.fq_fld.am(var4.ak(-1263170383), var5, -1524373658);
			} else {
				boolean var9 = 0 != (var3 & 1);
				aax var10 = new aax(xi.at(var1, 1562912432), var0.ae_fld);
				aax var6 = new aax(xi.at(var1, -863657580), var0.ae_fld);
				xi.at(var1, -512362241);
				var10.az(1004146027);
				rt var7 = (rt)var0.bt(var10, (byte)-67);
				if (var9) {
					rt var8 = (rt)var0.bt(var6, (byte)-32);
					if (null != var8 && var7 != var8) {
						if (var7 != null) {
							var0.bu(var8, -298852729);
						} else {
							var7 = var8;
						}
					}
				}

				if (null != var7) {
					var0.bq(var7, var10, var6, 2092619176);
				} else if (var0.bl(-1440239599) < 400) {
					int var12 = var0.bl(-1440239599);
					var7 = (rt)var0.bc(var10, var6, (byte)41);
					var7.ak_fld = var12;
				}
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()Lrl;"
	)
	@Override
	rl av() {
		return new rt();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()Lrl;"
	)
	@Override
	rl ae() {
		return new rt();
	}

	@ObfuscatedName("tg")
	@ObfuscatedSignature(
		descriptor = "(Lre;Lxi;I)V"
	)
	public static void tg(re var0, xi var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		while (var1.au_fld < var2) {
			int var3 = var1.cg();
			if (4 == var3) {
				aax var4 = new aax(xi.at(var1, 2059281951), var0.ae_fld);
				var4.az(1004146027);
				boolean var5 = false;
				la.fq_fld.am(var4.ak(-1100887208), var5, -1524373658);
			} else {
				boolean var9 = 0 != (var3 & 1);
				aax var10 = new aax(xi.at(var1, -1200706541), var0.ae_fld);
				aax var6 = new aax(xi.at(var1, 403878918), var0.ae_fld);
				xi.at(var1, 1611450092);
				if (!var10.az(1004146027)) {
					throw new IllegalStateException();
				}

				rt var7 = (rt)var0.bt(var10, (byte)-75);
				if (var9) {
					rt var8 = (rt)var0.bt(var6, (byte)-116);
					if (null != var8 && var7 != var8) {
						if (var7 != null) {
							var0.bu(var8, 501455394);
						} else {
							var7 = var8;
						}
					}
				}

				if (null != var7) {
					var0.bq(var7, var10, var6, 1377670281);
				} else if (var0.bl(-1440239599) < 400) {
					int var12 = var0.bl(-1440239599);
					var7 = (rt)var0.bc(var10, var6, (byte)21);
					var7.ak_fld = var12 * 653442481;
				}
			}
		}
	}

	@ObfuscatedName("hh")
	@ObfuscatedSignature(
		descriptor = "(Ldr;)V"
	)
	public static void hh(dr var0) {
		if (var0.ar_fld != null) {
			wh var1 = var0.ar_fld.av_fld;
			if (var0.as_fld != null) {
				wj.uv(var0.as_fld, 0, var0.as_fld.av(), var1.aw(), var1.ah(-1897016173));
				wj.lm(var0.as_fld, 1958953740);
			}

			if (var0.af_fld != null) {
				wj.uv(var0.af_fld, 0, var0.af_fld.av(), var1.aw(), var1.ah(-1897016173));
				wj.lm(var0.af_fld, 2145777782);
			}
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)[Lrl;"
	)
	@Override
	rl[] ah(int var1) {
		return new rt[var1];
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)[Lrl;"
	)
	@Override
	rl[] ay(int var1) {
		return new rt[var1];
	}

	public re(zo var1) {
		super(400);
		this.ae_fld = var1;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)[Lrl;"
	)
	@Override
	rl[] as(int var1) {
		return new rt[var1];
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)[Lrl;"
	)
	@Override
	rl[] ar(int var1) {
		return new rt[var1];
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)Lrl;"
	)
	@Override
	rl ak(byte var1) {
		return new rt();
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	public void au(xi var1, int var2) {
		while (var1.au_fld < var2) {
			int var3 = var1.cg();
			if (4 == var3) {
				aax var9 = new aax(xi.at(var1, -2130492557), this.ae_fld);
				if (!var9.az(1004146027)) {
					throw new IllegalStateException();
				}

				boolean var10 = false;
				la.fq_fld.am(var9.ak(-932718459), var10, -1524373658);
			} else {
				boolean var4 = 0 != (var3 & 1);
				aax var5 = new aax(xi.at(var1, 1600561789), this.ae_fld);
				aax var6 = new aax(xi.at(var1, 2120216122), this.ae_fld);
				xi.at(var1, -1007219415);
				if (!var5.az(1004146027)) {
					throw new IllegalStateException();
				}

				rt var7 = (rt)this.bt(var5, (byte)-31);
				if (var4) {
					rt var8 = (rt)this.bt(var6, (byte)-34);
					if (null != var8 && var7 != var8) {
						if (var7 != null) {
							this.bu(var8, 53646853);
						} else {
							var7 = var8;
						}
					}
				}

				if (null != var7) {
					this.bq(var7, var5, var6, 1187207758);
				} else if (this.bl(-1440239599) < 400) {
					int var12 = this.bl(-1440239599);
					var7 = (rt)this.bc(var5, var6, (byte)116);
					var7.ak_fld = var12;
				}
			}
		}
	}
}
