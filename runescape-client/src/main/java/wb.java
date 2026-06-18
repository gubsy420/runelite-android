import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;
import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("wb")
class wb implements Iterator {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 539058003
	)
	int ak_fld;
	// $VF: synthetic field
	@ObfuscatedName("this$0")
	@ObfuscatedSignature(
		descriptor = "Lwd;"
	)
	wd this$0;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ah_fld;

	@ObfuscatedName("remove")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Export("remove")
	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void al() {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		descriptor = "(Lwb;)V"
	)
	public static void ht(wb var0) {
		if (var0 == null) {
			var0.getClass();
		}

		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("next")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/Object;"
	)
	@Export("next")
	@Override
	public Object next() {
		try {
			int var1 = (this.ak_fld += 317996251) * 539058003 - 1;
			tk var2 = (tk)(tk)this.this$0.ag_fld.ak(var1);
			return var2 != null ? var2 : this.this$0.au(var1);
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void an() {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/Object;"
	)
	public Object ay() {
		try {
			int var1 = (this.ak_fld += 317996251) * 539058003 - 1;
			tk var2 = (tk)(tk)this.this$0.ag_fld.ak(var1);
			return var2 != null ? var2 : this.this$0.au(var1);
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	wb(wd var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean ar() {
		return this.ak_fld < this.this$0.ag();
	}

	@ObfuscatedName("hasNext")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Export("hasNext")
	@Override
	public boolean hasNext() {
		return this.ak_fld < this.this$0.ag();
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void au() {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ax() {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/Object;"
	)
	public Object as() {
		try {
			int var1 = (this.ak_fld += -1776459993) * -484047057 - 1;
			tk var2 = (tk)(tk)this.this$0.ag_fld.ak(var1);
			return var2 != null ? var2 : this.this$0.au(var1);
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lxi;II)V"
	)
	public static void az(xi var0, int var1, int var2) {
		ze var3 = new ze();
		var3.ag_fld = var0.cg();
		var3.ak_fld = var0.co((byte)-80);
		var3.az_fld = new int[var3.ag_fld];
		var3.av_fld = new int[var3.ag_fld];
		var3.ae_fld = new Field[var3.ag_fld];
		var3.ah_fld = new int[var3.ag_fld];
		var3.aw_fld = new Method[var3.ag_fld];
		var3.ay_fld = new byte[var3.ag_fld][][];

		for (int var4 = 0; var4 < var3.ag_fld; var4++) {
			try {
				int var5 = var0.cg();
				if (var5 != 0 && 1 != var5) {
					if (2 != var5) {
						if (3 != var5 && 4 != var5) {
							continue;
						}

						String var26 = xi.at(var0, 2084180116);
						String var27 = xi.at(var0, 1389993284);
						int var28 = var0.cg();
						String[] var9 = new String[var28];

						for (int var10 = 0; var10 < var28; var10++) {
							if (var2 <= -281354914) {
								return;
							}

							var9[var10] = xi.at(var0, 539592259);
						}

						String var29 = xi.at(var0, 432676317);
						byte[][] var11 = new byte[var28][];
						if (var5 == 3) {
							if (var2 <= -281354914) {
								return;
							}

							for (int var12 = 0; var12 < var28; var12++) {
								int var13 = var0.co((byte)3);
								var11[var12] = new byte[var13];
								var0.dh(var11[var12], 0, var13);
							}
						}

						var3.az_fld[var4] = var5;
						Class[] var30 = new Class[var28];

						for (int var31 = 0; var31 < var28; var31++) {
							var30[var31] = dz.av(var9[var31]);
						}

						Class var32 = dz.av(var29);
						if (dz.av(var26).getClassLoader() == null) {
							if (var2 <= -281354914) {
								return;
							}

							throw new SecurityException();
						}

						Method[] var14 = dz.av(var26).getDeclaredMethods();
						Method[] var15 = var14;

						for (int var16 = 0; var16 < var15.length; var16++) {
							if (var2 <= -281354914) {
								return;
							}

							Method var17 = var15[var16];
							if (var17.getName().equals(var27)) {
								Class[] var18 = var17.getParameterTypes();
								if (var30.length == var18.length) {
									boolean var19 = true;

									for (int var20 = 0; var20 < var30.length; var20++) {
										if (var2 <= -281354914) {
											return;
										}

										if (var18[var20] != var30[var20]) {
											if (var2 <= -281354914) {
												return;
											}

											var19 = false;
											break;
										}
									}

									if (var19 && var32 == var17.getReturnType()) {
										var3.aw_fld[var4] = var17;
									}
								}
							}
						}

						var3.ay_fld[var4] = var11;
						continue;
					}

					if (var2 <= -281354914) {
						return;
					}
				}

				String var6 = xi.at(var0, -986668804);
				String var7 = xi.at(var0, -1029148514);
				int var8 = 0;
				if (var5 == 1) {
					var8 = var0.co((byte)-30);
				}

				var3.az_fld[var4] = var5;
				var3.ah_fld[var4] = var8;
				if (dz.av(var6).getClassLoader() == null) {
					throw new SecurityException();
				}

				var3.ae_fld[var4] = dz.av(var6).getDeclaredField(var7);
			} catch (ClassNotFoundException var21) {
				var3.av_fld[var4] = -1;
			} catch (SecurityException var22) {
				var3.av_fld[var4] = -2;
			} catch (NullPointerException var23) {
				var3.av_fld[var4] = -3;
			} catch (Exception var24) {
				var3.av_fld[var4] = -4;
			} catch (Throwable var25) {
				var3.av_fld[var4] = -5;
			}
		}

		no.dx(za.ak_fld, var3);
	}
}
