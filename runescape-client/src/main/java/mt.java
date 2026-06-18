import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("mt")
public class mt extends mf {
	@ObfuscatedName("vp")
	@ObfuscatedSignature(
		descriptor = "D"
	)
	public static double vp_fld;
	@ObfuscatedName("zm")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	public long zm_fld;
	@ObfuscatedName("lb")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	public long lb_fld;
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public static boolean bo_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	@ObfuscatedGetter(
		longValue = 472907172249662241L
	)
	long ak_fld = System.nanoTime();

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	@Override
	public int ah(int var1, int var2) {
		long var3 = var2 * 1000000L;
		long var5 = this.ak_fld - System.nanoTime();
		if (var5 < var3) {
			var5 = var3;
		}

		dg.ak(var5 / 1000000L);
		long var7 = System.nanoTime();
		int var9 = 0;

		while (var9 < 10 && (var9 < 1 || this.ak_fld < var7)) {
			var9++;
			this.ak_fld += var1 * 1992649645253016128L;
		}

		if (this.ak_fld < var7) {
			this.ak_fld = var7;
		}

		return var9;
	}

	@ObfuscatedName("eu")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	public int eu(int var1, int var2) {
		long var3 = System.nanoTime();
		bo_fld = true;
		if (client.cg_fld > 0L) {
			long var5 = this.ak_fld - var3;
			long var7 = this.zm_fld - var3;
			long var9 = Math.min(var5, var7);
			var9 /= 1000000L;
			ib(var9);
			var3 = System.nanoTime();
			if (var3 < this.ak_fld && var5 > var7) {
				bo_fld = false;
			} else {
				this.ak_fld = this.ak_fld * 472907172249662241L + client.cg_fld;
				if (this.ak_fld < var3) {
					this.ak_fld = var3;
				}
			}
		}

		long var11 = 1000000L * var1;

		int var12;
		for (var12 = 0; var12 < 10 && (var12 < 1 && !bo_fld || this.zm_fld < var3); this.zm_fld += var11) {
			var12++;
			this.lb_fld = this.zm_fld;
		}

		if (this.zm_fld < var3) {
			this.zm_fld = var3;
		}

		vp_fld = (double)Math.min(var3 - this.lb_fld, var11) / var11;
		return var12;
	}

	@ObfuscatedName("ib")
	@ObfuscatedSignature(
		descriptor = "(J)V"
	)
	public static void ib(long var0) {
		if (var0 > 0L) {
			if (var0 % 10L == 0L) {
				try {
					Thread.sleep(var0 - 1L);
				} catch (InterruptedException var5) {
				}

				try {
					Thread.sleep(1L);
				} catch (InterruptedException var4) {
				}
			} else {
				try {
					Thread.sleep(var0);
				} catch (InterruptedException var3) {
				}
			}
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	@Override
	public void ak(byte var1) {
		this.ak_fld = System.nanoTime();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(III)I"
	)
	@Override
	public int ag(int var1, int var2, int var3) {
		return client.vv_boolean && client.cl_fld >= 25 ? this.eu(var1, var2) : this.ye(var1, var2);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	@Override
	public int ay(int var1, int var2) {
		long var3 = var2 * 1000000L;
		long var5 = this.ak_fld - System.nanoTime();
		if (var5 < var3) {
			var5 = var3;
		}

		dg.ak(var5 / 1000000L);
		long var7 = System.nanoTime();
		int var9 = 0;

		while (var9 < 10 && (var9 < 1 || this.ak_fld < var7)) {
			var9++;
			this.ak_fld += var1 * 1992649645253016128L;
		}

		if (this.ak_fld < var7) {
			this.ak_fld = var7;
		}

		return var9;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Override
	public void ae() {
		this.ak_fld = System.nanoTime();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Override
	public void av() {
		this.ak_fld = System.nanoTime();
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Override
	public void az() {
		this.ak_fld = System.nanoTime();
	}

	@ObfuscatedName("ye")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	public int ye(int var1, int var2) {
		long var3 = 1000000L * var2;
		long var5 = this.ak_fld - System.nanoTime();
		if (var5 < var3) {
			var5 = var3;
		}

		ib(var5 / 1000000L);
		long var7 = System.nanoTime();
		int var9 = 0;

		while (var9 < 10 && (var9 < 1 || this.ak_fld < var7)) {
			var9++;
			this.ak_fld = this.ak_fld * 472907172249662241L + var1 * 1000000L;
		}

		if (this.ak_fld < var7) {
			this.ak_fld = var7;
		}

		bo_fld = true;
		return var9;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	@Override
	public int aw(int var1, int var2) {
		long var3 = var2 * 1000000L;
		long var5 = this.ak_fld - System.nanoTime();
		if (var5 < var3) {
			var5 = var3;
		}

		dg.ak(var5 / 1000000L);
		long var7 = System.nanoTime();
		int var9 = 0;

		while (var9 < 10 && (var9 < 1 || this.ak_fld < var7)) {
			var9++;
			this.ak_fld += var1 * 1992649645253016128L;
		}

		if (this.ak_fld < var7) {
			this.ak_fld = var7;
		}

		return var9;
	}

	mt() {
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	@Override
	public int as(int var1, int var2) {
		long var3 = var2 * 1000000L;
		long var5 = this.ak_fld - System.nanoTime();
		if (var5 < var3) {
			var5 = var3;
		}

		dg.ak(var5 / 1000000L);
		long var7 = System.nanoTime();
		int var9 = 0;

		while (var9 < 10 && (var9 < 1 || this.ak_fld < var7)) {
			var9++;
			this.ak_fld += var1 * 1992649645253016128L;
		}

		if (this.ak_fld < var7) {
			this.ak_fld = var7;
		}

		return var9;
	}

	@ObfuscatedName("ph")
	@ObfuscatedSignature(
		descriptor = "(Lac;)V"
	)
	public static void ph(ac var0) {
		var0.ae_fld = var0.az_fld;
		var0.ah_fld = ac.ak(var0.az_fld, var0.av_fld);
		var0.aw_fld = ac.ag(var0.az_fld, var0.av_fld);
	}

	@ObfuscatedName("me")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	@Override
	public int me(int var1, int var2) {
		return this.ag(var1, var2, 1099094056);
	}
}
