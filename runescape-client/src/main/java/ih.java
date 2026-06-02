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
	@ObfuscatedGetter(
		intValue = -511078303
	)
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ag_fld;
	// $VF: synthetic field
	@ObfuscatedName("this$0")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	ia this$0;
	@ObfuscatedGetter(
		intValue = 1717675171
	)
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ak_fld;
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
		this.ak_fld = var1.co();
		this.ag_fld = var1.co();
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	@Override
	void ak(xi var1, int var2) {
		this.ak_fld = var1.co();
		this.ag_fld = var1.co();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lik;I)V"
	)
	@Override
	void ag(ik var1, int var2) {
		ik.dw(var1, this.ak_fld, this.ag_fld, (short)23964);
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
		ik.dw(var1, this.ak_fld * 1849913113, -661190236 * this.ag_fld, (short)-7242);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	void ae(xi var1) {
		this.ak_fld = var1.co();
		this.ag_fld = var1.co();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lik;)V"
	)
	@Override
	void ay(ik var1) {
		ik.dw(var1, this.ak_fld, this.ag_fld, (short)-4356);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lik;)V"
	)
	@Override
	void ah(ik var1) {
		ik.dw(var1, this.ak_fld, this.ag_fld, (short)-21686);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	void av(xi var1) {
		this.ak_fld = var1.co();
		this.ag_fld = var1.co() * -1281218558;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxv;ILjava/lang/String;)Ljava/lang/String;"
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
