import java.io.EOFException;
import net.runelite.api.Nameable;
import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;
import net.runelite.api.clan.ClanChannelMember;
import net.runelite.api.clan.ClanRank;

@ObfuscatedName("hx")
@Implements({"ClanChannelMember"})
public class hx implements ClanChannelMember {
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ae_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 126140545
	)
	public int ag_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Laax;"
	)
	public aax az_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int as_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "B"
	)
	public byte ak_fld;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int au_fld;
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	static String bp_fld;

	hx() {
	}

	// $VF: synthetic method
	// $VF: bridge method
	@ObfuscatedName("compareTo")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)I"
	)
	public int compareTo(Nameable var1) {
		return this.rq(var1);
	}

	@ObfuscatedName("getName")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	@Export("getName")
	@Override
	public String getName() {
		aax var1 = this.pf();
		if (var1 == null) {
			return null;
		} else {
			String var2 = var1.cl();
			return var2 == null ? null : var2.replace(' ', ' ');
		}
	}

	@ObfuscatedName("pf")
	@ObfuscatedSignature(
		descriptor = "()Laax;"
	)
	public aax pf() {
		return this.az_fld;
	}

	@ObfuscatedName("wq")
	@ObfuscatedSignature(
		descriptor = "(Lfn;III)V"
	)
	public static void wq(fn var0, int var1, int var2, int var3) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.nh(var1, var2, var3);
			var0.fn_Arrfloat = new float[var1];
			var0.rl_fld = new float[var1];
			var0.kp_fld = new float[var1];
			var0.ba_fld = new int[var2];
			var0.bq_fld = new int[var2];
			var0.bg_fld = new int[var2];
			var0.bb_fld = new int[var2];
			var0.cd_fld = new int[var2];
			var0.cc_fld = new int[var2];
			if (var3 > 0) {
				var0.ce_fld = new int[var3];
				var0.cn_fld = new int[var3];
				var0.cr_fld = new int[var3];
			}
		}
	}

	@ObfuscatedName("getWorld")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getWorld")
	@Override
	public int getWorld() {
		return this.ag_fld;
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "()B"
	)
	public byte bw() {
		return this.ak_fld;
	}

	@ObfuscatedName("fm")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	static void fm(int var0, int var1) throws EOFException {
		try {
			if (bp.na_fld == null || og.ci_fld.jj(bp.na_fld.az_fld, bp.na_fld.as_fld, -676770198)) {
				og.ci_fld.jk(var0, var1, 2021900374);
			} else if (client.nr_fld.ot_fld > 0) {
				cg.fd(var0, var1);
			}
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("getPrevName")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	@Export("getPrevName")
	@Override
	public String getPrevName() {
		return null;
	}

	@ObfuscatedName("getRank")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/clan/ClanRank;"
	)
	@Export("getRank")
	@Override
	public ClanRank getRank() {
		return client.sk(this.bw());
	}

	@ObfuscatedName("rq")
	@ObfuscatedSignature(
		descriptor = "(Lnet/runelite/api/Nameable;)I"
	)
	public int rq(Nameable var1) {
		return this.getName().compareTo(var1.getName());
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IB)D"
	)
	public static double av(int var0) {
		return pd.ag(var0) / 65536.0;
	}
}
