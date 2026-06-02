import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("ha")
public class ha extends ht {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	String ag_fld;
	@ObfuscatedGetter(
		intValue = -1385865261
	)
	@ObfuscatedName("ih")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ih_fld;
	// $VF: synthetic field
	@ObfuscatedName("this$0")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	ia this$0;
	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bg_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	public static ub aw_fld;
	@ObfuscatedGetter(
		longValue = 1179813713679588943L
	)
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	long ak_fld;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int au_fld;

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	void ae(xi var1) {
		if (var1.cg() != 255) {
			var1.au_fld--;
			this.ak_fld = xi.ob(var1, 1252662143);
		}

		this.ag_fld = var1.ch();
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	@Override
	void ak(xi var1, int var2) {
		if (var1.cg() != 255) {
			var1.au_fld--;
			this.ak_fld = xi.ob(var1, -2130398090);
		}

		this.ag_fld = var1.ch();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lik;I)V"
	)
	@Override
	void ag(ik var1, int var2) {
		ik.om(var1, this.ak_fld, this.ag_fld, 0, (byte)-12);
	}

	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "(Ldx;)V"
	)
	static void dk(dx var0) throws EOFException {
		try {
			int var2 = og.ci_fld.oq();
			if (!client.$assertionsDisabled && var2 != 25 && var2 != 30) {
				throw new AssertionError();
			} else if (!client.$assertionsDisabled && !client.kk_fld) {
				throw new AssertionError();
			} else if (client.uq_rl4 != null) {
				if (client.uq_rl4.kh()) {
					rl4 var6 = client.uq_rl4;
					client.uq_rl4 = null;
					client.al_boolean = false;
					client.zd(var6);
					client.kk_fld = false;
					hg.dx_fld = null;
				}
			} else {
				rl4 var3 = new rl4(client.fa_fld, 0, var0, client.qi_fld);
				var0.tx_fld = var3.pp_fld.az_fld;
				var0.mx_fld = var3.pp_fld.ak_fld;
				var0.kr_fld = var3.pp_fld.ag_fld;
				if (!client.$assertionsDisabled && hk.mt_fld != var0) {
					throw new AssertionError();
				} else {
					var3.me_fld = hk.mt_fld.ae_fld;
					if (!client.$assertionsDisabled && hg.dx_fld != var0) {
						throw new AssertionError();
					} else if (!client.$assertionsDisabled && client.al_boolean) {
						throw new AssertionError();
					} else {
						client.al_boolean = true;
						if (!client.$assertionsDisabled && client.uq_rl4 != null) {
							throw new AssertionError();
						} else {
							client.uq_rl4 = var3;
							var3.gb();
						}
					}
				}
			}
		} catch (Throwable var5) {
			throw new RuntimeException(var5);
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	void az(xi var1) {
		if (var1.cg() != 255) {
			var1.au_fld--;
			this.ak_fld = xi.ob(var1, 785210176);
		}

		this.ag_fld = var1.ch();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lik;)V"
	)
	@Override
	void aw(ik var1) {
		ik.om(var1, this.ak_fld, this.ag_fld, 0, (byte)-37);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lik;)V"
	)
	@Override
	void ah(ik var1) {
		ik.om(var1, this.ak_fld, this.ag_fld, 0, (byte)41);
	}

	ha(ia var1) {
		this.this$0 = var1;
		this.ak_fld = 3829161295850719057L;
		this.ag_fld = null;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lik;)V"
	)
	@Override
	void ay(ik var1) {
		ik.om(var1, this.ak_fld, this.ag_fld, 0, (byte)59);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	void av(xi var1) {
		if (var1.cg() != 255) {
			var1.au_fld--;
			this.ak_fld = xi.ob(var1, 1200390737);
		}

		this.ag_fld = var1.ch();
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "([B)Ljava/lang/String;"
	)
	public static String ak(byte[] var0) {
		return dy.ag(var0, 0, var0.length);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "()J"
	)
	static long ac() {
		return client.nh_fld;
	}
}
