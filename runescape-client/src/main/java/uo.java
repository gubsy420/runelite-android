import java.io.EOFException;
import java.util.List;
import java.util.Map;
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
	@ObfuscatedGetter(
		intValue = 243771749
	)
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int aa_fld;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	lu ac_fld;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lxz;"
	)
	public xz ai_fld;
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "Lui;"
	)
	ui bm_fld;
	@ObfuscatedGetter(
		intValue = -85253729
	)
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int at_fld;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lxz;"
	)
	public xz an_fld = new xz(512);
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Luk;"
	)
	uk aj_fld;
	@ObfuscatedGetter(
		intValue = 188156795
	)
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ap_fld;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public boolean bd_fld;

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean be() {
		return null == this.ac_fld;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void aa() {
		this.aa_fld = -501964909;
		this.ai_fld = new xz(8);
		this.ac_fld = null;
		this.aj_fld.ag();
		this.aj_fld.az();
	}

	@ObfuscatedName("ru")
	@ObfuscatedSignature(
		descriptor = "(Lyo;Ljava/lang/Object;I)Ljava/util/List;"
	)
	public static List ru(yo var0, Object var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var2 < 0) {
			var2 = 0;
		}

		Map var3 = (Map)(Map)var0.ae_fld.get(var2);
		return (List)(List)var3.get(var1);
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
		descriptor = "(Llu;)Z"
	)
	public boolean am(lu var1) {
		return var1.cf_fld;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Llu;I)Ljava/lang/String;"
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
		int var3 = sa(this, var1, 814856613);
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

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Llu;)I"
	)
	public int at(lu var1) {
		lg var3 = (lg)this.an_fld.ak(var1.bf_fld);
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

	@ObfuscatedName("eq")
	@ObfuscatedSignature(
		descriptor = "(Luo;)V"
	)
	public static void eq(uo var0) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.aa_fld = -1227061067;
		var0.ai_fld = new xz(8);
		var0.ac_fld = null;
		var0.aj_fld.ag();
		var0.aj_fld.az();
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void by() {
		this.aa_fld = 1927841294;
		this.ai_fld = new xz(8);
		this.ac_fld = null;
		this.aj_fld.ag();
		this.aj_fld.az();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Llu;)Llu;"
	)
	lu aj(lu var1) throws EOFException {
		lu var3 = this.ac(var1);
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
		return this.aj_fld.as();
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean bz() {
		return this.aj_fld.ay();
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(Llu;II)Z"
	)
	public boolean br(lu var1, int var2, int var3) throws EOFException {
		if (this.aj_fld.ay()) {
			return false;
		} else if (null != var1 && this.aj(var1) != null) {
			this.aj_fld.ak(var1, this.aj(var1), var2, var3);
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ci() {
		this.ac_fld = null;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(Llu;)V"
	)
	public void bs(lu var1) {
		this.ac_fld = var1;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void bh() {
		this.ac_fld = null;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void bj() {
		this.aa_fld = -501964909;
		this.ai_fld = new xz(8);
		this.ac_fld = null;
		this.aj_fld.ag();
		this.aj_fld.az();
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void bi(int var1) {
		for (lg var2 = (lg)this.an_fld.aq(); null != var2; var2 = (lg)xz.aa(this.an_fld)) {
			if (var1 == (var2.hc_fld >> 16 & 65535L)) {
				var2.gy_void();
			}
		}
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(Llu;)Z"
	)
	public boolean cl(lu var1) {
		return lu.qh(var1, -1048238263) || sa(this, var1, 319234888) != 0 || this.at(var1) != 0 || var1 == uk.dz(this.aj_fld, -1094587272);
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "()Lui;"
	)
	public ui bl() {
		return this.bm_fld;
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(Llu;)Z"
	)
	public boolean ct(lu var1) {
		return var1.cf_fld;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(Llu;)Ljava/lang/String;"
	)
	public String bt(lu var1) {
		if (nt.ag(sa(this, var1, 1058711366)) == 0) {
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
		for (lg var2 = (lg)this.an_fld.aq(); null != var2; var2 = (lg)xz.aa(this.an_fld)) {
			if (var1 == (var2.hc_fld >> 16 & 65535L)) {
				var2.gy_void();
			}
		}
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(Luo;Llu;)Llu;"
	)
	public static lu ca(uo var0, lu var1) throws EOFException {
		if (var0 == null) {
			var0.getClass();
		}

		lu var2 = var0.ac(var1);
		if (var2 == null) {
			var2 = var1.ea_fld;
		}

		return var2;
	}

	public uo(ub var1, ub var2, ub var3, ub var4, ub var5) {
		super(var1, var2, var3, var4, var5);
		this.aa_fld = -501964909;
		this.ai_fld = new xz(8);
		this.aq_fld = null;
		this.ap_fld = 0;
		this.at_fld = -1812970079;
		this.ac_fld = null;
		this.aj_fld = new uk();
		this.bm_fld = new ui();
		this.bd_fld = false;
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void bu(int var1) {
		for (lg var2 = (lg)this.an_fld.aq(); null != var2; var2 = (lg)xz.aa(this.an_fld)) {
			if (var1 == (var2.hc_fld >> 16 & 65535L)) {
				var2.gy_void();
			}
		}
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(Llu;)I"
	)
	public int bn(lu var1) {
		lg var2 = (lg)this.an_fld.ak(var1.bf_fld * 532948200);
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

		return null != var3 ? var3.ak(-472593525) : var1.ec_fld;
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(Llu;)I"
	)
	public int bw(lu var1) {
		lg var2 = (lg)this.an_fld.ak(var1.bf_fld);
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

		return null != var3 ? var3.ak(-362426326) : var1.ec_fld;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "()Lui;"
	)
	public ui ai() {
		return this.bm_fld;
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(Llu;)I"
	)
	public int ba(lu var1) {
		lg var2 = (lg)this.an_fld.ak(var1.bf_fld);
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

		return null != var3 ? var3.ak(-508950766) : var1.ec_fld;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(Llu;)I"
	)
	public int bq(lu var1) {
		lg var2 = (lg)this.an_fld.ak(var1.bf_fld);
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

		return null != var3 ? var3.ak(-1105687340) : var1.ec_fld;
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(Llu;)Z"
	)
	public boolean ch(lu var1) {
		return this.ac_fld == var1;
	}

	@ObfuscatedName("eh")
	@ObfuscatedSignature(
		descriptor = "(Llu;)I"
	)
	public int eh(lu var1) {
		return sa(this, var1, -1059133210);
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(Llu;)Z"
	)
	public boolean bp(lu var1) {
		return this.ac_fld == var1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Llu;)Llu;"
	)
	public lu ac(lu var1) throws EOFException {
		int var4 = sa(this, var1, -1450417824);
		int var3 = var4 >> 17 & 7;
		int var5 = var3;
		if (0 == var3) {
			return null;
		} else {
			for (int var6 = 0; var6 < var5; var6++) {
				var1 = this.ak(var1.cv_fld);
				if (null == var1) {
					return null;
				}
			}

			return var1;
		}
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(Llu;)Llu;"
	)
	public lu cc(lu var1) throws EOFException {
		int var3 = sa(this, var1, 1466359457);
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

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(Llu;)Llu;"
	)
	public lu cq(lu var1) throws EOFException {
		int var3 = sa(this, var1, -2146673426);
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

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(Llu;)Llu;"
	)
	lu cf(lu var1) throws EOFException {
		lu var2 = this.ac(var1);
		if (var2 == null) {
			var2 = var1.ea_fld;
		}

		return var2;
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "()Luk;"
	)
	public uk cs() {
		return this.aj_fld;
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
		descriptor = "()Luk;"
	)
	public uk bm() {
		return this.aj_fld;
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "()Llu;"
	)
	public lu cn() {
		return this.aj_fld.as();
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "()Llu;"
	)
	public lu cr() {
		return this.aj_fld.as();
	}

	@ObfuscatedName("qf")
	@ObfuscatedSignature(
		descriptor = "(Luo;Llu;)Llu;"
	)
	public static lu qf(uo var0, lu var1) throws EOFException {
		if (var0 == null) {
			var0.getClass();
		}

		lu var2 = var0.ac(var1);
		if (var2 == null) {
			var2 = var1.ea_fld;
		}

		return var2;
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean ca() {
		return this.aj_fld.ay();
	}

	@ObfuscatedName("wj")
	@ObfuscatedSignature(
		descriptor = "(Luo;Llu;)I"
	)
	public static int wj(uo var0, lu var1) {
		lg var2 = (lg)var0.an_fld.ak(var1.bf_fld);
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

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(Llu;II)Z"
	)
	public boolean cg(lu var1, int var2, int var3) throws EOFException {
		if (this.aj_fld.ay()) {
			return false;
		} else if (null != var1 && this.aj(var1) != null) {
			this.aj_fld.ak(var1, this.aj(var1), var2, var3);
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
			this.aj_fld.ak(var1, this.aj(var1), var2, var3);
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean cz() {
		return null == this.ac_fld;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "()Llu;"
	)
	public lu bd() {
		return this.aj_fld.as();
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void co() {
		this.ac_fld = null;
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void cu() {
		this.ac_fld = null;
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void cj() {
		this.ac_fld = null;
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(Llu;)I"
	)
	public int bg(lu var1) {
		lg var2 = (lg)this.an_fld.ak(var1.bf_fld);
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

	@ObfuscatedName("uu")
	@ObfuscatedSignature(
		descriptor = "(Luo;Llu;)Llu;"
	)
	public static lu uu(uo var0, lu var1) throws EOFException {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			lu var2 = var0.ac(var1);
			if (var2 == null) {
				var2 = var1.ea_fld;
			}

			return var2;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Llu;)Ljava/lang/String;"
	)
	public String ao(lu var1) {
		if (nt.ag(sa(this, var1, 1730763082)) == 0) {
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
		return this.ac_fld == var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void ab(int var1, int var2) {
		for (lg var3 = (lg)this.an_fld.aa(); null != var3; var3 = (lg)xz.aa(this.an_fld)) {
			if (var1 == (var3.hc_fld >> 16 & 65535L)) {
				if (var2 == -2068515547) {
					return;
				}

				var3.gy_void();
			}
		}
	}

	@ObfuscatedName("sa")
	@ObfuscatedSignature(
		descriptor = "(Luo;Llu;I)I"
	)
	public static int sa(uo var0, lu var1, int var2) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			int var6 = -1059133210;
			lg var7 = (lg)var0.an_fld.ak(var1.bf_fld);
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
				int var4 = var8.ak(-964541849);
				var10000 = var4;
			} else {
				int var11 = var1.ec_fld;
				var10000 = var11;
			}

			int var3 = var10000;
			if (client.ql_boolean) {
				var3 |= 2097152;
			}

			return var3;
		}
	}

	@ObfuscatedName("mu")
	@ObfuscatedSignature(
		descriptor = "(Luo;II)V"
	)
	public static void mu(uo var0, int var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		} else {
			for (lg var3 = (lg)var0.an_fld.aq(); null != var3; var3 = (lg)xz.aa(var0.an_fld)) {
				if (var1 == (var3.hc_fld >> 16 & 65535L)) {
					if (var2 == -2068515547) {
						return;
					}

					var3.gy_void();
				}
			}
		}
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(Llu;I)Z"
	)
	public boolean bk(lu var1, int var2) {
		return this.ac_fld == var1;
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "()Lui;"
	)
	public ui bx() {
		return this.bm_fld;
	}

	@ObfuscatedName("wp")
	@ObfuscatedSignature(
		descriptor = "(Luo;Llu;I)Z"
	)
	public static boolean wp(uo var0, lu var1, int var2) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.ac_fld == var1;
		}
	}

	@ObfuscatedName("qr")
	@ObfuscatedSignature(
		descriptor = "(Luo;Llu;I)Z"
	)
	public static boolean qr(uo var0, lu var1, int var2) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return lu.qh(var1, -1243755666) || sa(var0, var1, -1518094360) != 0 || var0.at(var1) != 0 || var1 == uk.dz(var0.aj_fld, -1094587272);
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Llu;I)I"
	)
	public int ap(lu var1, int var2) {
		int var6 = -1059133210;
		lg var7 = (lg)this.ai_fld.aw(var1.ch_fld * 1461045985);
		int var9 = -2140649577 * var1.ch_fld;
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
			int var4 = var8.ag(-964541849);
			var10000 = var4;
		} else {
			int var11 = var1.da_fld * 1627369;
			var10000 = var11;
		}

		int var3 = var10000;
		if (client.im_fld) {
			var3 |= 2097152;
		}

		return var3;
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(Llu;)Llu;"
	)
	lu cy(lu var1) throws EOFException {
		lu var2 = this.ac(var1);
		if (var2 == null) {
			var2 = var1.ea_fld;
		}

		return var2;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(Llu;)Z"
	)
	public boolean bo(lu var1) {
		return this.ac_fld == var1;
	}
}
