import java.io.EOFException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("rl15")
class rl15 implements Iterator {
	@ObfuscatedName("mp")
	@ObfuscatedSignature(
		descriptor = "Luq;"
	)
	public uq mp_fld;
	// $VF: synthetic field
	@ObfuscatedName("wp")
	@ObfuscatedSignature(
		descriptor = "Lnp;"
	)
	public np wp_fld;

	@ObfuscatedName("gj")
	@ObfuscatedSignature(
		descriptor = "(Lyr;Ljava/lang/String;Lxi;)V"
	)
	public static void gj(yr var0, String var1, xi var2) {
		if (var0 == null) {
			var0.getClass();
		}

		xi.ph(var2, var1, -518622557);
	}

	@ObfuscatedName("hasNext")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Export("hasNext")
	@Override
	public boolean hasNext() {
		return this.mp_fld != this.wp_fld.ag_fld;
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(Lwl;IIIZ)V"
	)
	public static void ce(wl var0, int var1, int var2, int var3, boolean var4) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			gf var5 = var0.af(var1, var2, var3, 1163735173);
			if (null == var5) {
				if (!var4) {
					return;
				}

				var5 = var0.at_fld;
			}

			boolean var6 = false;
			if (var0.aj_fld != var5 || var4) {
				var0.aj_fld = var5;
				var0.aa(var5, 1835593398);
				var6 = true;
			}

			if (var6 || var4) {
				wl.ys(var0, var1, var2, var3);
			}
		} catch (Throwable var8) {
			throw new RuntimeException(var8);
		}
	}

	@ObfuscatedName("remove")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Export("remove")
	@Override
	public void remove() {
		uq var1 = this.mp_fld.ex();
		var1.az();
	}

	@ObfuscatedName("yr")
	@ObfuscatedSignature(
		descriptor = "()Lrd;"
	)
	public rd next() {
		try {
			if (this.mp_fld == this.wp_fld.ag_fld) {
				throw new NoSuchElementException();
			} else {
				rd var1 = (rd)this.mp_fld;
				this.mp_fld = this.mp_fld.yb();
				return var1;
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	public rl15(np var1) {
		this.wp_fld = var1;
		this.mp_fld = this.wp_fld.ag_fld.yb();
	}
}
