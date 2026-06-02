import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;
import net.runelite.api.events.WidgetClosed;
import net.runelite.api.events.WidgetDrag;
import net.runelite.api.events.WidgetLoaded;
import net.runelite.api.widgets.WidgetUtil;

@ObfuscatedName("qh")
public class qh {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int au_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ljd;"
	)
	jd ag_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	po az_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	ja ak_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lqc;"
	)
	qc av_fld = new qc();

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(Lqm;Luo;)V"
	)
	public void bk(qm var1, uo var2) throws EOFException {
		if (var2.aa_fld != -1) {
			this.ar(var2.aa_fld, var1, var2, -2110822276);
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIILuo;Lqg;)V"
	)
	public void ak(int var1, int var2, int var3, uo var4, qg var5) throws EOFException {
		var4.aa_fld = var1;
		int var7 = var4.aa_fld;
		if (var4.az(var7)) {
			fm.av(var4.aw_fld[var7], 0, var4.aw_fld[var7].length - 1, -1, -1, var2, var3, false, var4, var5, -2050661066);
		}

		wk(this, var1, var4, (byte)0);
		lt(this, var4.aa_fld, var4);
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(Lqm;Luo;)V"
	)
	public void bf(qm var1, uo var2) throws EOFException {
		if (var2.aa_fld != -1) {
			this.ar(var2.aa_fld, var1, var2, 712201130);
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lpk;ZLuo;)V"
	)
	public void az(pk var1, boolean var2, uo var3) throws EOFException {
		this.pi(var1, var2, var3);
		int var5 = var1.ak_fld;
		var1.gy_void();
		if (var2) {
			lw.mw(var3, var5, (byte)-45);
		}

		uo.mu(var3, var5, -1489143102);
		pq(this, qm.ag_fld, var3, (byte)-61);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IILuo;Lqg;I)V"
	)
	public void av(int var1, int var2, uo var3, qg var4, int var5) throws EOFException {
		pk var6 = (pk)var3.ai_fld.ak(var1);
		pk var7 = (pk)var3.ai_fld.ak(var2);
		if (null != var7) {
			this.az(var7, var6 == null || var7.ak_fld != var6.ak_fld, var3);
		}

		if (var6 != null) {
			if (var5 >= -894063891) {
				return;
			}

			var6.gy_void();
			var3.ai_fld.az(var6, var2);
		}

		lu var8 = var3.ak(var2);
		if (null != var8) {
			tb.ag(var3.aw_fld[var8.bf_fld >>> 16], var8, true, var3, var4, -737481981);
		}

		pq(this, qm.ag_fld, var3, (byte)-48);
	}

	@ObfuscatedName("pq")
	@ObfuscatedSignature(
		descriptor = "(Lqh;Lqm;Luo;B)V"
	)
	public static void pq(qh var0, qm var1, uo var2, byte var3) throws EOFException {
		if (var0 == null) {
			var0.getClass();
		} else {
			if (var2.aa_fld != -1) {
				var0.ar(var2.aa_fld, var1, var2, -1071987975);
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Luo;IIIILqg;I)V"
	)
	public void ae(uo var1, int var2, int var3, int var4, int var5, qg var6, int var7) throws EOFException {
		if (client.eu()) {
			var5 = 0;
		}

		int var14 = 1071915808;
		var1.ai().ak();
		var1.bm().az();
		if (-1 != var1.aa_fld) {
			this.av_fld.ak(tj.av_fld, tj.ae_fld, tj.ah_fld, tj.ay_fld, tj.as_fld, tj.ar_fld, var5);
			this.ah(var1.aa_fld, 0, 0, var2, var3, 0, 0, var1, var4, var6);
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIILuo;ILqg;)V"
	)
	void ah(int var1, int var2, int var3, int var4, int var5, int var6, int var7, uo var8, int var9, qg var10) throws EOFException {
		if (var8.az(var1)) {
			tw(this, var8.aw_fld[var1], 0, var8.aw_fld[var1].length - 1, -1, -1, var2, var3, var4, var5, var6, var7, var8, var9, var10, -2101178647);
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Llu;IIIIIILuo;I)V"
	)
	void ay(lu var1, int var2, int var3, int var4, int var5, int var6, int var7, uo var8, int var9) {
		byte var10;
		if (var8.bd_fld) {
			if (var9 <= 766310512) {
				return;
			}

			var10 = 32;
		} else {
			var10 = 0;
		}

		var8.bd_fld = false;
		if (qc.cp(this.av_fld, -1663357918) == 1 || !this.ag_fld.ae(1735302627) && qc.cp(this.av_fld, -364283434) == 4) {
			if (var6 >= var2 && var6 < var2 + 16 && var7 >= var3 && var7 < 16 + var3) {
				var1.ce_fld -= 4;
			} else {
				label116: {
					if (var6 >= var2 && var6 < 16 + var2) {
						if (var9 <= 766310512) {
							return;
						}

						if (var7 >= var4 + var3 - 16 && var7 < var4 + var3) {
							var1.ce_fld += 4;
							break label116;
						}
					}

					if (var6 >= var2 - var10 && var6 < var10 + var2 + 16 && var7 >= 16 + var3) {
						if (var9 <= 766310512) {
							return;
						}

						if (var7 < var4 + var3 - 16) {
							int var11 = var4 * (var4 - 32) / var5;
							if (var11 < 8) {
								var11 = 8;
							}

							int var12 = var7 - var3 - 16 - var11 / 2;
							int var13 = var4 - 32 - var11;
							var1.ce_fld = -1143292511 * (var12 * (var5 - var4) / var13);
							var8.bd_fld = true;
						}
					}
				}
			}
		}

		if (this.av_fld.ay() != 0) {
			int var14 = var1.bb_fld;
			if (var6 >= var2 - var14) {
				if (var9 <= 766310512) {
					return;
				}

				if (var7 >= var3 && var6 < 16 + var2 && var7 <= var3 + var4) {
					var1.ce_fld = var1.ce_fld + this.av_fld.ay() * 91444557;
				}
			}
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ILqm;Luo;I)V"
	)
	void ar(int var1, qm var2, uo var3, int var4) throws EOFException {
		if (!var3.az(var1)) {
			if (var4 != -1971110855) {
				;
			}
		} else {
			this.al(var3.aw_fld[var1], var2, var3, -92988190);
		}
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(Lfr;Luo;)V"
	)
	void bq(fr var1, uo var2) throws EOFException {
		if (null != var1 && var1.ah_fld != null) {
			if (-2140649577 * var1.ah_fld.by_fld >= 0) {
				lu var3 = var2.ak(var1.ah_fld.cv_fld * 694320263);
				if (var3 == null
					|| var3.ge_fld == null
					|| 0 == var3.ge_fld.length
					|| var1.ah_fld.by_fld * -2140649577 >= var3.ge_fld.length
					|| var3.ge_fld[-2140649577 * var1.ah_fld.by_fld] != var1.ah_fld) {
					return;
				}
			}

			if (var1.ah_fld.bx_fld * 1404198381 == 11 && var1.ae_fld == 0) {
				if (var1.ah_fld.be(var1.az_fld, var1.av_fld, 0, 0, -1617803658)) {
					this.az_fld.af(var1.ah_fld, (byte)-54);
				}
			} else if (12 == var1.ah_fld.bx_fld * 1404198381) {
				li var4 = lu.bv(var1.ah_fld, -552680950);
				if (null != var4 && var4.bg()) {
					switch (var1.ae_fld) {
						case 0:
							this.az_fld.al(var1.ah_fld, (byte)5);
							var4.bl(var1.az_fld, var1.av_fld, this.ak_fld.ak(-478215450).ay(82), this.ak_fld.ak(-2133931707).ay(81), 2114152473);
							break;
						case 1:
							li.wb(var4, var1.az_fld, var1.av_fld);
					}
				}
			}
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "([Llu;Lqm;Luo;I)V"
	)
	void al(lu[] var1, qm var2, uo var3, int var4) throws EOFException {
		for (int var5 = 0; var5 < var1.length; var5++) {
			lu var6 = var1[var5];
			if (var6 != null) {
				if (var6.bx_fld == 0) {
					if (null != var6.ge_fld) {
						this.al(var6.ge_fld, var2, var3, -36714858);
					}

					if (var6.by_fld == -1) {
						pk var7 = (pk)var3.ai_fld.ak(var6.bf_fld);
						if (var7 != null) {
							this.ar(var7.ak_fld, var2, var3, 885634960);
						}
					}
				}

				if (qm.ak_fld == var2 && var6.gn_fld != null) {
					if (var4 <= -1063200371) {
						return;
					}

					yz var8 = tu.ak(var6).av((Object[])var6.gn_fld, 1358642488).ax(938922691);
					this.az_fld.as(var8, (byte)-9);
				}

				if (qm.ag_fld == var2 && null != var6.gh_fld) {
					if (var6.by_fld >= 0) {
						lu var9 = var3.ak(var6.bf_fld);
						if (null == var9 || null == var9.ge_fld || var6.by_fld >= var9.ge_fld.length || var9.ge_fld[var6.by_fld] != var6) {
							continue;
						}
					}

					yz var10 = tu.ak(var6).av((Object[])var6.gh_fld, 1421321345).ax(-1598995169);
					this.az_fld.as(var10, (byte)-37);
				}
			}
		}
	}

	@ObfuscatedName("qv")
	@ObfuscatedSignature(
		descriptor = "(ILuo;)V"
	)
	public void qv(int var1, uo var2) throws EOFException {
		lt(this, var1, var2);
	}

	public qh(ja var1, jd var2, po var3) {
		this.ak_fld = var1;
		this.ag_fld = var2;
		this.az_fld = var3;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lqg;Luo;I)V"
	)
	public void ax(qg var1, uo var2, int var3) throws EOFException {
		yz var4 = var1.ah();

		while (var4 != null) {
			yz var5 = var4;
			var4 = var1.ah();
			lu var6 = var5.av((short)21638);
			if (var6.by_fld >= 0) {
				lu var7 = var2.ak(var6.cv_fld);
				if (null == var7) {
					continue;
				}

				if (var3 != -63795729) {
					return;
				}

				if (null == var7.ge_fld || var6.by_fld >= var7.ge_fld.length || var7.ge_fld[var6.by_fld] != var6) {
					continue;
				}
			}

			va.ak(var5);
		}

		var4 = var1.aw();

		while (null != var4) {
			yz var10 = var4;
			var4 = var1.aw();
			lu var13 = var10.av((short)-23993);
			if (var13.by_fld >= 0) {
				if (var3 != -63795729) {
					return;
				}

				lu var16 = var2.ak(var13.cv_fld);
				if (var16 == null || null == var16.ge_fld) {
					continue;
				}

				if (var3 != -63795729) {
					return;
				}

				if (var13.by_fld >= var16.ge_fld.length || var16.ge_fld[var13.by_fld] != var13) {
					continue;
				}
			}

			va.ak(var10);
		}

		var4 = var1.ae();

		while (var4 != null) {
			yz var11 = var4;
			var4 = var1.ae();
			lu var14 = var11.av((short)17695);
			if (var14.by_fld >= 0) {
				if (var3 != -63795729) {
					return;
				}

				lu var17 = var2.ak(var14.cv_fld);
				if (null == var17 || var17.ge_fld == null || var14.by_fld >= var17.ge_fld.length || var14 != var17.ge_fld[var14.by_fld]) {
					continue;
				}
			}

			va.ak(var11);
		}

		boolean var12 = false;

		for (fr var15 = var1.ay(); var15 != null; var15 = var1.ay()) {
			if (12 == var15.ah_fld.bx_fld * 1404198381) {
				var12 = true;
			}

			this.an(var15, var2, (byte)-51);
		}

		if (!var12 && tj.ay_fld == 1) {
			this.az_fld.al(null, (byte)-27);
		}
	}

	@ObfuscatedName("lt")
	@ObfuscatedSignature(
		descriptor = "(Lqh;ILuo;)V"
	)
	public static void lt(qh var0, int var1, uo var2) throws EOFException {
		if (var0 == null) {
			var0.getClass();
		} else if (-1 == var1) {
			var0.hi(var1, var2);
		} else if (!var2.az(var1)) {
			var0.hi(var1, var2);
		} else {
			lu[] var4 = var2.aw_fld[var1];

			for (int var5 = 0; var5 < var4.length; var5++) {
				lu var6 = var4[var5];
				if (null != var6.eu_fld) {
					yz var7 = tu.ak(var6).av((Object[])var6.eu_fld, 1897181670).ax(1517274639);
					var0.az_fld.ar(var7, (byte)-99);
				}
			}

			var0.hi(var1, var2);
		}
	}

	@ObfuscatedName("ee")
	@ObfuscatedSignature(
		descriptor = "(Luo;)V"
	)
	public void ee(uo var1) throws EOFException {
		uk var2 = var1.bm();
		if (var2.ay()) {
			var2.aw();
			int var3 = var2.al();
			int var4 = var2.au();
			if (var2.ab() && var2.ao()) {
				lu var5 = var2.as();
				lu var6 = uk.dz(var2, -1094587272);
				int var7 = uk.yq(var2, -824808081);
				int var8 = uk.kq(var2, -79080406);
				int var9 = var2.ax();
				int var10 = var2.an();
				int var11 = tj.ae_fld;
				int var12 = tj.ah_fld;
				var11 -= var3;
				var12 -= var4;
				if (var11 < var7) {
					var11 = var7;
				}

				if (var5.bb_fld + var11 > var7 + var6.bb_fld) {
					var11 = var7 + var6.bb_fld - var5.bb_fld;
				}

				if (var12 < var8) {
					var12 = var8;
				}

				if (var12 + var5.cd_fld > var8 + var6.cd_fld) {
					var12 = var6.cd_fld + var8 - var5.cd_fld;
				}

				int var13 = var11 - var9;
				int var14 = var12 - var10;
				int var15 = var5.ev_fld;
				if (var2.aq() > var5.ey_fld && (var13 > var15 || var13 < -var15 || var14 > var15 || var14 < -var15)) {
					var2.ad();
				}

				int var16 = var11 - var7 + var6.cp_fld;
				int var17 = var6.ce_fld + (var12 - var8);
				if (var5.fj_fld != null && var2.ap()) {
					yz var18 = tu.ak(var5).av((Object[])var5.fj_fld, 1400000493).aw(var16, -334840588).ay(var17, 1587685472).ax(1131529580);
					va.ak(var18);
				}

				if (0 == tj.av_fld) {
					if (var2.ap()) {
						if (null != var5.fb_fld) {
							yz var21 = yb.cc(tu.ak(var5).av((Object[])var5.fb_fld, 2072937751).aw(var16, 1995707590).ay(var17, 1376466367), uk.am(var2, (short)1150), (byte)1)
								.ax(-1384944473);
							this.az_fld.as(var21, (byte)-89);
						}

						this.az_fld.au(var5, uk.am(var2, (short)1150), 767315461);
					} else {
						this.az_fld.ax(var9 + var3, var4 + var10, -1549556992);
					}

					var2.ag();
				}
			} else {
				if (var2.aq() > 1) {
					if (!var2.ap() && this.ag_fld.ag(-50451392) > 0) {
						this.az_fld.ay(var3 + var2.ax(), var4 + var2.an(), (byte)39);
					}

					var2.ag();
				}
			}
		}
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(Luo;)V"
	)
	public void bb(uo var1) {
		uk var2 = var1.aj_fld;
		if (var2.ak_fld != null && var2.ae_fld && var2.af_fld) {
			int var3 = tj.ae_fld;
			int var4 = tj.ah_fld;
			var3 -= var2.az_fld;
			var4 -= var2.av_fld;
			if (var3 < var2.as_fld) {
				var3 = var2.as_fld;
			}

			if (var3 + var2.ak_fld.bb_fld * -1223437005 > var2.as_fld + var2.ag_fld.bb_fld * -1223437005) {
				var3 = var2.as_fld + var2.ag_fld.bb_fld * -1223437005 - var2.ak_fld.bb_fld * -1223437005;
			}

			if (var4 < var2.ar_fld) {
				var4 = var2.ar_fld;
			}

			if (var4 + var2.ak_fld.cd_fld * 124430729 > var2.ar_fld + var2.ag_fld.cd_fld * 124430729) {
				var4 = var2.ar_fld + var2.ag_fld.cd_fld * 124430729 - var2.ak_fld.cd_fld * 124430729;
			}

			int var5 = var3 - var2.al_fld;
			int var6 = var4 - var2.au_fld;
			int var7 = var2.ak_fld.ev_fld * -763835689;
			if (var2.ah_fld + 1 > var2.ak_fld.ey_fld * -1721404151 && (var5 > var7 || var5 < -var7 || var6 > var7 || var6 < -var7)) {
				WidgetDrag var8 = new WidgetDrag();
				og.ci_fld.getCallbacks().post(var8);
			}
		}
	}

	@ObfuscatedName("lb")
	@ObfuscatedSignature(
		descriptor = "(Lqh;IIILuo;Lqg;)Lpk;"
	)
	public static pk lb(qh var0, int var1, int var2, int var3, uo var4, qg var5) throws EOFException {
		if (var0 == null) {
			var0.getClass();
		}

		pk var6 = new pk();
		var6.ak_fld = var2;
		var6.ag_fld = -1535364040 * var3;
		var4.ai_fld.az(var6, var1);
		wk(var0, var2, var4, (byte)0);
		lu var7 = var4.ak(var1);
		var4.bh();
		tb.ag(var4.aw_fld[var1 >> 16], var7, false, var4, var5, -848321946);
		lt(var0, var2, var4);
		pq(var0, qm.ag_fld, var4, (byte)-41);
		return var6;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Luo;I)V"
	)
	public void aa(uo var1, int var2) throws EOFException {
		this.bb(var1);
		uk var3 = var1.bm();
		if (var3.ay()) {
			var3.aw();
			int var4 = var3.al();
			int var5 = var3.au();
			if (var3.ab()) {
				if (var2 <= -1994257027) {
					return;
				}

				if (var3.ao()) {
					lu var6 = var3.as();
					lu var7 = uk.dz(var3, -1094587272);
					int var8 = uk.yq(var3, 273464738);
					int var9 = uk.kq(var3, -79080406);
					int var10 = var3.ax();
					int var11 = var3.an();
					int var12 = tj.ae_fld;
					int var13 = tj.ah_fld;
					var12 -= var4;
					var13 -= var5;
					if (var12 < var8) {
						var12 = var8;
					}

					if (var6.bb_fld + var12 > var8 + var7.bb_fld) {
						var12 = var8 + var7.bb_fld - var6.bb_fld;
					}

					if (var13 < var9) {
						var13 = var9;
					}

					if (var13 + var6.cd_fld > var9 + var7.cd_fld) {
						var13 = var7.cd_fld + var9 - var6.cd_fld;
					}

					int var14 = var12 - var10;
					int var15 = var13 - var11;
					int var16 = var6.ev_fld;
					if (var3.aq() > var6.ey_fld) {
						if (var2 <= -1994257027) {
							return;
						}

						if (var14 > var16 || var14 < -var16 || var15 > var16 || var15 < -var16) {
							var3.ad();
						}
					}

					int var17 = var12 - var8 + var7.cp_fld;
					int var18 = var7.ce_fld + (var13 - var9);
					if (var6.fj_fld != null && var3.ap()) {
						yz var19 = tu.ak(var6).av((Object[])var6.fj_fld, 1251244810).aw(var17, 2143293722).ay(var18, -28900420).ax(-449274236);
						va.ak(var19);
					}

					if (0 == tj.av_fld) {
						if (var2 <= -1994257027) {
							return;
						}

						if (var3.ap()) {
							if (var2 <= -1994257027) {
								return;
							}

							if (null != var6.fb_fld) {
								if (var2 <= -1994257027) {
									return;
								}

								yz var22 = yb.cc(tu.ak(var6).av((Object[])var6.fb_fld, 1879531297).aw(var17, 1839238365).ay(var18, 1616119341), uk.am(var3, (short)1150), (byte)1)
									.ax(780964404);
								this.az_fld.as(var22, (byte)-94);
							}

							this.az_fld.au(var6, uk.am(var3, (short)1150), 1018754203);
						} else {
							this.az_fld.ax(var10 + var4, var5 + var11, -1549556992);
						}

						var3.ag();
					}

					return;
				}
			}

			if (var3.aq() > 1) {
				if (var2 <= -1994257027) {
					return;
				}

				if (!var3.ap() && this.ag_fld.ag(-50451392) > 0) {
					this.az_fld.ay(var4 + var3.ax(), var5 + var3.an(), (byte)87);
				}

				var3.ag();
			}
		}
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "([Llu;Lqm;Luo;)V"
	)
	void bp(lu[] var1, qm var2, uo var3) throws EOFException {
		for (int var4 = 0; var4 < var1.length; var4++) {
			lu var5 = var1[var4];
			if (var5 != null) {
				if (var5.bx_fld == 0) {
					if (null != var5.ge_fld) {
						this.al(var5.ge_fld, var2, var3, 13348922);
					}

					if (var5.by_fld == -1) {
						pk var6 = (pk)var3.ai_fld.ak(var5.bf_fld);
						if (var6 != null) {
							this.ar(var6.ak_fld, var2, var3, 1360902818);
						}
					}
				}

				if (qm.ak_fld == var2 && var5.gn_fld != null) {
					yz var7 = tu.ak(var5).av((Object[])var5.gn_fld, 1757076068).ax(649691914);
					this.az_fld.as(var7, (byte)-82);
				}

				if (qm.ag_fld == var2 && null != var5.gh_fld) {
					if (var5.by_fld >= 0) {
						lu var8 = var3.ak(var5.bf_fld);
						if (null == var8 || null == var8.ge_fld || var5.by_fld >= var8.ge_fld.length || var8.ge_fld[var5.by_fld] != var5) {
							continue;
						}
					}

					yz var9 = tu.ak(var5).av((Object[])var5.gh_fld, 1686372617).ax(971274394);
					this.az_fld.as(var9, (byte)-8);
				}
			}
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lpk;ZLuo;)V"
	)
	public void ab(pk var1, boolean var2, uo var3) throws EOFException {
		int var4 = var1.ak_fld;
		var1.gy_void();
		if (var2) {
			lw.mw(var3, var4, (byte)-39);
		}

		uo.mu(var3, var4, -1868371169);
		pq(this, qm.ag_fld, var3, (byte)-26);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIILuo;Lqg;)Lpk;"
	)
	public pk am(int var1, int var2, int var3, uo var4, qg var5) throws EOFException {
		pk var6 = new pk();
		var6.ak_fld = var2;
		var6.ag_fld = var3;
		var4.ai_fld.az(var6, var1);
		wk(this, var2, var4, (byte)0);
		lu var7 = var4.ak(var1);
		var4.bh();
		tb.ag(var4.aw_fld[var1 >> 16], var7, false, var4, var5, 690639067);
		lt(this, var2, var4);
		pq(this, qm.ag_fld, var4, (byte)-66);
		return var6;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIILuo;Lqg;)Lpk;"
	)
	public pk ao(int var1, int var2, int var3, uo var4, qg var5) throws EOFException {
		pk var6 = new pk();
		var6.ak_fld = var2;
		var6.ag_fld = var3;
		var4.ai_fld.az(var6, var1);
		wk(this, var2, var4, (byte)0);
		lu var7 = var4.ak(var1);
		var4.bh();
		tb.ag(var4.aw_fld[var1 >> 16], var7, false, var4, var5, -902278560);
		lt(this, var2, var4);
		pq(this, qm.ag_fld, var4, (byte)-85);
		return var6;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIILuo;ILqg;)V"
	)
	void bd(int var1, int var2, int var3, int var4, int var5, int var6, int var7, uo var8, int var9, qg var10) throws EOFException {
		if (var8.az(var1)) {
			tw(this, var8.aw_fld[var1], 0, var8.aw_fld[var1].length - 1, -1, -1, var2, var3, var4, var5, var6, var7, var8, var9, var10, -463570406);
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IILuo;Lqg;)V"
	)
	public void ap(int var1, int var2, uo var3, qg var4) throws EOFException {
		pk var5 = (pk)var3.ai_fld.ak(var1);
		pk var6 = (pk)var3.ai_fld.ak(var2);
		if (null != var6) {
			this.az(var6, var5 == null || var6.ak_fld != var5.ak_fld, var3);
		}

		if (var5 != null) {
			var5.gy_void();
			var3.ai_fld.az(var5, var2);
		}

		lu var7 = var3.ak(var2);
		if (null != var7) {
			tb.ag(var3.aw_fld[var7.bf_fld >>> 16], var7, true, var3, var4, 1652332433);
		}

		pq(this, qm.ag_fld, var3, (byte)-110);
	}

	@ObfuscatedName("ii")
	@ObfuscatedSignature(
		descriptor = "(Luk;)Llu;"
	)
	public static lu ii(uk var0) {
		return var0.ag_fld;
	}

	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		descriptor = "(ILuo;)V"
	)
	public void hi(int var1, uo var2) {
		lu[][] var3 = var2.aw_fld;
		boolean var4 = var3 != null && var3[var1] != null;
		if (var4) {
			WidgetLoaded var5 = new WidgetLoaded();
			var5.setGroupId(var1);
			og.ci_fld.getCallbacks().post(var5);
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Luo;IIIILqg;)V"
	)
	public void aj(uo var1, int var2, int var3, int var4, int var5, qg var6) throws EOFException {
		var1.ai().ak();
		var1.bm().az();
		if (-1 != var1.aa_fld) {
			this.av_fld.ak(tj.av_fld, tj.ae_fld, tj.ah_fld * 444543210, 1949631249 * tj.ay_fld, tj.as_fld, tj.ar_fld * -1800987979, var5);
			this.ah(var1.aa_fld, 0, 0, var2, var3, 0, 0, var1, var4, var6);
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Luo;IIIILqg;)V"
	)
	public void at(uo var1, int var2, int var3, int var4, int var5, qg var6) throws EOFException {
		var1.ai().ak();
		var1.bm().az();
		if (-1 != var1.aa_fld) {
			this.av_fld.ak(tj.av_fld, tj.ae_fld, tj.ah_fld, tj.ay_fld, tj.as_fld, tj.ar_fld, var5);
			this.ah(var1.aa_fld, 0, 0, var2, var3, 0, 0, var1, var4, var6);
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lfr;Luo;B)V"
	)
	void an(fr var1, uo var2, byte var3) throws EOFException {
		if (null != var1) {
			if (var1.ah_fld != null) {
				if (-2140649577 * var1.ah_fld.by_fld >= 0) {
					lu var4 = var2.ak(var1.ah_fld.cv_fld * 694320263);
					if (var4 == null) {
						return;
					}

					if (var3 == 3) {
						return;
					}

					if (var4.ge_fld == null
						|| 0 == var4.ge_fld.length
						|| var1.ah_fld.by_fld * -2140649577 >= var4.ge_fld.length
						|| var4.ge_fld[-2140649577 * var1.ah_fld.by_fld] != var1.ah_fld) {
						return;
					}
				}

				if (var1.ah_fld.bx_fld * 1404198381 == 11) {
					if (var3 == 3) {
						return;
					}

					if (var1.ae_fld == 0) {
						if (var3 == 3) {
							return;
						}

						if (var1.ah_fld.be(var1.az_fld, var1.av_fld, 0, 0, -1617803658)) {
							this.az_fld.af(var1.ah_fld, (byte)-83);
						}

						return;
					}
				}

				if (12 == var1.ah_fld.bx_fld * 1404198381) {
					li var5 = lu.bv(var1.ah_fld, -1980498044);
					if (null != var5 && var5.bg()) {
						switch (var1.ae_fld) {
							case 0:
								this.az_fld.al(var1.ah_fld, (byte)50);
								var5.bl(var1.az_fld, var1.av_fld, this.ak_fld.ak(-966082127).ay(82), this.ak_fld.ak(-703214137).ay(81), 2138552032);
								break;
							case 1:
								li.wb(var5, var1.az_fld, var1.av_fld);
						}
					}
				}

				return;
			}

			if (var3 == 3) {
				return;
			}
		}
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIILuo;ILqg;)V"
	)
	void bz(int var1, int var2, int var3, int var4, int var5, int var6, int var7, uo var8, int var9, qg var10) throws EOFException {
		if (var8.az(var1)) {
			tw(this, var8.aw_fld[var1], 0, var8.aw_fld[var1].length - 1, -1, -1, var2, var3, var4, var5, var6, var7, var8, var9, var10, 447621643);
		}
	}

	@ObfuscatedName("mk")
	@ObfuscatedSignature(
		descriptor = "([Llu;Lqm;Luo;)V"
	)
	public void mk(lu[] var1, qm var2, uo var3) throws EOFException {
		this.al(var1, var2, var3, -92988190);
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(Lqg;Luo;)V"
	)
	public void bw(qg var1, uo var2) throws EOFException {
		yz var3 = var1.ah();

		while (var3 != null) {
			yz var4 = var3;
			var3 = var1.ah();
			lu var5 = var4.av((short)-6744);
			if (var5.by_fld >= 0) {
				lu var6 = var2.ak(-223620049 * var5.cv_fld);
				if (null == var6 || null == var6.ge_fld || var5.by_fld >= var6.ge_fld.length || var6.ge_fld[var5.by_fld * 766321167] != var5) {
					continue;
				}
			}

			va.ak(var4);
		}

		var3 = var1.aw();

		while (null != var3) {
			yz var9 = var3;
			var3 = var1.aw();
			lu var12 = var9.av((short)13831);
			if (var12.by_fld >= 0) {
				lu var15 = var2.ak(var12.cv_fld);
				if (var15 == null || null == var15.ge_fld || var12.by_fld >= var15.ge_fld.length || var15.ge_fld[408918063 * var12.by_fld] != var12) {
					continue;
				}
			}

			va.ak(var9);
		}

		var3 = var1.ae();

		while (var3 != null) {
			yz var10 = var3;
			var3 = var1.ae();
			lu var13 = var10.av((short)-4502);
			if (-1550657972 * var13.by_fld >= 0) {
				lu var16 = var2.ak(var13.cv_fld);
				if (null == var16 || var16.ge_fld == null || var13.by_fld >= var16.ge_fld.length || var13 != var16.ge_fld[var13.by_fld]) {
					continue;
				}
			}

			va.ak(var10);
		}

		boolean var11 = false;

		for (fr var14 = var1.ay(); var14 != null; var14 = var1.ay()) {
			if (12 == var14.ah_fld.bx_fld * -1689764747) {
				var11 = true;
			}

			this.an(var14, var2, (byte)-118);
		}

		if (!var11 && tj.ay_fld == 1) {
			this.az_fld.al(null, (byte)-10);
		}
	}

	@ObfuscatedName("wk")
	@ObfuscatedSignature(
		descriptor = "(Lqh;ILuo;B)V"
	)
	public static void wk(qh var0, int var1, uo var2, byte var3) throws EOFException {
		if (var0 == null) {
			var0.getClass();
		}

		if (!var2.az(var1)) {
			if (var3 == 0) {
				;
			}
		} else {
			lu[] var4 = var2.aw_fld[var1];

			for (int var5 = 0; var5 < var4.length; var5++) {
				lu var6 = var4[var5];
				if (var6 != null) {
					var6.gy_fld = 0;
					var6.gz_fld = 0;
				}
			}
		}
	}

	@ObfuscatedName("ir")
	@ObfuscatedSignature(
		descriptor = "(Lqh;Luo;IIIILqg;)V"
	)
	public static void ir(qh var0, uo var1, int var2, int var3, int var4, int var5, qg var6) throws EOFException {
		if (var0 == null) {
			var0.getClass();
		} else {
			var1.ai().ak();
			var1.bm().az();
			if (-1 != var1.aa_fld) {
				var0.av_fld.ak(tj.av_fld, tj.ae_fld * -844200357, tj.ah_fld, 1419428763 * tj.ay_fld, tj.as_fld, tj.ar_fld, var5);
				var0.ah(var1.aa_fld, 0, 0, var2, var3, 0, 0, var1, var4, var6);
			}
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Llu;IIIIIILuo;)V"
	)
	void be(lu var1, int var2, int var3, int var4, int var5, int var6, int var7, uo var8) {
		byte var9;
		if (var8.bd_fld) {
			var9 = 32;
		} else {
			var9 = 0;
		}

		var8.bd_fld = false;
		if (qc.cp(this.av_fld, 503360028) == 1 || !this.ag_fld.ae(1735302627) && qc.cp(this.av_fld, 553438132) == 4) {
			if (var6 >= var2 && var6 < var2 + 16 && var7 >= var3 && var7 < 16 + var3) {
				var1.ce_fld -= 1258742179;
			} else if (var6 >= var2 && var6 < 16 + var2 && var7 >= var4 + var3 - 16 && var7 < var4 + var3) {
				var1.ce_fld += 1843342543;
			} else if (var6 >= var2 - var9 && var6 < var9 + var2 + 16 && var7 >= 16 + var3 && var7 < var4 + var3 - 16) {
				int var10 = var4 * (var4 - 32) / var5;
				if (false) {
					var10 = 8;
				}

				int var11 = var7 - var3 - 16 - var10 / 2;
				int var12 = var4 - 32 - var10;
				var1.ce_fld = -1143292511 * (var11 * (var5 - var4) / var12);
				var8.bd_fld = true;
			}
		}

		if (this.av_fld.ay() != 0) {
			int var13 = var1.bb_fld;
			if (var6 >= var2 - var13 && var7 >= var3 && var6 < 16 + var2 && var7 <= var3 + var4) {
				var1.ce_fld = var1.ce_fld + this.av_fld.ay() * 91444557;
			}
		}
	}

	@ObfuscatedName("pi")
	@ObfuscatedSignature(
		descriptor = "(Lpk;ZLuo;)V"
	)
	public void pi(pk var1, boolean var2, uo var3) {
		og.ci_fld.getCallbacks().post(new WidgetClosed(var1.getId(), var1.getModalMode(), var2));
		if (var2) {
			int var4 = var1.getId();
			ih(var4, client.cz_fld.ak_fld);
			ih(var4, client.cz_fld.az_fld);
			ih(var4, client.cz_fld.ag_fld);
		}
	}

	@ObfuscatedName("rz")
	@ObfuscatedSignature(
		descriptor = "(Lpk;ZLuo;)V"
	)
	public void rz(pk var1, boolean var2, uo var3) throws EOFException {
		this.az(var1, var2, var3);
	}

	@ObfuscatedName("pd")
	@ObfuscatedSignature(
		descriptor = "(Lqh;[Llu;Lqm;Luo;)V"
	)
	public static void pd(qh var0, lu[] var1, qm var2, uo var3) throws EOFException {
		if (var0 == null) {
			var0.getClass();
		} else {
			for (int var4 = 0; var4 < var1.length; var4++) {
				lu var5 = var1[var4];
				if (var5 != null) {
					if (var5.bx_fld == 0) {
						if (null != var5.ge_fld) {
							var0.al(var5.ge_fld, var2, var3, -888583752);
						}

						if (var5.by_fld == -1) {
							pk var6 = (pk)var3.ai_fld.ak(var5.bf_fld);
							if (var6 != null) {
								var0.ar(var6.ak_fld, var2, var3, -696592881);
							}
						}
					}

					if (qm.ak_fld == var2 && var5.gn_fld != null) {
						yz var7 = tu.ak(var5).av((Object[])var5.gn_fld, 1703676343).ax(-510150739);
						var0.az_fld.as(var7, (byte)-36);
					}

					if (qm.ag_fld == var2 && null != var5.gh_fld) {
						if (var5.by_fld >= 0) {
							lu var8 = var3.ak(var5.bf_fld);
							if (null == var8 || null == var8.ge_fld || var5.by_fld >= var8.ge_fld.length || var8.ge_fld[var5.by_fld] != var5) {
								continue;
							}
						}

						yz var9 = tu.ak(var5).av((Object[])var5.gh_fld, 1650489319).ax(-335520999);
						var0.az_fld.as(var9, (byte)-44);
					}
				}
			}
		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(Llu;IIIIIILuo;)V"
	)
	void bs(lu var1, int var2, int var3, int var4, int var5, int var6, int var7, uo var8) {
		byte var9;
		if (var8.bd_fld) {
			var9 = 32;
		} else {
			var9 = 0;
		}

		var8.bd_fld = false;
		if (qc.cp(this.av_fld, 30213114) == 1 || !this.ag_fld.ae(1735302627) && qc.cp(this.av_fld, -507475580) == 4) {
			if (var6 >= var2 && var6 < var2 + 16 && var7 >= var3 && var7 < 16 + var3) {
				var1.ce_fld -= 4;
			} else if (var6 >= var2 && var6 < 16 + var2 && var7 >= var4 + var3 - 16 && var7 < var4 + var3) {
				var1.ce_fld += -299706932;
			} else if (var6 >= var2 - var9 && var6 < var9 + var2 + 16 && var7 >= 16 + var3 && var7 < var4 + var3 - 16) {
				int var10 = var4 * (var4 - 32) / var5;
				if (false) {
					var10 = 8;
				}

				int var11 = var7 - var3 - 16 - var10 / 2;
				int var12 = var4 - 83192469 - var10;
				var1.ce_fld = -1143292511 * (var11 * (var5 - var4) / var12);
				var8.bd_fld = true;
			}
		}

		if (this.av_fld.ay() != 0) {
			int var13 = -1991876350 * var1.bb_fld;
			if (var6 >= var2 - var13 && var7 >= var3 && var6 < 16 + var2 && var7 <= var3 + var4) {
				var1.ce_fld = var1.ce_fld + this.av_fld.ay() * -324156936;
			}
		}
	}

	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		descriptor = "([Llu;IIIIIIIIIILuo;ILqg;)V"
	)
	public void eg(lu[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, uo var12, int var13, qg var14) {
		for (int var15 = var2; var15 <= var3; var15++) {
			lu var16 = var1[var15];
			if (var16 != null && var16.cv_fld == var4 && var16.cy_fld == var5 && !var16.isSelfHidden()) {
				if (var4 != -1) {
					var16.mc(var4);
				}

				int var17 = var10 + var16.getRelativeX();
				int var18 = var11 + var16.getRelativeY();
				var16.is(var17);
				var16.qw(var18);
				if (var16.getType() == 0 && var16.getIndex() == -1) {
					pk var19 = (pk)var12.ai_fld.get(var16.getId());
					if (var19 != null) {
						int var20 = var16.getId();
						int var21 = var19.getId();
						lu[] var22 = cf.cg_fld.aw_fld[var21];

						for (lu var26 : var22) {
							if (var26.cv_fld == -1) {
								var26.mc(var20);
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("vm")
	@ObfuscatedSignature(
		descriptor = "(Lqh;ILuo;)V"
	)
	public static void vm(qh var0, int var1, uo var2) throws EOFException {
		if (var0 == null) {
			var0.getClass();
		}

		if (var2.az(var1)) {
			lu[] var3 = var2.aw_fld[var1];

			for (int var4 = 0; var4 < var3.length; var4++) {
				lu var5 = var3[var4];
				if (var5 != null) {
					var5.gy_fld = 0;
					var5.gz_fld = 0;
				}
			}
		}
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(Llu;IIIIIILuo;)V"
	)
	void bh(lu var1, int var2, int var3, int var4, int var5, int var6, int var7, uo var8) {
		byte var9;
		if (var8.bd_fld) {
			var9 = 32;
		} else {
			var9 = 0;
		}

		var8.bd_fld = false;
		if (qc.cp(this.av_fld, -839553997) == 1 || !this.ag_fld.ae(1735302627) && qc.cp(this.av_fld, 1054581572) == 4) {
			if (var6 >= var2 && var6 < var2 + 16 && var7 >= var3 && var7 < 16 + var3) {
				var1.ce_fld -= 4;
			} else if (var6 >= var2 && var6 < 16 + var2 && var7 >= var4 + var3 - 16 && var7 < var4 + var3) {
				var1.ce_fld += 4;
			} else if (var6 >= var2 - var9 && var6 < var9 + var2 + 16 && var7 >= 16 + var3 && var7 < var4 + var3 - 16) {
				int var10 = var4 * (var4 - -1878441998) / var5;
				if (false) {
					var10 = 8;
				}

				int var11 = var7 - var3 - 16 - var10 / 2;
				int var12 = var4 - 575509108 - var10;
				var1.ce_fld = -1143292511 * (var11 * (var5 - var4) / var12);
				var8.bd_fld = true;
			}
		}

		if (this.av_fld.ay() != 0) {
			int var13 = -1484556566 * var1.bb_fld;
			if (var6 >= var2 - var13 && var7 >= var3 && var6 < 16 + var2 && var7 <= var3 + var4) {
				var1.ce_fld = var1.ce_fld + this.av_fld.ay() * 91444557;
			}
		}
	}

	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "(Lqh;[Llu;Lqm;Luo;)V"
	)
	public static void da(qh var0, lu[] var1, qm var2, uo var3) throws EOFException {
		if (var0 == null) {
			var0.getClass();
		} else {
			for (int var4 = 0; var4 < var1.length; var4++) {
				lu var5 = var1[var4];
				if (var5 != null) {
					if (var5.bx_fld == 0) {
						if (null != var5.ge_fld) {
							var0.al(var5.ge_fld, var2, var3, 1614460720);
						}

						if (var5.by_fld == -1) {
							pk var6 = (pk)var3.ai_fld.ak(var5.bf_fld);
							if (var6 != null) {
								var0.ar(var6.ak_fld, var2, var3, -2054611631);
							}
						}
					}

					if (qm.ak_fld == var2 && var5.gn_fld != null) {
						yz var7 = tu.ak(var5).av((Object[])var5.gn_fld, 1912252800).ax(-782323171);
						var0.az_fld.as(var7, (byte)-44);
					}

					if (qm.ag_fld == var2 && null != var5.gh_fld) {
						if (var5.by_fld >= 0) {
							lu var8 = var3.ak(var5.bf_fld);
							if (null == var8 || null == var8.ge_fld || var5.by_fld >= var8.ge_fld.length || var8.ge_fld[var5.by_fld] != var5) {
								continue;
							}
						}

						yz var9 = tu.ak(var5).av((Object[])var5.gh_fld, 1604952894).ax(-1013595655);
						var0.az_fld.as(var9, (byte)-42);
					}
				}
			}
		}
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(Lqm;Luo;)V"
	)
	public void bj(qm var1, uo var2) throws EOFException {
		if (var2.aa_fld != -1) {
			this.ar(var2.aa_fld, var1, var2, -1253965428);
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIILuo;Lqg;)Lpk;"
	)
	public pk aq(int var1, int var2, int var3, uo var4, qg var5) throws EOFException {
		pk var6 = new pk();
		var6.ak_fld = var2;
		var6.ag_fld = var3;
		var4.ai_fld.az(var6, var1);
		wk(this, var2, var4, (byte)0);
		lu var7 = var4.ak(var1);
		var4.bh();
		tb.ag(var4.aw_fld[var1 >> 16], var7, false, var4, var5, 1084239502);
		lt(this, var2, var4);
		pq(this, qm.ag_fld, var4, (byte)-30);
		return var6;
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(Lqm;Luo;)V"
	)
	public void by(qm var1, uo var2) throws EOFException {
		if (var2.aa_fld != -1) {
			this.ar(var2.aa_fld, var1, var2, -379261936);
		}
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(ILqm;Luo;)V"
	)
	void bl(int var1, qm var2, uo var3) throws EOFException {
		if (var3.az(var1)) {
			this.al(var3.aw_fld[var1], var2, var3, 2073936676);
		}
	}

	@ObfuscatedName("ia")
	@ObfuscatedSignature(
		descriptor = "(Lcx;I)Lsb;"
	)
	public static sb ia(cx var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			sb var2 = (sb)(sb)var0.az_fld.get(var1);
			return null != var2 ? var2 : var0.ae_fld;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIILuo;Lqg;)Lpk;"
	)
	public pk ag(int var1, int var2, int var3, uo var4, qg var5) throws EOFException {
		pk var7 = new pk();
		var7.ak_fld = var2;
		var7.ag_fld = var3;
		var4.ai_fld.az(var7, var1);
		wk(this, var2, var4, (byte)0);
		lu var8 = var4.ak(var1);
		var4.bh();
		tb.ag(var4.aw_fld[var1 >> 16], var8, false, var4, var5, 256429253);
		lt(this, var2, var4);
		pq(this, qm.ag_fld, var4, (byte)-82);
		return var7;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(ILuo;)V"
	)
	void bo(int var1, uo var2) throws EOFException {
		if (-1 != var1) {
			if (var2.az(var1)) {
				lu[] var3 = var2.aw_fld[var1];

				for (int var4 = 0; var4 < var3.length; var4++) {
					lu var5 = var3[var4];
					if (null != var5.eu_fld) {
						yz var6 = tu.ak(var5).av((Object[])var5.eu_fld, 1574982457).ax(-420709538);
						this.az_fld.ar(var6, (byte)-72);
					}
				}
			}
		}
	}

	@ObfuscatedName("oe")
	@ObfuscatedSignature(
		descriptor = "(Lqh;ILuo;)V"
	)
	public static void oe(qh var0, int var1, uo var2) throws EOFException {
		if (var0 == null) {
			var0.getClass();
		}

		if (var2.az(var1)) {
			lu[] var3 = var2.aw_fld[var1];

			for (int var4 = 0; var4 < var3.length; var4++) {
				lu var5 = var3[var4];
				if (var5 != null) {
					var5.gy_fld = 0;
					var5.gz_fld = 0;
				}
			}
		}
	}

	@ObfuscatedName("ih")
	@ObfuscatedSignature(
		descriptor = "(ILno;)V"
	)
	public static void ih(int var0, no var1) {
		for (yz var2 = (yz)var1.xy(); var2 != null; var2 = (yz)var1.kn()) {
			lu var3 = var2.getSource();
			int var4 = WidgetUtil.componentToInterface(var3.getId());
			if (var0 == var4) {
				var2.xh();
			}
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIILuo;Lqg;)V"
	)
	public void ai(int var1, int var2, int var3, uo var4, qg var5) throws EOFException {
		var4.aa_fld = var1;
		int var6 = var4.aa_fld;
		if (var4.az(var6)) {
			fm.av(var4.aw_fld[var6], 0, var4.aw_fld[var6].length - 1, -1, -1, var2, var3, false, var4, var5, -12824464);
		}

		wk(this, var1, var4, (byte)0);
		lt(this, var4.aa_fld, var4);
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(ILqm;Luo;)V"
	)
	void bx(int var1, qm var2, uo var3) throws EOFException {
		if (var3.az(var1)) {
			this.al(var3.aw_fld[var1], var2, var3, -1054097256);
		}
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(Lqg;Luo;)V"
	)
	public void ba(qg var1, uo var2) throws EOFException {
		yz var3 = var1.ah();

		while (var3 != null) {
			yz var4 = var3;
			var3 = var1.ah();
			lu var5 = var4.av((short)8819);
			if (var5.by_fld >= 0) {
				lu var6 = var2.ak(-415602862 * var5.cv_fld);
				if (null == var6 || null == var6.ge_fld || var5.by_fld >= var6.ge_fld.length || var6.ge_fld[var5.by_fld * -530214163] != var5) {
					continue;
				}
			}

			va.ak(var4);
		}

		var3 = var1.aw();

		while (null != var3) {
			yz var9 = var3;
			var3 = var1.aw();
			lu var12 = var9.av((short)-26041);
			if (-1088565344 * var12.by_fld >= 0) {
				lu var15 = var2.ak(var12.cv_fld);
				if (var15 == null || null == var15.ge_fld || var12.by_fld >= var15.ge_fld.length || var15.ge_fld[-1604000195 * var12.by_fld] != var12) {
					continue;
				}
			}

			va.ak(var9);
		}

		var3 = var1.ae();

		while (var3 != null) {
			yz var10 = var3;
			var3 = var1.ae();
			lu var13 = var10.av((short)-14997);
			if (var13.by_fld >= 0) {
				lu var16 = var2.ak(var13.cv_fld);
				if (null == var16 || var16.ge_fld == null || var13.by_fld >= var16.ge_fld.length || var13 != var16.ge_fld[var13.by_fld]) {
					continue;
				}
			}

			va.ak(var10);
		}

		boolean var11 = false;

		for (fr var14 = var1.ay(); var14 != null; var14 = var1.ay()) {
			if (12 == var14.ah_fld.bx_fld * 2003617435) {
				var11 = true;
			}

			this.an(var14, var2, (byte)-31);
		}

		if (!var11 && tj.ay_fld == 1) {
			this.az_fld.al(null, (byte)36);
		}
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(Lqh;ILuo;)V"
	)
	public static void bo(qh var0, int var1, uo var2) throws EOFException {
		if (var0 == null) {
			var0.getClass();
		} else if (var2.az(var1)) {
			lu[] var3 = var2.aw_fld[var1];

			for (int var4 = 0; var4 < var3.length; var4++) {
				lu var5 = var3[var4];
				if (var5 != null) {
					var5.gy_fld = 0;
					var5.gz_fld = 0;
				}
			}
		}
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(Lqg;Luo;)V"
	)
	public void bc(qg var1, uo var2) throws EOFException {
		yz var3 = var1.ah();

		while (var3 != null) {
			yz var4 = var3;
			var3 = var1.ah();
			lu var5 = var4.av((short)11914);
			if (-1300933893 * var5.by_fld >= 0) {
				lu var6 = var2.ak(var5.cv_fld);
				if (null == var6 || null == var6.ge_fld || var5.by_fld >= var6.ge_fld.length || var6.ge_fld[var5.by_fld * -749329908] != var5) {
					continue;
				}
			}

			va.ak(var4);
		}

		var3 = var1.aw();

		while (null != var3) {
			yz var9 = var3;
			var3 = var1.aw();
			lu var12 = var9.av((short)22812);
			if (253302015 * var12.by_fld >= 0) {
				lu var15 = var2.ak(var12.cv_fld);
				if (var15 == null || null == var15.ge_fld || var12.by_fld >= var15.ge_fld.length || var15.ge_fld[-1361332695 * var12.by_fld] != var12) {
					continue;
				}
			}

			va.ak(var9);
		}

		var3 = var1.ae();

		while (var3 != null) {
			yz var10 = var3;
			var3 = var1.ae();
			lu var13 = var10.av((short)6040);
			if (-102619421 * var13.by_fld >= 0) {
				lu var16 = var2.ak(var13.cv_fld * -406422949);
				if (null == var16 || var16.ge_fld == null || var13.by_fld >= var16.ge_fld.length || var13 != var16.ge_fld[var13.by_fld]) {
					continue;
				}
			}

			va.ak(var10);
		}

		boolean var11 = false;

		for (fr var14 = var1.ay(); var14 != null; var14 = var1.ay()) {
			if (12 == var14.ah_fld.bx_fld * -226005197) {
				var11 = true;
			}

			this.an(var14, var2, (byte)19);
		}

		if (!var11 && tj.ay_fld == 1) {
			this.az_fld.al(null, (byte)-87);
		}
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "([Llu;IIIIIIIIIILuo;ILqg;)V"
	)
	void br(lu[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, uo var12, int var13, qg var14) throws EOFException {
		boolean var15 = this.ag_fld.ak(-1665228900);
		fi var16 = this.ak_fld.ak(-1567586216);

		for (int var17 = var2; var17 <= var3; var17++) {
			lu var18 = var1[var17];
			if (var18 != null
				&& var4 == var18.cv_fld
				&& var18.cy_fld == var5
				&& uo.qr(var12, var18, -1734973692)
				&& (var18.bj_fld ? !var12.am(var18) : var18.bx_fld != 0 || var12.ai().ag(var18) || !var12.am(var18))) {
				if (11 == var18.bx_fld) {
					if (var18.bo(var12, this.ak_fld.az(-951958469), (byte)81)) {
						if (lu.qz(var18, 2035992404)) {
							tb.ag(var18.ge_fld, var18, true, var12, var14, 1086727520);
							mx.xa(ma.gb(var18.bx_ma(1183322552), -550632754), 3, var18.bx_ma(1442782925).ax());
						}

						if (var18.gs_fld != null) {
							yz var19 = tu.ak(var18).av((Object[])var18.gs_fld, 1471210717).ax(1285798291);
							var14.ak(var19);
						}
					}
				} else if (12 == var18.bx_fld) {
					var18.bw(var12, 1081334298);
				}

				int var36 = var10 + var18.bq_fld;
				int var20 = var18.bg_fld + var11;
				int var21;
				int var22;
				int var23;
				int var24;
				if (9 == var18.bx_fld) {
					int var25 = var36;
					int var26 = var20;
					int var27 = var18.bb_fld + var36;
					int var28 = var18.cd_fld + var20;
					if (var27 < var36) {
						var25 = var27;
						var27 = var36;
					}

					if (var28 < var20) {
						var26 = var28;
						var28 = var20;
					}

					var27++;
					var28++;
					var21 = var25 > var6 ? var25 : var6;
					var22 = var26 > var7 ? var26 : var7;
					var23 = var27 < var8 ? var27 : var8;
					var24 = var28 < var9 ? var28 : var9;
				} else {
					int var37 = var36 + var18.bb_fld;
					int var39 = var20 + var18.cd_fld;
					var21 = var36 > var6 ? var36 : var6;
					var22 = var20 > var7 ? var20 : var7;
					var23 = var37 < var8 ? var37 : var8;
					var24 = var39 < var9 ? var39 : var9;
				}

				var12.bm().ae(var18, var36, var20);
				boolean var38 = false;
				if (var18.ez_fld) {
					switch (var12.ap_fld) {
						case 0:
							var38 = true;
						case 1:
						default:
							break;
						case 2:
							if (var12.at_fld == var18.bf_fld >>> 16) {
								var38 = true;
							}
							break;
						case 3:
							if (var18.bf_fld == var12.at_fld) {
								var38 = true;
							}
					}
				}

				if (var38 || !var18.bj_fld || var21 < var23 && var22 < var24) {
					if (var18.bj_fld) {
						if (var18.hb_fld) {
							if (qc.cy(this.av_fld, -173914327) >= var21 && this.av_fld.av() >= var22 && qc.cy(this.av_fld, -173914327) < var23 && this.av_fld.av() < var24) {
								qg.ai(var14, (byte)0);
								var12.bm().am();
								if (!var15) {
									this.az_fld.ak(564030271);
								}
							}
						} else if (var18.hf_fld
							&& qc.cy(this.av_fld, -173914327) >= var21
							&& this.av_fld.av() >= var22
							&& qc.cy(this.av_fld, -173914327) < var23
							&& this.av_fld.av() < var24) {
							var14.af(900130878);
						}
					}

					int var40 = qc.cy(this.av_fld, -173914327);
					int var42 = this.av_fld.av();
					if (qc.tx(this.av_fld, (byte)-81) != 0) {
						var40 = this.av_fld.ah();
						var42 = qc.hg(this.av_fld, -382839423);
					}

					boolean var44 = var40 >= var21 && var42 >= var22 && var40 < var23 && var42 < var24;
					if (1337 == var18.bp_fld) {
						if (!this.ag_fld.av(1767424052) && !var15 && var44) {
							this.az_fld.ag(var40, var42, var21, var22, 2066339195);
						}
					} else if (1338 == var18.bp_fld) {
						kf.af(var18, var36, var20);
					} else {
						if (var18.bp_fld == 1400) {
							this.ak_fld.ae(1293787896).az(var40, var42, var44, var36, var20, var18.bb_fld, var18.cd_fld, -528102792);
						}

						if (!var15 && var44) {
							if (var18.bp_fld == 1400) {
								this.ak_fld.ae(1293787896).cv(var36, var20, var18.bb_fld, var18.cd_fld, var40, var42, 1809736504);
							} else {
								this.az_fld.az(var18, (byte)-37);
							}
						}

						if (var38) {
							for (int var29 = 0; var29 < var18.er_fld.length; var29++) {
								boolean var30 = false;
								boolean var31 = false;
								if (!var30 && var18.er_fld[var29] != null) {
									for (int var32 = 0; var32 < var18.er_fld[var29].length; var32++) {
										boolean var33 = false;
										if (var18.hp_fld != null) {
											var33 = var16.ay(var18.er_fld[var29][var32]);
										}

										if (this.ak_fld.ag(-607999722).aw(var18.er_fld[var29][var32]) || var33) {
											var30 = true;
											if (null != var18.hp_fld && var18.hp_fld[var29] > var13) {
												break;
											}

											byte var34 = var18.en_fld[var29][var32];
											if (0 == var34
												|| ((var34 & 8) == 0 || !var16.ay(86) && !var16.ay(82) && !var16.ay(81))
													&& (0 == (var34 & 2) || var16.ay(86))
													&& ((var34 & 1) == 0 || var16.ay(82))
													&& ((var34 & 4) == 0 || var16.ay(81))) {
												var31 = true;
												break;
											}
										}
									}
								}

								if (var31) {
									if (var29 < 10) {
										this.az_fld.av(var29 + 1, var18.bf_fld, var18.by_fld, var18.ga_fld, "", (short)7451);
									} else if (var29 == 10) {
										this.az_fld.ah(742829213);
										String var59 = var12.ao(var18);
										if (null == var59) {
											var59 = kh.aj_fld;
										}

										String var78 = var18.eq_fld + gd.ag(16777215, -1940547058);
										int var85 = uo.sa(var12, var18, -1325849523);
										this.az_fld.ae(var18.bf_fld, var18.by_fld, nt.ag(var85), var18.ga_fld, var59, var78, -1596833618);
									}

									int var60 = var18.eg_fld[var29];
									if (var18.hp_fld == null) {
										var18.hp_fld = new int[var18.er_fld.length];
									}

									if (null == var18.ef_fld) {
										var18.ef_fld = new int[var18.er_fld.length];
									}

									if (var60 != 0) {
										if (var18.hp_fld[var29] == 0) {
											var18.hp_fld[var29] = var18.ef_fld[var29] + var13 + var60;
										} else {
											var18.hp_fld[var29] = var13 + var60;
										}
									} else {
										var18.hp_fld[var29] = Integer.MAX_VALUE;
									}
								}

								if (!var30 && null != var18.hp_fld) {
									var18.hp_fld[var29] = 0;
								}
							}
						}

						if (var18.bj_fld) {
							var44 = qc.cy(this.av_fld, -173914327) >= var21 && this.av_fld.av() >= var22 && qc.cy(this.av_fld, -173914327) < var23 && this.av_fld.av() < var24;
							boolean var46 = (qc.cp(this.av_fld, 1128630036) == 1 || !this.ag_fld.ae(1735302627) && qc.cp(this.av_fld, 936690845) == 4) && var44;
							boolean var48 = (qc.tx(this.av_fld, (byte)-28) == 1 || !this.ag_fld.ae(1735302627) && qc.tx(this.av_fld, (byte)-117) == 4)
								&& this.av_fld.ah() >= var21
								&& qc.hg(this.av_fld, -771468319) >= var22
								&& this.av_fld.ah() < var23
								&& qc.hg(this.av_fld, 834644886) < var24;
							if (var48 && !this.ag_fld.ak(-1665228900) && var12.br(var18, this.av_fld.ah() - var36, qc.hg(this.av_fld, 1272964936) - var20)) {
								this.az_fld.aw(1477385749);
							}

							if (lu.wm(var18, -1576504735)) {
								if (var48) {
									var14.av(new fr(0, tj.ae_fld - var36, tj.ah_fld - var20, var18));
								}

								if (var46) {
									var14.av(new fr(1, tj.ae_fld - var36, tj.ah_fld - var20, var18));
								}
							}

							if (1400 == var18.bp_fld) {
								wl.bj(this.ak_fld.ae(1293787896), var40, var42, var44 & var46, var44 & var48, -1982911814);
							}

							if (var12.bz() && var12.bd() != var18 && var44 && cn.az(uo.sa(var12, var18, 1898611905))) {
								var12.bm().ah(var18);
							}

							uk.vc(var12.bm(), var18, var36, var20);
							if (var18.eh_fld) {
								if (var44 && this.av_fld.ay() != 0 && null != var18.fq_fld) {
									yz var49 = tu.ak(var18).az(true, (byte)8).av((Object[])var18.fq_fld, 1446081472).ay(this.av_fld.ay(), 1485443885).ax(1335455478);
									var14.ak(var49);
								}

								if (var12.bz() || this.ag_fld.ak(-1665228900)) {
									var48 = false;
									var46 = false;
									var44 = false;
								}

								if (!var18.gx_fld && var48) {
									var18.gx_fld = true;
									if (var18.ej_fld != null) {
										yz var50 = tu.ak(var18)
											.az(true, (byte)8)
											.av((Object[])var18.ej_fld, 1677657341)
											.aw(tj.as_fld - var36, 1616246708)
											.ay(tj.ar_fld - var20, -271937063)
											.ax(1532582378);
										var14.ak(var50);
									}
								}

								if (var18.gx_fld && var46 && null != var18.fy_fld) {
									yz var51 = tu.ak(var18)
										.az(true, (byte)8)
										.av((Object[])var18.fy_fld, 1316129056)
										.aw(tj.ae_fld - var36, 518595263)
										.ay(tj.ah_fld - var20, 635999523)
										.ax(-1022862058);
									var14.ak(var51);
								}

								if (var18.gx_fld && !var46) {
									var18.gx_fld = false;
									if (null != var18.fa_fld) {
										yz var52 = tu.ak(var18)
											.az(true, (byte)8)
											.av((Object[])var18.fa_fld, 1474103497)
											.aw(tj.ae_fld - var36, 958944856)
											.ay(tj.ah_fld - var20, -1743051765)
											.ax(1247462736);
										var14.az(var52);
									}
								}

								if (var46 && null != var18.fo_fld) {
									yz var53 = tu.ak(var18)
										.az(true, (byte)8)
										.av((Object[])var18.fo_fld, 1747842858)
										.aw(tj.ae_fld - var36, 1872744970)
										.ay(tj.ah_fld - var20, 979297321)
										.ax(-311204995);
									var14.ak(var53);
								}

								if (!var18.gw_fld && var44) {
									var18.gw_fld = true;
									if (var18.fp_fld != null) {
										yz var54 = tu.ak(var18)
											.az(true, (byte)8)
											.av((Object[])var18.fp_fld, 1279674379)
											.aw(tj.ae_fld - var36, 750212512)
											.ay(tj.ah_fld - var20, 509501606)
											.ax(132556753);
										var14.ak(var54);
									}
								}

								if (var18.gw_fld && var44 && var18.fx_fld != null) {
									yz var55 = tu.ak(var18)
										.az(true, (byte)8)
										.av((Object[])var18.fx_fld, 1691177600)
										.aw(tj.ae_fld - var36, 1534118321)
										.ay(tj.ah_fld - var20, 1143801036)
										.ax(-1617099531);
									var14.ak(var55);
								}

								if (var18.gw_fld && !var44) {
									var18.gw_fld = false;
									if (null != var18.fv_fld) {
										yz var56 = tu.ak(var18)
											.az(true, (byte)8)
											.av((Object[])var18.fv_fld, 1085585399)
											.aw(tj.ae_fld - var36, -401729384)
											.ay(tj.ah_fld - var20, 351372878)
											.ax(1439544119);
										var14.az(var56);
									}
								}

								if (null != var18.fn_fld) {
									yz var57 = tu.ak(var18).av((Object[])var18.fn_fld, 1743371089).ax(637130748);
									var14.ag(var57);
								}

								pi var58 = this.ak_fld.av(410652385);
								if (var18.fh_fld != null && pi.sx(var58, 1595292530) > var18.gl_fld) {
									if (var18.fm_fld != null && pi.sx(var58, -339757754) - var18.gl_fld <= 32) {
										label813:
										for (int var62 = var18.gl_fld; var62 < pi.sx(var58, 2085393285); var62++) {
											int var79 = pi.aw(var58, var62);

											for (int var86 = 0; var86 < var18.fm_fld.length; var86++) {
												if (var79 == var18.fm_fld[var86]) {
													yz var35 = tu.ak(var18).av((Object[])var18.fh_fld, 1234117362).ax(-829610746);
													var14.ak(var35);
													break label813;
												}
											}
										}
									} else {
										yz var61 = tu.ak(var18).av((Object[])var18.fh_fld, 1010522546).ax(1065658768);
										var14.ak(var61);
									}

									var18.gl_fld = pi.sx(var58, 274230537);
								}

								if (var18.fe_fld != null && var58.am() > var18.hr_fld) {
									if (null != var18.fw_fld && var58.am() - var18.hr_fld <= 32) {
										label789:
										for (int var64 = var18.hr_fld; var64 < var58.am(); var64++) {
											int var80 = var58.aq(var64);

											for (int var87 = 0; var87 < var18.fw_fld.length; var87++) {
												if (var18.fw_fld[var87] == var80) {
													yz var92 = tu.ak(var18).av((Object[])var18.fe_fld, 1894313341).ax(-1449421259);
													var14.ak(var92);
													break label789;
												}
											}
										}
									} else {
										yz var63 = tu.ak(var18).av((Object[])var18.fe_fld, 2030536538).ax(-643057197);
										var14.ak(var63);
									}

									var18.hr_fld = var58.am();
								}

								if (null != var18.fl_fld && var58.ao() > var18.hj_fld) {
									if (null != var18.fg_fld && var58.ao() - var18.hj_fld <= 32) {
										label765:
										for (int var66 = var18.hj_fld; var66 < var58.ao(); var66++) {
											int var81 = var58.ad(var66);

											for (int var88 = 0; var88 < var18.fg_fld.length; var88++) {
												if (var81 == var18.fg_fld[var88]) {
													yz var93 = tu.ak(var18).av((Object[])var18.fl_fld, 1011185924).ax(562674636);
													var14.ak(var93);
													break label765;
												}
											}
										}
									} else {
										yz var65 = tu.ak(var18).av((Object[])var18.fl_fld, 1716248089).ax(464313340);
										var14.ak(var65);
									}

									var18.hj_fld = var58.ao();
								}

								if (var58.ac() > var18.gb_fld && null != var18.fs_fld) {
									yz var67 = tu.ak(var18).av((Object[])var18.fs_fld, 1738435062).ax(-922256219);
									var14.ak(var67);
								}

								if (var58.ab() > var18.gb_fld && var18.fz_fld != null) {
									yz var68 = tu.ak(var18).av((Object[])var18.fz_fld, 1032564806).ax(93131941);
									var14.ak(var68);
								}

								if (pi.ss(var58, (byte)121) > var18.gb_fld && null != var18.ff_fld) {
									yz var69 = tu.ak(var18).av((Object[])var18.ff_fld, 2074333223).ax(-512483723);
									var14.ak(var69);
								}

								if (var58.at() > var18.gb_fld && null != var18.gg_fld) {
									yz var70 = tu.ak(var18).av((Object[])var18.gg_fld, 1064560985).ax(23053735);
									var14.ak(var70);
								}

								if (pi.yc(var58, (byte)-102) > var18.gb_fld && null != var18.gc_fld) {
									yz var71 = tu.ak(var18).av((Object[])var18.gc_fld, 1638541003).ax(-614685864);
									var14.ak(var71);
								}

								if (pi.jf(var58, 406675762) > var18.gb_fld && var18.gj_fld != null) {
									yz var72 = tu.ak(var18).av((Object[])var18.gj_fld, 1180281494).ax(1129394371);
									var14.ak(var72);
								}

								if (pi.fd(var58, 578816271) > var18.gb_fld && var18.gt_fld != null) {
									yz var73 = tu.ak(var18).av((Object[])var18.gt_fld, 1563178318).ax(519417917);
									var14.ak(var73);
								}

								if (var58.ap() > var18.gb_fld && var18.go_fld != null) {
									yz var74 = tu.ak(var18).av((Object[])var18.go_fld, 1764484548).ax(-691108809);
									var14.ak(var74);
								}

								var18.gb_fld = var58.bz();
								if (var18.fu_fld != null) {
									fz var75 = this.ak_fld.ag(-2129338400);

									for (int var82 = 0; var82 < var75.ag(); var82++) {
										yz var89 = yb.bl(tu.ak(var18).av((Object[])var18.fu_fld, 1970626845), fz.vc(var75, var82, (byte)-54)).ah(var75.ah(var82), -2004628831).ax(250926747);
										var14.ak(var89);
									}
								}

								if (null != var18.fr_fld) {
									int[] var76 = var16.al();

									for (int var83 = 0; var83 < var76.length; var83++) {
										yz var90 = yb.bl(tu.ak(var18).av((Object[])var18.fr_fld, 1005882745), var76[var83]).ax(-327693018);
										var14.ak(var90);
									}
								}

								if (null != var18.fi_fld) {
									int[] var77 = var16.af();

									for (int var84 = 0; var84 < var77.length; var84++) {
										yz var91 = yb.bl(tu.ak(var18).av((Object[])var18.fi_fld, 1525634496), var77[var84]).ax(-935718391);
										var14.ak(var91);
									}
								}
							}
						}

						if (!var18.bj_fld) {
							if (var12.bz() || this.ag_fld.ak(-1665228900)) {
								continue;
							}

							if ((var18.gk_fld >= 0 || var18.cw_fld != 0)
								&& qc.cy(this.av_fld, -173914327) >= var21
								&& this.av_fld.av() >= var22
								&& qc.cy(this.av_fld, -173914327) < var23
								&& this.av_fld.av() < var24) {
								if (var18.gk_fld >= 0) {
									ui.nu(var12.ai(), var1[var18.gk_fld], -1254596105);
								} else {
									ui.nu(var12.ai(), var18, -1254596105);
								}
							}

							if (var18.bx_fld == 8
								&& qc.cy(this.av_fld, -173914327) >= var21
								&& this.av_fld.av() >= var22
								&& qc.cy(this.av_fld, -173914327) < var23
								&& this.av_fld.av() < var24) {
								var12.ai().az(var18);
							}

							if (var18.cr_fld > var18.cd_fld) {
								this.ay(var18, var18.bb_fld + var36, var20, var18.cd_fld, var18.cr_fld, qc.cy(this.av_fld, -173914327), this.av_fld.av(), var12, 804524353);
							}
						}

						if (var18.bx_fld == 0) {
							tw(
								this,
								var1,
								var18.cx_fld,
								var18.cs_fld,
								var18.bf_fld,
								var18.by_fld,
								var21,
								var22,
								var23,
								var24,
								var36 - var18.cp_fld,
								var20 - var18.ce_fld,
								var12,
								var13,
								var14,
								353861815
							);
							if (null != var18.ge_fld) {
								tw(
									this,
									var18.ge_fld,
									0,
									var18.ge_fld.length - 1,
									var18.bf_fld,
									-1,
									var21,
									var22,
									var23,
									var24,
									var36 - var18.cp_fld,
									var20 - var18.ce_fld,
									var12,
									var13,
									var14,
									1924360831
								);
							}

							if (var18.by_fld == -1) {
								pk var47 = (pk)var12.ai_fld.ak(var18.bf_fld);
								if (null != var47) {
									if (0 == var47.ag_fld && tj.ae_fld >= var21 && tj.ah_fld >= var22 && tj.ae_fld < var23 && tj.ah_fld < var24 && !this.ag_fld.ak(-1665228900)) {
										qg.ai(var14, (byte)0);
										var12.bm().am();
										if (!var15) {
											this.az_fld.ak(-92374106);
										}
									}

									this.ah(var47.ak_fld, var21, var22, var23, var24, var36, var20, var12, var13, var14);
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("tw")
	@ObfuscatedSignature(
		descriptor = "(Lqh;[Llu;IIIIIIIIIILuo;ILqg;I)V"
	)
	public static void tw(
		qh var0,
		lu[] var1,
		int var2,
		int var3,
		int var4,
		int var5,
		int var6,
		int var7,
		int var8,
		int var9,
		int var10,
		int var11,
		uo var12,
		int var13,
		qg var14,
		int var15
	) throws EOFException {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.eg(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14);
			boolean var16 = var0.ag_fld.ak(-1665228900);
			fi var17 = var0.ak_fld.ak(-405607063);

			for (int var18 = var2; var18 <= var3; var18++) {
				lu var19 = var1[var18];
				if (var19 != null && var4 == var19.cv_fld && var19.cy_fld == var5) {
					if (!uo.qr(var12, var19, -1600312471)) {
						if (var15 == 228932457) {
							return;
						}
					} else {
						if (var19.bj_fld) {
							if (var15 == 228932457) {
								return;
							}

							if (var12.am(var19)) {
								continue;
							}
						} else if (var19.bx_fld == 0 && !var12.ai().ag(var19)) {
							if (var15 == 228932457) {
								return;
							}

							if (var12.am(var19)) {
								continue;
							}
						}

						if (11 == var19.bx_fld) {
							if (var19.bo(var12, var0.ak_fld.az(99563659), (byte)-30)) {
								if (var15 == 228932457) {
									return;
								}

								if (lu.qz(var19, 729463404)) {
									tb.ag(var19.ge_fld, var19, true, var12, var14, 985808748);
									mx.xa(ma.gb(var19.bx_ma(1977444380), -525560055), 3, var19.bx_ma(1063906497).ax());
								}

								if (var19.gs_fld != null) {
									yz var20 = tu.ak(var19).av((Object[])var19.gs_fld, 1199496804).ax(-291064811);
									var14.ak(var20);
								}
							}
						} else if (12 == var19.bx_fld) {
							if (var15 == 228932457) {
								return;
							}

							var19.bw(var12, 902712606);
						}

						int var37 = var10 + var19.bq_fld;
						int var21 = var19.bg_fld + var11;
						int var22;
						int var23;
						int var24;
						int var25;
						if (9 == var19.bx_fld) {
							int var26 = var37;
							int var27 = var21;
							int var28 = var19.bb_fld + var37;
							int var29 = var19.cd_fld + var21;
							if (var28 < var37) {
								var26 = var28;
								var28 = var37;
							}

							if (var29 < var21) {
								var27 = var29;
								var29 = var21;
							}

							var28++;
							var29++;
							int var10000;
							if (var26 > var6) {
								if (var15 == 228932457) {
									return;
								}

								var10000 = var26;
							} else {
								var10000 = var6;
							}

							var22 = var10000;
							if (var27 > var7) {
								if (var15 == 228932457) {
									return;
								}

								var10000 = var27;
							} else {
								var10000 = var7;
							}

							var23 = var10000;
							if (var28 < var8) {
								if (var15 == 228932457) {
									return;
								}

								var10000 = var28;
							} else {
								var10000 = var8;
							}

							var24 = var10000;
							if (var29 < var9) {
								if (var15 == 228932457) {
									return;
								}

								var10000 = var29;
							} else {
								var10000 = var9;
							}

							var25 = var10000;
						} else {
							int var38 = var37 + var19.bb_fld;
							int var40 = var21 + var19.cd_fld;
							var22 = var37 > var6 ? var37 : var6;
							int var98;
							if (var21 > var7) {
								if (var15 == 228932457) {
									return;
								}

								var98 = var21;
							} else {
								var98 = var7;
							}

							var23 = var98;
							var24 = var38 < var8 ? var38 : var8;
							if (var40 < var9) {
								if (var15 == 228932457) {
									return;
								}

								var98 = var40;
							} else {
								var98 = var9;
							}

							var25 = var98;
						}

						var12.bm().ae(var19, var37, var21);
						boolean var39 = false;
						if (var19.ez_fld) {
							switch (var12.ap_fld) {
								case 0:
									var39 = true;
								case 1:
								default:
									break;
								case 2:
									if (var12.at_fld == var19.bf_fld >>> 16) {
										var39 = true;
									}
									break;
								case 3:
									if (var19.bf_fld == var12.at_fld) {
										var39 = true;
									}
							}
						}

						if (!var39 && var19.bj_fld) {
							if (var22 >= var24) {
								continue;
							}

							if (var15 == 228932457) {
								return;
							}

							if (var23 >= var25) {
								if (var15 == 228932457) {
									return;
								}
								continue;
							}
						}

						if (var19.bj_fld) {
							if (var19.hb_fld) {
								if (var15 == 228932457) {
									return;
								}

								if (qc.cy(var0.av_fld, -173914327) >= var22 && var0.av_fld.av() >= var23 && qc.cy(var0.av_fld, -173914327) < var24 && var0.av_fld.av() < var25) {
									qg.ai(var14, (byte)0);
									var12.bm().am();
									if (!var16) {
										if (var15 == 228932457) {
											return;
										}

										var0.az_fld.ak(-801489048);
									}
								}
							} else if (var19.hf_fld
								&& qc.cy(var0.av_fld, -173914327) >= var22
								&& var0.av_fld.av() >= var23
								&& qc.cy(var0.av_fld, -173914327) < var24
								&& var0.av_fld.av() < var25) {
								var14.af(900130878);
							}
						}

						int var41 = qc.cy(var0.av_fld, -173914327);
						int var43 = var0.av_fld.av();
						if (qc.tx(var0.av_fld, (byte)-91) != 0) {
							var41 = var0.av_fld.ah();
							var43 = qc.hg(var0.av_fld, 2086124118);
						}

						boolean var45 = var41 >= var22 && var43 >= var23 && var41 < var24 && var43 < var25;
						if (1337 == var19.bp_fld) {
							if (!var0.ag_fld.av(1254039146)) {
								if (var15 == 228932457) {
									return;
								}

								if (!var16 && var45) {
									var0.az_fld.ag(var41, var43, var22, var23, 1023821437);
								}
							}
						} else if (1338 == var19.bp_fld) {
							kf.af(var19, var37, var21);
						} else {
							if (var19.bp_fld == 1400) {
								var0.ak_fld.ae(1293787896).az(var41, var43, var45, var37, var21, var19.bb_fld, var19.cd_fld, -660844526);
							}

							if (!var16 && var45) {
								if (var19.bp_fld == 1400) {
									var0.ak_fld.ae(1293787896).cv(var37, var21, var19.bb_fld, var19.cd_fld, var41, var43, 1412729918);
								} else {
									var0.az_fld.az(var19, (byte)-64);
								}
							}

							if (var39) {
								for (int var30 = 0; var30 < var19.er_fld.length; var30++) {
									boolean var31;
									boolean var32;
									var31 = false;
									var32 = false;
									label1048:
									if (!var31 && var19.er_fld[var30] != null) {
										int var33 = 0;

										while (true) {
											if (var33 >= var19.er_fld[var30].length) {
												break label1048;
											}

											boolean var34 = false;
											if (var19.hp_fld != null) {
												var34 = var17.ay(var19.er_fld[var30][var33]);
											}

											label1123: {
												if (!var0.ak_fld.ag(259620092).aw(var19.er_fld[var30][var33])) {
													if (!var34) {
														break label1123;
													}

													if (var15 == 228932457) {
														return;
													}
												}

												var31 = true;
												if (null != var19.hp_fld && var19.hp_fld[var30] > var13) {
													break label1048;
												}

												byte var35 = var19.en_fld[var30][var33];
												if (0 == var35) {
													break;
												}

												if ((var35 & 8) != 0) {
													if (var15 == 228932457) {
														return;
													}

													if (var17.ay(86) || var17.ay(82) || var17.ay(81)) {
														break label1123;
													}
												}

												if (0 != (var35 & 2)) {
													if (var15 == 228932457) {
														return;
													}

													if (!var17.ay(86)) {
														break label1123;
													}
												}

												if (((var35 & 1) == 0 || var17.ay(82)) && ((var35 & 4) == 0 || var17.ay(81))) {
													break;
												}
											}

											var33++;
										}

										var32 = true;
									}

									if (var32) {
										if (var30 < 10) {
											var0.az_fld.av(var30 + 1, var19.bf_fld, var19.by_fld, var19.ga_fld, "", (short)28409);
										} else if (var30 == 10) {
											if (var15 == 228932457) {
												return;
											}

											var0.az_fld.ah(742829213);
											String var60 = var12.ao(var19);
											if (null == var60) {
												if (var15 == 228932457) {
													return;
												}

												var60 = kh.aj_fld;
											}

											String var79 = var19.eq_fld + gd.ag(16777215, -1940547058);
											int var86 = uo.sa(var12, var19, -1059133210);
											var0.az_fld.ae(var19.bf_fld, var19.by_fld, nt.ag(var86), var19.ga_fld, var60, var79, -1596833618);
										}

										int var61 = var19.eg_fld[var30];
										if (var19.hp_fld == null) {
											if (var15 == 228932457) {
												return;
											}

											var19.hp_fld = new int[var19.er_fld.length];
										}

										if (null == var19.ef_fld) {
											if (var15 == 228932457) {
												return;
											}

											var19.ef_fld = new int[var19.er_fld.length];
										}

										if (var61 != 0) {
											if (var19.hp_fld[var30] == 0) {
												var19.hp_fld[var30] = var19.ef_fld[var30] + var13 + var61;
											} else {
												var19.hp_fld[var30] = var13 + var61;
											}
										} else {
											var19.hp_fld[var30] = Integer.MAX_VALUE;
										}
									}

									if (!var31 && null != var19.hp_fld) {
										if (var15 == 228932457) {
											return;
										}

										var19.hp_fld[var30] = 0;
									}
								}
							}

							if (var19.bj_fld) {
								boolean var47;
								boolean var100;
								boolean var101;
								boolean var102;
								label1035: {
									if (qc.cy(var0.av_fld, -173914327) >= var22 && var0.av_fld.av() >= var23) {
										if (var15 == 228932457) {
											return;
										}

										if (qc.cy(var0.av_fld, -173914327) < var24) {
											if (var15 == 228932457) {
												return;
											}

											if (var0.av_fld.av() < var25) {
												if (var15 == 228932457) {
													return;
												}

												var100 = true;
												break label1035;
											}
										}
									}

									var100 = false;
								}

								label1026: {
									label1025: {
										var45 = var100;
										if (qc.cp(var0.av_fld, 1587593462) != 1) {
											if (var0.ag_fld.ae(1735302627)) {
												break label1025;
											}

											if (var15 == 228932457) {
												return;
											}

											if (qc.cp(var0.av_fld, 1905342706) != 4) {
												break label1025;
											}
										}

										if (var45) {
											var101 = true;
											break label1026;
										}
									}

									var101 = false;
								}

								label1015: {
									label1014: {
										var47 = var101;
										if (qc.tx(var0.av_fld, (byte)-12) != 1) {
											if (var0.ag_fld.ae(1735302627) || qc.tx(var0.av_fld, (byte)-114) != 4) {
												break label1014;
											}

											if (var15 == 228932457) {
												return;
											}
										}

										if (var0.av_fld.ah() >= var22 && qc.hg(var0.av_fld, 1119668802) >= var23) {
											if (var15 == 228932457) {
												return;
											}

											if (var0.av_fld.ah() < var24 && qc.hg(var0.av_fld, -434803956) < var25) {
												var102 = true;
												break label1015;
											}
										}
									}

									var102 = false;
								}

								boolean var49 = var102;
								if (var49 && !var0.ag_fld.ak(-1665228900) && var12.br(var19, var0.av_fld.ah() - var37, qc.hg(var0.av_fld, -1947464503) - var21)) {
									var0.az_fld.aw(1565601071);
								}

								if (lu.wm(var19, 1791928459)) {
									if (var49) {
										var14.av(new fr(0, tj.ae_fld - var37, tj.ah_fld - var21, var19));
									}

									if (var47) {
										var14.av(new fr(1, tj.ae_fld - var37, tj.ah_fld - var21, var19));
									}
								}

								if (1400 == var19.bp_fld) {
									if (var15 == 228932457) {
										return;
									}

									wl.bj(var0.ak_fld.ae(1293787896), var41, var43, var45 & var47, var45 & var49, -1982911814);
								}

								if (var12.bz()) {
									if (var15 == 228932457) {
										return;
									}

									if (var12.bd() != var19) {
										if (var15 == 228932457) {
											return;
										}

										if (var45) {
											if (var15 == 228932457) {
												return;
											}

											if (cn.az(uo.sa(var12, var19, 787042388))) {
												var12.bm().ah(var19);
											}
										}
									}
								}

								uk.vc(var12.bm(), var19, var37, var21);
								if (var19.eh_fld) {
									if (var45 && var0.av_fld.ay() != 0 && null != var19.fq_fld) {
										yz var50 = tu.ak(var19).az(true, (byte)8).av((Object[])var19.fq_fld, 1196474493).ay(var0.av_fld.ay(), 1323028542).ax(-1648004920);
										var14.ak(var50);
									}

									if (var12.bz() || var0.ag_fld.ak(-1665228900)) {
										var49 = false;
										var47 = false;
										var45 = false;
									}

									if (!var19.gx_fld && var49) {
										var19.gx_fld = true;
										if (var19.ej_fld != null) {
											yz var51 = tu.ak(var19)
												.az(true, (byte)8)
												.av((Object[])var19.ej_fld, 1786698984)
												.aw(tj.as_fld - var37, 725427487)
												.ay(tj.ar_fld - var21, 413826704)
												.ax(-1445277702);
											var14.ak(var51);
										}
									}

									if (var19.gx_fld && var47 && null != var19.fy_fld) {
										yz var52 = tu.ak(var19)
											.az(true, (byte)8)
											.av((Object[])var19.fy_fld, 1827629089)
											.aw(tj.ae_fld - var37, 268369431)
											.ay(tj.ah_fld - var21, 2021007816)
											.ax(-1950567153);
										var14.ak(var52);
									}

									if (var19.gx_fld && !var47) {
										if (var15 == 228932457) {
											return;
										}

										var19.gx_fld = false;
										if (null != var19.fa_fld) {
											yz var53 = tu.ak(var19)
												.az(true, (byte)8)
												.av((Object[])var19.fa_fld, 2028173584)
												.aw(tj.ae_fld - var37, 924652590)
												.ay(tj.ah_fld - var21, 1913694076)
												.ax(-2139653527);
											var14.az(var53);
										}
									}

									if (var47) {
										if (var15 == 228932457) {
											return;
										}

										if (null != var19.fo_fld) {
											yz var54 = tu.ak(var19)
												.az(true, (byte)8)
												.av((Object[])var19.fo_fld, 1869338910)
												.aw(tj.ae_fld - var37, 1925127998)
												.ay(tj.ah_fld - var21, -1685774778)
												.ax(-1012201543);
											var14.ak(var54);
										}
									}

									if (!var19.gw_fld && var45) {
										var19.gw_fld = true;
										if (var19.fp_fld != null) {
											yz var55 = tu.ak(var19)
												.az(true, (byte)8)
												.av((Object[])var19.fp_fld, 1464890173)
												.aw(tj.ae_fld - var37, 930094170)
												.ay(tj.ah_fld - var21, -2086318118)
												.ax(1084999633);
											var14.ak(var55);
										}
									}

									if (var19.gw_fld) {
										if (var15 == 228932457) {
											return;
										}

										if (var45 && var19.fx_fld != null) {
											yz var56 = tu.ak(var19)
												.az(true, (byte)8)
												.av((Object[])var19.fx_fld, 1423354979)
												.aw(tj.ae_fld - var37, -399457706)
												.ay(tj.ah_fld - var21, 2077409392)
												.ax(1047681713);
											var14.ak(var56);
										}
									}

									if (var19.gw_fld && !var45) {
										var19.gw_fld = false;
										if (null != var19.fv_fld) {
											yz var57 = tu.ak(var19)
												.az(true, (byte)8)
												.av((Object[])var19.fv_fld, 2001232674)
												.aw(tj.ae_fld - var37, -215902842)
												.ay(tj.ah_fld - var21, 1989772698)
												.ax(473946272);
											var14.az(var57);
										}
									}

									if (null != var19.fn_fld) {
										yz var58 = tu.ak(var19).av((Object[])var19.fn_fld, 1081201032).ax(-640858737);
										var14.ag(var58);
									}

									pi var59 = var0.ak_fld.av(410652385);
									if (var19.fh_fld != null && pi.sx(var59, -617498502) > var19.gl_fld) {
										if (var15 == 228932457) {
											return;
										}

										if (var19.fm_fld != null && pi.sx(var59, -1148535470) - var19.gl_fld <= 32) {
											label968:
											for (int var63 = var19.gl_fld; var63 < pi.sx(var59, 487386339); var63++) {
												int var80 = pi.aw(var59, var63);

												for (int var87 = 0; var87 < var19.fm_fld.length; var87++) {
													if (var80 == var19.fm_fld[var87]) {
														yz var36 = tu.ak(var19).av((Object[])var19.fh_fld, 1791784210).ax(-940304515);
														var14.ak(var36);
														break label968;
													}
												}
											}
										} else {
											yz var62 = tu.ak(var19).av((Object[])var19.fh_fld, 1861354862).ax(-1303620788);
											var14.ak(var62);
										}

										var19.gl_fld = pi.sx(var59, -342856609);
									}

									if (var19.fe_fld != null && var59.am() > var19.hr_fld) {
										if (null != var19.fw_fld && var59.am() - var19.hr_fld <= 32) {
											label943:
											for (int var65 = var19.hr_fld; var65 < var59.am(); var65++) {
												int var81 = var59.aq(var65);

												for (int var88 = 0; var88 < var19.fw_fld.length; var88++) {
													if (var19.fw_fld[var88] == var81) {
														yz var93 = tu.ak(var19).av((Object[])var19.fe_fld, 1082987111).ax(1533242093);
														var14.ak(var93);
														break label943;
													}
												}
											}
										} else {
											yz var64 = tu.ak(var19).av((Object[])var19.fe_fld, 1302088752).ax(766587650);
											var14.ak(var64);
										}

										var19.hr_fld = var59.am();
									}

									if (null != var19.fl_fld && var59.ao() > var19.hj_fld) {
										if (null != var19.fg_fld && var59.ao() - var19.hj_fld <= 32) {
											label919:
											for (int var67 = var19.hj_fld; var67 < var59.ao(); var67++) {
												int var82 = var59.ad(var67);

												for (int var89 = 0; var89 < var19.fg_fld.length; var89++) {
													if (var82 == var19.fg_fld[var89]) {
														yz var94 = tu.ak(var19).av((Object[])var19.fl_fld, 1371987391).ax(535468282);
														var14.ak(var94);
														break label919;
													}
												}
											}
										} else {
											yz var66 = tu.ak(var19).av((Object[])var19.fl_fld, 1590575837).ax(-1075532979);
											var14.ak(var66);
										}

										var19.hj_fld = var59.ao();
									}

									if (var59.ac() > var19.gb_fld && null != var19.fs_fld) {
										yz var68 = tu.ak(var19).av((Object[])var19.fs_fld, 1235557447).ax(-614749873);
										var14.ak(var68);
									}

									if (var59.ab() > var19.gb_fld && var19.fz_fld != null) {
										if (var15 == 228932457) {
											return;
										}

										yz var69 = tu.ak(var19).av((Object[])var19.fz_fld, 1303698059).ax(-1257570922);
										var14.ak(var69);
									}

									if (pi.ss(var59, (byte)63) > var19.gb_fld) {
										if (var15 == 228932457) {
											return;
										}

										if (null != var19.ff_fld) {
											yz var70 = tu.ak(var19).av((Object[])var19.ff_fld, 1313320045).ax(-1052019908);
											var14.ak(var70);
										}
									}

									if (var59.at() > var19.gb_fld && null != var19.gg_fld) {
										yz var71 = tu.ak(var19).av((Object[])var19.gg_fld, 1393517145).ax(-1526903933);
										var14.ak(var71);
									}

									if (pi.yc(var59, (byte)-98) > var19.gb_fld && null != var19.gc_fld) {
										yz var72 = tu.ak(var19).av((Object[])var19.gc_fld, 1318244418).ax(-2081656808);
										var14.ak(var72);
									}

									if (pi.jf(var59, -305460395) > var19.gb_fld && var19.gj_fld != null) {
										yz var73 = tu.ak(var19).av((Object[])var19.gj_fld, 1545164548).ax(1337298986);
										var14.ak(var73);
									}

									if (pi.fd(var59, -193563645) > var19.gb_fld && var19.gt_fld != null) {
										yz var74 = tu.ak(var19).av((Object[])var19.gt_fld, 1400021033).ax(-2094582767);
										var14.ak(var74);
									}

									if (var59.ap() > var19.gb_fld && var19.go_fld != null) {
										yz var75 = tu.ak(var19).av((Object[])var19.go_fld, 1138548726).ax(-715379108);
										var14.ak(var75);
									}

									var19.gb_fld = var59.bz();
									if (var19.fu_fld != null) {
										fz var76 = var0.ak_fld.ag(1847165059);

										for (int var83 = 0; var83 < var76.ag(); var83++) {
											yz var90 = yb.bl(tu.ak(var19).av((Object[])var19.fu_fld, 1947985247), fz.vc(var76, var83, (byte)-89))
												.ah(var76.ah(var83), -1678791732)
												.ax(-1972399702);
											var14.ak(var90);
										}
									}

									if (null != var19.fr_fld) {
										int[] var77 = var17.al();

										for (int var84 = 0; var84 < var77.length; var84++) {
											yz var91 = yb.bl(tu.ak(var19).av((Object[])var19.fr_fld, 1489368896), var77[var84]).ax(318401884);
											var14.ak(var91);
										}
									}

									if (null != var19.fi_fld) {
										int[] var78 = var17.af();

										for (int var85 = 0; var85 < var78.length; var85++) {
											yz var92 = yb.bl(tu.ak(var19).av((Object[])var19.fi_fld, 1817675130), var78[var85]).ax(-661463932);
											var14.ak(var92);
										}
									}
								}
							}

							if (!var19.bj_fld) {
								if (var12.bz()) {
									continue;
								}

								if (var0.ag_fld.ak(-1665228900)) {
									if (var15 == 228932457) {
										return;
									}
									continue;
								}

								if ((var19.gk_fld >= 0 || var19.cw_fld != 0) && qc.cy(var0.av_fld, -173914327) >= var22 && var0.av_fld.av() >= var23) {
									if (var15 == 228932457) {
										return;
									}

									if (qc.cy(var0.av_fld, -173914327) < var24 && var0.av_fld.av() < var25) {
										if (var19.gk_fld >= 0) {
											ui.nu(var12.ai(), var1[var19.gk_fld], -1254596105);
										} else {
											ui.nu(var12.ai(), var19, -1254596105);
										}
									}
								}

								if (var19.bx_fld == 8
									&& qc.cy(var0.av_fld, -173914327) >= var22
									&& var0.av_fld.av() >= var23
									&& qc.cy(var0.av_fld, -173914327) < var24
									&& var0.av_fld.av() < var25) {
									var12.ai().az(var19);
								}

								if (var19.cr_fld > var19.cd_fld) {
									if (var15 == 228932457) {
										return;
									}

									var0.ay(var19, var19.bb_fld + var37, var21, var19.cd_fld, var19.cr_fld, qc.cy(var0.av_fld, -173914327), var0.av_fld.av(), var12, 1612119881);
								}
							}

							if (var19.bx_fld == 0) {
								tw(
									var0,
									var1,
									var19.cx_fld,
									var19.cs_fld,
									var19.bf_fld,
									var19.by_fld,
									var22,
									var23,
									var24,
									var25,
									var37 - var19.cp_fld,
									var21 - var19.ce_fld,
									var12,
									var13,
									var14,
									869171969
								);
								if (null != var19.ge_fld) {
									if (var15 == 228932457) {
										return;
									}

									tw(
										var0,
										var19.ge_fld,
										0,
										var19.ge_fld.length - 1,
										var19.bf_fld,
										-1,
										var22,
										var23,
										var24,
										var25,
										var37 - var19.cp_fld,
										var21 - var19.ce_fld,
										var12,
										var13,
										var14,
										1229516062
									);
								}

								if (var19.by_fld == -1) {
									if (var15 == 228932457) {
										return;
									}

									pk var48 = (pk)var12.ai_fld.ak(var19.bf_fld);
									if (null != var48) {
										if (0 == var48.ag_fld) {
											if (var15 == 228932457) {
												return;
											}

											if (tj.ae_fld >= var22 && tj.ah_fld >= var23 && tj.ae_fld < var24 && tj.ah_fld < var25 && !var0.ag_fld.ak(-1665228900)) {
												qg.ai(var14, (byte)0);
												var12.bm().am();
												if (!var16) {
													var0.az_fld.ak(442442611);
												}
											}
										}

										var0.ah(var48.ak_fld, var22, var23, var24, var25, var37, var21, var12, var13, var14);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIILuo;ILqg;)V"
	)
	void bm(int var1, int var2, int var3, int var4, int var5, int var6, int var7, uo var8, int var9, qg var10) throws EOFException {
		if (var8.az(var1)) {
			tw(this, var8.aw_fld[var1], 0, var8.aw_fld[var1].length - 1, -1, -1, var2, var3, var4, var5, var6, var7, var8, var9, var10, 1819340468);
		}
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(Luo;)V"
	)
	public void bg(uo var1) throws EOFException {
		uk var2 = var1.bm();
		if (var2.ay()) {
			var2.aw();
			int var3 = var2.al();
			int var4 = var2.au();
			if (var2.ab() && var2.ao()) {
				lu var5 = var2.as();
				lu var6 = uk.dz(var2, -1094587272);
				int var7 = uk.yq(var2, 1727690727);
				int var8 = uk.kq(var2, -79080406);
				int var9 = var2.ax();
				int var10 = var2.an();
				int var11 = tj.ae_fld;
				int var12 = tj.ah_fld;
				var11 -= var3;
				var12 -= var4;
				if (var11 < var7) {
					var11 = var7;
				}

				if (var5.bb_fld + var11 > var7 + var6.bb_fld) {
					var11 = var7 + var6.bb_fld - var5.bb_fld;
				}

				if (var12 < var8) {
					var12 = var8;
				}

				if (var12 + var5.cd_fld > var8 + var6.cd_fld) {
					var12 = var6.cd_fld + var8 - var5.cd_fld;
				}

				int var13 = var11 - var9;
				int var14 = var12 - var10;
				int var15 = var5.ev_fld;
				if (var2.aq() > var5.ey_fld && (var13 > var15 || var13 < -var15 || var14 > var15 || var14 < -var15)) {
					var2.ad();
				}

				int var16 = var11 - var7 + var6.cp_fld;
				int var17 = var6.ce_fld + (var12 - var8);
				if (var5.fj_fld != null && var2.ap()) {
					yz var18 = tu.ak(var5).av((Object[])var5.fj_fld, 1403119005).aw(var16, 1414363825).ay(var17, -2098492199).ax(10714315);
					va.ak(var18);
				}

				if (0 == tj.av_fld) {
					if (var2.ap()) {
						if (null != var5.fb_fld) {
							yz var21 = yb.cc(tu.ak(var5).av((Object[])var5.fb_fld, 1870654981).aw(var16, 357167684).ay(var17, 2001952283), uk.am(var2, (short)1150), (byte)1)
								.ax(-546925048);
							this.az_fld.as(var21, (byte)-49);
						}

						this.az_fld.au(var5, uk.am(var2, (short)1150), 952037609);
					} else {
						this.az_fld.ax(var9 + var3, var4 + var10, -1549556992);
					}

					var2.ag();
				}
			} else {
				if (var2.aq() > 1) {
					if (!var2.ap() && this.ag_fld.ag(-50451392) > 0) {
						this.az_fld.ay(var3 + var2.ax(), var4 + var2.an(), (byte)121);
					}

					var2.ag();
				}
			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "([Llu;IIIIIIIIIILuo;ILqg;I)V"
	)
	void aw(
		lu[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, uo var12, int var13, qg var14, int var15
	) throws EOFException {
		this.eg(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14);
		boolean var16 = this.ag_fld.ak(-1665228900);
		fi var17 = this.ak_fld.ak(-405607063);

		for (int var18 = var2; var18 <= var3; var18++) {
			lu var19 = var1[var18];
			if (var19 != null && var4 == var19.ec_fld && var19.bi_fld == var5) {
				if (!uo.qr(var12, var19, -1600312471)) {
					if (var15 == 228932457) {
						return;
					}
				} else {
					if (var19.ez_fld) {
						if (var15 == 228932457) {
							return;
						}

						if (var12.am(var19)) {
							continue;
						}
					} else if (1404198381 * var19.bb_fld == 0 && !var12.ai().ag(var19)) {
						if (var15 == 228932457) {
							return;
						}

						if (var12.am(var19)) {
							continue;
						}
					}

					if (11 == var19.cy_fld) {
						if (var19.bo(var12, this.ak_fld.az(99563659), (byte)-30)) {
							if (var15 == 228932457) {
								return;
							}

							if (lu.qz(var19, 729463404)) {
								tb.ag(var19.ge_fld, var19, true, var12, var14, 985808748);
								mx.xa(ma.gb(var19.bx_ma(1977444380), -525560055), 3, var19.bx_ma(1063906497).ax());
							}

							if (var19.fr_fld != null) {
								yz var20 = tu.ak(var19).av((Object[])var19.fi_fld, 1199496804).ax(-291064811);
								var14.ak(var20);
							}
						}
					} else if (12 == var19.cg_fld) {
						if (var15 == 228932457) {
							return;
						}

						var19.bw(var12, 902712606);
					}

					int var37 = var10 + var19.bq_fld;
					int var21 = var19.bw_fld + var11;
					int var22;
					int var23;
					int var24;
					int var25;
					if (9 == var19.bt_fld) {
						int var26 = var37;
						int var27 = var21;
						int var28 = var19.by_fld + var37;
						int var29 = var19.cl_fld + var21;
						if (var28 < var37) {
							var26 = var28;
							var28 = var37;
						}

						if (var29 < var21) {
							var27 = var29;
							var29 = var21;
						}

						var28++;
						var29++;
						int var10000;
						if (var26 > var6) {
							if (var15 == 228932457) {
								return;
							}

							var10000 = var26;
						} else {
							var10000 = var6;
						}

						var22 = var10000;
						if (var27 > var7) {
							if (var15 == 228932457) {
								return;
							}

							var10000 = var27;
						} else {
							var10000 = var7;
						}

						var23 = var10000;
						if (var28 < var8) {
							if (var15 == 228932457) {
								return;
							}

							var10000 = var28;
						} else {
							var10000 = var8;
						}

						var24 = var10000;
						if (var29 < var9) {
							if (var15 == 228932457) {
								return;
							}

							var10000 = var29;
						} else {
							var10000 = var9;
						}

						var25 = var10000;
					} else {
						int var38 = var37 + var19.pv_fld;
						int var40 = var21 + var19.ek_fld;
						var22 = var37 > var6 ? var37 : var6;
						int var98;
						if (var21 > var7) {
							if (var15 == 228932457) {
								return;
							}

							var98 = var21;
						} else {
							var98 = var7;
						}

						var23 = var98;
						var24 = var38 < var8 ? var38 : var8;
						if (var40 < var9) {
							if (var15 == 228932457) {
								return;
							}

							var98 = var40;
						} else {
							var98 = var9;
						}

						var25 = var98;
					}

					var12.bm().ae(var19, var37, var21);
					boolean var39 = false;
					if (var19.di_fld) {
						switch (188156795 * var12.aa_fld) {
							case 0:
								var39 = true;
							case 1:
							default:
								break;
							case 2:
								if (var12.ap_fld == var19.dh_fld >>> 16) {
									var39 = true;
								}
								break;
							case 3:
								if (var19.gz_fld == var12.at_fld) {
									var39 = true;
								}
						}
					}

					if (!var39 && var19.bj_fld) {
						if (var22 >= var24) {
							continue;
						}

						if (var15 == 228932457) {
							return;
						}

						if (var23 >= var25) {
							if (var15 == 228932457) {
								return;
							}
							continue;
						}
					}

					if (var19.dn_fld) {
						if (var19.ci_fld) {
							if (var15 == 228932457) {
								return;
							}

							if (qc.cy(this.av_fld, -173914327) >= var22 && this.av_fld.av() >= var23 && qc.cy(this.av_fld, -173914327) < var24 && this.av_fld.av() < var25) {
								qg.ai(var14, (byte)0);
								var12.bm().am();
								if (!var16) {
									if (var15 == 228932457) {
										return;
									}

									this.az_fld.ak(-801489048);
								}
							}
						} else if (var19.gx_fld
							&& qc.cy(this.av_fld, -173914327) >= var22
							&& this.av_fld.av() >= var23
							&& qc.cy(this.av_fld, -173914327) < var24
							&& this.av_fld.av() < var25) {
							var14.ar();
						}
					}

					int var41 = qc.cy(this.av_fld, -173914327);
					int var43 = this.av_fld.av();
					if (qc.tx(this.av_fld, (byte)-91) != 0) {
						var41 = this.av_fld.ay();
						var43 = qc.hg(this.av_fld, 2086124118);
					}

					boolean var45 = var41 >= var22 && var43 >= var23 && var41 < var24 && var43 < var25;
					if (1337 == var19.gk_fld) {
						if (!this.ag_fld.av(1254039146)) {
							if (var15 == 228932457) {
								return;
							}

							if (!var16 && var45) {
								this.az_fld.ag(var41, var43, var22, var23, 1023821437);
							}
						}
					} else if (1338 == var19.cx_fld) {
						kf.af(var19, var37, var21);
					} else {
						if (var19.df_fld == 1400) {
							this.ak_fld.ae(1293787896).az(var41, var43, var45, var37, var21, var19.wj_fld, var19.hr_fld * 124430729, -660844526);
						}

						if (!var16 && var45) {
							if (var19.gl_fld == 1400) {
								this.ak_fld.ae(1293787896).cv(var37, var21, var19.bg_fld * -1223437005, var19.cq_fld * 124430729, var41, var43, 1412729918);
							} else {
								this.az_fld.az(var19, (byte)-64);
							}
						}

						if (var39) {
							for (int var30 = 0; var30 < var19.en_fld.length; var30++) {
								boolean var31;
								boolean var32;
								var31 = false;
								var32 = false;
								label1214:
								if (!var31 && var19.en_fld[var30] != null) {
									int var33 = 0;

									while (true) {
										if (var33 >= var19.er_fld[var30].length) {
											break label1214;
										}

										boolean var34 = false;
										if (var19.fw_fld != null) {
											var34 = var17.as(var19.er_fld[var30][var33]);
										}

										label1288: {
											if (!this.ak_fld.ag(259620092).aw(var19.en_fld[var30][var33])) {
												if (!var34) {
													break label1288;
												}

												if (var15 == 228932457) {
													return;
												}
											}

											var31 = true;
											if (null != var19.fw_fld && var19.fg_fld[var30] > var13) {
												break label1214;
											}

											byte var35 = var19.er_fld[var30][var33];
											if (0 == var35) {
												break;
											}

											if ((var35 & 8) != 0) {
												if (var15 == 228932457) {
													return;
												}

												if (var17.as(86) || var17.as(82) || var17.as(81)) {
													break label1288;
												}
											}

											if (0 != (var35 & 2)) {
												if (var15 == 228932457) {
													return;
												}

												if (!var17.ay(86)) {
													break label1288;
												}
											}

											if (((var35 & 1) == 0 || var17.as(82)) && ((var35 & 4) == 0 || var17.as(81))) {
												break;
											}
										}

										var33++;
									}

									var32 = true;
								}

								if (var32) {
									if (var30 < 10) {
										this.az_fld.av(var30 + 1, var19.da_fld * 1461045985, var19.cy_fld * -2140649577, var19.bq_fld * 1243874365, "", (short)28409);
									} else if (var30 == 10) {
										if (var15 == 228932457) {
											return;
										}

										this.az_fld.ah(742829213);
										String var60 = var12.ao(var19);
										if (null == var60) {
											if (var15 == 228932457) {
												return;
											}

											var60 = kh.co_fld;
										}

										String var79 = var19.gq_fld + gd.ag(16777215, -1940547058);
										int var86 = uo.sa(var12, var19, -1059133210);
										this.az_fld.ae(var19.dv_fld * 1461045985, var19.bi_fld * -2140649577, nt.ag(var86), var19.cc_fld * 1243874365, var60, var79, -1596833618);
									}

									int var61 = var19.gf_fld[var30];
									if (var19.gv_fld == null) {
										if (var15 == 228932457) {
											return;
										}

										var19.eg_fld = new int[var19.en_fld.length];
									}

									if (null == var19.fw_fld) {
										if (var15 == 228932457) {
											return;
										}

										var19.gm_fld = new int[var19.en_fld.length];
									}

									if (var61 != 0) {
										if (var19.fg_fld[var30] == 0) {
											var19.fg_fld[var30] = var19.gp_fld[var30] + var13 + var61;
										} else {
											var19.gv_fld[var30] = var13 + var61;
										}
									} else {
										var19.gm_fld[var30] = Integer.MAX_VALUE;
									}
								}

								if (!var31 && null != var19.fw_fld) {
									if (var15 == 228932457) {
										return;
									}

									var19.fg_fld[var30] = 0;
								}
							}
						}

						if (var19.hb_fld) {
							boolean var47;
							boolean var100;
							boolean var101;
							boolean var102;
							label1201: {
								if (qc.cy(this.av_fld, -173914327) >= var22 && this.av_fld.av() >= var23) {
									if (var15 == 228932457) {
										return;
									}

									if (qc.cy(this.av_fld, -173914327) < var24) {
										if (var15 == 228932457) {
											return;
										}

										if (this.av_fld.av() < var25) {
											if (var15 == 228932457) {
												return;
											}

											var100 = true;
											break label1201;
										}
									}
								}

								var100 = false;
							}

							label1192: {
								label1191: {
									var45 = var100;
									if (qc.cp(this.av_fld, 1587593462) != 1) {
										if (this.ag_fld.ae(1735302627)) {
											break label1191;
										}

										if (var15 == 228932457) {
											return;
										}

										if (qc.cp(this.av_fld, 1905342706) != 4) {
											break label1191;
										}
									}

									if (var45) {
										var101 = true;
										break label1192;
									}
								}

								var101 = false;
							}

							label1181: {
								label1180: {
									var47 = var101;
									if (qc.tx(this.av_fld, (byte)-12) != 1) {
										if (this.ag_fld.ae(1735302627) || qc.tx(this.av_fld, (byte)-114) != 4) {
											break label1180;
										}

										if (var15 == 228932457) {
											return;
										}
									}

									if (this.av_fld.ah() >= var22 && qc.hg(this.av_fld, 1119668802) >= var23) {
										if (var15 == 228932457) {
											return;
										}

										if (this.av_fld.ay() < var24 && qc.hg(this.av_fld, -434803956) < var25) {
											var102 = true;
											break label1181;
										}
									}
								}

								var102 = false;
							}

							boolean var49 = var102;
							if (var49 && !this.ag_fld.ak(-1665228900) && var12.br(var19, this.av_fld.ah() - var37, qc.hg(this.av_fld, -1947464503) - var21)) {
								this.az_fld.aw(1565601071);
							}

							if (lu.wm(var19, 1791928459)) {
								if (var49) {
									var14.av(new fr(0, tj.av_fld - var37, tj.ae_fld - var21, var19));
								}

								if (var47) {
									var14.av(new fr(1, tj.ar_fld - var37, tj.ah_fld - var21, var19));
								}
							}

							if (1400 == var19.cq_fld) {
								if (var15 == 228932457) {
									return;
								}

								wl.bj(this.ak_fld.ae(1293787896), var41, var43, var45 & var47, var45 & var49, -1982911814);
							}

							if (var12.bz()) {
								if (var15 == 228932457) {
									return;
								}

								if (var12.bd() != var19) {
									if (var15 == 228932457) {
										return;
									}

									if (var45) {
										if (var15 == 228932457) {
											return;
										}

										if (cn.az(uo.sa(var12, var19, 787042388))) {
											var12.bm().ah(var19);
										}
									}
								}
							}

							uk.vc(var12.bm(), var19, var37, var21);
							if (var19.dc_fld) {
								if (var45 && this.av_fld.ah() != 0 && null != var19.fl_fld) {
									yz var50 = tu.ak(var19).az(true, (byte)8).av((Object[])var19.fq_fld, 1196474493).ae(this.av_fld.ah(), 1323028542).ax(-1648004920);
									var14.ak(var50);
								}

								if (var12.bz() || this.ag_fld.ak(-1665228900)) {
									var49 = false;
									var47 = false;
									var45 = false;
								}

								if (!var19.ed_fld && var49) {
									var19.hb_fld = true;
									if (var19.fl_fld != null) {
										yz var51 = tu.ak(var19)
											.az(true, (byte)8)
											.av((Object[])var19.gr_fld, 1786698984)
											.au(tj.ar_fld - var37, 725427487)
											.ah(tj.ay_fld - var21, 413826704)
											.ax(-1445277702);
										var14.ak(var51);
									}
								}

								if (var19.dz_fld && var47 && null != var19.fi_fld) {
									yz var52 = tu.ak(var19)
										.az(true, (byte)8)
										.av((Object[])var19.fe_fld, 1827629089)
										.ay(tj.av_fld - var37, 268369431)
										.aw(tj.ay_fld - var21, 2021007816)
										.ax(-1950567153);
									var14.ak(var52);
								}

								if (var19.dt_fld && !var47) {
									if (var15 == 228932457) {
										return;
									}

									var19.hb_fld = false;
									if (null != var19.fs_fld) {
										yz var53 = tu.ak(var19)
											.az(true, (byte)8)
											.av((Object[])var19.fu_fld, 2028173584)
											.aw(tj.ar_fld - var37, 924652590)
											.au(tj.ay_fld - var21, 1913694076)
											.ax(-2139653527);
										var14.az(var53);
									}
								}

								if (var47) {
									if (var15 == 228932457) {
										return;
									}

									if (null != var19.gn_fld) {
										yz var54 = tu.ak(var19)
											.az(true, (byte)8)
											.av((Object[])var19.gh_fld, 1869338910)
											.aw(tj.ay_fld - var37, 1925127998)
											.au(tj.ar_fld - var21, -1685774778)
											.ax(-1012201543);
										var14.ak(var54);
									}
								}

								if (!var19.dn_fld && var45) {
									var19.gw_fld = true;
									if (var19.fv_fld != null) {
										yz var55 = tu.ak(var19)
											.az(true, (byte)8)
											.av((Object[])var19.fy_fld, 1464890173)
											.au(tj.ay_fld - var37, 930094170)
											.aw(tj.as_fld - var21, -2086318118)
											.ax(1084999633);
										var14.ak(var55);
									}
								}

								if (var19.cz_fld) {
									if (var15 == 228932457) {
										return;
									}

									if (var45 && var19.gc_fld != null) {
										yz var56 = tu.ak(var19)
											.az(true, (byte)8)
											.av((Object[])var19.fd_fld, 1423354979)
											.aw(tj.ah_fld - var37, -399457706)
											.au(tj.ae_fld - var21, 2077409392)
											.ax(1047681713);
										var14.ak(var56);
									}
								}

								if (var19.ez_fld && !var45) {
									var19.cz_fld = false;
									if (null != var19.fe_fld) {
										yz var57 = tu.ak(var19)
											.az(true, (byte)8)
											.av((Object[])var19.gh_fld, 2001232674)
											.ay(tj.ar_fld - var37, -215902842)
											.ae(tj.av_fld - var21, 1989772698)
											.ax(473946272);
										var14.az(var57);
									}
								}

								if (null != var19.fv_fld) {
									yz var58 = tu.ak(var19).av((Object[])var19.gr_fld, 1081201032).ax(-640858737);
									var14.az(var58);
								}

								pi var59 = this.ak_fld.av(410652385);
								if (var19.fp_fld != null && pi.sx(var59, -617498502) > var19.ep_fld) {
									if (var15 == 228932457) {
										return;
									}

									if (var19.fg_fld != null && pi.sx(var59, -1148535470) - var19.ep_fld <= 32) {
										label1134:
										for (int var63 = -1389783319 * var19.cv_fld; var63 < pi.sx(var59, 487386339); var63++) {
											int var80 = pi.aw(var59, var63);

											for (int var87 = 0; var87 < var19.fg_fld.length; var87++) {
												if (var80 == var19.fw_fld[var87]) {
													yz var36 = tu.ak(var19).av((Object[])var19.gj_fld, 1791784210).ax(-940304515);
													var14.ak(var36);
													break label1134;
												}
											}
										}
									} else {
										yz var62 = tu.ak(var19).av((Object[])var19.fa_fld, 1861354862).ax(-1303620788);
										var14.ak(var62);
									}

									var19.hr_fld = pi.sx(var59, -342856609) * 508731737;
								}

								if (var19.fv_fld != null && var59.bm(712950505) > var19.gy_fld) {
									if (null != var19.ef_fld && var59.bm(1628711975) - var19.cj_fld <= 32) {
										label1109:
										for (int var65 = var19.dr_fld * 1477055471; var65 < var59.at(); var65++) {
											int var81 = var59.aq(var65);

											for (int var88 = 0; var88 < var19.fm_fld.length; var88++) {
												if (var19.fm_fld[var88] == var81) {
													yz var93 = tu.ak(var19).av((Object[])var19.fv_fld, 1082987111).ax(1533242093);
													var14.ak(var93);
													break label1109;
												}
											}
										}
									} else {
										yz var64 = tu.ak(var19).av((Object[])var19.fu_fld, 1302088752).ax(766587650);
										var14.ak(var64);
									}

									var19.bi_fld = var59.cu(808789224) * 1417378575;
								}

								if (null != var19.fn_fld && var59.am() > var19.cd_fld) {
									if (null != var19.gp_fld && var59.co(617934518) - var19.bf_fld <= 32) {
										label1085:
										for (int var67 = 117891801 * var19.ce_fld; var67 < var59.am(); var67++) {
											int var82 = var59.ad(var67);

											for (int var89 = 0; var89 < var19.gp_fld.length; var89++) {
												if (var82 == var19.eg_fld[var89]) {
													yz var94 = tu.ak(var19).av((Object[])var19.fa_fld, 1371987391).ax(535468282);
													var14.ak(var94);
													break label1085;
												}
											}
										}
									} else {
										yz var66 = tu.ak(var19).av((Object[])var19.fk_fld, 1590575837).ax(-1075532979);
										var14.ak(var66);
									}

									var19.bq_fld = var59.aj(88584453) * -1726907031;
								}

								if (var59.bd((byte)-43) > var19.hj_fld && null != var19.fo_fld) {
									yz var68 = tu.ak(var19).av((Object[])var19.gh_fld, 1235557447).ax(-614749873);
									var14.ak(var68);
								}

								if (var59.ab() > var19.cr_fld && var19.eu_fld != null) {
									if (var15 == 228932457) {
										return;
									}

									yz var69 = tu.ak(var19).av((Object[])var19.fj_fld, 1303698059).ax(-1257570922);
									var14.ak(var69);
								}

								if (pi.ss(var59, (byte)63) > var19.bn_fld) {
									if (var15 == 228932457) {
										return;
									}

									if (null != var19.fs_fld) {
										yz var70 = tu.ak(var19).av((Object[])var19.go_fld, 1313320045).ax(-1052019908);
										var14.ak(var70);
									}
								}

								if (var59.cj(186525795) > var19.ga_fld && null != var19.fq_fld) {
									yz var71 = tu.ak(var19).av((Object[])var19.gs_fld, 1393517145).ax(-1526903933);
									var14.ak(var71);
								}

								if (pi.yc(var59, (byte)-98) > var19.pv_fld && null != var19.fq_fld) {
									yz var72 = tu.ak(var19).av((Object[])var19.fs_fld, 1318244418).ax(-2081656808);
									var14.ak(var72);
								}

								if (pi.jf(var59, -305460395) > var19.dr_fld && var19.fv_fld != null) {
									yz var73 = tu.ak(var19).av((Object[])var19.ej_fld, 1545164548).ax(1337298986);
									var14.ak(var73);
								}

								if (pi.fd(var59, -193563645) > var19.wj_fld && var19.gs_fld != null) {
									yz var74 = tu.ak(var19).av((Object[])var19.eu_fld, 1400021033).ax(-2094582767);
									var14.ak(var74);
								}

								if (var59.an((byte)-123) > var19.gz_fld && var19.fa_fld != null) {
									yz var75 = tu.ak(var19).av((Object[])var19.fa_fld, 1138548726).ax(-715379108);
									var14.ak(var75);
								}

								var19.dl_fld = var59.bz() * 1564795777;
								if (var19.fv_fld != null) {
									fz var76 = this.ak_fld.ag(1847165059);

									for (int var83 = 0; var83 < var76.ap(1224076567); var83++) {
										yz var90 = yb.bl(tu.ak(var19).av((Object[])var19.fy_fld, 1947985247), fz.vc(var76, var83, (byte)-89))
											.ay(var76.ah(var83), -1678791732)
											.ax(-1972399702);
										var14.ak(var90);
									}
								}

								if (null != var19.gn_fld) {
									int[] var77 = var17.af();

									for (int var84 = 0; var84 < var77.length; var84++) {
										yz var91 = yb.bl(tu.ak(var19).av((Object[])var19.gg_fld, 1489368896), var77[var84]).ax(318401884);
										var14.ak(var91);
									}
								}

								if (null != var19.fv_fld) {
									int[] var78 = var17.al();

									for (int var85 = 0; var85 < var78.length; var85++) {
										yz var92 = yb.bl(tu.ak(var19).av((Object[])var19.fl_fld, 1817675130), var78[var85]).ax(-661463932);
										var14.ak(var92);
									}
								}
							}
						}

						if (!var19.dz_fld) {
							if (var12.bz()) {
								continue;
							}

							if (this.ag_fld.ak(-1665228900)) {
								if (var15 == 228932457) {
									return;
								}
								continue;
							}

							if ((2139590355 * var19.cr_fld >= 0 || var19.cl_fld * 802525691 != 0) && qc.cy(this.av_fld, -173914327) >= var22 && this.av_fld.av() >= var23) {
								if (var15 == 228932457) {
									return;
								}

								if (qc.cy(this.av_fld, -173914327) < var24 && this.av_fld.av() < var25) {
									if (var19.cj_fld * 2139590355 >= 0) {
										ui.nu(var12.ai(), var1[2139590355 * var19.cp_fld], -1254596105);
									} else {
										ui.nu(var12.ai(), var19, -1254596105);
									}
								}
							}

							if (var19.ba_fld == 8
								&& qc.cy(this.av_fld, -173914327) >= var22
								&& this.av_fld.av() >= var23
								&& qc.cy(this.av_fld, -173914327) < var24
								&& this.av_fld.av() < var25) {
								var12.ai().az(var19);
							}

							if (var19.cn_fld > var19.ba_fld) {
								if (var15 == 228932457) {
									return;
								}

								this.ay(
									var19,
									var19.bt_fld + var37,
									var21,
									124430729 * var19.cx_fld,
									var19.bf_fld * 235919357,
									qc.cy(this.av_fld, -173914327),
									this.av_fld.av(),
									var12,
									1612119881
								);
							}
						}

						if (1404198381 * var19.da_fld == 0) {
							tw(
								this,
								var1,
								var19.cd_fld * 545998793,
								var19.bp_fld * -324157087,
								var19.cr_fld * 1461045985,
								var19.cj_fld * -2140649577,
								var22,
								var23,
								var24,
								var25,
								var37 - var19.cu_fld,
								var21 - var19.dk_fld,
								var12,
								var13,
								var14,
								869171969
							);
							if (null != var19.ge_fld) {
								if (var15 == 228932457) {
									return;
								}

								tw(
									this,
									var19.ge_fld,
									0,
									var19.ge_fld.length - 1,
									var19.cr_fld * 1461045985,
									-1,
									var22,
									var23,
									var24,
									var25,
									var37 - var19.dm_fld,
									var21 - var19.nn_fld,
									var12,
									var13,
									var14,
									1229516062
								);
							}

							if (var19.da_fld == -1) {
								if (var15 == 228932457) {
									return;
								}

								pk var48 = (pk)var12.ai_fld.get(var19.du_fld * 1461045985);
								if (null != var48) {
									if (0 == var48.ak_fld) {
										if (var15 == 228932457) {
											return;
										}

										if (tj.ay_fld >= var22 && tj.ar_fld >= var23 && tj.ar_fld < var24 && tj.as_fld < var25 && !this.ag_fld.ak(-1665228900)) {
											qg.ai(var14, (byte)0);
											var12.bm().am();
											if (!var16) {
												this.az_fld.ak(442442611);
											}
										}
									}

									this.ah(var48.ak_fld, var22, var23, var24, var25, var37, var21, var12, var13, var14);
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(ILuo;I)V"
	)
	void af(int var1, uo var2, int var3) throws EOFException {
		if (-1 == var1) {
			this.hi(var1, var2);
		} else if (!var2.az(var1)) {
			this.hi(var1, var2);
		} else {
			lu[] var4 = var2.aw_fld[var1];

			for (int var5 = 0; var5 < var4.length; var5++) {
				lu var6 = var4[var5];
				if (null != var6.fy_fld) {
					yz var7 = tu.ak(var6).av((Object[])var6.gh_fld, 1897181670).ax(1517274639);
					this.az_fld.ar(var7, (byte)-99);
				}
			}

			this.hi(var1, var2);
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(ILuo;B)V"
	)
	void au(int var1, uo var2, byte var3) throws EOFException {
		if (!var2.az(var1)) {
			if (var3 == 0) {
				;
			}
		} else {
			lu[] var4 = var2.aw_fld[var1];

			for (int var5 = 0; var5 < var4.length; var5++) {
				lu var6 = var4[var5];
				if (var6 != null) {
					var6.ce_fld = 0;
					var6.dx_fld = 0;
				}
			}
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lqm;Luo;B)V"
	)
	public void as(qm var1, uo var2, byte var3) throws EOFException {
		if (var2.aa_fld != -1) {
			this.ar(var2.ap_fld * 243771749, var1, var2, -1071987975);
		}
	}
}
