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
	@ObfuscatedGetter(
		intValue = -1044988307
	)
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
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

	public aaq(int var1) {
		this.ak_fld = var1;
	}

	@ObfuscatedName("hashCode")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@ObfuscatedName("sv")
	@ObfuscatedSignature(
		descriptor = "(Laaq;)I"
	)
	public static int sv(aaq var0) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.hashCode();
		}
	}

	@ObfuscatedName("equals")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
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

	@ObfuscatedName("wk")
	@ObfuscatedSignature(
		descriptor = "(Laaq;Ljava/lang/Object;)Z"
	)
	public static boolean wk(aaq var0, Object var1) {
		if (var0 == null) {
			var0.getClass();
		}

		if (!(var1 instanceof aaq)) {
			return false;
		} else {
			aaq var2 = (aaq)var1;
			if (null == var2.ag_fld && null != var0.ag_fld) {
				return false;
			} else {
				return var0.ag_fld == null && null != var2.ag_fld ? false : var2.ak_fld == var0.ak_fld && var2.ag_fld.equals(var0.ag_fld);
			}
		}
	}

	@ObfuscatedName("afa")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int afa() {
		return super.hashCode();
	}
}
