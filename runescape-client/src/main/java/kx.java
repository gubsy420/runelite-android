import java.io.EOFException;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("kx")
public class kx implements xm {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	public static kx ag_fld = new kx(1);
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ab_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	public static kx az_fld = new kx(2);
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	public static kx av_fld = new kx(3);
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	public static kx ak_fld = new kx(0);
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int au_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int aw_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -402696271
	)
	int ae_fld;

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int ah() {
		return this.ae_fld;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	@Override
	public int ag(int var1) {
		return this.ae_fld;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int av() {
		return this.ae_fld;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(S)V"
	)
	static final void ab(short var0) throws EOFException, UnsupportedEncodingException {
		client.appletStub.ae();
		pd.aj((byte)1);
		client.da_fld.an((byte)103);
		na.mh(client.ds_fld);
		client.db_fld.an();
		client.fy_fld.az(-148723630);
		System.gc();
		sx.av(0, 0);
		ah.ay();
		client.kc_fld = false;
		Iterator var1 = client.da_fld.iterator();

		while (var1.hasNext()) {
			if (var0 == 400) {
				return;
			}

			dx var2 = (dx)(dx)var1.next();
			var2.ar(-2012012193);
		}

		client.kd_fld.az(true, 1796016238);
		jk.af(10, (byte)-58);
		client.gw_fld = 0;
		byte var10000 = -1;
		client.wj();
		cf.ak().ae();
		cf.ak().ah();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int ae() {
		return this.ae_fld;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()[Lkx;"
	)
	public static kx[] az() {
		return new kx[]{ag_fld, ak_fld, av_fld, az_fld};
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "()[Lkx;"
	)
	public static kx[] aw() {
		return new kx[]{ag_fld, ak_fld, av_fld, az_fld};
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()[Lkx;"
	)
	public static kx[] ay() {
		return new kx[]{ag_fld, ak_fld, av_fld, az_fld};
	}

	kx(int var1) {
		this.ae_fld = var1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ILcx;I)Ldx;"
	)
	public static dx ak(int var0, cx var1) {
		Iterator var3 = var1.iterator();

		while (var3.hasNext()) {
			dx var4 = (dx)(dx)var3.next();
			cv var5 = (cv)var4.au_fld.ae(var0);
			if (var5 != null && !var4.ak(-787091592)) {
				return var4;
			}
		}

		return cx.gw(var1, -225377813);
	}
}
