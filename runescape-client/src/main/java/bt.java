import java.io.EOFException;
import net.runelite.api.GraphicsObject;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.events.GraphicsObjectCreated;

@ObfuscatedName("bt")
@Implements({"GraphicsObject"})
public class bt extends em implements GraphicsObject {
	@ObfuscatedGetter(
		intValue = -598188085
	)
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ah_fld;
	@ObfuscatedGetter(
		intValue = -1815087979
	)
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ae_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lqa;"
	)
	qa ay_fld;
	@ObfuscatedGetter(
		intValue = 1790360641
	)
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int av_fld;
	@ObfuscatedGetter(
		intValue = 128457163
	)
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int az_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ldx;"
	)
	dx ak_fld;
	@ObfuscatedGetter(
		intValue = -1719870661
	)
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
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
	@ObfuscatedGetter(
		intValue = -319818577
	)
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ag_fld;
	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "[Lyc;"
	)
	static yc[] dd_fld;
	@ObfuscatedGetter(
		intValue = 901000787
	)
	@ObfuscatedName("oj")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int oj_fld;

	@ObfuscatedName("setFinished")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	@Override
	public void setFinished(boolean var1) {
		try {
			if (!var1) {
				throw new UnsupportedOperationException();
			} else {
				this.ay_fld.cp();
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	protected boolean aq() {
		try {
			if (this.ay_fld.av() && this.ay_fld.ae().ar(qa.do_(this.ay_fld, 1207031604), (byte)121)) {
				return true;
			} else {
				ot var1 = ou.ak(this.aw_fld * -926859008);
				fn var2 = ot.mm(var1, -1087944226);
				return null != var2 && null != var2.cv_fld;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean ak(int var1) {
		return !this.ay_fld.av();
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Lfn;"
	)
	@Override
	protected final fn az(int var1) {
		try {
			return this.rm();
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("jl")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void jl(int var1) {
		try {
			int var4 = 783018406;
			if (!this.ak(1970204588)) {
				jm.kr_fld.av(this.ak_fld, this.av_fld, this.ae_fld, false);
				int var5 = cf.ak(this.ay_fld, var1, jm.kr_fld);
				jm.kr_fld.ae(1999755801);
				if ((var5 & 1) != 0) {
					this.ay_fld.ag();
				}
			}
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("zo")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void zo(int var1) {
		this.ae_fld = var1;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)Z"
	)
	@Override
	protected boolean av(byte var1) {
		try {
			if (this.ay_fld.av() && this.ay_fld.ae().ar(qa.do_(this.ay_fld, -1831134554), (byte)73)) {
				return true;
			} else {
				ot var2 = ou.ak(this.aw_fld);
				fn var3 = ot.mm(var2, -106100964);
				return null != var3 && null != var3.cv_fld;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean ah() {
		return !this.ay_fld.av();
	}

	@ObfuscatedName("getAnimationFrame")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getAnimationFrame() {
		return this.ay_fld.ae_fld * 249909987;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	protected int ao() {
		return this.ay_fld.av() ? this.ay_fld.ae().bp_fld * -786775897 : 0;
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
		qa.ju(this.ay_fld, ou.ak(this.aw_fld).ai_fld * 158714689, 1241692829);
		this.xf();
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
				jm.kr_fld.ae(1990840535);
				if ((var2 & 1) != 0) {
					this.ay_fld.ag();
				}
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	final void ar(int var1) {
		try {
			if (!this.ak(2005738184)) {
				jm.kr_fld.av(this.ak_fld, this.av_fld, this.ae_fld, false);
				int var2 = cf.ak(this.ay_fld, var1, jm.kr_fld);
				jm.kr_fld.ae(1999823758);
				if ((var2 & 1) != 0) {
					this.ay_fld.ag();
				}
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("xd")
	@ObfuscatedSignature(
		descriptor = "()Ldx;"
	)
	public dx getWorldView() {
		return this.ak_fld;
	}

	@ObfuscatedName("getId")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getId() {
		return this.aw_fld;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "()Lfn;"
	)
	@Override
	protected final fn al() {
		try {
			if (qa.jo(this.ay_fld, 30)) {
				return null;
			} else {
				ot var1 = ou.ak(this.aw_fld);
				fn var2 = var1.ae(qa.do_(this.ay_fld, 242191704), 1001839035);
				return var2 == null ? null : var2;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "()Lfn;"
	)
	@Override
	protected final fn au() {
		try {
			if (qa.jo(this.ay_fld, 30)) {
				return null;
			} else {
				ot var1 = ou.ak(this.aw_fld);
				fn var2 = var1.ae(qa.do_(this.ay_fld, 1003943931), 703984283);
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
			if (qa.jo(this.ay_fld, 30)) {
				return null;
			} else {
				ot var1 = ou.ak(this.aw_fld);
				fn var2 = var1.ae(qa.do_(this.ay_fld, -1447162464), 1573667248);
				return var2 == null ? null : var2;
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
			if (qa.jo(this.ay_fld, 30)) {
				return null;
			} else {
				ot var1 = ou.ak(this.aw_fld);
				fn var2 = var1.ae(qa.do_(this.ay_fld, 999383684), 1136126533);
				return var2 == null ? null : var2;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("rm")
	@ObfuscatedSignature(
		descriptor = "()Lfn;"
	)
	public fn rm() {
		try {
			int var2 = -178304394;
			fn var10000;
			if (qa.jo(this.ay_fld, 30)) {
				Object var1 = null;
				var10000 = (fn)var1;
			} else {
				ot var3 = ou.ak(this.aw_fld);
				fn var4 = var3.ae(qa.do_(this.ay_fld, 692703677), 625799989);
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

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "()Lfn;"
	)
	@Override
	protected final fn aa() {
		try {
			if (qa.jo(this.ay_fld, 30)) {
				return null;
			} else {
				ot var1 = ou.ak(this.aw_fld);
				fn var2 = var1.ae(qa.do_(this.ay_fld, -53991398), 1712494653);
				return var2 == null ? null : var2;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
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

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	protected boolean am() {
		try {
			if (this.ay_fld.av() && this.ay_fld.ae().ar(qa.do_(this.ay_fld, -1229609299), (byte)67)) {
				return true;
			} else {
				ot var1 = ou.ak(this.aw_fld * 516386728);
				fn var2 = ot.mm(var1, -1546493761);
				return null != var2 && null != var2.cv_fld;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("xf")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void xf() {
		GraphicsObjectCreated var1 = new GraphicsObjectCreated(this);
		og.ci_fld.getCallbacks().post(var1);
	}

	@ObfuscatedName("getZ")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getZ() {
		return this.ah_fld;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	protected boolean ai() {
		try {
			if (this.ay_fld.av() && this.ay_fld.ae().ar(qa.do_(this.ay_fld, -1516786779), (byte)103)) {
				return true;
			} else {
				ot var1 = ou.ak(this.aw_fld);
				fn var2 = ot.mm(var1, 2081787870);
				return null != var2 && null != var2.cv_fld;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("gl")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int gl() {
		return this.ae_fld;
	}

	@ObfuscatedName("pl")
	@ObfuscatedSignature(
		descriptor = "(Lbt;I)V"
	)
	public static void pl(bt var0, int var1) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			if (!var0.ak(2073859330)) {
				jm.kr_fld.av(var0.ak_fld, var0.av_fld, var0.ae_fld, false);
				int var2 = cf.ak(var0.ay_fld, var1, jm.kr_fld);
				jm.kr_fld.ae(2004166962);
				if ((var2 & 1) != 0) {
					var0.ay_fld.ag();
				}
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("getStartCycle")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getStartCycle() {
		return this.ag_fld;
	}

	@ObfuscatedName("vb")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int vb() {
		return this.av_fld;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	@Override
	protected int ae(byte var1) {
		return this.ay_fld.av() ? this.ay_fld.ae().bp_fld * 67262061 : 0;
	}

	@ObfuscatedName("tw")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void tw(int var1) {
		this.av_fld = var1;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	protected int ad() {
		return this.ay_fld.av() ? this.ay_fld.ae().bp_fld * 67262061 : 0;
	}

	@ObfuscatedName("jj")
	@ObfuscatedSignature(
		descriptor = "()Lol;"
	)
	public ol getAnimation() {
		return this.ay_fld.az_fld;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean ay() {
		return !this.ay_fld.av();
	}

	@ObfuscatedName("el")
	@ObfuscatedSignature(
		descriptor = "(Lbt;)Z"
	)
	public static boolean el(bt var0) {
		return !var0.ay_fld.av();
	}

	@ObfuscatedName("getLocation")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/coords/LocalPoint;"
	)
	@Override
	public LocalPoint getLocation() {
		return new LocalPoint(this.vb(), this.gl(), this.ak_fld);
	}

	public bt() {
	}

	@ObfuscatedName("getLevel")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getLevel() {
		return this.az_fld;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	final void ag(int var1, int var2) {
		this.zo(var1);
	}
}
