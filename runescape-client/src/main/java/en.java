import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Shape;
import java.awt.event.FocusEvent;
import java.awt.geom.Area;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import javax.annotation.Nullable;
import net.runelite.api.ItemLayer;
import net.runelite.api.Perspective;
import net.runelite.api.Point;
import net.runelite.api.TileObject;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;

@ObfuscatedName("en")
@Implements({"ItemLayer", "TileObject"})
public class en implements ItemLayer, TileObject {
	@ObfuscatedGetter(
		longValue = -3709018470773594609L
	)
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	long aw_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lem;"
	)
	em ae_fld;
	@ObfuscatedGetter(
		intValue = 1658697135
	)
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int az_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lem;"
	)
	em av_fld;
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bo_fld;
	@ObfuscatedGetter(
		intValue = -819998019
	)
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ak_fld;
	@ObfuscatedName("mb")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int mb_fld;
	@ObfuscatedGetter(
		intValue = -65086195
	)
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ag_fld;
	@ObfuscatedGetter(
		intValue = -738574689
	)
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ay_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lem;"
	)
	em ah_fld;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int af_fld;
	@ObfuscatedName("gs")
	@ObfuscatedSignature(
		descriptor = "Ljq;"
	)
	static jq gs_fld;

	@ObfuscatedName("getClickbox")
	@ObfuscatedSignature(
		descriptor = "()Ljava/awt/Shape;"
	)
	@Override
	public Shape getClickbox() {
		try {
			Area var1 = new Area();
			dx var2 = this.getWorldView();

			for (em var6 : new em[]{this.getTop(), this.getMiddle(), this.getBottom()}) {
				if (var6 != null) {
					fn var7 = var6.getModel();
					if (var7 != null) {
						Shape var8 = Perspective.getClickbox(og.ci_fld, var2, var7, 0, this.ag_fld, this.az_fld, this.ak_fld - this.ay_fld);
						if (var8 != null) {
							var1.add(new Area(var8));
						}
					}
				}
			}

			return var1;
		} catch (Throwable var10) {
			throw new RuntimeException(var10);
		}
	}

	@ObfuscatedName("getLocalLocation")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/coords/LocalPoint;"
	)
	@Override
	public LocalPoint getLocalLocation() {
		return new LocalPoint(this.getX(), this.getY(), this.gh());
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

	@ObfuscatedName("kk")
	@ObfuscatedSignature(
		descriptor = "(Ltf;Ljava/awt/event/FocusEvent;)V"
	)
	public static void kk(tf var0, FocusEvent var1) {
		if (var0 == null) {
			var0.getClass();
		}

		tf.rl_fld = false;
	}

	@ObfuscatedName("getCanvasLocation")
	@ObfuscatedSignature(
		descriptor = "(I)Lnet/runelite/api/Point;"
	)
	@Override
	public Point getCanvasLocation(int var1) {
		return Perspective.localToCanvas(og.ci_fld, this.getLocalLocation(), this.getPlane(), var1);
	}

	en() {
	}

	@ObfuscatedName("gn")
	@ObfuscatedSignature(
		descriptor = "()Lem;"
	)
	public em getMiddle() {
		return this.ah_fld;
	}

	@ObfuscatedName("getMinimapLocation")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/Point;"
	)
	@Override
	public Point getMinimapLocation() {
		return Perspective.localToMinimap(og.ci_fld, this.getLocalLocation());
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V"
	)
	static final void bx(String var0, byte var1) throws FileNotFoundException, EOFException, UnsupportedEncodingException {
		try {
			if (var0.equalsIgnoreCase("toggleroof")) {
				if (var1 <= 8) {
					return;
				}

				cn var10000 = cx.kq_fld;
				boolean var10001;
				if (!cx.kq_fld.ae((byte)96)) {
					if (var1 <= 8) {
						return;
					}

					var10001 = true;
				} else {
					var10001 = false;
				}

				var10000.ah(var10001, (byte)82);
				if (cx.kq_fld.ae((byte)-85)) {
					if (var1 <= 8) {
						return;
					}

					io.ag(99, "", "Roofs are now all hidden");
				} else {
					io.ag(99, "", "Roofs will only be removed selectively");
				}
			}

			if (var0.startsWith("zbuf")) {
				boolean var2 = tf.av(var0.substring(5).trim()) == 1;
				og.ci_fld.ags(var2, -2114388439);
				fc.ak(var2);
			}

			if (var0.equalsIgnoreCase("z")) {
				if (var1 <= 8) {
					return;
				}

				client.he_fld = !client.he_fld;
			}

			if (var0.equalsIgnoreCase("displayfps")) {
				cn.of(cx.kq_fld, 239763703);
			}

			if (var0.equalsIgnoreCase("renderself")) {
				client.ec_fld = !client.ec_fld;
			}

			if (var0.equalsIgnoreCase("mouseovertext")) {
				client.ei_fld = !client.ei_fld;
			}

			if (var0.startsWith("setdrawdistance")) {
				String[] var8 = var0.split(" ");

				try {
					int var3 = Integer.parseInt(var8[1]);
					cn.tu(cx.kq_fld, var3);
				} catch (NumberFormatException var6) {
					io.ag(
						99,
						"",
						String.format(
							"Error setting draw distance. setdrawdistance should be in the format \"::setdrawdistance X\" where X is a valid number. Value provided: %s",
							(Object[])(new Object[]{var8[1]})
						)
					);
				}
			}

			if (var0.startsWith("settilerendermode")) {
				String[] var9 = var0.split(" ");

				try {
					int var13 = Integer.parseInt(var9[1]);
					bw.dk_fld.az_fld.cw(er.ak()[var13]);
				} catch (NumberFormatException var5) {
					io.ag(
						99,
						"",
						String.format(
							"Error setting tile render mode. settilerendermode should be in the format \"::settilerendermode X\" where X is a valid number from 0-1. 0=camera 1=target Value provided: %s",
							(Object[])(new Object[]{var9[1]})
						)
					);
				}
			}

			if (var0.equalsIgnoreCase("getdrawdistance")) {
				if (var1 <= 8) {
					return;
				}

				io.ag(99, "", String.format("%d", (Object[])(new Object[]{cn.ka(cx.kq_fld, (byte)1)})));
			}

			if (client.jl_fld >= 2) {
				if (var0.equalsIgnoreCase("errortest")) {
					throw new RuntimeException();
				}

				if (var0.equalsIgnoreCase("showcoord")) {
					boolean var14;
					if (!ca.px_fld.an_fld) {
						if (var1 <= 8) {
							return;
						}

						var14 = true;
					} else {
						var14 = false;
					}

					ca.px_fld.an_fld = var14;
				}

				if (var0.equalsIgnoreCase("fpson")) {
					if (var1 <= 8) {
						return;
					}

					cn.ij(cx.kq_fld, true, 1346630224);
				}

				if (var0.equalsIgnoreCase("fpsoff")) {
					cn.ij(cx.kq_fld, false, 1039805218);
				}

				if (var0.equalsIgnoreCase("gc")) {
					System.gc();
				}

				if (var0.equalsIgnoreCase("clientdrop")) {
					ay.bd();
				}

				if (var0.equalsIgnoreCase("clientreload")) {
					cb.as((byte)-87);
				} else if (var0.equalsIgnoreCase("sfx8bit")) {
					cx.kq_fld.bx(true, (byte)15);
				} else if (var0.equalsIgnoreCase("sfx16bit")) {
					cx.kq_fld.bx(false, (byte)15);
				} else if (var0.startsWith("playsong ")) {
					String var10 = var0.substring("playsong ".length());

					try {
						if (cj.gu() == 0) {
							if (var1 <= 8) {
								return;
							}

							sx.av(0, 0);
						} else {
							cp.bh(var10, cj.gu());
						}
					} catch (Exception var4) {
						io.ag(99, "", "Can't play the midi named " + var10);
					}
				} else if (var0.equalsIgnoreCase("stopsong")) {
					sx.av(0, 0);
				}

				if (var0.equalsIgnoreCase("freecam")) {
					ag.hd(1);
				}

				if (var0.startsWith("unlockcam")) {
					String[] var11 = var0.split(" ");
					client.dw_fld = Boolean.parseBoolean(var11[1]);
				}

				if (var0.equalsIgnoreCase("show_test_ops")) {
					client.cp_fld = true;
				}

				if (var0.equalsIgnoreCase("hide_test_ops")) {
					if (var1 <= 8) {
						return;
					}

					client.cp_fld = false;
				}
			}

			jm var12 = gi.ak(jb.cx_fld, client.aq_fld.av_fld);
			var12.ay_fld.bc(var0.length() + 1);
			var12.ay_fld.cc(var0, -684168449);
			client.aq_fld.az(var12);
		} catch (Throwable var7) {
			throw new RuntimeException(var7);
		}
	}

	@ObfuscatedName("getHeight")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getHeight() {
		return this.ay_fld;
	}

	@ObfuscatedName("fe")
	@ObfuscatedSignature(
		descriptor = "()Ldx;"
	)
	public dx getWorldView() {
		return dx.ws(this.gh());
	}

	@ObfuscatedName("getPlane")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getPlane() {
		return this.mb_fld;
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

	@ObfuscatedName("isOpShown")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	@Override
	public boolean isOpShown(int var1) {
		cs var2 = this.getWorldView().dg(this.getHash());
		return var2 == null ? true : var2.ap(var1);
	}

	@ObfuscatedName("getCanvasTextLocation")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Graphics2D;Ljava/lang/String;I)Lnet/runelite/api/Point;"
	)
	@Override
	public Point getCanvasTextLocation(Graphics2D var1, String var2, int var3) {
		return Perspective.getCanvasTextLocation(og.ci_fld, var1, this.getLocalLocation(), var2, var3);
	}

	@ObfuscatedName("gv")
	@ObfuscatedSignature(
		descriptor = "()Lem;"
	)
	public em getBottom() {
		return this.ae_fld;
	}

	@ObfuscatedName("getCanvasLocation")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/Point;"
	)
	@Override
	public Point getCanvasLocation() {
		return this.getCanvasLocation(0);
	}

	@ObfuscatedName("gh")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int gh() {
		long var1 = this.getHash();
		int var3 = (int)(var1 >> 52 & 4095L);
		if (var3 == 4095L) {
			var3 = -1;
		}

		return var3;
	}

	@ObfuscatedName("getZ")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getZ() {
		return this.ak_fld;
	}

	@ObfuscatedName("getY")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getY() {
		return this.az_fld;
	}

	@ObfuscatedName("getX")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getX() {
		return this.ag_fld;
	}

	@ObfuscatedName("qy")
	@ObfuscatedSignature(
		descriptor = "(Lnj;)Lvc;"
	)
	public static vc qy(nj var0) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.ah(null);
	}

	@ObfuscatedName("getWorldLocation")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/coords/WorldPoint;"
	)
	@Override
	public WorldPoint getWorldLocation() {
		dx var1 = dx.ws(this.gh());
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

	@ObfuscatedName("oq")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void oq(int var1) {
		this.mb_fld = var1;
	}

	@ObfuscatedName("getHash")
	@ObfuscatedSignature(
		descriptor = "()J"
	)
	@Override
	public long getHash() {
		return this.aw_fld;
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

	@ObfuscatedName("ma")
	@ObfuscatedSignature(
		descriptor = "()Lem;"
	)
	public em getTop() {
		return this.av_fld;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(FFFFIII)V"
	)
	public static final void ax(float var0, float var1, float var2, float var3, int var4, int var5, int var6) {
		if (!ej.bk_fld) {
			float var12 = 50.0F;
			float var13 = fh.az();
			float var14 = (ej.bs_fld - var4) * var12 / var6;
			float var15 = var12 * (ej.bh_fld - var5) / var6;
			float var16 = var13 * (ej.bs_fld - var4) / var6;
			float var17 = var13 * (ej.bh_fld - var5) / var6;
			float var19 = var12 * var0 + var15 * var1;
			float var20 = var1 * var12 - var15 * var0;
			float var21 = var17 * var1 + var13 * var0;
			float var22 = var13 * var1 - var0 * var17;
			float var18 = bh.az(var14, var20, var3, var2);
			float var23 = var2 * var14 + var20 * var3;
			float var26 = bh.az(var16, var22, var3, var2);
			float var24 = var22 * var3 + var16 * var2;
			lp.aa((int)var18, (int)var19, (int)var23, (int)var26, (int)var21, (int)var24);
		}
	}
}
