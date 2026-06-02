import net.runelite.api.GrandExchangeOffer;
import net.runelite.api.GrandExchangeOfferState;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("nb")
@Implements({"GrandExchangeOffer"})
public class nb implements GrandExchangeOffer {
	@ObfuscatedGetter(
		intValue = -2082911
	)
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ah_fld;
	@ObfuscatedGetter(
		intValue = -1164425433
	)
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int az_fld;
	@ObfuscatedGetter(
		intValue = -220330603
	)
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int av_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "B"
	)
	byte ak_fld;
	@ObfuscatedGetter(
		intValue = -701801723
	)
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ae_fld;
	@ObfuscatedGetter(
		intValue = 626220965
	)
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ag_fld;

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Integer;)V"
	)
	void ah(Integer var1) {
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

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Integer;B)V"
	)
	void ak(Integer var1, byte var2) {
	}

	@ObfuscatedName("getTotalQuantity")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getTotalQuantity() {
		return this.ag_fld;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ar() {
		return this.ak_fld & 7;
	}

	@ObfuscatedName("getSpent")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getSpent() {
		return this.ae_fld;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int ag(int var1) {
		return this.ak_fld & 7;
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
		this.ak_fld = xi.rp(var1, -448318265);
		this.ah_fld = xi.tx(var1, 1183463577);
		this.av_fld = var1.co();
		this.ag_fld = var1.co();
		this.az_fld = var1.co();
		this.ae_fld = var1.co();
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
					if (xi.tx(var1, 1078368666) != 0) {
						throw new IllegalStateException("");
					}

					var4 = var1.co();
					var5 = true;
				}
			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Integer;)V"
	)
	void aw(Integer var1) {
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int as() {
		return this.ak_fld & 7;
	}

	@ObfuscatedName("qx")
	@ObfuscatedSignature(
		descriptor = "(Lnb;I)V"
	)
	public static void qx(nb var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ak_fld &= -8;
		var0.ak_fld = (byte)(var0.ak_fld | var1 & 7);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void ax(int var1) {
		this.ak_fld = (byte)(this.ak_fld & 861829633);
		this.ak_fld = (byte)(this.ak_fld | var1 & 7);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void af(int var1) {
		this.ak_fld &= -8;
		this.ak_fld = (byte)(this.ak_fld | var1 & 7);
	}

	@ObfuscatedName("getState")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/GrandExchangeOfferState;"
	)
	@Override
	public GrandExchangeOfferState getState() {
		byte var1 = this.na();
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

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void al(int var1) {
		this.ak_fld = (byte)(this.ak_fld & -881307288);
		this.ak_fld = (byte)(this.ak_fld | var1 & 7);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void au(int var1) {
		this.ak_fld &= -8;
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

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int aa() {
		return (this.ak_fld & 8) == 8 ? 1 : 0;
	}

	@ObfuscatedName("getItemId")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getItemId() {
		return this.ah_fld;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ai() {
		return (this.ak_fld & 8) == 8 ? 1 : 0;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(C)Z"
	)
	static final boolean az(char var0) {
		return var0 == 160 || ' ' == var0 || var0 == '_' || '-' == var0;
	}

	@ObfuscatedName("na")
	@ObfuscatedSignature(
		descriptor = "()B"
	)
	public byte na() {
		return this.ak_fld;
	}

	@ObfuscatedName("getQuantitySold")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getQuantitySold() {
		return this.az_fld;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void am(int var1) {
		this.ak_fld = (byte)(this.ak_fld & 1433125605);
		if (1 == var1) {
			this.ak_fld = (byte)(this.ak_fld | 8);
		}
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

	@ObfuscatedName("getPrice")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getPrice() {
		return this.av_fld;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int aq() {
		return (this.ak_fld & 8) == 8 ? 1 : 0;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void az(int var1, int var2) {
		this.ak_fld &= -8;
		this.ak_fld = (byte)(this.ak_fld | var1 & 7);
	}
}
