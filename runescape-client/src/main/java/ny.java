import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("ny")
public class ny extends vc {
	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		descriptor = "Lwd;"
	)
	static wd ea_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ag_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	public static ub az_fld;
	@ObfuscatedName("km")
	@ObfuscatedSignature(
		descriptor = "Lar;"
	)
	static ar km_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ak_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lxv;"
	)
	xv ah_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	public static iw av_fld = new iw(64);
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 508058309
	)
	public int ae_fld = 0;

	@ObfuscatedName("qw")
	@ObfuscatedSignature(
		descriptor = "(Lny;Lxi;I)V"
	)
	public static void qw(ny var0, xi var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		switch (var2) {
			case 2:
				var0.ae_fld = var1.cm();
				break;
			case 249:
				var0.ah_fld = nc.ak(var1, var0.ah_fld);
		}
	}

	ny() {
	}

	@ObfuscatedName("jk")
	@ObfuscatedSignature(
		descriptor = "(Lwl;Z)V"
	)
	public static void jk(wl var0, boolean var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.cy_fld = !var1;
	}

	@ObfuscatedName("jf")
	@ObfuscatedSignature(
		descriptor = "(Lny;III)I"
	)
	public static int jf(ny var0, int var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		return my.ag(var0.ah_fld, var1, var2);
	}

	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		descriptor = "(Log;ILoo;)Z"
	)
	public static boolean hs(og var0, int var1, oo var2) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			int var3 = var0.fp_fld;
			int var4 = var0.fx_fld * -1833383098;
			int var5 = var0.fc_fld * -519574538;
			if (1 == var1) {
				var3 = 670677883 * var0.fj_fld;
				var4 = var0.fb_fld;
				var5 = var0.fh_fld;
			}

			if (var2 != null && var2.av(var1, -1275057540)) {
				var3 = var2.ah(var1, -1345698668);
			}

			if (-1 == var3) {
				return true;
			} else {
				boolean var6 = true;
				if (!bl.dm_fld.cc(var3, 0, -1760202119)) {
					var6 = false;
				}

				if (var4 != -1 && !bl.dm_fld.cc(var4, 0, -526884827)) {
					var6 = false;
				}

				if (var5 != -1 && !bl.dm_fld.cc(var5, 0, -1084017841)) {
					var6 = false;
				}

				return var6;
			}
		} catch (Throwable var8) {
			throw new RuntimeException(var8);
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Lny;"
	)
	public static ny aw(int var0) throws EOFException {
		try {
			ny var1 = (ny)av_fld.ak(var0);
			if (var1 != null) {
				return var1;
			} else {
				byte[] var2 = az_fld.bb(5, var0, 584982574);
				var1 = new ny();
				if (var2 != null) {
					var1.as(new xi(var2), -1888355235);
				}

				av_fld.az(var1, var0);
				return var1;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "(Lxi;IB)V"
	)
	static void hf(xi var0, int var1) {
		byte[] var3 = var0.al_fld;
		if (client.lr_fld == null) {
			client.lr_fld = new byte[24];
		}

		ya.ak(var3, var1, client.lr_fld, 0, 24);
		ln.ah(var0, var1);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Lny;"
	)
	public static ny ah(int var0) throws EOFException {
		try {
			ny var1 = (ny)av_fld.ak(var0);
			if (var1 != null) {
				return var1;
			} else {
				byte[] var2 = az_fld.bb(5, var0, 584982574);
				var1 = new ny();
				if (var2 != null) {
					var1.as(new xi(var2), 464188095);
				}

				av_fld.az(var1, var0);
				return var1;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	public int ax(int var1, int var2) {
		return my.ag(this.ah_fld, var1, var2);
	}

	@ObfuscatedName("xn")
	@ObfuscatedSignature(
		descriptor = "(Lny;Lxi;II)V"
	)
	public static void xn(ny var0, xi var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		switch (var2) {
			case 2:
				var0.ae_fld = var1.cm();
				break;
			case 249:
				var0.ah_fld = nc.ak(var1, var0.ah_fld);
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	void ay(xi var1) {
		while (true) {
			int var2 = var1.cg();
			if (0 == var2) {
				return;
			}

			xn(this, var1, var2);
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	void ar(xi var1, int var2) {
		switch (var2) {
			case 2:
				this.ae_fld = var1.cm() * -1132612789;
				break;
			case 249:
				this.ah_fld = nc.ak(var1, this.ah_fld);
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	public int au(int var1, int var2) {
		return my.ag(this.ah_fld, var1, var2);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	void ag(xi var1, int var2) {
		switch (var2) {
			case 2:
				this.ae_fld = var1.cm();
				break;
			case 249:
				this.ah_fld = nc.ak(var1, this.ah_fld);
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	public int al(int var1, int var2) {
		return my.ag(this.ah_fld, var1, var2);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	void as(xi var1, int var2) {
		while (true) {
			int var3 = var1.cg();
			if (0 == var3) {
				if (var2 == 276792336) {
					return;
				}

				return;
			}

			xn(this, var1, var3);
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;"
	)
	public String ae(int var1, String var2) {
		return ih.av(this.ah_fld, var1, var2);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;)Ljava/lang/String;"
	)
	public String an(int var1, String var2) {
		return ih.av(this.ah_fld, var1, var2);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;)Ljava/lang/String;"
	)
	public String aa(int var1, String var2) {
		return ih.av(this.ah_fld, var1, var2);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lxi;II)V"
	)
	void az(xi var1, int var2, int var3) {
		switch (var2) {
			case 2:
				this.ae_fld = var1.kz(623419993);
				break;
			case 249:
				this.ah_fld = nc.ak(var1, this.ah_fld);
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(III)I"
	)
	public int av(int var1, int var2, int var3) {
		return my.ag(this.ah_fld, var1, var2);
	}
}
