import java.util.Iterator;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("nf")
public class nf implements Iterator {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lno;"
	)
	no ak_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lvw;"
	)
	vw az_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lvw;"
	)
	vw ag_fld = null;

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void an() {
		this.ag_fld.gy_void();
		this.ag_fld = null;
	}

	@ObfuscatedName("next")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/Object;"
	)
	@Override
	public Object next() {
		vw var1 = this.az_fld;
		if (var1 == this.ak_fld.ak_fld) {
			var1 = null;
			this.az_fld = null;
		} else {
			this.az_fld = var1.hg_vw;
		}

		this.ag_fld = var1;
		return var1;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ag() {
		this.az_fld = this.ak_fld != null ? this.ak_fld.ak_fld.hg_vw : null;
		this.ag_fld = null;
	}

	@ObfuscatedName("remove")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Override
	public void remove() {
		if (this.ag_fld == null) {
			throw new IllegalStateException();
		} else {
			this.ag_fld.gy_void();
			this.ag_fld = null;
		}
	}

	@ObfuscatedName("hasNext")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	public boolean hasNext() {
		return this.az_fld != this.ak_fld.ak_fld && this.az_fld != null;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lno;)V"
	)
	void az(no var1) {
		this.ak_fld = var1;
		this.ag();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lno;)V"
	)
	void av(no var1) {
		this.ak_fld = var1;
		this.ag();
	}

	nf(no var1) {
		this.ak(var1);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lno;)V"
	)
	void ae(no var1) {
		this.ak_fld = var1;
		this.ag();
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(Luf;II)V"
	)
	public static void cf(uf var0, int var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ah_fld = var1 * -1585468391;
		var0.aw_fld = var2 * -1694273172;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lno;)V"
	)
	void ah(no var1) {
		this.ak_fld = var1;
		this.ag();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/Object;"
	)
	public Object ay() {
		vw var1 = this.az_fld;
		if (var1 == this.ak_fld.ak_fld) {
			var1 = null;
			this.az_fld = null;
		} else {
			this.az_fld = var1.hg_vw;
		}

		this.ag_fld = var1;
		return var1;
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(Lnf;)V"
	)
	public static void ci(nf var0) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.az_fld = var0.ak_fld != null ? var0.ak_fld.ak_fld.hg_vw : null;
			var0.ag_fld = null;
		}
	}

	@ObfuscatedName("vt")
	@ObfuscatedSignature(
		descriptor = "(Lnf;)Ljava/lang/Object;"
	)
	public static Object vt(nf var0) {
		vw var1 = var0.az_fld;
		if (var1 == var0.ak_fld.ak_fld) {
			var1 = null;
			var0.az_fld = null;
		} else {
			var0.az_fld = var1.hg_vw;
		}

		var0.ag_fld = var1;
		return var1;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean ar() {
		return this.az_fld != this.ak_fld.ak_fld && this.az_fld != null;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void af() {
		if (this.ag_fld == null) {
			throw new IllegalStateException();
		} else {
			this.ag_fld.gy_void();
			this.ag_fld = null;
		}
	}

	@ObfuscatedName("mj")
	@ObfuscatedSignature(
		descriptor = "(Lnf;)V"
	)
	public static void mj(nf var0) {
		var0.ag_fld.gy_void();
		var0.ag_fld = null;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void al() {
		this.ag_fld.gy_void();
		this.ag_fld = null;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void au() {
		if (this.ag_fld == null) {
			throw new IllegalStateException();
		} else {
			this.ag_fld.gy_void();
			this.ag_fld = null;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lno;)V"
	)
	void ak(no var1) {
		this.ak_fld = var1;
		this.ag();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void aw() {
		this.az_fld = this.ak_fld != null ? this.ak_fld.ak_fld.hg_vw : null;
		this.ag_fld = null;
	}
}
