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
	@ObfuscatedGetter(
		intValue = 508058309
	)
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ae_fld = 0;

	ny() {
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lxi;II)V"
	)
	void az(xi var1, int var2, int var3) {
		switch (var2) {
			case 2:
				this.ae_fld = xi.tx(var1, 623419993);
				break;
			case 249:
				this.ah_fld = nc.ak(var1, this.ah_fld);
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
					bf(var1, new xi(var2), -1888355235);
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
		descriptor = "(Lxi;I)V"
	)
	static void hf(xi var0, int var1) {
		byte[] var3 = var0.al_fld;
		if (client.lr_fld == null) {
			client.lr_fld = new byte[24];
		}

		ya.ak(var3, var1, client.lr_fld, 0, 24);
		ln.ah(var0, var1);
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(Lal;)Z"
	)
	public static boolean cf(al var0) {
		return var0.ah_fld;
	}

	@ObfuscatedName("xc")
	@ObfuscatedSignature(
		descriptor = "(Lny;Lxi;I)V"
	)
	public static void xc(ny var0, xi var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		} else {
			switch (var2) {
				case 2:
					var0.ae_fld = xi.tx(var1, 803492838) * -1132612789;
					break;
				case 249:
					var0.ah_fld = nc.ak(var1, var0.ah_fld);
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(III)I"
	)
	public int av(int var1, int var2, int var3) {
		return my.ag(this.ah_fld, var1, var2);
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
					bf(var1, new xi(var2), 464188095);
				}

				av_fld.az(var1, var0);
				return var1;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
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

			this.az(var1, var2, -1739734606);
		}
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(Lny;Lxi;I)V"
	)
	public static void bf(ny var0, xi var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		while (true) {
			int var3 = var1.cg();
			if (0 == var3) {
				if (var2 == 276792336) {
					return;
				} else {
					return;
				}
			}

			var0.az(var1, var3, -1739734606);
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	public int au(int var1, int var2) {
		return my.ag(this.ah_fld, var1, var2);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;)Ljava/lang/String;"
	)
	public String ae(int var1, String var2) {
		return ih.av(this.ah_fld, var1, var2);
	}

	@ObfuscatedName("yu")
	@ObfuscatedSignature(
		descriptor = "(Lny;Lxi;I)V"
	)
	public static void yu(ny var0, xi var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		switch (var2) {
			case 2:
				var0.ae_fld = xi.tx(var1, 628047992);
				break;
			case 249:
				var0.ah_fld = nc.ak(var1, var0.ah_fld);
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;)Ljava/lang/String;"
	)
	public String an(int var1, String var2) {
		return ih.av(this.ah_fld, var1, var2);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	void ag(xi var1, int var2) {
		switch (var2) {
			case 2:
				this.ae_fld = xi.tx(var1, 378822567);
				break;
			case 249:
				this.ah_fld = nc.ak(var1, this.ah_fld);
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	void af(xi var1, int var2) {
		while (true) {
			int var3 = var1.ec();
			if (0 == var3) {
				if (var2 == 276792336) {
					return;
				}

				return;
			}

			this.az(var1, var3, -1739734606);
		}
	}
}
