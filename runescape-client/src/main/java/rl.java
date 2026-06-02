import java.io.EOFException;
import net.runelite.api.Nameable;
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
	@ObfuscatedGetter(
		intValue = -2048553853
	)
	@ObfuscatedName("pe")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int pe_fld;

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String bh() {
		return this.av_fld == null ? "" : this.av_fld.ak(1069230467);
	}

	@ObfuscatedName("mo")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void mo(int var1) {
		NameableNameChanged var2 = new NameableNameChanged(this);
		og.ci_fld.getCallbacks().post(var2);
	}

	@ObfuscatedName("xz")
	@ObfuscatedSignature(
		descriptor = "(Lzg;I)I"
	)
	public static int xz(zg var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.aq(var1, var1 + 1, 1368701901);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;"
	)
	public String at(byte var1) {
		return this.av_fld == null ? "" : this.av_fld.ak(-184799862);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)I"
	)
	public int ae(Object var1) {
		return this.ad((rl)var1, -618401172);
	}

	@ObfuscatedName("tq")
	@ObfuscatedSignature(
		descriptor = "()Laax;"
	)
	public aax tq() {
		return this.az_fld;
	}

	@ObfuscatedName("getPrevName")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	@Override
	public String getPrevName() {
		aax var1 = this.if_();
		return var1 == null ? null : var1.ah();
	}

	@ObfuscatedName("vz")
	@ObfuscatedSignature(
		descriptor = "(Lrl;)Ljava/lang/String;"
	)
	public static String vz(rl var0) {
		return var0.av_fld == null ? "" : var0.av_fld.ak(1794767247);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lrl;I)I"
	)
	public int ad(rl var1, int var2) {
		return this.az_fld.av(var1.az_fld, -1063100849);
	}

	@ObfuscatedName("getName")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	@Override
	public String getName() {
		return this.tq().ah();
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
		descriptor = "(Lnet/runelite/api/Nameable;)I"
	)
	public int compareTo(Nameable var1) {
		return this.ad((rl)var1, -1740762231);
	}

	@ObfuscatedName("if")
	@ObfuscatedSignature(
		descriptor = "()Laax;"
	)
	public aax if_() {
		return this.av_fld;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lrl;)I"
	)
	public int ao(rl var1) {
		return this.az_fld.av(var1.az_fld, -943028671);
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
			this.mo(-1);
		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String bs() {
		return this.az_fld == null ? "" : this.az_fld.ak(860364259);
	}

	@ObfuscatedName("ih")
	@ObfuscatedSignature(
		descriptor = "(Lsl;ILjava/lang/Object;)V"
	)
	public static void ih(sl var0, int var1, Object var2) {
		if (var0.ag_fld == yq.ak_fld) {
			var0.aw_fld[var1] = (Integer)var2;
		} else if (var0.ag_fld == yq.ag_fld) {
			var0.ay_fld[var1] = (Long)var2;
		} else {
			var0.as_fld[var1] = var2;
		}
	}

	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		descriptor = "(Lrl;B)Ljava/lang/String;"
	)
	public static String hv(rl var0, byte var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.az_fld == null ? "" : var0.az_fld.ak(-731976535);
		}
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

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "()Laax;"
	)
	public aax bz() {
		return this.az_fld;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(ILba;Z)I"
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

					for (pk var7 = (pk)var6.ai_fld.aq(); var7 != null; var7 = (pk)xz.aa(var6.ai_fld)) {
						if (var4.bf_fld >> 16 == var7.ak_fld) {
							var5 = (int)var7.hc_fld;
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
		return this.az_fld == null ? "" : this.av_fld.ak(-731976535);
	}
}
