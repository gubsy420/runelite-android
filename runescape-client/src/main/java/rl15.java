import java.util.Iterator;
import java.util.NoSuchElementException;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("rl15")
class rl15 implements Iterator {
	@ObfuscatedName("qu")
	@ObfuscatedSignature(
		descriptor = "Luq;"
	)
	public uq qu_fld;
	// $VF: synthetic field
	@ObfuscatedName("xv")
	@ObfuscatedSignature(
		descriptor = "Lnp;"
	)
	public np xv_fld;

	@ObfuscatedName("remove")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Override
	public void remove() {
		uq var1 = this.qu_fld.mn();
		var1.mr();
	}

	@ObfuscatedName("tw")
	@ObfuscatedSignature(
		descriptor = "(Lml;I)V"
	)
	public static void tw(ml var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}
	}

	@ObfuscatedName("sr")
	@ObfuscatedSignature(
		descriptor = "(Loy;)Lvr;"
	)
	public static vr sr(oy var0) {
		return var0.bk_fld;
	}

	@ObfuscatedName("hasNext")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	public boolean hasNext() {
		return this.qu_fld != this.xv_fld.ak_fld;
	}

	@ObfuscatedName("id")
	@ObfuscatedSignature(
		descriptor = "()Lrd;"
	)
	public rd next() {
		try {
			if (this.qu_fld == this.xv_fld.ak_fld) {
				throw new NoSuchElementException();
			} else {
				rd var1 = (rd)this.qu_fld;
				this.qu_fld = this.qu_fld.sf();
				return var1;
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	public rl15(np var1) {
		this.xv_fld = var1;
		this.qu_fld = this.xv_fld.ak_fld.sf();
	}
}
