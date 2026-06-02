import java.util.ArrayList;
import java.util.List;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("rl17")
class rl17 {
	@ObfuscatedName("pn")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/List;"
	)
	public List pn_fld;
	@ObfuscatedName("qf")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int qf_fld = 1024;
	@ObfuscatedName("el")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int el_fld = 1024;
	@ObfuscatedName("yh")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int yh_fld;
	@ObfuscatedName("ky")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public boolean ky_fld;
	@ObfuscatedName("go")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int go_fld;
	@ObfuscatedName("kq")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int kq_fld;
	@ObfuscatedName("wu")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/List;"
	)
	public List wu_fld = new ArrayList();
	@ObfuscatedName("su")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int su_fld;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ac_fld;
	@ObfuscatedName("lp")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int lp_fld;

	@ObfuscatedName("yb")
	@ObfuscatedSignature(
		descriptor = "(Lgn;III)V"
	)
	public static void yb(gn var0, int var1, int var2, int var3) {
		var0.bp_fld[var1][var2] = var0.bp_fld[var1][var2] | var3;
	}

	public rl17() {
		this.pn_fld = new ArrayList();
	}
}
