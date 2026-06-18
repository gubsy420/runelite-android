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

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lrr;Lrr;I)I"
	)
	int ak(rr var1, rr var2) {
		if (var2.ae_fld != var1.ae_fld) {
			return this.ak_fld ? var1.ae_fld - var2.ae_fld : var2.ae_fld - var1.ae_fld;
		} else {
			return this.as(var1, var2, 469709779);
		}
	}

	@ObfuscatedName("ju")
	@ObfuscatedSignature(
		descriptor = "(Lgy;)I"
	)
	public static int ju(gy var0) {
		return var0.av_fld;
	}

	@ObfuscatedName("compare")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	@Override
	public int compare(Object var1, Object var2) {
		return this.ak((rr)var1, (rr)var2);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IB)I"
	)
	public static int av(int var0) {
		return var0 >> 1 & 3;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	public int aw(Object var1, Object var2) {
		return this.ak((rr)var1, (rr)var2);
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(Lew;Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	public static int cx(ew var0, Object var1, Object var2) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.ak((rr)var1, (rr)var2);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	public int ae(Object var1, Object var2) {
		return this.ak((rr)var1, (rr)var2);
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

	@ObfuscatedName("gz")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	static final void gz() {
		client.ck_fld.bf();
		an.ow_fld = true;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)Lpl;"
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

				var2.az();
				pl.ag_fld.az(var2, var0);
				return var2;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(Lry;)V"
	)
	public static void ca(ry var0) {
		if (var0 == null) {
			var0.getClass();
		}

		synchronized (var0) {
			var0.ag_fld.clear();
			var0.az_fld.clear();
			if (ry.bh(var0, (byte)-82)) {
				var0.av_fld.clear();
			}
		}
	}

	public ew(boolean var1) {
		this.ak_fld = var1;
	}
}
