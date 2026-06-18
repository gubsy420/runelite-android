import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.color.ColorSpace;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;
import net.runelite.api.MainBufferProvider;
import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("te")
@Implements({"MainBufferProvider"})
public class te extends yx implements MainBufferProvider {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ljava/awt/Image;"
	)
	Image ak_fld;
	@ObfuscatedName("ln")
	@ObfuscatedSignature(
		descriptor = "Ljava/awt/Graphics;"
	)
	public Graphics ln_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ljava/awt/Component;"
	)
	Component ag_fld;

	@ObfuscatedName("zu")
	@ObfuscatedSignature(
		descriptor = "()Ljava/awt/Component;"
	)
	public Component zu() {
		return this.ag_fld;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Graphics;II)V"
	)
	final void af(Graphics var1, int var2, int var3) {
		try {
			var1.drawImage(this.ak_fld, var2, var3, this.ag_fld);
		} catch (Exception var5) {
			this.ag_fld.repaint();
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;B)V"
	)
	final void ak(Component var1, byte var2) {
		this.ag_fld = var1;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	@Override
	public final void ag(int var1, int var2, int var3) {
		if (this.ln_fld == null) {
			Canvas var4 = (Canvas)this.zu();
			this.ln_fld = var4.getGraphics();
		}

		og.ci_fld.getCallbacks().draw(this, this.ln_fld, var1, var2);
	}

	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "(Lzv;Ljava/lang/String;I)I"
	)
	public static int di(zv var0, String var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		return zv.sh(var0, var1, new int[]{var2}, zv.ab_fld);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;)V"
	)
	final void av(Component var1) {
		this.ag_fld = var1;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;)V"
	)
	final void ae(Component var1) {
		this.ag_fld = var1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	@Override
	public final void aw(int var1, int var2) {
		this.az(this.ag_fld.getGraphics(), var1, var2, -1465142547);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Image;)V"
	)
	public void ay(Image var1) {
		this.ak_fld = var1;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	@Override
	public final void ah(int var1, int var2) {
		this.az(this.ag_fld.getGraphics(), var1, var2, -1527618013);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Graphics;III)V"
	)
	final void az(Graphics var1, int var2, int var3, int var4) {
		try {
			var1.drawImage(this.ak_fld, var2, var3, this.ag_fld);
		} catch (Exception var6) {
			this.ag_fld.repaint();
		}
	}

	@ObfuscatedName("getImage")
	@ObfuscatedSignature(
		descriptor = "()Ljava/awt/Image;"
	)
	@Export("getImage")
	@Override
	public Image getImage() {
		return this.ak_fld;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Graphics;II)V"
	)
	final void ay(Graphics var1, int var2, int var3) {
		try {
			var1.drawImage(this.ak_fld, var2, var3, this.ag_fld);
		} catch (Exception var5) {
			this.ag_fld.repaint();
		}
	}

	te(int var1, int var2, Component var3, boolean var4) {
		super.av_fld = var1;
		super.ae_fld = var2;
		super.az_fld = new int[var1 * var2 + 1];
		boolean var5 = og.ci_fld.isGpu();
		if (var4 && !var5) {
			super.ah_fld = new float[var1 * var2 + 1];
		}

		DataBufferInt var6 = new DataBufferInt(super.az_fld, super.az_fld.length);
		DirectColorModel var7;
		if (var5) {
			var7 = new DirectColorModel(ColorSpace.getInstance(1000), 32, 16711680, 65280, 255, -16777216, true, 3);
		} else {
			var7 = new DirectColorModel(32, 16711680, 65280, 255);
		}

		WritableRaster var8 = Raster.createWritableRaster(var7.createCompatibleSampleModel(super.av_fld, super.ae_fld), var6, null);
		this.ak_fld = new BufferedImage(var7, var8, false, new Hashtable());
		this.ag_fld = var3;
		this.lt();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Graphics;II)V"
	)
	final void al(Graphics var1, int var2, int var3) {
		try {
			var1.drawImage(this.ak_fld, var2, var3, this.ag_fld);
		} catch (Exception var5) {
			this.ag_fld.repaint();
		}
	}
}
