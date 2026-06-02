import java.util.Iterator;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("nk")
public class nk implements Iterator {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lvc;"
	)
	vc ag_fld = null;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lnj;"
	)
	nj ak_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lvc;"
	)
	vc az_fld;

	@ObfuscatedName("remove")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Override
	public void remove() {
		this.ag_fld.mq_void();
		this.ag_fld = null;
	}

	@ObfuscatedName("gc")
	@ObfuscatedSignature(
		descriptor = "(Lnk;)V"
	)
	public static void gc(nk var0) {
		if (var0.ag_fld == null) {
			throw new IllegalStateException();
		} else {
			var0.ag_fld.mq_void();
			var0.ag_fld = null;
		}
	}

	@ObfuscatedName("next")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/Object;"
	)
	@Override
	public Object next() {
		vc var1 = this.az_fld;
		if (var1 == this.ak_fld.ak_fld) {
			var1 = null;
			this.az_fld = null;
		} else {
			this.az_fld = var1.fn_fld;
		}

		this.ag_fld = var1;
		return var1;
	}

	nk(nj var1) {
		this.ak_fld = var1;
		this.az_fld = this.ak_fld.ak_fld.fn_fld;
		this.ag_fld = null;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean ar() {
		return this.az_fld != this.ak_fld.ak_fld;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/Object;"
	)
	public Object ay() {
		vc var1 = this.az_fld;
		if (var1 == this.ak_fld.ak_fld) {
			var1 = null;
			this.az_fld = null;
		} else {
			this.az_fld = var1.fn_fld;
		}

		this.ag_fld = var1;
		return var1;
	}

	@ObfuscatedName("po")
	@ObfuscatedSignature(
		descriptor = "(Lnk;)V"
	)
	public static void po(nk var0) {
		if (var0.ag_fld == null) {
			throw new IllegalStateException();
		} else {
			var0.ag_fld.mq_void();
			var0.ag_fld = null;
		}
	}

	@ObfuscatedName("hasNext")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	public boolean hasNext() {
		return this.az_fld != this.ak_fld.ak_fld;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void al() {
		if (this.ag_fld == null) {
			throw new IllegalStateException();
		} else {
			this.ag_fld.mq_void();
			this.ag_fld = null;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/Object;"
	)
	public Object as() {
		vc var1 = this.az_fld;
		if (var1 == this.ak_fld.ak_fld) {
			var1 = null;
			this.az_fld = null;
		} else {
			this.az_fld = var1.fn_fld;
		}

		this.ag_fld = var1;
		return var1;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ax() {
		if (this.ag_fld == null) {
			throw new IllegalStateException();
		} else {
			this.ag_fld.mq_void();
			this.ag_fld = null;
		}
	}

	@ObfuscatedName("ys")
	@ObfuscatedSignature(
		descriptor = "(Lnk;)V"
	)
	public static void ys(nk var0) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var0.ag_fld == null) {
			throw new IllegalStateException();
		} else {
			var0.ag_fld.mq_void();
			var0.ag_fld = null;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void au() {
		if (this.az_fld == null) {
			throw new IllegalStateException();
		} else {
			this.az_fld.mq_void();
			this.ag_fld = null;
		}
	}
}
