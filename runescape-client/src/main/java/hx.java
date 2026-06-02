import java.io.EOFException;
import net.runelite.api.Nameable;
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
	@ObfuscatedGetter(
		intValue = 1878330377
	)
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
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

	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		descriptor = "()Laax;"
	)
	public aax hn() {
		return this.az_fld;
	}

	hx() {
	}

	@ObfuscatedName("getRank")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/clan/ClanRank;"
	)
	@Override
	public ClanRank getRank() {
		return client.os(this.cb());
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(Ltl;)I"
	)
	public static int bi(tl var0) {
		return var0.ah_fld;
	}

	@ObfuscatedName("ua")
	@ObfuscatedSignature(
		descriptor = "(Lnet/runelite/api/Nameable;)I"
	)
	public int ua(Nameable var1) {
		return this.getName().compareTo(var1.getName());
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "()B"
	)
	public byte cb() {
		return this.ak_fld;
	}

	@ObfuscatedName("getName")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	@Override
	public String getName() {
		aax var1 = this.hn();
		if (var1 == null) {
			return null;
		} else {
			String var2 = var1.ah();
			return var2 == null ? null : var2.replace(' ', ' ');
		}
	}

	@ObfuscatedName("getPrevName")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	@Override
	public String getPrevName() {
		return null;
	}

	@ObfuscatedName("getWorld")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getWorld() {
		return this.ag_fld;
	}

	@ObfuscatedName("fm")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	static void fm(int var0, int var1) throws EOFException {
		try {
			if (bp.na_fld == null || og.ci_fld.jj(bp.na_fld.az_fld, bp.na_fld.as_fld, -676770198)) {
				client.lf(og.ci_fld, var0, var1);
			} else if (client.nr_fld.ag_fld > 0) {
				cg.fd(var0, var1);
			}
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	// $VF: synthetic method
	// $VF: bridge method
	@ObfuscatedName("compareTo")
	@ObfuscatedSignature(
		descriptor = "(Lnet/runelite/api/Nameable;)I"
	)
	public int compareTo(Nameable var1) {
		return this.ua(var1);
	}

	@ObfuscatedName("ju")
	@ObfuscatedSignature(
		descriptor = "(Lui;Llu;)Z"
	)
	public static boolean ju(ui var0, lu var1) {
		return var1 == var0.ag_fld && 50 == var0.az_fld;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)D"
	)
	public static double av(int var0) {
		return pd.ag(var0) / 65536.0;
	}
}
