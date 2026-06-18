import java.util.HashMap;
import java.util.Iterator;
import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;
import net.runelite.api.events.NpcDespawned;
import net.runelite.api.events.WorldEntityDespawned;
import net.runelite.api.events.WorldViewUnloaded;
import net.runelite.api.hooks.Callbacks;

@ObfuscatedName("cx")
public class cx implements Iterable {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lss;"
	)
	ss av_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/HashMap;"
	)
	HashMap ag_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/HashMap;"
	)
	HashMap az_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lsb;"
	)
	sb ae_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lxv;"
	)
	xv ak_fld = new xv(16);
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Ldx;"
	)
	dx ah_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1189633661
	)
	int aw_fld;
	@ObfuscatedName("kq")
	@ObfuscatedSignature(
		descriptor = "Lcn;"
	)
	static cn kq_fld;

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(Lcx;II)Ldx;"
	)
	public static dx ct(cx var0, int var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		Iterator var3 = var0.iterator();

		while (var3.hasNext()) {
			dx var4 = (dx)(dx)var3.next();
			if (!var4.ak(-787091592)) {
				int var5 = var4.as_fld * 1945570176;
				int var6 = var4.ay_fld * 923374599;
				int var7 = var4.ah_fld + var5;
				int var8 = var4.aw_fld + var6;
				if (var1 >= var5 && var2 >= var6 && var1 < var7 && var2 < var8) {
					return var4;
				}
			}
		}

		return var0.ah_fld;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ldx;)V"
	)
	void at(dx var1) {
		if (null != var1) {
			this.ag_fld.remove(var1.ag_fld);
			this.az_fld.remove(var1.ag_fld);
			var1.ar(-1506359563);
			var1.gy();
			this.aw_fld--;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIII)Ldx;"
	)
	dx ak(int var1, int var2, int var3, int var4) {
		this.ah_fld = cl(this, 0, var1, var2, var3, er.ak_fld, (byte)112);
		return this.ah_fld;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ldx;I)V"
	)
	void av(dx var1, int var2) {
		this.lr(var1);
		if (null != var1) {
			this.ag_fld.remove(var1.ag_fld);
			this.az_fld.remove(var1.ag_fld);
			var1.ar(-1504480606);
			var1.gy();
			this.aw_fld--;
		}
	}

	@ObfuscatedName("yh")
	@ObfuscatedSignature(
		descriptor = "(ILcx;)Ldx;"
	)
	public static dx yh(int var0, cx var1) {
		return kx.ak(var0, var1);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(ILss;Lsb;B)V"
	)
	void af(int var1, ss var2, sb var3, byte var4) {
		this.ag_fld.put(var1, var2);
		this.az_fld.put(var1, var3);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(III)Ldx;"
	)
	dx aw(int var1, int var2, int var3) {
		Iterator var4 = this.iterator();

		while (var4.hasNext()) {
			dx var5 = (dx)(dx)var4.next();
			if (!var5.ak(-787091592)) {
				int var6 = var5.as_fld;
				int var7 = var5.ay_fld;
				int var8 = var5.ah_fld + var6;
				int var9 = var5.aw_fld + var7;
				if (var1 >= var6 && var2 >= var7 && var1 < var8 && var2 < var9) {
					return var5;
				}
			}
		}

		return this.ah_fld;
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(II)Ldx;"
	)
	dx bk(int var1, int var2) {
		Iterator var3 = this.iterator();

		while (var3.hasNext()) {
			dx var4 = (dx)(dx)var3.next();
			if (!var4.ak(-787091592)) {
				int var5 = var4.as_fld;
				int var6 = var4.ay_fld;
				int var7 = var4.ah_fld + var5;
				int var8 = var4.aw_fld + var6;
				if (var1 >= var5 && var2 >= var6 && var1 < var7 && var2 < var8) {
					return var4;
				}
			}
		}

		return this.ah_fld;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)Lss;"
	)
	ss au(int var1, int var2) {
		ss var3 = (ss)(ss)this.ag_fld.get(var1);
		return null != var3 ? var3 : this.av_fld;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(I)Lrg;"
	)
	public rg bf(int var1) {
		return (rg)(rg)gw(this, -225377813).an_fld.ak(var1);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lcx;B)I"
	)
	public static int as(cx var0, byte var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.aw_fld;
		}
	}

	cx() {
		this.ag_fld = new HashMap(16);
		this.az_fld = new HashMap(16);
		this.aw_fld = 0;
		this.an((byte)43);
	}

	@ObfuscatedName("nb")
	@ObfuscatedSignature(
		descriptor = "(II)Ldx;"
	)
	public dx nb(int var1, int var2) {
		return this.aw(var1, var2, -2017518756);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lss;Lsb;B)V"
	)
	void ar(ss var1, sb var2, byte var3) {
		this.av_fld = var1;
		this.ae_fld = var2;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IB)Lsb;"
	)
	sb ax(int var1, byte var2) {
		sb var3 = (sb)(sb)this.az_fld.get(var1);
		return null != var3 ? var3 : this.ae_fld;
	}

	@ObfuscatedName("wc")
	@ObfuscatedSignature(
		descriptor = "(Lcx;IB)V"
	)
	public static void wc(cx var0, int var1, byte var2) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.ag_fld.remove(var1);
			var0.az_fld.remove(var1);
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IB)Ldx;"
	)
	public dx ae(int var1, byte var2) {
		return (dx)(dx)this.ak_fld.ak(var1);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(III)Ldx;"
	)
	dx am(int var1, int var2, int var3) {
		this.ah_fld = cl(this, 0, var1, var2, var3, er.ak_fld, (byte)52);
		return this.ah_fld;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(III)Ldx;"
	)
	dx aa(int var1, int var2, int var3) {
		this.ah_fld = cl(this, 0, var1, var2, var3, er.ak_fld, (byte)77);
		return this.ah_fld;
	}

	@ObfuscatedName("li")
	@ObfuscatedSignature(
		descriptor = "(Lcx;)V"
	)
	public static void li(cx var0) {
		Iterator var1 = var0.ak_fld.iterator();

		while (var1.hasNext()) {
			dx var2 = (dx)(dx)var1.next();
			var0.av(var2, -886050072);
		}

		xv.aa(var0.ak_fld);
		var0.aw_fld = 0;
		var0.ag_fld.clear();
		var0.az_fld.clear();
		var0.av_fld = ss.ag_fld;
		var0.ae_fld = sb.ag_fld;
		if (var0.ah_fld != null) {
			var0.ah_fld.ag(-1187084379);
			var0.ak_fld.ag(var0.ah_fld, 0L);
			var0.aw_fld = 1504998661;
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(III)Ldx;"
	)
	dx ai(int var1, int var2, int var3) {
		this.ah_fld = cl(this, 0, var1, var2, var3, er.ak_fld, (byte)58);
		return this.ah_fld;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ldx;)V"
	)
	void ap(dx var1) {
		if (null != var1) {
			this.ag_fld.remove(var1.ag_fld);
			this.az_fld.remove(var1.ag_fld);
			var1.ar(-1350239050);
			var1.gy();
			this.aw_fld--;
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IIIILer;)Ldx;"
	)
	dx ad(int var1, int var2, int var3, int var4, er var5) {
		dx var6 = new dx(var1, var2, var3, var4, var5);
		this.ak_fld.ag(var6, var1);
		this.aw_fld++;
		return var6;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIIILer;)Ldx;"
	)
	dx ao(int var1, int var2, int var3, int var4, er var5) {
		dx var6 = new dx(var1, var2, var3, var4, var5);
		this.ak_fld.ag(var6, var1);
		this.aw_fld++;
		return var6;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void ab(int var1) {
		dx var2 = (dx)this.ak_fld.ak(var1);
		this.av(var2, -1187201370);
	}

	@ObfuscatedName("tv")
	@ObfuscatedSignature(
		descriptor = "(IIIILer;)Ldx;"
	)
	public dx tv(int var1, int var2, int var3, int var4, er var5) {
		return cl(this, var1, var2, var3, var4, var5, (byte)112);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	void an(byte var1) {
		Iterator var2 = this.ak_fld.iterator();

		while (var2.hasNext()) {
			dx var3 = (dx)(dx)var2.next();
			this.av(var3, -460298726);
		}

		xv.aa(this.ak_fld);
		this.aw_fld = 0;
		this.ag_fld.clear();
		this.az_fld.clear();
		this.av_fld = ss.ag_fld;
		this.ae_fld = sb.ag_fld;
		if (this.ah_fld != null) {
			this.ah_fld.ag(-1187084379);
			this.ak_fld.ag(this.ah_fld, 0L);
			this.aw_fld = 532843221;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ldx;)V"
	)
	void ac(dx var1) {
		if (null != var1) {
			this.ag_fld.remove(1242947863 * var1.ag_fld);
			this.az_fld.remove(var1.ag_fld);
			var1.ar(-1403286262);
			var1.gy();
			this.aw_fld--;
		}
	}

	@ObfuscatedName("gf")
	@ObfuscatedSignature(
		descriptor = "(ILcx;)Ldx;"
	)
	public static dx gf(int var0, cx var1) {
		return pd.ag(var0, var1);
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(ILss;Lsb;)V"
	)
	void bi(int var1, ss var2, sb var3) {
		this.ag_fld.put(var1, var2);
		this.az_fld.put(var1, var3);
	}

	@ObfuscatedName("ek")
	@ObfuscatedSignature(
		descriptor = "(Lpd;)Ljava/lang/Object;"
	)
	public static Object ek(pd var0) {
		return var0.av_fld == 0 ? null : var0.ag_fld[0].ak_fld;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ldx;)V"
	)
	void aj(dx var1) {
		if (null != var1) {
			this.ag_fld.remove(var1.ag_fld);
			this.az_fld.remove(var1.ag_fld);
			var1.ar(-1420324143);
			var1.gy();
			this.aw_fld -= -989278166;
		}
	}

	@ObfuscatedName("ry")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void ry(int var1) {
		dx var2 = this.xg(var1);
		if (var2 != null) {
			Callbacks var3 = og.ci_fld.getCallbacks();
			Iterator var4 = var2.npcs().iterator();

			while (var4.hasNext()) {
				ds var5 = (ds)(ds)var4.next();
				var3.post(new NpcDespawned(var5));
			}
		}
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(Ldx;)V"
	)
	void bm(dx var1) {
		if (null != var1) {
			this.ag_fld.remove(var1.ag_fld);
			this.az_fld.remove(-1306089865 * var1.ag_fld);
			var1.ar(-772792383);
			var1.gy();
			this.aw_fld--;
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(I)Ldx;"
	)
	public dx bd(int var1) {
		return (dx)(dx)this.ak_fld.ak(var1);
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "()Ldx;"
	)
	public dx br() {
		return this.ah_fld;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(Lss;Lsb;)V"
	)
	void bt(ss var1, sb var2) {
		this.av_fld = var1;
		this.ae_fld = var2;
	}

	@ObfuscatedName("vx")
	@ObfuscatedSignature(
		descriptor = "(Lcx;I)Lss;"
	)
	public static ss vx(cx var0, int var1) {
		ss var2 = (ss)(ss)var0.ag_fld.get(var1);
		return null != var2 ? var2 : var0.av_fld;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(II)Ldx;"
	)
	dx bh(int var1, int var2) {
		Iterator var3 = this.iterator();

		while (var3.hasNext()) {
			dx var4 = (dx)(dx)var3.next();
			if (!var4.ak(-787091592)) {
				int var5 = var4.as_fld * 1688390974;
				int var6 = var4.ay_fld;
				int var7 = var4.ah_fld + var5;
				int var8 = var4.aw_fld + var6;
				if (var1 >= var5 && var2 >= var6 && var1 < var7 && var2 < var8) {
					return var4;
				}
			}
		}

		return this.ah_fld;
	}

	@ObfuscatedName("ga")
	@ObfuscatedSignature(
		descriptor = "(Lcx;)I"
	)
	public static int ga(cx var0) {
		return var0.aw_fld;
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "()Ljava/util/Iterator;"
	)
	public Iterator cc() {
		return this.ak_fld.iterator();
	}

	@ObfuscatedName("xg")
	@ObfuscatedSignature(
		descriptor = "(I)Ldx;"
	)
	public dx xg(int var1) {
		return this.ae(var1, (byte)-109);
	}

	@ObfuscatedName("lr")
	@ObfuscatedSignature(
		descriptor = "(Ldx;)V"
	)
	public void lr(dx var1) {
		if (var1 != null) {
			if (var1.vc_fld != null) {
				og.ci_fld.getCallbacks().post(new WorldViewUnloaded(var1));
			}

			if (client.bt_fld != null) {
				client.bt_fld.despawnWorldView(var1);
			}
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "()Ldx;"
	)
	public dx be() {
		return this.ah_fld;
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)Lrg;"
	)
	public rg by(int var1) {
		return (rg)(rg)gw(this, -225377813).an_fld.ak(var1);
	}

	@ObfuscatedName("gw")
	@ObfuscatedSignature(
		descriptor = "(Lcx;I)Ldx;"
	)
	public static dx gw(cx var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.ah_fld;
		}
	}

	@ObfuscatedName("of")
	@ObfuscatedSignature(
		descriptor = "(I)Lss;"
	)
	public ss of(int var1) {
		return this.au(var1, 366728155);
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(I)Lrg;"
	)
	public rg bl(int var1) {
		return (rg)(rg)gw(this, -225377813).an_fld.ak(var1);
	}

	@ObfuscatedName("iterator")
	@ObfuscatedSignature(
		descriptor = "()Ljava/util/Iterator;"
	)
	@Export("iterator")
	@Override
	public Iterator iterator() {
		return this.ak_fld.iterator();
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int bp() {
		return this.aw_fld;
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(ILss;Lsb;)V"
	)
	void bn(int var1, ss var2, sb var3) {
		this.ag_fld.put(var1, var2);
		this.az_fld.put(var1, var3);
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void bc(int var1) {
		this.ag_fld.remove(var1);
		this.az_fld.remove(var1);
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(I)Lss;"
	)
	ss ba(int var1) {
		ss var2 = (ss)(ss)this.ag_fld.get(var1);
		return null != var2 ? var2 : this.av_fld;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(I)Lsb;"
	)
	sb bq(int var1) {
		sb var2 = (sb)(sb)this.az_fld.get(var1);
		return null != var2 ? var2 : this.ae_fld;
	}

	@ObfuscatedName("st")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void st(int var1) {
		rg var2 = (rg)sq.jx(bw.dk_fld.an_fld, var1);
		if (var2 != null) {
			client.logger.debug("WorldEntity despawn: {}", var2.ae_fld);
			og.ci_fld.getCallbacks().post(new WorldEntityDespawned(var2));
		}
	}

	@ObfuscatedName("rx")
	@ObfuscatedSignature(
		descriptor = "(Lcx;II)Ldx;"
	)
	public static dx rx(cx var0, int var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		Iterator var3 = var0.iterator();

		while (var3.hasNext()) {
			dx var4 = (dx)(dx)var3.next();
			if (!var4.ak(-787091592)) {
				int var5 = var4.as_fld;
				int var6 = var4.ay_fld;
				int var7 = var4.ah_fld + var5;
				int var8 = var4.aw_fld + var6;
				if (var1 >= var5 && var2 >= var6 && var1 < var7 && var2 < var8) {
					return var4;
				}
			}
		}

		return var0.ah_fld;
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(I)Lsb;"
	)
	sb bg(int var1) {
		sb var2 = (sb)(sb)this.az_fld.get(var1);
		return null != var2 ? var2 : this.ae_fld;
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(I)Lsb;"
	)
	sb bb(int var1) {
		sb var2 = (sb)(sb)this.az_fld.get(var1);
		return null != var2 ? var2 : this.ae_fld;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IB)Lrg;"
	)
	public rg ay(int var1, byte var2) {
		return (rg)(rg)gw(this, -225377813).an_fld.ak(var1);
	}

	@ObfuscatedName("lk")
	@ObfuscatedSignature(
		descriptor = "(Lcx;II)V"
	)
	public static void lk(cx var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.ry(var1);
			dx var3 = (dx)var0.ak_fld.ak(var1);
			var0.av(var3, -1004161645);
			var0.st(var1);
		}
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "()Ljava/util/Iterator;"
	)
	public Iterator cd() {
		return this.ak_fld.iterator();
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void cq() {
		Iterator var1 = this.ak_fld.iterator();

		while (var1.hasNext()) {
			dx var2 = (dx)(dx)var1.next();
			this.av(var2, 567044835);
		}

		xv.aa(this.ak_fld);
		this.aw_fld = 0;
		this.ag_fld.clear();
		this.az_fld.clear();
		this.av_fld = ss.ag_fld;
		this.ae_fld = sb.ag_fld;
		if (this.ah_fld != null) {
			this.ah_fld.ag(-1187084379);
			this.ak_fld.ag(this.ah_fld, 0L);
			this.aw_fld = 532843221;
		}
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(ILss;Lsb;)V"
	)
	void bu(int var1, ss var2, sb var3) {
		this.ag_fld.put(var1, var2);
		this.az_fld.put(var1, var3);
	}

	@ObfuscatedName("fh")
	@ObfuscatedSignature(
		descriptor = "(Lcx;)I"
	)
	public static int fh(cx var0) {
		return var0.aw_fld;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ILlu;Llu;B)Llu;"
	)
	static lu ar(int var0, lu var1, lu var2) {
		int var4 = 0;
		lu var5 = null;

		for (int var6 = var2.by_fld + 1; var6 < var1.ge_fld.length; var6++) {
			lu var7 = var1.ge_fld[var6];
			if (null != var7 && var7.cy_fld == var2.by_fld) {
				if (++var4 - 1 == var0) {
					var5 = var7;
					break;
				}
			}
		}

		return var5;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIIILer;B)Ldx;"
	)
	dx ag(int var1, int var2, int var3, int var4, er var5, byte var6) {
		dx var7 = new dx(var1, var2, var3, var4, var5);
		this.ak_fld.ar(var7, var1);
		this.aw_fld++;
		return var7;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void az(int var1, int var2) {
		this.st(var1);
		dx var3 = (dx)this.ak_fld.aw(var1);
		this.av(var3, -1004161645);
		this.st(var1);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Ldx;"
	)
	public dx ah(int var1) {
		return this.ah_fld;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IB)V"
	)
	void al(int var1, byte var2) {
		this.ag_fld.remove(var1);
		this.ag_fld.remove(var1);
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(Lcx;IIIILer;B)Ldx;"
	)
	public static dx cl(cx var0, int var1, int var2, int var3, int var4, er var5, byte var6) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			dx var7 = new dx(var1, var2, var3, var4, var5);
			var0.ak_fld.ag(var7, var1);
			var0.aw_fld++;
			return var7;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	int as(byte var1) {
		return this.aw_fld;
	}
}
