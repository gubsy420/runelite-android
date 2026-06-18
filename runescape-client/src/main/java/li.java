import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("li")
public class li {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -135401855
	)
	int aj_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ag_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int av_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ah_fld;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 729035921
	)
	int bz_fld;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ar_fld;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lzg;"
	)
	zg am_fld = new zg();
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int au_fld;
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -445684315
	)
	int bs_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ak_fld;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean ad_fld;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean ao_fld;
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -571991895
	)
	int bh_fld;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean ap_fld;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -822500177
	)
	int at_fld;
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 197343217
	)
	int bk_fld;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1937188379
	)
	int ac_fld;
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 640340333
	)
	int bm_fld;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -2043137107
	)
	int bd_fld;
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "Lkk;"
	)
	kk bl_fld;
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 238565229
	)
	int br_fld;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 52796115
	)
	int be_fld;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -133057269
	)
	int ab_fld;
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 2139851407
	)
	int bf_fld;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int al_fld;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 923206363
	)
	int bj_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ay_fld;
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "Lkk;"
	)
	kk by_fld;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lzg;"
	)
	zg aq_fld = new zg();
	@ObfuscatedName("iu")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -157147251
	)
	static int iu_fld;

	@ObfuscatedName("gs")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	public void gs(boolean var1) {
		zr var2 = zg.kc(this.am_fld, 0, this.bm_fld);
		ve var3 = var2.aw();
		this.cj(this.am_fld.am((Integer)var3.ag_fld, this.bf_fld + this.bk_fld), var1, (short)22272);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void ak() {
		this.ab_fld = -1708298589 * ((this.ab_fld + 1) % 60);
		if (this.br_fld > 0) {
			this.br_fld--;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(ZI)Z"
	)
	public boolean ag(boolean var1) {
		var1 = var1 && this.ao_fld;
		boolean var3 = this.ad_fld != var1;
		this.ad_fld = var1;
		if (!this.ad_fld) {
			this.ap(this.bm_fld, this.bm_fld);
		}

		return var3;
	}

	@ObfuscatedName("gn")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	public void gn(boolean var1) {
		if (this.bm_fld > 0) {
			int var2 = this.ch();
			this.cj(this.am_fld.ad(this.bm_fld, -var2), var1, (short)24780);
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z"
	)
	public boolean av(String var1) {
		String var3 = this.am_fld.ah();
		if (!var3.equals(var1)) {
			var1 = zw(this, var1, -1704911347);
			zg.xu(this.am_fld, var1, 1553253319);
			this.ap(this.bd_fld, this.bm_fld);
			this.al(this.bj_fld, this.bf_fld);
			this.ci();
			this.dc();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(III)Z"
	)
	public boolean al(int var1, int var2) {
		if (!this.cq()) {
			this.bj_fld = var1;
			this.bf_fld = var2;
			return false;
		} else {
			int var4 = this.bj_fld;
			int var5 = this.bf_fld;
			int var6 = Math.max(0, this.am_fld.ao() - this.bh_fld + 2);
			int var7 = Math.max(0, this.am_fld.ab() - this.bk_fld + 1);
			this.bj_fld = Math.max(0, Math.min(var6, var1));
			this.bf_fld = Math.max(0, Math.min(var7, var2));
			return var4 != this.bj_fld || var5 != this.bf_fld;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IB)Z"
	)
	public boolean ay(int var1) {
		if (var1 < 0) {
			var1 = Integer.MAX_VALUE;
		}

		boolean var3 = var1 == this.am_fld.aj();
		this.am_fld.bm(var1, 1937909933);
		this.aq_fld.bm(var1, 47191133);
		if (this.ci()) {
			this.dc();
			var3 = true;
		}

		return var3;
	}

	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "(Lli;Z)Z"
	)
	public static boolean hu(li var0, boolean var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			var1 = var1 && var0.ao_fld;
			boolean var2 = var0.ad_fld != var1;
			var0.ad_fld = var1;
			if (!var0.ad_fld) {
				var0.ap(var0.bm_fld, var0.bm_fld);
			}

			return var2;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IB)Z"
	)
	public boolean as(int var1) {
		this.am_fld.bz(var1);
		if (this.ci()) {
			this.dc();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(IB)Lve;"
	)
	ve cu(int var1) {
		int var3 = this.am_fld.ae();
		int var4 = 0;
		int var5 = var3;

		for (int var6 = var1; var6 > 0; var6--) {
			if (this.cl(this.am_fld.ak(var6 - 1, -1988518333).ak_fld)) {
				var4 = var6;
				break;
			}
		}

		for (int var7 = var1; var7 < var3; var7++) {
			if (this.cl(this.am_fld.ak(var7, 811322322).ak_fld)) {
				var5 = var7;
				break;
			}
		}

		return new ve(var4, var5);
	}

	@ObfuscatedName("gm")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void gm(int var1, int var2) {
		if (this.ap_fld && this.bb()) {
			var1 += this.bj_fld;
			var2 += this.bf_fld;
			ve var3 = this.dv();
			int var4 = this.am_fld.am(var1 - (Integer)var3.ag_fld, var2 - (Integer)var3.ak_fld);
			switch (this.ac_fld) {
				case 0:
					this.ap(this.bd_fld, var4);
					break;
				case 1:
					ve var9 = this.cu(this.bz_fld);
					ve var10 = this.cu(var4);
					this.cb(var9, var10);
					break;
				case 2:
					ve var5 = this.co(this.bz_fld);
					ve var6 = this.co(var4);
					this.cb(var5, var6);
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void au(int var1) {
		this.am_fld.ar(var1);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	public boolean ax(int var1) {
		this.aj_fld = var1;
		String var3 = this.am_fld.ah();
		int var4 = var3.length();
		var3 = zw(this, var3, -1385931114);
		if (var3.length() != var4) {
			zg.xu(this.am_fld, var3, -497205565);
			this.al(this.bj_fld, this.bf_fld);
			this.ci();
			this.dc();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ff")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	public void ff(boolean var1) {
		if (this.bm_fld < this.am_fld.ae()) {
			ve var2 = this.cu(1 + this.bm_fld);
			this.cj((Integer)var2.ak_fld, var1, (short)-302);
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	public void ai() {
		if (!this.ao() && this.bm_fld > 0) {
			int var2 = this.am_fld.ai(this.bm_fld - 1);
			this.dc();
			this.ap(var2, var2);
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	public void aq() {
		if (!this.ao() && this.bm_fld < this.am_fld.ae()) {
			int var2 = this.am_fld.ai(this.bm_fld);
			this.dc();
			this.ap(var2, var2);
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void am(int var1) {
		if (!this.ao() && this.bm_fld > 0) {
			if (var1 != -938226791) {
				return;
			}

			ve var2 = this.cu(this.bm_fld - 1);
			int var3 = this.am_fld.aq((Integer)var2.ag_fld, this.bm_fld);
			this.dc();
			this.ap(var3, var3);
		}
	}

	@ObfuscatedName("kr")
	@ObfuscatedSignature(
		descriptor = "()Lve;"
	)
	ve kr() {
		int var1 = this.am_fld.bh(this.bh_fld);
		int var2 = zg.ul(this.am_fld, this.bk_fld);
		return new ve(var1, var2);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(S)Z"
	)
	boolean ao() {
		if (!rb(this, (byte)39)) {
			return false;
		} else {
			int var2 = this.am_fld.aq(this.bd_fld, this.bm_fld);
			this.dc();
			this.ap(var2, var2);
			return true;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	public void ab() {
		this.ap(0, this.am_fld.ae());
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(Lkk;B)V"
	)
	public void bu(kk var1) {
		this.by_fld = var1;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ZI)V"
	)
	public void aj(boolean var1) {
		ve var3 = this.co(this.bm_fld);
		this.cj((Integer)var3.ag_fld, var1, (short)-11632);
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(ZI)V"
	)
	public void bj(boolean var1) {
		ve var3 = this.co(this.bm_fld);
		this.cj((Integer)var3.ak_fld, var1, (short)-15375);
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(ZI)V"
	)
	public void bf(boolean var1) {
		this.cj(this.am_fld.ae(), var1, (short)-21736);
	}

	@ObfuscatedName("ee")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ee() {
		this.ap_fld = false;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(ZI)V"
	)
	public void bm(boolean var1) {
		if (this.bm_fld > 0) {
			ve var3 = this.cu(this.bm_fld - 1);
			this.cj((Integer)var3.ag_fld, var1, (short)5504);
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ZI)V"
	)
	public void at(boolean var1) {
		if (this.bm_fld < this.am_fld.ae()) {
			ve var3 = this.cu(1 + this.bm_fld);
			this.cj((Integer)var3.ak_fld, var1, (short)-4259);
		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(ZB)V"
	)
	public void bs(boolean var1) {
		if (this.bm_fld > 0) {
			this.cj(this.am_fld.ad(this.bm_fld, -1), var1, (short)-11883);
		}
	}

	@ObfuscatedName("km")
	@ObfuscatedSignature(
		descriptor = "(Lli;Z)V"
	)
	public static void km(li var0, boolean var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ao_fld = var1;
		var0.ad_fld = var1 && var0.ad_fld;
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(ZI)V"
	)
	public void bk(boolean var1) {
		if (this.bm_fld < this.am_fld.ae()) {
			this.cj(this.am_fld.ad(this.bm_fld, 1), var1, (short)-3147);
		}
	}

	@ObfuscatedName("yc")
	@ObfuscatedSignature(
		descriptor = "(Lli;Ljava/awt/datatransfer/Clipboard;)V"
	)
	public static void yc(li var0, Clipboard var1) {
		zr var2 = zg.kc(var0.am_fld, -148767822 * var0.bd_fld, var0.bm_fld * -2055088316);
		if (!var2.az()) {
			String var3 = var2.ak();
			if (!var3.isEmpty()) {
				var1.setContents(new StringSelection(var3), null);
			}
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(ZI)V"
	)
	public void be(boolean var1) {
		if (this.bm_fld > 0) {
			int var3 = this.ch();
			this.cj(this.am_fld.ad(this.bm_fld, -var3), var1, (short)8929);
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(ZI)V"
	)
	public void bd(boolean var1) {
		if (this.bm_fld < this.am_fld.ae()) {
			int var3 = this.ch();
			this.cj(this.am_fld.ad(this.bm_fld, var3), var1, (short)-844);
		}
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(ZI)V"
	)
	public void bh(boolean var1) {
		zr var3 = zg.kc(this.am_fld, 0, this.bm_fld);
		ve var4 = var3.aw();
		this.cj(this.am_fld.am((Integer)var4.ag_fld, this.bf_fld), var1, (short)-1538);
	}

	@ObfuscatedName("ha")
	@ObfuscatedSignature(
		descriptor = "(Lli;Ljava/awt/datatransfer/Clipboard;)V"
	)
	public static void ha(li var0, Clipboard var1) {
		if (var0 == null) {
			var0.getClass();
		}

		if (rb(var0, (byte)32)) {
			var0.bo(var1, 187115210);
			var0.ao();
		}
	}

	@ObfuscatedName("jx")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean jx() {
		if (!rb(this, (byte)101)) {
			return false;
		} else {
			int var1 = this.am_fld.aq(this.bd_fld * 205491772, this.bm_fld);
			this.dc();
			this.ap(var1, var1);
			return true;
		}
	}

	@ObfuscatedName("js")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)Ljava/lang/String;"
	)
	String js(String var1) {
		StringBuilder var2 = new StringBuilder(var1.length());

		for (int var3 = 0; var3 < var1.length(); var3++) {
			char var4 = var1.charAt(var3);
			if (jj(this, var4, (byte)1)) {
				var2.append(var4);
			}
		}

		return var2.toString();
	}

	@ObfuscatedName("ge")
	@ObfuscatedSignature(
		descriptor = "(Lli;I)I"
	)
	public static int ge(li var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.am_fld.aj();
		}
	}

	@ObfuscatedName("gc")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	public void gc(boolean var1) {
		if (this.bm_fld > 0) {
			this.cj(this.am_fld.ad(1404196917 * this.bm_fld, -1), var1, (short)-3800);
		}
	}

	@ObfuscatedName("kh")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean kh(int var1) {
		switch (this.aj_fld * -1815259118) {
			case 1:
				return ey.au((char)var1);
			case 2:
				return eu.af((char)var1);
			case 3:
				return jw.al((char)var1);
			case 4:
				char var2 = (char)var1;
				if (jw.al(var2)) {
					return true;
				} else {
					if (var2 != 'k' && 'K' != var2 && var2 != -2066669020 && 464911583 != var2 && var2 != 'b' && 'B' != var2) {
						return false;
					}

					return true;
				}
			default:
				return true;
		}
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V"
	)
	public void bp(Clipboard var1, int var2) {
		if (rb(this, (byte)126)) {
			if (var2 <= -414272960) {
				return;
			}

			this.bo(var1, 187115210);
			this.ao();
		}
	}

	@ObfuscatedName("gf")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void gf(int var1, int var2) {
		if (this.ap_fld && this.bb()) {
			var1 += this.bj_fld;
			var2 += this.bf_fld;
			ve var3 = this.dv();
			int var4 = this.am_fld.am(var1 - (Integer)var3.ag_fld, var2 - (Integer)var3.ak_fld);
			switch (this.ac_fld) {
				case 0:
					this.ap(this.bd_fld, var4);
					break;
				case 1:
					ve var9 = this.cu(this.bz_fld);
					ve var10 = this.cu(var4);
					this.cb(var9, var10);
					break;
				case 2:
					ve var5 = this.co(this.bz_fld);
					ve var6 = this.co(var4);
					this.cb(var5, var6);
			}
		}
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int cn() {
		return this.am_fld.br();
	}

	@ObfuscatedName("jp")
	@ObfuscatedSignature(
		descriptor = "(I)Lve;"
	)
	ve jp(int var1) {
		int var2 = this.am_fld.ae();
		int var3 = 0;
		int var4 = var2;

		for (int var5 = var1; var5 > 0; var5--) {
			if (this.cl(this.am_fld.ak(var5 - 1, -815952377).ak_fld)) {
				var3 = var5;
				break;
			}
		}

		for (int var6 = var1; var6 < var2; var6++) {
			if (this.cl(this.am_fld.ak(var6, 253795748).ak_fld)) {
				var4 = var6;
				break;
			}
		}

		return new ve(var3, var4);
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(Lkk;I)V"
	)
	public void bn(kk var1) {
		this.bl_fld = var1;
	}

	@ObfuscatedName("gn")
	@ObfuscatedSignature(
		descriptor = "(Lli;I)Z"
	)
	public static boolean gn(li var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		if (jj(var0, var1, (byte)1)) {
			var0.ao();
			zw var2 = zg.va(var0.am_fld, (char)var1, var0.bm_fld, var0.be_fld, (byte)-34);
			var0.ap(zw.je(var2, (byte)112), zw.je(var2, (byte)83));
			var0.ci();
			var0.dc();
		}

		return true;
	}

	@ObfuscatedName("hb")
	@ObfuscatedSignature(
		descriptor = "(Lli;)Z"
	)
	public static boolean hb(li var0) {
		return var0.ad_fld;
	}

	@ObfuscatedName("it")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int it() {
		return this.bj_fld;
	}

	@ObfuscatedName("fl")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	public void fl(boolean var1) {
		ve var2 = this.co(this.bm_fld);
		this.cj((Integer)var2.ak_fld, var1, (short)2022);
	}

	@ObfuscatedName("gt")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	public void gt(boolean var1) {
		zr var2 = zg.kc(this.am_fld, 0, this.bm_fld * 100018455);
		ve var3 = var2.aw();
		this.cj(this.am_fld.am((Integer)var3.ag_fld, 1478820880 * this.bf_fld), var1, (short)-6388);
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(B)Z"
	)
	public boolean bb() {
		return this.ad_fld;
	}

	@ObfuscatedName("kw")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean kw(int var1) {
		switch (this.aj_fld) {
			case 1:
				return ey.au((char)var1);
			case 2:
				return eu.af((char)var1);
			case 3:
				return jw.al((char)var1);
			case 4:
				char var2 = (char)var1;
				if (jw.al(var2)) {
					return true;
				} else {
					if (var2 != -421601453 && 'K' != var2 && var2 != -1486849328 && 'M' != var2 && var2 != 765044111 && 'B' != var2) {
						return false;
					}

					return true;
				}
			default:
				return true;
		}
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(Lli;Z)V"
	)
	public static void bn(li var0, boolean var1) {
		var0.cj(var0.am_fld.ae(), var1, (short)404);
	}

	@ObfuscatedName("jz")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void jz(int var1) {
		this.am_fld.be(var1);
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean cq() {
		return this.ap_fld;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	public boolean ar(int var1) {
		this.bs_fld = var1;
		if (this.ci()) {
			this.dc();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("eq")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void eq() {
		this.ap_fld = false;
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(S)I"
	)
	public int cx() {
		return this.am_fld.bd();
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(IIZZI)V"
	)
	public void bl(int var1, int var2, boolean var3, boolean var4, int var5) {
		boolean var6 = false;
		int var11;
		if (!this.ap_fld) {
			var11 = 0;
		} else {
			var1 += this.bj_fld;
			var2 += this.bf_fld;
			ve var7 = this.dv();
			var11 = this.am_fld.am(var1 - (Integer)var7.ag_fld, var2 - (Integer)var7.ak_fld);
		}

		if (var3 && var4) {
			this.ac_fld = -1017857043;
			ve var15 = this.cu(var11);
			ve var8 = this.cu(this.bz_fld);
			this.cb(var8, var15);
		} else if (var3) {
			this.ac_fld = -1017857043;
			ve var12 = this.cu(var11);
			this.ap((Integer)var12.ag_fld, (Integer)var12.ak_fld);
			this.bz_fld = (Integer)var12.ag_fld;
		} else if (var4) {
			this.ap(this.bz_fld, var11);
		} else {
			if (this.br_fld > 0 && var11 == this.bz_fld) {
				if (var5 <= 2111631940) {
					return;
				}

				if (this.bd_fld == this.bm_fld) {
					this.ac_fld = -1017857043;
					ve var13 = this.cu(var11);
					this.ap((Integer)var13.ag_fld, (Integer)var13.ak_fld);
				} else {
					this.ac_fld = -2035714086;
					ve var14 = this.co(var11);
					this.ap((Integer)var14.ag_fld, (Integer)var14.ak_fld);
				}
			} else {
				this.ac_fld = 0;
				this.ap(var11, var11);
				this.bz_fld = var11;
			}

			this.br_fld = 697131997;
		}
	}

	@ObfuscatedName("oj")
	@ObfuscatedSignature(
		descriptor = "(Lli;I)V"
	)
	public static void oj(li var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.bf_fld = Math.max(0, var0.bf_fld - zg.kd(var0.am_fld, 1917156394));
		}
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	public int cs() {
		return this.bs_fld;
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void ce(int var1) {
		this.at_fld = var1;
	}

	@ObfuscatedName("rk")
	@ObfuscatedSignature(
		descriptor = "(Lli;IZ)V"
	)
	public static void rk(li var0, int var1, boolean var2) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var2) {
			var0.ap(var0.bd_fld, var1);
		} else {
			var0.ap(var1, var1);
		}
	}

	@ObfuscatedName("ix")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ix() {
		return this.am_fld.aj();
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int cg() {
		return this.am_fld.bs();
	}

	@ObfuscatedName("gz")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;)V"
	)
	public void gz(Clipboard var1) {
		zr var2 = zg.kc(this.am_fld, 1571937936 * this.bd_fld, this.bm_fld * -1081410345);
		if (!var2.az()) {
			String var3 = var2.ak();
			if (!var3.isEmpty()) {
				var1.setContents(new StringSelection(var3), null);
			}
		}
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(Lve;Lve;I)V"
	)
	void cb(ve var1, ve var2) {
		if ((Integer)var2.ag_fld < (Integer)var1.ag_fld) {
			this.ap((Integer)var1.ak_fld, (Integer)var2.ag_fld);
		} else {
			this.ap((Integer)var1.ag_fld, (Integer)var2.ak_fld);
		}
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	public int cy() {
		return this.bf_fld;
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(IB)Lve;"
	)
	ve co(int var1) {
		int var3 = this.am_fld.ae();
		int var4 = 0;
		int var5 = var3;

		for (int var6 = var1; var6 > 0; var6--) {
			if (this.am_fld.ak(var6 - 1, -743104920).ak_fld == '\n') {
				var4 = var6;
				break;
			}
		}

		for (int var7 = var1; var7 < var3; var7++) {
			if (this.am_fld.ak(var7, 826473957).ak_fld == '\n') {
				var5 = var7;
				break;
			}
		}

		return new ve(var4, var5);
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean ci() {
		if (!this.cq()) {
			return false;
		} else {
			boolean var2 = false;
			if (this.am_fld.ae() > this.bs_fld) {
				this.am_fld.aq(this.bs_fld, this.am_fld.ae());
				var2 = true;
			}

			int var3 = this.cx();
			if (zg.uf(this.am_fld, (byte)0) > var3) {
				int var4 = this.am_fld.ad(0, var3) - 1;
				this.am_fld.aq(var4, this.am_fld.ae());
				var2 = true;
			}

			if (var2) {
				int var7 = this.bm_fld;
				int var5 = this.bd_fld;
				int var6 = this.am_fld.ae();
				if (this.bm_fld > var6) {
					var7 = var6;
				}

				if (this.bd_fld > var6) {
					var5 = var6;
				}

				this.ap(var5, var7);
			}

			return var2;
		}
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(IZS)V"
	)
	void cj(int var1, boolean var2, short var3) {
		if (var2) {
			if (var3 == 1000) {
				return;
			}

			this.ap(this.bd_fld, var1);
		} else {
			this.ap(var1, var1);
		}
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int ch() {
		return this.bk_fld / zg.kd(this.am_fld, 1917156394);
	}

	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean hg() {
		return this.ad_fld;
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	boolean cl(int var1) {
		return 32 == var1 || var1 == 10 || var1 == 9;
	}

	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void dc() {
		if (null != this.by_fld) {
			this.by_fld.ak(-1562255363);
		}
	}

	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "(B)Lve;"
	)
	ve dv() {
		int var2 = this.am_fld.bh(this.bh_fld);
		int var3 = zg.ul(this.am_fld, this.bk_fld);
		return new ve(var2, var3);
	}

	@ObfuscatedName("kf")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void kf() {
		this.ab_fld = -1708298589 * ((this.ab_fld + 1) % 1706170535);
		if (202070256 * this.br_fld > 0) {
			this.br_fld--;
		}
	}

	@ObfuscatedName("es")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean es(int var1) {
		this.bs_fld = var1;
		if (this.ci()) {
			this.dc();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "(Z)Z"
	)
	public boolean dm(boolean var1) {
		var1 = var1 && this.ao_fld;
		boolean var2 = this.ad_fld != var1;
		this.ad_fld = var1;
		if (!this.ad_fld) {
			this.ap(this.bm_fld, this.bm_fld);
		}

		return var2;
	}

	@ObfuscatedName("ho")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean ho() {
		return this.bb() && this.ab_fld % 60 < 30;
	}

	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		descriptor = "()Lzr;"
	)
	public zr hl() {
		return zg.kc(this.am_fld, this.bd_fld, this.bm_fld);
	}

	@ObfuscatedName("fa")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void fa() {
		if (!this.ao() && this.bm_fld > 0) {
			ve var1 = this.cu(this.bm_fld - 1);
			int var2 = this.am_fld.aq((Integer)var1.ag_fld, this.bm_fld);
			this.dc();
			this.ap(var2, var2);
		}
	}

	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	public void dl(boolean var1) {
		this.ao_fld = var1;
		this.ad_fld = var1 && this.ad_fld;
	}

	@ObfuscatedName("wh")
	@ObfuscatedSignature(
		descriptor = "(Lli;Ljava/lang/String;S)Z"
	)
	public static boolean wh(li var0, String var1, short var2) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			zg.xu(var0.aq_fld, var1, -1612421959);
			return true;
		}
	}

	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)Z"
	)
	public boolean dr(String var1) {
		String var2 = this.am_fld.ah();
		if (!var2.equals(var1)) {
			var1 = zw(this, var1, -2087177328);
			zg.xu(this.am_fld, var1, 253516861);
			this.ap(this.bd_fld, this.bm_fld);
			this.al(this.bj_fld, this.bf_fld);
			this.ci();
			this.dc();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("jr")
	@ObfuscatedSignature(
		descriptor = "(I)Lve;"
	)
	ve jr(int var1) {
		int var2 = this.am_fld.ae();
		int var3 = 0;
		int var4 = var2;

		for (int var5 = var1; var5 > 0; var5--) {
			if (this.am_fld.ak(var5 - 1, -1794618688).ak_fld == '\n') {
				var3 = var5;
				break;
			}
		}

		for (int var6 = var1; var6 < var2; var6++) {
			if (this.am_fld.ak(var6, -120177494).ak_fld == '\n') {
				var4 = var6;
				break;
			}
		}

		return new ve(var3, var4);
	}

	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "(Lzv;)Z"
	)
	boolean dk(zv var1) {
		boolean var2 = !this.ap_fld;
		this.am_fld.ay(var1, -513243250);
		this.aq_fld.ay(var1, -579389822);
		this.ap_fld = true;
		var2 |= this.al(this.bj_fld, this.bf_fld);
		var2 |= this.ap(this.bd_fld * -865264909, -886228181 * this.bm_fld);
		if (this.ci()) {
			this.dc();
			var2 = true;
		}

		return var2;
	}

	@ObfuscatedName("er")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean er(int var1) {
		this.aj_fld = var1;
		String var2 = this.am_fld.ah();
		int var3 = var2.length();
		var2 = zw(this, var2, -2140021762);
		if (var2.length() != var3) {
			zg.xu(this.am_fld, var2, -975412076);
			this.al(this.bj_fld, this.bf_fld);
			this.ci();
			this.dc();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	public boolean du(int var1, int var2) {
		boolean var3 = var1 != this.bh_fld || this.bk_fld != var2;
		this.bh_fld = 1885466259 * var1;
		this.bk_fld = var2;
		return var3 | this.al(this.bj_fld, this.bf_fld * 121625392);
	}

	@ObfuscatedName("jn")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int jn() {
		return this.bs_fld;
	}

	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	public boolean dg(int var1, int var2) {
		boolean var3 = var1 != this.bh_fld || this.bk_fld != var2;
		this.bh_fld = var1;
		this.bk_fld = var2;
		return var3 | this.al(this.bj_fld, this.bf_fld);
	}

	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean dy(int var1) {
		if (var1 < 0) {
			var1 = Integer.MAX_VALUE;
		}

		boolean var2 = var1 == this.am_fld.aj();
		this.am_fld.bm(var1, 1915136231);
		this.aq_fld.bm(var1, 1310664424);
		if (this.ci()) {
			this.dc();
			var2 = true;
		}

		return var2;
	}

	@ObfuscatedName("jw")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void jw(int var1) {
		this.am_fld.aw(var1);
	}

	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean dn(int var1) {
		if (var1 < 0) {
			var1 = Integer.MAX_VALUE;
		}

		boolean var2 = var1 == this.am_fld.aj();
		this.am_fld.bm(var1, 985240121);
		this.aq_fld.bm(var1, 881106624);
		if (this.ci()) {
			this.dc();
			var2 = true;
		}

		return var2;
	}

	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean df(int var1) {
		if (var1 < 0) {
			var1 = Integer.MAX_VALUE;
		}

		boolean var2 = var1 == this.am_fld.aj();
		this.am_fld.bm(var1, -1058481172);
		this.aq_fld.bm(var1, 659105923);
		if (this.ci()) {
			this.dc();
			var2 = true;
		}

		return var2;
	}

	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean de(int var1) {
		this.am_fld.bz(var1);
		if (this.ci()) {
			this.dc();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean dj(int var1) {
		this.bs_fld = var1;
		if (this.ci()) {
			this.dc();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z"
	)
	public boolean ap(int var1, int var2) {
		if (!this.cq()) {
			this.bd_fld = var1;
			this.bm_fld = var2;
			return false;
		} else {
			if (var1 > this.am_fld.ae()) {
				var1 = this.am_fld.ae();
			}

			if (var2 > this.am_fld.ae()) {
				var2 = this.am_fld.ae();
			}

			boolean var4 = this.bd_fld != var1 || var2 != this.bm_fld;
			this.bd_fld = var1;
			if (var2 != this.bm_fld) {
				this.bm_fld = var2;
				this.ab_fld = 0;
				pk(this, (byte)5);
			}

			if (var4 && null != this.bl_fld) {
				this.bl_fld.ak(921543824);
			}

			return var4;
		}
	}

	@ObfuscatedName("ep")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean ep(int var1) {
		this.bs_fld = var1;
		if (this.ci()) {
			this.dc();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("eb")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	public boolean eb(int var1, int var2) {
		if (!this.cq()) {
			this.bj_fld = var1 * -828630231;
			this.bf_fld = var2 * -27121770;
			return false;
		} else {
			int var3 = this.bj_fld;
			int var4 = this.bf_fld * 1274918806;
			int var5 = Math.max(0, this.am_fld.ao() - this.bh_fld + 2);
			int var6 = Math.max(0, this.am_fld.ab() - this.bk_fld + 1);
			this.bj_fld = Math.max(0, Math.min(var5, var1)) * -840304428;
			this.bf_fld = Math.max(0, Math.min(var6, var2)) * 359185758;
			return var3 != this.bj_fld || var4 != this.bf_fld;
		}
	}

	@ObfuscatedName("oe")
	@ObfuscatedSignature(
		descriptor = "(Lli;I)V"
	)
	public static void oe(li var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ap_fld = false;
	}

	@ObfuscatedName("ed")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	public boolean ed(int var1, int var2) {
		if (!this.cq()) {
			this.bj_fld = var1;
			this.bf_fld = var2 * 1859100835;
			return false;
		} else {
			int var3 = this.bj_fld;
			int var4 = this.bf_fld;
			int var5 = Math.max(0, this.am_fld.ao() - this.bh_fld + 2);
			int var6 = Math.max(0, this.am_fld.ab() - this.bk_fld + 1);
			this.bj_fld = Math.max(0, Math.min(var5, var1)) * -662485242;
			this.bf_fld = Math.max(0, Math.min(var6, var2)) * 53852177;
			return var3 != this.bj_fld || var4 != this.bf_fld;
		}
	}

	@ObfuscatedName("et")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	public boolean et(int var1, int var2) {
		boolean var3 = true;
		if (var1 < 0 || var1 > 2) {
			var3 = false;
		}

		if (var2 < 0 || var2 > 2) {
			var3 = false;
		}

		return var3 ? this.am_fld.as(var1, var2) : false;
	}

	@ObfuscatedName("ew")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	public boolean ew(int var1, int var2) {
		boolean var3 = true;
		if (var1 < 0 || var1 > 2) {
			var3 = false;
		}

		if (var2 < 0 || var2 > 2) {
			var3 = false;
		}

		return var3 ? this.am_fld.as(var1, var2) : false;
	}

	@ObfuscatedName("ex")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void ex(int var1) {
		this.am_fld.ar(var1);
	}

	@ObfuscatedName("ky")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ky() {
		return this.bk_fld / zg.kd(this.am_fld, 1917156394);
	}

	@ObfuscatedName("uf")
	@ObfuscatedSignature(
		descriptor = "(Lli;I)Lve;"
	)
	public static ve uf(li var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		int var2 = var0.am_fld.ae();
		int var3 = 0;
		int var4 = var2;

		for (int var5 = var1; var5 > 0; var5--) {
			if (var0.am_fld.ak(var5 - 1, 1112231734).ak_fld == '\n') {
				var3 = var5;
				break;
			}
		}

		for (int var6 = var1; var6 < var2; var6++) {
			if (var0.am_fld.ak(var6, 403174450).ak_fld == '\n') {
				var4 = var6;
				break;
			}
		}

		return new ve(var3, var4);
	}

	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "(Lzv;)Z"
	)
	boolean dx(zv var1) {
		boolean var2 = !this.ap_fld;
		this.am_fld.ay(var1, -1713410794);
		this.aq_fld.ay(var1, -1727800036);
		this.ap_fld = true;
		var2 |= this.al(this.bj_fld, this.bf_fld);
		var2 |= this.ap(this.bd_fld * 1795741612, 1511699586 * this.bm_fld);
		if (this.ci()) {
			this.dc();
			var2 = true;
		}

		return var2;
	}

	@ObfuscatedName("fm")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	public void fm(boolean var1) {
		ve var2 = this.co(this.bm_fld);
		this.cj((Integer)var2.ag_fld, var1, (short)32087);
	}

	@ObfuscatedName("en")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean en(int var1) {
		this.aj_fld = var1;
		String var2 = this.am_fld.ah();
		int var3 = var2.length();
		var2 = zw(this, var2, -1791327033);
		if (var2.length() != var3) {
			zg.xu(this.am_fld, var2, 1102120501);
			this.al(this.bj_fld * -1164271381, this.bf_fld * 717885030);
			this.ci();
			this.dc();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void eg() {
		this.ap_fld = false;
	}

	@ObfuscatedName("kw")
	@ObfuscatedSignature(
		descriptor = "(Lli;Lzv;I)Z"
	)
	public static boolean kw(li var0, zv var1, int var2) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			boolean var3 = !var0.ap_fld;
			var0.am_fld.ay(var1, -516120764);
			var0.aq_fld.ay(var1, -749303385);
			var0.ap_fld = true;
			var3 |= var0.al(var0.bj_fld, var0.bf_fld);
			var3 |= var0.ap(var0.bd_fld, var0.bm_fld);
			if (var0.ci()) {
				var0.dc();
				var3 = true;
			}

			return var3;
		}
	}

	@ObfuscatedName("ef")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ef() {
		this.ap_fld = false;
	}

	@ObfuscatedName("ei")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ei() {
		this.ap_fld = false;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void ad() {
		if (!this.ao() && this.bm_fld < this.am_fld.ae()) {
			ve var2 = this.cu(this.bm_fld);
			int var3 = this.am_fld.aq(this.bm_fld, (Integer)var2.ak_fld);
			this.dc();
			this.ap(var3, var3);
		}
	}

	@ObfuscatedName("jj")
	@ObfuscatedSignature(
		descriptor = "(Lli;IB)Z"
	)
	public static boolean jj(li var0, int var1, byte var2) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			switch (var0.aj_fld) {
				case 1:
					return ey.au((char)var1);
				case 2:
					return eu.af((char)var1);
				case 3:
					return jw.al((char)var1);
				case 4:
					char var3 = (char)var1;
					if (jw.al(var3)) {
						return true;
					} else {
						if (var3 != 'k' && 'K' != var3 && var3 != 'm' && 'M' != var3 && var3 != 'b' && 'B' != var3) {
							return false;
						}

						return true;
					}
				default:
					return true;
			}
		}
	}

	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	public boolean db(int var1, int var2) {
		boolean var3 = var1 != this.bh_fld || this.bk_fld != var2;
		this.bh_fld = var1;
		this.bk_fld = var2 * -1688839687;
		return var3 | this.al(this.bj_fld, this.bf_fld);
	}

	@ObfuscatedName("ev")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ev() {
		if (!this.ao() && this.bm_fld * 809267949 > 0) {
			int var1 = this.am_fld.ai(this.bm_fld - 1);
			this.dc();
			this.ap(var1, var1);
		}
	}

	@ObfuscatedName("ey")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ey() {
		if (!this.ao() && this.bm_fld > 0) {
			int var1 = this.am_fld.ai(this.bm_fld - 1);
			this.dc();
			this.ap(var1, var1);
		}
	}

	@ObfuscatedName("em")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void em() {
		if (!this.ao() && this.bm_fld > 0) {
			int var1 = this.am_fld.ai(this.bm_fld - 1);
			this.dc();
			this.ap(var1, var1);
		}
	}

	@ObfuscatedName("gp")
	@ObfuscatedSignature(
		descriptor = "(Lsp;)Z"
	)
	public static boolean gp(sp var0) {
		return var0.ay_fld;
	}

	@ObfuscatedName("eh")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void eh() {
		if (!this.ao() && this.bm_fld < this.am_fld.ae()) {
			int var1 = this.am_fld.ai(this.bm_fld);
			this.dc();
			this.ap(var1, var1);
		}
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int cp() {
		return this.at_fld;
	}

	@ObfuscatedName("ix")
	@ObfuscatedSignature(
		descriptor = "(Lli;ZI)V"
	)
	public static void ix(li var0, boolean var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.cj(0, var1, (short)-23552);
	}

	@ObfuscatedName("ej")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ej() {
		if (!this.ao() && this.bm_fld > 0) {
			ve var1 = this.cu(this.bm_fld - 1);
			int var2 = this.am_fld.aq((Integer)var1.ag_fld, this.bm_fld);
			this.dc();
			this.ap(var2, var2);
		}
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(B)Z"
	)
	public boolean cm() {
		return this.bb() && this.ab_fld % 60 < 30;
	}

	@ObfuscatedName("jj")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int jj() {
		return this.am_fld.bs();
	}

	@ObfuscatedName("fp")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void fp() {
		if (!this.ao() && this.bm_fld < this.am_fld.ae()) {
			ve var1 = this.cu(-1693652140 * this.bm_fld);
			int var2 = this.am_fld.aq(this.bm_fld, (Integer)var1.ak_fld);
			this.dc();
			this.ap(var2, var2);
		}
	}

	@ObfuscatedName("pl")
	@ObfuscatedSignature(
		descriptor = "(Lli;)V"
	)
	public static void pl(li var0) {
		if (var0 == null) {
			var0.getClass();
		}

		zr var1 = zg.kc(var0.am_fld, 0, var0.bm_fld);
		ve var2 = var1.aw();
		int var3 = zg.kd(var0.am_fld, 1917156394);
		int var4 = (Integer)var2.ag_fld - 10;
		int var5 = var4 + 20;
		int var6 = (Integer)var2.ak_fld - 3;
		int var7 = var3 + 6 + var6;
		int var8 = var0.bj_fld;
		int var9 = var0.bh_fld + var8;
		int var10 = var0.bf_fld;
		int var11 = var0.bk_fld + var10;
		int var12 = var0.bj_fld;
		int var13 = var0.bf_fld;
		if (var4 < var8) {
			var12 = var4;
		} else if (var5 > var9) {
			var12 = var5 - var0.bh_fld;
		}

		if (var6 < var10) {
			var13 = var6;
		} else if (var7 > var11) {
			var13 = var7 - var0.bk_fld;
		}

		var0.al(var12, var13);
	}

	@ObfuscatedName("jy")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean jy() {
		if (!rb(this, (byte)72)) {
			return false;
		} else {
			int var1 = this.am_fld.aq(this.bd_fld * -106705111, this.bm_fld);
			this.dc();
			this.ap(var1, var1);
			return true;
		}
	}

	@ObfuscatedName("fo")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void fo() {
		if (!this.ao() && this.bm_fld < this.am_fld.ae()) {
			ve var1 = this.cu(514369307 * this.bm_fld);
			int var2 = this.am_fld.aq(991697574 * this.bm_fld, (Integer)var1.ak_fld);
			this.dc();
			this.ap(var2, var2);
		}
	}

	@ObfuscatedName("mw")
	@ObfuscatedSignature(
		descriptor = "(Lli;II)V"
	)
	public static void mw(li var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.am_fld.aw(var1);
		}
	}

	@ObfuscatedName("fb")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void fb() {
		this.ap(0, this.am_fld.ae());
	}

	@ObfuscatedName("fk")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void fk() {
		this.ap(0, this.am_fld.ae());
	}

	@ObfuscatedName("fh")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	public boolean fh(int var1, int var2) {
		if (!this.cq()) {
			this.bd_fld = var1;
			this.bm_fld = var2;
			return false;
		} else {
			if (var1 > this.am_fld.ae()) {
				var1 = this.am_fld.ae();
			}

			if (var2 > this.am_fld.ae()) {
				var2 = this.am_fld.ae();
			}

			boolean var3 = this.bd_fld != var1 || var2 != this.bm_fld;
			this.bd_fld = var1;
			if (var2 != this.bm_fld) {
				this.bm_fld = var2;
				this.ab_fld = 0;
				pk(this, (byte)36);
			}

			if (var3 && null != this.bl_fld) {
				this.bl_fld.ak(1342844588);
			}

			return var3;
		}
	}

	@ObfuscatedName("fu")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	public void fu(boolean var1) {
		if (rb(this, (byte)15) && !var1) {
			this.cj(Math.max(this.bd_fld, this.bm_fld), var1, (short)-7220);
		} else if (this.bm_fld < this.am_fld.ae()) {
			this.cj(1 + this.bm_fld, var1, (short)3746);
		}
	}

	@ObfuscatedName("fe")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	public void fe(boolean var1) {
		ve var2 = this.co(this.bm_fld);
		this.cj((Integer)var2.ag_fld, var1, (short)-10874);
	}

	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "(Lkk;)V"
	)
	public void hf(kk var1) {
		this.by_fld = var1;
	}

	@ObfuscatedName("uo")
	@ObfuscatedSignature(
		descriptor = "(Lli;)V"
	)
	public static void uo(li var0) {
		var0.ab_fld = 919975936 * ((var0.ab_fld + 1) % 1831048546);
		if (var0.br_fld > 0) {
			var0.br_fld -= 314071080;
		}
	}

	@ObfuscatedName("fg")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	public void fg(boolean var1) {
		this.cj(0, var1, (short)1707);
	}

	@ObfuscatedName("fe")
	@ObfuscatedSignature(
		descriptor = "(Lli;ZI)V"
	)
	public static void fe(li var0, boolean var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		} else {
			if (rb(var0, (byte)65)) {
				if (var2 >= 1346800183) {
					return;
				}

				if (!var1) {
					if (var2 >= 1346800183) {
						return;
					}

					var0.cj(Math.min(var0.bd_fld, var0.bm_fld), var1, (short)23471);
					return;
				}
			}

			if (var0.bm_fld > 0) {
				var0.cj(var0.bm_fld - 1, var1, (short)-8396);
			}
		}
	}

	@ObfuscatedName("fn")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	public void fn(boolean var1) {
		this.cj(0, var1, (short)8511);
	}

	@ObfuscatedName("is")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int is() {
		return this.bd_fld;
	}

	@ObfuscatedName("fs")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	public void fs(boolean var1) {
		if (rb(this, (byte)36) && !var1) {
			this.cj(Math.max(this.bd_fld, this.bm_fld), var1, (short)3510);
		} else if (this.bm_fld < this.am_fld.ae()) {
			this.cj(1 + this.bm_fld, var1, (short)-21751);
		}
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(I)Lzr;"
	)
	public zr ba() {
		return zg.kc(this.am_fld, this.bd_fld, this.bm_fld);
	}

	@ObfuscatedName("fr")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	public void fr(boolean var1) {
		if (rb(this, (byte)41) && !var1) {
			this.cj(Math.max(1411573160 * this.bd_fld, this.bm_fld * -719115421), var1, (short)10538);
		} else if (this.bm_fld < this.am_fld.ae()) {
			this.cj(1 + this.bm_fld, var1, (short)349);
		}
	}

	@ObfuscatedName("ug")
	@ObfuscatedSignature(
		descriptor = "(Lli;)Z"
	)
	public static boolean ug(li var0) {
		if (var0 == null) {
			throw new NullPointerException();
		} else if (!var0.cq()) {
			return false;
		} else {
			boolean var1 = false;
			if (var0.am_fld.ae() > var0.bs_fld) {
				var0.am_fld.aq(-264506770 * var0.bs_fld, var0.am_fld.ae());
				var1 = true;
			}

			int var2 = var0.cx();
			if (zg.uf(var0.am_fld, (byte)0) > var2) {
				int var3 = var0.am_fld.ad(0, var2) - 1;
				var0.am_fld.aq(var3, var0.am_fld.ae());
				var1 = true;
			}

			if (var1) {
				int var6 = var0.bm_fld;
				int var4 = var0.bd_fld;
				int var5 = var0.am_fld.ae();
				if (var0.bm_fld > var5) {
					var6 = var5;
				}

				if (var0.bd_fld > var5) {
					var4 = var5;
				}

				var0.ap(var4, var6);
			}

			return var1;
		}
	}

	@ObfuscatedName("fz")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	public void fz(boolean var1) {
		if (this.bm_fld > 0) {
			ve var2 = this.cu(this.bm_fld - 1);
			this.cj((Integer)var2.ag_fld, var1, (short)19334);
		}
	}

	@ObfuscatedName("fq")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	public void fq(boolean var1) {
		if (rb(this, (byte)29) && !var1) {
			this.cj(Math.min(824221100 * this.bd_fld, 1373405063 * this.bm_fld), var1, (short)11333);
		} else if (this.bm_fld > 0) {
			this.cj(this.bm_fld - 1, var1, (short)13636);
		}
	}

	@ObfuscatedName("gg")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	public void gg(boolean var1) {
		if (this.bm_fld < this.am_fld.ae()) {
			ve var2 = this.cu(1 + this.bm_fld);
			this.cj((Integer)var2.ak_fld, var1, (short)-2568);
		}
	}

	@ObfuscatedName("ia")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ia() {
		return this.bs_fld;
	}

	@ObfuscatedName("gh")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	public void gh(boolean var1) {
		if (this.bm_fld > 0) {
			int var2 = this.ch();
			this.cj(this.am_fld.ad(this.bm_fld, -var2), var1, (short)-990);
		}
	}

	@ObfuscatedName("gr")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	public void gr(boolean var1) {
		if (this.bm_fld < this.am_fld.ae()) {
			int var2 = this.ch();
			this.cj(this.am_fld.ad(this.bm_fld, var2), var1, (short)7211);
		}
	}

	@ObfuscatedName("gj")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	public void gj(boolean var1) {
		zr var2 = zg.kc(this.am_fld, 0, this.bm_fld);
		ve var3 = var2.aw();
		this.cj(this.am_fld.am((Integer)var3.ag_fld, this.bf_fld), var1, (short)4151);
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(B)Z"
	)
	public boolean bq() {
		return this.cx() > 1;
	}

	@ObfuscatedName("gv")
	@ObfuscatedSignature(
		descriptor = "(IIZZ)V"
	)
	public void gv(int var1, int var2, boolean var3, boolean var4) {
		boolean var5 = false;
		int var10;
		if (!this.ap_fld) {
			var10 = 0;
		} else {
			var1 += this.bj_fld;
			var2 += this.bf_fld;
			ve var6 = this.dv();
			var10 = this.am_fld.am(var1 - (Integer)var6.ag_fld, var2 - (Integer)var6.ak_fld);
		}

		if (var3 && var4) {
			this.ac_fld = -1017857043;
			ve var14 = this.cu(var10);
			ve var7 = this.cu(this.bz_fld);
			this.cb(var7, var14);
		} else if (var3) {
			this.ac_fld = -1017857043;
			ve var11 = this.cu(var10);
			this.ap((Integer)var11.ag_fld, (Integer)var11.ak_fld);
			this.bz_fld = (Integer)var11.ag_fld;
		} else if (var4) {
			this.ap(this.bz_fld, var10);
		} else {
			if (this.br_fld <= 0 || var10 != this.bz_fld) {
				this.ac_fld = 0;
				this.ap(var10, var10);
				this.bz_fld = var10;
			} else if (this.bd_fld == this.bm_fld) {
				this.ac_fld = -1017857043;
				ve var12 = this.cu(var10);
				this.ap((Integer)var12.ag_fld, (Integer)var12.ak_fld);
			} else {
				this.ac_fld = -2035714086;
				ve var13 = this.co(var10);
				this.ap((Integer)var13.ag_fld, (Integer)var13.ak_fld);
			}

			this.br_fld = 697131997;
		}
	}

	@ObfuscatedName("pk")
	@ObfuscatedSignature(
		descriptor = "(Lli;B)V"
	)
	public static void pk(li var0, byte var1) {
		if (var0 == null) {
			var0.getClass();
		}

		zr var2 = zg.kc(var0.am_fld, 0, var0.bm_fld);
		ve var3 = var2.aw();
		int var4 = zg.kd(var0.am_fld, 1917156394);
		int var5 = (Integer)var3.ag_fld - 10;
		int var6 = var5 + 20;
		int var7 = (Integer)var3.ak_fld - 3;
		int var8 = var4 + 6 + var7;
		int var9 = var0.bj_fld;
		int var10 = var0.bh_fld + var9;
		int var11 = var0.bf_fld;
		int var12 = var0.bk_fld + var11;
		int var13 = var0.bj_fld;
		int var14 = var0.bf_fld;
		if (var5 < var9) {
			if (var1 == 32) {
				return;
			}

			var13 = var5;
		} else if (var6 > var10) {
			var13 = var6 - var0.bh_fld;
		}

		if (var7 < var11) {
			var14 = var7;
		} else if (var8 > var12) {
			var14 = var8 - var0.bk_fld;
		}

		var0.al(var13, var14);
	}

	@ObfuscatedName("gu")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	public void gu(boolean var1) {
		zr var2 = zg.kc(this.am_fld, 0, this.bm_fld);
		ve var3 = var2.aw();
		this.cj(this.am_fld.am((Integer)var3.ag_fld, this.bf_fld + this.bk_fld), var1, (short)-3422);
	}

	@ObfuscatedName("gp")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	public void gp(boolean var1) {
		zr var2 = zg.kc(this.am_fld, 0, 1506822118 * this.bm_fld);
		ve var3 = var2.aw();
		this.cj(this.am_fld.am((Integer)var3.ag_fld, this.bf_fld + this.bk_fld), var1, (short)6723);
	}

	@ObfuscatedName("um")
	@ObfuscatedSignature(
		descriptor = "(Lli;II)Z"
	)
	public static boolean um(li var0, int var1, int var2) {
		if (var0 == null) {
			throw new NullPointerException();
		} else if (!var0.cq()) {
			var0.bd_fld = var1;
			var0.bm_fld = var2;
			return false;
		} else {
			if (var1 > var0.am_fld.ae()) {
				var1 = var0.am_fld.ae();
			}

			if (var2 > var0.am_fld.ae()) {
				var2 = var0.am_fld.ae();
			}

			boolean var3 = var0.bd_fld != var1 || var2 != var0.bm_fld;
			var0.bd_fld = var1;
			if (var2 != var0.bm_fld) {
				var0.bm_fld = var2;
				var0.ab_fld = 0;
				pk(var0, (byte)54);
			}

			if (var3 && null != var0.bl_fld) {
				var0.bl_fld.ak(65113427);
			}

			return var3;
		}
	}

	@ObfuscatedName("hd")
	@ObfuscatedSignature(
		descriptor = "(Lkk;)V"
	)
	public void hd(kk var1) {
		this.bl_fld = var1;
	}

	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean ez(int var1) {
		this.aj_fld = var1;
		String var2 = this.am_fld.ah();
		int var3 = var2.length();
		var2 = zw(this, var2, -1429043454);
		if (var2.length() != var3) {
			zg.xu(this.am_fld, var2, 1907697706);
			this.al(this.bj_fld, this.bf_fld);
			this.ci();
			this.dc();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("gx")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;)V"
	)
	public void gx(Clipboard var1) {
		if (rb(this, (byte)23)) {
			this.bo(var1, 187115210);
			this.ao();
		}
	}

	@ObfuscatedName("ga")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void ga(int var1, int var2) {
		if (this.ap_fld && this.bb()) {
			var1 += this.bj_fld;
			var2 += this.bf_fld;
			ve var3 = this.dv();
			int var4 = this.am_fld.am(var1 - (Integer)var3.ag_fld, var2 - (Integer)var3.ak_fld);
			switch (this.ac_fld) {
				case 0:
					this.ap(-1477431784 * this.bd_fld, var4);
					break;
				case 1:
					ve var9 = this.cu(1379705669 * this.bz_fld);
					ve var10 = this.cu(var4);
					this.cb(var9, var10);
					break;
				case 2:
					ve var5 = this.co(this.bz_fld * 324057270);
					ve var6 = this.co(var4);
					this.cb(var5, var6);
			}
		}
	}

	@ObfuscatedName("gy")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;)V"
	)
	public void gy(Clipboard var1) {
		zr var2 = zg.kc(this.am_fld, -560994651 * this.bd_fld, this.bm_fld);
		if (!var2.az()) {
			String var3 = var2.ak();
			if (!var3.isEmpty()) {
				var1.setContents(new StringSelection(var3), null);
			}
		}
	}

	@ObfuscatedName("ge")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;)V"
	)
	public void ge(Clipboard var1) {
		if (rb(this, (byte)99)) {
			this.bo(var1, 187115210);
			this.ao();
		}
	}

	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean ea(int var1) {
		if (jj(this, var1, (byte)1)) {
			this.ao();
			zw var2 = zg.va(this.am_fld, (char)var1, 1836711544 * this.bm_fld, this.be_fld * 282777137, (byte)-10);
			this.ap(zw.je(var2, (byte)102), zw.je(var2, (byte)114));
			this.ci();
			this.dc();
		}

		return true;
	}

	@ObfuscatedName("gb")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;)V"
	)
	public void gb(Clipboard var1) {
		Transferable var2 = var1.getContents(null);
		if (null != var2 && var2.isDataFlavorSupported(DataFlavor.stringFlavor)) {
			try {
				String var3 = zw(this, (String)var2.getTransferData(DataFlavor.stringFlavor), -1169973270);
				this.ao();
				zw var4 = zg.hi(this.am_fld, var3, this.bm_fld, this.be_fld);
				this.ap(zw.je(var4, (byte)106), zw.je(var4, (byte)107));
				this.ci();
				this.dc();
			} catch (Exception var5) {
			}
		}
	}

	@ObfuscatedName("gl")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;)V"
	)
	public void gl(Clipboard var1) {
		Transferable var2 = var1.getContents(null);
		if (null != var2 && var2.isDataFlavorSupported(DataFlavor.stringFlavor)) {
			try {
				String var3 = zw(this, (String)var2.getTransferData(DataFlavor.stringFlavor), -1731582606);
				this.ao();
				zw var4 = zg.hi(this.am_fld, var3, this.bm_fld, this.be_fld);
				this.ap(zw.je(var4, (byte)100), zw.je(var4, (byte)124));
				this.ci();
				this.dc();
			} catch (Exception var5) {
			}
		}
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(ZI)V"
	)
	public void br(boolean var1) {
		this.ao_fld = var1;
		this.ad_fld = var1 && this.ad_fld;
	}

	@ObfuscatedName("hb")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void hb() {
		this.bf_fld = Math.max(0, this.bf_fld - zg.kd(this.am_fld, 1917156394));
	}

	@ObfuscatedName("eu")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void eu() {
		if (!this.ao() && this.bm_fld < this.am_fld.ae()) {
			int var1 = this.am_fld.ai(this.bm_fld);
			this.dc();
			this.ap(var1, var1);
		}
	}

	@ObfuscatedName("hh")
	@ObfuscatedSignature(
		descriptor = "(Lkk;)V"
	)
	public void hh(kk var1) {
		this.by_fld = var1;
	}

	@ObfuscatedName("he")
	@ObfuscatedSignature(
		descriptor = "(Lkk;)V"
	)
	public void he(kk var1) {
		this.by_fld = var1;
	}

	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "(Lqf;)[Ljava/lang/String;"
	)
	public static String[] dw(qf var0) {
		if (var0 == null) {
			var0.getClass();
		}

		return null;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	public boolean aa(int var1) {
		if (jj(this, var1, (byte)1)) {
			this.ao();
			zw var3 = zg.va(this.am_fld, (char)var1, this.bm_fld, this.be_fld, (byte)-57);
			this.ap(zw.je(var3, (byte)101), zw.je(var3, (byte)94));
			this.ci();
			this.dc();
		}

		return true;
	}

	@ObfuscatedName("fv")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean fv() {
		return this.bm_fld != this.bd_fld;
	}

	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		descriptor = "()Lzg;"
	)
	public zg hi() {
		return this.am_fld;
	}

	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		descriptor = "()Lzg;"
	)
	public zg hn() {
		return this.am_fld;
	}

	@ObfuscatedName("nj")
	@ObfuscatedSignature(
		descriptor = "(Lli;Z)Z"
	)
	public static boolean nj(li var0, boolean var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var1 = var1 && var0.ao_fld;
		boolean var2 = var0.ad_fld != var1;
		var0.ad_fld = var1;
		if (!var0.ad_fld) {
			var0.ap(var0.bm_fld, var0.bm_fld);
		}

		return var2;
	}

	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		descriptor = "()Lzg;"
	)
	public zg hs() {
		return this.aq_fld;
	}

	@ObfuscatedName("xp")
	@ObfuscatedSignature(
		descriptor = "(Lli;III)Z"
	)
	public static boolean xp(li var0, int var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		boolean var4 = true;
		if (var1 < 0 || var1 > 2) {
			var4 = false;
		}

		if (var2 < 0 || var2 > 2) {
			var4 = false;
		}

		return var4 ? var0.am_fld.as(var1, var2) : false;
	}

	@ObfuscatedName("hq")
	@ObfuscatedSignature(
		descriptor = "()Lzg;"
	)
	public zg hq() {
		return this.aq_fld;
	}

	@ObfuscatedName("iu")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void iu(int var1) {
		this.at_fld = var1;
	}

	@ObfuscatedName("hc")
	@ObfuscatedSignature(
		descriptor = "()Lzr;"
	)
	public zr hc() {
		return zg.kc(this.am_fld, this.bd_fld, this.bm_fld);
	}

	@ObfuscatedName("hw")
	@ObfuscatedSignature(
		descriptor = "()Lzr;"
	)
	public zr hw() {
		return zg.kc(this.am_fld, this.bd_fld, this.bm_fld);
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(ZB)V"
	)
	public void by(boolean var1) {
		zr var3 = zg.kc(this.am_fld, 0, this.bm_fld);
		ve var4 = var3.aw();
		this.cj(this.am_fld.am((Integer)var4.ag_fld, this.bf_fld + this.bk_fld), var1, (short)11711);
	}

	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean hv() {
		return this.ad_fld;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(ZS)V"
	)
	public void bz(boolean var1) {
		if (rb(this, (byte)113) && !var1) {
			this.cj(Math.max(this.bd_fld, this.bm_fld), var1, (short)-2427);
		} else if (this.bm_fld < this.am_fld.ae()) {
			this.cj(1 + this.bm_fld, var1, (short)-7735);
		}
	}

	@ObfuscatedName("jf")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)Ljava/lang/String;"
	)
	String jf(String var1) {
		StringBuilder var2 = new StringBuilder(var1.length());

		for (int var3 = 0; var3 < var1.length(); var3++) {
			char var4 = var1.charAt(var3);
			if (jj(this, var4, (byte)1)) {
				var2.append(var4);
			}
		}

		return var2.toString();
	}

	@ObfuscatedName("hy")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean hy() {
		return this.ao_fld;
	}

	@ObfuscatedName("hz")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean hz() {
		return this.ao_fld;
	}

	@ObfuscatedName("hp")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void hp() {
		this.bf_fld = Math.max(0, this.bf_fld - zg.kd(this.am_fld, 1917156394));
	}

	@ObfuscatedName("rb")
	@ObfuscatedSignature(
		descriptor = "(Lli;B)Z"
	)
	public static boolean rb(li var0, byte var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.bm_fld != var0.bd_fld;
		}
	}

	@ObfuscatedName("hm")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean hm() {
		return this.bb() && this.ab_fld % 60 < 30;
	}

	@ObfuscatedName("mb")
	@ObfuscatedSignature(
		descriptor = "(Lli;I)Lzg;"
	)
	public static zg mb(li var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.aq_fld;
	}

	@ObfuscatedName("iy")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int iy() {
		return this.bd_fld;
	}

	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ik() {
		return this.am_fld.br();
	}

	@ObfuscatedName("fy")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void fy() {
		if (!this.ao() && this.bm_fld > 0) {
			ve var1 = this.cu(this.bm_fld - 1);
			int var2 = this.am_fld.aq((Integer)var1.ag_fld, this.bm_fld);
			this.dc();
			this.ap(var2, var2);
		}
	}

	@ObfuscatedName("qv")
	@ObfuscatedSignature(
		descriptor = "(Lli;Z)V"
	)
	public static void qv(li var0, boolean var1) {
		if (var0.bm_fld * 671613196 > 0) {
			ve var2 = var0.cu(var0.bm_fld - 1);
			var0.cj((Integer)var2.ag_fld, var1, (short)-461);
		}
	}

	@ObfuscatedName("if")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean if_() {
		return this.ap_fld;
	}

	@ObfuscatedName("ip")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean ip() {
		return this.ap_fld;
	}

	@ObfuscatedName("ij")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ij() {
		return this.bf_fld;
	}

	@ObfuscatedName("ih")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ih() {
		return this.at_fld;
	}

	@ObfuscatedName("jk")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int jk() {
		return this.am_fld.aj();
	}

	@ObfuscatedName("in")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int in() {
		return this.am_fld.bd();
	}

	@ObfuscatedName("il")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int il() {
		return this.am_fld.bd();
	}

	@ObfuscatedName("fd")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	public void fd(boolean var1) {
		if (rb(this, (byte)54) && !var1) {
			this.cj(Math.min(this.bd_fld, this.bm_fld), var1, (short)21999);
		} else if (this.bm_fld > 0) {
			this.cj(this.bm_fld - 1, var1, (short)196);
		}
	}

	@ObfuscatedName("ic")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ic() {
		return this.bs_fld;
	}

	@ObfuscatedName("ie")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ie() {
		return this.bs_fld;
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean bg() {
		return this.ao_fld;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V"
	)
	public void bo(Clipboard var1, int var2) {
		zr var3 = zg.kc(this.am_fld, this.bd_fld, this.bm_fld);
		if (!var3.az()) {
			if (var2 != 187115210) {
				return;
			}

			String var4 = var3.ak();
			if (!var4.isEmpty()) {
				var1.setContents(new StringSelection(var4), null);
			}
		}
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	public void bi() {
		int var2 = Math.max(0, this.am_fld.ab() - this.bk_fld);
		this.bf_fld = Math.min(var2, this.bf_fld + zg.kd(this.am_fld, 1917156394));
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;B)V"
	)
	public void bt(Clipboard var1) {
		Transferable var3 = var1.getContents(null);
		if (null != var3 && var3.isDataFlavorSupported(DataFlavor.stringFlavor)) {
			try {
				String var4 = zw(this, (String)var3.getTransferData(DataFlavor.stringFlavor), -1235389954);
				this.ao();
				zw var5 = zg.hi(this.am_fld, var4, this.bm_fld, this.be_fld);
				this.ap(zw.je(var5, (byte)69), zw.je(var5, (byte)121));
				this.ci();
				this.dc();
			} catch (Exception var6) {
			}
		}
	}

	@ObfuscatedName("ir")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void ir(int var1) {
		this.at_fld = var1;
	}

	@ObfuscatedName("iv")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int iv() {
		return this.am_fld.br();
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(Lli;B)Lzg;"
	)
	public static zg bh(li var0, byte var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.am_fld;
		}
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void bx(int var1, int var2) {
		if (this.ap_fld && this.bb()) {
			var1 += this.bj_fld;
			var2 += this.bf_fld;
			ve var4 = this.dv();
			int var5 = this.am_fld.am(var1 - (Integer)var4.ag_fld, var2 - (Integer)var4.ak_fld);
			switch (this.ac_fld) {
				case 0:
					this.ap(this.bd_fld, var5);
					break;
				case 1:
					ve var10 = this.cu(this.bz_fld);
					ve var11 = this.cu(var5);
					this.cb(var10, var11);
					break;
				case 2:
					ve var6 = this.co(this.bz_fld);
					ve var7 = this.co(var5);
					this.cb(var6, var7);
			}
		}
	}

	@ObfuscatedName("iw")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void iw(int var1) {
		this.am_fld.be(var1);
	}

	@ObfuscatedName("zw")
	@ObfuscatedSignature(
		descriptor = "(Lli;Ljava/lang/String;I)Ljava/lang/String;"
	)
	public static String zw(li var0, String var1, int var2) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			StringBuilder var3 = new StringBuilder(var1.length());

			for (int var4 = 0; var4 < var1.length(); var4++) {
				char var5 = var1.charAt(var4);
				if (jj(var0, var5, (byte)1)) {
					var3.append(var5);
				}
			}

			return var3.toString();
		}
	}

	@ObfuscatedName("uv")
	@ObfuscatedSignature(
		descriptor = "(Lli;Z)V"
	)
	public static void uv(li var0, boolean var1) {
		if (var0.bm_fld > 0) {
			int var2 = var0.ch();
			var0.cj(var0.am_fld.ad(var0.bm_fld, -var2), var1, (short)22710);
		}
	}

	@ObfuscatedName("ky")
	@ObfuscatedSignature(
		descriptor = "(Lli;I)Z"
	)
	public static boolean ky(li var0, int var1) {
		var0.am_fld.bz(var1);
		if (var0.ci()) {
			var0.dc();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ig")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void ig(int var1) {
		this.am_fld.be(var1);
	}

	@ObfuscatedName("kz")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void kz() {
		if (null != this.by_fld) {
			this.by_fld.ak(2134322961);
		}
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int cc() {
		return this.bd_fld;
	}

	@ObfuscatedName("rp")
	@ObfuscatedSignature(
		descriptor = "(Lli;)I"
	)
	public static int rp(li var0) {
		return var0.am_fld.bd();
	}

	@ObfuscatedName("ii")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ii() {
		return this.aj_fld;
	}

	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void hj() {
		this.bf_fld = Math.max(0, this.bf_fld - zg.kd(this.am_fld, 1917156394));
	}

	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		descriptor = "(Lkk;)V"
	)
	public void hk(kk var1) {
		this.bl_fld = var1;
	}

	@ObfuscatedName("jv")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean jv() {
		return this.cx() > 1;
	}

	@ObfuscatedName("jo")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean jo() {
		return this.cx() > 1;
	}

	@ObfuscatedName("ja")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean ja() {
		return this.cx() > 1;
	}

	@ObfuscatedName("jd")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean jd() {
		return this.cx() > 1;
	}

	@ObfuscatedName("je")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean je() {
		return this.bm_fld != this.bd_fld;
	}

	@ObfuscatedName("tl")
	@ObfuscatedSignature(
		descriptor = "(Lli;II)Z"
	)
	public static boolean tl(li var0, int var1, int var2) {
		boolean var3 = var1 != var0.bh_fld || var0.bk_fld != var2;
		var0.bh_fld = var1;
		var0.bk_fld = var2;
		return var3 | var0.al(var0.bj_fld, var0.bf_fld);
	}

	@ObfuscatedName("id")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int id() {
		return this.aj_fld;
	}

	@ObfuscatedName("jc")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean jc() {
		return this.bm_fld != this.bd_fld;
	}

	@ObfuscatedName("fx")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean fx() {
		return this.bm_fld != this.bd_fld;
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(IB)V"
	)
	public void cr(int var1) {
		this.am_fld.be(var1);
	}

	@ObfuscatedName("jh")
	@ObfuscatedSignature(
		descriptor = "(Lve;Lve;)V"
	)
	void jh(ve var1, ve var2) {
		if ((Integer)var2.ag_fld < (Integer)var1.ag_fld) {
			this.ap((Integer)var1.ak_fld, (Integer)var2.ag_fld);
		} else {
			this.ap((Integer)var1.ag_fld, (Integer)var2.ak_fld);
		}
	}

	@ObfuscatedName("gh")
	@ObfuscatedSignature(
		descriptor = "(Lli;II)Z"
	)
	public static boolean gh(li var0, int var1, int var2) {
		boolean var3 = var1 != var0.bh_fld || var0.bk_fld != var2;
		var0.bh_fld = var1;
		var0.bk_fld = var2;
		return var3 | var0.al(1866875189 * var0.bj_fld, var0.bf_fld * -1149429510);
	}

	@ObfuscatedName("jq")
	@ObfuscatedSignature(
		descriptor = "(Lve;Lve;)V"
	)
	void jq(ve var1, ve var2) {
		if ((Integer)var2.ag_fld < (Integer)var1.ag_fld) {
			this.ap((Integer)var1.ak_fld, (Integer)var2.ag_fld);
		} else {
			this.ap((Integer)var1.ag_fld, (Integer)var2.ak_fld);
		}
	}

	@ObfuscatedName("ju")
	@ObfuscatedSignature(
		descriptor = "(I)Lve;"
	)
	ve ju(int var1) {
		int var2 = this.am_fld.ae();
		int var3 = 0;
		int var4 = var2;

		for (int var5 = var1; var5 > 0; var5--) {
			if (this.cl(this.am_fld.ak(var5 - 1, 276696740).ak_fld)) {
				var3 = var5;
				break;
			}
		}

		for (int var6 = var1; var6 < var2; var6++) {
			if (this.cl(this.am_fld.ak(var6, -414552471).ak_fld)) {
				var4 = var6;
				break;
			}
		}

		return new ve(var3, var4);
	}

	@ObfuscatedName("gf")
	@ObfuscatedSignature(
		descriptor = "(Lli;)V"
	)
	public static void gf(li var0) {
		if (var0 == null) {
			var0.getClass();
		}

		if (!var0.ao() && var0.bm_fld < var0.am_fld.ae()) {
			int var1 = var0.am_fld.ai(var0.bm_fld);
			var0.dc();
			var0.ap(var1, var1);
		}
	}

	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean hu() {
		return this.ao_fld;
	}

	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean di(int var1) {
		if (var1 < 0) {
			var1 = Integer.MAX_VALUE;
		}

		boolean var2 = var1 == this.am_fld.aj();
		this.am_fld.bm(var1, -1720395162);
		this.aq_fld.bm(var1, -1119748976);
		if (this.ci()) {
			this.dc();
			var2 = true;
		}

		return var2;
	}

	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean ht() {
		return this.ad_fld;
	}

	@ObfuscatedName("ku")
	@ObfuscatedSignature(
		descriptor = "(IZ)V"
	)
	void ku(int var1, boolean var2) {
		if (var2) {
			this.ap(this.bd_fld, var1);
		} else {
			this.ap(var1, var1);
		}
	}

	@ObfuscatedName("kv")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void kv() {
		if (null != this.by_fld) {
			this.by_fld.ak(589617342);
		}
	}

	li() {
		this.ad_fld = false;
		this.ao_fld = true;
		this.ab_fld = 0;
		this.ap_fld = false;
		this.at_fld = 0;
		this.ac_fld = 0;
		this.aj_fld = 0;
		this.bm_fld = 0;
		this.bd_fld = 0;
		this.bz_fld = 0;
		this.br_fld = 0;
		this.be_fld = -576572763;
		this.bs_fld = -1359542829;
		this.bh_fld = 0;
		this.bk_fld = 0;
		this.bj_fld = 0;
		this.bf_fld = 0;
		this.am_fld.be(1);
		this.aq_fld.be(1);
	}

	@ObfuscatedName("kc")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void kc() {
		if (null != this.by_fld) {
			this.by_fld.ak(-884638642);
		}
	}

	@ObfuscatedName("km")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean km(int var1) {
		switch (this.aj_fld) {
			case 1:
				return ey.au((char)var1);
			case 2:
				return eu.af((char)var1);
			case 3:
				return jw.al((char)var1);
			case 4:
				char var2 = (char)var1;
				if (jw.al(var2)) {
					return true;
				} else {
					if (var2 != 'k' && 'K' != var2 && var2 != 'm' && 'M' != var2 && var2 != 'b' && 'B' != var2) {
						return false;
					}

					return true;
				}
			default:
				return true;
		}
	}

	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)Z"
	)
	boolean da(String var1) {
		zg.xu(this.aq_fld, var1, -1822996822);
		return true;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z"
	)
	public boolean aw(int var1, int var2) {
		boolean var4 = var1 != this.bh_fld || this.bk_fld != var2;
		this.bh_fld = var1;
		this.bk_fld = var2;
		return var4 | this.al(this.bj_fld, this.bf_fld);
	}

	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void dz() {
		if (null != this.by_fld) {
			this.by_fld.ak(-804659180);
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	static void ae(int var0, int var1) {
		bg var2 = (bg)xz.tw(bg.ak_fld, var0);
		if (null != var2) {
			for (int var3 = 0; var3 < var2.ag_fld.length; var3++) {
				if (var1 != -1754011223) {
					return;
				}

				var2.ag_fld[var3] = -1;
				var2.az_fld[var3] = 0;
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;S)Z"
	)
	boolean ae(String var1, short var2) {
		zg.xu(this.am_fld, var1, -1612421959);
		return true;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lzv;I)Z"
	)
	boolean ah(zv var1, int var2) {
		boolean var3 = !this.ao_fld;
		this.am_fld.ay(var1, -516120764);
		this.aq_fld.ay(var1, -749303385);
		this.ap_fld = true;
		var3 |= this.al(923206363 * this.bh_fld, this.bs_fld * 2139851407);
		var3 |= this.aw(this.ac_fld * -2043137107, 640340333 * this.be_fld);
		if (this.ci()) {
			this.dc();
			var3 = true;
		}

		return var3;
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(B)Lzg;"
	)
	public zg bc(byte var1) {
		return this.aq_fld;
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	public int ca(byte var1) {
		return this.bm_fld;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ZI)V"
	)
	public void az(boolean var1, int var2) {
		if (rb(this, (byte)65)) {
			if (var2 >= 1346800183) {
				return;
			}

			if (!var1) {
				if (var2 >= 1346800183) {
					return;
				}

				this.cj(Math.min(-2043137107 * this.bm_fld, 640340333 * this.be_fld), var1, (short)23471);
				return;
			}
		}

		if (this.ac_fld * 640340333 > 0) {
			this.cj(this.at_fld - 1, var1, (short)-8396);
		}
	}

	@ObfuscatedName("uu")
	@ObfuscatedSignature(
		descriptor = "(Lli;B)I"
	)
	public static int uu(li var0, byte var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.aj_fld;
		}
	}

	@ObfuscatedName("em")
	@ObfuscatedSignature(
		descriptor = "(Lli;B)I"
	)
	public static int em(li var0, byte var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.bm_fld;
		}
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void bv(int var1) {
		this.bf_fld = Math.max(0, this.bj_fld - zg.kd(this.am_fld, 1917156394));
	}

	@ObfuscatedName("xz")
	@ObfuscatedSignature(
		descriptor = "(Lli;Z)V"
	)
	public static void xz(li var0, boolean var1) {
		ve var2 = var0.co(var0.bm_fld);
		var0.cj((Integer)var2.ak_fld, var1, (short)-13522);
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(I)Lzg;"
	)
	public zg bw(int var1) {
		return this.am_fld;
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	public int cd(byte var1) {
		return this.bf_fld;
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int cv(int var1) {
		return this.be_fld;
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void cw(int var1, int var2) {
		this.am_fld.aw(var1);
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(B)Z"
	)
	boolean cz(byte var1) {
		return this.bj_fld != this.bk_fld;
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;"
	)
	String ck(String var1, int var2) {
		StringBuilder var3 = new StringBuilder(var1.length());

		for (int var4 = 0; var4 < var1.length(); var4++) {
			char var5 = var1.charAt(var4);
			if (jj(this, var5, (byte)1)) {
				var3.append(var5);
			}
		}

		return var3.toString();
	}

	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "(IB)Z"
	)
	boolean dh(int var1, byte var2) {
		switch (this.bd_fld * -135401855) {
			case 1:
				return ey.au((char)var1);
			case 2:
				return eu.af((char)var1);
			case 3:
				return jw.al((char)var1);
			case 4:
				char var3 = (char)var1;
				if (jw.al(var3)) {
					return true;
				} else {
					if (var3 != 'k' && 'K' != var3 && var3 != 'm' && 'M' != var3 && var3 != 'b' && 'B' != var3) {
						return false;
					}

					return true;
				}
			default:
				return true;
		}
	}

	@ObfuscatedName("xq")
	@ObfuscatedSignature(
		descriptor = "(Lli;)V"
	)
	public static void xq(li var0) {
		zr var1 = zg.kc(var0.am_fld, 0, var0.bm_fld);
		ve var2 = var1.aw();
		int var3 = zg.kd(var0.am_fld, 1917156394);
		int var4 = (Integer)var2.ag_fld - 10;
		int var5 = var4 + 20;
		int var6 = (Integer)var2.ak_fld - 3;
		int var7 = var3 + 6 + var6;
		int var8 = var0.bj_fld;
		int var9 = var0.bh_fld + var8;
		int var10 = var0.bf_fld;
		int var11 = var0.bk_fld + var10;
		int var12 = var0.bj_fld;
		int var13 = var0.bf_fld;
		if (var4 < var8) {
			var12 = var4;
		} else if (var5 > var9) {
			var12 = var5 - var0.bh_fld;
		}

		if (var6 < var10) {
			var13 = var6;
		} else if (var7 > var11) {
			var13 = var7 - var0.bk_fld;
		}

		var0.al(var12, var13);
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int cf(int var1) {
		return this.am_fld.bd();
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(III)Z"
	)
	public boolean af(int var1, int var2, int var3) {
		boolean var4 = true;
		if (var1 < 0 || var1 > 2) {
			var4 = false;
		}

		if (var2 < 0 || var2 > 2) {
			var4 = false;
		}

		return var4 ? this.am_fld.as(var1, var2) : false;
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	void ct(byte var1) {
		zr var2 = zg.kc(this.am_fld, 0, this.br_fld * 640340333);
		ve var3 = var2.aw();
		int var4 = zg.kd(this.aq_fld, 1917156394);
		int var5 = (Integer)var3.ag_fld - 10;
		int var6 = var5 + 20;
		int var7 = (Integer)var3.ak_fld - 3;
		int var8 = var4 + 6 + var7;
		int var9 = this.bz_fld * 923206363;
		int var10 = this.bh_fld + var9;
		int var11 = 2139851407 * this.bj_fld;
		int var12 = this.at_fld + var11;
		int var13 = 923206363 * this.bs_fld;
		int var14 = this.at_fld * 2139851407;
		if (var5 < var9) {
			if (var1 == 32) {
				return;
			}

			var13 = var5;
		} else if (var6 > var10) {
			var13 = var6 - this.bs_fld;
		}

		if (var7 < var11) {
			var14 = var7;
		} else if (var8 > var12) {
			var14 = var8 - this.aj_fld;
		}

		this.af(var13, var14, -666338893);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ZI)V"
	)
	public void ac(boolean var1, int var2) {
		this.cj(0, var1, (short)-23552);
	}

	@ObfuscatedName("nf")
	@ObfuscatedSignature(
		descriptor = "(Lli;I)I"
	)
	public static int nf(li var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.bj_fld;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void an(int var1) {
		this.ad_fld = false;
	}

	@ObfuscatedName("kn")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void kn() {
		if (!this.ao() && this.br_fld * 640340333 > 0) {
			int var1 = this.am_fld.ai(this.at_fld - 1);
			this.dc();
			this.ap(var1, var1);
		}
	}
}
