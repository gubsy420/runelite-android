import java.io.EOFException;
import java.util.concurrent.ExecutionException;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("dk")
public class dk implements po {
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int bt_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ag_fld;

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Override
	public void aa() {
		qu.eh();
		client.nr_fld.ay_fld[0] = 0;
		client.nr_fld.as_fld[0] = kh.ky_fld;
		client.nr_fld.ar_fld[0] = "";
		client.nr_fld.ae_fld[0] = 1006;
		client.nr_fld.al_fld[0] = false;
		client.nr_fld.af_fld[0] = null;
		client.nr_fld.ot_fld = 1120518047;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	public void ak(int var1) {
		qu.eh();
		client.nr_fld.ay_fld[0] = 0;
		client.nr_fld.as_fld[0] = kh.ky_fld;
		client.nr_fld.ar_fld[0] = "";
		client.nr_fld.ae_fld[0] = 1006;
		client.nr_fld.al_fld[0] = false;
		client.nr_fld.af_fld[0] = null;
		client.nr_fld.ot_fld = 1120518047;
		client.nr_fld.dr(-1);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V"
	)
	@Override
	public void ag(int var1, int var2, int var3, int var4, int var5) throws EOFException {
		qk.fq(var1, var2, var3, var4, (byte)25);
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(Llu;)V"
	)
	@Override
	public void bc(lu var1) {
		if (var1 == null) {
			client.fy_fld.az(-1217093185);
		} else {
			li var2 = lu.ax(var1, -1406236923);
			if (null != var2 && var2.bg()) {
				client.fy_fld.ag(var1, 114546440);
				var2.ag(true);
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/lang/String;S)V"
	)
	@Override
	public void av(int var1, int var2, int var3, int var4, String var5, short var6) throws EOFException {
		nt.fc(var1, var2, var3, var4, var5, -1645686255);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/lang/String;Ljava/lang/String;I)V"
	)
	@Override
	public void ae(int var1, int var2, int var3, int var4, String var5, String var6, int var7) throws EOFException {
		ls.fj(var1, var2, var3, var4, var5, var6, -1659592859);
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/lang/String;Ljava/lang/String;)V"
	)
	@Override
	public void bm(int var1, int var2, int var3, int var4, String var5, String var6) throws EOFException {
		ls.fj(var1, var2, var3, var4, var5, var6, -1328032089);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	public void aw(int var1) {
		ot.ft();
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/lang/String;)V"
	)
	@Override
	public void ac(int var1, int var2, int var3, int var4, String var5) throws EOFException {
		nt.fc(var1, var2, var3, var4, var5, -929609726);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lyz;B)V"
	)
	@Override
	public void as(yz var1, byte var2) throws EOFException {
		va.ak(var1);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lyz;B)V"
	)
	@Override
	public void ar(yz var1, byte var2) throws EOFException {
		pm.ag(var1, 5000000, 0);
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Override
	public void bz() throws EOFException {
		yq.fb(-230716951);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IB)F"
	)
	public static float ak(int var0, byte var1) {
		var0 &= 16383;
		return (float)(var0 * 3.834951969714103E-4);
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(Llu;Llu;)V"
	)
	@Override
	public void bt(lu var1, lu var2) throws EOFException {
		if (null != var2 && uo.kl(cf.cg_fld, var1, -446176385) != null) {
			jm var3 = gi.ak(jb.bb_fld, client.appletStub.av_fld);
			var3.ay_fld.et(var1.bf_fld);
			var3.ay_fld.ek(var1.by_fld);
			var3.ay_fld.eb(var2.bf_fld);
			var3.ay_fld.ek(var1.ga_fld);
			var3.ay_fld.ca(var2.ga_fld);
			var3.ay_fld.ba(var2.by_fld);
			client.appletStub.az(var3);
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	@Override
	public void ax(int var1, int var2, int var3) throws EOFException {
		hx.fm(var1, var2);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Override
	public void an() {
		qu.eh();
		client.nr_fld.ay_fld[0] = 0;
		client.nr_fld.as_fld[0] = kh.ky_fld;
		client.nr_fld.ar_fld[0] = "";
		client.nr_fld.ae_fld[0] = 1006;
		client.nr_fld.al_fld[0] = false;
		client.nr_fld.af_fld[0] = null;
		client.nr_fld.ot_fld = 1120518047;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/lang/String;Ljava/lang/String;)V"
	)
	@Override
	public void aj(int var1, int var2, int var3, int var4, String var5, String var6) throws EOFException {
		ls.fj(var1, var2, var3, var4, var5, var6, 731772337);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	@Override
	public void ai(int var1, int var2, int var3, int var4) throws EOFException {
		qk.fq(var1, var2, var3, var4, (byte)25);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIB)V"
	)
	@Override
	public void ay(int var1, int var2, byte var3) throws EOFException {
		cg.fd(var1, var2);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Llu;)V"
	)
	@Override
	public void am(lu var1) throws EOFException {
		ah.ff(var1, 1795657678);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Llu;)V"
	)
	@Override
	public void ad(lu var1) throws EOFException {
		ah.ff(var1, -146448236);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Llu;)V"
	)
	@Override
	public void ao(lu var1) throws EOFException {
		ah.ff(var1, 19905529);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/lang/String;)V"
	)
	@Override
	public void at(int var1, int var2, int var3, int var4, String var5) throws EOFException {
		nt.fc(var1, var2, var3, var4, var5, -1667973816);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/lang/String;)V"
	)
	@Override
	public void ap(int var1, int var2, int var3, int var4, String var5) throws EOFException {
		nt.fc(var1, var2, var3, var4, var5, -915942662);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Llu;)V"
	)
	@Override
	public void aq(lu var1) throws EOFException {
		ah.ff(var1, -1254136907);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Llu;Llu;I)V"
	)
	@Override
	public void au(lu var1, lu var2, int var3) throws EOFException {
		if (null != var2) {
			if (var3 <= 681955997) {
				return;
			}

			if (uo.kl(cf.cg_fld, var1, -446176385) != null) {
				if (var3 <= 681955997) {
					return;
				}

				jm var4 = gi.ak(jb.bb_fld, client.appletStub.av_fld);
				var4.ay_fld.et(var1.bf_fld);
				var4.ay_fld.ek(var1.by_fld);
				var4.ay_fld.eb(var2.bf_fld);
				var4.ay_fld.ek(var1.ga_fld);
				var4.ay_fld.ca(var2.ga_fld);
				var4.ay_fld.ba(var2.by_fld);
				client.appletStub.az(var4);
			}
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	public void ah(int var1) throws EOFException {
		yq.fb(1829938097);
	}

	dk() {
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/lang/String;Ljava/lang/String;)V"
	)
	@Override
	public void bd(int var1, int var2, int var3, int var4, String var5, String var6) throws EOFException {
		ls.fj(var1, var2, var3, var4, var5, var6, 55852907);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Llu;B)V"
	)
	@Override
	public void az(lu var1, byte var2) throws EOFException {
		ah.ff(var1, 832859991);
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Override
	public void br() throws EOFException {
		yq.fb(658776636);
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Override
	public void be() throws EOFException {
		yq.fb(1139098878);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Llu;B)V"
	)
	@Override
	public void af(lu var1, byte var2) {
		if (var1 != null && var1.bx(2006632790) != null) {
			var1.bx(1057783637).ak().ag(1, var1.bx(2064352836).ax());
			switch (var1.bj(-1760983287)) {
				case 0:
					by.ak(var1.by(1021960398));
					break;
				case 1:
					int var4 = uo.xd(cf.cg_fld, var1, -442481562);
					boolean var3 = (var4 >> 22 & 1) != 0;
					if (var3) {
						int[] var5 = var1.bl(679355698);
						if (var5 != null) {
							jm var6 = gi.ak(jb.aw_fld, client.appletStub.av_fld);
							var6.ay_fld.cp(var5[1]);
							var6.ay_fld.et(var1.bf((short)-10676));
							var6.ay_fld.eb(var5[2]);
							var6.ay_fld.ek(var1.by_fld);
							var6.ay_fld.et(var1.bf_fld);
							var6.ay_fld.eb(var5[0]);
							client.appletStub.az(var6);
						}
					}
			}
		}
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Override
	public void bh() {
		ot.ft();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/lang/String;)V"
	)
	@Override
	public void ab(int var1, int var2, int var3, int var4, String var5) throws EOFException {
		nt.fc(var1, var2, var3, var4, var5, -2069782584);
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	@Override
	public void bj(int var1, int var2) throws EOFException {
		cg.fd(var1, var2);
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(Lyz;)V"
	)
	@Override
	public void bf(yz var1) throws EOFException {
		va.ak(var1);
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Override
	public void bk() {
		ot.ft();
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(Lyz;)V"
	)
	@Override
	public void bl(yz var1) throws EOFException {
		pm.ag(var1, 5000000, 0);
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(Lyz;)V"
	)
	@Override
	public void bx(yz var1) throws EOFException {
		pm.ag(var1, 1803187509, 0);
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(Lyz;)V"
	)
	@Override
	public void bo(yz var1) throws EOFException {
		pm.ag(var1, 5000000, 0);
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(Llu;)V"
	)
	@Override
	public void bp(lu var1) {
		if (var1 != null && var1.bx(2123543202) != null) {
			var1.bx(768543345).ak().ag(1, var1.bx(1595595690).ax());
			switch (var1.bj(526903060)) {
				case 0:
					by.ak(var1.by(1021960398));
					break;
				case 1:
					int var3 = uo.xd(cf.cg_fld, var1, -769695449);
					boolean var2 = (var3 >> 22 & 1) != 0;
					if (var2) {
						int[] var4 = var1.bl(679355698);
						if (var4 != null) {
							jm var5 = gi.ak(jb.aw_fld, client.appletStub.av_fld);
							var5.ay_fld.cp(var4[1]);
							var5.ay_fld.et(var1.bf((short)2942));
							var5.ay_fld.eb(var4[2]);
							var5.ay_fld.ek(var1.by_fld * -731957991);
							var5.ay_fld.et(var1.bf_fld * 1862044542);
							var5.ay_fld.eb(var4[0]);
							client.appletStub.az(var5);
						}
					}
			}
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Llu;B)V"
	)
	@Override
	public void al(lu var1, byte var2) {
		if (var1 == null) {
			client.fy_fld.az(-1812476833);
		} else {
			li var3 = lu.ax(var1, -494977130);
			if (null != var3 && var3.bg()) {
				client.fy_fld.ag(var1, 114546440);
				var3.ag(true);
			}
		}
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(Llu;Llu;)V"
	)
	@Override
	public void bv(lu var1, lu var2) throws EOFException {
		if (null != var2 && uo.kl(cf.cg_fld, var1, -446176385) != null) {
			jm var3 = gi.ak(jb.bb_fld, client.appletStub.av_fld);
			var3.ay_fld.et(var1.bf_fld);
			var3.ay_fld.ek(var1.by_fld);
			var3.ay_fld.eb(var2.bf_fld);
			var3.ay_fld.ek(var1.ga_fld * -1332560746);
			var3.ay_fld.ca(var2.ga_fld);
			var3.ay_fld.ba(var2.by_fld);
			client.appletStub.az(var3);
		}
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(Llu;Llu;)V"
	)
	@Override
	public void bi(lu var1, lu var2) throws EOFException {
		if (null != var2 && uo.kl(cf.cg_fld, var1, -446176385) != null) {
			jm var3 = gi.ak(jb.bb_fld, client.appletStub.av_fld);
			var3.ay_fld.et(var1.bf_fld);
			var3.ay_fld.ek(var1.by_fld);
			var3.ay_fld.eb(var2.bf_fld);
			var3.ay_fld.ek(var1.ga_fld);
			var3.ay_fld.ca(var2.ga_fld);
			var3.ay_fld.ba(var2.by_fld);
			client.appletStub.az(var3);
		}
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	@Override
	public void bu(int var1, int var2) throws EOFException {
		hx.fm(var1, var2);
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(Llu;)V"
	)
	@Override
	public void bn(lu var1) {
		if (var1 == null) {
			client.fy_fld.az(-869234753);
		} else {
			li var2 = lu.ax(var1, -1263362483);
			if (null != var2 && var2.bg()) {
				client.fy_fld.ag(var1, 114546440);
				var2.ag(true);
			}
		}
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(Lyz;)V"
	)
	@Override
	public void by(yz var1) throws EOFException {
		va.ak(var1);
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(Llu;)V"
	)
	@Override
	public void bw(lu var1) {
		if (var1 == null) {
			client.fy_fld.az(-1440486595);
		} else {
			li var2 = lu.ax(var1, -1754659732);
			if (null != var2 && var2.bg()) {
				client.fy_fld.ag(var1, 114546440);
				var2.ag(true);
			}
		}
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(ILba;ZS)I"
	)
	static int bl(int var0, ba var1, boolean var2) {
		return 2;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Override
	public void bs() {
		ot.ft();
	}

	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "(Lxj;B)V"
	)
	static final void dd(xj var0) throws ExecutionException, InterruptedException, EOFException {
		client.qn(var0);
		boolean var2 = var0.cg() == 1;
		int var3 = var0.cm();
		int var4 = var0.ex();
		client.qf_fld.as(var0);
		of.dl(client.qf_fld, var3, var4, var2);
		client.ec(var0);
	}
}
