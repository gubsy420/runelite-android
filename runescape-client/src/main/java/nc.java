import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("nc")
public class nc {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/Comparator;"
	)
	public static Comparator ak_fld = new nx();
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bl_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/Comparator;"
	)
	public static Comparator az_fld = new nw();
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/Comparator;"
	)
	public static Comparator ag_fld = new nd();
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/List;"
	)
	public List ae_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/Comparator;"
	)
	public static Comparator av_fld = new nh();
	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bg_fld;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ap_fld;

	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "(Lnc;Ljava/util/Comparator;ZI)V"
	)
	public static void dv(nc var0, Comparator var1, boolean var2, int var3) {
		if (var0 == null) {
			var0.getClass();
		} else {
			if (var2) {
				Collections.sort(var0.ae_fld, var1);
			} else {
				Collections.sort(var0.ae_fld, Collections.reverseOrder(var1));
			}
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lxi;Lxv;B)Lxv;"
	)
	static final xv ak(xi var0, xv var1) {
		int var3 = var0.cg();
		if (null == var1) {
			int var4 = wp.ay(var3);
			var1 = new xv(var4);
		}

		for (int var8 = 0; var8 < var3; var8++) {
			int var5 = var0.cg();
			int var6 = xi.lx(var0, -1188338001);
			Object var7;
			if (var5 == 1) {
				var7 = new uj(xi.at(var0, 1369579673));
			} else if (2 == var5) {
				var7 = new vk(var0.cu());
			} else {
				var7 = new vl(var0.co((byte)-72));
			}

			var1.ag((vw)var7, var6);
		}

		return var1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	public static int az(int var0) {
		return var0 & 0xFF;
	}

	static {
		new nm();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Comparator;Z)V"
	)
	public void ag(Comparator var1, boolean var2) {
		if (var2) {
			Collections.sort(this.ae_fld, var1);
		} else {
			Collections.sort(this.ae_fld, Collections.reverseOrder(var1));
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Comparator;Z)V"
	)
	public void az(Comparator var1, boolean var2) {
		if (var2) {
			Collections.sort(this.ae_fld, var1);
		} else {
			Collections.sort(this.ae_fld, Collections.reverseOrder(var1));
		}
	}

	@ObfuscatedName("th")
	@ObfuscatedSignature(
		descriptor = "(Lcx;III)Ldx;"
	)
	public static dx th(cx var0, int var1, int var2, int var3) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ah_fld = cx.cl(var0, 0, var1, var2, var3, er.ak_fld, (byte)30);
		return var0.ah_fld;
	}

	public nc(xi var1, boolean var2) {
		int var3 = var1.cm();
		boolean var4 = var1.cg() == 1;
		byte var5;
		if (var4) {
			var5 = 1;
		} else {
			var5 = 0;
		}

		int var6 = var1.cm();
		this.ae_fld = new ArrayList(var6);

		for (int var7 = 0; var7 < var6; var7++) {
			this.ae_fld.add(new nl(var1, var5, var3));
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Comparator;ZI)V"
	)
	public void ak(Comparator var1, boolean var2, int var3) {
		if (var2) {
			Collections.sort(this.ae_fld, var1);
		} else {
			Collections.sort(this.ae_fld, Collections.reverseOrder(var1));
		}
	}
}
