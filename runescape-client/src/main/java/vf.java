import java.io.EOFException;
import java.util.Iterator;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("vf")
public class vf extends ws {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	ub az_fld;
	@ObfuscatedName("mm")
	@ObfuscatedSignature(
		descriptor = "Lyv;"
	)
	static yv mm_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	ub ag_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	ub ak_fld;

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	public boolean ag() {
		int var1 = 0;
		Iterator var2 = mb.av_fld.iterator();

		while (var2.hasNext()) {
			me var3 = (me)(me)var2.next();
			if (var3 != null && -1034371599 * var3.af_fld.aw_fld > 1 && var3.af_fld.an()) {
				ws.dx(this, "Attempted to load patches of already loading midiplayer!", (byte)-94);
				return true;
			}

			if (var3 != null && !var3.aw_fld) {
				try {
					if (null != var3.ak_fld && var3.ag_fld != -1 && var3.az_fld != -1) {
						if (null == var3.au_fld) {
							var3.au_fld = mz.ak(var3.ak_fld, var3.ag_fld * 581803762, var3.az_fld * 758724076);
							if (var3.au_fld == null) {
								continue;
							}
						}

						if (var3.al_fld == null) {
							var3.al_fld = new ap(this.az_fld, this.ag_fld);
						}

						if (var3.af_fld.az(var3.au_fld, this.ak_fld, var3.al_fld)) {
							var1++;
							var3.aw_fld = true;
							var3.af_fld.ae((byte)19);
						}
					} else {
						var1++;
					}
				} catch (Exception var5) {
					gl.ak(null, var5);
					ws.dx(this, var5.getMessage(), (byte)-100);
					return true;
				}
			} else {
				var1++;
			}
		}

		return var1 == mb.av_fld.size();
	}

	@ObfuscatedName("gp")
	@ObfuscatedSignature(
		descriptor = "(Lyi;Ljava/lang/Long;Lxi;)V"
	)
	public static void gp(yi var0, Long var1, xi var2) {
		if (var0 == null) {
			var0.getClass();
		}

		var2.ft(var1);
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(Lol;Lfn;I)Lfn;"
	)
	public static fn ck(ol var0, fn var1, int var2) throws EOFException {
		if (var0 == null) {
			var0.getClass();
		}

		if (!var0.aa(1756849141)) {
			var2 = var0.bk_fld[var2];
			fe var9 = gz.ag(var2 >> 16);
			var2 &= -556022227;
			if (var9 == null) {
				return var1.as(true);
			} else {
				fn var10 = var1.as(!var9.ag(var2));
				var10.bm(var9, var2);
				return var10;
			}
		} else {
			int var4 = var0.br_fld * -220635486;
			sp var6 = (sp)ol.bd_fld.ak(var4);
			sp var5;
			if (var6 != null) {
				var5 = var6;
			} else {
				var6 = ld.ak(mc.at_fld, pm.ac_fld, var4);
				if (var6 != null) {
					ol.bd_fld.az(var6, var4);
				}

				var5 = var6;
			}

			sp var3;
			if (var5 != null && sp.sp(var5, -2065362513)) {
				var3 = var5;
			} else {
				var3 = null;
			}

			if (var3 == null) {
				return var1.as(true);
			} else {
				fn var12 = var1.as(!var3.ah());
				var12.bd(var3, var2);
				return var12;
			}
		}
	}

	public vf(ws var1, ub var2, ub var3, ub var4) {
		super(var1);
		this.ak_fld = var2;
		this.ag_fld = var3;
		this.az_fld = var4;
		this.aw_fld = "LoadSongTask";
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(S)Z"
	)
	@Override
	public boolean ak(short var1) {
		int var2 = 0;
		Iterator var3 = mb.av_fld.iterator();

		while (var3.hasNext()) {
			me var4 = (me)(me)var3.next();
			if (var4 != null && -1034371599 * var4.af_fld.aw_fld > 1 && var4.af_fld.an()) {
				ws.dx(this, "Attempted to load patches of already loading midiplayer!", (byte)-101);
				return true;
			}

			if (var4 != null && !var4.aw_fld) {
				try {
					if (null != var4.ak_fld && var4.ag_fld != -1 && var4.az_fld != -1) {
						if (null == var4.au_fld) {
							var4.au_fld = mz.ak(var4.ak_fld, var4.ag_fld, var4.az_fld);
							if (var4.au_fld == null) {
								continue;
							}
						}

						if (var4.al_fld == null) {
							var4.al_fld = new ap(this.az_fld, this.ag_fld);
						}

						if (var4.af_fld.az(var4.au_fld, this.ak_fld, var4.al_fld)) {
							var2++;
							var4.aw_fld = true;
							var4.af_fld.ae((byte)-105);
						}
					} else {
						var2++;
					}
				} catch (Exception var6) {
					gl.ak(null, var6);
					ws.dx(this, var6.getMessage(), (byte)-28);
					return true;
				}
			} else {
				var2++;
			}
		}

		return var2 == mb.av_fld.size();
	}
}
