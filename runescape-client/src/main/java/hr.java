import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.worldmap.WorldMapIcon;

@ObfuscatedName("hr")
@Implements({"WorldMapIcon"})
public abstract class hr implements WorldMapIcon {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	public kj aw_fld;
	@ObfuscatedGetter(
		intValue = 1665745171
	)
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int as_fld;
	@ObfuscatedGetter(
		intValue = 852162983
	)
	@ObfuscatedName("pr")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int pr_fld;
	@ObfuscatedGetter(
		intValue = 90492281
	)
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ar_fld;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int aq_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	public kj ay_fld;

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	abstract int ae(int var1);

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	boolean ab(int var1, int var2) {
		return this.am(var1, var2, -1046050596) ? true : po(this, var1, var2, (byte)32);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public abstract int ag(int var1);

	hr(kj var1, kj var2) {
		this.ay_fld = var1;
		this.aw_fld = var2;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	abstract int av(int var1);

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	abstract int an();

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)Z"
	)
	boolean aq(byte var1) {
		return this.ag(-1725868710) >= 0;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(III)Z"
	)
	boolean am(int var1, int var2, int var3) {
		if (!this.aq((byte)15)) {
			return false;
		} else {
			pc var4 = uh.ak(this.ag(-1623272956));
			int var5 = this.av(-439138433);
			int var6 = this.ae(-2048804544);
			switch (-1817025895 * var4.ao_fld.av_fld) {
				case 0:
					if (var1 < this.as_fld - var5 / 2 || var1 > this.as_fld + var5 / 2) {
						return false;
					}
					break;
				case 1:
					if (var1 < this.as_fld || var1 >= this.as_fld + var5) {
						return false;
					}
					break;
				case 2:
					if (var1 <= this.as_fld - var5 || var1 > this.as_fld) {
						return false;
					}
			}

			switch (var4.ab_fld.av_fld * 1567188249) {
				case 0:
					if (var2 >= this.ar_fld && var2 < this.ar_fld + var6) {
						break;
					}

					return false;
				case 1:
					if (var2 >= this.ar_fld - var6 / 2 && var2 <= var6 / 2 + this.ar_fld) {
						break;
					}

					return false;
				case 2:
					if (var2 <= this.ar_fld - var6 || var2 > this.ar_fld) {
						return false;
					}
			}

			return true;
		}
	}

	@ObfuscatedName("ma")
	@ObfuscatedSignature(
		descriptor = "()Lkj;"
	)
	public kj ma() {
		return this.aw_fld;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "()Lgw;"
	)
	abstract gw af();

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public abstract int ar();

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public abstract int as();

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "()Lgw;"
	)
	abstract gw au();

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "()Lgw;"
	)
	abstract gw al();

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	abstract int ax();

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	abstract int aa();

	@ObfuscatedName("getCoordinate")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/coords/WorldPoint;"
	)
	@Override
	public WorldPoint getCoordinate() {
		kj var1 = this.ma();
		return new WorldPoint(var1.ag_fld, var1.az_fld, var1.ak_fld);
	}

	@ObfuscatedName("po")
	@ObfuscatedSignature(
		descriptor = "(Lhr;IIB)Z"
	)
	public static boolean po(hr var0, int var1, int var2, byte var3) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			gw var4 = var0.az(2123249281);
			if (null == var4) {
				return false;
			} else {
				return var1 < var0.as_fld - var4.az_fld / 2 || var1 > var4.az_fld / 2 + var0.as_fld ? false : var2 >= var0.ar_fld && var2 <= var0.ar_fld + var4.ag_fld;
			}
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean at() {
		return this.ag(33109692) >= 0;
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(Lhr;II)Z"
	)
	public static boolean bv(hr var0, int var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		gw var3 = var0.az(627104774);
		if (null == var3) {
			return false;
		} else {
			return var1 < var0.as_fld - var3.az_fld / 2 || var1 > var3.az_fld / 2 + var0.as_fld ? false : var2 >= var0.ar_fld && var2 <= var0.ar_fld + var3.ag_fld;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	boolean ap(int var1, int var2) {
		gw var3 = this.az(849367028);
		if (null == var3) {
			return false;
		} else {
			return var1 < this.as_fld - var3.az_fld / 2 || var1 > var3.az_fld / 2 + this.as_fld ? false : var2 >= this.ar_fld && var2 <= this.ar_fld + var3.ag_fld;
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	boolean be(int var1, int var2) {
		return this.am(var1, var2, -1046050596) ? true : po(this, var1, var2, (byte)38);
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	boolean bm(int var1, int var2) {
		return this.am(var1, var2, -1046050596) ? true : po(this, var1, var2, (byte)5);
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	boolean bd(int var1, int var2) {
		gw var3 = this.az(1863916950);
		if (null == var3) {
			return false;
		} else {
			return var1 < this.as_fld - var3.az_fld / 2 || var1 > var3.az_fld / 2 + this.as_fld ? false : var2 >= this.ar_fld && var2 <= this.ar_fld + var3.ag_fld;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Lgw;"
	)
	abstract gw az(int var1);

	@ObfuscatedName("getType")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getType() {
		return this.ag(1458166108);
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	boolean br(int var1, int var2) {
		if (!this.aq((byte)91)) {
			return false;
		} else {
			pc var3 = uh.ak(this.ag(1352234420));
			int var4 = this.av(1380159699);
			int var5 = this.ae(-2045721724);
			switch (-1817025895 * var3.ao_fld.av_fld) {
				case 0:
					if (var1 < this.as_fld - var4 / 2 || var1 > this.as_fld + var4 / 2) {
						return false;
					}
					break;
				case 1:
					if (var1 < this.as_fld || var1 >= this.as_fld + var4) {
						return false;
					}
					break;
				case 2:
					if (var1 <= this.as_fld - var4 || var1 > this.as_fld) {
						return false;
					}
			}

			switch (var3.ab_fld.av_fld * 1567188249) {
				case 0:
					if (var2 < this.ar_fld || var2 >= this.ar_fld + var5) {
						return false;
					}
					break;
				case 1:
					if (var2 < this.ar_fld - var5 / 2 || var2 > var5 / 2 + this.ar_fld) {
						return false;
					}
					break;
				case 2:
					if (var2 <= this.ar_fld - var5 || var2 > this.ar_fld) {
						return false;
					}
			}

			return true;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	boolean ao(int var1, int var2) {
		gw var3 = this.az(727951656);
		if (null == var3) {
			return false;
		} else {
			return var1 < this.as_fld - var3.az_fld / 2 || var1 > var3.az_fld / 2 + this.as_fld ? false : var2 >= this.ar_fld && var2 <= this.ar_fld + var3.ag_fld;
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z"
	)
	boolean ai(int var1, int var2, byte var3) {
		return this.am(var1, var2, -1046050596) ? true : po(this, var1, var2, (byte)74);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean aj() {
		return this.ag(-870109537) >= 0;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)Ljava/lang/String;"
	)
	public static String ag(xi var0) {
		return es.az(var0, 32767);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z"
	)
	boolean ad(int var1, int var2, byte var3) {
		gw var4 = this.az(2123249281);
		if (null == var4) {
			return false;
		} else {
			return var1 < this.ar_fld - var4.az_fld / 2 || var1 > var4.az_fld / 2 + this.as_fld ? false : var2 >= this.ar_fld && var2 <= this.ar_fld + var4.ag_fld;
		}
	}
}
