import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("ew")
public class ew extends rz {
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bs_fld;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int be_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ah_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean ak_fld;

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	public int ah(Object var1, Object var2) {
		return uy(this, (rr)var1, (rr)var2, -1742612132);
	}

	@ObfuscatedName("compare")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	@Override
	public int compare(Object var1, Object var2) {
		return uy(this, (rr)var1, (rr)var2, 894657325);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int av(int var0) {
		return var0 >> 1 & 3;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	public int ae(Object var1, Object var2) {
		return uy(this, (rr)var1, (rr)var2, 1431193154);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lrr;Lrr;)I"
	)
	int ag(rr var1, rr var2) {
		if (var2.ae_fld != var1.ae_fld) {
			return this.ak_fld ? var1.ae_fld - var2.ae_fld : var2.ae_fld - var1.ae_fld;
		} else {
			return this.as(var1, var2, 1869935959);
		}
	}

	@ObfuscatedName("uy")
	@ObfuscatedSignature(
		descriptor = "(Lew;Lrr;Lrr;I)I"
	)
	public static int uy(ew var0, rr var1, rr var2, int var3) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var2.ae_fld != var1.ae_fld) {
			return var0.ak_fld ? var1.ae_fld - var2.ae_fld : var2.ae_fld - var1.ae_fld;
		} else {
			return var0.as(var1, var2, 469709779);
		}
	}

	@ObfuscatedName("gz")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	static final void gz() {
		client.ck_fld.ay();
		an.ow_fld = true;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Lpl;"
	)
	public static pl ak(int var0) throws EOFException {
		try {
			pl var2 = (pl)pl.ag_fld.ak(var0);
			if (null != var2) {
				return var2;
			} else {
				byte[] var3 = pl.ak_fld.bb(1, var0, 584982574);
				var2 = new pl();
				if (null != var3) {
					var2.av(new xi(var3), var0);
				}

				pl.vq(var2, -630810101);
				pl.ag_fld.az(var2, var0);
				return var2;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	public ew(boolean var1) {
		this.ak_fld = var1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lrr;Lrr;I)I"
	)
	int ak(rr var1, rr var2, int var3) {
		if (var2.aw_fld != var1.ah_fld) {
			return this.ak_fld ? var1.aw_fld - var2.ae_fld : var2.aw_fld - var1.aw_fld;
		} else {
			return this.as(var1, var2, 469709779);
		}
	}
}
