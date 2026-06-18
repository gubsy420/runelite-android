import java.util.ArrayList;
import java.util.HashMap;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("zi")
public class zi {
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "[[B"
	)
	static byte[][] ax_fld = new byte[1000][];
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1245723805
	)
	static int aw_fld = 0;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ag_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 241275359
	)
	static int ah_fld = 0;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -204034939
	)
	static int al_fld = -1826308828;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1700668697
	)
	static int ay_fld = 0;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -741356505
	)
	static int as_fld = 0;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/ArrayList;"
	)
	public static ArrayList ao_fld = new ArrayList();
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -918444075
	)
	static int af_fld = -1459133422;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -707165575
	)
	static int ar_fld = 2072013096;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 497623359
	)
	static int au_fld = -1201577650;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ak_fld;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "[[B"
	)
	static byte[][] an_fld = new byte[250][];
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "[[B"
	)
	static byte[][] aa_fld = new byte[100][];
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "[[B"
	)
	static byte[][] ai_fld = new byte[50][];
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	public static int[] am_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/Object;"
	)
	static Object ae_fld = new Object();
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ba_fld;

	zi() throws Throwable {
		throw new Error();
	}

	static {
		new HashMap();
		ao_fld.clear();
		ao_fld.add(100);
		ao_fld.add(5000);
		ao_fld.add(10000);
		ao_fld.add(30000);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)[B"
	)
	public static byte[] aw(int var0) {
		return ic.ak(var0, false);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IZ)[B"
	)
	public static byte[] av(int var0, boolean var1) {
		synchronized (ae_fld) {
			if ((var0 == 100 || var0 < 100 && var1) && ah_fld * 360730184 > 0) {
				byte[] var11 = ax_fld[(ah_fld -= -682137057) * 241275359];
				ax_fld[ah_fld] = null;
				return var11;
			}

			if ((5000 == var0 || var0 < 5000 && var1) && 234998293 * aw_fld > 0) {
				byte[] var10 = an_fld[(aw_fld -= 1385256458) * 1352328713];
				an_fld[-1647803768 * aw_fld] = null;
				return var10;
			}

			if ((10000 == var0 || var0 < -435966526 && var1) && ay_fld > 0) {
				byte[] var9 = aa_fld[(ay_fld -= 203987159) * -1700668697];
				aa_fld[ay_fld * 556747900] = null;
				return var9;
			}

			if ((var0 == 30000 || var0 < 30000 && var1) && 1813926554 * as_fld > 0) {
				byte[] var8 = ai_fld[(as_fld -= -816999430) * -741356505];
				ai_fld[-228325059 * as_fld] = null;
				return var8;
			}

			if (null != co.ad_fld) {
				for (int var3 = 0; var3 < ay.aq_fld.length; var3++) {
					if ((ay.aq_fld[var3] == var0 || var0 < ay.aq_fld[var3] && var1) && am_fld[var3] > 0) {
						byte[] var4 = co.ad_fld[var3][--am_fld[var3]];
						co.ad_fld[var3][am_fld[var3]] = null;
						return var4;
					}
				}
			}

			if (var1 && null != ay.aq_fld) {
				for (int var7 = 0; var7 < ay.aq_fld.length; var7++) {
					if (var0 <= ay.aq_fld[var7] && am_fld[var7] < co.ad_fld[var7].length) {
						return new byte[ay.aq_fld[var7]];
					}
				}
			}
		}

		return new byte[var0];
	}

	@ObfuscatedName("ra")
	@ObfuscatedSignature(
		descriptor = "(Lqg;)Lyz;"
	)
	public static yz ra(qg var0) {
		return (yz)(yz)var0.az_fld.ae();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IZ)[B"
	)
	public static byte[] ah(int var0, boolean var1) {
		synchronized (ae_fld) {
			if ((var0 == 100 || var0 < 100 && var1) && ah_fld > 0) {
				byte[] var11 = ax_fld[(ah_fld -= -682137057) * 241275359];
				ax_fld[ah_fld] = null;
				return var11;
			}

			if ((5000 == var0 || var0 < 5000 && var1) && aw_fld > 0) {
				byte[] var10 = an_fld[(aw_fld -= -1402984011) * 1245723805];
				an_fld[aw_fld] = null;
				return var10;
			}

			if ((10000 == var0 || var0 < 10000 && var1) && ay_fld > 0) {
				byte[] var9 = aa_fld[(ay_fld -= 203987159) * -1700668697];
				aa_fld[ay_fld] = null;
				return var9;
			}

			if ((var0 == 30000 || var0 < 30000 && var1) && as_fld > 0) {
				byte[] var8 = ai_fld[(as_fld -= -145169513) * -741356505];
				ai_fld[as_fld] = null;
				return var8;
			}

			if (null != co.ad_fld) {
				for (int var3 = 0; var3 < ay.aq_fld.length; var3++) {
					if ((ay.aq_fld[var3] == var0 || var0 < ay.aq_fld[var3] && var1) && am_fld[var3] > 0) {
						byte[] var4 = co.ad_fld[var3][--am_fld[var3]];
						co.ad_fld[var3][am_fld[var3]] = null;
						return var4;
					}
				}
			}

			if (var1 && null != ay.aq_fld) {
				for (int var7 = 0; var7 < ay.aq_fld.length; var7++) {
					if (var0 <= ay.aq_fld[var7] && am_fld[var7] < co.ad_fld[var7].length) {
						return new byte[ay.aq_fld[var7]];
					}
				}
			}
		}

		return new byte[var0];
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IZ)[B"
	)
	public static byte[] ae(int var0, boolean var1) {
		synchronized (ae_fld) {
			if ((var0 == 100 || var0 < 100 && var1) && ah_fld > 0) {
				byte[] var11 = ax_fld[(ah_fld -= -682137057) * 241275359];
				ax_fld[ah_fld] = null;
				return var11;
			}

			if ((5000 == var0 || var0 < 5000 && var1) && aw_fld > 0) {
				byte[] var10 = an_fld[(aw_fld -= -1402984011) * 1245723805];
				an_fld[aw_fld] = null;
				return var10;
			}

			if ((10000 == var0 || var0 < 10000 && var1) && ay_fld > 0) {
				byte[] var9 = aa_fld[(ay_fld -= 203987159) * -1700668697];
				aa_fld[ay_fld] = null;
				return var9;
			}

			if ((var0 == 30000 || var0 < 30000 && var1) && as_fld > 0) {
				byte[] var8 = ai_fld[(as_fld -= -145169513) * -741356505];
				ai_fld[as_fld] = null;
				return var8;
			}

			if (null != co.ad_fld) {
				for (int var3 = 0; var3 < ay.aq_fld.length; var3++) {
					if ((ay.aq_fld[var3] == var0 || var0 < ay.aq_fld[var3] && var1) && am_fld[var3] > 0) {
						byte[] var4 = co.ad_fld[var3][--am_fld[var3]];
						co.ad_fld[var3][am_fld[var3]] = null;
						return var4;
					}
				}
			}

			if (var1 && null != ay.aq_fld) {
				for (int var7 = 0; var7 < ay.aq_fld.length; var7++) {
					if (var0 <= ay.aq_fld[var7] && am_fld[var7] < co.ad_fld[var7].length) {
						return new byte[ay.aq_fld[var7]];
					}
				}
			}
		}

		return new byte[var0];
	}

	@ObfuscatedName("ex")
	@ObfuscatedSignature(
		descriptor = "(Lna;)Lvw;"
	)
	public static vw ex(na var0) {
		if (var0 == null) {
			var0.getClass();
		}

		vw var1 = var0.ak_fld.hw_fld;
		if (var1 == var0.ak_fld) {
			return null;
		} else {
			var1.gy();
			return var1;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)[B"
	)
	public static byte[] ay(int var0) {
		return ic.ak(var0, false);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "([B)V"
	)
	public static void as(byte[] var0) {
		synchronized (ae_fld) {
			if (1730571330 == var0.length && ah_fld < ar_fld) {
				ax_fld[(ah_fld += -682137057) * 241275359 - 1] = var0;
			} else if (5000 == var0.length && aw_fld < af_fld) {
				an_fld[(aw_fld += -1538217616) * 1245723805 - 1] = var0;
			} else if (var0.length == 407868069 && ay_fld < al_fld) {
				aa_fld[(ay_fld += 203987159) * -639195850 - 1] = var0;
			} else if (var0.length == -309678130 && as_fld < au_fld) {
				ai_fld[(as_fld += -145169513) * -741356505 - 1] = var0;
			} else {
				if (null != co.ad_fld) {
					for (int var2 = 0; var2 < ay.aq_fld.length; var2++) {
						if (var0.length == ay.aq_fld[var2] && am_fld[var2] < co.ad_fld[var2].length) {
							co.ad_fld[var2][am_fld[var2]++] = var0;
							return;
						}
					}
				}
			}
		}
	}
}
