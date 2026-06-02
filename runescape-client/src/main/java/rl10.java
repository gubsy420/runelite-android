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

@ObfuscatedName("rl10")
@Implements({"Tile"})
public class rl10 implements Tile {
	@ObfuscatedName("zb")
	@ObfuscatedSignature(
		descriptor = "Lev;"
	)
	public ev zb_fld;
	@ObfuscatedName("gx")
	@ObfuscatedSignature(
		descriptor = "Lrl10;"
	)
	public rl10 gx_fld;
	@ObfuscatedGetter(
		intValue = 5
	)
	@ObfuscatedName("xq")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int xq_fld;

	@ObfuscatedName("kj")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int kj() {
		int var1 = this.xq_fld & this.zb_fld.ul_fld;
		return var1 - this.zb_fld.jh_fld;
	}

	@ObfuscatedName("ki")
	@ObfuscatedSignature(
		descriptor = "(Lda;)Lll;"
	)
	public static ll ki(da var0) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.cg_fld.ak_fld;
	}

	@ObfuscatedName("wx")
	@ObfuscatedSignature(
		descriptor = "()Lfl;"
	)
	public fl getSceneTileModel() {
		return this.zb_fld.fr_fld[this.xq_fld];
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()Lfa;"
	)
	public fa getSceneTilePaint() {
		return this.zb_fld.oy_fld[this.xq_fld];
	}

	@ObfuscatedName("wi")
	@ObfuscatedSignature(
		descriptor = "()[Lfj;"
	)
	public fj[] getGameObjects() {
		return new fj[]{
			this.zb_fld.vh_fld[this.xq_fld + 0],
			this.zb_fld.vh_fld[this.xq_fld + 1],
			this.zb_fld.vh_fld[this.xq_fld + 2],
			this.zb_fld.vh_fld[this.xq_fld + 3],
			this.zb_fld.vh_fld[this.xq_fld + 4]
		};
	}

	@ObfuscatedName("getGroundItems")
	@ObfuscatedSignature(
		descriptor = "()Ljava/util/List;"
	)
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

	@ObfuscatedName("setGroundObject")
	@ObfuscatedSignature(
		descriptor = "(Lnet/runelite/api/GroundObject;)V"
	)
	@Override
	public void setGroundObject(GroundObject var1) {
		this.zb_fld.kg_fld[this.xq_fld] = (ef)var1;
		if (var1 == null) {
			this.zb_fld.wf_fld[this.xq_fld] = this.zb_fld.wf_fld[this.xq_fld] & -2049;
		} else {
			this.zb_fld.wf_fld[this.xq_fld] = this.zb_fld.wf_fld[this.xq_fld] | 2048;
		}
	}

	@ObfuscatedName("getLocalLocation")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/coords/LocalPoint;"
	)
	@Override
	public LocalPoint getLocalLocation() {
		int var1 = this.xq_fld >> this.zb_fld.lo_fld & this.zb_fld.rl_fld;
		int var2 = this.xq_fld & this.zb_fld.ul_fld;
		var1 -= this.zb_fld.jh_fld;
		var2 -= this.zb_fld.jh_fld;
		return LocalPoint.fromScene(var1, var2, this.zb_fld);
	}

	@ObfuscatedName("getRenderLevel")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getRenderLevel() {
		return this.zb_fld.ya(this.xq_fld);
	}

	@ObfuscatedName("getSceneLocation")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/Point;"
	)
	@Override
	public Point getSceneLocation() {
		int var1 = this.xq_fld >> this.zb_fld.lo_fld & this.zb_fld.rl_fld;
		int var2 = this.xq_fld & this.zb_fld.ul_fld;
		var1 -= this.zb_fld.jh_fld;
		var2 -= this.zb_fld.jh_fld;
		return new Point(var1, var2);
	}

	@ObfuscatedName("setSceneTileModel")
	@ObfuscatedSignature(
		descriptor = "(Lnet/runelite/api/SceneTileModel;)V"
	)
	@Override
	public void setSceneTileModel(SceneTileModel var1) {
		this.zb_fld.fr_fld[this.xq_fld] = (fl)var1;
	}

	@ObfuscatedName("yr")
	@ObfuscatedSignature(
		descriptor = "()Len;"
	)
	public en getItemLayer() {
		return this.zb_fld.ee_fld[this.xq_fld];
	}

	@ObfuscatedName("zx")
	@ObfuscatedSignature(
		descriptor = "()Lrl10;"
	)
	public rl10 getBridge() {
		return this.gx_fld;
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "()Lef;"
	)
	public ef getGroundObject() {
		return this.zb_fld.kg_fld[this.xq_fld];
	}

	@ObfuscatedName("getPlane")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getPlane() {
		return this.xq_fld >> this.zb_fld.ha_fld & 3;
	}

	@ObfuscatedName("ou")
	@ObfuscatedSignature(
		descriptor = "()Lfs;"
	)
	public fs getWallObject() {
		return this.zb_fld.rs_fld[this.xq_fld];
	}

	@ObfuscatedName("ti")
	@ObfuscatedSignature(
		descriptor = "()Lfv;"
	)
	public fv getDecorativeObject() {
		return this.zb_fld.ow_fld[this.xq_fld];
	}

	@ObfuscatedName("setSceneTilePaint")
	@ObfuscatedSignature(
		descriptor = "(Lnet/runelite/api/SceneTilePaint;)V"
	)
	@Override
	public void setSceneTilePaint(SceneTilePaint var1) {
		this.zb_fld.oy_fld[this.xq_fld] = (fa)var1;
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int cu() {
		return this.zb_fld.tx(this.xq_fld);
	}

	@ObfuscatedName("getWorldLocation")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/coords/WorldPoint;"
	)
	@Override
	public WorldPoint getWorldLocation() {
		int var1 = this.xq_fld >> this.zb_fld.ha_fld & 3;
		int var2 = this.xq_fld >> this.zb_fld.lo_fld & this.zb_fld.rl_fld;
		int var3 = this.xq_fld & this.zb_fld.ul_fld;
		var2 -= this.zb_fld.jh_fld;
		var3 -= this.zb_fld.jh_fld;
		dx var4 = this.zb_fld.fj_fld;
		return WorldPoint.fromScene(var4, var2, var3, var1);
	}

	@ObfuscatedName("ne")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ne() {
		int var1 = this.xq_fld >> this.zb_fld.lo_fld & this.zb_fld.rl_fld;
		return var1 - this.zb_fld.jh_fld;
	}

	@ObfuscatedName("tl")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int tl() {
		return this.zb_fld.ib_fld[this.xq_fld];
	}

	public rl10(ev var1, int var2) {
		this.zb_fld = var1;
		this.xq_fld = var2;
	}
}
