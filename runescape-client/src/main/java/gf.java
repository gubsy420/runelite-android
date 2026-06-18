import java.io.EOFException;
import java.util.Iterator;
import java.util.LinkedList;
import net.runelite.api.WorldMapData;
import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("gf")
@Implements({"WorldMapData"})
public class gf implements WorldMapData {
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 846613025
	)
	int ae_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	kj aw_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	String ag_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1283733337
	)
	int av_fld = 1318936343;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -439483719
	)
	int ah_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1993622311
	)
	int ak_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	String az_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lhf;"
	)
	hf ay_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean as_fld;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/LinkedList;"
	)
	LinkedList ar_fld;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ax_fld;

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	public boolean bh(int var1, int var2) {
		int var3 = var1 / 64;
		int var4 = var2 / 64;
		if (var3 >= this.ay_fld.ak_fld * 2115450829 && var3 <= -1291504879 * this.ay_fld.ag_fld) {
			if (var4 >= this.ay_fld.az_fld * -1683164347 && var4 <= -1936218911 * this.ay_fld.av_fld) {
				Iterator var5 = this.ar_fld.iterator();

				while (var5.hasNext()) {
					hj var6 = (hj)(hj)var5.next();
					if (var6.az(var1, var2, (byte)17)) {
						return true;
					}
				}

				return false;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int cr() {
		return this.ay_fld.av_fld * -1936218911;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)Lhj;"
	)
	hj ag(xi var1, int var2) {
		int var3 = var1.cg();
		hk var4 = (hk)ka.ak(hk.ak(), var3);
		Object var5 = null;
		switch (var4.ae_fld) {
			case 0:
				var5 = new hq();
				break;
			case 1:
				var5 = new gq();
				break;
			case 2:
				var5 = new hd();
				break;
			case 3:
				var5 = new gz();
				break;
			default:
				throw new IllegalStateException("");
		}

		((hj)var5).ah(var1, -192199371);
		return (hj)var5;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(III)Z"
	)
	public boolean av(int var1, int var2, int var3) {
		int var4 = var1 / 64;
		int var5 = var2 / 64;
		if (var4 >= this.ay_fld.ak_fld * 2115450829 && var4 <= -1291504879 * this.ay_fld.ag_fld) {
			if (var5 >= this.ay_fld.az_fld * -1683164347 && var5 <= -1936218911 * this.ay_fld.av_fld) {
				Iterator var6 = this.ar_fld.iterator();

				while (var6.hasNext()) {
					hj var7 = (hj)(hj)var6.next();
					if (var7.az(var1, var2, (byte)28)) {
						return true;
					}
				}

				return false;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int bg() {
		return this.ah_fld;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void aw(int var1) {
		Iterator var2 = this.ar_fld.iterator();

		while (var2.hasNext()) {
			hj var3 = (hj)(hj)var2.next();
			var3.ak(this.ay_fld, (byte)20);
		}
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int cx() {
		return this.av_fld;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)Lhj;"
	)
	hj aj(xi var1) {
		int var2 = var1.cg();
		hk var3 = (hk)ka.ak(hk.ak(), var2);
		Object var4 = null;
		switch (var3.ae_fld) {
			case 0:
				var4 = new hq();
				break;
			case 1:
				var4 = new gq();
				break;
			case 2:
				var4 = new hd();
				break;
			case 3:
				var4 = new gz();
				break;
			default:
				throw new IllegalStateException("");
		}

		((hj)var4).ah(var1, 1525667147);
		return (hj)var4;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	int al(byte var1) {
		return this.ae_fld;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(S)I"
	)
	int au(short var1) {
		return this.ah_fld;
	}

	@ObfuscatedName("tz")
	@ObfuscatedSignature(
		descriptor = "(Lgf;I)Z"
	)
	public static boolean tz(gf var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.as_fld;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int ao(int var1) {
		return this.aw_fld.ag_fld * 1479124089;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int an(int var1) {
		return 2115450829 * this.ay_fld.ak_fld;
	}

	@ObfuscatedName("fs")
	@ObfuscatedSignature(
		descriptor = "(Lgf;)I"
	)
	public static int fs(gf var0) {
		return var0.ae_fld;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int aa(int var1) {
		return -1291504879 * this.ay_fld.ag_fld;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int ai(int var1) {
		return this.ay_fld.az_fld * -1683164347;
	}

	@ObfuscatedName("nh")
	@ObfuscatedSignature(
		descriptor = "(Lgf;Lxi;I)V"
	)
	public static void nh(gf var0, xi var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.av_fld = -263408965 * var2;
			var0.ag_fld = xi.at(var1, 1777688835);
			var0.az_fld = xi.at(var1, -1478947477);
			var0.aw_fld = new kj(var1.co((byte)-100));
			var0.ae_fld = var1.co((byte)-94);
			var0.ah_fld = var1.co((byte)-60);
			var1.cg();
			var0.as_fld = var1.cg() == 1;
			var0.ak_fld = var1.cg() * -1654446049;
			int var3 = var1.cg();
			var0.ar_fld = new LinkedList();

			for (int var4 = 0; var4 < var3; var4++) {
				var0.ar_fld.add(var0.ag(var1, -2147483643));
			}

			var0.aw(-349542504);
		}
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean bi() {
		return this.as_fld;
	}

	@ObfuscatedName("yo")
	@ObfuscatedSignature(
		descriptor = "(Lgf;I)I"
	)
	public static int yo(gf var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.ay_fld.av_fld * -1936218911;
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int am(int var1) {
		return this.aw_fld.ak_fld * -621797759;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int ad(int var1) {
		return this.aw_fld.az_fld * 1846813669;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I"
	)
	public int[] ae(int var1, int var2, int var3, int var4) {
		Iterator var5 = this.ar_fld.iterator();

		while (var5.hasNext()) {
			hj var6 = (hj)(hj)var5.next();
			if (var6.ag(var1, var2, var3, -1691117683)) {
				return var6.av(var1, var2, var3, -145367476);
			}
		}

		return null;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)Lhj;"
	)
	hj ac(xi var1) {
		int var2 = var1.cg();
		hk var3 = (hk)ka.ak(hk.ak(), var2);
		Object var4 = null;
		switch (var3.ae_fld) {
			case 0:
				var4 = new hq();
				break;
			case 1:
				var4 = new gq();
				break;
			case 2:
				var4 = new hd();
				break;
			case 3:
				var4 = new gz();
				break;
			default:
				throw new IllegalStateException("");
		}

		((hj)var4).ah(var1, -240781883);
		return (hj)var4;
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ck() {
		return this.aw_fld.ag_fld * 663776266;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(III)Z"
	)
	public boolean bd(int var1, int var2, int var3) {
		Iterator var4 = this.ar_fld.iterator();

		while (var4.hasNext()) {
			hj var5 = (hj)(hj)var4.next();
			if (var5.ag(var1, var2, var3, -2090704198)) {
				return true;
			}
		}

		return false;
	}

	public gf() {
		this.ae_fld = -1368898017;
		this.ah_fld = 1996488704;
		this.ak_fld = -1157694313;
		this.aw_fld = null;
		this.ay_fld = new hf();
		this.as_fld = false;
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(III)Z"
	)
	public boolean be(int var1, int var2, int var3) {
		Iterator var4 = this.ar_fld.iterator();

		while (var4.hasNext()) {
			hj var5 = (hj)(hj)var4.next();
			if (var5.ag(var1, var2, var3, -945864525)) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int bp() {
		return this.aw_fld.ag_fld * 1479124089;
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	public boolean bk(int var1, int var2) {
		int var3 = var1 / 576313842;
		int var4 = var2 / 64;
		if (var3 >= this.ay_fld.ak_fld * 2115450829 && var3 <= -1358262381 * this.ay_fld.ag_fld) {
			if (var4 >= this.ay_fld.az_fld * 676133355 && var4 <= -1848960034 * this.ay_fld.av_fld) {
				Iterator var5 = this.ar_fld.iterator();

				while (var5.hasNext()) {
					hj var6 = (hj)(hj)var5.next();
					if (var6.az(var1, var2, (byte)106)) {
						return true;
					}
				}

				return false;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	public boolean bs(int var1, int var2) {
		int var3 = var1 / -1775020876;
		int var4 = var2 / 780589273;
		if (var3 >= this.ay_fld.ak_fld * 2115450829 && var3 <= 1672199660 * this.ay_fld.ag_fld) {
			if (var4 >= this.ay_fld.az_fld * -1683164347 && var4 <= -1936218911 * this.ay_fld.av_fld) {
				Iterator var5 = this.ar_fld.iterator();

				while (var5.hasNext()) {
					hj var6 = (hj)(hj)var5.next();
					if (var6.az(var1, var2, (byte)71)) {
						return true;
					}
				}

				return false;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)Lpy;"
	)
	public static py ak(int var0) throws EOFException {
		try {
			py var2 = (py)py.as_fld.ak(var0);
			if (var2 != null) {
				return var2;
			} else {
				byte[] var3 = ex.ah_fld.bb(32, var0, 584982574);
				var2 = new py();
				if (var3 != null) {
					var2.ag(new xi(var3));
				}

				py.as_fld.az(var2, var0);
				return var2;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(III)[I"
	)
	public int[] bf(int var1, int var2, int var3) {
		Iterator var4 = this.ar_fld.iterator();

		while (var4.hasNext()) {
			hj var5 = (hj)(hj)var4.next();
			if (var5.ag(var1, var2, var3, -1009607600)) {
				return var5.av(var1, var2, var3, -145367476);
			}
		}

		return null;
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(III)[I"
	)
	public int[] by(int var1, int var2, int var3) {
		Iterator var4 = this.ar_fld.iterator();

		while (var4.hasNext()) {
			hj var5 = (hj)(hj)var4.next();
			if (var5.ag(var1, var2, var3, -982210259)) {
				return var5.av(var1, var2, var3, -145367476);
			}
		}

		return null;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(III)[I"
	)
	public int[] bl(int var1, int var2, int var3) {
		Iterator var4 = this.ar_fld.iterator();

		while (var4.hasNext()) {
			hj var5 = (hj)(hj)var4.next();
			if (var5.ag(var1, var2, var3, -1576548164)) {
				return var5.av(var1, var2, var3, -145367476);
			}
		}

		return null;
	}

	@ObfuscatedName("wn")
	@ObfuscatedSignature(
		descriptor = "(Lgf;)I"
	)
	public static int wn(gf var0) {
		return -1291504879 * var0.ay_fld.ag_fld;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bo() {
		Iterator var1 = this.ar_fld.iterator();

		while (var1.hasNext()) {
			hj var2 = (hj)(hj)var1.next();
			var2.ak(this.ay_fld, (byte)-8);
		}
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int cm() {
		return this.av_fld;
	}

	@ObfuscatedName("surfaceContainsPosition")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	@Export("surfaceContainsPosition")
	@Override
	public boolean surfaceContainsPosition(int var1, int var2) {
		return this.av(var1, var2, -475100430);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Lkj;"
	)
	public kj ab(int var1) {
		return new kj(this.aw_fld);
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(Lgf;)I"
	)
	public static int cv(gf var0) {
		return var0.aw_fld.ag_fld * 1479124089;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(III)Z"
	)
	public boolean br(int var1, int var2, int var3) {
		Iterator var4 = this.ar_fld.iterator();

		while (var4.hasNext()) {
			hj var5 = (hj)(hj)var4.next();
			if (var5.ag(var1, var2, var3, -638655040)) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String bu() {
		return this.ag_fld;
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String bn() {
		return this.ag_fld;
	}

	@ObfuscatedName("zm")
	@ObfuscatedSignature(
		descriptor = "(Lgf;)I"
	)
	public static int zm(gf var0) {
		return var0.ay_fld.az_fld * -1683164347;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(III)[I"
	)
	public int[] bj(int var1, int var2, int var3) {
		Iterator var4 = this.ar_fld.iterator();

		while (var4.hasNext()) {
			hj var5 = (hj)(hj)var4.next();
			if (var5.ag(var1, var2, var3, -927240510)) {
				return var5.av(var1, var2, var3, -145367476);
			}
		}

		return null;
	}

	@ObfuscatedName("uv")
	@ObfuscatedSignature(
		descriptor = "(Lgf;B)Ljava/lang/String;"
	)
	public static String uv(gf var0, byte var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.az_fld;
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String bw() {
		return this.az_fld;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;"
	)
	public String ar(int var1) {
		return this.ag_fld;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lxi;IB)V"
	)
	public void ak(xi var1, int var2, byte var3) {
		this.av_fld = var2;
		this.ag_fld = xi.at(var1, -480270614);
		this.az_fld = xi.at(var1, -73631933);
		this.aw_fld = new kj(var1.co((byte)-84));
		this.ae_fld = var1.co((byte)-76);
		this.ah_fld = var1.co((byte)-112);
		var1.cg();
		this.as_fld = var1.cg() == 1;
		this.ak_fld = var1.cg();
		int var4 = var1.cg();
		this.ar_fld = new LinkedList();

		for (int var5 = 0; var5 < var4; var5++) {
			this.ar_fld.add(this.ag(var1, -2147483643));
		}

		this.aw(-1429540907);
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int bt() {
		return this.ak_fld;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lkj;"
	)
	public kj ah(int var1, int var2, byte var3) {
		Iterator var4 = this.ar_fld.iterator();

		while (var4.hasNext()) {
			hj var5 = (hj)(hj)var4.next();
			if (var5.az(var1, var2, (byte)20)) {
				return var5.ae(var1, var2, (byte)-72);
			}
		}

		return null;
	}

	@ObfuscatedName("lw")
	@ObfuscatedSignature(
		descriptor = "(Lgf;III)[I"
	)
	public static int[] lw(gf var0, int var1, int var2, int var3) {
		Iterator var4 = var0.ar_fld.iterator();

		while (var4.hasNext()) {
			hj var5 = (hj)(hj)var4.next();
			if (var5.ag(var1, var2, var3, -1501648118)) {
				return var5.av(var1, var2, var3, -145367476);
			}
		}

		return null;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lgf;)Lkj;"
	)
	public static kj aj(gf var0) {
		return new kj(var0.aw_fld);
	}

	@ObfuscatedName("yx")
	@ObfuscatedSignature(
		descriptor = "(Lgf;III)Z"
	)
	public static boolean yx(gf var0, int var1, int var2, int var3) {
		Iterator var4 = var0.ar_fld.iterator();

		while (var4.hasNext()) {
			hj var5 = (hj)(hj)var4.next();
			if (var5.ag(var1, var2, var3, -458175650)) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int cg() {
		return this.ay_fld.az_fld * -1683164347;
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int cd() {
		return this.ay_fld.av_fld * -1936218911;
	}

	@ObfuscatedName("fv")
	@ObfuscatedSignature(
		descriptor = "(Lgf;IIIB)Z"
	)
	public static boolean fv(gf var0, int var1, int var2, int var3, byte var4) {
		if (var0 == null) {
			var0.getClass();
		}

		Iterator var5 = var0.ar_fld.iterator();

		while (var5.hasNext()) {
			hj var6 = (hj)(hj)var5.next();
			if (var6.ag(var1, var2, var3, -1073038410)) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean bv() {
		return this.as_fld;
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int cw() {
		return this.aw_fld.ak_fld * -621797759;
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int cn() {
		return this.aw_fld.az_fld * 1846813669;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int ax(int var1) {
		return this.ak_fld;
	}

	@ObfuscatedName("uc")
	@ObfuscatedSignature(
		descriptor = "(Lgf;Lxi;I)V"
	)
	public static void uc(gf var0, xi var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.av_fld = 1598688653 * var2;
		var0.ag_fld = xi.at(var1, 1887061781);
		var0.az_fld = xi.at(var1, -1350400504);
		var0.aw_fld = new kj(var1.co((byte)-83));
		var0.ae_fld = var1.co((byte)-62);
		var0.ah_fld = var1.co((byte)-62) * -2020234737;
		var1.cg();
		var0.as_fld = var1.cg() == 1;
		var0.ak_fld = var1.cg() * 1653916963;
		int var3 = var1.cg();
		var0.ar_fld = new LinkedList();

		for (int var4 = 0; var4 < var3; var4++) {
			var0.ar_fld.add(var0.ag(var1, -2147483643));
		}

		var0.aw(-307188697);
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int cp() {
		return this.aw_fld.ag_fld * 1479124089;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int ay(int var1) {
		return this.av_fld;
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "()Lkj;"
	)
	public kj co() {
		return new kj(this.aw_fld);
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)Lhj;"
	)
	hj bm(xi var1) {
		int var2 = var1.cg();
		hk var3 = (hk)ka.ak(hk.ak(), var2);
		Object var4 = null;
		switch (var3.ae_fld) {
			case 0:
				var4 = new hq();
				break;
			case 1:
				var4 = new gq();
				break;
			case 2:
				var4 = new hd();
				break;
			case 3:
				var4 = new gz();
				break;
			default:
				throw new IllegalStateException("");
		}

		((hj)var4).ah(var1, 451463650);
		return (hj)var4;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Z"
	)
	public boolean az(int var1, int var2, int var3, byte var4) {
		Iterator var5 = this.ar_fld.iterator();

		while (var5.hasNext()) {
			hj var6 = (hj)(hj)var5.next();
			if (var6.ag(var1, var2, var3, -1073038410)) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean as(int var1) {
		return this.as_fld;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;"
	)
	public String af(byte var1) {
		return this.az_fld;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	public void at(xi var1, int var2) {
		this.ah_fld = -263408965 * var2;
		this.ag_fld = xi.at(var1, 1777688835);
		this.ag_fld = xi.at(var1, -1478947477);
		this.aw_fld = new kj(var1.em());
		this.ah_fld = var1.cg() * 1368898017;
		this.av_fld = var1.cg() * 969630601;
		var1.ex();
		this.as_fld = var1.dz() == 1;
		this.av_fld = var1.em() * -1654446049;
		int var3 = var1.dz();
		this.ar_fld = new LinkedList();

		for (int var4 = 0; var4 < var3; var4++) {
			this.ar_fld.add(this.ag(var1, -2147483643));
		}

		this.aw(-349542504);
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int cs() {
		return this.ay_fld.ak_fld * -1683164347;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int aq(int var1) {
		return this.aw_fld.ak_fld * -621797759;
	}
}
