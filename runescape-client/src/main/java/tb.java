import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("tb")
public class tb extends Canvas {
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int bu_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int aw_fld;
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int bh_fld;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bd_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int av_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ljava/awt/Component;"
	)
	Component ak_fld;

	tb(Component var1) {
		this.ak_fld = var1;
	}

	@ObfuscatedName("update")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Graphics;)V"
	)
	@Override
	public final void update(Graphics var1) {
		this.ak_fld.update(var1);
	}

	@ObfuscatedName("agw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Graphics;)V"
	)
	public final void agw(Graphics var1) {
		this.ak_fld.paint(var1);
	}

	@ObfuscatedName("agb")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Graphics;)V"
	)
	public final void agb(Graphics var1) {
		this.ak_fld.paint(var1);
	}

	@ObfuscatedName("paint")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Graphics;)V"
	)
	@Override
	public final void paint(Graphics var1) {
		this.ak_fld.paint(var1);
	}

	@ObfuscatedName("ki")
	@ObfuscatedSignature(
		descriptor = "(Ltb;Ljava/awt/Graphics;)V"
	)
	public static void ki(tb var0, Graphics var1) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.ak_fld.paint(var1);
		}
	}

	@ObfuscatedName("agt")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Graphics;)V"
	)
	public final void agt(Graphics var1) {
		this.ak_fld.paint(var1);
	}

	@ObfuscatedName("agc")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Graphics;)V"
	)
	public final void agc(Graphics var1) {
		this.ak_fld.paint(var1);
	}

	@ObfuscatedName("agl")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Graphics;)V"
	)
	public final void agl(Graphics var1) {
		this.ak_fld.update(var1);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "([Llu;Llu;ZLuo;Lqg;I)V"
	)
	public static void ag(lu[] var0, lu var1, boolean var2, uo var3, qg var4, int var5) throws EOFException {
		try {
			int var6 = var1.cn_fld != 0 ? var1.cn_fld : var1.bb_fld;
			int var7 = var1.cr_fld != 0 ? var1.cr_fld : var1.cd_fld;
			fm.av(var0, var1.cx_fld, var1.cs_fld, var1.bf_fld, var1.by_fld, var6, var7, var2, var3, var4, -465140312);
			if (null != var1.ge_fld) {
				fm.av(var1.ge_fld, 0, var1.ge_fld.length - 1, var1.bf_fld, -1, var6, var7, var2, var3, var4, -1014643385);
			}

			if (var1.by_fld == -1) {
				pk var8 = (pk)var3.ai_fld.ak(var1.bf_fld);
				if (null != var8) {
					if (var5 <= -1190890470) {
						return;
					}

					int var9 = var8.ak_fld;
					if (var3.az(var9)) {
						fm.av(var3.aw_fld[var9], 0, var3.aw_fld[var9].length - 1, -1, -1, var6, var7, var2, var3, var4, 58058827);
					}
				}
			}
		} catch (Throwable var10) {
			throw new RuntimeException(var10);
		}
	}
}
