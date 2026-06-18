import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("cz")
public class cz {
	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int cj_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lxv;"
	)
	static xv ag_fld = new xv(1024);
	@ObfuscatedName("lg")
	@ObfuscatedSignature(
		descriptor = "Lzz;"
	)
	static zz lg_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int av_fld = 0;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	static String aw_fld;
	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -924828279
	)
	static int jt_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/Map;"
	)
	static Map ak_fld = new HashMap();
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lnj;"
	)
	static nj az_fld = new nj();

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	static int al() {
		return (av_fld += -1373160227) * 916942728 - 1;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	static int br(int var0) {
		co var1 = (co)ag_fld.ak(var0);
		if (var1 == null) {
			return -1;
		} else {
			return az_fld.ak_fld == var1.ft_fld ? -1 : ((co)var1.ft_fld).ak_fld * 1492045231;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	static int au() {
		return (av_fld += -1373160227) * 846166901 - 1;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	static int ax() {
		return (av_fld += -1373160227) * 846166901 - 1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	static int ap(int var0) {
		bq var1 = (bq)(bq)ak_fld.get(var0);
		return var1 == null ? 0 : var1.az(1843875182);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;)V"
	)
	static void aa(int var0, String var1, String var2) {
		ro.az(var0, var1, var2, null);
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	static void bz() {
		Iterator var0 = ag_fld.iterator();

		while (var0.hasNext()) {
			co var1 = (co)(co)var0.next();
			var1.ae(-959234730);
		}
	}

	cz() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	static int at(int var0) {
		bq var1 = (bq)(bq)ak_fld.get(var0);
		return var1 == null ? 0 : var1.az(1620806196);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)Lco;"
	)
	static co ad(int var0, int var1) {
		bq var2 = (bq)(bq)ak_fld.get(var0);
		return bq.oj(var2, var1);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Lco;"
	)
	static co ao(int var0) {
		return (co)(co)ag_fld.ak(var0);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	static int ab(int var0) {
		bq var1 = (bq)(bq)ak_fld.get(var0);
		return var1 == null ? 0 : var1.az(1829630159);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;)V"
	)
	static void an(int var0, String var1, String var2) {
		ro.az(var0, var1, var2, null);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V"
	)
	static void ai(int var0, String var1, String var2, String var3) {
		bq var4 = (bq)(bq)ak_fld.get(var0);
		if (null == var4) {
			var4 = new bq();
			ak_fld.put(var0, var4);
		}

		co var5 = bq.hw(var4, var0, var1, var2, var3);
		ag_fld.ag(var5, var5.ak_fld);
		az_fld.jr(var5);
		pi.ac(client.ck_fld, 1432304497);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	static void ac() {
		Iterator var0 = ag_fld.iterator();

		while (var0.hasNext()) {
			co var1 = (co)(co)var0.next();
			var1.ag(-114594914);
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public static void ak() {
		ou.ak_fld.av();
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	static void bm() {
		Iterator var0 = ag_fld.iterator();

		while (var0.hasNext()) {
			co var1 = (co)(co)var0.next();
			var1.ae(-1946682931);
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	static void bd() {
		Iterator var0 = ag_fld.iterator();

		while (var0.hasNext()) {
			co var1 = (co)(co)var0.next();
			var1.ae(-1503856818);
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V"
	)
	static void am(int var0, String var1, String var2, String var3) {
		bq var4 = (bq)(bq)ak_fld.get(var0);
		if (null == var4) {
			var4 = new bq();
			ak_fld.put(var0, var4);
		}

		co var5 = bq.hw(var4, var0, var1, var2, var3);
		ag_fld.ag(var5, var5.ak_fld);
		az_fld.jr(var5);
		pi.ac(client.ck_fld, -802964037);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	static void aj() {
		Iterator var0 = ag_fld.iterator();

		while (var0.hasNext()) {
			co var1 = (co)(co)var0.next();
			var1.ag(-114594914);
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	static int be(int var0) {
		co var1 = (co)ag_fld.ak(var0);
		if (var1 == null) {
			return -1;
		} else {
			return az_fld.ak_fld == var1.ft_fld ? -1 : ((co)var1.ft_fld).ak_fld * 1492045231;
		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	static int bs(int var0) {
		co var1 = (co)ag_fld.ak(var0);
		if (var1 == null) {
			return -1;
		} else {
			return az_fld.ak_fld == var1.ft_fld ? -1 : ((co)var1.ft_fld).ak_fld * 1492045231;
		}
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	static int bh(int var0) {
		co var1 = (co)ag_fld.ak(var0);
		if (var1 == null) {
			return -1;
		} else {
			return az_fld.ak_fld == var1.ft_fld ? -1 : ((co)var1.ft_fld).ak_fld * -2135775475;
		}
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	static int bk(int var0) {
		co var1 = (co)ag_fld.ak(var0);
		if (null == var1) {
			return -1;
		} else {
			return az_fld.ak_fld == var1.fn_vc ? -1 : ((co)var1.fn_vc).ak_fld * 1492045231;
		}
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	static String bj() {
		StringBuilder var0 = new StringBuilder();
		Iterator var1 = ag_fld.iterator();

		while (var1.hasNext()) {
			co var2 = (co)(co)var1.next();
			if (null != var2.av_fld && !var2.av_fld.isEmpty()) {
				var0.append(var2.av_fld).append((char)376523910);
			}

			var0.append(var2.aw_fld).append('\n');
		}

		return var0.toString();
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	static String bf() {
		StringBuilder var0 = new StringBuilder();
		Iterator var1 = ag_fld.iterator();

		while (var1.hasNext()) {
			co var2 = (co)(co)var1.next();
			if (null != var2.av_fld && !var2.av_fld.isEmpty()) {
				var0.append(var2.av_fld).append(':');
			}

			var0.append(var2.aw_fld).append('\n');
		}

		return var0.toString();
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V"
	)
	static void aq(int var0, String var1, String var2, String var3) {
		bq var4 = (bq)(bq)ak_fld.get(var0);
		if (null == var4) {
			var4 = new bq();
			ak_fld.put(var0, var4);
		}

		co var5 = bq.hw(var4, var0, var1, var2, var3);
		ag_fld.ag(var5, var5.ak_fld);
		az_fld.jr(var5);
		pi.ac(client.ck_fld, 1217960286);
	}
}
