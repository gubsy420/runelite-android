import java.util.Iterator;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("wp")
public class wp extends ws {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int az_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	static boolean ak_fld;

	@ObfuscatedName("qc")
	@ObfuscatedSignature(
		descriptor = "(Lli;)V"
	)
	public static void qc(li var0) {
		if (var0 == null) {
			var0.getClass();
		}

		if (!li.as(var0, (short)12454) && var0.bm_fld < var0.am_fld.ae()) {
			int var1 = zg.qn(var0.am_fld, var0.bm_fld, (byte)-33);
			var0.dc();
			li.ik(var0, var1, var1, (byte)-73);
		}
	}

	public wp(ws var1) {
		super(var1);
		this.aw_fld = "StartSongTask";
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int ay(int var0) {
		var0 = --var0 | var0 >>> 1;
		var0 |= var0 >>> 2;
		var0 |= var0 >>> 4;
		var0 |= var0 >>> 8;
		var0 |= var0 >>> 16;
		return var0 + 1;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	public boolean ag() {
		Iterator var1 = mb.av_fld.iterator();

		while (var1.hasNext()) {
			me var2 = (me)(me)var1.next();
			if (var2 != null && !var2.ah_fld && var2.af_fld != null) {
				try {
					ml.pc(var2.af_fld, (byte)-124);
					var2.af_fld.ak(0);
					if (null != var2.au_fld) {
						var2.af_fld.al(var2.au_fld, var2.aw_fld);
					}

					var2.au_fld = null;
					var2.al_fld = null;
					var2.ak_fld = null;
					var2.ah_fld = true;
				} catch (Exception var4) {
					gl.ak(null, var4);
					this.al(var4.getMessage());
					return true;
				}
			}
		}

		this.av_fld = true;
		return true;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(S)Z"
	)
	@Override
	public boolean ak(short var1) {
		Iterator var2 = mb.av_fld.iterator();

		while (var2.hasNext()) {
			me var3 = (me)(me)var2.next();
			if (var3 != null && !var3.ah_fld && var3.af_fld != null) {
				try {
					ml.pc(var3.af_fld, (byte)-28);
					var3.af_fld.ak(0);
					if (null != var3.au_fld) {
						var3.af_fld.al(var3.au_fld, var3.aw_fld);
					}

					var3.au_fld = null;
					var3.al_fld = null;
					var3.ak_fld = null;
					var3.ah_fld = true;
				} catch (Exception var5) {
					gl.ak(null, var5);
					this.al(var5.getMessage());
					return true;
				}
			}
		}

		this.av_fld = true;
		return true;
	}
}
