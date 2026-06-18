import java.io.EOFException;
import java.util.Iterator;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("cm")
public class cm implements jd {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ak_fld;

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	public boolean at() {
		return client.gk_fld;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	@Override
	public boolean ak(int var1) {
		return client.ng_fld;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	@Override
	public boolean av(int var1) {
		return client.ge_fld;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	public boolean ad() {
		return gu.hh_fld;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	public boolean aa() {
		return bx.ar_fld < 3;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	@Override
	public boolean ae(int var1) {
		return gu.hh_fld;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	@Override
	public int ag(int var1) {
		return tf.ql_fld;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int bz() {
		return client.js_fld;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	@Override
	public int ay(byte var1) {
		return client.ca_fld.ax_fld;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int br() {
		return client.js_fld;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	@Override
	public int ar(byte var1) {
		return client.js_fld;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	public boolean af() {
		return client.ng_fld;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int al() {
		wz var1 = client.nr_fld;
		return var1.ot_fld;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	public boolean au() {
		return bx.ar_fld < 3;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	public static int az(int var0, int var1) throws EOFException {
		sp var3 = (sp)ol.bd_fld.ak(var0);
		sp var2;
		if (var3 != null) {
			var2 = var3;
		} else {
			var3 = ld.ak(mc.at_fld, pm.ac_fld, var0);
			if (var3 != null) {
				ol.bd_fld.az(var3, var0);
			}

			var2 = var3;
		}

		if (var2 == null) {
			return 2;
		} else {
			return sp.sp(var2, -2079036724) ? 0 : 1;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	public boolean an() {
		return bx.ar_fld < 3;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	@Override
	public int ah(int var1) {
		wz var2 = client.nr_fld;
		return var2.ot_fld;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	public boolean ai() {
		return client.ge_fld;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(Llu;I)I"
	)
	@Override
	public int bm(lu var1, int var2) {
		return ds.fz(var1, var2);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	public boolean am() {
		return gu.hh_fld;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	public boolean aq() {
		return gu.hh_fld;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int ao() {
		return tf.ql_fld;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int ab() {
		return tf.ql_fld;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	public boolean ap() {
		return client.gk_fld;
	}

	cm() {
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int ac() {
		return client.ca_fld.ax_fld;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Llu;II)I"
	)
	@Override
	public int as(lu var1, int var2, int var3) {
		return ds.fz(var1, var2);
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(Llu;I)I"
	)
	@Override
	public int bd(lu var1, int var2) {
		return ds.fz(var1, var2);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Llu;I)I"
	)
	@Override
	public int aj(lu var1, int var2) {
		return ds.fz(var1, var2);
	}

	@ObfuscatedName("fb")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	public static void fb(xi var0, int var1) {
		var0.al_fld[(var0.au_fld += 228932457) * -661977895 - 1] = (byte)(0 - var1);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	@Override
	public boolean az(int var1) {
		return bx.ar_fld < 3;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	public boolean ax() {
		return bx.ar_fld < 3;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)[Lgh;"
	)
	static gh[] ak_Arrgh(int var0) {
		return new gh[]{gh.ag_fld, gh.ak_fld, gh.ae_fld, gh.az_fld, gh.ah_fld, gh.av_fld, gh.aw_fld};
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	@Override
	public boolean aw(int var1) {
		return client.gk_fld;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	static final void bj(int var0) {
		if (an.ow_fld) {
			Iterator var1 = client.da_fld.iterator();

			while (var1.hasNext()) {
				if (var0 <= 1976547526) {
					return;
				}

				dx var2 = (dx)(dx)var1.next();

				for (int var3 = 0; var3 < client.db_fld.al_fld; var3++) {
					cv var4 = (cv)bw.dk_fld.au_fld.ae(client.db_fld.ar_fld[var3]);
					if (var4 != null) {
						if (var0 <= 1976547526) {
							return;
						}

						cv.fc(var4, 1390461246);
					}
				}
			}

			an.ow_fld = false;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lub;Lub;B)V"
	)
	public static void ak(ub var0, ub var1) {
		pa.az_fld = var0;
		pa.av_fld = var1;
	}
}
