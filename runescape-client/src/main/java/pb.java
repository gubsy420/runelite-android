import java.io.EOFException;
import java.util.ArrayList;
import java.util.HashMap;
import javax.annotation.Nullable;
import net.runelite.api.EntityOps;
import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("pb")
@Implements({"EntityOps"})
public class pb implements oq, EntityOps {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/ArrayList;"
	)
	ArrayList ak_fld = new ArrayList();
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/ArrayList;"
	)
	ArrayList az_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/ArrayList;"
	)
	ArrayList ag_fld = new ArrayList();
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/ArrayList;"
	)
	ArrayList av_fld;

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lxi;IIIIIIB)Z"
	)
	boolean am(xi var1, int var2, int var3, int var4, int var5, int var6, int var7, byte var8) {
		if (var2 >= var3 && var2 <= var4) {
			int var18 = var2 - var3;
			String var21 = xi.at(var1, 543054744);
			if (!var21.equalsIgnoreCase(kh.ao_fld)) {
				this.ad(var18, var21, -1329719508);
			}

			return true;
		} else if (var5 == var2) {
			int var17 = var1.cg();
			int var20 = var1.cg();
			String var23 = xi.at(var1, -831716130);
			this.ao(var17, var20, var23, -135671303);
			return true;
		} else if (var2 == var6) {
			int var16 = var1.cg();
			int var19 = var1.cm();
			int var22 = var1.cm();
			int var24 = var1.co((byte)-119);
			int var25 = var1.co((byte)-61);
			String var26 = xi.at(var1, -1631546972);
			this.ab(var16, var19, var22, var24, var25, var26, 1742313590);
			return true;
		} else if (var7 == var2) {
			int var9 = var1.cg();
			int var10 = var1.cm();
			int var11 = var1.cm();
			int var12 = var1.cm();
			int var13 = var1.co((byte)-123);
			int var14 = var1.co((byte)-124);
			String var15 = xi.at(var1, -1052120277);
			this.ap(var9, var10, var11, var12, var13, var14, var15, -1840143763);
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V"
	)
	void ad(int var1, String var2, int var3) {
		if (var1 >= 0) {
			for (int var4 = this.ak_fld.size(); var4 <= var1; var4++) {
				this.ak_fld.add(null);
			}

			this.ak_fld.set(var1, new oj(this, var2));
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;I)V"
	)
	void ao(int var1, int var2, String var3, int var4) {
		for (int var5 = this.ag_fld.size(); var5 <= var1; var5++) {
			this.ag_fld.add(new ArrayList());
		}

		ArrayList var6 = (ArrayList)(ArrayList)this.ag_fld.get(var1);
		var6.add(new pm(this, var3, var2));
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIIIILjava/lang/String;I)V"
	)
	void ab(int var1, int var2, int var3, int var4, int var5, String var6, int var7) {
		for (int var8 = this.az_fld.size(); var8 <= var1; var8++) {
			this.az_fld.add(new ArrayList());
		}

		ArrayList var9 = (ArrayList)(ArrayList)this.az_fld.get(var1);
		var9.add(new ob(this, var6, var2, var3, var4, var5));
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIIIIILjava/lang/String;I)V"
	)
	void ap(int var1, int var2, int var3, int var4, int var5, int var6, String var7, int var8) {
		for (int var9 = this.av_fld.size(); var9 <= var1; var9++) {
			this.av_fld.add(null);
		}

		HashMap var11 = (HashMap)(HashMap)this.av_fld.get(var1);
		if (var11 == null) {
			var11 = new HashMap();
			this.av_fld.set(var1, var11);
		}

		if (!var11.containsKey(var2)) {
			var11.put(var2, new ArrayList());
		}

		ArrayList var10 = (ArrayList)(ArrayList)var11.get(var2);
		var10.add(new ps(this, var7, var2, var3, var4, var5, var6));
	}

	@ObfuscatedName("getNumSubOps")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	@Export("getNumSubOps")
	@Override
	public int getNumSubOps(int var1) {
		return this.az(var1, (byte)87);
	}

	@ObfuscatedName("ut")
	@ObfuscatedSignature(
		descriptor = "(Lpb;)V"
	)
	public static void ut(pb var0) {
		var0.ak_fld.clear();
		var0.ag_fld.clear();
		var0.az_fld.clear();
		var0.av_fld.clear();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void at(int var1) {
		this.ak_fld.clear();
		this.ag_fld.clear();
		this.az_fld.clear();
		this.av_fld.clear();
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	@Override
	public boolean ak(int var1) {
		for (int var2 = 0; var2 < this.ak_fld.size(); var2++) {
			if (this.ak_fld.get(var2) != null && ((oj)this.ak_fld.get(var2)).ae_fld != null) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I[IB)I"
	)
	int aj(int var1, int[] var2, byte var3) {
		try {
			if (null != var2 && var1 < this.az_fld.size()) {
				ArrayList var4 = (ArrayList)(ArrayList)this.az_fld.get(var1);
				if (var4 != null) {
					for (int var5 = 0; var5 < var4.size(); var5++) {
						ob var6 = (ob)(ob)var4.get(var5);
						int var7;
						if (65535 != var6.ag_fld) {
							var7 = jv(this, var6.ag_fld, var2);
						} else {
							var7 = var2[var6.ak_fld];
						}

						if (var7 >= var6.az_fld && var7 <= var6.av_fld) {
							return var5;
						}
					}
				}

				return -1;
			} else {
				return -1;
			}
		} catch (Throwable var8) {
			throw new RuntimeException(var8);
		}
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(II[II)I"
	)
	int bm(int var1, int var2, int[] var3, int var4) {
		try {
			if (null != var3 && var1 < this.av_fld.size()) {
				HashMap var5 = (HashMap)(HashMap)this.av_fld.get(var1);
				if (null != var5 && var5.containsKey(var2)) {
					ArrayList var6 = (ArrayList)(ArrayList)var5.get(var2);

					for (int var7 = 0; var7 < var6.size(); var7++) {
						ps var8 = (ps)(ps)var6.get(var7);
						int var9;
						if (65535 != var8.ag_fld) {
							var9 = jv(this, var8.ag_fld, var3);
						} else {
							var9 = var3[var8.ak_fld];
						}

						if (var9 >= var8.az_fld && var9 <= var8.av_fld) {
							return var7;
						}
					}
				}

				return -1;
			} else {
				return -1;
			}
		} catch (Throwable var10) {
			throw new RuntimeException(var10);
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	@Override
	public int af(int var1) {
		return var1 >= this.ag_fld.size() ? 0 : ((ArrayList)this.ag_fld.get(var1)).size();
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IB)I"
	)
	@Override
	public int az(int var1, byte var2) {
		return var1 >= this.ag_fld.size() ? 0 : ((ArrayList)this.ag_fld.get(var1)).size();
	}

	pb() {
		this.az_fld = new ArrayList();
		this.av_fld = new ArrayList();
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(Lxi;IIIIII)Z"
	)
	boolean bs(xi var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (var2 >= var3 && var2 <= var4) {
			int var17 = var2 - var3;
			String var20 = xi.at(var1, -1229060303);
			if (!var20.equalsIgnoreCase(kh.ao_fld)) {
				this.ad(var17, var20, 1698357652);
			}

			return true;
		} else if (var5 == var2) {
			int var16 = var1.cg();
			int var19 = var1.cg();
			String var22 = xi.at(var1, 969267911);
			this.ao(var16, var19, var22, -135671303);
			return true;
		} else if (var2 == var6) {
			int var15 = var1.cg();
			int var18 = var1.cm();
			int var21 = var1.cm();
			int var23 = var1.co((byte)-57);
			int var24 = var1.co((byte)-1);
			String var25 = xi.at(var1, 1020608627);
			this.ab(var15, var18, var21, var23, var24, var25, 1742313590);
			return true;
		} else if (var7 == var2) {
			int var8 = var1.cg();
			int var9 = var1.cm();
			int var10 = var1.cm();
			int var11 = var1.cm();
			int var12 = var1.co((byte)-118);
			int var13 = var1.co((byte)-82);
			String var14 = xi.at(var1, 897381334);
			this.ap(var8, var9, var10, var11, var12, var13, var14, -1503605015);
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(III)I"
	)
	@Override
	public int av(int var1, int var2, int var3) {
		if (var1 >= this.ag_fld.size()) {
			return -1;
		} else {
			ArrayList var4 = (ArrayList)(ArrayList)this.ag_fld.get(var1);
			return var4 != null && var2 < var4.size() ? ((pm)var4.get(var2)).ak_fld * -811848167 : -1;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	public boolean aw() {
		for (int var1 = 0; var1 < this.ak_fld.size(); var1++) {
			if (this.ak_fld.get(var1) != null && ((oj)this.ak_fld.get(var1)).ae_fld != null) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(Lxi;IIIIII)Z"
	)
	boolean bh(xi var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (var2 >= var3 && var2 <= var4) {
			int var17 = var2 - var3;
			String var20 = xi.at(var1, -1718689322);
			if (!var20.equalsIgnoreCase(kh.ao_fld)) {
				this.ad(var17, var20, 975315207);
			}

			return true;
		} else if (var5 == var2) {
			int var16 = var1.cg();
			int var19 = var1.cg();
			String var22 = xi.at(var1, -900402812);
			this.ao(var16, var19, var22, -135671303);
			return true;
		} else if (var2 == var6) {
			int var15 = var1.cg();
			int var18 = var1.cm();
			int var21 = var1.cm();
			int var23 = var1.co((byte)-27);
			int var24 = var1.co((byte)-121);
			String var25 = xi.at(var1, -1315809579);
			this.ab(var15, var18, var21, var23, var24, var25, 1742313590);
			return true;
		} else if (var7 == var2) {
			int var8 = var1.cg();
			int var9 = var1.cm();
			int var10 = var1.cm();
			int var11 = var1.cm();
			int var12 = var1.co((byte)-99);
			int var13 = var1.co((byte)-20);
			String var14 = xi.at(var1, -210127537);
			this.ap(var8, var9, var10, var11, var12, var13, var14, -1500566783);
			return true;
		} else {
			return false;
		}
	}

	@Nullable
	@ObfuscatedName("mu")
	@ObfuscatedSignature(
		descriptor = "(II[I)Ljava/lang/String;"
	)
	public String mu(int var1, int var2, int[] var3) {
		try {
			return this.ah(var1, var2, var3, (byte)-52);
		} catch (Throwable var5) {
			throw new RuntimeException(var5);
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	@Override
	public boolean as(int var1) {
		try {
			return vf(this, var1, 0, null);
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	@Override
	public boolean ar(int var1) {
		try {
			return vf(this, var1, 0, null);
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("oj")
	@ObfuscatedSignature(
		descriptor = "(Lpb;IIIIILjava/lang/String;)V"
	)
	public static void oj(pb var0, int var1, int var2, int var3, int var4, int var5, String var6) {
		for (int var7 = var0.az_fld.size(); var7 <= var1; var7++) {
			var0.az_fld.add(new ArrayList());
		}

		ArrayList var8 = (ArrayList)(ArrayList)var0.az_fld.get(var1);
		var8.add(new ob(var0, var6, var2, var3, var4, var5));
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(III[I)Ljava/lang/String;"
	)
	String cx(int var1, int var2, int var3, int[] var4) {
		try {
			if (var1 >= this.ak_fld.size()) {
				return null;
			} else {
				int var5 = this.bm(var1, var3, var4, 1837281210);
				return -1 != var5
					? ((oj)((ArrayList)((HashMap)this.av_fld.get(var1)).get(var3)).get(var5)).ae_fld
					: ((oj)((ArrayList)this.ag_fld.get(var1)).get(var2)).ae_fld;
			}
		} catch (Throwable var7) {
			throw new RuntimeException(var7);
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	@Override
	public int ax(int var1, int var2) {
		if (var1 >= this.ag_fld.size()) {
			return -1;
		} else {
			ArrayList var3 = (ArrayList)(ArrayList)this.ag_fld.get(var1);
			return var3 != null && var2 < var3.size() ? ((pm)var3.get(var2)).ak_fld * -811848167 : -1;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I[I)Ljava/lang/String;"
	)
	@Override
	public String an(int var1, int[] var2) {
		try {
			if (var1 >= 0 && var1 < this.ak_fld.size()) {
				oj var3 = (oj)(oj)this.ak_fld.get(var1);
				if (null == var3) {
					return null;
				} else {
					if (null != var2 && var1 < this.az_fld.size()) {
						int var4 = this.aj(var1, var2, (byte)80);
						if (var4 >= 0) {
							ArrayList var5 = (ArrayList)(ArrayList)this.az_fld.get(var1);
							ob var6 = (ob)(ob)var5.get(var4);
							return var6.ae_fld;
						}
					}

					return var3.ae_fld;
				}
			} else {
				return null;
			}
		} catch (Throwable var8) {
			throw new RuntimeException(var8);
		}
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	int cq(int var1, int var2) {
		if (var1 >= this.ag_fld.size()) {
			return -1;
		} else {
			ArrayList var3 = (ArrayList)(ArrayList)this.ag_fld.get(var1);

			for (int var4 = 0; var4 < var3.size(); var4++) {
				pm var5 = (pm)(pm)var3.get(var4);
				if (var5.ak_fld == var2) {
					return var4;
				}
			}

			return -1;
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II[I)Ljava/lang/String;"
	)
	@Override
	public String aq(int var1, int var2, int[] var3) {
		try {
			if (var1 >= this.ak_fld.size()) {
				return null;
			} else {
				int var4 = this.av(var1, var2, -1855239084);
				return -1 == var4 ? null : pk(this, var1, var2, var4, var3);
			}
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II[I)Ljava/lang/String;"
	)
	@Override
	public String aa(int var1, int var2, int[] var3) {
		try {
			if (var1 >= this.ak_fld.size()) {
				return null;
			} else {
				int var4 = this.av(var1, var2, -2012591969);
				return -1 == var4 ? null : pk(this, var1, var2, var4, var3);
			}
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	int cv(int var1, int var2) {
		if (var1 >= this.ag_fld.size()) {
			return -1;
		} else {
			ArrayList var3 = (ArrayList)(ArrayList)this.ag_fld.get(var1);

			for (int var4 = 0; var4 < var3.size(); var4++) {
				pm var5 = (pm)(pm)var3.get(var4);
				if (var5.ak_fld == var2) {
					return var4;
				}
			}

			return -1;
		}
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(Lxi;IIIIII)Z"
	)
	boolean bk(xi var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (var2 >= var3 && var2 <= var4) {
			int var17 = var2 - var3;
			String var20 = xi.at(var1, 1420563912);
			if (!var20.equalsIgnoreCase(kh.ao_fld)) {
				this.ad(var17, var20, -514084224);
			}

			return true;
		} else if (var5 == var2) {
			int var16 = var1.cg();
			int var19 = var1.cg();
			String var22 = xi.at(var1, 127219548);
			this.ao(var16, var19, var22, -135671303);
			return true;
		} else if (var2 == var6) {
			int var15 = var1.cg();
			int var18 = var1.cm();
			int var21 = var1.cm();
			int var23 = var1.co((byte)-89);
			int var24 = var1.co((byte)2);
			String var25 = xi.at(var1, 1210208437);
			this.ab(var15, var18, var21, var23, var24, var25, 1742313590);
			return true;
		} else if (var7 == var2) {
			int var8 = var1.cg();
			int var9 = var1.cm();
			int var10 = var1.cm();
			int var11 = var1.cm();
			int var12 = var1.co((byte)-15);
			int var13 = var1.co((byte)-83);
			String var14 = xi.at(var1, -764138555);
			this.ap(var8, var9, var10, var11, var12, var13, var14, -1395153209);
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;)V"
	)
	void bj(int var1, String var2) {
		if (var1 >= 0) {
			for (int var3 = this.ak_fld.size(); var3 <= var1; var3++) {
				this.ak_fld.add(null);
			}

			this.ak_fld.set(var1, new oj(this, var2));
		}
	}

	@ObfuscatedName("ro")
	@ObfuscatedSignature(
		descriptor = "(Lpb;IILjava/lang/String;)V"
	)
	public static void ro(pb var0, int var1, int var2, String var3) {
		for (int var4 = var0.ag_fld.size(); var4 <= var1; var4++) {
			var0.ag_fld.add(new ArrayList());
		}

		ArrayList var5 = (ArrayList)(ArrayList)var0.ag_fld.get(var1);
		var5.add(new pm(var0, var3, var2));
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	public boolean ay() {
		for (int var1 = 0; var1 < this.ak_fld.size(); var1++) {
			if (this.ak_fld.get(var1) != null && ((oj)this.ak_fld.get(var1)).ae_fld != null) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("getSubID")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	@Export("getSubID")
	@Override
	public int getSubID(int var1, int var2) {
		return this.av(var1, var2, -2075647873);
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(IIIIILjava/lang/String;)V"
	)
	void by(int var1, int var2, int var3, int var4, int var5, String var6) {
		for (int var7 = this.az_fld.size(); var7 <= var1; var7++) {
			this.az_fld.add(new ArrayList());
		}

		ArrayList var8 = (ArrayList)(ArrayList)this.az_fld.get(var1);
		var8.add(new ob(this, var6, var2, var3, var4, var5));
	}

	@ObfuscatedName("gh")
	@ObfuscatedSignature(
		descriptor = "(Lpb;IIIIIILjava/lang/String;)V"
	)
	public static void gh(pb var0, int var1, int var2, int var3, int var4, int var5, int var6, String var7) {
		if (var0 == null) {
			var0.getClass();
		}

		for (int var8 = var0.av_fld.size(); var8 <= var1; var8++) {
			var0.av_fld.add(null);
		}

		HashMap var10 = (HashMap)(HashMap)var0.av_fld.get(var1);
		if (var10 == null) {
			var10 = new HashMap();
			var0.av_fld.set(var1, var10);
		}

		if (!var10.containsKey(var2)) {
			var10.put(var2, new ArrayList());
		}

		ArrayList var9 = (ArrayList)(ArrayList)var10.get(var2);
		var9.add(new ps(var0, var7, var2, var3, var4, var5, var6));
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(IIIIILjava/lang/String;)V"
	)
	void bl(int var1, int var2, int var3, int var4, int var5, String var6) {
		for (int var7 = this.az_fld.size(); var7 <= var1; var7++) {
			this.az_fld.add(new ArrayList());
		}

		ArrayList var8 = (ArrayList)(ArrayList)this.az_fld.get(var1);
		var8.add(new ob(this, var6, var2, var3, var4, var5));
	}

	@ObfuscatedName("pk")
	@ObfuscatedSignature(
		descriptor = "(Lpb;III[II)Ljava/lang/String;"
	)
	public static String pk(pb var0, int var1, int var2, int var3, int[] var4) throws EOFException {
		try {
			if (var0 == null) {
				throw new NullPointerException();
			} else if (var1 >= var0.ak_fld.size()) {
				return null;
			} else {
				int var6 = var0.bm(var1, var3, var4, 1837281210);
				return -1 != var6
					? ((oj)((ArrayList)((HashMap)var0.av_fld.get(var1)).get(var3)).get(var6)).ae_fld
					: ((oj)((ArrayList)var0.ag_fld.get(var1)).get(var2)).ae_fld;
			}
		} catch (Throwable var7) {
			throw new RuntimeException(var7);
		}
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(III)I"
	)
	int bz(int var1, int var2, int var3) {
		if (var1 >= this.ag_fld.size()) {
			return -1;
		} else {
			ArrayList var4 = (ArrayList)(ArrayList)this.ag_fld.get(var1);

			for (int var5 = 0; var5 < var4.size(); var5++) {
				pm var6 = (pm)(pm)var4.get(var5);
				if (var6.ak_fld == var2) {
					return var5;
				}
			}

			return -1;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	public static void ak() {
		nn.ak_fld.av();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	@Override
	public boolean ag(int var1, int var2) {
		try {
			return vf(this, var1, 0, null);
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(IIIIIILjava/lang/String;)V"
	)
	void bi(int var1, int var2, int var3, int var4, int var5, int var6, String var7) {
		for (int var8 = this.av_fld.size(); var8 <= var1; var8++) {
			this.av_fld.add(null);
		}

		HashMap var10 = (HashMap)(HashMap)this.av_fld.get(var1);
		if (var10 == null) {
			var10 = new HashMap();
			this.av_fld.set(var1, var10);
		}

		if (!var10.containsKey(var2)) {
			var10.put(var2, new ArrayList());
		}

		ArrayList var9 = (ArrayList)(ArrayList)var10.get(var2);
		var9.add(new ps(this, var7, var2, var3, var4, var5, var6));
	}

	@ObfuscatedName("po")
	@ObfuscatedSignature(
		descriptor = "(Lpb;I[I)I"
	)
	public static int po(pb var0, int var1, int[] var2) throws EOFException {
		try {
			if (var0 == null) {
				throw new NullPointerException();
			} else {
				ph var3 = lu.ag(var1, 1425659899);
				return var3.ah(var2[-1219000074 * var3.av_fld], (byte)-10);
			}
		} catch (Throwable var5) {
			throw new RuntimeException(var5);
		}
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bu() {
		this.ak_fld.clear();
		this.ag_fld.clear();
		this.az_fld.clear();
		this.av_fld.clear();
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(I[I)I"
	)
	int bw(int var1, int[] var2) {
		try {
			if (null != var2 && var1 < this.az_fld.size()) {
				ArrayList var3 = (ArrayList)(ArrayList)this.az_fld.get(var1);
				if (var3 != null) {
					for (int var4 = 0; var4 < var3.size(); var4++) {
						ob var5 = (ob)(ob)var3.get(var4);
						int var6;
						if (-687839838 != var5.ag_fld) {
							var6 = jv(this, var5.ag_fld, var2);
						} else {
							var6 = var2[var5.ak_fld * -1025114869];
						}

						if (var6 >= var5.az_fld && var6 <= var5.av_fld) {
							return var4;
						}
					}
				}

				return -1;
			} else {
				return -1;
			}
		} catch (Throwable var8) {
			throw new RuntimeException(var8);
		}
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(I[I)I"
	)
	int ba(int var1, int[] var2) {
		try {
			if (null != var2 && var1 < this.az_fld.size()) {
				ArrayList var3 = (ArrayList)(ArrayList)this.az_fld.get(var1);
				if (var3 != null) {
					for (int var4 = 0; var4 < var3.size(); var4++) {
						ob var5 = (ob)(ob)var3.get(var4);
						int var6;
						if (65535 != var5.ag_fld) {
							var6 = jv(this, var5.ag_fld, var2);
						} else {
							var6 = var2[var5.ak_fld];
						}

						if (var6 >= var5.az_fld && var6 <= var5.av_fld) {
							return var4;
						}
					}
				}

				return -1;
			} else {
				return -1;
			}
		} catch (Throwable var8) {
			throw new RuntimeException(var8);
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I[II)Ljava/lang/String;"
	)
	@Override
	public String ae(int var1, int[] var2, int var3) {
		try {
			if (var1 >= 0 && var1 < this.ak_fld.size()) {
				oj var4 = (oj)(oj)this.ak_fld.get(var1);
				if (null == var4) {
					return null;
				} else {
					if (null != var2 && var1 < this.az_fld.size()) {
						int var5 = this.aj(var1, var2, (byte)-30);
						if (var5 >= 0) {
							ArrayList var6 = (ArrayList)(ArrayList)this.az_fld.get(var1);
							ob var7 = (ob)(ob)var6.get(var5);
							return var7.ae_fld;
						}
					}

					return var4.ae_fld;
				}
			} else {
				return null;
			}
		} catch (Throwable var8) {
			throw new RuntimeException(var8);
		}
	}

	@ObfuscatedName("vf")
	@ObfuscatedSignature(
		descriptor = "(Lpb;II[II)Z"
	)
	public static boolean vf(pb var0, int var1, int var2, int[] var3) throws EOFException {
		try {
			if (var0 == null) {
				throw new NullPointerException();
			} else if (var1 < 0 || var0.ak_fld.size() <= var1 || var0.ak_fld.get(var1) == null || var2 < 0) {
				return false;
			} else if (var2 == 0) {
				String var8 = var0.ae(var1, var3, 1899227782);
				return null != var8 && !var8.isEmpty();
			} else {
				int var5 = var0.bz(var1, var2, -38378775);
				String var6 = pk(var0, var1, var5, var2, var3);
				return null != var6 && !var6.isEmpty();
			}
		} catch (Throwable var7) {
			throw new RuntimeException(var7);
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II[IB)Ljava/lang/String;"
	)
	@Override
	public String ah(int var1, int var2, int[] var3, byte var4) {
		try {
			if (var1 >= this.ak_fld.size()) {
				return null;
			} else {
				int var5 = this.av(var1, var2, -1907075953);
				return -1 == var5 ? null : pk(this, var1, var2, var5, var3);
			}
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("jv")
	@ObfuscatedSignature(
		descriptor = "(Lpb;I[II)I"
	)
	public static int jv(pb var0, int var1, int[] var2) throws EOFException {
		try {
			if (var0 == null) {
				throw new NullPointerException();
			} else {
				ph var4 = lu.ag(var1, 1425659899);
				return var4.ah(var2[var4.av_fld], (byte)-27);
			}
		} catch (Throwable var5) {
			throw new RuntimeException(var5);
		}
	}

	@Nullable
	@ObfuscatedName("ll")
	@ObfuscatedSignature(
		descriptor = "(I[I)Ljava/lang/String;"
	)
	public String ll(int var1, int[] var2) {
		try {
			return this.ae(var1, var2, 1899227782);
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(IIIIIILjava/lang/String;)V"
	)
	void bp(int var1, int var2, int var3, int var4, int var5, int var6, String var7) {
		for (int var8 = this.av_fld.size(); var8 <= var1; var8++) {
			this.av_fld.add(null);
		}

		HashMap var10 = (HashMap)(HashMap)this.av_fld.get(var1);
		if (var10 == null) {
			var10 = new HashMap();
			this.av_fld.set(var1, var10);
		}

		if (!var10.containsKey(var2)) {
			var10.put(var2, new ArrayList());
		}

		ArrayList var9 = (ArrayList)(ArrayList)var10.get(var2);
		var9.add(new ps(this, var7, var2, var3, var4, var5, var6));
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II[I)Ljava/lang/String;"
	)
	@Override
	public String ai(int var1, int var2, int[] var3) {
		try {
			if (var1 >= this.ak_fld.size()) {
				return null;
			} else {
				int var4 = this.av(var1, var2, -1927808280);
				return -1 == var4 ? null : pk(this, var1, var2, var4, var3);
			}
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	@Override
	public int al(int var1) {
		return var1 >= this.ag_fld.size() ? 0 : ((ArrayList)this.ag_fld.get(var1)).size();
	}

	@ObfuscatedName("go")
	@ObfuscatedSignature(
		descriptor = "(Lpb;II[I)I"
	)
	public static int go(pb var0, int var1, int var2, int[] var3) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			if (null != var3 && var1 < var0.av_fld.size()) {
				HashMap var4 = (HashMap)(HashMap)var0.av_fld.get(var1);
				if (null != var4 && var4.containsKey(var2)) {
					ArrayList var5 = (ArrayList)(ArrayList)var4.get(var2);

					for (int var6 = 0; var6 < var5.size(); var6++) {
						ps var7 = (ps)(ps)var5.get(var6);
						int var8;
						if (65535 != var7.ag_fld) {
							var8 = jv(var0, var7.ag_fld, var3);
						} else {
							var8 = var3[var7.ak_fld];
						}

						if (var8 >= var7.az_fld && var8 <= var7.av_fld) {
							return var6;
						}
					}
				}

				return -1;
			} else {
				return -1;
			}
		} catch (Throwable var10) {
			throw new RuntimeException(var10);
		}
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	int cy(int var1, int var2) {
		if (var1 >= this.ag_fld.size()) {
			return -1;
		} else {
			ArrayList var3 = (ArrayList)(ArrayList)this.ag_fld.get(var1);

			for (int var4 = 0; var4 < var3.size(); var4++) {
				pm var5 = (pm)(pm)var3.get(var4);
				if (var5.ak_fld == var2) {
					return var4;
				}
			}

			return -1;
		}
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(III[I)Ljava/lang/String;"
	)
	String cf(int var1, int var2, int var3, int[] var4) {
		try {
			if (var1 >= this.ak_fld.size()) {
				return null;
			} else {
				int var5 = this.bm(var1, var3, var4, 1837281210);
				return -1 != var5
					? ((oj)((ArrayList)((HashMap)this.av_fld.get(var1)).get(var3)).get(var5)).ae_fld
					: ((oj)((ArrayList)this.ag_fld.get(var1)).get(var2)).ae_fld;
			}
		} catch (Throwable var7) {
			throw new RuntimeException(var7);
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	@Override
	public int au(int var1, int var2) {
		if (var1 >= this.ag_fld.size()) {
			return -1;
		} else {
			ArrayList var3 = (ArrayList)(ArrayList)this.ag_fld.get(var1);
			return var3 != null && var2 < var3.size() ? ((pm)var3.get(var2)).ak_fld * -811848167 : -1;
		}
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(III[I)Ljava/lang/String;"
	)
	String cs(int var1, int var2, int var3, int[] var4) {
		try {
			if (var1 >= this.ak_fld.size()) {
				return null;
			} else {
				int var5 = this.bm(var1, var3, var4, 1837281210);
				return -1 != var5
					? ((oj)((ArrayList)((HashMap)this.av_fld.get(var1)).get(var3)).get(var5)).ae_fld
					: ((oj)((ArrayList)this.ag_fld.get(var1)).get(var2)).ae_fld;
			}
		} catch (Throwable var7) {
			throw new RuntimeException(var7);
		}
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(III[I)Ljava/lang/String;"
	)
	String cp(int var1, int var2, int var3, int[] var4) {
		try {
			if (var1 >= this.ak_fld.size()) {
				return null;
			} else {
				int var5 = this.bm(var1, var3, var4, 1837281210);
				return -1 != var5
					? ((oj)((ArrayList)((HashMap)this.av_fld.get(var1)).get(var3)).get(var5)).ae_fld
					: ((oj)((ArrayList)this.ag_fld.get(var1)).get(var2)).ae_fld;
			}
		} catch (Throwable var7) {
			throw new RuntimeException(var7);
		}
	}

	@Nullable
	@ObfuscatedName("getOp")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;"
	)
	@Export("getOp")
	@Override
	public String getOp(int var1) {
		try {
			return this.ll(var1, rt.ag_fld);
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@Nullable
	@ObfuscatedName("getSubOp")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;"
	)
	@Export("getSubOp")
	@Override
	public String getSubOp(int var1, int var2) {
		try {
			return this.mu(var1, var2, rt.ag_fld);
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;"
	)
	public static final String ce(String var0, int var1) {
		if (null == var0) {
			var0 = var1 + 1 + ": TEST";
		} else {
			var0 = var1 + 1 + ": " + var0;
		}

		return var0;
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;"
	)
	public static final String cn(String var0, int var1) {
		if (null == var0) {
			var0 = var1 + 1 + ": TEST";
		} else {
			var0 = var1 + 1 + ": " + var0;
		}

		return var0;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(IIIIILjava/lang/String;)V"
	)
	void bo(int var1, int var2, int var3, int var4, int var5, String var6) {
		for (int var7 = this.az_fld.size(); var7 <= var1; var7++) {
			this.az_fld.add(new ArrayList());
		}

		ArrayList var8 = (ArrayList)(ArrayList)this.az_fld.get(var1);
		var8.add(new ob(this, var6, var2, var3, var4, var5));
	}

	@ObfuscatedName("uy")
	@ObfuscatedSignature(
		descriptor = "(Lpb;IIIIIILjava/lang/String;)V"
	)
	public static void uy(pb var0, int var1, int var2, int var3, int var4, int var5, int var6, String var7) {
		for (int var8 = var0.av_fld.size(); var8 <= var1; var8++) {
			var0.av_fld.add(null);
		}

		HashMap var10 = (HashMap)(HashMap)var0.av_fld.get(var1);
		if (var10 == null) {
			var10 = new HashMap();
			var0.av_fld.set(var1, var10);
		}

		if (!var10.containsKey(var2)) {
			var10.put(var2, new ArrayList());
		}

		ArrayList var9 = (ArrayList)(ArrayList)var10.get(var2);
		var9.add(new ps(var0, var7, var2, var3, var4, var5, var6));
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II[II)Z"
	)
	boolean ac(int var1, int var2, int[] var3, int var4) {
		try {
			if (var1 < 0 || this.ak_fld.size() <= var1 || this.av_fld.get(var1) == null || var2 < 0) {
				return false;
			} else if (var2 == 0) {
				String var8 = this.ae(var1, var3, 1899227782);
				return null != var8 && !var8.isEmpty();
			} else {
				int var5 = this.bz(var1, var2, -38378775);
				String var6 = pk(this, var1, var5, var2, var3);
				return null != var6 && !var6.isEmpty();
			}
		} catch (Throwable var7) {
			throw new RuntimeException(var7);
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(I[II)I"
	)
	int bd(int var1, int[] var2, int var3) {
		try {
			ph var4 = lu.ag(var1, 1425659899);
			return var4.ah(var2[2041933517 * var4.ae_fld], (byte)-27);
		} catch (Throwable var5) {
			throw new RuntimeException(var5);
		}
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(III[II)Ljava/lang/String;"
	)
	String br(int var1, int var2, int var3, int[] var4, int var5) {
		try {
			if (var1 >= this.az_fld.size()) {
				return null;
			} else {
				int var6 = this.bm(var1, var3, var4, 1837281210);
				return -1 != var6
					? ((oj)((ArrayList)((HashMap)this.az_fld.get(var1)).get(var3)).get(var6)).ae_fld
					: ((oj)((ArrayList)this.av_fld.get(var1)).get(var2)).ae_fld;
			}
		} catch (Throwable var7) {
			throw new RuntimeException(var7);
		}
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(IIIIIILjava/lang/String;)V"
	)
	void bv(int var1, int var2, int var3, int var4, int var5, int var6, String var7) {
		for (int var8 = this.av_fld.size(); var8 <= var1; var8++) {
			this.az_fld.add(null);
		}

		HashMap var10 = (HashMap)(HashMap)this.ag_fld.get(var1);
		if (var10 == null) {
			var10 = new HashMap();
			this.ak_fld.set(var1, var10);
		}

		if (!var10.containsKey(var2)) {
			var10.put(var2, new ArrayList());
		}

		ArrayList var9 = (ArrayList)(ArrayList)var10.get(var2);
		var9.add(new ps(this, var7, var2, var3, var4, var5, var6));
	}
}
