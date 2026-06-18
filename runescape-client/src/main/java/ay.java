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

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean ae() {
		return this.av_fld.isDone();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	void av() {
		this.av_fld = this.az_fld.submit(new ag(this, this.ak_fld, this.ag_fld));
	}

	public ay(xi var1, az var2) {
		this.ak_fld = var1;
		this.ag_fld = var2;
		this.av();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean ah() {
		return this.av_fld.isDone();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean aw() {
		return this.av_fld.isDone();
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	static final void bd() throws EOFException, UnsupportedEncodingException {
		if (client.jk_fld > 0) {
			kx.ab((short)24750);
		} else {
			client.ls_fld.az();
			jk.af(40, (byte)-28);
			ky.lm_fld = client.appletStub.ah();
			client.appletStub.av();
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

	@ObfuscatedName("rb")
	@ObfuscatedSignature(
		descriptor = "(Lay;I)V"
	)
	public static void rb(ay var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.az_fld.shutdown();
			var0.az_fld = null;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "()Lxi;"
	)
	public xi au() {
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

	@ObfuscatedName("gr")
	@ObfuscatedSignature(
		descriptor = "(Lay;)V"
	)
	public static void gr(ay var0) {
		var0.av_fld = var0.az_fld.submit(new ag(var0, var0.ak_fld, var0.ag_fld));
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "()Lxi;"
	)
	public xi ar() {
		try {
			return (xi)(xi)this.av_fld.get();
		} catch (Exception var2) {
			return null;
		}
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

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void an() {
		this.av_fld = this.az_fld.submit(new ag(this, this.ak_fld, this.ag_fld));
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Lxi;"
	)
	public xi az() {
		try {
			return (xi)(xi)this.av_fld.get();
		} catch (Exception var3) {
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

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(Lay;)V"
	)
	public static void bt(ay var0) {
		var0.av_fld = var0.az_fld.submit(new ag(var0, var0.ak_fld, var0.ag_fld));
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void ag(int var1) {
		this.az_fld.shutdown();
		this.az_fld = null;
	}
}
