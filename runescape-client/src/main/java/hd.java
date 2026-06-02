import java.io.EOFException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("hd")
public class hd implements hj {
	@ObfuscatedGetter(
		intValue = 69749613
	)
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int av_fld;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int aj_fld;
	@ObfuscatedGetter(
		intValue = 997670143
	)
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int aw_fld;
	@ObfuscatedGetter(
		intValue = -1074783777
	)
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ax_fld;
	@ObfuscatedGetter(
		intValue = -1605911875
	)
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ak_fld;
	@ObfuscatedGetter(
		intValue = -132158591
	)
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int au_fld;
	@ObfuscatedGetter(
		intValue = -16730979
	)
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int al_fld;
	@ObfuscatedGetter(
		intValue = -1980003861
	)
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ah_fld;
	@ObfuscatedGetter(
		intValue = 1720016651
	)
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ar_fld;
	@ObfuscatedGetter(
		intValue = 1759212255
	)
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int af_fld;
	@ObfuscatedGetter(
		intValue = 162844013
	)
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ae_fld;
	@ObfuscatedGetter(
		intValue = -2063650161
	)
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int as_fld;
	@ObfuscatedGetter(
		intValue = -1915075895
	)
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ay_fld;
	@ObfuscatedGetter(
		intValue = 1880902939
	)
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ag_fld;
	@ObfuscatedGetter(
		intValue = -1579075557
	)
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int az_fld;
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
			int var4 = this.al_fld - this.ae_fld + var1 + (this.aw_fld - this.ak_fld);
			int var5 = this.ah_fld - this.as_fld + var2 + (this.ax_fld - this.au_fld);
			return new kj(this.ay_fld, var4, var5);
		}
	}

	@ObfuscatedName("im")
	@ObfuscatedSignature(
		descriptor = "(Lhd;B)V"
	)
	public static void im(hd var0, byte var1) {
		if (var0 == null) {
			var0.getClass();
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lhf;B)V"
	)
	@Override
	public void ak(hf var1, byte var2) {
		if (var1.az_fld > this.ak_fld) {
			if (var2 == 3) {
				return;
			}

			var1.az_fld = this.ak_fld * -1575960911;
		}

		if (var1.ak_fld < this.ak_fld) {
			if (var2 == 3) {
				return;
			}

			var1.ak_fld = this.ak_fld * 1150825709;
		}

		if (var1.av_fld > this.au_fld) {
			var1.av_fld = 671833357 * this.au_fld;
		}

		if (var1.ag_fld < this.au_fld) {
			var1.ag_fld = this.au_fld * -1872889183;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z"
	)
	@Override
	public boolean ag(int var1, int var2, int var3, int var4) {
		return var1 >= this.ay_fld && var1 < this.av_fld + this.ay_fld
			? var2 >= (this.aw_fld << 6) + (this.al_fld << 3)
				&& var2 <= (this.aw_fld << 6) + (this.ar_fld << 3) + 7
				&& var3 >= (this.ah_fld << 3) + (this.ax_fld << 6)
				&& var3 <= 7 + (this.ax_fld << 6) + (this.af_fld << 3)
			: false;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z"
	)
	@Override
	public boolean az(int var1, int var2, byte var3) {
		return var1 >= (this.ak_fld << 6) + (this.ae_fld << 3)
			&& var1 <= (this.ak_fld << 6) + (this.ag_fld << 3) + 7
			&& var2 >= (this.au_fld << 6) + (this.as_fld << 3)
			&& var2 <= (this.au_fld << 6) + (this.az_fld << 3) + 7;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I"
	)
	@Override
	public int[] av(int var1, int var2, int var3, int var4) {
		return !this.ag(var1, var2, var3, -1751802665)
			? null
			: new int[]{this.ae_fld - this.al_fld + var2 + (this.ak_fld - this.aw_fld), this.au_fld - this.ax_fld + var3 + (this.as_fld - this.ah_fld)};
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lhf;)V"
	)
	@Override
	public void as(hf var1) {
		if (var1.az_fld > this.ak_fld) {
			var1.az_fld = this.ak_fld * -1575960911;
		}

		if (var1.ak_fld < this.ak_fld) {
			var1.ak_fld = this.ak_fld * -390125662;
		}

		if (var1.av_fld > this.au_fld) {
			var1.av_fld = 671833357 * this.au_fld;
		}

		if (var1.ag_fld < this.au_fld) {
			var1.ag_fld = this.au_fld * -47386585;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	@Override
	public void ah(xi var1, int var2) {
		this.ay_fld = var1.cg();
		this.av_fld = var1.cg();
		this.aw_fld = xi.tx(var1, 739479522);
		this.al_fld = var1.cg();
		this.ar_fld = var1.cg();
		this.ax_fld = xi.tx(var1, 705661527);
		this.ah_fld = var1.cg();
		this.af_fld = var1.cg();
		this.ak_fld = xi.tx(var1, 1118644762);
		this.ae_fld = var1.cg();
		this.ag_fld = var1.cg();
		this.au_fld = xi.tx(var1, 2065579547);
		this.as_fld = var1.cg();
		this.az_fld = var1.cg();
		im(this, (byte)45);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void aj() {
	}

	@ObfuscatedName("ro")
	@ObfuscatedSignature(
		descriptor = "(Lli;)I"
	)
	public static int ro(li var0) {
		return var0.aj_fld;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	@Override
	public boolean au(int var1, int var2) {
		return var1 >= (this.ak_fld << 6) + (this.ae_fld << 3)
			&& var1 <= (this.ak_fld << 6) + (this.ag_fld << 3) + 7
			&& var2 >= (this.au_fld << 6) + (this.as_fld << 3)
			&& var2 <= (this.au_fld << 6) + (this.az_fld << 3) + 7;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bz() {
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lhf;)V"
	)
	@Override
	public void ar(hf var1) {
		if (var1.az_fld > this.ak_fld) {
			var1.az_fld = this.ak_fld * -1968437939;
		}

		if (var1.ak_fld < this.ak_fld) {
			var1.ak_fld = this.ak_fld * 1653518072;
		}

		if (var1.av_fld > this.au_fld) {
			var1.av_fld = -722362839 * this.au_fld;
		}

		if (var1.ag_fld < this.au_fld) {
			var1.ag_fld = this.au_fld * -1872889183;
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	@Override
	public boolean al(int var1, int var2) {
		return var1 >= (this.ak_fld << 6) + (this.ae_fld << 3)
			&& var1 <= (this.ak_fld << 6) + (this.ag_fld << 3) + 7
			&& var2 >= (this.au_fld << 6) + (this.as_fld << 3)
			&& var2 <= (this.au_fld << 6) + (this.az_fld << 3) + 7;
	}

	@ObfuscatedName("pc")
	@ObfuscatedSignature(
		descriptor = "(Lpb;II[I)I"
	)
	public static int pc(pb var0, int var1, int var2, int[] var3) throws EOFException {
		if (var0 == null) {
			var0.getClass();
		}

		if (null != var3 && var1 < var0.av_fld.size()) {
			HashMap var4 = (HashMap)(HashMap)var0.av_fld.get(var1);
			if (null != var4 && var4.containsKey(var2)) {
				ArrayList var5 = (ArrayList)(ArrayList)var4.get(var2);

				for (int var6 = 0; var6 < var5.size(); var6++) {
					ps var7 = (ps)(ps)var5.get(var6);
					int var8;
					if (65535 != var7.ag_fld) {
						var8 = var0.bd(var7.ag_fld, var3, 782960651);
					} else {
						var8 = var3[var7.ak_fld];
					}

					if (var8 >= var7.az_fld && var8 <= var7.av_fld) {
						return var6;
					}
				}
			}

			return -1;
		} else {
			return -1;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lhf;)V"
	)
	@Override
	public void ay(hf var1) {
		if (var1.az_fld > this.ak_fld) {
			var1.az_fld = this.ak_fld * -1575960911;
		}

		if (var1.ak_fld < this.ak_fld) {
			var1.ak_fld = this.ak_fld * 1150825709;
		}

		if (var1.av_fld > this.au_fld) {
			var1.av_fld = 671833357 * this.au_fld;
		}

		if (var1.ag_fld < this.au_fld) {
			var1.ag_fld = this.au_fld * -1872889183;
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	@Override
	public boolean ax(int var1, int var2) {
		return var1 >= (this.ak_fld << 6) + (this.ae_fld << 3)
			&& var1 <= (this.ak_fld << 6) + (this.ag_fld << 3) + 7
			&& var2 >= (this.au_fld << 6) + (this.as_fld << 3)
			&& var2 <= (this.au_fld << 6) + (this.az_fld << 3) + 7;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	@Override
	public boolean an(int var1, int var2) {
		return var1 >= (this.ak_fld << 6) + (this.ae_fld << 3)
			&& var1 <= (this.ak_fld << 6) + (this.ag_fld << 3) + 7
			&& var2 >= (this.au_fld << 6) + (this.as_fld << 3)
			&& var2 <= (this.au_fld << 6) + (this.az_fld << 3) + 7;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	@Override
	public boolean aa(int var1, int var2) {
		return var1 >= (this.ak_fld << 6) + (this.ae_fld << 3)
			&& var1 <= (this.ak_fld << 6) + (this.ag_fld << 3) + 7
			&& var2 >= (this.au_fld << 6) + (this.as_fld << 3)
			&& var2 <= (this.au_fld << 6) + (this.az_fld << 3) + 7;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(III)[I"
	)
	@Override
	public int[] ai(int var1, int var2, int var3) {
		return !this.ag(var1, var2, var3, -1703796573)
			? null
			: new int[]{this.ae_fld - this.al_fld + var2 + (this.ak_fld - this.aw_fld), this.au_fld - this.ax_fld + var3 + (this.as_fld - this.ah_fld)};
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(III)[I"
	)
	@Override
	public int[] aq(int var1, int var2, int var3) {
		return !this.ag(var1, var2, var3, -1470183180)
			? null
			: new int[]{this.ae_fld - this.al_fld + var2 + (this.ak_fld - this.aw_fld), this.au_fld - this.ax_fld + var3 + (this.as_fld - this.ah_fld)};
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(III)[I"
	)
	@Override
	public int[] am(int var1, int var2, int var3) {
		return !this.ag(var1, var2, var3, -1824196848)
			? null
			: new int[]{this.ae_fld - this.al_fld + var2 + (this.ak_fld - this.aw_fld), this.au_fld - this.ax_fld + var3 + (this.as_fld - this.ah_fld)};
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
			int var3 = this.al_fld - this.ae_fld + var1 + (this.aw_fld - this.ak_fld);
			int var4 = this.ah_fld - this.as_fld + var2 + (this.ax_fld - this.au_fld);
			return new kj(this.ay_fld, var3, var4);
		}
	}

	hd() {
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lqa;ILqy;)I"
	)
	static int ag(qa var0, int var1, qy var2) {
		byte var4 = 0;
		ol var5 = var0.ae();
		if (var5.bl_fld > 0 && var5.by_fld > 0) {
			var1 %= var5.by_fld;
		}

		int var6 = qa.do_(var0, 757038204);
		int var7 = qa.jy(var0, -1840133392);
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
		this.ay_fld = var1.cg();
		this.av_fld = var1.cg();
		this.aw_fld = xi.tx(var1, 829692898);
		this.al_fld = var1.cg();
		this.ar_fld = var1.cg();
		this.ax_fld = xi.tx(var1, 1634808513);
		this.ah_fld = var1.cg();
		this.af_fld = var1.cg();
		this.ak_fld = xi.tx(var1, 1435707333);
		this.ae_fld = var1.cg();
		this.ag_fld = var1.cg();
		this.au_fld = xi.tx(var1, 401919526);
		this.as_fld = var1.cg();
		this.az_fld = var1.cg();
		im(this, (byte)96);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	public void at(xi var1) {
		this.ay_fld = var1.cg();
		this.av_fld = var1.cg();
		this.aw_fld = xi.tx(var1, 1170018592);
		this.al_fld = var1.cg();
		this.ar_fld = var1.cg();
		this.ax_fld = xi.tx(var1, 604953541);
		this.ah_fld = var1.cg();
		this.af_fld = var1.cg();
		this.ak_fld = xi.tx(var1, 1234496669);
		this.ae_fld = var1.cg();
		this.ag_fld = var1.cg();
		this.au_fld = xi.tx(var1, 509801193);
		this.as_fld = var1.cg();
		this.az_fld = var1.cg();
		im(this, (byte)96);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ac() {
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
			int var3 = this.al_fld - this.ae_fld + var1 + (this.aw_fld - this.ak_fld);
			int var4 = this.ah_fld - this.as_fld + var2 + (this.ax_fld - this.au_fld);
			return new kj(this.ay_fld, var3, var4);
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	public void ab(xi var1) {
		this.ay_fld = var1.cg();
		this.av_fld = var1.cg();
		this.aw_fld = xi.tx(var1, 839363820);
		this.al_fld = var1.cg();
		this.ar_fld = var1.cg();
		this.ax_fld = xi.tx(var1, 341008353);
		this.ah_fld = var1.cg();
		this.af_fld = var1.cg();
		this.ak_fld = xi.tx(var1, 1048361451);
		this.ae_fld = var1.cg();
		this.ag_fld = var1.cg();
		this.au_fld = xi.tx(var1, 819713030);
		this.as_fld = var1.cg();
		this.az_fld = var1.cg();
		im(this, (byte)72);
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
		int[] var3 = client.db_fld.az_fld;

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
		return var1 >= this.ay_fld && var1 < this.av_fld + this.ay_fld
			? var2 >= (this.aw_fld << 6) + (this.al_fld << 3)
				&& var2 <= (this.aw_fld << 6) + (this.ar_fld << 3) + 7
				&& var3 >= (this.ah_fld << 3) + (this.ax_fld << 6)
				&& var3 <= 7 + (this.ax_fld << 6) + (this.af_fld << 3)
			: false;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	static final void bl() {
		int[] var1 = client.db_fld.az_fld;
		Iterator var2 = client.da_fld.iterator();

		while (var2.hasNext()) {
			dx var3 = (dx)(dx)var2.next();

			for (int var4 = 0; var4 < client.db_fld.al_fld; var4++) {
				cv var5 = (cv)var3.au_fld.ak(var1[var4]);
				if (var5 != null && var5.ce_fld > 0) {
					var5.ce_fld--;
					if (0 == var5.ce_fld) {
						var5.cx_fld = null;
						var5.es(-1);
					}
				}
			}

			Iterator var6 = var3.ax_fld.iterator();

			while (var6.hasNext()) {
				ds var7 = (ds)(ds)var6.next();
				if (null != var7 && var7.ce_fld > 0) {
					var7.ce_fld--;
					if (var7.ce_fld == 0) {
						var7.cx_fld = null;
						var7.es(-1);
					}
				}
			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	void aw(byte var1) {
	}
}
