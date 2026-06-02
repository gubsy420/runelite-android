import java.util.Iterator;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("xr")
public class xr implements Iterator {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lug;"
	)
	ug av_fld = null;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lug;"
	)
	ug ag_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lxf;"
	)
	xf ak_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int az_fld;

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ak() {
		this.ag_fld = this.ak_fld.az_fld[0].eg_fld;
		this.az_fld = 1;
		this.av_fld = null;
	}

	@ObfuscatedName("next")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/Object;"
	)
	@Override
	public Object next() {
		if (this.ag_fld != this.ak_fld.az_fld[this.az_fld - 1]) {
			ug var2 = this.ag_fld;
			this.ag_fld = var2.eg_fld;
			this.av_fld = var2;
			return var2;
		} else {
			while (this.az_fld < this.ak_fld.ag_fld) {
				ug var1 = this.ak_fld.az_fld[this.az_fld++].eg_fld;
				if (var1 != this.ak_fld.az_fld[this.az_fld - 1]) {
					this.ag_fld = var1.eg_fld;
					this.av_fld = var1;
					return var1;
				}
			}

			return null;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void az() {
		this.ag_fld = this.ak_fld.az_fld[0].eg_fld;
		this.az_fld = 1;
		this.av_fld = null;
	}

	@ObfuscatedName("remove")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Override
	public void remove() {
		if (this.av_fld == null) {
			throw new IllegalStateException();
		} else {
			this.av_fld.mb();
			this.av_fld = null;
		}
	}

	@ObfuscatedName("pq")
	@ObfuscatedSignature(
		descriptor = "()Lug;"
	)
	public ug pq() {
		return (ug)(ug)this.next();
	}

	@ObfuscatedName("sm")
	@ObfuscatedSignature(
		descriptor = "(Lxr;)V"
	)
	public static void sm(xr var0) {
		if (var0.av_fld == null) {
			throw new IllegalStateException();
		} else {
			var0.av_fld.mb();
			var0.av_fld = null;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void af() {
		if (this.av_fld == null) {
			throw new IllegalStateException();
		} else {
			this.av_fld.mb();
			this.av_fld = null;
		}
	}

	@ObfuscatedName("fw")
	@ObfuscatedSignature(
		descriptor = "(Lxr;)V"
	)
	public static void fw(xr var0) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.ag_fld = var0.ak_fld.az_fld[0].eg_fld;
			var0.az_fld = 1;
			var0.av_fld = null;
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ax() {
		if (this.av_fld == null) {
			throw new IllegalStateException();
		} else {
			this.av_fld.mb();
			this.av_fld = null;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean ar() {
		if (this.ag_fld != this.ak_fld.az_fld[this.az_fld - 1]) {
			return true;
		} else {
			while (this.az_fld < this.ak_fld.ag_fld) {
				if (this.ak_fld.az_fld[this.az_fld++].eg_fld != this.ak_fld.az_fld[this.az_fld - 1]) {
					this.ag_fld = this.ak_fld.az_fld[this.az_fld - 1].eg_fld;
					return true;
				}

				this.ag_fld = this.ak_fld.az_fld[this.az_fld - 1];
			}

			return false;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/Object;"
	)
	public Object as() {
		if (this.ag_fld != this.ak_fld.az_fld[this.az_fld - 1]) {
			ug var2 = this.ag_fld;
			this.ag_fld = var2.eg_fld;
			this.av_fld = var2;
			return var2;
		} else {
			while (this.az_fld < this.ak_fld.ag_fld) {
				ug var1 = this.ak_fld.az_fld[this.az_fld++].eg_fld;
				if (var1 != this.ak_fld.az_fld[this.az_fld - 1]) {
					this.ag_fld = var1.eg_fld;
					this.av_fld = var1;
					return var1;
				}
			}

			return null;
		}
	}

	@ObfuscatedName("hasNext")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	public boolean hasNext() {
		if (this.ag_fld != this.ak_fld.az_fld[this.az_fld - 1]) {
			return true;
		} else {
			while (this.az_fld < this.ak_fld.ag_fld) {
				if (this.ak_fld.az_fld[this.az_fld++].eg_fld != this.ak_fld.az_fld[this.az_fld - 1]) {
					this.ag_fld = this.ak_fld.az_fld[this.az_fld - 1].eg_fld;
					return true;
				}

				this.ag_fld = this.ak_fld.az_fld[this.az_fld - 1];
			}

			return false;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/Object;"
	)
	public Object ay() {
		if (this.ag_fld != this.ak_fld.az_fld[this.az_fld - 1]) {
			ug var2 = this.ag_fld;
			this.ag_fld = var2.eg_fld;
			this.av_fld = var2;
			return var2;
		} else {
			while (this.az_fld < this.ak_fld.ag_fld) {
				ug var1 = this.ak_fld.az_fld[this.az_fld++].eg_fld;
				if (var1 != this.ak_fld.az_fld[this.az_fld - 1]) {
					this.ag_fld = var1.eg_fld;
					this.av_fld = var1;
					return var1;
				}
			}

			return null;
		}
	}

	xr(xf var1) {
		this.ak_fld = var1;
		this.ak();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void an() {
		if (this.av_fld == null) {
			throw new IllegalStateException();
		} else {
			this.av_fld.mb();
			this.av_fld = null;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ag() {
		this.ag_fld = this.ak_fld.az_fld[0].eg_fld;
		this.az_fld = 1;
		this.av_fld = null;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void au() {
		if (this.av_fld == null) {
			throw new IllegalStateException();
		} else {
			this.av_fld.mb();
			this.av_fld = null;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ae() {
		this.ag_fld = this.ak_fld.az_fld[0].eg_fld;
		this.az_fld = 1;
		this.av_fld = null;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void av() {
		this.av_fld = this.ak_fld.az_fld[0].eg_fld;
		this.az_fld = 1;
		this.av_fld = null;
	}
}
