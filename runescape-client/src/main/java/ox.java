import java.io.EOFException;
import java.io.UnsupportedEncodingException;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("ox")
public class ox extends vc {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int af_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int az_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int av_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ae_fld;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public boolean bz_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ay_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ak_fld;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "[S"
	)
	short[] aj_fld;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "[S"
	)
	short[] ac_fld;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ai_fld;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	public static iw ab_fld = new iw(64);
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] ap_fld;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int aa_fld;
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "[S"
	)
	short[] bm_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ah_fld;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "[S"
	)
	short[] at_fld;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int au_fld;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] bd_fld = new int[]{-1, -1, -1, -1, -1};
	@ObfuscatedGetter(
		intValue = 1615160353
	)
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int br_fld;
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bh_fld;
	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int do_fld;

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Llu;II)V"
	)
	static final void aq(lu var0, int var1, int var2) {
		if (null == var0.er_fld) {
			if (var2 != 360256802) {
				throw new RuntimeException();
			}
		} else {
			if (var0.hp_fld == null) {
				var0.hp_fld = new int[var0.er_fld.length];
			}

			var0.hp_fld[var1] = Integer.MAX_VALUE;
		}
	}

	@ObfuscatedName("fd")
	@ObfuscatedSignature(
		descriptor = "(Lox;Lxi;I)V"
	)
	public static void fd(ox var0, xi var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		} else {
			while (true) {
				int var3 = var1.cg();
				if (0 == var3) {
					return;
				}

				var0.az(var1, var3);
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	void az(xi var1, int var2) {
		switch (var2) {
			case 1:
				this.br_fld = var1.cg();
				break;
			case 3:
				this.bz_fld = true;
				break;
			case 5:
				int var7 = var1.cg();
				this.ap_fld = new int[var7];

				for (int var9 = 0; var9 < var7; var9++) {
					this.ap_fld[var9] = var1.dl(wa.ak_fld.az_fld);
				}
				break;
			case 40:
				int var6 = var1.cg();
				this.aj_fld = new short[var6];
				this.bm_fld = new short[var6];

				for (int var8 = 0; var8 < var6; var8++) {
					this.aj_fld[var8] = (short)xi.tx(var1, 1043154124);
					this.bm_fld[var8] = (short)xi.tx(var1, 523599650);
				}
				break;
			case 41:
				int var4 = var1.cg();
				this.ac_fld = new short[var4];
				this.at_fld = new short[var4];

				for (int var5 = 0; var5 < var4; var5++) {
					this.ac_fld[var5] = (short)xi.tx(var1, 1879103631);
					this.at_fld[var5] = (short)xi.tx(var1, 1603675928);
				}
				break;
			case 70:
			case 71:
			case 72:
			case 73:
			case 74:
			case 75:
			case 76:
			case 77:
			case 78:
			case 79:
				this.bd_fld[var2 - 70] = var1.dl(wa.ak_fld.az_fld);
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean ao() {
		try {
			boolean var1 = true;

			for (int var2 = 0; var2 < 5; var2++) {
				if (-1 != this.bd_fld[var2] && !cl.ao_fld.cc(this.bd_fld[var2], 0, 500101088)) {
					var1 = false;
				}
			}

			return var1;
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "()Leg;"
	)
	public eg ac() {
		try {
			eg[] var1 = new eg[5];
			int var2 = 0;

			for (int var3 = 0; var3 < 5; var3++) {
				if (-1 != this.bd_fld[var3]) {
					var1[var2++] = eg.ak(cl.ao_fld, this.bd_fld[var3], 0);
				}
			}

			eg var7 = new eg(var1, var2);
			if (null != this.aj_fld) {
				for (int var4 = 0; var4 < this.aj_fld.length; var4++) {
					eg.hm(var7, this.aj_fld[var4], this.bm_fld[var4]);
				}
			}

			if (null != this.ac_fld) {
				for (int var8 = 0; var8 < this.ac_fld.length; var8++) {
					var7.bs(this.ac_fld[var8], this.at_fld[var8]);
				}
			}

			return var7;
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	ox() {
		this.bz_fld = false;
		this.br_fld = 545054751;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()Leg;"
	)
	public eg ay() {
		try {
			eg[] var2 = new eg[5];
			int var3 = 0;

			for (int var4 = 0; var4 < 5; var4++) {
				if (-1 != this.bd_fld[var4]) {
					var2[var3++] = eg.ak(cl.ao_fld, this.bd_fld[var4], 0);
				}
			}

			eg var7 = new eg(var2, var3);
			if (null != this.aj_fld) {
				for (int var5 = 0; var5 < this.aj_fld.length; var5++) {
					eg.hm(var7, this.aj_fld[var5], this.bm_fld[var5]);
				}
			}

			if (null != this.ac_fld) {
				for (int var8 = 0; var8 < this.ac_fld.length; var8++) {
					var7.bs(this.ac_fld[var8], this.at_fld[var8]);
				}
			}

			return var7;
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "()Leg;"
	)
	public eg aj() {
		try {
			eg[] var1 = new eg[5];
			int var2 = 0;

			for (int var3 = 0; var3 < 5; var3++) {
				if (-1 != this.bd_fld[var3]) {
					var1[var2++] = eg.ak(cl.ao_fld, this.bd_fld[var3], 0);
				}
			}

			eg var7 = new eg(var1, var2);
			if (null != this.aj_fld) {
				for (int var4 = 0; var4 < this.aj_fld.length; var4++) {
					eg.hm(var7, this.aj_fld[var4], this.bm_fld[var4]);
				}
			}

			if (null != this.ac_fld) {
				for (int var8 = 0; var8 < this.ac_fld.length; var8++) {
					var7.bs(this.ac_fld[var8], this.at_fld[var8]);
				}
			}

			return var7;
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "()Leg;"
	)
	public eg aa() {
		try {
			if (null == this.ap_fld) {
				return null;
			} else {
				eg[] var1 = new eg[this.ap_fld.length];

				for (int var2 = 0; var2 < this.ap_fld.length; var2++) {
					var1[var2] = eg.ak(cl.ao_fld, this.ap_fld[var2], 0);
				}

				eg var6;
				if (var1.length == 1) {
					var6 = var1[0];
				} else {
					var6 = new eg(var1, var1.length);
				}

				if (this.aj_fld != null) {
					for (int var3 = 0; var3 < this.aj_fld.length; var3++) {
						eg.hm(var6, this.aj_fld[var3], this.bm_fld[var3]);
					}
				}

				if (this.ac_fld != null) {
					for (int var7 = 0; var7 < this.ac_fld.length; var7++) {
						var6.bs(this.ac_fld[var7], this.at_fld[var7]);
					}
				}

				return var6;
			}
		} catch (Throwable var5) {
			throw new RuntimeException(var5);
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Lox;"
	)
	public static ox ar(int var0) throws EOFException {
		try {
			ox var1 = (ox)ab_fld.ak(var0);
			if (null != var1) {
				return var1;
			} else if (nz.ad_fld == null) {
				return null;
			} else {
				byte[] var2 = nz.ad_fld.bb(3, var0, 584982574);
				var1 = new ox();
				if (null != var2) {
					fd(var1, new xi(var2), -1905505735);
				}

				ab_fld.az(var1, var0);
				return var1;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	void ax(xi var1) {
		while (true) {
			int var2 = var1.cg();
			if (0 == var2) {
				return;
			}

			this.az(var1, var2);
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Lox;"
	)
	public static ox al(int var0) throws EOFException {
		try {
			ox var1 = (ox)ab_fld.ak(var0);
			if (null != var1) {
				return var1;
			} else if (nz.ad_fld == null) {
				return null;
			} else {
				byte[] var2 = nz.ad_fld.bb(3, var0, 584982574);
				var1 = new ox();
				if (null != var2) {
					fd(var1, new xi(var2), -2006844386);
				}

				ab_fld.az(var1, var0);
				return var1;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("vd")
	@ObfuscatedSignature(
		descriptor = "(Lox;II)Z"
	)
	public static boolean vd(ox var0, int var1, int var2) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return 1 == var2 ? var1 + 7 == var0.br_fld : var0.br_fld == var1;
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "()Leg;"
	)
	public eg am() {
		try {
			if (null == this.ap_fld) {
				return null;
			} else {
				eg[] var1 = new eg[this.ap_fld.length];

				for (int var2 = 0; var2 < this.ap_fld.length; var2++) {
					var1[var2] = eg.ak(cl.ao_fld, this.ap_fld[var2], 0);
				}

				eg var6;
				if (var1.length == 1) {
					var6 = var1[0];
				} else {
					var6 = new eg(var1, var1.length);
				}

				if (this.aj_fld != null) {
					for (int var3 = 0; var3 < this.aj_fld.length; var3++) {
						eg.hm(var6, this.aj_fld[var3], this.bm_fld[var3]);
					}
				}

				if (this.ac_fld != null) {
					for (int var7 = 0; var7 < this.ac_fld.length; var7++) {
						var6.bs(this.ac_fld[var7], this.at_fld[var7]);
					}
				}

				return var6;
			}
		} catch (Throwable var5) {
			throw new RuntimeException(var5);
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	void an(xi var1, int var2) {
		switch (var2) {
			case 1:
				this.br_fld = var1.cg();
				break;
			case 3:
				this.bz_fld = true;
				break;
			case 5:
				int var6 = var1.cg();
				this.ap_fld = new int[var6];

				for (int var8 = 0; var8 < var6; var8++) {
					this.ap_fld[var8] = var1.dl(wa.ak_fld.az_fld);
				}
				break;
			case 40:
				int var5 = var1.cg();
				this.aj_fld = new short[var5];
				this.bm_fld = new short[var5];

				for (int var7 = 0; var7 < var5; var7++) {
					this.aj_fld[var7] = (short)xi.tx(var1, 686817752);
					this.bm_fld[var7] = (short)xi.tx(var1, 1090666093);
				}
				break;
			case 41:
				int var3 = var1.cg();
				this.ac_fld = new short[var3];
				this.at_fld = new short[var3];

				for (int var4 = 0; var4 < var3; var4++) {
					this.ac_fld[var4] = (short)xi.tx(var1, 1779216288);
					this.at_fld[var4] = (short)xi.tx(var1, 672142758);
				}
				break;
			case 70:
			case 71:
			case 72:
			case 73:
			case 74:
			case 75:
			case 76:
			case 77:
			case 78:
			case 79:
				this.bd_fld[var2 - 70] = var1.dl(wa.ak_fld.az_fld);
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()Leg;"
	)
	public eg ah() {
		try {
			if (null == this.ap_fld) {
				return null;
			} else {
				eg[] var2 = new eg[this.ap_fld.length];

				for (int var3 = 0; var3 < this.ap_fld.length; var3++) {
					var2[var3] = eg.ak(cl.ao_fld, this.ap_fld[var3], 0);
				}

				eg var6;
				if (var2.length == 1) {
					var6 = var2[0];
				} else {
					var6 = new eg(var2, var2.length);
				}

				if (this.aj_fld != null) {
					for (int var4 = 0; var4 < this.aj_fld.length; var4++) {
						eg.hm(var6, this.aj_fld[var4], this.bm_fld[var4]);
					}
				}

				if (this.ac_fld != null) {
					for (int var7 = 0; var7 < this.ac_fld.length; var7++) {
						var6.bs(this.ac_fld[var7], this.at_fld[var7]);
					}
				}

				return var6;
			}
		} catch (Throwable var5) {
			throw new RuntimeException(var5);
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "()Leg;"
	)
	public eg aq() {
		try {
			if (null == this.ap_fld) {
				return null;
			} else {
				eg[] var1 = new eg[this.ap_fld.length];

				for (int var2 = 0; var2 < this.ap_fld.length; var2++) {
					var1[var2] = eg.ak(cl.ao_fld, this.ap_fld[var2], 0);
				}

				eg var6;
				if (var1.length == 1) {
					var6 = var1[0];
				} else {
					var6 = new eg(var1, var1.length);
				}

				if (this.aj_fld != null) {
					for (int var3 = 0; var3 < this.aj_fld.length; var3++) {
						eg.hm(var6, this.aj_fld[var3], this.bm_fld[var3]);
					}
				}

				if (this.ac_fld != null) {
					for (int var7 = 0; var7 < this.ac_fld.length; var7++) {
						var6.bs(this.ac_fld[var7], this.at_fld[var7]);
					}
				}

				return var6;
			}
		} catch (Throwable var5) {
			throw new RuntimeException(var5);
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "()Leg;"
	)
	public eg ai() {
		try {
			if (null == this.ap_fld) {
				return null;
			} else {
				eg[] var1 = new eg[this.ap_fld.length];

				for (int var2 = 0; var2 < this.ap_fld.length; var2++) {
					var1[var2] = eg.ak(cl.ao_fld, this.ap_fld[var2], 0);
				}

				eg var6;
				if (var1.length == 1) {
					var6 = var1[0];
				} else {
					var6 = new eg(var1, var1.length);
				}

				if (this.aj_fld != null) {
					for (int var3 = 0; var3 < this.aj_fld.length; var3++) {
						eg.hm(var6, this.aj_fld[var3], this.bm_fld[var3]);
					}
				}

				if (this.ac_fld != null) {
					for (int var7 = 0; var7 < this.ac_fld.length; var7++) {
						var6.bs(this.ac_fld[var7], this.at_fld[var7]);
					}
				}

				return var6;
			}
		} catch (Throwable var5) {
			throw new RuntimeException(var5);
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean ad() {
		try {
			boolean var1 = true;

			for (int var2 = 0; var2 < 5; var2++) {
				if (-1 != this.bd_fld[var2] && !cl.ao_fld.cc(this.bd_fld[var2], 0, 1903921482)) {
					var1 = false;
				}
			}

			return var1;
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("mk")
	@ObfuscatedSignature(
		descriptor = "(Lmx;ILjava/lang/String;)V"
	)
	public static void mk(mx var0, int var1, String var2) throws UnsupportedEncodingException {
		try {
			if (var0 == null) {
				var0.getClass();
			} else {
				var0.aa_fld = var1 * 682636216;
				var0.ai_fld = var2;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Lox;"
	)
	public static ox as(int var0) throws EOFException {
		try {
			ox var1 = (ox)ab_fld.ak(var0);
			if (null != var1) {
				return var1;
			} else if (nz.ad_fld == null) {
				return null;
			} else {
				byte[] var2 = nz.ad_fld.bb(3, var0, 584982574);
				var1 = new ox();
				if (null != var2) {
					fd(var1, new xi(var2), -2003367497);
				}

				ab_fld.az(var1, var0);
				return var1;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "()Leg;"
	)
	public eg ap() {
		try {
			eg[] var1 = new eg[5];
			int var2 = 0;

			for (int var3 = 0; var3 < 5; var3++) {
				if (-1 != this.bd_fld[var3]) {
					var1[var2++] = eg.ak(cl.ao_fld, this.bd_fld[var3], 0);
				}
			}

			eg var7 = new eg(var1, var2);
			if (null != this.aj_fld) {
				for (int var4 = 0; var4 < this.aj_fld.length; var4++) {
					eg.hm(var7, this.aj_fld[var4], this.bm_fld[var4]);
				}
			}

			if (null != this.ac_fld) {
				for (int var8 = 0; var8 < this.ac_fld.length; var8++) {
					var7.bs(this.ac_fld[var8], this.at_fld[var8]);
				}
			}

			return var7;
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "()Leg;"
	)
	public eg at() {
		try {
			eg[] var1 = new eg[5];
			int var2 = 0;

			for (int var3 = 0; var3 < 5; var3++) {
				if (-1 != this.bd_fld[var3]) {
					var1[var2++] = eg.ak(cl.ao_fld, this.bd_fld[var3], 0);
				}
			}

			eg var7 = new eg(var1, var2);
			if (null != this.aj_fld) {
				for (int var4 = 0; var4 < this.aj_fld.length; var4++) {
					eg.hm(var7, this.aj_fld[var4], this.bm_fld[var4]);
				}
			}

			if (null != this.ac_fld) {
				for (int var8 = 0; var8 < this.ac_fld.length; var8++) {
					var7.bs(this.ac_fld[var8], this.at_fld[var8]);
				}
			}

			return var7;
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Lox;"
	)
	public static ox af(int var0) throws EOFException {
		try {
			ox var1 = (ox)ab_fld.ak(var0);
			if (null != var1) {
				return var1;
			} else if (nz.ad_fld == null) {
				return null;
			} else {
				byte[] var2 = nz.ad_fld.bb(3, var0, 584982574);
				var1 = new ox();
				if (null != var2) {
					fd(var1, new xi(var2), -1821015077);
				}

				ab_fld.az(var1, var0);
				return var1;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lsl;Ljava/lang/Object;II)I"
	)
	public static int az(sl var0, Object var1, int var2, int var3) {
		if (var2 < 0) {
			var2 = 0;
		}

		if (var3 < 0 || var3 > var0.av()) {
			var3 = var0.av();
		}

		if (yq.ak_fld == var0.ag_fld) {
			int[] var5 = var0.ak();
			int var6 = (Integer)var1;

			for (int var7 = var3 - 1; var7 >= var2; var7--) {
				if (var6 == var5[var7]) {
					return var7;
				}
			}
		} else if (var0.ag_fld == yq.ag_fld) {
			long[] var9 = var0.ag();
			long var11 = (Long)var1;

			for (int var8 = var3 - 1; var8 >= var2; var8--) {
				if (var9[var8] == var11) {
					return var8;
				}
			}
		} else {
			Object[] var10 = (Object[])var0.az();

			for (int var12 = var3 - 1; var12 >= var2; var12--) {
				if (var10[var12] == var1 || var10[var12] != null && var10[var12].equals(var1)) {
					return var12;
				}
			}
		}

		return -1;
	}

	@ObfuscatedName("nq")
	@ObfuscatedSignature(
		descriptor = "(Lox;B)Z"
	)
	public static boolean nq(ox var0, byte var1) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			boolean var2 = true;

			for (int var3 = 0; var3 < 5; var3++) {
				if (-1 != var0.bd_fld[var3] && !cl.ao_fld.cc(var0.bd_fld[var3], 0, 1534047642)) {
					var2 = false;
				}
			}

			return var2;
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	static void hg(boolean var0) {
		client.nt_fld = var0;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean ae() {
		try {
			if (this.ap_fld == null) {
				return true;
			} else {
				boolean var2 = true;

				for (int var3 = 0; var3 < this.ap_fld.length; var3++) {
					if (!cl.ao_fld.cc(this.ap_fld[var3], 0, -1493173380)) {
						var2 = false;
					}
				}

				return var2;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("zs")
	@ObfuscatedSignature(
		descriptor = "(Lli;II)Z"
	)
	public static boolean zs(li var0, int var1, int var2) {
		boolean var3 = var1 != var0.bh_fld || var0.bk_fld != var2;
		var0.bh_fld = var1;
		var0.bk_fld = var2;
		return var3 | var0.al(1866875189 * var0.bj_fld, var0.bf_fld * -1149429510);
	}

	@ObfuscatedName("ft")
	@ObfuscatedSignature(
		descriptor = "(Lox;)Z"
	)
	public static boolean ft(ox var0) throws EOFException {
		try {
			if (var0 == null) {
				throw new NullPointerException();
			} else {
				boolean var1 = true;

				for (int var2 = 0; var2 < 5; var2++) {
					if (-1 != var0.bd_fld[var2] && !cl.ao_fld.cc(var0.bd_fld[var2], 0, 1970775451)) {
						var1 = false;
					}
				}

				return var1;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	void ag(xi var1, int var2) {
		while (true) {
			int var3 = var1.co();
			if (0 == var3) {
				return;
			}

			this.az(var1, var3);
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)Z"
	)
	public boolean aw(byte var1) {
		try {
			boolean var2 = true;

			for (int var3 = 0; var3 < 5; var3++) {
				if (-1 != this.bd_fld[var3] && !cl.ao_fld.cc(this.bd_fld[var3], 0, 1534047642)) {
					var2 = false;
				}
			}

			return var2;
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	void au(xi var1) {
		while (true) {
			int var2 = var1.ec();
			if (0 == var2) {
				return;
			}

			this.az(var1, var2);
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(III)Z"
	)
	public boolean av(int var1, int var2, int var3) {
		return 1 == var2 ? var1 + 7 == this.br_fld : this.br_fld == var1;
	}
}
