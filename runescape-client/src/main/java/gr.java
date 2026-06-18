import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("gr")
public abstract class gr {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1559074455
	)
	public int av_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1677341167
	)
	public int ag_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 193297079
	)
	public int az_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 913053231
	)
	public int ak_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ah_fld;

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)[Lah;"
	)
	public static ah[] ak() {
		return new ah[]{ah.ak_fld};
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(IB)V"
	)
	static void by(int var0) {
		jm var2 = gi.ak(jb.df_fld, client.appletStub.av_fld);
		var2.ay_fld.bq(var0);
		client.appletStub.az(var2);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIILgn;)Z"
	)
	protected abstract boolean az(int var1, int var2, int var3, gn var4);

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIILgn;)Z"
	)
	protected abstract boolean ae(int var1, int var2, int var3, gn var4);

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIILgn;I)Z"
	)
	protected abstract boolean ak(int var1, int var2, int var3, gn var4, int var5);

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIILgn;)Z"
	)
	protected abstract boolean av(int var1, int var2, int var3, gn var4);

	protected gr() {
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIILgn;)Z"
	)
	protected abstract boolean ag(int var1, int var2, int var3, gn var4);

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I"
	)
	public static int bn(String var0) {
		return var0.length() + 2;
	}
}
