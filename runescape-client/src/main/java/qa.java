import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;
import net.runelite.api.events.AnimationChanged;

@ObfuscatedName("qa")
public class qa {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ak_fld;
	@ObfuscatedName("iw")
	@ObfuscatedSignature(
		descriptor = "Lqa;"
	)
	public static qa iw_fld = new qa();
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1
	)
	int ag_fld = 1457597965;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	ol az_fld = null;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1668710195
	)
	int av_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 249909987
	)
	int ae_fld = -1085309643;
	@ObfuscatedName("he")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	public da he_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1
	)
	int ah_fld = 0;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1
	)
	int aw_fld = 0;

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int bw() {
		return this.ag_fld;
	}

	@ObfuscatedName("ue")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void ue(int var1) throws EOFException {
		hs(this, var1, -1465097885);
	}

	@ObfuscatedName("qn")
	@ObfuscatedSignature(
		descriptor = "(Lqa;I)V"
	)
	public static void qn(qa var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ah_fld = 0;
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void bv() {
		this.ae_fld = 0;
		this.av_fld = 0;
		this.ah_fld = 0;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int aw(int var1) {
		return this.ae_fld;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int ay() {
		return this.av_fld;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int as() {
		return this.ah_fld;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int bl() {
		return this.ah_fld;
	}

	@ObfuscatedName("no")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void no(int var1) {
		if (this.he_fld != null) {
			if (da.nx_fld) {
				this.he_fld.tc_fld = (byte)(this.he_fld.tc_fld | 2);
			} else {
				AnimationChanged var2 = new AnimationChanged();
				var2.setActor(this.he_fld);
				og.ci_fld.getCallbacks().post(var2);
			}
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int al() {
		return this.aw_fld;
	}

	@ObfuscatedName("ym")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void ym(int var1, int var2, int var3) {
		this.aa(var1, var2, var3);
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "()Lol;"
	)
	public ol br() {
		return this.az_fld;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean an() throws EOFException {
		return null == this.az_fld || this.az_fld.ao((byte)-114);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V"
	)
	void aa(int var1, int var2, int var3) {
		this.ae_fld = var1;
		this.av_fld = var2;
		this.ah_fld = -1189872463 * var3;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void aq() {
		if (this.az_fld != null) {
			if (!this.az_fld.aa(1716803727)) {
				this.ae_fld = (int)(Math.random() * this.az_fld.bk_fld.length);
				this.av_fld = (int)(Math.random() * this.az_fld.bf_fld[this.ae_fld]);
			} else {
				this.ae_fld = (int)(Math.random() * this.az_fld.ai(-1509908899));
			}
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lqa;)V"
	)
	public void am(qa var1) {
		this.az_fld = var1.az_fld;
		this.ag_fld = var1.ag_fld;
		this.av_fld = 1 * var1.av_fld;
		this.ae_fld = 1 * var1.ae_fld;
		this.ah_fld = var1.ah_fld;
		this.aw_fld = var1.aw_fld;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lqa;)V"
	)
	public void ao(qa var1) {
		this.az_fld = var1.az_fld;
		this.ag_fld = var1.ag_fld;
		this.av_fld = 1 * var1.av_fld;
		this.ae_fld = 1 * var1.ae_fld;
		this.ah_fld = var1.ah_fld;
		this.aw_fld = var1.aw_fld;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lqa;)V"
	)
	public void ab(qa var1) {
		this.az_fld = var1.az_fld;
		this.ag_fld = var1.ag_fld;
		this.av_fld = 1 * var1.av_fld;
		this.ae_fld = 1 * var1.ae_fld;
		this.ah_fld = var1.ah_fld;
		this.aw_fld = var1.aw_fld;
	}

	@ObfuscatedName("os")
	@ObfuscatedSignature(
		descriptor = "(Lqa;I)Z"
	)
	public static boolean os(qa var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return jv(var0, 716743426) && var0.aw_fld * 1923491099 > 0 && var0.aw_fld < var1;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ap() throws EOFException {
		hs(this, -1, 1387115373);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void at() throws EOFException {
		hs(this, -1, -771801305);
	}

	public qa() {
	}

	@ObfuscatedName("oi")
	@ObfuscatedSignature(
		descriptor = "(Lma;)I"
	)
	public static int oi(ma var0) {
		return var0.al_fld;
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int bc() {
		return this.av_fld;
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean cq() {
		return null != this.az_fld;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean bm() {
		return null != this.az_fld;
	}

	@ObfuscatedName("jv")
	@ObfuscatedSignature(
		descriptor = "(Lqa;I)Z"
	)
	public static boolean jv(qa var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return null != var0.az_fld;
		}
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean cc(int var1) {
		return jv(this, 323221736) && this.aw_fld * -1663890330 > 0 && this.aw_fld < var1;
	}

	@ObfuscatedName("ka")
	@ObfuscatedSignature(
		descriptor = "(Lqa;)I"
	)
	public static int ka(qa var0) {
		return var0.ah_fld;
	}

	@ObfuscatedName("oo")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void oo() throws EOFException {
		gr(this, -94627265);
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "()Lol;"
	)
	public ol be() {
		return this.az_fld;
	}

	@ObfuscatedName("ej")
	@ObfuscatedSignature(
		descriptor = "(B)Z"
	)
	static final boolean ej() {
		return client.ng_fld;
	}

	@ObfuscatedName("kw")
	@ObfuscatedSignature(
		descriptor = "(Lqa;I)Lol;"
	)
	public static ol kw(qa var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.az_fld;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int bs() {
		return this.ag_fld;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int bf() {
		return this.ae_fld;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int bh() {
		return this.ae_fld;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void aj(int var1) throws EOFException {
		if (var1 >= 0) {
			if (this.ag_fld != var1) {
				this.ag_fld = var1 * -1457597965;
				this.az_fld = hm.ak(var1);
				this.aw_fld = 0;
				if (-1 == this.ae_fld) {
					this.ae_fld = 0;
				}
			}
		} else {
			this.ag_fld = 1457597965;
			this.az_fld = null;
			this.ae_fld = -1085309643;
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	public boolean ax(int var1) {
		return jv(this, 1079594790) && this.aw_fld * 1923491099 > 0 && this.aw_fld < var1;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void bo() {
		this.ae_fld = 0;
		this.av_fld = 0;
		this.ah_fld = 0;
	}

	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		descriptor = "(Lqa;II)V"
	)
	public static void hs(qa var0, int var1, int var2) throws EOFException {
		if (var0 == null) {
			var0.getClass();
		} else {
			if (var1 >= 0) {
				if (var2 == 1557095087) {
					var0.no(var1);
					return;
				}

				if (var0.ag_fld != var1) {
					var0.ag_fld = var1 * -1457597965;
					var0.az_fld = hm.ak(var1);
					var0.aw_fld = 0;
					if (-1 == var0.ae_fld) {
						var0.ae_fld = 0;
					}
				}
			} else {
				var0.ag_fld = 1457597965;
				var0.az_fld = null;
				var0.ae_fld = -1085309643;
			}

			var0.no(var1);
		}
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void bt() {
		this.ae_fld = 0;
		this.av_fld = 0;
		this.ah_fld = 0;
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void bu() {
		this.ah_fld = 0;
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int bk() {
		return this.aw_fld;
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "([BIIB)I"
	)
	public static int bi(byte[] var0, int var1, int var2) {
		int var4 = -1;

		for (int var5 = var1; var5 < var2; var5++) {
			var4 = var4 >>> 8 ^ xi.af_fld[(var4 ^ var0[var5]) & 0xFF];
		}

		return ~var4;
	}

	@ObfuscatedName("vg")
	@ObfuscatedSignature(
		descriptor = "(Lqa;)V"
	)
	public static void vg(qa var0) {
		if (var0.az_fld != null) {
			if (!var0.az_fld.aa(1879597650)) {
				var0.ae_fld = (int)(Math.random() * var0.az_fld.bk_fld.length);
				var0.av_fld = (int)(Math.random() * var0.az_fld.bf_fld[var0.ae_fld]);
			} else {
				var0.ae_fld = (int)(Math.random() * var0.az_fld.ai(-1509908899));
			}
		}
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void bq(int var1) {
		this.aw_fld = var1 * -1036067443;
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean bb(int var1) {
		return jv(this, -1629519098) && this.aw_fld * 1923064185 > 0 && this.aw_fld < var1;
	}

	@ObfuscatedName("gr")
	@ObfuscatedSignature(
		descriptor = "(Lqa;I)V"
	)
	public static void gr(qa var0, int var1) throws EOFException {
		if (var0 == null) {
			var0.getClass();
		}

		hs(var0, -1, 406376876);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void ar(int var1) {
		this.ae_fld = 0;
		this.av_fld = 0;
		this.ah_fld = 0;
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	void cv(int var1, int var2, int var3) {
		this.ae_fld = var1;
		this.av_fld = var2;
		this.ah_fld = -1189872463 * var3;
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	void cy(int var1, int var2, int var3) {
		this.ae_fld = var1;
		this.av_fld = var2;
		this.ah_fld = -1189872463 * var3;
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	void cf(int var1, int var2, int var3) {
		this.ae_fld = var1;
		this.av_fld = var2;
		this.ah_fld = -1189872463 * var3;
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	void cx(int var1, int var2, int var3) {
		this.ae_fld = 1246511355 * var1;
		this.av_fld = var2;
		this.ah_fld = -1189872463 * var3;
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void cs(int var1, int var2) {
		this.ae_fld = 1268199844 * var1;
		this.ah_fld = var2 * -1189872463;
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void cp(int var1, int var2) {
		this.ae_fld = var1;
		this.ah_fld = var2 * -1189872463;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int bj() {
		return this.aw_fld;
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void cr() {
		if (this.az_fld != null) {
			if (!this.az_fld.aa(-1410798403)) {
				this.ae_fld = (int)(Math.random() * this.az_fld.bk_fld.length);
				this.av_fld = (int)(Math.random() * this.az_fld.bf_fld[this.ae_fld]);
			} else {
				this.ae_fld = (int)(Math.random() * this.az_fld.ai(-1509908899));
			}
		}
	}

	@ObfuscatedName("gl")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean gl(int var1) {
		return this.ax(var1);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lqa;I)V"
	)
	public void ak(qa var1) {
		this.az_fld = var1.az_fld;
		this.ag_fld = var1.ag_fld;
		this.av_fld = 1 * var1.av_fld;
		this.ae_fld = 1 * var1.ae_fld;
		this.ah_fld = var1.ah_fld;
		this.aw_fld = var1.aw_fld;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lqa;)V"
	)
	public void ad(qa var1) {
		this.az_fld = var1.az_fld;
		this.ag_fld = var1.ag_fld;
		this.av_fld = 1 * var1.av_fld;
		this.ae_fld = 1 * var1.ae_fld;
		this.ah_fld = var1.ah_fld;
		this.aw_fld = var1.aw_fld;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lfn;IIIIFFFFIIII)Z"
	)
	static final boolean ai(fn var0, int var1, int var2, int var3, int var4, float var5, float var6, float var7, float var8, int var9, int var10, int var11) {
		if (!rt.af()) {
			return false;
		} else {
			en.ax(var5, var6, var7, var8, var9, var10, var11);
			return et.am(var0, var1, var2, var3, var4);
		}
	}

	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		descriptor = "(Lqa;)Z"
	)
	public static boolean ec(qa var0) throws EOFException {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return null == var0.az_fld || var0.az_fld.ao((byte)-34);
		}
	}

	@ObfuscatedName("tk")
	@ObfuscatedSignature(
		descriptor = "(Lqa;III)V"
	)
	public static void tk(qa var0, int var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.ae_fld = var1;
			var0.ah_fld = var2 * -1189872463;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void az(int var1, int var2) throws EOFException {
		if (var1 >= 0) {
			if (var2 == 1557095087) {
				this.aj(var1);
				return;
			}

			if (this.ae_fld != var1) {
				this.ae_fld = var1 * -1457597965;
				this.az_fld = hm.ak(var1);
				this.ag_fld = 0;
				if (-1 == this.ae_fld) {
					this.av_fld = 0;
				}
			}
		} else {
			this.aw_fld = 1457597965;
			this.az_fld = null;
			this.ag_fld = -1085309643;
		}

		this.no(var1);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean av(int var1) {
		return null != this.az_fld;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	public int ah(byte var1) {
		return this.ag_fld;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void af(int var1) {
		if (this.he_fld != null) {
			if (da.nx_fld) {
				this.he_fld.tc_fld = (byte)(this.he_fld.tc_fld | 2);
			} else {
				AnimationChanged var2 = new AnimationChanged();
				var2.setActor(this.he_fld);
				og.ci_fld.getCallbacks().post(var2);
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IS)V"
	)
	void au(int var1, short var2) {
		this.ag_fld = var1 * -985092845;
	}

	@ObfuscatedName("uh")
	@ObfuscatedSignature(
		descriptor = "(Lqa;IS)V"
	)
	public static void uh(qa var0, int var1, short var2) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.aw_fld = var1 * -985092845;
		}
	}

	@ObfuscatedName("ps")
	@ObfuscatedSignature(
		descriptor = "(Lqa;B)I"
	)
	public static int ps(qa var0, byte var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.ag_fld;
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	void ai(int var1, int var2, int var3) {
		this.aa(var1, var2, var3);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void ag(int var1) throws EOFException {
		hs(this, -1, 406376876);
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(Lqa;)V"
	)
	public static void cx(qa var0) {
		if (var0.az_fld != null) {
			if (!var0.az_fld.aa(-370818893)) {
				var0.ae_fld = (int)(Math.random() * var0.az_fld.bk_fld.length);
				var0.av_fld = (int)(Math.random() * var0.az_fld.bf_fld[var0.ae_fld]);
			} else {
				var0.ae_fld = (int)(Math.random() * var0.az_fld.ai(-1509908899));
			}
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean bd() throws EOFException {
		return null == this.az_fld || this.az_fld.ao((byte)-34);
	}

	@ObfuscatedName("hz")
	@ObfuscatedSignature(
		descriptor = "(Lqa;I)Z"
	)
	public static boolean hz(qa var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return jv(var0, -1376992746) && var0.aw_fld * 1923491099 > 0 && var0.aw_fld < var1;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Lol;"
	)
	public ol ae(int var1) {
		return this.az_fld;
	}
}
