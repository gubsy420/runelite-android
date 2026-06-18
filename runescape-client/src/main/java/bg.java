import java.io.EOFException;
import java.lang.management.GarbageCollectorMXBean;
import javax.annotation.Nonnull;
import net.runelite.api.Item;
import net.runelite.api.ItemContainer;
import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("bg")
@Implements({"ItemContainer"})
public class bg extends vw implements ItemContainer {
	@ObfuscatedName("rt")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/management/GarbageCollectorMXBean;"
	)
	static GarbageCollectorMXBean rt_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] ag_fld = new int[]{-1};
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] az_fld = new int[]{0};
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ay_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lxz;"
	)
	static xz ak_fld = new xz(32);

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	static int as(int var0, int var1) {
		bg var2 = (bg)xz.tw(ak_fld, var0);
		if (var2 == null) {
			return -1;
		} else {
			return var1 >= 0 && var1 < var2.ag_fld.length ? var2.ag_fld[var1] : -1;
		}
	}

	@ObfuscatedName("getId")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getId")
	@Override
	public int getId() {
		return (int)this.getHash();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	static void ab(int var0) {
		bg var1 = (bg)xz.tw(ak_fld, var0);
		if (null != var1) {
			for (int var2 = 0; var2 < var1.ag_fld.length; var2++) {
				var1.ag_fld[var2] = -1;
				var1.az_fld[var2] = 0;
			}
		}
	}

	@ObfuscatedName("zw")
	@ObfuscatedSignature(
		descriptor = "(Lfn;)V"
	)
	public static void zw(fn var0) {
		if (var0.cm_fld != 1) {
			var0.cm_fld = 1;
			var0.ez_fld = 0;
			var0.cz_fld = 0;
			var0.ck_fld = 0;

			for (int var1 = 0; var1 < var0.bi_fld; var1++) {
				int var2 = (int)var0.fn_Arrfloat[var1];
				int var3 = (int)var0.rl_fld[var1];
				int var4 = (int)var0.kp_fld[var1];
				if (-var3 > var0.ez_fld) {
					var0.ez_fld = -var3;
				}

				if (var3 > var0.cz_fld) {
					var0.cz_fld = var3;
				}

				int var5 = var2 * var2 + var4 * var4;
				if (var5 > var0.ck_fld) {
					var0.ck_fld = var5;
				}
			}

			var0.ck_fld = (int)(Math.sqrt(var0.ck_fld) + 0.99);
			var0.co_fld = (int)(Math.sqrt(var0.ck_fld * var0.ck_fld + var0.ez_fld * var0.ez_fld) + 0.99);
			var0.cb_fld = var0.co_fld + (int)(Math.sqrt(var0.ck_fld * var0.ck_fld + var0.cz_fld * var0.cz_fld) + 0.99);
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	static int ay(int var0, int var1) {
		bg var2 = (bg)xz.tw(ak_fld, var0);
		if (var2 == null) {
			return -1;
		} else {
			return var1 >= 0 && var1 < var2.ag_fld.length ? var2.ag_fld[var1] : -1;
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	static void aa(int var0, int var1, int var2, int var3) {
		bg var4 = (bg)xz.tw(ak_fld, var0);
		if (null == var4) {
			var4 = new bg();
			xz.fe(ak_fld, var4, var0);
		}

		if (var4.ag_fld.length <= var1) {
			int[] var5 = new int[var1 + 1];
			int[] var6 = new int[var1 + 1];

			for (int var7 = 0; var7 < var4.ag_fld.length; var7++) {
				var5[var7] = var4.ag_fld[var7];
				var6[var7] = var4.az_fld[var7];
			}

			for (int var8 = var4.ag_fld.length; var8 < var1; var8++) {
				var5[var8] = -1;
				var6[var8] = 0;
			}

			var4.ag_fld = var5;
			var4.az_fld = var6;
		}

		var4.ag_fld[var1] = var2;
		var4.az_fld[var1] = var3;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	static int ar(int var0, int var1) {
		bg var2 = (bg)xz.tw(ak_fld, var0);
		if (null == var2) {
			return 0;
		} else {
			return var1 >= 0 && var1 < var2.az_fld.length ? var2.az_fld[var1] : 0;
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	static void ai(int var0, int var1, int var2, int var3) {
		bg var4 = (bg)xz.tw(ak_fld, var0);
		if (null == var4) {
			var4 = new bg();
			xz.fe(ak_fld, var4, var0);
		}

		if (var4.ag_fld.length <= var1) {
			int[] var5 = new int[var1 + 1];
			int[] var6 = new int[var1 + 1];

			for (int var7 = 0; var7 < var4.ag_fld.length; var7++) {
				var5[var7] = var4.ag_fld[var7];
				var6[var7] = var4.az_fld[var7];
			}

			for (int var8 = var4.ag_fld.length; var8 < var1; var8++) {
				var5[var8] = -1;
				var6[var8] = 0;
			}

			var4.ag_fld = var5;
			var4.az_fld = var6;
		}

		var4.ag_fld[var1] = var2;
		var4.az_fld[var1] = var3;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	static int al(int var0, int var1) {
		bg var2 = (bg)xz.tw(ak_fld, var0);
		if (null == var2) {
			return 0;
		} else {
			return var1 >= 0 && var1 < var2.az_fld.length ? var2.az_fld[var1] : 0;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	static int au(int var0, int var1) {
		bg var2 = (bg)xz.tw(ak_fld, var0);
		if (null == var2) {
			return 0;
		} else {
			return var1 >= 0 && var1 < var2.az_fld.length ? var2.az_fld[var1] : 0;
		}
	}

	@ObfuscatedName("find")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	@Override
	public int find(int var1) {
		for (int var2 = 0; var2 < this.ag_fld.length; var2++) {
			if (this.ag_fld[var2] == var1) {
				return var2;
			}
		}

		return -1;
	}

	bg() {
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	static void am(int var0, int var1, int var2, int var3) {
		bg var4 = (bg)xz.tw(ak_fld, var0);
		if (null == var4) {
			var4 = new bg();
			xz.fe(ak_fld, var4, var0);
		}

		if (var4.ag_fld.length <= var1) {
			int[] var5 = new int[var1 + 1];
			int[] var6 = new int[var1 + 1];

			for (int var7 = 0; var7 < var4.ag_fld.length; var7++) {
				var5[var7] = var4.ag_fld[var7];
				var6[var7] = var4.az_fld[var7];
			}

			for (int var8 = var4.ag_fld.length; var8 < var1; var8++) {
				var5[var8] = -1;
				var6[var8] = 0;
			}

			var4.ag_fld = var5;
			var4.az_fld = var6;
		}

		var4.ag_fld[var1] = var2;
		var4.az_fld[var1] = var3;
	}

	@ObfuscatedName("count")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int count() {
		int var1 = 0;

		for (int var5 : this.ag_fld) {
			if (var5 != -1) {
				var1++;
			}
		}

		return var1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	static int an(int var0, int var1) {
		bg var2 = (bg)xz.tw(ak_fld, var0);
		if (null == var2) {
			return 0;
		} else if (-1 == var1) {
			return 0;
		} else {
			int var3 = 0;

			for (int var4 = 0; var4 < var2.az_fld.length; var4++) {
				if (var2.ag_fld[var4] == var1) {
					var3 += var2.az_fld[var4];
				}
			}

			return var3;
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	static void aq(int var0, int var1, int var2, int var3) {
		bg var4 = (bg)xz.tw(ak_fld, var0);
		if (null == var4) {
			var4 = new bg();
			xz.fe(ak_fld, var4, var0);
		}

		if (var4.ag_fld.length <= var1) {
			int[] var5 = new int[var1 + 1];
			int[] var6 = new int[var1 + 1];

			for (int var7 = 0; var7 < var4.ag_fld.length; var7++) {
				var5[var7] = var4.ag_fld[var7];
				var6[var7] = var4.az_fld[var7];
			}

			for (int var8 = var4.ag_fld.length; var8 < var1; var8++) {
				var5[var8] = -1;
				var6[var8] = 0;
			}

			var4.ag_fld = var5;
			var4.az_fld = var6;
		}

		var4.ag_fld[var1] = var2;
		var4.az_fld[var1] = var3;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	static int af(int var0, int var1) {
		bg var2 = (bg)xz.tw(ak_fld, var0);
		if (null == var2) {
			return 0;
		} else {
			return var1 >= 0 && var1 < var2.az_fld.length ? var2.az_fld[var1] : 0;
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	static void ad(int var0) {
		bg var1 = (bg)xz.tw(ak_fld, var0);
		if (null != var1) {
			for (int var2 = 0; var2 < var1.ag_fld.length; var2++) {
				var1.ag_fld[var2] = -1;
				var1.az_fld[var2] = 0;
			}
		}
	}

	@Nonnull
	@ObfuscatedName("getItems")
	@ObfuscatedSignature(
		descriptor = "()[Lnet/runelite/api/Item;"
	)
	@Export("getItems")
	@Override
	public Item[] getItems() {
		Item[] var1 = new Item[this.ag_fld.length];

		for (int var2 = 0; var2 < this.ag_fld.length; var2++) {
			var1[var2] = new Item(this.ag_fld[var2], this.az_fld[var2]);
		}

		return var1;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	static void ao(int var0) {
		bg var1 = (bg)xz.tw(ak_fld, var0);
		if (null != var1) {
			for (int var2 = 0; var2 < var1.ag_fld.length; var2++) {
				var1.ag_fld[var2] = -1;
				var1.az_fld[var2] = 0;
			}
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	static int ax(int var0, int var1) {
		bg var2 = (bg)xz.tw(ak_fld, var0);
		if (null == var2) {
			return 0;
		} else if (-1 == var1) {
			return 0;
		} else {
			int var3 = 0;

			for (int var4 = 0; var4 < var2.az_fld.length; var4++) {
				if (var2.ag_fld[var4] == var1) {
					var3 += var2.az_fld[var4];
				}
			}

			return var3;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	static void ap() {
		ak_fld = new xz(32);
	}

	@ObfuscatedName("contains")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	@Override
	public boolean contains(int var1) {
		for (int var5 : this.ag_fld) {
			if (var5 == var1) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	static void at() {
		ak_fld = new xz(32);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	static void ac() {
		ak_fld = new xz(32);
	}

	@ObfuscatedName("size")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("size")
	@Override
	public int size() {
		return this.ag_fld.length;
	}

	@ObfuscatedName("count")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	@Override
	public int count(int var1) {
		int var2 = 0;

		for (int var3 = 0; var3 < this.ag_fld.length; var3++) {
			if (this.ag_fld[var3] == var1) {
				int var4 = this.az_fld[var3];
				if (var4 > 1) {
					return var4;
				}

				var2++;
			}
		}

		return var2;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	static void aj() {
		ak_fld = new xz(32);
	}

	@ObfuscatedName("getItem")
	@ObfuscatedSignature(
		descriptor = "(I)Lnet/runelite/api/Item;"
	)
	@Export("getItem")
	@Override
	public Item getItem(int var1) {
		return var1 >= 0 && var1 < this.ag_fld.length && this.ag_fld[var1] != -1 ? new Item(this.ag_fld[var1], this.az_fld[var1]) : null;
	}

	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "(Ldx;IIIIIII)V"
	)
	static void dg(dx var0, int var1, int var2, int var3, int var4, int var5, int var6) throws EOFException {
		try {
			na var8 = var0.aa_fld[var1][var2][var3];
			if (null != var8) {
				for (dw var9 = (dw)var8.aw(); var9 != null; var9 = (dw)na.iy(var8)) {
					if (var9.ah_fld == var4 && var5 == var9.ay_fld) {
						int var10001 = var6 * -1329750057;
						var9.tc(var6 * -1329750057 * -1736653849);
						var9.ay_fld = var10001;
						break;
					}
				}

				jv.er(var1, var2, var3);
			}
		} catch (Throwable var10) {
			throw new RuntimeException(var10);
		}
	}
}
