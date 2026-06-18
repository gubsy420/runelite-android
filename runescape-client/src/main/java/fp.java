import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("fp")
public class fp {
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bn_fld;
	@ObfuscatedName("fx")
	@ObfuscatedSignature(
		descriptor = "Lib;"
	)
	static ib fx_fld;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int aa_fld;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	public static String ax_fld;
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1755348399
	)
	static int bu_fld;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "[[[B"
	)
	static byte[][][] an_fld;

	@ObfuscatedName("fh")
	@ObfuscatedSignature(
		descriptor = "(IIII[Ljava/lang/Object;B)V"
	)
	static void fh(int var0, int var1, int var2, int var3, Object[] var4, byte var5) throws EOFException {
		boolean var6 = false;
		lu var7 = cf.cg_fld.ag(var0, var1);
		if (var6 || null != var7) {
			if (!var6) {
				if (var5 >= 0) {
					return;
				}

				if (!sg.av(uo.xd(cf.cg_fld, var7, -1637543840))) {
					return;
				}
			}

			jm var8 = gi.ak(jb.cw_fld, client.appletStub.av_fld);
			xi.vy(var8.ay_fld, 0);
			int var9 = -661977895 * var8.ay_fld.au_fld;
			var8.ay_fld.ca(var1);
			var8.ay_fld.ba(var2);
			var8.ay_fld.dy(var0);
			var8.ay_fld.dy(var3);
			Object[] var10 = (Object[])var4;

			for (int var11 = 0; var11 < var10.length; var11++) {
				Object var12 = var10[var11];
				if (var12 instanceof Integer) {
					xi.wt(var8.ay_fld, (Integer)var12);
				} else if (var12 instanceof String) {
					xi.ph(var8.ay_fld, (String)var12, 1019520851);
				} else if (var12 instanceof sl) {
					sl var13 = (sl)var12;
					int var14 = var13.av();
					var8.ay_fld.bw(var14);
					if (var13.ag_fld == yq.ak_fld) {
						int[] var17 = var13.ak();

						for (int var18 = 0; var18 < var14; var18++) {
							xi.wt(var8.ay_fld, var17[var18]);
						}
					} else {
						Object[] var15 = (Object[])var13.az();

						for (int var16 = 0; var16 < var14; var16++) {
							xi.ph(var8.ay_fld, (String)var15[var16], -277564527);
						}
					}
				} else if (null == var12) {
					var8.ay_fld.ea(0);
				}
			}

			var8.ay_fld.cn(var8.ay_fld.au_fld * -661977895 - var9, 1230717120);
			client.appletStub.az(var8);
		}
	}

	fp() {
	}
}
