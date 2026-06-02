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
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/Object;"
	)
	Object ag_fld;
	@ObfuscatedGetter(
		longValue = 8364213495947033741L
	)
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	long az_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/Object;"
	)
	Object ak_fld;
	@ObfuscatedGetter(
		longValue = 186030586311553579L
	)
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	long av_fld;

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lqu;I)I"
	)
	int ak(qu var1, int var2) {
		if (this.av_fld < var1.av_fld) {
			return -1;
		} else {
			return this.av_fld > var1.av_fld ? 1 : 0;
		}
	}

	@ObfuscatedName("ra")
	@ObfuscatedSignature(
		descriptor = "(Lqu;Lqu;)I"
	)
	public static int ra(qu var0, qu var1) {
		if (var0.av_fld < var1.av_fld) {
			return -1;
		} else {
			return var0.av_fld > var1.av_fld ? 1 : 0;
		}
	}

	@ObfuscatedName("vz")
	@ObfuscatedSignature(
		descriptor = "(Lqu;Ljava/lang/Object;)Z"
	)
	public static boolean vz(qu var0, Object var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else if (var1 instanceof qu) {
			return var0.ag_fld.equals(((qu)var1).ag_fld);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("pf")
	@ObfuscatedSignature(
		descriptor = "(Lyb;Llu;)Lyb;"
	)
	public static yb pf(yb var0, lu var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.az_fld = var1;
		return var0;
	}

	@ObfuscatedName("equals")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	@Override
	public boolean equals(Object var1) {
		if (var1 instanceof qu) {
			return this.ag_fld.equals(((qu)var1).ag_fld);
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
	@Override
	public int compareTo(Object var1) {
		return this.ak((qu)var1, -950335459);
	}

	qu(Object var1, Object var2) {
		this.ak_fld = var1;
		this.ag_fld = var2;
	}

	@ObfuscatedName("jm")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	public boolean jm(Object var1) {
		if (var1 instanceof qu) {
			return this.ag_fld.equals(((qu)var1).ag_fld);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("hashCode")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int hashCode() {
		return this.ag_fld.hashCode();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lqu;)I"
	)
	int ag(qu var1) {
		if (this.av_fld < var1.av_fld) {
			return -1;
		} else {
			return this.av_fld > var1.av_fld ? 1 : 0;
		}
	}

	@ObfuscatedName("afa")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int afa() {
		return this.ag_fld.hashCode();
	}

	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	public boolean jt(Object var1) {
		if (var1 instanceof qu) {
			return this.ag_fld.equals(((qu)var1).ag_fld);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lqu;)I"
	)
	int av(qu var1) {
		if (this.av_fld < var1.av_fld) {
			return -1;
		} else {
			return this.av_fld > var1.av_fld ? 1 : 0;
		}
	}

	@ObfuscatedName("afc")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int afc() {
		return this.ag_fld.hashCode();
	}

	@ObfuscatedName("afm")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int afm() {
		return this.ag_fld.hashCode();
	}

	@ObfuscatedName("eh")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	static void eh() {
		client.nr_fld.ag_fld = 0;
		client.nr_fld.yf(-1);
		client.ng_fld = false;
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
}
