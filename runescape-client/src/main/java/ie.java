import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("ie")
public class ie extends ht {
	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int bi_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	String ag_fld;
	// $VF: synthetic field
	@ObfuscatedName("this$0")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	ia this$0;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int aw_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	@ObfuscatedGetter(
		longValue = -1738948502613052373L
	)
	long ak_fld;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	static int[] ar_fld;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ab_fld;
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bc_fld;
	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int cv_fld;

	ie(ia var1) {
		this.this$0 = var1;
		this.ak_fld = -186047548659460739L;
		this.ag_fld = null;
	}

	@ObfuscatedName("zj")
	@ObfuscatedSignature(
		descriptor = "(Lrg;)I"
	)
	public static int zj(rg var0) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.av_fld.ag();
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	@Override
	void ak(xi var1, int var2) {
		if (var1.cg() != 255) {
			var1.au_fld--;
			this.ak_fld = var1.cu();
		}

		this.ag_fld = var1.cl();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lik;I)V"
	)
	@Override
	void ag(ik var1, int var2) {
		var1.ar(this.ak_fld, this.ag_fld, (byte)48);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Laj;I)V"
	)
	static final void ag(aj var0, int var1) {
		var0.ai_fld = false;
		if (null != var0.aa_fld) {
			var0.aa_fld.aw_fld = 0;
		}

		for (aj var2 = var0.ah(); null != var2; var2 = var0.aw()) {
			if (var1 != -1052960615) {
				return;
			}

			ag(var2, -1052960615);
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	void av(xi var1) {
		if (var1.cg() != 255) {
			var1.au_fld--;
			this.ak_fld = var1.cu();
		}

		this.ag_fld = var1.cl();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	void ae(xi var1) {
		if (var1.cg() != 255) {
			var1.au_fld--;
			this.ak_fld = var1.cu();
		}

		this.ag_fld = var1.cl();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lik;)V"
	)
	@Override
	void ah(ik var1) {
		var1.ar(this.ak_fld, this.ag_fld, (byte)68);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lik;)V"
	)
	@Override
	void aw(ik var1) {
		var1.ar(this.ak_fld, this.ag_fld, (byte)-33);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lik;)V"
	)
	@Override
	void ay(ik var1) {
		var1.ar(this.ak_fld, this.ag_fld, (byte)42);
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(Ldx;I)V"
	)
	static void cr(dx var0) throws EOFException {
		try {
			if (by.mg_fld != null && client.oz_fld > 0) {
				int var2 = client.op_fld * 642440832;
				ud.ca(var0, var2, by.mg_fld);
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("ls")
	@ObfuscatedSignature(
		descriptor = "(Luu;)V"
	)
	public static void ls(uu var0) {
		if (var0.as_fld != null) {
			try {
				var0.as_fld.ah((byte)90);
			} catch (Exception var2) {
			}

			var0.as_fld = null;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	void az(xi var1) {
		if (var1.cg() != 255) {
			var1.au_fld--;
			this.ak_fld = var1.cu();
		}

		this.ag_fld = var1.cl();
	}
}
