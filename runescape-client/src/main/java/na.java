import java.util.Iterator;
import net.runelite.api.Deque;
import net.runelite.api.annotations.Export;
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

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lvw;Lvw;)V"
	)
	public static void ak(vw var0, vw var1) {
		if (var0.hg_fld != null) {
			var0.gy();
		}

		var0.hg_fld = var1.hg_fld;
		var0.hw_fld = var1;
		var0.hg_fld.hw_fld = var0;
		var0.hw_fld.hg_fld = var0;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void an() {
		while (true) {
			vw var1 = this.ak_fld.hw_fld;
			if (var1 == this.ak_fld) {
				this.ag_fld = null;
				return;
			}

			var1.gy();
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lvw;)V"
	)
	public void az(vw var1) {
		if (var1.hg_fld != null) {
			var1.gy();
		}

		var1.hg_fld = this.ak_fld.hg_fld;
		var1.hw_fld = this.ak_fld;
		var1.hg_fld.hw_fld = var1;
		var1.hw_fld.hg_fld = var1;
	}

	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "()Lvw;"
	)
	public vw dj() {
		return zi.ex(this);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lvw;)V"
	)
	public void av(vw var1) {
		if (var1.hg_fld != null) {
			var1.gy();
		}

		var1.hg_fld = this.ak_fld;
		var1.hw_fld = this.ak_fld.hw_fld;
		var1.hg_fld.hw_fld = var1;
		var1.hw_fld.hg_fld = var1;
	}

	@ObfuscatedName("id")
	@ObfuscatedSignature(
		descriptor = "(Lna;Lvw;)V"
	)
	public static void id(na var0, vw var1) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var1.hg_fld != null) {
			var1.gy();
		}

		var1.hg_fld = var0.ak_fld.hg_fld;
		var1.hw_fld = var0.ak_fld;
		var1.hg_fld.hw_fld = var1;
		var1.hw_fld.hg_fld = var1;
	}

	@ObfuscatedName("ut")
	@ObfuscatedSignature(
		descriptor = "(Lna;)Lvw;"
	)
	public static vw ut(na var0) {
		vw var1 = var0.ak_fld.hg_fld;
		if (var1 == var0.ak_fld) {
			return null;
		} else {
			var1.gy();
			return var1;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()Lvw;"
	)
	public vw ah() {
		vw var1 = this.ak_fld.hg_fld;
		if (var1 == this.ak_fld) {
			return null;
		} else {
			var1.gy();
			return var1;
		}
	}

	@ObfuscatedName("iy")
	@ObfuscatedSignature(
		descriptor = "(Lna;)Lvw;"
	)
	public static vw iy(na var0) {
		if (var0 == null) {
			var0.getClass();
		}

		vw var1 = var0.ag_fld;
		if (var1 == var0.ak_fld) {
			var0.ag_fld = null;
			return null;
		} else {
			var0.ag_fld = var1.hw_fld;
			return var1;
		}
	}

	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		descriptor = "(Lvw;)V"
	)
	public void eg(vw var1) {
		this.az(var1);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "()Lvw;"
	)
	public vw aw() {
		vw var1 = this.ak_fld.hw_fld;
		if (var1 == this.ak_fld) {
			this.ag_fld = null;
			return null;
		} else {
			this.ag_fld = var1.hw_fld;
			return var1;
		}
	}

	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "()Lvw;"
	)
	public vw dg() {
		return iy(this);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()Lvw;"
	)
	public vw ay() {
		vw var1 = this.ak_fld.hg_fld;
		if (var1 == this.ak_fld) {
			this.ag_fld = null;
			return null;
		} else {
			this.ag_fld = var1.hg_fld;
			return var1;
		}
	}

	@ObfuscatedName("ic")
	@ObfuscatedSignature(
		descriptor = "(Lna;)V"
	)
	public void ic(na var1) {
		vw var2 = this.ak_fld;
		vw var3 = this.ag_fld;
		this.ak_fld = var1.ak_fld;
		this.ag_fld = var1.ag_fld;
		var1.ak_fld = var2;
		var1.ag_fld = var3;
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
			this.ag_fld = var1.hg_fld;
			return var1;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lvw;)V"
	)
	public void ao(vw var1) {
		if (var1.hg_fld != null) {
			var1.gy();
		}

		var1.hg_fld = this.ak_fld;
		var1.hw_fld = this.ak_fld.hw_fld;
		var1.hg_fld.hw_fld = var1;
		var1.hw_fld.hg_fld = var1;
	}

	@ObfuscatedName("mh")
	@ObfuscatedSignature(
		descriptor = "(Lna;)V"
	)
	public static void mh(na var0) {
		if (var0 == null) {
			var0.getClass();
		} else {
			while (true) {
				vw var1 = var0.ak_fld.hw_fld;
				if (var1 == var0.ak_fld) {
					var0.ag_fld = null;
					return;
				}

				var1.gy();
			}
		}
	}

	@ObfuscatedName("yr")
	@ObfuscatedSignature(
		descriptor = "()Lvw;"
	)
	public vw yr() {
		return this.aw();
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void au() {
		while (true) {
			vw var1 = this.ak_fld.hw_fld;
			if (var1 == this.ak_fld) {
				this.ag_fld = null;
				return;
			}

			var1.gy();
		}
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "()Lvw;"
	)
	public vw bm() {
		vw var1 = this.ak_fld.hw_fld;
		if (var1 == this.ak_fld) {
			this.ag_fld = null;
			return null;
		} else {
			this.ag_fld = var1.hw_fld;
			return var1;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "()Lvw;"
	)
	public vw ap() {
		vw var1 = this.ak_fld.hw_fld;
		if (var1 == this.ak_fld) {
			return null;
		} else {
			var1.gy();
			return var1;
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void aa() {
		while (true) {
			vw var1 = this.ak_fld.hw_fld;
			if (var1 == this.ak_fld) {
				this.ag_fld = null;
				return;
			}

			var1.gy();
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
		this.eg((vw)var1);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lvw;)V"
	)
	public void aq(vw var1) {
		if (var1.hg_fld != null) {
			var1.gy();
		}

		var1.hg_fld = this.ak_fld.hg_fld;
		var1.hw_fld = this.ak_fld;
		var1.hg_fld.hw_fld = var1;
		var1.hw_fld.hg_fld = var1;
	}

	@ObfuscatedName("pa")
	@ObfuscatedSignature(
		descriptor = "(Lna;)Lvw;"
	)
	public static vw pa(na var0) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			vw var1 = var0.ak_fld.hw_fld;
			if (var1 == var0.ak_fld) {
				var0.ag_fld = null;
				return null;
			} else {
				var0.ag_fld = var1.hw_fld;
				return var1;
			}
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lvw;)V"
	)
	public void am(vw var1) {
		if (var1.hg_fld != null) {
			var1.gy();
		}

		var1.hg_fld = this.ak_fld.hg_fld;
		var1.hw_fld = this.ak_fld;
		var1.hg_fld.hw_fld = var1;
		var1.hw_fld.hg_fld = var1;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lvw;)V"
	)
	public void ad(vw var1) {
		if (var1.hg_fld != null) {
			var1.gy();
		}

		var1.hg_fld = this.ak_fld;
		var1.hw_fld = this.ak_fld.hw_fld;
		var1.hg_fld.hw_fld = var1;
		var1.hw_fld.hg_fld = var1;
	}

	@ObfuscatedName("ma")
	@ObfuscatedSignature(
		descriptor = "()Lvw;"
	)
	public vw ma() {
		return this.ay();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvw;)V"
	)
	public void ab(vw var1) {
		if (var1.hg_fld != null) {
			var1.gy();
		}

		var1.hg_fld = this.ak_fld;
		var1.hw_fld = this.ak_fld.hw_fld;
		var1.hg_fld.hw_fld = var1;
		var1.hw_fld.hg_fld = var1;
	}

	@ObfuscatedName("clear")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Export("clear")
	@Override
	public void clear() {
		mh(this);
	}

	@ObfuscatedName("iterator")
	@ObfuscatedSignature(
		descriptor = "()Ljava/util/Iterator;"
	)
	@Export("iterator")
	@Override
	public Iterator iterator() {
		return new rl11(this);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "()Lvw;"
	)
	public vw ac() {
		vw var1 = this.ak_fld.hg_fld;
		if (var1 == this.ak_fld) {
			return null;
		} else {
			var1.gy();
			return var1;
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ax() {
		while (true) {
			vw var1 = this.ak_fld.hw_fld;
			if (var1 == this.ak_fld) {
				this.ag_fld = null;
				return;
			}

			var1.gy();
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "()Lvw;"
	)
	public vw bd() {
		vw var1 = this.ak_fld.hw_fld;
		if (var1 == this.ak_fld) {
			this.ag_fld = null;
			return null;
		} else {
			this.ag_fld = var1.hw_fld;
			return var1;
		}
	}

	public na() {
		this.ak_fld.hw_fld = this.ak_fld;
		this.ak_fld.hg_fld = this.ak_fld;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "()Lvw;"
	)
	public vw br() {
		vw var1 = this.ak_fld.hw_fld;
		if (var1 == this.ak_fld) {
			this.ag_fld = null;
			return null;
		} else {
			this.ag_fld = var1.hw_fld;
			return var1;
		}
	}

	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		descriptor = "(Lna;)V"
	)
	public static void hi(na var0) {
		if (var0 == null) {
			var0.getClass();
		}

		while (true) {
			vw var1 = var0.ak_fld.hw_fld;
			if (var1 == var0.ak_fld) {
				var0.ag_fld = null;
				return;
			}

			var1.gy();
		}
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "()Lvw;"
	)
	public vw bh() {
		vw var1 = this.ag_fld;
		if (var1 == this.ak_fld) {
			this.ag_fld = null;
			return null;
		} else {
			this.ag_fld = var1.hg_fld;
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
			this.ag_fld = var1.hg_fld;
			return var1;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lvw;Lvw;)V"
	)
	public static void af(vw var0, vw var1) {
		if (var0.hg_fld != null) {
			var0.gy();
		}

		var0.hg_fld = var1.hg_fld;
		var0.hw_fld = var1;
		var0.hg_fld.hw_fld = var0;
		var0.hw_fld.hg_fld = var0;
	}

	@ObfuscatedName("li")
	@ObfuscatedSignature(
		descriptor = "(Lna;)Lvw;"
	)
	public static vw li(na var0) {
		vw var1 = var0.ak_fld.hw_fld;
		if (var1 == var0.ak_fld) {
			var0.ag_fld = null;
			return null;
		} else {
			var0.ag_fld = var1.hw_fld;
			return var1;
		}
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "()Lvw;"
	)
	public vw bz() {
		vw var1 = this.ak_fld.hw_fld;
		if (var1 == this.ak_fld) {
			this.ag_fld = null;
			return null;
		} else {
			this.ag_fld = var1.hw_fld;
			return var1;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()Lvw;"
	)
	public vw ae() {
		vw var1 = this.ak_fld.hg_fld;
		if (var1 == this.ak_fld) {
			return null;
		} else {
			var1.gz();
			return var1;
		}
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
			this.ag_fld = var1.hg_fld;
			return var1;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ag() {
		while (true) {
			vw var1 = this.ak_fld.hw_fld;
			if (var1 == this.ak_fld) {
				this.ag_fld = null;
				return;
			}

			var1.gx();
		}
	}
}
