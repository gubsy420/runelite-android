import java.io.EOFException;
import java.util.ArrayList;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("dv")
public class dv {
	@ObfuscatedGetter(
		intValue = 1454024875
	)
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int av_fld = 2087457283;
	@ObfuscatedGetter(
		intValue = -1148801037
	)
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int aw_fld = 1385596455;
	@ObfuscatedGetter(
		intValue = 406516685
	)
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int az_fld = 0;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/ArrayList;"
	)
	ArrayList ak_fld = new ArrayList(10);
	@ObfuscatedGetter(
		intValue = 656916375
	)
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ae_fld = -139632562;
	@ObfuscatedGetter(
		intValue = 1595463999
	)
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ah_fld = -464033777;
	@ObfuscatedGetter(
		intValue = -1296622523
	)
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ag_fld = 0;
	@ObfuscatedName("ja")
	@ObfuscatedSignature(
		descriptor = "[Lyc;"
	)
	static yc[] ja_fld;
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bk_fld;

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIIIIS)V"
	)
	void av(int var1, int var2, int var3, int var4, int var5, short var6) {
		if (var2 == var4 && -1 != var2 && var5 != var3) {
			this.az(aw_fld, var1, -1, var2, -1, var5 - var3);
		} else {
			if (-1 == var2 && -1 != var4) {
				if (var6 != 255) {
					return;
				}

				if (var5 > 0) {
					if (var6 != 255) {
						return;
					}

					boolean var10 = false;

					for (int var11 = 0; var11 < this.ag_fld; var11++) {
						dl var12 = (dl)(dl)this.ak_fld.get(var11);
						if (ae_fld == var12.ak_fld && var12.av_fld == var4) {
							if (var6 != 255) {
								return;
							}

							if (var12.ah_fld == var5) {
								var12.ak_fld = ah_fld;
								var12.az_fld = var1;
								var12.ae_fld = -350159659;
								var12.ah_fld = -1145789213;
								var10 = true;
								break;
							}
						}
					}

					if (!var10) {
						this.az(av_fld, var1, -1, var4, -1, var5);
					}

					return;
				}
			}

			if (-1 != var2 && -1 == var4 && var3 > 0) {
				boolean var7 = false;

				for (int var8 = 0; var8 < this.ag_fld; var8++) {
					if (var6 != 255) {
						return;
					}

					dl var9 = (dl)(dl)this.ak_fld.get(var8);
					if (var9.ak_fld == av_fld) {
						if (var6 != 255) {
							return;
						}

						if (var2 == var9.av_fld && var3 == var9.ah_fld) {
							var9.ak_fld = ah_fld;
							var9.az_fld = var1;
							var9.ae_fld = var9.av_fld * 52381291;
							var9.av_fld = 1736513983;
							var9.ah_fld = -1145789213;
							var7 = true;
							break;
						}
					}
				}

				if (!var7) {
					if (var6 != 255) {
						return;
					}

					this.az(ae_fld, var1, -1, var2, -1, var3);
				}
			} else if (-1 != var2 && -1 != var4 && var2 != var4) {
				this.az(ae_fld, var1, -1, var2, -1, var3);
				this.az(av_fld, var1, -1, var4, -1, var5);
			}
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V"
	)
	void an(int var1, int var2, int var3, int var4, int var5) {
		if (var2 == var4 && -1 != var2 && var5 != var3) {
			this.az(aw_fld, var1, -1, var2, -1, var5 - var3);
		} else if (-1 == var2 && -1 != var4 && var5 > 0) {
			boolean var9 = false;

			for (int var10 = 0; var10 < this.ag_fld; var10++) {
				dl var11 = (dl)(dl)this.ak_fld.get(var10);
				if (ae_fld == var11.ak_fld && var11.av_fld == var4 && var11.ah_fld == var5) {
					var11.ak_fld = ah_fld;
					var11.az_fld = var1;
					var11.ae_fld = -350159659;
					var11.ah_fld = -1145789213;
					var9 = true;
					break;
				}
			}

			if (!var9) {
				this.az(av_fld, var1, -1, var4, -1, var5);
			}
		} else if (-1 != var2 && -1 == var4 && var3 > 0) {
			boolean var6 = false;

			for (int var7 = 0; var7 < this.ag_fld; var7++) {
				dl var8 = (dl)(dl)this.ak_fld.get(var7);
				if (var8.ak_fld == av_fld && var2 == var8.av_fld && var3 == var8.ah_fld) {
					var8.ak_fld = ah_fld;
					var8.az_fld = var1;
					var8.ae_fld = var8.av_fld * 52381291;
					var8.av_fld = 1736513983;
					var8.ah_fld = -1145789213;
					var6 = true;
					break;
				}
			}

			if (!var6) {
				this.az(ae_fld, var1, -1, var2, -1, var3);
			}
		} else if (-1 != var2 && -1 != var4 && var2 != var4) {
			this.az(ae_fld, var1, -1, var2, -1, var3);
			this.az(av_fld, var1, -1, var4, -1, var5);
		}
	}

	@ObfuscatedName("ei")
	@ObfuscatedSignature(
		descriptor = "(Ldv;IIIIII)V"
	)
	public static void ei(dv var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (var0.ag_fld >= var0.ak_fld.size()) {
			var0.ak_fld.add(new dl());
		}

		dl.cz((dl)var0.ak_fld.get(var0.ag_fld), var1, var2, var3, var4, var5, var6, (byte)-98);
		var0.ag_fld++;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ag() {
		this.ag_fld = 0;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V"
	)
	void az(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (this.ag_fld >= this.ak_fld.size()) {
			this.ak_fld.add(new dl());
		}

		dl.cz((dl)this.ak_fld.get(this.ag_fld), var1, var2, var3, var4, var5, var6, (byte)-52);
		this.ag_fld++;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void ak(int var1, int var2) {
		for (int var3 = 0; var3 < var1; var3++) {
			if (var2 == 1901211938) {
				return;
			}

			this.ak_fld.add(new dl());
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ae() {
		boolean var6;
		do {
			int var2 = -1;
			int var3 = -1;
			int var4 = -1;
			int var5 = -1;
			var6 = false;

			for (int var7 = 1; var7 < this.ag_fld; var7++) {
				dl var8 = (dl)(dl)this.ak_fld.get(var7);
				dl var9 = (dl)(dl)this.ak_fld.get(var7 - 1);
				if (-1 == var2 && var9.ak_fld == ae_fld && av_fld == var8.ak_fld && var9.ag_fld == var8.ag_fld) {
					var2 = var8.ag_fld;
					var3 = var7;
					var4 = var9.av_fld;
					var5 = var8.av_fld;
				} else if (-1 != var2 && var9.ak_fld == ae_fld && var8.ak_fld == av_fld && var9.ag_fld == var8.ag_fld && var9.av_fld == var5 && var8.av_fld == var4) {
					dl var10 = (dl)(dl)this.ak_fld.get(var3);
					dl var11 = (dl)(dl)this.ak_fld.get(var3 - 1);
					var11.ak_fld = az_fld;
					var10.ak_fld = az_fld;
					var8.ak_fld = az_fld;
					var9.ak_fld = ah_fld;
					var9.az_fld = -1738548095 * var11.ag_fld;
					var9.ae_fld = 52381291 * var11.av_fld;
					var9.ah_fld = -1145789213;
					var6 = true;
					break;
				}
			}
		} while (var6);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void ah(int var1, int var2) throws EOFException {
		for (int var3 = 0; var3 < this.ag_fld; var3++) {
			dl var4 = (dl)(dl)this.ak_fld.get(var3);
			if (var4.ak_fld != 0) {
				this.aw(var1, var4);
			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ILdl;)V"
	)
	void aw(int var1, dl var2) throws EOFException {
		Object[] var4 = (Object[])(new Object[]{var1, var2.ak_fld, var2.ag_fld, var2.az_fld, var2.av_fld, var2.ae_fld, var2.ah_fld});
		yz var5 = gh.ag(18, (byte)70).av((Object[])var4, 1849801422).ax(25737810);
		va.ak(var5);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void ay(int var1) {
		for (int var2 = 0; var2 < var1; var2++) {
			this.ak_fld.add(new dl());
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ILdl;)V"
	)
	void ap(int var1, dl var2) throws EOFException {
		Object[] var3 = (Object[])(new Object[]{var1, -810672784 * var2.ak_fld, var2.ag_fld, -868160242 * var2.az_fld, var2.av_fld, var2.ae_fld, var2.ah_fld});
		yz var4 = gh.ag(18, (byte)-60).av((Object[])var3, 1163360723).ax(1234504384);
		va.ak(var4);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V"
	)
	void ax(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (this.ag_fld >= this.ak_fld.size()) {
			this.ak_fld.add(new dl());
		}

		dl.cz((dl)this.ak_fld.get(this.ag_fld), var1, var2, var3, var4, var5, var6, (byte)-54);
		this.ag_fld++;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void as(int var1) {
		for (int var2 = 0; var2 < var1; var2++) {
			this.ak_fld.add(new dl());
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void am() {
		boolean var5;
		do {
			int var1 = -1;
			int var2 = -1;
			int var3 = -1;
			int var4 = -1;
			var5 = false;

			for (int var6 = 1; var6 < this.ag_fld; var6++) {
				dl var7 = (dl)(dl)this.ak_fld.get(var6);
				dl var8 = (dl)(dl)this.ak_fld.get(var6 - 1);
				if (-1 == var1 && var8.ak_fld == ae_fld && av_fld == var7.ak_fld && var8.ag_fld == var7.ag_fld) {
					var1 = var7.ag_fld;
					var2 = var6;
					var3 = var8.av_fld;
					var4 = var7.av_fld;
				} else if (-1 != var1 && var8.ak_fld == ae_fld && var7.ak_fld == av_fld && var8.ag_fld == var7.ag_fld && var8.av_fld == var4 && var7.av_fld == var3) {
					dl var9 = (dl)(dl)this.ak_fld.get(var2);
					dl var10 = (dl)(dl)this.ak_fld.get(var2 - 1);
					var10.ak_fld = az_fld;
					var9.ak_fld = az_fld;
					var7.ak_fld = az_fld;
					var8.ak_fld = ah_fld;
					var8.az_fld = -1738548095 * var10.ag_fld;
					var8.ae_fld = 52381291 * var10.av_fld;
					var8.ah_fld = -1145789213;
					var5 = true;
					break;
				}
			}
		} while (var5);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lub;Lub;II)Lzf;"
	)
	public static zf ae(ub var0, ub var1, int var2, int var3) throws EOFException {
		if (!ms.ar(var0, var2, var3)) {
			return null;
		} else {
			byte[] var6 = var1.bb(var2, var3, 584982574);
			zf var5;
			if (null == var6) {
				var5 = null;
			} else {
				zf var7 = new zf(var6, yh.av_fld, yh.ae_fld, yh.ah_fld, yh.aw_fld, yh.ay_fld, yo.as_fld);
				jl.au();
				var5 = var7;
			}

			return var5;
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V"
	)
	void aa(int var1, int var2, int var3, int var4, int var5) {
		if (var2 == var4 && -1 != var2 && var5 != var3) {
			this.az(-570284105 * aw_fld, var1, -1, var2, -1, var5 - var3);
		} else if (-1 == var2 && -1 != var4 && var5 > 0) {
			boolean var9 = false;

			for (int var10 = 0; var10 < this.ag_fld; var10++) {
				dl var11 = (dl)(dl)this.ak_fld.get(var10);
				if (ae_fld == var11.ak_fld && var11.av_fld == var4 && var11.ah_fld == var5) {
					var11.ak_fld = ah_fld;
					var11.az_fld = var1;
					var11.ae_fld = -350159659;
					var11.ah_fld = -974694899;
					var9 = true;
					break;
				}
			}

			if (!var9) {
				this.az(av_fld, var1, -1, var4, -1, var5);
			}
		} else if (-1 != var2 && -1 == var4 && var3 > 0) {
			boolean var6 = false;

			for (int var7 = 0; var7 < this.ag_fld; var7++) {
				dl var8 = (dl)(dl)this.ak_fld.get(var7);
				if (var8.ak_fld == av_fld && var2 == var8.av_fld && var3 == var8.ah_fld) {
					var8.ak_fld = ah_fld * -2065577420;
					var8.az_fld = var1 * -2036040376;
					var8.ae_fld = var8.av_fld * 52381291;
					var8.av_fld = -1453312772;
					var8.ah_fld = -1145789213;
					var6 = true;
					break;
				}
			}

			if (!var6) {
				this.az(ae_fld, var1, -1, var2, -1, var3);
			}
		} else if (-1 != var2 && -1 != var4 && var2 != var4) {
			this.az(ae_fld, var1, -1, var2, -1, var3);
			this.az(av_fld, var1, -1, var4, -1, var5);
		}
	}

	@ObfuscatedName("fn")
	@ObfuscatedSignature(
		descriptor = "(Ldv;ILdl;)V"
	)
	public static void fn(dv var0, int var1, dl var2) throws EOFException {
		if (var0 == null) {
			var0.getClass();
		} else {
			Object[] var3 = (Object[])(new Object[]{var1, var2.ak_fld, var2.ag_fld, var2.az_fld, var2.av_fld, var2.ae_fld, var2.ah_fld});
			yz var4 = gh.ag(18, (byte)-73).av((Object[])var3, 1146017072).ax(-1524253707);
			va.ak(var4);
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V"
	)
	void ai(int var1, int var2, int var3, int var4, int var5) {
		if (var2 == var4 && -1 != var2 && var5 != var3) {
			this.az(aw_fld, var1, -1, var2, -1, var5 - var3);
		} else if (-1 == var2 && -1 != var4 && var5 > 0) {
			boolean var9 = false;

			for (int var10 = 0; var10 < this.ag_fld; var10++) {
				dl var11 = (dl)(dl)this.ak_fld.get(var10);
				if (ae_fld == var11.ak_fld && var11.av_fld == var4 && var11.ah_fld == var5) {
					var11.ak_fld = ah_fld;
					var11.az_fld = var1;
					var11.ae_fld = -350159659;
					var11.ah_fld = -1145789213;
					var9 = true;
					break;
				}
			}

			if (!var9) {
				this.az(av_fld, var1, -1, var4, -1, var5);
			}
		} else if (-1 != var2 && -1 == var4 && var3 > 0) {
			boolean var6 = false;

			for (int var7 = 0; var7 < this.ag_fld; var7++) {
				dl var8 = (dl)(dl)this.ak_fld.get(var7);
				if (var8.ak_fld == av_fld && var2 == var8.av_fld && var3 == var8.ah_fld) {
					var8.ak_fld = ah_fld;
					var8.az_fld = var1;
					var8.ae_fld = var8.av_fld * 52381291;
					var8.av_fld = 1736513983;
					var8.ah_fld = -1145789213;
					var6 = true;
					break;
				}
			}

			if (!var6) {
				this.az(ae_fld, var1, -1, var2, -1, var3);
			}
		} else if (-1 != var2 && -1 != var4 && var2 != var4) {
			this.az(ae_fld, var1, -1, var2, -1, var3);
			this.az(av_fld, var1, -1, var4, -1, var5);
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void ad(int var1) throws EOFException {
		for (int var2 = 0; var2 < this.ag_fld; var2++) {
			dl var3 = (dl)(dl)this.ak_fld.get(var2);
			if (var3.ak_fld != 0) {
				this.aw(var1, var3);
			}
		}
	}

	@ObfuscatedName("iz")
	@ObfuscatedSignature(
		descriptor = "(Ldv;)V"
	)
	public static void iz(dv var0) {
		if (var0 == null) {
			var0.getClass();
		}

		boolean var5;
		do {
			int var1 = -1;
			int var2 = -1;
			int var3 = -1;
			int var4 = -1;
			var5 = false;

			for (int var6 = 1; var6 < var0.ag_fld; var6++) {
				dl var7 = (dl)(dl)var0.ak_fld.get(var6);
				dl var8 = (dl)(dl)var0.ak_fld.get(var6 - 1);
				if (-1 == var1 && var8.ak_fld == ae_fld && av_fld == var7.ak_fld && var8.ag_fld == var7.ag_fld) {
					var1 = 1192138528 * var7.ag_fld;
					var2 = var6;
					var3 = 1046803960 * var8.av_fld;
					var4 = var7.av_fld * -1647502265;
				} else if (-1 != var1 && var8.ak_fld == ae_fld && var7.ak_fld == av_fld && var8.ag_fld == var7.ag_fld && var8.av_fld == var4 && var7.av_fld == var3) {
					dl var9 = (dl)(dl)var0.ak_fld.get(var2);
					dl var10 = (dl)(dl)var0.ak_fld.get(var2 - 1);
					var10.ak_fld = az_fld;
					var9.ak_fld = az_fld * 1556480029;
					var7.ak_fld = az_fld;
					var8.ak_fld = ah_fld * 320925992;
					var8.az_fld = -1738548095 * var10.ag_fld;
					var8.ae_fld = 52381291 * var10.av_fld;
					var8.ah_fld = -1145789213;
					var5 = true;
					break;
				}
			}
		} while (var5);
	}

	dv() {
		this.ak(10, -1556031456);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void ao(int var1) throws EOFException {
		for (int var2 = 0; var2 < this.ag_fld; var2++) {
			dl var3 = (dl)(dl)this.ak_fld.get(var2);
			if (var3.ak_fld * 1543770027 != 0) {
				this.aw(var1, var3);
			}
		}
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(Ldv;)V"
	)
	public static void cc(dv var0) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ag_fld = 0;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void ab(int var1) throws EOFException {
		for (int var2 = 0; var2 < this.ag_fld; var2++) {
			dl var3 = (dl)(dl)this.ak_fld.get(var2);
			if (var3.ak_fld != 0) {
				this.aw(var1, var3);
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void af() {
		this.ag_fld = 0;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ILdl;)V"
	)
	void at(int var1, dl var2) throws EOFException {
		Object[] var3 = (Object[])(new Object[]{
			var1, var2.ak_fld, -640945682 * var2.ag_fld, var2.az_fld, var2.av_fld * -2016081666, 571322192 * var2.ae_fld, var2.ah_fld * -957082862
		});
		yz var4 = gh.ag(18, (byte)-16).av((Object[])var3, 2134286660).ax(574804865);
		va.ak(var4);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ar() {
		this.ag_fld = 0;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IB)I"
	)
	public static int ag(int var0, byte var1) throws EOFException {
		ph var2 = lu.ag(var0);
		int var3 = var2.ae_fld;
		int var4 = var2.ah_fld;
		int var5 = var2.av_fld;
		int var6 = lb.az_fld[var5 - var4];
		return rt.ag_fld[var3] >> var4 & var6;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)[B"
	)
	public static byte[] ag(int var0, int var1) {
		return ic.ak(var0, false);
	}
}
