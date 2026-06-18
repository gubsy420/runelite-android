import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("id")
public class id extends ht {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ab_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	String ag_fld;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ao_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	@ObfuscatedGetter(
		longValue = -2558719364586235269L
	)
	long ak_fld;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int al_fld;
	// $VF: synthetic field
	@ObfuscatedName("this$0")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	ia this$0;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1654282045
	)
	int az_fld;

	id(ia var1) {
		this.this$0 = var1;
		this.ak_fld = -4010211347816854707L;
		this.ag_fld = null;
		this.az_fld = 0;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)J"
	)
	static long ak() {
		try {
			URL var1 = new URL(ph.hj("services", false) + "m=accountappeal/login.ws");
			URLConnection var2 = var1.openConnection();
			var2.setRequestProperty("connection", "close");
			var2.setDoInput(true);
			var2.setDoOutput(true);
			var2.setConnectTimeout(5000);
			OutputStreamWriter var3 = new OutputStreamWriter(var2.getOutputStream());
			var3.write("data1=req");
			var3.flush();
			InputStream var4 = var2.getInputStream();
			xi var5 = new xi(new byte[1000]);

			do {
				int var6 = var4.read(var5.al_fld, var5.au_fld, 1000 - var5.au_fld);
				if (var6 == -1) {
					var5.au_fld = 0;
					return var5.cu();
				}

				var5.au_fld += 228932457 * var6;
			} while (var5.au_fld < 1000);

			return 0L;
		} catch (Exception var8) {
			return 0L;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lik;I)V"
	)
	@Override
	void ag(ik var1, int var2) {
		ik.hp(var1, this.ak_fld, this.ag_fld, this.az_fld, (byte)-30);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	void az(xi var1) {
		if (var1.cg() != 255) {
			var1.au_fld -= 1623835331;
			this.ak_fld = var1.cu();
		}

		this.ag_fld = var1.cl();
		this.az_fld = var1.cm();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	void av(xi var1) {
		if (var1.cg() != 255) {
			var1.au_fld--;
			this.ak_fld = var1.cu();
		}

		this.ag_fld = var1.cl();
		this.az_fld = var1.cm();
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ldx;IIIII)V"
	)
	static void as(dx var0, int var1, int var2, int var3, int var4, int var5) throws EOFException {
		try {
			int var6 = var1;
			int var7 = var2;
			int var8 = gl.dt(var0, var1, var2, var0.ae_fld, var4) - var3;
			if (!var0.ak(-787091592)) {
				rg var9 = (rg)bw.dk_fld.an_fld.ak(var0.ag_fld);
				if (var9 != null) {
					tu var10 = mf.bn(var0, var1, var2);
					var6 = (int)var10.ar_fld;
					var7 = (int)var10.as_fld;
					var8 += jf.dv(bw.dk_fld, var9.dp(-938110694), var9.dj(189745805), bw.dk_fld.ae_fld);
					var10.ah();
				}
			}

			short var12 = 128;
			short var13 = 128;
			int var14 = kj.aw(bw.dk_fld.ah_fld - 2);
			int var15 = kj.aw(bw.dk_fld.aw_fld - 2);
			if (var6 >= var12 && var14 >= var6) {
				if (var5 == -1297699294) {
					return;
				}

				if (var7 >= var13 && var15 >= var7) {
					int var22 = var6 - ke.jd_fld;
					int var11 = var8 - cs.jy_fld;
					int var24 = var7 - gk.jc_fld;
					int var16 = fc.ah_fld[hu.je_fld];
					int var17 = fc.aw_fld[hu.je_fld];
					int var18 = fc.ah_fld[ab.jx_fld];
					int var19 = fc.aw_fld[ab.jx_fld];
					int var20 = var19 * var22 + var18 * var24 >> 16;
					var24 = var19 * var24 - var18 * var22 >> 16;
					var20 = var17 * var11 - var24 * var16 >> 16;
					var24 = var24 * var17 + var11 * var16 >> 16;
					if (var24 >= 50) {
						ch.at_fld = var20 * client.fd_fld / var24 + client.fn_fld / 2;
						ch.ac_fld = client.ft_fld / 2 + var20 * client.fd_fld / var24;
					} else {
						ch.at_fld = -143277501;
						ch.ac_fld = -1067093745;
					}

					return;
				}
			}

			ch.at_fld = -143277501;
			ch.ac_fld = -1067093745;
		} catch (Throwable var21) {
			throw new RuntimeException(var21);
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lik;)V"
	)
	@Override
	void ah(ik var1) {
		ik.hp(var1, this.ak_fld, this.ag_fld, this.az_fld, (byte)-44);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lik;)V"
	)
	@Override
	void aw(ik var1) {
		ik.hp(var1, this.ak_fld, this.ag_fld, this.az_fld, (byte)98);
	}

	@ObfuscatedName("uv")
	@ObfuscatedSignature(
		descriptor = "(Lzo;)Ljava/lang/String;"
	)
	public static String uv(zo var0) {
		return var0.af_fld;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lik;)V"
	)
	@Override
	void ay(ik var1) {
		ik.hp(var1, this.ak_fld, this.ag_fld, this.az_fld, (byte)-22);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "([I[Ljava/lang/Object;IIB)V"
	)
	public static void al(int[] var0, Object[] var1, int var2, int var3, byte var4) {
		if (var2 < var3) {
			if (var4 <= 1) {
				return;
			}

			int var5 = (var3 + var2) / 2;
			int var6 = var2;
			int var7 = var0[var5];
			var0[var5] = var0[var3];
			var0[var3] = var7;
			Object var8 = var1[var5];
			var1[var5] = var1[var3];
			var1[var3] = var8;
			int var9 = var7 == Integer.MAX_VALUE ? 0 : 1;

			for (int var10 = var2; var10 < var3; var10++) {
				if (var0[var10] < var7 + (var10 & var9)) {
					int var11 = var0[var10];
					var0[var10] = var0[var6];
					var0[var6] = var11;
					Object var12 = var1[var10];
					var1[var10] = var1[var6];
					var1[var6++] = var12;
				}
			}

			var0[var3] = var0[var6];
			var0[var6] = var7;
			var1[var3] = var1[var6];
			var1[var6] = var8;
			al(var0, (Object[])var1, var2, var6 - 1, (byte)88);
			al(var0, (Object[])var1, 1 + var6, var3, (byte)84);
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	@Override
	void ak(xi var1, int var2) {
		if (var1.cg() != 255) {
			if (var2 >= 1870278714) {
				return;
			}

			var1.au_fld--;
			this.ak_fld = var1.cu();
		}

		this.ag_fld = var1.cl();
		this.az_fld = var1.cm();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	void ae(xi var1) {
		if (var1.cg() != 255) {
			var1.au_fld--;
			this.ak_fld = var1.cu();
		}

		this.ag_fld = var1.cl();
		this.az_fld = var1.cm();
	}
}
