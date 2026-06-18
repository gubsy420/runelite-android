import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.api.RuneLiteObjectController;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("rl24")
public class rl24 extends em {
	@ObfuscatedName("wp")
	@ObfuscatedSignature(
		descriptor = "Lnet/runelite/api/RuneLiteObjectController;"
	)
	public RuneLiteObjectController wp_fld;
	@ObfuscatedName("kg")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int kg_fld;
	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/Map;"
	)
	public static Map dw_fld = new IdentityHashMap();

	@ObfuscatedName("ky")
	@ObfuscatedSignature(
		descriptor = "(Ldx;)V"
	)
	public static void ky(dx var0) {
		Iterator var1 = var0.worldEntities().iterator();

		while (var1.hasNext()) {
			rg var2 = (rg)(rg)var1.next();
			ky(var2.ah_fld);
		}

		for (rl24 var3 = (rl24)var0.vs_fld.yr(); var3 != null; var3 = (rl24)var0.vs_fld.dg()) {
			var3.vo(var0);
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Lfn;"
	)
	@Override
	public fn az(int var1) {
		try {
			return (fn)(fn)this.wp_fld.getModel();
		} catch (Exception var3) {
			if (this.kg_fld < 10) {
				this.kg_fld++;
				client.logger.warn("Exception rendering RuneLiteObjectController {}", this.wp_fld, var3);
			}

			return null;
		}
	}

	@ObfuscatedName("qn")
	@ObfuscatedSignature(
		descriptor = "(Lnet/runelite/api/RuneLiteObjectController;)V"
	)
	public static void qn(RuneLiteObjectController var0) {
		if (!og.ci_fld.isClientThread()) {
			if (!tf.$assertionsDisabled) {
				throw new AssertionError("must be called on client thread");
			} else {
				throw new IllegalStateException("must be called on client thread");
			}
		} else {
			if (!dw_fld.containsKey(var0)) {
				rl24 var1 = new rl24(var0);
				dw_fld.put(var0, var1);
				dx var2 = og.ci_fld.getWorldView(var0.getWorldView());
				var2.vs_fld.eg(var1);
			}
		}
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(Lnet/runelite/api/RuneLiteObjectController;)Z"
	)
	public static boolean bb(RuneLiteObjectController var0) {
		if (!og.ci_fld.isClientThread()) {
			if (!tf.$assertionsDisabled) {
				throw new AssertionError("must be called on client thread");
			} else {
				throw new IllegalStateException("must be called on client thread");
			}
		} else {
			return dw_fld.containsKey(var0);
		}
	}

	@ObfuscatedName("vo")
	@ObfuscatedSignature(
		descriptor = "(Ldx;)V"
	)
	public void vo(dx var1) {
		try {
			this.wp_fld.tick(client.my_fld);
			if (this.getNext() == null) {
				return;
			}

			var1.az_fld
				.ot(
					this.wp_fld.getLevel(),
					this.wp_fld.getX(),
					this.wp_fld.getY(),
					this.wp_fld.getZ(),
					this.wp_fld.getRadius(),
					this,
					this.wp_fld.getOrientation(),
					-1L,
					this.wp_fld.isDrawFrontTilesFirst()
				);
		} catch (Exception var3) {
			if (this.kg_fld < 10) {
				this.kg_fld++;
				client.logger.warn("Exception ticking RuneLiteObjectController {}", this.wp_fld, var3);
			}
		}
	}

	@ObfuscatedName("sd")
	@ObfuscatedSignature(
		descriptor = "(Lnet/runelite/api/RuneLiteObjectController;)V"
	)
	public static void sd(RuneLiteObjectController var0) {
		if (!og.ci_fld.isClientThread()) {
			if (!tf.$assertionsDisabled) {
				throw new AssertionError("must be called on client thread");
			} else {
				throw new IllegalStateException("must be called on client thread");
			}
		} else {
			rl24 var1 = (rl24)(rl24)dw_fld.remove(var0);
			if (var1 != null) {
				var1.pz_void();
			}
		}
	}

	public rl24(RuneLiteObjectController var1) {
		this.wp_fld = var1;
	}

	@ObfuscatedName("vx")
	@ObfuscatedSignature(
		descriptor = "(Lgj;)[I"
	)
	public static int[] vx(gj var0) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.az_fld;
	}
}
