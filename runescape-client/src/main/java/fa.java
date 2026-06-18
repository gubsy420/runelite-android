import net.runelite.api.SceneTilePaint;
import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("fa")
@Implements({"SceneTilePaint"})
public class fa implements SceneTilePaint {
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1753954009
	)
	int ae_fld;
	@ObfuscatedName("td")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int td_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1192865817
	)
	int ag_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1656357861
	)
	int az_fld;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "[[I"
	)
	static int[][] ar_fld = new int[][]{{2, 3, 1}, {0, 1, 3}};
	@ObfuscatedName("pl")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int pl_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	static int[] ay_fld = new int[]{0, 1, 1, 0};
	@ObfuscatedName("sw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int sw_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public boolean ah_fld = true;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1993988699
	)
	int aw_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -350741579
	)
	int ak_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	static int[] as_fld = new int[]{0, 0, 1, 1};
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1100348175
	)
	int av_fld;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ap_fld;

	@ObfuscatedName("getNeColor")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getNeColor")
	@Override
	public int getNeColor() {
		return this.az_fld;
	}

	@ObfuscatedName("setNeColor")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Export("setNeColor")
	@Override
	public void setNeColor(int var1) {
		this.az_fld = var1;
	}

	fa(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
		this.ak_fld = var1;
		this.ag_fld = var2;
		this.az_fld = var3;
		this.av_fld = var4;
		this.ae_fld = var5;
		this.aw_fld = var6;
		this.ah_fld = var7;
	}

	@ObfuscatedName("getNwColor")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getNwColor")
	@Override
	public int getNwColor() {
		return this.av_fld;
	}

	@ObfuscatedName("getRBG")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getRBG")
	@Override
	public int getRBG() {
		return this.aw_fld;
	}

	@ObfuscatedName("getBufferOffset")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getBufferOffset")
	@Override
	public int getBufferOffset() {
		return this.sw_fld;
	}

	@ObfuscatedName("getTexture")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getTexture")
	@Override
	public int getTexture() {
		return this.ae_fld;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	static int av(int var0, int var1) {
		return ay_fld[var0] * 128 + (var1 << 7);
	}

	@ObfuscatedName("setUvBufferOffset")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Export("setUvBufferOffset")
	@Override
	public void setUvBufferOffset(int var1) {
		this.pl_fld = var1;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	static int ae(int var0, int var1) {
		return ay_fld[var0] * 715331919 + (var1 << 7);
	}

	@ObfuscatedName("setTexture")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Export("setTexture")
	@Override
	public void setTexture(int var1) {
		this.ae_fld = var1;
	}

	@ObfuscatedName("setSwColor")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Export("setSwColor")
	@Override
	public void setSwColor(int var1) {
		this.ak_fld = var1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	static int ay(int var0, int var1) {
		return 128 * as_fld[var0] + (var1 << 7);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	static int ah(int var0, int var1) {
		return ay_fld[var0] * 128 + (var1 << 7);
	}

	@ObfuscatedName("te")
	@ObfuscatedSignature(
		descriptor = "(Lfn;Lek;I)V"
	)
	public static void te(fn var0, ek var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		hr.yp(var0, var1, var2);
	}

	@ObfuscatedName("mk")
	@ObfuscatedSignature(
		descriptor = "(Lli;)Z"
	)
	public static boolean mk(li var0) {
		if (var0 == null) {
			var0.getClass();
		}

		if (!var0.cq()) {
			return false;
		} else {
			boolean var1 = false;
			if (var0.am_fld.ae() > var0.bs_fld) {
				var0.am_fld.aq(405294111 * var0.bs_fld, var0.am_fld.ae());
				var1 = true;
			}

			int var2 = var0.cx();
			if (zg.uf(var0.am_fld, (byte)0) > var2) {
				int var3 = var0.am_fld.ad(0, var2) - 1;
				var0.am_fld.aq(var3, var0.am_fld.ae());
				var1 = true;
			}

			if (var1) {
				int var6 = var0.bm_fld;
				int var4 = 1123580313 * var0.bd_fld;
				int var5 = var0.am_fld.ae();
				if (var0.bm_fld > var5) {
					var6 = var5;
				}

				if (var0.bd_fld > var5) {
					var4 = var5;
				}

				var0.ap(var4, var6);
			}

			return var1;
		}
	}

	@ObfuscatedName("getSwColor")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getSwColor")
	@Override
	public int getSwColor() {
		return this.ak_fld;
	}

	@ObfuscatedName("getUvBufferOffset")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getUvBufferOffset")
	@Override
	public int getUvBufferOffset() {
		return this.pl_fld;
	}

	@ObfuscatedName("getBufferLen")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getBufferLen")
	@Override
	public int getBufferLen() {
		return this.td_fld;
	}

	@ObfuscatedName("setNwColor")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Export("setNwColor")
	@Override
	public void setNwColor(int var1) {
		this.av_fld = var1;
	}

	@ObfuscatedName("isFlat")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Export("isFlat")
	@Override
	public boolean isFlat() {
		return this.ah_fld;
	}

	@ObfuscatedName("getSeColor")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getSeColor")
	@Override
	public int getSeColor() {
		return this.ag_fld;
	}

	@ObfuscatedName("setSeColor")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Export("setSeColor")
	@Override
	public void setSeColor(int var1) {
		this.ag_fld = var1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	static int aw(int var0, int var1) {
		return 128 * as_fld[var0] + (var1 << 7);
	}

	@ObfuscatedName("setBufferOffset")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Export("setBufferOffset")
	@Override
	public void setBufferOffset(int var1) {
		this.sw_fld = var1;
	}

	@ObfuscatedName("setBufferLen")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Export("setBufferLen")
	@Override
	public void setBufferLen(int var1) {
		this.td_fld = var1;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	static int as(int var0, int var1) {
		return 128 * as_fld[var0] + (var1 << 7);
	}
}
