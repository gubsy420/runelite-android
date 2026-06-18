import java.time.LocalDate;
import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;
import net.runelite.api.clan.ClanMember;
import net.runelite.api.clan.ClanRank;

@ObfuscatedName("rl1")
@Implements({"ClanMember"})
public class rl1 implements ClanMember {
	@ObfuscatedName("qm")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public ik qm_fld;
	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int dq_fld;

	@ObfuscatedName("toString")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	@Export("toString")
	@Override
	public String toString() {
		return "ClanMemberImpl(getName=" + this.getName() + ", getRank=" + this.getRank() + ")";
	}

	@ObfuscatedName("hashCode")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("hashCode")
	@Override
	public int hashCode() {
		byte var1 = 59;
		byte var2 = 1;
		String var3 = this.getName();
		int var5 = var2 * 59 + (var3 == null ? 43 : var3.hashCode());
		ClanRank var4 = this.getRank();
		return var5 * 59 + (var4 == null ? 43 : var4.hashCode());
	}

	@ObfuscatedName("getJoinDate")
	@ObfuscatedSignature(
		descriptor = "()Ljava/time/LocalDate;"
	)
	@Export("getJoinDate")
	@Override
	public LocalDate getJoinDate() {
		int var1 = this.qm_fld.ad_fld[this.dq_fld];
		return LocalDate.ofEpochDay(11745 + var1);
	}

	@ObfuscatedName("em")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	public boolean em(Object var1) {
		return var1 instanceof rl1;
	}

	@ObfuscatedName("getName")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	@Export("getName")
	@Override
	public String getName() {
		return this.qm_fld.fg()[this.dq_fld];
	}

	@ObfuscatedName("getRank")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/clan/ClanRank;"
	)
	@Export("getRank")
	@Override
	public ClanRank getRank() {
		return client.sk(this.qm_fld.mp()[this.dq_fld]);
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(Lbw;)V"
	)
	public static void cb(bw var0) {
		var0.ak_fld.shutdown();
		var0.ak_fld = null;
	}

	@ObfuscatedName("equals")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	@Export("equals")
	@Override
	public boolean equals(Object var1) {
		if (var1 == this) {
			return true;
		} else if (!(var1 instanceof rl1)) {
			return false;
		} else {
			rl1 var2 = (rl1)var1;
			if (!var2.em(this)) {
				return false;
			} else {
				String var3 = this.getName();
				String var4 = var2.getName();
				if (var3 == null ? var4 == null : var3.equals(var4)) {
					ClanRank var5 = this.getRank();
					ClanRank var6 = var2.getRank();
					return var5 == null ? var6 == null : var5.equals(var6);
				} else {
					return false;
				}
			}
		}
	}

	public rl1(ik var1, int var2) {
		this.qm_fld = var1;
		this.dq_fld = var2;
	}
}
