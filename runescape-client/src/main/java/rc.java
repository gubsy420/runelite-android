import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import net.runelite.api.Nameable;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("rc")
public abstract class rc {
	@ObfuscatedGetter(
		intValue = 598332743
	)
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ar_fld = 0;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/HashMap;"
	)
	HashMap al_fld;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "[Lrl;"
	)
	rl[] af_fld;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/Comparator;"
	)
	Comparator ax_fld = null;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/HashMap;"
	)
	HashMap au_fld;
	@ObfuscatedGetter(
		intValue = 556586179
	)
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int as_fld;

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(Laax;I)Lrl;"
	)
	rl bn(aax var1, int var2) {
		return this.bc(var1, null, (byte)92);
	}

	@ObfuscatedName("pi")
	@ObfuscatedSignature(
		descriptor = "(Lrc;Ljava/util/Comparator;)V"
	)
	public static void pi(rc var0, Comparator var1) {
		if (var0.ax_fld == null) {
			var0.ax_fld = var1;
		} else if (var0.ax_fld instanceof rz) {
			((rz)var0.ax_fld).ay(var1, 1237151328);
		}
	}

	@ObfuscatedName("fi")
	@ObfuscatedSignature(
		descriptor = "()[Lrl;"
	)
	public rl[] fi() {
		return this.af_fld;
	}

	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "(I)Lrl;"
	)
	public final rl dv(int var1) {
		if (var1 >= 0 && var1 < this.ar_fld) {
			return this.af_fld[var1];
		} else {
			throw new ArrayIndexOutOfBoundsException(var1);
		}
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(Laax;I)Z"
	)
	public boolean bo(aax var1, int var2) {
		if (!var1.az(1004146027)) {
			return false;
		} else {
			return this.al_fld.containsKey(var1) ? true : this.au_fld.containsKey(var1);
		}
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(Laax;B)Lrl;"
	)
	rl bt(aax var1, byte var2) {
		return !var1.az(1004146027) ? null : (rl)this.al_fld.get(var1);
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(Laax;B)Lrl;"
	)
	rl bv(aax var1, byte var2) {
		return !var1.az(1004146027) ? null : (rl)this.au_fld.get(var1);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)[Lrl;"
	)
	abstract rl[] ah(int var1);

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(Lrl;I)V"
	)
	final void cc(rl var1, int var2) {
		this.ez(var1);
		int var3 = this.bg(var1, 1282649636);
		if (-1 != var3) {
			yq(this, var3);
			this.bu(var1, -238528989);
		}
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(Laax;Laax;B)Lrl;"
	)
	rl bc(aax var1, aax var2, byte var3) {
		if (this.bt(var1, (byte)-112) != null) {
			throw new IllegalStateException();
		} else {
			rl var4 = this.ak((byte)60);
			var4.aj(var1, var2, (byte)92);
			this.cd(var4, (byte)76);
			this.bb(var4, -1473430702);
			this.yu(var1, var2);
			return var4;
		}
	}

	@ObfuscatedName("nf")
	@ObfuscatedSignature(
		descriptor = "(Laax;)Lrl;"
	)
	public rl nf(aax var1) {
		return this.bt(var1, (byte)-128);
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	public final void ba(byte var1) {
		if (null == this.ax_fld) {
			Arrays.sort(this.af_fld, 0, this.ar_fld);
		} else {
			Arrays.sort(this.af_fld, 0, this.ar_fld, this.ax_fld);
		}
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(Lrl;Laax;Laax;I)V"
	)
	final void bq(rl var1, aax var2, aax var3, int var4) {
		this.bu(var1, 522528561);
		var1.aj(var2, var3, (byte)65);
		this.bb(var1, -1832396813);
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(Lrl;)V"
	)
	final void cu(rl var1) {
		if (this.al_fld.remove(var1.az_fld) == null) {
			throw new IllegalStateException();
		} else {
			if (null != var1.av_fld) {
				this.au_fld.remove(var1.av_fld);
			}
		}
	}

	@ObfuscatedName("yq")
	@ObfuscatedSignature(
		descriptor = "(Lrc;I)V"
	)
	public static void yq(rc var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ar_fld--;
		if (var1 < var0.ar_fld) {
			System.arraycopy(var0.af_fld, 1 + var1, var0.af_fld, var1, var0.ar_fld - var1);
		}
	}

	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "(I)Lrl;"
	)
	public final rl dh(int var1) {
		if (var1 >= 0 && var1 < this.ar_fld) {
			return this.af_fld[var1];
		} else {
			throw new ArrayIndexOutOfBoundsException(var1);
		}
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(Lrl;B)V"
	)
	final void cd(rl var1, byte var2) {
		this.af_fld[(this.ar_fld += 1155613815) * 598332743 - 1] = var1;
	}

	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "(Lrl;)V"
	)
	final void dr(rl var1) {
		this.af_fld[(this.ar_fld += 1155613815) * -2118595761 - 1] = var1;
	}

	@ObfuscatedName("fm")
	@ObfuscatedSignature(
		descriptor = "(Laax;Laax;)V"
	)
	public void fm(aax var1, aax var2) {
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)Lrl;"
	)
	abstract rl ak(byte var1);

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(Lrl;I)V"
	)
	final void bb(rl var1, int var2) {
		this.al_fld.put(var1.az_fld, var1);
		if (var1.av_fld != null) {
			if (var2 >= 482766120) {
				return;
			}

			rl var3 = (rl)(rl)this.au_fld.put(var1.av_fld, var1);
			if (null != var3 && var1 != var3) {
				var3.av_fld = null;
				var3.mo(-1);
			}
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lrc;Laax;Laax;)Lrl;"
	)
	public static rl ah(rc var0, aax var1, aax var2) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.bt(var1, (byte)-101);
		rl var3 = var0.ak((byte)10);
		var3.aj(var1, var2, (byte)37);
		var0.cd(var3, (byte)36);
		var0.bb(var3, -1063666720);
		return var3;
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public final void cv(int var1) {
		this.ax_fld = null;
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Comparator;I)V"
	)
	public final void cy(Comparator var1, int var2) {
		if (this.ax_fld == null) {
			this.ax_fld = var1;
		} else if (this.ax_fld instanceof rz) {
			((rz)this.ax_fld).ay(var1, 1171209445);
		}
	}

	@ObfuscatedName("findByName")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)Lnet/runelite/api/Nameable;"
	)
	public Nameable findByName(String var1) {
		return this.nf(new aax(var1, fr.gv_fld));
	}

	@ObfuscatedName("gw")
	@ObfuscatedSignature(
		descriptor = "(Laax;)Z"
	)
	public boolean gw(aax var1) {
		return this.bo(var1, -1110904091);
	}

	@ObfuscatedName("sj")
	@ObfuscatedSignature(
		descriptor = "(Lrc;)V"
	)
	public static void sj(rc var0) {
		if (null == var0.ax_fld) {
			Arrays.sort(var0.af_fld, 0, var0.ar_fld);
		} else {
			Arrays.sort(var0.af_fld, 0, var0.ar_fld, var0.ax_fld);
		}
	}

	@ObfuscatedName("em")
	@ObfuscatedSignature(
		descriptor = "(Lrl;)V"
	)
	public void em(rl var1) {
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()Lrl;"
	)
	abstract rl av();

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()Lrl;"
	)
	abstract rl ae();

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)[Lrl;"
	)
	abstract rl[] aw(int var1);

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)[Lrl;"
	)
	abstract rl[] ay(int var1);

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)[Lrl;"
	)
	abstract rl[] as(int var1);

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)[Lrl;"
	)
	abstract rl[] ar(int var1);

	@ObfuscatedName("ko")
	@ObfuscatedSignature(
		descriptor = "(Lrc;Lrl;)I"
	)
	public static int ko(rc var0, rl var1) {
		if (var0 == null) {
			var0.getClass();
		}

		for (int var2 = 0; var2 < var0.ar_fld; var2++) {
			if (var1 == var0.af_fld[var2]) {
				return var2;
			}
		}

		return -1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)[Lrl;"
	)
	abstract rl[] af(int var1);

	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "(Lrl;)V"
	)
	final void da(rl var1) {
		int var2 = this.bg(var1, -169694705);
		if (-1 != var2) {
			yq(this, var2);
			this.bu(var1, 1597998576);
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lrc;Laax;)Lrl;"
	)
	public static rl aa(rc var0, aax var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return !var1.az(1004146027) ? null : (rl)var0.al_fld.get(var1);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)[Lrl;"
	)
	abstract rl[] ag(int var1, int var2);

	@ObfuscatedName("hw")
	@ObfuscatedSignature(
		descriptor = "(Lrc;)V"
	)
	public static void hw(rc var0) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ar_fld = 0;
		Arrays.fill(var0.af_fld, null);
		var0.al_fld.clear();
		var0.au_fld.clear();
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int cs() {
		return this.ar_fld;
	}

	@ObfuscatedName("sc")
	@ObfuscatedSignature(
		descriptor = "(Lrc;I)Lrl;"
	)
	public static rl sc(rc var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else if (var1 >= 0 && var1 < var0.ar_fld) {
			return var0.af_fld[var1];
		} else {
			throw new ArrayIndexOutOfBoundsException(var1);
		}
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean cp() {
		return this.as_fld == this.ar_fld;
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean ce() {
		return this.as_fld == this.ar_fld;
	}

	@ObfuscatedName("getSize")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int getSize() {
		return this.as_fld;
	}

	@ObfuscatedName("ns")
	@ObfuscatedSignature(
		descriptor = "(Lrc;B)V"
	)
	public static void ns(rc var0, byte var1) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.ar_fld = 0;
			Arrays.fill(var0.af_fld, null);
			var0.al_fld.clear();
			var0.au_fld.clear();
		}
	}

	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "(Lrc;Laax;)Lrl;"
	)
	public static rl df(rc var0, aax var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return !var1.az(1004146027) ? null : (rl)var0.au_fld.get(var1);
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(Laax;)Lrl;"
	)
	public rl cn(aax var1) {
		rl var2 = this.bt(var1, (byte)-6);
		return var2 != null ? var2 : this.bv(var1, (byte)-16);
	}

	@ObfuscatedName("getMembers")
	@ObfuscatedSignature(
		descriptor = "()[Lnet/runelite/api/Nameable;"
	)
	public Nameable[] getMembers() {
		rl[] var1 = this.fi();
		int var2 = this.getCount();
		return (Nameable[])(Nameable[])Arrays.copyOf(var1, var2);
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(Laax;)Lrl;"
	)
	public rl cr(aax var1) {
		rl var2 = this.bt(var1, (byte)-99);
		return var2 != null ? var2 : this.bv(var1, (byte)-58);
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(Lrl;I)I"
	)
	final int bg(rl var1, int var2) {
		for (int var3 = 0; var3 < this.ar_fld; var3++) {
			if (var1 == this.af_fld[var3]) {
				return var3;
			}
		}

		return -1;
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(Laax;)Lrl;"
	)
	rl ch(aax var1) {
		return !var1.az(1004146027) ? null : (rl)this.al_fld.get(var1);
	}

	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "(Lrl;)V"
	)
	public void ez(rl var1) {
		this.em(var1);
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(Laax;)Lrl;"
	)
	rl cg(aax var1) {
		return !var1.az(1004146027) ? null : (rl)this.au_fld.get(var1);
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(B)Z"
	)
	public boolean bx(byte var1) {
		return this.as_fld == this.ar_fld;
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(Lrl;)V"
	)
	final void co(rl var1) {
		int var2 = this.bg(var1, 1100756601);
		if (-1 != var2) {
			yq(this, var2);
			this.bu(var1, 976463564);
		}
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(Laax;)Z"
	)
	public final boolean ck(aax var1) {
		rl var2 = this.bt(var1, (byte)-80);
		if (var2 == null) {
			return false;
		} else {
			this.cc(var2, -347581714);
			return true;
		}
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(Lrl;)V"
	)
	final void ci(rl var1) {
		int var2 = this.bg(var1, 967066478);
		if (-1 != var2) {
			yq(this, var2);
			this.bu(var1, -896738882);
		}
	}

	rc(int var1) {
		this.as_fld = var1;
		this.af_fld = this.ag(var1, -2063798287);
		this.al_fld = new HashMap(var1 / 8);
		this.au_fld = new HashMap(var1 / 8);
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(Lrl;I)V"
	)
	final void bu(rl var1, int var2) {
		if (this.al_fld.remove(var1.az_fld) == null) {
			throw new IllegalStateException();
		} else {
			if (null != var1.av_fld) {
				this.au_fld.remove(var1.av_fld);
			}
		}
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void cx() {
		this.ar_fld = 0;
		Arrays.fill(this.af_fld, null);
		this.al_fld.clear();
		this.au_fld.clear();
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(Laax;Laax;)Lrl;"
	)
	rl cl(aax var1, aax var2) {
		if (this.bt(var1, (byte)-23) != null) {
			throw new IllegalStateException();
		} else {
			rl var3 = this.ak((byte)99);
			var3.aj(var1, var2, (byte)19);
			this.cd(var3, (byte)48);
			this.bb(var3, -1428107581);
			return var3;
		}
	}

	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "(Laax;Laax;)Lrl;"
	)
	rl dc(aax var1, aax var2) {
		if (this.bt(var1, (byte)-83) != null) {
			throw new IllegalStateException();
		} else {
			rl var3 = this.ak((byte)109);
			var3.aj(var1, var2, (byte)65);
			this.cd(var3, (byte)21);
			this.bb(var3, -1500404828);
			return var3;
		}
	}

	@ObfuscatedName("yu")
	@ObfuscatedSignature(
		descriptor = "(Laax;Laax;)V"
	)
	public void yu(aax var1, aax var2) {
		this.fm(var1, var2);
	}

	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "(Lrl;Laax;Laax;)V"
	)
	final void dm(rl var1, aax var2, aax var3) {
		this.bu(var1, 1262699812);
		var1.aj(var2, var3, (byte)64);
		this.bb(var1, -1704716744);
	}

	@ObfuscatedName("getCount")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int getCount() {
		return this.ar_fld;
	}

	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public final void dt() {
		if (null == this.ax_fld) {
			Arrays.sort(this.af_fld, 0, this.ar_fld * -1881880618);
		} else {
			Arrays.sort(this.af_fld, 0, this.ar_fld, this.ax_fld);
		}
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(Laax;)Lrl;"
	)
	rl cz(aax var1) {
		return !var1.az(1004146027) ? null : (rl)this.al_fld.get(var1);
	}

	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "(Lrl;)V"
	)
	final void dk(rl var1) {
		int var2 = this.bg(var1, 292020053);
		if (-1 != var2) {
			yq(this, var2);
			this.bu(var1, -2027073757);
		}
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(Lrl;)V"
	)
	final void cb(rl var1) {
		if (this.al_fld.remove(var1.az_fld) == null) {
			throw new IllegalStateException();
		} else {
			if (null != var1.av_fld) {
				this.au_fld.remove(var1.av_fld);
			}
		}
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int bl(int var1) {
		return this.ar_fld;
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(Laax;I)Z"
	)
	public final boolean bi(aax var1, int var2) {
		rl var3 = this.bt(var1, (byte)-37);
		if (var3 == null) {
			return false;
		} else {
			this.cc(var3, -1893433153);
			return true;
		}
	}

	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "(Lrl;)V"
	)
	final void dd(rl var1) {
		this.af_fld[(this.ar_fld += 1832556922) * -783829025 - 1] = var1;
	}

	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "(Lrl;)V"
	)
	final void do_(rl var1) {
		this.af_fld[(this.ar_fld += -1524595785) * -1346506749 - 1] = var1;
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(Laax;)Lrl;"
	)
	rl ca(aax var1) {
		return this.bc(var1, null, (byte)93);
	}

	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	final void dx(int var1) {
		this.ar_fld -= 385833930;
		if (var1 < this.ar_fld) {
			System.arraycopy(this.af_fld, 1 + var1, this.af_fld, var1, this.ar_fld - var1);
		}
	}

	@ObfuscatedName("wv")
	@ObfuscatedSignature(
		descriptor = "(Lek;)I"
	)
	public static int wv(ek var0) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.ag_fld.length;
	}

	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public final void ds() {
		this.ax_fld = null;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lub;)V"
	)
	public static void ak(ub var0) {
		ph.ag_fld = var0;
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	public void by(byte var1) {
		this.ar_fld = 0;
		Arrays.fill(this.af_fld, null);
		this.au_fld.clear();
		this.al_fld.clear();
	}

	@ObfuscatedName("qr")
	@ObfuscatedSignature(
		descriptor = "(Lrc;Lrl;)V"
	)
	public static void qr(rc var0, rl var1) {
		var0.af_fld[(var0.ar_fld += 1155613815) * 598332743 - 1] = var1;
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(Laax;I)Lrl;"
	)
	public rl bp(aax var1, int var2) {
		return this.bc(var1, null, (byte)92);
	}

	@ObfuscatedName("tl")
	@ObfuscatedSignature(
		descriptor = "(Lrc;Laax;I)Lrl;"
	)
	public static rl tl(rc var0, aax var1, int var2) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			rl var3 = var0.bt(var1, (byte)-103);
			return var3 != null ? var3 : var0.bv(var1, (byte)-101);
		}
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	final void cq(int var1, int var2) {
		this.ar_fld--;
		if (var1 < this.ar_fld) {
			System.arraycopy(this.af_fld, 1 + var1, this.af_fld, var1, this.ar_fld - var1);
		}
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(II)Lrl;"
	)
	public final rl bw(int var1, int var2) {
		if (var1 >= 0 && var1 < this.ar_fld) {
			return this.af_fld[var1];
		} else {
			throw new ArrayIndexOutOfBoundsException(var1);
		}
	}
}
