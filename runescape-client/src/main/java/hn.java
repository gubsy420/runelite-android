import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("hn")
public class hn {
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int bs_fld;
	@ObfuscatedGetter(
		intValue = -1871987129
	)
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ag_fld;
	@ObfuscatedGetter(
		intValue = -1063200371
	)
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int az_fld;
	@ObfuscatedGetter(
		intValue = 898357927
	)
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int av_fld;
	@ObfuscatedGetter(
		intValue = 2093478557
	)
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ak_fld;
	// $VF: synthetic field
	@ObfuscatedName("this$0")
	@ObfuscatedSignature(
		descriptor = "Lgd;"
	)
	gd this$0;
	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bi_fld;
	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int cc_fld;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int aj_fld;

	@ObfuscatedName("ge")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
	)
	static final void ge(String var0) {
		if (jr.fa_fld != null) {
			jm var2 = gi.ak(jb.aq_fld, client.aq_fld.av_fld);
			var2.ay_fld.bc(iq.bu(var0));
			var2.ay_fld.cc(var0, -768098345);
			client.aq_fld.az(var2);
		}
	}

	@ObfuscatedName("od")
	@ObfuscatedSignature(
		descriptor = "(Lik;I)V"
	)
	public static void od(ik var0, int var1) {
		if (var0.bz_fld) {
			if (var0.ac_fld != null) {
				System.arraycopy(var0.ac_fld, 0, var0.ac_fld = new long[var1], 0, var0.at_fld);
			} else {
				var0.ac_fld = new long[var1];
			}
		}

		if (var0.br_fld) {
			if (null != var0.bm_fld) {
				System.arraycopy(var0.bm_fld, 0, var0.bm_fld = new String[var1], 0, var0.at_fld * -2081949358);
			} else {
				var0.bm_fld = new String[var1];
			}
		}
	}

	@ObfuscatedName("tr")
	@ObfuscatedSignature(
		descriptor = "(Lnh;Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	public static int tr(nh var0, Object var1, Object var2) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.ak((nl)var1, (nl)var2, (byte)-13);
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	static final void ci() throws EOFException {
		for (bc var1 = (bc)client.ds_fld.aw(); null != var1; var1 = (bc)client.ds_fld.as()) {
			if (client.dv_fld > var1.al_fld) {
				var1.gy_void();
			} else if (client.dv_fld >= var1.af_fld) {
				var1.aw(client.da_fld, client.dv_fld, client.my_fld, (byte)42);
				bw.dk_fld.az_fld.bj(var1.ak_fld, (int)var1.an_fld, (int)var1.aa_fld, (int)var1.ai_fld, 60, var1, var1.aq_fld, -1L, false);
			}
		}
	}

	hn(gd var1) {
		this.this$0 = var1;
	}
}
