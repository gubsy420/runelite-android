import java.io.EOFException;
import java.util.HashMap;
import java.util.Map;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("lw")
public class lw {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	iw af_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	ub ag_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	ub az_fld;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lry;"
	)
	ry ax_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	ub ae_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "[Z"
	)
	boolean[] ak_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	ub ah_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/Map;"
	)
	Map ay_fld = new HashMap();
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	iw ar_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "[[Llu;"
	)
	public lu[][] aw_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	iw as_fld = new iw(200);
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	iw al_fld;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lry;"
	)
	ry au_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	ub av_fld;

	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "(Llw;IB)V"
	)
	public static void dn(lw var0, int var1, byte var2) {
		if (var0 == null) {
			var0.getClass();
		}

		if (-1 != var1) {
			if (var0.ak_fld[var1]) {
				var0.ag_fld.ca(var1, 1703208281);
				if (var0.aw_fld[var1] != null) {
					for (int var3 = 0; var3 < var0.aw_fld[var1].length; var3++) {
						if (var0.aw_fld[var1][var3] != null) {
							if (var2 == 6) {
								return;
							}

							var0.aw_fld[var1][var3] = null;
						}
					}

					var0.aw_fld[var1] = null;
					var0.ak_fld[var1] = false;
				}
			}
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)Llu;"
	)
	public lu as(int var1, int var2) throws EOFException {
		lu var3 = this.ak(var1);
		if (-1 == var2) {
			return var3;
		} else {
			return null != var3 && var3.ge_fld != null && var2 < var3.ge_fld.length ? var3.ge_fld[var2] : null;
		}
	}

	protected lw(ub var1, ub var2, ub var3, ub var4, ub var5) {
		this.ar_fld = new iw(50);
		this.af_fld = new iw(20);
		this.al_fld = new iw(8);
		this.au_fld = new ry(10, qd.ak_fld);
		this.ax_fld = new ry(10, qd.ak_fld);
		int var6 = 0;
		if (null != var1) {
			this.ag_fld = var1;
			this.av_fld = var2;
			this.ae_fld = var3;
			this.ah_fld = var4;
			this.az_fld = var5;
			var6 = this.ag_fld.cn((byte)110);
		}

		this.aw_fld = new lu[var6][];
		this.ak_fld = new boolean[var6];
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	public boolean az(int var1) throws EOFException {
		if (var1 >= 0 && var1 < this.aw_fld.length) {
			if (this.ak_fld[var1]) {
				return true;
			} else if (!this.ag_fld.dz(var1, -1881767706)) {
				return false;
			} else {
				int var3 = this.ag_fld.ce(var1, 223092882);
				if (0 == var3) {
					this.ak_fld[var1] = true;
					return true;
				} else {
					if (this.aw_fld[var1] == null) {
						this.aw_fld[var1] = new lu[var3];
					}

					for (int var4 = 0; var4 < var3; var4++) {
						if (this.aw_fld[var1][var4] == null) {
							byte[] var5 = this.ag_fld.bb(var1, var4, 584982574);
							if (var5 != null) {
								lu var6 = new lu();
								this.aw_fld[var1][var4] = var6;
								var6.bf_fld = 190642465 * ((var1 << 16) + var4);
								if (var5[0] == -1) {
									var6.ae(new xi(var5), -1258569533);
								} else {
									var6.av(new xi(var5), -1894614222);
								}

								if (this.az_fld != null) {
									byte[] var7 = this.az_fld.bb(var1, var4, 584982574);
									if (var7 != null && var7.length > 0) {
										var6.ah(new xi(var7), 153573090);
										this.ay_fld.put(var6.bl_fld, var1);
									}
								}
							}
						}
					}

					for (int var8 = 0; var8 < var3; var8++) {
						lu var9 = this.aw_fld[var1][var8];
						if (var9 != null && -1 != var9.cv_fld) {
							lu var10 = this.aw_fld[var1][var9.cv_fld & 65535];
							if (var8 > var10.cs_fld) {
								var10.cs_fld = var8;
							}

							if (var8 < var10.cx_fld) {
								var10.cx_fld = var8;
							}
						}
					}

					this.ak_fld[var1] = true;
					return true;
				}
			}
		} else {
			return false;
		}
	}

	@ObfuscatedName("eb")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)Z"
	)
	static boolean eb(int var0, int var1, int var2, int var3, int var4, int var5, int var6) throws EOFException {
		ev.jj(var0, var1, var2, var3, var4, var5, var6);
		ev var8 = hk.mt_fld.az_fld;
		if (var5 == ka.ak_fld.ae_fld) {
			fs var9 = ev.zr(var8, var0, var1, var2);
			if (null != var9) {
				int var10 = bj.ae(var9.az_fld);
				if (var3 == kn.az_fld.at_fld) {
					var9.ak_fld = new dz(hk.mt_fld, var10, 2, var4 + 4, var0, var1, var2, var6, false, var9.ak_fld);
					var9.ag_fld = new dz(hk.mt_fld, var10, 2, 1 + var4 & 3, var0, var1, var2, var6, false, var9.ag_fld);
				} else {
					var9.ak_fld = new dz(hk.mt_fld, var10, var3, var4, var0, var1, var2, var6, false, var9.ak_fld);
				}

				ev.ge(var0, var1, var2, var3, var4, var5, var6);
				return true;
			}
		} else if (ka.ag_fld.ae_fld == var5) {
			fv var11 = ev.tn(var8, var0, var1, var2);
			if (var11 != null) {
				int var14 = bj.ae(var11.az_fld);
				if (kn.ah_fld.at_fld == var3 || kn.aw_fld.at_fld == var3) {
					var11.ak_fld = new dz(hk.mt_fld, var14, 4, var4, var0, var1, var2, var6, false, var11.ak_fld);
				} else if (kn.ay_fld.at_fld == var3) {
					var11.ak_fld = new dz(hk.mt_fld, var14, 4, var4 + 4, var0, var1, var2, var6, false, var11.ak_fld);
				} else if (var3 == kn.as_fld.at_fld) {
					var11.ak_fld = new dz(hk.mt_fld, var14, 4, 4 + (2 + var4 & 3), var0, var1, var2, var6, false, var11.ak_fld);
				} else if (var3 == kn.ar_fld.at_fld) {
					var11.ak_fld = new dz(hk.mt_fld, var14, 4, var4 + 4, var0, var1, var2, var6, false, var11.ak_fld);
					var11.ag_fld = new dz(hk.mt_fld, var14, 4, 4 + (var4 + 2 & 3), var0, var1, var2, var6, false, var11.ag_fld);
				}

				ev.ge(var0, var1, var2, var3, var4, var5, var6);
				return true;
			}
		} else if (ka.az_fld.ae_fld == var5) {
			fj var12 = var8.bg(var0, var1, var2);
			if (var3 == kn.ab_fld.at_fld) {
				var3 = kn.ao_fld.at_fld;
			}

			if (null != var12) {
				var12.ak_fld = new dz(hk.mt_fld, bj.ae(var12.az_fld), var3, var4, var0, var1, var2, var6, false, var12.ak_fld);
				ev.ge(var0, var1, var2, var3, var4, var5, var6);
				return true;
			}
		} else if (ka.av_fld.ae_fld == var5) {
			ef var13 = var8.bb(var0, var1, var2);
			if (null != var13) {
				var13.ak_fld = new dz(hk.mt_fld, bj.ae(var13.ag_fld), 22, var4, var0, var1, var2, var6, false, var13.ak_fld);
				ev.ge(var0, var1, var2, var3, var4, var5, var6);
				return true;
			}
		}

		ev.ge(var0, var1, var2, var3, var4, var5, var6);
		return false;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Llu;"
	)
	public lu ah(int var1) throws EOFException {
		int var2 = var1 >> 16;
		int var3 = var1 & 65535;
		if (this.aw_fld[var2] == null || this.aw_fld[var2][var3] == null) {
			boolean var4 = this.az(var2);
			if (!var4) {
				return null;
			}
		}

		return this.aw_fld[var2][var3];
	}

	@ObfuscatedName("il")
	@ObfuscatedSignature(
		descriptor = "(Llw;I)Z"
	)
	public static boolean il(lw var0, int var1) throws EOFException {
		if (var0 == null) {
			var0.getClass();
		}

		if (var1 >= 0 && var1 < var0.aw_fld.length) {
			if (var0.ak_fld[var1]) {
				return true;
			} else if (!var0.ag_fld.dz(var1, -1226664010)) {
				return false;
			} else {
				int var2 = var0.ag_fld.ce(var1, 1081898903);
				if (0 == var2) {
					var0.ak_fld[var1] = true;
					return true;
				} else {
					if (var0.aw_fld[var1] == null) {
						var0.aw_fld[var1] = new lu[var2];
					}

					for (int var3 = 0; var3 < var2; var3++) {
						if (var0.aw_fld[var1][var3] == null) {
							byte[] var4 = var0.ag_fld.bb(var1, var3, 584982574);
							if (var4 != null) {
								lu var5 = new lu();
								var0.aw_fld[var1][var3] = var5;
								var5.bf_fld = 190642465 * ((var1 << 16) + var3);
								if (var4[0] == -1) {
									var5.ae(new xi(var4), -1210847957);
								} else {
									var5.av(new xi(var4), -1894614222);
								}

								if (var0.az_fld != null) {
									byte[] var6 = var0.az_fld.bb(var1, var3, 584982574);
									if (var6 != null && var6.length > 0) {
										var5.ah(new xi(var6), 153573090);
										var0.ay_fld.put(var5.bl_fld, var1);
									}
								}
							}
						}
					}

					for (int var7 = 0; var7 < var2; var7++) {
						lu var8 = var0.aw_fld[var1][var7];
						if (var8 != null && -1 != var8.cv_fld) {
							lu var9 = var0.aw_fld[var1][var8.cv_fld & 65535];
							if (var7 > var9.cs_fld) {
								var9.cs_fld = var7;
							}

							if (var7 < var9.cx_fld) {
								var9.cx_fld = var7;
							}
						}
					}

					var0.ak_fld[var1] = true;
					return true;
				}
			}
		} else {
			return false;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(III)Llu;"
	)
	public lu ag(int var1, int var2) throws EOFException {
		lu var4 = this.ak(var1);
		if (-1 == var2) {
			return var4;
		} else {
			return null != var4 && var4.ge_fld != null && var2 < var4.ge_fld.length ? var4.ge_fld[var2] : null;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Llu;"
	)
	public lu ay(int var1) throws EOFException {
		int var2 = var1 >> 16;
		int var3 = var1 & 65535;
		if (this.aw_fld[var2] == null || this.aw_fld[var2][var3] == null) {
			boolean var4 = this.az(var2);
			if (!var4) {
				return null;
			}
		}

		return this.aw_fld[var2][var3];
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(JIB)V"
	)
	static final void ar(long var0, int var2) {
		if (ej.cq_fld[ej.cd_fld] != Integer.MAX_VALUE && ej.cc_fld[ej.cd_fld] != var0) {
			ej.cd_fld++;
			ej.cq_fld[ej.cd_fld] = Integer.MAX_VALUE;
		}

		ej.cc_fld[ej.cd_fld] = var0;
		ej.cq_fld[ej.cd_fld] = Math.min(ej.cq_fld[ej.cd_fld], var2);
	}

	@ObfuscatedName("or")
	@ObfuscatedSignature(
		descriptor = "(Llw;I)Llu;"
	)
	public static lu or(lw var0, int var1) throws EOFException {
		if (var0 == null) {
			var0.getClass();
		}

		int var2 = var1 >> 16;
		int var3 = var1 & 65535;
		if (var0.aw_fld[var2] == null || var0.aw_fld[var2][var3] == null) {
			boolean var4 = var0.az(var2);
			if (!var4) {
				return null;
			}
		}

		return var0.aw_fld[var2][var3];
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean af(int var1) throws EOFException {
		if (var1 >= 0 && var1 < this.aw_fld.length) {
			if (this.ak_fld[var1]) {
				return true;
			} else if (!this.ag_fld.dz(var1, -1707092027)) {
				return false;
			} else {
				int var2 = this.ag_fld.ce(var1, -1016730929);
				if (0 == var2) {
					this.ak_fld[var1] = true;
					return true;
				} else {
					if (this.aw_fld[var1] == null) {
						this.aw_fld[var1] = new lu[var2];
					}

					for (int var3 = 0; var3 < var2; var3++) {
						if (this.aw_fld[var1][var3] == null) {
							byte[] var4 = this.ag_fld.bb(var1, var3, 584982574);
							if (var4 != null) {
								lu var5 = new lu();
								this.aw_fld[var1][var3] = var5;
								var5.bf_fld = 1265887489 * ((var1 << 16) + var3);
								if (var4[0] == -1) {
									var5.ae(new xi(var4), 54069187);
								} else {
									var5.av(new xi(var4), -1894614222);
								}

								if (this.az_fld != null) {
									byte[] var6 = this.az_fld.bb(var1, var3, 584982574);
									if (var6 != null && var6.length > 0) {
										var5.ah(new xi(var6), 153573090);
										this.ay_fld.put(var5.bl_fld, var1);
									}
								}
							}
						}
					}

					for (int var7 = 0; var7 < var2; var7++) {
						lu var8 = this.aw_fld[var1][var7];
						if (var8 != null && -1 != var8.cv_fld) {
							lu var9 = this.aw_fld[var1][var8.cv_fld & -1849308348];
							if (var7 > var9.cs_fld) {
								var9.cs_fld = var7;
							}

							if (var7 < var9.cx_fld) {
								var9.cx_fld = var7;
							}
						}
					}

					this.ak_fld[var1] = true;
					return true;
				}
			}
		} else {
			return false;
		}
	}

	@ObfuscatedName("lg")
	@ObfuscatedSignature(
		descriptor = "(I)Llu;"
	)
	public lu lg(int var1) throws EOFException {
		return this.ak(var1);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean al(int var1) throws EOFException {
		if (var1 >= 0 && var1 < this.aw_fld.length) {
			if (this.ak_fld[var1]) {
				return true;
			} else if (!this.ag_fld.dz(var1, -1140465611)) {
				return false;
			} else {
				int var2 = this.ag_fld.ce(var1, -288445752);
				if (0 == var2) {
					this.ak_fld[var1] = true;
					return true;
				} else {
					if (this.aw_fld[var1] == null) {
						this.aw_fld[var1] = new lu[var2];
					}

					for (int var3 = 0; var3 < var2; var3++) {
						if (this.aw_fld[var1][var3] == null) {
							byte[] var4 = this.ag_fld.bb(var1, var3, 584982574);
							if (var4 != null) {
								lu var5 = new lu();
								this.aw_fld[var1][var3] = var5;
								var5.bf_fld = 190642465 * ((var1 << 16) + var3);
								if (var4[0] == -1) {
									var5.ae(new xi(var4), 1452742661);
								} else {
									var5.av(new xi(var4), -1894614222);
								}

								if (this.az_fld != null) {
									byte[] var6 = this.az_fld.bb(var1, var3, 584982574);
									if (var6 != null && var6.length > 0) {
										var5.ah(new xi(var6), 153573090);
										this.ay_fld.put(var5.bl_fld, var1);
									}
								}
							}
						}
					}

					for (int var7 = 0; var7 < var2; var7++) {
						lu var8 = this.aw_fld[var1][var7];
						if (var8 != null && -1 != var8.cv_fld) {
							lu var9 = this.aw_fld[var1][var8.cv_fld & 65535];
							if (var7 > var9.cs_fld) {
								var9.cs_fld = var7;
							}

							if (var7 < var9.cx_fld) {
								var9.cx_fld = var7;
							}
						}
					}

					this.ak_fld[var1] = true;
					return true;
				}
			}
		} else {
			return false;
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void ax(int var1) {
		if (-1 != var1) {
			if (this.ak_fld[var1]) {
				this.ag_fld.ca(var1, 1348856680);
				if (this.aw_fld[var1] != null) {
					for (int var2 = 0; var2 < this.aw_fld[var1].length; var2++) {
						if (this.aw_fld[var1][var2] != null) {
							this.aw_fld[var1][var2] = null;
						}
					}

					this.aw_fld[var1] = null;
					this.ak_fld[var1] = false;
				}
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void ae(int var1) {
		if (-1 != var1) {
			if (this.ak_fld[var1]) {
				this.ag_fld.ca(var1, 1217136120);
				if (this.aw_fld[var1] != null) {
					for (int var2 = 0; var2 < this.aw_fld[var1].length; var2++) {
						if (this.aw_fld[var1][var2] != null) {
							this.aw_fld[var1][var2] = null;
						}
					}

					this.aw_fld[var1] = null;
					this.ak_fld[var1] = false;
				}
			}
		}
	}

	@ObfuscatedName("kw")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean kw(int var1) throws EOFException {
		return this.az(var1);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void au(int var1) {
		if (-1 != var1) {
			if (this.ak_fld[var1]) {
				this.ag_fld.ca(var1, 2145638876);
				if (this.aw_fld[var1] != null) {
					for (int var2 = 0; var2 < this.aw_fld[var1].length; var2++) {
						if (this.aw_fld[var1][var2] != null) {
							this.aw_fld[var1][var2] = null;
						}
					}

					this.aw_fld[var1] = null;
					this.ak_fld[var1] = false;
				}
			}
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void an(int var1) {
		this.as_fld.av();
		this.ar_fld.av();
		this.af_fld.av();
		this.al_fld.av();
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IB)Llu;"
	)
	public lu ak(int var1) throws EOFException {
		int var3 = var1 >> 16;
		int var4 = var1 & 65535;
		if (this.aw_fld[var3] == null || this.aw_fld[var3][var4] == null) {
			boolean var5 = this.az(var3);
			if (!var5) {
				return null;
			}
		}

		return this.aw_fld[var3][var4];
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IB)V"
	)
	public void av(int var1, byte var2) {
		if (-1 != var1) {
			if (this.ak_fld[var1]) {
				this.az_fld.ca(var1, 1703208281);
				if (this.aw_fld[var1] != null) {
					for (int var3 = 0; var3 < this.aw_fld[var1].length; var3++) {
						if (this.aw_fld[var1][var3] != null) {
							if (var2 == 6) {
								return;
							}

							this.aw_fld[var1][var3] = null;
						}
					}

					this.aw_fld[var1] = null;
					this.ak_fld[var1] = false;
				}
			}
		}
	}
}
