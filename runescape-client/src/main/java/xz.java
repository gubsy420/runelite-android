import java.util.Iterator;
import net.runelite.api.HashTable;
import net.runelite.api.Node;
import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("xz")
@Implements({"HashTable"})
public class xz implements HashTable {
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ae_fld = 0;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ak_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "[Lvw;"
	)
	vw[] ag_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lvw;"
	)
	vw az_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lvw;"
	)
	vw av_fld;

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ag() {
		int var1 = 0;

		for (int var2 = 0; var2 < this.ak_fld; var2++) {
			vw var3 = this.ag_fld[var2];

			for (vw var4 = var3.hw_fld; var4 != var3; var4 = var4.hw_fld) {
				var1++;
			}
		}

		return var1;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ar() {
		int var1 = 0;

		for (int var2 = 0; var2 < this.ak_fld; var2++) {
			vw var3 = this.ag_fld[var2];

			for (vw var4 = var3.hw_fld; var4 != var3; var4 = var4.hw_fld) {
				var1++;
			}
		}

		return var1;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "()Lvw;"
	)
	public vw ai() {
		if (this.ae_fld > 0 && this.az_fld != this.ag_fld[this.ae_fld - 1]) {
			vw var2 = this.az_fld;
			this.az_fld = var2.hw_fld;
			return var2;
		} else {
			while (this.ae_fld < this.ak_fld) {
				vw var1 = this.ag_fld[this.ae_fld++].hw_fld;
				if (var1 != this.ag_fld[this.ae_fld - 1]) {
					this.az_fld = var1.hw_fld;
					return var1;
				}
			}

			return null;
		}
	}

	@ObfuscatedName("vw")
	@ObfuscatedSignature(
		descriptor = "(Lxz;J)Lvw;"
	)
	public static vw vw(xz var0, long var1) {
		vw var3 = var0.ag_fld[(int)(var1 & var0.ak_fld - 1)];

		for (var0.av_fld = var3.hw_fld; var0.av_fld != var3; var0.av_fld = var0.av_fld.hw_fld) {
			if (var0.av_fld.hc_long == var1) {
				vw var4 = var0.av_fld;
				var0.av_fld = var0.av_fld.hw_fld;
				return var4;
			}
		}

		var0.av_fld = null;
		return null;
	}

	// $VF: synthetic method
	// $VF: bridge method
	@ObfuscatedName("get")
	@ObfuscatedSignature(
		descriptor = "(J)Lnet/runelite/api/Node;"
	)
	@Export("get")
	@Override
	public Node get(long var1) {
		return ib.iu(this, var1);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lvw;J)V"
	)
	public void al(vw var1, long var2) {
		if (var1.hg_fld != null) {
			var1.gy();
		}

		vw var4 = this.ag_fld[(int)(var2 & this.ak_fld - 1)];
		var1.hg_fld = var4.hg_fld;
		var1.hw_fld = var4;
		var1.hg_fld.hw_fld = var1;
		var1.hw_fld.hg_fld = var1;
		var1.hc_long = var2;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()Lvw;"
	)
	public vw ae() {
		if (this.ae_fld > 0 && this.az_fld != this.ag_fld[this.ae_fld - 1]) {
			vw var2 = this.az_fld;
			this.az_fld = var2.hw_fld;
			return var2;
		} else {
			while (this.ae_fld < this.ak_fld) {
				vw var1 = this.ag_fld[this.ae_fld++].hw_fld;
				if (var1 != this.ag_fld[this.ae_fld - 1]) {
					this.az_fld = var1.hw_fld;
					return var1;
				}
			}

			return null;
		}
	}

	@ObfuscatedName("tw")
	@ObfuscatedSignature(
		descriptor = "(Lxz;J)Lvw;"
	)
	public static vw tw(xz var0, long var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			vw var3 = var0.ag_fld[(int)(var1 & var0.ak_fld - 1)];

			for (var0.av_fld = var3.hw_fld; var0.av_fld != var3; var0.av_fld = var0.av_fld.hw_fld) {
				if (var0.av_fld.hc_long == var1) {
					vw var4 = var0.av_fld;
					var0.av_fld = var0.av_fld.hw_fld;
					return var4;
				}
			}

			var0.av_fld = null;
			return null;
		}
	}

	public xz(int var1) {
		this.ak_fld = var1;
		this.ag_fld = new vw[var1];

		for (int var2 = 0; var2 < var1; var2++) {
			vw var3 = this.ag_fld[var2] = new vw();
			var3.hw_fld = var3;
			var3.hg_fld = var3;
		}
	}

	@ObfuscatedName("sj")
	@ObfuscatedSignature(
		descriptor = "(Lxz;Lvw;J)V"
	)
	public static void sj(xz var0, vw var1, long var2) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var1.hg_fld != null) {
			var1.gy();
		}

		vw var4 = var0.ag_fld[(int)(var2 & var0.ak_fld - 1)];
		var1.hg_fld = var4.hg_fld;
		var1.hw_fld = var4;
		var1.hg_fld.hw_fld = var1;
		var1.hw_fld.hg_fld = var1;
		var1.hc_long = var2;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(J)Lvw;"
	)
	public vw aw(long var1) {
		vw var3 = this.ag_fld[(int)(var1 & this.ak_fld - 1)];

		for (this.av_fld = var3.hw_fld; this.av_fld != var3; this.av_fld = this.av_fld.hw_fld) {
			if (this.av_fld.hc_long == var1) {
				vw var4 = this.av_fld;
				this.av_fld = this.av_fld.hw_fld;
				return var4;
			}
		}

		this.av_fld = null;
		return null;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ay() {
		int var1 = 0;

		for (int var2 = 0; var2 < this.ak_fld; var2++) {
			vw var3 = this.ag_fld[var2];

			for (vw var4 = var3.hw_fld; var4 != var3; var4 = var4.hw_fld) {
				var1++;
			}
		}

		return var1;
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(Lxz;Lvw;J)V"
	)
	public static void ck(xz var0, vw var1, long var2) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var1.hg_fld != null) {
			var1.gy();
		}

		vw var4 = var0.ag_fld[(int)(var2 & var0.ak_fld - 1)];
		var1.hg_fld = var4.hg_fld;
		var1.hw_fld = var4;
		var1.hg_fld.hw_fld = var1;
		var1.hw_fld.hg_fld = var1;
		var1.hc_long = var2;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int as() {
		int var1 = 0;

		for (int var2 = 0; var2 < this.ak_fld; var2++) {
			vw var3 = this.ag_fld[var2];

			for (vw var4 = var3.hw_fld; var4 != var3; var4 = var4.hw_fld) {
				var1++;
			}
		}

		return var1;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()Lvw;"
	)
	public vw av() {
		this.ae_fld = 0;
		return this.ae();
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "()Lvw;"
	)
	public vw ax() {
		this.ae_fld = 0;
		return this.ae();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()Lvw;"
	)
	public vw an() {
		if (this.ae_fld > 0 && this.az_fld != this.ag_fld[this.ae_fld - 1]) {
			vw var2 = this.az_fld;
			this.az_fld = var2.hw_fld;
			return var2;
		} else {
			while (this.ae_fld < this.ak_fld) {
				vw var1 = this.ag_fld[this.ae_fld++].hw_fld;
				if (var1 != this.ag_fld[this.ae_fld - 1]) {
					this.az_fld = var1.hw_fld;
					return var1;
				}
			}

			return null;
		}
	}

	@ObfuscatedName("fe")
	@ObfuscatedSignature(
		descriptor = "(Lxz;Lvw;J)V"
	)
	public static void fe(xz var0, vw var1, long var2) {
		if (var0 == null) {
			var0.getClass();
		} else {
			if (var1.hg_fld != null) {
				var1.gy();
			}

			vw var4 = var0.ag_fld[(int)(var2 & var0.ak_fld - 1)];
			var1.hg_fld = var4.hg_fld;
			var1.hw_fld = var4;
			var1.hg_fld.hw_fld = var1;
			var1.hw_fld.hg_fld = var1;
			var1.hc_long = var2;
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "()Lvw;"
	)
	public vw aq() {
		if (this.ae_fld > 0 && this.az_fld != this.ag_fld[this.ae_fld - 1]) {
			vw var2 = this.az_fld;
			this.az_fld = var2.hw_fld;
			return var2;
		} else {
			while (this.ae_fld < this.ak_fld) {
				vw var1 = this.ag_fld[this.ae_fld++].hw_fld;
				if (var1 != this.ag_fld[this.ae_fld - 1]) {
					this.az_fld = var1.hw_fld;
					return var1;
				}
			}

			return null;
		}
	}

	@ObfuscatedName("kr")
	@ObfuscatedSignature(
		descriptor = "(Lvw;J)V"
	)
	public void kr(vw var1, long var2) {
		fe(this, var1, var2);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "()Lvw;"
	)
	public vw am() {
		if (this.ae_fld > 0 && this.az_fld != this.ag_fld[this.ae_fld - 1]) {
			vw var2 = this.az_fld;
			this.az_fld = var2.hw_fld;
			return var2;
		} else {
			while (this.ae_fld < this.ak_fld) {
				vw var1 = this.ag_fld[this.ae_fld++].hw_fld;
				if (var1 != this.ag_fld[this.ae_fld - 1]) {
					this.az_fld = var1.hw_fld;
					return var1;
				}
			}

			return null;
		}
	}

	@ObfuscatedName("iterator")
	@ObfuscatedSignature(
		descriptor = "()Ljava/util/Iterator;"
	)
	@Export("iterator")
	@Override
	public Iterator iterator() {
		return new rl14(this);
	}

	@ObfuscatedName("py")
	@ObfuscatedSignature(
		descriptor = "(Lxz;)Lvw;"
	)
	public static vw py(xz var0) {
		if (var0.ae_fld > 0 && var0.az_fld != var0.ag_fld[var0.ae_fld - 1]) {
			vw var2 = var0.az_fld;
			var0.az_fld = var2.hw_fld;
			return var2;
		} else {
			while (var0.ae_fld < var0.ak_fld) {
				vw var1 = var0.ag_fld[var0.ae_fld++].hw_fld;
				if (var1 != var0.ag_fld[var0.ae_fld - 1]) {
					var0.az_fld = var1.hw_fld;
					return var1;
				}
			}

			return null;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(J)Lvw;"
	)
	public vw ak(long var1) {
		vw var3 = this.ag_fld[(int)(var1 & this.ak_fld - 1)];

		for (this.az_fld = var3.hw_fld; this.av_fld != var3; this.av_fld = this.av_fld.hg_fld) {
			if (this.av_fld.hc_long == var1) {
				vw var4 = this.az_fld;
				this.az_fld = this.az_fld.hg_fld;
				return var4;
			}
		}

		this.av_fld = null;
		return null;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lvw;J)V"
	)
	public void az(vw var1, long var2) {
		if (var1.hg_fld != null) {
			var1.hf_void();
		}

		vw var4 = this.ag_fld[(int)(var2 & this.ak_fld - 1)];
		var1.hg_fld = var4.hw_fld;
		var1.hg_fld = var4;
		var1.hw_fld.hg_fld = var1;
		var1.hw_fld.hw_fld = var1;
		var1.hc_long = var2;
	}
}
