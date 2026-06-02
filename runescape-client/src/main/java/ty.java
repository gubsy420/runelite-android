import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("ty")
public class ty {
	@ObfuscatedGetter(
		intValue = -1744104081
	)
	@ObfuscatedName("rh")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int rh_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ag_fld;

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "([B)Lyv;"
	)
	public static final yv az(byte[] var0) {
		BufferedImage var1 = null;

		try {
			synchronized (ImageIO.class) {
				var1 = ImageIO.read(new ByteArrayInputStream(var0));
			}

			if (null != var1) {
				int var10 = var1.getWidth();
				int var3 = var1.getHeight();
				int[] var4 = new int[var3 * var10];
				PixelGrabber var5 = new PixelGrabber(var1, 0, 0, var10, var3, var4, 0, var10);
				var5.grabPixels();
				return new yv(var4, var10, var3);
			}
		} catch (IOException var7) {
		} catch (InterruptedException var8) {
		}

		return null;
	}

	@ObfuscatedName("jp")
	@ObfuscatedSignature(
		descriptor = "(Lcv;)Z"
	)
	public static boolean jp(cv var0) {
		if (var0 == null) {
			var0.getClass();
		}

		if (rw.ak_fld == var0.bm_fld) {
			var0.af(-54664665);
		}

		return var0.bm_fld == rw.ag_fld;
	}

	static {
		ImageIO.setUseCache(false);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "([B)Lyv;"
	)
	public static final yv ag(byte[] var0) {
		BufferedImage var1 = null;

		try {
			synchronized (ImageIO.class) {
				var1 = ImageIO.read(new ByteArrayInputStream(var0));
			}

			if (null != var1) {
				int var10 = var1.getWidth();
				int var3 = var1.getHeight();
				int[] var4 = new int[var3 * var10];
				PixelGrabber var5 = new PixelGrabber(var1, 0, 0, var10, var3, var4, 0, var10);
				var5.grabPixels();
				return new yv(var4, var10, var3);
			}
		} catch (IOException var7) {
		} catch (InterruptedException var8) {
		}

		return null;
	}

	ty() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(J)I"
	)
	public static int ah(long var0) {
		int var2 = (int)(var0 >>> 52 & 4095L);
		if (var2 == 4095L) {
			var2 = -1;
		}

		return var2;
	}
}
