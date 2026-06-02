import java.io.EOFException;
import net.runelite.api.EnumComposition;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("os")
@Implements({"EnumComposition"})
public class os extends vc implements EnumComposition {
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	public static iw ar_fld = new iw(64);
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ag_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ae_fld;
	@ObfuscatedGetter(
		longValue = -4290715676318482629L
	)
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	long an_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ak_fld;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "C"
	)
	char af_fld;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "C"
	)
	char al_fld;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	String au_fld = kh.aj_fld;
	@ObfuscatedGetter(
		intValue = 1741812539
	)
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ax_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int av_fld;
	@ObfuscatedGetter(
		intValue = -1780631415
	)
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int aa_fld = 0;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] ai_fld;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] aq_fld;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "[J"
	)
	long[] am_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int aw_fld;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lsl;"
	)
	sl ao_fld;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lsl;"
	)
	sl ab_fld;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "[Ljava/lang/String;"
	)
	String[] ad_fld;

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int av(int var1) {
		return this.aa_fld;
	}

	@ObfuscatedName("zm")
	@ObfuscatedSignature(
		descriptor = "(Los;IB)J"
	)
	public static long zm(os var0, int var1, byte var2) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			for (int var3 = 0; var3 < var0.aa_fld; var3++) {
				if (var0.ai_fld[var3] == var1) {
					return var0.am_fld[var3];
				}
			}

			return var0.an_fld;
		}
	}

	@ObfuscatedName("pm")
	@ObfuscatedSignature(
		descriptor = "(Los;Lxi;I)V"
	)
	public static void pm(os var0, xi var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		if (1 == var2) {
			var0.af_fld = (char)var1.cg();
		} else if (2 == var2) {
			var0.al_fld = (char)var1.cg();
		} else if (3 == var2) {
			var0.au_fld = xi.kc(var1, -949069593);
		} else if (4 == var2) {
			var0.ax_fld = var1.co();
		} else if (var2 == 8) {
			var0.an_fld = xi.ob(var1, -542491849);
		} else if (5 == var2) {
			var0.aa_fld = xi.tx(var1, 466436134);
			var0.ai_fld = new int[var0.aa_fld];
			var0.ad_fld = new String[var0.aa_fld];

			for (int var3 = 0; var3 < var0.aa_fld; var3++) {
				var0.ai_fld[var3] = var1.co();
				var0.ad_fld[var3] = xi.kc(var1, 376129495);
			}
		} else if (7 == var2) {
			var0.aa_fld = xi.tx(var1, 500004021);
			var0.ai_fld = new int[var0.aa_fld];
			var0.am_fld = new long[var0.aa_fld];

			for (int var4 = 0; var4 < var0.aa_fld; var4++) {
				var0.ai_fld[var4] = var1.co();
				var0.am_fld[var4] = xi.ob(var1, -15608915);
			}
		} else if (var2 == 6) {
			var0.aa_fld = xi.tx(var1, 1159059707);
			var0.ai_fld = new int[var0.aa_fld];
			var0.aq_fld = new int[var0.aa_fld];

			for (int var5 = 0; var5 < var0.aa_fld; var5++) {
				var0.ai_fld[var5] = var1.co();
				var0.aq_fld[var5] = var1.co();
			}
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	public int ay(int var1, int var2) {
		for (int var3 = 0; var3 < this.aa_fld; var3++) {
			if (this.ai_fld[var3] == var1) {
				return this.aq_fld[var3];
			}
		}

		return this.ax_fld;
	}

	@ObfuscatedName("tl")
	@ObfuscatedSignature(
		descriptor = "(Los;I)I"
	)
	public static int tl(os var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			for (int var2 = 0; var2 < var0.aa_fld; var2++) {
				if (var0.ai_fld[var2] == var1) {
					return var0.aq_fld[var2];
				}
			}

			return var0.ax_fld;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(CI)Z"
	)
	public boolean ar(char var1, int var2) {
		return var1 == this.af_fld;
	}

	@ObfuscatedName("getStringVals")
	@ObfuscatedSignature(
		descriptor = "()[Ljava/lang/String;"
	)
	@Override
	public String[] getStringVals() {
		return this.ad_fld;
	}

	@ObfuscatedName("se")
	@ObfuscatedSignature(
		descriptor = "(Los;I)Lsl;"
	)
	public static sl se(os var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			if (null == var0.ao_fld) {
				var0.ao_fld = pm.au(var0.ai_fld);
			}

			return var0.ao_fld;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Los;"
	)
	public static os au(int var0) throws EOFException {
		try {
			os var1 = (os)ar_fld.ak(var0);
			if (var1 != null) {
				return var1;
			} else {
				byte[] var2 = de.as_fld.bb(8, var0, 584982574);
				var1 = new os();
				if (null != var2) {
					ap(var1, new xi(var2), 1255130025);
				}

				ar_fld.az(var1, var0);
				return var1;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	void an(xi var1) {
		while (true) {
			int var2 = var1.cg();
			if (0 == var2) {
				return;
			}

			ww(this, var1, var2, (short)-24850);
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	void ai(xi var1) {
		while (true) {
			int var2 = var1.cg();
			if (0 == var2) {
				return;
			}

			ww(this, var1, var2, (short)-8085);
		}
	}

	os() {
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Los;)I"
	)
	public static int ar(os var0) {
		return var0.aa_fld;
	}

	@ObfuscatedName("getLongValue")
	@ObfuscatedSignature(
		descriptor = "(I)J"
	)
	@Override
	public long getLongValue(int var1) {
		int var2 = this.dp(var1);
		return var2 == -1 ? this.an_fld : this.getLongVals()[var2];
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "()[Lll;"
	)
	public static ll[] ak() {
		return new ll[]{ll.ag_fld, ll.ak_fld};
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(I)J"
	)
	public long bf(int var1) {
		for (int var2 = 0; var2 < this.aa_fld; var2++) {
			if (this.ai_fld[var2] == var1) {
				return this.am_fld[var2];
			}
		}

		return this.an_fld;
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(Los;I)I"
	)
	public static int bv(os var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		for (int var2 = 0; var2 < var0.aa_fld; var2++) {
			if (var0.ai_fld[var2] == var1) {
				return var0.aq_fld[var2];
			}
		}

		return var0.ax_fld;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int bh(int var1) {
		for (int var2 = 0; var2 < this.aa_fld; var2++) {
			if (this.ai_fld[var2] == var1) {
				return this.aq_fld[var2];
			}
		}

		return this.ax_fld;
	}

	@ObfuscatedName("ks")
	@ObfuscatedSignature(
		descriptor = "(Los;CB)Z"
	)
	public static boolean ks(os var0, char var1, byte var2) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.al_fld == var1;
	}

	@ObfuscatedName("getLongVals")
	@ObfuscatedSignature(
		descriptor = "()[J"
	)
	@Override
	public long[] getLongVals() {
		return this.am_fld;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	void ag(xi var1, int var2) {
		if (1 == var2) {
			this.af_fld = (char)var1.cg();
		} else if (2 == var2) {
			this.al_fld = (char)var1.cg();
		} else if (3 == var2) {
			this.au_fld = xi.kc(var1, 1090866712);
		} else if (4 == var2) {
			this.ax_fld = var1.co();
		} else if (var2 == 8) {
			this.an_fld = xi.ob(var1, -969886494);
		} else if (5 == var2) {
			this.aa_fld = xi.tx(var1, 1426662490) * 800807727;
			this.ai_fld = new int[this.aa_fld];
			this.ad_fld = new String[this.aa_fld];

			for (int var3 = 0; var3 < this.aa_fld; var3++) {
				this.ai_fld[var3] = var1.co();
				this.ad_fld[var3] = xi.kc(var1, -673613330);
			}
		} else if (7 == var2) {
			this.aa_fld = xi.tx(var1, 345915886) * -2033084283;
			this.ai_fld = new int[this.aa_fld];
			this.am_fld = new long[this.aa_fld];

			for (int var4 = 0; var4 < this.aa_fld; var4++) {
				this.ai_fld[var4] = var1.co();
				this.am_fld[var4] = xi.ob(var1, 1156550094);
			}
		} else if (var2 == 6) {
			this.aa_fld = xi.tx(var1, 1108353735) * 339629167;
			this.ai_fld = new int[this.aa_fld];
			this.aq_fld = new int[-604483111 * this.aa_fld];

			for (int var5 = 0; var5 < this.aa_fld; var5++) {
				this.ai_fld[var5] = var1.co();
				this.aq_fld[var5] = var1.co();
			}
		}
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "()Lsl;"
	)
	public sl bm() {
		if (null == this.ao_fld) {
			this.ao_fld = pm.au(this.ai_fld);
		}

		return this.ao_fld;
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(Los;I)Lsl;"
	)
	public static sl cg(os var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			if (null == var0.ab_fld) {
				if ('s' == var0.al_fld) {
					String[] var3 = var0.ad_fld;
					sl var4 = new sl(yq.az_fld, false);
					var4.as_fld = var3;
					var4.av_fld = -69344095 * var3.length;
					var4.ae_fld = var3.length;
					var0.ab_fld = var4;
				} else if (207 == var0.al_fld) {
					var0.ab_fld = wn.ax(var0.am_fld);
				} else {
					var0.ab_fld = pm.au(var0.aq_fld);
				}
			}

			return var0.ab_fld;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	void at(xi var1, int var2) {
		if (1 == var2) {
			this.af_fld = (char)var1.cg();
		} else if (2 == var2) {
			this.al_fld = (char)var1.cg();
		} else if (3 == var2) {
			this.au_fld = xi.kc(var1, 566856250);
		} else if (4 == var2) {
			this.ax_fld = var1.co();
		} else if (var2 == 8) {
			this.an_fld = xi.ob(var1, 599612031);
		} else if (5 == var2) {
			this.aa_fld = xi.tx(var1, 385351523);
			this.ai_fld = new int[this.aa_fld];
			this.ad_fld = new String[this.aa_fld];

			for (int var3 = 0; var3 < this.aa_fld; var3++) {
				this.ai_fld[var3] = var1.co();
				this.ad_fld[var3] = xi.kc(var1, 2073671897);
			}
		} else if (7 == var2) {
			this.aa_fld = xi.tx(var1, 637834368);
			this.ai_fld = new int[this.aa_fld];
			this.am_fld = new long[this.aa_fld];

			for (int var4 = 0; var4 < this.aa_fld; var4++) {
				this.ai_fld[var4] = var1.co();
				this.am_fld[var4] = xi.ob(var1, 1523187300);
			}
		} else if (var2 == 6) {
			this.aa_fld = xi.tx(var1, 1160770033);
			this.ai_fld = new int[this.aa_fld];
			this.aq_fld = new int[this.aa_fld];

			for (int var5 = 0; var5 < this.aa_fld; var5++) {
				this.ai_fld[var5] = var1.co();
				this.aq_fld[var5] = var1.co();
			}
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Los;Lxi;I)V"
	)
	public static void ap(os var0, xi var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		} else {
			while (true) {
				int var3 = var1.cg();
				if (0 == var3) {
					return;
				}

				ww(var0, var1, var3, (short)-1738);
			}
		}
	}

	@ObfuscatedName("fq")
	@ObfuscatedSignature(
		descriptor = "(Los;Lxi;I)V"
	)
	public static void fq(os var0, xi var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		if (1 == var2) {
			var0.af_fld = (char)var1.cg();
		} else if (2 == var2) {
			var0.al_fld = (char)var1.cg();
		} else if (3 == var2) {
			var0.au_fld = xi.kc(var1, -2040309780);
		} else if (4 == var2) {
			var0.ax_fld = var1.co();
		} else if (var2 == 8) {
			var0.an_fld = xi.ob(var1, 335148904);
		} else if (5 == var2) {
			var0.aa_fld = xi.tx(var1, 2112739682) * -1612845877;
			var0.ai_fld = new int[var0.aa_fld];
			var0.ad_fld = new String[200162997 * var0.aa_fld];

			for (int var3 = 0; var3 < var0.aa_fld; var3++) {
				var0.ai_fld[var3] = var1.co();
				var0.ad_fld[var3] = xi.kc(var1, -124898660);
			}
		} else if (7 == var2) {
			var0.aa_fld = xi.tx(var1, 1151187644);
			var0.ai_fld = new int[var0.aa_fld];
			var0.am_fld = new long[var0.aa_fld];

			for (int var4 = 0; var4 < var0.aa_fld; var4++) {
				var0.ai_fld[var4] = var1.co();
				var0.am_fld[var4] = xi.ob(var1, -962959792);
			}
		} else if (var2 == 6) {
			var0.aa_fld = xi.tx(var1, 671832998) * 2129660372;
			var0.ai_fld = new int[var0.aa_fld];
			var0.aq_fld = new int[var0.aa_fld];

			for (int var5 = 0; var5 < var0.aa_fld; var5++) {
				var0.ai_fld[var5] = var1.co();
				var0.aq_fld[var5] = var1.co();
			}
		}
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int bj(int var1) {
		for (int var2 = 0; var2 < this.aa_fld; var2++) {
			if (this.ai_fld[var2] == var1) {
				return this.aq_fld[var2];
			}
		}

		return this.ax_fld;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	void am(xi var1) {
		while (true) {
			int var2 = var1.cg();
			if (0 == var2) {
				return;
			}

			ww(this, var1, var2, (short)-5884);
		}
	}

	@ObfuscatedName("getKeys")
	@ObfuscatedSignature(
		descriptor = "()[I"
	)
	@Override
	public int[] getKeys() {
		return this.ai_fld;
	}

	@ObfuscatedName("getStringValue")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;"
	)
	@Override
	public String getStringValue(int var1) {
		int var2 = this.dp(var1);
		return var2 == -1 ? this.au_fld : this.getStringVals()[var2];
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;"
	)
	public String be(int var1) {
		for (int var2 = 0; var2 < this.aa_fld; var2++) {
			if (var1 == this.ai_fld[var2]) {
				return this.ad_fld[var2];
			}
		}

		return this.au_fld;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Los;"
	)
	public static os al(int var0) throws EOFException {
		try {
			os var1 = (os)ar_fld.ak(var0);
			if (var1 != null) {
				return var1;
			} else {
				byte[] var2 = de.as_fld.bb(8, var0, 584982574);
				var1 = new os();
				if (null != var2) {
					ap(var1, new xi(var2), 1329368097);
				}

				ar_fld.az(var1, var0);
				return var1;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "(Los;I)Ljava/lang/String;"
	)
	public static String dt(os var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		for (int var3 = 0; var3 < var0.aa_fld; var3++) {
			if (var1 == var0.ai_fld[var3]) {
				return var0.ad_fld[var3];
			}
		}

		return var0.au_fld;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Los;"
	)
	public static os ax(int var0) throws EOFException {
		try {
			os var1 = (os)ar_fld.ak(var0);
			if (var1 != null) {
				return var1;
			} else {
				byte[] var2 = de.as_fld.bb(8, var0, 584982574);
				var1 = new os();
				if (null != var2) {
					ap(var1, new xi(var2), 1443096208);
				}

				ar_fld.az(var1, var0);
				return var1;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(C)Z"
	)
	public boolean bl(char var1) {
		return var1 == this.af_fld;
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(C)Z"
	)
	public boolean bp(char var1) {
		return this.al_fld == var1;
	}

	@ObfuscatedName("on")
	@ObfuscatedSignature(
		descriptor = "(Los;)Lsl;"
	)
	public static sl on(os var0) {
		if (null == var0.ab_fld) {
			if (1088611326 == var0.al_fld) {
				String[] var2 = var0.ad_fld;
				sl var3 = new sl(yq.az_fld, false);
				var3.as_fld = var2;
				var3.av_fld = -69344095 * var2.length;
				var3.ae_fld = var2.length * -1607029881;
				var0.ab_fld = var3;
			} else if (207 == var0.al_fld) {
				var0.ab_fld = wn.ax(var0.am_fld);
			} else {
				var0.ab_fld = pm.au(var0.aq_fld);
			}
		}

		return var0.ab_fld;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(C)Z"
	)
	public boolean bt(char var1) {
		return this.al_fld == var1;
	}

	@ObfuscatedName("wn")
	@ObfuscatedSignature(
		descriptor = "(Los;Lxi;)V"
	)
	public static void wn(os var0, xi var1) {
		if (var0 == null) {
			var0.getClass();
		}

		while (true) {
			int var2 = var1.cg();
			if (0 == var2) {
				return;
			}

			ww(var0, var1, var2, (short)-28050);
		}
	}

	@ObfuscatedName("ww")
	@ObfuscatedSignature(
		descriptor = "(Los;Lxi;IS)V"
	)
	public static void ww(os var0, xi var1, int var2, short var3) {
		if (var0 == null) {
			var0.getClass();
		}

		if (1 == var2) {
			var0.af_fld = (char)var1.cg();
		} else if (2 == var2) {
			var0.al_fld = (char)var1.cg();
		} else if (3 == var2) {
			var0.au_fld = xi.kc(var1, 974668829);
		} else if (4 == var2) {
			var0.ax_fld = var1.co();
		} else if (var2 == 8) {
			if (var3 >= 250) {
				return;
			}

			var0.an_fld = xi.ob(var1, -1008731236);
		} else if (5 == var2) {
			var0.aa_fld = xi.tx(var1, 2037128259);
			var0.ai_fld = new int[var0.aa_fld];
			var0.ad_fld = new String[var0.aa_fld];

			for (int var4 = 0; var4 < var0.aa_fld; var4++) {
				var0.ai_fld[var4] = var1.co();
				var0.ad_fld[var4] = xi.kc(var1, -1186816648);
			}
		} else if (7 == var2) {
			if (var3 >= 250) {
				return;
			}

			var0.aa_fld = xi.tx(var1, 1965872738);
			var0.ai_fld = new int[var0.aa_fld];
			var0.am_fld = new long[var0.aa_fld];

			for (int var5 = 0; var5 < var0.aa_fld; var5++) {
				if (var3 >= 250) {
					return;
				}

				var0.ai_fld[var5] = var1.co();
				var0.am_fld[var5] = xi.ob(var1, 626991918);
			}
		} else if (var2 == 6) {
			var0.aa_fld = xi.tx(var1, 699394508);
			var0.ai_fld = new int[var0.aa_fld];
			var0.aq_fld = new int[var0.aa_fld];

			for (int var6 = 0; var6 < var0.aa_fld; var6++) {
				var0.ai_fld[var6] = var1.co();
				var0.aq_fld[var6] = var1.co();
			}
		}
	}

	@ObfuscatedName("getIntValue")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	@Override
	public int getIntValue(int var1) {
		int var2 = this.dp(var1);
		return var2 == -1 ? this.ax_fld : this.getIntVals()[var2];
	}

	@ObfuscatedName("getIntVals")
	@ObfuscatedSignature(
		descriptor = "()[I"
	)
	@Override
	public int[] getIntVals() {
		return this.aq_fld;
	}

	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int dp(int var1) {
		int[] var2 = this.getKeys();
		if (var2 == null) {
			return -1;
		} else {
			for (int var3 = 0; var3 < var2.length; var3++) {
				if (var2[var3] == var1) {
					return var3;
				}
			}

			return -1;
		}
	}

	@ObfuscatedName("lf")
	@ObfuscatedSignature(
		descriptor = "(Los;C)Z"
	)
	public static boolean lf(os var0, char var1) {
		return var1 == var0.af_fld;
	}

	@ObfuscatedName("yd")
	@ObfuscatedSignature(
		descriptor = "(Los;C)Z"
	)
	public static boolean yd(os var0, char var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var1 == var0.af_fld;
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(C)Z"
	)
	public boolean bv(char var1) {
		return this.al_fld == var1;
	}

	@ObfuscatedName("uz")
	@ObfuscatedSignature(
		descriptor = "(Los;)Lsl;"
	)
	public static sl uz(os var0) {
		if (null == var0.ab_fld) {
			if ('s' == var0.al_fld) {
				String[] var2 = var0.ad_fld;
				sl var3 = new sl(yq.az_fld, false);
				var3.as_fld = var2;
				var3.av_fld = -69344095 * var2.length;
				var3.ae_fld = var2.length;
				var0.ab_fld = var3;
			} else if (207 == var0.al_fld) {
				var0.ab_fld = wn.ax(var0.am_fld);
			} else {
				var0.ab_fld = pm.au(var0.aq_fld);
			}
		}

		return var0.ab_fld;
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)J"
	)
	public long by(int var1) {
		for (int var2 = 0; var2 < this.aa_fld; var2++) {
			if (this.ai_fld[var2] == var1) {
				return this.am_fld[var2];
			}
		}

		return this.an_fld;
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int bk(int var1) {
		for (int var2 = 0; var2 < this.aa_fld; var2++) {
			if (this.aq_fld[var2] == var1) {
				return this.ai_fld[var2];
			}
		}

		return this.ax_fld;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	void ap(xi var1, int var2) {
		while (true) {
			int var3 = var1.ei();
			if (0 == var3) {
				return;
			}

			ww(this, var1, var3, (short)-1738);
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Lsl;"
	)
	public sl ae(int var1) {
		if (null == this.ao_fld) {
			this.ao_fld = pm.au(this.ai_fld);
		}

		return this.ao_fld;
	}

	@ObfuscatedName("size")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int size() {
		return this.aa_fld;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Lsl;"
	)
	public sl ah(int var1) {
		if (null == this.ao_fld) {
			if ('s' == this.al_fld) {
				String[] var3 = this.ad_fld;
				sl var4 = new sl(yq.ak_fld, false);
				var4.as_fld = var3;
				var4.ae_fld = -69344095 * var3.length;
				var4.ae_fld = var3.length;
				this.ao_fld = var4;
			} else if (207 == this.af_fld) {
				this.ab_fld = wn.ax(this.am_fld);
			} else {
				this.ab_fld = pm.au(this.aq_fld);
			}
		}

		return this.ao_fld;
	}

	@ObfuscatedName("oe")
	@ObfuscatedSignature(
		descriptor = "(Los;Lxi;I)V"
	)
	public static void oe(os var0, xi var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		if (1 == var2) {
			var0.af_fld = (char)var1.cg();
		} else if (2 == var2) {
			var0.al_fld = (char)var1.cg();
		} else if (3 == var2) {
			var0.au_fld = xi.kc(var1, -766924872);
		} else if (4 == var2) {
			var0.ax_fld = var1.co() * -183747864;
		} else if (var2 == 8) {
			var0.an_fld = xi.ob(var1, 891545013);
		} else if (5 == var2) {
			var0.aa_fld = xi.tx(var1, 627801866) * 1885979620;
			var0.ai_fld = new int[-1511774291 * var0.aa_fld];
			var0.ad_fld = new String[-305348914 * var0.aa_fld];

			for (int var3 = 0; var3 < var0.aa_fld; var3++) {
				var0.ai_fld[var3] = var1.co();
				var0.ad_fld[var3] = xi.kc(var1, 1962335756);
			}
		} else if (7 == var2) {
			var0.aa_fld = xi.tx(var1, 1012561527) * -37127071;
			var0.ai_fld = new int[var0.aa_fld];
			var0.am_fld = new long[var0.aa_fld];

			for (int var4 = 0; var4 < var0.aa_fld; var4++) {
				var0.ai_fld[var4] = var1.co();
				var0.am_fld[var4] = xi.ob(var1, -1263797909);
			}
		} else if (var2 == 6) {
			var0.aa_fld = xi.tx(var1, 1512913245) * -1593615186;
			var0.ai_fld = new int[var0.aa_fld];
			var0.aq_fld = new int[var0.aa_fld];

			for (int var5 = 0; var5 < var0.aa_fld; var5++) {
				var0.ai_fld[var5] = var1.co();
				var0.aq_fld[var5] = var1.co();
			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;"
	)
	public String aw(int var1, int var2) {
		for (int var3 = 0; var3 < this.aa_fld; var3++) {
			if (var1 == this.aq_fld[var3]) {
				return this.ad_fld[var3];
			}
		}

		return this.au_fld;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IB)J"
	)
	public long as(int var1, byte var2) {
		for (int var3 = 0; var3 < this.ax_fld; var3++) {
			if (this.aq_fld[var3] == var1) {
				return this.am_fld[var3];
			}
		}

		return this.an_fld;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(CB)Z"
	)
	public boolean af(char var1, byte var2) {
		return this.al_fld == var1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lxi;IS)V"
	)
	void az(xi var1, int var2, short var3) {
		if (1 == var2) {
			this.af_fld = (char)var1.dz();
		} else if (2 == var2) {
			this.af_fld = (char)var1.do_();
		} else if (3 == var2) {
			this.au_fld = xi.kc(var1, 974668829);
		} else if (4 == var2) {
			this.ax_fld = var1.cg();
		} else if (var2 == 8) {
			if (var3 >= 250) {
				return;
			}

			this.an_fld = xi.ob(var1, -1008731236);
		} else if (5 == var2) {
			this.aa_fld = xi.tx(var1, 2037128259);
			this.aq_fld = new int[-1780631415 * this.ax_fld];
			this.ad_fld = new String[-1780631415 * this.ax_fld];

			for (int var4 = 0; var4 < this.aa_fld; var4++) {
				this.ai_fld[var4] = var1.em();
				this.ad_fld[var4] = xi.kc(var1, -1186816648);
			}
		} else if (7 == var2) {
			if (var3 >= 250) {
				return;
			}

			this.aa_fld = xi.tx(var1, 1965872738);
			this.aq_fld = new int[this.ax_fld * -1780631415];
			this.am_fld = new long[this.aa_fld];

			for (int var5 = 0; var5 < this.ax_fld; var5++) {
				if (var3 >= 250) {
					return;
				}

				this.aq_fld[var5] = var1.ei();
				this.am_fld[var5] = xi.ob(var1, 626991918);
			}
		} else if (var2 == 6) {
			this.ax_fld = xi.tx(var1, 699394508) * 572865977;
			this.ai_fld = new int[-1780631415 * this.ax_fld];
			this.ai_fld = new int[-1780631415 * this.ax_fld];

			for (int var6 = 0; var6 < this.aa_fld; var6++) {
				this.ai_fld[var6] = var1.em();
				this.ai_fld[var6] = var1.cg();
			}
		}
	}
}
