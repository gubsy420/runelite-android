import java.util.concurrent.Future;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("qw")
public class qw {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ap_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	String ag_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/concurrent/Future;"
	)
	Future ak_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ae_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ah_fld;

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
	)
	void af(String var1) {
		if (null == var1) {
			var1 = "";
		}

		this.ag_fld = var1;
		if (this.ak_fld != null) {
			this.ak_fld.cancel(true);
			this.ak_fld = null;
		}
	}

	@ObfuscatedName("ly")
	@ObfuscatedSignature(
		descriptor = "(Lqw;Ljava/lang/String;)V"
	)
	public static void ly(qw var0, String var1) {
		if (var0 == null) {
			var0.getClass();
		}

		if (null == var1) {
			var1 = "";
		}

		var0.ag_fld = var1;
		if (var0.ak_fld != null) {
			var0.ak_fld.cancel(true);
			var0.ak_fld = null;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public final boolean av() {
		return this.az() ? true : this.ak_fld.isDone();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
	)
	void ag(String var1) {
		if (null == var1) {
			var1 = "";
		}

		this.ag_fld = var1;
		if (this.ak_fld != null) {
			this.ak_fld.cancel(true);
			this.ak_fld = null;
		}
	}

	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		descriptor = "(Lqw;)Lqx;"
	)
	public static qx hi(qw var0) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var0.az()) {
			return new qx(var0.ag_fld);
		} else if (!var0.av()) {
			return null;
		} else {
			try {
				return (qx)(qx)var0.ak_fld.get();
			} catch (Exception var3) {
				String var2 = "Error retrieving REST request reply";
				System.err.println(var2 + "\r\n" + var3);
				var0.ag(var2);
				return new qx(var2);
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean az() {
		return this.ag_fld != null || null == this.ak_fld;
	}

	qw(String var1) {
		this.ag(var1);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()Lqx;"
	)
	public final qx ae() {
		if (this.az()) {
			return new qx(this.ag_fld);
		} else if (!this.av()) {
			return null;
		} else {
			try {
				return (qx)(qx)this.ak_fld.get();
			} catch (Exception var4) {
				String var3 = "Error retrieving REST request reply";
				System.err.println(var3 + "\r\n" + var4);
				this.ag(var3);
				return new qx(var3);
			}
		}
	}

	@ObfuscatedName("eu")
	@ObfuscatedSignature(
		descriptor = "(Lqt;Lvp;)V"
	)
	public static void eu(qt var0, vp var1) {
		var0.av_fld.put("Content-Type", var1.ak());
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public final String aw() {
		return this.ag_fld;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public final String ak() {
		return this.ag_fld;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean au() {
		return this.ag_fld != null || null == this.ak_fld;
	}

	qw(Future var1) {
		this.ak_fld = var1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean an() {
		return this.ag_fld != null || null == this.ak_fld;
	}

	@ObfuscatedName("rr")
	@ObfuscatedSignature(
		descriptor = "(Lqw;)Lqx;"
	)
	public static qx rr(qw var0) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var0.az()) {
			return new qx(var0.ag_fld);
		} else if (!var0.av()) {
			return null;
		} else {
			try {
				return (qx)(qx)var0.ak_fld.get();
			} catch (Exception var3) {
				String var2 = "Error retrieving REST request reply";
				System.err.println(var2 + "\r\n" + var3);
				var0.ag(var2);
				return new qx(var2);
			}
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean ax() {
		return this.ag_fld != null || null == this.ak_fld;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public final boolean aa() {
		return this.az() ? true : this.ak_fld.isDone();
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public final boolean ai() {
		return this.az() ? true : this.ak_fld.isDone();
	}

	@ObfuscatedName("ul")
	@ObfuscatedSignature(
		descriptor = "(Lqw;Ljava/lang/String;)V"
	)
	public static void ul(qw var0, String var1) {
		if (var0 == null) {
			var0.getClass();
		} else {
			if (null == var1) {
				var1 = "";
			}

			var0.ag_fld = var1;
			if (var0.ak_fld != null) {
				var0.ak_fld.cancel(true);
				var0.ak_fld = null;
			}
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "()Lqx;"
	)
	public final qx aq() {
		if (this.az()) {
			return new qx(this.ag_fld);
		} else if (!this.av()) {
			return null;
		} else {
			try {
				return (qx)(qx)this.ak_fld.get();
			} catch (Exception var3) {
				String var2 = "Error retrieving REST request reply";
				System.err.println(var2 + "\r\n" + var3);
				this.ag(var2);
				return new qx(var2);
			}
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean al() {
		return this.ag_fld != null || null == this.ak_fld;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
	)
	void ar(String var1) {
		if (null == var1) {
			var1 = "";
		}

		this.ag_fld = var1;
		if (this.ak_fld != null) {
			this.ak_fld.cancel(true);
			this.ak_fld = null;
		}
	}
}
