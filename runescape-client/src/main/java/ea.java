import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("ea")
public class ea extends vw {
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lek;"
	)
	ek as_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ae_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int av_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int az_fld;
	@ObfuscatedGetter(
		intValue = -1233104955
	)
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ah_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ak_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "[[I"
	)
	int[][] ay_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] aw_fld;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bz_fld;

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lxi;BI)I"
	)
	public static int ag(xi var0, byte var1, int var2) {
		int var4 = var1 >> var2 & 3;
		if (3 == var4) {
			return var0.co();
		} else if (2 == var4) {
			return var0.cz();
		} else {
			return 1 == var4 ? xi.rp(var0, 141001800) : 0;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ak() {
		return this.ah_fld;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()Lek;"
	)
	public ek ag() {
		return this.as_fld;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;)V"
	)
	static void bm(int var0, String var1) {
		bn.bv_fld = var1;
		bn.bt_fld = var0;
	}

	public ea(int var1, byte[] var2) {
		xi var3 = new xi(var2);
		this.ah_fld = var3.cg();
		this.aw_fld = new int[this.ah_fld];
		this.ay_fld = new int[this.ah_fld][];

		for (int var4 = 0; var4 < this.ah_fld; var4++) {
			this.aw_fld[var4] = var3.cg();
		}

		for (int var6 = 0; var6 < this.ah_fld; var6++) {
			this.ay_fld[var6] = new int[var3.cg()];
		}

		for (int var7 = 0; var7 < this.ah_fld; var7++) {
			for (int var5 = 0; var5 < this.ay_fld[var7].length; var5++) {
				this.ay_fld[var7][var5] = var3.cg();
			}
		}

		if (var3.au_fld < var3.al_fld.length) {
			int var8 = xi.tx(var3, 1046303609);
			if (var8 > 0) {
				this.as_fld = new ek(var3, var8);
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int av() {
		return this.ah_fld;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public static final void as() {
		ej.be_fld = false;
		ej.cd_fld = 0;
	}

	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "(Lcv;)Z"
	)
	static boolean dh(cv var0) {
		if (client.ez_fld == 0) {
			return false;
		} else {
			return var0.bx_fld == client.dj_fld ? (client.ez_fld & 8) != 0 : rn.ct() || kn.cl() && var0.as((byte)0) || ex.dc() && var0.ah((byte)68);
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lsl;III)V"
	)
	public static void af(sl var0, int var1, int var2, int var3) {
		om.ap(var0, null, true, (byte)0);
		if (var1 >= 0 && var2 >= 0 && var1 < var0.av()) {
			if (var2 < var0.av()) {
				if (var1 != var2) {
					if (var3 >= -1062357850) {
						return;
					}

					if (yq.ak_fld == var0.ag_fld) {
						int[] var4 = var0.ak();
						int var5 = var4[var1];
						var4[var1] = var4[var2];
						var4[var2] = var5;
					} else if (var0.ag_fld == yq.ag_fld) {
						long[] var7 = var0.ag();
						long var9 = var7[var1];
						var7[var1] = var7[var2];
						var7[var2] = var9;
					} else {
						Object[] var8 = (Object[])var0.az();
						Object var10 = var8[var1];
						var8[var1] = var8[var2];
						var8[var2] = var10;
					}
				}

				return;
			}

			if (var3 >= -1062357850) {
				return;
			}
		}

		throw new RuntimeException();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V"
	)
	static void ah(int var0, int var1, int var2, int var3, int var4, int var5) throws EOFException {
		try {
			if (var0 >= 0) {
				dx var7 = kx.ak(var0, client.da_fld);
				cv var8 = dx.ii(var7, var0);
				if (null != var8) {
					int var9 = client.db_fld.aa(var0);
					ds.aw(var7, var8, var9, var1, var2, var3, var4, var5, (byte)23);
				}
			}
		} catch (Throwable var10) {
			throw new RuntimeException(var10);
		}
	}
}
