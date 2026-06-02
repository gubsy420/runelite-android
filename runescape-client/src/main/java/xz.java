import java.util.Iterator;
import net.runelite.api.HashTable;
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
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lvw;"
	)
	vw av_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lvw;"
	)
	vw az_fld;

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ag() {
		int var1 = 0;

		for (int var2 = 0; var2 < this.ak_fld; var2++) {
			vw var3 = this.ag_fld[var2];

			for (vw var4 = var3.hg_vw; var4 != var3; var4 = var4.hg_vw) {
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

			for (vw var4 = var3.hg_vw; var4 != var3; var4 = var4.hg_vw) {
				var1++;
			}
		}

		return var1;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()Lvw;"
	)
	public vw ae() {
		if (this.ae_fld > 0 && this.av_fld != this.ag_fld[this.ae_fld - 1]) {
			vw var2 = this.av_fld;
			this.av_fld = var2.hg_vw;
			return var2;
		} else {
			while (this.ae_fld < this.ak_fld) {
				vw var1 = this.ag_fld[this.ae_fld++].hg_vw;
				if (var1 != this.ag_fld[this.ae_fld - 1]) {
					this.av_fld = var1.hg_vw;
					return var1;
				}
			}

			return null;
		}
	}

	public xz(int var1) {
		this.ak_fld = var1;
		this.ag_fld = new vw[var1];

		for (int var2 = 0; var2 < var1; var2++) {
			vw var3 = this.ag_fld[var2] = new vw();
			var3.hg_vw = var3;
			var3.hw_fld = var3;
		}
	}

	@ObfuscatedName("ls")
	@ObfuscatedSignature(
		descriptor = "(Lxz;)I"
	)
	public static int ls(xz var0) {
		if (var0 == null) {
			var0.getClass();
		}

		int var1 = 0;

		for (int var2 = 0; var2 < var0.ak_fld; var2++) {
			vw var3 = var0.ag_fld[var2];

			for (vw var4 = var3.hg_vw; var4 != var3; var4 = var4.hg_vw) {
				var1++;
			}
		}

		return var1;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(J)Lvw;"
	)
	public vw ah(long var1) {
		vw var3 = this.ag_fld[(int)(var1 & this.ak_fld - 1)];

		for (this.az_fld = var3.hg_vw; this.az_fld != var3; this.az_fld = this.az_fld.hg_vw) {
			if (this.az_fld.hc_fld == var1) {
				vw var4 = this.az_fld;
				this.az_fld = this.az_fld.hg_vw;
				return var4;
			}
		}

		this.az_fld = null;
		return null;
	}

	@ObfuscatedName("iterator")
	@ObfuscatedSignature(
		descriptor = "()Ljava/util/Iterator;"
	)
	@Override
	public Iterator iterator() {
		return new rl14(this);
	}

	@ObfuscatedName("vx")
	@ObfuscatedSignature(
		descriptor = "(Lxz;Lvw;J)V"
	)
	public static void vx(xz var0, vw var1, long var2) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var1.hw_fld != null) {
			var1.gy_void();
		}

		vw var4 = var0.ag_fld[(int)(var2 & var0.ak_fld - 1)];
		var1.hw_fld = var4.hw_fld;
		var1.hg_vw = var4;
		var1.hw_fld.hg_vw = var1;
		var1.hg_vw.hw_fld = var1;
		var1.hc_fld = var2;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(J)Lvw;"
	)
	public vw aw(long var1) {
		vw var3 = this.ag_fld[(int)(var1 & this.ak_fld - 1)];

		for (this.az_fld = var3.hg_vw; this.az_fld != var3; this.az_fld = this.az_fld.hg_vw) {
			if (this.az_fld.hc_fld == var1) {
				vw var4 = this.az_fld;
				this.az_fld = this.az_fld.hg_vw;
				return var4;
			}
		}

		this.az_fld = null;
		return null;
	}

	@ObfuscatedName("ry")
	@ObfuscatedSignature(
		descriptor = "(Lxz;)Lvw;"
	)
	public static vw ry(xz var0) {
		if (var0.ae_fld > 0 && var0.av_fld != var0.ag_fld[var0.ae_fld - 1]) {
			vw var2 = var0.av_fld;
			var0.av_fld = var2.hg_vw;
			return var2;
		} else {
			while (var0.ae_fld < var0.ak_fld) {
				vw var1 = var0.ag_fld[var0.ae_fld++].hg_vw;
				if (var1 != var0.ag_fld[var0.ae_fld - 1]) {
					var0.av_fld = var1.hg_vw;
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

		for (this.az_fld = var3.hg_vw; this.az_fld != var3; this.az_fld = this.az_fld.hg_vw) {
			if (this.az_fld.hc_fld == var1) {
				vw var4 = this.az_fld;
				this.az_fld = this.az_fld.hg_vw;
				return var4;
			}
		}

		this.az_fld = null;
		return null;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lvw;J)V"
	)
	public void af(vw var1, long var2) {
		if (var1.hw_fld != null) {
			var1.gy_void();
		}

		vw var4 = this.ag_fld[(int)(var2 & this.ak_fld - 1)];
		var1.hw_fld = var4.hw_fld;
		var1.hg_vw = var4;
		var1.hw_fld.hg_vw = var1;
		var1.hg_vw.hw_fld = var1;
		var1.hc_fld = var2;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "()Lvw;"
	)
	public vw aq() {
		this.ae_fld = 0;
		return aa(this);
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(Lxz;)I"
	)
	public static int bj(xz var0) {
		if (var0 == null) {
			var0.getClass();
		}

		int var1 = 0;

		for (int var2 = 0; var2 < var0.ak_fld; var2++) {
			vw var3 = var0.ag_fld[var2];

			for (vw var4 = var3.hg_vw; var4 != var3; var4 = var4.hg_vw) {
				var1++;
			}
		}

		return var1;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lvw;J)V"
	)
	public void au(vw var1, long var2) {
		if (var1.hw_fld != null) {
			var1.gy_void();
		}

		vw var4 = this.ag_fld[(int)(var2 & this.ak_fld - 1)];
		var1.hw_fld = var4.hw_fld;
		var1.hg_vw = var4;
		var1.hw_fld.hg_vw = var1;
		var1.hg_vw.hw_fld = var1;
		var1.hc_fld = var2;
	}

	@ObfuscatedName("rr")
	@ObfuscatedSignature(
		descriptor = "(Lvw;J)V"
	)
	public void rr(vw var1, long var2) {
		this.az(var1, var2);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "()Lvw;"
	)
	public vw am() {
		if (this.ae_fld > 0 && this.av_fld != this.ag_fld[this.ae_fld - 1]) {
			vw var2 = this.av_fld;
			this.av_fld = var2.hg_vw;
			return var2;
		} else {
			while (this.ae_fld < this.ak_fld) {
				vw var1 = this.ag_fld[this.ae_fld++].hg_vw;
				if (var1 != this.ag_fld[this.ae_fld - 1]) {
					this.av_fld = var1.hg_vw;
					return var1;
				}
			}

			return null;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lvw;J)V"
	)
	public void az(vw var1, long var2) {
		if (var1.hw_fld != null) {
			var1.gy_void();
		}

		vw var4 = this.ag_fld[(int)(var2 & this.ak_fld - 1)];
		var1.hw_fld = var4.hw_fld;
		var1.hg_vw = var4;
		var1.hw_fld.hg_vw = var1;
		var1.hg_vw.hw_fld = var1;
		var1.hc_fld = var2;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "()Lvw;"
	)
	public vw aa() {
		if (this.ae_fld > 0 && this.av_fld != this.ag_fld[this.ae_fld - 1]) {
			vw var2 = this.av_fld;
			this.av_fld = var2.hg_vw;
			return var2;
		} else {
			while (this.ae_fld < this.ak_fld) {
				vw var1 = this.ag_fld[this.ae_fld++].hg_vw;
				if (var1 != this.ag_fld[this.ae_fld - 1]) {
					this.av_fld = var1.hg_vw;
					return var1;
				}
			}

			return null;
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lxz;)Lvw;"
	)
	public static vw aa(xz var0) {
		if (var0 == null) {
			throw new NullPointerException();
		} else if (var0.ae_fld > 0 && var0.av_fld != var0.ag_fld[var0.ae_fld - 1]) {
			vw var2 = var0.av_fld;
			var0.av_fld = var2.hg_vw;
			return var2;
		} else {
			while (var0.ae_fld < var0.ak_fld) {
				vw var1 = var0.ag_fld[var0.ae_fld++].hg_vw;
				if (var1 != var0.ag_fld[var0.ae_fld - 1]) {
					var0.av_fld = var1.hg_vw;
					return var1;
				}
			}

			return null;
		}
	}

	@ObfuscatedName("gd")
	@ObfuscatedSignature(
		descriptor = "(J)Lvw;"
	)
	public vw get(long var1) {
		return this.ak(var1);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "()Lvw;"
	)
	public vw ai() {
		if (this.ae_fld > 0 && this.av_fld != this.ag_fld[this.ae_fld - 1]) {
			vw var2 = this.av_fld;
			this.av_fld = var2.hg_vw;
			return var2;
		} else {
			while (this.ae_fld < this.ak_fld) {
				vw var1 = this.ag_fld[this.ae_fld++].hg_vw;
				if (var1 != this.ag_fld[this.ae_fld - 1]) {
					this.av_fld = var1.hg_vw;
					return var1;
				}
			}

			return null;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()Lvw;"
	)
	public vw av() {
		if (this.ak_fld > 0 && this.av_fld != this.ag_fld[this.ae_fld - 1]) {
			vw var2 = this.az_fld;
			this.az_fld = var2.hg_vw;
			return var2;
		} else {
			while (this.ak_fld < this.ak_fld) {
				vw var1 = this.ag_fld[this.ae_fld++].hg_vw;
				if (var1 != this.ag_fld[this.ae_fld - 1]) {
					this.az_fld = var1.hw_fld;
					return var1;
				}
			}

			return null;
		}
	}
}
