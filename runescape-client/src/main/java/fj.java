import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Shape;
import java.io.EOFException;
import javax.annotation.Nullable;
import net.runelite.api.GameObject;
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

@ObfuscatedName("fj")
@Implements({"GameObject", "TileObject"})
public class fj implements GameObject, TileObject {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 996418047
	)
	int af_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -502866077
	)
	int aw_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	@ObfuscatedGetter(
		longValue = 2121558925630479837L
	)
	public long az_fld = 0L;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 888822967
	)
	int av_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1163057641
	)
	int ae_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -564370133
	)
	int ah_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1511530387
	)
	int ay_fld;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1952704125
	)
	int au_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -130507625
	)
	int as_fld;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -462437065
	)
	int ar_fld;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1613956585
	)
	int ax_fld = 0;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1534155055
	)
	int al_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lem;"
	)
	public em ak_fld;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int am_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1387508507
	)
	int ag_fld;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ap_fld;

	@ObfuscatedName("getCanvasTilePoly")
	@ObfuscatedSignature(
		descriptor = "()Ljava/awt/Polygon;"
	)
	@Export("getCanvasTilePoly")
	@Override
	public Polygon getCanvasTilePoly() {
		int var1 = 1;
		int var2 = 1;
		if (this instanceof fj) {
			fj var3 = this;
			var1 = var3.as_fld - var3.ay_fld + 1;
			var2 = var3.af_fld - var3.ar_fld + 1;
		}

		return Perspective.getCanvasTileAreaPoly(og.ci_fld, this.getLocalLocation(), var1, var2, this.getPlane(), 0);
	}

	@ObfuscatedName("wv")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void wv(int var1) {
		this.ag_fld = var1;
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

	@ObfuscatedName("en")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void en(int var1) {
		this.ax_fld = var1;
	}

	@ObfuscatedName("lx")
	@ObfuscatedSignature(
		descriptor = "()Lem;"
	)
	public em getRenderable() {
		return this.ak_fld;
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

	@ObfuscatedName("getPlane")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getPlane")
	@Override
	public int getPlane() {
		return this.av_fld;
	}

	@ObfuscatedName("getWorldLocation")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/coords/WorldPoint;"
	)
	@Export("getWorldLocation")
	@Override
	public WorldPoint getWorldLocation() {
		dx var1 = dx.bu(this.wa());
		if (var1 == null) {
			var1 = bw.dk_fld;
		}

		if (this instanceof fj) {
			fj var2 = this;
			int var3 = var2.ay_fld;
			int var4 = var2.ar_fld;
			int var5 = var2.as_fld - var3;
			int var6 = var2.af_fld - var4;
			return WorldPoint.fromScene(var1, var3 + var5 / 2, var4 + var6 / 2, this.getPlane());
		} else {
			return WorldPoint.fromLocal(var1, this.getX(), this.getY(), this.getPlane());
		}
	}

	@ObfuscatedName("pc")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void pc(int var1) {
		this.av_fld = var1;
	}

	@ObfuscatedName("getConfig")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getConfig")
	@Override
	public int getConfig() {
		return this.ax_fld;
	}

	@ObfuscatedName("getConvexHull")
	@ObfuscatedSignature(
		descriptor = "()Ljava/awt/Shape;"
	)
	@Export("getConvexHull")
	@Override
	public Shape getConvexHull() {
		try {
			fn var1 = this.ai();
			return var1 == null ? null : var1.kw(this.getWorldView(), this.getX(), this.getY(), this.getModelOrientation(), this.getZ());
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("getZ")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getZ")
	@Override
	public int getZ() {
		return this.ae_fld;
	}

	@ObfuscatedName("tf")
	@ObfuscatedSignature(
		descriptor = "(J)V"
	)
	public void tf(long var1) {
		this.az_fld = var1;
	}

	@ObfuscatedName("sy")
	@ObfuscatedSignature(
		descriptor = "(Lem;)V"
	)
	public void sy(em var1) {
		this.ak_fld = var1;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "()Lfn;"
	)
	public fn ai() {
		try {
			if (this.ak_fld == null) {
				return null;
			} else {
				return this.ak_fld instanceof fn ? (fn)this.ak_fld : this.ak_fld.getModel();
			}
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("getX")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getX")
	@Override
	public int getX() {
		return this.ah_fld;
	}

	@ObfuscatedName("getOrientation")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getOrientation")
	@Override
	public int getOrientation() {
		int var1 = this.getModelOrientation();
		int var2 = this.getConfig() >> 6 & 3;
		return var2 * 512 + var1;
	}

	@ObfuscatedName("getSceneMaxLocation")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/Point;"
	)
	@Export("getSceneMaxLocation")
	@Override
	public Point getSceneMaxLocation() {
		return new Point(this.as_fld, this.af_fld);
	}

	@ObfuscatedName("eq")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void eq(int var1) {
		this.ah_fld = var1;
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

	@ObfuscatedName("sizeX")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("sizeX")
	@Override
	public int sizeX() {
		return this.as_fld - this.ay_fld + 1;
	}

	@ObfuscatedName("wa")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int wa() {
		long var1 = this.getHash();
		int var3 = (int)(var1 >> 52 & 4095L);
		if (var3 == 4095L) {
			var3 = -1;
		}

		return var3;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ldx;IIIIII)V"
	)
	static void av(dx var0, int var1, int var2, int var3, int var4, int var5, int var6) throws EOFException {
		try {
			ch.af_fld = 0;
			aq.ae(var0, var1, var2, var3, var4, var5, 1533980679);

			for (int var7 = 0; var7 < var0.ad_fld.az(); var7++) {
				rg var8 = (rg)var0.an_fld.ak(yw.wk(var0.ad_fld, var7, (byte)113));
				if (null != var8) {
					if (var6 != 1982321925) {
						return;
					}

					aq.ae(var8.ah_fld, var1, var2, var3, var4, var5, 1139349085);
				}
			}

			boolean var23 = client.ec_fld;
			if (var23) {
				if (var6 != 1982321925) {
					return;
				}

				ea.ah(client.dj_fld, var1, var2, var3, var4, var5);
			}

			ea.ah(client.nq_fld, var1, var2, var3, var4, var5);
			int var24 = client.ox_fld;
			zf var9 = cu.dl_fld;

			for (int var10 = 0; var10 < ch.af_fld; var10++) {
				if (var6 != 1982321925) {
					return;
				}

				int var11 = ch.au_fld[var10];
				int var12 = ch.ax_fld[var10];
				int var13 = ch.aa_fld[var10];
				int var14 = ch.an_fld[var10];
				boolean var15 = true;

				while (var15) {
					var15 = false;

					for (int var16 = 0; var16 < var10; var16++) {
						if (2 + var12 > ch.ax_fld[var16] - ch.an_fld[var16]
							&& var12 - var14 < ch.ax_fld[var16] + 2
							&& var11 - var13 < ch.au_fld[var16] + ch.aa_fld[var16]
							&& var11 + var13 > ch.au_fld[var16] - ch.aa_fld[var16]
							&& ch.ax_fld[var16] - ch.an_fld[var16] < var12) {
							var12 = ch.ax_fld[var16] - ch.an_fld[var16];
							var15 = true;
						}
					}
				}

				ch.at_fld = 143277501 * ch.au_fld[var10];
				ch.ac_fld = ch.ax_fld[var10] = var12;
				String var25 = ch.ao_fld[var10];
				if (var24 == 0) {
					int var17 = 16776960;
					if (ch.ai_fld[var10] < 6) {
						var17 = ch.ab_fld[ch.ai_fld[var10]];
					}

					if (6 == ch.ai_fld[var10]) {
						var17 = var5 % 20 < 10 ? 16711680 : 16776960;
					}

					if (7 == ch.ai_fld[var10]) {
						if (var6 != 1982321925) {
							return;
						}

						var17 = var5 % 20 < 10 ? 255 : '\uffff';
					}

					if (8 == ch.ai_fld[var10]) {
						int var10000;
						if (var5 % 20 < 10) {
							if (var6 != 1982321925) {
								return;
							}

							var10000 = 45056;
						} else {
							var10000 = 8454016;
						}

						var17 = var10000;
					}

					if (9 == ch.ai_fld[var10]) {
						int var18 = 150 - ch.ad_fld[var10];
						if (var18 < 50) {
							if (var6 != 1982321925) {
								return;
							}

							var17 = 16711680 + var18 * 1280;
						} else if (var18 < 100) {
							var17 = 16776960 - (var18 - 50) * 327680;
						} else if (var18 < 150) {
							if (var6 != 1982321925) {
								return;
							}

							var17 = 65280 + (var18 - 100) * 5;
						}
					}

					if (ch.ai_fld[var10] == 10) {
						int var26 = 150 - ch.ad_fld[var10];
						if (var26 < 50) {
							var17 = 16711680 + 5 * var26;
						} else if (var26 < 100) {
							var17 = 16711935 - (var26 - 50) * 327680;
						} else if (var26 < 150) {
							var17 = 255 + 327680 * (var26 - 100) - 5 * (var26 - 100);
						}
					}

					if (ch.ai_fld[var10] == 11) {
						int var27 = 150 - ch.ad_fld[var10];
						if (var27 < 50) {
							var17 = 16777215 - 327685 * var27;
						} else if (var27 < 100) {
							var17 = 65280 + 327685 * (var27 - 50);
						} else if (var27 < 150) {
							if (var6 != 1982321925) {
								return;
							}

							var17 = 16777215 - 327680 * (var27 - 100);
						}
					}

					if (ch.ai_fld[var10] == 12) {
						if (var6 != 1982321925) {
							return;
						}

						if (ch.am_fld[var10] == null) {
							int var28 = var25.length();
							ch.am_fld[var10] = new int[var28];

							for (int var19 = 0; var19 < var28; var19++) {
								if (var6 != 1982321925) {
									return;
								}

								int var20 = (int)(64.0F * ((float)var19 / var28));
								int var21 = var20 << 10 | 896 | 64;
								ch.am_fld[var10][var19] = ue.as_fld[var21];
							}
						}
					}

					if (0 == ch.aq_fld[var10]) {
						var9.ht(var25, ch.at_fld + var1, var2 + ch.ac_fld, var17, 0, ch.am_fld[var10]);
					}

					if (ch.aq_fld[var10] == 1) {
						zv.tk(var9, var25, var1 + ch.at_fld, var2 + ch.ac_fld, var17, 0, var5, ch.am_fld[var10]);
					}

					if (2 == ch.aq_fld[var10]) {
						var9.bd(var25, var1 + ch.at_fld, var2 + ch.ac_fld, var17, 0, var5, ch.am_fld[var10]);
					}

					if (ch.aq_fld[var10] == 3) {
						var9.bz(var25, var1 + ch.at_fld, ch.ac_fld + var2, var17, 0, var5, 150 - ch.ad_fld[var10], ch.am_fld[var10]);
					}

					if (ch.aq_fld[var10] == 4) {
						int var29 = (150 - ch.ad_fld[var10]) * (var9.an(var25) + 100) / 150;
						yu.dw(ch.at_fld + var1 - 50, var2, ch.at_fld + var1 + 50, var4 + var2);
						dz.zq(var9, var25, 50 + ch.at_fld + var1 - var29, ch.ac_fld + var2, var17, 0, ch.am_fld[var10]);
						yu.dg(var1, var2, var1 + var3, var2 + var4);
					}

					if (5 == ch.aq_fld[var10]) {
						if (var6 != 1982321925) {
							return;
						}

						int var30 = 150 - ch.ad_fld[var10];
						int var31 = 0;
						if (var30 < 25) {
							if (var6 != 1982321925) {
								return;
							}

							var31 = var30 - 25;
						} else if (var30 > 125) {
							var31 = var30 - 125;
						}

						yu.dw(var1, ch.ac_fld + var2 - var9.ap_fld - 1, var3 + var1, ch.ac_fld + var2 + 5);
						var9.ht(var25, ch.at_fld + var1, ch.ac_fld + var2 + var31, var17, 0, ch.am_fld[var10]);
						yu.dg(var1, var2, var3 + var1, var2 + var4);
					}
				} else {
					var9.ap(var25, var1 + ch.at_fld, var2 + ch.ac_fld, 16776960, 0);
				}
			}
		} catch (Throwable var22) {
			throw new RuntimeException(var22);
		}
	}

	@ObfuscatedName("pb")
	@ObfuscatedSignature(
		descriptor = "(Luk;)I"
	)
	public static int pb(uk var0) {
		return var0.au_fld;
	}

	@ObfuscatedName("nz")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void nz(int var1) {
		this.aw_fld = var1;
	}

	@ObfuscatedName("getSceneMinLocation")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/Point;"
	)
	@Export("getSceneMinLocation")
	@Override
	public Point getSceneMinLocation() {
		return new Point(this.ay_fld, this.ar_fld);
	}

	@ObfuscatedName("mk")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void mk(int var1) {
		this.ae_fld = var1;
	}

	@ObfuscatedName("getY")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getY")
	@Override
	public int getY() {
		return this.aw_fld;
	}

	@ObfuscatedName("gm")
	@ObfuscatedSignature(
		descriptor = "()Ldx;"
	)
	public dx getWorldView() {
		return dx.bu(this.wa());
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

	@ObfuscatedName("getClickbox")
	@ObfuscatedSignature(
		descriptor = "()Ljava/awt/Shape;"
	)
	@Export("getClickbox")
	@Override
	public Shape getClickbox() {
		try {
			return Perspective.getClickbox(og.ci_fld, this.getWorldView(), this.ai(), this.getModelOrientation(), this.getX(), this.getY(), this.getZ());
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
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

	@ObfuscatedName("getCanvasTextLocation")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Graphics2D;Ljava/lang/String;I)Lnet/runelite/api/Point;"
	)
	@Export("getCanvasTextLocation")
	@Override
	public Point getCanvasTextLocation(Graphics2D var1, String var2, int var3) {
		return Perspective.getCanvasTextLocation(og.ci_fld, var1, this.getLocalLocation(), var2, var3);
	}

	@ObfuscatedName("wb")
	@ObfuscatedSignature(
		descriptor = "(Lyw;)I"
	)
	public static int wb(yw var0) {
		return var0.ag_fld;
	}

	@ObfuscatedName("sizeY")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("sizeY")
	@Override
	public int sizeY() {
		return this.af_fld - this.ar_fld + 1;
	}

	@ObfuscatedName("ih")
	@ObfuscatedSignature(
		descriptor = "(Lku;)V"
	)
	public static void ih(ku var0) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ax_fld = 0;
	}

	@ObfuscatedName("getModelOrientation")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getModelOrientation")
	@Override
	public int getModelOrientation() {
		return this.ag_fld;
	}

	@ObfuscatedName("getLocalLocation")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/coords/LocalPoint;"
	)
	@Export("getLocalLocation")
	@Override
	public LocalPoint getLocalLocation() {
		return new LocalPoint(this.getX(), this.getY(), this.wa());
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

	fj() {
	}
}
