import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("za")
public class za {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int az_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lno;"
	)
	public static no ak_fld = new no();

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	public static void af(xi var0) {
		ze var2 = new ze();
		var2.ag_fld = var0.cg();
		var2.ak_fld = var0.co((byte)-55);
		var2.az_fld = new int[var2.ag_fld];
		var2.av_fld = new int[var2.ag_fld];
		var2.ae_fld = new Field[var2.ag_fld];
		var2.ah_fld = new int[var2.ag_fld];
		var2.aw_fld = new Method[var2.ag_fld];
		var2.ay_fld = new byte[var2.ag_fld][][];

		for (int var3 = 0; var3 < var2.ag_fld; var3++) {
			try {
				int var4 = var0.cg();
				if (var4 != 0 && 1 != var4 && 2 != var4) {
					if (3 == var4 || 4 == var4) {
						String var25 = xi.at(var0, 1498061517);
						String var26 = xi.at(var0, 181985388);
						int var27 = var0.cg();
						String[] var8 = new String[var27];

						for (int var9 = 0; var9 < var27; var9++) {
							var8[var9] = xi.at(var0, 1597379593);
						}

						String var28 = xi.at(var0, 108762910);
						byte[][] var10 = new byte[var27][];
						if (var4 == 3) {
							for (int var11 = 0; var11 < var27; var11++) {
								int var12 = var0.co((byte)-88);
								var10[var11] = new byte[var12];
								var0.dh(var10[var11], 0, var12);
							}
						}

						var2.az_fld[var3] = var4;
						Class[] var29 = new Class[var27];

						for (int var30 = 0; var30 < var27; var30++) {
							var29[var30] = dz.av(var8[var30]);
						}

						Class var31 = dz.av(var28);
						if (dz.av(var25).getClassLoader() == null) {
							throw new SecurityException();
						}

						Method[] var13 = dz.av(var25).getDeclaredMethods();
						Method[] var14 = var13;

						for (int var15 = 0; var15 < var14.length; var15++) {
							Method var16 = var14[var15];
							if (var16.getName().equals(var26)) {
								Class[] var17 = var16.getParameterTypes();
								if (var29.length == var17.length) {
									boolean var18 = true;

									for (int var19 = 0; var19 < var29.length; var19++) {
										if (var17[var19] != var29[var19]) {
											var18 = false;
											break;
										}
									}

									if (var18 && var31 == var16.getReturnType()) {
										var2.aw_fld[var3] = var16;
									}
								}
							}
						}

						var2.ay_fld[var3] = var10;
					}
				} else {
					String var5 = xi.at(var0, 1273423484);
					String var6 = xi.at(var0, 827653866);
					int var7 = 0;
					if (var4 == 1) {
						var7 = var0.co((byte)-11);
					}

					var2.az_fld[var3] = var4;
					var2.ah_fld[var3] = var7;
					if (dz.av(var5).getClassLoader() == null) {
						throw new SecurityException();
					}

					var2.ae_fld[var3] = dz.av(var5).getDeclaredField(var6);
				}
			} catch (ClassNotFoundException var20) {
				var2.av_fld[var3] = -1;
			} catch (SecurityException var21) {
				var2.av_fld[var3] = -2;
			} catch (NullPointerException var22) {
				var2.av_fld[var3] = -3;
			} catch (Exception var23) {
				var2.av_fld[var3] = -4;
			} catch (Throwable var24) {
				var2.av_fld[var3] = -5;
			}
		}

		no.dx(ak_fld, var2);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public static void ae() {
		ak_fld = new no();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public static void ah() {
		ak_fld = new no();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public static void aw() {
		ak_fld = new no();
	}

	za() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lxj;)V"
	)
	public static void ay(xj var0) {
		ze var1 = (ze)ak_fld.ah();
		if (null != var1) {
			int var2 = -1250976925 * var0.au_fld;
			var0.eb(var1.ak_fld);

			for (int var3 = 0; var3 < var1.ag_fld; var3++) {
				if (0 != var1.av_fld[var3]) {
					var0.ea(var1.av_fld[var3]);
				} else {
					try {
						int var4 = var1.az_fld[var3];
						if (0 == var4) {
							Field var5 = var1.ae_fld[var3];
							int var6 = var5.getInt(null);
							var0.ea(0);
							var0.eb(var6);
						} else if (1 == var4) {
							Field var22 = var1.ae_fld[var3];
							var22.setInt(null, var1.ah_fld[var3]);
							var0.ea(0);
						} else if (2 == var4) {
							Field var23 = var1.ae_fld[var3];
							int var26 = var23.getModifiers();
							var0.ea(0);
							var0.eb(var26);
						}

						if (var4 != 3) {
							if (var4 == 4) {
								Method var25 = var1.aw_fld[var3];
								int var28 = var25.getModifiers();
								var0.ea(0);
								var0.eb(var28);
							}
						} else {
							Method var24 = var1.aw_fld[var3];
							byte[][] var27 = var1.ay_fld[var3];
							Object[] var7 = (Object[])(new Object[var27.length]);

							for (int var8 = 0; var8 < var27.length; var8++) {
								ObjectInputStream var9 = new ObjectInputStream(new ByteArrayInputStream(var27[var8]));
								var7[var8] = var9.readObject();
							}

							Object var29 = var24.invoke(null, (Object[])var7);
							if (null == var29) {
								var0.ea(0);
							} else if (var29 instanceof Number) {
								var0.ea(1);
								var0.ft(((Number)var29).longValue());
							} else if (var29 instanceof String) {
								var0.ea(2);
								xi.ph(var0, (String)var29, 1662021276);
							} else {
								var0.ea(4);
							}
						}
					} catch (ClassNotFoundException var10) {
						var0.ea(-10);
					} catch (InvalidClassException var11) {
						var0.ea(-11);
					} catch (StreamCorruptedException var12) {
						var0.ea(635523730);
					} catch (OptionalDataException var13) {
						var0.ea(-13);
					} catch (IllegalAccessException var14) {
						var0.ea(-14);
					} catch (IllegalArgumentException var15) {
						var0.ea(-1630699925);
					} catch (InvocationTargetException var16) {
						var0.ea(-16);
					} catch (SecurityException var17) {
						var0.ea(-17);
					} catch (IOException var18) {
						var0.ea(2029617825);
					} catch (NullPointerException var19) {
						var0.ea(538715750);
					} catch (Exception var20) {
						var0.ea(-20);
					} catch (Throwable var21) {
						var0.ea(2137375340);
					}
				}
			}

			var0.dg(var2);
			var1.gy();
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	public static void ar(xi var0) {
		ze var2 = new ze();
		var2.ag_fld = var0.cg();
		var2.ak_fld = var0.co((byte)-62);
		var2.az_fld = new int[var2.ag_fld * 1973786740];
		var2.av_fld = new int[var2.ag_fld];
		var2.ae_fld = new Field[1774010317 * var2.ag_fld];
		var2.ah_fld = new int[var2.ag_fld];
		var2.aw_fld = new Method[var2.ag_fld];
		var2.ay_fld = new byte[-370988125 * var2.ag_fld][][];

		for (int var3 = 0; var3 < var2.ag_fld; var3++) {
			try {
				int var4 = var0.cg();
				if (var4 != 0 && 1 != var4 && 2 != var4) {
					if (3 == var4 || 4 == var4) {
						String var25 = xi.at(var0, -1558864714);
						String var26 = xi.at(var0, 353774685);
						int var27 = var0.cg();
						String[] var8 = new String[var27];

						for (int var9 = 0; var9 < var27; var9++) {
							var8[var9] = xi.at(var0, -993165029);
						}

						String var28 = xi.at(var0, -100612144);
						byte[][] var10 = new byte[var27][];
						if (var4 == 3) {
							for (int var11 = 0; var11 < var27; var11++) {
								int var12 = var0.co((byte)-97);
								var10[var11] = new byte[var12];
								var0.dh(var10[var11], 0, var12);
							}
						}

						var2.az_fld[var3] = var4;
						Class[] var29 = new Class[var27];

						for (int var30 = 0; var30 < var27; var30++) {
							var29[var30] = dz.av(var8[var30]);
						}

						Class var31 = dz.av(var28);
						if (dz.av(var25).getClassLoader() == null) {
							throw new SecurityException();
						}

						Method[] var13 = dz.av(var25).getDeclaredMethods();
						Method[] var14 = var13;

						for (int var15 = 0; var15 < var14.length; var15++) {
							Method var16 = var14[var15];
							if (var16.getName().equals(var26)) {
								Class[] var17 = var16.getParameterTypes();
								if (var29.length == var17.length) {
									boolean var18 = true;

									for (int var19 = 0; var19 < var29.length; var19++) {
										if (var17[var19] != var29[var19]) {
											var18 = false;
											break;
										}
									}

									if (var18 && var31 == var16.getReturnType()) {
										var2.aw_fld[var3] = var16;
									}
								}
							}
						}

						var2.ay_fld[var3] = var10;
					}
				} else {
					String var5 = xi.at(var0, -171520756);
					String var6 = xi.at(var0, 672678675);
					int var7 = 0;
					if (var4 == 1) {
						var7 = var0.co((byte)-67);
					}

					var2.az_fld[var3] = var4;
					var2.ah_fld[var3] = var7;
					if (dz.av(var5).getClassLoader() == null) {
						throw new SecurityException();
					}

					var2.ae_fld[var3] = dz.av(var5).getDeclaredField(var6);
				}
			} catch (ClassNotFoundException var20) {
				var2.av_fld[var3] = -1;
			} catch (SecurityException var21) {
				var2.av_fld[var3] = -1671476766;
			} catch (NullPointerException var22) {
				var2.av_fld[var3] = -3;
			} catch (Exception var23) {
				var2.av_fld[var3] = 1661568714;
			} catch (Throwable var24) {
				var2.av_fld[var3] = -5;
			}
		}

		no.dx(ak_fld, var2);
	}

	@ObfuscatedName("fj")
	@ObfuscatedSignature(
		descriptor = "(Lmw;)I"
	)
	public static int fj(mw var0) {
		return var0.al_fld.length;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lxj;)V"
	)
	public static void as(xj var0) {
		ze var1 = (ze)ak_fld.ah();
		if (null != var1) {
			int var2 = var0.au_fld;
			var0.eb(var1.ak_fld);

			for (int var3 = 0; var3 < var1.ag_fld; var3++) {
				if (0 != var1.av_fld[var3]) {
					var0.ea(var1.av_fld[var3]);
				} else {
					try {
						int var4 = var1.az_fld[var3];
						if (0 == var4) {
							Field var5 = var1.ae_fld[var3];
							int var6 = var5.getInt(null);
							var0.ea(0);
							var0.eb(var6);
						} else if (1 == var4) {
							Field var22 = var1.ae_fld[var3];
							var22.setInt(null, var1.ah_fld[var3]);
							var0.ea(0);
						} else if (2 == var4) {
							Field var23 = var1.ae_fld[var3];
							int var26 = var23.getModifiers();
							var0.ea(0);
							var0.eb(var26);
						}

						if (var4 != 3) {
							if (var4 == 4) {
								Method var25 = var1.aw_fld[var3];
								int var28 = var25.getModifiers();
								var0.ea(0);
								var0.eb(var28);
							}
						} else {
							Method var24 = var1.aw_fld[var3];
							byte[][] var27 = var1.ay_fld[var3];
							Object[] var7 = (Object[])(new Object[var27.length]);

							for (int var8 = 0; var8 < var27.length; var8++) {
								ObjectInputStream var9 = new ObjectInputStream(new ByteArrayInputStream(var27[var8]));
								var7[var8] = var9.readObject();
							}

							Object var29 = var24.invoke(null, (Object[])var7);
							if (null == var29) {
								var0.ea(0);
							} else if (var29 instanceof Number) {
								var0.ea(1);
								var0.ft(((Number)var29).longValue());
							} else if (var29 instanceof String) {
								var0.ea(2);
								xi.ph(var0, (String)var29, 875269510);
							} else {
								var0.ea(4);
							}
						}
					} catch (ClassNotFoundException var10) {
						var0.ea(-10);
					} catch (InvalidClassException var11) {
						var0.ea(-1086056840);
					} catch (StreamCorruptedException var12) {
						var0.ea(-12);
					} catch (OptionalDataException var13) {
						var0.ea(-185412267);
					} catch (IllegalAccessException var14) {
						var0.ea(-14);
					} catch (IllegalArgumentException var15) {
						var0.ea(822808115);
					} catch (InvocationTargetException var16) {
						var0.ea(-262836820);
					} catch (SecurityException var17) {
						var0.ea(-818590446);
					} catch (IOException var18) {
						var0.ea(863084095);
					} catch (NullPointerException var19) {
						var0.ea(-19);
					} catch (Exception var20) {
						var0.ea(123858467);
					} catch (Throwable var21) {
						var0.ea(-131480072);
					}
				}
			}

			var0.dg(var2);
			var1.gy();
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)Ljava/lang/Class;"
	)
	static Class al(String var0) throws ClassNotFoundException {
		if (var0.equals("B")) {
			return byte.class;
		} else if (var0.equals("I")) {
			return int.class;
		} else if (var0.equals("S")) {
			return short.class;
		} else if (var0.equals("J")) {
			return long.class;
		} else if (var0.equals("Z")) {
			return boolean.class;
		} else if (var0.equals("F")) {
			return float.class;
		} else if (var0.equals("D")) {
			return double.class;
		} else if (var0.equals("C")) {
			return char.class;
		} else {
			return var0.equals("void") ? void.class : Class.forName(var0);
		}
	}
}
