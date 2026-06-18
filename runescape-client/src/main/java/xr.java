import java.util.Iterator;
import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("xr")
public class xr implements Iterator {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lug;"
	)
	ug ag_fld = null;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lug;"
	)
	ug av_fld;
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

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void au() {
		if (this.ag_fld == null) {
			throw new IllegalStateException();
		} else {
			this.ag_fld.mb();
			this.ag_fld = null;
		}
	}

	@ObfuscatedName("next")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/Object;"
	)
	@Export("next")
	@Override
	public Object next() {
		if (this.av_fld != this.ak_fld.az_fld[this.az_fld - 1]) {
			ug var2 = this.av_fld;
			this.av_fld = var2.en_fld;
			this.ag_fld = var2;
			return var2;
		} else {
			while (this.az_fld < this.ak_fld.ag_fld) {
				ug var1 = this.ak_fld.az_fld[this.az_fld++].en_fld;
				if (var1 != this.ak_fld.az_fld[this.az_fld - 1]) {
					this.av_fld = var1.en_fld;
					this.ag_fld = var1;
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
		this.av_fld = this.ak_fld.az_fld[0].en_fld;
		this.az_fld = 1;
		this.ag_fld = null;
	}

	@ObfuscatedName("remove")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Export("remove")
	@Override
	public void remove() {
		if (this.ag_fld == null) {
			throw new IllegalStateException();
		} else {
			this.ag_fld.mb();
			this.ag_fld = null;
		}
	}

	@ObfuscatedName("yq")
	@ObfuscatedSignature(
		descriptor = "(Lxr;)V"
	)
	public static void yq(xr var0) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.av_fld = var0.ak_fld.az_fld[0].en_fld;
		var0.az_fld = 1;
		var0.ag_fld = null;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ax() {
		if (this.ag_fld == null) {
			throw new IllegalStateException();
		} else {
			this.ag_fld.mb();
			this.ag_fld = null;
		}
	}

	@ObfuscatedName("ls")
	@ObfuscatedSignature(
		descriptor = "(Lxr;)V"
	)
	public static void ls(xr var0) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.av_fld = var0.ak_fld.az_fld[0].en_fld;
		var0.az_fld = 1;
		var0.ag_fld = null;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void an() {
		if (this.ag_fld == null) {
			throw new IllegalStateException();
		} else {
			this.ag_fld.mb();
			this.ag_fld = null;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean ar() {
		if (this.av_fld != this.ak_fld.az_fld[this.az_fld - 1]) {
			return true;
		} else {
			while (this.az_fld < this.ak_fld.ag_fld) {
				if (this.ak_fld.az_fld[this.az_fld++].en_fld != this.ak_fld.az_fld[this.az_fld - 1]) {
					this.av_fld = this.ak_fld.az_fld[this.az_fld - 1].en_fld;
					return true;
				}

				this.av_fld = this.ak_fld.az_fld[this.az_fld - 1];
			}

			return false;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/Object;"
	)
	public Object ay() {
		if (this.av_fld != this.ak_fld.az_fld[this.az_fld - 1]) {
			ug var2 = this.av_fld;
			this.av_fld = var2.en_fld;
			this.ag_fld = var2;
			return var2;
		} else {
			while (this.az_fld < this.ak_fld.ag_fld) {
				ug var1 = this.ak_fld.az_fld[this.az_fld++].en_fld;
				if (var1 != this.ak_fld.az_fld[this.az_fld - 1]) {
					this.av_fld = var1.en_fld;
					this.ag_fld = var1;
					return var1;
				}
			}

			return null;
		}
	}

	@ObfuscatedName("kv")
	@ObfuscatedSignature(
		descriptor = "()Lug;"
	)
	public ug kv() {
		return (ug)(ug)this.next();
	}

	@ObfuscatedName("yh")
	@ObfuscatedSignature(
		descriptor = "(Lxr;)V"
	)
	public static void yh(xr var0) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.av_fld = var0.ak_fld.az_fld[0].en_fld;
		var0.az_fld = 1;
		var0.ag_fld = null;
	}

	@ObfuscatedName("hasNext")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Export("hasNext")
	@Override
	public boolean hasNext() {
		if (this.av_fld != this.ak_fld.az_fld[this.az_fld - 1]) {
			return true;
		} else {
			while (this.az_fld < this.ak_fld.ag_fld) {
				if (this.ak_fld.az_fld[this.az_fld++].en_fld != this.ak_fld.az_fld[this.az_fld - 1]) {
					this.av_fld = this.ak_fld.az_fld[this.az_fld - 1].en_fld;
					return true;
				}

				this.av_fld = this.ak_fld.az_fld[this.az_fld - 1];
			}

			return false;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/Object;"
	)
	public Object as() {
		if (this.av_fld != this.ak_fld.az_fld[this.az_fld - 1]) {
			ug var2 = this.av_fld;
			this.av_fld = var2.en_fld;
			this.ag_fld = var2;
			return var2;
		} else {
			while (this.az_fld < this.ak_fld.ag_fld) {
				ug var1 = this.ak_fld.az_fld[this.az_fld++].en_fld;
				if (var1 != this.ak_fld.az_fld[this.az_fld - 1]) {
					this.av_fld = var1.en_fld;
					this.ag_fld = var1;
					return var1;
				}
			}

			return null;
		}
	}

	xr(xf var1) {
		this.ak_fld = var1;
		ls(this);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void al() {
		if (this.ag_fld == null) {
			throw new IllegalStateException();
		} else {
			this.ag_fld.mb();
			this.ag_fld = null;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void af() {
		if (this.ag_fld == null) {
			throw new IllegalStateException();
		} else {
			this.ag_fld.mb();
			this.ag_fld = null;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ak() {
		this.av_fld = this.ak_fld.az_fld[0].eg_fld;
		this.az_fld = 1;
		this.ag_fld = null;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ag() {
		this.ag_fld = this.ak_fld.az_fld[0].eg_fld;
		this.az_fld = 1;
		this.ag_fld = null;
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
