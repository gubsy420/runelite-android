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
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -104994775
	)
	int ay_fld;
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
	@ObfuscatedName("qs")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	public static cv qs_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lxi;"
	)
	xi ah_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -481988227
	)
	int ag_fld;
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
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int at_fld;

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lcv;I)V"
	)
	void av(cv var1) {
		this.wx(var1);
		this.ak_fld.remove(var1);
	}

	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V"
	)
	void dc(int var1, int var2, int var3, int var4, int var5) throws EOFException {
		for (int var6 = 0; var6 < this.ak_fld.size(); var6++) {
			da.bm((da)this.ak_fld.get(var6), var1, 692533189 * client.dv_fld, var2, var3, var4, var5, -417197841);
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void ak(int var1) {
		this.az_fld.az_fld = var1;
	}

	@ObfuscatedName("rj")
	@ObfuscatedSignature(
		descriptor = "(Lws;)Lws;"
	)
	public static ws rj(ws var0) {
		return var0.ae_fld;
	}

	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void dv() {
		this.ak_fld.clear();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ILdx;B)Lcv;"
	)
	cv ah(int var1, dx var2) throws EOFException {
		cv var4 = new cv(var1);
		if (null != this.ah_fld) {
			var4.ag(this.ah_fld, (byte)44);
		}

		var4.bt_fld = 0;
		var4.er(this.as_fld, 670055497);
		var4.dd_fld[0] = this.ae_fld;
		var4.aq_fld = this.az_fld.az_fld;
		var4.bf_fld = var2.ag_fld;
		var4.aw_fld = this.aw_fld;
		da.yv(var4, -621797759 * this.az_fld.ak_fld - var2.as_fld, 1479124089 * this.az_fld.ag_fld - var2.ay_fld);
		return var4;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	@Override
	public boolean aw(int var1) {
		return -1 == this.ay_fld;
	}

	@ObfuscatedName("ip")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ip() {
		qs_fld = null;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	void as(int var1, int var2) {
		this.az_fld.au(this.ay_fld, var1, var2);
		this.ay_fld = -1483486233;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	@Override
	public int ar(int var1) {
		return -621797759 * this.az_fld.ak_fld;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	@Override
	public int af(byte var1) {
		return this.az_fld.ag_fld * 1479124089;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	@Override
	public int al(int var1) {
		return 1846813669 * this.az_fld.az_fld;
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Lcl;I)V"
	)
	public static void be(cl var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ay_fld = var0.az_fld.al();
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lgt;B)V"
	)
	void ax(gt var1, byte var2) throws EOFException {
		for (int var3 = 0; var3 < this.ak_fld.size(); var3++) {
			cv var4 = (cv)(cv)this.ak_fld.get(var3);
			dx var5 = da.lm(var4, (byte)-99);
			int var6 = -621797759 * this.az_fld.ak_fld - var5.as_fld;
			int var7 = this.az_fld.ag_fld * 1479124089 - var5.ay_fld;
			gt var8 = var1;
			short var9 = 1536;
			short var10 = 11776;
			if (var5.ag_fld == 0 && client.et_fld == this.ag_fld && dn.ed_fld == kc.ak_fld) {
				if (var2 == 0) {
					return;
				}

				if (var4.bi_fld < 1536 || var4.dm_fld < 1536 || var4.bi_fld >= 11776 || var4.dm_fld >= 11776) {
					var8 = gt.ak_fld;
				}
			}

			var4.aq_fld = -244182729 * this.az_fld.az_fld;
			if (var8 == gt.ak_fld) {
				if (var2 == 0) {
					return;
				}

				da.yv(var4, var6, var7);
			} else {
				var4.ac(var5, var6, var7, var8, (short)213);
			}
		}
	}

	@ObfuscatedName("jj")
	@ObfuscatedSignature(
		descriptor = "(Lhs;II)I"
	)
	public static int jj(hs var0, int var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.ag_fld[var1 + var2 * 64];
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lxi;B)V"
	)
	void an(xi var1) throws EOFException {
		this.ah_fld = var1;

		for (int var3 = 0; var3 < this.ak_fld.size(); var3++) {
			((cv)this.ak_fld.get(var3)).ag(this.ah_fld, (byte)-42);
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IIB)V"
	)
	void aa(int var1, int var2) throws EOFException {
		for (int var4 = 0; var4 < this.ak_fld.size(); var4++) {
			cg.cv((cv)this.ak_fld.get(var4), var1, var2, 678491441);
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(S)V"
	)
	void aq() {
		for (int var2 = 0; var2 < this.ak_fld.size(); var2++) {
			((da)this.ak_fld.get(var2)).er(this.as_fld, 216435503);
		}
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(Lwh;Lzm;I)V"
	)
	public static void bc(wh var0, zm var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ay_fld = var1;
		var0.as_fld = var2 * 2039383547;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIB)V"
	)
	void am(int var1, int var2) {
		this.as_fld.ae(var1, var2, -1106240719);
		this.aq();
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V"
	)
	void ad(String var1) {
		boolean var3 = var1.charAt(0) == '~';
		if (var3) {
			var1 = var1.substring(1);
		}

		aax var4 = null;

		for (int var5 = 0; var5 < this.ak_fld.size(); var5++) {
			cv var6 = (cv)(cv)this.ak_fld.get(var5);
			var6.cs_fld = false;
			var6.cu_fld = 0;
			var6.ck_fld = 0;
			var6.ci_fld = 1956667062;
			var6.cx_fld = var1;
			var6.st(-1);
			var4 = var6.az_fld;
		}

		if (null != var4) {
			if (var3 || this.ag_fld == client.dj_fld) {
				io.ag(2, var4.ak(-1561936447), var1);
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V"
	)
	void ao(int var1, int var2, int var3, int var4) throws EOFException {
		for (int var6 = 0; var6 < this.ak_fld.size(); var6++) {
			da.zn((da)this.ak_fld.get(var6), var1, var2, client.dv_fld, var3, var4, (byte)-47);
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

		var3.bt_fld = 0;
		var3.er(this.as_fld, 1703583875);
		var3.dd_fld[0] = this.ae_fld;
		var3.aq_fld = this.az_fld.az_fld;
		var3.bf_fld = var2.ag_fld;
		var3.aw_fld = this.aw_fld;
		da.yv(var3, -621797759 * this.az_fld.ak_fld - var2.as_fld, 1479124089 * this.az_fld.ag_fld - var2.ay_fld);
		return var3;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void at(int var1) {
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

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ILki;ZLjava/lang/String;[BB)V"
	)
	void ac(int var1, ki var2, boolean var3, String var4, byte[] var5, byte var6) {
		boolean var7 = false;
		String var8 = null;

		for (int var9 = 0; var9 < this.ak_fld.size(); var9++) {
			if (var6 == 2) {
				return;
			}

			cv var10 = (cv)(cv)this.ak_fld.get(var9);
			if (null != var10.az_fld && var10.av_fld != null) {
				boolean var11 = false;
				if (var2.ad_fld) {
					if (var6 == 2) {
						return;
					}

					if (bo.yz(la.fq_fld, var10.az_fld, -858441379)) {
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
						label159: {
							var7 = true;
							var8 = var10.az_fld.ak(-86787009);
							var10.cx_fld = var4.trim();
							var10.st(-1);
							var10.cu_fld = var1 >> 8;
							var10.ck_fld = var1 & 0xFF;
							var10.ci_fld = 1956667062;
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
							var10.do_fld = var13;
							var10.cs_fld = var3;
							if (var10.bq_fld != client.dj_fld && var2.ad_fld) {
								if (var6 == 2) {
									return;
								}

								if (!client.kn_fld.isEmpty() && var4.toLowerCase().indexOf(client.kn_fld) == -1) {
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

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(IIBBBBI)V"
	)
	void bd(int var1, int var2, byte var3, byte var4, byte var5, byte var6) {
		for (int var8 = 0; var8 < this.ak_fld.size(); var8++) {
			cv var9 = (cv)(cv)this.ak_fld.get(var8);
			var9.bs_fld = var1;
			var9.ct_fld = var2;
			fy.hv(var9.be_fld, var3, var4, var5, var6);
		}
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void br(int var1) throws EOFException {
		for (int var2 = 0; var2 < this.ak_fld.size(); var2++) {
			((da)this.ak_fld.get(var2)).du(var1, 1638546238);
		}
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(ILxj;)V"
	)
	void cn(int var1, xj var2) {
		bb.pt(this.as_fld, var1, var2, (byte)-59);
		this.aq();
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(Lcv;)V"
	)
	void bs(cv var1) {
		this.ak_fld.add(var1);
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void cd() {
		this.ip();
		this.ah_fld = null;
		this.ak_fld.clear();
	}

	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;)V"
	)
	void dk(String[] var1) {
		this.aw_fld = (String[])(String[])Arrays.copyOf(var1, var1.length);

		for (int var2 = 0; var2 < this.ak_fld.size(); var2++) {
			((cv)this.ak_fld.get(var2)).aw_fld = (String[])(String[])Arrays.copyOf(var1, var1.length);
		}
	}

	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void dq(int var1) {
		this.ay_fld = var1;
		this.as_fld.ak();
		this.av_fld = 0;
		this.ae_fld = gt.az_fld;
		this.ah_fld = null;
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(ILdx;)Lcv;"
	)
	cv bx(int var1, dx var2) throws EOFException {
		cv var3 = new cv(var1);
		if (null != this.ah_fld) {
			var3.ag(this.ah_fld, (byte)-50);
		}

		var3.bt_fld = 0;
		var3.er(this.as_fld, 533430814);
		var3.dd_fld[0] = this.ae_fld;
		var3.aq_fld = this.az_fld.az_fld;
		var3.bf_fld = var2.ag_fld;
		var3.aw_fld = this.aw_fld;
		da.yv(var3, -621797759 * this.az_fld.ak_fld - var2.as_fld, 1479124089 * this.az_fld.ag_fld - var2.ay_fld);
		return var3;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	public boolean bo() {
		return -1 == this.ay_fld;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bt() {
		this.ay_fld = this.az_fld.al();
	}

	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V"
	)
	void dh(int var1, int var2, int var3, int var4, int var5) throws EOFException {
		for (int var6 = 0; var6 < this.ak_fld.size(); var6++) {
			da.bm((da)this.ak_fld.get(var6), var1, client.dv_fld, var2, var3, var4, var5, -852972989);
		}
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bi() {
		this.ay_fld = this.az_fld.al();
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(Lgt;)V"
	)
	void cq(gt var1) throws EOFException {
		for (int var2 = 0; var2 < this.ak_fld.size(); var2++) {
			cv var3 = (cv)(cv)this.ak_fld.get(var2);
			dx var4 = da.lm(var3, (byte)-44);
			int var5 = -621797759 * this.az_fld.ak_fld - var4.as_fld;
			int var6 = this.az_fld.ag_fld * 1479124089 - var4.ay_fld;
			gt var7 = var1;
			short var8 = 1536;
			short var9 = 11776;
			if (var4.ag_fld == 0
				&& client.et_fld == this.ag_fld
				&& dn.ed_fld == kc.ak_fld
				&& (var3.bi_fld < 1536 || var3.dm_fld < 1536 || var3.bi_fld >= 11776 || var3.dm_fld >= 11776)) {
				var7 = gt.ak_fld;
			}

			var3.aq_fld = -244182729 * this.az_fld.az_fld;
			if (var7 == gt.ak_fld) {
				da.yv(var3, var5, var6);
			} else {
				var3.ac(var4, var5, var6, var7, (short)213);
			}
		}
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void bn(int var1, int var2) {
		this.az_fld.au(this.ay_fld, var1, var2);
		this.ay_fld = -1483486233;
	}

	@ObfuscatedName("wx")
	@ObfuscatedSignature(
		descriptor = "(Lcv;)V"
	)
	public void wx(cv var1) {
		og.ci_fld.getCallbacks().post(new PlayerDespawned(var1));
		if (qs_fld == var1) {
			qs_fld = null;
		}
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int bw() {
		return -621797759 * this.az_fld.ak_fld;
	}

	@ObfuscatedName("wo")
	@ObfuscatedSignature(
		descriptor = "(Lcl;II)V"
	)
	public static void wo(cl var0, int var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.az_fld.au(var0.ay_fld, var1, var2);
		var0.ay_fld = -1483486233;
	}

	@ObfuscatedName("ef")
	@ObfuscatedSignature(
		descriptor = "(Lcl;I)V"
	)
	public static void ef(cl var0, int var1) {
		var0.az_fld.az_fld = var1;
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int ba() {
		return this.az_fld.ag_fld * 1479124089;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int bq() {
		return -1758935977 * this.az_fld.az_fld;
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	public boolean bp() {
		return -1 == this.ay_fld;
	}

	@ObfuscatedName("yp")
	@ObfuscatedSignature(
		descriptor = "(Lcl;IB)V"
	)
	public static void yp(cl var0, int var1, byte var2) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ay_fld = var1;
		var0.as_fld.ak();
		var0.av_fld = 0;
		var0.ae_fld = gt.az_fld;
		var0.ah_fld = null;
	}

	@ObfuscatedName("ga")
	@ObfuscatedSignature(
		descriptor = "(Lcl;II)V"
	)
	public static void ga(cl var0, int var1) throws EOFException {
		if (var0 == null) {
			var0.getClass();
		} else {
			for (int var3 = 0; var3 < var0.ak_fld.size(); var3++) {
				((da)var0.ak_fld.get(var3)).du(var1, 1873159917);
			}
		}
	}

	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void dm(int var1) {
		this.az_fld.az_fld = var1;
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(ILxj;)V"
	)
	void ca(int var1, xj var2) {
		bb.pt(this.as_fld, var1, var2, (byte)-97);
		this.aq();
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(Lcl;)V"
	)
	public static void cv(cl var0) {
		if (var0 == null) {
			var0.getClass();
		}

		for (int var1 = 0; var1 < var0.ak_fld.size(); var1++) {
			((da)var0.ak_fld.get(var1)).er(var0.as_fld, 1550060260);
		}
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(Lgt;)V"
	)
	void cv(gt var1) throws EOFException {
		for (int var2 = 0; var2 < this.ak_fld.size(); var2++) {
			cv var3 = (cv)(cv)this.ak_fld.get(var2);
			dx var4 = da.lm(var3, (byte)115);
			int var5 = -621797759 * this.az_fld.ak_fld - var4.as_fld;
			int var6 = this.az_fld.ag_fld * -1003404960 - var4.ay_fld;
			gt var7 = var1;
			short var8 = 1536;
			int var9 = -444903547;
			if (-1643096714 * var4.ag_fld == 0
				&& client.et_fld == this.ag_fld
				&& dn.ed_fld == kc.ak_fld
				&& (var3.bi_fld < 1536 || var3.dm_fld < -623807804 || var3.bi_fld >= 11776 || var3.dm_fld >= 11776)) {
				var7 = gt.ak_fld;
			}

			var3.aq_fld = -244182729 * this.az_fld.az_fld;
			if (var7 == gt.ak_fld) {
				da.yv(var3, var5, var6);
			} else {
				var3.ac(var4, var5, var6, var7, (short)213);
			}
		}
	}

	cl(int var1) {
		this.ay_fld = 0;
		this.az_fld = new kj();
		this.aw_fld = new String[3];
		this.ag_fld = 1804644395;
		this.as_fld = new bb();
		this.ag_fld = var1;

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

	@ObfuscatedName("zc")
	@ObfuscatedSignature(
		descriptor = "(Lcl;IIIIII)V"
	)
	public static void zc(cl var0, int var1, int var2, int var3, int var4, int var5) throws EOFException {
		if (var0 == null) {
			var0.getClass();
		} else {
			for (int var7 = 0; var7 < var0.ak_fld.size(); var7++) {
				da.bm((da)var0.ak_fld.get(var7), var1, client.dv_fld, var2, var3, var4, var5, -380699964);
			}
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

		var3.bt_fld = 0;
		var3.er(this.as_fld, 1736161325);
		var3.dd_fld[0] = this.ae_fld;
		var3.aq_fld = this.az_fld.az_fld;
		var3.bf_fld = var2.ag_fld;
		var3.aw_fld = this.aw_fld;
		da.yv(var3, -621797759 * this.az_fld.ak_fld - var2.as_fld, 1479124089 * this.az_fld.ag_fld - var2.ay_fld);
		return var3;
	}

	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "(Lcl;[Ljava/lang/String;B)V"
	)
	public static void da(cl var0, String[] var1, byte var2) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.aw_fld = (String[])(String[])Arrays.copyOf(var1, var1.length);

			for (int var3 = 0; var3 < var0.ak_fld.size(); var3++) {
				((cv)var0.ak_fld.get(var3)).aw_fld = (String[])(String[])Arrays.copyOf(var1, var1.length);
			}
		}
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(Lcl;ILxj;I)V"
	)
	public static void cz(cl var0, int var1, xj var2) {
		if (var0 == null) {
			var0.getClass();
		} else {
			bb.pt(var0.as_fld, var1, var2, (byte)2);
			var0.aq();
		}
	}

	@ObfuscatedName("sb")
	@ObfuscatedSignature(
		descriptor = "(Lcv;)V"
	)
	public void sb(cv var1) {
		if (var1.getId() == client.dj_fld) {
			qs_fld = var1;
		}

		og.ci_fld.getCallbacks().postDeferred(new PlayerSpawned(var1));
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int bg() {
		return 1846813669 * this.az_fld.az_fld;
	}

	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void dz(int var1) {
		this.ay_fld = var1;
		this.as_fld.ak();
		this.av_fld = 0;
		this.ae_fld = gt.az_fld;
		this.ah_fld = null;
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

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void cb(int var1, int var2) {
		this.as_fld.ae(var1, var2, -1106240719);
		this.aq();
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void cz(int var1, int var2) {
		this.as_fld.ae(var1, var2, -1106240719);
		this.aq();
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void ck(int var1, int var2) {
		this.as_fld.ae(var1, var2, -1106240719);
		this.aq();
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void be(int var1) throws EOFException {
		for (int var2 = 0; var2 < this.ak_fld.size(); var2++) {
			((da)this.ak_fld.get(var2)).du(var1, 1846881960);
		}
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void co(int var1, int var2) {
		this.as_fld.ae(var1, var2, -1106240719);
		this.aq();
	}

	@ObfuscatedName("yb")
	@ObfuscatedSignature(
		descriptor = "(Lcl;II)V"
	)
	public static void yb(cl var0, int var1, int var2) throws EOFException {
		for (int var3 = 0; var3 < var0.ak_fld.size(); var3++) {
			cg.cv((cv)var0.ak_fld.get(var3), var1, var2, 227796704);
		}
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
			var5.cu_fld = 0;
			var5.ck_fld = 0;
			var5.ci_fld = 1956667062;
			var5.cx_fld = var1;
			var3 = var5.az_fld;
		}

		if (null != var3) {
			if (var2 || this.ag_fld == client.dj_fld) {
				io.ag(2, var3.ak(-1422814571), var1);
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
			var5.cu_fld = 0;
			var5.ck_fld = 0;
			var5.ci_fld = 1956667062;
			var5.cx_fld = var1;
			var3 = var5.az_fld;
		}

		if (null != var3) {
			if (var2 || this.ag_fld == client.dj_fld) {
				io.ag(2, var3.ak(-1327968431), var1);
			}
		}
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	void cl(int var1, int var2, int var3, int var4) throws EOFException {
		for (int var5 = 0; var5 < this.ak_fld.size(); var5++) {
			da.zn((da)this.ak_fld.get(var5), var1, var2, client.dv_fld, var3, var4, (byte)-7);
		}
	}

	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	void dw(int var1, int var2, int var3, int var4) throws EOFException {
		for (int var5 = 0; var5 < this.ak_fld.size(); var5++) {
			da.zn((da)this.ak_fld.get(var5), var1, var2, client.dv_fld, var3, var4, (byte)-103);
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
			var5.cu_fld = 0;
			var5.ck_fld = 0;
			var5.ci_fld = 539255547;
			var5.cx_fld = var1;
			var3 = var5.az_fld;
		}

		if (null != var3) {
			if (var2 || this.ag_fld == client.dj_fld) {
				io.ag(2, var3.ak(-1880509916), var1);
			}
		}
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bu() {
		this.ay_fld = this.az_fld.al();
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bv() {
		this.ay_fld = this.az_fld.al();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void ay(int var1) {
		this.as_fld.av(var1, false);
		this.aq();
	}

	@ObfuscatedName("oa")
	@ObfuscatedSignature(
		descriptor = "(Lcl;IB)V"
	)
	public static void oa(cl var0, int var1, byte var2) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.az_fld.az_fld = var1;
		}
	}

	@ObfuscatedName("zw")
	@ObfuscatedSignature(
		descriptor = "(Lcl;IIIIIIIS)V"
	)
	public static void zw(cl var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, short var8) {
		if (var0 == null) {
			var0.getClass();
		} else {
			for (int var9 = 0; var9 < var0.ak_fld.size(); var9++) {
				cv var10 = (cv)(cv)var0.ak_fld.get(var9);
				dx var11 = da.lm(var10, (byte)38);
				int var12 = var0.az_fld.ak_fld * -621797759 - var11.as_fld;
				int var13 = var0.az_fld.ag_fld * 1479124089 - var11.ay_fld;
				var10.by_fld = 801314783 * (var1 + var12);
				var10.dv_fld = -366519347 * (var2 + var13);
				var10.cv_fld = var3 + var12;
				var10.dh_fld = -1314563731 * (var4 + var13);
				var10.bv_fld = var5;
				var10.bb_fld = var6;
				var10.bu_fld = var7;
				var10.bg_fld = 0;
				var10.aj(var10.cv_fld, var10.dh_fld, (byte)4);
				var10.aq_fld = var0.az_fld.az_fld;
			}
		}
	}

	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void dt(int var1) {
		this.as_fld.av(var1, false);
		this.aq();
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
				if (var2.ad_fld && bo.yz(la.fq_fld, var9.az_fld, 294253849)) {
					var10 = true;
				}

				if (!var10 && 0 == client.de_fld && !var9.at_fld) {
					var6 = true;
					var7 = var9.az_fld.ak(-585211726);
					var9.cx_fld = var4.trim();
					var9.cu_fld = var1 >> 8;
					var9.ck_fld = var1 & 0xFF;
					var9.ci_fld = 1956667062;
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

					var9.do_fld = var12;
					var9.cs_fld = var3;
					var9.cp_fld = var9.bq_fld != client.dj_fld && var2.ad_fld && !client.kn_fld.isEmpty() && var4.toLowerCase().indexOf(client.kn_fld) == -1;
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

	@ObfuscatedName("gy")
	@ObfuscatedSignature(
		descriptor = "(Lcl;IIIII)V"
	)
	public static void gy(cl var0, int var1, int var2, int var3, int var4) throws EOFException {
		if (var0 == null) {
			var0.getClass();
		} else {
			for (int var6 = 0; var6 < var0.ak_fld.size(); var6++) {
				((da)var0.ak_fld.get(var6)).db(var1, var2, var3, var4, (byte)-46);
			}
		}
	}

	@ObfuscatedName("wp")
	@ObfuscatedSignature(
		descriptor = "(Lcl;[Ljava/lang/String;)V"
	)
	public static void wp(cl var0, String[] var1) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.aw_fld = (String[])(String[])Arrays.copyOf(var1, var1.length);

			for (int var2 = 0; var2 < var0.ak_fld.size(); var2++) {
				((cv)var0.ak_fld.get(var2)).aw_fld = (String[])(String[])Arrays.copyOf(var1, var1.length);
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
				if (var2.ad_fld && bo.yz(la.fq_fld, var9.az_fld, -1885502640)) {
					var10 = true;
				}

				if (!var10 && 0 == client.de_fld && !var9.at_fld) {
					var6 = true;
					var7 = var9.az_fld.ak(-152996570);
					var9.cx_fld = var4.trim();
					var9.cu_fld = var1 >> 8;
					var9.ck_fld = var1 & 0xFF;
					var9.ci_fld = 1956667062;
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

					var9.do_fld = var12;
					var9.cs_fld = var3;
					var9.cp_fld = var9.bq_fld != client.dj_fld && var2.ad_fld && !client.kn_fld.isEmpty() && var4.toLowerCase().indexOf(client.kn_fld) == -1;
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

	@ObfuscatedName("wg")
	@ObfuscatedSignature(
		descriptor = "(Lcs;[Ljava/lang/String;)V"
	)
	public static void wg(cs var0, String[] var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.aa_fld = var1;
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
				if (var2.ad_fld && bo.yz(la.fq_fld, var9.az_fld, -573155897)) {
					var10 = true;
				}

				if (!var10 && 0 == client.de_fld && !var9.at_fld) {
					var6 = true;
					var7 = var9.az_fld.ak(496209127);
					var9.cx_fld = var4.trim();
					var9.cu_fld = var1 >> 8;
					var9.ck_fld = var1 & 124155835;
					var9.ci_fld = 1956667062;
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

					var9.do_fld = var12;
					var9.cs_fld = var3;
					var9.cp_fld = var9.bq_fld != client.dj_fld && var2.ad_fld && !client.kn_fld.isEmpty() && var4.toLowerCase().indexOf(client.kn_fld) == -1;
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
			dx var10 = da.lm(var9, (byte)-11);
			int var11 = this.az_fld.ak_fld * -621797759 - var10.as_fld;
			int var12 = this.az_fld.ag_fld * 1479124089 - var10.ay_fld;
			var9.by_fld = 801314783 * (var1 + var11);
			var9.dv_fld = -366519347 * (var2 + var12);
			var9.cv_fld = var3 + var11;
			var9.dh_fld = -1314563731 * (var4 + var12);
			var9.bv_fld = var5;
			var9.bb_fld = var6;
			var9.bu_fld = var7;
			var9.bg_fld = 0;
			var9.aj(var9.cv_fld, var9.dh_fld, (byte)89);
			var9.aq_fld = this.az_fld.az_fld;
		}
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void ce(int var1, int var2) throws EOFException {
		for (int var3 = 0; var3 < this.ak_fld.size(); var3++) {
			cg.cv((cv)this.ak_fld.get(var3), var1, var2, -640916202);
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

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void cc(int var1) throws EOFException {
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
			var8.bs_fld = var1;
			var8.ct_fld = var2;
			fy.hv(var8.be_fld, var3, var4, var5, var6);
		}
	}

	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	void dy(int var1, int var2, int var3, int var4) throws EOFException {
		for (int var5 = 0; var5 < this.ak_fld.size(); var5++) {
			((da)this.ak_fld.get(var5)).db(var1, var2, var3, var4, (byte)-31);
		}
	}

	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	void dg(int var1, int var2, int var3, int var4) throws EOFException {
		for (int var5 = 0; var5 < this.ak_fld.size(); var5++) {
			((da)this.ak_fld.get(var5)).db(var1, var2, var3, var4, (byte)-22);
		}
	}

	@ObfuscatedName("qk")
	@ObfuscatedSignature(
		descriptor = "(Lcl;Ljava/lang/String;)V"
	)
	public static void qk(cl var0, String var1) {
		if (var0 == null) {
			var0.getClass();
		}

		boolean var2 = var1.charAt(0) == 1334327232;
		if (var2) {
			var1 = var1.substring(1);
		}

		aax var3 = null;

		for (int var4 = 0; var4 < var0.ak_fld.size(); var4++) {
			cv var5 = (cv)(cv)var0.ak_fld.get(var4);
			var5.cs_fld = false;
			var5.cu_fld = 0;
			var5.ck_fld = 0;
			var5.ci_fld = 1956667062;
			var5.cx_fld = var1;
			var3 = var5.az_fld;
		}

		if (null != var3) {
			if (var2 || var0.ag_fld == client.dj_fld) {
				io.ag(2, var3.ak(-792251276), var1);
			}
		}
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	void ct(int var1, int var2, int var3, int var4) throws EOFException {
		for (int var5 = 0; var5 < this.ak_fld.size(); var5++) {
			((da)this.ak_fld.get(var5)).db(var1, var2, var3, var4, (byte)-113);
		}
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(ILba;ZB)I"
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
			if (la.fq_fld.aw() && var49 >= 0 && var49 < la.fq_fld.ae_fld.bl(-1440239599)) {
				rp var52 = (rp)la.fq_fld.ae_fld.bw(var49, -1997707233);
				bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var52.at((byte)1);
				bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = rl.dx(var52, (byte)1);
			} else {
				bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
				bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
			}

			return 1;
		} else if (var0 == 3602) {
			int var48 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			if (la.fq_fld.aw() && var48 >= 0 && var48 < la.fq_fld.ae_fld.bl(-1440239599)) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = ((rr)la.fq_fld.ae_fld.bw(var48, -1346523368)).ae_fld * 1107825689;
			} else {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
			}

			return 1;
		} else if (3603 == var0) {
			int var47 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			if (la.fq_fld.aw() && var47 >= 0 && var47 < la.fq_fld.ae_fld.bl(-1440239599)) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = ((rr)la.fq_fld.ae_fld.bw(var47, -1831026001)).aw_fld * 964405635;
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
			la.fq_fld.ax(var45);
			return 1;
		} else if (var0 == 3606) {
			String var44 = (String)bp.ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			la.fq_fld.aq(var44);
			return 1;
		} else if (3607 == var0) {
			String var43 = (String)bp.ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			la.fq_fld.aa(var43);
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
				bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = jr.fa_fld.av_fld;
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
				bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = jr.fa_fld.bw(var39, -1949538396).ap(-1939318074).ak(-338884353);
			} else {
				bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
			}

			return 1;
		} else if (3614 == var0) {
			int var38 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			if (jr.fa_fld != null && var38 < jr.fa_fld.bl(-1440239599)) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = ((rr)jr.fa_fld.bw(var38, -2043595688)).by(-37589207);
			} else {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
			}

			return 1;
		} else if (var0 == 3615) {
			int var37 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			if (jr.fa_fld != null && var37 < jr.fa_fld.bl(-1440239599)) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = ((rr)jr.fa_fld.bw(var37, -1842033576)).aw_fld * 964405635;
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
			if (!la.fq_fld.aw()) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -1;
			} else {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = la.fq_fld.ah_fld.bl(-1440239599);
			}

			return 1;
		} else if (var0 == 3622) {
			int var34 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			if (la.fq_fld.aw() && var34 >= 0 && var34 < la.fq_fld.ah_fld.bl(-1440239599)) {
				rt var5 = (rt)la.fq_fld.ah_fld.bw(var34, -1467258561);
				bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var5.at((byte)1);
				bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = rl.dx(var5, (byte)1);
			} else {
				bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
				bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
			}

			return 1;
		} else if (var0 == 3623) {
			String var32 = (String)bp.ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			var32 = cr.hs(var32);
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = bo.yz(la.fq_fld, new aax(var32, fr.gv_fld), -1710083607) ? 1 : 0;
			return 1;
		} else if (3624 == var0) {
			int var31 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			if (jr.fa_fld != null && var31 < jr.fa_fld.bl(-1440239599) && jr.fa_fld.bw(var31, -1380363310).ap(-1939318074).equals(og.ci_fld.jn((byte)-126))) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 1;
			} else {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
			}

			return 1;
		} else if (3625 == var0) {
			if (null != jr.fa_fld && null != jr.fa_fld.ae_fld) {
				bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = jr.fa_fld.ae_fld;
			} else {
				bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
			}

			return 1;
		} else if (3626 == var0) {
			int var30 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			if (jr.fa_fld != null && var30 < jr.fa_fld.bl(-1440239599) && ((rh)jr.fa_fld.bw(var30, -1796982216)).ag((short)31156)) {
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
			if (null != jr.fa_fld && var4 < jr.fa_fld.bl(-1440239599) && ((rh)jr.fa_fld.bw(var4, -1763726726)).ah((byte)118)) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 1;
			} else {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
			}

			return 1;
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V"
	)
	static void ad(String var0, String var1, String var2) {
		bn.ci_fld = var0;
		bn.cj_fld = var1;
		bn.ch_fld = var2;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lcv;I)V"
	)
	void az(cv var1, int var2) {
		this.sb(var1);
		this.ak_fld.add(var1);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void ae(int var1) {
		this.az_fld.ak_fld = 615342573 * var1;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IB)V"
	)
	void au(int var1, byte var2) {
		this.az_fld.ag_fld = 615342573 * var1;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(ILxj;I)V"
	)
	void ai(int var1, xj var2, int var3) {
		bb.pt(this.as_fld, var1, var2, (byte)2);
		this.aq();
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void ap(int var1, int var2) throws EOFException {
		for (int var3 = 0; var3 < this.ak_fld.size(); var3++) {
			((da)this.ak_fld.get(var3)).du(var1, 1873159917);
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIS)V"
	)
	void aj(int var1, int var2, int var3, int var4, int var5, int var6, int var7, short var8) {
		for (int var9 = 0; var9 < this.ak_fld.size(); var9++) {
			cv var10 = (cv)(cv)this.ak_fld.get(var9);
			dx var11 = da.lm(var10, (byte)38);
			int var12 = this.az_fld.ak_fld * -621797759 - var11.as_fld;
			int var13 = this.az_fld.ag_fld * 1479124089 - var11.ay_fld;
			var10.bv_fld = 801314783 * (var1 + var12);
			var10.ck_fld = -366519347 * (var2 + var13);
			var10.ba_fld = (var3 + var12) * -725275729;
			var10.bt_fld = -1314563731 * (var4 + var13);
			var10.cl_fld = -287255445 * var5;
			var10.cr_fld = var6 * -139656625;
			var10.bb_fld = -2077547763 * var7;
			var10.bw_fld = 0;
			var10.aj(-1528231089 * var10.cn_fld, -143157147 * var10.bw_fld, (byte)4);
			var10.ay_fld = this.az_fld.ak_fld * -244182729;
		}
	}

	@ObfuscatedName("mv")
	@ObfuscatedSignature(
		descriptor = "(Lcl;Lcv;I)V"
	)
	public static void mv(cl var0, cv var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.sb(var1);
			var0.ak_fld.add(var1);
		}
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;B)V"
	)
	void bm(String[] var1, byte var2) {
		this.aw_fld = (String[])(String[])Arrays.copyOf(var1, var1.length);

		for (int var3 = 0; var3 < this.ak_fld.size(); var3++) {
			((cv)this.ak_fld.get(var3)).aw_fld = (String[])(String[])Arrays.copyOf(var1, var1.length);
		}
	}

	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "(IIBBBB)V"
	)
	void db(int var1, int var2, byte var3, byte var4, byte var5, byte var6) {
		for (int var7 = 0; var7 < this.ak_fld.size(); var7++) {
			cv var8 = (cv)(cv)this.ak_fld.get(var7);
			var8.bt_fld = 1547875309 * var1;
			var8.cl_fld = 63892773 * var2;
			fy.hv(var8.be_fld, var3, var4, var5, var6);
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IB)V"
	)
	void ag(int var1, byte var2) {
		this.ay_fld = var1;
		this.as_fld.ak();
		this.av_fld = 0;
		this.ae_fld = gt.ak_fld;
		this.ah_fld = null;
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

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V"
	)
	void ab(int var1, int var2, int var3, int var4, int var5, int var6) throws EOFException {
		for (int var7 = 0; var7 < this.ak_fld.size(); var7++) {
			da.bm((da)this.ak_fld.get(var7), var1, client.zi_int, var2, var3, var4, var5, -380699964);
		}
	}
}
