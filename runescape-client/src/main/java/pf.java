import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import net.runelite.api.annotations.Export;
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
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1544512169
	)
	int az_fld = 0;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -72139807
	)
	int ag_fld;
	@ObfuscatedName("qw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1505978507
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
	@Export("remove")
	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/Object;"
	)
	public Object ay() {
		try {
			if (199684183 * this.ak_fld.ae_fld != this.ag_fld) {
				throw new ConcurrentModificationException();
			} else if (this.az_fld < this.ak_fld.av_fld * 706627265) {
				Object var1 = this.ak_fld.ag_fld[this.az_fld * -1324139862].ak_fld;
				this.az_fld++;
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
	@Export("hasNext")
	@Override
	public boolean hasNext() {
		return this.az_fld < this.ak_fld.av_fld * 1478362993;
	}

	@ObfuscatedName("next")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/Object;"
	)
	@Export("next")
	@Override
	public Object next() {
		try {
			if (-995588819 * this.ak_fld.ae_fld != this.ag_fld) {
				throw new ConcurrentModificationException();
			} else if (this.az_fld < this.ak_fld.av_fld * 1478362993) {
				Object var1 = this.ak_fld.ag_fld[this.az_fld].ak_fld;
				this.az_fld++;
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
		return this.az_fld < this.ak_fld.av_fld * 1478362993;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/Object;"
	)
	public Object as() {
		try {
			if (-995588819 * this.ak_fld.ae_fld != this.ag_fld) {
				throw new ConcurrentModificationException();
			} else if (this.az_fld < this.ak_fld.av_fld * 1478362993) {
				Object var1 = this.ak_fld.ag_fld[this.az_fld].ak_fld;
				this.az_fld++;
				return var1;
			} else {
				throw new NoSuchElementException();
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "(Lpf;)V"
	)
	public static void dg(pf var0) {
		if (var0 == null) {
			var0.getClass();
		}

		throw new UnsupportedOperationException();
	}

	pf(pd var1) {
		this.ag_fld = -412888371 * this.ak_fld.ae_fld;
		this.ak_fld = var1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void af() {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void al() {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ax() {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void an() {
		throw new UnsupportedOperationException();
	}
}
