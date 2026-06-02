import java.time.LocalDate;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;
import net.runelite.api.clan.ClanMember;
import net.runelite.api.clan.ClanRank;

@ObfuscatedName("rl1")
@Implements({"ClanMember"})
public class rl1 implements ClanMember {
	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public ik hv_fld;
	@ObfuscatedName("of")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int of_fld;

	@ObfuscatedName("hashCode")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int hashCode() {
		byte var1 = 59;
		byte var2 = 1;
		String var3 = this.getName();
		int var5 = var2 * 59 + (var3 == null ? 43 : var3.hashCode());
		ClanRank var4 = this.getRank();
		return var5 * 59 + (var4 == null ? 43 : var4.hashCode());
	}

	@ObfuscatedName("ua")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	public boolean ua(Object var1) {
		return var1 instanceof rl1;
	}

	@ObfuscatedName("ju")
	@ObfuscatedSignature(
		descriptor = "(Lgf;)I"
	)
	public static int ju(gf var0) {
		return var0.aw_fld.ag_fld * -621797759;
	}

	@ObfuscatedName("getName")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	@Override
	public String getName() {
		return this.hv_fld.wf()[this.of_fld];
	}

	@ObfuscatedName("pt")
	@ObfuscatedSignature(
		descriptor = "(Lwz;)V"
	)
	public static void pt(wz var0) {
		if (var0 == null) {
			var0.getClass();
		}

		wz.hg(var0, (short)17731);
	}

	@ObfuscatedName("lx")
	@ObfuscatedSignature(
		descriptor = "(Lfn;)V"
	)
	public static void lx(fn var0) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.ch_fld = null;
		}
	}

	@ObfuscatedName("getRank")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/clan/ClanRank;"
	)
	@Override
	public ClanRank getRank() {
		return client.os(this.hv_fld.sp()[this.of_fld]);
	}

	@ObfuscatedName("ei")
	@ObfuscatedSignature(
		descriptor = "(Lub;I)I"
	)
	public static int ei(ub var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else if (var0.bc_fld != null && var1 < var0.bc_fld.length) {
			Object[] var3 = (Object[])var0.bc_fld[var1];
			return var3 == null ? 0 : var3.length;
		} else {
			return 0;
		}
	}

	@ObfuscatedName("toString")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	@Override
	public String toString() {
		return "ClanMemberImpl(getName=" + this.getName() + ", getRank=" + this.getRank() + ")";
	}

	@ObfuscatedName("equals")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	@Override
	public boolean equals(Object var1) {
		if (var1 == this) {
			return true;
		} else if (!(var1 instanceof rl1)) {
			return false;
		} else {
			rl1 var2 = (rl1)var1;
			if (!var2.ua(this)) {
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

	@ObfuscatedName("getJoinDate")
	@ObfuscatedSignature(
		descriptor = "()Ljava/time/LocalDate;"
	)
	@Override
	public LocalDate getJoinDate() {
		int var1 = this.hv_fld.ad_fld[this.of_fld];
		return LocalDate.ofEpochDay(11745 + var1);
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(Lsl;)[Ljava/lang/Object;"
	)
	public static Object[] bo(sl var0) {
		return (Object[])var0.as_fld;
	}

	public rl1(ik var1, int var2) {
		this.hv_fld = var1;
		this.of_fld = var2;
	}
}
