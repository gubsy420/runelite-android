import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("in")
public class in extends ht {
	// $VF: synthetic field
	@ObfuscatedName("this$0")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	ia this$0;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	String ak_fld;
	@ObfuscatedName("ip")
	@ObfuscatedSignature(
		descriptor = "Luv;"
	)
	static uv ip_fld;
	@ObfuscatedName("gc")
	@ObfuscatedSignature(
		descriptor = "[S"
	)
	static short[] gc_fld;

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	void az(xi var1) {
		this.ak_fld = xi.at(var1, 576915572);
		var1.co((byte)-110);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	@Override
	void ak(xi var1, int var2) {
		this.ak_fld = xi.at(var1, 1785153444);
		var1.co((byte)-36);
	}

	@ObfuscatedName("ug")
	@ObfuscatedSignature(
		descriptor = "(Luy;)V"
	)
	public static void ug(uy var0) {
		if (var0 == null) {
			var0.getClass();
		}

		synchronized (uy.ag_fld) {
			if (uy.av_fld < uy.az_fld) {
				uy.ag_fld[(uy.av_fld += 788485024) * 848250219 - 1] = var0;
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lik;I)V"
	)
	@Override
	void ag(ik var1, int var2) {
		var1.as_fld = this.ak_fld;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;"
	)
	public static String an(String var0) {
		int var2 = var0.length();
		char[] var3 = new char[var2];
		byte var4 = 2;

		for (int var5 = 0; var5 < var2; var5++) {
			char var6 = var0.charAt(var5);
			if (0 == var4) {
				var6 = Character.toLowerCase(var6);
			} else if (var4 == 2 || Character.isUpperCase(var6)) {
				var6 = dw.az(var6);
			}

			if (Character.isLetter(var6)) {
				var4 = 0;
			} else if (var6 == '.' || '?' == var6 || var6 == '!') {
				var4 = 2;
			} else if (Character.isSpaceChar(var6)) {
				if (2 != var4) {
					var4 = 1;
				}
			} else {
				var4 = 1;
			}

			var3[var5] = var6;
		}

		return new String(var3);
	}

	in(ia var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lik;)V"
	)
	@Override
	void ay(ik var1) {
		var1.as_fld = this.ak_fld;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lik;)V"
	)
	@Override
	void ah(ik var1) {
		var1.as_fld = this.ak_fld;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lik;)V"
	)
	@Override
	void aw(ik var1) {
		var1.as_fld = this.ak_fld;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	void av(xi var1) {
		this.ak_fld = xi.at(var1, 133030834);
		var1.co((byte)-9);
	}

	@ObfuscatedName("fn")
	@ObfuscatedSignature(
		descriptor = "(III)Z"
	)
	static boolean fn(int var0, int var1) {
		if (var1 >= 2000) {
			var1 -= 2000;
		}

		sb var3 = client.da_fld.ax(var0, (byte)-109);
		rg var4 = (rg)cx.gw(client.da_fld, -225377813).an_fld.ak(var0);
		boolean var5 = 0 == var0;
		boolean var6 = client.es_fld == var0;
		boolean var7 = false;
		if (null != var4) {
			var7 = var4.as(-743791201) != ko.ak_fld;
			if (!var6) {
				jf var8 = var4.aw_fld.ax(305786880);
				boolean var9 = 1002 == var1 || var1 == 1003 || var1 == 1004 || var1 == 1013;
				if (var9 && !var8.ah_fld) {
					return false;
				}

				boolean var11 = km.ak(var1) || sq.ag(var1);
				if (!var11) {
					boolean var12 = var1 == 16 || var1 == 17 || var1 >= 18 && var1 <= 22;
					var11 = var12;
				}

				boolean var16 = var11;
				if (!var11) {
					boolean var13 = var1 >= 61 && var1 <= 67;
					var16 = var13;
				}

				if (var16 && !var8.aw_fld) {
					return false;
				}
			}
		}

		if (km.ak(var1) && !var3.ay(var7, var5, var6)) {
			return false;
		} else {
			boolean var14 = 16 == var1 || 17 == var1 || var1 >= 18 && var1 <= 22;
			if (var14 && !var3.as(var7, var5, var6)) {
				return false;
			} else if (sq.ag(var1) && !var3.ar(var7, var5, var6)) {
				return false;
			} else {
				boolean var15 = var1 == 14 || var1 == 15 || var1 >= 44 && var1 <= 51;
				if (var15 && !var3.af(var7, var5, var6)) {
					return false;
				} else if (1002 == var1 && !var3.al(var7, var5, var6)) {
					return false;
				} else {
					return var1 == 1004 && !sb.jf(var3, var7, var5, var6, -1255103822) ? false : 1003 != var1 || var3.ax(var7, var5, var6);
				}
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	void ae(xi var1) {
		this.ak_fld = xi.at(var1, 1356010913);
		var1.co((byte)-92);
	}
}
