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
		km.ts(this.av_fld);
		xv.aa(this.az_fld);
		this.ag_fld = this.ak_fld;
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
		this.az(var3);
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

				if (!var5.ah()) {
				}

				this.az(var5);
				if (this.ae_fld != null) {
					this.ae_fld.ak(var5.ak());
				}
			}

			ii var6 = new ii(var1, var4);
			this.az_fld.ag(var6, var2);
			this.av_fld.jr(var6);
			var6.fg_fld = 0L;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;J)V"
	)
	public void av(Object var1, long var2) {
		this.ae(var1, var2, 1);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(J)V"
	)
	void ar(long var1) {
		ig var3 = (ig)this.az_fld.ak(var1);
		this.az(var3);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void ah(int var1) {
		for (ig var2 = (ig)this.av_fld.ae(); var2 != null; var2 = (ig)hi.cu(this.av_fld)) {
			if (var2.ah()) {
				if (var2.ak() == null) {
					var2.gy();
					var2.vi();
					this.ag_fld = this.ag_fld + var2.ag_fld;
				}
			} else if (++var2.fg_fld > var1) {
				it var3 = new it(var2.ak(), var2.ag_fld);
				this.az_fld.ag(var3, var2.hc_long);
				nj.ak(var3, var2);
				var2.gy();
				var2.vi();
			}
		}
	}

	@ObfuscatedName("fe")
	@ObfuscatedSignature(
		descriptor = "(Lir;J)Ljava/lang/Object;"
	)
	public static Object fe(ir var0, long var1) {
		ig var3 = (ig)var0.az_fld.ak(var1);
		if (var3 == null) {
			return null;
		} else {
			Object var4 = var3.ak();
			if (var4 == null) {
				var3.gy();
				var3.vi();
				var0.ag_fld = var0.ag_fld + var3.ag_fld;
				return null;
			} else {
				if (var3.ah()) {
					ii var5 = new ii(var4, var3.ag_fld);
					var0.az_fld.ag(var5, var3.hc_long);
					var0.av_fld.jr(var5);
					var5.fg_fld = 0L;
					var3.gy();
					var3.vi();
				} else {
					var0.av_fld.jr(var3);
					var3.fg_fld = 0L;
				}

				return var4;
			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void aw() {
		km.ts(this.av_fld);
		xv.aa(this.az_fld);
		this.ag_fld = this.ak_fld;
	}

	public ir(int var1) {
		this(var1, var1);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(J)Ljava/lang/Object;"
	)
	public Object as(long var1) {
		ig var3 = (ig)this.az_fld.ak(var1);
		if (var3 == null) {
			return null;
		} else {
			Object var4 = var3.ak();
			if (var4 == null) {
				var3.gy();
				var3.vi();
				this.ag_fld = this.ag_fld + var3.ag_fld;
				return null;
			} else {
				if (var3.ah()) {
					ii var5 = new ii(var4, var3.ag_fld);
					this.az_fld.ag(var5, var3.hc_long);
					this.av_fld.jr(var5);
					var5.fg_fld = 0L;
					var3.gy();
					var3.vi();
				} else {
					this.av_fld.jr(var3);
					var3.fg_fld = 0L;
				}

				return var4;
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lig;)V"
	)
	void az(ig var1) {
		if (var1 != null) {
			var1.gy();
			var1.vi();
			this.ag_fld = this.ag_fld + var1.ag_fld;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(J)V"
	)
	void af(long var1) {
		ig var3 = (ig)this.az_fld.ak(var1);
		this.az(var3);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lig;)V"
	)
	void al(ig var1) {
		if (var1 != null) {
			var1.gy();
			var1.vi();
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
				var3.gy();
				var3.vi();
				this.ag_fld = this.ag_fld + var3.ag_fld;
				return null;
			} else {
				if (var3.ah()) {
					ii var5 = new ii(var4, var3.ag_fld);
					this.az_fld.ag(var5, var3.hc_long);
					this.av_fld.jr(var5);
					var5.fg_fld = 0L;
					var3.gy();
					var3.vi();
				} else {
					this.av_fld.jr(var3);
					var3.fg_fld = 0L;
				}

				return var4;
			}
		}
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

				if (!var5.ah()) {
				}

				this.az(var5);
				if (this.ae_fld != null) {
					this.ae_fld.ak(var5.ak());
				}
			}

			ii var6 = new ii(var1, var4);
			this.az_fld.ag(var6, var2);
			this.av_fld.jr(var6);
			var6.fg_fld = 0L;
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
			this.ag(var2);
			this.ag_fld -= var4;

			while (this.ag_fld < 0) {
				ig var5 = (ig)this.av_fld.av();
				if (var5 == null) {
					throw new RuntimeException("");
				}

				if (!var5.ah()) {
				}

				this.az(var5);
				if (this.ae_fld != null) {
					this.ae_fld.ak(var5.ak());
				}
			}

			ii var6 = new ii(var1, var4);
			this.az_fld.ag(var6, var2);
			this.av_fld.jr(var6);
			var6.fg_fld = 0L;
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void aa(int var1) {
		for (ig var2 = (ig)this.av_fld.ae(); var2 != null; var2 = (ig)hi.cu(this.av_fld)) {
			if (var2.ah()) {
				if (var2.ak() == null) {
					var2.gy();
					var2.vi();
					this.ag_fld = this.ag_fld + var2.ag_fld;
				}
			} else if (++var2.fg_fld > var1) {
				it var3 = new it(var2.ak(), var2.ag_fld);
				this.az_fld.ag(var3, var2.hc_long);
				nj.ak(var3, var2);
				var2.gy();
				var2.vi();
			}
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void ai(int var1) {
		for (ig var2 = (ig)this.av_fld.ae(); var2 != null; var2 = (ig)hi.cu(this.av_fld)) {
			if (var2.ah()) {
				if (var2.ak() == null) {
					var2.gy();
					var2.vi();
					this.ag_fld = this.ag_fld + var2.ag_fld;
				}
			} else if (++var2.fg_fld > var1) {
				it var3 = new it(var2.ak(), var2.ag_fld);
				this.az_fld.ag(var3, var2.hc_long);
				nj.ak(var3, var2);
				var2.gy();
				var2.vi();
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lig;)V"
	)
	void au(ig var1) {
		if (var1 != null) {
			var1.gy();
			var1.vi();
			this.ag_fld = this.ag_fld + var1.ag_fld;
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void aq(int var1) {
		for (ig var2 = (ig)this.av_fld.ae(); var2 != null; var2 = (ig)hi.cu(this.av_fld)) {
			if (var2.ah()) {
				if (var2.ak() == null) {
					var2.gy();
					var2.vi();
					this.ag_fld = this.ag_fld + var2.ag_fld;
				}
			} else if (++var2.fg_fld > var1) {
				it var3 = new it(var2.ak(), var2.ag_fld);
				this.az_fld.ag(var3, var2.hc_long);
				nj.ak(var3, var2);
				var2.gy();
				var2.vi();
			}
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ad() {
		km.ts(this.av_fld);
		xv.aa(this.az_fld);
		this.ag_fld = this.ak_fld;
	}
}
