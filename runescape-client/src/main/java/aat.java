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

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lxi;[B)V"
	)
	public void az(xi var1, byte[] var2) {
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

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lxi;[B)V"
	)
	public void ag(xi var1, byte[] var2) {
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

	@ObfuscatedName("un")
	@ObfuscatedSignature(
		descriptor = "(Laat;Lxi;[BI)V"
	)
	public static void un(aat var0, xi var1, byte[] var2, int var3) {
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

	public aat() {
		this(-1, 1000000, 1000000);
	}

	aat(int var1, int var2, int var3) {
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxi;[B)V"
	)
	public void av(xi var1, byte[] var2) {
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

	@ObfuscatedName("uy")
	@ObfuscatedSignature(
		descriptor = "(Luy;Luy;)V"
	)
	public static void uy(uy var0, uy var1) {
		float var2 = var0.to_fld * var1.hj_fld + (var1.cg_fld * var0.cg_fld + var0.an_fld * var1.bf_fld) + var0.jk_fld * var1.qe_fld;
		float var3 = var1.na_fld * var0.jk_fld + (var1.an_fld * var0.cg_fld + var0.an_fld * var1.mp_fld + var1.yo_fld * var0.to_fld);
		float var4 = var0.jk_fld * var1.ql_fld + (var0.cg_fld * var1.to_fld + var0.an_fld * var1.nm_fld + var0.to_fld * var1.ga_fld);
		float var5 = var1.jx_fld * var0.jk_fld + (var0.to_fld * var1.fs_fld + (var1.xn_fld * var0.an_fld + var0.cg_fld * var1.jk_fld));
		float var6 = var1.qe_fld * var0.xn_fld + (var1.hj_fld * var0.nm_fld + (var0.bf_fld * var1.cg_fld + var0.mp_fld * var1.bf_fld));
		float var7 = var0.mp_fld * var1.mp_fld + var1.an_fld * var0.bf_fld + var1.yo_fld * var0.nm_fld + var1.na_fld * var0.xn_fld;
		float var8 = var1.to_fld * var0.bf_fld + var0.mp_fld * var1.nm_fld + var0.nm_fld * var1.ga_fld + var0.xn_fld * var1.ql_fld;
		float var9 = var0.xn_fld * var1.jx_fld + (var1.xn_fld * var0.mp_fld + var1.jk_fld * var0.bf_fld + var0.nm_fld * var1.fs_fld);
		float var10 = var0.fs_fld * var1.qe_fld + (var0.ga_fld * var1.hj_fld + (var1.bf_fld * var0.yo_fld + var1.cg_fld * var0.hj_fld));
		float var11 = var1.an_fld * var0.hj_fld + var0.yo_fld * var1.mp_fld + var0.ga_fld * var1.yo_fld + var0.fs_fld * var1.na_fld;
		float var12 = var0.ga_fld * var1.ga_fld + (var0.yo_fld * var1.nm_fld + var0.hj_fld * var1.to_fld) + var1.ql_fld * var0.fs_fld;
		float var13 = var1.jk_fld * var0.hj_fld + var1.xn_fld * var0.yo_fld + var0.ga_fld * var1.fs_fld + var0.fs_fld * var1.jx_fld;
		float var14 = var1.qe_fld * var0.jx_fld + (var1.hj_fld * var0.ql_fld + (var0.na_fld * var1.bf_fld + var0.qe_fld * var1.cg_fld));
		float var15 = var1.an_fld * var0.qe_fld + var1.mp_fld * var0.na_fld + var0.ql_fld * var1.yo_fld + var1.na_fld * var0.jx_fld;
		float var16 = var1.ql_fld * var0.jx_fld + (var1.nm_fld * var0.na_fld + var0.qe_fld * var1.to_fld + var1.ga_fld * var0.ql_fld);
		float var17 = var0.qe_fld * var1.jk_fld + var1.xn_fld * var0.na_fld + var1.fs_fld * var0.ql_fld + var0.jx_fld * var1.jx_fld;
		var0.cg_fld = var2;
		var0.an_fld = var3;
		var0.to_fld = var4;
		var0.jk_fld = var5;
		var0.bf_fld = var6;
		var0.mp_fld = var7;
		var0.nm_fld = var8;
		var0.xn_fld = var9;
		var0.hj_fld = var10;
		var0.yo_fld = var11;
		var0.ga_fld = var12;
		var0.fs_fld = var13;
		var0.qe_fld = var14;
		var0.na_fld = var15;
		var0.ql_fld = var16;
		var0.jx_fld = var17;
	}

	@ObfuscatedName("ku")
	@ObfuscatedSignature(
		descriptor = "(Lxi;[B)V"
	)
	public void ku(xi var1, byte[] var2) {
		un(this, var1, var2, -1217185927);
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
