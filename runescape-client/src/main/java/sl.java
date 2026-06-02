import java.util.Arrays;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("sl")
public class sl {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lyq;"
	)
	public yq ag_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] aw_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "[Ljava/lang/Object;"
	)
	public Object[] as_fld;
	@ObfuscatedGetter(
		intValue = 741408609
	)
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int av_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ak_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/Object;"
	)
	Object ah_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public boolean az_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "[J"
	)
	long[] ay_fld;
	@ObfuscatedGetter(
		intValue = 670939965
	)
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ae_fld;

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "()[J"
	)
	final long[] aq() {
		return this.ay_fld;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "()[J"
	)
	final long[] ao() {
		return this.ay_fld;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()[Ljava/lang/Object;"
	)
	public final Object[] az() {
		return (Object[])this.as_fld;
	}

	public sl(yq var1, Object var2, int var3, int var4) {
		this.az_fld = true;
		this.ag_fld = var1;
		this.ae_fld = var4;
		this.ah_fld = var2;
		if (yq.ak_fld == var1) {
			this.aw_fld = new int[var4];
		} else if (var1 == yq.ag_fld) {
			this.ay_fld = new long[var4];
		} else if (yq.az_fld == var1) {
			this.as_fld = new String[var4];
		}

		this.af(var3);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public final int av() {
		return this.av_fld;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/Object;"
	)
	final Object ae(int var1) {
		if (this.ag_fld == yq.ak_fld) {
			return this.aw_fld[var1];
		} else {
			return yq.ag_fld == this.ag_fld ? this.ay_fld[var1] : this.as_fld[var1];
		}
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void bt(int var1) {
		if (var1 != this.ae_fld) {
			this.ae_fld = var1;
			if (yq.ak_fld == this.ag_fld) {
				this.aw_fld = Arrays.copyOf(this.aw_fld, var1);
			} else if (this.ag_fld == yq.ag_fld) {
				this.ay_fld = Arrays.copyOf(this.ay_fld, var1);
			} else if (this.ag_fld == yq.az_fld) {
				this.as_fld = (Object[])Arrays.copyOf((Object[])this.as_fld, var1);
			}
		}
	}

	@ObfuscatedName("fa")
	@ObfuscatedSignature(
		descriptor = "(Lsl;ILjava/lang/Object;B)V"
	)
	public static void fa(sl var0, int var1, Object var2, byte var3) {
		if (var0 == null) {
			var0.getClass();
		} else {
			if (var0.ag_fld == yq.ak_fld) {
				var0.aw_fld[var1] = (Integer)var2;
			} else if (var0.ag_fld == yq.ag_fld) {
				var0.ay_fld[var1] = (Long)var2;
			} else {
				var0.as_fld[var1] = var2;
			}
		}
	}

	@ObfuscatedName("ys")
	@ObfuscatedSignature(
		descriptor = "(Lsl;Lxi;)V"
	)
	public static void ys(sl var0, xi var1) {
		var1.bw(var0.av_fld);
		if (var0.ag_fld == yq.ak_fld) {
			var1.bc(0);

			for (int var2 = 0; var2 < var0.av_fld; var2++) {
				xi.ld(var1, var0.aw_fld[var2], (byte)85);
			}
		} else if (var0.ag_fld == yq.ag_fld) {
			var1.bc(1);

			for (int var3 = 0; var3 < var0.av_fld; var3++) {
				var1.fn(var0.ay_fld[var3]);
			}
		} else if (yq.az_fld == var0.ag_fld) {
			var1.bc(2);

			for (int var4 = 0; var4 < var0.av_fld; var4++) {
				var1.cc((String)var0.as_fld[var4], 1874274423);
			}
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	final void ay(int var1, int var2) {
		if (!this.az_fld) {
			if (var2 == -210674912) {
				throw new RuntimeException();
			}
		} else {
			if (var1 >= 0) {
				if (var2 != -210674912) {
					return;
				}

				if (var1 <= 5000) {
					if (var1 > this.ae_fld) {
						this.ar(this.as(var1), (byte)-93);
					}

					return;
				}
			}

			throw new RuntimeException();
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	final void af(int var1) {
		int var3 = this.av_fld;
		this.av_fld = var1;
		if (var1 < var3) {
			if (yq.ak_fld == this.ag_fld) {
				Arrays.fill(this.aw_fld, var1, var3, 0);
			} else if (this.ag_fld == yq.ag_fld) {
				Arrays.fill(this.ay_fld, var1, var3, 0L);
			} else {
				Arrays.fill((Object[])this.as_fld, var1, var3, null);
			}
		} else if (var1 > var3) {
			if (this.ag_fld == yq.ak_fld) {
				int var4 = (Integer)this.ah_fld;
				if (0 != var4) {
					Arrays.fill(this.aw_fld, var3, var1, var4);
				}
			} else if (yq.ag_fld == this.ag_fld) {
				long var6 = (Long)this.ah_fld;
				if (0L != var6) {
					Arrays.fill(this.ay_fld, var3, var1, var6);
				}
			} else if (null != this.ah_fld) {
				Arrays.fill((Object[])this.as_fld, var3, var1, this.ah_fld);
			}
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IB)V"
	)
	void ar(int var1, byte var2) {
		if (var1 != this.ae_fld) {
			this.ae_fld = var1;
			if (yq.ak_fld == this.ag_fld) {
				this.aw_fld = Arrays.copyOf(this.aw_fld, var1);
			} else if (this.ag_fld == yq.ag_fld) {
				this.ay_fld = Arrays.copyOf(this.ay_fld, var1);
			} else if (this.ag_fld == yq.az_fld) {
				if (var2 >= 6) {
					return;
				}

				this.as_fld = (Object[])Arrays.copyOf((Object[])this.as_fld, var1);
			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public final void aw(int var1, int var2) {
		this.ay(var1, -210674912);
		this.af(var1);
	}

	@ObfuscatedName("hm")
	@ObfuscatedSignature(
		descriptor = "(Lsl;I)Ljava/lang/Object;"
	)
	public static Object hm(sl var0, int var1) {
		if (var0.ag_fld == yq.ak_fld) {
			return var0.aw_fld[var1];
		} else {
			return yq.ag_fld == var0.ag_fld ? var0.ay_fld[var1] : var0.as_fld[var1];
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	public void an(xi var1, int var2) {
		var1.bw(this.av_fld);
		if (this.ag_fld == yq.ak_fld) {
			var1.bc(0);

			for (int var3 = 0; var3 < this.av_fld; var3++) {
				xi.ld(var1, this.aw_fld[var3], (byte)81);
			}
		} else if (this.ag_fld == yq.ag_fld) {
			var1.bc(1);

			for (int var4 = 0; var4 < this.av_fld; var4++) {
				if (var2 <= -859273038) {
					return;
				}

				var1.fn(this.ay_fld[var4]);
			}
		} else if (yq.az_fld == this.ag_fld) {
			var1.bc(2);

			for (int var5 = 0; var5 < this.av_fld; var5++) {
				var1.cc((String)this.as_fld[var5], 356536621);
			}
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "()[I"
	)
	public final int[] ai() {
		return this.aw_fld;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "()[J"
	)
	final long[] am() {
		return this.ay_fld;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "()[J"
	)
	final long[] ad() {
		return this.ay_fld;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "()[Ljava/lang/Object;"
	)
	public final Object[] ab() {
		return (Object[])this.as_fld;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "()[Ljava/lang/Object;"
	)
	public final Object[] ap() {
		return (Object[])this.as_fld;
	}

	public sl(yq var1, boolean var2) {
		this.ag_fld = var1;
		this.az_fld = var2;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public final int bm() {
		return this.av_fld;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public final int bd() {
		return this.av_fld;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;)V"
	)
	final void bs(int var1, Object var2) {
		if (this.ag_fld == yq.ak_fld) {
			this.aw_fld[var1] = (Integer)var2;
		} else if (this.ag_fld == yq.ag_fld) {
			this.ay_fld[var1] = (Long)var2;
		} else {
			this.as_fld[var1] = var2;
		}
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public final void bh(int var1) {
		this.ay(var1, -210674912);
		this.af(var1);
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public final void bk(int var1) {
		this.ay(var1, -210674912);
		this.af(var1);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int as(int var1) {
		int var3 = (this.ae_fld >> 1) + this.ae_fld;
		return Math.max(var1, Math.min(var3, 5000));
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	final void bf(int var1) {
		if (!this.az_fld) {
			throw new RuntimeException();
		} else if (var1 >= 0 && var1 <= 5000) {
			if (var1 > this.ae_fld) {
				this.ar(this.as(var1), (byte)-28);
			}
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int bl(int var1) {
		int var2 = (this.ae_fld >> 1) + this.ae_fld;
		return Math.max(var1, Math.min(var2, 5000));
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void bx(int var1) {
		if (var1 != this.ae_fld) {
			this.ae_fld = var1;
			if (yq.ak_fld == this.ag_fld) {
				this.aw_fld = Arrays.copyOf(this.aw_fld, var1);
			} else if (this.ag_fld == yq.ag_fld) {
				this.ay_fld = Arrays.copyOf(this.ay_fld, var1);
			} else if (this.ag_fld == yq.az_fld) {
				this.as_fld = (Object[])Arrays.copyOf((Object[])this.as_fld, var1);
			}
		}
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void bp(int var1) {
		if (var1 != this.ae_fld) {
			this.ae_fld = var1;
			if (yq.ak_fld == this.ag_fld) {
				this.aw_fld = Arrays.copyOf(this.aw_fld, var1);
			} else if (this.ag_fld == yq.ag_fld) {
				this.ay_fld = Arrays.copyOf(this.ay_fld, var1);
			} else if (this.ag_fld == yq.az_fld) {
				this.as_fld = (Object[])Arrays.copyOf((Object[])this.as_fld, var1);
			}
		}
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void bv(int var1) {
		if (var1 != this.ae_fld) {
			this.ae_fld = var1;
			if (yq.ak_fld == this.ag_fld) {
				this.aw_fld = Arrays.copyOf(this.aw_fld, var1);
			} else if (this.ag_fld == yq.ag_fld) {
				this.ay_fld = Arrays.copyOf(this.ay_fld, var1);
			} else if (this.ag_fld == yq.az_fld) {
				this.as_fld = (Object[])Arrays.copyOf((Object[])this.as_fld, var1);
			}
		}
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	final void bi(int var1) {
		int var2 = this.av_fld;
		this.av_fld = var1;
		if (var1 < var2) {
			if (yq.ak_fld == this.ag_fld) {
				Arrays.fill(this.aw_fld, var1, var2, 0);
			} else if (this.ag_fld == yq.ag_fld) {
				Arrays.fill(this.ay_fld, var1, var2, 0L);
			} else {
				Arrays.fill((Object[])this.as_fld, var1, var2, null);
			}
		} else if (var1 > var2) {
			if (this.ag_fld == yq.ak_fld) {
				int var3 = (Integer)this.ah_fld;
				if (0 != var3) {
					Arrays.fill(this.aw_fld, var2, var1, var3);
				}
			} else if (yq.ag_fld == this.ag_fld) {
				long var5 = (Long)this.ah_fld;
				if (0L != var5) {
					Arrays.fill(this.ay_fld, var2, var1, var5);
				}
			} else if (null != this.ah_fld) {
				Arrays.fill((Object[])this.as_fld, var2, var1, this.ah_fld);
			}
		}
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "([I)Lsl;"
	)
	public static sl bu(int[] var0) {
		sl var1 = new sl(yq.ak_fld, true);
		var1.aw_fld = var0;
		var1.av_fld = -1049924334 * var0.length;
		var1.ae_fld = var0.length * 675639149;
		return var1;
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "([I)Lsl;"
	)
	public static sl bn(int[] var0) {
		sl var1 = new sl(yq.ak_fld, true);
		var1.aw_fld = var0;
		var1.av_fld = -1142836943 * var0.length;
		var1.ae_fld = var0.length;
		return var1;
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "([I)Lsl;"
	)
	public static sl bc(int[] var0) {
		sl var1 = new sl(yq.ak_fld, true);
		var1.aw_fld = var0;
		var1.av_fld = -69344095 * var0.length;
		var1.ae_fld = var0.length;
		return var1;
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "([I)Lsl;"
	)
	public static sl bw(int[] var0) {
		sl var1 = new sl(yq.ak_fld, false);
		var1.aw_fld = var0;
		var1.av_fld = var0.length;
		var1.ae_fld = var0.length;
		return var1;
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "([I)Lsl;"
	)
	public static sl ba(int[] var0) {
		sl var1 = new sl(yq.ak_fld, false);
		var1.aw_fld = var0;
		var1.av_fld = var0.length;
		var1.ae_fld = var0.length;
		return var1;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "([J)Lsl;"
	)
	public static sl bq(long[] var0) {
		sl var1 = new sl(yq.ag_fld, false);
		var1.ay_fld = var0;
		var1.av_fld = var0.length;
		var1.ae_fld = var0.length;
		return var1;
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "([J)Lsl;"
	)
	public static sl bg(long[] var0) {
		sl var1 = new sl(yq.ag_fld, false);
		var1.ay_fld = var0;
		var1.av_fld = var0.length;
		var1.ae_fld = var0.length;
		return var1;
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "([J)Lsl;"
	)
	public static sl bb(long[] var0) {
		sl var1 = new sl(yq.ag_fld, false);
		var1.ay_fld = var0;
		var1.av_fld = var0.length;
		var1.ae_fld = var0.length;
		return var1;
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "([J)Lsl;"
	)
	public static sl cd(long[] var0) {
		sl var1 = new sl(yq.ag_fld, false);
		var1.ay_fld = var0;
		var1.av_fld = var0.length;
		var1.ae_fld = var0.length;
		return var1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "()[I"
	)
	public final int[] ak() {
		return this.aw_fld;
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	public void cq(xi var1) {
		var1.bw(this.av_fld);
		if (this.ag_fld == yq.ak_fld) {
			var1.bc(0);

			for (int var2 = 0; var2 < this.av_fld; var2++) {
				xi.ld(var1, this.aw_fld[var2], (byte)89);
			}
		} else if (this.ag_fld == yq.ag_fld) {
			var1.bc(1);

			for (int var3 = 0; var3 < this.av_fld; var3++) {
				var1.fn(this.ay_fld[var3]);
			}
		} else if (yq.az_fld == this.ag_fld) {
			var1.bc(2);

			for (int var4 = 0; var4 < this.av_fld; var4++) {
				var1.cc((String)this.as_fld[var4], -811992562);
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()[J"
	)
	final long[] ag() {
		return this.ay_fld;
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)Lsl;"
	)
	public static sl cy(xi var0) {
		int var1 = xi.tx(var0, 466011079);
		if (var1 >= 0 && var1 <= 5000) {
			int var2 = var0.cg();
			if (var2 == 0) {
				int[] var7 = new int[var1];

				for (int var9 = 0; var9 < var1; var9++) {
					var7[var9] = var0.co();
				}

				return pm.au(var7);
			} else if (1 == var2) {
				long[] var6 = new long[var1];

				for (int var8 = 0; var8 < var1; var8++) {
					var6[var8] = xi.ob(var0, -259132993);
				}

				return wn.ax(var6);
			} else if (2 != var2) {
				throw new RuntimeException();
			} else {
				String[] var3 = new String[var1];

				for (int var4 = 0; var4 < var1; var4++) {
					var3[var4] = xi.kc(var0, -66212633);
				}

				sl var5 = new sl(yq.az_fld, false);
				var5.as_fld = var3;
				var5.av_fld = -69344095 * var3.length;
				var5.ae_fld = var3.length;
				return var5;
			}
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("uz")
	@ObfuscatedSignature(
		descriptor = "(Lsl;I)V"
	)
	public static void uz(sl var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.ay(var1, -210674912);
			var0.af(var1);
		}
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)Lsl;"
	)
	public static sl cf(xi var0) {
		int var1 = xi.tx(var0, 1075974305);
		if (var1 >= 0 && var1 <= 5000) {
			int var2 = var0.cg();
			if (var2 == 0) {
				int[] var7 = new int[var1];

				for (int var9 = 0; var9 < var1; var9++) {
					var7[var9] = var0.co();
				}

				return pm.au(var7);
			} else if (1 == var2) {
				long[] var6 = new long[var1];

				for (int var8 = 0; var8 < var1; var8++) {
					var6[var8] = xi.ob(var0, -1129960000);
				}

				return wn.ax(var6);
			} else if (2 != var2) {
				throw new RuntimeException();
			} else {
				String[] var3 = new String[var1];

				for (int var4 = 0; var4 < var1; var4++) {
					var3[var4] = xi.kc(var0, -1571140403);
				}

				sl var5 = new sl(yq.az_fld, false);
				var5.as_fld = var3;
				var5.av_fld = -69344095 * var3.length;
				var5.ae_fld = var3.length;
				return var5;
			}
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)Lsl;"
	)
	public static sl cx(xi var0) {
		int var1 = xi.tx(var0, 1825590251);
		if (var1 >= 0 && var1 <= 5000) {
			int var2 = var0.cg();
			if (var2 == 0) {
				int[] var7 = new int[var1];

				for (int var9 = 0; var9 < var1; var9++) {
					var7[var9] = var0.co();
				}

				return pm.au(var7);
			} else if (1 == var2) {
				long[] var6 = new long[var1];

				for (int var8 = 0; var8 < var1; var8++) {
					var6[var8] = xi.ob(var0, -1120128662);
				}

				return wn.ax(var6);
			} else if (2 != var2) {
				throw new RuntimeException();
			} else {
				String[] var3 = new String[var1];

				for (int var4 = 0; var4 < var1; var4++) {
					var3[var4] = xi.kc(var0, 771308214);
				}

				sl var5 = new sl(yq.az_fld, false);
				var5.as_fld = var3;
				var5.av_fld = -69344095 * var3.length;
				var5.ae_fld = var3.length;
				return var5;
			}
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)Lsl;"
	)
	public static sl cs(xi var0) {
		int var1 = xi.tx(var0, 619108291);
		if (var1 >= 0 && var1 <= 5000) {
			int var2 = var0.cg();
			if (var2 == 0) {
				int[] var7 = new int[var1];

				for (int var9 = 0; var9 < var1; var9++) {
					var7[var9] = var0.co();
				}

				return pm.au(var7);
			} else if (1 == var2) {
				long[] var6 = new long[var1];

				for (int var8 = 0; var8 < var1; var8++) {
					var6[var8] = xi.ob(var0, 866196018);
				}

				return wn.ax(var6);
			} else if (2 != var2) {
				throw new RuntimeException();
			} else {
				String[] var3 = new String[var1];

				for (int var4 = 0; var4 < var1; var4++) {
					var3[var4] = xi.kc(var0, 1371310515);
				}

				sl var5 = new sl(yq.az_fld, false);
				var5.as_fld = var3;
				var5.av_fld = -69344095 * var3.length;
				var5.ae_fld = var3.length;
				return var5;
			}
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)Lsl;"
	)
	public static sl cp(xi var0) {
		int var1 = xi.tx(var0, 1774803680);
		if (var1 >= 0 && var1 <= 5000) {
			int var2 = var0.cg();
			if (var2 == 0) {
				int[] var7 = new int[var1];

				for (int var9 = 0; var9 < var1; var9++) {
					var7[var9] = var0.co();
				}

				return pm.au(var7);
			} else if (1 == var2) {
				long[] var6 = new long[var1];

				for (int var8 = 0; var8 < var1; var8++) {
					var6[var8] = xi.ob(var0, 1506118956);
				}

				return wn.ax(var6);
			} else if (2 != var2) {
				throw new RuntimeException();
			} else {
				String[] var3 = new String[var1];

				for (int var4 = 0; var4 < var1; var4++) {
					var3[var4] = xi.kc(var0, 1807965962);
				}

				sl var5 = new sl(yq.az_fld, false);
				var5.as_fld = var3;
				var5.av_fld = -69344095 * var3.length;
				var5.ae_fld = var3.length;
				return var5;
			}
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;B)V"
	)
	final void ah(int var1, Object var2, byte var3) {
		if (this.ag_fld == yq.ak_fld) {
			this.aw_fld[var1] = (Integer)var2;
		} else if (this.ag_fld == yq.az_fld) {
			this.ay_fld[var1] = (Long)var2;
		} else {
			this.as_fld[var1] = var2;
		}
	}
}
