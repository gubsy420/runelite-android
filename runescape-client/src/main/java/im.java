import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("im")
public class im extends ht {
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
		intValue = -1061825399
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
		descriptor = "J"
	)
	@ObfuscatedGetter(
		longValue = 592279294055963025L
	)
	long ag_fld;

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lik;)V"
	)
	@Override
	void ah(ik var1) {
		var1.aq(this.ak_fld, this.ag_fld);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	@Override
	void ak(xi var1, int var2) {
		this.ak_fld = var1.co((byte)0);
		this.ag_fld = var1.cu();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lik;I)V"
	)
	@Override
	void ag(ik var1, int var2) {
		var1.aq(this.ak_fld, this.ag_fld);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	void az(xi var1) {
		this.ak_fld = var1.co((byte)-127) * 1624354708;
		this.ag_fld = var1.cu();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	void av(xi var1) {
		this.ak_fld = var1.co((byte)-104);
		this.ag_fld = var1.cu();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	void ae(xi var1) {
		this.ak_fld = var1.co((byte)-110) * -1814677800;
		this.ag_fld = var1.cu();
	}

	im(ia var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lik;)V"
	)
	@Override
	void aw(ik var1) {
		var1.aq(this.ak_fld, this.ag_fld);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lik;)V"
	)
	@Override
	void ay(ik var1) {
		var1.aq(this.ak_fld, this.ag_fld);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lub;I)V"
	)
	public static void ak(ub var0) {
		ou.aw_fld = var0;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;ZI)[B"
	)
	public static byte[] ak(Object var0, boolean var1) {
		if (var0 == null) {
			return null;
		} else if (var0 instanceof byte[]) {
			byte[] var7 = (byte[])var0;
			if (var1) {
				int var5 = var7.length;
				byte[] var6 = new byte[var5];
				System.arraycopy(var7, 0, var6, 0, var5);
				return var6;
			} else {
				return var7;
			}
		} else if (var0 instanceof zs) {
			zs var3 = (zs)var0;
			return var3.ag(-1159491827);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V"
	)
	static final void ae(String var0) {
		jm var2 = gi.ak(jb.cp_fld, client.appletStub.av_fld);
		var2.ay_fld.ea(iq.bu(var0));
		xi.ph(var2.ay_fld, var0, 1003867405);
		client.appletStub.az(var2);
	}
}
