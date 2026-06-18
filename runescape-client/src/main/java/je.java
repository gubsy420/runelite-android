import java.io.EOFException;
import java.util.Iterator;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("je")
public class je {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int az_fld;
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bf_fld;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ac_fld;

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(J)V"
	)
	public static final void ae(long var0) {
		if (var0 > 0L) {
			if (0L == var0 % 10L) {
				ek.ag(var0 - 1L);
				ek.ag(1L);
			} else {
				ek.ag(var0);
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(J)V"
	)
	public static final void az(long var0) {
		if (var0 > 0L) {
			if (0L == var0 % 10L) {
				ek.ag(var0 - 1L);
				ek.ag(1L);
			} else {
				ek.ag(var0);
			}
		}
	}

	je() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(J)V"
	)
	public static final void av(long var0) {
		if (var0 > 0L) {
			if (0L == var0 % 10L) {
				ek.ag(var0 - 1L);
				ek.ag(1L);
			} else {
				ek.ag(var0);
			}
		}
	}

	@ObfuscatedName("oj")
	@ObfuscatedSignature(
		descriptor = "(Lku;)I"
	)
	public static int oj(ku var0) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.ax_fld;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(J)V"
	)
	static final void ah(long var0) {
		try {
			Thread.sleep(var0);
		} catch (InterruptedException var3) {
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(J)Ljava/lang/String;"
	)
	public static String ak(long var0) {
		if (var0 > 0L && var0 < 6582952005840035281L) {
			if (var0 % 37L == 0L) {
				return null;
			} else {
				int var2 = 0;

				for (long var3 = var0; 0L != var3; var3 /= 37L) {
					var2++;
				}

				StringBuilder var5 = new StringBuilder(var2);

				while (0L != var0) {
					long var6 = var0;
					var0 /= 37L;
					char var8 = nq.ak_fld[(int)(var6 - var0 * 37L)];
					if (var8 == '_') {
						int var9 = var5.length() - 1;
						var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9)));
						var8 = 160;
					}

					var5.append(var8);
				}

				var5.reverse();
				var5.setCharAt(0, Character.toUpperCase(var5.charAt(0)));
				return var5.toString();
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public static void ag(int var0, int var1) {
		Iterator var3 = mb.ak_fld.iterator();

		while (var3.hasNext()) {
			mq var4 = (mq)(mq)var3.next();
			var4.id(var0, var1, 1843858322);
		}
	}

	@ObfuscatedName("fe")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIII)I"
	)
	public static final int fe(String var0, String var1, int var2, int var3, int var4, int var5) throws EOFException {
		return ky.fl(var0, var1, var2, var3, var4, var5, -1, false, 0);
	}
}
