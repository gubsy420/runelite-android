import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("tv")
public class tv implements tp {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lwr;"
	)
	public wr ak_fld;
	@ObfuscatedGetter(
		intValue = 1924770775
	)
	@ObfuscatedName("go")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int go_fld;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ai_fld;

	tv(wy var1) {
		this.ak_fld = var1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int az(int var1) throws EOFException {
		return this.ak_fld.ak(var1, (byte)-56);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int ak(int var1) throws EOFException {
		return this.ak_fld.ak(var1, (byte)59);
	}

	public tv(tq var1) {
		this(new wy(var1));
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int av(int var1) throws EOFException {
		return this.ak_fld.ak(var1, (byte)102);
	}
}
