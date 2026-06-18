import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("hp")
public class hp {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ak_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ag_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int av_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int as_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ah_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int az_fld;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int au_fld;

	hp() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)[B"
	)
	public static byte[] ak(CharSequence var0) {
		int var2 = var0.length();
		byte[] var3 = new byte[var2];

		for (int var4 = 0; var4 < var2; var4++) {
			char var5 = var0.charAt(var4);
			if (var5 > 127) {
				var3[var4] = 63;
			} else {
				var3[var4] = (byte)var5;
			}
		}

		return var3;
	}

	@ObfuscatedName("fr")
	@ObfuscatedSignature(
		descriptor = "(ILpp;IZLds;Ljava/lang/String;IIIII)V"
	)
	static void fr(int var0, pp var1, int var2, boolean var3, ds var4, String var5, int var6, int var7, int var8, int var9, int var10) throws EOFException {
		if (pp.ij(var1, (byte)44).ak(1022863144)) {
			for (int var11 = 4; var11 >= 0; var11--) {
				if (!client.cp_fld) {
					if (tl.ks_fld) {
						continue;
					}

					if (!var4.aw(var11, (byte)120)) {
						if (var10 >= -995767115) {
							return;
						}
						continue;
					}
				}

				String var12 = pp.ij(var1, (byte)52).ae(var11, rt.ag_fld, 1899227782);
				if (var3) {
					if (null == var12) {
						continue;
					}

					if (var10 >= -995767115) {
						return;
					}

					if (!var12.equalsIgnoreCase(kh.hb_fld)) {
						continue;
					}
				}

				if (!var3 && var12 != null) {
					if (var10 >= -995767115) {
						return;
					}

					if (var12.equalsIgnoreCase(kh.hb_fld)) {
						continue;
					}
				}

				if (client.cp_fld) {
					var12 = be(var12, var11);
				}

				if (null != var12 && (!var3 || client.lw_fld != ca.av_fld)) {
					label115: {
						label154: {
							if (var3) {
								if (client.lw_fld == ca.ag_fld) {
									break label154;
								}

								if (var10 >= -995767115) {
									return;
								}
							}

							if (ca.ak_fld != client.lw_fld) {
								break label115;
							}

							if (var10 >= -995767115) {
								return;
							}

							if (var1.dx_fld <= var2) {
								break label115;
							}
						}

						var0 = 2000;
					}

					int var13 = 0;
					if (var11 == 0) {
						if (var10 >= -995767115) {
							return;
						}

						var13 = var0 + 9;
					}

					if (var11 == 1) {
						var13 = var0 + 10;
					}

					if (var11 == 2) {
						var13 = 11 + var0;
					}

					if (var11 == 3) {
						if (var10 >= -995767115) {
							return;
						}

						var13 = 12 + var0;
					}

					if (4 == var11) {
						if (var10 >= -995767115) {
							return;
						}

						var13 = 13 + var0;
					}

					int var14 = ky.fl(var12, var5, var13, var6, var7, var8, -1, false, var9);
					pg.fs(var14, pp.ij(var1, (byte)21), var11, var5, var13, var6, var7, var8, var9, -1355642205);
				}
			}
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)Ljava/lang/String;"
	)
	public static final String be(String var0, int var1) {
		if (null == var0) {
			var0 = var1 + 1 + ": TEST";
		} else {
			var0 = var1 + 1 + ": " + var0;
		}

		return var0;
	}
}
