import java.io.EOFException;
import java.util.ArrayList;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("va")
public class va extends ws {
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bl_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/ArrayList;"
	)
	ArrayList ak_fld;

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lyz;I)V"
	)
	public static void ak(yz var0) throws EOFException {
		pm.ag(var0, 500000, 475000);
	}

	@ObfuscatedName("xq")
	@ObfuscatedSignature(
		descriptor = "(Lfn;)V"
	)
	public static void xq(fn var0) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.cm_fld = 0;
		var0.cj_fld = null;
	}

	@ObfuscatedName("nm")
	@ObfuscatedSignature(
		descriptor = "(Lpi;)I"
	)
	public static int nm(pi var0) {
		return var0.as_fld;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(S)Z"
	)
	@Override
	public boolean ak(short var1) {
		for (int var2 = 0; var2 < this.ak_fld.size(); var2++) {
			ws var3 = (ws)(ws)this.ak_fld.get(var2);
			if (null == var3) {
				this.ak_fld.remove(var2);
				var2--;
			} else if (var3.ak((short)24244)) {
				if (var3.ay()) {
					ws.dx(this, ws.hs(var3, 1710733461), (byte)-7);
					this.ak_fld.clear();
					return true;
				}

				if (var3.af() != null) {
					this.ak_fld.add(var3.af());
				}

				this.av_fld = var3.av_fld;
				this.ak_fld.remove(var2);
				var2--;
			}
		}

		return this.ak_fld.isEmpty();
	}

	public va(ws var1, ArrayList var2) {
		super(var1);
		this.ak_fld = var2;
		this.aw_fld = "ConcurrentMidiTask";
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	public boolean ag() {
		for (int var1 = 0; var1 < this.ak_fld.size(); var1++) {
			ws var2 = (ws)(ws)this.ak_fld.get(var1);
			if (null == var2) {
				this.ak_fld.remove(var1);
				var1--;
			} else if (var2.ak((short)-2370)) {
				if (var2.ay()) {
					ws.dx(this, ws.hs(var2, 2062521036), (byte)-6);
					this.ak_fld.clear();
					return true;
				}

				if (var2.af() != null) {
					this.ak_fld.add(var2.af());
				}

				this.av_fld = var2.av_fld;
				this.ak_fld.remove(var1);
				var1--;
			}
		}

		return this.ak_fld.isEmpty();
	}
}
