import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("sx")
class sx implements Callable {
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bh_fld;
	// $VF: synthetic field
	@ObfuscatedName("val$version")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int val$version;
	// $VF: synthetic field
	@ObfuscatedName("this$0")
	@ObfuscatedSignature(
		descriptor = "Lsp;"
	)
	sp this$0;
	// $VF: synthetic field
	@ObfuscatedName("val$p")
	@ObfuscatedSignature(
		descriptor = "Lxi;"
	)
	xi val$p;
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int by_fld;

	@ObfuscatedName("nc")
	@ObfuscatedSignature(
		descriptor = "(Lyb;I)Lyb;"
	)
	public static yb nc(yb var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			var0.as_fld = var1;
			return var0;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/Object;"
	)
	public Object ag() {
		sp.lp(this.this$0, this.val$p, this.val$version, -311023463);
		return null;
	}

	sx(sp var1, xi var2, int var3) {
		this.this$0 = var1;
		this.val$p = var2;
		this.val$version = var3;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/Object;"
	)
	public Object ak() {
		sp.lp(this.this$0, this.val$p, this.val$version, 517336930);
		return null;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lsl;IIB)V"
	)
	public static void ab(sl var0, int var1, int var2) {
		om.ap(var0, null, true, (byte)0);
		if (var1 != 0) {
			if (var2 >= 0 && var2 < var0.av_fld && var1 >= 0 && var1 + var2 <= var0.av_fld) {
				if (var2 < var0.av_fld - var1) {
					eb.aj(var0, var2 + var1, var0, var2, var0.av_fld - (var2 + var1));
				}

				var0.af(var0.av_fld - var1);
			} else {
				throw new RuntimeException();
			}
		}
	}

	@ObfuscatedName("sx")
	@ObfuscatedSignature(
		descriptor = "(Lvo;Ljava/lang/String;)V"
	)
	public static void sx(vo var0, String var1) {
		if (var0 == null) {
			var0.getClass();
		} else {
			String[] var2 = var1.split("\\.");

			try {
				var0.ae_fld = Integer.parseInt(var2[1]);
				var2 = var2[2].split("_");
				var0.ah_fld = Integer.parseInt(var2[0]);
				var0.av_fld = Integer.parseInt(var2[1]);
			} catch (Exception var4) {
			}
		}
	}

	@ObfuscatedName("call")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/Object;"
	)
	@Override
	public Object call() {
		sp.lp(this.this$0, this.val$p, this.val$version, 1656466740);
		return null;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIB)V"
	)
	public static void av(int var0, int var1) {
		cw.af(var0, var1, 0, 0);
		mb.ay_fld.clear();
		mb.as_fld.clear();
		if (mb.av_fld.isEmpty() || 0 == var0 && var1 == 0) {
			Iterator var5 = mb.av_fld.iterator();

			while (var5.hasNext()) {
				me var4 = (me)(me)var5.next();
				if (var4 != null) {
					var4.af_fld.av();
					var4.af_fld.ar();
					var4.af_fld.ak(0);
					var4.af_fld.aw_fld = 0;
					je.ag(var4.ag_fld, var4.az_fld);
				}
			}

			mb.av_fld.clear();
		} else {
			mb.as_fld.add(new we(null, mb.ar_fld));
			mb.as_fld.add(new wg(null, 0, false, mb.af_fld));
			ArrayList var3 = ky.al();
			mb.as_fld.add(new vj(null, var3));
		}
	}
}
