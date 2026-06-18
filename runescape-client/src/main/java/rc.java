import java.io.EOFException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import net.runelite.api.Nameable;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("rc")
@Implements({"NameableContainer"})
public abstract class rc {
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 598332743
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
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 556586179
	)
	int as_fld;

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(Laax;I)Lrl;"
	)
	rl bn(aax var1, int var2) {
		return this.bc(var1, null, (byte)92);
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	public void by(byte var1) {
		this.ar_fld = 0;
		Arrays.fill(this.af_fld, null);
		this.al_fld.clear();
		this.au_fld.clear();
	}

	@ObfuscatedName("getMembers")
	@ObfuscatedSignature(
		descriptor = "()[Lnet/runelite/api/Nameable;"
	)
	public Nameable[] getMembers() {
		rl[] var1 = this.la();
		int var2 = this.getCount();
		return (Nameable[])(Nameable[])Arrays.copyOf(var1, var2);
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(Lrl;)V"
	)
	final void cj(rl var1) {
		int var2 = this.bg(var1, -1855322650);
		if (-1 != var2) {
			ro(this, var2);
			vn(this, var1, -2020924551);
		}
	}

	@ObfuscatedName("ff")
	@ObfuscatedSignature(
		descriptor = "(Lrc;Lrl;Laax;Laax;)V"
	)
	public static void ff(rc var0, rl var1, aax var2, aax var3) {
		if (var0 == null) {
			var0.getClass();
		}

		vn(var0, var1, 1262699812);
		var1.aj(var2, var3, (byte)64);
		var0.cc(var1, -1704716744);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lrg;I)V"
	)
	public static void ay(rg var0, int var1) throws EOFException {
		try {
			qa.hs(var0.an_fld, var1, 1620288489);
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
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

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(Laax;I)Lrl;"
	)
	public rl bp(aax var1, int var2) {
		rl var3 = this.bt(var1, (byte)-103);
		return var3 != null ? var3 : this.bv(var1, (byte)-101);
	}

	@ObfuscatedName("gj")
	@ObfuscatedSignature(
		descriptor = "(Lrc;Ljava/util/Comparator;)V"
	)
	public static void gj(rc var0, Comparator var1) {
		if (var0.ax_fld == null) {
			var0.ax_fld = var1;
		} else if (var0.ax_fld instanceof rz) {
			((rz)var0.ax_fld).ay(var1, 1237151328);
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

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(Lrl;I)V"
	)
	final void bu(rl var1, int var2) {
		this.zo(var1);
		int var3 = this.bg(var1, 1282649636);
		if (-1 != var3) {
			ro(this, var3);
			vn(this, var1, -238528989);
		}
	}

	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "(Lrl;)I"
	)
	final int dq(rl var1) {
		for (int var2 = 0; var2 < this.ar_fld; var2++) {
			if (var1 == this.af_fld[var2]) {
				return var2;
			}
		}

		return -1;
	}

	@ObfuscatedName("findByName")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)Lnet/runelite/api/Nameable;"
	)
	public Nameable findByName(String var1) {
		return this.fp(new aax(var1, fr.gv_fld));
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
			this.cc(var4, -1473430702);
			this.ye(var1, var2);
			return var4;
		}
	}

	@ObfuscatedName("mg")
	@ObfuscatedSignature(
		descriptor = "(Lrc;Lrl;)V"
	)
	public static void mg(rc var0, rl var1) {
		if (var0.al_fld.remove(var1.az_fld) == null) {
			throw new IllegalStateException();
		} else {
			if (null != var1.av_fld) {
				var0.au_fld.remove(var1.av_fld);
			}
		}
	}

	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "(Lrl;)V"
	)
	final void dl(rl var1) {
		this.af_fld[(this.ar_fld += 1155613815) * 598332743 - 1] = var1;
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
		vn(this, var1, 522528561);
		var1.aj(var2, var3, (byte)65);
		this.cc(var1, -1832396813);
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

	@ObfuscatedName("ye")
	@ObfuscatedSignature(
		descriptor = "(Laax;Laax;)V"
	)
	public void ye(aax var1, aax var2) {
		this.oi(var1, var2);
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(Lrl;B)V"
	)
	final void cd(rl var1, byte var2) {
		this.af_fld[(this.ar_fld += 1155613815) * 598332743 - 1] = var1;
	}

	@ObfuscatedName("getCount")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int getCount() {
		return this.ar_fld;
	}

	@ObfuscatedName("vr")
	@ObfuscatedSignature(
		descriptor = "(Lrc;Lrl;)V"
	)
	public static void vr(rc var0, rl var1) {
		var0.af_fld[(var0.ar_fld += 1155613815) * -2118595761 - 1] = var1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)Lrl;"
	)
	abstract rl ak(byte var1);

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(Lrl;I)V"
	)
	final void cc(rl var1, int var2) {
		this.al_fld.put(var1.az_fld, var1);
		if (var1.av_fld != null) {
			if (var2 >= 482766120) {
				return;
			}

			rl var3 = (rl)(rl)this.au_fld.put(var1.av_fld, var1);
			if (null != var3 && var1 != var3) {
				var3.av_fld = null;
				var3.hh(-1);
			}
		}
	}

	@ObfuscatedName("ka")
	@ObfuscatedSignature(
		descriptor = "(Lrl;)V"
	)
	public void ka(rl var1) {
	}

	@ObfuscatedName("la")
	@ObfuscatedSignature(
		descriptor = "()[Lrl;"
	)
	public rl[] la() {
		return this.af_fld;
	}

	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "(Laax;)Z"
	)
	public boolean hu(aax var1) {
		return this.bo(var1, -1110904091);
	}

	@ObfuscatedName("vn")
	@ObfuscatedSignature(
		descriptor = "(Lrc;Lrl;I)V"
	)
	public static void vn(rc var0, rl var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var0.al_fld.remove(var1.az_fld) == null) {
			throw new IllegalStateException();
		} else {
			if (null != var1.av_fld) {
				var0.au_fld.remove(var1.av_fld);
			}
		}
	}

	@ObfuscatedName("oi")
	@ObfuscatedSignature(
		descriptor = "(Laax;Laax;)V"
	)
	public void oi(aax var1, aax var2) {
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

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()Lrl;"
	)
	abstract rl ae();

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()Lrl;"
	)
	abstract rl av();

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

	@ObfuscatedName("ro")
	@ObfuscatedSignature(
		descriptor = "(Lrc;II)V"
	)
	public static void ro(rc var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ar_fld--;
		if (var1 < var0.ar_fld) {
			System.arraycopy(var0.af_fld, 1 + var1, var0.af_fld, var1, var0.ar_fld - var1);
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)[Lrl;"
	)
	abstract rl[] ar(int var1);

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)[Lrl;"
	)
	abstract rl[] af(int var1);

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(Lrl;)V"
	)
	final void ci(rl var1) {
		int var2 = this.bg(var1, -169694705);
		if (-1 != var2) {
			ro(this, var2);
			vn(this, var1, 1597998576);
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)[Lrl;"
	)
	abstract rl[] ag(int var1, int var2);

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int cs() {
		return this.ar_fld;
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean ce() {
		return this.as_fld == this.ar_fld;
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean cp() {
		return this.as_fld == this.ar_fld;
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(Laax;)Lrl;"
	)
	public rl cn(aax var1) {
		rl var2 = this.bt(var1, (byte)-6);
		return var2 != null ? var2 : this.bv(var1, (byte)-16);
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

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(Laax;)Lrl;"
	)
	rl cg(aax var1) {
		return !var1.az(1004146027) ? null : (rl)this.al_fld.get(var1);
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(Laax;)Lrl;"
	)
	rl cw(aax var1) {
		return !var1.az(1004146027) ? null : (rl)this.al_fld.get(var1);
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(Laax;)Lrl;"
	)
	rl cm(aax var1) {
		return !var1.az(1004146027) ? null : (rl)this.au_fld.get(var1);
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(Laax;)Lrl;"
	)
	rl cz(aax var1) {
		return !var1.az(1004146027) ? null : (rl)this.au_fld.get(var1);
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(B)Z"
	)
	public boolean bx(byte var1) {
		return this.as_fld == this.ar_fld;
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(Lrl;)V"
	)
	final void cb(rl var1) {
		int var2 = this.bg(var1, 1100756601);
		if (-1 != var2) {
			ro(this, var2);
			vn(this, var1, 976463564);
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
			this.bu(var2, -347581714);
			return true;
		}
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(Lrl;)V"
	)
	final void cu(rl var1) {
		int var2 = this.bg(var1, 967066478);
		if (-1 != var2) {
			ro(this, var2);
			vn(this, var1, -896738882);
		}
	}

	rc(int var1) {
		this.as_fld = var1;
		this.af_fld = this.ag(var1, -2063798287);
		this.al_fld = new HashMap(var1 / 8);
		this.au_fld = new HashMap(var1 / 8);
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(Laax;Laax;)Lrl;"
	)
	rl ct(aax var1, aax var2) {
		this.bt(var1, (byte)-101);
		rl var3 = this.ak((byte)10);
		var3.aj(var1, var2, (byte)37);
		this.cd(var3, (byte)36);
		this.cc(var3, -1063666720);
		return var3;
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
			this.cc(var3, -1428107581);
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
			this.cc(var3, -1500404828);
			return var3;
		}
	}

	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public final void dz() {
		if (null == this.ax_fld) {
			Arrays.sort(this.af_fld, 0, this.ar_fld);
		} else {
			Arrays.sort(this.af_fld, 0, this.ar_fld, this.ax_fld);
		}
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

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(Laax;)Lrl;"
	)
	rl ca(aax var1) {
		return !var1.az(1004146027) ? null : (rl)this.al_fld.get(var1);
	}

	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "(Lrl;)V"
	)
	final void do_(rl var1) {
		if (this.al_fld.remove(var1.az_fld) == null) {
			throw new IllegalStateException();
		} else {
			if (null != var1.av_fld) {
				this.au_fld.remove(var1.av_fld);
			}
		}
	}

	@ObfuscatedName("getSize")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int getSize() {
		return this.as_fld;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int bl(int var1) {
		return this.ar_fld;
	}

	@ObfuscatedName("zo")
	@ObfuscatedSignature(
		descriptor = "(Lrl;)V"
	)
	public void zo(rl var1) {
		this.ka(var1);
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
			this.bu(var3, -1893433153);
			return true;
		}
	}

	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "(Lrl;)V"
	)
	final void dr(rl var1) {
		this.af_fld[(this.ar_fld += 1832556922) * -783829025 - 1] = var1;
	}

	@ObfuscatedName("fp")
	@ObfuscatedSignature(
		descriptor = "(Laax;)Lrl;"
	)
	public rl fp(aax var1) {
		return this.bt(var1, (byte)-128);
	}

	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "(Lrl;)V"
	)
	final void da(rl var1) {
		this.af_fld[(this.ar_fld += -1524595785) * -1346506749 - 1] = var1;
	}

	@ObfuscatedName("yh")
	@ObfuscatedSignature(
		descriptor = "(Lrc;Lrl;)V"
	)
	public static void yh(rc var0, rl var1) {
		if (var0 == null) {
			var0.getClass();
		}

		int var2 = var0.bg(var1, 292020053);
		if (-1 != var2) {
			ro(var0, var2);
			vn(var0, var1, -2027073757);
		}
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(Laax;)Lrl;"
	)
	rl ch(aax var1) {
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

	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public final void ds() {
		this.ax_fld = null;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lub;B)V"
	)
	public static void ak(ub var0) {
		ph.ag_fld = var0;
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

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(Lrl;I)V"
	)
	final void bb(rl var1, int var2) {
		if (this.al_fld.remove(var1.av_fld) == null) {
			throw new IllegalStateException();
		} else {
			if (null != var1.az_fld) {
				this.al_fld.remove(var1.av_fld);
			}
		}
	}
}
