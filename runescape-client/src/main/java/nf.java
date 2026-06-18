import java.util.Iterator;
import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("nf")
public class nf implements Iterator {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lno;"
	)
	no ak_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lvw;"
	)
	vw ag_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lvw;"
	)
	vw az_fld = null;

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void an() {
		this.az_fld.gy();
		this.az_fld = null;
	}

	@ObfuscatedName("next")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/Object;"
	)
	@Export("next")
	@Override
	public Object next() {
		vw var1 = this.ag_fld;
		if (var1 == this.ak_fld.ak_fld) {
			var1 = null;
			this.ag_fld = null;
		} else {
			this.ag_fld = var1.hw_fld;
		}

		this.az_fld = var1;
		return var1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void aw() {
		this.ag_fld = this.ak_fld != null ? this.ak_fld.ak_fld.hw_fld : null;
		this.az_fld = null;
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(Lnf;)V"
	)
	public static void bk(nf var0) {
		if (var0.az_fld == null) {
			throw new IllegalStateException();
		} else {
			var0.az_fld.gy();
			var0.az_fld = null;
		}
	}

	@ObfuscatedName("remove")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Export("remove")
	@Override
	public void remove() {
		if (this.az_fld == null) {
			throw new IllegalStateException();
		} else {
			this.az_fld.gy();
			this.az_fld = null;
		}
	}

	@ObfuscatedName("pw")
	@ObfuscatedSignature(
		descriptor = "(Lnf;)Ljava/lang/Object;"
	)
	public static Object pw(nf var0) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			vw var1 = var0.ag_fld;
			if (var1 == var0.ak_fld.ak_fld) {
				var1 = null;
				var0.ag_fld = null;
			} else {
				var0.ag_fld = var1.hw_fld;
			}

			var0.az_fld = var1;
			return var1;
		}
	}

	@ObfuscatedName("hasNext")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Export("hasNext")
	@Override
	public boolean hasNext() {
		return this.ag_fld != this.ak_fld.ak_fld && this.ag_fld != null;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lno;)V"
	)
	void av(no var1) {
		this.ak_fld = var1;
		this.aw();
	}

	nf(no var1) {
		this.ak(var1);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lno;)V"
	)
	void ae(no var1) {
		this.ak_fld = var1;
		this.aw();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lno;)V"
	)
	void ah(no var1) {
		this.ak_fld = var1;
		this.aw();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ag() {
		this.ag_fld = this.ak_fld != null ? this.ak_fld.ak_fld.hw_fld : null;
		this.az_fld = null;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/Object;"
	)
	public Object as() {
		vw var1 = this.ag_fld;
		if (var1 == this.ak_fld.ak_fld) {
			var1 = null;
			this.ag_fld = null;
		} else {
			this.ag_fld = var1.hw_fld;
		}

		this.az_fld = var1;
		return var1;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean ar() {
		return this.ag_fld != this.ak_fld.ak_fld && this.ag_fld != null;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void af() {
		if (this.az_fld == null) {
			throw new IllegalStateException();
		} else {
			this.az_fld.gy();
			this.az_fld = null;
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ax() {
		this.az_fld.gy();
		this.az_fld = null;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lno;)V"
	)
	void ak(no var1) {
		this.ak_fld = var1;
		this.aw();
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(Lnf;)V"
	)
	public static void bu(nf var0) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.az_fld.gy();
			var0.az_fld = null;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/Object;"
	)
	public Object ay() {
		vw var1 = this.ag_fld;
		if (var1 == this.ak_fld.ak_fld) {
			var1 = null;
			this.az_fld = null;
		} else {
			this.ag_fld = var1.hg_fld;
		}

		this.ag_fld = var1;
		return var1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void al() {
		this.ag_fld.gx();
		this.az_fld = null;
	}
}
