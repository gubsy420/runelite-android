import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("pf")
public class pf implements Iterator {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lpd;"
	)
	pd ak_fld;
	@ObfuscatedGetter(
		intValue = -1544512169
	)
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ag_fld = 0;
	@ObfuscatedGetter(
		intValue = -72139807
	)
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int az_fld;
	@ObfuscatedGetter(
		intValue = 1505978507
	)
	@ObfuscatedName("qw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int qw_fld;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "[Lyc;"
	)
	static yc[] ax_fld;
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int by_fld;

	@ObfuscatedName("remove")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/Object;"
	)
	public Object as() {
		try {
			if (199684183 * this.ak_fld.av_fld != this.az_fld) {
				throw new ConcurrentModificationException();
			} else if (this.ag_fld < this.ak_fld.ae_fld * 706627265) {
				Object var1 = this.ak_fld.ag_fld[this.ag_fld * -1324139862].ak_fld;
				this.ag_fld++;
				return var1;
			} else {
				throw new NoSuchElementException();
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("hasNext")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	public boolean hasNext() {
		return this.ag_fld < this.ak_fld.ae_fld * 1478362993;
	}

	@ObfuscatedName("next")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/Object;"
	)
	@Override
	public Object next() {
		try {
			if (-995588819 * this.ak_fld.av_fld != this.az_fld) {
				throw new ConcurrentModificationException();
			} else if (this.ag_fld < this.ak_fld.ae_fld * 1478362993) {
				Object var1 = this.ak_fld.ag_fld[this.ag_fld].ak_fld;
				this.ag_fld++;
				return var1;
			} else {
				throw new NoSuchElementException();
			}
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean ar() {
		return this.ag_fld < this.ak_fld.ae_fld * 1478362993;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/Object;"
	)
	public Object ay() {
		try {
			if (-995588819 * this.ak_fld.av_fld != this.az_fld) {
				throw new ConcurrentModificationException();
			} else if (this.ag_fld < this.ak_fld.ae_fld * 1478362993) {
				Object var1 = this.ak_fld.ag_fld[this.ag_fld].ak_fld;
				this.ag_fld++;
				return var1;
			} else {
				throw new NoSuchElementException();
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	pf(pd var1) {
		this.az_fld = -412888371 * this.ak_fld.av_fld;
		this.ak_fld = var1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void al() {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("yf")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)Z"
	)
	public static boolean yf(xi var0) {
		if (var0 == null) {
			var0.getClass();
		}

		return (var0.cg() & 1) == 1;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void au() {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("gs")
	@ObfuscatedSignature(
		descriptor = "(Lpf;)V"
	)
	public static void gs(pf var0) {
		if (var0 == null) {
			var0.getClass();
		}

		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ax() {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void af() {
		throw new UnsupportedOperationException();
	}
}
