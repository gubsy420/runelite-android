import net.runelite.api.TileItem;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;
import net.runelite.api.events.ItemQuantityChanged;

@ObfuscatedName("dw")
@Implements({"TileItem"})
public class dw extends em implements TileItem {
	@ObfuscatedName("un")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int un_fld;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ac_fld;
	@ObfuscatedGetter(
		intValue = 500879017
	)
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ag_fld;
	@ObfuscatedGetter(
		intValue = -1736653849
	)
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int az_fld;
	@ObfuscatedGetter(
		intValue = -653769005
	)
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int av_fld;
	@ObfuscatedGetter(
		intValue = 1756234301
	)
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ae_fld;
	@ObfuscatedGetter(
		intValue = 178778081
	)
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ah_fld;
	@ObfuscatedName("ho")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ho_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean aw_fld;
	@ObfuscatedName("oc")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int oc_fld = -1;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ab_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Loo;"
	)
	oo as_fld;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Ltu;"
	)
	tu ar_fld;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int bz_fld;
	@ObfuscatedGetter(
		intValue = 1861048229
	)
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ay_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ak_fld;
	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bg_fld;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	public static String ax_fld;
	@ObfuscatedName("qp")
	@ObfuscatedSignature(
		descriptor = "Ldw;"
	)
	public static dw qp_fld;
	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int cv_fld;
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bf_fld;

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	protected boolean aq() {
		try {
			og var1 = kb.ag(this.ag_fld, -1752383175);
			fn var2 = null == this.as_fld ? var1.al(this.az_fld, (byte)-4) : var1.au(this.as_fld, 70979276);
			return null != var2 && var2.cv_fld != null;
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void ak(int var1, int var2) {
		this.ay_fld = var1;
	}

	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void iq(int var1) {
		if (this.oc_fld != -1) {
			client.ii_fld.debug("Item quantity changed: {} ({} -> {})", (Object[])(new Object[]{this.getId(), this.getQuantity(), var1}));
			ItemQuantityChanged var2 = new ItemQuantityChanged(this, this.sz(), this.getQuantity(), var1);
			og.ci_fld.getCallbacks().post(var2);
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IS)Z"
	)
	boolean ag(int var1, short var2) {
		return var1 >= 0 && var1 <= 4 ? (this.ay_fld & 1 << var1) != 0 : true;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)Z"
	)
	@Override
	protected boolean av(byte var1) {
		try {
			og var2 = kb.ag(this.ag_fld, -1752383175);
			fn var3 = null == this.as_fld ? var2.al(this.az_fld, (byte)-57) : var2.au(this.as_fld, 1147476473);
			return null != var3 && var3.cv_fld != null;
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("getOwnership")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getOwnership() {
		return this.ah_fld;
	}

	@ObfuscatedName("getVisibleTime")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getVisibleTime() {
		return this.av_fld - client.gw_fld + client.yr_fld;
	}

	@ObfuscatedName("re")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int re() {
		return this.un_fld;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Loo;"
	)
	oo aw(int var1) {
		return this.as_fld;
	}

	@ObfuscatedName("getQuantity")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getQuantity() {
		return this.az_fld;
	}

	@ObfuscatedName("getDespawnTime")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getDespawnTime() {
		return this.ae_fld - client.gw_fld + client.yr_fld;
	}

	@ObfuscatedName("getId")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getId() {
		return this.ag_fld;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Loo;I)V"
	)
	void ay(oo var1, int var2) {
		this.as_fld = var1;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ltu;I)V"
	)
	void ar(tu var1, int var2) {
		this.ar_fld = var1;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(Ltu;)V"
	)
	void bf(tu var1) {
		this.ar_fld = var1;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ltu;)Luz;"
	)
	static uz aj(tu var0) {
		tu var1 = dn.av(tu.av_fld, var0);
		var1.al();
		float var2 = da.az(tu.av_fld, var0);
		float var3 = (float)Math.acos(var2);
		uz var4 = qo.ak();
		var4.ay(var1, var3);
		var1.ah();
		return var4;
	}

	@ObfuscatedName("lu")
	@ObfuscatedSignature(
		descriptor = "(Ldw;I)V"
	)
	public static void lu(dw var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ay_fld = -1105446287 * var1;
	}

	@ObfuscatedName("isPrivate")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	public boolean isPrivate() {
		return this.aw_fld;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "()Lfn;"
	)
	@Override
	protected final fn ax() {
		try {
			og var1 = kb.ag(this.ag_fld, -1752383175);
			fn var2 = this.as_fld == null ? var1.al(this.az_fld, (byte)-7) : var1.au(this.as_fld, 2004383694);
			if (null == var2) {
				return null;
			} else {
				fn var3 = null;
				if (!tu.av_fld.ar(this.ar_fld)) {
					uz var4 = dl.ah(this.ar_fld);
					var4.au();
					var3 = var2.ay(false);
					var3.bo(var4);
					var4.ae();
				}

				return var3 == null ? var2 : var3;
			}
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("vb")
	@ObfuscatedSignature(
		descriptor = "(Ldw;I)V"
	)
	public static void vb(dw var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ay_fld = var1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()Lfn;"
	)
	@Override
	protected final fn an() {
		try {
			og var1 = kb.ag(this.ag_fld, -1752383175);
			fn var2 = this.as_fld == null ? var1.al(this.az_fld, (byte)-5) : var1.au(this.as_fld, -447034662);
			if (null == var2) {
				return null;
			} else {
				fn var3 = null;
				if (!tu.av_fld.ar(this.ar_fld)) {
					uz var4 = dl.ah(this.ar_fld);
					var4.au();
					var3 = var2.ay(false);
					var3.bo(var4);
					var4.ae();
				}

				return var3 == null ? var2 : var3;
			}
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	dw() {
		this.un_fld = -1;
		this.ay_fld = -1058976397;
		this.ar_fld = tu.ak_fld;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "()Lfn;"
	)
	@Override
	protected final fn au() {
		try {
			og var1 = kb.ag(this.ag_fld, -1752383175);
			fn var2 = this.as_fld == null ? var1.al(976122235 * this.az_fld, (byte)-35) : var1.au(this.as_fld, 184160979);
			if (null == var2) {
				return null;
			} else {
				fn var3 = null;
				if (!tu.av_fld.ar(this.ar_fld)) {
					uz var4 = dl.ah(this.ar_fld);
					var4.au();
					var3 = var2.ay(false);
					var3.bo(var4);
					var4.ae();
				}

				return var3 == null ? var2 : var3;
			}
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean ap(int var1) {
		return var1 >= 0 && var1 <= 4 ? (this.ay_fld & 1 << var1) != 0 : true;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean ac(int var1) {
		return var1 >= 0 && var1 <= 4 ? (this.ay_fld & 1 << var1) != 0 : true;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ah() {
		return this.oc_fld;
	}

	@ObfuscatedName("sz")
	@ObfuscatedSignature(
		descriptor = "()Lrl10;"
	)
	public rl10 sz() {
		int var1 = this.oc_fld;
		int var2 = this.un_fld;
		dx var3 = dx.ws(this.ho_fld);
		if (var1 != -1 && var2 != -1 && var3 != null) {
			rl10[][][] var4 = var3.getScene().getTiles();
			return var4[var3.getPlane()][var1][var2];
		} else {
			return null;
		}
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bj() {
		this.as_fld = null;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "()Loo;"
	)
	oo bz() {
		return this.as_fld;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(Ltu;)Luz;"
	)
	static uz bd(tu var0) {
		tu var1 = dn.av(tu.av_fld, var0);
		var1.al();
		float var2 = da.az(tu.av_fld, var0);
		float var3 = (float)Math.acos(var2);
		uz var4 = qo.ak();
		var4.ay(var1, var3);
		var1.ah();
		return var4;
	}

	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "(Ldw;I)V"
	)
	public static void ez(dw var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.as_fld = null;
		}
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(Ltu;)V"
	)
	void by(tu var1) {
		this.ar_fld = var1;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	protected boolean ai() {
		try {
			og var1 = kb.ag(this.ag_fld, -1752383175);
			fn var2 = null == this.as_fld ? var1.al(-92076382 * this.az_fld, (byte)-69) : var1.au(this.as_fld, -607483739);
			return null != var2 && var2.cv_fld != null;
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(Ltu;)Luz;"
	)
	static uz bm(tu var0) {
		tu var1 = dn.av(tu.av_fld, var0);
		var1.al();
		float var2 = da.az(tu.av_fld, var0);
		float var3 = (float)Math.acos(var2);
		uz var4 = qo.ak();
		var4.ay(var1, var3);
		var1.ah();
		return var4;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(Loo;)V"
	)
	void bh(oo var1) {
		this.as_fld = var1;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "()Lfn;"
	)
	@Override
	protected final fn aa() {
		try {
			og var1 = kb.ag(1003630326 * this.ag_fld, -1752383175);
			fn var2 = this.as_fld == null ? var1.al(43761269 * this.az_fld, (byte)-51) : var1.au(this.as_fld, 561257653);
			if (null == var2) {
				return null;
			} else {
				fn var3 = null;
				if (!tu.av_fld.ar(this.ar_fld)) {
					uz var4 = dl.ah(this.ar_fld);
					var4.au();
					var3 = var2.ay(false);
					var3.bo(var4);
					var4.ae();
				}

				return var3 == null ? var2 : var3;
			}
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Lfn;"
	)
	@Override
	protected final fn az(int var1) {
		try {
			og var2 = kb.ag(this.ag_fld, -1752383175);
			fn var3 = this.as_fld == null ? var2.al(this.az_fld, (byte)-122) : var2.au(this.as_fld, -281282848);
			if (null == var3) {
				return null;
			} else {
				fn var4 = null;
				if (!tu.av_fld.ar(this.ar_fld)) {
					uz var5 = dl.ah(this.ar_fld);
					var5.au();
					var4 = var3.ay(false);
					var4.bo(var5);
					var5.ae();
				}

				return var4 == null ? var3 : var4;
			}
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "()Lfn;"
	)
	@Override
	protected final fn al() {
		try {
			og var1 = kb.ag(this.ag_fld, -1752383175);
			fn var2 = this.as_fld == null ? var1.al(-261374370 * this.az_fld, (byte)-126) : var1.au(this.as_fld, 1252517138);
			if (null == var2) {
				return null;
			} else {
				fn var3 = null;
				if (!tu.av_fld.ar(this.ar_fld)) {
					uz var4 = dl.ah(this.ar_fld);
					var4.au();
					var3 = var2.ay(false);
					var3.bo(var4);
					var4.ae();
				}

				return var3 == null ? var2 : var3;
			}
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("ej")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void ej(int var1) {
		this.un_fld = var1;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	protected boolean am() {
		try {
			og var1 = kb.ag(this.ag_fld, -1752383175);
			fn var2 = null == this.as_fld ? var1.al(this.az_fld, (byte)-66) : var1.au(this.as_fld, 918585636);
			return null != var2 && var2.cv_fld != null;
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(C)C"
	)
	static char az(char var0) {
		return var0 != 181 && 402 != var0 ? Character.toTitleCase(var0) : var0;
	}

	@ObfuscatedName("yo")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void yo(int var1) {
		this.oc_fld = var1;
	}

	@ObfuscatedName("zi")
	@ObfuscatedSignature(
		descriptor = "(Ldu;III)V"
	)
	public static void zi(du var0, int var1, int var2, int var3) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ak(var1, var2, var3, -1045138312);
	}

	@ObfuscatedName("xp")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Override
	public void xp_void() {
		if (this.oc_fld != -1 && qp_fld == null) {
			qp_fld = this;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void as(int var1) {
		this.ho_fld = var1;
	}
}
