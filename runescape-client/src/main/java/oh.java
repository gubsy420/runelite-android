import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("oh")
public class oh extends vc {
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1510306095
	)
	public int ah_fld = 0;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ag_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	static ub av_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	public static iw ae_fld = new iw(64);
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ak_fld;

	@ObfuscatedName("wj")
	@ObfuscatedSignature(
		descriptor = "(Lzv;Ljava/lang/String;II)V"
	)
	public static void wj(zv var0, String var1, int var2, int var3) {
		var3 -= var0.ap_fld;
		int var4 = -1;
		int var5 = -1;

		for (int var6 = 0; var6 < var1.length(); var6++) {
			if (var1.charAt(var6) != 0) {
				int var7 = (char)(vj.ak(var1.charAt(var6)) & 255);
				if (var7 == 1123750215) {
					var4 = var6;
				} else {
					if (var7 == 62 && var4 != -1) {
						String var8 = var1.substring(var4 + 1, var6);
						var4 = -1;
						if (var8.equals("lt")) {
							var7 = -1281919244;
						} else {
							if (!var8.equals("gt")) {
								if (var8.startsWith("img=")) {
									try {
										int var14 = tf.av(var8.substring(4));
										yc var15 = zv.ag_fld[var14];
										var15.ae(var2, var3 + var0.ap_fld - var15.ay_fld);
										var2 += var15.aw_fld;
										var5 = -1;
									} catch (Exception var11) {
									}
								} else {
									var0.iy(var8);
								}
								continue;
							}

							var7 = 62;
						}
					}

					if (var7 == 160) {
						var7 = -114963933;
					}

					if (var4 == -1) {
						if (var0.bs_fld != null && var5 != -1) {
							var2 += var0.bs_fld[(var5 << 8) + var7];
						}

						int var13 = var0.bz_fld[var7];
						int var9 = var0.bm_fld[var7];
						if (var7 != 32) {
							if (zv.as_fld == 256) {
								if (zv.ah_fld != -1) {
									zv.as(var0.aj_fld[var7], var2 + var0.bd_fld[var7] + 1, var3 + var0.br_fld[var7] + 1, var13, var9, zv.ah_fld);
								}

								var0.ak(var0.aj_fld[var7], var2 + var0.bd_fld[var7], var3 + var0.br_fld[var7], var13, var9, zv.ay_fld);
							} else {
								if (zv.ah_fld != -1) {
									zv.af(var0.aj_fld[var7], var2 + var0.bd_fld[var7] + 1, var3 + var0.br_fld[var7] + 1, var13, var9, zv.ah_fld, zv.as_fld);
								}

								var0.ae(var0.aj_fld[var7], var2 + var0.bd_fld[var7], var3 + var0.br_fld[var7], var13, var9, zv.ay_fld, zv.as_fld);
							}
						} else if (zv.ar_fld > 0) {
							zv.ad_fld = zv.ad_fld + zv.ar_fld;
							var2 += zv.ad_fld >> 8;
							zv.ad_fld &= -1412715170;
						}

						int var10 = var0.be_fld[var7];
						if (zv.az_fld != -1) {
							zv.ew(var2, var3 + (int)(var0.ap_fld * 0.7), var10, zv.az_fld);
						}

						if (zv.av_fld != -1) {
							zv.ew(var2, var3 + var0.ap_fld + 1, var10, zv.av_fld);
						}

						var2 += var10;
						var5 = var7;
					}
				}
			}
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Loh;"
	)
	public static oh ar(int var0) throws EOFException {
		try {
			oh var1 = (oh)ae_fld.ak(var0);
			if (null != var1) {
				return var1;
			} else {
				byte[] var2 = av_fld.bb(16, var0, 584982574);
				var1 = new oh();
				if (null != var2) {
					var1.az(new xi(var2));
				}

				ae_fld.az(var1, var0);
				return var1;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Loh;"
	)
	public static oh ay(int var0) throws EOFException {
		try {
			oh var1 = (oh)ae_fld.ak(var0);
			if (null != var1) {
				return var1;
			} else {
				byte[] var2 = av_fld.bb(16, var0, 584982574);
				var1 = new oh();
				if (null != var2) {
					var1.az(new xi(var2));
				}

				ae_fld.az(var1, var0);
				return var1;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Loh;"
	)
	public static oh aw(int var0) throws EOFException {
		try {
			oh var1 = (oh)ae_fld.ak(var0);
			if (null != var1) {
				return var1;
			} else {
				byte[] var2 = av_fld.bb(16, var0, 584982574);
				var1 = new oh();
				if (null != var2) {
					var1.az(new xi(var2));
				}

				ae_fld.az(var1, var0);
				return var1;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("vo")
	@ObfuscatedSignature(
		descriptor = "(Lqg;Lyz;)V"
	)
	public static void vo(qg var0, yz var1) {
		if (var0 == null) {
			var0.getClass();
		}

		no.dx(var0.ak_fld, var1);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	void an(xi var1, int var2) {
		if (var2 == 5) {
			this.ah_fld = var1.cm();
		}
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(Leg;)V"
	)
	public static void by(eg var0) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.be_fld = null;
		var0.bo_fld = null;
		var0.br_fld = null;
		var0.bp_fld = false;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lub;)V"
	)
	public static void ah(ub var0) {
		av_fld = var0;
		dt.az_fld = av_fld.ce(16, -493013599);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxi;IB)V"
	)
	void av(xi var1, int var2) {
		if (var2 == 5) {
			this.ah_fld = var1.cm();
		}
	}

	oh() {
	}

	@ObfuscatedName("gy")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	static final void gy(int var0) {
		la.ay();
		if (null != jr.fa_fld) {
			jr.fa_fld.aa((byte)65);
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void ae() {
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Loh;"
	)
	public static oh af(int var0) throws EOFException {
		try {
			oh var1 = (oh)ae_fld.ak(var0);
			if (null != var1) {
				return var1;
			} else {
				byte[] var2 = av_fld.bb(16, var0, 584982574);
				var1 = new oh();
				if (null != var2) {
					var1.az(new xi(var2));
				}

				ae_fld.az(var1, var0);
				return var1;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	void al(xi var1) {
		while (true) {
			int var2 = var1.cg();
			if (var2 == 0) {
				this.ae();
				return;
			}

			this.av(var1, var2);
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	void au(xi var1) {
		while (true) {
			int var2 = var1.cg();
			if (var2 == 0) {
				this.ae();
				return;
			}

			this.av(var1, var2);
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Loh;"
	)
	public static oh as(int var0) throws EOFException {
		try {
			oh var1 = (oh)ae_fld.ak(var0);
			if (null != var1) {
				return var1;
			} else {
				byte[] var2 = av_fld.bb(16, var0, 584982574);
				var1 = new oh();
				if (null != var2) {
					var1.az(new xi(var2));
				}

				ae_fld.az(var1, var0);
				return var1;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	void ax(xi var1, int var2) {
		if (var2 == 5) {
			this.ah_fld = var1.cm();
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ai() {
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lxi;B)V"
	)
	void az(xi var1) {
		while (true) {
			int var3 = var1.cg();
			if (var3 == 0) {
				this.ae();
				return;
			}

			this.av(var1, var3);
		}
	}
}
