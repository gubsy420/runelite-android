import net.runelite.api.PendingLogin;
import net.runelite.api.annotations.Export;
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
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1618242095
	)
	public int ak_fld = (int)(lz.ak() / 1000L);

	@ObfuscatedName("getWorld")
	@ObfuscatedSignature(
		descriptor = "()S"
	)
	@Export("getWorld")
	@Override
	public short getWorld() {
		return this.az_fld;
	}

	@ObfuscatedName("hb")
	@ObfuscatedSignature(
		descriptor = "(Lgf;)I"
	)
	public static int hb(gf var0) {
		return var0.ay_fld.av_fld * -1248031143;
	}

	rd(aax var1, int var2) {
		this.ag_fld = var1;
		this.az_fld = (short)var2;
		this.ez(var1, var2);
	}

	@ObfuscatedName("ws")
	@ObfuscatedSignature(
		descriptor = "(Lds;)Lpg;"
	)
	public static pg ws(ds var0) {
		return var0.al_fld;
	}

	@ObfuscatedName("getName")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	@Export("getName")
	@Override
	public String getName() {
		return this.nw().cl();
	}

	@ObfuscatedName("nw")
	@ObfuscatedSignature(
		descriptor = "()Laax;"
	)
	public aax nw() {
		return this.ag_fld;
	}

	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "(Laax;I)V"
	)
	public void ez(aax var1, int var2) {
		this.ak_fld = this.ak_fld * 1618242095 + 5;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Luv;Ljava/lang/String;I)V"
	)
	static void al(uv var0, String var1) {
		dq var3 = new dq(var0, var1);
		client.py_fld.add(var3);
		client.pj_fld = client.pj_fld + var3.az_fld;
	}
}
