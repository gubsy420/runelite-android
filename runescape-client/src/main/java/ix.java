import java.util.ArrayList;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("ix")
public class ix extends ht {
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[S"
	)
	public static short[] ae_fld;
	// $VF: synthetic field
	@ObfuscatedName("this$0")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	ia this$0;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1757790679
	)
	int ak_fld;

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	void ae(xi var1) {
		this.ak_fld = var1.cm();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lik;I)V"
	)
	@Override
	void ag(ik var1, int var2) {
		ik.un(var1, this.ak_fld);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	void av(xi var1) {
		this.ak_fld = var1.cm();
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	void az(xi var1) {
		this.ak_fld = var1.cm();
	}

	@ObfuscatedName("rc")
	@ObfuscatedSignature(
		descriptor = "(Lrl;)Laax;"
	)
	public static aax rc(rl var0) {
		return var0.az_fld;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	@Override
	void ak(xi var1, int var2) {
		this.ak_fld = var1.cm();
	}

	ix(ia var1) {
		this.this$0 = var1;
		this.ak_fld = 577912345;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lik;)V"
	)
	@Override
	void ah(ik var1) {
		ik.un(var1, this.ak_fld * -1838517067);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lik;)V"
	)
	@Override
	void aw(ik var1) {
		ik.un(var1, this.ak_fld * -1470893945);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lik;)V"
	)
	@Override
	void ay(ik var1) {
		ik.un(var1, this.ak_fld);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	static int as(int var0) {
		co var2 = (co)cz.ag_fld.ak(var0);
		if (var2 == null) {
			return -1;
		} else {
			return cz.az_fld.ak_fld == var2.ft_fld ? -1 : ((co)var2.ft_fld).ak_fld * 1492045231;
		}
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(ILba;ZB)I"
	)
	static int bh(int var0, ba var1, boolean var2) {
		if (var0 == 3200) {
			gz.ax_fld -= 3;
			ah.kw_fld.ak(bp.au_fld[gz.ax_fld], bp.au_fld[gz.ax_fld + 1], bp.au_fld[2 + gz.ax_fld]);
			return 1;
		} else if (var0 == 3201) {
			gz.ax_fld -= 5;
			int var18 = bp.au_fld[gz.ax_fld];
			int var26 = bp.au_fld[1 + gz.ax_fld];
			int var35 = bp.au_fld[2 + gz.ax_fld];
			int var49 = bp.au_fld[gz.ax_fld + 3];
			int var54 = bp.au_fld[4 + gz.ax_fld];
			ArrayList var55 = new ArrayList();
			var55.add(var18);
			ce.be(var55, var26, var35, var49, var54, (byte)0);
			return 1;
		} else if (3202 == var0) {
			gz.ax_fld -= 2;
			yq.bs(bp.au_fld[gz.ax_fld], bp.au_fld[1 + gz.ax_fld]);
			return 1;
		} else if (var0 == 3212 || var0 == 3213 || 3209 == var0 || var0 == 3181 || 3203 == var0 || var0 == 3205 || 3207 == var0) {
			cq var17 = cq.ak_fld;
			cc var25 = cc.ak_fld;
			int var34 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			if (var0 == 3212) {
				int var44 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				var17 = (cq)ka.ak(dl.ak(), var44);
				if (var17 == null) {
					throw new RuntimeException(String.format("Unrecognized device option %d", (Object[])(new Object[]{var44})));
				}
			}

			if (var0 == 3213) {
				int var45 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				var25 = (cc)ka.ak(ge.ak((byte)104), var45);
				if (var25 == null) {
					throw new RuntimeException(String.format("Unrecognized game option %d", (Object[])(new Object[]{var45})));
				}
			}

			if (var0 == 3209) {
				int var46 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				var17 = (cq)ka.ak(dl.ak(), var46);
				if (null == var17) {
					var25 = (cc)ka.ak(ge.ak((byte)66), var46);
					if (null == var25) {
						throw new RuntimeException(String.format("Unrecognized client option %d", (Object[])(new Object[]{var46})));
					}
				}
			} else if (var0 == 3181) {
				var17 = cq.ah_fld;
			} else if (var0 == 3203) {
				var25 = cc.az_fld;
			} else if (3205 == var0) {
				var25 = cc.av_fld;
			} else if (var0 == 3207) {
				var25 = cc.ae_fld;
			}

			if (var25 == cc.ak_fld) {
				switch (var17.ar_fld) {
					case 1:
						cx.kq_fld.ay(var34 == 1, (byte)117);
						break;
					case 2:
						cn.eu(cx.kq_fld, var34 == 1, (byte)2);
						break;
					case 3:
						cx.kq_fld.au(1 == var34, -158899562);
						break;
					case 4:
						if (var34 < 0) {
							var34 = 0;
						}

						cx.kq_fld.an(var34, (byte)-14);
						break;
					case 5:
						dj.gn(var34);
						break;
					case 6:
						cn.fg(cx.kq_fld, var34);
						fw.gr();
						break;
					case 7:
						cx.kq_fld.bx(var34 == 1, (byte)15);
						break;
					default:
						String var47 = String.format("Unkown device option: %s.", (Object[])(new Object[]{var17}));
						throw new RuntimeException(var47);
				}
			} else {
				switch (var25.aw_fld) {
					case 1:
						cx.kq_fld.ah(var34 == 1, (byte)9);
						break;
					case 2:
						cx.kq_fld.am(var34, 1316842551);
						gd.gj((byte)57);
						break;
					case 3:
						cx.kq_fld.ao(var34, 1205917205);
						cd.gs();
						break;
					case 4:
						cx.kq_fld.ap(var34, -1742150050);
						cu.gt();
						break;
					default:
						String var48 = String.format("Unkown game option: %s.", (Object[])(new Object[]{var25}));
						throw new RuntimeException(var48);
				}
			}

			return 1;
		} else if (var0 == 3214 || var0 == 3215 || var0 == 3210 || var0 == 3182 || var0 == 3204 || var0 == 3206 || var0 == 3208) {
			cq var16 = cq.ak_fld;
			cc var24 = cc.ak_fld;
			boolean var32 = false;
			if (3214 == var0) {
				int var39 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				var16 = (cq)ka.ak(dl.ak(), var39);
				if (null == var16) {
					throw new RuntimeException(String.format("Unrecognized device option %d", (Object[])(new Object[]{var39})));
				}
			}

			if (var0 == 3215) {
				int var40 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				var24 = (cc)ka.ak(ge.ak((byte)111), var40);
				if (var24 == null) {
					throw new RuntimeException(String.format("Unrecognized game option %d", (Object[])(new Object[]{var40})));
				}
			}

			if (3210 == var0) {
				int var41 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				var16 = (cq)ka.ak(dl.ak(), var41);
				if (null == var16) {
					var24 = (cc)ka.ak(ge.ak((byte)111), var41);
					if (var24 == null) {
						throw new RuntimeException(String.format("Unrecognized client option %d", (Object[])(new Object[]{var41})));
					}
				}
			} else if (3182 == var0) {
				var16 = cq.ah_fld;
			} else if (3204 == var0) {
				var24 = cc.az_fld;
			} else if (3206 == var0) {
				var24 = cc.av_fld;
			} else if (var0 == 3208) {
				var24 = cc.ae_fld;
			}

			int var33;
			if (var24 == cc.ak_fld) {
				switch (var16.ar_fld) {
					case 1:
						var33 = cx.kq_fld.bl(708365829) ? 1 : 0;
						break;
					case 2:
						var33 = cn.mv(cx.kq_fld, (short)22209) ? 1 : 0;
						break;
					case 3:
						var33 = cx.kq_fld.al(562053266) ? 1 : 0;
						break;
					case 4:
						var33 = cx.kq_fld.aj((byte)0);
						break;
					case 5:
						var33 = hs.go();
						break;
					case 6:
						var33 = (int)(cn.uk(cx.kq_fld, 465869533) * 100.0F);
						break;
					case 7:
						var33 = cx.kq_fld.aw(-604134089) ? 1 : 0;
						break;
					default:
						String var42 = String.format("Unkown device option: %s.", (Object[])(new Object[]{var16}));
						throw new RuntimeException(var42);
				}
			} else {
				switch (var24.aw_fld) {
					case 1:
						var33 = cx.kq_fld.ae((byte)22) ? 1 : 0;
						break;
					case 2:
						var33 = cj.gu();
						break;
					case 3:
						var33 = ga.gv();
						break;
					case 4:
						var33 = ua.gp();
						break;
					default:
						String var43 = String.format("Unkown game option: %s.", (Object[])(new Object[]{var24}));
						throw new RuntimeException(var43);
				}
			}

			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var33;
			return 1;
		} else if (3211 == var0) {
			return 1;
		} else if (3216 == var0) {
			int var15 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			int var23 = 0;
			cq var31 = (cq)ka.ak(dl.ak(), var15);
			if (null != var31) {
				var23 = cq.ak_fld != var31 ? 1 : 0;
			}

			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var23;
			return 1;
		} else if (var0 == 3218) {
			int var14 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			int var22 = 0;
			cc var30 = (cc)ka.ak(ge.ak((byte)38), var14);
			if (var30 != null) {
				var22 = cc.ak_fld != var30 ? 1 : 0;
			}

			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var22;
			return 1;
		} else if (3217 == var0 || 3219 == var0) {
			cq var13 = cq.ak_fld;
			cc var21 = cc.ak_fld;
			byte var28 = -1;
			byte var37 = -1;
			if (3217 == var0) {
				int var50 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				var13 = (cq)ka.ak(dl.ak(), var50);
				if (null == var13) {
					throw new RuntimeException(String.format("Unrecognized device option %d", (Object[])(new Object[]{var50})));
				}
			}

			if (3219 == var0) {
				int var51 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				var21 = (cc)ka.ak(ge.ak((byte)112), var51);
				if (var21 == null) {
					throw new RuntimeException(String.format("Unrecognized game option %d", (Object[])(new Object[]{var51})));
				}
			}

			int var38;
			if (var21 == cc.ak_fld) {
				switch (var13.ar_fld) {
					case 1:
					case 2:
					case 3:
						var28 = 0;
						var38 = 1;
						break;
					case 4:
						var28 = 0;
						var38 = Integer.MAX_VALUE;
						break;
					case 5:
						var28 = 0;
						var38 = 100;
						break;
					default:
						String var52 = String.format("Unkown device option: %s.", (Object[])(new Object[]{var13}));
						throw new RuntimeException(var52);
				}
			} else {
				switch (var21.aw_fld) {
					case 1:
						var28 = 0;
						var38 = 1;
						break;
					case 2:
					case 3:
					case 4:
						var28 = 0;
						var38 = 100;
						break;
					default:
						String var53 = String.format("Unkown game option: %s.", (Object[])(new Object[]{var21}));
						throw new RuntimeException(var53);
				}
			}

			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var28;
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var38;
			return 1;
		} else if (3220 == var0) {
			gz.ax_fld -= 2;
			int var12 = bp.au_fld[gz.ax_fld];
			int var20 = bp.au_fld[1 + gz.ax_fld];
			sx.av(var12, var20);
			return 1;
		} else if (var0 == 3221) {
			gz.ax_fld -= 6;
			int var11 = bp.au_fld[gz.ax_fld];
			int var19 = bp.au_fld[1 + gz.ax_fld];
			int var27 = bp.au_fld[2 + gz.ax_fld];
			int var36 = bp.au_fld[3 + gz.ax_fld];
			int var8 = bp.au_fld[gz.ax_fld + 4];
			int var9 = bp.au_fld[gz.ax_fld + 5];
			ArrayList var10 = new ArrayList();
			var10.add(var11);
			var10.add(var19);
			ce.be(var10, var27, var36, var8, var9, (byte)0);
			return 1;
		} else if (var0 == 3222) {
			gz.ax_fld -= 4;
			int var4 = bp.au_fld[gz.ax_fld];
			int var5 = bp.au_fld[gz.ax_fld + 1];
			int var6 = bp.au_fld[gz.ax_fld + 2];
			int var7 = bp.au_fld[3 + gz.ax_fld];
			vr.ae(var4, var5, var6, var7, (byte)110);
			return 1;
		} else {
			return 2;
		}
	}
}
