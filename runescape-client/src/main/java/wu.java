import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("wu")
public class wu implements xm {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lwu;"
	)
	static wu at_fld = new wu(8388608);
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lwu;"
	)
	public static wu af_fld = new wu(1024);
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lwu;"
	)
	public static wu ag_fld = new wu(2);
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lwu;"
	)
	public static wu av_fld = new wu(8);
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lwu;"
	)
	static wu ae_fld = new wu(16);
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lwu;"
	)
	static wu ah_fld = new wu(32);
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lwu;"
	)
	static wu aw_fld = new wu(64, true);
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lwu;"
	)
	static wu ay_fld = new wu(128);
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lwu;"
	)
	public static wu as_fld = new wu(256, true);
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lwu;"
	)
	static wu ar_fld = new wu(512);
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lwu;"
	)
	public static wu ak_fld = new wu(1);
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lwu;"
	)
	public static wu al_fld = new wu(2048);
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "Lwu;"
	)
	static wu bs_fld = new wu(Integer.MIN_VALUE);
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "Lwu;"
	)
	static wu bz_fld = new wu(268435456);
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lwu;"
	)
	static wu an_fld = new wu(16384);
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lwu;"
	)
	static wu aa_fld = new wu(32768);
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lwu;"
	)
	public static wu ai_fld = new wu(65536);
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lwu;"
	)
	static wu aq_fld = new wu(131072);
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lwu;"
	)
	static wu am_fld = new wu(262144);
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lwu;"
	)
	static wu ad_fld = new wu(524288);
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lwu;"
	)
	static wu au_fld = new wu(4096);
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lwu;"
	)
	public static wu az_fld = new wu(4);
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lwu;"
	)
	static wu ap_fld = new wu(4194304);
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lwu;"
	)
	static wu ax_fld = new wu(8192);
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lwu;"
	)
	public static wu aj_fld = new wu(33554432);
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lwu;"
	)
	static wu ac_fld = new wu(16777216);
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "Lwu;"
	)
	static wu bm_fld = new wu(67108864, true);
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "Lwu;"
	)
	public static wu bd_fld = new wu(134217728);
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lwu;"
	)
	static wu ab_fld = new wu(2097152);
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lwu;"
	)
	static wu ao_fld = new wu(1048576);
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "Lwu;"
	)
	public static wu be_fld = new wu(1073741824, true);
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "Lwu;"
	)
	public static wu br_fld = new wu(536870912, true);
	@ObfuscatedGetter(
		intValue = 1955187067
	)
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int bh_fld;

	wu(int var1) {
		this(var1, false);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	@Override
	public int ag(int var1) {
		return this.bh_fld;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxi;[I)[Ljava/lang/Object;"
	)
	static Object[] av(xi var0, int[] var1) {
		int var3 = var0.dz();
		Object[] var4 = (Object[])(new Object[var1.length * var3]);

		for (int var5 = 0; var5 < var3; var5++) {
			for (int var6 = 0; var6 < var1.length; var6++) {
				int var7 = var6 + var1.length * var5;
				yq var8 = eu.ag(var1[var6], -2109974368);
				var4[var7] = var8.as(var0);
			}
		}

		return (Object[])var4;
	}

	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "(Ltf;)V"
	)
	public static void di(tf var0) {
		if (var0 == null) {
			var0.getClass();
		}

		if (tf.qs_fld == var0 && !tf.qo_fld) {
			tf.qu_fld = 0L;
		}
	}

	wu(int var1, boolean var2) {
		this.bh_fld = var1;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int ae() {
		return this.bh_fld;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int ah() {
		return this.bh_fld;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int av() {
		return this.bh_fld;
	}
}
