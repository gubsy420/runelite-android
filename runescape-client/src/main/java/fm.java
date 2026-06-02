import java.io.EOFException;
import net.runelite.api.AABB;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("fm")
@Implements({"AABB"})
public class fm implements AABB {
	@ObfuscatedGetter(
		intValue = -1776166105
	)
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ag_fld;
	@ObfuscatedGetter(
		intValue = -1009472673
	)
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int az_fld;
	@ObfuscatedGetter(
		intValue = -2112914411
	)
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ae_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	fm ay_fld;
	@ObfuscatedGetter(
		intValue = 23001249
	)
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int av_fld;
	@ObfuscatedGetter(
		intValue = -1481949517
	)
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ah_fld;
	@ObfuscatedGetter(
		intValue = 1999164469
	)
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int aw_fld;
	@ObfuscatedGetter(
		intValue = 1634242191
	)
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ak_fld;

	@ObfuscatedName("getCenterY")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getCenterY() {
		return this.az_fld;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(S)I"
	)
	int ae(short var1) {
		return this.av_fld - this.aw_fld;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int aw() {
		return this.av_fld - this.aw_fld;
	}

	fm(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		this.ak_fld = var1;
		this.ag_fld = var2;
		this.az_fld = var3;
		this.av_fld = var4;
		this.ae_fld = var5;
		this.ah_fld = var6;
		this.aw_fld = var7;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int az(int var1) {
		return this.az_fld - this.ah_fld;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "([Llu;IIIIIIZLuo;Lqg;I)V"
	)
	static void av(lu[] var0, int var1, int var2, int var3, int var4, int var5, int var6, boolean var7, uo var8, qg var9, int var10) throws EOFException {
		try {
			for (int var11 = var1; var11 <= var2; var11++) {
				lu var12 = var0[var11];
				if (null == var12) {
					if (var10 == -75134438) {
						return;
					}
				} else if (var12.cv_fld == var3) {
					if (var10 == -75134438) {
						return;
					}

					if (var12.cy_fld == var4) {
						kd.ae(var12, var5, var6, var7, var8, var9, (short)-10173);
						eo.ak(var12, var5, var6);
						if (var12.cp_fld > var12.cn_fld - var12.bb_fld) {
							var12.cp_fld = var12.cn_fld - var12.bb_fld;
						}

						if (var12.cp_fld < 0) {
							var12.cp_fld = 0;
						}

						if (var12.ce_fld > var12.cr_fld - var12.cd_fld) {
							var12.ce_fld = var12.cr_fld - var12.cd_fld;
						}

						if (var12.ce_fld < 0) {
							var12.ce_fld = 0;
						}

						if (var12.bx_fld == 0) {
							tb.ag(var0, var12, var7, var8, var9, -718772637);
						}
					}
				}
			}
		} catch (Throwable var13) {
			throw new RuntimeException(var13);
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int au() {
		return this.aw_fld + this.av_fld;
	}

	@ObfuscatedName("getCenterZ")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getCenterZ() {
		return this.av_fld;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int am() {
		return this.ag_fld - this.ae_fld;
	}

	@ObfuscatedName("fh")
	@ObfuscatedSignature(
		descriptor = "(Lfm;)I"
	)
	public static int fh(fm var0) {
		return var0.az_fld - var0.ah_fld;
	}

	@ObfuscatedName("getExtremeZ")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getExtremeZ() {
		return this.aw_fld;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int al() {
		return this.ag_fld - this.ae_fld;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int ag(int var1) {
		return this.ag_fld + this.ae_fld;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	int av(byte var1) {
		return this.az_fld + this.ah_fld;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ao() {
		return this.az_fld - this.ah_fld;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ax() {
		return this.az_fld - this.ah_fld;
	}

	@ObfuscatedName("getExtremeX")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getExtremeX() {
		return this.ae_fld;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int af() {
		return this.az_fld - this.ah_fld;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ad() {
		return this.az_fld + this.ah_fld;
	}

	@ObfuscatedName("getCenterX")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getCenterX() {
		return this.ag_fld;
	}

	@ObfuscatedName("getExtremeY")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getExtremeY() {
		return this.ah_fld;
	}

	@ObfuscatedName("lx")
	@ObfuscatedSignature(
		descriptor = "(Lfm;I)I"
	)
	public static int lx(fm var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.ag_fld - var0.ae_fld;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int an() {
		return this.az_fld - this.ah_fld;
	}

	@ObfuscatedName("om")
	@ObfuscatedSignature(
		descriptor = "(Lfm;)I"
	)
	public static int om(fm var0) {
		return var0.ag_fld - var0.ae_fld;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ay() {
		return this.aw_fld + this.av_fld;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int aa() {
		return this.aw_fld + this.av_fld;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int ah(int var1) {
		return this.aw_fld + this.av_fld;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int ak(int var1) {
		return this.ag_fld - this.ae_fld;
	}
}
