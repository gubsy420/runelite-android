import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("ls")
public class ls extends mu {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ap_fld;
	// $VF: synthetic field
	@ObfuscatedName("this$0")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	mj this$0;
	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "Lzf;"
	)
	public static zf dd_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ah_fld;
	@ObfuscatedGetter(
		intValue = 678094141
	)
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ak_fld;

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int av() {
		return 0;
	}

	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		descriptor = "()Lkj;"
	)
	static kj ea() {
		tu var2 = sq.ek();
		kj var1;
		if (var2.af()) {
			var1 = new kj();
		} else {
			int var3 = kj.ay((int)var2.ay_fld);
			int var4 = kj.ay((int)var2.ar_fld);
			var1 = new kj((int)var2.as_fld, var3, var4);
		}

		if (kj.en(var1, 469243276)) {
			var1.ag_fld = var1.ag_fld - bw.dk_fld.ay_fld;
			var1.az_fld = var1.az_fld - bw.dk_fld.as_fld;
		}

		return var1;
	}

	@ObfuscatedName("yz")
	@ObfuscatedSignature(
		descriptor = "(Lxz;)Lvw;"
	)
	public static vw yz(xz var0) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ae_fld = 0;
		return xz.aa(var0);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int az() {
		return 0;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	@Override
	public int ak(byte var1) {
		return 0;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	@Override
	public int ag(byte var1) {
		return this.ak_fld;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int ae() {
		return this.ak_fld;
	}

	ls(mj var1, String var2, int var3) {
		super(var1, var2);
		this.this$0 = var1;
		this.ak_fld = var3;
	}

	@ObfuscatedName("fj")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/lang/String;Ljava/lang/String;I)V"
	)
	static void fj(int var0, int var1, int var2, int var3, String var4, String var5, int var6) throws EOFException {
		lu var7 = cf.cg_fld.ag(var0, var1, -702126174);
		if (var7 != null) {
			if (var6 >= 1585550388) {
				return;
			}

			if (var7.fk_fld != null) {
				yz var8 = tu.ak(var7).av((Object[])var7.fk_fld, 1632096669).ax(1552430063);
				va.ak(var8);
			}
		}

		client.nn_fld = var3;
		client.nk_fld = true;
		av.nj_fld = var0;
		client.ny_fld = var1;
		ms.ne_fld = var2;
		client.om_fld = var4;
		client.oh_fld = var5;
	}
}
