import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;
import net.runelite.api.worldmap.WorldMapRegion;

@ObfuscatedName("ga")
@Implements({"WorldMapRegion"})
public class ga implements WorldMapRegion {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ak_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int az_fld;
	@ObfuscatedGetter(
		intValue = -831281439
	)
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ay_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/HashMap;"
	)
	HashMap ah_fld;
	@ObfuscatedGetter(
		intValue = 1344557209
	)
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int af_fld;
	@ObfuscatedGetter(
		intValue = 1934529249
	)
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int aw_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lgk;"
	)
	gk as_fld;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/LinkedList;"
	)
	LinkedList ar_fld;
	@ObfuscatedGetter(
		intValue = 2121588379
	)
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int al_fld;
	@ObfuscatedGetter(
		intValue = -1240771359
	)
	@ObfuscatedName("mr")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int mr_fld;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/List;"
	)
	List au_fld;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/HashMap;"
	)
	HashMap ax_fld;
	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		descriptor = "Luv;"
	)
	static uv ht_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	public static ir ae_fld = new ir(37748736, 256);

	@ObfuscatedName("et")
	@ObfuscatedSignature(
		descriptor = "(Lyv;Lop;)I"
	)
	int et(yv var1, op var2) {
		switch (var2.av_fld) {
			case 1:
				return -var1.ay_fld / 2;
			case 2:
				return 0;
			default:
				return -var1.ay_fld;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V"
	)
	void ag(int var1, int var2, int var3, byte var4) {
		int var6 = this.af_fld;
		int var7 = this.aw_fld;
		int var8 = this.ay_fld;
		yv var5 = (yv)(yv)ae_fld.ak(cw.ak(var6, var7, var8));
		if (null != var5) {
			if (this.ay_fld == var3) {
				if (var4 == 0) {
					return;
				}

				var5.ao(var1, var2);
			} else {
				var5.ap(var1, var2, var3, var3);
			}
		}
	}

	ga(int var1, int var2, int var3, HashMap var4) {
		this.af_fld = var1;
		this.aw_fld = var2;
		this.ar_fld = new LinkedList();
		this.au_fld = new LinkedList();
		this.ax_fld = new HashMap();
		this.al_fld = -86976621 * (var3 | 0xFF000000);
		this.ah_fld = var4;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lga;IILhi;)V"
	)
	public static void ac(ga var0, int var1, int var2, hi var3) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			for (int var4 = 0; var4 < var3.af_fld; var4++) {
				ge[] var5 = var3.ai_fld[var4][var1][var2];
				if (null != var5 && 0 != var5.length) {
					ge[] var6 = var5;

					for (int var7 = 0; var7 < var6.length; var7++) {
						ge var8 = var6[var7];
						int var10 = var8.ag_fld;
						boolean var9 = var10 >= kn.ak_fld.at_fld && var10 <= kn.av_fld.at_fld || var10 == kn.ae_fld.at_fld;
						if (var9) {
							oe var11 = ko.az(var8.ak_fld);
							int var12 = 0 != var11.cj_fld ? -3407872 : -3355444;
							if (var8.ag_fld == kn.ak_fld.at_fld) {
								an(var0, var1, var2, var8.az_fld, var12);
							}

							if (kn.az_fld.at_fld == var8.ag_fld) {
								an(var0, var1, var2, var8.az_fld, -3355444);
								an(var0, var1, var2, 1 + var8.az_fld, var12);
							}

							if (kn.av_fld.at_fld == var8.ag_fld) {
								if (0 == var8.az_fld) {
									yu.ew(var0.ay_fld * var1, (63 - var2) * var0.ay_fld, 1, var12);
								}

								if (1 == var8.az_fld) {
									yu.ew(var0.ay_fld + var1 * var0.ay_fld - 1, (63 - var2) * var0.ay_fld, 1, var12);
								}

								if (var8.az_fld == 2) {
									yu.ew(var0.ay_fld + var0.ay_fld * var1 - 1, var0.ay_fld + var0.ay_fld * (63 - var2) - 1, 1, var12);
								}

								if (3 == var8.az_fld) {
									yu.ew(var0.ay_fld * var1, var0.ay_fld + var0.ay_fld * (63 - var2) - 1, 1, var12);
								}
							}

							if (var8.ag_fld == kn.ae_fld.at_fld) {
								int var13 = var8.az_fld % 2;
								if (0 == var13) {
									for (int var17 = 0; var17 < var0.ay_fld; var17++) {
										yu.ew(var17 + var0.ay_fld * var1, (64 - var2) * var0.ay_fld - 1 - var17, 1, var12);
									}
								} else {
									for (int var14 = 0; var14 < var0.ay_fld; var14++) {
										yu.ew(var0.ay_fld * var1 + var14, var14 + (63 - var2) * var0.ay_fld, 1, var12);
									}
								}
							}
						}
					}
				}
			}
		} catch (Throwable var16) {
			throw new RuntimeException(var16);
		}
	}

	@ObfuscatedName("eb")
	@ObfuscatedSignature(
		descriptor = "(Lga;Lgk;Ljava/util/List;S)V"
	)
	public static void eb(ga var0, gk var1, List var2, short var3) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			} else {
				var0.ax_fld.clear();
				var0.as_fld = var1;
				var0.ay(var2, (byte)-60);
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("em")
	@ObfuscatedSignature(
		descriptor = "(Lga;IIIII)Ljava/util/List;"
	)
	public static List em(ga var0, int var1, int var2, int var3, int var4, int var5) {
		if (var0 == null) {
			var0.getClass();
		}

		LinkedList var6 = new LinkedList();
		if (var4 >= var1 && var5 >= var2) {
			if (var4 < var3 + var1 && var5 < var2 + var3) {
				Iterator var7 = var0.ax_fld.values().iterator();

				while (var7.hasNext()) {
					hr var8 = (hr)(hr)var7.next();
					if (var8.aq((byte)100) && var8.ai(var4, var5, (byte)-90)) {
						var6.add(var8);
					}
				}

				var7 = var0.au_fld.iterator();

				while (var7.hasNext()) {
					hr var10 = (hr)(hr)var7.next();
					if (var10.aq((byte)113) && var10.ai(var4, var5, (byte)-60)) {
						var6.add(var10);
					}
				}

				return var6;
			} else {
				return var6;
			}
		} else {
			return var6;
		}
	}

	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "(Lga;Ljava/util/HashSet;II)V"
	)
	public static void dd(ga var0, HashSet var1, int var2, int var3) throws EOFException {
		try {
			Iterator var4 = var0.ax_fld.values().iterator();

			while (var4.hasNext()) {
				hr var5 = (hr)(hr)var4.next();
				if (var5.aq((byte)45)) {
					int var6 = var5.ag(111445600);
					if (var1.contains(var6)) {
						pc var7 = uh.ak(var6);
						var0.ac(var7, -967672449 * var5.as_fld, var5.ar_fld, var2, var3, 167634901);
					}
				}
			}

			var0.ax(var1, var2, var3, (byte)112);
		} catch (Throwable var9) {
			throw new RuntimeException(var9);
		}
	}

	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "(Lpc;IIII)V"
	)
	void dg(pc var1, int var2, int var3, int var4, int var5) {
		try {
			yv var6 = var1.ae(false, -1966622853);
			if (null != var6) {
				var6.ab(var2 - var6.aw_fld / 2, var3 - var6.ay_fld / 2);
				if (var4 % var5 < var5 / 2) {
					yu.de(var2, var3, 15, 16776960, -746574696);
					yu.de(var2, var3, 7, -135820646, 256);
				}
			}
		} catch (Throwable var8) {
			throw new RuntimeException(var8);
		}
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(IIILjava/util/HashSet;)V"
	)
	void cr(int var1, int var2, int var3, HashSet var4) {
		try {
			if (null == var4) {
				var4 = new HashSet();
			}

			this.ap(var1, var2, var4, var3, (byte)2);
			zp(this, var1, var2, var4, var3, (byte)0);
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("zp")
	@ObfuscatedSignature(
		descriptor = "(Lga;IILjava/util/HashSet;IB)V"
	)
	public static void zp(ga var0, int var1, int var2, HashSet var3, int var4, byte var5) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			float var6 = var4 / 64.0F;
			Iterator var7 = var0.au_fld.iterator();

			while (var7.hasNext()) {
				if (var5 != 0) {
					return;
				}

				hr var8 = (hr)(hr)var7.next();
				if (var8.aq((byte)19)) {
					int var9 = var8.aw_fld.ag_fld * -621797759 % 64;
					int var10 = var8.aw_fld.az_fld * 1479124089 % 64;
					var8.as_fld = -1969704677 * (int)(var6 * var9 + var1);
					var8.ar_fld = (int)(var6 * (63 - var10) + var2);
					if (var3.contains(var8.ag(1314412832))) {
						if (var5 != 0) {
							return;
						}
					} else {
						ti(var0, var8, var8.as_fld, var8.ar_fld, var6);
					}
				}
			}
		} catch (Throwable var11) {
			throw new RuntimeException(var11);
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lpc;IIIII)V"
	)
	void ac(pc var1, int var2, int var3, int var4, int var5, int var6) {
		try {
			yv var7 = var1.ae(false, -2135784525);
			if (null == var7) {
				if (var6 < 1810855184) {
					;
				}
			} else {
				var7.ab(var2 - var7.aw_fld / 2, var3 - var7.ay_fld / 2);
				if (var4 % var5 < var5 / 2) {
					yu.de(var2, var3, 15, 16776960, 128);
					yu.de(var2, var3, 7, 16777215, 256);
				}
			}
		} catch (Throwable var8) {
			throw new RuntimeException(var8);
		}
	}

	@ObfuscatedName("zn")
	@ObfuscatedSignature(
		descriptor = "(Lga;)Ljava/util/List;"
	)
	public static List zn(ga var0) {
		if (var0 == null) {
			var0.getClass();
		}

		LinkedList var1 = new LinkedList();
		var1.addAll(var0.au_fld);
		var1.addAll(var0.ax_fld.values());
		return var1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/List;B)V"
	)
	void ay(List var1, byte var2) {
		try {
			Iterator var3 = var1.iterator();

			while (var3.hasNext()) {
				he var4 = (he)(he)var3.next();
				if (!uh.ak(var4.ak_fld).al_fld) {
					if (var2 >= 2) {
						return;
					}
				} else if (var4.aw_fld.ag_fld * -621797759 >> 6 == this.af_fld && var4.aw_fld.az_fld * 1479124089 >> 6 == this.aw_fld) {
					he var5 = new he(var4.aw_fld, var4.aw_fld, var4.ak_fld, this.bs(var4.ak_fld, -1548529809));
					this.au_fld.add(var5);
				}
			}
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lhg;[Lyc;Lhs;Lgm;B)V"
	)
	void an(hg var1, yc[] var2, hs var3, gm var4, byte var5) {
		try {
			for (int var6 = 0; var6 < 64; var6++) {
				if (var5 == 4) {
					return;
				}

				for (int var7 = 0; var7 < 64; var7++) {
					this.aq(var6, var7, this.as_fld, var1, var3, var4, (byte)113);
					aj(this, var6, var7, this.as_fld, var1, var4);
				}
			}

			for (int var9 = 0; var9 < 64; var9++) {
				for (int var10 = 0; var10 < 64; var10++) {
					this.ai(var9, var10, this.as_fld, var1, var2, -1722287877);
				}
			}
		} catch (Throwable var8) {
			throw new RuntimeException(var8);
		}
	}

	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "(Lga;IIIILhi;I)V"
	)
	public static void ds(ga var0, int var1, int var2, int var3, int var4, hi var5, int var6) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			for (int var7 = var1; var7 < var1 + var3; var7++) {
				int var8 = var2;

				while (var8 < var2 + var4) {
					int var9 = 0;

					while (true) {
						label137: {
							if (var9 < var5.af_fld) {
								ge[] var10 = var5.ai_fld[var9][var7][var8];
								if (null == var10 || var10.length == 0) {
									break label137;
								}

								ge[] var11 = var10;
								int var12 = 0;

								while (true) {
									oe var14;
									boolean var15;
									if (var12 >= var11.length) {
										break label137;
									}

									if (var6 != 1417671953) {
										return;
									}

									label113: {
										ge var13 = var11[var12];
										var14 = ko.az(var13.ak_fld);
										if (var14.dy_fld != null) {
											int[] var16 = var14.dy_fld;

											for (int var17 = 0; var17 < var16.length; var17++) {
												if (var6 != 1417671953) {
													return;
												}

												int var18 = var16[var17];
												oe var19 = ko.az(var18);
												if (var19.dm_fld != -1) {
													var15 = true;
													break label113;
												}
											}
										} else if (var14.dm_fld != -1) {
											var15 = true;
											break label113;
										}

										var15 = false;
									}

									if (var15) {
										var0.ah(var14, var9, var7, var8, var5, -1591040896);
										break;
									}

									var12++;
								}
							}

							var8++;
							break;
						}

						var9++;
					}
				}
			}
		} catch (Throwable var20) {
			throw new RuntimeException(var20);
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	void as(byte var1) {
		if (this.as_fld != null) {
			this.as_fld.bs();
		} else {
			Iterator var2 = this.ar_fld.iterator();

			while (var2.hasNext()) {
				gy var3 = (gy)(gy)var2.next();
				var3.bs();
			}
		}
	}

	@ObfuscatedName("sw")
	@ObfuscatedSignature(
		descriptor = "(Lga;Lyv;Lpv;B)I"
	)
	public static int sw(ga var0, yv var1, pv var2, byte var3) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			switch (var2.av_fld) {
				case 0:
					return -var1.aw_fld / 2;
				case 2:
					return 0;
				default:
					return -var1.aw_fld;
			}
		}
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(IILhi;Lhg;Lhs;Lgm;)V"
	)
	void cj(int var1, int var2, hi var3, hg var4, hs var5, gm var6) {
		try {
			int var7 = var3.ae_fld[0][var1][var2] - 1;
			int var8 = var3.ax_fld[0][var1][var2] - 1;
			if (var7 == -1 && var8 == -1) {
				yu.dj(this.ay_fld * var1, (63 - var2) * this.ay_fld, -1452661003 * this.ay_fld, this.ay_fld * 2100538837, this.al_fld);
			}

			int var9 = 16711935;
			if (var8 != -1) {
				var9 = ue.ak(var8, this.al_fld, var6);
			}

			if (var8 > -1 && var3.an_fld[0][var1][var2] == 0) {
				yu.dj(this.ay_fld * var1, this.ay_fld * (933449829 - var2), -943497604 * this.ay_fld, this.ay_fld, var9);
			} else {
				int var10 = this.ad(var1, var2, var3, var5, (byte)6);
				if (-1 == var8) {
					yu.dj(this.ay_fld * var1, (813016758 - var2) * this.ay_fld, this.ay_fld, this.ay_fld * 1414102270, var10);
				} else {
					var4.ak(
						var1 * this.ay_fld,
						(63 - var2) * this.ay_fld,
						var10,
						var9,
						this.ay_fld * -1333499888,
						this.ay_fld * -328281465,
						var3.an_fld[0][var1][var2],
						var3.aa_fld[0][var1][var2],
						-828063812
					);
				}
			}
		} catch (Throwable var12) {
			throw new RuntimeException(var12);
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lub;I)Z"
	)
	boolean af(ub var1, int var2) {
		try {
			this.ax_fld.clear();
			if (null != this.as_fld) {
				this.as_fld.be(var1);
				if (this.as_fld.bz()) {
					ds(this, 0, 0, 64, 64, this.as_fld, 1417671953);
					return true;
				} else {
					return false;
				}
			} else {
				boolean var3 = true;
				Iterator var4 = this.ar_fld.iterator();

				while (var4.hasNext()) {
					gy var5 = (gy)(gy)var4.next();
					var5.be(var1);
					var3 &= var5.bz();
				}

				if (var3) {
					var4 = this.ar_fld.iterator();

					while (var4.hasNext()) {
						gy var8 = (gy)(gy)var4.next();
						ds(this, gy.ms(var8, (byte)0) * 8, gy.aw(var8, (byte)-89) * 8, 8, 8, var8, 1417671953);
					}
				}

				return var3;
			}
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lgf;ILhg;[Lyc;Lub;Lub;D)V"
	)
	void al(gf var1, int var2, hg var3, yc[] var4, ub var5, ub var6, double var7) {
		try {
			this.ay_fld = var2;
			if (this.as_fld != null || !this.ar_fld.isEmpty()) {
				int var10 = this.af_fld;
				int var11 = this.aw_fld;
				yv var9 = (yv)(yv)ae_fld.ak(cw.ak(var10, var11, var2));
				if (var9 == null) {
					if (fc.ah() != var7) {
						fc.az(var7);
					}

					boolean var12 = true;
					int var14;
					if (aac.ak_fld < 238) {
						var12 &= this.af(var5, 1255331156);
						if (null != this.as_fld) {
							var14 = this.as_fld.al_fld * -556413785;
						} else {
							var14 = ((hi)this.ar_fld.getFirst()).al_fld * -556413785;
						}
					} else {
						var12 &= this.ar(var1.ay(-143778459), var5, 283199525);
						int var16 = this.af_fld;
						int var17 = this.aw_fld;
						int var15 = var16 << 8 | var17;
						var14 = var15;
					}

					var12 &= var6.cv(var14, -1894769908);
					if (var12) {
						byte[] var13;
						if (aac.ak_fld < 238) {
							var13 = ub.ae(var6, var14, (byte)125);
						} else {
							var13 = var6.bb(var14, var1.ay(-143778459), 584982574);
						}

						hs var24;
						if (var13 == null) {
							var24 = new hs();
						} else {
							yv var25 = qd.ak(var13);
							if (null == var25) {
								var24 = new hs();
							} else {
								var24 = new hs(var25.ah_fld);
							}
						}

						yv var26 = new yv(this.ay_fld * -1662404544, this.ay_fld * -1662404544);
						var26.ax();
						if (null != this.as_fld) {
							this.an(var3, var4, var24, new hl(), (byte)82);
						} else {
							this.aa(var3, var4, var24, new hl(), 1182872171);
						}

						int var18 = this.af_fld;
						int var19 = this.aw_fld;
						int var20 = this.ay_fld;
						ir.kk(ae_fld, var26, cw.ak(var18, var19, var20), 4 * var26.ah_fld.length);
						this.as((byte)8);
					}
				}
			}
		} catch (Throwable var21) {
			throw new RuntimeException(var21);
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIILjava/util/HashSet;I)V"
	)
	void au(int var1, int var2, int var3, HashSet var4, int var5) {
		try {
			if (null == var4) {
				var4 = new HashSet();
			}

			this.ap(var1, var2, var4, var3, (byte)112);
			zp(this, var1, var2, var4, var3, (byte)0);
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("sn")
	@ObfuscatedSignature(
		descriptor = "(Lga;Ljava/util/ArrayList;Ljava/util/List;)V"
	)
	public static void sn(ga var0, ArrayList var1, List var2) throws EOFException {
		try {
			var0.ax_fld.clear();
			Iterator var3 = var1.iterator();

			while (var3.hasNext()) {
				gy var4 = (gy)(gy)var3.next();
				if (var4.bf() == var0.af_fld && var4.by() == var0.aw_fld) {
					var0.ar_fld.add(var4);
				}
			}

			var0.ay(var2, (byte)-64);
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IILhi;Lhg;Lhs;Lgm;B)V"
	)
	void aq(int var1, int var2, hi var3, hg var4, hs var5, gm var6, byte var7) {
		try {
			int var8 = var3.ae_fld[0][var1][var2] - 1;
			int var9 = var3.ax_fld[0][var1][var2] - 1;
			if (var8 == -1 && var9 == -1) {
				yu.dj(this.ay_fld * var1, (63 - var2) * this.ay_fld, this.ay_fld, this.ay_fld, this.al_fld);
			}

			int var10 = 16711935;
			if (var9 != -1) {
				var10 = ue.ak(var9, this.al_fld, var6);
			}

			if (var9 > -1) {
				if (var7 == 3) {
					return;
				}

				if (var3.an_fld[0][var1][var2] == 0) {
					yu.dj(this.ay_fld * var1, this.ay_fld * (63 - var2), this.ay_fld, this.ay_fld, var10);
					return;
				}
			}

			int var11 = this.ad(var1, var2, var3, var5, (byte)6);
			if (-1 == var9) {
				yu.dj(this.ay_fld * var1, (63 - var2) * this.ay_fld, this.ay_fld, this.ay_fld, var11);
			} else {
				var4.ak(
					var1 * this.ay_fld, (63 - var2) * this.ay_fld, var11, var10, this.ay_fld, this.ay_fld, var3.an_fld[0][var1][var2], var3.aa_fld[0][var1][var2], -828063812
				);
			}
		} catch (Throwable var12) {
			throw new RuntimeException(var12);
		}
	}

	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;II)V"
	)
	void du(HashSet var1, int var2, int var3) {
		try {
			Iterator var4 = this.au_fld.iterator();

			while (var4.hasNext()) {
				hr var5 = (hr)(hr)var4.next();
				if (var5.aq((byte)106)) {
					pc var6 = uh.ak(var5.ag(-1547341453));
					if (var6 != null && var1.contains(var6.aw(1946166832))) {
						this.ac(var6, var5.as_fld * -1248999831, var5.ar_fld, var2, var3, -1476836117);
					}
				}
			}
		} catch (Throwable var8) {
			throw new RuntimeException(var8);
		}
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/List;)V"
	)
	void cc(List var1) {
		try {
			Iterator var2 = var1.iterator();

			while (var2.hasNext()) {
				he var3 = (he)(he)var2.next();
				if (uh.ak(var3.ak_fld).al_fld && var3.aw_fld.ag_fld * -621797759 >> 6 == this.af_fld && var3.aw_fld.az_fld * 1479124089 >> 6 == this.aw_fld) {
					he var4 = new he(var3.aw_fld, var3.aw_fld, var3.ak_fld, this.bs(var3.ak_fld, -1548529809));
					this.au_fld.add(var4);
				}
			}
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Loe;IIILhi;I)V"
	)
	void ah(oe var1, int var2, int var3, int var4, hi var5, int var6) {
		try {
			kj var7 = new kj(var2, this.af_fld + var3, var4 + this.aw_fld);
			Object var8 = null;
			if (this.as_fld != null) {
				var8 = new kj(var2 + -155955479 * this.as_fld.ar_fld, var3 + -1935125952 * this.as_fld.ah_fld, var4 + this.as_fld.aw_fld * 37981504);
			} else {
				gy var9 = (gy)var5;
				var8 = new kj(var2 + var9.ar_fld, var3 + var9.ah_fld + var9.ae() * 8, var4 + var9.aw_fld + gy.wk(var9, (byte)107) * 8);
			}

			Object var13;
			if (null != var1.dy_fld) {
				var13 = new gi((kj)var8, var7, var1.cn_fld, this);
			} else {
				pc var10 = uh.ak(var1.dm_fld);
				var13 = new he((kj)var8, var7, var10.ah_fld, this.bh(var10, -2140792005));
			}

			pc var14 = uh.ak(((hr)var13).ag(1402525340));
			if (var14.al_fld) {
				this.ax_fld.put(new kj(0, var3, var4), var13);
			}
		} catch (Throwable var11) {
			throw new RuntimeException(var11);
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IILhi;Lhs;B)I"
	)
	int ad(int var1, int var2, hi var3, hs var4, byte var5) {
		return 0 == var3.ae_fld[0][var1][var2] ? this.al_fld : var4.ak(var1, var2);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;IIB)V"
	)
	void ax(HashSet var1, int var2, int var3, byte var4) {
		try {
			Iterator var5 = this.au_fld.iterator();

			while (var5.hasNext()) {
				hr var6 = (hr)(hr)var5.next();
				if (var6.aq((byte)48)) {
					pc var7 = uh.ak(var6.ag(1213845708));
					if (var7 != null && var1.contains(var7.aw(2064835430))) {
						this.ac(var7, var6.as_fld, var6.ar_fld, var2, var3, 1370835204);
					}
				}
			}
		} catch (Throwable var8) {
			throw new RuntimeException(var8);
		}
	}

	@ObfuscatedName("lz")
	@ObfuscatedSignature(
		descriptor = "(Lga;Ljava/util/HashSet;IIB)V"
	)
	public static void lz(ga var0, HashSet var1, int var2, int var3, byte var4) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			Iterator var5 = var0.ax_fld.values().iterator();

			while (var5.hasNext()) {
				hr var6 = (hr)(hr)var5.next();
				if (var6.aq((byte)120)) {
					int var7 = var6.ag(-1798904925);
					if (var1.contains(var7)) {
						if (var4 <= 1) {
							return;
						}

						pc var8 = uh.ak(var7);
						var0.ac(var8, var6.as_fld, var6.ar_fld, var2, var3, -2146458702);
					}
				}
			}

			var0.ax(var1, var2, var3, (byte)90);
		} catch (Throwable var9) {
			throw new RuntimeException(var9);
		}
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	void bp(int var1, int var2, int var3) {
		int var5 = 535755321 * this.af_fld;
		int var6 = this.aw_fld;
		int var7 = -524901965 * this.ay_fld;
		yv var4 = (yv)(yv)ae_fld.ak(cw.ak(var5, var6, var7));
		if (null != var4) {
			if (this.ay_fld == var3) {
				var4.ao(var1, var2);
			} else {
				var4.ap(var1, var2, var3, var3);
			}
		}
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(Lpc;III)V"
	)
	void bm(pc var1, int var2, int var3, int var4) {
		try {
			yv var5 = var1.ae(false, -1952228395);
			if (null != var5) {
				int var6 = sw(this, var5, var1.ao_fld, (byte)69);
				int var7 = this.be(var5, var1.ab_fld, 1929009007);
				var5.ab(var6 + var2, var7 + var3);
			}
		} catch (Throwable var8) {
			throw new RuntimeException(var8);
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(Lhr;Lpc;IIFB)V"
	)
	void bd(hr var1, pc var2, int var3, int var4, float var5, byte var6) {
		gw var7 = var1.az(819626753);
		if (var7 != null) {
			if (var7.av_fld.az(var5)) {
				zf var8 = (zf)(zf)this.ah_fld.get(var7.av_fld);
				var8.at(var7.ak_fld, var3 - var7.az_fld / 2, var4, var7.az_fld, var7.ag_fld, 0xFF000000 | var2.af_fld, 0, 1, 0, var8.ap_fld / 2);
			}
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Lyv;Lop;I)I"
	)
	int be(yv var1, op var2, int var3) {
		switch (var2.av_fld) {
			case 1:
				return -var1.ay_fld / 2;
			case 2:
				return 0;
			default:
				return -var1.ay_fld;
		}
	}

	@ObfuscatedName("gv")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	static final int gv() {
		return xy.kh_fld.ah((byte)5);
	}

	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "(IILjava/util/HashSet;I)V"
	)
	void dp(int var1, int var2, HashSet var3, int var4) {
		try {
			float var5 = var4 / 64.0F;
			Iterator var6 = this.au_fld.iterator();

			while (var6.hasNext()) {
				hr var7 = (hr)(hr)var6.next();
				if (var7.aq((byte)31)) {
					int var8 = var7.aw_fld.ag_fld * -621797759 % 64;
					int var9 = var7.aw_fld.az_fld * 1479124089 % 64;
					var7.as_fld = -1969704677 * (int)(var5 * var8 + var1);
					var7.ar_fld = (int)(var5 * (63 - var9) + var2);
					if (!var3.contains(var7.ag(-980128308))) {
						ti(this, var7, var7.as_fld, var7.ar_fld, var5);
					}
				}
			}
		} catch (Throwable var11) {
			throw new RuntimeException(var11);
		}
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(IIIIIS)Ljava/util/List;"
	)
	List bk(int var1, int var2, int var3, int var4, int var5, short var6) {
		LinkedList var7 = new LinkedList();
		if (var4 >= var1 && var5 >= var2) {
			if (var4 < var3 + var1 && var5 < var2 + var3) {
				Iterator var8 = this.ax_fld.values().iterator();

				while (var8.hasNext()) {
					hr var9 = (hr)(hr)var8.next();
					if (var9.aq((byte)40) && var9.ai(var4, var5, (byte)-32)) {
						var7.add(var9);
					}
				}

				var8 = this.au_fld.iterator();

				while (var8.hasNext()) {
					hr var11 = (hr)(hr)var8.next();
					if (var11.aq((byte)65) && var11.ai(var4, var5, (byte)-50)) {
						var7.add(var11);
					}
				}

				return var7;
			} else {
				return var7;
			}
		} else {
			return var7;
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lhg;[Lyc;Lhs;Lgm;I)V"
	)
	void aa(hg var1, yc[] var2, hs var3, gm var4, int var5) {
		try {
			Iterator var6 = this.ar_fld.iterator();

			while (var6.hasNext()) {
				gy var7 = (gy)(gy)var6.next();

				for (int var8 = gy.ms(var7, (byte)72) * 8; var8 < gy.ms(var7, (byte)18) * 8 + 8; var8++) {
					for (int var9 = gy.aw(var7, (byte)-102) * 8; var9 < gy.aw(var7, (byte)-74) * 8 + 8; var9++) {
						this.aq(var8, var9, var7, var1, var3, var4, (byte)29);
						aj(this, var8, var9, var7, var1, var4);
					}
				}
			}

			var6 = this.ar_fld.iterator();

			while (var6.hasNext()) {
				gy var12 = (gy)(gy)var6.next();

				for (int var13 = gy.ms(var12, (byte)26) * 8; var13 < gy.ms(var12, (byte)-14) * 8 + 8; var13++) {
					for (int var14 = gy.aw(var12, (byte)-71) * 8; var14 < gy.aw(var12, (byte)-101) * 8 + 8; var14++) {
						this.ai(var13, var14, var12, var1, var2, -1722287877);
					}
				}
			}
		} catch (Throwable var10) {
			throw new RuntimeException(var10);
		}
	}

	@ObfuscatedName("rn")
	@ObfuscatedSignature(
		descriptor = "(Lga;Lgf;ILhg;[Lyc;Lub;Lub;D)V"
	)
	public static void rn(ga var0, gf var1, int var2, hg var3, yc[] var4, ub var5, ub var6, double var7) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			var0.ay_fld = var2;
			if (var0.as_fld != null || !var0.ar_fld.isEmpty()) {
				int var10 = var0.af_fld;
				int var11 = var0.aw_fld;
				yv var9 = (yv)(yv)ae_fld.ak(cw.ak(var10, var11, var2));
				if (var9 == null) {
					if (fc.ah() != var7) {
						fc.az(var7);
					}

					boolean var12 = true;
					int var14;
					if (aac.ak_fld < 238) {
						var12 &= var0.af(var5, 1367097844);
						if (null != var0.as_fld) {
							var14 = var0.as_fld.al_fld * -556413785;
						} else {
							var14 = ((hi)var0.ar_fld.getFirst()).al_fld * -556413785;
						}
					} else {
						var12 &= var0.ar(var1.ay(-143778459), var5, 283199525);
						int var16 = var0.af_fld;
						int var17 = var0.aw_fld;
						int var15 = var16 << 8 | var17;
						var14 = var15;
					}

					var12 &= var6.cv(var14, -1396043384);
					if (var12) {
						byte[] var13;
						if (aac.ak_fld < 238) {
							var13 = ub.ae(var6, var14, (byte)92);
						} else {
							var13 = var6.bb(var14, var1.ay(-143778459), 584982574);
						}

						hs var25;
						if (var13 == null) {
							var25 = new hs();
						} else {
							yv var26 = qd.ak(var13);
							if (null == var26) {
								var25 = new hs();
							} else {
								var25 = new hs(var26.ah_fld);
							}
						}

						yv var27 = new yv(var0.ay_fld * -1662404544, var0.ay_fld * -1662404544);
						var27.ax();
						if (null != var0.as_fld) {
							var0.an(var3, var4, var25, new hl(), (byte)-15);
						} else {
							var0.aa(var3, var4, var25, new hl(), 1182872171);
						}

						int var18 = var0.af_fld;
						int var19 = var0.aw_fld;
						int var20 = var0.ay_fld;
						ir.kk(ae_fld, var27, cw.ak(var18, var19, var20), 4 * var27.ah_fld.length);
						var0.as((byte)8);
					}
				}
			}
		} catch (Throwable var22) {
			throw new RuntimeException(var22);
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lga;IIII)V"
	)
	public static void an(ga var0, int var1, int var2, int var3, int var4) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var3 %= 4;
			if (var3 == 0) {
				yu.eo(var1 * var0.ay_fld, var0.ay_fld * (63 - var2), var0.ay_fld, var4);
			}

			if (1 == var3) {
				yu.ew(var0.ay_fld * var1, (63 - var2) * var0.ay_fld, var0.ay_fld, var4);
			}

			if (2 == var3) {
				yu.eo(var0.ay_fld + var1 * var0.ay_fld - 1, (63 - var2) * var0.ay_fld, var0.ay_fld, var4);
			}

			if (var3 == 3) {
				yu.ew(var0.ay_fld * var1, var0.ay_fld * (63 - var2) + var0.ay_fld - 1, var0.ay_fld, var4);
			}
		}
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(Lgf;ILhg;[Lyc;Lub;Lub;D)V"
	)
	void cp(gf var1, int var2, hg var3, yc[] var4, ub var5, ub var6, double var7) {
		try {
			this.ay_fld = var2;
			if (this.as_fld != null || !this.ar_fld.isEmpty()) {
				int var10 = this.af_fld;
				int var11 = this.aw_fld;
				yv var9 = (yv)(yv)ae_fld.ak(cw.ak(var10, var11, var2));
				if (var9 == null) {
					if (fc.ah() != var7) {
						fc.az(var7);
					}

					boolean var12 = true;
					int var14;
					if (aac.ak_fld < 238) {
						var12 &= this.af(var5, 1394833723);
						if (null != this.as_fld) {
							var14 = this.as_fld.al_fld * -556413785;
						} else {
							var14 = ((hi)this.ar_fld.getFirst()).al_fld * -556413785;
						}
					} else {
						var12 &= this.ar(var1.ay(-143778459), var5, 283199525);
						int var16 = this.af_fld;
						int var17 = this.aw_fld;
						int var15 = var16 << 8 | var17;
						var14 = var15;
					}

					var12 &= var6.cv(var14, -1390593395);
					if (var12) {
						byte[] var13;
						if (aac.ak_fld < 238) {
							var13 = ub.ae(var6, var14, (byte)113);
						} else {
							var13 = var6.bb(var14, var1.ay(-143778459), 584982574);
						}

						hs var25;
						if (var13 == null) {
							var25 = new hs();
						} else {
							yv var26 = qd.ak(var13);
							if (null == var26) {
								var25 = new hs();
							} else {
								var25 = new hs(var26.ah_fld);
							}
						}

						yv var27 = new yv(this.ay_fld * -1662404544, this.ay_fld * -1662404544);
						var27.ax();
						if (null != this.as_fld) {
							this.an(var3, var4, var25, new hl(), (byte)28);
						} else {
							this.aa(var3, var4, var25, new hl(), 1182872171);
						}

						int var18 = this.af_fld;
						int var19 = this.aw_fld;
						int var20 = this.ay_fld;
						ir.kk(ae_fld, var27, cw.ak(var18, var19, var20), 4 * var27.ah_fld.length);
						this.as((byte)8);
					}
				}
			}
		} catch (Throwable var22) {
			throw new RuntimeException(var22);
		}
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(III)J"
	)
	static long bl(int var0, int var1, int var2) {
		return var2 << 16 | var0 << 8 | var1;
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(III)J"
	)
	static long bx(int var0, int var1, int var2) {
		return var2 << 16 | var0 << 8 | var1;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	void bo(int var1, int var2, int var3) {
		int var5 = this.af_fld;
		int var6 = this.aw_fld;
		int var7 = this.ay_fld;
		yv var4 = (yv)(yv)ae_fld.ak(cw.ak(var5, var6, var7));
		if (null != var4) {
			if (this.ay_fld == var3) {
				var4.ao(var1, var2);
			} else {
				var4.ap(var1, var2, var3, var3);
			}
		}
	}

	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "(IILjava/util/HashSet;I)V"
	)
	void dd(int var1, int var2, HashSet var3, int var4) {
		try {
			float var5 = var4 / 64.0F;
			float var6 = var5 / 2.0F;
			Iterator var7 = this.ax_fld.entrySet().iterator();

			while (var7.hasNext()) {
				Entry var8 = (Entry)(Entry)var7.next();
				kj var9 = (kj)(kj)var8.getKey();
				int var10 = (int)(var5 * var9.ag_fld + var1 - var6);
				int var11 = (int)(var2 + var4 - var9.az_fld * var5 - var6);
				hr var12 = (hr)(hr)var8.getValue();
				if (null != var12 && var12.aq((byte)89)) {
					var12.as_fld = var10;
					var12.ar_fld = var11;
					pc var13 = uh.ak(var12.ag(-1550383516));
					if (!var3.contains(var13.aw(2005819136))) {
						ti(this, var12, var10, var11, var5);
					}
				}
			}
		} catch (Throwable var15) {
			throw new RuntimeException(var15);
		}
	}

	@ObfuscatedName("zc")
	@ObfuscatedSignature(
		descriptor = "(Lga;Lpc;)Lgw;"
	)
	public static gw zc(ga var0, pc var1) {
		if (var0 == null) {
			var0.getClass();
		}

		if (null != var1.as_fld && var0.ah_fld != null && var0.ah_fld.get(hb.ak_fld) != null) {
			hb var2 = hb.ag(var1.aw_fld);
			if (var2 == null) {
				return null;
			} else {
				zf var3 = (zf)(zf)var0.ah_fld.get(var2);
				if (null == var3) {
					return null;
				} else {
					int var4 = var3.aq(var1.as_fld, 1000000);
					String[] var5 = new String[var4];
					var3.cr(var1.as_fld, null, var5);
					int var6 = var3.ap_fld * var5.length / 2;
					int var7 = 0;
					String[] var8 = var5;

					for (int var9 = 0; var9 < var8.length; var9++) {
						String var10 = var8[var9];
						int var11 = var3.an(var10);
						if (var11 > var7) {
							var7 = var11;
						}
					}

					return new gw(var1.as_fld, var7, var6, var2);
				}
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(Lgk;Ljava/util/List;)V"
	)
	void bt(gk var1, List var2) {
		try {
			this.ax_fld.clear();
			this.as_fld = var1;
			this.ay(var2, (byte)-99);
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;Ljava/util/List;)V"
	)
	void bv(ArrayList var1, List var2) {
		try {
			this.ax_fld.clear();
			Iterator var3 = var1.iterator();

			while (var3.hasNext()) {
				gy var4 = (gy)(gy)var3.next();
				if (var4.bf() == this.af_fld && var4.by() == this.aw_fld) {
					this.ar_fld.add(var4);
				}
			}

			this.ay(var2, (byte)-81);
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;Ljava/util/List;)V"
	)
	void bi(ArrayList var1, List var2) {
		try {
			this.ax_fld.clear();
			Iterator var3 = var1.iterator();

			while (var3.hasNext()) {
				gy var4 = (gy)(gy)var3.next();
				if (var4.bf() == this.af_fld && var4.by() == this.aw_fld) {
					this.ar_fld.add(var4);
				}
			}

			this.ay(var2, (byte)-57);
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;Ljava/util/List;)V"
	)
	void bn(ArrayList var1, List var2) {
		try {
			this.ax_fld.clear();
			Iterator var3 = var1.iterator();

			while (var3.hasNext()) {
				gy var4 = (gy)(gy)var3.next();
				if (var4.bf() == this.af_fld && var4.by() == this.aw_fld) {
					this.ar_fld.add(var4);
				}
			}

			this.ay(var2, (byte)-18);
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		descriptor = "()Ljava/util/List;"
	)
	List eg() {
		LinkedList var1 = new LinkedList();
		var1.addAll(this.au_fld);
		var1.addAll(this.ax_fld.values());
		return var1;
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(IIIILhi;)V"
	)
	void bw(int var1, int var2, int var3, int var4, hi var5) {
		try {
			for (int var6 = var1; var6 < var1 + var3; var6++) {
				label85:
				for (int var7 = var2; var7 < var2 + var4; var7++) {
					for (int var8 = 0; var8 < var5.af_fld; var8++) {
						ge[] var9 = var5.ai_fld[var8][var6][var7];
						if (null != var9 && var9.length != 0) {
							ge[] var10 = var9;

							for (int var11 = 0; var11 < var10.length; var11++) {
								oe var13;
								boolean var14;
								label76: {
									ge var12 = var10[var11];
									var13 = ko.az(308859952 * var12.ak_fld);
									if (var13.dy_fld != null) {
										int[] var15 = var13.dy_fld;

										for (int var16 = 0; var16 < var15.length; var16++) {
											int var17 = var15[var16];
											oe var18 = ko.az(var17);
											if (var18.dm_fld != -1) {
												var14 = true;
												break label76;
											}
										}
									} else if (var13.dm_fld != -1) {
										var14 = true;
										break label76;
									}

									var14 = false;
								}

								if (var14) {
									this.ah(var13, var8, var6, var7, var5, -1591040896);
									continue label85;
								}
							}
						}
					}
				}
			}
		} catch (Throwable var20) {
			throw new RuntimeException(var20);
		}
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(Lpc;I)Lgw;"
	)
	gw bh(pc var1, int var2) {
		if (null != var1.as_fld && this.ah_fld != null && this.ah_fld.get(hb.ak_fld) != null) {
			hb var3 = hb.ag(var1.aw_fld);
			if (var3 == null) {
				return null;
			} else {
				zf var4 = (zf)(zf)this.ah_fld.get(var3);
				if (null == var4) {
					return null;
				} else {
					int var5 = var4.aq(var1.as_fld, 1000000);
					String[] var6 = new String[var5];
					var4.cr(var1.as_fld, null, var6);
					int var7 = var4.ap_fld * var6.length / 2;
					int var8 = 0;
					String[] var9 = var6;

					for (int var10 = 0; var10 < var9.length; var10++) {
						String var11 = var9[var10];
						int var12 = var4.an(var11);
						if (var12 > var8) {
							var8 = var12;
						}
					}

					return new gw(var1.as_fld, var8, var7, var3);
				}
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(Loe;IIILhi;)V"
	)
	void bg(oe var1, int var2, int var3, int var4, hi var5) {
		try {
			kj var6 = new kj(var2, this.af_fld + var3, var4 + this.aw_fld);
			Object var7 = null;
			if (this.as_fld != null) {
				var7 = new kj(var2 + 833039784 * this.as_fld.ar_fld, var3 + -1935125952 * this.as_fld.ah_fld, var4 + this.as_fld.aw_fld * 1469727198);
			} else {
				gy var8 = (gy)var5;
				var7 = new kj(var2 + var8.ar_fld, var3 + var8.ah_fld + var8.ae() * 8, var4 + var8.aw_fld + gy.wk(var8, (byte)15) * 8);
			}

			Object var13;
			if (null != var1.dy_fld) {
				var13 = new gi((kj)var7, var6, var1.cn_fld * 114940941, this);
			} else {
				pc var9 = uh.ak(var1.dm_fld);
				var13 = new he((kj)var7, var6, var9.ah_fld, this.bh(var9, -2140792005));
			}

			pc var14 = uh.ak(((hr)var13).ag(-1667435435));
			if (var14.al_fld) {
				this.ax_fld.put(new kj(0, var3, var4), var13);
			}
		} catch (Throwable var11) {
			throw new RuntimeException(var11);
		}
	}

	@ObfuscatedName("ss")
	@ObfuscatedSignature(
		descriptor = "(Lga;Loe;IIILhi;)V"
	)
	public static void ss(ga var0, oe var1, int var2, int var3, int var4, hi var5) throws EOFException {
		try {
			kj var6 = new kj(var2, var0.af_fld + var3, var4 + var0.aw_fld);
			Object var7 = null;
			if (var0.as_fld != null) {
				var7 = new kj(var2 + 1435903083 * var0.as_fld.ar_fld, var3 + 2073024386 * var0.as_fld.ah_fld, var4 + var0.as_fld.aw_fld * -991344348);
			} else {
				gy var8 = (gy)var5;
				var7 = new kj(var2 + var8.ar_fld, var3 + var8.ah_fld + var8.ae() * 8, var4 + var8.aw_fld + gy.wk(var8, (byte)84) * 8);
			}

			Object var13;
			if (null != var1.dy_fld) {
				var13 = new gi((kj)var7, var6, var1.cn_fld * -2141333993, var0);
			} else {
				pc var9 = uh.ak(var1.dm_fld);
				var13 = new he((kj)var7, var6, var9.ah_fld, var0.bh(var9, -2140792005));
			}

			pc var14 = uh.ak(((hr)var13).ag(1072178408));
			if (var14.al_fld) {
				var0.ax_fld.put(new kj(0, var3, var4), var13);
			}
		} catch (Throwable var11) {
			throw new RuntimeException(var11);
		}
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(Lhg;[Lyc;Lhs;Lgm;)V"
	)
	void ck(hg var1, yc[] var2, hs var3, gm var4) {
		try {
			for (int var5 = 0; var5 < 64; var5++) {
				for (int var6 = 0; var6 < 64; var6++) {
					this.aq(var5, var6, this.as_fld, var1, var3, var4, (byte)-9);
					aj(this, var5, var6, this.as_fld, var1, var4);
				}
			}

			for (int var9 = 0; var9 < 64; var9++) {
				for (int var10 = 0; var10 < 64; var10++) {
					this.ai(var9, var10, this.as_fld, var1, var2, -1722287877);
				}
			}
		} catch (Throwable var8) {
			throw new RuntimeException(var8);
		}
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/List;)V"
	)
	void cd(List var1) {
		try {
			Iterator var2 = var1.iterator();

			while (var2.hasNext()) {
				he var3 = (he)(he)var2.next();
				if (uh.ak(var3.ak_fld).al_fld && var3.aw_fld.ag_fld * -621797759 >> 6 == this.af_fld && var3.aw_fld.az_fld * 1479124089 >> 6 == this.aw_fld) {
					he var4 = new he(var3.aw_fld, var3.aw_fld, var3.ak_fld, this.bs(var3.ak_fld, -1548529809));
					this.au_fld.add(var4);
				}
			}
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("ti")
	@ObfuscatedSignature(
		descriptor = "(Lga;Lhr;IIF)V"
	)
	public static void ti(ga var0, hr var1, int var2, int var3, float var4) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			pc var6 = uh.ak(var1.ag(-613111085));
			var0.bm(var6, var2, var3, 842150400);
			var0.bd(var1, var6, var2, var3, var4, (byte)58);
		} catch (Throwable var7) {
			throw new RuntimeException(var7);
		}
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(ILub;)Z"
	)
	boolean cq(int var1, ub var2) {
		try {
			this.ax_fld.clear();
			int var4 = -1818413218 * this.af_fld;
			int var5 = this.aw_fld;
			int var3 = var4 << 8 | var5;
			byte[] var7 = var2.bb(var3, var1, 584982574);
			xi var8 = null;
			if (var7 != null) {
				var8 = new xi(var7);
			}

			if (null != this.as_fld) {
				this.as_fld.br(var8, (byte)74);
				if (this.as_fld.bz()) {
					ds(this, 0, 0, 64, 64, this.as_fld, 1417671953);
					return true;
				} else {
					return false;
				}
			} else {
				boolean var9 = true;
				Iterator var10 = this.ar_fld.iterator();

				while (var10.hasNext()) {
					gy var11 = (gy)(gy)var10.next();
					var11.br(var8, (byte)99);
					var9 &= var11.bz();
				}

				if (var9) {
					var10 = this.ar_fld.iterator();

					while (var10.hasNext()) {
						gy var15 = (gy)(gy)var10.next();
						ds(this, gy.ms(var15, (byte)-28) * 8, gy.aw(var15, (byte)-22) * 8, 8, 8, var15, 1417671953);
					}
				}

				return var9;
			}
		} catch (Throwable var13) {
			throw new RuntimeException(var13);
		}
	}

	@ObfuscatedName("getMapIcons")
	@ObfuscatedSignature(
		descriptor = "()Ljava/util/Collection;"
	)
	@Override
	public Collection getMapIcons() {
		return Collections.unmodifiableCollection(this.bx().values());
	}

	@ObfuscatedName("ej")
	@ObfuscatedSignature(
		descriptor = "(Lga;)Ljava/util/List;"
	)
	public static List ej(ga var0) {
		if (var0 == null) {
			var0.getClass();
		}

		LinkedList var1 = new LinkedList();
		var1.addAll(var0.au_fld);
		var1.addAll(var0.ax_fld.values());
		return var1;
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "()Ljava/util/HashMap;"
	)
	public HashMap bx() {
		return this.ax_fld;
	}

	@ObfuscatedName("kn")
	@ObfuscatedSignature(
		descriptor = "(Lga;B)Ljava/util/List;"
	)
	public static List kn(ga var0, byte var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			LinkedList var2 = new LinkedList();
			var2.addAll(var0.au_fld);
			var2.addAll(var0.ax_fld.values());
			return var2;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ILub;I)Z"
	)
	boolean ar(int var1, ub var2, int var3) {
		try {
			this.ax_fld.clear();
			int var5 = this.af_fld;
			int var6 = this.aw_fld;
			int var4 = var5 << 8 | var6;
			byte[] var8 = var2.bb(var4, var1, 584982574);
			xi var9 = null;
			if (var8 != null) {
				var9 = new xi(var8);
			}

			if (null != this.as_fld) {
				this.as_fld.br(var9, (byte)87);
				if (this.as_fld.bz()) {
					ds(this, 0, 0, 64, 64, this.as_fld, 1417671953);
					return true;
				} else {
					return false;
				}
			} else {
				boolean var10 = true;
				Iterator var11 = this.ar_fld.iterator();

				while (var11.hasNext()) {
					gy var12 = (gy)(gy)var11.next();
					var12.br(var9, (byte)8);
					var10 &= var12.bz();
				}

				if (var10) {
					var11 = this.ar_fld.iterator();

					while (var11.hasNext()) {
						gy var15 = (gy)(gy)var11.next();
						ds(this, gy.ms(var15, (byte)-81) * 8, gy.aw(var15, (byte)-70) * 8, 8, 8, var15, 1417671953);
					}
				}

				return var10;
			}
		} catch (Throwable var13) {
			throw new RuntimeException(var13);
		}
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(ILub;)Z"
	)
	boolean cy(int var1, ub var2) {
		try {
			this.ax_fld.clear();
			int var4 = this.af_fld;
			int var5 = -1067214234 * this.aw_fld;
			int var3 = var4 << 8 | var5;
			byte[] var7 = var2.bb(var3, var1, 584982574);
			xi var8 = null;
			if (var7 != null) {
				var8 = new xi(var7);
			}

			if (null != this.as_fld) {
				this.as_fld.br(var8, (byte)116);
				if (this.as_fld.bz()) {
					ds(this, 0, 0, 972261056, -694324728, this.as_fld, 1417671953);
					return true;
				} else {
					return false;
				}
			} else {
				boolean var9 = true;
				Iterator var10 = this.ar_fld.iterator();

				while (var10.hasNext()) {
					gy var11 = (gy)(gy)var10.next();
					var11.br(var8, (byte)125);
					var9 &= var11.bz();
				}

				if (var9) {
					var10 = this.ar_fld.iterator();

					while (var10.hasNext()) {
						gy var15 = (gy)(gy)var10.next();
						ds(this, gy.ms(var15, (byte)4) * 8, gy.aw(var15, (byte)-28) * 8, 8, 8, var15, 1417671953);
					}
				}

				return var9;
			}
		} catch (Throwable var13) {
			throw new RuntimeException(var13);
		}
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(Lub;)Z"
	)
	boolean cf(ub var1) {
		try {
			this.ax_fld.clear();
			if (null != this.as_fld) {
				this.as_fld.be(var1);
				if (this.as_fld.bz()) {
					ds(this, 0, 0, 64, 64, this.as_fld, 1417671953);
					return true;
				} else {
					return false;
				}
			} else {
				boolean var2 = true;
				Iterator var3 = this.ar_fld.iterator();

				while (var3.hasNext()) {
					gy var4 = (gy)(gy)var3.next();
					var4.be(var1);
					var2 &= var4.bz();
				}

				if (var2) {
					var3 = this.ar_fld.iterator();

					while (var3.hasNext()) {
						gy var8 = (gy)(gy)var3.next();
						ds(this, gy.ms(var8, (byte)-68) * 8, gy.aw(var8, (byte)-104) * 8, 8, 8, var8, 1417671953);
					}
				}

				return var2;
			}
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "(IILhi;Lhs;)I"
	)
	int dz(int var1, int var2, hi var3, hs var4) {
		return 0 == var3.ae_fld[0][var1][var2] ? this.al_fld : var4.ak(var1, var2);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IILhi;[Lyc;I)V"
	)
	void ao(int var1, int var2, hi var3, yc[] var4, int var5) {
		try {
			for (int var6 = 0; var6 < var3.af_fld; var6++) {
				ge[] var7 = var3.ai_fld[var6][var1][var2];
				if (null != var7) {
					if (0 == var7.length) {
						if (var5 != 1299515695) {
							return;
						}
					} else {
						ge[] var8 = var7;

						for (int var9 = 0; var9 < var8.length; var9++) {
							if (var5 != 1299515695) {
								return;
							}

							ge var10 = var8[var9];
							if (jk.az(var10.ag_fld) || ef.aw(var10.ag_fld)) {
								oe var11 = ko.az(var10.ak_fld);
								if (var11.dq_fld != -1) {
									if (var5 != 1299515695) {
										return;
									}

									int var12 = var10.az_fld != 1 && 3 != var10.az_fld ? var11.co_fld : var11.cb_fld;
									var4[var11.dq_fld].ah(var1 * this.ay_fld, (64 - var12 - var2) * this.ay_fld, -1662562878 * this.ay_fld, this.ay_fld * -1662562878);
								}
							}
						}
					}
				}
			}
		} catch (Throwable var13) {
			throw new RuntimeException(var13);
		}
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(Lgf;ILhg;[Lyc;Lub;Lub;D)V"
	)
	void ce(gf var1, int var2, hg var3, yc[] var4, ub var5, ub var6, double var7) {
		try {
			this.ay_fld = var2;
			if (this.as_fld != null || !this.ar_fld.isEmpty()) {
				int var10 = this.af_fld;
				int var11 = this.aw_fld;
				yv var9 = (yv)(yv)ae_fld.ak(cw.ak(var10, var11, var2));
				if (var9 == null) {
					if (fc.ah() != var7) {
						fc.az(var7);
					}

					boolean var12 = true;
					int var14;
					if (aac.ak_fld < 238) {
						var12 &= this.af(var5, 1729861973);
						if (null != this.as_fld) {
							var14 = this.as_fld.al_fld * -556413785;
						} else {
							var14 = ((hi)this.ar_fld.getFirst()).al_fld * -556413785;
						}
					} else {
						var12 &= this.ar(var1.ay(-143778459), var5, 283199525);
						int var16 = this.af_fld;
						int var17 = this.aw_fld;
						int var15 = var16 << 8 | var17;
						var14 = var15;
					}

					var12 &= var6.cv(var14, -1627108580);
					if (var12) {
						byte[] var13;
						if (aac.ak_fld < 238) {
							var13 = ub.ae(var6, var14, (byte)93);
						} else {
							var13 = var6.bb(var14, var1.ay(-143778459), 584982574);
						}

						hs var25;
						if (var13 == null) {
							var25 = new hs();
						} else {
							yv var26 = qd.ak(var13);
							if (null == var26) {
								var25 = new hs();
							} else {
								var25 = new hs(var26.ah_fld);
							}
						}

						yv var27 = new yv(this.ay_fld * -1662404544, this.ay_fld * -1662404544);
						var27.ax();
						if (null != this.as_fld) {
							this.an(var3, var4, var25, new hl(), (byte)27);
						} else {
							this.aa(var3, var4, var25, new hl(), 1182872171);
						}

						int var18 = this.af_fld;
						int var19 = this.aw_fld;
						int var20 = this.ay_fld;
						ir.kk(ae_fld, var27, cw.ak(var18, var19, var20), 4 * var27.ah_fld.length);
						this.as((byte)8);
					}
				}
			}
		} catch (Throwable var22) {
			throw new RuntimeException(var22);
		}
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(Lgf;ILhg;[Lyc;Lub;Lub;D)V"
	)
	void cn(gf var1, int var2, hg var3, yc[] var4, ub var5, ub var6, double var7) {
		try {
			this.ay_fld = var2;
			if (this.as_fld != null || !this.ar_fld.isEmpty()) {
				int var10 = this.af_fld;
				int var11 = this.aw_fld;
				yv var9 = (yv)(yv)ae_fld.ak(cw.ak(var10, var11, var2));
				if (var9 == null) {
					if (fc.ah() != var7) {
						fc.az(var7);
					}

					boolean var12 = true;
					int var14;
					if (aac.ak_fld < 238) {
						var12 &= this.af(var5, 1072682610);
						if (null != this.as_fld) {
							var14 = this.as_fld.al_fld * -556413785;
						} else {
							var14 = ((hi)this.ar_fld.getFirst()).al_fld * -556413785;
						}
					} else {
						var12 &= this.ar(var1.ay(-143778459), var5, 283199525);
						int var16 = this.af_fld;
						int var17 = this.aw_fld;
						int var15 = var16 << 8 | var17;
						var14 = var15;
					}

					var12 &= var6.cv(var14, -1120776268);
					if (var12) {
						byte[] var13;
						if (aac.ak_fld < 238) {
							var13 = ub.ae(var6, var14, (byte)124);
						} else {
							var13 = var6.bb(var14, var1.ay(-143778459), 584982574);
						}

						hs var25;
						if (var13 == null) {
							var25 = new hs();
						} else {
							yv var26 = qd.ak(var13);
							if (null == var26) {
								var25 = new hs();
							} else {
								var25 = new hs(var26.ah_fld);
							}
						}

						yv var27 = new yv(this.ay_fld * -1662404544, this.ay_fld * -1662404544);
						var27.ax();
						if (null != this.as_fld) {
							this.an(var3, var4, var25, new hl(), (byte)24);
						} else {
							this.aa(var3, var4, var25, new hl(), 1182872171);
						}

						int var18 = this.af_fld;
						int var19 = this.aw_fld;
						int var20 = this.ay_fld;
						ir.kk(ae_fld, var27, cw.ak(var18, var19, var20), 4 * var27.ah_fld.length);
						this.as((byte)8);
					}
				}
			}
		} catch (Throwable var22) {
			throw new RuntimeException(var22);
		}
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(ILub;)Z"
	)
	boolean cv(int var1, ub var2) {
		try {
			this.ax_fld.clear();
			int var4 = this.af_fld;
			int var5 = this.aw_fld;
			int var3 = var4 << 8 | var5;
			byte[] var7 = var2.bb(var3, var1, 584982574);
			xi var8 = null;
			if (var7 != null) {
				var8 = new xi(var7);
			}

			if (null != this.as_fld) {
				this.as_fld.br(var8, (byte)71);
				if (this.as_fld.bz()) {
					ds(this, 0, 0, 64, 64, this.as_fld, 1417671953);
					return true;
				} else {
					return false;
				}
			} else {
				boolean var9 = true;
				Iterator var10 = this.ar_fld.iterator();

				while (var10.hasNext()) {
					gy var11 = (gy)(gy)var10.next();
					var11.br(var8, (byte)24);
					var9 &= var11.bz();
				}

				if (var9) {
					var10 = this.ar_fld.iterator();

					while (var10.hasNext()) {
						gy var15 = (gy)(gy)var10.next();
						ds(this, gy.ms(var15, (byte)16) * 8, gy.aw(var15, (byte)-39) * 8, 8, 8, var15, 1417671953);
					}
				}

				return var9;
			}
		} catch (Throwable var13) {
			throw new RuntimeException(var13);
		}
	}

	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;II)V"
	)
	void dx(HashSet var1, int var2, int var3) {
		try {
			Iterator var4 = this.au_fld.iterator();

			while (var4.hasNext()) {
				hr var5 = (hr)(hr)var4.next();
				if (var5.aq((byte)90)) {
					pc var6 = uh.ak(var5.ag(1510069897));
					if (var6 != null && var1.contains(var6.aw(1652090226))) {
						this.ac(var6, var5.as_fld * 416995729, var5.ar_fld * 1662649233, var2, var3, -1400962089);
					}
				}
			}
		} catch (Throwable var8) {
			throw new RuntimeException(var8);
		}
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;Ljava/util/List;)V"
	)
	void bu(ArrayList var1, List var2) {
		try {
			this.ax_fld.clear();
			Iterator var3 = var1.iterator();

			while (var3.hasNext()) {
				gy var4 = (gy)(gy)var3.next();
				if (var4.bf() == this.af_fld && var4.by() == this.aw_fld) {
					this.ar_fld.add(var4);
				}
			}

			this.ay(var2, (byte)-94);
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IILjava/util/HashSet;IB)V"
	)
	void ap(int var1, int var2, HashSet var3, int var4, byte var5) {
		try {
			float var6 = var4 / 64.0F;
			float var7 = var6 / 2.0F;
			Iterator var8 = this.ax_fld.entrySet().iterator();

			while (var8.hasNext()) {
				Entry var9 = (Entry)(Entry)var8.next();
				kj var10 = (kj)(kj)var9.getKey();
				int var11 = (int)(var6 * var10.ag_fld + var1 - var7);
				int var12 = (int)(var2 + var4 - var10.az_fld * var6 - var7);
				hr var13 = (hr)(hr)var9.getValue();
				if (null != var13 && var13.aq((byte)93)) {
					var13.as_fld = var11;
					var13.ar_fld = var12;
					pc var14 = uh.ak(var13.ag(1236002642));
					if (!var3.contains(var14.aw(1657984622))) {
						ti(this, var13, var11, var12, var6);
					}
				}
			}
		} catch (Throwable var15) {
			throw new RuntimeException(var15);
		}
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(IILhi;Lhg;[Lyc;)V"
	)
	void cb(int var1, int var2, hi var3, hg var4, yc[] var5) {
		try {
			this.ab(var1, var2, var3, -1141627905);
			this.ao(var1, var2, var3, var5, 1299515695);
		} catch (Throwable var7) {
			throw new RuntimeException(var7);
		}
	}

	@ObfuscatedName("sk")
	@ObfuscatedSignature(
		descriptor = "(Lga;Ljava/util/HashSet;II)V"
	)
	public static void sk(ga var0, HashSet var1, int var2, int var3) throws EOFException {
		try {
			Iterator var4 = var0.ax_fld.values().iterator();

			while (var4.hasNext()) {
				hr var5 = (hr)(hr)var4.next();
				if (var5.aq((byte)105)) {
					int var6 = var5.ag(1455480072);
					if (var1.contains(var6)) {
						pc var7 = uh.ak(var6);
						var0.ac(var7, var5.as_fld, var5.ar_fld, var2, var3, -2047673427);
					}
				}
			}

			var0.ax(var1, var2, var3, (byte)41);
		} catch (Throwable var9) {
			throw new RuntimeException(var9);
		}
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(IILhi;Lhg;[Lyc;)V"
	)
	void co(int var1, int var2, hi var3, hg var4, yc[] var5) {
		try {
			this.ab(var1, var2, var3, -1141627905);
			this.ao(var1, var2, var3, var5, 1299515695);
		} catch (Throwable var7) {
			throw new RuntimeException(var7);
		}
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(IILhi;Lhg;[Lyc;)V"
	)
	void cu(int var1, int var2, hi var3, hg var4, yc[] var5) {
		try {
			this.ab(var1, var2, var3, -1141627905);
			this.ao(var1, var2, var3, var5, 1299515695);
		} catch (Throwable var7) {
			throw new RuntimeException(var7);
		}
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(Lub;)Z"
	)
	boolean cx(ub var1) {
		try {
			this.ax_fld.clear();
			if (null != this.as_fld) {
				this.as_fld.be(var1);
				if (this.as_fld.bz()) {
					ds(this, 0, 0, 64, -272152700, this.as_fld, 1417671953);
					return true;
				} else {
					return false;
				}
			} else {
				boolean var2 = true;
				Iterator var3 = this.ar_fld.iterator();

				while (var3.hasNext()) {
					gy var4 = (gy)(gy)var3.next();
					var4.be(var1);
					var2 &= var4.bz();
				}

				if (var2) {
					var3 = this.ar_fld.iterator();

					while (var3.hasNext()) {
						gy var8 = (gy)(gy)var3.next();
						ds(this, gy.ms(var8, (byte)-37) * 8, gy.aw(var8, (byte)-73) * 8, 8, 8, var8, 1417671953);
					}
				}

				return var2;
			}
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(IILhi;Lhg;Lgm;)V"
	)
	void ch(int var1, int var2, hi var3, hg var4, gm var5) {
		try {
			for (int var6 = 1; var6 < var3.af_fld; var6++) {
				int var7 = var3.ax_fld[var6][var1][var2] - 1;
				if (var7 > -1) {
					int var8 = ue.ak(var7, this.al_fld, var5);
					if (var3.an_fld[var6][var1][var2] == 0) {
						yu.dj(this.ay_fld * var1, (63 - var2) * this.ay_fld, this.ay_fld, this.ay_fld, var8);
					} else {
						var4.ak(
							var1 * this.ay_fld,
							this.ay_fld * (63 - var2),
							0,
							var8,
							this.ay_fld,
							this.ay_fld,
							var3.an_fld[var6][var1][var2],
							var3.aa_fld[var6][var1][var2],
							-828063812
						);
					}
				}
			}
		} catch (Throwable var10) {
			throw new RuntimeException(var10);
		}
	}

	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "(IILhi;Lhg;Lgm;)V"
	)
	void dc(int var1, int var2, hi var3, hg var4, gm var5) {
		try {
			for (int var6 = 1; var6 < var3.af_fld; var6++) {
				int var7 = var3.ax_fld[var6][var1][var2] - 1;
				if (var7 > -1) {
					int var8 = ue.ak(var7, this.al_fld, var5);
					if (var3.an_fld[var6][var1][var2] == 0) {
						yu.dj(this.ay_fld * var1, (63 - var2) * this.ay_fld, this.ay_fld, this.ay_fld, var8);
					} else {
						var4.ak(
							var1 * this.ay_fld,
							this.ay_fld * (63 - var2),
							0,
							var8,
							this.ay_fld,
							this.ay_fld,
							var3.an_fld[var6][var1][var2],
							var3.aa_fld[var6][var1][var2],
							-828063812
						);
					}
				}
			}
		} catch (Throwable var10) {
			throw new RuntimeException(var10);
		}
	}

	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "(IILhi;Lhs;)I"
	)
	int dh(int var1, int var2, hi var3, hs var4) {
		return 0 == var3.ae_fld[0][var1][var2] ? this.al_fld : var4.ak(var1, var2);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IILhi;I)V"
	)
	void ab(int var1, int var2, hi var3, int var4) {
		try {
			for (int var5 = 0; var5 < var3.af_fld; var5++) {
				ge[] var6 = var3.ai_fld[var5][var1][var2];
				if (null != var6 && 0 != var6.length) {
					ge[] var7 = var6;

					for (int var8 = 0; var8 < var7.length; var8++) {
						ge var9;
						boolean var10000;
						if (var4 != -1141627905) {
							return;
						}

						label159: {
							label158: {
								var9 = var7[var8];
								int var11 = var9.ag_fld;
								if (var11 >= kn.ak_fld.at_fld) {
									if (var4 != -1141627905) {
										return;
									}

									if (var11 <= kn.av_fld.at_fld) {
										break label158;
									}

									if (var4 != -1141627905) {
										return;
									}
								}

								if (var11 != kn.ae_fld.at_fld) {
									var10000 = false;
									break label159;
								}
							}

							var10000 = true;
						}

						boolean var10 = var10000;
						if (var10) {
							oe var12 = ko.az(var9.ak_fld);
							int var13 = 0 != var12.cj_fld ? -3407872 : -3355444;
							if (var9.ag_fld == kn.ak_fld.at_fld) {
								an(this, var1, var2, var9.az_fld, var13);
							}

							if (kn.az_fld.at_fld == var9.ag_fld) {
								an(this, var1, var2, var9.az_fld, -3355444);
								an(this, var1, var2, 1 + var9.az_fld, var13);
							}

							if (kn.av_fld.at_fld == var9.ag_fld) {
								if (0 == var9.az_fld) {
									yu.ew(this.ay_fld * var1, (63 - var2) * this.ay_fld, 1, var13);
								}

								if (1 == var9.az_fld) {
									if (var4 != -1141627905) {
										return;
									}

									yu.ew(this.ay_fld + var1 * this.ay_fld - 1, (63 - var2) * this.ay_fld, 1, var13);
								}

								if (var9.az_fld == 2) {
									yu.ew(this.ay_fld + this.ay_fld * var1 - 1, this.ay_fld + this.ay_fld * (63 - var2) - 1, 1, var13);
								}

								if (3 == var9.az_fld) {
									yu.ew(this.ay_fld * var1, this.ay_fld + this.ay_fld * (63 - var2) - 1, 1, var13);
								}
							}

							if (var9.ag_fld == kn.ae_fld.at_fld) {
								if (var4 != -1141627905) {
									return;
								}

								int var14 = var9.az_fld % 2;
								if (0 == var14) {
									for (int var15 = 0; var15 < this.ay_fld; var15++) {
										yu.ew(var15 + this.ay_fld * var1, (64 - var2) * this.ay_fld - 1 - var15, 1, var13);
									}
								} else {
									for (int var17 = 0; var17 < this.ay_fld; var17++) {
										yu.ew(this.ay_fld * var1 + var17, var17 + (63 - var2) * this.ay_fld, 1, var13);
									}
								}
							}
						}
					}
				}
			}
		} catch (Throwable var16) {
			throw new RuntimeException(var16);
		}
	}

	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "(IILhi;[Lyc;)V"
	)
	void dm(int var1, int var2, hi var3, yc[] var4) {
		try {
			for (int var5 = 0; var5 < var3.af_fld; var5++) {
				ge[] var6 = var3.ai_fld[var5][var1][var2];
				if (null != var6 && 0 != var6.length) {
					ge[] var7 = var6;

					for (int var8 = 0; var8 < var7.length; var8++) {
						ge var9 = var7[var8];
						if (jk.az(var9.ag_fld) || ef.aw(var9.ag_fld)) {
							oe var10 = ko.az(var9.ak_fld);
							if (var10.dq_fld != -1) {
								int var11 = var9.az_fld != 1 && 3 != var9.az_fld ? var10.co_fld : var10.cb_fld;
								var4[var10.dq_fld].ah(var1 * this.ay_fld, (64 - var11 - var2) * this.ay_fld, -1662562878 * this.ay_fld, this.ay_fld * -1662562878);
							}
						}
					}
				}
			}
		} catch (Throwable var13) {
			throw new RuntimeException(var13);
		}
	}

	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "(IILhi;[Lyc;)V"
	)
	void dt(int var1, int var2, hi var3, yc[] var4) {
		try {
			for (int var5 = 0; var5 < var3.af_fld; var5++) {
				ge[] var6 = var3.ai_fld[var5][var1][var2];
				if (null != var6 && 0 != var6.length) {
					ge[] var7 = var6;

					for (int var8 = 0; var8 < var7.length; var8++) {
						ge var9 = var7[var8];
						if (jk.az(var9.ag_fld) || ef.aw(var9.ag_fld)) {
							oe var10 = ko.az(var9.ak_fld);
							if (var10.dq_fld != -1) {
								int var11 = var9.az_fld != 1 && 3 != var9.az_fld ? var10.co_fld : var10.cb_fld;
								var4[var10.dq_fld].ah(var1 * this.ay_fld, (64 - var11 - var2) * this.ay_fld, -1662562878 * this.ay_fld, this.ay_fld * -1662562878);
							}
						}
					}
				}
			}
		} catch (Throwable var13) {
			throw new RuntimeException(var13);
		}
	}

	@ObfuscatedName("ip")
	@ObfuscatedSignature(
		descriptor = "(Lzw;)I"
	)
	public static int ip(zw var0) {
		return var0.ak_fld;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	void aw(byte var1) {
		try {
			Iterator var2 = this.ax_fld.values().iterator();

			while (var2.hasNext()) {
				hr var3 = (hr)(hr)var2.next();
				if (var3 instanceof gi) {
					gi.md((gi)var3, -7119122);
				}
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "(Lhr;Lpc;IIF)V"
	)
	void di(hr var1, pc var2, int var3, int var4, float var5) {
		gw var6 = var1.az(841763630);
		if (var6 != null) {
			if (var6.av_fld.az(var5)) {
				zf var7 = (zf)(zf)this.ah_fld.get(var6.av_fld);
				var7.at(var6.ak_fld, var3 - var6.az_fld / 2, var4, var6.az_fld, var6.ag_fld, 0xFF000000 | var2.af_fld, 0, 1, 0, var7.ap_fld / 2);
			}
		}
	}

	@ObfuscatedName("pt")
	@ObfuscatedSignature(
		descriptor = "(Lga;Ljava/util/HashSet;II)V"
	)
	public static void pt(ga var0, HashSet var1, int var2, int var3) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			} else {
				Iterator var4 = var0.ax_fld.values().iterator();

				while (var4.hasNext()) {
					hr var5 = (hr)(hr)var4.next();
					if (var5.aq((byte)18)) {
						int var6 = var5.ag(806175368);
						if (var1.contains(var6)) {
							pc var7 = uh.ak(var6);
							var0.ac(var7, var5.as_fld, var5.ar_fld, var2, var3, -706140048);
						}
					}
				}

				var0.ax(var1, var2, var3, (byte)126);
			}
		} catch (Throwable var9) {
			throw new RuntimeException(var9);
		}
	}

	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "(IILjava/util/HashSet;I)V"
	)
	void dl(int var1, int var2, HashSet var3, int var4) {
		try {
			float var5 = var4 / 64.0F;
			float var6 = var5 / 2.0F;
			Iterator var7 = this.ax_fld.entrySet().iterator();

			while (var7.hasNext()) {
				Entry var8 = (Entry)(Entry)var7.next();
				kj var9 = (kj)(kj)var8.getKey();
				int var10 = (int)(var5 * var9.ag_fld + var1 - var6);
				int var11 = (int)(var2 + var4 - var9.az_fld * var5 - var6);
				hr var12 = (hr)(hr)var8.getValue();
				if (null != var12 && var12.aq((byte)91)) {
					var12.as_fld = var10;
					var12.ar_fld = var11;
					pc var13 = uh.ak(var12.ag(872853367));
					if (!var3.contains(var13.aw(1708954540))) {
						ti(this, var12, var10, var11, var5);
					}
				}
			}
		} catch (Throwable var15) {
			throw new RuntimeException(var15);
		}
	}

	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "(IILjava/util/HashSet;I)V"
	)
	void dr(int var1, int var2, HashSet var3, int var4) {
		try {
			float var5 = var4 / 64.0F;
			float var6 = var5 / 2.0F;
			Iterator var7 = this.ax_fld.entrySet().iterator();

			while (var7.hasNext()) {
				Entry var8 = (Entry)(Entry)var7.next();
				kj var9 = (kj)(kj)var8.getKey();
				int var10 = (int)(var5 * (var9.ag_fld * -1021139576) + var1 - var6);
				int var11 = (int)(var2 + var4 - var9.az_fld * var5 - var6);
				hr var12 = (hr)(hr)var8.getValue();
				if (null != var12 && var12.aq((byte)119)) {
					var12.as_fld = 911558488 * var10;
					var12.ar_fld = var11;
					pc var13 = uh.ak(var12.ag(-1677866726));
					if (!var3.contains(var13.aw(1656590941))) {
						ti(this, var12, var10, var11, var5);
					}
				}
			}
		} catch (Throwable var15) {
			throw new RuntimeException(var15);
		}
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(Lga;IIILjava/util/HashSet;)V"
	)
	public static void cn(ga var0, int var1, int var2, int var3, HashSet var4) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			if (null == var4) {
				var4 = new HashSet();
			}

			var0.ap(var1, var2, var4, var3, (byte)58);
			zp(var0, var1, var2, var4, var3, (byte)0);
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "(IILjava/util/HashSet;I)V"
	)
	void da(int var1, int var2, HashSet var3, int var4) {
		try {
			float var5 = var4 / 64.0F;
			float var6 = var5 / 2.0F;
			Iterator var7 = this.ax_fld.entrySet().iterator();

			while (var7.hasNext()) {
				Entry var8 = (Entry)(Entry)var7.next();
				kj var9 = (kj)(kj)var8.getKey();
				int var10 = (int)(var5 * var9.ag_fld + var1 - var6);
				int var11 = (int)(var2 + var4 - var9.az_fld * var5 - var6);
				hr var12 = (hr)(hr)var8.getValue();
				if (null != var12 && var12.aq((byte)104)) {
					var12.as_fld = var10;
					var12.ar_fld = var11;
					pc var13 = uh.ak(var12.ag(2013518915));
					if (!var3.contains(var13.aw(1907047584))) {
						ti(this, var12, var10, var11, var5);
					}
				}
			}
		} catch (Throwable var15) {
			throw new RuntimeException(var15);
		}
	}

	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;II)V"
	)
	void dk(HashSet var1, int var2, int var3) {
		try {
			Iterator var4 = this.au_fld.iterator();

			while (var4.hasNext()) {
				hr var5 = (hr)(hr)var4.next();
				if (var5.aq((byte)32)) {
					pc var6 = uh.ak(var5.ag(-1553772271));
					if (var6 != null && var1.contains(var6.aw(1850426779))) {
						this.ac(var6, var5.as_fld, var5.ar_fld * -582851424, var2, var3, 1328018226);
					}
				}
			}
		} catch (Throwable var8) {
			throw new RuntimeException(var8);
		}
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(III)J"
	)
	static long by(int var0, int var1, int var2) {
		return var2 << 16 | var0 << 8 | var1;
	}

	@ObfuscatedName("rl")
	@ObfuscatedSignature(
		descriptor = "(Lga;IILhi;Lhg;Lgm;)V"
	)
	public static void rl(ga var0, int var1, int var2, hi var3, hg var4, gm var5) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			for (int var6 = 1; var6 < var3.af_fld; var6++) {
				int var7 = var3.ax_fld[var6][var1][var2] - 1;
				if (var7 > -1) {
					int var8 = ue.ak(var7, var0.al_fld, var5);
					if (var3.an_fld[var6][var1][var2] == 0) {
						yu.dj(var0.ay_fld * var1, (-1216832097 - var2) * var0.ay_fld, 1497371820 * var0.ay_fld, var0.ay_fld, var8);
					} else {
						var4.ak(
							var1 * var0.ay_fld,
							var0.ay_fld * (63 - var2),
							0,
							var8,
							var0.ay_fld,
							170571969 * var0.ay_fld,
							var3.an_fld[var6][var1][var2],
							var3.aa_fld[var6][var1][var2],
							-828063812
						);
					}
				}
			}
		} catch (Throwable var10) {
			throw new RuntimeException(var10);
		}
	}

	@ObfuscatedName("kc")
	@ObfuscatedSignature(
		descriptor = "(Lcx;I)Lss;"
	)
	public static ss kc(cx var0, int var1) {
		ss var2 = (ss)(ss)var0.ag_fld.get(var1);
		return null != var2 ? var2 : var0.av_fld;
	}

	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;II)V"
	)
	void ds(HashSet var1, int var2, int var3) {
		try {
			Iterator var4 = this.au_fld.iterator();

			while (var4.hasNext()) {
				hr var5 = (hr)(hr)var4.next();
				if (var5.aq((byte)115)) {
					pc var6 = uh.ak(var5.ag(-1776273640));
					if (var6 != null && var1.contains(var6.aw(2009079329))) {
						this.ac(var6, var5.as_fld * -550275736, var5.ar_fld, var2, var3, 1742246588);
					}
				}
			}
		} catch (Throwable var8) {
			throw new RuntimeException(var8);
		}
	}

	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "(Lpc;IIII)V"
	)
	void db(pc var1, int var2, int var3, int var4, int var5) {
		try {
			yv var6 = var1.ae(false, -1984702827);
			if (null != var6) {
				var6.ab(var2 - var6.aw_fld / 2, var3 - var6.ay_fld / 2);
				if (var4 % var5 < var5 / 2) {
					yu.de(var2, var3, 15, 16776960, -898450265);
					yu.de(var2, var3, 7, -187070593, -1549351507);
				}
			}
		} catch (Throwable var8) {
			throw new RuntimeException(var8);
		}
	}

	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "(IILhi;)V"
	)
	void do_(int var1, int var2, hi var3) {
		try {
			for (int var4 = 0; var4 < var3.af_fld; var4++) {
				ge[] var5 = var3.ai_fld[var4][var1][var2];
				if (null != var5 && 0 != var5.length) {
					ge[] var6 = var5;

					for (int var7 = 0; var7 < var6.length; var7++) {
						ge var8 = var6[var7];
						int var10 = var8.ag_fld * 998261378;
						boolean var9 = var10 >= kn.ak_fld.at_fld && var10 <= kn.av_fld.at_fld || var10 == kn.ae_fld.at_fld;
						if (var9) {
							oe var11 = ko.az(var8.ak_fld * -460330380);
							int var12 = 0 != var11.cj_fld ? 1368014672 : 547511781;
							if (var8.ag_fld == kn.ak_fld.at_fld) {
								an(this, var1, var2, -1196528831 * var8.az_fld, var12);
							}

							if (kn.az_fld.at_fld == var8.ag_fld) {
								an(this, var1, var2, -1506679147 * var8.az_fld, -3355444);
								an(this, var1, var2, 1 + var8.az_fld, var12);
							}

							if (kn.av_fld.at_fld == var8.ag_fld) {
								if (0 == var8.az_fld) {
									yu.ew(this.ay_fld * var1, (1145105253 - var2) * this.ay_fld, 1, var12);
								}

								if (1 == var8.az_fld) {
									yu.ew(this.ay_fld + var1 * this.ay_fld - 1, (63 - var2) * this.ay_fld, 1, var12);
								}

								if (var8.az_fld == 2) {
									yu.ew(this.ay_fld + this.ay_fld * var1 - 1, this.ay_fld + this.ay_fld * (1482741578 - var2) - 1, 1, var12);
								}

								if (3 == var8.az_fld) {
									yu.ew(this.ay_fld * var1, this.ay_fld + this.ay_fld * (63 - var2) - 1, 1, var12);
								}
							}

							if (var8.ag_fld == kn.ae_fld.at_fld) {
								int var13 = var8.az_fld % 2;
								if (0 == var13) {
									for (int var17 = 0; var17 < this.ay_fld; var17++) {
										yu.ew(var17 + this.ay_fld * var1, (2089031879 - var2) * this.ay_fld - 1 - var17, 1, var12);
									}
								} else {
									for (int var14 = 0; var14 < this.ay_fld; var14++) {
										yu.ew(this.ay_fld * var1 + var14, var14 + (63 - var2) * this.ay_fld, 1, var12);
									}
								}
							}
						}
					}
				}
			}
		} catch (Throwable var16) {
			throw new RuntimeException(var16);
		}
	}

	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "(Lpc;II)V"
	)
	void dy(pc var1, int var2, int var3) {
		try {
			yv var4 = var1.ae(false, -1956488871);
			if (null != var4) {
				int var5 = sw(this, var4, var1.ao_fld, (byte)105);
				int var6 = this.be(var4, var1.ab_fld, 2146777205);
				var4.ab(var5 + var2, var6 + var3);
			}
		} catch (Throwable var8) {
			throw new RuntimeException(var8);
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;Ljava/util/List;I)V"
	)
	void av(ArrayList var1, List var2, int var3) {
		try {
			this.ax_fld.clear();
			Iterator var4 = var1.iterator();

			while (var4.hasNext()) {
				gy var5 = (gy)(gy)var4.next();
				if (var5.bf() == this.af_fld && var5.by() == this.aw_fld) {
					this.ar_fld.add(var5);
				}
			}

			this.ay(var2, (byte)-23);
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "(Lhr;Lpc;IIF)V"
	)
	void dn(hr var1, pc var2, int var3, int var4, float var5) {
		gw var6 = var1.az(1075123224);
		if (var6 != null) {
			if (var6.av_fld.az(var5)) {
				zf var7 = (zf)(zf)this.ah_fld.get(var6.av_fld);
				var7.at(var6.ak_fld, var3 - var6.az_fld / 2, var4, var6.az_fld, var6.ag_fld * 991086030, 1013326408 | var2.af_fld, 0, 1, 0, var7.ap_fld / 2);
			}
		}
	}

	@ObfuscatedName("fw")
	@ObfuscatedSignature(
		descriptor = "(Lga;IIIILhi;)V"
	)
	public static void fw(ga var0, int var1, int var2, int var3, int var4, hi var5) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			for (int var6 = var1; var6 < var1 + var3; var6++) {
				label91:
				for (int var7 = var2; var7 < var2 + var4; var7++) {
					for (int var8 = 0; var8 < var5.af_fld; var8++) {
						ge[] var9 = var5.ai_fld[var8][var6][var7];
						if (null != var9 && var9.length != 0) {
							ge[] var10 = var9;

							for (int var11 = 0; var11 < var10.length; var11++) {
								oe var13;
								boolean var14;
								label82: {
									ge var12 = var10[var11];
									var13 = ko.az(var12.ak_fld);
									if (var13.dy_fld != null) {
										int[] var15 = var13.dy_fld;

										for (int var16 = 0; var16 < var15.length; var16++) {
											int var17 = var15[var16];
											oe var18 = ko.az(var17);
											if (var18.dm_fld != -1) {
												var14 = true;
												break label82;
											}
										}
									} else if (var13.dm_fld != -1) {
										var14 = true;
										break label82;
									}

									var14 = false;
								}

								if (var14) {
									var0.ah(var13, var8, var6, var7, var5, -1591040896);
									continue label91;
								}
							}
						}
					}
				}
			}
		} catch (Throwable var20) {
			throw new RuntimeException(var20);
		}
	}

	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "(Lhr;Lpc;IIF)V"
	)
	void df(hr var1, pc var2, int var3, int var4, float var5) {
		gw var6 = var1.az(1696427755);
		if (var6 != null) {
			if (var6.av_fld.az(var5)) {
				zf var7 = (zf)(zf)this.ah_fld.get(var6.av_fld);
				var7.at(var6.ak_fld, var3 - var6.az_fld / 2, var4, var6.az_fld * -118810168, var6.ag_fld * -2010323292, 0xFF000000 | var2.af_fld, 0, 1, 0, var7.ap_fld / 2);
			}
		}
	}

	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "(IILjava/util/HashSet;I)V"
	)
	void de(int var1, int var2, HashSet var3, int var4) {
		try {
			float var5 = var4 / 64.0F;
			Iterator var6 = this.au_fld.iterator();

			while (var6.hasNext()) {
				hr var7 = (hr)(hr)var6.next();
				if (var7.aq((byte)81)) {
					int var8 = var7.aw_fld.ag_fld * -621797759 % 64;
					int var9 = var7.aw_fld.az_fld * 1479124089 % 64;
					var7.as_fld = -1969704677 * (int)(var5 * var8 + var1);
					var7.ar_fld = (int)(var5 * (63 - var9) + var2);
					if (!var3.contains(var7.ag(1570031227))) {
						ti(this, var7, var7.as_fld, var7.ar_fld, var5);
					}
				}
			}
		} catch (Throwable var11) {
			throw new RuntimeException(var11);
		}
	}

	@ObfuscatedName("re")
	@ObfuscatedSignature(
		descriptor = "(Lga;Lhg;[Lyc;Lhs;Lgm;)V"
	)
	public static void re(ga var0, hg var1, yc[] var2, hs var3, gm var4) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			for (int var5 = 0; var5 < -1544444519; var5++) {
				for (int var6 = 0; var6 < -583930190; var6++) {
					var0.aq(var5, var6, var0.as_fld, var1, var3, var4, (byte)-83);
					aj(var0, var5, var6, var0.as_fld, var1, var4);
				}
			}

			for (int var9 = 0; var9 < 64; var9++) {
				for (int var10 = 0; var10 < -1517336384; var10++) {
					var0.ai(var9, var10, var0.as_fld, var1, var2, -1722287877);
				}
			}
		} catch (Throwable var8) {
			throw new RuntimeException(var8);
		}
	}

	@ObfuscatedName("es")
	@ObfuscatedSignature(
		descriptor = "(Lyv;Lpv;)I"
	)
	int es(yv var1, pv var2) {
		switch (var2.av_fld) {
			case 0:
				return -var1.aw_fld / 2;
			case 2:
				return 0;
			default:
				return -var1.aw_fld;
		}
	}

	@ObfuscatedName("zg")
	@ObfuscatedSignature(
		descriptor = "(Lga;IILhi;Lhg;Lgm;)V"
	)
	public static void zg(ga var0, int var1, int var2, hi var3, hg var4, gm var5) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			for (int var6 = 1; var6 < var3.af_fld; var6++) {
				int var7 = var3.ax_fld[var6][var1][var2] - 1;
				if (var7 > -1) {
					int var8 = ue.ak(var7, var0.al_fld, var5);
					if (var3.an_fld[var6][var1][var2] == 0) {
						yu.dj(var0.ay_fld * var1, (-1707311069 - var2) * var0.ay_fld, var0.ay_fld, var0.ay_fld, var8);
					} else {
						var4.ak(
							var1 * var0.ay_fld,
							var0.ay_fld * (63 - var2),
							0,
							var8,
							var0.ay_fld,
							1693125524 * var0.ay_fld,
							var3.an_fld[var6][var1][var2],
							var3.aa_fld[var6][var1][var2],
							-828063812
						);
					}
				}
			}
		} catch (Throwable var10) {
			throw new RuntimeException(var10);
		}
	}

	@ObfuscatedName("ep")
	@ObfuscatedSignature(
		descriptor = "(Lyv;Lpv;)I"
	)
	int ep(yv var1, pv var2) {
		switch (-940129051 * var2.av_fld) {
			case 0:
				return -var1.aw_fld / 2;
			case 2:
				return 0;
			default:
				return -var1.aw_fld;
		}
	}

	@ObfuscatedName("eb")
	@ObfuscatedSignature(
		descriptor = "(Lyv;Lpv;)I"
	)
	int eb(yv var1, pv var2) {
		switch (686193773 * var2.av_fld) {
			case 0:
				return -var1.aw_fld / 2;
			case 2:
				return 0;
			default:
				return -var1.aw_fld;
		}
	}

	@ObfuscatedName("ed")
	@ObfuscatedSignature(
		descriptor = "(Lyv;Lop;)I"
	)
	int ed(yv var1, op var2) {
		switch (var2.av_fld) {
			case 1:
				return -var1.ay_fld / 2;
			case 2:
				return 0;
			default:
				return -var1.ay_fld;
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IILhi;Lhg;[Lyc;I)V"
	)
	void ai(int var1, int var2, hi var3, hg var4, yc[] var5, int var6) {
		try {
			this.ab(var1, var2, var3, -1141627905);
			this.ao(var1, var2, var3, var5, 1299515695);
		} catch (Throwable var7) {
			throw new RuntimeException(var7);
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lga;IILhi;Lhg;Lgm;)V"
	)
	public static void aj(ga var0, int var1, int var2, hi var3, hg var4, gm var5) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			} else {
				for (int var7 = 1; var7 < var3.af_fld; var7++) {
					int var8 = var3.ax_fld[var7][var1][var2] - 1;
					if (var8 > -1) {
						int var9 = ue.ak(var8, var0.al_fld, var5);
						if (var3.an_fld[var7][var1][var2] == 0) {
							yu.dj(var0.ay_fld * var1, (63 - var2) * var0.ay_fld, var0.ay_fld, var0.ay_fld, var9);
						} else {
							var4.ak(
								var1 * var0.ay_fld,
								var0.ay_fld * (63 - var2),
								0,
								var9,
								var0.ay_fld,
								var0.ay_fld,
								var3.an_fld[var7][var1][var2],
								var3.aa_fld[var7][var1][var2],
								-828063812
							);
						}
					}
				}
			}
		} catch (Throwable var10) {
			throw new RuntimeException(var10);
		}
	}

	@ObfuscatedName("ex")
	@ObfuscatedSignature(
		descriptor = "(I)Lgw;"
	)
	gw ex(int var1) {
		pc var2 = uh.ak(var1);
		return this.bh(var2, -2140792005);
	}

	@ObfuscatedName("eo")
	@ObfuscatedSignature(
		descriptor = "(I)Lgw;"
	)
	gw eo(int var1) {
		pc var2 = uh.ak(var1);
		return this.bh(var2, -2140792005);
	}

	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		descriptor = "(Lpc;)Lgw;"
	)
	gw ec(pc var1) {
		if (null != var1.as_fld && this.ah_fld != null && this.ah_fld.get(hb.ak_fld) != null) {
			hb var2 = hb.ag(var1.aw_fld);
			if (var2 == null) {
				return null;
			} else {
				zf var3 = (zf)(zf)this.ah_fld.get(var2);
				if (null == var3) {
					return null;
				} else {
					int var4 = var3.aq(var1.as_fld, -1996314836);
					String[] var5 = new String[var4];
					var3.cr(var1.as_fld, null, var5);
					int var6 = var3.ap_fld * var5.length / 2;
					int var7 = 0;
					String[] var8 = var5;

					for (int var9 = 0; var9 < var8.length; var9++) {
						String var10 = var8[var9];
						int var11 = var3.an(var10);
						if (var11 > var7) {
							var7 = var11;
						}
					}

					return new gw(var1.as_fld, var7, var6, var2);
				}
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(II)Lgw;"
	)
	gw bs(int var1, int var2) {
		pc var3 = uh.ak(var1);
		return this.bh(var3, -2140792005);
	}

	@ObfuscatedName("ei")
	@ObfuscatedSignature(
		descriptor = "()Ljava/util/List;"
	)
	List ei() {
		LinkedList var1 = new LinkedList();
		var1.addAll(this.au_fld);
		var1.addAll(this.ax_fld.values());
		return var1;
	}

	@ObfuscatedName("ee")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	void ee(int var1, int var2, int var3, int var4) {
		var3 %= 4;
		if (var3 == 0) {
			yu.eo(var1 * this.ay_fld, this.ay_fld * (-1478728330 - var2), this.ay_fld, var4);
		}

		if (1 == var3) {
			yu.ew(this.ay_fld * var1, (63 - var2) * this.ay_fld, -2046308541 * this.ay_fld, var4);
		}

		if (2 == var3) {
			yu.eo(this.ay_fld + var1 * this.ay_fld - 1, (63 - var2) * this.ay_fld, 632489797 * this.ay_fld, var4);
		}

		if (var3 == 3) {
			yu.ew(this.ay_fld * var1, this.ay_fld * (-2036407633 - var2) + this.ay_fld - 1, this.ay_fld, var4);
		}
	}

	@ObfuscatedName("ob")
	@ObfuscatedSignature(
		descriptor = "(Lga;IILjava/util/HashSet;I)V"
	)
	public static void ob(ga var0, int var1, int var2, HashSet var3, int var4) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			} else {
				float var5 = var4 / 64.0F;
				Iterator var6 = var0.au_fld.iterator();

				while (var6.hasNext()) {
					hr var7 = (hr)(hr)var6.next();
					if (var7.aq((byte)62)) {
						int var8 = var7.aw_fld.ag_fld * -621797759 % 64;
						int var9 = var7.aw_fld.az_fld * 1479124089 % 64;
						var7.as_fld = -1969704677 * (int)(var5 * var8 + var1);
						var7.ar_fld = (int)(var5 * (63 - var9) + var2);
						if (!var3.contains(var7.ag(-2018833526))) {
							ti(var0, var7, var7.as_fld, var7.ar_fld, var5);
						}
					}
				}
			}
		} catch (Throwable var11) {
			throw new RuntimeException(var11);
		}
	}

	@ObfuscatedName("ek")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	void ek(int var1, int var2, int var3, int var4) {
		var3 %= 4;
		if (var3 == 0) {
			yu.eo(var1 * this.ay_fld, this.ay_fld * (63 - var2), this.ay_fld, var4);
		}

		if (1 == var3) {
			yu.ew(this.ay_fld * var1, (63 - var2) * this.ay_fld, this.ay_fld, var4);
		}

		if (2 == var3) {
			yu.eo(this.ay_fld + var1 * this.ay_fld - 1, (63 - var2) * this.ay_fld, this.ay_fld, var4);
		}

		if (var3 == 3) {
			yu.ew(this.ay_fld * var1, this.ay_fld * (63 - var2) + this.ay_fld - 1, this.ay_fld, var4);
		}
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(ILba;Z)I"
	)
	static int ce(int var0, ba var1, boolean var2) throws EOFException {
		try {
			if (8000 == var0) {
				ef.aq_fld -= 2;
				sl var38 = nl.ck(bp.ai_fld[ef.aq_fld], null);
				sl var63 = (sl)bp.ai_fld[1 + ef.aq_fld];
				fw.au(var38, var63, (byte)-12);
				return 1;
			} else if (var0 == 8001) {
				gz.ax_fld -= 2;
				int var37 = bp.au_fld[gz.ax_fld];
				int var62 = bp.au_fld[gz.ax_fld + 1];
				sl var80 = nl.ck(bp.ai_fld[(ef.aq_fld -= -211521517) * -836183525], null);
				zk.ax(var80, var37, var62);
				return 1;
			} else if (8002 == var0) {
				sl var36 = (sl)bp.ai_fld[(ef.aq_fld -= -211521517) * -836183525];
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var36 == null ? 1 : 0;
				return 1;
			} else if (8003 == var0) {
				sl var35 = (sl)bp.ai_fld[(ef.aq_fld -= -211521517) * -836183525];
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var35 != null ? var35.av() : 0;
				return 1;
			} else if (var0 == 8004) {
				ef.aq_fld -= 2;
				sl var34 = (sl)bp.ai_fld[ef.aq_fld];
				sl var61 = (sl)bp.ai_fld[1 + ef.aq_fld];
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = gy.ak(var34, var61);
				return 1;
			} else if (8005 == var0) {
				gz.ax_fld -= 3;
				int var33 = bp.au_fld[gz.ax_fld];
				int var60 = bp.au_fld[gz.ax_fld + 1];
				int var79 = bp.au_fld[gz.ax_fld + 2];
				Object var86 = he.cg(var79);
				sl var90 = (sl)bp.ai_fld[(ef.aq_fld -= -211521517) * -836183525];
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = null != var90 ? ky.ag(var90, var86, var33, var60) : -1;
				return 1;
			} else if (8006 == var0) {
				gz.ax_fld -= 3;
				int var32 = bp.au_fld[gz.ax_fld];
				int var59 = bp.au_fld[gz.ax_fld + 1];
				int var78 = bp.au_fld[gz.ax_fld + 2];
				Object var85 = he.cg(var78);
				sl var89 = (sl)bp.ai_fld[(ef.aq_fld -= -211521517) * -836183525];
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var89 != null ? ox.az(var89, var85, var32, var59) : -1;
				return 1;
			} else if (8007 == var0) {
				gz.ax_fld -= 3;
				int var31 = bp.au_fld[gz.ax_fld];
				int var58 = bp.au_fld[1 + gz.ax_fld];
				int var77 = bp.au_fld[gz.ax_fld + 2];
				Object var84 = he.cg(var77);
				sl var88 = (sl)bp.ai_fld[(ef.aq_fld -= -211521517) * -836183525];
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = null != var88 ? qv.av(var88, var84, var31, var58) : 0;
				return 1;
			} else if (8008 == var0) {
				sl var30 = nl.ck(bp.ai_fld[(ef.aq_fld -= -211521517) * -836183525], null);
				int var57 = zs.ae(var30);
				if (var30.ag_fld == yq.ak_fld) {
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var57 >= 0 ? var30.ak()[var57] : -1;
				} else {
					if (yq.az_fld != var30.ag_fld) {
						throw new IllegalStateException();
					}

					Object var76 = var57 >= 0 ? var30.az()[var57] : null;
					bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = null != var76 ? var76 : "";
				}

				return 1;
			} else if (var0 == 8009) {
				sl var29 = nl.ck(bp.ai_fld[(ef.aq_fld -= -211521517) * -836183525], null);
				int var56 = rz.ah(var29);
				if (var29.ag_fld == yq.ak_fld) {
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var56 >= 0 ? var29.ak()[var56] : -1;
				} else {
					if (var29.ag_fld != yq.az_fld) {
						throw new IllegalStateException();
					}

					String var75 = (String)(var56 >= 0 ? var29.az()[var56] : null);
					bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = null != var75 ? var75 : "";
				}

				return 1;
			} else if (8010 == var0) {
				gz.ax_fld -= 3;
				int var28 = bp.au_fld[gz.ax_fld];
				int var55 = bp.au_fld[1 + gz.ax_fld];
				int var74 = bp.au_fld[gz.ax_fld + 2];
				Object var83 = he.cg(var74);
				sl var87 = nl.ck(bp.ai_fld[(ef.aq_fld -= -211521517) * -836183525], null);
				ct.aw(var87, var83, var28, var55);
				return 1;
			} else if (8011 == var0) {
				gz.ax_fld -= 3;
				int var27 = bp.au_fld[gz.ax_fld];
				int var54 = bp.au_fld[gz.ax_fld + 1];
				int var73 = bp.au_fld[gz.ax_fld + 2];
				sl var82 = nl.ck(bp.ai_fld[(ef.aq_fld -= -211521517) * -836183525], null);
				vu.ay(var82, var27, 1, var54, var73, (byte)38);
				return 1;
			} else if (8012 == var0) {
				sl var26 = nl.ck(bp.ai_fld[(ef.aq_fld -= -211521517) * -836183525], null);
				bs.as(var26);
				return 1;
			} else if (8013 == var0) {
				int var25 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				sl var53 = nl.ck(bp.ai_fld[(ef.aq_fld -= -211521517) * -836183525], null);
				av.ar(var53, var25, 948723319);
				return 1;
			} else if (var0 == 8014) {
				gz.ax_fld -= 2;
				int var24 = bp.au_fld[gz.ax_fld];
				int var52 = bp.au_fld[1 + gz.ax_fld];
				sl var72 = nl.ck(bp.ai_fld[(ef.aq_fld -= -211521517) * -836183525], null);
				ea.af(var72, var24, var52, -2017399785);
				return 1;
			} else if (8015 == var0) {
				gz.ax_fld -= 3;
				int var23 = bp.au_fld[gz.ax_fld];
				int var51 = bp.au_fld[1 + gz.ax_fld];
				int var71 = bp.au_fld[2 + gz.ax_fld];
				ef.aq_fld -= 2;
				sl var81 = nl.ck(bp.ai_fld[ef.aq_fld], null);
				sl var8 = nl.ck(bp.ai_fld[ef.aq_fld + 1], null);
				hf.al(var81, var8, var23, var51, var71, -887970580);
				return 1;
			} else if (var0 == 8016) {
				sl var22 = nl.ck(bp.ai_fld[(ef.aq_fld -= -211521517) * -836183525], null);
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = (int)ia.an(var22);
				return 1;
			} else if (8017 == var0) {
				sl var21 = nl.ck(bp.ai_fld[(ef.aq_fld -= -211521517) * -836183525], null);
				int var50 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = fz.aa(var21, var50);
				return 1;
			} else if (8018 == var0) {
				ef.aq_fld -= 2;
				String var20 = (String)bp.ai_fld[ef.aq_fld];
				String var49 = (String)bp.ai_fld[1 + ef.aq_fld];
				bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = jr.ai(var20, var49);
				return 1;
			} else if (8019 == var0) {
				ef.aq_fld -= 2;
				sl var19 = nl.ck(bp.ai_fld[ef.aq_fld], null);
				String var48 = (String)bp.ai_fld[ef.aq_fld + 1];
				bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = ul.aq(var19, var48);
				return 1;
			} else if (8020 == var0) {
				gz.ax_fld -= 2;
				char var18 = (char)bp.au_fld[gz.ax_fld];
				int var47 = bp.au_fld[gz.ax_fld + 1];
				os var70 = gx.ak(var47);
				if (!var70.ar(var18, -1975842656)) {
					throw new RuntimeException();
				} else {
					bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = os.se(var70, 943006773);
					return 1;
				}
			} else if (8021 == var0) {
				gz.ax_fld -= 2;
				int var17 = bp.au_fld[gz.ax_fld];
				int var46 = bp.au_fld[1 + gz.ax_fld];
				os var69 = gx.ak(var46);
				if (!os.ks(var69, (char)var17, (byte)76)) {
					throw new RuntimeException();
				} else {
					bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = os.cg(var69, 1178899929);
					return 1;
				}
			} else if (8022 == var0) {
				gz.ax_fld -= 3;
				int var16 = bp.au_fld[gz.ax_fld];
				int var45 = bp.au_fld[gz.ax_fld + 1];
				int var68 = bp.au_fld[gz.ax_fld + 2];
				if (var68 < var45) {
					var68 = var45;
				}

				if (var45 >= 0 && var45 <= 5000 && var68 >= 0 && var68 <= 5000) {
					if (115 == var16) {
						bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = new sl(yq.az_fld, "", var45, var68);
					} else if (var16 != 105 && var16 != 49) {
						bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = new sl(yq.ak_fld, -1, var45, var68);
					} else {
						bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = new sl(yq.ak_fld, 0, var45, var68);
					}

					return 1;
				} else {
					throw new RuntimeException();
				}
			} else if (var0 == 8023) {
				int var15 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				sl var44 = nl.ck(bp.ai_fld[(ef.aq_fld -= -211521517) * -836183525], null);
				if (var15 >= 0 && var15 <= 5000) {
					var44.aw(var15, 1783985890);
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else if (var0 == 8024) {
				int var14 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				Object var43 = he.cg(var14);
				sl var67 = nl.ck(bp.ai_fld[(ef.aq_fld -= -211521517) * -836183525], null);
				co.am(var67, var67.av(), var43, -1814062314);
				return 1;
			} else if (8025 == var0) {
				gz.ax_fld -= 2;
				int var13 = bp.au_fld[gz.ax_fld];
				int var42 = bp.au_fld[gz.ax_fld + 1];
				Object var66 = he.cg(var42);
				sl var7 = nl.ck(bp.ai_fld[(ef.aq_fld -= -211521517) * -836183525], null);
				co.am(var7, var13, var66, -1959078330);
				return 1;
			} else if (8026 == var0) {
				int var12 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				sl var41 = nl.ck(bp.ai_fld[(ef.aq_fld -= -211521517) * -836183525], null);
				Object var65 = co.ad(var41, var12);
				lm.cw(var41.ag_fld, var65);
				return 1;
			} else if (8027 == var0) {
				ef.aq_fld -= 2;
				sl var11 = nl.ck(bp.ai_fld[ef.aq_fld], null);
				sl var40 = nl.ck(bp.ai_fld[1 + ef.aq_fld], null);
				kt.ao(var11, var40, var11.av(), -792604955);
				return 1;
			} else if (8028 == var0) {
				int var10 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				ef.aq_fld -= 2;
				sl var39 = nl.ck(bp.ai_fld[ef.aq_fld], null);
				sl var64 = nl.ck(bp.ai_fld[1 + ef.aq_fld], null);
				kt.ao(var39, var64, var10, -514400830);
				return 1;
			} else if (8029 == var0) {
				gz.ax_fld -= 2;
				int var4 = bp.au_fld[gz.ax_fld];
				int var5 = bp.au_fld[gz.ax_fld + 1];
				sl var6 = nl.ck(bp.ai_fld[(ef.aq_fld -= -211521517) * -836183525], null);
				sx.ab(var6, var4, var5);
				return 1;
			} else {
				return 2;
			}
		} catch (Throwable var9) {
			throw new RuntimeException(var9);
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;IIB)V"
	)
	void at(HashSet var1, int var2, int var3, byte var4) {
		try {
			Iterator var5 = this.ax_fld.values().iterator();

			while (var5.hasNext()) {
				hr var6 = (hr)(hr)var5.next();
				if (var6.aq((byte)120)) {
					int var7 = var6.ag(-1798904925);
					if (var1.contains(var7)) {
						if (var4 <= 1) {
							return;
						}

						pc var8 = uh.ak(var7);
						this.ac(var8, var6.as_fld, var6.ar_fld, var2, var3, -2146458702);
					}
				}
			}

			this.ax(var1, var2, var3, (byte)90);
		} catch (Throwable var9) {
			throw new RuntimeException(var9);
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lhr;IIFI)V"
	)
	void aj(hr var1, int var2, int var3, float var4, int var5) {
		try {
			pc var6 = uh.ak(var1.ag(-613111085));
			this.bm(var6, var2, var3, 842150400);
			this.bd(var1, var6, var2, var3, var4, (byte)58);
		} catch (Throwable var7) {
			throw new RuntimeException(var7);
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IILhi;Lhg;Lgm;I)V"
	)
	void am(int var1, int var2, hi var3, hg var4, gm var5, int var6) {
		try {
			for (int var7 = 1; var7 < var3.af_fld; var7++) {
				int var8 = var3.ax_fld[var7][var1][var2] - 1;
				if (var8 > -1) {
					int var9 = ue.ak(var8, 2121588379 * this.af_fld, var5);
					if (var3.aa_fld[var7][var1][var2] == 0) {
						yu.gn(this.ay_fld * var1, (63 - var2) * this.ay_fld, this.ay_fld, -831281439 * this.al_fld, var9);
					} else {
						var4.ak(
							var1 * this.af_fld,
							this.aw_fld * (63 - var2),
							0,
							var9,
							-831281439 * this.al_fld,
							this.ay_fld,
							var3.an_fld[var7][var1][var2],
							var3.aa_fld[var7][var1][var2],
							-828063812
						);
					}
				}
			}
		} catch (Throwable var10) {
			throw new RuntimeException(var10);
		}
	}

	@ObfuscatedName("or")
	@ObfuscatedSignature(
		descriptor = "(Lga;IIIII)Ljava/util/List;"
	)
	public static List or(ga var0, int var1, int var2, int var3, int var4, int var5) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			LinkedList var6 = new LinkedList();
			if (var4 >= var1 && var5 >= var2) {
				if (var4 < var3 + var1 && var5 < var2 + var3) {
					Iterator var7 = var0.ax_fld.values().iterator();

					while (var7.hasNext()) {
						hr var8 = (hr)(hr)var7.next();
						if (var8.aq((byte)71) && var8.ai(var4, var5, (byte)-62)) {
							var6.add(var8);
						}
					}

					var7 = var0.au_fld.iterator();

					while (var7.hasNext()) {
						hr var10 = (hr)(hr)var7.next();
						if (var10.aq((byte)46) && var10.ai(var4, var5, (byte)-81)) {
							var6.add(var10);
						}
					}

					return var6;
				} else {
					return var6;
				}
			} else {
				return var6;
			}
		}
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(IILjava/util/HashSet;IB)V"
	)
	void bz(int var1, int var2, HashSet var3, int var4, byte var5) {
		try {
			float var6 = var4 / 64.0F;
			Iterator var7 = this.au_fld.iterator();

			while (var7.hasNext()) {
				if (var5 != 0) {
					return;
				}

				hr var8 = (hr)(hr)var7.next();
				if (var8.aq((byte)19)) {
					int var9 = var8.aw_fld.ak_fld * -621797759 % 64;
					int var10 = var8.aw_fld.az_fld * 1479124089 % 64;
					var8.as_fld = -1969704677 * (int)(var6 * var9 + var1);
					var8.as_fld = (int)(var6 * (63 - var10) + var2) * -1295971127;
					if (var3.contains(var8.ag(1314412832))) {
						if (var5 != 0) {
							return;
						}
					} else {
						ti(this, var8, var8.as_fld, 90492281 * var8.as_fld, var6);
					}
				}
			}
		} catch (Throwable var11) {
			throw new RuntimeException(var11);
		}
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(Lyv;Lpv;B)I"
	)
	int br(yv var1, pv var2, byte var3) {
		switch (var2.av_fld) {
			case 0:
				return -var1.ay_fld / 2;
			case 2:
				return 0;
			default:
				return -var1.as_fld;
		}
	}

	@ObfuscatedName("rc")
	@ObfuscatedSignature(
		descriptor = "(Lga;Loe;IIILhi;)V"
	)
	public static void rc(ga var0, oe var1, int var2, int var3, int var4, hi var5) throws EOFException {
		try {
			kj var6 = new kj(var2, var0.af_fld + var3, var4 + var0.aw_fld);
			Object var7 = null;
			if (var0.as_fld != null) {
				var7 = new kj(var2 + -155955479 * var0.as_fld.ar_fld, var3 + -1935125952 * var0.as_fld.ah_fld, var4 + var0.as_fld.aw_fld * 37981504);
			} else {
				gy var8 = (gy)var5;
				var7 = new kj(var2 + var8.ar_fld, var3 + var8.ah_fld + var8.ae() * 8, var4 + var8.aw_fld + gy.wk(var8, (byte)14) * 8);
			}

			Object var13;
			if (null != var1.dy_fld) {
				var13 = new gi((kj)var7, var6, var1.cn_fld, var0);
			} else {
				pc var9 = uh.ak(var1.dm_fld);
				var13 = new he((kj)var7, var6, var9.ah_fld, var0.bh(var9, -2140792005));
			}

			pc var14 = uh.ak(((hr)var13).ag(158630261));
			if (var14.al_fld) {
				var0.ax_fld.put(new kj(0, var3, var4), var13);
			}
		} catch (Throwable var11) {
			throw new RuntimeException(var11);
		}
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/List;"
	)
	List bj(byte var1) {
		LinkedList var2 = new LinkedList();
		var2.addAll(this.au_fld);
		var2.addAll(this.ax_fld.values());
		return var2;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V"
	)
	void bf(int var1, int var2, int var3, int var4, int var5) {
		var3 %= 4;
		if (var3 == 0) {
			yu.gt(var1 * this.al_fld, this.af_fld * (63 - var2), this.aw_fld * -831281439, var4);
		}

		if (1 == var3) {
			yu.fo(this.af_fld * var1, (63 - var2) * this.aw_fld, -831281439 * this.al_fld, var4);
		}

		if (2 == var3) {
			yu.gu(this.aw_fld + var1 * this.aw_fld - 1, (63 - var2) * this.af_fld, -831281439 * this.af_fld, var4);
		}

		if (var3 == 3) {
			yu.gm(this.af_fld * var1, this.ay_fld * (63 - var2) + this.aw_fld - 1, this.aw_fld * -831281439, var4);
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lgk;Ljava/util/List;S)V"
	)
	void az(gk var1, List var2, short var3) {
		try {
			this.ax_fld.clear();
			this.as_fld = var1;
			this.ay(var2, (byte)-60);
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIIILhi;I)V"
	)
	void ae(int var1, int var2, int var3, int var4, hi var5, int var6) {
		try {
			for (int var7 = var1; var7 < var1 + var3; var7++) {
				int var8 = var2;

				while (var8 < var2 + var4) {
					int var9 = 0;

					while (true) {
						label132: {
							if (var9 < var5.al_fld) {
								ge[] var10 = var5.ai_fld[var9][var7][var8];
								if (null == var10 || var10.length == 0) {
									break label132;
								}

								ge[] var11 = var10;
								int var12 = 0;

								while (true) {
									oe var14;
									boolean var15;
									if (var12 >= var11.length) {
										break label132;
									}

									if (var6 != 1417671953) {
										return;
									}

									label109: {
										ge var13 = var11[var12];
										var14 = ko.az(-1805943069 * var13.az_fld);
										if (var14.dy_fld != null) {
											int[] var16 = var14.dy_fld;

											for (int var17 = 0; var17 < var16.length; var17++) {
												if (var6 != 1417671953) {
													return;
												}

												int var18 = var16[var17];
												oe var19 = ko.az(var18);
												if (var19.cu_fld != -1) {
													var15 = true;
													break label109;
												}
											}
										} else if (var14.dq_fld != -1) {
											var15 = true;
											break label109;
										}

										var15 = false;
									}

									if (var15) {
										this.ah(var14, var9, var7, var8, var5, -1591040896);
										break;
									}

									var12++;
								}
							}

							var8++;
							break;
						}

						var9++;
					}
				}
			}
		} catch (Throwable var20) {
			throw new RuntimeException(var20);
		}
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;II)V"
	)
	void cm(HashSet var1, int var2, int var3) {
		try {
			Iterator var4 = this.au_fld.iterator();

			while (var4.hasNext()) {
				hr var5 = (hr)(hr)var4.next();
				if (var5.aq((byte)90)) {
					pc var6 = uh.ak(var5.ag(1510069897));
					if (var6 != null && var1.contains(var6.aw(1652090226))) {
						this.ac(var6, var5.as_fld * 416995729, var5.as_fld * 1662649233, var2, var3, -1400962089);
					}
				}
			}
		} catch (Throwable var8) {
			throw new RuntimeException(var8);
		}
	}

	@ObfuscatedName("en")
	@ObfuscatedSignature(
		descriptor = "(IIIII)Ljava/util/List;"
	)
	List en(int var1, int var2, int var3, int var4, int var5) {
		LinkedList var6 = new LinkedList();
		if (var4 >= var1 && var5 >= var2) {
			if (var4 < var3 + var1 && var5 < var2 + var3) {
				Iterator var7 = this.ax_fld.values().iterator();

				while (var7.hasNext()) {
					hr var8 = (hr)(hr)var7.next();
					if (var8.aq((byte)71) && var8.ai(var4, var5, (byte)-62)) {
						var6.add(var8);
					}
				}

				var7 = this.au_fld.iterator();

				while (var7.hasNext()) {
					hr var10 = (hr)(hr)var7.next();
					if (var10.aq((byte)46) && var10.ai(var4, var5, (byte)-81)) {
						var6.add(var10);
					}
				}

				return var6;
			} else {
				return var6;
			}
		} else {
			return var6;
		}
	}
}
