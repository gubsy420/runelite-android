import javax.net.ssl.SSLPeerUnverifiedException;
import javax.security.cert.X509Certificate;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("hu")
public class hu extends ht {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean ak_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "B"
	)
	byte ag_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "B"
	)
	byte az_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "B"
	)
	byte av_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "B"
	)
	byte ae_fld;
	// $VF: synthetic field
	@ObfuscatedName("this$0")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	ia this$0;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int be_fld;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int an_fld;
	@ObfuscatedName("je")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -70953483
	)
	static int je_fld;
	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "Lyv;"
	)
	static yv ce_fld;

	hu(ia var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	@Override
	void ak(xi var1, int var2) {
		this.ak_fld = var1.cg() == 1;
		this.ag_fld = var1.cw();
		this.az_fld = var1.cw();
		this.av_fld = var1.cw();
		this.ae_fld = var1.cw();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	void av(xi var1) {
		this.ak_fld = var1.cg() == 1;
		this.ag_fld = var1.cw();
		this.az_fld = var1.cw();
		this.av_fld = var1.cw();
		this.ae_fld = var1.cw();
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	void az(xi var1) {
		this.ak_fld = var1.cg() == 1;
		this.ag_fld = var1.cw();
		this.az_fld = var1.cw();
		this.av_fld = var1.cw();
		this.ae_fld = var1.cw();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lik;)V"
	)
	@Override
	void ay(ik var1) {
		var1.af_fld = this.ak_fld;
		var1.al_fld = this.ag_fld;
		var1.au_fld = this.az_fld;
		var1.ax_fld = this.av_fld;
		var1.an_fld = this.ae_fld;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	void ae(xi var1) {
		this.ak_fld = var1.cg() == 1;
		this.ag_fld = var1.cw();
		this.az_fld = var1.cw();
		this.av_fld = var1.cw();
		this.ae_fld = var1.cw();
	}

	@ObfuscatedName("op")
	@ObfuscatedSignature(
		descriptor = "(Lql;)[Ljavax/security/cert/X509Certificate;"
	)
	public static X509Certificate[] op(ql var0) throws SSLPeerUnverifiedException {
		if (var0 == null) {
			var0.getClass();
		}

		return null;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lik;)V"
	)
	@Override
	void ah(ik var1) {
		var1.af_fld = this.ak_fld;
		var1.al_fld = this.ag_fld;
		var1.au_fld = this.az_fld;
		var1.ax_fld = this.av_fld;
		var1.an_fld = this.ae_fld;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lik;I)V"
	)
	@Override
	void ag(ik var1, int var2) {
		var1.af_fld = this.ak_fld;
		var1.al_fld = this.ag_fld;
		var1.au_fld = this.az_fld;
		var1.ax_fld = this.av_fld;
		var1.an_fld = this.ae_fld;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lik;)V"
	)
	@Override
	void aw(ik var1) {
		var1.af_fld = this.ak_fld;
		var1.al_fld = this.ag_fld;
		var1.au_fld = this.az_fld;
		var1.ax_fld = this.av_fld;
		var1.an_fld = this.ae_fld;
	}
}
