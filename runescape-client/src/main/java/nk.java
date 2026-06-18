import java.util.Iterator;
import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("nk")
public class nk implements Iterator {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lvc;"
	)
	vc az_fld = null;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lnj;"
	)
	nj ak_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lvc;"
	)
	vc ag_fld;

	@ObfuscatedName("remove")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Export("remove")
	@Override
	public void remove() {
		this.az_fld.vi();
		this.az_fld = null;
	}

	@ObfuscatedName("next")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/Object;"
	)
	@Export("next")
	@Override
	public Object next() {
		vc var1 = this.ag_fld;
		if (var1 == this.ak_fld.ak_fld) {
			var1 = null;
			this.ag_fld = null;
		} else {
			this.ag_fld = var1.fn_vc;
		}

		this.az_fld = var1;
		return var1;
	}

	nk(nj var1) {
		this.ak_fld = var1;
		this.ag_fld = this.ak_fld.ak_fld.fn_vc;
		this.az_fld = null;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean ar() {
		return this.ag_fld != this.ak_fld.ak_fld;
	}

	@ObfuscatedName("en")
	@ObfuscatedSignature(
		descriptor = "(Lnk;)V"
	)
	public static void en(nk var0) {
		if (var0.az_fld == null) {
			throw new IllegalStateException();
		} else {
			var0.az_fld.vi();
			var0.az_fld = null;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/Object;"
	)
	public Object ay() {
		vc var1 = this.ag_fld;
		if (var1 == this.ak_fld.ak_fld) {
			var1 = null;
			this.ag_fld = null;
		} else {
			this.ag_fld = var1.fn_vc;
		}

		this.az_fld = var1;
		return var1;
	}

	@ObfuscatedName("hasNext")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Export("hasNext")
	@Override
	public boolean hasNext() {
		return this.ag_fld != this.ak_fld.ak_fld;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void al() {
		if (this.az_fld == null) {
			throw new IllegalStateException();
		} else {
			this.az_fld.vi();
			this.az_fld = null;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void af() {
		if (this.az_fld == null) {
			throw new IllegalStateException();
		} else {
			this.az_fld.vi();
			this.az_fld = null;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/Object;"
	)
	public Object as() {
		vc var1 = this.ag_fld;
		if (var1 == this.ak_fld.ak_fld) {
			var1 = null;
			this.ag_fld = null;
		} else {
			this.ag_fld = var1.fn_vc;
		}

		this.az_fld = var1;
		return var1;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void au() {
		if (this.az_fld == null) {
			throw new IllegalStateException();
		} else {
			this.az_fld.vi();
			this.az_fld = null;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void an() {
		if (this.az_fld == null) {
			throw new IllegalStateException();
		} else {
			this.az_fld.vi();
			this.az_fld = null;
		}
	}
}
