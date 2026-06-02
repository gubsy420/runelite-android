import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("yi")
class yi implements yn {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ai_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ag_fld;

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)Ljava/lang/Object;"
	)
	@Override
	public Object aw(xi var1) {
		return xi.ob(var1, 203143117);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Lxh;I)Ljm;"
	)
	public static jm ak(int var0, String var1, xh var2, int var3) {
		jm var5 = gi.ak(jb.ck_fld, client.aq_fld.av_fld);
		var5.ay_fld.bc(0);
		int var6 = var5.ay_fld.au_fld * -661977895;
		var5.ay_fld.bc(var0);
		String var7 = var1.toLowerCase();
		int var8 = 0;
		byte[] var9 = null;
		if (var7.startsWith(kh.ie_fld)) {
			var8 = 0;
			var1 = var1.substring(kh.ie_fld.length());
		} else if (var7.startsWith(kh.iv_fld)) {
			var8 = 1;
			var1 = var1.substring(kh.iv_fld.length());
		} else if (var7.startsWith(kh.im_fld)) {
			var8 = 2;
			var1 = var1.substring(kh.im_fld.length());
		} else if (var7.startsWith(kh.if_fld)) {
			var8 = 3;
			var1 = var1.substring(kh.if_fld.length());
		} else if (var7.startsWith(kh.ip_fld)) {
			var8 = 4;
			var1 = var1.substring(kh.ip_fld.length());
		} else if (var7.startsWith(kh.il_fld)) {
			var8 = 5;
			var1 = var1.substring(kh.il_fld.length());
		} else if (var7.startsWith(kh.ia_fld)) {
			var8 = 6;
			var1 = var1.substring(kh.ia_fld.length());
		} else if (var7.startsWith(kh.iq_fld)) {
			var8 = 7;
			var1 = var1.substring(kh.iq_fld.length());
		} else if (var7.startsWith(kh.is_fld)) {
			var8 = 8;
			var1 = var1.substring(kh.is_fld.length());
		} else if (var7.startsWith(kh.iy_fld)) {
			var8 = 9;
			var1 = var1.substring(kh.iy_fld.length());
		} else if (var7.startsWith(kh.ic_fld)) {
			var8 = 10;
			var1 = var1.substring(kh.ic_fld.length());
		} else if (var7.startsWith(kh.in_fld)) {
			var8 = 11;
			var1 = var1.substring(kh.in_fld.length());
		} else if (var7.startsWith(kh.io_fld)) {
			var8 = 12;
			var1 = var1.substring(kh.io_fld.length());
		} else if (var7.startsWith(kh.ik_fld)) {
			var9 = ge.ag(var7);
			if (null != var9) {
				var8 = var9.length + 12;
				var1 = var1.substring(kh.ik_fld.length() + var9.length + 1);
			}
		}

		var7 = var1.toLowerCase();
		byte var10 = 0;
		if (var7.startsWith(kh.ij_fld)) {
			var10 = 1;
			var1 = var1.substring(kh.ij_fld.length());
		} else if (var7.startsWith(kh.id_fld)) {
			var10 = 2;
			var1 = var1.substring(kh.id_fld.length());
		} else if (var7.startsWith(kh.ih_fld)) {
			var10 = 3;
			var1 = var1.substring(kh.ih_fld.length());
		} else if (var7.startsWith(kh.ix_fld)) {
			var10 = 4;
			var1 = var1.substring(kh.ix_fld.length());
		} else if (var7.startsWith(kh.iu_fld)) {
			var10 = 5;
			var1 = var1.substring(kh.iu_fld.length());
		}

		var5.ay_fld.bc(var8);
		var5.ay_fld.bc(var10);
		if (var9 != null) {
			for (int var11 = 0; var11 < var9.length; var11++) {
				var5.ay_fld.bc(var9[var11]);
			}
		}

		jj.ak(var5.ay_fld, var1);
		if (var0 == kf.av_fld.ag(-1652958600)) {
			var5.ay_fld.bc(var3);
		}

		var5.ay_fld.cp(var5.ay_fld.au_fld * -661977895 - var6);
		return var5;
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(Lyi;Ljava/lang/Long;Lxi;I)V"
	)
	public static void cm(yi var0, Long var1, xi var2, int var3) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var2.fn(var1);
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)Ljava/lang/Object;"
	)
	@Override
	public Object ag(xi var1, int var2) {
		return xi.ob(var1, 186640615);
	}

	yi() {
	}

	@ObfuscatedName("vh")
	@ObfuscatedSignature(
		descriptor = "(Lev;IIII)Z"
	)
	public static boolean vh(ev var0, int var1, int var2, int var3, int var4) {
		return var0.ci(var0.ex_fld, var1, var2, var3, var4);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Long;Lxi;)V"
	)
	void av(Long var1, xi var2) {
		var2.fn(var1);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Long;Lxi;)V"
	)
	void ae(Long var1, xi var2) {
		var2.fn(var1);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)Ljava/lang/Object;"
	)
	@Override
	public Object ah(xi var1) {
		return xi.ob(var1, -1929308636);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lxi;B)V"
	)
	@Override
	public void az(Object var1, xi var2, byte var3) {
		cm(this, (Long)var1, var2, -2097605185);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lxi;)V"
	)
	@Override
	public void ay(Object var1, xi var2) {
		cm(this, (Long)var1, var2, -1184964057);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lxi;)V"
	)
	@Override
	public void as(Object var1, xi var2) {
		cm(this, (Long)var1, var2, 1322177405);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Long;Lxi;I)V"
	)
	void ak(Long var1, xi var2, int var3) {
		var2.fl(var1);
	}
}
