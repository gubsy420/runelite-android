import javax.net.ssl.HandshakeCompletedListener;
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
	@ObfuscatedGetter(
		intValue = -70953483
	)
	@ObfuscatedName("je")
	@ObfuscatedSignature(
		descriptor = "I"
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
		this.ag_fld = xi.rp(var1, -1961259440);
		this.az_fld = xi.rp(var1, 604706521);
		this.av_fld = xi.rp(var1, 666873428);
		this.ae_fld = xi.rp(var1, -1308060419);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	void av(xi var1) {
		this.ak_fld = var1.cg() == 1;
		this.ag_fld = xi.rp(var1, 705582686);
		this.az_fld = xi.rp(var1, -347759385);
		this.av_fld = xi.rp(var1, 532993964);
		this.ae_fld = xi.rp(var1, -761993049);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	void az(xi var1) {
		this.ak_fld = var1.cg() == 1;
		this.ag_fld = xi.rp(var1, 384547486);
		this.az_fld = xi.rp(var1, 648341475);
		this.av_fld = xi.rp(var1, -1349750416);
		this.ae_fld = xi.rp(var1, -1083172097);
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

	@ObfuscatedName("eq")
	@ObfuscatedSignature(
		descriptor = "(Lqf;Ljavax/net/ssl/HandshakeCompletedListener;)V"
	)
	public static void eq(qf var0, HandshakeCompletedListener var1) {
		if (var0 == null) {
			var0.getClass();
		}
	}

	@ObfuscatedName("gy")
	@ObfuscatedSignature(
		descriptor = "(Lcn;)Z"
	)
	public static boolean gy(cn var0) {
		return var0.aw_fld;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	void ae(xi var1) {
		this.ak_fld = var1.cg() == 1;
		this.ag_fld = xi.rp(var1, 687806846);
		this.az_fld = xi.rp(var1, -521485600);
		this.av_fld = xi.rp(var1, 84405502);
		this.ae_fld = xi.rp(var1, 1210179112);
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
