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
	@ObfuscatedName("ol")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 628273903
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
				if (var1.ak_fld.bb() && var1.ae_fld != null) {
					yz var3 = yb.vn(tu.ak(var2).av((Object[])var1.ae_fld, 1689150636), -647579338);
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
				this.az(-1920155853);
				this.ak_fld = var1;
			}

			ld var3 = var1.bn((byte)-18);
			if (null != var3) {
				if (!var3.ak_fld.bb() && var3.ae_fld != null) {
					if (var2 != 114546440) {
						return;
					}

					yz var4 = yb.vn(tu.ak(var1).av((Object[])var3.ae_fld, 1137326740), 136569995);
					client.cz_fld.ak(var4);
				}

				var3.ak_fld.ag(true);
			}
		} else {
			this.az(63969930);
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
				if (var2.ak_fld.bb() && var2.ae_fld != null) {
					if (var1 >= 212119776) {
						return;
					}

					yz var4 = yb.vn(tu.ak(var3).av((Object[])var2.ae_fld, 1393114814), -1014325858);
					client.cz_fld.ak(var4);
				}

				var2.ak_fld.ag(false);
			}
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Llu;"
	)
	public lu ak() {
		return this.ak_fld;
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
			li var3 = lu.ax(this.ak_fld, -1846945402);
			if (var3 != null && var3.cq()) {
				sc var4 = this.ak_fld.bu(-880640763);
				if (var4 == null) {
					return false;
				} else {
					if (sc.bc(var4, var1, 1237386574)) {
						var3.aa(var1);
					}

					return sc.hf(var4, var1, -2050140537);
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
			li var2 = lu.ax(this.ak_fld, -1581555677);
			if (var2 != null && var2.cq()) {
				sc var3 = this.ak_fld.bu(-1127869004);
				if (var3 == null) {
					return false;
				} else {
					if (sc.bc(var3, var1, 1237386574)) {
						var2.aa(var1);
					}

					return sc.hf(var3, var1, -2050140537);
				}
			} else {
				return false;
			}
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	@Override
	public boolean aq(int var1) {
		if (null == this.ak_fld) {
			return false;
		} else {
			sc var2 = this.ak_fld.bu(-471988559);
			if (null == var2) {
				return false;
			} else {
				if (var2.aw(var1)) {
					switch (var1) {
						case 81:
							this.az_fld = true;
							break;
						case 82:
							this.ag_fld = true;
							break;
						default:
							this.ay(var1);
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
				if (var1.ak_fld.bb() && var1.ae_fld != null) {
					yz var3 = yb.vn(tu.ak(var2).av((Object[])var1.ae_fld, 1777861026), 1122132537);
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

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	boolean ay(int var1) {
		if (null == this.ak_fld) {
			return false;
		} else {
			li var3 = lu.ax(this.ak_fld, -2036298342);
			if (null != var3 && var3.cq()) {
				switch (var1) {
					case 13:
						this.az(-2079231628);
						return true;
					case 48:
						if (this.ag_fld) {
							var3.ab();
						}

						return true;
					case 65:
						if (this.ag_fld) {
							var3.bp(el.ht(), 1125724846);
						}

						return true;
					case 66:
						if (this.ag_fld) {
							var3.bo(el.ht(), 187115210);
						}

						return true;
					case 67:
						if (this.ag_fld) {
							var3.bt(el.ht());
						}

						return true;
					case 84:
						if (var3.cp() == 0) {
							var3.aa(10);
						} else if (this.az_fld && var3.bq()) {
							var3.aa(10);
						} else {
							ld var4 = this.ak_fld.bn((byte)-8);
							yz var5 = yb.vn(tu.ak(this.ak_fld).av((Object[])var4.aw_fld, 2039739737), -1895834598);
							client.cz_fld.ak(var5);
							this.az(-496927382);
						}

						return true;
					case 85:
						if (this.ag_fld) {
							var3.am(-938226791);
						} else {
							var3.ai();
						}

						return true;
					case 96:
						if (this.ag_fld) {
							var3.bm(this.az_fld);
						} else {
							li.fe(var3, this.az_fld, 59455936);
						}

						return true;
					case 97:
						if (this.ag_fld) {
							var3.at(this.az_fld);
						} else {
							var3.bz(this.az_fld);
						}

						return true;
					case 98:
						if (this.ag_fld) {
							li.oj(var3, -1491707083);
						} else {
							var3.bs(this.az_fld);
						}

						return true;
					case 99:
						if (this.ag_fld) {
							var3.bi();
						} else {
							var3.bk(this.az_fld);
						}

						return true;
					case 101:
						if (this.ag_fld) {
							var3.ad();
						} else {
							var3.aq();
						}

						return true;
					case 102:
						if (this.ag_fld) {
							li.ix(var3, this.az_fld, -1929936476);
						} else {
							var3.aj(this.az_fld);
						}

						return true;
					case 103:
						if (this.ag_fld) {
							var3.bf(this.az_fld);
						} else {
							var3.bj(this.az_fld);
						}

						return true;
					case 104:
						if (this.ag_fld) {
							var3.bh(this.az_fld);
						} else {
							var3.be(this.az_fld);
						}

						return true;
					case 105:
						if (this.ag_fld) {
							var3.by(this.az_fld);
						} else {
							var3.bd(this.az_fld);
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

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "()Llu;"
	)
	public lu al() {
		return this.ak_fld;
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

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	@Override
	public boolean ad(int var1) {
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
			li var2 = lu.ax(this.ak_fld, -608550615);
			if (var2 != null && var2.cq()) {
				sc var3 = this.ak_fld.bu(-366938840);
				if (var3 == null) {
					return false;
				} else {
					if (sc.bc(var3, var1, 1237386574)) {
						var2.aa(var1);
					}

					return sc.hf(var3, var1, -2050140537);
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
			li var2 = lu.ax(this.ak_fld, -1857169845);
			if (null != var2 && var2.cq()) {
				switch (var1) {
					case 13:
						this.az(-1593103102);
						return true;
					case 48:
						if (this.ag_fld) {
							var2.ab();
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
						} else if (this.az_fld && var2.bq()) {
							var2.aa(10);
						} else {
							ld var3 = this.ak_fld.bn((byte)-77);
							yz var4 = yb.vn(tu.ak(this.ak_fld).av((Object[])var3.aw_fld, 1834814694), -1020438527);
							client.cz_fld.ak(var4);
							this.az(-280162806);
						}

						return true;
					case 85:
						if (this.ag_fld) {
							var2.am(-938226791);
						} else {
							var2.ai();
						}

						return true;
					case 96:
						if (this.ag_fld) {
							var2.bm(this.az_fld);
						} else {
							li.fe(var2, this.az_fld, -819520715);
						}

						return true;
					case 97:
						if (this.ag_fld) {
							var2.at(this.az_fld);
						} else {
							var2.bz(this.az_fld);
						}

						return true;
					case 98:
						if (this.ag_fld) {
							li.oj(var2, -1491707083);
						} else {
							var2.bs(this.az_fld);
						}

						return true;
					case 99:
						if (this.ag_fld) {
							var2.bi();
						} else {
							var2.bk(this.az_fld);
						}

						return true;
					case 101:
						if (this.ag_fld) {
							var2.ad();
						} else {
							var2.aq();
						}

						return true;
					case 102:
						if (this.ag_fld) {
							li.ix(var2, this.az_fld, -1910947423);
						} else {
							var2.aj(this.az_fld);
						}

						return true;
					case 103:
						if (this.ag_fld) {
							var2.bf(this.az_fld);
						} else {
							var2.bj(this.az_fld);
						}

						return true;
					case 104:
						if (this.ag_fld) {
							var2.bh(this.az_fld);
						} else {
							var2.be(this.az_fld);
						}

						return true;
					case 105:
						if (this.ag_fld) {
							var2.by(this.az_fld);
						} else {
							var2.bd(this.az_fld);
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

	@ObfuscatedName("gw")
	@ObfuscatedSignature(
		descriptor = "(Lfu;I)Z"
	)
	public static boolean gw(fu var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		if (null == var0.ak_fld) {
			return false;
		} else {
			li var2 = lu.ax(var0.ak_fld, -1636292002);
			if (null != var2 && var2.cq()) {
				switch (var1) {
					case 13:
						var0.az(-1465231534);
						return true;
					case 48:
						if (var0.ag_fld) {
							var2.ab();
						}

						return true;
					case 65:
						if (var0.ag_fld) {
							var2.bp(el.ht(), 1737163557);
						}

						return true;
					case 66:
						if (var0.ag_fld) {
							var2.bo(el.ht(), 187115210);
						}

						return true;
					case 67:
						if (var0.ag_fld) {
							var2.bt(el.ht());
						}

						return true;
					case 84:
						if (var2.cp() == 0) {
							var2.aa(10);
						} else if (var0.az_fld && var2.bq()) {
							var2.aa(10);
						} else {
							ld var3 = var0.ak_fld.bn((byte)-67);
							yz var4 = yb.vn(tu.ak(var0.ak_fld).av((Object[])var3.aw_fld, 1450601038), -1118365983);
							client.cz_fld.ak(var4);
							var0.az(128238515);
						}

						return true;
					case 85:
						if (var0.ag_fld) {
							var2.am(-938226791);
						} else {
							var2.ai();
						}

						return true;
					case 96:
						if (var0.ag_fld) {
							var2.bm(var0.az_fld);
						} else {
							li.fe(var2, var0.az_fld, 1125277383);
						}

						return true;
					case 97:
						if (var0.ag_fld) {
							var2.at(var0.az_fld);
						} else {
							var2.bz(var0.az_fld);
						}

						return true;
					case 98:
						if (var0.ag_fld) {
							li.oj(var2, -1491707083);
						} else {
							var2.bs(var0.az_fld);
						}

						return true;
					case 99:
						if (var0.ag_fld) {
							var2.bi();
						} else {
							var2.bk(var0.az_fld);
						}

						return true;
					case 101:
						if (var0.ag_fld) {
							var2.ad();
						} else {
							var2.aq();
						}

						return true;
					case 102:
						if (var0.ag_fld) {
							li.ix(var2, var0.az_fld, -1885493019);
						} else {
							var2.aj(var0.az_fld);
						}

						return true;
					case 103:
						if (var0.ag_fld) {
							var2.bf(var0.az_fld);
						} else {
							var2.bj(var0.az_fld);
						}

						return true;
					case 104:
						if (var0.ag_fld) {
							var2.bh(var0.az_fld);
						} else {
							var2.be(var0.az_fld);
						}

						return true;
					case 105:
						if (var0.ag_fld) {
							var2.by(var0.az_fld);
						} else {
							var2.bd(var0.az_fld);
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
			li var2 = lu.ax(this.ak_fld, -1965066647);
			if (var2 != null && var2.cq()) {
				sc var3 = this.ak_fld.bu(-1276289611);
				if (var3 == null) {
					return false;
				} else {
					if (sc.bc(var3, var1, 1237386574)) {
						var2.aa(var1);
					}

					return sc.hf(var3, var1, -2050140537);
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
			li var2 = lu.ax(this.ak_fld, -1131305452);
			if (var2 != null && var2.cq()) {
				sc var3 = this.ak_fld.bu(-1540174045);
				if (var3 == null) {
					return false;
				} else {
					if (sc.bc(var3, var1, 1237386574)) {
						var2.aa(var1);
					}

					return sc.hf(var3, var1, -2050140537);
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
			li var2 = lu.ax(this.ak_fld, -1002976713);
			if (var2 != null && var2.cq()) {
				sc var3 = this.ak_fld.bu(-328223950);
				if (var3 == null) {
					return false;
				} else {
					if (sc.bc(var3, var1, 1237386574)) {
						var2.aa(var1);
					}

					return sc.hf(var3, var1, -2050140537);
				}
			} else {
				return false;
			}
		}
	}

	@ObfuscatedName("ol")
	@ObfuscatedSignature(
		descriptor = "(Lfu;Llu;)V"
	)
	public static void ol(fu var0, lu var1) {
		if (var0 == null) {
			var0.getClass();
		} else {
			if (var1 != null) {
				if (var1 != var0.ak_fld) {
					var0.az(-1519707878);
					var0.ak_fld = var1;
				}

				ld var2 = var1.bn((byte)-80);
				if (null != var2) {
					if (!var2.ak_fld.bb() && var2.ae_fld != null) {
						yz var3 = yb.vn(tu.ak(var1).av((Object[])var2.ae_fld, 2065537764), 961550513);
						client.cz_fld.ak(var3);
					}

					var2.ak_fld.ag(true);
				}
			} else {
				var0.az(-438203150);
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

	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "(Lfu;)V"
	)
	public static void dx(fu var0) {
		if (null != var0.ak_fld) {
			ld var1 = var0.ak_fld.bn((byte)-72);
			lu var2 = var0.ak_fld;
			var0.ak_fld = null;
			if (var1 != null) {
				if (var1.ak_fld.bb() && var1.ae_fld != null) {
					yz var3 = yb.vn(tu.ak(var2).av((Object[])var1.ae_fld, 1530044253), 333741254);
					client.cz_fld.ak(var3);
				}

				var1.ak_fld.ag(false);
			}
		}
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
				if (var3.aw(var1)) {
					switch (var1) {
						case 81:
							this.az_fld = true;
							break;
						case 82:
							this.ag_fld = true;
							break;
						default:
							this.ay(var1);
					}
				}

				return var3.ae(var1);
			}
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()Llu;"
	)
	public lu as() {
		return this.ak_fld;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean bz(int var1) {
		if (null == this.ak_fld) {
			return false;
		} else {
			li var2 = lu.ax(this.ak_fld, -1636292002);
			if (null != var2 && var2.df(-2146049921)) {
				switch (var1) {
					case 13:
						this.az(-1465231534);
						return true;
					case 48:
						if (this.ag_fld) {
							var2.aq();
						}

						return true;
					case 65:
						if (this.az_fld) {
							var2.bp(el.ht(), 1737163557);
						}

						return true;
					case 66:
						if (this.az_fld) {
							var2.bo(el.ht(), 187115210);
						}

						return true;
					case 67:
						if (this.az_fld) {
							var2.bt(el.ht());
						}

						return true;
					case 84:
						if (var2.cp() == 0) {
							var2.du(10, -2125378103);
						} else if (this.az_fld && var2.cm()) {
							var2.db(10, -1903519439);
						} else {
							ld var3 = this.ak_fld.bn((byte)-67);
							yz var4 = yb.vn(tu.ak(this.ak_fld).av((Object[])var3.ae_fld, 1450601038), -1118365983);
							client.cz_fld.ak(var4);
							this.az(128238515);
						}

						return true;
					case 85:
						if (this.ag_fld) {
							var2.jw(-938226791);
						} else {
							var2.bi();
						}

						return true;
					case 96:
						if (this.az_fld) {
							var2.bf(this.az_fld);
						} else {
							li.fe(var2, this.az_fld, 1125277383);
						}

						return true;
					case 97:
						if (this.ag_fld) {
							var2.bh(this.ag_fld);
						} else {
							var2.bz(this.ag_fld);
						}

						return true;
					case 98:
						if (this.az_fld) {
							li.oj(var2, -1491707083);
						} else {
							var2.bs(this.az_fld);
						}

						return true;
					case 99:
						if (this.ag_fld) {
							var2.aq();
						} else {
							var2.br(this.ag_fld);
						}

						return true;
					case 101:
						if (this.ag_fld) {
							var2.ig(778132311);
						} else {
							var2.bi();
						}

						return true;
					case 102:
						if (this.az_fld) {
							li.ix(var2, this.az_fld, -1885493019);
						} else {
							var2.aj(this.az_fld);
						}

						return true;
					case 103:
						if (this.ag_fld) {
							var2.bm(this.ag_fld);
						} else {
							var2.bf(this.ag_fld);
						}

						return true;
					case 104:
						if (this.ag_fld) {
							var2.aj(this.az_fld);
						} else {
							var2.be(this.az_fld);
						}

						return true;
					case 105:
						if (this.az_fld) {
							var2.by(this.az_fld);
						} else {
							var2.bm(this.ag_fld);
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
