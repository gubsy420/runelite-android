import net.runelite.api.FriendsChatMember;
import net.runelite.api.FriendsChatRank;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("rh")
@Implements({"FriendsChatMember"})
public class rh extends rr implements FriendsChatMember {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lrw;"
	)
	rw ak_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lrw;"
	)
	rw ag_fld;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int aa_fld;

	@ObfuscatedName("gg")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	static void gg(boolean var0) {
		client.nu_fld = var0;
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(Lqf;)V"
	)
	public static void cg(qf var0) {
		if (var0 == null) {
			var0.getClass();
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public final boolean au() {
		if (rw.ak_fld == this.ak_fld) {
			this.az(-930898849);
		}

		return this.ak_fld == rw.ag_fld;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	void ak(byte var1) {
		this.ak_fld = rw.ak_fld;
	}

	@ObfuscatedName("getRank")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/FriendsChatRank;"
	)
	@Override
	public FriendsChatRank getRank() {
		return FriendsChatRank.valueOf(this.tr());
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void av(int var1) {
		this.ag_fld = rw.ak_fld;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)Z"
	)
	public final boolean ah(byte var1) {
		if (rw.ak_fld == this.ag_fld) {
			this.aw((byte)10);
		}

		return rw.ag_fld == this.ag_fld;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void aq() {
		this.ag_fld = la.fq_fld.ah_fld.bo(this.az_fld, 41443888) ? rw.ag_fld : rw.az_fld;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void as() {
		this.ak_fld = rw.ak_fld;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ar() {
		this.ak_fld = rw.ak_fld;
	}

	rh() {
		this.ak_fld = rw.ak_fld;
		this.ag_fld = rw.ak_fld;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public final boolean al() {
		if (rw.ak_fld == this.ak_fld) {
			this.az(-930898849);
		}

		return this.ak_fld == rw.ag_fld;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(S)Z"
	)
	public final boolean ag(short var1) {
		if (rw.ak_fld == this.ak_fld) {
			this.az(-930898849);
		}

		return this.ak_fld == rw.ag_fld;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public final boolean ax() {
		if (rw.ak_fld == this.ak_fld) {
			this.az(-930898849);
		}

		return this.ak_fld == rw.ag_fld;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void an() {
		this.ak_fld = la.fq_fld.ae_fld.bo(this.az_fld, -948188672) ? rw.ag_fld : rw.az_fld;
	}

	@ObfuscatedName("hc")
	@ObfuscatedSignature(
		descriptor = "(Lrh;)V"
	)
	public static void hc(rh var0) {
		var0.ag_fld = la.fq_fld.ah_fld.bo(var0.az_fld, 1797529286) ? rw.ag_fld : rw.az_fld;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void aa() {
		this.ag_fld = rw.ak_fld;
	}

	@ObfuscatedName("oi")
	@ObfuscatedSignature(
		descriptor = "(Lrh;)Z"
	)
	public static boolean oi(rh var0) {
		if (rw.ak_fld == var0.ak_fld) {
			var0.az(-930898849);
		}

		return var0.ak_fld == rw.ag_fld;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ai() {
		this.ag_fld = la.fq_fld.ah_fld.bo(this.az_fld, 673626674) ? rw.ag_fld : rw.az_fld;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void az(int var1) {
		this.ak_fld = la.fq_fld.ae_fld.bo(this.az_fld, 1950446466) ? rw.ag_fld : rw.az_fld;
	}

	@ObfuscatedName("eu")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	static final void eu(int var0, int var1, int var2) {
		if (client.nr_fld.ag_fld >= 2 || 0 != client.ee_fld || client.nk_fld) {
			if (!client.ei_fld) {
				if (var2 > 843243582) {
					;
				}
			} else {
				String var5;
				label61: {
					int var3 = client.nr_fld.ag_fld - 1;
					if (client.ee_fld == 1) {
						if (var2 <= 843243582) {
							return;
						}

						if (client.nr_fld.ag_fld < 2) {
							var5 = kh.hj_fld + kh.hq_fld + client.it_fld + " " + db.ah_fld;
							break label61;
						}
					}

					if (client.nk_fld && client.nr_fld.ag_fld < 2) {
						var5 = client.om_fld + kh.hq_fld + client.oh_fld + " " + db.ah_fld;
					} else {
						var5 = client.nr_fld.ak(var3, 868339471);
					}
				}

				if (client.nr_fld.ag_fld > 2) {
					var5 = var5 + gd.ag(16777215, -1940547058) + " " + '/' + " " + (client.nr_fld.ag_fld - 2) + kh.hh_fld;
				}

				zv.lx(cu.dl_fld, var5, var0 + 4, 15 + var1, 16777215, 0, client.dv_fld / 1000);
			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	void aw(byte var1) {
		rw var10001;
		if (la.fq_fld.ah_fld.bo(this.az_fld, -367195080)) {
			if (var1 >= 21) {
				return;
			}

			var10001 = rw.ag_fld;
		} else {
			var10001 = rw.az_fld;
		}

		this.ag_fld = var10001;
	}
}
