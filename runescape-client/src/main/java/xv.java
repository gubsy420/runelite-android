import java.util.Iterator;
import net.runelite.api.IndexedObjectSet;
import net.runelite.api.IterableHashTable;
import net.runelite.api.Node;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("xv")
@Implements({"IterableHashTable", "IndexedObjectSet"})
public class xv implements Iterable, IterableHashTable, IndexedObjectSet {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lvw;"
	)
	vw av_fld;
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
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ak_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ae_fld = 0;

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "()Lvw;"
	)
	public vw au() {
		this.ae_fld = 0;
		return this.av();
	}

	@ObfuscatedName("lu")
	@ObfuscatedSignature(
		descriptor = "(Lvw;J)V"
	)
	public void lu(vw var1, long var2) {
		vw var4 = this.get(var2);
		if (var4 != null) {
			var4.xh();
		}

		this.qj(var1, var2);
	}

	@ObfuscatedName("iterator")
	@ObfuscatedSignature(
		descriptor = "()Ljava/util/Iterator;"
	)
	@Override
	public Iterator iterator() {
		return new xk(this);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void az() {
		for (int var1 = 0; var1 < this.ak_fld; var1++) {
			vw var2 = this.ag_fld[var1];

			while (true) {
				vw var3 = var2.hg_vw;
				if (var3 == var2) {
					break;
				}

				var3.gy_void();
			}
		}

		this.az_fld = null;
		this.av_fld = null;
	}

	@ObfuscatedName("rs")
	@ObfuscatedSignature(
		descriptor = "(Lsn;)I"
	)
	public static int rs(sn var0) {
		return null == var0.ae_fld ? 0 : var0.ae_fld.length;
	}

	@ObfuscatedName("zn")
	@ObfuscatedSignature(
		descriptor = "(Lny;II)I"
	)
	public static int zn(ny var0, int var1, int var2) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return my.ag(var0.ah_fld, var1, var2);
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(J)Lvw;"
	)
	public vw ay(long var1) {
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

	@ObfuscatedName("ul")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ul() {
		this.az();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()Lvw;"
	)
	public vw av() {
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

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lvw;J)V"
	)
	public void ag(vw var1, long var2) {
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

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "()Ljava/util/Iterator;"
	)
	public Iterator cd() {
		return new xk(this);
	}

	// $VF: synthetic method
	// $VF: bridge method
	@ObfuscatedName("put")
	@ObfuscatedSignature(
		descriptor = "(Lnet/runelite/api/Node;J)V"
	)
	@Override
	public void put(Node var1, long var2) {
		this.lu((vw)var1, var2);
	}

	@ObfuscatedName("fv")
	@ObfuscatedSignature(
		descriptor = "(J)Lvw;"
	)
	public vw get(long var1) {
		return this.ak(var1);
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

	public xv(int var1) {
		this.ak_fld = var1;
		this.ag_fld = new vw[var1];

		for (int var2 = 0; var2 < var1; var2++) {
			vw var3 = this.ag_fld[var2] = new vw();
			var3.hg_vw = var3;
			var3.hw_fld = var3;
		}
	}

	@ObfuscatedName("qj")
	@ObfuscatedSignature(
		descriptor = "(Lvw;J)V"
	)
	public void qj(vw var1, long var2) {
		this.ag(var1, var2);
	}

	@ObfuscatedName("rx")
	@ObfuscatedSignature(
		descriptor = "(I)Lvw;"
	)
	public vw byIndex(int var1) {
		return this.get(var1);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(J)Lvw;"
	)
	public vw ak(long var1) {
		vw var3 = this.ag_fld[(int)(var1 & this.ak_fld - 1)];

		for (vw var4 = var3.hg_vw; var3 != var4; var4 = var4.hg_vw) {
			if (var4.hc_fld == var1) {
				this.az_fld = var4;
				return var4;
			}
		}

		this.az_fld = null;
		return null;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lxv;Lvw;J)V"
	)
	public static void aw(xv var0, vw var1, long var2) {
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

	@ObfuscatedName("gg")
	@ObfuscatedSignature(
		descriptor = "(Lxv;J)Lvw;"
	)
	public static vw gg(xv var0, long var1) {
		if (var0 == null) {
			var0.getClass();
		}

		vw var3 = var0.ag_fld[(int)(var1 & var0.ak_fld - 1)];

		for (var0.az_fld = var3.hg_vw; var0.az_fld != var3; var0.az_fld = var0.az_fld.hg_vw) {
			if (var0.az_fld.hc_fld == var1) {
				vw var4 = var0.az_fld;
				var0.az_fld = var0.az_fld.hg_vw;
				return var4;
			}
		}

		var0.az_fld = null;
		return null;
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

	@ObfuscatedName("jh")
	@ObfuscatedSignature(
		descriptor = "(Lxv;Lvw;J)V"
	)
	public static void jh(xv var0, vw var1, long var2) {
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

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "()Lvw;"
	)
	public vw al() {
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

	@ObfuscatedName("hw")
	@ObfuscatedSignature(
		descriptor = "(Lxv;)Ljava/util/Iterator;"
	)
	public static Iterator hw(xv var0) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return new xk(var0);
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "()Lvw;"
	)
	public vw af() {
		if (this.ak_fld > 0 && this.az_fld != this.ag_fld[this.ae_fld - 1]) {
			vw var2 = this.av_fld;
			this.az_fld = var2.hg_vw;
			return var2;
		} else {
			while (this.ae_fld < this.ak_fld) {
				vw[] var10000 = this.ag_fld;
				int var10001 = this.ak_fld;
				this.ae_fld = this.ak_fld + 1;
				vw var1 = var10000[var10001].hg_vw;
				if (var1 != this.ag_fld[this.ak_fld - 1]) {
					this.az_fld = var1.hw_fld;
					return var1;
				}
			}

			return null;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(J)Lvw;"
	)
	public vw aw(long var1) {
		vw var3 = this.ag_fld[(int)(var1 & this.ae_fld - 1)];

		for (this.az_fld = var3.hg_vw; this.av_fld != var3; this.az_fld = this.az_fld.hw_fld) {
			if (this.az_fld.hc_fld == var1) {
				vw var4 = this.av_fld;
				this.az_fld = this.av_fld.hg_vw;
				return var4;
			}
		}

		this.az_fld = null;
		return null;
	}
}
