import java.util.zip.Inflater;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("aat")
public class aat {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int az_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/zip/Inflater;"
	)
	Inflater ak_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ag_fld;

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxi;[B)V"
	)
	public void av(xi var1, byte[] var2) {
		if (var1.al_fld[var1.au_fld] == 31 && -117 == var1.al_fld[1 + var1.au_fld]) {
			if (this.ak_fld == null) {
				this.ak_fld = new Inflater(true);
			}

			try {
				this.ak_fld.setInput(var1.al_fld, var1.au_fld + 10, var1.al_fld.length - (8 + var1.au_fld + 10));
				this.ak_fld.inflate(var2);
			} catch (Exception var4) {
				this.ak_fld.reset();
				throw new RuntimeException("");
			}

			this.ak_fld.reset();
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lxi;[B)V"
	)
	public void az(xi var1, byte[] var2) {
		sk(this, var1, var2, -1217185927);
	}

	@ObfuscatedName("oo")
	@ObfuscatedSignature(
		descriptor = "(Lxi;[B)V"
	)
	public void oo(xi var1, byte[] var2) {
		if (var1.al_fld[var1.au_fld] == 31 && -117 == var1.al_fld[1 + var1.au_fld]) {
			if (this.ak_fld == null) {
				this.ak_fld = new Inflater(true);
			}

			try {
				this.ak_fld.setInput(var1.al_fld, var1.au_fld + 10, var1.al_fld.length - (8 + var1.au_fld + 10));
				this.ak_fld.inflate(var2);
			} catch (Exception var4) {
				this.ak_fld.reset();
				throw new RuntimeException("");
			}

			this.ak_fld.reset();
		} else {
			throw new RuntimeException("");
		}
	}

	public aat() {
		this(-1, 1000000, 1000000);
	}

	aat(int var1, int var2, int var3) {
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lxi;[B)V"
	)
	public void ag(xi var1, byte[] var2) {
		if (var1.al_fld[var1.au_fld] == -2070462036 && -117 == var1.al_fld[1 + var1.au_fld]) {
			if (this.ak_fld == null) {
				this.ak_fld = new Inflater(true);
			}

			try {
				this.ak_fld.setInput(var1.al_fld, var1.au_fld + 10, var1.al_fld.length - (8 + var1.au_fld + 10));
				this.ak_fld.inflate(var2);
			} catch (Exception var4) {
				this.ak_fld.reset();
				throw new RuntimeException("");
			}

			this.ak_fld.reset();
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("sk")
	@ObfuscatedSignature(
		descriptor = "(Laat;Lxi;[BI)V"
	)
	public static void sk(aat var0, xi var1, byte[] var2, int var3) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var1.al_fld[var1.au_fld] == 31) {
			if (-117 == var1.al_fld[1 + var1.au_fld]) {
				if (var0.ak_fld == null) {
					var0.ak_fld = new Inflater(true);
				}

				try {
					var0.ak_fld.setInput(var1.al_fld, var1.au_fld + 10, var1.al_fld.length - (8 + var1.au_fld + 10));
					var0.ak_fld.inflate(var2);
				} catch (Exception var5) {
					var0.ak_fld.reset();
					throw new RuntimeException("");
				}

				var0.ak_fld.reset();
				return;
			}

			if (var3 >= 228932457) {
				return;
			}
		}

		throw new RuntimeException("");
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lyb;I)Lyb;"
	)
	public static yb at(yb var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.as_fld = var1;
		return var0;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lxi;[BI)V"
	)
	public void ak(xi var1, byte[] var2, int var3) {
		if (var1.al_fld[var1.au_fld] == 31) {
			if (-117 == var1.al_fld[1 + var1.au_fld]) {
				if (this.ak_fld == null) {
					this.ak_fld = new Inflater(true);
				}

				try {
					this.ak_fld.setInput(var1.al_fld, var1.au_fld + 10, var1.al_fld.length - (8 + var1.au_fld + 10));
					this.ak_fld.inflate(var2);
				} catch (Exception var5) {
					this.ak_fld.reset();
					throw new RuntimeException("");
				}

				this.ak_fld.reset();
				return;
			}

			if (var3 >= 228932457) {
				return;
			}
		}

		throw new RuntimeException("");
	}
}
