import java.util.Iterator;
import java.util.NoSuchElementException;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("rl11")
class rl11 implements Iterator {
	// $VF: synthetic field
	@ObfuscatedName("pm")
	@ObfuscatedSignature(
		descriptor = "Lna;"
	)
	public na pm_fld;
	@ObfuscatedName("ri")
	@ObfuscatedSignature(
		descriptor = "Lvw;"
	)
	public vw ri_fld;

	@ObfuscatedName("hasNext")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	public boolean hasNext() {
		return this.ri_fld != this.pm_fld.ak_fld;
	}

	@ObfuscatedName("remove")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Override
	public void remove() {
		vw var1 = this.ri_fld.getPrevious();
		var1.xh();
	}

	@ObfuscatedName("wb")
	@ObfuscatedSignature(
		descriptor = "()Lvw;"
	)
	public vw next() {
		try {
			if (this.ri_fld == this.pm_fld.ak_fld) {
				throw new NoSuchElementException();
			} else {
				vw var1 = this.ri_fld;
				this.ri_fld = this.ri_fld.getNext();
				return var1;
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	public rl11(na var1) {
		this.pm_fld = var1;
		this.ri_fld = this.pm_fld.ak_fld.getNext();
	}
}
