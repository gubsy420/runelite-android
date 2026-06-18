import java.io.EOFException;
import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;
import net.runelite.api.events.PlayerDespawned;

@ObfuscatedName("di")
public class di {
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] as_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "[Lcl;"
	)
	cl[] av_fld;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] ar_fld = new int[2048];
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] af_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[Z"
	)
	boolean[] ae_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[Lgt;"
	)
	gt[] ah_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lxi;"
	)
	xi aw_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] az_fld;
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bm_fld;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 450716151
	)
	int ax_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ag_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "[Ljava/lang/String;"
	)
	String[] ay_fld;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1540972327
	)
	int au_fld;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -273927123
	)
	int al_fld;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -910506503
	)
	int an_fld;
	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ci_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ak_fld;

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void an() {
		this.al_fld = 0;

		for (int var2 = 0; var2 < 2048; var2++) {
			this.av_fld[var2].cd();
		}
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bl() {
		for (int var1 = 0; var1 < this.ax_fld; var1++) {
			int var2 = this.af_fld[var1];
			cl var3 = this.av_fld[var2];
			Iterator var4 = client.da_fld.iterator();

			while (var4.hasNext()) {
				dx var5 = (dx)(dx)var4.next();
				cv var6 = (cv)var5.au_fld.ae(var2);
				if (var6 != null) {
					var3.av(var6);
					var6.mb();
				}
			}

			var3.dv();
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lxj;I)V"
	)
	final void ag(xj var1, int var2) {
		this.an();
		var1.as(1835603047);
		int var3 = client.dj_fld;
		cl var4 = this.av_fld[var3];
		int var5 = var1.ar(30, -106081977);
		cl.yp(var4, -1, (byte)1);
		var4.az_fld.ar(var5);
		var4.av_fld = 0;
		this.al_fld = 0;
		this.ar_fld[(this.al_fld += -9684059) * -273927123 - 1] = var3;
		this.au_fld = 0;

		for (int var6 = 1; var6 < 2048; var6++) {
			if (var6 == var3) {
				if (var2 != -1207804782) {
					return;
				}
			} else {
				int var7 = var1.ar(18, -106081977);
				int var8 = var7 >> 16;
				int var9 = var7 >> 8 & 0xFF;
				int var10 = var7 & 0xFF;
				cl.yp(this.av_fld[var6], kj.ak(var8, var9, var10), (byte)1);
				this.az_fld[(this.au_fld += -260300649) * 1540972327 - 1] = var6;
			}
		}

		var1.af(872525068);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void as(int var1) throws EOFException {
		client.es_fld = 0;
		Iterator var2 = client.da_fld.iterator();

		while (var2.hasNext()) {
			if (var1 == 1199024922) {
				return;
			}

			dx var3 = (dx)(dx)var2.next();
			this.ar(var3, -1496394045);
		}
	}

	@ObfuscatedName("hz")
	@ObfuscatedSignature(
		descriptor = "(Lcv;)V"
	)
	public void hz(cv var1) {
		if (var1 != null) {
			og.ci_fld.getCallbacks().post(new PlayerDespawned(var1));
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxj;B)V"
	)
	void av(xj var1, byte var2) {
		this.ax_fld = 0;
		int var3 = 0;
		var1.as(1354976927);

		for (int var4 = 0; var4 < this.al_fld; var4++) {
			int var5 = this.ar_fld[var4];
			if ((this.av_fld[var5].av_fld & 1) == 0) {
				if (var3 > 0) {
					var3--;
					this.av_fld[var5].av_fld = (byte)(this.av_fld[var5].av_fld | 2);
				} else {
					int var6 = var1.ar(1, -106081977);
					if (0 == var6) {
						var3 = uc(this, var1, 196256772);
						this.av_fld[var5].av_fld = (byte)(this.av_fld[var5].av_fld | 2);
					} else {
						this.ah(var1, var5, (byte)-87);
					}
				}
			}
		}

		var1.af(934723216);
		if (var3 != 0) {
			throw new RuntimeException();
		} else {
			var1.as(934871781);

			for (int var7 = 0; var7 < this.al_fld; var7++) {
				int var11 = this.ar_fld[var7];
				if (0 != (this.av_fld[var11].av_fld & 1)) {
					if (var3 > 0) {
						var3--;
						this.av_fld[var11].av_fld = (byte)(this.av_fld[var11].av_fld | 2);
					} else {
						int var14 = var1.ar(1, -106081977);
						if (var14 == 0) {
							var3 = uc(this, var1, 539464846);
							this.av_fld[var11].av_fld = (byte)(this.av_fld[var11].av_fld | 2);
						} else {
							this.ah(var1, var11, (byte)41);
						}
					}
				}
			}

			var1.af(-903449990);
			if (var3 != 0) {
				throw new RuntimeException();
			} else {
				var1.as(-613165895);

				for (int var8 = 0; var8 < this.au_fld; var8++) {
					int var12 = this.az_fld[var8];
					if ((this.av_fld[var12].av_fld & 1) != 0) {
						if (var2 >= 1) {
							return;
						}

						if (var3 > 0) {
							var3--;
							this.av_fld[var12].av_fld = (byte)(this.av_fld[var12].av_fld | 2);
						} else {
							int var15 = var1.ar(1, -106081977);
							if (var15 == 0) {
								var3 = uc(this, var1, -270786553);
								this.av_fld[var12].av_fld = (byte)(this.av_fld[var12].av_fld | 2);
							} else if (this.aw(var1, var12)) {
								this.av_fld[var12].av_fld = (byte)(this.av_fld[var12].av_fld | 2);
							}
						}
					}
				}

				var1.af(1868826832);
				if (var3 != 0) {
					throw new RuntimeException();
				} else {
					var1.as(1363379217);

					for (int var9 = 0; var9 < this.au_fld; var9++) {
						int var13 = this.az_fld[var9];
						if (0 == (this.av_fld[var13].av_fld & 1)) {
							if (var3 > 0) {
								if (var2 >= 1) {
									return;
								}

								var3--;
								this.av_fld[var13].av_fld = (byte)(this.av_fld[var13].av_fld | 2);
							} else {
								int var16 = var1.ar(1, -106081977);
								if (var16 == 0) {
									var3 = uc(this, var1, 1887156882);
									this.av_fld[var13].av_fld = (byte)(this.av_fld[var13].av_fld | 2);
								} else if (this.aw(var1, var13)) {
									this.av_fld[var13].av_fld = (byte)(this.av_fld[var13].av_fld | 2);
								}
							}
						}
					}

					var1.af(1477499512);
					if (0 != var3) {
						throw new RuntimeException();
					} else {
						this.al_fld = 0;
						this.au_fld = 0;

						for (int var10 = 1; var10 < 2048; var10++) {
							if (var2 >= 1) {
								return;
							}

							this.av_fld[var10].av_fld = (byte)(this.av_fld[var10].av_fld >> 1);
							if (this.av_fld[var10].aw(1349718386)) {
								if (var2 >= 1) {
									return;
								}

								this.ar_fld[(this.al_fld += -9684059) * -273927123 - 1] = var10;
							} else {
								this.az_fld[(this.au_fld += -260300649) * 1540972327 - 1] = var10;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lxj;IB)V"
	)
	void ah(xj var1, int var2, byte var3) {
		boolean var4 = var1.ar(1, -106081977) == 1;
		if (var4) {
			this.as_fld[(this.an_fld += -1004737463) * -910506503 - 1] = var2;
		}

		int var5 = var1.ar(2, -106081977);
		cl var6 = this.av_fld[var2];
		if (var5 == 0) {
			if (var4) {
				if (var3 != 33) {
					this.ae_fld[var2] = false;
				}
			} else if (client.dj_fld == var2) {
				throw new RuntimeException();
			} else {
				cl.be(var6, -178250224);
				if (var1.ar(1, -106081977) != 0) {
					this.aw(var1, var2);
				}

				this.af_fld[(this.ax_fld += 727166919) * 450716151 - 1] = var2;
			}
		} else if (var5 == 1) {
			int var14 = var1.ar(3, -106081977);
			kj var17 = var6.az_fld;
			if (var14 == 0) {
				var17.ak_fld--;
				var17.ag_fld--;
			} else if (1 == var14) {
				var17.ag_fld--;
			} else if (var14 == 2) {
				var17.ak_fld++;
				var17.ag_fld--;
			} else if (3 == var14) {
				if (var3 == 33) {
					return;
				}

				var17.ak_fld--;
			} else if (4 == var14) {
				var17.ak_fld++;
			} else if (var14 == 5) {
				var17.ak_fld--;
				var17.ag_fld++;
			} else if (6 == var14) {
				var17.ag_fld++;
			} else if (7 == var14) {
				var17.ak_fld++;
				var17.ag_fld++;
			}

			this.ae_fld[var2] = true;
			this.ah_fld[var2] = var6.ae_fld;
		} else if (var5 == 2) {
			int var13 = var1.ar(4, -106081977);
			kj var16 = var6.az_fld;
			if (0 == var13) {
				var16.ak_fld -= 2;
				var16.ag_fld -= 2;
			} else if (1 == var13) {
				var16.ak_fld--;
				var16.ag_fld -= 2;
			} else if (var13 == 2) {
				if (var3 == 33) {
					return;
				}

				var16.ag_fld -= 2;
			} else if (var13 == 3) {
				var16.ak_fld++;
				var16.ag_fld -= 2;
			} else if (var13 == 4) {
				var16.ak_fld += 2;
				var16.ag_fld -= 2;
			} else if (var13 == 5) {
				var16.ak_fld -= 2;
				var16.ag_fld--;
			} else if (var13 == 6) {
				if (var3 == 33) {
					return;
				}

				var16.ak_fld += 2;
				var16.ag_fld--;
			} else if (7 == var13) {
				var16.ak_fld -= 2;
			} else if (var13 == 8) {
				var16.ak_fld += 2;
			} else if (var13 == 9) {
				var16.ak_fld -= 2;
				var16.ag_fld++;
			} else if (var13 == 10) {
				var16.ak_fld += 2;
				var16.ag_fld++;
			} else if (var13 == 11) {
				if (var3 == 33) {
					return;
				}

				var16.ak_fld -= 2;
				var16.ag_fld += 2;
			} else if (12 == var13) {
				var16.ak_fld--;
				var16.ag_fld += 2;
			} else if (var13 == 13) {
				var16.ag_fld += 2;
			} else if (var13 == 14) {
				var16.ak_fld++;
				var16.ag_fld += 2;
			} else if (15 == var13) {
				var16.ak_fld += 2;
				var16.ag_fld += 2;
			}

			this.ae_fld[var2] = true;
			this.ah_fld[var2] = var6.ae_fld;
		} else {
			int var7 = var1.ar(1, -106081977);
			if (0 == var7) {
				int var15 = var1.ar(12, -106081977);
				int var18 = var15 >> 10;
				int var19 = var15 >> 5 & 31;
				if (var19 > 15) {
					var19 -= 32;
				}

				int var20 = var15 & 31;
				if (var20 > 15) {
					var20 -= 32;
				}

				kj var21 = var6.az_fld;
				var21.az_fld = 615342573 * (byte)(var21.az_fld + var18 & 3);
				var21.ak_fld += var19 * -1810751103;
				var21.ag_fld += var20 * -1225554487;
				this.ae_fld[var2] = true;
				this.ah_fld[var2] = var6.ae_fld;
			} else {
				int var8 = var1.ar(30, -106081977);
				int var9 = kj.ag(var8);
				int var10 = kj.az(var8);
				int var11 = kj.av(var8);
				kj var12 = var6.az_fld;
				var12.az_fld = (byte)(var9 + var12.az_fld & 3);
				var12.ak_fld = -1810751103 * (var10 + var12.ak_fld & 16383);
				var12.ag_fld = -1225554487 * (var12.ag_fld + var11 & 16383);
				this.ae_fld[var2] = true;
				this.ah_fld[var2] = var6.ae_fld;
			}
		}
	}

	@ObfuscatedName("qy")
	@ObfuscatedSignature(
		descriptor = "(Ldi;Lcv;I)V"
	)
	public static void qy(di var0, cv var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.hz(var1);
		if (var1 != null) {
			var0.av_fld[var1.bq_fld].av(var1);
		}
	}

	@ObfuscatedName("sy")
	@ObfuscatedSignature(
		descriptor = "(Ldi;I)Lrx;"
	)
	public static rx sy(di var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var1 >= 0 && var1 < var0.av_fld.length ? var0.av_fld[var1] : null;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lxj;IB)Z"
	)
	boolean aw(xj var1, int var2) {
		cl var4 = this.av_fld[var2];
		int var5 = var1.ar(2, -106081977);
		if (var5 == 0) {
			if (var1.ar(1, -106081977) != 0) {
				this.aw(var1, var2);
			}

			int var16 = var1.ar(13, -106081977);
			int var19 = var1.ar(13, -106081977);
			boolean var22 = var1.ar(1, -106081977) == 1;
			if (var22) {
				this.as_fld[(this.an_fld += -1004737463) * -910506503 - 1] = var2;
			}

			if (var4.aw(2066800489)) {
				throw new RuntimeException();
			} else {
				var4.as(var16, var19);
				this.ae_fld[var2] = false;
				return true;
			}
		} else if (1 == var5) {
			int var15 = var1.ar(2, -106081977);
			int var18 = var4.ay_fld;
			int var21 = kj.ag(var18) + var15 & 3;
			cl.oa(var4, var21, (byte)45);
			var4.ay_fld = 1483486233 * ((var21 << 28) + (var18 & 268435455));
			return false;
		} else if (2 == var5) {
			int var14 = var1.ar(5, -106081977);
			int var17 = var14 >> 3;
			int var20 = var14 & 7;
			int var23 = var4.ay_fld;
			int var24 = kj.ag(var23) + var17 & 3;
			int var25 = var23 >> 14 & 0xFF;
			int var26 = var23 & 0xFF;
			if (0 == var20) {
				var25--;
				var26--;
			}

			if (var20 == 1) {
				var26--;
			}

			if (var20 == 2) {
				var25++;
				var26--;
			}

			if (3 == var20) {
				var25--;
			}

			if (var20 == 4) {
				var25++;
			}

			if (5 == var20) {
				var25--;
				var26++;
			}

			if (6 == var20) {
				var26++;
			}

			if (7 == var20) {
				var25++;
				var26++;
			}

			cl.oa(var4, var24, (byte)45);
			var4.ay_fld = kj.ak(var24, var25, var26);
			return false;
		} else {
			int var6 = var1.ar(18, -106081977);
			int var7 = var6 >> 16;
			int var8 = var6 >> 8 & 0xFF;
			int var9 = var6 & 0xFF;
			int var10 = var4.ay_fld;
			int var11 = kj.ag(var10) + var7 & 3;
			cl.oa(var4, var11, (byte)45);
			int var12 = kj.az(var10) + var8 & 0xFF;
			int var13 = kj.av(var10) + var9 & 0xFF;
			var4.ay_fld = kj.ak(var4.al(1970928487), var12, var13);
			return false;
		}
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(Lxj;I)V"
	)
	void bk(xj var1, int var2) throws EOFException {
		for (int var3 = 0; var3 < this.an_fld; var3++) {
			int var4 = this.as_fld[var3];
			int var5 = var1.cg();
			if ((var5 & 2) != 0) {
				if (var2 == 915197995) {
					return;
				}

				var5 += var1.cg() << 8;
			}

			if (0 != (var5 & 16384)) {
				var5 += var1.cg() << 16;
			}

			this.au(var1, var4, var5, -2088174785);
		}
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(Lxj;II)V"
	)
	void bb(xj var1, int var2, int var3) throws EOFException {
		cl var4 = this.av_fld[var2];
		int var5 = Integer.MAX_VALUE;
		if ((var3 & 131072) != 0) {
			int var6 = var1.df();
			if (var6 > 0) {
				for (int var7 = 0; var7 < var6; var7++) {
					int var8 = var1.dz();
					int var9 = var1.dz();
					if (var9 != 32767) {
						int var10 = var1.dz();
						int var11 = var1.cg();
						int var12 = var9 > 0 ? var1.de() : var11;
						cl.zc(var4, var8, var9, var10, var11, var12);
					} else {
						cl.ga(var4, var8);
					}
				}
			}
		}

		if (0 != (var3 & 256)) {
			int var16 = xi.tl(var1, (byte)1);
			int var29 = var16 >> 8;
			int var37 = var29 >= 13 && var29 <= 20 ? var29 - 12 : 0;
			ki var43 = (ki)ka.ak(ti.ak(), var1.de());
			boolean var48 = var1.de() == 1;
			int var53 = var1.df();
			this.aw_fld.au_fld = 0;
			var1.dh(this.aw_fld.al_fld, 0, var53);
			this.aw_fld.au_fld = 0;
			String var57 = zv.ay(in.an(hr.ag(this.aw_fld)));
			byte[] var13 = null;
			if (var37 > 0 && var37 <= 8) {
				var13 = new byte[var37];

				for (int var14 = 0; var14 < var37; var14++) {
					var13[var14] = var1.dj();
				}
			}

			var4.ac(var16, var43, var48, var57, var13, (byte)-60);
		}

		if (0 != (var3 & 8)) {
			int var17 = var1.de();
			cl.cz(var4, var17, var1);
		}

		if ((var3 & 16) != 0) {
			String var18 = xi.at(var1, 166496896);
			var4.ad(var18);
		}

		if ((var3 & 2048) != 0) {
			var4.ae_fld = (gt)ka.ak(ge.ak(-824479380), xi.pb(var1, -1708285175));
			if (Integer.MAX_VALUE == var5) {
				this.ah_fld[var2] = var4.ae_fld;
			}
		}

		if ((var3 & 65536) != 0) {
			int var19 = var1.cg();

			for (int var30 = 0; var30 < var19; var30++) {
				int var38 = var1.df();
				int var44 = var1.ex();
				int var49 = var1.em();
				cl.gy(var4, var38, var44, var49 >> 16, var49 & 65535);
			}
		}

		if ((var3 & 32768) != 0) {
			byte var15 = var1.cw();
			if (var15 == 127) {
				this.ah_fld[var2] = gt.ak_fld;
			} else {
				this.ah_fld[var2] = (gt)ka.ak(ge.ak(-1241675626), var15);
			}
		}

		if ((var3 & 4096) != 0) {
			int var20 = client.dv_fld + var1.eo();
			int var31 = client.dv_fld + xi.tl(var1, (byte)1);
			byte var39 = xi.pb(var1, -1985742420);
			byte var45 = xi.pb(var1, -1894270363);
			byte var50 = xi.pb(var1, -1628943203);
			byte var54 = (byte)var1.cg();
			var4.bd(var20, var31, var39, var45, var50, var54);
		}

		if ((var3 & 128) != 0) {
			xi.tl(var1, (byte)1);
			var1.de();
			xi.iu(var1, -1527157562);
			int var21 = var1.cg();
			this.aw_fld.au_fld = 0;
			var1.el(this.aw_fld.al_fld, 0, var21);
			this.aw_fld.au_fld = 0;
		}

		if (0 != (var3 & 1024)) {
			for (int var22 = 0; var22 < 3; var22++) {
				this.ay_fld[var22] = xi.at(var1, 1705045318);
			}

			cl.da(var4, this.ay_fld, (byte)-37);
		}

		if ((var3 & 262144) != 0) {
			int var23 = var1.de();
			if (var23 > 0) {
				for (int var32 = 0; var32 < var23; var32++) {
					int var40 = var1.dz();
					int var46 = var1.dz();
					int var51 = var1.dz();
					int var55 = var1.dz();
					var4.ao(var40, var46, var51, var55);
				}
			}
		}

		if ((var3 & 64) != 0) {
			int var24 = var1.ex();
			int var33 = var1.de();
			var4.am(var24, var33);
		}

		if ((var3 & 1) != 0) {
			int var25 = var1.eo();
			if (var25 == 65535) {
				var25 = -1;
			}

			int var34 = var1.df();
			var4.aa(var25, var34);
		}

		if (0 != (var3 & 4)) {
			int var26 = var1.df();
			byte[] var35 = new byte[var26];
			xi var41 = new xi(var35);
			var1.eh(var35, 0, var26);
			var4.an(var41);
		}

		if (0 != (var3 & 32)) {
			int var27 = var1.eo();
			var4.at(var27);
		}

		if ((var3 & 8192) != 0) {
			byte var28 = var1.cw();
			byte var36 = var1.ep();
			byte var42 = xi.pb(var1, -1984396702);
			byte var47 = var1.dj();
			int var52 = var1.ex() + client.dv_fld;
			int var56 = xi.tl(var1, (byte)1) + client.dv_fld;
			int var58 = var1.ex();
			cl.zw(var4, var28, var36, var42, var47, var52, var56, var58, (short)26850);
			this.ae_fld[var2] = false;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ldx;I)V"
	)
	void ar(dx var1, int var2) throws EOFException {
		for (int var3 = 0; var3 < this.al_fld; var3++) {
			int var4;
			cl var5;
			cv var7;
			boolean var10000;
			if (var2 >= -344962779) {
				return;
			}

			label74: {
				var4 = this.ar_fld[var3];
				var5 = this.av_fld[var4];
				kj var6 = var5.az_fld;
				var7 = (cv)var1.au_fld.ae(var4);
				if (var6.ak_fld > var1.as_fld && var6.ag_fld > var1.ay_fld && var6.ak_fld < var1.as_fld + var1.ah_fld) {
					if (var2 >= -344962779) {
						return;
					}

					if (var6.ag_fld < var1.ay_fld + var1.aw_fld) {
						var10000 = true;
						break label74;
					}
				}

				var10000 = false;
			}

			boolean var8 = var10000;
			if (client.dj_fld == var4 && var8 && 0 != var1.ag_fld) {
				client.es_fld = -1784608945 * var1.ag_fld;
			}

			if (var8 && var7 == null) {
				var7 = var5.ah(var4, var1);
				cl.mv(var5, var7, -1629734723);
				xf.sk(var1.au_fld, var7, var4);
			} else if (!var8) {
				if (var2 >= -344962779) {
					return;
				}

				if (null != var7) {
					var5.av(var7);
					var7.mb();
				}
			}
		}
	}

	@ObfuscatedName("zm")
	@ObfuscatedSignature(
		descriptor = "(Ldi;Lxj;I)V"
	)
	public static void zm(di var0, xj var1, int var2) throws EOFException {
		if (var0 == null) {
			var0.getClass();
		}

		int var3 = var1.au_fld * -520382865;
		var0.an_fld = 0;
		var0.av(var1, (byte)-42);
		var0.ay((byte)34);
		var0.as(1256262501);
		var0.bk(var1, -1698084881);
		var0.al(1217613053);
		if (var1.au_fld - var3 != var2) {
			throw new RuntimeException(var1.au_fld - var3 + " " + var2);
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Lrx;"
	)
	rx ao(int var1) {
		return var1 >= 0 && var1 < this.av_fld.length ? this.av_fld[var1] : null;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lxj;III)V"
	)
	void au(xj var1, int var2, int var3, int var4) throws EOFException {
		cl var5 = this.av_fld[var2];
		int var6 = Integer.MAX_VALUE;
		if ((var3 & 131072) != 0) {
			int var7 = var1.df();
			if (var7 > 0) {
				if (var4 >= -2049343944) {
					return;
				}

				for (int var8 = 0; var8 < var7; var8++) {
					int var9 = var1.dz();
					int var10 = var1.dz();
					if (var10 != 32767) {
						int var11 = var1.dz();
						int var12 = var1.cg();
						int var10000;
						if (var10 > 0) {
							if (var4 >= -2049343944) {
								return;
							}

							var10000 = var1.de();
						} else {
							var10000 = var12;
						}

						int var13 = var10000;
						cl.zc(var5, var9, var10, var11, var12, var13);
					} else {
						cl.ga(var5, var9);
					}
				}
			}
		}

		if (0 != (var3 & 256)) {
			int var17 = xi.tl(var1, (byte)1);
			int var30 = var17 >> 8;
			int var38 = var30 >= 13 && var30 <= 20 ? var30 - 12 : 0;
			ki var44 = (ki)ka.ak(ti.ak(), var1.de());
			boolean var49 = var1.de() == 1;
			int var54 = var1.df();
			this.aw_fld.au_fld = 0;
			var1.dh(this.aw_fld.al_fld, 0, var54);
			this.aw_fld.au_fld = 0;
			String var58 = zv.ay(in.an(hr.ag(this.aw_fld)));
			byte[] var14 = null;
			if (var38 > 0 && var38 <= 8) {
				if (var4 >= -2049343944) {
					return;
				}

				var14 = new byte[var38];

				for (int var15 = 0; var15 < var38; var15++) {
					var14[var15] = var1.dj();
				}
			}

			var5.ac(var17, var44, var49, var58, var14, (byte)71);
		}

		if (0 != (var3 & 8)) {
			int var18 = var1.de();
			cl.cz(var5, var18, var1);
		}

		if ((var3 & 16) != 0) {
			if (var4 >= -2049343944) {
				return;
			}

			String var19 = xi.at(var1, -1592067221);
			var5.ad(var19);
		}

		if ((var3 & 2048) != 0) {
			var5.ae_fld = (gt)ka.ak(ge.ak(-1925779397), xi.pb(var1, -1510198870));
			if (Integer.MAX_VALUE == var6) {
				this.ah_fld[var2] = var5.ae_fld;
			}
		}

		if ((var3 & 65536) != 0) {
			int var20 = var1.cg();

			for (int var31 = 0; var31 < var20; var31++) {
				int var39 = var1.df();
				int var45 = var1.ex();
				int var50 = var1.em();
				cl.gy(var5, var39, var45, var50 >> 16, var50 & 65535);
			}
		}

		if ((var3 & 32768) != 0) {
			if (var4 >= -2049343944) {
				return;
			}

			byte var16 = var1.cw();
			if (var16 == 127) {
				this.ah_fld[var2] = gt.ak_fld;
			} else {
				this.ah_fld[var2] = (gt)ka.ak(ge.ak(-2042151594), var16);
			}
		}

		if ((var3 & 4096) != 0) {
			if (var4 >= -2049343944) {
				return;
			}

			int var21 = client.dv_fld + var1.eo();
			int var32 = client.dv_fld + xi.tl(var1, (byte)1);
			byte var40 = xi.pb(var1, -2138521840);
			byte var46 = xi.pb(var1, -1873587485);
			byte var51 = xi.pb(var1, -2021156308);
			byte var55 = (byte)var1.cg();
			var5.bd(var21, var32, var40, var46, var51, var55);
		}

		if ((var3 & 128) != 0) {
			if (var4 >= -2049343944) {
				return;
			}

			xi.tl(var1, (byte)1);
			var1.de();
			xi.iu(var1, -519527577);
			int var22 = var1.cg();
			this.aw_fld.au_fld = 0;
			var1.el(this.aw_fld.al_fld, 0, var22);
			this.aw_fld.au_fld = 0;
		}

		if (0 != (var3 & 1024)) {
			for (int var23 = 0; var23 < 3; var23++) {
				this.ay_fld[var23] = xi.at(var1, 1955261850);
			}

			cl.da(var5, this.ay_fld, (byte)-94);
		}

		if ((var3 & 262144) != 0) {
			int var24 = var1.de();
			if (var24 > 0) {
				if (var4 >= -2049343944) {
					return;
				}

				for (int var33 = 0; var33 < var24; var33++) {
					int var41 = var1.dz();
					int var47 = var1.dz();
					int var52 = var1.dz();
					int var56 = var1.dz();
					var5.ao(var41, var47, var52, var56);
				}
			}
		}

		if ((var3 & 64) != 0) {
			int var25 = var1.ex();
			int var34 = var1.de();
			var5.am(var25, var34);
		}

		if ((var3 & 1) != 0) {
			int var26 = var1.eo();
			if (var26 == 65535) {
				var26 = -1;
			}

			int var35 = var1.df();
			var5.aa(var26, var35);
		}

		if (0 != (var3 & 4)) {
			int var27 = var1.df();
			byte[] var36 = new byte[var27];
			xi var42 = new xi(var36);
			var1.eh(var36, 0, var27);
			var5.an(var42);
		}

		if (0 != (var3 & 32)) {
			int var28 = var1.eo();
			var5.at(var28);
		}

		if ((var3 & 8192) != 0) {
			byte var29 = var1.cw();
			byte var37 = var1.ep();
			byte var43 = xi.pb(var1, -1956679190);
			byte var48 = var1.dj();
			int var53 = var1.ex() + client.dv_fld;
			int var57 = xi.tl(var1, (byte)1) + client.dv_fld;
			int var59 = var1.ex();
			cl.zw(var5, var29, var37, var43, var48, var53, var57, var59, (short)15083);
			this.ae_fld[var2] = false;
		}
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(Lxj;)V"
	)
	void bn(xj var1) throws EOFException {
		for (int var2 = 0; var2 < this.an_fld; var2++) {
			int var3 = this.as_fld[var2];
			int var4 = var1.cg();
			if ((var4 & 2) != 0) {
				var4 += var1.cg() << 8;
			}

			if (0 != (var4 & -1113694475)) {
				var4 += var1.cg() << 16;
			}

			this.au(var1, var3, var4, -2134460834);
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lxj;I)V"
	)
	void af(xj var1, int var2) {
		boolean var3 = var1.ar(1, -106081977) == 1;
		if (var3) {
			this.as_fld[(this.an_fld += -1004737463) * -910506503 - 1] = var2;
		}

		int var4 = var1.ar(2, -106081977);
		cl var5 = this.av_fld[var2];
		if (var4 == 0) {
			if (var3) {
				this.ae_fld[var2] = false;
			} else if (client.dj_fld == var2) {
				throw new RuntimeException();
			} else {
				cl.be(var5, 1606003730);
				if (var1.ar(1, -106081977) != 0) {
					this.aw(var1, var2);
				}

				this.af_fld[(this.ax_fld += 727166919) * 450716151 - 1] = var2;
			}
		} else if (var4 == 1) {
			int var13 = var1.ar(3, -106081977);
			kj var16 = var5.az_fld;
			if (var13 == 0) {
				var16.ak_fld--;
				var16.ag_fld--;
			} else if (1 == var13) {
				var16.ag_fld--;
			} else if (var13 == 2) {
				var16.ak_fld++;
				var16.ag_fld--;
			} else if (3 == var13) {
				var16.ak_fld--;
			} else if (4 == var13) {
				var16.ak_fld++;
			} else if (var13 == 5) {
				var16.ak_fld--;
				var16.ag_fld++;
			} else if (6 == var13) {
				var16.ag_fld++;
			} else if (7 == var13) {
				var16.ak_fld++;
				var16.ag_fld++;
			}

			this.ae_fld[var2] = true;
			this.ah_fld[var2] = var5.ae_fld;
		} else if (var4 == 2) {
			int var12 = var1.ar(4, -106081977);
			kj var15 = var5.az_fld;
			if (0 == var12) {
				var15.ak_fld -= 2;
				var15.ag_fld -= 2;
			} else if (1 == var12) {
				var15.ak_fld--;
				var15.ag_fld -= 2;
			} else if (var12 == 2) {
				var15.ag_fld -= 2;
			} else if (var12 == 3) {
				var15.ak_fld++;
				var15.ag_fld -= 2;
			} else if (var12 == 4) {
				var15.ak_fld += 2;
				var15.ag_fld -= 2;
			} else if (var12 == 5) {
				var15.ak_fld -= 2;
				var15.ag_fld--;
			} else if (var12 == 6) {
				var15.ak_fld += 2;
				var15.ag_fld--;
			} else if (7 == var12) {
				var15.ak_fld -= 2;
			} else if (var12 == 8) {
				var15.ak_fld += 2;
			} else if (var12 == 9) {
				var15.ak_fld -= 2;
				var15.ag_fld++;
			} else if (var12 == 10) {
				var15.ak_fld += 2;
				var15.ag_fld++;
			} else if (var12 == 11) {
				var15.ak_fld -= 2;
				var15.ag_fld += 2;
			} else if (12 == var12) {
				var15.ak_fld--;
				var15.ag_fld += 2;
			} else if (var12 == 13) {
				var15.ag_fld += 2;
			} else if (var12 == 14) {
				var15.ak_fld++;
				var15.ag_fld += 2;
			} else if (15 == var12) {
				var15.ak_fld += 2;
				var15.ag_fld += 2;
			}

			this.ae_fld[var2] = true;
			this.ah_fld[var2] = var5.ae_fld;
		} else {
			int var6 = var1.ar(1, -106081977);
			if (0 == var6) {
				int var14 = var1.ar(12, -106081977);
				int var17 = var14 >> 10;
				int var18 = var14 >> 5 & 31;
				if (var18 > 15) {
					var18 -= 32;
				}

				int var19 = var14 & 31;
				if (var19 > 15) {
					var19 -= 32;
				}

				kj var20 = var5.az_fld;
				var20.az_fld = 615342573 * (byte)(var20.az_fld + var17 & 3);
				var20.ak_fld += var18 * -1810751103;
				var20.ag_fld += var19 * -1225554487;
				this.ae_fld[var2] = true;
				this.ah_fld[var2] = var5.ae_fld;
			} else {
				int var7 = var1.ar(30, -106081977);
				int var8 = kj.ag(var7);
				int var9 = kj.az(var7);
				int var10 = kj.av(var7);
				kj var11 = var5.az_fld;
				var11.az_fld = (byte)(var8 + var11.az_fld & 3);
				var11.ak_fld = -1810751103 * (var9 + var11.ak_fld & 16383);
				var11.ag_fld = -1225554487 * (var11.ag_fld + var10 & 16383);
				this.ae_fld[var2] = true;
				this.ah_fld[var2] = var5.ae_fld;
			}
		}
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(Lxj;I)V"
	)
	void bh(xj var1, int var2) {
		boolean var3 = var1.ar(1, -106081977) == 1;
		if (var3) {
			this.as_fld[(this.an_fld += -1004737463) * -910506503 - 1] = var2;
		}

		int var4 = var1.ar(2, -106081977);
		cl var5 = this.av_fld[var2];
		if (var4 == 0) {
			if (var3) {
				this.ae_fld[var2] = false;
			} else if (client.dj_fld == var2) {
				throw new RuntimeException();
			} else {
				cl.be(var5, -1190222514);
				if (var1.ar(1, -106081977) != 0) {
					this.aw(var1, var2);
				}

				this.af_fld[(this.ax_fld += 727166919) * 450716151 - 1] = var2;
			}
		} else if (var4 == 1) {
			int var13 = var1.ar(3, -106081977);
			kj var16 = var5.az_fld;
			if (var13 == 0) {
				var16.ak_fld--;
				var16.ag_fld--;
			} else if (1 == var13) {
				var16.ag_fld--;
			} else if (var13 == 2) {
				var16.ak_fld++;
				var16.ag_fld--;
			} else if (3 == var13) {
				var16.ak_fld--;
			} else if (4 == var13) {
				var16.ak_fld++;
			} else if (var13 == 5) {
				var16.ak_fld--;
				var16.ag_fld++;
			} else if (6 == var13) {
				var16.ag_fld++;
			} else if (7 == var13) {
				var16.ak_fld++;
				var16.ag_fld++;
			}

			this.ae_fld[var2] = true;
			this.ah_fld[var2] = var5.ae_fld;
		} else if (var4 == 2) {
			int var12 = var1.ar(4, -106081977);
			kj var15 = var5.az_fld;
			if (0 == var12) {
				var15.ak_fld -= 2;
				var15.ag_fld -= 2;
			} else if (1 == var12) {
				var15.ak_fld--;
				var15.ag_fld -= 2;
			} else if (var12 == 2) {
				var15.ag_fld -= 2;
			} else if (var12 == 3) {
				var15.ak_fld++;
				var15.ag_fld -= 2;
			} else if (var12 == 4) {
				var15.ak_fld += 2;
				var15.ag_fld -= 2;
			} else if (var12 == 5) {
				var15.ak_fld -= 2;
				var15.ag_fld--;
			} else if (var12 == 6) {
				var15.ak_fld += 2;
				var15.ag_fld--;
			} else if (7 == var12) {
				var15.ak_fld -= 2;
			} else if (var12 == 8) {
				var15.ak_fld += 2;
			} else if (var12 == 9) {
				var15.ak_fld -= 2;
				var15.ag_fld++;
			} else if (var12 == 10) {
				var15.ak_fld += 2;
				var15.ag_fld++;
			} else if (var12 == 11) {
				var15.ak_fld -= 2;
				var15.ag_fld += 2;
			} else if (12 == var12) {
				var15.ak_fld--;
				var15.ag_fld += 2;
			} else if (var12 == 13) {
				var15.ag_fld += 2;
			} else if (var12 == 14) {
				var15.ak_fld++;
				var15.ag_fld += 2;
			} else if (15 == var12) {
				var15.ak_fld += 2;
				var15.ag_fld += 2;
			}

			this.ae_fld[var2] = true;
			this.ah_fld[var2] = var5.ae_fld;
		} else {
			int var6 = var1.ar(1, -106081977);
			if (0 == var6) {
				int var14 = var1.ar(12, -106081977);
				int var17 = var14 >> 10;
				int var18 = var14 >> 5 & 31;
				if (var18 > 15) {
					var18 -= 32;
				}

				int var19 = var14 & 31;
				if (var19 > 15) {
					var19 -= 32;
				}

				kj var20 = var5.az_fld;
				var20.az_fld = 615342573 * (byte)(var20.az_fld + var17 & 3);
				var20.ak_fld += var18 * -1810751103;
				var20.ag_fld += var19 * -1225554487;
				this.ae_fld[var2] = true;
				this.ah_fld[var2] = var5.ae_fld;
			} else {
				int var7 = var1.ar(30, -106081977);
				int var8 = kj.ag(var7);
				int var9 = kj.az(var7);
				int var10 = kj.av(var7);
				kj var11 = var5.az_fld;
				var11.az_fld = (byte)(var8 + var11.az_fld & 3);
				var11.ak_fld = -1810751103 * (var9 + var11.ak_fld & 16383);
				var11.ag_fld = -1225554487 * (var11.ag_fld + var10 & 16383);
				this.ae_fld[var2] = true;
				this.ah_fld[var2] = var5.ae_fld;
			}
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)Lrx;"
	)
	rx ad(int var1) {
		return var1 >= 0 && var1 < this.av_fld.length ? this.av_fld[var1] : null;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lxj;)V"
	)
	final void ac(xj var1) {
		this.an();
		var1.as(-379543771);
		int var2 = client.dj_fld;
		cl var3 = this.av_fld[var2];
		int var4 = var1.ar(30, -106081977);
		cl.yp(var3, -1, (byte)1);
		var3.az_fld.ar(var4);
		var3.av_fld = 0;
		this.al_fld = 0;
		this.ar_fld[(this.al_fld += -9684059) * -273927123 - 1] = var2;
		this.au_fld = 0;

		for (int var5 = 1; var5 < 2048; var5++) {
			if (var5 != var2) {
				int var6 = var1.ar(18, -106081977);
				int var7 = var6 >> 16;
				int var8 = var6 >> 8 & 0xFF;
				int var9 = var6 & 0xFF;
				cl.yp(this.av_fld[var5], kj.ak(var7, var8, var9), (byte)1);
				this.az_fld[(this.au_fld += -260300649) * 1540972327 - 1] = var5;
			}
		}

		var1.af(292636571);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Lrx;"
	)
	rx ai(int var1) {
		return var1 >= 0 && var1 < this.av_fld.length ? this.av_fld[var1] : null;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lxj;)V"
	)
	final void ap(xj var1) {
		this.an();
		var1.as(-367097064);
		int var2 = client.dj_fld;
		cl var3 = this.av_fld[var2];
		int var4 = var1.ar(30, -106081977);
		cl.yp(var3, -1, (byte)1);
		var3.az_fld.ar(var4);
		var3.av_fld = 0;
		this.al_fld = 0;
		this.ar_fld[(this.al_fld += -9684059) * -273927123 - 1] = var2;
		this.au_fld = 0;

		for (int var5 = 1; var5 < 2048; var5++) {
			if (var5 != var2) {
				int var6 = var1.ar(18, -106081977);
				int var7 = var6 >> 16;
				int var8 = var6 >> 8 & 0xFF;
				int var9 = var6 & 0xFF;
				cl.yp(this.av_fld[var5], kj.ak(var7, var8, var9), (byte)1);
				this.az_fld[(this.au_fld += -260300649) * 1540972327 - 1] = var5;
			}
		}

		var1.af(-1404776600);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	void ay(byte var1) {
		for (int var2 = 0; var2 < this.ax_fld; var2++) {
			if (var1 <= 0) {
				return;
			}

			int var3 = this.af_fld[var2];
			cl var4 = this.av_fld[var3];
			Iterator var5 = client.da_fld.iterator();

			while (var5.hasNext()) {
				dx var6 = (dx)(dx)var5.next();
				cv var7 = (cv)var6.au_fld.ae(var3);
				if (var7 != null) {
					if (var1 <= 0) {
						return;
					}

					var4.av(var7);
					var7.mb();
				}
			}

			var4.dv();
		}
	}

	@ObfuscatedName("jb")
	@ObfuscatedSignature(
		descriptor = "(Lxj;I)V"
	)
	public void jb(xj var1, int var2) {
		da.nx_fld = true;
	}

	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "(Ldx;IIIIISISIIB)V"
	)
	static void dy(dx var0, int var1, int var2, int var3, int var4, int var5, short var6, int var7, short var8, int var9, int var10, byte var11) throws EOFException {
		na var12 = var0.aa_fld[var1][var2][var3];
		if (var12 != null) {
			for (dw var13 = (dw)var12.aw(); var13 != null; var13 = (dw)na.iy(var12)) {
				if (var13.ah_fld == var4) {
					if (var11 >= 7) {
						return;
					}

					if (var5 == var13.ay_fld) {
						if (var11 >= 7) {
							return;
						}

						oo var14 = var13.aw(853948365);
						if (var14 == null) {
							var14 = new oo(var4);
						}

						if (oo.tz(var14, (byte)-1) && var7 > -1 && var7 < var14.ae_fld.length) {
							var14.ae_fld[var7] = var6;
						}

						if (var14.ag((byte)53) && var9 > -1 && var9 < var14.ah_fld.length) {
							if (var11 >= 7) {
								return;
							}

							var14.ah_fld[var9] = var8;
						}

						if (var10 > -1) {
							var14.af_fld = var10;
							var14.al_fld = null;
						}

						dw.lr(var13, var14, -2091273894);
						break;
					}
				}
			}

			jv.er(var1, var2, var3);
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void al(int var1) throws EOFException {
		for (int var2 = 0; var2 < this.al_fld; var2++) {
			int var3 = this.ar_fld[var2];
			if (this.ae_fld[var3]) {
				if (var1 != 1217613053) {
					return;
				}

				cl var4 = this.av_fld[var3];
				var4.ax(this.ah_fld[var3], (byte)76);
				this.ae_fld[var3] = false;
			}
		}
	}

	@ObfuscatedName("hx")
	@ObfuscatedSignature(
		descriptor = "(Ldi;Lxj;I)V"
	)
	public static void hx(di var0, xj var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		boolean var3 = var1.ar(1, -106081977) == 1;
		if (var3) {
			var0.as_fld[(var0.an_fld += -1004737463) * -910506503 - 1] = var2;
		}

		int var4 = var1.ar(2, -106081977);
		cl var5 = var0.av_fld[var2];
		if (var4 == 0) {
			if (var3) {
				var0.ae_fld[var2] = false;
			} else if (client.dj_fld == var2) {
				throw new RuntimeException();
			} else {
				cl.be(var5, -1152427193);
				if (var1.ar(1, -106081977) != 0) {
					var0.aw(var1, var2);
				}

				var0.af_fld[(var0.ax_fld += 727166919) * 450716151 - 1] = var2;
			}
		} else if (var4 == 1) {
			int var13 = var1.ar(3, -106081977);
			kj var16 = var5.az_fld;
			if (var13 == 0) {
				var16.ak_fld--;
				var16.ag_fld--;
			} else if (1 == var13) {
				var16.ag_fld--;
			} else if (var13 == 2) {
				var16.ak_fld++;
				var16.ag_fld--;
			} else if (3 == var13) {
				var16.ak_fld--;
			} else if (4 == var13) {
				var16.ak_fld++;
			} else if (var13 == 5) {
				var16.ak_fld--;
				var16.ag_fld++;
			} else if (6 == var13) {
				var16.ag_fld++;
			} else if (7 == var13) {
				var16.ak_fld++;
				var16.ag_fld++;
			}

			var0.ae_fld[var2] = true;
			var0.ah_fld[var2] = var5.ae_fld;
		} else if (var4 == 2) {
			int var12 = var1.ar(4, -106081977);
			kj var15 = var5.az_fld;
			if (0 == var12) {
				var15.ak_fld -= 2;
				var15.ag_fld -= 2;
			} else if (1 == var12) {
				var15.ak_fld--;
				var15.ag_fld -= 2;
			} else if (var12 == 2) {
				var15.ag_fld -= 2;
			} else if (var12 == 3) {
				var15.ak_fld++;
				var15.ag_fld -= 2;
			} else if (var12 == 4) {
				var15.ak_fld += 2;
				var15.ag_fld -= 2;
			} else if (var12 == 5) {
				var15.ak_fld -= 2;
				var15.ag_fld--;
			} else if (var12 == 6) {
				var15.ak_fld += 2;
				var15.ag_fld--;
			} else if (7 == var12) {
				var15.ak_fld -= 2;
			} else if (var12 == 8) {
				var15.ak_fld += 2;
			} else if (var12 == 9) {
				var15.ak_fld -= 2;
				var15.ag_fld++;
			} else if (var12 == 10) {
				var15.ak_fld += 2;
				var15.ag_fld++;
			} else if (var12 == 11) {
				var15.ak_fld -= 2;
				var15.ag_fld += 2;
			} else if (12 == var12) {
				var15.ak_fld--;
				var15.ag_fld += 2;
			} else if (var12 == 13) {
				var15.ag_fld += 2;
			} else if (var12 == 14) {
				var15.ak_fld++;
				var15.ag_fld += 2;
			} else if (15 == var12) {
				var15.ak_fld += 2;
				var15.ag_fld += 2;
			}

			var0.ae_fld[var2] = true;
			var0.ah_fld[var2] = var5.ae_fld;
		} else {
			int var6 = var1.ar(1, -106081977);
			if (0 == var6) {
				int var14 = var1.ar(12, -106081977);
				int var17 = var14 >> 10;
				int var18 = var14 >> 5 & 31;
				if (var18 > 15) {
					var18 -= 32;
				}

				int var19 = var14 & 31;
				if (var19 > 15) {
					var19 -= 32;
				}

				kj var20 = var5.az_fld;
				var20.az_fld = 615342573 * (byte)(var20.az_fld + var17 & 3);
				var20.ak_fld += var18 * -1810751103;
				var20.ag_fld += var19 * -1225554487;
				var0.ae_fld[var2] = true;
				var0.ah_fld[var2] = var5.ae_fld;
			} else {
				int var7 = var1.ar(30, -106081977);
				int var8 = kj.ag(var7);
				int var9 = kj.az(var7);
				int var10 = kj.av(var7);
				kj var11 = var5.az_fld;
				var11.az_fld = (byte)(var8 + var11.az_fld & 3);
				var11.ak_fld = -1810751103 * (var9 + var11.ak_fld & 16383);
				var11.ag_fld = -1225554487 * (var11.ag_fld + var10 & 16383);
				var0.ae_fld[var2] = true;
				var0.ah_fld[var2] = var5.ae_fld;
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lxj;IB)V"
	)
	final void az(xj var1, int var2) throws EOFException {
		this.jb(var1, var2);
		int var4 = var1.au_fld;
		this.an_fld = 0;
		this.av(var1, (byte)-1);
		this.ay((byte)48);
		this.as(1266968455);
		this.bk(var1, -1676625560);
		this.al(1217613053);
		if (var1.au_fld - var4 != var2) {
			throw new RuntimeException(var1.au_fld - var4 + " " + var2);
		} else {
			this.ch(var1, var2);
		}
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bo() {
		for (int var1 = 0; var1 < this.ax_fld; var1++) {
			int var2 = this.af_fld[var1];
			cl var3 = this.av_fld[var2];
			Iterator var4 = client.da_fld.iterator();

			while (var4.hasNext()) {
				dx var5 = (dx)(dx)var4.next();
				cv var6 = (cv)var5.au_fld.ae(var2);
				if (var6 != null) {
					var3.av(var6);
					var6.mb();
				}
			}

			var3.dv();
		}
	}

	di() {
		this.av_fld = new cl[2048];
		this.ae_fld = new boolean[2048];
		this.ah_fld = new gt[2048];
		this.aw_fld = new xi(new byte[5000]);
		this.ay_fld = new String[3];
		this.az_fld = new int[2048];
		this.af_fld = new int[2048];
		this.as_fld = new int[2048];
		this.al_fld = 0;
		this.au_fld = 0;
		this.ax_fld = 0;
		this.an_fld = 0;

		for (int var1 = 0; var1 < 2048; var1++) {
			this.av_fld[var1] = new cl(var1);
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Lxj;)V"
	)
	void be(xj var1) {
		this.ax_fld = 0;
		int var2 = 0;
		var1.as(-2097965206);

		for (int var3 = 0; var3 < this.al_fld; var3++) {
			int var4 = this.ar_fld[var3];
			if ((this.av_fld[var4].av_fld & 1) == 0) {
				if (var2 > 0) {
					var2--;
					this.av_fld[var4].av_fld = (byte)(this.av_fld[var4].av_fld | 2);
				} else {
					int var5 = var1.ar(1, -106081977);
					if (0 == var5) {
						var2 = uc(this, var1, 1770819933);
						this.av_fld[var4].av_fld = (byte)(this.av_fld[var4].av_fld | 2);
					} else {
						this.ah(var1, var4, (byte)65);
					}
				}
			}
		}

		var1.af(-582404284);
		if (var2 != 0) {
			throw new RuntimeException();
		} else {
			var1.as(-259252045);

			for (int var6 = 0; var6 < this.al_fld; var6++) {
				int var10 = this.ar_fld[var6];
				if (0 != (this.av_fld[var10].av_fld & 1)) {
					if (var2 > 0) {
						var2--;
						this.av_fld[var10].av_fld = (byte)(this.av_fld[var10].av_fld | 2);
					} else {
						int var13 = var1.ar(1, -106081977);
						if (var13 == 0) {
							var2 = uc(this, var1, 701584633);
							this.av_fld[var10].av_fld = (byte)(this.av_fld[var10].av_fld | 2);
						} else {
							this.ah(var1, var10, (byte)-30);
						}
					}
				}
			}

			var1.af(-2043446941);
			if (var2 != 0) {
				throw new RuntimeException();
			} else {
				var1.as(-2134816069);

				for (int var7 = 0; var7 < this.au_fld; var7++) {
					int var11 = this.az_fld[var7];
					if ((this.av_fld[var11].av_fld & 1) != 0) {
						if (var2 > 0) {
							var2--;
							this.av_fld[var11].av_fld = (byte)(this.av_fld[var11].av_fld | 2);
						} else {
							int var14 = var1.ar(1, -106081977);
							if (var14 == 0) {
								var2 = uc(this, var1, 901029536);
								this.av_fld[var11].av_fld = (byte)(this.av_fld[var11].av_fld | 2);
							} else if (this.aw(var1, var11)) {
								this.av_fld[var11].av_fld = (byte)(this.av_fld[var11].av_fld | 2);
							}
						}
					}
				}

				var1.af(-249702873);
				if (var2 != 0) {
					throw new RuntimeException();
				} else {
					var1.as(1188762499);

					for (int var8 = 0; var8 < this.au_fld; var8++) {
						int var12 = this.az_fld[var8];
						if (0 == (this.av_fld[var12].av_fld & 1)) {
							if (var2 > 0) {
								var2--;
								this.av_fld[var12].av_fld = (byte)(this.av_fld[var12].av_fld | 2);
							} else {
								int var15 = var1.ar(1, -106081977);
								if (var15 == 0) {
									var2 = uc(this, var1, -160690296);
									this.av_fld[var12].av_fld = (byte)(this.av_fld[var12].av_fld | 2);
								} else if (this.aw(var1, var12)) {
									this.av_fld[var12].av_fld = (byte)(this.av_fld[var12].av_fld | 2);
								}
							}
						}
					}

					var1.af(-1984317787);
					if (0 != var2) {
						throw new RuntimeException();
					} else {
						this.al_fld = 0;
						this.au_fld = 0;

						for (int var9 = 1; var9 < 2048; var9++) {
							this.av_fld[var9].av_fld = (byte)(this.av_fld[var9].av_fld >> 1);
							if (this.av_fld[var9].aw(461887062)) {
								this.ar_fld[(this.al_fld += -9684059) * -273927123 - 1] = var9;
							} else {
								this.az_fld[(this.au_fld += -260300649) * 1540972327 - 1] = var9;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("mk")
	@ObfuscatedSignature(
		descriptor = "(Ldi;Lxj;)V"
	)
	public static void mk(di var0, xj var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ax_fld = 0;
		int var2 = 0;
		var1.as(836096032);

		for (int var3 = 0; var3 < var0.al_fld; var3++) {
			int var4 = var0.ar_fld[var3];
			if ((var0.av_fld[var4].av_fld & 1) == 0) {
				if (var2 > 0) {
					var2--;
					var0.av_fld[var4].av_fld = (byte)(var0.av_fld[var4].av_fld | 2);
				} else {
					int var5 = var1.ar(1, -106081977);
					if (0 == var5) {
						var2 = uc(var0, var1, 1896914067);
						var0.av_fld[var4].av_fld = (byte)(var0.av_fld[var4].av_fld | 2);
					} else {
						var0.ah(var1, var4, (byte)-1);
					}
				}
			}
		}

		var1.af(-1118488724);
		if (var2 != 0) {
			throw new RuntimeException();
		} else {
			var1.as(502767353);

			for (int var6 = 0; var6 < var0.al_fld; var6++) {
				int var10 = var0.ar_fld[var6];
				if (0 != (var0.av_fld[var10].av_fld & 1)) {
					if (var2 > 0) {
						var2--;
						var0.av_fld[var10].av_fld = (byte)(var0.av_fld[var10].av_fld | 2);
					} else {
						int var13 = var1.ar(1, -106081977);
						if (var13 == 0) {
							var2 = uc(var0, var1, -352563614);
							var0.av_fld[var10].av_fld = (byte)(var0.av_fld[var10].av_fld | 2);
						} else {
							var0.ah(var1, var10, (byte)16);
						}
					}
				}
			}

			var1.af(-1487355310);
			if (var2 != 0) {
				throw new RuntimeException();
			} else {
				var1.as(740331866);

				for (int var7 = 0; var7 < var0.au_fld; var7++) {
					int var11 = var0.az_fld[var7];
					if ((var0.av_fld[var11].av_fld & 1) != 0) {
						if (var2 > 0) {
							var2--;
							var0.av_fld[var11].av_fld = (byte)(var0.av_fld[var11].av_fld | 2);
						} else {
							int var14 = var1.ar(1, -106081977);
							if (var14 == 0) {
								var2 = uc(var0, var1, 1691837623);
								var0.av_fld[var11].av_fld = (byte)(var0.av_fld[var11].av_fld | 2);
							} else if (var0.aw(var1, var11)) {
								var0.av_fld[var11].av_fld = (byte)(var0.av_fld[var11].av_fld | 2);
							}
						}
					}
				}

				var1.af(639822474);
				if (var2 != 0) {
					throw new RuntimeException();
				} else {
					var1.as(-1624596660);

					for (int var8 = 0; var8 < var0.au_fld; var8++) {
						int var12 = var0.az_fld[var8];
						if (0 == (var0.av_fld[var12].av_fld & 1)) {
							if (var2 > 0) {
								var2--;
								var0.av_fld[var12].av_fld = (byte)(var0.av_fld[var12].av_fld | 2);
							} else {
								int var15 = var1.ar(1, -106081977);
								if (var15 == 0) {
									var2 = uc(var0, var1, -271097813);
									var0.av_fld[var12].av_fld = (byte)(var0.av_fld[var12].av_fld | 2);
								} else if (var0.aw(var1, var12)) {
									var0.av_fld[var12].av_fld = (byte)(var0.av_fld[var12].av_fld | 2);
								}
							}
						}
					}

					var1.af(521791823);
					if (0 != var2) {
						throw new RuntimeException();
					} else {
						var0.al_fld = 0;
						var0.au_fld = 0;

						for (int var9 = 1; var9 < 2048; var9++) {
							var0.av_fld[var9].av_fld = (byte)(var0.av_fld[var9].av_fld >> 1);
							if (var0.av_fld[var9].aw(786239521)) {
								var0.ar_fld[(var0.al_fld += -9684059) * -273927123 - 1] = var9;
							} else {
								var0.az_fld[(var0.au_fld += -260300649) * 1540972327 - 1] = var9;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(Lxj;)V"
	)
	void bd(xj var1) {
		this.ax_fld = 0;
		int var2 = 0;
		var1.as(895686739);

		for (int var3 = 0; var3 < this.al_fld; var3++) {
			int var4 = this.ar_fld[var3];
			if ((this.av_fld[var4].av_fld & 1) == 0) {
				if (var2 > 0) {
					var2--;
					this.av_fld[var4].av_fld = (byte)(this.av_fld[var4].av_fld | 2);
				} else {
					int var5 = var1.ar(1, -106081977);
					if (0 == var5) {
						var2 = uc(this, var1, -426564967);
						this.av_fld[var4].av_fld = (byte)(this.av_fld[var4].av_fld | 2);
					} else {
						this.ah(var1, var4, (byte)-34);
					}
				}
			}
		}

		var1.af(1671762047);
		if (var2 != 0) {
			throw new RuntimeException();
		} else {
			var1.as(-1634664914);

			for (int var6 = 0; var6 < this.al_fld; var6++) {
				int var10 = this.ar_fld[var6];
				if (0 != (this.av_fld[var10].av_fld & 1)) {
					if (var2 > 0) {
						var2--;
						this.av_fld[var10].av_fld = (byte)(this.av_fld[var10].av_fld | 2);
					} else {
						int var13 = var1.ar(1, -106081977);
						if (var13 == 0) {
							var2 = uc(this, var1, 1442253107);
							this.av_fld[var10].av_fld = (byte)(this.av_fld[var10].av_fld | 2);
						} else {
							this.ah(var1, var10, (byte)-61);
						}
					}
				}
			}

			var1.af(519795553);
			if (var2 != 0) {
				throw new RuntimeException();
			} else {
				var1.as(-2049525542);

				for (int var7 = 0; var7 < this.au_fld; var7++) {
					int var11 = this.az_fld[var7];
					if ((this.av_fld[var11].av_fld & 1) != 0) {
						if (var2 > 0) {
							var2--;
							this.av_fld[var11].av_fld = (byte)(this.av_fld[var11].av_fld | 2);
						} else {
							int var14 = var1.ar(1, -106081977);
							if (var14 == 0) {
								var2 = uc(this, var1, -626022447);
								this.av_fld[var11].av_fld = (byte)(this.av_fld[var11].av_fld | 2);
							} else if (this.aw(var1, var11)) {
								this.av_fld[var11].av_fld = (byte)(this.av_fld[var11].av_fld | 2);
							}
						}
					}
				}

				var1.af(-1099543678);
				if (var2 != 0) {
					throw new RuntimeException();
				} else {
					var1.as(-758833977);

					for (int var8 = 0; var8 < this.au_fld; var8++) {
						int var12 = this.az_fld[var8];
						if (0 == (this.av_fld[var12].av_fld & 1)) {
							if (var2 > 0) {
								var2--;
								this.av_fld[var12].av_fld = (byte)(this.av_fld[var12].av_fld | 2);
							} else {
								int var15 = var1.ar(1, -106081977);
								if (var15 == 0) {
									var2 = uc(this, var1, 276873181);
									this.av_fld[var12].av_fld = (byte)(this.av_fld[var12].av_fld | 2);
								} else if (this.aw(var1, var12)) {
									this.av_fld[var12].av_fld = (byte)(this.av_fld[var12].av_fld | 2);
								}
							}
						}
					}

					var1.af(-1827357665);
					if (0 != var2) {
						throw new RuntimeException();
					} else {
						this.al_fld = 0;
						this.au_fld = 0;

						for (int var9 = 1; var9 < 2048; var9++) {
							this.av_fld[var9].av_fld = (byte)(this.av_fld[var9].av_fld >> 1);
							if (this.av_fld[var9].aw(467706174)) {
								this.ar_fld[(this.al_fld += -636084852) * -273927123 - 1] = var9;
							} else {
								this.az_fld[(this.au_fld += -322832668) * 1540972327 - 1] = var9;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lxj;I)V"
	)
	final void aj(xj var1, int var2) throws EOFException {
		int var3 = var1.au_fld * 1609621268;
		this.an_fld = 0;
		this.av(var1, (byte)-38);
		this.ay((byte)101);
		this.as(-1430480506);
		this.bk(var1, -1997951482);
		this.al(1217613053);
		if (var1.au_fld - var3 != var2) {
			throw new RuntimeException(var1.au_fld - var3 + " " + var2);
		}
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(Lxj;I)Z"
	)
	boolean bf(xj var1, int var2) {
		cl var3 = this.av_fld[var2];
		int var4 = var1.ar(2, -106081977);
		if (var4 == 0) {
			if (var1.ar(1, -106081977) != 0) {
				this.aw(var1, var2);
			}

			int var15 = var1.ar(13, -106081977);
			int var18 = var1.ar(13, -106081977);
			boolean var21 = var1.ar(1, -106081977) == 1;
			if (var21) {
				this.as_fld[(this.an_fld += -1004737463) * -910506503 - 1] = var2;
			}

			if (var3.aw(1646902685)) {
				throw new RuntimeException();
			} else {
				var3.as(var15, var18);
				this.ae_fld[var2] = false;
				return true;
			}
		} else if (1 == var4) {
			int var14 = var1.ar(2, -106081977);
			int var17 = var3.ay_fld;
			int var20 = kj.ag(var17) + var14 & 3;
			cl.oa(var3, var20, (byte)45);
			var3.ay_fld = 1483486233 * ((var20 << 28) + (var17 & 268435455));
			return false;
		} else if (2 == var4) {
			int var13 = var1.ar(5, -106081977);
			int var16 = var13 >> 3;
			int var19 = var13 & 7;
			int var22 = var3.ay_fld;
			int var23 = kj.ag(var22) + var16 & 3;
			int var24 = var22 >> 14 & 0xFF;
			int var25 = var22 & 0xFF;
			if (0 == var19) {
				var24--;
				var25--;
			}

			if (var19 == 1) {
				var25--;
			}

			if (var19 == 2) {
				var24++;
				var25--;
			}

			if (3 == var19) {
				var24--;
			}

			if (var19 == 4) {
				var24++;
			}

			if (5 == var19) {
				var24--;
				var25++;
			}

			if (6 == var19) {
				var25++;
			}

			if (7 == var19) {
				var24++;
				var25++;
			}

			cl.oa(var3, var23, (byte)45);
			var3.ay_fld = kj.ak(var23, var24, var25);
			return false;
		} else {
			int var5 = var1.ar(18, -106081977);
			int var6 = var5 >> 16;
			int var7 = var5 >> 8 & 0xFF;
			int var8 = var5 & 0xFF;
			int var9 = var3.ay_fld;
			int var10 = kj.ag(var9) + var6 & 3;
			cl.oa(var3, var10, (byte)45);
			int var11 = kj.az(var9) + var7 & 0xFF;
			int var12 = kj.av(var9) + var8 & 0xFF;
			var3.ay_fld = kj.ak(var3.al(740887796), var11, var12);
			return false;
		}
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(Lxj;I)Z"
	)
	boolean by(xj var1, int var2) {
		cl var3 = this.av_fld[var2];
		int var4 = var1.ar(2, -106081977);
		if (var4 == 0) {
			if (var1.ar(1, -106081977) != 0) {
				this.aw(var1, var2);
			}

			int var15 = var1.ar(13, -106081977);
			int var18 = var1.ar(13, -106081977);
			boolean var21 = var1.ar(1, -106081977) == 1;
			if (var21) {
				this.as_fld[(this.an_fld += -1004737463) * -910506503 - 1] = var2;
			}

			if (var3.aw(-475022545)) {
				throw new RuntimeException();
			} else {
				var3.as(var15, var18);
				this.ae_fld[var2] = false;
				return true;
			}
		} else if (1 == var4) {
			int var14 = var1.ar(2, -106081977);
			int var17 = var3.ay_fld;
			int var20 = kj.ag(var17) + var14 & 3;
			cl.oa(var3, var20, (byte)45);
			var3.ay_fld = 1483486233 * ((var20 << 28) + (var17 & 268435455));
			return false;
		} else if (2 == var4) {
			int var13 = var1.ar(5, -106081977);
			int var16 = var13 >> 3;
			int var19 = var13 & 7;
			int var22 = var3.ay_fld;
			int var23 = kj.ag(var22) + var16 & 3;
			int var24 = var22 >> 14 & 0xFF;
			int var25 = var22 & 0xFF;
			if (0 == var19) {
				var24--;
				var25--;
			}

			if (var19 == 1) {
				var25--;
			}

			if (var19 == 2) {
				var24++;
				var25--;
			}

			if (3 == var19) {
				var24--;
			}

			if (var19 == 4) {
				var24++;
			}

			if (5 == var19) {
				var24--;
				var25++;
			}

			if (6 == var19) {
				var25++;
			}

			if (7 == var19) {
				var24++;
				var25++;
			}

			cl.oa(var3, var23, (byte)45);
			var3.ay_fld = kj.ak(var23, var24, var25);
			return false;
		} else {
			int var5 = var1.ar(18, -106081977);
			int var6 = var5 >> 16;
			int var7 = var5 >> 8 & 0xFF;
			int var8 = var5 & 0xFF;
			int var9 = var3.ay_fld;
			int var10 = kj.ag(var9) + var6 & 3;
			cl.oa(var3, var10, (byte)45);
			int var11 = kj.az(var9) + var7 & 0xFF;
			int var12 = kj.av(var9) + var8 & 0xFF;
			var3.ay_fld = kj.ak(var3.al(-524841822), var11, var12);
			return false;
		}
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(Lxj;)V"
	)
	void bz(xj var1) {
		this.ax_fld = 0;
		int var2 = 0;
		var1.as(-1314493947);

		for (int var3 = 0; var3 < this.al_fld; var3++) {
			int var4 = this.ar_fld[var3];
			if ((this.av_fld[var4].av_fld & 1) == 0) {
				if (var2 > 0) {
					var2--;
					this.av_fld[var4].av_fld = (byte)(this.av_fld[var4].av_fld | 2);
				} else {
					int var5 = var1.ar(1, -106081977);
					if (0 == var5) {
						var2 = uc(this, var1, 2023356513);
						this.av_fld[var4].av_fld = (byte)(this.av_fld[var4].av_fld | 2);
					} else {
						this.ah(var1, var4, (byte)-45);
					}
				}
			}
		}

		var1.af(-1563528929);
		if (var2 != 0) {
			throw new RuntimeException();
		} else {
			var1.as(-2050731280);

			for (int var6 = 0; var6 < this.al_fld; var6++) {
				int var10 = this.ar_fld[var6];
				if (0 != (this.av_fld[var10].av_fld & 1)) {
					if (var2 > 0) {
						var2--;
						this.av_fld[var10].av_fld = (byte)(this.av_fld[var10].av_fld | 2);
					} else {
						int var13 = var1.ar(1, -106081977);
						if (var13 == 0) {
							var2 = uc(this, var1, 1667595136);
							this.av_fld[var10].av_fld = (byte)(this.av_fld[var10].av_fld | 2);
						} else {
							this.ah(var1, var10, (byte)-31);
						}
					}
				}
			}

			var1.af(1050125400);
			if (var2 != 0) {
				throw new RuntimeException();
			} else {
				var1.as(-40678327);

				for (int var7 = 0; var7 < this.au_fld; var7++) {
					int var11 = this.az_fld[var7];
					if ((this.av_fld[var11].av_fld & 1) != 0) {
						if (var2 > 0) {
							var2--;
							this.av_fld[var11].av_fld = (byte)(this.av_fld[var11].av_fld | 2);
						} else {
							int var14 = var1.ar(1, -106081977);
							if (var14 == 0) {
								var2 = uc(this, var1, 103524476);
								this.av_fld[var11].av_fld = (byte)(this.av_fld[var11].av_fld | 2);
							} else if (this.aw(var1, var11)) {
								this.av_fld[var11].av_fld = (byte)(this.av_fld[var11].av_fld | 2);
							}
						}
					}
				}

				var1.af(271331872);
				if (var2 != 0) {
					throw new RuntimeException();
				} else {
					var1.as(508003816);

					for (int var8 = 0; var8 < this.au_fld; var8++) {
						int var12 = this.az_fld[var8];
						if (0 == (this.av_fld[var12].av_fld & 1)) {
							if (var2 > 0) {
								var2--;
								this.av_fld[var12].av_fld = (byte)(this.av_fld[var12].av_fld | 2);
							} else {
								int var15 = var1.ar(1, -106081977);
								if (var15 == 0) {
									var2 = uc(this, var1, 1923886505);
									this.av_fld[var12].av_fld = (byte)(this.av_fld[var12].av_fld | 2);
								} else if (this.aw(var1, var12)) {
									this.av_fld[var12].av_fld = (byte)(this.av_fld[var12].av_fld | 2);
								}
							}
						}
					}

					var1.af(-1734829887);
					if (0 != var2) {
						throw new RuntimeException();
					} else {
						this.al_fld = 0;
						this.au_fld = 0;

						for (int var9 = 1; var9 < 2048; var9++) {
							this.av_fld[var9].av_fld = (byte)(this.av_fld[var9].av_fld >> 1);
							if (this.av_fld[var9].aw(489552778)) {
								this.ar_fld[(this.al_fld += -9684059) * -273927123 - 1] = var9;
							} else {
								this.az_fld[(this.au_fld += -260300649) * 1540972327 - 1] = var9;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bx() {
		for (int var1 = 0; var1 < this.ax_fld; var1++) {
			int var2 = this.af_fld[var1];
			cl var3 = this.av_fld[var2];
			Iterator var4 = client.da_fld.iterator();

			while (var4.hasNext()) {
				dx var5 = (dx)(dx)var4.next();
				cv var6 = (cv)var5.au_fld.ae(var2);
				if (var6 != null) {
					var3.av(var6);
					var6.mb();
				}
			}

			var3.dv();
		}
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bt() throws EOFException {
		client.es_fld = 0;
		Iterator var1 = client.da_fld.iterator();

		while (var1.hasNext()) {
			dx var2 = (dx)(dx)var1.next();
			this.ar(var2, -579489706);
		}
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(Ldx;)V"
	)
	void bi(dx var1) throws EOFException {
		for (int var2 = 0; var2 < this.al_fld; var2++) {
			int var3 = this.ar_fld[var2];
			cl var4 = this.av_fld[var3];
			kj var5 = var4.az_fld;
			cv var6 = (cv)var1.au_fld.ae(var3);
			boolean var7 = var5.ak_fld > var1.as_fld && var5.ag_fld > var1.ay_fld && var5.ak_fld < var1.as_fld + var1.ah_fld && var5.ag_fld < var1.ay_fld + var1.aw_fld;
			if (client.dj_fld == var3 && var7 && 0 != var1.ag_fld) {
				client.es_fld = -1784608945 * var1.ag_fld;
			}

			if (var7 && var6 == null) {
				var6 = var4.ah(var3, var1);
				cl.mv(var4, var6, -1226907778);
				xf.sk(var1.au_fld, var6, var3);
			} else if (!var7 && null != var6) {
				var4.av(var6);
				var6.mb();
			}
		}
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(Ldx;)V"
	)
	void bv(dx var1) throws EOFException {
		for (int var2 = 0; var2 < this.al_fld; var2++) {
			int var3 = this.ar_fld[var2];
			cl var4 = this.av_fld[var3];
			kj var5 = var4.az_fld;
			cv var6 = (cv)var1.au_fld.ae(var3);
			boolean var7 = var5.ak_fld > var1.as_fld && var5.ag_fld > var1.ay_fld && var5.ak_fld < var1.as_fld + var1.ah_fld && var5.ag_fld < var1.ay_fld + var1.aw_fld;
			if (client.dj_fld == var3 && var7 && 0 != var1.ag_fld) {
				client.es_fld = -1784608945 * var1.ag_fld;
			}

			if (var7 && var6 == null) {
				var6 = var4.ah(var3, var1);
				cl.mv(var4, var6, -602451377);
				xf.sk(var1.au_fld, var6, var3);
			} else if (!var7 && null != var6) {
				var4.av(var6);
				var6.mb();
			}
		}
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(Lcv;)V"
	)
	void cd(cv var1) {
		if (var1 != null) {
			this.av_fld[var1.bq_fld].av(var1);
		}
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bw() throws EOFException {
		for (int var1 = 0; var1 < this.al_fld; var1++) {
			int var2 = this.ar_fld[var1];
			if (this.ae_fld[var2]) {
				cl var3 = this.av_fld[var2];
				var3.ax(this.ah_fld[var2], (byte)40);
				this.ae_fld[var2] = false;
			}
		}
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ba() throws EOFException {
		for (int var1 = 0; var1 < this.al_fld; var1++) {
			int var2 = this.ar_fld[var1];
			if (this.ae_fld[var2]) {
				cl var3 = this.av_fld[var2];
				var3.ax(this.ah_fld[var2], (byte)-5);
				this.ae_fld[var2] = false;
			}
		}
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bq() throws EOFException {
		for (int var1 = 0; var1 < this.al_fld; var1++) {
			int var2 = this.ar_fld[var1];
			if (this.ae_fld[var2]) {
				cl var3 = this.av_fld[var2];
				var3.ax(this.ah_fld[var2], (byte)-50);
				this.ae_fld[var2] = false;
			}
		}
	}

	@ObfuscatedName("kh")
	@ObfuscatedSignature(
		descriptor = "(Ldi;II)I"
	)
	public static int kh(di var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		for (int var3 = 0; var3 < var0.al_fld; var3++) {
			if (var1 == var0.ar_fld[var3]) {
				return var3;
			}
		}

		return -1;
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(Lxj;II)V"
	)
	void bg(xj var1, int var2, int var3) throws EOFException {
		cl var4 = this.av_fld[var2];
		int var5 = Integer.MAX_VALUE;
		if ((var3 & 131072) != 0) {
			int var6 = var1.df();
			if (var6 > 0) {
				for (int var7 = 0; var7 < var6; var7++) {
					int var8 = var1.dz();
					int var9 = var1.dz();
					if (var9 != 32767) {
						int var10 = var1.dz();
						int var11 = var1.cg();
						int var12 = var9 > 0 ? var1.de() : var11;
						cl.zc(var4, var8, var9, var10, var11, var12);
					} else {
						cl.ga(var4, var8);
					}
				}
			}
		}

		if (0 != (var3 & 256)) {
			int var16 = xi.tl(var1, (byte)1);
			int var29 = var16 >> 8;
			int var37 = var29 >= 13 && var29 <= 20 ? var29 - 12 : 0;
			ki var43 = (ki)ka.ak(ti.ak(), var1.de());
			boolean var48 = var1.de() == 1;
			int var53 = var1.df();
			this.aw_fld.au_fld = 0;
			var1.dh(this.aw_fld.al_fld, 0, var53);
			this.aw_fld.au_fld = 0;
			String var57 = zv.ay(in.an(hr.ag(this.aw_fld)));
			byte[] var13 = null;
			if (var37 > 0 && var37 <= 8) {
				var13 = new byte[var37];

				for (int var14 = 0; var14 < var37; var14++) {
					var13[var14] = var1.dj();
				}
			}

			var4.ac(var16, var43, var48, var57, var13, (byte)5);
		}

		if (0 != (var3 & 8)) {
			int var17 = var1.de();
			cl.cz(var4, var17, var1);
		}

		if ((var3 & 16) != 0) {
			String var18 = xi.at(var1, 1086031367);
			var4.ad(var18);
		}

		if ((var3 & 2048) != 0) {
			var4.ae_fld = (gt)ka.ak(ge.ak(-769087485), xi.pb(var1, -1843574869));
			if (Integer.MAX_VALUE == var5) {
				this.ah_fld[var2] = var4.ae_fld;
			}
		}

		if ((var3 & 65536) != 0) {
			int var19 = var1.cg();

			for (int var30 = 0; var30 < var19; var30++) {
				int var38 = var1.df();
				int var44 = var1.ex();
				int var49 = var1.em();
				cl.gy(var4, var38, var44, var49 >> 16, var49 & 65535);
			}
		}

		if ((var3 & 32768) != 0) {
			byte var15 = var1.cw();
			if (var15 == 127) {
				this.ah_fld[var2] = gt.ak_fld;
			} else {
				this.ah_fld[var2] = (gt)ka.ak(ge.ak(-549387871), var15);
			}
		}

		if ((var3 & 4096) != 0) {
			int var20 = client.dv_fld + var1.eo();
			int var31 = client.dv_fld + xi.tl(var1, (byte)1);
			byte var39 = xi.pb(var1, -2129449402);
			byte var45 = xi.pb(var1, -1528258303);
			byte var50 = xi.pb(var1, -1800096019);
			byte var54 = (byte)var1.cg();
			var4.bd(var20, var31, var39, var45, var50, var54);
		}

		if ((var3 & 128) != 0) {
			xi.tl(var1, (byte)1);
			var1.de();
			xi.iu(var1, 976110331);
			int var21 = var1.cg();
			this.aw_fld.au_fld = 0;
			var1.el(this.aw_fld.al_fld, 0, var21);
			this.aw_fld.au_fld = 0;
		}

		if (0 != (var3 & 1024)) {
			for (int var22 = 0; var22 < 3; var22++) {
				this.ay_fld[var22] = xi.at(var1, -347592161);
			}

			cl.da(var4, this.ay_fld, (byte)-84);
		}

		if ((var3 & 262144) != 0) {
			int var23 = var1.de();
			if (var23 > 0) {
				for (int var32 = 0; var32 < var23; var32++) {
					int var40 = var1.dz();
					int var46 = var1.dz();
					int var51 = var1.dz();
					int var55 = var1.dz();
					var4.ao(var40, var46, var51, var55);
				}
			}
		}

		if ((var3 & 64) != 0) {
			int var24 = var1.ex();
			int var33 = var1.de();
			var4.am(var24, var33);
		}

		if ((var3 & 1) != 0) {
			int var25 = var1.eo();
			if (var25 == 65535) {
				var25 = -1;
			}

			int var34 = var1.df();
			var4.aa(var25, var34);
		}

		if (0 != (var3 & 4)) {
			int var26 = var1.df();
			byte[] var35 = new byte[var26];
			xi var41 = new xi(var35);
			var1.eh(var35, 0, var26);
			var4.an(var41);
		}

		if (0 != (var3 & 32)) {
			int var27 = var1.eo();
			var4.at(var27);
		}

		if ((var3 & 8192) != 0) {
			byte var28 = var1.cw();
			byte var36 = var1.ep();
			byte var42 = xi.pb(var1, -2106261374);
			byte var47 = var1.dj();
			int var52 = var1.ex() + client.dv_fld;
			int var56 = xi.tl(var1, (byte)1) + client.dv_fld;
			int var58 = var1.ex();
			cl.zw(var4, var28, var36, var42, var47, var52, var56, var58, (short)27335);
			this.ae_fld[var2] = false;
		}
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bc() throws EOFException {
		for (int var1 = 0; var1 < this.al_fld; var1++) {
			int var2 = this.ar_fld[var1];
			if (this.ae_fld[var2]) {
				cl var3 = this.av_fld[var2];
				var3.ax(this.ah_fld[var2], (byte)15);
				this.ae_fld[var2] = false;
			}
		}
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(Ldi;Lxj;)I"
	)
	public static int by(di var0, xj var1) {
		if (var0 == null) {
			var0.getClass();
		}

		int var2 = var1.ar(2, -106081977);
		int var3;
		if (0 == var2) {
			var3 = 0;
		} else if (1 == var2) {
			var3 = var1.ar(5, -106081977);
		} else if (var2 == 2) {
			var3 = var1.ar(8, -106081977);
		} else {
			var3 = var1.ar(11, -106081977);
		}

		return var3;
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(Lcv;)V"
	)
	void cc(cv var1) {
		if (var1 != null) {
			this.av_fld[var1.bq_fld].av(var1);
		}
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(Lcv;)V"
	)
	void cq(cv var1) {
		if (var1 != null) {
			this.av_fld[var1.bq_fld].av(var1);
		}
	}

	@ObfuscatedName("uc")
	@ObfuscatedSignature(
		descriptor = "(Ldi;Lxj;I)I"
	)
	public static int uc(di var0, xj var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		int var3 = var1.ar(2, -106081977);
		int var4;
		if (0 == var3) {
			var4 = 0;
		} else if (1 == var3) {
			var4 = var1.ar(5, -106081977);
		} else if (var3 == 2) {
			var4 = var1.ar(8, -106081977);
		} else {
			var4 = var1.ar(11, -106081977);
		}

		return var4;
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(Lxj;I)V"
	)
	public void ch(xj var1, int var2) {
		da.nx_fld = false;

		for (int var3 = 0; var3 < this.al_fld; var3++) {
			ArrayList var4 = this.av_fld[this.ar_fld[var3]].ak_fld;

			for (int var5 = 0; var5 < var4.size(); var5++) {
				((cv)var4.get(var5)).ml();
			}
		}
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(Lcv;)V"
	)
	void cv(cv var1) {
		if (var1 != null) {
			this.av_fld[var1.bq_fld].av(var1);
		}
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void cy() {
		this.al_fld = 0;

		for (int var1 = 0; var1 < 2048; var1++) {
			this.av_fld[var1].cd();
		}
	}

	@ObfuscatedName("fj")
	@ObfuscatedSignature(
		descriptor = "(Ldi;)V"
	)
	public static void fj(di var0) throws EOFException {
		if (var0 == null) {
			var0.getClass();
		} else {
			client.es_fld = 0;
			Iterator var1 = client.da_fld.iterator();

			while (var1.hasNext()) {
				dx var2 = (dx)(dx)var1.next();
				var0.ar(var2, -372757021);
			}
		}
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int cf(int var1) {
		for (int var2 = 0; var2 < this.al_fld; var2++) {
			if (var1 == this.ar_fld[var2]) {
				return var2;
			}
		}

		return -1;
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int cx(int var1) {
		for (int var2 = 0; var2 < this.al_fld; var2++) {
			if (var1 == this.ar_fld[var2]) {
				return var2;
			}
		}

		return -1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IB)Lrx;"
	)
	rx ak(int var1) {
		return var1 >= 0 && var1 < this.av_fld.length ? this.av_fld[var1] : null;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lxj;I)I"
	)
	int ae(xj var1, int var2) {
		int var3 = var1.ar(2, -106081977);
		int var4;
		if (0 == var3) {
			var4 = 0;
		} else if (1 == var3) {
			var4 = var1.ar(5, -106081977);
		} else if (var3 == 2) {
			var4 = var1.ar(8, -106081977);
		} else {
			var4 = var1.ar(11, -106081977);
		}

		return var4;
	}

	@ObfuscatedName("xu")
	@ObfuscatedSignature(
		descriptor = "(Ldi;Lxj;)V"
	)
	public static void xu(di var0, xj var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.an();
		var1.as(-901582417);
		int var2 = client.dj_fld;
		cl var3 = var0.av_fld[var2];
		int var4 = var1.ar(30, -106081977);
		cl.yp(var3, -1, (byte)1);
		var3.az_fld.ar(var4);
		var3.av_fld = 0;
		var0.al_fld = 0;
		var0.ar_fld[(var0.al_fld += -9684059) * -273927123 - 1] = var2;
		var0.au_fld = 0;

		for (int var5 = 1; var5 < -192732981; var5++) {
			if (var5 != var2) {
				int var6 = var1.ar(18, -106081977);
				int var7 = var6 >> 16;
				int var8 = var6 >> 8 & 0xFF;
				int var9 = var6 & 854044079;
				cl.yp(var0.av_fld[var5], kj.ak(var7, var8, var9), (byte)1);
				var0.az_fld[(var0.au_fld += -260300649) * 1540972327 - 1] = var5;
			}
		}

		var1.af(1972545492);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lcv;I)V"
	)
	void ax(cv var1, int var2) {
		this.hz(var1);
		if (var1 != null) {
			this.av_fld[-1857618981 * var1.bb_fld].az(var1, -611577879);
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	int aa(int var1, int var2) {
		for (int var3 = 0; var3 < this.ax_fld; var3++) {
			if (var1 == this.as_fld[var3]) {
				return var3;
			}
		}

		return -1;
	}

	@ObfuscatedName("jk")
	@ObfuscatedSignature(
		descriptor = "(Ldi;Lxj;)V"
	)
	public static void jk(di var0, xj var1) throws EOFException {
		for (int var2 = 0; var2 < var0.an_fld; var2++) {
			int var3 = var0.as_fld[var2];
			int var4 = var1.cg();
			if ((var4 & 2) != 0) {
				var4 += var1.cg() << 8;
			}

			if (0 != (var4 & 16384)) {
				var4 += var1.cg() << 16;
			}

			var0.au(var1, var3, var4, -2091823155);
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lxj;)V"
	)
	final void ab(xj var1) throws EOFException {
		this.as(1442419582);
		var1.ap(-1765525869);
		int var2 = client.ez_fld * -1593647060;
		cl var3 = this.av_fld[var2];
		int var4 = var1.ar(30, -106081977);
		cl.yp(var3, -1, (byte)1);
		var3.az_fld.ar(var4);
		var3.av_fld = 0;
		this.ax_fld = 0;
		this.ar_fld[(this.au_fld = this.ax_fld + 1227014965) * -1482869773 - 1] = var2;
		this.an_fld = 0;

		for (int var5 = 1; var5 < 2048; var5++) {
			if (var5 != var2) {
				int var6 = var1.au(18, -106081977);
				int var7 = var6 >> 16;
				int var8 = var6 >> 8 & -1813100345;
				int var9 = var6 & -252866092;
				cl.yp(this.av_fld[var5], kj.ak(var7, var8, var9), (byte)1);
				this.as_fld[(this.ax_fld = this.an_fld + -260300649) * 1540972327 - 1] = var5;
			}
		}

		var1.af(366283578);
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(Lxj;I)V"
	)
	void bj(xj var1, int var2) {
		boolean var3 = var1.ar(1, -106081977) == 1;
		if (var3) {
			this.af_fld[(this.au_fld += -1004737463) * -910506503 - 1] = var2;
		}

		int var4 = var1.au(2, -106081977);
		cl var5 = this.av_fld[var2];
		if (var4 == 0) {
			if (var3) {
				this.ae_fld[var2] = false;
			} else if (client.op_fld == var2) {
				throw new RuntimeException();
			} else {
				cl.be(var5, -1152427193);
				if (var1.au(1, -106081977) != 0) {
					this.aw(var1, var2);
				}

				this.ar_fld[(this.an_fld = this.ax_fld + 727166919) * 450716151 - 1] = var2;
			}
		} else if (var4 == 1) {
			int var13 = var1.ar(3, -106081977);
			kj var16 = var5.az_fld;
			if (var13 == 0) {
				var16.ak_fld = var16.ag_fld - -1810751103;
				var16.ag_fld = var16.ak_fld - -1225554487;
			} else if (1 == var13) {
				var16.az_fld = var16.ak_fld - -1225554487;
			} else if (var13 == 2) {
				var16.az_fld = var16.ag_fld + -1810751103;
				var16.ag_fld = var16.ak_fld - -1225554487;
			} else if (3 == var13) {
				var16.ak_fld--;
			} else if (4 == var13) {
				var16.az_fld += -85943451;
			} else if (var13 == 5) {
				var16.az_fld -= -85943451;
				var16.az_fld += -992663603;
			} else if (6 == var13) {
				var16.ak_fld += 1356068937;
			} else if (7 == var13) {
				var16.ag_fld = var16.az_fld + -1810751103;
				var16.ak_fld += 1356068937;
			}

			this.ae_fld[var2] = true;
			this.ah_fld[var2] = var5.ae_fld;
		} else if (var4 == 2) {
			int var12 = var1.au(4, -106081977);
			kj var15 = var5.az_fld;
			if (0 == var12) {
				var15.ak_fld -= 2;
				var15.az_fld -= -1985327206;
			} else if (1 == var12) {
				var15.az_fld = var15.ag_fld - -1810751103;
				var15.ak_fld -= -1582829422;
			} else if (var12 == 2) {
				var15.az_fld = var15.ag_fld - 1843858322;
			} else if (var12 == 3) {
				var15.ak_fld = var15.az_fld + -1810751103;
				var15.az_fld -= -1985327206;
			} else if (var12 == 4) {
				var15.ak_fld += 2;
				var15.ak_fld = var15.az_fld - 1843858322;
			} else if (var12 == 5) {
				var15.ak_fld -= 2;
				var15.ag_fld = var15.ak_fld - -1225554487;
			} else if (var12 == 6) {
				var15.az_fld = var15.ag_fld + 673465090;
				var15.az_fld = var15.ak_fld - -1225554487;
			} else if (7 == var12) {
				var15.ak_fld -= 2;
			} else if (var12 == 8) {
				var15.az_fld += -171886902;
			} else if (var12 == 9) {
				var15.ag_fld = var15.ak_fld - 673465090;
				var15.az_fld += -992663603;
			} else if (var12 == 10) {
				var15.ak_fld = var15.ag_fld + 673465090;
				var15.az_fld = var15.ak_fld + -1225554487;
			} else if (var12 == 11) {
				var15.az_fld = var15.ak_fld - 673465090;
				var15.ag_fld = var15.az_fld + 1843858322;
			} else if (12 == var12) {
				var15.ak_fld--;
				var15.ak_fld = var15.az_fld + 1843858322;
			} else if (var12 == 13) {
				var15.ag_fld += 2;
			} else if (var12 == 14) {
				var15.ak_fld = var15.ag_fld + -1810751103;
				var15.ag_fld += 2;
			} else if (15 == var12) {
				var15.az_fld = var15.ag_fld + 673465090;
				var15.ag_fld += 2;
			}

			this.ae_fld[var2] = true;
			this.ah_fld[var2] = var5.ae_fld;
		} else {
			int var6 = var1.au(1, -106081977);
			if (0 == var6) {
				int var14 = var1.ar(12, -106081977);
				int var17 = var14 >> 10;
				int var18 = var14 >> 5 & 31;
				if (var18 > 15) {
					var18 -= 32;
				}

				int var19 = var14 & 31;
				if (var19 > 15) {
					var19 -= 32;
				}

				kj var20 = var5.az_fld;
				var20.az_fld = 615342573 * (byte)(var20.ag_fld + var17 & 3);
				var20.ak_fld += var18 * -1810751103;
				var20.ag_fld += var19 * -1225554487;
				this.ae_fld[var2] = true;
				this.ah_fld[var2] = var5.ae_fld;
			} else {
				int var7 = var1.au(30, -106081977);
				int var8 = kj.as(var7);
				int var9 = kj.ay(var7);
				int var10 = kj.as(var7);
				kj var11 = var5.az_fld;
				var11.ag_fld = (byte)(var8 + var11.az_fld & 3) * 615342573;
				var11.ag_fld = -1810751103 * (var9 + var11.ag_fld & 16383);
				var11.ak_fld = -1225554487 * (var11.ak_fld + var10 & 16383);
				this.ae_fld[var2] = true;
				this.ah_fld[var2] = var5.ae_fld;
			}
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Lrx;"
	)
	rx am(int var1) {
		return var1 >= 0 && var1 < this.av_fld.length ? this.av_fld[var1] : null;
	}
}
