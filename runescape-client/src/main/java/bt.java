import java.io.EOFException;
import net.runelite.api.GraphicsObject;
import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.events.GraphicsObjectCreated;

@ObfuscatedName("bt")
@Implements({"GraphicsObject"})
public class bt extends em implements GraphicsObject {
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -598188085
	)
	int ah_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1815087979
	)
	int ae_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lqa;"
	)
	qa ay_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1790360641
	)
	int av_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 128457163
	)
	int az_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ldx;"
	)
	dx ak_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1719870661
	)
	int aw_fld;
	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int bi_fld;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int al_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -319818577
	)
	int ag_fld;
	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "[Lyc;"
	)
	static yc[] dd_fld;
	@ObfuscatedName("oj")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 901000787
	)
	static int oj_fld;

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	protected boolean am() {
		try {
			if (qa.jv(this.ay_fld, -1452882688) && qa.kw(this.ay_fld, 1633447380).ar(this.ay_fld.aw(1207031604), (byte)121)) {
				return true;
			} else {
				ot var1 = ou.ak(this.aw_fld * -926859008);
				fn var2 = ot.nc(var1, -1087944226);
				return null != var2 && null != var2.cv_fld;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("getLocation")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/coords/LocalPoint;"
	)
	@Export("getLocation")
	@Override
	public LocalPoint getLocation() {
		return new LocalPoint(this.co(), this.hz(), this.ak_fld);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean ak(int var1) {
		return !qa.jv(this.ay_fld, 804259197);
	}

	@ObfuscatedName("yl")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void yl(int var1) {
		this.av_fld = var1;
	}

	@ObfuscatedName("getAnimationFrame")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getAnimationFrame")
	@Override
	public int getAnimationFrame() {
		return this.ay_fld.ae_fld * 249909987;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Lfn;"
	)
	@Override
	protected final fn az(int var1) {
		try {
			return this.xc();
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("finished")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	public boolean finished() {
		return this.ay_fld.az_fld == null;
	}

	@ObfuscatedName("setFinished")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	@Export("setFinished")
	@Override
	public void setFinished(boolean var1) {
		try {
			if (!var1) {
				throw new UnsupportedOperationException();
			} else {
				this.ay_fld.oo();
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("getLevel")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getLevel")
	@Override
	public int getLevel() {
		return this.az_fld;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)Z"
	)
	@Override
	protected boolean av(byte var1) {
		try {
			if (qa.jv(this.ay_fld, 1143245912) && qa.kw(this.ay_fld, -380922136).ar(this.ay_fld.aw(-1831134554), (byte)73)) {
				return true;
			} else {
				ot var2 = ou.ak(this.aw_fld);
				fn var3 = ot.nc(var2, -106100964);
				return null != var3 && null != var3.cv_fld;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("getStartCycle")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getStartCycle")
	@Override
	public int getStartCycle() {
		return this.ag_fld;
	}

	@ObfuscatedName("vh")
	@ObfuscatedSignature(
		descriptor = "()Lol;"
	)
	public ol getAnimation() {
		return this.ay_fld.az_fld;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	protected int ad_int() {
		return qa.jv(this.ay_fld, 1838305629) ? qa.kw(this.ay_fld, -185606641).bp_fld * -786775897 : 0;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	final void ag(int var1, int var2) {
		try {
			this.wo(var1);
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("fd")
	@ObfuscatedSignature(
		descriptor = "()Ldx;"
	)
	public dx getWorldView() {
		return this.ak_fld;
	}

	@ObfuscatedName("xc")
	@ObfuscatedSignature(
		descriptor = "()Lfn;"
	)
	public fn xc() {
		try {
			int var2 = -178304394;
			fn var10000;
			if (this.ay_fld.ax(30)) {
				Object var1 = null;
				var10000 = (fn)var1;
			} else {
				ot var3 = ou.ak(this.aw_fld);
				fn var4 = var3.ae(this.ay_fld.aw(692703677));
				if (var4 == null) {
					Object var6 = null;
					var10000 = (fn)var6;
				} else {
					var10000 = var4;
				}
			}

			return var10000;
		} catch (Throwable var5) {
			throw new RuntimeException(var5);
		}
	}

	bt(dx var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) throws EOFException {
		this.ay_fld = new qa();
		this.ak_fld = var1;
		this.aw_fld = var2;
		this.az_fld = var3;
		this.av_fld = var4;
		this.ae_fld = var5;
		this.ah_fld = var6;
		this.ag_fld = 1902109263 * (var7 + var8);
		qa.hs(this.ay_fld, ou.ak(this.aw_fld).ai_fld * 158714689, 1241692829);
		this.po();
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	final void as(int var1) {
		try {
			if (!this.ak(2137407920)) {
				jm.kr_fld.av(this.ak_fld, this.av_fld, this.ae_fld, false);
				int var2 = cf.ak(this.ay_fld, var1, jm.kr_fld);
				jm.kr_fld.ae();
				if ((var2 & 1) != 0) {
					qa.gr(this.ay_fld, 1324385609);
				}
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "()Lfn;"
	)
	@Override
	protected final fn al() {
		try {
			if (this.ay_fld.ax(30)) {
				return null;
			} else {
				ot var1 = ou.ak(this.aw_fld);
				fn var2 = var1.ae(this.ay_fld.aw(242191704));
				return var2 == null ? null : var2;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("po")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void po() {
		GraphicsObjectCreated var1 = new GraphicsObjectCreated(this);
		og.ci_fld.getCallbacks().post(var1);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "()Lfn;"
	)
	@Override
	protected final fn au() {
		try {
			if (this.ay_fld.ax(30)) {
				return null;
			} else {
				ot var1 = ou.ak(this.aw_fld);
				fn var2 = var1.ae(this.ay_fld.aw(1003943931));
				return var2 == null ? null : var2;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "()Lfn;"
	)
	@Override
	protected final fn ax() {
		try {
			if (this.ay_fld.ax(30)) {
				return null;
			} else {
				ot var1 = ou.ak(this.aw_fld);
				fn var2 = var1.ae(this.ay_fld.aw(-1447162464));
				return var2 == null ? null : var2;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("xb")
	@ObfuscatedSignature(
		descriptor = "(Lbt;I)V"
	)
	public static void xb(bt var0, int var1) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			if (!var0.ak(2005738184)) {
				jm.kr_fld.av(var0.ak_fld, var0.av_fld, var0.ae_fld, false);
				int var2 = cf.ak(var0.ay_fld, var1, jm.kr_fld);
				jm.kr_fld.ae();
				if ((var2 & 1) != 0) {
					qa.gr(var0.ay_fld, -688459003);
				}
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()Lfn;"
	)
	@Override
	protected final fn an() {
		try {
			if (this.ay_fld.ax(30)) {
				return null;
			} else {
				ot var1 = ou.ak(this.aw_fld);
				fn var2 = var1.ae(this.ay_fld.aw(999383684));
				return var2 == null ? null : var2;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("getId")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getId")
	@Override
	public int getId() {
		return this.aw_fld;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "()Lfn;"
	)
	@Override
	protected final fn aa() {
		try {
			if (this.ay_fld.ax(30)) {
				return null;
			} else {
				ot var1 = ou.ak(this.aw_fld);
				fn var2 = var1.ae(this.ay_fld.aw(-53991398));
				return var2 == null ? null : var2;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("hz")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int hz() {
		return this.ae_fld;
	}

	@ObfuscatedName("getZ")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getZ")
	@Override
	public int getZ() {
		return this.ah_fld;
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int co() {
		return this.av_fld;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	protected boolean ai() {
		try {
			if (qa.jv(this.ay_fld, 266102022) && qa.kw(this.ay_fld, 1789778555).ar(this.ay_fld.aw(-1229609299), (byte)67)) {
				return true;
			} else {
				ot var1 = ou.ak(this.aw_fld * 516386728);
				fn var2 = ot.nc(var1, -1546493761);
				return null != var2 && null != var2.cv_fld;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("kt")
	@ObfuscatedSignature(
		descriptor = "(Lna;)Lvw;"
	)
	public static vw kt(na var0) {
		vw var1 = var0.ak_fld.hw_fld;
		if (var1 == var0.ak_fld) {
			return null;
		} else {
			var1.gy();
			return var1;
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	protected boolean aq() {
		try {
			if (qa.jv(this.ay_fld, 2111746978) && qa.kw(this.ay_fld, 525850924).ar(this.ay_fld.aw(-1516786779), (byte)103)) {
				return true;
			} else {
				ot var1 = ou.ak(this.aw_fld);
				fn var2 = ot.nc(var1, 2081787870);
				return null != var2 && null != var2.cv_fld;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("fu")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void fu(int var1) {
		this.ae_fld = var1;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	@Override
	protected int ae(byte var1) {
		return qa.jv(this.ay_fld, 827629112) ? qa.kw(this.ay_fld, 980910802).bp_fld * 67262061 : 0;
	}

	@ObfuscatedName("wo")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void wo(int var1) {
		try {
			int var4 = 783018406;
			if (!this.ak(1970204588)) {
				jm.kr_fld.av(this.ak_fld, this.av_fld, this.ae_fld, false);
				int var5 = cf.ak(this.ay_fld, var1, jm.kr_fld);
				jm.kr_fld.ae();
				if ((var5 & 1) != 0) {
					qa.gr(this.ay_fld, -1322009900);
				}
			}
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	protected int ao() {
		return qa.jv(this.ay_fld, 451449310) ? qa.kw(this.ay_fld, 2095291313).bp_fld * 67262061 : 0;
	}

	public bt() {
	}
}
