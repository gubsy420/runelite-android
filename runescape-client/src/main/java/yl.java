import java.io.EOFException;
import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;
import net.runelite.api.dbtable.DBRowConfig;

@ObfuscatedName("yl")
@Implements({"DBRowConfig"})
public class yl extends vc implements DBRowConfig {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "[[Ljava/lang/Object;"
	)
	Object[][] az_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	public static iw ag_fld = new iw(64);
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	public static ub ak_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "[[I"
	)
	int[][] av_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1878899559
	)
	public int ae_fld = 839790679;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int al_fld;

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Lyl;"
	)
	public static yl as(int var0) throws EOFException {
		try {
			yl var1 = (yl)ag_fld.ak(var0);
			if (var1 != null) {
				return var1;
			} else {
				byte[] var2 = ak_fld.bb(1377678792, var0, 584982574);
				var1 = new yl();
				if (null != var2) {
					var1.ag(new xi(var2), -1818511622);
				}

				var1.ae((byte)111);
				ag_fld.az(var1, var0);
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
			int var3 = var1.cg();
			if (var3 == 0) {
				return;
			}

			this.av(var1, var3, -961581785);
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxi;II)V"
	)
	void av(xi var1, int var2, int var3) {
		if (var2 == 3) {
			int var4 = var1.cg();
			if (this.az_fld == null) {
				this.az_fld = (Object[][])(new Object[var4][]);
				this.av_fld = new int[var4][];
			}

			for (int var5 = var1.cg(); var5 != 255; var5 = var1.cg()) {
				int var6 = var1.cg();
				int[] var7 = new int[var6];

				for (int var8 = 0; var8 < var6; var8++) {
					var7[var8] = var1.dz();
				}

				this.az_fld[var5] = (Object[])wu.av(var1, var7);
				this.av_fld[var5] = var7;
			}
		} else if (4 == var2) {
			if (var3 == 602658713) {
				return;
			}

			this.ae_fld = var1.dr();
		}
	}

	@ObfuscatedName("getTableID")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getTableID")
	@Override
	public int getTableID() {
		return this.ae_fld;
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(I)[Ljava/lang/Object;"
	)
	public Object[] ct(int var1) {
		return (Object[])this.az(var1, (byte)33);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ap() {
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Lyl;"
	)
	public static yl ah(int var0) throws EOFException {
		try {
			yl var1 = (yl)ag_fld.ak(var0);
			if (var1 != null) {
				return var1;
			} else {
				byte[] var2 = ak_fld.bb(38, var0, 584982574);
				var1 = new yl();
				if (null != var2) {
					var1.ag(new xi(var2), -1818511622);
				}

				var1.ae((byte)118);
				ag_fld.az(var1, var0);
				return var1;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Lyl;"
	)
	public static yl aw(int var0) throws EOFException {
		try {
			yl var1 = (yl)ag_fld.ak(var0);
			if (var1 != null) {
				return var1;
			} else {
				byte[] var2 = ak_fld.bb(38, var0, 584982574);
				var1 = new yl();
				if (null != var2) {
					var1.ag(new xi(var2), -1818511622);
				}

				var1.ae((byte)125);
				ag_fld.az(var1, var0);
				return var1;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IB)[Ljava/lang/Object;"
	)
	public Object[] az(int var1, byte var2) {
		return (Object[])(null == this.az_fld ? null : this.az_fld[var1]);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	void an(xi var1) {
		while (true) {
			int var2 = var1.cg();
			if (var2 == 0) {
				return;
			}

			this.av(var1, var2, -1616909494);
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Lyl;"
	)
	public static yl ar(int var0) throws EOFException {
		try {
			yl var1 = (yl)ag_fld.ak(var0);
			if (var1 != null) {
				return var1;
			} else {
				byte[] var2 = ak_fld.bb(38, var0, 584982574);
				var1 = new yl();
				if (null != var2) {
					var1.ag(new xi(var2), -1818511622);
				}

				var1.ae((byte)108);
				ag_fld.az(var1, var0);
				return var1;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	void am(xi var1, int var2) {
		if (var2 == 3) {
			int var3 = var1.cg();
			if (this.az_fld == null) {
				this.az_fld = (Object[][])(new Object[var3][]);
				this.av_fld = new int[var3][];
			}

			for (int var4 = var1.cg(); var4 != 255; var4 = var1.cg()) {
				int var5 = var1.cg();
				int[] var6 = new int[var5];

				for (int var7 = 0; var7 < var5; var7++) {
					var6[var7] = var1.dz();
				}

				this.az_fld[var4] = (Object[])wu.av(var1, var6);
				this.av_fld[var4] = var6;
			}
		} else if (4 == var2) {
			this.ae_fld = var1.dr();
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	void al(xi var1) {
		while (true) {
			int var2 = var1.cg();
			if (var2 == 0) {
				return;
			}

			this.av(var1, var2, 2046681368);
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	void au(xi var1) {
		while (true) {
			int var2 = var1.cg();
			if (var2 == 0) {
				return;
			}

			this.av(var1, var2, -1434726212);
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	void ae(byte var1) {
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	void aq(xi var1, int var2) {
		if (var2 == 3) {
			int var3 = var1.cg();
			if (this.az_fld == null) {
				this.az_fld = (Object[][])(new Object[var3][]);
				this.av_fld = new int[var3][];
			}

			for (int var4 = var1.cg(); var4 != 255; var4 = var1.cg()) {
				int var5 = var1.cg();
				int[] var6 = new int[var5];

				for (int var7 = 0; var7 < var5; var7++) {
					var6[var7] = var1.dz();
				}

				this.az_fld[var4] = (Object[])wu.av(var1, var6);
				this.av_fld[var4] = var6;
			}
		} else if (4 == var2) {
			this.ae_fld = var1.dr();
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)[Ljava/lang/Object;"
	)
	public Object[] aa(int var1) {
		return (Object[])(null == this.az_fld ? null : this.az_fld[var1]);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	void ax(xi var1) {
		while (true) {
			int var2 = var1.cg();
			if (var2 == 0) {
				return;
			}

			this.av(var1, var2, -756453964);
		}
	}

	yl() {
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	void ad(xi var1, int var2) {
		if (var2 == 3) {
			int var3 = var1.cg();
			if (this.az_fld == null) {
				this.az_fld = (Object[][])(new Object[var3][]);
				this.av_fld = new int[var3][];
			}

			for (int var4 = var1.cg(); var4 != 1722231911; var4 = var1.cg()) {
				int var5 = var1.cg();
				int[] var6 = new int[var5];

				for (int var7 = 0; var7 < var5; var7++) {
					var6[var7] = var1.dz();
				}

				this.az_fld[var4] = (Object[])wu.av(var1, var6);
				this.av_fld[var4] = var6;
			}
		} else if (4 == var2) {
			this.ae_fld = var1.dr();
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Lyl;"
	)
	public static yl ay(int var0) throws EOFException {
		try {
			yl var1 = (yl)ag_fld.ak(var0);
			if (var1 != null) {
				return var1;
			} else {
				byte[] var2 = ak_fld.bb(38, var0, 584982574);
				var1 = new yl();
				if (null != var2) {
					var1.ag(new xi(var2), -1818511622);
				}

				var1.ae((byte)117);
				ag_fld.az(var1, var0);
				return var1;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}
}
