import java.io.EOFException;
import java.net.URL;
import java.util.Arrays;
import java.util.EnumSet;
import net.runelite.api.World;
import net.runelite.api.WorldType;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;
import net.runelite.api.events.WorldListLoad;

@ObfuscatedName("ct")
@Implements({"World"})
public class ct implements World {
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	static dj ar_fld;
	@ObfuscatedGetter(
		intValue = -2112375145
	)
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ai_fld;
	@ObfuscatedGetter(
		intValue = 1178109413
	)
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ah_fld = 0;
	@ObfuscatedGetter(
		intValue = 427101959
	)
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int aw_fld = 0;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	static int[] ay_fld = new int[]{1, 1, 1, 1};
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	String aq_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ag_fld;
	@ObfuscatedGetter(
		intValue = -407267201
	)
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int af_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ak_fld;
	@ObfuscatedGetter(
		intValue = 2045182223
	)
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int au_fld;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	String ax_fld;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	String an_fld;
	@ObfuscatedGetter(
		intValue = -1164818561
	)
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int aa_fld;
	@ObfuscatedGetter(
		intValue = -2050140537
	)
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int al_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	static int[] as_fld = new int[]{0, 1, 2, 3};

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean bv() {
		return (wu.av_fld.ag(396984677) & this.al_fld) != 0;
	}

	@ObfuscatedName("setPlayerCount")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	public void setPlayerCount(int var1) {
		this.au_fld = var1;
	}

	@ObfuscatedName("setTypes")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/EnumSet;)V"
	)
	@Override
	public void setTypes(EnumSet var1) {
		this.lh(WorldType.toMask(var1));
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean cr() {
		return (wu.be_fld.ag(-1357991296) & this.al_fld) != 0;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean an(int var1) {
		return (wu.ag_fld.ag(122280681) & this.al_fld) != 0;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean ax(int var1) {
		return (wu.az_fld.ag(665113481) & this.al_fld) != 0;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Lyg;"
	)
	public static yg ag(int var0) throws EOFException {
		try {
			yg var2 = (yg)yg.ag_fld.ak(var0);
			if (var2 != null) {
				return var2;
			} else {
				byte[] var3 = yg.ak_fld.bb(39, var0, 584982574);
				var2 = new yg();
				if (null != var3) {
					var2.az(new xi(var3));
				}

				yg.zf(var2, -611885904);
				yg.ag_fld.az(var2, var0);
				return var2;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lct;)Z"
	)
	public static boolean ao(ct var0) {
		if (var0 == null) {
			var0.getClass();
		}

		return (wu.be_fld.ag(281381482) & var0.al_fld) != 0;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean af(int var1) {
		return (wu.br_fld.ag(2113722194) & this.al_fld) != 0;
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean bb() {
		return (wu.az_fld.ag(-1749829333) & this.al_fld) != 0;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "()Lct;"
	)
	static ct bf() {
		return aw_fld < ah_fld ? yd.ae_fld[(aw_fld += 531181239) * 427101959 - 1] : null;
	}

	@ObfuscatedName("um")
	@ObfuscatedSignature(
		descriptor = "(Lct;B)Z"
	)
	public static boolean um(ct var0, byte var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return (wu.be_fld.ag(-416526048) & var0.al_fld) != 0;
		}
	}

	@ObfuscatedName("wp")
	@ObfuscatedSignature(
		descriptor = "(Lct;)Z"
	)
	public static boolean wp(ct var0) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return (wu.av_fld.ag(-1904597292) & var0.al_fld) != 0;
		}
	}

	@ObfuscatedName("lh")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void lh(int var1) {
		this.al_fld = var1;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)Z"
	)
	boolean ai(byte var1) {
		return (wu.as_fld.ag(-782979331) & this.al_fld) != 0;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)Z"
	)
	boolean aq(byte var1) {
		return (wu.bd_fld.ag(1936220500) & this.al_fld) != 0;
	}

	@ObfuscatedName("setAddress")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
	)
	@Override
	public void setAddress(String var1) {
		this.ax_fld = var1;
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "()Lct;"
	)
	static ct bk() {
		aw_fld = 0;
		return ey.ay();
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	static boolean ad() {
		try {
			if (null == ar_fld) {
				ar_fld = xh.jn_fld.as(new URL(uh.gq_fld), (byte)100);
			} else if (ar_fld.ak()) {
				byte[] var0 = ar_fld.ag();
				xi var1 = new xi(var0);
				var1.co();
				ah_fld = xi.tx(var1, 658470045);
				yd.ae_fld = new ct[ah_fld];
				int var2 = 0;

				while (var2 < ah_fld) {
					ct var3 = yd.ae_fld[var2] = new ct();
					var3.af_fld = xi.tx(var1, 1734152749);
					var3.al_fld = var1.co();
					var3.ax_fld = xi.kc(var1, 1550010246);
					var3.an_fld = xi.kc(var1, -1982232262);
					var3.aa_fld = var1.cg();
					var3.au_fld = var1.cz();
					var3.ai_fld = var2++;
				}

				cf.az(yd.ae_fld, 0, yd.ae_fld.length - 1, as_fld, ay_fld, 704826407);
				ar_fld = null;
				return true;
			}
		} catch (Exception var4) {
			var4.printStackTrace();
			ar_fld = null;
		}

		return false;
	}

	@ObfuscatedName("setIndex")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	public void setIndex(int var1) {
		this.ai_fld = var1;
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean bu() {
		return (wu.ak_fld.ag(1885031018) & this.al_fld) != 0;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	static boolean ab() {
		try {
			if (null == ar_fld) {
				ar_fld = xh.jn_fld.as(new URL(uh.gq_fld), (byte)108);
			} else if (ar_fld.ak()) {
				byte[] var0 = ar_fld.ag();
				xi var1 = new xi(var0);
				var1.co();
				ah_fld = xi.tx(var1, 856748735);
				yd.ae_fld = new ct[ah_fld];
				int var2 = 0;

				while (var2 < ah_fld) {
					ct var3 = yd.ae_fld[var2] = new ct();
					var3.af_fld = xi.tx(var1, 1653232631);
					var3.al_fld = var1.co();
					var3.ax_fld = xi.kc(var1, -2091348678);
					var3.an_fld = xi.kc(var1, -940810985);
					var3.aa_fld = var1.cg();
					var3.au_fld = var1.cz();
					var3.ai_fld = var2++;
				}

				cf.az(yd.ae_fld, 0, yd.ae_fld.length - 1, as_fld, ay_fld, 351807487);
				ar_fld = null;
				return true;
			}
		} catch (Exception var4) {
			var4.printStackTrace();
			ar_fld = null;
		}

		return false;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	static void ap(int var0, int var1) {
		int[] var2 = new int[4];
		int[] var3 = new int[4];
		var2[0] = var0;
		var3[0] = var1;
		int var4 = 1;

		for (int var5 = 0; var5 < 4; var5++) {
			if (as_fld[var5] != var0) {
				var2[var4] = as_fld[var5];
				var3[var4] = ay_fld[var5];
				var4++;
			}
		}

		as_fld = var2;
		ay_fld = var3;
		cf.az(yd.ae_fld, 0, yd.ae_fld.length - 1, as_fld, ay_fld, -710504173);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "([Lct;II[I[I)V"
	)
	static void at(ct[] var0, int var1, int var2, int[] var3, int[] var4) {
		if (var1 < var2) {
			int var5 = var1 - 1;
			int var6 = 1 + var2;
			int var7 = (var2 + var1) / 2;
			ct var8 = var0[var7];
			var0[var7] = var0[var1];
			var0[var1] = var8;

			while (var5 < var6) {
				boolean var9 = true;

				do {
					var6--;

					for (int var10 = 0; var10 < 4; var10++) {
						int var11;
						int var12;
						if (var3[var10] == 2) {
							var11 = 1895440985 * var0[var6].ai_fld;
							var12 = var8.ai_fld;
						} else if (1 == var3[var10]) {
							var11 = var0[var6].au_fld * 2045182223;
							var12 = var8.au_fld * -997094567;
							if (var11 == -1 && var4[var10] == 1) {
								var11 = 1138416082;
							}

							if (var12 == -1 && var4[var10] == 1) {
								var12 = -958577885;
							}
						} else if (var3[var10] == 3) {
							var11 = var0[var6].as((short)2048) ? 1 : 0;
							var12 = var8.as((short)2048) ? 1 : 0;
						} else {
							var11 = -407267201 * var0[var6].af_fld;
							var12 = var8.af_fld;
						}

						if (var12 != var11) {
							if ((var4[var10] != 1 || var11 <= var12) && (0 != var4[var10] || var11 >= var12)) {
								var9 = false;
							}
							break;
						}

						if (3 == var10) {
							var9 = false;
						}
					}
				} while (var9);

				var9 = true;

				do {
					var5++;

					for (int var14 = 0; var14 < 4; var14++) {
						int var16;
						int var17;
						if (2 == var3[var14]) {
							var16 = 1975081971 * var0[var5].ai_fld;
							var17 = var8.ai_fld;
						} else if (var3[var14] == 1) {
							var16 = var0[var5].au_fld * 1302528415;
							var17 = var8.au_fld;
							if (var16 == -1 && var4[var14] == 1) {
								var16 = 2001;
							}

							if (var17 == -1 && var4[var14] == 1) {
								var17 = 2001;
							}
						} else if (var3[var14] == 3) {
							var16 = var0[var5].as((short)2048) ? 1 : 0;
							var17 = var8.as((short)2048) ? 1 : 0;
						} else {
							var16 = var0[var5].af_fld * -407267201;
							var17 = var8.af_fld;
						}

						if (var17 != var16) {
							if ((1 != var4[var14] || var16 >= var17) && (0 != var4[var14] || var16 <= var17)) {
								var9 = false;
							}
							break;
						}

						if (3 == var14) {
							var9 = false;
						}
					}
				} while (var9);

				if (var5 < var6) {
					ct var15 = var0[var5];
					var0[var5] = var0[var6];
					var0[var6] = var15;
				}
			}

			cf.az(var0, var1, var6, var3, var4, 754181677);
			cf.az(var0, 1 + var6, var2, var3, var4, 1467216177);
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "([Lct;II[I[I)V"
	)
	static void ac(ct[] var0, int var1, int var2, int[] var3, int[] var4) {
		if (var1 < var2) {
			int var5 = var1 - 1;
			int var6 = 1 + var2;
			int var7 = (var2 + var1) / 2;
			ct var8 = var0[var7];
			var0[var7] = var0[var1];
			var0[var1] = var8;

			while (var5 < var6) {
				boolean var9 = true;

				do {
					var6--;

					for (int var10 = 0; var10 < 4; var10++) {
						int var11;
						int var12;
						if (var3[var10] == 2) {
							var11 = -2112375145 * var0[var6].ai_fld;
							var12 = var8.ai_fld;
						} else if (1 == var3[var10]) {
							var11 = var0[var6].au_fld * 2045182223;
							var12 = var8.au_fld;
							if (var11 == -1 && var4[var10] == 1) {
								var11 = 2001;
							}

							if (var12 == -1 && var4[var10] == 1) {
								var12 = 2001;
							}
						} else if (var3[var10] == 3) {
							var11 = var0[var6].as((short)2048) ? 1 : 0;
							var12 = var8.as((short)2048) ? 1 : 0;
						} else {
							var11 = -407267201 * var0[var6].af_fld;
							var12 = var8.af_fld;
						}

						if (var12 != var11) {
							if ((var4[var10] != 1 || var11 <= var12) && (0 != var4[var10] || var11 >= var12)) {
								var9 = false;
							}
							break;
						}

						if (3 == var10) {
							var9 = false;
						}
					}
				} while (var9);

				var9 = true;

				do {
					var5++;

					for (int var14 = 0; var14 < 4; var14++) {
						int var16;
						int var17;
						if (2 == var3[var14]) {
							var16 = -2112375145 * var0[var5].ai_fld;
							var17 = var8.ai_fld;
						} else if (var3[var14] == 1) {
							var16 = var0[var5].au_fld * 2045182223;
							var17 = var8.au_fld;
							if (var16 == -1 && var4[var14] == 1) {
								var16 = 2001;
							}

							if (var17 == -1 && var4[var14] == 1) {
								var17 = 2001;
							}
						} else if (var3[var14] == 3) {
							var16 = var0[var5].as((short)2048) ? 1 : 0;
							var17 = var8.as((short)2048) ? 1 : 0;
						} else {
							var16 = var0[var5].af_fld * -407267201;
							var17 = var8.af_fld;
						}

						if (var17 != var16) {
							if ((1 != var4[var14] || var16 >= var17) && (0 != var4[var14] || var16 <= var17)) {
								var9 = false;
							}
							break;
						}

						if (3 == var14) {
							var9 = false;
						}
					}
				} while (var9);

				if (var5 < var6) {
					ct var15 = var0[var5];
					var0[var5] = var0[var6];
					var0[var6] = var15;
				}
			}

			cf.az(var0, var1, var6, var3, var4, 1469231570);
			cf.az(var0, 1 + var6, var2, var3, var4, -1807590108);
		}
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(IZIZ)V"
	)
	static void bm(int var0, boolean var1, int var2, boolean var3) {
		if (null != yd.ae_fld) {
			bw.ae(0, yd.ae_fld.length - 1, var0, var1, var2, var3);
		}
	}

	@ObfuscatedName("getPlayerCount")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getPlayerCount() {
		return this.au_fld;
	}

	@ObfuscatedName("sz")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int sz() {
		return this.al_fld;
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean cc() {
		return (wu.az_fld.ag(-710514291) & this.al_fld) != 0;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lsl;Ljava/lang/Object;II)V"
	)
	public static void aw(sl var0, Object var1, int var2, int var3) {
		om.ap(var0, null, true, (byte)0);
		if (var2 < 0) {
			var2 = 0;
		}

		int var5 = var3 + var2;
		if (var3 < 0 || var5 < 0 || var5 > var0.av()) {
			var5 = var0.av();
		}

		if (var0.ag_fld == yq.ak_fld) {
			Arrays.fill(var0.ak(), var2, var5, ((Integer)var1).intValue());
		} else if (yq.ag_fld == var0.ag_fld) {
			Arrays.fill(var0.ag(), var2, var5, ((Long)var1).longValue());
		} else {
			Arrays.fill((Object[])var0.az(), var2, var5, var1);
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Lct;Lct;IZ)I"
	)
	static int be(ct var0, ct var1, int var2, boolean var3) {
		if (var2 == 1) {
			int var4 = var0.au_fld;
			int var5 = var1.au_fld;
			if (!var3) {
				if (-1 == var4) {
					var4 = 2001;
				}

				if (var5 == -1) {
					var5 = 2001;
				}
			}

			return var4 - var5;
		} else if (var2 == 2) {
			return var0.aa_fld - var1.aa_fld;
		} else if (3 == var2) {
			if (var0.an_fld.equals("-")) {
				if (var1.an_fld.equals("-")) {
					return 0;
				} else {
					return var3 ? -1 : 1;
				}
			} else if (var1.an_fld.equals("-")) {
				return var3 ? 1 : -1;
			} else {
				return var0.an_fld.compareTo(var1.an_fld);
			}
		} else if (var2 == 4) {
			return var0.au((byte)0) ? (var1.au((byte)0) ? 0 : 1) : (var1.au((byte)0) ? -1 : 0);
		} else if (var2 == 5) {
			return var0.an(1886978513) ? (var1.an(1886978513) ? 0 : 1) : (var1.an(1886978513) ? -1 : 0);
		} else if (6 == var2) {
			return var0.ax(298519631) ? (var1.ax(1345372576) ? 0 : 1) : (var1.ax(1483713460) ? -1 : 0);
		} else if (7 == var2) {
			return var0.as((short)2048) ? (var1.as((short)2048) ? 0 : 1) : (var1.as((short)2048) ? -1 : 0);
		} else {
			return var0.af_fld - var1.af_fld;
		}
	}

	@ObfuscatedName("setActivity")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
	)
	@Override
	public void setActivity(String var1) {
		this.an_fld = var1;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "()Lct;"
	)
	static ct bs() {
		aw_fld = 0;
		return ey.ay();
	}

	@ObfuscatedName("getAddress")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	@Override
	public String getAddress() {
		return this.ax_fld;
	}

	@ObfuscatedName("getIndex")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getIndex() {
		return this.ai_fld;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "([Lct;II[I[I)V"
	)
	static void aj(ct[] var0, int var1, int var2, int[] var3, int[] var4) {
		if (var1 < var2) {
			int var5 = var1 - 1;
			int var6 = 1 + var2;
			int var7 = (var2 + var1) / 2;
			ct var8 = var0[var7];
			var0[var7] = var0[var1];
			var0[var1] = var8;

			while (var5 < var6) {
				boolean var9 = true;

				do {
					var6--;

					for (int var10 = 0; var10 < 4; var10++) {
						int var11;
						int var12;
						if (var3[var10] == 2) {
							var11 = -2112375145 * var0[var6].ai_fld;
							var12 = var8.ai_fld * -1085169639;
						} else if (1 == var3[var10]) {
							var11 = var0[var6].au_fld * 1177411198;
							var12 = var8.au_fld;
							if (var11 == -1 && var4[var10] == 1) {
								var11 = 2001;
							}

							if (var12 == -1 && var4[var10] == 1) {
								var12 = -1878438883;
							}
						} else if (var3[var10] == 3) {
							var11 = var0[var6].as((short)2048) ? 1 : 0;
							var12 = var8.as((short)2048) ? 1 : 0;
						} else {
							var11 = -407267201 * var0[var6].af_fld;
							var12 = var8.af_fld;
						}

						if (var12 != var11) {
							if ((var4[var10] != 1 || var11 <= var12) && (0 != var4[var10] || var11 >= var12)) {
								var9 = false;
							}
							break;
						}

						if (3 == var10) {
							var9 = false;
						}
					}
				} while (var9);

				var9 = true;

				do {
					var5++;

					for (int var14 = 0; var14 < 4; var14++) {
						int var16;
						int var17;
						if (2 == var3[var14]) {
							var16 = 1723410251 * var0[var5].ai_fld;
							var17 = var8.ai_fld * 683321153;
						} else if (var3[var14] == 1) {
							var16 = var0[var5].au_fld * 2045182223;
							var17 = var8.au_fld;
							if (var16 == -1 && var4[var14] == 1) {
								var16 = 2001;
							}

							if (var17 == -1 && var4[var14] == 1) {
								var17 = 554344248;
							}
						} else if (var3[var14] == 3) {
							var16 = var0[var5].as((short)2048) ? 1 : 0;
							var17 = var8.as((short)2048) ? 1 : 0;
						} else {
							var16 = var0[var5].af_fld * 484355522;
							var17 = var8.af_fld * 1937123863;
						}

						if (var17 != var16) {
							if ((1 != var4[var14] || var16 >= var17) && (0 != var4[var14] || var16 <= var17)) {
								var9 = false;
							}
							break;
						}

						if (3 == var14) {
							var9 = false;
						}
					}
				} while (var9);

				if (var5 < var6) {
					ct var15 = var0[var5];
					var0[var5] = var0[var6];
					var0[var6] = var15;
				}
			}

			cf.az(var0, var1, var6, var3, var4, 466317841);
			cf.az(var0, 1 + var6, var2, var3, var4, -398253310);
		}
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean bt() {
		return (wu.bd_fld.ag(1348861355) & this.al_fld) != 0;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "()Lct;"
	)
	static ct bj() {
		aw_fld = 0;
		return ey.ay();
	}

	@ObfuscatedName("yq")
	@ObfuscatedSignature(
		descriptor = "(Lct;)Z"
	)
	public static boolean yq(ct var0) {
		if (var0 == null) {
			var0.getClass();
		}

		return (wu.br_fld.ag(-1672300430) & var0.al_fld) != 0;
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean ca() {
		return (wu.ag_fld.ag(-2116548928) & this.al_fld) != 0;
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean cm() {
		return (wu.aj_fld.ag(-879340344) & this.al_fld) != 0;
	}

	@ObfuscatedName("getId")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getId() {
		return this.af_fld;
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean cn() {
		return (wu.ak_fld.ag(984854900) & this.al_fld) != 0;
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean cs() {
		return (wu.ai_fld.ag(2040180522) & this.al_fld) != 0;
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean by() {
		return (wu.ag_fld.ag(710374692) & this.al_fld) != 0;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean bq() {
		return (wu.ag_fld.ag(-1580774260) & this.al_fld) != 0;
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean cy() {
		return (wu.ag_fld.ag(462021858) & this.al_fld) != 0;
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean bc() {
		return (wu.az_fld.ag(1011861115) & this.al_fld) != 0;
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(Lct;I)Z"
	)
	public static boolean cr(ct var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return (wu.ai_fld.ag(-1753690510) & var0.al_fld) != 0;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	static boolean ao() {
		try {
			if (null == ar_fld) {
				ar_fld = xh.jn_fld.as(new URL(uh.gq_fld), (byte)81);
			} else if (ar_fld.ak()) {
				byte[] var0 = ar_fld.ag();
				xi var1 = new xi(var0);
				var1.co();
				ah_fld = xi.tx(var1, 1495011413) * 1634888816;
				yd.ae_fld = new ct[ah_fld * 143557212];
				int var2 = 0;

				while (var2 < ah_fld) {
					ct var3 = yd.ae_fld[var2] = new ct();
					var3.af_fld = xi.tx(var1, 1525179242);
					var3.al_fld = var1.co();
					var3.ax_fld = xi.kc(var1, -1075125605);
					var3.an_fld = xi.kc(var1, -170875815);
					var3.aa_fld = var1.cg() * 1967681489;
					var3.au_fld = var1.cz();
					var3.ai_fld = var2++;
				}

				cf.az(yd.ae_fld, 0, yd.ae_fld.length - 1, as_fld, ay_fld, -1149704808);
				ar_fld = null;
				return true;
			}
		} catch (Exception var4) {
			var4.printStackTrace();
			ar_fld = null;
		}

		return false;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(IIIZIZ)V"
	)
	static void br(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
		if (var0 < var1) {
			int var6 = (var1 + var0) / 2;
			int var7 = var0;
			ct var8 = yd.ae_fld[var6];
			yd.ae_fld[var6] = yd.ae_fld[var1];
			yd.ae_fld[var1] = var8;

			for (int var9 = var0; var9 < var1; var9++) {
				ct var11 = yd.ae_fld[var9];
				int var12 = ku.ah(var11, var8, var2, var3);
				int var10;
				if (var12 != 0) {
					if (var3) {
						var10 = -var12;
					} else {
						var10 = var12;
					}
				} else if (var4 == -1) {
					var10 = 0;
				} else {
					int var13 = ku.ah(var11, var8, var4, var5);
					if (var5) {
						var10 = -var13;
					} else {
						var10 = var13;
					}
				}

				if (var10 <= 0) {
					ct var14 = yd.ae_fld[var9];
					yd.ae_fld[var9] = yd.ae_fld[var7];
					yd.ae_fld[var7++] = var14;
				}
			}

			yd.ae_fld[var1] = yd.ae_fld[var7];
			yd.ae_fld[var7] = var8;
			bw.ae(var0, var7 - 1, var2, var3, var4, var5);
			bw.ae(1 + var7, var1, var2, var3, var4, var5);
		}
	}

	@ObfuscatedName("setLocation")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	public void setLocation(int var1) {
		this.aa_fld = var1;
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean bn() {
		return (wu.aj_fld.ag(-145480877) & this.al_fld) != 0;
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean bx() {
		return (wu.av_fld.ag(907644400) & this.al_fld) != 0;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Llu;III)V"
	)
	static final void ai(lu var0, int var1, int var2, int var3) {
		if (null == var0.eg_fld) {
			throw new RuntimeException();
		} else {
			var0.eg_fld[var1] = var2;
			var0.ef_fld[var1] = var3;
		}
	}

	@ObfuscatedName("getActivity")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	@Override
	public String getActivity() {
		return this.an_fld;
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean cq() {
		return (wu.av_fld.ag(911862563) & this.al_fld) != 0;
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean bg() {
		return (wu.av_fld.ag(-1350519461) & this.al_fld) != 0;
	}

	@ObfuscatedName("ew")
	@ObfuscatedSignature(
		descriptor = "(Lda;)V"
	)
	public static void ew(da var0) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			var0.cm_fld.ag();
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "()Lct;"
	)
	static ct bh() {
		aw_fld = 0;
		return ey.ay();
	}

	@ObfuscatedName("fk")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void fk(int var1) {
		ct[] var2 = og.ci_fld.getWorldList();
		if (var2 != null && var2.length > 0 && var2[var2.length - 1] == this) {
			WorldListLoad var3 = new WorldListLoad(var2);
			og.ci_fld.getCallbacks().post(var3);
		}
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean cf() {
		return (wu.br_fld.ag(678973313) & this.al_fld) != 0;
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean cv() {
		return (wu.br_fld.ag(-1195659731) & this.al_fld) != 0;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(S)Z"
	)
	boolean as(short var1) {
		return (wu.ak_fld.ag(552830064) & this.al_fld) != 0;
	}

	@ObfuscatedName("setId")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	public void setId(int var1) {
		this.af_fld = var1;
	}

	@ObfuscatedName("sh")
	@ObfuscatedSignature(
		descriptor = "(Lct;)Z"
	)
	public static boolean sh(ct var0) {
		if (var0 == null) {
			var0.getClass();
		}

		return (wu.aj_fld.ag(1570164675) & var0.al_fld) != 0;
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean cg() {
		return (wu.aj_fld.ag(1414491458) & this.al_fld) != 0;
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean cp() {
		return (wu.aj_fld.ag(-1266719471) & this.al_fld) != 0;
	}

	@ObfuscatedName("getTypes")
	@ObfuscatedSignature(
		descriptor = "()Ljava/util/EnumSet;"
	)
	@Override
	public EnumSet getTypes() {
		return WorldType.fromMask(this.sz());
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean bi() {
		return (wu.be_fld.ag(-1944587561) & this.al_fld) != 0;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean ar(int var1) {
		return (wu.aj_fld.ag(1007299867) & this.al_fld) != 0;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)Z"
	)
	boolean au(byte var1) {
		return (wu.av_fld.ag(721919362) & this.al_fld) != 0;
	}

	@ObfuscatedName("getLocation")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getLocation() {
		return this.aa_fld;
	}

	ct() {
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean bl() {
		return (wu.be_fld.ag(-1804533282) & this.al_fld) != 0;
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean bp() {
		return (wu.as_fld.ag(-649228816) & this.al_fld) != 0;
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean ba() {
		return (wu.be_fld.ag(-768161906) & this.al_fld) != 0;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(IIIZIZ)V"
	)
	static void bz(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
		if (var0 < var1) {
			int var6 = (var1 + var0) / 2;
			int var7 = var0;
			ct var8 = yd.ae_fld[var6];
			yd.ae_fld[var6] = yd.ae_fld[var1];
			yd.ae_fld[var1] = var8;

			for (int var9 = var0; var9 < var1; var9++) {
				ct var11 = yd.ae_fld[var9];
				int var12 = ku.ah(var11, var8, var2, var3);
				int var10;
				if (var12 != 0) {
					if (var3) {
						var10 = -var12;
					} else {
						var10 = var12;
					}
				} else if (var4 == -1) {
					var10 = 0;
				} else {
					int var13 = ku.ah(var11, var8, var4, var5);
					if (var5) {
						var10 = -var13;
					} else {
						var10 = var13;
					}
				}

				if (var10 <= 0) {
					ct var14 = yd.ae_fld[var9];
					yd.ae_fld[var9] = yd.ae_fld[var7];
					yd.ae_fld[var7++] = var14;
				}
			}

			yd.ae_fld[var1] = yd.ae_fld[var7];
			yd.ae_fld[var7] = var8;
			bw.ae(var0, var7 - 1, var2, var3, var4, var5);
			bw.ae(1 + var7, var1, var2, var3, var4, var5);
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	static boolean am() {
		try {
			if (null == ar_fld) {
				ar_fld = xh.jn_fld.as(new URL(uh.gq_fld), (byte)78);
			} else if (ar_fld.ak()) {
				byte[] var0 = ar_fld.ag();
				xi var1 = new xi(var0);
				var1.co();
				ah_fld = xi.tx(var1, 1396679643);
				yd.ae_fld = new ct[ah_fld];
				int var2 = 0;

				while (var2 < ah_fld) {
					ct var3 = yd.ae_fld[var2] = new ct();
					var3.af_fld = xi.tx(var1, 677715358);
					var3.al_fld = var1.co();
					var3.ax_fld = xi.kc(var1, -212162066);
					var3.an_fld = xi.kc(var1, 519971931);
					var3.aa_fld = var1.cg();
					var3.au_fld = var1.cz();
					var3.ai_fld = var2++;
				}

				cf.az(yd.ae_fld, 0, yd.ae_fld.length - 1, as_fld, ay_fld, 1019369764);
				ar_fld = null;
				return true;
			}
		} catch (Exception var4) {
			var4.printStackTrace();
			ar_fld = null;
		}

		return false;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(IZIZ)V"
	)
	static void bd(int var0, boolean var1, int var2, boolean var3) {
		if (null != yd.ae_fld) {
			bw.ae(0, yd.ae_fld.length - 1, var0, var1, var2, var3);
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean al(int var1) {
		return (wu.al_fld.ag(665113481) & this.au_fld) != 0;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)Z"
	)
	boolean aa(byte var1) {
		return (wu.al_fld.ag(-416526048) & this.al_fld) != 0;
	}
}
