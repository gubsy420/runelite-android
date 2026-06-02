import java.util.Iterator;
import net.runelite.api.Deque;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("na")
@Implements({"Deque"})
public class na implements Deque {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lvw;"
	)
	public vw ak_fld = new vw();
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lvw;"
	)
	vw ag_fld;

	@ObfuscatedName("iv")
	@ObfuscatedSignature(
		descriptor = "(Lna;Lvw;)V"
	)
	public static void iv(na var0, vw var1) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var1.hw_fld != null) {
			var1.gy_void();
		}

		var1.hw_fld = var0.ak_fld.hw_fld;
		var1.hg_vw = var0.ak_fld;
		var1.hw_fld.hg_vw = var1;
		var1.hg_vw.hw_fld = var1;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "()Lvw;"
	)
	public vw bz() {
		vw var1 = this.ak_fld.hg_vw;
		if (var1 == this.ak_fld) {
			this.ag_fld = null;
			return null;
		} else {
			this.ag_fld = var1.hg_vw;
			return var1;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lvw;Lvw;)V"
	)
	public static void ak(vw var0, vw var1) {
		if (var0.hw_fld != null) {
			var0.gy_void();
		}

		var0.hw_fld = var1.hw_fld;
		var0.hg_vw = var1;
		var0.hw_fld.hg_vw = var0;
		var0.hg_vw.hw_fld = var0;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void an() {
		while (true) {
			vw var1 = this.ak_fld.hg_vw;
			if (var1 == this.ak_fld) {
				this.ag_fld = null;
				return;
			}

			var1.gy_void();
		}
	}

	@ObfuscatedName("gu")
	@ObfuscatedSignature(
		descriptor = "()Lvw;"
	)
	public vw gu() {
		return this.ae();
	}

	@ObfuscatedName("ia")
	@ObfuscatedSignature(
		descriptor = "(Lna;)Lvw;"
	)
	public static vw ia(na var0) {
		vw var1 = var0.ak_fld.hw_fld;
		if (var1 == var0.ak_fld) {
			return null;
		} else {
			var1.gy_void();
			return var1;
		}
	}

	@ObfuscatedName("ui")
	@ObfuscatedSignature(
		descriptor = "()Lvw;"
	)
	public vw ui() {
		return this.aw();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lvw;)V"
	)
	public void av(vw var1) {
		if (var1.hw_fld != null) {
			var1.gy_void();
		}

		var1.hw_fld = this.ak_fld.hw_fld;
		var1.hg_vw = this.ak_fld;
		var1.hw_fld.hg_vw = var1;
		var1.hg_vw.hw_fld = var1;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lvw;)V"
	)
	public void ai(vw var1) {
		if (var1.hw_fld != null) {
			var1.gy_void();
		}

		var1.hw_fld = this.ak_fld;
		var1.hg_vw = this.ak_fld.hg_vw;
		var1.hw_fld.hg_vw = var1;
		var1.hg_vw.hw_fld = var1;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()Lvw;"
	)
	public vw ae() {
		vw var1 = this.ak_fld.hg_vw;
		if (var1 == this.ak_fld) {
			return null;
		} else {
			var1.gy_void();
			return var1;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "()Lvw;"
	)
	public vw aw() {
		vw var1 = this.ak_fld.hg_vw;
		if (var1 == this.ak_fld) {
			this.ag_fld = null;
			return null;
		} else {
			this.ag_fld = var1.hg_vw;
			return var1;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()Lvw;"
	)
	public vw ay() {
		vw var1 = this.ak_fld.hw_fld;
		if (var1 == this.ak_fld) {
			this.ag_fld = null;
			return null;
		} else {
			this.ag_fld = var1.hw_fld;
			return var1;
		}
	}

	@ObfuscatedName("ft")
	@ObfuscatedSignature(
		descriptor = "(Lna;Lvw;)V"
	)
	public static void ft(na var0, vw var1) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var1.hw_fld != null) {
			var1.gy_void();
		}

		var1.hw_fld = var0.ak_fld.hw_fld;
		var1.hg_vw = var0.ak_fld;
		var1.hw_fld.hg_vw = var1;
		var1.hg_vw.hw_fld = var1;
	}

	// $VF: synthetic method
	// $VF: bridge method
	@ObfuscatedName("addLast")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)V"
	)
	@Override
	public void addLast(Object var1) {
		this.az((vw)var1);
	}

	@ObfuscatedName("fc")
	@ObfuscatedSignature(
		descriptor = "()Lvw;"
	)
	public vw fc() {
		return this.as();
	}

	@ObfuscatedName("xb")
	@ObfuscatedSignature(
		descriptor = "(Lna;)V"
	)
	public void xb(na var1) {
		vw var2 = this.ak_fld;
		vw var3 = this.ag_fld;
		this.ak_fld = var1.ak_fld;
		this.ag_fld = var1.ag_fld;
		var1.ak_fld = var2;
		var1.ag_fld = var3;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lvw;)V"
	)
	public void az(vw var1) {
		this.av(var1);
	}

	@ObfuscatedName("nz")
	@ObfuscatedSignature(
		descriptor = "(Lna;)Lvw;"
	)
	public static vw nz(na var0) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			vw var1 = var0.ak_fld.hw_fld;
			if (var1 == var0.ak_fld) {
				return null;
			} else {
				var1.gy_void();
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
		this.ag();
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "()Lvw;"
	)
	public vw by() {
		return this.ay();
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()Lvw;"
	)
	public vw as() {
		vw var1 = this.ag_fld;
		if (var1 == this.ak_fld) {
			this.ag_fld = null;
			return null;
		} else {
			this.ag_fld = var1.hg_vw;
			return var1;
		}
	}

	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		descriptor = "(Lna;)Lvw;"
	)
	public static vw eg(na var0) {
		vw var1 = var0.ak_fld.hw_fld;
		if (var1 == var0.ak_fld) {
			return null;
		} else {
			var1.gy_void();
			return var1;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "()Lvw;"
	)
	public vw ar() {
		vw var1 = this.ag_fld;
		if (var1 == this.ak_fld) {
			this.ag_fld = null;
			return null;
		} else {
			this.ag_fld = var1.hw_fld;
			return var1;
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lvw;)V"
	)
	public void am(vw var1) {
		if (var1.hw_fld != null) {
			var1.gy_void();
		}

		var1.hw_fld = this.ak_fld;
		var1.hg_vw = this.ak_fld.hg_vw;
		var1.hw_fld.hg_vw = var1;
		var1.hg_vw.hw_fld = var1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void al() {
		while (true) {
			vw var1 = this.ak_fld.hg_vw;
			if (var1 == this.ak_fld) {
				this.ag_fld = null;
				return;
			}

			var1.gy_void();
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void au() {
		while (true) {
			vw var1 = this.ak_fld.hg_vw;
			if (var1 == this.ak_fld) {
				this.ag_fld = null;
				return;
			}

			var1.gy_void();
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "()Lvw;"
	)
	public vw ap() {
		vw var1 = this.ak_fld.hg_vw;
		if (var1 == this.ak_fld) {
			return null;
		} else {
			var1.gy_void();
			return var1;
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void aa() {
		while (true) {
			vw var1 = this.ak_fld.hg_vw;
			if (var1 == this.ak_fld) {
				this.ag_fld = null;
				return;
			}

			var1.gy_void();
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lvw;)V"
	)
	public void ao(vw var1) {
		if (var1.hw_fld != null) {
			var1.gy_void();
		}

		var1.hw_fld = this.ak_fld.hw_fld;
		var1.hg_vw = this.ak_fld;
		var1.hw_fld.hg_vw = var1;
		var1.hg_vw.hw_fld = var1;
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(Lna;Lvw;)V"
	)
	public static void bn(na var0, vw var1) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var1.hw_fld != null) {
			var1.gy_void();
		}

		var1.hw_fld = var0.ak_fld;
		var1.hg_vw = var0.ak_fld.hg_vw;
		var1.hw_fld.hg_vw = var1;
		var1.hg_vw.hw_fld = var1;
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "()Lvw;"
	)
	public vw be() {
		vw var1 = this.ak_fld.hg_vw;
		if (var1 == this.ak_fld) {
			this.ag_fld = null;
			return null;
		} else {
			this.ag_fld = var1.hg_vw;
			return var1;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "()Lvw;"
	)
	public vw at() {
		vw var1 = this.ak_fld.hg_vw;
		if (var1 == this.ak_fld) {
			return null;
		} else {
			var1.gy_void();
			return var1;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ag() {
		while (true) {
			vw var1 = this.ak_fld.hg_vw;
			if (var1 == this.ak_fld) {
				this.ag_fld = null;
				return;
			}

			var1.gy_void();
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ax() {
		while (true) {
			vw var1 = this.ak_fld.hg_vw;
			if (var1 == this.ak_fld) {
				this.ag_fld = null;
				return;
			}

			var1.gy_void();
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "()Lvw;"
	)
	public vw bd() {
		vw var1 = this.ak_fld.hg_vw;
		if (var1 == this.ak_fld) {
			this.ag_fld = null;
			return null;
		} else {
			this.ag_fld = var1.hg_vw;
			return var1;
		}
	}

	@ObfuscatedName("mx")
	@ObfuscatedSignature(
		descriptor = "(Lna;Lvw;)V"
	)
	public static void mx(na var0, vw var1) {
		if (var0 == null) {
			var0.getClass();
		} else {
			if (var1.hw_fld != null) {
				var1.gy_void();
			}

			var1.hw_fld = var0.ak_fld;
			var1.hg_vw = var0.ak_fld.hg_vw;
			var1.hw_fld.hg_vw = var1;
			var1.hg_vw.hw_fld = var1;
		}
	}

	@ObfuscatedName("us")
	@ObfuscatedSignature(
		descriptor = "(Lna;)Lvw;"
	)
	public static vw us(na var0) {
		vw var1 = var0.ag_fld;
		if (var1 == var0.ak_fld) {
			var0.ag_fld = null;
			return null;
		} else {
			var0.ag_fld = var1.hw_fld;
			return var1;
		}
	}

	public na() {
		this.ak_fld.hg_vw = this.ak_fld;
		this.ak_fld.hw_fld = this.ak_fld;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "()Lvw;"
	)
	public vw br() {
		vw var1 = this.ak_fld.hg_vw;
		if (var1 == this.ak_fld) {
			this.ag_fld = null;
			return null;
		} else {
			this.ag_fld = var1.hg_vw;
			return var1;
		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "()Lvw;"
	)
	public vw bs() {
		vw var1 = this.ag_fld;
		if (var1 == this.ak_fld) {
			this.ag_fld = null;
			return null;
		} else {
			this.ag_fld = var1.hw_fld;
			return var1;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lvw;Lvw;)V"
	)
	public static void af(vw var0, vw var1) {
		if (var0.hw_fld != null) {
			var0.gy_void();
		}

		var0.hw_fld = var1.hw_fld;
		var0.hg_vw = var1;
		var0.hw_fld.hg_vw = var0;
		var0.hg_vw.hw_fld = var0;
	}

	@ObfuscatedName("es")
	@ObfuscatedSignature(
		descriptor = "(Luf;)I"
	)
	public static int es(uf var0) {
		return var0.ae_fld;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()Lvw;"
	)
	public vw ah() {
		vw var1 = this.ak_fld.hg_vw;
		if (var1 == this.ak_fld) {
			return null;
		} else {
			var1.gy_void();
			return var1;
		}
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "()Lvw;"
	)
	public vw bm() {
		return this.bd();
	}

	@ObfuscatedName("iterator")
	@ObfuscatedSignature(
		descriptor = "()Ljava/util/Iterator;"
	)
	@Override
	public Iterator iterator() {
		return new rl11(this);
	}

	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "(Lvw;)V"
	)
	public void dv(vw var1) {
		if (var1.hw_fld != null) {
			var1.xp_void();
		}

		var1.hg_vw = this.ak_fld.hg_vw;
		var1.hw_fld = this.ak_fld;
		var1.hg_vw.hg_vw = var1;
		var1.hg_vw.hw_fld = var1;
	}
}
