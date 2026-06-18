import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("lj")
public class lj {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	@ObfuscatedGetter(
		longValue = 1759021013247938635L
	)
	long av_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	@ObfuscatedGetter(
		longValue = 9026076030962052689L
	)
	long ag_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	@ObfuscatedGetter(
		longValue = -8575027818403066587L
	)
	long az_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1072646233
	)
	int ay_fld;
	@ObfuscatedName("li")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	static boolean li_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	@ObfuscatedGetter(
		longValue = 1288670881276854591L
	)
	long ae_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	@ObfuscatedGetter(
		longValue = 645258989969664211L
	)
	long ah_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 297602563
	)
	int aw_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -904794441
	)
	int as_fld;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -490521747
	)
	int ar_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public boolean ak_fld = false;

	@ObfuscatedName("gt")
	@ObfuscatedSignature(
		descriptor = "(Llj;II)V"
	)
	public static void gt(lj var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.az_fld = lz.ak();
			var0.aw_fld = var1;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void az() {
		if (this.ag_fld != -1L) {
			this.ae_fld = lz.ak() - this.ag_fld;
			this.ag_fld = 5440310270008829263L;
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ai() {
		this.ak_fld = false;
		this.ay_fld = 0;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void ae() {
		if (this.az_fld != -1L) {
			this.av_fld = lz.ak() - this.az_fld;
			this.az_fld = -2064498456969692845L;
		}

		this.as_fld++;
		this.ak_fld = true;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void ag() {
		this.ag_fld = lz.ak();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	public void ah() {
		this.ak_fld = false;
		this.ay_fld = 0;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	public void ay(xi var1) {
		xy.ak(var1, this.ae_fld);
		long var3 = this.av_fld;
		var3 /= 10L;
		if (var3 < 0L) {
			var3 = 0L;
		} else if (var3 > 65535L) {
			var3 = 65535L;
		}

		xi.vy(var1, (int)var3);
		long var5 = this.ah_fld;
		var5 /= 10L;
		if (var5 < 0L) {
			var5 = 0L;
		} else if (var5 > 65535L) {
			var5 = 65535L;
		}

		xi.vy(var1, (int)var5);
		xi.vy(var1, this.aw_fld);
		xi.vy(var1, this.ay_fld);
		xi.vy(var1, this.as_fld);
		xi.vy(var1, this.ar_fld);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lxi;J)V"
	)
	static void as(xi var0, long var1) {
		var1 /= 10L;
		if (var1 < 0L) {
			var1 = 0L;
		} else if (var1 > 65535L) {
			var1 = 65535L;
		}

		xi.vy(var0, (int)var1);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ar() {
		this.ag_fld = lz.ak();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void an(int var1) {
		this.az_fld = lz.ak();
		this.aw_fld = var1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void al() {
		if (this.ag_fld != -1L) {
			this.ae_fld = lz.ak() - this.ag_fld;
			this.ag_fld = 5440310270008829263L;
		}
	}

	@ObfuscatedName("wn")
	@ObfuscatedSignature(
		descriptor = "(Llj;)V"
	)
	public static void wn(lj var0) {
		if (var0.az_fld != -1L) {
			var0.av_fld = lz.ak() - var0.az_fld;
			var0.az_fld = -2064498456969692845L;
		}

		var0.as_fld++;
		var0.ak_fld = true;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void au(int var1) {
		this.az_fld = lz.ak();
		this.aw_fld = var1 * -343125905;
	}

	@ObfuscatedName("we")
	@ObfuscatedSignature(
		descriptor = "(Llj;Lxi;)V"
	)
	public static void we(lj var0, xi var1) {
		xy.ak(var1, var0.ae_fld);
		long var2 = var0.av_fld;
		var2 /= 10L;
		if (var2 < 0L) {
			var2 = 0L;
		} else if (var2 > 65535L) {
			var2 = 65535L;
		}

		xi.vy(var1, (int)var2);
		long var4 = var0.ah_fld;
		var4 /= 10L;
		if (var4 < 0L) {
			var4 = 0L;
		} else if (var4 > 65535L) {
			var4 = 65535L;
		}

		xi.vy(var1, (int)var4);
		xi.vy(var1, var0.aw_fld);
		xi.vy(var1, 1994229541 * var0.ay_fld);
		xi.vy(var1, var0.as_fld);
		xi.vy(var1, var0.ar_fld);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void ax(int var1) {
		this.az_fld = lz.ak();
		this.aw_fld = var1;
	}

	public lj() {
		this.ag_fld = 5440310270008829263L;
		this.az_fld = -2064498456969692845L;
		this.av_fld = 0L;
		this.ae_fld = 0L;
		this.ah_fld = 0L;
		this.aw_fld = 0;
		this.ay_fld = 0;
		this.as_fld = 0;
		this.ar_fld = 0;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void aw() {
		this.ae();
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void am() {
		this.ae();
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	public void ac(xi var1) {
		xy.ak(var1, this.ae_fld);
		long var2 = this.av_fld;
		var2 /= 10L;
		if (var2 < 0L) {
			var2 = 0L;
		} else if (var2 > 65535L) {
			var2 = 65535L;
		}

		xi.vy(var1, (int)var2);
		long var4 = this.ah_fld;
		var4 /= 10L;
		if (var4 < 0L) {
			var4 = 0L;
		} else if (var4 > 65535L) {
			var4 = 65535L;
		}

		xi.vy(var1, (int)var4);
		xi.vy(var1, this.aw_fld);
		xi.vy(var1, this.ay_fld);
		xi.vy(var1, this.as_fld);
		xi.vy(var1, this.ar_fld);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ao() {
		this.ae();
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void aq() {
		this.ak_fld = false;
		this.ay_fld = 0;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	public void at(xi var1) {
		xy.ak(var1, this.ae_fld);
		long var2 = this.av_fld;
		var2 /= 10L;
		if (var2 < 0L) {
			var2 = 0L;
		} else if (var2 > 65535L) {
			var2 = 65535L;
		}

		xi.vy(var1, (int)var2);
		long var4 = this.ah_fld;
		var4 /= 10L;
		if (var4 < 0L) {
			var4 = 0L;
		} else if (var4 > 65535L) {
			var4 = 65535L;
		}

		xi.vy(var1, (int)var4);
		xi.vy(var1, this.aw_fld * 249296401);
		xi.vy(var1, 169196067 * this.ay_fld);
		xi.vy(var1, this.as_fld * 636650768);
		xi.vy(var1, this.ar_fld * -1900895635);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ad() {
		this.ae();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ab() {
		this.ae();
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	public static void ak() {
		za.ak_fld = new no();
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIB)I"
	)
	public static int ar(int var0, int var1) {
		int var3 = 0;

		while (var1 > 0) {
			var3 = var3 << 1 | var0 & 1;
			var0 >>>= 1;
			var1--;
		}

		return var3;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void av(int var1, int var2) {
		this.ag_fld = lz.ak() * 2064498456969692845L;
		this.ar_fld = var1 * -228946773;
	}
}
