import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("si")
public class si {
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Luy;"
	)
	uy ar_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "[Luy;"
	)
	uy[] ag_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "[Luy;"
	)
	uy[] aw_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean av_fld;
	@ObfuscatedName("hp")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int hp_fld;
	@ObfuscatedGetter(
		intValue = -962897371
	)
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ak_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[Luy;"
	)
	uy[] ah_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lsi;"
	)
	public si az_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Luy;"
	)
	uy ay_fld;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "[[F"
	)
	float[][] au_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean ae_fld;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "[[F"
	)
	float[][] af_fld;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "[[F"
	)
	float[][] al_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Luy;"
	)
	uy as_fld;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ac_fld;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ao_fld;

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void cc(int var1) {
		this.ag_fld[var1] = null;
		this.ah_fld = null;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(I)[F"
	)
	float[] bd(int var1) {
		return this.au_fld[var1];
	}

	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "(Lsi;I)Luy;"
	)
	public static uy dt(si var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			if (var0.ah_fld[var1] == null) {
				uy var3 = var0.nj(var1);
				if (var0.az_fld != null) {
					var3 = new uy(var3);
					var3.sa(var0.az_fld.bq(var1));
				}

				var0.ah_fld[var1] = var3;
			}

			return var0.ah_fld[var1];
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Luy;"
	)
	uy av(int var1) {
		if (this.aw_fld[var1] == null) {
			uy var3 = new uy(this.bq(var1));
			var3.cu();
			this.aw_fld[var1] = var3;
		}

		return this.aw_fld[var1];
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(I)[F"
	)
	float[] bz(int var1) {
		return this.af_fld[var1];
	}

	@ObfuscatedName("qx")
	@ObfuscatedSignature(
		descriptor = "(I)[F"
	)
	public float[] qx(int var1) {
		return this.ar(var1);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()Luy;"
	)
	public uy ae() {
		rl2 var2 = rl21.no_fld.qt_fld[this.hp_fld];
		return var2.xb_fld;
	}

	@ObfuscatedName("pu")
	@ObfuscatedSignature(
		descriptor = "(Lsi;I)Luy;"
	)
	public static uy pu(si var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var0.av_fld) {
			uy.nf(var0.as_fld, var0.ae(), (byte)-83);
			if (null != var0.az_fld) {
				var0.as_fld.al(pu(var0.az_fld, -2038010076));
			}

			var0.av_fld = false;
		}

		return var0.as_fld;
	}

	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "(Lsi;I)V"
	)
	public static void hu(si var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.af_fld = new float[var0.ag_fld.length][3];
		var0.al_fld = new float[var0.ag_fld.length][3];
		var0.au_fld = new float[var0.ag_fld.length][3];
		uy var2 = kv.ak();

		for (int var3 = 0; var3 < var0.ag_fld.length; var3++) {
			if (var1 == -502866077) {
				return;
			}

			uy var4 = es(var0, var3);
			uy.nf(var2, var4, (byte)-94);
			var2.aq();
			var0.af_fld[var3] = var2.ah();
			var0.al_fld[var3][0] = var4.kh_fld;
			var0.al_fld[var3][1] = var4.my_fld;
			var0.al_fld[var3][2] = var4.xv_fld;
			var0.au_fld[var3] = var4.ac();
		}

		var2.az();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Luy;"
	)
	public uy ay(int var1) {
		if (this.ae_fld) {
			uy.nf(this.ar_fld, this.av(var1), (byte)-107);
			this.ar_fld.al(pu(this, 750919899));
			this.ae_fld = false;
		}

		return this.ar_fld;
	}

	@ObfuscatedName("ej")
	@ObfuscatedSignature(
		descriptor = "(Lds;IIZ)V"
	)
	public static void ej(ds var0, int var1, int var2, boolean var3) throws EOFException {
		if (var0.cm_fld.av() && var0.cm_fld.ae().bw_fld * 1795231779 == 1) {
			da.fz(var0, -678334586);
		}

		if (!var3) {
			int var4 = var1 - var0.dq_fld[0];
			int var5 = var2 - var0.do_fld[0];
			if (var4 >= -1814132382 && var4 <= 8 && var5 >= -1649399838 && var5 <= 8) {
				var0.dr(var1, var2, gt.az_fld, (byte)-27);
				return;
			}
		}

		var0.da(var1, var2, -591438114);
	}

	@ObfuscatedName("is")
	@ObfuscatedSignature(
		descriptor = "(Lrl21;I)Luy;"
	)
	public uy is(rl21 var1, int var2) {
		rl2 var3 = var1.qt_fld[this.hp_fld];
		if (var3.ii_fld) {
			var3.ab_fld.bz_void(this.ad(var2));
			var3.ab_fld.sa(this.op(var1));
			var3.ii_fld = false;
		}

		return var3.ab_fld;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)[F"
	)
	float[] as(int var1) {
		return this.af_fld[var1];
	}

	public si(int var1, xi var2, boolean var3) {
		this.av_fld = this.ae_fld = true;
		this.ak_fld = var2.ri();
		this.ag_fld = new uy[var1];
		this.ah_fld = new uy[var1];
		this.aw_fld = new uy[var1];

		for (int var4 = 0; var4 < var1; var4++) {
			this.ag_fld[var4] = new uy(var2, var3);
			var2.if_();
			var2.if_();
			var2.if_();
		}

		this.ny();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void al() {
		this.af_fld = new float[this.ag_fld.length][3];
		this.al_fld = new float[this.ag_fld.length][3];
		this.au_fld = new float[this.ag_fld.length][3];
		uy var1 = kv.ak();

		for (int var2 = 0; var2 < this.ag_fld.length; var2++) {
			uy var3 = es(this, var2);
			uy.nf(var1, var3, (byte)-125);
			var1.aq();
			this.af_fld[var2] = var1.ah();
			this.al_fld[var2][0] = var3.kh_fld;
			this.al_fld[var2][1] = var3.my_fld;
			this.al_fld[var2][2] = var3.xv_fld;
			this.au_fld[var2] = var3.ac();
		}

		var1.az();
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Luy;"
	)
	uy ai(int var1) {
		if (null == this.ah_fld[var1]) {
			uy var2 = es(this, var1);
			if (null != this.az_fld) {
				var2 = new uy(var2);
				var2.al(dt(this.az_fld, var1));
			}

			this.ah_fld[var1] = var2;
		}

		return this.ah_fld[var1];
	}

	@ObfuscatedName("rg")
	@ObfuscatedSignature(
		descriptor = "(Lsi;)Luy;"
	)
	public static uy rg(si var0) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var0.av_fld) {
			uy.nf(var0.as_fld, var0.ae(), (byte)-92);
			if (null != var0.az_fld) {
				var0.as_fld.al(pu(var0.az_fld, 196856726));
			}

			var0.av_fld = false;
		}

		return var0.as_fld;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Luy;"
	)
	uy an(int var1) {
		return this.ag_fld[var1];
	}

	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "(Lsi;I)Luy;"
	)
	public static uy hf(si var0, int var1) {
		if (null == var0.aw_fld[var1]) {
			var0.aw_fld[var1] = new uy(dt(var0, var1));
			var0.aw_fld[var1].aq();
		}

		return var0.aw_fld[var1];
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "()Luy;"
	)
	public uy am() {
		return this.ay_fld;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Luy;"
	)
	uy aw(int var1) {
		if (null == this.ah_fld[var1]) {
			uy var2 = es(this, var1);
			if (null != this.az_fld) {
				var2 = new uy(var2);
				var2.al(dt(this.az_fld, var1));
			}

			this.ah_fld[var1] = var2;
		}

		return this.ah_fld[var1];
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Luy;"
	)
	uy aa(int var1) {
		if (null == this.aw_fld[var1]) {
			this.aw_fld[var1] = new uy(dt(this, var1));
			this.aw_fld[var1].aq();
		}

		return this.aw_fld[var1];
	}

	@ObfuscatedName("hb")
	@ObfuscatedSignature(
		descriptor = "(I)[F"
	)
	public float[] hb(int var1) {
		return this.as(var1);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)[F"
	)
	float[] ar(int var1) {
		return this.al_fld[var1];
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Luy;)V"
	)
	void ao(uy var1) {
		uy.nf(this.ay_fld, var1, (byte)2);
		this.av_fld = true;
		this.ae_fld = true;
	}

	@ObfuscatedName("es")
	@ObfuscatedSignature(
		descriptor = "(Lsi;I)Luy;"
	)
	public static uy es(si var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.ag_fld[var1];
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)Luy;"
	)
	public uy ad(int var1) {
		return this.av(var1);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void au() {
		this.af_fld = new float[this.ag_fld.length][3];
		this.al_fld = new float[this.ag_fld.length][3];
		this.au_fld = new float[this.ag_fld.length][3];
		uy var1 = kv.ak();

		for (int var2 = 0; var2 < this.ag_fld.length; var2++) {
			uy var3 = es(this, var2);
			uy.nf(var1, var3, (byte)-109);
			var1.aq();
			this.af_fld[var2] = var1.ah();
			this.al_fld[var2][0] = var3.kh_fld;
			this.al_fld[var2][1] = var3.my_fld;
			this.al_fld[var2][2] = var3.xv_fld;
			this.au_fld[var2] = var3.ac();
		}

		var1.az();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Luy;)V"
	)
	void ah(uy var1) {
		uy.nf(this.ay_fld, var1, (byte)-37);
		this.av_fld = true;
		this.ae_fld = true;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(I)[F"
	)
	float[] bm(int var1) {
		return this.al_fld[var1];
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "()Luy;"
	)
	uy ab() {
		if (this.av_fld) {
			uy.nf(this.as_fld, this.ae(), (byte)-3);
			if (null != this.az_fld) {
				this.as_fld.al(pu(this.az_fld, -1919259184));
			}

			this.av_fld = false;
		}

		return this.as_fld;
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(Luy;)V"
	)
	public void cg(uy var1) {
		this.ah(var1);
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(I)[F"
	)
	float[] br(int var1) {
		return this.al_fld[var1];
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(I)Luy;"
	)
	public uy bq(int var1) {
		return dt(this, var1);
	}

	@ObfuscatedName("op")
	@ObfuscatedSignature(
		descriptor = "(Lrl21;)Luy;"
	)
	public uy op(rl21 var1) {
		rl2 var2 = var1.qt_fld[this.hp_fld];
		if (var2.bz_fld) {
			var2.ex_fld.bz_void(var2.xb_fld);
			if (this.az_fld != null) {
				var2.ex_fld.sa(this.az_fld.op(var1));
			}

			var2.bz_fld = false;
		}

		return var2.ex_fld;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Luy;"
	)
	public uy at(int var1) {
		if (this.ae_fld) {
			uy.nf(this.ar_fld, this.av(var1), (byte)-34);
			this.ar_fld.al(pu(this, -164896964));
			this.ae_fld = false;
		}

		return this.ar_fld;
	}

	@ObfuscatedName("zo")
	@ObfuscatedSignature(
		descriptor = "(I)[F"
	)
	public float[] zo(int var1) {
		return ze(this, var1);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void ak(int var1) {
		this.ag_fld[var1] = null;
		this.aw_fld = null;
	}

	@ObfuscatedName("ny")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ny() {
		hu(this, 247193863);
	}

	@ObfuscatedName("nj")
	@ObfuscatedSignature(
		descriptor = "(I)Luy;"
	)
	public uy nj(int var1) {
		return es(this, var1);
	}

	@ObfuscatedName("ze")
	@ObfuscatedSignature(
		descriptor = "(Lsi;I)[F"
	)
	public static float[] ze(si var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.au_fld[var1];
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)Luy;"
	)
	uy ag(int var1, int var2) {
		return this.ag_fld[var1];
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)Luy;"
	)
	uy az(int var1, int var2) {
		if (this.aw_fld[var1] == null) {
			uy var3 = this.bq(var1);
			if (this.az_fld != null) {
				var3 = new uy(var3);
				var3.cq(this.az_fld.at(var1));
			}

			this.aw_fld[var1] = var3;
		}

		return this.ah_fld[var1];
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Luy;"
	)
	uy ax(int var1) {
		if (null == this.aw_fld[var1]) {
			this.aw_fld[var1] = new uy(dt(this, var1));
			this.aw_fld[var1].az();
		}

		return this.aw_fld[var1];
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)[F"
	)
	float[] af(int var1, int var2) {
		return this.af_fld[var1];
	}
}
