import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("fu")
public class fu implements ts {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean az_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean ag_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ae_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int as_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	lu ak_fld = null;
	@ObfuscatedGetter(
		intValue = 628273903
	)
	@ObfuscatedName("ol")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ol_fld;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ap_fld;

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ai() {
		if (null != this.ak_fld) {
			ld var1 = this.ak_fld.bn((byte)-19);
			lu var2 = this.ak_fld;
			this.ak_fld = null;
			if (var1 != null) {
				if (li.vk(var1.ak_fld, (byte)37) && var1.ae_fld != null) {
					yz var3 = tu.ak(var2).av((Object[])var1.ae_fld, 1689150636).ax(-647579338);
					client.cz_fld.ak(var3);
				}

				var1.ak_fld.ag(false);
			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ZI)Z"
	)
	@Override
	public boolean aw(boolean var1, int var2) {
		return false;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Llu;I)V"
	)
	public void ag(lu var1, int var2) {
		if (var1 != null) {
			if (var1 != this.ak_fld) {
				xp(this, -1920155853);
				this.ak_fld = var1;
			}

			ld var3 = var1.bn((byte)-18);
			if (null != var3) {
				if (!li.vk(var3.ak_fld, (byte)53) && var3.ae_fld != null) {
					if (var2 != 114546440) {
						return;
					}

					yz var4 = tu.ak(var1).av((Object[])var3.ae_fld, 1137326740).ax(136569995);
					client.cz_fld.ak(var4);
				}

				var3.ak_fld.ag(true);
			}
		} else {
			xp(this, 63969930);
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "()Llu;"
	)
	public lu ak() {
		return this.ak_fld;
	}

	@ObfuscatedName("xp")
	@ObfuscatedSignature(
		descriptor = "(Lfu;I)V"
	)
	public static void xp(fu var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		} else if (null != var0.ak_fld) {
			ld var2 = var0.ak_fld.bn((byte)-82);
			lu var3 = var0.ak_fld;
			var0.ak_fld = null;
			if (var2 == null) {
				if (var1 < 212119776) {
					;
				}
			} else {
				if (li.vk(var2.ak_fld, (byte)11) && var2.ae_fld != null) {
					if (var1 >= 212119776) {
						return;
					}

					yz var4 = tu.ak(var3).av((Object[])var2.ae_fld, 1393114814).ax(-1014325858);
					client.cz_fld.ak(var4);
				}

				var2.ak_fld.ag(false);
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	@Override
	public boolean ae(int var1, int var2) {
		switch (var1) {
			case 81:
				this.az_fld = false;
				return false;
			case 82:
				this.ag_fld = false;
				return false;
			default:
				return false;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(CS)Z"
	)
	@Override
	public boolean ah(char var1, short var2) {
		if (null == this.ak_fld) {
			return false;
		} else if (!ap.ag(var1)) {
			return false;
		} else {
			li var3 = lu.bv(this.ak_fld, -1846945402);
			if (var3 != null && var3.cq()) {
				sc var4 = this.ak_fld.bu(-880640763);
				if (var4 == null) {
					return false;
				} else {
					if (var4.ay(var1)) {
						var3.aa(var1);
					}

					return var4.ah(var1);
				}
			} else {
				return false;
			}
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(C)Z"
	)
	@Override
	public boolean ab(char var1) {
		if (null == this.ak_fld) {
			return false;
		} else if (!ap.ag(var1)) {
			return false;
		} else {
			li var2 = lu.bv(this.ak_fld, -1581555677);
			if (var2 != null && var2.cq()) {
				sc var3 = this.ak_fld.bu(-1127869004);
				if (var3 == null) {
					return false;
				} else {
					if (var3.ay(var1)) {
						var2.aa(var1);
					}

					return var3.ah(var1);
				}
			} else {
				return false;
			}
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Llu;)V"
	)
	public void ax(lu var1) {
		if (var1 != null) {
			if (var1 != this.ak_fld) {
				xp(this, -1519707878);
				this.ak_fld = var1;
			}

			ld var2 = var1.bn((byte)-80);
			if (null != var2) {
				if (!li.vk(var2.ak_fld, (byte)112) && var2.ae_fld != null) {
					yz var3 = tu.ak(var1).av((Object[])var2.ae_fld, 2065537764).ax(961550513);
					client.cz_fld.ak(var3);
				}

				var2.ak_fld.ag(true);
			}
		} else {
			xp(this, -438203150);
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()Llu;"
	)
	public lu as() {
		return this.ak_fld;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	@Override
	public boolean ad(int var1) {
		if (null == this.ak_fld) {
			return false;
		} else {
			sc var2 = this.ak_fld.bu(-471988559);
			if (null == var2) {
				return false;
			} else {
				if (sc.ml(var2, var1)) {
					switch (var1) {
						case 81:
							this.az_fld = true;
							break;
						case 82:
							this.ag_fld = true;
							break;
						default:
							gu(this, var1);
					}
				}

				return var2.ae(var1);
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "()Llu;"
	)
	public lu af() {
		return this.ak_fld;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "()Llu;"
	)
	public lu ar() {
		return this.ak_fld;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void an() {
		if (null != this.ak_fld) {
			ld var1 = this.ak_fld.bn((byte)-110);
			lu var2 = this.ak_fld;
			this.ak_fld = null;
			if (var1 != null) {
				if (li.vk(var1.ak_fld, (byte)123) && var1.ae_fld != null) {
					yz var3 = tu.ak(var2).av((Object[])var1.ae_fld, 1777861026).ax(1122132537);
					client.cz_fld.ak(var3);
				}

				var1.ak_fld.ag(false);
			}
		}
	}

	public fu() {
		this.ag_fld = false;
		this.az_fld = false;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	@Override
	public boolean aq(int var1) {
		switch (var1) {
			case 81:
				this.az_fld = false;
				return false;
			case 82:
				this.ag_fld = false;
				return false;
			default:
				return false;
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	@Override
	public boolean am(int var1) {
		switch (var1) {
			case 81:
				this.az_fld = false;
				return false;
			case 82:
				this.ag_fld = false;
				return false;
			default:
				return false;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(C)Z"
	)
	@Override
	public boolean ao(char var1) {
		if (null == this.ak_fld) {
			return false;
		} else if (!ap.ag(var1)) {
			return false;
		} else {
			li var2 = lu.bv(this.ak_fld, -608550615);
			if (var2 != null && var2.cq()) {
				sc var3 = this.ak_fld.bu(-366938840);
				if (var3 == null) {
					return false;
				} else {
					if (var3.ay(var1)) {
						var2.aa(var1);
					}

					return var3.ah(var1);
				}
			} else {
				return false;
			}
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean bd(int var1) {
		if (null == this.ak_fld) {
			return false;
		} else {
			li var2 = lu.bv(this.ak_fld, -1857169845);
			if (null != var2 && var2.cq()) {
				switch (var1) {
					case 13:
						xp(this, -1593103102);
						return true;
					case 48:
						if (this.ag_fld) {
							var2.aq();
						}

						return true;
					case 65:
						if (this.ag_fld) {
							var2.bp(el.ht(), 596367741);
						}

						return true;
					case 66:
						if (this.ag_fld) {
							var2.bo(el.ht(), 187115210);
						}

						return true;
					case 67:
						if (this.ag_fld) {
							var2.bt(el.ht());
						}

						return true;
					case 84:
						if (var2.cp() == 0) {
							var2.aa(10);
						} else if (this.az_fld && li.hl(var2, (byte)3)) {
							var2.aa(10);
						} else {
							ld var3 = this.ak_fld.bn((byte)-77);
							yz var4 = tu.ak(this.ak_fld).av((Object[])var3.aw_fld, 1834814694).ax(-1020438527);
							client.cz_fld.ak(var4);
							xp(this, -280162806);
						}

						return true;
					case 85:
						if (this.ag_fld) {
							var2.am(-938226791);
						} else {
							li.lk(var2, (byte)-38);
						}

						return true;
					case 96:
						if (this.ag_fld) {
							li.yg(var2, this.az_fld, -1285887263);
						} else {
							var2.bd(this.az_fld, -819520715);
						}

						return true;
					case 97:
						if (this.ag_fld) {
							li.uv(var2, this.az_fld, -642656167);
						} else {
							var2.bz(this.az_fld);
						}

						return true;
					case 98:
						if (this.ag_fld) {
							var2.bv();
						} else {
							var2.bs(this.az_fld);
						}

						return true;
					case 99:
						if (this.ag_fld) {
							li.yh(var2, (byte)113);
						} else {
							li.ne(var2, this.az_fld, -214583844);
						}

						return true;
					case 101:
						if (this.ag_fld) {
							var2.ad();
						} else {
							var2.bi();
						}

						return true;
					case 102:
						if (this.ag_fld) {
							var2.aj(this.az_fld);
						} else {
							li.jv(var2, this.az_fld, 1674238720);
						}

						return true;
					case 103:
						if (this.ag_fld) {
							li.ez(var2, this.az_fld, 144200783);
						} else {
							var2.ac(this.az_fld);
						}

						return true;
					case 104:
						if (this.ag_fld) {
							var2.bf(this.az_fld);
						} else {
							var2.bk(this.az_fld);
						}

						return true;
					case 105:
						if (this.ag_fld) {
							var2.by(this.az_fld);
						} else {
							var2.bj(this.az_fld);
						}

						return true;
					default:
						return false;
				}
			} else {
				return false;
			}
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(C)Z"
	)
	@Override
	public boolean ap(char var1) {
		if (null == this.ak_fld) {
			return false;
		} else if (!ap.ag(var1)) {
			return false;
		} else {
			li var2 = lu.bv(this.ak_fld, -1965066647);
			if (var2 != null && var2.cq()) {
				sc var3 = this.ak_fld.bu(-1276289611);
				if (var3 == null) {
					return false;
				} else {
					if (var3.ay(var1)) {
						var2.aa(var1);
					}

					return var3.ah(var1);
				}
			} else {
				return false;
			}
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(C)Z"
	)
	@Override
	public boolean at(char var1) {
		if (null == this.ak_fld) {
			return false;
		} else if (!ap.ag(var1)) {
			return false;
		} else {
			li var2 = lu.bv(this.ak_fld, -1131305452);
			if (var2 != null && var2.cq()) {
				sc var3 = this.ak_fld.bu(-1540174045);
				if (var3 == null) {
					return false;
				} else {
					if (var3.ay(var1)) {
						var2.aa(var1);
					}

					return var3.ah(var1);
				}
			} else {
				return false;
			}
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(C)Z"
	)
	@Override
	public boolean ac(char var1) {
		if (null == this.ak_fld) {
			return false;
		} else if (!ap.ag(var1)) {
			return false;
		} else {
			li var2 = lu.bv(this.ak_fld, -1002976713);
			if (var2 != null && var2.cq()) {
				sc var3 = this.ak_fld.bu(-328223950);
				if (var3 == null) {
					return false;
				} else {
					if (var3.ay(var1)) {
						var2.aa(var1);
					}

					return var3.ah(var1);
				}
			} else {
				return false;
			}
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Z)Z"
	)
	@Override
	public boolean aj(boolean var1) {
		return false;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(Z)Z"
	)
	@Override
	public boolean bm(boolean var1) {
		return false;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	@Override
	public boolean av(int var1, int var2) {
		if (null == this.ak_fld) {
			return false;
		} else {
			sc var3 = this.ak_fld.bu(2104338765);
			if (null == var3) {
				return false;
			} else {
				if (sc.ml(var3, var1)) {
					switch (var1) {
						case 81:
							this.az_fld = true;
							break;
						case 82:
							this.ag_fld = true;
							break;
						default:
							gu(this, var1);
					}
				}

				return var3.ae(var1);
			}
		}
	}

	@ObfuscatedName("gu")
	@ObfuscatedSignature(
		descriptor = "(Lfu;I)Z"
	)
	public static boolean gu(fu var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		if (null == var0.ak_fld) {
			return false;
		} else {
			li var3 = lu.bv(var0.ak_fld, -2036298342);
			if (null != var3 && var3.cq()) {
				switch (var1) {
					case 13:
						xp(var0, -2079231628);
						return true;
					case 48:
						if (var0.ag_fld) {
							var3.aq();
						}

						return true;
					case 65:
						if (var0.ag_fld) {
							var3.bp(el.ht(), 1125724846);
						}

						return true;
					case 66:
						if (var0.ag_fld) {
							var3.bo(el.ht(), 187115210);
						}

						return true;
					case 67:
						if (var0.ag_fld) {
							var3.bt(el.ht());
						}

						return true;
					case 84:
						if (var3.cp() == 0) {
							var3.aa(10);
						} else if (var0.az_fld && li.hl(var3, (byte)3)) {
							var3.aa(10);
						} else {
							ld var4 = var0.ak_fld.bn((byte)-8);
							yz var5 = tu.ak(var0.ak_fld).av((Object[])var4.aw_fld, 2039739737).ax(-1895834598);
							client.cz_fld.ak(var5);
							xp(var0, -496927382);
						}

						return true;
					case 85:
						if (var0.ag_fld) {
							var3.am(-938226791);
						} else {
							li.lk(var3, (byte)-64);
						}

						return true;
					case 96:
						if (var0.ag_fld) {
							li.yg(var3, var0.az_fld, -530323749);
						} else {
							var3.bd(var0.az_fld, 59455936);
						}

						return true;
					case 97:
						if (var0.ag_fld) {
							li.uv(var3, var0.az_fld, -642656167);
						} else {
							var3.bz(var0.az_fld);
						}

						return true;
					case 98:
						if (var0.ag_fld) {
							var3.bv();
						} else {
							var3.bs(var0.az_fld);
						}

						return true;
					case 99:
						if (var0.ag_fld) {
							li.yh(var3, (byte)126);
						} else {
							li.ne(var3, var0.az_fld, -1972915256);
						}

						return true;
					case 101:
						if (var0.ag_fld) {
							var3.ad();
						} else {
							var3.bi();
						}

						return true;
					case 102:
						if (var0.ag_fld) {
							var3.aj(var0.az_fld);
						} else {
							li.jv(var3, var0.az_fld, 734133874);
						}

						return true;
					case 103:
						if (var0.ag_fld) {
							li.ez(var3, var0.az_fld, 144200783);
						} else {
							var3.ac(var0.az_fld);
						}

						return true;
					case 104:
						if (var0.ag_fld) {
							var3.bf(var0.az_fld);
						} else {
							var3.bk(var0.az_fld);
						}

						return true;
					case 105:
						if (var0.ag_fld) {
							var3.by(var0.az_fld);
						} else {
							var3.bj(var0.az_fld);
						}

						return true;
					default:
						return false;
				}
			} else {
				return false;
			}
		}
	}

	@ObfuscatedName("mq")
	@ObfuscatedSignature(
		descriptor = "(Lfu;)V"
	)
	public static void mq(fu var0) {
		if (null != var0.ak_fld) {
			ld var1 = var0.ak_fld.bn((byte)-72);
			lu var2 = var0.ak_fld;
			var0.ak_fld = null;
			if (var1 != null) {
				if (li.vk(var1.ak_fld, (byte)54) && var1.ae_fld != null) {
					yz var3 = tu.ak(var2).av((Object[])var1.ae_fld, 1530044253).ax(333741254);
					client.cz_fld.ak(var3);
				}

				var1.ak_fld.ag(false);
			}
		}
	}

	@ObfuscatedName("oc")
	@ObfuscatedSignature(
		descriptor = "(Lfu;Llu;)V"
	)
	public static void oc(fu var0, lu var1) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var1 != null) {
			if (var1 != var0.ak_fld) {
				xp(var0, -2145617816);
				var0.ak_fld = var1;
			}

			ld var2 = var1.bn((byte)-96);
			if (null != var2) {
				if (!li.vk(var2.ak_fld, (byte)56) && var2.ae_fld != null) {
					yz var3 = tu.ak(var1).av((Object[])var2.ae_fld, 1471186328).ax(1681965706);
					client.cz_fld.ak(var3);
				}

				var2.ak_fld.ag(true);
			}
		} else {
			xp(var0, -2112397947);
		}
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean bz(int var1) {
		if (null == this.ak_fld) {
			return false;
		} else {
			li var2 = lu.bv(this.ak_fld, -1636292002);
			if (null != var2 && var2.cq()) {
				switch (var1) {
					case 13:
						xp(this, -1465231534);
						return true;
					case 48:
						if (this.ag_fld) {
							var2.aq();
						}

						return true;
					case 65:
						if (this.ag_fld) {
							var2.bp(el.ht(), 1737163557);
						}

						return true;
					case 66:
						if (this.ag_fld) {
							var2.bo(el.ht(), 187115210);
						}

						return true;
					case 67:
						if (this.ag_fld) {
							var2.bt(el.ht());
						}

						return true;
					case 84:
						if (var2.cp() == 0) {
							var2.aa(10);
						} else if (this.az_fld && li.hl(var2, (byte)3)) {
							var2.aa(10);
						} else {
							ld var3 = this.ak_fld.bn((byte)-67);
							yz var4 = tu.ak(this.ak_fld).av((Object[])var3.aw_fld, 1450601038).ax(-1118365983);
							client.cz_fld.ak(var4);
							xp(this, 128238515);
						}

						return true;
					case 85:
						if (this.ag_fld) {
							var2.am(-938226791);
						} else {
							li.lk(var2, (byte)-11);
						}

						return true;
					case 96:
						if (this.ag_fld) {
							li.yg(var2, this.az_fld, 291292125);
						} else {
							var2.bd(this.az_fld, 1125277383);
						}

						return true;
					case 97:
						if (this.ag_fld) {
							li.uv(var2, this.az_fld, -642656167);
						} else {
							var2.bz(this.az_fld);
						}

						return true;
					case 98:
						if (this.ag_fld) {
							var2.bv();
						} else {
							var2.bs(this.az_fld);
						}

						return true;
					case 99:
						if (this.ag_fld) {
							li.yh(var2, (byte)65);
						} else {
							li.ne(var2, this.az_fld, -216958939);
						}

						return true;
					case 101:
						if (this.ag_fld) {
							var2.ad();
						} else {
							var2.bi();
						}

						return true;
					case 102:
						if (this.ag_fld) {
							var2.aj(this.az_fld);
						} else {
							li.jv(var2, this.az_fld, 220022225);
						}

						return true;
					case 103:
						if (this.ag_fld) {
							li.ez(var2, this.az_fld, 144200783);
						} else {
							var2.ac(this.az_fld);
						}

						return true;
					case 104:
						if (this.ag_fld) {
							var2.bf(this.az_fld);
						} else {
							var2.bk(this.az_fld);
						}

						return true;
					case 105:
						if (this.ag_fld) {
							var2.by(this.az_fld);
						} else {
							var2.bj(this.az_fld);
						}

						return true;
					default:
						return false;
				}
			} else {
				return false;
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void az(int var1) {
		if (null != this.ak_fld) {
			ld var2 = this.ak_fld.bn((byte)-82);
			lu var3 = this.ak_fld;
			this.ak_fld = null;
			if (var2 == null) {
				if (var1 < 212119776) {
					;
				}
			} else {
				if (li.vk(var2.ak_fld, (byte)11) && var2.aw_fld != null) {
					if (var1 >= 212119776) {
						return;
					}

					yz var4 = tu.ak(var3).av((Object[])var2.aw_fld, 1393114814).ax(-1014325858);
					client.cz_fld.ak(var4);
				}

				var2.ak_fld.ag(false);
			}
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	boolean ay(int var1, int var2) {
		if (null == this.ak_fld) {
			return false;
		} else {
			li var3 = lu.bv(this.ak_fld, -2036298342);
			if (null != var3 && var3.ek(-2087528058)) {
				switch (var1) {
					case 13:
						xp(this, -2079231628);
						return true;
					case 48:
						if (this.ag_fld) {
							var3.bi();
						}

						return true;
					case 65:
						if (this.az_fld) {
							var3.bp(el.ht(), 1125724846);
						}

						return true;
					case 66:
						if (this.az_fld) {
							var3.bo(el.ht(), 187115210);
						}

						return true;
					case 67:
						if (this.az_fld) {
							var3.bt(el.ht());
						}

						return true;
					case 84:
						if (var3.cf() == 0) {
							var3.db(10, -2108954523);
						} else if (this.az_fld && li.hl(var3, (byte)3)) {
							var3.et(10, -1931464981);
						} else {
							ld var4 = this.ak_fld.bn((byte)-8);
							yz var5 = tu.ak(this.ak_fld).av((Object[])var4.ae_fld, 2039739737).ax(-1895834598);
							client.cz_fld.ak(var5);
							xp(this, -496927382);
						}

						return true;
					case 85:
						if (this.ag_fld) {
							var3.ec(-938226791);
						} else {
							li.lk(var3, (byte)-64);
						}

						return true;
					case 96:
						if (this.ag_fld) {
							li.yg(var3, this.az_fld, -530323749);
						} else {
							var3.ac(this.az_fld);
						}

						return true;
					case 97:
						if (this.ag_fld) {
							li.uv(var3, this.az_fld, -642656167);
						} else {
							var3.bz(this.az_fld);
						}

						return true;
					case 98:
						if (this.ag_fld) {
							var3.ig(-1491707083);
						} else {
							var3.by(this.ag_fld);
						}

						return true;
					case 99:
						if (this.az_fld) {
							li.yh(var3, (byte)126);
						} else {
							li.ne(var3, this.ag_fld, -1972915256);
						}

						return true;
					case 101:
						if (this.ag_fld) {
							var3.bv();
						} else {
							var3.aq();
						}

						return true;
					case 102:
						if (this.az_fld) {
							var3.az(this.ag_fld);
						} else {
							li.jv(var3, this.ag_fld, 734133874);
						}

						return true;
					case 103:
						if (this.az_fld) {
							li.ez(var3, this.ag_fld, 144200783);
						} else {
							var3.bj(this.ag_fld);
						}

						return true;
					case 104:
						if (this.az_fld) {
							var3.bj(this.ag_fld);
						} else {
							var3.bk(this.az_fld);
						}

						return true;
					case 105:
						if (this.az_fld) {
							var3.bs(this.az_fld);
						} else {
							var3.aj(this.ag_fld);
						}

						return true;
					default:
						return false;
				}
			} else {
				return false;
			}
		}
	}
}
