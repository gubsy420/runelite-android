import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("yp")
class yp implements yn {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int aw_fld;

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lxi;B)V"
	)
	@Override
	public void az(Object var1, xi var2, byte var3) {
		this.ak((Integer)var1, var2);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Integer;Lxi;)V"
	)
	void ak(Integer var1, xi var2) {
		xi.ld(var2, var1, (byte)126);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Integer;Lxi;)V"
	)
	void ar(Integer var1, xi var2) {
		xi.ld(var2, var1, (byte)114);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Integer;Lxi;)V"
	)
	void ae(Integer var1, xi var2) {
		xi.ld(var2, var1, (byte)103);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)Ljava/lang/Object;"
	)
	@Override
	public Object ah(xi var1) {
		return var1.co();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)Ljava/lang/Object;"
	)
	@Override
	public Object aw(xi var1) {
		return var1.co();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lxi;)V"
	)
	@Override
	public void ay(Object var1, xi var2) {
		this.ak((Integer)var1, var2);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lxi;)V"
	)
	@Override
	public void as(Object var1, xi var2) {
		this.ak((Integer)var1, var2);
	}

	yp() {
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Integer;Lxi;)V"
	)
	void av(Integer var1, xi var2) {
		xi.ld(var2, var1, (byte)120);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)Ljava/lang/Object;"
	)
	@Override
	public Object ag(xi var1, int var2) {
		return var1.co();
	}
}
