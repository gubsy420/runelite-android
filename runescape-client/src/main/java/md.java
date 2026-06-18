import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("md")
class md implements Callable {
	// $VF: synthetic field
	@ObfuscatedName("val$cancelled")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/concurrent/atomic/AtomicBoolean;"
	)
	AtomicBoolean val$cancelled;
	// $VF: synthetic field
	@ObfuscatedName("this$0")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	ml this$0;

	@ObfuscatedName("jp")
	@ObfuscatedSignature(
		descriptor = "(Lrh;)V"
	)
	public static void jp(rh var0) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.ag_fld = la.fq_fld.ah_fld.bo(var0.az_fld, 673626674) ? rw.ag_fld : rw.az_fld;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/Object;"
	)
	public Object ak() {
		PriorityQueue var1 = this.this$0.ah_fld;

		while (true) {
			Object var2 = null;
			synchronized (var1) {
				if (var1.isEmpty() || this.val$cancelled.get()) {
					return null;
				}

				var2 = (mp)var1.remove();
			}

			((mp)var2).ag_fld.ag();
		}
	}

	md(ml var1, AtomicBoolean var2) {
		this.this$0 = var1;
		this.val$cancelled = var2;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/Object;"
	)
	public Object ag() {
		PriorityQueue var1 = this.this$0.ah_fld;

		while (true) {
			Object var2 = null;
			synchronized (var1) {
				if (var1.isEmpty() || this.val$cancelled.get()) {
					return null;
				}

				var2 = (mp)var1.remove();
			}

			((mp)var2).ag_fld.ag();
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(CB)Z"
	)
	public static boolean ai(char var0) {
		if (var0 >= ' ' && var0 <= '~') {
			return true;
		} else {
			return var0 >= 160 && var0 <= 255 ? true : var0 == 8364 || 338 == var0 || var0 == 8212 || var0 == 339 || var0 == 376;
		}
	}

	@ObfuscatedName("call")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/Object;"
	)
	@Override
	public Object call() {
		PriorityQueue var1 = this.this$0.ah_fld;

		while (true) {
			Object var2 = null;
			synchronized (var1) {
				if (var1.isEmpty() || this.val$cancelled.get()) {
					return null;
				}

				var2 = (mp)var1.remove();
			}

			((mp)var2).ag_fld.ag();
		}
	}

	@ObfuscatedName("oq")
	@ObfuscatedSignature(
		descriptor = "(Lds;Lpg;)V"
	)
	public static void oq(ds var0, pg var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.al_fld = var1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;"
	)
	static String af() {
		StringBuilder var1 = new StringBuilder();
		Iterator var2 = cz.ag_fld.iterator();

		while (var2.hasNext()) {
			co var3 = (co)(co)var2.next();
			if (null != var3.av_fld && !var3.av_fld.isEmpty()) {
				var1.append(var3.av_fld).append(':');
			}

			var1.append(var3.aw_fld).append('\n');
		}

		return var1.toString();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[JIII)V"
	)
	public static void av(String[] var0, long[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var5 = (var2 + var3) / 2;
			int var6 = var2;
			String var7 = var0[var5];
			var0[var5] = var0[var3];
			var0[var3] = var7;
			long var8 = var1[var5];
			var1[var5] = var1[var3];
			var1[var3] = var8;

			for (int var10 = var2; var10 < var3; var10++) {
				if (null == var7 || null != var0[var10] && var0[var10].compareTo(var7) < (var10 & 1)) {
					String var11 = var0[var10];
					var0[var10] = var0[var6];
					var0[var6] = var11;
					long var12 = var1[var10];
					var1[var10] = var1[var6];
					var1[var6++] = var12;
				}
			}

			var0[var3] = var0[var6];
			var0[var6] = var7;
			var1[var3] = var1[var6];
			var1[var6] = var8;
			av(var0, var1, var2, var6 - 1);
			av(var0, var1, 1 + var6, var3);
		}
	}
}
