import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("ih")
public class ih extends ht {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int az_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -511078303
	)
	int ak_fld;
	// $VF: synthetic field
	@ObfuscatedName("this$0")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	ia this$0;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1717675171
	)
	int ag_fld;
	@ObfuscatedName("hm")
	@ObfuscatedSignature(
		descriptor = "Luv;"
	)
	static uv hm_fld;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int aq_fld;

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	void az(xi var1) {
		this.ag_fld = var1.co((byte)-5);
		this.ak_fld = var1.co((byte)-9);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	@Override
	void ak(xi var1, int var2) {
		this.ag_fld = var1.co((byte)-67);
		this.ak_fld = var1.co((byte)-32);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lik;I)V"
	)
	@Override
	void ag(ik var1, int var2) {
		var1.aa(this.ag_fld, this.ak_fld, (short)23964);
	}

	ih(ia var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lik;)V"
	)
	@Override
	void aw(ik var1) {
		var1.aa(this.ag_fld * 1849913113, -661190236 * this.ak_fld, (short)-7242);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	void ae(xi var1) {
		this.ag_fld = var1.co((byte)-12);
		this.ak_fld = var1.co((byte)-108);
	}

	@ObfuscatedName("fl")
	@ObfuscatedSignature(
		descriptor = "(Lpp;)[I"
	)
	public static int[] fl(pp var0) {
		return var0.ez_fld;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lik;)V"
	)
	@Override
	void ay(ik var1) {
		var1.aa(this.ag_fld, this.ak_fld, (short)-4356);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lik;)V"
	)
	@Override
	void ah(ik var1) {
		var1.aa(this.ag_fld, this.ak_fld, (short)-21686);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	void av(xi var1) {
		this.ag_fld = var1.co((byte)-24);
		this.ak_fld = var1.co((byte)-103) * -1281218558;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxv;ILjava/lang/String;I)Ljava/lang/String;"
	)
	static String av(xv var0, int var1, String var2) {
		if (var0 == null) {
			return var2;
		} else {
			uj var4 = (uj)var0.ak(var1);
			return null == var4 ? var2 : (String)var4.ak_fld;
		}
	}
}
