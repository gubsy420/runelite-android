import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("hq")
public class hq implements hj {
	@ObfuscatedGetter(
		intValue = -1208705739
	)
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ag_fld;
	@ObfuscatedGetter(
		intValue = 1647626631
	)
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ak_fld;
	@ObfuscatedGetter(
		intValue = -801794273
	)
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int az_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int av_fld;
	@ObfuscatedGetter(
		intValue = -532632893
	)
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ae_fld;
	@ObfuscatedGetter(
		intValue = -1487296945
	)
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ah_fld;
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int bv_fld;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ap_fld;

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	@Override
	public boolean au(int var1, int var2) {
		return var1 >> 6 == this.ae_fld && var2 >> 6 == this.ah_fld;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lhf;B)V"
	)
	@Override
	public void ak(hf var1, byte var2) {
		if (var1.az_fld > this.ae_fld) {
			var1.az_fld = -662651697 * this.ae_fld;
		}

		if (var1.ak_fld < this.ae_fld) {
			var1.ak_fld = 38721683 * this.ae_fld;
		}

		if (var1.av_fld > this.ah_fld) {
			var1.av_fld = 318907011 * this.ah_fld;
		}

		if (var1.ag_fld < this.ah_fld) {
			var1.ag_fld = -837975761 * this.ah_fld;
		}
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	static final void bu() throws EOFException {
		if (!client.oe_fld) {
			int var1 = kj.as(ca.ot_fld);
			int var2 = kj.as(ob.oy_fld);
			int var3 = jf.dv(bw.dk_fld, var1, var2, bw.dk_fld.ae_fld) - eo.od_fld;
			bc.bv(var1, var3, var2, (byte)45);
		} else if (null != client.oi_fld) {
			ke.jd_fld = client.oi_fld.ak(1295367969);
			gk.jc_fld = client.oi_fld.ag(387692916);
			if (client.ov_fld) {
				cs.jy_fld = client.oi_fld.az(-2043137107);
			} else {
				cs.jy_fld = jf.dv(bw.dk_fld, ke.jd_fld, gk.jc_fld, bw.dk_fld.ae_fld) - client.oi_fld.az(-2043137107);
			}

			vx.wk(client.oi_fld, (byte)-64);
		}

		if (!client.og_fld) {
			int var10 = kj.as(fu.ol_fld);
			int var11 = kj.as(il.of_fld);
			int var12 = jf.dv(bw.dk_fld, var10, var11, bw.dk_fld.ae_fld) - pq.oo_fld;
			int var4 = var10 - ke.jd_fld;
			int var5 = var12 - cs.jy_fld;
			int var6 = var11 - gk.jc_fld;
			int var7 = (int)Math.sqrt(var6 * var6 + var4 * var4);
			int var8 = (int)(Math.atan2(var5, var7) * 325.949F) & 2047;
			int var9 = (int)(Math.atan2(var4, var6) * -325.949F) & 2047;
			mk.bi(var8, var9, -233689290);
		} else {
			if (null != client.pq_fld) {
				hu.je_fld = vh.vk(client.pq_fld, 1479257931);
				hu.je_fld = ji.bo(hu.je_fld);
				vx.wk(client.pq_fld, (byte)17);
			}

			if (null != client.pc_fld) {
				ab.jx_fld = vh.vk(client.pc_fld, 1867763616) & 2047;
				vx.wk(client.pc_fld, (byte)-92);
			}
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lhf;)V"
	)
	@Override
	public void ay(hf var1) {
		if (var1.az_fld > this.ae_fld) {
			var1.az_fld = -662651697 * this.ae_fld;
		}

		if (var1.ak_fld < this.ae_fld) {
			var1.ak_fld = 7400103 * this.ae_fld;
		}

		if (var1.av_fld > this.ah_fld) {
			var1.av_fld = 795689261 * this.ah_fld;
		}

		if (var1.ag_fld < this.ah_fld) {
			var1.ag_fld = -837975761 * this.ah_fld;
		}
	}

	@ObfuscatedName("xa")
	@ObfuscatedSignature(
		descriptor = "(Lhq;I)V"
	)
	public static void xa(hq var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	public void ap(xi var1) {
		this.ak_fld = var1.cg();
		this.ag_fld = var1.cg();
		this.az_fld = xi.tx(var1, 1784667682);
		this.av_fld = xi.tx(var1, 938001395) * -2076798181;
		this.ae_fld = xi.tx(var1, 2147123124);
		this.ah_fld = xi.tx(var1, 986706619);
		xa(this, -1553198209);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	@Override
	public void ah(xi var1, int var2) {
		this.ak_fld = var1.cg();
		this.ag_fld = var1.cg();
		this.az_fld = xi.tx(var1, 562377708);
		this.av_fld = xi.tx(var1, 1233740466) * -2076798181;
		this.ae_fld = xi.tx(var1, 672521851);
		this.ah_fld = xi.tx(var1, 1384084254);
		xa(this, -1553198209);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	public void at(xi var1) {
		this.ak_fld = var1.cg();
		this.ag_fld = var1.cg();
		this.az_fld = xi.tx(var1, 2025042786);
		this.av_fld = xi.tx(var1, 1428752548) * -2076798181;
		this.ae_fld = xi.tx(var1, 466567009);
		this.ah_fld = xi.tx(var1, 1721079486);
		xa(this, -1553198209);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lhf;)V"
	)
	@Override
	public void as(hf var1) {
		if (var1.az_fld > this.ae_fld) {
			var1.az_fld = -662651697 * this.ae_fld;
		}

		if (var1.ak_fld < this.ae_fld) {
			var1.ak_fld = 38721683 * this.ae_fld;
		}

		if (var1.av_fld > this.ah_fld) {
			var1.av_fld = 318907011 * this.ah_fld;
		}

		if (var1.ag_fld < this.ah_fld) {
			var1.ag_fld = -837975761 * this.ah_fld;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lhf;)V"
	)
	@Override
	public void ar(hf var1) {
		if (var1.az_fld > this.ae_fld) {
			var1.az_fld = 425535163 * this.ae_fld;
		}

		if (var1.ak_fld < this.ae_fld) {
			var1.ak_fld = 797239133 * this.ae_fld;
		}

		if (var1.av_fld > this.ah_fld) {
			var1.av_fld = 765241001 * this.ah_fld;
		}

		if (var1.ag_fld < this.ah_fld) {
			var1.ag_fld = -837975761 * this.ah_fld;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z"
	)
	@Override
	public boolean ag(int var1, int var2, int var3, int var4) {
		return var1 >= this.ak_fld && var1 < this.ag_fld + this.ak_fld ? var2 >> 6 == this.az_fld && var3 >> 6 == this.av_fld : false;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	@Override
	public boolean al(int var1, int var2) {
		return var1 >> 6 == this.ae_fld && var2 >> 6 == this.ah_fld;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(III)[I"
	)
	@Override
	public int[] ai(int var1, int var2, int var3) {
		return !this.ag(var1, var2, var3, -733683465) ? null : new int[]{var2 + (this.ae_fld - this.az_fld), var3 + (this.ah_fld - this.av_fld * 828622016)};
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	@Override
	public boolean ax(int var1, int var2) {
		return var1 >> 6 == this.ae_fld && var2 >> 6 == this.ah_fld;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	@Override
	public boolean an(int var1, int var2) {
		return var1 >> 6 == this.ae_fld && var2 >> 6 == this.ah_fld;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	@Override
	public boolean aa(int var1, int var2) {
		return var1 >> 6 == this.ae_fld && var2 >> 6 == this.ah_fld;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void aj() {
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(III)[I"
	)
	@Override
	public int[] aq(int var1, int var2, int var3) {
		return !this.ag(var1, var2, var3, -1074297260) ? null : new int[]{var2 + (this.ae_fld - this.az_fld), var3 + (this.ah_fld - this.av_fld * 828622016)};
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(III)[I"
	)
	@Override
	public int[] am(int var1, int var2, int var3) {
		return !this.ag(var1, var2, var3, -1775328854) ? null : new int[]{var2 + (this.ae_fld - this.az_fld), var3 + (this.ah_fld - this.av_fld)};
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)Lkj;"
	)
	@Override
	public kj ad(int var1, int var2) {
		if (!this.az(var1, var2, (byte)35)) {
			return null;
		} else {
			int var3 = var1 + (this.az_fld - this.ae_fld);
			int var4 = var2 + (828622016 * this.av_fld - this.ah_fld);
			return new kj(this.ak_fld, var3, var4);
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)Lkj;"
	)
	@Override
	public kj ao(int var1, int var2) {
		if (!this.az(var1, var2, (byte)20)) {
			return null;
		} else {
			int var3 = var1 + (this.az_fld - this.ae_fld);
			int var4 = var2 + (828622016 * this.av_fld - this.ah_fld);
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
		this.az_fld = xi.tx(var1, 678603637);
		this.av_fld = xi.tx(var1, 1987621918) * 1402287504;
		this.ae_fld = xi.tx(var1, 643094523);
		this.ah_fld = xi.tx(var1, 1312872487) * 1355846098;
		xa(this, -1553198209);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(III)Z"
	)
	@Override
	public boolean af(int var1, int var2, int var3) {
		return var1 >= this.ak_fld && var1 < this.ag_fld + this.ak_fld ? var2 >> 6 == this.az_fld && var3 >> 6 == -834516682 * this.av_fld : false;
	}

	hq() {
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ac() {
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I"
	)
	@Override
	public int[] av(int var1, int var2, int var3, int var4) {
		return !this.ag(var1, var2, var3, -1946648384) ? null : new int[]{var2 + (this.ae_fld - this.az_fld), var3 + (this.ah_fld - this.av_fld * 828622016)};
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bm() {
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lkj;"
	)
	@Override
	public kj ae(int var1, int var2, byte var3) {
		if (!this.az(var1, var2, (byte)3)) {
			return null;
		} else {
			int var4 = var1 + (this.az_fld - this.ae_fld);
			int var5 = var2 + (828622016 * this.av_fld - this.ah_fld);
			return new kj(this.ak_fld, var4, var5);
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z"
	)
	@Override
	public boolean az(int var1, int var2, byte var3) {
		return var1 >> 6 == this.ae_fld && var2 >> 6 == this.ah_fld;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lxv;IJ)J"
	)
	static long az(xv var0, int var1, long var2) {
		if (null == var0) {
			return var2;
		} else {
			vk var4 = (vk)var0.ak(var1);
			return var4 == null ? var2 : var4.ak_fld;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void aw(int var1) {
	}
}
