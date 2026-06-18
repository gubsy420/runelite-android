import net.runelite.api.Renderable;
import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("em")
@Implements({"Renderable"})
public abstract class em extends ug implements Renderable {
	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1
	)
	public int ez_fld = -1195300248;

	@ObfuscatedName("tx")
	@ObfuscatedSignature(
		descriptor = "()Lfn;"
	)
	public fn getModel() {
		try {
			return this.az(-178304394);
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("mu")
	@ObfuscatedSignature(
		descriptor = "(ILuy;IIIJ)V"
	)
	void mu(int var1, uy var2, int var3, int var4, int var5, long var6) {
		try {
			if (fc.ar_fld.al_fld != 1 || this.av((byte)-2)) {
				fn var8 = this.az(-653583809);
				if (null != var8) {
					var4 -= this.ae((byte)-1);
					this.ez_fld = var8.ez_fld;
					var8.gk(this.bk(-2003930331));
					var8.mr(var1, var2, var3, var4, var5, var6);
					var8.gk(fk.ak_fld);
				}
			}
		} catch (Throwable var10) {
			throw new RuntimeException(var10);
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	protected boolean aq() {
		try {
			return true;
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("mr")
	@ObfuscatedSignature(
		descriptor = "(ILuy;IIIJ)V"
	)
	void mr(int var1, uy var2, int var3, int var4, int var5, long var6) {
		try {
			if (fc.ar_fld.al_fld != 1 || this.av((byte)3)) {
				fn var8 = this.az(-2117850313);
				if (null != var8) {
					var4 -= this.ae((byte)-1);
					this.ez_fld = var8.ez_fld;
					var8.gk(this.bk(-2110352370));
					var8.mr(var1, var2, var3, var4, var5, var6);
					var8.gk(fk.ak_fld);
				}
			}
		} catch (Throwable var9) {
			throw new RuntimeException(var9);
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Lfn;"
	)
	protected fn az(int var1) {
		try {
			return null;
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	protected em() {
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(I)Lfk;"
	)
	protected fk bk(int var1) {
		return fk.ak_fld;
	}

	@ObfuscatedName("setModelHeight")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Export("setModelHeight")
	@Override
	public void setModelHeight(int var1) {
		this.ez_fld = var1 * -1985470191;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIJIIZ)V"
	)
	public void ak(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, int var12, int var13, boolean var14) {
		try {
			this.mm(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var12, var13, var14);
		} catch (Throwable var16) {
			throw new RuntimeException(var16);
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	protected int ae(byte var1) {
		try {
			return 0;
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "()Lfn;"
	)
	protected fn al() {
		try {
			return null;
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "()Lfn;"
	)
	protected fn au() {
		try {
			return null;
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "()Lfn;"
	)
	protected fn ax() {
		try {
			return null;
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("getRenderMode")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getRenderMode")
	@Override
	public int getRenderMode() {
		return this.xf_fk().ah_fld;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()Lfn;"
	)
	protected fn an() {
		try {
			return null;
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("mf")
	@ObfuscatedSignature(
		descriptor = "(ILuy;IIIJ)V"
	)
	void mf(int var1, uy var2, int var3, int var4, int var5, long var6) {
		try {
			if (fc.ar_fld.al_fld != 1 || this.av((byte)-47)) {
				fn var8 = this.az(-250839608);
				if (null != var8) {
					var4 -= this.ae((byte)-1);
					this.ez_fld = var8.ez_fld;
					var8.gk(this.bk(-1757695964));
					var8.mr(var1, var2, var3, var4, var5, var6);
					var8.gk(fk.ak_fld);
				}
			}
		} catch (Throwable var10) {
			throw new RuntimeException(var10);
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	protected boolean ai() {
		try {
			return true;
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("mm")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIJIIZ)V"
	)
	void mm(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, int var12, int var13, boolean var14) {
		try {
			if (1 != fc.ar_fld.al_fld || this.av((byte)89)) {
				fn var15 = this.az(-2050051553);
				if (null != var15) {
					var5 -= this.ae((byte)-1);
					this.ez_fld = var15.ez_fld;
					var15.gk(this.bk(-1836026833));
					var15.bu(var1, var2, var3, var4 - var7, var5 - var8, var6 - var9, var10);
					var15.gk(fk.ak_fld);
				}
			}
		} catch (Throwable var16) {
			throw new RuntimeException(var16);
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	protected boolean am() {
		try {
			return true;
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("sd")
	@ObfuscatedSignature(
		descriptor = "(ILuy;IIIJ)V"
	)
	public void sd(int var1, uy var2, int var3, int var4, int var5, long var6) {
		try {
			this.mr(var1, var2, var3, var4, var5, var6);
		} catch (Throwable var9) {
			throw new RuntimeException(var9);
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	protected int ao() {
		try {
			return 0;
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("mj")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIJIIZ)V"
	)
	void mj(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, int var12, int var13, boolean var14) {
		try {
			if (1 != fc.ar_fld.al_fld || this.av((byte)9)) {
				fn var15 = this.az(-189185567);
				if (null != var15) {
					var5 -= this.ae((byte)-1);
					this.ez_fld = var15.ez_fld;
					var15.gk(this.bk(-1812025745));
					var15.bu(var1, var2, var3, var4 - var7, var5 - var8, var6 - var9, var10);
					var15.gk(fk.ak_fld);
				}
			}
		} catch (Throwable var17) {
			throw new RuntimeException(var17);
		}
	}

	@ObfuscatedName("xf")
	@ObfuscatedSignature(
		descriptor = "()Lfk;"
	)
	public fk xf_fk() {
		return this.bk(-1836026833);
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "()Lfk;"
	)
	protected fk cy_fk() {
		return fk.ak_fld;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "()Lfn;"
	)
	protected fn aa() {
		try {
			return null;
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	protected int ad_int() {
		try {
			return 0;
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("getModelHeight")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getModelHeight")
	@Override
	public int getModelHeight() {
		return this.ez_fld;
	}

	@ObfuscatedName("lp")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIJIIZ)V"
	)
	void lp(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, int var12, int var13, boolean var14) {
		try {
			if (1 != fc.ar_fld.al_fld || this.av((byte)-56)) {
				fn var15 = this.az(-1059835385);
				if (null != var15) {
					var5 -= this.ae((byte)-1);
					this.ez_fld = var15.ez_fld;
					var15.gk(this.bk(-2106372110));
					var15.bu(var1, var2, var3, var4 - var7, var5 - var8, var6 - var9, var10);
					var15.gk(fk.ak_fld);
				}
			}
		} catch (Throwable var17) {
			throw new RuntimeException(var17);
		}
	}

	@ObfuscatedName("mx")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIJIIZ)V"
	)
	void mx(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, int var12, int var13, boolean var14) {
		try {
			if (1 != fc.ar_fld.al_fld || this.av((byte)-20)) {
				fn var15 = this.az(-366567069);
				if (null != var15) {
					var5 -= this.ae((byte)-1);
					this.ez_fld = var15.ez_fld;
					var15.gk(this.bk(-1787694928));
					var15.bu(var1, var2, var3, var4 - var7, var5 - var8, var6 - var9, var10);
					var15.gk(fk.ak_fld);
				}
			}
		} catch (Throwable var17) {
			throw new RuntimeException(var17);
		}
	}

	@ObfuscatedName("getAnimationHeightOffset")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getAnimationHeightOffset")
	@Override
	public int getAnimationHeightOffset() {
		try {
			return this.ae((byte)-1);
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("mo")
	@ObfuscatedSignature(
		descriptor = "(ILuy;IIIJ)V"
	)
	void mo(int var1, uy var2, int var3, int var4, int var5, long var6) {
		try {
			if (fc.ar_fld.al_fld != 1 || this.av((byte)35)) {
				fn var8 = this.az(-1627528290);
				if (null != var8) {
					var4 -= this.ae((byte)-1);
					this.ez_fld = var8.ez_fld;
					var8.gk(this.bk(-1878104363));
					var8.mr(var1, var2, var3, var4, var5, var6);
					var8.gk(fk.ak_fld);
				}
			}
		} catch (Throwable var10) {
			throw new RuntimeException(var10);
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)Z"
	)
	protected boolean av(byte var1) {
		try {
			return true;
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "()Lfk;"
	)
	protected fk cf() {
		return fk.ak_fld;
	}
}
