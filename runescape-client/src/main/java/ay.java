import java.io.EOFException;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("ay")
public class ay {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/concurrent/ExecutorService;"
	)
	ExecutorService az_fld = Executors.newSingleThreadExecutor();
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lxi;"
	)
	xi ak_fld;
	@ObfuscatedName("lp")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	static String lp_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/concurrent/Future;"
	)
	Future av_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Laz;"
	)
	az ag_fld;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ai_fld;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	public static int[] aq_fld;

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ay() {
		this.az_fld.shutdown();
		this.az_fld = null;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean ak(int var1) {
		return this.av_fld.isDone();
	}

	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		descriptor = "(Lay;)V"
	)
	public static void ec(ay var0) {
		var0.av_fld = var0.az_fld.submit(new ag(var0, var0.ak_fld, var0.ag_fld));
	}

	@ObfuscatedName("ss")
	@ObfuscatedSignature(
		descriptor = "(Lct;)Z"
	)
	public static boolean ss(ct var0) {
		if (var0 == null) {
			var0.getClass();
		}

		return (wu.ag_fld.ag(138822965) & var0.al_fld) != 0;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ag() {
		this.az_fld.shutdown();
		this.az_fld = null;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean ae() {
		return this.av_fld.isDone();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void av() {
		this.av_fld = this.az_fld.submit(new ag(this, this.ak_fld, this.ag_fld));
	}

	public ay(xi var1, az var2) {
		this.ak_fld = var1;
		this.ag_fld = var2;
		this.av();
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	static final void bd() throws EOFException, UnsupportedEncodingException {
		if (client.jk_fld > 0) {
			kx.ab((short)24750);
		} else {
			lj.lm(client.ls_fld, 1761845536);
			jk.af(40, (byte)-28);
			ky.lm_fld = df.xl(client.aq_fld, -2066903909);
			client.aq_fld.av();
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void as() {
		this.az_fld.shutdown();
		this.az_fld = null;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "()Lxi;"
	)
	public xi af() {
		try {
			return (xi)(xi)this.av_fld.get();
		} catch (Exception var2) {
			return null;
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "()Lxi;"
	)
	public xi al() {
		try {
			return (xi)(xi)this.av_fld.get();
		} catch (Exception var2) {
			return null;
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ax() {
		this.av_fld = this.az_fld.submit(new ag(this, this.ak_fld, this.ag_fld));
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void an() {
		this.av_fld = this.az_fld.submit(new ag(this, this.ak_fld, this.ag_fld));
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()Lxi;"
	)
	public xi az() {
		try {
			return (xi)(xi)this.av_fld.get();
		} catch (Exception var3) {
			return null;
		}
	}

	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "(Lay;)Lxi;"
	)
	public static xi dc(ay var0) {
		try {
			return (xi)(xi)var0.av_fld.get();
		} catch (Exception var2) {
			return null;
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void aa() {
		this.av_fld = this.az_fld.submit(new ag(this, this.ak_fld, this.ag_fld));
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ai() {
		this.av_fld = this.az_fld.submit(new ag(this, this.ak_fld, this.ag_fld));
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)[Llf;"
	)
	public static lf[] ak_Arrlf(int var0) {
		return new lf[]{lf.av_fld, lf.ak_fld, lf.az_fld, lf.ag_fld};
	}
}
