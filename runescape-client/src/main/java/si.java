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
	@ObfuscatedName("kk")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int kk_fld;
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
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -962897371
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

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(I)[F"
	)
	float[] br(int var1) {
		return this.au_fld[var1];
	}

	@ObfuscatedName("ku")
	@ObfuscatedSignature(
		descriptor = "(I)Luy;"
	)
	public uy ku(int var1) {
		return this.az(var1);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void ak(int var1) {
		this.af_fld = new float[this.ag_fld.length][3];
		this.al_fld = new float[this.ag_fld.length][3];
		this.au_fld = new float[this.ag_fld.length][3];
		uy var2 = kv.ak();

		for (int var3 = 0; var3 < this.ag_fld.length; var3++) {
			if (var1 == -502866077) {
				return;
			}

			uy var4 = this.ag(var3);
			var2.as(var4);
			var2.aw();
			this.af_fld[var3] = var2.ah();
			this.al_fld[var3][0] = var4.qe_fld;
			this.al_fld[var3][1] = var4.na_fld;
			this.al_fld[var3][2] = var4.ql_fld;
			this.au_fld[var3] = var4.ac();
		}

		var2.aq();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)Luy;"
	)
	uy ag(int var1) {
		return this.ag_fld[var1];
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)[F"
	)
	public float[] an(int var1) {
		return this.ar(var1);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)Luy;"
	)
	uy az(int var1) {
		if (this.ah_fld[var1] == null) {
			uy var3 = this.cu(var1);
			if (this.az_fld != null) {
				var3 = new uy(var3);
				sv.ii(var3, this.az_fld.ku(var1));
			}

			this.ah_fld[var1] = var3;
		}

		return this.ah_fld[var1];
	}

	@ObfuscatedName("qi")
	@ObfuscatedSignature(
		descriptor = "(Lsi;I)[F"
	)
	public static float[] qi(si var0, int var1) {
		return var0.af_fld[var1];
	}

	@ObfuscatedName("me")
	@ObfuscatedSignature(
		descriptor = "(Lsi;I)Luy;"
	)
	public static uy me(si var0, int var1) {
		if (null == var0.aw_fld[var1]) {
			var0.aw_fld[var1] = new uy(var0.az(var1));
			var0.aw_fld[var1].aw();
		}

		return var0.aw_fld[var1];
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(I)Luy;"
	)
	public uy cu(int var1) {
		return this.ag(var1);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)Luy;"
	)
	uy av(int var1) {
		if (this.aw_fld[var1] == null) {
			uy var3 = new uy(this.ku(var1));
			var3.bf();
			this.aw_fld[var1] = var3;
		}

		return this.aw_fld[var1];
	}

	@ObfuscatedName("rb")
	@ObfuscatedSignature(
		descriptor = "(Lsi;)Luy;"
	)
	public static uy rb(si var0) {
		return var0.ay_fld;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)Luy;"
	)
	public uy ae() {
		rl2 var2 = rl21.ao_fld.yn_fld[this.kk_fld];
		return var2.zm_fld;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Luy;"
	)
	uy aw() {
		if (this.av_fld) {
			this.as_fld.as(this.ae());
			if (null != this.az_fld) {
				uy.es(this.as_fld, this.az_fld.aw(), -671942689);
			}

			this.av_fld = false;
		}

		return this.as_fld;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void as(int var1) {
		this.ag_fld[var1] = null;
		this.ah_fld = null;
	}

	@ObfuscatedName("qr")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void qr() {
		this.ak(247193863);
	}

	public si(int var1, xi var2, boolean var3) {
		this.av_fld = this.ae_fld = true;
		this.ak_fld = var2.xh();
		this.ag_fld = new uy[var1];
		this.ah_fld = new uy[var1];
		this.aw_fld = new uy[var1];

		for (int var4 = 0; var4 < var1; var4++) {
			this.ag_fld[var4] = new uy(var2, var3);
			var2.cd();
			var2.cd();
			var2.cd();
		}

		this.qr();
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(Luy;)V"
	)
	public void cp(uy var1) {
		this.ah(var1);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)[F"
	)
	float[] af(int var1) {
		return this.au_fld[var1];
	}

	@ObfuscatedName("wn")
	@ObfuscatedSignature(
		descriptor = "(I)[F"
	)
	public float[] wn(int var1) {
		return tb(this, var1);
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
			uy var3 = this.ag(var2);
			var1.as(var3);
			var1.aw();
			this.af_fld[var2] = var1.ah();
			this.al_fld[var2][0] = var3.qe_fld;
			this.al_fld[var2][1] = var3.na_fld;
			this.al_fld[var2][2] = var3.ql_fld;
			this.au_fld[var2] = var3.ac();
		}

		var1.aq();
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "()Luy;"
	)
	public uy am() {
		return this.ay_fld;
	}

	@ObfuscatedName("ja")
	@ObfuscatedSignature(
		descriptor = "(I)Luy;"
	)
	public uy ja(int var1) {
		return this.av(var1);
	}

	@ObfuscatedName("pc")
	@ObfuscatedSignature(
		descriptor = "(Lsi;I)Luy;"
	)
	public static uy pc(si var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.ag_fld[var1];
	}

	@ObfuscatedName("nh")
	@ObfuscatedSignature(
		descriptor = "(Lrl21;)Luy;"
	)
	public uy nh(rl21 var1) {
		rl2 var2 = var1.yn_fld[this.kk_fld];
		if (var2.mv_fld) {
			var2.qs_fld.cv(var2.zm_fld);
			if (this.az_fld != null) {
				sv.ii(var2.qs_fld, this.az_fld.nh(var1));
			}

			var2.mv_fld = false;
		}

		return var2.qs_fld;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Luy;"
	)
	uy aa(int var1) {
		if (null == this.ah_fld[var1]) {
			uy var2 = this.ag(var1);
			if (null != this.az_fld) {
				var2 = new uy(var2);
				uy.es(var2, this.az_fld.az(var1), -1037763266);
			}

			this.ah_fld[var1] = var2;
		}

		return this.ah_fld[var1];
	}

	@ObfuscatedName("iz")
	@ObfuscatedSignature(
		descriptor = "(Lsi;I)Luy;"
	)
	public static uy iz(si var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			if (var0.ae_fld) {
				var0.ar_fld.as(var0.av(var1));
				uy.es(var0.ar_fld, var0.aw(), -836985556);
				var0.ae_fld = false;
			}

			return var0.ar_fld;
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Luy;"
	)
	uy ai(int var1) {
		if (null == this.aw_fld[var1]) {
			this.aw_fld[var1] = new uy(this.az(var1));
			this.aw_fld[var1].aw();
		}

		return this.aw_fld[var1];
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)[F"
	)
	float[] ar(int var1) {
		return this.al_fld[var1];
	}

	@ObfuscatedName("xv")
	@ObfuscatedSignature(
		descriptor = "(Lsi;II)Luy;"
	)
	public static uy xv(si var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			if (var0.ae_fld) {
				var0.ar_fld.as(var0.av(var1));
				uy.es(var0.ar_fld, var0.aw(), -1723398685);
				var0.ae_fld = false;
			}

			return var0.ar_fld;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Luy;)V"
	)
	void ao(uy var1) {
		this.ay_fld.as(var1);
		this.av_fld = true;
		this.ae_fld = true;
	}

	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "(Lcn;)Z"
	)
	public static boolean ik(cn var0) {
		return var0.ah_fld;
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
			uy var3 = this.ag(var2);
			var1.as(var3);
			var1.aw();
			this.af_fld[var2] = var1.ah();
			this.al_fld[var2][0] = var3.qe_fld;
			this.al_fld[var2][1] = var3.na_fld;
			this.al_fld[var2][2] = var3.ql_fld;
			this.au_fld[var2] = var3.ac();
		}

		var1.aq();
	}

	@ObfuscatedName("kh")
	@ObfuscatedSignature(
		descriptor = "(Lsi;I)Luy;"
	)
	public static uy kh(si var0, int var1) {
		if (null == var0.ah_fld[var1]) {
			uy var2 = var0.ag(var1);
			if (null != var0.az_fld) {
				var2 = new uy(var2);
				uy.es(var2, var0.az_fld.az(var1), -1492904342);
			}

			var0.ah_fld[var1] = var2;
		}

		return var0.ah_fld[var1];
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Luy;I)V"
	)
	void ah(uy var1) {
		this.ay_fld.as(var1);
		this.av_fld = true;
		this.ae_fld = true;
	}

	@ObfuscatedName("qo")
	@ObfuscatedSignature(
		descriptor = "(I)[F"
	)
	public float[] qo(int var1) {
		return this.af(var1);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)[F"
	)
	float[] aj(int var1) {
		return this.af_fld[var1];
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(I)[F"
	)
	float[] bd(int var1) {
		return this.al_fld[var1];
	}

	@ObfuscatedName("qy")
	@ObfuscatedSignature(
		descriptor = "(Lrl21;I)Luy;"
	)
	public uy qy(rl21 var1, int var2) {
		rl2 var3 = var1.yn_fld[this.kk_fld];
		if (var3.gb_fld) {
			var3.ho_fld.cv(this.ja(var2));
			sv.ii(var3.ho_fld, this.nh(var1));
			var3.gb_fld = false;
		}

		return var3.ho_fld;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "()Luy;"
	)
	uy ab() {
		if (this.av_fld) {
			this.as_fld.as(this.ae());
			if (null != this.az_fld) {
				uy.es(this.as_fld, this.az_fld.aw(), -1640535756);
			}

			this.av_fld = false;
		}

		return this.as_fld;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)Luy;"
	)
	public uy ay(int var1, int var2) {
		if (this.ae_fld) {
			this.ar_fld.as(this.az(var1));
			uy.es(this.as_fld, this.aw(), -1723398685);
			this.ae_fld = false;
		}

		return this.ay_fld;
	}

	@ObfuscatedName("gk")
	@ObfuscatedSignature(
		descriptor = "(Lsi;I)[F"
	)
	public static float[] gk(si var0, int var1) {
		return var0.al_fld[var1];
	}

	@ObfuscatedName("tb")
	@ObfuscatedSignature(
		descriptor = "(Lsi;II)[F"
	)
	public static float[] tb(si var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.af_fld[var1];
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)[F"
	)
	float[] as(int var1, int var2) {
		return this.au_fld[var1];
	}

	@ObfuscatedName("ob")
	@ObfuscatedSignature(
		descriptor = "(Lsi;)Luy;"
	)
	public static uy ob(si var0) {
		if (var0.av_fld) {
			var0.as_fld.as(var0.ae());
			if (null != var0.az_fld) {
				uy.es(var0.as_fld, var0.az_fld.aw(), -2141358273);
			}

			var0.av_fld = false;
		}

		return var0.as_fld;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Luy;"
	)
	public uy at(int var1) {
		if (this.av_fld) {
			this.as_fld.as(this.ag(var1));
			uy.es(this.ay_fld, this.aa(-164896964), -836985556);
			this.ae_fld = false;
		}

		return this.ay_fld;
	}
}
