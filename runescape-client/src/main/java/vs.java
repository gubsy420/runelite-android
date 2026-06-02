import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("vs")
public class vs extends ws {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int af_fld;

	public vs(ws var1) {
		super(var1);
		this.aw_fld = "SwapSongTask";
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(S)Z"
	)
	@Override
	public boolean ak(short var1) {
		if (mb.av_fld.size() > 1 && mb.av_fld.get(0) != null && ((me)mb.av_fld.get(0)).af_fld.ax() && mb.av_fld.get(1) != null && ((me)mb.av_fld.get(1)).af_fld.ax()) {
			me var2 = (me)(me)mb.av_fld.get(0);
			mb.av_fld.set(0, mb.av_fld.get(1));
			mb.av_fld.set(1, var2);
		}

		return true;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	public boolean ag() {
		if (mb.av_fld.size() > 1 && mb.av_fld.get(0) != null && ((me)mb.av_fld.get(0)).af_fld.ax() && mb.av_fld.get(1) != null && ((me)mb.av_fld.get(1)).af_fld.ax()) {
			me var1 = (me)(me)mb.av_fld.get(0);
			mb.av_fld.set(0, mb.av_fld.get(1));
			mb.av_fld.set(1, var1);
		}

		return true;
	}
}
