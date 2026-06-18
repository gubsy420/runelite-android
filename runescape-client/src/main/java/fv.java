import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Shape;
import javax.annotation.Nullable;
import net.runelite.api.DecorativeObject;
import net.runelite.api.Perspective;
import net.runelite.api.Point;
import net.runelite.api.TileObject;
import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.geometry.Shapes;

@ObfuscatedName("fv")
@Implements({"DecorativeObject", "TileObject"})
public class fv implements DecorativeObject, TileObject {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 963844279
	)
	int al_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lem;"
	)
	public em ag_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	@ObfuscatedGetter(
		longValue = 7130385936274174641L
	)
	public long az_fld = 0L;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -685411613
	)
	int av_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1936357779
	)
	int ae_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -762310205
	)
	int ah_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1763963095
	)
	int aw_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -113054947
	)
	int ay_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lem;"
	)
	public em ak_fld;
	@ObfuscatedName("pj")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int pj_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -704799827
	)
	int as_fld;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -840502029
	)
	int af_fld;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 56412047
	)
	int ar_fld;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -890468509
	)
	int au_fld = 0;
	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	static boolean dh_fld;
	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int cd_fld;

	@ObfuscatedName("getYOffset2")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getYOffset2")
	@Override
	public int getYOffset2() {
		return this.al_fld;
	}

	@ObfuscatedName("getX")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getX")
	@Override
	public int getX() {
		return this.ae_fld;
	}

	@ObfuscatedName("ze")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ze() {
		long var1 = this.getHash();
		int var3 = (int)(var1 >> 52 & 4095L);
		if (var3 == 4095L) {
			var3 = -1;
		}

		return var3;
	}

	@ObfuscatedName("gf")
	@ObfuscatedSignature(
		descriptor = "(Lem;)V"
	)
	public void gf(em var1) {
		this.ak_fld = var1;
	}

	@ObfuscatedName("getCanvasLocation")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/Point;"
	)
	@Export("getCanvasLocation")
	@Override
	public Point getCanvasLocation() {
		return this.getCanvasLocation(0);
	}

	@ObfuscatedName("sn")
	@ObfuscatedSignature(
		descriptor = "()Lem;"
	)
	public em getRenderable() {
		return this.ak_fld;
	}

	@ObfuscatedName("getXOffset")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getXOffset")
	@Override
	public int getXOffset() {
		return this.as_fld;
	}

	@ObfuscatedName("jo")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int jo() {
		return this.ay_fld;
	}

	@ObfuscatedName("ft")
	@ObfuscatedSignature(
		descriptor = "(J)V"
	)
	public void ft(long var1) {
		this.az_fld = var1;
	}

	@ObfuscatedName("getConfig")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getConfig")
	@Override
	public int getConfig() {
		return this.au_fld;
	}

	@ObfuscatedName("getLocalLocation")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/coords/LocalPoint;"
	)
	@Export("getLocalLocation")
	@Override
	public LocalPoint getLocalLocation() {
		return new LocalPoint(this.getX(), this.getY(), this.ze());
	}

	@ObfuscatedName("nx")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void nx(int var1) {
		this.ay_fld = var1;
	}

	@ObfuscatedName("getConvexHull2")
	@ObfuscatedSignature(
		descriptor = "()Ljava/awt/Shape;"
	)
	@Export("getConvexHull2")
	@Override
	public Shape getConvexHull2() {
		try {
			fn var1 = this.rm();
			return var1 == null ? null : var1.kw(this.getWorldView(), this.ae_fld + this.af_fld, this.ah_fld + this.al_fld, 0, this.getZ());
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("getMinimapLocation")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/Point;"
	)
	@Export("getMinimapLocation")
	@Override
	public Point getMinimapLocation() {
		return Perspective.localToMinimap(og.ci_fld, this.getLocalLocation());
	}

	@ObfuscatedName("fw")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void fw(int var1) {
		this.ae_fld = var1;
	}

	@ObfuscatedName("getXOffset2")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getXOffset2")
	@Override
	public int getXOffset2() {
		return this.af_fld;
	}

	@ObfuscatedName("rm")
	@ObfuscatedSignature(
		descriptor = "()Lfn;"
	)
	public fn rm() {
		try {
			em var1 = this.getRenderable2();
			if (var1 == null) {
				return null;
			} else {
				fn var2;
				if (var1 instanceof fn) {
					var2 = (fn)var1;
				} else {
					var2 = var1.getModel();
				}

				return var2;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	fv() {
	}

	@ObfuscatedName("kg")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void kg(int var1) {
		this.av_fld = var1;
	}

	@ObfuscatedName("getId")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getId")
	@Override
	public int getId() {
		long var1 = this.getHash();
		return (int)(var1 >>> 20 & 4294967295L);
	}

	@ObfuscatedName("vb")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void vb(int var1) {
		this.ah_fld = var1;
	}

	@ObfuscatedName("getPlane")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getPlane")
	@Override
	public int getPlane() {
		return this.pj_fld;
	}

	@ObfuscatedName("rv")
	@ObfuscatedSignature(
		descriptor = "(Lem;)V"
	)
	public void rv(em var1) {
		this.ag_fld = var1;
	}

	@ObfuscatedName("getClickbox")
	@ObfuscatedSignature(
		descriptor = "()Ljava/awt/Shape;"
	)
	@Export("getClickbox")
	@Override
	public Shape getClickbox() {
		try {
			dx var1 = this.getWorldView();
			Shape var2 = Perspective.getClickbox(og.ci_fld, var1, this.gk(), 0, this.ae_fld + this.as_fld, this.ah_fld + this.ar_fld, this.av_fld);
			Shape var3 = Perspective.getClickbox(og.ci_fld, var1, this.rm(), 0, this.ae_fld + this.af_fld, this.ah_fld, this.av_fld + this.al_fld);
			if (var2 != null && var3 != null) {
				return new Shapes<>(var2, var3);
			} else {
				return var2 != null ? var2 : var3;
			}
		} catch (Throwable var5) {
			throw new RuntimeException(var5);
		}
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "()Lem;"
	)
	public em getRenderable2() {
		return this.ag_fld;
	}

	@ObfuscatedName("isOpShown")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	@Export("isOpShown")
	@Override
	public boolean isOpShown(int var1) {
		cs var2 = this.getWorldView().tt(this.getHash());
		return var2 == null ? true : var2.fz(var1);
	}

	@ObfuscatedName("getYOffset")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getYOffset")
	@Override
	public int getYOffset() {
		return this.ar_fld;
	}

	@ObfuscatedName("gk")
	@ObfuscatedSignature(
		descriptor = "()Lfn;"
	)
	public fn gk() {
		try {
			em var1 = this.getRenderable();
			if (var1 == null) {
				return null;
			} else {
				fn var2;
				if (var1 instanceof fn) {
					var2 = (fn)var1;
				} else {
					var2 = var1.getModel();
				}

				return var2;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("getWorldLocation")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/coords/WorldPoint;"
	)
	@Export("getWorldLocation")
	@Override
	public WorldPoint getWorldLocation() {
		dx var1 = dx.bu(this.ze());
		if (var1 == null) {
			var1 = bw.dk_fld;
		}

		if ((Object)this instanceof fj) {
			fj var2 = (fj)(Object)this;
			int var3 = var2.ay_fld;
			int var4 = var2.ar_fld;
			int var5 = var2.as_fld - var3;
			int var6 = var2.af_fld - var4;
			return WorldPoint.fromScene(var1, var3 + var5 / 2, var4 + var6 / 2, this.getPlane());
		} else {
			return WorldPoint.fromLocal(var1, this.getX(), this.getY(), this.getPlane());
		}
	}

	@ObfuscatedName("getZ")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getZ")
	@Override
	public int getZ() {
		return this.av_fld;
	}

	@ObfuscatedName("getConvexHull")
	@ObfuscatedSignature(
		descriptor = "()Ljava/awt/Shape;"
	)
	@Export("getConvexHull")
	@Override
	public Shape getConvexHull() {
		try {
			fn var1 = this.gk();
			return var1 == null ? null : var1.kw(this.getWorldView(), this.ae_fld + this.as_fld, this.ah_fld + this.ar_fld, 0, this.getZ());
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("getHash")
	@ObfuscatedSignature(
		descriptor = "()J"
	)
	@Export("getHash")
	@Override
	public long getHash() {
		return this.az_fld;
	}

	@ObfuscatedName("gk")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void gk(int var1) {
		this.aw_fld = var1;
	}

	@ObfuscatedName("getY")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getY")
	@Override
	public int getY() {
		return this.ah_fld;
	}

	@ObfuscatedName("kg")
	@ObfuscatedSignature(
		descriptor = "()Ldx;"
	)
	public dx getWorldView() {
		return dx.bu(this.ze());
	}

	@ObfuscatedName("getCanvasLocation")
	@ObfuscatedSignature(
		descriptor = "(I)Lnet/runelite/api/Point;"
	)
	@Export("getCanvasLocation")
	@Override
	public Point getCanvasLocation(int var1) {
		return Perspective.localToCanvas(og.ci_fld, this.getLocalLocation(), this.getPlane(), var1);
	}

	@ObfuscatedName("hw")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void hw(int var1) {
		this.au_fld = var1;
	}

	@ObfuscatedName("getCanvasTextLocation")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Graphics2D;Ljava/lang/String;I)Lnet/runelite/api/Point;"
	)
	@Export("getCanvasTextLocation")
	@Override
	public Point getCanvasTextLocation(Graphics2D var1, String var2, int var3) {
		return Perspective.getCanvasTextLocation(og.ci_fld, var1, this.getLocalLocation(), var2, var3);
	}

	@Nullable
	@ObfuscatedName("getOpOverride")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;"
	)
	@Export("getOpOverride")
	@Override
	public String getOpOverride(int var1) {
		cs var2 = this.getWorldView().tt(this.getHash());
		return var2 == null ? null : var2.qf(var1);
	}

	@ObfuscatedName("getCanvasTilePoly")
	@ObfuscatedSignature(
		descriptor = "()Ljava/awt/Polygon;"
	)
	@Export("getCanvasTilePoly")
	@Override
	public Polygon getCanvasTilePoly() {
		int var1 = 1;
		int var2 = 1;
		if ((Object)this instanceof fj) {
			fj var3 = (fj)(Object)this;
			var1 = var3.as_fld - var3.ay_fld + 1;
			var2 = var3.af_fld - var3.ar_fld + 1;
		}

		return Perspective.getCanvasTileAreaPoly(og.ci_fld, this.getLocalLocation(), var1, var2, this.getPlane(), 0);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public static void av() {
		oe.cq_fld.av();
		oe.cv_fld.av();
		oe.cs_fld.av();
		oe.cp_fld.av();
	}
}
