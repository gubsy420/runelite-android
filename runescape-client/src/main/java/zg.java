import java.io.EOFException;
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
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1547946271
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
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1509271129
	)
	int ai_fld = -1506230761;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 2006532901
	)
	int aq_fld = 0;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -601844119
	)
	int am_fld = 0;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1080326391
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
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1672939309
	)
	int at_fld;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1642063483
	)
	int ac_fld;

	@ObfuscatedName("rg")
	@ObfuscatedSignature(
		descriptor = "(Lzg;)V"
	)
	public static void rg(zg var0) {
		var0.bf(0, var0.ap_fld.size(), -1630173044);
	}

	@ObfuscatedName("ul")
	@ObfuscatedSignature(
		descriptor = "(Lzg;II)I"
	)
	public static int ul(zg var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		switch (var0.am_fld) {
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

	@ObfuscatedName("fj")
	@ObfuscatedSignature(
		descriptor = "(IZ)I"
	)
	int fj(int var1, boolean var2) {
		if (var1 < this.ap_fld.size()) {
			int var3 = ((zj)this.ap_fld.get(var1)).ag_fld * 1209571599;

			for (int var4 = var1; var4 < this.ap_fld.size() - 1; var4++) {
				if (((zj)this.ap_fld.get(1 + var4)).ag_fld * 1209571599 > var3) {
					if (!var2) {
						return var4;
					}

					var2 = false;
					var3 = ((zj)this.ap_fld.get(var4 + 1)).ag_fld * 1209571599;
				}
			}
		}

		return this.ap_fld.size();
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
					if (var2 <= var4.ag_fld + kd(this, 1917156394)) {
						if (var2 < var4.ag_fld) {
							break;
						}

						if (var1 < var4.az_fld) {
							return var3 > 0 ? var3 - 1 : 0;
						}

						if (var3 + 1 != this.ap_fld.size() && ((zj)this.ap_fld.get(1 + var3)).ag_fld * 1209571599 != var4.ag_fld) {
							int var5 = this.bl((zj)this.ap_fld.get(var3), false);
							if (var1 < var4.az_fld + var5) {
								return var3;
							}

							if (var2 <= var4.ag_fld + kd(this, 1917156394)) {
								return var3 + 1;
							}
						}
					}
				}

				zj var6 = (zj)(zj)this.ap_fld.get(this.ap_fld.size() - 1);
				if (var1 >= var6.az_fld && var1 <= var6.az_fld + jk(this, -2116350182) && var2 >= var6.ag_fld && var2 <= var6.ag_fld + kd(this, 1917156394)) {
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
	public int aq(int var1, int var2) {
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

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void bm(int var1, int var2) {
		if (this.ab_fld != null && var1 < 2 * this.ab_fld.ap_fld) {
			var1 = Integer.MAX_VALUE;
		}

		if (this.aa_fld != var1) {
			if (var2 == 892985171) {
				return;
			}

			this.aa_fld = var1;
			this.bj();
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Lzj;"
	)
	zj ag() {
		return this.ap_fld.isEmpty() ? null : (zj)this.ap_fld.get(this.ap_fld.size() - 1);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;"
	)
	public String ah() {
		if (this.az()) {
			return "";
		} else {
			StringBuilder var2 = new StringBuilder(this.ae());

			for (int var3 = 0; var3 < this.ae(); var3++) {
				zj var4 = this.ak(var3, -1649516577);
				var2.append(var4.ak_fld);
			}

			return var2.toString();
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lzv;I)V"
	)
	public void ay(zv var1, int var2) {
		if (var1 != this.ab_fld) {
			this.ab_fld = var1;
			if (this.ab_fld != null) {
				if (this.ad_fld == 0) {
					this.ad_fld = this.ab_fld.ap_fld;
				}

				if (!this.az()) {
					if (var2 >= -211521517) {
						return;
					}

					this.bj();
				}
			}
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(III)Z"
	)
	public boolean as(int var1, int var2) {
		if (this.aq_fld != var1 || this.am_fld != var2) {
			this.aq_fld = var1;
			this.am_fld = var2;
			this.bj();
		}

		return true;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void ar(int var1) {
		if (var1 != this.ad_fld) {
			this.ad_fld = var1;
			this.bj();
		}
	}

	public zg() {
		this.ao_fld = true;
		this.ap_fld = new ArrayList();
		this.at_fld = 0;
		this.ac_fld = 0;
	}

	@ObfuscatedName("lr")
	@ObfuscatedSignature(
		descriptor = "(Lda;I)V"
	)
	public static void lr(da var0, int var1) throws EOFException {
		qa.hs(var0.cw_fld, var1, -1254573362);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)Lzw;"
	)
	zw ax(String var1, int var2) {
		return hi(this, var1, this.ap_fld.size(), var2);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)Lzj;"
	)
	public zj ak(int var1, int var2) {
		return (zj)(zj)this.ap_fld.get(var1);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void aa() {
		this.ap_fld.clear();
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IB)I"
	)
	public int ai(int var1) {
		return this.aq(var1, var1 + 1);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIB)I"
	)
	public int am(int var1, int var2) {
		if (null == this.ab_fld) {
			return 0;
		} else if (this.av() && var1 > this.aa_fld) {
			return this.ap_fld.size();
		} else {
			if (!this.ap_fld.isEmpty()) {
				for (int var4 = 0; var4 < this.ap_fld.size(); var4++) {
					zj var5 = (zj)(zj)this.ap_fld.get(var4);
					if (var2 <= var5.ag_fld + kd(this, 1917156394)) {
						if (var2 < var5.ag_fld) {
							break;
						}

						if (var1 < var5.az_fld) {
							return var4 > 0 ? var4 - 1 : 0;
						}

						if (var4 + 1 != this.ap_fld.size() && ((zj)this.ap_fld.get(1 + var4)).ag_fld * 1209571599 != var5.ag_fld) {
							int var6 = this.bl((zj)this.ap_fld.get(var4), false);
							if (var1 < var5.az_fld + var6) {
								return var4;
							}

							if (var2 <= var5.ag_fld + kd(this, 1917156394)) {
								return var4 + 1;
							}
						}
					}
				}

				zj var7 = (zj)(zj)this.ap_fld.get(this.ap_fld.size() - 1);
				if (var1 >= var7.az_fld && var1 <= var7.az_fld + jk(this, -2116350182) && var2 >= var7.ag_fld && var2 <= var7.ag_fld + kd(this, 1917156394)) {
					return this.ap_fld.size() - 1;
				}
			}

			return this.ap_fld.size();
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IIB)I"
	)
	public int ad(int var1, int var2) {
		if (null != this.ab_fld && !this.az() && var1 <= this.ap_fld.size()) {
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
				var5 = var7.az_fld + es(this, var1 - 1, (byte)42);
				var6 = var7.ag_fld;
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
					var6 = var13.ag_fld;
					if (var8 > var2) {
						return var9;
					}
				}

				if (var2 == var8) {
					int var14 = Math.abs(var13.az_fld + es(this, var12 - 1, (byte)-108) - var5);
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

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int ao() {
		if (!this.ap_fld.isEmpty() && uf(this, (byte)0) == 1) {
			return this.ap_fld.isEmpty() ? 0 : ((zj)this.ap_fld.get(this.ap_fld.size() - 1)).az_fld * 1772748085 + jk(this, -2116350182);
		} else {
			int var2 = -1;
			int var3 = 0;

			for (int var4 = this.ap_fld.size() - 1; var4 >= 0; var4--) {
				zj var5 = (zj)(zj)this.ap_fld.get(var4);
				if (var5.ag_fld != var2) {
					int var6 = this.bl(var5, false) + var5.az_fld;
					var3 = Math.max(var6, var3);
					var2 = var5.ag_fld;
				}
			}

			return var3;
		}
	}

	@ObfuscatedName("wt")
	@ObfuscatedSignature(
		descriptor = "(Lzg;I)I"
	)
	public static int wt(zg var0, int var1) {
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

	@ObfuscatedName("es")
	@ObfuscatedSignature(
		descriptor = "(Lzg;IB)I"
	)
	public static int es(zg var0, int var1, byte var2) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var1 < var0.ap_fld.size() ? var0.bl((zj)var0.ap_fld.get(var1), false) : 0;
		}
	}

	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		descriptor = "(Lzg;Ljava/lang/String;III)Lzw;"
	)
	public static zw hi(zg var0, String var1, int var2, int var3) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			if (var3 == 0) {
				var3 = Integer.MAX_VALUE;
			}

			int var5 = var2;
			if (var0.ap_fld.size() >= var3) {
				var0.bf(var2, var2, -828033822);
				return new zw(var2, true);
			} else {
				var0.ap_fld.ensureCapacity(var0.ap_fld.size() + var1.length());

				for (int var6 = 0; var6 < var1.length() && var0.ap_fld.size() < var3; var6++) {
					zj var7 = new zj();
					var7.ak_fld = var1.charAt(var6);
					var0.ap_fld.add(var5, var7);
					var5++;
				}

				var0.bf(var2, var5, -1146535840);
				if (0 != var0.ai_fld && uf(var0, (byte)0) > var0.ai_fld) {
					while (var2 != var5) {
						var0.ai(--var5);
						if (uf(var0, (byte)0) <= var0.ai_fld) {
							break;
						}
					}

					return new zw(var5, true);
				} else {
					return new zw(var5, false);
				}
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
			this.bj();
		}
	}

	@ObfuscatedName("jk")
	@ObfuscatedSignature(
		descriptor = "(Lzg;I)I"
	)
	public static int jk(zg var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.az() ? 0 : var0.bl((zj)var0.ap_fld.get(var0.ap_fld.size() - 1), false);
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lzg;)V"
	)
	public static void an(zg var0) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ap_fld.clear();
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean cc() {
		return this.ai_fld > 1;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	public int aj() {
		return this.aa_fld;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean az() {
		return this.ap_fld.isEmpty();
	}

	@ObfuscatedName("va")
	@ObfuscatedSignature(
		descriptor = "(Lzg;CIIB)Lzw;"
	)
	public static zw va(zg var0, char var1, int var2, int var3, byte var4) {
		if (var0 == null) {
			var0.getClass();
		}

		return hi(var0, Character.toString(var1), var2, var3);
	}

	@ObfuscatedName("wk")
	@ObfuscatedSignature(
		descriptor = "(Lzg;I)I"
	)
	public static int wk(zg var0, int var1) {
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

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	public int bd() {
		return this.ai_fld;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(IB)V"
	)
	public void bz(int var1) {
		if (this.ai_fld != var1) {
			this.ai_fld = var1;
			this.bj();
		}
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(CII)Lzw;"
	)
	public zw cz(char var1, int var2, int var3) {
		return hi(this, Character.toString(var1), var2, var3);
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean bg() {
		return this.ap_fld.isEmpty();
	}

	@ObfuscatedName("rv")
	@ObfuscatedSignature(
		descriptor = "(Lzg;)Lzj;"
	)
	public static zj rv(zg var0) {
		return var0.ap_fld.isEmpty() ? null : (zj)var0.ap_fld.get(var0.ap_fld.size() - 1);
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int bs() {
		return this.ac_fld;
	}

	@ObfuscatedName("pu")
	@ObfuscatedSignature(
		descriptor = "(Lzg;)Ljava/lang/String;"
	)
	public static String pu(zg var0) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var0.az()) {
			return "";
		} else {
			StringBuilder var1 = new StringBuilder(var0.ae());

			for (int var2 = 0; var2 < var0.ae(); var2++) {
				zj var3 = var0.ak(var2, -1919594155);
				var1.append(var3.ak_fld);
			}

			return var1.toString();
		}
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(II)I"
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

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	void bj() {
		this.bf(0, this.ap_fld.size(), -1211464258);
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	void bf(int var1, int var2, int var3) {
		if (!this.az() && this.ab_fld != null) {
			ve var4 = this.bx(var1, var2);
			boolean var10000;
			if ((Integer)var4.ag_fld == 0 && (Integer)var4.ak_fld == this.ap_fld.size()) {
				if (var3 >= -613761473) {
					return;
				}

				var10000 = true;
			} else {
				var10000 = false;
			}

			boolean var5 = var10000;
			int var6 = (Integer)var4.ag_fld;
			int var7 = 0;
			int var29;
			if (var5) {
				if (var3 >= -613761473) {
					return;
				}

				var29 = 0;
			} else {
				var29 = ((zj)this.ap_fld.get((Integer)var4.ag_fld)).ag_fld * 1209571599;
			}

			int var8 = var29;
			int var9 = 0;

			for (int var10 = (Integer)var4.ag_fld; var10 <= (Integer)var4.ak_fld; var10++) {
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
						var28.az_fld = var26;
						var28.ag_fld = var8;
						var26 += var21;
					}

					var6 = var16;
					var7 = var17;
					var8 += kd(this, 1917156394);
					var9++;
				}

				var7 += !var11 ? var13 : 0;
			}

			if (this.am_fld != 0 && var5) {
				int var22 = var9 * kd(this, 1917156394);
				int var23 = ul(this, var22);

				for (int var24 = 0; var24 < this.ap_fld.size(); var24++) {
					zj var25 = (zj)(zj)this.ap_fld.get(var24);
					var25.ag_fld -= var23 * -1760086545;
				}
			}
		}
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(Lzj;ZI)I"
	)
	int bl(zj var1, boolean var2) {
		if ('\n' == var1.ak_fld) {
			return 0;
		} else if (!var2 && this.ac_fld != 0) {
			return this.ab_fld.be_fld[42];
		} else {
			int var4 = this.ab_fld.be_fld[var1.ak_fld];
			if (false) {
				return var1.ak_fld == 9 ? 3 * this.ab_fld.be_fld[32] : this.ab_fld.be_fld[32];
			} else {
				return var4;
			}
		}
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(III)Lve;"
	)
	ve bx(int var1, int var2) {
		int var4 = Math.min(var1, var2);
		int var5 = Math.max(var1, var2);
		int var6 = this.ap_fld.size();
		if (0 == var4 && var5 == var6) {
			return new ve(0, var6);
		} else {
			int var7 = this.bo(var4, false);
			int var8 = this.bp(var5, false);
			switch (this.am_fld) {
				case 0:
					if (0 == this.aq_fld) {
						return new ve(var7, var6);
					}

					int var10 = this.bo(var4, true);
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

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(IZI)I"
	)
	int bo(int var1, boolean var2) {
		if (var1 < this.ap_fld.size()) {
			int var4 = ((zj)this.ap_fld.get(var1)).ag_fld * 1209571599;

			for (int var5 = var1; var5 > 0; var5--) {
				if (((zj)this.ap_fld.get(var5 - 1)).ag_fld * 1209571599 < var4) {
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

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(IZI)I"
	)
	int bp(int var1, boolean var2) {
		if (var1 < this.ap_fld.size()) {
			int var4 = ((zj)this.ap_fld.get(var1)).ag_fld * 1209571599;

			for (int var5 = var1; var5 < this.ap_fld.size() - 1; var5++) {
				if (((zj)this.ap_fld.get(1 + var5)).ag_fld * 1209571599 > var4) {
					if (!var2) {
						return var5;
					}

					var2 = false;
					var4 = ((zj)this.ap_fld.get(var5 + 1)).ag_fld * 1209571599;
				}
			}
		}

		return this.ap_fld.size();
	}

	@ObfuscatedName("ee")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ee() {
		this.bf(0, this.ap_fld.size(), -895933781);
	}

	@ObfuscatedName("en")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int en() {
		return this.ap_fld.size();
	}

	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void dj(int var1) {
		if (this.ai_fld != var1) {
			this.ai_fld = var1;
			this.bj();
		}
	}

	@ObfuscatedName("ew")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ew() {
		return this.aa_fld;
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(I)Lzj;"
	)
	public zj bu(int var1) {
		return (zj)(zj)this.ap_fld.get(var1);
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "()Lzj;"
	)
	zj bc() {
		return this.ap_fld.isEmpty() ? null : (zj)this.ap_fld.get(this.ap_fld.size() - 1);
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "()Lzj;"
	)
	zj bq() {
		return this.ap_fld.isEmpty() ? null : (zj)this.ap_fld.get(this.ap_fld.size() - 1);
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
		descriptor = "(I)Z"
	)
	boolean av() {
		return this.ai_fld > 1;
	}

	@ObfuscatedName("jc")
	@ObfuscatedSignature(
		descriptor = "(Lep;Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	public static int jc(ep var0, Object var1, Object var2) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.ak((rr)var1, (rr)var2);
		}
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String cy() {
		if (this.az()) {
			return "";
		} else {
			StringBuilder var1 = new StringBuilder(this.ae());

			for (int var2 = 0; var2 < this.ae(); var2++) {
				zj var3 = this.ak(var2, 1027942722);
				var1.append(var3.ak_fld);
			}

			return var1.toString();
		}
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void cr(int var1) {
		if (var1 != this.ad_fld) {
			this.ad_fld = var1;
			this.bj();
		}
	}

	@ObfuscatedName("ey")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void ey(int var1, int var2) {
		if (!this.az() && this.ab_fld != null) {
			ve var3 = this.bx(var1, var2);
			boolean var4 = (Integer)var3.ag_fld == 0 && (Integer)var3.ak_fld == this.ap_fld.size();
			int var5 = (Integer)var3.ag_fld;
			int var6 = 0;
			int var7 = var4 ? 0 : ((zj)this.ap_fld.get((Integer)var3.ag_fld)).ag_fld * 1209571599;
			int var8 = 0;

			for (int var9 = (Integer)var3.ag_fld; var9 <= (Integer)var3.ak_fld; var9++) {
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
						var27.az_fld = var25;
						var27.ag_fld = var7;
						var25 += var20;
					}

					var5 = var15;
					var6 = var16;
					var7 += kd(this, 1917156394);
					var8++;
				}

				var6 += !var10 ? var12 : 0;
			}

			if (this.am_fld != 0 && var4) {
				int var21 = var8 * kd(this, 1917156394);
				int var22 = ul(this, var21);

				for (int var23 = 0; var23 < this.ap_fld.size(); var23++) {
					zj var24 = (zj)(zj)this.ap_fld.get(var23);
					var24.ag_fld -= var22 * -1760086545;
				}
			}
		}
	}

	@ObfuscatedName("pf")
	@ObfuscatedSignature(
		descriptor = "(Lzg;I)V"
	)
	public static void pf(zg var0, int var1) {
		if (var1 != var0.ad_fld) {
			var0.ad_fld = var1;
			var0.bj();
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
			this.bj();
		}

		return true;
	}

	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	public int do_(int var1, int var2) {
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

		this.bf(var5, var2, -1176631744);
		return var1;
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void cx(int var1) {
		if (var1 != this.ac_fld) {
			this.ac_fld = var1 * -445473647;
			this.bj();
		}
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(II)Lzr;"
	)
	public zr cg(int var1, int var2) {
		if (var2 == var1) {
			return new zr(this, 0, 0);
		} else if (var1 > this.ap_fld.size() || var2 > this.ap_fld.size()) {
			return new zr(this, 0, 0);
		} else {
			return var2 < var1 ? new zr(this, var2, var1) : new zr(this, var1, var2);
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

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(CII)Lzw;"
	)
	public zw cm(char var1, int var2, int var3) {
		return hi(this, Character.toString(var1), var2, var3);
	}

	@ObfuscatedName("eo")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void eo(int var1) {
		if (this.at_fld != var1) {
			this.at_fld = var1 * -1471598225;
			this.bj();
		}
	}

	@ObfuscatedName("oi")
	@ObfuscatedSignature(
		descriptor = "(Lzg;Ljava/lang/String;)Lzw;"
	)
	public static zw oi(zg var0, String var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.aa();
		return var0.ax(var1, 0);
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
			if (0 != this.ai_fld && uf(this, (byte)0) > this.ai_fld) {
				while (var2 != var4) {
					this.ai(--var4);
					if (uf(this, (byte)0) <= this.ai_fld) {
						break;
					}
				}

				return new zw(var4, true);
			} else {
				return new zw(var4, false);
			}
		}
	}

	@ObfuscatedName("em")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void em(int var1, int var2) {
		if (!this.az() && this.ab_fld != null) {
			ve var3 = this.bx(var1, var2);
			boolean var4 = (Integer)var3.ag_fld == 0 && (Integer)var3.ak_fld == this.ap_fld.size();
			int var5 = (Integer)var3.ag_fld;
			int var6 = 0;
			int var7 = var4 ? 0 : ((zj)this.ap_fld.get((Integer)var3.ag_fld)).ag_fld * 1209571599;
			int var8 = 0;

			for (int var9 = (Integer)var3.ag_fld; var9 <= (Integer)var3.ak_fld; var9++) {
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
						var27.az_fld = var25;
						var27.ag_fld = var7;
						var25 += var20;
					}

					var5 = var15;
					var6 = var16;
					var7 += kd(this, 1917156394);
					var8++;
				}

				var6 += !var10 ? var12 : 0;
			}

			if (this.am_fld != 0 && var4) {
				int var21 = var8 * kd(this, 1917156394);
				int var22 = ul(this, var21);

				for (int var23 = 0; var23 < this.ap_fld.size(); var23++) {
					zj var24 = (zj)(zj)this.ap_fld.get(var23);
					var24.ag_fld -= var22 * -1760086545;
				}
			}
		}
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(I)Lzj;"
	)
	public zj bv(int var1) {
		return (zj)(zj)this.ap_fld.get(var1);
	}

	@ObfuscatedName("kd")
	@ObfuscatedSignature(
		descriptor = "(Lzg;I)I"
	)
	public static int kd(zg var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.ad_fld;
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)Lzw;"
	)
	public zw ct(String var1) {
		this.aa();
		return this.ax(var1, 0);
	}

	@ObfuscatedName("qp")
	@ObfuscatedSignature(
		descriptor = "(Lzg;)I"
	)
	public static int qp(zg var0) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.az() ? 0 : var0.bl((zj)var0.ap_fld.get(var0.ap_fld.size() - 1), false);
	}

	@ObfuscatedName("ek")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ek() {
		this.ap_fld.clear();
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
			int var3 = ((zj)this.ap_fld.get(var1)).ag_fld * 1209571599;

			for (int var4 = var1; var4 < this.ap_fld.size() - 1; var4++) {
				if (((zj)this.ap_fld.get(1 + var4)).ag_fld * 1209571599 > var3) {
					if (!var2) {
						return var4;
					}

					var2 = false;
					var3 = ((zj)this.ap_fld.get(var4 + 1)).ag_fld * 1209571599;
				}
			}
		}

		return this.ap_fld.size();
	}

	@ObfuscatedName("zu")
	@ObfuscatedSignature(
		descriptor = "(Lzg;)I"
	)
	public static int zu(zg var0) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.az() ? 0 : var0.ab_fld.ap_fld + ((zj)var0.ap_fld.get(var0.ap_fld.size() - 1)).ag_fld * 1209571599;
		}
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(I)Lzj;"
	)
	public zj bi(int var1) {
		return (zj)(zj)this.ap_fld.get(var1);
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)Lzw;"
	)
	public zw cu(String var1, int var2, int var3) {
		if (var3 == 0) {
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
			if (0 != this.ai_fld && uf(this, (byte)0) > this.ai_fld) {
				while (var2 != var4) {
					this.ai(--var4);
					if (uf(this, (byte)0) <= this.ai_fld) {
						break;
					}
				}

				return new zw(var4, true);
			} else {
				return new zw(var4, false);
			}
		}
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(I)Lzj;"
	)
	public zj bt(int var1) {
		return (zj)(zj)this.ap_fld.get(var1);
	}

	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int du() {
		return this.ad_fld;
	}

	@ObfuscatedName("ep")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ep() {
		return this.ab() / this.ab_fld.ap_fld;
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(I)Lzj;"
	)
	public zj bn(int var1) {
		return (zj)(zj)this.ap_fld.get(var1);
	}

	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void dw(int var1) {
		if (this.ab_fld != null && var1 < 2 * this.ab_fld.ap_fld) {
			var1 = Integer.MAX_VALUE;
		}

		if (this.aa_fld != var1) {
			this.aa_fld = var1;
			this.bj();
		}
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
			this.bj();
		}
	}

	@ObfuscatedName("eb")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int eb() {
		return this.ai_fld;
	}

	@ObfuscatedName("xu")
	@ObfuscatedSignature(
		descriptor = "(Lzg;Ljava/lang/String;I)Lzw;"
	)
	public static zw xu(zg var0, String var1, int var2) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			var0.aa();
			return var0.ax(var1, 0);
		}
	}

	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int dg() {
		return this.ai_fld;
	}

	@ObfuscatedName("eh")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int eh(int var1) {
		return var1 < this.ap_fld.size() ? this.bl((zj)this.ap_fld.get(var1), false) : 0;
	}

	@ObfuscatedName("uf")
	@ObfuscatedSignature(
		descriptor = "(Lzg;B)I"
	)
	public static int uf(zg var0, byte var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.ab() / var0.ab_fld.ap_fld;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int ab() {
		return this.az() ? 0 : this.ab_fld.ap_fld + ((zj)this.ap_fld.get(this.ap_fld.size() - 1)).ag_fld * 1209571599;
	}

	@ObfuscatedName("es")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void es(int var1) {
		if (this.ai_fld != var1) {
			this.ai_fld = var1;
			this.bj();
		}
	}

	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int dp() {
		return this.at_fld;
	}

	@ObfuscatedName("et")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int et() {
		return this.at_fld;
	}

	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int eg() {
		return this.at_fld;
	}

	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ds() {
		return this.at_fld;
	}

	@ObfuscatedName("ex")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void ex(int var1) {
		if (this.at_fld != var1) {
			this.at_fld = var1 * -155014954;
			this.bj();
		}
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(I)I"
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
			this.bj();
		}
	}

	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int dn() {
		return this.ai_fld;
	}

	@ObfuscatedName("ti")
	@ObfuscatedSignature(
		descriptor = "(Lzg;Ljava/lang/String;)Lzw;"
	)
	public static zw ti(zg var0, String var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.aa();
		return var0.ax(var1, 0);
	}

	@ObfuscatedName("wb")
	@ObfuscatedSignature(
		descriptor = "(Lzg;I)V"
	)
	public static void wb(zg var0, int var1) {
		if (var0.ab_fld != null && var1 < 2 * var0.ab_fld.ap_fld) {
			var1 = Integer.MAX_VALUE;
		}

		if (var0.aa_fld != var1) {
			var0.aa_fld = var1;
			var0.bj();
		}
	}

	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int de() {
		return this.ac_fld;
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(CII)Lzw;"
	)
	public zw ck(char var1, int var2, int var3) {
		return hi(this, Character.toString(var1), var2, var3);
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
			int var6 = this.bo(var3, false);
			int var7 = this.bp(var4, false);
			switch (951780304 * this.am_fld) {
				case 0:
					if (0 == this.aq_fld) {
						return new ve(var6, var5);
					}

					int var9 = this.bo(var3, true);
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

	@ObfuscatedName("vi")
	@ObfuscatedSignature(
		descriptor = "(Lyz;)Z"
	)
	public static boolean vi(yz var0) {
		return var0.ak_fld;
	}

	@ObfuscatedName("ei")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int ei(int var1) {
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

	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	public int da(int var1, int var2) {
		if (null != this.ab_fld && !this.az() && var1 <= this.ap_fld.size()) {
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
				var4 = var6.az_fld + es(this, var1 - 1, (byte)-104);
				var5 = var6.ag_fld;
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
				if (var12.ag_fld != var5) {
					var7++;
					var5 = var12.ag_fld;
					if (var7 > var2) {
						return var8;
					}
				}

				if (var2 == var7) {
					int var13 = Math.abs(var12.az_fld + es(this, var11 - 1, (byte)3) - var4);
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

	@ObfuscatedName("jw")
	@ObfuscatedSignature(
		descriptor = "(Lzg;II)I"
	)
	public static int jw(zg var0, int var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		if (null == var0.ab_fld) {
			return 0;
		} else if (var0.av() && var1 > var0.aa_fld) {
			return var0.ap_fld.size();
		} else {
			if (!var0.ap_fld.isEmpty()) {
				for (int var3 = 0; var3 < var0.ap_fld.size(); var3++) {
					zj var4 = (zj)(zj)var0.ap_fld.get(var3);
					if (var2 <= var4.ag_fld + kd(var0, 1917156394)) {
						if (var2 < var4.ag_fld) {
							break;
						}

						if (var1 < var4.az_fld) {
							return var3 > 0 ? var3 - 1 : 0;
						}

						if (var3 + 1 != var0.ap_fld.size() && ((zj)var0.ap_fld.get(1 + var3)).ag_fld * 1540516083 != var4.ag_fld) {
							int var5 = var0.bl((zj)var0.ap_fld.get(var3), false);
							if (var1 < var4.az_fld + var5) {
								return var3;
							}

							if (var2 <= var4.ag_fld + kd(var0, 1917156394)) {
								return var3 + 1;
							}
						}
					}
				}

				zj var6 = (zj)(zj)var0.ap_fld.get(var0.ap_fld.size() - 1);
				if (var1 >= var6.az_fld && var1 <= var6.az_fld + jk(var0, -2116350182) && var2 >= var6.ag_fld && var2 <= var6.ag_fld + kd(var0, 1917156394)) {
					return var0.ap_fld.size() - 1;
				}
			}

			return var0.ap_fld.size();
		}
	}

	@ObfuscatedName("eu")
	@ObfuscatedSignature(
		descriptor = "(Lzj;Z)I"
	)
	int eu(zj var1, boolean var2) {
		if ('\n' == var1.ak_fld) {
			return 0;
		} else if (!var2 && this.ac_fld != 0) {
			return this.ab_fld.be_fld[42];
		} else {
			int var3 = this.ab_fld.be_fld[var1.ak_fld];
			if (false) {
				return var1.ak_fld == 9 ? 3 * this.ab_fld.be_fld[-394091598] : this.ab_fld.be_fld[32];
			} else {
				return var3;
			}
		}
	}

	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void dc() {
		this.bf(0, this.ap_fld.size(), -1882049745);
	}

	@ObfuscatedName("er")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void er(int var1) {
		if (this.at_fld != var1) {
			this.at_fld = var1 * 1692035052;
			this.bj();
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void aw(int var1) {
		if (var1 != this.ac_fld) {
			this.ac_fld = var1;
			this.bj();
		}
	}

	@ObfuscatedName("el")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void el(int var1, int var2) {
		if (!this.az() && this.ab_fld != null) {
			ve var3 = this.bx(var1, var2);
			boolean var4 = (Integer)var3.ag_fld == 0 && (Integer)var3.ak_fld == this.ap_fld.size();
			int var5 = (Integer)var3.ag_fld;
			int var6 = 0;
			int var7 = var4 ? 0 : ((zj)this.ap_fld.get((Integer)var3.ag_fld)).ag_fld * 2076969144;
			int var8 = 0;

			for (int var9 = (Integer)var3.ag_fld; var9 <= (Integer)var3.ak_fld; var9++) {
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
						var27.az_fld = var25 * 821755820;
						var27.ag_fld = var7 * -832734692;
						var25 += var20;
					}

					var5 = var15;
					var6 = var16;
					var7 += kd(this, 1917156394);
					var8++;
				}

				var6 += !var10 ? var12 : 0;
			}

			if (650795175 * this.am_fld != 0 && var4) {
				int var21 = var8 * kd(this, 1917156394);
				int var22 = ul(this, var21);

				for (int var23 = 0; var23 < this.ap_fld.size(); var23++) {
					zj var24 = (zj)(zj)this.ap_fld.get(var23);
					var24.ag_fld -= var22 * 1412716604;
				}
			}
		}
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int cv() {
		return this.ac_fld;
	}

	@ObfuscatedName("ej")
	@ObfuscatedSignature(
		descriptor = "(Lzj;Z)I"
	)
	int ej(zj var1, boolean var2) {
		if ('\n' == var1.ak_fld) {
			return 0;
		} else if (!var2 && -150151619 * this.ac_fld != 0) {
			return this.ab_fld.be_fld[42];
		} else {
			int var3 = this.ab_fld.be_fld[var1.ak_fld];
			if (false) {
				return var1.ak_fld == 9 ? 3 * this.ab_fld.be_fld[32] : this.ab_fld.be_fld[1925017112];
			} else {
				return var3;
			}
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void be(int var1) {
		if (this.at_fld != var1) {
			this.at_fld = var1;
			this.bj();
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
			int var6 = this.bo(var3, false);
			int var7 = this.bp(var4, false);
			switch (this.am_fld) {
				case 0:
					if (0 == this.aq_fld) {
						return new ve(var6, var5);
					}

					int var9 = this.bo(var3, true);
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
			int var6 = this.bo(var3, false);
			int var7 = this.bp(var4, false);
			switch (this.am_fld) {
				case 0:
					if (0 == this.aq_fld) {
						return new ve(var6, var5);
					}

					int var9 = this.bo(var3, true);
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
			int var3 = ((zj)this.ap_fld.get(var1)).ag_fld * -1458229652;

			for (int var4 = var1; var4 > 0; var4--) {
				if (((zj)this.ap_fld.get(var4 - 1)).ag_fld * -517924461 < var3) {
					if (!var2) {
						return var4;
					}

					var2 = false;
					var3 = ((zj)this.ap_fld.get(var4 - 1)).ag_fld * 1627571314;
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
			int var3 = ((zj)this.ap_fld.get(var1)).ag_fld * 1209571599;

			for (int var4 = var1; var4 > 0; var4--) {
				if (((zj)this.ap_fld.get(var4 - 1)).ag_fld * 1209571599 < var3) {
					if (!var2) {
						return var4;
					}

					var2 = false;
					var3 = ((zj)this.ap_fld.get(var4 - 1)).ag_fld * 1209571599;
				}
			}
		}

		return 0;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int ae() {
		return this.ap_fld.size();
	}

	@ObfuscatedName("fb")
	@ObfuscatedSignature(
		descriptor = "(IZ)I"
	)
	int fb(int var1, boolean var2) {
		if (var1 < this.ap_fld.size()) {
			int var3 = ((zj)this.ap_fld.get(var1)).ag_fld * -962278162;

			for (int var4 = var1; var4 < this.ap_fld.size() - 1; var4++) {
				if (((zj)this.ap_fld.get(1 + var4)).ag_fld * 1209571599 > var3) {
					if (!var2) {
						return var4;
					}

					var2 = false;
					var3 = ((zj)this.ap_fld.get(var4 + 1)).ag_fld * -458684336;
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

				if (!this.az()) {
					this.bj();
				}
			}
		}
	}

	@ObfuscatedName("ev")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ev() {
		this.bf(0, this.ap_fld.size(), -965052253);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Lzw;"
	)
	public zw an(String var1, int var2) {
		this.aa();
		return this.ax(var1, 0);
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
		return hi(this, Character.toString(var1), var2, var3);
	}

	@ObfuscatedName("kc")
	@ObfuscatedSignature(
		descriptor = "(Lzg;III)Lzr;"
	)
	public static zr kc(zg var0, int var1, int var2) {
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

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int ap(int var1) {
		return this.az() ? 0 : this.bl((zj)this.ap_fld.get(this.ap_fld.size() - 1), false);
	}

	@ObfuscatedName("rx")
	@ObfuscatedSignature(
		descriptor = "(Lzg;Ljava/lang/String;II)Lzw;"
	)
	public static zw rx(zg var0, String var1, int var2, int var3) {
		if (var0 == null) {
			var0.getClass();
		}

		if (false) {
			var3 = 943591543;
		}

		int var4 = var2;
		if (var0.ap_fld.size() >= var3) {
			var0.bf(var2, var2, -1650916167);
			return new zw(var2, true);
		} else {
			var0.ap_fld.ensureCapacity(var0.ap_fld.size() + var1.length());

			for (int var5 = 0; var5 < var1.length() && var0.ap_fld.size() < var3; var5++) {
				zj var6 = new zj();
				var6.ak_fld = var1.charAt(var5);
				var0.ap_fld.add(var4, var6);
				var4++;
			}

			var0.bf(var2, var4, -1113742377);
			if (0 != var0.ai_fld && uf(var0, (byte)0) > var0.ai_fld) {
				while (var2 != var4) {
					var0.ai(--var4);
					if (uf(var0, (byte)0) <= var0.ai_fld) {
						break;
					}
				}

				return new zw(var4, true);
			} else {
				return new zw(var4, false);
			}
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int ac(int var1) {
		return this.az() ? 0 : this.bl((zj)this.ap_fld.get(this.ap_fld.size() - 1), false);
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	public int bk(int var1, int var2) {
		if (null == this.ab_fld) {
			return 0;
		} else if (this.av() && var1 > this.am_fld) {
			return this.ap_fld.size();
		} else {
			if (!this.ap_fld.isEmpty()) {
				for (int var3 = 0; var3 < this.ap_fld.size(); var3++) {
					zj var4 = (zj)(zj)this.ap_fld.get(var3);
					if (var2 <= var4.az_fld + kd(this, 1917156394)) {
						if (var2 < var4.az_fld) {
							break;
						}

						if (var1 < var4.az_fld) {
							return var3 > 0 ? var3 - 1 : 0;
						}

						if (var3 + 1 != this.ap_fld.size() && ((zj)this.ap_fld.get(1 + var3)).ag_fld * 1540516083 != var4.ag_fld) {
							int var5 = this.bl((zj)this.ap_fld.get(var3), false);
							if (var1 < var4.az_fld + var5) {
								return var3;
							}

							if (var2 <= var4.az_fld + kd(this, 1917156394)) {
								return var3 + 1;
							}
						}
					}
				}

				zj var6 = (zj)(zj)this.ap_fld.get(this.ap_fld.size() - 1);
				if (var1 >= var6.ag_fld && var1 <= var6.ag_fld + jk(this, -2116350182) && var2 >= var6.az_fld && var2 <= var6.ag_fld + kd(this, 1917156394)) {
					return this.ap_fld.size() - 1;
				}
			}

			return this.ap_fld.size();
		}
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(IB)I"
	)
	int by(int var1, byte var2) {
		return var1 < this.ap_fld.size() ? this.bl((zj)this.ap_fld.get(var1), false) : 0;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	public int at(byte var1) {
		return this.ap(2084038280) / this.ab_fld.ac_fld;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;III)Lzw;"
	)
	public zw au(String var1, int var2, int var3, int var4) {
		if (false) {
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
			if (0 != this.aq_fld && uf(this, (byte)0) > this.ai_fld) {
				while (var2 != var5) {
					this.ai(--var5);
					if (uf(this, (byte)0) <= this.am_fld) {
						break;
					}
				}

				return new zw(var5, true);
			} else {
				return new zw(var5, false);
			}
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lzg;I)I"
	)
	public static int ar(zg var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.aq(var1, var1 + 1);
	}

	@ObfuscatedName("tv")
	@ObfuscatedSignature(
		descriptor = "(Lzg;II)Lve;"
	)
	public static ve tv(zg var0, int var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		int var3 = Math.min(var1, var2);
		int var4 = Math.max(var1, var2);
		int var5 = var0.ap_fld.size();
		if (0 == var3 && var4 == var5) {
			return new ve(0, var5);
		} else {
			int var6 = var0.bo(var3, false);
			int var7 = var0.bp(var4, false);
			switch (var0.am_fld) {
				case 0:
					if (0 == var0.aq_fld) {
						return new ve(var6, var5);
					}

					int var9 = var0.bo(var3, true);
					return new ve(var9, var5);
				case 1:
					return new ve(0, var5);
				case 2:
					if (2 == var0.aq_fld) {
						return new ve(0, var7);
					}

					int var8 = var0.bp(var4, true);
					return new ve(0, var8);
				default:
					return new ve(0, var5);
			}
		}
	}

	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int dz(int var1) {
		return this.aq(var1, var1 + 1);
	}
}
