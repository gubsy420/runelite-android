import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("aaq")
public class aaq {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/Object;"
	)
	public Object ag_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1044988307
	)
	public int ak_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ah_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	static String ay_fld;

	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	public boolean jt(Object var1) {
		if (!(var1 instanceof aaq)) {
			return false;
		} else {
			aaq var2 = (aaq)var1;
			if (null == var2.ag_fld && null != this.ag_fld) {
				return false;
			} else {
				return this.ag_fld == null && null != var2.ag_fld ? false : var2.ak_fld == this.ak_fld && var2.ag_fld.equals(this.ag_fld);
			}
		}
	}

	public aaq(int var1) {
		this.ak_fld = var1;
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

	@ObfuscatedName("equals")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	@Export("equals")
	@Override
	public boolean equals(Object var1) {
		if (!(var1 instanceof aaq)) {
			return false;
		} else {
			aaq var2 = (aaq)var1;
			if (null == var2.ag_fld && null != this.ag_fld) {
				return false;
			} else {
				return this.ag_fld == null && null != var2.ag_fld ? false : var2.ak_fld == this.ak_fld && var2.ag_fld.equals(this.ag_fld);
			}
		}
	}

	@ObfuscatedName("jg")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	public boolean jg(Object var1) {
		if (!(var1 instanceof aaq)) {
			return false;
		} else {
			aaq var2 = (aaq)var1;
			if (null == var2.ag_fld && null != this.ag_fld) {
				return false;
			} else {
				return this.ag_fld == null && null != var2.ag_fld ? false : var2.ak_fld == this.ak_fld && var2.ag_fld.equals(this.ag_fld);
			}
		}
	}

	@ObfuscatedName("zf")
	@ObfuscatedSignature(
		descriptor = "(Laaq;)I"
	)
	public static int zf(aaq var0) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.hashCode();
	}

	@ObfuscatedName("jm")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	public boolean jm(Object var1) {
		if (!(var1 instanceof aaq)) {
			return false;
		} else {
			aaq var2 = (aaq)var1;
			if (null == var2.ag_fld && null != this.ag_fld) {
				return false;
			} else {
				return this.ag_fld == null && null != var2.ag_fld ? false : var2.ak_fld == this.ak_fld && var2.ag_fld.equals(this.ag_fld);
			}
		}
	}

	@ObfuscatedName("lx")
	@ObfuscatedSignature(
		descriptor = "(Lws;)Z"
	)
	public static boolean lx(ws var0) {
		return var0.ay_fld;
	}

	public aaq(int var1, Object var2) {
		this.ak_fld = var1;
		this.ag_fld = var2;
	}

	@ObfuscatedName("afm")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int afm() {
		return super.hashCode();
	}

	@ObfuscatedName("afa")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int afa() {
		return super.hashCode();
	}
}
