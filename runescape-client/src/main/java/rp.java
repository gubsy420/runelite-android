import java.util.Arrays;
import net.runelite.api.Friend;
import net.runelite.api.Nameable;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("rp")
@Implements({"Friend"})
public class rp extends rr implements Friend {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean ak_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean ag_fld;

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lrl;I)I"
	)
	@Override
	public int ad(rl var1, int var2) {
		return this.ak((rp)var1, 2100732651);
	}

	@ObfuscatedName("mg")
	@ObfuscatedSignature(
		descriptor = "(Llu;[Ljava/lang/Object;)[Ljava/lang/Object;"
	)
	public static Object[] mg(lu var0, Object[] var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return (Object[])(null != var1 ? Arrays.copyOf((Object[])var1, var1.length) : null);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lrp;I)I"
	)
	int ak(rp var1, int var2) {
		if (client.ch_fld == this.ae_fld && client.ch_fld != var1.ae_fld) {
			return -1;
		} else if (client.ch_fld == var1.ae_fld && this.ae_fld != client.ch_fld) {
			return 1;
		} else if (0 != this.ae_fld && 0 == var1.ae_fld) {
			return -1;
		} else if (0 != var1.ae_fld && 0 == this.ae_fld) {
			return 1;
		} else if (this.ak_fld && !var1.ak_fld) {
			return -1;
		} else if (!this.ak_fld && var1.ak_fld) {
			return 1;
		} else if (this.ag_fld && !var1.ag_fld) {
			return -1;
		} else if (!this.ag_fld && var1.ag_fld) {
			return 1;
		} else {
			return this.ae_fld != 0 ? this.ah_fld - var1.ah_fld : var1.ah_fld - this.ah_fld;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lrl;)I"
	)
	@Override
	public int ao(rl var1) {
		return this.ak((rp)var1, 2025484845);
	}

	@ObfuscatedName("compareTo")
	@ObfuscatedSignature(
		descriptor = "(Lnet/runelite/api/Nameable;)I"
	)
	@Override
	public int compareTo(Nameable var1) {
		return this.ak((rp)var1, 1796241280);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)I"
	)
	@Override
	public int ae(Object var1) {
		return this.ak((rp)var1, 1747532934);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lrl;)I"
	)
	@Override
	public int ab(rl var1) {
		return this.ak((rp)var1, 1505505628);
	}

	rp() {
	}
}
