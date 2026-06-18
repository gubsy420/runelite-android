import java.io.EOFException;
import net.runelite.api.GrandExchangeOffer;
import net.runelite.api.GrandExchangeOfferState;
import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("nb")
@Implements({"GrandExchangeOffer"})
public class nb implements GrandExchangeOffer {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -2082911
	)
	public int ag_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1164425433
	)
	public int ae_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -220330603
	)
	public int az_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "B"
	)
	byte ak_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -701801723
	)
	public int ah_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 626220965
	)
	public int av_fld;

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Integer;)V"
	)
	void ah(Integer var1) {
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Integer;B)V"
	)
	void ak(Integer var1, byte var2) {
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int aa() {
		return this.ak_fld & 7;
	}

	@ObfuscatedName("st")
	@ObfuscatedSignature(
		descriptor = "(Lui;Llu;)V"
	)
	public static void st(ui var0, lu var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ag_fld = var1;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int ag(int var1) {
		return this.ak_fld & 7;
	}

	@ObfuscatedName("getItemId")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getItemId")
	@Override
	public int getItemId() {
		return this.ag_fld;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	public int av(byte var1) {
		return (this.ak_fld & 8) == 8 ? 1 : 0;
	}

	public nb() {
	}

	public nb(xi var1, boolean var2) {
		this.ak_fld = var1.cw();
		this.ag_fld = var1.cm();
		this.az_fld = var1.co((byte)-8);
		this.av_fld = var1.co((byte)-128);
		this.ae_fld = var1.co((byte)-59);
		this.ah_fld = var1.co((byte)-84);
		if (var2) {
			int var4 = 0;
			boolean var5 = false;

			while (true) {
				int var6 = var1.cg();
				if (255 == var6) {
					Integer var3 = var5 ? var4 : null;
					this.ak(var3, (byte)-33);
					break;
				}

				if (var6 != 0) {
					throw new IllegalStateException("");
				}

				while (true) {
					int var7 = var1.cg();
					if (var7 == 255) {
						break;
					}

					var1.au_fld--;
					if (var1.cm() != 0) {
						throw new IllegalStateException("");
					}

					var4 = var1.co((byte)2);
					var5 = true;
				}
			}
		}
	}

	@ObfuscatedName("ve")
	@ObfuscatedSignature(
		descriptor = "()B"
	)
	public byte ve() {
		return this.ak_fld;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Integer;)V"
	)
	void aw(Integer var1) {
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ar() {
		return this.ak_fld & 7;
	}

	@ObfuscatedName("es")
	@ObfuscatedSignature(
		descriptor = "(Lnb;I)V"
	)
	public static void es(nb var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ak_fld = (byte)(var0.ak_fld & 1433125605);
		if (1 == var1) {
			var0.ak_fld = (byte)(var0.ak_fld | 8);
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void al(int var1) {
		this.ak_fld = (byte)(this.ak_fld & 861829633);
		this.ak_fld = (byte)(this.ak_fld | var1 & 7);
	}

	@ObfuscatedName("getPrice")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getPrice")
	@Override
	public int getPrice() {
		return this.az_fld;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void au(int var1) {
		this.ak_fld &= -8;
		this.ak_fld = (byte)(this.ak_fld | var1 & 7);
	}

	@ObfuscatedName("getTotalQuantity")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getTotalQuantity")
	@Override
	public int getTotalQuantity() {
		return this.av_fld;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void af(int var1) {
		this.ak_fld = (byte)(this.ak_fld & -881307288);
		this.ak_fld = (byte)(this.ak_fld | var1 & 7);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void an(int var1) {
		this.ak_fld &= -8;
		this.ak_fld = (byte)(this.ak_fld | var1 & 7);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void az(int var1, int var2) {
		this.ak_fld &= -8;
		this.ak_fld = (byte)(this.ak_fld | var1 & 7);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void ax(int var1) {
		this.ak_fld &= -8;
		this.ak_fld = (byte)(this.ak_fld | var1 & 7);
	}

	@ObfuscatedName("jk")
	@ObfuscatedSignature(
		descriptor = "(Llp;II)V"
	)
	public static void jk(lp var0, int var1, int var2) throws EOFException {
		try {
			var0.al_fld[var1] = var2;
			var0.au((short)4229);
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ai() {
		return (this.ak_fld & 8) == 8 ? 1 : 0;
	}

	@ObfuscatedName("getState")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/GrandExchangeOfferState;"
	)
	@Export("getState")
	@Override
	public GrandExchangeOfferState getState() {
		byte var1 = this.ve();
		boolean var2 = (var1 & 8) == 8;
		boolean var3 = (var1 & 4) == 4;
		if (var1 == 0) {
			return GrandExchangeOfferState.EMPTY;
		} else if (var3 && this.getQuantitySold() < this.getTotalQuantity()) {
			return var2 ? GrandExchangeOfferState.CANCELLED_SELL : GrandExchangeOfferState.CANCELLED_BUY;
		} else if (var2) {
			return var3 ? GrandExchangeOfferState.SOLD : GrandExchangeOfferState.SELLING;
		} else {
			return var3 ? GrandExchangeOfferState.BOUGHT : GrandExchangeOfferState.BUYING;
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int aq() {
		return (this.ak_fld & 8) == 8 ? 1 : 0;
	}

	@ObfuscatedName("getSpent")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getSpent")
	@Override
	public int getSpent() {
		return this.ah_fld;
	}

	@ObfuscatedName("ok")
	@ObfuscatedSignature(
		descriptor = "(Lnb;II)V"
	)
	public static void ok(nb var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.ak_fld &= -9;
			if (1 == var1) {
				var0.ak_fld = (byte)(var0.ak_fld | 8);
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(CI)Z"
	)
	static final boolean az(char var0) {
		return var0 == 160 || ' ' == var0 || var0 == '_' || '-' == var0;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lsl;IB)V"
	)
	static void ae(sl var0, int var1, byte var2) {
		if (var1 >= 0) {
			if (var2 <= 48) {
				return;
			}

			if (var1 < var0.av()) {
				return;
			}
		}

		throw new RuntimeException();
	}

	@ObfuscatedName("ms")
	@ObfuscatedSignature(
		descriptor = "(Lmw;)Z"
	)
	public static boolean ms(mw var0) {
		return var0.aw_fld.al_fld != null;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ay() {
		return (this.ak_fld & 8) == 8 ? 1 : 0;
	}

	@ObfuscatedName("getQuantitySold")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getQuantitySold")
	@Override
	public int getQuantitySold() {
		return this.ae_fld;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void ae(int var1, int var2) {
		this.ak_fld &= -9;
		if (1 == var1) {
			this.ak_fld = (byte)(this.ak_fld | 8);
		}
	}
}
