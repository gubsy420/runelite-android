import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("ap")
public class ap {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lxz;"
	)
	xz az_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	ub ag_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	ub ak_fld;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int aa_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	public static ub ay_fld;

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(F)F"
	)
	static final float av(float var0) {
		var0 = 1.0100503F * (var0 - 75.0F);
		return 1.0100503F + 150.75377F / var0;
	}

	@ObfuscatedName("mv")
	@ObfuscatedSignature(
		descriptor = "(Lap;I)Lal;"
	)
	public static al mv(ap var0, int var1) throws EOFException {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.az(var1, null);
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(Lxj;[BII)V"
	)
	public static void cz(xj var0, byte[] var1, int var2, int var3) {
		if (var0 == null) {
			var0.getClass();
		}

		for (int var4 = 0; var4 < var3; var4++) {
			var1[var2 + var4] = (byte)(var0.al_fld[(var0.au_fld += 228932457) * -661977895 - 1] - var0.ag_fld.ak());
		}
	}

	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "(Lap;IIZ)J"
	)
	public static long dd(ap var0, int var1, int var2, boolean var3) throws EOFException {
		if (var0 == null) {
			var0.getClass();
		}

		int var4 = var2 ^ (var1 << 4 & 65535 | var1 >> 12);
		var4 |= var1 << 16;
		return var3 ? var4 ^ 4294967296L : var4;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(III)Lai;"
	)
	ai ag(int var1, int var2, int var3) throws EOFException {
		long var4 = this.ah(var1, var2, true);
		ai var6 = (ai)this.az_fld.ak(var4);
		if (var6 != null) {
			return var6;
		} else {
			bz var7 = bz.av(this.ag_fld, var1, var2);
			if (var7 == null) {
				return new ai();
			} else {
				ai var8 = new ai(var7);
				this.az_fld.az(var8, var4);
				return var8;
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I[I)Lal;"
	)
	al az(int var1, int[] var2) throws EOFException {
		if (ub.sn(this.ak_fld, (byte)20) == 1) {
			return this.ak(0, var1, var2);
		} else if (rl1.ei(this.ak_fld, var1) - 1 == 1) {
			return this.ak(var1, 1, var2);
		} else if (rl1.ei(this.ak_fld, var1) - 1 == 0) {
			return this.ak(var1, 0, var2);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("sl")
	@ObfuscatedSignature(
		descriptor = "(Lap;II[I)Lal;"
	)
	public static al sl(ap var0, int var1, int var2, int[] var3) throws EOFException {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			long var4 = var0.ah(var1, var2, false);
			ai var6 = (ai)var0.az_fld.ak(var4);
			if (null != var6) {
				return var6.ag();
			} else if (null != var3 && var3[0] <= 0) {
				return null;
			} else {
				af var7 = af.ag(var0.ak_fld, var1, var2);
				if (var7 == null) {
					return null;
				} else {
					al var8 = var7.av();
					var0.az_fld.az(new ai(var8), var4);
					if (null != var3) {
						var3[0] -= var8.ag_fld.length;
					}

					return var8;
				}
			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lub;I)V"
	)
	static void aw(ub var0, int var1) throws EOFException {
		if ((var1 & wu.br_fld.ag(522969153)) != 0) {
			hk.cr_fld = dq.aw(var0, "logo_deadman_mode", "");
		} else if ((var1 & wu.be_fld.ag(-1059277904)) != 0) {
			hk.cr_fld = dq.aw(var0, "logo_seasonal_mode", "");
		} else if ((var1 & wu.as_fld.ag(1085971424)) != 0) {
			hk.cr_fld = dq.aw(var0, "logo_speedrunning", "");
		} else if ((var1 & wu.al_fld.ag(-1927926951)) != 0) {
			hk.cr_fld = dq.aw(var0, "logo_ugc_world", "");
		} else {
			hk.cr_fld = dq.aw(var0, "logo", "");
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Lai;"
	)
	public ai av(int var1) throws EOFException {
		if (ub.sn(this.ag_fld, (byte)66) == 1) {
			return this.ag(0, var1, 793666769);
		} else if (rl1.ei(this.ag_fld, var1) == 1) {
			return this.ag(var1, 0, 793666769);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("za")
	@ObfuscatedSignature(
		descriptor = "(Lap;II)Lai;"
	)
	public static ai za(ap var0, int var1, int var2) throws EOFException {
		if (var0 == null) {
			var0.getClass();
		}

		long var3 = var0.ah(var1, var2, true);
		ai var5 = (ai)var0.az_fld.ak(var3);
		if (var5 != null) {
			return var5;
		} else {
			bz var6 = bz.av(var0.ag_fld, var1, var2);
			if (var6 == null) {
				return new ai();
			} else {
				ai var7 = new ai(var6);
				var0.az_fld.az(var7, var3);
				return var7;
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I[I)Lal;"
	)
	al au(int var1, int[] var2) throws EOFException {
		if (ub.sn(this.ak_fld, (byte)37) == 1) {
			return this.ak(0, var1, var2);
		} else if (rl1.ei(this.ak_fld, var1) - 1 == 1) {
			return this.ak(var1, 1, var2);
		} else if (rl1.ei(this.ak_fld, var1) - 1 == 0) {
			return this.ak(var1, 0, var2);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIZ)J"
	)
	long ah(int var1, int var2, boolean var3) {
		int var5 = var2 ^ (var1 << 4 & 65535 | var1 >> 12);
		var5 |= var1 << 16;
		return var3 ? var5 ^ 4294967296L : var5;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II[I)Lal;"
	)
	al as(int var1, int var2, int[] var3) throws EOFException {
		long var4 = this.ah(var1, var2, false);
		ai var6 = (ai)this.az_fld.ak(var4);
		if (null != var6) {
			return var6.ag();
		} else if (null != var3 && var3[0] <= 0) {
			return null;
		} else {
			af var7 = af.ag(this.ak_fld, var1, var2);
			if (var7 == null) {
				return null;
			} else {
				al var8 = var7.av();
				this.az_fld.az(new ai(var8), var4);
				if (null != var3) {
					var3[0] -= var8.ag_fld.length;
				}

				return var8;
			}
		}
	}

	public ap(ub var1, ub var2) {
		new xz(256);
		this.az_fld = new xz(256);
		this.ak_fld = var1;
		this.ag_fld = var2;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I[I)Lal;"
	)
	al al(int var1, int[] var2) throws EOFException {
		if (ub.sn(this.ak_fld, (byte)12) == 1) {
			return this.ak(0, var1, var2);
		} else if (rl1.ei(this.ak_fld, var1) - 1 == 1) {
			return this.ak(var1, 1, var2);
		} else if (rl1.ei(this.ak_fld, var1) - 1 == 0) {
			return this.ak(var1, 0, var2);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Lal;"
	)
	public al an(int var1) throws EOFException {
		return this.az(var1, null);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Lai;"
	)
	public ai ax(int var1) throws EOFException {
		if (ub.sn(this.ag_fld, (byte)15) == 1) {
			return this.ag(0, var1, 793666769);
		} else if (rl1.ei(this.ag_fld, var1) == 1) {
			return this.ag(var1, 0, 793666769);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II[I)Lal;"
	)
	al ak(int var1, int var2, int[] var3) throws EOFException {
		long var5 = this.ah(var1, var2, false);
		ai var7 = (ai)this.az_fld.ak(var5);
		if (null != var7) {
			return var7.ag();
		} else if (null != var3 && var3[0] <= 0) {
			return null;
		} else {
			af var8 = af.ag(this.ak_fld, var1, var2);
			if (var8 == null) {
				return null;
			} else {
				al var9 = var8.av();
				this.az_fld.az(new ai(var9), var5);
				if (null != var3) {
					var3[0] -= var9.ag_fld.length;
				}

				return var9;
			}
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIZ)J"
	)
	long aq(int var1, int var2, boolean var3) {
		int var4 = var2 ^ (var1 << 4 & 65535 | var1 >> 12);
		var4 |= var1 << 16;
		return var3 ? var4 ^ 4294967296L : var4;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)Lai;"
	)
	ai ar(int var1, int var2) throws EOFException {
		long var3 = this.ah(var1, var2, true);
		ai var5 = (ai)this.az_fld.ak(var3);
		if (var5 != null) {
			return var5;
		} else {
			bz var6 = bz.av(this.ag_fld, var1, var2);
			if (var6 == null) {
				return new ai();
			} else {
				ai var7 = new ai(var6);
				this.az_fld.az(var7, var3);
				return var7;
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(C)Z"
	)
	public static boolean ag(char var0) {
		if ((var0 < ' ' || var0 >= 127) && (var0 <= 127 || var0 >= 160) && (var0 <= 160 || var0 > 255)) {
			if (var0 != 0) {
				char[] var2 = nt.ak_fld;

				for (int var3 = 0; var3 < var2.length; var3++) {
					char var4 = var2[var3];
					if (var0 == var4) {
						return true;
					}
				}
			}

			return false;
		} else {
			return true;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)Lal;"
	)
	public al ae(int var1, int var2) throws EOFException {
		return this.az(var1, null);
	}

	@ObfuscatedName("yq")
	@ObfuscatedSignature(
		descriptor = "(Lap;II[I)Lal;"
	)
	public static al yq(ap var0, int var1, int var2, int[] var3) throws EOFException {
		if (var0 == null) {
			var0.getClass();
		}

		long var4 = var0.ah(var1, var2, false);
		ai var6 = (ai)var0.az_fld.ak(var4);
		if (null != var6) {
			return var6.ag();
		} else if (null != var3 && var3[0] <= 0) {
			return null;
		} else {
			af var7 = af.ag(var0.ak_fld, var1, var2);
			if (var7 == null) {
				return null;
			} else {
				al var8 = var7.av();
				var0.az_fld.az(new ai(var8), var4);
				if (null != var3) {
					var3[0] -= var8.ag_fld.length;
				}

				return var8;
			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Lal;"
	)
	public al aa(int var1) throws EOFException {
		return this.az(var1, null);
	}
}
