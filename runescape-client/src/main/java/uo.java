import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("uo")
public class uo extends lw {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	public lu aq_fld;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 243771749
	)
	public int aa_fld;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	lu ac_fld;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lxz;"
	)
	public xz an_fld;
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "Lui;"
	)
	ui bm_fld;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -85253729
	)
	public int at_fld;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lxz;"
	)
	public xz ai_fld = new xz(512);
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Luk;"
	)
	uk aj_fld;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 243771749
	)
	public int ap_fld;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public boolean bd_fld;

	@ObfuscatedName("uq")
	@ObfuscatedSignature(
		descriptor = "(Luo;Llu;)Llu;"
	)
	public static lu uq(uo var0, lu var1) throws EOFException {
		if (var0 == null) {
			var0.getClass();
		}

		int var3 = xd(var0, var1, -2146673426);
		int var2 = var3 >> 17 & 7;
		int var4 = var2;
		if (0 == var2) {
			return null;
		} else {
			for (int var5 = 0; var5 < var4; var5++) {
				var1 = var0.ak(var1.cv_fld);
				if (null == var1) {
					return null;
				}
			}

			return var1;
		}
	}

	@ObfuscatedName("md")
	@ObfuscatedSignature(
		descriptor = "(Luo;Llu;I)Z"
	)
	public static boolean md(uo var0, lu var1, int var2) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.ac_fld == var1;
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean be() {
		return null == this.ac_fld;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void aa() {
		this.aa_fld = -501964909;
		this.an_fld = new xz(8);
		this.ac_fld = null;
		this.aj_fld.az();
		this.aj_fld.ad();
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(Llu;)V"
	)
	public void cb(lu var1) {
		this.ac_fld = var1;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Llu;I)Z"
	)
	public boolean am(lu var1) {
		return var1.cf_fld;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Llu;II)Ljava/lang/String;"
	)
	public String ad(lu var1, int var2) {
		if (!bh.ak(this.at(var1), var2, 1904387873) && var1.ft_fld == null) {
			return null;
		} else {
			return var1.ei_fld != null && var1.ei_fld.length > var2 && var1.ei_fld[var2] != null && !var1.ei_fld[var2].trim().isEmpty() ? var1.ei_fld[var2] : null;
		}
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(Llu;)Llu;"
	)
	public lu cd(lu var1) throws EOFException {
		int var3 = xd(this, var1, 814856613);
		int var2 = var3 >> 17 & 7;
		int var4 = var2;
		if (0 == var2) {
			return null;
		} else {
			for (int var5 = 0; var5 < var4; var5++) {
				var1 = this.ak(var1.cv_fld);
				if (null == var1) {
					return null;
				}
			}

			return var1;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void ab(int var1, int var2) {
		for (lg var3 = (lg)this.ai_fld.av(); null != var3; var3 = (lg)this.ai_fld.ae()) {
			if (var1 == (var3.hc_long >> 16 & 65535L)) {
				if (var2 == -2068515547) {
					return;
				}

				var3.gy();
			}
		}
	}

	@ObfuscatedName("vt")
	@ObfuscatedSignature(
		descriptor = "(Llu;)I"
	)
	public int vt(lu var1) {
		return xd(this, var1, -1059133210);
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(Llu;)I"
	)
	public int bc(lu var1) {
		lg var2 = (lg)xz.tw(this.ai_fld, var1.bf_fld * -2097943517);
		int var4 = -1146048298 * var1.by_fld;
		lg var5 = var2;

		lg var3;
		while (true) {
			if (null == var5) {
				var3 = null;
				break;
			}

			if (var4 >= var5.ak_fld && var4 <= var5.ag_fld) {
				var3 = var5;
				break;
			}

			var5 = var5.ae_fld;
		}

		return null != var3 ? lg.lq(var3, -1724411564) : var1.ec_fld;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Llu;B)I"
	)
	public int at(lu var1) {
		lg var3 = (lg)xz.tw(this.ai_fld, var1.bf_fld);
		int var5 = var1.by_fld;
		lg var6 = var3;

		lg var4;
		while (true) {
			if (null == var6) {
				var4 = null;
				break;
			}

			if (var5 >= var6.ak_fld && var5 <= var6.ag_fld) {
				var4 = var6;
				break;
			}

			var6 = var6.ae_fld;
		}

		if (null != var4) {
			return var4.ag(337216766);
		} else {
			int var8 = var1.ec_fld;
			return var8 >> 1 & 1023;
		}
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void bf() {
		this.aa_fld = 1927841294;
		this.an_fld = new xz(8);
		this.ac_fld = null;
		this.aj_fld.az();
		this.aj_fld.ad();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Llu;B)Llu;"
	)
	lu aj(lu var1) throws EOFException {
		lu var3 = kl(this, var1, -446176385);
		if (var3 == null) {
			var3 = var1.ea_fld;
		}

		return var3;
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "()Llu;"
	)
	public lu ce() {
		return uk.wc(this.aj_fld, (byte)-31);
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(Llu;)I"
	)
	public int bb(lu var1) {
		lg var2 = (lg)xz.tw(this.ai_fld, var1.bf_fld);
		int var4 = var1.by_fld;
		lg var5 = var2;

		lg var3;
		while (true) {
			if (null == var5) {
				var3 = null;
				break;
			}

			if (var4 >= var5.ak_fld && var4 <= var5.ag_fld) {
				var3 = var5;
				break;
			}

			var5 = var5.ae_fld;
		}

		if (null != var3) {
			return var3.ag(-1680594591);
		} else {
			int var7 = var1.ec_fld;
			return var7 >> 1 & 1023;
		}
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(B)Z"
	)
	public boolean bz() {
		return this.aj_fld.ay();
	}

	@ObfuscatedName("xd")
	@ObfuscatedSignature(
		descriptor = "(Luo;Llu;I)I"
	)
	public static int xd(uo var0, lu var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		int var6 = -1059133210;
		lg var7 = (lg)xz.tw(var0.ai_fld, var1.bf_fld);
		int var9 = var1.by_fld;
		lg var10 = var7;

		lg var8;
		while (true) {
			if (null == var10) {
				var8 = null;
				break;
			}

			if (var9 >= var10.ak_fld && var9 <= var10.ag_fld) {
				var8 = var10;
				break;
			}

			var10 = var10.ae_fld;
		}

		int var10000;
		if (null != var8) {
			int var4 = lg.lq(var8, -964541849);
			var10000 = var4;
		} else {
			int var11 = var1.ec_fld;
			var10000 = var11;
		}

		int var3 = var10000;
		if (client.do_fld) {
			var3 |= 2097152;
		}

		return var3;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void bh() {
		this.ac_fld = null;
	}

	@ObfuscatedName("wn")
	@ObfuscatedSignature(
		descriptor = "(Luo;Llu;III)Z"
	)
	public static boolean wn(uo var0, lu var1, int var2, int var3) throws EOFException {
		if (var0 == null) {
			throw new NullPointerException();
		} else if (var0.aj_fld.ay()) {
			return false;
		} else if (null != var1 && var0.aj(var1) != null) {
			uk.iu(var0.aj_fld, var1, var0.aj(var1), var2, var3);
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("kl")
	@ObfuscatedSignature(
		descriptor = "(Luo;Llu;I)Llu;"
	)
	public static lu kl(uo var0, lu var1, int var2) throws EOFException {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			int var4 = xd(var0, var1, -1450417824);
			int var3 = var4 >> 17 & 7;
			int var5 = var3;
			if (0 == var3) {
				return null;
			} else {
				for (int var6 = 0; var6 < var5; var6++) {
					var1 = var0.ak(var1.cv_fld);
					if (null == var1) {
						return null;
					}
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void bi(int var1) {
		for (lg var2 = (lg)this.ai_fld.av(); null != var2; var2 = (lg)this.ai_fld.ae()) {
			if (var1 == (var2.hc_long >> 16 & 65535L)) {
				var2.gy();
			}
		}
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(Llu;)Z"
	)
	public boolean bo(lu var1) {
		return var1.am(-1048238263) || xd(this, var1, 319234888) != 0 || this.at(var1) != 0 || var1 == this.aj_fld.ar();
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "()Lui;"
	)
	public ui bl() {
		return this.bm_fld;
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "()Lui;"
	)
	public ui bx() {
		return this.bm_fld;
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(Llu;)Z"
	)
	public boolean bp(lu var1) {
		return var1.cf_fld;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(Llu;)Ljava/lang/String;"
	)
	public String bt(lu var1) {
		if (nt.ag(xd(this, var1, 1058711366)) == 0) {
			return null;
		} else {
			return null != var1.el_fld && !var1.el_fld.trim().isEmpty() ? var1.el_fld : null;
		}
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void bv(int var1) {
		for (lg var2 = (lg)this.ai_fld.av(); null != var2; var2 = (lg)this.ai_fld.ae()) {
			if (var1 == (var2.hc_long >> 16 & 65535L)) {
				var2.gy();
			}
		}
	}

	public uo(ub var1, ub var2, ub var3, ub var4, ub var5) {
		super(var1, var2, var3, var4, var5);
		this.aa_fld = -501964909;
		this.an_fld = new xz(8);
		this.aq_fld = null;
		this.ap_fld = 0;
		this.at_fld = -1812970079;
		this.ac_fld = null;
		this.aj_fld = new uk();
		this.bm_fld = new ui();
		this.bd_fld = false;
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(Llu;)I"
	)
	public int bn(lu var1) {
		lg var2 = (lg)xz.tw(this.ai_fld, var1.bf_fld * 532948200);
		int var4 = 1106336046 * var1.by_fld;
		lg var5 = var2;

		lg var3;
		while (true) {
			if (null == var5) {
				var3 = null;
				break;
			}

			if (var4 >= var5.ak_fld && var4 <= var5.ag_fld) {
				var3 = var5;
				break;
			}

			var5 = var5.ae_fld;
		}

		return null != var3 ? lg.lq(var3, -472593525) : var1.ec_fld;
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(Llu;)I"
	)
	public int bw(lu var1) {
		lg var2 = (lg)xz.tw(this.ai_fld, var1.bf_fld);
		int var4 = var1.by_fld;
		lg var5 = var2;

		lg var3;
		while (true) {
			if (null == var5) {
				var3 = null;
				break;
			}

			if (var4 >= var5.ak_fld && var4 <= var5.ag_fld) {
				var3 = var5;
				break;
			}

			var5 = var5.ae_fld;
		}

		return null != var3 ? lg.lq(var3, -362426326) : var1.ec_fld;
	}

	@ObfuscatedName("nd")
	@ObfuscatedSignature(
		descriptor = "(Luo;)V"
	)
	public static void nd(uo var0) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.aa_fld = -501964909;
		var0.an_fld = new xz(8);
		var0.ac_fld = null;
		var0.aj_fld.az();
		var0.aj_fld.ad();
	}

	@ObfuscatedName("tm")
	@ObfuscatedSignature(
		descriptor = "(Luo;)Z"
	)
	public static boolean tm(uo var0) {
		return null == var0.ac_fld;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)Lui;"
	)
	public ui ai() {
		return this.bm_fld;
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(Llu;)I"
	)
	public int ba(lu var1) {
		lg var2 = (lg)xz.tw(this.ai_fld, var1.bf_fld);
		int var4 = var1.by_fld;
		lg var5 = var2;

		lg var3;
		while (true) {
			if (null == var5) {
				var3 = null;
				break;
			}

			if (var4 >= var5.ak_fld && var4 <= var5.ag_fld) {
				var3 = var5;
				break;
			}

			var5 = var5.ae_fld;
		}

		return null != var3 ? lg.lq(var3, -508950766) : var1.ec_fld;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(Llu;)I"
	)
	public int bq(lu var1) {
		lg var2 = (lg)xz.tw(this.ai_fld, var1.bf_fld);
		int var4 = -1168848453 * var1.by_fld;
		lg var5 = var2;

		lg var3;
		while (true) {
			if (null == var5) {
				var3 = null;
				break;
			}

			if (var4 >= var5.ak_fld && var4 <= var5.ag_fld) {
				var3 = var5;
				break;
			}

			var5 = var5.ae_fld;
		}

		return null != var3 ? lg.lq(var3, -1105687340) : var1.ec_fld;
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(Llu;)Z"
	)
	public boolean cl(lu var1) {
		return this.ac_fld == var1;
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(Llu;)Llu;"
	)
	lu cv(lu var1) throws EOFException {
		lu var2 = kl(this, var1, -446176385);
		if (var2 == null) {
			var2 = var1.ea_fld;
		}

		return var2;
	}

	@ObfuscatedName("qa")
	@ObfuscatedSignature(
		descriptor = "(Luo;Llu;)Llu;"
	)
	public static lu qa(uo var0, lu var1) throws EOFException {
		if (var0 == null) {
			var0.getClass();
		}

		int var3 = xd(var0, var1, 1466359457);
		int var2 = var3 >> 17 & 7;
		int var4 = var2;
		if (0 == var2) {
			return null;
		} else {
			for (int var5 = 0; var5 < var4; var5++) {
				var1 = var0.ak(var1.cv_fld);
				if (null == var1) {
					return null;
				}
			}

			return var1;
		}
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(Llu;)Llu;"
	)
	lu cy(lu var1) throws EOFException {
		lu var2 = kl(this, var1, -446176385);
		if (var2 == null) {
			var2 = var1.ea_fld;
		}

		return var2;
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(Llu;)Llu;"
	)
	lu cf(lu var1) throws EOFException {
		lu var2 = kl(this, var1, -446176385);
		if (var2 == null) {
			var2 = var1.ea_fld;
		}

		return var2;
	}

	@ObfuscatedName("ie")
	@ObfuscatedSignature(
		descriptor = "(Luo;)Z"
	)
	public static boolean ie(uo var0) {
		if (var0 == null) {
			var0.getClass();
		}

		return null == var0.ac_fld;
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(Llu;)Llu;"
	)
	lu cx(lu var1) throws EOFException {
		lu var2 = kl(this, var1, -446176385);
		if (var2 == null) {
			var2 = var1.ea_fld;
		}

		return var2;
	}

	@ObfuscatedName("fm")
	@ObfuscatedSignature(
		descriptor = "(Luo;I)V"
	)
	public static void fm(uo var0, int var1) {
		for (lg var2 = (lg)var0.ai_fld.av(); null != var2; var2 = (lg)var0.ai_fld.ae()) {
			if (var1 == (var2.hc_long >> 16 & 65535L)) {
				var2.gy();
			}
		}
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "()Luk;"
	)
	public uk cp() {
		return this.aj_fld;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(I)Luk;"
	)
	public uk bm() {
		return this.aj_fld;
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "()Llu;"
	)
	public lu cn() {
		return uk.wc(this.aj_fld, (byte)-52);
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(Llu;II)Z"
	)
	public boolean cg(lu var1, int var2, int var3) throws EOFException {
		if (this.aj_fld.ay()) {
			return false;
		} else if (null != var1 && this.aj(var1) != null) {
			uk.iu(this.aj_fld, var1, this.aj(var1), var2, var3);
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(Llu;II)Z"
	)
	public boolean cw(lu var1, int var2, int var3) throws EOFException {
		if (this.aj_fld.ay()) {
			return false;
		} else if (null != var1 && this.aj(var1) != null) {
			uk.iu(this.aj_fld, var1, this.aj(var1), var2, var3);
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean cm() {
		return null == this.ac_fld;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(I)Llu;"
	)
	public lu bd() {
		return uk.wc(this.aj_fld, (byte)3);
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void cj() {
		this.ac_fld = null;
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void by() {
		this.ac_fld = null;
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(Llu;)Z"
	)
	public boolean ch(lu var1) {
		return this.ac_fld == var1;
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void cu() {
		this.ac_fld = null;
	}

	@ObfuscatedName("qt")
	@ObfuscatedSignature(
		descriptor = "(Luo;Llu;B)V"
	)
	public static void qt(uo var0, lu var1, byte var2) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ac_fld = var1;
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void co() {
		this.aa_fld = -1227061067;
		this.an_fld = new xz(8);
		this.ac_fld = null;
		this.aj_fld.az();
		this.aj_fld.ad();
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(Llu;)I"
	)
	public int bg(lu var1) {
		lg var2 = (lg)xz.tw(this.ai_fld, var1.bf_fld);
		int var4 = var1.by_fld;
		lg var5 = var2;

		lg var3;
		while (true) {
			if (null == var5) {
				var3 = null;
				break;
			}

			if (var4 >= var5.ak_fld && var4 <= var5.ag_fld) {
				var3 = var5;
				break;
			}

			var5 = var5.ae_fld;
		}

		if (null != var3) {
			return var3.ag(747509371);
		} else {
			int var7 = var1.ec_fld;
			return var7 >> 1 & 1023;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Llu;I)Ljava/lang/String;"
	)
	public String ao(lu var1) {
		if (nt.ag(xd(this, var1, 1730763082)) == 0) {
			return null;
		} else {
			return null != var1.el_fld && !var1.el_fld.trim().isEmpty() ? var1.el_fld : null;
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Llu;I)Z"
	)
	public boolean aq(lu var1, int var2) {
		return var1.bs_boolean(-1243755666) || xd(this, var1, -1518094360) != 0 || this.at(var1) != 0 || var1 == this.aj_fld.ar();
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(Llu;III)Z"
	)
	public boolean br(lu var1, int var2, int var3, int var4) throws EOFException {
		if (this.aj_fld.ay()) {
			return false;
		} else if (null != var1 && this.aj(var1) != null) {
			uk.iu(this.aj_fld, var1, this.aj(var1), var2, var3);
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Luo;Llu;I)Z"
	)
	public static boolean au(uo var0, lu var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		return var1.am(-1243755666) || xd(var0, var1, -1518094360) != 0 || var0.at(var1) != 0 || var1 == var0.aj_fld.ar();
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(Llu;B)V"
	)
	public void bs(lu var1, byte var2) {
		this.ac_fld = var1;
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(Llu;I)Z"
	)
	public boolean bk(lu var1, int var2) {
		return this.ac_fld == var1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Llu;I)I"
	)
	public int ap(lu var1, int var2) {
		int var6 = -1059133210;
		lg var7 = (lg)xz.tw(this.ai_fld, var1.bc_fld * 1461045985);
		int var9 = var1.by_fld;
		lg var10 = var7;

		lg var8;
		while (true) {
			if (null == var10) {
				var8 = null;
				break;
			}

			if (var9 >= var10.ag_fld && var9 <= var10.ak_fld) {
				var8 = var10;
				break;
			}

			var10 = var10.ae_fld;
		}

		int var10000;
		if (null != var8) {
			int var4 = lg.lq(var8, -964541849);
			var10000 = var4;
		} else {
			int var11 = var1.dq_fld * 1627369;
			var10000 = var11;
		}

		int var3 = var10000;
		if (client.hl_fld) {
			var3 |= 2097152;
		}

		return var3;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Llu;I)Llu;"
	)
	public lu ac(lu var1, int var2) throws EOFException {
		int var4 = xd(this, var1, -1450417824);
		int var3 = var4 >> 17 & 7;
		int var5 = var3;
		if (0 == var3) {
			return null;
		} else {
			for (int var6 = 0; var6 < var5; var6++) {
				var1 = this.ak(var1.cx_fld * 694320263);
				if (null == var1) {
					return null;
				}
			}

			return var1;
		}
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean cz() {
		return null == this.ac_fld;
	}
}
