import java.io.IOException;
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

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(Lzb;)J"
	)
	public static long ci(zb var0) throws IOException {
		return var0.az_fld.length();
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lxi;Lxv;)Lxv;"
	)
	static final xv ak(xi var0, xv var1) {
		int var3 = var0.cg();
		if (null == var1) {
			int var4 = wp.ay(var3);
			var1 = new xv(var4);
		}

		for (int var8 = 0; var8 < var3; var8++) {
			int var5 = var0.cg();
			int var6 = var0.ck();
			Object var7;
			if (var5 == 1) {
				var7 = new uj(xi.kc(var0, 1369579673));
			} else if (2 == var5) {
				var7 = new vk(xi.ob(var0, -582268727));
			} else {
				var7 = new vl(var0.co());
			}

			var1.ag((vw)var7, var6);
		}

		return var1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int az(int var0) {
		return var0 & 0xFF;
	}

	static {
		new nm();
	}

	@ObfuscatedName("ur")
	@ObfuscatedSignature(
		descriptor = "(Lnc;Ljava/util/Comparator;ZI)V"
	)
	public static void ur(nc var0, Comparator var1, boolean var2, int var3) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var2) {
			Collections.sort(var0.ae_fld, var1);
		} else {
			Collections.sort(var0.ae_fld, Collections.reverseOrder(var1));
		}
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

	public nc(xi var1, boolean var2) {
		int var3 = xi.tx(var1, 2005475518);
		boolean var4 = var1.cg() == 1;
		byte var5;
		if (var4) {
			var5 = 1;
		} else {
			var5 = 0;
		}

		int var6 = xi.tx(var1, 1687771254);
		this.ae_fld = new ArrayList(var6);

		for (int var7 = 0; var7 < var6; var7++) {
			this.ae_fld.add(new nl(var1, var5, var3));
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Comparator;Z)V"
	)
	public void av(Comparator var1, boolean var2) {
		if (var2) {
			Collections.sort(this.ae_fld, var1);
		} else {
			Collections.sort(this.ae_fld, Collections.reverseOrder(var1));
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
