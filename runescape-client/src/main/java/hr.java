import java.util.Iterator;
import net.runelite.api.annotations.Export;
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
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1665745171
	)
	int ar_fld;
	@ObfuscatedName("pr")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 852162983
	)
	static int pr_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 90492281
	)
	int as_fld;
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

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	abstract int av(int var1);

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	boolean ao(int var1, int var2) {
		return pq(this, var1, var2) ? true : this.ad(var1, var2, (byte)32);
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

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	abstract int ae(int var1);

	@ObfuscatedName("pq")
	@ObfuscatedSignature(
		descriptor = "(Lhr;III)Z"
	)
	public static boolean pq(hr var0, int var1, int var2) {
		if (var0 == null) {
			throw new NullPointerException();
		} else if (!var0.aq((byte)15)) {
			return false;
		} else {
			pc var4 = uh.ak(var0.ag(-1623272956));
			int var5 = var0.ae(-439138433);
			int var6 = var0.av(-2048804544);
			switch (-1817025895 * var4.ao_fld.av_fld) {
				case 0:
					if (var1 < var0.ar_fld - var5 / 2 || var1 > var0.ar_fld + var5 / 2) {
						return false;
					}
					break;
				case 1:
					if (var1 < var0.ar_fld || var1 >= var0.ar_fld + var5) {
						return false;
					}
					break;
				case 2:
					if (var1 <= var0.ar_fld - var5 || var1 > var0.ar_fld) {
						return false;
					}
			}

			switch (var4.ab_fld.av_fld * 1567188249) {
				case 0:
					if (var2 >= var0.as_fld && var2 < var0.as_fld + var6) {
						break;
					}

					return false;
				case 1:
					if (var2 >= var0.as_fld - var6 / 2 && var2 <= var6 / 2 + var0.as_fld) {
						break;
					}

					return false;
				case 2:
					if (var2 <= var0.as_fld - var6 || var2 > var0.as_fld) {
						return false;
					}
			}

			return true;
		}
	}

	@ObfuscatedName("mv")
	@ObfuscatedSignature(
		descriptor = "(Lxf;)Ljava/util/Iterator;"
	)
	public static Iterator mv(xf var0) {
		xr.ls(var0.ak_fld);
		return var0.ak_fld;
	}

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

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "()Lgw;"
	)
	abstract gw al();

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public abstract int as();

	@ObfuscatedName("ky")
	@ObfuscatedSignature(
		descriptor = "()Lkj;"
	)
	public kj ky() {
		return this.aw_fld;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public abstract int ar();

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "()Lgw;"
	)
	abstract gw af();

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z"
	)
	boolean ad(int var1, int var2, byte var3) {
		gw var4 = this.az(2123249281);
		if (null == var4) {
			return false;
		} else {
			return var1 < this.ar_fld - var4.ag_fld / 2 || var1 > var4.ag_fld / 2 + this.ar_fld ? false : var2 >= this.as_fld && var2 <= this.as_fld + var4.az_fld;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "()Lgw;"
	)
	abstract gw au();

	@ObfuscatedName("xy")
	@ObfuscatedSignature(
		descriptor = "(Lcl;Lcv;)V"
	)
	public static void xy(cl var0, cv var1) {
		var0.ak_fld.remove(var1);
	}

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

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean at() {
		return this.ag(33109692) >= 0;
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	boolean be(int var1, int var2) {
		gw var3 = this.az(849367028);
		if (null == var3) {
			return false;
		} else {
			return var1 < this.ar_fld - var3.ag_fld / 2 || var1 > var3.ag_fld / 2 + this.ar_fld ? false : var2 >= this.as_fld && var2 <= this.as_fld + var3.az_fld;
		}
	}

	@ObfuscatedName("getCoordinate")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/coords/WorldPoint;"
	)
	@Export("getCoordinate")
	@Override
	public WorldPoint getCoordinate() {
		kj var1 = this.ky();
		return new WorldPoint(var1.ak_fld, var1.ag_fld, var1.az_fld);
	}

	@ObfuscatedName("yp")
	@ObfuscatedSignature(
		descriptor = "(Lfn;Lek;I)V"
	)
	public static void yp(fn var0, ek var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ly(rl21.ao_fld, var1, var2);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	boolean ab(int var1, int var2) {
		return pq(this, var1, var2) ? true : this.ad(var1, var2, (byte)38);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	boolean ap(int var1, int var2) {
		return pq(this, var1, var2) ? true : this.ad(var1, var2, (byte)5);
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	boolean br(int var1, int var2) {
		gw var3 = this.az(1863916950);
		if (null == var3) {
			return false;
		} else {
			return var1 < this.ar_fld - var3.ag_fld / 2 || var1 > var3.ag_fld / 2 + this.ar_fld ? false : var2 >= this.as_fld && var2 <= this.as_fld + var3.az_fld;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean ac() {
		return this.ag(1025986789) >= 0;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Lgw;"
	)
	abstract gw az(int var1);

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	boolean bm(int var1, int var2) {
		if (!this.aq((byte)91)) {
			return false;
		} else {
			pc var3 = uh.ak(this.ag(1352234420));
			int var4 = this.ae(1380159699);
			int var5 = this.av(-2045721724);
			switch (-1817025895 * var3.ao_fld.av_fld) {
				case 0:
					if (var1 < this.ar_fld - var4 / 2 || var1 > this.ar_fld + var4 / 2) {
						return false;
					}
					break;
				case 1:
					if (var1 < this.ar_fld || var1 >= this.ar_fld + var4) {
						return false;
					}
					break;
				case 2:
					if (var1 <= this.ar_fld - var4 || var1 > this.ar_fld) {
						return false;
					}
			}

			switch (var3.ab_fld.av_fld * 1567188249) {
				case 0:
					if (var2 < this.as_fld || var2 >= this.as_fld + var5) {
						return false;
					}
					break;
				case 1:
					if (var2 < this.as_fld - var5 / 2 || var2 > var5 / 2 + this.as_fld) {
						return false;
					}
					break;
				case 2:
					if (var2 <= this.as_fld - var5 || var2 > this.as_fld) {
						return false;
					}
			}

			return true;
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	boolean bd(int var1, int var2) {
		gw var3 = this.az(727951656);
		if (null == var3) {
			return false;
		} else {
			return var1 < this.ar_fld - var3.ag_fld / 2 || var1 > var3.ag_fld / 2 + this.ar_fld ? false : var2 >= this.as_fld && var2 <= this.as_fld + var3.az_fld;
		}
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	boolean bz(int var1, int var2) {
		gw var3 = this.az(627104774);
		if (null == var3) {
			return false;
		} else {
			return var1 < this.ar_fld - var3.ag_fld / 2 || var1 > var3.ag_fld / 2 + this.ar_fld ? false : var2 >= this.as_fld && var2 <= this.as_fld + var3.az_fld;
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z"
	)
	boolean ai(int var1, int var2, byte var3) {
		return pq(this, var1, var2) ? true : this.ad(var1, var2, (byte)74);
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
		descriptor = "(Lxi;B)Ljava/lang/String;"
	)
	public static String ag(xi var0) {
		return es.az(var0, 32767);
	}

	@ObfuscatedName("getType")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getType")
	@Override
	public int getType() {
		return this.ag(1458166108);
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
			int var6 = this.av(-2048804544);
			switch (-1817025895 * var4.ao_fld.av_fld) {
				case 0:
					if (var1 < this.as_fld - var5 / 2 || var1 > this.as_fld + var5 / 2) {
						return false;
					}
					break;
				case 1:
					if (var1 < this.as_fld || var1 >= this.ar_fld + var5) {
						return false;
					}
					break;
				case 2:
					if (var1 <= this.ar_fld - var5 || var1 > this.ar_fld) {
						return false;
					}
			}

			switch (var4.ab_fld.av_fld * 1567188249) {
				case 0:
					if (var2 >= this.as_fld && var2 < this.as_fld + var6) {
						break;
					}

					return false;
				case 1:
					if (var2 >= this.as_fld - var6 / 2 && var2 <= var6 / 2 + this.ar_fld) {
						break;
					}

					return false;
				case 2:
					if (var2 <= this.ar_fld - var6 || var2 > this.as_fld) {
						return false;
					}
			}

			return true;
		}
	}
}
