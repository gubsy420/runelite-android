import java.util.ArrayList;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("zg")
public class zg {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean ao_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ag_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ak_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ae_fld;
	@ObfuscatedGetter(
		intValue = 1547946271
	)
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int aa_fld = 836996385;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int az_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int as_fld;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int an_fld;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ar_fld;
	@ObfuscatedGetter(
		intValue = 1509271129
	)
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ai_fld = -1506230761;
	@ObfuscatedGetter(
		intValue = 2006532901
	)
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int aq_fld = 0;
	@ObfuscatedGetter(
		intValue = -601844119
	)
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int am_fld = 0;
	@ObfuscatedGetter(
		intValue = 1080326391
	)
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ad_fld = 0;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int af_fld;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lzv;"
	)
	zv ab_fld;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/ArrayList;"
	)
	ArrayList ap_fld;
	@ObfuscatedGetter(
		intValue = 1672939309
	)
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int at_fld;
	@ObfuscatedGetter(
		intValue = 1642063483
	)
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ac_fld;

	@ObfuscatedName("ee")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ee() {
		this.bf(0, this.ap_fld.size(), -965052253);
	}

	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	public int dd(int var1, int var2) {
		if (null == this.ab_fld) {
			return 0;
		} else if (this.av() && var1 > this.aa_fld) {
			return this.ap_fld.size();
		} else {
			if (!this.ap_fld.isEmpty()) {
				for (int var3 = 0; var3 < this.ap_fld.size(); var3++) {
					zj var4 = (zj)(zj)this.ap_fld.get(var3);
					if (var2 <= var4.az_fld + ae(this, 1917156394)) {
						if (var2 < var4.az_fld) {
							break;
						}

						if (var1 < var4.ag_fld) {
							return var3 > 0 ? var3 - 1 : 0;
						}

						if (var3 + 1 != this.ap_fld.size() && ((zj)this.ap_fld.get(1 + var3)).az_fld * 1209571599 != var4.az_fld) {
							int var5 = this.bl((zj)this.ap_fld.get(var3), false);
							if (var1 < var4.ag_fld + var5) {
								return var3;
							}

							if (var2 <= var4.az_fld + ae(this, 1917156394)) {
								return var3 + 1;
							}
						}
					}
				}

				zj var6 = (zj)(zj)this.ap_fld.get(this.ap_fld.size() - 1);
				if (var1 >= var6.ag_fld && var1 <= var6.ag_fld + this.ac() && var2 >= var6.az_fld && var2 <= var6.az_fld + ae(this, 1917156394)) {
					return this.ap_fld.size() - 1;
				}
			}

			return this.ap_fld.size();
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(III)I"
	)
	public int aq(int var1, int var2, int var3) {
		if (var2 < var1) {
			int var4 = var2;
			var2 = var1;
			var1 = var4;
		}

		this.ap_fld.subList(var1, var2).clear();
		int var6 = var1;
		if (this.av() && this.at_fld == 1) {
			while (var6 > 0) {
				char var5 = ((zj)this.ap_fld.get(--var6)).ak_fld;
				if (' ' == var5 || '\t' == var5) {
					break;
				}
			}
		}

		this.bf(var6, var2, -1689127516);
		return var1;
	}

	@ObfuscatedName("rf")
	@ObfuscatedSignature(
		descriptor = "(Lzg;)I"
	)
	public static int rf(zg var0) {
		return var0.ai_fld;
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void be(int var1, int var2) {
		if (this.ab_fld != null && var1 < 2 * this.ab_fld.ap_fld) {
			var1 = Integer.MAX_VALUE;
		}

		if (this.aa_fld != var1) {
			if (var2 == 892985171) {
				return;
			}

			this.aa_fld = var1;
			vf(this, (byte)0);
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String ah() {
		if (this.az(1939769251)) {
			return "";
		} else {
			StringBuilder var2 = new StringBuilder(this.ae());

			for (int var3 = 0; var3 < this.ae(); var3++) {
				zj var4 = this.ak(var3);
				var2.append(var4.ak_fld);
			}

			return var2.toString();
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	public boolean as(int var1, int var2) {
		if (this.aq_fld != var1 || this.am_fld != var2) {
			this.aq_fld = var1;
			this.am_fld = var2;
			vf(this, (byte)0);
		}

		return true;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void aw(int var1) {
		if (var1 != this.ad_fld) {
			this.ad_fld = var1;
			vf(this, (byte)0);
		}
	}

	public zg() {
		this.ao_fld = true;
		this.ap_fld = new ArrayList();
		this.at_fld = 0;
		this.ac_fld = 0;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Lzw;"
	)
	zw ax(String var1, int var2) {
		return this.au(var1, this.ap_fld.size(), var2);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Lzj;"
	)
	public zj ak(int var1) {
		return (zj)(zj)this.ap_fld.get(var1);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void aa() {
		this.ap_fld.clear();
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)Lzw;"
	)
	public zw ct(String var1) {
		this.aa();
		return this.ax(var1, 0);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ao() {
		if (!this.ap_fld.isEmpty() && this.aj() == 1) {
			return this.ap_fld.isEmpty() ? 0 : ((zj)this.ap_fld.get(this.ap_fld.size() - 1)).ag_fld * 1772748085 + this.ac();
		} else {
			int var2 = -1;
			int var3 = 0;

			for (int var4 = this.ap_fld.size() - 1; var4 >= 0; var4--) {
				zj var5 = (zj)(zj)this.ap_fld.get(var4);
				if (var5.az_fld != var2) {
					int var6 = this.bl(var5, false) + var5.ag_fld;
					var3 = Math.max(var6, var3);
					var2 = var5.az_fld;
				}
			}

			return var3;
		}
	}

	@ObfuscatedName("sx")
	@ObfuscatedSignature(
		descriptor = "(Lzg;Lzj;Z)I"
	)
	public static int sx(zg var0, zj var1, boolean var2) {
		if (var0 == null) {
			var0.getClass();
		}

		if ('\n' == var1.ak_fld) {
			return 0;
		} else if (!var2 && var0.ac_fld != 0) {
			return var0.ab_fld.br_fld[42];
		} else {
			int var3 = var0.ab_fld.br_fld[var1.ak_fld];
			if (var3 == 0) {
				return var1.ak_fld == 9 ? 3 * var0.ab_fld.br_fld[-394091598] : var0.ab_fld.br_fld[32];
			} else {
				return var3;
			}
		}
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void cs(int var1) {
		if (var1 != this.ac_fld) {
			this.ac_fld = var1;
			vf(this, (byte)0);
		}
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean cc() {
		return this.ai_fld > 1;
	}

	@ObfuscatedName("fu")
	@ObfuscatedSignature(
		descriptor = "(Lzg;)V"
	)
	public static void fu(zg var0) {
		var0.bf(0, var0.ap_fld.size(), -895933781);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ac() {
		return this.az(1939769251) ? 0 : this.bl((zj)this.ap_fld.get(this.ap_fld.size() - 1), false);
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int bd() {
		return this.aa_fld;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean az(int var1) {
		return this.ap_fld.isEmpty();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int at() {
		return this.ai_fld;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void bz(int var1) {
		if (this.ai_fld != var1) {
			this.ai_fld = var1;
			vf(this, (byte)0);
		}
	}

	@ObfuscatedName("wt")
	@ObfuscatedSignature(
		descriptor = "(Lzg;I)V"
	)
	public static void wt(zg var0, int var1) {
		if (var0.ab_fld != null && var1 < 2 * var0.ab_fld.ap_fld) {
			var1 = Integer.MAX_VALUE;
		}

		if (var0.aa_fld != var1) {
			var0.aa_fld = var1;
			vf(var0, (byte)0);
		}
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean bg() {
		return this.ap_fld.isEmpty();
	}

	@ObfuscatedName("of")
	@ObfuscatedSignature(
		descriptor = "(Lzg;I)Lzj;"
	)
	public static zj of(zg var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.ap_fld.isEmpty() ? null : (zj)var0.ap_fld.get(var0.ap_fld.size() - 1);
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int bs() {
		return this.ac_fld;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int bh(int var1) {
		switch (this.aq_fld) {
			case 0:
				return 0;
			case 1:
				return var1 / 2;
			case 2:
				return var1;
			default:
				return 0;
		}
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int bk(int var1) {
		switch (this.am_fld) {
			case 0:
				return 0;
			case 1:
				return var1 / 2;
			case 2:
				return var1;
			default:
				return 0;
		}
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	void bf(int var1, int var2, int var3) {
		if (!this.az(1939769251) && this.ab_fld != null) {
			ve var4 = this.bx(var1, var2);
			boolean var10000;
			if ((Integer)var4.ak_fld == 0 && (Integer)var4.ag_fld == this.ap_fld.size()) {
				if (var3 >= -613761473) {
					return;
				}

				var10000 = true;
			} else {
				var10000 = false;
			}

			boolean var5 = var10000;
			int var6 = (Integer)var4.ak_fld;
			int var7 = 0;
			int var29;
			if (var5) {
				if (var3 >= -613761473) {
					return;
				}

				var29 = 0;
			} else {
				var29 = ((zj)this.ap_fld.get((Integer)var4.ak_fld)).az_fld * 1209571599;
			}

			int var8 = var29;
			int var9 = 0;

			for (int var10 = (Integer)var4.ak_fld; var10 <= (Integer)var4.ag_fld; var10++) {
				boolean var11;
				int var13;
				boolean var30;
				label203: {
					var11 = var10 >= this.ap_fld.size();
					zj var12 = (zj)(zj)this.ap_fld.get(!var11 ? var10 : this.ap_fld.size() - 1);
					var13 = !var11 ? this.bl(var12, false) : 0;
					if (!var11) {
						if (var3 >= -613761473) {
							return;
						}

						if ('\n' == var12.ak_fld) {
							if (var3 >= -613761473) {
								return;
							}

							var30 = true;
							break label203;
						}
					}

					var30 = false;
				}

				boolean var14 = var30;
				boolean var31;
				if (!var11 && this.av() && var13 + var7 > this.aa_fld) {
					if (var3 >= -613761473) {
						return;
					}

					var31 = true;
				} else {
					var31 = false;
				}

				boolean var15 = var31;
				if (var14 || var15 || var11) {
					int var16 = var10;
					int var17 = 0;
					if (var15) {
						int var18 = 0;
						label172:
						if (this.at_fld == 1) {
							int var19 = var10;

							while (true) {
								if (var19 <= var6) {
									break label172;
								}

								zj var20 = (zj)(zj)this.ap_fld.get(var19);
								int var10001;
								if (var19 < var16) {
									if (var3 >= -613761473) {
										return;
									}

									var10001 = this.bl(var20, false);
								} else {
									var10001 = 0;
								}

								var18 += var10001;
								if (var20.ak_fld == ' ') {
									break;
								}

								if (var3 >= -613761473) {
									return;
								}

								if (var20.ak_fld == '\n') {
									break;
								}

								var19--;
							}

							var16 = var19;
							var7 -= var18;
							var17 = var18;
						}
					}

					int var26 = -this.bh(var7);

					for (int var27 = var6; var27 < var16; var27++) {
						zj var28 = (zj)(zj)this.ap_fld.get(var27);
						int var21 = this.bl(var28, false);
						var28.ag_fld = var26;
						var28.az_fld = var8;
						var26 += var21;
					}

					var6 = var16;
					var7 = var17;
					var8 += ae(this, 1917156394);
					var9++;
				}

				var7 += !var11 ? var13 : 0;
			}

			if (this.am_fld != 0 && var5) {
				int var22 = var9 * ae(this, 1917156394);
				int var23 = this.bk(var22);

				for (int var24 = 0; var24 < this.ap_fld.size(); var24++) {
					zj var25 = (zj)(zj)this.ap_fld.get(var24);
					var25.az_fld -= var23 * -1760086545;
				}
			}
		}
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(Lzj;Z)I"
	)
	int bl(zj var1, boolean var2) {
		if ('\n' == var1.ak_fld) {
			return 0;
		} else if (!var2 && this.ac_fld != 0) {
			return this.ab_fld.br_fld[42];
		} else {
			int var4 = this.ab_fld.br_fld[var1.ak_fld];
			if (var4 == 0) {
				return var1.ak_fld == 9 ? 3 * this.ab_fld.br_fld[32] : this.ab_fld.br_fld[32];
			} else {
				return var4;
			}
		}
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(II)Lve;"
	)
	ve bx(int var1, int var2) {
		int var4 = Math.min(var1, var2);
		int var5 = Math.max(var1, var2);
		int var6 = this.ap_fld.size();
		if (0 == var4 && var5 == var6) {
			return new ve(0, var6);
		} else {
			int var7 = wn(this, var4, false);
			int var8 = this.bp(var5, false);
			switch (this.am_fld) {
				case 0:
					if (0 == this.aq_fld) {
						return new ve(var7, var6);
					}

					int var10 = wn(this, var4, true);
					return new ve(var10, var6);
				case 1:
					return new ve(0, var6);
				case 2:
					if (2 == this.aq_fld) {
						return new ve(0, var8);
					}

					int var9 = this.bp(var5, true);
					return new ve(0, var9);
				default:
					return new ve(0, var6);
			}
		}
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(IZ)I"
	)
	int bp(int var1, boolean var2) {
		if (var1 < this.ap_fld.size()) {
			int var4 = ((zj)this.ap_fld.get(var1)).az_fld * 1209571599;

			for (int var5 = var1; var5 < this.ap_fld.size() - 1; var5++) {
				if (((zj)this.ap_fld.get(1 + var5)).az_fld * 1209571599 > var4) {
					if (!var2) {
						return var5;
					}

					var2 = false;
					var4 = ((zj)this.ap_fld.get(var5 + 1)).az_fld * 1209571599;
				}
			}
		}

		return this.ap_fld.size();
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int cv() {
		return this.ap_fld.size();
	}

	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int dg() {
		return this.aa_fld;
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(I)Lzj;"
	)
	public zj bn(int var1) {
		return (zj)(zj)this.ap_fld.get(var1);
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "()Lzj;"
	)
	zj bc() {
		return this.ap_fld.isEmpty() ? null : (zj)this.ap_fld.get(this.ap_fld.size() - 1);
	}

	@ObfuscatedName("ro")
	@ObfuscatedSignature(
		descriptor = "(Lzg;I)V"
	)
	public static void ro(zg var0, int var1) {
		if (var0.at_fld != var1) {
			var0.at_fld = var1 * 1692035052;
			vf(var0, (byte)0);
		}
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "()Lzj;"
	)
	zj ba() {
		return this.ap_fld.isEmpty() ? null : (zj)this.ap_fld.get(this.ap_fld.size() - 1);
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "()Lzj;"
	)
	zj bq() {
		return this.ap_fld.isEmpty() ? null : (zj)this.ap_fld.get(this.ap_fld.size() - 1);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int aj() {
		return this.ab() / this.ab_fld.ap_fld;
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean bb() {
		return this.ap_fld.isEmpty();
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean cd() {
		return this.ap_fld.isEmpty();
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean cq() {
		return this.ai_fld > 1;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean av() {
		return this.ai_fld > 1;
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String cy() {
		if (this.az(1939769251)) {
			return "";
		} else {
			StringBuilder var1 = new StringBuilder(this.ae());

			for (int var2 = 0; var2 < this.ae(); var2++) {
				zj var3 = this.ak(var2);
				var1.append(var3.ak_fld);
			}

			return var1.toString();
		}
	}

	@ObfuscatedName("nb")
	@ObfuscatedSignature(
		descriptor = "(Lzg;II)Lzr;"
	)
	public static zr nb(zg var0, int var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var2 == var1) {
			return new zr(var0, 0, 0);
		} else if (var1 > var0.ap_fld.size() || var2 > var0.ap_fld.size()) {
			return new zr(var0, 0, 0);
		} else {
			return var2 < var1 ? new zr(var0, var2, var1) : new zr(var0, var1, var2);
		}
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String cf() {
		if (this.az(1939769251)) {
			return "";
		} else {
			StringBuilder var1 = new StringBuilder(this.ae());

			for (int var2 = 0; var2 < this.ae(); var2++) {
				zj var3 = this.ak(var2);
				var1.append(var3.ak_fld);
			}

			return var1.toString();
		}
	}

	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "(Lzg;II)I"
	)
	public static int hg(zg var0, int var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var2 < var1) {
			int var3 = var2;
			var2 = var1;
			var1 = var3;
		}

		var0.ap_fld.subList(var1, var2).clear();
		int var5 = var1;
		if (var0.av() && var0.at_fld == 1) {
			while (var5 > 0) {
				char var4 = ((zj)var0.ap_fld.get(--var5)).ak_fld;
				if (' ' == var4 || '\t' == var4) {
					break;
				}
			}
		}

		var0.bf(var5, var2, -1176631744);
		return var1;
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void cr(int var1) {
		if (var1 != this.ad_fld) {
			this.ad_fld = var1;
			vf(this, (byte)0);
		}
	}

	@ObfuscatedName("ey")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void ey(int var1, int var2) {
		if (!this.az(1939769251) && this.ab_fld != null) {
			ve var3 = this.bx(var1, var2);
			boolean var4 = (Integer)var3.ak_fld == 0 && (Integer)var3.ag_fld == this.ap_fld.size();
			int var5 = (Integer)var3.ak_fld;
			int var6 = 0;
			int var7 = var4 ? 0 : ((zj)this.ap_fld.get((Integer)var3.ak_fld)).az_fld * 1209571599;
			int var8 = 0;

			for (int var9 = (Integer)var3.ak_fld; var9 <= (Integer)var3.ag_fld; var9++) {
				boolean var10 = var9 >= this.ap_fld.size();
				zj var11 = (zj)(zj)this.ap_fld.get(!var10 ? var9 : this.ap_fld.size() - 1);
				int var12 = !var10 ? this.bl(var11, false) : 0;
				boolean var13 = !var10 && '\n' == var11.ak_fld;
				boolean var14 = !var10 && this.av() && var12 + var6 > this.aa_fld;
				if (var13 || var14 || var10) {
					int var15 = var9;
					int var16 = 0;
					if (var14) {
						int var17 = 0;
						if (this.at_fld == 1) {
							for (int var18 = var9; var18 > var5; var18--) {
								zj var19 = (zj)(zj)this.ap_fld.get(var18);
								var17 += var18 < var15 ? this.bl(var19, false) : 0;
								if (var19.ak_fld == ' ' || var19.ak_fld == '\n') {
									var15 = var18;
									var6 -= var17;
									var16 = var17;
									break;
								}
							}
						}
					}

					int var25 = -this.bh(var6);

					for (int var26 = var5; var26 < var15; var26++) {
						zj var27 = (zj)(zj)this.ap_fld.get(var26);
						int var20 = this.bl(var27, false);
						var27.ag_fld = var25;
						var27.az_fld = var7;
						var25 += var20;
					}

					var5 = var15;
					var6 = var16;
					var7 += ae(this, 1917156394);
					var8++;
				}

				var6 += !var10 ? var12 : 0;
			}

			if (this.am_fld != 0 && var4) {
				int var21 = var8 * ae(this, 1917156394);
				int var22 = this.bk(var21);

				for (int var23 = 0; var23 < this.ap_fld.size(); var23++) {
					zj var24 = (zj)(zj)this.ap_fld.get(var23);
					var24.az_fld -= var22 * -1760086545;
				}
			}
		}
	}

	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void ec(int var1) {
		if (this.at_fld != var1) {
			this.at_fld = var1 * 806471629;
			vf(this, (byte)0);
		}
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	public boolean ce(int var1, int var2) {
		if (this.aq_fld != var1 || this.am_fld != var2) {
			this.aq_fld = var1;
			this.am_fld = var2;
			vf(this, (byte)0);
		}

		return true;
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void cx(int var1) {
		if (var1 != this.ac_fld) {
			this.ac_fld = var1 * -445473647;
			vf(this, (byte)0);
		}
	}

	@ObfuscatedName("qn")
	@ObfuscatedSignature(
		descriptor = "(Lzg;IB)I"
	)
	public static int qn(zg var0, int var1, byte var2) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.aq(var1, var1 + 1, 187780670);
		}
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(II)Lzr;"
	)
	public zr cw(int var1, int var2) {
		if (var2 == var1) {
			return new zr(this, 0, 0);
		} else if (var1 > this.ap_fld.size() || var2 > this.ap_fld.size()) {
			return new zr(this, 0, 0);
		} else {
			return var2 < var1 ? new zr(this, var2, var1) : new zr(this, var1, var2);
		}
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(CII)Lzw;"
	)
	public zw ck(char var1, int var2, int var3) {
		return this.au(Character.toString(var1), var2, var3);
	}

	@ObfuscatedName("ef")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int ef(int var1) {
		switch (this.aq_fld) {
			case 0:
				return 0;
			case 1:
				return var1 / 2;
			case 2:
				return var1;
			default:
				return 0;
		}
	}

	@ObfuscatedName("ge")
	@ObfuscatedSignature(
		descriptor = "(Lzg;IB)I"
	)
	public static int ge(zg var0, int var1, byte var2) {
		if (var0 == null) {
			var0.getClass();
		}

		return var1 < var0.ap_fld.size() ? var0.bl((zj)var0.ap_fld.get(var1), false) : 0;
	}

	@ObfuscatedName("eo")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void eo(int var1) {
		if (this.at_fld != var1) {
			this.at_fld = var1 * -1471598225;
			vf(this, (byte)0);
		}
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)Lzw;"
	)
	public zw cb(String var1, int var2, int var3) {
		if (var3 == 0) {
			var3 = 943591543;
		}

		int var4 = var2;
		if (this.ap_fld.size() >= var3) {
			this.bf(var2, var2, -1650916167);
			return new zw(var2, true);
		} else {
			this.ap_fld.ensureCapacity(this.ap_fld.size() + var1.length());

			for (int var5 = 0; var5 < var1.length() && this.ap_fld.size() < var3; var5++) {
				zj var6 = new zj();
				var6.ak_fld = var1.charAt(var5);
				this.ap_fld.add(var4, var6);
				var4++;
			}

			this.bf(var2, var4, -1113742377);
			if (0 != this.ai_fld && this.aj() > this.ai_fld) {
				while (var2 != var4) {
					qn(this, --var4, (byte)-60);
					if (this.aj() <= this.ai_fld) {
						break;
					}
				}

				return new zw(var4, true);
			} else {
				return new zw(var4, false);
			}
		}
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)Lzw;"
	)
	public zw co(String var1, int var2, int var3) {
		if (var3 == 0) {
			var3 = Integer.MAX_VALUE;
		}

		int var4 = var2;
		if (this.ap_fld.size() >= var3) {
			this.bf(var2, var2, -1901541312);
			return new zw(var2, true);
		} else {
			this.ap_fld.ensureCapacity(this.ap_fld.size() + var1.length());

			for (int var5 = 0; var5 < var1.length() && this.ap_fld.size() < var3; var5++) {
				zj var6 = new zj();
				var6.ak_fld = var1.charAt(var5);
				this.ap_fld.add(var4, var6);
				var4++;
			}

			this.bf(var2, var4, -1412537043);
			if (0 != this.ai_fld && this.aj() > this.ai_fld) {
				while (var2 != var4) {
					qn(this, --var4, (byte)-70);
					if (this.aj() <= this.ai_fld) {
						break;
					}
				}

				return new zw(var4, true);
			} else {
				return new zw(var4, false);
			}
		}
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)Lzw;"
	)
	public zw ch(String var1) {
		this.aa();
		return this.ax(var1, 0);
	}

	@ObfuscatedName("en")
	@ObfuscatedSignature(
		descriptor = "(Lzg;II)V"
	)
	public static void en(zg var0, int var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		if (!var0.az(1939769251) && var0.ab_fld != null) {
			ve var3 = var0.bx(var1, var2);
			boolean var4 = (Integer)var3.ak_fld == 0 && (Integer)var3.ag_fld == var0.ap_fld.size();
			int var5 = (Integer)var3.ak_fld;
			int var6 = 0;
			int var7 = var4 ? 0 : ((zj)var0.ap_fld.get((Integer)var3.ak_fld)).az_fld * 1209571599;
			int var8 = 0;

			for (int var9 = (Integer)var3.ak_fld; var9 <= (Integer)var3.ag_fld; var9++) {
				boolean var10 = var9 >= var0.ap_fld.size();
				zj var11 = (zj)(zj)var0.ap_fld.get(!var10 ? var9 : var0.ap_fld.size() - 1);
				int var12 = !var10 ? var0.bl(var11, false) : 0;
				boolean var13 = !var10 && '\n' == var11.ak_fld;
				boolean var14 = !var10 && var0.av() && var12 + var6 > var0.aa_fld;
				if (var13 || var14 || var10) {
					int var15 = var9;
					int var16 = 0;
					if (var14) {
						int var17 = 0;
						if (var0.at_fld == 1) {
							for (int var18 = var9; var18 > var5; var18--) {
								zj var19 = (zj)(zj)var0.ap_fld.get(var18);
								var17 += var18 < var15 ? var0.bl(var19, false) : 0;
								if (var19.ak_fld == ' ' || var19.ak_fld == '\n') {
									var15 = var18;
									var6 -= var17;
									var16 = var17;
									break;
								}
							}
						}
					}

					int var25 = -var0.bh(var6);

					for (int var26 = var5; var26 < var15; var26++) {
						zj var27 = (zj)(zj)var0.ap_fld.get(var26);
						int var20 = var0.bl(var27, false);
						var27.ag_fld = var25;
						var27.az_fld = var7;
						var25 += var20;
					}

					var5 = var15;
					var6 = var16;
					var7 += ae(var0, 1917156394);
					var8++;
				}

				var6 += !var10 ? var12 : 0;
			}

			if (var0.am_fld != 0 && var4) {
				int var21 = var8 * ae(var0, 1917156394);
				int var22 = var0.bk(var21);

				for (int var23 = 0; var23 < var0.ap_fld.size(); var23++) {
					zj var24 = (zj)(zj)var0.ap_fld.get(var23);
					var24.az_fld -= var22 * -1760086545;
				}
			}
		}
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(I)Lzj;"
	)
	public zj bu(int var1) {
		return (zj)(zj)this.ap_fld.get(var1);
	}

	@ObfuscatedName("gl")
	@ObfuscatedSignature(
		descriptor = "(Lzg;I)V"
	)
	public static void gl(zg var0, int var1) {
		if (var0.ab_fld != null && var1 < 2 * var0.ab_fld.ap_fld) {
			var1 = Integer.MAX_VALUE;
		}

		if (var0.aa_fld != var1) {
			var0.aa_fld = var1;
			vf(var0, (byte)0);
		}
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)Lzw;"
	)
	public zw cj(String var1) {
		this.aa();
		return this.ax(var1, 0);
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void cl() {
		this.ap_fld.clear();
	}

	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void dc() {
		this.ap_fld.clear();
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)Lzw;"
	)
	public zw au(String var1, int var2, int var3) {
		if (var3 == 0) {
			var3 = Integer.MAX_VALUE;
		}

		int var5 = var2;
		if (this.ap_fld.size() >= var3) {
			this.bf(var2, var2, -828033822);
			return new zw(var2, true);
		} else {
			this.ap_fld.ensureCapacity(this.ap_fld.size() + var1.length());

			for (int var6 = 0; var6 < var1.length() && this.ap_fld.size() < var3; var6++) {
				zj var7 = new zj();
				var7.ak_fld = var1.charAt(var6);
				this.ap_fld.add(var5, var7);
				var5++;
			}

			this.bf(var2, var5, -1146535840);
			if (0 != this.ai_fld && this.aj() > this.ai_fld) {
				while (var2 != var5) {
					qn(this, --var5, (byte)-23);
					if (this.aj() <= this.ai_fld) {
						break;
					}
				}

				return new zw(var5, true);
			} else {
				return new zw(var5, false);
			}
		}
	}

	@ObfuscatedName("ys")
	@ObfuscatedSignature(
		descriptor = "(Lzg;Ljava/lang/String;I)Lzw;"
	)
	public static zw ys(zg var0, String var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.aa();
		return var0.ax(var1, 0);
	}

	@ObfuscatedName("wf")
	@ObfuscatedSignature(
		descriptor = "(Lzg;IIB)I"
	)
	public static int wf(zg var0, int var1, int var2, byte var3) {
		if (var0 == null) {
			throw new NullPointerException();
		} else if (null == var0.ab_fld) {
			return 0;
		} else if (var0.av() && var1 > var0.aa_fld) {
			return var0.ap_fld.size();
		} else {
			if (!var0.ap_fld.isEmpty()) {
				for (int var4 = 0; var4 < var0.ap_fld.size(); var4++) {
					zj var5 = (zj)(zj)var0.ap_fld.get(var4);
					if (var2 <= var5.az_fld + ae(var0, 1917156394)) {
						if (var2 < var5.az_fld) {
							break;
						}

						if (var1 < var5.ag_fld) {
							return var4 > 0 ? var4 - 1 : 0;
						}

						if (var4 + 1 != var0.ap_fld.size() && ((zj)var0.ap_fld.get(1 + var4)).az_fld * 1209571599 != var5.az_fld) {
							int var6 = var0.bl((zj)var0.ap_fld.get(var4), false);
							if (var1 < var5.ag_fld + var6) {
								return var4;
							}

							if (var2 <= var5.az_fld + ae(var0, 1917156394)) {
								return var4 + 1;
							}
						}
					}
				}

				zj var7 = (zj)(zj)var0.ap_fld.get(var0.ap_fld.size() - 1);
				if (var1 >= var7.ag_fld && var1 <= var7.ag_fld + var0.ac() && var2 >= var7.az_fld && var2 <= var7.az_fld + ae(var0, 1917156394)) {
					return var0.ap_fld.size() - 1;
				}
			}

			return var0.ap_fld.size();
		}
	}

	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int dv(int var1) {
		return this.aq(var1, var1 + 1, 953880360);
	}

	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int dt(int var1) {
		return this.aq(var1, var1 + 1, -480064075);
	}

	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	public int dm(int var1, int var2) {
		if (var2 < var1) {
			int var3 = var2;
			var2 = var1;
			var1 = var3;
		}

		this.ap_fld.subList(var1, var2).clear();
		int var5 = var1;
		if (this.av() && this.at_fld == 1) {
			while (var5 > 0) {
				char var4 = ((zj)this.ap_fld.get(--var5)).ak_fld;
				if (1233675439 == var4 || '\t' == var4) {
					break;
				}
			}
		}

		this.bf(var5, var2, -1028220632);
		return var1;
	}

	@ObfuscatedName("vd")
	@ObfuscatedSignature(
		descriptor = "(Lzg;IIB)I"
	)
	public static int vd(zg var0, int var1, int var2, byte var3) {
		if (var0 == null) {
			throw new NullPointerException();
		} else if (null != var0.ab_fld && !var0.az(1939769251) && var1 <= var0.ap_fld.size()) {
			byte var4;
			if (var2 > 0) {
				var4 = 1;
			} else {
				var4 = -1;
				var2 = -var2;
			}

			int var5 = 0;
			int var6 = 0;
			if (var1 > 0) {
				zj var7 = (zj)(zj)var0.ap_fld.get(var1 - 1);
				var5 = var7.ag_fld + ge(var0, var1 - 1, (byte)42);
				var6 = var7.az_fld;
			} else if (var4 == -1 && var1 == 0) {
				return 0;
			}

			int var15 = 16777215;
			int var8 = 0;
			int var9 = var1;
			int var10 = 16777215;
			int var11 = var4 == 1 ? var0.ap_fld.size() + 1 : 0;

			for (int var12 = var1 + var4; var11 != var12; var12 += var4) {
				zj var13 = (zj)(zj)var0.ap_fld.get(var12 - 1);
				if (var13.az_fld != var6) {
					var8++;
					var6 = var13.az_fld;
					if (var8 > var2) {
						return var9;
					}
				}

				if (var2 == var8) {
					int var14 = Math.abs(var13.ag_fld + ge(var0, var12 - 1, (byte)-108) - var5);
					if (var14 >= var10) {
						return var9;
					}

					var9 = var12;
					var10 = var14;
				}
			}

			if (1 == var4) {
				return var0.ap_fld.size();
			} else {
				if (var6 != 0) {
					var8++;
				}

				return var10 == 16777215 || var8 == var2 && var5 < var10 ? 0 : var9;
			}
		} else {
			return 0;
		}
	}

	@ObfuscatedName("wn")
	@ObfuscatedSignature(
		descriptor = "(Lzg;IZ)I"
	)
	public static int wn(zg var0, int var1, boolean var2) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			if (var1 < var0.ap_fld.size()) {
				int var4 = ((zj)var0.ap_fld.get(var1)).az_fld * 1209571599;

				for (int var5 = var1; var5 > 0; var5--) {
					if (((zj)var0.ap_fld.get(var5 - 1)).az_fld * 1209571599 < var4) {
						if (!var2) {
							return var5;
						}

						var2 = false;
						var4 = ((zj)var0.ap_fld.get(var5 - 1)).az_fld * 1209571599;
					}
				}
			}

			return 0;
		}
	}

	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	public int dq(int var1, int var2) {
		if (var2 < var1) {
			int var3 = var2;
			var2 = var1;
			var1 = var3;
		}

		this.ap_fld.subList(var1, var2).clear();
		int var5 = var1;
		if (this.av() && this.at_fld == 1) {
			while (var5 > 0) {
				char var4 = ((zj)this.ap_fld.get(--var5)).ak_fld;
				if (' ' == var4 || '\t' == var4) {
					break;
				}
			}
		}

		this.bf(var5, var2, -1967324677);
		return var1;
	}

	@ObfuscatedName("fk")
	@ObfuscatedSignature(
		descriptor = "(IZ)I"
	)
	int fk(int var1, boolean var2) {
		if (var1 < this.ap_fld.size()) {
			int var3 = ((zj)this.ap_fld.get(var1)).az_fld * 1209571599;

			for (int var4 = var1; var4 < this.ap_fld.size() - 1; var4++) {
				if (((zj)this.ap_fld.get(1 + var4)).az_fld * 1209571599 > var3) {
					if (!var2) {
						return var4;
					}

					var2 = false;
					var3 = ((zj)this.ap_fld.get(var4 + 1)).az_fld * 1209571599;
				}
			}
		}

		return this.ap_fld.size();
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(I)Lzj;"
	)
	public zj bt(int var1) {
		return (zj)(zj)this.ap_fld.get(var1);
	}

	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	public int dl(int var1, int var2) {
		if (null == this.ab_fld) {
			return 0;
		} else if (this.av() && var1 > this.aa_fld) {
			return this.ap_fld.size();
		} else {
			if (!this.ap_fld.isEmpty()) {
				for (int var3 = 0; var3 < this.ap_fld.size(); var3++) {
					zj var4 = (zj)(zj)this.ap_fld.get(var3);
					if (var2 <= var4.az_fld + ae(this, 1917156394)) {
						if (var2 < var4.az_fld) {
							break;
						}

						if (var1 < var4.ag_fld) {
							return var3 > 0 ? var3 - 1 : 0;
						}

						if (var3 + 1 != this.ap_fld.size() && ((zj)this.ap_fld.get(1 + var3)).az_fld * 1540516083 != var4.az_fld) {
							int var5 = this.bl((zj)this.ap_fld.get(var3), false);
							if (var1 < var4.ag_fld + var5) {
								return var3;
							}

							if (var2 <= var4.az_fld + ae(this, 1917156394)) {
								return var3 + 1;
							}
						}
					}
				}

				zj var6 = (zj)(zj)this.ap_fld.get(this.ap_fld.size() - 1);
				if (var1 >= var6.ag_fld && var1 <= var6.ag_fld + this.ac() && var2 >= var6.az_fld && var2 <= var6.az_fld + ae(this, 1917156394)) {
					return this.ap_fld.size() - 1;
				}
			}

			return this.ap_fld.size();
		}
	}

	@ObfuscatedName("yt")
	@ObfuscatedSignature(
		descriptor = "(Lzg;CIIB)Lzw;"
	)
	public static zw yt(zg var0, char var1, int var2, int var3, byte var4) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.au(Character.toString(var1), var2, var3);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lzg;I)I"
	)
	public static int ae(zg var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.ad_fld;
		}
	}

	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	public int dr(int var1, int var2) {
		if (null != this.ab_fld && !this.az(1939769251) && var1 <= this.ap_fld.size()) {
			byte var3;
			if (var2 > 0) {
				var3 = 1;
			} else {
				var3 = -1;
				var2 = -var2;
			}

			int var4 = 0;
			int var5 = 0;
			if (var1 > 0) {
				zj var6 = (zj)(zj)this.ap_fld.get(var1 - 1);
				var4 = var6.ag_fld + ge(this, var1 - 1, (byte)-76);
				var5 = var6.az_fld;
			} else if (var3 == -1 && var1 == 0) {
				return 0;
			}

			int var14 = 16777215;
			int var7 = 0;
			int var8 = var1;
			int var9 = 16777215;
			int var10 = var3 == 1 ? this.ap_fld.size() + 1 : 0;

			for (int var11 = var1 + var3; var10 != var11; var11 += var3) {
				zj var12 = (zj)(zj)this.ap_fld.get(var11 - 1);
				if (var12.az_fld != var5) {
					var7++;
					var5 = var12.az_fld;
					if (var7 > var2) {
						return var8;
					}
				}

				if (var2 == var7) {
					int var13 = Math.abs(var12.ag_fld + ge(this, var11 - 1, (byte)-117) - var4);
					if (var13 >= var9) {
						return var8;
					}

					var8 = var11;
					var9 = var13;
				}
			}

			if (1 == var3) {
				return this.ap_fld.size();
			} else {
				if (var5 != 0) {
					var7++;
				}

				return var9 != 16777215 && (var7 != var2 || var4 >= var9) ? var8 : 0;
			}
		} else {
			return 0;
		}
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)Lzw;"
	)
	public zw cu(String var1, int var2, int var3) {
		if (false) {
			var3 = Integer.MAX_VALUE;
		}

		int var4 = var2;
		if (this.ap_fld.size() >= var3) {
			this.bf(var2, var2, -1117243638);
			return new zw(var2, true);
		} else {
			this.ap_fld.ensureCapacity(this.ap_fld.size() + var1.length());

			for (int var5 = 0; var5 < var1.length() && this.ap_fld.size() < var3; var5++) {
				zj var6 = new zj();
				var6.ak_fld = var1.charAt(var5);
				this.ap_fld.add(var4, var6);
				var4++;
			}

			this.bf(var2, var4, -1327843729);
			if (0 != this.ai_fld && this.aj() > this.ai_fld) {
				while (var2 != var4) {
					qn(this, --var4, (byte)-30);
					if (this.aj() <= this.ai_fld) {
						break;
					}
				}

				return new zw(var4, true);
			} else {
				return new zw(var4, false);
			}
		}
	}

	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ds() {
		return this.ad_fld;
	}

	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int du() {
		return this.ab() / this.ab_fld.ap_fld;
	}

	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int db() {
		return this.az(1939769251) ? 0 : this.bl((zj)this.ap_fld.get(this.ap_fld.size() - 1), false);
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(I)Lzj;"
	)
	public zj bi(int var1) {
		return (zj)(zj)this.ap_fld.get(var1);
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "()Lzj;"
	)
	zj bw() {
		return this.ap_fld.isEmpty() ? null : (zj)this.ap_fld.get(this.ap_fld.size() - 1);
	}

	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void di(int var1) {
		if (this.ab_fld != null && var1 < 2 * this.ab_fld.ap_fld) {
			var1 = Integer.MAX_VALUE;
		}

		if (this.aa_fld != var1) {
			this.aa_fld = var1;
			vf(this, (byte)0);
		}
	}

	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int df() {
		return this.ai_fld;
	}

	@ObfuscatedName("eh")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int eh(int var1) {
		return var1 < this.ap_fld.size() ? this.bl((zj)this.ap_fld.get(var1), false) : 0;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ab() {
		return this.az(1939769251) ? 0 : this.ab_fld.ap_fld + ((zj)this.ap_fld.get(this.ap_fld.size() - 1)).az_fld * 1209571599;
	}

	@ObfuscatedName("es")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void es(int var1) {
		if (this.ai_fld != var1) {
			this.ai_fld = var1;
			vf(this, (byte)0);
		}
	}

	@ObfuscatedName("et")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int et() {
		return this.at_fld;
	}

	@ObfuscatedName("rg")
	@ObfuscatedSignature(
		descriptor = "(Lzg;I)V"
	)
	public static void rg(zg var0, int var1) {
		if (var0.ai_fld != var1) {
			var0.ai_fld = var1;
			vf(var0, (byte)0);
		}
	}

	@ObfuscatedName("ew")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ew() {
		return this.at_fld;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lzg;I)V"
	)
	public static void af(zg var0, int var1) {
		if (var1 != var0.ad_fld) {
			var0.ad_fld = var1 * 315126422;
			vf(var0, (byte)0);
		}
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int br() {
		return this.at_fld;
	}

	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void ez(int var1) {
		if (this.at_fld != var1) {
			this.at_fld = var1;
			vf(this, (byte)0);
		}
	}

	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int dp() {
		return this.ai_fld;
	}

	@ObfuscatedName("en")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int en() {
		return this.ac_fld;
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(CII)Lzw;"
	)
	public zw cm(char var1, int var2, int var3) {
		return this.au(Character.toString(var1), var2, var3);
	}

	@ObfuscatedName("fa")
	@ObfuscatedSignature(
		descriptor = "(II)Lve;"
	)
	ve fa(int var1, int var2) {
		int var3 = Math.min(var1, var2);
		int var4 = Math.max(var1, var2);
		int var5 = this.ap_fld.size();
		if (0 == var3 && var4 == var5) {
			return new ve(0, var5);
		} else {
			int var6 = wn(this, var3, false);
			int var7 = this.bp(var4, false);
			switch (951780304 * this.am_fld) {
				case 0:
					if (0 == this.aq_fld) {
						return new ve(var6, var5);
					}

					int var9 = wn(this, var3, true);
					return new ve(var9, var5);
				case 1:
					return new ve(0, var5);
				case 2:
					if (2 == this.aq_fld) {
						return new ve(0, var7);
					}

					int var8 = this.bp(var4, true);
					return new ve(0, var8);
				default:
					return new ve(0, var5);
			}
		}
	}

	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	public int da(int var1, int var2) {
		if (null != this.ab_fld && !this.az(1939769251) && var1 <= this.ap_fld.size()) {
			byte var3;
			if (var2 > 0) {
				var3 = 1;
			} else {
				var3 = -1;
				var2 = -var2;
			}

			int var4 = 0;
			int var5 = 0;
			if (var1 > 0) {
				zj var6 = (zj)(zj)this.ap_fld.get(var1 - 1);
				var4 = var6.ag_fld + ge(this, var1 - 1, (byte)-104);
				var5 = var6.az_fld;
			} else if (var3 == -1 && var1 == 0) {
				return 0;
			}

			int var14 = 16777215;
			int var7 = 0;
			int var8 = var1;
			int var9 = 16777215;
			int var10 = var3 == 1 ? this.ap_fld.size() + 1 : 0;

			for (int var11 = var1 + var3; var10 != var11; var11 += var3) {
				zj var12 = (zj)(zj)this.ap_fld.get(var11 - 1);
				if (var12.az_fld != var5) {
					var7++;
					var5 = var12.az_fld;
					if (var7 > var2) {
						return var8;
					}
				}

				if (var2 == var7) {
					int var13 = Math.abs(var12.ag_fld + ge(this, var11 - 1, (byte)3) - var4);
					if (var13 >= var9) {
						return var8;
					}

					var8 = var11;
					var9 = var13;
				}
			}

			if (1 == var3) {
				return this.ap_fld.size();
			} else {
				if (var5 != 0) {
					var7++;
				}

				return var9 != 16777215 && (var7 != var2 || var4 >= var9) ? var8 : 0;
			}
		} else {
			return 0;
		}
	}

	@ObfuscatedName("ev")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ev() {
		this.bf(0, this.ap_fld.size(), -1882049745);
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void bm(int var1) {
		if (var1 != this.ac_fld) {
			this.ac_fld = var1;
			vf(this, (byte)0);
		}
	}

	@ObfuscatedName("el")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void el(int var1, int var2) {
		if (!this.az(1939769251) && this.ab_fld != null) {
			ve var3 = this.bx(var1, var2);
			boolean var4 = (Integer)var3.ak_fld == 0 && (Integer)var3.ag_fld == this.ap_fld.size();
			int var5 = (Integer)var3.ak_fld;
			int var6 = 0;
			int var7 = var4 ? 0 : ((zj)this.ap_fld.get((Integer)var3.ak_fld)).az_fld * 2076969144;
			int var8 = 0;

			for (int var9 = (Integer)var3.ak_fld; var9 <= (Integer)var3.ag_fld; var9++) {
				boolean var10 = var9 >= this.ap_fld.size();
				zj var11 = (zj)(zj)this.ap_fld.get(!var10 ? var9 : this.ap_fld.size() - 1);
				int var12 = !var10 ? this.bl(var11, false) : 0;
				boolean var13 = !var10 && '\n' == var11.ak_fld;
				boolean var14 = !var10 && this.av() && var12 + var6 > this.aa_fld;
				if (var13 || var14 || var10) {
					int var15 = var9;
					int var16 = 0;
					if (var14) {
						int var17 = 0;
						if (this.at_fld == 1) {
							for (int var18 = var9; var18 > var5; var18--) {
								zj var19 = (zj)(zj)this.ap_fld.get(var18);
								var17 += var18 < var15 ? this.bl(var19, false) : 0;
								if (var19.ak_fld == ' ' || var19.ak_fld == '\n') {
									var15 = var18;
									var6 -= var17;
									var16 = var17;
									break;
								}
							}
						}
					}

					int var25 = -this.bh(var6);

					for (int var26 = var5; var26 < var15; var26++) {
						zj var27 = (zj)(zj)this.ap_fld.get(var26);
						int var20 = this.bl(var27, false);
						var27.ag_fld = var25 * 821755820;
						var27.az_fld = var7 * -832734692;
						var25 += var20;
					}

					var5 = var15;
					var6 = var16;
					var7 += ae(this, 1917156394);
					var8++;
				}

				var6 += !var10 ? var12 : 0;
			}

			if (650795175 * this.am_fld != 0 && var4) {
				int var21 = var8 * ae(this, 1917156394);
				int var22 = this.bk(var21);

				for (int var23 = 0; var23 < this.ap_fld.size(); var23++) {
					zj var24 = (zj)(zj)this.ap_fld.get(var23);
					var24.az_fld -= var22 * 1412716604;
				}
			}
		}
	}

	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int eg() {
		return this.ac_fld;
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(Lzg;)I"
	)
	public static int ct(zg var0) {
		return var0.ad_fld;
	}

	@ObfuscatedName("ej")
	@ObfuscatedSignature(
		descriptor = "(Lzj;Z)I"
	)
	int ej(zj var1, boolean var2) {
		if ('\n' == var1.ak_fld) {
			return 0;
		} else if (!var2 && -150151619 * this.ac_fld != 0) {
			return this.ab_fld.br_fld[42];
		} else {
			int var3 = this.ab_fld.br_fld[var1.ak_fld];
			if (false) {
				return var1.ak_fld == 9 ? 3 * this.ab_fld.br_fld[32] : this.ab_fld.br_fld[1925017112];
			} else {
				return var3;
			}
		}
	}

	@ObfuscatedName("fy")
	@ObfuscatedSignature(
		descriptor = "(II)Lve;"
	)
	ve fy(int var1, int var2) {
		int var3 = Math.min(var1, var2);
		int var4 = Math.max(var1, var2);
		int var5 = this.ap_fld.size();
		if (0 == var3 && var4 == var5) {
			return new ve(0, var5);
		} else {
			int var6 = wn(this, var3, false);
			int var7 = this.bp(var4, false);
			switch (this.am_fld) {
				case 0:
					if (0 == this.aq_fld) {
						return new ve(var6, var5);
					}

					int var9 = wn(this, var3, true);
					return new ve(var9, var5);
				case 1:
					return new ve(0, var5);
				case 2:
					if (2 == this.aq_fld) {
						return new ve(0, var7);
					}

					int var8 = this.bp(var4, true);
					return new ve(0, var8);
				default:
					return new ve(0, var5);
			}
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void ar(int var1) {
		if (this.at_fld != var1) {
			this.at_fld = var1;
			vf(this, (byte)0);
		}
	}

	@ObfuscatedName("pf")
	@ObfuscatedSignature(
		descriptor = "(Lzg;I)I"
	)
	public static int pf(zg var0, int var1) {
		switch (var0.aq_fld) {
			case 0:
				return 0;
			case 1:
				return var1 / 2;
			case 2:
				return var1;
			default:
				return 0;
		}
	}

	@ObfuscatedName("fo")
	@ObfuscatedSignature(
		descriptor = "(II)Lve;"
	)
	ve fo(int var1, int var2) {
		int var3 = Math.min(var1, var2);
		int var4 = Math.max(var1, var2);
		int var5 = this.ap_fld.size();
		if (0 == var3 && var4 == var5) {
			return new ve(0, var5);
		} else {
			int var6 = wn(this, var3, false);
			int var7 = this.bp(var4, false);
			switch (this.am_fld) {
				case 0:
					if (0 == this.aq_fld) {
						return new ve(var6, var5);
					}

					int var9 = wn(this, var3, true);
					return new ve(var9, var5);
				case 1:
					return new ve(0, var5);
				case 2:
					if (2 == this.aq_fld) {
						return new ve(0, var7);
					}

					int var8 = this.bp(var4, true);
					return new ve(0, var8);
				default:
					return new ve(0, var5);
			}
		}
	}

	@ObfuscatedName("ev")
	@ObfuscatedSignature(
		descriptor = "(Lzg;)I"
	)
	public static int ev(zg var0) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.az(1939769251) ? 0 : var0.ab_fld.ap_fld + ((zj)var0.ap_fld.get(var0.ap_fld.size() - 1)).az_fld * 1209571599;
	}

	@ObfuscatedName("uf")
	@ObfuscatedSignature(
		descriptor = "(Lzg;I)V"
	)
	public static void uf(zg var0, int var1) {
		if (var0.at_fld != var1) {
			var0.at_fld = var1 * -155014954;
			vf(var0, (byte)0);
		}
	}

	@ObfuscatedName("fp")
	@ObfuscatedSignature(
		descriptor = "(II)Lve;"
	)
	ve fp(int var1, int var2) {
		int var3 = Math.min(var1, var2);
		int var4 = Math.max(var1, var2);
		int var5 = this.ap_fld.size();
		if (0 == var3 && var4 == var5) {
			return new ve(0, var5);
		} else {
			int var6 = wn(this, var3, false);
			int var7 = this.bp(var4, false);
			switch (this.am_fld) {
				case 0:
					if (0 == this.aq_fld) {
						return new ve(var6, var5);
					}

					int var9 = wn(this, var3, true);
					return new ve(var9, var5);
				case 1:
					return new ve(0, var5);
				case 2:
					if (2 == this.aq_fld) {
						return new ve(0, var7);
					}

					int var8 = this.bp(var4, true);
					return new ve(0, var8);
				default:
					return new ve(0, var5);
			}
		}
	}

	@ObfuscatedName("fx")
	@ObfuscatedSignature(
		descriptor = "(IZ)I"
	)
	int fx(int var1, boolean var2) {
		if (var1 < this.ap_fld.size()) {
			int var3 = ((zj)this.ap_fld.get(var1)).az_fld * -1458229652;

			for (int var4 = var1; var4 > 0; var4--) {
				if (((zj)this.ap_fld.get(var4 - 1)).az_fld * -517924461 < var3) {
					if (!var2) {
						return var4;
					}

					var2 = false;
					var3 = ((zj)this.ap_fld.get(var4 - 1)).az_fld * 1627571314;
				}
			}
		}

		return 0;
	}

	@ObfuscatedName("fv")
	@ObfuscatedSignature(
		descriptor = "(IZ)I"
	)
	int fv(int var1, boolean var2) {
		if (var1 < this.ap_fld.size()) {
			int var3 = ((zj)this.ap_fld.get(var1)).az_fld * 1209571599;

			for (int var4 = var1; var4 > 0; var4--) {
				if (((zj)this.ap_fld.get(var4 - 1)).az_fld * 1209571599 < var3) {
					if (!var2) {
						return var4;
					}

					var2 = false;
					var3 = ((zj)this.ap_fld.get(var4 - 1)).az_fld * 1209571599;
				}
			}
		}

		return 0;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ae() {
		return this.ap_fld.size();
	}

	@ObfuscatedName("xi")
	@ObfuscatedSignature(
		descriptor = "(Lzg;II)Lzr;"
	)
	public static zr xi(zg var0, int var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var2 == var1) {
			return new zr(var0, 0, 0);
		} else if (var1 > var0.ap_fld.size() || var2 > var0.ap_fld.size()) {
			return new zr(var0, 0, 0);
		} else {
			return var2 < var1 ? new zr(var0, var2, var1) : new zr(var0, var1, var2);
		}
	}

	@ObfuscatedName("vf")
	@ObfuscatedSignature(
		descriptor = "(Lzg;B)V"
	)
	public static void vf(zg var0, byte var1) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.bf(0, var0.ap_fld.size(), -1211464258);
		}
	}

	@ObfuscatedName("fb")
	@ObfuscatedSignature(
		descriptor = "(IZ)I"
	)
	int fb(int var1, boolean var2) {
		if (var1 < this.ap_fld.size()) {
			int var3 = ((zj)this.ap_fld.get(var1)).az_fld * -962278162;

			for (int var4 = var1; var4 < this.ap_fld.size() - 1; var4++) {
				if (((zj)this.ap_fld.get(1 + var4)).az_fld * 1209571599 > var3) {
					if (!var2) {
						return var4;
					}

					var2 = false;
					var3 = ((zj)this.ap_fld.get(var4 + 1)).az_fld * -458684336;
				}
			}
		}

		return this.ap_fld.size();
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(Lzv;)V"
	)
	public void cp(zv var1) {
		if (var1 != this.ab_fld) {
			this.ab_fld = var1;
			if (this.ab_fld != null) {
				if (this.ad_fld == 0) {
					this.ad_fld = this.ab_fld.ap_fld;
				}

				if (!this.az(1939769251)) {
					vf(this, (byte)0);
				}
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Lzj;"
	)
	zj ag(int var1) {
		return (zj)(zj)this.ap_fld.get(var1);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Lzw;"
	)
	public zw an(String var1, int var2) {
		return this.au(var1, this.ap_fld.size(), var2);
	}

	@ObfuscatedName("vw")
	@ObfuscatedSignature(
		descriptor = "(Lzg;IZ)I"
	)
	public static int vw(zg var0, int var1, boolean var2) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var1 < var0.ap_fld.size()) {
			int var3 = ((zj)var0.ap_fld.get(var1)).az_fld * 1209571599;

			for (int var4 = var1; var4 < var0.ap_fld.size() - 1; var4++) {
				if (((zj)var0.ap_fld.get(1 + var4)).az_fld * 1209571599 > var3) {
					if (!var2) {
						return var4;
					}

					var2 = false;
					var3 = ((zj)var0.ap_fld.get(var4 + 1)).az_fld * 1209571599;
				}
			}
		}

		return var0.ap_fld.size();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lzv;I)V"
	)
	public void ay(zv var1, int var2) {
		if (var1 != this.ab_fld) {
			this.ab_fld = var1;
			if (this.ab_fld != null) {
				if (1080326391 * this.aa_fld == 0) {
					this.ad_fld = this.ab_fld.ap_fld;
				}

				if (!this.az(1939769251)) {
					if (var2 >= -211521517) {
						return;
					}

					vf(this, (byte)0);
				}
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(III)Lzr;"
	)
	public zr af(int var1, int var2, int var3) {
		if (var2 == var1) {
			return new zr(this, 0, 0);
		} else if (var1 > this.ap_fld.size() || var2 > this.ap_fld.size()) {
			return new zr(this, 0, 0);
		} else {
			return var2 < var1 ? new zr(this, var2, var1) : new zr(this, var1, var2);
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(CIIB)Lzw;"
	)
	public zw al(char var1, int var2, int var3, byte var4) {
		return this.au(Character.toString(var1), var2, var3);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IB)I"
	)
	public int ai(int var1, byte var2) {
		return this.aq(var1, var1 + 1, 187780670);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIB)I"
	)
	public int am(int var1, int var2, byte var3) {
		if (null == this.ab_fld) {
			return 0;
		} else if (this.av() && var1 > this.ai_fld) {
			return this.ap_fld.size();
		} else {
			if (!this.ap_fld.isEmpty()) {
				for (int var4 = 0; var4 < this.ap_fld.size(); var4++) {
					zj var5 = (zj)(zj)this.ap_fld.get(var4);
					if (var2 <= var5.az_fld + ae(this, 1917156394)) {
						if (var2 < var5.az_fld) {
							break;
						}

						if (var1 < var5.ag_fld) {
							return var4 > 0 ? var4 - 1 : 0;
						}

						if (var4 + 1 != this.ap_fld.size() && ((zj)this.ap_fld.get(1 + var4)).az_fld * 1209571599 != var5.az_fld) {
							int var6 = this.bl((zj)this.ap_fld.get(var4), false);
							if (var1 < var5.ag_fld + var6) {
								return var4;
							}

							if (var2 <= var5.az_fld + ae(this, 1917156394)) {
								return var4 + 1;
							}
						}
					}
				}

				zj var7 = (zj)(zj)this.ap_fld.get(this.ap_fld.size() - 1);
				if (var1 >= var7.az_fld && var1 <= var7.ag_fld + this.ac() && var2 >= var7.ag_fld && var2 <= var7.az_fld + ae(this, 1917156394)) {
					return this.ap_fld.size() - 1;
				}
			}

			return this.ap_fld.size();
		}
	}

	@ObfuscatedName("gv")
	@ObfuscatedSignature(
		descriptor = "(Lzg;Lzv;I)V"
	)
	public static void gv(zg var0, zv var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var1 != var0.ab_fld) {
			var0.ab_fld = var1;
			if (var0.ab_fld != null) {
				if (var0.ad_fld == 0) {
					var0.ad_fld = var0.ab_fld.ap_fld;
				}

				if (!var0.az(1939769251)) {
					if (var2 >= -211521517) {
						return;
					}

					vf(var0, (byte)0);
				}
			}
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IIB)I"
	)
	public int ad(int var1, int var2, byte var3) {
		if (null != this.ab_fld && !this.az(1939769251) && var1 <= this.ap_fld.size()) {
			byte var4;
			if (var2 > 0) {
				var4 = 1;
			} else {
				var4 = -1;
				var2 = -var2;
			}

			int var5 = 0;
			int var6 = 0;
			if (var1 > 0) {
				zj var7 = (zj)(zj)this.ap_fld.get(var1 - 1);
				var5 = var7.az_fld + ge(this, var1 - 1, (byte)42);
				var6 = var7.az_fld;
			} else if (var4 == -1 && var1 == 0) {
				return 0;
			}

			int var15 = 16777215;
			int var8 = 0;
			int var9 = var1;
			int var10 = 16777215;
			int var11 = var4 == 1 ? this.ap_fld.size() + 1 : 0;

			for (int var12 = var1 + var4; var11 != var12; var12 += var4) {
				zj var13 = (zj)(zj)this.ap_fld.get(var12 - 1);
				if (var13.ag_fld != var6) {
					var8++;
					var6 = var13.ag_fld * 1209571599;
					if (var8 > var2) {
						return var9;
					}
				}

				if (var2 == var8) {
					int var14 = Math.abs(var13.ag_fld + ge(this, var12 - 1, (byte)-108) - var5);
					if (var14 >= var10) {
						return var9;
					}

					var9 = var12;
					var10 = var14;
				}
			}

			if (1 == var4) {
				return this.ap_fld.size();
			} else {
				if (var6 != 0) {
					var8++;
				}

				return var10 == 16777215 || var8 == var2 && var5 < var10 ? 0 : var9;
			}
		} else {
			return 0;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int ap(int var1) {
		return this.at_fld;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	void bj(byte var1) {
		this.bf(0, this.ap_fld.size(), -1211464258);
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(IB)I"
	)
	int by(int var1, byte var2) {
		return var1 < this.ap_fld.size() ? this.bl((zj)this.ap_fld.get(var1), false) : 0;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(IZI)I"
	)
	int bo(int var1, boolean var2, int var3) {
		if (var1 < this.ap_fld.size()) {
			int var4 = ((zj)this.ap_fld.get(var1)).ag_fld * 1209571599;

			for (int var5 = var1; var5 > 0; var5--) {
				if (((zj)this.ap_fld.get(var5 - 1)).az_fld * 1209571599 < var4) {
					if (!var2) {
						return var5;
					}

					var2 = false;
					var4 = ((zj)this.ap_fld.get(var5 - 1)).ag_fld * 1209571599;
				}
			}
		}

		return 0;
	}

	@ObfuscatedName("eb")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int eb() {
		return this.aa_fld;
	}
}
