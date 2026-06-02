import java.io.EOFException;
import java.io.IOException;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("as")
public class as {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ak_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ag_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	String az_fld;

	@ObfuscatedName("oj")
	@ObfuscatedSignature(
		descriptor = "(Las;)Ljava/lang/String;"
	)
	public static String oj(as var0) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return Integer.toHexString(var0.ak_fld) + Integer.toHexString(var0.ag_fld) + var0.az_fld;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	String az() {
		return Integer.toHexString(this.ak_fld) + Integer.toHexString(this.ag_fld) + this.az_fld;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ag() {
		return this.ag_fld;
	}

	as(xi var1) {
		this(var1.cg(), var1.cg(), xi.kc(var1, -420457269));
	}

	as(int var1, int var2, String var3) {
		this.ak_fld = var1;
		this.ag_fld = var2;
		this.az_fld = var3;
	}

	@ObfuscatedName("ok")
	@ObfuscatedSignature(
		descriptor = "(Lzu;[B)V"
	)
	public static void ok(zu var0, byte[] var1) throws IOException, EOFException {
		if (var0 == null) {
			var0.getClass();
		} else {
			zu.oa(var0, var1, 0, var1.length, 1535799479);
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int av() {
		return this.ag_fld;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	String ak() {
		return Integer.toHexString(this.ag_fld) + Integer.toHexString(this.ak_fld) + this.az_fld;
	}
}
