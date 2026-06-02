import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.api.RuneLiteObjectController;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("rl24")
public class rl24 extends em {
	@ObfuscatedName("ek")
	@ObfuscatedSignature(
		descriptor = "Lnet/runelite/api/RuneLiteObjectController;"
	)
	public RuneLiteObjectController ek_fld;
	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/Map;"
	)
	public static Map bq_fld = new IdentityHashMap();
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int au_fld;

	@ObfuscatedName("fz")
	@ObfuscatedSignature(
		descriptor = "(Lnet/runelite/api/RuneLiteObjectController;)V"
	)
	public static void fz(RuneLiteObjectController var0) {
		if (!og.ci_fld.isClientThread()) {
			if (!tf.$assertionsDisabled) {
				throw new AssertionError("must be called on client thread");
			} else {
				throw new IllegalStateException("must be called on client thread");
			}
		} else {
			if (!bq_fld.containsKey(var0)) {
				rl24 var1 = new rl24(var0);
				bq_fld.put(var0, var1);
				dx var2 = og.ci_fld.getWorldView(var0.getWorldView());
				var2.cq_fld.az(var1);
			}
		}
	}

	@ObfuscatedName("xf")
	@ObfuscatedSignature(
		descriptor = "(Ldx;)V"
	)
	public void xf(dx var1) {
		try {
			this.ek_fld.tick(client.my_fld);
			if (this.getNext() == null) {
				return;
			}

			var1.az_fld
				.dz(
					this.ek_fld.getLevel(),
					this.ek_fld.getX(),
					this.ek_fld.getY(),
					this.ek_fld.getZ(),
					this.ek_fld.getRadius(),
					this,
					this.ek_fld.getOrientation(),
					-1L,
					this.ek_fld.isDrawFrontTilesFirst()
				);
		} catch (Exception var3) {
			if (this.au_fld < 10) {
				this.au_fld++;
				client.ii_fld.warn("Exception ticking RuneLiteObjectController {}", this.ek_fld, var3);
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Lfn;"
	)
	@Override
	public fn az(int var1) {
		try {
			return (fn)(fn)this.ek_fld.getModel();
		} catch (Exception var3) {
			if (this.au_fld < 10) {
				this.au_fld++;
				client.ii_fld.warn("Exception rendering RuneLiteObjectController {}", this.ek_fld, var3);
			}

			return null;
		}
	}

	@ObfuscatedName("zi")
	@ObfuscatedSignature(
		descriptor = "(Lgf;)I"
	)
	public static int zi(gf var0) {
		return var0.ah_fld;
	}

	@ObfuscatedName("if")
	@ObfuscatedSignature(
		descriptor = "(Lnet/runelite/api/RuneLiteObjectController;)V"
	)
	public static void if_(RuneLiteObjectController var0) {
		if (!og.ci_fld.isClientThread()) {
			if (!tf.$assertionsDisabled) {
				throw new AssertionError("must be called on client thread");
			} else {
				throw new IllegalStateException("must be called on client thread");
			}
		} else {
			rl24 var1 = (rl24)(rl24)bq_fld.remove(var0);
			if (var1 != null) {
				var1.xh();
			}
		}
	}

	@ObfuscatedName("ge")
	@ObfuscatedSignature(
		descriptor = "(Lnet/runelite/api/RuneLiteObjectController;)Z"
	)
	public static boolean ge(RuneLiteObjectController var0) {
		if (!og.ci_fld.isClientThread()) {
			if (!tf.$assertionsDisabled) {
				throw new AssertionError("must be called on client thread");
			} else {
				throw new IllegalStateException("must be called on client thread");
			}
		} else {
			return bq_fld.containsKey(var0);
		}
	}

	public rl24(RuneLiteObjectController var1) {
		this.ek_fld = var1;
	}

	@ObfuscatedName("oj")
	@ObfuscatedSignature(
		descriptor = "(Ldx;)V"
	)
	public static void oj(dx var0) {
		Iterator var1 = var0.worldEntities().iterator();

		while (var1.hasNext()) {
			rg var2 = (rg)(rg)var1.next();
			oj(var2.ah_fld);
		}

		for (rl24 var3 = (rl24)var0.cq_fld.ui(); var3 != null; var3 = (rl24)var0.cq_fld.fc()) {
			var3.xf(var0);
		}
	}
}
