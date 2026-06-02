import java.io.EOFException;
import java.util.zip.CRC32;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("uv")
public class uv extends ub {
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	uu ad_fld;
	@ObfuscatedGetter(
		intValue = -1801806727
	)
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int au_fld;
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
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "B"
	)
	static byte ah_fld;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean ar_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean as_fld = false;
	@ObfuscatedGetter(
		intValue = 1646223619
	)
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ai_fld;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lun;"
	)
	un al_fld;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lun;"
	)
	un af_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ak_fld;
	@ObfuscatedGetter(
		intValue = 94801405
	)
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	volatile int ax_fld;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean an_fld;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "[Z"
	)
	volatile boolean[] aa_fld;
	// $VF: synthetic field
	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public static boolean co_fld = !uv.class.desiredAssertionStatus();
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ag_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/zip/CRC32;"
	)
	static CRC32 ay_fld = new CRC32();
	@ObfuscatedGetter(
		intValue = -768949343
	)
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int am_fld;
	@ObfuscatedGetter(
		intValue = 101244931
	)
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int aq_fld;

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ae() {
		this.ax_fld = -1411420502;
		this.bj_fld = new int[0];
		this.bk_fld = new int[0];
		this.by_fld = new int[0];
		this.bp_fld = new int[0];
		this.bv_fld = new int[0][];
		this.bn_fld = (Object[])(new Object[0]);
		this.bc_fld = (Object[][])(new Object[0][]);
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean bc() {
		return 1 == this.ax_fld;
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean bv(int var1) {
		return this.cp(var1, (byte)81) != null;
	}

	@ObfuscatedName("pb")
	@ObfuscatedSignature(
		descriptor = "([B)Ljava/lang/Object;"
	)
	public static Object pb(byte[] var0) {
		if (var0 == null) {
			return null;
		} else if (var0.length > 136) {
			zx var2 = new zx();
			var2.qs(var0);
			return var2;
		} else {
			return var0;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	@Override
	void av(int var1, int var2) {
		try {
			if (this.al_fld != null && null != this.aa_fld) {
				if (var2 == -829071092) {
					return;
				}

				if (this.aa_fld[var1]) {
					mk.ah(var1, this.al_fld, this, 423360065);
					return;
				}
			}

			this.ad_fld.ah(this, this.au_fld, var1, this.bk_fld[var1], (byte)4, true);
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	void ah(int var1, int var2, int var3) {
		try {
			this.ai_fld = var1;
			this.aq_fld = var2;
			if (this.af_fld != null) {
				if (var3 == -1234248238) {
					return;
				}

				mk.ah(this.au_fld, this.af_fld, this, 385435529);
			} else {
				this.ad_fld.ah(this, ud.ak_fld.bm_fld, this.au_fld, this.ai_fld, (byte)0, true);
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ag() {
		byte var2 = 0;
		int var3 = 0;

		for (int var4 = 0; var4 < this.bn_fld.length; var4++) {
			if (this.bp_fld[var4] > 0) {
				var2 += 100;
				var3 += this.ar(var4, -8656200);
			}
		}

		return var2 == 0 ? 100 : var3 * 100 / var2;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I[BZZ)V"
	)
	void aw(int var1, byte[] var2, boolean var3, boolean var4) {
		if (var3) {
			if (1 == this.ax_fld) {
				throw new RuntimeException();
			}

			if (this.af_fld != null) {
				ka.ae(this.au_fld, var2, this.af_fld);
			}

			this.bg(var2, -1758388174);
			bi(this, -936468145);
		} else {
			var2[var2.length - 4] = (byte)(this.by_fld[var1] >> 24);
			var2[var2.length - 3] = (byte)(this.by_fld[var1] >> 16);
			var2[var2.length - 2] = (byte)(this.by_fld[var1] >> 8);
			var2[var2.length - 1] = (byte)this.by_fld[var1];
			if (this.al_fld != null) {
				ka.ae(var1, var2, this.al_fld);
				this.aa_fld[var1] = true;
			}

			if (var4) {
				Object[] var6 = (Object[])this.bn_fld;
				Object var8;
				if (var2 == null) {
					var8 = null;
				} else if (var2.length > 136) {
					zx var9 = new zx();
					var9.az(var2, (byte)-20);
					var8 = var9;
				} else {
					var8 = var2;
				}

				var6[var1] = var8;
			}
		}
	}

	@ObfuscatedName("vi")
	@ObfuscatedSignature(
		descriptor = "(Luv;)I"
	)
	public static int vi(uv var0) {
		if (var0 == null) {
			var0.getClass();
		}

		byte var1 = 0;
		int var2 = 0;

		for (int var3 = 0; var3 < var0.bn_fld.length; var3++) {
			if (var0.bp_fld[var3] > 0) {
				var1 += 100;
				var2 += var0.ar(var3, -8656200);
			}
		}

		return var1 == 0 ? 100 : var2 * 100 / var1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean al(int var1) {
		return this.cp(var1, (byte)97) != null;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	@Override
	public int ar(int var1, int var2) {
		if (null != this.bn_fld[var1]) {
			return 100;
		} else {
			return this.aa_fld[var1] ? 100 : this.ad_fld.ay(this.au_fld, var1);
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "()Lul;"
	)
	public static ul ak() {
		synchronized (ul.av_fld) {
			if (ul.ah_fld == 0) {
				return new ul();
			} else {
				ul.av_fld[(ul.ah_fld -= -957110211) * -1130352875].az();
				return ul.av_fld[ul.ah_fld];
			}
		}
	}

	@ObfuscatedName("yh")
	@ObfuscatedSignature(
		descriptor = "(Luv;II)V"
	)
	public static void yh(uv var0, int var1, int var2) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			var0.ai_fld = var1;
			var0.aq_fld = var2;
			if (var0.af_fld != null) {
				mk.ah(-897166044 * var0.au_fld, var0.af_fld, var0, 336184440);
			} else {
				var0.ad_fld.ah(var0, -713760256 * ud.ak_fld.bm_fld, var0.au_fld * 858305725, var0.ai_fld, (byte)0, true);
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("sl")
	@ObfuscatedSignature(
		descriptor = "(Luv;I)I"
	)
	public static int sl(uv var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else if (1 != var0.ax_fld && (!var0.ar_fld || var0.ax_fld != 2)) {
			if (var0.bn_fld != null) {
				return 99;
			} else {
				int var2 = var0.ad_fld.ay(ud.ak_fld.bm_fld, var0.au_fld);
				if (var2 >= 100) {
					var2 = 99;
				}

				return var2;
			}
		} else {
			return 100;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ac() {
		this.ax_fld = -1411420502;
		this.bj_fld = new int[0];
		this.bk_fld = new int[0];
		this.by_fld = new int[0];
		this.bp_fld = new int[0];
		this.bv_fld = new int[0][];
		this.bn_fld = (Object[])(new Object[0]);
		this.bc_fld = (Object[][])(new Object[0][]);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void aq(int var1) {
		uu.xu(this.ad_fld, this.au_fld * 583010851, var1, (byte)24);
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I[BZZ)V"
	)
	void bh(int var1, byte[] var2, boolean var3, boolean var4) {
		if (var3) {
			if (1 == this.ax_fld) {
				throw new RuntimeException();
			}

			if (this.af_fld != null) {
				ka.ae(this.au_fld, var2, this.af_fld);
			}

			this.bg(var2, -1758388174);
			bi(this, -206648204);
		} else {
			var2[var2.length - 4] = (byte)(this.by_fld[var1] >> 24);
			var2[var2.length - 3] = (byte)(this.by_fld[var1] >> 16);
			var2[var2.length - 2] = (byte)(this.by_fld[var1] >> 8);
			var2[var2.length - 1] = (byte)this.by_fld[var1];
			if (this.al_fld != null) {
				ka.ae(var1, var2, this.al_fld);
				this.aa_fld[var1] = true;
			}

			if (var4) {
				Object[] var5 = (Object[])this.bn_fld;
				Object var7;
				if (var2 == null) {
					var7 = null;
				} else if (var2.length > 136) {
					zx var8 = new zx();
					var8.az(var2, (byte)-24);
					var7 = var8;
				} else {
					var7 = var2;
				}

				var5[var1] = var7;
			}
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean ax() {
		return 1 == this.ax_fld;
	}

	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "(Luv;II)V"
	)
	public static void ez(uv var0, int var1, int var2) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			var0.ai_fld = var1;
			var0.aq_fld = -456987545 * var2;
			if (var0.af_fld != null) {
				mk.ah(-1391795200 * var0.au_fld, var0.af_fld, var0, 1726567456);
			} else {
				var0.ad_fld.ah(var0, -456185395 * ud.ak_fld.bm_fld, var0.au_fld, var0.ai_fld, (byte)0, true);
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int aa() {
		if (1 != this.ax_fld && (!this.ar_fld || this.ax_fld != 2)) {
			if (this.bn_fld != null) {
				return 99;
			} else {
				int var1 = this.ad_fld.ay(ud.ak_fld.bm_fld, this.au_fld);
				if (var1 >= 100) {
					var1 = 99;
				}

				return var1;
			}
		} else {
			return 100;
		}
	}

	@ObfuscatedName("ib")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void ib(int var1) {
		try {
			eg(this, var1);
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ai() {
		if (1 != this.ax_fld && (!this.ar_fld || this.ax_fld != 2)) {
			if (this.bn_fld != null) {
				return 99;
			} else {
				int var1 = this.ad_fld.ay(ud.ak_fld.bm_fld, this.au_fld);
				if (var1 >= 100) {
					var1 = 99;
				}

				return var1;
			}
		} else {
			return 100;
		}
	}

	@ObfuscatedName("uv")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int uv() {
		return this.au_fld;
	}

	@ObfuscatedName("lb")
	@ObfuscatedSignature(
		descriptor = "([B)[B"
	)
	public static byte[] lb(byte[] var0) {
		return dn.bq(var0);
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	@Override
	public int bo(int var1) {
		if (null != this.bn_fld[var1]) {
			return 759648109;
		} else {
			return this.aa_fld[var1] ? 100 : this.ad_fld.ay(-902932606 * this.au_fld, var1);
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void am(int var1) {
		uu.xu(this.ad_fld, this.au_fld, var1, (byte)13);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void ad(int var1) {
		uu.xu(this.ad_fld, this.au_fld, var1, (byte)5);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void ao(int var1) {
		uu.xu(this.ad_fld, this.au_fld * 714027064, var1, (byte)80);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	void ap(int var1) {
		try {
			if (this.al_fld != null && null != this.aa_fld && this.aa_fld[var1]) {
				mk.ah(var1, this.al_fld, this, 716528218);
			} else {
				this.ad_fld.ah(this, -1213990119 * this.au_fld, var1, this.bk_fld[var1], (byte)4, true);
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	void at(int var1) {
		try {
			if (this.al_fld != null && null != this.aa_fld && this.aa_fld[var1]) {
				mk.ah(var1, this.al_fld, this, 1871057838);
			} else {
				this.ad_fld.ah(this, -1161171662 * this.au_fld, var1, this.bk_fld[var1], (byte)4, true);
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "([F[III)V"
	)
	static void af(float[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var5 = (var2 + var3) / 2;
			int var6 = var2;
			float var7 = var0[var5];
			var0[var5] = var0[var3];
			var0[var3] = var7;
			int var8 = var1[var5];
			var1[var5] = var1[var3];
			var1[var3] = var8;

			for (int var9 = var2; var9 < var3; var9++) {
				if (var0[var9] < var7) {
					float var10 = var0[var9];
					var0[var9] = var0[var6];
					var0[var6] = var10;
					int var11 = var1[var9];
					var1[var9] = var1[var6];
					var1[var6++] = var11;
				}
			}

			var0[var3] = var0[var6];
			var0[var6] = var7;
			var1[var3] = var1[var6];
			var1[var6] = var8;
			af(var0, var1, var2, var6 - 1);
			af(var0, var1, var6 + 1, var3);
		}
	}

	public uv(un var1, un var2, uu var3, int var4, boolean var5, boolean var6, boolean var7, boolean var8, boolean var9) throws EOFException {
		super(var5, var6);
		this.ar_fld = false;
		this.ax_fld = 0;
		this.an_fld = false;
		this.am_fld = -239067233;
		this.al_fld = var1;
		this.af_fld = var2;
		this.au_fld = var4;
		this.an_fld = var7;
		this.ar_fld = var8;
		this.as_fld = var9;
		this.ad_fld = var3;
		this.ad_fld.ae(this, this.au_fld, 421516210);
		this.uj(var1, var2, var3, var4, var5, var6, var7);
	}

	@ObfuscatedName("uj")
	@ObfuscatedSignature(
		descriptor = "(Lun;Lun;Luu;IZZZ)V"
	)
	public void uj(un var1, un var2, uu var3, int var4, boolean var5, boolean var6, boolean var7) {
		if (var4 >= 0 && var4 < 23) {
			client.xz_Arruv[var4] = this;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void aj() {
		this.ax_fld = -1411420502;
		this.bj_fld = new int[0];
		this.bk_fld = new int[0];
		this.by_fld = new int[0];
		this.bp_fld = new int[0];
		this.bv_fld = new int[0][];
		this.bn_fld = (Object[])(new Object[0]);
		this.bc_fld = (Object[][])(new Object[0][]);
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bm() {
		this.ax_fld = -1411420502;
		this.bj_fld = new int[0];
		this.bk_fld = new int[0];
		this.by_fld = new int[0];
		this.bp_fld = new int[0];
		this.bv_fld = new int[0][];
		this.bn_fld = (Object[])(new Object[0]);
		this.bc_fld = (Object[][])(new Object[0][]);
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bd() {
		this.ax_fld = -1411420502;
		this.bj_fld = new int[0];
		this.bk_fld = new int[0];
		this.by_fld = new int[0];
		this.bp_fld = new int[0];
		this.bv_fld = new int[0][];
		this.bn_fld = (Object[])(new Object[0]);
		this.bc_fld = (Object[][])(new Object[0][]);
	}

	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		descriptor = "([B)V"
	)
	public void hj(byte[] var1) {
		this.bg(var1, -1758388174);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lun;I[BZ)V"
	)
	void ay(un var1, int var2, byte[] var3, boolean var4) {
		if (var1 == this.af_fld) {
			if (this.ax_fld == 1) {
				throw new RuntimeException();
			}

			if (var3 == null) {
				this.ad_fld.fp(this, 255, this.au_fld, this.ai_fld, (byte)0, true);
			} else {
				int var6;
				synchronized (ay_fld) {
					ay_fld.reset();
					ay_fld.update(var3, 0, var3.length);
					var6 = (int)ay_fld.getValue();
				}

				if (var6 != this.ai_fld) {
					this.ad_fld.fp(this, 255, this.au_fld, this.ai_fld, (byte)0, true);
				} else {
					xi var16 = new xi(lb(var3));
					int var8 = var16.gf();
					if (var8 < 5 || var8 > 7) {
						throw new RuntimeException(var8 + "," + this.au_fld + "," + var2);
					}

					int var9 = 0;
					if (false) {
						var9 = var16.ka();
					}

					if (var9 != this.aq_fld) {
						this.ad_fld.fp(this, 255, this.au_fld, this.ai_fld, (byte)0, true);
					} else {
						this.hj(var3);
						this.da();
					}
				}
			}
		} else {
			if (!var4 && var2 == this.am_fld) {
				this.ax_fld = 1;
			}

			if (var3 != null && var3.length > 4) {
				int var15;
				synchronized (ay_fld) {
					ay_fld.reset();
					ay_fld.update(var3, 0, var3.length - 4);
					var15 = (int)ay_fld.getValue();
				}

				int var18 = (var3[var3.length - 4] & 255) << 24 | (var3[var3.length - 3] & 255) << 16 | (var3[var3.length - 2] & 255) << 8 | var3[var3.length - 1] & 255;
				if (var15 != super.bk_fld[var2] || var18 != super.by_fld[var2]) {
					synchronized (ay_fld) {
						ay_fld.reset();
						ay_fld.update(var3, 0, var3.length - 2);
						var15 = (int)ay_fld.getValue();
					}

					var18 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255);
				}

				if (var15 == super.bk_fld[var2] && var18 == super.by_fld[var2]) {
					this.aa_fld[var2] = true;
					if (var4) {
						if (!co_fld && super.bn_fld[var2] != null) {
							throw new AssertionError();
						}

						super.bn_fld[var2] = pb(var3);
					}
				} else {
					this.aa_fld[var2] = false;
					if (this.an_fld || var4) {
						this.ad_fld.fp(this, this.au_fld, var2, super.bk_fld[var2], (byte)4, var4);
					}
				}
			} else {
				this.aa_fld[var2] = false;
				if (this.an_fld || var4) {
					this.ad_fld.fp(this, this.au_fld, var2, super.bk_fld[var2], (byte)4, var4);
				}
			}
		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void bs(int var1, int var2) {
		try {
			this.ai_fld = var1;
			this.aq_fld = var2;
			if (this.af_fld != null) {
				mk.ah(this.au_fld, this.af_fld, this, 1441922486);
			} else {
				this.ad_fld.ah(this, ud.ak_fld.bm_fld, this.au_fld, this.ai_fld, (byte)0, true);
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int bw() {
		byte var1 = 0;
		int var2 = 0;

		for (int var3 = 0; var3 < this.bn_fld.length; var3++) {
			if (this.bp_fld[var3] > 0) {
				var1 += 100;
				var2 += this.ar(var3, -8656200);
			}
		}

		return var1 == 0 ? 100 : var2 * -1294683986 / var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	void ab(int var1) {
		try {
			if (this.al_fld != null && null != this.aa_fld && this.aa_fld[var1]) {
				mk.ah(var1, this.al_fld, this, 1623082739);
			} else {
				this.ad_fld.ah(this, this.au_fld, var1, this.bk_fld[var1], (byte)4, true);
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(Lun;I[BZ)V"
	)
	void bj(un var1, int var2, byte[] var3, boolean var4) {
		if (this.af_fld == var1) {
			if (1 == this.ax_fld) {
				throw new RuntimeException();
			} else if (var3 == null) {
				this.ad_fld.ah(this, ud.ak_fld.bm_fld, this.au_fld, this.ai_fld * -171676055, (byte)0, true);
			} else {
				ay_fld.reset();
				ay_fld.update(var3, 0, var3.length);
				int var11 = (int)ay_fld.getValue();
				if (var11 != this.ai_fld) {
					this.ad_fld.ah(this, ud.ak_fld.bm_fld, this.au_fld * 41094813, this.ai_fld, (byte)0, true);
				} else {
					xi var12 = new xi(dn.bq(var3));
					int var13 = var12.cg();
					if (var13 < 5 || var13 > 7) {
						throw new RuntimeException(var13 + "," + this.au_fld * -768626155 + "," + var2);
					} else {
						int var8 = 0;
						if (var13 >= 6) {
							var8 = var12.co();
						}

						if (this.aq_fld != var8) {
							this.ad_fld.ah(this, ud.ak_fld.bm_fld * -778475903, this.au_fld, -1190569972 * this.ai_fld, (byte)0, true);
						} else {
							this.bg(var3, -1758388174);
							bi(this, 68277720);
						}
					}
				}
			}
		} else {
			if (!var4 && this.am_fld == var2) {
				this.ax_fld = -705710251;
			}

			if (null != var3 && var3.length > 4) {
				ay_fld.reset();
				ay_fld.update(var3, 0, var3.length - 4);
				int var5 = (int)ay_fld.getValue();
				int var6 = (var3[var3.length - 1] & -1072530258)
					+ ((var3[var3.length - 3] & 619351990) << 16)
					+ ((var3[var3.length - 4] & 255) << 24)
					+ ((var3[var3.length - 2] & 255) << 8);
				if (this.bk_fld[var2] != var5 || var6 != this.by_fld[var2]) {
					ay_fld.reset();
					ay_fld.update(var3, 0, var3.length - 2);
					var5 = (int)ay_fld.getValue();
					var6 = ((var3[var3.length - 2] & 301739298) << 8) + (var3[var3.length - 1] & 255);
				}

				if (this.bk_fld[var2] == var5 && var6 == this.by_fld[var2]) {
					this.aa_fld[var2] = true;
					if (var4) {
						Object[] var7 = (Object[])this.bn_fld;
						Object var9;
						if (var3 == null) {
							var9 = null;
						} else if (var3.length > 136) {
							zx var10 = new zx();
							var10.az(var3, (byte)-79);
							var9 = var10;
						} else {
							var9 = var3;
						}

						var7[var2] = var9;
					}
				} else {
					this.aa_fld[var2] = false;
					if (this.an_fld || var4) {
						this.ad_fld.ah(this, this.au_fld, var2, this.bk_fld[var2], (byte)4, var4);
					}
				}
			} else {
				this.aa_fld[var2] = false;
				if (this.an_fld || var4) {
					this.ad_fld.ah(this, this.au_fld * 842712770, var2, this.bk_fld[var2], (byte)4, var4);
				}
			}
		}
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(Lun;I[BZ)V"
	)
	void bf(un var1, int var2, byte[] var3, boolean var4) {
		if (this.af_fld == var1) {
			if (1 == this.ax_fld) {
				throw new RuntimeException();
			} else if (var3 == null) {
				this.ad_fld.ah(this, ud.ak_fld.bm_fld, this.au_fld, this.ai_fld, (byte)0, true);
			} else {
				ay_fld.reset();
				ay_fld.update(var3, 0, var3.length);
				int var11 = (int)ay_fld.getValue();
				if (var11 != this.ai_fld) {
					this.ad_fld.ah(this, ud.ak_fld.bm_fld, this.au_fld, this.ai_fld, (byte)0, true);
				} else {
					xi var12 = new xi(dn.bq(var3));
					int var13 = var12.cg();
					if (var13 < 5 || var13 > 7) {
						throw new RuntimeException(var13 + "," + this.au_fld + "," + var2);
					} else {
						int var8 = 0;
						if (var13 >= 6) {
							var8 = var12.co();
						}

						if (this.aq_fld != var8) {
							this.ad_fld.ah(this, ud.ak_fld.bm_fld, this.au_fld, this.ai_fld, (byte)0, true);
						} else {
							this.bg(var3, -1758388174);
							bi(this, -1136578190);
						}
					}
				}
			}
		} else {
			if (!var4 && this.am_fld == var2) {
				this.ax_fld = -705710251;
			}

			if (null != var3 && var3.length > 4) {
				ay_fld.reset();
				ay_fld.update(var3, 0, var3.length - 4);
				int var5 = (int)ay_fld.getValue();
				int var6 = (var3[var3.length - 1] & 255)
					+ ((var3[var3.length - 3] & 255) << 16)
					+ ((var3[var3.length - 4] & 255) << 24)
					+ ((var3[var3.length - 2] & 255) << 8);
				if (this.bk_fld[var2] != var5 || var6 != this.by_fld[var2]) {
					ay_fld.reset();
					ay_fld.update(var3, 0, var3.length - 2);
					var5 = (int)ay_fld.getValue();
					var6 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255);
				}

				if (this.bk_fld[var2] == var5 && var6 == this.by_fld[var2]) {
					this.aa_fld[var2] = true;
					if (var4) {
						Object[] var7 = (Object[])this.bn_fld;
						Object var9;
						if (var3 == null) {
							var9 = null;
						} else if (var3.length > 136) {
							zx var10 = new zx();
							var10.az(var3, (byte)-72);
							var9 = var10;
						} else {
							var9 = var3;
						}

						var7[var2] = var9;
					}
				} else {
					this.aa_fld[var2] = false;
					if (this.an_fld || var4) {
						this.ad_fld.ah(this, this.au_fld, var2, this.bk_fld[var2], (byte)4, var4);
					}
				}
			} else {
				this.aa_fld[var2] = false;
				if (this.an_fld || var4) {
					this.ad_fld.ah(this, this.au_fld, var2, this.bk_fld[var2], (byte)4, var4);
				}
			}
		}
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void by() {
		this.aa_fld = new boolean[this.bn_fld.length];

		for (int var1 = 0; var1 < this.aa_fld.length; var1++) {
			this.aa_fld[var1] = false;
		}

		if (null == this.al_fld) {
			this.ax_fld = -705710251;
		} else {
			this.am_fld = -239067233;

			for (int var8 = 0; var8 < this.aa_fld.length; var8++) {
				if (this.bp_fld[var8] > 0) {
					un var2 = this.al_fld;
					ur var4 = new ur();
					var4.ak_fld = -1024334913;
					var4.hc_fld = var8;
					var4.az_fld = var2;
					var4.av_fld = this;
					synchronized (uw.ak_fld) {
						uw.ak_fld.av(var4);
					}

					ku.ay_void(288640297);
					this.am_fld = var8;
				}
			}

			if (this.am_fld == -1) {
				this.ax_fld = -705710251;
			}
		}
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(Luv;I)V"
	)
	public static void bi(uv var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.aa_fld = new boolean[var0.bn_fld.length];

			for (int var2 = 0; var2 < var0.aa_fld.length; var2++) {
				var0.aa_fld[var2] = false;
			}

			if (null == var0.al_fld) {
				var0.ax_fld = -705710251;
			} else {
				var0.am_fld = -239067233;

				for (int var9 = 0; var9 < var0.aa_fld.length; var9++) {
					if (var1 == 1639190925) {
						return;
					}

					if (var0.bp_fld[var9] > 0) {
						if (var1 == 1639190925) {
							return;
						}

						un var3 = var0.al_fld;
						ur var5 = new ur();
						var5.ak_fld = -1024334913;
						var5.hc_fld = var9;
						var5.az_fld = var3;
						var5.av_fld = var0;
						synchronized (uw.ak_fld) {
							uw.ak_fld.av(var5);
						}

						ku.ay_void(-365217009);
						var0.am_fld = var9;
					}
				}

				if (var0.am_fld == -1) {
					var0.ax_fld = -705710251;
				}
			}
		}
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bl() {
		this.aa_fld = new boolean[this.bn_fld.length];

		for (int var1 = 0; var1 < this.aa_fld.length; var1++) {
			this.aa_fld[var1] = false;
		}

		if (null == this.al_fld) {
			this.ax_fld = -705710251;
		} else {
			this.am_fld = -239067233;

			for (int var8 = 0; var8 < this.aa_fld.length; var8++) {
				if (this.bp_fld[var8] > 0) {
					un var2 = this.al_fld;
					ur var4 = new ur();
					var4.ak_fld = -1024334913;
					var4.hc_fld = var8;
					var4.az_fld = var2;
					var4.av_fld = this;
					synchronized (uw.ak_fld) {
						uw.ak_fld.av(var4);
					}

					ku.ay_void(-2037698460);
					this.am_fld = var8;
				}
			}

			if (this.am_fld == -1) {
				this.ax_fld = -705710251;
			}
		}
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	@Override
	public int bx(int var1) {
		if (null != this.bn_fld[var1]) {
			return 100;
		} else {
			return this.aa_fld[var1] ? 100 : this.ad_fld.ay(this.au_fld, var1);
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean af(int var1) {
		return this.aa_fld[var1];
	}

	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		descriptor = "(Luv;I)V"
	)
	public static void eg(uv var0, int var1) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			uu.xu(var0.ad_fld, var0.au_fld, var1, (byte)106);
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	@Override
	public int bp(int var1) {
		if (null != this.bn_fld[var1]) {
			return 100;
		} else {
			return this.aa_fld[var1] ? 100 : this.ad_fld.ay(this.au_fld, var1);
		}
	}

	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void da() {
		bi(this, -660140104);
	}

	@ObfuscatedName("pz")
	@ObfuscatedSignature(
		descriptor = "([BI[BII)I"
	)
	public static int pz(byte[] var0, int var1, byte[] var2, int var3, int var4) {
		return xn.ak(var0, var1, var2, var3, var4);
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	@Override
	public int bt(int var1) {
		if (null != this.bn_fld[var1]) {
			return 100;
		} else {
			return this.aa_fld[var1] ? 100 : this.ad_fld.ay(this.au_fld, var1);
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean ak(int var1) {
		return this.aa_fld[var1];
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean bu(int var1) {
		return this.aa_fld[var1];
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean bi(int var1) {
		return this.cp(var1, (byte)65) != null;
	}

	@ObfuscatedName("no")
	@ObfuscatedSignature(
		descriptor = "(Luv;)Z"
	)
	public static boolean no(uv var0) {
		if (var0 == null) {
			var0.getClass();
		}

		return 1 == var0.ax_fld;
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(Lun;I[BZ)V"
	)
	void bk(un var1, int var2, byte[] var3, boolean var4) {
		if (this.af_fld == var1) {
			if (1 == this.ax_fld) {
				throw new RuntimeException();
			} else if (var3 == null) {
				this.ad_fld.ah(this, ud.ak_fld.bm_fld, this.au_fld, this.ai_fld, (byte)0, true);
			} else {
				ay_fld.reset();
				ay_fld.update(var3, 0, var3.length);
				int var11 = (int)ay_fld.getValue();
				if (var11 != this.ai_fld) {
					this.ad_fld.ah(this, 1907884664 * ud.ak_fld.bm_fld, this.au_fld * 1930485152, this.ai_fld * -1955368367, (byte)0, true);
				} else {
					xi var12 = new xi(dn.bq(var3));
					int var13 = var12.cg();
					if (var13 < 5 || var13 > 7) {
						throw new RuntimeException(var13 + "," + this.au_fld * 1001317213 + "," + var2);
					} else {
						int var8 = 0;
						if (var13 >= 6) {
							var8 = var12.co();
						}

						if (this.aq_fld != var8) {
							this.ad_fld.ah(this, ud.ak_fld.bm_fld * -1326715863, this.au_fld, this.ai_fld, (byte)0, true);
						} else {
							this.bg(var3, -1758388174);
							bi(this, 2106582182);
						}
					}
				}
			}
		} else {
			if (!var4 && this.am_fld == var2) {
				this.ax_fld = -705710251;
			}

			if (null != var3 && var3.length > 4) {
				ay_fld.reset();
				ay_fld.update(var3, 0, var3.length - 4);
				int var5 = (int)ay_fld.getValue();
				int var6 = (var3[var3.length - 1] & -13295688)
					+ ((var3[var3.length - 3] & 255) << 16)
					+ ((var3[var3.length - 4] & 255) << 24)
					+ ((var3[var3.length - 2] & 2057093146) << 8);
				if (this.bk_fld[var2] != var5 || var6 != this.by_fld[var2]) {
					ay_fld.reset();
					ay_fld.update(var3, 0, var3.length - 2);
					var5 = (int)ay_fld.getValue();
					var6 = ((var3[var3.length - 2] & -213340559) << 8) + (var3[var3.length - 1] & 1016706964);
				}

				if (this.bk_fld[var2] == var5 && var6 == this.by_fld[var2]) {
					this.aa_fld[var2] = true;
					if (var4) {
						Object[] var7 = (Object[])this.bn_fld;
						Object var9;
						if (var3 == null) {
							var9 = null;
						} else if (var3.length > 136) {
							zx var10 = new zx();
							var10.az(var3, (byte)-6);
							var9 = var10;
						} else {
							var9 = var3;
						}

						var7[var2] = var9;
					}
				} else {
					this.aa_fld[var2] = false;
					if (this.an_fld || var4) {
						this.ad_fld.ah(this, this.au_fld, var2, this.bk_fld[var2], (byte)4, var4);
					}
				}
			} else {
				this.aa_fld[var2] = false;
				if (this.an_fld || var4) {
					this.ad_fld.ah(this, this.au_fld, var2, this.bk_fld[var2], (byte)4, var4);
				}
			}
		}
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void bz(int var1, int var2) {
		try {
			this.ai_fld = var1;
			this.aq_fld = var2;
			if (this.af_fld != null) {
				mk.ah(-713772117 * this.au_fld, this.af_fld, this, 1723635787);
			} else {
				this.ad_fld.ah(this, 1951618037 * ud.ak_fld.bm_fld, this.au_fld, this.ai_fld, (byte)0, true);
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void as(int var1) {
		this.aa_fld = new boolean[this.bn_fld.length];

		for (int var2 = 0; var2 < this.aa_fld.length; var2++) {
			this.aa_fld[var2] = false;
		}

		if (null == this.al_fld) {
			this.ax_fld = -705710251;
		} else {
			this.ai_fld = -239067233;

			for (int var9 = 0; var9 < this.aa_fld.length; var9++) {
				if (var1 == 1639190925) {
					return;
				}

				if (super.bo_fld[var9] > 0) {
					if (var1 == 1639190925) {
						return;
					}

					un var3 = this.al_fld;
					ur var5 = new ur();
					var5.ak_fld = -1024334913;
					var5.hc_fld = var9;
					var5.az_fld = var3;
					var5.av_fld = this;
					synchronized (uw.ak_fld) {
						uw.ak_fld.ao(var5);
					}

					ku.ay_void(-365217009);
					this.ai_fld = var9 * 239067233;
				}
			}

			if (this.au_fld == -1) {
				this.ax_fld = -705710251;
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void az(int var1, int var2) {
		try {
			this.am_fld = var1 * 70455723;
			this.aq_fld = -456987545 * var2;
			if (this.af_fld != null) {
				mk.ah(-1391795200 * this.ai_fld, this.af_fld, this, 1726567456);
			} else {
				this.ad_fld.ah(this, -456185395 * ud.ac_fld.bm_fld, this.ai_fld * -1801806727, 1646223619 * this.am_fld, (byte)0, true);
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean an() {
		return 1 == this.ax_fld;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int au(int var1) {
		if (1 != this.ax_fld && (!this.as_fld || this.ax_fld != 2)) {
			if (this.bn_fld != null) {
				return 99;
			} else {
				int var2 = this.ad_fld.ay(ud.ac_fld.bm_fld, this.ai_fld * -1801806727);
				if (var2 >= 100) {
					var2 = 99;
				}

				return var2;
			}
		} else {
			return 100;
		}
	}
}
