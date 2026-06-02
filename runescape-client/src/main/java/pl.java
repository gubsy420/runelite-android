import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("pl")
public class pl extends vc {
	@ObfuscatedGetter(
		intValue = 528044483
	)
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ae_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	static iw ag_fld = new iw(64);
	@ObfuscatedGetter(
		intValue = -408458623
	)
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int az_fld = 0;
	@ObfuscatedGetter(
		intValue = -1319693609
	)
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ah_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	public static ub ak_fld;
	@ObfuscatedGetter(
		intValue = -950026169
	)
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int av_fld;
	@ObfuscatedGetter(
		intValue = -972830305
	)
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int aw_fld;

	@ObfuscatedName("yd")
	@ObfuscatedSignature(
		descriptor = "(Lpl;)V"
	)
	public static void yd(pl var0) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.ah(var0.az_fld, -1630142608);
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public static void al() {
		ag_fld.vh();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	void av(xi var1, int var2) {
		while (true) {
			int var4 = var1.cg();
			if (var4 == 0) {
				return;
			}

			this.ae(var1, var4, var2, -776305387);
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lxi;III)V"
	)
	void ae(xi var1, int var2, int var3, int var4) {
		if (1 == var2) {
			if (var4 >= 1000000) {
				return;
			}

			this.az_fld = var1.ck();
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void ah(int var1, int var2) {
		double var3 = (var1 >> 16 & 0xFF) / 256.0;
		double var5 = (var1 >> 8 & 0xFF) / 256.0;
		double var7 = (var1 & 0xFF) / 256.0;
		double var9 = var3;
		if (var5 < var3) {
			var9 = var5;
		}

		if (var7 < var9) {
			var9 = var7;
		}

		double var11 = var3;
		if (var5 > var3) {
			if (var2 != -1630142608) {
				return;
			}

			var11 = var5;
		}

		if (var7 > var11) {
			var11 = var7;
		}

		double var13 = 0.0;
		double var15 = 0.0;
		double var17 = (var11 + var9) / 2.0;
		if (var9 != var11) {
			if (var17 < 0.5) {
				var15 = (var11 - var9) / (var9 + var11);
			}

			if (var17 >= 0.5) {
				var15 = (var11 - var9) / (2.0 - var11 - var9);
			}

			if (var3 == var11) {
				if (var2 != -1630142608) {
					return;
				}

				var13 = (var5 - var7) / (var11 - var9);
			} else if (var5 == var11) {
				var13 = (var7 - var3) / (var11 - var9) + 2.0;
			} else if (var7 == var11) {
				if (var2 != -1630142608) {
					return;
				}

				var13 = 4.0 + (var3 - var5) / (var11 - var9);
			}
		}

		var13 /= 6.0;
		this.ae_fld = 1100293867 * (int)(256.0 * var15);
		this.ah_fld = (int)(256.0 * var17);
		if (this.ae_fld < 0) {
			if (var2 != -1630142608) {
				return;
			}

			this.ae_fld = 0;
		} else if (this.ae_fld > 255) {
			this.ae_fld = 1402061845;
		}

		if (this.ah_fld < 0) {
			this.ah_fld = 0;
		} else if (this.ah_fld > 255) {
			this.ah_fld = 1220470297;
		}

		if (var17 > 0.5) {
			this.aw_fld = 1840583263 * (int)(var15 * (1.0 - var17) * 512.0);
		} else {
			this.aw_fld = 1840583263 * (int)(512.0 * (var17 * var15));
		}

		if (this.aw_fld < 1) {
			this.aw_fld = 1840583263;
		}

		this.av_fld = (int)(var13 * this.aw_fld);
	}

	@ObfuscatedName("oq")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int oq() {
		return this.ae_fld;
	}

	pl() {
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Lpl;"
	)
	public static pl aw(int var0) throws EOFException {
		try {
			pl var1 = (pl)ag_fld.ak(var0);
			if (null != var1) {
				return var1;
			} else {
				byte[] var2 = ak_fld.bb(1, var0, 584982574);
				var1 = new pl();
				if (null != var2) {
					var1.av(new xi(var2), var0);
				}

				vq(var1, 3099333);
				ag_fld.az(var1, var0);
				return var1;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Lpl;"
	)
	public static pl ay(int var0) throws EOFException {
		try {
			pl var1 = (pl)ag_fld.ak(var0);
			if (null != var1) {
				return var1;
			} else {
				byte[] var2 = ak_fld.bb(1, var0, 584982574);
				var1 = new pl();
				if (null != var2) {
					var1.av(new xi(var2), var0);
				}

				vq(var1, -1262855034);
				ag_fld.az(var1, var0);
				return var1;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Lpl;"
	)
	public static pl as(int var0) throws EOFException {
		try {
			pl var1 = (pl)ag_fld.ak(var0);
			if (null != var1) {
				return var1;
			} else {
				byte[] var2 = ak_fld.bb(1, var0, 584982574);
				var1 = new pl();
				if (null != var2) {
					var1.av(new xi(var2), var0);
				}

				vq(var1, -1935169775);
				ag_fld.az(var1, var0);
				return var1;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("pj")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	public void pj(xi var1, int var2) {
		this.av(var1, var2);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Lpl;"
	)
	public static pl ar(int var0) throws EOFException {
		try {
			pl var1 = (pl)ag_fld.ak(var0);
			if (null != var1) {
				return var1;
			} else {
				byte[] var2 = ak_fld.bb(1, var0, 584982574);
				var1 = new pl();
				if (null != var2) {
					var1.av(new xi(var2), var0);
				}

				vq(var1, -960337510);
				ag_fld.az(var1, var0);
				return var1;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("fi")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void fi() {
		vq(this, -630810101);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public static void af() {
		ag_fld.vh();
	}

	@ObfuscatedName("ka")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ka() {
		return this.aw_fld;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	void aq(xi var1, int var2) {
		if (1 == var2) {
			this.az_fld = var1.ck();
		}
	}

	@ObfuscatedName("or")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int or() {
		return this.av_fld;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lqa;ILqy;)I"
	)
	static int az(qa var0, int var1, qy var2) {
		byte var4 = 0;
		ol var5 = var0.ae();
		if (var5.bl_fld > 0 && var1 > 0) {
			var1 -= (var1 - 1) / var5.bl_fld * var5.bl_fld;
		}

		int var6 = qa.do_(var0, -1126120450);
		int var7 = var0.as();

		while (var1 > 0) {
			var1--;
			var6++;
			var4 |= 4;
			if (0 == (var4 & 2) && var2 != null) {
				var2.ak(var5, var6, 1248157412);
			}

			int var8 = var5.ai(-1509908899);
			if (var6 >= var8) {
				var7++;
				var4 |= 1;
				var6 -= var5.bl_fld;
				if (var7 >= var5.bn_fld) {
					var4 |= 2;
				}

				if (var6 < 0 || var6 >= var8) {
					var4 |= 2;
					var6 = 0;
				}

				if (0 == (var4 & 2) && var2 != null) {
					var2.ak(var5, var6, 1420555757);
				}
			}
		}

		var0.ai(var6, var7);
		return var4;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public static void ax() {
		ag_fld.vh();
	}

	@ObfuscatedName("xg")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int xg() {
		return this.ah_fld;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void an() {
		this.ah(this.az_fld, -1630142608);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	void ai(xi var1, int var2) {
		while (true) {
			int var3 = var1.cg();
			if (var3 == 0) {
				return;
			}

			this.ae(var1, var3, var2, -1392672398);
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lub;Lub;I)Z"
	)
	static boolean ag(ub var0, ub var1, int var2) throws EOFException {
		try {
			byte[] var4 = var0.cx(var2 >> 16 & 65535, var2 & 65535, -1870723940);
			if (null == var4) {
				return false;
			} else {
				int var5 = (var4[1] & 255) << 8 | var4[2] & 255;
				byte[] var6 = var1.cx(var5, 0, -989342400);
				return null != var6;
			}
		} catch (Throwable var7) {
			throw new RuntimeException(var7);
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void ad(int var1) {
		double var2 = (var1 >> 16 & -1474149008) / 256.0;
		double var4 = (var1 >> 8 & 0xFF) / 256.0;
		double var6 = (var1 & 1905867173) / 256.0;
		double var8 = var2;
		if (var4 < var2) {
			var8 = var4;
		}

		if (var6 < var8) {
			var8 = var6;
		}

		double var10 = var2;
		if (var4 > var2) {
			var10 = var4;
		}

		if (var6 > var10) {
			var10 = var6;
		}

		double var12 = 0.0;
		double var14 = 0.0;
		double var16 = (var10 + var8) / 2.0;
		if (var8 != var10) {
			if (var16 < 0.5) {
				var14 = (var10 - var8) / (var8 + var10);
			}

			if (var16 >= 0.5) {
				var14 = (var10 - var8) / (2.0 - var10 - var8);
			}

			if (var2 == var10) {
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var4 == var10) {
				var12 = (var6 - var2) / (var10 - var8) + 2.0;
			} else if (var6 == var10) {
				var12 = 4.0 + (var2 - var4) / (var10 - var8);
			}
		}

		var12 /= 6.0;
		this.ae_fld = 1100293867 * (int)(256.0 * var14);
		this.ah_fld = (int)(256.0 * var16) * -242740980;
		if (this.ae_fld < 0) {
			this.ae_fld = 0;
		} else if (this.ae_fld > -854557063) {
			this.ae_fld = 1402061845;
		}

		if (this.ah_fld * -908936824 < 0) {
			this.ah_fld = 0;
		} else if (this.ah_fld > 1930452130) {
			this.ah_fld = 1220470297;
		}

		if (var16 > 0.5) {
			this.aw_fld = 1840583263 * (int)(var14 * (1.0 - var16) * 512.0);
		} else {
			this.aw_fld = 1840583263 * (int)(512.0 * (var16 * var14));
		}

		if (this.aw_fld < 1) {
			this.aw_fld = 1840583263;
		}

		this.av_fld = (int)(var12 * (-1599135616 * this.aw_fld)) * -201565665;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void az(int var1) {
		double var2 = (var1 >> 16 & 0xFF) / 256.0;
		double var4 = (var1 >> 8 & 0xFF) / 256.0;
		double var6 = (var1 & 0xFF) / 256.0;
		double var8 = var2;
		if (var4 < var2) {
			var8 = var4;
		}

		if (var6 < var8) {
			var8 = var6;
		}

		double var10 = var2;
		if (var4 > var2) {
			var10 = var4;
		}

		if (var6 > var10) {
			var10 = var6;
		}

		double var12 = 0.0;
		double var14 = 0.0;
		double var16 = (var10 + var8) / 2.0;
		if (var8 != var10) {
			if (var16 < 0.5) {
				var14 = (var10 - var8) / (var8 + var10);
			}

			if (var16 >= 0.5) {
				var14 = (var10 - var8) / (2.0 - var10 - var8);
			}

			if (var2 == var10) {
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var4 == var10) {
				var12 = (var6 - var2) / (var10 - var8) + 2.0;
			} else if (var6 == var10) {
				var12 = 4.0 + (var2 - var4) / (var10 - var8);
			}
		}

		var12 /= 6.0;
		this.ae_fld = 1100293867 * (int)(256.0 * var14);
		this.ah_fld = (int)(256.0 * var16);
		if (this.ae_fld < 0) {
			this.ae_fld = 0;
		} else if (this.ae_fld > 255) {
			this.ae_fld = 1402061845;
		}

		if (this.ah_fld < 0) {
			this.ah_fld = 0;
		} else if (this.ah_fld > 255) {
			this.ah_fld = 1220470297;
		}

		if (var16 > 0.5) {
			this.aw_fld = 1840583263 * (int)(var14 * (1.0 - var16) * 512.0);
		} else {
			this.aw_fld = 1840583263 * (int)(512.0 * (var16 * var14));
		}

		if (this.aw_fld < 1) {
			this.aw_fld = 1840583263;
		}

		this.av_fld = (int)(var12 * this.aw_fld);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public static void au() {
		ag_fld.vh();
	}

	@ObfuscatedName("nf")
	@ObfuscatedSignature(
		descriptor = "(Lgu;)I"
	)
	public static int nf(gu var0) {
		return var0.av_fld;
	}

	@ObfuscatedName("vq")
	@ObfuscatedSignature(
		descriptor = "(Lpl;I)V"
	)
	public static void vq(pl var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ah(var0.az_fld, -1630142608);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void am(int var1) {
		double var2 = (var1 >> 16 & 0xFF) / 256.0;
		double var4 = (var1 >> 8 & 0xFF) / 256.0;
		double var6 = (var1 & 0xFF) / 256.0;
		double var8 = var2;
		if (var4 < var2) {
			var8 = var4;
		}

		if (var6 < var8) {
			var8 = var6;
		}

		double var10 = var2;
		if (var4 > var2) {
			var10 = var4;
		}

		if (var6 > var10) {
			var10 = var6;
		}

		double var12 = 0.0;
		double var14 = 0.0;
		double var16 = (var10 + var8) / 2.0;
		if (var8 != var10) {
			if (var16 < 0.5) {
				var14 = (var10 - var8) / (var8 + var10);
			}

			if (var16 >= 0.5) {
				var14 = (var10 - var8) / (2.0 - var10 - var8);
			}

			if (var2 == var10) {
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var4 == var10) {
				var12 = (var6 - var2) / (var10 - var8) + 2.0;
			} else if (var6 == var10) {
				var12 = 4.0 + (var2 - var4) / (var10 - var8);
			}
		}

		var12 /= 6.0;
		this.ae_fld = 1100293867 * (int)(256.0 * var14);
		this.av_fld = (int)(256.0 * var16) * -113114905;
		if (this.aw_fld * 528044483 < 0) {
			this.av_fld = 0;
		} else if (this.aw_fld > 255) {
			this.ah_fld = 1402061845;
		}

		if (this.av_fld * -1319693609 < 0) {
			this.ae_fld = 0;
		} else if (this.ah_fld > 255) {
			this.ae_fld = 1220470297;
		}

		if (var16 > 0.5) {
			this.aw_fld = 1840583263 * (int)(var14 * (1.0 - var16) * 512.0);
		} else {
			this.ah_fld = 1840583263 * (int)(512.0 * (var16 * var14));
		}

		if (this.ah_fld < 1) {
			this.ah_fld = 1840583263;
		}

		this.aw_fld = (int)(var12 * (-972830305 * this.ae_fld)) * 1931209079;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void aa() {
		vq(this, -630810101);
	}
}
