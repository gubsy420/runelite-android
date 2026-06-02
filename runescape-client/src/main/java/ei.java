import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import net.runelite.api.GroundObject;
import net.runelite.api.Point;
import net.runelite.api.SceneTileModel;
import net.runelite.api.SceneTilePaint;
import net.runelite.api.Tile;
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
	@ObfuscatedGetter(
		intValue = -260411347
	)
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ah_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "[Lfj;"
	)
	fj[] aw_fld = new fj[5];
	@ObfuscatedGetter(
		intValue = 27239911
	)
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
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
	@ObfuscatedGetter(
		intValue = 2017300399
	)
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int af_fld;
	@ObfuscatedGetter(
		intValue = -816512793
	)
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int al_fld;
	@ObfuscatedGetter(
		intValue = -1496728423
	)
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
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
	@ObfuscatedGetter(
		intValue = 1099550597
	)
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int am_fld;
	@ObfuscatedGetter(
		intValue = -1777557551
	)
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ad_fld;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean ao_fld;
	@ObfuscatedGetter(
		intValue = -1823200731
	)
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ax_fld;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] aq_fld = new int[5];
	@ObfuscatedGetter(
		intValue = -498525771
	)
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int at_fld;
	@ObfuscatedGetter(
		intValue = -450662127
	)
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int au_fld;
	@ObfuscatedGetter(
		intValue = -1115731223
	)
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int aj_fld;
	@ObfuscatedGetter(
		intValue = -1149023619
	)
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int bm_fld;
	@ObfuscatedGetter(
		intValue = 2018281467
	)
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ac_fld;
	@ObfuscatedGetter(
		intValue = -1281184533
	)
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ba_fld;

	@ObfuscatedName("jq")
	@ObfuscatedSignature(
		descriptor = "(Lei;I)Lef;"
	)
	public static ef jq(ei var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.ai_fld;
		}
	}

	@ObfuscatedName("getSceneLocation")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/Point;"
	)
	@Override
	public Point getSceneLocation() {
		throw new IllegalStateException();
	}

	@ObfuscatedName("rm")
	@ObfuscatedSignature(
		descriptor = "()Lei;"
	)
	public ei getBridge() {
		return this.bd_fld;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "()[Lfj;"
	)
	public fj[] getGameObjects() {
		return this.aw_fld;
	}

	@ObfuscatedName("ls")
	@ObfuscatedSignature(
		descriptor = "()Lfv;"
	)
	public fv getDecorativeObject() {
		return this.aa_fld;
	}

	@ObfuscatedName("getPlane")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getPlane() {
		return this.af_fld;
	}

	@ObfuscatedName("getRenderLevel")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getRenderLevel() {
		return this.ax_fld;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	static void aq(boolean var0) {
		byte var2 = 0;
		if (!yx.hl()) {
			var2 = 12;
		} else if (og.ci_fld.ib((byte)121) || og.ci_fld.ie(1039039083) || client.ga(og.ci_fld, -1590267322)) {
			var2 = 10;
		}

		jz.ac(var2);
		if (var0) {
			bn.ba_fld = "";
			client.lq();
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

	@ObfuscatedName("xx")
	@ObfuscatedSignature(
		descriptor = "()Lfa;"
	)
	public fa getSceneTilePaint() {
		return this.az_fld;
	}

	@ObfuscatedName("getGroundItems")
	@ObfuscatedSignature(
		descriptor = "()Ljava/util/List;"
	)
	@Override
	public List getGroundItems() {
		throw new IllegalStateException();
	}

	@ObfuscatedName("setSceneTilePaint")
	@ObfuscatedSignature(
		descriptor = "(Lnet/runelite/api/SceneTilePaint;)V"
	)
	@Override
	public void setSceneTilePaint(SceneTilePaint var1) {
		this.az_fld = (fa)var1;
	}

	@ObfuscatedName("vd")
	@ObfuscatedSignature(
		descriptor = "()Lfl;"
	)
	public fl getSceneTileModel() {
		return this.av_fld;
	}

	@ObfuscatedName("getWorldLocation")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/coords/WorldPoint;"
	)
	@Override
	public WorldPoint getWorldLocation() {
		throw new IllegalStateException();
	}

	@ObfuscatedName("gt")
	@ObfuscatedSignature(
		descriptor = "(Luv;I)Z"
	)
	public static boolean gt(uv var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.cp(var1, (byte)52) != null;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()Lef;"
	)
	public ef az() {
		return this.ai_fld;
	}

	@ObfuscatedName("getLocalLocation")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/coords/LocalPoint;"
	)
	@Override
	public LocalPoint getLocalLocation() {
		throw new IllegalStateException();
	}

	@ObfuscatedName("gl")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	static final void gl(int var0, int var1) {
		if (null != client.fv_fld[var0]) {
			if (var1 >= 0 && var1 < client.fv_fld[var0].av(-1091125853)) {
				hx var3 = (hx)(hx)client.fv_fld[var0].ak_fld.get(var1);
				if (var3.ak_fld == -1) {
					jm var4 = gi.ak(jb.bo_fld, client.aq_fld.av_fld);
					var4.ay_fld.bc(3 + iq.bu(var3.az_fld.ak(723574353)));
					var4.ay_fld.bc(var0);
					var4.ay_fld.bw(var1);
					var4.ay_fld.cc(var3.az_fld.ak(347446784), 1529506173);
					client.aq_fld.az(var4);
				}
			}
		}
	}

	@ObfuscatedName("setGroundObject")
	@ObfuscatedSignature(
		descriptor = "(Lnet/runelite/api/GroundObject;)V"
	)
	@Override
	public void setGroundObject(GroundObject var1) {
		this.ai_fld = (ef)var1;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()Lef;"
	)
	public ef av() {
		return this.ai_fld;
	}

	@ObfuscatedName("id")
	@ObfuscatedSignature(
		descriptor = "()Lfs;"
	)
	public fs getWallObject() {
		return this.an_fld;
	}

	@ObfuscatedName("setSceneTileModel")
	@ObfuscatedSignature(
		descriptor = "(Lnet/runelite/api/SceneTileModel;)V"
	)
	@Override
	public void setSceneTileModel(SceneTileModel var1) {
		this.av_fld = (fl)var1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean aw() {
		return this.ar_fld != null && !this.ar_fld.isEmpty();
	}

	ei(int var1, int var2, int var3) {
		this.am_fld = 0;
		this.ax_fld = (this.af_fld = 804464463 * var1) * -1889408957;
		this.al_fld = var2;
		this.au_fld = var3;
	}

	@ObfuscatedName("yk")
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

	@ObfuscatedName("vi")
	@ObfuscatedSignature(
		descriptor = "(Lpp;)[I"
	)
	public static int[] vi(pp var0) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			return var0.ez_fld;
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "()Lef;"
	)
	public ef getGroundObject() {
		return this.ai_fld;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Lef;"
	)
	public ef ak(int var1) {
		return this.ai_fld;
	}
}
