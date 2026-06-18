import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("gz")
public class gz implements hj {
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bk_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 815444073
	)
	int ag_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -22362671
	)
	int az_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 2034521517
	)
	int aw_fld;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1701252943
	)
	int ar_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 626736503
	)
	int ah_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -134153513
	)
	int ak_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1203876071
	)
	int ay_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 781006447
	)
	int ae_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1430167373
	)
	int as_fld;
	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bx_fld;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -776631127
	)
	static int ax_fld;
	@ObfuscatedName("gb")
	@ObfuscatedSignature(
		descriptor = "Ldd;"
	)
	static dd gb_fld;
	@ObfuscatedName("hy")
	@ObfuscatedSignature(
		descriptor = "Luv;"
	)
	static uv hy_fld;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ao_fld;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1990891223
	)
	static int bj_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -390045263
	)
	int av_fld;

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z"
	)
	@Override
	public boolean ag(int var1, int var2, int var3, int var4) {
		return var1 >= this.ak_fld && var1 < this.ak_fld + this.ag_fld
			? var2 >= (this.az_fld << 6) + (this.aw_fld << 3)
				&& var2 <= 7 + (this.aw_fld << 3) + (this.az_fld << 6)
				&& var3 >= (this.av_fld << 6) + (this.ay_fld << 3)
				&& var3 <= 7 + (this.ay_fld << 3) + (this.av_fld << 6)
			: false;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(III)[I"
	)
	@Override
	public int[] am(int var1, int var2, int var3) {
		return !this.ag(var1, var2, var3, -1301459915)
			? null
			: new int[]{this.as_fld - this.aw_fld + this.ae_fld - this.az_fld + var2, var3 + (this.ah_fld - this.av_fld) + (this.ar_fld - this.ay_fld)};
	}

	gz() {
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z"
	)
	@Override
	public boolean az(int var1, int var2, byte var3) {
		return var1 >= (this.as_fld << 3) + (this.ae_fld << 6)
			&& var1 <= (this.as_fld << 3) + (this.ae_fld << 6) + 7
			&& var2 >= (this.ar_fld << 3) + (this.ah_fld << 6)
			&& var2 <= 7 + (this.ah_fld << 6) + (this.ar_fld << 3);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I"
	)
	@Override
	public int[] av(int var1, int var2, int var3, int var4) {
		return !this.ag(var1, var2, var3, -1561245682)
			? null
			: new int[]{this.as_fld - this.aw_fld + this.ae_fld - this.az_fld + var2, var3 + (this.ah_fld - this.av_fld) + (this.ar_fld - this.ay_fld)};
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lkj;"
	)
	@Override
	public kj ae(int var1, int var2, byte var3) {
		if (!this.az(var1, var2, (byte)84)) {
			return null;
		} else {
			int var4 = this.az_fld - this.ae_fld + var1 + (this.aw_fld - this.as_fld);
			int var5 = var2 + (this.av_fld - this.ah_fld) + (this.ay_fld - this.ar_fld);
			return new kj(this.ak_fld, var4, var5);
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	@Override
	public void ah(xi var1, int var2) {
		this.ak_fld = var1.cg();
		this.ag_fld = var1.cg();
		this.az_fld = var1.cm();
		this.aw_fld = var1.cg();
		this.av_fld = var1.cm();
		this.ay_fld = var1.cg();
		this.ae_fld = var1.cm();
		this.as_fld = var1.cg();
		this.ah_fld = var1.cm();
		this.ar_fld = var1.cg();
		pc(this, 613783119);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	@Override
	public boolean al(int var1, int var2) {
		return var1 >= (this.as_fld << 3) + (this.ae_fld << 6)
			&& var1 <= (this.as_fld << 3) + (this.ae_fld << 6) + 7
			&& var2 >= (this.ar_fld << 3) + (this.ah_fld << 6)
			&& var2 <= 7 + (this.ah_fld << 6) + (this.ar_fld << 3);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lhf;)V"
	)
	@Override
	public void ay(hf var1) {
		if (var1.ak_fld > this.ae_fld) {
			var1.ak_fld = this.ae_fld * -2030151990;
		}

		if (var1.ag_fld < this.ae_fld) {
			var1.ag_fld = 996835886 * this.ae_fld;
		}

		if (var1.az_fld > this.ah_fld) {
			var1.az_fld = 668826507 * this.ah_fld;
		}

		if (var1.av_fld < this.ah_fld) {
			var1.av_fld = this.ah_fld * 2092428336;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lhf;)V"
	)
	@Override
	public void as(hf var1) {
		if (var1.ak_fld > this.ae_fld) {
			var1.ak_fld = this.ae_fld * 1470968619;
		}

		if (var1.ag_fld < this.ae_fld) {
			var1.ag_fld = 214769515 * this.ae_fld;
		}

		if (var1.az_fld > this.ah_fld) {
			var1.az_fld = 668826507 * this.ah_fld;
		}

		if (var1.av_fld < this.ah_fld) {
			var1.av_fld = this.ah_fld * -1426368689;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lhf;)V"
	)
	@Override
	public void ar(hf var1) {
		if (var1.ak_fld > this.ae_fld) {
			var1.ak_fld = this.ae_fld * 1470968619;
		}

		if (var1.ag_fld < this.ae_fld) {
			var1.ag_fld = -1949773441 * this.ae_fld;
		}

		if (var1.az_fld > this.ah_fld) {
			var1.az_fld = 668826507 * this.ah_fld;
		}

		if (var1.av_fld < this.ah_fld) {
			var1.av_fld = this.ah_fld * -1560029865;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(III)Z"
	)
	@Override
	public boolean af(int var1, int var2, int var3) {
		return var1 >= this.ak_fld && var1 < this.ak_fld + this.ag_fld
			? var2 >= (this.az_fld << 6) + (this.aw_fld << 3)
				&& var2 <= 7 + (this.aw_fld << 3) + (this.az_fld << 6)
				&& var3 >= (this.av_fld << 6) + (this.ay_fld << 3)
				&& var3 <= 7 + (this.ay_fld << 3) + (this.av_fld << 6)
			: false;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	@Override
	public boolean aa(int var1, int var2) {
		return var1 >= (this.as_fld << 3) + (this.ae_fld << 6)
			&& var1 <= (this.as_fld << 3) + (this.ae_fld << 6) + 7
			&& var2 >= (this.ar_fld << 3) + (this.ah_fld << 6)
			&& var2 <= 7 + (this.ah_fld << 6) + (this.ar_fld << 3);
	}

	@ObfuscatedName("pc")
	@ObfuscatedSignature(
		descriptor = "(Lgz;I)V"
	)
	public static void pc(gz var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(III)[I"
	)
	@Override
	public int[] aq(int var1, int var2, int var3) {
		return !this.ag(var1, var2, var3, -1943388626)
			? null
			: new int[]{this.as_fld - this.aw_fld + this.ae_fld - this.az_fld + var2, var3 + (this.ah_fld - this.av_fld) + (this.ar_fld - this.ay_fld)};
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	@Override
	public boolean au(int var1, int var2) {
		return var1 >= (this.as_fld << 3) + (this.ae_fld << 6)
			&& var1 <= (this.as_fld << 3) + (this.ae_fld << 6) + 7
			&& var2 >= (this.ar_fld << 3) + (this.ah_fld << 6)
			&& var2 <= 7 + (this.ah_fld << 6) + (this.ar_fld << 3);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(III)[I"
	)
	@Override
	public int[] ai(int var1, int var2, int var3) {
		return !this.ag(var1, var2, var3, -558479765)
			? null
			: new int[]{this.as_fld - this.aw_fld + this.ae_fld - this.az_fld + var2, var3 + (this.ah_fld - this.av_fld) + (this.ar_fld - this.ay_fld)};
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	@Override
	public boolean ax(int var1, int var2) {
		return var1 >= (this.as_fld << 3) + (this.ae_fld << 6)
			&& var1 <= (this.as_fld << 3) + (this.ae_fld << 6) + 7
			&& var2 >= (this.ar_fld << 3) + (this.ah_fld << 6)
			&& var2 <= 7 + (this.ah_fld << 6) + (this.ar_fld << 3);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void aj() {
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	public void at(xi var1) {
		this.ak_fld = var1.cg();
		this.ag_fld = var1.cg();
		this.az_fld = var1.cm();
		this.aw_fld = var1.cg();
		this.av_fld = var1.cm();
		this.ay_fld = var1.cg();
		this.ae_fld = var1.cm();
		this.as_fld = var1.cg();
		this.ah_fld = var1.cm();
		this.ar_fld = var1.cg();
		pc(this, -262745869);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	public void ab(xi var1) {
		this.ak_fld = var1.cg();
		this.ag_fld = var1.cg();
		this.az_fld = var1.cm();
		this.aw_fld = var1.cg();
		this.av_fld = var1.cm();
		this.ay_fld = var1.cg();
		this.ae_fld = var1.cm();
		this.as_fld = var1.cg();
		this.ah_fld = var1.cm();
		this.ar_fld = var1.cg();
		pc(this, -136428730);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)Lkj;"
	)
	@Override
	public kj ad(int var1, int var2) {
		if (!this.az(var1, var2, (byte)47)) {
			return null;
		} else {
			int var3 = this.az_fld - this.ae_fld + var1 + (this.aw_fld - this.as_fld);
			int var4 = var2 + (this.av_fld - this.ah_fld) + (this.ay_fld - this.ar_fld);
			return new kj(this.ak_fld, var3, var4);
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)Lkj;"
	)
	@Override
	public kj ao(int var1, int var2) {
		if (!this.az(var1, var2, (byte)97)) {
			return null;
		} else {
			int var3 = this.az_fld - this.ae_fld + var1 + (this.aw_fld - this.as_fld);
			int var4 = var2 + (this.av_fld - this.ah_fld) + (this.ay_fld - this.ar_fld);
			return new kj(this.ak_fld * -1081219447, var3, var4);
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	@Override
	public boolean an(int var1, int var2) {
		return var1 >= (this.as_fld << 3) + (this.ae_fld << 6)
			&& var1 <= (this.as_fld << 3) + (this.ae_fld << 6) + 7
			&& var2 >= (this.ar_fld << 3) + (this.ah_fld << 6)
			&& var2 <= 7 + (this.ah_fld << 6) + (this.ar_fld << 3);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	public void ap(xi var1) {
		this.ak_fld = var1.cg() * -206598910;
		this.ag_fld = var1.cg();
		this.az_fld = var1.cm();
		this.aw_fld = var1.cg();
		this.av_fld = var1.cm() * 2089659798;
		this.ay_fld = var1.cg();
		this.ae_fld = var1.cm() * 724511145;
		this.as_fld = var1.cg();
		this.ah_fld = var1.cm() * 2146996293;
		this.ar_fld = var1.cg() * 1926842959;
		pc(this, -1292359751);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lhf;B)V"
	)
	@Override
	public void ak(hf var1, byte var2) {
		if (var1.ak_fld > this.ae_fld) {
			var1.ak_fld = this.ae_fld * 1470968619;
		}

		if (var1.ag_fld < this.ae_fld) {
			if (var2 == 3) {
				return;
			}

			var1.ag_fld = -1949773441 * this.ae_fld;
		}

		if (var1.az_fld > this.ah_fld) {
			var1.az_fld = 668826507 * this.ah_fld;
		}

		if (var1.av_fld < this.ah_fld) {
			var1.av_fld = this.ah_fld * -1560029865;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ac() {
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)Lfe;"
	)
	static fe ag(int var0) throws EOFException {
		synchronized (ol.bm_fld) {
			int var5 = -855983050;
			fe var6 = (fe)ol.bm_fld.ak(var0);
			fe var10000;
			if (var6 != null) {
				var10000 = var6;
			} else {
				var6 = gt.ak(gd.ap_fld, pm.ac_fld, var0);
				if (var6 != null) {
					ol.bm_fld.az(var6, var0);
				}

				var10000 = var6;
			}

			return var10000;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void aw(int var1) {
	}
}
