import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("sa")
public class sa {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	static float az_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	public static float av_fld = Math.ulp(1.0F);
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	static float ak_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	public static float ae_fld = av_fld * 2.0F;

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "([F)V"
	)
	static void an(float[] var0) {
		var0[1] = 1.0F - var0[1];
		if (var0[0] < 0.0F) {
			var0[0] = 0.0F;
		}

		if (var0[1] < 0.0F) {
			var0[1] = 0.0F;
		}

		if (var0[0] > 1.0F || var0[1] > 1.0F) {
			float var1 = (var0[1] - 2.0F) * var0[1] + var0[0] * (var0[0] - 2.0F + var0[1]) + 1.0F;
			if (av_fld + var1 > 0.0F) {
				if (av_fld + var0[0] < 1.3333334F) {
					float var2 = var0[0] - 2.0F;
					float var3 = var0[0] - 1.0F;
					float var4 = (float)Math.sqrt(var2 * var2 - var3 * (var3 * 4.0F));
					float var5 = 0.5F * (-var2 + var4);
					if (var0[1] + av_fld > var5) {
						var0[1] = var5 - av_fld;
					} else {
						var5 = 0.5F * (-var2 - var4);
						if (var0[1] < av_fld + var5) {
							var0[1] = av_fld + var5;
						}
					}
				} else {
					var0[0] = 1.3333334F - av_fld;
					var0[1] = 0.33333334F - av_fld;
				}
			}
		}

		var0[1] = 1.0F - var0[1];
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lsn;F)F"
	)
	static float ah(sn var0, float var1) {
		if (var0 == null || var0.as() == 0) {
			return 0.0F;
		} else if (!(var1 < var0.ae_fld[0].ak_fld * 157988587)) {
			if (var1 > var0.ae_fld[var0.as() - 1].ak_fld * 157988587) {
				return var0.av_fld == sd.ak_fld ? var0.ae_fld[var0.as() - 1].ag_fld : dx.ag(var0, var1, false);
			} else if (var0.ag_fld) {
				return var0.ae_fld[0].ag_fld;
			} else {
				sj var2 = var0.ay(var1);
				boolean var3 = false;
				boolean var4 = false;
				if (var2 == null) {
					return 0.0F;
				} else {
					if (var2.ae_fld == 0.0F && var2.ah_fld == 0.0F) {
						var3 = true;
					} else if (Float.MAX_VALUE == var2.ae_fld && var2.ah_fld == Float.MAX_VALUE) {
						var4 = true;
					} else if (null != var2.aw_fld) {
						if (var0.ai_fld) {
							float var5 = var2.ak_fld;
							float var9 = var2.ag_fld;
							float var6 = 0.33333334F * var2.ae_fld + var5;
							float var10 = var9 + 0.33333334F * var2.ah_fld;
							float var8 = var2.aw_fld.ak_fld * 157988587;
							float var12 = var2.aw_fld.ag_fld;
							float var7 = var8 - var2.aw_fld.az_fld * 0.33333334F;
							float var11 = var12 - 0.33333334F * var2.aw_fld.av_fld;
							if (var0.ak_fld) {
								float var15 = var10;
								float var16 = var11;
								if (null != var0) {
									float var17 = var8 - var5;
									if (0.0F != var17) {
										float var18 = var6 - var5;
										float var19 = var7 - var5;
										float[] var20 = new float[]{var18 / var17, var19 / var17};
										var0.ah_fld = 0.33333334F == var20[0] && 0.6666667F == var20[1];
										float var21 = var20[0];
										float var22 = var20[1];
										if (var20[0] < 0.0F) {
											var20[0] = 0.0F;
										}

										if (var20[1] > 1.0F) {
											var20[1] = 1.0F;
										}

										if (var20[0] > 1.0F || var20[1] < -1.0F) {
											by.av(var20, 1555350551);
										}

										if (var20[0] != var21) {
											float var13 = var17 * var20[0] + var5;
											if (var21 != 0.0F) {
												var15 = var9 + var20[0] * (var10 - var9) / var21;
											}
										}

										if (var22 != var20[1]) {
											float var14 = var5 + var17 * var20[1];
											if (1.0F != var22) {
												var16 = var12 - (1.0F - var20[1]) * (var12 - var11) / (1.0F - var22);
											}
										}

										var0.aw_fld = var5;
										var0.ay_fld = var8;
										float var23 = var20[0];
										float var24 = var20[1];
										float var25 = var23 - 0.0F;
										float var26 = var24 - var23;
										float var27 = 1.0F - var24;
										float var28 = var26 - var25;
										var0.al_fld = var27 - var26 - var28;
										var0.af_fld = var28 + var28 + var28;
										var0.ar_fld = var25 + var25 + var25;
										var0.as_fld = 0.0F;
										fz.ae(var9, var15, var16, var12, var0);
									}
								}
							} else {
								eu.az(var0, var5, var6, var7, var8, var9, var10, var11, var12);
							}

							var0.ai_fld = false;
						}
					} else {
						var3 = true;
					}

					if (var3) {
						return var2.ag_fld;
					} else if (var4) {
						return var2.ak_fld != var1 && var2.aw_fld != null ? var2.aw_fld.ag_fld : var2.ag_fld;
					} else if (var0.ak_fld) {
						float var30;
						if (var0 == null) {
							var30 = 0.0F;
						} else {
							float var32;
							if (var0.aw_fld == var1) {
								var32 = 0.0F;
							} else if (var1 == var0.ay_fld) {
								var32 = 1.0F;
							} else {
								var32 = (var1 - var0.aw_fld) / (var0.ay_fld - var0.aw_fld);
							}

							float var33;
							if (var0.ah_fld) {
								var33 = var32;
							} else {
								float[] var34 = new float[4];
								var34[3] = var0.al_fld;
								var34[2] = var0.af_fld;
								var34[1] = var0.ar_fld;
								var34[0] = var0.as_fld - var32;
								float[] var35 = new float[5];
								int var36 = sh.ak(var34, 3, 0.0F, true, 1.0F, true, var35);
								if (1 == var36) {
									var33 = var35[0];
								} else {
									var33 = 0.0F;
								}
							}

							var30 = var0.au_fld + (var0.ax_fld + var33 * (var33 * var0.aa_fld + var0.an_fld)) * var33;
						}

						return var30;
					} else {
						float var29;
						if (var0 == null) {
							var29 = 0.0F;
						} else {
							float var31 = var1 - var0.aw_fld;
							var29 = var0.al_fld + ((var0.as_fld * var31 + var0.ar_fld) * var31 + var0.af_fld) * var31;
						}

						return var29;
					}
				}
			}
		} else {
			return sd.ak_fld == var0.az_fld ? var0.ae_fld[0].ag_fld : dx.ag(var0, var1, true);
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lsn;F)F"
	)
	static float aw(sn var0, float var1) {
		if (var0 == null || var0.as() == 0) {
			return 0.0F;
		} else if (!(var1 < var0.ae_fld[0].ak_fld * 157988587)) {
			if (var1 > var0.ae_fld[var0.as() - 1].ak_fld * 157988587) {
				return var0.av_fld == sd.ak_fld ? var0.ae_fld[var0.as() - 1].ag_fld : dx.ag(var0, var1, false);
			} else if (var0.ag_fld) {
				return var0.ae_fld[0].ag_fld;
			} else {
				sj var2 = var0.ay(var1);
				boolean var3 = false;
				boolean var4 = false;
				if (var2 == null) {
					return 0.0F;
				} else {
					if (var2.ae_fld == 0.0F && var2.ah_fld == 0.0F) {
						var3 = true;
					} else if (Float.MAX_VALUE == var2.ae_fld && var2.ah_fld == Float.MAX_VALUE) {
						var4 = true;
					} else if (null != var2.aw_fld) {
						if (var0.ai_fld) {
							float var5 = var2.ak_fld;
							float var9 = var2.ag_fld;
							float var6 = 0.33333334F * var2.ae_fld + var5;
							float var10 = var9 + 0.33333334F * var2.ah_fld;
							float var8 = var2.aw_fld.ak_fld * 157988587;
							float var12 = var2.aw_fld.ag_fld;
							float var7 = var8 - var2.aw_fld.az_fld * 0.33333334F;
							float var11 = var12 - 0.33333334F * var2.aw_fld.av_fld;
							if (var0.ak_fld) {
								float var15 = var10;
								float var16 = var11;
								if (null != var0) {
									float var17 = var8 - var5;
									if (0.0F != var17) {
										float var18 = var6 - var5;
										float var19 = var7 - var5;
										float[] var20 = new float[]{var18 / var17, var19 / var17};
										var0.ah_fld = 0.33333334F == var20[0] && 0.6666667F == var20[1];
										float var21 = var20[0];
										float var22 = var20[1];
										if (var20[0] < 0.0F) {
											var20[0] = 0.0F;
										}

										if (var20[1] > 1.0F) {
											var20[1] = 1.0F;
										}

										if (var20[0] > 1.0F || var20[1] < -1.0F) {
											by.av(var20, 609704825);
										}

										if (var20[0] != var21) {
											float var13 = var17 * var20[0] + var5;
											if (var21 != 0.0F) {
												var15 = var9 + var20[0] * (var10 - var9) / var21;
											}
										}

										if (var22 != var20[1]) {
											float var14 = var5 + var17 * var20[1];
											if (1.0F != var22) {
												var16 = var12 - (1.0F - var20[1]) * (var12 - var11) / (1.0F - var22);
											}
										}

										var0.aw_fld = var5;
										var0.ay_fld = var8;
										float var23 = var20[0];
										float var24 = var20[1];
										float var25 = var23 - 0.0F;
										float var26 = var24 - var23;
										float var27 = 1.0F - var24;
										float var28 = var26 - var25;
										var0.al_fld = var27 - var26 - var28;
										var0.af_fld = var28 + var28 + var28;
										var0.ar_fld = var25 + var25 + var25;
										var0.as_fld = 0.0F;
										fz.ae(var9, var15, var16, var12, var0);
									}
								}
							} else {
								eu.az(var0, var5, var6, var7, var8, var9, var10, var11, var12);
							}

							var0.ai_fld = false;
						}
					} else {
						var3 = true;
					}

					if (var3) {
						return var2.ag_fld;
					} else if (var4) {
						return var2.ak_fld != var1 && var2.aw_fld != null ? var2.aw_fld.ag_fld : var2.ag_fld;
					} else if (var0.ak_fld) {
						float var30;
						if (var0 == null) {
							var30 = 0.0F;
						} else {
							float var32;
							if (var0.aw_fld == var1) {
								var32 = 0.0F;
							} else if (var1 == var0.ay_fld) {
								var32 = 1.0F;
							} else {
								var32 = (var1 - var0.aw_fld) / (var0.ay_fld - var0.aw_fld);
							}

							float var33;
							if (var0.ah_fld) {
								var33 = var32;
							} else {
								float[] var34 = new float[4];
								var34[3] = var0.al_fld;
								var34[2] = var0.af_fld;
								var34[1] = var0.ar_fld;
								var34[0] = var0.as_fld - var32;
								float[] var35 = new float[5];
								int var36 = sh.ak(var34, 3, 0.0F, true, 1.0F, true, var35);
								if (1 == var36) {
									var33 = var35[0];
								} else {
									var33 = 0.0F;
								}
							}

							var30 = var0.au_fld + (var0.ax_fld + var33 * (var33 * var0.aa_fld + var0.an_fld)) * var33;
						}

						return var30;
					} else {
						float var29;
						if (var0 == null) {
							var29 = 0.0F;
						} else {
							float var31 = var1 - var0.aw_fld;
							var29 = var0.al_fld + ((var0.as_fld * var31 + var0.ar_fld) * var31 + var0.af_fld) * var31;
						}

						return var29;
					}
				}
			}
		} else {
			return sd.ak_fld == var0.az_fld ? var0.ae_fld[0].ag_fld : dx.ag(var0, var1, true);
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lsn;F)F"
	)
	static float ay(sn var0, float var1) {
		if (var0 == null || var0.as() == 0) {
			return 0.0F;
		} else if (!(var1 < var0.ae_fld[0].ak_fld * 157988587)) {
			if (var1 > var0.ae_fld[var0.as() - 1].ak_fld * 157988587) {
				return var0.av_fld == sd.ak_fld ? var0.ae_fld[var0.as() - 1].ag_fld : dx.ag(var0, var1, false);
			} else if (var0.ag_fld) {
				return var0.ae_fld[0].ag_fld;
			} else {
				sj var2 = var0.ay(var1);
				boolean var3 = false;
				boolean var4 = false;
				if (var2 == null) {
					return 0.0F;
				} else {
					if (var2.ae_fld == 0.0F && var2.ah_fld == 0.0F) {
						var3 = true;
					} else if (Float.MAX_VALUE == var2.ae_fld && var2.ah_fld == Float.MAX_VALUE) {
						var4 = true;
					} else if (null != var2.aw_fld) {
						if (var0.ai_fld) {
							float var5 = var2.ak_fld;
							float var9 = var2.ag_fld;
							float var6 = 0.33333334F * var2.ae_fld + var5;
							float var10 = var9 + 0.33333334F * var2.ah_fld;
							float var8 = var2.aw_fld.ak_fld * 157988587;
							float var12 = var2.aw_fld.ag_fld;
							float var7 = var8 - var2.aw_fld.az_fld * 0.33333334F;
							float var11 = var12 - 0.33333334F * var2.aw_fld.av_fld;
							if (var0.ak_fld) {
								float var15 = var10;
								float var16 = var11;
								if (null != var0) {
									float var17 = var8 - var5;
									if (0.0F != var17) {
										float var18 = var6 - var5;
										float var19 = var7 - var5;
										float[] var20 = new float[]{var18 / var17, var19 / var17};
										var0.ah_fld = 0.33333334F == var20[0] && 0.6666667F == var20[1];
										float var21 = var20[0];
										float var22 = var20[1];
										if (var20[0] < 0.0F) {
											var20[0] = 0.0F;
										}

										if (var20[1] > 1.0F) {
											var20[1] = 1.0F;
										}

										if (var20[0] > 1.0F || var20[1] < -1.0F) {
											by.av(var20, 264680767);
										}

										if (var20[0] != var21) {
											float var13 = var17 * var20[0] + var5;
											if (var21 != 0.0F) {
												var15 = var9 + var20[0] * (var10 - var9) / var21;
											}
										}

										if (var22 != var20[1]) {
											float var14 = var5 + var17 * var20[1];
											if (1.0F != var22) {
												var16 = var12 - (1.0F - var20[1]) * (var12 - var11) / (1.0F - var22);
											}
										}

										var0.aw_fld = var5;
										var0.ay_fld = var8;
										float var23 = var20[0];
										float var24 = var20[1];
										float var25 = var23 - 0.0F;
										float var26 = var24 - var23;
										float var27 = 1.0F - var24;
										float var28 = var26 - var25;
										var0.al_fld = var27 - var26 - var28;
										var0.af_fld = var28 + var28 + var28;
										var0.ar_fld = var25 + var25 + var25;
										var0.as_fld = 0.0F;
										fz.ae(var9, var15, var16, var12, var0);
									}
								}
							} else {
								eu.az(var0, var5, var6, var7, var8, var9, var10, var11, var12);
							}

							var0.ai_fld = false;
						}
					} else {
						var3 = true;
					}

					if (var3) {
						return var2.ag_fld;
					} else if (var4) {
						return var2.ak_fld != var1 && var2.aw_fld != null ? var2.aw_fld.ag_fld : var2.ag_fld;
					} else if (var0.ak_fld) {
						float var30;
						if (var0 == null) {
							var30 = 0.0F;
						} else {
							float var32;
							if (var0.aw_fld == var1) {
								var32 = 0.0F;
							} else if (var1 == var0.ay_fld) {
								var32 = 1.0F;
							} else {
								var32 = (var1 - var0.aw_fld) / (var0.ay_fld - var0.aw_fld);
							}

							float var33;
							if (var0.ah_fld) {
								var33 = var32;
							} else {
								float[] var34 = new float[4];
								var34[3] = var0.al_fld;
								var34[2] = var0.af_fld;
								var34[1] = var0.ar_fld;
								var34[0] = var0.as_fld - var32;
								float[] var35 = new float[5];
								int var36 = sh.ak(var34, 3, 0.0F, true, 1.0F, true, var35);
								if (1 == var36) {
									var33 = var35[0];
								} else {
									var33 = 0.0F;
								}
							}

							var30 = var0.au_fld + (var0.ax_fld + var33 * (var33 * var0.aa_fld + var0.an_fld)) * var33;
						}

						return var30;
					} else {
						float var29;
						if (var0 == null) {
							var29 = 0.0F;
						} else {
							float var31 = var1 - var0.aw_fld;
							var29 = var0.al_fld + ((var0.as_fld * var31 + var0.ar_fld) * var31 + var0.af_fld) * var31;
						}

						return var29;
					}
				}
			}
		} else {
			return sd.ak_fld == var0.az_fld ? var0.ae_fld[0].ag_fld : dx.ag(var0, var1, true);
		}
	}

	sa() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lsn;FZ)F"
	)
	static float ar(sn var0, float var1, boolean var2) {
		float var3 = 0.0F;
		if (var0 != null && var0.as() != 0) {
			float var4 = -533506048 * var0.ae_fld[0].ak_fld;
			float var5 = var0.ae_fld[var0.as() - 1].ak_fld * 612944939;
			float var6 = var5 - var4;
			if (0.0F == var6) {
				return var0.ae_fld[0].ag_fld;
			} else {
				float var7 = 0.0F;
				if (var1 > var5) {
					var7 = (var1 - var5) / var6;
				} else {
					var7 = (var1 - var4) / var6;
				}

				float var8 = (int)var7;
				float var9 = Math.abs(var7 - var8);
				float var10 = var9 * var6;
				var8 = Math.abs(1.0F + var8);
				float var11 = var8 / 2.0F;
				float var12 = (int)var11;
				var9 = var11 - var12;
				if (var2) {
					if (sd.ae_fld == var0.az_fld) {
						if (0.0F != var9) {
							var10 += var4;
						} else {
							var10 = var5 - var10;
						}
					} else if (sd.az_fld != var0.az_fld && var0.az_fld != sd.av_fld) {
						if (var0.az_fld == sd.ag_fld) {
							var10 = var4 - var1;
							float var13 = var0.ae_fld[0].az_fld;
							float var14 = var0.ae_fld[0].av_fld;
							var3 = var0.ae_fld[0].ag_fld;
							if (var13 != 0.0F) {
								var3 -= var10 * var14 / var13;
							}

							return var3;
						}
					} else {
						var10 = var5 - var10;
					}
				} else if (sd.ae_fld == var0.av_fld) {
					if (0.0F != var9) {
						var10 = var5 - var10;
					} else {
						var10 += var4;
					}
				} else if (var0.av_fld != sd.az_fld && var0.av_fld != sd.av_fld) {
					if (sd.ag_fld == var0.av_fld) {
						var10 = var1 - var5;
						float var24 = var0.ae_fld[var0.as() - 1].ae_fld;
						float var25 = var0.ae_fld[var0.as() - 1].ah_fld;
						var3 = var0.ae_fld[var0.as() - 1].ag_fld;
						if (0.0F != var24) {
							var3 += var10 * var25 / var24;
						}

						return var3;
					}
				} else {
					var10 += var4;
				}

				var3 = dr.ak(var0, var10);
				if (var2 && sd.av_fld == var0.az_fld) {
					float var26 = var0.ae_fld[var0.as() - 1].ag_fld - var0.ae_fld[0].ag_fld;
					var3 -= var26 * var8;
				} else if (!var2 && sd.av_fld == var0.av_fld) {
					float var15 = var0.ae_fld[var0.as() - 1].ag_fld - var0.ae_fld[0].ag_fld;
					var3 += var8 * var15;
				}

				return var3;
			}
		} else {
			return var3;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lsn;FZ)F"
	)
	static float af(sn var0, float var1, boolean var2) {
		float var3 = 0.0F;
		if (var0 != null && var0.as() != 0) {
			float var4 = 157988587 * var0.ae_fld[0].ak_fld;
			float var5 = var0.ae_fld[var0.as() - 1].ak_fld * 157988587;
			float var6 = var5 - var4;
			if (0.0F == var6) {
				return var0.ae_fld[0].ag_fld;
			} else {
				float var7 = 0.0F;
				if (var1 > var5) {
					var7 = (var1 - var5) / var6;
				} else {
					var7 = (var1 - var4) / var6;
				}

				float var8 = (int)var7;
				float var9 = Math.abs(var7 - var8);
				float var10 = var9 * var6;
				var8 = Math.abs(1.0F + var8);
				float var11 = var8 / 2.0F;
				float var12 = (int)var11;
				var9 = var11 - var12;
				if (var2) {
					if (sd.ae_fld == var0.az_fld) {
						if (0.0F != var9) {
							var10 += var4;
						} else {
							var10 = var5 - var10;
						}
					} else if (sd.az_fld != var0.az_fld && var0.az_fld != sd.av_fld) {
						if (var0.az_fld == sd.ag_fld) {
							var10 = var4 - var1;
							float var13 = var0.ae_fld[0].az_fld;
							float var14 = var0.ae_fld[0].av_fld;
							var3 = var0.ae_fld[0].ag_fld;
							if (var13 != 0.0F) {
								var3 -= var10 * var14 / var13;
							}

							return var3;
						}
					} else {
						var10 = var5 - var10;
					}
				} else if (sd.ae_fld == var0.av_fld) {
					if (0.0F != var9) {
						var10 = var5 - var10;
					} else {
						var10 += var4;
					}
				} else if (var0.av_fld != sd.az_fld && var0.av_fld != sd.av_fld) {
					if (sd.ag_fld == var0.av_fld) {
						var10 = var1 - var5;
						float var24 = var0.ae_fld[var0.as() - 1].ae_fld;
						float var25 = var0.ae_fld[var0.as() - 1].ah_fld;
						var3 = var0.ae_fld[var0.as() - 1].ag_fld;
						if (0.0F != var24) {
							var3 += var10 * var25 / var24;
						}

						return var3;
					}
				} else {
					var10 += var4;
				}

				var3 = dr.ak(var0, var10);
				if (var2 && sd.av_fld == var0.az_fld) {
					float var26 = var0.ae_fld[var0.as() - 1].ag_fld - var0.ae_fld[0].ag_fld;
					var3 -= var26 * var8;
				} else if (!var2 && sd.av_fld == var0.av_fld) {
					float var15 = var0.ae_fld[var0.as() - 1].ag_fld - var0.ae_fld[0].ag_fld;
					var3 += var8 * var15;
				}

				return var3;
			}
		} else {
			return var3;
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lsn;FZ)F"
	)
	static float al(sn var0, float var1, boolean var2) {
		float var3 = 0.0F;
		if (var0 != null && var0.as() != 0) {
			float var4 = 157988587 * var0.ae_fld[0].ak_fld;
			float var5 = var0.ae_fld[var0.as() - 1].ak_fld * 157988587;
			float var6 = var5 - var4;
			if (0.0F == var6) {
				return var0.ae_fld[0].ag_fld;
			} else {
				float var7 = 0.0F;
				if (var1 > var5) {
					var7 = (var1 - var5) / var6;
				} else {
					var7 = (var1 - var4) / var6;
				}

				float var8 = (int)var7;
				float var9 = Math.abs(var7 - var8);
				float var10 = var9 * var6;
				var8 = Math.abs(1.0F + var8);
				float var11 = var8 / 2.0F;
				float var12 = (int)var11;
				var9 = var11 - var12;
				if (var2) {
					if (sd.ae_fld == var0.az_fld) {
						if (0.0F != var9) {
							var10 += var4;
						} else {
							var10 = var5 - var10;
						}
					} else if (sd.az_fld != var0.az_fld && var0.az_fld != sd.av_fld) {
						if (var0.az_fld == sd.ag_fld) {
							var10 = var4 - var1;
							float var13 = var0.ae_fld[0].az_fld;
							float var14 = var0.ae_fld[0].av_fld;
							var3 = var0.ae_fld[0].ag_fld;
							if (var13 != 0.0F) {
								var3 -= var10 * var14 / var13;
							}

							return var3;
						}
					} else {
						var10 = var5 - var10;
					}
				} else if (sd.ae_fld == var0.av_fld) {
					if (0.0F != var9) {
						var10 = var5 - var10;
					} else {
						var10 += var4;
					}
				} else if (var0.av_fld != sd.az_fld && var0.av_fld != sd.av_fld) {
					if (sd.ag_fld == var0.av_fld) {
						var10 = var1 - var5;
						float var24 = var0.ae_fld[var0.as() - 1].ae_fld;
						float var25 = var0.ae_fld[var0.as() - 1].ah_fld;
						var3 = var0.ae_fld[var0.as() - 1].ag_fld;
						if (0.0F != var24) {
							var3 += var10 * var25 / var24;
						}

						return var3;
					}
				} else {
					var10 += var4;
				}

				var3 = dr.ak(var0, var10);
				if (var2 && sd.av_fld == var0.az_fld) {
					float var26 = var0.ae_fld[var0.as() - 1].ag_fld - var0.ae_fld[0].ag_fld;
					var3 -= var26 * var8;
				} else if (!var2 && sd.av_fld == var0.av_fld) {
					float var15 = var0.ae_fld[var0.as() - 1].ag_fld - var0.ae_fld[0].ag_fld;
					var3 += var8 * var15;
				}

				return var3;
			}
		} else {
			return var3;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lsn;F)F"
	)
	static float as(sn var0, float var1) {
		if (var0 == null || var0.as() == 0) {
			return 0.0F;
		} else if (!(var1 < var0.ae_fld[0].ak_fld * 382601495)) {
			if (var1 > var0.ae_fld[var0.as() - 1].ak_fld * -88940913) {
				return var0.av_fld == sd.ak_fld ? var0.ae_fld[var0.as() - 1].ag_fld : dx.ag(var0, var1, false);
			} else if (var0.ag_fld) {
				return var0.ae_fld[0].ag_fld;
			} else {
				sj var2 = var0.ay(var1);
				boolean var3 = false;
				boolean var4 = false;
				if (var2 == null) {
					return 0.0F;
				} else {
					if (var2.ae_fld == 0.0F && var2.ah_fld == 0.0F) {
						var3 = true;
					} else if (Float.MAX_VALUE == var2.ae_fld && var2.ah_fld == Float.MAX_VALUE) {
						var4 = true;
					} else if (null != var2.aw_fld) {
						if (var0.ai_fld) {
							float var5 = var2.ak_fld * 1620049551;
							float var9 = var2.ag_fld;
							float var6 = 0.33333334F * var2.ae_fld + var5;
							float var10 = var9 + 0.33333334F * var2.ah_fld;
							float var8 = var2.aw_fld.ak_fld * -1778954183;
							float var12 = var2.aw_fld.ag_fld;
							float var7 = var8 - var2.aw_fld.az_fld * 0.33333334F;
							float var11 = var12 - 0.33333334F * var2.aw_fld.av_fld;
							if (var0.ak_fld) {
								float var15 = var10;
								float var16 = var11;
								if (null != var0) {
									float var17 = var8 - var5;
									if (0.0F != var17) {
										float var18 = var6 - var5;
										float var19 = var7 - var5;
										float[] var20 = new float[]{var18 / var17, var19 / var17};
										var0.ah_fld = 0.33333334F == var20[0] && 0.6666667F == var20[1];
										float var21 = var20[0];
										float var22 = var20[1];
										if (var20[0] < 0.0F) {
											var20[0] = 0.0F;
										}

										if (var20[1] > 1.0F) {
											var20[1] = 1.0F;
										}

										if (var20[0] > 1.0F || var20[1] < -1.0F) {
											by.av(var20, 254284729);
										}

										if (var20[0] != var21) {
											float var13 = var17 * var20[0] + var5;
											if (var21 != 0.0F) {
												var15 = var9 + var20[0] * (var10 - var9) / var21;
											}
										}

										if (var22 != var20[1]) {
											float var14 = var5 + var17 * var20[1];
											if (1.0F != var22) {
												var16 = var12 - (1.0F - var20[1]) * (var12 - var11) / (1.0F - var22);
											}
										}

										var0.aw_fld = var5;
										var0.ay_fld = var8;
										float var23 = var20[0];
										float var24 = var20[1];
										float var25 = var23 - 0.0F;
										float var26 = var24 - var23;
										float var27 = 1.0F - var24;
										float var28 = var26 - var25;
										var0.al_fld = var27 - var26 - var28;
										var0.af_fld = var28 + var28 + var28;
										var0.ar_fld = var25 + var25 + var25;
										var0.as_fld = 0.0F;
										fz.ae(var9, var15, var16, var12, var0);
									}
								}
							} else {
								eu.az(var0, var5, var6, var7, var8, var9, var10, var11, var12);
							}

							var0.ai_fld = false;
						}
					} else {
						var3 = true;
					}

					if (var3) {
						return var2.ag_fld;
					} else if (var4) {
						return -1252020187 * var2.ak_fld != var1 && var2.aw_fld != null ? var2.aw_fld.ag_fld : var2.ag_fld;
					} else if (var0.ak_fld) {
						float var30;
						if (var0 == null) {
							var30 = 0.0F;
						} else {
							float var32;
							if (var0.aw_fld == var1) {
								var32 = 0.0F;
							} else if (var1 == var0.ay_fld) {
								var32 = 1.0F;
							} else {
								var32 = (var1 - var0.aw_fld) / (var0.ay_fld - var0.aw_fld);
							}

							float var33;
							if (var0.ah_fld) {
								var33 = var32;
							} else {
								float[] var34 = new float[4];
								var34[3] = var0.al_fld;
								var34[2] = var0.af_fld;
								var34[1] = var0.ar_fld;
								var34[0] = var0.as_fld - var32;
								float[] var35 = new float[5];
								int var36 = sh.ak(var34, 3, 0.0F, true, 1.0F, true, var35);
								if (1 == var36) {
									var33 = var35[0];
								} else {
									var33 = 0.0F;
								}
							}

							var30 = var0.au_fld + (var0.ax_fld + var33 * (var33 * var0.aa_fld + var0.an_fld)) * var33;
						}

						return var30;
					} else {
						float var29;
						if (var0 == null) {
							var29 = 0.0F;
						} else {
							float var31 = var1 - var0.aw_fld;
							var29 = var0.al_fld + ((var0.as_fld * var31 + var0.ar_fld) * var31 + var0.af_fld) * var31;
						}

						return var29;
					}
				}
			}
		} else {
			return sd.ak_fld == var0.az_fld ? var0.ae_fld[0].ag_fld : dx.ag(var0, var1, true);
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lsn;FFFFFFFF)V"
	)
	static void au(sn var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
		if (null != var0) {
			var0.aw_fld = var1;
			float var9 = var4 - var1;
			float var10 = var8 - var5;
			float var11 = var2 - var1;
			float var12 = 0.0F;
			float var13 = 0.0F;
			if (0.0F != var11) {
				var12 = (var6 - var5) / var11;
			}

			var11 = var4 - var3;
			if (var11 != 0.0F) {
				var13 = (var8 - var7) / var11;
			}

			float var14 = 1.0F / (var9 * var9);
			float var15 = var9 * var12;
			float var16 = var13 * var9;
			var0.as_fld = (var15 + var16 - var10 - var10) * var14 / var9;
			var0.ar_fld = var14 * (var10 + var10 + var10 - var15 - var15 - var16);
			var0.af_fld = var12;
			var0.al_fld = var5;
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "([F)V"
	)
	static void ax(float[] var0) {
		var0[1] = 1.0F - var0[1];
		if (var0[0] < 0.0F) {
			var0[0] = 0.0F;
		}

		if (var0[1] < 0.0F) {
			var0[1] = 0.0F;
		}

		if (var0[0] > 1.0F || var0[1] > 1.0F) {
			float var1 = (var0[1] - 2.0F) * var0[1] + var0[0] * (var0[0] - 2.0F + var0[1]) + 1.0F;
			if (av_fld + var1 > 0.0F) {
				if (av_fld + var0[0] < 1.3333334F) {
					float var2 = var0[0] - 2.0F;
					float var3 = var0[0] - 1.0F;
					float var4 = (float)Math.sqrt(var2 * var2 - var3 * (var3 * 4.0F));
					float var5 = 0.5F * (-var2 + var4);
					if (var0[1] + av_fld > var5) {
						var0[1] = var5 - av_fld;
					} else {
						var5 = 0.5F * (-var2 - var4);
						if (var0[1] < av_fld + var5) {
							var0[1] = av_fld + var5;
						}
					}
				} else {
					var0[0] = 1.3333334F - av_fld;
					var0[1] = 0.33333334F - av_fld;
				}
			}
		}

		var0[1] = 1.0F - var0[1];
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(FFFFLsn;)V"
	)
	static void aa(float var0, float var1, float var2, float var3, sn var4) {
		float var5 = var1 - var0;
		float var6 = var2 - var1;
		float var7 = var3 - var2;
		float var8 = var6 - var5;
		var4.aa_fld = var7 - var6 - var8;
		var4.an_fld = var8 + (var8 + var8);
		var4.ax_fld = var5 + (var5 + var5);
		var4.au_fld = var0;
	}
}
