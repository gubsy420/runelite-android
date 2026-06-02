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
	@ObfuscatedGetter(
		intValue = -1061825399
	)
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ak_fld;
	// $VF: synthetic field
	@ObfuscatedName("this$0")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	ia this$0;
	@ObfuscatedGetter(
		longValue = 592279294055963025L
	)
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "J"
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
		this.ak_fld = var1.co();
		this.ag_fld = xi.ob(var1, -142504090);
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
		this.ak_fld = var1.co() * 1624354708;
		this.ag_fld = xi.ob(var1, -645543088);
	}

	@ObfuscatedName("ox")
	@ObfuscatedSignature(
		descriptor = "(Led;Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	public static int ox(ed var0, Object var1, Object var2) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.ak((rr)var1, (rr)var2);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	void av(xi var1) {
		this.ak_fld = var1.co();
		this.ag_fld = xi.ob(var1, 633949065);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	void ae(xi var1) {
		this.ak_fld = var1.co() * -1814677800;
		this.ag_fld = xi.ob(var1, 695835682);
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
		descriptor = "(Lub;)V"
	)
	public static void ak(ub var0) {
		ou.aw_fld = var0;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Z)[B"
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
		descriptor = "(Ljava/lang/String;)V"
	)
	static final void ae(String var0) {
		jm var2 = gi.ak(jb.cp_fld, client.aq_fld.av_fld);
		var2.ay_fld.bc(iq.bu(var0));
		var2.ay_fld.cc(var0, 1003867405);
		client.aq_fld.az(var2);
	}
}
