import java.util.Iterator;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("gq")
public class gq implements hj {
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 650767201
	)
	int ae_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1615560841
	)
	int ag_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int az_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 63108051
	)
	int aw_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int av_fld;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1611286099
	)
	int ar_fld;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int au_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 2084705025
	)
	int ay_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 477315017
	)
	int as_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1615556581
	)
	int ah_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 202989497
	)
	int ak_fld;
	@ObfuscatedName("ff")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/Iterator;"
	)
	static Iterator ff_fld;

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lkj;"
	)
	@Override
	public kj ae(int var1, int var2, byte var3) {
		if (!this.az(var1, var2, (byte)102)) {
			return null;
		} else {
			int var4 = var1 + (-1320046656 * this.az_fld - this.aw_fld);
			int var5 = this.av_fld * -832031424 - this.ay_fld + var2;
			return new kj(this.ak_fld, var4, var5);
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lhf;B)V"
	)
	@Override
	public void ak(hf var1, byte var2) {
		if (var1.ak_fld > this.aw_fld) {
			var1.ak_fld = this.aw_fld * -850789857;
		}

		if (var1.ag_fld < this.as_fld) {
			var1.ag_fld = this.as_fld * -201666247;
		}

		if (var1.az_fld > this.ay_fld) {
			var1.az_fld = 476454541 * this.ay_fld;
		}

		if (var1.av_fld < this.ar_fld) {
			var1.av_fld = this.ar_fld * 362504781;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)Lkj;"
	)
	@Override
	public kj ao(int var1, int var2) {
		if (!this.az(var1, var2, (byte)63)) {
			return null;
		} else {
			int var3 = var1 + (-1320046656 * this.az_fld - this.aw_fld);
			int var4 = this.av_fld * -832031424 - this.ay_fld + var2;
			return new kj(1615020824 * this.ak_fld, var3, var4);
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ac() {
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	@Override
	public boolean al(int var1, int var2) {
		return var1 >> 6 >= this.aw_fld && var1 >> 6 <= this.as_fld && var2 >> 6 >= this.ay_fld && var2 >> 6 <= this.ar_fld;
	}

	gq() {
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	@Override
	public void ah(xi var1, int var2) {
		this.ak_fld = var1.cg();
		this.ag_fld = var1.cg();
		this.az_fld = var1.cm() * -710858433;
		this.av_fld = var1.cm() * 1860606077;
		this.ae_fld = var1.cm();
		this.ah_fld = var1.cm();
		this.aw_fld = var1.cm();
		this.ay_fld = var1.cm();
		this.as_fld = var1.cm();
		this.ar_fld = var1.cm();
		this.aw();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void aw() {
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lhf;)V"
	)
	@Override
	public void ay(hf var1) {
		if (var1.ak_fld > this.aw_fld) {
			var1.ak_fld = this.aw_fld * -1344807129;
		}

		if (var1.ag_fld < this.as_fld) {
			var1.ag_fld = this.as_fld * 694324322;
		}

		if (var1.az_fld > this.ay_fld) {
			var1.az_fld = 476454541 * this.ay_fld;
		}

		if (var1.av_fld < this.ar_fld) {
			var1.av_fld = this.ar_fld * 362504781;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	@Override
	public boolean au(int var1, int var2) {
		return var1 >> 6 >= this.aw_fld && var1 >> 6 <= this.as_fld && var2 >> 6 >= this.ay_fld && var2 >> 6 <= this.ar_fld;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lhf;)V"
	)
	@Override
	public void ar(hf var1) {
		if (var1.ak_fld > this.aw_fld) {
			var1.ak_fld = this.aw_fld * -850789857;
		}

		if (var1.ag_fld < this.as_fld) {
			var1.ag_fld = this.as_fld * -201666247;
		}

		if (var1.az_fld > this.ay_fld) {
			var1.az_fld = 476454541 * this.ay_fld;
		}

		if (var1.av_fld < this.ar_fld) {
			var1.av_fld = this.ar_fld * -815286947;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(III)Z"
	)
	@Override
	public boolean af(int var1, int var2, int var3) {
		return var1 >= this.ak_fld && var1 < this.ak_fld + this.ag_fld
			? var2 >> 6 >= this.az_fld && var2 >> 6 <= this.ae_fld && var3 >> 6 >= this.av_fld && var3 >> 6 <= this.ah_fld
			: false;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	@Override
	public boolean aa(int var1, int var2) {
		return var1 >> 6 >= this.aw_fld && var1 >> 6 <= this.as_fld && var2 >> 6 >= this.ay_fld && var2 >> 6 <= this.ar_fld;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lhf;)V"
	)
	@Override
	public void as(hf var1) {
		if (var1.ak_fld > this.aw_fld) {
			var1.ak_fld = this.aw_fld * 625018877;
		}

		if (var1.ag_fld < this.as_fld) {
			var1.ag_fld = this.as_fld * -201666247;
		}

		if (var1.az_fld > this.ay_fld) {
			var1.az_fld = -1019899859 * this.ay_fld;
		}

		if (var1.av_fld < this.ar_fld) {
			var1.av_fld = this.ar_fld * 362504781;
		}
	}

	@ObfuscatedName("ne")
	@ObfuscatedSignature(
		descriptor = "(Lgq;)V"
	)
	public static void ne(gq var0) {
		if (var0 == null) {
			var0.getClass();
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	@Override
	public boolean an(int var1, int var2) {
		return var1 >> 6 >= this.aw_fld && var1 >> 6 <= this.as_fld && var2 >> 6 >= this.ay_fld && var2 >> 6 <= this.ar_fld;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	public void at(xi var1) {
		this.ak_fld = var1.cg() * 1085055968;
		this.ag_fld = var1.cg();
		this.az_fld = var1.cm() * -710858433;
		this.av_fld = var1.cm() * 1427676462;
		this.ae_fld = var1.cm();
		this.ah_fld = var1.cm() * 115290260;
		this.aw_fld = var1.cm();
		this.ay_fld = var1.cm() * 1732222539;
		this.as_fld = var1.cm() * -965218830;
		this.ar_fld = var1.cm() * -1349295403;
		this.aw();
	}

	@ObfuscatedName("ja")
	@ObfuscatedSignature(
		descriptor = "(Lda;)I"
	)
	public static int ja(da var0) {
		return qa.ps(var0.cw_fld, (byte)-25);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	@Override
	public boolean ax(int var1, int var2) {
		return var1 >> 6 >= this.aw_fld && var1 >> 6 <= this.as_fld && var2 >> 6 >= this.ay_fld && var2 >> 6 <= this.ar_fld;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(III)[I"
	)
	@Override
	public int[] ai(int var1, int var2, int var3) {
		return !this.ag(var1, var2, var3, -1353091597)
			? null
			: new int[]{var2 + (this.aw_fld - this.az_fld * -1320046656), this.ay_fld - this.av_fld * -832031424 + var3};
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(III)[I"
	)
	@Override
	public int[] aq(int var1, int var2, int var3) {
		return !this.ag(var1, var2, var3, -1341431275)
			? null
			: new int[]{var2 + (this.aw_fld - this.az_fld * -1320046656), this.ay_fld - this.av_fld * -832031424 + var3};
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(III)[I"
	)
	@Override
	public int[] am(int var1, int var2, int var3) {
		return !this.ag(var1, var2, var3, -1783061828)
			? null
			: new int[]{var2 + (this.aw_fld - this.az_fld * -1320046656), this.ay_fld - this.av_fld * -832031424 + var3};
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)Lkj;"
	)
	@Override
	public kj ad(int var1, int var2) {
		if (!this.az(var1, var2, (byte)113)) {
			return null;
		} else {
			int var3 = var1 + (-1320046656 * this.az_fld - this.aw_fld);
			int var4 = this.av_fld * -832031424 - this.ay_fld + var2;
			return new kj(this.ak_fld, var3, var4);
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z"
	)
	@Override
	public boolean az(int var1, int var2, byte var3) {
		return var1 >> 6 >= this.aw_fld && var1 >> 6 <= this.as_fld && var2 >> 6 >= this.ay_fld && var2 >> 6 <= this.ar_fld;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	public void ab(xi var1) {
		this.ak_fld = var1.cg();
		this.ag_fld = var1.cg();
		this.az_fld = var1.cm() * -705488833;
		this.av_fld = var1.cm() * -1687130458;
		this.ae_fld = var1.cm() * 705200752;
		this.ah_fld = var1.cm() * 547114187;
		this.aw_fld = var1.cm() * 1635452861;
		this.ay_fld = var1.cm();
		this.as_fld = var1.cm();
		this.ar_fld = var1.cm() * 453569077;
		this.aw();
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	public void ap(xi var1) {
		this.ak_fld = var1.cg() * 989242868;
		this.ag_fld = var1.cg();
		this.az_fld = var1.cm() * -710858433;
		this.av_fld = var1.cm() * 1860606077;
		this.ae_fld = var1.cm();
		this.ah_fld = var1.cm();
		this.aw_fld = var1.cm() * 954223185;
		this.ay_fld = var1.cm();
		this.as_fld = var1.cm() * 1304181651;
		this.ar_fld = var1.cm() * -1803424385;
		this.aw();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z"
	)
	@Override
	public boolean ag(int var1, int var2, int var3, int var4) {
		return var1 >= this.ak_fld && var1 < this.ak_fld + this.ag_fld
			? var2 >> 6 >= this.az_fld && var2 >> 6 <= this.ae_fld && var3 >> 6 >= this.av_fld && var3 >> 6 <= this.ah_fld
			: false;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I"
	)
	@Override
	public int[] av(int var1, int var2, int var3, int var4) {
		return !this.ag(var1, var2, var3, -2071447084)
			? null
			: new int[]{var2 + (this.aw_fld - this.az_fld * -1320046656), this.ay_fld - this.av_fld * -832031424 + var3};
	}
}
