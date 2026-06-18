import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;
import net.runelite.api.clan.ClanChannel;
import net.runelite.api.clan.ClanChannelMember;
import net.runelite.api.events.ClanMemberJoined;
import net.runelite.api.events.ClanMemberLeft;

@ObfuscatedName("ib")
@Implements({"ClanChannel"})
public class ib extends vw implements ClanChannel {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean aw_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	@ObfuscatedGetter(
		longValue = 89774674213838977L
	)
	public long ag_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	public String az_fld = null;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/List;"
	)
	public List ak_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "B"
	)
	public byte ae_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean ah_fld;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ai_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] ay_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "B"
	)
	public byte av_fld;

	@ObfuscatedName("se")
	@ObfuscatedSignature(
		descriptor = "(Lib;)I"
	)
	public static int se(ib var0) {
		return var0.ak_fld.size();
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)[I"
	)
	public int[] ak(int var1) {
		if (null == this.ay_fld) {
			String[] var2 = new String[this.ak_fld.size()];
			this.ay_fld = new int[this.ak_fld.size()];

			for (int var3 = 0; var3 < this.ak_fld.size(); this.ay_fld[var3] = var3++) {
				var2[var3] = aax.xq(((hx)this.ak_fld.get(var3)).az_fld, -120170284);
			}

			int[] var4 = this.ay_fld;
			mf.az(var2, var4, 0, var2.length - 1);
		}

		return this.ay_fld;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lhx;I)V"
	)
	void ag(hx var1, int var2) {
		this.ak_fld.add(var1);
		this.ay_fld = null;
		this.jc(var1);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void az(int var1, int var2) {
		this.wq(var1);
		this.ak_fld.remove(var1);
		this.ay_fld = null;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int av(int var1) {
		return this.ak_fld.size();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lhx;)V"
	)
	void ay(hx var1) {
		this.ak_fld.add(var1);
		this.ay_fld = null;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lxi;B)V"
	)
	void ah(xi var1, byte var2) {
		int var3 = var1.cg();
		if (0 != (var3 & 1)) {
			if (var2 >= 15) {
				return;
			}

			this.ah_fld = true;
		}

		if (0 != (var3 & 2)) {
			this.aw_fld = true;
		}

		int var4 = 2;
		if ((var3 & 4) != 0) {
			var4 = var1.cg();
		}

		this.hc_long = var1.cu();
		this.ag_fld = var1.cu();
		this.az_fld = xi.at(var1, -347123913);
		var1.cj();
		this.ae_fld = var1.cw();
		this.av_fld = var1.cw();
		int var5 = var1.cm();
		if (var5 > 0) {
			if (var2 >= 15) {
				return;
			}

			this.ak_fld = new ArrayList(var5);

			for (int var6 = 0; var6 < var5; var6++) {
				hx var7 = new hx();
				if (this.ah_fld) {
					var1.cu();
				}

				if (this.aw_fld) {
					var7.az_fld = new aax(xi.at(var1, -1550465849));
				}

				var7.ak_fld = var1.cw();
				var7.ag_fld = var1.cm() * 1009140281;
				if (var4 >= 3) {
					var1.cj();
				}

				this.ak_fld.add(var6, var7);
			}
		}
	}

	static {
		new BitSet(65536);
	}

	@ObfuscatedName("jc")
	@ObfuscatedSignature(
		descriptor = "(Lhx;)V"
	)
	public void jc(hx var1) {
		og.ci_fld.getCallbacks().post(new ClanMemberJoined(this, var1));
	}

	@ObfuscatedName("wq")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void wq(int var1) {
		List var2 = this.getMembers();
		hx var3 = (hx)(hx)var2.get(var1);
		og.ci_fld.getCallbacks().post(new ClanMemberLeft(this, var3));
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "()[I"
	)
	public int[] aw() {
		if (null == this.ay_fld) {
			String[] var1 = new String[this.ak_fld.size()];
			this.ay_fld = new int[this.ak_fld.size()];

			for (int var2 = 0; var2 < this.ak_fld.size(); this.ay_fld[var2] = var2++) {
				var1[var2] = aax.xq(((hx)this.ak_fld.get(var2)).az_fld, 1311152590);
			}

			int[] var3 = this.ay_fld;
			mf.az(var1, var3, 0, var1.length - 1);
		}

		return this.ay_fld;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	void an(xi var1) {
		int var2 = var1.cg();
		if (0 != (var2 & 1)) {
			this.ah_fld = true;
		}

		if (0 != (var2 & 2)) {
			this.aw_fld = true;
		}

		int var3 = 2;
		if ((var2 & 4) != 0) {
			var3 = var1.cg();
		}

		this.hc_long = var1.cu();
		this.ag_fld = var1.cu();
		this.az_fld = xi.at(var1, 1579531551);
		var1.cj();
		this.ae_fld = var1.cw();
		this.av_fld = var1.cw();
		int var4 = var1.cm();
		if (var4 > 0) {
			this.ak_fld = new ArrayList(var4);

			for (int var5 = 0; var5 < var4; var5++) {
				hx var6 = new hx();
				if (this.ah_fld) {
					var1.cu();
				}

				if (this.aw_fld) {
					var6.az_fld = new aax(xi.at(var1, -871510959));
				}

				var6.ak_fld = var1.cw();
				var6.ag_fld = var1.cm() * 1009140281;
				if (var3 >= 3) {
					var1.cj();
				}

				this.ak_fld.add(var5, var6);
			}
		}
	}

	@ObfuscatedName("findMember")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)Lnet/runelite/api/clan/ClanChannelMember;"
	)
	@Export("findMember")
	@Override
	public ClanChannelMember findMember(String var1) {
		aax var2 = new aax(var1, fr.gv_fld);
		var1 = var2.vg();
		if (var1 == null) {
			return null;
		} else {
			List var3 = this.getMembers();
			int[] var4 = this.lm();
			int var5 = 0;
			int var6 = var4.length - 1;

			while (var5 <= var6) {
				int var7 = var5 + var6 >>> 1;
				int var8 = var4[var7];
				hx var9 = (hx)(hx)var3.get(var8);
				int var10 = var9.pf().vg().compareTo(var1);
				if (var10 < 0) {
					var5 = var7 + 1;
				} else {
					if (var10 <= 0) {
						return var9;
					}

					var6 = var7 - 1;
				}
			}

			return null;
		}
	}

	@ObfuscatedName("iu")
	@ObfuscatedSignature(
		descriptor = "(Lxz;J)Lvw;"
	)
	public static vw iu(xz var0, long var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return xz.tw(var0, var1);
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void as(int var1) {
		this.ak_fld.remove(var1);
		this.ay_fld = null;
	}

	@ObfuscatedName("getName")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	@Export("getName")
	@Override
	public String getName() {
		return this.az_fld;
	}

	@ObfuscatedName("getMembers")
	@ObfuscatedSignature(
		descriptor = "()Ljava/util/List;"
	)
	@Export("getMembers")
	@Override
	public List getMembers() {
		return this.ak_fld;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I"
	)
	public int ae(String var1, int var2) {
		if (!this.aw_fld) {
			throw new RuntimeException("Displaynames not available");
		} else {
			for (int var3 = 0; var3 < this.ak_fld.size(); var3++) {
				if (((hx)this.ak_fld.get(var3)).az_fld.ak(417590657).equalsIgnoreCase(var1)) {
					return var3;
				}
			}

			return -1;
		}
	}

	@ObfuscatedName("sf")
	@ObfuscatedSignature(
		descriptor = "(Lib;I)V"
	)
	public static void sf(ib var0, int var1) {
		var0.ak_fld.remove(var1);
		var0.ay_fld = null;
	}

	public ib(xi var1) {
		this.aw_fld = true;
		this.ah(var1, (byte)-44);
	}

	@ObfuscatedName("lm")
	@ObfuscatedSignature(
		descriptor = "()[I"
	)
	public int[] lm() {
		return this.ak(585672594);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)I"
	)
	public int ax(String var1) {
		if (!this.aw_fld) {
			throw new RuntimeException("Displaynames not available");
		} else {
			for (int var2 = 0; var2 < this.ak_fld.size(); var2++) {
				if (((hx)this.ak_fld.get(var2)).az_fld.ak(1633470833).equalsIgnoreCase(var1)) {
					return var2;
				}
			}

			return -1;
		}
	}
}
