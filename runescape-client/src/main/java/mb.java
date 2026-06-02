import java.io.EOFException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("mb")
public class mb {
	@ObfuscatedGetter(
		intValue = -2062391689
	)
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ar_fld = 0;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/ArrayList;"
	)
	public static ArrayList ag_fld = null;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/LinkedList;"
	)
	public static LinkedList az_fld = new LinkedList();
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/ArrayList;"
	)
	public static ArrayList av_fld = new ArrayList(3);
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	public static ub ah_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	public static ub aw_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/ArrayList;"
	)
	public static ArrayList ay_fld = new ArrayList(3);
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/ArrayList;"
	)
	public static ArrayList as_fld = new ArrayList();
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/List;"
	)
	public static List ak_fld = new ArrayList();
	@ObfuscatedGetter(
		intValue = 1555461303
	)
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int af_fld = 0;
	@ObfuscatedGetter(
		intValue = 1244459339
	)
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int al_fld = 0;
	@ObfuscatedGetter(
		intValue = -163004517
	)
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int au_fld = 0;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int am_fld;

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public static boolean bk() {
		boolean var0 = false;
		boolean var1 = false;
		if (!as_fld.isEmpty()) {
			ws var2 = (ws)(ws)as_fld.get(0);
			if (null == var2) {
				as_fld.remove(0);
			} else if (var2.ak((short)793)) {
				if (var2.ay()) {
					System.out.println("Error in midimanager.service: " + var2.ar());
					var0 = true;
				} else {
					if (var2.af() != null) {
						as_fld.add(1, var2.af());
					}

					var1 = var2.as();
				}

				as_fld.remove(0);
			} else {
				var1 = var2.as();
			}
		}

		if (var0) {
			as_fld.clear();
			Iterator var4 = av_fld.iterator();

			while (var4.hasNext()) {
				me var3 = (me)(me)var4.next();
				if (var3 != null) {
					var3.af_fld.au();
					var3.af_fld.ar();
					var3.af_fld.ak(0);
					var3.af_fld.aw_fld = 0;
					je.ag(var3.ag_fld, var3.az_fld);
				}
			}

			av_fld.clear();
		}

		return var1;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lmq;)V"
	)
	public static void ax(mq var0) {
		if (!ak_fld.contains(var0)) {
			ak_fld.add(var0);
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lmq;)V"
	)
	public static void an(mq var0) {
		if (!ak_fld.contains(var0)) {
			ak_fld.add(var0);
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lmq;)V"
	)
	public static void aa(mq var0) {
		if (!ak_fld.contains(var0)) {
			ak_fld.add(var0);
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lmq;)V"
	)
	public static void ai(mq var0) {
		if (!ak_fld.contains(var0)) {
			ak_fld.add(var0);
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public static void aq(int var0, int var1) {
		Iterator var2 = ak_fld.iterator();

		while (var2.hasNext()) {
			mq var3 = (mq)(mq)var2.next();
			var3.id(var0, var1, 1843858322);
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public static void am(int var0, int var1) {
		Iterator var2 = ak_fld.iterator();

		while (var2.hasNext()) {
			mq var3 = (mq)(mq)var2.next();
			var3.id(var0, var1, 1843858322);
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;IIIIZ)V"
	)
	public static void ad(ArrayList var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (!var0.isEmpty()) {
			az_fld.clear();
			as_fld.clear();
			if (var5) {
				Iterator var6 = av_fld.iterator();

				while (var6.hasNext()) {
					me var7 = (me)(me)var6.next();
					if (var7 != null) {
						var7.af_fld.au();
						var7.af_fld.ar();
						var7.af_fld.ak(0);
						var7.af_fld.aw_fld = 0;
						je.ag(var7.ag_fld, var7.az_fld);
					}
				}

				av_fld.clear();
			} else {
				for (int var9 = 0; var9 < av_fld.size(); var9++) {
					me var11 = (me)(me)av_fld.get(var9);
					if (var11 == null) {
						av_fld.remove(var9);
						var9--;
					} else if (var11.ay_fld) {
						if (-1034371599 * var11.af_fld.aw_fld > 0) {
							var11.af_fld.aw_fld--;
						}

						var11.af_fld.au();
						var11.af_fld.ar();
						var11.af_fld.ak(0);
						av_fld.remove(var9);
						var9--;
					} else {
						var11.ay_fld = true;
					}
				}
			}

			td.ar(var0, var5, -1299851160);
			if (!az_fld.isEmpty()) {
				cw.af(var1, var2, var3, var4);
				as_fld.add(new vz(null));
				as_fld.add(new vf(null, ec.ae_fld, ah_fld, aw_fld));
				ArrayList var10 = new ArrayList();
				var10.add(new wp(new wx(null, 0, true, au_fld)));
				if (!av_fld.isEmpty()) {
					ArrayList var12 = new ArrayList();
					var12.add(new we(new va(null, var10), al_fld));
					ArrayList var8 = ky.al();
					var12.add(new we(new wg(new vj(null, var8), 0, false, af_fld), ar_fld));
					as_fld.add(new va(null, var12));
				} else {
					as_fld.add(new we(null, al_fld));
					as_fld.add(new va(null, var10));
				}
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;IIIIZ)V"
	)
	public static void ao(ArrayList var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (!var0.isEmpty()) {
			az_fld.clear();
			as_fld.clear();
			if (var5) {
				Iterator var6 = av_fld.iterator();

				while (var6.hasNext()) {
					me var7 = (me)(me)var6.next();
					if (var7 != null) {
						var7.af_fld.au();
						var7.af_fld.ar();
						var7.af_fld.ak(0);
						var7.af_fld.aw_fld = 0;
						je.ag(var7.ag_fld * 1437412149, -508183760 * var7.az_fld);
					}
				}

				av_fld.clear();
			} else {
				for (int var9 = 0; var9 < av_fld.size(); var9++) {
					me var11 = (me)(me)av_fld.get(var9);
					if (var11 == null) {
						av_fld.remove(var9);
						var9--;
					} else if (var11.ay_fld) {
						if (-1034371599 * var11.af_fld.aw_fld > 0) {
							var11.af_fld.aw_fld--;
						}

						var11.af_fld.au();
						var11.af_fld.ar();
						var11.af_fld.ak(0);
						av_fld.remove(var9);
						var9--;
					} else {
						var11.ay_fld = true;
					}
				}
			}

			td.ar(var0, var5, -1299851160);
			if (!az_fld.isEmpty()) {
				cw.af(var1, var2, var3, var4);
				as_fld.add(new vz(null));
				as_fld.add(new vf(null, ec.ae_fld, ah_fld, aw_fld));
				ArrayList var10 = new ArrayList();
				var10.add(new wp(new wx(null, 0, true, au_fld * -1029121711)));
				if (!av_fld.isEmpty()) {
					ArrayList var12 = new ArrayList();
					var12.add(new we(new va(null, var10), al_fld));
					ArrayList var8 = ky.al();
					var12.add(new we(new wg(new vj(null, var8), 0, false, af_fld * -1727369034), ar_fld));
					as_fld.add(new va(null, var12));
				} else {
					as_fld.add(new we(null, 2117837842 * al_fld));
					as_fld.add(new va(null, var10));
				}
			}
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public static void ab(int var0, int var1) {
		cw.af(var0, var1, 0, 0);
		ay_fld.clear();
		as_fld.clear();
		if (av_fld.isEmpty() || 0 == var0 && var1 == 0) {
			Iterator var4 = av_fld.iterator();

			while (var4.hasNext()) {
				me var3 = (me)(me)var4.next();
				if (var3 != null) {
					var3.af_fld.au();
					var3.af_fld.ar();
					var3.af_fld.ak(0);
					var3.af_fld.aw_fld = 0;
					je.ag(var3.ag_fld, var3.az_fld);
				}
			}

			av_fld.clear();
		} else {
			as_fld.add(new we(null, ar_fld));
			as_fld.add(new wg(null, 0, false, af_fld));
			ArrayList var2 = ky.al();
			as_fld.add(new vj(null, var2));
		}
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;Z)V"
	)
	static void bj(ArrayList var0, boolean var1) {
		if (!var1) {
			ay_fld.clear();
		}

		Iterator var2 = var0.iterator();

		while (var2.hasNext()) {
			me var3 = (me)(me)var2.next();
			if (var3.ag_fld != -1 && -1 != var3.az_fld) {
				if (!var1) {
					ay_fld.add(var3);
				}

				az_fld.add(var3);
			}
		}
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public static boolean bh() {
		boolean var0 = false;
		boolean var1 = false;
		if (!as_fld.isEmpty()) {
			ws var2 = (ws)(ws)as_fld.get(0);
			if (null == var2) {
				as_fld.remove(0);
			} else if (var2.ak((short)914)) {
				if (var2.ay()) {
					System.out.println("Error in midimanager.service: " + var2.ar());
					var0 = true;
				} else {
					if (var2.af() != null) {
						as_fld.add(1, var2.af());
					}

					var1 = var2.as();
				}

				as_fld.remove(0);
			} else {
				var1 = var2.as();
			}
		}

		if (var0) {
			as_fld.clear();
			Iterator var4 = av_fld.iterator();

			while (var4.hasNext()) {
				me var3 = (me)(me)var4.next();
				if (var3 != null) {
					var3.af_fld.au();
					var3.af_fld.ar();
					var3.af_fld.ak(0);
					var3.af_fld.aw_fld = 0;
					je.ag(var3.ag_fld, var3.az_fld);
				}
			}

			av_fld.clear();
		}

		return var1;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public static boolean bs() {
		boolean var0 = false;
		boolean var1 = false;
		if (!as_fld.isEmpty()) {
			ws var2 = (ws)(ws)as_fld.get(0);
			if (null == var2) {
				as_fld.remove(0);
			} else if (var2.ak((short)18385)) {
				if (var2.ay()) {
					System.out.println("Error in midimanager.service: " + var2.ar());
					var0 = true;
				} else {
					if (var2.af() != null) {
						as_fld.add(1, var2.af());
					}

					var1 = var2.as();
				}

				as_fld.remove(0);
			} else {
				var1 = var2.as();
			}
		}

		if (var0) {
			as_fld.clear();
			Iterator var4 = av_fld.iterator();

			while (var4.hasNext()) {
				me var3 = (me)(me)var4.next();
				if (var3 != null) {
					var3.af_fld.au();
					var3.af_fld.ar();
					var3.af_fld.ak(0);
					var3.af_fld.aw_fld = 0;
					je.ag(var3.ag_fld, var3.az_fld);
				}
			}

			av_fld.clear();
		}

		return var1;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public static boolean bm() {
		return !ay_fld.isEmpty();
	}

	@ObfuscatedName("vd")
	@ObfuscatedSignature(
		descriptor = "(Lcl;IIIII)V"
	)
	public static void vd(cl var0, int var1, int var2, int var3, int var4, int var5) throws EOFException {
		if (var0 == null) {
			var0.getClass();
		}

		for (int var6 = 0; var6 < var0.ak_fld.size(); var6++) {
			((da)var0.ak_fld.get(var6)).ds(var1, 692533189 * client.dv_fld, var2, var3, var4, var5, -417197841);
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	public static void ap(int var0, int var1, int var2, int var3) {
		if (av_fld.size() > 1 && av_fld.get(0) != null && ((me)av_fld.get(0)).af_fld.ax() && av_fld.get(1) != null && ((me)av_fld.get(1)).af_fld.ax()) {
			cw.af(var0, var1, var2, var3);
			as_fld.add(new vs(null));
			ArrayList var4 = new ArrayList();
			var4.add(new we(new wx(null, 1, false, au_fld), al_fld));
			var4.add(new we(new wg(null, 0, false, af_fld), ar_fld));
			as_fld.add(new va(null, var4));
			if (ay_fld.get(0) != null && ay_fld.get(1) != null) {
				me var5 = (me)(me)ay_fld.get(0);
				ay_fld.set(0, av_fld.get(1));
				ay_fld.set(1, var5);
			}
		}
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public static void br() {
		ay_fld.clear();
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public static void bz() {
		ay_fld.clear();
	}

	mb() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;Z)V"
	)
	static void bf(ArrayList var0, boolean var1) {
		if (!var1) {
			ay_fld.clear();
		}

		Iterator var2 = var0.iterator();

		while (var2.hasNext()) {
			me var3 = (me)(me)var2.next();
			if (var3.ag_fld != -1 && -1 != var3.az_fld) {
				if (!var1) {
					ay_fld.add(var3);
				}

				az_fld.add(var3);
			}
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public static boolean be() {
		boolean var0 = false;
		boolean var1 = false;
		if (!as_fld.isEmpty()) {
			ws var2 = (ws)(ws)as_fld.get(0);
			if (null == var2) {
				as_fld.remove(0);
			} else if (var2.ak((short)-7822)) {
				if (var2.ay()) {
					System.out.println("Error in midimanager.service: " + var2.ar());
					var0 = true;
				} else {
					if (var2.af() != null) {
						as_fld.add(1, var2.af());
					}

					var1 = var2.as();
				}

				as_fld.remove(0);
			} else {
				var1 = var2.as();
			}
		}

		if (var0) {
			as_fld.clear();
			Iterator var4 = av_fld.iterator();

			while (var4.hasNext()) {
				me var3 = (me)(me)var4.next();
				if (var3 != null) {
					var3.af_fld.au();
					var3.af_fld.ar();
					var3.af_fld.ak(0);
					var3.af_fld.aw_fld = 0;
					je.ag(var3.ag_fld, var3.az_fld * -1577833143);
				}
			}

			av_fld.clear();
		}

		return var1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	public static void ac(int var0, int var1, int var2, int var3) {
		if (av_fld.size() > 1 && av_fld.get(0) != null && ((me)av_fld.get(0)).af_fld.ax() && av_fld.get(1) != null && ((me)av_fld.get(1)).af_fld.ax()) {
			cw.af(var0, var1, var2, var3);
			as_fld.add(new vs(null));
			ArrayList var4 = new ArrayList();
			var4.add(new we(new wx(null, 1, false, au_fld), al_fld));
			var4.add(new we(new wg(null, 0, false, af_fld), ar_fld));
			as_fld.add(new va(null, var4));
			if (ay_fld.get(0) != null && ay_fld.get(1) != null) {
				me var5 = (me)(me)ay_fld.get(0);
				ay_fld.set(0, av_fld.get(1));
				ay_fld.set(1, var5);
			}
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	public static void at(int var0, int var1, int var2, int var3) {
		if (av_fld.size() > 1 && av_fld.get(0) != null && ((me)av_fld.get(0)).af_fld.ax() && av_fld.get(1) != null && ((me)av_fld.get(1)).af_fld.ax()) {
			cw.af(var0, var1, var2, var3);
			as_fld.add(new vs(null));
			ArrayList var4 = new ArrayList();
			var4.add(new we(new wx(null, 1, false, au_fld), al_fld));
			var4.add(new we(new wg(null, 0, false, af_fld), ar_fld));
			as_fld.add(new va(null, var4));
			if (ay_fld.get(0) != null && ay_fld.get(1) != null) {
				me var5 = (me)(me)ay_fld.get(0);
				ay_fld.set(0, av_fld.get(1));
				ay_fld.set(1, var5);
			}
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public static boolean aj(int var0) {
		if (ay_fld.isEmpty()) {
			return false;
		} else {
			me var1 = (me)(me)ay_fld.get(0);
			return var1 != null && var0 == var1.ag_fld;
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public static void bd() {
		ay_fld.clear();
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;Z)V"
	)
	static void by(ArrayList var0, boolean var1) {
		if (!var1) {
			ay_fld.clear();
		}

		Iterator var2 = var0.iterator();

		while (var2.hasNext()) {
			me var3 = (me)(me)var2.next();
			if (var3.ag_fld != -1 && -1 != var3.az_fld) {
				if (!var1) {
					ay_fld.add(var3);
				}

				az_fld.add(var3);
			}
		}
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	static void bl(int var0, int var1, int var2, int var3) {
		ar_fld = var0;
		af_fld = var1;
		al_fld = -1041145911 * var2;
		au_fld = var3;
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	static void bx(int var0, int var1, int var2, int var3) {
		ar_fld = 1508636893 * var0;
		af_fld = -62860005 * var1;
		al_fld = var2;
		au_fld = -999356671 * var3;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "()Ljava/util/ArrayList;"
	)
	static ArrayList bo() {
		ArrayList var0 = new ArrayList();
		Iterator var1 = av_fld.iterator();

		while (var1.hasNext()) {
			me var2 = (me)(me)var1.next();
			var0.add(var2);
		}

		return var0;
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "()Ljava/util/ArrayList;"
	)
	static ArrayList bp() {
		ArrayList var0 = new ArrayList();
		Iterator var1 = av_fld.iterator();

		while (var1.hasNext()) {
			me var2 = (me)(me)var1.next();
			var0.add(var2);
		}

		return var0;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;IIII)V"
	)
	public static void bt(ArrayList var0, int var1, int var2, int var3, int var4) {
		ay_fld.clear();
		ay_fld.addAll(var0);
		ar_fld = 1328000272 * var1;
		af_fld = var2;
		al_fld = var3;
		au_fld = var4;
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;IIII)V"
	)
	public static void bv(ArrayList var0, int var1, int var2, int var3, int var4) {
		ay_fld.clear();
		ay_fld.addAll(var0);
		ar_fld = 1701687473 * var1;
		af_fld = var2;
		al_fld = var3 * -1619656163;
		au_fld = var4;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Lsp;"
	)
	static sp av(int var0) throws EOFException {
		sp var3 = (sp)ol.bd_fld.ak(var0);
		sp var2;
		if (var3 != null) {
			var2 = var3;
		} else {
			var3 = ld.ak(mc.at_fld, pm.ac_fld, var0);
			if (null != var3) {
				ol.bd_fld.az(var3, var0);
			}

			var2 = var3;
		}

		return var2 != null && var2.av() ? var2 : null;
	}
}
