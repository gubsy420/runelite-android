import java.util.Collection;
import java.util.Iterator;
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

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ag() {
		while (this.ak_fld.hg_vw != this.ak_fld) {
			this.ak_fld.hg_vw.gy_void();
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

		var0.hw_fld = var1;
		var0.hg_vw = var1.hg_vw;
		var0.hw_fld.hg_vw = var0;
		var0.hg_vw.hw_fld = var0;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lvw;)Z"
	)
	boolean al(vw var1) {
		this.az(var1);
		return true;
	}

	@ObfuscatedName("addAll")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Collection;)Z"
	)
	@Override
	public boolean addAll(Collection var1) {
		throw new RuntimeException();
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

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()Lvw;"
	)
	public vw ah() {
		return this.aj(null);
	}

	@ObfuscatedName("om")
	@ObfuscatedSignature(
		descriptor = "(Lpi;)V"
	)
	public static void om(pi var0) {
		var0.an_fld = var0.az_fld * -349353067;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lvw;)Lvw;"
	)
	vw aj(vw var1) {
		vw var2;
		if (var1 == null) {
			var2 = this.ak_fld.hg_vw;
		} else {
			var2 = var1;
		}

		if (var2 == this.ak_fld) {
			this.ag_fld = null;
			return null;
		} else {
			this.ag_fld = var2.hg_vw;
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
			this.ag_fld = var1.hg_vw;
			return var1;
		}
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean bi() {
		return this.ak_fld.hg_vw == this.ak_fld;
	}

	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	public boolean jt(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("of")
	@ObfuscatedSignature(
		descriptor = "()Lvw;"
	)
	public vw of() {
		return this.ak_fld;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lvw;Lvw;)V"
	)
	public static void au(vw var0, vw var1) {
		if (var0.hw_fld != null) {
			var0.gy_void();
		}

		var0.hw_fld = var1;
		var0.hg_vw = var1.hg_vw;
		var0.hw_fld.hg_vw = var0;
		var0.hg_vw.hw_fld = var0;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(Lno;)I"
	)
	public static int bd(no var0) {
		if (var0 == null) {
			var0.getClass();
		}

		int var1 = 0;

		for (vw var2 = var0.ak_fld.hg_vw; var2 != var0.ak_fld; var2 = var2.hg_vw) {
			var1++;
		}

		return var1;
	}

	@ObfuscatedName("ih")
	@ObfuscatedSignature(
		descriptor = "(Lno;)Lvw;"
	)
	public static vw ih(no var0) {
		vw var1 = var0.ag_fld;
		if (var1 == var0.ak_fld) {
			var0.ag_fld = null;
			return null;
		} else {
			var0.ag_fld = var1.hg_vw;
			return var1;
		}
	}

	@ObfuscatedName("sn")
	@ObfuscatedSignature(
		descriptor = "(Lno;Ljava/lang/Object;)Z"
	)
	public static boolean sn(no var0, Object var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.equals(var1);
	}

	@ObfuscatedName("isEmpty")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	public boolean isEmpty() {
		return this.bi();
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
	@Override
	public Object[] toArray() {
		return by(this);
	}

	@ObfuscatedName("mc")
	@ObfuscatedSignature(
		descriptor = "(Lno;Ljava/util/Collection;)Z"
	)
	public static boolean mc(no var0, Collection var1) {
		if (var0 == null) {
			var0.getClass();
		}

		throw new RuntimeException();
	}

	@ObfuscatedName("toArray")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;)[Ljava/lang/Object;"
	)
	@Override
	public Object[] toArray(Object[] var1) {
		int var2 = 0;

		for (vw var3 = this.ak_fld.hg_vw; var3 != this.ak_fld; var3 = var3.hg_vw) {
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

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	public boolean bn(Object var1) {
		throw new RuntimeException();
	}

	@ObfuscatedName("add")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	@Override
	public boolean add(Object var1) {
		return this.al((vw)var1);
	}

	@ObfuscatedName("removeAll")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Collection;)Z"
	)
	@Override
	public boolean removeAll(Collection var1) {
		throw new RuntimeException();
	}

	@ObfuscatedName("iterator")
	@ObfuscatedSignature(
		descriptor = "()Ljava/util/Iterator;"
	)
	@Override
	public Iterator iterator() {
		return new nf(this);
	}

	@ObfuscatedName("clear")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Override
	public void clear() {
		this.ag();
	}

	@ObfuscatedName("is")
	@ObfuscatedSignature(
		descriptor = "(Lno;Ljava/lang/Object;)Z"
	)
	public static boolean is(no var0, Object var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.equals(var1);
	}

	@ObfuscatedName("ps")
	@ObfuscatedSignature(
		descriptor = "(Lno;Lvw;)Lvw;"
	)
	public static vw ps(no var0, vw var1) {
		if (var0 == null) {
			var0.getClass();
		}

		vw var2;
		if (var1 == null) {
			var2 = var0.ak_fld.hg_vw;
		} else {
			var2 = var1;
		}

		if (var2 == var0.ak_fld) {
			var0.ag_fld = null;
			return null;
		} else {
			var0.ag_fld = var2.hg_vw;
			return var2;
		}
	}

	@ObfuscatedName("containsAll")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Collection;)Z"
	)
	@Override
	public boolean containsAll(Collection var1) {
		throw new RuntimeException();
	}

	@ObfuscatedName("equals")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	@Override
	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("retainAll")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Collection;)Z"
	)
	@Override
	public boolean retainAll(Collection var1) {
		throw new RuntimeException();
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "()Ljava/util/Iterator;"
	)
	public Iterator cc() {
		return new nf(this);
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "()Ljava/util/Iterator;"
	)
	public Iterator cd() {
		return new nf(this);
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "()[Ljava/lang/Object;"
	)
	public Object[] ba() {
		return by(this);
	}

	public no() {
		this.ak_fld.hg_vw = this.ak_fld;
		this.ak_fld.hw_fld = this.ak_fld;
	}

	@ObfuscatedName("jn")
	@ObfuscatedSignature(
		descriptor = "(Lno;)[Lvw;"
	)
	public static vw[] jn(no var0) {
		if (var0 == null) {
			var0.getClass();
		}

		vw[] var1 = new vw[na(var0)];
		int var2 = 0;

		for (vw var3 = var0.ak_fld.hg_vw; var3 != var0.ak_fld; var3 = var3.hg_vw) {
			var1[var2++] = var3;
		}

		return var1;
	}

	@ObfuscatedName("afc")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int afc() {
		return super.hashCode();
	}

	@ObfuscatedName("afm")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int afm() {
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
			this.ag_fld = var1.hg_vw;
			return var1;
		}
	}

	@ObfuscatedName("na")
	@ObfuscatedSignature(
		descriptor = "(Lno;)I"
	)
	public static int na(no var0) {
		if (var0 == null) {
			var0.getClass();
		}

		int var1 = 0;

		for (vw var2 = var0.ak_fld.hg_vw; var2 != var0.ak_fld; var2 = var2.hg_vw) {
			var1++;
		}

		return var1;
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "()[Lvw;"
	)
	vw[] by() {
		vw[] var1 = new vw[na(this)];
		int var2 = 0;

		for (vw var3 = this.ak_fld.hg_vw; var3 != this.ak_fld; var3 = var3.hg_vw) {
			var1[var2++] = var3;
		}

		return var1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void an() {
		while (this.ak_fld.hg_vw != this.ak_fld) {
			this.ak_fld.hg_vw.gy_void();
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lvw;)V"
	)
	public void aa(vw var1) {
		if (var1.hw_fld != null) {
			var1.gy_void();
		}

		var1.hw_fld = this.ak_fld.hw_fld;
		var1.hg_vw = this.ak_fld;
		var1.hw_fld.hg_vw = var1;
		var1.hg_vw.hw_fld = var1;
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(Lno;)[Lvw;"
	)
	public static vw[] by(no var0) {
		if (var0 == null) {
			var0.getClass();
		}

		vw[] var1 = new vw[na(var0)];
		int var2 = 0;

		for (vw var3 = var0.ak_fld.hg_vw; var3 != var0.ak_fld; var3 = var3.hg_vw) {
			var1[var2++] = var3;
		}

		return var1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lvw;)V"
	)
	public void aq(vw var1) {
		if (var1.hw_fld != null) {
			var1.gy_void();
		}

		var1.hw_fld = this.ak_fld;
		var1.hg_vw = this.ak_fld.hg_vw;
		var1.hw_fld.hg_vw = var1;
		var1.hg_vw.hw_fld = var1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lvw;)V"
	)
	public void az(vw var1) {
		if (var1.hw_fld != null) {
			var1.gy_void();
		}

		var1.hw_fld = this.ak_fld.hw_fld;
		var1.hg_vw = this.ak_fld;
		var1.hw_fld.hg_vw = var1;
		var1.hg_vw.hw_fld = var1;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "()Lvw;"
	)
	public vw ad() {
		vw var1 = this.ak_fld.hg_vw;
		if (var1 == this.ak_fld) {
			return null;
		} else {
			var1.gy_void();
			return var1;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "()Lvw;"
	)
	public vw ao() {
		vw var1 = this.ak_fld.hg_vw;
		if (var1 == this.ak_fld) {
			return null;
		} else {
			var1.gy_void();
			return var1;
		}
	}

	@ObfuscatedName("qu")
	@ObfuscatedSignature(
		descriptor = "(Lno;Ljava/lang/Object;)Z"
	)
	public static boolean qu(no var0, Object var1) {
		if (var0 == null) {
			var0.getClass();
		}

		throw new RuntimeException();
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int bp() {
		return na(this);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "()Lvw;"
	)
	public vw ab() {
		return this.aj(null);
	}

	@ObfuscatedName("fi")
	@ObfuscatedSignature(
		descriptor = "(Lno;Ljava/lang/Object;)Z"
	)
	public static boolean fi(no var0, Object var1) {
		if (var0 == null) {
			var0.getClass();
		}

		throw new RuntimeException();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "()Lvw;"
	)
	public vw at() {
		return this.aj(null);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "()Lvw;"
	)
	public vw ac() {
		return this.aj(null);
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
		if (var1.hw_fld != null) {
			var1.gy_void();
		}

		var1.hw_fld = this.ak_fld;
		var1.hg_vw = this.ak_fld.hg_vw;
		var1.hw_fld.hg_vw = var1;
		var1.hg_vw.hw_fld = var1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lvw;)Lvw;"
	)
	vw aw(vw var1) {
		vw var2;
		if (var1 == null) {
			var2 = this.ak_fld.hg_vw;
		} else {
			var2 = var1;
		}

		if (var2 == this.ak_fld) {
			this.ag_fld = null;
			return null;
		} else {
			this.ag_fld = var2.hg_vw;
			return var2;
		}
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(Lvw;)Lvw;"
	)
	vw bz(vw var1) {
		vw var2;
		if (var1 == null) {
			var2 = this.ak_fld.hg_vw;
		} else {
			var2 = var1;
		}

		if (var2 == this.ak_fld) {
			this.ag_fld = null;
			return null;
		} else {
			this.ag_fld = var2.hg_vw;
			return var2;
		}
	}

	@ObfuscatedName("size")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int size() {
		return na(this);
	}

	@ObfuscatedName("afa")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int afa() {
		return super.hashCode();
	}

	@ObfuscatedName("hashCode")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean bu() {
		return this.ak_fld.hg_vw == this.ak_fld;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(Lvw;)Lvw;"
	)
	vw br(vw var1) {
		vw var2;
		if (var1 == null) {
			var2 = this.ak_fld.hg_vw;
		} else {
			var2 = var1;
		}

		if (var2 == this.ak_fld) {
			this.ag_fld = null;
			return null;
		} else {
			this.ag_fld = var2.hg_vw;
			return var2;
		}
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "()[Lvw;"
	)
	vw[] bl() {
		vw[] var1 = new vw[na(this)];
		int var2 = 0;

		for (vw var3 = this.ak_fld.hg_vw; var3 != this.ak_fld; var3 = var3.hg_vw) {
			var1[var2++] = var3;
		}

		return var1;
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "()[Lvw;"
	)
	vw[] bx() {
		vw[] var1 = new vw[na(this)];
		int var2 = 0;

		for (vw var3 = this.ak_fld.hg_vw; var3 != this.ak_fld; var3 = var3.hg_vw) {
			var1[var2++] = var3;
		}

		return var1;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int bt() {
		return na(this);
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int bv() {
		return na(this);
	}

	@ObfuscatedName("zs")
	@ObfuscatedSignature(
		descriptor = "(Lno;Ljava/util/Collection;)Z"
	)
	public static boolean zs(no var0, Collection var1) {
		if (var0 == null) {
			var0.getClass();
		}

		throw new RuntimeException();
	}

	@ObfuscatedName("kn")
	@ObfuscatedSignature(
		descriptor = "()Lvw;"
	)
	public vw kn() {
		return this.ay();
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean bf() {
		return this.bi();
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean ar() {
		return this.bi();
	}

	@ObfuscatedName("nn")
	@ObfuscatedSignature(
		descriptor = "(Lno;Lvw;)V"
	)
	public static void nn(no var0, vw var1) {
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

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;)[Ljava/lang/Object;"
	)
	public Object[] bq(Object[] var1) {
		int var2 = 0;

		for (vw var3 = this.ak_fld.hg_vw; var3 != this.ak_fld; var3 = var3.hg_vw) {
			var1[var2++] = var3;
		}

		return (Object[])var1;
	}

	@ObfuscatedName("remove")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	@Override
	public boolean remove(Object var1) {
		throw new RuntimeException();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lvw;)V"
	)
	public void av(vw var1) {
		if (var1.hw_fld != null) {
			var1.gy_void();
		}

		var1.hw_fld = this.ak_fld;
		var1.hg_vw = this.ak_fld.hg_vw;
		var1.hw_fld.hg_vw = var1;
		var1.hg_vw.hw_fld = var1;
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(Lvw;)Z"
	)
	boolean bg(vw var1) {
		this.az(var1);
		return true;
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(Lvw;)Z"
	)
	boolean bb(vw var1) {
		this.az(var1);
		return true;
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	public boolean cv(Object var1) {
		throw new RuntimeException();
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	public boolean cy(Object var1) {
		throw new RuntimeException();
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Collection;)Z"
	)
	public boolean cs(Collection var1) {
		throw new RuntimeException();
	}

	@ObfuscatedName("xy")
	@ObfuscatedSignature(
		descriptor = "()Lvw;"
	)
	public vw xy() {
		return this.ah();
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Collection;)Z"
	)
	public boolean cp(Collection var1) {
		throw new RuntimeException();
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Collection;)Z"
	)
	public boolean ce(Collection var1) {
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
		return this.al((vw)var1);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "()Lvw;"
	)
	public vw ap() {
		return this.aj(null);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int as() {
		int var1 = 0;

		for (vw var2 = this.ag_fld.hg_vw; var2 != this.ak_fld; var2 = var2.hw_fld) {
			var1++;
		}

		return var1;
	}

	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		descriptor = "(Lno;)Lvw;"
	)
	public static vw hs(no var0) {
		vw var1 = var0.ag_fld;
		if (var1 == var0.ak_fld) {
			var0.ag_fld = null;
			return null;
		} else {
			var0.ag_fld = var1.hg_vw;
			return var1;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "()[Lvw;"
	)
	vw[] af() {
		vw[] var1 = new vw[na(this)];
		int var2 = 0;

		for (vw var3 = this.ak_fld.hw_fld; var3 != this.ag_fld; var3 = var3.hg_vw) {
			var1[var2++] = var3;
		}

		return var1;
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	public boolean cm(Object var1) {
		return this.al((vw)var1);
	}
}
