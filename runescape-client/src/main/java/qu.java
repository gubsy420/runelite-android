import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("qu")
public class qu implements Comparable {
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "D"
	)
	static double as_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/Object;"
	)
	Object ak_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	@ObfuscatedGetter(
		longValue = 8364213495947033741L
	)
	long av_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/Object;"
	)
	Object ag_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	@ObfuscatedGetter(
		longValue = 186030586311553579L
	)
	long az_fld;

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lqu;)I"
	)
	int az(qu var1) {
		if (this.az_fld < var1.az_fld) {
			return -1;
		} else {
			return this.az_fld > var1.az_fld ? 1 : 0;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lqu;I)I"
	)
	int ak(qu var1, int var2) {
		if (this.az_fld < var1.az_fld) {
			return -1;
		} else {
			return this.az_fld > var1.az_fld ? 1 : 0;
		}
	}

	@ObfuscatedName("equals")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	@Export("equals")
	@Override
	public boolean equals(Object var1) {
		if (var1 instanceof qu) {
			return this.ak_fld.equals(((qu)var1).ak_fld);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)I"
	)
	public int ae(Object var1) {
		return this.ak((qu)var1, 1460541114);
	}

	@ObfuscatedName("compareTo")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)I"
	)
	@Export("compareTo")
	@Override
	public int compareTo(Object var1) {
		return this.ak((qu)var1, -950335459);
	}

	@ObfuscatedName("jg")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	public boolean jg(Object var1) {
		if (var1 instanceof qu) {
			return this.ak_fld.equals(((qu)var1).ak_fld);
		} else {
			throw new IllegalArgumentException();
		}
	}

	qu(Object var1, Object var2) {
		this.ag_fld = var1;
		this.ak_fld = var2;
	}

	@ObfuscatedName("jm")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	public boolean jm(Object var1) {
		if (var1 instanceof qu) {
			return this.ak_fld.equals(((qu)var1).ak_fld);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("hashCode")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("hashCode")
	@Override
	public int hashCode() {
		return this.ak_fld.hashCode();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lqu;)I"
	)
	int ag(qu var1) {
		if (this.az_fld < var1.az_fld) {
			return -1;
		} else {
			return this.az_fld > var1.az_fld ? 1 : 0;
		}
	}

	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	public boolean jt(Object var1) {
		if (var1 instanceof qu) {
			return this.ak_fld.equals(((qu)var1).ak_fld);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lqu;)I"
	)
	int av(qu var1) {
		if (this.az_fld < var1.az_fld) {
			return -1;
		} else {
			return this.az_fld > var1.az_fld ? 1 : 0;
		}
	}

	@ObfuscatedName("afc")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int afc() {
		return this.ak_fld.hashCode();
	}

	@ObfuscatedName("afm")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int afm() {
		return this.ak_fld.hashCode();
	}

	@ObfuscatedName("eh")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	static void eh() {
		client.nr_fld.ot_fld = 0;
		client.nr_fld.dr(-1);
		client.ng_fld = false;
	}
}
