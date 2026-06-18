import java.util.Map;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Deque;
import net.runelite.api.Friend;
import net.runelite.api.FriendContainer;
import net.runelite.api.MessageNode;
import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;
import net.runelite.api.events.ChatMessage;

@ObfuscatedName("ro")
@Implements({"FriendContainer"})
public class ro extends rc implements FriendContainer {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lnp;"
	)
	public np av_fld = new np();
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ak_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lzo;"
	)
	zo az_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ag_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ae_fld = 253077433;
	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int cy_fld;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int an_fld;

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	public void ad(xi var1, int var2) {
		while (var1.au_fld < var2) {
			boolean var3 = var1.cg() == 1;
			aax var4 = new aax(xi.at(var1, -372216809), this.az_fld);
			aax var5 = new aax(xi.at(var1, -2093361118), this.az_fld);
			int var6 = var1.cm();
			int var7 = var1.cg();
			int var8 = var1.cg();
			boolean var9 = 0 != (var8 & 2);
			boolean var10 = 0 != (var8 & 1);
			if (var6 > 0) {
				xi.at(var1, 623429319);
				var1.cg();
				var1.co((byte)-88);
			}

			xi.at(var1, -500233801);
			if (var4 == null || !var4.az(1004146027)) {
				throw new IllegalStateException();
			}

			rp var11 = (rp)this.bt(var4, (byte)-64);
			if (var3) {
				rp var12 = (rp)this.bt(var5, (byte)-123);
				if (null != var12 && var11 != var12) {
					if (null != var11) {
						this.bu(var12, 1240355742);
					} else {
						var11 = var12;
					}
				}
			}

			if (null != var11) {
				this.bq(var11, var4, var5, 1774858016);
				if (var6 != var11.ae_fld) {
					boolean var14 = true;

					for (rd var13 = (rd)this.av_fld.ag(); var13 != null; var13 = (rd)this.av_fld.az()) {
						if (var13.ag_fld.equals(var4)) {
							if (var6 != 0 && 0 == var13.az_fld) {
								uq.xr(var13);
								var14 = false;
							} else if (var6 == 0 && 0 != var13.az_fld) {
								uq.xr(var13);
								var14 = false;
							}
						}
					}

					if (var14) {
						this.av_fld.ak(new rd(var4, var6));
					}
				}
			} else {
				if (this.bl(-1440239599) >= 400) {
					continue;
				}

				var11 = (rp)this.bc(var4, var5, (byte)18);
			}

			if (var11.ae_fld != var6) {
				var11.ah_fld = (this.ae_fld += -1813459244) * 734613448 - 1;
				if (var11.ae_fld == -1 && var6 == 0) {
					var11.ah_fld = -(var11.ah_fld * 1);
				}

				var11.ae_fld = var6;
			}

			var11.aw_fld = var7;
			var11.ak_fld = var9;
			var11.ag_fld = var10;
		}

		this.ba((byte)0);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)Lrl;"
	)
	@Override
	rl ak(byte var1) {
		return new rp();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()Lrl;"
	)
	@Override
	rl av() {
		return new rp();
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Laax;ZB)Z"
	)
	public boolean az(aax var1, boolean var2, byte var3) {
		rp var4 = (rp)this.bp(var1, -1808665002);
		return var4 == null ? false : !var2 || 0 != var4.ae_fld;
	}

	public ro(zo var1) {
		super(400);
		this.az_fld = var1;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Laax;Z)Z"
	)
	public boolean aa(aax var1, boolean var2) {
		rp var3 = (rp)this.bp(var1, 1503648923);
		return var3 == null ? false : !var2 || 0 != var3.ae_fld;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()Lrl;"
	)
	@Override
	rl ae() {
		return new rp();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)[Lrl;"
	)
	@Override
	rl[] ah(int var1) {
		return new rp[var1];
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)[Lrl;"
	)
	@Override
	rl[] aw(int var1) {
		return new rp[var1];
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)[Lrl;"
	)
	@Override
	rl[] ay(int var1) {
		return new rp[var1];
	}

	@ObfuscatedName("getPendingLogins")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/Deque;"
	)
	@Export("getPendingLogins")
	@Override
	public Deque getPendingLogins() {
		return this.av_fld;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)[Lrl;"
	)
	@Override
	rl[] as(int var1) {
		return new rp[var1];
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)[Lrl;"
	)
	@Override
	rl[] ar(int var1) {
		return new rp[var1];
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)[Lrl;"
	)
	@Override
	rl[] af(int var1) {
		return new rp[var1];
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lxi;II)V"
	)
	public void al(xi var1, int var2, int var3) {
		while (var1.au_fld < var2) {
			boolean var4 = var1.cg() == 1;
			aax var5 = new aax(xi.at(var1, 127041588), this.az_fld);
			aax var6 = new aax(xi.at(var1, 808439294), this.az_fld);
			int var7 = var1.cm();
			int var8 = var1.cg();
			int var9 = var1.cg();
			boolean var10000;
			if (0 != (var9 & 2)) {
				if (var3 == -831281439) {
					return;
				}

				var10000 = true;
			} else {
				var10000 = false;
			}

			boolean var10 = var10000;
			boolean var11 = 0 != (var9 & 1);
			if (var7 > 0) {
				xi.at(var1, -1033746967);
				var1.cg();
				var1.co((byte)-58);
			}

			xi.at(var1, -572059034);
			if (var5 != null) {
				if (var3 == -831281439) {
					return;
				}

				if (var5.az(1004146027)) {
					rp var12 = (rp)this.bt(var5, (byte)-19);
					if (var4) {
						rp var13 = (rp)this.bt(var6, (byte)-79);
						if (null != var13 && var12 != var13) {
							if (null != var12) {
								this.bu(var13, -836124541);
							} else {
								var12 = var13;
							}
						}
					}

					if (null != var12) {
						this.bq(var12, var5, var6, 1587558645);
						if (var7 != var12.ae_fld) {
							boolean var15 = true;

							for (rd var14 = (rd)this.av_fld.ag(); var14 != null; var14 = (rd)this.av_fld.az()) {
								if (var14.ag_fld.equals(var5)) {
									if (var3 == -831281439) {
										return;
									}

									if (var7 != 0 && 0 == var14.az_fld) {
										uq.xr(var14);
										var15 = false;
									} else if (var7 == 0 && 0 != var14.az_fld) {
										uq.xr(var14);
										var15 = false;
									}
								}
							}

							if (var15) {
								this.av_fld.ak(new rd(var5, var7));
							}
						}
					} else {
						if (this.bl(-1440239599) >= 400) {
							continue;
						}

						var12 = (rp)this.bc(var5, var6, (byte)102);
					}

					if (var12.ae_fld != var7) {
						var12.ah_fld = (this.ae_fld += 253077433) * -1971966327 - 1;
						if (var12.ae_fld == -1 && var7 == 0) {
							if (var3 == -831281439) {
								return;
							}

							var12.ah_fld = -(var12.ah_fld * 1);
						}

						var12.ae_fld = var7;
					}

					var12.aw_fld = var8;
					var12.ak_fld = var10;
					var12.ag_fld = var11;
					continue;
				}
			}

			throw new IllegalStateException();
		}

		this.ba((byte)0);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Laax;Z)Z"
	)
	public boolean an(aax var1, boolean var2) {
		rp var3 = (rp)this.bp(var1, -939273478);
		return var3 == null ? false : !var2 || 0 != var3.ae_fld;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Laax;Z)Z"
	)
	public boolean au(aax var1, boolean var2) {
		rp var3 = (rp)this.bp(var1, 991809400);
		return var3 == null ? false : !var2 || 0 != var3.ae_fld;
	}

	@ObfuscatedName("wa")
	@ObfuscatedSignature(
		descriptor = "(Lro;Lxi;I)V"
	)
	public static void wa(ro var0, xi var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		while (var1.au_fld < var2) {
			boolean var3 = var1.cg() == 1;
			aax var4 = new aax(xi.at(var1, -2029783078), var0.az_fld);
			aax var5 = new aax(xi.at(var1, -1980887996), var0.az_fld);
			int var6 = var1.cm();
			int var7 = var1.cg();
			int var8 = var1.cg();
			boolean var9 = 0 != (var8 & 2);
			boolean var10 = 0 != (var8 & 1);
			if (var6 > 0) {
				xi.at(var1, 833814642);
				var1.cg();
				var1.co((byte)-14);
			}

			xi.at(var1, -1466425372);
			if (var4 == null) {
				throw new IllegalStateException();
			}

			var4.az(1004146027);
			rp var11 = (rp)var0.bt(var4, (byte)-22);
			if (var3) {
				rp var12 = (rp)var0.bt(var5, (byte)-55);
				if (null != var12 && var11 != var12) {
					if (null != var11) {
						var0.bu(var12, -1126427470);
					} else {
						var11 = var12;
					}
				}
			}

			if (null == var11) {
				if (var0.bl(-1440239599) >= 400) {
					continue;
				}

				var11 = (rp)var0.bc(var4, var5, (byte)62);
			} else {
				var0.bq(var11, var4, var5, 1918390339);
				if (var6 != var11.ae_fld) {
					boolean var14 = true;

					for (rd var13 = (rd)var0.av_fld.ag(); var13 != null; var13 = (rd)var0.av_fld.az()) {
						if (var13.ag_fld.equals(var4)) {
							if (var6 != 0 && 0 == var13.az_fld) {
								uq.xr(var13);
								var14 = false;
							} else if (var6 == 0 && 0 != var13.az_fld) {
								uq.xr(var13);
								var14 = false;
							}
						}
					}

					if (var14) {
						var0.av_fld.ak(new rd(var4, var6));
					}
				}
			}

			if (var11.ae_fld != var6) {
				var11.ah_fld = (var0.ae_fld += 253077433) * -1971966327 - 1;
				if (var11.ae_fld == -1 && var6 == 0) {
					var11.ah_fld = -(var11.ah_fld * 1);
				}

				var11.ae_fld = var6;
			}

			var11.aw_fld = var7;
			var11.ak_fld = var9;
			var11.ag_fld = var10;
		}

		var0.ba((byte)0);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Laax;Z)Z"
	)
	public boolean ax(aax var1, boolean var2) {
		rp var3 = (rp)this.bp(var1, 1902560163);
		return var3 == null ? false : !var2 || 0 != var3.ae_fld;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	public void ai(xi var1, int var2) {
		while (var1.au_fld < var2) {
			boolean var3 = var1.cg() == 1;
			aax var4 = new aax(xi.at(var1, -374886962), this.az_fld);
			aax var5 = new aax(xi.at(var1, 1505203593), this.az_fld);
			int var6 = var1.cm();
			int var7 = var1.cg();
			int var8 = var1.cg();
			boolean var9 = 0 != (var8 & 2);
			boolean var10 = 0 != (var8 & 1);
			if (var6 > 0) {
				xi.at(var1, -745404575);
				var1.cg();
				var1.co((byte)-59);
			}

			xi.at(var1, -561908183);
			if (var4 == null || !var4.az(1004146027)) {
				throw new IllegalStateException();
			}

			rp var11 = (rp)this.bt(var4, (byte)-23);
			if (var3) {
				rp var12 = (rp)this.bt(var5, (byte)-94);
				if (null != var12 && var11 != var12) {
					if (null != var11) {
						this.bu(var12, -11333331);
					} else {
						var11 = var12;
					}
				}
			}

			if (null != var11) {
				this.bq(var11, var4, var5, 1807956356);
				if (var6 != var11.ae_fld) {
					boolean var14 = true;

					for (rd var13 = (rd)this.av_fld.ag(); var13 != null; var13 = (rd)this.av_fld.az()) {
						if (var13.ag_fld.equals(var4)) {
							if (var6 != 0 && 0 == var13.az_fld) {
								uq.xr(var13);
								var14 = false;
							} else if (var6 == 0 && 0 != var13.az_fld) {
								uq.xr(var13);
								var14 = false;
							}
						}
					}

					if (var14) {
						this.av_fld.ak(new rd(var4, var6));
					}
				}
			} else {
				if (this.bl(-1440239599) >= 400) {
					continue;
				}

				var11 = (rp)this.bc(var4, var5, (byte)66);
			}

			if (var11.ae_fld != var6) {
				var11.ah_fld = (this.ae_fld += 253077433) * -1971966327 - 1;
				if (var11.ae_fld == -1 && var6 == 0) {
					var11.ah_fld = -(var11.ah_fld * 1);
				}

				var11.ae_fld = var6;
			}

			var11.aw_fld = var7;
			var11.ak_fld = var9;
			var11.ag_fld = var10;
		}

		this.ba((byte)0);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	public void am(xi var1, int var2) {
		while (var1.au_fld < var2) {
			boolean var3 = var1.cg() == 1;
			aax var4 = new aax(xi.at(var1, -120120904), this.az_fld);
			aax var5 = new aax(xi.at(var1, -1473725199), this.az_fld);
			int var6 = var1.cm();
			int var7 = var1.cg();
			int var8 = var1.cg();
			boolean var9 = 0 != (var8 & 2);
			boolean var10 = 0 != (var8 & 1);
			if (var6 > 0) {
				xi.at(var1, -516508702);
				var1.cg();
				var1.co((byte)-108);
			}

			xi.at(var1, 440660991);
			if (var4 == null) {
				throw new IllegalStateException();
			}

			var4.az(1004146027);
			rp var11 = (rp)this.bt(var4, (byte)-12);
			if (var3) {
				rp var12 = (rp)this.bt(var5, (byte)-13);
				if (null != var12 && var11 != var12) {
					if (null != var11) {
						this.bu(var12, 1792749923);
					} else {
						var11 = var12;
					}
				}
			}

			if (null != var11) {
				this.bq(var11, var4, var5, 1854605521);
				if (var6 != var11.ae_fld) {
					boolean var14 = true;

					for (rd var13 = (rd)this.av_fld.ag(); var13 != null; var13 = (rd)this.av_fld.az()) {
						if (var13.ag_fld.equals(var4)) {
							if (var6 != 0 && 0 == var13.az_fld) {
								uq.xr(var13);
								var14 = false;
							} else if (var6 == 0 && 0 != var13.az_fld) {
								uq.xr(var13);
								var14 = false;
							}
						}
					}

					if (var14) {
						this.av_fld.ak(new rd(var4, var6));
					}
				}
			} else {
				if (this.bl(-1440239599) >= 400) {
					continue;
				}

				var11 = (rp)this.bc(var4, var5, (byte)120);
			}

			if (var11.ae_fld != var6) {
				var11.ah_fld = (this.ae_fld += 253077433) * -2071366842 - 1;
				if (var11.ae_fld == -1 && var6 == 0) {
					var11.ah_fld = -(var11.ah_fld * 1);
				}

				var11.ae_fld = var6 * 1161560166;
			}

			var11.aw_fld = var7;
			var11.ak_fld = var9;
			var11.ag_fld = var10;
		}

		this.ba((byte)0);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)[Lrl;"
	)
	@Override
	rl[] ag(int var1, int var2) {
		return new rp[var1];
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V"
	)
	static void az(int var0, String var1, String var2, String var3) {
		int var14 = 620771829;
		bq var15 = (bq)(bq)cz.ak_fld.get(var0);
		if (null == var15) {
			var15 = new bq();
			cz.ak_fld.put(var0, var15);
		}

		co var16 = bq.hw(var15, var0, var1, var2, var3);
		cz.ag_fld.ag(var16, var16.ak_fld);
		cz.az_fld.jr(var16);
		pi.ac(client.ck_fld, 319453959);
		Map var5 = og.ci_fld.getChatLineMap();
		bq var6 = (bq)(bq)var5.get(var0);
		MessageNode var7 = var6.getLines()[0];
		ChatMessageType var8 = ChatMessageType.of(var0);
		if (var8 == ChatMessageType.CLAN_CHAT && var2 != null && var2.startsWith("|")) {
			var8 = ChatMessageType.CLAN_GIM_CHAT;
			var2 = var2.substring(1);
		}

		if (var8 == ChatMessageType.CLAN_MESSAGE && var2 != null && var2.startsWith("|")) {
			var8 = ChatMessageType.CLAN_GIM_MESSAGE;
			var2 = var2.substring(1);
		}

		if (client.logger.isDebugEnabled()) {
			String var9 = var8 == ChatMessageType.UNKNOWN ? String.valueOf(var0) : var8.name();
			client.logger.debug("Chat message type {}: {}", var9, var2);
		}

		ChatMessage var17 = new ChatMessage(var7, var8, var1, var2, var3, var7.getTimestamp());
		og.ci_fld.getCallbacks().post(var17);
	}

	public Friend findByName(String var1) {
		return (Friend)(Friend)this.findByName(var1);
	}

	public Friend[] getMembers() {
		return (Friend[])this.getMembers();
	}
}
