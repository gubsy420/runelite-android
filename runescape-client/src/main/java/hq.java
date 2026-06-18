import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("hq")
public class hq implements hj {
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1208705739
	)
	int ae_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1647626631
	)
	int az_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -801794273
	)
	int ag_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ah_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -532632893
	)
	int av_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1487296945
	)
	int ak_fld;
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

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	@Override
	public boolean al(int var1, int var2) {
		return var1 >> 6 == this.av_fld && var2 >> 6 == this.ak_fld;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lhf;B)V"
	)
	@Override
	public void ak(hf var1, byte var2) {
		if (var1.ak_fld > this.av_fld) {
			var1.ak_fld = -662651697 * this.av_fld;
		}

		if (var1.ag_fld < this.av_fld) {
			var1.ag_fld = 38721683 * this.av_fld;
		}

		if (var1.az_fld > this.ak_fld) {
			var1.az_fld = 318907011 * this.ak_fld;
		}

		if (var1.av_fld < this.ak_fld) {
			var1.av_fld = -837975761 * this.ak_fld;
		}
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	static final void bu() throws EOFException {
		if (!client.oe_fld) {
			int var1 = kj.as(ca.ot_fld);
			int var2 = kj.as(ob.oy_fld);
			int var3 = jf.dv(bw.dk_fld, var1, var2, bw.dk_fld.ae_fld) - eo.od_fld;
			bc.bv(var1, var3, var2, (byte)45);
		} else if (null != client.oi_fld) {
			ke.jd_fld = client.oi_fld.az(1295367969);
			gk.jc_fld = client.oi_fld.ak(387692916);
			if (client.ov_fld) {
				cs.jy_fld = client.oi_fld.ag(-2043137107);
			} else {
				cs.jy_fld = jf.dv(bw.dk_fld, ke.jd_fld, gk.jc_fld, bw.dk_fld.ae_fld) - client.oi_fld.ag(-2043137107);
			}

			vx.is(client.oi_fld, (byte)-64);
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
				hu.je_fld = vh.zb(client.pq_fld, 1479257931);
				hu.je_fld = ji.bo(hu.je_fld);
				vx.is(client.pq_fld, (byte)17);
			}

			if (null != client.pc_fld) {
				ab.jx_fld = vh.zb(client.pc_fld, 1867763616) & 2047;
				vx.is(client.pc_fld, (byte)-92);
			}
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lhf;)V"
	)
	@Override
	public void ay(hf var1) {
		if (var1.ak_fld > this.av_fld) {
			var1.ak_fld = -662651697 * this.av_fld;
		}

		if (var1.ag_fld < this.av_fld) {
			var1.ag_fld = 7400103 * this.av_fld;
		}

		if (var1.az_fld > this.ak_fld) {
			var1.az_fld = 795689261 * this.ak_fld;
		}

		if (var1.av_fld < this.ak_fld) {
			var1.av_fld = -837975761 * this.ak_fld;
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bd() {
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	public void ap(xi var1) {
		this.az_fld = var1.cg();
		this.ae_fld = var1.cg();
		this.ag_fld = var1.cm();
		this.ah_fld = var1.cm() * -2076798181;
		this.av_fld = var1.cm();
		this.ak_fld = var1.cm();
		this.aw();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	@Override
	public void ah(xi var1, int var2) {
		this.az_fld = var1.cg();
		this.ae_fld = var1.cg();
		this.ag_fld = var1.cm();
		this.ah_fld = var1.cm() * -2076798181;
		this.av_fld = var1.cm();
		this.ak_fld = var1.cm();
		this.aw();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	public void at(xi var1) {
		this.az_fld = var1.cg();
		this.ae_fld = var1.cg();
		this.ag_fld = var1.cm();
		this.ah_fld = var1.cm() * -2076798181;
		this.av_fld = var1.cm();
		this.ak_fld = var1.cm();
		this.aw();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void aw() {
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lhf;)V"
	)
	@Override
	public void as(hf var1) {
		if (var1.ak_fld > this.av_fld) {
			var1.ak_fld = -662651697 * this.av_fld;
		}

		if (var1.ag_fld < this.av_fld) {
			var1.ag_fld = 38721683 * this.av_fld;
		}

		if (var1.az_fld > this.ak_fld) {
			var1.az_fld = 318907011 * this.ak_fld;
		}

		if (var1.av_fld < this.ak_fld) {
			var1.av_fld = -837975761 * this.ak_fld;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lhf;)V"
	)
	@Override
	public void ar(hf var1) {
		if (var1.ak_fld > this.av_fld) {
			var1.ak_fld = 425535163 * this.av_fld;
		}

		if (var1.ag_fld < this.av_fld) {
			var1.ag_fld = 797239133 * this.av_fld;
		}

		if (var1.az_fld > this.ak_fld) {
			var1.az_fld = 765241001 * this.ak_fld;
		}

		if (var1.av_fld < this.ak_fld) {
			var1.av_fld = -837975761 * this.ak_fld;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z"
	)
	@Override
	public boolean ag(int var1, int var2, int var3, int var4) {
		return var1 >= this.az_fld && var1 < this.ae_fld + this.az_fld ? var2 >> 6 == this.ag_fld && var3 >> 6 == this.ah_fld : false;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	@Override
	public boolean aa(int var1, int var2) {
		return var1 >> 6 == this.av_fld && var2 >> 6 == this.ak_fld;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(III)[I"
	)
	@Override
	public int[] ai(int var1, int var2, int var3) {
		return !this.ag(var1, var2, var3, -733683465) ? null : new int[]{var2 + (this.av_fld - this.ag_fld), var3 + (this.ak_fld - this.ah_fld * 828622016)};
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	@Override
	public boolean an(int var1, int var2) {
		return var1 >> 6 == this.av_fld && var2 >> 6 == this.ak_fld;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	@Override
	public boolean au(int var1, int var2) {
		return var1 >> 6 == this.av_fld && var2 >> 6 == this.ak_fld;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	@Override
	public boolean ax(int var1, int var2) {
		return var1 >> 6 == this.av_fld && var2 >> 6 == this.ak_fld;
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
		return !this.ag(var1, var2, var3, -1074297260) ? null : new int[]{var2 + (this.av_fld - this.ag_fld), var3 + (this.ak_fld - this.ah_fld * 828622016)};
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(III)[I"
	)
	@Override
	public int[] am(int var1, int var2, int var3) {
		return !this.ag(var1, var2, var3, -1775328854) ? null : new int[]{var2 + (this.av_fld - this.ag_fld), var3 + (this.ak_fld - this.ah_fld)};
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
			int var3 = var1 + (this.ag_fld - this.av_fld);
			int var4 = var2 + (828622016 * this.ah_fld - this.ak_fld);
			return new kj(this.az_fld, var3, var4);
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
			int var3 = var1 + (this.ag_fld - this.av_fld);
			int var4 = var2 + (828622016 * this.ah_fld - this.ak_fld);
			return new kj(this.az_fld, var3, var4);
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	public void ab(xi var1) {
		this.az_fld = var1.cg();
		this.ae_fld = var1.cg();
		this.ag_fld = var1.cm();
		this.ah_fld = var1.cm() * 1402287504;
		this.av_fld = var1.cm();
		this.ak_fld = var1.cm() * 1355846098;
		this.aw();
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(III)Z"
	)
	@Override
	public boolean af(int var1, int var2, int var3) {
		return var1 >= this.az_fld && var1 < this.ae_fld + this.az_fld ? var2 >> 6 == this.ag_fld && var3 >> 6 == -834516682 * this.ah_fld : false;
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
		return !this.ag(var1, var2, var3, -1946648384) ? null : new int[]{var2 + (this.av_fld - this.ag_fld), var3 + (this.ak_fld - this.ah_fld * 828622016)};
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
			int var4 = var1 + (this.ag_fld - this.av_fld);
			int var5 = var2 + (828622016 * this.ah_fld - this.ak_fld);
			return new kj(this.az_fld, var4, var5);
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z"
	)
	@Override
	public boolean az(int var1, int var2, byte var3) {
		return var1 >> 6 == this.av_fld && var2 >> 6 == this.ak_fld;
	}

	@ObfuscatedName("kv")
	@ObfuscatedSignature(
		descriptor = "(Lqf;Z)V"
	)
	public static void kv(qf var0) {
		if (var0 == null) {
			var0.getClass();
		}
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
}
