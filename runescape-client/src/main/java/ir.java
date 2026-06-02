import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("ir")
public class ir {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ak_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ag_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lxv;"
	)
	xv az_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lnj;"
	)
	nj av_fld = new nj();
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Liu;"
	)
	iu ae_fld;

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void am() {
		this.av_fld.ar();
		this.az_fld.az();
		this.ag_fld = this.ak_fld;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(J)Ljava/lang/Object;"
	)
	public Object ay(long var1) {
		ig var3 = (ig)this.az_fld.ak(var1);
		if (var3 == null) {
			return null;
		} else {
			Object var4 = var3.ak();
			if (var4 == null) {
				var3.gy_void();
				var3.mq_void();
				this.ag_fld = this.ag_fld + var3.ag_fld;
				return null;
			} else {
				if (var3.ag()) {
					ii var5 = new ii(var4, var3.ag_fld);
					this.az_fld.ag(var5, var3.hc_fld);
					this.av_fld.az(var5);
					var5.fg_fld = 0L;
					var3.gy_void();
					var3.mq_void();
				} else {
					this.av_fld.az(var3);
					var3.fg_fld = 0L;
				}

				return var4;
			}
		}
	}

	public ir(int var1, int var2) {
		this.ak_fld = var1;
		this.ag_fld = var1;
		byte var3 = 1;

		while (var3 + var3 < var1 && var3 < var2) {
			var3 += var3;
		}

		this.az_fld = new xv(var3);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(J)V"
	)
	void ag(long var1) {
		ig var3 = (ig)this.az_fld.ak(var1);
		ii(this, var3);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;J)V"
	)
	public void av(Object var1, long var2) {
		kk(this, var1, var2, 1);
	}

	@ObfuscatedName("kk")
	@ObfuscatedSignature(
		descriptor = "(Lir;Ljava/lang/Object;JI)V"
	)
	public static void kk(ir var0, Object var1, long var2, int var4) {
		if (var0 == null) {
			var0.getClass();
		} else if (var4 > var0.ak_fld) {
			throw new IllegalStateException();
		} else {
			var0.ag(var2);
			var0.ag_fld -= var4;

			while (var0.ag_fld < 0) {
				ig var5 = (ig)var0.av_fld.av();
				if (var5 == null) {
					throw new RuntimeException("");
				}

				if (!var5.ag()) {
				}

				ii(var0, var5);
				if (var0.ae_fld != null) {
					var0.ae_fld.ak(var5.ak());
				}
			}

			ii var6 = new ii(var1, var4);
			var0.az_fld.ag(var6, var2);
			var0.av_fld.az(var6);
			var6.fg_fld = 0L;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(J)V"
	)
	void ar(long var1) {
		ig var3 = (ig)this.az_fld.ak(var1);
		ii(this, var3);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void ah(int var1) {
		for (ig var2 = (ig)en.qy(this.av_fld); var2 != null; var2 = (ig)this.av_fld.aw()) {
			if (var2.ag()) {
				if (var2.ak() == null) {
					var2.gy_void();
					var2.mq_void();
					this.ag_fld = this.ag_fld + var2.ag_fld;
				}
			} else if (++var2.fg_fld > var1) {
				it var3 = new it(var2.ak(), var2.ag_fld);
				this.az_fld.ag(var3, var2.hc_fld);
				nj.ak(var3, var2);
				var2.gy_void();
				var2.mq_void();
			}
		}
	}

	@ObfuscatedName("ud")
	@ObfuscatedSignature(
		descriptor = "(Lir;I)V"
	)
	public static void ud(ir var0, int var1) {
		for (ig var2 = (ig)en.qy(var0.av_fld); var2 != null; var2 = (ig)var0.av_fld.aw()) {
			if (var2.ag()) {
				if (var2.ak() == null) {
					var2.gy_void();
					var2.mq_void();
					var0.ag_fld = var0.ag_fld + var2.ag_fld;
				}
			} else if (++var2.fg_fld > var1) {
				it var3 = new it(var2.ak(), var2.ag_fld);
				var0.az_fld.ag(var3, var2.hc_fld);
				nj.ak(var3, var2);
				var2.gy_void();
				var2.mq_void();
			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void aw() {
		this.av_fld.ar();
		this.az_fld.az();
		this.ag_fld = this.ak_fld;
	}

	public ir(int var1) {
		this(var1, var1);
	}

	@ObfuscatedName("jx")
	@ObfuscatedSignature(
		descriptor = "(Lir;I)V"
	)
	public static void jx(ir var0, int var1) {
		for (ig var2 = (ig)en.qy(var0.av_fld); var2 != null; var2 = (ig)var0.av_fld.aw()) {
			if (var2.ag()) {
				if (var2.ak() == null) {
					var2.gy_void();
					var2.mq_void();
					var0.ag_fld = var0.ag_fld + var2.ag_fld;
				}
			} else if (++var2.fg_fld > var1) {
				it var3 = new it(var2.ak(), var2.ag_fld);
				var0.az_fld.ag(var3, var2.hc_fld);
				nj.ak(var3, var2);
				var2.gy_void();
				var2.mq_void();
			}
		}
	}

	@ObfuscatedName("ii")
	@ObfuscatedSignature(
		descriptor = "(Lir;Lig;)V"
	)
	public static void ii(ir var0, ig var1) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var1 != null) {
			var1.gy_void();
			var1.mq_void();
			var0.ag_fld = var0.ag_fld + var1.ag_fld;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(J)V"
	)
	void af(long var1) {
		ig var3 = (ig)this.az_fld.ak(var1);
		ii(this, var3);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lig;)V"
	)
	void al(ig var1) {
		if (var1 != null) {
			var1.gy_void();
			var1.mq_void();
			this.ag_fld = this.ag_fld + var1.ag_fld;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(J)Ljava/lang/Object;"
	)
	public Object ak(long var1) {
		ig var3 = (ig)this.az_fld.ak(var1);
		if (var3 == null) {
			return null;
		} else {
			Object var4 = var3.ak();
			if (var4 == null) {
				var3.gy_void();
				var3.mq_void();
				this.ag_fld = this.ag_fld + var3.ag_fld;
				return null;
			} else {
				if (var3.ag()) {
					ii var5 = new ii(var4, var3.ag_fld);
					this.az_fld.ag(var5, var3.hc_fld);
					this.av_fld.az(var5);
					var5.fg_fld = 0L;
					var3.gy_void();
					var3.mq_void();
				} else {
					this.av_fld.az(var3);
					var3.fg_fld = 0L;
				}

				return var4;
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;JI)V"
	)
	public void ae(Object var1, long var2, int var4) {
		if (var4 > this.ak_fld) {
			throw new IllegalStateException();
		} else {
			this.ag(var2);
			this.ag_fld -= var4;

			while (this.ag_fld < 0) {
				ig var5 = (ig)this.av_fld.av();
				if (var5 == null) {
					throw new RuntimeException("");
				}

				if (!var5.ag()) {
				}

				ii(this, var5);
				if (this.ae_fld != null) {
					this.ae_fld.ak(var5.ak());
				}
			}

			ii var6 = new ii(var1, var4);
			this.az_fld.ag(var6, var2);
			this.av_fld.az(var6);
			var6.fg_fld = 0L;
		}
	}

	@ObfuscatedName("lw")
	@ObfuscatedSignature(
		descriptor = "(Lir;)V"
	)
	public static void lw(ir var0) {
		var0.av_fld.ar();
		var0.az_fld.az();
		var0.ag_fld = var0.ak_fld;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;JI)V"
	)
	public void ax(Object var1, long var2, int var4) {
		if (var4 > this.ak_fld) {
			throw new IllegalStateException();
		} else {
			this.ag(var2);
			this.ag_fld -= var4;

			while (this.ag_fld < 0) {
				ig var5 = (ig)this.av_fld.av();
				if (var5 == null) {
					throw new RuntimeException("");
				}

				if (!var5.ag()) {
				}

				ii(this, var5);
				if (this.ae_fld != null) {
					this.ae_fld.ak(var5.ak());
				}
			}

			ii var6 = new ii(var1, var4);
			this.az_fld.ag(var6, var2);
			this.av_fld.az(var6);
			var6.fg_fld = 0L;
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void ai(int var1) {
		for (ig var2 = (ig)en.qy(this.av_fld); var2 != null; var2 = (ig)this.av_fld.aw()) {
			if (var2.ag()) {
				if (var2.ak() == null) {
					var2.gy_void();
					var2.mq_void();
					this.ag_fld = this.ag_fld + var2.ag_fld;
				}
			} else if (++var2.fg_fld > var1) {
				it var3 = new it(var2.ak(), var2.ag_fld);
				this.az_fld.ag(var3, var2.hc_fld);
				nj.ak(var3, var2);
				var2.gy_void();
				var2.mq_void();
			}
		}
	}

	@ObfuscatedName("fi")
	@ObfuscatedSignature(
		descriptor = "(Lir;J)Ljava/lang/Object;"
	)
	public static Object fi(ir var0, long var1) {
		ig var3 = (ig)var0.az_fld.ak(var1);
		if (var3 == null) {
			return null;
		} else {
			Object var4 = var3.ak();
			if (var4 == null) {
				var3.gy_void();
				var3.mq_void();
				var0.ag_fld = var0.ag_fld + var3.ag_fld;
				return null;
			} else {
				if (var3.ag()) {
					ii var5 = new ii(var4, var3.ag_fld);
					var0.az_fld.ag(var5, var3.hc_fld);
					var0.av_fld.az(var5);
					var5.fg_fld = 0L;
					var3.gy_void();
					var3.mq_void();
				} else {
					var0.av_fld.az(var3);
					var3.fg_fld = 0L;
				}

				return var4;
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lig;)V"
	)
	void au(ig var1) {
		if (var1 != null) {
			var1.gy_void();
			var1.mq_void();
			this.ag_fld = this.ag_fld + var1.ag_fld;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;JI)V"
	)
	public void an(Object var1, long var2, int var4) {
		if (var4 > this.ak_fld) {
			throw new IllegalStateException();
		} else {
			this.ar(var2);
			this.ag_fld -= var4;

			while (this.ag_fld < 0) {
				ig var5 = (ig)this.av_fld.am();
				if (var5 == null) {
					throw new RuntimeException("");
				}

				if (!var5.ag()) {
				}

				ii(this, var5);
				if (this.ae_fld != null) {
					this.ae_fld.ak(var5.az());
				}
			}

			ii var6 = new ii(var1, var4);
			this.az_fld.ag(var6, var2);
			this.av_fld.al(var6);
			var6.fg_fld = 0L;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lig;)V"
	)
	void az(ig var1) {
		if (var1 != null) {
			var1.gx();
			var1.kv_void();
			this.ag_fld = this.ak_fld + var1.ag_fld;
		}
	}
}
