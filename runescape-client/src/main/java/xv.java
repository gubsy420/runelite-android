import java.util.Iterator;
import net.runelite.api.IndexedObjectSet;
import net.runelite.api.IterableHashTable;
import net.runelite.api.Node;
import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("xv")
@Implements({"IterableHashTable", "IndexedObjectSet"})
public class xv implements Iterable, IterableHashTable, IndexedObjectSet {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lvw;"
	)
	vw az_fld;
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

	// $VF: synthetic method
	// $VF: bridge method
	@ObfuscatedName("put")
	@ObfuscatedSignature(
		descriptor = "(Lnet/runelite/api/Node;J)V"
	)
	@Export("put")
	@Override
	public void put(Node var1, long var2) {
		lv.ap(this, (vw)var1, var2);
	}

	@ObfuscatedName("mo")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void mo() {
		aa(this);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "()Lvw;"
	)
	public vw af() {
		this.ae_fld = 0;
		return this.ae();
	}

	@ObfuscatedName("iterator")
	@ObfuscatedSignature(
		descriptor = "()Ljava/util/Iterator;"
	)
	@Export("iterator")
	@Override
	public Iterator iterator() {
		return new xk(this);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(J)Lvw;"
	)
	public vw ay(long var1) {
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

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lxv;)V"
	)
	public static void aa(xv var0) {
		if (var0 == null) {
			var0.getClass();
		}

		for (int var1 = 0; var1 < var0.ak_fld; var1++) {
			vw var2 = var0.ag_fld[var1];

			while (true) {
				vw var3 = var2.hw_fld;
				if (var3 == var2) {
					break;
				}

				var3.gy();
			}
		}

		var0.av_fld = null;
		var0.az_fld = null;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lvw;J)V"
	)
	public void ag(vw var1, long var2) {
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

	@ObfuscatedName("yu")
	@ObfuscatedSignature(
		descriptor = "(Lda;)I"
	)
	public static int yu(da var0) {
		return var0.cg_fld.ar_fld * -2033953402;
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "()Ljava/util/Iterator;"
	)
	public Iterator cd() {
		return new xk(this);
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "()Ljava/util/Iterator;"
	)
	public Iterator cc() {
		return new xk(this);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(J)Lvw;"
	)
	public vw ah(long var1) {
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

	// $VF: synthetic method
	// $VF: bridge method
	@ObfuscatedName("get")
	@ObfuscatedSignature(
		descriptor = "(J)Lnet/runelite/api/Node;"
	)
	@Export("get")
	@Override
	public Node get(long var1) {
		return sq.jx(this, var1);
	}

	@ObfuscatedName("oy")
	@ObfuscatedSignature(
		descriptor = "(Lvw;J)V"
	)
	public void oy(vw var1, long var2) {
		this.ag(var1, var2);
	}

	public xv(int var1) {
		this.ak_fld = var1;
		this.ag_fld = new vw[var1];

		for (int var2 = 0; var2 < var1; var2++) {
			vw var3 = this.ag_fld[var2] = new vw();
			var3.hw_fld = var3;
			var3.hg_fld = var3;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(J)Lvw;"
	)
	public vw ak(long var1) {
		vw var3 = this.ag_fld[(int)(var1 & this.ak_fld - 1)];

		for (vw var4 = var3.hw_fld; var3 != var4; var4 = var4.hw_fld) {
			if (var4.hc_long == var1) {
				this.av_fld = var4;
				return var4;
			}
		}

		this.av_fld = null;
		return null;
	}

	@ObfuscatedName("jx")
	@ObfuscatedSignature(
		descriptor = "(I)Lvw;"
	)
	public vw byIndex(int var1) {
		return sq.jx(this, var1);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lvw;J)V"
	)
	public void ar(vw var1, long var2) {
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

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lvw;J)V"
	)
	public void as(vw var1, long var2) {
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

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "()Lvw;"
	)
	public vw al() {
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

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "()Lvw;"
	)
	public vw au() {
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

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()Lvw;"
	)
	public vw av() {
		this.ak_fld = 0;
		return this.af();
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void az() {
		aa(this);
	}
}
