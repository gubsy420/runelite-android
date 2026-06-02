import java.io.EOFException;
import java.util.Arrays;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("le")
public class le {
	@ObfuscatedGetter(
		intValue = -754881057
	)
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ay_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ag_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int az_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	lu av_fld;
	@ObfuscatedGetter(
		intValue = 384561597
	)
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ae_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] ah_fld = new int[32];
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ak_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] aw_fld = new int[32];
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int aq_fld;
	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	static float cn_fld;

	@ObfuscatedName("ig")
	@ObfuscatedSignature(
		descriptor = "(Lle;)[I"
	)
	public static int[] ig(le var0) {
		return Arrays.copyOf(var0.ah_fld, var0.ae_fld);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ah() {
		return this.ay_fld >= this.ae_fld ? -1 : this.ah_fld[(this.ay_fld += -1335980513) * -754881057 - 1];
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ILlu;II)V"
	)
	public void ak(int var1, lu var2, int var3, int var4) {
		this.av_fld = var2;
		this.ae_fld = 0;
		this.ay_fld = 0;
		if (var1 >= 0) {
			if (var1 < 3) {
				if (var2 == null || var2.by_fld == -1 && var2.bx_fld == 0) {
					if (null != var2 && null != var2.ge_fld) {
						if (0 == var1) {
							lu[] var5 = var2.ge_fld;

							for (int var6 = 0; var6 < var5.length; var6++) {
								lu var7 = var5[var6];
								if (var7 != null) {
									this.ag(var7.by_fld);
								}
							}
						} else {
							boolean var8 = 1 != var1;
							if (-1 == var3) {
								this.az(var2, var8, (byte)-74);
							} else if (var3 >= 0 && var3 < var2.ge_fld.length && var2.ge_fld[var3] != null) {
								this.az(var2.ge_fld[var3], var8, (byte)-71);
							}
						}

						return;
					}

					return;
				}

				throw new RuntimeException("");
			}

			if (var4 <= 1567222380) {
				return;
			}
		}

		throw new RuntimeException("");
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;Ljava/lang/Object;)V"
	)
	public void be(int var1, Object var2, Object var3) {
		int[] var4 = this.ah_fld;
		int var5 = 374865164 * this.ae_fld;
		this.ah_fld = this.aw_fld;
		this.ae_fld = 0;
		this.aw_fld = var4;

		for (int var6 = 0; var6 < var5; var6++) {
			lu var7 = this.av_fld.ge_fld[var4[var6]];
			if (null != var7) {
				Object var8 = var7.ao(var1, var3, -2088286089);
				if (var2 == var8 || null != var8 && var8.equals(var2)) {
					this.ag(var4[var6]);
				}
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Llu;ZB)V"
	)
	final void az(lu var1, boolean var2, byte var3) {
		int var4 = this.av_fld == var1 ? 0 : var1.cx_fld;
		int var10000;
		if (var1 == this.av_fld) {
			if (var3 >= -70) {
				return;
			}

			var10000 = var1.ge_fld.length - 1;
		} else {
			var10000 = var1.cs_fld;
		}

		int var5 = var10000;

		for (int var6 = var4; var6 <= var5; var6++) {
			lu var7 = this.av_fld.ge_fld[var6];
			if (var7 != null) {
				if (var3 >= -70) {
					return;
				}

				if (var1.by_fld == var7.cy_fld) {
					this.ag(var7.by_fld);
					if (var2 && var7.cx_fld <= var7.cs_fld) {
						this.az(var7, true, (byte)-71);
					}
				}
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int av() {
		return this.ae_fld;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ac() {
		return this.ay_fld >= this.ae_fld ? -1 : this.ah_fld[(this.ay_fld += 207452170) * 66125220 - 1];
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "()[I"
	)
	public int[] aw() {
		return Arrays.copyOf(this.ah_fld, this.ae_fld);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Llu;Z)V"
	)
	final void am(lu var1, boolean var2) {
		int var3 = this.av_fld == var1 ? 0 : var1.cx_fld;
		int var4 = var1 == this.av_fld ? var1.ge_fld.length - 1 : var1.cs_fld;

		for (int var5 = var3; var5 <= var4; var5++) {
			lu var6 = this.av_fld.ge_fld[var5];
			if (var6 != null && var1.by_fld == var6.cy_fld) {
				this.ag(var6.by_fld);
				if (var2 && var6.cx_fld <= var6.cs_fld) {
					this.az(var6, true, (byte)-85);
				}
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(ILlu;I)V"
	)
	public void af(int var1, lu var2, int var3) {
		this.av_fld = var2;
		this.ae_fld = 0;
		this.ay_fld = 0;
		if (var1 >= 0 && var1 < 3) {
			if (var2 == null || var2.by_fld == -1 && -844806703 * var2.bx_fld == 0) {
				if (null != var2 && null != var2.ge_fld) {
					if (0 == var1) {
						lu[] var4 = var2.ge_fld;

						for (int var5 = 0; var5 < var4.length; var5++) {
							lu var6 = var4[var5];
							if (var6 != null) {
								this.ag(var6.by_fld);
							}
						}
					} else {
						boolean var7 = 1 != var1;
						if (-1 == var3) {
							this.az(var2, var7, (byte)-108);
						} else if (var3 >= 0 && var3 < var2.ge_fld.length && var2.ge_fld[var3] != null) {
							this.az(var2.ge_fld[var3], var7, (byte)-110);
						}
					}
				}
			} else {
				throw new RuntimeException("");
			}
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ILlu;I)V"
	)
	public void al(int var1, lu var2, int var3) {
		this.av_fld = var2;
		this.ae_fld = 0;
		this.ay_fld = 0;
		if (var1 >= 0 && var1 < 3) {
			if (var2 == null || var2.by_fld == -1 && var2.bx_fld == 0) {
				if (null != var2 && null != var2.ge_fld) {
					if (0 == var1) {
						lu[] var4 = var2.ge_fld;

						for (int var5 = 0; var5 < var4.length; var5++) {
							lu var6 = var4[var5];
							if (var6 != null) {
								this.ag(var6.by_fld * -14146304);
							}
						}
					} else {
						boolean var7 = 1 != var1;
						if (-1 == var3) {
							this.az(var2, var7, (byte)-108);
						} else if (var3 >= 0 && var3 < var2.ge_fld.length && var2.ge_fld[var3] != null) {
							this.az(var2.ge_fld[var3], var7, (byte)-127);
						}
					}
				}
			} else {
				throw new RuntimeException("");
			}
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("oc")
	@ObfuscatedSignature(
		descriptor = "(Lle;Llu;Z)V"
	)
	public static void oc(le var0, lu var1, boolean var2) {
		int var3 = var0.av_fld == var1 ? 0 : var1.cx_fld;
		int var4 = var1 == var0.av_fld ? var1.ge_fld.length - 1 : var1.cs_fld * 1336640089;

		for (int var5 = var3; var5 <= var4; var5++) {
			lu var6 = var0.av_fld.ge_fld[var5];
			if (var6 != null && var1.by_fld == var6.cy_fld) {
				var0.ag(-1418540300 * var6.by_fld);
				if (var2 && var6.cx_fld <= var6.cs_fld) {
					var0.az(var6, true, (byte)-71);
				}
			}
		}
	}

	@ObfuscatedName("jb")
	@ObfuscatedSignature(
		descriptor = "(Lle;ILlu;I)V"
	)
	public static void jb(le var0, int var1, lu var2, int var3) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.av_fld = var2;
			var0.ae_fld = 0;
			var0.ay_fld = 0;
			if (var1 >= 0 && var1 < 3) {
				if (var2 == null || var2.by_fld == -1 && var2.bx_fld == 0) {
					if (null != var2 && null != var2.ge_fld) {
						if (0 == var1) {
							lu[] var4 = var2.ge_fld;

							for (int var5 = 0; var5 < var4.length; var5++) {
								lu var6 = var4[var5];
								if (var6 != null) {
									var0.ag(var6.by_fld);
								}
							}
						} else {
							boolean var7 = 1 != var1;
							if (-1 == var3) {
								var0.az(var2, var7, (byte)-93);
							} else if (var3 >= 0 && var3 < var2.ge_fld.length && var2.ge_fld[var3] != null) {
								var0.az(var2.ge_fld[var3], var7, (byte)-84);
							}
						}
					}
				} else {
					throw new RuntimeException("");
				}
			} else {
				throw new RuntimeException("");
			}
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ILlu;I)V"
	)
	public void ar(int var1, lu var2, int var3) {
		this.av_fld = var2;
		this.ae_fld = 0;
		this.ay_fld = 0;
		if (var1 >= 0 && var1 < 3) {
			if (var2 == null || var2.by_fld == -1 && var2.bx_fld == 0) {
				if (null != var2 && null != var2.ge_fld) {
					if (0 == var1) {
						lu[] var4 = var2.ge_fld;

						for (int var5 = 0; var5 < var4.length; var5++) {
							lu var6 = var4[var5];
							if (var6 != null) {
								this.ag(var6.by_fld);
							}
						}
					} else {
						boolean var7 = 1 != var1;
						if (-1 == var3) {
							this.az(var2, var7, (byte)-79);
						} else if (var3 >= 0 && var3 < var2.ge_fld.length && var2.ge_fld[var3] != null) {
							this.az(var2.ge_fld[var3], var7, (byte)-97);
						}
					}
				}
			} else {
				throw new RuntimeException("");
			}
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ILlu;I)V"
	)
	public void as(int var1, lu var2, int var3) {
		this.av_fld = var2;
		this.ae_fld = 0;
		this.ay_fld = 0;
		if (var1 >= 0 && var1 < 3) {
			if (var2 == null || var2.by_fld == -1 && 544864620 * var2.bx_fld == 0) {
				if (null != var2 && null != var2.ge_fld) {
					if (0 == var1) {
						lu[] var4 = var2.ge_fld;

						for (int var5 = 0; var5 < var4.length; var5++) {
							lu var6 = var4[var5];
							if (var6 != null) {
								this.ag(var6.by_fld);
							}
						}
					} else {
						boolean var7 = 1 != var1;
						if (-1 == var3) {
							this.az(var2, var7, (byte)-96);
						} else if (var3 >= 0 && var3 < var2.ge_fld.length && var2.ge_fld[var3] != null) {
							this.az(var2.ge_fld[var3], var7, (byte)-74);
						}
					}
				}
			} else {
				throw new RuntimeException("");
			}
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int at() {
		return this.ay_fld >= this.ae_fld ? -1 : this.ah_fld[(this.ay_fld += -1335980513) * -754881057 - 1];
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	final void ax(int var1) {
		if (this.ae_fld == this.ah_fld.length) {
			this.ah_fld = Arrays.copyOf(this.ah_fld, this.ah_fld.length * 2);
		}

		this.ah_fld[(this.ae_fld += -131739243) * 384561597 - 1] = var1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	final void an(int var1) {
		if (this.ae_fld == this.ah_fld.length) {
			this.ah_fld = Arrays.copyOf(this.ah_fld, this.ah_fld.length * 2);
		}

		this.ah_fld[(this.ae_fld += -131739243) * 384561597 - 1] = var1;
	}

	@ObfuscatedName("sm")
	@ObfuscatedSignature(
		descriptor = "(Lle;ILjava/lang/Object;Ljava/lang/Object;)V"
	)
	public static void sm(le var0, int var1, Object var2, Object var3) {
		int[] var4 = var0.ah_fld;
		int var5 = var0.ae_fld;
		var0.ah_fld = var0.aw_fld;
		var0.ae_fld = 0;
		var0.aw_fld = var4;

		for (int var6 = 0; var6 < var5; var6++) {
			lu var7 = var0.av_fld.ge_fld[var4[var6]];
			if (null != var7) {
				Object var8 = var7.ao(var1, var3, -1866731953);
				if (var2 == var8 || null != var8 && var8.equals(var2)) {
					var0.ag(var4[var6]);
				}
			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	final void aa(int var1) {
		if (this.ae_fld == this.ah_fld.length) {
			this.ah_fld = Arrays.copyOf(this.ah_fld, this.ah_fld.length * 2);
		}

		this.ah_fld[(this.ae_fld += 1512053571) * 384561597 - 1] = var1;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "()[I"
	)
	public int[] bz() {
		return Arrays.copyOf(this.ah_fld, this.ae_fld);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	final void ag(int var1) {
		if (this.ae_fld == this.ah_fld.length) {
			this.ah_fld = Arrays.copyOf(this.ah_fld, this.ah_fld.length * 2);
		}

		this.ah_fld[(this.ae_fld += -131739243) * 384561597 - 1] = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "()Llu;"
	)
	public lu ab() {
		int var1 = this.ah();
		return var1 >= 0 ? this.av_fld.ge_fld[var1] : null;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "()Llu;"
	)
	public lu ap() {
		int var1 = this.ah();
		return var1 >= 0 ? this.av_fld.ge_fld[var1] : null;
	}

	public le() {
		this.ay_fld = 0;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int aj() {
		return this.ay_fld >= this.ae_fld ? -1 : this.ah_fld[(this.ay_fld += -1335980513) * -754881057 - 1];
	}

	@ObfuscatedName("lp")
	@ObfuscatedSignature(
		descriptor = "(Lrh;)V"
	)
	public static void lp(rh var0) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ak_fld = rw.ak_fld;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	final void ai(int var1) {
		if (this.ae_fld == this.ah_fld.length) {
			this.ah_fld = Arrays.copyOf(this.ah_fld, this.ah_fld.length * 2);
		}

		this.ah_fld[(this.ae_fld += -131739243) * 384561597 - 1] = var1;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()Llu;"
	)
	public lu ae() {
		int var2 = this.ah();
		return var2 >= 0 ? this.av_fld.ge_fld[var2] : null;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "()[I"
	)
	public int[] bd() {
		return Arrays.copyOf(this.ah_fld, 484907307 * this.ae_fld);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;Ljava/lang/Object;I)V"
	)
	public void ay(int var1, Object var2, Object var3, int var4) {
		int[] var5 = this.ah_fld;
		int var6 = this.ae_fld;
		this.ah_fld = this.aw_fld;
		this.ae_fld = 0;
		this.aw_fld = var5;

		for (int var7 = 0; var7 < var6; var7++) {
			lu var8 = this.av_fld.ge_fld[var5[var7]];
			if (null != var8) {
				Object var9 = var8.ao(var1, var3, -2103136889);
				if (var2 != var9) {
					if (null == var9 || !var9.equals(var2)) {
						continue;
					}

					if (var4 >= -719799976) {
						return;
					}
				}

				this.ag(var5[var7]);
			}
		}
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;Ljava/lang/Object;)V"
	)
	public void br(int var1, Object var2, Object var3) {
		int[] var4 = this.ah_fld;
		int var5 = this.ae_fld;
		this.ah_fld = this.aw_fld;
		this.ae_fld = 0;
		this.aw_fld = var4;

		for (int var6 = 0; var6 < var5; var6++) {
			lu var7 = this.av_fld.ge_fld[var4[var6]];
			if (null != var7) {
				Object var8 = var7.ao(var1, var3, -1868988452);
				if (var2 == var8 || null != var8 && var8.equals(var2)) {
					this.ag(var4[var6]);
				}
			}
		}
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(ILba;Z)I"
	)
	static int bv(int var0, ba var1, boolean var2) throws EOFException {
		if (var0 == 4200) {
			int var27 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = kb.ag(var27, -1752383175).dx_fld;
			return 1;
		} else if (var0 == 4201) {
			gz.ax_fld -= 2;
			int var26 = bp.au_fld[gz.ax_fld];
			int var36 = bp.au_fld[1 + gz.ax_fld];
			og var38 = kb.ag(var26, -1752383175);
			if (var36 >= 1 && var36 <= 5 && var38.ak(-2139788883).ag(var36 - 1, -1107383279)) {
				bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var38.ak(-2139788883).ae(var36 - 1, rt.ag_fld, 1899227782);
			} else {
				bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
			}

			return 1;
		} else if (var0 == 4202) {
			gz.ax_fld -= 2;
			int var25 = bp.au_fld[gz.ax_fld];
			int var35 = bp.au_fld[gz.ax_fld + 1];
			og var37 = kb.ag(var25, -1752383175);
			if (var35 >= 1 && var35 <= 5 && null != var37.ex_fld[var35 - 1]) {
				bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var37.ex_fld[var35 - 1];
			} else {
				bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
			}

			return 1;
		} else if (4222 == var0) {
			gz.ax_fld -= 3;
			int var24 = bp.au_fld[gz.ax_fld];
			int var34 = bp.au_fld[1 + gz.ax_fld];
			int var6 = bp.au_fld[2 + gz.ax_fld];
			og var7 = kb.ag(var24, -1752383175);
			String var8 = null;
			if (var34 >= 1
				&& var34 <= 5
				&& null != var7.ex_fld[var34 - 1]
				&& var7.eo_fld != null
				&& null != var7.eo_fld[var34 - 1]
				&& var6 >= 1
				&& var6 <= var7.eo_fld[var34 - 1].length) {
				var8 = var7.eo_fld[var34 - 1][var6 - 1];
			}

			bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = null != var8 ? var8 : "";
			return 1;
		} else if (4203 == var0) {
			int var23 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = kb.ag(var23, -1752383175).es_fld * -1489673433;
			return 1;
		} else if (4204 == var0) {
			int var22 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = kb.ag(var22, -1752383175).dj_fld * -2061559521 == 1 ? 1 : 0;
			return 1;
		} else if (var0 == 4205) {
			int var21 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			og var33 = kb.ag(var21, -1752383175);
			if (-1 == var33.eg_fld && var33.en_fld >= 0) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var33.en_fld;
			} else {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var21;
			}

			return 1;
		} else if (var0 == 4206) {
			int var20 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			og var32 = kb.ag(var20, -1752383175);
			if (var32.eg_fld >= 0 && var32.en_fld >= 0) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var32.en_fld;
			} else {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var20;
			}

			return 1;
		} else if (4207 == var0) {
			int var19 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = kb.ag(var19, -1752383175).et_fld ? 1 : 0;
			return 1;
		} else if (var0 == 4208) {
			int var18 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			og var31 = kb.ag(var18, -1752383175);
			if (var31.fa_fld == -1 && var31.fy_fld >= 0) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var31.fy_fld;
			} else {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var18;
			}

			return 1;
		} else if (4209 == var0) {
			int var17 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			og var30 = kb.ag(var17, -1752383175);
			if (var30.fa_fld >= 0 && var30.fy_fld >= 0) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var30.fy_fld;
			} else {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var17;
			}

			return 1;
		} else if (var0 == 4210) {
			String var16 = (String)bp.ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			int var29 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			my.hb(var16, var29 == 1);
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = ey.gn_fld;
			return 1;
		} else if (var0 != 4211) {
			if (var0 == 4212) {
				tv.go_fld = 0;
				return 1;
			} else if (var0 == 4213) {
				int var15 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				int var28 = kb.ag(var15, -1752383175).ap(-1180259883);
				if (var28 == -1) {
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var28;
				} else {
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var28 + 1;
				}

				return 1;
			} else if (var0 == 4214) {
				int var14 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = kb.ag(var14, -1752383175).ep_fld * -616953337;
				return 1;
			} else if (var0 == 4215) {
				int var13 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = kb.ag(var13, -1752383175).eb_fld * 681741211;
				return 1;
			} else if (var0 == 4216) {
				int var12 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = kb.ag(var12, -1752383175).ed_fld * -1990169435;
				return 1;
			} else if (var0 == 4217) {
				int var11 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				og var5 = kb.ag(var11, -1752383175);
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var5.ev_fld;
				return 1;
			} else if (4218 == var0) {
				int var10 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = kb.ag(var10, -1752383175).ds_fld;
				return 1;
			} else if (4219 == var0) {
				int var9 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = kb.ag(var9, -1752383175).ec_fld * 622243963;
				return 1;
			} else if (var0 == 4220) {
				int var4 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = kb.ag(var4, -1752383175).em_fld ? 1 : 0;
				return 1;
			} else {
				return 2;
			}
		} else {
			if (in.gc_fld != null && tv.go_fld < ey.gn_fld) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = in.gc_fld[(tv.go_fld += -1770817561) * 1924770775 - 1] & '\uffff';
			} else {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -1;
			}

			return 1;
		}
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;Ljava/lang/Object;)V"
	)
	public void bh(int var1, Object var2, Object var3) {
		int[] var4 = this.ah_fld;
		int var5 = this.ae_fld;
		this.ah_fld = this.aw_fld;
		this.ae_fld = 0;
		this.aw_fld = var4;

		for (int var6 = 0; var6 < var5; var6++) {
			lu var7 = this.av_fld.ge_fld[var4[var6]];
			if (null != var7) {
				Object var8 = var7.ao(var1, var3, -2091685662);
				if (var2 == var8 || null != var8 && var8.equals(var2)) {
					this.ag(var4[var6]);
				}
			}
		}
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;Ljava/lang/Object;)V"
	)
	public void bk(int var1, Object var2, Object var3) {
		int[] var4 = this.ah_fld;
		int var5 = this.ae_fld;
		this.ah_fld = this.aw_fld;
		this.ae_fld = 0;
		this.aw_fld = var4;

		for (int var6 = 0; var6 < var5; var6++) {
			lu var7 = this.av_fld.ge_fld[var4[var6]];
			if (null != var7) {
				Object var8 = var7.ao(var1, var3, -1945462547);
				if (var2 == var8 || null != var8 && var8.equals(var2)) {
					this.ag(var4[var6]);
				}
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "()Llu;"
	)
	public lu ao() {
		int var1 = this.ah();
		return var1 >= 0 ? this.av_fld.ge_fld[var1] : null;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	final void aq(int var1) {
		if (this.ae_fld == this.ah_fld.length) {
			this.aw_fld = Arrays.copyOf(this.aw_fld, this.aw_fld.length * 2);
		}

		this.aw_fld[(this.ay_fld = this.ae_fld + -131739243) * 384561597 - 1] = var1;
	}
}
