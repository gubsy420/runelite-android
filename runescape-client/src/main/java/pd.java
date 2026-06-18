import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("pd")
public class pd extends AbstractQueue {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "[Lpj;"
	)
	pj[] ag_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1478362993
	)
	int ae_fld = 0;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/Map;"
	)
	Map az_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/Comparator;"
	)
	Comparator ak_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1478362993
	)
	int av_fld;
	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int cq_fld;

	@ObfuscatedName("toArray")
	@ObfuscatedSignature(
		descriptor = "()[Ljava/lang/Object;"
	)
	@Export("toArray")
	@Override
	public Object[] toArray() {
		Object[] var1 = (Object[])super.toArray();
		if (null != this.ak_fld) {
			Arrays.sort((Object[])var1, this.ak_fld);
		} else {
			Arrays.sort((Object[])var1);
		}

		return (Object[])var1;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void ai(int var1) {
		pj var2 = this.ag_fld[var1];
		int var3 = this.av_fld >>> 1;

		while (var1 < var3) {
			int var4 = 1 + (var1 << 1);
			pj var5 = this.ag_fld[var4];
			int var6 = (var1 << 1) + 2;
			pj var7 = this.ag_fld[var6];
			int var8;
			if (null != this.ak_fld) {
				if (var6 < this.av_fld && this.ak_fld.compare(var5.ak_fld, var7.ak_fld) > 0) {
					var8 = var6;
				} else {
					var8 = var4;
				}
			} else if (var6 < this.av_fld && ((Comparable)var5.ak_fld).compareTo(var7.ak_fld) > 0) {
				var8 = var6;
			} else {
				var8 = var4;
			}

			if (null != this.ak_fld
				? this.ak_fld.compare(var2.ak_fld, this.ag_fld[var8].ak_fld) <= 0
				: ((Comparable)var2.ak_fld).compareTo(this.ag_fld[var8].ak_fld) <= 0) {
				break;
			}

			this.ag_fld[var1] = this.ag_fld[var8];
			this.ag_fld[var1].ag_fld = var1;
			var1 = var8;
		}

		this.ag_fld[var1] = var2;
		this.ag_fld[var1].ag_fld = var1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	void ak(byte var1) {
		int var2 = (this.ag_fld.length << 1) + 1;
		this.ag_fld = (pj[])(pj[])Arrays.copyOf(this.ag_fld, var2);
	}

	@ObfuscatedName("size")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("size")
	@Override
	public int size() {
		return this.av_fld;
	}

	@ObfuscatedName("offer")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	@Override
	public boolean offer(Object var1) {
		if (this.az_fld.containsKey(var1)) {
			throw new IllegalArgumentException("");
		} else {
			this.ae_fld += 2064235989;
			int var2 = this.av_fld;
			if (var2 >= this.ag_fld.length) {
				this.ak((byte)-126);
			}

			this.av_fld++;
			if (var2 == 0) {
				this.ag_fld[0] = new pj(var1, 0);
				this.az_fld.put(var1, this.ag_fld[0]);
			} else {
				this.ag_fld[var2] = new pj(var1, var2);
				this.az_fld.put(var1, this.ag_fld[var2]);
				this.ag(var2, (byte)-44);
			}

			return true;
		}
	}

	@ObfuscatedName("peek")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/Object;"
	)
	@Override
	public Object peek() {
		return this.av_fld == 0 ? null : this.ag_fld[0].ak_fld;
	}

	@ObfuscatedName("poll")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/Object;"
	)
	@Override
	public Object poll() {
		if (0 == this.av_fld) {
			return null;
		} else {
			this.ae_fld += 2064235989;
			Object var1 = this.ag_fld[0].ak_fld;
			this.az_fld.remove(var1);
			this.av_fld--;
			if (this.av_fld == 0) {
				this.ag_fld[this.av_fld] = null;
			} else {
				this.ag_fld[0] = this.ag_fld[this.av_fld];
				this.ag_fld[0].ag_fld = 0;
				this.ag_fld[this.av_fld] = null;
				pz(this, 0, -1891285313);
			}

			return var1;
		}
	}

	public pd(int var1, Comparator var2) {
		this.ag_fld = new pj[var1];
		this.az_fld = new HashMap();
		this.ak_fld = var2;
	}

	@ObfuscatedName("wx")
	@ObfuscatedSignature(
		descriptor = "(Lpd;Ljava/lang/Object;)Z"
	)
	public static boolean wx(pd var0, Object var1) {
		pj var2 = (pj)(pj)var0.az_fld.remove(var1);
		if (var2 == null) {
			return false;
		} else {
			var0.ae_fld += 2064235989;
			var0.av_fld--;
			if (var2.ag_fld == var0.av_fld) {
				var0.ag_fld[var0.av_fld] = null;
				return true;
			} else {
				pj var3 = var0.ag_fld[var0.av_fld];
				var0.ag_fld[var0.av_fld] = null;
				var0.ag_fld[var2.ag_fld] = var3;
				var0.ag_fld[var2.ag_fld].ag_fld = var2.ag_fld * 1733271787;
				pz(var0, var2.ag_fld, -1815183729);
				if (var0.ag_fld[var2.ag_fld] == var3) {
					var0.ag(var2.ag_fld, (byte)56);
				}

				return true;
			}
		}
	}

	@ObfuscatedName("contains")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	@Override
	public boolean contains(Object var1) {
		return this.az_fld.containsKey(var1);
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int bv() {
		return this.av_fld;
	}

	@ObfuscatedName("fb")
	@ObfuscatedSignature(
		descriptor = "(Lpd;)[Ljava/lang/Object;"
	)
	public static Object[] fb(pd var0) {
		if (var0 == null) {
			var0.getClass();
		}

		Object[] var1 = (Object[])var0.toArray();
		if (null != var0.ak_fld) {
			Arrays.sort((Object[])var1, var0.ak_fld);
		} else {
			Arrays.sort((Object[])var1);
		}

		return (Object[])var1;
	}

	@ObfuscatedName("remove")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	@Export("remove")
	@Override
	public boolean remove(Object var1) {
		pj var2 = (pj)(pj)this.az_fld.remove(var1);
		if (var2 == null) {
			return false;
		} else {
			this.ae_fld += 2064235989;
			this.av_fld--;
			if (var2.ag_fld == this.av_fld) {
				this.ag_fld[this.av_fld] = null;
				return true;
			} else {
				pj var3 = this.ag_fld[this.av_fld];
				this.ag_fld[this.av_fld] = null;
				this.ag_fld[var2.ag_fld] = var3;
				this.ag_fld[var2.ag_fld].ag_fld = var2.ag_fld * 1733271787;
				pz(this, var2.ag_fld, -1891709281);
				if (this.ag_fld[var2.ag_fld] == var3) {
					this.ag(var2.ag_fld, (byte)13);
				}

				return true;
			}
		}
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "()Ljava/util/Iterator;"
	)
	public Iterator cc() {
		return new pf(this);
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int bt() {
		return this.av_fld;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	static final void aj(byte var0) {
		vu.ak();
		cz.ak();
		ne.ak_fld.av();
		yl.ag_fld.av();
		yg.ag_fld.av();
		os.ar_fld.av();
		ov.ay_fld.av();
		bv.ag((byte)-16);
		pa.ae_fld.av();
		pa.ah_fld.av();
		py.as_fld.av();
		py.ar_fld.av();
		py.af_fld.av();
		pn.ah_fld.av();
		pb.ak();
		ox.ab_fld.av();
		ny.av_fld.av();
		fv.av();
		pc.az_fld.av();
		ok.ak_fld.av();
		pp.cn_fld.av();
		pp.cr_fld.av();
		og.do_fld.av();
		og.dd_fld.av();
		og.dl_fld.av();
		wk.az();
		ol.aj_fld.av();
		ol.bm_fld.av();
		ol.bd_fld.av();
		ba.ag();
		pw.ag_fld.av();
		oy.bt_fld.av();
		xg.az(-104875306);
		if (null != ny.ea_fld) {
			wd.vk(ny.ea_fld, -1936652887);
		}

		if (us.ev_fld != null) {
			wd.vk(us.ev_fld, -1427007608);
		}

		la.ak(864319688);
		du.ak();
		pq.ag_fld.av();
		cy.ak();
		oa.ak_fld.av();
		om.ak_fld.av();
		pt.ak_fld.av();
		oh.ae_fld.av();
		pu.ak_fld.av();
		client.kp_iw.av();
		client.kj_fld.av();
		lp.aw_fld.av();
		lp.ay_fld.ah();
		lp.as_fld = 0;
		if (cf.cg_fld != null) {
			cf.cg_fld.an(1940457012);
		}

		if (fc.ar_fld.aq_fld != null) {
			eu.bu((eu)fc.ar_fld.aq_fld, (byte)112);
		}

		gw.aw();
		ch.ap_fld.ah();
		if (null != hi.hl_fld) {
			hi.hl_fld.cg(-1688996440);
		}

		if (client.hc_fld != null) {
			client.hc_fld.cg(402056935);
		}

		if (zs.hw_fld != null) {
			if (var0 != 1) {
				return;
			}

			zs.hw_fld.cg(-1162744555);
		}

		if (null != by.ho_fld) {
			by.ho_fld.cg(-278253303);
		}

		if (null != bj.ib_fld) {
			bj.ib_fld.cg(1656857541);
		}

		if (client.hg_fld != null) {
			client.hg_fld.cg(-387981483);
		}

		if (wo.iq_fld != null) {
			wo.iq_fld.cg(1729062498);
		}

		if (null != pn.ia_fld) {
			pn.ia_fld.cg(-5759749);
		}

		if (null != ow.ie_fld) {
			if (var0 != 1) {
				return;
			}

			ow.ie_fld.cg(-1117591990);
		}

		if (null != bu.hv_fld) {
			if (var0 != 1) {
				return;
			}

			bu.hv_fld.cg(-1044493367);
		}

		if (null != dm.is_fld) {
			if (var0 != 1) {
				return;
			}

			dm.is_fld.cg(1094661020);
		}

		if (do_.ha_fld != null) {
			do_.ha_fld.cg(-2062863183);
		}

		if (ih.hm_fld != null) {
			if (var0 != 1) {
				return;
			}

			ih.hm_fld.cg(-1745991611);
		}

		if (null != ga.ht_fld) {
			if (var0 != 1) {
				return;
			}

			ga.ht_fld.cg(-913329821);
		}

		if (eo.hx_fld != null) {
			eo.hx_fld.cg(-190827497);
		}

		if (null != ab.hu_fld) {
			ab.hu_fld.cg(-1478074667);
		}

		if (null != pe.im_fld) {
			if (var0 != 1) {
				return;
			}

			pe.im_fld.cg(-1298728495);
		}

		if (gz.hy_fld != null) {
			gz.hy_fld.cg(-370939691);
		}

		if (null != me.hz_fld) {
			me.hz_fld.cg(1205415223);
		}

		if (null != gl.iv_fld) {
			gl.iv_fld.cg(369524381);
		}

		if (null != py.il_fld) {
			py.il_fld.cg(1182163483);
		}

		if (null != in.ip_fld) {
			if (var0 != 1) {
				return;
			}

			in.ip_fld.cg(-2032271266);
		}

		if (bq.if_fld != null) {
			bq.if_fld.cg(1577679985);
		}
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	public boolean bc(Object var1) {
		return this.az_fld.containsKey(var1);
	}

	@ObfuscatedName("pz")
	@ObfuscatedSignature(
		descriptor = "(Lpd;II)V"
	)
	public static void pz(pd var0, int var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		} else {
			pj var3 = var0.ag_fld[var1];
			int var4 = var0.av_fld >>> 1;

			while (var1 < var4) {
				int var5 = 1 + (var1 << 1);
				pj var6 = var0.ag_fld[var5];
				int var7 = (var1 << 1) + 2;
				pj var8 = var0.ag_fld[var7];
				int var9;
				if (null != var0.ak_fld) {
					if (var7 < var0.av_fld && var0.ak_fld.compare(var6.ak_fld, var8.ak_fld) > 0) {
						var9 = var7;
					} else {
						var9 = var5;
					}
				} else if (var7 < var0.av_fld && ((Comparable)var6.ak_fld).compareTo(var8.ak_fld) > 0) {
					if (var2 >= -1740776538) {
						return;
					}

					var9 = var7;
				} else {
					var9 = var5;
				}

				if (null != var0.ak_fld
					? var0.ak_fld.compare(var3.ak_fld, var0.ag_fld[var9].ak_fld) <= 0
					: ((Comparable)var3.ak_fld).compareTo(var0.ag_fld[var9].ak_fld) <= 0) {
					break;
				}

				var0.ag_fld[var1] = var0.ag_fld[var9];
				var0.ag_fld[var1].ag_fld = var1;
				var1 = var9;
			}

			var0.ag_fld[var1] = var3;
			var0.ag_fld[var1].ag_fld = var1;
		}
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	public boolean cq(Object var1) {
		return this.az_fld.containsKey(var1);
	}

	public pd(int var1) {
		this(var1, null);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	public boolean as(Object var1) {
		pj var2 = (pj)(pj)this.az_fld.remove(var1);
		if (var2 == null) {
			return false;
		} else {
			this.ae_fld += -1298800209;
			this.av_fld -= -1369326977;
			if (var2.ag_fld == this.av_fld) {
				this.ag_fld[this.av_fld * -402133395] = null;
				return true;
			} else {
				pj var3 = this.ag_fld[this.av_fld * 994100644];
				this.ag_fld[this.av_fld * 434008923] = null;
				this.ag_fld[var2.ag_fld] = var3;
				this.ag_fld[var2.ag_fld].ag_fld = var2.ag_fld * 1733271787;
				pz(this, var2.ag_fld, -2029975183);
				if (this.ag_fld[var2.ag_fld] == var3) {
					this.ag(var2.ag_fld, (byte)4);
				}

				return true;
			}
		}
	}

	@ObfuscatedName("pq")
	@ObfuscatedSignature(
		descriptor = "(Lbs;)Z"
	)
	public static boolean pq(bs var0) {
		return var0.ag_fld;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void av() {
		int var1 = (this.ag_fld.length << 1) + 1;
		this.ag_fld = (pj[])(pj[])Arrays.copyOf(this.ag_fld, var1);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IB)V"
	)
	void ag(int var1, byte var2) {
		pj var3 = this.ag_fld[var1];

		while (var1 > 0) {
			int var4 = var1 - 1 >>> 1;
			pj var5 = this.ag_fld[var4];
			if (null != this.ak_fld) {
				if (var2 == 7) {
					return;
				}

				if (this.ak_fld.compare(var3.ak_fld, var5.ak_fld) >= 0) {
					break;
				}
			} else if (((Comparable)var3.ak_fld).compareTo(var5.ak_fld) >= 0) {
				if (var2 == 7) {
					return;
				}
				break;
			}

			this.ag_fld[var1] = var5;
			this.ag_fld[var1].ag_fld = var1;
			var1 = var4;
		}

		this.ag_fld[var1] = var3;
		this.ag_fld[var1].ag_fld = var1;
	}

	@ObfuscatedName("vz")
	@ObfuscatedSignature(
		descriptor = "(Lpd;)Ljava/util/Iterator;"
	)
	public static Iterator vz(pd var0) {
		if (var0 == null) {
			var0.getClass();
		}

		return new pf(var0);
	}

	@ObfuscatedName("iterator")
	@ObfuscatedSignature(
		descriptor = "()Ljava/util/Iterator;"
	)
	@Export("iterator")
	@Override
	public Iterator iterator() {
		return new pf(this);
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	public boolean cv(Object var1) {
		if (this.az_fld.containsKey(var1)) {
			throw new IllegalArgumentException("");
		} else {
			this.ae_fld += 1626913302;
			int var2 = this.av_fld * 559995642;
			if (var2 >= this.ag_fld.length) {
				this.ak((byte)-36);
			}

			this.av_fld++;
			if (var2 == 0) {
				this.ag_fld[0] = new pj(var1, 0);
				this.az_fld.put(var1, this.ag_fld[0]);
			} else {
				this.ag_fld[var2] = new pj(var1, var2);
				this.az_fld.put(var1, this.ag_fld[var2]);
				this.ag(var2, (byte)22);
			}

			return true;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/Object;"
	)
	public Object ar() {
		return this.av_fld == 0 ? null : this.ag_fld[0].ak_fld;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(ILcx;I)Ldx;"
	)
	public static dx ag(int var0, cx var1) {
		Iterator var3 = var1.iterator();

		while (var3.hasNext()) {
			dx var4 = (dx)(dx)var3.next();
			if (var4.ax_fld.ae(var0) != null) {
				return var4;
			}
		}

		return cx.gw(var1, -225377813);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	public boolean ah(Object var1) {
		if (this.az_fld.containsKey(var1)) {
			throw new IllegalArgumentException("");
		} else {
			this.ae_fld += 2064235989;
			int var2 = this.av_fld;
			if (var2 >= this.ag_fld.length) {
				this.ak((byte)-117);
			}

			this.av_fld++;
			if (var2 == 0) {
				this.ag_fld[0] = new pj(var1, 0);
				this.az_fld.put(var1, this.ag_fld[0]);
			} else {
				this.ag_fld[var2] = new pj(var1, var2);
				this.az_fld.put(var1, this.ag_fld[var2]);
				this.ag(var2, (byte)-3);
			}

			return true;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/Object;"
	)
	public Object au() {
		if (0 == this.av_fld) {
			return null;
		} else {
			this.ae_fld += 2064235989;
			Object var1 = this.ag_fld[0].ak_fld;
			this.az_fld.remove(var1);
			this.av_fld--;
			if (this.av_fld == 0) {
				this.ag_fld[this.av_fld] = null;
			} else {
				this.ag_fld[0] = this.ag_fld[this.av_fld];
				this.ag_fld[0].ag_fld = 0;
				this.ag_fld[this.av_fld] = null;
				pz(this, 0, -2039543171);
			}

			return var1;
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/Object;"
	)
	public Object ax() {
		if (0 == this.av_fld) {
			return null;
		} else {
			this.ae_fld += -1013492857;
			Object var1 = this.ag_fld[0].ak_fld;
			this.az_fld.remove(var1);
			this.av_fld--;
			if (this.av_fld == 0) {
				this.ag_fld[this.av_fld] = null;
			} else {
				this.ag_fld[0] = this.ag_fld[113391009 * this.av_fld];
				this.ag_fld[0].ag_fld = 0;
				this.ag_fld[-585186017 * this.av_fld] = null;
				pz(this, 0, -2100338349);
			}

			return var1;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/Object;"
	)
	public Object an() {
		if (0 == this.av_fld) {
			return null;
		} else {
			this.ae_fld += 2064235989;
			Object var1 = this.ag_fld[0].ak_fld;
			this.az_fld.remove(var1);
			this.av_fld--;
			if (this.av_fld == 0) {
				this.ag_fld[this.av_fld] = null;
			} else {
				this.ag_fld[0] = this.ag_fld[this.av_fld];
				this.ag_fld[0].ag_fld = 0;
				this.ag_fld[this.av_fld] = null;
				pz(this, 0, -1991269591);
			}

			return var1;
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/Object;"
	)
	public Object al() {
		return this.av_fld == 0 ? null : this.ag_fld[0].ak_fld;
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	public boolean bn(Object var1) {
		if (this.az_fld.containsKey(var1)) {
			throw new IllegalArgumentException("");
		} else {
			this.ae_fld += 2064235989;
			int var2 = this.av_fld;
			if (var2 >= this.ag_fld.length) {
				this.ak((byte)-45);
			}

			this.av_fld++;
			if (var2 == 0) {
				this.ag_fld[0] = new pj(var1, 0);
				this.az_fld.put(var1, this.ag_fld[0]);
			} else {
				this.ag_fld[var2] = new pj(var1, var2);
				this.az_fld.put(var1, this.ag_fld[var2]);
				this.ag(var2, (byte)-35);
			}

			return true;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	public boolean ay(Object var1) {
		pj var2 = (pj)(pj)this.az_fld.remove(var1);
		if (var2 == null) {
			return false;
		} else {
			this.ae_fld += 457717625;
			this.av_fld -= -1985121490;
			if (var2.ag_fld == this.av_fld) {
				this.ag_fld[this.av_fld] = null;
				return true;
			} else {
				pj var3 = this.ag_fld[this.av_fld];
				this.ag_fld[this.av_fld * -1973731528] = null;
				this.ag_fld[var2.ag_fld * -1878058072] = var3;
				this.ag_fld[var2.ag_fld * -1529728863].ag_fld = var2.ag_fld * 1733271787;
				pz(this, var2.ag_fld, -1791690792);
				if (this.ag_fld[1603763202 * var2.ag_fld] == var3) {
					this.ag(var2.ag_fld, (byte)-16);
				}

				return true;
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIII)F"
	)
	static float au(int var0, int var1, int var2) {
		return (float)(var0 - var1) / (var2 - var1);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	public boolean aw(Object var1) {
		if (this.az_fld.containsKey(var1)) {
			throw new IllegalArgumentException("");
		} else {
			this.ae_fld += 2064235989;
			int var2 = this.av_fld;
			if (var2 >= this.ag_fld.length) {
				this.ak((byte)-75);
			}

			this.av_fld++;
			if (var2 == 0) {
				this.ag_fld[0] = new pj(var1, 0);
				this.az_fld.put(var1, this.ag_fld[0]);
			} else {
				this.ag_fld[var2] = new pj(var1, var2);
				this.az_fld.put(var1, this.ag_fld[var2]);
				this.ag(var2, (byte)21);
			}

			return true;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	public static int ag(int var0) {
		return um.aq_fld[var0 & 2047];
	}

	@ObfuscatedName("vj")
	@ObfuscatedSignature(
		descriptor = "(Ldw;Loo;)V"
	)
	public static void vj(dw var0, oo var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.as_fld = var1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void az(int var1, int var2) {
		pj var3 = this.ag_fld[var1];
		int var4 = this.ae_fld >>> 1;

		while (var1 < var4) {
			int var5 = 1 + (var1 << 1);
			pj var6 = this.ag_fld[var5];
			int var7 = (var1 << 1) + 2;
			pj var8 = this.ag_fld[var7];
			int var9;
			if (null != this.ak_fld) {
				if (var7 < this.av_fld && this.ak_fld.compare(var6.ak_fld, var8.ak_fld) > 0) {
					var9 = var7;
				} else {
					var9 = var5;
				}
			} else if (var7 < this.av_fld && ((Comparable)var6.ak_fld).compareTo(var8.ak_fld) > 0) {
				if (var2 >= -1740776538) {
					return;
				}

				var9 = var7;
			} else {
				var9 = var5;
			}

			if (null != this.ak_fld
				? this.ak_fld.compare(var3.ak_fld, this.ag_fld[var9].ak_fld) <= 0
				: ((Comparable)var3.ak_fld).compareTo(this.ag_fld[var9].ak_fld) <= 0) {
				break;
			}

			this.ag_fld[var1] = this.ag_fld[var9];
			this.ag_fld[var1].ag_fld = var1;
			var1 = var9;
		}

		this.ag_fld[var1] = var3;
		this.ag_fld[var1].ag_fld = var1;
	}
}
