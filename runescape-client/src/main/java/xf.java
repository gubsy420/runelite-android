import java.util.Iterator;
import net.runelite.api.IndexedObjectSet;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("xf")
@Implements({"IndexedObjectSet"})
public class xf implements Iterable, IndexedObjectSet {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ag_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lxr;"
	)
	xr ak_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "[Lug;"
	)
	ug[] az_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lug;"
	)
	ug av_fld;

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lug;J)V"
	)
	public void aw(ug var1, long var2) {
		if (var1.en_fld != null) {
			var1.mb();
		}

		ug var4 = this.az_fld[(int)(var2 & this.ag_fld - 1)];
		var1.en_fld = var4.en_fld;
		var1.eg_fld = var4;
		var1.en_fld.eg_fld = var1;
		var1.eg_fld.en_fld = var1;
		var1.er_fld = var2;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(J)Lug;"
	)
	public ug ak(long var1) {
		ug var3 = this.az_fld[(int)(var1 & this.ag_fld - 1)];

		for (ug var4 = var3.eg_fld; var3 != var4; var4 = var4.eg_fld) {
			if (var4.er_fld == var1) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lug;J)V"
	)
	public void ag(ug var1, long var2) {
		if (var1.en_fld != null) {
			var1.mb();
		}

		ug var4 = this.az_fld[(int)(var2 & this.ag_fld - 1)];
		var1.en_fld = var4.en_fld;
		var1.eg_fld = var4;
		var1.en_fld.eg_fld = var1;
		var1.eg_fld.en_fld = var1;
		var1.er_fld = var2;
	}

	@ObfuscatedName("ss")
	@ObfuscatedSignature(
		descriptor = "(J)Lug;"
	)
	public ug ss(long var1) {
		return this.ak(var1);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void as() {
		for (int var1 = 0; var1 < this.ag_fld; var1++) {
			ug var2 = this.az_fld[var1];

			while (true) {
				ug var3 = var2.eg_fld;
				if (var3 == var2) {
					break;
				}

				var3.mb();
			}
		}

		this.av_fld = null;
	}

	@ObfuscatedName("xn")
	@ObfuscatedSignature(
		descriptor = "(I)Lug;"
	)
	public ug byIndex(int var1) {
		return this.ss(var1);
	}

	@ObfuscatedName("iterator")
	@ObfuscatedSignature(
		descriptor = "()Ljava/util/Iterator;"
	)
	@Override
	public Iterator iterator() {
		return new xr(this);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lug;J)V"
	)
	public void ay(ug var1, long var2) {
		if (var1.en_fld != null) {
			var1.mb();
		}

		ug var4 = this.az_fld[(int)(var2 & this.ag_fld - 1)];
		var1.en_fld = var4.en_fld;
		var1.eg_fld = var4;
		var1.en_fld.eg_fld = var1;
		var1.eg_fld.en_fld = var1;
		var1.er_fld = var2;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lug;J)V"
	)
	public void ah(ug var1, long var2) {
		if (var1.en_fld != null) {
			var1.mb();
		}

		ug var4 = this.az_fld[(int)(var2 & this.ag_fld - 1)];
		var1.en_fld = var4.en_fld;
		var1.eg_fld = var4;
		var1.en_fld.eg_fld = var1;
		var1.eg_fld.en_fld = var1;
		var1.er_fld = var2;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(J)Lug;"
	)
	public ug ae(long var1) {
		ug var3 = this.az_fld[(int)(var1 & this.ag_fld - 1)];

		for (this.av_fld = var3.eg_fld; this.av_fld != var3; this.av_fld = this.av_fld.eg_fld) {
			if (this.av_fld.er_fld == var1) {
				ug var4 = this.av_fld;
				this.av_fld = this.av_fld.eg_fld;
				return var4;
			}
		}

		this.av_fld = null;
		return null;
	}

	public xf(int var1) {
		this.ag_fld = var1;
		this.az_fld = new ug[var1];

		for (int var2 = 0; var2 < var1; var2++) {
			ug var3 = this.az_fld[var2] = new ug();
			var3.eg_fld = var3;
			var3.en_fld = var3;
		}

		this.ak_fld = new xr(this);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(J)Lug;"
	)
	public ug av(long var1) {
		ug var3 = this.az_fld[(int)(var1 & this.ag_fld - 1)];

		for (this.av_fld = var3.eg_fld; this.av_fld != var3; this.av_fld = this.av_fld.eg_fld) {
			if (this.av_fld.er_fld == var1) {
				ug var4 = this.av_fld;
				this.av_fld = this.av_fld.eg_fld;
				return var4;
			}
		}

		this.av_fld = null;
		return null;
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "()Ljava/util/Iterator;"
	)
	public Iterator cc() {
		this.ak_fld.ak();
		return this.ak_fld;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ar() {
		for (int var1 = 0; var1 < this.ag_fld; var1++) {
			ug var2 = this.az_fld[var1];

			while (true) {
				ug var3 = var2.eg_fld;
				if (var3 == var2) {
					break;
				}

				var3.mb();
			}
		}

		this.av_fld = null;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void az() {
		for (int var1 = 0; var1 < this.ag_fld; var1++) {
			ug var2 = this.az_fld[var1];

			while (true) {
				ug var3 = var2.eg_fld;
				if (var3 == var2) {
					break;
				}

				var3.mb();
			}
		}

		this.av_fld = null;
	}
}
