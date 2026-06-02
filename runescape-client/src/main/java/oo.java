import java.io.EOFException;
import net.runelite.api.ColorTextureOverride;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("oo")
@Implements({"ColorTextureOverride"})
public class oo implements ColorTextureOverride {
	@ObfuscatedGetter(
		intValue = 568647913
	)
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int af_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ag_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ak_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[S"
	)
	public short[] ah_fld;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	public fn al_fld;
	@ObfuscatedGetter(
		intValue = 1365461779
	)
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int aw_fld = -734148379;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[S"
	)
	public short[] ae_fld;
	@ObfuscatedGetter(
		intValue = -862349947
	)
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int as_fld;
	@ObfuscatedGetter(
		intValue = -442703081
	)
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ar_fld;
	@ObfuscatedGetter(
		intValue = -1271217717
	)
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ay_fld = -1521048547;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int az_fld;
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ba_fld;

	@ObfuscatedName("oh")
	@ObfuscatedSignature(
		descriptor = "(Loo;I)Z"
	)
	public static boolean oh(oo var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return 0 == var1 && -1 != var0.aw_fld || 1 == var1 && var0.ay_fld != -1;
	}

	@ObfuscatedName("uo")
	@ObfuscatedSignature(
		descriptor = "(Loo;I)Z"
	)
	public static boolean uo(oo var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return 0 == var1 && -1 != var0.aw_fld || 1 == var1 && var0.ay_fld != -1;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)Z"
	)
	public boolean ag(byte var1) {
		return null != this.ah_fld;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int ao(int var1) {
		return var1 == 0 ? this.as_fld : this.ar_fld;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	int ah(int var1, int var2) {
		return var1 == 0 ? this.aw_fld : this.ay_fld;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int am(int var1) {
		return var1 == 0 ? -1568841165 * this.aw_fld : this.ay_fld;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ILxi;)Loo;"
	)
	public static oo ay(int var0, xi var1) throws EOFException {
		try {
			int var2 = var1.cg();
			boolean var3 = (var2 & 1) != 0;
			boolean var4 = 0 != (var2 & 2);
			boolean var5 = 0 != (var2 & 4);
			boolean var6 = 0 != (var2 & 8);
			oo var7 = new oo(var0);
			if (var3) {
				int var8 = var1.cg();
				int[] var9 = new int[]{var8 & 15, var8 >> 4 & 15};
				boolean var10 = null != var7.ah_fld && var9.length == var7.ah_fld.length;

				for (int var11 = 0; var11 < 2; var11++) {
					if (15 != var9[var11]) {
						short var12 = (short)xi.tx(var1, 344519930);
						if (var10) {
							var7.ah_fld[var9[var11]] = var12;
						}
					}
				}
			}

			if (var4) {
				int var15 = var1.cg();
				int[] var16 = new int[]{var15 & 15, var15 >> 4 & 15};
				boolean var17 = null != var7.ae_fld && var7.ae_fld.length == var16.length;

				for (int var18 = 0; var18 < 2; var18++) {
					if (var16[var18] != 15) {
						short var19 = (short)xi.tx(var1, 944030807);
						if (var17) {
							var7.ae_fld[var16[var18]] = var19;
						}
					}
				}
			}

			if (var5) {
				var7.aw_fld = var1.dl(wa.ak_fld.az_fld);
				var7.ay_fld = var1.dl(wa.ak_fld.az_fld) * -869240285;
			}

			if (var6) {
				var7.as_fld = var1.dl(wa.ak_fld.az_fld) * 123859253;
				var7.ar_fld = var1.dl(wa.ak_fld.az_fld);
			}

			return var7;
		} catch (Throwable var14) {
			throw new RuntimeException(var14);
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean ar() {
		return this.ae_fld != null;
	}

	@ObfuscatedName("vr")
	@ObfuscatedSignature(
		descriptor = "(Loo;B)Z"
	)
	public static boolean vr(oo var0, byte var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.ae_fld != null;
		}
	}

	@ObfuscatedName("getTextureToReplaceWith")
	@ObfuscatedSignature(
		descriptor = "()[S"
	)
	@Override
	public short[] getTextureToReplaceWith() {
		return this.ae_fld;
	}

	public oo(int var1) throws EOFException {
		this.as_fld = -481631053;
		this.ar_fld = -1961919655;
		og var2 = kb.ag(var1, -1752383175);
		if (var2.ac(-2117899641)) {
			this.ah_fld = new short[var2.dg_fld.length];
			System.arraycopy(var2.dg_fld, 0, this.ah_fld, 0, this.ah_fld.length);
		}

		if (var2.at(14159562)) {
			this.ae_fld = new short[var2.db_fld.length];
			System.arraycopy(var2.db_fld, 0, this.ae_fld, 0, this.ae_fld.length);
		}

		this.af_fld = 285100393 * var2.dk_fld;
	}

	@ObfuscatedName("getColorToReplaceWith")
	@ObfuscatedSignature(
		descriptor = "()[S"
	)
	@Override
	public short[] getColorToReplaceWith() {
		return this.ah_fld;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean al() {
		return this.ae_fld != null;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean ax(int var1) {
		return 0 == var1 && -1 != this.aw_fld || 1 == var1 && this.ay_fld != -1;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean aa(int var1) {
		return 0 == var1 && -1 != this.aw_fld || 1 == var1 && this.ay_fld != -1;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean ai(int var1) {
		return 0 == var1 && -1 != this.aw_fld || 1 == var1 && this.ay_fld != -1;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean au(int var1) {
		return 0 == var1 && this.as_fld != -1 || var1 == 1 && this.ar_fld != -1;
	}

	@ObfuscatedName("rg")
	@ObfuscatedSignature(
		descriptor = "(Loo;IB)I"
	)
	public static int rg(oo var0, int var1, byte var2) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var1 == 0 ? var0.as_fld : var0.ar_fld;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean af() {
		return this.ae_fld != null;
	}

	@ObfuscatedName("nk")
	@ObfuscatedSignature(
		descriptor = "(Loo;)Z"
	)
	public static boolean nk(oo var0) {
		return null != var0.ah_fld;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int ad(int var1) {
		return var1 == 0 ? this.as_fld : this.ar_fld;
	}

	@ObfuscatedName("no")
	@ObfuscatedSignature(
		descriptor = "(Loo;I)Z"
	)
	public static boolean no(oo var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return 0 == var1 && var0.as_fld != -1 || var1 == 1 && var0.ar_fld != -1;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int ab(int var1) {
		return var1 == 0 ? this.as_fld : this.ar_fld;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)I"
	)
	int aw(int var1, byte var2) {
		return var1 == 0 ? this.ar_fld : this.ay_fld * -442703081;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	boolean ae(int var1, int var2) {
		return 0 == var1 && this.aw_fld != -1 || var1 == 1 && this.ay_fld != -1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)Z"
	)
	public boolean az(byte var1) {
		return this.ah_fld != null;
	}

	@ObfuscatedName("uh")
	@ObfuscatedSignature(
		descriptor = "(Loo;I)I"
	)
	public static int uh(oo var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var1 == 0 ? 2026738091 * var0.aw_fld : var0.ay_fld;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	boolean av(int var1, int var2) {
		return 0 == var1 && -1 != this.ar_fld || 1 == var1 && this.ay_fld != -1;
	}
}
