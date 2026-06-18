import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("if")
public class if_ extends ht {
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lab;"
	)
	public static ab an_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1705188207
	)
	int az_fld;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ar_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -2098146647
	)
	int av_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 865938719
	)
	int ak_fld;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ax_fld;
	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int cq_fld;
	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	static ub cf_fld;
	// $VF: synthetic field
	@ObfuscatedName("this$0")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	ia this$0;
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bt_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 720157035
	)
	int ag_fld;

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	static void ag() {
		cq.af_fld = null;
		tx.al_fld = (short[][][])null;
		rt.au_fld = (byte[][][])null;
		us.ax_fld = (byte[][][])null;
		jw.ab_fld = (int[][][])null;
		fp.an_fld = (byte[][][])null;
		kf.aa_fld = (int[][])null;
		hv.ai_fld = null;
		or.aq_fld = null;
		cl.am_fld = null;
		lz.ad_fld = null;
		dt.ao_fld = null;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	@Override
	void ak(xi var1, int var2) {
		this.ak_fld = var1.cm();
		this.ag_fld = var1.co((byte)-119);
		this.az_fld = var1.cg();
		this.av_fld = var1.cg();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lik;I)V"
	)
	@Override
	void ag(ik var1, int var2) {
		ik.de(var1, this.ak_fld, this.ag_fld, this.az_fld, this.av_fld);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	void az(xi var1) {
		this.ak_fld = var1.cm();
		this.ag_fld = var1.co((byte)-76);
		this.az_fld = var1.cg();
		this.av_fld = var1.cg();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	void av(xi var1) {
		this.ak_fld = var1.cm();
		this.ag_fld = var1.co((byte)-111);
		this.az_fld = var1.cg();
		this.av_fld = var1.cg();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	void ae(xi var1) {
		this.ak_fld = var1.cm();
		this.ag_fld = var1.co((byte)-73);
		this.az_fld = var1.cg();
		this.av_fld = var1.cg();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lik;)V"
	)
	@Override
	void ah(ik var1) {
		ik.de(var1, this.ak_fld, this.ag_fld, this.az_fld, this.av_fld);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lik;)V"
	)
	@Override
	void aw(ik var1) {
		ik.de(var1, this.ak_fld, this.ag_fld, this.az_fld, this.av_fld);
	}

	if_(ia var1) {
		this.this$0 = var1;
		this.ak_fld = 1667100961;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lik;)V"
	)
	@Override
	void ay(ik var1) {
		ik.de(var1, this.ak_fld, this.ag_fld, this.az_fld, this.av_fld);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ldx;IIILkp;B)V"
	)
	static void ae(dx var0, int var1, int var2, int var3, kp var4, byte var5) {
		int var6 = client.db_fld.al_fld;
		int[] var7 = client.db_fld.ar_fld;
		int var8 = on.ee();

		for (int var9 = 0; var9 < var6; var9++) {
			cv var10 = (cv)var0.au_fld.ae(var7[var9]);
			if (null != var10 && var10.bm(1557993055)) {
				if (var5 >= 49) {
					return;
				}

				if (!var10.at_fld) {
					tu var11 = mf.bn(var0, var10.bi_fld, var10.dm_fld);
					int var12 = (int)var11.ar_fld;
					int var13 = (int)var11.as_fld;
					var11.ah();
					int var14 = var12 / 32 - client.nw_fld / 32;
					int var15 = var13 / 32 - client.nd_fld / 32;
					if (var10.bq_fld == client.dj_fld) {
						int var16 = fc.ah_fld[var3];
						int var17 = fc.aw_fld[var3];
						int var18 = var14 * var17 + var16 * var15 >> 16;
						int var19 = var15 * var17 - var16 * var14 >> 16;
						bx.ad_fld = var18;
						bx.ao_fld = var19;
					} else if (var10.ah((byte)0)) {
						ec.ah(var1, var2, var14, var15, var3, tf.al_Arryv[3], var4);
					} else if (var8 != 0 && var10.ac_fld != 0 && var8 == var10.ac_fld) {
						ec.ah(var1, var2, var14, var15, var3, tf.al_Arryv[4], var4);
					} else if (cv.rp(var10, (byte)-45)) {
						ec.ah(var1, var2, var14, var15, var3, tf.al_Arryv[5], var4);
					} else if (var10.at(-725743415)) {
						ec.ah(var1, var2, var14, var15, var3, tf.al_Arryv[6], var4);
					} else {
						ec.ah(var1, var2, var14, var15, var3, tf.al_Arryv[2], var4);
					}
				}
			}
		}
	}
}
