import com.google.common.hash.HashCode;
import com.google.common.hash.Hashing;
import com.google.common.io.BaseEncoding;
import com.google.common.io.ByteStreams;
import com.google.common.io.CharStreams;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import net.runelite.api.IndexDataBase;
import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;
import net.runelite.api.overlay.OverlayIndex;

@ObfuscatedName("ub")
@Implements({"IndexDataBase"})
public abstract class ub implements IndexDataBase {
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] bl_fld;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1646218121
	)
	static int bd_fld = 0;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "Laat;"
	)
	static aat bz_fld = new aat();
	@ObfuscatedName("lh")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public boolean lh_fld;
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 222606033
	)
	int bh_fld;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean be_fld;
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean bs_fld;
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "[Lyd;"
	)
	yd[] bu_fld;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ao_fld;
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "[[Ljava/lang/Object;"
	)
	Object[][] bc_fld;
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "Lyd;"
	)
	yd bf_fld;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] bj_fld;
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] by_fld;
	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 203225911
	)
	int bx_fld;
	@ObfuscatedName("gm")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 203591707
	)
	static int gm_fld;
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1327704301
	)
	public int br_fld;
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] bp_fld;
	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "[[I"
	)
	int[][] bi_fld;
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "[[I"
	)
	int[][] bv_fld;
	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/Object;"
	)
	public Object dh_fld;
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] bk_fld;
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] bo_fld;
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] bt_fld;
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "[Ljava/lang/Object;"
	)
	Object[] bn_fld;

	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "(II)[B"
	)
	public byte[] dg(int var1, int var2) {
		try {
			if (var1 >= 0 && var1 < this.bc_fld.length && this.bc_fld[var1] != null && var2 >= 0 && var2 < this.bc_fld[var1].length) {
				if (this.bc_fld[var1][var2] == null) {
					boolean var3 = this.cw(var1, null, (byte)8);
					if (!var3) {
						this.av(var1, -1366154196);
						var3 = this.cw(var1, null, (byte)8);
						if (!var3) {
							return null;
						}
					}
				}

				return im.ak(this.bc_fld[var1][var2], false);
			} else {
				return null;
			}
		} catch (Throwable var5) {
			throw new RuntimeException(var5);
		}
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(II[II)[B"
	)
	byte[] cd(int var1, int var2, int[] var3, int var4) {
		try {
			if (var1 >= 0 && var1 < this.bc_fld.length && this.bc_fld[var1] != null && var2 >= 0 && var2 < this.bc_fld[var1].length) {
				Object var5 = this.bc_fld[var1][var2];
				if (var5 == null) {
					synchronized (this) {
						Object var7 = this.bn_fld[var1];
						if (var7 == null) {
							this.ls(var1);
						}

						if (!this.og(var1, var3)) {
							return null;
						}

						var5 = this.bc_fld[var1][var2];
						if (this.bs_fld) {
							this.bc_fld[var1][var2] = null;
						}
					}
				}

				return var5 == null ? null : so(var5, false);
			} else {
				return null;
			}
		} catch (Throwable var11) {
			throw new RuntimeException(var11);
		}
	}

	@ObfuscatedName("ej")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)I"
	)
	public int ej(String var1) {
		var1 = var1.toLowerCase();
		int var2 = yd.fx(this.bf_fld, ov.ar(var1));
		return this.ar(var2, -8656200);
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(IB)[I"
	)
	public int[] cp(int var1, byte var2) {
		return var1 >= 0 && var1 < this.bi_fld.length ? this.bi_fld[var1] : null;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int ak_int(int var1) {
		return this.ce(var1, -438313678);
	}

	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	public boolean dz(int var1, int var2) {
		try {
			synchronized (this) {
				int var7 = -1472281419;
				boolean var10000;
				if (this.bn_fld[var1] != null) {
					boolean var5 = true;
					var10000 = var5;
				} else {
					this.av(var1, -2112207273);
					if (null != this.bn_fld[var1]) {
						boolean var10 = true;
						var10000 = var10;
					} else {
						boolean var11 = false;
						var10000 = var11;
					}
				}

				return var10000;
			}
		} catch (Throwable var9) {
			throw new RuntimeException(var9);
		}
	}

	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean do_(int var1) {
		try {
			if (this.bc_fld.length == 1) {
				return this.cc(0, var1, 660308291);
			} else if (this.bc_fld[var1].length == 1) {
				return this.cc(var1, 0, -1337170949);
			} else {
				throw new RuntimeException();
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int de(int var1) {
		return this.bc_fld != null && var1 < this.bc_fld.length && null != this.bc_fld[var1] ? this.bc_fld[var1].length : 0;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	int ar(int var1, int var2) {
		return this.bn_fld[var1] != null ? 100 : 0;
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(II)[B"
	)
	public byte[] cs(int var1, int var2) {
		try {
			if (1 == this.bc_fld.length) {
				return this.cx(0, var1, -738120907);
			} else if (this.bc_fld[var1].length == 1) {
				return this.cx(var1, 0, -1981652013);
			} else {
				throw new RuntimeException();
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void av(int var1, int var2) {
		try {
			;
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	public boolean dm(int var1, int var2) {
		try {
			if (var1 >= 0 && var1 < this.bc_fld.length && this.bc_fld[var1] != null && var2 >= 0 && var2 < this.bc_fld[var1].length) {
				if (this.bc_fld[var1][var2] != null) {
					return true;
				} else if (null != this.bn_fld[var1]) {
					return true;
				} else {
					this.av(var1, 1768319454);
					return null != this.bn_fld[var1];
				}
			} else {
				return false;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	public int ce(int var1, int var2) {
		if (this.bc_fld != null && var1 < this.bc_fld.length) {
			Object[] var3 = (Object[])this.bc_fld[var1];
			return var3 == null ? 0 : var3.length;
		} else {
			return 0;
		}
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	public int cn(byte var1) {
		return this.bx_fld;
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void cr(int var1) {
		for (int var2 = 0; var2 < this.bn_fld.length; var2++) {
			if (this.bn_fld[var2] instanceof zx) {
				((zx)this.bn_fld[var2]).lx();
			}

			this.bn_fld[var2] = null;
		}
	}

	@ObfuscatedName("od")
	@ObfuscatedSignature(
		descriptor = "(I[I)V"
	)
	public void od(int var1, int[] var2) {
		this.dh_fld = this.bn_fld[var1];
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void cg(int var1) {
		for (int var2 = 0; var2 < this.bc_fld.length; var2++) {
			if (this.bc_fld[var2] != null) {
				for (int var3 = 0; var3 < this.bc_fld[var2].length; var3++) {
					if (this.bc_fld[var2][var3] instanceof zx) {
						((zx)this.bc_fld[var2][var3]).lx();
					}

					this.bc_fld[var2][var3] = null;
				}
			}
		}
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(I[IB)Z"
	)
	boolean cw(int var1, int[] var2, byte var3) {
		this.od(var1, var2);
		if (null == this.bn_fld[var1]) {
			this.rv(var1, var2);
			return false;
		} else {
			int var4 = this.bo_fld[var1];
			int[] var5 = this.bi_fld[var1];
			Object[] var6 = (Object[])this.bc_fld[var1];
			boolean var7 = true;

			for (int var8 = 0; var8 < var4; var8++) {
				if (null == var6[var5[var8]]) {
					var7 = false;
					break;
				}
			}

			if (var7) {
				this.rv(var1, var2);
				return true;
			} else {
				byte[] var22;
				if (null == var2 || var2[0] == 0 && 0 == var2[1] && var2[2] == 0 && var2[3] == 0) {
					var22 = im.ak(this.bn_fld[var1], false);
				} else {
					var22 = im.ak(this.bn_fld[var1], true);
					xi var9 = new xi(var22);
					xi.wt(var9, var2, 5, var9.al_fld.length);
				}

				byte[] var23 = dn.bq(var22);
				if (this.be_fld) {
					this.bn_fld[var1] = null;
				}

				if (var4 > 1) {
					int var10 = var23.length;
					int var11 = var23[--var10] & 255;
					var10 -= 4 * var11 * var4;
					xi var12 = new xi(var23);
					int[] var13 = new int[var4];
					var12.au_fld = var10;

					for (int var14 = 0; var14 < var11; var14++) {
						int var15 = 0;

						for (int var16 = 0; var16 < var4; var16++) {
							var15 += var12.co((byte)-84);
							var13[var16] += var15;
						}
					}

					byte[][] var29 = new byte[var4][];

					for (int var30 = 0; var30 < var4; var30++) {
						var29[var30] = new byte[var13[var30]];
						var13[var30] = 0;
					}

					var12.au_fld = var10;
					int var31 = 0;

					for (int var32 = 0; var32 < var11; var32++) {
						int var17 = 0;

						for (int var18 = 0; var18 < var4; var18++) {
							var17 += var12.co((byte)-90);
							System.arraycopy(var23, var31, var29[var18], var13[var18], var17);
							var13[var18] += var17;
							var31 += var17;
						}
					}

					for (int var33 = 0; var33 < var4; var33++) {
						if (!this.bs_fld) {
							int var34 = var5[var33];
							byte[] var20 = var29[var33];
							Object var19;
							if (var20 == null) {
								var19 = null;
							} else if (var20.length > 136) {
								zx var21 = new zx();
								var21.az(var20, (byte)-59);
								var19 = var21;
							} else {
								var19 = var20;
							}

							var6[var34] = var19;
						} else {
							var6[var5[var33]] = var29[var33];
						}
					}
				} else if (!this.bs_fld) {
					int var26 = var5[0];
					Object var27;
					if (null == var23) {
						var27 = null;
					} else if (var23.length > 136) {
						zx var28 = new zx();
						var28.az(var23, (byte)-100);
						var27 = var28;
					} else {
						var27 = var23;
					}

					var6[var26] = var27;
				} else {
					var6[var5[0]] = var23;
				}

				this.rv(var1, var2);
				return true;
			}
		}
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I"
	)
	public int cm(String var1, byte var2) {
		var1 = var1.toLowerCase();
		return yd.fx(this.bf_fld, ov.ar(var1));
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)I"
	)
	public int cz(int var1, String var2, int var3) {
		var2 = var2.toLowerCase();
		return yd.fx(this.bu_fld[var1], ov.ar(var2));
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;B)Z"
	)
	public boolean ck(String var1, String var2, byte var3) {
		var1 = var1.toLowerCase();
		var2 = var2.toLowerCase();
		int var4 = yd.fx(this.bf_fld, ov.ar(var1));
		if (var4 < 0) {
			return false;
		} else {
			int var5 = yd.fx(this.bu_fld[var4], ov.ar(var2));
			return var5 >= 0;
		}
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;B)[B"
	)
	public byte[] cb(String var1, String var2, byte var3) {
		try {
			var1 = var1.toLowerCase();
			var2 = var2.toLowerCase();
			int var4 = yd.fx(this.bf_fld, ov.ar(var1));
			int var5 = yd.fx(this.bu_fld[var4], ov.ar(var2));
			return this.bb(var4, var5, 584982574);
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(III)[B"
	)
	public byte[] bb(int var1, int var2, int var3) {
		try {
			int var20 = 584982574;
			byte[] var17 = this.cd(var1, var2, null, 1009611161);
			byte[] var4 = var17;
			uv var5 = (uv)this;
			if (!OverlayIndex.hasOverlay(var5.dy(), var1)) {
				return var17;
			} else {
				InputStream var6 = this.getClass().getResourceAsStream("/runelite/" + var5.dy() + "/" + var1);
				if (var6 == null) {
					client.logger.warn("Missing overlay data for {}/{}", var5.dy(), var1);
					return var17;
				} else {
					try {
						InputStream var7 = this.getClass().getResourceAsStream("/runelite/" + var5.dy() + "/" + var1 + ".hash");

						try {
							if (var4 == null) {
								if (var7 != null) {
									client.logger.warn("Hash file for non existing archive {}/{}", var5.dy(), var1);
									return null;
								} else {
									client.logger.debug("Adding archive {}/{}", var5.dy(), var1);

									try {
										return ByteStreams.toByteArray(var6);
									} catch (IOException var56) {
										client.logger.warn("error loading archive replacement", (Throwable)var56);
										return null;
									}
								}
							} else if (var7 == null) {
								client.logger.warn("Missing hash file for {}/{}", var5.dy(), var1);
								return var4;
							} else {
								HashCode var8 = Hashing.sha256().hashBytes(var4);
								String var9 = BaseEncoding.base16().encode(var8.asBytes());

								try {
									String var10 = CharStreams.toString(new InputStreamReader(var7));
									if (var10.equals(var9)) {
										client.logger.debug("Replacing archive {}/{}", var5.dy(), var1);
										return ByteStreams.toByteArray(var6);
									}

									client.logger.warn("Mismatch in overlaid cache archive hash for {}/{}: {} != {}", (Object[])(new Object[]{var5.dy(), var1, var10, var9}));
									this.lh_fld = true;
								} catch (IOException var55) {
									client.logger.warn("error checking hash", (Throwable)var55);
								}

								return var4;
							}
						} finally {
							if (var7 != null) {
								try {
									var7.close();
								} catch (IOException var54) {
									client.logger.warn(null, var54);
								}
							}
						}
					} finally {
						try {
							var6.close();
						} catch (IOException var53) {
							client.logger.warn(null, var53);
						}
					}
				}
			}
		} catch (Throwable var59) {
			throw new RuntimeException(var59);
		}
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Z"
	)
	public boolean cu(String var1, byte var2) {
		try {
			var1 = var1.toLowerCase();
			int var3 = yd.fx(this.bf_fld, ov.ar(var1));
			return this.dz(var3, -1080088275);
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("lu")
	@ObfuscatedSignature(
		descriptor = "(Lub;[BI)V"
	)
	public static void lu(ub var0, byte[] var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		int var4 = var1.length;
		int var3 = qa.bi(var1, 0, var4);
		var0.br_fld = var3;
		xi var5 = new xi(dn.bq(var1));
		int var6 = var5.cg();
		if (var6 >= 5 && var6 <= 7) {
			if (var6 >= 6) {
				var5.co((byte)-38);
			}

			int var7 = var5.cg();
			boolean var8 = 0 != (var7 & 1);
			boolean var9 = 0 != (var7 & 2);
			boolean var10 = (var7 & 4) != 0;
			boolean var11 = (var7 & 8) != 0;
			if (var9) {
				if (var2 == -1758388174) {
					throw new UnsupportedOperationException("");
				}
			} else if (var11) {
				throw new UnsupportedOperationException("");
			} else {
				if (var6 >= 7) {
					var0.bh_fld = var5.dq();
				} else {
					var0.bh_fld = var5.cm();
				}

				int var12 = 0;
				int var13 = -1;
				var0.bt_fld = new int[var0.bh_fld];
				if (var6 >= 7) {
					for (int var14 = 0; var14 < var0.bh_fld; var14++) {
						if (var2 != -1758388174) {
							return;
						}

						var0.bt_fld[var14] = var12 += var5.dq();
						if (var0.bt_fld[var14] > var13) {
							if (var2 != -1758388174) {
								return;
							}

							var13 = var0.bt_fld[var14];
						}
					}
				} else {
					for (int var22 = 0; var22 < var0.bh_fld; var22++) {
						var0.bt_fld[var22] = var12 += var5.cm();
						if (var0.bt_fld[var22] > var13) {
							var13 = var0.bt_fld[var22];
						}
					}
				}

				var0.bx_fld = -1782338937 * (1 + var13);
				var0.bp_fld = new int[var0.bx_fld];
				var0.bl_fld = new int[var0.bx_fld];
				var0.bo_fld = new int[var0.bx_fld];
				var0.bi_fld = new int[var0.bx_fld][];
				var0.bn_fld = (Object[])(new Object[var0.bx_fld]);
				var0.bc_fld = (Object[][])(new Object[var0.bx_fld][]);
				if (var8) {
					if (var2 != -1758388174) {
						return;
					}

					var0.bk_fld = new int[var0.bx_fld];
					Arrays.fill(var0.bk_fld, -1);

					for (int var23 = 0; var23 < var0.bh_fld; var23++) {
						var0.bk_fld[var0.bt_fld[var23]] = var5.co((byte)-99);
					}

					var0.bf_fld = new yd(var0.bk_fld);
				}

				for (int var24 = 0; var24 < var0.bh_fld; var24++) {
					var0.bp_fld[var0.bt_fld[var24]] = var5.co((byte)-110);
				}

				if (var10) {
					var0.bj_fld = new int[var0.bx_fld];
					var0.by_fld = new int[var0.bx_fld];

					for (int var25 = 0; var25 < var0.bh_fld; var25++) {
						var0.bj_fld[var0.bt_fld[var25]] = var5.co((byte)-115);
						var0.by_fld[var0.bt_fld[var25]] = var5.co((byte)-65);
					}
				}

				for (int var26 = 0; var26 < var0.bh_fld; var26++) {
					var0.bl_fld[var0.bt_fld[var26]] = var5.co((byte)-122);
				}

				if (var6 >= 7) {
					for (int var27 = 0; var27 < var0.bh_fld; var27++) {
						var0.bo_fld[var0.bt_fld[var27]] = var5.dq();
					}

					for (int var28 = 0; var28 < var0.bh_fld; var28++) {
						int var15 = var0.bt_fld[var28];
						int var16 = var0.bo_fld[var15];
						var12 = 0;
						int var17 = -1;
						var0.bi_fld[var15] = new int[var16];

						for (int var18 = 0; var18 < var16; var18++) {
							if (var2 != -1758388174) {
								return;
							}

							int var19 = var0.bi_fld[var15][var18] = var12 += var5.dq();
							if (var19 > var17) {
								var17 = var19;
							}
						}

						var0.bc_fld[var15] = (Object[])(new Object[1 + var17]);
					}
				} else {
					for (int var29 = 0; var29 < var0.bh_fld; var29++) {
						var0.bo_fld[var0.bt_fld[var29]] = var5.cm();
					}

					for (int var30 = 0; var30 < var0.bh_fld; var30++) {
						int var32 = var0.bt_fld[var30];
						int var34 = var0.bo_fld[var32];
						var12 = 0;
						int var36 = -1;
						var0.bi_fld[var32] = new int[var34];

						for (int var38 = 0; var38 < var34; var38++) {
							int var40 = var0.bi_fld[var32][var38] = var12 += var5.cm();
							if (var40 > var36) {
								var36 = var40;
							}
						}

						var0.bc_fld[var32] = (Object[])(new Object[1 + var36]);
					}
				}

				if (var8) {
					var0.bv_fld = new int[1 + var13][];
					var0.bu_fld = new yd[var13 + 1];

					for (int var31 = 0; var31 < var0.bh_fld; var31++) {
						int var33 = var0.bt_fld[var31];
						int var35 = var0.bo_fld[var33];
						var0.bv_fld[var33] = new int[var0.bc_fld[var33].length];
						Arrays.fill(var0.bv_fld[var33], -1);

						for (int var37 = 0; var37 < var35; var37++) {
							if (var2 != -1758388174) {
								return;
							}

							int var39 = null != var0.bi_fld[var33] ? var0.bi_fld[var33][var37] : var37;
							var0.bv_fld[var33][var39] = var5.co((byte)-32);
						}

						var0.bu_fld[var33] = new yd(var0.bv_fld[var33]);
					}
				}
			}
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("og")
	@ObfuscatedSignature(
		descriptor = "(I[I)Z"
	)
	public boolean og(int var1, int[] var2) {
		return this.cw(var1, var2, (byte)8);
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(III)[B"
	)
	public byte[] cx(int var1, int var2, int var3) {
		try {
			if (var1 >= 0 && var1 < this.bc_fld.length && this.bc_fld[var1] != null && var2 >= 0 && var2 < this.bc_fld[var1].length) {
				Object var4 = this.bc_fld[var1][var2];
				if (var4 == null) {
					synchronized (this) {
						Object var6 = this.bn_fld[var1];
						if (var6 == null) {
							this.ls(var1);
						}

						this.og(var1, null);
						var4 = this.bc_fld[var1][var2];
					}
				}

				return var4 == null ? null : so(var4, false);
			} else {
				return null;
			}
		} catch (Throwable var10) {
			throw new RuntimeException(var10);
		}
	}

	@ObfuscatedName("rv")
	@ObfuscatedSignature(
		descriptor = "(I[I)V"
	)
	public void rv(int var1, int[] var2) {
		if (this.be_fld && this.bn_fld[var1] == null && this.dh_fld instanceof zx) {
			((zx)this.dh_fld).lx();
		}

		this.dh_fld = null;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void ab(int var1) {
		try {
			;
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean dr(int var1) {
		try {
			if (this.bn_fld[var1] != null) {
				return true;
			} else {
				this.av(var1, 537700558);
				return null != this.bn_fld[var1];
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void at(int var1) {
		try {
			;
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int bx(int var1) {
		return this.bn_fld[var1] != null ? 100 : 0;
	}

	@ObfuscatedName("loadData")
	@ObfuscatedSignature(
		descriptor = "(II)[B"
	)
	@Export("loadData")
	@Override
	public byte[] loadData(int var1, int var2) {
		try {
			return this.bb(var1, var2, 584982574);
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int bo(int var1) {
		return this.bn_fld[var1] != null ? 100 : 0;
	}

	@ObfuscatedName("ee")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;)Z"
	)
	public boolean ee(String var1, String var2) {
		try {
			var1 = var1.toLowerCase();
			var2 = var2.toLowerCase();
			int var3 = yd.fx(this.bf_fld, ov.ar(var1));
			int var4 = yd.fx(this.bu_fld[var3], ov.ar(var2));
			return this.cc(var3, var4, -1077884039);
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("fa")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)I"
	)
	public int fa(String var1) {
		var1 = var1.toLowerCase();
		int var2 = yd.fx(this.bf_fld, ov.ar(var1));
		return this.ar(var2, -8656200);
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "([B)[B"
	)
	static final byte[] cj(byte[] var0) {
		xi var1 = new xi(var0);
		int var2 = var1.cg();
		int var3 = var1.co((byte)1);
		if (var3 >= 0 && (0 == bd_fld || var3 <= bd_fld)) {
			if (0 == var2) {
				byte[] var6 = new byte[var3];
				var1.dh(var6, 0, var3);
				return var6;
			} else {
				int var4 = var1.co((byte)-82);
				if (var4 >= 0 && (-358824554 * bd_fld == 0 || var4 <= bd_fld)) {
					byte[] var5 = new byte[var4];
					if (1 == var2) {
						xn.ak(var5, var4, var0, var3, 9);
					} else {
						aat.un(bz_fld, var1, var5, -344756709);
					}

					return var5;
				} else {
					throw new RuntimeException();
				}
			}
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("isOverlayOutdated")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Export("isOverlayOutdated")
	@Override
	public boolean isOverlayOutdated() {
		return this.lh_fld;
	}

	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "(II[I)[B"
	)
	byte[] dv(int var1, int var2, int[] var3) {
		try {
			if (var1 >= 0 && var1 < this.bc_fld.length && null != this.bc_fld[var1] && var2 >= 0 && var2 < this.bc_fld[var1].length) {
				if (this.bc_fld[var1][var2] == null) {
					boolean var4 = this.cw(var1, var3, (byte)8);
					if (!var4) {
						this.av(var1, 901265219);
						var4 = this.cw(var1, var3, (byte)8);
						if (!var4) {
							return null;
						}
					}
				}

				byte[] var8 = im.ak(this.bc_fld[var1][var2], false);
				if (this.bs_fld) {
					this.bc_fld[var1][var2] = null;
				}

				return var8;
			} else {
				return null;
			}
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("xk")
	@ObfuscatedSignature(
		descriptor = "(Lub;IB)[B"
	)
	public static byte[] xk(ub var0, int var1, byte var2) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			if (1 == var0.bc_fld.length) {
				return var0.bb(0, var1, 584982574);
			} else if (var0.bc_fld[var1].length == 1) {
				return var0.bb(var1, 0, 584982574);
			} else {
				throw new RuntimeException();
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("vm")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;)[B"
	)
	public byte[] vm(String var1, String var2) {
		try {
			return this.cb(var1, var2, (byte)30);
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "([B)V"
	)
	void ct(byte[] var1) {
		int var3 = var1.length;
		int var2 = qa.bi(var1, 0, var3);
		this.br_fld = var2;
		xi var4 = new xi(dn.bq(var1));
		int var5 = var4.cg();
		if (var5 >= 5 && var5 <= 7) {
			if (var5 >= 6) {
				var4.co((byte)-103);
			}

			int var6 = var4.cg();
			boolean var7 = 0 != (var6 & 1);
			boolean var8 = 0 != (var6 & 2);
			boolean var9 = (var6 & 4) != 0;
			boolean var10 = (var6 & 8) != 0;
			if (var8) {
				throw new UnsupportedOperationException("");
			} else if (var10) {
				throw new UnsupportedOperationException("");
			} else {
				if (var5 >= 7) {
					this.bh_fld = var4.dq();
				} else {
					this.bh_fld = var4.cm();
				}

				int var11 = 0;
				int var12 = -1;
				this.bt_fld = new int[this.bh_fld];
				if (var5 >= 7) {
					for (int var13 = 0; var13 < this.bh_fld; var13++) {
						this.bt_fld[var13] = var11 += var4.dq();
						if (this.bt_fld[var13] > var12) {
							var12 = this.bt_fld[var13];
						}
					}
				} else {
					for (int var21 = 0; var21 < this.bh_fld; var21++) {
						this.bt_fld[var21] = var11 += var4.cm();
						if (this.bt_fld[var21] > var12) {
							var12 = this.bt_fld[var21];
						}
					}
				}

				this.bx_fld = -1782338937 * (1 + var12);
				this.bp_fld = new int[this.bx_fld];
				this.bl_fld = new int[this.bx_fld];
				this.bo_fld = new int[this.bx_fld];
				this.bi_fld = new int[this.bx_fld][];
				this.bn_fld = (Object[])(new Object[this.bx_fld]);
				this.bc_fld = (Object[][])(new Object[this.bx_fld][]);
				if (var7) {
					this.bk_fld = new int[this.bx_fld];
					Arrays.fill(this.bk_fld, -1);

					for (int var22 = 0; var22 < this.bh_fld; var22++) {
						this.bk_fld[this.bt_fld[var22]] = var4.co((byte)-110);
					}

					this.bf_fld = new yd(this.bk_fld);
				}

				for (int var23 = 0; var23 < this.bh_fld; var23++) {
					this.bp_fld[this.bt_fld[var23]] = var4.co((byte)-81);
				}

				if (var9) {
					this.bj_fld = new int[this.bx_fld];
					this.by_fld = new int[this.bx_fld];

					for (int var24 = 0; var24 < this.bh_fld; var24++) {
						this.bj_fld[this.bt_fld[var24]] = var4.co((byte)-41);
						this.by_fld[this.bt_fld[var24]] = var4.co((byte)-97);
					}
				}

				for (int var25 = 0; var25 < this.bh_fld; var25++) {
					this.bl_fld[this.bt_fld[var25]] = var4.co((byte)-64);
				}

				if (var5 >= 7) {
					for (int var26 = 0; var26 < this.bh_fld; var26++) {
						this.bo_fld[this.bt_fld[var26]] = var4.dq();
					}

					for (int var27 = 0; var27 < this.bh_fld; var27++) {
						int var14 = this.bt_fld[var27];
						int var15 = this.bo_fld[var14];
						var11 = 0;
						int var16 = -1;
						this.bi_fld[var14] = new int[var15];

						for (int var17 = 0; var17 < var15; var17++) {
							int var18 = this.bi_fld[var14][var17] = var11 += var4.dq();
							if (var18 > var16) {
								var16 = var18;
							}
						}

						this.bc_fld[var14] = (Object[])(new Object[1 + var16]);
					}
				} else {
					for (int var28 = 0; var28 < this.bh_fld; var28++) {
						this.bo_fld[this.bt_fld[var28]] = var4.cm();
					}

					for (int var29 = 0; var29 < this.bh_fld; var29++) {
						int var31 = this.bt_fld[var29];
						int var33 = this.bo_fld[var31];
						var11 = 0;
						int var35 = -1;
						this.bi_fld[var31] = new int[var33];

						for (int var37 = 0; var37 < var33; var37++) {
							int var39 = this.bi_fld[var31][var37] = var11 += var4.cm();
							if (var39 > var35) {
								var35 = var39;
							}
						}

						this.bc_fld[var31] = (Object[])(new Object[1 + var35]);
					}
				}

				if (var7) {
					this.bv_fld = new int[1 + var12][];
					this.bu_fld = new yd[var12 + 1];

					for (int var30 = 0; var30 < this.bh_fld; var30++) {
						int var32 = this.bt_fld[var30];
						int var34 = this.bo_fld[var32];
						this.bv_fld[var32] = new int[this.bc_fld[var32].length];
						Arrays.fill(this.bv_fld[var32], -1);

						for (int var36 = 0; var36 < var34; var36++) {
							int var38 = null != this.bi_fld[var32] ? this.bi_fld[var32][var36] : var36;
							this.bv_fld[var32][var38] = var4.co((byte)-62);
						}

						this.bu_fld[var32] = new yd(this.bv_fld[var32]);
					}
				}
			}
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(II)[B"
	)
	public byte[] cl(int var1, int var2) {
		try {
			return this.cd(var1, var2, null, -1307803951);
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "([B)[B"
	)
	static final byte[] ch(byte[] var0) {
		xi var1 = new xi(var0);
		int var2 = var1.cg();
		int var3 = var1.co((byte)-33);
		if (var3 >= 0 && (0 == bd_fld || var3 <= bd_fld)) {
			if (0 == var2) {
				byte[] var6 = new byte[var3];
				var1.dh(var6, 0, var3);
				return var6;
			} else {
				int var4 = var1.co((byte)-46);
				if (var4 >= 0 && (bd_fld == 0 || var4 <= bd_fld)) {
					byte[] var5 = new byte[var4];
					if (1 == var2) {
						xn.ak(var5, var4, var0, var3, 9);
					} else {
						aat.un(bz_fld, var1, var5, -1031875433);
					}

					return var5;
				} else {
					throw new RuntimeException();
				}
			}
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	public boolean cq(int var1, int var2) {
		try {
			if (var1 >= 0 && var1 < this.bc_fld.length && this.bc_fld[var1] != null && var2 >= 0 && var2 < this.bc_fld[var1].length) {
				if (this.bc_fld[var1][var2] != null) {
					return true;
				} else if (null != this.bn_fld[var1]) {
					return true;
				} else {
					this.av(var1, -311458114);
					return null != this.bn_fld[var1];
				}
			} else {
				return false;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	public boolean dt(int var1, int var2) {
		try {
			if (var1 >= 0 && var1 < this.bc_fld.length && this.bc_fld[var1] != null && var2 >= 0 && var2 < this.bc_fld[var1].length) {
				if (this.bc_fld[var1][var2] != null) {
					return true;
				} else if (null != this.bn_fld[var1]) {
					return true;
				} else {
					this.av(var1, 1693572908);
					return null != this.bn_fld[var1];
				}
			} else {
				return false;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean dq(int var1) {
		try {
			if (this.bc_fld.length == 1) {
				return this.cc(0, var1, -1834554610);
			} else if (this.bc_fld[var1].length == 1) {
				return this.cc(var1, 0, -1509295503);
			} else {
				throw new RuntimeException();
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void ap(int var1) {
		try {
			;
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean dd(int var1) {
		try {
			if (this.bn_fld[var1] != null) {
				return true;
			} else {
				this.av(var1, 85123600);
				return null != this.bn_fld[var1];
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean dl(int var1) {
		try {
			if (this.bn_fld[var1] != null) {
				return true;
			} else {
				this.av(var1, -144732567);
				return null != this.bn_fld[var1];
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("wk")
	@ObfuscatedSignature(
		descriptor = "(Lub;Ljava/lang/String;I)I"
	)
	public static int wk(ub var0, String var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		var1 = var1.toLowerCase();
		int var3 = yd.fx(var0.bf_fld, ov.ar(var1));
		return var0.ar(var3, -8656200);
	}

	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "(II)[B"
	)
	public byte[] dw(int var1, int var2) {
		try {
			if (var1 >= 0 && var1 < this.bc_fld.length && this.bc_fld[var1] != null && var2 >= 0 && var2 < this.bc_fld[var1].length) {
				if (this.bc_fld[var1][var2] == null) {
					boolean var3 = this.cw(var1, null, (byte)8);
					if (!var3) {
						this.av(var1, 617887941);
						var3 = this.cw(var1, null, (byte)8);
						if (!var3) {
							return null;
						}
					}
				}

				return im.ak(this.bc_fld[var1][var2], false);
			} else {
				return null;
			}
		} catch (Throwable var5) {
			throw new RuntimeException(var5);
		}
	}

	@ObfuscatedName("wf")
	@ObfuscatedSignature(
		descriptor = "(Lub;I)[I"
	)
	public static int[] wf(ub var0, int var1) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			return var1 >= 0 && var1 < var0.bi_fld.length ? var0.bi_fld[var1] : null;
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "(I)[B"
	)
	public byte[] dn(int var1) {
		try {
			if (1 == this.bc_fld.length) {
				return this.cx(0, var1, -1077893755);
			} else if (this.bc_fld[var1].length == 1) {
				return this.cx(var1, 0, -393119321);
			} else {
				throw new RuntimeException();
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean dk() {
		try {
			boolean var1 = true;

			for (int var2 = 0; var2 < this.bt_fld.length; var2++) {
				int var3 = this.bt_fld[var2];
				if (null == this.bn_fld[var3]) {
					this.av(var3, 935002590);
					if (null == this.bn_fld[var3]) {
						var1 = false;
					}
				}
			}

			return var1;
		} catch (Throwable var5) {
			throw new RuntimeException(var5);
		}
	}

	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)I"
	)
	public int df(String var1) {
		return this.cm(var1, (byte)1);
	}

	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean dx() {
		try {
			boolean var1 = true;

			for (int var2 = 0; var2 < this.bt_fld.length; var2++) {
				int var3 = this.bt_fld[var2];
				if (null == this.bn_fld[var3]) {
					this.av(var3, -1187267722);
					if (null == this.bn_fld[var3]) {
						var1 = false;
					}
				}
			}

			return var1;
		} catch (Throwable var5) {
			throw new RuntimeException(var5);
		}
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z"
	)
	public boolean co(String var1, String var2, int var3) {
		try {
			var1 = var1.toLowerCase();
			var2 = var2.toLowerCase();
			int var4 = yd.fx(this.bf_fld, ov.ar(var1));
			int var5 = yd.fx(this.bu_fld[var4], ov.ar(var2));
			return this.cc(var4, var5, 708241424);
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "(I)[B"
	)
	public byte[] du(int var1) {
		try {
			if (1 == this.bc_fld.length) {
				return this.bb(0, var1, 584982574);
			} else if (this.bc_fld[var1].length == 1) {
				return this.bb(var1, 0, 584982574);
			} else {
				throw new RuntimeException();
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("km")
	@ObfuscatedSignature(
		descriptor = "(Lub;I)I"
	)
	public static int km(ub var0, int var1) {
		return var0.bc_fld != null && var1 < var0.bc_fld.length && null != var0.bc_fld[var1] ? var0.bc_fld[var1].length : 0;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lub;Ljava/lang/String;Ljava/lang/String;)Z"
	)
	public static boolean af(ub var0, String var1, String var2) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			var1 = var1.toLowerCase();
			var2 = var2.toLowerCase();
			int var3 = yd.fx(var0.bf_fld, ov.ar(var1));
			if (var3 < 0) {
				return false;
			} else {
				int var4 = yd.fx(var0.bu_fld[var3], ov.ar(var2));
				return var4 >= 0;
			}
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	public boolean cv(int var1, int var2) {
		try {
			if (this.bc_fld.length == 1) {
				return this.cc(0, var1, -34832221);
			} else if (this.bc_fld[var1].length == 1) {
				return this.cc(var1, 0, 1327912053);
			} else {
				throw new RuntimeException();
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int bp(int var1) {
		return this.bn_fld[var1] != null ? 100 : 0;
	}

	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "(II)[B"
	)
	public byte[] dy(int var1, int var2) {
		try {
			if (var1 >= 0 && var1 < this.bc_fld.length && this.bc_fld[var1] != null && var2 >= 0 && var2 < this.bc_fld[var1].length) {
				if (this.bc_fld[var1][var2] == null) {
					boolean var3 = this.cw(var1, null, (byte)8);
					if (!var3) {
						this.av(var1, -394713318);
						var3 = this.cw(var1, null, (byte)8);
						if (!var3) {
							return null;
						}
					}
				}

				return im.ak(this.bc_fld[var1][var2], false);
			} else {
				return null;
			}
		} catch (Throwable var5) {
			throw new RuntimeException(var5);
		}
	}

	@ObfuscatedName("ls")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void ls(int var1) {
		try {
			this.av(var1, 847562619);
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "(I)[B"
	)
	public byte[] di(int var1) {
		try {
			if (1 == this.bc_fld.length) {
				return this.cx(0, var1, -1296117240);
			} else if (this.bc_fld[var1].length == 1) {
				return this.cx(var1, 0, -1164983132);
			} else {
				throw new RuntimeException();
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "(I)[B"
	)
	public byte[] db(int var1) {
		try {
			if (1 == this.bc_fld.length) {
				return this.bb(0, var1, 584982574);
			} else if (this.bc_fld[var1].length == 1) {
				return this.bb(var1, 0, 584982574);
			} else {
				throw new RuntimeException();
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("in")
	@ObfuscatedSignature(
		descriptor = "(II[I)[B"
	)
	public byte[] in(int var1, int var2, int[] var3) {
		try {
			return this.cd(var1, var2, var3, 1009611161);
		} catch (Throwable var5) {
			throw new RuntimeException(var5);
		}
	}

	ub(boolean var1, boolean var2) {
		this.be_fld = var1;
		this.bs_fld = var2;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(Lub;Ljava/lang/String;Ljava/lang/String;)Z"
	)
	public static boolean bt(ub var0, String var1, String var2) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			var1 = var1.toLowerCase();
			var2 = var2.toLowerCase();
			int var3 = yd.fx(var0.bf_fld, ov.ar(var1));
			int var4 = yd.fx(var0.bu_fld[var3], ov.ar(var2));
			return var0.cc(var3, var4, 63309090);
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int dp(int var1) {
		return this.bc_fld != null && var1 < this.bc_fld.length && null != this.bc_fld[var1] ? this.bc_fld[var1].length : 0;
	}

	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "(I)[B"
	)
	public byte[] ds(int var1) {
		try {
			if (1 == this.bc_fld.length) {
				return this.bb(0, var1, 584982574);
			} else if (this.bc_fld[var1].length == 1) {
				return this.bb(var1, 0, 584982574);
			} else {
				throw new RuntimeException();
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("ep")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ep() {
		return this.bx_fld;
	}

	@ObfuscatedName("eb")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int eb() {
		return this.bx_fld;
	}

	@ObfuscatedName("ed")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ed() {
		return this.bx_fld;
	}

	@ObfuscatedName("et")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void et() {
		for (int var1 = 0; var1 < this.bn_fld.length; var1++) {
			this.bn_fld[var1] = null;
		}
	}

	@ObfuscatedName("xd")
	@ObfuscatedSignature(
		descriptor = "(Lub;Ljava/lang/String;)I"
	)
	public static int xd(ub var0, String var1) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			var1 = var1.toLowerCase();
			int var2 = yd.fx(var0.bf_fld, ov.ar(var1));
			return var0.ar(var2, -8656200);
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("ew")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void ew(int var1) {
		for (int var2 = 0; var2 < this.bc_fld[var1].length; var2++) {
			this.bc_fld[var1][var2] = null;
		}
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void ca(int var1, int var2) {
		for (int var3 = 0; var3 < this.bc_fld[var1].length; var3++) {
			if (this.bc_fld[var1][var3] instanceof zx) {
				((zx)this.bc_fld[var1][var3]).lx();
			}

			this.bc_fld[var1][var3] = null;
		}
	}

	@ObfuscatedName("hm")
	@ObfuscatedSignature(
		descriptor = "(Lub;I)I"
	)
	public static int hm(ub var0, int var1) {
		return var0.bc_fld != null && var1 < var0.bc_fld.length && null != var0.bc_fld[var1] ? var0.bc_fld[var1].length : 0;
	}

	@ObfuscatedName("eo")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void eo() {
		for (int var1 = 0; var1 < this.bc_fld.length; var1++) {
			if (null != this.bc_fld[var1]) {
				for (int var2 = 0; var2 < this.bc_fld[var1].length; var2++) {
					this.bc_fld[var1][var2] = null;
				}
			}
		}
	}

	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ec() {
		for (int var1 = 0; var1 < this.bc_fld.length; var1++) {
			if (null != this.bc_fld[var1]) {
				for (int var2 = 0; var2 < this.bc_fld[var1].length; var2++) {
					this.bc_fld[var1][var2] = null;
				}
			}
		}
	}

	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "(I[I)Z"
	)
	boolean ez(int var1, int[] var2) {
		if (null == this.bn_fld[var1]) {
			return false;
		} else {
			int var3 = this.bo_fld[var1];
			int[] var4 = this.bi_fld[var1];
			Object[] var5 = (Object[])this.bc_fld[var1];
			boolean var6 = true;

			for (int var7 = 0; var7 < var3; var7++) {
				if (null == var5[var4[var7]]) {
					var6 = false;
					break;
				}
			}

			if (var6) {
				return true;
			} else {
				byte[] var21;
				if (null == var2 || var2[0] == 0 && 0 == var2[1] && var2[2] == 0 && var2[3] == 0) {
					var21 = im.ak(this.bn_fld[var1], false);
				} else {
					var21 = im.ak(this.bn_fld[var1], true);
					xi var8 = new xi(var21);
					xi.wt(var8, var2, 5, var8.al_fld.length);
				}

				byte[] var22 = dn.bq(var21);
				if (this.be_fld) {
					this.bn_fld[var1] = null;
				}

				if (var3 > 1) {
					int var9 = var22.length;
					int var10 = var22[--var9] & 255;
					var9 -= 4 * var10 * var3;
					xi var11 = new xi(var22);
					int[] var12 = new int[var3];
					var11.au_fld = var9;

					for (int var13 = 0; var13 < var10; var13++) {
						int var14 = 0;

						for (int var15 = 0; var15 < var3; var15++) {
							var14 += var11.co((byte)-117);
							var12[var15] += var14;
						}
					}

					byte[][] var28 = new byte[var3][];

					for (int var29 = 0; var29 < var3; var29++) {
						var28[var29] = new byte[var12[var29]];
						var12[var29] = 0;
					}

					var11.au_fld = var9 * 1739264561;
					int var30 = 0;

					for (int var31 = 0; var31 < var10; var31++) {
						int var16 = 0;

						for (int var17 = 0; var17 < var3; var17++) {
							var16 += var11.co((byte)-89);
							System.arraycopy(var22, var30, var28[var17], var12[var17], var16);
							var12[var17] += var16;
							var30 += var16;
						}
					}

					for (int var32 = 0; var32 < var3; var32++) {
						if (!this.bs_fld) {
							int var33 = var4[var32];
							byte[] var19 = var28[var32];
							Object var18;
							if (var19 == null) {
								var18 = null;
							} else if (var19.length > 136) {
								zx var20 = new zx();
								var20.az(var19, (byte)-47);
								var18 = var20;
							} else {
								var18 = var19;
							}

							var5[var33] = var18;
						} else {
							var5[var4[var32]] = var28[var32];
						}
					}
				} else if (!this.bs_fld) {
					int var25 = var4[0];
					Object var26;
					if (null == var22) {
						var26 = null;
					} else if (var22.length > -2027189512) {
						zx var27 = new zx();
						var27.az(var22, (byte)-98);
						var26 = var27;
					} else {
						var26 = var22;
					}

					var5[var25] = var26;
				} else {
					var5[var4[0]] = var22;
				}

				return true;
			}
		}
	}

	@ObfuscatedName("er")
	@ObfuscatedSignature(
		descriptor = "(I[I)Z"
	)
	boolean er(int var1, int[] var2) {
		if (null == this.bn_fld[var1]) {
			return false;
		} else {
			int var3 = this.bo_fld[var1];
			int[] var4 = this.bi_fld[var1];
			Object[] var5 = (Object[])this.bc_fld[var1];
			boolean var6 = true;

			for (int var7 = 0; var7 < var3; var7++) {
				if (null == var5[var4[var7]]) {
					var6 = false;
					break;
				}
			}

			if (var6) {
				return true;
			} else {
				byte[] var21;
				if (null == var2 || var2[0] == 0 && 0 == var2[1] && var2[2] == 0 && var2[3] == 0) {
					var21 = im.ak(this.bn_fld[var1], false);
				} else {
					var21 = im.ak(this.bn_fld[var1], true);
					xi var8 = new xi(var21);
					xi.wt(var8, var2, 5, var8.al_fld.length);
				}

				byte[] var22 = dn.bq(var21);
				if (this.be_fld) {
					this.bn_fld[var1] = null;
				}

				if (var3 > 1) {
					int var9 = var22.length;
					int var10 = var22[--var9] & 255;
					var9 -= 4 * var10 * var3;
					xi var11 = new xi(var22);
					int[] var12 = new int[var3];
					var11.au_fld = var9;

					for (int var13 = 0; var13 < var10; var13++) {
						int var14 = 0;

						for (int var15 = 0; var15 < var3; var15++) {
							var14 += var11.co((byte)-14);
							var12[var15] += var14;
						}
					}

					byte[][] var28 = new byte[var3][];

					for (int var29 = 0; var29 < var3; var29++) {
						var28[var29] = new byte[var12[var29]];
						var12[var29] = 0;
					}

					var11.au_fld = var9;
					int var30 = 0;

					for (int var31 = 0; var31 < var10; var31++) {
						int var16 = 0;

						for (int var17 = 0; var17 < var3; var17++) {
							var16 += var11.co((byte)-123);
							System.arraycopy(var22, var30, var28[var17], var12[var17], var16);
							var12[var17] += var16;
							var30 += var16;
						}
					}

					for (int var32 = 0; var32 < var3; var32++) {
						if (!this.bs_fld) {
							int var33 = var4[var32];
							byte[] var19 = var28[var32];
							Object var18;
							if (var19 == null) {
								var18 = null;
							} else if (var19.length > 136) {
								zx var20 = new zx();
								var20.az(var19, (byte)-1);
								var18 = var20;
							} else {
								var18 = var19;
							}

							var5[var33] = var18;
						} else {
							var5[var4[var32]] = var28[var32];
						}
					}
				} else if (!this.bs_fld) {
					int var25 = var4[0];
					Object var26;
					if (null == var22) {
						var26 = null;
					} else if (var22.length > 136) {
						zx var27 = new zx();
						var27.az(var22, (byte)-12);
						var26 = var27;
					} else {
						var26 = var22;
					}

					var5[var25] = var26;
				} else {
					var5[var4[0]] = var22;
				}

				return true;
			}
		}
	}

	@ObfuscatedName("en")
	@ObfuscatedSignature(
		descriptor = "(I[I)Z"
	)
	boolean en(int var1, int[] var2) {
		if (null == this.bn_fld[var1]) {
			return false;
		} else {
			int var3 = this.bo_fld[var1];
			int[] var4 = this.bi_fld[var1];
			Object[] var5 = (Object[])this.bc_fld[var1];
			boolean var6 = true;

			for (int var7 = 0; var7 < var3; var7++) {
				if (null == var5[var4[var7]]) {
					var6 = false;
					break;
				}
			}

			if (var6) {
				return true;
			} else {
				byte[] var21;
				if (null == var2 || var2[0] == 0 && 0 == var2[1] && var2[2] == 0 && var2[3] == 0) {
					var21 = im.ak(this.bn_fld[var1], false);
				} else {
					var21 = im.ak(this.bn_fld[var1], true);
					xi var8 = new xi(var21);
					xi.wt(var8, var2, 5, var8.al_fld.length);
				}

				byte[] var22 = dn.bq(var21);
				if (this.be_fld) {
					this.bn_fld[var1] = null;
				}

				if (var3 > 1) {
					int var9 = var22.length;
					int var10 = var22[--var9] & 255;
					var9 -= 4 * var10 * var3;
					xi var11 = new xi(var22);
					int[] var12 = new int[var3];
					var11.au_fld = var9;

					for (int var13 = 0; var13 < var10; var13++) {
						int var14 = 0;

						for (int var15 = 0; var15 < var3; var15++) {
							var14 += var11.co((byte)-121);
							var12[var15] += var14;
						}
					}

					byte[][] var28 = new byte[var3][];

					for (int var29 = 0; var29 < var3; var29++) {
						var28[var29] = new byte[var12[var29]];
						var12[var29] = 0;
					}

					var11.au_fld = var9 * 1838868861;
					int var30 = 0;

					for (int var31 = 0; var31 < var10; var31++) {
						int var16 = 0;

						for (int var17 = 0; var17 < var3; var17++) {
							var16 += var11.co((byte)-32);
							System.arraycopy(var22, var30, var28[var17], var12[var17], var16);
							var12[var17] += var16;
							var30 += var16;
						}
					}

					for (int var32 = 0; var32 < var3; var32++) {
						if (!this.bs_fld) {
							int var33 = var4[var32];
							byte[] var19 = var28[var32];
							Object var18;
							if (var19 == null) {
								var18 = null;
							} else if (var19.length > 1058178695) {
								zx var20 = new zx();
								var20.az(var19, (byte)-81);
								var18 = var20;
							} else {
								var18 = var19;
							}

							var5[var33] = var18;
						} else {
							var5[var4[var32]] = var28[var32];
						}
					}
				} else if (!this.bs_fld) {
					int var25 = var4[0];
					Object var26;
					if (null == var22) {
						var26 = null;
					} else if (var22.length > 136) {
						zx var27 = new zx();
						var27.az(var22, (byte)-57);
						var26 = var27;
					} else {
						var26 = var22;
					}

					var5[var25] = var26;
				} else {
					var5[var4[0]] = var22;
				}

				return true;
			}
		}
	}

	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;)I"
	)
	public int eg(int var1, String var2) {
		var2 = var2.toLowerCase();
		return yd.fx(this.bu_fld[var1], ov.ar(var2));
	}

	@ObfuscatedName("eq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;)[B"
	)
	public byte[] eq(String var1, String var2) {
		try {
			var1 = var1.toLowerCase();
			var2 = var2.toLowerCase();
			int var3 = yd.fx(this.bf_fld, ov.ar(var1));
			int var4 = yd.fx(this.bu_fld[var3], ov.ar(var2));
			return this.bb(var3, var4, 584982574);
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("ve")
	@ObfuscatedSignature(
		descriptor = "(Lub;Ljava/lang/String;Ljava/lang/String;)[B"
	)
	public static byte[] ve(ub var0, String var1, String var2) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			var1 = var1.toLowerCase();
			var2 = var2.toLowerCase();
			int var3 = yd.fx(var0.bf_fld, ov.ar(var1));
			int var4 = yd.fx(var0.bu_fld[var3], ov.ar(var2));
			return var0.bb(var3, var4, 584982574);
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(III)Z"
	)
	public boolean cc(int var1, int var2, int var3) {
		try {
			synchronized (this) {
				int var9 = 708241424;
				boolean var10000;
				if (var1 >= 0 && var1 < this.bc_fld.length && this.bc_fld[var1] != null && var2 >= 0 && var2 < this.bc_fld[var1].length) {
					if (this.bc_fld[var1][var2] != null) {
						boolean var12 = true;
						var10000 = var12;
					} else if (null != this.bn_fld[var1]) {
						boolean var13 = true;
						var10000 = var13;
					} else {
						this.av(var1, -472132262);
						if (null != this.bn_fld[var1]) {
							boolean var14 = true;
							var10000 = var14;
						} else {
							boolean var15 = false;
							var10000 = var15;
						}
					}
				} else {
					boolean var6 = false;
					var10000 = var6;
				}

				return var10000;
			}
		} catch (Throwable var11) {
			throw new RuntimeException(var11);
		}
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int bt(int var1) {
		return this.bn_fld[var1] != null ? 2064670342 : 0;
	}

	@ObfuscatedName("ev")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;)Z"
	)
	public boolean ev(String var1, String var2) {
		try {
			var1 = var1.toLowerCase();
			var2 = var2.toLowerCase();
			int var3 = yd.fx(this.bf_fld, ov.ar(var1));
			int var4 = yd.fx(this.bu_fld[var3], ov.ar(var2));
			return this.cc(var3, var4, 1505973679);
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("em")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)Z"
	)
	public boolean em(String var1) {
		try {
			var1 = var1.toLowerCase();
			int var2 = yd.fx(this.bf_fld, ov.ar(var1));
			return this.dz(var2, -1713678389);
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("el")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)I"
	)
	public int el(String var1) {
		var1 = var1.toLowerCase();
		int var2 = yd.fx(this.bf_fld, ov.ar(var1));
		return this.ar(var2, -8656200);
	}

	@ObfuscatedName("so")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Z)[B"
	)
	public static byte[] so(Object var0, boolean var1) {
		return im.ak(var0, var1);
	}

	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean da() {
		try {
			boolean var1 = true;

			for (int var2 = 0; var2 < this.bt_fld.length; var2++) {
				int var3 = this.bt_fld[var2];
				if (null == this.bn_fld[var3]) {
					this.av(var3, -475785038);
					if (null == this.bn_fld[var3]) {
						var1 = false;
					}
				}
			}

			return var1;
		} catch (Throwable var5) {
			throw new RuntimeException(var5);
		}
	}

	@ObfuscatedName("eu")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)I"
	)
	public int eu(String var1) {
		var1 = var1.toLowerCase();
		int var2 = yd.fx(this.bf_fld, ov.ar(var1));
		return this.ar(var2, -8656200);
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(B)Z"
	)
	public boolean cy(byte var1) {
		try {
			boolean var2 = true;

			for (int var3 = 0; var3 < this.bt_fld.length; var3++) {
				int var4 = this.bt_fld[var3];
				if (null == this.bn_fld[var4]) {
					this.av(var4, 1658240317);
					if (null == this.bn_fld[var4]) {
						var2 = false;
					}
				}
			}

			return var2;
		} catch (Throwable var5) {
			throw new RuntimeException(var5);
		}
	}

	@ObfuscatedName("fy")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)I"
	)
	public int fy(String var1) {
		var1 = var1.toLowerCase();
		int var2 = yd.fx(this.bf_fld, ov.ar(var1));
		return this.ar(var2, -8656200);
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(Lub;I)V"
	)
	public static void ca(ub var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		for (int var2 = 0; var2 < var0.bc_fld[var1].length; var2++) {
			var0.bc_fld[var1][var2] = null;
		}
	}

	@ObfuscatedName("getFileIds")
	@ObfuscatedSignature(
		descriptor = "(I)[I"
	)
	@Export("getFileIds")
	@Override
	public int[] getFileIds(int var1) {
		return this.cp(var1, (byte)93);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lub;II[I)[B"
	)
	public static byte[] av(ub var0, int var1, int var2, int[] var3) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			if (var1 >= 0 && var1 < var0.bc_fld.length && null != var0.bc_fld[var1] && var2 >= 0 && var2 < var0.bc_fld[var1].length) {
				if (var0.bc_fld[var1][var2] == null) {
					boolean var4 = var0.cw(var1, var3, (byte)8);
					if (!var4) {
						var0.av(var1, -752018241);
						var4 = var0.cw(var1, var3, (byte)8);
						if (!var4) {
							return null;
						}
					}
				}

				byte[] var8 = im.ak(var0.bc_fld[var1][var2], false);
				if (var0.bs_fld) {
					var0.bc_fld[var1][var2] = null;
				}

				return var8;
			} else {
				return null;
			}
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;)Z"
	)
	public boolean ea(String var1, String var2) {
		try {
			var1 = var1.toLowerCase();
			var2 = var2.toLowerCase();
			int var3 = yd.fx(this.bf_fld, ov.ar(var1));
			int var4 = yd.fx(this.bu_fld[var3], ov.ar(var2));
			return this.cc(var3, var4, -165906757);
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)J"
	)
	public static long ak(int var0, int var1) {
		return zc.ak_fld[var0];
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "([BI)V"
	)
	void bg(byte[] var1, int var2) {
		int var4 = var1.length;
		int var3 = qa.bi(var1, 0, var4);
		this.br_fld = var3;
		xi var5 = new xi(dn.bq(var1));
		int var6 = var5.ex();
		if (var6 >= 5 && var6 <= 7) {
			if (var6 >= 6) {
				var5.eq();
			}

			int var7 = var5.ei();
			boolean var8 = 0 != (var7 & 1);
			boolean var9 = 0 != (var7 & 2);
			boolean var10 = (var7 & 4) != 0;
			boolean var11 = (var7 & 8) != 0;
			if (var9) {
				if (var2 == -1758388174) {
					throw new UnsupportedOperationException("");
				}
			} else if (var11) {
				throw new UnsupportedOperationException("");
			} else {
				if (var6 >= 7) {
					this.bx_fld = var5.kz(-2037450677) * 580052529;
				} else {
					this.bx_fld = var5.ev() * 580052529;
				}

				int var12 = 0;
				int var13 = -1;
				this.bk_fld = new int[this.bh_fld];
				if (var6 >= 7) {
					for (int var14 = 0; var14 < this.bh_fld; var14++) {
						if (var2 != -1758388174) {
							return;
						}

						this.bt_fld[var14] = var12 += var5.cz();
						if (this.bl_fld[var14] > var13) {
							if (var2 != -1758388174) {
								return;
							}

							var13 = this.by_fld[var14];
						}
					}
				} else {
					for (int var22 = 0; var22 < this.bh_fld; var22++) {
						this.bl_fld[var22] = var12 += var5.da();
						if (this.bl_fld[var22] > var13) {
							var13 = this.bt_fld[var22];
						}
					}
				}

				this.bx_fld = -1782338937 * (1 + var13);
				this.by_fld = new int[this.bx_fld];
				this.bj_fld = new int[this.bx_fld];
				this.bl_fld = new int[203225911 * this.bh_fld];
				this.bv_fld = new int[this.bx_fld][];
				this.bn_fld = (Object[])(new Object[this.bh_fld * 203225911]);
				this.bc_fld = (Object[][])(new Object[this.bx_fld][]);
				if (var8) {
					if (var2 != -1758388174) {
						return;
					}

					this.bj_fld = new int[203225911 * this.bh_fld];
					Arrays.fill(this.bo_fld, -1);

					for (int var23 = 0; var23 < this.bh_fld; var23++) {
						this.bo_fld[this.bp_fld[var23]] = var5.cg();
					}

					this.bf_fld = new yd(this.bt_fld);
				}

				for (int var24 = 0; var24 < this.bh_fld; var24++) {
					this.bk_fld[this.bt_fld[var24]] = var5.ex();
				}

				if (var10) {
					this.bo_fld = new int[this.bx_fld];
					this.bt_fld = new int[this.bh_fld * 203225911];

					for (int var25 = 0; var25 < this.bx_fld; var25++) {
						this.bj_fld[this.bj_fld[var25]] = var5.co((byte)-115);
						this.bp_fld[this.by_fld[var25]] = var5.cg();
					}
				}

				for (int var26 = 0; var26 < this.bh_fld; var26++) {
					this.bk_fld[this.bk_fld[var26]] = var5.dv();
				}

				if (var6 >= 7) {
					for (int var27 = 0; var27 < this.bx_fld; var27++) {
						this.bo_fld[this.bk_fld[var27]] = var5.ef();
					}

					for (int var28 = 0; var28 < this.bx_fld; var28++) {
						int var15 = this.bt_fld[var28];
						int var16 = this.by_fld[var15];
						var12 = 0;
						int var17 = -1;
						this.bi_fld[var15] = new int[var16];

						for (int var18 = 0; var18 < var16; var18++) {
							if (var2 != -1758388174) {
								return;
							}

							int var19 = this.bv_fld[var15][var18] = var12 += var5.kv(-808327182);
							if (var19 > var17) {
								var17 = var19;
							}
						}

						this.bc_fld[var15] = (Object[])(new Object[1 + var17]);
					}
				} else {
					for (int var29 = 0; var29 < this.bh_fld; var29++) {
						this.bj_fld[this.by_fld[var29]] = var5.df();
					}

					for (int var30 = 0; var30 < this.bh_fld; var30++) {
						int var32 = this.bt_fld[var30];
						int var34 = this.bt_fld[var32];
						var12 = 0;
						int var36 = -1;
						this.bv_fld[var32] = new int[var34];

						for (int var38 = 0; var38 < var34; var38++) {
							int var40 = this.bv_fld[var32][var38] = var12 += var5.kz(793307965);
							if (var40 > var36) {
								var36 = var40;
							}
						}

						this.bc_fld[var32] = (Object[])(new Object[1 + var36]);
					}
				}

				if (var8) {
					this.bv_fld = new int[1 + var13][];
					this.bu_fld = new yd[var13 + 1];

					for (int var31 = 0; var31 < this.bx_fld; var31++) {
						int var33 = this.bk_fld[var31];
						int var35 = this.bt_fld[var33];
						this.bv_fld[var33] = new int[this.bc_fld[var33].length];
						Arrays.fill(this.bv_fld[var33], -1);

						for (int var37 = 0; var37 < var35; var37++) {
							if (var2 != -1758388174) {
								return;
							}

							int var39 = null != this.bv_fld[var33] ? this.bi_fld[var33][var37] : var37;
							this.bi_fld[var33][var39] = var5.dz();
						}

						this.bu_fld[var33] = new yd(this.bv_fld[var33]);
					}
				}
			}
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I"
	)
	public int ci(String var1, int var2) {
		var1 = var1.toLowerCase();
		int var3 = yd.fx(this.bf_fld, ov.ar(var1));
		return this.ar(var3, -8656200);
	}

	@ObfuscatedName("qi")
	@ObfuscatedSignature(
		descriptor = "(II)[B"
	)
	public byte[] qi(int var1, int var2) {
		try {
			return this.cx(var1, var2, -1870723940);
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(IB)[B"
	)
	public byte[] cf(int var1, byte var2) {
		try {
			if (1 == this.bc_fld.length) {
				return this.cx(0, var1, 584982574);
			} else if (this.bc_fld[var1].length == 1) {
				return this.cx(var1, 0, 584982574);
			} else {
				throw new RuntimeException();
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("ef")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;)Z"
	)
	public boolean ef(String var1, String var2) {
		try {
			var1 = var1.toLowerCase();
			var2 = var2.toLowerCase();
			int var3 = yd.fx(this.bf_fld, ov.ar(var1));
			int var4 = yd.fx(this.bu_fld[var3], ov.ar(var2));
			return this.cc(var3, var4, 63309090);
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}
}
