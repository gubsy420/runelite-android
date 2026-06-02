import java.io.EOFException;
import net.runelite.api.Script;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("ba")
@Implements({"Script"})
public class ba extends vc implements Script {
	@ObfuscatedGetter(
		intValue = 788537341
	)
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int au_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "[Lxv;"
	)
	xv[] ag_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	String az_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] av_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] ae_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[Ljava/lang/String;"
	)
	String[] ah_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	static iw ak_fld = new iw(128);
	@ObfuscatedGetter(
		intValue = 1909888467
	)
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ay_fld;
	@ObfuscatedGetter(
		intValue = 868762583
	)
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int as_fld;
	@ObfuscatedGetter(
		intValue = 1406253939
	)
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ar_fld;
	@ObfuscatedGetter(
		intValue = -1265180517
	)
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int af_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "[J"
	)
	long[] aw_fld;
	@ObfuscatedGetter(
		intValue = -844495777
	)
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int al_fld;

	@ObfuscatedName("getIntOperands")
	@ObfuscatedSignature(
		descriptor = "()[I"
	)
	@Override
	public int[] getIntOperands() {
		return this.ae_fld;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;"
	)
	String ae(int var1, int var2) {
		return this.ah_fld[var1];
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)J"
	)
	long ah(int var1, int var2) {
		return this.aw_fld[var1];
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Lba;"
	)
	static ba au(int var0) throws EOFException {
		try {
			ba var2 = (ba)ak_fld.ak(var0 << 16);
			if (var2 != null) {
				return var2;
			} else {
				String var3 = String.valueOf(var0);
				int var4 = bj.ib_fld.cm(var3, (byte)1);
				if (var4 == -1) {
					return null;
				} else {
					byte[] var5 = ub.ae(bj.ib_fld, var4, (byte)91);
					if (var5 != null) {
						if (var5.length <= 1) {
							return null;
						}

						var2 = jv.av(var5);
						if (var2 != null) {
							ak_fld.az(var2, var0 << 16);
							return var2;
						}
					}

					return null;
				}
			}
		} catch (Throwable var7) {
			throw new RuntimeException(var7);
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Lba;"
	)
	static ba ar(int var0) throws EOFException {
		try {
			ba var1 = (ba)ak_fld.ak(var0);
			if (var1 != null) {
				return var1;
			} else {
				byte[] var2 = bj.ib_fld.bb(var0, 0, 584982574);
				if (var2 == null) {
					return null;
				} else {
					var1 = jv.av(var2);
					ak_fld.az(var1, var0);
					return var1;
				}
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(III)Lba;"
	)
	static ba al(int var0, int var1, int var2) throws EOFException {
		try {
			int var3 = ik.ak(var1, var0);
			ba var4 = wj.az(var3, var0);
			if (null != var4) {
				return var4;
			} else {
				var3 = dh.ag(var2, var0);
				var4 = wj.az(var3, var0);
				if (null != var4) {
					return var4;
				} else {
					var3 = fr.az(var0);
					var4 = wj.az(var3, var0);
					return var4 != null ? var4 : null;
				}
			}
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(III)Lba;"
	)
	static ba af(int var0, int var1, int var2) throws EOFException {
		try {
			int var3 = ik.ak(var1, var0);
			ba var4 = wj.az(var3, var0);
			if (null != var4) {
				return var4;
			} else {
				var3 = dh.ag(var2, var0);
				var4 = wj.az(var3, var0);
				if (null != var4) {
					return var4;
				} else {
					var3 = fr.az(var0);
					var4 = wj.az(var3, var0);
					return var4 != null ? var4 : null;
				}
			}
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;"
	)
	String aq(int var1) {
		return this.ah_fld[var1];
	}

	@ObfuscatedName("nm")
	@ObfuscatedSignature(
		descriptor = "(Lba;I)[Lxv;"
	)
	public static xv[] nm(ba var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return new xv[var1];
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "([B)Lba;"
	)
	static ba an(byte[] var0) {
		ba var1 = new ba();
		xi var2 = new xi(var0);
		var2.au_fld = (var2.al_fld.length - 2) * 1429891718;
		int var3 = xi.tx(var2, 941069911);
		int var4 = var2.al_fld.length - 2 - var3 - 16;
		var2.au_fld = var4 * -2092488358;
		int var5 = var2.co();
		var1.ay_fld = xi.tx(var2, 1835440034) * 963448258;
		var1.ar_fld = xi.tx(var2, 440383225);
		var1.as_fld = xi.tx(var2, 1823704537);
		var1.af_fld = xi.tx(var2, 357605984);
		var1.al_fld = xi.tx(var2, 1378059923);
		var1.au_fld = xi.tx(var2, 2025284688) * 1303578791;
		int var6 = var2.cg();
		if (var6 > 0) {
			var1.ag_fld = nm(var1, var6);

			for (int var7 = 0; var7 < var6; var7++) {
				int var8 = xi.tx(var2, 553132186);
				xv var9 = new xv(var8 > 0 ? wp.ay(var8) : 1);
				var1.ag_fld[var7] = var9;

				while (var8-- > 0) {
					int var10 = var2.co();
					int var11 = var2.co();
					var9.ag(new vl(var11), var10);
				}
			}
		}

		var2.au_fld = 0;
		var1.az_fld = var2.ch();
		var1.av_fld = new int[var5];
		var1.ae_fld = new int[var5];
		var1.ah_fld = new String[var5];
		var1.aw_fld = new long[var5];
		int var12 = 0;

		while (var2.au_fld < var4) {
			int var13 = xi.tx(var2, 1975214339);
			switch (var13) {
				case 3:
					var1.ah_fld[var12] = xi.kc(var2, 323867160);
					break;
				case 21:
				case 38:
				case 39:
				case 62:
				case 63:
					var1.ae_fld[var12] = var2.cg();
					break;
				case 61:
					var1.aw_fld[var12] = xi.ob(var2, -1617345846);
					break;
				default:
					if (var13 <= 1447053690) {
						var1.ae_fld[var12] = var2.co();
					} else {
						var1.ae_fld[var12] = var2.cg();
					}
			}

			var1.av_fld[var12++] = var13;
		}

		return var1;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "([B)Lba;"
	)
	static ba aa(byte[] var0) {
		ba var1 = new ba();
		xi var2 = new xi(var0);
		var2.au_fld = var2.al_fld.length - 2;
		int var3 = xi.tx(var2, 751450971);
		int var4 = var2.al_fld.length - 2 - var3 - 16;
		var2.au_fld = var4;
		int var5 = var2.co();
		var1.ay_fld = xi.tx(var2, 2052384642);
		var1.ar_fld = xi.tx(var2, 1770694691);
		var1.as_fld = xi.tx(var2, 1657737234);
		var1.af_fld = xi.tx(var2, 2006807556);
		var1.al_fld = xi.tx(var2, 1128183038);
		var1.au_fld = xi.tx(var2, 420673366);
		int var6 = var2.cg();
		if (var6 > 0) {
			var1.ag_fld = nm(var1, var6);

			for (int var7 = 0; var7 < var6; var7++) {
				int var8 = xi.tx(var2, 983877881);
				xv var9 = new xv(var8 > 0 ? wp.ay(var8) : 1);
				var1.ag_fld[var7] = var9;

				while (var8-- > 0) {
					int var10 = var2.co();
					int var11 = var2.co();
					var9.ag(new vl(var11), var10);
				}
			}
		}

		var2.au_fld = 0;
		var1.az_fld = var2.ch();
		var1.av_fld = new int[var5];
		var1.ae_fld = new int[var5];
		var1.ah_fld = new String[var5];
		var1.aw_fld = new long[var5];
		int var12 = 0;

		while (var2.au_fld < var4) {
			int var13 = xi.tx(var2, 794740586);
			switch (var13) {
				case 3:
					var1.ah_fld[var12] = xi.kc(var2, -658291494);
					break;
				case 21:
				case 38:
				case 39:
				case 62:
				case 63:
					var1.ae_fld[var12] = var2.cg();
					break;
				case 61:
					var1.aw_fld[var12] = xi.ob(var2, 1217170723);
					break;
				default:
					if (var13 <= 99) {
						var1.ae_fld[var12] = var2.co();
					} else {
						var1.ae_fld[var12] = var2.cg();
					}
			}

			var1.av_fld[var12++] = var13;
		}

		return var1;
	}

	ba() {
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;"
	)
	String ai(int var1) {
		return this.ah_fld[var1];
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)J"
	)
	long ao(int var1) {
		return this.aw_fld[var1];
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Lba;"
	)
	static ba as(int var0) throws EOFException {
		try {
			ba var1 = (ba)ak_fld.ak(var0);
			if (var1 != null) {
				return var1;
			} else {
				byte[] var2 = bj.ib_fld.bb(var0, 0, 584982574);
				if (var2 == null) {
					return null;
				} else {
					var1 = jv.av(var2);
					ak_fld.az(var1, var0);
					return var1;
				}
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "([B)Lba;"
	)
	static ba ax(byte[] var0) {
		ba var1 = new ba();
		xi var2 = new xi(var0);
		var2.au_fld = (var2.al_fld.length - 2) * -1328305860;
		int var3 = xi.tx(var2, 1635442887);
		int var4 = var2.al_fld.length - 2 - var3 - 16;
		var2.au_fld = var4 * -801157169;
		int var5 = var2.co();
		var1.ay_fld = xi.tx(var2, 2108046566);
		var1.ar_fld = xi.tx(var2, 985101608) * 498138877;
		var1.as_fld = xi.tx(var2, 641237411) * -564170261;
		var1.af_fld = xi.tx(var2, 721519865);
		var1.al_fld = xi.tx(var2, 1121269007) * -676922296;
		var1.au_fld = xi.tx(var2, 1971023226);
		int var6 = var2.cg();
		if (var6 > 0) {
			var1.ag_fld = nm(var1, var6);

			for (int var7 = 0; var7 < var6; var7++) {
				int var8 = xi.tx(var2, 822026552);
				xv var9 = new xv(var8 > 0 ? wp.ay(var8) : 1);
				var1.ag_fld[var7] = var9;

				while (var8-- > 0) {
					int var10 = var2.co();
					int var11 = var2.co();
					var9.ag(new vl(var11), var10);
				}
			}
		}

		var2.au_fld = 0;
		var1.az_fld = var2.ch();
		var1.av_fld = new int[var5];
		var1.ae_fld = new int[var5];
		var1.ah_fld = new String[var5];
		var1.aw_fld = new long[var5];
		int var12 = 0;

		while (var2.au_fld < var4) {
			int var13 = xi.tx(var2, 1160133006);
			switch (var13) {
				case 3:
					var1.ah_fld[var12] = xi.kc(var2, -566644445);
					break;
				case 21:
				case 38:
				case 39:
				case 62:
				case 63:
					var1.ae_fld[var12] = var2.cg();
					break;
				case 61:
					var1.aw_fld[var12] = xi.ob(var2, -1225638416);
					break;
				default:
					if (var13 <= 99) {
						var1.ae_fld[var12] = var2.co();
					} else {
						var1.ae_fld[var12] = var2.cg();
					}
			}

			var1.av_fld[var12++] = var13;
		}

		return var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	static void ab() {
		ak_fld.vh();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)[Lxv;"
	)
	xv[] at(int var1) {
		return new xv[var1];
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)[Lxv;"
	)
	xv[] ap(int var1) {
		return new xv[var1];
	}

	@ObfuscatedName("getInstructions")
	@ObfuscatedSignature(
		descriptor = "()[I"
	)
	@Override
	public int[] getInstructions() {
		return this.av_fld;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public static void ag() {
		ot.au_fld.vh();
		ot.ax_fld.vh();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)[Lxv;"
	)
	xv[] ay(int var1, int var2) {
		return new xv[var1];
	}
}
