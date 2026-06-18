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

	@ObfuscatedName("vm")
	@ObfuscatedSignature(
		descriptor = "(Lco;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V"
	)
	public static void vm(co var0, int var1, String var2, String var3, String var4) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.ak_fld = ky.ak();
			var0.ag_fld = 341995813 * client.dv_fld;
			var0.az_fld = var1;
			var0.av_fld = var2;
			var0.ay(2081435723);
			var0.ah_fld = var3;
			var0.aw_fld = var4;
			var0.ag(-114594914);
			var0.ae(-1099576155);
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	public int ah(Object var1, Object var2) {
		return ga(this, (rr)var1, (rr)var2, (byte)-117);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lrr;Lrr;)I"
	)
	int az(rr var1, rr var2) {
		if (client.ch_fld == var1.ae_fld && client.ch_fld == var2.ae_fld) {
			return this.ak_fld ? var1.ap(-1939318074).av(var2.ap(-1939318074), 1237448800) : var2.ap(-1939318074).av(var1.ap(-1939318074), -2020711341);
		} else {
			return this.as(var1, var2, 2046809840);
		}
	}

	@ObfuscatedName("nj")
	@ObfuscatedSignature(
		descriptor = "(Lex;Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	public static int nj(ex var0, Object var1, Object var2) {
		if (var0 == null) {
			var0.getClass();
		}

		return ga(var0, (rr)var1, (rr)var2, (byte)-27);
	}

	@ObfuscatedName("compare")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	@Override
	public int compare(Object var1, Object var2) {
		return ga(this, (rr)var1, (rr)var2, (byte)-76);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ltu;I)Ltu;"
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

		float var4 = 1.0F / tu.ml(var0, (byte)-101);
		var2.ar_fld = var0.ar_fld * var4;
		var2.ay_fld = var4 * var0.ay_fld;
		var2.as_fld = var4 * var0.as_fld;
		return var2;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	public int aw(Object var1, Object var2) {
		return ga(this, (rr)var1, (rr)var2, (byte)-65);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lrr;Lrr;)I"
	)
	int ag(rr var1, rr var2) {
		if (client.ch_fld == var1.ae_fld && client.ch_fld == var2.ae_fld) {
			return this.ak_fld ? var1.ap(-1939318074).av(var2.ap(-1939318074), 361249080) : var2.ap(-1939318074).av(var1.ap(-1939318074), -988864735);
		} else {
			return this.as(var1, var2, 265671274);
		}
	}

	@ObfuscatedName("ga")
	@ObfuscatedSignature(
		descriptor = "(Lex;Lrr;Lrr;B)I"
	)
	public static int ga(ex var0, rr var1, rr var2, byte var3) {
		if (var0 == null) {
			throw new NullPointerException();
		} else if (client.ch_fld == var1.ae_fld && client.ch_fld == var2.ae_fld) {
			return var0.ak_fld ? var1.ap(-1939318074).av(var2.ap(-1939318074), -619175009) : var2.ap(-1939318074).av(var1.ap(-1939318074), 565107741);
		} else {
			return var0.as(var1, var2, 1759894981);
		}
	}

	public ex(boolean var1) {
		this.ak_fld = var1;
	}

	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "(B)Z"
	)
	static boolean dc() {
		return (client.ez_fld & 2) != 0;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lrr;Lrr;B)I"
	)
	int ak(rr var1, rr var2, byte var3) {
		if (client.tl_fld == var1.ae_fld && client.zj_fld == var2.ae_fld) {
			return this.ak_fld ? var1.ap(-1939318074).av(var2.ap(-1939318074), -619175009) : var2.ap(-1939318074).av(var1.ap(-1939318074), 565107741);
		} else {
			return this.as(var1, var2, 1759894981);
		}
	}
}
