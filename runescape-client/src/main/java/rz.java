import java.awt.Image;
import java.io.EOFException;
import java.util.Comparator;
import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("rz")
public abstract class rz implements Comparator {
	@ObfuscatedName("rb")
	@ObfuscatedSignature(
		descriptor = "Ljava/awt/Image;"
	)
	static Image rb_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/Comparator;"
	)
	Comparator ag_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int aw_fld;

	@ObfuscatedName("tn")
	@ObfuscatedSignature(
		descriptor = "(Lrz;Ljava/util/Comparator;)V"
	)
	public static void tn(rz var0, Comparator var1) {
		if (var0.ag_fld == null) {
			var0.ag_fld = var1;
		} else if (var0.ag_fld instanceof rz) {
			((rz)var0.ag_fld).ay(var1, 1630011462);
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Comparator;)V"
	)
	final void au(Comparator var1) {
		if (this.ag_fld == null) {
			this.ag_fld = var1;
		} else if (this.ag_fld instanceof rz) {
			((rz)this.ag_fld).ay(var1, 1944096270);
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Comparator;I)V"
	)
	final void ay(Comparator var1, int var2) {
		if (this.ag_fld == null) {
			this.ag_fld = var1;
		} else if (this.ag_fld instanceof rz) {
			if (var2 <= 1009318698) {
				return;
			}

			((rz)this.ag_fld).ay(var1, 1834539092);
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lrl;Lrl;I)I"
	)
	protected final int as(rl var1, rl var2, int var3) {
		return null == this.ag_fld ? 0 : this.ag_fld.compare(var1, var2);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lub;Lub;I)I"
	)
	static int ak(ub var0, ub var1) throws EOFException {
		try {
			int var3 = 0;
			String[] var4 = bn.dy_fld;

			for (int var5 = 0; var5 < var4.length; var5++) {
				String var6 = var4[var5];
				if (var0.co(var6, "", -343906562)) {
					var3++;
				}
			}

			var4 = bn.di_fld;

			for (int var10 = 0; var10 < var4.length; var10++) {
				String var12 = var4[var10];
				if (var1.co(var12, "", -1690900591)) {
					var3++;
				}
			}

			var4 = bn.dn_fld;

			for (int var11 = 0; var11 < var4.length; var11++) {
				String var13 = var4[var11];
				if (var1.cm(var13, (byte)1) != -1 && var1.co(var13, "", -1326032769)) {
					var3++;
				}
			}

			return var3;
		} catch (Throwable var7) {
			throw new RuntimeException(var7);
		}
	}

	@ObfuscatedName("jm")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	public boolean jm(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("jg")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	public boolean jg(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	public boolean jt(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Comparator;)V"
	)
	final void af(Comparator var1) {
		if (this.ag_fld == null) {
			this.ag_fld = var1;
		} else if (this.ag_fld instanceof rz) {
			((rz)this.ag_fld).ay(var1, 1892291221);
		}
	}

	@ObfuscatedName("equals")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	@Export("equals")
	@Override
	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Comparator;)V"
	)
	final void al(Comparator var1) {
		if (this.ag_fld == null) {
			this.ag_fld = var1;
		} else if (this.ag_fld instanceof rz) {
			((rz)this.ag_fld).ay(var1, 1413775503);
		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(ILba;ZI)I"
	)
	static int bs(int var0, ba var1, boolean var2) throws EOFException {
		try {
			if (var0 == 3100) {
				String var24 = (String)bp.ai_fld[(ef.aq_fld -= -211521517) * -836183525];
				io.ag(0, "", var24);
				return 1;
			} else if (3101 == var0) {
				gz.ax_fld -= 2;
				cg.cv(ot.ef(), bp.au_fld[gz.ax_fld], bp.au_fld[gz.ax_fld + 1], -174199054);
				return 1;
			} else if (3103 == var0) {
				if (!bp.bd_fld) {
					bp.bm_fld = true;
				}

				return 1;
			} else if (var0 == 3104) {
				String var23 = (String)bp.ai_fld[(ef.aq_fld -= -211521517) * -836183525];
				int var32 = 0;
				if (dz.ag(var23)) {
					var32 = tf.av(var23);
				}

				jm var35 = gi.ak(jb.do_fld, client.appletStub.av_fld);
				var35.ay_fld.eb(var32);
				client.appletStub.az(var35);
				return 1;
			} else if (3105 == var0) {
				String var22 = (String)bp.ai_fld[(ef.aq_fld -= -211521517) * -836183525];
				jm var31 = gi.ak(jb.bz_fld, client.appletStub.av_fld);
				var31.ay_fld.ea(var22.length() + 1);
				xi.ph(var31.ay_fld, var22, -638166850);
				client.appletStub.az(var31);
				return 1;
			} else if (var0 == 3106) {
				String var21 = (String)bp.ai_fld[(ef.aq_fld -= -211521517) * -836183525];
				jm var30 = gi.ak(jb.cd_fld, client.appletStub.av_fld);
				var30.ay_fld.ea(var21.length() + 1);
				xi.ph(var30.ay_fld, var21, 487699711);
				client.appletStub.az(var30);
				return 1;
			} else if (var0 == 3107) {
				int var20 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				String var29 = (String)bp.ai_fld[(ef.aq_fld -= -211521517) * -836183525];
				qk.fv(var20, var29, 966695779);
				return 1;
			} else if (var0 == 3108) {
				gz.ax_fld -= 3;
				int var19 = bp.au_fld[gz.ax_fld];
				int var28 = bp.au_fld[1 + gz.ax_fld];
				int var34 = bp.au_fld[gz.ax_fld + 2];
				lu var37 = cf.cg_fld.ak(var34);
				if (!client.ng_fld && uo.wn(cf.cg_fld, var37, var19, var28)) {
					ot.ft();
				}

				return 1;
			} else if (var0 == 3109) {
				gz.ax_fld -= 2;
				int var18 = bp.au_fld[gz.ax_fld];
				int var27 = bp.au_fld[1 + gz.ax_fld];
				lu var33 = var2 ? gs.ap_fld : bp.ab_fld;
				if (!client.ng_fld && uo.wn(cf.cg_fld, var33, var18, var27)) {
					ot.ft();
				}

				return 1;
			} else if (3110 == var0) {
				gu.hh_fld = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
				return 1;
			} else if (var0 == 3111) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = cx.kq_fld.ae((byte)-80) ? 1 : 0;
				return 1;
			} else if (var0 == 3112) {
				cx.kq_fld.ah(bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1, (byte)5);
				return 1;
			} else if (3113 == var0) {
				String var17 = (String)bp.ai_fld[(ef.aq_fld -= -211521517) * -836183525];
				gz.ax_fld--;
				by.ak(var17);
				return 1;
			} else if (var0 == 3114) {
				String var16 = (String)bp.ai_fld[(ef.aq_fld -= -211521517) * -836183525];
				long var26 = 0L;
				if (io.az(var16)) {
					var26 = gj.aw(var16);
				}

				jm var36 = gi.ak(jb.cu_fld, client.appletStub.av_fld);
				var36.ay_fld.ft(var26);
				client.appletStub.az(var36);
				return 1;
			} else if (var0 == 3115) {
				int var15 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				jm var25 = gi.ak(jb.ex_fld, client.appletStub.av_fld);
				xi.vy(var25.ay_fld, var15);
				client.appletStub.az(var25);
				return 1;
			} else if (3116 == var0) {
				int var14 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				ef.aq_fld -= 2;
				String var5 = (String)bp.ai_fld[ef.aq_fld];
				String var6 = (String)bp.ai_fld[ef.aq_fld + 1];
				if (var5.length() > 500) {
					return 1;
				} else if (var6.length() > 500) {
					return 1;
				} else {
					jm var7 = gi.ak(jb.ba_fld, client.appletStub.av_fld);
					xi.vy(var7.ay_fld, 1 + iq.bu(var5) + iq.bu(var6));
					xi.ph(var7.ay_fld, var6, 1072139550);
					var7.ay_fld.cx(var14);
					xi.ph(var7.ay_fld, var5, 1930875267);
					client.appletStub.az(var7);
					return 1;
				}
			} else if (3117 == var0) {
				gz.ax_fld--;
				return 1;
			} else if (var0 == 3118) {
				client.ei_fld = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
				return 1;
			} else if (3119 == var0) {
				client.ec_fld = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
				return 1;
			} else if (3120 == var0) {
				if (bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1) {
					client.ez_fld |= 959732103;
				} else {
					client.ez_fld &= -1919464206;
				}

				return 1;
			} else if (var0 == 3121) {
				if (bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1) {
					client.ez_fld |= 1919464206;
				} else {
					client.ez_fld = 165289015 * (client.ez_fld & -3);
				}

				return 1;
			} else if (var0 == 3122) {
				if (bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1) {
					client.ez_fld = 165289015 * (client.ez_fld | 4);
				} else {
					client.ez_fld &= -503693219;
				}

				return 1;
			} else if (var0 == 3123) {
				if (bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1) {
					client.ez_fld = 165289015 * (client.ez_fld | 8);
				} else {
					client.ez_fld &= -47654335;
				}

				return 1;
			} else if (var0 == 3124) {
				client.ez_fld = 0;
				return 1;
			} else if (var0 == 3125) {
				client.df_fld = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
				return 1;
			} else if (3126 == var0) {
				client.dp_fld = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
				return 1;
			} else if (var0 == 3127) {
				rh.gg(bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1);
				return 1;
			} else if (var0 == 3128) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = bf.gc() ? 1 : 0;
				return 1;
			} else if (var0 == 3129) {
				gz.ax_fld -= 2;
				client.di_fld = bp.au_fld[gz.ax_fld];
				client.dn_fld = -868002529 * bp.au_fld[1 + gz.ax_fld];
				return 1;
			} else if (var0 == 3130) {
				gz.ax_fld -= 2;
				return 1;
			} else if (3131 == var0) {
				gz.ax_fld--;
				return 1;
			} else if (var0 == 3132) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = pf.qw_fld;
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = bc.qx_fld;
				return 1;
			} else if (3133 == var0) {
				gz.ax_fld--;
				return 1;
			} else if (var0 == 3134) {
				return 1;
			} else if (3135 == var0) {
				gz.ax_fld -= 2;
				return 1;
			} else if (var0 == 3136) {
				cf.cg_fld.ap_fld = -930786535;
				cf.cg_fld.at_fld = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				return 1;
			} else if (var0 == 3137) {
				cf.cg_fld.ap_fld = -2052180122;
				cf.cg_fld.at_fld = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				return 1;
			} else if (3138 == var0) {
				cf.cg_fld.ap_fld = 0;
				return 1;
			} else if (var0 == 3139) {
				cf.cg_fld.ap_fld = 1121393587;
				return 1;
			} else if (3140 == var0) {
				cf.cg_fld.ap_fld = -930786535;
				cf.cg_fld.at_fld = var2 ? gs.ap_fld.bf_fld : bp.ab_fld.bf_fld;
				return 1;
			} else if (3141 == var0) {
				boolean var13 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
				cx.kq_fld.ay(var13, (byte)116);
				return 1;
			} else if (var0 == 3142) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = cx.kq_fld.bl(2146222987) ? 1 : 0;
				return 1;
			} else if (var0 == 3143) {
				boolean var12 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
				client.dq_fld = var12;
				if (!var12) {
					cx.kq_fld.ac("", -1312248585);
				}

				return 1;
			} else if (var0 == 3144) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.dq_fld ? 1 : 0;
				return 1;
			} else if (var0 == 3145) {
				return 1;
			} else if (3146 == var0) {
				boolean var11 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
				cn.eu(cx.kq_fld, !var11, (byte)2);
				return 1;
			} else if (3147 == var0) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = cn.mv(cx.kq_fld, (short)27165) ? 0 : 1;
				return 1;
			} else if (var0 == 3148) {
				return 1;
			} else if (3149 == var0) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				return 1;
			} else if (var0 == 3150) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				return 1;
			} else if (var0 == 3151) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				return 1;
			} else if (var0 == 3152) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				return 1;
			} else if (3153 == var0) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = bn.bt_fld;
				return 1;
			} else if (3154 == var0) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = of.ax();
				return 1;
			} else if (var0 == 3155) {
				ef.aq_fld--;
				return 1;
			} else if (var0 == 3156) {
				return 1;
			} else if (3157 == var0) {
				gz.ax_fld -= 2;
				return 1;
			} else if (var0 == 3158) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				return 1;
			} else if (3159 == var0) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				return 1;
			} else if (3160 == var0) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				return 1;
			} else if (var0 == 3161) {
				gz.ax_fld--;
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				return 1;
			} else if (var0 == 3162) {
				gz.ax_fld--;
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				return 1;
			} else if (3163 == var0) {
				ef.aq_fld--;
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				return 1;
			} else if (3164 == var0) {
				gz.ax_fld--;
				bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
				return 1;
			} else if (3165 == var0) {
				gz.ax_fld--;
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				return 1;
			} else if (3166 == var0) {
				gz.ax_fld -= 2;
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				return 1;
			} else if (var0 == 3167) {
				gz.ax_fld -= 2;
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				return 1;
			} else if (var0 == 3168) {
				gz.ax_fld -= 2;
				bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
				bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
				bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
				bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
				bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
				bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
				bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
				bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
				bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
				return 1;
			} else if (var0 == 3169) {
				return 1;
			} else if (var0 == 3170) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				return 1;
			} else if (3171 == var0) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				return 1;
			} else if (3172 == var0) {
				gz.ax_fld--;
				return 1;
			} else if (3173 == var0) {
				gz.ax_fld--;
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				return 1;
			} else if (3174 == var0) {
				gz.ax_fld--;
				return 1;
			} else if (var0 == 3175) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				return 1;
			} else if (3176 == var0) {
				return 1;
			} else if (3177 == var0) {
				return 1;
			} else if (var0 == 3178) {
				ef.aq_fld--;
				return 1;
			} else if (var0 == 3179) {
				return 1;
			} else if (var0 == 3180) {
				ef.aq_fld--;
				return 1;
			} else if (3181 == var0) {
				dj.gn(bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127]);
				return 1;
			} else if (3182 == var0) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = hs.go();
				return 1;
			} else if (var0 == 3185) {
				int var10 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				cx.kq_fld.bk(var10, 2132603015);
				return 1;
			} else if (3186 == var0) {
				int var9 = cx.kq_fld.ax((byte)1);
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var9;
				return 1;
			} else if (3189 == var0) {
				int var4 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				bv.hx(var4);
				return 1;
			} else {
				return 2;
			}
		} catch (Throwable var8) {
			throw new RuntimeException(var8);
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Comparator;)V"
	)
	final void ax(Comparator var1) {
		if (this.ag_fld == null) {
			this.ag_fld = var1;
		} else if (this.ag_fld instanceof rz) {
			((rz)this.ag_fld).ay(var1, 1107447631);
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lrl;Lrl;)I"
	)
	protected final int an(rl var1, rl var2) {
		return null == this.ag_fld ? 0 : this.ag_fld.compare(var1, var2);
	}

	protected rz() {
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lsl;B)I"
	)
	public static int ah(sl var0) {
		om.ap(var0, null, false, (byte)0);
		byte var2 = 0;
		int var3 = var0.av();
		int var4 = -1;
		if (yq.ak_fld == var0.ag_fld) {
			int[] var5 = var0.ak();

			for (int var6 = var2; var6 < var3; var6++) {
				if (-1 == var4 || var5[var6] > var5[var4]) {
					var4 = var6;
				}
			}
		} else if (yq.ag_fld == var0.ag_fld) {
			long[] var9 = sl.ob(var0, -1735702581);

			for (int var11 = var2; var11 < var3; var11++) {
				if (var4 == -1 || var9[var11] > var9[var4]) {
					var4 = var11;
				}
			}
		} else if (var0.ag_fld == yq.az_fld) {
			String var10 = null;
			Object[] var12 = (Object[])var0.az();

			for (int var7 = var2; var7 < var3; var7++) {
				String var8 = (String)var12[var7];
				if (var4 == -1 || null != var8 && var8.compareTo(var10) > 0) {
					var4 = var7;
					var10 = var8;
				}
			}
		}

		return var4;
	}
}
