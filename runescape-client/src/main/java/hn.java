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
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1871987129
	)
	int ag_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1063200371
	)
	int az_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 898357927
	)
	int av_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 2093478557
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

	@ObfuscatedName("nh")
	@ObfuscatedSignature(
		descriptor = "(Lml;II)V"
	)
	public static void nh(ml var0, int var1, int var2) {
		synchronized (var0.bx_fld) {
			var0.ai(var1, var2);
		}
	}

	@ObfuscatedName("ge")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V"
	)
	static final void ge(String var0) {
		if (jr.fa_fld != null) {
			jm var2 = gi.ak(jb.aq_fld, client.appletStub.av_fld);
			var2.ay_fld.ea(iq.bu(var0));
			xi.ph(var2.ay_fld, var0, -768098345);
			client.appletStub.az(var2);
		}
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	static final void ci() throws EOFException {
		for (bc var1 = (bc)client.ds_fld.aw(); null != var1; var1 = (bc)na.iy(client.ds_fld)) {
			if (client.dv_fld > var1.al_fld) {
				var1.gy();
			} else if (client.dv_fld >= var1.af_fld) {
				var1.aw(client.da_fld, client.dv_fld, client.my_fld, (byte)42);
				bw.dk_fld.az_fld.bj(var1.ak_fld, (int)var1.an_fld, (int)var1.aa_fld, (int)var1.ai_fld, 60, var1, var1.aq_fld, -1L, false);
			}
		}
	}

	@ObfuscatedName("yt")
	@ObfuscatedSignature(
		descriptor = "(Lwt;)I"
	)
	public static int yt(wt var0) {
		return var0.aw_fld;
	}

	hn(gd var1) {
		this.this$0 = var1;
	}
}
