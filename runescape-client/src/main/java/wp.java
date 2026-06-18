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

	public wp(ws var1) {
		super(var1);
		this.aw_fld = "StartSongTask";
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	public static int ay(int var0) {
		var0 = --var0 | var0 >>> 1;
		var0 |= var0 >>> 2;
		var0 |= var0 >>> 4;
		var0 |= var0 >>> 8;
		var0 |= var0 >>> 16;
		return var0 + 1;
	}

	@ObfuscatedName("lf")
	@ObfuscatedSignature(
		descriptor = "(Luo;)Luk;"
	)
	public static uk lf(uo var0) {
		return var0.aj_fld;
	}

	@ObfuscatedName("mk")
	@ObfuscatedSignature(
		descriptor = "(Lyb;Ljava/lang/String;)Lyb;"
	)
	public static yb mk(yb var0, String var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			var0.af_fld = var1;
			return var0;
		}
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
			if (var2 != null && !var2.ay_fld && var2.af_fld != null) {
				try {
					var2.af_fld.au();
					var2.af_fld.ak(0);
					if (null != var2.au_fld) {
						var2.af_fld.al(var2.au_fld, var2.ah_fld);
					}

					var2.au_fld = null;
					var2.al_fld = null;
					var2.ak_fld = null;
					var2.ay_fld = true;
				} catch (Exception var4) {
					gl.ak(null, var4);
					ws.dx(this, var4.getMessage(), (byte)-72);
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
			if (var3 != null && !var3.ay_fld && var3.af_fld != null) {
				try {
					var3.af_fld.au();
					var3.af_fld.ak(0);
					if (null != var3.au_fld) {
						var3.af_fld.al(var3.au_fld, var3.ah_fld);
					}

					var3.au_fld = null;
					var3.al_fld = null;
					var3.ak_fld = null;
					var3.ay_fld = true;
				} catch (Exception var5) {
					gl.ak(null, var5);
					ws.dx(this, var5.getMessage(), (byte)-103);
					return true;
				}
			}
		}

		this.av_fld = true;
		return true;
	}
}
