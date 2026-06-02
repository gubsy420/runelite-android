import java.util.HashSet;
import java.util.Set;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("xg")
public class xg implements xm {
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	static String bo_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lxg;"
	)
	static xg ag_fld = new xg("", 1, new xo[]{xo.az_fld, xo.av_fld, xo.ak_fld});
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lxg;"
	)
	static xg az_fld = new xg("", 2, new xo[]{xo.az_fld, xo.ag_fld, xo.av_fld});
	@ObfuscatedGetter(
		intValue = -1064857867
	)
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ax_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lxg;"
	)
	static xg ae_fld = new xg("", 4);
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lxg;"
	)
	static xg au_fld = new xg("", 13, new xo[]{xo.az_fld});
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lxg;"
	)
	static xg aw_fld = new xg("", 6, new xo[]{xo.av_fld});
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lxg;"
	)
	static xg ay_fld = new xg("", 8, new xo[]{xo.az_fld, xo.av_fld});
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lxg;"
	)
	static xg as_fld = new xg("", 9, new xo[]{xo.az_fld, xo.ag_fld});
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lxg;"
	)
	static xg ar_fld = new xg("", 10, new xo[]{xo.az_fld});
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lxg;"
	)
	static xg af_fld = new xg("", 11, new xo[]{xo.az_fld});
	@ObfuscatedGetter(
		intValue = 1043139737
	)
	@ObfuscatedName("mo")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int mo_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lxg;"
	)
	static xg ah_fld = new xg("", 5, new xo[]{xo.az_fld, xo.av_fld});
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lxg;"
	)
	static xg ak_fld = new xg("", 0, new xo[]{xo.av_fld, xo.ak_fld});
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/Set;"
	)
	Set an_fld = new HashSet();
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lxg;"
	)
	static xg av_fld = new xg("", 3, new xo[]{xo.az_fld});
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lxg;"
	)
	static xg al_fld = new xg("", 12, new xo[]{xo.az_fld, xo.av_fld});
	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int cl_fld;

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Laax;)Ljava/lang/String;"
	)
	public static String ac(aax var0) {
		return var0.ag_fld;
	}

	xg(String var1, int var2) {
		this.ax_fld = var2;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int av() {
		return this.ax_fld;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int ae() {
		return this.ax_fld;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int ah() {
		return this.ax_fld;
	}

	xg(String var1, int var2, xo[] var3) {
		this.ax_fld = var2;
		xo[] var4 = var3;

		for (int var5 = 0; var5 < var4.length; var5++) {
			xo var6 = var4[var5];
			this.an_fld.add(var6);
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	@Override
	public int ag(int var1) {
		return this.ax_fld;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public static void az(int var0) {
		ph.az_fld.vh();
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	public static int az(int var0, int var1) {
		return uh.av_fld[var0 & 16383];
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	static boolean ag_boolean(int var0) {
		return ch.as_fld != null;
	}
}
