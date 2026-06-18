import java.io.EOFException;
import net.runelite.api.WorldEntityConfig;
import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("oy")
@Implements({"WorldEntityConfig"})
public class oy extends vc implements WorldEntityConfig {
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1604810459
	)
	int by_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ak_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ag_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ay_fld;
	@ObfuscatedName("xp")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int xp_fld;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int af_fld;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	static iw ap_fld = new iw(64);
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1632885803
	)
	int bh_fld;
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "Lvr;"
	)
	vr bk_fld;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "[Ljava/lang/String;"
	)
	public String[] ac_fld;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public boolean aj_fld;
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -238276933
	)
	int bm_fld;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1500086911
	)
	int bd_fld;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1275623879
	)
	int bz_fld;
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1818382625
	)
	int br_fld;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1364828805
	)
	int be_fld;
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1364262879
	)
	int bs_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int az_fld;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	public String at_fld = kh.aj_fld;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "[Lvr;"
	)
	vr[] bj_fld;
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	public static iw bt_fld = new iw(64);
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -2064782363
	)
	int bf_fld;
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	kt bl_fld;
	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "Ljf;"
	)
	jf bx_fld;
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -457075275
	)
	int bo_fld;
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -552044659
	)
	int bp_fld;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int aq_fld;
	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int cb_fld;

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	public int az(byte var1) {
		return this.bf_fld;
	}

	@ObfuscatedName("ob")
	@ObfuscatedSignature(
		descriptor = "(Loy;Lxi;)V"
	)
	public static void ob(oy var0, xi var1) {
		if (var0 == null) {
			var0.getClass();
		}

		while (true) {
			int var2 = var1.cg();
			if (0 == var2) {
				return;
			}

			var0.ae(var1, var2, 574029715);
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void aw(int var1) {
		short var2 = 256;
		this.bj_fld[0] = new vr(this.be_fld + var2, this.bs_fld + var2, this.bz_fld, this.br_fld);
		var2 = 362;
		this.bj_fld[2] = new vr(this.be_fld + var2, var2 + this.bs_fld, this.bz_fld, this.br_fld);
		var2 = 334;
		this.bj_fld[1] = new vr(this.be_fld + var2, this.bs_fld + var2, this.bz_fld, this.br_fld);
		this.bj_fld[3] = this.bj_fld[1];
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void ah(int var1) {
		this.bk_fld = new vr(this.be_fld, this.bs_fld, this.bz_fld, this.br_fld);
		this.aw(-101343357);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int as(int var1) {
		return this.bm_fld;
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int bi() {
		return this.bd_fld;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Lvr;"
	)
	public vr al(int var1) {
		return this.bk_fld;
	}

	@ObfuscatedName("zg")
	@ObfuscatedSignature(
		descriptor = "(Loy;)V"
	)
	public static void zg(oy var0) {
		if (var0 == null) {
			var0.getClass();
		}

		short var1 = 256;
		var0.bj_fld[0] = new vr(var0.be_fld + var1, var0.bs_fld + var1, var0.bz_fld, var0.br_fld);
		var1 = 362;
		var0.bj_fld[2] = new vr(var0.be_fld + var1, var1 + var0.bs_fld, var0.bz_fld, var0.br_fld);
		var1 = 334;
		var0.bj_fld[1] = new vr(var0.be_fld + var1, var0.bs_fld + var1, var0.bz_fld, var0.br_fld);
		var0.bj_fld[3] = var0.bj_fld[1];
	}

	@ObfuscatedName("wg")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	public void wg(xi var1, int var2) {
		if (var2 == 20) {
			int var3 = var1.ih();
			this.xp_fld = var1.pu();
			var1.no(var3);
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	void av(xi var1, int var2) {
		while (true) {
			int var3 = var1.cg();
			if (0 == var3) {
				return;
			}

			this.ae(var1, var3, 574029715);
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Ljf;"
	)
	public jf ax(int var1) {
		return this.bx_fld;
	}

	@ObfuscatedName("sb")
	@ObfuscatedSignature(
		descriptor = "(Loy;)V"
	)
	public static void sb(oy var0) {
		var0.bk_fld = new vr(var0.be_fld, 633860014 * var0.bs_fld, var0.bz_fld * 1012132778, var0.br_fld * 1711009285);
		var0.aw(865799950);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int aa(int var1) {
		return this.bp_fld;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int bt() {
		return this.by_fld;
	}

	@ObfuscatedName("vw")
	@ObfuscatedSignature(
		descriptor = "(Ltv;I)I"
	)
	public static int vw(tv var0, int var1) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			return var0.ak_fld.ak(var1, (byte)102);
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lub;Lub;)V"
	)
	public static void aq(ub var0, ub var1) {
		ep.ao_fld = var0;
		ma.bv_fld = var1;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lub;Lub;)V"
	)
	public static void ai(ub var0, ub var1) {
		ep.ao_fld = var0;
		ma.bv_fld = var1;
	}

	oy() {
		this.ac_fld = new String[5];
		this.aj_fld = false;
		this.bm_fld = 0;
		this.bd_fld = 0;
		this.bz_fld = 0;
		this.br_fld = 0;
		this.be_fld = 0;
		this.bs_fld = 0;
		this.bh_fld = -1978006909;
		this.bj_fld = new vr[4];
		this.bf_fld = -775051757;
		this.by_fld = 0;
		this.bl_fld = kt.aw_fld;
		this.bx_fld = jf.ay_fld;
		this.bo_fld = 777490275;
		this.bp_fld = -735773084;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Loy;"
	)
	public static oy am(int var0) throws EOFException {
		try {
			oy var1 = (oy)ap_fld.ak(var0);
			if (var1 != null) {
				return var1;
			} else {
				byte[] var2 = ep.ao_fld.bb(72, var0, 584982574);
				var1 = new oy();
				var1.bf_fld = -845417482 * var0;
				if (var2 != null) {
					var1.av(new xi(var2), -371442011);
				}

				var1.ah(-2084404667);
				ap_fld.az(var1, var0);
				return var1;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bj() {
		short var1 = 256;
		this.bj_fld[0] = new vr(this.be_fld + var1, this.bs_fld + var1, 1231826504 * this.bz_fld, this.br_fld);
		int var2 = -1720073318;
		this.bj_fld[2] = new vr(this.be_fld + var2, var2 + this.bs_fld, -843650114 * this.bz_fld, this.br_fld);
		var2 = 1972586031;
		this.bj_fld[1] = new vr(this.be_fld + var2, this.bs_fld + var2, this.bz_fld, this.br_fld * 1274068209);
		this.bj_fld[3] = this.bj_fld[1];
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Loy;"
	)
	public static oy ao(int var0) throws EOFException {
		try {
			oy var1 = (oy)ap_fld.ak(var0);
			if (var1 != null) {
				return var1;
			} else {
				byte[] var2 = ep.ao_fld.bb(72, var0, 584982574);
				var1 = new oy();
				var1.bf_fld = var0;
				if (var2 != null) {
					var1.av(new xi(var2), 1238241702);
				}

				var1.ah(-2052776686);
				ap_fld.az(var1, var0);
				return var1;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ap() {
		return this.bf_fld;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bf() {
		int var1 = 319381548;
		this.bj_fld[0] = new vr(this.be_fld + var1, this.bs_fld + var1, -2059997923 * this.bz_fld, -317772864 * this.br_fld);
		var1 = -1741218927;
		this.bj_fld[2] = new vr(this.be_fld + var1, var1 + this.bs_fld, 2052369234 * this.bz_fld, this.br_fld);
		short var3 = 334;
		this.bj_fld[1] = new vr(this.be_fld + var3, this.bs_fld + var3, this.bz_fld * 1326428703, this.br_fld);
		this.bj_fld[3] = this.bj_fld[1];
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	void aj(xi var1) {
		while (true) {
			int var2 = var1.cg();
			if (0 == var2) {
				return;
			}

			this.ae(var1, var2, 574029715);
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	void bd(xi var1, int var2) {
		switch (var2) {
			case 2:
				this.by_fld = var1.cg() * 224968888;
			case 3:
			case 10:
			case 11:
			case 13:
			case 21:
			case 22:
			default:
				break;
			case 4:
				this.bm_fld = var1.cz() * 1976411526;
				break;
			case 5:
				this.bd_fld = var1.cz() * 1677987938;
				break;
			case 6:
				this.bz_fld = var1.cz();
				break;
			case 7:
				this.br_fld = var1.cz() * 586413630;
				break;
			case 8:
				this.be_fld = var1.cm() * -177014916;
				break;
			case 9:
				this.bs_fld = var1.cm() * 1687218356;
				break;
			case 12:
				this.at_fld = xi.at(var1, 1522192102);
				break;
			case 14:
				this.aj_fld = true;
				break;
			case 15:
			case 16:
			case 17:
			case 18:
			case 19:
				int var5 = var2 - 15;
				this.ac_fld[var5] = xi.at(var1, -317294146);
				if (this.ac_fld[var5].equalsIgnoreCase(kh.ao_fld)) {
					this.ac_fld[var5] = null;
				}

				this.aj_fld = true;
				break;
			case 20:
				var1.cm();
				break;
			case 23:
				kt[] var3 = new kt[]{kt.ak_fld, kt.ag_fld, kt.az_fld, kt.av_fld};
				this.bl_fld = (kt)ka.ak(var3, var1.cg());
				break;
			case 24:
				jf[] var4 = new jf[]{jf.ak_fld, jf.ag_fld, jf.az_fld};
				this.bx_fld = (jf)ka.ak(var4, var1.cg());
				break;
			case 25:
				this.bh_fld = var1.cm() * -452684870;
				break;
			case 26:
				this.bo_fld = xi.kt(var1, (byte)-85);
				break;
			case 27:
				this.bp_fld = var1.cm() * -1060389173;
		}
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	void bz(xi var1, int var2) {
		switch (var2) {
			case 2:
				this.by_fld = var1.cg();
			case 3:
			case 10:
			case 11:
			case 13:
			case 21:
			case 22:
			default:
				break;
			case 4:
				this.bm_fld = var1.cz();
				break;
			case 5:
				this.bd_fld = var1.cz();
				break;
			case 6:
				this.bz_fld = var1.cz();
				break;
			case 7:
				this.br_fld = var1.cz();
				break;
			case 8:
				this.be_fld = var1.cm();
				break;
			case 9:
				this.bs_fld = var1.cm();
				break;
			case 12:
				this.at_fld = xi.at(var1, -1892758918);
				break;
			case 14:
				this.aj_fld = true;
				break;
			case 15:
			case 16:
			case 17:
			case 18:
			case 19:
				int var5 = var2 - 15;
				this.ac_fld[var5] = xi.at(var1, -1106915883);
				if (this.ac_fld[var5].equalsIgnoreCase(kh.ao_fld)) {
					this.ac_fld[var5] = null;
				}

				this.aj_fld = true;
				break;
			case 20:
				var1.cm();
				break;
			case 23:
				kt[] var3 = new kt[]{kt.ak_fld, kt.ag_fld, kt.az_fld, kt.av_fld};
				this.bl_fld = (kt)ka.ak(var3, var1.cg());
				break;
			case 24:
				jf[] var4 = new jf[]{jf.ak_fld, jf.ag_fld, jf.az_fld};
				this.bx_fld = (jf)ka.ak(var4, var1.cg());
				break;
			case 25:
				this.bh_fld = var1.cm();
				break;
			case 26:
				this.bo_fld = xi.kt(var1, (byte)-29);
				break;
			case 27:
				this.bp_fld = var1.cm();
		}
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	void br(xi var1, int var2) {
		switch (var2) {
			case 2:
				this.by_fld = var1.cg();
			case 3:
			case 10:
			case 11:
			case 13:
			case 21:
			case 22:
			default:
				break;
			case 4:
				this.bm_fld = var1.cz();
				break;
			case 5:
				this.bd_fld = var1.cz();
				break;
			case 6:
				this.bz_fld = var1.cz() * -715189235;
				break;
			case 7:
				this.br_fld = var1.cz();
				break;
			case 8:
				this.be_fld = var1.cm();
				break;
			case 9:
				this.bs_fld = var1.cm() * 1541929926;
				break;
			case 12:
				this.at_fld = xi.at(var1, 1034205777);
				break;
			case 14:
				this.aj_fld = true;
				break;
			case 15:
			case 16:
			case 17:
			case 18:
			case 19:
				int var5 = var2 - 15;
				this.ac_fld[var5] = xi.at(var1, 667210126);
				if (this.ac_fld[var5].equalsIgnoreCase(kh.ao_fld)) {
					this.ac_fld[var5] = null;
				}

				this.aj_fld = true;
				break;
			case 20:
				var1.cm();
				break;
			case 23:
				kt[] var3 = new kt[]{kt.ak_fld, kt.ag_fld, kt.az_fld, kt.av_fld};
				this.bl_fld = (kt)ka.ak(var3, var1.cg());
				break;
			case 24:
				jf[] var4 = new jf[]{jf.ak_fld, jf.ag_fld, jf.az_fld};
				this.bx_fld = (jf)ka.ak(var4, var1.cg());
				break;
			case 25:
				this.bh_fld = var1.cm();
				break;
			case 26:
				this.bo_fld = xi.kt(var1, (byte)-72);
				break;
			case 27:
				this.bp_fld = var1.cm();
		}
	}

	@ObfuscatedName("is")
	@ObfuscatedSignature(
		descriptor = "(Loy;B)I"
	)
	public static int is(oy var0, byte var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.bh_fld;
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	void be(xi var1, int var2) {
		switch (var2) {
			case 2:
				this.by_fld = var1.cg() * 1181419444;
			case 3:
			case 10:
			case 11:
			case 13:
			case 21:
			case 22:
			default:
				break;
			case 4:
				this.bm_fld = var1.cz() * -1371700209;
				break;
			case 5:
				this.bd_fld = var1.cz() * -1128046032;
				break;
			case 6:
				this.bz_fld = var1.cz();
				break;
			case 7:
				this.br_fld = var1.cz() * 556078522;
				break;
			case 8:
				this.be_fld = var1.cm();
				break;
			case 9:
				this.bs_fld = var1.cm() * -1122161708;
				break;
			case 12:
				this.at_fld = xi.at(var1, -1609502902);
				break;
			case 14:
				this.aj_fld = true;
				break;
			case 15:
			case 16:
			case 17:
			case 18:
			case 19:
				int var5 = var2 - 15;
				this.ac_fld[var5] = xi.at(var1, 508518201);
				if (this.ac_fld[var5].equalsIgnoreCase(kh.ao_fld)) {
					this.ac_fld[var5] = null;
				}

				this.aj_fld = true;
				break;
			case 20:
				var1.cm();
				break;
			case 23:
				kt[] var3 = new kt[]{kt.ak_fld, kt.ag_fld, kt.az_fld, kt.av_fld};
				this.bl_fld = (kt)ka.ak(var3, var1.cg());
				break;
			case 24:
				jf[] var4 = new jf[]{jf.ak_fld, jf.ag_fld, jf.az_fld};
				this.bx_fld = (jf)ka.ak(var4, var1.cg());
				break;
			case 25:
				this.bh_fld = var1.cm() * -2067169532;
				break;
			case 26:
				this.bo_fld = xi.kt(var1, (byte)-63);
				break;
			case 27:
				this.bp_fld = var1.cm() * 53820900;
		}
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int bw() {
		return this.bh_fld;
	}

	@ObfuscatedName("mc")
	@ObfuscatedSignature(
		descriptor = "(Loy;)I"
	)
	public static int mc(oy var0) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.bp_fld;
		}
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bk() {
		this.bk_fld = new vr(this.be_fld, this.bs_fld, this.bz_fld, this.br_fld);
		this.aw(743394638);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Lyv;"
	)
	public yv an(int var1) {
		try {
			if (this.bo_fld < 0) {
				return null;
			} else {
				yv var2 = (yv)bt_fld.ak(this.bo_fld);
				if (null != var2) {
					return var2;
				} else {
					var2 = wf.av(ma.bv_fld, this.bo_fld, 0);
					if (null != var2) {
						bt_fld.az(var2, this.bo_fld);
					}

					return var2;
				}
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("rx")
	@ObfuscatedSignature(
		descriptor = "()Lyv;"
	)
	public yv rx() {
		try {
			return this.an(693675935);
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lxi;II)V"
	)
	void ae(xi var1, int var2, int var3) {
		this.wg(var1, var2);
		switch (var2) {
			case 2:
				this.by_fld = var1.cg();
			case 3:
			case 10:
			case 11:
			case 13:
			case 21:
			case 22:
			default:
				break;
			case 4:
				this.bm_fld = var1.cz();
				break;
			case 5:
				this.bd_fld = var1.cz();
				break;
			case 6:
				this.bz_fld = var1.cz();
				break;
			case 7:
				this.br_fld = var1.cz();
				break;
			case 8:
				this.be_fld = var1.cm();
				break;
			case 9:
				this.bs_fld = var1.cm();
				break;
			case 12:
				this.at_fld = xi.at(var1, 1175274748);
				break;
			case 14:
				this.aj_fld = true;
				break;
			case 15:
			case 16:
			case 17:
			case 18:
			case 19:
				int var6 = var2 - 15;
				this.ac_fld[var6] = xi.at(var1, -1716107448);
				if (this.ac_fld[var6].equalsIgnoreCase(kh.ao_fld)) {
					this.ac_fld[var6] = null;
				}

				this.aj_fld = true;
				break;
			case 20:
				var1.cm();
				break;
			case 23:
				kt[] var4 = new kt[]{kt.ak_fld, kt.ag_fld, kt.az_fld, kt.av_fld};
				this.bl_fld = (kt)ka.ak(var4, var1.cg());
				break;
			case 24:
				jf[] var5 = new jf[]{jf.ak_fld, jf.ag_fld, jf.az_fld};
				this.bx_fld = (jf)ka.ak(var5, var1.cg());
				break;
			case 25:
				this.bh_fld = var1.cm();
				break;
			case 26:
				this.bo_fld = xi.kt(var1, (byte)-97);
				break;
			case 27:
				this.bp_fld = var1.cm();
		}
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void by() {
		short var1 = 256;
		this.bj_fld[0] = new vr(this.be_fld + var1, this.bs_fld + var1, 2044240457 * this.bz_fld, -1457713205 * this.br_fld);
		var1 = 362;
		this.bj_fld[2] = new vr(this.be_fld + var1, var1 + this.bs_fld, this.bz_fld, this.br_fld);
		int var3 = -1252573112;
		this.bj_fld[1] = new vr(this.be_fld + var3, this.bs_fld + var3, this.bz_fld, this.br_fld * 237990501);
		this.bj_fld[3] = this.bj_fld[1];
	}

	@ObfuscatedName("ni")
	@ObfuscatedSignature(
		descriptor = "(Lgp;IIILgr;Lgn;Z[I[I)I"
	)
	public static int ni(gp var0, int var1, int var2, int var3, gr var4, gn var5, boolean var6, int[] var7, int[] var8) {
		return var0.az(var1, var2, var3, var4, var5, var6, var7, var8, var0.ak_fld[0]);
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bx() {
		int var1 = 354789605;
		this.bj_fld[0] = new vr(this.be_fld + var1, this.bs_fld + var1, -605980341 * this.bz_fld, this.br_fld);
		var1 = 549813274;
		this.bj_fld[2] = new vr(this.be_fld + var1, var1 + this.bs_fld, this.bz_fld, this.br_fld);
		short var3 = 334;
		this.bj_fld[1] = new vr(this.be_fld + var3, this.bs_fld + var3, this.bz_fld, this.br_fld);
		this.bj_fld[3] = this.bj_fld[1];
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bo() {
		short var1 = 256;
		this.bj_fld[0] = new vr(this.be_fld + var1, this.bs_fld + var1, this.bz_fld, this.br_fld);
		var1 = 362;
		this.bj_fld[2] = new vr(this.be_fld + var1, var1 + this.bs_fld, this.bz_fld, this.br_fld);
		var1 = 334;
		this.bj_fld[1] = new vr(this.be_fld + var1, this.bs_fld + var1, this.bz_fld, this.br_fld);
		this.bj_fld[3] = this.bj_fld[1];
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int bp() {
		return this.by_fld;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bs() {
		this.bk_fld = new vr(819921963 * this.be_fld, 1649803245 * this.bs_fld, this.bz_fld, this.br_fld);
		this.aw(-44871191);
	}

	@ObfuscatedName("getBoundsX")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getBoundsX")
	@Override
	public int getBoundsX() {
		return this.bz_fld;
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "()Lyv;"
	)
	public yv cy() {
		try {
			if (557129318 * this.bo_fld < 0) {
				return null;
			} else {
				yv var1 = (yv)bt_fld.ak(this.bo_fld);
				if (null != var1) {
					return var1;
				} else {
					var1 = wf.av(ma.bv_fld, this.bo_fld, 0);
					if (null != var1) {
						bt_fld.az(var1, this.bo_fld);
					}

					return var1;
				}
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ac() {
		return this.bf_fld;
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int bu() {
		return this.bd_fld;
	}

	@ObfuscatedName("getCategory")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getCategory")
	@Override
	public int getCategory() {
		return this.xp_fld;
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int bc() {
		return this.bd_fld;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int at() {
		return this.bf_fld;
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ba() {
		return this.bh_fld;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "()Lvr;"
	)
	public vr bq() {
		return this.bk_fld;
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "()Lvr;"
	)
	public vr bg() {
		return this.bk_fld;
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "()Lkt;"
	)
	public kt cd() {
		return this.bl_fld;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(Loy;B)Lkt;"
	)
	public static kt bz(oy var0, byte var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.bl_fld;
	}

	@ObfuscatedName("getBoundsHeight")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getBoundsHeight")
	@Override
	public int getBoundsHeight() {
		return this.bs_fld;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	public int ar(byte var1) {
		return this.bd_fld;
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "()Ljf;"
	)
	public jf cq() {
		return this.bx_fld;
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "()Ljf;"
	)
	public jf cv() {
		return this.bx_fld;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)Loy;"
	)
	public static oy ad(int var0) throws EOFException {
		try {
			oy var1 = (oy)ap_fld.ak(var0);
			if (var1 != null) {
				return var1;
			} else {
				byte[] var2 = ep.ao_fld.bb(72, var0, 584982574);
				var1 = new oy();
				var1.bf_fld = var0;
				if (var2 != null) {
					var1.av(new xi(var2), 1712871868);
				}

				var1.ah(-1837952341);
				ap_fld.az(var1, var0);
				return var1;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("ib")
	@ObfuscatedSignature(
		descriptor = "(Loy;B)I"
	)
	public static int ib(oy var0, byte var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.by_fld;
		}
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int cx() {
		return this.bp_fld;
	}

	@ObfuscatedName("ew")
	@ObfuscatedSignature(
		descriptor = "(Lnb;)I"
	)
	public static int ew(nb var0) {
		return var0.ak_fld & 7;
	}

	@ObfuscatedName("getId")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getId")
	@Override
	public int getId() {
		return this.bf_fld;
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int cs() {
		return this.bp_fld;
	}

	@ObfuscatedName("fw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIIB)I"
	)
	static final int fw(String var0, String var1, int var2, int var3, int var4, int var5, int var6) throws EOFException {
		try {
			return ky.fl(var0, var1, var2, var3, var4, var5, var6, false, 0);
		} catch (Throwable var7) {
			throw new RuntimeException(var7);
		}
	}

	@ObfuscatedName("getBoundsY")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getBoundsY")
	@Override
	public int getBoundsY() {
		return this.br_fld;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;Ljava/lang/String;I)[F"
	)
	static float[] ak(JSONObject var0, String var1) throws JSONException {
		float[] var3 = new float[4];

		try {
			JSONArray var4 = var0.getJSONArray(var1);
			var3[0] = (float)var4.optDouble(0, 0.0);
			var3[1] = (float)var4.optDouble(1, 0.0);
			var3[2] = (float)var4.optDouble(2, 1.0);
			var3[3] = (float)var4.optDouble(3, 1.0);
		} catch (JSONException var5) {
			var3[0] = 0.0F;
			var3[1] = 0.0F;
			var3[2] = 1.0F;
			var3[3] = 1.0F;
		}

		return var3;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	public int ay(byte var1) {
		return this.bf_fld;
	}

	@ObfuscatedName("getBoundsWidth")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getBoundsWidth")
	@Override
	public int getBoundsWidth() {
		return this.be_fld;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	public int af(byte var1) {
		return this.bm_fld;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)Lkt;"
	)
	public kt au(byte var1) {
		return this.bl_fld;
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int cf() {
		return this.bh_fld;
	}
}
