import java.io.EOFException;
import net.runelite.api.FriendsChatManager;
import net.runelite.api.FriendsChatMember;
import net.runelite.api.FriendsChatRank;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;
import net.runelite.api.events.FriendsChatMemberJoined;
import net.runelite.api.events.FriendsChatMemberLeft;

@ObfuscatedName("rb")
@Implements({"FriendsChatManager"})
public class rb extends rc implements FriendsChatManager {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	public String av_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ak_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lrf;"
	)
	rf az_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lzo;"
	)
	zo ag_fld;
	@ObfuscatedGetter(
		intValue = 1114562991
	)
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int aw_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "B"
	)
	public byte ah_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	public String ae_fld = null;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ay_fld;

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V"
	)
	final void al(String var1, int var2) {
		long var6 = 0L;
		int var8 = var1.length();

		for (int var9 = 0; var9 < var8; var9++) {
			var6 *= 37L;
			char var10 = var1.charAt(var9);
			if (var10 >= 'A' && var10 <= 'Z') {
				var6 += 1 + var10 - 65;
			} else if (var10 >= 'a' && var10 <= 'z') {
				var6 += 1 + var10 - 97;
			} else if (var10 >= '0') {
				if (var2 <= 145841401) {
					return;
				}

				if (var10 <= '9') {
					var6 += var10 + 27 - 48;
				}
			}

			if (var6 >= 177917621779460413L) {
				break;
			}
		}

		while (0L == var6 % 37L && var6 != 0L) {
			var6 /= 37L;
		}

		String var11 = je.ak(var6);
		if (null == var11) {
			var11 = "";
		}

		this.av_fld = var11;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public final void bs() {
		for (int var1 = 0; var1 < this.bl(-1440239599); var1++) {
			((rh)rc.sc(this, var1)).av(678568415);
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)[Lrl;"
	)
	@Override
	rl[] ag(int var1, int var2) {
		return new rh[var1];
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V"
	)
	final void az(String var1, int var2) {
		long var6 = 0L;
		int var8 = var1.length();

		for (int var9 = 0; var9 < var8; var9++) {
			label80: {
				var6 *= 37L;
				char var10 = var1.charAt(var9);
				if (var10 >= 'A') {
					if (var2 >= -802528384) {
						return;
					}

					if (var10 <= 'Z') {
						var6 += 1 + var10 - 65;
						break label80;
					}
				}

				if (var10 >= 'a' && var10 <= 'z') {
					var6 += var10 + 1 - 97;
				} else if (var10 >= '0' && var10 <= '9') {
					var6 += 27 + var10 - 48;
				}
			}

			if (var6 >= 177917621779460413L) {
				break;
			}
		}

		while (var6 % 37L == 0L && 0L != var6) {
			var6 /= 37L;
		}

		String var11 = je.ak(var6);
		if (null == var11) {
			if (var2 >= -802528384) {
				return;
			}

			var11 = "";
		}

		this.ae_fld = var11;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	public final void aa(byte var1) {
		for (int var2 = 0; var2 < this.bl(-1440239599); var2++) {
			((rh)rc.sc(this, var2)).av(-1345752389);
		}
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(Ldx;Lrg;ZB)V"
	)
	static void cz(dx var0, rg var1, boolean var2, byte var3) throws EOFException {
		try {
			boolean var4 = var1.aw_fld.aj_fld && !var2;
			long var5 = 0L;
			boolean var7 = 1674941469 * var1.ah_fld.ag_fld == client.es_fld;
			kt var8 = var1.ar(var7, -2090888340);
			if (kt.av_fld == var8) {
				var5 = dt.ay(0, 0, 0, 5, false, 0, 0);
			} else if (var4 && kt.ag_fld != var8) {
				if (var3 == 6) {
					return;
				}

				boolean var10000;
				if (var8 == kt.ak_fld) {
					if (var3 == 6) {
						return;
					}

					var10000 = true;
				} else {
					var10000 = false;
				}

				boolean var9 = var10000;
				var5 = dt.ay(var1.ak(-2065911971), kj.ay(var1.dp(-1101844172)), kj.ay(var1.dj(189745805)), 4, !var9, var1.ae_fld, var0.ag_fld);
			}

			var1.av_fld.ar(jf.dv(var0, var1.dp(1631658729), var1.dj(189745805), var0.ae_fld));
			var1.ah_fld.az_fld.dx(client.dv_fld);
			var1.az(var2, -751402843);
			boolean var13 = var0.az_fld
				.bj(var0.ae_fld, var1.dp(483526315), var1.dj(189745805), var1.ae(-576143203), 60, var1.ah_fld.az_fld, var1.ah(575532640), var5, false);
			if (var13 && !var2) {
				dx var10 = var1.ah_fld;
				if (client.ec_fld) {
					hb.cw(var10, client.dj_fld, false, (byte)-61);
				}

				dx var11 = var1.ah_fld;
				if (client.nq_fld >= 0 && var11.au_fld.ak(client.nq_fld) != null) {
					hb.cw(var11, client.nq_fld, false, (byte)13);
				}

				bu.cm(var1.ah_fld, or.ak_fld, -433702046);
				hd.cg(var1.ah_fld, -2119820701);
				bu.cm(var1.ah_fld, or.ag_fld, -394707938);
				bu.cm(var1.ah_fld, or.az_fld, -757862531);
				bj.cj(var1.ah_fld, (byte)77);
			}
		} catch (Throwable var12) {
			throw new RuntimeException(var12);
		}
	}

	@ObfuscatedName("jc")
	@ObfuscatedSignature(
		descriptor = "()B"
	)
	public byte jc() {
		return this.ah_fld;
	}

	@ObfuscatedName("getKickRank")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/FriendsChatRank;"
	)
	@Override
	public FriendsChatRank getKickRank() {
		return FriendsChatRank.valueOf(this.jc());
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
	)
	final void ao(String var1) {
		long var5 = 0L;
		int var7 = var1.length();

		for (int var8 = 0; var8 < var7; var8++) {
			var5 *= 37L;
			char var9 = var1.charAt(var8);
			if (var9 >= -1966170267 && var9 <= -798593402) {
				var5 += 1 + var9 - -157312737;
			} else if (var9 >= -1283529279 && var9 <= -1872244008) {
				var5 += 1 + var9 - -1855076728;
			} else if (var9 >= '0' && var9 <= 852096753) {
				var5 += var9 + 27 - 48;
			}

			if (var5 >= 177917621779460413L) {
				break;
			}
		}

		while (0L == var5 % 37L && var5 != 0L) {
			var5 /= 37L;
		}

		String var10 = je.ak(var5);
		if (null == var10) {
			var10 = "";
		}

		this.av_fld = var10;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public final void an(int var1) {
		for (int var2 = 0; var2 < this.bl(-1440239599); var2++) {
			if (var1 <= 144931585) {
				return;
			}

			((rh)rc.sc(this, var2)).ak((byte)8);
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)[Lrl;"
	)
	@Override
	rl[] ay(int var1) {
		return new rh[var1];
	}

	@ObfuscatedName("qk")
	@ObfuscatedSignature(
		descriptor = "(Lrb;Lxi;)V"
	)
	public static void qk(rb var0, xi var1) {
		if (var0 == null) {
			var0.getClass();
		}

		aax var2 = new aax(xi.kc(var1, -1974486485), var0.ag_fld);
		int var3 = xi.tx(var1, 674503582);
		byte var4 = xi.rp(var1, 882847705);
		boolean var5 = false;
		if (var4 == -128) {
			var5 = true;
		}

		if (var5) {
			if (var0.bl(-1440239599) == 0) {
				return;
			}

			rh var6 = (rh)var0.bt(var2, (byte)-13);
			if (null != var6 && var6.by(-677493741) == var3) {
				var0.cc(var6, 1159633868);
			}
		} else {
			xi.kc(var1, -530377479);
			rh var7 = (rh)var0.bt(var2, (byte)-118);
			if (null == var7) {
				if (var0.bl(-1440239599) > var0.as_fld) {
					return;
				}

				var7 = (rh)var0.bn(var2, -163757184);
			}

			var7.bf(var3, (var0.ay_fld += -1853487359) * 1806366977 - 1, 1848106603);
			var7.aw_fld = var4;
			nl(var0, var7, (byte)38);
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
	)
	final void ab(String var1) {
		long var5 = 0L;
		int var7 = var1.length();

		for (int var8 = 0; var8 < var7; var8++) {
			var5 *= 37L;
			char var9 = var1.charAt(var8);
			if (var9 >= -106893947 && var9 <= 'Z') {
				var5 += 1 + var9 - 347402759;
			} else if (var9 >= 'a' && var9 <= -142645166) {
				var5 += 1 + var9 - -2122464100;
			} else if (var9 >= '0' && var9 <= -1923733127) {
				var5 += var9 + 27 - 48;
			}

			if (var5 >= 177917621779460413L) {
				break;
			}
		}

		while (0L == var5 % 37L && var5 != 0L) {
			var5 /= 37L;
		}

		String var10 = je.ak(var5);
		if (null == var10) {
			var10 = "";
		}

		this.av_fld = var10;
	}

	@ObfuscatedName("it")
	@ObfuscatedSignature(
		descriptor = "(Lfn;Lfn;)V"
	)
	public static void it(fn var0, fn var1) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var1 != null) {
			var0.ag(var1);

			for (int var2 = 0; var2 < var1.bw_fld; var2++) {
				var0.ba_fld[var0.bw_fld] = var1.ba_fld[var2] + var0.cz_fld;
				var0.bq_fld[var0.bw_fld] = var1.bq_fld[var2] + var0.cz_fld;
				var0.bg_fld[var0.bw_fld] = var1.bg_fld[var2] + var0.cz_fld;
				var0.bb_fld[var0.bw_fld] = var1.bb_fld[var2];
				var0.cd_fld[var0.bw_fld] = var1.cd_fld[var2];
				var0.cc_fld[var0.bw_fld] = var1.cc_fld[var2];
				if (var0.cx_fld != null) {
					var0.cx_fld[var0.bw_fld] = var1.cx_fld != null ? var1.cx_fld[var2] : var1.cs_fld;
				}

				if (var0.cv_fld != null && var1.cv_fld != null) {
					var0.cv_fld[var0.bw_fld] = var1.cv_fld[var2];
				}

				if (var0.cf_fld != null) {
					var0.cf_fld[var0.bw_fld] = var1.cf_fld != null ? var1.cf_fld[var2] : -1;
				}

				if (var0.cq_fld != null) {
					if (var1.cq_fld != null && var1.cq_fld[var2] != -1) {
						var0.cq_fld[var0.bw_fld] = (byte)(var1.cq_fld[var2] + var0.cb_fld);
					} else {
						var0.cq_fld[var0.bw_fld] = -1;
					}
				}

				if (var0.cy_fld != null && var1.cy_fld != null) {
					var0.cy_fld[var0.bw_fld] = var1.cy_fld[var2];
				}

				var0.bw_fld++;
			}

			for (int var3 = 0; var3 < var1.cb_fld; var3++) {
				var0.ce_fld[var0.cb_fld] = var1.ce_fld[var3] + var0.cz_fld;
				var0.cn_fld[var0.cb_fld] = var1.cn_fld[var3] + var0.cz_fld;
				var0.cr_fld[var0.cb_fld] = var1.cr_fld[var3] + var0.cz_fld;
				var0.cb_fld++;
			}

			for (int var4 = 0; var4 < var1.cz_fld; var4++) {
				var0.yk_fld[var0.cz_fld] = var1.yk_fld[var4];
				var0.vr_fld[var0.cz_fld] = var1.vr_fld[var4];
				var0.qo_fld[var0.cz_fld] = var1.qo_fld[var4];
				var0.cz_fld++;
			}
		}
	}

	@ObfuscatedName("getOwner")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	@Override
	public String getOwner() {
		return this.av_fld;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()Lrl;"
	)
	@Override
	rl av() {
		return new rh();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)[Lrl;"
	)
	@Override
	rl[] ah(int var1) {
		return new rh[var1];
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)[Lrl;"
	)
	@Override
	rl[] aw(int var1) {
		return new rh[var1];
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public final void bz() {
		for (int var1 = 0; var1 < this.bl(-1440239599); var1++) {
			((rh)rc.sc(this, var1)).ak((byte)8);
		}
	}

	public rb(zo var1, rf var2) {
		super(500);
		this.av_fld = null;
		this.ay_fld = -1853487359;
		this.ag_fld = var1;
		this.az_fld = var2;
	}

	@ObfuscatedName("gf")
	@ObfuscatedSignature(
		descriptor = "(Lrb;Ljava/lang/String;)V"
	)
	public static void gf(rb var0, String var1) {
		if (var0 == null) {
			var0.getClass();
		}

		long var5 = 0L;
		int var7 = var1.length();

		for (int var8 = 0; var8 < var7; var8++) {
			var5 *= 37L;
			char var9 = var1.charAt(var8);
			if (var9 >= 310845080 && var9 <= 580708524) {
				var5 += 1 + var9 - 65;
			} else if (var9 >= 'a' && var9 <= 'z') {
				var5 += 1 + var9 - -1573132506;
			} else if (var9 >= 1146047113 && var9 <= '9') {
				var5 += var9 + 27 - -1854328618;
			}

			if (var5 >= 177917621779460413L) {
				break;
			}
		}

		while (0L == var5 % 37L && var5 != 0L) {
			var5 /= 37L;
		}

		String var10 = je.ak(var5);
		if (null == var10) {
			var10 = "";
		}

		var0.av_fld = var10;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)[Lrl;"
	)
	@Override
	rl[] ar(int var1) {
		return new rh[var1];
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)[Lrl;"
	)
	@Override
	rl[] af(int var1) {
		return new rh[var1];
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
	)
	final void am(String var1) {
		long var5 = 0L;
		int var7 = var1.length();

		for (int var8 = 0; var8 < var7; var8++) {
			var5 *= 37L;
			char var9 = var1.charAt(var8);
			if (var9 >= 'A' && var9 <= -1298543888) {
				var5 += 1 + var9 - 65;
			} else if (var9 >= 1440601833 && var9 <= 'z') {
				var5 += 1 + var9 - 97;
			} else if (var9 >= 1261775081 && var9 <= '9') {
				var5 += var9 + 27 - 48;
			}

			if (var5 >= 177917621779460413L) {
				break;
			}
		}

		while (0L == var5 % 37L && var5 != 0L) {
			var5 /= 37L;
		}

		String var10 = je.ak(var5);
		if (null == var10) {
			var10 = "";
		}

		this.av_fld = var10;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	public final void ac(xi var1) {
		aax var2 = new aax(xi.kc(var1, -1898843187), this.ag_fld);
		int var3 = xi.tx(var1, 760056997);
		byte var4 = xi.rp(var1, -555715234);
		boolean var5 = false;
		if (var4 == -1463261169) {
			var5 = true;
		}

		if (var5) {
			if (this.bl(-1440239599) == 0) {
				return;
			}

			rh var6 = (rh)this.bt(var2, (byte)-21);
			if (null != var6 && var6.by(190627172) == var3) {
				this.cc(var6, -1407499067);
			}
		} else {
			xi.kc(var1, -589379328);
			rh var7 = (rh)this.bt(var2, (byte)-103);
			if (null == var7) {
				if (this.bl(-1440239599) > this.as_fld) {
					return;
				}

				var7 = (rh)this.bn(var2, -1608165875);
			}

			var7.bf(var3, (this.ay_fld += -2104820503) * 1795425476 - 1, -1748050332);
			var7.aw_fld = var4 * 90740052;
			nl(this, var7, (byte)-57);
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	public final void ap(xi var1) {
		this.al(xi.kc(var1, 835717485), 1808173465);
		long var2 = xi.ob(var1, 119389206);
		long var5 = var2;
		String var4;
		if (var2 <= 0L || var2 >= 6582952005840035281L) {
			var4 = null;
		} else if (0L == var2 % 37L) {
			var4 = null;
		} else {
			int var7 = 0;

			for (long var8 = var2; 0L != var8; var8 /= 37L) {
				var7++;
			}

			StringBuilder var10 = new StringBuilder(var7);

			while (0L != var5) {
				long var11 = var5;
				var5 /= 37L;
				var10.append(nq.ak_fld[(int)(var11 - 37L * var5)]);
			}

			var4 = var10.reverse().toString();
		}

		this.az(var4, -1999755964);
		this.ah_fld = xi.rp(var1, 1479425841);
		int var13 = var1.dt();
		if (-1 != var13) {
			rc.ns(this, (byte)0);

			for (int var14 = 0; var14 < var13; var14++) {
				rh var9 = (rh)this.bn(new aax(xi.kc(var1, -416913698), this.ag_fld), 869040231);
				int var15 = xi.tx(var1, 1558076819);
				var9.bf(var15, (this.ay_fld += -1853487359) * 364332461 - 1, 1649461350);
				var9.aw_fld = xi.rp(var1, -116328715);
				xi.kc(var1, -1262628619);
				nl(this, var9, (byte)12);
			}
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	public final void at(xi var1) {
		aax var2 = new aax(xi.kc(var1, -871016775), this.ag_fld);
		int var3 = xi.tx(var1, 1740492696);
		byte var4 = xi.rp(var1, -1279680058);
		boolean var5 = false;
		if (var4 == -128) {
			var5 = true;
		}

		if (var5) {
			if (this.bl(-1440239599) == 0) {
				return;
			}

			rh var6 = (rh)this.bt(var2, (byte)-63);
			if (null != var6 && var6.by(-890620073) == var3) {
				this.cc(var6, 652862117);
			}
		} else {
			xi.kc(var1, 1333344187);
			rh var7 = (rh)this.bt(var2, (byte)-1);
			if (null == var7) {
				if (this.bl(-1440239599) > this.as_fld) {
					return;
				}

				var7 = (rh)this.bn(var2, 1259620663);
			}

			var7.bf(var3, (this.ay_fld += -1853487359) * 1806366977 - 1, 604712834);
			var7.aw_fld = var4;
			nl(this, var7, (byte)23);
		}
	}

	@ObfuscatedName("zh")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int zh() {
		return this.aw_fld;
	}

	@ObfuscatedName("sy")
	@ObfuscatedSignature(
		descriptor = "(Lrb;)V"
	)
	public static void sy(rb var0) {
		if (var0 == null) {
			var0.getClass();
		}

		for (int var1 = 0; var1 < var0.bl(-1440239599); var1++) {
			((rh)rc.sc(var0, var1)).ak((byte)8);
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public final void be() {
		for (int var1 = 0; var1 < this.bl(-1440239599); var1++) {
			((rh)rc.sc(this, var1)).av(-579205412);
		}
	}

	@ObfuscatedName("pl")
	@ObfuscatedSignature(
		descriptor = "(Lrb;Lxi;)V"
	)
	public static void pl(rb var0, xi var1) {
		if (var0 == null) {
			var0.getClass();
		}

		aax var2 = new aax(xi.kc(var1, -219278422), var0.ag_fld);
		int var3 = xi.tx(var1, 2018463435);
		byte var4 = xi.rp(var1, 92057297);
		boolean var5 = false;
		if (var4 == -128) {
			var5 = true;
		}

		if (var5) {
			if (var0.bl(-1440239599) == 0) {
				return;
			}

			rh var6 = (rh)var0.bt(var2, (byte)-110);
			if (null != var6 && var6.by(-817265344) == var3) {
				var0.cc(var6, -1690035185);
			}
		} else {
			xi.kc(var1, -269950032);
			rh var7 = (rh)var0.bt(var2, (byte)-32);
			if (null == var7) {
				if (var0.bl(-1440239599) > var0.as_fld) {
					return;
				}

				var7 = (rh)var0.bn(var2, 807528067);
			}

			var7.bf(var3, (var0.ay_fld += -1853487359) * 1806366977 - 1, 1112710534);
			var7.aw_fld = var4;
			nl(var0, var7, (byte)-35);
		}
	}

	@ObfuscatedName("nl")
	@ObfuscatedSignature(
		descriptor = "(Lrb;Lrh;B)V"
	)
	public static void nl(rb var0, rh var1, byte var2) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var1.ap(-1939318074).equals(var0.az_fld.jn((byte)-21))) {
			var0.aw_fld = -1603137939 * var1.aw_fld;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()Lrl;"
	)
	@Override
	rl ae() {
		return new rh();
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public final void bh() {
		for (int var1 = 0; var1 < this.bl(-1440239599); var1++) {
			((rh)rc.sc(this, var1)).ak((byte)8);
		}
	}

	@ObfuscatedName("getName")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	@Override
	public String getName() {
		return this.ae_fld;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)Lrl;"
	)
	@Override
	rl ak(byte var1) {
		return new rh();
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public final void br() {
		for (int var1 = 0; var1 < this.bl(-1440239599); var1++) {
			((rh)rc.sc(this, var1)).av(-706346168);
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	public final void au(xi var1, int var2) {
		String var5;
		label72: {
			this.al(xi.kc(var1, 1968652022), 950427643);
			long var3 = xi.ob(var1, 935773509);
			long var6 = var3;
			if (var3 > 0L) {
				if (var3 < 6582952005840035281L) {
					if (0L == var3 % 37L) {
						var5 = null;
					} else {
						int var8 = 0;

						for (long var9 = var3; 0L != var9; var9 /= 37L) {
							var8++;
						}

						StringBuilder var11 = new StringBuilder(var8);

						while (0L != var6) {
							long var12 = var6;
							var6 /= 37L;
							var11.append(nq.ak_fld[(int)(var12 - 37L * var6)]);
						}

						var5 = var11.reverse().toString();
					}
					break label72;
				}

				if (var2 == 1928880298) {
					return;
				}
			}

			var5 = null;
		}

		this.az(var5, -1943651412);
		this.ah_fld = xi.rp(var1, 1237994879);
		int var14 = var1.dt();
		if (-1 != var14) {
			rc.ns(this, (byte)0);

			for (int var15 = 0; var15 < var14; var15++) {
				rh var10 = (rh)this.bn(new aax(xi.kc(var1, 1393630778), this.ag_fld), 1604280484);
				int var16 = xi.tx(var1, 908437707);
				var10.bf(var16, (this.ay_fld += -1853487359) * 1806366977 - 1, -851311615);
				var10.aw_fld = xi.rp(var1, -1814449368);
				xi.kc(var1, -1286407543);
				nl(this, var10, (byte)-37);
			}
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lxi;B)V"
	)
	public final void ax(xi var1, byte var2) {
		aax var3 = new aax(xi.kc(var1, 169325846), this.ag_fld);
		int var4 = xi.tx(var1, 1114264328);
		byte var5 = xi.rp(var1, -744645455);
		boolean var6 = false;
		if (var5 == -128) {
			var6 = true;
		}

		if (var6) {
			if (this.bl(-1440239599) == 0) {
				return;
			}

			rh var7 = (rh)this.bt(var3, (byte)-13);
			if (null != var7 && var7.by(-606131735) == var4) {
				this.cc(var7, -1845243005);
			}
		} else {
			xi.kc(var1, -273386591);
			rh var8 = (rh)this.bt(var3, (byte)-110);
			if (null == var8) {
				if (this.bl(-1440239599) > this.as_fld) {
					return;
				}

				var8 = (rh)this.bn(var3, 1243981962);
			}

			var8.bf(var4, (this.ay_fld += -1853487359) * 1806366977 - 1, 2059852882);
			var8.aw_fld = var5;
			nl(this, var8, (byte)34);
		}
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(Lrh;)V"
	)
	final void bk(rh var1) {
		if (var1.ap(-1939318074).equals(this.az_fld.jn((byte)-24))) {
			this.aw_fld = -1603137939 * var1.aw_fld;
		}
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(Lrh;)V"
	)
	final void bj(rh var1) {
		if (var1.ap(-1939318074).equals(this.az_fld.jn((byte)-59))) {
			this.aw_fld = 482770202 * var1.aw_fld;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IB)I"
	)
	static int ar(int var0, byte var1) {
		co var2 = (co)cz.ag_fld.ak(var0);
		if (null == var2) {
			return -1;
		} else {
			return cz.az_fld.ak_fld == var2.fn_fld ? -1 : ((co)var2.fn_fld).ak_fld * 1492045231;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)[Lrl;"
	)
	@Override
	rl[] as(int var1) {
		return new rh[var1];
	}

	@ObfuscatedName("fm")
	@ObfuscatedSignature(
		descriptor = "(Laax;Laax;)V"
	)
	@Override
	public void fm(aax var1, aax var2) {
		FriendsChatMember var3 = (FriendsChatMember)this.nf(var1);
		if (var3 != null) {
			FriendsChatMemberJoined var4 = new FriendsChatMemberJoined(var3);
			og.ci_fld.getCallbacks().postDeferred(var4);
		}
	}

	@ObfuscatedName("em")
	@ObfuscatedSignature(
		descriptor = "(Lrl;)V"
	)
	@Override
	public void em(rl var1) {
		FriendsChatMember var2 = (FriendsChatMember)this.nf(var1.tq());
		if (var2 != null) {
			FriendsChatMemberLeft var3 = new FriendsChatMemberLeft(var2);
			og.ci_fld.getCallbacks().postDeferred(var3);
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lrh;B)V"
	)
	final void ai(rh var1, byte var2) {
		if (var1.ap(-1939318074).jm(this.az_fld.jn((byte)-21))) {
			this.aw_fld = -1603137939 * var1.aw_fld;
		}
	}

	@ObfuscatedName("we")
	@ObfuscatedSignature(
		descriptor = "(Lrb;Ljava/lang/String;)V"
	)
	public static void we(rb var0, String var1) {
		if (var0 == null) {
			var0.getClass();
		} else {
			long var5 = 0L;
			int var7 = var1.length();

			for (int var8 = 0; var8 < var7; var8++) {
				var5 *= 37L;
				char var9 = var1.charAt(var8);
				if (var9 >= 'A' && var9 <= 1782121538) {
					var5 += 1 + var9 - -1419832142;
				} else if (var9 >= -371341482 && var9 <= 'z') {
					var5 += var9 + 1 - 97;
				} else if (var9 >= -772877854 && var9 <= 324941391) {
					var5 += 27 + var9 - -647496039;
				}

				if (var5 >= 177917621779460413L) {
					break;
				}
			}

			while (var5 % 37L == 0L && 0L != var5) {
				var5 /= 37L;
			}

			String var10 = je.ak(var5);
			if (null == var10) {
				var10 = "";
			}

			var0.ae_fld = var10;
		}
	}

	@ObfuscatedName("getMyRank")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/FriendsChatRank;"
	)
	@Override
	public FriendsChatRank getMyRank() {
		return FriendsChatRank.valueOf(this.zh());
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	public final void aj(xi var1) {
		aax var2 = new aax(xi.kc(var1, -1898843187), this.ag_fld);
		int var3 = xi.tx(var1, 760056997);
		byte var4 = xi.rp(var1, -555715234);
		boolean var5 = false;
		if (var4 == -1463261169) {
			var5 = true;
		}

		if (var5) {
			if (this.bl(-1440239599) == 0) {
				return;
			}

			rh var6 = (rh)this.bv(var2, (byte)-21);
			if (null != var6 && var6.by(190627172) == var3) {
				this.bb(var6, -1407499067);
			}
		} else {
			xi.kc(var1, -589379328);
			rh var7 = (rh)this.bv(var2, (byte)-103);
			if (null == var7) {
				if (this.bl(-1440239599) > this.as_fld) {
					return;
				}

				var7 = (rh)this.bn(var2, -1608165875);
			}

			var7.bf(var3, (this.ay_fld += -2104820503) * 1795425476 - 1, -1748050332);
			var7.aw_fld = var4 * 90740052;
			nl(this, var7, (byte)-57);
		}
	}

	@ObfuscatedName("findByName")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)Lnet/runelite/api/FriendsChatMember;"
	)
	public FriendsChatMember findByName(String var1) {
		return (FriendsChatMember)(FriendsChatMember)this.findByName(var1);
	}

	@ObfuscatedName("getMembers")
	@ObfuscatedSignature(
		descriptor = "()[Lnet/runelite/api/FriendsChatMember;"
	)
	public FriendsChatMember[] getMembers() {
		return (FriendsChatMember[])this.getMembers();
	}
}
