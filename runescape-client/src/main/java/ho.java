import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("ho")
public abstract class ho extends vw {
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int bk_fld;

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lib;)V"
	)
	abstract void ay(ib var1);

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lib;B)V"
	)
	abstract void ag(ib var1, byte var2);

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lib;)V"
	)
	abstract void ah(ib var1);

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	abstract void ae(xi var1);

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lmq;)V"
	)
	public static void ak(mq var0) {
		if (!mb.ak_fld.contains(var0)) {
			mb.ak_fld.add(var0);
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	abstract void av(xi var1);

	ho() {
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lib;)V"
	)
	abstract void aw(ib var1);

	@ObfuscatedName("vn")
	@ObfuscatedSignature(
		descriptor = "(Lnj;)Lvc;"
	)
	public static vc vn(nj var0) {
		vc var1 = var0.ak_fld.fn_fld;
		if (var1 == var0.ak_fld) {
			return null;
		} else {
			var1.mq_void();
			return var1;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	abstract void az(xi var1);

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	abstract void ak(xi var1, int var2);

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IZZZZ)Luv;"
	)
	static uv am(int var0, boolean var1, boolean var2, boolean var3, boolean var4) throws EOFException {
		try {
			un var6 = null;
			if (mh.af_fld != null) {
				var6 = new un(var0, mh.af_fld, tw.au_fld[var0], 1000000);
			}

			return new uv(var6, cp.ph_fld, ef.pt_fld, var0, var1, var2, var3, var4, false);
		} catch (Throwable var7) {
			throw new RuntimeException(var7);
		}
	}
}
