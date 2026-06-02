import java.io.EOFException;
import net.runelite.api.WorldEntityConfig;
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
	@ObfuscatedGetter(
		intValue = 1604810459
	)
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "I"
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
	@ObfuscatedGetter(
		intValue = -1632885803
	)
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int bh_fld;
	@ObfuscatedName("iz")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int iz_fld;
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
	@ObfuscatedGetter(
		intValue = -238276933
	)
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int bm_fld;
	@ObfuscatedGetter(
		intValue = 1500086911
	)
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int bd_fld;
	@ObfuscatedGetter(
		intValue = 1275623879
	)
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int bz_fld;
	@ObfuscatedGetter(
		intValue = -1818382625
	)
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int br_fld;
	@ObfuscatedGetter(
		intValue = 1364828805
	)
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int be_fld;
	@ObfuscatedGetter(
		intValue = -1364262879
	)
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "I"
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
	@ObfuscatedGetter(
		intValue = -2064782363
	)
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "I"
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
	@ObfuscatedGetter(
		intValue = -457075275
	)
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int bo_fld;
	@ObfuscatedGetter(
		intValue = -552044659
	)
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "I"
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

	@ObfuscatedName("yh")
	@ObfuscatedSignature(
		descriptor = "(Loy;)Lyv;"
	)
	public static yv yh(oy var0) throws EOFException {
		try {
			if (557129318 * var0.bo_fld < 0) {
				return null;
			} else {
				yv var1 = (yv)bt_fld.ak(var0.bo_fld);
				if (null != var1) {
					return var1;
				} else {
					var1 = wf.av(ma.bv_fld, var0.bo_fld, 0);
					if (null != var1) {
						bt_fld.az(var1, var0.bo_fld);
					}

					return var1;
				}
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int bv() {
		return this.by_fld;
	}

	@ObfuscatedName("getBoundsWidth")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getBoundsWidth() {
		return this.be_fld;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	public int az(byte var1) {
		return this.bf_fld;
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

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ab() {
		return this.bf_fld;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	public int ay(byte var1) {
		return this.by_fld;
	}

	@ObfuscatedName("getId")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getId() {
		return this.bf_fld;
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int bi() {
		return this.bd_fld;
	}

	@ObfuscatedName("getBoundsHeight")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getBoundsHeight() {
		return this.bs_fld;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Lvr;"
	)
	public vr al(int var1) {
		return this.bk_fld;
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

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(Loy;Lxi;I)V"
	)
	public static void bb(oy var0, xi var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		} else {
			switch (var2) {
				case 2:
					var0.by_fld = var1.cg();
				case 3:
				case 10:
				case 11:
				case 13:
				case 21:
				case 22:
				default:
					break;
				case 4:
					var0.bm_fld = var1.cz();
					break;
				case 5:
					var0.bd_fld = var1.cz();
					break;
				case 6:
					var0.bz_fld = var1.cz() * -715189235;
					break;
				case 7:
					var0.br_fld = var1.cz();
					break;
				case 8:
					var0.be_fld = xi.tx(var1, 333071818);
					break;
				case 9:
					var0.bs_fld = xi.tx(var1, 1663820149) * 1541929926;
					break;
				case 12:
					var0.at_fld = xi.kc(var1, 1034205777);
					break;
				case 14:
					var0.aj_fld = true;
					break;
				case 15:
				case 16:
				case 17:
				case 18:
				case 19:
					int var5 = var2 - 15;
					var0.ac_fld[var5] = xi.kc(var1, 667210126);
					if (var0.ac_fld[var5].equalsIgnoreCase(kh.ao_fld)) {
						var0.ac_fld[var5] = null;
					}

					var0.aj_fld = true;
					break;
				case 20:
					xi.tx(var1, 1190556325);
					break;
				case 23:
					kt[] var3 = new kt[]{kt.ak_fld, kt.ag_fld, kt.az_fld, kt.av_fld};
					var0.bl_fld = (kt)ka.ak(var3, var1.cg());
					break;
				case 24:
					jf[] var4 = new jf[]{jf.ak_fld, jf.ag_fld, jf.az_fld};
					var0.bx_fld = (jf)ka.ak(var4, var1.cg());
					break;
				case 25:
					var0.bh_fld = xi.tx(var1, 462260302);
					break;
				case 26:
					var0.bo_fld = var1.do_();
					break;
				case 27:
					var0.bp_fld = xi.tx(var1, 1406515288);
			}
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Ljf;"
	)
	public jf ax(int var1) {
		return this.bx_fld;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int aa(int var1) {
		return this.bp_fld;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lub;Lub;)V"
	)
	public static void aq(ub var0, ub var1) {
		ep.ao_fld = var0;
		ma.bv_fld = var1;
	}

	@ObfuscatedName("getBoundsX")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getBoundsX() {
		return this.bz_fld;
	}

	@ObfuscatedName("wb")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	public void wb(xi var1, int var2) {
		if (var2 == 20) {
			int var3 = var1.hb();
			this.iz_fld = var1.if_int();
			var1.rr(var3);
		}
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

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void by() {
		short var1 = 256;
		this.bj_fld[0] = new vr(this.be_fld + var1, this.bs_fld + var1, 1231826504 * this.bz_fld, this.br_fld);
		int var2 = -1720073318;
		this.bj_fld[2] = new vr(this.be_fld + var2, var2 + this.bs_fld, -843650114 * this.bz_fld, this.br_fld);
		var2 = 1972586031;
		this.bj_fld[1] = new vr(this.be_fld + var2, this.bs_fld + var2, this.bz_fld, this.br_fld * 1274068209);
		this.bj_fld[3] = this.bj_fld[1];
	}

	@ObfuscatedName("oj")
	@ObfuscatedSignature(
		descriptor = "(Loy;B)I"
	)
	public static int oj(oy var0, byte var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.bh_fld;
	}

	@ObfuscatedName("md")
	@ObfuscatedSignature(
		descriptor = "(Loy;)V"
	)
	public static void md(oy var0) {
		if (var0 == null) {
			var0.getClass();
		}

		int var1 = 319381548;
		var0.bj_fld[0] = new vr(var0.be_fld + var1, var0.bs_fld + var1, -2059997923 * var0.bz_fld, -317772864 * var0.br_fld);
		var1 = -1741218927;
		var0.bj_fld[2] = new vr(var0.be_fld + var1, var1 + var0.bs_fld, 2052369234 * var0.bz_fld, var0.br_fld);
		short var3 = 334;
		var0.bj_fld[1] = new vr(var0.be_fld + var3, var0.bs_fld + var3, var0.bz_fld * 1326428703, var0.br_fld);
		var0.bj_fld[3] = var0.bj_fld[1];
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

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "()Ljf;"
	)
	public jf cc() {
		return this.bx_fld;
	}

	@ObfuscatedName("getCategory")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getCategory() {
		return this.iz_fld;
	}

	@ObfuscatedName("mg")
	@ObfuscatedSignature(
		descriptor = "(Loy;Lxi;)V"
	)
	public static void mg(oy var0, xi var1) {
		if (var0 == null) {
			var0.getClass();
		} else {
			while (true) {
				int var2 = var1.cg();
				if (0 == var2) {
					return;
				}

				var0.ae(var1, var2, 574029715);
			}
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ap() {
		return this.bf_fld;
	}

	@ObfuscatedName("uj")
	@ObfuscatedSignature(
		descriptor = "(Loy;I)Lyv;"
	)
	public static yv uj(oy var0, int var1) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			if (var0.bo_fld < 0) {
				return null;
			} else {
				yv var2 = (yv)bt_fld.ak(var0.bo_fld);
				if (null != var2) {
					return var2;
				} else {
					var2 = wf.av(ma.bv_fld, var0.bo_fld, 0);
					if (null != var2) {
						bt_fld.az(var2, var0.bo_fld);
					}

					return var2;
				}
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
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
				this.be_fld = xi.tx(var1, 1671512842) * -177014916;
				break;
			case 9:
				this.bs_fld = xi.tx(var1, 1091560265) * 1687218356;
				break;
			case 12:
				this.at_fld = xi.kc(var1, 1522192102);
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
				this.ac_fld[var5] = xi.kc(var1, -317294146);
				if (this.ac_fld[var5].equalsIgnoreCase(kh.ao_fld)) {
					this.ac_fld[var5] = null;
				}

				this.aj_fld = true;
				break;
			case 20:
				xi.tx(var1, 1281107071);
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
				this.bh_fld = xi.tx(var1, 1414436773) * -452684870;
				break;
			case 26:
				this.bo_fld = var1.do_();
				break;
			case 27:
				this.bp_fld = xi.tx(var1, 1441022165) * -1060389173;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Loy;)V"
	)
	public static void ay(oy var0) {
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
				this.be_fld = xi.tx(var1, 558246051);
				break;
			case 9:
				this.bs_fld = xi.tx(var1, 849218343);
				break;
			case 12:
				this.at_fld = xi.kc(var1, -1892758918);
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
				this.ac_fld[var5] = xi.kc(var1, -1106915883);
				if (this.ac_fld[var5].equalsIgnoreCase(kh.ao_fld)) {
					this.ac_fld[var5] = null;
				}

				this.aj_fld = true;
				break;
			case 20:
				xi.tx(var1, 978887583);
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
				this.bh_fld = xi.tx(var1, 1833208883);
				break;
			case 26:
				this.bo_fld = var1.do_();
				break;
			case 27:
				this.bp_fld = xi.tx(var1, 1728371013);
		}
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int bw() {
		return this.bh_fld;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bj() {
		this.bk_fld = new vr(this.be_fld, 633860014 * this.bs_fld, this.bz_fld * 1012132778, this.br_fld * 1711009285);
		this.aw(865799950);
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bh() {
		this.bk_fld = new vr(this.be_fld, this.bs_fld, this.bz_fld, this.br_fld);
		this.aw(743394638);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lxi;II)V"
	)
	void ae(xi var1, int var2, int var3) {
		this.wb(var1, var2);
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
				this.be_fld = xi.tx(var1, 903268694);
				break;
			case 9:
				this.bs_fld = xi.tx(var1, 1318673575);
				break;
			case 12:
				this.at_fld = xi.kc(var1, 1175274748);
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
				this.ac_fld[var6] = xi.kc(var1, -1716107448);
				if (this.ac_fld[var6].equalsIgnoreCase(kh.ao_fld)) {
					this.ac_fld[var6] = null;
				}

				this.aj_fld = true;
				break;
			case 20:
				xi.tx(var1, 393826662);
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
				this.bh_fld = xi.tx(var1, 580286075);
				break;
			case 26:
				this.bo_fld = var1.do_();
				break;
			case 27:
				this.bp_fld = xi.tx(var1, 850691755);
		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bs() {
		short var1 = 256;
		this.bj_fld[0] = new vr(this.be_fld + var1, this.bs_fld + var1, 2044240457 * this.bz_fld, -1457713205 * this.br_fld);
		var1 = 362;
		this.bj_fld[2] = new vr(this.be_fld + var1, var1 + this.bs_fld, this.bz_fld, this.br_fld);
		int var3 = -1252573112;
		this.bj_fld[1] = new vr(this.be_fld + var3, this.bs_fld + var3, this.bz_fld, this.br_fld * 237990501);
		this.bj_fld[3] = this.bj_fld[1];
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int bp() {
		return this.by_fld;
	}

	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "(Loy;)V"
	)
	public static void ik(oy var0) {
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

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bk() {
		this.bk_fld = new vr(819921963 * this.be_fld, 1649803245 * this.bs_fld, this.bz_fld, this.br_fld);
		this.aw(-44871191);
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

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int bn() {
		return this.bd_fld;
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

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "()Lkt;"
	)
	public kt bb() {
		return this.bl_fld;
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "()Lkt;"
	)
	public kt cd() {
		return this.bl_fld;
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "()Ljf;"
	)
	public jf cq() {
		return this.bx_fld;
	}

	@ObfuscatedName("kp")
	@ObfuscatedSignature(
		descriptor = "()Lyv;"
	)
	public yv kp() {
		try {
			return uj(this, 693675935);
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
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
		descriptor = "(Loy;I)I"
	)
	public static int ad(oy var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.bm_fld;
		}
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

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int cf() {
		return this.bp_fld;
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int cx() {
		return this.bp_fld;
	}

	@ObfuscatedName("ob")
	@ObfuscatedSignature(
		descriptor = "(Loy;B)I"
	)
	public static int ob(oy var0, byte var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.bd_fld;
		}
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int cs() {
		return this.bp_fld;
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int cp() {
		return this.bp_fld;
	}

	@ObfuscatedName("fw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIII)I"
	)
	static final int fw(String var0, String var1, int var2, int var3, int var4, int var5, int var6) {
		return ky.fl(var0, var1, var2, var3, var4, var5, var6, false, 0);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;Ljava/lang/String;)[F"
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

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int as(int var1) {
		return this.bm_fld;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	public int af(byte var1) {
		return this.bh_fld;
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	void be(xi var1, int var2) {
		switch (var2) {
			case 2:
				this.be_fld = var1.ei() * 1181419444;
			case 3:
			case 10:
			case 11:
			case 13:
			case 21:
			case 22:
			default:
				break;
			case 4:
				this.by_fld = var1.kv(1156269875) * -1371700209;
				break;
			case 5:
				this.bs_fld = var1.kv(1156269875) * -1128046032;
				break;
			case 6:
				this.be_fld = var1.dr() * 2064742391;
				break;
			case 7:
				this.bp_fld = var1.cz() * 556078522;
				break;
			case 8:
				this.bm_fld = xi.tx(var1, 930652541) * -1983969715;
				break;
			case 9:
				this.bs_fld = xi.tx(var1, 1086880211) * -1122161708;
				break;
			case 12:
				this.at_fld = xi.kc(var1, -1609502902);
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
				this.ac_fld[var5] = xi.kc(var1, 508518201);
				if (this.ac_fld[var5].equalsIgnoreCase(kh.dj_fld)) {
					this.ac_fld[var5] = null;
				}

				this.aj_fld = true;
				break;
			case 20:
				xi.tx(var1, 1669419760);
				break;
			case 23:
				kt[] var3 = new kt[]{kt.aw_fld, kt.az_fld, kt.aw_fld, kt.aw_fld};
				this.bl_fld = (kt)ka.ak(var3, var1.cg());
				break;
			case 24:
				jf[] var4 = new jf[]{jf.ak_fld, jf.ay_fld, jf.ag_fld};
				this.bx_fld = (jf)ka.ak(var4, var1.do_());
				break;
			case 25:
				this.bs_fld = xi.tx(var1, 1300747974) * -2067169532;
				break;
			case 26:
				this.bz_fld = var1.dm() * -777490275;
				break;
			case 27:
				this.bz_fld = xi.tx(var1, 1909141280) * 53820900;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Lyv;"
	)
	public yv an(int var1) {
		try {
			if (-457075275 * this.be_fld < 0) {
				return null;
			} else {
				yv var2 = (yv)bt_fld.aw(this.br_fld * -457075275);
				if (null != var2) {
					return var2;
				} else {
					var2 = wf.av(ma.bv_fld, this.bs_fld * -457075275, 0);
					if (null != var2) {
						bt_fld.al(var2, this.bm_fld * -457075275);
					}

					return var2;
				}
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("nq")
	@ObfuscatedSignature(
		descriptor = "(Loy;)V"
	)
	public static void nq(oy var0) {
		if (var0 == null) {
			var0.getClass();
		} else {
			int var1 = 354789605;
			var0.bj_fld[0] = new vr(var0.be_fld + var1, var0.bs_fld + var1, -605980341 * var0.bz_fld, var0.br_fld);
			var1 = 549813274;
			var0.bj_fld[2] = new vr(var0.be_fld + var1, var1 + var0.bs_fld, var0.bz_fld, var0.br_fld);
			short var3 = 334;
			var0.bj_fld[1] = new vr(var0.be_fld + var3, var0.bs_fld + var3, var0.bz_fld, var0.br_fld);
			var0.bj_fld[3] = var0.bj_fld[1];
		}
	}

	@ObfuscatedName("getBoundsY")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getBoundsY() {
		return this.br_fld;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)Lkt;"
	)
	public kt au(byte var1) {
		return this.bl_fld;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "()Lvr;"
	)
	public vr bq() {
		return this.bk_fld;
	}

	@ObfuscatedName("ma")
	@ObfuscatedSignature(
		descriptor = "(Loy;B)Lkt;"
	)
	public static kt ma(oy var0, byte var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.bl_fld;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	public int ar(byte var1) {
		return this.br_fld;
	}
}
