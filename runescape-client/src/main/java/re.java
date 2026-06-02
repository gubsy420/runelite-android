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

	@ObfuscatedName("wl")
	@ObfuscatedSignature(
		descriptor = "(Luk;)I"
	)
	public static int wl(uk var0) {
		return var0.au_fld;
	}

	@ObfuscatedName("uu")
	@ObfuscatedSignature(
		descriptor = "(Lev;)I"
	)
	public static int uu(ev var0) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.do_fld;
		}
	}

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

				aax var10 = new aax(xi.kc(var1, -1278077725), this.ae_fld);
				if (!var10.az(1004146027)) {
					throw new IllegalStateException();
				}

				boolean var11 = false;
				la.fq_fld.am(var10.ak(990853902), var11, -1524373658);
			} else {
				boolean var5 = 0 != (var4 & 1);
				aax var6 = new aax(xi.kc(var1, -1927468051), this.ae_fld);
				aax var7 = new aax(xi.kc(var1, -966904464), this.ae_fld);
				xi.kc(var1, -289724133);
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
							this.cc(var9, -1116861132);
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

	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "(Lag;)Ljava/lang/Object;"
	)
	public static Object dr(ag var0) {
		return var0.ag_fld.ak(var0.ak_fld);
	}

	@ObfuscatedName("wx")
	@ObfuscatedSignature(
		descriptor = "(Lzv;[II)[I"
	)
	public static int[] wx(zv var0, int[] var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var2 == 0) {
			return null;
		} else {
			int[] var3 = new int[var2];
			float var4 = (float)var1.length / var2;

			for (int var5 = 0; var5 < var2; var5++) {
				var3[var5] = var1[(int)(var5 * var4)];
			}

			return var3;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()Lrl;"
	)
	@Override
	rl ae() {
		return new rt();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()Lrl;"
	)
	@Override
	rl av() {
		return new rt();
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

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	public void al(xi var1, int var2) {
		while (var1.au_fld < var2) {
			int var3 = var1.cg();
			if (4 == var3) {
				aax var9 = new aax(xi.kc(var1, 2059281951), this.ae_fld);
				var9.az(1004146027);
				boolean var10 = false;
				la.fq_fld.am(var9.ak(-1100887208), var10, -1524373658);
			} else {
				boolean var4 = 0 != (var3 & 1);
				aax var5 = new aax(xi.kc(var1, -1200706541), this.ae_fld);
				aax var6 = new aax(xi.kc(var1, 403878918), this.ae_fld);
				xi.kc(var1, 1611450092);
				if (!var5.az(1004146027)) {
					throw new IllegalStateException();
				}

				rt var7 = (rt)this.bt(var5, (byte)-75);
				if (var4) {
					rt var8 = (rt)this.bt(var6, (byte)-116);
					if (null != var8 && var7 != var8) {
						if (var7 != null) {
							this.cc(var8, 501455394);
						} else {
							var7 = var8;
						}
					}
				}

				if (null != var7) {
					this.bq(var7, var5, var6, 1377670281);
				} else if (this.bl(-1440239599) < 400) {
					int var12 = this.bl(-1440239599);
					var7 = (rt)this.bc(var5, var6, (byte)21);
					var7.ak_fld = var12 * 653442481;
				}
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	public void au(xi var1, int var2) {
		while (var1.au_fld < var2) {
			int var3 = var1.cg();
			if (4 == var3) {
				aax var9 = new aax(xi.kc(var1, -2130492557), this.ae_fld);
				if (!var9.az(1004146027)) {
					throw new IllegalStateException();
				}

				boolean var10 = false;
				la.fq_fld.am(var9.ak(-932718459), var10, -1524373658);
			} else {
				boolean var4 = 0 != (var3 & 1);
				aax var5 = new aax(xi.kc(var1, 1600561789), this.ae_fld);
				aax var6 = new aax(xi.kc(var1, 2120216122), this.ae_fld);
				xi.kc(var1, -1007219415);
				if (!var5.az(1004146027)) {
					throw new IllegalStateException();
				}

				rt var7 = (rt)this.bt(var5, (byte)-31);
				if (var4) {
					rt var8 = (rt)this.bt(var6, (byte)-34);
					if (null != var8 && var7 != var8) {
						if (var7 != null) {
							this.cc(var8, 53646853);
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

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	public void ax(xi var1, int var2) {
		while (var1.au_fld < var2) {
			int var3 = var1.cg();
			if (4 == var3) {
				aax var9 = new aax(xi.kc(var1, 1122318081), this.ae_fld);
				if (!var9.az(1004146027)) {
					throw new IllegalStateException();
				}

				boolean var10 = false;
				la.fq_fld.am(var9.ak(-1263170383), var10, -1524373658);
			} else {
				boolean var4 = 0 != (var3 & 1);
				aax var5 = new aax(xi.kc(var1, 1562912432), this.ae_fld);
				aax var6 = new aax(xi.kc(var1, -863657580), this.ae_fld);
				xi.kc(var1, -512362241);
				var5.az(1004146027);
				rt var7 = (rt)this.bt(var5, (byte)-67);
				if (var4) {
					rt var8 = (rt)this.bt(var6, (byte)-32);
					if (null != var8 && var7 != var8) {
						if (var7 != null) {
							this.cc(var8, -298852729);
						} else {
							var7 = var8;
						}
					}
				}

				if (null != var7) {
					this.bq(var7, var5, var6, 2092619176);
				} else if (this.bl(-1440239599) < 400) {
					int var12 = this.bl(-1440239599);
					var7 = (rt)this.bc(var5, var6, (byte)41);
					var7.ak_fld = var12;
				}
			}
		}
	}
}
