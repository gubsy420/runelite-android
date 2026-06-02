import net.runelite.api.PendingLogin;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("rd")
@Implements({"PendingLogin"})
public class rd extends uq implements PendingLogin {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "S"
	)
	public short az_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Laax;"
	)
	public aax ag_fld;
	@ObfuscatedGetter(
		intValue = 1618242095
	)
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ak_fld = (int)(lz.ak() / 1000L);

	@ObfuscatedName("getName")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	@Override
	public String getName() {
		return this.ej().ah();
	}

	@ObfuscatedName("ej")
	@ObfuscatedSignature(
		descriptor = "()Laax;"
	)
	public aax ej() {
		return this.ag_fld;
	}

	@ObfuscatedName("getWorld")
	@ObfuscatedSignature(
		descriptor = "()S"
	)
	@Override
	public short getWorld() {
		return this.az_fld;
	}

	@ObfuscatedName("ps")
	@ObfuscatedSignature(
		descriptor = "(Laax;I)V"
	)
	public void ps(aax var1, int var2) {
		this.ak_fld = this.ak_fld * 1618242095 + 5;
	}

	rd(aax var1, int var2) {
		this.ag_fld = var1;
		this.az_fld = (short)var2;
		this.ps(var1, var2);
	}

	@ObfuscatedName("ko")
	@ObfuscatedSignature(
		descriptor = "(Lda;)Z"
	)
	public static boolean ko(da var0) {
		return var0.cm_fld.av() && var0.ck_fld * -1696106360 == 0;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Luv;Ljava/lang/String;)V"
	)
	static void al(uv var0, String var1) {
		dq var3 = new dq(var0, var1);
		client.py_fld.add(var3);
		client.pj_fld = client.pj_fld + var3.az_fld;
	}
}
