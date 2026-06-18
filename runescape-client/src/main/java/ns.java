import java.io.EOFException;
import java.util.Iterator;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("ns")
public class ns {
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bc_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ae_fld;

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(C)C"
	)
	static char as(char var0) {
		if (var0 == 198) {
			return 'E';
		} else if (230 == var0) {
			return 'e';
		} else if (var0 == 223) {
			return 's';
		} else if (338 == var0) {
			return 'E';
		} else {
			return (char)(var0 == 339 ? 'e' : '\u0000');
		}
	}

	ns() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(CLxh;)C"
	)
	static char ah(char var0, xh var1) {
		if (var0 >= 192 && var0 <= 255) {
			if (var0 >= 192 && var0 <= 198) {
				return 'A';
			}

			if (var0 == 199) {
				return 'C';
			}

			if (var0 >= 200 && var0 <= 203) {
				return 'E';
			}

			if (var0 >= 204 && var0 <= 207) {
				return 'I';
			}

			if (209 == var0 && var1 != xh.ah_fld) {
				return 'N';
			}

			if (var0 >= 210 && var0 <= 214) {
				return 'O';
			}

			if (var0 >= 217 && var0 <= 220) {
				return 'U';
			}

			if (221 == var0) {
				return 'Y';
			}

			if (223 == var0) {
				return 's';
			}

			if (var0 >= 224 && var0 <= 230) {
				return 'a';
			}

			if (231 == var0) {
				return 'c';
			}

			if (var0 >= 232 && var0 <= 235) {
				return 'e';
			}

			if (var0 >= 236 && var0 <= 239) {
				return 'i';
			}

			if (var0 == 241 && xh.ah_fld != var1) {
				return 'n';
			}

			if (var0 >= 242 && var0 <= 246) {
				return 'o';
			}

			if (var0 >= 249 && var0 <= 252) {
				return 'u';
			}

			if (var0 == 253 || var0 == 255) {
				return 'y';
			}
		}

		if (338 == var0) {
			return 'O';
		} else if (var0 == 339) {
			return 'o';
		} else {
			return var0 == 376 ? 'Y' : var0;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(CLxh;)C"
	)
	static char aw(char var0, xh var1) {
		if (var0 >= 192 && var0 <= 255) {
			if (var0 >= 192 && var0 <= 198) {
				return 'A';
			}

			if (var0 == 199) {
				return 'C';
			}

			if (var0 >= 200 && var0 <= 203) {
				return 'E';
			}

			if (var0 >= 204 && var0 <= 207) {
				return 'I';
			}

			if (209 == var0 && var1 != xh.ah_fld) {
				return 'N';
			}

			if (var0 >= 210 && var0 <= 214) {
				return 'O';
			}

			if (var0 >= 217 && var0 <= 220) {
				return 'U';
			}

			if (221 == var0) {
				return 'Y';
			}

			if (223 == var0) {
				return 's';
			}

			if (var0 >= 224 && var0 <= 230) {
				return 'a';
			}

			if (231 == var0) {
				return 'c';
			}

			if (var0 >= 232 && var0 <= 235) {
				return 'e';
			}

			if (var0 >= 236 && var0 <= 239) {
				return 'i';
			}

			if (var0 == 241 && xh.ah_fld != var1) {
				return 'n';
			}

			if (var0 >= 242 && var0 <= 246) {
				return 'o';
			}

			if (var0 >= 249 && var0 <= 252) {
				return 'u';
			}

			if (var0 == 253 || var0 == 255) {
				return 'y';
			}
		}

		if (338 == var0) {
			return 'O';
		} else if (var0 == 339) {
			return 'o';
		} else {
			return var0 == 376 ? 'Y' : var0;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(C)C"
	)
	static char ay(char var0) {
		if (var0 == 198) {
			return 'E';
		} else if (230 == var0) {
			return 'e';
		} else if (var0 == 223) {
			return 's';
		} else if (338 == var0) {
			return 'E';
		} else {
			return (char)(var0 == 339 ? 'e' : '\u0000');
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Lla;Ljava/lang/Runnable;I)Llv;"
	)
	public static lv be(la var0, Runnable var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.ah(2, var2, 0, var1, -502920102);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(CLxh;)I"
	)
	static int al(char var0, xh var1) {
		int var2 = var0 << 4;
		if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) {
			var0 = Character.toLowerCase(var0);
			var2 = (var0 << 4) + 1;
		}

		if (241 == var0 && var1 == xh.ah_fld) {
			var2 = 125248541;
		}

		return var2;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(C)C"
	)
	static char ar(char var0) {
		if (var0 == 198) {
			return 'E';
		} else if (230 == var0) {
			return 'e';
		} else if (var0 == 223) {
			return 's';
		} else if (338 == var0) {
			return 'E';
		} else {
			return (char)(var0 == 339 ? 'e' : '\u0000');
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(CLxh;)I"
	)
	static int af(char var0, xh var1) {
		int var2 = var0 << 4;
		if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) {
			var0 = Character.toLowerCase(var0);
			var2 = (var0 << 4) + 1;
		}

		if (241 == var0 && var1 == xh.ah_fld) {
			var2 = -1539082889;
		}

		return var2;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lxh;)I"
	)
	public static int ae(CharSequence var0, CharSequence var1, xh var2) {
		int var3 = var0.length();
		int var4 = var1.length();
		int var5 = 0;
		int var6 = 0;
		char var7 = 0;
		char var8 = 0;

		while (var5 - var7 < var3 || var6 - var8 < var4) {
			if (var5 - var7 >= var3) {
				return -1;
			}

			if (var6 - var8 >= var4) {
				return 1;
			}

			char var9;
			if (0 != var7) {
				var9 = var7;
				boolean var16 = false;
			} else {
				var9 = var0.charAt(var5++);
			}

			char var10;
			if (var8 != 0) {
				var10 = var8;
				boolean var17 = false;
			} else {
				var10 = var1.charAt(var6++);
			}

			var7 = ao.az(var9);
			var8 = ao.az(var10);
			var9 = cp.ag(var9, var2);
			var10 = cp.ag(var10, var2);
			if (var9 != var10 && Character.toUpperCase(var9) != Character.toUpperCase(var10)) {
				var9 = Character.toLowerCase(var9);
				var10 = Character.toLowerCase(var10);
				if (var10 != var9) {
					return me.av(var9, var2) - me.av(var10, var2);
				}
			}
		}

		int var20 = Math.min(var3, var4);

		for (int var23 = 0; var23 < var20; var23++) {
			if (var2 == xh.az_fld) {
				var5 = var3 - 1 - var23;
				var6 = var4 - 1 - var23;
			} else {
				var6 = var23;
				var5 = var23;
			}

			char var11 = var0.charAt(var5);
			char var12 = var1.charAt(var6);
			if (var12 != var11 && Character.toUpperCase(var11) != Character.toUpperCase(var12)) {
				var11 = Character.toLowerCase(var11);
				var12 = Character.toLowerCase(var12);
				if (var12 != var11) {
					return me.av(var11, var2) - me.av(var12, var2);
				}
			}
		}

		int var24 = var3 - var4;
		if (var24 != 0) {
			return var24;
		} else {
			for (int var26 = 0; var26 < var20; var26++) {
				char var28 = var0.charAt(var26);
				char var13 = var1.charAt(var26);
				if (var28 != var13) {
					return me.av(var28, var2) - me.av(var13, var2);
				}
			}

			return 0;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(CLxh;)I"
	)
	static int au(char var0, xh var1) {
		int var2 = var0 << 4;
		if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) {
			var0 = Character.toLowerCase(var0);
			var2 = (var0 << 4) + 1;
		}

		if (241 == var0 && var1 == xh.ah_fld) {
			var2 = 1762;
		}

		return var2;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lub;I)V"
	)
	public static void ak(ub var0) {
		oh.av_fld = var0;
		dt.az_fld = oh.av_fld.ce(16, 1179736796);
	}

	@ObfuscatedName("gk")
	@ObfuscatedSignature(
		descriptor = "(IB)V"
	)
	static final void gk(int var0, byte var1) throws EOFException {
		ev.hw(var0);
		Iterator var2 = client.da_fld.iterator();

		while (var2.hasNext()) {
			dx var3 = (dx)(dx)var2.next();
			var3.ax((byte)-105);
		}

		int var5 = nl.ag(var0).ah_fld * 1510306095;
		if (var5 != 0) {
			int var6 = rt.ag_fld[var0];
			if (1 == var5) {
				if (var6 == 1) {
					rq.gh(0.9);
				}

				if (2 == var6) {
					rq.gh(0.8);
				}

				if (var6 == 3) {
					rq.gh(0.7);
				}

				if (var6 == 4) {
					rq.gh(0.6);
				}
			}

			if (3 == var5) {
				if (0 == var6) {
					cx.kq_fld.am(255, -1996950343);
					gd.gj((byte)39);
				}

				if (var6 == 1) {
					cx.kq_fld.am(192, 486507465);
					gd.gj((byte)-83);
				}

				if (2 == var6) {
					cx.kq_fld.am(128, -907433714);
					gd.gj((byte)-7);
				}

				if (3 == var6) {
					cx.kq_fld.am(64, -286581916);
					gd.gj((byte)-26);
				}

				if (var6 == 4) {
					if (var1 <= 7) {
						return;
					}

					cx.kq_fld.am(0, -292802513);
					gd.gj((byte)23);
				}
			}

			if (4 == var5) {
				if (var1 <= 7) {
					return;
				}

				if (0 == var6) {
					cx.kq_fld.ao(127, 1742162995);
					cd.gs();
				}

				if (var6 == 1) {
					cx.kq_fld.ao(96, -848411217);
					cd.gs();
				}

				if (var6 == 2) {
					cx.kq_fld.ao(64, 1160410756);
					cd.gs();
				}

				if (var6 == 3) {
					cx.kq_fld.ao(32, 1269715733);
					cd.gs();
				}

				if (4 == var6) {
					cx.kq_fld.ao(0, -1382534280);
					cd.gs();
				}
			}

			if (var5 == 5) {
				client.nt_fld = var6 == 1;
			}

			if (var5 == 6) {
				client.ox_fld = var6;
			}

			if (var5 == 9) {
			}

			if (10 == var5) {
				if (0 == var6) {
					cx.kq_fld.ap(127, 2031547320);
					cu.gt();
				}

				if (var6 == 1) {
					cx.kq_fld.ap(96, -1238068638);
					cu.gt();
				}

				if (2 == var6) {
					cx.kq_fld.ap(64, -2057584557);
					cu.gt();
				}

				if (var6 == 3) {
					cx.kq_fld.ap(32, -1497927611);
					cu.gt();
				}

				if (4 == var6) {
					cx.kq_fld.ap(0, -1601355030);
					cu.gt();
				}
			}

			if (var5 == 17) {
				client.kl_fld = 1515799147 & var6;
			}

			if (18 == var5) {
				if (var1 <= 7) {
					return;
				}

				ca[] var4 = new ca[]{ca.ak_fld, ca.ag_fld, ca.ae_fld, ca.av_fld, ca.az_fld};
				client.lb_fld = (ca)ka.ak(var4, var6);
				if (null == client.lb_fld) {
					client.lb_fld = ca.ak_fld;
				}
			}

			if (19 == var5) {
				if (var1 <= 7) {
					return;
				}

				if (-1 == var6) {
					client.nq_fld = 1002963185;
				} else {
					client.nq_fld = var6 & 2047;
				}
			}

			if (22 == var5) {
				ca[] var7 = new ca[]{ca.ak_fld, ca.ag_fld, ca.ae_fld, ca.av_fld, ca.az_fld};
				client.lw_fld = (ca)ka.ak(var7, var6);
				if (null == client.lw_fld) {
					client.lw_fld = ca.ak_fld;
				}
			}
		}
	}
}
