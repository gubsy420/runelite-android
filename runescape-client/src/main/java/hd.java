import java.io.EOFException;
import java.util.Iterator;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("hd")
public class hd implements hj {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 69749613
	)
	int ag_fld;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int aj_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 997670143
	)
	int az_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1074783777
	)
	int av_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1605911875
	)
	int ae_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -132158591
	)
	int ah_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -16730979
	)
	int aw_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1980003861
	)
	int ay_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1720016651
	)
	int as_fld;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1759212255
	)
	int ar_fld;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 162844013
	)
	int af_fld;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -2063650161
	)
	int al_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1915075895
	)
	int ak_fld;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1880902939
	)
	int au_fld;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1579075557
	)
	int ax_fld;
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int bk_fld;
	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int cn_fld;
	@ObfuscatedName("qt")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	protected static boolean qt_fld;

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lkj;"
	)
	@Override
	public kj ae(int var1, int var2, byte var3) {
		if (!this.az(var1, var2, (byte)37)) {
			return null;
		} else {
			int var4 = this.aw_fld - this.af_fld + var1 + (this.az_fld - this.ae_fld);
			int var5 = this.ay_fld - this.al_fld + var2 + (this.av_fld - this.ah_fld);
			return new kj(this.ak_fld, var4, var5);
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lhf;B)V"
	)
	@Override
	public void ak(hf var1, byte var2) {
		if (var1.ak_fld > this.ae_fld) {
			if (var2 == 3) {
				return;
			}

			var1.ak_fld = this.ae_fld * -1575960911;
		}

		if (var1.ag_fld < this.ae_fld) {
			if (var2 == 3) {
				return;
			}

			var1.ag_fld = this.ae_fld * 1150825709;
		}

		if (var1.az_fld > this.ah_fld) {
			var1.az_fld = 671833357 * this.ah_fld;
		}

		if (var1.av_fld < this.ah_fld) {
			var1.av_fld = this.ah_fld * -1872889183;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z"
	)
	@Override
	public boolean ag(int var1, int var2, int var3, int var4) {
		return var1 >= this.ak_fld && var1 < this.ag_fld + this.ak_fld
			? var2 >= (this.az_fld << 6) + (this.aw_fld << 3)
				&& var2 <= (this.az_fld << 6) + (this.as_fld << 3) + 7
				&& var3 >= (this.ay_fld << 3) + (this.av_fld << 6)
				&& var3 <= 7 + (this.av_fld << 6) + (this.ar_fld << 3)
			: false;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z"
	)
	@Override
	public boolean az(int var1, int var2, byte var3) {
		return var1 >= (this.ae_fld << 6) + (this.af_fld << 3)
			&& var1 <= (this.ae_fld << 6) + (this.au_fld << 3) + 7
			&& var2 >= (this.ah_fld << 6) + (this.al_fld << 3)
			&& var2 <= (this.ah_fld << 6) + (this.ax_fld << 3) + 7;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I"
	)
	@Override
	public int[] av(int var1, int var2, int var3, int var4) {
		return !this.ag(var1, var2, var3, -1751802665)
			? null
			: new int[]{this.af_fld - this.aw_fld + var2 + (this.ae_fld - this.az_fld), this.ah_fld - this.av_fld + var3 + (this.al_fld - this.ay_fld)};
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lhf;)V"
	)
	@Override
	public void as(hf var1) {
		if (var1.ak_fld > this.ae_fld) {
			var1.ak_fld = this.ae_fld * -1575960911;
		}

		if (var1.ag_fld < this.ae_fld) {
			var1.ag_fld = this.ae_fld * -390125662;
		}

		if (var1.az_fld > this.ah_fld) {
			var1.az_fld = 671833357 * this.ah_fld;
		}

		if (var1.av_fld < this.ah_fld) {
			var1.av_fld = this.ah_fld * -47386585;
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
		this.as_fld = var1.cg();
		this.av_fld = var1.cm();
		this.ay_fld = var1.cg();
		this.ar_fld = var1.cg();
		this.ae_fld = var1.cm();
		this.af_fld = var1.cg();
		this.au_fld = var1.cg();
		this.ah_fld = var1.cm();
		this.al_fld = var1.cg();
		this.ax_fld = var1.cg();
		this.aw();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	void aw() {
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	@Override
	public boolean al(int var1, int var2) {
		return var1 >= (this.ae_fld << 6) + (this.af_fld << 3)
			&& var1 <= (this.ae_fld << 6) + (this.au_fld << 3) + 7
			&& var2 >= (this.ah_fld << 6) + (this.al_fld << 3)
			&& var2 <= (this.ah_fld << 6) + (this.ax_fld << 3) + 7;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bm() {
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lhf;)V"
	)
	@Override
	public void ar(hf var1) {
		if (var1.ak_fld > this.ae_fld) {
			var1.ak_fld = this.ae_fld * -1968437939;
		}

		if (var1.ag_fld < this.ae_fld) {
			var1.ag_fld = this.ae_fld * 1653518072;
		}

		if (var1.az_fld > this.ah_fld) {
			var1.az_fld = -722362839 * this.ah_fld;
		}

		if (var1.av_fld < this.ah_fld) {
			var1.av_fld = this.ah_fld * -1872889183;
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	@Override
	public boolean aa(int var1, int var2) {
		return var1 >= (this.ae_fld << 6) + (this.af_fld << 3)
			&& var1 <= (this.ae_fld << 6) + (this.au_fld << 3) + 7
			&& var2 >= (this.ah_fld << 6) + (this.al_fld << 3)
			&& var2 <= (this.ah_fld << 6) + (this.ax_fld << 3) + 7;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lhf;)V"
	)
	@Override
	public void ay(hf var1) {
		if (var1.ak_fld > this.ae_fld) {
			var1.ak_fld = this.ae_fld * -1575960911;
		}

		if (var1.ag_fld < this.ae_fld) {
			var1.ag_fld = this.ae_fld * 1150825709;
		}

		if (var1.az_fld > this.ah_fld) {
			var1.az_fld = 671833357 * this.ah_fld;
		}

		if (var1.av_fld < this.ah_fld) {
			var1.av_fld = this.ah_fld * -1872889183;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	@Override
	public boolean an(int var1, int var2) {
		return var1 >= (this.ae_fld << 6) + (this.af_fld << 3)
			&& var1 <= (this.ae_fld << 6) + (this.au_fld << 3) + 7
			&& var2 >= (this.ah_fld << 6) + (this.al_fld << 3)
			&& var2 <= (this.ah_fld << 6) + (this.ax_fld << 3) + 7;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	@Override
	public boolean au(int var1, int var2) {
		return var1 >= (this.ae_fld << 6) + (this.af_fld << 3)
			&& var1 <= (this.ae_fld << 6) + (this.au_fld << 3) + 7
			&& var2 >= (this.ah_fld << 6) + (this.al_fld << 3)
			&& var2 <= (this.ah_fld << 6) + (this.ax_fld << 3) + 7;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	@Override
	public boolean ax(int var1, int var2) {
		return var1 >= (this.ae_fld << 6) + (this.af_fld << 3)
			&& var1 <= (this.ae_fld << 6) + (this.au_fld << 3) + 7
			&& var2 >= (this.ah_fld << 6) + (this.al_fld << 3)
			&& var2 <= (this.ah_fld << 6) + (this.ax_fld << 3) + 7;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(III)[I"
	)
	@Override
	public int[] ai(int var1, int var2, int var3) {
		return !this.ag(var1, var2, var3, -1703796573)
			? null
			: new int[]{this.af_fld - this.aw_fld + var2 + (this.ae_fld - this.az_fld), this.ah_fld - this.av_fld + var3 + (this.al_fld - this.ay_fld)};
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(III)[I"
	)
	@Override
	public int[] aq(int var1, int var2, int var3) {
		return !this.ag(var1, var2, var3, -1470183180)
			? null
			: new int[]{this.af_fld - this.aw_fld + var2 + (this.ae_fld - this.az_fld), this.ah_fld - this.av_fld + var3 + (this.al_fld - this.ay_fld)};
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(III)[I"
	)
	@Override
	public int[] am(int var1, int var2, int var3) {
		return !this.ag(var1, var2, var3, -1824196848)
			? null
			: new int[]{this.af_fld - this.aw_fld + var2 + (this.ae_fld - this.az_fld), this.ah_fld - this.av_fld + var3 + (this.al_fld - this.ay_fld)};
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)Lkj;"
	)
	@Override
	public kj ad(int var1, int var2) {
		if (!this.az(var1, var2, (byte)114)) {
			return null;
		} else {
			int var3 = this.aw_fld - this.af_fld + var1 + (this.az_fld - this.ae_fld);
			int var4 = this.ay_fld - this.al_fld + var2 + (this.av_fld - this.ah_fld);
			return new kj(this.ak_fld, var3, var4);
		}
	}

	hd() {
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lqa;ILqy;B)I"
	)
	static int ag(qa var0, int var1, qy var2) {
		byte var4 = 0;
		ol var5 = qa.kw(var0, -1939825987);
		if (var5.bl_fld > 0 && var5.by_fld > 0) {
			var1 %= var5.by_fld;
		}

		int var6 = var0.aw(757038204);
		int var7 = var0.ay();
		int var8 = var0.as();
		if (var6 >= var5.bk_fld.length) {
			var6 = 0;
			var7 = 0;
		}

		var7 += var1;

		while (var7 > var5.bf_fld[var6]) {
			var7 -= var5.bf_fld[var6];
			var6++;
			var4 |= 4;
			if ((var4 & 2) == 0 && var2 != null) {
				var2.ak(var5, var6, -411593668);
			}

			if (var6 >= var5.bk_fld.length) {
				var8++;
				var4 |= 1;
				var6 -= var5.bl_fld;
				if (var8 >= var5.bn_fld) {
					var4 |= 2;
				}

				if (var6 < 0 || var6 >= var5.bk_fld.length) {
					var4 |= 2;
					var6 = 0;
				}

				if (0 == (var4 & 2) && var2 != null) {
					var2.ak(var5, var6, -1516537250);
				}
			}
		}

		var0.aa(var6, var7, var8);
		return var4;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	public void ap(xi var1) {
		this.ak_fld = var1.cg();
		this.ag_fld = var1.cg();
		this.az_fld = var1.cm();
		this.aw_fld = var1.cg();
		this.as_fld = var1.cg();
		this.av_fld = var1.cm();
		this.ay_fld = var1.cg();
		this.ar_fld = var1.cg();
		this.ae_fld = var1.cm();
		this.af_fld = var1.cg();
		this.au_fld = var1.cg();
		this.ah_fld = var1.cm();
		this.al_fld = var1.cg();
		this.ax_fld = var1.cg();
		this.aw();
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
		this.as_fld = var1.cg();
		this.av_fld = var1.cm();
		this.ay_fld = var1.cg();
		this.ar_fld = var1.cg();
		this.ae_fld = var1.cm();
		this.af_fld = var1.cg();
		this.au_fld = var1.cg();
		this.ah_fld = var1.cm();
		this.al_fld = var1.cg();
		this.ax_fld = var1.cg();
		this.aw();
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bz() {
	}

	@ObfuscatedName("lw")
	@ObfuscatedSignature(
		descriptor = "(Lyz;)I"
	)
	public static int lw(yz var0) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.ah_fld;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)Lkj;"
	)
	@Override
	public kj ao(int var1, int var2) {
		if (!this.az(var1, var2, (byte)1)) {
			return null;
		} else {
			int var3 = this.aw_fld - this.af_fld + var1 + (this.az_fld - this.ae_fld);
			int var4 = this.ay_fld - this.al_fld + var2 + (this.av_fld - this.ah_fld);
			return new kj(this.ak_fld, var3, var4);
		}
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
		this.as_fld = var1.cg();
		this.av_fld = var1.cm();
		this.ay_fld = var1.cg();
		this.ar_fld = var1.cg();
		this.ae_fld = var1.cm();
		this.af_fld = var1.cg();
		this.au_fld = var1.cg();
		this.ah_fld = var1.cm();
		this.al_fld = var1.cg();
		this.ax_fld = var1.cg();
		this.aw();
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ac() {
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bd() {
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(Ldx;I)V"
	)
	static void cg(dx var0, int var1) throws EOFException {
		int var2 = client.db_fld.al_fld;
		int[] var3 = client.db_fld.ar_fld;

		for (int var4 = 0; var4 < var2; var4++) {
			if (var3[var4] != client.nq_fld) {
				if (var1 >= -2118970203) {
					return;
				}

				if (var3[var4] != client.dj_fld) {
					hb.cw(var0, var3[var4], true, (byte)16);
				}
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(III)Z"
	)
	@Override
	public boolean af(int var1, int var2, int var3) {
		return var1 >= this.ak_fld && var1 < this.ag_fld + this.ak_fld
			? var2 >= (this.az_fld << 6) + (this.aw_fld << 3)
				&& var2 <= (this.az_fld << 6) + (this.as_fld << 3) + 7
				&& var3 >= (this.ay_fld << 3) + (this.av_fld << 6)
				&& var3 <= 7 + (this.av_fld << 6) + (this.ar_fld << 3)
			: false;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	static final void bl() {
		int[] var1 = client.db_fld.ar_fld;
		Iterator var2 = client.da_fld.iterator();

		while (var2.hasNext()) {
			dx var3 = (dx)(dx)var2.next();

			for (int var4 = 0; var4 < client.db_fld.al_fld; var4++) {
				cv var5 = (cv)var3.au_fld.ae(var1[var4]);
				if (var5 != null && var5.ci_fld > 0) {
					var5.ci_fld--;
					if (0 == var5.ci_fld) {
						var5.cx_fld = null;
						var5.st(-1);
					}
				}
			}

			Iterator var6 = var3.ax_fld.iterator();

			while (var6.hasNext()) {
				ds var7 = (ds)(ds)var6.next();
				if (null != var7 && var7.ci_fld > 0) {
					var7.ci_fld--;
					if (var7.ci_fld == 0) {
						var7.cx_fld = null;
						var7.st(-1);
					}
				}
			}
		}
	}
}
