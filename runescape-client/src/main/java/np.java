import java.util.Iterator;
import net.runelite.api.Deque;
import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("np")
@Implements({"Deque"})
public class np implements Deque {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Luq;"
	)
	uq ak_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Luq;"
	)
	uq ag_fld = new uq();

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "()Luq;"
	)
	public uq ar() {
		uq var1 = this.ak_fld;
		if (var1 == this.ag_fld) {
			this.ak_fld = null;
			return null;
		} else {
			this.ak_fld = var1.ae_fld;
			return var1;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Luq;)V"
	)
	public void ah(uq var1) {
		if (var1.av_fld != null) {
			uq.xr(var1);
		}

		var1.av_fld = this.ag_fld.av_fld;
		var1.ae_fld = this.ag_fld;
		var1.av_fld.ae_fld = var1;
		var1.ae_fld.av_fld = var1;
	}

	@ObfuscatedName("iterator")
	@ObfuscatedSignature(
		descriptor = "()Ljava/util/Iterator;"
	)
	@Export("iterator")
	@Override
	public Iterator iterator() {
		return new rl15(this);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()Luq;"
	)
	public uq ag() {
		uq var1 = this.ag_fld.ae_fld;
		if (var1 == this.ag_fld) {
			this.ak_fld = null;
			return null;
		} else {
			this.ak_fld = var1.ae_fld;
			return var1;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()Luq;"
	)
	public uq az() {
		uq var1 = this.ak_fld;
		if (var1 == this.ag_fld) {
			this.ak_fld = null;
			return null;
		} else {
			this.ak_fld = var1.ae_fld;
			return var1;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Luq;)V"
	)
	public void av(uq var1) {
		if (var1.av_fld != null) {
			uq.xr(var1);
		}

		var1.av_fld = this.ag_fld.av_fld;
		var1.ae_fld = this.ag_fld;
		var1.av_fld.ae_fld = var1;
		var1.ae_fld.av_fld = var1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Luq;)V"
	)
	public void ak(uq var1) {
		if (var1.av_fld != null) {
			uq.xr(var1);
		}

		var1.av_fld = this.ag_fld.av_fld;
		var1.ae_fld = this.ag_fld;
		var1.av_fld.ae_fld = var1;
		var1.ae_fld.av_fld = var1;
	}

	public np() {
		this.ag_fld.ae_fld = this.ag_fld;
		this.ag_fld.av_fld = this.ag_fld;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Luq;)V"
	)
	public void aw(uq var1) {
		if (var1.av_fld != null) {
			uq.xr(var1);
		}

		var1.av_fld = this.ag_fld.av_fld;
		var1.ae_fld = this.ag_fld;
		var1.av_fld.ae_fld = var1;
		var1.ae_fld.av_fld = var1;
	}

	@ObfuscatedName("clear")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Export("clear")
	@Override
	public void clear() {
		Iterator var1 = this.iterator();

		while (var1.hasNext()) {
			var1.remove();
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()Luq;"
	)
	public uq as() {
		uq var1 = this.ag_fld.ae_fld;
		if (var1 == this.ag_fld) {
			this.ak_fld = null;
			return null;
		} else {
			this.ak_fld = var1.ae_fld;
			return var1;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()Luq;"
	)
	public uq ay() {
		uq var1 = this.ag_fld.ae_fld;
		if (var1 == this.ag_fld) {
			this.ak_fld = null;
			return null;
		} else {
			this.ak_fld = var1.ae_fld;
			return var1;
		}
	}

	// $VF: synthetic method
	// $VF: bridge method
	@ObfuscatedName("addLast")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)V"
	)
	@Export("addLast")
	@Override
	public void addLast(Object var1) {
		this.bj((rd)var1);
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(Lrd;)V"
	)
	public void bj(rd var1) {
		this.ak(var1);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "()Luq;"
	)
	public uq af() {
		uq var1 = this.ak_fld;
		if (var1 == this.ag_fld) {
			this.ak_fld = null;
			return null;
		} else {
			this.ak_fld = var1.ae_fld;
			return var1;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Luq;)V"
	)
	public void ae(uq var1) {
		if (var1.ae_fld != null) {
			uq.xr(var1);
		}

		var1.ae_fld = this.ak_fld.ae_fld;
		var1.ae_fld = this.ak_fld;
		var1.ae_fld.ae_fld = var1;
		var1.ae_fld.av_fld = var1;
	}
}
