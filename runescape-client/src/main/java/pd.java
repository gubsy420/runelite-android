import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
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
	@ObfuscatedGetter(
		intValue = 1478362993
	)
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int av_fld = 0;
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
	@ObfuscatedGetter(
		intValue = 1478362993
	)
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ae_fld;
	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int cq_fld;

	@ObfuscatedName("toArray")
	@ObfuscatedSignature(
		descriptor = "()[Ljava/lang/Object;"
	)
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

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(Lpd;)Ljava/util/Iterator;"
	)
	public static Iterator cz(pd var0) {
		if (var0 == null) {
			var0.getClass();
		}

		return new pf(var0);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void ai(int var1) {
		pj var2 = this.ag_fld[var1];
		int var3 = this.ae_fld >>> 1;

		while (var1 < var3) {
			int var4 = 1 + (var1 << 1);
			pj var5 = this.ag_fld[var4];
			int var6 = (var1 << 1) + 2;
			pj var7 = this.ag_fld[var6];
			int var8;
			if (null != this.ak_fld) {
				if (var6 < this.ae_fld && this.ak_fld.compare(var5.ak_fld, var7.ak_fld) > 0) {
					var8 = var6;
				} else {
					var8 = var4;
				}
			} else if (var6 < this.ae_fld && ((Comparable)var5.ak_fld).compareTo(var7.ak_fld) > 0) {
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

	@ObfuscatedName("fq")
	@ObfuscatedSignature(
		descriptor = "(Lpd;)V"
	)
	public static void fq(pd var0) {
		int var1 = (var0.ag_fld.length << 1) + 1;
		var0.ag_fld = (pj[])(pj[])Arrays.copyOf(var0.ag_fld, var1);
	}

	@ObfuscatedName("size")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int size() {
		return this.ae_fld;
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
			this.av_fld += 2064235989;
			int var2 = this.ae_fld;
			if (var2 >= this.ag_fld.length) {
				this.ak((byte)-126);
			}

			this.ae_fld++;
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
		return this.ae_fld == 0 ? null : this.ag_fld[0].ak_fld;
	}

	@ObfuscatedName("poll")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/Object;"
	)
	@Override
	public Object poll() {
		if (0 == this.ae_fld) {
			return null;
		} else {
			this.av_fld += 2064235989;
			Object var1 = this.ag_fld[0].ak_fld;
			this.az_fld.remove(var1);
			this.ae_fld--;
			if (this.ae_fld == 0) {
				this.ag_fld[this.ae_fld] = null;
			} else {
				this.ag_fld[0] = this.ag_fld[this.ae_fld];
				this.ag_fld[0].ag_fld = 0;
				this.ag_fld[this.ae_fld] = null;
				tp(this, 0, -1891285313);
			}

			return var1;
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/Object;"
	)
	public Object ax() {
		return this.ae_fld == 0 ? null : this.ag_fld[0].ak_fld;
	}

	public pd(int var1, Comparator var2) {
		this.ag_fld = new pj[var1];
		this.az_fld = new HashMap();
		this.ak_fld = var2;
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
		return this.ae_fld;
	}

	@ObfuscatedName("remove")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	@Override
	public boolean remove(Object var1) {
		pj var2 = (pj)(pj)this.az_fld.remove(var1);
		if (var2 == null) {
			return false;
		} else {
			this.av_fld += 2064235989;
			this.ae_fld--;
			if (var2.ag_fld == this.ae_fld) {
				this.ag_fld[this.ae_fld] = null;
				return true;
			} else {
				pj var3 = this.ag_fld[this.ae_fld];
				this.ag_fld[this.ae_fld] = null;
				this.ag_fld[var2.ag_fld] = var3;
				this.ag_fld[var2.ag_fld].ag_fld = var2.ag_fld * 1733271787;
				tp(this, var2.ag_fld, -1891709281);
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

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int bp() {
		return this.ae_fld;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int bt() {
		return this.ae_fld;
	}

	@ObfuscatedName("tp")
	@ObfuscatedSignature(
		descriptor = "(Lpd;II)V"
	)
	public static void tp(pd var0, int var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		} else {
			pj var3 = var0.ag_fld[var1];
			int var4 = var0.ae_fld >>> 1;

			while (var1 < var4) {
				int var5 = 1 + (var1 << 1);
				pj var6 = var0.ag_fld[var5];
				int var7 = (var1 << 1) + 2;
				pj var8 = var0.ag_fld[var7];
				int var9;
				if (null != var0.ak_fld) {
					if (var7 < var0.ae_fld && var0.ak_fld.compare(var6.ak_fld, var8.ak_fld) > 0) {
						var9 = var7;
					} else {
						var9 = var5;
					}
				} else if (var7 < var0.ae_fld && ((Comparable)var6.ak_fld).compareTo(var8.ak_fld) > 0) {
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

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	static final void aj(byte var0) {
		vu.ak();
		cz.ak();
		ne.ak_fld.vh();
		yl.ag_fld.vh();
		yg.ag_fld.vh();
		os.ar_fld.vh();
		ov.ay_fld.vh();
		bv.ag((byte)-16);
		pa.ae_fld.vh();
		pa.ah_fld.vh();
		py.as_fld.vh();
		py.ar_fld.vh();
		py.af_fld.vh();
		pn.ah_fld.vh();
		pb.ak();
		ox.ab_fld.vh();
		ny.av_fld.vh();
		fv.av();
		pc.az_fld.vh();
		ok.ak_fld.vh();
		pp.cn_fld.vh();
		pp.cr_fld.vh();
		og.do_fld.vh();
		og.dd_fld.vh();
		og.dl_fld.vh();
		wk.az();
		ol.aj_fld.vh();
		ol.bm_fld.vh();
		ol.bd_fld.vh();
		ba.ag();
		pw.ag_fld.vh();
		oy.bt_fld.vh();
		xg.az(-104875306);
		if (null != ny.ea_fld) {
			wd.gv(ny.ea_fld, -1936652887);
		}

		if (us.ev_fld != null) {
			wd.gv(us.ev_fld, -1427007608);
		}

		la.ak(864319688);
		du.ak();
		pq.ag_fld.vh();
		cy.ak();
		oa.ak_fld.vh();
		om.ak_fld.vh();
		pt.ak_fld.vh();
		oh.ae_fld.vh();
		pu.ak_fld.vh();
		client.kp_fld.vh();
		client.kj_fld.vh();
		lp.aw_fld.vh();
		ry.mx(lp.ay_fld, (byte)94);
		lp.as_fld = 0;
		if (cf.cg_fld != null) {
			cf.cg_fld.an();
		}

		if (fc.ar_fld.aq_fld != null) {
			((eu)fc.ar_fld.aq_fld).ah((byte)112);
		}

		gw.aw();
		ry.mx(ch.ap_fld, (byte)73);
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

	@ObfuscatedName("kz")
	@ObfuscatedSignature(
		descriptor = "(Lpd;)Ljava/lang/Object;"
	)
	public static Object kz(pd var0) {
		if (0 == var0.ae_fld) {
			return null;
		} else {
			var0.av_fld += 2023104386;
			Object var1 = var0.ag_fld[0].ak_fld;
			var0.az_fld.remove(var1);
			var0.ae_fld--;
			if (1238153755 * var0.ae_fld == 0) {
				var0.ag_fld[var0.ae_fld] = null;
			} else {
				var0.ag_fld[0] = var0.ag_fld[var0.ae_fld];
				var0.ag_fld[0].ag_fld = 0;
				var0.ag_fld[-680165016 * var0.ae_fld] = null;
				tp(var0, 0, -2114691761);
			}

			return var1;
		}
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	public boolean bn(Object var1) {
		return this.az_fld.containsKey(var1);
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	public boolean bw(Object var1) {
		return this.az_fld.containsKey(var1);
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "()[Ljava/lang/Object;"
	)
	public Object[] ba() {
		Object[] var1 = (Object[])super.toArray();
		if (null != this.ak_fld) {
			Arrays.sort((Object[])var1, this.ak_fld);
		} else {
			Arrays.sort((Object[])var1);
		}

		return (Object[])var1;
	}

	public pd(int var1) {
		this(var1, null);
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	public boolean cy(Object var1) {
		pj var2 = (pj)(pj)this.az_fld.remove(var1);
		if (var2 == null) {
			return false;
		} else {
			this.av_fld += 2064235989;
			this.ae_fld--;
			if (var2.ag_fld == this.ae_fld) {
				this.ag_fld[this.ae_fld] = null;
				return true;
			} else {
				pj var3 = this.ag_fld[this.ae_fld];
				this.ag_fld[this.ae_fld] = null;
				this.ag_fld[var2.ag_fld] = var3;
				this.ag_fld[var2.ag_fld].ag_fld = var2.ag_fld * 1733271787;
				tp(this, var2.ag_fld, -1815183729);
				if (this.ag_fld[var2.ag_fld] == var3) {
					this.ag(var2.ag_fld, (byte)56);
				}

				return true;
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void av() {
		int var1 = (this.ag_fld.length << 1) + 1;
		this.ag_fld = (pj[])(pj[])Arrays.copyOf(this.ag_fld, var1);
	}

	@ObfuscatedName("pc")
	@ObfuscatedSignature(
		descriptor = "(Lpd;)Ljava/lang/Object;"
	)
	public static Object pc(pd var0) {
		if (0 == var0.ae_fld) {
			return null;
		} else {
			var0.av_fld += 2064235989;
			Object var1 = var0.ag_fld[0].ak_fld;
			var0.az_fld.remove(var1);
			var0.ae_fld--;
			if (var0.ae_fld == 0) {
				var0.ag_fld[var0.ae_fld] = null;
			} else {
				var0.ag_fld[0] = var0.ag_fld[var0.ae_fld];
				var0.ag_fld[0].ag_fld = 0;
				var0.ag_fld[var0.ae_fld] = null;
				tp(var0, 0, -1991269591);
			}

			return var1;
		}
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

	@ObfuscatedName("iterator")
	@ObfuscatedSignature(
		descriptor = "()Ljava/util/Iterator;"
	)
	@Override
	public Iterator iterator() {
		return new pf(this);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/Object;"
	)
	public Object au() {
		return this.ae_fld == 0 ? null : this.ag_fld[0].ak_fld;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(ILcx;)Ldx;"
	)
	public static dx ag(int var0, cx var1) {
		Iterator var3 = var1.iterator();

		while (var3.hasNext()) {
			dx var4 = (dx)(dx)var3.next();
			if (var4.ax_fld.ak(var0) != null) {
				return var4;
			}
		}

		return var1.ah(-225377813);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	public boolean aw(Object var1) {
		if (this.az_fld.containsKey(var1)) {
			throw new IllegalArgumentException("");
		} else {
			this.av_fld += 2064235989;
			int var2 = this.ae_fld;
			if (var2 >= this.ag_fld.length) {
				this.ak((byte)-117);
			}

			this.ae_fld++;
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

	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "(Lpd;Ljava/lang/Object;)Z"
	)
	public static boolean dd(pd var0, Object var1) {
		if (var0.az_fld.containsKey(var1)) {
			throw new IllegalArgumentException("");
		} else {
			var0.av_fld += 1626913302;
			int var2 = var0.ae_fld * 559995642;
			if (var2 >= var0.ag_fld.length) {
				var0.ak((byte)-36);
			}

			var0.ae_fld++;
			if (var2 == 0) {
				var0.ag_fld[0] = new pj(var1, 0);
				var0.az_fld.put(var1, var0.ag_fld[0]);
			} else {
				var0.ag_fld[var2] = new pj(var1, var2);
				var0.az_fld.put(var1, var0.ag_fld[var2]);
				var0.ag(var2, (byte)22);
			}

			return true;
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/Object;"
	)
	public Object al() {
		if (0 == this.ae_fld) {
			return null;
		} else {
			this.av_fld += 2064235989;
			Object var1 = this.ag_fld[0].ak_fld;
			this.az_fld.remove(var1);
			this.ae_fld--;
			if (this.ae_fld == 0) {
				this.ag_fld[this.ae_fld] = null;
			} else {
				this.ag_fld[0] = this.ag_fld[this.ae_fld];
				this.ag_fld[0].ag_fld = 0;
				this.ag_fld[this.ae_fld] = null;
				tp(this, 0, -2039543171);
			}

			return var1;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/Object;"
	)
	public Object ar() {
		if (0 == this.ae_fld) {
			return null;
		} else {
			this.av_fld += -1013492857;
			Object var1 = this.ag_fld[0].ak_fld;
			this.az_fld.remove(var1);
			this.ae_fld--;
			if (this.ae_fld == 0) {
				this.ag_fld[this.ae_fld] = null;
			} else {
				this.ag_fld[0] = this.ag_fld[113391009 * this.ae_fld];
				this.ag_fld[0].ag_fld = 0;
				this.ag_fld[-585186017 * this.ae_fld] = null;
				tp(this, 0, -2100338349);
			}

			return var1;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/Object;"
	)
	public Object af() {
		return this.ae_fld == 0 ? null : this.ag_fld[0].ak_fld;
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	public boolean cq(Object var1) {
		pj var2 = (pj)(pj)this.az_fld.remove(var1);
		if (var2 == null) {
			return false;
		} else {
			this.av_fld += 457717625;
			this.ae_fld -= -1985121490;
			if (var2.ag_fld == this.ae_fld) {
				this.ag_fld[this.ae_fld] = null;
				return true;
			} else {
				pj var3 = this.ag_fld[this.ae_fld];
				this.ag_fld[this.ae_fld * -1973731528] = null;
				this.ag_fld[var2.ag_fld * -1878058072] = var3;
				this.ag_fld[var2.ag_fld * -1529728863].ag_fld = var2.ag_fld * 1733271787;
				tp(this, var2.ag_fld, -1791690792);
				if (this.ag_fld[1603763202 * var2.ag_fld] == var3) {
					this.ag(var2.ag_fld, (byte)-16);
				}

				return true;
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(III)F"
	)
	static float au(int var0, int var1, int var2) {
		return (float)(var0 - var1) / (var2 - var1);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	public boolean as(Object var1) {
		if (this.az_fld.containsKey(var1)) {
			throw new IllegalArgumentException("");
		} else {
			this.av_fld += 2064235989;
			int var2 = this.ae_fld;
			if (var2 >= this.ag_fld.length) {
				this.ak((byte)-75);
			}

			this.ae_fld++;
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
		descriptor = "(I)I"
	)
	public static int ag(int var0) {
		return um.aq_fld[var0 & 2047];
	}

	@ObfuscatedName("yd")
	@ObfuscatedSignature(
		descriptor = "(Lpd;Ljava/lang/Object;)Z"
	)
	public static boolean yd(pd var0, Object var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else if (var0.az_fld.containsKey(var1)) {
			throw new IllegalArgumentException("");
		} else {
			var0.av_fld += 2064235989;
			int var2 = var0.ae_fld;
			if (var2 >= var0.ag_fld.length) {
				var0.ak((byte)-45);
			}

			var0.ae_fld++;
			if (var2 == 0) {
				var0.ag_fld[0] = new pj(var1, 0);
				var0.az_fld.put(var1, var0.ag_fld[0]);
			} else {
				var0.ag_fld[var2] = new pj(var1, var2);
				var0.az_fld.put(var1, var0.ag_fld[var2]);
				var0.ag(var2, (byte)-35);
			}

			return true;
		}
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

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lli;)V"
	)
	public static void az(li var0) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ap_fld = false;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	public boolean ah(Object var1) {
		if (this.az_fld.containsKey(var1)) {
			throw new IllegalArgumentException("");
		} else {
			this.ae_fld = this.av_fld + 456725157;
			int var2 = this.ae_fld;
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
}
