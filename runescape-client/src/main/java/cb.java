import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("cb")
public class cb implements gg {
	@ObfuscatedName("mz")
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	static fn mz_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "B"
	)
	static byte ak_fld;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ad_fld;
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bs_fld;
	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bb_fld;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int af_fld;
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

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Llu;II)V"
	)
	@Override
	public void ar(lu var1, int var2, int var3) throws EOFException {
		kf.ag(var1, var2, var3, 1440145996);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	@Override
	public void ao(int var1, int var2) {
		ce.lm(do_.bp_fld, var1, var2, (byte)40);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Llu;III)V"
	)
	@Override
	public void ag(lu var1, int var2, int var3, int var4) throws EOFException {
		client.yl(var1, var2, var3);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IIIIID)V"
	)
	@Override
	public void ax(int var1, int var2, int var3, int var4, int var5, double var6) throws EOFException {
		wl.jv(lz.ah(), var1, var2, var3, var4, var5, var6);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V"
	)
	@Override
	public void av(int var1, int var2, int var3, int var4, int var5) throws EOFException {
		wl.ji(lz.ah(), var1, var2, var3, var4, (short)-22457);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIB)V"
	)
	@Override
	public void ae(int var1, int var2, byte var3) {
		ce.lm(do_.bp_fld, var1, var2, (byte)-62);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	@Override
	public void ah(int var1, int var2, int var3, int var4) throws EOFException {
		qv.cs(var1, var2, var3, var4, (byte)0);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIIIID)V"
	)
	@Override
	public void al(int var1, int var2, int var3, int var4, int var5, double var6) throws EOFException {
		wl.jv(lz.ah(), var1, var2, var3, var4, var5, var6);
	}

	cb() {
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Llu;II)V"
	)
	@Override
	public void ay(lu var1, int var2, int var3) throws EOFException {
		kf.ag(var1, var2, var3, 2086251503);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V"
	)
	@Override
	public void ak(int var1, int var2, int var3, int var4, int var5) throws EOFException {
		qv.cs(var1, var2, var3, var4, (byte)0);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IIIIID)V"
	)
	@Override
	public void aa(int var1, int var2, int var3, int var4, int var5, double var6) throws EOFException {
		wl.jv(lz.ah(), var1, var2, var3, var4, var5, var6);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Llu;II)V"
	)
	@Override
	public void as(lu var1, int var2, int var3) throws EOFException {
		kf.ag(var1, var2, var3, 313818173);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIIIID)V"
	)
	@Override
	public void au(int var1, int var2, int var3, int var4, int var5, double var6) throws EOFException {
		wl.jv(lz.ah(), var1, var2, var3, var4, var5, var6);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIIIID)V"
	)
	@Override
	public void az(int var1, int var2, int var3, int var4, int var5, double var6) throws EOFException {
		wl.jv(lz.ah(), var1, var2, var3, var4, var5, var6);
	}

	@ObfuscatedName("nj")
	@ObfuscatedSignature(
		descriptor = "(Lgh;)I"
	)
	public static int nj(gh var0) {
		return var0.ay_fld * var0.ar_fld;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIIIID)V"
	)
	@Override
	public void an(int var1, int var2, int var3, int var4, int var5, double var6) throws EOFException {
		wl.jv(lz.ah(), var1, var2, var3, var4, var5, var6);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	static void as(byte var0) throws FileNotFoundException, EOFException {
		if (null != ob.ek_fld && ob.ek_fld.al()) {
			ob.ek_fld.as((byte)84);
		}

		hh.bm();
		es.ad(-1452426046);
		if (gz.gb_fld != null) {
			if (var0 == 32) {
				client.wu();
				return;
			}

			gz.gb_fld.ak_fld = false;
		}

		gz.gb_fld = null;
		client.aq_fld.ae();
		if (null != fw.qz_fld) {
			try {
				fw.qz_fld.ae(-1723669543);
			} catch (Exception var4) {
			}
		}

		fw.qz_fld = null;
		pd.aj((byte)1);
		td.ar((byte)-110);
		client.da_fld.an((byte)67);
		client.ds_fld.ag();
		ca.px_fld = null;
		sx.av(0, 0);
		ah.ay();
		client.kc_fld = false;
		Iterator var1 = client.da_fld.iterator();

		while (var1.hasNext()) {
			dx var2 = (dx)(dx)var1.next();
			dx.cy(var2, -1880611165);
		}

		client.kd_fld.az(false, 1796016238);
		if (null != dx.on_fld) {
			dx.on_fld.aw(-1509452726);
		}

		ef.pt_fld.ar();
		eb.as();
		if (null != xh.jn_fld) {
			xh.jn_fld.ar((byte)0);
		}

		gp.aw((byte)18);
		mh.af_fld = null;
		mh.al_fld = null;
		tw.au_fld = null;
		eu.ag(716168508);
		cp.ph_fld = null;
		client.py_fld.clear();
		client.pj_fld = 0;
		ef.pt_fld = new uu();
		xh.jn_fld = new dp(og.ci_fld.qr_fld, 238);

		try {
			hw.ak("oldschool", bb.jj_fld, en.gs_fld.ae_fld, 0, 25, (byte)4);
		} catch (IOException var3) {
			throw new RuntimeException(var3);
		}

		cp.ph_fld = new un(255, mh.af_fld, mh.al_fld, 750000);
		fw.qz_fld = new la();
		cf.cg_fld = new uo(bu.hv_fld, ab.hu_fld, gz.hy_fld, ow.ie_fld, dm.is_fld);
		og.ci_fld.ahg(2072206514);
		ao.aq(cy.ag_fld);
		jk.af(0, (byte)43);
		client.wu();
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	@Override
	public void ai(int var1, int var2, int var3, int var4) throws EOFException {
		wl.ji(lz.ah(), var1, var2, var3, var4, (short)17716);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	@Override
	public void aq(int var1, int var2, int var3, int var4) throws EOFException {
		wl.ji(lz.ah(), var1, var2, var3, var4, (short)-16448);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	@Override
	public void am(int var1, int var2) {
		ce.lm(do_.bp_fld, var1, var2, (byte)21);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	@Override
	public void ad(int var1, int var2) {
		ce.lm(do_.bp_fld, var1, var2, (byte)-107);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Llu;II)V"
	)
	@Override
	public void af(lu var1, int var2, int var3) throws EOFException {
		kf.ag(var1, var2, var3, 1671212444);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	@Override
	public void ab(int var1, int var2) {
		ce.lm(do_.bp_fld, var1, var2, (byte)-70);
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(Ldx;Lko;B)V"
	)
	static void ck(dx var0, ko var1, byte var2) throws EOFException {
		int var3 = 0;

		for (int var4 = 0; var4 < var0.am_fld.az(); var4++) {
			rg var5 = (rg)var0.an_fld.ak(var0.am_fld.ag(var4));
			if (var5 != null && client.es_fld != var5.ah_fld.ag_fld * 1674941469 && var5.as(-743791201) == var1) {
				boolean var10000;
				if (var3 < client.gj_fld) {
					if (var2 == 0) {
						return;
					}

					var10000 = true;
				} else {
					var10000 = false;
				}

				boolean var6 = var10000;
				if (var6) {
					var3++;
					boolean var7 = false;
					if (ko.ag_fld == var1) {
						var7 = hb.cu(var5, var0);
					}

					rb.cz(var0, var5, var7, (byte)-31);
				}
			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	@Override
	public void aw(int var1, int var2, int var3, int var4) throws EOFException {
		qv.cs(var1, var2, var3, var4, (byte)0);
	}
}
