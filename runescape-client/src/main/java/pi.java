import java.io.EOFException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.runelite.api.MenuEntry;
import net.runelite.api.Skill;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;
import net.runelite.api.events.ClientTick;
import net.runelite.api.events.ItemContainerChanged;
import net.runelite.api.events.StatChanged;

@ObfuscatedName("pi")
public class pi {
	@ObfuscatedName("hp")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/List;"
	)
	public List hp_fld = new ArrayList();
	@ObfuscatedGetter(
		intValue = -1387180737
	)
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int aa_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ag_fld;
	@ObfuscatedGetter(
		intValue = -1264657681
	)
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int az_fld = -1714318321;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] ay_fld;
	@ObfuscatedGetter(
		intValue = -1031606249
	)
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ae_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] ah_fld;
	@ObfuscatedGetter(
		intValue = 808277479
	)
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int au_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ak_fld;
	@ObfuscatedGetter(
		intValue = 1527052941
	)
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int as_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] av_fld = new int[32];
	@ObfuscatedGetter(
		intValue = -637988487
	)
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int af_fld;
	@ObfuscatedGetter(
		intValue = 1236293923
	)
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int al_fld;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] ar_fld;
	@ObfuscatedGetter(
		intValue = 931962767
	)
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ax_fld;
	@ObfuscatedGetter(
		intValue = 726436723
	)
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int an_fld;
	@ObfuscatedGetter(
		intValue = 1964399095
	)
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int aq_fld;
	@ObfuscatedGetter(
		intValue = -182467353
	)
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ai_fld;
	@ObfuscatedGetter(
		intValue = -1587051381
	)
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int aw_fld;
	@ObfuscatedGetter(
		intValue = 2090059267
	)
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int am_fld;
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bk_fld;
	@ObfuscatedName("lu")
	@ObfuscatedSignature(
		descriptor = "Ljava/security/SecureRandom;"
	)
	static SecureRandom lu_fld;

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void ae(int var1) {
		this.zq(var1);
		this.ah_fld[(this.aw_fld += -1005993181) * -1587051381 - 1 & 31] = var1 & 32767;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void az(int var1) {
		this.ar_fld[(this.af_fld += 143591507) * 340556763 - 1 & 31] = var1;
	}

	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void da(int var1) {
		this.av(var1);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ay() {
		this.ax_fld = this.az_fld * 1743281825;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void bl(int var1) {
		this.ar_fld[(this.af_fld += -984957364) * 340556763 - 1 & -2050719769] = var1;
	}

	@ObfuscatedName("sx")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)I"
	)
	public static int sx(pi var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.ae_fld;
	}

	@ObfuscatedName("sq")
	@ObfuscatedSignature(
		descriptor = "(Lpi;B)V"
	)
	public static void sq(pi var0, byte var1) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.al_fld = var0.az_fld;
		}
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void cv() {
		this.ai_fld = this.az_fld;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void br() {
		this.az_fld++;
	}

	@ObfuscatedName("ta")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)I"
	)
	public static int ta(pi var0, int var1) {
		return var0.av_fld[var1 & 31];
	}

	@ObfuscatedName("kt")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V"
	)
	public static void kt(pi var0, int var1) {
		var0.ay_fld[(var0.as_fld += 1497702775) * 1370487579 - 1 & 31] = var1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int aq(int var1) {
		return this.ah_fld[var1 & 31];
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int ad(int var1) {
		return this.ay_fld[var1 & 31];
	}

	@ObfuscatedName("jf")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)I"
	)
	public static int jf(pi var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.aa_fld;
	}

	@ObfuscatedName("mt")
	@ObfuscatedSignature(
		descriptor = "(Lpi;B)V"
	)
	public static void mt(pi var0, byte var1) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.au_fld = var0.az_fld * -87088711;
		}
	}

	@ObfuscatedName("ss")
	@ObfuscatedSignature(
		descriptor = "(Lpi;B)I"
	)
	public static int ss(pi var0, byte var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.au_fld;
	}

	@ObfuscatedName("wp")
	@ObfuscatedSignature(
		descriptor = "(Lpi;)I"
	)
	public static int wp(pi var0) {
		return var0.az_fld;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ao() {
		return this.as_fld;
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ct() {
		return this.as_fld;
	}

	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int dq() {
		return this.ax_fld;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ac() {
		return this.am_fld;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ap() {
		return this.aq_fld;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)I"
	)
	public static int aw(pi var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.av_fld[var1 & 31];
		}
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void bu() {
		this.ax_fld = this.az_fld * 1743281825;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void af() {
		this.ai_fld = this.az_fld;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void ak(int var1) throws EOFException {
		this.az_fld++;
		this.fg();
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void bs(int var1) {
		this.av_fld[(this.ae_fld += -351060946) * 2139819524 - 1 & 31] = var1;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int am() {
		return this.aw_fld;
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int cj(int var1) {
		return this.ay_fld[var1 & 860199001];
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void bf(int var1) {
		this.ay_fld[(this.as_fld += -374843323) * 1527052941 - 1 & 31] = var1;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void bq() {
		this.aa_fld = this.az_fld;
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void by(int var1) {
		this.ah_fld[(this.aw_fld += 1327907509) * 1397281554 - 1 & 31] = var1 & -1652852059;
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void bx() {
		this.al_fld = this.az_fld;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void bo() {
		this.al_fld = 677140730 * this.az_fld;
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void bp() {
		this.al_fld = this.az_fld;
	}

	@ObfuscatedName("wy")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V"
	)
	public static void wy(pi var0, int var1) throws EOFException {
		if (var0 == null) {
			var0.getClass();
		}

		var0.zs(var1);
		var0.ay_fld[(var0.as_fld += -374843323) * 1527052941 - 1 & 31] = var1;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void bt() {
		this.al_fld = this.az_fld;
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void bv() {
		this.au_fld = this.az_fld * -87088711;
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int co(int var1) {
		return this.ah_fld[var1 & 31];
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int cw() {
		return this.az_fld;
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(Lpi;)I"
	)
	public static int ct(pi var0) {
		return var0.ax_fld;
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ba() {
		this.aa_fld = this.az_fld;
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void bg() {
		this.ai_fld = -153247624 * this.az_fld;
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void cd() {
		this.ai_fld = this.az_fld;
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void cc() {
		this.ai_fld = -1841990965 * this.az_fld;
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void cq() {
		this.ai_fld = this.az_fld;
	}

	@ObfuscatedName("zq")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void zq(int var1) {
		var1 &= 32767;
		xz var2 = og.ci_fld.getItemContainers();
		bg var3 = (bg)var2.get(var1);
		bg var4 = (bg)var2.get(var1 | 32768);
		if (var3 != null) {
			ItemContainerChanged var5 = new ItemContainerChanged(var1, var3);
			this.hp_fld.add(var5);
		}

		if (var4 != null) {
			ItemContainerChanged var7 = new ItemContainerChanged(var1 | 32768, var4);
			this.hp_fld.add(var7);
		}
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void bh(int var1) {
		this.av_fld[(this.ae_fld += -129967887) * -1031606249 - 1 & -924579927] = var1;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void av(int var1) {
		this.av_fld[(this.ae_fld += -866564185) * -1031606249 - 1 & 31] = var1;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(Lpi;B)V"
	)
	public static void bf(pi var0, byte var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ae_fld += 32;
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void cx() {
		this.am_fld = -2119846101 * this.az_fld;
	}

	@ObfuscatedName("yt")
	@ObfuscatedSignature(
		descriptor = "(Lpi;)V"
	)
	public static void yt(pi var0) {
		var0.ax_fld = var0.az_fld * 1743281825;
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void cs() {
		this.am_fld = -1100781147 * this.az_fld;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int bz() {
		return this.az_fld;
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ce() {
		this.ae_fld += 32;
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void cn() {
		this.ae_fld += 32;
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void cf() {
		this.aq_fld = this.az_fld * 1104822656;
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void bn() {
		this.ax_fld = this.az_fld * 1743281825;
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int cg() {
		return this.az_fld;
	}

	@ObfuscatedName("ka")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void ka(int var1) throws EOFException {
		wy(this, var1);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ab() {
		return this.al_fld;
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ck() {
		return this.ae_fld;
	}

	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V"
	)
	public static void dk(pi var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.an_fld = var0.az_fld * -349353067;
		}
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int cb() {
		return this.ae_fld;
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int cr() {
		return this.az_fld;
	}

	@ObfuscatedName("wk")
	@ObfuscatedSignature(
		descriptor = "(Lpi;)I"
	)
	public static int wk(pi var0) {
		return var0.ax_fld;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int at() {
		return this.ax_fld;
	}

	@ObfuscatedName("gx")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V"
	)
	public static void gx(pi var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.am_fld = -1100781147 * var0.az_fld;
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int ch(int var1) {
		return this.ay_fld[var1 & 83090661];
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void be() {
		this.az_fld += 1404941250;
	}

	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int dc() {
		return this.al_fld;
	}

	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int dh() {
		return this.au_fld;
	}

	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int dz() {
		return this.au_fld;
	}

	@ObfuscatedName("sv")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)I"
	)
	public static int sv(pi var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.ah_fld[var1 & 31];
	}

	@ObfuscatedName("fg")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void fg() throws EOFException {
		client.zp_void();
		Iterator var1 = this.hp_fld.iterator();

		while (var1.hasNext()) {
			ItemContainerChanged var2 = (ItemContainerChanged)(ItemContainerChanged)var1.next();
			og.ci_fld.getCallbacks().post(var2);
		}

		this.hp_fld.clear();
		og.ci_fld.getCallbacks().post(new ClientTick());
		if (og.ci_fld.getOculusOrbState() != 0) {
			MenuEntry[] var7 = og.ci_fld.getMenuEntries();
			ArrayList var8 = new ArrayList(var7.length);

			for (MenuEntry var6 : var7) {
				switch (rl19.po_fld[var6.getType().ordinal()]) {
					default:
						var8.add(var6);
					case 1:
					case 2:
					case 3:
					case 4:
					case 5:
					case 6:
					case 7:
					case 8:
					case 9:
					case 10:
					case 11:
					case 12:
					case 13:
					case 14:
					case 15:
					case 16:
					case 17:
					case 18:
					case 19:
					case 20:
					case 21:
					case 22:
					case 23:
					case 24:
					case 25:
					case 26:
					case 27:
				}
			}

			og.ci_fld.setMenuEntries((MenuEntry[])(MenuEntry[])var8.toArray(new MenuEntry[0]));
		}

		bw.dk_fld.az_fld.uz();
	}

	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int dt() {
		return this.au_fld;
	}

	public pi() {
		this.ae_fld = 0;
		this.ah_fld = new int[32];
		this.aw_fld = 0;
		this.ay_fld = new int[32];
		this.as_fld = 0;
		this.ar_fld = new int[32];
		this.af_fld = 0;
		this.al_fld = 0;
		this.au_fld = 0;
		this.ax_fld = 0;
		this.an_fld = 0;
		this.aa_fld = 0;
		this.ai_fld = 0;
		this.aq_fld = 0;
		this.am_fld = 0;
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void cp() {
		this.ae_fld += 32;
	}

	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int dd() {
		return this.ax_fld;
	}

	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int dl() {
		return this.an_fld;
	}

	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int dr() {
		return this.an_fld;
	}

	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int da() {
		return this.aa_fld;
	}

	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int dk() {
		return this.ai_fld;
	}

	@ObfuscatedName("yc")
	@ObfuscatedSignature(
		descriptor = "(Lpi;B)I"
	)
	public static int yc(pi var0, byte var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.an_fld;
		}
	}

	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int dx() {
		return this.ai_fld;
	}

	@ObfuscatedName("vr")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V"
	)
	public static void vr(pi var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.aa_fld = var0.az_fld;
	}

	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int du() {
		return this.ai_fld;
	}

	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int db() {
		return this.aq_fld;
	}

	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int dw() {
		return this.aq_fld;
	}

	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int dy() {
		return this.am_fld;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void as(int var1) {
		this.as_fld = this.ax_fld * -349353067;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	public void ah(byte var1) {
		this.au_fld = this.ai_fld * -87088711;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void ag(int var1, int var2) throws EOFException {
		this.ak(var1);
		this.ah_fld[(this.aw_fld = this.an_fld + -374843323) * 1527052941 - 1 & 31] = var1;
	}

	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)I"
	)
	public static int dm(pi var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.av_fld[var1 & 49863495];
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void ar(int var1) {
		this.aa_fld = -1100781147 * this.an_fld;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	public void aw(byte var1) {
		this.am_fld = this.aa_fld * -87088711;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	int an(byte var1) {
		return this.as_fld;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void al(int var1) {
		this.af_fld = this.aa_fld;
	}

	@ObfuscatedName("zs")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void zs(int var1) {
		Skill[] var2 = Skill.values();
		if (var1 >= 0 && var1 < var2.length) {
			int[] var3 = og.ci_fld.getSkillExperiences();
			int[] var4 = og.ci_fld.getBoostedSkillLevels();
			int[] var5 = og.ci_fld.getRealSkillLevels();
			StatChanged var6 = new StatChanged(var2[var1], var3[var1], var5[var1], var4[var1]);
			og.ci_fld.getCallbacks().post(var6);
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void au(int var1) {
		this.av_fld[(this.aa_fld += 1497702775) * 1370487579 - 1 & 31] = var1;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	public void ax(byte var1) {
		this.as_fld = this.an_fld * -87088711;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	int aa(int var1, int var2) {
		return this.ah_fld[var1 & 31];
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	int bd(byte var1) {
		return this.aw_fld;
	}

	@ObfuscatedName("fd")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void fd(int var1) {
		this.ae(var1);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int ai(int var1) {
		return this.au_fld;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int aj(int var1) {
		return this.ax_fld;
	}

	@ObfuscatedName("fd")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)I"
	)
	public static int fd(pi var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.ai_fld;
		}
	}

	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "(Lpi;)I"
	)
	public static int df(pi var0) {
		return var0.au_fld;
	}

	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V"
	)
	public static void dh(pi var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.aq_fld = var0.az_fld * 1110542537;
		}
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int bm(int var1) {
		return this.am_fld;
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int cu(int var1) {
		return this.ar_fld[var1 & 31];
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int cl() {
		return this.as_fld;
	}
}
