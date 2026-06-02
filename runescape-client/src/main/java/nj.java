import java.util.Iterator;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("nj")
public class nj implements Iterable {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lvc;"
	)
	vc ag_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lvc;"
	)
	public vc ak_fld = new vc();

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lvc;Lvc;)V"
	)
	public static void ak(vc var0, vc var1) {
		if (var0.ft_fld != null) {
			var0.mq_void();
		}

		var0.ft_fld = var1;
		var0.fn_fld = var1.fn_fld;
		var0.ft_fld.fn_fld = var0;
		var0.fn_fld.ft_fld = var0;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ar() {
		while (this.ak_fld.fn_fld != this.ak_fld) {
			this.ak_fld.fn_fld.mq_void();
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()Lvc;"
	)
	public vc an() {
		vc var1 = this.ak_fld.fn_fld;
		if (var1 == this.ak_fld) {
			return null;
		} else {
			var1.mq_void();
			return var1;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()Lvc;"
	)
	public vc av() {
		vc var1 = this.ak_fld.fn_fld;
		if (var1 == this.ak_fld) {
			return null;
		} else {
			var1.mq_void();
			return var1;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lvc;)Lvc;"
	)
	vc ah(vc var1) {
		vc var2;
		if (var1 == null) {
			var2 = this.ak_fld.fn_fld;
		} else {
			var2 = var1;
		}

		if (var2 == this.ak_fld) {
			this.ag_fld = null;
			return null;
		} else {
			this.ag_fld = var2.fn_fld;
			return var2;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "()Lvc;"
	)
	public vc aw() {
		vc var1 = this.ag_fld;
		if (var1 == this.ak_fld) {
			this.ag_fld = null;
			return null;
		} else {
			this.ag_fld = var1.fn_fld;
			return var1;
		}
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "()Ljava/util/Iterator;"
	)
	public Iterator cc() {
		return new nk(this);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lvc;Lvc;)V"
	)
	public static void ay(vc var0, vc var1) {
		if (var0.ft_fld != null) {
			var0.mq_void();
		}

		var0.ft_fld = var1;
		var0.fn_fld = var1.fn_fld;
		var0.ft_fld.fn_fld = var0;
		var0.fn_fld.ft_fld = var0;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ag() {
		while (this.ak_fld.fn_fld != this.ak_fld) {
			this.ak_fld.fn_fld.mq_void();
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lvc;Lvc;)V"
	)
	public static void as(vc var0, vc var1) {
		if (var0.ft_fld != null) {
			var0.mq_void();
		}

		var0.ft_fld = var1;
		var0.fn_fld = var1.fn_fld;
		var0.ft_fld.fn_fld = var0;
		var0.fn_fld.ft_fld = var0;
	}

	@ObfuscatedName("ji")
	@ObfuscatedSignature(
		descriptor = "(Lnj;Lvc;)Lvc;"
	)
	public static vc ji(nj var0, vc var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			vc var2;
			if (var1 == null) {
				var2 = var0.ak_fld.fn_fld;
			} else {
				var2 = var1;
			}

			if (var2 == var0.ak_fld) {
				var0.ag_fld = null;
				return null;
			} else {
				var0.ag_fld = var2.fn_fld;
				return var2;
			}
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "()Lvc;"
	)
	public vc ax() {
		vc var1 = this.ak_fld.fn_fld;
		if (var1 == this.ak_fld) {
			return null;
		} else {
			var1.mq_void();
			return var1;
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "()Lvc;"
	)
	public vc aq() {
		return this.ah(null);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lvc;)V"
	)
	public void al(vc var1) {
		if (var1.ft_fld != null) {
			var1.mq_void();
		}

		var1.ft_fld = this.ak_fld.ft_fld;
		var1.fn_fld = this.ak_fld;
		var1.ft_fld.fn_fld = var1;
		var1.fn_fld.ft_fld = var1;
	}

	@ObfuscatedName("gr")
	@ObfuscatedSignature(
		descriptor = "(Lnj;)Ljava/util/Iterator;"
	)
	public static Iterator gr(nj var0) {
		if (var0 == null) {
			var0.getClass();
		}

		return new nk(var0);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "()Lvc;"
	)
	public vc ai() {
		return this.ah(null);
	}

	@ObfuscatedName("iterator")
	@ObfuscatedSignature(
		descriptor = "()Ljava/util/Iterator;"
	)
	@Override
	public Iterator iterator() {
		return new nk(this);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "()Lvc;"
	)
	public vc am() {
		return this.ah(null);
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "()Lvc;"
	)
	public vc bm() {
		vc var1 = this.ag_fld;
		if (var1 == this.ak_fld) {
			this.ag_fld = null;
			return null;
		} else {
			this.ag_fld = var1.fn_fld;
			return var1;
		}
	}

	@ObfuscatedName("vq")
	@ObfuscatedSignature(
		descriptor = "(Lnj;)Lvc;"
	)
	public static vc vq(nj var0) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			vc var1 = var0.ak_fld.fn_fld;
			if (var1 == var0.ak_fld) {
				return null;
			} else {
				var1.mq_void();
				return var1;
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lvc;)Lvc;"
	)
	vc ao(vc var1) {
		vc var2;
		if (var1 == null) {
			var2 = this.ak_fld.fn_fld;
		} else {
			var2 = var1;
		}

		if (var2 == this.ak_fld) {
			this.ag_fld = null;
			return null;
		} else {
			this.ag_fld = var2.fn_fld;
			return var2;
		}
	}

	@ObfuscatedName("fh")
	@ObfuscatedSignature(
		descriptor = "(Lvc;)V"
	)
	public void fh(vc var1) {
		this.az(var1);
	}

	public nj() {
		this.ak_fld.fn_fld = this.ak_fld;
		this.ak_fld.ft_fld = this.ak_fld;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lvc;)Lvc;"
	)
	vc ap(vc var1) {
		vc var2;
		if (var1 == null) {
			var2 = this.ak_fld.fn_fld;
		} else {
			var2 = var1;
		}

		if (var2 == this.ak_fld) {
			this.ag_fld = null;
			return null;
		} else {
			this.ag_fld = var2.fn_fld;
			return var2;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lvc;)Lvc;"
	)
	vc at(vc var1) {
		vc var2;
		if (var1 == null) {
			var2 = this.ak_fld.fn_fld;
		} else {
			var2 = var1;
		}

		if (var2 == this.ak_fld) {
			this.ag_fld = null;
			return null;
		} else {
			this.ag_fld = var2.fn_fld;
			return var2;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "()Lvc;"
	)
	public vc ac() {
		vc var1 = this.ag_fld;
		if (var1 == this.ak_fld) {
			this.ag_fld = null;
			return null;
		} else {
			this.ag_fld = var1.fn_fld;
			return var1;
		}
	}

	@ObfuscatedName("rd")
	@ObfuscatedSignature(
		descriptor = "(Lnj;Lvc;)V"
	)
	public static void rd(nj var0, vc var1) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var1.ft_fld != null) {
			var1.mq_void();
		}

		var1.ft_fld = var0.ak_fld.ft_fld;
		var1.fn_fld = var0.ak_fld;
		var1.ft_fld.fn_fld = var1;
		var1.fn_fld.ft_fld = var1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lvc;)V"
	)
	public void az(vc var1) {
		if (var1.ft_fld != null) {
			var1.mq_void();
		}

		var1.ft_fld = this.ak_fld.ft_fld;
		var1.fn_fld = this.ak_fld;
		var1.ft_fld.fn_fld = var1;
		var1.fn_fld.ft_fld = var1;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()Lvc;"
	)
	public vc ae() {
		return this.at(null);
	}
}
