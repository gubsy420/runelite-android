import java.util.Iterator;
import java.util.NoSuchElementException;
import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("rl11")
class rl11 implements Iterator {
	// $VF: synthetic field
	@ObfuscatedName("vp")
	@ObfuscatedSignature(
		descriptor = "Lna;"
	)
	public na vp_fld;
	@ObfuscatedName("gw")
	@ObfuscatedSignature(
		descriptor = "Lvw;"
	)
	public vw gw_fld;

	@ObfuscatedName("remove")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Export("remove")
	@Override
	public void remove() {
		vw var1 = this.gw_fld.getPrevious();
		var1.pz_void();
	}

	@ObfuscatedName("sc")
	@ObfuscatedSignature(
		descriptor = "()Lvw;"
	)
	public vw next() {
		try {
			if (this.gw_fld == this.vp_fld.ak_fld) {
				throw new NoSuchElementException();
			} else {
				vw var1 = this.gw_fld;
				this.gw_fld = this.gw_fld.getNext();
				return var1;
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
		return this.gw_fld != this.vp_fld.ak_fld;
	}

	public rl11(na var1) {
		this.vp_fld = var1;
		this.gw_fld = this.vp_fld.ak_fld.getNext();
	}
}
