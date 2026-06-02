import java.util.Iterator;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("xk")
public class xk implements Iterator {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int az_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lvw;"
	)
	vw ag_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lxv;"
	)
	xv ak_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lvw;"
	)
	vw av_fld = null;

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxv;)V"
	)
	public void av(xv var1) {
		this.ak_fld = var1;
		this.ag();
	}

	@ObfuscatedName("ox")
	@ObfuscatedSignature(
		descriptor = "(Lxk;)Ljava/lang/Object;"
	)
	public static Object ox(xk var0) {
		if (var0.ag_fld != var0.ak_fld.ag_fld[var0.az_fld - 1]) {
			vw var2 = var0.ag_fld;
			var0.ag_fld = var2.hg_vw;
			var0.av_fld = var2;
			return var2;
		} else {
			while (var0.az_fld < var0.ak_fld.ak_fld) {
				vw var1 = var0.ak_fld.ag_fld[var0.az_fld++].hg_vw;
				if (var1 != var0.ak_fld.ag_fld[var0.az_fld - 1]) {
					var0.ag_fld = var1.hg_vw;
					var0.av_fld = var1;
					return var1;
				}
			}

			return null;
		}
	}

	public xk() {
	}

	@ObfuscatedName("qh")
	@ObfuscatedSignature(
		descriptor = "(Lxk;)Z"
	)
	public static boolean qh(xk var0) {
		if (var0.ag_fld != var0.ak_fld.ag_fld[var0.az_fld - 1]) {
			return true;
		} else {
			while (var0.az_fld < var0.ak_fld.ak_fld) {
				if (var0.ak_fld.ag_fld[var0.az_fld++].hg_vw != var0.ak_fld.ag_fld[var0.az_fld - 1]) {
					var0.ag_fld = var0.ak_fld.ag_fld[var0.az_fld - 1].hg_vw;
					return true;
				}

				var0.ag_fld = var0.ak_fld.ag_fld[var0.az_fld - 1];
			}

			return false;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lxv;)V"
	)
	public void ak(xv var1) {
		this.ak_fld = var1;
		this.ag();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ag() {
		this.ag_fld = this.ak_fld.ag_fld[0].hg_vw;
		this.az_fld = 1;
		this.av_fld = null;
	}

	@ObfuscatedName("em")
	@ObfuscatedSignature(
		descriptor = "(Lyv;IIIIII)V"
	)
	public static void em(yv var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (var0 == null) {
			var0.getClass();
		} else if (var6 != 0) {
			var1 -= var0.as_fld << 4;
			var2 -= var0.ar_fld << 4;
			double var7 = (var5 & 65535) * 9.587379924285257E-5;
			int var9 = (int)Math.floor(Math.sin(var7) * var6 + 0.5);
			int var10 = (int)Math.floor(Math.cos(var7) * var6 + 0.5);
			int var11 = -var1 * var10 + -var2 * var9;
			int var12 = -(-var1) * var9 + -var2 * var10;
			int var13 = ((var0.aw_fld << 4) - var1) * var10 + -var2 * var9;
			int var14 = -((var0.aw_fld << 4) - var1) * var9 + -var2 * var10;
			int var15 = -var1 * var10 + ((var0.ay_fld << 4) - var2) * var9;
			int var16 = -(-var1) * var9 + ((var0.ay_fld << 4) - var2) * var10;
			int var17 = ((var0.aw_fld << 4) - var1) * var10 + ((var0.ay_fld << 4) - var2) * var9;
			int var18 = -((var0.aw_fld << 4) - var1) * var9 + ((var0.ay_fld << 4) - var2) * var10;
			int var19;
			int var20;
			if (var11 < var13) {
				var19 = var11;
				var20 = var13;
			} else {
				var19 = var13;
				var20 = var11;
			}

			if (var15 < var19) {
				var19 = var15;
			}

			if (var17 < var19) {
				var19 = var17;
			}

			if (var15 > var20) {
				var20 = var15;
			}

			if (var17 > var20) {
				var20 = var17;
			}

			int var21;
			int var22;
			if (var12 < var14) {
				var21 = var12;
				var22 = var14;
			} else {
				var21 = var14;
				var22 = var12;
			}

			if (var16 < var21) {
				var21 = var16;
			}

			if (var18 < var21) {
				var21 = var18;
			}

			if (var16 > var22) {
				var22 = var16;
			}

			if (var18 > var22) {
				var22 = var18;
			}

			var19 >>= 12;
			var20 = var20 + 1601730902 >> 12;
			var21 >>= 12;
			var22 = var22 + 4095 >> 12;
			var19 += var3;
			var20 += var3;
			var21 += var4;
			var22 += var4;
			var19 >>= 4;
			var20 = var20 + 15 >> 4;
			var21 >>= 4;
			var22 = var22 + 15 >> 4;
			if (var19 < yv.aq_fld) {
				var19 = yv.aq_fld;
			}

			if (var20 > yv.am_fld) {
				var20 = yv.am_fld;
			}

			if (var21 < yv.aa_fld) {
				var21 = yv.aa_fld;
			}

			if (var22 > yv.ai_fld) {
				var22 = yv.ai_fld;
			}

			var20 = var19 - var20;
			if (var20 < 0) {
				var22 = var21 - var22;
				if (var22 < 0) {
					int var23 = var21 * yv.au_fld + var19;
					double var24 = 1.6777216E7 / var6;
					int var26 = (int)Math.floor(Math.sin(var7) * var24 + 0.5);
					int var27 = (int)Math.floor(Math.cos(var7) * var24 + 0.5);
					int var28 = (var19 << 4) + 8 - var3;
					int var29 = (var21 << 4) + 8 - var4;
					int var30 = (var1 << 8) - (var29 * var26 >> 4);
					int var31 = (var2 << 8) + (var29 * var27 >> 4);
					if (var27 == 0) {
						if (var26 == 0) {
							for (int var33 = var22; var33 < 0; var23 += yv.au_fld) {
								int var34 = var23;
								int var35 = var30;
								int var36 = var31;
								int var37 = var20;
								if (var30 >= 0 && var31 >= 0 && var30 - (var0.aw_fld << 12) < 0 && var31 - (var0.ay_fld << 12) < 0) {
									for (; var37 < 0; var37++) {
										int var38 = var0.ah_fld[(var36 >> 12) * var0.aw_fld + (var35 >> 12)];
										if (var38 != 0) {
											yv.al_fld[var34++] = var38;
										} else {
											var34++;
										}
									}
								}

								var33++;
							}
						} else if (var26 < 0) {
							for (int var84 = var22; var84 < 0; var23 += yv.au_fld) {
								int var92 = var23;
								int var100 = var30;
								int var108 = var31 + (var28 * var26 >> 4);
								int var116 = var20;
								if (var30 >= 0 && var30 - (var0.aw_fld << 12) < 0) {
									int var32;
									if ((var32 = var108 - (var0.ay_fld << 12)) >= 0) {
										var32 = (var26 - var32) / var26;
										var116 = var20 + var32;
										var108 += var26 * var32;
										var92 = var23 + var32;
									}

									if ((var32 = (var108 - var26) / var26) > var116) {
										var116 = var32;
									}

									while (var116 < 0) {
										int var124 = var0.ah_fld[(var108 >> 12) * var0.aw_fld + (var100 >> 12)];
										if (var124 != 0) {
											yv.al_fld[var92++] = var124;
										} else {
											var92++;
										}

										var108 += var26;
										var116++;
									}
								}

								var84++;
								var30 -= var26;
							}
						} else {
							for (int var85 = var22; var85 < 0; var23 += yv.au_fld) {
								int var93 = var23;
								int var101 = var30;
								int var109 = var31 + (var28 * var26 >> 4);
								int var117 = var20;
								if (var30 >= 0 && var30 - (var0.aw_fld << 12) < 0) {
									if (var109 < 0) {
										int var57 = (var26 - 1 - var109) / var26;
										var117 = var20 + var57;
										var109 += var26 * var57;
										var93 = var23 + var57;
									}

									int var58;
									if ((var58 = (1 + var109 - (var0.ay_fld << 12) - var26) / var26) > var117) {
										var117 = var58;
									}

									while (var117 < 0) {
										int var125 = var0.ah_fld[(var109 >> 12) * var0.aw_fld + (var101 >> 12)];
										if (var125 != 0) {
											yv.al_fld[var93++] = var125;
										} else {
											var93++;
										}

										var109 += var26;
										var117++;
									}
								}

								var85++;
								var30 -= var26;
							}
						}
					} else if (var27 < 0) {
						if (var26 == 0) {
							for (int var86 = var22; var86 < 0; var23 += yv.au_fld) {
								int var94 = var23;
								int var102 = var30 + (var28 * var27 >> 4);
								int var110 = var31;
								int var118 = var20;
								if (var31 >= 0 && var31 - (var0.ay_fld << 12) < 0) {
									int var59;
									if ((var59 = var102 - (var0.aw_fld << 12)) >= 0) {
										var59 = (var27 - var59) / var27;
										var118 = var20 + var59;
										var102 += var27 * var59;
										var94 = var23 + var59;
									}

									if ((var59 = (var102 - var27) / var27) > var118) {
										var118 = var59;
									}

									while (var118 < 0) {
										int var126 = var0.ah_fld[(var110 >> 12) * var0.aw_fld + (var102 >> 12)];
										if (var126 != 0) {
											yv.al_fld[var94++] = var126;
										} else {
											var94++;
										}

										var102 += var27;
										var118++;
									}
								}

								var86++;
								var31 += var27;
							}
						} else if (var26 < 0) {
							for (int var87 = var22; var87 < 0; var23 += yv.au_fld) {
								int var95 = var23;
								int var103 = var30 + (var28 * var27 >> 4);
								int var111 = var31 + (var28 * var26 >> 4);
								int var119 = var20;
								int var62;
								if ((var62 = var103 - (var0.aw_fld << 12)) >= 0) {
									var62 = (var27 - var62) / var27;
									var119 = var20 + var62;
									var103 += var27 * var62;
									var111 += var26 * var62;
									var95 = var23 + var62;
								}

								if ((var62 = (var103 - var27) / var27) > var119) {
									var119 = var62;
								}

								if ((var62 = var111 - (var0.ay_fld << 12)) >= 0) {
									var62 = (var26 - var62) / var26;
									var119 += var62;
									var103 += var27 * var62;
									var111 += var26 * var62;
									var95 += var62;
								}

								if ((var62 = (var111 - var26) / var26) > var119) {
									var119 = var62;
								}

								while (var119 < 0) {
									int var127 = var0.ah_fld[(var111 >> 12) * var0.aw_fld + (var103 >> 12)];
									if (var127 != 0) {
										yv.al_fld[var95++] = var127;
									} else {
										var95++;
									}

									var103 += var27;
									var111 += var26;
									var119++;
								}

								var87++;
								var30 -= var26;
								var31 += var27;
							}
						} else {
							for (int var88 = var22; var88 < 0; var23 += yv.au_fld) {
								int var96 = var23;
								int var104 = var30 + (var28 * var27 >> 4);
								int var112 = var31 + (var28 * var26 >> 4);
								int var120 = var20;
								int var68;
								if ((var68 = var104 - (var0.aw_fld << 12)) >= 0) {
									var68 = (var27 - var68) / var27;
									var120 = var20 + var68;
									var104 += var27 * var68;
									var112 += var26 * var68;
									var96 = var23 + var68;
								}

								if ((var68 = (var104 - var27) / var27) > var120) {
									var120 = var68;
								}

								if (var112 < 0) {
									var68 = (var26 - 1 - var112) / var26;
									var120 += var68;
									var104 += var27 * var68;
									var112 += var26 * var68;
									var96 += var68;
								}

								if ((var68 = (1 + var112 - (var0.ay_fld << 12) - var26) / var26) > var120) {
									var120 = var68;
								}

								while (var120 < 0) {
									int var128 = var0.ah_fld[(var112 >> 12) * var0.aw_fld + (var104 >> 12)];
									if (var128 != 0) {
										yv.al_fld[var96++] = var128;
									} else {
										var96++;
									}

									var104 += var27;
									var112 += var26;
									var120++;
								}

								var88++;
								var30 -= var26;
								var31 += var27;
							}
						}
					} else if (var26 == 0) {
						for (int var89 = var22; var89 < 0; var23 += yv.au_fld) {
							int var97 = var23;
							int var105 = var30 + (var28 * var27 >> 4);
							int var113 = var31;
							int var121 = var20;
							if (var31 >= 0 && var31 - (var0.ay_fld << 12) < 0) {
								if (var105 < 0) {
									int var73 = (var27 - 1 - var105) / var27;
									var121 = var20 + var73;
									var105 += var27 * var73;
									var97 = var23 + var73;
								}

								int var74;
								if ((var74 = (1 + var105 - (var0.aw_fld << 12) - var27) / var27) > var121) {
									var121 = var74;
								}

								while (var121 < 0) {
									int var129 = var0.ah_fld[(var113 >> 12) * var0.aw_fld + (var105 >> 12)];
									if (var129 != 0) {
										yv.al_fld[var97++] = var129;
									} else {
										var97++;
									}

									var105 += var27;
									var121++;
								}
							}

							var89++;
							var31 += var27;
						}
					} else if (var26 < 0) {
						for (int var90 = var22; var90 < 0; var23 += yv.au_fld) {
							int var98 = var23;
							int var106 = var30 + (var28 * var27 >> 4);
							int var114 = var31 + (var28 * var26 >> 4);
							int var122 = var20;
							if (var106 < 0) {
								int var75 = (var27 - 1 - var106) / var27;
								var122 = var20 + var75;
								var106 += var27 * var75;
								var114 += var26 * var75;
								var98 = var23 + var75;
							}

							int var76;
							if ((var76 = (1 + var106 - (var0.aw_fld << 12) - var27) / var27) > var122) {
								var122 = var76;
							}

							if ((var76 = var114 - (var0.ay_fld << 12)) >= 0) {
								var76 = (var26 - var76) / var26;
								var122 += var76;
								var106 += var27 * var76;
								var114 += var26 * var76;
								var98 += var76;
							}

							if ((var76 = (var114 - var26) / var26) > var122) {
								var122 = var76;
							}

							while (var122 < 0) {
								int var130 = var0.ah_fld[(var114 >> 12) * var0.aw_fld + (var106 >> 12)];
								if (var130 != 0) {
									yv.al_fld[var98++] = var130;
								} else {
									var98++;
								}

								var106 += var27;
								var114 += var26;
								var122++;
							}

							var90++;
							var30 -= var26;
							var31 += var27;
						}
					} else {
						for (int var91 = var22; var91 < 0; var23 += yv.au_fld) {
							int var99 = var23;
							int var107 = var30 + (var28 * var27 >> 4);
							int var115 = var31 + (var28 * var26 >> 4);
							int var123 = var20;
							if (var107 < 0) {
								int var80 = (var27 - 1 - var107) / var27;
								var123 = var20 + var80;
								var107 += var27 * var80;
								var115 += var26 * var80;
								var99 = var23 + var80;
							}

							int var81;
							if ((var81 = (1 + var107 - (var0.aw_fld << 12) - var27) / var27) > var123) {
								var123 = var81;
							}

							if (var115 < 0) {
								var81 = (var26 - 1 - var115) / var26;
								var123 += var81;
								var107 += var27 * var81;
								var115 += var26 * var81;
								var99 += var81;
							}

							if ((var81 = (1 + var115 - (var0.ay_fld << 12) - var26) / var26) > var123) {
								var123 = var81;
							}

							while (var123 < 0) {
								int var131 = var0.ah_fld[(var115 >> 12) * var0.aw_fld + (var107 >> 12)];
								if (var131 != 0) {
									yv.al_fld[var99++] = var131;
								} else {
									var99++;
								}

								var107 += var27;
								var115 += var26;
								var123++;
							}

							var91++;
							var30 -= var26;
							var31 += var27;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("next")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/Object;"
	)
	@Override
	public Object next() {
		if (this.ag_fld != this.ak_fld.ag_fld[this.az_fld - 1]) {
			vw var2 = this.ag_fld;
			this.ag_fld = var2.hg_vw;
			this.av_fld = var2;
			return var2;
		} else {
			while (this.az_fld < this.ak_fld.ak_fld) {
				vw var1 = this.ak_fld.ag_fld[this.az_fld++].hg_vw;
				if (var1 != this.ak_fld.ag_fld[this.az_fld - 1]) {
					this.ag_fld = var1.hg_vw;
					this.av_fld = var1;
					return var1;
				}
			}

			return null;
		}
	}

	public xk(xv var1) {
		this.ak_fld = var1;
		this.ag();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/Object;"
	)
	public Object ay() {
		if (this.ag_fld != this.ak_fld.ag_fld[this.az_fld - 1]) {
			vw var2 = this.ag_fld;
			this.ag_fld = var2.hg_vw;
			this.av_fld = var2;
			return var2;
		} else {
			while (this.az_fld < this.ak_fld.ak_fld) {
				vw var1 = this.ak_fld.ag_fld[this.az_fld++].hg_vw;
				if (var1 != this.ak_fld.ag_fld[this.az_fld - 1]) {
					this.ag_fld = var1.hg_vw;
					this.av_fld = var1;
					return var1;
				}
			}

			return null;
		}
	}

	@ObfuscatedName("hasNext")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	public boolean hasNext() {
		if (this.ag_fld != this.ak_fld.ag_fld[this.az_fld - 1]) {
			return true;
		} else {
			while (this.az_fld < this.ak_fld.ak_fld) {
				if (this.ak_fld.ag_fld[this.az_fld++].hg_vw != this.ak_fld.ag_fld[this.az_fld - 1]) {
					this.ag_fld = this.ak_fld.ag_fld[this.az_fld - 1].hg_vw;
					return true;
				}

				this.ag_fld = this.ak_fld.ag_fld[this.az_fld - 1];
			}

			return false;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void af() {
		if (this.av_fld == null) {
			throw new IllegalStateException();
		} else {
			this.av_fld.gy_void();
			this.av_fld = null;
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "()Lvw;"
	)
	public vw ai() {
		this.ag();
		return (vw)(vw)this.next();
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()Lvw;"
	)
	public vw az() {
		this.ag();
		return (vw)(vw)this.next();
	}

	@ObfuscatedName("ut")
	@ObfuscatedSignature(
		descriptor = "(Lxk;)V"
	)
	public static void ut(xk var0) {
		if (var0.av_fld == null) {
			throw new IllegalStateException();
		} else {
			var0.av_fld.gy_void();
			var0.av_fld = null;
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ax() {
		if (this.av_fld == null) {
			throw new IllegalStateException();
		} else {
			this.av_fld.gy_void();
			this.av_fld = null;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void au() {
		if (this.av_fld == null) {
			throw new IllegalStateException();
		} else {
			this.av_fld.gy_void();
			this.av_fld = null;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void an() {
		if (this.av_fld == null) {
			throw new IllegalStateException();
		} else {
			this.av_fld.gy_void();
			this.av_fld = null;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ah() {
		this.ag_fld = this.ak_fld.ag_fld[0].hg_vw;
		this.az_fld = 1;
		this.av_fld = null;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void aw() {
		this.ag_fld = this.ak_fld.ag_fld[0].hg_vw;
		this.az_fld = 1;
		this.av_fld = null;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void aa() {
		this.ag_fld = this.ak_fld.ag_fld[0].hg_vw;
		this.az_fld = 1;
		this.av_fld = null;
	}

	@ObfuscatedName("remove")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Override
	public void remove() {
		if (this.av_fld == null) {
			throw new IllegalStateException();
		} else {
			this.av_fld.gy_void();
			this.av_fld = null;
		}
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(Lxk;Lxv;)V"
	)
	public static void ca(xk var0, xv var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ak_fld = var1;
		var0.ag();
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "()Lvw;"
	)
	public vw aq() {
		this.ag();
		return (vw)(vw)this.next();
	}
}
