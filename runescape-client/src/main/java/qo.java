import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.Comparator;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("qo")
class qo implements Comparator {
	// $VF: synthetic field
	@ObfuscatedName("this$0")
	@ObfuscatedSignature(
		descriptor = "Lry;"
	)
	ry this$0;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int az_fld;

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	public int ah(Object var1, Object var2) {
		return this.ak((qu)var1, (qu)var2, (byte)0);
	}

	@ObfuscatedName("yz")
	@ObfuscatedSignature(
		descriptor = "(Lqo;Lqu;Lqu;)I"
	)
	public static int yz(qo var0, qu var1, qu var2) {
		if (var0 == null) {
			throw new NullPointerException();
		} else if (var1.az_fld > var2.az_fld) {
			return 1;
		} else {
			return var1.az_fld < var2.az_fld ? -1 : 0;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lqu;Lqu;B)I"
	)
	int ak(qu var1, qu var2, byte var3) {
		if (var1.az_fld > var2.az_fld) {
			return 1;
		} else {
			return var1.az_fld < var2.az_fld ? -1 : 0;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lgu;Lvr;)Luf;"
	)
	public static uf av(gu var0, vr var1) {
		int var3 = var1.al_fld;
		int var4 = var1.af_fld;
		int var5 = var1.au_fld;
		int var6 = var1.aa_fld;
		int var7 = var0.av();
		int var8 = var0.ah();
		int var9 = gu.ns(var0, -1706001434);
		double var10 = hx.av(var7);
		double var12 = pw.az(var7);
		int var14 = (int)(var10 * var3 - var12 * var4);
		int var15 = (int)(var10 * var4 + var3 * var12);
		var8 += var14;
		var9 += var15;
		int var16 = (int)(var10 * var5 - var6 * var12);
		int var17 = (int)(var5 * var12 + var10 * var6);
		int var18 = (int)(var10 * var5 + var6 * var12);
		int var19 = (int)(var10 * var6 - var5 * var12);
		int var20 = var8 - var16;
		int var21 = var17 + var9;
		int var22 = var8 + var18;
		int var23 = var19 + var9;
		int var24 = var16 + var8;
		int var25 = var9 - var17;
		int var26 = var8 - var18;
		int var27 = var9 - var19;
		int var28 = Math.min(var20, Math.min(var22, Math.min(var24, var26)));
		int var29 = Math.max(var20, Math.max(var22, Math.max(var24, var26)));
		int var30 = Math.min(var21, Math.min(var23, Math.min(var25, var27)));
		int var31 = Math.max(var21, Math.max(var23, Math.max(var25, var27)));
		int var33 = 1 + (var29 - var28);
		int var34 = var31 - var30 + 1;
		synchronized (uf.ak_fld) {
			uf var32;
			if (0 == uf.az_fld) {
				var32 = new uf(var28, var30, var33, var34);
			} else {
				uf.az_fld--;
				uf.ak_fld[uf.az_fld].ag(var28, var30);
				uf.uo(uf.ak_fld[uf.az_fld], var33, var34);
				var32 = uf.ak_fld[uf.az_fld];
			}

			return var32;
		}
	}

	@ObfuscatedName("compare")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	@Override
	public int compare(Object var1, Object var2) {
		return this.ak((qu)var1, (qu)var2, (byte)0);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	public int ae(Object var1, Object var2) {
		return this.ak((qu)var1, (qu)var2, (byte)0);
	}

	@ObfuscatedName("jg")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	public boolean jg(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	public int aw(Object var1, Object var2) {
		return this.ak((qu)var1, (qu)var2, (byte)0);
	}

	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	public boolean jt(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("jm")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	public boolean jm(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("equals")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	@Override
	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lqu;Lqu;)I"
	)
	int az(qu var1, qu var2) {
		if (var1.az_fld > var2.az_fld) {
			return 1;
		} else {
			return var1.az_fld < var2.az_fld ? -1 : 0;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ILba;Z)I"
	)
	static int ah(int var0, ba var1, boolean var2) throws FileNotFoundException, EOFException, UnsupportedEncodingException {
		try {
			if (var0 < 1000) {
				return xy.as(var0, var1, var2);
			} else if (var0 < 1100) {
				return ne.al(var0, var1, var2);
			} else if (var0 < 1200) {
				return cu.au(var0, var1, var2);
			} else if (var0 < 1300) {
				return hh.ax(var0, var1, var2);
			} else if (var0 < 1400) {
				return da.an(var0, var1, var2);
			} else if (var0 < 1500) {
				return ms.am(var0, var1, var2);
			} else if (var0 < 1600) {
				return cu.ad(var0, var1, var2);
			} else if (var0 < 1700) {
				return bh.ao(var0, var1, var2);
			} else if (var0 < 1800) {
				return mk.ab(var0, var1, var2);
			} else if (var0 < 1900) {
				return gs.ac(var0, var1, var2);
			} else if (var0 < 2000) {
				return py.aj(var0, var1, var2);
			} else if (var0 < 2100) {
				return ne.al(var0, var1, var2);
			} else if (var0 < 2200) {
				return cu.au(var0, var1, var2);
			} else if (var0 < 2300) {
				return hh.ax(var0, var1, var2);
			} else if (var0 < 2400) {
				return da.an(var0, var1, var2);
			} else if (var0 < 2500) {
				return ms.am(var0, var1, var2);
			} else if (var0 < 2600) {
				return rl.bd(var0, var1, var2);
			} else if (var0 < 2700) {
				return ai.bz(var0, var1, var2);
			} else if (var0 < 2800) {
				return fw.br(var0, var1, var2);
			} else if (var0 < 2900) {
				return vj.be(var0, var1, var2);
			} else if (var0 < 3000) {
				return py.aj(var0, var1, var2);
			} else if (var0 < 3200) {
				return rz.bs(var0, var1, var2);
			} else if (var0 < 3300) {
				return ix.bh(var0, var1, var2);
			} else if (var0 < 3400) {
				return ey.bk(var0, var1, var2);
			} else if (var0 < 3500) {
				return ka.bj(var0, var1, var2);
			} else if (var0 < 3600) {
				return rr.bf(var0, var1, var2);
			} else if (var0 < 3700) {
				return cl.by(var0, var1, var2);
			} else if (var0 < 3800) {
				return dk.bl(var0, var1, var2);
			} else if (var0 < 3900) {
				return gi.bx(var0, var1, var2);
			} else if (var0 < 4000) {
				return ov.bo(var0, var1, var2);
			} else if (var0 < 4100) {
				return nn.bp(var0, var1, var2);
			} else if (var0 < 4200) {
				return ch.bt(var0, var1, var2);
			} else if (var0 < 4300) {
				return le.bv(var0, var1, var2);
			} else if (var0 < 5100) {
				return cg.bi(var0, var1, var2);
			} else if (var0 < 5400) {
				return ik.bu(var0, var1, var2);
			} else if (var0 < 5600) {
				return ag.bn(var0, var1, var2);
			} else if (var0 < 5700) {
				return lr.bc(var0, var1, var2);
			} else if (var0 < 6300) {
				return bo.bq(var0, var1, var2);
			} else if (var0 < 6600) {
				return oz.bg(var0, var1, var2);
			} else if (var0 < 6700) {
				return sg.bb(var0, var1, var2);
			} else if (var0 < 6800) {
				return an.cd(var0, var1, var2);
			} else if (var0 < 6900) {
				return by.cc(var0, var1, var2);
			} else if (var0 < 7000) {
				return fr.cq(var0, var1, var2);
			} else if (var0 < 7100) {
				return oa.cv(var0, var1, var2);
			} else if (var0 < 7200) {
				return on.cy(var0, var1, var2);
			} else if (var0 < 7500) {
				return rk.cf(var0, var1, var2);
			} else if (var0 < 7600) {
				return fs.cx(var0, var1, var2);
			} else if (var0 < 7700) {
				return jg.cs(var0, var1, var2);
			} else if (var0 < 8000) {
				return gc.cp(var0, var1, var2);
			} else if (var0 < 8100) {
				return ga.ce(var0, var1, var2);
			} else {
				return var0 >= 13000 && var0 < 14000 ? eb.cn(var0, var1, var2) : 2;
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "()Luz;"
	)
	public static uz ak() {
		synchronized (uz.ak_fld) {
			if (uz.az_fld == 0) {
				return new uz();
			} else {
				uz.ak_fld[(uz.az_fld -= -1833938397) * 770960779].af();
				return uz.ak_fld[uz.az_fld];
			}
		}
	}

	qo(ry var1) {
		this.this$0 = var1;
	}
}
