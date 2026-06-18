import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;
import net.runelite.api.widgets.JavaScriptCallback;

@ObfuscatedName("pm")
public class pm extends oj {
	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int cq_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -811848167
	)
	int ak_fld;
	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int cg_fld;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	public static ub ac_fld;
	// $VF: synthetic field
	@ObfuscatedName("this$0")
	@ObfuscatedSignature(
		descriptor = "Lpb;"
	)
	pb this$0;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ag_fld;

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int ag() {
		int var10000 = tj.au_fld += -453549775;
		client.vq();
		return var10000 * -1348315183 - 1;
	}

	@ObfuscatedName("st")
	@ObfuscatedSignature(
		descriptor = "(Lda;IZ)V"
	)
	public static void st(da var0, int var1, boolean var2) {
		var0.cg_fld.av(var1, var2);
	}

	@ObfuscatedName("kf")
	@ObfuscatedSignature(
		descriptor = "(Lpw;Lxi;I)V"
	)
	public static void kf(pw var0, xi var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		if (249 == var2) {
			var0.az_fld = nc.ak(var1, var0.az_fld);
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "([IB)Lsl;"
	)
	public static sl au(int[] var0) {
		sl var2 = new sl(yq.ak_fld, false);
		var2.aw_fld = var0;
		var2.av_fld = var0.length;
		var2.ae_fld = var0.length;
		return var2;
	}

	pm(pb var1, String var2, int var3) {
		super(var1, var2);
		this.this$0 = var1;
		this.ak_fld = var3;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lyz;III)V"
	)
	static void ag(yz var0, int var1, int var2) throws EOFException {
		Object[] var4 = (Object[])var0.getArguments();
		if (var4 != null && var4.length > 0 && var4[0] instanceof JavaScriptCallback) {
			try {
				((JavaScriptCallback)var4[0]).run(var0);
			} catch (Exception var16) {
				client.logger.error("Error in JavaScriptCallback", (Throwable)var16);
			}
		} else {
			try {
				client.vg_fld = var0;
				int var10 = 1446060577;
				Object[] var11 = (Object[])var0.az(1697120891);
				ba var12;
				if (to.ak(yz.lb(var0, 2124195901))) {
					gb.aj_fld = (hv)var11[0];
					pc var13 = uh.ak(gb.aj_fld.ak_fld);
					var12 = wl.ag(yz.lb(var0, 2138333026), var13.ah_fld, var13.ac_fld);
				} else if (me.ag(yz.lb(var0, 1980752758))) {
					if (var10 != 1446060577) {
						return;
					}

					int var18 = (Integer)var11[0];
					var12 = wl.ag(yz.lb(var0, 1998626560), var18, -1);
				} else {
					int var19 = (Integer)var11[0];
					var12 = an.ak(var19);
				}

				if (var12 != null && var10 == 1446060577) {
					me.az(var0, var12, var1, var2, 16711935);
				}
			} finally {
				client.zc_fld = null;
			}
		}
	}
}
