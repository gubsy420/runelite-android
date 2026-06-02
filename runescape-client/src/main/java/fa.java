import net.runelite.api.SceneTilePaint;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("fa")
@Implements({"SceneTilePaint"})
public class fa implements SceneTilePaint {
	@ObfuscatedName("qp")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int qp_fld;
	@ObfuscatedGetter(
		intValue = 1753954009
	)
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ae_fld;
	@ObfuscatedName("yk")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int yk_fld;
	@ObfuscatedGetter(
		intValue = -1192865817
	)
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ag_fld;
	@ObfuscatedGetter(
		intValue = -1656357861
	)
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int az_fld;
	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int dc_fld;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "[[I"
	)
	static int[][] ar_fld = new int[][]{{2, 3, 1}, {0, 1, 3}};
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	static int[] ay_fld = new int[]{0, 1, 1, 0};
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public boolean ah_fld = true;
	@ObfuscatedGetter(
		intValue = 1993988699
	)
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int aw_fld;
	@ObfuscatedGetter(
		intValue = -350741579
	)
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ak_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	static int[] as_fld = new int[]{0, 0, 1, 1};
	@ObfuscatedGetter(
		intValue = -1100348175
	)
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int av_fld;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ap_fld;

	@ObfuscatedName("getUvBufferOffset")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getUvBufferOffset() {
		return this.dc_fld;
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

	@ObfuscatedName("setSwColor")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	public void setSwColor(int var1) {
		this.ak_fld = var1;
	}

	@ObfuscatedName("setTexture")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	public void setTexture(int var1) {
		this.ae_fld = var1;
	}

	@ObfuscatedName("setBufferOffset")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	public void setBufferOffset(int var1) {
		this.qp_fld = var1;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	static int av(int var0, int var1) {
		return ay_fld[var0] * 128 + (var1 << 7);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	static int ae(int var0, int var1) {
		return ay_fld[var0] * 715331919 + (var1 << 7);
	}

	@ObfuscatedName("getBufferOffset")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getBufferOffset() {
		return this.qp_fld;
	}

	@ObfuscatedName("setSeColor")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	public void setSeColor(int var1) {
		this.ag_fld = var1;
	}

	@ObfuscatedName("getSwColor")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getSwColor() {
		return this.ak_fld;
	}

	@ObfuscatedName("setBufferLen")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	public void setBufferLen(int var1) {
		this.yk_fld = var1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	static int ay(int var0, int var1) {
		return 128 * as_fld[var0] + (var1 << 7);
	}

	@ObfuscatedName("getSeColor")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getSeColor() {
		return this.ag_fld;
	}

	@ObfuscatedName("getNwColor")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getNwColor() {
		return this.av_fld;
	}

	@ObfuscatedName("getRBG")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getRBG() {
		return this.aw_fld;
	}

	@ObfuscatedName("isFlat")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	public boolean isFlat() {
		return this.ah_fld;
	}

	@ObfuscatedName("st")
	@ObfuscatedSignature(
		descriptor = "(Lmo;Ljava/lang/String;)Lmj;"
	)
	public static mj st(mo var0, String var1) {
		return (mj)(mj)var0.az_fld.get(var1);
	}

	@ObfuscatedName("getBufferLen")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getBufferLen() {
		return this.yk_fld;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	static int ah(int var0, int var1) {
		return ay_fld[var0] * 128 + (var1 << 7);
	}

	@ObfuscatedName("getNeColor")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getNeColor() {
		return this.az_fld;
	}

	@ObfuscatedName("setNeColor")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	public void setNeColor(int var1) {
		this.az_fld = var1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	static int aw(int var0, int var1) {
		return 128 * as_fld[var0] + (var1 << 7);
	}

	@ObfuscatedName("getTexture")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getTexture() {
		return this.ae_fld;
	}

	@ObfuscatedName("setNwColor")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	public void setNwColor(int var1) {
		this.av_fld = var1;
	}

	@ObfuscatedName("setUvBufferOffset")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	public void setUvBufferOffset(int var1) {
		this.dc_fld = var1;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	static int as(int var0, int var1) {
		return 128 * as_fld[var0] + (var1 << 7);
	}
}
