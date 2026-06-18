import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("hz")
public class hz extends ho {
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bs_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "B"
	)
	byte ag_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -90535051
	)
	int ak_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	String av_fld;
	// $VF: synthetic field
	@ObfuscatedName("this$0")
	@ObfuscatedSignature(
		descriptor = "Lhm;"
	)
	hm this$0;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bd_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 644442307
	)
	int az_fld;

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	void az(xi var1) {
		var1.cg();
		this.ak_fld = var1.cm();
		this.ag_fld = var1.cw();
		this.az_fld = var1.cm();
		var1.cu();
		this.av_fld = xi.at(var1, -640532537);
		var1.cg();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	void av(xi var1) {
		var1.cg();
		this.ak_fld = var1.cm();
		this.ag_fld = var1.cw();
		this.az_fld = var1.cm();
		var1.cu();
		this.av_fld = xi.at(var1, -1768111407);
		var1.cg();
	}

	@ObfuscatedName("fp")
	@ObfuscatedSignature(
		descriptor = "(Lbt;I)V"
	)
	public static void fp(bt var0, int var1) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			if (!var0.ak(2073859330)) {
				jm.kr_fld.av(var0.ak_fld, var0.av_fld, var0.ae_fld, false);
				int var2 = cf.ak(var0.ay_fld, var1, jm.kr_fld);
				jm.kr_fld.ae();
				if ((var2 & 1) != 0) {
					qa.gr(var0.ay_fld, 444761018);
				}
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lib;B)V"
	)
	@Override
	void ag(ib var1, byte var2) {
		hx var3 = (hx)(hx)var1.ak_fld.get(this.ak_fld);
		var3.ak_fld = this.ag_fld;
		var3.ag_fld = this.az_fld * -76768917;
		var3.az_fld = new aax(this.av_fld);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	@Override
	void ak(xi var1, int var2) {
		var1.cg();
		this.ak_fld = var1.cm();
		this.ag_fld = var1.cw();
		this.az_fld = var1.cm();
		var1.cu();
		this.av_fld = xi.at(var1, -1276049740);
		var1.cg();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lib;)V"
	)
	@Override
	void ay(ib var1) {
		hx var2 = (hx)(hx)var1.ak_fld.get(this.ak_fld);
		var2.ak_fld = this.ag_fld;
		var2.ag_fld = this.az_fld * -1401892212;
		var2.az_fld = new aax(this.av_fld);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	void ae(xi var1) {
		var1.cg();
		this.ak_fld = var1.cm() * -63086165;
		this.ag_fld = var1.cw();
		this.az_fld = var1.cm();
		var1.cu();
		this.av_fld = xi.at(var1, 991464915);
		var1.cg();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lib;)V"
	)
	@Override
	void ah(ib var1) {
		hx var2 = (hx)(hx)var1.ak_fld.get(this.ak_fld * 1490572008);
		var2.ak_fld = this.ag_fld;
		var2.ag_fld = this.az_fld * -76768917;
		var2.az_fld = new aax(this.av_fld);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lib;)V"
	)
	@Override
	void aw(ib var1) {
		hx var2 = (hx)(hx)var1.ak_fld.get(this.ak_fld);
		var2.ak_fld = this.ag_fld;
		var2.ag_fld = this.az_fld * -76768917;
		var2.az_fld = new aax(this.av_fld);
	}

	hz(hm var1) {
		this.this$0 = var1;
		this.ak_fld = 1846039331;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V"
	)
	static void aj(String var0) {
		bn.ct_fld = rj.ae(var0);
	}
}
