import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;
import net.runelite.api.events.PostAnimation;

@ObfuscatedName("hm")
public class hm {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	@ObfuscatedGetter(
		longValue = -3411117556647375765L
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
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	@ObfuscatedGetter(
		longValue = -1682551826835208773L
	)
	long ah_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lno;"
	)
	no ay_fld = new no();
	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -228100845
	)
	static int bb_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ag_fld;
	@ObfuscatedName("oa")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 331481291
	)
	static int oa_fld;

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lib;)V"
	)
	public void ah(ib var1) {
		if (var1.hc_long == this.ah_fld && this.aw_fld == var1.ag_fld) {
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
		this.ah_fld = var1.cu();
		this.aw_fld = var1.cu();

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
			no.dx(this.ay_fld, (vw)var4);
		}
	}

	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		descriptor = "(Lhm;Lib;)V"
	)
	public static void hj(hm var0, ib var1) {
		if (var1.hc_long == var0.ah_fld && var0.aw_fld == var1.ag_fld) {
			for (ho var2 = (ho)var0.ay_fld.ah(); null != var2; var2 = (ho)var0.ay_fld.ay()) {
				var2.ag(var1, (byte)62);
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
		if (var1.hc_long == this.ah_fld && this.aw_fld == var1.ag_fld) {
			for (ho var2 = (ho)this.ay_fld.ah(); null != var2; var2 = (ho)this.ay_fld.ay()) {
				var2.ag(var1, (byte)21);
			}

			var1.ag_fld++;
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("nk")
	@ObfuscatedSignature(
		descriptor = "(Lhm;Lxi;)V"
	)
	public static void nk(hm var0, xi var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ah_fld = var1.cu();
		var0.aw_fld = var1.cu();

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
			no.dx(var0.ay_fld, (vw)var3);
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	void av(xi var1) {
		this.ah_fld = var1.cu();
		this.aw_fld = var1.cu();

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
			no.dx(this.ay_fld, (vw)var3);
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IB)I"
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
		if (var1.hc_long == this.ah_fld && this.aw_fld == var1.ag_fld) {
			for (ho var2 = (ho)this.ay_fld.ah(); null != var2; var2 = (ho)this.ay_fld.ay()) {
				var2.ag(var1, (byte)46);
			}

			var1.ag_fld++;
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("yy")
	@ObfuscatedSignature(
		descriptor = "(Lhm;Lib;B)V"
	)
	public static void yy(hm var0, ib var1, byte var2) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var1.hc_long == var0.ah_fld) {
			if (var2 >= 16) {
				return;
			}

			if (var0.aw_fld == var1.ag_fld) {
				for (ho var3 = (ho)var0.ay_fld.ah(); null != var3; var3 = (ho)var0.ay_fld.ay()) {
					var3.ag(var1, (byte)74);
				}

				var1.ag_fld++;
				return;
			}
		}

		throw new RuntimeException("");
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)Lol;"
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
					var7.ah(new xi(var8), 692305388);
				}

				var7.ay((byte)1);
				ol.aj_fld.az(var7, var0);
				var10000 = var7;
			}

			ol var3 = var10000;
			if (var3.gt_fld == -1) {
				var3.gt_fld = var0;
				og.ci_fld.getCallbacks().post(new PostAnimation(var3));
			}

			return var3;
		}
	}

	public hm(xi var1) {
		this.ak(var1, 65280);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lib;B)V"
	)
	public void ag(ib var1, byte var2) {
		if (var1.hc_long == this.ah_fld) {
			if (var2 >= 16) {
				return;
			}

			if (this.aw_fld == var1.ag_fld) {
				for (ho var3 = (ho)this.ay_fld.be(); null != var3; var3 = (ho)this.ay_fld.be()) {
					var3.ag(var1, (byte)74);
				}

				var1.ag_fld++;
				return;
			}
		}

		throw new RuntimeException("");
	}
}
