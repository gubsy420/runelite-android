import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("vq")
public abstract class vq extends vx {
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public abstract int ah();

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public abstract int ak(int var1);

	@ObfuscatedName("zl")
	@ObfuscatedSignature(
		descriptor = "(Lpp;II)I"
	)
	public static int zl(pp var0, int var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		return my.ag(var0.ep_fld, var1, var2);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public abstract int aw();

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public abstract int ae();

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public abstract int av();

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public abstract int az(int var1);

	vq(int var1, int var2) {
		super(var1, var2);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public abstract int ag(int var1);

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public abstract int ay();

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public abstract int as();

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public abstract int ar();

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public abstract int af();

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lub;II)Lyc;"
	)
	static yc ag(ub var0, int var1, int var2) throws EOFException {
		if (!ms.ar(var0, var1, var2)) {
			return null;
		} else {
			yc var5 = new yc();
			var5.aw_fld = yh.ag_fld;
			var5.ay_fld = yh.az_fld;
			var5.ae_fld = yh.av_fld[0];
			var5.ah_fld = yh.ae_fld[0];
			var5.az_fld = yh.ah_fld[0];
			var5.av_fld = yh.aw_fld[0];
			var5.ag_fld = yh.ay_fld;
			var5.ak_fld = yo.as_fld[0];
			jl.au();
			return var5;
		}
	}
}
