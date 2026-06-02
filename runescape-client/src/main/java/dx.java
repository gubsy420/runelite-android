import java.io.EOFException;
import java.util.Iterator;
import net.runelite.api.Actor;
import net.runelite.api.Deque;
import net.runelite.api.IndexedObjectSet;
import net.runelite.api.Projectile;
import net.runelite.api.Projection;
import net.runelite.api.Tile;
import net.runelite.api.WorldView;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.AmbientSoundEffectCreated;
import net.runelite.api.events.ItemSpawned;

@ObfuscatedName("dx")
@Implements({"WorldView"})
public class dx extends vw implements WorldView {
	@ObfuscatedGetter(
		intValue = 1674941469
	)
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ag_fld;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "[[I"
	)
	int[][] ar_fld;
	@ObfuscatedName("tx")
	@ObfuscatedSignature(
		descriptor = "[[[I"
	)
	public int[][][] tx_fld;
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int by_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "[Lgn;"
	)
	gn[] av_fld;
	@ObfuscatedGetter(
		intValue = -457350413
	)
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ae_fld;
	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "Lna;"
	)
	public na cq_fld = new na();
	@ObfuscatedGetter(
		intValue = -1334495393
	)
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ah_fld;
	@ObfuscatedGetter(
		intValue = 930798681
	)
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int aw_fld;
	@ObfuscatedGetter(
		intValue = -1124760005
	)
	@ObfuscatedName("xn")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int xn_fld;
	@ObfuscatedGetter(
		intValue = -106081977
	)
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ay_fld;
	@ObfuscatedName("mx")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public boolean mx_fld;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lxf;"
	)
	public xf au_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lna;"
	)
	na ak_fld;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "[[[I"
	)
	int[][][] af_fld;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "[[[B"
	)
	byte[][][] al_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lev;"
	)
	public ev az_fld;
	@ObfuscatedName("zu")
	@ObfuscatedSignature(
		descriptor = "[[[Lna;"
	)
	public na[][][] zu_fld;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lxf;"
	)
	public xf ax_fld;
	@ObfuscatedName("on")
	@ObfuscatedSignature(
		descriptor = "Lao;"
	)
	static ao on_fld;
	// $VF: synthetic field
	@ObfuscatedName("en")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public static boolean en_fld = !dx.class.desiredAssertionStatus();
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "[[[Lna;"
	)
	na[][][] aa_fld;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lna;"
	)
	na ai_fld;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lna;"
	)
	na aq_fld;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lyw;"
	)
	yw ad_fld;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lyw;"
	)
	yw am_fld;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "[[I"
	)
	static int[][] ao_fld = new int[2][3];
	@ObfuscatedName("kr")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	public int[] kr_fld;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "[[I"
	)
	static int[][] ab_fld = new int[2][3];
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "[[I"
	)
	static int[][] ap_fld = new int[2][3];
	@ObfuscatedGetter(
		intValue = -1497807591
	)
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int as_fld;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lxv;"
	)
	xv an_fld;
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bp_fld;

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean ak(int var1) {
		return this.ag_fld == 0;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(Lfa;IIIII)I"
	)
	int bq(fa var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1.ah_fld) {
			return this.af_fld[var6][var2][var3];
		} else {
			mn.ak(0, this.af_fld, var6, var2, var3, ao_fld[0], ab_fld[0], ap_fld[0]);
			mn.ak(1, this.af_fld, var6, var2, var3, ao_fld[1], ab_fld[1], ap_fld[1]);

			for (int var7 = 0; var7 < 2; var7++) {
				int var8 = ao_fld[var7][0];
				int var9 = ap_fld[var7][0];
				int var10 = ao_fld[var7][1];
				int var11 = ap_fld[var7][1];
				int var12 = ao_fld[var7][2];
				int var13 = ap_fld[var7][2];
				if (ev.af(var4, var5, var9, var11, var13, var8, var10, var12)) {
					int var14 = ab_fld[var7][0];
					int var15 = ab_fld[var7][1];
					int var16 = ab_fld[var7][2];
					float var17 = sb.au(var4, var5, var8, var10, var12, var9, var11, var13, var14, var15, var16);
					return (int)var17;
				}
			}

			return -1355218116;
		}
	}

	@ObfuscatedName("nu")
	@ObfuscatedSignature(
		descriptor = "(Ldx;Lfa;IIIII)I"
	)
	public static int nu(dx var0, fa var1, int var2, int var3, int var4, int var5, int var6) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var1.ah_fld) {
			return var0.af_fld[var6][var2][var3];
		} else {
			mn.ak(0, var0.af_fld, var6, var2, var3, ao_fld[0], ab_fld[0], ap_fld[0]);
			mn.ak(1, var0.af_fld, var6, var2, var3, ao_fld[1], ab_fld[1], ap_fld[1]);

			for (int var7 = 0; var7 < 2; var7++) {
				int var8 = ao_fld[var7][0];
				int var9 = ap_fld[var7][0];
				int var10 = ao_fld[var7][1];
				int var11 = ap_fld[var7][1];
				int var12 = ao_fld[var7][2];
				int var13 = ap_fld[var7][2];
				if (ev.af(var4, var5, var9, var11, var13, var8, var10, var12)) {
					int var14 = ab_fld[var7][0];
					int var15 = ab_fld[var7][1];
					int var16 = ab_fld[var7][2];
					float var17 = sb.au(var4, var5, var8, var10, var12, var9, var11, var13, var14, var15, var16);
					return (int)var17;
				}
			}

			return -2147483647;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void ag(int var1) {
		this.ad_fld.av();
		this.am_fld.av();
		this.au_fld.as();
		this.ax_fld.as();
		this.an_fld.az();
		this.aq_fld.ag();
		this.ai_fld = new na();

		for (int var2 = 0; var2 < 4; var2++) {
			for (int var3 = 0; var3 < this.ah_fld; var3++) {
				if (var1 != -1187084379) {
					return;
				}

				for (int var4 = 0; var4 < this.aw_fld; var4++) {
					this.aa_fld[var2][var3][var4] = null;
				}
			}
		}

		this.az_fld.ab();

		for (int var5 = 0; var5 < 4; var5++) {
			if (var1 != -1187084379) {
				return;
			}

			this.av_fld[var5].ah(1639049925);
		}
	}

	@ObfuscatedName("getBaseY")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getBaseY() {
		return this.as_fld;
	}

	@ObfuscatedName("vn")
	@ObfuscatedSignature(
		descriptor = "(III)I"
	)
	public int vn(int var1, int var2, int var3) {
		try {
			return this.an(var1, var2, var3, 1764729525);
		} catch (Throwable var5) {
			throw new RuntimeException(var5);
		}
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(Lrg;IIII)V"
	)
	void bo(rg var1, int var2, int var3, int var4, int var5) {
		try {
			for (dr var6 = (dr)this.ak_fld.aw(); null != var6; var6 = (dr)this.ak_fld.as()) {
				boolean var7 = this.al(var1, var2, var6, (byte)48);
				tu var8 = mf.bn(this, var6.ag(-1943871634), var6.av((byte)-9));
				tu var9 = mf.bn(this, var6.az(2102521244), var6.ae(1480362042));
				int var10 = (int)var8.ay_fld;
				int var11 = (int)var8.ar_fld;
				int var12 = (int)var9.ay_fld;
				int var13 = (int)var9.ar_fld;
				var6.ao(var3, var4, var10, var11, var12, var13, var5, var7, 866782177);
				var8.ah();
				var9.ah();
			}
		} catch (Throwable var15) {
			throw new RuntimeException(var15);
		}
	}

	@ObfuscatedName("getCanvasProjection")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/Projection;"
	)
	@Override
	public Projection getCanvasProjection() {
		if (this.az_fld.zy_fld instanceof ey) {
			ey var1 = (ey)this.az_fld.zy_fld;
			if (uy.pl_fld.equals(var1.ak_fld)) {
				return null;
			}
		}

		return this.az_fld.zy_fld;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(III)Z"
	)
	public boolean ae(int var1, int var2, int var3) {
		return var1 >= 0 && var2 >= 0 && var1 < this.ah_fld && var2 < this.aw_fld;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z"
	)
	boolean ah(int var1, int var2, int var3, int var4) {
		return var1 >= 0 && var1 < 4 && this.ae(var2, var3, 2064987328);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIILoe;II)V"
	)
	void ay(int var1, int var2, int var3, oe var4, int var5, int var6) {
		int var7 = var4.ao(var5, (byte)2);
		int var8 = var4.ab(var5, (short)19220);
		int var9 = kj.aw(var2);
		int var10 = kj.aw(var3);
		int var11 = kj.aw(var7 + var2);
		int var12 = kj.aw(var3 + var8);
		cd var13 = new cd(var1, var9, var10, var11, var12, var4);
		this.ak_fld.av(var13);
		this.rc(var1, var2, var3, var4, var5);
	}

	@ObfuscatedName("vp")
	@ObfuscatedSignature(
		descriptor = "(IIIII)I"
	)
	public int vp(int var1, int var2, int var3, int var4, int var5) {
		int var6 = var3 & 127;
		int var7 = var4 & 127;
		int var8 = this.az_fld.cs_fld[var5][var1][var2] * (128 - var6) + var6 * this.az_fld.cs_fld[var5][var1 + 1][var2] >> 7;
		int var9 = this.az_fld.cs_fld[var5][var1 + 1][var2 + 1] * var6 + this.az_fld.cs_fld[var5][var1][var2 + 1] * (128 - var6) >> 7;
		return var9 * var7 + var8 * (128 - var7) >> 7;
	}

	@ObfuscatedName("getTileHeight")
	@ObfuscatedSignature(
		descriptor = "(III)I"
	)
	@Override
	public int getTileHeight(int var1, int var2, int var3) {
		try {
			int var4 = (var1 >> 7) + this.az_fld.jh_fld;
			int var5 = (var2 >> 7) + this.az_fld.jh_fld;
			int var6 = this.az_fld.jh_fld << 1;
			if (var4 >= 0 && var5 >= 0 && var4 < this.ah_fld + var6 && var5 < this.aw_fld + var6) {
				int var7 = var3;
				if (var3 > 0 && (this.az_fld.la_fld[1][var4][var5] & 2) == 2) {
					var7 = var3 - 1;
				}

				rl10 var8 = this.az_fld.iy_fld[var7][var4][var5];
				int var9 = -2147483647;
				if (var8 != null) {
					fl var10 = var8.getSceneTileModel();
					if (var10 != null) {
						var9 = this.mm(var10, -1, -1, var1, var2);
					}

					fa var11 = var8.getSceneTilePaint();
					if (var9 == -2147483647 && var11 != null) {
						var9 = this.vg(var11, var1 >> 7, var2 >> 7, var1, var2, var3);
					}
				}

				if (var9 == -2147483647) {
					var9 = this.vp(var4, var5, var1, var2, var3);
				}

				if (var8 != null) {
					ef var14 = var8.getGroundObject();
					if (var14 != null) {
						oe var15 = oe.ke(var14.getId());
						var9 -= var15.dw_fld;
					}
				}

				return var9;
			} else {
				return 0;
			}
		} catch (Throwable var13) {
			throw new RuntimeException(var13);
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(III)Lkj;"
	)
	kj ab(int var1, int var2, int var3) {
		return new kj(var1, var2 - this.ay_fld, var3 - this.as_fld);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lds;I)V"
	)
	void as(ds var1, int var2) {
		try {
			if (pp.tw(var1.ah_fld, -404241229)) {
				ck var3 = new ck(var1);
				this.ak_fld.av(var3);
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "(Ldx;I)V"
	)
	public static void dq(dx var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.au_fld.as();
		Iterator var2 = var0.ax_fld.iterator();

		while (var2.hasNext()) {
			da var3 = (da)(da)var2.next();
			da.xp(var3, 1754164593);
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	public boolean at(int var1, int var2) {
		return var1 >= 0 && var2 >= 0 && var1 < this.ah_fld && var2 < this.aw_fld;
	}

	@ObfuscatedName("qj")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void qj() {
		if (og.ci_fld.getLocalPlayer() != null) {
			rl10[][][] var1 = this.az_fld.getTiles();
			na[][] var2 = this.aa_fld[this.ae_fld];

			for (int var3 = 0; var3 < 104; var3++) {
				for (int var4 = 0; var4 < 104; var4++) {
					na var5 = var2[var3][var4];
					if (var5 != null) {
						rl10 var6 = var1[this.ae_fld][var3][var4];
						if (this.az_fld.mx(var6.xq_fld)) {
							if (!en_fld && var6.getItemLayer() == null) {
								throw new AssertionError();
							}

							for (dw var7 = (dw)var5.ui(); var7 != null; var7 = (dw)var5.fc()) {
								var7.yo(var3);
								var7.ej(var4);
								var7.ho_fld = this.getId();
								ItemSpawned var8 = new ItemSpawned(var6, var7);
								og.ci_fld.getCallbacks().post(var8);
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bt() {
		try {
			for (dr var1 = (dr)this.ak_fld.aw(); null != var1; var1 = (dr)this.ak_fld.as()) {
				var1.ak(-599863736);
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ap() {
		this.au_fld.as();
		Iterator var1 = this.ax_fld.iterator();

		while (var1.hasNext()) {
			da var2 = (da)(da)var1.next();
			da.xp(var2, 98077408);
		}
	}

	@ObfuscatedName("getPlane")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getPlane() {
		return this.ae_fld;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	void ax(byte var1) {
		try {
			for (dr var2 = (dr)this.ak_fld.aw(); null != var2; var2 = (dr)this.ak_fld.as()) {
				var2.ak(-1343383056);
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIII)I"
	)
	final int an(int var1, int var2, int var3, int var4) {
		try {
			int var5 = (var1 >> 7) + this.az_fld.jh_fld;
			int var6 = (var2 >> 7) + this.az_fld.jh_fld;
			int var7 = this.az_fld.jh_fld << 1;
			if (var5 >= 0 && var6 >= 0 && var5 < this.ah_fld + var7 && var6 < this.aw_fld + var7) {
				rl10 var8 = this.az_fld.iy_fld[var3][var5][var6];
				int var9 = var3;
				if (var3 < 3 && (this.az_fld.la_fld[1][var5][var6] & 2) == 2) {
					var9 = var3 + 1;
				}

				int var10 = -2147483647;
				if (var8 != null) {
					fl var11 = var8.getSceneTileModel();
					if (var11 != null) {
						var10 = this.mm(var11, -1, -1, var1, var2);
					}

					fa var12 = var8.getSceneTilePaint();
					if (var10 == -2147483647 && var12 != null) {
						var10 = this.vg(var12, var1 >> 7, var2 >> 7, var1, var2, var9);
					}
				}

				if (var10 == -2147483647) {
					var10 = this.vp(var5, var6, var1, var2, var9);
				}

				if (var8 != null) {
					ef var15 = var8.getGroundObject();
					if (var15 != null) {
						oe var16 = oe.ke(var15.getId());
						var10 -= var16.dw_fld;
					}
				}

				return var10;
			} else {
				return 0;
			}
		} catch (Throwable var14) {
			throw new RuntimeException(var14);
		}
	}

	@ObfuscatedName("getSelectedSceneTile")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/Tile;"
	)
	@Override
	public Tile getSelectedSceneTile() {
		int var1 = og.ci_fld.isMenuOpen() ? this.az_fld.bw_fld : this.az_fld.bu_fld;
		int var2 = og.ci_fld.isMenuOpen() ? this.az_fld.ba_fld : this.az_fld.bn_fld;
		return var1 >= this.az_fld.oq_fld && var2 >= this.az_fld.zc_fld && var1 < this.az_fld.rm_fld && var2 < this.az_fld.jq_fld
			? this.az_fld.iy_fld[this.getPlane()][var1 + this.az_fld.jh_fld][var2 + this.az_fld.jh_fld]
			: null;
	}

	@ObfuscatedName("ws")
	@ObfuscatedSignature(
		descriptor = "(I)Ldx;"
	)
	public static dx ws(int var0) {
		return var0 == -1 ? bw.dk_fld : client.da_fld.xs(var0);
	}

	@ObfuscatedName("vg")
	@ObfuscatedSignature(
		descriptor = "(Lfa;IIIII)I"
	)
	public int vg(fa var1, int var2, int var3, int var4, int var5, int var6) {
		return this.ai(var1, var2, var3, var4, var5, var6, -1097368053);
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(IIILoe;I)V"
	)
	void be(int var1, int var2, int var3, oe var4, int var5) {
		int var6 = var4.ao(var5, (byte)-89);
		int var7 = var4.ab(var5, (short)10639);
		int var8 = kj.aw(var2);
		int var9 = kj.aw(var3);
		int var10 = kj.aw(var6 + var2);
		int var11 = kj.aw(var3 + var7);
		cd var12 = new cd(var1, var8, var9, var10, var11, var4);
		this.ak_fld.av(var12);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lfa;IIIIII)I"
	)
	int ai(fa var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		var2 += this.az_fld.jh_fld;
		var3 += this.az_fld.jh_fld;
		var4 += this.az_fld.jh_fld << 7;
		var5 += this.az_fld.jh_fld << 7;
		int[][][] var8 = this.af_fld;
		this.af_fld = this.az_fld.cs_fld;
		int var15 = var5;
		int var14 = var4;
		int var17 = -1097368053;
		int var10000;
		if (var1.ah_fld) {
			int var10 = this.af_fld[var6][var2][var3];
			var10000 = var10;
		} else {
			mn.ak(0, this.af_fld, var6, var2, var3, ao_fld[0], ab_fld[0], ap_fld[0]);
			mn.ak(1, this.af_fld, var6, var2, var3, ao_fld[1], ab_fld[1], ap_fld[1]);
			int var18 = 0;

			while (true) {
				if (var18 >= 2) {
					int var34 = -2147483647;
					var10000 = var34;
					break;
				}

				int var19 = ao_fld[var18][0];
				int var20 = ap_fld[var18][0];
				int var21 = ao_fld[var18][1];
				int var22 = ap_fld[var18][1];
				int var23 = ao_fld[var18][2];
				int var24 = ap_fld[var18][2];
				if (ev.af(var14, var15, var20, var22, var24, var19, var21, var23)) {
					int var25 = ab_fld[var18][0];
					int var26 = ab_fld[var18][1];
					int var27 = ab_fld[var18][2];
					float var28 = sb.au(var14, var15, var19, var21, var23, var20, var22, var24, var25, var26, var27);
					int var33 = (int)var28;
					var10000 = var33;
					break;
				}

				var18++;
			}
		}

		int var9 = var10000;
		this.af_fld = var8;
		return var9;
	}

	@ObfuscatedName("to")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void to() {
		cy(this, -1504480606);
	}

	@ObfuscatedName("getMainWorldProjection")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/Projection;"
	)
	@Override
	public Projection getMainWorldProjection() {
		return uy.pl_fld.equals(this.az_fld.pw_fld.ak_fld) ? null : this.az_fld.pw_fld;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean am() {
		return this.ag_fld == 0;
	}

	@ObfuscatedName("rc")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void rc() {
		this.az_fld.fj_fld = this;
		this.az_fld.po_fld = this.ag_fld;
		this.az_fld.la_fld = this.al_fld;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean ao() {
		return this.ag_fld == 0;
	}

	@ObfuscatedName("getSizeX")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getSizeX() {
		return this.ah_fld;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Lkj;"
	)
	kj az(int var1, int var2, int var3, byte var4) {
		return new kj(var1, var2 - this.ay_fld, var3 - this.as_fld);
	}

	@ObfuscatedName("getTileSettings")
	@ObfuscatedSignature(
		descriptor = "()[[[B"
	)
	@Override
	public byte[][][] getTileSettings() {
		return this.al_fld;
	}

	@ObfuscatedName("createProjectile")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIILnet/runelite/api/Actor;II)Lnet/runelite/api/Projectile;"
	)
	@Override
	public Projectile createProjectile(
		int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, Actor var11, int var12, int var13
	) {
		try {
			return og.ci_fld.tx(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
		} catch (Throwable var15) {
			throw new RuntimeException(var15);
		}
	}

	@ObfuscatedName("contains")
	@ObfuscatedSignature(
		descriptor = "(Lnet/runelite/api/coords/LocalPoint;)Z"
	)
	@Override
	public boolean contains(LocalPoint var1) {
		if (var1.getWorldView() != this.ag_fld) {
			return false;
		} else {
			int var2 = var1.getX();
			int var3 = var1.getY();
			var2 >>= 7;
			var3 >>= 7;
			return var2 >= 0 && var2 < this.ah_fld && var3 >= 0 && var3 < this.aw_fld;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(III)Z"
	)
	boolean ac(int var1, int var2, int var3) {
		return var1 >= 0 && var1 < 4 && this.ae(var2, var3, 1817052180);
	}

	@ObfuscatedName("npcs")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/IndexedObjectSet;"
	)
	@Override
	public IndexedObjectSet npcs() {
		return this.ax_fld;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(III)Z"
	)
	boolean aj(int var1, int var2, int var3) {
		return var1 >= 0 && var1 < 4 && this.ae(var2, var3, 143065235);
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(I)Lcv;"
	)
	cv bd(int var1) {
		return (cv)(cv)this.au_fld.ak(var1);
	}

	@ObfuscatedName("rc")
	@ObfuscatedSignature(
		descriptor = "(IIILoe;I)V"
	)
	public void rc(int var1, int var2, int var3, oe var4, int var5) {
		dr var6 = (dr)this.ak_fld.by();
		AmbientSoundEffectCreated var7 = new AmbientSoundEffectCreated(var6);
		og.ci_fld.getCallbacks().post(var7);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lrg;IIIIB)V"
	)
	void au(rg var1, int var2, int var3, int var4, int var5, byte var6) {
		try {
			for (dr var7 = (dr)this.ak_fld.aw(); null != var7; var7 = (dr)this.ak_fld.as()) {
				boolean var8 = this.al(var1, var2, var7, (byte)119);
				tu var9 = mf.bn(this, var7.ag(-1943871634), var7.av((byte)-5));
				tu var10 = mf.bn(this, var7.az(346241693), var7.ae(-1006204539));
				int var11 = (int)var9.ay_fld;
				int var12 = (int)var9.ar_fld;
				int var13 = (int)var10.ay_fld;
				int var14 = (int)var10.ar_fld;
				var7.ao(var3, var4, var11, var12, var13, var14, var5, var8, 535673856);
				var9.ah();
				var10.ah();
			}
		} catch (Throwable var15) {
			throw new RuntimeException(var15);
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lrg;ILdr;B)Z"
	)
	boolean al(rg var1, int var2, dr var3, byte var4) {
		rg var5 = client.da_fld.ay(this.ag_fld, (byte)17);
		boolean var6 = var5 == var1;
		if (var6) {
			if (var2 != var3.bz(-2011865929)) {
				return false;
			}
		} else {
			if (var1 != null && var1.aw_fld.ay((byte)91) != var2) {
				return false;
			}

			if (null != var5 && var5.aw_fld.ay((byte)1) != var3.bz(-1833372176)) {
				return false;
			}

			int var7 = var1 == null ? var2 : var1.ak(-1216886044);
			int var8 = var5 == null ? var3.bz(-1889021705) : var5.ak(-1669782360);
			if (var8 != var7) {
				return false;
			}
		}

		switch (var3.ar_fld.ae_fld.av_fld * 1792596829) {
			case 0:
				return true;
			case 1:
				return var6;
			case 2:
				return var1 == var5 || var5 == null;
			default:
				return false;
		}
	}

	dx(int var1, int var2, int var3, int var4, er var5) {
		this.zu_fld = new na[4][var2][var3];
		this.ak_fld = new na();
		this.av_fld = new gn[4];
		this.ai_fld = new na();
		this.aq_fld = new na();
		this.ad_fld = new yw(149);
		this.am_fld = new yw(25);
		this.ag_fld = var1;
		this.ah_fld = var2;
		this.aw_fld = var3;
		this.au_fld = new xf(0 == var1 ? 512 : 8);
		this.ax_fld = new xf(0 == var1 ? 128 : 8);
		this.an_fld = new xv(0 == var1 ? 32 : 1);
		this.aa_fld = new na[4][var2][var3];
		this.af_fld = new int[4][var2 + 1][var3 + 1];
		this.al_fld = new byte[4][var2][var3];
		this.ar_fld = new int[var2][var3];
		boolean var6 = var1 != 0;

		for (int var7 = 0; var7 < 4; var7++) {
			this.av_fld[var7] = new gn(var2, var3, var6);
		}

		this.az_fld = new ev(this.ak(-787091592), 4, var2, var3, var4, var5, this.af_fld);
		this.rc();
	}

	@ObfuscatedName("hc")
	@ObfuscatedSignature(
		descriptor = "(Ldx;III)I"
	)
	public static int hc(dx var0, int var1, int var2, int var3) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			int var4 = kj.ay(var1);
			int var5 = kj.ay(var2);
			if (var4 >= 0 && var5 >= 0 && var4 < var0.al_fld[0].length && var5 < var0.al_fld[0][0].length) {
				int var6 = var3;
				if (wo.dz(var0, var3, var4, var5)) {
					var6 = var3 + 1;
				}

				ei var7 = var0.az_fld.bl_fld[var3][var4][var5];
				int var8 = -2147483647;
				if (var7 != null && var7.av_fld != null) {
					var8 = var0.aa(var7.av_fld, var4, var5, var1, var2, -1502823680);
				}

				if (-2147483647 == var8 && null != var7 && null != var7.az_fld) {
					var8 = var0.ai(var7.az_fld, var4, var5, var1, var2, var6, 1168624432);
				}

				if (var8 == -2147483647) {
					var8 = wp(var0, var4, var5, var1, var2, var6);
				}

				if (null != var7) {
					ef var9 = ei.jq(var7, -1114899986);
					if (null != var9) {
						int var10 = bj.ae(var9.ag_fld);
						oe var11 = ko.az(var10);
						var8 -= var11.dw_fld;
					}
				}

				return var8;
			} else {
				return 0;
			}
		} catch (Throwable var13) {
			throw new RuntimeException(var13);
		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(IIILoe;I)V"
	)
	void bs(int var1, int var2, int var3, oe var4, int var5) {
		int var6 = var4.ao(var5, (byte)-20);
		int var7 = var4.ab(var5, (short)-13051);
		int var8 = kj.aw(var2);
		int var9 = kj.aw(var3);
		int var10 = kj.aw(var6 + var2);
		int var11 = kj.aw(var3 + var7);
		cd var12 = new cd(var1, var8, var9, var10, var11, var4);
		this.ak_fld.av(var12);
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(Lds;)V"
	)
	void bh(ds var1) {
		try {
			if (pp.tw(var1.ah_fld, -1456362701)) {
				ck var2 = new ck(var1);
				this.ak_fld.av(var2);
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("getBaseX")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getBaseX() {
		return this.ay_fld;
	}

	@ObfuscatedName("rn")
	@ObfuscatedSignature(
		descriptor = "()[Lgn;"
	)
	public gn[] getCollisionMaps() {
		return this.av_fld;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(IIILoe;I)V"
	)
	void bj(int var1, int var2, int var3, oe var4, int var5) {
		try {
			if (var4 != null && var4.aq((short)-10889)) {
				int var6 = var4.ao(var5, (byte)-115);
				int var7 = var4.ab(var5, (short)-12088);
				int var8 = kj.aw(var6 + var2);
				int var9 = kj.aw(var3 + var7);
				var2 = kj.aw(var2);
				var3 = kj.aw(var3);
				int var10 = var4.am(314528291).ag_fld * 1077344343;
				int var11 = kj.aw(var4.am(314528291).az_fld * 193667497);
				int var12 = Math.max(kj.aw(var4.am(314528291).ak_fld * 1259083063 - 1), 0);
				if (var4.dy_fld != null) {
					oe var13 = var4.ax((byte)42);
					if (var13 != null) {
						var10 = var13.am(314528291).ag_fld * 1077344343;
						var11 = kj.aw(var13.am(314528291).az_fld * 193667497);
						var12 = Math.max(kj.aw(var4.am(314528291).ak_fld * 1259083063 - 1), 0);
					}
				}

				for (dr var18 = (dr)this.ak_fld.aw(); var18 != null; var18 = (dr)this.ak_fld.as()) {
					if (var18.bz(-1760075653) == var1
						&& var18.ag(-1943871634) == var2
						&& var18.av((byte)-46) == var3
						&& var18.az(2003100625) == var8
						&& var18.ae(731673650) == var9
						&& dr.bk(var18, (byte)-76) == var10
						&& dr.fw(var18, 1273448953) == var11
						&& var18.be((byte)-128) == var12) {
						var18.bm(-1128328397);
						break;
					}
				}
			}
		} catch (Throwable var15) {
			throw new RuntimeException(var15);
		}
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(IIILoe;I)V"
	)
	void br(int var1, int var2, int var3, oe var4, int var5) {
		int var6 = var4.ao(var5, (byte)-120);
		int var7 = var4.ab(var5, (short)-24760);
		int var8 = kj.aw(var2);
		int var9 = kj.aw(var3);
		int var10 = kj.aw(var6 + var2);
		int var11 = kj.aw(var3 + var7);
		cd var12 = new cd(var1, var8, var9, var10, var11, var4);
		this.ak_fld.av(var12);
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(Lrg;ILdr;)Z"
	)
	boolean by(rg var1, int var2, dr var3) {
		rg var4 = client.da_fld.ay(this.ag_fld, (byte)2);
		boolean var5 = var4 == var1;
		if (var5) {
			if (var2 != var3.bz(-2109766006)) {
				return false;
			}
		} else {
			if (var1 != null && var1.aw_fld.ay((byte)117) != var2) {
				return false;
			}

			if (null != var4 && var4.aw_fld.ay((byte)29) != var3.bz(-1918677924)) {
				return false;
			}

			int var6 = var1 == null ? var2 : var1.ak(-1983540395);
			int var7 = var4 == null ? var3.bz(-1934078739) : var4.ak(-1166363492);
			if (var7 != var6) {
				return false;
			}
		}

		switch (var3.ar_fld.ae_fld.av_fld * 1792596829) {
			case 0:
				return true;
			case 1:
				return var5;
			case 2:
				return var1 == var4 || var4 == null;
			default:
				return false;
		}
	}

	@ObfuscatedName("ko")
	@ObfuscatedSignature(
		descriptor = "(Ldx;)Z"
	)
	public static boolean ko(dx var0) {
		return 2028160418 * var0.ag_fld == 0;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	static boolean au() {
		if (null != client.py_fld && client.pz_fld < client.py_fld.size()) {
			while (client.pz_fld < client.py_fld.size()) {
				dq var1 = (dq)(dq)client.py_fld.get(client.pz_fld);
				if (!var1.ak()) {
					return false;
				}

				client.pz_fld++;
			}

			return true;
		} else {
			return true;
		}
	}

	@ObfuscatedName("contains")
	@ObfuscatedSignature(
		descriptor = "(Lnet/runelite/api/coords/WorldPoint;)Z"
	)
	@Override
	public boolean contains(WorldPoint var1) {
		int var2 = var1.getX();
		int var3 = var1.getY();
		return var2 >= this.ay_fld && var2 < this.ay_fld + this.ah_fld && var3 >= this.as_fld && var3 < this.as_fld + this.aw_fld;
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(Ldx;I)V"
	)
	public static void cy(dx var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		for (dr var2 = (dr)var0.ak_fld.aw(); null != var2; var2 = (dr)var0.ak_fld.as()) {
			var2.bm(-902004399);
		}
	}

	@ObfuscatedName("worldViews")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/IndexedObjectSet;"
	)
	@Override
	public IndexedObjectSet worldViews() {
		return new rl20(this);
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(Lrg;ILdr;)Z"
	)
	boolean bx(rg var1, int var2, dr var3) {
		rg var4 = client.da_fld.ay(this.ag_fld, (byte)60);
		boolean var5 = var4 == var1;
		if (var5) {
			if (var2 != var3.bz(-1807505295)) {
				return false;
			}
		} else {
			if (var1 != null && var1.aw_fld.ay((byte)85) != var2) {
				return false;
			}

			if (null != var4 && var4.aw_fld.ay((byte)85) != var3.bz(-1872740871)) {
				return false;
			}

			int var6 = var1 == null ? var2 : var1.ak(-1413296062);
			int var7 = var4 == null ? var3.bz(-1688558806) : var4.ak(-2058103831);
			if (var7 != var6) {
				return false;
			}
		}

		switch (var3.ar_fld.ae_fld.av_fld * 1792596829) {
			case 0:
				return true;
			case 1:
				return var5;
			case 2:
				return var1 == var4 || var4 == null;
			default:
				return false;
		}
	}

	@ObfuscatedName("mt")
	@ObfuscatedSignature(
		descriptor = "(Ldx;III)Z"
	)
	public static boolean mt(dx var0, int var1, int var2, int var3) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var1 >= 0 && var1 < 4 && var0.ae(var2, var3, 1749096362);
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lfl;IIIII)I"
	)
	int aa(fl var1, int var2, int var3, int var4, int var5, int var6) {
		for (int var7 = 0; var7 < var1.an_fld.length; var7++) {
			int var8 = var1.as_fld[var1.an_fld[var7]];
			int var9 = var1.af_fld[var1.an_fld[var7]];
			int var10 = var1.as_fld[var1.aa_fld[var7]];
			int var11 = var1.af_fld[var1.aa_fld[var7]];
			int var12 = var1.as_fld[var1.ai_fld[var7]];
			int var13 = var1.af_fld[var1.ai_fld[var7]];
			if (ev.af(var4, var5, var9, var11, var13, var8, var10, var12)) {
				int var14 = var1.ar_fld[var1.an_fld[var7]];
				int var15 = var1.ar_fld[var1.aa_fld[var7]];
				int var16 = var1.ar_fld[var1.ai_fld[var7]];
				float var17 = sb.au(var4, var5, var8, var10, var12, var9, var11, var13, var14, var15, var16);
				return (int)var17;
			}
		}

		return -2147483647;
	}

	@ObfuscatedName("getGraphicsObjects")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/Deque;"
	)
	@Override
	public Deque getGraphicsObjects() {
		return this.aq_fld;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(Lrg;ILdr;)Z"
	)
	boolean bl(rg var1, int var2, dr var3) {
		rg var4 = client.da_fld.ay(this.ag_fld * -1119438289, (byte)-120);
		boolean var5 = var4 == var1;
		if (var5) {
			if (var2 != var3.bz(-1652189788)) {
				return false;
			}
		} else {
			if (var1 != null && var1.aw_fld.ay((byte)2) != var2) {
				return false;
			}

			if (null != var4 && var4.aw_fld.ay((byte)9) != var3.bz(-2060748847)) {
				return false;
			}

			int var6 = var1 == null ? var2 : var1.ak(-1307762445);
			int var7 = var4 == null ? var3.bz(-1674819250) : var4.ak(-1371047427);
			if (var7 != var6) {
				return false;
			}
		}

		switch (var3.ar_fld.ae_fld.av_fld * -1106260770) {
			case 0:
				return true;
			case 1:
				return var5;
			case 2:
				return var1 == var4 || var4 == null;
			default:
				return false;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IZI)V"
	)
	public static final void ak(int var0, boolean var1, int var2) {
		if (var0 >= 8000 && var0 <= 48000) {
			ao.ar_fld = var0;
			jx.al_fld = var1;
			ni.ax_fld = var2;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(IIILoe;I)V"
	)
	void bf(int var1, int var2, int var3, oe var4, int var5) {
		try {
			if (var4 != null && var4.aq((short)-16103)) {
				int var6 = var4.ao(var5, (byte)-15);
				int var7 = var4.ab(var5, (short)16170);
				int var8 = kj.aw(var6 + var2);
				int var9 = kj.aw(var3 + var7);
				var2 = kj.aw(var2);
				var3 = kj.aw(var3);
				int var10 = var4.am(314528291).ag_fld * 1077344343;
				int var11 = kj.aw(var4.am(314528291).az_fld * 193667497);
				int var12 = Math.max(kj.aw(var4.am(314528291).ak_fld * 1259083063 - 1), 0);
				if (var4.dy_fld != null) {
					oe var13 = var4.ax((byte)69);
					if (var13 != null) {
						var10 = var13.am(314528291).ag_fld * 1077344343;
						var11 = kj.aw(var13.am(314528291).az_fld * 193667497);
						var12 = Math.max(kj.aw(var4.am(314528291).ak_fld * 1259083063 - 1), 0);
					}
				}

				for (dr var18 = (dr)this.ak_fld.aw(); var18 != null; var18 = (dr)this.ak_fld.as()) {
					if (var18.bz(-1489275204) == var1
						&& var18.ag(-1943871634) == var2
						&& var18.av((byte)-30) == var3
						&& var18.az(886726299) == var8
						&& var18.ae(-38079932) == var9
						&& dr.bk(var18, (byte)11) == var10
						&& dr.fw(var18, 860620711) == var11
						&& var18.be((byte)-128) == var12) {
						var18.bm(1146957521);
						break;
					}
				}
			}
		} catch (Throwable var15) {
			throw new RuntimeException(var15);
		}
	}

	@ObfuscatedName("getMapRegions")
	@ObfuscatedSignature(
		descriptor = "()[I"
	)
	@Override
	public int[] getMapRegions() {
		return this.kr_fld;
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(III)I"
	)
	final int bi(int var1, int var2, int var3) {
		try {
			int var4 = kj.ay(var1);
			int var5 = kj.ay(var2);
			if (var4 >= 0 && var5 >= 0 && var4 < this.al_fld[0].length && var5 < this.al_fld[0][0].length) {
				int var6 = var3;
				if (wo.dz(this, var3, var4, var5)) {
					var6 = var3 + 1;
				}

				ei var7 = this.az_fld.bl_fld[var3][var4][var5];
				int var8 = -2147483647;
				if (var7 != null && var7.av_fld != null) {
					var8 = this.aa(var7.av_fld, var4, var5, var1, var2, -1470486103);
				}

				if (-1818382814 == var8 && null != var7 && null != var7.az_fld) {
					var8 = this.ai(var7.az_fld, var4, var5, var1, var2, var6, 865850586);
				}

				if (var8 == -2147483647) {
					var8 = wp(this, var4, var5, var1, var2, var6);
				}

				if (null != var7) {
					ef var9 = ei.jq(var7, -241027974);
					if (null != var9) {
						int var10 = bj.ae(var9.ag_fld);
						oe var11 = ko.az(var10);
						var8 -= var11.dw_fld;
					}
				}

				return var8;
			} else {
				return 0;
			}
		} catch (Throwable var13) {
			throw new RuntimeException(var13);
		}
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(Lfl;IIII)I"
	)
	int bw(fl var1, int var2, int var3, int var4, int var5) {
		for (int var6 = 0; var6 < var1.an_fld.length; var6++) {
			int var7 = var1.as_fld[var1.an_fld[var6]];
			int var8 = var1.af_fld[var1.an_fld[var6]];
			int var9 = var1.as_fld[var1.aa_fld[var6]];
			int var10 = var1.af_fld[var1.aa_fld[var6]];
			int var11 = var1.as_fld[var1.ai_fld[var6]];
			int var12 = var1.af_fld[var1.ai_fld[var6]];
			if (ev.af(var4, var5, var8, var10, var12, var7, var9, var11)) {
				int var13 = var1.ar_fld[var1.an_fld[var6]];
				int var14 = var1.ar_fld[var1.aa_fld[var6]];
				int var15 = var1.ar_fld[var1.ai_fld[var6]];
				float var16 = sb.au(var4, var5, var7, var9, var11, var8, var10, var12, var13, var14, var15);
				return (int)var16;
			}
		}

		return -2147483647;
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(Lfl;IIII)I"
	)
	int bc(fl var1, int var2, int var3, int var4, int var5) {
		for (int var6 = 0; var6 < var1.an_fld.length; var6++) {
			int var7 = var1.as_fld[var1.an_fld[var6]];
			int var8 = var1.af_fld[var1.an_fld[var6]];
			int var9 = var1.as_fld[var1.aa_fld[var6]];
			int var10 = var1.af_fld[var1.aa_fld[var6]];
			int var11 = var1.as_fld[var1.ai_fld[var6]];
			int var12 = var1.af_fld[var1.ai_fld[var6]];
			if (ev.af(var4, var5, var8, var10, var12, var7, var9, var11)) {
				int var13 = var1.ar_fld[var1.an_fld[var6]];
				int var14 = var1.ar_fld[var1.aa_fld[var6]];
				int var15 = var1.ar_fld[var1.ai_fld[var6]];
				float var16 = sb.au(var4, var5, var7, var9, var11, var8, var10, var12, var13, var14, var15);
				return (int)var16;
			}
		}

		return -1746308692;
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(Lfa;IIIII)I"
	)
	int ba(fa var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1.ah_fld) {
			return this.af_fld[var6][var2][var3];
		} else {
			mn.ak(0, this.af_fld, var6, var2, var3, ao_fld[0], ab_fld[0], ap_fld[0]);
			mn.ak(1, this.af_fld, var6, var2, var3, ao_fld[1], ab_fld[1], ap_fld[1]);

			for (int var7 = 0; var7 < 2; var7++) {
				int var8 = ao_fld[var7][0];
				int var9 = ap_fld[var7][0];
				int var10 = ao_fld[var7][1];
				int var11 = ap_fld[var7][1];
				int var12 = ao_fld[var7][2];
				int var13 = ap_fld[var7][2];
				if (ev.af(var4, var5, var9, var11, var13, var8, var10, var12)) {
					int var14 = ab_fld[var7][0];
					int var15 = ab_fld[var7][1];
					int var16 = ab_fld[var7][2];
					float var17 = sb.au(var4, var5, var8, var10, var12, var9, var11, var13, var14, var15, var16);
					return (int)var17;
				}
			}

			return -664946938;
		}
	}

	@ObfuscatedName("isInstance")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	public boolean isInstance() {
		return this.mx_fld;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(I)Lcv;"
	)
	cv bz(int var1) {
		return (cv)(cv)this.au_fld.ak(var1);
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(Lfa;IIIII)I"
	)
	int bg(fa var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1.ah_fld) {
			return this.af_fld[var6][var2][var3];
		} else {
			mn.ak(0, this.af_fld, var6, var2, var3, ao_fld[0], ab_fld[0], ap_fld[0]);
			mn.ak(1, this.af_fld, var6, var2, var3, ao_fld[1], ab_fld[1], ap_fld[1]);

			for (int var7 = 0; var7 < 2; var7++) {
				int var8 = ao_fld[var7][0];
				int var9 = ap_fld[var7][0];
				int var10 = ao_fld[var7][1];
				int var11 = ap_fld[var7][1];
				int var12 = ao_fld[var7][2];
				int var13 = ap_fld[var7][2];
				if (ev.af(var4, var5, var9, var11, var13, var8, var10, var12)) {
					int var14 = ab_fld[var7][0];
					int var15 = ab_fld[var7][1];
					int var16 = ab_fld[var7][2];
					float var17 = sb.au(var4, var5, var8, var10, var12, var9, var11, var13, var14, var15, var16);
					return (int)var17;
				}
			}

			return -2147483647;
		}
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(IIIII)I"
	)
	int cd(int var1, int var2, int var3, int var4, int var5) {
		int var6 = var3 & 1860476595;
		int var7 = var4 & 127;
		int var8 = var6 * this.af_fld[var5][1 + var1][var2] + (128 - var6) * this.af_fld[var5][var1][var2] >> 7;
		int var9 = (128 - var6) * this.af_fld[var5][var1][var2 + 1] + this.af_fld[var5][1 + var1][1 + var2] * var6 >> 7;
		return var7 * var9 + var8 * (128 - var7) >> 7;
	}

	@ObfuscatedName("ib")
	@ObfuscatedSignature(
		descriptor = "(Ldx;III)I"
	)
	public static int ib(dx var0, int var1, int var2, int var3) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			int var4 = kj.ay(var1);
			int var5 = kj.ay(var2);
			if (var4 >= 0 && var5 >= 0 && var4 < var0.al_fld[0].length && var5 < var0.al_fld[0][0].length) {
				int var6 = var3;
				if (wo.dz(var0, var3, var4, var5)) {
					var6 = var3 + 1;
				}

				ei var7 = var0.az_fld.bl_fld[var3][var4][var5];
				int var8 = -2147483647;
				if (var7 != null && var7.av_fld != null) {
					var8 = var0.aa(var7.av_fld, var4, var5, var1, var2, -2031916735);
				}

				if (-2013063349 == var8 && null != var7 && null != var7.az_fld) {
					var8 = var0.ai(var7.az_fld, var4, var5, var1, var2, var6, -650039624);
				}

				if (var8 == -975291206) {
					var8 = wp(var0, var4, var5, var1, var2, var6);
				}

				if (null != var7) {
					ef var9 = ei.jq(var7, 93335364);
					if (null != var9) {
						int var10 = bj.ae(var9.ag_fld);
						oe var11 = ko.az(var10);
						var8 -= var11.dw_fld;
					}
				}

				return var8;
			} else {
				return 0;
			}
		} catch (Throwable var13) {
			throw new RuntimeException(var13);
		}
	}

	@ObfuscatedName("getId")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getId() {
		return this.ag_fld;
	}

	@ObfuscatedName("mz")
	@ObfuscatedSignature(
		descriptor = "(Ldx;)V"
	)
	public static void mz(dx var0) {
		for (dr var1 = (dr)var0.ak_fld.aw(); null != var1; var1 = (dr)var0.ak_fld.as()) {
			var1.bm(-331273092);
		}
	}

	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "(J)Lcs;"
	)
	public cs dg(long var1) {
		if (!og.ci_fld.isClientThread()) {
			if (!tf.$assertionsDisabled) {
				throw new AssertionError("must be called on client thread");
			} else {
				throw new IllegalStateException("must be called on client thread");
			}
		} else if ((var1 >> 16 & 7L) != 2L) {
			return null;
		} else {
			int var3 = (int)(var1 >> 0 & 127L);
			int var4 = (int)(var1 >> 7 & 127L);
			int var5 = (int)(var1 >> 14 & 3L);
			int var6 = (int)(var1 >> 20 & 4294967295L);

			for (cs var7 = (cs)this.ai_fld.ui(); var7 != null; var7 = (cs)this.ai_fld.fc()) {
				if (var6 == var7.as_fld && var5 == var7.ag_fld && var3 == var7.av_fld && var4 == var7.ae_fld) {
					return var7;
				}
			}

			return null;
		}
	}

	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		descriptor = "()Lrg;"
	)
	public static rg eg() {
		return (rg)(rg)bw.dk_fld.an_fld.ak(client.es_fld);
	}

	@ObfuscatedName("getSizeY")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getSizeY() {
		return this.aw_fld;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	static void bf(int var0, int var1, int var2, int var3) {
		cv var5 = ot.ef();
		jm var6 = gi.ak(jb.dr_fld, client.aq_fld.av_fld);
		var6.ay_fld.bc(18);
		var6.ay_fld.di(bw.dk_fld.as_fld + var1);
		var6.ay_fld.bw(var0 + bw.dk_fld.ay_fld);
		var6.ay_fld.dy(client.ej_fld.ay(82) ? (client.ej_fld.ay(81) ? 2 : 1) : 0);
		var6.ay_fld.bc(var2);
		var6.ay_fld.bc(var3);
		var6.ay_fld.bw(client.js_fld);
		var6.ay_fld.bc(57);
		var6.ay_fld.bc(0);
		var6.ay_fld.bc(0);
		var6.ay_fld.bc(89);
		var6.ay_fld.bw(var5 == null ? 0 : var5.bo_fld);
		var6.ay_fld.bw(var5 == null ? 0 : var5.bp_fld);
		var6.ay_fld.bc(63);
		client.aq_fld.az(var6);
		client.oq_fld = var0;
		client.or_fld = var1;
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bv() {
		try {
			for (dr var1 = (dr)this.ak_fld.aw(); null != var1; var1 = (dr)this.ak_fld.as()) {
				var1.ak(2087879176);
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("nf")
	@ObfuscatedSignature(
		descriptor = "(I)Lcv;"
	)
	public cv nf(int var1) {
		return ii(this, var1);
	}

	@ObfuscatedName("getInstanceTemplateChunks")
	@ObfuscatedSignature(
		descriptor = "()[[[I"
	)
	@Override
	public int[][][] getInstanceTemplateChunks() {
		return this.tx_fld;
	}

	@ObfuscatedName("mm")
	@ObfuscatedSignature(
		descriptor = "(Lfl;IIII)I"
	)
	public int mm(fl var1, int var2, int var3, int var4, int var5) {
		return this.aa(var1, var2, var3, var4, var5, -1390658086);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lsn;FZ)F"
	)
	static float ag(sn var0, float var1, boolean var2) {
		float var4 = 0.0F;
		if (var0 != null && var0.as() != 0) {
			float var5 = 157988587 * var0.ae_fld[0].ak_fld;
			float var6 = var0.ae_fld[var0.as() - 1].ak_fld * 157988587;
			float var7 = var6 - var5;
			if (0.0F == var7) {
				return var0.ae_fld[0].ag_fld;
			} else {
				float var8 = 0.0F;
				if (var1 > var6) {
					var8 = (var1 - var6) / var7;
				} else {
					var8 = (var1 - var5) / var7;
				}

				float var9 = (int)var8;
				float var10 = Math.abs(var8 - var9);
				float var11 = var10 * var7;
				var9 = Math.abs(1.0F + var9);
				float var12 = var9 / 2.0F;
				float var13 = (int)var12;
				var10 = var12 - var13;
				if (var2) {
					if (sd.ae_fld == var0.az_fld) {
						if (0.0F != var10) {
							var11 += var5;
						} else {
							var11 = var6 - var11;
						}
					} else if (sd.az_fld != var0.az_fld && var0.az_fld != sd.av_fld) {
						if (var0.az_fld == sd.ag_fld) {
							var11 = var5 - var1;
							float var14 = var0.ae_fld[0].az_fld;
							float var15 = var0.ae_fld[0].av_fld;
							var4 = var0.ae_fld[0].ag_fld;
							if (var14 != 0.0F) {
								var4 -= var11 * var15 / var14;
							}

							return var4;
						}
					} else {
						var11 = var6 - var11;
					}
				} else if (sd.ae_fld == var0.av_fld) {
					if (0.0F != var10) {
						var11 = var6 - var11;
					} else {
						var11 += var5;
					}
				} else if (var0.av_fld != sd.az_fld && var0.av_fld != sd.av_fld) {
					if (sd.ag_fld == var0.av_fld) {
						var11 = var1 - var6;
						float var25 = var0.ae_fld[var0.as() - 1].ae_fld;
						float var26 = var0.ae_fld[var0.as() - 1].ah_fld;
						var4 = var0.ae_fld[var0.as() - 1].ag_fld;
						if (0.0F != var25) {
							var4 += var11 * var26 / var25;
						}

						return var4;
					}
				} else {
					var11 += var5;
				}

				var4 = dr.ak(var0, var11);
				if (var2 && sd.av_fld == var0.az_fld) {
					float var27 = var0.ae_fld[var0.as() - 1].ag_fld - var0.ae_fld[0].ag_fld;
					var4 -= var27 * var9;
				} else if (!var2 && sd.av_fld == var0.av_fld) {
					float var16 = var0.ae_fld[var0.as() - 1].ag_fld - var0.ae_fld[0].ag_fld;
					var4 += var9 * var16;
				}

				return var4;
			}
		} else {
			return var4;
		}
	}

	@ObfuscatedName("isTopLevel")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	public boolean isTopLevel() {
		return this.ag_fld == 0;
	}

	@ObfuscatedName("im")
	@ObfuscatedSignature(
		descriptor = "(Ldx;)V"
	)
	public static void im(dx var0) throws EOFException {
		try {
			for (dr var1 = (dr)var0.ak_fld.aw(); null != var1; var1 = (dr)var0.ak_fld.as()) {
				var1.ak(-815767737);
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIILoe;II)V"
	)
	void af(int var1, int var2, int var3, oe var4, int var5, int var6) {
		try {
			if (var4 != null && var4.aq((short)-30355)) {
				int var7 = var4.ao(var5, (byte)-80);
				int var8 = var4.ab(var5, (short)-18559);
				int var9 = kj.aw(var7 + var2);
				int var10 = kj.aw(var3 + var8);
				var2 = kj.aw(var2);
				var3 = kj.aw(var3);
				int var11 = var4.am(314528291).ag_fld * 1077344343;
				int var12 = kj.aw(var4.am(314528291).az_fld * 193667497);
				int var13 = Math.max(kj.aw(var4.am(314528291).ak_fld * 1259083063 - 1), 0);
				if (var4.dy_fld != null) {
					oe var14 = var4.ax((byte)99);
					if (var14 != null) {
						var11 = var14.am(314528291).ag_fld * 1077344343;
						var12 = kj.aw(var14.am(314528291).az_fld * 193667497);
						var13 = Math.max(kj.aw(var4.am(314528291).ak_fld * 1259083063 - 1), 0);
					}
				}

				for (dr var18 = (dr)this.ak_fld.aw(); var18 != null; var18 = (dr)this.ak_fld.as()) {
					if (var18.bz(-2056742092) == var1
						&& var18.ag(-1943871634) == var2
						&& var18.av((byte)-35) == var3
						&& var18.az(1847050581) == var9
						&& var18.ae(2076972079) == var10
						&& dr.bk(var18, (byte)48) == var11
						&& dr.fw(var18, -1451739986) == var12
						&& var18.be((byte)-128) == var13) {
						var18.bm(43953822);
						break;
					}
				}
			}
		} catch (Throwable var15) {
			throw new RuntimeException(var15);
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;Lzo;)Ljava/lang/String;"
	)
	public static String av(CharSequence var0, zo var1) {
		if (var0 == null) {
			return null;
		} else {
			int var3 = 0;
			int var4 = var0.length();

			while (var3 < var4 && nb.az(var0.charAt(var3))) {
				var3++;
			}

			while (var4 > var3 && nb.az(var0.charAt(var4 - 1))) {
				var4--;
			}

			int var5 = var4 - var3;
			if (var5 >= 1 && var5 <= ws.ak(var1)) {
				StringBuilder var6 = new StringBuilder(var5);

				for (int var7 = var3; var7 < var4; var7++) {
					char var8 = var0.charAt(var7);
					if (yg.ag(var8)) {
						char var9;
						switch (var8) {
							case ' ':
							case '-':
							case '_':
							case ' ':
								var9 = '_';
								break;
							case '#':
							case '[':
							case ']':
								var9 = var8;
								break;
							case 'À':
							case 'Á':
							case 'Â':
							case 'Ã':
							case 'Ä':
							case 'à':
							case 'á':
							case 'â':
							case 'ã':
							case 'ä':
								var9 = 'a';
								break;
							case 'Ç':
							case 'ç':
								var9 = 'c';
								break;
							case 'È':
							case 'É':
							case 'Ê':
							case 'Ë':
							case 'è':
							case 'é':
							case 'ê':
							case 'ë':
								var9 = 'e';
								break;
							case 'Í':
							case 'Î':
							case 'Ï':
							case 'í':
							case 'î':
							case 'ï':
								var9 = 'i';
								break;
							case 'Ñ':
							case 'ñ':
								var9 = 'n';
								break;
							case 'Ò':
							case 'Ó':
							case 'Ô':
							case 'Õ':
							case 'Ö':
							case 'ò':
							case 'ó':
							case 'ô':
							case 'õ':
							case 'ö':
								var9 = 'o';
								break;
							case 'Ù':
							case 'Ú':
							case 'Û':
							case 'Ü':
							case 'ù':
							case 'ú':
							case 'û':
							case 'ü':
								var9 = 'u';
								break;
							case 'ß':
								var9 = 'b';
								break;
							case 'ÿ':
							case 'Ÿ':
								var9 = 'y';
								break;
							default:
								var9 = Character.toLowerCase(var8);
						}

						if (var9 != 0) {
							var6.append(var9);
						}
					}
				}

				return var6.length() == 0 ? null : var6.toString();
			} else {
				return null;
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void av(int var1) {
		this.au_fld.as();
		Iterator var2 = this.ax_fld.iterator();

		while (var2.hasNext()) {
			da var3 = (da)(da)var2.next();
			da.xp(var3, 1754164593);
		}
	}

	@ObfuscatedName("players")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/IndexedObjectSet;"
	)
	@Override
	public IndexedObjectSet players() {
		return this.au_fld;
	}

	@ObfuscatedName("ii")
	@ObfuscatedSignature(
		descriptor = "(Ldx;I)Lcv;"
	)
	public static cv ii(dx var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return (cv)(cv)var0.au_fld.ak(var1);
	}

	@ObfuscatedName("wp")
	@ObfuscatedSignature(
		descriptor = "(Ldx;IIIII)I"
	)
	public static int wp(dx var0, int var1, int var2, int var3, int var4, int var5) {
		if (var0 == null) {
			var0.getClass();
		}

		int var7 = var3 & 127;
		int var8 = var4 & 127;
		int var9 = var7 * var0.af_fld[var5][1 + var1][var2] + (128 - var7) * var0.af_fld[var5][var1][var2] >> 7;
		int var10 = (128 - var7) * var0.af_fld[var5][var1][var2 + 1] + var0.af_fld[var5][1 + var1][1 + var2] * var7 >> 7;
		return var8 * var10 + var9 * (128 - var8) >> 7;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void ar(int var1) {
		for (dr var2 = (dr)this.ak_fld.ay(); null != var2; var2 = (dr)this.ak_fld.be()) {
			var2.bm(-902004399);
		}
	}

	@ObfuscatedName("qf")
	@ObfuscatedSignature(
		descriptor = "()Lev;"
	)
	public ev getScene() {
		return this.az_fld;
	}

	@ObfuscatedName("getTileHeights")
	@ObfuscatedSignature(
		descriptor = "()[[[I"
	)
	@Override
	public int[][][] getTileHeights() {
		return this.af_fld;
	}

	@ObfuscatedName("worldEntities")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/IndexedObjectSet;"
	)
	@Override
	public IndexedObjectSet worldEntities() {
		return this.an_fld;
	}

	@ObfuscatedName("qo")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void qo(int var1) {
		this.xn_fld = this.ae_fld;
	}

	@ObfuscatedName("getYellowClickAction")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getYellowClickAction() {
		throw new NoSuchMethodError("sanitized: dead bytecode referenced nonexistent symbol");
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)I"
	)
	int aq(int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7 = var3 & 127;
		int var8 = var4 & 127;
		int var9 = var7 * this.af_fld[var5][1 + var1][var2] + (128 - var7) * this.af_fld[var5][var1][var2] >> 7;
		int var10 = (128 - var7) * this.af_fld[var5][var1][var2 + 1] + this.af_fld[var5][1 + var1][1 + var2] * var7 >> 7;
		return var8 * var10 + var9 * (128 - var8) >> 7;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Lcv;"
	)
	cv aw(int var1, int var2) {
		return (cv)(cv)this.ax_fld.ak(var1);
	}
}
