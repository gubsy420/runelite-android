import java.util.Iterator;
import java.util.NoSuchElementException;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("rl14")
class rl14 implements Iterator {
	// $VF: synthetic field
	@ObfuscatedName("xu")
	@ObfuscatedSignature(
		descriptor = "Lxz;"
	)
	public xz xu_fld;
	@ObfuscatedName("yi")
	@ObfuscatedSignature(
		descriptor = "Lvw;"
	)
	public vw yi_fld;
	@ObfuscatedName("ry")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ry_fld;

	@ObfuscatedName("hasNext")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	public boolean hasNext() {
		if (this.ry_fld > 0 && this.xu_fld.ag_fld[this.ry_fld - 1] != this.yi_fld) {
			return true;
		} else {
			for (int var1 = this.ry_fld; var1 < this.xu_fld.ak_fld; var1++) {
				vw var2 = this.xu_fld.ag_fld[var1];
				vw var3 = var2.getNext();
				if (var2 != var3) {
					return true;
				}
			}

			return false;
		}
	}

	@ObfuscatedName("xn")
	@ObfuscatedSignature(
		descriptor = "()Lvw;"
	)
	public vw next() {
		try {
			if (this.ry_fld > 0 && this.xu_fld.ag_fld[this.ry_fld - 1] != this.yi_fld) {
				vw var5 = this.yi_fld;
				this.yi_fld = var5.getNext();
				return var5;
			} else {
				while (this.ry_fld < this.xu_fld.ak_fld) {
					vw var1 = this.xu_fld.ag_fld[this.ry_fld++];
					vw var2 = var1.getNext();
					if (var1 != var2) {
						this.yi_fld = var2.getNext();
						return var2;
					}
				}

				throw new NoSuchElementException();
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	public rl14(xz var1) {
		this.xu_fld = var1;
	}
}
