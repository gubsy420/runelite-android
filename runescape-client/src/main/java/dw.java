import net.runelite.api.TileItem;
import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;
import net.runelite.api.events.ItemQuantityChanged;

@ObfuscatedName("dw")
@Implements({"TileItem"})
public class dw extends em implements TileItem {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ac_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 500879017
	)
	int ah_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1736653849
	)
	int ay_fld;
	@ObfuscatedName("sq")
	@ObfuscatedSignature(
		descriptor = "Ldw;"
	)
	public static dw sq_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -653769005
	)
	int az_fld;
	@ObfuscatedName("ti")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ti_fld = -1;
	@ObfuscatedName("js")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int js_fld = -1;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1756234301
	)
	int ag_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 178778081
	)
	int av_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean aw_fld;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ab_fld;
	@ObfuscatedName("os")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int os_fld;
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
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1861048229
	)
	int ae_fld = -1058976397;
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

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	protected boolean am() {
		try {
			og var1 = kb.ag(this.ah_fld, -1752383175);
			fn var2 = null == this.as_fld ? var1.al(this.ay_fld, (byte)-4) : var1.au(this.as_fld, 70979276);
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
		this.ae_fld = var1;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IS)Z"
	)
	boolean ag(int var1, short var2) {
		return var1 >= 0 && var1 <= 4 ? (this.ae_fld & 1 << var1) != 0 : true;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(Ltu;)V"
	)
	void bl(tu var1) {
		this.ar_fld = var1;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)Z"
	)
	@Override
	protected boolean av(byte var1) {
		try {
			og var2 = kb.ag(this.ah_fld, -1752383175);
			fn var3 = null == this.as_fld ? var2.al(this.ay_fld, (byte)-57) : var2.au(this.as_fld, 1147476473);
			return null != var3 && var3.cv_fld != null;
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Loo;"
	)
	oo aw(int var1) {
		return this.as_fld;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void as(int var1) {
		this.as_fld = null;
	}

	@ObfuscatedName("getId")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getId")
	@Override
	public int getId() {
		return this.ah_fld;
	}

	@ObfuscatedName("wq")
	@ObfuscatedSignature(
		descriptor = "(Luy;FFF)V"
	)
	public static void wq(uy var0, float var1, float var2, float var3) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.ay();
			var0.cg_fld = var1;
			var0.mp_fld = var2;
			var0.ga_fld = var3;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ltu;I)V"
	)
	void ar(tu var1, int var2) {
		this.ar_fld = var1;
	}

	@ObfuscatedName("getQuantity")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getQuantity")
	@Override
	public int getQuantity() {
		return this.ay_fld;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(Ltu;)V"
	)
	void bf(tu var1) {
		this.ar_fld = var1;
	}

	@ObfuscatedName("pi")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int pi() {
		return this.js_fld;
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

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "()Lfn;"
	)
	@Override
	protected final fn ax() {
		try {
			og var1 = kb.ag(this.ah_fld, -1752383175);
			fn var2 = this.as_fld == null ? var1.al(this.ay_fld, (byte)-7) : var1.au(this.as_fld, 2004383694);
			if (null == var2) {
				return null;
			} else {
				fn var3 = null;
				if (!tu.av_fld.ar(this.ar_fld)) {
					uz var4 = dl.ah(this.ar_fld);
					uz.xq(var4, 1143308670);
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

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()Lfn;"
	)
	@Override
	protected final fn an() {
		try {
			og var1 = kb.ag(this.ah_fld, -1752383175);
			fn var2 = this.as_fld == null ? var1.al(this.ay_fld, (byte)-5) : var1.au(this.as_fld, -447034662);
			if (null == var2) {
				return null;
			} else {
				fn var3 = null;
				if (!tu.av_fld.ar(this.ar_fld)) {
					uz var4 = dl.ah(this.ar_fld);
					uz.xq(var4, 1170931831);
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

	@ObfuscatedName("isPrivate")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Export("isPrivate")
	@Override
	public boolean isPrivate() {
		return this.aw_fld;
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Loo;)V"
	)
	void be(oo var1) {
		this.as_fld = var1;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(Loo;)V"
	)
	void bs(oo var1) {
		this.as_fld = var1;
	}

	dw() {
		this.ar_fld = tu.ak_fld;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "()Lfn;"
	)
	@Override
	protected final fn au() {
		try {
			og var1 = kb.ag(this.ah_fld, -1752383175);
			fn var2 = this.as_fld == null ? var1.al(976122235 * this.ay_fld, (byte)-35) : var1.au(this.as_fld, 184160979);
			if (null == var2) {
				return null;
			} else {
				fn var3 = null;
				if (!tu.av_fld.ar(this.ar_fld)) {
					uz var4 = dl.ah(this.ar_fld);
					uz.xq(var4, 693482065);
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

	@ObfuscatedName("vi")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void vi(int var1) {
		this.js_fld = var1;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "()Loo;"
	)
	oo bz() {
		return this.as_fld;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void ab(int var1) {
		this.ae_fld = -1105446287 * var1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean ap(int var1) {
		return var1 >= 0 && var1 <= 4 ? (this.ae_fld & 1 << var1) != 0 : true;
	}

	@ObfuscatedName("getOwnership")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getOwnership")
	@Override
	public int getOwnership() {
		return this.av_fld;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean at(int var1) {
		return var1 >= 0 && var1 <= 4 ? (this.ae_fld & 1 << var1) != 0 : true;
	}

	@ObfuscatedName("ms")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ms() {
		return this.ti_fld;
	}

	@ObfuscatedName("getDespawnTime")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getDespawnTime")
	@Override
	public int getDespawnTime() {
		return this.ag_fld - client.gw_fld + client.sp_fld;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean ac(int var1) {
		return var1 >= 0 && var1 <= 4 ? (this.ae_fld & 1 << var1) != 0 : true;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "()Loo;"
	)
	oo br() {
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

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(Ltu;)V"
	)
	void by(tu var1) {
		this.ar_fld = var1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	protected boolean aq() {
		try {
			og var1 = kb.ag(this.ah_fld, -1752383175);
			fn var2 = null == this.as_fld ? var1.al(-92076382 * this.ay_fld, (byte)-69) : var1.au(this.as_fld, -607483739);
			return null != var2 && var2.cv_fld != null;
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("getVisibleTime")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getVisibleTime")
	@Override
	public int getVisibleTime() {
		return this.az_fld - client.gw_fld + client.sp_fld;
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

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "()Lfn;"
	)
	@Override
	protected final fn aa() {
		try {
			og var1 = kb.ag(1003630326 * this.ah_fld, -1752383175);
			fn var2 = this.as_fld == null ? var1.al(43761269 * this.ay_fld, (byte)-51) : var1.au(this.as_fld, 561257653);
			if (null == var2) {
				return null;
			} else {
				fn var3 = null;
				if (!tu.av_fld.ar(this.ar_fld)) {
					uz var4 = dl.ah(this.ar_fld);
					uz.xq(var4, 1565609130);
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
			og var2 = kb.ag(this.ah_fld, -1752383175);
			fn var3 = this.as_fld == null ? var2.al(this.ay_fld, (byte)-122) : var2.au(this.as_fld, -281282848);
			if (null == var3) {
				return null;
			} else {
				fn var4 = null;
				if (!tu.av_fld.ar(this.ar_fld)) {
					uz var5 = dl.ah(this.ar_fld);
					uz.xq(var5, 1047787519);
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
			og var1 = kb.ag(this.ah_fld, -1752383175);
			fn var2 = this.as_fld == null ? var1.al(-261374370 * this.ay_fld, (byte)-126) : var1.au(this.as_fld, 1252517138);
			if (null == var2) {
				return null;
			} else {
				fn var3 = null;
				if (!tu.av_fld.ar(this.ar_fld)) {
					uz var4 = dl.ah(this.ar_fld);
					uz.xq(var4, 20111193);
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

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	protected boolean ai() {
		try {
			og var1 = kb.ag(this.ah_fld, -1752383175);
			fn var2 = null == this.as_fld ? var1.al(this.ay_fld, (byte)-66) : var1.au(this.as_fld, 918585636);
			return null != var2 && var2.cv_fld != null;
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("yl")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void yl(int var1) {
		this.ti_fld = var1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(CI)C"
	)
	static char az(char var0) {
		return var0 != 181 && 402 != var0 ? Character.toTitleCase(var0) : var0;
	}

	@ObfuscatedName("fm")
	@ObfuscatedSignature(
		descriptor = "()Lrl10;"
	)
	public rl10 fm() {
		int var1 = this.ti_fld;
		int var2 = this.js_fld;
		dx var3 = dx.bu(this.os_fld);
		if (var1 != -1 && var2 != -1 && var3 != null) {
			rl10[][][] var4 = var3.getScene().getTiles();
			return var4[var3.getPlane()][var1][var2];
		} else {
			return null;
		}
	}

	@ObfuscatedName("lr")
	@ObfuscatedSignature(
		descriptor = "(Ldw;Loo;I)V"
	)
	public static void lr(dw var0, oo var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.as_fld = var1;
		}
	}

	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Override
	public void hf_void() {
		if (this.ti_fld != -1 && sq_fld == null) {
			sq_fld = this;
		}
	}

	@ObfuscatedName("tc")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void tc(int var1) {
		if (this.ti_fld != -1) {
			client.logger.debug("Item quantity changed: {} ({} -> {})", (Object[])(new Object[]{this.getId(), this.getQuantity(), var1}));
			ItemQuantityChanged var2 = new ItemQuantityChanged(this, this.fm(), this.getQuantity(), var1);
			og.ci_fld.getCallbacks().post(var2);
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Loo;I)V"
	)
	void ay(oo var1, int var2) {
		this.as_fld = var1;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bj() {
		if (this.ti_fld != -1 && sq_fld == null) {
			sq_fld = this;
		}
	}
}
