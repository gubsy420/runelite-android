import java.util.Iterator;
import net.runelite.api.annotations.Export;
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

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()Lvc;"
	)
	public vc ae() {
		return this.ah(null);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lvc;Lvc;)V"
	)
	public static void ak(vc var0, vc var1) {
		if (var0.ft_fld != null) {
			var0.vi();
		}

		var0.ft_fld = var1;
		var0.fn_vc = var1.fn_vc;
		var0.ft_fld.fn_vc = var0;
		var0.fn_vc.ft_fld = var0;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()Lvc;"
	)
	public vc an() {
		vc var1 = this.ak_fld.fn_vc;
		if (var1 == this.ak_fld) {
			return null;
		} else {
			var1.vi();
			return var1;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()Lvc;"
	)
	public vc av() {
		vc var1 = this.ak_fld.fn_vc;
		if (var1 == this.ak_fld) {
			return null;
		} else {
			var1.vi();
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
			var2 = this.ak_fld.fn_vc;
		} else {
			var2 = var1;
		}

		if (var2 == this.ak_fld) {
			this.ag_fld = null;
			return null;
		} else {
			this.ag_fld = var2.fn_vc;
			return var2;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvc;)Lvc;"
	)
	vc ab(vc var1) {
		vc var2;
		if (var1 == null) {
			var2 = this.ak_fld.fn_vc;
		} else {
			var2 = var1;
		}

		if (var2 == this.ak_fld) {
			this.ag_fld = null;
			return null;
		} else {
			this.ag_fld = var2.fn_vc;
			return var2;
		}
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "()Ljava/util/Iterator;"
	)
	public Iterator cd() {
		return new nk(this);
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
			var0.vi();
		}

		var0.ft_fld = var1;
		var0.fn_vc = var1.fn_vc;
		var0.ft_fld.fn_vc = var0;
		var0.fn_vc.ft_fld = var0;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "()Lvc;"
	)
	public vc ad() {
		return this.ah(null);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "()Lvc;"
	)
	public vc aa() {
		vc var1 = this.ak_fld.fn_vc;
		if (var1 == this.ak_fld) {
			return null;
		} else {
			var1.vi();
			return var1;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lvc;Lvc;)V"
	)
	public static void as(vc var0, vc var1) {
		if (var0.ft_fld != null) {
			var0.vi();
		}

		var0.ft_fld = var1;
		var0.fn_vc = var1.fn_vc;
		var0.ft_fld.fn_vc = var0;
		var0.fn_vc.ft_fld = var0;
	}

	@ObfuscatedName("fb")
	@ObfuscatedSignature(
		descriptor = "(Lnj;Lvc;)V"
	)
	public static void fb(nj var0, vc var1) {
		if (var0 == null) {
			var0.getClass();
		} else {
			if (var1.ft_fld != null) {
				var1.vi();
			}

			var1.ft_fld = var0.ak_fld.ft_fld;
			var1.fn_vc = var0.ak_fld;
			var1.ft_fld.fn_vc = var1;
			var1.fn_vc.ft_fld = var1;
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "()Lvc;"
	)
	public vc ax() {
		vc var1 = this.ak_fld.fn_vc;
		if (var1 == this.ak_fld) {
			return null;
		} else {
			var1.vi();
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

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lvc;)V"
	)
	public void az(vc var1) {
		if (var1.ft_fld != null) {
			var1.vi();
		}

		var1.ft_fld = this.ak_fld.ft_fld;
		var1.fn_vc = this.ak_fld;
		var1.ft_fld.fn_vc = var1;
		var1.fn_vc.ft_fld = var1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lvc;)V"
	)
	public void al(vc var1) {
		this.jr(var1);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "()Lvc;"
	)
	public vc ai() {
		return this.ah(null);
	}

	@ObfuscatedName("rf")
	@ObfuscatedSignature(
		descriptor = "(Lnj;)Lvc;"
	)
	public static vc rf(nj var0) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			vc var1 = var0.ag_fld;
			if (var1 == var0.ak_fld) {
				var0.ag_fld = null;
				return null;
			} else {
				var0.ag_fld = var1.fn_vc;
				return var1;
			}
		}
	}

	@ObfuscatedName("iterator")
	@ObfuscatedSignature(
		descriptor = "()Ljava/util/Iterator;"
	)
	@Export("iterator")
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
			this.ag_fld = var1.fn_vc;
			return var1;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lvc;)Lvc;"
	)
	vc ao(vc var1) {
		vc var2;
		if (var1 == null) {
			var2 = this.ak_fld.fn_vc;
		} else {
			var2 = var1;
		}

		if (var2 == this.ak_fld) {
			this.ag_fld = null;
			return null;
		} else {
			this.ag_fld = var2.fn_vc;
			return var2;
		}
	}

	public nj() {
		this.ak_fld.fn_vc = this.ak_fld;
		this.ak_fld.ft_fld = this.ak_fld;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lvc;)Lvc;"
	)
	vc ap(vc var1) {
		vc var2;
		if (var1 == null) {
			var2 = this.ak_fld.fn_vc;
		} else {
			var2 = var1;
		}

		if (var2 == this.ak_fld) {
			this.ag_fld = null;
			return null;
		} else {
			this.ag_fld = var2.fn_vc;
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
			var2 = this.ak_fld.fn_vc;
		} else {
			var2 = var1;
		}

		if (var2 == this.ak_fld) {
			this.ag_fld = null;
			return null;
		} else {
			this.ag_fld = var2.fn_vc;
			return var2;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "()Lvc;"
	)
	public vc aj() {
		vc var1 = this.ag_fld;
		if (var1 == this.ak_fld) {
			this.ag_fld = null;
			return null;
		} else {
			this.ag_fld = var1.fn_vc;
			return var1;
		}
	}

	@ObfuscatedName("jr")
	@ObfuscatedSignature(
		descriptor = "(Lvc;)V"
	)
	public void jr(vc var1) {
		if (var1.ft_fld != null) {
			var1.vi();
		}

		var1.ft_fld = this.ak_fld.ft_fld;
		var1.fn_vc = this.ak_fld;
		var1.ft_fld.fn_vc = var1;
		var1.fn_vc.ft_fld = var1;
	}

	@ObfuscatedName("kq")
	@ObfuscatedSignature(
		descriptor = "(Lsb;ZZZ)Z"
	)
	public static boolean kq(sb var0, boolean var1, boolean var2, boolean var3) {
		return var0.az(var0.ar_fld, var1, var2, var3);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ag() {
		while (this.ak_fld.fn_vc != this.ak_fld) {
			this.ak_fld.ft_fld.mq_void();
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
			this.ag_fld = var1.fn_vc;
			return var1;
		}
	}
}
