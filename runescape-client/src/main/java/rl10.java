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

@ObfuscatedName("rl10")
@Implements({"Tile"})
public class rl10 implements Tile {
	@ObfuscatedName("vn")
	@ObfuscatedSignature(
		descriptor = "Lev;"
	)
	public ev vn_fld;
	@ObfuscatedName("xo")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 5
	)
	public int xo_fld;
	@ObfuscatedName("ru")
	@ObfuscatedSignature(
		descriptor = "Lrl10;"
	)
	public rl10 ru_fld;

	@ObfuscatedName("getLocalLocation")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/coords/LocalPoint;"
	)
	@Export("getLocalLocation")
	@Override
	public LocalPoint getLocalLocation() {
		int var1 = this.xo_fld >> this.vn_fld.ph_fld & this.vn_fld.sz_fld;
		int var2 = this.xo_fld & this.vn_fld.up_int;
		var1 -= this.vn_fld.qr_fld;
		var2 -= this.vn_fld.qr_fld;
		return LocalPoint.fromScene(var1, var2, this.vn_fld);
	}

	@ObfuscatedName("ya")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ya() {
		return this.vn_fld.pc_fld[this.xo_fld];
	}

	@ObfuscatedName("ia")
	@ObfuscatedSignature(
		descriptor = "()Lfv;"
	)
	public fv getDecorativeObject() {
		return this.vn_fld.pu_Arrfv[this.xo_fld];
	}

	@ObfuscatedName("wa")
	@ObfuscatedSignature(
		descriptor = "()Lrl10;"
	)
	public rl10 getBridge() {
		return this.ru_fld;
	}

	@ObfuscatedName("ps")
	@ObfuscatedSignature(
		descriptor = "()Len;"
	)
	public en getItemLayer() {
		return this.vn_fld.oy_fld[this.xo_fld];
	}

	@ObfuscatedName("getRenderLevel")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getRenderLevel")
	@Override
	public int getRenderLevel() {
		return this.vn_fld.df(this.xo_fld);
	}

	@ObfuscatedName("setSceneTilePaint")
	@ObfuscatedSignature(
		descriptor = "(Lnet/runelite/api/SceneTilePaint;)V"
	)
	@Export("setSceneTilePaint")
	@Override
	public void setSceneTilePaint(SceneTilePaint var1) {
		this.vn_fld.of_fld[this.xo_fld] = (fa)var1;
	}

	@ObfuscatedName("ex")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ex() {
		int var1 = this.xo_fld >> this.vn_fld.ph_fld & this.vn_fld.sz_fld;
		return var1 - this.vn_fld.qr_fld;
	}

	@ObfuscatedName("of")
	@ObfuscatedSignature(
		descriptor = "()[Lfj;"
	)
	public fj[] getGameObjects() {
		return new fj[]{
			this.vn_fld.sd_fld[this.xo_fld + 0],
			this.vn_fld.sd_fld[this.xo_fld + 1],
			this.vn_fld.sd_fld[this.xo_fld + 2],
			this.vn_fld.sd_fld[this.xo_fld + 3],
			this.vn_fld.sd_fld[this.xo_fld + 4]
		};
	}

	@ObfuscatedName("setSceneTileModel")
	@ObfuscatedSignature(
		descriptor = "(Lnet/runelite/api/SceneTileModel;)V"
	)
	@Export("setSceneTileModel")
	@Override
	public void setSceneTileModel(SceneTileModel var1) {
		this.vn_fld.lh_fld[this.xo_fld] = (fl)var1;
	}

	@ObfuscatedName("getSceneLocation")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/Point;"
	)
	@Export("getSceneLocation")
	@Override
	public Point getSceneLocation() {
		int var1 = this.xo_fld >> this.vn_fld.ph_fld & this.vn_fld.sz_fld;
		int var2 = this.xo_fld & this.vn_fld.up_int;
		var1 -= this.vn_fld.qr_fld;
		var2 -= this.vn_fld.qr_fld;
		return new Point(var1, var2);
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ci() {
		int var1 = this.xo_fld & this.vn_fld.up_int;
		return var1 - this.vn_fld.qr_fld;
	}

	@ObfuscatedName("setGroundObject")
	@ObfuscatedSignature(
		descriptor = "(Lnet/runelite/api/GroundObject;)V"
	)
	@Export("setGroundObject")
	@Override
	public void setGroundObject(GroundObject var1) {
		this.vn_fld.gk_fld[this.xo_fld] = (ef)var1;
		if (var1 == null) {
			this.vn_fld.pg_fld[this.xo_fld] = this.vn_fld.pg_fld[this.xo_fld] & -2049;
		} else {
			this.vn_fld.pg_fld[this.xo_fld] = this.vn_fld.pg_fld[this.xo_fld] | 2048;
		}
	}

	@ObfuscatedName("un")
	@ObfuscatedSignature(
		descriptor = "()Lef;"
	)
	public ef getGroundObject() {
		return this.vn_fld.gk_fld[this.xo_fld];
	}

	@ObfuscatedName("getPlane")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getPlane")
	@Override
	public int getPlane() {
		return this.xo_fld >> this.vn_fld.zc_fld & 3;
	}

	@ObfuscatedName("rs")
	@ObfuscatedSignature(
		descriptor = "()Lfa;"
	)
	public fa getSceneTilePaint() {
		return this.vn_fld.of_fld[this.xo_fld];
	}

	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "()Lfl;"
	)
	public fl getSceneTileModel() {
		return this.vn_fld.lh_fld[this.xo_fld];
	}

	@ObfuscatedName("getGroundItems")
	@ObfuscatedSignature(
		descriptor = "()Ljava/util/List;"
	)
	@Export("getGroundItems")
	@Override
	public List getGroundItems() {
		en var1 = this.getItemLayer();
		if (var1 == null) {
			return null;
		} else {
			ArrayList var2 = new ArrayList();

			for (Object var3 = var1.getTop(); var3 instanceof dw; var3 = ((vw)var3).getNext()) {
				var2.add((dw)var3);
			}

			return var2;
		}
	}

	@ObfuscatedName("getWorldLocation")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/coords/WorldPoint;"
	)
	@Export("getWorldLocation")
	@Override
	public WorldPoint getWorldLocation() {
		int var1 = this.xo_fld >> this.vn_fld.zc_fld & 3;
		int var2 = this.xo_fld >> this.vn_fld.ph_fld & this.vn_fld.sz_fld;
		int var3 = this.xo_fld & this.vn_fld.up_int;
		var2 -= this.vn_fld.qr_fld;
		var3 -= this.vn_fld.qr_fld;
		dx var4 = this.vn_fld.fb_fld;
		return WorldPoint.fromScene(var4, var2, var3, var1);
	}

	@ObfuscatedName("ux")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ux() {
		return this.vn_fld.pi(this.xo_fld);
	}

	@ObfuscatedName("sb")
	@ObfuscatedSignature(
		descriptor = "()Lfs;"
	)
	public fs getWallObject() {
		return this.vn_fld.xv_fld[this.xo_fld];
	}

	public rl10(ev var1, int var2) {
		this.vn_fld = var1;
		this.xo_fld = var2;
	}
}
