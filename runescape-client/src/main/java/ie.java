import java.io.EOFException;
import java.io.IOException;
import javax.net.ssl.HandshakeCompletedListener;
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
	@ObfuscatedGetter(
		longValue = -1738948502613052373L
	)
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "J"
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

	@ObfuscatedName("er")
	@ObfuscatedSignature(
		descriptor = "(Lqf;Ljavax/net/ssl/HandshakeCompletedListener;)V"
	)
	public static void er(qf var0, HandshakeCompletedListener var1) throws IOException {
		try {
			if (var0 == null) {
				var0.getClass();
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("uw")
	@ObfuscatedSignature(
		descriptor = "(Lgy;)I"
	)
	public static int uw(gy var0) {
		return var0.az_fld;
	}

	ie(ia var1) {
		this.this$0 = var1;
		this.ak_fld = -186047548659460739L;
		this.ag_fld = null;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	@Override
	void ak(xi var1, int var2) {
		if (var1.cg() != 255) {
			var1.au_fld--;
			this.ak_fld = xi.ob(var1, 1022937383);
		}

		this.ag_fld = var1.ch();
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
			this.ak_fld = xi.ob(var1, -1297935346);
		}

		this.ag_fld = var1.ch();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	void ae(xi var1) {
		if (var1.cg() != 255) {
			var1.au_fld--;
			this.ak_fld = xi.ob(var1, 1423955828);
		}

		this.ag_fld = var1.ch();
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
		descriptor = "(Ldx;)V"
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

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	void az(xi var1) {
		if (var1.cg() != 255) {
			var1.au_fld--;
			this.ak_fld = xi.ob(var1, -378869192);
		}

		this.ag_fld = var1.ch();
	}
}
