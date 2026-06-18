import java.util.ArrayList;
import java.util.List;
import net.runelite.api.GroundObject;
import net.runelite.api.Point;
import net.runelite.api.SceneTileModel;
import net.runelite.api.SceneTilePaint;
import net.runelite.api.Tile;
import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;

@ObfuscatedName("ei")
@Implements({"Tile"})
public class ei extends vw implements Tile {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	public fl av_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ag_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lfa;"
	)
	public fa az_fld;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean ab_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Len;"
	)
	en ae_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -260411347
	)
	int ah_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "[Lfj;"
	)
	fj[] aw_fld = new fj[5];
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 27239911
	)
	int ay_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ak_fld;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/ArrayList;"
	)
	ArrayList ar_fld = null;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 2017300399
	)
	int af_fld;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -816512793
	)
	int al_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1496728423
	)
	int as_fld;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "Lei;"
	)
	ei bd_fld;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lfs;"
	)
	fs an_fld;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean ap_fld;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lef;"
	)
	ef ai_fld;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	fv aa_fld;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1099550597
	)
	int am_fld;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1777557551
	)
	int ad_fld;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean ao_fld;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1823200731
	)
	int ax_fld;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] aq_fld = new int[5];
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -498525771
	)
	int at_fld;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -450662127
	)
	int au_fld;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1115731223
	)
	int aj_fld;
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1149023619
	)
	int bm_fld;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 2018281467
	)
	int ac_fld;
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1281184533
	)
	static int ba_fld;

	@ObfuscatedName("zn")
	@ObfuscatedSignature(
		descriptor = "(Lrg;I)V"
	)
	public static void zn(rg var0, int var1) {
		if (-329576718 * var0.as_fld == 0) {
			var0.ad(var0.ay_fld[0].ak_fld, (byte)5);
		} else {
			if (!var0.ax_fld) {
				var0.au_fld.ak(var0.av_fld, var0.ay_fld[0], var1, 364480518);
				var0.ax_fld = true;
			}

			if (var0.au_fld.ag(var0.av_fld, var1, var0.as_fld, -1279780231)) {
				var0.as_fld--;
				var0.ax_fld = false;
			}
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ZB)V"
	)
	static void aq(boolean var0) {
		byte var2 = 0;
		if (!yx.hl()) {
			var2 = 12;
		} else if (client.de(og.ci_fld, (byte)121) || og.ci_fld.ie(1039039083) || og.ci_fld.iz(-1590267322)) {
			var2 = 10;
		}

		jz.ac(var2);
		if (var0) {
			bn.ba_fld = "";
			client.og();
			bn.bq_fld = "";
			pe.cc_fld = 0;
			he.cq_fld = "";
		}

		bw.ah(-1914089189);
		if (client.dq_fld && null != bn.ba_fld && !bn.ba_fld.isEmpty()) {
			bn.dz_fld = 1451298735;
		} else {
			bn.dz_fld = 0;
		}
	}

	@ObfuscatedName("yc")
	@ObfuscatedSignature(
		descriptor = "()Lfl;"
	)
	public fl getSceneTileModel() {
		return this.av_fld;
	}

	@ObfuscatedName("setSceneTilePaint")
	@ObfuscatedSignature(
		descriptor = "(Lnet/runelite/api/SceneTilePaint;)V"
	)
	@Export("setSceneTilePaint")
	@Override
	public void setSceneTilePaint(SceneTilePaint var1) {
		this.az_fld = (fa)var1;
	}

	@ObfuscatedName("getRenderLevel")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getRenderLevel")
	@Override
	public int getRenderLevel() {
		return this.ax_fld;
	}

	@ObfuscatedName("xn")
	@ObfuscatedSignature(
		descriptor = "()Lfv;"
	)
	public fv getDecorativeObject() {
		return this.aa_fld;
	}

	@ObfuscatedName("ni")
	@ObfuscatedSignature(
		descriptor = "()[Lfj;"
	)
	public fj[] getGameObjects() {
		return this.aw_fld;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()Lef;"
	)
	public ef az() {
		return this.ai_fld;
	}

	@ObfuscatedName("mf")
	@ObfuscatedSignature(
		descriptor = "()Lfs;"
	)
	public fs getWallObject() {
		return this.an_fld;
	}

	@ObfuscatedName("wt")
	@ObfuscatedSignature(
		descriptor = "(Lei;)Lef;"
	)
	public static ef wt(ei var0) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.ai_fld;
	}

	@ObfuscatedName("getGroundItems")
	@ObfuscatedSignature(
		descriptor = "()Ljava/util/List;"
	)
	@Export("getGroundItems")
	@Override
	public List getGroundItems() {
		throw new IllegalStateException();
	}

	@ObfuscatedName("getPlane")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getPlane")
	@Override
	public int getPlane() {
		return this.af_fld;
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "()Lfa;"
	)
	public fa getSceneTilePaint() {
		return this.az_fld;
	}

	@ObfuscatedName("gl")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	static final void gl(int var0, int var1) {
		if (null != client.fv_fld[var0]) {
			if (var1 >= 0 && var1 < client.fv_fld[var0].av(-1091125853)) {
				hx var3 = (hx)(hx)client.fv_fld[var0].ak_fld.get(var1);
				if (var3.ak_fld == -1) {
					jm var4 = gi.ak(jb.bo_fld, client.appletStub.av_fld);
					var4.ay_fld.ea(3 + iq.bu(var3.az_fld.ak(723574353)));
					var4.ay_fld.ea(var0);
					xi.vy(var4.ay_fld, var1);
					xi.ph(var4.ay_fld, var3.az_fld.ak(347446784), 1529506173);
					client.appletStub.az(var4);
				}
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()Lef;"
	)
	public ef ae() {
		return this.ai_fld;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean ah() {
		return this.ar_fld != null && !this.ar_fld.isEmpty();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean aw() {
		return this.ar_fld != null && !this.ar_fld.isEmpty();
	}

	@ObfuscatedName("xu")
	@ObfuscatedSignature(
		descriptor = "()Lei;"
	)
	public ei getBridge() {
		return this.bd_fld;
	}

	@ObfuscatedName("setGroundObject")
	@ObfuscatedSignature(
		descriptor = "(Lnet/runelite/api/GroundObject;)V"
	)
	@Export("setGroundObject")
	@Override
	public void setGroundObject(GroundObject var1) {
		this.ai_fld = (ef)var1;
	}

	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "(Lei;I)Lef;"
	)
	public static ef dm(ei var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.ai_fld;
	}

	@ObfuscatedName("getLocalLocation")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/coords/LocalPoint;"
	)
	@Export("getLocalLocation")
	@Override
	public LocalPoint getLocalLocation() {
		throw new IllegalStateException();
	}

	@ObfuscatedName("getSceneLocation")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/Point;"
	)
	@Export("getSceneLocation")
	@Override
	public Point getSceneLocation() {
		throw new IllegalStateException();
	}

	@ObfuscatedName("getWorldLocation")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/coords/WorldPoint;"
	)
	@Export("getWorldLocation")
	@Override
	public WorldPoint getWorldLocation() {
		throw new IllegalStateException();
	}

	ei(int var1, int var2, int var3) {
		this.am_fld = 0;
		this.ax_fld = (this.af_fld = 804464463 * var1) * -1889408957;
		this.al_fld = var2;
		this.au_fld = var3;
	}

	@ObfuscatedName("nu")
	@ObfuscatedSignature(
		descriptor = "()Lef;"
	)
	public ef getGroundObject() {
		return this.ai_fld;
	}

	@ObfuscatedName("gg")
	@ObfuscatedSignature(
		descriptor = "()Len;"
	)
	public en getItemLayer() {
		return this.ae_fld;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean ag(int var1) {
		return this.ar_fld != null && !this.ar_fld.isEmpty();
	}

	@ObfuscatedName("setSceneTileModel")
	@ObfuscatedSignature(
		descriptor = "(Lnet/runelite/api/SceneTileModel;)V"
	)
	@Export("setSceneTileModel")
	@Override
	public void setSceneTileModel(SceneTileModel var1) {
		this.av_fld = (fl)var1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Lef;"
	)
	public ef ak(int var1) {
		return this.ai_fld;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()Lef;"
	)
	public ef av() {
		return this.ai_fld;
	}
}
