import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("uq")
public class uq {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Luq;"
	)
	public uq av_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Luq;"
	)
	public uq ae_fld;

	@ObfuscatedName("yb")
	@ObfuscatedSignature(
		descriptor = "()Luq;"
	)
	public uq yb() {
		return this.ae_fld;
	}

	@ObfuscatedName("um")
	@ObfuscatedSignature(
		descriptor = "(Lol;Lfn;I)Lfn;"
	)
	public static fn um(ol var0, fn var1, int var2) throws EOFException {
		if (var0 == null) {
			var0.getClass();
		}

		if (!var0.aa(81749609)) {
			var2 = var0.bk_fld[var2];
			fe var7 = gz.ag(var2 >> 16);
			var2 &= 65535;
			if (null == var7) {
				return var1.ay(true);
			} else {
				fn var8 = var1.ay(!var7.ag(var2));
				var8.bm(var7, var2);
				return var8;
			}
		} else {
			sp var3 = mb.av(184352143 * var0.br_fld);
			if (var3 == null) {
				return var1.ay(true);
			} else {
				fn var4 = var1.ay(!var3.ah());
				var4.bd(var3, var2);
				return var4;
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void az() {
		xr(this);
	}

	@ObfuscatedName("ex")
	@ObfuscatedSignature(
		descriptor = "()Luq;"
	)
	public uq ex() {
		return this.av_fld;
	}

	@ObfuscatedName("xs")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void xs() {
		if (this.av_fld != null) {
			this.av_fld.ae_fld = this.ae_fld;
			this.ae_fld.av_fld = this.av_fld;
			this.ae_fld = null;
			this.av_fld = null;
		}
	}

	@ObfuscatedName("xr")
	@ObfuscatedSignature(
		descriptor = "(Luq;)V"
	)
	public static void xr(uq var0) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var0.av_fld != null) {
			var0.av_fld.ae_fld = var0.ae_fld;
			var0.ae_fld.av_fld = var0.av_fld;
			var0.ae_fld = null;
			var0.av_fld = null;
		}
	}

	public uq() {
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ak() {
		if (this.av_fld != null) {
			this.av_fld.ae_fld = this.ae_fld;
			this.ae_fld.av_fld = this.av_fld;
			this.ae_fld = null;
			this.av_fld = null;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ag() {
		if (this.av_fld != null) {
			this.av_fld.av_fld = this.av_fld;
			this.ae_fld.ae_fld = this.av_fld;
			this.av_fld = null;
			this.av_fld = null;
		}
	}
}
