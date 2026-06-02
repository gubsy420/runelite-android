import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Shape;
import java.io.EOFException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.Nullable;
import net.runelite.api.Perspective;
import net.runelite.api.Point;
import net.runelite.api.TileObject;
import net.runelite.api.WallObject;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.geometry.Shapes;

@ObfuscatedName("fs")
@Implements({"WallObject", "TileObject"})
public class fs implements WallObject, TileObject {
	@ObfuscatedGetter(
		longValue = -4472860599998239529L
	)
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	public long az_fld = 0L;
	@ObfuscatedGetter(
		intValue = 57097171
	)
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int as_fld = 0;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lem;"
	)
	public em ag_fld;
	@ObfuscatedName("nc")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int nc_fld;
	@ObfuscatedGetter(
		intValue = 379685481
	)
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int av_fld;
	@ObfuscatedGetter(
		intValue = -1965833039
	)
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ae_fld;
	@ObfuscatedGetter(
		intValue = -881187479
	)
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ah_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lem;"
	)
	public em ak_fld;
	@ObfuscatedGetter(
		intValue = -429143679
	)
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ay_fld;
	@ObfuscatedGetter(
		intValue = -83721701
	)
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int aw_fld;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ar_fld;
	@ObfuscatedName("gh")
	@ObfuscatedSignature(
		descriptor = "Lzt;"
	)
	public static zt gh_fld;

	@ObfuscatedName("fw")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void fw(int var1) {
		this.av_fld = var1;
	}

	@ObfuscatedName("getOrientationA")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getOrientationA() {
		return this.aw_fld;
	}

	@ObfuscatedName("tb")
	@ObfuscatedSignature(
		descriptor = "()Lfn;"
	)
	public fn tb() {
		try {
			em var1 = this.getRenderable1();
			if (var1 == null) {
				return null;
			} else {
				return var1 instanceof fn ? (fn)var1 : var1.getModel();
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "()Lem;"
	)
	public em getRenderable1() {
		return this.ak_fld;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int ak(int var0) {
		return var0 >> 24 & 3;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	static boolean ak(int var0, int var1) {
		return 4 != var0 || var1 < 8;
	}

	@ObfuscatedName("getPlane")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getPlane() {
		return this.nc_fld;
	}

	@ObfuscatedName("kb")
	@ObfuscatedSignature(
		descriptor = "(J)V"
	)
	public void kb(long var1) {
		this.az_fld = var1;
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "()Lfn;"
	)
	public fn ch() {
		try {
			em var1 = this.getRenderable2();
			if (var1 == null) {
				return null;
			} else {
				return var1 instanceof fn ? (fn)var1 : var1.getModel();
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("fk")
	@ObfuscatedSignature(
		descriptor = "(Lem;)V"
	)
	public void fk(em var1) {
		this.ak_fld = var1;
	}

	@ObfuscatedName("getHash")
	@ObfuscatedSignature(
		descriptor = "()J"
	)
	@Override
	public long getHash() {
		return this.az_fld;
	}

	@ObfuscatedName("getClickbox")
	@ObfuscatedSignature(
		descriptor = "()Ljava/awt/Shape;"
	)
	@Override
	public Shape getClickbox() {
		try {
			dx var1 = this.getWorldView();
			Shape var2 = Perspective.getClickbox(og.ci_fld, var1, this.tb(), 0, this.ae_fld, this.ah_fld, this.av_fld);
			Shape var3 = Perspective.getClickbox(og.ci_fld, var1, this.ch(), 0, this.ae_fld, this.ah_fld, this.av_fld);
			if (var2 != null && var3 != null) {
				return new Shapes<>(var2, var3);
			} else {
				return var2 != null ? var2 : var3;
			}
		} catch (Throwable var5) {
			throw new RuntimeException(var5);
		}
	}

	@ObfuscatedName("getLocalLocation")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/coords/LocalPoint;"
	)
	@Override
	public LocalPoint getLocalLocation() {
		return new LocalPoint(this.getX(), this.getY(), this.kw());
	}

	@ObfuscatedName("getCanvasLocation")
	@ObfuscatedSignature(
		descriptor = "(I)Lnet/runelite/api/Point;"
	)
	@Override
	public Point getCanvasLocation(int var1) {
		return Perspective.localToCanvas(og.ci_fld, this.getLocalLocation(), this.getPlane(), var1);
	}

	@ObfuscatedName("getConvexHull2")
	@ObfuscatedSignature(
		descriptor = "()Ljava/awt/Shape;"
	)
	@Override
	public Shape getConvexHull2() {
		try {
			fn var1 = this.ch();
			if (var1 == null) {
				return null;
			} else {
				int var2 = Perspective.getTileHeight(og.ci_fld, this.getLocalLocation(), this.getPlane());
				return var1.bz(this.getWorldView(), this.ae_fld, this.ah_fld, 0, var2);
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("uz")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void uz(int var1) {
		this.as_fld = var1;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void av(int var1) {
		this.ay_fld = var1;
	}

	@ObfuscatedName("kw")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int kw() {
		long var1 = this.getHash();
		int var3 = (int)(var1 >> 52 & 4095L);
		if (var3 == 4095L) {
			var3 = -1;
		}

		return var3;
	}

	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		descriptor = "()Lem;"
	)
	public em getRenderable2() {
		return this.ag_fld;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public static boolean as() {
		boolean var1 = false;
		boolean var2 = false;
		if (!mb.as_fld.isEmpty()) {
			ws var3 = (ws)(ws)mb.as_fld.get(0);
			if (null == var3) {
				mb.as_fld.remove(0);
			} else if (var3.ak((short)19307)) {
				if (var3.ay()) {
					System.out.println("Error in midimanager.service: " + var3.ar());
					var1 = true;
				} else {
					if (var3.af() != null) {
						mb.as_fld.add(1, var3.af());
					}

					var2 = var3.as();
				}

				mb.as_fld.remove(0);
			} else {
				var2 = var3.as();
			}
		}

		if (var1) {
			mb.as_fld.clear();
			Iterator var5 = mb.av_fld.iterator();

			while (var5.hasNext()) {
				me var4 = (me)(me)var5.next();
				if (var4 != null) {
					var4.af_fld.au();
					var4.af_fld.ar();
					var4.af_fld.ak(0);
					var4.af_fld.aw_fld = 0;
					je.ag(var4.ag_fld, var4.az_fld);
				}
			}

			mb.av_fld.clear();
		}

		return var2;
	}

	@ObfuscatedName("getConvexHull")
	@ObfuscatedSignature(
		descriptor = "()Ljava/awt/Shape;"
	)
	@Override
	public Shape getConvexHull() {
		try {
			fn var1 = this.tb();
			if (var1 == null) {
				return null;
			} else {
				int var2 = Perspective.getTileHeight(og.ci_fld, this.getLocalLocation(), this.getPlane());
				return var1.bz(this.getWorldView(), this.ae_fld, this.ah_fld, 0, var2);
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
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

	@ObfuscatedName("getId")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getId() {
		long var1 = this.getHash();
		return (int)(var1 >>> 20 & 4294967295L);
	}

	@ObfuscatedName("getZ")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getZ() {
		return this.av_fld;
	}

	@ObfuscatedName("getCanvasTextLocation")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Graphics2D;Ljava/lang/String;I)Lnet/runelite/api/Point;"
	)
	@Override
	public Point getCanvasTextLocation(Graphics2D var1, String var2, int var3) {
		return Perspective.getCanvasTextLocation(og.ci_fld, var1, this.getLocalLocation(), var2, var3);
	}

	@ObfuscatedName("ge")
	@ObfuscatedSignature(
		descriptor = "()Ldx;"
	)
	public dx getWorldView() {
		return dx.ws(this.kw());
	}

	@ObfuscatedName("getMinimapLocation")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/Point;"
	)
	@Override
	public Point getMinimapLocation() {
		return Perspective.localToMinimap(og.ci_fld, this.getLocalLocation());
	}

	@ObfuscatedName("vg")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void vg(int var1) {
		this.ae_fld = var1;
	}

	@ObfuscatedName("zn")
	@ObfuscatedSignature(
		descriptor = "(Lem;)V"
	)
	public void zn(em var1) {
		this.ag_fld = var1;
	}

	@ObfuscatedName("getY")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getY() {
		return this.ah_fld;
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

	@ObfuscatedName("isOpShown")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	@Override
	public boolean isOpShown(int var1) {
		cs var2 = this.getWorldView().dg(this.getHash());
		return var2 == null ? true : var2.ap(var1);
	}

	@ObfuscatedName("getOrientationB")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getOrientationB() {
		return this.ay_fld;
	}

	@ObfuscatedName("eq")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void eq(int var1) {
		this.aw_fld = var1;
	}

	@ObfuscatedName("getX")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getX() {
		return this.ae_fld;
	}

	@ObfuscatedName("na")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void na(int var1) {
		this.ah_fld = var1;
	}

	@ObfuscatedName("getWorldLocation")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/coords/WorldPoint;"
	)
	@Override
	public WorldPoint getWorldLocation() {
		dx var1 = dx.ws(this.kw());
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

	@ObfuscatedName("getCanvasLocation")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/Point;"
	)
	@Override
	public Point getCanvasLocation() {
		return this.getCanvasLocation(0);
	}

	@ObfuscatedName("getConfig")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getConfig() {
		return this.as_fld;
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(ILba;Z)I"
	)
	static int cx(int var0, ba var1, boolean var2) throws EOFException {
		try {
			if (var0 == 7500) {
				int var26 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				Object var32 = he.cg(var26);
				int var36 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				yo var39 = bu.hv(var36);
				if (null == var39) {
					throw new RuntimeException();
				} else {
					int var42 = og.az(var36);
					bq.fz_fld = var39.az(var32, var42);
					if (bq.fz_fld != null) {
						client.gg_fld = mk.ak(var36);
						gq.ff_fld = bq.fz_fld.iterator();
						if (var0 == 7500) {
							bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = bq.fz_fld.size();
						}
					} else {
						client.gg_fld = 1162640019;
						gq.ff_fld = null;
						if (7500 == var0) {
							bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
						}
					}

					return 1;
				}
			} else if (7501 == var0) {
				if (null != gq.ff_fld && gq.ff_fld.hasNext()) {
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = (Integer)gq.ff_fld.next();
				} else {
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -1;
				}

				return 1;
			} else if (var0 == 7502) {
				gz.ax_fld -= 3;
				int var25 = bp.au_fld[gz.ax_fld];
				int var31 = bp.au_fld[gz.ax_fld + 1];
				int var35 = bp.au_fld[gz.ax_fld + 2];
				int var38 = mk.ak(var31);
				int var41 = my.ag(var31);
				int var44 = og.az(var31);
				yg var45 = ct.ag(var38);
				int[] var46 = var45.az_fld[var41];
				int var47 = 0;
				int var13 = var46.length;
				if (var25 == -1) {
					for (int var48 = var47; var48 < var13; var48++) {
						yq var49 = eu.ag(var46[var48], -2064497045);
						if (yq.az_fld == var49) {
							bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
						} else if (var49 == yq.ag_fld) {
							bp.an_fld[(db.aa_fld += 432101741) * 867932261 - 1] = -1L;
						} else {
							bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = me.ak(var46[var48]);
						}
					}

					return 1;
				} else {
					yl var14 = ot.ak(var25);
					if (var44 >= 0) {
						if (var44 >= var13) {
							throw new RuntimeException("Tuple index out-of-bounds. Requested: " + var44 + ", Max: " + var13);
						}

						var47 = var44;
						var13 = 1 + var44;
					}

					Object[] var15 = (Object[])var14.az(var41, (byte)-11);
					if (var15 == null && var45.av_fld != null) {
						var15 = (Object[])var45.av_fld[var41];
					}

					if (null == var15) {
						for (int var50 = var47; var50 < var13; var50++) {
							int var51 = var46[var50];
							yq var52 = eu.ag(var51, -1872527528);
							if (yq.az_fld == var52) {
								bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
							} else {
								bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = me.ak(var51);
							}
						}

						return 1;
					} else {
						int var16 = var15.length / var46.length;
						if (var35 >= 0 && var35 < var16) {
							for (int var17 = var47; var17 < var13; var17++) {
								int var18 = var46.length * var35 + var17;
								yq var19 = eu.ag(var46[var17], -1995445811);
								if (yq.az_fld == var19) {
									bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var15[var18];
								} else {
									bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = (Integer)var15[var18];
								}
							}

							return 1;
						} else {
							throw new RuntimeException();
						}
					}
				}
			} else if (7503 == var0) {
				gz.ax_fld -= 2;
				int var24 = bp.au_fld[gz.ax_fld];
				int var30 = bp.au_fld[gz.ax_fld + 1];
				int var34 = 0;
				int var37 = mk.ak(var30);
				int var40 = my.ag(var30);
				yl var43 = ot.ak(var24);
				yg var10 = ct.ag(var37);
				int[] var11 = var10.az_fld[var40];
				Object[] var12 = (Object[])var43.az(var40, (byte)33);
				if (null == var12 && var10.av_fld != null) {
					var12 = (Object[])var10.av_fld[var40];
				}

				if (var12 != null) {
					var34 = var12.length / var11.length;
				}

				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var34;
				return 1;
			} else if (var0 == 7504) {
				gz.ax_fld--;
				int var23 = bp.au_fld[gz.ax_fld];
				yo var29 = me.ha(var23);
				if (null == var29) {
					throw new RuntimeException();
				} else {
					bq.fz_fld = var29.az(0, 0);
					int var33 = 0;
					if (null != bq.fz_fld) {
						client.gg_fld = var23;
						gq.ff_fld = bq.fz_fld.iterator();
						var33 = bq.fz_fld.size();
					}

					if (var0 == 7504) {
						bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var33;
					}

					return 1;
				}
			} else if (var0 == 7505) {
				int var22 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				yl var28 = ot.ak(var22);
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var28.ae_fld;
				return 1;
			} else if (var0 == 7506) {
				int var21 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				int var27 = -1;
				if (bq.fz_fld != null && var21 >= 0 && var21 < bq.fz_fld.size()) {
					var27 = (Integer)bq.fz_fld.get(var21);
				}

				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var27;
				return 1;
			} else if (var0 == 7507) {
				int var4 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				Object var5 = he.cg(var4);
				int var6 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				yo var7 = bu.hv(var6);
				if (var7 == null) {
					throw new RuntimeException();
				} else if (mk.ak(var6) != client.gg_fld) {
					throw new RuntimeException();
				} else if (null == bq.fz_fld && bq.fz_fld.isEmpty()) {
					throw new RuntimeException();
				} else {
					int var8 = og.az(var6);
					List var9 = var7.az(var5, var8);
					bq.fz_fld = new LinkedList(bq.fz_fld);
					if (null != var9) {
						bq.fz_fld.retainAll(var9);
					} else {
						bq.fz_fld.clear();
					}

					gq.ff_fld = bq.fz_fld.iterator();
					if (var0 == 7507) {
						bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = bq.fz_fld.size();
					}

					return 1;
				}
			} else {
				return 2;
			}
		} catch (Throwable var20) {
			throw new RuntimeException(var20);
		}
	}

	fs() {
	}
}
