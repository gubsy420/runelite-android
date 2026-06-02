import java.io.EOFException;
import java.io.IOException;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("un")
public class un {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "[B"
	)
	static byte[] ak_fld = new byte[520];
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lzu;"
	)
	zu ag_fld = null;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lzu;"
	)
	zu az_fld = null;
	@ObfuscatedGetter(
		intValue = -1550002847
	)
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int av_fld;
	@ObfuscatedGetter(
		intValue = -1915433705
	)
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ae_fld = 1058288216;

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)[B"
	)
	public byte[] av(int var1) throws EOFException {
		synchronized (this.ag_fld) {
			byte[] var21;
			try {
				if (zu.gn(this.az_fld, -1783689324) < var1 * 6 + 6) {
					return null;
				}

				this.az_fld.af(var1 * 6);
				zu.oa(this.az_fld, ak_fld, 0, 6, 1535799479);
				int var3 = (ak_fld[2] & 255) + ((ak_fld[0] & 255) << 16) + ((ak_fld[1] & 255) << 8);
				int var4 = (ak_fld[5] & 255) + ((ak_fld[3] & 255) << 16) + ((ak_fld[4] & 255) << 8);
				if (var3 < 0 || var3 > this.ae_fld) {
					return null;
				}

				if (var4 <= 0 || var4 > zu.gn(this.ag_fld, -1936457947) / 520L) {
					return null;
				}

				byte[] var5 = new byte[var3];
				int var6 = 0;
				int var7 = 0;

				while (var6 < var3) {
					if (0 == var4) {
						return null;
					}

					this.ag_fld.af(var4 * 520L);
					int var8 = var3 - var6;
					int var9;
					int var10;
					int var11;
					int var12;
					byte var13;
					if (var1 > 65535) {
						if (var8 > 510) {
							var8 = 510;
						}

						var13 = 10;
						zu.oa(this.ag_fld, ak_fld, 0, var8 + var13, 1535799479);
						var9 = ((ak_fld[2] & 255) << 8) + ((ak_fld[0] & 255) << 24) + ((ak_fld[1] & 255) << 16) + (ak_fld[3] & 255);
						var10 = (ak_fld[5] & 255) + ((ak_fld[4] & 255) << 8);
						var11 = (ak_fld[8] & 255) + ((ak_fld[6] & 255) << 16) + ((ak_fld[7] & 255) << 8);
						var12 = ak_fld[9] & 255;
					} else {
						if (var8 > 512) {
							var8 = 512;
						}

						var13 = 8;
						zu.oa(this.ag_fld, ak_fld, 0, var8 + var13, 1535799479);
						var9 = ((ak_fld[0] & 255) << 8) + (ak_fld[1] & 255);
						var10 = ((ak_fld[2] & 255) << 8) + (ak_fld[3] & 255);
						var11 = (ak_fld[6] & 255) + ((ak_fld[5] & 255) << 8) + ((ak_fld[4] & 255) << 16);
						var12 = ak_fld[7] & 255;
					}

					if (var1 == var9 && var10 == var7 && this.av_fld == var12) {
						if (var11 >= 0 && var11 <= zu.gn(this.ag_fld, -841718956) / 520L) {
							int var14 = var13 + var8;

							for (int var15 = var13; var15 < var14; var15++) {
								var5[var6++] = ak_fld[var15];
							}

							var4 = var11;
							var7++;
							continue;
						}

						return null;
					}

					return null;
				}

				var21 = var5;
			} catch (IOException var17) {
				return null;
			}

			return var21;
		}
	}

	public un(int var1, zu var2, zu var3, int var4) {
		this.av_fld = var1;
		this.ag_fld = var2;
		this.az_fld = var3;
		this.ae_fld = var4;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I[BIZ)Z"
	)
	boolean az(int var1, byte[] var2, int var3, boolean var4) throws EOFException {
		synchronized (this.ag_fld) {
			boolean var21;
			try {
				int var7;
				if (var4) {
					if (zu.gn(this.az_fld, -2074224602) < var1 * 6 + 6) {
						return false;
					}

					this.az_fld.af(6 * var1);
					zu.oa(this.az_fld, ak_fld, 0, 6, 1535799479);
					var7 = (ak_fld[5] & 255) + ((ak_fld[4] & 255) << 8) + ((ak_fld[3] & 255) << 16);
					if (var7 <= 0 || var7 > zu.gn(this.ag_fld, -2074578903) / 520L) {
						return false;
					}
				} else {
					zu.to(this.ag_fld, 1576979688);
					var7 = (int)((this.ag_fld.av().length() + 519L) / 520L);
					if (0 == var7) {
						var7 = 1;
					}
				}

				int var8 = 0;
				int var9 = 0;

				for (int var10 = var7; var8 < var3; var9++) {
					int var11 = 0;
					if (var4) {
						this.ag_fld.af(var10 * 520L);
						int var12;
						int var13;
						int var14;
						if (var1 > 65535) {
							zu.oa(this.ag_fld, ak_fld, 0, 10, 1535799479);
							var12 = ((ak_fld[1] & 255) << 16) + ((ak_fld[0] & 255) << 24) + ((ak_fld[2] & 255) << 8) + (ak_fld[3] & 255);
							var13 = ((ak_fld[4] & 255) << 8) + (ak_fld[5] & 255);
							var11 = (ak_fld[8] & 255) + ((ak_fld[7] & 255) << 8) + ((ak_fld[6] & 255) << 16);
							var14 = ak_fld[9] & 255;
						} else {
							zu.oa(this.ag_fld, ak_fld, 0, 8, 1535799479);
							var12 = ((ak_fld[0] & 255) << 8) + (ak_fld[1] & 255);
							var13 = ((ak_fld[2] & 255) << 8) + (ak_fld[3] & 255);
							var11 = ((ak_fld[5] & 255) << 8) + ((ak_fld[4] & 255) << 16) + (ak_fld[6] & 255);
							var14 = ak_fld[7] & 255;
						}

						if (var1 != var12 || var9 != var13 || this.av_fld != var14) {
							return false;
						}

						if (var11 < 0 || var11 > zu.gn(this.ag_fld, -745358905) / 520L) {
							return false;
						}
					}

					if (var11 == 0) {
						var4 = false;
						zu.to(this.ag_fld, 1576979688);
						var11 = (int)((this.ag_fld.av().length() + 519L) / 520L);
						if (0 == var11) {
							var11++;
						}

						if (var10 == var11) {
							var11++;
						}
					}

					if (var1 > 65535) {
						if (var3 - var8 <= 510) {
							var11 = 0;
						}

						ak_fld[0] = (byte)(var1 >> 24);
						ak_fld[1] = (byte)(var1 >> 16);
						ak_fld[2] = (byte)(var1 >> 8);
						ak_fld[3] = (byte)var1;
						ak_fld[4] = (byte)(var9 >> 8);
						ak_fld[5] = (byte)var9;
						ak_fld[6] = (byte)(var11 >> 16);
						ak_fld[7] = (byte)(var11 >> 8);
						ak_fld[8] = (byte)var11;
						ak_fld[9] = (byte)this.av_fld;
						this.ag_fld.af(520L * var10);
						this.ag_fld.ay(ak_fld, 0, 10, 1868030190);
						int var18 = var3 - var8;
						if (var18 > 510) {
							var18 = 510;
						}

						this.ag_fld.ay(var2, var8, var18, 1845559268);
						var8 += var18;
					} else {
						if (var3 - var8 <= 512) {
							var11 = 0;
						}

						ak_fld[0] = (byte)(var1 >> 8);
						ak_fld[1] = (byte)var1;
						ak_fld[2] = (byte)(var9 >> 8);
						ak_fld[3] = (byte)var9;
						ak_fld[4] = (byte)(var11 >> 16);
						ak_fld[5] = (byte)(var11 >> 8);
						ak_fld[6] = (byte)var11;
						ak_fld[7] = (byte)this.av_fld;
						this.ag_fld.af(var10 * 520L);
						this.ag_fld.ay(ak_fld, 0, 8, 1518698258);
						int var19 = var3 - var8;
						if (var19 > 512) {
							var19 = 512;
						}

						this.ag_fld.ay(var2, var8, var19, 1872642194);
						var8 += var19;
					}

					var10 = var11;
				}

				ak_fld[0] = (byte)(var3 >> 16);
				ak_fld[1] = (byte)(var3 >> 8);
				ak_fld[2] = (byte)var3;
				ak_fld[3] = (byte)(var7 >> 16);
				ak_fld[4] = (byte)(var7 >> 8);
				ak_fld[5] = (byte)var7;
				this.az_fld.af(var1 * 6);
				this.az_fld.ay(ak_fld, 0, 6, 1635418213);
				var21 = true;
			} catch (IOException var16) {
				return false;
			}

			return var21;
		}
	}

	@ObfuscatedName("toString")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	@Override
	public String toString() {
		return "" + this.av_fld;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)[B"
	)
	public byte[] ak(int var1) throws EOFException {
		synchronized (this.ag_fld) {
			byte[] var22;
			try {
				if (zu.gn(this.az_fld, -993298781) < var1 * 6 + 6) {
					return null;
				}

				this.az_fld.af(var1 * 6);
				zu.oa(this.az_fld, ak_fld, 0, 6, 1535799479);
				int var4 = (ak_fld[2] & 255) + ((ak_fld[0] & 255) << 16) + ((ak_fld[1] & 255) << 8);
				int var5 = (ak_fld[5] & 255) + ((ak_fld[3] & 255) << 16) + ((ak_fld[4] & 255) << 8);
				if (var4 < 0 || var4 > this.ae_fld) {
					return null;
				}

				if (var5 <= 0 || var5 > zu.gn(this.ag_fld, -1195287821) / 520L) {
					return null;
				}

				byte[] var6 = new byte[var4];
				int var7 = 0;
				int var8 = 0;

				while (var7 < var4) {
					if (0 == var5) {
						return null;
					}

					this.ag_fld.af(var5 * 520L);
					int var9 = var4 - var7;
					int var10;
					int var11;
					int var12;
					int var13;
					byte var14;
					if (var1 > 65535) {
						if (var9 > 510) {
							var9 = 510;
						}

						var14 = 10;
						zu.oa(this.ag_fld, ak_fld, 0, var9 + var14, 1535799479);
						var10 = ((ak_fld[2] & 255) << 8) + ((ak_fld[0] & 255) << 24) + ((ak_fld[1] & 255) << 16) + (ak_fld[3] & 255);
						var11 = (ak_fld[5] & 255) + ((ak_fld[4] & 255) << 8);
						var12 = (ak_fld[8] & 255) + ((ak_fld[6] & 255) << 16) + ((ak_fld[7] & 255) << 8);
						var13 = ak_fld[9] & 255;
					} else {
						if (var9 > 512) {
							var9 = 512;
						}

						var14 = 8;
						zu.oa(this.ag_fld, ak_fld, 0, var9 + var14, 1535799479);
						var10 = ((ak_fld[0] & 255) << 8) + (ak_fld[1] & 255);
						var11 = ((ak_fld[2] & 255) << 8) + (ak_fld[3] & 255);
						var12 = (ak_fld[6] & 255) + ((ak_fld[5] & 255) << 8) + ((ak_fld[4] & 255) << 16);
						var13 = ak_fld[7] & 255;
					}

					if (var1 == var10 && var11 == var8 && this.av_fld == var13) {
						if (var12 >= 0 && var12 <= zu.gn(this.ag_fld, -2037698941) / 520L) {
							int var15 = var14 + var9;

							for (int var16 = var14; var16 < var15; var16++) {
								var6[var7++] = ak_fld[var16];
							}

							var5 = var12;
							var8++;
							continue;
						}

						return null;
					}

					return null;
				}

				var22 = var6;
			} catch (IOException var18) {
				return null;
			}

			return var22;
		}
	}

	@ObfuscatedName("gq")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String gq() {
		return "" + this.av_fld;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I[BI)Z"
	)
	public boolean ag(int var1, byte[] var2, int var3) throws EOFException {
		synchronized (this.ag_fld) {
			if (var3 >= 0 && var3 <= this.ae_fld) {
				boolean var6 = this.az(var1, var2, var3, true);
				if (!var6) {
					var6 = this.az(var1, var2, var3, false);
				}

				return var6;
			} else {
				throw new IllegalArgumentException("" + this.av_fld + ',' + var1 + ',' + var3);
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I[BI)Z"
	)
	public boolean ae(int var1, byte[] var2, int var3) throws EOFException {
		synchronized (this.ag_fld) {
			if (var3 >= 0 && var3 <= this.ae_fld) {
				boolean var5 = this.az(var1, var2, var3, true);
				if (!var5) {
					var5 = this.az(var1, var2, var3, false);
				}

				return var5;
			} else {
				throw new IllegalArgumentException("" + this.av_fld + ',' + var1 + ',' + var3);
			}
		}
	}

	@ObfuscatedName("gi")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String gi() {
		return "" + this.av_fld;
	}

	@ObfuscatedName("ya")
	@ObfuscatedSignature(
		descriptor = "(Lun;I[BIZ)Z"
	)
	public static boolean ya(un var0, int var1, byte[] var2, int var3, boolean var4) throws EOFException {
		synchronized (var0.ag_fld) {
			boolean var20;
			try {
				int var6;
				if (var4) {
					if (zu.gn(var0.az_fld, -1815200063) < var1 * 6 + 6) {
						return false;
					}

					var0.az_fld.af(6 * var1);
					zu.oa(var0.az_fld, ak_fld, 0, 6, 1535799479);
					var6 = (ak_fld[5] & 255) + ((ak_fld[4] & 255) << 8) + ((ak_fld[3] & 255) << 16);
					if (var6 <= 0 || var6 > zu.gn(var0.ag_fld, -1912220465) / 520L) {
						return false;
					}
				} else {
					zu.to(var0.ag_fld, 1576979688);
					var6 = (int)((var0.ag_fld.av().length() + 519L) / 520L);
					if (0 == var6) {
						var6 = 1;
					}
				}

				int var7 = 0;
				int var8 = 0;

				for (int var9 = var6; var7 < var3; var8++) {
					int var10 = 0;
					if (var4) {
						var0.ag_fld.af(var9 * 520L);
						int var11;
						int var12;
						int var13;
						if (var1 > 65535) {
							zu.oa(var0.ag_fld, ak_fld, 0, 10, 1535799479);
							var11 = ((ak_fld[1] & 255) << 16) + ((ak_fld[0] & 255) << 24) + ((ak_fld[2] & 255) << 8) + (ak_fld[3] & 255);
							var12 = ((ak_fld[4] & 255) << 8) + (ak_fld[5] & 255);
							var10 = (ak_fld[8] & 255) + ((ak_fld[7] & 255) << 8) + ((ak_fld[6] & 255) << 16);
							var13 = ak_fld[9] & 255;
						} else {
							zu.oa(var0.ag_fld, ak_fld, 0, 8, 1535799479);
							var11 = ((ak_fld[0] & 255) << 8) + (ak_fld[1] & 255);
							var12 = ((ak_fld[2] & 255) << 8) + (ak_fld[3] & 255);
							var10 = ((ak_fld[5] & 255) << 8) + ((ak_fld[4] & 255) << 16) + (ak_fld[6] & 255);
							var13 = ak_fld[7] & 255;
						}

						if (var1 != var11 || var8 != var12 || var0.av_fld != var13) {
							return false;
						}

						if (var10 < 0 || var10 > zu.gn(var0.ag_fld, -844263800) / 520L) {
							return false;
						}
					}

					if (var10 == 0) {
						var4 = false;
						zu.to(var0.ag_fld, 1576979688);
						var10 = (int)((var0.ag_fld.av().length() + 519L) / 520L);
						if (0 == var10) {
							var10++;
						}

						if (var9 == var10) {
							var10++;
						}
					}

					if (var1 > 65535) {
						if (var3 - var7 <= 510) {
							var10 = 0;
						}

						ak_fld[0] = (byte)(var1 >> 24);
						ak_fld[1] = (byte)(var1 >> 16);
						ak_fld[2] = (byte)(var1 >> 8);
						ak_fld[3] = (byte)var1;
						ak_fld[4] = (byte)(var8 >> 8);
						ak_fld[5] = (byte)var8;
						ak_fld[6] = (byte)(var10 >> 16);
						ak_fld[7] = (byte)(var10 >> 8);
						ak_fld[8] = (byte)var10;
						ak_fld[9] = (byte)var0.av_fld;
						var0.ag_fld.af(520L * var9);
						var0.ag_fld.ay(ak_fld, 0, 10, 1545139139);
						int var17 = var3 - var7;
						if (var17 > 510) {
							var17 = 510;
						}

						var0.ag_fld.ay(var2, var7, var17, 1579251958);
						var7 += var17;
					} else {
						if (var3 - var7 <= 512) {
							var10 = 0;
						}

						ak_fld[0] = (byte)(var1 >> 8);
						ak_fld[1] = (byte)var1;
						ak_fld[2] = (byte)(var8 >> 8);
						ak_fld[3] = (byte)var8;
						ak_fld[4] = (byte)(var10 >> 16);
						ak_fld[5] = (byte)(var10 >> 8);
						ak_fld[6] = (byte)var10;
						ak_fld[7] = (byte)var0.av_fld;
						var0.ag_fld.af(var9 * 520L);
						var0.ag_fld.ay(ak_fld, 0, 8, 1836568985);
						int var18 = var3 - var7;
						if (var18 > 512) {
							var18 = 512;
						}

						var0.ag_fld.ay(var2, var7, var18, 2046179440);
						var7 += var18;
					}

					var9 = var10;
				}

				ak_fld[0] = (byte)(var3 >> 16);
				ak_fld[1] = (byte)(var3 >> 8);
				ak_fld[2] = (byte)var3;
				ak_fld[3] = (byte)(var6 >> 16);
				ak_fld[4] = (byte)(var6 >> 8);
				ak_fld[5] = (byte)var6;
				var0.az_fld.af(var1 * 6);
				var0.az_fld.ay(ak_fld, 0, 6, 1640390200);
				var20 = true;
			} catch (IOException var15) {
				return false;
			}

			return var20;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I[BIZ)Z"
	)
	boolean aw(int var1, byte[] var2, int var3, boolean var4) throws EOFException {
		synchronized (this.ag_fld) {
			boolean var20;
			try {
				int var6;
				if (var4) {
					if (zu.gn(this.az_fld, -1010872273) < var1 * 6 + 6) {
						return false;
					}

					this.az_fld.af(6 * var1);
					zu.oa(this.az_fld, ak_fld, 0, 6, 1535799479);
					var6 = (ak_fld[5] & -1762005721) + ((ak_fld[4] & 255) << 8) + ((ak_fld[3] & -864854044) << 16);
					if (var6 <= 0 || var6 > zu.gn(this.ag_fld, -1884912163) / 520L) {
						return false;
					}
				} else {
					zu.to(this.ag_fld, 1576979688);
					var6 = (int)((this.ag_fld.av().length() + 519L) / 520L);
					if (0 == var6) {
						var6 = 1;
					}
				}

				int var7 = 0;
				int var8 = 0;

				for (int var9 = var6; var7 < var3; var8++) {
					int var10 = 0;
					if (var4) {
						this.ag_fld.af(var9 * 520L);
						int var11;
						int var12;
						int var13;
						if (var1 > 65535) {
							zu.oa(this.ag_fld, ak_fld, 0, 10, 1535799479);
							var11 = ((ak_fld[1] & 1744354098) << 16) + ((ak_fld[0] & 255) << 24) + ((ak_fld[2] & 562199216) << 8) + (ak_fld[3] & 255);
							var12 = ((ak_fld[4] & 255) << 8) + (ak_fld[5] & 255);
							var10 = (ak_fld[8] & 255) + ((ak_fld[7] & 1185811040) << 8) + ((ak_fld[6] & -510838827) << 16);
							var13 = ak_fld[9] & 255;
						} else {
							zu.oa(this.ag_fld, ak_fld, 0, 8, 1535799479);
							var11 = ((ak_fld[0] & 255) << 8) + (ak_fld[1] & 255);
							var12 = ((ak_fld[2] & -1089034479) << 8) + (ak_fld[3] & 1295204485);
							var10 = ((ak_fld[5] & 255) << 8) + ((ak_fld[4] & 255) << 16) + (ak_fld[6] & -1069149860);
							var13 = ak_fld[7] & 255;
						}

						if (var1 != var11 || var8 != var12 || this.av_fld != var13) {
							return false;
						}

						if (var10 < 0 || var10 > zu.gn(this.ag_fld, -1769110251) / 520L) {
							return false;
						}
					}

					if (var10 == 0) {
						var4 = false;
						zu.to(this.ag_fld, 1576979688);
						var10 = (int)((this.ag_fld.av().length() + 519L) / 520L);
						if (0 == var10) {
							var10++;
						}

						if (var9 == var10) {
							var10++;
						}
					}

					if (var1 > 65535) {
						if (var3 - var7 <= 442390802) {
							var10 = 0;
						}

						ak_fld[0] = (byte)(var1 >> 24);
						ak_fld[1] = (byte)(var1 >> 16);
						ak_fld[2] = (byte)(var1 >> 8);
						ak_fld[3] = (byte)var1;
						ak_fld[4] = (byte)(var8 >> 8);
						ak_fld[5] = (byte)var8;
						ak_fld[6] = (byte)(var10 >> 16);
						ak_fld[7] = (byte)(var10 >> 8);
						ak_fld[8] = (byte)var10;
						ak_fld[9] = (byte)this.av_fld;
						this.ag_fld.af(520L * var9);
						this.ag_fld.ay(ak_fld, 0, 10, 2142995861);
						int var17 = var3 - var7;
						if (var17 > 510) {
							var17 = 510;
						}

						this.ag_fld.ay(var2, var7, var17, 1901936156);
						var7 += var17;
					} else {
						if (var3 - var7 <= 512) {
							var10 = 0;
						}

						ak_fld[0] = (byte)(var1 >> 8);
						ak_fld[1] = (byte)var1;
						ak_fld[2] = (byte)(var8 >> 8);
						ak_fld[3] = (byte)var8;
						ak_fld[4] = (byte)(var10 >> 16);
						ak_fld[5] = (byte)(var10 >> 8);
						ak_fld[6] = (byte)var10;
						ak_fld[7] = (byte)(this.av_fld * 1495056750);
						this.ag_fld.af(var9 * 520L);
						this.ag_fld.ay(ak_fld, 0, 8, 1616751068);
						int var18 = var3 - var7;
						if (var18 > 255382540) {
							var18 = 512;
						}

						this.ag_fld.ay(var2, var7, var18, 1708137384);
						var7 += var18;
					}

					var9 = var10;
				}

				ak_fld[0] = (byte)(var3 >> 16);
				ak_fld[1] = (byte)(var3 >> 8);
				ak_fld[2] = (byte)var3;
				ak_fld[3] = (byte)(var6 >> 16);
				ak_fld[4] = (byte)(var6 >> 8);
				ak_fld[5] = (byte)var6;
				this.az_fld.af(var1 * 6);
				this.az_fld.ay(ak_fld, 0, 6, 1956246193);
				var20 = true;
			} catch (IOException var15) {
				return false;
			}

			return var20;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I[BIZ)Z"
	)
	boolean ay(int var1, byte[] var2, int var3, boolean var4) throws EOFException {
		synchronized (this.ag_fld) {
			boolean var20;
			try {
				int var6;
				if (var4) {
					if (zu.gn(this.az_fld, -882106632) < var1 * 6 + 6) {
						return false;
					}

					this.az_fld.af(6 * var1);
					zu.oa(this.az_fld, ak_fld, 0, 6, 1535799479);
					var6 = (ak_fld[5] & 255) + ((ak_fld[4] & 255) << 8) + ((ak_fld[3] & 255) << 16);
					if (var6 <= 0 || var6 > zu.gn(this.ag_fld, -1655027444) / 520L) {
						return false;
					}
				} else {
					zu.to(this.ag_fld, 1576979688);
					var6 = (int)((this.ag_fld.av().length() + 519L) / 520L);
					if (0 == var6) {
						var6 = 1;
					}
				}

				int var7 = 0;
				int var8 = 0;

				for (int var9 = var6; var7 < var3; var8++) {
					int var10 = 0;
					if (var4) {
						this.ag_fld.af(var9 * 520L);
						int var11;
						int var12;
						int var13;
						if (var1 > 65535) {
							zu.oa(this.ag_fld, ak_fld, 0, 10, 1535799479);
							var11 = ((ak_fld[1] & 255) << 16) + ((ak_fld[0] & 255) << 24) + ((ak_fld[2] & 255) << 8) + (ak_fld[3] & 255);
							var12 = ((ak_fld[4] & 255) << 8) + (ak_fld[5] & 255);
							var10 = (ak_fld[8] & 255) + ((ak_fld[7] & 255) << 8) + ((ak_fld[6] & 255) << 16);
							var13 = ak_fld[9] & 255;
						} else {
							zu.oa(this.ag_fld, ak_fld, 0, 8, 1535799479);
							var11 = ((ak_fld[0] & 255) << 8) + (ak_fld[1] & 255);
							var12 = ((ak_fld[2] & 255) << 8) + (ak_fld[3] & 255);
							var10 = ((ak_fld[5] & 255) << 8) + ((ak_fld[4] & 255) << 16) + (ak_fld[6] & 255);
							var13 = ak_fld[7] & 255;
						}

						if (var1 != var11 || var8 != var12 || this.av_fld != var13) {
							return false;
						}

						if (var10 < 0 || var10 > zu.gn(this.ag_fld, -2023058536) / 520L) {
							return false;
						}
					}

					if (var10 == 0) {
						var4 = false;
						zu.to(this.ag_fld, 1576979688);
						var10 = (int)((this.ag_fld.av().length() + 519L) / 520L);
						if (0 == var10) {
							var10++;
						}

						if (var9 == var10) {
							var10++;
						}
					}

					if (var1 > 65535) {
						if (var3 - var7 <= 510) {
							var10 = 0;
						}

						ak_fld[0] = (byte)(var1 >> 24);
						ak_fld[1] = (byte)(var1 >> 16);
						ak_fld[2] = (byte)(var1 >> 8);
						ak_fld[3] = (byte)var1;
						ak_fld[4] = (byte)(var8 >> 8);
						ak_fld[5] = (byte)var8;
						ak_fld[6] = (byte)(var10 >> 16);
						ak_fld[7] = (byte)(var10 >> 8);
						ak_fld[8] = (byte)var10;
						ak_fld[9] = (byte)this.av_fld;
						this.ag_fld.af(520L * var9);
						this.ag_fld.ay(ak_fld, 0, 10, 1628378460);
						int var17 = var3 - var7;
						if (var17 > 510) {
							var17 = 510;
						}

						this.ag_fld.ay(var2, var7, var17, 1905418278);
						var7 += var17;
					} else {
						if (var3 - var7 <= 512) {
							var10 = 0;
						}

						ak_fld[0] = (byte)(var1 >> 8);
						ak_fld[1] = (byte)var1;
						ak_fld[2] = (byte)(var8 >> 8);
						ak_fld[3] = (byte)var8;
						ak_fld[4] = (byte)(var10 >> 16);
						ak_fld[5] = (byte)(var10 >> 8);
						ak_fld[6] = (byte)var10;
						ak_fld[7] = (byte)this.av_fld;
						this.ag_fld.af(var9 * 520L);
						this.ag_fld.ay(ak_fld, 0, 8, 2046107929);
						int var18 = var3 - var7;
						if (var18 > 512) {
							var18 = 512;
						}

						this.ag_fld.ay(var2, var7, var18, 1404170164);
						var7 += var18;
					}

					var9 = var10;
				}

				ak_fld[0] = (byte)(var3 >> 16);
				ak_fld[1] = (byte)(var3 >> 8);
				ak_fld[2] = (byte)var3;
				ak_fld[3] = (byte)(var6 >> 16);
				ak_fld[4] = (byte)(var6 >> 8);
				ak_fld[5] = (byte)var6;
				this.az_fld.af(var1 * 6);
				this.az_fld.ay(ak_fld, 0, 6, 1767035513);
				var20 = true;
			} catch (IOException var15) {
				return false;
			}

			return var20;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I[BIZ)Z"
	)
	boolean ah(int var1, byte[] var2, int var3, boolean var4) throws EOFException {
		synchronized (this.ag_fld) {
			boolean var20;
			try {
				int var6;
				if (var4) {
					if (zu.gn(this.az_fld, -1790054396) < var1 * 6 + 6) {
						return false;
					}

					this.az_fld.af(6 * var1);
					zu.oa(this.az_fld, ak_fld, 0, 6, 1535799479);
					var6 = (ak_fld[5] & -181716840) + ((ak_fld[4] & 255) << 8) + ((ak_fld[3] & -328111999) << 16);
					if (var6 <= 0 || var6 > zu.gn(this.ag_fld, -2016458741) / 520L) {
						return false;
					}
				} else {
					zu.to(this.ag_fld, 1576979688);
					var6 = (int)((this.ag_fld.av().length() + 519L) / 520L);
					if (0 == var6) {
						var6 = 1;
					}
				}

				int var7 = 0;
				int var8 = 0;

				for (int var9 = var6; var7 < var3; var8++) {
					int var10 = 0;
					if (var4) {
						this.ag_fld.af(var9 * 520L);
						int var11;
						int var12;
						int var13;
						if (var1 > -468225145) {
							zu.oa(this.ag_fld, ak_fld, 0, 10, 1535799479);
							var11 = ((ak_fld[1] & 255) << 16) + ((ak_fld[0] & -627173258) << 24) + ((ak_fld[2] & 255) << 8) + (ak_fld[3] & 255);
							var12 = ((ak_fld[4] & 255) << 8) + (ak_fld[5] & 1436876396);
							var10 = (ak_fld[8] & 255) + ((ak_fld[7] & 666220789) << 8) + ((ak_fld[6] & 1999199126) << 16);
							var13 = ak_fld[9] & -1571489892;
						} else {
							zu.oa(this.ag_fld, ak_fld, 0, 8, 1535799479);
							var11 = ((ak_fld[0] & 557034137) << 8) + (ak_fld[1] & -1163845651);
							var12 = ((ak_fld[2] & 1193659763) << 8) + (ak_fld[3] & -1114622573);
							var10 = ((ak_fld[5] & -2136125538) << 8) + ((ak_fld[4] & 1177104527) << 16) + (ak_fld[6] & 255);
							var13 = ak_fld[7] & 499181086;
						}

						if (var1 != var11 || var8 != var12 || this.av_fld != var13) {
							return false;
						}

						if (var10 < 0 || var10 > zu.gn(this.ag_fld, -1467696638) / 520L) {
							return false;
						}
					}

					if (var10 == 0) {
						var4 = false;
						zu.to(this.ag_fld, 1576979688);
						var10 = (int)((this.ag_fld.av().length() + 519L) / 520L);
						if (0 == var10) {
							var10++;
						}

						if (var9 == var10) {
							var10++;
						}
					}

					if (var1 > 65535) {
						if (var3 - var7 <= 448128911) {
							var10 = 0;
						}

						ak_fld[0] = (byte)(var1 >> 24);
						ak_fld[1] = (byte)(var1 >> 16);
						ak_fld[2] = (byte)(var1 >> 8);
						ak_fld[3] = (byte)var1;
						ak_fld[4] = (byte)(var8 >> 8);
						ak_fld[5] = (byte)var8;
						ak_fld[6] = (byte)(var10 >> 16);
						ak_fld[7] = (byte)(var10 >> 8);
						ak_fld[8] = (byte)var10;
						ak_fld[9] = (byte)this.av_fld;
						this.ag_fld.af(520L * var9);
						this.ag_fld.ay(ak_fld, 0, 10, 2145224821);
						int var17 = var3 - var7;
						if (var17 > -1078270770) {
							var17 = -745137129;
						}

						this.ag_fld.ay(var2, var7, var17, 1404999508);
						var7 += var17;
					} else {
						if (var3 - var7 <= 512) {
							var10 = 0;
						}

						ak_fld[0] = (byte)(var1 >> 8);
						ak_fld[1] = (byte)var1;
						ak_fld[2] = (byte)(var8 >> 8);
						ak_fld[3] = (byte)var8;
						ak_fld[4] = (byte)(var10 >> 16);
						ak_fld[5] = (byte)(var10 >> 8);
						ak_fld[6] = (byte)var10;
						ak_fld[7] = (byte)this.av_fld;
						this.ag_fld.af(var9 * 520L);
						this.ag_fld.ay(ak_fld, 0, 8, 1545734323);
						int var18 = var3 - var7;
						if (var18 > 830095193) {
							var18 = 512;
						}

						this.ag_fld.ay(var2, var7, var18, 1531981866);
						var7 += var18;
					}

					var9 = var10;
				}

				ak_fld[0] = (byte)(var3 >> 16);
				ak_fld[1] = (byte)(var3 >> 8);
				ak_fld[2] = (byte)var3;
				ak_fld[3] = (byte)(var6 >> 16);
				ak_fld[4] = (byte)(var6 >> 8);
				ak_fld[5] = (byte)var6;
				this.az_fld.af(var1 * 6);
				this.az_fld.ay(ak_fld, 0, 6, 1575271578);
				var20 = true;
			} catch (IOException var15) {
				return false;
			}

			return var20;
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ldx;IIIIIILgn;)V"
	)
	static final void ax(dx var0, int var1, int var2, int var3, int var4, int var5, int var6, gn var7) throws EOFException {
		rl4 var9 = var0.isTopLevel() ? client.ul_fld : client.uq_rl4;
		if (var1 < dt.ar_fld) {
			dt.ar_fld = var1;
		}

		ev var10 = var9.yp_fld;
		oe var11 = oe.ke(var4);
		int var12;
		int var13;
		if (var5 != 1 && var5 != 3) {
			var12 = var11.cb_fld;
			var13 = var11.co_fld;
		} else {
			var12 = var11.co_fld;
			var13 = var11.cb_fld;
		}

		int var14;
		int var15;
		if (var12 + var2 <= var10.rm_fld) {
			var14 = (var12 >> 1) + var2;
			var15 = (var12 + 1 >> 1) + var2;
		} else {
			var14 = var2;
			var15 = var2 + 1;
		}

		var14 += var10.jh_fld;
		var15 += var10.jh_fld;
		int var16;
		int var17;
		if (var13 + var3 <= var10.jq_fld) {
			var16 = (var13 >> 1) + var3;
			var17 = (var13 + 1 >> 1) + var3;
		} else {
			var16 = var3;
			var17 = var3 + 1;
		}

		var16 += var10.jh_fld;
		var17 += var10.jh_fld;
		int var18 = var2 + var10.jh_fld;
		int var19 = var3 + var10.jh_fld;
		boolean var20 = var2 > 0 && var2 < 103 && var3 > 0 && var3 < 103;
		int[][] var21 = var9.bf_fld[var1];
		int var22 = var21[var14][var17] + var21[var14][var16] + var21[var15][var16] + var21[var15][var17] >> 2;
		int var23 = (var18 << 7) + (var12 << 6);
		int var24 = (var19 << 7) + (var13 << 6);
		boolean var25 = var11.cj_fld != 0 && var2 >= 0 && var2 < 128 && var3 >= 0 && var3 < 128;
		long var26 = client.pb(var1, var2, var3, 2, !var25, var4, var0.ag_fld);
		int var28 = var6 + (var5 << 6);
		if (var11.dg_fld == 1) {
			var28 += 256;
		}

		if (var11.ew()) {
			client.qp(var9, var1, var2, var3, var11, var5);
		}

		if (var6 == 22) {
			boolean var29 = !client.gk_fld || var11.cj_fld != 0 || var11.cu_fld == 1 || var11.du_fld;
			if (!var29) {
				if (!client.$assertionsDisabled && !client.gk_fld) {
					throw new AssertionError();
				}

				int var30 = var10.yb_fld[var1][var18][var19] & 32767;
				if (var30 > 0) {
					ov var31 = var9.id(var30 - 1);
					if (var31.ly() < 0 && var31.rx() == 16711935) {
						var29 = true;
					}
				}
			}

			if (var29) {
				Object var54;
				if (var11.dc_fld == -1 && var11.dy_fld == null) {
					var54 = client.zi(var0.az_fld, var10, var11, var21, var6, var5, var6, var5, var1, var2, var3, var23, var22, var24);
				} else {
					dz var67 = new dz(var0, var4, 22, var5, var1, var2, var3, var11.dc_fld, var11.dp_fld, null);
					var67.ja_fld = var10;
					var54 = var67;
				}

				var10.fc(var1, var2, var3, var22, (em)var54, var26, var28);
				if (var11.cu_fld == 1 && var7 != null && var20) {
					var7.cm(var2, var3);
				}
			}
		} else if (var6 >= 12) {
			Object var40;
			if (var11.dc_fld == -1 && var11.dy_fld == null) {
				var40 = client.zi(var0.az_fld, var10, var11, var21, var6, var5, var6, var5, var1, var2, var3, var23, var22, var24);
			} else {
				dz var55 = new dz(var0, var4, var6, var5, var1, var2, var3, var11.dc_fld, var11.dp_fld, null);
				var55.ja_fld = var10;
				var40 = var55;
			}

			var10.hk(var1, var2, var3, var22, 1, 1, (em)var40, 0, var26, var28);
			if (var6 <= 17 && var6 != 13 && var1 > 0) {
				var9.xi_fld[var1][var18][var19] = var9.xi_fld[var1][var18][var19] | 2340;
			}

			if (var11.cu_fld != 0 && var7 != null && var20) {
				var7.mf(var2, var3, var12, var13, var11.du_fld);
			}
		} else if (var6 != 10 && var6 != 11) {
			if (var6 == 0) {
				Object var42;
				if (var11.dc_fld == -1 && var11.dy_fld == null) {
					var42 = client.zi(var0.az_fld, var10, var11, var21, var6, var5, var6, var5, var1, var2, var3, var23, var22, var24);
				} else {
					dz var58 = new dz(var0, var4, 0, var5, var1, var2, var3, var11.dc_fld, var11.dp_fld, null);
					var58.ja_fld = var10;
					var42 = var58;
				}

				var10.hr(var1, var2, var3, var22, (em)var42, null, 1 << var5, 0, var26, var28);
				if (var5 == 0) {
					if (var11.dd_fld) {
						var9.ra_fld[var1][var18][var19] = 50;
						var9.ra_fld[var1][var18][var19 + 1] = 50;
					}

					if (var11.cl_fld) {
						var9.xi_fld[var1][var18][var19] = var9.xi_fld[var1][var18][var19] | 585;
					}
				} else if (var5 == 1) {
					if (var11.dd_fld) {
						var9.ra_fld[var1][var18][var19 + 1] = 50;
						var9.ra_fld[var1][var18 + 1][var19 + 1] = 50;
					}

					if (var11.cl_fld) {
						var9.xi_fld[var1][var18][var19 + 1] = var9.xi_fld[var1][var18][var19 + 1] | 1170;
					}
				} else if (var5 == 2) {
					if (var11.dd_fld) {
						var9.ra_fld[var1][var18 + 1][var19] = 50;
						var9.ra_fld[var1][var18 + 1][var19 + 1] = 50;
					}

					if (var11.cl_fld) {
						var9.xi_fld[var1][var18 + 1][var19] = var9.xi_fld[var1][var18 + 1][var19] | 585;
					}
				} else if (var5 == 3) {
					if (var11.dd_fld) {
						var9.ra_fld[var1][var18][var19] = 50;
						var9.ra_fld[var1][var18 + 1][var19] = 50;
					}

					if (var11.cl_fld) {
						var9.xi_fld[var1][var18][var19] = var9.xi_fld[var1][var18][var19] | 1170;
					}
				}

				if (var11.cu_fld != 0 && var7 != null && var20) {
					var7.ea(var2, var3, var6, var5, var11.ci_fld);
				}

				if (var11.dh_fld != 16) {
					var10.rl(var1, var2, var3, var11.dh_fld + 1);
				}
			} else if (var6 != 1 && var6 != 3) {
				if (var6 == 2) {
					int var44 = var5 + 1 & 3;
					Object var60;
					Object var70;
					if (var11.dc_fld == -1 && var11.dy_fld == null) {
						var70 = var11.yz(2, var5 + 4, var21, var23, var22, var24);
						var60 = var11.yz(2, var44, var21, var23, var22, var24);
					} else {
						dz var75 = new dz(var0, var4, 2, var5 + 4, var1, var2, var3, var11.dc_fld, var11.dp_fld, null);
						dz var33 = new dz(var0, var4, 2, var44, var1, var2, var3, var11.dc_fld, var11.dp_fld, null);
						var75.ja_fld = var33.ja_fld = var10;
						var60 = var75;
						var70 = var33;
					}

					var10.hr(var1, var2, var3, var22, (em)var70, (em)var60, 1 << var5, 1 << var44, var26, var28);
					if (var11.cl_fld) {
						if (var5 == 0) {
							var9.xi_fld[var1][var18][var19] = var9.xi_fld[var1][var18][var19] | 585;
							var9.xi_fld[var1][var18][var19 + 1] = var9.xi_fld[var1][var18][var19 + 1] | 1170;
						} else if (var5 == 1) {
							var9.xi_fld[var1][var18][var19 + 1] = var9.xi_fld[var1][var18][var19 + 1] | 1170;
							var9.xi_fld[var1][var18 + 1][var19] = var9.xi_fld[var1][var18 + 1][var19] | 585;
						} else if (var5 == 2) {
							var9.xi_fld[var1][var18 + 1][var19] = var9.xi_fld[var1][var18 + 1][var19] | 585;
							var9.xi_fld[var1][var18][var19] = var9.xi_fld[var1][var18][var19] | 1170;
						} else if (var5 == 3) {
							var9.xi_fld[var1][var18][var19] = var9.xi_fld[var1][var18][var19] | 1170;
							var9.xi_fld[var1][var18][var19] = var9.xi_fld[var1][var18][var19] | 585;
						}
					}

					if (var11.cu_fld != 0 && var7 != null && var20) {
						var7.ea(var2, var3, var6, var5, var11.ci_fld);
					}

					if (var11.dh_fld != 16) {
						var10.rl(var1, var2, var3, var11.dh_fld + 1);
					}
				} else if (var6 == 9) {
					Object var45;
					if (var11.dc_fld == -1 && var11.dy_fld == null) {
						var45 = client.zi(var0.az_fld, var10, var11, var21, var6, var5, var6, var5, var1, var2, var3, var23, var22, var24);
					} else {
						dz var61 = new dz(var0, var4, var6, var5, var1, var2, var3, var11.dc_fld, var11.dp_fld, null);
						var61.ja_fld = var10;
						var45 = var61;
					}

					var10.hk(var1, var2, var3, var22, 1, 1, (em)var45, 0, var26, var28);
					if (var11.cu_fld != 0 && var7 != null && var20) {
						var7.mf(var2, var3, var12, var13, var11.ci_fld);
					}

					if (var11.dh_fld != 16) {
						var10.rl(var1, var2, var3, var11.dh_fld / 2 + 1);
					}
				} else if (var6 == 4) {
					Object var46;
					if (var11.dc_fld == -1 && var11.dy_fld == null) {
						var46 = client.zi(var0.az_fld, var10, var11, var21, var6, var5, var6, var5, var1, var2, var3, var23, var22, var24);
					} else {
						dz var62 = new dz(var0, var4, 4, var5, var1, var2, var3, var11.dc_fld, var11.dp_fld, null);
						var62.ja_fld = var10;
						var46 = var62;
					}

					var10.im(var1, var2, var3, var22, (em)var46, null, 1 << var5, 0, dt.ah_fld[var5], dt.aw_fld[var5], 0, 0, var26, var28);
				} else if (var6 == 5) {
					int var47 = 16;
					fs var63 = var10.wl(var1, var2, var3);
					if (var63 != null) {
						var47 = oe.ke(var63.getId()).dh_fld * -1071654907;
					}

					var47++;
					Object var71;
					if (var11.dc_fld == -1 && var11.dy_fld == null) {
						var71 = client.zi(var0.az_fld, var10, var11, var21, var6, var5, 4, var5, var1, var2, var3, var23, var22, var24);
					} else {
						dz var76 = new dz(var0, var4, 4, var5, var1, var2, var3, var11.dc_fld, var11.dp_fld, null);
						var76.ja_fld = var10;
						var71 = var76;
					}

					var10.im(var1, var2, var3, var22, (em)var71, null, 1 << var5, 0, var47 * dt.ah_fld[var5], var47 * dt.aw_fld[var5], 0, 0, var26, var28);
				} else if (var6 == 6) {
					int var49 = 8;
					fj var64 = var10.hi(var1, var2, var3);
					if (var64 != null) {
						var49 = oe.ke(var64.getId()).dh_fld * -1071654907 / 2;
					}

					var49++;
					Object var72;
					if (var11.dc_fld == -1 && var11.dy_fld == null) {
						var72 = client.zi(var0.az_fld, var10, var11, var21, var6, var5, 4, var5 + 4, var1, var2, var3, var23, var22, var24);
					} else {
						dz var77 = new dz(var0, var4, 4, var5 + 4, var1, var2, var3, var11.dc_fld, var11.dp_fld, null);
						var77.ja_fld = var10;
						var72 = var77;
					}

					var10.im(var1, var2, var3, var22, (em)var72, null, 256, var5, var49 * dt.ay_fld[var5], var49 * dt.as_fld[var5], 0, 0, var26, var28);
				} else if (var6 == 7) {
					int var51 = var5 + 2 & 3;
					Object var65;
					if (var11.dc_fld == -1 && var11.dy_fld == null) {
						var65 = client.zi(var0.az_fld, var10, var11, var21, var6, var5, 4, var51 + 4, var1, var2, var3, var23, var22, var24);
					} else {
						dz var73 = new dz(var0, var4, 4, var51 + 4, var1, var2, var3, var11.dc_fld, var11.dp_fld, null);
						var73.ja_fld = var10;
						var65 = var73;
					}

					var10.im(var1, var2, var3, var22, (em)var65, null, 256, var51, dt.ay_fld[var51], dt.as_fld[var51], 0, 0, var26, var28);
				} else if (var6 == 8) {
					int var52 = 8;
					fj var66 = var10.hi(var1, var2, var3);
					if (var66 != null) {
						var52 = oe.ke(var66.getId()).dh_fld * -1071654907 / 2;
					}

					var52++;
					int var74 = var5 + 2 & 3;
					Object var78;
					Object var79;
					if (var11.dc_fld == -1 && var11.dy_fld == null) {
						var78 = var11.yz(4, var5 + 4, var21, var23, var22, var24);
						var79 = var11.yz(4, var74 + 4, var21, var23, var22, var24);
					} else {
						dz var34 = new dz(var0, var4, 4, var5 + 4, var1, var2, var3, var11.dc_fld, var11.dp_fld, null);
						dz var35 = new dz(var0, var4, 4, var74 + 4, var1, var2, var3, var11.dc_fld, var11.dp_fld, null);
						var34.ja_fld = var35.ja_fld = var10;
						var78 = var34;
						var79 = var35;
					}

					var10.im(
						var1,
						var2,
						var3,
						var22,
						(em)var78,
						(em)var79,
						256,
						var5,
						var52 * dt.ay_fld[var5],
						var52 * dt.as_fld[var5],
						dt.ay_fld[var74],
						dt.as_fld[var74],
						var26,
						var28
					);
				} else {
					client.ii_fld.debug("unknown loc type {}", var6);
				}
			} else {
				Object var43;
				if (var11.dc_fld == -1 && var11.dy_fld == null) {
					var43 = client.zi(var0.az_fld, var10, var11, var21, var6, var5, var6, var5, var1, var2, var3, var23, var22, var24);
				} else {
					dz var59 = new dz(var0, var4, var6, var5, var1, var2, var3, var11.dc_fld, var11.dp_fld, null);
					var59.ja_fld = var10;
					var43 = var59;
				}

				var10.hr(var1, var2, var3, var22, (em)var43, null, 16 << var5, 0, var26, var28);
				if (var11.dd_fld) {
					if (var5 == 0) {
						var9.ra_fld[var1][var18][var19 + 1] = 50;
					} else if (var5 == 1) {
						var9.ra_fld[var1][var18 + 1][var19 + 1] = 50;
					} else if (var5 == 2) {
						var9.ra_fld[var1][var18 + 1][var19] = 50;
					} else if (var5 == 3) {
						var9.ra_fld[var1][var18][var19] = 50;
					}
				}

				if (var11.cu_fld != 0 && var7 != null && var20) {
					var7.ea(var2, var3, var6, var5, var11.ci_fld);
				}
			}
		} else {
			Object var41;
			if (var11.dc_fld == -1 && var11.dy_fld == null) {
				var41 = client.zi(var0.az_fld, var10, var11, var21, var6, var5, 10, var5, var1, var2, var3, var23, var22, var24);
			} else {
				dz var56 = new dz(var0, var4, 10, var5, var1, var2, var3, var11.dc_fld, var11.dp_fld, null);
				var56.ja_fld = var10;
				var41 = var56;
			}

			if (var41 != null && var10.hk(var1, var2, var3, var22, var12, var13, (em)var41, var6 == 11 ? 256 : 0, var26, var28) && var11.dd_fld) {
				int var57 = 15;
				if (var41 instanceof fn) {
					fn var68 = (fn)var41;
					var68.calculateBoundsCylinder();
					var57 = var68.getXYZMag() / 4;
					if (var57 > 30) {
						var57 = 30;
					}
				}

				for (int var69 = 0; var69 <= var12; var69++) {
					for (int var32 = 0; var32 <= var13; var32++) {
						if (var57 > var9.ra_fld[var1][var69 + var18][var32 + var19]) {
							var9.ra_fld[var1][var69 + var18][var32 + var19] = (byte)var57;
						}
					}
				}
			}

			if (var11.cu_fld != 0 && var7 != null && var20) {
				var7.mf(var2, var3, var12, var13, var11.ci_fld);
			}
		}
	}
}
