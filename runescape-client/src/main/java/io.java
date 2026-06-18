import java.awt.event.WindowEvent;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("io")
public class io extends ht {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	String ag_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 132101181
	)
	int ak_fld;
	// $VF: synthetic field
	@ObfuscatedName("this$0")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	ia this$0;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bz_fld;

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;B)V"
	)
	static void ag(int var0, String var1, String var2) {
		ro.az(var0, var1, var2, null);
	}

	io(ia var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lik;I)V"
	)
	@Override
	void ag(ik var1, int var2) {
		var1.am(this.ak_fld, this.ag_fld, 840549192);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	@Override
	void ak(xi var1, int var2) {
		this.ak_fld = var1.co((byte)-63);
		this.ag_fld = xi.at(var1, -519061123);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	void az(xi var1) {
		this.ak_fld = var1.co((byte)-112) * -338690654;
		this.ag_fld = xi.at(var1, 442260027);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	void ae(xi var1) {
		this.ak_fld = var1.co((byte)-87);
		this.ag_fld = xi.at(var1, -858057229);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lik;)V"
	)
	@Override
	void ah(ik var1) {
		var1.am(this.ak_fld, this.ag_fld, 840549192);
	}

	@ObfuscatedName("od")
	@ObfuscatedSignature(
		descriptor = "(Luf;Luf;)Z"
	)
	public static boolean od(uf var0, uf var1) {
		return var0.av_fld <= var1.af() && var1.as() <= var0.af() && var0.ae_fld <= var1.al() && var1.ar() <= var0.al();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lik;)V"
	)
	@Override
	void aw(ik var1) {
		var1.am(this.ak_fld, this.ag_fld, 840549192);
	}

	@ObfuscatedName("sd")
	@ObfuscatedSignature(
		descriptor = "(Ltf;Ljava/awt/event/WindowEvent;)V"
	)
	public static void sd(tf var0, WindowEvent var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.destroy();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lik;)V"
	)
	@Override
	void ay(ik var1) {
		var1.am(this.ak_fld, this.ag_fld, 840549192);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)Z"
	)
	public static boolean az(CharSequence var0) {
		boolean var3 = false;
		boolean var4 = false;
		long var5 = 0L;
		int var7 = var0.length();
		int var8 = 0;

		boolean var2;
		while (true) {
			if (var8 >= var7) {
				var2 = var4;
				break;
			}

			label100: {
				char var9 = var0.charAt(var8);
				if (var8 == 0) {
					if ('-' == var9) {
						var3 = true;
						break label100;
					}

					if (var9 == '+') {
						break label100;
					}
				}

				int var12;
				if (var9 >= '0' && var9 <= '9') {
					var12 = var9 - '0';
				} else if (var9 >= 'A' && var9 <= 'Z') {
					var12 = var9 - '7';
				} else {
					if (var9 < 'a' || var9 > 'z') {
						var2 = false;
						break;
					}

					var12 = var9 - 'W';
				}

				if (var12 >= 10) {
					var2 = false;
					break;
				}

				if (var3) {
					var12 = -var12;
				}

				long var10 = 10L * var5 + var12;
				if (var10 / 10L != var5) {
					var2 = false;
					break;
				}

				var5 = var10;
				var4 = true;
			}

			var8++;
		}

		return var2;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	void av(xi var1) {
		this.ak_fld = var1.co((byte)-125);
		this.ag_fld = xi.at(var1, -1630506546);
	}
}
