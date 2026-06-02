import java.util.Arrays;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("rl21")
public class rl21 {
	@ObfuscatedName("it")
	@ObfuscatedSignature(
		descriptor = "[B"
	)
	public byte[] it_fld;
	@ObfuscatedName("qt")
	@ObfuscatedSignature(
		descriptor = "[Lrl2;"
	)
	public rl2[] qt_fld = new rl2[128];
	@ObfuscatedName("kn")
	@ObfuscatedSignature(
		descriptor = "Luy;"
	)
	public uy kn_fld;
	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ci_fld;
	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	public float ct_fld;
	@ObfuscatedName("no")
	@ObfuscatedSignature(
		descriptor = "Lrl21;"
	)
	public static rl21 no_fld = new rl21(true);
	@ObfuscatedName("ze")
	@ObfuscatedSignature(
		descriptor = "Luy;"
	)
	public uy ze_fld;
	@ObfuscatedName("kx")
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	public fn kx_fld;
	@ObfuscatedName("wh")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int wh_fld;
	@ObfuscatedName("mw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int mw_fld;
	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	public float dx_fld;
	@ObfuscatedName("qc")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	public float qc_fld;
	@ObfuscatedName("gv")
	@ObfuscatedSignature(
		descriptor = "Luy;"
	)
	public uy gv_fld;

	public rl21() {
		this.kx_fld = new fn();
		this.it_fld = new byte[1];
		this.gv_fld = new uy();
		this.ze_fld = new uy();
		this.kn_fld = new uy();
	}

	@ObfuscatedName("vz")
	@ObfuscatedSignature(
		descriptor = "(Luy;I)V"
	)
	public void vz(uy var1, int var2) {
		if (var2 >= this.qt_fld.length) {
			this.qt_fld = (rl2[])(rl2[])Arrays.copyOf(this.qt_fld, var2 + 1);
		}

		rl2 var3 = this.qt_fld[var2];
		if (var3 == null) {
			var3 = this.qt_fld[var2] = new rl2();
		}

		var3.xb_fld.bz_void(var1);
		var3.bz_fld = var3.ii_fld = true;
	}

	public rl21(boolean var1) {
		this.kx_fld = fn.br_fld;
		this.it_fld = fn.be_fld;
		this.gv_fld = fn.bk_fld;
		this.ze_fld = fn.bj_fld;
		this.kn_fld = fn.bf_fld;
	}

	@ObfuscatedName("fv")
	@ObfuscatedSignature(
		descriptor = "(Laax;)Ljava/lang/String;"
	)
	public static String fv(aax var0) {
		return var0.ag_fld;
	}
}
