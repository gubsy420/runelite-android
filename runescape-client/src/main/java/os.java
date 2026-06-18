import java.io.EOFException;
import net.runelite.api.EnumComposition;
import net.runelite.api.annotations.Export;
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
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	@ObfuscatedGetter(
		longValue = -4290715676318482629L
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
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1741812539
	)
	int ax_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int av_fld;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1780631415
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

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int bk(int var1) {
		for (int var2 = 0; var2 < this.aa_fld; var2++) {
			if (this.ai_fld[var2] == var1) {
				return this.aq_fld[var2];
			}
		}

		return this.ax_fld;
	}

	@ObfuscatedName("getLongVals")
	@ObfuscatedSignature(
		descriptor = "()[J"
	)
	@Export("getLongVals")
	@Override
	public long[] getLongVals() {
		return this.am_fld;
	}

	@ObfuscatedName("ov")
	@ObfuscatedSignature(
		descriptor = "(Lli;I)V"
	)
	public static void ov(li var0, int var1) {
		var0.am_fld.aw(var1);
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
			this.au_fld = xi.at(var1, -949069593);
		} else if (4 == var2) {
			this.ax_fld = var1.co((byte)-110);
		} else if (var2 == 8) {
			this.an_fld = var1.cu();
		} else if (5 == var2) {
			this.aa_fld = var1.cm();
			this.ai_fld = new int[this.aa_fld];
			this.ad_fld = new String[this.aa_fld];

			for (int var3 = 0; var3 < this.aa_fld; var3++) {
				this.ai_fld[var3] = var1.co((byte)-49);
				this.ad_fld[var3] = xi.at(var1, 376129495);
			}
		} else if (7 == var2) {
			this.aa_fld = var1.cm();
			this.ai_fld = new int[this.aa_fld];
			this.am_fld = new long[this.aa_fld];

			for (int var4 = 0; var4 < this.aa_fld; var4++) {
				this.ai_fld[var4] = var1.co((byte)-104);
				this.am_fld[var4] = var1.cu();
			}
		} else if (var2 == 6) {
			this.aa_fld = var1.cm();
			this.ai_fld = new int[this.aa_fld];
			this.aq_fld = new int[this.aa_fld];

			for (int var5 = 0; var5 < this.aa_fld; var5++) {
				this.ai_fld[var5] = var1.co((byte)-79);
				this.aq_fld[var5] = var1.co((byte)-27);
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int av(int var1) {
		return this.aa_fld;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Lsl;"
	)
	public sl ah(int var1) {
		if (null == this.ao_fld) {
			this.ao_fld = pm.au(this.ai_fld);
		}

		return this.ao_fld;
	}

	@ObfuscatedName("getStringVals")
	@ObfuscatedSignature(
		descriptor = "()[Ljava/lang/String;"
	)
	@Export("getStringVals")
	@Override
	public String[] getStringVals() {
		return this.ad_fld;
	}

	@ObfuscatedName("getStringValue")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;"
	)
	@Export("getStringValue")
	@Override
	public String getStringValue(int var1) {
		int var2 = this.ys(var1);
		return var2 == -1 ? this.au_fld : this.getStringVals()[var2];
	}

	@ObfuscatedName("getKeys")
	@ObfuscatedSignature(
		descriptor = "()[I"
	)
	@Export("getKeys")
	@Override
	public int[] getKeys() {
		return this.ai_fld;
	}

	@ObfuscatedName("uw")
	@ObfuscatedSignature(
		descriptor = "(Los;II)Ljava/lang/String;"
	)
	public static String uw(os var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			for (int var3 = 0; var3 < var0.aa_fld; var3++) {
				if (var1 == var0.ai_fld[var3]) {
					return var0.ad_fld[var3];
				}
			}

			return var0.au_fld;
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

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IB)J"
	)
	public long as(int var1, byte var2) {
		for (int var3 = 0; var3 < this.aa_fld; var3++) {
			if (this.ai_fld[var3] == var1) {
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
			this.af_fld = (char)var1.cg();
		} else if (2 == var2) {
			this.al_fld = (char)var1.cg();
		} else if (3 == var2) {
			this.au_fld = xi.at(var1, 974668829);
		} else if (4 == var2) {
			this.ax_fld = var1.co((byte)2);
		} else if (var2 == 8) {
			if (var3 >= 250) {
				return;
			}

			this.an_fld = var1.cu();
		} else if (5 == var2) {
			this.aa_fld = var1.cm();
			this.ai_fld = new int[this.aa_fld];
			this.ad_fld = new String[this.aa_fld];

			for (int var4 = 0; var4 < this.aa_fld; var4++) {
				this.ai_fld[var4] = var1.co((byte)-103);
				this.ad_fld[var4] = xi.at(var1, -1186816648);
			}
		} else if (7 == var2) {
			if (var3 >= 250) {
				return;
			}

			this.aa_fld = var1.cm();
			this.ai_fld = new int[this.aa_fld];
			this.am_fld = new long[this.aa_fld];

			for (int var5 = 0; var5 < this.aa_fld; var5++) {
				if (var3 >= 250) {
					return;
				}

				this.ai_fld[var5] = var1.co((byte)-77);
				this.am_fld[var5] = var1.cu();
			}
		} else if (var2 == 6) {
			this.aa_fld = var1.cm();
			this.ai_fld = new int[this.aa_fld];
			this.aq_fld = new int[this.aa_fld];

			for (int var6 = 0; var6 < this.aa_fld; var6++) {
				this.ai_fld[var6] = var1.co((byte)-106);
				this.aq_fld[var6] = var1.co((byte)-37);
			}
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
					ev(var1, new xi(var2), 1255130025);
				}

				ar_fld.az(var1, var0);
				return var1;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	void aq(xi var1) {
		while (true) {
			int var2 = var1.cg();
			if (0 == var2) {
				return;
			}

			this.az(var1, var2, (short)-28050);
		}
	}

	@ObfuscatedName("fe")
	@ObfuscatedSignature(
		descriptor = "(Los;I)Lsl;"
	)
	public static sl fe(os var0, int var1) {
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

			this.az(var1, var2, (short)-24850);
		}
	}

	@ObfuscatedName("ye")
	@ObfuscatedSignature(
		descriptor = "(Los;Lxi;I)V"
	)
	public static void ye(os var0, xi var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		} else {
			if (1 == var2) {
				var0.af_fld = (char)var1.cg();
			} else if (2 == var2) {
				var0.al_fld = (char)var1.cg();
			} else if (3 == var2) {
				var0.au_fld = xi.at(var1, -2040309780);
			} else if (4 == var2) {
				var0.ax_fld = var1.co((byte)-125);
			} else if (var2 == 8) {
				var0.an_fld = var1.cu();
			} else if (5 == var2) {
				var0.aa_fld = var1.cm() * -1612845877;
				var0.ai_fld = new int[var0.aa_fld];
				var0.ad_fld = new String[200162997 * var0.aa_fld];

				for (int var3 = 0; var3 < var0.aa_fld; var3++) {
					var0.ai_fld[var3] = var1.co((byte)-90);
					var0.ad_fld[var3] = xi.at(var1, -124898660);
				}
			} else if (7 == var2) {
				var0.aa_fld = var1.cm();
				var0.ai_fld = new int[var0.aa_fld];
				var0.am_fld = new long[var0.aa_fld];

				for (int var4 = 0; var4 < var0.aa_fld; var4++) {
					var0.ai_fld[var4] = var1.co((byte)-107);
					var0.am_fld[var4] = var1.cu();
				}
			} else if (var2 == 6) {
				var0.aa_fld = var1.cm() * 2129660372;
				var0.ai_fld = new int[var0.aa_fld];
				var0.aq_fld = new int[var0.aa_fld];

				for (int var5 = 0; var5 < var0.aa_fld; var5++) {
					var0.ai_fld[var5] = var1.co((byte)-64);
					var0.aq_fld[var5] = var1.co((byte)-111);
				}
			}
		}
	}

	@ObfuscatedName("xn")
	@ObfuscatedSignature(
		descriptor = "(Los;CI)Z"
	)
	public static boolean xn(os var0, char var1, int var2) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var1 == var0.af_fld;
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	void aa(xi var1) {
		while (true) {
			int var2 = var1.cg();
			if (0 == var2) {
				return;
			}

			this.az(var1, var2, (short)-24539);
		}
	}

	os() {
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "()Lsl;"
	)
	public sl bd() {
		if (null == this.ab_fld) {
			if ('s' == this.al_fld) {
				String[] var2 = this.ad_fld;
				sl var3 = new sl(yq.az_fld, false);
				var3.as_fld = var2;
				var3.av_fld = -69344095 * var2.length;
				var3.ae_fld = var2.length;
				this.ab_fld = var3;
			} else if (207 == this.al_fld) {
				this.ab_fld = wn.ax(this.am_fld);
			} else {
				this.ab_fld = pm.au(this.aq_fld);
			}
		}

		return this.ab_fld;
	}

	@ObfuscatedName("getLongValue")
	@ObfuscatedSignature(
		descriptor = "(I)J"
	)
	@Export("getLongValue")
	@Override
	public long getLongValue(int var1) {
		int var2 = this.ys(var1);
		return var2 == -1 ? this.an_fld : this.getLongVals()[var2];
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)[Lll;"
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

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	void ab(xi var1, int var2) {
		if (1 == var2) {
			this.af_fld = (char)var1.cg();
		} else if (2 == var2) {
			this.al_fld = (char)var1.cg();
		} else if (3 == var2) {
			this.au_fld = xi.at(var1, 1090866712);
		} else if (4 == var2) {
			this.ax_fld = var1.co((byte)-38);
		} else if (var2 == 8) {
			this.an_fld = var1.cu();
		} else if (5 == var2) {
			this.aa_fld = var1.cm() * 800807727;
			this.ai_fld = new int[this.aa_fld];
			this.ad_fld = new String[this.aa_fld];

			for (int var3 = 0; var3 < this.aa_fld; var3++) {
				this.ai_fld[var3] = var1.co((byte)-128);
				this.ad_fld[var3] = xi.at(var1, -673613330);
			}
		} else if (7 == var2) {
			this.aa_fld = var1.cm() * -2033084283;
			this.ai_fld = new int[this.aa_fld];
			this.am_fld = new long[this.aa_fld];

			for (int var4 = 0; var4 < this.aa_fld; var4++) {
				this.ai_fld[var4] = var1.co((byte)-29);
				this.am_fld[var4] = var1.cu();
			}
		} else if (var2 == 6) {
			this.aa_fld = var1.cm() * 339629167;
			this.ai_fld = new int[this.aa_fld];
			this.aq_fld = new int[-604483111 * this.aa_fld];

			for (int var5 = 0; var5 < this.aa_fld; var5++) {
				this.ai_fld[var5] = var1.co((byte)-92);
				this.aq_fld[var5] = var1.co((byte)-23);
			}
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ac() {
		return this.aa_fld;
	}

	@ObfuscatedName("getIntValue")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	@Export("getIntValue")
	@Override
	public int getIntValue(int var1) {
		int var2 = this.ys(var1);
		return var2 == -1 ? this.ax_fld : this.getIntVals()[var2];
	}

	@ObfuscatedName("er")
	@ObfuscatedSignature(
		descriptor = "(Los;I)I"
	)
	public static int er(os var0, int var1) {
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

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int aj() {
		return this.aa_fld;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	void ad(xi var1, int var2) {
		if (1 == var2) {
			this.af_fld = (char)var1.cg();
		} else if (2 == var2) {
			this.al_fld = (char)var1.cg();
		} else if (3 == var2) {
			this.au_fld = xi.at(var1, 566856250);
		} else if (4 == var2) {
			this.ax_fld = var1.co((byte)-11);
		} else if (var2 == 8) {
			this.an_fld = var1.cu();
		} else if (5 == var2) {
			this.aa_fld = var1.cm();
			this.ai_fld = new int[this.aa_fld];
			this.ad_fld = new String[this.aa_fld];

			for (int var3 = 0; var3 < this.aa_fld; var3++) {
				this.ai_fld[var3] = var1.co((byte)-114);
				this.ad_fld[var3] = xi.at(var1, 2073671897);
			}
		} else if (7 == var2) {
			this.aa_fld = var1.cm();
			this.ai_fld = new int[this.aa_fld];
			this.am_fld = new long[this.aa_fld];

			for (int var4 = 0; var4 < this.aa_fld; var4++) {
				this.ai_fld[var4] = var1.co((byte)-75);
				this.am_fld[var4] = var1.cu();
			}
		} else if (var2 == 6) {
			this.aa_fld = var1.cm();
			this.ai_fld = new int[this.aa_fld];
			this.aq_fld = new int[this.aa_fld];

			for (int var5 = 0; var5 < this.aa_fld; var5++) {
				this.ai_fld[var5] = var1.co((byte)-109);
				this.aq_fld[var5] = var1.co((byte)-33);
			}
		}
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

			this.az(var1, var2, (short)-5884);
		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int bs(int var1) {
		for (int var2 = 0; var2 < this.aa_fld; var2++) {
			if (this.ai_fld[var2] == var1) {
				return this.aq_fld[var2];
			}
		}

		return this.ax_fld;
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
					ev(var1, new xi(var2), 1329368097);
				}

				ar_fld.az(var1, var0);
				return var1;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
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
					ev(var1, new xi(var2), 1443096208);
				}

				ar_fld.az(var1, var0);
				return var1;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
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
			this.au_fld = xi.at(var1, -766924872);
		} else if (4 == var2) {
			this.ax_fld = var1.co((byte)-3) * -183747864;
		} else if (var2 == 8) {
			this.an_fld = var1.cu();
		} else if (5 == var2) {
			this.aa_fld = var1.cm() * 1885979620;
			this.ai_fld = new int[-1511774291 * this.aa_fld];
			this.ad_fld = new String[-305348914 * this.aa_fld];

			for (int var3 = 0; var3 < this.aa_fld; var3++) {
				this.ai_fld[var3] = var1.co((byte)-125);
				this.ad_fld[var3] = xi.at(var1, 1962335756);
			}
		} else if (7 == var2) {
			this.aa_fld = var1.cm() * -37127071;
			this.ai_fld = new int[this.aa_fld];
			this.am_fld = new long[this.aa_fld];

			for (int var4 = 0; var4 < this.aa_fld; var4++) {
				this.ai_fld[var4] = var1.co((byte)-46);
				this.am_fld[var4] = var1.cu();
			}
		} else if (var2 == 6) {
			this.aa_fld = var1.cm() * -1593615186;
			this.ai_fld = new int[this.aa_fld];
			this.aq_fld = new int[this.aa_fld];

			for (int var5 = 0; var5 < this.aa_fld; var5++) {
				this.ai_fld[var5] = var1.co((byte)-63);
				this.aq_fld[var5] = var1.co((byte)-98);
			}
		}
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "()Lsl;"
	)
	public sl bz() {
		if (null == this.ab_fld) {
			if (1088611326 == this.al_fld) {
				String[] var2 = this.ad_fld;
				sl var3 = new sl(yq.az_fld, false);
				var3.as_fld = var2;
				var3.av_fld = -69344095 * var2.length;
				var3.ae_fld = var2.length * -1607029881;
				this.ab_fld = var3;
			} else if (207 == this.al_fld) {
				this.ab_fld = wn.ax(this.am_fld);
			} else {
				this.ab_fld = pm.au(this.aq_fld);
			}
		}

		return this.ab_fld;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(C)Z"
	)
	public boolean bl(char var1) {
		return var1 == this.af_fld;
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(C)Z"
	)
	public boolean bx(char var1) {
		return var1 == this.af_fld;
	}

	@ObfuscatedName("ev")
	@ObfuscatedSignature(
		descriptor = "(Los;Lxi;I)V"
	)
	public static void ev(os var0, xi var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		} else {
			while (true) {
				int var3 = var1.cg();
				if (0 == var3) {
					return;
				}

				var0.az(var1, var3, (short)-1738);
			}
		}
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(C)Z"
	)
	public boolean bo(char var1) {
		return var1 == this.af_fld;
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(C)Z"
	)
	public boolean bp(char var1) {
		return this.al_fld == var1;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(C)Z"
	)
	public boolean bt(char var1) {
		return this.al_fld == var1;
	}

	@ObfuscatedName("ys")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int ys(int var1) {
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

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(C)Z"
	)
	public boolean bv(char var1) {
		return this.al_fld == var1;
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

	@ObfuscatedName("getIntVals")
	@ObfuscatedSignature(
		descriptor = "()[I"
	)
	@Export("getIntVals")
	@Override
	public int[] getIntVals() {
		return this.aq_fld;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	void ap(xi var1, int var2) {
		while (true) {
			int var3 = var1.dz();
			if (0 == var3) {
				return;
			}

			this.az(var1, var3, (short)-1738);
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Lsl;"
	)
	public sl ae(int var1) {
		if (null == this.ao_fld) {
			if ('s' == this.af_fld) {
				String[] var3 = this.ad_fld;
				sl var4 = new sl(yq.ak_fld, false);
				var4.as_fld = var3;
				var4.av_fld = -69344095 * var3.length;
				var4.av_fld = var3.length * -1841794027;
				this.ao_fld = var4;
			} else if (207 == this.al_fld) {
				this.ab_fld = wn.ax(this.am_fld);
			} else {
				this.ab_fld = pm.au(this.ai_fld);
			}
		}

		return this.ao_fld;
	}

	@ObfuscatedName("size")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("size")
	@Override
	public int size() {
		return this.aa_fld;
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

	@ObfuscatedName("rz")
	@ObfuscatedSignature(
		descriptor = "(Lda;)V"
	)
	public static void rz(da var0) {
		bb.pn(var0.cg_fld, (byte)112);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(CI)Z"
	)
	public boolean ar(char var1, int var2) {
		return var1 == this.af_fld;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;"
	)
	public String br(int var1) {
		int var2 = this.bh(var1);
		return var2 == -1 ? this.au_fld : this.getStringVals()[var2];
	}
}
