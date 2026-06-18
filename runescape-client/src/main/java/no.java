import java.util.Collection;
import java.util.Iterator;
import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("no")
public class no implements Iterable, Collection {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lvw;"
	)
	vw ag_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lvw;"
	)
	vw ak_fld = new vw();

	@ObfuscatedName("yi")
	@ObfuscatedSignature(
		descriptor = "(Lno;Ljava/lang/Object;)Z"
	)
	public static boolean yi(no var0, Object var1) {
		if (var0 == null) {
			var0.getClass();
		}

		throw new RuntimeException();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ag() {
		while (this.ak_fld.hw_fld != this.ak_fld) {
			this.ak_fld.hw_fld.gy();
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lvw;Lvw;)V"
	)
	public static void ak(vw var0, vw var1) {
		if (var0.hg_fld != null) {
			var0.gy();
		}

		var0.hg_fld = var1;
		var0.hw_fld = var1.hw_fld;
		var0.hg_fld.hw_fld = var0;
		var0.hw_fld.hg_fld = var0;
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(Lvw;)Z"
	)
	boolean bb(vw var1) {
		dx(this, var1);
		return true;
	}

	@ObfuscatedName("addAll")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Collection;)Z"
	)
	@Export("addAll")
	@Override
	public boolean addAll(Collection var1) {
		throw new RuntimeException();
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ax() {
		while (this.ak_fld.hw_fld != this.ak_fld) {
			this.ak_fld.hw_fld.gy();
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()Lvw;"
	)
	public vw ae() {
		vw var1 = this.ak_fld.hw_fld;
		if (var1 == this.ak_fld) {
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
		return this.aw(null);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lvw;)Lvw;"
	)
	vw aw(vw var1) {
		vw var2;
		if (var1 == null) {
			var2 = this.ak_fld.hw_fld;
		} else {
			var2 = var1;
		}

		if (var2 == this.ak_fld) {
			this.ag_fld = null;
			return null;
		} else {
			this.ag_fld = var2.hw_fld;
			return var2;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()Lvw;"
	)
	public vw ay() {
		vw var1 = this.ag_fld;
		if (var1 == this.ak_fld) {
			this.ag_fld = null;
			return null;
		} else {
			this.ag_fld = var1.hw_fld;
			return var1;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int as() {
		int var1 = 0;

		for (vw var2 = this.ak_fld.hw_fld; var2 != this.ak_fld; var2 = var2.hw_fld) {
			var1++;
		}

		return var1;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean ar() {
		return this.ak_fld.hw_fld == this.ak_fld;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lvw;Lvw;)V"
	)
	public static void au(vw var0, vw var1) {
		if (var0.hg_fld != null) {
			var0.gy();
		}

		var0.hg_fld = var1;
		var0.hw_fld = var1.hw_fld;
		var0.hg_fld.hw_fld = var0;
		var0.hw_fld.hg_fld = var0;
	}

	@ObfuscatedName("isEmpty")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Export("isEmpty")
	@Override
	public boolean isEmpty() {
		return this.ar();
	}

	@ObfuscatedName("contains")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	@Override
	public boolean contains(Object var1) {
		throw new RuntimeException();
	}

	@ObfuscatedName("toArray")
	@ObfuscatedSignature(
		descriptor = "()[Ljava/lang/Object;"
	)
	@Export("toArray")
	@Override
	public Object[] toArray() {
		return av(this);
	}

	@ObfuscatedName("toArray")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;)[Ljava/lang/Object;"
	)
	@Export("toArray")
	@Override
	public Object[] toArray(Object[] var1) {
		int var2 = 0;

		for (vw var3 = this.ak_fld.hw_fld; var3 != this.ak_fld; var3 = var3.hw_fld) {
			var1[var2++] = var3;
		}

		return (Object[])var1;
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Collection;)Z"
	)
	public boolean cr(Collection var1) {
		throw new RuntimeException();
	}

	@ObfuscatedName("xi")
	@ObfuscatedSignature(
		descriptor = "(Lno;Ljava/lang/Object;)Z"
	)
	public static boolean xi(no var0, Object var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.equals(var1);
	}

	@ObfuscatedName("ni")
	@ObfuscatedSignature(
		descriptor = "(Lno;Lvw;)Lvw;"
	)
	public static vw ni(no var0, vw var1) {
		if (var0 == null) {
			var0.getClass();
		}

		vw var2;
		if (var1 == null) {
			var2 = var0.ak_fld.hw_fld;
		} else {
			var2 = var1;
		}

		if (var2 == var0.ak_fld) {
			var0.ag_fld = null;
			return null;
		} else {
			var0.ag_fld = var2.hw_fld;
			return var2;
		}
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(Lvw;)Lvw;"
	)
	vw bm(vw var1) {
		vw var2;
		if (var1 == null) {
			var2 = this.ak_fld.hw_fld;
		} else {
			var2 = var1;
		}

		if (var2 == this.ak_fld) {
			this.ag_fld = null;
			return null;
		} else {
			this.ag_fld = var2.hw_fld;
			return var2;
		}
	}

	@ObfuscatedName("pk")
	@ObfuscatedSignature(
		descriptor = "()Lvw;"
	)
	public vw pk() {
		return this.ay();
	}

	@ObfuscatedName("add")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	@Export("add")
	@Override
	public boolean add(Object var1) {
		return this.bb((vw)var1);
	}

	@ObfuscatedName("removeAll")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Collection;)Z"
	)
	@Export("removeAll")
	@Override
	public boolean removeAll(Collection var1) {
		throw new RuntimeException();
	}

	@ObfuscatedName("iterator")
	@ObfuscatedSignature(
		descriptor = "()Ljava/util/Iterator;"
	)
	@Export("iterator")
	@Override
	public Iterator iterator() {
		return new nf(this);
	}

	@ObfuscatedName("clear")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Export("clear")
	@Override
	public void clear() {
		this.ag();
	}

	@ObfuscatedName("containsAll")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Collection;)Z"
	)
	@Export("containsAll")
	@Override
	public boolean containsAll(Collection var1) {
		throw new RuntimeException();
	}

	@ObfuscatedName("rf")
	@ObfuscatedSignature(
		descriptor = "()Lvw;"
	)
	public vw rf() {
		return this.ak_fld;
	}

	@ObfuscatedName("equals")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	@Export("equals")
	@Override
	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("retainAll")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Collection;)Z"
	)
	@Export("retainAll")
	@Override
	public boolean retainAll(Collection var1) {
		throw new RuntimeException();
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "()Ljava/util/Iterator;"
	)
	public Iterator cd() {
		return new nf(this);
	}

	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "(Lno;Lvw;)V"
	)
	public static void dx(no var0, vw var1) {
		if (var0 == null) {
			var0.getClass();
		} else {
			if (var1.hg_fld != null) {
				var1.gy();
			}

			var1.hg_fld = var0.ak_fld.hg_fld;
			var1.hw_fld = var0.ak_fld;
			var1.hg_fld.hw_fld = var1;
			var1.hw_fld.hg_fld = var1;
		}
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "()Ljava/util/Iterator;"
	)
	public Iterator cc() {
		return new nf(this);
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "()[Ljava/lang/Object;"
	)
	public Object[] ba() {
		return av(this);
	}

	public no() {
		this.ak_fld.hw_fld = this.ak_fld;
		this.ak_fld.hg_fld = this.ak_fld;
	}

	@ObfuscatedName("jg")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	public boolean jg(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("afm")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int afm() {
		return super.hashCode();
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int bv() {
		return super.hashCode();
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "()Lvw;"
	)
	public vw be() {
		vw var1 = this.ag_fld;
		if (var1 == this.ak_fld) {
			this.ag_fld = null;
			return null;
		} else {
			this.ag_fld = var1.hw_fld;
			return var1;
		}
	}

	@ObfuscatedName("jm")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	public boolean jm(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("ru")
	@ObfuscatedSignature(
		descriptor = "(Loe;ILjava/lang/String;)Ljava/lang/String;"
	)
	public static String ru(oe var0, int var1, String var2) {
		return ih.av(var0.es_fld, var1, var2);
	}

	@ObfuscatedName("oi")
	@ObfuscatedSignature(
		descriptor = "(Lno;Ljava/lang/Object;)Z"
	)
	public static boolean oi(no var0, Object var1) {
		if (var0 == null) {
			var0.getClass();
		}

		throw new RuntimeException();
	}

	@ObfuscatedName("kz")
	@ObfuscatedSignature(
		descriptor = "(Lno;)[Lvw;"
	)
	public static vw[] kz(no var0) {
		if (var0 == null) {
			var0.getClass();
		}

		vw[] var1 = new vw[var0.as()];
		int var2 = 0;

		for (vw var3 = var0.ak_fld.hw_fld; var3 != var0.ak_fld; var3 = var3.hw_fld) {
			var1[var2++] = var3;
		}

		return var1;
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "()[Lvw;"
	)
	vw[] by() {
		vw[] var1 = new vw[this.as()];
		int var2 = 0;

		for (vw var3 = this.ak_fld.hw_fld; var3 != this.ak_fld; var3 = var3.hw_fld) {
			var1[var2++] = var3;
		}

		return var1;
	}

	@ObfuscatedName("re")
	@ObfuscatedSignature(
		descriptor = "(Lno;Ljava/lang/Object;)Z"
	)
	public static boolean re(no var0, Object var1) {
		if (var0 == null) {
			var0.getClass();
		}

		throw new RuntimeException();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void an() {
		while (this.ak_fld.hw_fld != this.ak_fld) {
			this.ak_fld.hw_fld.gy();
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lno;)[Lvw;"
	)
	public static vw[] av(no var0) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			vw[] var1 = new vw[var0.as()];
			int var2 = 0;

			for (vw var3 = var0.ak_fld.hw_fld; var3 != var0.ak_fld; var3 = var3.hw_fld) {
				var1[var2++] = var3;
			}

			return var1;
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lvw;)V"
	)
	public void aa(vw var1) {
		if (var1.hg_fld != null) {
			var1.gy();
		}

		var1.hg_fld = this.ak_fld.hg_fld;
		var1.hw_fld = this.ak_fld;
		var1.hg_fld.hw_fld = var1;
		var1.hw_fld.hg_fld = var1;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lvw;)V"
	)
	public void ai(vw var1) {
		if (var1.hg_fld != null) {
			var1.gy();
		}

		var1.hg_fld = this.ak_fld;
		var1.hw_fld = this.ak_fld.hw_fld;
		var1.hg_fld.hw_fld = var1;
		var1.hw_fld.hg_fld = var1;
	}

	@ObfuscatedName("we")
	@ObfuscatedSignature(
		descriptor = "(Lno;Ljava/util/Collection;)Z"
	)
	public static boolean we(no var0, Collection var1) {
		if (var0 == null) {
			var0.getClass();
		}

		throw new RuntimeException();
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lvw;)V"
	)
	public void aq(vw var1) {
		if (var1.hg_fld != null) {
			var1.gy();
		}

		var1.hg_fld = this.ak_fld;
		var1.hw_fld = this.ak_fld.hw_fld;
		var1.hg_fld.hw_fld = var1;
		var1.hw_fld.hg_fld = var1;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "()Lvw;"
	)
	public vw ad() {
		vw var1 = this.ak_fld.hw_fld;
		if (var1 == this.ak_fld) {
			return null;
		} else {
			var1.gy();
			return var1;
		}
	}

	@ObfuscatedName("en")
	@ObfuscatedSignature(
		descriptor = "()Lvw;"
	)
	public vw en() {
		return this.ah();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "()Lvw;"
	)
	public vw ao() {
		vw var1 = this.ak_fld.hw_fld;
		if (var1 == this.ak_fld) {
			return null;
		} else {
			var1.gy();
			return var1;
		}
	}

	@ObfuscatedName("wo")
	@ObfuscatedSignature(
		descriptor = "(Leg;Leg;I)I"
	)
	public static int wo(eg var0, eg var1, int var2) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			int var3 = -1;
			int var4 = (int)var1.qh_fld[var2];
			int var5 = (int)var1.ph_fld[var2];
			int var6 = (int)var1.wl_fld[var2];

			for (int var7 = 0; var7 < var0.as_fld; var7++) {
				if (var4 == (int)var0.qh_fld[var7] && var5 == (int)var0.ph_fld[var7] && var6 == (int)var0.wl_fld[var7]) {
					var3 = var7;
					break;
				}
			}

			if (var3 == -1) {
				var0.qh_fld[var0.as_fld] = var4;
				var0.ph_fld[var0.as_fld] = var5;
				var0.wl_fld[var0.as_fld] = var6;
				if (var1.bf_fld != null) {
					var0.bf_fld[var0.as_fld] = var1.bf_fld[var2];
				}

				if (var1.bk_fld != null) {
					var0.bk_fld[var0.as_fld] = var1.bk_fld[var2];
					var0.bj_fld[var0.as_fld] = var1.bj_fld[var2];
				}

				var3 = var0.as_fld++;
			}

			return var3;
		}
	}

	@ObfuscatedName("afc")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int afc() {
		return this.as();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "()Lvw;"
	)
	public vw ab() {
		return this.aw(null);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "()Lvw;"
	)
	public vw at() {
		return this.aw(null);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "()Lvw;"
	)
	public vw ac() {
		return this.aw(null);
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	public boolean bw(Object var1) {
		throw new RuntimeException();
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lvw;)V"
	)
	public void am(vw var1) {
		if (var1.hg_fld != null) {
			var1.gy();
		}

		var1.hg_fld = this.ak_fld;
		var1.hw_fld = this.ak_fld.hw_fld;
		var1.hg_fld.hw_fld = var1;
		var1.hw_fld.hg_fld = var1;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(Lvw;)Lvw;"
	)
	vw br(vw var1) {
		vw var2;
		if (var1 == null) {
			var2 = this.ak_fld.hw_fld;
		} else {
			var2 = var1;
		}

		if (var2 == this.ak_fld) {
			this.ag_fld = null;
			return null;
		} else {
			this.ag_fld = var2.hw_fld;
			return var2;
		}
	}

	@ObfuscatedName("size")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("size")
	@Override
	public int size() {
		return this.as();
	}

	@ObfuscatedName("xs")
	@ObfuscatedSignature(
		descriptor = "(Lno;Lvw;)Lvw;"
	)
	public static vw xs(no var0, vw var1) {
		if (var0 == null) {
			var0.getClass();
		}

		vw var2;
		if (var1 == null) {
			var2 = var0.ak_fld.hw_fld;
		} else {
			var2 = var1;
		}

		if (var2 == var0.ak_fld) {
			var0.ag_fld = null;
			return null;
		} else {
			var0.ag_fld = var2.hw_fld;
			return var2;
		}
	}

	@ObfuscatedName("yq")
	@ObfuscatedSignature(
		descriptor = "(Lno;)Lvw;"
	)
	public static vw yq(no var0) {
		vw var1 = var0.ag_fld;
		if (var1 == var0.ak_fld) {
			var0.ag_fld = null;
			return null;
		} else {
			var0.ag_fld = var1.hw_fld;
			return var1;
		}
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int bt() {
		return super.hashCode();
	}

	@ObfuscatedName("hashCode")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("hashCode")
	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int bj() {
		int var1 = 0;

		for (vw var2 = this.ak_fld.hw_fld; var2 != this.ak_fld; var2 = var2.hw_fld) {
			var1++;
		}

		return var1;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean bf() {
		return this.ak_fld.hw_fld == this.ak_fld;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lvw;)Lvw;"
	)
	vw aj(vw var1) {
		vw var2;
		if (var1 == null) {
			var2 = this.ak_fld.hw_fld;
		} else {
			var2 = var1;
		}

		if (var2 == this.ak_fld) {
			this.ag_fld = null;
			return null;
		} else {
			this.ag_fld = var2.hw_fld;
			return var2;
		}
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "()[Lvw;"
	)
	vw[] bx() {
		vw[] var1 = new vw[this.as()];
		int var2 = 0;

		for (vw var3 = this.ak_fld.hw_fld; var3 != this.ak_fld; var3 = var3.hw_fld) {
			var1[var2++] = var3;
		}

		return var1;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "()[Lvw;"
	)
	vw[] bo() {
		vw[] var1 = new vw[this.as()];
		int var2 = 0;

		for (vw var3 = this.ak_fld.hw_fld; var3 != this.ak_fld; var3 = var3.hw_fld) {
			var1[var2++] = var3;
		}

		return var1;
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int bk() {
		int var1 = 0;

		for (vw var2 = this.ak_fld.hw_fld; var2 != this.ak_fld; var2 = var2.hw_fld) {
			var1++;
		}

		return var1;
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int bp() {
		return this.as();
	}

	@ObfuscatedName("afa")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int afa() {
		return this.as();
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean bu() {
		return this.ar();
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	public boolean cw(Object var1) {
		return this.bb((vw)var1);
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;)[Ljava/lang/Object;"
	)
	public Object[] bq(Object[] var1) {
		int var2 = 0;

		for (vw var3 = this.ak_fld.hw_fld; var3 != this.ak_fld; var3 = var3.hw_fld) {
			var1[var2++] = var3;
		}

		return (Object[])var1;
	}

	@ObfuscatedName("remove")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	@Export("remove")
	@Override
	public boolean remove(Object var1) {
		throw new RuntimeException();
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

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lvw;)Z"
	)
	boolean al(vw var1) {
		dx(this, var1);
		return true;
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(Lvw;)Z"
	)
	boolean bg(vw var1) {
		dx(this, var1);
		return true;
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	public boolean cq(Object var1) {
		throw new RuntimeException();
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	public boolean cy(Object var1) {
		throw new RuntimeException();
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Collection;)Z"
	)
	public boolean cf(Collection var1) {
		throw new RuntimeException();
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Collection;)Z"
	)
	public boolean cx(Collection var1) {
		throw new RuntimeException();
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Collection;)Z"
	)
	public boolean cs(Collection var1) {
		throw new RuntimeException();
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Collection;)Z"
	)
	public boolean cp(Collection var1) {
		throw new RuntimeException();
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Collection;)Z"
	)
	public boolean cn(Collection var1) {
		throw new RuntimeException();
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Collection;)Z"
	)
	public boolean ca(Collection var1) {
		throw new RuntimeException();
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	public boolean cg(Object var1) {
		return this.bb((vw)var1);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "()Lvw;"
	)
	public vw ap() {
		return this.aw(null);
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(Lno;)Lvw;"
	)
	public static vw ba(no var0) {
		vw var1 = var0.ag_fld;
		if (var1 == var0.ak_fld) {
			var0.ag_fld = null;
			return null;
		} else {
			var0.ag_fld = var1.hw_fld;
			return var1;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "()[Lvw;"
	)
	vw[] af() {
		vw[] var1 = new vw[this.bk()];
		int var2 = 0;

		for (vw var3 = this.ag_fld.hw_fld; var3 != this.ak_fld; var3 = var3.hg_fld) {
			var1[var2++] = var3;
		}

		return var1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lvw;)V"
	)
	public void az(vw var1) {
		if (var1.hg_fld != null) {
			var1.jy();
		}

		var1.hg_fld = this.ak_fld.hg_fld;
		var1.hg_fld = this.ak_fld;
		var1.hw_fld.hg_fld = var1;
		var1.hw_fld.hw_fld = var1;
	}
}
