import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("pn")
public class pn extends vc {
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	public static iw ah_fld = new iw(16);
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ag_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int az_fld;
	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int cm_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] ay_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lwn;"
	)
	wn as_fld = new wn();
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lwh;"
	)
	wh ar_fld = new wh();
	@ObfuscatedName("ia")
	@ObfuscatedSignature(
		descriptor = "Luv;"
	)
	static uv ia_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ak_fld;
	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int bb_fld;
	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bq_fld;

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	void ax(xi var1) {
		for (int var2 = var1.cg(); var2 != 0; var2 = var1.cg()) {
			this.av(var1, var2);
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	void az(xi var1) {
		for (int var3 = var1.cg(); var3 != 0; var3 = var1.cg()) {
			this.av(var1, var3);
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	void av(xi var1, int var2) {
		switch (var2) {
			case 1:
				int var9 = var1.cg();
				this.ay_fld = new int[var9];

				for (int var12 = 0; var12 < var9; var12++) {
					this.ay_fld[var12] = xi.tx(var1, 1938426100);
				}
				break;
			case 2:
				this.as_fld.ag_fld = xi.tx(var1, 477534921);
				this.as_fld.az_fld = xi.tx(var1, 1074963345);
				int var8 = var1.cg();
				this.as_fld.ak_fld = new int[var8];

				for (int var11 = 0; var11 < var8; var11++) {
					this.as_fld.ak_fld[var11] = xi.tx(var1, 441082376);
				}
				break;
			case 3:
				wh var7 = this.ar_fld;
				int var13 = var1.cg();
				zm var10 = zm.br_fld[var13];
				var7.ak(var10, xi.tx(var1, 1253971122));
				break;
			case 4:
				wh var4 = this.ar_fld;
				int var6 = var1.cg();
				zm var5 = zm.br_fld[var6];
				var4.ag(var5, xi.tx(var1, 1490088789));
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ao() {
		return this.ay_fld.length;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int ah(int var1) {
		return this.ay_fld[var1];
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Lpn;"
	)
	public static pn al(int var0) throws EOFException {
		try {
			pn var1 = (pn)ah_fld.ak(var0);
			if (var1 != null) {
				return var1;
			} else {
				byte[] var2 = ou.aw_fld.bb(15, var0, 584982574);
				var1 = new pn();
				if (null != var2) {
					var1.az(new xi(var2));
				}

				ah_fld.az(var1, var0);
				return var1;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("xp")
	@ObfuscatedSignature(
		descriptor = "(Lda;)I"
	)
	public static int xp(da var0) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.bv_fld;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lub;)V"
	)
	public static void as(ub var0) {
		ou.aw_fld = var0;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lub;)V"
	)
	public static void ar(ub var0) {
		ou.aw_fld = var0;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Lpn;"
	)
	public static pn af(int var0) throws EOFException {
		try {
			pn var1 = (pn)ah_fld.ak(var0);
			if (var1 != null) {
				return var1;
			} else {
				byte[] var2 = ou.aw_fld.bb(15, var0, 584982574);
				var1 = new pn();
				if (null != var2) {
					var1.az(new xi(var2));
				}

				ah_fld.az(var1, var0);
				return var1;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Lpn;"
	)
	public static pn au(int var0) throws EOFException {
		try {
			pn var1 = (pn)ah_fld.ak(var0);
			if (var1 != null) {
				return var1;
			} else {
				byte[] var2 = ou.aw_fld.bb(15, var0, 584982574);
				var1 = new pn();
				if (null != var2) {
					var1.az(new xi(var2));
				}

				ah_fld.az(var1, var0);
				return var1;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "(Lpn;I)Lwn;"
	)
	public static wn dx(pn var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.as_fld;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ai() {
		return this.ay_fld.length;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	void an(xi var1, int var2) {
		switch (var2) {
			case 1:
				int var8 = var1.cg();
				this.ay_fld = new int[var8];

				for (int var11 = 0; var11 < var8; var11++) {
					this.ay_fld[var11] = xi.tx(var1, 511306621);
				}
				break;
			case 2:
				this.as_fld.ag_fld = xi.tx(var1, 1132167968);
				this.as_fld.az_fld = xi.tx(var1, 2040986830);
				int var7 = var1.cg();
				this.as_fld.ak_fld = new int[var7];

				for (int var10 = 0; var10 < var7; var10++) {
					this.as_fld.ak_fld[var10] = xi.tx(var1, 1493998891);
				}
				break;
			case 3:
				wh var6 = this.ar_fld;
				int var12 = var1.cg();
				zm var9 = zm.br_fld[var12];
				var6.ak(var9, xi.tx(var1, 1707250344));
				break;
			case 4:
				wh var3 = this.ar_fld;
				int var5 = var1.cg();
				zm var4 = zm.br_fld[var5];
				var3.ag(var4, xi.tx(var1, 779161764));
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "()Lwh;"
	)
	public wh aj() {
		return this.ar_fld;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int aq() {
		return this.ay_fld.length;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "()Lwh;"
	)
	public wh bm() {
		return this.ar_fld;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()Lwh;"
	)
	public wh ay() {
		return this.ar_fld;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int ae(int var1) {
		return this.ay_fld[var1];
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int am(int var1) {
		return this.ay_fld[var1];
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "()Lwn;"
	)
	public wn ap() {
		return this.as_fld;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "()Lwn;"
	)
	public wn at() {
		return this.as_fld;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int ad(int var1) {
		return this.ay_fld[var1];
	}

	pn() {
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Lwn;"
	)
	public wn aw(int var1) {
		return this.as_fld;
	}
}
