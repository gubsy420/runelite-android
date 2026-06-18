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
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 741408609
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
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 670939965
	)
	public int ae_fld;

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	public void cv(xi var1) {
		xi.vy(var1, this.av_fld);
		if (this.ag_fld == yq.ak_fld) {
			var1.ea(0);

			for (int var2 = 0; var2 < this.av_fld; var2++) {
				var1.eb(this.aw_fld[var2]);
			}
		} else if (this.ag_fld == yq.ag_fld) {
			var1.ea(1);

			for (int var3 = 0; var3 < this.av_fld; var3++) {
				var1.ft(this.ay_fld[var3]);
			}
		} else if (yq.az_fld == this.ag_fld) {
			var1.ea(2);

			for (int var4 = 0; var4 < this.av_fld; var4++) {
				xi.ph(var1, (String)this.as_fld[var4], 1936208751);
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(S)[Ljava/lang/Object;"
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
		descriptor = "(I)I"
	)
	public final int av() {
		return this.av_fld;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/Object;"
	)
	final Object ae(int var1) {
		if (this.ag_fld == yq.ak_fld) {
			return this.aw_fld[var1];
		} else {
			return yq.ag_fld == this.ag_fld ? this.ay_fld[var1] : this.as_fld[var1];
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
		descriptor = "(II)V"
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

	@ObfuscatedName("tx")
	@ObfuscatedSignature(
		descriptor = "(Lsl;ILjava/lang/Object;)V"
	)
	public static void tx(sl var0, int var1, Object var2) {
		if (var0.ag_fld == yq.ak_fld) {
			var0.aw_fld[var1] = (Integer)var2;
		} else if (var0.ag_fld == yq.ag_fld) {
			var0.ay_fld[var1] = (Long)var2;
		} else {
			var0.as_fld[var1] = var2;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public final void aw(int var1) {
		this.ay(var1, -210674912);
		this.af(var1);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	public void an(xi var1, int var2) {
		xi.vy(var1, this.av_fld);
		if (this.ag_fld == yq.ak_fld) {
			var1.ea(0);

			for (int var3 = 0; var3 < this.av_fld; var3++) {
				var1.eb(this.aw_fld[var3]);
			}
		} else if (this.ag_fld == yq.ag_fld) {
			var1.ea(1);

			for (int var4 = 0; var4 < this.av_fld; var4++) {
				if (var2 <= -859273038) {
					return;
				}

				var1.ft(this.ay_fld[var4]);
			}
		} else if (yq.az_fld == this.ag_fld) {
			var1.ea(2);

			for (int var5 = 0; var5 < this.av_fld; var5++) {
				xi.ph(var1, (String)this.as_fld[var5], 356536621);
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

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/Object;"
	)
	final Object bz(int var1) {
		if (this.ag_fld == yq.ak_fld) {
			return this.aw_fld[var1];
		} else {
			return yq.ag_fld == this.ag_fld ? this.ay_fld[var1] : this.as_fld[var1];
		}
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

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public final void bk(int var1) {
		this.ay(var1, -210674912);
		this.af(var1);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "()[Ljava/lang/Object;"
	)
	public final Object[] ab() {
		return (Object[])this.as_fld;
	}

	@ObfuscatedName("tt")
	@ObfuscatedSignature(
		descriptor = "(Lvr;I)I"
	)
	public static int tt(vr var0, int var1) {
		return var0.av_fld[var1 & 15];
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "()[Ljava/lang/Object;"
	)
	public final Object[] ap() {
		return (Object[])this.as_fld;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "()[Ljava/lang/Object;"
	)
	public final Object[] at() {
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

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "()[Ljava/lang/Object;"
	)
	public final Object[] ac() {
		return (Object[])this.as_fld;
	}

	@ObfuscatedName("kj")
	@ObfuscatedSignature(
		descriptor = "(Lsl;I)V"
	)
	public static void kj(sl var0, int var1) {
		if (var1 != var0.ae_fld) {
			var0.ae_fld = var1;
			if (yq.ak_fld == var0.ag_fld) {
				var0.aw_fld = Arrays.copyOf(var0.aw_fld, var1);
			} else if (var0.ag_fld == yq.ag_fld) {
				var0.ay_fld = Arrays.copyOf(var0.ay_fld, var1);
			} else if (var0.ag_fld == yq.az_fld) {
				var0.as_fld = (Object[])Arrays.copyOf((Object[])var0.as_fld, var1);
			}
		}
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

	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "(Lzt;I)Lyv;"
	)
	public static yv dh(zt var0, int var1) {
		if (!var0.ae_fld.containsKey(var1)) {
			var0.ak(var1, (byte)-26);
		}

		return (yv)(yv)var0.ae_fld.get(var1);
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;)V"
	)
	final void be(int var1, Object var2) {
		if (this.ag_fld == yq.ak_fld) {
			this.aw_fld[var1] = (Integer)var2;
		} else if (this.ag_fld == yq.ag_fld) {
			this.ay_fld[var1] = (Long)var2;
		} else {
			this.as_fld[var1] = var2;
		}
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public final void bj(int var1) {
		this.ay(var1, -210674912);
		this.af(var1);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)I"
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

	@ObfuscatedName("po")
	@ObfuscatedSignature(
		descriptor = "(Lzg;II)I"
	)
	public static int po(zg var0, int var1, int var2) {
		if (null != var0.ab_fld && !var0.az() && var1 <= var0.ap_fld.size()) {
			byte var3;
			if (var2 > 0) {
				var3 = 1;
			} else {
				var3 = -1;
				var2 = -var2;
			}

			int var4 = 0;
			int var5 = 0;
			if (var1 > 0) {
				zj var6 = (zj)(zj)var0.ap_fld.get(var1 - 1);
				var4 = var6.az_fld + zg.es(var0, var1 - 1, (byte)-76);
				var5 = var6.ag_fld;
			} else if (var3 == -1 && var1 == 0) {
				return 0;
			}

			int var14 = 16777215;
			int var7 = 0;
			int var8 = var1;
			int var9 = 16777215;
			int var10 = var3 == 1 ? var0.ap_fld.size() + 1 : 0;

			for (int var11 = var1 + var3; var10 != var11; var11 += var3) {
				zj var12 = (zj)(zj)var0.ap_fld.get(var11 - 1);
				if (var12.ag_fld != var5) {
					var7++;
					var5 = var12.ag_fld;
					if (var7 > var2) {
						return var8;
					}
				}

				if (var2 == var7) {
					int var13 = Math.abs(var12.az_fld + zg.es(var0, var11 - 1, (byte)-117) - var4);
					if (var13 >= var9) {
						return var8;
					}

					var8 = var11;
					var9 = var13;
				}
			}

			if (1 == var3) {
				return var0.ap_fld.size();
			} else {
				if (var5 != 0) {
					var7++;
				}

				return var9 != 16777215 && (var7 != var2 || var4 >= var9) ? var8 : 0;
			}
		} else {
			return 0;
		}
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int by(int var1) {
		int var2 = (this.ae_fld >> 1) + this.ae_fld;
		return Math.max(var1, Math.min(var2, 5000));
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

	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "(Lsl;I)V"
	)
	public static void hg(sl var0, int var1) {
		if (var1 != var0.ae_fld) {
			var0.ae_fld = var1;
			if (yq.ak_fld == var0.ag_fld) {
				var0.aw_fld = Arrays.copyOf(var0.aw_fld, var1);
			} else if (var0.ag_fld == yq.ag_fld) {
				var0.ay_fld = Arrays.copyOf(var0.ay_fld, var1);
			} else if (var0.ag_fld == yq.az_fld) {
				var0.as_fld = (Object[])Arrays.copyOf((Object[])var0.as_fld, var1);
			}
		}
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void bo(int var1) {
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

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;B)V"
	)
	final void ah(int var1, Object var2) {
		if (this.ag_fld == yq.ak_fld) {
			this.aw_fld[var1] = (Integer)var2;
		} else if (this.ag_fld == yq.ag_fld) {
			this.ay_fld[var1] = (Long)var2;
		} else {
			this.as_fld[var1] = var2;
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

	@ObfuscatedName("uz")
	@ObfuscatedSignature(
		descriptor = "(Lsl;I)V"
	)
	public static void uz(sl var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ay(var1, -210674912);
		var0.af(var1);
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

	@ObfuscatedName("ob")
	@ObfuscatedSignature(
		descriptor = "(Lsl;I)[J"
	)
	public static long[] ob(sl var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.ay_fld;
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

	@ObfuscatedName("eo")
	@ObfuscatedSignature(
		descriptor = "(Lsl;Lxi;)V"
	)
	public static void eo(sl var0, xi var1) {
		if (var0 == null) {
			var0.getClass();
		}

		xi.vy(var1, var0.av_fld);
		if (var0.ag_fld == yq.ak_fld) {
			var1.ea(0);

			for (int var2 = 0; var2 < var0.av_fld; var2++) {
				var1.eb(var0.aw_fld[var2]);
			}
		} else if (var0.ag_fld == yq.ag_fld) {
			var1.ea(1);

			for (int var3 = 0; var3 < var0.av_fld; var3++) {
				var1.ft(var0.ay_fld[var3]);
			}
		} else if (yq.az_fld == var0.ag_fld) {
			var1.ea(2);

			for (int var4 = 0; var4 < var0.av_fld; var4++) {
				xi.ph(var1, (String)var0.as_fld[var4], 1874274423);
			}
		}
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
		descriptor = "(I)[I"
	)
	public final int[] ak() {
		return this.aw_fld;
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	public void cq(xi var1) {
		xi.vy(var1, this.av_fld);
		if (this.ag_fld == yq.ak_fld) {
			var1.ea(0);

			for (int var2 = 0; var2 < this.av_fld; var2++) {
				var1.eb(this.aw_fld[var2]);
			}
		} else if (this.ag_fld == yq.ag_fld) {
			var1.ea(1);

			for (int var3 = 0; var3 < this.av_fld; var3++) {
				var1.ft(this.ay_fld[var3]);
			}
		} else if (yq.az_fld == this.ag_fld) {
			var1.ea(2);

			for (int var4 = 0; var4 < this.av_fld; var4++) {
				xi.ph(var1, (String)this.as_fld[var4], -811992562);
			}
		}
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)Lsl;"
	)
	public static sl cy(xi var0) {
		int var1 = var0.cm();
		if (var1 >= 0 && var1 <= 5000) {
			int var2 = var0.cg();
			if (var2 == 0) {
				int[] var7 = new int[var1];

				for (int var9 = 0; var9 < var1; var9++) {
					var7[var9] = var0.co((byte)-109);
				}

				return pm.au(var7);
			} else if (1 == var2) {
				long[] var6 = new long[var1];

				for (int var8 = 0; var8 < var1; var8++) {
					var6[var8] = var0.cu();
				}

				return wn.ax(var6);
			} else if (2 != var2) {
				throw new RuntimeException();
			} else {
				String[] var3 = new String[var1];

				for (int var4 = 0; var4 < var1; var4++) {
					var3[var4] = xi.at(var0, -66212633);
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

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)Lsl;"
	)
	public static sl cf(xi var0) {
		int var1 = var0.cm();
		if (var1 >= 0 && var1 <= 5000) {
			int var2 = var0.cg();
			if (var2 == 0) {
				int[] var7 = new int[var1];

				for (int var9 = 0; var9 < var1; var9++) {
					var7[var9] = var0.co((byte)-4);
				}

				return pm.au(var7);
			} else if (1 == var2) {
				long[] var6 = new long[var1];

				for (int var8 = 0; var8 < var1; var8++) {
					var6[var8] = var0.cu();
				}

				return wn.ax(var6);
			} else if (2 != var2) {
				throw new RuntimeException();
			} else {
				String[] var3 = new String[var1];

				for (int var4 = 0; var4 < var1; var4++) {
					var3[var4] = xi.at(var0, -1571140403);
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
		int var1 = var0.cm();
		if (var1 >= 0 && var1 <= 5000) {
			int var2 = var0.cg();
			if (var2 == 0) {
				int[] var7 = new int[var1];

				for (int var9 = 0; var9 < var1; var9++) {
					var7[var9] = var0.co((byte)-82);
				}

				return pm.au(var7);
			} else if (1 == var2) {
				long[] var6 = new long[var1];

				for (int var8 = 0; var8 < var1; var8++) {
					var6[var8] = var0.cu();
				}

				return wn.ax(var6);
			} else if (2 != var2) {
				throw new RuntimeException();
			} else {
				String[] var3 = new String[var1];

				for (int var4 = 0; var4 < var1; var4++) {
					var3[var4] = xi.at(var0, 771308214);
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
		int var1 = var0.cm();
		if (var1 >= 0 && var1 <= 5000) {
			int var2 = var0.cg();
			if (var2 == 0) {
				int[] var7 = new int[var1];

				for (int var9 = 0; var9 < var1; var9++) {
					var7[var9] = var0.co((byte)-78);
				}

				return pm.au(var7);
			} else if (1 == var2) {
				long[] var6 = new long[var1];

				for (int var8 = 0; var8 < var1; var8++) {
					var6[var8] = var0.cu();
				}

				return wn.ax(var6);
			} else if (2 != var2) {
				throw new RuntimeException();
			} else {
				String[] var3 = new String[var1];

				for (int var4 = 0; var4 < var1; var4++) {
					var3[var4] = xi.at(var0, 1371310515);
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
		int var1 = var0.cm();
		if (var1 >= 0 && var1 <= 5000) {
			int var2 = var0.cg();
			if (var2 == 0) {
				int[] var7 = new int[var1];

				for (int var9 = 0; var9 < var1; var9++) {
					var7[var9] = var0.co((byte)-54);
				}

				return pm.au(var7);
			} else if (1 == var2) {
				long[] var6 = new long[var1];

				for (int var8 = 0; var8 < var1; var8++) {
					var6[var8] = var0.cu();
				}

				return wn.ax(var6);
			} else if (2 != var2) {
				throw new RuntimeException();
			} else {
				String[] var3 = new String[var1];

				for (int var4 = 0; var4 < var1; var4++) {
					var3[var4] = xi.at(var0, 1807965962);
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

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)[J"
	)
	final long[] ag(int var1) {
		return this.ay_fld;
	}
}
