import java.io.EOFException;
import net.runelite.api.Nameable;
import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;
import net.runelite.api.events.NameableNameChanged;

@ObfuscatedName("rl")
@Implements({"Nameable"})
public class rl implements Nameable {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Laax;"
	)
	aax av_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Laax;"
	)
	aax az_fld;
	@ObfuscatedName("pe")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -2048553853
	)
	static int pe_fld;

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String bk() {
		return this.av_fld == null ? "" : this.av_fld.ak(1794767247);
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String bh() {
		return this.av_fld == null ? "" : this.av_fld.ak(1069230467);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;"
	)
	public String at(byte var1) {
		return this.az_fld == null ? "" : this.az_fld.ak(-731976535);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)I"
	)
	public int ae(Object var1) {
		return this.ad((rl)var1, -618401172);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lrl;I)I"
	)
	public int ad(rl var1, int var2) {
		return this.az_fld.av(var1.az_fld, -1063100849);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Laax;"
	)
	public aax ap(int var1) {
		return this.az_fld;
	}

	@ObfuscatedName("compareTo")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)I"
	)
	public int compareTo(Nameable var1) {
		return this.ad((rl)var1, -1740762231);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lrl;)I"
	)
	public int ao(rl var1) {
		return this.az_fld.av(var1.az_fld, -943028671);
	}

	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "(Lrl;B)Ljava/lang/String;"
	)
	public static String dx(rl var0, byte var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.av_fld == null ? "" : var0.av_fld.ak(-184799862);
	}

	@ObfuscatedName("vx")
	@ObfuscatedSignature(
		descriptor = "()Laax;"
	)
	public aax vx() {
		return this.av_fld;
	}

	@ObfuscatedName("getName")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	@Export("getName")
	@Override
	public String getName() {
		return this.gc().cl();
	}

	@ObfuscatedName("pl")
	@ObfuscatedSignature(
		descriptor = "(Lqa;I)V"
	)
	public static void pl(qa var0, int var1) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			if (var1 >= 0) {
				if (var0.ag_fld != var1) {
					var0.ag_fld = var1 * -1457597965;
					var0.az_fld = hm.ak(var1);
					var0.aw_fld = 0;
					if (-1 == var0.ae_fld) {
						var0.ae_fld = 0;
					}
				}
			} else {
				var0.ag_fld = -991323536;
				var0.az_fld = null;
				var0.ae_fld = -1085309643;
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "()Laax;"
	)
	public aax bd() {
		return this.az_fld;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "()Laax;"
	)
	public aax bm() {
		return this.az_fld;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lrl;)I"
	)
	public int ab(rl var1) {
		return this.az_fld.av(var1.az_fld, -722325624);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Laax;Laax;B)V"
	)
	void aj(aax var1, aax var2, byte var3) {
		if (null == var1) {
			throw new NullPointerException();
		} else {
			this.az_fld = var1;
			this.av_fld = var2;
			this.hh(-1);
		}
	}

	@ObfuscatedName("hh")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void hh(int var1) {
		NameableNameChanged var2 = new NameableNameChanged(this);
		og.ci_fld.getCallbacks().post(var2);
	}

	@ObfuscatedName("gc")
	@ObfuscatedSignature(
		descriptor = "()Laax;"
	)
	public aax gc() {
		return this.az_fld;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "()Laax;"
	)
	public aax br() {
		return this.az_fld;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String bs() {
		return this.az_fld == null ? "" : this.az_fld.ak(860364259);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Leg;)V"
	)
	public static void aj(eg var0) {
		if (var0 == null) {
			var0.getClass();
		}

		for (int var1 = 0; var1 < var0.as_fld; var1++) {
			var0.wl_fld[var1] = -((int)var0.wl_fld[var1]);
		}

		for (int var3 = 0; var3 < var0.au_fld; var3++) {
			int var2 = var0.ax_fld[var3];
			var0.ax_fld[var3] = var0.aa_fld[var3];
			var0.aa_fld[var3] = var2;
		}

		var0.by();
	}

	@ObfuscatedName("ix")
	@ObfuscatedSignature(
		descriptor = "(Lgh;)I"
	)
	public static int ix(gh var0) {
		return var0.ar_fld * var0.af_fld;
	}

	rl() {
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(Laax;Laax;)V"
	)
	void bj(aax var1, aax var2) {
		if (null == var1) {
			throw new NullPointerException();
		} else {
			this.az_fld = var1;
			this.av_fld = var2;
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(ILba;ZI)I"
	)
	static int bd(int var0, ba var1, boolean var2) throws EOFException {
		try {
			lu var4 = cf.cg_fld.ak(bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127]);
			if (2500 == var0) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var4.bq_fld;
				return 1;
			} else if (2501 == var0) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var4.bg_fld;
				return 1;
			} else if (2502 == var0) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var4.bb_fld;
				return 1;
			} else if (2503 == var0) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var4.cd_fld;
				return 1;
			} else if (2504 == var0) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var4.cf_fld ? 1 : 0;
				return 1;
			} else if (2505 == var0) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var4.cv_fld;
				return 1;
			} else if (2506 == var0) {
				int var5 = var4.cv_fld;
				if (-1 == var5) {
					uo var6 = cf.cg_fld;

					for (pk var7 = (pk)var6.an_fld.av(); var7 != null; var7 = (pk)var6.an_fld.ae()) {
						if (var4.bf_fld >> 16 == var7.ak_fld) {
							var5 = (int)var7.hc_long;
							break;
						}
					}
				}

				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var5;
				return 1;
			} else {
				return 2;
			}
		} catch (Throwable var8) {
			throw new RuntimeException(var8);
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;"
	)
	public String ac(byte var1) {
		return this.av_fld == null ? "" : this.az_fld.ak(-731976535);
	}

	@ObfuscatedName("getPrevName")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	@Export("getPrevName")
	@Override
	public String getPrevName() {
		aax var1 = this.vx();
		return var1 == null ? null : var1.cl();
	}

	@ObfuscatedName("wr")
	@ObfuscatedSignature(
		descriptor = "(Lrl;)Ljava/lang/String;"
	)
	public static String wr(rl var0) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.az_fld == null ? "" : var0.az_fld.ak(1188621342);
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String be() {
		return this.az_fld == null ? "" : this.av_fld.ak(1188621342);
	}
}
