import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("ry")
public class ry {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lpd;"
	)
	pd az_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/Map;"
	)
	Map ag_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lqd;"
	)
	qd ah_fld;
	@ObfuscatedGetter(
		longValue = -1807777876335997213L
	)
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	long ae_fld;
	@ObfuscatedGetter(
		intValue = 388478183
	)
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int aw_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lpd;"
	)
	pd av_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/Comparator;"
	)
	Comparator ak_fld = new qo(this);
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bm_fld;

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(FFFF)Luz;"
	)
	static uz ag(float var0, float var1, float var2, float var3) {
		synchronized (uz.ak_fld) {
			if (uz.az_fld == 0) {
				return new uz(var0, var1, var2, var3);
			} else {
				uz.ak_fld[(uz.az_fld -= -1833938397) * 770960779].ah(var0, var1, var2, var3);
				return uz.ak_fld[uz.az_fld];
			}
		}
	}

	ry(long var1, int var3, qd var4) {
		this.ae_fld = var1;
		this.aw_fld = var3;
		this.ah_fld = var4;
		if (this.aw_fld == -1) {
			this.ag_fld = new HashMap(64);
			this.az_fld = new pd(64, this.ak_fld);
			this.av_fld = null;
		} else {
			if (null == this.ah_fld) {
				throw new IllegalArgumentException("");
			}

			this.ag_fld = new HashMap(this.aw_fld);
			this.az_fld = new pd(this.aw_fld, this.ak_fld);
			this.av_fld = new pd(this.aw_fld);
		}
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(Lry;)V"
	)
	public static void cg(ry var0) {
		long var4;
		int var10000 = (var4 = -1L - var0.ae_fld) == 0L ? 0 : (var4 < 0L ? -1 : 1);
		long var1 = System.currentTimeMillis() - var0.ae_fld;

		while (!var0.az_fld.isEmpty()) {
			qu var3 = (qu)(qu)var0.az_fld.peek();
			if (var3.az_fld >= var1) {
				return;
			}

			var0.ag_fld.remove(var3.ag_fld);
			var0.az_fld.remove(var3);
			if (var0.ak()) {
				var0.av_fld.remove(var3);
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Ljava/lang/Object;"
	)
	public Object ag(Object var1) {
		synchronized (this) {
			if (-1L != this.ae_fld) {
				ml(this, -1147838794);
			}

			qu var4 = (qu)(qu)this.ag_fld.get(var1);
			if (var4 == null) {
				return null;
			} else {
				this.av(var4, false, 809104592);
				return var4.ak_fld;
			}
		}
	}

	@ObfuscatedName("mx")
	@ObfuscatedSignature(
		descriptor = "(Lry;B)V"
	)
	public static void mx(ry var0, byte var1) {
		if (var0 == null) {
			var0.getClass();
		}

		synchronized (var0) {
			var0.ag_fld.clear();
			var0.az_fld.clear();
			if (var0.ak()) {
				var0.av_fld.clear();
			}
		}
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(Lry;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"
	)
	public static Object ck(ry var0, Object var1, Object var2) {
		if (var0 == null) {
			var0.getClass();
		}

		synchronized (var0) {
			if (-1L != var0.ae_fld) {
				ml(var0, -1147838794);
			}

			qu var4 = (qu)(qu)var0.ag_fld.get(var1);
			if (var4 != null) {
				Object var9 = var4.ak_fld;
				var4.ak_fld = var2;
				var0.av(var4, false, -562947658);
				return var9;
			} else {
				if (var0.ak() && var0.ag_fld.size() == var0.aw_fld) {
					qu var5 = (qu)(qu)var0.av_fld.remove();
					var0.ag_fld.remove(var5.ag_fld);
					var0.az_fld.remove(var5);
				}

				qu var8 = new qu(var2, var1);
				var0.ag_fld.put(var1, var8);
				var0.av(var8, true, 347591635);
				return null;
			}
		}
	}

	@ObfuscatedName("mp")
	@ObfuscatedSignature(
		descriptor = "(Lry;)V"
	)
	public static void mp(ry var0) {
		if (var0 == null) {
			var0.getClass();
		}

		synchronized (var0) {
			var0.ag_fld.clear();
			var0.az_fld.clear();
			if (var0.ak()) {
				var0.av_fld.clear();
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"
	)
	public Object az(Object var1, Object var2) {
		synchronized (this) {
			if (-1L != this.ae_fld) {
				ml(this, -1147838794);
			}

			qu var5 = (qu)(qu)this.ag_fld.get(var1);
			if (var5 != null) {
				Object var10 = var5.ak_fld;
				var5.ak_fld = var2;
				this.av(var5, false, 965904955);
				return var10;
			} else {
				if (this.ak() && this.ag_fld.size() == this.aw_fld) {
					qu var6 = (qu)(qu)this.av_fld.remove();
					this.ag_fld.remove(var6.ag_fld);
					this.az_fld.remove(var6);
				}

				qu var9 = new qu(var2, var1);
				this.ag_fld.put(var1, var9);
				this.av(var9, true, 1935009155);
				return null;
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lqu;ZI)V"
	)
	void av(qu var1, boolean var2, int var3) {
		throw new NoSuchMethodError("sanitized: dead bytecode referenced nonexistent symbol");
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean as() {
		return -1 != this.aw_fld;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Ljava/lang/Object;"
	)
	public Object ar(Object var1) {
		synchronized (this) {
			if (-1L != this.ae_fld) {
				ml(this, -1147838794);
			}

			qu var3 = (qu)(qu)this.ag_fld.get(var1);
			if (var3 == null) {
				return null;
			} else {
				this.av(var3, false, 822582465);
				return var3.ak_fld;
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"
	)
	public Object af(Object var1, Object var2) {
		synchronized (this) {
			if (-1L != this.ae_fld) {
				ml(this, -1147838794);
			}

			qu var4 = (qu)(qu)this.ag_fld.get(var1);
			if (var4 != null) {
				Object var9 = var4.ak_fld;
				var4.ak_fld = var2;
				this.av(var4, false, 2011890119);
				return var9;
			} else {
				if (this.ak() && this.ag_fld.size() == this.aw_fld) {
					qu var5 = (qu)(qu)this.av_fld.remove();
					this.ag_fld.remove(var5.ag_fld);
					this.az_fld.remove(var5);
				}

				qu var8 = new qu(var2, var1);
				this.ag_fld.put(var1, var8);
				this.av(var8, true, 676499535);
				return null;
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"
	)
	public Object au(Object var1, Object var2) {
		synchronized (this) {
			if (-1L != this.ae_fld) {
				ml(this, -1147838794);
			}

			qu var4 = (qu)(qu)this.ag_fld.get(var1);
			if (var4 != null) {
				Object var9 = var4.ak_fld;
				var4.ak_fld = var2;
				this.av(var4, false, -388499050);
				return var9;
			} else {
				if (this.ak() && this.ag_fld.size() == this.aw_fld) {
					qu var5 = (qu)(qu)this.av_fld.remove();
					this.ag_fld.remove(var5.ag_fld);
					this.az_fld.remove(var5);
				}

				qu var8 = new qu(var2, var1);
				this.ag_fld.put(var1, var8);
				this.av(var8, true, 256367884);
				return null;
			}
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ldx;IIIIILyv;Lkp;I)V"
	)
	static final void ay(dx var0, int var1, int var2, int var3, int var4, int var5, yv var6, kp var7, int var8) {
		tu var9 = mf.bn(var0, var1, var2);
		var1 = (int)var9.ay_fld;
		var2 = (int)var9.ar_fld;
		var9.ah();
		int var10 = var1 / 32 - client.nw_fld / 32;
		int var11 = var2 / 32 - client.nd_fld / 32;
		int var12 = var11 * var11 + var10 * var10;
		if (var12 > 4225) {
			if (var8 == -1686680369) {
				return;
			}

			if (var12 < 90000) {
				int var13 = fc.ah_fld[var5];
				int var14 = fc.aw_fld[var5];
				int var15 = var13 * var11 + var14 * var10 >> 16;
				int var16 = var11 * var14 - var13 * var10 >> 16;
				double var17 = Math.atan2(var15, var16);
				int var19 = var7.ak_fld / 2 - 25;
				int var20 = (int)(Math.sin(var17) * var19);
				int var21 = (int)(Math.cos(var17) * var19);
				byte var22 = 20;
				ld.au_fld.jf(var7.ak_fld / 2 + var3 - var22 / 2 + var20, var7.ag_fld / 2 + var4 - var22 / 2 - var21 - 10, var22, var22, 15, 15, var17, 256);
				return;
			}
		}

		ec.ah(var3, var4, var10, var11, var5, var6, var7);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lqu;Z)V"
	)
	void ax(qu var1, boolean var2) {
		throw new NoSuchMethodError("sanitized: dead bytecode referenced nonexistent symbol");
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void aa() {
		if (-1L == this.ae_fld) {
			throw new IllegalStateException("");
		} else {
			long var1 = System.currentTimeMillis() - this.ae_fld;

			while (!this.az_fld.isEmpty()) {
				qu var3 = (qu)(qu)this.az_fld.peek();
				if (var3.az_fld >= var1) {
					return;
				}

				this.ag_fld.remove(var3.ag_fld);
				this.az_fld.remove(var3);
				if (this.ak()) {
					this.av_fld.remove(var3);
				}
			}
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void aq() {
		synchronized (this) {
			this.ag_fld.clear();
			this.az_fld.clear();
			if (this.ak()) {
				this.av_fld.clear();
			}
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void am() {
		synchronized (this) {
			this.ag_fld.clear();
			this.az_fld.clear();
			if (this.ak()) {
				this.av_fld.clear();
			}
		}
	}

	public ry(int var1, qd var2) {
		this(-1L, var1, var2);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean ak() {
		return -1 != this.aw_fld;
	}

	@ObfuscatedName("ml")
	@ObfuscatedSignature(
		descriptor = "(Lry;I)V"
	)
	public static void ml(ry var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		if (-1L == var0.ae_fld) {
			throw new IllegalStateException("");
		} else {
			long var2 = System.currentTimeMillis() - var0.ae_fld;

			while (!var0.az_fld.isEmpty()) {
				qu var4 = (qu)(qu)var0.az_fld.peek();
				if (var4.az_fld >= var2) {
					return;
				}

				var0.ag_fld.remove(var4.ag_fld);
				var0.az_fld.remove(var4);
				if (var0.ak()) {
					var0.av_fld.remove(var4);
				}
			}
		}
	}

	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "(Lry;)Z"
	)
	public static boolean dk(ry var0) {
		return -1 != var0.aw_fld;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void ae(int var1) {
		if (-1L == this.ae_fld) {
			throw new IllegalStateException("");
		} else {
			long var2 = System.currentTimeMillis() - this.ae_fld;

			while (!this.az_fld.isEmpty()) {
				qu var4 = (qu)(qu)this.az_fld.peek();
				if (var4.az_fld >= var2) {
					return;
				}

				this.ag_fld.remove(var4.ag_fld);
				this.av_fld.remove(var4);
				if (this.ak()) {
					this.az_fld.contains(var4);
				}
			}
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	public void ah(byte var1) {
		synchronized (this) {
			this.ag_fld.clear();
			this.az_fld.clear();
			if (this.ak()) {
				this.av_fld.clear();
			}
		}
	}
}
