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
				this.al("Attempted to load patches of already loading midiplayer!");
				return true;
			}

			if (var3 != null && !var3.ej_fld) {
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
							var3.ej_fld = true;
							var3.af_fld.av((byte)19);
						}
					} else {
						var1++;
					}
				} catch (Exception var5) {
					gl.ak(null, var5);
					this.al(var5.getMessage());
					return true;
				}
			} else {
				var1++;
			}
		}

		return var1 == mb.av_fld.size();
	}

	@ObfuscatedName("fl")
	@ObfuscatedSignature(
		descriptor = "(Lzg;)V"
	)
	public static void fl(zg var0) {
		var0.ap_fld.clear();
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
				this.al("Attempted to load patches of already loading midiplayer!");
				return true;
			}

			if (var4 != null && !var4.ej_fld) {
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
							var4.ej_fld = true;
							var4.af_fld.av((byte)-105);
						}
					} else {
						var2++;
					}
				} catch (Exception var6) {
					gl.ak(null, var6);
					this.al(var6.getMessage());
					return true;
				}
			} else {
				var2++;
			}
		}

		return var2 == mb.av_fld.size();
	}
}
