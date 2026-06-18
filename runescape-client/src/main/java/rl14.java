import java.util.Iterator;
import java.util.NoSuchElementException;
import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("rl14")
class rl14 implements Iterator {
	// $VF: synthetic field
	@ObfuscatedName("ka")
	@ObfuscatedSignature(
		descriptor = "Lxz;"
	)
	public xz ka_fld;
	@ObfuscatedName("zq")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int zq_fld;
	@ObfuscatedName("lc")
	@ObfuscatedSignature(
		descriptor = "Lvw;"
	)
	public vw lc_fld;

	@ObfuscatedName("mf")
	@ObfuscatedSignature(
		descriptor = "()Lvw;"
	)
	public vw next() {
		try {
			if (this.zq_fld > 0 && this.ka_fld.ag_fld[this.zq_fld - 1] != this.lc_fld) {
				vw var5 = this.lc_fld;
				this.lc_fld = var5.getNext();
				return var5;
			} else {
				while (this.zq_fld < this.ka_fld.ak_fld) {
					vw var1 = this.ka_fld.ag_fld[this.zq_fld++];
					vw var2 = var1.getNext();
					if (var1 != var2) {
						this.lc_fld = var2.getNext();
						return var2;
					}
				}

				throw new NoSuchElementException();
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("hasNext")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Export("hasNext")
	@Override
	public boolean hasNext() {
		if (this.zq_fld > 0 && this.ka_fld.ag_fld[this.zq_fld - 1] != this.lc_fld) {
			return true;
		} else {
			for (int var1 = this.zq_fld; var1 < this.ka_fld.ak_fld; var1++) {
				vw var2 = this.ka_fld.ag_fld[var1];
				vw var3 = var2.getNext();
				if (var2 != var3) {
					return true;
				}
			}

			return false;
		}
	}

	public rl14(xz var1) {
		this.ka_fld = var1;
	}
}
