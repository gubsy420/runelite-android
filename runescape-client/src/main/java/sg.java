import java.io.EOFException;
import java.util.Iterator;
import java.util.concurrent.Callable;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("sg")
public class sg implements Callable {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lsf;"
	)
	sf az_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lse;"
	)
	se ag_fld;
	// $VF: synthetic field
	@ObfuscatedName("this$0")
	@ObfuscatedSignature(
		descriptor = "Lsp;"
	)
	sp this$0;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1321988711
	)
	int av_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int aw_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lsn;"
	)
	sn ak_fld;

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(S)V"
	)
	static final void ba(short var0) throws EOFException {
		try {
			Iterator var1 = client.da_fld.iterator();

			while (var1.hasNext()) {
				dx var2 = (dx)(dx)var1.next();
				Iterator var3 = var2.ax_fld.iterator();

				while (var3.hasNext()) {
					if (var0 != 2048) {
						return;
					}

					ds var4 = (ds)(ds)var3.next();
					if (var4 != null) {
						if (var0 != 2048) {
							return;
						}

						ec.bg(var2, var4, 1161975113 * var4.ah_fld.cw_fld, -1348971303);
					}
				}

				var2.ax((byte)-79);
			}
		} catch (Throwable var5) {
			throw new RuntimeException(var5);
		}
	}

	@ObfuscatedName("wf")
	@ObfuscatedSignature(
		descriptor = "(Lsg;)Ljava/lang/Object;"
	)
	public static Object wf(sg var0) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			sn.pi(var0.ak_fld, 1050096440);
			sn[][] var1;
			if (var0.ag_fld == se.ag_fld) {
				var1 = var0.this$0.ae_fld;
			} else {
				var1 = var0.this$0.av_fld;
			}

			var1[var0.av_fld][var0.az_fld.az()] = var0.ak_fld;
			return null;
		}
	}

	@ObfuscatedName("se")
	@ObfuscatedSignature(
		descriptor = "(Lyv;III)V"
	)
	public static void se(yv var0, int var1, int var2, int var3) {
		if (var0 == null) {
			var0.getClass();
		}

		var1 += var0.as_fld;
		var2 += var0.ar_fld;
		int var4 = var1 + var2 * yv.au_fld;
		int var5 = 0;
		int var6 = var0.ay_fld;
		int var7 = var0.aw_fld;
		int var8 = yv.au_fld - var7;
		int var9 = 0;
		if (var2 < yv.aa_fld) {
			int var10 = yv.aa_fld - var2;
			var6 -= var10;
			var2 = yv.aa_fld;
			var5 += var10 * var7;
			var4 += var10 * yv.au_fld;
		}

		if (var2 + var6 > yv.ai_fld) {
			var6 -= var2 + var6 - yv.ai_fld;
		}

		if (var1 < yv.aq_fld) {
			int var13 = yv.aq_fld - var1;
			var7 -= var13;
			var1 = yv.aq_fld;
			var5 += var13;
			var4 += var13;
			var9 += var13;
			var8 += var13;
		}

		if (var1 + var7 > yv.am_fld) {
			int var14 = var1 + var7 - yv.am_fld;
			var7 -= var14;
			var9 += var14;
			var8 += var14;
		}

		if (var7 > 0 && var6 > 0) {
			yv.ae(yv.al_fld, var0.ah_fld, 0, var5, var4, var7, var6, var8, var9, var3);
		}
	}

	sg(sp var1, sn var2, se var3, sf var4, int var5) {
		this.this$0 = var1;
		this.ak_fld = var2;
		this.ag_fld = var3;
		this.az_fld = var4;
		this.av_fld = var5;
	}

	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "(Loe;II)I"
	)
	public static int dh(oe var0, int var1, int var2) {
		return my.ag(var0.es_fld, var1, var2);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/Object;"
	)
	public Object ag() {
		sn.pi(this.ak_fld, -779751261);
		sn[][] var1;
		if (this.ag_fld == se.ag_fld) {
			var1 = this.this$0.ae_fld;
		} else {
			var1 = this.this$0.av_fld;
		}

		var1[this.av_fld][this.az_fld.az()] = this.ak_fld;
		return null;
	}

	@ObfuscatedName("call")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/Object;"
	)
	@Override
	public Object call() {
		sn.pi(this.ak_fld, -494812860);
		sn[][] var1;
		if (this.ag_fld == se.ag_fld) {
			var1 = this.this$0.ae_fld;
		} else {
			var1 = this.this$0.av_fld;
		}

		var1[this.av_fld][this.az_fld.az()] = this.ak_fld;
		return null;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IB)Z"
	)
	public static boolean av(int var0) {
		return (var0 >> 23 & 1) != 0;
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(ILba;ZI)I"
	)
	static int bb(int var0, ba var1, boolean var2) throws EOFException {
		try {
			wl var4 = lz.ah();
			if (var0 == 6600) {
				kj var41 = ls.ea();
				if (var41.ax()) {
					var4.al(var41.az_fld, var41.ak_fld, var41.ag_fld, true, (byte)61);
				}

				return 1;
			} else if (var0 == 6601) {
				int var40 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				String var58 = "";
				gf var62 = var4.be(var40, 1251632292);
				if (var62 != null) {
					var58 = gf.uv(var62, (byte)12);
				}

				bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var58;
				return 1;
			} else if (6602 == var0) {
				int var39 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				wl.ml(var4, var39, (byte)-101);
				return 1;
			} else if (6603 == var0) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var4.bm(-1720821429);
				return 1;
			} else if (var0 == 6604) {
				int var38 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				wl.jj(var4, var38, (byte)77);
				return 1;
			} else if (6605 == var0) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var4.br(-863030602) ? 1 : 0;
				return 1;
			} else if (6606 == var0) {
				kj var37 = new kj(bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127]);
				var4.bs(var37.ak_fld, var37.ag_fld, (byte)-36);
				return 1;
			} else if (6607 == var0) {
				kj var36 = new kj(bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127]);
				var4.bh(var36.ak_fld, var36.ag_fld, 2053706738);
				return 1;
			} else if (6608 == var0) {
				kj var35 = new kj(bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127]);
				var4.bk(var35.az_fld, var35.ak_fld, var35.ag_fld, (short)483);
				return 1;
			} else if (var0 == 6609) {
				kj var34 = new kj(bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127]);
				var4.ez(var34.az_fld, var34.ak_fld, var34.ag_fld, -30168030);
				return 1;
			} else if (var0 == 6610) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = wl.et(var4, (byte)25);
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var4.by(-242392307);
				return 1;
			} else if (var0 == 6611) {
				int var33 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				gf var57 = var4.be(var33, 1140332905);
				if (null == var57) {
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				} else {
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var57.ab(62388830).af();
				}

				return 1;
			} else if (6612 == var0) {
				int var32 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				gf var56 = var4.be(var32, 79261042);
				if (null == var56) {
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				} else {
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = (var56.aa(48463796) - var56.an(2082878053) + 1) * 64;
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = (gf.yo(var56, 2121428206) - var56.ai(-1460613325) + 1) * 64;
				}

				return 1;
			} else if (6613 == var0) {
				int var31 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				gf var55 = var4.be(var31, -139564121);
				if (null == var55) {
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				} else {
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var55.an(1385945715) * 64;
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var55.ai(-1613554727) * 64;
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var55.aa(-417143990) * 64 + 64 - 1;
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = gf.yo(var55, 1494087625) * 64 + 64 - 1;
				}

				return 1;
			} else if (6614 == var0) {
				int var30 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				gf var54 = var4.be(var30, 986569968);
				if (var54 == null) {
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -1;
				} else {
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var54.ax(981736215);
				}

				return 1;
			} else if (6615 == var0) {
				kj var29 = wl.nk(var4, (byte)115);
				if (null == var29) {
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -1;
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -1;
				} else {
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var29.ak_fld;
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var29.ag_fld;
				}

				return 1;
			} else if (6616 == var0) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var4.ax(-128892199);
				return 1;
			} else if (6617 == var0) {
				kj var28 = new kj(bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127]);
				gf var53 = var4.el(-1681734564);
				if (null == var53) {
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -1;
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -1;
					return 1;
				} else {
					int[] var61 = var53.ae(var28.az_fld, var28.ak_fld, var28.ag_fld, 2081577648);
					if (var61 == null) {
						bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -1;
						bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -1;
					} else {
						bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var61[0];
						bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var61[1];
					}

					return 1;
				}
			} else if (6618 == var0) {
				kj var27 = new kj(bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127]);
				gf var52 = var4.el(1699906630);
				if (var52 == null) {
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -1;
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -1;
					return 1;
				} else {
					kj var60 = var52.ah(var27.ak_fld, var27.ag_fld, (byte)-17);
					if (var60 == null) {
						bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -1;
					} else {
						bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var60.af();
					}

					return 1;
				}
			} else if (6619 == var0) {
				gz.ax_fld -= 2;
				int var26 = bp.au_fld[gz.ax_fld];
				kj var51 = new kj(bp.au_fld[1 + gz.ax_fld]);
				tu.cr(var26, var51, false);
				return 1;
			} else if (var0 == 6620) {
				gz.ax_fld -= 2;
				int var25 = bp.au_fld[gz.ax_fld];
				kj var50 = new kj(bp.au_fld[1 + gz.ax_fld]);
				tu.cr(var25, var50, true);
				return 1;
			} else if (6621 == var0) {
				gz.ax_fld -= 2;
				int var24 = bp.au_fld[gz.ax_fld];
				kj var49 = new kj(bp.au_fld[gz.ax_fld + 1]);
				gf var59 = var4.be(var24, 2063780656);
				if (var59 == null) {
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
					return 1;
				} else {
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = gf.fv(var59, var49.az_fld, var49.ak_fld, var49.ag_fld, (byte)50) ? 1 : 0;
					return 1;
				}
			} else if (6622 == var0) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var4.bx(1637518692);
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = wl.am(var4, (byte)3);
				return 1;
			} else if (var0 == 6623) {
				kj var23 = new kj(bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127]);
				gf var48 = var4.af(var23.az_fld, var23.ak_fld, var23.ag_fld, 1475555422);
				if (var48 == null) {
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -1;
				} else {
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var48.ay(-143778459);
				}

				return 1;
			} else if (var0 == 6624) {
				var4.bd(bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127], (byte)40);
				return 1;
			} else if (var0 == 6625) {
				wl.ty(var4, 1586677548);
				return 1;
			} else if (6626 == var0) {
				wl.eo(var4, bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127], -1429085863);
				return 1;
			} else if (6627 == var0) {
				wl.lw(var4, (short)207);
				return 1;
			} else if (var0 == 6628) {
				boolean var22 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
				var4.bu(var22, 877494853);
				return 1;
			} else if (6629 == var0) {
				int var21 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				wl.ip(var4, var21);
				return 1;
			} else if (var0 == 6630) {
				int var20 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				wl.if_(var4, var20);
				return 1;
			} else if (var0 == 6631) {
				var4.bw(570489266);
				return 1;
			} else if (6632 == var0) {
				boolean var19 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
				wl.yn(var4, var19, 1669274356);
				return 1;
			} else if (6633 == var0) {
				gz.ax_fld -= 2;
				int var18 = bp.au_fld[gz.ax_fld];
				boolean var47 = 1 == bp.au_fld[1 + gz.ax_fld];
				wl.wq(var4, var18, var47);
				return 1;
			} else if (var0 == 6634) {
				gz.ax_fld -= 2;
				int var17 = bp.au_fld[gz.ax_fld];
				boolean var46 = bp.au_fld[1 + gz.ax_fld] == 1;
				var4.bq(var17, var46, (byte)-14);
				return 1;
			} else if (var0 == 6635) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var4.bg((byte)2) ? 1 : 0;
				return 1;
			} else if (6636 == var0) {
				int var16 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = wl.kk(var4, var16) ? 1 : 0;
				return 1;
			} else if (var0 == 6637) {
				int var15 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = wl.cm(var4, var15) ? 1 : 0;
				return 1;
			} else if (var0 == 6638) {
				gz.ax_fld -= 2;
				int var14 = bp.au_fld[gz.ax_fld];
				kj var45 = new kj(bp.au_fld[gz.ax_fld + 1]);
				kj var7 = wl.yu(var4, var14, var45, (byte)-50);
				if (null == var7) {
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -1;
				} else {
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var7.af();
				}

				return 1;
			} else if (6639 == var0) {
				hr var13 = var4.cx((short)18873);
				if (var13 == null) {
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -1;
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -1;
				} else {
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var13.ag(680600194);
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var13.aw_fld.af();
				}

				return 1;
			} else if (6640 == var0) {
				hr var12 = var4.cs((byte)-113);
				if (var12 == null) {
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -1;
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -1;
				} else {
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var12.ag(824520164);
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var12.aw_fld.af();
				}

				return 1;
			} else if (var0 == 6693) {
				int var11 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				pc var44 = uh.ak(var11);
				if (var44.as_fld == null) {
					bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
				} else {
					bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var44.as_fld;
				}

				return 1;
			} else if (var0 == 6694) {
				int var10 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				pc var43 = uh.ak(var10);
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var43.af_fld;
				return 1;
			} else if (var0 == 6695) {
				int var9 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				pc var42 = uh.ak(var9);
				if (null == var42) {
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -1;
				} else {
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var42.ac_fld;
				}

				return 1;
			} else if (var0 == 6696) {
				int var5 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				pc var6 = uh.ak(var5);
				if (null == var6) {
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -1;
				} else {
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var6.aw_fld;
				}

				return 1;
			} else if (6697 == var0) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = gb.aj_fld.ak_fld;
				return 1;
			} else if (var0 == 6698) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = gb.aj_fld.ag_fld.af();
				return 1;
			} else if (6699 == var0) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = gb.aj_fld.az_fld.af();
				return 1;
			} else {
				return 2;
			}
		} catch (Throwable var8) {
			throw new RuntimeException(var8);
		}
	}
}
