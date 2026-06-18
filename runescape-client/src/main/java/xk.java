import java.util.Iterator;
import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("xk")
public class xk implements Iterator {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int az_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lvw;"
	)
	vw ag_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lxv;"
	)
	xv ak_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lvw;"
	)
	vw av_fld = null;

	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "(Lxk;)Lvw;"
	)
	public static vw dz(xk var0) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ag();
		return (vw)(vw)var0.next();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxv;)V"
	)
	public void av(xv var1) {
		this.ak_fld = var1;
		this.ag();
	}

	public xk() {
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lxv;)V"
	)
	public void ak(xv var1) {
		this.ak_fld = var1;
		this.ag();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ag() {
		this.ag_fld = this.ak_fld.ag_fld[0].hw_fld;
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
			this.av_fld.gy();
			this.av_fld = null;
		}
	}

	@ObfuscatedName("next")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/Object;"
	)
	@Export("next")
	@Override
	public Object next() {
		if (this.ag_fld != this.ak_fld.ag_fld[this.az_fld - 1]) {
			vw var2 = this.ag_fld;
			this.ag_fld = var2.hw_fld;
			this.av_fld = var2;
			return var2;
		} else {
			while (this.az_fld < this.ak_fld.ak_fld) {
				vw var1 = this.ak_fld.ag_fld[this.az_fld++].hw_fld;
				if (var1 != this.ak_fld.ag_fld[this.az_fld - 1]) {
					this.ag_fld = var1.hw_fld;
					this.av_fld = var1;
					return var1;
				}
			}

			return null;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean ar() {
		if (this.ag_fld != this.ak_fld.ag_fld[this.az_fld - 1]) {
			return true;
		} else {
			while (this.az_fld < this.ak_fld.ak_fld) {
				if (this.ak_fld.ag_fld[this.az_fld++].hw_fld != this.ak_fld.ag_fld[this.az_fld - 1]) {
					this.ag_fld = this.ak_fld.ag_fld[this.az_fld - 1].hw_fld;
					return true;
				}

				this.ag_fld = this.ak_fld.ag_fld[this.az_fld - 1];
			}

			return false;
		}
	}

	public xk(xv var1) {
		this.ak_fld = var1;
		this.ag();
	}

	@ObfuscatedName("qi")
	@ObfuscatedSignature(
		descriptor = "(Lxk;)V"
	)
	public static void qi(xk var0) {
		if (var0.av_fld == null) {
			throw new IllegalStateException();
		} else {
			var0.av_fld.gy();
			var0.av_fld = null;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/Object;"
	)
	public Object ay() {
		if (this.ag_fld != this.ak_fld.ag_fld[this.az_fld - 1]) {
			vw var2 = this.ag_fld;
			this.ag_fld = var2.hw_fld;
			this.av_fld = var2;
			return var2;
		} else {
			while (this.az_fld < this.ak_fld.ak_fld) {
				vw var1 = this.ak_fld.ag_fld[this.az_fld++].hw_fld;
				if (var1 != this.ak_fld.ag_fld[this.az_fld - 1]) {
					this.ag_fld = var1.hw_fld;
					this.av_fld = var1;
					return var1;
				}
			}

			return null;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/Object;"
	)
	public Object as() {
		if (this.ag_fld != this.ak_fld.ag_fld[this.az_fld - 1]) {
			vw var2 = this.ag_fld;
			this.ag_fld = var2.hw_fld;
			this.av_fld = var2;
			return var2;
		} else {
			while (this.az_fld < this.ak_fld.ak_fld) {
				vw var1 = this.ak_fld.ag_fld[this.az_fld++].hw_fld;
				if (var1 != this.ak_fld.ag_fld[this.az_fld - 1]) {
					this.ag_fld = var1.hw_fld;
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
	@Export("hasNext")
	@Override
	public boolean hasNext() {
		if (this.ag_fld != this.ak_fld.ag_fld[this.az_fld - 1]) {
			return true;
		} else {
			while (this.az_fld < this.ak_fld.ak_fld) {
				if (this.ak_fld.ag_fld[this.az_fld++].hw_fld != this.ak_fld.ag_fld[this.az_fld - 1]) {
					this.ag_fld = this.ak_fld.ag_fld[this.az_fld - 1].hw_fld;
					return true;
				}

				this.ag_fld = this.ak_fld.ag_fld[this.az_fld - 1];
			}

			return false;
		}
	}

	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		descriptor = "(Lxk;)V"
	)
	public static void ke(xk var0) {
		var0.ag_fld = var0.ak_fld.ag_fld[0].hw_fld;
		var0.az_fld = 1;
		var0.av_fld = null;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void al() {
		if (this.av_fld == null) {
			throw new IllegalStateException();
		} else {
			this.av_fld.gy();
			this.av_fld = null;
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "()Lvw;"
	)
	public vw ai() {
		this.ag();
		return (vw)(vw)this.next();
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()Lvw;"
	)
	public vw az() {
		this.ag();
		return (vw)(vw)this.next();
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void af() {
		if (this.av_fld == null) {
			throw new IllegalStateException();
		} else {
			this.av_fld.gy();
			this.av_fld = null;
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
			this.av_fld.gy();
			this.av_fld = null;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lxv;)V"
	)
	public void ae(xv var1) {
		this.ak_fld = var1;
		this.ag();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ah() {
		this.ag_fld = this.ak_fld.ag_fld[0].hw_fld;
		this.az_fld = 1;
		this.av_fld = null;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void aw() {
		this.ag_fld = this.ak_fld.ag_fld[0].hw_fld;
		this.az_fld = 1;
		this.av_fld = null;
	}

	@ObfuscatedName("remove")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Export("remove")
	@Override
	public void remove() {
		if (this.av_fld == null) {
			throw new IllegalStateException();
		} else {
			this.av_fld.gy();
			this.av_fld = null;
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "()Lvw;"
	)
	public vw aq() {
		this.aw();
		return (vw)(vw)this.as();
	}
}
