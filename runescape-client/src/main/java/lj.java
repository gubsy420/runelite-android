import java.util.Iterator;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("lj")
public class lj {
	@ObfuscatedGetter(
		longValue = 1759021013247938635L
	)
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	long av_fld;
	@ObfuscatedGetter(
		longValue = 9026076030962052689L
	)
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	long ag_fld;
	@ObfuscatedGetter(
		longValue = -8575027818403066587L
	)
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	long az_fld;
	@ObfuscatedGetter(
		intValue = -1072646233
	)
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ay_fld;
	@ObfuscatedName("li")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	static boolean li_fld;
	@ObfuscatedGetter(
		longValue = 1288670881276854591L
	)
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	long ae_fld;
	@ObfuscatedGetter(
		longValue = 645258989969664211L
	)
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	long ah_fld;
	@ObfuscatedGetter(
		intValue = 297602563
	)
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int aw_fld;
	@ObfuscatedGetter(
		intValue = -904794441
	)
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int as_fld;
	@ObfuscatedGetter(
		intValue = -490521747
	)
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ar_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public boolean ak_fld = false;

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	public void aj(xi var1) {
		xy.ak(var1, this.ae_fld);
		long var2 = this.av_fld;
		var2 /= 10L;
		if (var2 < 0L) {
			var2 = 0L;
		} else if (var2 > 65535L) {
			var2 = 65535L;
		}

		var1.bw((int)var2);
		long var4 = this.ah_fld;
		var4 /= 10L;
		if (var4 < 0L) {
			var4 = 0L;
		} else if (var4 > 65535L) {
			var4 = 65535L;
		}

		var1.bw((int)var4);
		var1.bw(this.aw_fld);
		var1.bw(1994229541 * this.ay_fld);
		var1.bw(this.as_fld);
		var1.bw(this.ar_fld);
	}

	@ObfuscatedName("lm")
	@ObfuscatedSignature(
		descriptor = "(Llj;I)V"
	)
	public static void lm(lj var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var0.ag_fld != -1L) {
			var0.ae_fld = lz.ak() - var0.ag_fld;
			var0.ag_fld = 5440310270008829263L;
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
		descriptor = "()V"
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
		descriptor = "()V"
	)
	public void ag() {
		this.ag_fld = lz.ak();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ah() {
		this.ak_fld = false;
		this.ay_fld = 0;
	}

	@ObfuscatedName("nu")
	@ObfuscatedSignature(
		descriptor = "(Laax;)Ljava/lang/String;"
	)
	public static String nu(aax var0) {
		return var0.ak_fld;
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

		var0.bw((int)var1);
	}

	@ObfuscatedName("ju")
	@ObfuscatedSignature(
		descriptor = "(Llj;I)V"
	)
	public static void ju(lj var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.az_fld = lz.ak();
			var0.aw_fld = var1 * -343125905;
		}
	}

	@ObfuscatedName("we")
	@ObfuscatedSignature(
		descriptor = "(Llj;Lxi;I)V"
	)
	public static void we(lj var0, xi var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		xy.ak(var1, var0.ae_fld);
		long var3 = var0.av_fld;
		var3 /= 10L;
		if (var3 < 0L) {
			var3 = 0L;
		} else if (var3 > 65535L) {
			var3 = 65535L;
		}

		var1.bw((int)var3);
		long var5 = var0.ah_fld;
		var5 /= 10L;
		if (var5 < 0L) {
			var5 = 0L;
		} else if (var5 > 65535L) {
			var5 = 65535L;
		}

		var1.bw((int)var5);
		var1.bw(var0.aw_fld);
		var1.bw(var0.ay_fld);
		var1.bw(var0.as_fld);
		var1.bw(var0.ar_fld);
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

	@ObfuscatedName("kl")
	@ObfuscatedSignature(
		descriptor = "(Lxf;)Ljava/util/Iterator;"
	)
	public static Iterator kl(xf var0) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			var0.ak_fld.ak();
			return var0.ak_fld;
		}
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

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void aa() {
		if (this.az_fld != -1L) {
			this.av_fld = lz.ak() - this.az_fld;
			this.az_fld = -2064498456969692845L;
		}

		this.as_fld++;
		this.ak_fld = true;
	}

	@ObfuscatedName("ku")
	@ObfuscatedSignature(
		descriptor = "(Llj;Lxi;)V"
	)
	public static void ku(lj var0, xi var1) {
		xy.ak(var1, var0.ae_fld);
		long var2 = var0.av_fld;
		var2 /= 10L;
		if (var2 < 0L) {
			var2 = 0L;
		} else if (var2 > 65535L) {
			var2 = 65535L;
		}

		var1.bw((int)var2);
		long var4 = var0.ah_fld;
		var4 /= 10L;
		if (var4 < 0L) {
			var4 = 0L;
		} else if (var4 > 65535L) {
			var4 = 65535L;
		}

		var1.bw((int)var4);
		var1.bw(var0.aw_fld * 249296401);
		var1.bw(169196067 * var0.ay_fld);
		var1.bw(var0.as_fld * 636650768);
		var1.bw(var0.ar_fld * -1900895635);
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

		var1.bw((int)var2);
		long var4 = this.ah_fld;
		var4 /= 10L;
		if (var4 < 0L) {
			var4 = 0L;
		} else if (var4 > 65535L) {
			var4 = 65535L;
		}

		var1.bw((int)var4);
		var1.bw(this.aw_fld);
		var1.bw(this.ay_fld);
		var1.bw(this.as_fld);
		var1.bw(this.ar_fld);
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

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ap() {
		this.ae();
	}

	@ObfuscatedName("yy")
	@ObfuscatedSignature(
		descriptor = "(Llj;I)V"
	)
	public static void yy(lj var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ae();
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

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Llj;I)V"
	)
	public static void az(lj var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.az_fld = lz.ak();
		var0.aw_fld = var1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public static void ak() {
		za.ak_fld = new no();
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)I"
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

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void az(int var1) {
		this.ae_fld = lz.ak() * 2064498456969692845L;
		this.as_fld = var1 * -228946773;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void av(int var1, int var2) {
		this.ah_fld = lz.ak() * 2064498456969692845L;
		this.as_fld = var1 * -228946773;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	public void ay(xi var1, int var2) {
		xy.ak(var1, this.av_fld * 1288670881276854591L);
		long var3 = 1759021013247938635L * this.ag_fld;
		var3 /= 10L;
		if (var3 < 0L) {
			var3 = 0L;
		} else if (var3 > 65535L) {
			var3 = 65535L;
		}

		var1.en((int)var3);
		long var5 = 645258989969664211L * this.ag_fld;
		var5 /= 10L;
		if (var5 < 0L) {
			var5 = 0L;
		} else if (var5 > 65535L) {
			var5 = 65535L;
		}

		var1.ee((int)var5);
		var1.ce(this.ay_fld * 297602563);
		var1.cp(this.ay_fld);
		var1.cn(this.as_fld, 935547786);
		var1.cp(this.ay_fld * -490521747);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void au(int var1) {
		this.az(1945239349);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void aw(int var1) {
		this.au(1945239349);
	}
}
