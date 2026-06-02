import java.io.EOFException;
import java.util.ArrayList;
import java.util.Arrays;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;
import net.runelite.api.events.PlayerDespawned;
import net.runelite.api.events.PlayerSpawned;

@ObfuscatedName("cl")
public class cl implements rx {
	@ObfuscatedGetter(
		intValue = -104994775
	)
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ag_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "[Ljava/lang/String;"
	)
	String[] aw_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	kj az_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "B"
	)
	byte av_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	gt ae_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lxi;"
	)
	xi ah_fld;
	@ObfuscatedGetter(
		intValue = -481988227
	)
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ay_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lbb;"
	)
	bb as_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/ArrayList;"
	)
	ArrayList ak_fld = new ArrayList(1);
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	static int[] am_fld;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	public static ub ao_fld;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ar_fld;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	public static cv aj_fld;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int at_fld;

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lcv;)V"
	)
	void av(cv var1) {
		this.hs(var1);
		this.ak_fld.remove(var1);
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bf() {
		this.ak_fld.clear();
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lcv;)V"
	)
	void az(cv var1) {
		this.la(var1);
		this.ak_fld.add(var1);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ILdx;)Lcv;"
	)
	cv ah(int var1, dx var2) throws EOFException {
		cv var4 = new cv(var1);
		if (null != this.ah_fld) {
			var4.ag(this.ah_fld, (byte)44);
		}

		var4.dv_fld = 0;
		var4.er(this.as_fld, 670055497);
		var4.dd_fld[0] = this.ae_fld;
		var4.ac_fld = this.az_fld.ak_fld;
		var4.bl_fld = var2.ag_fld;
		var4.aw_fld = this.aw_fld;
		var4.da(-621797759 * this.az_fld.ag_fld - var2.ay_fld, 1479124089 * this.az_fld.az_fld - var2.as_fld, -1573173708);
		return var4;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	@Override
	public boolean aw(int var1) {
		return -1 == this.ag_fld;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void ay(int var1) {
		this.ag_fld = kj.pe(this.az_fld, -647501588);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void as(int var1, int var2) {
		this.az_fld.au(this.ag_fld, var1, var2);
		this.ag_fld = -1483486233;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	@Override
	public int ar(int var1) {
		return -621797759 * this.az_fld.ag_fld;
	}

	@ObfuscatedName("in")
	@ObfuscatedSignature(
		descriptor = "(Lcl;ILdx;)Lcv;"
	)
	public static cv in(cl var0, int var1, dx var2) throws EOFException {
		if (var0 == null) {
			var0.getClass();
		}

		cv var3 = new cv(var1);
		if (null != var0.ah_fld) {
			var3.ag(var0.ah_fld, (byte)-50);
		}

		var3.dv_fld = 0;
		var3.er(var0.as_fld, 533430814);
		var3.dd_fld[0] = var0.ae_fld;
		var3.ac_fld = var0.az_fld.ak_fld;
		var3.bl_fld = var2.ag_fld;
		var3.aw_fld = var0.aw_fld;
		var3.da(-621797759 * var0.az_fld.ag_fld - var2.ay_fld, 1479124089 * var0.az_fld.az_fld - var2.as_fld, -1688212810);
		return var3;
	}

	@ObfuscatedName("la")
	@ObfuscatedSignature(
		descriptor = "(Lcv;)V"
	)
	public void la(cv var1) {
		if (var1.getId() == client.dj_fld) {
			aj_fld = var1;
		}

		og.ci_fld.getCallbacks().postDeferred(new PlayerSpawned(var1));
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(Lcl;I)V"
	)
	public static void bc(cl var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ak_fld.clear();
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	@Override
	public int af(byte var1) {
		return this.az_fld.az_fld * 1479124089;
	}

	@ObfuscatedName("jp")
	@ObfuscatedSignature(
		descriptor = "(Lcl;II)V"
	)
	public static void jp(cl var0, int var1, int var2) throws EOFException {
		if (var0 == null) {
			var0.getClass();
		}

		for (int var3 = 0; var3 < var0.ak_fld.size(); var3++) {
			cg.cv((cv)var0.ak_fld.get(var3), var1, var2, -640916202);
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	@Override
	public int al(int var1) {
		return 1846813669 * this.az_fld.ak_fld;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lgt;B)V"
	)
	void ax(gt var1, byte var2) throws EOFException {
		for (int var3 = 0; var3 < this.ak_fld.size(); var3++) {
			cv var4 = (cv)(cv)this.ak_fld.get(var3);
			dx var5 = var4.eb((byte)-99);
			int var6 = -621797759 * this.az_fld.ag_fld - var5.ay_fld;
			int var7 = this.az_fld.az_fld * 1479124089 - var5.as_fld;
			gt var8 = var1;
			short var9 = 1536;
			short var10 = 11776;
			if (var5.ag_fld == 0 && client.et_fld == this.ay_fld && dn.ed_fld == kc.ak_fld) {
				if (var2 == 0) {
					return;
				}

				if (var4.bo_fld < 1536 || var4.bp_fld < 1536 || var4.bo_fld >= 11776 || var4.bp_fld >= 11776) {
					var8 = gt.ak_fld;
				}
			}

			var4.ac_fld = -244182729 * this.az_fld.ak_fld;
			if (var8 == gt.ak_fld) {
				if (var2 == 0) {
					return;
				}

				var4.da(var6, var7, -1331433344);
			} else {
				var4.ac(var5, var6, var7, var8, (short)213);
			}
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	void an(xi var1) throws EOFException {
		this.ah_fld = var1;

		for (int var3 = 0; var3 < this.ak_fld.size(); var3++) {
			((cv)this.ak_fld.get(var3)).ag(this.ah_fld, (byte)-42);
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void aa(int var1, int var2) throws EOFException {
		for (int var4 = 0; var4 < this.ak_fld.size(); var4++) {
			cg.cv((cv)this.ak_fld.get(var4), var1, var2, 678491441);
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(ILxj;)V"
	)
	void ai(int var1, xj var2) {
		this.as_fld.az(var1, var2);
		this.aq();
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void aq() {
		for (int var2 = 0; var2 < this.ak_fld.size(); var2++) {
			((da)this.ak_fld.get(var2)).er(this.as_fld, 216435503);
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void am(int var1, int var2) {
		bb.jx(this.as_fld, var1, var2, -1106240719);
		this.aq();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	void ao(int var1, int var2, int var3, int var4) throws EOFException {
		for (int var6 = 0; var6 < this.ak_fld.size(); var6++) {
			((da)this.ak_fld.get(var6)).dx(var1, var2, client.dv_fld, var3, var4, (byte)-47);
		}
	}

	@ObfuscatedName("nl")
	@ObfuscatedSignature(
		descriptor = "(Lcl;IIII)V"
	)
	public static void nl(cl var0, int var1, int var2, int var3, int var4) throws EOFException {
		if (var0 == null) {
			var0.getClass();
		}

		for (int var5 = 0; var5 < var0.ak_fld.size(); var5++) {
			((da)var0.ak_fld.get(var5)).db(var1, var2, var3, var4, (byte)-31);
		}
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(ILdx;)Lcv;"
	)
	cv bl(int var1, dx var2) throws EOFException {
		cv var3 = new cv(var1);
		if (null != this.ah_fld) {
			var3.ag(this.ah_fld, (byte)99);
		}

		var3.dv_fld = 0;
		var3.er(this.as_fld, 1703583875);
		var3.dd_fld[0] = this.ae_fld;
		var3.ac_fld = this.az_fld.ak_fld;
		var3.bl_fld = var2.ag_fld;
		var3.aw_fld = this.aw_fld;
		var3.da(-621797759 * this.az_fld.ag_fld - var2.ay_fld, 1479124089 * this.az_fld.az_fld - var2.as_fld, 1395187736);
		return var3;
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void bc(int var1) throws EOFException {
		for (int var3 = 0; var3 < this.ak_fld.size(); var3++) {
			((da)this.ak_fld.get(var3)).du(var1, 1873159917);
		}
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void ck(int var1) {
		this.as_fld.av(var1, false);
		this.aq();
	}

	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;)V"
	)
	void da(String[] var1) {
		this.aw_fld = (String[])(String[])Arrays.copyOf(var1, var1.length);

		for (int var2 = 0; var2 < this.ak_fld.size(); var2++) {
			((cv)this.ak_fld.get(var2)).aw_fld = (String[])(String[])Arrays.copyOf(var1, var1.length);
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(IIBBBB)V"
	)
	void bd(int var1, int var2, byte var3, byte var4, byte var5, byte var6) {
		for (int var8 = 0; var8 < this.ak_fld.size(); var8++) {
			cv var9 = (cv)(cv)this.ak_fld.get(var8);
			var9.bf_fld = var1;
			var9.by_fld = var2;
			var9.be_fld.ag(var3, var4, var5, var6);
		}
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(ILxj;)V"
	)
	void cr(int var1, xj var2) {
		this.as_fld.az(var1, var2);
		this.aq();
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;)V"
	)
	void bm(String[] var1) {
		this.aw_fld = (String[])(String[])Arrays.copyOf(var1, var1.length);

		for (int var3 = 0; var3 < this.ak_fld.size(); var3++) {
			((cv)this.ak_fld.get(var3)).aw_fld = (String[])(String[])Arrays.copyOf(var1, var1.length);
		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(Lcv;)V"
	)
	void bs(cv var1) {
		this.ak_fld.add(var1);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ak() {
		this.uu();
		this.ah_fld = null;
		this.ak_fld.clear();
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(Lcv;)V"
	)
	void bk(cv var1) {
		this.ak_fld.remove(var1);
	}

	@ObfuscatedName("fi")
	@ObfuscatedSignature(
		descriptor = "(Lcl;I)V"
	)
	public static void fi(cl var0, int var1) throws EOFException {
		if (var0 == null) {
			var0.getClass();
		}

		for (int var2 = 0; var2 < var0.ak_fld.size(); var2++) {
			((da)var0.ak_fld.get(var2)).du(var1, 1638546238);
		}
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(Lcv;)V"
	)
	void bj(cv var1) {
		this.ak_fld.remove(var1);
	}

	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "(IIBBBB)V"
	)
	void db(int var1, int var2, byte var3, byte var4, byte var5, byte var6) {
		for (int var7 = 0; var7 < this.ak_fld.size(); var7++) {
			cv var8 = (cv)(cv)this.ak_fld.get(var7);
			var8.bf_fld = var1;
			var8.by_fld = var2;
			var8.be_fld.ag(var3, var4, var5, var6);
		}
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	public boolean bo() {
		return -1 == this.ag_fld;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(Lcv;)V"
	)
	void bh(cv var1) {
		this.ak_fld.add(var1);
	}

	@ObfuscatedName("uu")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void uu() {
		aj_fld = null;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bt() {
		this.ag_fld = kj.pe(this.az_fld, -1152134214);
	}

	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V"
	)
	void dh(int var1, int var2, int var3, int var4, int var5) throws EOFException {
		for (int var6 = 0; var6 < this.ak_fld.size(); var6++) {
			((da)this.ak_fld.get(var6)).ds(var1, client.dv_fld, var2, var3, var4, var5, -852972989);
		}
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bi() {
		this.ag_fld = kj.pe(this.az_fld, 54066993);
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(Lgt;)V"
	)
	void cv(gt var1) throws EOFException {
		for (int var2 = 0; var2 < this.ak_fld.size(); var2++) {
			cv var3 = (cv)(cv)this.ak_fld.get(var2);
			dx var4 = var3.eb((byte)-44);
			int var5 = -621797759 * this.az_fld.ag_fld - var4.ay_fld;
			int var6 = this.az_fld.az_fld * 1479124089 - var4.as_fld;
			gt var7 = var1;
			short var8 = 1536;
			short var9 = 11776;
			if (var4.ag_fld == 0
				&& client.et_fld == this.ay_fld
				&& dn.ed_fld == kc.ak_fld
				&& (var3.bo_fld < 1536 || var3.bp_fld < 1536 || var3.bo_fld >= 11776 || var3.bp_fld >= 11776)) {
				var7 = gt.ak_fld;
			}

			var3.ac_fld = -244182729 * this.az_fld.ak_fld;
			if (var7 == gt.ak_fld) {
				var3.da(var5, var6, 305510996);
			} else {
				var3.ac(var4, var5, var6, var7, (short)213);
			}
		}
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void cb(int var1, int var2) {
		this.az_fld.au(this.ag_fld, var1, var2);
		this.ag_fld = -1483486233;
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void ce(int var1, int var2) {
		this.az_fld.au(this.ag_fld, var1, var2);
		this.ag_fld = -1483486233;
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int bw() {
		return -621797759 * this.az_fld.ag_fld;
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int ba() {
		return this.az_fld.az_fld * 1479124089;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int bq() {
		return -1758935977 * this.az_fld.ak_fld;
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	public boolean bp() {
		return -1 == this.ag_fld;
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void bb(int var1) {
		this.az_fld.ak_fld = var1;
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void cd(int var1) {
		this.az_fld.ak_fld = var1;
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(ILxj;)V"
	)
	void cn(int var1, xj var2) {
		this.as_fld.az(var1, var2);
		this.aq();
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(Lgt;)V"
	)
	void cq(gt var1) throws EOFException {
		for (int var2 = 0; var2 < this.ak_fld.size(); var2++) {
			cv var3 = (cv)(cv)this.ak_fld.get(var2);
			dx var4 = var3.eb((byte)115);
			int var5 = -621797759 * this.az_fld.ag_fld - var4.ay_fld;
			int var6 = this.az_fld.az_fld * -1003404960 - var4.as_fld;
			gt var7 = var1;
			short var8 = 1536;
			int var9 = -444903547;
			if (-1643096714 * var4.ag_fld == 0
				&& client.et_fld == this.ay_fld
				&& dn.ed_fld == kc.ak_fld
				&& (var3.bo_fld < 1536 || var3.bp_fld < -623807804 || var3.bo_fld >= 11776 || var3.bp_fld >= 11776)) {
				var7 = gt.ak_fld;
			}

			var3.ac_fld = -244182729 * this.az_fld.ak_fld;
			if (var7 == gt.ak_fld) {
				var3.da(var5, var6, 139481250);
			} else {
				var3.ac(var4, var5, var6, var7, (short)213);
			}
		}
	}

	cl(int var1) {
		this.ag_fld = 0;
		this.az_fld = new kj();
		this.aw_fld = new String[3];
		this.ay_fld = 1804644395;
		this.as_fld = new bb();
		this.ay_fld = var1;

		for (int var2 = 0; var2 < 3; var2++) {
			this.aw_fld[var2] = "";
		}
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	void cf(xi var1) throws EOFException {
		this.ah_fld = var1;

		for (int var2 = 0; var2 < this.ak_fld.size(); var2++) {
			((cv)this.ak_fld.get(var2)).ag(this.ah_fld, (byte)47);
		}
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	void cx(xi var1) throws EOFException {
		this.ah_fld = var1;

		for (int var2 = 0; var2 < this.ak_fld.size(); var2++) {
			((cv)this.ak_fld.get(var2)).ag(this.ah_fld, (byte)-73);
		}
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	void cs(xi var1) throws EOFException {
		this.ah_fld = var1;

		for (int var2 = 0; var2 < this.ak_fld.size(); var2++) {
			((cv)this.ak_fld.get(var2)).ag(this.ah_fld, (byte)72);
		}
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(ILdx;)Lcv;"
	)
	cv by(int var1, dx var2) throws EOFException {
		cv var3 = new cv(var1);
		if (null != this.ah_fld) {
			var3.ag(this.ah_fld, (byte)13);
		}

		var3.dv_fld = 0;
		var3.er(this.as_fld, 1736161325);
		var3.dd_fld[0] = this.ae_fld;
		var3.ac_fld = this.az_fld.ak_fld;
		var3.bl_fld = var2.ag_fld;
		var3.aw_fld = this.aw_fld;
		var3.da(-621797759 * this.az_fld.ag_fld - var2.ay_fld, 1479124089 * this.az_fld.az_fld - var2.as_fld, -1318177002);
		return var3;
	}

	@ObfuscatedName("sx")
	@ObfuscatedSignature(
		descriptor = "(Lcl;IIII)V"
	)
	public static void sx(cl var0, int var1, int var2, int var3, int var4) throws EOFException {
		if (var0 == null) {
			var0.getClass();
		} else {
			for (int var6 = 0; var6 < var0.ak_fld.size(); var6++) {
				((da)var0.ak_fld.get(var6)).db(var1, var2, var3, var4, (byte)-46);
			}
		}
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int bg() {
		return 1846813669 * this.az_fld.ak_fld;
	}

	@ObfuscatedName("kb")
	@ObfuscatedSignature(
		descriptor = "(Lcl;Ljava/lang/String;I)V"
	)
	public static void kb(cl var0, String var1, int var2) throws EOFException {
		if (var0 == null) {
			var0.getClass();
		} else {
			boolean var3 = var1.charAt(0) == '~';
			if (var3) {
				var1 = var1.substring(1);
			}

			aax var4 = null;

			for (int var5 = 0; var5 < var0.ak_fld.size(); var5++) {
				cv var6 = (cv)(cv)var0.ak_fld.get(var5);
				var6.cs_fld = false;
				var6.cn_fld = 0;
				var6.cr_fld = 0;
				var6.ce_fld = 1956667062;
				var6.cx_fld = var1;
				var6.es(-1);
				var4 = var6.az_fld;
			}

			if (null != var4) {
				if (var3 || var0.ay_fld == client.dj_fld) {
					io.ag(2, var4.ak(-1561936447), var1);
				}
			}
		}
	}

	@ObfuscatedName("ip")
	@ObfuscatedSignature(
		descriptor = "(Lcl;)V"
	)
	public static void ip(cl var0) {
		if (var0 == null) {
			var0.getClass();
		} else {
			for (int var1 = 0; var1 < var0.ak_fld.size(); var1++) {
				((da)var0.ak_fld.get(var1)).er(var0.as_fld, 1550060260);
			}
		}
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void br(int var1) {
		this.ag_fld = var1;
		this.as_fld.ak();
		this.av_fld = 0;
		this.ae_fld = gt.az_fld;
		this.ah_fld = null;
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(ILxj;)V"
	)
	void ca(int var1, xj var2) {
		this.as_fld.az(var1, var2);
		this.aq();
	}

	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;)V"
	)
	void ds(String[] var1) {
		this.aw_fld = (String[])(String[])Arrays.copyOf(var1, var1.length);

		for (int var2 = 0; var2 < this.ak_fld.size(); var2++) {
			((cv)this.ak_fld.get(var2)).aw_fld = (String[])(String[])Arrays.copyOf(var1, var1.length);
		}
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	void cy(xi var1) throws EOFException {
		this.ah_fld = var1;

		for (int var2 = 0; var2 < this.ak_fld.size(); var2++) {
			((cv)this.ak_fld.get(var2)).ag(this.ah_fld, (byte)-67);
		}
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void cz(int var1, int var2) {
		bb.jx(this.as_fld, var1, var2, -1106240719);
		this.aq();
	}

	@ObfuscatedName("lp")
	@ObfuscatedSignature(
		descriptor = "(Lcl;)V"
	)
	public static void lp(cl var0) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ag_fld = kj.pe(var0.az_fld, -653421302);
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void cm() {
		for (int var1 = 0; var1 < this.ak_fld.size(); var1++) {
			((da)this.ak_fld.get(var1)).er(this.as_fld, 1558641038);
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void ap(int var1, int var2) {
		bb.jx(this.as_fld, var1, var2, -1106240719);
		this.aq();
	}

	@ObfuscatedName("jb")
	@ObfuscatedSignature(
		descriptor = "(Lcl;IIII)V"
	)
	public static void jb(cl var0, int var1, int var2, int var3, int var4) throws EOFException {
		if (var0 == null) {
			var0.getClass();
		} else {
			for (int var5 = 0; var5 < var0.ak_fld.size(); var5++) {
				((da)var0.ak_fld.get(var5)).dx(var1, var2, client.dv_fld, var3, var4, (byte)-7);
			}
		}
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void bn(int var1, int var2) {
		bb.jx(this.as_fld, var1, var2, -1106240719);
		this.aq();
	}

	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void dv(int var1) throws EOFException {
		for (int var2 = 0; var2 < this.ak_fld.size(); var2++) {
			((da)this.ak_fld.get(var2)).du(var1, 1846881960);
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void at(int var1, int var2) {
		bb.jx(this.as_fld, var1, var2, -1106240719);
		this.aq();
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
	)
	void cu(String var1) {
		boolean var2 = var1.charAt(0) == '~';
		if (var2) {
			var1 = var1.substring(1);
		}

		aax var3 = null;

		for (int var4 = 0; var4 < this.ak_fld.size(); var4++) {
			cv var5 = (cv)(cv)this.ak_fld.get(var4);
			var5.cs_fld = false;
			var5.cn_fld = 0;
			var5.cr_fld = 0;
			var5.ce_fld = 1956667062;
			var5.cx_fld = var1;
			var3 = var5.az_fld;
		}

		if (null != var3) {
			if (var2 || this.ay_fld == client.dj_fld) {
				io.ag(2, var3.ak(-1422814571), var1);
			}
		}
	}

	@ObfuscatedName("ql")
	@ObfuscatedSignature(
		descriptor = "(Lcl;ILki;ZLjava/lang/String;[BB)V"
	)
	public static void ql(cl var0, int var1, ki var2, boolean var3, String var4, byte[] var5, byte var6) throws EOFException {
		if (var0 == null) {
			var0.getClass();
		}

		boolean var7 = false;
		String var8 = null;

		for (int var9 = 0; var9 < var0.ak_fld.size(); var9++) {
			if (var6 == 2) {
				return;
			}

			cv var10 = (cv)(cv)var0.ak_fld.get(var9);
			if (null != var10.az_fld && var10.av_fld != null) {
				boolean var11 = false;
				if (var2.ad_fld) {
					if (var6 == 2) {
						return;
					}

					if (la.fq_fld.au(var10.az_fld)) {
						var11 = true;
					}
				}

				if (!var11) {
					if (var6 == 2) {
						return;
					}

					if (0 == client.de_fld && !var10.at_fld) {
						int[] var13;
						boolean var10001;
						label163: {
							var7 = true;
							var8 = var10.az_fld.ak(-86787009);
							var10.cx_fld = var4.trim();
							var10.es(-1);
							var10.cn_fld = var1 >> 8;
							var10.cr_fld = var1 & 0xFF;
							var10.ce_fld = 1956667062;
							byte[] var14 = var5;
							if (null != var5) {
								if (var6 == 2) {
									return;
								}

								if (var5.length != 0 && var5.length <= 8) {
									int[] var15 = new int[var5.length];

									for (int var16 = 0; var16 < var14.length; var16++) {
										if (var14[var16] < 0 || var14[var16] >= ys.ak_fld.length) {
											var13 = null;
											break label163;
										}

										var15[var16] = ys.ak_fld[var14[var16]];
									}

									var13 = var15;
									break label163;
								}
							}

							var13 = null;
						}

						label145: {
							var10.ca_fld = var13;
							var10.cs_fld = var3;
							if (var10.bx_fld != client.dj_fld && var2.ad_fld) {
								if (var6 == 2) {
									return;
								}

								if (!client.kn_fld.isEmpty() && var4.toLowerCase().indexOf(client.kn_fld) == -1) {
									var10001 = true;
									break label145;
								}
							}

							var10001 = false;
						}

						var10.cp_fld = var10001;
					}
				}
			}
		}

		if (var7 && null != var8) {
			int var17;
			if (var2.am_fld) {
				var17 = var3 ? 91 : 1;
			} else {
				var17 = var3 ? 90 : 2;
			}

			if (-1 != var2.aq_fld) {
				io.ag(var17, ce.ak(var2.aq_fld) + var8, var4);
			} else {
				io.ag(var17, var8, var4);
			}
		}
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
	)
	void ci(String var1) {
		boolean var2 = var1.charAt(0) == '~';
		if (var2) {
			var1 = var1.substring(1);
		}

		aax var3 = null;

		for (int var4 = 0; var4 < this.ak_fld.size(); var4++) {
			cv var5 = (cv)(cv)this.ak_fld.get(var4);
			var5.cs_fld = false;
			var5.cn_fld = 0;
			var5.cr_fld = 0;
			var5.ce_fld = 1956667062;
			var5.cx_fld = var1;
			var3 = var5.az_fld;
		}

		if (null != var3) {
			if (var2 || this.ay_fld == client.dj_fld) {
				io.ag(2, var3.ak(-1327968431), var1);
			}
		}
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
	)
	void cj(String var1) {
		boolean var2 = var1.charAt(0) == 1334327232;
		if (var2) {
			var1 = var1.substring(1);
		}

		aax var3 = null;

		for (int var4 = 0; var4 < this.ak_fld.size(); var4++) {
			cv var5 = (cv)(cv)this.ak_fld.get(var4);
			var5.cs_fld = false;
			var5.cn_fld = 0;
			var5.cr_fld = 0;
			var5.ce_fld = 1956667062;
			var5.cx_fld = var1;
			var3 = var5.az_fld;
		}

		if (null != var3) {
			if (var2 || this.ay_fld == client.dj_fld) {
				io.ag(2, var3.ak(-792251276), var1);
			}
		}
	}

	@ObfuscatedName("fl")
	@ObfuscatedSignature(
		descriptor = "(Lcl;I)V"
	)
	public static void fl(cl var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.ag_fld = var1;
			var0.as_fld.ak();
			var0.av_fld = 0;
			var0.ae_fld = gt.az_fld;
			var0.ah_fld = null;
		}
	}

	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		descriptor = "(Lcv;)V"
	)
	public void hs(cv var1) {
		og.ci_fld.getCallbacks().post(new PlayerDespawned(var1));
		if (aj_fld == var1) {
			aj_fld = null;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void ag(int var1) {
		this.ag_fld = var1;
		this.as_fld.ak();
		this.av_fld = 0;
		this.ae_fld = gt.az_fld;
		this.ah_fld = null;
	}

	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	void dy(int var1, int var2, int var3, int var4) throws EOFException {
		for (int var5 = 0; var5 < this.ak_fld.size(); var5++) {
			((da)this.ak_fld.get(var5)).dx(var1, var2, client.dv_fld, var3, var4, (byte)-103);
		}
	}

	@ObfuscatedName("gw")
	@ObfuscatedSignature(
		descriptor = "(Lcl;II)V"
	)
	public static void gw(cl var0, int var1, int var2) throws EOFException {
		for (int var3 = 0; var3 < var0.ak_fld.size(); var3++) {
			cg.cv((cv)var0.ak_fld.get(var3), var1, var2, 227796704);
		}
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void cw() {
		for (int var1 = 0; var1 < this.ak_fld.size(); var1++) {
			((da)this.ak_fld.get(var1)).er(this.as_fld, 1816705583);
		}
	}

	@ObfuscatedName("ri")
	@ObfuscatedSignature(
		descriptor = "(Lcl;IB)V"
	)
	public static void ri(cl var0, int var1, byte var2) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.az_fld.ak_fld = var1;
		}
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
	)
	void ch(String var1) {
		boolean var2 = var1.charAt(0) == 1719062879;
		if (var2) {
			var1 = var1.substring(1);
		}

		aax var3 = null;

		for (int var4 = 0; var4 < this.ak_fld.size(); var4++) {
			cv var5 = (cv)(cv)this.ak_fld.get(var4);
			var5.cs_fld = false;
			var5.cn_fld = 0;
			var5.cr_fld = 0;
			var5.ce_fld = 539255547;
			var5.cx_fld = var1;
			var3 = var5.az_fld;
		}

		if (null != var3) {
			if (var2 || this.ay_fld == client.dj_fld) {
				io.ag(2, var3.ak(-1880509916), var1);
			}
		}
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bv() {
		this.ag_fld = kj.pe(this.az_fld, -1248096377);
	}

	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void dm(int var1) {
		this.as_fld.av(var1, false);
		this.aq();
	}

	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void dq(int var1) {
		this.as_fld.av(var1, false);
		this.aq();
	}

	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "(ILki;ZLjava/lang/String;[B)V"
	)
	void do_(int var1, ki var2, boolean var3, String var4, byte[] var5) {
		boolean var6 = false;
		String var7 = null;

		for (int var8 = 0; var8 < this.ak_fld.size(); var8++) {
			cv var9 = (cv)(cv)this.ak_fld.get(var8);
			if (null != var9.az_fld && var9.av_fld != null) {
				boolean var10 = false;
				if (var2.ad_fld && la.fq_fld.au(var9.az_fld)) {
					var10 = true;
				}

				if (!var10 && 0 == client.de_fld && !var9.at_fld) {
					var6 = true;
					var7 = var9.az_fld.ak(-585211726);
					var9.cx_fld = var4.trim();
					var9.cn_fld = var1 >> 8;
					var9.cr_fld = var1 & 0xFF;
					var9.ce_fld = 1956667062;
					byte[] var13 = var5;
					int[] var12;
					if (null != var5 && var5.length != 0 && var5.length <= 8) {
						int[] var14 = new int[var5.length];
						int var15 = 0;

						while (true) {
							if (var15 >= var13.length) {
								var12 = var14;
								break;
							}

							if (var13[var15] < 0 || var13[var15] >= ys.ak_fld.length) {
								var12 = null;
								break;
							}

							var14[var15] = ys.ak_fld[var13[var15]];
							var15++;
						}
					} else {
						var12 = null;
					}

					var9.ca_fld = var12;
					var9.cs_fld = var3;
					var9.cp_fld = var9.bx_fld != client.dj_fld && var2.ad_fld && !client.kn_fld.isEmpty() && var4.toLowerCase().indexOf(client.kn_fld) == -1;
				}
			}
		}

		if (var6 && null != var7) {
			int var16;
			if (var2.am_fld) {
				var16 = var3 ? 91 : 1;
			} else {
				var16 = var3 ? 90 : 2;
			}

			if (-1 != var2.aq_fld) {
				io.ag(var16, ce.ak(var2.aq_fld) + var7, var4);
			} else {
				io.ag(var16, var7, var4);
			}
		}
	}

	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "(ILki;ZLjava/lang/String;[B)V"
	)
	void dd(int var1, ki var2, boolean var3, String var4, byte[] var5) {
		boolean var6 = false;
		String var7 = null;

		for (int var8 = 0; var8 < this.ak_fld.size(); var8++) {
			cv var9 = (cv)(cv)this.ak_fld.get(var8);
			if (null != var9.az_fld && var9.av_fld != null) {
				boolean var10 = false;
				if (var2.ad_fld && la.fq_fld.au(var9.az_fld)) {
					var10 = true;
				}

				if (!var10 && 0 == client.de_fld && !var9.at_fld) {
					var6 = true;
					var7 = var9.az_fld.ak(-152996570);
					var9.cx_fld = var4.trim();
					var9.cn_fld = var1 >> 8;
					var9.cr_fld = var1 & 0xFF;
					var9.ce_fld = 1956667062;
					byte[] var13 = var5;
					int[] var12;
					if (null != var5 && var5.length != 0 && var5.length <= 8) {
						int[] var14 = new int[var5.length];
						int var15 = 0;

						while (true) {
							if (var15 >= var13.length) {
								var12 = var14;
								break;
							}

							if (var13[var15] < 0 || var13[var15] >= ys.ak_fld.length) {
								var12 = null;
								break;
							}

							var14[var15] = ys.ak_fld[var13[var15]];
							var15++;
						}
					} else {
						var12 = null;
					}

					var9.ca_fld = var12;
					var9.cs_fld = var3;
					var9.cp_fld = var9.bx_fld != client.dj_fld && var2.ad_fld && !client.kn_fld.isEmpty() && var4.toLowerCase().indexOf(client.kn_fld) == -1;
				}
			}
		}

		if (var6 && null != var7) {
			int var16;
			if (var2.am_fld) {
				var16 = var3 ? 91 : 1;
			} else {
				var16 = var3 ? 90 : 2;
			}

			if (-1 != var2.aq_fld) {
				io.ag(var16, ce.ak(var2.aq_fld) + var7, var4);
			} else {
				io.ag(var16, var7, var4);
			}
		}
	}

	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "(ILki;ZLjava/lang/String;[B)V"
	)
	void dl(int var1, ki var2, boolean var3, String var4, byte[] var5) {
		boolean var6 = false;
		String var7 = null;

		for (int var8 = 0; var8 < this.ak_fld.size(); var8++) {
			cv var9 = (cv)(cv)this.ak_fld.get(var8);
			if (null != var9.az_fld && var9.av_fld != null) {
				boolean var10 = false;
				if (var2.ad_fld && la.fq_fld.au(var9.az_fld)) {
					var10 = true;
				}

				if (!var10 && 0 == client.de_fld && !var9.at_fld) {
					var6 = true;
					var7 = var9.az_fld.ak(496209127);
					var9.cx_fld = var4.trim();
					var9.cn_fld = var1 >> 8;
					var9.cr_fld = var1 & 124155835;
					var9.ce_fld = 1956667062;
					byte[] var13 = var5;
					int[] var12;
					if (null != var5 && var5.length != 0 && var5.length <= 8) {
						int[] var14 = new int[var5.length];
						int var15 = 0;

						while (true) {
							if (var15 >= var13.length) {
								var12 = var14;
								break;
							}

							if (var13[var15] < 0 || var13[var15] >= ys.ak_fld.length) {
								var12 = null;
								break;
							}

							var14[var15] = ys.ak_fld[var13[var15]];
							var15++;
						}
					} else {
						var12 = null;
					}

					var9.ca_fld = var12;
					var9.cs_fld = var3;
					var9.cp_fld = var9.bx_fld != client.dj_fld && var2.ad_fld && !client.kn_fld.isEmpty() && var4.toLowerCase().indexOf(client.kn_fld) == -1;
				}
			}
		}

		if (var6 && null != var7) {
			int var16;
			if (var2.am_fld) {
				var16 = var3 ? -2139802111 : 1;
			} else {
				var16 = var3 ? 90 : 2;
			}

			if (-1 != var2.aq_fld) {
				io.ag(var16, ce.ak(var2.aq_fld) + var7, var4);
			} else {
				io.ag(var16, var7, var4);
			}
		}
	}

	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V"
	)
	void dr(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		for (int var8 = 0; var8 < this.ak_fld.size(); var8++) {
			cv var9 = (cv)(cv)this.ak_fld.get(var8);
			dx var10 = var9.eb((byte)-11);
			int var11 = this.az_fld.ag_fld * -621797759 - var10.ay_fld;
			int var12 = this.az_fld.az_fld * 1479124089 - var10.as_fld;
			var9.cu_fld = 801314783 * (var1 + var11);
			var9.cj_fld = -366519347 * (var2 + var12);
			var9.ci_fld = var3 + var11;
			var9.ch_fld = -1314563731 * (var4 + var12);
			var9.ct_fld = var5;
			var9.cl_fld = var6;
			var9.dc_fld = var7;
			var9.dr_fld = 0;
			cv.ua(var9, var9.ci_fld, var9.ch_fld, (byte)89);
			var9.ac_fld = this.az_fld.ak_fld;
		}
	}

	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;)V"
	)
	void dx(String[] var1) {
		this.aw_fld = (String[])(String[])Arrays.copyOf(var1, var1.length);

		for (int var2 = 0; var2 < this.ak_fld.size(); var2++) {
			((cv)this.ak_fld.get(var2)).aw_fld = (String[])(String[])Arrays.copyOf(var1, var1.length);
		}
	}

	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void dz(int var1) throws EOFException {
		for (int var2 = 0; var2 < this.ak_fld.size(); var2++) {
			((da)this.ak_fld.get(var2)).du(var1, 2079610385);
		}
	}

	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "(IIBBBB)V"
	)
	void du(int var1, int var2, byte var3, byte var4, byte var5, byte var6) {
		for (int var7 = 0; var7 < this.ak_fld.size(); var7++) {
			cv var8 = (cv)(cv)this.ak_fld.get(var7);
			var8.bf_fld = var1;
			var8.by_fld = var2;
			var8.be_fld.ag(var3, var4, var5, var6);
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V"
	)
	void ab(int var1, int var2, int var3, int var4, int var5) throws EOFException {
		for (int var7 = 0; var7 < this.ak_fld.size(); var7++) {
			((da)this.ak_fld.get(var7)).ds(var1, client.dv_fld, var2, var3, var4, var5, -380699964);
		}
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	void cl(int var1, int var2, int var3, int var4) throws EOFException {
		for (int var5 = 0; var5 < this.ak_fld.size(); var5++) {
			((da)this.ak_fld.get(var5)).db(var1, var2, var3, var4, (byte)-22);
		}
	}

	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	void dw(int var1, int var2, int var3, int var4) throws EOFException {
		for (int var5 = 0; var5 < this.ak_fld.size(); var5++) {
			((da)this.ak_fld.get(var5)).db(var1, var2, var3, var4, (byte)-113);
		}
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(ILba;Z)I"
	)
	static int by(int var0, ba var1, boolean var2) {
		if (3600 == var0) {
			if (la.fq_fld.aw_fld == 0) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -2;
			} else if (1 == la.fq_fld.aw_fld) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -1;
			} else {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = la.fq_fld.ae_fld.bl(-1440239599);
			}

			return 1;
		} else if (3601 == var0) {
			int var49 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			if (bo.vc(la.fq_fld, -1515345985) && var49 >= 0 && var49 < la.fq_fld.ae_fld.bl(-1440239599)) {
				rp var52 = (rp)rc.sc(la.fq_fld.ae_fld, var49);
				bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = rl.hv(var52, (byte)1);
				bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var52.at((byte)1);
			} else {
				bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
				bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
			}

			return 1;
		} else if (var0 == 3602) {
			int var48 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			if (bo.vc(la.fq_fld, -224933281) && var48 >= 0 && var48 < la.fq_fld.ae_fld.bl(-1440239599)) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = ((rr)rc.sc(la.fq_fld.ae_fld, var48)).ae_fld * 1107825689;
			} else {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
			}

			return 1;
		} else if (3603 == var0) {
			int var47 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			if (bo.vc(la.fq_fld, -1963571536) && var47 >= 0 && var47 < la.fq_fld.ae_fld.bl(-1440239599)) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = ((rr)rc.sc(la.fq_fld.ae_fld, var47)).aw_fld * 964405635;
			} else {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
			}

			return 1;
		} else if (3604 == var0) {
			String var46 = (String)bp.ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			int var51 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			ky.ah(var46, var51);
			return 1;
		} else if (var0 == 3605) {
			String var45 = (String)bp.ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			la.fq_fld.aa(var45);
			return 1;
		} else if (var0 == 3606) {
			String var44 = (String)bp.ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			la.fq_fld.aq(var44);
			return 1;
		} else if (3607 == var0) {
			String var43 = (String)bp.ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			bo.if_(la.fq_fld, var43, -1631835723);
			return 1;
		} else if (3608 == var0) {
			String var42 = (String)bp.ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			boolean var50 = true;
			la.fq_fld.am(var42, var50, -1524373658);
			return 1;
		} else if (3609 == var0) {
			String var40 = (String)bp.ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			var40 = cr.hs(var40);
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = la.fq_fld.al(new aax(var40, fr.gv_fld), false) ? 1 : 0;
			return 1;
		} else if (var0 == 3611) {
			if (jr.fa_fld != null) {
				bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = jr.fa_fld.ae_fld;
			} else {
				bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
			}

			return 1;
		} else if (var0 == 3612) {
			if (jr.fa_fld != null) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = jr.fa_fld.bl(-1440239599);
			} else {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
			}

			return 1;
		} else if (var0 == 3613) {
			int var39 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			if (null != jr.fa_fld && var39 < jr.fa_fld.bl(-1440239599)) {
				bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = rc.sc(jr.fa_fld, var39).ap(-1939318074).ak(-338884353);
			} else {
				bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
			}

			return 1;
		} else if (3614 == var0) {
			int var38 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			if (jr.fa_fld != null && var38 < jr.fa_fld.bl(-1440239599)) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = ((rr)rc.sc(jr.fa_fld, var38)).by(-37589207);
			} else {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
			}

			return 1;
		} else if (var0 == 3615) {
			int var37 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			if (jr.fa_fld != null && var37 < jr.fa_fld.bl(-1440239599)) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = ((rr)rc.sc(jr.fa_fld, var37)).aw_fld * 964405635;
			} else {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
			}

			return 1;
		} else if (var0 == 3616) {
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = jr.fa_fld != null ? jr.fa_fld.ah_fld : 0;
			return 1;
		} else if (3617 == var0) {
			String var36 = (String)bp.ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			hn.ge(var36);
			return 1;
		} else if (var0 == 3618) {
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = null != jr.fa_fld ? jr.fa_fld.aw_fld : 0;
			return 1;
		} else if (var0 == 3619) {
			String var35 = (String)bp.ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			jk.gw(var35);
			return 1;
		} else if (var0 == 3620) {
			bl.gx();
			return 1;
		} else if (3621 == var0) {
			if (!bo.vc(la.fq_fld, -1888852448)) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -1;
			} else {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = la.fq_fld.ah_fld.bl(-1440239599);
			}

			return 1;
		} else if (var0 == 3622) {
			int var34 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			if (bo.vc(la.fq_fld, -1741729166) && var34 >= 0 && var34 < la.fq_fld.ah_fld.bl(-1440239599)) {
				rt var5 = (rt)rc.sc(la.fq_fld.ah_fld, var34);
				bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = rl.hv(var5, (byte)1);
				bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var5.at((byte)1);
			} else {
				bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
				bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
			}

			return 1;
		} else if (var0 == 3623) {
			String var32 = (String)bp.ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			var32 = cr.hs(var32);
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = la.fq_fld.au(new aax(var32, fr.gv_fld)) ? 1 : 0;
			return 1;
		} else if (3624 == var0) {
			int var31 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			if (jr.fa_fld != null && var31 < jr.fa_fld.bl(-1440239599) && rc.sc(jr.fa_fld, var31).ap(-1939318074).equals(og.ci_fld.jn((byte)-126))) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 1;
			} else {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
			}

			return 1;
		} else if (3625 == var0) {
			if (null != jr.fa_fld && null != jr.fa_fld.av_fld) {
				bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = jr.fa_fld.av_fld;
			} else {
				bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
			}

			return 1;
		} else if (3626 == var0) {
			int var30 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			if (jr.fa_fld != null && var30 < jr.fa_fld.bl(-1440239599) && ((rh)rc.sc(jr.fa_fld, var30)).ag((short)31156)) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 1;
			} else {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
			}

			return 1;
		} else if (3627 != var0) {
			if (var0 == 3628) {
				la.fq_fld.ae_fld.cv(-1775270068);
				return 1;
			} else if (var0 == 3629) {
				boolean var29 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
				la.fq_fld.ae_fld.cy(new xt(var29), -839167793);
				return 1;
			} else if (3630 == var0) {
				boolean var28 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
				la.fq_fld.ae_fld.cy(new xq(var28), -2014403163);
				return 1;
			} else if (var0 == 3631) {
				boolean var27 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
				la.fq_fld.ae_fld.cy(new ew(var27), -224381676);
				return 1;
			} else if (var0 == 3632) {
				boolean var26 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
				la.fq_fld.ae_fld.cy(new es(var26), 118271299);
				return 1;
			} else if (var0 == 3633) {
				boolean var25 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
				la.fq_fld.ae_fld.cy(new et(var25), -456535249);
				return 1;
			} else if (var0 == 3634) {
				boolean var24 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
				la.fq_fld.ae_fld.cy(new eb(var24), 1636443051);
				return 1;
			} else if (3635 == var0) {
				boolean var23 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
				la.fq_fld.ae_fld.cy(new ep(var23), -216811542);
				return 1;
			} else if (var0 == 3636) {
				boolean var22 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
				la.fq_fld.ae_fld.cy(new ed(var22), -1700681274);
				return 1;
			} else if (var0 == 3637) {
				boolean var21 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
				la.fq_fld.ae_fld.cy(new ex(var21), 24174809);
				return 1;
			} else if (var0 == 3638) {
				boolean var20 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
				la.fq_fld.ae_fld.cy(new eo(var20), -776788339);
				return 1;
			} else if (var0 == 3639) {
				la.fq_fld.ae_fld.ba((byte)0);
				return 1;
			} else if (3640 == var0) {
				la.fq_fld.ah_fld.cv(-1738493029);
				return 1;
			} else if (var0 == 3641) {
				boolean var19 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
				la.fq_fld.ah_fld.cy(new xt(var19), -4531148);
				return 1;
			} else if (var0 == 3642) {
				boolean var18 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
				la.fq_fld.ah_fld.cy(new xq(var18), -1472859293);
				return 1;
			} else if (var0 == 3643) {
				la.fq_fld.ah_fld.ba((byte)0);
				return 1;
			} else if (3644 == var0) {
				if (jr.fa_fld != null) {
					jr.fa_fld.cv(-1976558675);
				}

				return 1;
			} else if (3645 == var0) {
				boolean var17 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
				if (null != jr.fa_fld) {
					jr.fa_fld.cy(new xt(var17), 230757785);
				}

				return 1;
			} else if (var0 == 3646) {
				boolean var16 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
				if (jr.fa_fld != null) {
					jr.fa_fld.cy(new xq(var16), -1291879076);
				}

				return 1;
			} else if (var0 == 3647) {
				boolean var15 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
				if (null != jr.fa_fld) {
					jr.fa_fld.cy(new ew(var15), 1905139686);
				}

				return 1;
			} else if (var0 == 3648) {
				boolean var14 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
				if (jr.fa_fld != null) {
					jr.fa_fld.cy(new es(var14), 529574801);
				}

				return 1;
			} else if (var0 == 3649) {
				boolean var13 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
				if (jr.fa_fld != null) {
					jr.fa_fld.cy(new et(var13), 136694791);
				}

				return 1;
			} else if (var0 == 3650) {
				boolean var12 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
				if (null != jr.fa_fld) {
					jr.fa_fld.cy(new eb(var12), 754014836);
				}

				return 1;
			} else if (3651 == var0) {
				boolean var11 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
				if (null != jr.fa_fld) {
					jr.fa_fld.cy(new ep(var11), -396632893);
				}

				return 1;
			} else if (var0 == 3652) {
				boolean var10 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
				if (jr.fa_fld != null) {
					jr.fa_fld.cy(new ed(var10), 113654807);
				}

				return 1;
			} else if (3653 == var0) {
				boolean var9 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
				if (null != jr.fa_fld) {
					jr.fa_fld.cy(new ex(var9), 2005936015);
				}

				return 1;
			} else if (3654 == var0) {
				boolean var8 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
				if (null != jr.fa_fld) {
					jr.fa_fld.cy(new eo(var8), 767716741);
				}

				return 1;
			} else if (var0 == 3655) {
				if (null != jr.fa_fld) {
					jr.fa_fld.ba((byte)0);
				}

				return 1;
			} else if (var0 == 3656) {
				boolean var7 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
				la.fq_fld.ae_fld.cy(new ec(var7), -300289443);
				return 1;
			} else if (3657 == var0) {
				boolean var6 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
				if (null != jr.fa_fld) {
					jr.fa_fld.cy(new ec(var6), 1734021387);
				}

				return 1;
			} else {
				return 2;
			}
		} else {
			int var4 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			if (null != jr.fa_fld && var4 < jr.fa_fld.bl(-1440239599) && ((rh)rc.sc(jr.fa_fld, var4)).ah((byte)118)) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 1;
			} else {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
			}

			return 1;
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V"
	)
	static void ad(String var0, String var1, String var2) {
		bn.ci_fld = var0;
		bn.cj_fld = var1;
		bn.ch_fld = var2;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void ae(int var1) {
		this.ak_fld.clear();
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IB)V"
	)
	void au(int var1, byte var2) {
		this.ay_fld = 1483486233 * var1;
		this.as_fld.ak();
		this.av_fld = 0;
		this.ae_fld = gt.ag_fld;
		this.ah_fld = null;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V"
	)
	void ad(String var1, int var2) throws EOFException {
		boolean var3 = var1.charAt(0) == '~';
		if (var3) {
			var1 = var1.substring(1);
		}

		aax var4 = null;

		for (int var5 = 0; var5 < this.ak_fld.size(); var5++) {
			cv var6 = (cv)(cv)this.ak_fld.get(var5);
			var6.cs_fld = false;
			var6.da_fld = 0;
			var6.bq_fld = 0;
			var6.by_fld = 1956667062;
			var6.cx_fld = var1;
			var6.setPoseAnimation(-1);
			var4 = var6.az_fld;
		}

		if (null != var4) {
			if (var3 || this.ay_fld == client.ga_fld) {
				io.ag(2, var4.ak(-1561936447), var1);
			}
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIS)V"
	)
	void aj(int var1, int var2, int var3, int var4, int var5, int var6, int var7, short var8) {
		for (int var9 = 0; var9 < this.ak_fld.size(); var9++) {
			cv var10 = (cv)(cv)this.ak_fld.get(var9);
			dx var11 = var10.eb((byte)38);
			int var12 = this.az_fld.az_fld * -621797759 - var11.ay_fld;
			int var13 = this.az_fld.ag_fld * 1479124089 - var11.as_fld;
			var10.bf_fld = 801314783 * (var1 + var12);
			var10.bw_fld = -366519347 * (var2 + var13);
			var10.co_fld = (var3 + var12) * -725275729;
			var10.bn_fld = -1314563731 * (var4 + var13);
			var10.ck_fld = -287255445 * var5;
			var10.dc_fld = var6 * -139656625;
			var10.bw_fld = -2077547763 * var7;
			var10.cy_fld = 0;
			cv.ua(var10, -1528231089 * var10.bg_fld, -143157147 * var10.cy_fld, (byte)4);
			var10.af_fld = this.az_fld.ak_fld * -244182729;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ILki;ZLjava/lang/String;[BB)V"
	)
	void ac(int var1, ki var2, boolean var3, String var4, byte[] var5, byte var6) throws EOFException {
		boolean var7 = false;
		String var8 = null;

		for (int var9 = 0; var9 < this.ak_fld.size(); var9++) {
			if (var6 == 2) {
				return;
			}

			cv var10 = (cv)(cv)this.ak_fld.get(var9);
			if (null != var10.az_fld && var10.av_fld != null) {
				boolean var11 = false;
				if (var2.am_fld) {
					if (var6 == 2) {
						return;
					}

					if (la.fq_fld.au(var10.az_fld)) {
						var11 = true;
					}
				}

				if (!var11) {
					if (var6 == 2) {
						return;
					}

					if (0 == client.gw_fld && !var10.ab_fld) {
						int[] var13;
						boolean var10001;
						label159: {
							var7 = true;
							var8 = var10.az_fld.ag(-86787009);
							var10.cx_fld = var4.trim();
							var10.setGraphic(-1);
							var10.cu_fld = (var1 >> 8) * -2004311331;
							var10.bx_fld = (var1 & 0xFF) * -1060407665;
							var10.bl_fld = 1956667062;
							byte[] var14 = var5;
							if (null != var5) {
								if (var6 == 2) {
									return;
								}

								if (var5.length != 0 && var5.length <= 8) {
									int[] var15 = new int[var5.length];

									for (int var16 = 0; var16 < var14.length; var16++) {
										if (var14[var16] < 0 || var14[var16] >= ys.ak_fld.length) {
											var13 = null;
											break label159;
										}

										var15[var16] = ys.ak_fld[var14[var16]];
									}

									var13 = var15;
									break label159;
								}
							}

							var13 = null;
						}

						label141: {
							var10.dq_fld = var13;
							var10.an_fld = var3;
							if (var10.bf_fld != client.oq_fld && var2.am_fld) {
								if (var6 == 2) {
									return;
								}

								if (!client.om_fld.isEmpty() && var4.toLowerCase().indexOf(client.eb_fld) == -1) {
									var10001 = true;
									break label141;
								}
							}

							var10001 = false;
						}

						var10.cp_fld = var10001;
					}
				}
			}
		}

		if (var7 && null != var8) {
			int var17;
			if (var2.ad_fld) {
				var17 = var3 ? 91 : 1;
			} else {
				var17 = var3 ? 90 : 2;
			}

			if (-1 != var2.aq_fld) {
				io.ag(var17, ce.ak(var2.aq_fld) + var8, var4);
			} else {
				io.ag(var17, var8, var4);
			}
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void be(int var1) {
		this.as_fld.av(var1, false);
		this.aq();
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bu() {
		this.ay_fld = kj.pe(this.az_fld, -1152134214) * 1483486233;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V"
	)
	void bz(int var1, int var2, int var3, int var4, int var5) throws EOFException {
		for (int var6 = 0; var6 < this.ak_fld.size(); var6++) {
			((da)this.ak_fld.get(var6)).db(var1, var2, var3, var4, (byte)-46);
		}
	}

	@ObfuscatedName("vx")
	@ObfuscatedSignature(
		descriptor = "(Lcl;IIIIIIIS)V"
	)
	public static void vx(cl var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, short var8) {
		if (var0 == null) {
			var0.getClass();
		} else {
			for (int var9 = 0; var9 < var0.ak_fld.size(); var9++) {
				cv var10 = (cv)(cv)var0.ak_fld.get(var9);
				dx var11 = var10.eb((byte)38);
				int var12 = var0.az_fld.ag_fld * -621797759 - var11.ay_fld;
				int var13 = var0.az_fld.az_fld * 1479124089 - var11.as_fld;
				var10.cu_fld = 801314783 * (var1 + var12);
				var10.cj_fld = -366519347 * (var2 + var13);
				var10.ci_fld = var3 + var12;
				var10.ch_fld = -1314563731 * (var4 + var13);
				var10.ct_fld = var5;
				var10.cl_fld = var6;
				var10.dc_fld = var7;
				var10.dr_fld = 0;
				cv.ua(var10, var10.ci_fld, var10.ch_fld, (byte)4);
				var10.ac_fld = var0.az_fld.ak_fld;
			}
		}
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void co(int var1, int var2) {
		this.az_fld.au(this.ay_fld * -104994775, var1, var2);
		this.ag_fld = -1483486233;
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void cg() {
		for (int var1 = 0; var1 < this.ak_fld.size(); var1++) {
			((da)this.ak_fld.get(var1)).er(this.as_fld, 1550060260);
		}
	}
}
