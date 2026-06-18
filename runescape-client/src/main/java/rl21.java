import java.awt.event.MouseEvent;
import java.util.Arrays;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("rl21")
public class rl21 {
	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "Luy;"
	)
	public uy dr_fld;
	@ObfuscatedName("hz")
	@ObfuscatedSignature(
		descriptor = "Luy;"
	)
	public uy hz_fld;
	@ObfuscatedName("er")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	public float er_fld;
	@ObfuscatedName("ja")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ja_fld;
	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	public float hg_fld;
	@ObfuscatedName("fh")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	public float fh_fld;
	@ObfuscatedName("yn")
	@ObfuscatedSignature(
		descriptor = "[Lrl2;"
	)
	public rl2[] yn_fld = new rl2[128];
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "[B"
	)
	public byte[] bs_fld;
	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int dh_fld;
	@ObfuscatedName("eh")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int eh_fld;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lrl21;"
	)
	public static rl21 ao_fld = new rl21(true);
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	public fn bk_fld;
	@ObfuscatedName("fk")
	@ObfuscatedSignature(
		descriptor = "Luy;"
	)
	public uy fk_fld;

	public rl21() {
		this.bk_fld = new fn();
		this.bs_fld = new byte[1];
		this.hz_fld = new uy();
		this.fk_fld = new uy();
		this.dr_fld = new uy();
	}

	public rl21(boolean var1) {
		this.bk_fld = fn.br_fld;
		this.bs_fld = fn.be_fld;
		this.hz_fld = fn.bk_fld;
		this.fk_fld = fn.bj_fld;
		this.dr_fld = fn.bf_fld;
	}

	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "(Ltj;Ljava/awt/event/MouseEvent;)V"
	)
	public static void dw(tj var0, MouseEvent var1) {
		if (var0 == null) {
			var0.getClass();
		} else {
			if (var1.isPopupTrigger()) {
				var1.consume();
			}
		}
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(Luy;I)V"
	)
	public void bz(uy var1, int var2) {
		if (var2 >= this.yn_fld.length) {
			this.yn_fld = (rl2[])(rl2[])Arrays.copyOf(this.yn_fld, var2 + 1);
		}

		rl2 var3 = this.yn_fld[var2];
		if (var3 == null) {
			var3 = this.yn_fld[var2] = new rl2();
		}

		var3.zm_fld.cv(var1);
		var3.mv_fld = var3.gb_fld = true;
	}
}
