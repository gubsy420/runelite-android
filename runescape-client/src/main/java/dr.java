import java.io.EOFException;
import net.runelite.api.AmbientSoundEffect;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("dr")
@Implements({"AmbientSoundEffect"})
public abstract class dr extends vw implements AmbientSoundEffect {
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lna;"
	)
	static na an_fld = new na();
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean ax_fld = false;
	@ObfuscatedGetter(
		intValue = -1900148803
	)
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ay_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lwj;"
	)
	wj as_fld;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lwv;"
	)
	wv ar_fld;
	@ObfuscatedGetter(
		intValue = 1078879895
	)
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int aw_fld;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lwn;"
	)
	wn al_fld;
	@ObfuscatedGetter(
		intValue = 1180923923
	)
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int au_fld;
	@ObfuscatedGetter(
		intValue = -1148991295
	)
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ah_fld;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int aa_fld;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lzm;"
	)
	static zm ai_fld = zm.ak_fld;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int be_fld;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lwj;"
	)
	wj af_fld;

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void bm(int var1) {
		an_fld.av(this);
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ba() {
		return this.ah_fld;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIZI)V"
	)
	void ao(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9) {
		try {
			int var10 = ua.gp();
			if (this.ax_fld) {
				if (this.ad(-1339903940)) {
					this.ax_fld = false;
				}
			} else {
				if (this.ar_fld.ag_fld * 1077344343 == -1 && this.al_fld != null) {
					if (var9 <= -20746246) {
						return;
					}

					if (this.al_fld.ak_fld == null) {
						if (var9 <= -20746246) {
							return;
						}

						return;
					}
				}

				if (var10 != 0 && var8) {
					int var13 = 0;
					if (var1 < var3) {
						var13 += var3 - var1;
					} else if (var1 > var5) {
						var13 += var1 - var5;
					}

					if (var2 < var4) {
						var13 += var4 - var2;
					} else if (var2 > var6) {
						var13 += var2 - var6;
					}

					var13 = Math.max(var13 - 64, 0);
					if (var13 > this.aw_fld) {
						if (var9 > -20746246) {
							this.ac((byte)19);
						}
					} else {
						double var22;
						if (this.ay_fld < this.aw_fld) {
							var22 = nl.az(this.aw_fld - var13, this.aw_fld - this.ay_fld, wh.pw(this.ar_fld.av_fld, 1677900357));
						} else {
							var22 = 1.0;
						}

						int var15 = (int)Math.ceil(var22 * var10);
						if (null != this.as_fld) {
							this.at(this.as_fld, var15, var10, -638431472);
						} else if (1077344343 * this.ar_fld.ag_fld >= 0 && var15 > 0) {
							this.as_fld = this.ap(1077344343 * this.ar_fld.ag_fld, var15, -1, 2117450433);
						}

						if (null != this.af_fld && wj.yt(this.af_fld, -1620373830) != null) {
							this.at(this.af_fld, var15, var10, 444968042);
						} else if (null != this.al_fld && this.al_fld.ak_fld != null && (this.au_fld -= var7 * -355790309) * 1180923923 <= 0 && var15 > 0) {
							int var16 = this.al_fld.ak_fld[(int)(Math.random() * this.al_fld.ak_fld.length)];
							this.af_fld = this.ap(var16, var15, 0, 1700505195);
							if (this.af_fld != null) {
								this.af_fld.ag(var15, var10, this.ar_fld.av_fld.aw(), wh.wa(this.ar_fld.av_fld, (byte)1));
								wj.nc(this.af_fld, 1937995242);
							}

							int var18 = this.al_fld.ag_fld * -239181913;
							int var19 = this.al_fld.az_fld * -1441812743;
							int var17 = var18 + (int)(Math.random() * (var19 - var18));
							this.au_fld = var17;
						}
					}
				} else {
					if (this.as_fld != null) {
						this.as_fld.ag(0, var10, 150, ai_fld);
						wj.nc(this.as_fld, 1958165728);
					}

					if (null != this.af_fld) {
						this.af_fld.ag(0, var10, 150, ai_fld);
						wj.nc(this.af_fld, 2085056904);
					}
				}
			}
		} catch (Throwable var20) {
			throw new RuntimeException(var20);
		}
	}

	@ObfuscatedName("xf")
	@ObfuscatedSignature(
		descriptor = "(Ldr;Lwv;Lwn;I)V"
	)
	public static void xf(dr var0, wv var1, wn var2, int var3) {
		if (var0 == null) {
			var0.getClass();
		} else {
			if (var1 != null) {
				var0.ar_fld = var1;
				var0.aw_fld = kj.aw(var1.az_fld);
				var0.ay_fld = kj.aw(var1.ak_fld);
			}

			if (null != var2) {
				var0.al_fld = var2;
			}
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	abstract void ak(int var1) throws EOFException;

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(Lwj;II)V"
	)
	void bo(wj var1, int var2, int var3) {
		wj.nc(var1, 1958165222);
		wj.il(var1, var2, var3, this.ar_fld.av_fld);
		wj.nc(var1, 2096117682);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lwj;III)V"
	)
	void at(wj var1, int var2, int var3, int var4) {
		wj.nc(var1, 1964132903);
		wj.il(var1, var2, var3, this.ar_fld.av_fld);
		wj.nc(var1, 1971771280);
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(Lec;Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	public static int ba(ec var0, Object var1, Object var2) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.ak((rr)var1, (rr)var2);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	void ac(byte var1) {
		if (this.ar_fld != null) {
			wh var2 = this.ar_fld.av_fld;
			if (this.as_fld != null) {
				this.as_fld.ag(0, this.as_fld.av(), var2.ae(), var2.ay());
				wj.nc(this.as_fld, 1927707527);
			}

			if (this.af_fld != null) {
				if (var1 != 19) {
					return;
				}

				this.af_fld.ag(0, this.af_fld.av(), var2.ae(), var2.ay());
				wj.nc(this.af_fld, 2119738904);
			}
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lwj;B)V"
	)
	void aj(wj var1, byte var2) {
		if (var1 != null && wj.yt(var1, -1041602392) != null) {
			ny.km_fld.au(wj.yt(var1, -1726973551));
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	abstract int ag(int var1);

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int bb() {
		return this.ah_fld;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	abstract int av(byte var1);

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	abstract int ae(int var1);

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int bz(int var1) {
		return this.ah_fld;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	abstract int as();

	@ObfuscatedName("gx")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Override
	public void gx() {
		super.gy_void();
	}

	@ObfuscatedName("gy")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Override
	public void gy_void() {
		super.gy_void();
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int cc() {
		return this.aw_fld;
	}

	@ObfuscatedName("fw")
	@ObfuscatedSignature(
		descriptor = "(Ldr;I)I"
	)
	public static int fw(dr var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.aw_fld;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	abstract int ax();

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	abstract void ah() throws EOFException;

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	abstract void aw() throws EOFException;

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	abstract int ay();

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	abstract int az(int var1);

	@ObfuscatedName("getBackgroundSoundEffectIds")
	@ObfuscatedSignature(
		descriptor = "()[I"
	)
	@Override
	public int[] getBackgroundSoundEffectIds() {
		return this.al_fld.ak_fld;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	abstract int ar();

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bt() {
		if (this.ar_fld != null) {
			wh var1 = this.ar_fld.av_fld;
			if (this.as_fld != null) {
				this.as_fld.ag(0, this.as_fld.av(), var1.ae(), var1.ay());
				wj.nc(this.as_fld, 2123317989);
			}

			if (this.af_fld != null) {
				this.af_fld.ag(0, this.af_fld.av(), var1.ae(), var1.ay());
				wj.nc(this.af_fld, 2118779313);
			}
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	abstract int al();

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(Ldr;B)I"
	)
	public static int bk(dr var0, byte var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.ar_fld != null ? 1077344343 * var0.ar_fld.ag_fld : -1;
	}

	@ObfuscatedName("toString")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	@Override
	public String toString() {
		return super.toString();
	}

	@ObfuscatedName("qh")
	@ObfuscatedSignature(
		descriptor = "(Ldr;)Z"
	)
	public static boolean qh(dr var0) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ac((byte)19);
		if (var0.as_fld != null && var0.as_fld.av() == 0) {
			var0.aj(var0.as_fld, (byte)-89);
			var0.as_fld = null;
		}

		if (null != var0.af_fld && var0.af_fld.av() == 0) {
			var0.aj(var0.af_fld, (byte)62);
			var0.af_fld = null;
		}

		return var0.as_fld == null && var0.af_fld == null;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	abstract int an();

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	abstract int ai();

	@ObfuscatedName("getSoundEffectId")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getSoundEffectId() {
		return this.ar_fld.ag_fld * 1077344343;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	abstract int aq();

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	abstract int am();

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean bs() {
		this.ac((byte)19);
		if (this.as_fld != null && this.as_fld.av() == 0) {
			this.aj(this.as_fld, (byte)73);
			this.as_fld = null;
		}

		if (null != this.af_fld && this.af_fld.av() == 0) {
			this.aj(this.af_fld, (byte)-52);
			this.af_fld = null;
		}

		return this.as_fld == null && this.af_fld == null;
	}

	@ObfuscatedName("getPlane")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getPlane() {
		return this.ah_fld;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean bh() {
		this.ac((byte)19);
		if (this.as_fld != null && this.as_fld.av() == 0) {
			this.aj(this.as_fld, (byte)64);
			this.as_fld = null;
		}

		if (null != this.af_fld && this.af_fld.av() == 0) {
			this.aj(this.af_fld, (byte)3);
			this.af_fld = null;
		}

		return this.as_fld == null && this.af_fld == null;
	}

	@ObfuscatedName("gq")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String gq() {
		return super.toString();
	}

	@ObfuscatedName("mj")
	@ObfuscatedSignature(
		descriptor = "(Ldr;)Ljava/lang/String;"
	)
	public static String mj(dr var0) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.toString();
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(Lwv;Lwn;)V"
	)
	void by(wv var1, wn var2) {
		if (var1 != null) {
			this.ar_fld = var1;
			this.aw_fld = kj.aw(516285339 * var1.az_fld);
			this.ay_fld = kj.aw(var1.ak_fld * -172444611) * -490981082;
		}

		if (null != var2) {
			this.al_fld = var2;
		}
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(Lwv;Lwn;)V"
	)
	void bl(wv var1, wn var2) {
		if (var1 != null) {
			this.ar_fld = var1;
			this.aw_fld = kj.aw(-1425620074 * var1.az_fld) * -35833803;
			this.ay_fld = kj.aw(var1.ak_fld) * 849463182;
		}

		if (null != var2) {
			this.al_fld = var2;
		}
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(Lwv;Lwn;)V"
	)
	void bx(wv var1, wn var2) {
		if (var1 != null) {
			this.ar_fld = var1;
			this.aw_fld = kj.aw(var1.az_fld) * 1157841275;
			this.ay_fld = kj.aw(var1.ak_fld);
		}

		if (null != var2) {
			this.al_fld = var2;
		}
	}

	dr(int var1, wv var2, wn var3) {
		this.ah_fld = var1;
		xf(this, var2, var3, -1937441824);
		if (null != this.al_fld && this.al_fld.ak_fld != null) {
			int var6 = var3.ag_fld;
			int var7 = var3.az_fld;
			int var5 = var6 + (int)(Math.random() * (var7 - var6));
			this.au_fld = var5;
		}
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(Lwj;II)V"
	)
	void bp(wj var1, int var2, int var3) {
		wj.nc(var1, 1984894269);
		wj.il(var1, var2, var3, this.ar_fld.av_fld);
		wj.nc(var1, 2034308613);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIII)Lwj;"
	)
	wj ap(int var1, int var2, int var3, int var4) {
		try {
			int var5 = rl1.ei(do_.ha_fld, var1) - 1;
			af var6 = af.ag(do_.ha_fld, var1, var5);
			if (var6 != null) {
				al var7;
				if (0 == var5) {
					var7 = var6.az(cx.kq_fld.bl(-604134089));
				} else {
					if (var5 != 1) {
						return null;
					}

					var7 = var6.av();
				}

				wj var8 = new wj(var7, var2, var3);
				if (wj.yt(var8, 162394440) == null) {
					return null;
				} else {
					ny.km_fld.ax(wj.yt(var8, -2104964373));
					return var8;
				}
			} else {
				return null;
			}
		} catch (Throwable var9) {
			throw new RuntimeException(var9);
		}
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bi() {
		if (this.ar_fld != null) {
			wh var1 = this.ar_fld.av_fld;
			if (this.as_fld != null) {
				this.as_fld.ag(0, this.as_fld.av(), var1.ae(), var1.ay());
				wj.nc(this.as_fld, 2020766691);
			}

			if (this.af_fld != null) {
				this.af_fld.ag(0, this.af_fld.av(), var1.ae(), var1.ay());
				wj.nc(this.af_fld, 2032295927);
			}
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void am_void() {
		try {
			this.ak(-1343383056);
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bu() {
		if (this.ar_fld != null) {
			wh var1 = this.ar_fld.av_fld;
			if (this.as_fld != null) {
				this.as_fld.ag(0, this.as_fld.av(), var1.ae(), var1.ay());
				wj.nc(this.as_fld, 2066028319);
			}

			if (this.af_fld != null) {
				this.af_fld.ag(0, this.af_fld.av(), var1.ae(), var1.ay());
				wj.nc(this.af_fld, 1947509024);
			}
		}
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bc() {
		an_fld.av(this);
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int cq() {
		return this.aw_fld;
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int cp() {
		return this.ay_fld;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int bq() {
		return this.ah_fld;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean ad(int var1) {
		this.ac((byte)19);
		if (this.as_fld != null && this.as_fld.av() == 0) {
			this.aj(this.as_fld, (byte)42);
			this.as_fld = null;
		}

		if (null != this.af_fld && this.af_fld.av() == 0) {
			this.aj(this.af_fld, (byte)-9);
			this.af_fld = null;
		}

		return this.as_fld == null && this.af_fld == null;
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int bw() {
		return this.ar_fld != null ? 1077344343 * this.ar_fld.ag_fld : -1;
	}

	@ObfuscatedName("lf")
	@ObfuscatedSignature(
		descriptor = "(Ldr;IIIIIIIZ)V"
	)
	public static void lf(dr var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			} else {
				int var9 = ua.gp();
				if (var0.ax_fld) {
					if (var0.ad(1127862873)) {
						var0.ax_fld = false;
					}
				} else if (var0.ar_fld.ag_fld * 889205548 != -1 || var0.al_fld == null || var0.al_fld.ak_fld != null) {
					if (var9 != 0 && var8) {
						int var12 = 0;
						if (var1 < var3) {
							var12 += var3 - var1;
						} else if (var1 > var5) {
							var12 += var1 - var5;
						}

						if (var2 < var4) {
							var12 += var4 - var2;
						} else if (var2 > var6) {
							var12 += var2 - var6;
						}

						var12 = Math.max(var12 - -820150965, 0);
						if (var12 > var0.aw_fld) {
							var0.ac((byte)19);
						} else {
							double var22;
							if (var0.ay_fld < var0.aw_fld) {
								var22 = nl.az(var0.aw_fld - var12, var0.aw_fld - var0.ay_fld, wh.pw(var0.ar_fld.av_fld, 766893278));
							} else {
								var22 = 1.0;
							}

							int var14 = (int)Math.ceil(var22 * var9);
							if (null != var0.as_fld) {
								var0.at(var0.as_fld, var14, var9, -1183853430);
							} else if (1077344343 * var0.ar_fld.ag_fld >= 0 && var14 > 0) {
								var0.as_fld = var0.ap(1077344343 * var0.ar_fld.ag_fld, var14, -1, 1952490267);
							}

							if (null != var0.af_fld && wj.yt(var0.af_fld, -756567273) != null) {
								var0.at(var0.af_fld, var14, var9, 737018670);
							} else if (null != var0.al_fld && var0.al_fld.ak_fld != null && (var0.au_fld -= var7 * -355790309) * 1180923923 <= 0 && var14 > 0) {
								int var15 = var0.al_fld.ak_fld[(int)(Math.random() * var0.al_fld.ak_fld.length)];
								var0.af_fld = var0.ap(var15, var14, 0, 2080061205);
								if (var0.af_fld != null) {
									var0.af_fld.ag(var14, var9, var0.ar_fld.av_fld.aw(), wh.wa(var0.ar_fld.av_fld, (byte)1));
									wj.nc(var0.af_fld, 2009036760);
								}

								int var17 = var0.al_fld.ag_fld * 2044933640;
								int var18 = var0.al_fld.az_fld * 107401070;
								int var16 = var17 + (int)(Math.random() * (var18 - var17));
								var0.au_fld = var16;
							}
						}
					} else {
						if (var0.as_fld != null) {
							var0.as_fld.ag(0, var9, -195204504, ai_fld);
							wj.nc(var0.as_fld, 2040718643);
						}

						if (null != var0.af_fld) {
							var0.af_fld.ag(0, var9, 150, ai_fld);
							wj.nc(var0.af_fld, 1981456558);
						}
					}
				}
			}
		} catch (Throwable var20) {
			throw new RuntimeException(var20);
		}
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int cd() {
		return this.aw_fld;
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int bg() {
		return this.ah_fld;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	abstract int af();

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	int be(byte var1) {
		return this.ay_fld;
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int cy() {
		return this.ay_fld;
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int cf() {
		return this.ay_fld;
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int cx() {
		return this.ay_fld;
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int cs() {
		return this.ay_fld;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	abstract int au();

	@ObfuscatedName("gz")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Override
	public void gz() {
		super.gy_void();
	}

	@ObfuscatedName("ge")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Override
	public void ge_void() {
		super.gy_void();
	}

	@ObfuscatedName("gw")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Override
	public void gw() {
		super.gy_void();
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	abstract int aa();

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lsn;F)F"
	)
	static float ak(sn var0, float var1) {
		if (var0 == null || var0.as() == 0) {
			return 0.0F;
		} else if (!(var1 < var0.ae_fld[0].ak_fld * 157988587)) {
			if (var1 > var0.ae_fld[var0.as() - 1].ak_fld * 157988587) {
				return var0.av_fld == sd.ak_fld ? var0.ae_fld[var0.as() - 1].ag_fld : dx.ag(var0, var1, false);
			} else if (var0.ag_fld) {
				return var0.ae_fld[0].ag_fld;
			} else {
				sj var3 = var0.ay(var1);
				boolean var4 = false;
				boolean var5 = false;
				if (var3 == null) {
					return 0.0F;
				} else {
					if (var3.ae_fld == 0.0F && var3.ah_fld == 0.0F) {
						var4 = true;
					} else if (Float.MAX_VALUE == var3.ae_fld && var3.ah_fld == Float.MAX_VALUE) {
						var5 = true;
					} else if (null != var3.aw_fld) {
						if (var0.ai_fld) {
							float var6 = var3.ak_fld;
							float var10 = var3.ag_fld;
							float var7 = 0.33333334F * var3.ae_fld + var6;
							float var11 = var10 + 0.33333334F * var3.ah_fld;
							float var9 = var3.aw_fld.ak_fld * 157988587;
							float var13 = var3.aw_fld.ag_fld;
							float var8 = var9 - var3.aw_fld.az_fld * 0.33333334F;
							float var12 = var13 - 0.33333334F * var3.aw_fld.av_fld;
							if (var0.ak_fld) {
								float var16 = var11;
								float var17 = var12;
								if (null != var0) {
									float var18 = var9 - var6;
									if (0.0F != var18) {
										float var19 = var7 - var6;
										float var20 = var8 - var6;
										float[] var21 = new float[]{var19 / var18, var20 / var18};
										var0.ah_fld = 0.33333334F == var21[0] && 0.6666667F == var21[1];
										float var22 = var21[0];
										float var23 = var21[1];
										if (var21[0] < 0.0F) {
											var21[0] = 0.0F;
										}

										if (var21[1] > 1.0F) {
											var21[1] = 1.0F;
										}

										if (var21[0] > 1.0F || var21[1] < -1.0F) {
											by.av(var21, 1415596084);
										}

										if (var21[0] != var22) {
											float var14 = var18 * var21[0] + var6;
											if (var22 != 0.0F) {
												var16 = var10 + var21[0] * (var11 - var10) / var22;
											}
										}

										if (var23 != var21[1]) {
											float var15 = var6 + var18 * var21[1];
											if (1.0F != var23) {
												var17 = var13 - (1.0F - var21[1]) * (var13 - var12) / (1.0F - var23);
											}
										}

										var0.aw_fld = var6;
										var0.ay_fld = var9;
										float var24 = var21[0];
										float var25 = var21[1];
										float var26 = var24 - 0.0F;
										float var27 = var25 - var24;
										float var28 = 1.0F - var25;
										float var29 = var27 - var26;
										var0.al_fld = var28 - var27 - var29;
										var0.af_fld = var29 + var29 + var29;
										var0.ar_fld = var26 + var26 + var26;
										var0.as_fld = 0.0F;
										fz.ae(var10, var16, var17, var13, var0);
									}
								}
							} else {
								eu.az(var0, var6, var7, var8, var9, var10, var11, var12, var13);
							}

							var0.ai_fld = false;
						}
					} else {
						var4 = true;
					}

					if (var4) {
						return var3.ag_fld;
					} else if (var5) {
						return var3.ak_fld != var1 && var3.aw_fld != null ? var3.aw_fld.ag_fld : var3.ag_fld;
					} else if (var0.ak_fld) {
						float var31;
						if (var0 == null) {
							var31 = 0.0F;
						} else {
							float var33;
							if (var0.aw_fld == var1) {
								var33 = 0.0F;
							} else if (var1 == var0.ay_fld) {
								var33 = 1.0F;
							} else {
								var33 = (var1 - var0.aw_fld) / (var0.ay_fld - var0.aw_fld);
							}

							float var34;
							if (var0.ah_fld) {
								var34 = var33;
							} else {
								float[] var35 = new float[4];
								var35[3] = var0.al_fld;
								var35[2] = var0.af_fld;
								var35[1] = var0.ar_fld;
								var35[0] = var0.as_fld - var33;
								float[] var36 = new float[5];
								int var37 = sh.ak(var35, 3, 0.0F, true, 1.0F, true, var36);
								if (1 == var37) {
									var34 = var36[0];
								} else {
									var34 = 0.0F;
								}
							}

							var31 = var0.au_fld + (var0.ax_fld + var34 * (var34 * var0.aa_fld + var0.an_fld)) * var34;
						}

						return var31;
					} else {
						float var30;
						if (var0 == null) {
							var30 = 0.0F;
						} else {
							float var32 = var1 - var0.aw_fld;
							var30 = var0.al_fld + ((var0.as_fld * var32 + var0.ar_fld) * var32 + var0.af_fld) * var32;
						}

						return var30;
					}
				}
			}
		} else {
			return sd.ak_fld == var0.az_fld ? var0.ae_fld[0].ag_fld : dx.ag(var0, var1, true);
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lwv;Lwn;I)V"
	)
	void ab(wv var1, wn var2, int var3) {
		if (var1 != null) {
			this.ar_fld = var1;
			this.ay_fld = kj.aw(193667497 * var1.ak_fld) * 1108834599;
			this.au_fld = kj.ah(var1.az_fld * 1259083063) * 111668117;
		}

		if (null != var2) {
			this.al_fld = var2;
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	int bd(byte var1) {
		return this.ar_fld != null ? 1077344343 * this.ar_fld.ak_fld : -1;
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(Ldr;IIIIIIIZ)V"
	)
	public static void bx(dr var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			int var9 = ua.gp();
			if (var0.ax_fld) {
				if (var0.ad(890302620)) {
					var0.ax_fld = false;
				}
			} else if (var0.ar_fld.ag_fld * -1963866393 != -1 || var0.al_fld == null || var0.al_fld.ak_fld != null) {
				if (var9 != 0 && var8) {
					int var12 = 0;
					if (var1 < var3) {
						var12 += var3 - var1;
					} else if (var1 > var5) {
						var12 += var1 - var5;
					}

					if (var2 < var4) {
						var12 += var4 - var2;
					} else if (var2 > var6) {
						var12 += var2 - var6;
					}

					var12 = Math.max(var12 - -612050350, 0);
					if (var12 > var0.aw_fld) {
						var0.ac((byte)19);
					} else {
						double var22;
						if (var0.ay_fld < var0.aw_fld) {
							var22 = nl.az(var0.aw_fld - var12, var0.aw_fld - var0.ay_fld, wh.pw(var0.ar_fld.av_fld, 1274463752));
						} else {
							var22 = 1.0;
						}

						int var14 = (int)Math.ceil(var22 * var9);
						if (null != var0.as_fld) {
							var0.at(var0.as_fld, var14, var9, 2008582370);
						} else if (262609440 * var0.ar_fld.ag_fld >= 0 && var14 > 0) {
							var0.as_fld = var0.ap(1077344343 * var0.ar_fld.ag_fld, var14, -1, 1755536092);
						}

						if (null != var0.af_fld && wj.yt(var0.af_fld, -154913105) != null) {
							var0.at(var0.af_fld, var14, var9, 692705462);
						} else if (null != var0.al_fld && var0.al_fld.ak_fld != null && (var0.au_fld -= var7 * -355790309) * 1180923923 <= 0 && var14 > 0) {
							int var15 = var0.al_fld.ak_fld[(int)(Math.random() * var0.al_fld.ak_fld.length)];
							var0.af_fld = var0.ap(var15, var14, 0, 2053998499);
							if (var0.af_fld != null) {
								var0.af_fld.ag(var14, var9, var0.ar_fld.av_fld.aw(), wh.wa(var0.ar_fld.av_fld, (byte)1));
								wj.nc(var0.af_fld, 2032456014);
							}

							int var17 = var0.al_fld.ag_fld * -2106074171;
							int var18 = var0.al_fld.az_fld * -1441812743;
							int var16 = var17 + (int)(Math.random() * (var18 - var17));
							var0.au_fld = 1378576309 * var16;
						}
					}
				} else {
					if (var0.as_fld != null) {
						var0.as_fld.ag(0, var9, 150, ai_fld);
						wj.nc(var0.as_fld, 2109617425);
					}

					if (null != var0.af_fld) {
						var0.af_fld.ag(0, var9, 150, ai_fld);
						wj.nc(var0.af_fld, 2129816507);
					}
				}
			}
		} catch (Throwable var20) {
			throw new RuntimeException(var20);
		}
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int br(int var1) {
		return this.ah_fld;
	}

	@ObfuscatedName("gi")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String gi() {
		return super.toString();
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean bk() {
		this.ac((byte)19);
		if (this.af_fld != null && this.af_fld.av() == 0) {
			this.aj(this.as_fld, (byte)64);
			this.as_fld = null;
		}

		if (null != this.af_fld && this.as_fld.av() == 0) {
			this.aj(this.af_fld, (byte)3);
			this.as_fld = null;
		}

		return this.as_fld == null && this.af_fld == null;
	}
}
