import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("gr")
public abstract class gr {
	@ObfuscatedGetter(
		intValue = 1559074455
	)
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int av_fld;
	@ObfuscatedGetter(
		intValue = 1677341167
	)
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ag_fld;
	@ObfuscatedGetter(
		intValue = 193297079
	)
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int az_fld;
	@ObfuscatedGetter(
		intValue = 913053231
	)
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ak_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ah_fld;

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "()[Lah;"
	)
	public static ah[] ak() {
		return new ah[]{ah.ak_fld};
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	static void by(int var0) {
		jm var2 = gi.ak(jb.df_fld, client.aq_fld.av_fld);
		var2.ay_fld.dy(var0);
		client.aq_fld.az(var2);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIILgn;)Z"
	)
	protected abstract boolean ag(int var1, int var2, int var3, gn var4);

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIILgn;)Z"
	)
	protected abstract boolean az(int var1, int var2, int var3, gn var4);

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIILgn;I)Z"
	)
	protected abstract boolean ak(int var1, int var2, int var3, gn var4, int var5);

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIILgn;)Z"
	)
	protected abstract boolean ae(int var1, int var2, int var3, gn var4);

	protected gr() {
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIILgn;)Z"
	)
	protected abstract boolean av(int var1, int var2, int var3, gn var4);

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)I"
	)
	public static int bn(String var0) {
		return var0.length() + 2;
	}
}
