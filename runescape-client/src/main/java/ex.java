import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("ex")
public class ex extends rz {
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ba_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean ak_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int av_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	public static ub ah_fld;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int bd_fld;

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	public int aw(Object var1, Object var2) {
		return ew(this, (rr)var1, (rr)var2, (byte)-117);
	}

	@ObfuscatedName("ew")
	@ObfuscatedSignature(
		descriptor = "(Lex;Lrr;Lrr;B)I"
	)
	public static int ew(ex var0, rr var1, rr var2, byte var3) {
		if (var0 == null) {
			var0.getClass();
		}

		if (client.ch_fld == var1.ae_fld && client.ch_fld == var2.ae_fld) {
			return var0.ak_fld ? var1.ap(-1939318074).av(var2.ap(-1939318074), -619175009) : var2.ap(-1939318074).av(var1.ap(-1939318074), 565107741);
		} else {
			return var0.as(var1, var2, 1759894981);
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lrr;Lrr;)I"
	)
	int ag(rr var1, rr var2) {
		if (client.ch_fld == var1.ae_fld && client.ch_fld == var2.ae_fld) {
			return this.ak_fld ? var1.ap(-1939318074).av(var2.ap(-1939318074), 1237448800) : var2.ap(-1939318074).av(var1.ap(-1939318074), -2020711341);
		} else {
			return this.as(var1, var2, 2046809840);
		}
	}

	@ObfuscatedName("compare")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	@Override
	public int compare(Object var1, Object var2) {
		return ew(this, (rr)var1, (rr)var2, (byte)-76);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	public int ah(Object var1, Object var2) {
		return ew(this, (rr)var1, (rr)var2, (byte)-27);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ltu;)Ltu;"
	)
	public static final tu ag(tu var0) {
		tu var2;
		synchronized (tu.ae_fld) {
			if (0 == tu.aw_fld) {
				var2 = new tu();
			} else {
				tu.ae_fld[(tu.aw_fld -= 1568129921) * 234126465].as();
				var2 = tu.ae_fld[tu.aw_fld];
			}
		}

		float var4 = 1.0F / var0.aq();
		var2.ay_fld = var0.ay_fld * var4;
		var2.as_fld = var4 * var0.as_fld;
		var2.ar_fld = var4 * var0.ar_fld;
		return var2;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	public int ae(Object var1, Object var2) {
		return ew(this, (rr)var1, (rr)var2, (byte)-65);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lrr;Lrr;)I"
	)
	int az(rr var1, rr var2) {
		if (client.ch_fld == var1.ae_fld && client.ch_fld == var2.ae_fld) {
			return this.ak_fld ? var1.ap(-1939318074).av(var2.ap(-1939318074), 361249080) : var2.ap(-1939318074).av(var1.ap(-1939318074), -988864735);
		} else {
			return this.as(var1, var2, 265671274);
		}
	}

	public ex(boolean var1) {
		this.ak_fld = var1;
	}

	@ObfuscatedName("tp")
	@ObfuscatedSignature(
		descriptor = "(Lvr;II)I"
	)
	public static int tp(vr var0, int var1, int var2) {
		return var0.ak_fld[var1][var2];
	}

	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	static boolean dc() {
		return (client.ez_fld & 2) != 0;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lrr;Lrr;B)I"
	)
	int ak(rr var1, rr var2, byte var3) {
		if (client.ek_fld == var1.ae_fld && client.aw_fld == var2.aw_fld) {
			return this.ak_fld ? var1.ap(-1939318074).av(var2.ap(-1939318074), -619175009) : var2.ap(-1939318074).av(var1.ap(-1939318074), 565107741);
		} else {
			return this.as(var1, var2, 1759894981);
		}
	}
}
