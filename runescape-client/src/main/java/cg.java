import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("cg")
class cg implements kk {
	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int bx_fld;
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	static String by_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ae_fld;
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "Luf;"
	)
	static uf bc_fld;
	// $VF: synthetic field
	@ObfuscatedName("val$item")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	lu val$item;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int az_fld;

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Override
	public void av() {
		if (this.val$item.bn((byte)-32).av_fld != null) {
			yz var1 = yb.vn(tu.ak(this.val$item).av((Object[])this.val$item.bn((byte)-73).av_fld, 1953159966), -1435729531);
			client.cz_fld.ak(var1);
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	public void ak(int var1) {
		if (this.val$item.bn((byte)-74).av_fld != null) {
			yz var2 = yb.vn(tu.ak(this.val$item).av((Object[])this.val$item.bn((byte)-108).av_fld, 1907818634), -973516412);
			client.cz_fld.ak(var2);
		}
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(Lcv;III)V"
	)
	static void cv(cv var0, int var1, int var2, int var3) throws EOFException {
		if (var0 == null) {
			if (var3 != 1468977391) {
				;
			}
		} else {
			ol var4 = qa.kw(var0.cm_fld, -1444819123);
			if (var1 == qa.ps(var0.cm_fld, (byte)-104) && var1 != -1) {
				int var5 = var4.ba_fld;
				if (1 == var5) {
					if (var3 == 1468977391) {
						return;
					}

					var0.cm_fld.ar(461909079);
					var0.cq_fld = var2;
				}

				if (2 == var5) {
					qa.qn(var0.cm_fld, 1755011114);
				}
			} else {
				if (-1 != var1) {
					if (var3 == 1468977391) {
						return;
					}

					if (qa.jv(var0.cm_fld, 943184831) && hm.ak(var1).bv_fld * -1232992871 < var4.bv_fld) {
						return;
					}
				}

				qa.hs(var0.cm_fld, var1, -2126378263);
				var0.cm_fld.ar(461909079);
				var0.cq_fld = var2;
				var0.bg_fld = var0.ce_fld;
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Override
	public void az() {
		if (this.val$item.bn((byte)-105).av_fld != null) {
			yz var1 = yb.vn(tu.ak(this.val$item).av((Object[])this.val$item.bn((byte)-47).av_fld, 1401490844), 479971869);
			client.cz_fld.ak(var1);
		}
	}

	cg(lu var1) {
		this.val$item = var1;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Override
	public void ae() {
		if (this.val$item.bn((byte)-18).av_fld != null) {
			yz var1 = yb.vn(tu.ak(this.val$item).av((Object[])this.val$item.bn((byte)6).av_fld, 2045155374), -463573427);
			client.cz_fld.ak(var1);
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Override
	public void ag() {
		if (this.val$item.bn((byte)-41).av_fld != null) {
			yz var1 = yb.vn(tu.ak(this.val$item).av((Object[])this.val$item.bn((byte)-110).av_fld, 1480078561), 1460875404);
			client.cz_fld.ak(var1);
		}
	}

	@ObfuscatedName("fd")
	@ObfuscatedSignature(
		descriptor = "(IIS)V"
	)
	static void fd(int var0, int var1) throws EOFException {
		bi var3 = bp.na_fld;
		if (var3 != null) {
			qd.fa(var3.ak_fld, var3.ag_fld, var3.az_fld, var3.av_fld, var3.ae_fld, var3.ah_fld, var3.aw_fld, var3.ay_fld, var0, var1);
		}

		bp.na_fld = null;
		client.uo();
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(ILba;ZI)I"
	)
	static int bi(int var0, ba var1, boolean var2) throws FileNotFoundException, EOFException, UnsupportedEncodingException {
		if (var0 == 5000) {
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.ka_fld;
			return 1;
		} else if (5001 == var0) {
			gz.ax_fld -= 3;
			client.ka_fld = -1983418707 * bp.au_fld[gz.ax_fld];
			hb.kt_fld = ue.ak(bp.au_fld[1 + gz.ax_fld], (byte)69);
			if (null == hb.kt_fld) {
				hb.kt_fld = yt.ag_fld;
			}

			client.kf_fld = bp.au_fld[2 + gz.ax_fld];
			jm var21 = gi.ak(jb.bw_fld, client.appletStub.av_fld);
			var21.ay_fld.ea(client.ka_fld);
			var21.ay_fld.ea(hb.kt_fld.av_fld);
			var21.ay_fld.ea(client.kf_fld);
			client.appletStub.az(var21);
			return 1;
		} else if (var0 == 5002) {
			String var20 = (String)bp.ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			gz.ax_fld -= 2;
			int var29 = bp.au_fld[gz.ax_fld];
			int var34 = bp.au_fld[gz.ax_fld + 1];
			jm var36 = gi.ak(jb.de_fld, client.appletStub.av_fld);
			var36.ay_fld.ea(iq.bu(var20) + 2);
			xi.ph(var36.ay_fld, var20, 892643611);
			var36.ay_fld.ea(var29 - 1);
			var36.ay_fld.ea(var34);
			client.appletStub.az(var36);
			return 1;
		} else if (var0 == 5003) {
			gz.ax_fld -= 2;
			int var19 = bp.au_fld[gz.ax_fld];
			int var28 = bp.au_fld[gz.ax_fld + 1];
			co var33 = bn.av(var19, var28);
			if (null != var33) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var33.ak_fld;
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var33.ag_fld;
				bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var33.av_fld != null ? var33.av_fld : "";
				bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = null != var33.ah_fld ? var33.ah_fld : "";
				bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var33.aw_fld != null ? var33.aw_fld : "";
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = co.de(var33, (byte)-49) ? 1 : (var33.ah((short)-30329) ? 2 : 0);
			} else {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -1;
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
				bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
				bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
			}

			return 1;
		} else if (5004 == var0) {
			int var18 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			co var27 = mh.ae(var18);
			if (null != var27) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var27.az_fld;
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var27.ag_fld;
				bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var27.av_fld != null ? var27.av_fld : "";
				bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = null != var27.ah_fld ? var27.ah_fld : "";
				bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var27.aw_fld != null ? var27.aw_fld : "";
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = co.de(var27, (byte)-109) ? 1 : (var27.ah((short)-21131) ? 2 : 0);
			} else {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -1;
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
				bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
				bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
			}

			return 1;
		} else if (var0 == 5005) {
			if (null == hb.kt_fld) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -1;
			} else {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = hb.kt_fld.av_fld;
			}

			return 1;
		} else if (var0 == 5008) {
			String var17 = (String)bp.ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			int var26 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			jm var32 = yi.ak(var26, var17, ku.gi_fld, -1);
			client.appletStub.az(var32);
			return 1;
		} else if (var0 == 5009) {
			ef.aq_fld -= 2;
			String var16 = (String)bp.ai_fld[ef.aq_fld];
			String var25 = (String)bp.ai_fld[1 + ef.aq_fld];
			jm var31 = gi.ak(jb.be_fld, client.appletStub.av_fld);
			xi.vy(var31.ay_fld, 0);
			int var35 = var31.ay_fld.au_fld * -661977895;
			xi.ph(var31.ay_fld, var16, -1220077098);
			jj.ak(var31.ay_fld, var25);
			var31.ay_fld.cn(-661977895 * var31.ay_fld.au_fld - var35, -1389402072);
			client.appletStub.az(var31);
			return 1;
		} else if (5010 == var0) {
			String var15 = (String)bp.ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			gz.ax_fld -= 2;
			int var24 = bp.au_fld[gz.ax_fld];
			int var30 = bp.au_fld[1 + gz.ax_fld];
			jm var7 = yi.ak(var24, var15, ku.gi_fld, var30);
			client.appletStub.az(var7);
			return 1;
		} else if (var0 == 5015) {
			aax var14 = og.ci_fld.jn((byte)-117);
			String var23 = var14 != null ? var14.ak(-192767525) : "";
			bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var23;
			return 1;
		} else if (var0 == 5016) {
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.kf_fld;
			return 1;
		} else if (5017 == var0) {
			int var13 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = gb.ah(var13);
			return 1;
		} else if (var0 == 5018) {
			int var12 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = rb.ar(var12, (byte)12);
			return 1;
		} else if (5019 == var0) {
			int var11 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = ix.as(var11);
			return 1;
		} else if (var0 == 5020) {
			String var10 = (String)bp.ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			en.bx(var10, (byte)26);
			return 1;
		} else if (var0 == 5021) {
			client.kn_fld = ((String)bp.ai_fld[(ef.aq_fld -= -211521517) * -836183525]).toLowerCase().trim();
			return 1;
		} else if (5022 == var0) {
			bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = client.kn_fld;
			return 1;
		} else if (5023 == var0) {
			String var9 = (String)bp.ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			System.out.println(var9);
			return 1;
		} else if (5030 == var0) {
			gz.ax_fld -= 2;
			int var8 = bp.au_fld[gz.ax_fld];
			int var22 = bp.au_fld[gz.ax_fld + 1];
			co var6 = bn.av(var8, var22);
			if (var6 != null) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var6.ak_fld;
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var6.ag_fld;
				bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = null != var6.av_fld ? var6.av_fld : "";
				bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var6.ah_fld != null ? var6.ah_fld : "";
				bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = null != var6.aw_fld ? var6.aw_fld : "";
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = co.de(var6, (byte)-25) ? 1 : (var6.ah((short)-10703) ? 2 : 0);
				bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
			} else {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -1;
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
				bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
				bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
			}

			return 1;
		} else if (5031 == var0) {
			int var4 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			co var5 = mh.ae(var4);
			if (var5 != null) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var5.az_fld;
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var5.ag_fld;
				bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = null != var5.av_fld ? var5.av_fld : "";
				bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = null != var5.ah_fld ? var5.ah_fld : "";
				bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = null != var5.aw_fld ? var5.aw_fld : "";
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = co.de(var5, (byte)-94) ? 1 : (var5.ah((short)-17549) ? 2 : 0);
				bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
			} else {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -1;
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
				bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
				bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
			}

			return 1;
		} else {
			return 2;
		}
	}
}
