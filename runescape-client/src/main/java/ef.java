import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Shape;
import javax.annotation.Nullable;
import net.runelite.api.GroundObject;
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

@ObfuscatedName("ef")
@Implements({"GroundObject", "TileObject"})
public class ef implements GroundObject, TileObject {
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int be_fld;
	@ObfuscatedName("nj")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int nj_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1921821715
	)
	int av_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -2127213343
	)
	int ae_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lem;"
	)
	public em ak_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -272164647
	)
	int ah_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1337340647
	)
	int az_fld;
	@ObfuscatedName("jb")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1374410115
	)
	static int jb_fld;
	@ObfuscatedName("pt")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	static uu pt_fld;
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int bv_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	@ObfuscatedGetter(
		longValue = 2728893160458550201L
	)
	public long ag_fld;
	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int cm_fld;
	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ct_fld;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -836183525
	)
	static int aq_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "B"
	)
	static byte aw_fld;

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void ag(int var1, int var2) {
		this.az_fld = var1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	public static boolean aw(int var0) {
		return kn.ap_fld.at_fld == var0;
	}

	@ObfuscatedName("getWorldLocation")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/coords/WorldPoint;"
	)
	@Export("getWorldLocation")
	@Override
	public WorldPoint getWorldLocation() {
		dx var1 = dx.bu(this.wy());
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

	@ObfuscatedName("fl")
	@ObfuscatedSignature(
		descriptor = "()Lfn;"
	)
	public fn fl() {
		try {
			em var1 = this.getRenderable();
			if (var1 == null) {
				return null;
			} else {
				return var1 instanceof fn ? (fn)var1 : var1.getModel();
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
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

	@ObfuscatedName("sc")
	@ObfuscatedSignature(
		descriptor = "(Lef;I)I"
	)
	public static int sc(ef var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.az_fld;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int az() {
		return this.az_fld;
	}

	@ObfuscatedName("rp")
	@ObfuscatedSignature(
		descriptor = "(J)V"
	)
	public void rp(long var1) {
		this.ag_fld = var1;
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

	@ObfuscatedName("wy")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int wy() {
		long var1 = this.getHash();
		int var3 = (int)(var1 >> 52 & 4095L);
		if (var3 == 4095L) {
			var3 = -1;
		}

		return var3;
	}

	@ObfuscatedName("zu")
	@ObfuscatedSignature(
		descriptor = "(Lef;I)V"
	)
	public static void zu(ef var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.az_fld = var1;
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

	@ObfuscatedName("wi")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void wi(int var1) {
		this.av_fld = var1;
	}

	@ObfuscatedName("oy")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void oy(int var1) {
		this.az_fld = var1;
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

	@ObfuscatedName("getMinimapLocation")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/Point;"
	)
	@Export("getMinimapLocation")
	@Override
	public Point getMinimapLocation() {
		return Perspective.localToMinimap(og.ci_fld, this.getLocalLocation());
	}

	@ObfuscatedName("getHash")
	@ObfuscatedSignature(
		descriptor = "()J"
	)
	@Export("getHash")
	@Override
	public long getHash() {
		return this.ag_fld;
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

	@ObfuscatedName("getConfig")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getConfig")
	@Override
	public int getConfig() {
		return this.az_fld;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lem;)V"
	)
	public void ap(em var1) {
		this.ak_fld = var1;
	}

	@ObfuscatedName("getLocalLocation")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/coords/LocalPoint;"
	)
	@Export("getLocalLocation")
	@Override
	public LocalPoint getLocalLocation() {
		return new LocalPoint(this.getX(), this.getY(), this.wy());
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

	ef() {
	}

	@ObfuscatedName("getPlane")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getPlane")
	@Override
	public int getPlane() {
		return this.nj_fld;
	}

	@ObfuscatedName("uh")
	@ObfuscatedSignature(
		descriptor = "(Lcn;Z)V"
	)
	public static void uh(cn var0, boolean var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.as_fld = var1;
		og.ag();
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

	@ObfuscatedName("jk")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void jk(int var1) {
		this.ah_fld = var1;
	}

	@ObfuscatedName("zc")
	@ObfuscatedSignature(
		descriptor = "()Lem;"
	)
	public em getRenderable() {
		return this.ak_fld;
	}

	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void hk(int var1) {
		this.ae_fld = var1;
	}

	@ObfuscatedName("getConvexHull")
	@ObfuscatedSignature(
		descriptor = "()Ljava/awt/Shape;"
	)
	@Export("getConvexHull")
	@Override
	public Shape getConvexHull() {
		try {
			fn var1 = this.fl();
			return var1 == null ? null : var1.kw(this.getWorldView(), this.getX(), this.getY(), 0, this.getZ());
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("yh")
	@ObfuscatedSignature(
		descriptor = "()Ldx;"
	)
	public dx getWorldView() {
		return dx.bu(this.wy());
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

	@ObfuscatedName("getClickbox")
	@ObfuscatedSignature(
		descriptor = "()Ljava/awt/Shape;"
	)
	@Export("getClickbox")
	@Override
	public Shape getClickbox() {
		try {
			return Perspective.getClickbox(og.ci_fld, this.getWorldView(), this.fl(), 0, this.ae_fld, this.ah_fld, this.av_fld);
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
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

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int ak(int var1) {
		return this.ah_fld;
	}
}
