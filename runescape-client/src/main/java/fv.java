import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Shape;
import javax.annotation.Nullable;
import net.runelite.api.DecorativeObject;
import net.runelite.api.Perspective;
import net.runelite.api.Point;
import net.runelite.api.TileObject;
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
	@ObfuscatedGetter(
		intValue = 963844279
	)
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int al_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lem;"
	)
	public em ag_fld;
	@ObfuscatedGetter(
		longValue = 7130385936274174641L
	)
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	public long az_fld = 0L;
	@ObfuscatedGetter(
		intValue = -685411613
	)
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int av_fld;
	@ObfuscatedGetter(
		intValue = -1936357779
	)
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ae_fld;
	@ObfuscatedGetter(
		intValue = -762310205
	)
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ah_fld;
	@ObfuscatedName("sy")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int sy_fld;
	@ObfuscatedGetter(
		intValue = 1763963095
	)
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int aw_fld;
	@ObfuscatedGetter(
		intValue = -113054947
	)
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ay_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lem;"
	)
	public em ak_fld;
	@ObfuscatedGetter(
		intValue = -704799827
	)
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int as_fld;
	@ObfuscatedGetter(
		intValue = -840502029
	)
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int af_fld;
	@ObfuscatedGetter(
		intValue = 56412047
	)
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ar_fld;
	@ObfuscatedGetter(
		intValue = -890468509
	)
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "I"
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

	@ObfuscatedName("getCanvasTextLocation")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Graphics2D;Ljava/lang/String;I)Lnet/runelite/api/Point;"
	)
	@Override
	public Point getCanvasTextLocation(Graphics2D var1, String var2, int var3) {
		return Perspective.getCanvasTextLocation(og.ci_fld, var1, this.getLocalLocation(), var2, var3);
	}

	@ObfuscatedName("er")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void er(int var1) {
		this.ah_fld = var1;
	}

	@ObfuscatedName("getY")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getY() {
		return this.ah_fld;
	}

	@ObfuscatedName("mr")
	@ObfuscatedSignature(
		descriptor = "()Ldx;"
	)
	public dx getWorldView() {
		return dx.ws(this.hd());
	}

	@ObfuscatedName("getConvexHull2")
	@ObfuscatedSignature(
		descriptor = "()Ljava/awt/Shape;"
	)
	@Override
	public Shape getConvexHull2() {
		try {
			fn var1 = this.lk();
			return var1 == null ? null : var1.bz(this.getWorldView(), this.ae_fld + this.af_fld, this.ah_fld + this.al_fld, 0, this.getZ());
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("qz")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int qz() {
		return this.ay_fld;
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(Luk;Llu;II)Z"
	)
	public static boolean bn(uk var0, lu var1, int var2, int var3) {
		if (var1 == var0.ag_fld) {
			var0.af_fld = true;
			var0.as_fld = var2;
			var0.ar_fld = 1241177114 * var3;
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("getConfig")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getConfig() {
		return this.au_fld;
	}

	@ObfuscatedName("getCanvasTilePoly")
	@ObfuscatedSignature(
		descriptor = "()Ljava/awt/Polygon;"
	)
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

	@ObfuscatedName("wt")
	@ObfuscatedSignature(
		descriptor = "(Lma;Ljava/lang/String;)I"
	)
	public static int wt(ma var0, String var1) {
		return var0.af_fld.ay_fld.containsKey(var1) ? (Integer)var0.af_fld.ay_fld.get(var1) : -1;
	}

	@ObfuscatedName("uq")
	@ObfuscatedSignature(
		descriptor = "(Lem;)V"
	)
	public void uq(em var1) {
		this.ak_fld = var1;
	}

	fv() {
	}

	@ObfuscatedName("getCanvasLocation")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/Point;"
	)
	@Override
	public Point getCanvasLocation() {
		return this.getCanvasLocation(0);
	}

	@ObfuscatedName("getX")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getX() {
		return this.ae_fld;
	}

	@ObfuscatedName("getHash")
	@ObfuscatedSignature(
		descriptor = "()J"
	)
	@Override
	public long getHash() {
		return this.az_fld;
	}

	@ObfuscatedName("getYOffset")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getYOffset() {
		return this.ar_fld;
	}

	@ObfuscatedName("getZ")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getZ() {
		return this.av_fld;
	}

	@ObfuscatedName("getXOffset2")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getXOffset2() {
		return this.af_fld;
	}

	@ObfuscatedName("so")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void so(int var1) {
		this.ae_fld = var1;
	}

	@ObfuscatedName("ig")
	@ObfuscatedSignature(
		descriptor = "()Lem;"
	)
	public em getRenderable2() {
		return this.ag_fld;
	}

	@ObfuscatedName("la")
	@ObfuscatedSignature(
		descriptor = "(Ltl;Lts;I)V"
	)
	public static void la(tl var0, ts var1, int var2) {
		var0.az_fld[var2] = var1;
	}

	@ObfuscatedName("km")
	@ObfuscatedSignature(
		descriptor = "()Lfn;"
	)
	public fn km() {
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

	@ObfuscatedName("getId")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getId() {
		long var1 = this.getHash();
		return (int)(var1 >>> 20 & 4294967295L);
	}

	@ObfuscatedName("getClickbox")
	@ObfuscatedSignature(
		descriptor = "()Ljava/awt/Shape;"
	)
	@Override
	public Shape getClickbox() {
		try {
			dx var1 = this.getWorldView();
			Shape var2 = Perspective.getClickbox(og.ci_fld, var1, this.km(), 0, this.ae_fld + this.as_fld, this.ah_fld + this.ar_fld, this.av_fld);
			Shape var3 = Perspective.getClickbox(og.ci_fld, var1, this.lk(), 0, this.ae_fld + this.af_fld, this.ah_fld, this.av_fld + this.al_fld);
			if (var2 != null && var3 != null) {
				return new Shapes<>(var2, var3);
			} else {
				return var2 != null ? var2 : var3;
			}
		} catch (Throwable var5) {
			throw new RuntimeException(var5);
		}
	}

	@ObfuscatedName("getConvexHull")
	@ObfuscatedSignature(
		descriptor = "()Ljava/awt/Shape;"
	)
	@Override
	public Shape getConvexHull() {
		try {
			fn var1 = this.km();
			return var1 == null ? null : var1.bz(this.getWorldView(), this.ae_fld + this.as_fld, this.ah_fld + this.ar_fld, 0, this.getZ());
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("getXOffset")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getXOffset() {
		return this.as_fld;
	}

	@ObfuscatedName("isOpShown")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	@Override
	public boolean isOpShown(int var1) {
		cs var2 = this.getWorldView().dg(this.getHash());
		return var2 == null ? true : var2.ap(var1);
	}

	@ObfuscatedName("tc")
	@ObfuscatedSignature(
		descriptor = "(J)V"
	)
	public void tc(long var1) {
		this.az_fld = var1;
	}

	@ObfuscatedName("oy")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void oy(int var1) {
		this.av_fld = var1;
	}

	@Nullable
	@ObfuscatedName("getOpOverride")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;"
	)
	@Override
	public String getOpOverride(int var1) {
		cs var2 = this.getWorldView().dg(this.getHash());
		return var2 == null ? null : var2.ky(var1);
	}

	@ObfuscatedName("getCanvasLocation")
	@ObfuscatedSignature(
		descriptor = "(I)Lnet/runelite/api/Point;"
	)
	@Override
	public Point getCanvasLocation(int var1) {
		return Perspective.localToCanvas(og.ci_fld, this.getLocalLocation(), this.getPlane(), var1);
	}

	@ObfuscatedName("my")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void my(int var1) {
		this.aw_fld = var1;
	}

	@ObfuscatedName("ns")
	@ObfuscatedSignature(
		descriptor = "()Lem;"
	)
	public em getRenderable() {
		return this.ak_fld;
	}

	@ObfuscatedName("rd")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void rd(int var1) {
		this.au_fld = var1;
	}

	@ObfuscatedName("it")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void it(int var1) {
		this.ay_fld = var1;
	}

	@ObfuscatedName("lk")
	@ObfuscatedSignature(
		descriptor = "()Lfn;"
	)
	public fn lk() {
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

	@ObfuscatedName("getLocalLocation")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/coords/LocalPoint;"
	)
	@Override
	public LocalPoint getLocalLocation() {
		return new LocalPoint(this.getX(), this.getY(), this.hd());
	}

	@ObfuscatedName("hd")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int hd() {
		long var1 = this.getHash();
		int var3 = (int)(var1 >> 52 & 4095L);
		if (var3 == 4095L) {
			var3 = -1;
		}

		return var3;
	}

	@ObfuscatedName("getWorldLocation")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/coords/WorldPoint;"
	)
	@Override
	public WorldPoint getWorldLocation() {
		dx var1 = dx.ws(this.hd());
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

	@ObfuscatedName("getPlane")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getPlane() {
		return this.sy_fld;
	}

	@ObfuscatedName("getYOffset2")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getYOffset2() {
		return this.al_fld;
	}

	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		descriptor = "(Lem;)V"
	)
	public void ht(em var1) {
		this.ag_fld = var1;
	}

	@ObfuscatedName("getMinimapLocation")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/Point;"
	)
	@Override
	public Point getMinimapLocation() {
		return Perspective.localToMinimap(og.ci_fld, this.getLocalLocation());
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public static void av() {
		oe.cq_fld.vh();
		oe.cv_fld.vh();
		oe.cs_fld.vh();
		oe.cp_fld.vh();
	}
}
