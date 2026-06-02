import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Shape;
import javax.annotation.Nullable;
import net.runelite.api.GroundObject;
import net.runelite.api.Perspective;
import net.runelite.api.Point;
import net.runelite.api.TileObject;
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
	@ObfuscatedGetter(
		intValue = 1921821715
	)
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int az_fld;
	@ObfuscatedGetter(
		intValue = -2127213343
	)
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int av_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lem;"
	)
	public em ak_fld;
	@ObfuscatedGetter(
		intValue = -272164647
	)
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ae_fld;
	@ObfuscatedName("rh")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int rh_fld;
	@ObfuscatedGetter(
		intValue = 1337340647
	)
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ah_fld;
	@ObfuscatedGetter(
		intValue = -1374410115
	)
	@ObfuscatedName("jb")
	@ObfuscatedSignature(
		descriptor = "I"
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
	@ObfuscatedGetter(
		longValue = 2728893160458550201L
	)
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "J"
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
	@ObfuscatedGetter(
		intValue = -836183525
	)
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int aq_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "B"
	)
	static byte aw_fld;

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

	@ObfuscatedName("getConfig")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getConfig() {
		return this.ah_fld;
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

	@ObfuscatedName("getConvexHull")
	@ObfuscatedSignature(
		descriptor = "()Ljava/awt/Shape;"
	)
	@Override
	public Shape getConvexHull() {
		try {
			fn var1 = this.wr();
			return var1 == null ? null : var1.bz(this.getWorldView(), this.getX(), this.getY(), 0, this.getZ());
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void ag(int var1, int var2) {
		this.ah_fld = var1;
	}

	@ObfuscatedName("getPlane")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getPlane() {
		return this.rh_fld;
	}

	@ObfuscatedName("tt")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int tt() {
		long var1 = this.getHash();
		int var3 = (int)(var1 >> 52 & 4095L);
		if (var3 == 4095L) {
			var3 = -1;
		}

		return var3;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public static boolean aw(int var0) {
		return kn.ap_fld.at_fld == var0;
	}

	@ObfuscatedName("getX")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getX() {
		return this.av_fld;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int az() {
		return this.ah_fld;
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

	ef() {
	}

	@ObfuscatedName("getCanvasLocation")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/Point;"
	)
	@Override
	public Point getCanvasLocation() {
		return this.getCanvasLocation(0);
	}

	@ObfuscatedName("getClickbox")
	@ObfuscatedSignature(
		descriptor = "()Ljava/awt/Shape;"
	)
	@Override
	public Shape getClickbox() {
		try {
			return Perspective.getClickbox(og.ci_fld, this.getWorldView(), this.wr(), 0, this.av_fld, this.ae_fld, this.az_fld);
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("getMinimapLocation")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/Point;"
	)
	@Override
	public Point getMinimapLocation() {
		return Perspective.localToMinimap(og.ci_fld, this.getLocalLocation());
	}

	@ObfuscatedName("getHash")
	@ObfuscatedSignature(
		descriptor = "()J"
	)
	@Override
	public long getHash() {
		return this.ag_fld;
	}

	@ObfuscatedName("rt")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void rt(int var1) {
		this.av_fld = var1;
	}

	@ObfuscatedName("getLocalLocation")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/coords/LocalPoint;"
	)
	@Override
	public LocalPoint getLocalLocation() {
		return new LocalPoint(this.getX(), this.getY(), this.tt());
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

	@ObfuscatedName("getY")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getY() {
		return this.ae_fld;
	}

	@ObfuscatedName("tq")
	@ObfuscatedSignature(
		descriptor = "(Lem;)V"
	)
	public void tq(em var1) {
		this.ak_fld = var1;
	}

	@ObfuscatedName("getCanvasLocation")
	@ObfuscatedSignature(
		descriptor = "(I)Lnet/runelite/api/Point;"
	)
	@Override
	public Point getCanvasLocation(int var1) {
		return Perspective.localToCanvas(og.ci_fld, this.getLocalLocation(), this.getPlane(), var1);
	}

	@ObfuscatedName("ft")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void ft(int var1) {
		this.ae_fld = var1;
	}

	@ObfuscatedName("iu")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void iu(int var1) {
		this.ah_fld = var1;
	}

	@ObfuscatedName("getWorldLocation")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/coords/WorldPoint;"
	)
	@Override
	public WorldPoint getWorldLocation() {
		dx var1 = dx.ws(this.tt());
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

	@ObfuscatedName("pp")
	@ObfuscatedSignature(
		descriptor = "(Lef;I)I"
	)
	public static int pp(ef var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.ah_fld;
	}

	@ObfuscatedName("getZ")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getZ() {
		return this.az_fld;
	}

	@ObfuscatedName("ug")
	@ObfuscatedSignature(
		descriptor = "()Ldx;"
	)
	public dx getWorldView() {
		return dx.ws(this.tt());
	}

	@ObfuscatedName("sc")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void sc(int var1) {
		this.az_fld = var1;
	}

	@ObfuscatedName("wr")
	@ObfuscatedSignature(
		descriptor = "()Lfn;"
	)
	public fn wr() {
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

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void av(int var1) {
		this.ah_fld = var1;
	}

	@ObfuscatedName("gs")
	@ObfuscatedSignature(
		descriptor = "(J)V"
	)
	public void gs(long var1) {
		this.ag_fld = var1;
	}

	@ObfuscatedName("getCanvasTextLocation")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Graphics2D;Ljava/lang/String;I)Lnet/runelite/api/Point;"
	)
	@Override
	public Point getCanvasTextLocation(Graphics2D var1, String var2, int var3) {
		return Perspective.getCanvasTextLocation(og.ci_fld, var1, this.getLocalLocation(), var2, var3);
	}

	@ObfuscatedName("vm")
	@ObfuscatedSignature(
		descriptor = "()Lem;"
	)
	public em getRenderable() {
		return this.ak_fld;
	}

	@ObfuscatedName("wo")
	@ObfuscatedSignature(
		descriptor = "(Lcn;)V"
	)
	public static void wo(cn var0) {
		if (var0 == null) {
			var0.getClass();
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int ak(int var1) {
		return this.av_fld;
	}
}
