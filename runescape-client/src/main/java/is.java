import java.util.Iterator;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("is")
public class is extends ht {
	// $VF: synthetic field
	@ObfuscatedName("this$0")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	ia this$0;
	@ObfuscatedGetter(
		intValue = 1825776087
	)
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ak_fld;
	@ObfuscatedGetter(
		intValue = 1600177927
	)
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int av_fld;
	@ObfuscatedGetter(
		intValue = 901694199
	)
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ag_fld;
	@ObfuscatedGetter(
		intValue = 1186569163
	)
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int az_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ae_fld;
	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int cy_fld;

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	void av(xi var1) {
		this.av_fld = var1.co();
		this.az_fld = var1.co() * 1137832857;
		this.ak_fld = var1.cg() * -785209092;
		this.ag_fld = var1.cg() * -675516204;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	@Override
	void ak(xi var1, int var2) {
		this.av_fld = var1.co();
		this.az_fld = var1.co();
		this.ak_fld = var1.cg();
		this.ag_fld = var1.cg();
	}

	is(ia var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ILlu;IIIII[F)Llu;"
	)
	static lu ak(int var0, lu var1, int var2, int var3, int var4, int var5, int var6, float[] var7) {
		lu var9 = new lu();
		var9.bx_fld = var0;
		var9.cv_fld = 1050017623 * var1.bf_fld;
		var9.by_fld = var2;
		var9.bj_fld = true;
		var9.bt_fld = var3;
		var9.bv_fld = var4;
		var9.bi_fld = var5;
		var9.bu_fld = var6;
		var9.bn_fld = 1929139669 * (int)(var1.bb_fld * var7[0]);
		var9.bc_fld = 1723159913 * (int)(var7[1] * var1.cd_fld);
		var9.bw_fld = (int)(var7[2] * var1.bb_fld);
		var9.ba_fld = -794239085 * (int)(var1.cd_fld * var7[3]);
		return var9;
	}

	@ObfuscatedName("gd")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	static final void gd(int var0) {
		Iterator var1 = client.da_fld.iterator();

		while (var1.hasNext()) {
			dx var2 = (dx)(dx)var1.next();

			for (int var3 = 0; var3 < client.db_fld.al_fld; var3++) {
				cv var4 = (cv)var2.au_fld.ak(client.db_fld.az_fld[var3]);
				if (null != var4) {
					if (var0 >= -581757754) {
						return;
					}

					var4.aw((byte)98);
				}
			}
		}

		jp.aw();
		if (null != jr.fa_fld) {
			jr.fa_fld.an(234455807);
		}
	}

	@ObfuscatedName("yz")
	@ObfuscatedSignature(
		descriptor = "(Lrg;)I"
	)
	public static int yz(rg var0) {
		return var0.ah_fld.ah_fld * 491640768 + oy.ad(var0.aw_fld, -654080199);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	void ae(xi var1) {
		this.av_fld = var1.co();
		this.az_fld = var1.co();
		this.ak_fld = var1.cg();
		this.ag_fld = var1.cg();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lik;)V"
	)
	@Override
	void ah(ik var1) {
		var1.ai(this.av_fld, this.az_fld, this.ak_fld, this.ag_fld, (byte)82);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lik;)V"
	)
	@Override
	void aw(ik var1) {
		var1.ai(this.av_fld, -1921346754 * this.az_fld, this.ak_fld, 1914155279 * this.ag_fld, (byte)82);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lik;)V"
	)
	@Override
	void ay(ik var1) {
		var1.ai(this.av_fld, this.az_fld, this.ak_fld, this.ag_fld, (byte)82);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lik;I)V"
	)
	@Override
	void ag(ik var1, int var2) {
		var1.ai(this.av_fld, this.az_fld, this.ak_fld, this.ag_fld, (byte)82);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	void az(xi var1) {
		this.av_fld = var1.co();
		this.az_fld = var1.co();
		this.ak_fld = var1.cg();
		this.ag_fld = var1.cg();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IZ)Ljava/lang/String;"
	)
	public static String ay(int var0, boolean var1) {
		return var1 && var0 >= 0 ? gl.as(var0, 10, var1) : Integer.toString(var0);
	}
}
