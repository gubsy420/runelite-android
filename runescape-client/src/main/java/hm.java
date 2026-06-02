import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;
import net.runelite.api.events.PostAnimation;

@ObfuscatedName("hm")
public class hm {
	@ObfuscatedGetter(
		longValue = -3411117556647375765L
	)
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	public long aw_fld = 156454735285780413L;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int al_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int az_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ak_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ae_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int av_fld;
	@ObfuscatedGetter(
		longValue = -1682551826835208773L
	)
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	long ah_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lno;"
	)
	no ay_fld = new no();
	@ObfuscatedGetter(
		intValue = -228100845
	)
	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bb_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ag_fld;
	@ObfuscatedGetter(
		intValue = 331481291
	)
	@ObfuscatedName("oa")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int oa_fld;

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lib;)V"
	)
	public void ah(ib var1) {
		if (var1.hc_fld == this.ah_fld && this.aw_fld == var1.ag_fld) {
			for (ho var2 = (ho)this.ay_fld.ah(); null != var2; var2 = (ho)this.ay_fld.ay()) {
				var2.ag(var1, (byte)97);
			}

			var1.ag_fld++;
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	void ak(xi var1, int var2) {
		this.ah_fld = xi.ob(var1, 703249075);
		this.aw_fld = xi.ob(var1, 1195921260);

		for (int var3 = var1.cg(); var3 != 0; var3 = var1.cg()) {
			if (var2 != 65280) {
				return;
			}

			Object var4;
			if (1 == var3) {
				var4 = new hy(this);
			} else if (4 == var3) {
				var4 = new iv(this);
			} else if (3 == var3) {
				var4 = new ic(this);
			} else if (var3 == 2) {
				if (var2 != 65280) {
					return;
				}

				var4 = new iy(this);
			} else {
				if (var3 != 5) {
					throw new RuntimeException("");
				}

				var4 = new hz(this);
			}

			((ho)var4).ak(var1, 142218418);
			this.ay_fld.az((vw)var4);
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lib;B)V"
	)
	public void ag(ib var1, byte var2) {
		if (var1.hc_fld == this.ah_fld) {
			if (var2 >= 16) {
				return;
			}

			if (this.aw_fld == var1.ag_fld) {
				for (ho var3 = (ho)this.ay_fld.ah(); null != var3; var3 = (ho)this.ay_fld.ay()) {
					var3.ag(var1, (byte)74);
				}

				var1.ag_fld++;
				return;
			}
		}

		throw new RuntimeException("");
	}

	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		descriptor = "(Lhm;Lxi;)V"
	)
	public static void hk(hm var0, xi var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ah_fld = xi.ob(var1, -1510627834);
		var0.aw_fld = xi.ob(var1, 685603954);

		for (int var2 = var1.cg(); var2 != 0; var2 = var1.cg()) {
			Object var3;
			if (1 == var2) {
				var3 = new hy(var0);
			} else if (4 == var2) {
				var3 = new iv(var0);
			} else if (3 == var2) {
				var3 = new ic(var0);
			} else if (var2 == 2) {
				var3 = new iy(var0);
			} else {
				if (var2 != 5) {
					throw new RuntimeException("");
				}

				var3 = new hz(var0);
			}

			((ho)var3).ak(var1, 142218418);
			var0.ay_fld.az((vw)var3);
		}
	}

	@ObfuscatedName("ex")
	@ObfuscatedSignature(
		descriptor = "(Ltv;I)I"
	)
	public static int ex(tv var0, int var1) throws EOFException {
		return var0.ak_fld.ak(var1, (byte)11);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lib;)V"
	)
	public void ay(ib var1) {
		if (var1.hc_fld == this.ah_fld && this.aw_fld == var1.ag_fld) {
			for (ho var2 = (ho)this.ay_fld.ah(); null != var2; var2 = (ho)this.ay_fld.ay()) {
				var2.ag(var1, (byte)21);
			}

			var1.ag_fld++;
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	void av(xi var1) {
		this.ah_fld = xi.ob(var1, 630697536);
		this.aw_fld = xi.ob(var1, -174172998);

		for (int var2 = var1.cg(); var2 != 0; var2 = var1.cg()) {
			Object var3;
			if (1 == var2) {
				var3 = new hy(this);
			} else if (4 == var2) {
				var3 = new iv(this);
			} else if (3 == var2) {
				var3 = new ic(this);
			} else if (var2 == 2) {
				var3 = new iy(this);
			} else {
				if (var2 != 5) {
					throw new RuntimeException("");
				}

				var3 = new hz(this);
			}

			((ho)var3).ak(var1, 142218418);
			this.ay_fld.az((vw)var3);
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int ag(int var0) {
		var0 = (var0 & 1431655765) + (var0 >>> 1 & 1431655765);
		var0 = (var0 & 858993459) + (var0 >>> 2 & 858993459);
		var0 = var0 + (var0 >>> 4) & 252645135;
		var0 += var0 >>> 8;
		var0 += var0 >>> 16;
		return var0 & 0xFF;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lib;)V"
	)
	public void aw(ib var1) {
		if (var1.hc_fld == this.ah_fld && this.aw_fld == var1.ag_fld) {
			for (ho var2 = (ho)this.ay_fld.ah(); null != var2; var2 = (ho)this.ay_fld.ay()) {
				var2.ag(var1, (byte)46);
			}

			var1.ag_fld++;
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lib;)V"
	)
	public void ae(ib var1) {
		if (var1.hc_fld == this.ah_fld && this.aw_fld == var1.ag_fld) {
			for (ho var2 = (ho)this.ay_fld.ah(); null != var2; var2 = (ho)this.ay_fld.ay()) {
				var2.ag(var1, (byte)62);
			}

			var1.ag_fld++;
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Lol;"
	)
	public static ol ak(int var0) throws EOFException {
		synchronized (ol.aj_fld) {
			int var6 = -1965612026;
			ol var7 = (ol)ol.aj_fld.ak(var0);
			ol var10000;
			if (var7 != null) {
				var10000 = var7;
			} else {
				byte[] var8 = ln.ab_fld.bb(12, var0, 584982574);
				var7 = new ol();
				var7.bq_fld = var0;
				if (null != var8) {
					var7.bi(new xi(var8), 692305388);
				}

				var7.ay((byte)1);
				ol.aj_fld.az(var7, var0);
				var10000 = var7;
			}

			ol var3 = var10000;
			if (var3.yl_fld == -1) {
				var3.yl_fld = var0;
				og.ci_fld.getCallbacks().post(new PostAnimation(var3));
			}

			return var3;
		}
	}

	public hm(xi var1) {
		this.ak(var1, 65280);
	}
}
