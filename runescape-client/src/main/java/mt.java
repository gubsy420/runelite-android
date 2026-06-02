import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("mt")
public class mt extends mf {
	@ObfuscatedName("fg")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	public long fg_fld;
	@ObfuscatedName("nt")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public static boolean nt_fld;
	@ObfuscatedName("rg")
	@ObfuscatedSignature(
		descriptor = "D"
	)
	public static double rg_fld;
	@ObfuscatedName("pg")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	public long pg_fld;
	@ObfuscatedGetter(
		longValue = 472907172249662241L
	)
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	long ak_fld = System.nanoTime();

	@ObfuscatedName("lc")
	@ObfuscatedSignature(
		descriptor = "(Lmw;I)V"
	)
	public static void lc(mw var0, int var1) {
		int var2 = var0.aw_fld.dd();
		var0.as_fld[var1] = var0.as_fld[var1] + var2;
	}

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

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(J)V"
	)
	public static void ct(long var0) {
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
		return client.im_fld && client.cl_fld >= 25 ? this.uk(var1, var2) : this.rw(var1, var2);
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

	@ObfuscatedName("uk")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	public int uk(int var1, int var2) {
		long var3 = System.nanoTime();
		nt_fld = true;
		if (client.ua_fld > 0L) {
			long var5 = this.ak_fld - var3;
			long var7 = this.fg_fld - var3;
			long var9 = Math.min(var5, var7);
			var9 /= 1000000L;
			ct(var9);
			var3 = System.nanoTime();
			if (var3 < this.ak_fld && var5 > var7) {
				nt_fld = false;
			} else {
				this.ak_fld = this.ak_fld * 472907172249662241L + client.ua_fld;
				if (this.ak_fld < var3) {
					this.ak_fld = var3;
				}
			}
		}

		long var11 = 1000000L * var1;

		int var12;
		for (var12 = 0; var12 < 10 && (var12 < 1 && !nt_fld || this.fg_fld < var3); this.fg_fld += var11) {
			var12++;
			this.pg_fld = this.fg_fld;
		}

		if (this.fg_fld < var3) {
			this.fg_fld = var3;
		}

		rg_fld = (double)Math.min(var3 - this.pg_fld, var11) / var11;
		return var12;
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

	@ObfuscatedName("rw")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	public int rw(int var1, int var2) {
		long var3 = 1000000L * var2;
		long var5 = this.ak_fld - System.nanoTime();
		if (var5 < var3) {
			var5 = var3;
		}

		ct(var5 / 1000000L);
		long var7 = System.nanoTime();
		int var9 = 0;

		while (var9 < 10 && (var9 < 1 || this.ak_fld < var7)) {
			var9++;
			this.ak_fld = this.ak_fld * 472907172249662241L + var1 * 1000000L;
		}

		if (this.ak_fld < var7) {
			this.ak_fld = var7;
		}

		nt_fld = true;
		return var9;
	}

	@ObfuscatedName("nv")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	@Override
	public int nv(int var1, int var2) {
		return this.ag(var1, var2, 1099094056);
	}
}
