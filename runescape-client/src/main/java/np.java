import java.util.Iterator;
import net.runelite.api.Deque;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("np")
@Implements({"Deque"})
public class np implements Deque {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Luq;"
	)
	uq ag_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Luq;"
	)
	uq ak_fld = new uq();

	@ObfuscatedName("iterator")
	@ObfuscatedSignature(
		descriptor = "()Ljava/util/Iterator;"
	)
	@Override
	public Iterator iterator() {
		return new rl15(this);
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(Lai;)Z"
	)
	public static boolean ct(ai var0) {
		return null == var0.ak_fld;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "()Luq;"
	)
	public uq ar() {
		uq var1 = this.ag_fld;
		if (var1 == this.ak_fld) {
			this.ag_fld = null;
			return null;
		} else {
			this.ag_fld = var1.av_fld;
			return var1;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Luq;)V"
	)
	public void ah(uq var1) {
		if (var1.ae_fld != null) {
			var1.ak();
		}

		var1.ae_fld = this.ak_fld.ae_fld;
		var1.av_fld = this.ak_fld;
		var1.ae_fld.av_fld = var1;
		var1.av_fld.ae_fld = var1;
	}

	// $VF: synthetic method
	// $VF: bridge method
	@ObfuscatedName("addLast")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)V"
	)
	@Override
	public void addLast(Object var1) {
		this.vm((rd)var1);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()Luq;"
	)
	public uq ag() {
		uq var1 = this.ak_fld.av_fld;
		if (var1 == this.ak_fld) {
			this.ag_fld = null;
			return null;
		} else {
			this.ag_fld = var1.av_fld;
			return var1;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Luq;)V"
	)
	public void av(uq var1) {
		if (var1.ae_fld != null) {
			var1.ak();
		}

		var1.ae_fld = this.ak_fld.ae_fld;
		var1.av_fld = this.ak_fld;
		var1.ae_fld.av_fld = var1;
		var1.av_fld.ae_fld = var1;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Luq;)V"
	)
	public void ae(uq var1) {
		if (var1.ae_fld != null) {
			var1.ak();
		}

		var1.ae_fld = this.ak_fld.ae_fld;
		var1.av_fld = this.ak_fld;
		var1.ae_fld.av_fld = var1;
		var1.av_fld.ae_fld = var1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Luq;)V"
	)
	public void ak(uq var1) {
		if (var1.ae_fld != null) {
			var1.ak();
		}

		var1.ae_fld = this.ak_fld.ae_fld;
		var1.av_fld = this.ak_fld;
		var1.ae_fld.av_fld = var1;
		var1.av_fld.ae_fld = var1;
	}

	@ObfuscatedName("py")
	@ObfuscatedSignature(
		descriptor = "(Lnp;)Luq;"
	)
	public static uq py(np var0) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			uq var1 = var0.ag_fld;
			if (var1 == var0.ak_fld) {
				var0.ag_fld = null;
				return null;
			} else {
				var0.ag_fld = var1.av_fld;
				return var1;
			}
		}
	}

	@ObfuscatedName("clear")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Override
	public void clear() {
		Iterator var1 = this.iterator();

		while (var1.hasNext()) {
			var1.remove();
		}
	}

	public np() {
		this.ak_fld.av_fld = this.ak_fld;
		this.ak_fld.ae_fld = this.ak_fld;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Luq;)V"
	)
	public void aw(uq var1) {
		if (var1.ae_fld != null) {
			var1.ak();
		}

		var1.ae_fld = this.ak_fld.ae_fld;
		var1.av_fld = this.ak_fld;
		var1.ae_fld.av_fld = var1;
		var1.av_fld.ae_fld = var1;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()Luq;"
	)
	public uq as() {
		uq var1 = this.ak_fld.av_fld;
		if (var1 == this.ak_fld) {
			this.ag_fld = null;
			return null;
		} else {
			this.ag_fld = var1.av_fld;
			return var1;
		}
	}

	@ObfuscatedName("vm")
	@ObfuscatedSignature(
		descriptor = "(Lrd;)V"
	)
	public void vm(rd var1) {
		this.ak(var1);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()Luq;"
	)
	public uq ay() {
		uq var1 = this.ak_fld.av_fld;
		if (var1 == this.ak_fld) {
			this.ag_fld = null;
			return null;
		} else {
			this.ag_fld = var1.av_fld;
			return var1;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "()Luq;"
	)
	public uq af() {
		uq var1 = this.ag_fld;
		if (var1 == this.ak_fld) {
			this.ag_fld = null;
			return null;
		} else {
			this.ag_fld = var1.av_fld;
			return var1;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()Luq;"
	)
	public uq az() {
		uq var1 = this.ag_fld;
		if (var1 == this.ag_fld) {
			this.ak_fld = null;
			return null;
		} else {
			this.ak_fld = var1.ae_fld;
			return var1;
		}
	}
}
